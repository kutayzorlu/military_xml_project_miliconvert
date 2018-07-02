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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Type Deplacement</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoTypeDeplacement()
 * @model extendedMetaData="name='type_Dictionary_Dico_TypeDeplacement'"
 * @generated
 */
public enum TypeDictionaryDicoTypeDeplacement implements Enumerator {
	/**
	 * The '<em><b>By Day And Night</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BY_DAY_AND_NIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	BY_DAY_AND_NIGHT(0, "ByDayAndNight", "By day and night"),

	/**
	 * The '<em><b>By Day</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BY_DAY_VALUE
	 * @generated
	 * @ordered
	 */
	BY_DAY(1, "ByDay", "By day"),

	/**
	 * The '<em><b>By Night</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BY_NIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	BY_NIGHT(2, "ByNight", "By night");

	/**
	 * The '<em><b>By Day And Night</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>By Day And Night</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BY_DAY_AND_NIGHT
	 * @model name="ByDayAndNight" literal="By day and night"
	 * @generated
	 * @ordered
	 */
	public static final int BY_DAY_AND_NIGHT_VALUE = 0;

	/**
	 * The '<em><b>By Day</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>By Day</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BY_DAY
	 * @model name="ByDay" literal="By day"
	 * @generated
	 * @ordered
	 */
	public static final int BY_DAY_VALUE = 1;

	/**
	 * The '<em><b>By Night</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>By Night</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BY_NIGHT
	 * @model name="ByNight" literal="By night"
	 * @generated
	 * @ordered
	 */
	public static final int BY_NIGHT_VALUE = 2;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Type Deplacement</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoTypeDeplacement[] VALUES_ARRAY =
		new TypeDictionaryDicoTypeDeplacement[] {
			BY_DAY_AND_NIGHT,
			BY_DAY,
			BY_NIGHT,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Type Deplacement</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoTypeDeplacement> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Type Deplacement</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoTypeDeplacement get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoTypeDeplacement result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Type Deplacement</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoTypeDeplacement getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoTypeDeplacement result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Type Deplacement</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoTypeDeplacement get(int value) {
		switch (value) {
			case BY_DAY_AND_NIGHT_VALUE: return BY_DAY_AND_NIGHT;
			case BY_DAY_VALUE: return BY_DAY;
			case BY_NIGHT_VALUE: return BY_NIGHT;
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
	private TypeDictionaryDicoTypeDeplacement(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoTypeDeplacement
