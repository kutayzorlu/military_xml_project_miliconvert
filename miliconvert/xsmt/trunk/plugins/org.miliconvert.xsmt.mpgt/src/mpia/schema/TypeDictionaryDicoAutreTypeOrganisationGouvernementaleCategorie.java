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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Autre Type Organisation Gouvernementale Categorie</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoAutreTypeOrganisationGouvernementaleCategorie()
 * @model extendedMetaData="name='type_Dictionary_Dico_AutreTypeOrganisationGouvernementaleCategorie'"
 * @generated
 */
public enum TypeDictionaryDicoAutreTypeOrganisationGouvernementaleCategorie implements Enumerator {
	/**
	 * The '<em><b>INTCIV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTCIV_VALUE
	 * @generated
	 * @ordered
	 */
	INTCIV(0, "INTCIV", "INTCIV"),

	/**
	 * The '<em><b>INTCMI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTCMI_VALUE
	 * @generated
	 * @ordered
	 */
	INTCMI(1, "INTCMI", "INTCMI"),

	/**
	 * The '<em><b>NATCIV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NATCIV_VALUE
	 * @generated
	 * @ordered
	 */
	NATCIV(2, "NATCIV", "NATCIV"),

	/**
	 * The '<em><b>NOS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOS_VALUE
	 * @generated
	 * @ordered
	 */
	NOS(3, "NOS", "NOS"),

	/**
	 * The '<em><b>NATOCMD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NATOCMD_VALUE
	 * @generated
	 * @ordered
	 */
	NATOCMD(4, "NATOCMD", "NATOCMD");

	/**
	 * The '<em><b>INTCIV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INTCIV</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTCIV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTCIV_VALUE = 0;

	/**
	 * The '<em><b>INTCMI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INTCMI</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTCMI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTCMI_VALUE = 1;

	/**
	 * The '<em><b>NATCIV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NATCIV</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NATCIV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NATCIV_VALUE = 2;

	/**
	 * The '<em><b>NOS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOS_VALUE = 3;

	/**
	 * The '<em><b>NATOCMD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NATOCMD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NATOCMD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NATOCMD_VALUE = 4;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Autre Type Organisation Gouvernementale Categorie</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoAutreTypeOrganisationGouvernementaleCategorie[] VALUES_ARRAY =
		new TypeDictionaryDicoAutreTypeOrganisationGouvernementaleCategorie[] {
			INTCIV,
			INTCMI,
			NATCIV,
			NOS,
			NATOCMD,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Autre Type Organisation Gouvernementale Categorie</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoAutreTypeOrganisationGouvernementaleCategorie> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Autre Type Organisation Gouvernementale Categorie</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoAutreTypeOrganisationGouvernementaleCategorie get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoAutreTypeOrganisationGouvernementaleCategorie result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Autre Type Organisation Gouvernementale Categorie</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoAutreTypeOrganisationGouvernementaleCategorie getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoAutreTypeOrganisationGouvernementaleCategorie result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Autre Type Organisation Gouvernementale Categorie</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoAutreTypeOrganisationGouvernementaleCategorie get(int value) {
		switch (value) {
			case INTCIV_VALUE: return INTCIV;
			case INTCMI_VALUE: return INTCMI;
			case NATCIV_VALUE: return NATCIV;
			case NOS_VALUE: return NOS;
			case NATOCMD_VALUE: return NATOCMD;
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
	private TypeDictionaryDicoAutreTypeOrganisationGouvernementaleCategorie(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoAutreTypeOrganisationGouvernementaleCategorie
