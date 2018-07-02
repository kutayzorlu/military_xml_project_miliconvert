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

import java.util.HashMap;
import java.util.Map;

public class Function {

	private FunctionId id;
	private String implementationClass;
	private IFunctionImpl impl;
	private FunctionSignature signature;
	private Map<String, String> properties;

	Function() {
		properties = new HashMap<String, String>();
	}

	public FunctionId getId() {
		return id;
	}

	public void setId(FunctionId id) {
		this.id = id;
	}

	public String getName() {
		return impl.getName();
	}

	public String getImplementationClass() {
		return implementationClass;
	}

	public void setImplementationClass(String implementationClass) {
		this.implementationClass = implementationClass;
	}

	public FunctionSignature getSignature() {
		return signature;
	}

	public void setSignature(FunctionSignature signature) {
		this.signature = signature;
	}

	public Map<String, String> getProperties() {
		return properties;
	}

	public void setProperties(Map<String, String> properties) throws TModelException {
		impl.setProperties(properties);
		this.properties = properties;
	}

	public boolean equals(Object o) {
		return o instanceof Function && ((Function) o).getId().equals(id);
	}

	public int hashCode() {
		return id.hashCode();
	}

	public IFunctionImpl getImpl() {
		return impl;
	}

	public void setImpl(IFunctionImpl impl) {
		this.impl = impl;
	}

	
}
