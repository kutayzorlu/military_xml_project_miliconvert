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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Autorisation Objectif Ciblage Approbation</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoAutorisationObjectifCiblageApprobation()
 * @model extendedMetaData="name='type_Dictionary_Dico_AutorisationObjectifCiblageApprobation'"
 * @generated
 */
public enum TypeDictionaryDicoAutorisationObjectifCiblageApprobation implements Enumerator {
	/**
	 * The '<em><b>APPAVL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPAVL_VALUE
	 * @generated
	 * @ordered
	 */
	APPAVL(0, "APPAVL", "APPAVL"),

	/**
	 * The '<em><b>APPEXC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPEXC_VALUE
	 * @generated
	 * @ordered
	 */
	APPEXC(1, "APPEXC", "APPEXC"),

	/**
	 * The '<em><b>NOTAPP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTAPP_VALUE
	 * @generated
	 * @ordered
	 */
	NOTAPP(2, "NOTAPP", "NOTAPP");

	/**
	 * The '<em><b>APPAVL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>APPAVL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #APPAVL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int APPAVL_VALUE = 0;

	/**
	 * The '<em><b>APPEXC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>APPEXC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #APPEXC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int APPEXC_VALUE = 1;

	/**
	 * The '<em><b>NOTAPP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOTAPP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOTAPP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOTAPP_VALUE = 2;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Autorisation Objectif Ciblage Approbation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoAutorisationObjectifCiblageApprobation[] VALUES_ARRAY =
		new TypeDictionaryDicoAutorisationObjectifCiblageApprobation[] {
			APPAVL,
			APPEXC,
			NOTAPP,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Autorisation Objectif Ciblage Approbation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoAutorisationObjectifCiblageApprobation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Autorisation Objectif Ciblage Approbation</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoAutorisationObjectifCiblageApprobation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoAutorisationObjectifCiblageApprobation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Autorisation Objectif Ciblage Approbation</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoAutorisationObjectifCiblageApprobation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoAutorisationObjectifCiblageApprobation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Autorisation Objectif Ciblage Approbation</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoAutorisationObjectifCiblageApprobation get(int value) {
		switch (value) {
			case APPAVL_VALUE: return APPAVL;
			case APPEXC_VALUE: return APPEXC;
			case NOTAPP_VALUE: return NOTAPP;
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
	private TypeDictionaryDicoAutorisationObjectifCiblageApprobation(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoAutorisationObjectifCiblageApprobation
