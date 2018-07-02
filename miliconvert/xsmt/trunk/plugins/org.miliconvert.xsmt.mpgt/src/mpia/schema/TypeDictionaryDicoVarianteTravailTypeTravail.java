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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Variante Travail Type Travail</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoVarianteTravailTypeTravail()
 * @model extendedMetaData="name='type_Dictionary_Dico_VarianteTravailTypeTravail'"
 * @generated
 */
public enum TypeDictionaryDicoVarianteTravailTypeTravail implements Enumerator {
	/**
	 * The '<em><b>OBSTY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBSTY_VALUE
	 * @generated
	 * @ordered
	 */
	OBSTY(0, "OBSTY", "OBSTY"),

	/**
	 * The '<em><b>WRKTY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRKTY_VALUE
	 * @generated
	 * @ordered
	 */
	WRKTY(1, "WRKTY", "WRKTY"),

	/**
	 * The '<em><b>TYTAIDDEPLOI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TYTAIDDEPLOI_VALUE
	 * @generated
	 * @ordered
	 */
	TYTAIDDEPLOI(2, "TYTAIDDEPLOI", "TYTAIDDEPLOI");

	/**
	 * The '<em><b>OBSTY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OBSTY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OBSTY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OBSTY_VALUE = 0;

	/**
	 * The '<em><b>WRKTY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WRKTY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WRKTY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WRKTY_VALUE = 1;

	/**
	 * The '<em><b>TYTAIDDEPLOI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TYTAIDDEPLOI</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TYTAIDDEPLOI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TYTAIDDEPLOI_VALUE = 2;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Variante Travail Type Travail</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoVarianteTravailTypeTravail[] VALUES_ARRAY =
		new TypeDictionaryDicoVarianteTravailTypeTravail[] {
			OBSTY,
			WRKTY,
			TYTAIDDEPLOI,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Variante Travail Type Travail</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoVarianteTravailTypeTravail> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Variante Travail Type Travail</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoVarianteTravailTypeTravail get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoVarianteTravailTypeTravail result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Variante Travail Type Travail</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoVarianteTravailTypeTravail getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoVarianteTravailTypeTravail result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Variante Travail Type Travail</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoVarianteTravailTypeTravail get(int value) {
		switch (value) {
			case OBSTY_VALUE: return OBSTY;
			case WRKTY_VALUE: return WRKTY;
			case TYTAIDDEPLOI_VALUE: return TYTAIDDEPLOI;
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
	private TypeDictionaryDicoVarianteTravailTypeTravail(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoVarianteTravailTypeTravail
