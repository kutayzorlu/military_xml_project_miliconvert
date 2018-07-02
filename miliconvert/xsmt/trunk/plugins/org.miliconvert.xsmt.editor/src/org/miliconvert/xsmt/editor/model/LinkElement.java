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

import org.eclipse.xsd.XSDFeature;
import org.miliconvert.xsmt.tmodel.Link;
import org.miliconvert.xsmt.tmodel.LinkResolver;
import org.miliconvert.xsmt.tmodel.TModel;
import org.miliconvert.xsmt.tmodel.TModelException;

/**
 * "gef" suitable model node for tmodel links
 * 
 * @author Thomas Cataldo
 *
 */
public class LinkElement extends GModelNode {

	public static final String LE_START = "LinkElement.start"; //$NON-NLS-1$
	public static final String LE_END = "LinkElement.end"; //$NON-NLS-1$
	public static final String LE_START_NAME = "LinkElement.startName"; //$NON-NLS-1$
	public static final String LE_END_NAME = "LinkElement.endName"; //$NON-NLS-1$
	
	private Link link;

	private GModelConnectableElement start;
	private GModelConnectableElement end;

	// precise names of the in/out used in the connected element
	private String startName;
	private String endName;

	public LinkElement(Link link) {
		this.link = link;
	}

	public Link getLink() {
		return link;
	}

	public void setLink(Link link) {
		this.link = link;
	}

	public void attachStart() {
		start.connectOutput(startName, this);
	}

	public void attachEnd() {
		end.connectInput(endName, this);

	}

	public void detachStart() {
		if (start != null) {
			start.disconnectOutput(startName);
		}

	}

	public void detachEnd() {
		if (end != null) {
			end.disconnectInput(endName);
		}
	}

	public void setStartName(String startName) {
		String oldStartName = this.startName;
		this.startName = startName;
		firePropertyChange(LE_START_NAME, oldStartName, startName);
	}

	public void setEndName(String endName) {
		String oldEndName = this.endName;
		this.endName = endName;
		firePropertyChange(LE_END_NAME, oldEndName, startName);
	}

	public void setStart(GModelConnectableElement start) {
		Object oldStart = this.start;
		this.start = start;
		firePropertyChange(LE_START, oldStart, start);
	}

	public void setEnd(GModelConnectableElement end) {
		Object oldEnd = this.end;
		this.end = end;
		firePropertyChange(LE_END, oldEnd, end);
	}

	public String getStartName() {
		return startName;
	}

	public String getEndName() {
		return endName;
	}

	public GModelConnectableElement getStart() {
		return start;
	}

	public GModelConnectableElement getEnd() {
		return end;
	}

	/**
	 * updates the tmodel link related to this modelnode
	 */
	public void update(TModel tm) {
		System.out.println("start: "+start+", end: "+end); //$NON-NLS-1$ //$NON-NLS-2$
		if (start instanceof FunctionElement) {
			FunctionElement fe = (FunctionElement) start;
			link.setStart(fe.getFunction().getId());
		} else if (start != null) {
			LinkResolver lr = new LinkResolver(tm);
			String fId = startName.substring("out-".length());
			try {
				XSDFeature f = lr.resolveFeature(fId);
				link.setStart(f);
			} catch (TModelException e) {
				System.out.println("cannot resolve start feature '"+fId+"'");
			}
		}
		
		if (end instanceof FunctionElement) {
			FunctionElement fe = (FunctionElement) end;
			int comma = endName.indexOf(',');
			int idx = Integer.parseInt(endName.substring(comma+1));
			link.setEnd(fe.getFunction().getId(), idx);
		} else if (end != null) {
			LinkResolver lr = new LinkResolver(tm);
			String fId = endName.substring("in-".length());
			try {
				XSDFeature f = lr.resolveFeature(fId);
				link.setEnd(f);
			} catch (TModelException e) {
				System.out.println("cannot resolve end feature '"+fId+"'");
			}
		}
	}
}
