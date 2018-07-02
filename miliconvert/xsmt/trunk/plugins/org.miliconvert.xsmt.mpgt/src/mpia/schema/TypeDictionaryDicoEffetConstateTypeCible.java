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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Effet Constate Type Cible</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoEffetConstateTypeCible()
 * @model extendedMetaData="name='type_Dictionary_Dico_EffetConstateTypeCible'"
 * @generated
 */
public enum TypeDictionaryDicoEffetConstateTypeCible implements Enumerator {
	/**
	 * The '<em><b>ARMOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARMOR_VALUE
	 * @generated
	 * @ordered
	 */
	ARMOR(0, "ARMOR", "ARMOR"),

	/**
	 * The '<em><b>PERS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERS_VALUE
	 * @generated
	 * @ordered
	 */
	PERS(1, "PERS", "PERS"),

	/**
	 * The '<em><b>VEHCLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VEHCLE_VALUE
	 * @generated
	 * @ordered
	 */
	VEHCLE(2, "VEHCLE", "VEHCLE"),

	/**
	 * The '<em><b>INFRA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFRA_VALUE
	 * @generated
	 * @ordered
	 */
	INFRA(3, "INFRA", "INFRA"),

	/**
	 * The '<em><b>LARMOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LARMOR_VALUE
	 * @generated
	 * @ordered
	 */
	LARMOR(4, "LARMOR", "LARMOR");

	/**
	 * The '<em><b>ARMOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ARMOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARMOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ARMOR_VALUE = 0;

	/**
	 * The '<em><b>PERS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PERS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PERS_VALUE = 1;

	/**
	 * The '<em><b>VEHCLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VEHCLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VEHCLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VEHCLE_VALUE = 2;

	/**
	 * The '<em><b>INFRA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INFRA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INFRA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INFRA_VALUE = 3;

	/**
	 * The '<em><b>LARMOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LARMOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LARMOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LARMOR_VALUE = 4;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Effet Constate Type Cible</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoEffetConstateTypeCible[] VALUES_ARRAY =
		new TypeDictionaryDicoEffetConstateTypeCible[] {
			ARMOR,
			PERS,
			VEHCLE,
			INFRA,
			LARMOR,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Effet Constate Type Cible</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoEffetConstateTypeCible> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Effet Constate Type Cible</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoEffetConstateTypeCible get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoEffetConstateTypeCible result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Effet Constate Type Cible</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoEffetConstateTypeCible getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoEffetConstateTypeCible result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Effet Constate Type Cible</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoEffetConstateTypeCible get(int value) {
		switch (value) {
			case ARMOR_VALUE: return ARMOR;
			case PERS_VALUE: return PERS;
			case VEHCLE_VALUE: return VEHCLE;
			case INFRA_VALUE: return INFRA;
			case LARMOR_VALUE: return LARMOR;
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
	private TypeDictionaryDicoEffetConstateTypeCible(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoEffetConstateTypeCible
