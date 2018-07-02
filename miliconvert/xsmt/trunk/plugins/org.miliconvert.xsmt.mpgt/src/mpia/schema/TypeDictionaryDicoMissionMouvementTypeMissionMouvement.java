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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Mission Mouvement Type Mission Mouvement</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoMissionMouvementTypeMissionMouvement()
 * @model extendedMetaData="name='type_Dictionary_Dico_MissionMouvementTypeMissionMouvement'"
 * @generated
 */
public enum TypeDictionaryDicoMissionMouvementTypeMissionMouvement implements Enumerator {
	/**
	 * The '<em><b>CIRDO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CIRDO_VALUE
	 * @generated
	 * @ordered
	 */
	CIRDO(0, "CIRDO", "CIRDO"),

	/**
	 * The '<em><b>CIRUCI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CIRUCI_VALUE
	 * @generated
	 * @ordered
	 */
	CIRUCI(1, "CIRUCI", "CIRUCI"),

	/**
	 * The '<em><b>NOS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOS_VALUE
	 * @generated
	 * @ordered
	 */
	NOS(2, "NOS", "NOS");

	/**
	 * The '<em><b>CIRDO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CIRDO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CIRDO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CIRDO_VALUE = 0;

	/**
	 * The '<em><b>CIRUCI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CIRUCI</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CIRUCI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CIRUCI_VALUE = 1;

	/**
	 * The '<em><b>NOS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOS_VALUE = 2;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Mission Mouvement Type Mission Mouvement</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoMissionMouvementTypeMissionMouvement[] VALUES_ARRAY =
		new TypeDictionaryDicoMissionMouvementTypeMissionMouvement[] {
			CIRDO,
			CIRUCI,
			NOS,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Mission Mouvement Type Mission Mouvement</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoMissionMouvementTypeMissionMouvement> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Mission Mouvement Type Mission Mouvement</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoMissionMouvementTypeMissionMouvement get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoMissionMouvementTypeMissionMouvement result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Mission Mouvement Type Mission Mouvement</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoMissionMouvementTypeMissionMouvement getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoMissionMouvementTypeMissionMouvement result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Mission Mouvement Type Mission Mouvement</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoMissionMouvementTypeMissionMouvement get(int value) {
		switch (value) {
			case CIRDO_VALUE: return CIRDO;
			case CIRUCI_VALUE: return CIRUCI;
			case NOS_VALUE: return NOS;
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
	private TypeDictionaryDicoMissionMouvementTypeMissionMouvement(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoMissionMouvementTypeMissionMouvement
