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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Mission Genie Type Mission Majeure</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoMissionGenieTypeMissionMajeure()
 * @model extendedMetaData="name='type_Dictionary_Dico_MissionGenieTypeMissionMajeure'"
 * @generated
 */
public enum TypeDictionaryDicoMissionGenieTypeMissionMajeure implements Enumerator {
	/**
	 * The '<em><b>CMOB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CMOB_VALUE
	 * @generated
	 * @ordered
	 */
	CMOB(0, "CMOB", "CMOB"),

	/**
	 * The '<em><b>MOB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOB_VALUE
	 * @generated
	 * @ordered
	 */
	MOB(1, "MOB", "MOB"),

	/**
	 * The '<em><b>DEPLOY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPLOY_VALUE
	 * @generated
	 * @ordered
	 */
	DEPLOY(2, "DEPLOY", "DEPLOY");

	/**
	 * The '<em><b>CMOB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CMOB</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CMOB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CMOB_VALUE = 0;

	/**
	 * The '<em><b>MOB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MOB</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOB_VALUE = 1;

	/**
	 * The '<em><b>DEPLOY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DEPLOY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEPLOY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEPLOY_VALUE = 2;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Mission Genie Type Mission Majeure</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoMissionGenieTypeMissionMajeure[] VALUES_ARRAY =
		new TypeDictionaryDicoMissionGenieTypeMissionMajeure[] {
			CMOB,
			MOB,
			DEPLOY,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Mission Genie Type Mission Majeure</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoMissionGenieTypeMissionMajeure> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Mission Genie Type Mission Majeure</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoMissionGenieTypeMissionMajeure get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoMissionGenieTypeMissionMajeure result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Mission Genie Type Mission Majeure</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoMissionGenieTypeMissionMajeure getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoMissionGenieTypeMissionMajeure result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Mission Genie Type Mission Majeure</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoMissionGenieTypeMissionMajeure get(int value) {
		switch (value) {
			case CMOB_VALUE: return CMOB;
			case MOB_VALUE: return MOB;
			case DEPLOY_VALUE: return DEPLOY;
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
	private TypeDictionaryDicoMissionGenieTypeMissionMajeure(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoMissionGenieTypeMissionMajeure
