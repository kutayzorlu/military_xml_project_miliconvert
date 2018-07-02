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

package org.miliconvert.xsmt.editor;

import org.eclipse.gef.requests.CreationFactory;
import org.miliconvert.xsmt.editor.model.FunctionElement;
import org.miliconvert.xsmt.tmodel.FunctionFactory;
import org.miliconvert.xsmt.tmodel.TModelException;

public class FunctionCreationFactory implements CreationFactory {

	private String implClass;
	private FunctionFactory ff;
	@SuppressWarnings("unchecked") //$NON-NLS-1$
	public FunctionCreationFactory(String implClass) {
		this.implClass = implClass;
		ff = new FunctionFactory();
	}

	public Object getNewObject() {
		try {
			return new FunctionElement(ff.create(implClass));
		} catch (TModelException e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage(), e);
		}
	}

	public Object getObjectType() {
		return FunctionElement.class;
	}


}
