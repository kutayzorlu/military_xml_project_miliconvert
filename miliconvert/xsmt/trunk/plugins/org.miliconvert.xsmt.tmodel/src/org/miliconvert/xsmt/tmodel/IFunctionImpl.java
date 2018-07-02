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

import java.util.Map;

/**
 * Interface implemented by all function implementations Function
 * implementations also require an execute Method with a number of parameters
 * matching the signature.
 * 
 * @author Thomas Cataldo
 * 
 */
public interface IFunctionImpl {

	FunctionSignature getSignature();

	String getName();

	void setProperties(Map<String, String> properties) throws TModelException;

}
