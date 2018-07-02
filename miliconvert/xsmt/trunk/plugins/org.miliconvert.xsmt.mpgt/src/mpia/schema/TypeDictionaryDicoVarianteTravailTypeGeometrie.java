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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Variante Travail Type Geometrie</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoVarianteTravailTypeGeometrie()
 * @model extendedMetaData="name='type_Dictionary_Dico_VarianteTravailTypeGeometrie'"
 * @generated
 */
public enum TypeDictionaryDicoVarianteTravailTypeGeometrie implements Enumerator {
	/**
	 * The '<em><b>PONCT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PONCT_VALUE
	 * @generated
	 * @ordered
	 */
	PONCT(0, "PONCT", "PONCT"),

	/**
	 * The '<em><b>LINEA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINEA_VALUE
	 * @generated
	 * @ordered
	 */
	LINEA(1, "LINEA", "LINEA"),

	/**
	 * The '<em><b>SURF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SURF_VALUE
	 * @generated
	 * @ordered
	 */
	SURF(2, "SURF", "SURF"),

	/**
	 * The '<em><b>DISTUN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISTUN_VALUE
	 * @generated
	 * @ordered
	 */
	DISTUN(3, "DISTUN", "DISTUN");

	/**
	 * The '<em><b>PONCT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PONCT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PONCT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PONCT_VALUE = 0;

	/**
	 * The '<em><b>LINEA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LINEA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LINEA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LINEA_VALUE = 1;

	/**
	 * The '<em><b>SURF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SURF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SURF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SURF_VALUE = 2;

	/**
	 * The '<em><b>DISTUN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DISTUN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISTUN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DISTUN_VALUE = 3;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Variante Travail Type Geometrie</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoVarianteTravailTypeGeometrie[] VALUES_ARRAY =
		new TypeDictionaryDicoVarianteTravailTypeGeometrie[] {
			PONCT,
			LINEA,
			SURF,
			DISTUN,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Variante Travail Type Geometrie</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoVarianteTravailTypeGeometrie> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Variante Travail Type Geometrie</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoVarianteTravailTypeGeometrie get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoVarianteTravailTypeGeometrie result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Variante Travail Type Geometrie</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoVarianteTravailTypeGeometrie getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoVarianteTravailTypeGeometrie result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Variante Travail Type Geometrie</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoVarianteTravailTypeGeometrie get(int value) {
		switch (value) {
			case PONCT_VALUE: return PONCT;
			case LINEA_VALUE: return LINEA;
			case SURF_VALUE: return SURF;
			case DISTUN_VALUE: return DISTUN;
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
	private TypeDictionaryDicoVarianteTravailTypeGeometrie(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoVarianteTravailTypeGeometrie
