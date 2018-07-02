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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Politique Tir Aeronef Mecanisme Tir</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoPolitiqueTirAeronefMecanismeTir()
 * @model extendedMetaData="name='type_Dictionary_Dico_PolitiqueTirAeronefMecanismeTir'"
 * @generated
 */
public enum TypeDictionaryDicoPolitiqueTirAeronefMecanismeTir implements Enumerator {
	/**
	 * The '<em><b>SBS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SBS_VALUE
	 * @generated
	 * @ordered
	 */
	SBS(0, "SBS", "SBS"),

	/**
	 * The '<em><b>SALVO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SALVO_VALUE
	 * @generated
	 * @ordered
	 */
	SALVO(1, "SALVO", "SALVO"),

	/**
	 * The '<em><b>BURST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BURST_VALUE
	 * @generated
	 * @ordered
	 */
	BURST(2, "BURST", "BURST");

	/**
	 * The '<em><b>SBS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SBS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SBS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SBS_VALUE = 0;

	/**
	 * The '<em><b>SALVO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SALVO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SALVO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SALVO_VALUE = 1;

	/**
	 * The '<em><b>BURST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BURST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BURST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BURST_VALUE = 2;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Politique Tir Aeronef Mecanisme Tir</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoPolitiqueTirAeronefMecanismeTir[] VALUES_ARRAY =
		new TypeDictionaryDicoPolitiqueTirAeronefMecanismeTir[] {
			SBS,
			SALVO,
			BURST,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Politique Tir Aeronef Mecanisme Tir</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoPolitiqueTirAeronefMecanismeTir> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Politique Tir Aeronef Mecanisme Tir</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoPolitiqueTirAeronefMecanismeTir get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoPolitiqueTirAeronefMecanismeTir result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Politique Tir Aeronef Mecanisme Tir</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoPolitiqueTirAeronefMecanismeTir getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoPolitiqueTirAeronefMecanismeTir result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Politique Tir Aeronef Mecanisme Tir</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoPolitiqueTirAeronefMecanismeTir get(int value) {
		switch (value) {
			case SBS_VALUE: return SBS;
			case SALVO_VALUE: return SALVO;
			case BURST_VALUE: return BURST;
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
	private TypeDictionaryDicoPolitiqueTirAeronefMecanismeTir(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoPolitiqueTirAeronefMecanismeTir
