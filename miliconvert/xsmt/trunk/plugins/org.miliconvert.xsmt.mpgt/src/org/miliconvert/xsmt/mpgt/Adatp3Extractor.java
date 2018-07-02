package org.miliconvert.xsmt.mpgt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.miliconvert.xsmt.mpgt.model.Adatp3Field;
import org.miliconvert.xsmt.mpgt.model.Adatp3FieldGroup;
import org.miliconvert.xsmt.mpgt.model.Adatp3Message;
import org.miliconvert.xsmt.mpgt.model.Adatp3Segment;
import org.miliconvert.xsmt.mpgt.model.Adatp3Set;
import org.miliconvert.xsmt.utils.DOMUtils;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


/**
 * 
 * @author matthieu
 *
 */
public class Adatp3Extractor {

	private static Log logger = LogFactory.getLog(Adatp3Extractor.class);
	
	public Adatp3Message parseAd3Message(Node node, String type){
		
		Adatp3Message adatp3Message = new Adatp3Message(type);
		
		logger.debug("On parse le message :"+type);
		
		NodeList nl = node.getChildNodes();
		for (int i = 0; i < nl.getLength(); i++) {
			String name = nl.item(i).getNodeName();
			if(name.equalsIgnoreCase("#Text")){
				continue;
			}
			Element el = (Element)nl.item(i);
			if(name.endsWith("_segment")){
				adatp3Message.add(parseSegment(el));
				
			} else if(el.getAttribute("set-seq")!=null && el.getAttribute("set-seq").trim().length()>0  ){
				adatp3Message.add(parseSet(el));
				
			} 
		}
		return adatp3Message;
	}
	
	private Adatp3Segment parseSegment(Element element){
		Adatp3Segment adatp3Seg = new Adatp3Segment();
		adatp3Seg.setName(element.getNodeName());
		
		logger.debug("Ajout du segment :"+adatp3Seg.getName());
		
		NodeList nl = element.getChildNodes();
		for (int i = 0; i < nl.getLength(); i++) {
			String name = nl.item(i).getNodeName();
			if(name.equalsIgnoreCase("#Text")){
				continue;
			}
			Element el = (Element)nl.item(i);
			if(name.endsWith("_segment")){
				adatp3Seg.add(parseSegment(el));
				
			} else if(el.getAttribute("set-seq")!=null && el.getAttribute("set-seq").trim().length()>0  ){
				adatp3Seg.add(parseSet(el));
				
			} 
		}
		return adatp3Seg;
	}
	
	
	private Adatp3Set parseSet(Element element){
		Adatp3Set set = new Adatp3Set();
		set.setSetId(element.getAttribute("set-id").toUpperCase());
		set.setSetPos(Integer.parseInt(element.getAttribute("set-seq")));
		set.setSetSeq(Integer.parseInt(element.getAttribute("set-seq")));
		set.setSetName(element.getNodeName());
		logger.debug("Ajout du set :"+set.getSetName());
		
		for (int j = 0; j < element.getChildNodes().getLength(); j++) {
			Element el = (Element)element.getChildNodes().item(j);
			String tmp = el.getNodeName();
			
			if(tmp.equalsIgnoreCase("#Text")){
				continue;
			}
			 if(tmp.equals("group_of_fields")){
				set.add(parseFieldGroup(el));
			} else {
				set.add(parseField(el));
			}
		}
		return set;
	}
	
	
	private Adatp3FieldGroup parseFieldGroup(Element element){
		Adatp3FieldGroup adatp3FieldGroup = new Adatp3FieldGroup();
		logger.debug("Ajout d'un groupe de champ ");
		for (int j = 0; j < element.getChildNodes().getLength(); j++) {
			Element el = (Element)element.getChildNodes().item(j);
			String tmp = el.getNodeName();
			
			if(tmp.equalsIgnoreCase("#Text")){
				continue;
			}
			
			adatp3FieldGroup.add(parseField(el));
			
		}
		return adatp3FieldGroup;
	}
	
	
	private Adatp3Field parseField(Element element){
		
		if(element.getAttribute("ff-seq")!=null  && element.getAttribute("ff-seq").trim().length()>0  ){
			String ffirnfudn = formatFFirn(element.getAttribute("ffirn-fudn"));
			String ffpos = element.getAttribute("ff-seq");
			String alt = element.getAttribute("alt");
			
			
			Adatp3Field field = new Adatp3Field(ffirnfudn,ffpos,element.getNodeName(),alt);
			logger.debug("Ajout d'un field "+field.getName());
			
			StringBuffer buffer = new StringBuffer();
			NodeList nl = element.getChildNodes();
			if(nl.getLength()>1){
				for (int i = 0; i < nl.getLength(); i++) {
					String name = nl.item(i).getNodeName();
					if(name.equalsIgnoreCase("#Text")){
						continue;
					}
					if(((Element)nl.item(i)).getAttribute("ffirn-fudn")!=null){
						String tffirn = formatFFirn(((Element)nl.item(i)).getAttribute("ffirn-fudn"));
						String fieldValue = DOMUtils.getElementText((Element)nl.item(i));
						field.addSubField(tffirn, fieldValue);
						buffer.append(fieldValue);
					}
	
				}
			} else {
				String value = DOMUtils.getElementText(element);
				if(value!=null){
					field.addSubField(field.getFfirn(), value);
					buffer.append(value);
				} 
			}
			
			field.setValue(buffer.toString().trim());
			logger.debug("Value "+field.getValue());
			return field;
		} else {
			NodeList nl = element.getChildNodes();
			for (int i = 0; i < nl.getLength(); i++) {
				String name = nl.item(i).getNodeName();
				if(name.equalsIgnoreCase("#Text")){
					continue;
				}
				return parseField((Element) nl.item(i));

			}
					
		}
		return null;
	}
	
	private String formatFFirn(String ffirn) {
		ffirn= ffirn.replaceAll("-", "_");
		if(ffirn.contains("_")){	
			String[] tmp = SetsUtils.safeSplit(ffirn, '_');
			ffirn = tmp[0]+"_";
				for (int i = 0; i < 3-tmp[1].length(); i++) {
					ffirn+="0";
				}
				ffirn+=tmp[1];

			}
		return ffirn;
	}
}
