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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Consommation Allouee Type Repartition Munitions</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoConsommationAlloueeTypeRepartitionMunitions()
 * @model extendedMetaData="name='type_Dictionary_Dico_ConsommationAlloueeTypeRepartitionMunitions'"
 * @generated
 */
public enum TypeDictionaryDicoConsommationAlloueeTypeRepartitionMunitions implements Enumerator {
	/**
	 * The '<em><b>PLAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLAN_VALUE
	 * @generated
	 * @ordered
	 */
	PLAN(0, "PLAN", "PLAN"),

	/**
	 * The '<em><b>OPPORT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPPORT_VALUE
	 * @generated
	 * @ordered
	 */
	OPPORT(1, "OPPORT", "OPPORT"),

	/**
	 * The '<em><b>GPRESERVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GPRESERVE_VALUE
	 * @generated
	 * @ordered
	 */
	GPRESERVE(2, "GPRESERVE", "GPRESERVE"),

	/**
	 * The '<em><b>MURESERVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MURESERVE_VALUE
	 * @generated
	 * @ordered
	 */
	MURESERVE(3, "MURESERVE", "MURESERVE"),

	/**
	 * The '<em><b>OVERAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OVERAL_VALUE
	 * @generated
	 * @ordered
	 */
	OVERAL(4, "OVERAL", "OVERAL");

	/**
	 * The '<em><b>PLAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PLAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PLAN_VALUE = 0;

	/**
	 * The '<em><b>OPPORT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OPPORT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPPORT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPPORT_VALUE = 1;

	/**
	 * The '<em><b>GPRESERVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GPRESERVE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GPRESERVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GPRESERVE_VALUE = 2;

	/**
	 * The '<em><b>MURESERVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MURESERVE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MURESERVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MURESERVE_VALUE = 3;

	/**
	 * The '<em><b>OVERAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OVERAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OVERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OVERAL_VALUE = 4;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Consommation Allouee Type Repartition Munitions</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoConsommationAlloueeTypeRepartitionMunitions[] VALUES_ARRAY =
		new TypeDictionaryDicoConsommationAlloueeTypeRepartitionMunitions[] {
			PLAN,
			OPPORT,
			GPRESERVE,
			MURESERVE,
			OVERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Consommation Allouee Type Repartition Munitions</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoConsommationAlloueeTypeRepartitionMunitions> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Consommation Allouee Type Repartition Munitions</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoConsommationAlloueeTypeRepartitionMunitions get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoConsommationAlloueeTypeRepartitionMunitions result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Consommation Allouee Type Repartition Munitions</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoConsommationAlloueeTypeRepartitionMunitions getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoConsommationAlloueeTypeRepartitionMunitions result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Consommation Allouee Type Repartition Munitions</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoConsommationAlloueeTypeRepartitionMunitions get(int value) {
		switch (value) {
			case PLAN_VALUE: return PLAN;
			case OPPORT_VALUE: return OPPORT;
			case GPRESERVE_VALUE: return GPRESERVE;
			case MURESERVE_VALUE: return MURESERVE;
			case OVERAL_VALUE: return OVERAL;
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
	private TypeDictionaryDicoConsommationAlloueeTypeRepartitionMunitions(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoConsommationAlloueeTypeRepartitionMunitions
