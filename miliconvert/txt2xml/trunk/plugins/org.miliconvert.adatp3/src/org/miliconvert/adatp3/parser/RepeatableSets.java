package org.miliconvert.adatp3.parser;

import java.util.List;

import org.miliconvert.adatp3.common.formlets.Couple;
import org.miliconvert.adatp3.common.formlets.Set;

public interface RepeatableSets {

	/**
	 * return a list of repeatable sets.
	 * @return list of repeatable sets.
	 */
	public List<Couple<Set,Integer>> getRepeatableSet();
	
	
}
