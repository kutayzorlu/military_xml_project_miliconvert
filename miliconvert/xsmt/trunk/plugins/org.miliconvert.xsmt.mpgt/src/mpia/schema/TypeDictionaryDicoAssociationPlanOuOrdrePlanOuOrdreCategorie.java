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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Association Plan Ou Ordre Plan Ou Ordre Categorie</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoAssociationPlanOuOrdrePlanOuOrdreCategorie()
 * @model extendedMetaData="name='type_Dictionary_Dico_AssociationPlanOuOrdrePlanOuOrdreCategorie'"
 * @generated
 */
public enum TypeDictionaryDicoAssociationPlanOuOrdrePlanOuOrdreCategorie implements Enumerator {
	/**
	 * The '<em><b>ISAMND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISAMND_VALUE
	 * @generated
	 * @ordered
	 */
	ISAMND(0, "ISAMND", "ISAMND"),

	/**
	 * The '<em><b>ISDTCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISDTCH_VALUE
	 * @generated
	 * @ordered
	 */
	ISDTCH(1, "ISDTCH", "ISDTCH"),

	/**
	 * The '<em><b>ISORDR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISORDR_VALUE
	 * @generated
	 * @ordered
	 */
	ISORDR(2, "ISORDR", "ISORDR"),

	/**
	 * The '<em><b>ISSPRD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISSPRD_VALUE
	 * @generated
	 * @ordered
	 */
	ISSPRD(3, "ISSPRD", "ISSPRD"),

	/**
	 * The '<em><b>ISSUPP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISSUPP_VALUE
	 * @generated
	 * @ordered
	 */
	ISSUPP(4, "ISSUPP", "ISSUPP");

	/**
	 * The '<em><b>ISAMND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ISAMND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ISAMND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ISAMND_VALUE = 0;

	/**
	 * The '<em><b>ISDTCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ISDTCH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ISDTCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ISDTCH_VALUE = 1;

	/**
	 * The '<em><b>ISORDR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ISORDR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ISORDR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ISORDR_VALUE = 2;

	/**
	 * The '<em><b>ISSPRD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ISSPRD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ISSPRD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ISSPRD_VALUE = 3;

	/**
	 * The '<em><b>ISSUPP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ISSUPP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ISSUPP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ISSUPP_VALUE = 4;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Association Plan Ou Ordre Plan Ou Ordre Categorie</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoAssociationPlanOuOrdrePlanOuOrdreCategorie[] VALUES_ARRAY =
		new TypeDictionaryDicoAssociationPlanOuOrdrePlanOuOrdreCategorie[] {
			ISAMND,
			ISDTCH,
			ISORDR,
			ISSPRD,
			ISSUPP,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Association Plan Ou Ordre Plan Ou Ordre Categorie</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoAssociationPlanOuOrdrePlanOuOrdreCategorie> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Association Plan Ou Ordre Plan Ou Ordre Categorie</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoAssociationPlanOuOrdrePlanOuOrdreCategorie get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoAssociationPlanOuOrdrePlanOuOrdreCategorie result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Association Plan Ou Ordre Plan Ou Ordre Categorie</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoAssociationPlanOuOrdrePlanOuOrdreCategorie getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoAssociationPlanOuOrdrePlanOuOrdreCategorie result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Association Plan Ou Ordre Plan Ou Ordre Categorie</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoAssociationPlanOuOrdrePlanOuOrdreCategorie get(int value) {
		switch (value) {
			case ISAMND_VALUE: return ISAMND;
			case ISDTCH_VALUE: return ISDTCH;
			case ISORDR_VALUE: return ISORDR;
			case ISSPRD_VALUE: return ISSPRD;
			case ISSUPP_VALUE: return ISSUPP;
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
	private TypeDictionaryDicoAssociationPlanOuOrdrePlanOuOrdreCategorie(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoAssociationPlanOuOrdrePlanOuOrdreCategorie
