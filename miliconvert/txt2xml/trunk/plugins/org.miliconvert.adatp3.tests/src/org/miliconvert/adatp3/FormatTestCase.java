package org.miliconvert.adatp3;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import junit.framework.TestCase;

import org.miliconvert.txt2xml.transform.ITransformer;
import org.miliconvert.txt2xml.transform.ITransformerDescriptor;
import org.miliconvert.xsmt.engine.EngineException;
import org.miliconvert.xsmt.engine.IReadable;
import org.w3c.dom.Document;

public abstract class FormatTestCase extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	protected InputStream getTestFile(String fname)
			throws FileNotFoundException {
		return new FileInputStream("data/" + fname);
	}

	protected ITransformer getTransformer(String transformerName) {
		ITransformerDescriptor ato = new Adatp3TransformerFactory()
				.getDescriptor(transformerName);
		ITransformer tx = ato.createInstance();
		return tx;
	}

	protected void serialise(Document doc, OutputStream out, boolean pretty)
			throws TransformerException {
		TransformerFactory fac = null;
		fac = TransformerFactory.newInstance();
		Transformer tf = fac.newTransformer();
		if (pretty) {
			tf.setOutputProperty(OutputKeys.INDENT, "yes");
		} else {
			tf.setOutputProperty(OutputKeys.INDENT, "no");
		}
		Source input = new DOMSource(doc.getDocumentElement());
		Result output = new StreamResult(out);
		tf.transform(input, output);
	}

	protected void serialise(Document doc, OutputStream out)
			throws TransformerException {
		serialise(doc, out, false);
	}

	protected void logDom(Document doc) throws TransformerException {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		serialise(doc, out, true);
		System.out.println(out.toString());
	}
	
	protected void assertFilesSimilar(InputStream in1, InputStream in2) {
		// TODO azeaze
		
	}
	
	

	protected String logFile(InputStream in) throws IOException {
		StringBuffer ret = new StringBuffer();
		BufferedReader reader  =  new BufferedReader(new InputStreamReader(in));
		String line = null;
	    while ((line = reader.readLine()) != null) {
	    	if(line.trim().length()>0)
	    	ret.append(line+"\n");
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
