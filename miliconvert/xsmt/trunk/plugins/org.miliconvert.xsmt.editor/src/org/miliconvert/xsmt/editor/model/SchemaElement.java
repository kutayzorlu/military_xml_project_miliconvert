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

package org.miliconvert.xsmt.editor.model;

import java.util.List;

import org.eclipse.xsd.XSDFeature;
import org.miliconvert.xsmt.tmodel.IFeatVisitor;
import org.miliconvert.xsmt.tmodel.LinkResolver;
import org.miliconvert.xsmt.tmodel.ModelUtililies;
import org.miliconvert.xsmt.tmodel.Schema;
import org.miliconvert.xsmt.tmodel.TModelException;

public class SchemaElement extends GModelConnectableElement {

	public static final String XSI = "SchemaElement.withXsi"; //$NON-NLS-1$
	public static final String VISIBLE = "SchemaElement.visible"; //$NON-NLS-1$
	
	
	private Schema schema;
	private boolean withXsi;

	public SchemaElement(final Schema schema) {
		super();
		this.schema = schema;

		final ModelUtililies mu = new ModelUtililies();

		// crappy fix
		List<XSDFeature> l = mu.getRoots(schema);
		mu.getChildren(l.get(0));

		
		mu.forEachFeature(schema, new IFeatVisitor() {
			LinkResolver lr = new LinkResolver(null, mu);

			public void visit(XSDFeature f) {

				outputs.put("out-" + featId(f), null);
				inputs.put("in-" + featId(f), null);
			}

			private String featId(XSDFeature f) {
				try {
					return lr.serialize(schema.getId(), f);
				} catch (TModelException e) {
					e.printStackTrace();
					return f.toString();
				}
			}
		});

	}

	public Schema getSchema() {
		return schema;
	}

	public void setSchema(Schema schema) {
		this.schema = schema;
	}

	public boolean isWithXsi() {
		return withXsi;
	}

	public void setWithXsi(boolean withXsi) {
		boolean oldValue = this.withXsi;
		this.withXsi = withXsi;
		firePropertyChange(XSI, oldValue, withXsi);
	}
	
	/**
	 * Notifies the controlling edit part that this feature must
	 * be made visible (tree will be expanded)
	 * 
	 * @param f
	 */
	public void setVisible(XSDFeature f) {
		System.out.println("will try to make '"+f.getName()+"' visible");
		firePropertyChange(VISIBLE, null, f);
	}
}
