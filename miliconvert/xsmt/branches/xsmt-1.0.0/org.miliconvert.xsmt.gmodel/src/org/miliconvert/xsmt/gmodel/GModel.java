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

package org.miliconvert.xsmt.gmodel;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.miliconvert.xsmt.tmodel.Function;
import org.miliconvert.xsmt.tmodel.ITModelListener;
import org.miliconvert.xsmt.tmodel.Link;
import org.miliconvert.xsmt.tmodel.Schema;

public class GModel implements ITModelListener {

	public static final String NS = "http://www.miliconvert.org/xsd/xsmt/graphic.xsd"; //$NON-NLS-1$

	private List<Box> boxes;
	private Map<String, Box> boxesIdx;

	public GModel() {
		boxes = new LinkedList<Box>();
		boxesIdx = new HashMap<String, Box>();
	}

	public Box getBox(String modelId) {
		return boxesIdx.get(modelId);
	}

	public List<Box> getBoxes() {
		return boxes;
	}

	public void addBox(Box b) {
		boxes.add(b);
		boxesIdx.put(b.getModelId(), b);
	}

	public void functionAdded(Function f) {
		addBox(new Box(f.getId().toString(), 0, 0, 0, 0));
	}

	public void linkAdded(Link l) {
	}

	public void schemaAdded(Schema s) {
		addBox(new Box(s.getId().toString(), 0, 0, 0, 0));
	}

	public void functionRemoved(Function f) {
		boxes.remove(getBox(f.getId().toString()));
	}

	public void linkRemoved(Link l) {
	}

	public void schemaRemoved(Schema s) {
		boxes.remove(getBox(s.getId().toString()));
	}

}
