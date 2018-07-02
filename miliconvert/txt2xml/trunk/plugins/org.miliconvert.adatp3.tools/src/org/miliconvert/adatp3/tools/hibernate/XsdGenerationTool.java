package org.miliconvert.adatp3.tools.hibernate;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.criterion.Order;
import org.miliconvert.adatp3.common.baseline.BaselineHibernateUtil;
import org.miliconvert.adatp3.common.utils.DOMUtils;
import org.miliconvert.adatp3.common.utils.SetsUtils;
import org.miliconvert.adatp3.hibernate.BaselineClsetord;
import org.miliconvert.adatp3.hibernate.BaselineConstants;
import org.miliconvert.adatp3.hibernate.BaselineFfirnbasic;
import org.miliconvert.adatp3.hibernate.BaselineFfirnchain;
import org.miliconvert.adatp3.hibernate.BaselineFudbasic;
import org.miliconvert.adatp3.hibernate.BaselineMsgbasic;
import org.miliconvert.adatp3.hibernate.BaselineMsgsetord;
import org.miliconvert.adatp3.hibernate.BaselineSetbasic;
import org.miliconvert.adatp3.hibernate.BaselineSetfield;
import org.miliconvert.adatp3.hibernate.BaselineSetfldord;
import org.miliconvert.adatp3.hibernate.HibernateUtil;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


/**
 * 
 * @author matthieu
 *
 */
public class XsdGenerationTool {

	private static Log logger = LogFactory.getLog(XsdGenerationTool.class);
	
	Document schemaMessage = null;
	Document schemaSets = null;
	Document schemaFields = null;
	Document schemacomposites = null;
	private Element messageRoot;
	private Element setsRoot;
	private Element fieldsRoot;
	private Element compositeRoot;
	private Stack<Element> segments  =new Stack<Element>();
	private Map<String,String> sets = new HashMap<String,String>();
	private Map<String,String> fieldsMap = new HashMap<String,String>();
	
	
	
	private BaselineMsgbasic message;
	
	
	
	private void addFieldDef(BaselineFudbasic fudbasicTmp, BaselineFfirnbasic ffirnTmp){
		
		String fname = SetsUtils.getXmlElementName(fudbasicTmp.getFudname());
		
		if(fieldsMap.containsKey(SetsUtils.getSetExtensionName(fname)+"."+ffirnTmp.getFfirn()+"."+fudbasicTmp.getFudn())){
			 return ;	
			}
		fieldsMap.put(SetsUtils.getSetExtensionName(fname)+"."+ffirnTmp.getFfirn()+"."+fudbasicTmp.getFudn(), SetsUtils.getSetExtensionName(fname)+"."+ffirnTmp.getFfirn()+"."+fudbasicTmp.getFudn());
		
	
		Element cp = DOMUtils.createElement(fieldsRoot, "xsd:simpleType");
		cp.setAttribute("name", SetsUtils.getSetExtensionName(fname)+"."+ffirnTmp.getFfirn()+"."+fudbasicTmp.getFudn());
		Element rest = DOMUtils.createElement(cp,"xsd:restriction");
		rest.setAttribute("base", "xsd:string");
		Element pat = DOMUtils.createElement(rest, "xsd:pattern");
		pat.setAttribute("value", BaselineHibernateUtil.getFFirnRegexp(fudbasicTmp, ffirnTmp).replace("\\p{Space}", " "));
		
	}
	
	


	
	private void addSetDef(BaselineSetbasic setBasic){
	
			if(sets.containsKey(setBasic.getSetid())){
			 return ;	
			}
			sets.put(setBasic.getSetid(), setBasic.getSettitle());
		
		    Element setEl =   DOMUtils.createElement(setsRoot, "xsd:complexType");
			setEl.setAttribute("name",SetsUtils.getSetExtensionName(SetsUtils.getXmlElementName(setBasic.getSettitle())));
			Element cplxCt = DOMUtils.createElement(setEl, "xsd:complexContent");
			Element extension = DOMUtils.createElement(cplxCt, "xsd:extension");
			extension.setAttribute("base", "set.base.type");
			Element seq = DOMUtils.createElement(extension,"xsd:sequence");
		  
			
		    BaselineSetfldord crit = new BaselineSetfldord();
		    crit.setContext(setBasic.getKey());
		    List<BaselineSetfldord> fields  = HibernateUtil.findByExample(crit);
		    
		    Element group = null;
		    for(BaselineSetfldord field : fields){
		    
		    	if( group==null && BaselineHibernateUtil.isInRepeatGroup(field)){
		    		Element groupEL = DOMUtils.createElement(seq, "xsd:element");
		    		groupEL.setAttribute("name","group_of_fields");
		    		groupEL.setAttribute("minOccurs", "0");
		    		groupEL.setAttribute("maxOccurs", "unbounded");
		    		Element groupcpl = DOMUtils.createElement(groupEL, "xsd:complexType");
		    		group = DOMUtils.createElement(groupcpl, "xsd:sequence");

				}  
				
				if(group!=null && !BaselineHibernateUtil.isRepeteable(field.getFieldrep())){
					group =null;
				}
		    	
		    	createSetField(field,setBasic,group!=null?group:seq); 
				
		    }
		    
		    Element setId = DOMUtils.createElement(extension,"xsd:attribute");
			setId.setAttribute("fixed", setBasic.getSetid().toLowerCase());
			setId.setAttribute("name", "set-id");
			setId.setAttribute("type", "xsd:string");
		    
		  
		    
			
	}
	


	
	

	private void createSetField(BaselineSetfldord field,BaselineSetbasic setBasic, Element seq) {
		
    	//<xsd:element name="exercise_nickname" minOccurs="1" maxOccurs="1" nillable="true">
    	BaselineSetfield crit2 = new BaselineSetfield();
	  	crit2.setContext(field.getKey());
    	List<BaselineSetfield> alternatives = HibernateUtil.findByExample(crit2); 
    	
    	Element fieldEl = DOMUtils.createElement(seq,  "xsd:element");
    	
    	
    	if(BaselineHibernateUtil.isMandatory(field.getFieldcond())){
    		fieldEl.setAttribute("minOccurs", "1" );	
    	} else {
	  		fieldEl.setAttribute("minOccurs", "0" );
	  	}
    	fieldEl.setAttribute("nillable", "true");
	  	if(BaselineHibernateUtil.isRepeteable(field.getFieldrep())  ){
	  		fieldEl.setAttribute("maxOccurs", "unbounded" );
	  	} else {
	  		fieldEl.setAttribute("maxOccurs", "1" );
	  	}
    
  
    	 Element cpl = DOMUtils.createElement(fieldEl, "xsd:complexType");
    	 Element parent = null;
    	 
    	String name = BaselineHibernateUtil.getElementNameForField(field);
    	if(name!=null){
    	
    		 
    		  parent = DOMUtils.createElement(cpl, "xsd:choice");
    		  fieldEl.setAttribute("name",  name);
    	}
		for (BaselineSetfield alternative : alternatives) {

			BaselineFudbasic fudbasic = (BaselineFudbasic) HibernateUtil.currentSession().get(BaselineFudbasic.class, alternative.getFudn());
			BaselineFfirnbasic ffirn = (BaselineFfirnbasic) HibernateUtil.currentSession().get(BaselineFfirnbasic.class, fudbasic.getContext());
			
			String fName = BaselineHibernateUtil.getElementAlternativeForField(field,alternative,null);
				
				if(name!=null){
				
					Element altEl = DOMUtils.createElement(parent, "xsd:element"); 
					altEl.setAttribute("name", BaselineHibernateUtil.getElementAlternativeForField(field, alternative,setBasic.getKey()));
					altEl.setAttribute("nillable", "true");
					cpl = DOMUtils.createElement(altEl, "xsd:complexType");
		
				} else {	
					fieldEl.setAttribute("name", BaselineHibernateUtil.getElementAlternativeForField(field,alternative,setBasic.getKey()));
				}
					
					//On test si ffirn est composite;

				BaselineFfirnchain crit3 = new BaselineFfirnchain();
				crit3.setContext(ffirn.getKey());
					
				List<BaselineFfirnchain> chains = HibernateUtil.findByExample(crit3);
					
					Collections.sort(chains, new Comparator<BaselineFfirnchain>(){
						@Override
						public int compare(BaselineFfirnchain o1, BaselineFfirnchain o2) {
							return (new Integer(o1.getFfordno())).compareTo(new Integer(o2.getFfordno()));
						}
						
					});
					
					String attr = null;
					Element parentExt = null;
					if(chains!=null && chains.size()>0 ){
					
						parentExt = DOMUtils.createElement(cpl, "xsd:complexContent");
						attr = "c:"+SetsUtils.getSetExtensionName(fName)+"."+ffirn.getFfirn()+"."+fudbasic.getFudn();

						if(!fieldsMap.containsKey(SetsUtils.getSetExtensionName(fName)+"."+ffirn.getFfirn()+"."+fudbasic.getFudn())){
						
							fieldsMap.put(SetsUtils.getSetExtensionName(fName)+"."+ffirn.getFfirn()+"."+fudbasic.getFudn(), SetsUtils.getSetExtensionName(fName)+"."+ffirn.getFfirn()+"."+fudbasic.getFudn());
							
							
							Element ct = DOMUtils.createElement(compositeRoot,"xsd:complexType");
							ct.setAttribute("name",SetsUtils.getSetExtensionName(fName)+"."+ffirn.getFfirn()+"."+fudbasic.getFudn() );
							Element comSeq = DOMUtils.createElement(ct, "xsd:sequence");
							Map<String,Integer> compnames = new HashMap<String, Integer>(); 
							for(BaselineFfirnchain chain : chains){
								BaselineFudbasic fudbasicTmp = (BaselineFudbasic) HibernateUtil.currentSession().get(BaselineFudbasic.class, chain.getFudnref());
								BaselineFfirnbasic ffirnTmp = (BaselineFfirnbasic) HibernateUtil.currentSession().get(BaselineFfirnbasic.class, fudbasicTmp.getContext());
								Element comfield = DOMUtils.createElement(comSeq, "xsd:element");
								String compname = SetsUtils.getXmlElementName(fudbasicTmp.getFudname());
								int count = 0;
								if(compnames.containsKey(compname)){
									count = compnames.get(compname)+1;
									compnames.put(compname, count);
									compname+="_"+count;
								} else {
									compnames.put(compname, count);
								}
								
								
								
								comfield.setAttribute("name", compname);
								/*<xsd:complexType>
								<xsd:simpleContent>
									<xsd:extension base="*/
								Element comCT = DOMUtils.createElement(comfield, "xsd:complexType");
								Element comst = DOMUtils.createElement(comCT, "xsd:simpleContent");
								Element comext = DOMUtils.createElement(comst, "xsd:extension");
								
								comext.setAttribute("base", "f:"+
										SetsUtils.getSetExtensionName(SetsUtils.getXmlElementName(fudbasicTmp.getFudname()))+"."+ffirnTmp.getFfirn()+"."+fudbasicTmp.getFudn());
								Element a = DOMUtils.createElement(comext,"xsd:attribute");
								a.setAttribute("name","ffirn-fudn");
								a.setAttribute("fixed",ffirnTmp.getFfirn()+"-"+fudbasicTmp.getFudn());
								a.setAttribute("type","xsd:string");
								addFieldDef(fudbasicTmp,ffirnTmp);
							}
						
						}
					} else {
						parentExt = DOMUtils.createElement(cpl, "xsd:simpleContent");
						attr = "f:"+SetsUtils.getSetExtensionName(fName)+"."+ffirn.getFfirn()+"."+fudbasic.getFudn();
						addFieldDef(fudbasic,ffirn);
						
					}
					
					Element ext =DOMUtils.createElement(parentExt, "xsd:extension");
					
					
					ext.setAttribute("base", attr);
					
					
					Element a = DOMUtils.createElement(ext,"xsd:attribute");
					a.setAttribute("name","ffirn-fudn");
					a.setAttribute("fixed",ffirn.getFfirn()+"-"+fudbasic.getFudn());
					a.setAttribute("type","xsd:string");
					
					Element fieldAttr = DOMUtils.createElement(ext, "xsd:attribute");
				    fieldAttr.setAttribute("fixed", field.getFldordno().intValue()+"");
				    fieldAttr.setAttribute("name", "ff-seq");
				    fieldAttr.setAttribute("type", "xsd:unsignedShort");
					
				    Element headerAttr = DOMUtils.createElement(ext, "xsd:attribute");
				    headerAttr.setAttribute("name", "header");
				    headerAttr.setAttribute("use","optional");
				    
				    Element descAttr = DOMUtils.createElement(ext, "xsd:attribute");
				    descAttr.setAttribute("name", "descriptor");
				    descAttr.setAttribute("use","optional");
				    
				    Element altAttr = DOMUtils.createElement(ext, "xsd:attribute");
				    altAttr.setAttribute("name", "alt");
				    altAttr.setAttribute("use","optional");
				
			}
	    	
		
	}





	public void generate(String setId, String baseline, String path) {
		logger.debug("Starting schema generation for "+setId) ;

		HibernateUtil.init(baseline);
		HibernateUtil.begin();
		try {
			schemaMessage = DOMUtils.createDoc("http://www.w3.org/2001/XMLSchema",
					"xsd:schema");
			messageRoot = schemaMessage.getDocumentElement();
			schemaSets = DOMUtils.createDoc("http://www.w3.org/2001/XMLSchema",
			"xsd:schema");
			setsRoot = schemaSets.getDocumentElement();
			schemaFields = DOMUtils.createDoc("http://www.w3.org/2001/XMLSchema",
			"xsd:schema");
			fieldsRoot = schemaFields.getDocumentElement();
			schemacomposites = DOMUtils.createDoc("http://www.w3.org/2001/XMLSchema",
			"xsd:schema");
			compositeRoot = schemacomposites.getDocumentElement();
			

			message = new BaselineMsgbasic(); 
			message.setMsgid(setId);
			message = 	(BaselineMsgbasic) HibernateUtil.findByExample(message).get(0);
		
			createSchema(baseline);

			File dest = new File(path+"/"+setId.toLowerCase());
			if(!dest.exists()){
				dest.mkdirs();
			}
			
			DOMUtils.serialise(schemaMessage, new FileOutputStream(dest.getPath()+"/messages.xsd"),true);
			DOMUtils.serialise(schemaSets, new FileOutputStream(dest.getPath()+"/sets.xsd"),true);
			DOMUtils.serialise(schemaFields, new FileOutputStream(dest.getPath()+"/fields.xsd"),true);
			DOMUtils.serialise(schemacomposites, new FileOutputStream(dest.getPath()+"/composites.xsd"),true);
			//DOMUtils.logDom(schemaMessage);
			//DOMUtils.logDom(schemaFields);
			//DOMUtils.logDom(schemaSets);
			//DOMUtils.logDom(schemacomposites);
			
		} catch (Exception e) {
			logger.error("Error generating schema for "+setId, e);
		} finally {
			HibernateUtil.closeSession();
		}
		
		
	}



