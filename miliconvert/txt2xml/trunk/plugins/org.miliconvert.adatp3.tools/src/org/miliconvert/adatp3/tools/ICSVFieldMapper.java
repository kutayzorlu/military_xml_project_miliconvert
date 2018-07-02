package org.miliconvert.adatp3.tools;

import java.util.regex.Pattern;

public interface ICSVFieldMapper {

	
	public  final String F_SEG = "F_SEG";
	public  final String F_RPT = "F_RPT";
	public  final String F_OCC = "F_OCC";
	public  final String F_SETID = "F_SETID";
	public  final String F_SEQ = "F_SEQ";
	public  final String F_FIELD_OCC = "F_FIELD_OCC";
	public  final String F_NAME = "F_NAME";
	
	//Fields
	public final String FF_SEQ = "FF_SEQ";
	

	public final String FLD_DESIGNATOR = "FLD_DESIGNATOR";
	public final String FLD_DESC = "FLD_DESC";
	public final String FLD_ALT = "FLD_ALT";
	public final String CLASSNAME = "CLASSNAME";
	public final String FFIRN_FUDN = "FFIRN_FUDN";
	public final String STRUCTURE = "STRUCTURE";
	public final String FLD_NAME = "FLD_NAME";
	public final String FLD_CARD = "FLD_CARD";

	
	
	int getCSVIndex(String key);

	Boolean isStarter(String prev, String line);

	int shouldFlush(String prev, String line);

	String getFfirn(String[] fields);

	Integer computeDepth(String[] items);

	int getFieldIdx(int i);

	boolean isBl13();

	int getDepth(String prev, String line);

	Pattern getSetPattern();

}
