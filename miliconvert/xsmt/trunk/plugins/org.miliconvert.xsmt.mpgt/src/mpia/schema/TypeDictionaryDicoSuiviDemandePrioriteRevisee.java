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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Suivi Demande Priorite Revisee</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoSuiviDemandePrioriteRevisee()
 * @model extendedMetaData="name='type_Dictionary_Dico_SuiviDemandePrioriteRevisee'"
 * @generated
 */
public enum TypeDictionaryDicoSuiviDemandePrioriteRevisee implements Enumerator {
	/**
	 * The '<em><b>1A1B</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_1A1B_VALUE
	 * @generated
	 * @ordered
	 */
	_1A1B(0, "_1A1B", "1A1B"),

	/**
	 * The '<em><b>2A2B</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_2A2B_VALUE
	 * @generated
	 * @ordered
	 */
	_2A2B(1, "_2A2B", "2A2B"),

	/**
	 * The '<em><b>3A3B</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_3A3B_VALUE
	 * @generated
	 * @ordered
	 */
	_3A3B(2, "_3A3B", "3A3B"),

	/**
	 * The '<em><b>4A4B</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_4A4B_VALUE
	 * @generated
	 * @ordered
	 */
	_4A4B(3, "_4A4B", "4A4B"),

	/**
	 * The '<em><b>1TO4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_1TO4_VALUE
	 * @generated
	 * @ordered
	 */
	_1TO4(4, "_1TO4", "1TO4");

	/**
	 * The '<em><b>1A1B</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>1A1B</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_1A1B
	 * @model literal="1A1B"
	 * @generated
	 * @ordered
	 */
	public static final int _1A1B_VALUE = 0;

	/**
	 * The '<em><b>2A2B</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>2A2B</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_2A2B
	 * @model literal="2A2B"
	 * @generated
	 * @ordered
	 */
	public static final int _2A2B_VALUE = 1;

	/**
	 * The '<em><b>3A3B</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>3A3B</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_3A3B
	 * @model literal="3A3B"
	 * @generated
	 * @ordered
	 */
	public static final int _3A3B_VALUE = 2;

	/**
	 * The '<em><b>4A4B</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>4A4B</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_4A4B
	 * @model literal="4A4B"
	 * @generated
	 * @ordered
	 */
	public static final int _4A4B_VALUE = 3;

	/**
	 * The '<em><b>1TO4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>1TO4</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_1TO4
	 * @model literal="1TO4"
	 * @generated
	 * @ordered
	 */
	public static final int _1TO4_VALUE = 4;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Suivi Demande Priorite Revisee</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoSuiviDemandePrioriteRevisee[] VALUES_ARRAY =
		new TypeDictionaryDicoSuiviDemandePrioriteRevisee[] {
			_1A1B,
			_2A2B,
			_3A3B,
			_4A4B,
			_1TO4,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Suivi Demande Priorite Revisee</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoSuiviDemandePrioriteRevisee> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Suivi Demande Priorite Revisee</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoSuiviDemandePrioriteRevisee get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoSuiviDemandePrioriteRevisee result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Suivi Demande Priorite Revisee</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoSuiviDemandePrioriteRevisee getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoSuiviDemandePrioriteRevisee result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Suivi Demande Priorite Revisee</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoSuiviDemandePrioriteRevisee get(int value) {
		switch (value) {
			case _1A1B_VALUE: return _1A1B;
			case _2A2B_VALUE: return _2A2B;
			case _3A3B_VALUE: return _3A3B;
			case _4A4B_VALUE: return _4A4B;
			case _1TO4_VALUE: return _1TO4;
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
	private TypeDictionaryDicoSuiviDemandePrioriteRevisee(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoSuiviDemandePrioriteRevisee
