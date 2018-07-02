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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Mouvement Par Route Categorie</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoMouvementParRouteCategorie()
 * @model extendedMetaData="name='type_Dictionary_Dico_MouvementParRouteCategorie'"
 * @generated
 */
public enum TypeDictionaryDicoMouvementParRouteCategorie implements Enumerator {
	/**
	 * The '<em><b>ALLOCROA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALLOCROA_VALUE
	 * @generated
	 * @ordered
	 */
	ALLOCROA(0, "ALLOCROA", "ALLOCROA"),

	/**
	 * The '<em><b>ALLOCHPR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALLOCHPR_VALUE
	 * @generated
	 * @ordered
	 */
	ALLOCHPR(1, "ALLOCHPR", "ALLOCHPR"),

	/**
	 * The '<em><b>REQ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQ_VALUE
	 * @generated
	 * @ordered
	 */
	REQ(2, "REQ", "REQ"),

	/**
	 * The '<em><b>MVT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MVT_VALUE
	 * @generated
	 * @ordered
	 */
	MVT(3, "MVT", "MVT");

	/**
	 * The '<em><b>ALLOCROA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ALLOCROA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALLOCROA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ALLOCROA_VALUE = 0;

	/**
	 * The '<em><b>ALLOCHPR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ALLOCHPR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALLOCHPR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ALLOCHPR_VALUE = 1;

	/**
	 * The '<em><b>REQ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REQ</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REQ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REQ_VALUE = 2;

	/**
	 * The '<em><b>MVT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MVT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MVT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MVT_VALUE = 3;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Mouvement Par Route Categorie</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoMouvementParRouteCategorie[] VALUES_ARRAY =
		new TypeDictionaryDicoMouvementParRouteCategorie[] {
			ALLOCROA,
			ALLOCHPR,
			REQ,
			MVT,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Mouvement Par Route Categorie</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoMouvementParRouteCategorie> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Mouvement Par Route Categorie</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoMouvementParRouteCategorie get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoMouvementParRouteCategorie result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Mouvement Par Route Categorie</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoMouvementParRouteCategorie getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoMouvementParRouteCategorie result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Mouvement Par Route Categorie</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoMouvementParRouteCategorie get(int value) {
		switch (value) {
			case ALLOCROA_VALUE: return ALLOCROA;
			case ALLOCHPR_VALUE: return ALLOCHPR;
			case REQ_VALUE: return REQ;
			case MVT_VALUE: return MVT;
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
	private TypeDictionaryDicoMouvementParRouteCategorie(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoMouvementParRouteCategorie
