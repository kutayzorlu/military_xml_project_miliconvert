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

package org.miliconvert.xsmt.tmodel.tests;

import java.io.File;

import junit.framework.TestCase;

import org.miliconvert.xsmt.tmodel.Schema;
import org.miliconvert.xsmt.tmodel.SchemaFactory;
import org.miliconvert.xsmt.tmodel.SchemaId;

public class SchemaFactoryTest extends TestCase {

	public void testCreateSchemaIdString() {
		String path = "test-data/path.xsd";
		try {
			SchemaFactory sf = new SchemaFactory();
			path = new File(path).getAbsolutePath();
			Schema s = sf.create(new SchemaId(40), path);
			
			assertNotNull("schema is null", s);
			assertNotNull("schema.id is null", s.getId());
			assertNotNull("schema.fsPath is null", s.getFsPath());
			assertNotNull("schema.schema is null", s.getSchema());
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("problem while loading schema from "+path);
		}
	}

	public void testCreateString() {
		String path = "test-data/path.xsd";
		try {
			SchemaFactory sf = new SchemaFactory();
			path = new File(path).getAbsolutePath();
			Schema s = sf.create(path);
			
			assertNotNull("schema is null", s);
			assertNotNull("schema.id is null", s.getId());
			assertNotNull("schema.fsPath is null", s.getFsPath());
			assertNotNull("schema.schema is null", s.getSchema());
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("problem while loading schema from "+path);
		}
	}

}
