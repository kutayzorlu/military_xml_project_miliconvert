package org.miliconvert.adatp3.tools.impl.bl13;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

import org.miliconvert.adatp3.common.utils.SetsUtils;
import org.miliconvert.adatp3.tools.ICSVFieldMapper;

public class CSVBL13FieldMapper implements ICSVFieldMapper {
	
	
	private Map<String, Integer> fieldMapping = new HashMap<String, Integer>();
	
	
	 {
		fieldMapping.put(ICSVFieldMapper.F_SEG, new Integer(0));
		fieldMapping.put(ICSVFieldMapper.F_RPT, new Integer(2));
		fieldMapping.put(ICSVFieldMapper.F_SETID, new Integer(4));
		fieldMapping.put(ICSVFieldMapper.F_SEQ, new Integer(5));
		fieldMapping.put(ICSVFieldMapper.F_FIELD_OCC, new Integer(3));
		fieldMapping.put(ICSVFieldMapper.F_NAME, new Integer(6));
		fieldMapping.put(ICSVFieldMapper.F_OCC, new Integer(3));
		
		
		fieldMapping.put(ICSVFieldMapper.FF_SEQ, new Integer(0));
		fieldMapping.put(ICSVFieldMapper.FLD_DESIGNATOR, new Integer(5));
		fieldMapping.put(ICSVFieldMapper.CLASSNAME, new Integer(4));
		fieldMapping.put(ICSVFieldMapper.FLD_NAME, new Integer(5));
		fieldMapping.put(ICSVFieldMapper.FLD_DESC, new Integer(6));
		fieldMapping.put(ICSVFieldMapper.FFIRN_FUDN, new Integer(7));
		fieldMapping.put(ICSVFieldMapper.STRUCTURE, new Integer(8));
		fieldMapping.put(ICSVFieldMapper.FLD_CARD, new Integer(9));
	}
	

	
	@Override
	public int getCSVIndex(String key) {
		return fieldMapping.get(key);
	}




	@Override
	public Boolean isStarter(String prev, String line) {
		if(prev==null){
			return false; 
		}

		String prevSeg = SetsUtils.safeSplit(prev, ';')[getCSVIndex(ICSVFieldMapper.F_SEG)].trim();
		String curSeg = SetsUtils.safeSplit(line, ';')[getCSVIndex(ICSVFieldMapper.F_SEG)].trim();

		int ret = Math.max(prevSeg.length() - Math.max(curSeg.length(),1),0);
		
		return (prevSeg.contains("Seg") && curSeg.contains("1")) 
			|| (!prevSeg.contains("Seg") &&
					(curSeg.length() > prevSeg.length()
					  || 
					  ret >0 && curSeg.length()>0 && !prevSeg.substring(0,prevSeg.length()-ret).equals(curSeg)
					  || curSeg.length()>0 && prevSeg.length() == curSeg.length() && !prevSeg.equals(curSeg)
						));
	}

	@Override
	public int shouldFlush(String prev, String line) {
		if(prev==null){
			return 0; 
		}
		String prevSeg = SetsUtils.safeSplit(prev, ';')[getCSVIndex(ICSVFieldMapper.F_SEG)].replace(".", "").trim();
		
		if(prevSeg.contains("Seg")){
			return 0;
		}
		
		String curSeg = SetsUtils.safeSplit(line, ';')[getCSVIndex(ICSVFieldMapper.F_SEG)].replace(".", "").trim();
		
		int ret = Math.max(prevSeg.length() - Math.max(curSeg.length(),1),0);
		
		if(ret >0 && curSeg.length()>0 && !prevSeg.substring(0,prevSeg.length()-ret).equals(curSeg)) {
			ret++;
		}
		
		if( curSeg.length()>0 && prevSeg.length() == curSeg.length() && !prevSeg.equals(curSeg)){
			ret++;
		}
		
		return ret;
	}


	@Override
	public String getFfirn(String[] fields) {
		return fields[getCSVIndex(ICSVFieldMapper.FFIRN_FUDN)];
	
	}




	public Integer computeDepth(String[] items) {
		if(items[getCSVIndex(ICSVFieldMapper.F_SEG)].contains("Seg")){
			return 0;
		}
		return Math.max(items[getCSVIndex(ICSVFieldMapper.F_SEG)].replace(".", "").trim().length()-1,0);
	}




	@Override
	public int getFieldIdx(int i) {
		return i;
	}




	@Override
	public boolean isBl13() {
		return true;
	}




	@Override
	public int getDepth(String prev, String line) {
		if(prev==null){
			return 0; 
		}
		String prevSeg = SetsUtils.safeSplit(prev, ';')[getCSVIndex(ICSVFieldMapper.F_SEG)].replace(" ", "").replace(".", "");
		String curSeg = SetsUtils.safeSplit(line, ';')[getCSVIndex(ICSVFieldMapper.F_SEG)].replace(" ", "").replace(".", "");
		
		int ret = Math.max(prevSeg.length() - Math.max(curSeg.length(),1),0);
		
		return ret;
	}




	@Override
	public Pattern getSetPattern() {
		return Pattern.compile("^(\\* )?[0-9].*");
	}

}
