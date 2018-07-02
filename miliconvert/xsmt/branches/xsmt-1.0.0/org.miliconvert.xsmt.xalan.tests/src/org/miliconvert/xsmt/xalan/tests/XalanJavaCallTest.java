/* ***** BEGIN LICENSE BLOCK *****
 * Version: GPL 2.0
 *
 * The contents of this file are subject to the GNU General Public
 * License Version 2 or later (the "GPL").
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 * The Initial Developer of the Original Code is
 *   BT Global Services / Etat  français  Ministre de la Défense
 *
 * ***** END LICENSE BLOCK ***** */

package org.miliconvert.xsmt.xalan.tests;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;

import javax.xml.transform.ErrorListener;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import junit.framework.TestCase;

import org.miliconvert.xsmt.utils.DOMUtils;

public class XalanJavaCallTest extends TestCase implements ErrorListener {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		System.setProperty("javax.xml.transform.TransformerFactory",
				"org.apache.xalan.processor.TransformerFactoryImpl");
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	private void transformWithXSL(String xsl) throws Exception {
		TransformerFactory factory = TransformerFactory.newInstance();

		factory.setErrorListener(this);

		Source stylesheet = new StreamSource(new FileInputStream(xsl));
		Source input = new DOMSource(DOMUtils.parse(new FileInputStream(
				"test-data/path.xml")));
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		Result output = new StreamResult(out);

		Transformer tf = factory.newTransformer(stylesheet);
		tf.setErrorListener(this);
		tf.setOutputProperty(OutputKeys.INDENT, "yes");
		long time = System.currentTimeMillis();
		tf.transform(input, output);
		time = System.currentTimeMillis() - time;
		System.out.println(out.toString());
		System.out.println("transformation done in " + time + "ms");
	}

	public void testTransformClassic() throws Exception {
		transformWithXSL("test-data/replace-classic.xsl");
		transformWithXSL("test-data/replace-classic.xsl");
		transformWithXSL("test-data/replace-classic.xsl");
		transformWithXSL("test-data/replace-classic.xsl");
	}

	public void testTransformXSMT() throws Exception {
		transformWithXSL("test-data/replace.xsl");
		transformWithXSL("test-data/replace.xsl");
		transformWithXSL("test-data/replace.xsl");
	}

	public void error(TransformerException exception)
			throws TransformerException {
		System.err.println("xsl error: " + exception.getMessage());
		exception.getCause().printStackTrace();
		fail("error");
	}

	public void fatalError(TransformerException exception)
			throws TransformerException {
		System.err.println("xsl fatal: " + exception.getMessage());
		exception.getCause().printStackTrace();
		fail("fatal error");
	}

	public void warning(TransformerException exception)
			throws TransformerException {
		System.err.println("xsl warning: " + exception.getMessage());
	}

}
