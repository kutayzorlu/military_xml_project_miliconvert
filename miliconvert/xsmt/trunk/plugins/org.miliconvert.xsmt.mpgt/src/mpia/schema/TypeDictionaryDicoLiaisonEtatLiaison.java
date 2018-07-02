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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Liaison Etat Liaison</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoLiaisonEtatLiaison()
 * @model extendedMetaData="name='type_Dictionary_Dico_LiaisonEtatLiaison'"
 * @generated
 */
public enum TypeDictionaryDicoLiaisonEtatLiaison implements Enumerator {
	/**
	 * The '<em><b>ACT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACT_VALUE
	 * @generated
	 * @ordered
	 */
	ACT(0, "ACT", "ACT"),

	/**
	 * The '<em><b>PND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PND_VALUE
	 * @generated
	 * @ordered
	 */
	PND(1, "PND", "PND"),

	/**
	 * The '<em><b>IMP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMP_VALUE
	 * @generated
	 * @ordered
	 */
	IMP(2, "IMP", "IMP"),

	/**
	 * The '<em><b>RES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RES_VALUE
	 * @generated
	 * @ordered
	 */
	RES(3, "RES", "RES"),

	/**
	 * The '<em><b>ANTC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANTC_VALUE
	 * @generated
	 * @ordered
	 */
	ANTC(4, "ANTC", "ANTC");

	/**
	 * The '<em><b>ACT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ACT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACT_VALUE = 0;

	/**
	 * The '<em><b>PND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PND_VALUE = 1;

	/**
	 * The '<em><b>IMP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IMP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IMP_VALUE = 2;

	/**
	 * The '<em><b>RES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RES_VALUE = 3;

	/**
	 * The '<em><b>ANTC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ANTC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANTC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANTC_VALUE = 4;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Liaison Etat Liaison</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoLiaisonEtatLiaison[] VALUES_ARRAY =
		new TypeDictionaryDicoLiaisonEtatLiaison[] {
			ACT,
			PND,
			IMP,
			RES,
			ANTC,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Liaison Etat Liaison</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoLiaisonEtatLiaison> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Liaison Etat Liaison</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoLiaisonEtatLiaison get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoLiaisonEtatLiaison result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Liaison Etat Liaison</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoLiaisonEtatLiaison getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoLiaisonEtatLiaison result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Liaison Etat Liaison</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoLiaisonEtatLiaison get(int value) {
		switch (value) {
			case ACT_VALUE: return ACT;
			case PND_VALUE: return PND;
			case IMP_VALUE: return IMP;
			case RES_VALUE: return RES;
			case ANTC_VALUE: return ANTC;
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
	private TypeDictionaryDicoLiaisonEtatLiaison(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoLiaisonEtatLiaison
