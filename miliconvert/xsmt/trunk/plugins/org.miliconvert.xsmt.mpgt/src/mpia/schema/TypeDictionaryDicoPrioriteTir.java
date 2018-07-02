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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Priorite Tir</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoPrioriteTir()
 * @model extendedMetaData="name='type_Dictionary_Dico_PrioriteTir'"
 * @generated
 */
public enum TypeDictionaryDicoPrioriteTir implements Enumerator {
	/**
	 * The '<em><b>IMM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMM_VALUE
	 * @generated
	 * @ordered
	 */
	IMM(0, "IMM", "IMM"),

	/**
	 * The '<em><b>PRTY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRTY_VALUE
	 * @generated
	 * @ordered
	 */
	PRTY(1, "PRTY", "PRTY"),

	/**
	 * The '<em><b>NOPRIO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOPRIO_VALUE
	 * @generated
	 * @ordered
	 */
	NOPRIO(2, "NOPRIO", "NOPRIO"),

	/**
	 * The '<em><b>TOPREP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOPREP_VALUE
	 * @generated
	 * @ordered
	 */
	TOPREP(3, "TOPREP", "TOPREP"),

	/**
	 * The '<em><b>LDPRIO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LDPRIO_VALUE
	 * @generated
	 * @ordered
	 */
	LDPRIO(4, "LDPRIO", "LDPRIO");

	/**
	 * The '<em><b>IMM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IMM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IMM_VALUE = 0;

	/**
	 * The '<em><b>PRTY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PRTY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRTY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRTY_VALUE = 1;

	/**
	 * The '<em><b>NOPRIO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOPRIO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOPRIO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOPRIO_VALUE = 2;

	/**
	 * The '<em><b>TOPREP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TOPREP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOPREP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TOPREP_VALUE = 3;

	/**
	 * The '<em><b>LDPRIO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LDPRIO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LDPRIO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LDPRIO_VALUE = 4;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Priorite Tir</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoPrioriteTir[] VALUES_ARRAY =
		new TypeDictionaryDicoPrioriteTir[] {
			IMM,
			PRTY,
			NOPRIO,
			TOPREP,
			LDPRIO,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Priorite Tir</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoPrioriteTir> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Priorite Tir</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoPrioriteTir get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoPrioriteTir result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Priorite Tir</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoPrioriteTir getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoPrioriteTir result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Priorite Tir</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoPrioriteTir get(int value) {
		switch (value) {
			case IMM_VALUE: return IMM;
			case PRTY_VALUE: return PRTY;
			case NOPRIO_VALUE: return NOPRIO;
			case TOPREP_VALUE: return TOPREP;
			case LDPRIO_VALUE: return LDPRIO;
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
	private TypeDictionaryDicoPrioriteTir(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoPrioriteTir
