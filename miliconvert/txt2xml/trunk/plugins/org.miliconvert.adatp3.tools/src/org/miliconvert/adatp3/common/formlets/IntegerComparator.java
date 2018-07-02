package org.miliconvert.adatp3.common.formlets;

import java.util.Comparator;

/**
 * Comparator for order fields with the sequence id.
 * @author ngapaillard
 *
 */
public class IntegerComparator implements Comparator<Integer>{

	
	@Override
	public int compare(Integer seq1, Integer seq2) {
		return seq1-seq2;
	}

}
