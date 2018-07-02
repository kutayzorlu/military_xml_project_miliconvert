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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Environnement Terrain Et Vegetation Description Vegetation</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoEnvironnementTerrainEtVegetationDescriptionVegetation()
 * @model extendedMetaData="name='type_Dictionary_Dico_EnvironnementTerrainEtVegetationDescriptionVegetation'"
 * @generated
 */
public enum TypeDictionaryDicoEnvironnementTerrainEtVegetationDescriptionVegetation implements Enumerator {
	/**
	 * The '<em><b>BARE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BARE_VALUE
	 * @generated
	 * @ordered
	 */
	BARE(0, "BARE", "BARE"),

	/**
	 * The '<em><b>SCRUBS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCRUBS_VALUE
	 * @generated
	 * @ordered
	 */
	SCRUBS(1, "SCRUBS", "SCRUBS"),

	/**
	 * The '<em><b>WOODS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WOODS_VALUE
	 * @generated
	 * @ordered
	 */
	WOODS(2, "WOODS", "WOODS"),

	/**
	 * The '<em><b>URBAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #URBAN_VALUE
	 * @generated
	 * @ordered
	 */
	URBAN(3, "URBAN", "URBAN"),

	/**
	 * The '<em><b>NKN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NKN_VALUE
	 * @generated
	 * @ordered
	 */
	NKN(4, "NKN", "NKN");

	/**
	 * The '<em><b>BARE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BARE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BARE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BARE_VALUE = 0;

	/**
	 * The '<em><b>SCRUBS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SCRUBS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCRUBS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SCRUBS_VALUE = 1;

	/**
	 * The '<em><b>WOODS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WOODS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WOODS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WOODS_VALUE = 2;

	/**
	 * The '<em><b>URBAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>URBAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #URBAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int URBAN_VALUE = 3;

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
	 * An array of all the '<em><b>Type Dictionary Dico Environnement Terrain Et Vegetation Description Vegetation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoEnvironnementTerrainEtVegetationDescriptionVegetation[] VALUES_ARRAY =
		new TypeDictionaryDicoEnvironnementTerrainEtVegetationDescriptionVegetation[] {
			BARE,
			SCRUBS,
			WOODS,
			URBAN,
			NKN,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Environnement Terrain Et Vegetation Description Vegetation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoEnvironnementTerrainEtVegetationDescriptionVegetation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Environnement Terrain Et Vegetation Description Vegetation</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoEnvironnementTerrainEtVegetationDescriptionVegetation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoEnvironnementTerrainEtVegetationDescriptionVegetation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Environnement Terrain Et Vegetation Description Vegetation</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoEnvironnementTerrainEtVegetationDescriptionVegetation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoEnvironnementTerrainEtVegetationDescriptionVegetation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Environnement Terrain Et Vegetation Description Vegetation</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoEnvironnementTerrainEtVegetationDescriptionVegetation get(int value) {
		switch (value) {
			case BARE_VALUE: return BARE;
			case SCRUBS_VALUE: return SCRUBS;
			case WOODS_VALUE: return WOODS;
			case URBAN_VALUE: return URBAN;
			case NKN_VALUE: return NKN;
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
	private TypeDictionaryDicoEnvironnementTerrainEtVegetationDescriptionVegetation(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoEnvironnementTerrainEtVegetationDescriptionVegetation
