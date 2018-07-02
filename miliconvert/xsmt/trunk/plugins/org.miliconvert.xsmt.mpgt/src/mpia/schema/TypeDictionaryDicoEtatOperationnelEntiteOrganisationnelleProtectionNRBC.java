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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Etat Operationnel Entite Organisationnelle Protection NRBC</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleProtectionNRBC()
 * @model extendedMetaData="name='type_Dictionary_Dico_EtatOperationnelEntiteOrganisationnelleProtectionNRBC'"
 * @generated
 */
public enum TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleProtectionNRBC implements Enumerator {
	/**
	 * The '<em><b>MOPPRY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOPPRY_VALUE
	 * @generated
	 * @ordered
	 */
	MOPPRY(0, "MOPPRY", "MOPPRY"),

	/**
	 * The '<em><b>MOPP0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOPP0_VALUE
	 * @generated
	 * @ordered
	 */
	MOPP0(1, "MOPP0", "MOPP0"),

	/**
	 * The '<em><b>MOPP1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOPP1_VALUE
	 * @generated
	 * @ordered
	 */
	MOPP1(2, "MOPP1", "MOPP1"),

	/**
	 * The '<em><b>MOPP2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOPP2_VALUE
	 * @generated
	 * @ordered
	 */
	MOPP2(3, "MOPP2", "MOPP2"),

	/**
	 * The '<em><b>MOPP3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOPP3_VALUE
	 * @generated
	 * @ordered
	 */
	MOPP3(4, "MOPP3", "MOPP3");

	/**
	 * The '<em><b>MOPPRY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MOPPRY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOPPRY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOPPRY_VALUE = 0;

	/**
	 * The '<em><b>MOPP0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MOPP0</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOPP0
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOPP0_VALUE = 1;

	/**
	 * The '<em><b>MOPP1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MOPP1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOPP1
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOPP1_VALUE = 2;

	/**
	 * The '<em><b>MOPP2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MOPP2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOPP2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOPP2_VALUE = 3;

	/**
	 * The '<em><b>MOPP3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MOPP3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOPP3
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOPP3_VALUE = 4;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Etat Operationnel Entite Organisationnelle Protection NRBC</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleProtectionNRBC[] VALUES_ARRAY =
		new TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleProtectionNRBC[] {
			MOPPRY,
			MOPP0,
			MOPP1,
			MOPP2,
			MOPP3,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Etat Operationnel Entite Organisationnelle Protection NRBC</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleProtectionNRBC> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Etat Operationnel Entite Organisationnelle Protection NRBC</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleProtectionNRBC get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleProtectionNRBC result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Etat Operationnel Entite Organisationnelle Protection NRBC</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleProtectionNRBC getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleProtectionNRBC result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Etat Operationnel Entite Organisationnelle Protection NRBC</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleProtectionNRBC get(int value) {
		switch (value) {
			case MOPPRY_VALUE: return MOPPRY;
			case MOPP0_VALUE: return MOPP0;
			case MOPP1_VALUE: return MOPP1;
			case MOPP2_VALUE: return MOPP2;
			case MOPP3_VALUE: return MOPP3;
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
	private TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleProtectionNRBC(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleProtectionNRBC
