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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Etat Operationnel Materiel Type Defaillance Bouee</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoEtatOperationnelMaterielTypeDefaillanceBouee()
 * @model extendedMetaData="name='type_Dictionary_Dico_EtatOperationnelMaterielTypeDefaillanceBouee'"
 * @generated
 */
public enum TypeDictionaryDicoEtatOperationnelMaterielTypeDefaillanceBouee implements Enumerator {
	/**
	 * The '<em><b>NOFLAG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOFLAG_VALUE
	 * @generated
	 * @ordered
	 */
	NOFLAG(0, "NOFLAG", "NOFLAG"),

	/**
	 * The '<em><b>NORADR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORADR_VALUE
	 * @generated
	 * @ordered
	 */
	NORADR(1, "NORADR", "NORADR"),

	/**
	 * The '<em><b>BUOYNT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUOYNT_VALUE
	 * @generated
	 * @ordered
	 */
	BUOYNT(2, "BUOYNT", "BUOYNT"),

	/**
	 * The '<em><b>SERVCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVCE_VALUE
	 * @generated
	 * @ordered
	 */
	SERVCE(3, "SERVCE", "SERVCE"),

	/**
	 * The '<em><b>NOLGHT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOLGHT_VALUE
	 * @generated
	 * @ordered
	 */
	NOLGHT(4, "NOLGHT", "NOLGHT");

	/**
	 * The '<em><b>NOFLAG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOFLAG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOFLAG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOFLAG_VALUE = 0;

	/**
	 * The '<em><b>NORADR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NORADR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NORADR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NORADR_VALUE = 1;

	/**
	 * The '<em><b>BUOYNT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BUOYNT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUOYNT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BUOYNT_VALUE = 2;

	/**
	 * The '<em><b>SERVCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SERVCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SERVCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SERVCE_VALUE = 3;

	/**
	 * The '<em><b>NOLGHT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOLGHT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOLGHT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOLGHT_VALUE = 4;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Etat Operationnel Materiel Type Defaillance Bouee</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoEtatOperationnelMaterielTypeDefaillanceBouee[] VALUES_ARRAY =
		new TypeDictionaryDicoEtatOperationnelMaterielTypeDefaillanceBouee[] {
			NOFLAG,
			NORADR,
			BUOYNT,
			SERVCE,
			NOLGHT,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Etat Operationnel Materiel Type Defaillance Bouee</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoEtatOperationnelMaterielTypeDefaillanceBouee> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Etat Operationnel Materiel Type Defaillance Bouee</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoEtatOperationnelMaterielTypeDefaillanceBouee get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoEtatOperationnelMaterielTypeDefaillanceBouee result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Etat Operationnel Materiel Type Defaillance Bouee</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoEtatOperationnelMaterielTypeDefaillanceBouee getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoEtatOperationnelMaterielTypeDefaillanceBouee result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Etat Operationnel Materiel Type Defaillance Bouee</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoEtatOperationnelMaterielTypeDefaillanceBouee get(int value) {
		switch (value) {
			case NOFLAG_VALUE: return NOFLAG;
			case NORADR_VALUE: return NORADR;
			case BUOYNT_VALUE: return BUOYNT;
			case SERVCE_VALUE: return SERVCE;
			case NOLGHT_VALUE: return NOLGHT;
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
	private TypeDictionaryDicoEtatOperationnelMaterielTypeDefaillanceBouee(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoEtatOperationnelMaterielTypeDefaillanceBouee
