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

package org.miliconvert.xsmt.engine;

import java.io.File;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

/**
 * TODO Try to find a way that does not involve direct xerces class import...
 * 
 * @author Thomas Cataldo
 * 
 */
public class ValidatingParser  {

	private SchemaFactory sf;

	public ValidatingParser() {
		sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
	}

	public boolean isValid(IReadable read, String schemaPath)
			throws EngineException {
		try {
			Schema s = sf.newSchema(new StreamSource(new File(schemaPath)));
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			dbf.setNamespaceAware(true);
			dbf.setSchema(s);
			DocumentBuilder db = dbf.newDocumentBuilder();
			
			ErrorHandler eh = new ErrorHandler() {

				public void error(SAXParseException exception)
						throws SAXException {
					throw exception;
				}

				public void fatalError(SAXParseException exception)
						throws SAXException {
					throw exception;
				}

				public void warning(SAXParseException exception)
						throws SAXException {
					System.err.println("warning: "+exception.getMessage()); //$NON-NLS-1$
				}
				
			};
			db.setErrorHandler(eh);
			db.parse(read.read());
			return true;
		} catch (SAXException se) {
			return false;
		} catch (Exception e) {
			throw new EngineException(e.getMessage(), e);
		}
	}


}
