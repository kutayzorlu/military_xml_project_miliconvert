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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Point Trajectoire Categorie</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoPointTrajectoireCategorie()
 * @model extendedMetaData="name='type_Dictionary_Dico_PointTrajectoireCategorie'"
 * @generated
 */
public enum TypeDictionaryDicoPointTrajectoireCategorie implements Enumerator {
	/**
	 * The '<em><b>Point De Navigation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POINT_DE_NAVIGATION_VALUE
	 * @generated
	 * @ordered
	 */
	POINT_DE_NAVIGATION(0, "PointDeNavigation", "Point de navigation"),

	/**
	 * The '<em><b>Point De Passage Ou Contournement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POINT_DE_PASSAGE_OU_CONTOURNEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	POINT_DE_PASSAGE_OU_CONTOURNEMENT(1, "PointDePassageOuContournement", "Point de passage ou contournement");

	/**
	 * The '<em><b>Point De Navigation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Point De Navigation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POINT_DE_NAVIGATION
	 * @model name="PointDeNavigation" literal="Point de navigation"
	 * @generated
	 * @ordered
	 */
	public static final int POINT_DE_NAVIGATION_VALUE = 0;

	/**
	 * The '<em><b>Point De Passage Ou Contournement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Point De Passage Ou Contournement</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POINT_DE_PASSAGE_OU_CONTOURNEMENT
	 * @model name="PointDePassageOuContournement" literal="Point de passage ou contournement"
	 * @generated
	 * @ordered
	 */
	public static final int POINT_DE_PASSAGE_OU_CONTOURNEMENT_VALUE = 1;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Point Trajectoire Categorie</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoPointTrajectoireCategorie[] VALUES_ARRAY =
		new TypeDictionaryDicoPointTrajectoireCategorie[] {
			POINT_DE_NAVIGATION,
			POINT_DE_PASSAGE_OU_CONTOURNEMENT,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Point Trajectoire Categorie</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoPointTrajectoireCategorie> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Point Trajectoire Categorie</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoPointTrajectoireCategorie get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoPointTrajectoireCategorie result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Point Trajectoire Categorie</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoPointTrajectoireCategorie getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoPointTrajectoireCategorie result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Point Trajectoire Categorie</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoPointTrajectoireCategorie get(int value) {
		switch (value) {
			case POINT_DE_NAVIGATION_VALUE: return POINT_DE_NAVIGATION;
			case POINT_DE_PASSAGE_OU_CONTOURNEMENT_VALUE: return POINT_DE_PASSAGE_OU_CONTOURNEMENT;
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
	private TypeDictionaryDicoPointTrajectoireCategorie(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoPointTrajectoireCategorie
