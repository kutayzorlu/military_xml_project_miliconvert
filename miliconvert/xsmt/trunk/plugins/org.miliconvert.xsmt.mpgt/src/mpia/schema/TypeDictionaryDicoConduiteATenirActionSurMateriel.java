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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Conduite ATenir Action Sur Materiel</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoConduiteATenirActionSurMateriel()
 * @model extendedMetaData="name='type_Dictionary_Dico_ConduiteATenirActionSurMateriel'"
 * @generated
 */
public enum TypeDictionaryDicoConduiteATenirActionSurMateriel implements Enumerator {
	/**
	 * The '<em><b>CAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAN_VALUE
	 * @generated
	 * @ordered
	 */
	CAN(0, "CAN", "CAN"),

	/**
	 * The '<em><b>DES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DES_VALUE
	 * @generated
	 * @ordered
	 */
	DES(1, "DES", "DES"),

	/**
	 * The '<em><b>SAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAL_VALUE
	 * @generated
	 * @ordered
	 */
	SAL(2, "SAL", "SAL"),

	/**
	 * The '<em><b>NEUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEUT_VALUE
	 * @generated
	 * @ordered
	 */
	NEUT(3, "NEUT", "NEUT"),

	/**
	 * The '<em><b>CDR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDR_VALUE
	 * @generated
	 * @ordered
	 */
	CDR(4, "CDR", "CDR");

	/**
	 * The '<em><b>CAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CAN_VALUE = 0;

	/**
	 * The '<em><b>DES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DES_VALUE = 1;

	/**
	 * The '<em><b>SAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SAL_VALUE = 2;

	/**
	 * The '<em><b>NEUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NEUT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEUT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NEUT_VALUE = 3;

	/**
	 * The '<em><b>CDR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CDR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CDR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CDR_VALUE = 4;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Conduite ATenir Action Sur Materiel</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoConduiteATenirActionSurMateriel[] VALUES_ARRAY =
		new TypeDictionaryDicoConduiteATenirActionSurMateriel[] {
			CAN,
			DES,
			SAL,
			NEUT,
			CDR,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Conduite ATenir Action Sur Materiel</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoConduiteATenirActionSurMateriel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Conduite ATenir Action Sur Materiel</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoConduiteATenirActionSurMateriel get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoConduiteATenirActionSurMateriel result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Conduite ATenir Action Sur Materiel</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoConduiteATenirActionSurMateriel getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoConduiteATenirActionSurMateriel result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Conduite ATenir Action Sur Materiel</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoConduiteATenirActionSurMateriel get(int value) {
		switch (value) {
			case CAN_VALUE: return CAN;
			case DES_VALUE: return DES;
			case SAL_VALUE: return SAL;
			case NEUT_VALUE: return NEUT;
			case CDR_VALUE: return CDR;
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
	private TypeDictionaryDicoConduiteATenirActionSurMateriel(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoConduiteATenirActionSurMateriel
