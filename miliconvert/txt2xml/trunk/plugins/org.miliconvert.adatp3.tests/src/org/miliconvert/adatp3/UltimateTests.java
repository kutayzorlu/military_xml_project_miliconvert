package org.miliconvert.adatp3;

import java.io.BufferedWriter;
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
import org.miliconvert.adatp3.common.utils.StringUtils;
import org.miliconvert.adatp3.hibernate.BaselineConstants;
import org.miliconvert.adatp3.tools.hibernate.SampleGenerationTool;
import org.miliconvert.adatp3.tools.hibernate.XsdGenerationTool;
import org.miliconvert.txt2xml.transform.ITransformer;
import org.miliconvert.txt2xml.transform.ITransformerFactory;
import org.miliconvert.xsmt.engine.ValidatingParser;
import org.miliconvert.xsmt.utils.DOMUtils;
import org.w3c.dom.Document;

/**
 * 
 * @author matthieu
 *
 */
public class UltimateTests extends FormatTestCase {

	public void testAllBaseline() throws Exception{
		

		try {
			
			ITransformerFactory factory = new Adatp3TransformerFactory();
			Collection<String> mappings  = factory.getSupportedTransformers();

			List<String> failed = new ArrayList<String>();
			
		
			int count =0;
			
			for (String mapping : mappings) {
				String  messageId = mapping.replace("ToXml", "").toUpperCase();
				
						
				
					Document doc = null;
				    InputStream in =  null ;
				    String sample = null;
					try {    
					    System.out.println("Loading "+mapping);
					    ITransformer tx = factory.getDescriptor(mapping).createInstance();
						assertNotNull(tx);
						String baseline ;
						String transString ;
						   if(tx instanceof BL12ToXmlTransformer){
							   sample = SampleGenerationTool.createSampleFile(messageId,BaselineConstants.BL12);
							   baseline = "bl12";
							   transString = Adatp3TransformerFactory.B12XML_TO_TXT;
						   } else if(tx instanceof BL11ToXmlTransformer) {
							   transString = Adatp3TransformerFactory.B11XML_TO_TXT;
							   baseline = "bl11";
							   sample = SampleGenerationTool.createSampleFile(messageId,BaselineConstants.BL11);
						   } else {
							   continue;
						   }
						
						
							
							File smplFile = new File("data/"+baseline+"/samples/"+messageId.toLowerCase()+".adapt3");
							BufferedWriter out = new BufferedWriter(new FileWriter(smplFile));
							out.write(sample);
							out.close();
							
							in = new FileInputStream(smplFile);
							
	    					doc = tx.transform(in);
							assertNotNull(doc);
							//logDom(doc);
							
							File tm = new File("data/"+baseline+"/xml/"+messageId.toLowerCase()+".xml");
							DOMUtils.serialise(doc, new FileOutputStream(tm));
							
							XsdGenerationTool xsdTool = new XsdGenerationTool();
							//xsdTool.generate(messageId, baseline, "data/"+baseline+"/xsd");
							xsdTool.generate(messageId, baseline, "/opt/workspace/miliconvert/xsmt-docs/trunk/testing/xsd/"+baseline+"");
						
							ValidatingParser vp = new ValidatingParser();
									
							assertTrue(vp.isValid(getReadable(tm.getPath()),
										"data/"+baseline+"/xsd/"+messageId.toLowerCase()+"/messages.xsd"));
								
							 
							tx = factory.getDescriptor(transString).createInstance();
							
							String ret = logFile(tx.transform(doc));		
							String org = sample;
	
							System.out.println("\n RES:"+ret.replace("\n", "")+"\n ORG:"+org.replace("\n", ""));
							if(!ret.replace(" ", "").equals(org.replace(" ", ""))){
								failed.add(mapping);
								System.out.println("\nERROR\n DIFF:\n"+StringUtils.difference(org.replace(" ", ""),ret.replace(" ", "")));
								
							//	System.out.println("\nERROR\n RES:"+ret.replace("\n", "").replace(" ", "")+"\n ORG:"+org.replace("\n", "").replace(" ", ""));
							} else {
								count++;
							}
						
					    
				
					} catch (Throwable e) {
						e.printStackTrace();
						failed.add(mapping+" "+e.toString());
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
		
		
			for (Iterator<String> iterator = failed.iterator(); iterator.hasNext();) {
				String string = (String) iterator.next();
				System.out.println("failed:"+string);
			}
			
			
			
			System.out.println("Success: "+count+" Failed: "+failed.size());
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("transformation failed");
		}
	
		
	


}

	
	

}
