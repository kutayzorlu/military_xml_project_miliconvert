package org.miliconvert.adatp3;

import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.miliconvert.adatp3.bl11.BL11ToXmlTransformer;
import org.miliconvert.adatp3.bl12.BL12ToXmlTransformer;
import org.miliconvert.adatp3.common.baseline.BaselineHibernateUtil;
import org.miliconvert.adatp3.common.utils.DOMUtils;
import org.miliconvert.adatp3.hibernate.BaselineConstants;
import org.miliconvert.adatp3.tools.hibernate.SampleGenerationTool;
import org.miliconvert.adatp3.tools.hibernate.XsdGenerationTool;
import org.miliconvert.txt2xml.transform.ITransformer;
import org.miliconvert.txt2xml.transform.ITransformerFactory;
import org.miliconvert.xsmt.engine.ValidatingParser;
import org.w3c.dom.Document;

public class TestHibernateConnection  extends FormatTestCase {
	
	public void testSampleMessage() throws Exception{

			//System.out.println(SampleGenerationTool.createSampleFile("ACO",BaselineConstants.BL12));
			System.out.println(SampleGenerationTool.createSampleFile("NUC1",BaselineConstants.BL12));
			/*
			System.out.println(SampleGenerationTool.createSampleFile("LOGSITLAND"));
			System.out.println(SampleGenerationTool.createSampleFile("ENGSTATREP"));
			System.out.println(SampleGenerationTool.createSampleFile("ENGRDATAREP"));
			engrdatarepToXml
			engrresrepToXml
			logsitlandToXml */
	
	}
	
	public void testXsdMessage() throws Exception{
		XsdGenerationTool tool = new XsdGenerationTool();
		tool.generate("ACO", BaselineConstants.BL12, "data/bl11/xsd");
	
}
	
	
	/*
ARINFO/EXXON 11/AR123HA/37700/NAME:BUICK/170/ARCT:141325Z
/NDAR:141400ZFEB/KLBS:15.0/PFREQ:243.0/SFREQ:121.5/ACTYP:KC135R/BOM/
/1,3/16-72/4-3-1//
	*/
	/*
	 *  Not Found :nuc1
		Not Found :nuc3
		Not Found :nuc2
	 */
	
	/*
	 * Not Found :navsitrep
	 * Not Found :aco
	 */
	
	//TEst repeatable group : engrdatarepToXml
	//atoToXml EMCON
	
	
	public void testMessageContainingRepeteableGroup() throws Exception{
		ITransformerFactory factory = new Adatp3TransformerFactory();
		Document doc = null;
	    InputStream in =  null ;
	    String sample = null;
		try {    
		    System.out.println("Loading locatorToXml");
		    ITransformer tx = factory.getDescriptor("navsitrepToXml").createInstance();
			assertNotNull(tx);
			
				sample = SampleGenerationTool.createSampleFile("NAVSITREP",BaselineConstants.BL12);
				in = new ByteArrayInputStream(sample.getBytes());
				
				doc = tx.transform(in);
				assertNotNull(doc);
				logDom(doc);
		
				tx = factory.getDescriptor(Adatp3TransformerFactory.B12XML_TO_TXT).createInstance();
				
				String ret = logFile(tx.transform(doc));		
				String org = sample;

				System.out.println("\n"+ret+"\n"+org);
				
			
		    
	
		} catch (Throwable e) {
			e.printStackTrace();
			if(doc!=null){
				logDom(doc);
			}
			System.out.println(sample);
		} finally {
			if(in!=null){
				in.close();
			}
		}
		
	}
	
}
