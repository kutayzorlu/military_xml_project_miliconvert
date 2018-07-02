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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Prelevement Taux Relatif Decroissance</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoPrelevementTauxRelatifDecroissance()
 * @model extendedMetaData="name='type_Dictionary_Dico_PrelevementTauxRelatifDecroissance'"
 * @generated
 */
public enum TypeDictionaryDicoPrelevementTauxRelatifDecroissance implements Enumerator {
	/**
	 * The '<em><b>DF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DF_VALUE
	 * @generated
	 * @ordered
	 */
	DF(0, "DF", "DF"),

	/**
	 * The '<em><b>DN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DN_VALUE
	 * @generated
	 * @ordered
	 */
	DN(1, "DN", "DN"),

	/**
	 * The '<em><b>DS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DS_VALUE
	 * @generated
	 * @ordered
	 */
	DS(2, "DS", "DS");

	/**
	 * The '<em><b>DF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DF_VALUE = 0;

	/**
	 * The '<em><b>DN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DN_VALUE = 1;

	/**
	 * The '<em><b>DS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DS_VALUE = 2;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Prelevement Taux Relatif Decroissance</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoPrelevementTauxRelatifDecroissance[] VALUES_ARRAY =
		new TypeDictionaryDicoPrelevementTauxRelatifDecroissance[] {
			DF,
			DN,
			DS,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Prelevement Taux Relatif Decroissance</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoPrelevementTauxRelatifDecroissance> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Prelevement Taux Relatif Decroissance</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoPrelevementTauxRelatifDecroissance get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoPrelevementTauxRelatifDecroissance result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Prelevement Taux Relatif Decroissance</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoPrelevementTauxRelatifDecroissance getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoPrelevementTauxRelatifDecroissance result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Prelevement Taux Relatif Decroissance</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoPrelevementTauxRelatifDecroissance get(int value) {
		switch (value) {
			case DF_VALUE: return DF;
			case DN_VALUE: return DN;
			case DS_VALUE: return DS;
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
	private TypeDictionaryDicoPrelevementTauxRelatifDecroissance(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoPrelevementTauxRelatifDecroissance
