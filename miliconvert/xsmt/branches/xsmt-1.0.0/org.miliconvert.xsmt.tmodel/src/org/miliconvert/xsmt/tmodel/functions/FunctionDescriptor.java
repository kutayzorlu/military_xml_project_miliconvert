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

package org.miliconvert.xsmt.tmodel.functions;

public class FunctionDescriptor {

	private String name;
	private String comment;
	private String implClass;

	private FunctionCategory category;
	private String[] mandatoryProperties;

	public FunctionDescriptor(String name, String comment, String implClass,
			FunctionCategory category) {
		this(name, comment, implClass, category, new String[0]);
	}

	public FunctionDescriptor(String name, String comment, String implClass,
			FunctionCategory category, String[] mandatoryProperties) {
		super();
		this.name = name;
		this.comment = comment;
		this.implClass = implClass;
		this.category = category;
		this.mandatoryProperties = mandatoryProperties;
	}

	public String getName() {
		return name;
	}

	public String getComment() {
		return comment;
	}

	public String getImplClass() {
		return implClass;
	}

	public FunctionCategory getCategory() {
		return category;
	}

	public String[] getMandatoryProperties() {
		return mandatoryProperties;
	}

}
