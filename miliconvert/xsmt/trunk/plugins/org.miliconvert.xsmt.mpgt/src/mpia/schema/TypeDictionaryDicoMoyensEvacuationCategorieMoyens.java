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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Moyens Evacuation Categorie Moyens</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoMoyensEvacuationCategorieMoyens()
 * @model extendedMetaData="name='type_Dictionary_Dico_MoyensEvacuationCategorieMoyens'"
 * @generated
 */
public enum TypeDictionaryDicoMoyensEvacuationCategorieMoyens implements Enumerator {
	/**
	 * The '<em><b>LREC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LREC_VALUE
	 * @generated
	 * @ordered
	 */
	LREC(0, "LREC", "LREC"),

	/**
	 * The '<em><b>MREC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MREC_VALUE
	 * @generated
	 * @ordered
	 */
	MREC(1, "MREC", "MREC"),

	/**
	 * The '<em><b>HREC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HREC_VALUE
	 * @generated
	 * @ordered
	 */
	HREC(2, "HREC", "HREC");

	/**
	 * The '<em><b>LREC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LREC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LREC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LREC_VALUE = 0;

	/**
	 * The '<em><b>MREC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MREC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MREC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MREC_VALUE = 1;

	/**
	 * The '<em><b>HREC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HREC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HREC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HREC_VALUE = 2;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Moyens Evacuation Categorie Moyens</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoMoyensEvacuationCategorieMoyens[] VALUES_ARRAY =
		new TypeDictionaryDicoMoyensEvacuationCategorieMoyens[] {
			LREC,
			MREC,
			HREC,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Moyens Evacuation Categorie Moyens</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoMoyensEvacuationCategorieMoyens> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Moyens Evacuation Categorie Moyens</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoMoyensEvacuationCategorieMoyens get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoMoyensEvacuationCategorieMoyens result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Moyens Evacuation Categorie Moyens</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoMoyensEvacuationCategorieMoyens getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoMoyensEvacuationCategorieMoyens result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Moyens Evacuation Categorie Moyens</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoMoyensEvacuationCategorieMoyens get(int value) {
		switch (value) {
			case LREC_VALUE: return LREC;
			case MREC_VALUE: return MREC;
			case HREC_VALUE: return HREC;
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
	private TypeDictionaryDicoMoyensEvacuationCategorieMoyens(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoMoyensEvacuationCategorieMoyens
