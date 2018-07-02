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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Modalite Transfert Autorite ASS Type Appui ASS</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoModaliteTransfertAutoriteASSTypeAppuiASS()
 * @model extendedMetaData="name='type_Dictionary_Dico_ModaliteTransfertAutoriteASSTypeAppuiASS'"
 * @generated
 */
public enum TypeDictionaryDicoModaliteTransfertAutoriteASSTypeAppuiASS implements Enumerator {
	/**
	 * The '<em><b>DSR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DSR_VALUE
	 * @generated
	 * @ordered
	 */
	DSR(0, "DSR", "DSR"),

	/**
	 * The '<em><b>GS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GS_VALUE
	 * @generated
	 * @ordered
	 */
	GS(1, "GS", "GS"),

	/**
	 * The '<em><b>GSR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GSR_VALUE
	 * @generated
	 * @ordered
	 */
	GSR(2, "GSR", "GSR");

	/**
	 * The '<em><b>DSR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DSR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DSR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DSR_VALUE = 0;

	/**
	 * The '<em><b>GS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GS_VALUE = 1;

	/**
	 * The '<em><b>GSR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GSR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GSR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GSR_VALUE = 2;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Modalite Transfert Autorite ASS Type Appui ASS</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoModaliteTransfertAutoriteASSTypeAppuiASS[] VALUES_ARRAY =
		new TypeDictionaryDicoModaliteTransfertAutoriteASSTypeAppuiASS[] {
			DSR,
			GS,
			GSR,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Modalite Transfert Autorite ASS Type Appui ASS</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoModaliteTransfertAutoriteASSTypeAppuiASS> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Modalite Transfert Autorite ASS Type Appui ASS</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoModaliteTransfertAutoriteASSTypeAppuiASS get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoModaliteTransfertAutoriteASSTypeAppuiASS result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Modalite Transfert Autorite ASS Type Appui ASS</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoModaliteTransfertAutoriteASSTypeAppuiASS getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoModaliteTransfertAutoriteASSTypeAppuiASS result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Modalite Transfert Autorite ASS Type Appui ASS</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoModaliteTransfertAutoriteASSTypeAppuiASS get(int value) {
		switch (value) {
			case DSR_VALUE: return DSR;
			case GS_VALUE: return GS;
			case GSR_VALUE: return GSR;
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
	private TypeDictionaryDicoModaliteTransfertAutoriteASSTypeAppuiASS(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoModaliteTransfertAutoriteASSTypeAppuiASS
