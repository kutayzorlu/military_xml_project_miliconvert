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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Association Instance Objet Adresse Transmission Et Reception</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoAssociationInstanceObjetAdresseTransmissionEtReception()
 * @model extendedMetaData="name='type_Dictionary_Dico_AssociationInstanceObjetAdresseTransmissionEtReception'"
 * @generated
 */
public enum TypeDictionaryDicoAssociationInstanceObjetAdresseTransmissionEtReception implements Enumerator {
	/**
	 * The '<em><b>RECEIV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECEIV_VALUE
	 * @generated
	 * @ordered
	 */
	RECEIV(0, "RECEIV", "RECEIV"),

	/**
	 * The '<em><b>TRNSMT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRNSMT_VALUE
	 * @generated
	 * @ordered
	 */
	TRNSMT(1, "TRNSMT", "TRNSMT"),

	/**
	 * The '<em><b>TRNREC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRNREC_VALUE
	 * @generated
	 * @ordered
	 */
	TRNREC(2, "TRNREC", "TRNREC");

	/**
	 * The '<em><b>RECEIV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RECEIV</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RECEIV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RECEIV_VALUE = 0;

	/**
	 * The '<em><b>TRNSMT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRNSMT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRNSMT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRNSMT_VALUE = 1;

	/**
	 * The '<em><b>TRNREC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRNREC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRNREC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRNREC_VALUE = 2;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Association Instance Objet Adresse Transmission Et Reception</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoAssociationInstanceObjetAdresseTransmissionEtReception[] VALUES_ARRAY =
		new TypeDictionaryDicoAssociationInstanceObjetAdresseTransmissionEtReception[] {
			RECEIV,
			TRNSMT,
			TRNREC,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Association Instance Objet Adresse Transmission Et Reception</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoAssociationInstanceObjetAdresseTransmissionEtReception> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Association Instance Objet Adresse Transmission Et Reception</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoAssociationInstanceObjetAdresseTransmissionEtReception get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoAssociationInstanceObjetAdresseTransmissionEtReception result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Association Instance Objet Adresse Transmission Et Reception</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoAssociationInstanceObjetAdresseTransmissionEtReception getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoAssociationInstanceObjetAdresseTransmissionEtReception result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Association Instance Objet Adresse Transmission Et Reception</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoAssociationInstanceObjetAdresseTransmissionEtReception get(int value) {
		switch (value) {
			case RECEIV_VALUE: return RECEIV;
			case TRNSMT_VALUE: return TRNSMT;
			case TRNREC_VALUE: return TRNREC;
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
	private TypeDictionaryDicoAssociationInstanceObjetAdresseTransmissionEtReception(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoAssociationInstanceObjetAdresseTransmissionEtReception
