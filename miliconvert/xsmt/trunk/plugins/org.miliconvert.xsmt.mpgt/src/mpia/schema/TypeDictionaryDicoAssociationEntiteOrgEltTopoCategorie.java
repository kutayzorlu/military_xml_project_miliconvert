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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Association Entite Org Elt Topo Categorie</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoAssociationEntiteOrgEltTopoCategorie()
 * @model extendedMetaData="name='type_Dictionary_Dico_AssociationEntiteOrgEltTopoCategorie'"
 * @generated
 */
public enum TypeDictionaryDicoAssociationEntiteOrgEltTopoCategorie implements Enumerator {
	/**
	 * The '<em><b>CONTRL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTRL_VALUE
	 * @generated
	 * @ordered
	 */
	CONTRL(0, "CONTRL", "CONTRL"),

	/**
	 * The '<em><b>ISCPTR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISCPTR_VALUE
	 * @generated
	 * @ordered
	 */
	ISCPTR(1, "ISCPTR", "ISCPTR"),

	/**
	 * The '<em><b>ISSITU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISSITU_VALUE
	 * @generated
	 * @ordered
	 */
	ISSITU(2, "ISSITU", "ISSITU"),

	/**
	 * The '<em><b>OBSRVS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBSRVS_VALUE
	 * @generated
	 * @ordered
	 */
	OBSRVS(3, "OBSRVS", "OBSRVS"),

	/**
	 * The '<em><b>THELOC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THELOC_VALUE
	 * @generated
	 * @ordered
	 */
	THELOC(4, "THELOC", "THELOC");

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
	public static final int CONTRL_VALUE = 0;

	/**
	 * The '<em><b>ISCPTR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ISCPTR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ISCPTR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ISCPTR_VALUE = 1;

	/**
	 * The '<em><b>ISSITU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ISSITU</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ISSITU
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ISSITU_VALUE = 2;

	/**
	 * The '<em><b>OBSRVS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OBSRVS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OBSRVS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OBSRVS_VALUE = 3;

	/**
	 * The '<em><b>THELOC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>THELOC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #THELOC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int THELOC_VALUE = 4;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Association Entite Org Elt Topo Categorie</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoAssociationEntiteOrgEltTopoCategorie[] VALUES_ARRAY =
		new TypeDictionaryDicoAssociationEntiteOrgEltTopoCategorie[] {
			CONTRL,
			ISCPTR,
			ISSITU,
			OBSRVS,
			THELOC,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Association Entite Org Elt Topo Categorie</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoAssociationEntiteOrgEltTopoCategorie> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Association Entite Org Elt Topo Categorie</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoAssociationEntiteOrgEltTopoCategorie get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoAssociationEntiteOrgEltTopoCategorie result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Association Entite Org Elt Topo Categorie</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoAssociationEntiteOrgEltTopoCategorie getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoAssociationEntiteOrgEltTopoCategorie result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Association Entite Org Elt Topo Categorie</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoAssociationEntiteOrgEltTopoCategorie get(int value) {
		switch (value) {
			case CONTRL_VALUE: return CONTRL;
			case ISCPTR_VALUE: return ISCPTR;
			case ISSITU_VALUE: return ISSITU;
			case OBSRVS_VALUE: return OBSRVS;
			case THELOC_VALUE: return THELOC;
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
	private TypeDictionaryDicoAssociationEntiteOrgEltTopoCategorie(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoAssociationEntiteOrgEltTopoCategorie
