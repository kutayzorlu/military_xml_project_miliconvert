package maFonction;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.miliconvert.xsmt.tmodel.FunctionSignature;
import org.miliconvert.xsmt.tmodel.IFunctionImpl;
import org.miliconvert.xsmt.tmodel.TModelException;
import org.miliconvert.xsmt.tmodel.Variable;

public class LaClasseDeMaFonction implements IFunctionImpl {

	private FunctionSignature fs;
	private String tva;

	private static Map<String, String> getDefaultMap() {
		HashMap<String, String> m = new HashMap<String, String>();
		m.put("tva", ""); //$NON-NLS-1$ //$NON-NLS-2$
		return m;
	}

	public LaClasseDeMaFonction() throws TModelException {
		this(getDefaultMap());
	}

	public LaClasseDeMaFonction(Map<String, String> value)
			throws TModelException {
		setProperties(value);
		List<Variable> variables = new LinkedList<Variable>();
		variables.add(new Variable("prix ht")); //$NON-NLS-1$
		variables.add(new Variable("Qté")); //$NON-NLS-1$

		fs = new FunctionSignature(variables);
	}

	public String getName() {
		return "Prix TTC total (tva=" + tva + ")"; //$NON-NLS-1$
	}

	public FunctionSignature getSignature() {
		return fs;
	}

	public void setProperties(Map<String, String> value) throws TModelException {
		if (!value.containsKey("tva")) { //$NON-NLS-1$
			throw new TModelException("maFonction initialisée sans valeur");
		}
		this.tva = value.get("tva"); //$NON-NLS-1$
	}

	public String execute(String a, String b) {
		Float tvaInt = Float.parseFloat(tva);
		Float prixTotal = Integer.parseInt(a) * Integer.parseInt(b) * ((tvaInt / 100) + 1);
		return ""+prixTotal;
	}

}
