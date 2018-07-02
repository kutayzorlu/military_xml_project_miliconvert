package org.miliconvert.otg.tools;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.miliconvert.otg.MTFFormatInitialiserFactory;
import org.miliconvert.otg.model.AbstractMTFElementDefinition;
import org.miliconvert.otg.model.MTFFieldDefinition;
import org.miliconvert.otg.model.MTFFormatDefinition;
import org.miliconvert.otg.model.MTFSegmentDefinition;
import org.miliconvert.otg.model.MTFSetDefinition;
import org.miliconvert.otg.utils.DOMUtils;
import org.miliconvert.otg.utils.StringUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * @author matthieu
 */
public class SchemaGenerator {

	
	private Element root;
	private MTFFormatDefinition mtfFormatDefinition;

	private Log logger = LogFactory.getLog(getClass());

	public SchemaGenerator(String format) {
		mtfFormatDefinition = MTFFormatInitialiserFactory.getMtfFormatInitialiser().getFormat(format);
	}

	public Document generate() {
		logger.info("Starting schema generation for "+mtfFormatDefinition.getFormatName()) ;
		Document schema = null;

		try {
			schema = DOMUtils.createDoc("http://www.w3.org/2001/XMLSchema",
					"xsd:schema");

			root = schema.getDocumentElement();
			createSchema(root);

		} catch (Exception e) {
			logger.error("Error generating schema for "+mtfFormatDefinition.getFormatName(), e);
		}
		return schema;
		
	}

	private Element eWithChildren(Element parent, String name,
			String[] optionalAttrs, MTFSetDefinition setDef) {
		Document d = parent.getOwnerDocument();
		Element newE = d.createElement("xsd:element");
	
		newE.setAttribute("name", name);
		if(setDef!=null){
			if(setDef.isMandatory()){
				newE.setAttribute("minOccurs", "1" );
		  	} else {
		  		newE.setAttribute("minOccurs", "0" );
		  	}
		  	if(setDef.isRepeteable()){
		  		newE.setAttribute("maxOccurs", "unbounded" );
		  	} else {
		  		newE.setAttribute("maxOccurs", "1" );
		  	}
		}
		parent.appendChild(newE);

		Element ct = d.createElement("xsd:complexType");
		newE.appendChild(ct);

		Element seq = d.createElement("xsd:choice");
		seq.setAttribute("minOccurs", "0" );
		seq.setAttribute("maxOccurs", "unbounded");
		ct.appendChild(seq);

		for (String att : optionalAttrs) {
			Element a = d.createElement("xsd:attribute");
			a.setAttribute("use", "required");
			a.setAttribute("name", att);
			a.setAttribute("type", "xsd:string");
			ct.appendChild(a);
		}

		return seq;
	}



	private void createSchema(Element schemaRoot) throws Exception {
		schemaRoot.setAttribute("version", "11");
		schemaRoot.setAttribute("elementFormDefault", "qualified");
		schemaRoot.setAttribute("attributeFormDefault", "unqualified");

		Element mtfRoot = eWithChildren(schemaRoot,mtfFormatDefinition.getFormatName(),new String[]{},null);

		
		visit(mtfRoot,mtfFormatDefinition.getElementsDefinition());

	}

	private Element visit(Element el, List<AbstractMTFElementDefinition> defs){
		for(AbstractMTFElementDefinition def : defs ){
			if(def instanceof MTFSegmentDefinition){
				MTFSegmentDefinition segmentDefinition = (MTFSegmentDefinition)def;
				visit(createSegmentNode(el,segmentDefinition), segmentDefinition.getElementsDefinition());
			} else {
				MTFSetDefinition mtfSetDefinition = (MTFSetDefinition)def;
				createSetNode(el,mtfSetDefinition);
			}
		}
		return  null;
	}
	

	
	
	private Element createSetNode(Element parent, MTFSetDefinition setDef) {
		MTFSetDefinition mtfSetDefinition = mtfFormatDefinition.getSetDefinition(setDef);
		Document d = parent.getOwnerDocument();
		Element setEl =   DOMUtils.createElement(parent, "xsd:element");
			setEl.setAttribute("name",StringUtils.formatNCName(mtfSetDefinition.getFormatName()));
		  	if(setDef.isMandatory()){
		  		setEl.setAttribute("minOccurs", "1" );
		  	} else {
		  		setEl.setAttribute("minOccurs", "0" );
		  	}
		  	if(setDef.isRepeteable()){
		  		setEl.setAttribute("maxOccurs", "unbounded" );
		  	} else {
		  		setEl.setAttribute("maxOccurs", "1" );
		  	}
		  
		  	Element ct = d.createElement("xsd:complexType");
		  	setEl.appendChild(ct);

			Element seq = d.createElement("xsd:sequence");
			ct.appendChild(seq);
			for (String att : new String[]{"setId","set-seq"}) {
				Element a = d.createElement("xsd:attribute");
				a.setAttribute("use", "required");
				a.setAttribute("name", att);
				a.setAttribute("type", "xsd:string");
				ct.appendChild(a);
			}
		 
		String[] constraints = setDef.getFieldOrder().split("/");
		int i=1;
		Map<String,MTFFieldDefinition> tmp = new HashMap<String, MTFFieldDefinition>();
		for(MTFFieldDefinition fDef : setDef.getFieldDefinitions()){
			if(!tmp.containsKey(StringUtils.formatNCName(fDef.getName()))){
				tmp.put(StringUtils.formatNCName(fDef.getName()), fDef);
				String constraint ="";
				if(constraints.length>i){
					constraint = constraints[i];
				}
				createFieldNode(seq,fDef,constraint);
			}
			i++;
		}
		return seq;
		
	
		
	}
	
	

	private Element createFieldNode(Element parent, MTFFieldDefinition def,String constraint) {
		Document d = parent.getOwnerDocument();
		Element newE = d.createElement("xsd:element");
		newE.setAttribute("name", StringUtils.formatNCName(def.getName()));
		parent.appendChild(newE);
		if(constraint.contains("M")){
			newE.setAttribute("minOccurs", "1" );
	  	} else {
	  		newE.setAttribute("minOccurs", "0" );
	  	}
	  	if(constraint.contains("*")){
	  		newE.setAttribute("maxOccurs", "unbounded" );
	  	} else {
	  		newE.setAttribute("maxOccurs", "1" );
	  	}
		return newE;
		
	}

	private Element createSegmentNode(Element parent, MTFSegmentDefinition segmentDefinition) {
		MTFSetDefinition mtfSetDefinition = mtfFormatDefinition.getSetDefinition(segmentDefinition.getStartSetDefinition());
		Element ret = eWithChildren(parent,StringUtils.formatNCName(mtfSetDefinition.getFormatName()+"_segment"),new String[] { "seg-seq" },segmentDefinition.getStartSetDefinition());
		return createSetNode(ret, segmentDefinition.getStartSetDefinition());	
	}

}
