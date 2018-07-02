package org.miliconvert.xsmt.mpgt.converters;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import mpia.meta.MetaFactory;
import mpia.meta.TypeDataTypeDateHeure;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xml.type.internal.XMLCalendar;
import org.miliconvert.xsmt.mpgt.IDataConverter;

public class TypeDataTypeDateHeureConverter implements IDataConverter {

	@Override
	public EObject convert(String value) throws Exception {
		TypeDataTypeDateHeure obj = MetaFactory.eINSTANCE.createTypeDataTypeDateHeure();

		
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
		
		
		obj.setDate( new XMLCalendar(date,XMLCalendar.DATE));
		obj.setAnnee( new XMLCalendar(date,XMLCalendar.GYEAR));
		obj.setAnneeMois(new XMLCalendar(date,XMLCalendar.GYEARMONTH));
		obj.setDateHeure(new XMLCalendar(date,XMLCalendar.DATETIME));
		obj.setHeure(new XMLCalendar(date,XMLCalendar.TIME));
		
		return obj;
	}

	
	
}
