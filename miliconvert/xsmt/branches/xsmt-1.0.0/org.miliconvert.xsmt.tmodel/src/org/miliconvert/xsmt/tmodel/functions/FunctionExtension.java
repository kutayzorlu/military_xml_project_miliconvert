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

public class FunctionExtension {

	private String functionName;
	private String functionComment;
	private String functionClass;
	private FunctionCategory functionCategory;
	private String mandatoryProperties;

	public String getFunctionName() {
		return functionName;
	}

	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public String getFunctionComment() {
		return functionComment;
	}

	public void setFunctionComment(String functionComment) {
		this.functionComment = functionComment;
	}

	public String getFunctionClass() {
		return functionClass;
	}

	public void setFunctionClass(String functionClass) {
		this.functionClass = functionClass;
	}

	public FunctionCategory getFunctionCategory() {
		return functionCategory;
	}

	public void setFunctionCategory(FunctionCategory functionCategory) {
		this.functionCategory = functionCategory;
	}

	public String getMandatoryProperties() {
		return mandatoryProperties;
	}

	public void setMandatoryProperties(String mandatoryProperties) {
		this.mandatoryProperties = mandatoryProperties;
	}
}
