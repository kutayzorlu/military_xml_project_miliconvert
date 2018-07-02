package org.miliconvert.otg.service.xml.impl;


import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.miliconvert.otg.model.AbstractMTFElement;
import org.miliconvert.otg.model.MTF;
import org.miliconvert.otg.model.MTFField;
import org.miliconvert.otg.model.MTFFormatDefinition;
import org.miliconvert.otg.model.MTFSegment;
import org.miliconvert.otg.model.MTFSet;
import org.miliconvert.otg.model.MTFSetDefinition;
import org.miliconvert.otg.service.parser.MTFParserException;
import org.miliconvert.otg.service.xml.MTFXmlVisitor;
import org.miliconvert.otg.utils.DOMUtils;
import org.miliconvert.otg.utils.StringUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * 
 * @author matthieu
 *
 */
public class MTFXmlVisitorImpl implements MTFXmlVisitor {

	MTFFormatDefinition mtfFormatDefinition;

	
	public MTFXmlVisitorImpl(MTFFormatDefinition mtfFormatDefinition) {
		super();
		this.mtfFormatDefinition = mtfFormatDefinition;
	}


	@Override
	public Document visit(MTF mtfDocument) throws Exception {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		dbf.setNamespaceAware(true);
		DocumentBuilder builder = dbf.newDocumentBuilder();
		Document doc = builder.newDocument();
		
		
		Element root = createRoot(doc);
		appendsMTFElements(root,mtfDocument.getElements());
		
		return doc;
	}
	
	
	private void appendsMTFElements(Element node,List<AbstractMTFElement> elements) throws MTFParserException {
		for(AbstractMTFElement el : elements){
			if(el instanceof MTFSegment){
				MTFSegment segment = (MTFSegment)el ;
			  	appendsMTFElements(createSegmentNode(node,segment)
			  			, segment.getElements());
			} else if(el instanceof MTFSet) {
				MTFSet set = (MTFSet)el;
			    createSetNode(node,set);
			}
		}
		
	}


	private Element createSetNode(Element parent, MTFSet set) throws MTFParserException {
		MTFSetDefinition mtfSetDefinition = mtfFormatDefinition.getMTFSetFormater(set);
		if(mtfSetDefinition == null){
			throw new MTFParserException("Cannot find definition for set:"+set.getId());
		}
		Element ret = DOMUtils.createElement(parent, StringUtils.formatNCName(mtfSetDefinition.getFormatName()));
		ret.setAttribute("setId", set.getId());
		ret.setAttribute("set-seq", ""+mtfSetDefinition.getSetSequence());
		String[] constraints = mtfSetDefinition.getFieldOrder().split("/");
		int seq = 1;
		for(MTFField field: set.getFields()){
			if( isRequired(constraints,seq) || (field.getValue()!=null && field.getValue().trim().length()>0) ){
				Element fieldEl = DOMUtils.createElementAndText(ret, StringUtils.formatNCName(field.getName()), field.getValue());
				fieldEl.setAttribute("ff-seq", ""+seq);
			}
			seq++;
		}
		return ret;
		
	}



	private boolean isRequired(String[] constraints, int i) {
		String constraint ="";
		if(constraints.length>i){
			constraint = constraints[i];
		}
		return constraint.contains("M");
	}


	private Element createSegmentNode(Element parent, MTFSegment segment) throws MTFParserException {
		MTFSetDefinition mtfSetDefinition = mtfFormatDefinition.getMTFSetFormater(segment.getStartSet());
		if(mtfSetDefinition == null){
			throw new MTFParserException("Cannot find definition for start set:"+segment.getName());
		}
		Element ret = DOMUtils.createElement(parent, StringUtils.formatNCName(mtfSetDefinition.getFormatName()+"_segment"));
		ret.setAttribute("seg-seq", ""+segment.getOrder());
		return createSetNode(ret, segment.getStartSet());
		
	}


	public Element createRoot(Document doc) {
		Element root = doc.createElement(mtfFormatDefinition.getFormatName());
		root.setAttribute("xmlns:xsi",
				"http://www.w3.org/2001/XMLSchema-instance");
		root.setAttribute("xsi:noNamespaceSchemaLocation", mtfFormatDefinition.getXmlNS() + ".xsd");
		doc.appendChild(root);
		return root;
	}
}
