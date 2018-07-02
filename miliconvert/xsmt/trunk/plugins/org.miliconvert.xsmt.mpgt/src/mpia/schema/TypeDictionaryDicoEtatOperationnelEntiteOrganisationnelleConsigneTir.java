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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Etat Operationnel Entite Organisationnelle Consigne Tir</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleConsigneTir()
 * @model extendedMetaData="name='type_Dictionary_Dico_EtatOperationnelEntiteOrganisationnelleConsigneTir'"
 * @generated
 */
public enum TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleConsigneTir implements Enumerator {
	/**
	 * The '<em><b>HLDFIR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HLDFIR_VALUE
	 * @generated
	 * @ordered
	 */
	HLDFIR(0, "HLDFIR", "HLDFIR"),

	/**
	 * The '<em><b>WPNFRE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WPNFRE_VALUE
	 * @generated
	 * @ordered
	 */
	WPNFRE(1, "WPNFRE", "WPNFRE"),

	/**
	 * The '<em><b>WPNTGT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WPNTGT_VALUE
	 * @generated
	 * @ordered
	 */
	WPNTGT(2, "WPNTGT", "WPNTGT"),

	/**
	 * The '<em><b>NKN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NKN_VALUE
	 * @generated
	 * @ordered
	 */
	NKN(3, "NKN", "NKN"),

	/**
	 * The '<em><b>WPNHLD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WPNHLD_VALUE
	 * @generated
	 * @ordered
	 */
	WPNHLD(4, "WPNHLD", "WPNHLD");

	/**
	 * The '<em><b>HLDFIR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HLDFIR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HLDFIR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HLDFIR_VALUE = 0;

	/**
	 * The '<em><b>WPNFRE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WPNFRE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WPNFRE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WPNFRE_VALUE = 1;

	/**
	 * The '<em><b>WPNTGT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WPNTGT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WPNTGT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WPNTGT_VALUE = 2;

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
	public static final int NKN_VALUE = 3;

	/**
	 * The '<em><b>WPNHLD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WPNHLD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WPNHLD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WPNHLD_VALUE = 4;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Etat Operationnel Entite Organisationnelle Consigne Tir</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleConsigneTir[] VALUES_ARRAY =
		new TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleConsigneTir[] {
			HLDFIR,
			WPNFRE,
			WPNTGT,
			NKN,
			WPNHLD,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Etat Operationnel Entite Organisationnelle Consigne Tir</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleConsigneTir> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Etat Operationnel Entite Organisationnelle Consigne Tir</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleConsigneTir get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleConsigneTir result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Etat Operationnel Entite Organisationnelle Consigne Tir</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleConsigneTir getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleConsigneTir result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Etat Operationnel Entite Organisationnelle Consigne Tir</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleConsigneTir get(int value) {
		switch (value) {
			case HLDFIR_VALUE: return HLDFIR;
			case WPNFRE_VALUE: return WPNFRE;
			case WPNTGT_VALUE: return WPNTGT;
			case NKN_VALUE: return NKN;
			case WPNHLD_VALUE: return WPNHLD;
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
	private TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleConsigneTir(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoEtatOperationnelEntiteOrganisationnelleConsigneTir
