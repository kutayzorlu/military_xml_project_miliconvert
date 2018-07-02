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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Etat Action Qualificatif Rapport</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoEtatActionQualificatifRapport()
 * @model extendedMetaData="name='type_Dictionary_Dico_EtatActionQualificatifRapport'"
 * @generated
 */
public enum TypeDictionaryDicoEtatActionQualificatifRapport implements Enumerator {
	/**
	 * The '<em><b>RQSEAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RQSEAT_VALUE
	 * @generated
	 * @ordered
	 */
	RQSEAT(0, "RQSEAT", "RQSEAT"),

	/**
	 * The '<em><b>RQEEAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RQEEAT_VALUE
	 * @generated
	 * @ordered
	 */
	RQEEAT(1, "RQEEAT", "RQEEAT"),

	/**
	 * The '<em><b>RQSSAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RQSSAT_VALUE
	 * @generated
	 * @ordered
	 */
	RQSSAT(2, "RQSSAT", "RQSSAT"),

	/**
	 * The '<em><b>RQESAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RQESAT_VALUE
	 * @generated
	 * @ordered
	 */
	RQESAT(3, "RQESAT", "RQESAT");

	/**
	 * The '<em><b>RQSEAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RQSEAT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RQSEAT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RQSEAT_VALUE = 0;

	/**
	 * The '<em><b>RQEEAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RQEEAT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RQEEAT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RQEEAT_VALUE = 1;

	/**
	 * The '<em><b>RQSSAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RQSSAT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RQSSAT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RQSSAT_VALUE = 2;

	/**
	 * The '<em><b>RQESAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RQESAT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RQESAT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RQESAT_VALUE = 3;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Etat Action Qualificatif Rapport</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoEtatActionQualificatifRapport[] VALUES_ARRAY =
		new TypeDictionaryDicoEtatActionQualificatifRapport[] {
			RQSEAT,
			RQEEAT,
			RQSSAT,
			RQESAT,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Etat Action Qualificatif Rapport</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoEtatActionQualificatifRapport> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Etat Action Qualificatif Rapport</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoEtatActionQualificatifRapport get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoEtatActionQualificatifRapport result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Etat Action Qualificatif Rapport</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoEtatActionQualificatifRapport getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoEtatActionQualificatifRapport result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Etat Action Qualificatif Rapport</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoEtatActionQualificatifRapport get(int value) {
		switch (value) {
			case RQSEAT_VALUE: return RQSEAT;
			case RQEEAT_VALUE: return RQEEAT;
			case RQSSAT_VALUE: return RQSSAT;
			case RQESAT_VALUE: return RQESAT;
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
	private TypeDictionaryDicoEtatActionQualificatifRapport(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoEtatActionQualificatifRapport
