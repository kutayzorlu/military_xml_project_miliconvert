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

package org.miliconvert.xsmt.io;

import org.miliconvert.xsmt.gmodel.GModel;
import org.miliconvert.xsmt.tmodel.TModel;

/**
 * Container for tmodel et graphic model.
 * 
 * @author Thomas Cataldo
 * 
 */
public class XSMTPackage {

	public static final String NS = "http://www.miliconvert.org/xsd/xsmt/xsmt.xsd"; //$NON-NLS-1$

	private TModel tmodel;
	private GModel graphic;

	public XSMTPackage() {
		this(new TModel(), new GModel());
	}

	public XSMTPackage(TModel tmodel, GModel graphic) {
		this.tmodel = tmodel;
		this.graphic = graphic;
		this.tmodel.registerListener(graphic);
	}

	public TModel getTmodel() {
		return tmodel;
	}

	public GModel getGraphic() {
		return graphic;
	}

}
