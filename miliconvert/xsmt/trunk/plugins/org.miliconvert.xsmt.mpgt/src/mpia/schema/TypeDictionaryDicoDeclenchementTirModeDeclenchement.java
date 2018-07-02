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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Declenchement Tir Mode Declenchement</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoDeclenchementTirModeDeclenchement()
 * @model extendedMetaData="name='type_Dictionary_Dico_DeclenchementTirModeDeclenchement'"
 * @generated
 */
public enum TypeDictionaryDicoDeclenchementTirModeDeclenchement implements Enumerator {
	/**
	 * The '<em><b>TOT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOT_VALUE
	 * @generated
	 * @ordered
	 */
	TOT(0, "TOT", "TOT"),

	/**
	 * The '<em><b>AMC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMC_VALUE
	 * @generated
	 * @ordered
	 */
	AMC(1, "AMC", "AMC"),

	/**
	 * The '<em><b>TTF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TTF_VALUE
	 * @generated
	 * @ordered
	 */
	TTF(2, "TTF", "TTF"),

	/**
	 * The '<em><b>WR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WR_VALUE
	 * @generated
	 * @ordered
	 */
	WR(3, "WR", "WR"),

	/**
	 * The '<em><b>OO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OO_VALUE
	 * @generated
	 * @ordered
	 */
	OO(4, "OO", "OO");

	/**
	 * The '<em><b>TOT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TOT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TOT_VALUE = 0;

	/**
	 * The '<em><b>AMC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AMC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AMC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AMC_VALUE = 1;

	/**
	 * The '<em><b>TTF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TTF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TTF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TTF_VALUE = 2;

	/**
	 * The '<em><b>WR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WR_VALUE = 3;

	/**
	 * The '<em><b>OO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OO_VALUE = 4;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Declenchement Tir Mode Declenchement</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoDeclenchementTirModeDeclenchement[] VALUES_ARRAY =
		new TypeDictionaryDicoDeclenchementTirModeDeclenchement[] {
			TOT,
			AMC,
			TTF,
			WR,
			OO,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Declenchement Tir Mode Declenchement</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoDeclenchementTirModeDeclenchement> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Declenchement Tir Mode Declenchement</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoDeclenchementTirModeDeclenchement get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoDeclenchementTirModeDeclenchement result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Declenchement Tir Mode Declenchement</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoDeclenchementTirModeDeclenchement getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoDeclenchementTirModeDeclenchement result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Declenchement Tir Mode Declenchement</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoDeclenchementTirModeDeclenchement get(int value) {
		switch (value) {
			case TOT_VALUE: return TOT;
			case AMC_VALUE: return AMC;
			case TTF_VALUE: return TTF;
			case WR_VALUE: return WR;
			case OO_VALUE: return OO;
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
	private TypeDictionaryDicoDeclenchementTirModeDeclenchement(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoDeclenchementTirModeDeclenchement
