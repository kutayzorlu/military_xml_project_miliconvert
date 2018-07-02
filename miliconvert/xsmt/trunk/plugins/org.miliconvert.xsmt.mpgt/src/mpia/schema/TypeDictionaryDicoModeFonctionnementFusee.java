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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Mode Fonctionnement Fusee</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoModeFonctionnementFusee()
 * @model extendedMetaData="name='type_Dictionary_Dico_ModeFonctionnementFusee'"
 * @generated
 */
public enum TypeDictionaryDicoModeFonctionnementFusee implements Enumerator {
	/**
	 * The '<em><b>ONTM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONTM_VALUE
	 * @generated
	 * @ordered
	 */
	ONTM(0, "ONTM", "ONTM"),

	/**
	 * The '<em><b>ACCT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCT_VALUE
	 * @generated
	 * @ordered
	 */
	ACCT(1, "ACCT", "ACCT"),

	/**
	 * The '<em><b>CRET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRET_VALUE
	 * @generated
	 * @ordered
	 */
	CRET(2, "CRET", "CRET"),

	/**
	 * The '<em><b>INST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INST_VALUE
	 * @generated
	 * @ordered
	 */
	INST(3, "INST", "INST"),

	/**
	 * The '<em><b>PROX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROX_VALUE
	 * @generated
	 * @ordered
	 */
	PROX(4, "PROX", "PROX");

	/**
	 * The '<em><b>ONTM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ONTM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ONTM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ONTM_VALUE = 0;

	/**
	 * The '<em><b>ACCT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ACCT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACCT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACCT_VALUE = 1;

	/**
	 * The '<em><b>CRET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CRET</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CRET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CRET_VALUE = 2;

	/**
	 * The '<em><b>INST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INST_VALUE = 3;

	/**
	 * The '<em><b>PROX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PROX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROX_VALUE = 4;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Mode Fonctionnement Fusee</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoModeFonctionnementFusee[] VALUES_ARRAY =
		new TypeDictionaryDicoModeFonctionnementFusee[] {
			ONTM,
			ACCT,
			CRET,
			INST,
			PROX,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Mode Fonctionnement Fusee</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoModeFonctionnementFusee> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Mode Fonctionnement Fusee</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoModeFonctionnementFusee get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoModeFonctionnementFusee result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Mode Fonctionnement Fusee</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoModeFonctionnementFusee getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoModeFonctionnementFusee result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Mode Fonctionnement Fusee</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoModeFonctionnementFusee get(int value) {
		switch (value) {
			case ONTM_VALUE: return ONTM;
			case ACCT_VALUE: return ACCT;
			case CRET_VALUE: return CRET;
			case INST_VALUE: return INST;
			case PROX_VALUE: return PROX;
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
	private TypeDictionaryDicoModeFonctionnementFusee(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoModeFonctionnementFusee
