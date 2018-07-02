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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Zone Logistique Echelon Logistique</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoZoneLogistiqueEchelonLogistique()
 * @model extendedMetaData="name='type_Dictionary_Dico_ZoneLogistiqueEchelonLogistique'"
 * @generated
 */
public enum TypeDictionaryDicoZoneLogistiqueEchelonLogistique implements Enumerator {
	/**
	 * The '<em><b>FRWD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRWD_VALUE
	 * @generated
	 * @ordered
	 */
	FRWD(0, "FRWD", "FRWD"),

	/**
	 * The '<em><b>REAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REAR_VALUE
	 * @generated
	 * @ordered
	 */
	REAR(1, "REAR", "REAR"),

	/**
	 * The '<em><b>PREMG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREMG_VALUE
	 * @generated
	 * @ordered
	 */
	PREMG(2, "PREMG", "PREMG");

	/**
	 * The '<em><b>FRWD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FRWD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FRWD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FRWD_VALUE = 0;

	/**
	 * The '<em><b>REAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REAR_VALUE = 1;

	/**
	 * The '<em><b>PREMG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PREMG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PREMG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PREMG_VALUE = 2;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Zone Logistique Echelon Logistique</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoZoneLogistiqueEchelonLogistique[] VALUES_ARRAY =
		new TypeDictionaryDicoZoneLogistiqueEchelonLogistique[] {
			FRWD,
			REAR,
			PREMG,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Zone Logistique Echelon Logistique</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoZoneLogistiqueEchelonLogistique> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Zone Logistique Echelon Logistique</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoZoneLogistiqueEchelonLogistique get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoZoneLogistiqueEchelonLogistique result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Zone Logistique Echelon Logistique</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoZoneLogistiqueEchelonLogistique getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoZoneLogistiqueEchelonLogistique result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Zone Logistique Echelon Logistique</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoZoneLogistiqueEchelonLogistique get(int value) {
		switch (value) {
			case FRWD_VALUE: return FRWD;
			case REAR_VALUE: return REAR;
			case PREMG_VALUE: return PREMG;
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
	private TypeDictionaryDicoZoneLogistiqueEchelonLogistique(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoZoneLogistiqueEchelonLogistique
