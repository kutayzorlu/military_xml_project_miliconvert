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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Capacite Soutien Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoCapaciteSoutienType()
 * @model extendedMetaData="name='type_Dictionary_Dico_CapaciteSoutienType'"
 * @generated
 */
public enum TypeDictionaryDicoCapaciteSoutienType implements Enumerator {
	/**
	 * The '<em><b>BEDCNT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEDCNT_VALUE
	 * @generated
	 * @ordered
	 */
	BEDCNT(0, "BEDCNT", "BEDCNT"),

	/**
	 * The '<em><b>BLKLIQ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLKLIQ_VALUE
	 * @generated
	 * @ordered
	 */
	BLKLIQ(1, "BLKLIQ", "BLKLIQ"),

	/**
	 * The '<em><b>BLKVOL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLKVOL_VALUE
	 * @generated
	 * @ordered
	 */
	BLKVOL(2, "BLKVOL", "BLKVOL"),

	/**
	 * The '<em><b>MAXCNT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAXCNT_VALUE
	 * @generated
	 * @ordered
	 */
	MAXCNT(3, "MAXCNT", "MAXCNT"),

	/**
	 * The '<em><b>OPRCNT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPRCNT_VALUE
	 * @generated
	 * @ordered
	 */
	OPRCNT(4, "OPRCNT", "OPRCNT");

	/**
	 * The '<em><b>BEDCNT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BEDCNT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BEDCNT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BEDCNT_VALUE = 0;

	/**
	 * The '<em><b>BLKLIQ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BLKLIQ</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BLKLIQ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BLKLIQ_VALUE = 1;

	/**
	 * The '<em><b>BLKVOL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BLKVOL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BLKVOL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BLKVOL_VALUE = 2;

	/**
	 * The '<em><b>MAXCNT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MAXCNT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAXCNT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MAXCNT_VALUE = 3;

	/**
	 * The '<em><b>OPRCNT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OPRCNT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPRCNT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPRCNT_VALUE = 4;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Capacite Soutien Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoCapaciteSoutienType[] VALUES_ARRAY =
		new TypeDictionaryDicoCapaciteSoutienType[] {
			BEDCNT,
			BLKLIQ,
			BLKVOL,
			MAXCNT,
			OPRCNT,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Capacite Soutien Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoCapaciteSoutienType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Capacite Soutien Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoCapaciteSoutienType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoCapaciteSoutienType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Capacite Soutien Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoCapaciteSoutienType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoCapaciteSoutienType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Capacite Soutien Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoCapaciteSoutienType get(int value) {
		switch (value) {
			case BEDCNT_VALUE: return BEDCNT;
			case BLKLIQ_VALUE: return BLKLIQ;
			case BLKVOL_VALUE: return BLKVOL;
			case MAXCNT_VALUE: return MAXCNT;
			case OPRCNT_VALUE: return OPRCNT;
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
	private TypeDictionaryDicoCapaciteSoutienType(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoCapaciteSoutienType
