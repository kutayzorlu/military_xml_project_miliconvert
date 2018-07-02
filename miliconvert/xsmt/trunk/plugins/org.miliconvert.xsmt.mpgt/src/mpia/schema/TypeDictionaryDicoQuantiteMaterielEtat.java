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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Quantite Materiel Etat</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoQuantiteMaterielEtat()
 * @model extendedMetaData="name='type_Dictionary_Dico_QuantiteMaterielEtat'"
 * @generated
 */
public enum TypeDictionaryDicoQuantiteMaterielEtat implements Enumerator {
	/**
	 * The '<em><b>AVAILB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AVAILB_VALUE
	 * @generated
	 * @ordered
	 */
	AVAILB(0, "AVAILB", "AVAILB"),

	/**
	 * The '<em><b>OUTOOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUTOOR_VALUE
	 * @generated
	 * @ordered
	 */
	OUTOOR(1, "OUTOOR", "OUTOOR"),

	/**
	 * The '<em><b>DESTRD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESTRD_VALUE
	 * @generated
	 * @ordered
	 */
	DESTRD(2, "DESTRD", "DESTRD"),

	/**
	 * The '<em><b>MISSING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MISSING_VALUE
	 * @generated
	 * @ordered
	 */
	MISSING(3, "MISSING", "MISSING");

	/**
	 * The '<em><b>AVAILB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AVAILB</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AVAILB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AVAILB_VALUE = 0;

	/**
	 * The '<em><b>OUTOOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OUTOOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OUTOOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OUTOOR_VALUE = 1;

	/**
	 * The '<em><b>DESTRD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DESTRD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DESTRD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DESTRD_VALUE = 2;

	/**
	 * The '<em><b>MISSING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MISSING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MISSING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MISSING_VALUE = 3;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Quantite Materiel Etat</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoQuantiteMaterielEtat[] VALUES_ARRAY =
		new TypeDictionaryDicoQuantiteMaterielEtat[] {
			AVAILB,
			OUTOOR,
			DESTRD,
			MISSING,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Quantite Materiel Etat</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoQuantiteMaterielEtat> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Quantite Materiel Etat</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoQuantiteMaterielEtat get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoQuantiteMaterielEtat result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Quantite Materiel Etat</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoQuantiteMaterielEtat getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoQuantiteMaterielEtat result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Quantite Materiel Etat</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoQuantiteMaterielEtat get(int value) {
		switch (value) {
			case AVAILB_VALUE: return AVAILB;
			case OUTOOR_VALUE: return OUTOOR;
			case DESTRD_VALUE: return DESTRD;
			case MISSING_VALUE: return MISSING;
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
	private TypeDictionaryDicoQuantiteMaterielEtat(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoQuantiteMaterielEtat
