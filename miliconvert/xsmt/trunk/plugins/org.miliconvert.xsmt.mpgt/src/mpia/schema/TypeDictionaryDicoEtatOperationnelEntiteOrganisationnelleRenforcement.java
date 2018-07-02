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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Etat Operationnel Entite Organisationnelle Renforcement</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleRenforcement()
 * @model extendedMetaData="name='type_Dictionary_Dico_EtatOperationnelEntiteOrganisationnelleRenforcement'"
 * @generated
 */
public enum TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleRenforcement implements Enumerator {
	/**
	 * The '<em><b>DETD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DETD_VALUE
	 * @generated
	 * @ordered
	 */
	DETD(0, "DETD", "DETD"),

	/**
	 * The '<em><b>NORM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORM_VALUE
	 * @generated
	 * @ordered
	 */
	NORM(1, "NORM", "NORM"),

	/**
	 * The '<em><b>RIDT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIDT_VALUE
	 * @generated
	 * @ordered
	 */
	RIDT(2, "RIDT", "RIDT"),

	/**
	 * The '<em><b>REIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REIN_VALUE
	 * @generated
	 * @ordered
	 */
	REIN(3, "REIN", "REIN"),

	/**
	 * The '<em><b>NKN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NKN_VALUE
	 * @generated
	 * @ordered
	 */
	NKN(4, "NKN", "NKN");

	/**
	 * The '<em><b>DETD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DETD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DETD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DETD_VALUE = 0;

	/**
	 * The '<em><b>NORM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NORM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NORM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NORM_VALUE = 1;

	/**
	 * The '<em><b>RIDT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RIDT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RIDT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RIDT_VALUE = 2;

	/**
	 * The '<em><b>REIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REIN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REIN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REIN_VALUE = 3;

	/**
	 * The '<em><b>NKN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NKN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NKN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NKN_VALUE = 4;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Etat Operationnel Entite Organisationnelle Renforcement</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleRenforcement[] VALUES_ARRAY =
		new TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleRenforcement[] {
			DETD,
			NORM,
			RIDT,
			REIN,
			NKN,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Etat Operationnel Entite Organisationnelle Renforcement</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleRenforcement> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Etat Operationnel Entite Organisationnelle Renforcement</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleRenforcement get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleRenforcement result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Etat Operationnel Entite Organisationnelle Renforcement</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleRenforcement getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleRenforcement result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Etat Operationnel Entite Organisationnelle Renforcement</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleRenforcement get(int value) {
		switch (value) {
			case DETD_VALUE: return DETD;
			case NORM_VALUE: return NORM;
			case RIDT_VALUE: return RIDT;
			case REIN_VALUE: return REIN;
			case NKN_VALUE: return NKN;
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
	private TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleRenforcement(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleRenforcement
