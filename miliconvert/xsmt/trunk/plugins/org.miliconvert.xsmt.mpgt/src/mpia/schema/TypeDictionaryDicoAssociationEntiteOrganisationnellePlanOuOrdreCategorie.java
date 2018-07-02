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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Association Entite Organisationnelle Plan Ou Ordre Categorie</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoAssociationEntiteOrganisationnellePlanOuOrdreCategorie()
 * @model extendedMetaData="name='type_Dictionary_Dico_AssociationEntiteOrganisationnellePlanOuOrdreCategorie'"
 * @generated
 */
public enum TypeDictionaryDicoAssociationEntiteOrganisationnellePlanOuOrdreCategorie implements Enumerator {
	/**
	 * The '<em><b>APPR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPR_VALUE
	 * @generated
	 * @ordered
	 */
	APPR(0, "APPR", "APPR"),

	/**
	 * The '<em><b>DISTR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISTR_VALUE
	 * @generated
	 * @ordered
	 */
	DISTR(1, "DISTR", "DISTR"),

	/**
	 * The '<em><b>PREP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREP_VALUE
	 * @generated
	 * @ordered
	 */
	PREP(2, "PREP", "PREP"),

	/**
	 * The '<em><b>EXEC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXEC_VALUE
	 * @generated
	 * @ordered
	 */
	EXEC(3, "EXEC", "EXEC"),

	/**
	 * The '<em><b>ISSHQ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISSHQ_VALUE
	 * @generated
	 * @ordered
	 */
	ISSHQ(4, "ISSHQ", "ISSHQ");

	/**
	 * The '<em><b>APPR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>APPR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #APPR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int APPR_VALUE = 0;

	/**
	 * The '<em><b>DISTR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DISTR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISTR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DISTR_VALUE = 1;

	/**
	 * The '<em><b>PREP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PREP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PREP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PREP_VALUE = 2;

	/**
	 * The '<em><b>EXEC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EXEC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXEC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXEC_VALUE = 3;

	/**
	 * The '<em><b>ISSHQ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ISSHQ</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ISSHQ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ISSHQ_VALUE = 4;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Association Entite Organisationnelle Plan Ou Ordre Categorie</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoAssociationEntiteOrganisationnellePlanOuOrdreCategorie[] VALUES_ARRAY =
		new TypeDictionaryDicoAssociationEntiteOrganisationnellePlanOuOrdreCategorie[] {
			APPR,
			DISTR,
			PREP,
			EXEC,
			ISSHQ,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Association Entite Organisationnelle Plan Ou Ordre Categorie</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoAssociationEntiteOrganisationnellePlanOuOrdreCategorie> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Association Entite Organisationnelle Plan Ou Ordre Categorie</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoAssociationEntiteOrganisationnellePlanOuOrdreCategorie get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoAssociationEntiteOrganisationnellePlanOuOrdreCategorie result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Association Entite Organisationnelle Plan Ou Ordre Categorie</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoAssociationEntiteOrganisationnellePlanOuOrdreCategorie getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoAssociationEntiteOrganisationnellePlanOuOrdreCategorie result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Association Entite Organisationnelle Plan Ou Ordre Categorie</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoAssociationEntiteOrganisationnellePlanOuOrdreCategorie get(int value) {
		switch (value) {
			case APPR_VALUE: return APPR;
			case DISTR_VALUE: return DISTR;
			case PREP_VALUE: return PREP;
			case EXEC_VALUE: return EXEC;
			case ISSHQ_VALUE: return ISSHQ;
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
	private TypeDictionaryDicoAssociationEntiteOrganisationnellePlanOuOrdreCategorie(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoAssociationEntiteOrganisationnellePlanOuOrdreCategorie
