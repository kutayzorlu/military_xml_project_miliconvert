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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Liaison Reseau Type Climat</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoLiaisonReseauTypeClimat()
 * @model extendedMetaData="name='type_Dictionary_Dico_LiaisonReseauTypeClimat'"
 * @generated
 */
public enum TypeDictionaryDicoLiaisonReseauTypeClimat implements Enumerator {
	/**
	 * The '<em><b>FAV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAV_VALUE
	 * @generated
	 * @ordered
	 */
	FAV(0, "FAV", "FAV"),

	/**
	 * The '<em><b>AVRG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AVRG_VALUE
	 * @generated
	 * @ordered
	 */
	AVRG(1, "AVRG", "AVRG"),

	/**
	 * The '<em><b>DIFF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIFF_VALUE
	 * @generated
	 * @ordered
	 */
	DIFF(2, "DIFF", "DIFF"),

	/**
	 * The '<em><b>TDEF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TDEF_VALUE
	 * @generated
	 * @ordered
	 */
	TDEF(3, "TDEF", "TDEF");

	/**
	 * The '<em><b>FAV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FAV</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FAV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FAV_VALUE = 0;

	/**
	 * The '<em><b>AVRG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AVRG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AVRG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AVRG_VALUE = 1;

	/**
	 * The '<em><b>DIFF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DIFF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIFF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DIFF_VALUE = 2;

	/**
	 * The '<em><b>TDEF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TDEF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TDEF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TDEF_VALUE = 3;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Liaison Reseau Type Climat</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoLiaisonReseauTypeClimat[] VALUES_ARRAY =
		new TypeDictionaryDicoLiaisonReseauTypeClimat[] {
			FAV,
			AVRG,
			DIFF,
			TDEF,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Liaison Reseau Type Climat</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoLiaisonReseauTypeClimat> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Liaison Reseau Type Climat</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoLiaisonReseauTypeClimat get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoLiaisonReseauTypeClimat result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Liaison Reseau Type Climat</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoLiaisonReseauTypeClimat getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoLiaisonReseauTypeClimat result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Liaison Reseau Type Climat</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoLiaisonReseauTypeClimat get(int value) {
		switch (value) {
			case FAV_VALUE: return FAV;
			case AVRG_VALUE: return AVRG;
			case DIFF_VALUE: return DIFF;
			case TDEF_VALUE: return TDEF;
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
	private TypeDictionaryDicoLiaisonReseauTypeClimat(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoLiaisonReseauTypeClimat
