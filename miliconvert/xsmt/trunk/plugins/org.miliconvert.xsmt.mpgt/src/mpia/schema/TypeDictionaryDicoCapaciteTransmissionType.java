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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Capacite Transmission Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoCapaciteTransmissionType()
 * @model extendedMetaData="name='type_Dictionary_Dico_CapaciteTransmissionType'"
 * @generated
 */
public enum TypeDictionaryDicoCapaciteTransmissionType implements Enumerator {
	/**
	 * The '<em><b>MAXFRQ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAXFRQ_VALUE
	 * @generated
	 * @ordered
	 */
	MAXFRQ(0, "MAXFRQ", "MAXFRQ"),

	/**
	 * The '<em><b>MAXPRF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAXPRF_VALUE
	 * @generated
	 * @ordered
	 */
	MAXPRF(1, "MAXPRF", "MAXPRF"),

	/**
	 * The '<em><b>MNMFRQ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MNMFRQ_VALUE
	 * @generated
	 * @ordered
	 */
	MNMFRQ(2, "MNMFRQ", "MNMFRQ"),

	/**
	 * The '<em><b>MNMPRF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MNMPRF_VALUE
	 * @generated
	 * @ordered
	 */
	MNMPRF(3, "MNMPRF", "MNMPRF"),

	/**
	 * The '<em><b>POWER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POWER_VALUE
	 * @generated
	 * @ordered
	 */
	POWER(4, "POWER", "POWER");

	/**
	 * The '<em><b>MAXFRQ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MAXFRQ</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAXFRQ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MAXFRQ_VALUE = 0;

	/**
	 * The '<em><b>MAXPRF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MAXPRF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAXPRF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MAXPRF_VALUE = 1;

	/**
	 * The '<em><b>MNMFRQ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MNMFRQ</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MNMFRQ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MNMFRQ_VALUE = 2;

	/**
	 * The '<em><b>MNMPRF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MNMPRF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MNMPRF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MNMPRF_VALUE = 3;

	/**
	 * The '<em><b>POWER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>POWER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POWER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int POWER_VALUE = 4;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Capacite Transmission Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoCapaciteTransmissionType[] VALUES_ARRAY =
		new TypeDictionaryDicoCapaciteTransmissionType[] {
			MAXFRQ,
			MAXPRF,
			MNMFRQ,
			MNMPRF,
			POWER,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Capacite Transmission Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoCapaciteTransmissionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Capacite Transmission Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoCapaciteTransmissionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoCapaciteTransmissionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Capacite Transmission Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoCapaciteTransmissionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoCapaciteTransmissionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Capacite Transmission Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoCapaciteTransmissionType get(int value) {
		switch (value) {
			case MAXFRQ_VALUE: return MAXFRQ;
			case MAXPRF_VALUE: return MAXPRF;
			case MNMFRQ_VALUE: return MNMFRQ;
			case MNMPRF_VALUE: return MNMPRF;
			case POWER_VALUE: return POWER;
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
	private TypeDictionaryDicoCapaciteTransmissionType(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoCapaciteTransmissionType
