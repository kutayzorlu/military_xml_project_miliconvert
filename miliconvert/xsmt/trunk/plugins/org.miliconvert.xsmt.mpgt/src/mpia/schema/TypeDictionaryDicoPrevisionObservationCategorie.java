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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Prevision Observation Categorie</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoPrevisionObservationCategorie()
 * @model extendedMetaData="name='type_Dictionary_Dico_PrevisionObservationCategorie'"
 * @generated
 */
public enum TypeDictionaryDicoPrevisionObservationCategorie implements Enumerator {
	/**
	 * The '<em><b>WEAOBS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEAOBS_VALUE
	 * @generated
	 * @ordered
	 */
	WEAOBS(0, "WEAOBS", "WEAOBS"),

	/**
	 * The '<em><b>NBCWEAOBS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NBCWEAOBS_VALUE
	 * @generated
	 * @ordered
	 */
	NBCWEAOBS(1, "NBCWEAOBS", "NBCWEAOBS"),

	/**
	 * The '<em><b>WEATHFC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEATHFC_VALUE
	 * @generated
	 * @ordered
	 */
	WEATHFC(2, "WEATHFC", "WEATHFC"),

	/**
	 * The '<em><b>NBCPM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NBCPM_VALUE
	 * @generated
	 * @ordered
	 */
	NBCPM(3, "NBCPM", "NBCPM");

	/**
	 * The '<em><b>WEAOBS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WEAOBS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WEAOBS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WEAOBS_VALUE = 0;

	/**
	 * The '<em><b>NBCWEAOBS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NBCWEAOBS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NBCWEAOBS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NBCWEAOBS_VALUE = 1;

	/**
	 * The '<em><b>WEATHFC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WEATHFC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WEATHFC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WEATHFC_VALUE = 2;

	/**
	 * The '<em><b>NBCPM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NBCPM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NBCPM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NBCPM_VALUE = 3;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Prevision Observation Categorie</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoPrevisionObservationCategorie[] VALUES_ARRAY =
		new TypeDictionaryDicoPrevisionObservationCategorie[] {
			WEAOBS,
			NBCWEAOBS,
			WEATHFC,
			NBCPM,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Prevision Observation Categorie</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoPrevisionObservationCategorie> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Prevision Observation Categorie</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoPrevisionObservationCategorie get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoPrevisionObservationCategorie result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Prevision Observation Categorie</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoPrevisionObservationCategorie getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoPrevisionObservationCategorie result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Prevision Observation Categorie</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoPrevisionObservationCategorie get(int value) {
		switch (value) {
			case WEAOBS_VALUE: return WEAOBS;
			case NBCWEAOBS_VALUE: return NBCWEAOBS;
			case WEATHFC_VALUE: return WEATHFC;
			case NBCPM_VALUE: return NBCPM;
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
	private TypeDictionaryDicoPrevisionObservationCategorie(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoPrevisionObservationCategorie
