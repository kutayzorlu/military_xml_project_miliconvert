package org.miliconvert.otg.service.initialiser;

import org.miliconvert.otg.model.MTFFormatDefinition;
import org.miliconvert.otg.model.MTFSegmentDefinition;
import org.miliconvert.otg.model.MTFSetDefinition;

/**
 * 
 * @author matthieu
 *
 */
public interface MTFFormatContentHandler {

	public void startSegment(MTFSegmentDefinition segmentDefinition);

	public void addSet(MTFSetDefinition setDefinition);

	public void closeCurrentSegment();

	public void start(String format);

	public void end();

	public MTFFormatDefinition getMTFFormatDefinition();

}
