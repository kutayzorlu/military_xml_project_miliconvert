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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Poste Amarrage Type Batiment Principal</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoPosteAmarrageTypeBatimentPrincipal()
 * @model extendedMetaData="name='type_Dictionary_Dico_PosteAmarrageTypeBatimentPrincipal'"
 * @generated
 */
public enum TypeDictionaryDicoPosteAmarrageTypeBatimentPrincipal implements Enumerator {
	/**
	 * The '<em><b>BARGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BARGE_VALUE
	 * @generated
	 * @ordered
	 */
	BARGE(0, "BARGE", "BARGE"),

	/**
	 * The '<em><b>BRKBLK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BRKBLK_VALUE
	 * @generated
	 * @ordered
	 */
	BRKBLK(1, "BRKBLK", "BRKBLK"),

	/**
	 * The '<em><b>CONTNR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTNR_VALUE
	 * @generated
	 * @ordered
	 */
	CONTNR(2, "CONTNR", "CONTNR"),

	/**
	 * The '<em><b>RORO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RORO_VALUE
	 * @generated
	 * @ordered
	 */
	RORO(3, "RORO", "RORO"),

	/**
	 * The '<em><b>NOS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOS_VALUE
	 * @generated
	 * @ordered
	 */
	NOS(4, "NOS", "NOS");

	/**
	 * The '<em><b>BARGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BARGE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BARGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BARGE_VALUE = 0;

	/**
	 * The '<em><b>BRKBLK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BRKBLK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BRKBLK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BRKBLK_VALUE = 1;

	/**
	 * The '<em><b>CONTNR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONTNR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTNR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONTNR_VALUE = 2;

	/**
	 * The '<em><b>RORO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RORO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RORO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RORO_VALUE = 3;

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
	public static final int NOS_VALUE = 4;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Poste Amarrage Type Batiment Principal</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoPosteAmarrageTypeBatimentPrincipal[] VALUES_ARRAY =
		new TypeDictionaryDicoPosteAmarrageTypeBatimentPrincipal[] {
			BARGE,
			BRKBLK,
			CONTNR,
			RORO,
			NOS,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Poste Amarrage Type Batiment Principal</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoPosteAmarrageTypeBatimentPrincipal> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Poste Amarrage Type Batiment Principal</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoPosteAmarrageTypeBatimentPrincipal get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoPosteAmarrageTypeBatimentPrincipal result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Poste Amarrage Type Batiment Principal</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoPosteAmarrageTypeBatimentPrincipal getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoPosteAmarrageTypeBatimentPrincipal result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Poste Amarrage Type Batiment Principal</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoPosteAmarrageTypeBatimentPrincipal get(int value) {
		switch (value) {
			case BARGE_VALUE: return BARGE;
			case BRKBLK_VALUE: return BRKBLK;
			case CONTNR_VALUE: return CONTNR;
			case RORO_VALUE: return RORO;
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
	private TypeDictionaryDicoPosteAmarrageTypeBatimentPrincipal(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoPosteAmarrageTypeBatimentPrincipal
