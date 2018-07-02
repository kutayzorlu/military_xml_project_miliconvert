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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Assoc Liste Obj Cand Liste Obj Cand Categorie</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoAssocListeObjCandListeObjCandCategorie()
 * @model extendedMetaData="name='type_Dictionary_Dico_AssocListeObjCandListeObjCandCategorie'"
 * @generated
 */
public enum TypeDictionaryDicoAssocListeObjCandListeObjCandCategorie implements Enumerator {
	/**
	 * The '<em><b>COMPNT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPNT_VALUE
	 * @generated
	 * @ordered
	 */
	COMPNT(0, "COMPNT", "COMPNT"),

	/**
	 * The '<em><b>INCPRT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCPRT_VALUE
	 * @generated
	 * @ordered
	 */
	INCPRT(1, "INCPRT", "INCPRT"),

	/**
	 * The '<em><b>PRECED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRECED_VALUE
	 * @generated
	 * @ordered
	 */
	PRECED(2, "PRECED", "PRECED"),

	/**
	 * The '<em><b>REPLAC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPLAC_VALUE
	 * @generated
	 * @ordered
	 */
	REPLAC(3, "REPLAC", "REPLAC");

	/**
	 * The '<em><b>COMPNT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMPNT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPNT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPNT_VALUE = 0;

	/**
	 * The '<em><b>INCPRT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INCPRT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INCPRT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INCPRT_VALUE = 1;

	/**
	 * The '<em><b>PRECED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PRECED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRECED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRECED_VALUE = 2;

	/**
	 * The '<em><b>REPLAC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REPLAC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REPLAC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REPLAC_VALUE = 3;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Assoc Liste Obj Cand Liste Obj Cand Categorie</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoAssocListeObjCandListeObjCandCategorie[] VALUES_ARRAY =
		new TypeDictionaryDicoAssocListeObjCandListeObjCandCategorie[] {
			COMPNT,
			INCPRT,
			PRECED,
			REPLAC,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Assoc Liste Obj Cand Liste Obj Cand Categorie</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoAssocListeObjCandListeObjCandCategorie> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Assoc Liste Obj Cand Liste Obj Cand Categorie</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoAssocListeObjCandListeObjCandCategorie get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoAssocListeObjCandListeObjCandCategorie result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Assoc Liste Obj Cand Liste Obj Cand Categorie</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoAssocListeObjCandListeObjCandCategorie getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoAssocListeObjCandListeObjCandCategorie result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Assoc Liste Obj Cand Liste Obj Cand Categorie</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoAssocListeObjCandListeObjCandCategorie get(int value) {
		switch (value) {
			case COMPNT_VALUE: return COMPNT;
			case INCPRT_VALUE: return INCPRT;
			case PRECED_VALUE: return PRECED;
			case REPLAC_VALUE: return REPLAC;
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
	private TypeDictionaryDicoAssocListeObjCandListeObjCandCategorie(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoAssocListeObjCandListeObjCandCategorie
