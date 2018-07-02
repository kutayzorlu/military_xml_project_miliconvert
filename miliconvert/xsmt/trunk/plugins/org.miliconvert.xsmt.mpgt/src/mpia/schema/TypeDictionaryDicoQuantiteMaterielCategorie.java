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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Quantite Materiel Categorie</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoQuantiteMaterielCategorie()
 * @model extendedMetaData="name='type_Dictionary_Dico_QuantiteMaterielCategorie'"
 * @generated
 */
public enum TypeDictionaryDicoQuantiteMaterielCategorie implements Enumerator {
	/**
	 * The '<em><b>TANK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TANK_VALUE
	 * @generated
	 * @ordered
	 */
	TANK(0, "TANK", "TANK"),

	/**
	 * The '<em><b>ARMOUR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARMOUR_VALUE
	 * @generated
	 * @ordered
	 */
	ARMOUR(1, "ARMOUR", "ARMOUR"),

	/**
	 * The '<em><b>LV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LV_VALUE
	 * @generated
	 * @ordered
	 */
	LV(2, "LV", "LV"),

	/**
	 * The '<em><b>HGV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HGV_VALUE
	 * @generated
	 * @ordered
	 */
	HGV(3, "HGV", "HGV"),

	/**
	 * The '<em><b>AMMO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMMO_VALUE
	 * @generated
	 * @ordered
	 */
	AMMO(4, "AMMO", "AMMO"),

	/**
	 * The '<em><b>FUEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUEL_VALUE
	 * @generated
	 * @ordered
	 */
	FUEL(5, "FUEL", "FUEL");

	/**
	 * The '<em><b>TANK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TANK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TANK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TANK_VALUE = 0;

	/**
	 * The '<em><b>ARMOUR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ARMOUR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARMOUR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ARMOUR_VALUE = 1;

	/**
	 * The '<em><b>LV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LV</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LV_VALUE = 2;

	/**
	 * The '<em><b>HGV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HGV</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HGV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HGV_VALUE = 3;

	/**
	 * The '<em><b>AMMO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AMMO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AMMO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AMMO_VALUE = 4;

	/**
	 * The '<em><b>FUEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FUEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FUEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FUEL_VALUE = 5;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Quantite Materiel Categorie</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoQuantiteMaterielCategorie[] VALUES_ARRAY =
		new TypeDictionaryDicoQuantiteMaterielCategorie[] {
			TANK,
			ARMOUR,
			LV,
			HGV,
			AMMO,
			FUEL,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Quantite Materiel Categorie</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoQuantiteMaterielCategorie> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Quantite Materiel Categorie</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoQuantiteMaterielCategorie get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoQuantiteMaterielCategorie result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Quantite Materiel Categorie</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoQuantiteMaterielCategorie getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoQuantiteMaterielCategorie result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Quantite Materiel Categorie</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoQuantiteMaterielCategorie get(int value) {
		switch (value) {
			case TANK_VALUE: return TANK;
			case ARMOUR_VALUE: return ARMOUR;
			case LV_VALUE: return LV;
			case HGV_VALUE: return HGV;
			case AMMO_VALUE: return AMMO;
			case FUEL_VALUE: return FUEL;
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
	private TypeDictionaryDicoQuantiteMaterielCategorie(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoQuantiteMaterielCategorie
