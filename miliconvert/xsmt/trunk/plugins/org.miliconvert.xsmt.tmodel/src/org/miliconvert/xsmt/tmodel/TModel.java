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
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.xsd.XSDSchema;

/**
 * Transformation model
 * 
 * TODO add removal to event model
 * 
 * @author Thomas Cataldo
 * 
 */
public class TModel {

	public static final String NS = "http://www.miliconvert.org/xsd/xsmt/tmodel.xsd"; //$NON-NLS-1$

	private List<Function> functions;
	private Map<FunctionId, Function> functionsIdx;

	private List<Link> links;
	private List<ITModelListener> listeners;

	private List<Schema> schemas;

	private Map<SchemaId, Schema> schemasIdx;

	public TModel() {
		schemas = new LinkedList<Schema>();
		schemasIdx = new HashMap<SchemaId, Schema>();
		functions = new LinkedList<Function>();
		functionsIdx = new HashMap<FunctionId, Function>();
		links = new LinkedList<Link>();
		listeners = new LinkedList<ITModelListener>();
	}

	public void add(Function f) {
		functions.add(f);
		functionsIdx.put(f.getId(), f);
		fireFunctionAddedEvent(f);
	}

	public void add(Link l) throws TModelException {
		if (l.getStartFeat() == null && l.getStartFid() == null) {
			throw new TModelException(Messages.TModel_error_link_start);
		}
		if (l.getEndFeat() == null && l.getEndFid() == null) {
			throw new TModelException(Messages.TModel_error_link_end);
		}
		links.add(l);
		fireLinkAddedEvent(l);
	}

	public void add(Schema s) {
		schemas.add(s);
		schemasIdx.put(s.getId(), s);
		fireSchemaAddedEvent(s);
	}

	public Function findFunctionById(String functionId) throws TModelException {
		for (FunctionId id : functionsIdx.keySet()) {
			if (id.toString().equals(functionId)) {
				return functionsIdx.get(id);
			}
		}
		throw new TModelException(Messages.TModel_error_function_not_found
				+ functionId);
	}

	public Schema findSchemaById(SchemaId sid) throws TModelException {
		return findSchemaById(sid.toString());
	}

	public Schema findSchemaById(String schemaId) throws TModelException {
		for (SchemaId id : schemasIdx.keySet()) {
			if (id.toString().equals(schemaId)) {
				return schemasIdx.get(id);
			}
		}
		throw new TModelException(Messages.TModel_error_schema_not_found
				+ schemaId);
	}

	private void fireFunctionAddedEvent(Function f) {
		for (ITModelListener l : listeners) {
			l.functionAdded(f);
		}
	}

	private void fireLinkAddedEvent(Link li) {
		for (ITModelListener l : listeners) {
			l.linkAdded(li);
		}
	}

	private void fireSchemaAddedEvent(Schema s) {
		for (ITModelListener l : listeners) {
			l.schemaAdded(s);
		}
	}

	private void fireSchemaRemovedEvent(Schema s) {
		for (ITModelListener l : listeners) {
			l.schemaRemoved(s);
		}
	}

	private void fireFunctionRemovedEvent(Function f) {
		for (ITModelListener l : listeners) {
			l.functionRemoved(f);
		}
	}

	private void fireLinkRemovedEvent(Link li) {
		for (ITModelListener l : listeners) {
			l.linkRemoved(li);
		}
	}

	public List<Function> getFunctions() {
		return functions;
	}

	public SchemaId getId(XSDSchema schema) throws TModelException {
		for (Schema s : schemas) {
			if (s.getSchema() == schema) {
				return s.getId();
			}
		}
		throw new TModelException(Messages.TModel_error_id_not_found + schema);
	}

	public List<Link> getLinks() {
		return links;
	}

	public List<Schema> getSchemas() {
		return schemas;
	}

	/**
	 * A source schema is not targeted by any link. A XML instance of this
	 * schema is needed to perform the transform
	 * 
	 * @return the schemas where an xml instance is need to transform
	 */
	public List<Schema> getSourceSchemas() {
		List<Schema> ret = new LinkedList<Schema>();
		ret.addAll(schemas);

		for (Link l : links) {
			if (l.getEndFeat() != null) {
				try {
					SchemaId id = getId(l.getEndFeat().getSchema());
					ret.remove(schemasIdx.get(id));
				} catch (TModelException e) {
					e.printStackTrace();
				}
			}
		}
		return ret;
	}

	/**
	 * Get the list of "targetted" schemas : schemas without links starting from
	 * them, and links landing on them.
	 * 
	 * @return the "targeted" schema. Size of the returned list is 1 on valid
	 *         designs
	 */
	public Set<Schema> getTargetSchemas() {
		List<Schema> ret = new LinkedList<Schema>();
		ret.addAll(schemas);

		/* remove schemas with links starting from them */
		for (Link l : links) {
			if (l.getStartFeat() != null) {
				try {
					SchemaId id = getId(l.getStartFeat().getSchema());
					ret.remove(schemasIdx.get(id));
				} catch (TModelException e) {
					e.printStackTrace();
				}
			}
		}

		/* those with a link landing on them */
		Set<Schema> finalList = new HashSet<Schema>();
		for (Link l : links) {
			if (l.getEndFeat() != null) {
				try {
					SchemaId id = getId(l.getEndFeat().getSchema());
					Schema s = schemasIdx.get(id);
					if (ret.contains(s)) {
						finalList.add(s);
					}
				} catch (TModelException e) {
					e.printStackTrace();
				}
			}
		}

		return finalList;
	}

	public void registerListener(ITModelListener listener) {
		listeners.add(listener);
	}

	public void remove(Function f) {
		// remove links from and to f
		for (Link l : links) {
			if (isLinked(l, f)) {
				remove(l);
			}
		}
		functions.remove(f);
		functionsIdx.remove(f.getId());
		fireFunctionRemovedEvent(f);
	}

	public void remove(Schema s) {
		// remove links from and to s
		for (Link l : links) {
			if (isLinked(l, s)) {
				remove(l);
			}
		}
		schemas.remove(s);
		schemasIdx.remove(s.getId());
		fireSchemaRemovedEvent(s);
	}

	public void remove(Link l) {
		links.remove(l);
		fireLinkRemovedEvent(l);
	}

	private boolean isLinked(Link l, Function f) {
		if (l.getStartFid() != null && l.getStartFid().equals(f.getId())) {
			return true;
		}
		if (l.getEndFid() != null && l.getEndFid().equals(f.getId())) {
			return true;
		}
		return false;
	}

	private boolean isLinked(Link l, Schema s) {
		if (l.getStartFeat() != null
				&& l.getStartFeat().getSchema() == s.getSchema()) {
			return true;
		}
		if (l.getEndFeat() != null
				&& l.getEndFeat().getSchema() == s.getSchema()) {
			return true;
		}
		return false;
	}

	public Function getFunction(FunctionId id) {
		return functionsIdx.get(id);
	}

	public void setFunctions(List<Function> functions) {
		this.functions = functions;
	}

	public void setLinks(List<Link> links) {
		this.links = links;
	}

	public void setSchemas(List<Schema> schemas) {
		this.schemas = schemas;
	}

	public void unregisterListener(ITModelListener listener) {
		listeners.remove(listener);
	}

}