	private void createSchema(String baseline) throws Exception {
		messageRoot.setAttribute("version", getBaselineVersion(baseline));
		messageRoot.setAttribute("elementFormDefault", "unqualified");
		messageRoot.setAttribute("attributeFormDefault", "unqualified");
		messageRoot.setAttribute("xmlns","nato:adatp-3:"+getBaselineVersion(baseline));
		messageRoot.setAttribute("xmlns:xsd","http://www.w3.org/2001/XMLSchema");
		messageRoot.setAttribute("xmlns:s","nato:adatp-3:"+getBaselineVersion(baseline)+":sets");
		
		Element importEl  = DOMUtils.createElement(messageRoot, "xsd:import");
		importEl.setAttribute("namespace", "nato:adatp-3:"+getBaselineVersion(baseline)+":sets");
		importEl.setAttribute("schemaLocation", "sets.xsd");
	
		
		Element mtfRoot  =   DOMUtils.createElement(messageRoot, "xsd:element");
		mtfRoot.setAttribute("name",SetsUtils.getXmlElementName(message.getMsgname()));
		
	
			
		Element ct = messageRoot.getOwnerDocument().createElement("xsd:complexType");
		mtfRoot.appendChild(ct);
		
	
	    Element seq = messageRoot.getOwnerDocument().createElement("xsd:sequence");
	    ct.appendChild(seq);
		segments.add(seq);
		
		
		setsRoot.setAttribute("version", getBaselineVersion(baseline));
		setsRoot.setAttribute("elementFormDefault", "unqualified");
		setsRoot.setAttribute("attributeFormDefault", "unqualified");
		setsRoot.setAttribute("xmlns","nato:adatp-3:"+getBaselineVersion(baseline)+":sets");
		setsRoot.setAttribute("targetNamespace","nato:adatp-3:"+getBaselineVersion(baseline)+":sets");
		setsRoot.setAttribute("xmlns:xsd","http://www.w3.org/2001/XMLSchema");
		setsRoot.setAttribute("xmlns:c","nato:adatp-3:"+getBaselineVersion(baseline)+":composites");
		setsRoot.setAttribute("xmlns:f","nato:adatp-3:"+getBaselineVersion(baseline)+":elementals");
		
		Element impField = DOMUtils.createElement(setsRoot, "xsd:import");
		impField.setAttribute("namespace", "nato:adatp-3:"+getBaselineVersion(baseline)+":elementals");
		impField.setAttribute("schemaLocation", "fields.xsd");
			 
		
		Element impComp = DOMUtils.createElement(setsRoot, "xsd:import");
		impComp.setAttribute("namespace", "nato:adatp-3:"+getBaselineVersion(baseline)+":composites");
		impComp.setAttribute("schemaLocation", "composites.xsd");
		
		 Element ct2 = DOMUtils.createElement(setsRoot, "xsd:complexType"); 
		 ct2.setAttribute("name", "set.base.type");
		 Element seq2 = DOMUtils.createElement(ct2, "xsd:sequence");
		 

		 /*<xsd:complexType name="set.base.type">
		    <xsd:sequence>
		      <xsd:element name="amplification" type="amplification" minOccurs="0" maxOccurs="1"/>
		      <xsd:element name="narrative" type="narrative" minOccurs="0" maxOccurs="1"/>
		    </xsd:sequence>
		  </xsd:complexType>*/
		
		 
		 Element amplification = DOMUtils.createElement(seq2, "xsd:element");
		 amplification.setAttribute("name", "amplification");
		 amplification.setAttribute("type", "amplification");
		 amplification.setAttribute("minOccurs", "0");
		 amplification.setAttribute("maxOccurs", "1");
		 
		Element narr = DOMUtils.createElement(seq2, "xsd:element");
		narr.setAttribute("name", "narrative");
		narr.setAttribute("type", "narrative");
		narr.setAttribute("minOccurs", "0");
		narr.setAttribute("maxOccurs", "1");
			
		
	

		fieldsRoot.setAttribute("version", getBaselineVersion(baseline));
		fieldsRoot.setAttribute("elementFormDefault", "qualified");
		fieldsRoot.setAttribute("attributeFormDefault", "unqualified");
		fieldsRoot.setAttribute("xmlns","nato:adatp-3:"+getBaselineVersion(baseline)+":elementals");
		fieldsRoot.setAttribute("targetNamespace","nato:adatp-3:"+getBaselineVersion(baseline)+":elementals");
		fieldsRoot.setAttribute("xmlns:xsd","http://www.w3.org/2001/XMLSchema");
		

		impField = DOMUtils.createElement(fieldsRoot, "xsd:import");
		impField.setAttribute("namespace", "http://www.w3.org/XML/1998/namespace");
		impField.setAttribute("schemaLocation", "http://www.w3.org/2001/xml.xsd");
		
		
		compositeRoot.setAttribute("version", getBaselineVersion(baseline));
		compositeRoot.setAttribute("elementFormDefault", "unqualified");
		compositeRoot.setAttribute("attributeFormDefault", "unqualified");
		compositeRoot.setAttribute("xmlns","nato:adatp-3:"+getBaselineVersion(baseline)+":composites");
		compositeRoot.setAttribute("targetNamespace","nato:adatp-3:"+getBaselineVersion(baseline)+":composites");
		compositeRoot.setAttribute("xmlns:xsd","http://www.w3.org/2001/XMLSchema");
		compositeRoot.setAttribute("xmlns:f","nato:adatp-3:"+getBaselineVersion(baseline)+":elementals");
		
		impField = DOMUtils.createElement(compositeRoot, "xsd:import");
		impField.setAttribute("namespace", "nato:adatp-3:"+getBaselineVersion(baseline)+":elementals");
		impField.setAttribute("schemaLocation", "fields.xsd");
			 
		
		
		visit();

		
		Element remarks = DOMUtils.createElement(seq, "xsd:element");
		remarks.setAttribute("name", "remarks");
		remarks.setAttribute("type", "s:remarks");
		remarks.setAttribute("minOccurs", "0");
		remarks.setAttribute("maxOccurs", "1");
		
		Element attr = DOMUtils.createElement(ct, "xsd:attribute");
		attr.setAttribute("name", "mtfid");
		attr.setAttribute("type", "xsd:string");
		attr.setAttribute("fixed", message.getMsgid().toUpperCase());

		
	}

	private String getBaselineVersion(String baseline) {
		if(BaselineConstants.BL12.equals(baseline)){
			return "bl12";
		}
		return "bl11";
	}


	private void visit( ) {
		
		BaselineMsgsetord criteria = new BaselineMsgsetord();
		
		criteria.setContext(message.getKey());
		BaselineClsetord critHeader = new BaselineClsetord();
		critHeader.setContext(BaselineHibernateUtil.getMessageClass(message).getKey());


		
		
		
		
		List<BaselineClsetord> headerSets =  HibernateUtil.findByExampleAndSort(critHeader, Order.asc("setordno"));
		
		
		for(BaselineClsetord set : headerSets){
			BaselineSetbasic setBasic = (BaselineSetbasic) HibernateUtil.currentSession().get(BaselineSetbasic.class, set.getSetref());
			Element parent = segments.peek();
		
			String name = BaselineHibernateUtil.getElementNameForSet(set);
				
			createSetNode(parent, set.getSetordno().intValue(),set.getSetcond(),set.getSetrep(), setBasic ,name);

		}
	

		List<BaselineMsgsetord> sets = HibernateUtil.findByExampleAndSort(criteria, Order.asc("setordno"));
	
		
		for(BaselineMsgsetord set : sets){
			BaselineSetbasic setBasic = (BaselineSetbasic) HibernateUtil.currentSession().get(BaselineSetbasic.class, set.getSetref());
		

				
				int depth = segments.size() - 1;
				
				
				int segDepth =  BaselineHibernateUtil.getSegmentDepth(set);
				
				
				int tmp = segDepth;
				if (BaselineHibernateUtil.isSegmentStarter(set)) {
					tmp = segDepth-1;
				} 
				
				while (depth > tmp) {
					segments.pop();
					depth = segments.size() - 1;
				}
		
					
			Element parent = segments.peek();
			
			String name = BaselineHibernateUtil.getElementNameForSet(set);
			
			if(BaselineHibernateUtil.isSegmentStarter(set)){
				logger.debug("Starting segment : "+setBasic.getSetid());
				 parent = createSegmentNode(parent, set, setBasic ,name);
				segments.add(parent);
			}
			
			createSetNode(parent, set.getSetordno().intValue(),set.getSetcond(),set.getSetrep(), setBasic ,name);

		}
		
	
		BaselineSetbasic amp = new BaselineSetbasic();
		amp.setSetid("AMPN");
		amp = HibernateUtil.findByExample(amp).get(0);
		
		addSetDef(amp);
		
		BaselineSetbasic narr = new BaselineSetbasic();
		narr.setSetid("NARR");
		narr = HibernateUtil.findByExample(narr).get(0);
		
		addSetDef(narr);
		
		BaselineSetbasic rmks = new BaselineSetbasic();
		rmks.setSetid("RMKS");
		rmks = HibernateUtil.findByExample(rmks).get(0);
		
		addSetDef(rmks);
		
	}
	

	
	
	private void createSetNode(Element parent,int setSeq, String cond, String rep,
			BaselineSetbasic setBasic, String name) {

		
		Document d = parent.getOwnerDocument();
		Element setEl =   DOMUtils.createElement(parent, "xsd:element");
			setEl.setAttribute("name",name);
			
			
		  	if(BaselineHibernateUtil.isMandatory(cond)){
		  		setEl.setAttribute("minOccurs", "1" );
		  	} else {
		  		setEl.setAttribute("minOccurs", "0" );
		  	}
		  	//Traite les cas des sets en colonnes
		  	setEl.setAttribute("maxOccurs", "unbounded" );
		
		  
		  	Element ct = DOMUtils.createElement(setEl,"xsd:complexType");


		  	 //<xsd:complexContent>
             //<xsd:extension base="s:operation.codeword">
		  	
			Element cplxCt = DOMUtils.createElement(ct,"xsd:complexContent");
			Element extension = DOMUtils.createElement(cplxCt,"xsd:extension");
			extension.setAttribute("base", "s:"+SetsUtils.getSetExtensionName(SetsUtils.getXmlElementName(setBasic.getSettitle())));
		

			Element a = d.createElement("xsd:attribute");
			a.setAttribute("fixed", setSeq+"");
			a.setAttribute("name", "set-seq");
			a.setAttribute("type", "xsd:unsignedShort");
			
			
			extension.appendChild(a);
			addSetDef(setBasic);
		
	}



	private Element createSegmentNode(Element parent,BaselineMsgsetord set, BaselineSetbasic setBasic, String name) {
		
		Document d = parent.getOwnerDocument();
		Element segEl =   DOMUtils.createElement(parent, "xsd:element");
			segEl.setAttribute("name",name+"_segment");
			
			
		  	if(BaselineHibernateUtil.isSegMandatory(set)){
		  		segEl.setAttribute("minOccurs", "1" );
		  	} else {
		  		segEl.setAttribute("minOccurs", "0" );
		  	}
		  	segEl.setAttribute("maxOccurs", "unbounded" );
		  	
		  	
		  	Element ct = d.createElement("xsd:complexType");
		  	segEl.appendChild(ct);

		  	Element seq = d.createElement("xsd:sequence");
		    ct.appendChild(seq);
		  	return seq;
	}


	
}
