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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Indicateur Geostatistique Type Graphique</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoIndicateurGeostatistiqueTypeGraphique()
 * @model extendedMetaData="name='type_Dictionary_Dico_IndicateurGeostatistiqueTypeGraphique'"
 * @generated
 */
public enum TypeDictionaryDicoIndicateurGeostatistiqueTypeGraphique implements Enumerator {
	/**
	 * The '<em><b>TABLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TABLE_VALUE
	 * @generated
	 * @ordered
	 */
	TABLE(0, "TABLE", "TABLE"),

	/**
	 * The '<em><b>PIECH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIECH_VALUE
	 * @generated
	 * @ordered
	 */
	PIECH(1, "PIECH", "PIECH"),

	/**
	 * The '<em><b>HIST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIST_VALUE
	 * @generated
	 * @ordered
	 */
	HIST(2, "HIST", "HIST"),

	/**
	 * The '<em><b>HIST100</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIST100_VALUE
	 * @generated
	 * @ordered
	 */
	HIST100(3, "HIST100", "HIST-100"),

	/**
	 * The '<em><b>HIST3D</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIST3D_VALUE
	 * @generated
	 * @ordered
	 */
	HIST3D(4, "HIST3D", "HIST-3D"),

	/**
	 * The '<em><b>HIST3D100</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIST3D100_VALUE
	 * @generated
	 * @ordered
	 */
	HIST3D100(5, "HIST3D100", "HIST-3D-100");

	/**
	 * The '<em><b>TABLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TABLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TABLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TABLE_VALUE = 0;

	/**
	 * The '<em><b>PIECH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIECH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIECH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PIECH_VALUE = 1;

	/**
	 * The '<em><b>HIST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HIST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HIST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HIST_VALUE = 2;

	/**
	 * The '<em><b>HIST100</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HIST100</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HIST100
	 * @model literal="HIST-100"
	 * @generated
	 * @ordered
	 */
	public static final int HIST100_VALUE = 3;

	/**
	 * The '<em><b>HIST3D</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HIST3D</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HIST3D
	 * @model literal="HIST-3D"
	 * @generated
	 * @ordered
	 */
	public static final int HIST3D_VALUE = 4;

	/**
	 * The '<em><b>HIST3D100</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HIST3D100</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HIST3D100
	 * @model literal="HIST-3D-100"
	 * @generated
	 * @ordered
	 */
	public static final int HIST3D100_VALUE = 5;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Indicateur Geostatistique Type Graphique</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoIndicateurGeostatistiqueTypeGraphique[] VALUES_ARRAY =
		new TypeDictionaryDicoIndicateurGeostatistiqueTypeGraphique[] {
			TABLE,
			PIECH,
			HIST,
			HIST100,
			HIST3D,
			HIST3D100,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Indicateur Geostatistique Type Graphique</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoIndicateurGeostatistiqueTypeGraphique> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Indicateur Geostatistique Type Graphique</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoIndicateurGeostatistiqueTypeGraphique get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoIndicateurGeostatistiqueTypeGraphique result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Indicateur Geostatistique Type Graphique</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoIndicateurGeostatistiqueTypeGraphique getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoIndicateurGeostatistiqueTypeGraphique result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Indicateur Geostatistique Type Graphique</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoIndicateurGeostatistiqueTypeGraphique get(int value) {
		switch (value) {
			case TABLE_VALUE: return TABLE;
			case PIECH_VALUE: return PIECH;
			case HIST_VALUE: return HIST;
			case HIST100_VALUE: return HIST100;
			case HIST3D_VALUE: return HIST3D;
			case HIST3D100_VALUE: return HIST3D100;
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
	private TypeDictionaryDicoIndicateurGeostatistiqueTypeGraphique(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoIndicateurGeostatistiqueTypeGraphique
