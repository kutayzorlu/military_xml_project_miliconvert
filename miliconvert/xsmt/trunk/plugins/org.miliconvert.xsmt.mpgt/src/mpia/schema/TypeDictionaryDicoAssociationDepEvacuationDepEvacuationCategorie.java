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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Association Dep Evacuation Dep Evacuation Categorie</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoAssociationDepEvacuationDepEvacuationCategorie()
 * @model extendedMetaData="name='type_Dictionary_Dico_AssociationDepEvacuationDepEvacuationCategorie'"
 * @generated
 */
public enum TypeDictionaryDicoAssociationDepEvacuationDepEvacuationCategorie implements Enumerator {
	/**
	 * The '<em><b>INRSTO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INRSTO_VALUE
	 * @generated
	 * @ordered
	 */
	INRSTO(0, "INRSTO", "INRSTO");

	/**
	 * The '<em><b>INRSTO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INRSTO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INRSTO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INRSTO_VALUE = 0;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Association Dep Evacuation Dep Evacuation Categorie</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoAssociationDepEvacuationDepEvacuationCategorie[] VALUES_ARRAY =
		new TypeDictionaryDicoAssociationDepEvacuationDepEvacuationCategorie[] {
			INRSTO,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Association Dep Evacuation Dep Evacuation Categorie</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoAssociationDepEvacuationDepEvacuationCategorie> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Association Dep Evacuation Dep Evacuation Categorie</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoAssociationDepEvacuationDepEvacuationCategorie get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoAssociationDepEvacuationDepEvacuationCategorie result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Association Dep Evacuation Dep Evacuation Categorie</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoAssociationDepEvacuationDepEvacuationCategorie getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoAssociationDepEvacuationDepEvacuationCategorie result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Association Dep Evacuation Dep Evacuation Categorie</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoAssociationDepEvacuationDepEvacuationCategorie get(int value) {
		switch (value) {
			case INRSTO_VALUE: return INRSTO;
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
	private TypeDictionaryDicoAssociationDepEvacuationDepEvacuationCategorie(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoAssociationDepEvacuationDepEvacuationCategorie
