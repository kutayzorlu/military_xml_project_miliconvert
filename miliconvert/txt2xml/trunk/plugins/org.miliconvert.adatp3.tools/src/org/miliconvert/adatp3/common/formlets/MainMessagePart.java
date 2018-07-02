package org.miliconvert.adatp3.common.formlets;

import java.util.LinkedList;
import java.util.List;

/**
 * AdatP3 messages main part
 * 
 * @author tom
 *
 */
public class MainMessagePart {

	private List<Set> sets;

	public MainMessagePart() {
		sets = new LinkedList<Set>();
	}

	public void addSet(Set s) {
		sets.add(s);
	}

	public List<Set> getSets() {
		return sets;
	}

}
