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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Personne Militaire Situation Militaire</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoPersonneMilitaireSituationMilitaire()
 * @model extendedMetaData="name='type_Dictionary_Dico_PersonneMilitaireSituationMilitaire'"
 * @generated
 */
public enum TypeDictionaryDicoPersonneMilitaireSituationMilitaire implements Enumerator {
	/**
	 * The '<em><b>CARREE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARREE_VALUE
	 * @generated
	 * @ordered
	 */
	CARREE(0, "CARREE", "CARREE"),

	/**
	 * The '<em><b>LEGDUR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEGDUR_VALUE
	 * @generated
	 * @ordered
	 */
	LEGDUR(1, "LEGDUR", "LEGDUR"),

	/**
	 * The '<em><b>MOBILI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOBILI_VALUE
	 * @generated
	 * @ordered
	 */
	MOBILI(2, "MOBILI", "MOBILI"),

	/**
	 * The '<em><b>RESERV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESERV_VALUE
	 * @generated
	 * @ordered
	 */
	RESERV(3, "RESERV", "RESERV"),

	/**
	 * The '<em><b>CONTRA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTRA_VALUE
	 * @generated
	 * @ordered
	 */
	CONTRA(4, "CONTRA", "CONTRA");

	/**
	 * The '<em><b>CARREE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CARREE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CARREE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CARREE_VALUE = 0;

	/**
	 * The '<em><b>LEGDUR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LEGDUR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LEGDUR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LEGDUR_VALUE = 1;

	/**
	 * The '<em><b>MOBILI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MOBILI</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOBILI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOBILI_VALUE = 2;

	/**
	 * The '<em><b>RESERV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RESERV</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESERV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RESERV_VALUE = 3;

	/**
	 * The '<em><b>CONTRA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONTRA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTRA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONTRA_VALUE = 4;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Personne Militaire Situation Militaire</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoPersonneMilitaireSituationMilitaire[] VALUES_ARRAY =
		new TypeDictionaryDicoPersonneMilitaireSituationMilitaire[] {
			CARREE,
			LEGDUR,
			MOBILI,
			RESERV,
			CONTRA,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Personne Militaire Situation Militaire</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoPersonneMilitaireSituationMilitaire> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Personne Militaire Situation Militaire</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoPersonneMilitaireSituationMilitaire get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoPersonneMilitaireSituationMilitaire result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Personne Militaire Situation Militaire</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoPersonneMilitaireSituationMilitaire getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoPersonneMilitaireSituationMilitaire result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Personne Militaire Situation Militaire</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoPersonneMilitaireSituationMilitaire get(int value) {
		switch (value) {
			case CARREE_VALUE: return CARREE;
			case LEGDUR_VALUE: return LEGDUR;
			case MOBILI_VALUE: return MOBILI;
			case RESERV_VALUE: return RESERV;
			case CONTRA_VALUE: return CONTRA;
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
	private TypeDictionaryDicoPersonneMilitaireSituationMilitaire(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoPersonneMilitaireSituationMilitaire
