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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Protection Personnel Categorie</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoProtectionPersonnelCategorie()
 * @model extendedMetaData="name='type_Dictionary_Dico_ProtectionPersonnelCategorie'"
 * @generated
 */
public enum TypeDictionaryDicoProtectionPersonnelCategorie implements Enumerator {
	/**
	 * The '<em><b>COVER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COVER_VALUE
	 * @generated
	 * @ordered
	 */
	COVER(0, "COVER", "COVER"),

	/**
	 * The '<em><b>DUGIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DUGIN_VALUE
	 * @generated
	 * @ordered
	 */
	DUGIN(1, "DUGIN", "DUGIN"),

	/**
	 * The '<em><b>PRAND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRAND_VALUE
	 * @generated
	 * @ordered
	 */
	PRAND(2, "PRAND", "PRAND"),

	/**
	 * The '<em><b>PRONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRONE_VALUE
	 * @generated
	 * @ordered
	 */
	PRONE(3, "PRONE", "PRONE"),

	/**
	 * The '<em><b>PROVER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROVER_VALUE
	 * @generated
	 * @ordered
	 */
	PROVER(4, "PROVER", "PROVER"),

	/**
	 * The '<em><b>PRUG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRUG_VALUE
	 * @generated
	 * @ordered
	 */
	PRUG(5, "PRUG", "PRUG");

	/**
	 * The '<em><b>COVER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COVER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COVER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COVER_VALUE = 0;

	/**
	 * The '<em><b>DUGIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DUGIN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DUGIN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DUGIN_VALUE = 1;

	/**
	 * The '<em><b>PRAND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PRAND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRAND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRAND_VALUE = 2;

	/**
	 * The '<em><b>PRONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PRONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRONE_VALUE = 3;

	/**
	 * The '<em><b>PROVER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PROVER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROVER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROVER_VALUE = 4;

	/**
	 * The '<em><b>PRUG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PRUG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRUG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRUG_VALUE = 5;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Protection Personnel Categorie</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoProtectionPersonnelCategorie[] VALUES_ARRAY =
		new TypeDictionaryDicoProtectionPersonnelCategorie[] {
			COVER,
			DUGIN,
			PRAND,
			PRONE,
			PROVER,
			PRUG,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Protection Personnel Categorie</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoProtectionPersonnelCategorie> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Protection Personnel Categorie</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoProtectionPersonnelCategorie get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoProtectionPersonnelCategorie result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Protection Personnel Categorie</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoProtectionPersonnelCategorie getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoProtectionPersonnelCategorie result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Protection Personnel Categorie</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoProtectionPersonnelCategorie get(int value) {
		switch (value) {
			case COVER_VALUE: return COVER;
			case DUGIN_VALUE: return DUGIN;
			case PRAND_VALUE: return PRAND;
			case PRONE_VALUE: return PRONE;
			case PROVER_VALUE: return PROVER;
			case PRUG_VALUE: return PRUG;
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
	private TypeDictionaryDicoProtectionPersonnelCategorie(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoProtectionPersonnelCategorie
