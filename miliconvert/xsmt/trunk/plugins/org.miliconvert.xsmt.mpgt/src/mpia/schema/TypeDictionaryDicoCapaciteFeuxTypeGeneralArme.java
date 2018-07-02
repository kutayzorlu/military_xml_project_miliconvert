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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Capacite Feux Type General Arme</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoCapaciteFeuxTypeGeneralArme()
 * @model extendedMetaData="name='type_Dictionary_Dico_CapaciteFeuxTypeGeneralArme'"
 * @generated
 */
public enum TypeDictionaryDicoCapaciteFeuxTypeGeneralArme implements Enumerator {
	/**
	 * The '<em><b>CONV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONV_VALUE
	 * @generated
	 * @ordered
	 */
	CONV(0, "CONV", "CONV"),

	/**
	 * The '<em><b>NUC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUC_VALUE
	 * @generated
	 * @ordered
	 */
	NUC(1, "NUC", "NUC"),

	/**
	 * The '<em><b>DUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DUAL_VALUE
	 * @generated
	 * @ordered
	 */
	DUAL(2, "DUAL", "DUAL"),

	/**
	 * The '<em><b>NCC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NCC_VALUE
	 * @generated
	 * @ordered
	 */
	NCC(3, "NCC", "NCC"),

	/**
	 * The '<em><b>NKN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NKN_VALUE
	 * @generated
	 * @ordered
	 */
	NKN(4, "NKN", "NKN"),

	/**
	 * The '<em><b>NOS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOS_VALUE
	 * @generated
	 * @ordered
	 */
	NOS(5, "NOS", "NOS");

	/**
	 * The '<em><b>CONV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONV</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONV_VALUE = 0;

	/**
	 * The '<em><b>NUC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NUC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NUC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NUC_VALUE = 1;

	/**
	 * The '<em><b>DUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DUAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DUAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DUAL_VALUE = 2;

	/**
	 * The '<em><b>NCC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NCC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NCC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NCC_VALUE = 3;

	/**
	 * The '<em><b>NKN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NKN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NKN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NKN_VALUE = 4;

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
	public static final int NOS_VALUE = 5;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Capacite Feux Type General Arme</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoCapaciteFeuxTypeGeneralArme[] VALUES_ARRAY =
		new TypeDictionaryDicoCapaciteFeuxTypeGeneralArme[] {
			CONV,
			NUC,
			DUAL,
			NCC,
			NKN,
			NOS,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Capacite Feux Type General Arme</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoCapaciteFeuxTypeGeneralArme> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Capacite Feux Type General Arme</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoCapaciteFeuxTypeGeneralArme get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoCapaciteFeuxTypeGeneralArme result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Capacite Feux Type General Arme</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoCapaciteFeuxTypeGeneralArme getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoCapaciteFeuxTypeGeneralArme result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Capacite Feux Type General Arme</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoCapaciteFeuxTypeGeneralArme get(int value) {
		switch (value) {
			case CONV_VALUE: return CONV;
			case NUC_VALUE: return NUC;
			case DUAL_VALUE: return DUAL;
			case NCC_VALUE: return NCC;
			case NKN_VALUE: return NKN;
			case NOS_VALUE: return NOS;
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
	private TypeDictionaryDicoCapaciteFeuxTypeGeneralArme(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoCapaciteFeuxTypeGeneralArme
