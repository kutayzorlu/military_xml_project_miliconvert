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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Rapport Confirmation</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoRapportConfirmation()
 * @model extendedMetaData="name='type_Dictionary_Dico_RapportConfirmation'"
 * @generated
 */
public enum TypeDictionaryDicoRapportConfirmation implements Enumerator {
	/**
	 * The '<em><b>ASS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASS_VALUE
	 * @generated
	 * @ordered
	 */
	ASS(0, "ASS", "ASS"),

	/**
	 * The '<em><b>ERR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERR_VALUE
	 * @generated
	 * @ordered
	 */
	ERR(1, "ERR", "ERR"),

	/**
	 * The '<em><b>INFER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFER_VALUE
	 * @generated
	 * @ordered
	 */
	INFER(2, "INFER", "INFER"),

	/**
	 * The '<em><b>PLAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLAN_VALUE
	 * @generated
	 * @ordered
	 */
	PLAN(3, "PLAN", "PLAN"),

	/**
	 * The '<em><b>REP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REP_VALUE
	 * @generated
	 * @ordered
	 */
	REP(4, "REP", "REP"),

	/**
	 * The '<em><b>PRDCTD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRDCTD_VALUE
	 * @generated
	 * @ordered
	 */
	PRDCTD(5, "PRDCTD", "PRDCTD");

	/**
	 * The '<em><b>ASS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ASS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ASS_VALUE = 0;

	/**
	 * The '<em><b>ERR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ERR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERR_VALUE = 1;

	/**
	 * The '<em><b>INFER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INFER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INFER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INFER_VALUE = 2;

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
	public static final int PLAN_VALUE = 3;

	/**
	 * The '<em><b>REP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REP_VALUE = 4;

	/**
	 * The '<em><b>PRDCTD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PRDCTD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRDCTD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRDCTD_VALUE = 5;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Rapport Confirmation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoRapportConfirmation[] VALUES_ARRAY =
		new TypeDictionaryDicoRapportConfirmation[] {
			ASS,
			ERR,
			INFER,
			PLAN,
			REP,
			PRDCTD,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Rapport Confirmation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoRapportConfirmation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Rapport Confirmation</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoRapportConfirmation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoRapportConfirmation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Rapport Confirmation</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoRapportConfirmation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoRapportConfirmation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Rapport Confirmation</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoRapportConfirmation get(int value) {
		switch (value) {
			case ASS_VALUE: return ASS;
			case ERR_VALUE: return ERR;
			case INFER_VALUE: return INFER;
			case PLAN_VALUE: return PLAN;
			case REP_VALUE: return REP;
			case PRDCTD_VALUE: return PRDCTD;
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
	private TypeDictionaryDicoRapportConfirmation(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoRapportConfirmation
