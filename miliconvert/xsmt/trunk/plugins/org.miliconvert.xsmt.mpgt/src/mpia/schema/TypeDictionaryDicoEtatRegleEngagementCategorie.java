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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Etat Regle Engagement Categorie</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoEtatRegleEngagementCategorie()
 * @model extendedMetaData="name='type_Dictionary_Dico_EtatRegleEngagementCategorie'"
 * @generated
 */
public enum TypeDictionaryDicoEtatRegleEngagementCategorie implements Enumerator {
	/**
	 * The '<em><b>AUTHRS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTHRS_VALUE
	 * @generated
	 * @ordered
	 */
	AUTHRS(0, "AUTHRS", "AUTHRS"),

	/**
	 * The '<em><b>CANCEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CANCEL_VALUE
	 * @generated
	 * @ordered
	 */
	CANCEL(1, "CANCEL", "CANCEL"),

	/**
	 * The '<em><b>DENYRQ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DENYRQ_VALUE
	 * @generated
	 * @ordered
	 */
	DENYRQ(2, "DENYRQ", "DENYRQ"),

	/**
	 * The '<em><b>AUTHRQ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTHRQ_VALUE
	 * @generated
	 * @ordered
	 */
	AUTHRQ(3, "AUTHRQ", "AUTHRQ"),

	/**
	 * The '<em><b>CNCLRQ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CNCLRQ_VALUE
	 * @generated
	 * @ordered
	 */
	CNCLRQ(4, "CNCLRQ", "CNCLRQ");

	/**
	 * The '<em><b>AUTHRS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AUTHRS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUTHRS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AUTHRS_VALUE = 0;

	/**
	 * The '<em><b>CANCEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CANCEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CANCEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CANCEL_VALUE = 1;

	/**
	 * The '<em><b>DENYRQ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DENYRQ</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DENYRQ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DENYRQ_VALUE = 2;

	/**
	 * The '<em><b>AUTHRQ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AUTHRQ</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUTHRQ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AUTHRQ_VALUE = 3;

	/**
	 * The '<em><b>CNCLRQ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CNCLRQ</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CNCLRQ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CNCLRQ_VALUE = 4;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Etat Regle Engagement Categorie</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoEtatRegleEngagementCategorie[] VALUES_ARRAY =
		new TypeDictionaryDicoEtatRegleEngagementCategorie[] {
			AUTHRS,
			CANCEL,
			DENYRQ,
			AUTHRQ,
			CNCLRQ,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Etat Regle Engagement Categorie</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoEtatRegleEngagementCategorie> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Etat Regle Engagement Categorie</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoEtatRegleEngagementCategorie get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoEtatRegleEngagementCategorie result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Etat Regle Engagement Categorie</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoEtatRegleEngagementCategorie getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoEtatRegleEngagementCategorie result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Etat Regle Engagement Categorie</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoEtatRegleEngagementCategorie get(int value) {
		switch (value) {
			case AUTHRS_VALUE: return AUTHRS;
			case CANCEL_VALUE: return CANCEL;
			case DENYRQ_VALUE: return DENYRQ;
			case AUTHRQ_VALUE: return AUTHRQ;
			case CNCLRQ_VALUE: return CNCLRQ;
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
	private TypeDictionaryDicoEtatRegleEngagementCategorie(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoEtatRegleEngagementCategorie
