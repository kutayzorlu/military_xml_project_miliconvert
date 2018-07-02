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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Atmosphere Gradient Temperature</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoAtmosphereGradientTemperature()
 * @model extendedMetaData="name='type_Dictionary_Dico_AtmosphereGradientTemperature'"
 * @generated
 */
public enum TypeDictionaryDicoAtmosphereGradientTemperature implements Enumerator {
	/**
	 * The '<em><b>NKN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NKN_VALUE
	 * @generated
	 * @ordered
	 */
	NKN(0, "NKN", "NKN"),

	/**
	 * The '<em><b>STABLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STABLE_VALUE
	 * @generated
	 * @ordered
	 */
	STABLE(1, "STABLE", "STABLE"),

	/**
	 * The '<em><b>UNSTAB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSTAB_VALUE
	 * @generated
	 * @ordered
	 */
	UNSTAB(2, "UNSTAB", "UNSTAB"),

	/**
	 * The '<em><b>NEUTRL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEUTRL_VALUE
	 * @generated
	 * @ordered
	 */
	NEUTRL(3, "NEUTRL", "NEUTRL");

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
	public static final int NKN_VALUE = 0;

	/**
	 * The '<em><b>STABLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STABLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STABLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STABLE_VALUE = 1;

	/**
	 * The '<em><b>UNSTAB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNSTAB</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNSTAB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNSTAB_VALUE = 2;

	/**
	 * The '<em><b>NEUTRL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NEUTRL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEUTRL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NEUTRL_VALUE = 3;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Atmosphere Gradient Temperature</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoAtmosphereGradientTemperature[] VALUES_ARRAY =
		new TypeDictionaryDicoAtmosphereGradientTemperature[] {
			NKN,
			STABLE,
			UNSTAB,
			NEUTRL,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Atmosphere Gradient Temperature</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoAtmosphereGradientTemperature> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Atmosphere Gradient Temperature</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoAtmosphereGradientTemperature get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoAtmosphereGradientTemperature result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Atmosphere Gradient Temperature</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoAtmosphereGradientTemperature getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoAtmosphereGradientTemperature result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Atmosphere Gradient Temperature</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoAtmosphereGradientTemperature get(int value) {
		switch (value) {
			case NKN_VALUE: return NKN;
			case STABLE_VALUE: return STABLE;
			case UNSTAB_VALUE: return UNSTAB;
			case NEUTRL_VALUE: return NEUTRL;
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
	private TypeDictionaryDicoAtmosphereGradientTemperature(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoAtmosphereGradientTemperature