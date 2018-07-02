package org.miliconvert.adatp3.xml.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.miliconvert.adatp3.IAdapt3Flavour;
import org.miliconvert.adatp3.common.InvalideAd3Exception;
import org.miliconvert.adatp3.common.baseline.BaselineHibernateUtil;
import org.miliconvert.adatp3.common.formlets.Field;
import org.miliconvert.adatp3.common.formlets.Set;
import org.miliconvert.adatp3.common.utils.DOMUtils;
import org.miliconvert.adatp3.common.utils.SetsUtils;
import org.miliconvert.adatp3.hibernate.BaselineClsetord;
import org.miliconvert.adatp3.hibernate.BaselineFfirnbasic;
import org.miliconvert.adatp3.hibernate.BaselineFudbasic;
import org.miliconvert.adatp3.hibernate.BaselineMsgbasic;
import org.miliconvert.adatp3.hibernate.BaselineMsgsetord;
import org.miliconvert.adatp3.hibernate.BaselineSetfield;
import org.miliconvert.adatp3.hibernate.BaselineSetfldord;
import org.miliconvert.adatp3.hibernate.HibernateUtil;
import org.miliconvert.adatp3.xml.ISetMapping;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


/**
 * 
 * @author matthieu
 *
 */
public class HibernateSetMapping implements ISetMapping{


	
	private BaselineMsgbasic message;
	private static Log logger = LogFactory.getLog(HibernateSetMapping.class);
	private IAdapt3Flavour flavour;
	Map<Integer,String> fieldsName = null;
	

	public HibernateSetMapping(IAdapt3Flavour flavour) {
		this.flavour = flavour;
		message = new BaselineMsgbasic();
		message.setMsgid(flavour.getShortName().toUpperCase());
		message = 	(BaselineMsgbasic) HibernateUtil.findByExample(message).get(0);
	}
	
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
	}
	
	
	@Override
	public void createRoot(Document doc) {
		Element root = doc.createElement(getRootUnqualifiedName());
		root.setAttribute("xmlns:xsi",
				"http://www.w3.org/2001/XMLSchema-instance");
		root.setAttribute("xsi:noNamespaceSchemaLocation", "../xsd/"+flavour.getShortName().toLowerCase()+"/messages.xsd");
		doc.appendChild(root);
		
	}

	
	
	private String getRootUnqualifiedName() {
		return SetsUtils.getXmlElementName(message.getMsgname());
	}



	@Override
	public int mapSet(Stack<Element> parents, Set set, int lastSeqUsed) {

		String id = set.getIdentifier().toLowerCase();

		if (id.equals("narr")) {
			return processNarration(parents, set, lastSeqUsed);
		}
		if (id.equals("ampn")) {
			return processAmplification(parents, set, lastSeqUsed);
		}
		if (id.equals("rmks")) {
			return processRemarks(parents, set, lastSeqUsed);
		}

		
		Element rootNode = parents.peek();
		
		
		BaselineClsetord headerSet = BaselineHibernateUtil.findHeaderSetDef(message, set, lastSeqUsed);
		
		String name = null;
		int setSeq = 0;
		BaselineMsgsetord setDef = null;
		
		if(headerSet==null){
			
			int depth = parents.size() - 1;
			
		
		   setDef = BaselineHibernateUtil.findSetDef(message, set, lastSeqUsed,depth);
			

			
			int segDepth =  BaselineHibernateUtil.getSegmentDepth(setDef);
			name =  BaselineHibernateUtil.getElementNameForSet(setDef);
			
			boolean isSegStarter = BaselineHibernateUtil.isSegmentStarter(setDef,(depth-segDepth)>=-1);
			
			int tmp = segDepth;
			if (isSegStarter) {
				tmp = segDepth-1;
			} 
			
			while (depth > tmp) {
				parents.pop();
				depth = parents.size() - 1;
			}
			rootNode = parents.peek();
			
	
			if (isSegStarter) {
				
				String fqName =  BaselineHibernateUtil.getSegmentNameForSet(setDef) + "_segment";
	
				Element element = rootNode.getOwnerDocument().createElement(fqName);
				rootNode.appendChild(element);
				parents.add(element);
				rootNode = parents.peek();
			}
			
			setSeq = setDef.getSetordno().intValue();
			
		} else {
			setSeq = headerSet.getSetordno().intValue();
			name =  BaselineHibernateUtil.getElementNameForSet(headerSet);
		}
		
		logger.debug(setSeq+" - "+set.getIdentifier());
		
		if (name != null) {
			
			//Cas des sets en colonnes 
			for (Field[] fields : set.getFields()) {

				String fqName =  name;
				
		
				Element element = rootNode.getOwnerDocument().createElement(
						fqName);
				element.setAttribute("set-seq", ""+setSeq);
				element.setAttribute("set-id", id);

				rootNode.appendChild(element);

				addChildren(element, fields, set ,headerSet, setDef);
				
				
			}

			return setSeq;

		} else {
			System.out.println("No mapping defined for set '" + id + "', skipped.");
			return 0;
		}
	}
	

	//Dernier set du document
	private int processRemarks(Stack<Element> parents, Set set, int lastSeqUsed) {
		Element lastSet = (Element) parents.peek().getOwnerDocument()
				.getDocumentElement();
		
		Element rmks = lastSet.getOwnerDocument().createElement("remarks");
		Element freeText = DOMUtils.createElement( rmks, "free_text");
		freeText.setAttribute("ffirn-fudn","1006-1");
		freeText.setAttribute("ff-seq","1");
		freeText.setTextContent(set.getFields().get(0)[0].getValue());
		rmks.setAttribute("set-id", set.getIdentifier().toLowerCase());
		
		lastSet.appendChild(rmks);
		return lastSeqUsed;
	}

	
	//Attaché au set
	private int processNarration(Stack<Element> parents, Set set,
			int lastSeqUsed) {
		Element lastSet = (Element) parents.peek().getLastChild();
		Element narr = lastSet.getOwnerDocument().createElement("narrative");
		Element freeText = DOMUtils.createElement(narr, "free_text");
		freeText.setAttribute("ffirn-fudn","1006-1");
		freeText.setAttribute("ff-seq","1");
		freeText.setTextContent(set.getFields().get(0)[0].getValue());
		narr.setAttribute("set-id", set.getIdentifier().toLowerCase());
		if(!"amplification".equals(lastSet.getFirstChild().getNodeName())){
			lastSet.insertBefore(narr, lastSet.getFirstChild());
		}else {
			lastSet.insertBefore(narr, lastSet.getFirstChild().getNextSibling());
		}
		
		
		return lastSeqUsed;
	}

	
	//Attaché au set
	private int processAmplification(Stack<Element> parents, Set set,
			int lastSeqUsed) {
		Element lastSet = (Element) parents.peek().getLastChild();
		Element ampn = lastSet.getOwnerDocument().createElement("amplification");
		Element freeText = DOMUtils.createElement(ampn, "free_text");
		freeText.setAttribute("ffirn-fudn","1006-1");
		freeText.setAttribute("ff-seq","1");
		freeText.setTextContent(set.getFields().get(0)[0].getValue());
		ampn.setAttribute("set-id", set.getIdentifier().toLowerCase());
		lastSet.insertBefore(ampn, lastSet.getFirstChild());
		return lastSeqUsed;
	}

	

	
	private void addChildren(Element element, Field[] fields,Set set,BaselineClsetord headerSet, BaselineMsgsetord setDef) {
		
		Double setRef ;
		if(headerSet!=null){
			setRef = headerSet.getSetref();
		} else {
			setRef = setDef.getSetref();
		}
		
		int lastPos = 0;
		Element group = null;
		for (int i = 0; i < fields.length; i++) {
			Object[] ret= BaselineHibernateUtil.findFieldDefAndAlternative(set.getIdentifier(),i,lastPos,headerSet,setDef,fields[i]);
			BaselineSetfield alternative  = (BaselineSetfield) ret[1];
			BaselineSetfldord fieldDef = (BaselineSetfldord) ret[0];
			if(!("-".equals(fields[i].getValue().trim()) || fields[i].getValue().trim().length()<1  )
					|| BaselineHibernateUtil.isMandatoryField(fieldDef)
					|| BaselineHibernateUtil.isConditional(fieldDef)){
				String colHeader = (set.getColumnHeaders()!=null && set.getColumnHeaders().length>(i+1))?set.getColumnHeaders()[i+1].getName():null; 
				try {
					if( (group==null || lastPos>fieldDef.getFldordno().intValue() ) && BaselineHibernateUtil.isInRepeatGroup(fieldDef)){
						group = DOMUtils.createElement(element, "group_of_fields");
					}  
					
					if(group!=null && !BaselineHibernateUtil.isRepeteable(fieldDef.getFieldrep()) ){
						group =null;
					}
					
					createFieldData( group!=null?group:element, fields[i],fieldDef, colHeader,alternative,setRef);
				
				} catch (DOMException e) {
				throw new InvalideAd3Exception(BaselineHibernateUtil.getElementNameForField(fieldDef,alternative,setRef)+" is not a valid xml name.");
				}
			} 
			lastPos = fieldDef.getFldordno().intValue();
		}
		
		
		
		/*Ajoute les champs obligatoires a la fin et non spécifié */
	    List<String> endingFields = BaselineHibernateUtil.getEndingFields(setRef,lastPos);
	    for(String endingField: endingFields){
	    	String[] splitted = endingField.split(":");
	    	Element e = DOMUtils.createElement(element,splitted[0]);
	    	if(splitted.length>4){
	    		e = DOMUtils.createElement(e,  splitted[4]);
	    	}
	    	
	    	e.setAttribute("xsi:nil", "true");
	    	e.setAttribute("ffirn-fudn", endingField.split(":")[1] );
	    	if(!"".equals(splitted[2]) && !"null".equals(splitted[2])){
	    		e.setAttribute("header", splitted[2]);
	    	}
	    	e.setAttribute("ff-seq", splitted[3]);
	    	
	    }
		
		
	}

	
	protected Element createFieldData( Element parent, Field field, BaselineSetfldord fieldDef, String header, BaselineSetfield alternative, Double setRef) {
		Element ret = null;
		Element e = null;
		String name = BaselineHibernateUtil.getElementNameForField(fieldDef);
		if(name!=null){
			ret = DOMUtils.createElement(parent, name);
			e = DOMUtils.createElement(ret,  BaselineHibernateUtil.getElementAlternativeForField(fieldDef,alternative,setRef));
		} else {
			e = DOMUtils.createElement(parent, BaselineHibernateUtil.getElementAlternativeForField(fieldDef,alternative,setRef));
		}
		
		
		
		if("-".equals(field.getValue().trim()) || field.getValue().trim().length()<1   ){
			
			e.setAttribute("xsi:nil", "true");
			e.setAttribute("ffirn-fudn", BaselineHibernateUtil.getFfirnFudn(alternative) );
			
		} else {
			List<BaselineFfirnbasic> ffirns = new ArrayList<BaselineFfirnbasic>	();
			List<BaselineFudbasic> fudns = new ArrayList<BaselineFudbasic>	();
			Pattern p = BaselineHibernateUtil.buildNameFieldAndPattern(alternative,ffirns,fudns);
			Matcher m = p.matcher(field.getValue());
			e.setAttribute("ffirn-fudn", ffirns.get(0).getFfirn()+"-"+fudns.get(0).getFudn());
			if(m.matches()){
				if(Math.min(m.groupCount(),ffirns.size())==1){
					e.setTextContent(m.group( 1));
				} else {
					Map<String,Integer> compnames = new HashMap<String, Integer>(); 
					for (int i = 0; i <Math.min(m.groupCount(),ffirns.size()); i++) {
						String compname = SetsUtils.getXmlElementName( fudns.get(i+1).getFudname());
						int count = 0;
						if(compnames.containsKey(compname)){
							count = compnames.get(compname)+1;
							compnames.put(compname, count);
							compname+="_"+count;
						} else {
							compnames.put(compname, count);
						}
						Element nc = e.getOwnerDocument().createElement(compname);
						e.appendChild(nc);
						nc.setTextContent(m.group(i + 1));
						nc.setAttribute("ffirn-fudn", ffirns.get(i+1).getFfirn()+"-"+fudns.get(i+1).getFudn());
					}
				}
			} else {
				throw new IllegalStateException("No field matching");
			}
		
		}
		if(field.getDescriptor()!=null){
			e.setAttribute("descriptor", field.getDescriptor());
		}
		if(header!=null){
			e.setAttribute("header", header);
	    }
		e.setAttribute("ff-seq",""+fieldDef.getFldordno().intValue());
		e.setAttribute("alt",alternative.getAltfldcont() );

		return e;
	}


}
