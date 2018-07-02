package org.miliconvert.adatp3.xml;

import java.util.List;

import org.miliconvert.adatp3.common.formlets.Set;

/**
 * 
 * @author matthieu
 * Simple validation of ad3 input files
 */
public interface ISetValidator {

	void validate(List<Set> sets);

}
