package org.miliconvert.adatp3.tools.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.miliconvert.adatp3.common.utils.SetsUtils;
import org.miliconvert.adatp3.common.utils.StringUtils;
import org.miliconvert.adatp3.tools.ICSVFieldMapper;
import org.miliconvert.adatp3.tools.IGenerator;
import org.miliconvert.adatp3.tools.IOpenable;
import org.miliconvert.adatp3.tools.impl.bl11.CSVBL11FieldMapper;
import org.miliconvert.adatp3.tools.impl.bl12.CSVBL12FieldMapper;

public class MappingGeneratorImpl  implements IGenerator {

	private IOpenable openable;
	private Log logger = LogFactory.getLog(getClass());
	private String namespaceUri;
	private String nsPrefix;
	private String rootNode;
	private File fieldMappings;
	private Set<String> setIds;
	private File fieldDefinitions;
	private Map<String, String> ffirnMappings;
	private ICSVFieldMapper csvFieldMapper;
	private String outputDir;
	


	public MappingGeneratorImpl(String namespaceUri, String nsPrefix,
			String rootNode, IOpenable openable, File fieldMappings,
			File fieldDefinitions, ICSVFieldMapper csvFieldMapper, String outputDir) {
		this.namespaceUri = namespaceUri;
		this.nsPrefix = nsPrefix;
		this.rootNode = rootNode;
		this.openable = openable;
		this.fieldMappings = fieldMappings;
		this.setIds = new HashSet<String>();
		this.ffirnMappings = new HashMap<String, String>();
		this.fieldDefinitions = fieldDefinitions;
		this.csvFieldMapper = csvFieldMapper;
		this.outputDir = outputDir;
	}

	public void generate() throws Exception {
		InputStream in = openable.open();
		logger.info("Opening file : "+openable.getFileName());
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));

		StringBuffer out = new StringBuffer();

		out.append("namespace.uri=" + namespaceUri);
		out.append("\n");
		out.append("namespace.xmlns=" + nsPrefix);
		out.append("\n");
		out.append("document.rootnode=" + rootNode);
		out.append("\n");
		out.append("\n");

		String line = null;
		String prev = null;
		int i = 0;
		String prevSetId = null;
		String prevSetSeq = null;
		int flush = 0;

		Map<String, List<Integer>> seqsById = new HashMap<String, List<Integer>>();
		Map<String, List<String>> setTrans = new HashMap<String, List<String>>();
		Map<String, List<Integer>> depthById = new HashMap<String, List<Integer>>();
		Map<String, List<Boolean>> setStarter = new HashMap<String, List<Boolean>>();
		Map<String, List<Boolean>> setRepeat = new HashMap<String, List<Boolean>>();
		List<Integer> mandatorySets = new ArrayList<Integer>();
		Stack<String> currentSet = new Stack<String>();
		currentSet.push("ADATP3");
		while ((line = reader.readLine()) != null) {

			if (i++ == 0) {
				continue;
			}
			
			
			String[] items = SetsUtils.safeSplit(line, ';');
	
			
			flush+= csvFieldMapper.shouldFlush(prev,line);
			
		

			if (items[csvFieldMapper.getCSVIndex(ICSVFieldMapper.F_SEQ)] == null 
					|| items[csvFieldMapper.getCSVIndex(ICSVFieldMapper.F_SEQ)].trim().length() == 0
					|| items[csvFieldMapper.getCSVIndex(ICSVFieldMapper.F_SEQ)].equals("null")) {
				continue;
			}

			for (int j = 0; j < flush; j++) {
				currentSet.pop();
			}
			
			if (flush > 0) {
				out.append("mapping.flush." + prevSetId + "." + prevSetSeq
						+ "=" + flush + "\n");
				flush = 0;
			}

			logger.debug("line with " + items.length + " items. ");

			logger.debug("SEG " + items[csvFieldMapper.getCSVIndex(ICSVFieldMapper.F_SEG)] + ", " + "RPT " + items[csvFieldMapper.getCSVIndex(ICSVFieldMapper.F_RPT)]
					+ ",   SETID "
					+ items[csvFieldMapper.getCSVIndex(ICSVFieldMapper.F_SETID)] + ", " + "SEQ " + items[csvFieldMapper.getCSVIndex(ICSVFieldMapper.F_SEQ)] + ", "
					+ "FIELD_OCC " + items[csvFieldMapper.getCSVIndex(ICSVFieldMapper.F_FIELD_OCC)] + ", " + "NAME "
					+ items[csvFieldMapper.getCSVIndex(ICSVFieldMapper.F_NAME)]);

			String setId = items[csvFieldMapper.getCSVIndex(ICSVFieldMapper.F_SETID)].toLowerCase();

			List<Integer> seqsList = null;
			if (!seqsById.containsKey(setId)) {
				seqsList = new LinkedList<Integer>();
				seqsById.put(setId, seqsList);
			} else {
				seqsList = seqsById.get(setId);
			}
		
			List<Boolean> starterList = null;
			if (!setStarter.containsKey(setId)) {
				starterList = new LinkedList<Boolean>();
				
			} else {
				starterList = setStarter.get(setId);
			}
			starterList.add(csvFieldMapper.isStarter(prev,line));
			
			setStarter.put(setId, starterList);
			
			List<Boolean> repeatList = null;
			if (!setRepeat.containsKey(setId)) {
				repeatList = new LinkedList<Boolean>();
				
			} else {
				repeatList = setRepeat.get(setId);
			}
			repeatList.add(items[csvFieldMapper.getCSVIndex(ICSVFieldMapper.F_RPT)].contains("*"));
			
			setRepeat.put(setId, repeatList);

			

			try {
				seqsList.add(Integer.parseInt(items[csvFieldMapper.getCSVIndex(ICSVFieldMapper.F_SEQ)]));
				if(items[csvFieldMapper.getCSVIndex(ICSVFieldMapper.F_OCC)].contains("M")
						&& !items[csvFieldMapper.getCSVIndex(ICSVFieldMapper.F_SEG)].contains("O")
						&& !items[csvFieldMapper.getCSVIndex(ICSVFieldMapper.F_SEG)].contains("C") ){
					  mandatorySets.add(Integer.parseInt(items[csvFieldMapper.getCSVIndex(ICSVFieldMapper.F_SEQ)]));
				}
					
			} catch (NumberFormatException nfe) {
				logger.debug("Number format exception on '" + line + "'");
			}

			List<Integer> depthList = null;
			if (!depthById.containsKey(setId)) {
				depthList = new LinkedList<Integer>();
				depthById.put(setId, depthList);
			} else {
				depthList = depthById.get(setId);
			}


			List<String> trans = null;
			if (!setTrans.containsKey(setId)) {
				trans = new LinkedList<String>();
				setTrans.put(setId, trans);
			} else {
				trans = setTrans.get(setId);
				
				
			}
			
			boolean isStarter =false;
			if(csvFieldMapper.isStarter(prev,line)){
				isStarter =true;
			}
			
			String realName = SetsUtils.getXmlElementName(items[csvFieldMapper.getCSVIndex(ICSVFieldMapper.F_NAME)]);
			int depth = csvFieldMapper.computeDepth(items);
			String name = getUniqueSegDesc(currentSet)+"!SEG!"+realName;
			
			int count = countWithSameNameAndDepth(trans,depthList,name,depth,currentSet,isStarter);
			if(count>0){
				name+="_"+count;
			} 
			trans.add(name);
			
			
			if(isStarter){
				currentSet.push(realName+"_"+count);
			}
			
			
			depthList.add(depth);
			
			

			prevSetId = setId;
			prevSetSeq = items[csvFieldMapper.getCSVIndex(ICSVFieldMapper.F_SEQ)];

			setIds.add(setId);
			
			prev = line;
		}
		in.close();

		
		out.append("\n# MANDATORY SETS\n\n");
		out.append("mandatory.seq=");
		for(int j = 0; j < mandatorySets.size(); j++){
			if (j > 0) {
				out.append(",");
			}
			out.append(mandatorySets.get(j));
		}
		out.append("\n");
		
		out.append("# TRANSLATION MAPPINGS\n");
		for (String setId : setTrans.keySet()) {
			out.append("mapping.setid." + setId + "=");
			List<String> trans = setTrans.get(setId);
			for (int j = 0; j < trans.size(); j++) {
				if (j > 0) {
					out.append(",");
				}
				out.append(trans.get(j).split("!SEG!")[1]);
			}
			out.append("\n");
		}
		out.append("\n");
		out.append("# SEQUENCE MAPPINGS");
		out.append("\n");

		for (String setId : seqsById.keySet()) {
			out.append("mapping.setseq." + setId + "=");
			List<Integer> seqs = seqsById.get(setId);
			for (int j = 0; j < seqs.size(); j++) {
				if (j > 0) {
					out.append(",");
				}
				out.append(seqs.get(j));
			}
			out.append("\n");
		}

		out.append("\n");
		out.append("# DEPTH MAPPINGS");
		out.append("\n");
		for (String setId : depthById.keySet()) {
			out.append("mapping.depth." + setId + "=");
			List<Integer> depth = depthById.get(setId);
			for (int j = 0; j < depth.size(); j++) {
				if (j > 0) {
					out.append(",");
				}
				out.append(depth.get(j));
			}
			out.append("\n");
		}

		for (String setId : setStarter.keySet()) {
			out.append("mapping.setstarter." + setId + "=");
			List<Boolean> starter = setStarter.get(setId);
			for (int j = 0; j < starter.size(); j++) {
				if (j > 0) {
					out.append(",");
				}
				out.append(starter.get(j));
			}
			out.append("\n");
		}
		
		for (String setId : setRepeat.keySet()) {
			out.append("mapping.setrepeat." + setId + "=");
			List<Boolean> repeat = setRepeat.get(setId);
			for (int j = 0; j < repeat.size(); j++) {
				if (j > 0) {
					out.append(",");
				}
				out.append(repeat.get(j));
			}
			out.append("\n");
		}

		
		
		if(!csvFieldMapper.isBl13()){
			out.append("\n");
			processStructuralNotation(out);
			out.append("\n");
		}
		
		out.append("\n");
		out.append("# FIELD MAPPINGS");
		out.append("\n\n");
		
		
		
		processFieldMappings(out);
	
		addMandatorySets(out);
		
		
		File output = new File(outputDir+"/"+nsPrefix+":"+rootNode+".mapping");
		RandomAccessFile raf = new RandomAccessFile(output, "rw");
		raf.write(out.toString().getBytes());
		raf.close();
		logger.info("Wrote mapping to " + output.getAbsolutePath());
	}


	private void processStructuralNotation(StringBuffer out) throws IOException {
		File structuralCsv = new File(openable.getAbsolutePath().replace(openable.getFileName(), "") + "structural.csv");
		if(!structuralCsv.exists()){
			logger.error(openable.getAbsolutePath().replace(openable.getFileName(), "") + "structural.csv");
			return;
		}
		
		
		InputStream in = new FileInputStream(structuralCsv);
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(in));
		Pattern structural = Pattern.compile("\\(([0-9]{1,2}[A-Z]{0,1})\\)(F[0-9]{0,2})(.*)");
		out.append("\n#STRUCTURAL NOTATIONS\n");
		String line = null;
		while ((line = reader.readLine()) != null) {
			String[] values = StringUtils.safeSplit(line, ';');
			Matcher ma = structural.matcher(values[3]);
			if(ma.matches()){
				out.append("mapping.structure." + ma.group(1) + "."+ma.group(2)+"="+ma.group(0)+"\n");
			} 
		}
		in.close();
	}


	private String getUniqueSegDesc(Stack<String> currentSet) {
		String ret="";
		for (Iterator<String> iterator = currentSet.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			ret+=string;
		}
		return ret;
	}

	private int countWithSameNameAndDepth(List<String> trans,
			List<Integer> depthList, String name, int depth, Stack<String> currentSet, boolean isStarter) {	
		int count = 0;
		count=0;
		String computedName = name;
		
		logger.debug(name +" "+currentSet.peek());
		if((name+"_"+count).endsWith(currentSet.peek()) && !isStarter){
				count++;
				computedName=name+"_"+count;
		}
		
		 while (isInList(trans,depthList,depth,computedName)){
			 count++;
			 computedName=name+"_"+count;
		 }
		
		
		
		return count;
	}

	private boolean isInList(List<String> trans, List<Integer> depthList, int depth, String name) {
		for (int i = 0; i < trans.size(); i++) {
			String tmp = trans.get(i);	
			if(tmp.equals(name) && depth==depthList.get(i)){
			  return true;
			}
		}
		return false;
	}

	private void processFieldMappings(StringBuffer out) throws IOException {
		HashSet<String> ffirns = new HashSet<String>();

		for (String setId : setIds) {
			File fieldCsv = new File(fieldMappings.getAbsolutePath() + (csvFieldMapper.isBl13()?"":"/b11") +"/"
					+ setId + ".csv");
			if(!fieldCsv.exists() && !csvFieldMapper.isBl13()){
				fieldCsv = new File(fieldMappings.getAbsolutePath() + (csvFieldMapper.isBl13()?"":"/b12") +"/"
						+ setId + ".csv");
				csvFieldMapper = new CSVBL12FieldMapper();
				logger.warn("USING BL12 FOR: "+setId);
			}
			
			
			if(!fieldCsv.exists()){
				logger.error(fieldMappings.getAbsolutePath() + "/"
					+ setId + ".csv doesn't exits");
				continue;
			}
			
			
			InputStream in = new FileInputStream(fieldCsv);
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(in));

			String line = null;
			int i = 0;
			out.append("mapping.fields." + setId + "=");

			boolean tableSet = false;
			List<String> colHeaders = new LinkedList<String>();
			int fDescIdx = -1;
			Map<String, String> descriptors = new HashMap<String, String>();
			Map<String,Integer> occName = new HashMap<String, Integer>();
			String ffseq = "";
			while ((line = reader.readLine()) != null) {

				if (i == 0 && line.contains("COLUMN HEADER")) {
					tableSet = true;
				}

				if (i == 0) {
					String[] csvHeaders = SetsUtils.safeSplit(line, ';');
					for (int j = 0; j < csvHeaders.length; j++) {
						if (csvHeaders[j].equals("FLD DESC")) {
							fDescIdx = j;
							break;
						}
					}
				}

				boolean prependComma = false;
				if (i > 1) {
					prependComma = true;
				}
				if (i++ == 0) {
					continue;
				}
				String[] fields = SetsUtils.safeSplit(line, ';');
			
				/*if (fields.length < 8) {
					continue;
				}*/

				//logger.info("set Id "+setId+"line with " + fields.length + " items. ");

				boolean alternateFormat = false;
				if (fields[csvFieldMapper.getCSVIndex(ICSVFieldMapper.FF_SEQ)].trim().length() == 0) {
					// current row is an alternative format for the field
					out.append('|');
					prependComma = false;
					alternateFormat = true;
					// continue;
					
				} else {
					ffseq = fields[csvFieldMapper.getCSVIndex(ICSVFieldMapper.FF_SEQ)].trim();
				}
				

				if (prependComma) {
					out.append(",");
				}
				String name = SetsUtils.getXmlElementName(fields[csvFieldMapper.getCSVIndex(ICSVFieldMapper.FLD_DESIGNATOR)].replace(
						"(NU) ", ""));
				
				Integer occCount = 0;
				if(occName.containsKey(name)){
					occCount = occName.get(name)+1;
					name+="_"+occCount;
					occName.put(name, occCount);
				} else {
					occName.put(name, occCount);
				}
				
				
				
				
				
				
				
				
				out.append("("+ffseq+")"+name);

				if (fDescIdx > 0) {
					String desc = fields[fDescIdx].toLowerCase();
					if (desc.trim().length() > 0) {
						if(occCount>0){
							desc+="_"+occCount;
						}
						descriptors.put(desc, name);
					}
				}

				
				ffirns.add(csvFieldMapper.getFfirn(fields).replace("/", "_"));
				ffirnMappings.put(name, csvFieldMapper.getFfirn(fields).replace("/", "_"));
				

				
	
				if (tableSet) {
					if (!alternateFormat) {
						colHeaders.add(fields[csvFieldMapper.getCSVIndex(ICSVFieldMapper.FLD_NAME)]);
					} else {
						String prev = colHeaders.get(colHeaders.size() - 1);
						colHeaders.remove(colHeaders.size() - 1);
						prev = prev + "|" + fields[csvFieldMapper.getCSVIndex(ICSVFieldMapper.FLD_NAME)];
						colHeaders.add(prev);
					}
				}
				
			}
			out.append("\n");

			for (String desc : descriptors.keySet()) {
				out.append("mapping.descriptor." + setId + "." + desc + "=");
				out.append(descriptors.get(desc));
				out.append("\n");
			}

			if (tableSet) {
				out.append("mapping.colheaders." + setId + "=");
				for (int j = 0; j < colHeaders.size(); j++) {
					if (j > 0) {
						out.append(',');
					}
					out.append(colHeaders.get(j).toLowerCase());
				}
				out.append("\n");
			}
			in.close();
			
			if(csvFieldMapper instanceof CSVBL12FieldMapper){
				csvFieldMapper = new CSVBL11FieldMapper();
			}
		}

		out.append("\n#FFIRN MAPPINGS\n");
		for (String fname : ffirnMappings.keySet()) {
			out.append("mapping.ffirn." + fname + "="
					+ ffirnMappings.get(fname) + "\n");
		}

		out.append("\n#FIELDS DEFINITIONS\n");
		if(fieldDefinitions!=null){
			for (String ffirn : ffirns) {
				try {
					processFieldDefinition(ffirn, out);
				} catch (Exception e) {
				 logger.error(e,e);
				}
			}
		}

	}

	

	private void processFieldDefinition(String ffirn, StringBuffer out)
			throws IOException {
		String fileName = StringUtils.safeSplit(ffirn, '_')[0];
		
		File fieldCsv = new File(fieldDefinitions.getAbsolutePath() +  (csvFieldMapper.isBl13()?"":"/b11") +"/"
				+ fileName + ".csv");
		
		if (!fieldCsv.exists()) {
			logger.debug("No definition for field " + ffirn);
			return;
		}
		InputStream in = new FileInputStream(fieldCsv);
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));

		String l = reader.readLine();
		String[] lengths = SetsUtils.safeSplit(l, ';');

		if(csvFieldMapper.isBl13() && !lengths[0].contains("Structure")){
			in.close();
			return;
		}
		
		l = reader.readLine();
		String[] ffs = SetsUtils.safeSplit(l, ';');

		l = reader.readLine();
		if (l == null) {
			in.close();
			logger.debug("Bad mapping for ffirn " + ffirn);
			return;
		}
		String[] names = SetsUtils.safeSplit(l, ';');

		out.append("mapping.fielddef." + ffirn + "=");

		if (ffs.length > 2 && names.length>0) {
			for (int i = 1; i < names.length; i++) {
				if(names[i].trim().length()>0){
					if (i > 1) {
						out.append(",");
					}
					out.append(SetsUtils.getXmlElementName(names[i]));
					out.append(":");
					int idx = csvFieldMapper.getFieldIdx(i);
					out.append(lengths[idx]);
					out.append(":");
					if(!csvFieldMapper.isBl13()){
						if (lengths.length > idx + 1) {
							out.append(lengths[idx + 1]);
						} else {
							logger.error("Length mismatch for ffirn " + ffirn);
							out.append("A");
						}
					out.append(":");
					out.append(ffs[i].replace("/", "_"));
					} else {
						getBl13FieldDefs(ffs[i],out);
					}
				}
			}
		}

		out.append("\n");
		
		in.close();
	}

	private void getBl13FieldDefs(String ffirnLine, StringBuffer out) {
		try {
			if(ffirnLine!=null && ffirnLine.length()>0){
				String[] ffirn = SetsUtils.safeSplit(ffirnLine, '/');
				int irn = Integer.parseInt(ffirn[0]);
				int i=1;
				if(ffirn.length>1){
					i = Integer.parseInt(ffirn[1]);
				}
				
				File fieldCsv = new File(fieldDefinitions.getAbsolutePath() + "/"
						+ irn + ".csv");
				if (!fieldCsv.exists()) {
					logger.debug("No definition for field " + ffirn);
					out.append("AN");
					return;
				}
				InputStream in = new FileInputStream(fieldCsv);
				BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		
				String l = null;
				while((l = reader.readLine())!=null){
					if(l.trim().startsWith(""+i)){
						String[] fields = StringUtils.safeSplit(l, ';');
						out.append(fields[3]);
						return;
					}
				}
				in.close();
			}	
			
		
		} catch (Exception e) {
			logger.warn(e,e);
		}
		
	}

	private void addMandatorySets(StringBuffer out) {

	}

}
