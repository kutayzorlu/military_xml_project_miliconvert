package org.miliconvert.xsmt.mpgt;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.miliconvert.xsmt.mpgt.model.mpgt.MPGTFieldDef;
import org.miliconvert.xsmt.mpgt.model.mpgt.MPGTSetDef;

/**
 * 
 * @author matthieu
 *
 */
public class MPGTDefExtractor {

	private static Log logger = LogFactory.getLog(MPGTDefExtractor.class);
	
	private Map<String,List<MPGTSetDef>> setsDefs = new HashMap<String, List<MPGTSetDef>>();
	private MPGTSetDef currSetDef;
	private Map<String,String> headerSeq = new HashMap<String, String>();
	private static MPGTDefExtractor instance = new MPGTDefExtractor();
	private String currentSetId;
	private int setSeq = 0;
	
	
	public void init(String mappingPath, String headerPath){
		InputStream mapping = null;
		InputStream header = null;
		try {
		
			
			mapping =  open(mappingPath);
			
			
			CSVReader csvReader = new CSVReader(new InputStreamReader(
					mapping));
			
		
			try {
				String[] splitted = null;
				while ((splitted = csvReader.readNext())!=null) {
					
					if (splitted.length < 14) {
						logger.debug("rejected mpgt mapping line " + splitted.length
								);
						continue;
					}
					
					if (splitted[IMappingFields.TYPE].contains("SET")) {
						
						if(splitted[IMappingFields.SET_SEQ].trim().length()<1){
							if(!splitted[IMappingFields.SETID].trim().equalsIgnoreCase(currentSetId)){
								currentSetId = splitted[IMappingFields.SETID];
								setSeq++;
							}
						} else {
							setSeq = Integer.parseInt(splitted[IMappingFields.SET_SEQ]);
						}
						
						currSetDef = new MPGTSetDef(splitted[IMappingFields.LINE_DEF],splitted[IMappingFields.MPGT_START],
								splitted[IMappingFields.MPGT_ATTR],splitted[IMappingFields.MPGT_ATTR],splitted[IMappingFields.ACTION_ANALYSE] );
						currSetDef.setSetId(splitted[IMappingFields.SETID]);
						if(setsDefs.containsKey(""+setSeq)){
							setsDefs.get(""+setSeq).add(currSetDef);
						} else {
							List<MPGTSetDef> defs = new ArrayList<MPGTSetDef>();
							defs.add(currSetDef);
							setsDefs.put(""+setSeq,defs);
						}
						
						
						headerSeq.put(splitted[IMappingFields.SETID], ""+setSeq);
					}
					
					
					
					if (splitted[IMappingFields.TYPE].contains("FIELD") || splitted[IMappingFields.TYPE].contains("SS ZONE")  && setsDefs.containsKey(""+setSeq) ) {
						MPGTFieldDef fieldDef = new MPGTFieldDef(splitted[IMappingFields.LINE_DEF],splitted[IMappingFields.MPGT_START],
								splitted[IMappingFields.INST_MPGT],splitted[IMappingFields.MPGT_ATTR],clearZone(splitted[IMappingFields.ZONE]),splitted[IMappingFields.ACTION_ANALYSE]);
						fieldDef.setLabel(SetsUtils
								.getXmlElementName(splitted[IMappingFields.LABEL]));
						if(splitted[IMappingFields.FFIRN].indexOf('/') > 0){
							String ffirn = splitted[IMappingFields.FFIRN].replace("/", "_");
							fieldDef.setFfirn(ffirn);
						}
						fieldDef.setSsZone(splitted[IMappingFields.SUB_ZONE]);
						currSetDef.addField(clearZone(splitted[IMappingFields.ZONE]),fieldDef);
					}
					
				
					
				}
			} catch (Exception e) {
				logger.error(e.getMessage(), e);
			} finally {
				try {
					csvReader.close();
				} catch (IOException e) {
				}
			}
			header =  open(headerPath);
			csvReader = new CSVReader(new InputStreamReader(
					header));
			
			try {
				    String[] splitted = null;
					while ((splitted = csvReader.readNext())!=null) {
					if (splitted.length < 14) {
						logger.debug("rejected mpgt mapping line " + splitted.length);
						continue;
					
					}
					
					if (splitted[IMappingFields.TYPE].contains("FIELD") && headerSeq.containsKey(splitted[IMappingFields.SETID]) ) {
//						logger.info("Adding field with pos:"+splitted[IMappingFields.ZONE] +" " +splitted[IMappingFields.TYPE] +" "+splitted[IMappingFields.SETID]
//						                          +" "+splitted[IMappingFields.MPGT_START]  +" "+splitted[IMappingFields.MPGT_ATTR]);
//						
						MPGTSetDef setDef = setsDefs.get( headerSeq.get(splitted[IMappingFields.SETID])).get(0);
						MPGTFieldDef fieldDef = new MPGTFieldDef(splitted[IMappingFields.MPGT_START],
								"MPIA."+splitted[IMappingFields.INST_MPGT],"MPIA."+splitted[IMappingFields.MPGT_ATTR],splitted[IMappingFields.ZONE],"");
						fieldDef.setLabel(SetsUtils
								.getXmlElementName(splitted[IMappingFields.LABEL]));
						if(splitted[IMappingFields.FFIRN].indexOf('/') > 0){
							String ffirn = splitted[IMappingFields.FFIRN].replace("/", "_");
							fieldDef.setFfirn(ffirn);
						}
						
						setDef.addField(splitted[IMappingFields.ZONE],fieldDef);
					}
				}
			} catch (Exception e) {
				logger.error(e.getMessage(), e);
			} finally {
				try {
					csvReader.close();
				} catch (IOException e) {
				}
			}
			
	

		} finally {
			try {
				if(mapping!=null){
					mapping.close();
				}
			} catch (IOException e) {
				logger.error(e,e);
			}
		
			
		
		}
	}
	
	

	private String clearZone(String zone) {
		return zone.replace(".", "").trim();
	}



	public static InputStream open(String string) {
		return FileBasedGenerator.class.getClassLoader().getResourceAsStream(
				string);
	}



	public static MPGTDefExtractor getInstance() {
		return instance;
	}
	
	
	
	public void dumpRules() {
		StringBuffer setRules = new StringBuffer();
		StringBuffer fieldRules = new StringBuffer();
		
		
		for(Map.Entry<String,List<MPGTSetDef>> sets :  setsDefs.entrySet()){
			int i =0;
			
			for(MPGTSetDef set : sets.getValue()){
				if(set.getRegles().trim().length()>0){
					setRules.append(	
						"rule R_"+set.getSetId()+"_"+sets.getKey()+"_"+i+"\n"
						+"when\n"
					    +"\t\tDans le set  "+set.getSetId()+" avec la position "+sets.getKey()+"\n"
						+"then\n"
						+"\t\t"+set.getRegles()+"\n"
						+"end\n\n");
						
				}
				for(Map.Entry<String,List<MPGTFieldDef>> fields : set.getFields().entrySet()){
					int j = 0;
					for(MPGTFieldDef field : fields.getValue()){
						if(field.getRegles().trim().length()>0){
							fieldRules.append(
									"rule R_"+set.getSetId()+"_"+sets.getKey()+"_"+i+"_"+field.getFfPos()+"_"+j+"\n"
									+"when\n"
								    +"\t\tDans le set  "+set.getSetId()+" avec la position "+sets.getKey()+" alternative "+i+"\n"
								    +"\t\tDans le champ de ffirn "+field.getFfirn()+" avec la position "+field.getFfPos()+" alternative "+j+"\n"
									+"then\n"
									+"\t\t"+field.getRegles()+"\n"
									+"end\n\n");
							
						}
						j++;
					}	
				
				}
			  i++;
			}
		}
		
		try {
		   BufferedWriter out = new BufferedWriter(new FileWriter("/tmp/rules.txt"));
			//BufferedWriter writer = new BufferedWriter();
			
		
		   out.write("/* SET RULES */");
		   out.write(setRules.toString());
		   out.write("/* FIELD RULES */");
		   out.write(fieldRules.toString());
		   out.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}
		/*
		if(splitted[IMappingFields.ACTION_ANALYSE].trim().length()>0){
			if (splitted[IMappingFields.TYPE].contains("SET")) {
				System.out.println("rule gen_rule\nwhen\n\t$s : Adatp3Set(setPos == \""+splitted[IMappingFields.SET_SEQ]+
						"\" &&  setId == \""+splitted[IMappingFields.SETID]+"\")\nthen" +
							"\n\t"+splitted[IMappingFields.ACTION_ANALYSE]+"\nend"); 
			
			
			} else if (splitted[IMappingFields.TYPE].contains("FIELD")){
				String toAdd = "rule gen_rule\nwhen\n\t$s : Adatp3Set(setPos == \""+splitted[IMappingFields.SET_SEQ]+
				"\" &&  setId == \""+splitted[IMappingFields.SETID]+"\")\n\t" +
						"$f : Adatp3Field(ffPos == \""+splitted[IMappingFields.ZONE]+"\" && ffirn=\""+splitted[IMappingFields.FFIRN]+"\" )\nthen" +
								"\n\t"+splitted[IMappingFields.ACTION_ANALYSE]+"\nend"; 
				
				if(frules.containsKey(splitted[IMappingFields.FFIRN])){
					frules.get(splitted[IMappingFields.FFIRN]).add(toAdd);
				} else {
					List<String> tmp = new ArrayList<String>();
					tmp.add(toAdd);
					frules.put(splitted[IMappingFields.FFIRN], tmp);
				}
			}
		}
		*/
	}



	public List<MPGTSetDef> getSetDefs(String key) {
		return setsDefs.get(key);
	}
	

	
}
