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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Mission ASA Type Mission ASA</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoMissionASATypeMissionASA()
 * @model extendedMetaData="name='type_Dictionary_Dico_MissionASATypeMissionASA'"
 * @generated
 */
public enum TypeDictionaryDicoMissionASATypeMissionASA implements Enumerator {
	/**
	 * The '<em><b>ATDFMI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATDFMI_VALUE
	 * @generated
	 * @ordered
	 */
	ATDFMI(0, "ATDFMI", "ATDFMI"),

	/**
	 * The '<em><b>SPECMI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPECMI_VALUE
	 * @generated
	 * @ordered
	 */
	SPECMI(1, "SPECMI", "SPECMI"),

	/**
	 * The '<em><b>MISURV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MISURV_VALUE
	 * @generated
	 * @ordered
	 */
	MISURV(2, "MISURV", "MISURV"),

	/**
	 * The '<em><b>CMO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CMO_VALUE
	 * @generated
	 * @ordered
	 */
	CMO(3, "CMO", "CMO"),

	/**
	 * The '<em><b>MEZ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEZ_VALUE
	 * @generated
	 * @ordered
	 */
	MEZ(4, "MEZ", "MEZ");

	/**
	 * The '<em><b>ATDFMI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ATDFMI</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ATDFMI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ATDFMI_VALUE = 0;

	/**
	 * The '<em><b>SPECMI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SPECMI</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPECMI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SPECMI_VALUE = 1;

	/**
	 * The '<em><b>MISURV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MISURV</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MISURV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MISURV_VALUE = 2;

	/**
	 * The '<em><b>CMO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CMO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CMO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CMO_VALUE = 3;

	/**
	 * The '<em><b>MEZ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MEZ</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEZ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MEZ_VALUE = 4;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Mission ASA Type Mission ASA</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoMissionASATypeMissionASA[] VALUES_ARRAY =
		new TypeDictionaryDicoMissionASATypeMissionASA[] {
			ATDFMI,
			SPECMI,
			MISURV,
			CMO,
			MEZ,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Mission ASA Type Mission ASA</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoMissionASATypeMissionASA> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Mission ASA Type Mission ASA</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoMissionASATypeMissionASA get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoMissionASATypeMissionASA result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Mission ASA Type Mission ASA</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoMissionASATypeMissionASA getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoMissionASATypeMissionASA result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Mission ASA Type Mission ASA</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoMissionASATypeMissionASA get(int value) {
		switch (value) {
			case ATDFMI_VALUE: return ATDFMI;
			case SPECMI_VALUE: return SPECMI;
			case MISURV_VALUE: return MISURV;
			case CMO_VALUE: return CMO;
			case MEZ_VALUE: return MEZ;
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
	private TypeDictionaryDicoMissionASATypeMissionASA(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoMissionASATypeMissionASA
