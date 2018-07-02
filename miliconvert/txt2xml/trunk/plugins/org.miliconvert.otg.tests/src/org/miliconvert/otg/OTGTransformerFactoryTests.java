package org.miliconvert.otg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.miliconvert.otg.tools.SchemaGenerator;
import org.miliconvert.otg.utils.DOMUtils;
import org.miliconvert.txt2xml.transform.ITransformer;
import org.miliconvert.xsmt.engine.EngineException;
import org.miliconvert.xsmt.engine.IReadable;
import org.miliconvert.xsmt.engine.ValidatingParser;
import org.w3c.dom.Document;

/**
 * 
 * @author matthieu
 *
 */
public class OTGTransformerFactoryTests extends AbstractBaseTestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		for(String format : MTFFormatRegister.registeredFormats){
			SchemaGenerator generator = new SchemaGenerator(format);
			DOMUtils.serialise(generator.generate(), new FileOutputStream("/tmp/"+format+".xsd"));
			
		}
	}
	
	public void testTransformContactReport() throws Exception {
		OTGTransformerFactory factory = new OTGTransformerFactory();
		ITransformer t1 = factory.getDescriptor(OTGTransformerFactory.CONTACT_REPORT_TO_XML)
		.createInstance();
		ITransformer t2 = factory.getDescriptor(OTGTransformerFactory.CONTACT_REPORT_TO_TXT)
		.createInstance();
		
		assertTransfo(t1,t2,"contactreport1.mtf",MTFFormatRegister.CONTACT_REPORT_FORMAT);
		assertTransfo(t1,t2,"contactreport2.mtf",MTFFormatRegister.CONTACT_REPORT_FORMAT);
		assertTransfo(t1,t2,"contactreport3.mtf",MTFFormatRegister.CONTACT_REPORT_FORMAT);
		assertTransfo(t1,t2,"contactreport4.mtf",MTFFormatRegister.CONTACT_REPORT_FORMAT);
		assertTransfo(t1,t2,"dga1.mtf",MTFFormatRegister.CONTACT_REPORT_FORMAT);
		assertTransfo(t1,t2,"dga2.mtf",MTFFormatRegister.CONTACT_REPORT_FORMAT);
		
	}
	
	public void testTransformOpNoteReport() throws Exception {
		OTGTransformerFactory factory = new OTGTransformerFactory();
		ITransformer t1 = factory.getDescriptor(OTGTransformerFactory.OPNOTE_TO_XML)
		.createInstance();
		ITransformer t2 = factory.getDescriptor(OTGTransformerFactory.OPNOTE_TO_TXT)
		.createInstance();
		
		assertTransfo(t1,t2,"opnote1.mtf",MTFFormatRegister.OPNOTE_FORMAT);
		assertTransfo(t1,t2,"opnote2.mtf",MTFFormatRegister.OPNOTE_FORMAT);
		assertTransfo(t1,t2,"opnote3.mtf",MTFFormatRegister.OPNOTE_FORMAT);
		
		
	}
	
	public void testTransform4WhiskyReport() throws Exception {
		OTGTransformerFactory factory = new OTGTransformerFactory();
		ITransformer t1 = factory.getDescriptor(OTGTransformerFactory.FOUR_WHISKY_TO_XML)
		.createInstance();
		ITransformer t2 = factory.getDescriptor(OTGTransformerFactory.FOUR_WHISKY_TO_TXT)
		.createInstance();
		
		assertTransfo(t1,t2,"4whisky1.mtf",MTFFormatRegister.FOURWHISKY_FORMAT);
		
	}
	

	private void assertTransfo(ITransformer t1, ITransformer t2, String fileName,String formatName) throws Exception {
		Document dom = t1.transform(getTestFile(fileName));
		File tm = File.createTempFile("test", ".xml");
		DOMUtils.serialise(dom, new FileOutputStream(tm));
		logDom(dom);
		ValidatingParser vp = new ValidatingParser();
		
		assertTrue(vp.isValid(getReadable(tm.getPath()),
		"/tmp/"+formatName+".xsd"));
		
		
		String ret = logFile(t2.transform(dom));
		String org = logFile(getTestFile(fileName));
		
		System.out.println("ret: "+ret+" \norg: "+org);
		
		assertTrue(ret.trim().equals(org.trim()));
	}

	private String logFile(InputStream in) throws IOException {
		StringBuffer ret = new StringBuffer();
		BufferedReader reader  =  new BufferedReader(new InputStreamReader(in));
		String line = null;
	    while ((line = reader.readLine()) != null) {
	    	if(line.trim().length()>0)
	    	ret.append(line).append(line.length()).append("\n");
	    }
	    return ret.toString();
		
	}

	protected IReadable getReadable(final String path) {
		try {
			return getReadableFromStream(new FileInputStream(path));
		} catch (FileNotFoundException e) {
			return null;
		}
	}


	protected IReadable getReadableFromStream(final InputStream in) {
		return new IReadable() {

			public InputStream read() throws EngineException {
				return in;
			}
		};
	}
}
