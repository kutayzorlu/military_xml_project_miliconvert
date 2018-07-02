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

public class Link {
	
	private XSDFeature startFeat;
	private XSDFeature endFeat;
	private FunctionId startFid;
	private FunctionId endFid;
	private int endParamIdx;
	
	public void setStart(XSDFeature start) {
		startFeat = start;
	}

	public void setStart(FunctionId start) {
		startFid = start;
	}

	public void setEnd(XSDFeature end) {
		endFeat = end;
	}

	public void setEnd(FunctionId end, int endParam) {
		endFid = end;
		endParamIdx = endParam;
	}
	
	public String toString() {
		StringBuffer ret = new StringBuffer();
		ret.append("start="); //$NON-NLS-1$
		if (startFeat != null) {
			ret.append("xsd:"+startFeat); //$NON-NLS-1$
		} else {
			ret.append("fid:"+startFid.get()); //$NON-NLS-1$
		}
		ret.append(" end="); //$NON-NLS-1$
		if (endFeat != null) {
			ret.append("xsd:"+startFeat); //$NON-NLS-1$
		} else {
			ret.append("fid:"+endFid.get()+","+endParamIdx); //$NON-NLS-1$ //$NON-NLS-2$
		}
		return ret.toString();
	}

	public XSDFeature getStartFeat() {
		return startFeat;
	}

	public XSDFeature getEndFeat() {
		return endFeat;
	}

	public FunctionId getStartFid() {
		return startFid;
	}

	public FunctionId getEndFid() {
		return endFid;
	}

	public int getEndParamIdx() {
		return endParamIdx;
	}
	
	
}
