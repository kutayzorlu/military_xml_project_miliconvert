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
 * This class is used to instance function objects given an implementation class
 * and an option set of initial properties
 * 
 * @author Thomas Cataldo
 * 
 */
public class FunctionFactory {

	@SuppressWarnings("unchecked") //$NON-NLS-1$
	public Function create(FunctionId id, String implementationClass,
			Map<String, String> properties) throws TModelException {
		try {
			Function f = new Function();

			/* this tests that the implementation is available */
			Class<IFunctionImpl> klass = (Class<IFunctionImpl>) Class
					.forName(implementationClass);
			IFunctionImpl implementation = klass.newInstance();

			f.setImplementationClass(implementationClass);
			f.setImpl(implementation);
			if (properties != null && !properties.isEmpty()) {
				f.setProperties(properties);
			}
			f.setSignature(implementation.getSignature());
			f.setId(id);

			return f;
		} catch (Exception e) {
			throw new TModelException(Messages.FunctionFactory__error_function_create, e);
		}

	}

	public Function create(String implementationClass,
			Map<String, String> properties) throws TModelException {
		return create(new FunctionId(), implementationClass, properties);
	}

	public Function create(String implementationClass) throws TModelException {
		return create(new FunctionId(), implementationClass, null);
	}
}