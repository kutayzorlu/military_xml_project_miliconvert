package org.miliconvert.adatp3.common.formlets;

import java.util.TreeMap;


/**
 * A sequence is severals sets injected in a TreeMap, 
 * the identifier is the sequence number retrievable in the mapping. 
 * Why a TreeMap ? Because we have to order the sets.
 * 
 * @author ngapaillard.
 *
 */
public class Sequence {


	private TreeMap<Integer,SetCouple> sets;

	/**
	 * Default constructor.
	 */
	public Sequence(){
		sets=new TreeMap<Integer,SetCouple>(new IntegerComparator());
	}

	/**
	 * Constructor of Sequence.
	 * @param sets the fields to import.
	 */
	public Sequence(TreeMap<Integer,SetCouple> sets){
		
		this.sets=new TreeMap<Integer,SetCouple>(new IntegerComparator());
		this.sets.putAll(sets);
	}

	/**
	 * Add a fieldCouple with the sequence identifier.
	 * @param sequence the sequence identifier for the specified fieldCouple.
	 * @param sets a pair of value with a string identifier and a depth.
	 */
	public void add(Integer sequence,SetCouple sets){
		this.sets.put(sequence,sets);
	}
	
	/**
	 * Return the size of the fields.
	 * @return size the size of the fields.
	 */
	public Integer size(){
		return this.sets.size();
	}
	
	/**
	 * Give the fields included in this class
	 * @return fields a TreeMap containing the fields included in this class.
	 */
	public TreeMap<Integer,SetCouple> getSets(){
		return sets;
	}

	/**
	 * Two sequence are equals if and only if the sets TreeMap are equaled. (Same sets in the same order).
	 */
	@Override
	public boolean equals(Object o1){
		if(null!=o1 && (o1 instanceof Sequence) && (o1==this || ((Sequence)o1).getSets().equals(this.getSets())) ){
			return true;
		}
		return false;
	}
}
