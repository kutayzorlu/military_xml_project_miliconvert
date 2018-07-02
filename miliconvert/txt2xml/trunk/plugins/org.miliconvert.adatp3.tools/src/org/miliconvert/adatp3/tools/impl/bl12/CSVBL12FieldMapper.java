package org.miliconvert.adatp3.tools.impl.bl12;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

import org.miliconvert.adatp3.common.utils.SetsUtils;
import org.miliconvert.adatp3.tools.ICSVFieldMapper;

public class CSVBL12FieldMapper implements ICSVFieldMapper {

	private Map<String, Integer> fieldMapping = new HashMap<String, Integer>();

	 {
		fieldMapping.put(ICSVFieldMapper.F_SEG, new Integer(1));
		fieldMapping.put(ICSVFieldMapper.F_RPT, new Integer(2));
		fieldMapping.put(ICSVFieldMapper.F_OCC, new Integer(3));
		fieldMapping.put(ICSVFieldMapper.F_SETID, new Integer(4));
		fieldMapping.put(ICSVFieldMapper.F_SEQ, new Integer(5));
		fieldMapping.put(ICSVFieldMapper.F_FIELD_OCC, new Integer(6));
		fieldMapping.put(ICSVFieldMapper.F_NAME, new Integer(7));
	
		fieldMapping.put(ICSVFieldMapper.FF_SEQ, new Integer(0));
		fieldMapping.put(ICSVFieldMapper.FLD_DESIGNATOR, new Integer(1));
		fieldMapping.put(ICSVFieldMapper.FLD_DESC, new Integer(2));
		fieldMapping.put(ICSVFieldMapper.FLD_NAME, new Integer(3));
		fieldMapping.put(ICSVFieldMapper.CLASSNAME, new Integer(4));
		fieldMapping.put(ICSVFieldMapper.FFIRN_FUDN, new Integer(5));
		fieldMapping.put(ICSVFieldMapper.STRUCTURE, new Integer(6));

	}
	

	
	@Override
	public int getCSVIndex(String key) {
		return fieldMapping.get(key);
	}


	@Override
	public Boolean isStarter(String prev, String line) {
		String[] items = SetsUtils.safeSplit(line, ';');	
		return 	items[getCSVIndex(ICSVFieldMapper.F_OCC)].contains("[")  
		&& !items[getCSVIndex(ICSVFieldMapper.F_OCC)].contains("C");
	}
	


	@Override
	public int shouldFlush(String prev, String line) {
		String[] items = SetsUtils.safeSplit(line, ';');
		return items[getCSVIndex(ICSVFieldMapper.F_NAME)].equals("END OF SEGMENT")?1:0;
	}


	@Override
	public String getFfirn(String[] fields) {
			if(fields.length>8){
				return fields[7];
			} else if(fields.length==8){
				return fields[5];
			}
			return fields[4];
	}


	@Override
	public Integer computeDepth(String[] items) {
		return items[getCSVIndex(ICSVFieldMapper.F_SEG)].replace(" ", "").length();
	}


	@Override
	public int getFieldIdx(int i) {
		return 2 * (i - 1) + 1;
	}


	@Override
	public boolean isBl13() {
		return false;
	}


	@Override
	public int getDepth(String prev, String line) {
		String[] items = SetsUtils.safeSplit(line, ';');
		return items[getCSVIndex(ICSVFieldMapper.F_NAME)].equals("END OF SEGMENT")?1:0;
	}
	
	

	@Override
	public Pattern getSetPattern() {
		return Pattern.compile("^(\\* )?[0-9]*\\p{Space}.*");
	}


}
