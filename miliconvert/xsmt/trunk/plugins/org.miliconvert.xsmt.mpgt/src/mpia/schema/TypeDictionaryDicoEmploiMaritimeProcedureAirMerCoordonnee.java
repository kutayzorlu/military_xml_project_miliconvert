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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Emploi Maritime Procedure Air Mer Coordonnee</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoEmploiMaritimeProcedureAirMerCoordonnee()
 * @model extendedMetaData="name='type_Dictionary_Dico_EmploiMaritimeProcedureAirMerCoordonnee'"
 * @generated
 */
public enum TypeDictionaryDicoEmploiMaritimeProcedureAirMerCoordonnee implements Enumerator {
	/**
	 * The '<em><b>CASP1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CASP1_VALUE
	 * @generated
	 * @ordered
	 */
	CASP1(0, "CASP1", "CASP1"),

	/**
	 * The '<em><b>CASP2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CASP2_VALUE
	 * @generated
	 * @ordered
	 */
	CASP2(1, "CASP2", "CASP2"),

	/**
	 * The '<em><b>CASP3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CASP3_VALUE
	 * @generated
	 * @ordered
	 */
	CASP3(2, "CASP3", "CASP3"),

	/**
	 * The '<em><b>CASP4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CASP4_VALUE
	 * @generated
	 * @ordered
	 */
	CASP4(3, "CASP4", "CASP4");

	/**
	 * The '<em><b>CASP1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CASP1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CASP1
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CASP1_VALUE = 0;

	/**
	 * The '<em><b>CASP2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CASP2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CASP2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CASP2_VALUE = 1;

	/**
	 * The '<em><b>CASP3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CASP3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CASP3
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CASP3_VALUE = 2;

	/**
	 * The '<em><b>CASP4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CASP4</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CASP4
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CASP4_VALUE = 3;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Emploi Maritime Procedure Air Mer Coordonnee</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoEmploiMaritimeProcedureAirMerCoordonnee[] VALUES_ARRAY =
		new TypeDictionaryDicoEmploiMaritimeProcedureAirMerCoordonnee[] {
			CASP1,
			CASP2,
			CASP3,
			CASP4,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Emploi Maritime Procedure Air Mer Coordonnee</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoEmploiMaritimeProcedureAirMerCoordonnee> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Emploi Maritime Procedure Air Mer Coordonnee</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoEmploiMaritimeProcedureAirMerCoordonnee get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoEmploiMaritimeProcedureAirMerCoordonnee result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Emploi Maritime Procedure Air Mer Coordonnee</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoEmploiMaritimeProcedureAirMerCoordonnee getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoEmploiMaritimeProcedureAirMerCoordonnee result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Emploi Maritime Procedure Air Mer Coordonnee</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoEmploiMaritimeProcedureAirMerCoordonnee get(int value) {
		switch (value) {
			case CASP1_VALUE: return CASP1;
			case CASP2_VALUE: return CASP2;
			case CASP3_VALUE: return CASP3;
			case CASP4_VALUE: return CASP4;
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
	private TypeDictionaryDicoEmploiMaritimeProcedureAirMerCoordonnee(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoEmploiMaritimeProcedureAirMerCoordonnee
