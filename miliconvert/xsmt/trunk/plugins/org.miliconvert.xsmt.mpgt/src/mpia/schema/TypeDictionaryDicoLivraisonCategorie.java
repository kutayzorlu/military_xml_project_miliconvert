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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Livraison Categorie</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoLivraisonCategorie()
 * @model extendedMetaData="name='type_Dictionary_Dico_LivraisonCategorie'"
 * @generated
 */
public enum TypeDictionaryDicoLivraisonCategorie implements Enumerator {
	/**
	 * The '<em><b>DEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEL_VALUE
	 * @generated
	 * @ordered
	 */
	DEL(0, "DEL", "DEL"),

	/**
	 * The '<em><b>PREV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREV_VALUE
	 * @generated
	 * @ordered
	 */
	PREV(1, "PREV", "PREV"),

	/**
	 * The '<em><b>ORD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORD_VALUE
	 * @generated
	 * @ordered
	 */
	ORD(2, "ORD", "ORD"),

	/**
	 * The '<em><b>LIV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIV_VALUE
	 * @generated
	 * @ordered
	 */
	LIV(3, "LIV", "LIV"),

	/**
	 * The '<em><b>ORDEXC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORDEXC_VALUE
	 * @generated
	 * @ordered
	 */
	ORDEXC(4, "ORDEXC", "ORDEXC"),

	/**
	 * The '<em><b>DEMEXC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEMEXC_VALUE
	 * @generated
	 * @ordered
	 */
	DEMEXC(5, "DEMEXC", "DEMEXC");

	/**
	 * The '<em><b>DEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEL_VALUE = 0;

	/**
	 * The '<em><b>PREV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PREV</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PREV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PREV_VALUE = 1;

	/**
	 * The '<em><b>ORD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ORD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ORD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ORD_VALUE = 2;

	/**
	 * The '<em><b>LIV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LIV</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LIV_VALUE = 3;

	/**
	 * The '<em><b>ORDEXC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ORDEXC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ORDEXC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ORDEXC_VALUE = 4;

	/**
	 * The '<em><b>DEMEXC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DEMEXC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEMEXC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEMEXC_VALUE = 5;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Livraison Categorie</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoLivraisonCategorie[] VALUES_ARRAY =
		new TypeDictionaryDicoLivraisonCategorie[] {
			DEL,
			PREV,
			ORD,
			LIV,
			ORDEXC,
			DEMEXC,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Livraison Categorie</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoLivraisonCategorie> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Livraison Categorie</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoLivraisonCategorie get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoLivraisonCategorie result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Livraison Categorie</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoLivraisonCategorie getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoLivraisonCategorie result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Livraison Categorie</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoLivraisonCategorie get(int value) {
		switch (value) {
			case DEL_VALUE: return DEL;
			case PREV_VALUE: return PREV;
			case ORD_VALUE: return ORD;
			case LIV_VALUE: return LIV;
			case ORDEXC_VALUE: return ORDEXC;
			case DEMEXC_VALUE: return DEMEXC;
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
	private TypeDictionaryDicoLivraisonCategorie(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoLivraisonCategorie
