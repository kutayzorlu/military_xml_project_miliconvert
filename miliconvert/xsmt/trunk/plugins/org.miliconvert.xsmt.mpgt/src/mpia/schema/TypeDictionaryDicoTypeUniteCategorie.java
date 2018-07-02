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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Type Unite Categorie</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoTypeUniteCategorie()
 * @model extendedMetaData="name='type_Dictionary_Dico_TypeUniteCategorie'"
 * @generated
 */
public enum TypeDictionaryDicoTypeUniteCategorie implements Enumerator {
	/**
	 * The '<em><b>COMBAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMBAT_VALUE
	 * @generated
	 * @ordered
	 */
	COMBAT(0, "COMBAT", "COMBAT"),

	/**
	 * The '<em><b>COMSER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMSER_VALUE
	 * @generated
	 * @ordered
	 */
	COMSER(1, "COMSER", "COMSER"),

	/**
	 * The '<em><b>COMSPT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMSPT_VALUE
	 * @generated
	 * @ordered
	 */
	COMSPT(2, "COMSPT", "COMSPT"),

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
	 * The '<em><b>SOF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOF_VALUE
	 * @generated
	 * @ordered
	 */
	SOF(4, "SOF", "SOF");

	/**
	 * The '<em><b>COMBAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMBAT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMBAT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMBAT_VALUE = 0;

	/**
	 * The '<em><b>COMSER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMSER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMSER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMSER_VALUE = 1;

	/**
	 * The '<em><b>COMSPT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMSPT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMSPT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMSPT_VALUE = 2;

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
	 * The '<em><b>SOF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SOF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SOF_VALUE = 4;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Type Unite Categorie</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoTypeUniteCategorie[] VALUES_ARRAY =
		new TypeDictionaryDicoTypeUniteCategorie[] {
			COMBAT,
			COMSER,
			COMSPT,
			NKN,
			SOF,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Type Unite Categorie</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoTypeUniteCategorie> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Type Unite Categorie</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoTypeUniteCategorie get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoTypeUniteCategorie result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Type Unite Categorie</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoTypeUniteCategorie getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoTypeUniteCategorie result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Type Unite Categorie</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoTypeUniteCategorie get(int value) {
		switch (value) {
			case COMBAT_VALUE: return COMBAT;
			case COMSER_VALUE: return COMSER;
			case COMSPT_VALUE: return COMSPT;
			case NKN_VALUE: return NKN;
			case SOF_VALUE: return SOF;
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
	private TypeDictionaryDicoTypeUniteCategorie(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoTypeUniteCategorie
