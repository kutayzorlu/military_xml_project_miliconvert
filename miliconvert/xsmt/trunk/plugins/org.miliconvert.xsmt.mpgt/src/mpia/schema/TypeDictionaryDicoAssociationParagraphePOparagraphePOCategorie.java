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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Association Paragraphe POparagraphe PO Categorie</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoAssociationParagraphePOparagraphePOCategorie()
 * @model extendedMetaData="name='type_Dictionary_Dico_AssociationParagraphePOparagraphePOCategorie'"
 * @generated
 */
public enum TypeDictionaryDicoAssociationParagraphePOparagraphePOCategorie implements Enumerator {
	/**
	 * The '<em><b>ISDISS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISDISS_VALUE
	 * @generated
	 * @ordered
	 */
	ISDISS(0, "ISDISS", "ISDISS"),

	/**
	 * The '<em><b>ISPRNT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISPRNT_VALUE
	 * @generated
	 * @ordered
	 */
	ISPRNT(1, "ISPRNT", "ISPRNT"),

	/**
	 * The '<em><b>ISREPL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISREPL_VALUE
	 * @generated
	 * @ordered
	 */
	ISREPL(2, "ISREPL", "ISREPL");

	/**
	 * The '<em><b>ISDISS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ISDISS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ISDISS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ISDISS_VALUE = 0;

	/**
	 * The '<em><b>ISPRNT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ISPRNT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ISPRNT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ISPRNT_VALUE = 1;

	/**
	 * The '<em><b>ISREPL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ISREPL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ISREPL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ISREPL_VALUE = 2;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Association Paragraphe POparagraphe PO Categorie</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoAssociationParagraphePOparagraphePOCategorie[] VALUES_ARRAY =
		new TypeDictionaryDicoAssociationParagraphePOparagraphePOCategorie[] {
			ISDISS,
			ISPRNT,
			ISREPL,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Association Paragraphe POparagraphe PO Categorie</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoAssociationParagraphePOparagraphePOCategorie> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Association Paragraphe POparagraphe PO Categorie</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoAssociationParagraphePOparagraphePOCategorie get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoAssociationParagraphePOparagraphePOCategorie result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Association Paragraphe POparagraphe PO Categorie</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoAssociationParagraphePOparagraphePOCategorie getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoAssociationParagraphePOparagraphePOCategorie result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Association Paragraphe POparagraphe PO Categorie</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoAssociationParagraphePOparagraphePOCategorie get(int value) {
		switch (value) {
			case ISDISS_VALUE: return ISDISS;
			case ISPRNT_VALUE: return ISPRNT;
			case ISREPL_VALUE: return ISREPL;
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
	private TypeDictionaryDicoAssociationParagraphePOparagraphePOCategorie(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoAssociationParagraphePOparagraphePOCategorie
