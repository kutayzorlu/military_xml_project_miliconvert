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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Blesses Par Periode Categorie</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoBlessesParPeriodeCategorie()
 * @model extendedMetaData="name='type_Dictionary_Dico_BlessesParPeriodeCategorie'"
 * @generated
 */
public enum TypeDictionaryDicoBlessesParPeriodeCategorie implements Enumerator {
	/**
	 * The '<em><b>NONBAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONBAT_VALUE
	 * @generated
	 * @ordered
	 */
	NONBAT(0, "NONBAT", "NONBAT"),

	/**
	 * The '<em><b>DISEAS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISEAS_VALUE
	 * @generated
	 * @ordered
	 */
	DISEAS(1, "DISEAS", "DISEAS"),

	/**
	 * The '<em><b>WOUND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WOUND_VALUE
	 * @generated
	 * @ordered
	 */
	WOUND(2, "WOUND", "WOUND"),

	/**
	 * The '<em><b>BTLSTR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BTLSTR_VALUE
	 * @generated
	 * @ordered
	 */
	BTLSTR(3, "BTLSTR", "BTLSTR");

	/**
	 * The '<em><b>NONBAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NONBAT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONBAT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NONBAT_VALUE = 0;

	/**
	 * The '<em><b>DISEAS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DISEAS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISEAS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DISEAS_VALUE = 1;

	/**
	 * The '<em><b>WOUND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WOUND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WOUND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WOUND_VALUE = 2;

	/**
	 * The '<em><b>BTLSTR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BTLSTR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BTLSTR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BTLSTR_VALUE = 3;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Blesses Par Periode Categorie</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoBlessesParPeriodeCategorie[] VALUES_ARRAY =
		new TypeDictionaryDicoBlessesParPeriodeCategorie[] {
			NONBAT,
			DISEAS,
			WOUND,
			BTLSTR,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Blesses Par Periode Categorie</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoBlessesParPeriodeCategorie> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Blesses Par Periode Categorie</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoBlessesParPeriodeCategorie get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoBlessesParPeriodeCategorie result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Blesses Par Periode Categorie</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoBlessesParPeriodeCategorie getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoBlessesParPeriodeCategorie result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Blesses Par Periode Categorie</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoBlessesParPeriodeCategorie get(int value) {
		switch (value) {
			case NONBAT_VALUE: return NONBAT;
			case DISEAS_VALUE: return DISEAS;
			case WOUND_VALUE: return WOUND;
			case BTLSTR_VALUE: return BTLSTR;
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
	private TypeDictionaryDicoBlessesParPeriodeCategorie(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoBlessesParPeriodeCategorie
