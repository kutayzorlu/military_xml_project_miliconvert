package org.miliconvert.adatp3;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.miliconvert.adatp3.common.baseline.BaselineHibernateUtil;
import org.miliconvert.adatp3.common.formlets.Field;
import org.miliconvert.adatp3.common.formlets.Set;
import org.miliconvert.adatp3.common.utils.StringUtils;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * 
 * @author matthieu
 *
 */
public class Adatp3HibernateSerialiser extends DefaultHandler {

	
	private List<Set> sets = new LinkedList<Set>();
	private Set currentSet = null;
	private String prevSetId = null;
	private Set currentAmpSet = null;
	private Set  currentNarrSet = null;
	
	private StringBuffer bufferedLine  = new StringBuffer();
	private String  currField = null;
	private String descriptor = null;
	private String header = null;
	private String ffirn = null;
	private String ffSeq = null;
	private boolean freeText = false;
	
	
	
	
	@Override
	public void startElement(String uri, String localName, String name,
			Attributes attributes) throws SAXException {
			if(!name.endsWith("_segment")){
				if(attributes.getValue("set-seq")!=null ){
					createSet(attributes.getValue("set-id"));
				} else if(attributes.getValue("ff-seq")!=null){
					createField(Integer.parseInt(attributes.getValue("ff-seq"))-1);
					currField = name;
					descriptor = attributes.getValue("descriptor");
					header = attributes.getValue("header");
					ffirn  = attributes.getValue("ffirn-fudn");
					ffSeq = attributes.getValue("ff-seq");
					if("free_text".equals(name)){
						freeText = true;
					} else {
						freeText = false;
					}
					
				} else if( name.equals("amplification") 
						|| name.equals("remarks")){
					
					currentAmpSet = new Set(attributes.getValue("set-id").toUpperCase());
					currentAmpSet.addFieldValues(new Field[0]);
					currField = null;
					descriptor = null;
					header = null;
					bufferedLine = new StringBuffer();
				} else if( name.equals("narrative") ){
					currentNarrSet = new Set(attributes.getValue("set-id").toUpperCase());
					currentNarrSet.addFieldValues(new Field[0]);
					currField = null;
					descriptor = null;
					header = null;
					bufferedLine = new StringBuffer();
				} 
				
			} 
			
	}
	
	


	private void createField(int parseInt) {
		if(currentAmpSet ==null && currentNarrSet==null ){
		
			Field[] current = currentSet.getFields().get(currentSet.getFields().size()-1);
			List<Field> temp = new ArrayList<Field>();
	    	temp.addAll(Arrays.asList(current));
		    while(temp.size()<parseInt){
		    	temp.add(new Field(null,"-"));
		    	currentSet.getFields().set(currentSet.getFields().size()-1, (Field[]) temp.toArray(new Field[temp.size()]));
		    }
			
		}
		 bufferedLine = new StringBuffer();
	}

	private void createSet(String name) {
		String setId = name.toUpperCase();
		
		//If we start a new set we are closing the existing one
		if(currentSet!=null && (prevSetId==null || !prevSetId.equals(setId))){
			sets.add(currentSet);
			currentSet = null;
		}
		
		//First append AMP
		if(currentAmpSet!=null){
			sets.add(currentAmpSet);
			currentAmpSet = null;
		}
		
		
		//Then narr
		if(currentNarrSet!=null){
			sets.add(currentNarrSet);
			currentNarrSet = null;
		}
		
		
		if(currentSet==null ||  prevSetId==null || !prevSetId.equals(setId)){
			currentSet = new Set(setId);
			prevSetId = setId;
		}
		
		
		currentSet.addFieldValues(new Field[0]);
		currField = null;
		descriptor = null;
		header = null;
		bufferedLine = new StringBuffer();
		
	}

	@Override
	public void endDocument() throws SAXException {
		if(currentSet!=null){
			sets.add(currentSet);
		} 
		
		if(currentAmpSet!=null){
			sets.add(currentAmpSet);
		} 
		
		if(currentNarrSet!=null){
			sets.add(currentNarrSet);
		}
		
	}
	
	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
			if(freeText){
	 			bufferedLine.append(new String(ch, start, length));
			} else {
				bufferedLine.append(new String(ch, start, length).replace("\n",""));
			}

	}
	
	
	
	@Override
	public void endElement(String uri, String localName, String name)
			throws SAXException {
		if(!name.startsWith("segment_") && currField!=null && name.equals(currField)){
			
	    	if(currentAmpSet!=null && currentAmpSet.getFields().get(0).length<1){
	    		List<Field> temp = new ArrayList<Field>();
	    		Field f = new Field(descriptor, bufferedLine.toString());
	    		f.setFreeText(true);
	    		temp.add(f);
	    		currentAmpSet.getFields().set(currentAmpSet.getFields().size()-1, (Field[]) temp.toArray(new Field[temp.size()]));
	    	} else if(currentNarrSet!=null && currentNarrSet.getFields().get(0).length<1){
	    		List<Field> temp = new ArrayList<Field>();
	    		Field f = new Field(descriptor, bufferedLine.toString());
	    		f.setFreeText(true);
	    		temp.add(f);
	    		currentNarrSet.getFields().set(currentNarrSet.getFields().size()-1, (Field[]) temp.toArray(new Field[temp.size()]));
	    	} else {
	    		Field[] current = currentSet.getFields().get(currentSet.getFields().size()-1);
				List<Field> temp = new ArrayList<Field>();
				temp.addAll(Arrays.asList(current));
				if(bufferedLine.toString().length()<1){
					bufferedLine.append("-");
				}
				
				Field f = new Field(descriptor, bufferedLine.toString());
				f.setLabel(name);
				if(header!=null){
					f.setHeader(header);
				  	BaselineHibernateUtil.trimField(currentSet,f,ffSeq, ffirn.split("-"));
				}

				if(name.equals("free_text")){
					f.setFreeText(true);
				}
				
		    	temp.add(f);
	    		
	    		if(temp.get(0).getHeader()!=null && currentSet.getFields().size()==1){
	    		  /*String[] headers = new String[temp.size()];
	    		  int i=0;
	    		  for(Field fH : temp){
	    			 headers[i]=fH.getHeader();
	    		     i++;
	    		  }*/
	    		  currentSet.setColumnHeaders(BaselineHibernateUtil.getColumnHeaders(currentSet));	
	    		}
	    		
	    		currentSet.getFields().set(currentSet.getFields().size()-1, (Field[]) temp.toArray(new Field[temp.size()]));
	    	}
	    	currField = null;
	    	descriptor = null;
	    	header = null;
		}
		
	}
	
	
	

	public InputStream getAdatp3Stream() {
		
		StringBuffer ret = new StringBuffer();
		
		for(Set set: sets){
			if(isTableSet(set)){
				ret.append(set.getIdentifier()+"\n");				
				int j=0;
				for(Field[] fields: set.getFields()){
					if(j==0){
						for (int i = 0; i < set.getColumnHeaders().length; i++) {
							ret.append("/"+StringUtils.justify(set.getColumnHeaders()[i].getName(),true,
									i<fields.length? getLength(fields[i]):set.getColumnHeaders()[i].getName().length()));
						}
					}
					ret.append("\n");
					for (int i = 0; i < fields.length; i++) {
						ret.append("/"+StringUtils.justify(formatField(fields[i]),"L".equals(fields[i].getJustify()),getLength(fields[i])));
					}
					j++;
				}
				ret.append("//\n");
			} else {
				for(Field[] fields: set.getFields()){
					ret.append(split(set,fields)).append("\n");
				}
			}
		}
		return new ByteArrayInputStream(ret.toString().getBytes());
	}


	private Integer getLength(Field field) {
		int length = field.getSize();
		if(field.getDescriptor()!=null){
			length+=1+field.getDescriptor().length();
		}
		return length;
	}




	private boolean isTableSet(Set set) {
		return 	set.getColumnHeaders()!=null && set.getColumnHeaders().length>0;
	}



	private String split(Set set,Field[] fields) {
		StringBuffer ret = new StringBuffer();
		StringBuffer buffer = new StringBuffer();
		buffer.append(set.getIdentifier());
			for(Field field : fields){
				String value = formatField(field);
				
				if( field.isFreeText() ) {
					// It's a freetext set. Split the first line to 69 characters
					
					if( ( buffer.length() + value.length() ) < 69 ) {
						buffer.append("/");
						buffer.append(value);
						
					} else {
						value = value.replace( '\n', ' ' );
						String[] words = value.split(" ");
						for( int i =0; i < words.length ; i++ ) {
							if( ( buffer.length() + words[i].length() ) <= 68 ) {
								if( i == 0 ) {
									buffer.append("/");
								} else {
									buffer.append(" ");
								}
								buffer.append(words[i]);
							} else {
								ret.append(buffer);
								ret.append("\n");
								buffer = new StringBuffer();
								buffer.append(words[i]);
							}
						}
						
					}
						
					
				} else {
					// It's not a freetext set. Split each line to 69 characters
					if((buffer.length()+value.length())<69){
						buffer.append("/");
						buffer.append(value);
					} else {
					
							ret.append(buffer);
							ret.append("\n");
							buffer = new StringBuffer();
							buffer.append("/");
							while(ret.charAt(ret.length()-2)=='/'){
								ret.deleteCharAt(ret.length()-2);
								buffer.append("/");
							}
							buffer.append(value);
					}
				}
			
				
			}
			
			// Append the end-of-set marker
			if( buffer.length() <= 67 ) {
				buffer.append("//");
			} else {
				buffer.append("\n//");
			}
			ret.append(buffer);
			
			/*
			while(ret.charAt(ret.length()-1)=='/'){
				ret.deleteCharAt(ret.length()-1);
			}*/
		return ret.toString();
	}

	
	private String formatField(Field field) {
		return (field.getDescriptor()!=null?field.getDescriptor()+":":"")+field.getValue();
	}
	
	

}
