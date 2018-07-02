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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Mission COBRA Type Mission COBRA</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoMissionCOBRATypeMissionCOBRA()
 * @model extendedMetaData="name='type_Dictionary_Dico_MissionCOBRATypeMissionCOBRA'"
 * @generated
 */
public enum TypeDictionaryDicoMissionCOBRATypeMissionCOBRA implements Enumerator {
	/**
	 * The '<em><b>LOCENY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCENY_VALUE
	 * @generated
	 * @ordered
	 */
	LOCENY(0, "LOCENY", "LOCENY"),

	/**
	 * The '<em><b>CBATT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CBATT_VALUE
	 * @generated
	 * @ordered
	 */
	CBATT(1, "CBATT", "CBATT"),

	/**
	 * The '<em><b>FRDFIR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRDFIR_VALUE
	 * @generated
	 * @ordered
	 */
	FRDFIR(2, "FRDFIR", "FRDFIR"),

	/**
	 * The '<em><b>MIXED1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIXED1_VALUE
	 * @generated
	 * @ordered
	 */
	MIXED1(3, "MIXED1", "MIXED1"),

	/**
	 * The '<em><b>MIXED2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIXED2_VALUE
	 * @generated
	 * @ordered
	 */
	MIXED2(4, "MIXED2", "MIXED2");

	/**
	 * The '<em><b>LOCENY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LOCENY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOCENY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOCENY_VALUE = 0;

	/**
	 * The '<em><b>CBATT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CBATT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CBATT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CBATT_VALUE = 1;

	/**
	 * The '<em><b>FRDFIR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FRDFIR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FRDFIR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FRDFIR_VALUE = 2;

	/**
	 * The '<em><b>MIXED1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MIXED1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MIXED1
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MIXED1_VALUE = 3;

	/**
	 * The '<em><b>MIXED2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MIXED2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MIXED2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MIXED2_VALUE = 4;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Mission COBRA Type Mission COBRA</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoMissionCOBRATypeMissionCOBRA[] VALUES_ARRAY =
		new TypeDictionaryDicoMissionCOBRATypeMissionCOBRA[] {
			LOCENY,
			CBATT,
			FRDFIR,
			MIXED1,
			MIXED2,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Mission COBRA Type Mission COBRA</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoMissionCOBRATypeMissionCOBRA> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Mission COBRA Type Mission COBRA</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoMissionCOBRATypeMissionCOBRA get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoMissionCOBRATypeMissionCOBRA result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Mission COBRA Type Mission COBRA</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoMissionCOBRATypeMissionCOBRA getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoMissionCOBRATypeMissionCOBRA result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Mission COBRA Type Mission COBRA</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoMissionCOBRATypeMissionCOBRA get(int value) {
		switch (value) {
			case LOCENY_VALUE: return LOCENY;
			case CBATT_VALUE: return CBATT;
			case FRDFIR_VALUE: return FRDFIR;
			case MIXED1_VALUE: return MIXED1;
			case MIXED2_VALUE: return MIXED2;
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
	private TypeDictionaryDicoMissionCOBRATypeMissionCOBRA(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoMissionCOBRATypeMissionCOBRA
