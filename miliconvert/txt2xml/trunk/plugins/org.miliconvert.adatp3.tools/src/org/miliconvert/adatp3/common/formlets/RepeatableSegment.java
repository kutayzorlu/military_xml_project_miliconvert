package org.miliconvert.adatp3.common.formlets;


/**
 * 
 * @author ngapaillard
 *
 * @param <T> the type return for segment representation.
 */
public interface RepeatableSegment<T> {

	/**
	 * retrieve all repeatable segments from the mapping.
	 * @return T all repeatable segments.
	 */
	public T getRepeatableSegments();
	
	
}
