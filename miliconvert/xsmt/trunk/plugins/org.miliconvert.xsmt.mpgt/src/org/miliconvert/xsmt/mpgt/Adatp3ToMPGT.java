package org.miliconvert.xsmt.mpgt;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xalan.extensions.ExpressionContext;
import org.miliconvert.xsmt.tmodel.FunctionSignature;
import org.miliconvert.xsmt.tmodel.IFunctionImpl;
import org.miliconvert.xsmt.tmodel.TModelException;
import org.miliconvert.xsmt.tmodel.Variable;
import org.w3c.dom.Node;

public class Adatp3ToMPGT implements IFunctionImpl {

	private Map<String, IMPGTGenerator> generators;
	private Log logger = LogFactory.getLog(getClass());

	public Adatp3ToMPGT() {
		logger.info("Trying to create Adatp3ToMPGT instance...");
		generators = new HashMap<String, IMPGTGenerator>();
		Adatp3GeneratorFactory factory = new Adatp3GeneratorFactory();
		factory.registerSupportedGenerators(generators);
		

		System.err
				.println("************** adatp3ToMPGT instanciated **************");
	}

	public String getName() {
		return "MPGT";
	}

	public FunctionSignature getSignature() {
		List<Variable> lv = new LinkedList<Variable>();
		lv.add(new Variable("adatp3RootNode"));
		return new FunctionSignature(lv);
	}

	public void setProperties(Map<String, String> properties)
			throws TModelException {
		// TODO Auto-generated method stub

	}

	public Node execute(ExpressionContext ec, Node node) {
		System.err
				.println("************* CALL TO EXECUTE(ec, node) ************");
		String root = node.getNodeName();
		IMPGTGenerator g = generators.get(root);
		if (g == null) {
			logger.warn("No generator for root node '" + root + "'");
			return null;
		} else {
			return g.generate(node);
		}

	}

}
