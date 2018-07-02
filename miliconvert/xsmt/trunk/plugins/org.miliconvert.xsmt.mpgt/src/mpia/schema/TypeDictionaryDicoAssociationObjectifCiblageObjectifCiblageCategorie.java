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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Association Objectif Ciblage Objectif Ciblage Categorie</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoAssociationObjectifCiblageObjectifCiblageCategorie()
 * @model extendedMetaData="name='type_Dictionary_Dico_AssociationObjectifCiblageObjectifCiblageCategorie'"
 * @generated
 */
public enum TypeDictionaryDicoAssociationObjectifCiblageObjectifCiblageCategorie implements Enumerator {
	/**
	 * The '<em><b>COMPNT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPNT_VALUE
	 * @generated
	 * @ordered
	 */
	COMPNT(0, "COMPNT", "COMPNT"),

	/**
	 * The '<em><b>COLOC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLOC_VALUE
	 * @generated
	 * @ordered
	 */
	COLOC(1, "COLOC", "COLOC");

	/**
	 * The '<em><b>COMPNT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMPNT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPNT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPNT_VALUE = 0;

	/**
	 * The '<em><b>COLOC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COLOC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLOC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COLOC_VALUE = 1;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Association Objectif Ciblage Objectif Ciblage Categorie</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoAssociationObjectifCiblageObjectifCiblageCategorie[] VALUES_ARRAY =
		new TypeDictionaryDicoAssociationObjectifCiblageObjectifCiblageCategorie[] {
			COMPNT,
			COLOC,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Association Objectif Ciblage Objectif Ciblage Categorie</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoAssociationObjectifCiblageObjectifCiblageCategorie> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Association Objectif Ciblage Objectif Ciblage Categorie</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoAssociationObjectifCiblageObjectifCiblageCategorie get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoAssociationObjectifCiblageObjectifCiblageCategorie result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Association Objectif Ciblage Objectif Ciblage Categorie</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoAssociationObjectifCiblageObjectifCiblageCategorie getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoAssociationObjectifCiblageObjectifCiblageCategorie result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Association Objectif Ciblage Objectif Ciblage Categorie</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoAssociationObjectifCiblageObjectifCiblageCategorie get(int value) {
		switch (value) {
			case COMPNT_VALUE: return COMPNT;
			case COLOC_VALUE: return COLOC;
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
	private TypeDictionaryDicoAssociationObjectifCiblageObjectifCiblageCategorie(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoAssociationObjectifCiblageObjectifCiblageCategorie
