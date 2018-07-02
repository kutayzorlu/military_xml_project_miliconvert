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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Association Elt Ctrl Elt Topo Categorie</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoAssociationEltCtrlEltTopoCategorie()
 * @model extendedMetaData="name='type_Dictionary_Dico_AssociationEltCtrlEltTopoCategorie'"
 * @generated
 */
public enum TypeDictionaryDicoAssociationEltCtrlEltTopoCategorie implements Enumerator {
	/**
	 * The '<em><b>NOS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOS_VALUE
	 * @generated
	 * @ordered
	 */
	NOS(0, "NOS", "NOS"),

	/**
	 * The '<em><b>ISPPRA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISPPRA_VALUE
	 * @generated
	 * @ordered
	 */
	ISPPRA(1, "ISPPRA", "ISPPRA"),

	/**
	 * The '<em><b>ISPPRP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISPPRP_VALUE
	 * @generated
	 * @ordered
	 */
	ISPPRP(2, "ISPPRP", "ISPPRP"),

	/**
	 * The '<em><b>ISPREA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISPREA_VALUE
	 * @generated
	 * @ordered
	 */
	ISPREA(3, "ISPREA", "ISPREA"),

	/**
	 * The '<em><b>ISPREP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISPREP_VALUE
	 * @generated
	 * @ordered
	 */
	ISPREP(4, "ISPREP", "ISPREP");

	/**
	 * The '<em><b>NOS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOS_VALUE = 0;

	/**
	 * The '<em><b>ISPPRA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ISPPRA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ISPPRA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ISPPRA_VALUE = 1;

	/**
	 * The '<em><b>ISPPRP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ISPPRP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ISPPRP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ISPPRP_VALUE = 2;

	/**
	 * The '<em><b>ISPREA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ISPREA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ISPREA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ISPREA_VALUE = 3;

	/**
	 * The '<em><b>ISPREP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ISPREP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ISPREP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ISPREP_VALUE = 4;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Association Elt Ctrl Elt Topo Categorie</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoAssociationEltCtrlEltTopoCategorie[] VALUES_ARRAY =
		new TypeDictionaryDicoAssociationEltCtrlEltTopoCategorie[] {
			NOS,
			ISPPRA,
			ISPPRP,
			ISPREA,
			ISPREP,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Association Elt Ctrl Elt Topo Categorie</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoAssociationEltCtrlEltTopoCategorie> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Association Elt Ctrl Elt Topo Categorie</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoAssociationEltCtrlEltTopoCategorie get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoAssociationEltCtrlEltTopoCategorie result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Association Elt Ctrl Elt Topo Categorie</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoAssociationEltCtrlEltTopoCategorie getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoAssociationEltCtrlEltTopoCategorie result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Association Elt Ctrl Elt Topo Categorie</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoAssociationEltCtrlEltTopoCategorie get(int value) {
		switch (value) {
			case NOS_VALUE: return NOS;
			case ISPPRA_VALUE: return ISPPRA;
			case ISPPRP_VALUE: return ISPPRP;
			case ISPREA_VALUE: return ISPREA;
			case ISPREP_VALUE: return ISPREP;
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
	private TypeDictionaryDicoAssociationEltCtrlEltTopoCategorie(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoAssociationEltCtrlEltTopoCategorie
