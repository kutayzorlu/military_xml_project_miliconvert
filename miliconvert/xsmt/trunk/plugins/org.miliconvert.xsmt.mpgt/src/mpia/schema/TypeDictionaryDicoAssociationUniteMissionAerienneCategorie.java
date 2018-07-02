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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Association Unite Mission Aerienne Categorie</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoAssociationUniteMissionAerienneCategorie()
 * @model extendedMetaData="name='type_Dictionary_Dico_AssociationUniteMissionAerienneCategorie'"
 * @generated
 */
public enum TypeDictionaryDicoAssociationUniteMissionAerienneCategorie implements Enumerator {
	/**
	 * The '<em><b>COOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COOR_VALUE
	 * @generated
	 * @ordered
	 */
	COOR(0, "COOR", "COOR"),

	/**
	 * The '<em><b>CONTRL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTRL_VALUE
	 * @generated
	 * @ordered
	 */
	CONTRL(1, "CONTRL", "CONTRL"),

	/**
	 * The '<em><b>GIVORD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GIVORD_VALUE
	 * @generated
	 * @ordered
	 */
	GIVORD(2, "GIVORD", "GIVORD"),

	/**
	 * The '<em><b>CONAUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONAUT_VALUE
	 * @generated
	 * @ordered
	 */
	CONAUT(3, "CONAUT", "CONAUT"),

	/**
	 * The '<em><b>WRITER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRITER_VALUE
	 * @generated
	 * @ordered
	 */
	WRITER(4, "WRITER", "WRITER");

	/**
	 * The '<em><b>COOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COOR_VALUE = 0;

	/**
	 * The '<em><b>CONTRL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONTRL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTRL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONTRL_VALUE = 1;

	/**
	 * The '<em><b>GIVORD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GIVORD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GIVORD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GIVORD_VALUE = 2;

	/**
	 * The '<em><b>CONAUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONAUT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONAUT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONAUT_VALUE = 3;

	/**
	 * The '<em><b>WRITER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WRITER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WRITER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WRITER_VALUE = 4;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Association Unite Mission Aerienne Categorie</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoAssociationUniteMissionAerienneCategorie[] VALUES_ARRAY =
		new TypeDictionaryDicoAssociationUniteMissionAerienneCategorie[] {
			COOR,
			CONTRL,
			GIVORD,
			CONAUT,
			WRITER,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Association Unite Mission Aerienne Categorie</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoAssociationUniteMissionAerienneCategorie> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Association Unite Mission Aerienne Categorie</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoAssociationUniteMissionAerienneCategorie get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoAssociationUniteMissionAerienneCategorie result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Association Unite Mission Aerienne Categorie</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoAssociationUniteMissionAerienneCategorie getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoAssociationUniteMissionAerienneCategorie result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Association Unite Mission Aerienne Categorie</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoAssociationUniteMissionAerienneCategorie get(int value) {
		switch (value) {
			case COOR_VALUE: return COOR;
			case CONTRL_VALUE: return CONTRL;
			case GIVORD_VALUE: return GIVORD;
			case CONAUT_VALUE: return CONAUT;
			case WRITER_VALUE: return WRITER;
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
	private TypeDictionaryDicoAssociationUniteMissionAerienneCategorie(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoAssociationUniteMissionAerienneCategorie
