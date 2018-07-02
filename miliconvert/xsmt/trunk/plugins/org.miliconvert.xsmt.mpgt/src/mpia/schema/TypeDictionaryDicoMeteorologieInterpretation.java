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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Meteorologie Interpretation</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoMeteorologieInterpretation()
 * @model extendedMetaData="name='type_Dictionary_Dico_MeteorologieInterpretation'"
 * @generated
 */
public enum TypeDictionaryDicoMeteorologieInterpretation implements Enumerator {
	/**
	 * The '<em><b>AVMAX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AVMAX_VALUE
	 * @generated
	 * @ordered
	 */
	AVMAX(0, "AVMAX", "AVMAX"),

	/**
	 * The '<em><b>AVMIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AVMIN_VALUE
	 * @generated
	 * @ordered
	 */
	AVMIN(1, "AVMIN", "AVMIN"),

	/**
	 * The '<em><b>NOMIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOMIN_VALUE
	 * @generated
	 * @ordered
	 */
	NOMIN(2, "NOMIN", "NOMIN"),

	/**
	 * The '<em><b>ABMAX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABMAX_VALUE
	 * @generated
	 * @ordered
	 */
	ABMAX(3, "ABMAX", "ABMAX"),

	/**
	 * The '<em><b>ABMIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABMIN_VALUE
	 * @generated
	 * @ordered
	 */
	ABMIN(4, "ABMIN", "ABMIN");

	/**
	 * The '<em><b>AVMAX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AVMAX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AVMAX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AVMAX_VALUE = 0;

	/**
	 * The '<em><b>AVMIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AVMIN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AVMIN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AVMIN_VALUE = 1;

	/**
	 * The '<em><b>NOMIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOMIN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOMIN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOMIN_VALUE = 2;

	/**
	 * The '<em><b>ABMAX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ABMAX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ABMAX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ABMAX_VALUE = 3;

	/**
	 * The '<em><b>ABMIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ABMIN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ABMIN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ABMIN_VALUE = 4;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Meteorologie Interpretation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoMeteorologieInterpretation[] VALUES_ARRAY =
		new TypeDictionaryDicoMeteorologieInterpretation[] {
			AVMAX,
			AVMIN,
			NOMIN,
			ABMAX,
			ABMIN,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Meteorologie Interpretation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoMeteorologieInterpretation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Meteorologie Interpretation</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoMeteorologieInterpretation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoMeteorologieInterpretation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Meteorologie Interpretation</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoMeteorologieInterpretation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoMeteorologieInterpretation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Meteorologie Interpretation</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoMeteorologieInterpretation get(int value) {
		switch (value) {
			case AVMAX_VALUE: return AVMAX;
			case AVMIN_VALUE: return AVMIN;
			case NOMIN_VALUE: return NOMIN;
			case ABMAX_VALUE: return ABMAX;
			case ABMIN_VALUE: return ABMIN;
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
	private TypeDictionaryDicoMeteorologieInterpretation(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoMeteorologieInterpretation
