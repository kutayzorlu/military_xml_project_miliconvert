package org.miliconvert.xsmt.mpgt;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MPGTDictionaryService {

	private static Log logger = LogFactory.getLog(MPGTDictionaryService.class);
	
	private static MPGTDictionaryService instance = new MPGTDictionaryService();
	
	
	Map<String, List<String[]>> ad3ToMpgt = new HashMap<String, List<String[]>>();
	
	
	public static MPGTDictionaryService getInstance() {
		return instance;
	}
	
	public void init(String dictionnaryPath) {
		
		InputStream mapping = null;
		boolean isAd3ToMpgt = false;
		String currIndex = null;
		
		try {
			mapping =  open(dictionnaryPath);
			
			
			CSVReader csvReader = new CSVReader(new InputStreamReader(
					mapping));
			
		
			try {
				String[] splitted = null;
				while ((splitted = csvReader.readNext())!=null) {
					if(splitted.length>6){
						if("CD".equals(splitted[0]) && splitted[1].trim().length()>0){
							isAd3ToMpgt = "AD3".equals(splitted[2]);
							currIndex = splitted[1].trim();
							List<String[]> list = new ArrayList<String[]>();
							list.add(splitted);
							ad3ToMpgt.put(format(currIndex), list);
							logger.debug("Adding value for "+currIndex);

						} else if(splitted[3].trim().length()>0 ){
							if(isAd3ToMpgt){
							
								logger.debug("Adding : "+splitted[3].trim()+", "+splitted[6].trim()+" for "+currIndex);
								ad3ToMpgt.get(format(currIndex)).add(splitted);
							} 
							
						}
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
		}	finally {
				try {
					if(mapping!=null){
						mapping.close();
					}
					
				} catch (IOException e) {
					logger.error(e,e);
				}
			
				
			}
		
	}
		
	public static InputStream open(String string) {
			return FileBasedGenerator.class.getClassLoader().getResourceAsStream(
					string);
	}

	/*
	public String convertMPGTToAD3(String ffirn, String value) {
		if(mpgtToAd3.containsKey(ffirn)){
			Map<String,String> keys = mpgtToAd3.get(ffirn);
			if(keys.containsKey(value.trim())){
				logger.info("Found dico for "+ value);
				return keys.get(value.trim());
			}
		}
		return value;
	}

	public String convertAD3ToMPGT(String ffirn, String value) {
		if(ad3ToMpgt.containsKey(ffirn)){
			Map<String,String> keys = ad3ToMpgt.get(ffirn);
			if(keys.containsKey(value.trim())){
				return keys.get(value.trim());
			}
		}
		return value;
	}
*/
	public String convertAD3ToMPGTFromRule(String key,String ffirn,String mpgt, String value) {
		if(ad3ToMpgt.containsKey(format(key))&& mpgt!=null){
		
			int ffirnCol=-1;
			int mpgtCol=-1;
			List<String[]> list = ad3ToMpgt.get(format(key));
			int i=0;
			for(String header : list.get(0) ){
				
				if(header.length()>0 && ffirn.equals(formatFFirn(header))){
					ffirnCol= i;
				}
				if(header.length()>0 && mpgt.equals(header.trim())){
					mpgtCol= i;
				}
				i++;
			}
			if(ffirnCol>-1 && mpgtCol>-1){
				for(String[] values : list ){
					if(value.trim().equals(values[ffirnCol].trim())){
						return values[mpgtCol];
					}
					
				}
			}
			logger.warn("Value not found:"+ffirn+ " "+mpgt+" "+value+" "+key);

		
				
		} else {
			logger.warn("Key not found:"+format(key)+" for mpgt "+mpgt+" "+ad3ToMpgt.keySet().toString());
		}
		return null;
	}

	private String formatFFirn(String ffirn) {
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

	private String format(String value){
		 return value.replaceAll(",", "")
		  .replaceAll(";", "")
		  .replaceAll("MPGT_", "")
		  .trim();
	}
	
	
}
