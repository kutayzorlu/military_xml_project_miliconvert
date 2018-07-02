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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Etat Liaison Marquage Special</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoEtatLiaisonMarquageSpecial()
 * @model extendedMetaData="name='type_Dictionary_Dico_EtatLiaisonMarquageSpecial'"
 * @generated
 */
public enum TypeDictionaryDicoEtatLiaisonMarquageSpecial implements Enumerator {
	/**
	 * The '<em><b>ATOMAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATOMAL_VALUE
	 * @generated
	 * @ordered
	 */
	ATOMAL(0, "ATOMAL", "ATOMAL"),

	/**
	 * The '<em><b>CRYPTOSECURITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRYPTOSECURITY_VALUE
	 * @generated
	 * @ordered
	 */
	CRYPTOSECURITY(1, "CRYPTOSECURITY", "CRYPTO SECURITY");

	/**
	 * The '<em><b>ATOMAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ATOMAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ATOMAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ATOMAL_VALUE = 0;

	/**
	 * The '<em><b>CRYPTOSECURITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CRYPTOSECURITY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CRYPTOSECURITY
	 * @model literal="CRYPTO SECURITY"
	 * @generated
	 * @ordered
	 */
	public static final int CRYPTOSECURITY_VALUE = 1;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Etat Liaison Marquage Special</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoEtatLiaisonMarquageSpecial[] VALUES_ARRAY =
		new TypeDictionaryDicoEtatLiaisonMarquageSpecial[] {
			ATOMAL,
			CRYPTOSECURITY,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Etat Liaison Marquage Special</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoEtatLiaisonMarquageSpecial> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Etat Liaison Marquage Special</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoEtatLiaisonMarquageSpecial get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoEtatLiaisonMarquageSpecial result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Etat Liaison Marquage Special</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoEtatLiaisonMarquageSpecial getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoEtatLiaisonMarquageSpecial result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Etat Liaison Marquage Special</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoEtatLiaisonMarquageSpecial get(int value) {
		switch (value) {
			case ATOMAL_VALUE: return ATOMAL;
			case CRYPTOSECURITY_VALUE: return CRYPTOSECURITY;
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
	private TypeDictionaryDicoEtatLiaisonMarquageSpecial(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoEtatLiaisonMarquageSpecial
