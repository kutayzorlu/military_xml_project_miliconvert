package org.miliconvert.adatp3.common.formlets;

import java.util.ArrayList;
import java.util.List;
import java.util.NavigableSet;


/**
 * This class is a specialization of Sequence including Segment notion representation.
 * It has the number identifier of the start sequence for more convenient use.
 * @author ngapaillard
 *
 */
public class SegmentSequence extends Sequence implements RepeatableSegment<List<SegmentSequence>>{


	private Integer startSequence=null;

	/**
	 * Default constructor.
	 */
	public SegmentSequence(){
		super();
	}

	/**
	 * Retrieve the sequence number of the first sequence.
	 * @return the sequence number of the first sequence.
	 */
	public Integer getStartSequenceNumber() {
		return startSequence;
	}

	/**
	 * @see Sequence#add(Integer, SetCouple)
	 */
	@Override
	public void add(Integer sequence,SetCouple set){
		if(startSequence==null){
			startSequence=sequence;
		}
		super.add(sequence, set);
	}

	/**
	 * say if the field is the first element inside the current Sequence .
	 * @param set the field which is represent by identifier and depth.
	 * @return true if the field is the first elements inside the current sequence else false.
	 */
	public boolean matchFirst(SetCouple set){
		return set.equals(super.getSets().firstEntry().getValue());
	}


	/**
	 * say if the set is the first element inside the current Sequence .
	 * @param set the set to retrieve.
	 * @return true if the field is the first elements inside the current sequence else false.
	 */
	public boolean matchFirst(Set set){
		return set.equals(super.getSets().firstEntry().getValue());
	}
	
	/**
	 * say if the set is inside the current sequence.
	 * @param set the set to match.
	 * @return true if the set is matched.
	 */
	public boolean matchAnyInSequence(Set set){

		for(SetCouple couple:super.getSets().values()){
			if(set.getIdentifier().equalsIgnoreCase(couple.getId())){
				return true;
			}
		}
		return false;

	}

	/**
	 * say if the fields match the firsts elements inside the current Sequence.
	 * @param field the field which is represent by identifier and depth.
	 * @return true if the fields are the firsts elements inside the current sequence else false.
	 */
	public boolean matchFirst(List<SetCouple> fields ){

		if(null==super.getSets() || fields.size()>super.getSets().values().size()){
			return false;
		}else{
			SetCouple[] fieldsArray=fields.toArray(new SetCouple[0]);
			SetCouple[] currentFields=super.getSets().values().toArray(new SetCouple[0]);
			for(int i=0;i<fieldsArray.length;i++){
				if(!fieldsArray[i].equals(currentFields[i])){
					return false;
				}
			}
		}
		return true;

	}

	/**
	 * Return all repeatable SetSequence existing in the fields
	 * @return repeatableMappingElements a list containing SequenceMappingElements which are repeatable.
	 */
	@Override
	public List<SegmentSequence> getRepeatableSegments() {


		//the list which will contain all repeatable sequence parts
		ArrayList<SegmentSequence> repeatableSetSequence=new ArrayList<SegmentSequence>();
		
		//retrieving all elements ordered.
		NavigableSet<Integer> fieldElements=super.getSets().navigableKeySet();
		
		//special class which will contain one repeatable sequence part.
		SegmentSequence elements=new SegmentSequence();
		
		Integer previousSequence=null;
		
		
		
		for(Integer fieldSequence:fieldElements){

			if(previousSequence!=null && super.getSets().get(fieldSequence).getDepth()>super.getSets().get(previousSequence).getDepth()){
				/**
				 * If start sequence is not defined in elements, 
				 * it means that the start sequence has never been added.
				 * And that we have to insert in the map the previous sequence as root sequence.
				 */
				elements.add(fieldSequence,super.getSets().get(fieldSequence));

			}else{
				if(elements.size()>1){
					
					repeatableSetSequence.add(elements);
				}

				elements=new SegmentSequence();
			}
			previousSequence=fieldSequence;

		}

		return repeatableSetSequence;

	}
	
	/**
	 * Two sets are equals if their fields are identical.
	 */
	@Override
	public boolean equals(Object o1){
		if(null!=o1 && (o1 instanceof SegmentSequence) && (o1==this || ((SegmentSequence)o1).getSets().equals(this.getSets())) ){
			return true;
		}
		return false;
	}

}
