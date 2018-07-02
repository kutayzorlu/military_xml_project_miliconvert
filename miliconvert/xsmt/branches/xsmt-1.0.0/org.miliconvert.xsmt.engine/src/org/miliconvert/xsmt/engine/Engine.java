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

package org.miliconvert.xsmt.engine;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamSource;

import org.miliconvert.xsmt.tmodel.Function;
import org.miliconvert.xsmt.tmodel.ITModelListener;
import org.miliconvert.xsmt.tmodel.Link;
import org.miliconvert.xsmt.tmodel.Schema;
import org.miliconvert.xsmt.tmodel.SchemaId;
import org.miliconvert.xsmt.tmodel.TModel;
import org.miliconvert.xsmt.tmodel.TModelException;
import org.xml.sax.SAXException;

/**
 * Calls tmodel validation on model change. Triggers xsl generation when
 * transformation is doable
 * 
 * @author Thomas Cataldo
 * 
 */
public class Engine implements ITModelListener {

	private Map<SchemaId, IReadable> xmlInstances;
	private TModel model;
	private ValidatingParser vp;
	private List<IEngineListener> listeners;
	private boolean exec;
	private XSLTGenerator generator;
	private ModelValidator validator;

	public Engine(TModel model) throws EngineException {
		this.xmlInstances = new HashMap<SchemaId, IReadable>();
		this.model = model;
		this.vp = new ValidatingParser();
		this.listeners = new LinkedList<IEngineListener>();
		this.validator = new ModelValidator(model);

		this.exec = false; // no xsl was added, no need to check
		generator = new XSLTGenerator(model);
		registerListener(generator);
		model.registerListener(this);
	}

	public void setXmlInstance(SchemaId sid, IReadable readable)
			throws EngineException {
		Schema s = null;
		try {
			s = model.findSchemaById(sid);
		} catch (TModelException e) {
			throw new EngineException(MessageFormat.format(
					Messages.Engine_error_matching, sid));
		}
		if (vp.isValid(readable, s.getFsPath())) {
			try {
				xmlInstances.put(s.getId(), readable);
				if (checkExecutable() != exec) {
					exec = !exec;
					fireExecutionStateChanged();
				}
			} catch (Exception e) {
				throw new EngineException(Messages.Engine_error_parse
						+ readable, e);
			}
		} else {
			throw new EngineException(Messages.Engine_error_validate);
		}
	}

	private boolean checkExecutable() {

		int sourceCount = model.getSourceSchemas().size();
		boolean ret = validator.isValid() && xmlInstances.size() == sourceCount;
		System.out.println("checkExecutable() -> " + ret); //$NON-NLS-1$
		return ret;
	}

	public boolean isExecutable() {
		return exec;
	}

	public void functionAdded(Function f) {
	}

	public void linkAdded(Link l) {
		if (checkExecutable() != exec) {
			this.exec = !exec;
			fireExecutionStateChanged();
		}
	}

	public void schemaAdded(Schema s) {
		if (checkExecutable() != exec) {
			this.exec = !exec;
			fireExecutionStateChanged();
		}
	}

	public void run(Result r) throws EngineException {
		TransformerFactory factory = Activator.getDefault()
				.getTransformerFactory();

		// TODO this is a performance killer on batch generation
		generator.generate();
		
		Source xsl = generator.getSource();
		Transformer tf;
		try {
			tf = factory.newTransformer(xsl);
			tf.transform(getMainSource(), r);
		} catch (TransformerConfigurationException e) {
			throw new EngineException(e.getMessage(), e);
		} catch (TransformerException e) {
			throw new EngineException(e.getMessage(), e);
		}
	}

	private SchemaId getMainSchemaId() {
		return model.getSourceSchemas().get(0).getId();
	}

	private Source getMainSource() throws EngineException {
		return new StreamSource(xmlInstances.get(getMainSchemaId()).read());
	}

	public void registerListener(IEngineListener el) {
		listeners.add(el);
	}

	private void fireExecutionStateChanged() {
		for (IEngineListener listener : listeners) {
			listener.executableStateChange(exec);
		}
	}

	public void functionRemoved(Function f) {
		if (checkExecutable() != exec) {
			this.exec = !exec;
			fireExecutionStateChanged();
		}
	}

	public void linkRemoved(Link l) {
		if (checkExecutable() != exec) {
			this.exec = !exec;
			fireExecutionStateChanged();
		}
	}

	public void schemaRemoved(Schema s) {
		if (checkExecutable() != exec) {
			this.exec = !exec;
			fireExecutionStateChanged();
		}
	}

	public boolean isValidModel() {
		return validator.isValid();
	}
	
	public void dump() throws FileNotFoundException, SAXException, IOException, ParserConfigurationException, FactoryConfigurationError, TransformerException {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		generator.dumpXslt(out);
		System.out.println("------ DUMP START ------");
		System.out.println(out.toString());
		System.out.println("------ DUMP END ------");
	}

}
