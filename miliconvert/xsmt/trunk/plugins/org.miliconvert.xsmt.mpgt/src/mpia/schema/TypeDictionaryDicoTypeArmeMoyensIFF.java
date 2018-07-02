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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Type Arme Moyens IFF</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoTypeArmeMoyensIFF()
 * @model extendedMetaData="name='type_Dictionary_Dico_TypeArmeMoyensIFF'"
 * @generated
 */
public enum TypeDictionaryDicoTypeArmeMoyensIFF implements Enumerator {
	/**
	 * The '<em><b>SHORAD1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHORAD1_VALUE
	 * @generated
	 * @ordered
	 */
	SHORAD1(0, "SHORAD1", "SHORAD1"),

	/**
	 * The '<em><b>SHORAD2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHORAD2_VALUE
	 * @generated
	 * @ordered
	 */
	SHORAD2(1, "SHORAD2", "SHORAD2"),

	/**
	 * The '<em><b>SHORAD3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHORAD3_VALUE
	 * @generated
	 * @ordered
	 */
	SHORAD3(2, "SHORAD3", "SHORAD3");

	/**
	 * The '<em><b>SHORAD1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SHORAD1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHORAD1
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SHORAD1_VALUE = 0;

	/**
	 * The '<em><b>SHORAD2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SHORAD2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHORAD2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SHORAD2_VALUE = 1;

	/**
	 * The '<em><b>SHORAD3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SHORAD3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHORAD3
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SHORAD3_VALUE = 2;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Type Arme Moyens IFF</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoTypeArmeMoyensIFF[] VALUES_ARRAY =
		new TypeDictionaryDicoTypeArmeMoyensIFF[] {
			SHORAD1,
			SHORAD2,
			SHORAD3,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Type Arme Moyens IFF</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoTypeArmeMoyensIFF> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Type Arme Moyens IFF</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoTypeArmeMoyensIFF get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoTypeArmeMoyensIFF result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Type Arme Moyens IFF</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoTypeArmeMoyensIFF getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoTypeArmeMoyensIFF result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Type Arme Moyens IFF</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoTypeArmeMoyensIFF get(int value) {
		switch (value) {
			case SHORAD1_VALUE: return SHORAD1;
			case SHORAD2_VALUE: return SHORAD2;
			case SHORAD3_VALUE: return SHORAD3;
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
	private TypeDictionaryDicoTypeArmeMoyensIFF(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoTypeArmeMoyensIFF
