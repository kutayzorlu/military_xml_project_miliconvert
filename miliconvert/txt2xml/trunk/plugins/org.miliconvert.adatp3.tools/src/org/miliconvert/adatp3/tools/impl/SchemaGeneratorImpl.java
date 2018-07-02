package org.miliconvert.adatp3.tools.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.regex.Pattern;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.miliconvert.adatp3.common.utils.DOMUtils;
import org.miliconvert.adatp3.common.utils.SetsUtils;
import org.miliconvert.adatp3.common.utils.StringUtils;
import org.miliconvert.adatp3.tools.ICSVFieldMapper;
import org.miliconvert.adatp3.tools.IGenerator;
import org.miliconvert.adatp3.tools.impl.bl11.CSVBL11FieldMapper;
import org.miliconvert.adatp3.tools.impl.bl12.CSVBL12FieldMapper;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 * Generates v11 adatp3 schemas used csv specifications.
 * 
 * @author tom
 * 
 */
public class SchemaGeneratorImpl implements IGenerator {



	private File csv;
	private File outdir;
	private File setDefs;
	private File fieldsDefs;
	private ICSVFieldMapper csvFieldMapper;
	private Map<Integer,Set<String>> topLevelElements;
	private Element root;

	private Log logger = LogFactory.getLog(getClass());
	private String messageRoot;

	public SchemaGeneratorImpl(File csv, File outputDir, File setDefs,
			File fieldsDefs, String messageRoot,ICSVFieldMapper csvFieldMapper) {
		this.csv = csv;
		this.outdir = outputDir;
		this.setDefs = setDefs;
		this.fieldsDefs = fieldsDefs;
		this.messageRoot = messageRoot;
		this.csvFieldMapper = csvFieldMapper;
		topLevelElements = new HashMap<Integer,Set<String>>();
	}

	public void generate() {
		logger.info("Starting schema generation from " + csv.getName());
		Document schema = null;

		try {
			schema = DOMUtils.createDoc("http://www.w3.org/2001/XMLSchema",
					"xsd:schema");

			String csvContent = loadCsv(csv);
			root = schema.getDocumentElement();
			createSchema(root, csvContent, messageRoot);

			String out = outdir + "/" + messageRoot
					+ ".xsd";
			
			DOMUtils.serialise(schema, new FileOutputStream(out));
			logger.info("Schema generation for " + csv.getName()
					+ " completed. Output file is here "+out);
		} catch (Throwable e) {
			logger.error("Error generating schema for " + csv.getName(), e);
		}
	}

	private Element eWithChildren(Element parent, String name,
			String[] optionalAttrs,Integer depth) {
		Document d = parent.getOwnerDocument();
		Element newE = d.createElement("xsd:element");
		
		String computedName = name;

		if (depth!=null  && topLevelElements.containsKey(depth) && topLevelElements.get(depth).contains(name)) {
			int i = 0;
			boolean test=false;
			do {
				i++;
				if(name.endsWith("_segment")){
					test=topLevelElements.get(depth).contains( name.replaceAll("_segment", "")+ "_" + i+"_segment");
				}
				else{
					test=topLevelElements.get(depth).contains(name + "_" + i);
				}
				
			} while (test);
			if(name.endsWith("_segment")){
				computedName = name.replaceAll("_segment", "")+ "_" + i+"_segment";
			}
			else{
				computedName = name + "_" + i;
			}
		}
		newE.setAttribute("name", computedName);

		if (depth!=null){
				if(topLevelElements.containsKey(depth)) {
					topLevelElements.get(depth).add(computedName);
				} else {
					Set<String> set = new HashSet<String>();
					set.add(computedName);
					topLevelElements.put(depth, set);
				}
		}
		parent.appendChild(newE);

		Element ct = d.createElement("xsd:complexType");
		newE.appendChild(ct);

		Element seq = d.createElement("xsd:sequence");
		ct.appendChild(seq);

		for (String att : optionalAttrs) {
			Element a = d.createElement("xsd:attribute");
			a.setAttribute("use", "optional");
			a.setAttribute("name", att);
			a.setAttribute("type", "xsd:string");
			ct.appendChild(a);
		}
		
		return seq;
	}
	
	
	private Element choiceWithChildren(Element parent) {
		Document d = parent.getOwnerDocument();
		Element newE = d.createElement("xsd:choice");
		parent.appendChild(newE);
		return newE;
	}

	private Element eWithChildren(Element parent, String name, String[] optionalAttrs) {
		return eWithChildren(parent, name, optionalAttrs,null);
	}

	private Element eLeaf(Element parent, String name) {
		Document d = parent.getOwnerDocument();
		Element newE = d.createElement("xsd:element");
		newE.setAttribute("name", name);
		parent.appendChild(newE);

		return newE;
	}

	private void createSchema(Element schemaRoot, String csvContent,
			String messageRoot) throws Exception {
		Stack<Element> currentType = new Stack<Element>();

		// makes xsl engine not happy
		// schemaRoot.setAttribute("targetNamespace", "nato:adatp-3:b11");
		// schemaRoot.setAttribute("xmlns", "nato:adatp-3:b11");

		schemaRoot.setAttribute("version", csvFieldMapper.isBl13()?"13":"11");
		schemaRoot.setAttribute("elementFormDefault", "qualified");
		schemaRoot.setAttribute("attributeFormDefault", "unqualified");

		String[] csvLines = SetsUtils.safeSplit(csvContent, '\n');

		Element adatRoot = eWithChildren(schemaRoot, messageRoot, new String[0]);
		currentType.push(adatRoot);
		root = adatRoot;

		//String prevName = null;
		String prev = null;
		Element generatedSet = null;
		for (int i = 1; i < csvLines.length; i++) {
			String line = csvLines[i];
			if (line.trim().length() == 0) {
				continue;
			}

			String[] splitted = SetsUtils.safeSplit(line, ';');

			if ( csvFieldMapper.shouldFlush(prev, line)>0) {
				for (int j = 0; j <csvFieldMapper.shouldFlush(prev, line); j++) {

					Element el = currentType.pop();
					logger.debug("Popped"
							+((Element)el.getParentNode().getParentNode()).getAttribute("name")+
							"depth is now "+ csvFieldMapper.shouldFlush(prev, line));
				}
				
				
				//prevName = null;
				generatedSet = null;
				if(isSegmentEnd(splitted)){
					continue;
				}
			}
			
			
			
			if (csvFieldMapper.isStarter(prev, line)) {
				String segName = SetsUtils.getXmlElementName(splitted[csvFieldMapper.getCSVIndex(ICSVFieldMapper.F_NAME)]);
				Element e = eWithChildren(currentType.peek(), segName
						+ "_segment",new String[] {},currentType.size());
				
				if(topLevelElements.containsKey(currentType.size()+1)) {
					topLevelElements.put(currentType.size()+1, new HashSet<String>());
				} 				
				currentType.push(e);

				segName = ((Element)e.getParentNode().getParentNode()).getAttribute("name").replace("_segment", "");
				
				Element segIntro = eWithChildren(currentType.peek(), segName,
						new String[] { "set-seq","pos" }, currentType.size());
				addAmplification(segIntro);
				
				applySetSpec(segIntro, splitted[csvFieldMapper.getCSVIndex(ICSVFieldMapper.F_SETID)], splitted[csvFieldMapper.getCSVIndex(ICSVFieldMapper.F_FIELD_OCC)]);

				generatedSet = (Element) segIntro.getParentNode()
						.getParentNode();
			//	prevName = segName;
				applyCardinality(splitted[csvFieldMapper.getCSVIndex(ICSVFieldMapper.F_SETID)], (Element) e.getParentNode()
						.getParentNode(), splitted[csvFieldMapper.getCSVIndex(ICSVFieldMapper.F_OCC)]+splitted[csvFieldMapper.getCSVIndex(ICSVFieldMapper.F_SEG)],"*");
			} else {
				String name = SetsUtils.getXmlElementName(splitted[csvFieldMapper.getCSVIndex(ICSVFieldMapper.F_NAME)]);

				/*if (name.equals(prevName)) {
					String maxOccurs = generatedSet.getAttribute("maxOccurs");
					try {
						int card = Integer.parseInt(maxOccurs);
						card++;
						generatedSet.setAttribute("maxOccurs", "" + card);
					} catch (NumberFormatException nfe) {
						generatedSet.setAttribute("maxOccurs", "2");
					}
				} else {*/
					Element simpleSet = eWithChildren(currentType.peek(), name,
							new String[] { "set-seq","pos" }, currentType.size());
					addAmplification(simpleSet);
					applySetSpec(simpleSet, splitted[csvFieldMapper.getCSVIndex(ICSVFieldMapper.F_SETID)],
							splitted[csvFieldMapper.getCSVIndex(ICSVFieldMapper.F_FIELD_OCC)]);
					generatedSet = (Element) simpleSet.getParentNode()
							.getParentNode();
				//	prevName = name;
					applyCardinality(splitted[csvFieldMapper.getCSVIndex(ICSVFieldMapper.F_SETID)], generatedSet,
							splitted[csvFieldMapper.getCSVIndex(ICSVFieldMapper.F_OCC)]+splitted[csvFieldMapper.getCSVIndex(ICSVFieldMapper.F_SEG)], splitted[csvFieldMapper.getCSVIndex(ICSVFieldMapper.F_RPT)]);
				//}
			}
			prev = line;
		}
		addRemarks(adatRoot);
	}

	private void addRemarks(Element adatRoot) {
		Element ampn = DOMUtils.createElement(adatRoot, "xsd:element");
		ampn.setAttribute("name", "remarks");
		ampn.setAttribute("minOccurs", "0");
		ampn.setAttribute("maxOccurs", "1");
		ampn.setAttribute("type", "xsd:string");
	}

	private void addAmplification(Element simpleSet) {
		Element ampn = DOMUtils.createElement(simpleSet, "xsd:element");
		ampn.setAttribute("name", "amplification");
		ampn.setAttribute("minOccurs", "0");
		ampn.setAttribute("maxOccurs", "1");
		ampn.setAttribute("type", "xsd:string");

		ampn = DOMUtils.createElement(simpleSet, "xsd:element");
		ampn.setAttribute("name", "narrative");
		ampn.setAttribute("minOccurs", "0");
		ampn.setAttribute("maxOccurs", "1");
		ampn.setAttribute("type", "xsd:string");
	}

	private void applyCardinality(String setId, Element generatedSet,
			String occurence, String repeat) {

		if (false && occurence.contains("M") && !occurence.contains("C")) {
			generatedSet.setAttribute("minOccurs", "1");
		} else {
			generatedSet.setAttribute("minOccurs", "0");
		}
		if (repeat.contains("*") || repeat.contains("ü")) {
			generatedSet.setAttribute("maxOccurs", "unbounded");
		} else {
			generatedSet.setAttribute("maxOccurs", "1");
		}
		if (setId != null && setId.length()>0 && Character.isDigit(setId.charAt(0))) {
			generatedSet.setAttribute("maxOccurs", "unbounded");
		}
	}

	private String getFfirn(String[] fields) {
		return csvFieldMapper.getFfirn(fields);
	}

	private void applySetSpec(Element simpleSet, String setId,
			String fieldsCardinality) throws Exception {

			File fieldCsv = new File(setDefs.getAbsolutePath() + (csvFieldMapper.isBl13()?"":"/b11") +"/"
				+ setId.toLowerCase() + ".csv");
		if(!fieldCsv.exists() && !csvFieldMapper.isBl13()){
			fieldCsv = new File(setDefs.getAbsolutePath() + (csvFieldMapper.isBl13()?"":"/b12") +"/"
					+ setId.toLowerCase() + ".csv");
			csvFieldMapper = new CSVBL12FieldMapper();
			logger.warn("USING BL12 FOR: "+setId);
		}
		
		
		if (fieldCsv.exists()) {
			String csvContent = loadCsv(fieldCsv);
			String[] lines = SetsUtils.safeSplit(csvContent, '\n');
			Pattern p = csvFieldMapper.getSetPattern();
			String[] cards = null;
			if(!csvFieldMapper.isBl13()){
				cards = SetsUtils.safeSplit(fieldsCardinality, '/');
			}
			int count = 1;
		//	String prevFieldName = "";
		//	int occCount = 1;
			Element setFieldToUpdate = null;
			for (int i = 1; i < lines.length; i++) {
				String line = lines[i];
				String[] splitted = SetsUtils.safeSplit(line, ';');
				if(splitted.length<=csvFieldMapper.getCSVIndex(ICSVFieldMapper.FLD_DESIGNATOR)){
					continue;
				}
				String name = SetsUtils.getXmlElementName(splitted[csvFieldMapper.getCSVIndex(ICSVFieldMapper.FLD_DESIGNATOR)]);
				if(name.length()<1){
					continue;
				}
				if (!p.matcher(line).matches()) {
				  //Alternatives
					if(setFieldToUpdate!=null){
						int occurenceCount = countElementInModel(name, simpleSet);
						if (occurenceCount > 0) {
							name = name + "_" + occurenceCount;
						}
						Element setField =  eWithChildren(setFieldToUpdate, name,new String[]{"descriptor","ff-pos","header","ffirn"});
						String tmpFfirn = getFfirn(splitted);
						String ffirn = StringUtils.safeSplit(tmpFfirn,'/')[0];
						applyFieldDefinition(setId, setField, ffirn);
						//prevFieldName = name;
					}
					continue;
				}
				
				/*if (name.equals(prevFieldName)) {
					occCount++;
					setFieldToUpdate.setAttribute("minOccurs", "" + occCount);
					setFieldToUpdate.setAttribute("maxOccurs", "" + occCount);
					logger.info("Bumped occurence of " + name + " to "
							+ occCount);
				} else { */
					int occurenceCount = countElementInModel(name, simpleSet);
					if (occurenceCount > 0) {
						name = name + "_" + occurenceCount;
					}
					setFieldToUpdate = choiceWithChildren(simpleSet);
					
					Element setField = eWithChildren(setFieldToUpdate, name,new String[]{"descriptor","ff-pos","header","ffirn"});
					((Element)setField.getParentNode().getParentNode()).setAttribute("nillable", "true");
					/*setFieldToUpdate = (Element) setField.getParentNode()
							.getParentNode();*/
					if(cards == null){
						applyCardinality(null, setFieldToUpdate, splitted[csvFieldMapper.getCSVIndex(ICSVFieldMapper.FLD_CARD)],
								splitted[csvFieldMapper.getCSVIndex(ICSVFieldMapper.FLD_CARD)]);
					} else if (count >= cards.length) {
						logger.debug("name: " + name + " fieldsCard: "
								+ fieldsCardinality + "\nline: " + line);
						applyCardinality(null, setFieldToUpdate, "*O", "*O");
					} else {
						applyCardinality(null, setFieldToUpdate, cards[count],
								cards[count]);
					}
					try {
						String tmpFfirn = getFfirn(splitted);
						String ffirn = StringUtils.safeSplit(tmpFfirn,'/')[0];
						applyFieldDefinition(setId, setField, ffirn);
					} catch (Exception e) {
						logger.error("line"+line);
						
					}
					//prevFieldName = name;
				//}
				count++;
			}
		} else {
			logger.debug("*** NO SET DEFINITION FOR " + setId + " *** "+fieldCsv.getAbsolutePath());
			Element set = (Element) simpleSet.getParentNode().getParentNode();
			set.removeChild(simpleSet.getParentNode());
			set.setAttribute("type", "xsd:string");
		}
		
		if(csvFieldMapper instanceof CSVBL12FieldMapper){
			csvFieldMapper = new CSVBL11FieldMapper();
		}
		
		
	}

	private int countElementInModel(String name, Element simpleSet) {
		int count = 0;
		NodeList nl = simpleSet.getElementsByTagName("xsd:element");
		for (int i = 0; i < nl.getLength(); i++) {
			Element e = (Element) nl.item(i);
			String n = e.getAttribute("name");
			if (n.equals(name) && e.getParentNode().getNodeName().contains("choice")) {
				count++;
			}
		}
		return count;
	}

	private void applyFieldDefinition(String setId, Element setField,
			String ffirn) throws Exception {
		
		
		File fieldCsv = new File(fieldsDefs.getAbsolutePath() +  (csvFieldMapper.isBl13()?"":"/b11") +"/"
				+ ffirn + ".csv");

		if (fieldCsv.exists()) {
			String csvContent = loadCsv(fieldCsv);
			String[] lines = SetsUtils.safeSplit(csvContent, '\n');
			if (lines.length >= 3
					&& (lines[2].startsWith("FIELD USE DESIGNATOR") || lines[2].startsWith("FUD Name"))) {
				String[] fNames = SetsUtils.safeSplit(lines[2], ';');
				for (int i = 1; i < fNames.length; i++) {
					if(fNames[i].trim().length()>0){
						eLeaf(setField, SetsUtils.getXmlElementName(fNames[i]));
					}
				
				}
				return ;
			} 
		} 
		
		
		
			logger.debug("*** NO FIELD DEF FOR FFIRN " + ffirn + " (" + fieldCsv.getAbsolutePath()
					+ ") ***");
			Element set = (Element) setField.getParentNode().getParentNode();
			set.removeChild(setField.getParentNode());
			Document d = set.getOwnerDocument();
			Element ct = d.createElement("xsd:complexType");
			ct.setAttribute("mixed", "true");
			set.appendChild(ct);
			set.setAttribute("nillable", "true");

			for (String att : new String[]{"descriptor","ff-pos","header","ffirn"}) {
				Element a = d.createElement("xsd:attribute");
				a.setAttribute("use", "optional");
				a.setAttribute("name", att);
				a.setAttribute("type", "xsd:string");
				ct.appendChild(a);
			}
		

	}


	private boolean isSegmentEnd(String[] splitted) {
		return "END OF SEGMENT".equals(splitted[csvFieldMapper.getCSVIndex(ICSVFieldMapper.F_NAME)])
				|| splitted[csvFieldMapper.getCSVIndex(ICSVFieldMapper.F_OCC)].trim().length() == 0 ;
	}

	private String loadCsv(File csv) throws Exception {
		RandomAccessFile raf = new RandomAccessFile(csv, "r");
		byte[] content = new byte[(int) csv.length()];
		raf.readFully(content);
		raf.close();
		return new String(content);
	}
}
