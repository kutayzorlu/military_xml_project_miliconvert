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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Deploiement Moyens AS Ac3d Type Deploiement</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoDeploiementMoyensASAc3dTypeDeploiement()
 * @model extendedMetaData="name='type_Dictionary_Dico_DeploiementMoyensASAc3dTypeDeploiement'"
 * @generated
 */
public enum TypeDictionaryDicoDeploiementMoyensASAc3dTypeDeploiement implements Enumerator {
	/**
	 * The '<em><b>FOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOR_VALUE
	 * @generated
	 * @ordered
	 */
	FOR(0, "FOR", "FOR"),

	/**
	 * The '<em><b>PROP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROP_VALUE
	 * @generated
	 * @ordered
	 */
	PROP(1, "PROP", "PROP"),

	/**
	 * The '<em><b>MODIF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODIF_VALUE
	 * @generated
	 * @ordered
	 */
	MODIF(2, "MODIF", "MODIF"),

	/**
	 * The '<em><b>VALID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALID_VALUE
	 * @generated
	 * @ordered
	 */
	VALID(3, "VALID", "VALID"),

	/**
	 * The '<em><b>REAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REAL_VALUE
	 * @generated
	 * @ordered
	 */
	REAL(4, "REAL", "REAL");

	/**
	 * The '<em><b>FOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FOR_VALUE = 0;

	/**
	 * The '<em><b>PROP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PROP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROP_VALUE = 1;

	/**
	 * The '<em><b>MODIF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MODIF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MODIF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MODIF_VALUE = 2;

	/**
	 * The '<em><b>VALID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VALID</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VALID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VALID_VALUE = 3;

	/**
	 * The '<em><b>REAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REAL_VALUE = 4;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Deploiement Moyens AS Ac3d Type Deploiement</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoDeploiementMoyensASAc3dTypeDeploiement[] VALUES_ARRAY =
		new TypeDictionaryDicoDeploiementMoyensASAc3dTypeDeploiement[] {
			FOR,
			PROP,
			MODIF,
			VALID,
			REAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Deploiement Moyens AS Ac3d Type Deploiement</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoDeploiementMoyensASAc3dTypeDeploiement> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Deploiement Moyens AS Ac3d Type Deploiement</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoDeploiementMoyensASAc3dTypeDeploiement get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoDeploiementMoyensASAc3dTypeDeploiement result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Deploiement Moyens AS Ac3d Type Deploiement</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoDeploiementMoyensASAc3dTypeDeploiement getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoDeploiementMoyensASAc3dTypeDeploiement result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Deploiement Moyens AS Ac3d Type Deploiement</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoDeploiementMoyensASAc3dTypeDeploiement get(int value) {
		switch (value) {
			case FOR_VALUE: return FOR;
			case PROP_VALUE: return PROP;
			case MODIF_VALUE: return MODIF;
			case VALID_VALUE: return VALID;
			case REAL_VALUE: return REAL;
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
	private TypeDictionaryDicoDeploiementMoyensASAc3dTypeDeploiement(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoDeploiementMoyensASAc3dTypeDeploiement
