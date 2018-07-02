package org.miliconvert.adatp3.common.formlets;



/**
 * This class permits to represent a set from the mapping by a couple of values (id/depth).
 * The id is for example (MSGID)
 * The depth is the depth of the set inside the mapping.
 * @author ngapaillard
 *
 */
public class SetCouple extends Couple<String,Integer>{
	
	
	/**
	 * Default constructor
	 * @param idSet the id string of the field
	 * @param depthSet the depth corresponding to this field.
	 */
	public SetCouple(String idSet,Integer depthSet){
		
		super(idSet,depthSet);
	}

	/**
	 * give the id of the field.
	 * @return id the id (for example: MSGID)of the field.
	 */
	public String getId() {
		return super.getObject1();
	}

	/**
	 * give the depth of field
	 * @return depth the depth (for example: 1) of the field.
	 */
	public Integer getDepth() {
		return super.getObject2();
	}
	
	/**
	 * Two sets are strictly identical if and only if their have the same uuid (if it's the same instance so).
	 */
	@Override
	public boolean equals(Object o1){
		if(o1==null){
			return false;
		}else{
			if(o1==this){
				return true;
			}
			if(o1 instanceof SetCouple
					&& ((SetCouple)o1).getId().equals(this.getId())
					&& ((SetCouple)o1).getDepth().equals(this.getDepth())){
				return true;
			}
		}
		return false;
	}
	
	

}
