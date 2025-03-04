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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Constat Terrain Type Obstacle</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoConstatTerrainTypeObstacle()
 * @model extendedMetaData="name='type_Dictionary_Dico_ConstatTerrainTypeObstacle'"
 * @generated
 */
public enum TypeDictionaryDicoConstatTerrainTypeObstacle implements Enumerator {
	/**
	 * The '<em><b>FRIEND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRIEND_VALUE
	 * @generated
	 * @ordered
	 */
	FRIEND(0, "FRIEND", "FRIEND"),

	/**
	 * The '<em><b>ENY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENY_VALUE
	 * @generated
	 * @ordered
	 */
	ENY(1, "ENY", "ENY"),

	/**
	 * The '<em><b>NATUREL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NATUREL_VALUE
	 * @generated
	 * @ordered
	 */
	NATUREL(2, "NATUREL", "NATUREL");

	/**
	 * The '<em><b>FRIEND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FRIEND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FRIEND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FRIEND_VALUE = 0;

	/**
	 * The '<em><b>ENY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ENY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ENY_VALUE = 1;

	/**
	 * The '<em><b>NATUREL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NATUREL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NATUREL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NATUREL_VALUE = 2;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Constat Terrain Type Obstacle</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoConstatTerrainTypeObstacle[] VALUES_ARRAY =
		new TypeDictionaryDicoConstatTerrainTypeObstacle[] {
			FRIEND,
			ENY,
			NATUREL,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Constat Terrain Type Obstacle</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoConstatTerrainTypeObstacle> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Constat Terrain Type Obstacle</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoConstatTerrainTypeObstacle get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoConstatTerrainTypeObstacle result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Constat Terrain Type Obstacle</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoConstatTerrainTypeObstacle getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoConstatTerrainTypeObstacle result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Constat Terrain Type Obstacle</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoConstatTerrainTypeObstacle get(int value) {
		switch (value) {
			case FRIEND_VALUE: return FRIEND;
			case ENY_VALUE: return ENY;
			case NATUREL_VALUE: return NATUREL;
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
	private TypeDictionaryDicoConstatTerrainTypeObstacle(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoConstatTerrainTypeObstacle
