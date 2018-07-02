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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Frequence Bande Frequence</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoFrequenceBandeFrequence()
 * @model extendedMetaData="name='type_Dictionary_Dico_FrequenceBandeFrequence'"
 * @generated
 */
public enum TypeDictionaryDicoFrequenceBandeFrequence implements Enumerator {
	/**
	 * The '<em><b>EHF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EHF_VALUE
	 * @generated
	 * @ordered
	 */
	EHF(0, "EHF", "EHF"),

	/**
	 * The '<em><b>HF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HF_VALUE
	 * @generated
	 * @ordered
	 */
	HF(1, "HF", "HF"),

	/**
	 * The '<em><b>LF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LF_VALUE
	 * @generated
	 * @ordered
	 */
	LF(2, "LF", "LF"),

	/**
	 * The '<em><b>MF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MF_VALUE
	 * @generated
	 * @ordered
	 */
	MF(3, "MF", "MF"),

	/**
	 * The '<em><b>SHF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHF_VALUE
	 * @generated
	 * @ordered
	 */
	SHF(4, "SHF", "SHF"),

	/**
	 * The '<em><b>UHF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UHF_VALUE
	 * @generated
	 * @ordered
	 */
	UHF(5, "UHF", "UHF"),

	/**
	 * The '<em><b>VHF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VHF_VALUE
	 * @generated
	 * @ordered
	 */
	VHF(6, "VHF", "VHF"),

	/**
	 * The '<em><b>VLF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VLF_VALUE
	 * @generated
	 * @ordered
	 */
	VLF(7, "VLF", "VLF");

	/**
	 * The '<em><b>EHF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EHF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EHF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EHF_VALUE = 0;

	/**
	 * The '<em><b>HF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HF_VALUE = 1;

	/**
	 * The '<em><b>LF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LF_VALUE = 2;

	/**
	 * The '<em><b>MF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MF_VALUE = 3;

	/**
	 * The '<em><b>SHF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SHF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SHF_VALUE = 4;

	/**
	 * The '<em><b>UHF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UHF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UHF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UHF_VALUE = 5;

	/**
	 * The '<em><b>VHF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VHF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VHF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VHF_VALUE = 6;

	/**
	 * The '<em><b>VLF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VLF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VLF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VLF_VALUE = 7;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Frequence Bande Frequence</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoFrequenceBandeFrequence[] VALUES_ARRAY =
		new TypeDictionaryDicoFrequenceBandeFrequence[] {
			EHF,
			HF,
			LF,
			MF,
			SHF,
			UHF,
			VHF,
			VLF,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Frequence Bande Frequence</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoFrequenceBandeFrequence> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Frequence Bande Frequence</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoFrequenceBandeFrequence get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoFrequenceBandeFrequence result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Frequence Bande Frequence</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoFrequenceBandeFrequence getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoFrequenceBandeFrequence result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Frequence Bande Frequence</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoFrequenceBandeFrequence get(int value) {
		switch (value) {
			case EHF_VALUE: return EHF;
			case HF_VALUE: return HF;
			case LF_VALUE: return LF;
			case MF_VALUE: return MF;
			case SHF_VALUE: return SHF;
			case UHF_VALUE: return UHF;
			case VHF_VALUE: return VHF;
			case VLF_VALUE: return VLF;
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
	private TypeDictionaryDicoFrequenceBandeFrequence(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoFrequenceBandeFrequence
