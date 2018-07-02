package org.miliconvert.adatp3.tools.hibernate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;

import org.hibernate.criterion.Order;
import org.miliconvert.adatp3.common.baseline.BaselineHibernateUtil;
import org.miliconvert.adatp3.hibernate.BaselineClsetord;
import org.miliconvert.adatp3.hibernate.BaselineConstants;
import org.miliconvert.adatp3.hibernate.BaselineMsgbasic;
import org.miliconvert.adatp3.hibernate.BaselineMsgsetord;
import org.miliconvert.adatp3.hibernate.BaselineMsgsnex;
import org.miliconvert.adatp3.hibernate.BaselineSetbasic;
import org.miliconvert.adatp3.hibernate.BaselineSetexample;
import org.miliconvert.adatp3.hibernate.HibernateUtil;

/**
 * 
 * @author matthieu
 *
 */
public class SampleGenerationTool {

	private static Map<String,String> replacementMap = new HashMap<String, String>();
	private static Map<String,String> newLineMap = new HashMap<String, String>();
	
	static {
		replacementMap.put("EUROPEAN1979", "EUROPEAN 1979");
		replacementMap.put("RECON", "RECCE");
		
		replacementMap.put("10ADA123456790","10ADA1234567890");
		replacementMap.put("271430ZFEB95","271430ZFEB1995");
		replacementMap.put("251800ZJAN92","251800ZJAN1992");
		replacementMap.put("041405ZAPR95","041405ZAPR1995");
		replacementMap.put("201350ZMAY97","201350ZMAY1997");
		replacementMap.put("PL","SL");
		replacementMap.put("LP78","45CYD");
		replacementMap.put("7M9","45CYD");
		replacementMap.put("RPTITEM-450GR","450LI");
		replacementMap.put("FFGH","ABUD");
		replacementMap.put("90","90M");
		replacementMap.put("221635A3AN","221635AJAN");
		replacementMap.put("ELING","ELINT");
		replacementMap.put("45PL07", "685AGL");
		replacementMap.put("DEF", "LOE");
		replacementMap.put("PLASMA O POS","PLASMA");
		replacementMap.put("RECCEDAT-NET:141325Z", "NET:141325ZFEB");
		replacementMap.put("RECCEDAT-NLT:141325ZFEB", "NLT:141325Z");
		replacementMap.put("RECCEDAT-LTIOV:141325ZFEB93","141325ZFEB1993");
		replacementMap.put("AUTMO:DL12341234","AUTMO:DL123123");
		replacementMap.put("AIR-M21R","BER");
		replacementMap.put("FISHCTC-FSH","SWCL");
		replacementMap.put("-CASH","-/CASH");
		replacementMap.put("32TH12345678","32STH12345678");
		replacementMap.put("03066ZNOV1996","041405ZAPR1995");
		replacementMap.put("60","060");
		replacementMap.put("40","040");
		replacementMap.put("BRIDGEQP-70","070");
		replacementMap.put("ABC","TRM");
		replacementMap.put("SOSUS1","SOSUS");
		replacementMap.put("123,5HZ", "123.5HZ");
		replacementMap.put("1WATER-33987GAL", "33987AGL");
		replacementMap.put("EORGBDRY-INF", "INFC");
		replacementMap.put("QUEBEC-GAMMA", "WATER");
		replacementMap.put("QUEBEC-ALPHA", "WATER");
		replacementMap.put("QUEBEC-BSDS", "MSDS");
		replacementMap.put("WEEKLY","BIWEEKLY");
		replacementMap.put(" ","-");
		replacementMap.put("0000-GE-123-9999","0000-12-123-9999");
		replacementMap.put("032330ZAPR95","032330ZAPR1995");
		replacementMap.put("REQLOC-ELP:10KM-7KM-12.0","ELP:10KM-7KM-12345");
		replacementMap.put("061230ZJUL95","061230ZJUL1995");
		replacementMap.put("TIMPD-01","2001");
		replacementMap.put("1280000","123456");
		replacementMap.put("040330ZAPR95","040330ZAPR1995");
		replacementMap.put("24 KE","24KE");
		replacementMap.put("24AG","A12345");
		
		newLineMap.put("BRIDGEQP","BRIDGEQP");
		newLineMap.put("BRIDGEEQP","BRIDGEEQP");
		newLineMap.put("REF", "REF");
		newLineMap.put("MAP", "MAP");
		newLineMap.put("CTENGVEH","CTENGVEH");
		newLineMap.put("RESASSET","RESASSET");
		newLineMap.put("XRAYA","XRAYA");
		newLineMap.put("XRAYB","XRAYB");
		newLineMap.put("APHIB","APHIB");
		newLineMap.put("APHIP","APHIB");
		newLineMap.put("PERIOD","PERIOD");
		newLineMap.put("APERIOD","APERIOD");
		newLineMap.put("SHIPS","SHIPS");
	}
	

	
	public static String createSampleFile(String setId, String baseline){
		StringBuffer buffer = new StringBuffer();
		
		HibernateUtil.init(baseline);
		if(BaselineConstants.BL12.equals(baseline)){
			replacementMap.put("PLACE:DEN HELDER","PLA:DEN HELDER");
			replacementMap.remove("DDG");
		} else {
			replacementMap.remove("PLACE:DEN HELDER");
			replacementMap.put("DDG", "DDG-LGN");
		}
		
		HibernateUtil.begin();
		
		try {
			BaselineMsgbasic message = new BaselineMsgbasic(); 
			message.setMsgid(setId);
			message = 	(BaselineMsgbasic) HibernateUtil.findByExample(message).get(0);
		
			int count = 0; 
		
		
			BaselineClsetord critHeader = new BaselineClsetord();
			critHeader.setContext(BaselineHibernateUtil.getMessageClass(message).getKey());
			
			List<BaselineClsetord> headerSets =  HibernateUtil.findByExampleAndSort(critHeader, Order.asc("setordno"));
	
			for(BaselineClsetord set : headerSets){
				BaselineSetbasic setBasic = (BaselineSetbasic) HibernateUtil.currentSession().get(BaselineSetbasic.class, set.getSetref());
				BaselineSetexample exemple = (BaselineSetexample) HibernateUtil.currentSession().get(BaselineSetexample.class, setBasic.getKey());
			
				
				buffer.append(formatExemple(exemple.getSetexample(),BaselineHibernateUtil.isRepeteable(set.getSetrep()))
						.replace("XXXXX.....", setId).replace("DEPSTARTREP", setId).replace("ADDID:CONTROL","NICK:COBRA GOLD"));
			
				
			}
			
	
			BaselineMsgsetord criteria = new BaselineMsgsetord();
		
			criteria.setContext(message.getKey());
		
		
			List<BaselineMsgsetord> sets = HibernateUtil.findByExampleAndSort(criteria, Order.asc("setordno"));
			for(BaselineMsgsetord set : sets){
				
				if(count%15!=0 || BaselineHibernateUtil.isMandatory(set)){
					BaselineSetbasic setBasic = (BaselineSetbasic) HibernateUtil.currentSession().get(BaselineSetbasic.class, set.getSetref());
					BaselineSetexample exemple = (BaselineSetexample) HibernateUtil.currentSession().get(BaselineSetexample.class, setBasic.getKey());
					
					if(exemple.getSetexample()!=null){
					
					
						Map<String,String> structural = getStructuralNotation(set.getSetordno().intValue()+"", message);
						String buff = formatExemple(exemple.getSetexample(),BaselineHibernateUtil.isRepeteable(set.getSetrep())&& structural.isEmpty());
						
						String[] setsSt =  buff.split("//");
						buff="";
						for (int j = 0; j < setsSt.length-1; j++) {
			
							String [] splitted = (setsSt[j]+"//").split("/");
							if(!structural.isEmpty()){			
								for(Entry<String,String> key : structural.entrySet() ){
									splitted[Integer.parseInt(key.getKey())]=key.getValue();
								}
					
							}
							//Corrige des bugs dans les exemples
							if(!splitted[0].contains("\n") 
									|| newLineMap.containsKey(splitted[0].replaceAll("\\s",""))){
								
								splitted[0] = setBasic.getSetid();
							}else {
								splitted[0] = setBasic.getSetid()+"\n";
							}
							
							for (int i = 0; i < splitted.length; i++) {
								if(replacementMap.containsKey(splitted[i].trim())
										){
									splitted[i]= replacementMap.get(splitted[i].trim());
								}
								if(replacementMap.containsKey(setBasic.getSetid().toUpperCase()+"-"+splitted[i].trim())){
									splitted[i]= replacementMap.get(setBasic.getSetid().toUpperCase()+"-"+splitted[i].trim());
								}
								
								buff+=splitted[i]+"/";
							}
							
							buff+="/\n";
							
						
						}
						
			
						
						buffer.append(buff);
					} else {
						System.out.println("Cannot find example for "+setBasic.getSetid());
					}
					
					/*
					if(count%10==0){
						buffer.append("AMPN/ADDITIONAL INFORMATION REGARDING ANY LINE ENTRY ABOVE COULD BE\n"
						+"REPORTED IN THIS FREE TEXT SET BEGINNING ON THE LINE IMMEDIATELY\n"
						+"FOLLOWING THE 5POL SET//\n");
						buffer.append("NARR/THIS IS AN EXAMPLE OF A FREE TEXT SET THAT SHOWS THAT THE FIRST\n"
							+"LINE MAY NOT CONTAIN MORE THAN 64 CHARACTERS AFTER THE FIELD MARKER,\n"
							+"BUT SUBSEQUENT LINES (WHICH ARE NOT STARTED BY AN IDENTIFIER OR FIELD\n"
							+"MARKER) MAY CONTAIN UP TO 69 CHARACTERS//\n");
					}
					
					if(count%12==0){
						buffer.append("AMPN/USS GEORGE WASHINGTON WILL BE OPERATING IN THIS AREA DURING\n"+
						"NIGHT OF 15/16 JUNE//\n");
					}*/
				}
				
				count++;
				
			}
			
			//  buffer.append("RMKS/ADATP 3 AUTO GENERATED FROM BASELINE SPECS//\n");
			
		
		} finally {
			HibernateUtil.closeSession();
		}
		
		return buffer.toString();
		
	}

	private static String formatExemple(String exemple, boolean isRepeatable) {
		//System.out.println(exemple);

		
		if(exemple.contains("1SURPDEF")){
			exemple = exemple.replace("CS/DE","CS").replace("04/01", "04");
		}
		
		if(isRepeatable){
			
			if(exemple.contains("SUPPLYCL")){
				exemple = exemple.replace("300 X JERRICANS OF DIESEL AT EDGE/ OF WOODS", "300 X JERRICANS OF DIESEL AT EDGE OF WOODS");
				
			}
			
			return exemple.replace("//", "//\n");
			
		} 
		
		return exemple.substring(0, exemple.indexOf("//")+2)+"\n";
	}
	
	//ACTIONS TAKEN/IN HAND TO CORRECT (logsitland)
	//EFFECT/DAMAGE CAUSED (increp)
	private static Map<String,String>  getStructuralNotation(String setSeq,BaselineMsgbasic message){
		Map<String,String> ret = new HashMap<String, String>();
		BaselineMsgsnex structuralNotation = (BaselineMsgsnex)HibernateUtil.currentSession().get(BaselineMsgsnex.class, message.getKey());
		
		//System.out.println(structuralNotation.getKey());
		
		if(structuralNotation!=null && structuralNotation.getMsgsnexpr()!=null){
		String[] lines = structuralNotation.getMsgsnexpr().split("\n");
	
		for (int i = 0; i < lines.length; i++) {
			Matcher ma  = BaselineHibernateUtil.struture.matcher(lines[i].trim());
			if(ma.matches() &&  ma.group(1).equals(setSeq) ){
				ret.put(ma.group(2).replace("F",""), ma.group(3).replace("/", " OR "));
				
			}
		}
		}
		return ret;
		
	}
	
	
	
}
