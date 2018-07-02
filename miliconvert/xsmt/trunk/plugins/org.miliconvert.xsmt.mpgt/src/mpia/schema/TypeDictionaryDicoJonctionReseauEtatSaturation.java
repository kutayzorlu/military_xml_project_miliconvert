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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Jonction Reseau Etat Saturation</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoJonctionReseauEtatSaturation()
 * @model extendedMetaData="name='type_Dictionary_Dico_JonctionReseauEtatSaturation'"
 * @generated
 */
public enum TypeDictionaryDicoJonctionReseauEtatSaturation implements Enumerator {
	/**
	 * The '<em><b>NOTSAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTSAT_VALUE
	 * @generated
	 * @ordered
	 */
	NOTSAT(0, "NOTSAT", "NOTSAT"),

	/**
	 * The '<em><b>PRESAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESAT_VALUE
	 * @generated
	 * @ordered
	 */
	PRESAT(1, "PRESAT", "PRESAT"),

	/**
	 * The '<em><b>SATURE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SATURE_VALUE
	 * @generated
	 * @ordered
	 */
	SATURE(2, "SATURE", "SATURE"),

	/**
	 * The '<em><b>NOTRAF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTRAF_VALUE
	 * @generated
	 * @ordered
	 */
	NOTRAF(3, "NOTRAF", "NOTRAF"),

	/**
	 * The '<em><b>NONSIG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONSIG_VALUE
	 * @generated
	 * @ordered
	 */
	NONSIG(4, "NONSIG", "NONSIG");

	/**
	 * The '<em><b>NOTSAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOTSAT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOTSAT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOTSAT_VALUE = 0;

	/**
	 * The '<em><b>PRESAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PRESAT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRESAT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRESAT_VALUE = 1;

	/**
	 * The '<em><b>SATURE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SATURE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SATURE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SATURE_VALUE = 2;

	/**
	 * The '<em><b>NOTRAF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOTRAF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOTRAF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOTRAF_VALUE = 3;

	/**
	 * The '<em><b>NONSIG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NONSIG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONSIG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NONSIG_VALUE = 4;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Jonction Reseau Etat Saturation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoJonctionReseauEtatSaturation[] VALUES_ARRAY =
		new TypeDictionaryDicoJonctionReseauEtatSaturation[] {
			NOTSAT,
			PRESAT,
			SATURE,
			NOTRAF,
			NONSIG,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Jonction Reseau Etat Saturation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoJonctionReseauEtatSaturation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Jonction Reseau Etat Saturation</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoJonctionReseauEtatSaturation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoJonctionReseauEtatSaturation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Jonction Reseau Etat Saturation</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoJonctionReseauEtatSaturation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoJonctionReseauEtatSaturation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Jonction Reseau Etat Saturation</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoJonctionReseauEtatSaturation get(int value) {
		switch (value) {
			case NOTSAT_VALUE: return NOTSAT;
			case PRESAT_VALUE: return PRESAT;
			case SATURE_VALUE: return SATURE;
			case NOTRAF_VALUE: return NOTRAF;
			case NONSIG_VALUE: return NONSIG;
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
	private TypeDictionaryDicoJonctionReseauEtatSaturation(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoJonctionReseauEtatSaturation
