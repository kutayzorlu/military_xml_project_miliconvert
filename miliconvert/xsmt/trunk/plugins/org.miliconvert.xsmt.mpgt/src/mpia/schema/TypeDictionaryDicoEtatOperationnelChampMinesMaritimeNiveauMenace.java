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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Etat Operationnel Champ Mines Maritime Niveau Menace</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoEtatOperationnelChampMinesMaritimeNiveauMenace()
 * @model extendedMetaData="name='type_Dictionary_Dico_EtatOperationnelChampMinesMaritimeNiveauMenace'"
 * @generated
 */
public enum TypeDictionaryDicoEtatOperationnelChampMinesMaritimeNiveauMenace implements Enumerator {
	/**
	 * The '<em><b>LITTLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LITTLE_VALUE
	 * @generated
	 * @ordered
	 */
	LITTLE(0, "LITTLE", "LITTLE"),

	/**
	 * The '<em><b>SERIOS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERIOS_VALUE
	 * @generated
	 * @ordered
	 */
	SERIOS(1, "SERIOS", "SERIOS"),

	/**
	 * The '<em><b>VRYGRT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VRYGRT_VALUE
	 * @generated
	 * @ordered
	 */
	VRYGRT(2, "VRYGRT", "VRYGRT");

	/**
	 * The '<em><b>LITTLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LITTLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LITTLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LITTLE_VALUE = 0;

	/**
	 * The '<em><b>SERIOS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SERIOS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SERIOS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SERIOS_VALUE = 1;

	/**
	 * The '<em><b>VRYGRT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VRYGRT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VRYGRT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VRYGRT_VALUE = 2;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Etat Operationnel Champ Mines Maritime Niveau Menace</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoEtatOperationnelChampMinesMaritimeNiveauMenace[] VALUES_ARRAY =
		new TypeDictionaryDicoEtatOperationnelChampMinesMaritimeNiveauMenace[] {
			LITTLE,
			SERIOS,
			VRYGRT,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Etat Operationnel Champ Mines Maritime Niveau Menace</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoEtatOperationnelChampMinesMaritimeNiveauMenace> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Etat Operationnel Champ Mines Maritime Niveau Menace</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoEtatOperationnelChampMinesMaritimeNiveauMenace get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoEtatOperationnelChampMinesMaritimeNiveauMenace result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Etat Operationnel Champ Mines Maritime Niveau Menace</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoEtatOperationnelChampMinesMaritimeNiveauMenace getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoEtatOperationnelChampMinesMaritimeNiveauMenace result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Etat Operationnel Champ Mines Maritime Niveau Menace</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoEtatOperationnelChampMinesMaritimeNiveauMenace get(int value) {
		switch (value) {
			case LITTLE_VALUE: return LITTLE;
			case SERIOS_VALUE: return SERIOS;
			case VRYGRT_VALUE: return VRYGRT;
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
	private TypeDictionaryDicoEtatOperationnelChampMinesMaritimeNiveauMenace(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoEtatOperationnelChampMinesMaritimeNiveauMenace
