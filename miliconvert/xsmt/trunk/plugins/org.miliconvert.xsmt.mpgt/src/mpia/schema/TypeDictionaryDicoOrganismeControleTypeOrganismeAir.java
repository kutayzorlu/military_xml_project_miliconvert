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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Organisme Controle Type Organisme Air</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoOrganismeControleTypeOrganismeAir()
 * @model extendedMetaData="name='type_Dictionary_Dico_OrganismeControleTypeOrganismeAir'"
 * @generated
 */
public enum TypeDictionaryDicoOrganismeControleTypeOrganismeAir implements Enumerator {
	/**
	 * The '<em><b>DCC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DCC_VALUE
	 * @generated
	 * @ordered
	 */
	DCC(0, "DCC", "DCC"),

	/**
	 * The '<em><b>TCU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TCU_VALUE
	 * @generated
	 * @ordered
	 */
	TCU(1, "TCU", "TCU"),

	/**
	 * The '<em><b>ADCS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADCS_VALUE
	 * @generated
	 * @ordered
	 */
	ADCS(2, "ADCS", "ADCS"),

	/**
	 * The '<em><b>NOS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOS_VALUE
	 * @generated
	 * @ordered
	 */
	NOS(3, "NOS", "NOS"),

	/**
	 * The '<em><b>SHORAD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHORAD_VALUE
	 * @generated
	 * @ordered
	 */
	SHORAD(4, "SHORAD", "SHORAD");

	/**
	 * The '<em><b>DCC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DCC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DCC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DCC_VALUE = 0;

	/**
	 * The '<em><b>TCU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TCU</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TCU
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TCU_VALUE = 1;

	/**
	 * The '<em><b>ADCS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ADCS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADCS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ADCS_VALUE = 2;

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
	public static final int NOS_VALUE = 3;

	/**
	 * The '<em><b>SHORAD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SHORAD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHORAD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SHORAD_VALUE = 4;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Organisme Controle Type Organisme Air</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoOrganismeControleTypeOrganismeAir[] VALUES_ARRAY =
		new TypeDictionaryDicoOrganismeControleTypeOrganismeAir[] {
			DCC,
			TCU,
			ADCS,
			NOS,
			SHORAD,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Organisme Controle Type Organisme Air</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoOrganismeControleTypeOrganismeAir> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Organisme Controle Type Organisme Air</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoOrganismeControleTypeOrganismeAir get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoOrganismeControleTypeOrganismeAir result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Organisme Controle Type Organisme Air</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoOrganismeControleTypeOrganismeAir getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoOrganismeControleTypeOrganismeAir result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Organisme Controle Type Organisme Air</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoOrganismeControleTypeOrganismeAir get(int value) {
		switch (value) {
			case DCC_VALUE: return DCC;
			case TCU_VALUE: return TCU;
			case ADCS_VALUE: return ADCS;
			case NOS_VALUE: return NOS;
			case SHORAD_VALUE: return SHORAD;
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
	private TypeDictionaryDicoOrganismeControleTypeOrganismeAir(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoOrganismeControleTypeOrganismeAir
