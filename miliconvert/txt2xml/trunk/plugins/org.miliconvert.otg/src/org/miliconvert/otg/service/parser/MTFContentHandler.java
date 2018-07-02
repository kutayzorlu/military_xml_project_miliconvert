package org.miliconvert.otg.service.parser;

import org.miliconvert.otg.model.MTF;
import org.miliconvert.otg.model.MTFSet;


/**
 * Event consumer for the {@link MTFParser}
 * 
 * @author Matthieu
 * 
 */
public interface MTFContentHandler {

	public void start();

	public void end();

	public MTF getMtfDocument();

	public void addSet(MTFSet set) throws MTFParserException;

	
	
}
