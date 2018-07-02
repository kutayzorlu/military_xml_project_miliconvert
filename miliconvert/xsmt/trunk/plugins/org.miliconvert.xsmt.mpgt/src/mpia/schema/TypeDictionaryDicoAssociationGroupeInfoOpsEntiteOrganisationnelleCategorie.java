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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Association Groupe Info Ops Entite Organisationnelle Categorie</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoAssociationGroupeInfoOpsEntiteOrganisationnelleCategorie()
 * @model extendedMetaData="name='type_Dictionary_Dico_AssociationGroupeInfoOpsEntiteOrganisationnelleCategorie'"
 * @generated
 */
public enum TypeDictionaryDicoAssociationGroupeInfoOpsEntiteOrganisationnelleCategorie implements Enumerator {
	/**
	 * The '<em><b>RESP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESP_VALUE
	 * @generated
	 * @ordered
	 */
	RESP(0, "RESP", "RESP"),

	/**
	 * The '<em><b>PROXY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROXY_VALUE
	 * @generated
	 * @ordered
	 */
	PROXY(1, "PROXY", "PROXY");

	/**
	 * The '<em><b>RESP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RESP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RESP_VALUE = 0;

	/**
	 * The '<em><b>PROXY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PROXY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROXY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROXY_VALUE = 1;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Association Groupe Info Ops Entite Organisationnelle Categorie</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoAssociationGroupeInfoOpsEntiteOrganisationnelleCategorie[] VALUES_ARRAY =
		new TypeDictionaryDicoAssociationGroupeInfoOpsEntiteOrganisationnelleCategorie[] {
			RESP,
			PROXY,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Association Groupe Info Ops Entite Organisationnelle Categorie</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoAssociationGroupeInfoOpsEntiteOrganisationnelleCategorie> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Association Groupe Info Ops Entite Organisationnelle Categorie</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoAssociationGroupeInfoOpsEntiteOrganisationnelleCategorie get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoAssociationGroupeInfoOpsEntiteOrganisationnelleCategorie result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Association Groupe Info Ops Entite Organisationnelle Categorie</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoAssociationGroupeInfoOpsEntiteOrganisationnelleCategorie getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoAssociationGroupeInfoOpsEntiteOrganisationnelleCategorie result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Association Groupe Info Ops Entite Organisationnelle Categorie</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoAssociationGroupeInfoOpsEntiteOrganisationnelleCategorie get(int value) {
		switch (value) {
			case RESP_VALUE: return RESP;
			case PROXY_VALUE: return PROXY;
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
	private TypeDictionaryDicoAssociationGroupeInfoOpsEntiteOrganisationnelleCategorie(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoAssociationGroupeInfoOpsEntiteOrganisationnelleCategorie
