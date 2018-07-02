package org.miliconvert.adatp3.common.baseline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.criterion.Order;
import org.miliconvert.adatp3.common.InvalideAd3Exception;
import org.miliconvert.adatp3.common.formlets.Field;
import org.miliconvert.adatp3.common.formlets.Header;
import org.miliconvert.adatp3.common.formlets.Set;
import org.miliconvert.adatp3.common.utils.SetsUtils;
import org.miliconvert.adatp3.hibernate.BaselineClformbas;
import org.miliconvert.adatp3.hibernate.BaselineClsetord;
import org.miliconvert.adatp3.hibernate.BaselineFfirnbasic;
import org.miliconvert.adatp3.hibernate.BaselineFfirnchain;
import org.miliconvert.adatp3.hibernate.BaselineFldposname;
import org.miliconvert.adatp3.hibernate.BaselineFudbasic;
import org.miliconvert.adatp3.hibernate.BaselineMsgbasic;
import org.miliconvert.adatp3.hibernate.BaselineMsgsetord;
import org.miliconvert.adatp3.hibernate.BaselineMsgsnex;
import org.miliconvert.adatp3.hibernate.BaselineSetbasic;
import org.miliconvert.adatp3.hibernate.BaselineSetfield;
import org.miliconvert.adatp3.hibernate.BaselineSetfldord;
import org.miliconvert.adatp3.hibernate.HibernateUtil;


/**
 * 
 * @author matthieu
 *
 */
public class BaselineHibernateUtil {


	private static Log logger = LogFactory.getLog(BaselineHibernateUtil.class);
	public static Pattern struture = Pattern.compile("\\(([0-9]{1,2}[A-Z]{0,1})\\)(F[0-9]{0,2})\\p{Space}[A=]\\p{Space}\"(.*)\"");
	private static Map<String,String> cache = new HashMap<String, String>();
	
	
	
	public static boolean isRepeteable(BaselineMsgsetord set) {
		return (set.getSetrep()!=null  && "R".equals(set.getSetrep()))
			|| isSegmentStarter(set);
	}


	public static boolean isMandatory(BaselineMsgsetord set) {
		return isMandatory(set.getSetcond());
	}
	

	public static boolean isMandatoryField(BaselineSetfldord fieldDef) {
		return isMandatory(fieldDef.getFieldcond());
	}

	
	
	public static boolean isSegMandatory(BaselineMsgsetord set) {
		return isMandatory(set.getStrtbraket());
	}



	public static boolean isSegRepeteable(BaselineMsgsetord set) {
		return isRepeteable(set);
	}
	


	private static boolean isRepeteableField(BaselineSetfldord field) {
		return isRepeteable(field.getFieldrep());
	}

	
	
	public static boolean isRepeteable(String s) {
		return s!=null && "R".equals(s);
	}


	public static boolean isMandatory(String s) {
		return s!=null && "M".equals(s);
	}

	
	public static boolean isInRepeatGroup(BaselineSetfldord fieldDef){
		int setCount = (Integer) HibernateUtil.currentSession()
		.createSQLQuery("SELECT COUNT(A.\"KEY\") FROM BASELINE_SETFLDORD A WHERE A.CONTEXT= :context " +
				" AND (  A.FLDORDNO=:next OR A.FLDORDNO=:prev ) " +
				" AND A.FIELDREP='R'")
		.setDouble("context",fieldDef.getContext())
		.setDouble("next",fieldDef.getFldordno()+1 )
		.setDouble("prev",fieldDef.getFldordno()-1 )
		.list().get(0) ;
		
		return isRepeteable(fieldDef.getFieldrep()) && setCount>0;
		
	}
	


	public static  Object[] findFieldDefAndAlternative(String setId, int i, int lastPos,
			BaselineClsetord headerSet, BaselineMsgsetord setDef, Field f) {
		BaselineSetbasic setBasic = null;
		
		if(headerSet!=null){
			setBasic = (BaselineSetbasic) HibernateUtil.currentSession().get(BaselineSetbasic.class, headerSet.getSetref());
		} else {
			setBasic = (BaselineSetbasic) HibernateUtil.currentSession().get(BaselineSetbasic.class, setDef.getSetref());
		}
		
		return findFieldDefAndAlternative(setId, i, lastPos, setBasic, f);
	}
	
	public static Object[] findFieldDefAndAlternative(String setId, int i, int lastPos, BaselineSetbasic setBasic, Field f) {
		
		   debug("Trying to find field def for " +setBasic.getSetid()+ " at pos "+(i+1)+ " (lastPos "+lastPos+") value "+f.getValue()+ " descriptor "+f.getDescriptor());
		
		    BaselineSetfldord crit = new BaselineSetfldord();
		    crit.setContext(setBasic.getKey());
		    List<BaselineSetfldord> fields  = HibernateUtil.findByExampleAndSort(crit, Order.asc("fldordno"));
		    
		    //On parcours la liste des champs du Set. Qui ont une POS plus grande que lastPos ou égale.
			// Cas des groupes de répétitions:
			// Si je suis repetable:
				// - Si le prochaine est repetable
				// - Si le précedent été repeteable
			// Si je ne suis pas repetable
			// Si le précedent été repetable
		    
		    
		    //De combien on recule l'index:
		    
		    //Si le precedent ou le suivant sont repeteable c'est un groupe de repetion
		    //Si on est a la fin du groupe de répetition on remet l'index au début du groupe 
		    //(Si le nombre de champ est plus grand que la position courante + le nombre de champ dans le groupe) 
		    
		    BaselineSetfldord firstField = null;
		    
		    BaselineSetfldord currField = null;
		    
		    StringBuffer logHistory = new StringBuffer();
		    
		    logHistory.append("set "+setId+" field at pos "+i+". Cause :\n");
		    
		    for(BaselineSetfldord field : fields){
		    	
		    	/*
		    	 * On stocke le premier champ d'un groupe de répétition
		    	 */
		    	 if(currField==null){
			    	if(isRepeteableField(field) && firstField==null){
			    		debug("Starting repeteable group"); 
			    		firstField = field;
			    	 }
			    		
			    	 if(firstField!=null && !isRepeteableField(field)){
			    		 debug("Ending repeteable group");
			    		 firstField=null;
			    	 }
			    	 
			    	 //Si le champ est repetable et egal a la position courante
			    	 if((  field.getFldordno().intValue()== lastPos && (isRepeteableField(field) || lastPos==fields.size() )) ){
			    		debug("Field is repeteable");
			    		 
			    		 //Cas du dernier et non dans un groupe
			    		 if(lastPos==fields.size()  ){
			    			 if(firstField!=null && firstField.getFldordno().intValue()<lastPos){
			    				 debug("Field is the last field of the set and is member of repeteable group.");
			    				 Object[] ret = checkField(firstField,f,logHistory);
							    	if(ret!=null){
							    		return ret;
							    	} 
			    				 logHistory.append("\t- Last field reached (Repeatable group first field dosn't match)\n");
			    			 } else {
			    				debug("Field is the last field of the set and is repeteable");
			    				Object[] ret = checkField(field,f,logHistory);
						    	if(ret!=null){
						    		return ret;
						    	}
						    	 logHistory.append("\t- Last field reached (Last repatable field doesn't match)\n");
			    			 }
						    	
			    		 }
			    		 
			    		 //On set currField
			    		 currField = field;
			    		 
			    	 } //Sinon 
			    	 else if(field.getFldordno().intValue()>lastPos){
			    		 Object[] ret = checkField(field,f,logHistory);
					    	if(ret!=null){
					    		return ret;
					    	} 
					    	if(field.getFldordno().intValue() ==fields.size() ){
					    		 logHistory.append("\t- Last field doesn't match\n");
					    		
					    	}
					    	throw new InvalideAd3Exception("Field ("+f.getValue()+") not found for  "+logHistory);
					    	
			    	 }
		    	 }
			    	 
		    	 else {
		    		 debug("Testing next field to see if it is repeteable");
		    		 //Si le champ suivant est repetable on est forcement sur le suivant
		    		 if(isRepeteableField(field) || isEmptyField(f)){
		    			currField = field;
		    		 } else {
		    			 //Si on est dans un group et à la fin on repart au debut
		    			 if(firstField!=null){
		    				 currField = firstField;
		    			 } 
		    			
		    		 }
		    		 
		    		 Object[] ret = checkField(currField,f,logHistory);
				    	if(ret!=null){
				    		return ret;
				    	}
		    		  currField = null;
		    		  firstField = null;
		    		  debug("First field of repeteable group doesn't match, testing current field");
		    		  
		    		 ret = checkField(field,f,logHistory);
				    	if(ret!=null){
				    		return ret;
				    	}
				    	throw new InvalideAd3Exception("Field ("+f.getValue()+") not found for  "+logHistory);
		    		 /* currField = null;
		    		  firstField = null; */
		    	
		    	 }
		    	
		    }
		
			
			throw new InvalideAd3Exception("Field ("+f.getValue()+") not found for  "+logHistory);
		
		
		
		
	}


	private static Object[] checkField(BaselineSetfldord field, Field f,StringBuffer logHistory) {

		//Pour trouver l'appartennace on ce base sur le field descriptor si il existe
		// LA regexp ou l'enumeration de valeur.
		
		BaselineSetfield alternative = findAlternative(field, f, logHistory);
		 if(alternative!=null){
				 //Si une alternative match alors on la retourne:
				return new Object[]{field, alternative};
		 } 
			
			
	    if(isMandatoryField(field)){
					throw new InvalideAd3Exception("Missing mandatory field in pos "+ field.getFldordno().intValue()+" in "+logHistory.toString() );
		}
	    return null;
	}


	public static BaselineClformbas getMessageClass(BaselineMsgbasic message){
		return  (BaselineClformbas) HibernateUtil.currentSession().get(BaselineClformbas.class, message.getContext());
	}
	
	
	

	public static BaselineClsetord findHeaderSetDef(BaselineMsgbasic message ,Set set, int lastSeqUsed) {
		
		BaselineSetbasic setBasic  = new BaselineSetbasic();
		setBasic.setSetid(set.getIdentifier());

		setBasic = (BaselineSetbasic) HibernateUtil.findByExample(setBasic).get(0);
		
		BaselineClsetord critHeader = new BaselineClsetord();
		critHeader.setContext(getMessageClass(message).getKey());
		critHeader.setSetref(setBasic.getKey());
		
		List<BaselineClsetord> headerSets =  HibernateUtil.findByExampleAndSort(critHeader, Order.asc("setordno"));

		if(logger.isInfoEnabled() && headerSets!=null && headerSets.size()>0){
			debug("Set "+set.getIdentifier()+ " is a class Set");
		}

		
		if(headerSets!=null && headerSets.size()>0 ){
		//On recupère tous les sets d'id équivalente qui on une position plus grande ou égal à lastSeqUsed
			for(BaselineClsetord setDef : headerSets){
				if(setDef.getSetordno()>=lastSeqUsed){
					if((	(setDef.getSetordno().intValue()==lastSeqUsed && isRepeteable(setDef.getSetrep()))
							|| (setDef.getSetordno().intValue()>lastSeqUsed) )			
							){
						
						return setDef;
					}
					 if(isMandatory(setDef.getSetcond())){
						throw new InvalideAd3Exception("Missing mandatory class set in pos "+setDef.getSetordno());
					}
					
				}
			}
		
		}
		
		
		return null;
			
		
	}
	
	
	public static BaselineMsgsetord findSetDef(BaselineMsgbasic message ,Set set, int lastSeqUsed,
			int depth) {
		
		debug("Trying to find set " +set.getIdentifier()+ " at pos "+lastSeqUsed );
		
	
		BaselineMsgsetord crit = new BaselineMsgsetord();
		crit.setContext(message.getKey());
	
		List<BaselineMsgsetord> sets = HibernateUtil.findByExampleAndSort(crit, Order.asc("setordno"));
		
		StringBuffer logHistory = new StringBuffer();
		
		BaselineMsgsetord lastSeg = null;
		
		if(sets.size()<1){
			logHistory.append("\t-No set in DB found");
		}
		
		
	    
	    int minimalDepth = 0;
		
		//On recupère tous les sets d'id équivalente qui on une position plus grande ou égal à lastSeqUsed
		for(BaselineMsgsetord setDef : sets){
			
			int setSeq = setDef.getSetordno().intValue();
			
			BaselineSetbasic setBasic  = (BaselineSetbasic) HibernateUtil.currentSession().get(BaselineSetbasic.class, setDef.getSetref());
		
			if((setSeq==lastSeqUsed && isRepeteable(setDef)) || setSeq>lastSeqUsed ){
			
				// Si on en trouve un avec le même set-seq = lastSeqUsed est qu'il n'est pas répetable 
				// (Cas des répétitions de sets en suivant) on passe 
				// Sinon on test si il est bien structuré, le premier trouvé est le bon.
				// On test si le niveau
				//gap = 0 même niveau que le prec
				//gap > 0 au dessus
				//gap < 0 en dessous
				
				int gap =  getSegmentDepth(setDef) -depth;	
				
				
				if(gap<minimalDepth){
					minimalDepth = gap;
				}
				

					//On a 3 cas en terme de niveaux:
					// 1 niveau au dessus et y a pas eu de descente 
					//Niveau en dessous si depuis qu'on a commencé à déscendre on est pas remonté
					//Ou d'un cran et je suis starter
					//Au même niveau est on est pas jamais descendu et on a pas remonté ou mtn et je suis starter
				 if(setBasic.getSetid().equalsIgnoreCase(set.getIdentifier().trim())){
						if( (gap == (minimalDepth+1) && isSegmentStarter(setDef,true) ) 
					    || (gap == minimalDepth )
						  ){
								
									if(isWellStructured(set,message,""+setSeq) ){
										debug("Found set def for " +set.getIdentifier()+" at set-seq "+setSeq);
										return setDef;
									} else {
										logHistory.append("\t- Set "+set.getIdentifier()+" at set-seq "+setSeq+" doesn't match structural notation.\n");
									}
									
								
								
									//Si la hauteur est bonne on test si c'est un set obligatoire
									//Le set n'est obligatoire que si il est 
									// marqué M ou (C et satisfaisant)
									if( isMandatory(setDef) && setSeq!=lastSeqUsed ){
												 logHistory.append("\t-In looking for "+ set.getIdentifier()+"("+lastSeqUsed+") found missing mandatory set "+setBasic.getSetid()+" at set-seq "+setSeq);
												 break;
									}
			
					} else {
							logHistory.append("\t- Set "+set.getIdentifier()+" at set-seq "+setSeq+" isn't at good depth (gap)"+gap+" (current depth is "+depth+") minimal depth is ("+minimalDepth+").\n");
					}
						
				}
				
					
				
				
			} else 	if( setBasic.getSetid().equalsIgnoreCase(set.getIdentifier().trim())){
				int gap =  getSegmentDepth(setDef) -depth;	
				debug("Is missing segment ?:"+set.getIdentifier()+" gap "+gap);
				 if(isSegmentStarter(setDef,gap == 0)){
					 lastSeg = setDef;
				 } else {
					 lastSeg = null;
				 }		
			}
		}
		
		//Cas d'un segment repetable (On recule l'index) 
		if(lastSeg!=null){
			debug("Trying for repeteable segment");
			int curDepth = getSegmentDepth(lastSeg);	
			int setSeq = lastSeg.getSetordno().intValue();
			if((depth-curDepth)>=-1){
				if(isWellStructured(set,message,""+setSeq) ){
					debug("Found set def for " +set.getIdentifier()+" at set-seq "+setSeq);
					return lastSeg;
				} else {
					logHistory.append("\t- Set "+set.getIdentifier()+" at set-seq "+setSeq+" doesn't match structural notation.\n");
				}
			} else {
				logHistory.append("\t- Set "+set.getIdentifier()+" at set-seq "+setSeq+" isn't at good depth "+curDepth+" (current depth is "+depth+").\n");
			}
		}
		
		
		
		
		throw new InvalideAd3Exception("Set def not found for "+set.getIdentifier() +"("+lastSeqUsed+")\n"+logHistory.toString());
	
	}
	
	




	public static boolean isWellStructured(Set set, BaselineMsgbasic message , String setSeq) {
		
		
		BaselineMsgsnex structuralNotation = (BaselineMsgsnex)HibernateUtil.currentSession().get(BaselineMsgsnex.class, message.getKey());
		
		String[] lines = structuralNotation.getMsgsnexpr().split("\n");
		
		for (int i = 0; i < lines.length; i++) {
			Matcher ma  = struture.matcher(lines[i].trim());
			if(ma.matches() &&  ma.group(1).equals(setSeq) ){
				debug("Found a structural notation :"+lines[i]);
				int fieldPos = Integer.parseInt(ma.group(2).replace("F", ""))-1;
				//Ici on fait l'approximation qu'il n'y a pas de MultilineSet qui match
				if( set.getFields().size()>0 && set.getFields().get(0).length>fieldPos 
						&& ma.group(3).replace("/", " OR ").equals(set.getFields().get(0)[fieldPos].getValue())){
					return true;
				} else {
					return false;
				}
				
			}
			
			
		}
		
		
		//TODO Add more struct note ex 1LINKSTAT
		
		return true;
		
		
	}


	public static int getSegmentDepth(BaselineMsgsetord setDef) {
		BaselineMsgsetord crit = new BaselineMsgsetord();
		crit.setContext(setDef.getContext());
		List<BaselineMsgsetord> sets = HibernateUtil.findByExampleAndSort(crit, Order.asc("setordno"));
		int depth = 0;
		//Peut ce faire en une requête
		for(BaselineMsgsetord set : sets){
			
			if(set.getStrtbraket()!=null){
				depth ++;
			}

			if(set.getKey() == setDef.getKey()){
				return depth;
			}
			
			//On decremente seulement aprés
			if(set.getStopbraket()!=null ){
				depth -= Integer.parseInt(set.getStopbraket());
			}
			
		}
		return depth;
	}

	
	
	

	public static boolean isSegmentStarter(BaselineMsgsetord setDef) {
		return setDef.getStrtbraket()!=null;
	}

	
	// est un segment starter si c'est un starter ou 
	// si gap =1 et le prec segment set est O ou C et que entre les deux on as pas de M
	public static boolean isSegmentStarter(BaselineMsgsetord setDef, boolean isPartial) {
		if(isSegmentStarter(setDef)){
			return true;
		} else if(isPartial){
		    debug("Is missing segment ?");
			BaselineMsgsetord crit = new BaselineMsgsetord();
			crit.setContext(setDef.getContext());
			List<BaselineMsgsetord> sets = HibernateUtil.findByExampleAndSort(crit, Order.asc("setordno"));
			BaselineMsgsetord seg = null;

			for(BaselineMsgsetord set : sets){
				
				if(set.getStrtbraket()!=null){
					if(!isMandatory(set)){
						debug("Partial segment at pos : "+set.getSetordno().intValue());
						seg = set;
					} else {
						seg = null;
					}
				
				}

				if(set.getKey() == setDef.getKey()){
					if(seg!=null){  
						debug("Answer is yes !");
						return true;
					}
					debug("Answer is no !");
					return false;
				} else if(seg!=null && set.getStrtbraket()==null && isMandatory(set)) {
					debug("Mandatory set at pos : "+set.getSetordno().intValue()+" reseting ");
					seg = null;
				}
				
				if(set.getStopbraket()!=null ){
					seg = null;
					debug("Closing bracket set at pos : "+set.getSetordno().intValue());
				}
				
			}
			
			
		}
		
		return false;
	}




	public static BaselineSetfield findAlternative(BaselineSetfldord fieldDef,
			Field field,StringBuffer logHistory) {

    	
    	BaselineSetfield crit = new BaselineSetfield();
	  	crit.setContext(fieldDef.getKey());
    	List<BaselineSetfield> alternatives = HibernateUtil.findByExample(crit); 
		for (BaselineSetfield alternative : alternatives) {
			debug("Looking for alternative "+alternative.getFudn());
			if(field.getDescriptor()==null 
					|| field.getDescriptor().equalsIgnoreCase(alternative.getFielddesc())) {
			

			 Pattern pattern = buildNameFieldAndPattern(alternative, new ArrayList<BaselineFfirnbasic>(), new ArrayList<BaselineFudbasic>());
			
					Matcher matcher = pattern.matcher(field.getValue());
				      if(isEmptyField(field) || matcher.matches() ){
						return alternative;
					} else {
						debug("Value: "+field.getValue() +" doesn't match ");
						logHistory.append("\t- Value "+field.getValue()+ " doesn't match regexp "+pattern.toString()+" \n");
					}
			} else {
				debug("Fied descriptor doesn't match");
				logHistory.append("\t- Field descriptor "+field.getDescriptor()+ " doesn't match descriptor "+alternative.getFielddesc()+" \n");
				
			}
			
		}
    	
    	
		return null;
	}

	
	private static boolean isEmptyField(Field field) {
		return field.getValue().trim().length()<1 || "-".equals(field.getValue().trim());
	}


	

	public static Pattern buildNameFieldAndPattern(BaselineSetfield alternative, List<BaselineFfirnbasic> ffirns, List<BaselineFudbasic> fudns) {
		

		BaselineFudbasic fudbasic = (BaselineFudbasic) HibernateUtil.currentSession().get(BaselineFudbasic.class, alternative.getFudn());


		BaselineFfirnbasic ffirn = (BaselineFfirnbasic) HibernateUtil.currentSession().get(BaselineFfirnbasic.class, fudbasic.getContext());
	
		StringBuffer regexp = new StringBuffer();
		
		
		
			//On test si ffirn est composite;

			BaselineFfirnchain crit = new BaselineFfirnchain();
			crit.setContext(ffirn.getKey());
			
			
			
			List<BaselineFfirnchain> chains = HibernateUtil.findByExample(crit);
			
			//On doit retrier dans un ordre plus logique que le Natural sort d'hibernate
			Collections.sort(chains, new Comparator<BaselineFfirnchain>(){
				@Override
				public int compare(BaselineFfirnchain o1, BaselineFfirnchain o2) {
					return (new Integer(o1.getFfordno())).compareTo(new Integer(o2.getFfordno()));
				}
				
			});
			
			ffirns.add(ffirn);
			fudns.add(fudbasic);
			
			if(chains!=null && chains.size()>0 ){
				debug("Field is composite "+fudbasic.getFudname()+ " "+fudbasic.getKey());
				for(BaselineFfirnchain chain : chains){
					BaselineFudbasic fudbasicTmp = (BaselineFudbasic) HibernateUtil.currentSession().get(BaselineFudbasic.class, chain.getFudnref());
					BaselineFfirnbasic ffirnTmp = (BaselineFfirnbasic) HibernateUtil.currentSession().get(BaselineFfirnbasic.class, fudbasicTmp.getContext());
					debug("Appening regexp:"+ffirnTmp.getFfirn()+"_"+fudbasicTmp.getFudn()+" "+chain.getFfordno());
					regexp.append(getFFirnRegexp(fudbasicTmp,ffirnTmp));
				    ffirns.add(ffirnTmp);
				    fudns.add(fudbasicTmp);
				}
				
			} else {
				regexp.append(getFFirnRegexp(fudbasic,ffirn));
			}
			
	
			debug("Regex : "+regexp.toString()+" for field "+ffirn.getFfirn()+"_"+fudbasic.getFudn()+" "+fudbasic.getFudname());

		
		
		
		return Pattern.compile(regexp.toString());
	}

	
	private static void debug(String message) {
		//System.out.println(message);
		logger.debug(message);
	}


	@SuppressWarnings("unchecked")
	private static List<String> getFfirnData(BaselineFudbasic fudn, BaselineFfirnbasic ffirn){
		
		debug("Get firn data for : ffirn "+ffirn.getKey() + " fu "+fudn.getKey() );

		
		
		
		List<String> ret = HibernateUtil
		.currentSession()
		.createSQLQuery("SELECT B.DICHARCODE FROM BASELINE_DIBASIC B, BASELINE_DIFUDREF C WHERE B.CONTEXT = :ffirn AND B.\"KEY\"=C.DI AND C.FUDN= :fu")
		.setDouble("ffirn", ffirn.getKey())
		.setDouble("fu", fudn.getKey())
		.setReadOnly(true)
		.list();
		
		
		
		/*
		 * a.     Individual Entry
			       An individual entry is recognized by the fact that the first character is
			not an opening left square bracket ([).

		 */
		/*
		 * c. Instructive Entry
		 *
		 *       An instructive entry is recognized by the fact that the first two
				characters are opening left square brackets ([[).

		*/
		for (Iterator<String> iterator = ret.iterator(); iterator.hasNext();) {
			String data = (String) iterator.next();
			if(data==null || data.contains("[")){
				//iterator.remove();
				//TODO parse TRHOUGHT expr
				return new ArrayList<String>();
			}
		}
		 
		debug("Size of enumerator :"+ret.size());
		
		return ret;
	}
	
	

	public static String getFFirnRegexp(BaselineFudbasic fudn, BaselineFfirnbasic ffirn) {
	   
		
		
		if(cache.containsKey(HibernateUtil.getCurrentBaseline()+"-"+ffirn.getFfirn()+"_"+fudn.getFudn())){
			return cache.get(HibernateUtil.getCurrentBaseline()+"-"+ffirn.getFfirn()+"_"+fudn.getFudn());
		}
		
		StringBuffer regexp = new StringBuffer();
		
		if((ffirn.getFfirn()+"_"+fudn.getFudn()).equals("1006_1")){

			debug("Found free text alternative");
			regexp.append("([:a-zA-Z0-9\\p{Space}\n\\.,\\(\\)\\?\\-_/\\\\.]*)");
			//regexp.append("(.*)");
		} else {
		
			List<String> values = getFfirnData(fudn,ffirn);
			
			/**
			 * A= Alphabetic Character [A,B,...Z]
				B= Blank (or space) Character
				N= Numeric Character [0,1,...9]
				S= SPECIAL CHARACTER [.,-()?]
				X= Alphanumeric Character (Alphabetic, Numeric, Special or Blank
				   Character)
			
			c.     Free Text Field Format
			       A field format with no prescribed length limitation and allowing all
					permitted character types, except successive slant characters, is known as a
					free text field format.


			 */
			
			if(values.size()<1){
			
				
			    String type = fudn.getTypchars();
			    regexp.append("([");
			    if(type.contains("N") || type.contains("X") ){
			    	regexp.append("0-9");
			    	//Min - Max
			    }
			    if(type.contains("A")  || type.contains("X")  ){
			    	regexp.append("a-zA-Z");
			    }
			    if(type.contains("B")  || type.contains("X")  ){
			    	regexp.append("\\p{Space}");
			    }
			    
			    if(type.contains("S")  || type.contains("X") ){
			    	regexp.append("\\.,\\(\\)\\?\\-_");
			    }
			    
			    
			    
			    regexp.append("]");
			
			   
				regexp.append("{");
				if(!fudn.getFudmax().equals(fudn.getFudmin())){
					regexp.append(fudn.getFudmin()+","+fudn.getFudmax());
				} else {
					regexp.append(fudn.getFudmin());
				}
				
				regexp.append("})");
			} else {
				
			
				
					regexp.append("(");
					for(String value : values){
						regexp.append(escapeDangling(value)+"|");
					}
					regexp.deleteCharAt(regexp.length()-1);
					regexp.append(")");
			}
		}
		
		cache.put(HibernateUtil.getCurrentBaseline()+"-"+ffirn.getFfirn()+"_"+fudn.getFudn(),regexp.toString());
		
		return regexp.toString();
	}


	private static String escapeDangling(String value) {
		return value.replaceAll("\\?", "\\\\?")
					.replaceAll("\\.", "\\\\.")
					.replaceAll("\\*", "\\\\*")
					.replaceAll("\\+", "\\\\+")
					.replaceAll("\\^", "\\\\^")
					.replaceAll("\\$", "\\\\$");
	}


	public static String getElementNameForField(BaselineSetfldord fieldDef,BaselineSetfield alternative, Double setRef) {

	  	String name =  getElementNameForField(fieldDef);
	  	if(name==null){
	  		return getElementAlternativeForField(fieldDef,alternative,setRef);
	  	}
		
	  	
	  	
	    return name;
	   
		
	}
	
	
	


	public static String getElementAlternativeForField(BaselineSetfldord fieldDef,BaselineSetfield alternative,  Double setRef) {
		  BaselineFudbasic fudbasic = (BaselineFudbasic) HibernateUtil.currentSession().get(BaselineFudbasic.class, alternative.getFudn());
	  		String name = SetsUtils.getXmlElementName(fudbasic.getFudname());
		  if(setRef!=null){
			  int setCount = (Integer) HibernateUtil.currentSession()
				.createSQLQuery("SELECT COUNT(B.\"KEY\") FROM BASELINE_SETFLDORD A, BASELINE_FUDBASIC B, BASELINE_SETFIELD C WHERE B.\"KEY\"=C.FUDN" +
						" AND C.CONTEXT=A.\"KEY\" AND A.CONTEXT=:context  AND B.\"FUDNAME\"=:name AND A.FLDORDNO<:fldordn")
				.setDouble("context",fieldDef.getContext())
				.setString("name", fudbasic.getFudname())
				.setDouble("fldordn",fieldDef.getFldordno() )
				.list().get(0) ;
				if(setCount>0){
					name = name+"_"+setCount;
				}
		  }
		  
  		return name;
	}





	public static String getElementNameForField(BaselineSetfldord field) {
		 BaselineFldposname fldName = (BaselineFldposname) HibernateUtil.currentSession().get(BaselineFldposname.class, field.getKey());
	    	if(fldName==null){
	    		return null;
	    	}
	    	String name =  SetsUtils.getXmlElementName(fldName.getPosname().trim());

				  int setCount = (Integer) HibernateUtil.currentSession()
					.createSQLQuery("SELECT COUNT(B.\"KEY\") FROM BASELINE_SETFLDORD A, BASELINE_FLDPOSNAME B, BASELINE_SETBASIC D WHERE B.\"KEY\"=A.\"KEY\" " +
							" AND A.CONTEXT=:context AND B.\"POSNAME\"=:name AND A.FLDORDNO<:fldordn")
					.setDouble("context",field.getContext())
					.setString("name", fldName.getPosname())
					.setDouble("fldordn",field.getFldordno() )
					.list().get(0) ;
					if(setCount>0){
						name =name+"_"+setCount;
					}


	        return name;
	}

	
	public static String getElementNameForSet(BaselineMsgsetord setDef) {
		
		if(!cache.containsKey("SETNAME-"+setDef.getKey())){
			BaselineSetbasic setBasic = (BaselineSetbasic) HibernateUtil.currentSession().get(BaselineSetbasic.class, setDef.getSetref());
			
			cache.put("SETNAME-"+setDef.getKey(),getElementNameForSetBasic(setBasic,setDef.getContext(),setDef.getSetordno()));
		}

		return cache.get("SETNAME-"+setDef.getKey());
	}

	


	public static String getElementNameForSet(BaselineClsetord headerSet) {
		
		
		if(!cache.containsKey("SETNAME-"+headerSet.getKey())){
			BaselineSetbasic setBasic = (BaselineSetbasic) HibernateUtil.currentSession().get(BaselineSetbasic.class, headerSet.getSetref());

			
			cache.put("SETNAME-"+headerSet.getKey(),getElementNameForSetBasic(setBasic,headerSet.getContext(),headerSet.getSetordno()));
		}
		
		return cache.get("SETNAME-"+headerSet.getKey());
		
		
	}
	

	
	public static String getElementNameForSetBasic(BaselineSetbasic setBasic, Double context, double setSeq){
		
		String name = SetsUtils.getXmlElementName(setBasic.getSettitle());
		
		int setCount = (Integer) HibernateUtil.currentSession()
						.createSQLQuery("SELECT COUNT(\"KEY\") FROM BASELINE_MSGSETORD WHERE SETREF=:setRef AND CONTEXT=:context AND SETORDNO<:setSeq")
						.setDouble("setRef",setBasic.getKey())
						.setDouble("context", context)
						.setDouble("setSeq",setSeq)
						.list().get(0) ;
		if(setCount>0){
			name = name+"_"+setCount;
		}
		
		return name;
	}


	public static List<String> getEndingFields(Double setRef, int lastPos) {
		List<String> fieldNames = new ArrayList<String>();
		  BaselineSetfldord crit = new BaselineSetfldord();
		    crit.setContext(setRef);
		    List<BaselineSetfldord> fields  = HibernateUtil.findByExampleAndSort(crit, Order.asc("fldordno"));
		    for(BaselineSetfldord field : fields){
		    	if(field.getFldordno()>lastPos && (isMandatoryField(field) /*|| hasHeader */)){
		    		BaselineSetfield cripwet = new BaselineSetfield();
		    		cripwet.setContext(field.getKey());
		        	List<BaselineSetfield> alternatives = HibernateUtil.findByExample(cripwet);
		        	String name = getElementNameForField(field);
		    		if(name!=null){
		    			fieldNames.add(name+":"+getFfirnFudn(alternatives.get(0))+":"+field.getFldcol()+":"+field.getFldordno().intValue()+":"+getElementAlternativeForField(field,alternatives.get(0),setRef));
			    		
		    		} else {
		    			fieldNames.add(getElementAlternativeForField(field,alternatives.get(0),setRef)+":"+getFfirnFudn(alternatives.get(0))+":"+field.getFldcol()+":"+field.getFldordno().intValue());
			    		
		    		}
		    	
		    	}
		    }
		    
		    
		return fieldNames;
	}

	public static String getFfirnFudn(BaselineSetfield alternative) {

		BaselineFudbasic fudbasic = (BaselineFudbasic) HibernateUtil.currentSession().get(BaselineFudbasic.class, alternative.getFudn());

		BaselineFfirnbasic ffirn = (BaselineFfirnbasic) HibernateUtil.currentSession().get(BaselineFfirnbasic.class, fudbasic.getContext());
	
		return ffirn.getFfirn()+"-"+fudbasic.getFudn();
	}
	

	public static boolean isConditional(BaselineSetfldord fieldDef) {
	   return isConditional(fieldDef.getFieldcond());
	}


	private static boolean isConditional(String s) {
		return s!=null && "C".equals(s);
	}


	
	/**
	 * 
	 *        Note that most field contents have blank characters added to the data
				codes to provide the desired tabular alignment. In some cases, the blank
				characters follow the data codes (50CAL        ); in others, the blank characters
				precede the data codes ( 30000). These data codes are, respectively,
				LEFT-JUSTIFIED and RIGHT-JUSTIFIED. The number of character posi-
				tions assigned to each field position of a columnar set and the justification of
				data codes within the fields are prescribed by the set format and explained
				further in Chapter 5.

	 */
	/**
	 * Les colones sont justifié a gauche
	 * La tailles et la taille de l'alternative la plus grandes
	 */
	
	public static void trimField(Set set,Field field, String ffSeq, String[] ffirnFudn) {
		
		BaselineSetbasic setBasic  = new BaselineSetbasic();
		setBasic.setSetid(set.getIdentifier());

		setBasic = (BaselineSetbasic) HibernateUtil.findByExample(setBasic).get(0);
		

		BaselineSetfldord fieldDef = new BaselineSetfldord();
		fieldDef.setContext(setBasic.getKey());
		fieldDef.setFldordno(Double.parseDouble(ffSeq));
	    
	  
		fieldDef = HibernateUtil.findByExample(fieldDef).get(0);
	    
		BaselineSetfield crit = new BaselineSetfield();
	  	crit.setContext(fieldDef.getKey());
    	List<BaselineSetfield> alternatives = HibernateUtil.findByExample(crit);
    	String fudjustify = "L";
		for (BaselineSetfield alternative : alternatives) {
    	
    		BaselineFudbasic fudbasic = (BaselineFudbasic) HibernateUtil.currentSession().get(BaselineFudbasic.class, alternative.getFudn());
    		BaselineFfirnbasic ffirn = (BaselineFfirnbasic) HibernateUtil.currentSession().get(BaselineFfirnbasic.class, fudbasic.getContext());
    		if(ffirn.getFfirn().equals(ffirnFudn[0])
    				&& fudbasic.getFudn().equals(ffirnFudn[1])){
    			fudjustify =  alternative.getFudjustify();
    			debug("Should justify:"+fudjustify);
    			field.setJustify(fudjustify);
    			field.setSize(Integer.parseInt(fudbasic.getFudmax()));
    			return;
    		}
    		
		}

	}
	
	
	public static Header[] getColumnHeaders(Set set) {
		BaselineSetbasic setBasic  = new BaselineSetbasic();
		setBasic.setSetid(set.getIdentifier());

		setBasic = (BaselineSetbasic) HibernateUtil.findByExample(setBasic).get(0);
		

		BaselineSetfldord fieldDef = new BaselineSetfldord();
		fieldDef.setContext(setBasic.getKey());
	
    	List<BaselineSetfldord> fields = HibernateUtil.findByExample(fieldDef);
    	
    	Header[] headers = new Header[fields.size()];
    	int i=0;
    	for(BaselineSetfldord field : fields){
    		headers[i++]  = new Header(field.getFldcol().toUpperCase());
    	}
    	
		return headers;
	}



	public static String getSegmentNameForSet(BaselineMsgsetord setDef) {
		if(isSegmentStarter(setDef)){
			return getElementNameForSet(setDef);
		} else {
			BaselineMsgsetord crit = new BaselineMsgsetord();
			crit.setContext(setDef.getContext());
			List<BaselineMsgsetord> sets = HibernateUtil.findByExampleAndSort(crit, Order.asc("setordno"));
			BaselineMsgsetord seg = null;
			for(BaselineMsgsetord set : sets){
				
				if(set.getStrtbraket()!=null){
						seg = set;
				}

				if(set.getKey() == setDef.getKey()){
						return getElementNameForSet(seg);
				}
				
				//On decremente seulement aprés
				if(set.getStopbraket()!=null ){
					seg = null;
				}
				
			}
			
			
		}
		
		return null;
	}


	






}
