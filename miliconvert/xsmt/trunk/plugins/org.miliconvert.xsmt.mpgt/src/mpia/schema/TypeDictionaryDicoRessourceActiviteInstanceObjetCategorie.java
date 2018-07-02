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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Ressource Activite Instance Objet Categorie</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoRessourceActiviteInstanceObjetCategorie()
 * @model extendedMetaData="name='type_Dictionary_Dico_RessourceActiviteInstanceObjetCategorie'"
 * @generated
 */
public enum TypeDictionaryDicoRessourceActiviteInstanceObjetCategorie implements Enumerator {
	/**
	 * The '<em><b>EXE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXE_VALUE
	 * @generated
	 * @ordered
	 */
	EXE(0, "EXE", "EXE"),

	/**
	 * The '<em><b>CONCER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONCER_VALUE
	 * @generated
	 * @ordered
	 */
	CONCER(1, "CONCER", "CONCER"),

	/**
	 * The '<em><b>GIVSUP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GIVSUP_VALUE
	 * @generated
	 * @ordered
	 */
	GIVSUP(2, "GIVSUP", "GIVSUP");

	/**
	 * The '<em><b>EXE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EXE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXE_VALUE = 0;

	/**
	 * The '<em><b>CONCER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONCER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONCER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONCER_VALUE = 1;

	/**
	 * The '<em><b>GIVSUP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GIVSUP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GIVSUP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GIVSUP_VALUE = 2;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Ressource Activite Instance Objet Categorie</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoRessourceActiviteInstanceObjetCategorie[] VALUES_ARRAY =
		new TypeDictionaryDicoRessourceActiviteInstanceObjetCategorie[] {
			EXE,
			CONCER,
			GIVSUP,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Ressource Activite Instance Objet Categorie</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoRessourceActiviteInstanceObjetCategorie> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Ressource Activite Instance Objet Categorie</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoRessourceActiviteInstanceObjetCategorie get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoRessourceActiviteInstanceObjetCategorie result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Ressource Activite Instance Objet Categorie</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoRessourceActiviteInstanceObjetCategorie getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoRessourceActiviteInstanceObjetCategorie result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Ressource Activite Instance Objet Categorie</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoRessourceActiviteInstanceObjetCategorie get(int value) {
		switch (value) {
			case EXE_VALUE: return EXE;
			case CONCER_VALUE: return CONCER;
			case GIVSUP_VALUE: return GIVSUP;
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
	private TypeDictionaryDicoRessourceActiviteInstanceObjetCategorie(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoRessourceActiviteInstanceObjetCategorie
