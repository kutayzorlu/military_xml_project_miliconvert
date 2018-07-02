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

package org.miliconvert.xsmt.engine.tests;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.parsers.ParserConfigurationException;

import org.miliconvert.xsmt.engine.Engine;
import org.miliconvert.xsmt.engine.EngineException;
import org.miliconvert.xsmt.engine.ValidatingParser;
import org.miliconvert.xsmt.engine.XSLTGenerator;
import org.miliconvert.xsmt.tmodel.TModel;
import org.miliconvert.xsmt.tmodel.TModelException;
import org.xml.sax.SAXException;

public class MpgtToAdatp3EngineTests extends AbstractEngineTest {

	
	public void testEngine() {
		try {
			new Engine(loadTModel("test-data/tmodel_aco_to_mpgt.xml"));
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	public void testRunAcoToMpgt() throws FileNotFoundException, SAXException,
			IOException, ParserConfigurationException,
			FactoryConfigurationError, TModelException {
		
			
		String dom = runFiles("test-data/tmodel_aco_to_mpgt.xml",
				"test-data/ad3/aco.xml");
		
		
		ValidatingParser vp = new ValidatingParser();
		try {
			boolean valid = vp.isValid(getReadableFromDomString(dom),
					"test-data/mpgt/mpgt_v317.xsd");
			assertTrue(valid);
		} catch (EngineException e) {
			e.printStackTrace();
			fail("generated mpgt did not validate");
		}
	}

	public void testRunOwnToMpgt() throws FileNotFoundException, SAXException,
			IOException, ParserConfigurationException,
			FactoryConfigurationError, TModelException {
		String dom = runFiles("test-data/tmodel_own_to_mpgt.xml",
				"test-data/ad3/ownsitrep.xml");
		ValidatingParser vp = new ValidatingParser();
		try {
			boolean valid = vp.isValid(getReadableFromDomString(dom),
					"test-data/mpgt/mpgt_v317.xsd");
			assertTrue(valid);
		} catch (EngineException e) {
			e.printStackTrace();
			fail("generated mpgt did not validate");
		}
	}
	
	public void testRunEnsitrepToMpgt() throws FileNotFoundException, SAXException,
		IOException, ParserConfigurationException,
		FactoryConfigurationError, TModelException {
		String dom = runFiles("test-data/tmodel_ensitrep_to_mpgt.xml",
				"test-data/ad3/ensitrep.xml");
		ValidatingParser vp = new ValidatingParser();
		try {
			boolean valid = vp.isValid(getReadableFromDomString(dom),
					"test-data/mpgt/mpgt_v317.xsd");
			assertTrue(valid);
		} catch (EngineException e) {
			e.printStackTrace();
			fail("generated mpgt did not validate");
		}
	}
	
	
	public void testRunNavsitsumToMpgt() throws FileNotFoundException, SAXException,
		IOException, ParserConfigurationException,
		FactoryConfigurationError, TModelException {
		String dom = runFiles("test-data/tmodel_navsitsum_to_mpgt.xml",
				"test-data/ad3/navsitsum.xml");
		ValidatingParser vp = new ValidatingParser();
		try {
			boolean valid = vp.isValid(getReadableFromDomString(dom),
					"test-data/mpgt/mpgt_v317.xsd");
			assertTrue(valid);
		} catch (EngineException e) {
			e.printStackTrace();
			fail("generated mpgt did not validate");
		}
	}
	
	
	public void testRunAtoToMpgt() throws FileNotFoundException, SAXException,
		IOException, ParserConfigurationException,
		FactoryConfigurationError, TModelException {
		String dom = runFiles("test-data/tmodel_ato_to_mpgt.xml",
				"test-data/ad3/ato.xml");
		ValidatingParser vp = new ValidatingParser();
		try {
			boolean valid = vp.isValid(getReadableFromDomString(dom),
					"test-data/mpgt/mpgt_v317.xsd");
			assertTrue(valid);
		} catch (EngineException e) {
			e.printStackTrace();
			fail("generated mpgt did not validate");
		}
	}



	public void testGenerateXsl() throws TModelException,
			FileNotFoundException, SAXException, IOException,
			ParserConfigurationException, FactoryConfigurationError {
		TModel tmodel = loadTModel("test-data/tmodel_aco_to_mpgt.xml");
		XSLTGenerator g = new XSLTGenerator(tmodel);

		try {
			g.generate();
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			g.dumpXslt(out);
			System.out.println("------ DUMP START ------");
			System.out.println(out.toString());
			System.out.println("------ DUMP END ------");
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

}
