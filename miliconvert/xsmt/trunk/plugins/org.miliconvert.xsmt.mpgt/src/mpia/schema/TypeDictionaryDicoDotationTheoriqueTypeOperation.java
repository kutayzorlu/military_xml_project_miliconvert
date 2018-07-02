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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Dotation Theorique Type Operation</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoDotationTheoriqueTypeOperation()
 * @model extendedMetaData="name='type_Dictionary_Dico_DotationTheoriqueTypeOperation'"
 * @generated
 */
public enum TypeDictionaryDicoDotationTheoriqueTypeOperation implements Enumerator {
	/**
	 * The '<em><b>CV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CV_VALUE
	 * @generated
	 * @ordered
	 */
	CV(0, "CV", "CV"),

	/**
	 * The '<em><b>HU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HU_VALUE
	 * @generated
	 * @ordered
	 */
	HU(1, "HU", "HU"),

	/**
	 * The '<em><b>IS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_VALUE
	 * @generated
	 * @ordered
	 */
	IS(2, "IS", "IS"),

	/**
	 * The '<em><b>PE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PE_VALUE
	 * @generated
	 * @ordered
	 */
	PE(3, "PE", "PE"),

	/**
	 * The '<em><b>PSO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PSO_VALUE
	 * @generated
	 * @ordered
	 */
	PSO(4, "PSO", "PSO"),

	/**
	 * The '<em><b>PK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PK_VALUE
	 * @generated
	 * @ordered
	 */
	PK(5, "PK", "PK"),

	/**
	 * The '<em><b>WA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WA_VALUE
	 * @generated
	 * @ordered
	 */
	WA(6, "WA", "WA");

	/**
	 * The '<em><b>CV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CV</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CV_VALUE = 0;

	/**
	 * The '<em><b>HU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HU</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HU
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HU_VALUE = 1;

	/**
	 * The '<em><b>IS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IS_VALUE = 2;

	/**
	 * The '<em><b>PE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PE_VALUE = 3;

	/**
	 * The '<em><b>PSO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PSO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PSO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PSO_VALUE = 4;

	/**
	 * The '<em><b>PK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PK_VALUE = 5;

	/**
	 * The '<em><b>WA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WA_VALUE = 6;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Dotation Theorique Type Operation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoDotationTheoriqueTypeOperation[] VALUES_ARRAY =
		new TypeDictionaryDicoDotationTheoriqueTypeOperation[] {
			CV,
			HU,
			IS,
			PE,
			PSO,
			PK,
			WA,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Dotation Theorique Type Operation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoDotationTheoriqueTypeOperation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Dotation Theorique Type Operation</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoDotationTheoriqueTypeOperation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoDotationTheoriqueTypeOperation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Dotation Theorique Type Operation</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoDotationTheoriqueTypeOperation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoDotationTheoriqueTypeOperation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Dotation Theorique Type Operation</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoDotationTheoriqueTypeOperation get(int value) {
		switch (value) {
			case CV_VALUE: return CV;
			case HU_VALUE: return HU;
			case IS_VALUE: return IS;
			case PE_VALUE: return PE;
			case PSO_VALUE: return PSO;
			case PK_VALUE: return PK;
			case WA_VALUE: return WA;
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
	private TypeDictionaryDicoDotationTheoriqueTypeOperation(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoDotationTheoriqueTypeOperation
