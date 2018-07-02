/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Rapport Confiance</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoRapportConfiance()
 * @model extendedMetaData="name='type_Dictionary_Dico_RapportConfiance'"
 * @generated
 */
public enum TypeDictionaryDicoRapportConfiance implements Enumerator {
	/**
	 * The '<em><b>IND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IND_VALUE
	 * @generated
	 * @ordered
	 */
	IND(0, "IND", "IND"),

	/**
	 * The '<em><b>RPTFCT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RPTFCT_VALUE
	 * @generated
	 * @ordered
	 */
	RPTFCT(1, "RPTFCT", "RPTFCT"),

	/**
	 * The '<em><b>RPTPLA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RPTPLA_VALUE
	 * @generated
	 * @ordered
	 */
	RPTPLA(2, "RPTPLA", "RPTPLA"),

	/**
	 * The '<em><b>RPTUNC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RPTUNC_VALUE
	 * @generated
	 * @ordered
	 */
	RPTUNC(3, "RPTUNC", "RPTUNC");

	/**
	 * The '<em><b>IND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IND_VALUE = 0;

	/**
	 * The '<em><b>RPTFCT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RPTFCT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RPTFCT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RPTFCT_VALUE = 1;

	/**
	 * The '<em><b>RPTPLA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RPTPLA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RPTPLA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RPTPLA_VALUE = 2;

	/**
	 * The '<em><b>RPTUNC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RPTUNC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RPTUNC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RPTUNC_VALUE = 3;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Rapport Confiance</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoRapportConfiance[] VALUES_ARRAY =
		new TypeDictionaryDicoRapportConfiance[] {
			IND,
			RPTFCT,
			RPTPLA,
			RPTUNC,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Rapport Confiance</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoRapportConfiance> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Rapport Confiance</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoRapportConfiance get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoRapportConfiance result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Rapport Confiance</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoRapportConfiance getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoRapportConfiance result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Rapport Confiance</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoRapportConfiance get(int value) {
		switch (value) {
			case IND_VALUE: return IND;
			case RPTFCT_VALUE: return RPTFCT;
			case RPTPLA_VALUE: return RPTPLA;
			case RPTUNC_VALUE: return RPTUNC;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TypeDictionaryDicoRapportConfiance(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TypeDictionaryDicoRapportConfiance
