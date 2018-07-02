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

package org.miliconvert.xsmt.tmodel;

import org.eclipse.xsd.XSDFeature;

/**
 * Interface used to perform an action on all the features of a schema.
 * 
 * This interface implementors are responsible of storing any hierarchy
 * information they might need.
 * 
 * @author Thomas Cataldo
 * 
 */
public interface IFeatVisitor {

	/**
	 * Processing of the schema feature is done.
	 * 
	 * 
	 * @param f
	 */
	void visit(XSDFeature f);

}
