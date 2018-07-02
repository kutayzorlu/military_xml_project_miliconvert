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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Association Mission Genie Mission Genie Categorie</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoAssociationMissionGenieMissionGenieCategorie()
 * @model extendedMetaData="name='type_Dictionary_Dico_AssociationMissionGenieMissionGenieCategorie'"
 * @generated
 */
public enum TypeDictionaryDicoAssociationMissionGenieMissionGenieCategorie implements Enumerator {
	/**
	 * The '<em><b>ADDITTO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADDITTO_VALUE
	 * @generated
	 * @ordered
	 */
	ADDITTO(0, "ADDITTO", "ADDITTO"),

	/**
	 * The '<em><b>PREVIOU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREVIOU_VALUE
	 * @generated
	 * @ordered
	 */
	PREVIOU(1, "PREVIOU", "PREVIOU"),

	/**
	 * The '<em><b>PRELIMINAIR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRELIMINAIR_VALUE
	 * @generated
	 * @ordered
	 */
	PRELIMINAIR(2, "PRELIMINAIR", "PRELIMINAIR");

	/**
	 * The '<em><b>ADDITTO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ADDITTO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADDITTO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ADDITTO_VALUE = 0;

	/**
	 * The '<em><b>PREVIOU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PREVIOU</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PREVIOU
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PREVIOU_VALUE = 1;

	/**
	 * The '<em><b>PRELIMINAIR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PRELIMINAIR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRELIMINAIR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRELIMINAIR_VALUE = 2;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Association Mission Genie Mission Genie Categorie</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoAssociationMissionGenieMissionGenieCategorie[] VALUES_ARRAY =
		new TypeDictionaryDicoAssociationMissionGenieMissionGenieCategorie[] {
			ADDITTO,
			PREVIOU,
			PRELIMINAIR,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Association Mission Genie Mission Genie Categorie</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoAssociationMissionGenieMissionGenieCategorie> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Association Mission Genie Mission Genie Categorie</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoAssociationMissionGenieMissionGenieCategorie get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoAssociationMissionGenieMissionGenieCategorie result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Association Mission Genie Mission Genie Categorie</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoAssociationMissionGenieMissionGenieCategorie getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoAssociationMissionGenieMissionGenieCategorie result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Association Mission Genie Mission Genie Categorie</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoAssociationMissionGenieMissionGenieCategorie get(int value) {
		switch (value) {
			case ADDITTO_VALUE: return ADDITTO;
			case PREVIOU_VALUE: return PREVIOU;
			case PRELIMINAIR_VALUE: return PRELIMINAIR;
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
	private TypeDictionaryDicoAssociationMissionGenieMissionGenieCategorie(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoAssociationMissionGenieMissionGenieCategorie
