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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Plan Feux Etat Planification</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoPlanFeuxEtatPlanification()
 * @model extendedMetaData="name='type_Dictionary_Dico_PlanFeuxEtatPlanification'"
 * @generated
 */
public enum TypeDictionaryDicoPlanFeuxEtatPlanification implements Enumerator {
	/**
	 * The '<em><b>TOEVALU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOEVALU_VALUE
	 * @generated
	 * @ordered
	 */
	TOEVALU(0, "TOEVALU", "TO_EVALU"),

	/**
	 * The '<em><b>ASSES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSES_VALUE
	 * @generated
	 * @ordered
	 */
	ASSES(1, "ASSES", "ASSES"),

	/**
	 * The '<em><b>TOEXECUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOEXECUT_VALUE
	 * @generated
	 * @ordered
	 */
	TOEXECUT(2, "TOEXECUT", "TO_EXECUT");

	/**
	 * The '<em><b>TOEVALU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TOEVALU</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOEVALU
	 * @model literal="TO_EVALU"
	 * @generated
	 * @ordered
	 */
	public static final int TOEVALU_VALUE = 0;

	/**
	 * The '<em><b>ASSES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ASSES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASSES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ASSES_VALUE = 1;

	/**
	 * The '<em><b>TOEXECUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TOEXECUT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOEXECUT
	 * @model literal="TO_EXECUT"
	 * @generated
	 * @ordered
	 */
	public static final int TOEXECUT_VALUE = 2;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Plan Feux Etat Planification</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoPlanFeuxEtatPlanification[] VALUES_ARRAY =
		new TypeDictionaryDicoPlanFeuxEtatPlanification[] {
			TOEVALU,
			ASSES,
			TOEXECUT,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Plan Feux Etat Planification</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoPlanFeuxEtatPlanification> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Plan Feux Etat Planification</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoPlanFeuxEtatPlanification get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoPlanFeuxEtatPlanification result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Plan Feux Etat Planification</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoPlanFeuxEtatPlanification getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoPlanFeuxEtatPlanification result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Plan Feux Etat Planification</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoPlanFeuxEtatPlanification get(int value) {
		switch (value) {
			case TOEVALU_VALUE: return TOEVALU;
			case ASSES_VALUE: return ASSES;
			case TOEXECUT_VALUE: return TOEXECUT;
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
	private TypeDictionaryDicoPlanFeuxEtatPlanification(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoPlanFeuxEtatPlanification
