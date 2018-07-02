package org.miliconvert.xsmt.mpgt.converters;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.emf.ecore.xml.type.internal.XMLCalendar;
import org.miliconvert.xsmt.mpgt.IDataConverter;

public class XMLGregorianCalendarConverter implements IDataConverter {

	@Override
	public Object convert(String value) throws Exception {
		//Value : YYYY-MM-DDThh:mm:ss 
		//090912ZDEC1996
		Date date = null;
		try{
			SimpleDateFormat format = new SimpleDateFormat("ddhhmmZMMMyyyy");
			date  = format.parse(value);
		} catch (Exception e) {
			SimpleDateFormat format = new SimpleDateFormat("ddmmyyyy");
			date  = format.parse(value);
		}
		
		
		
		return new XMLCalendar(date,XMLCalendar.DATE);
	}

}
