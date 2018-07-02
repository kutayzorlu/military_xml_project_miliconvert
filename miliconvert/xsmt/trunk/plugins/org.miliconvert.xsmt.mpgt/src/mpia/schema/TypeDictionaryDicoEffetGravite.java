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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Effet Gravite</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoEffetGravite()
 * @model extendedMetaData="name='type_Dictionary_Dico_EffetGravite'"
 * @generated
 */
public enum TypeDictionaryDicoEffetGravite implements Enumerator {
	/**
	 * The '<em><b>NODSRP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NODSRP_VALUE
	 * @generated
	 * @ordered
	 */
	NODSRP(0, "NODSRP", "NODSRP"),

	/**
	 * The '<em><b>MINDSR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINDSR_VALUE
	 * @generated
	 * @ordered
	 */
	MINDSR(1, "MINDSR", "MINDSR"),

	/**
	 * The '<em><b>SEVDSR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEVDSR_VALUE
	 * @generated
	 * @ordered
	 */
	SEVDSR(2, "SEVDSR", "SEVDSR"),

	/**
	 * The '<em><b>TOTDSR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOTDSR_VALUE
	 * @generated
	 * @ordered
	 */
	TOTDSR(3, "TOTDSR", "TOTDSR"),

	/**
	 * The '<em><b>NKN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NKN_VALUE
	 * @generated
	 * @ordered
	 */
	NKN(4, "NKN", "NKN");

	/**
	 * The '<em><b>NODSRP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NODSRP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NODSRP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NODSRP_VALUE = 0;

	/**
	 * The '<em><b>MINDSR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MINDSR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MINDSR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MINDSR_VALUE = 1;

	/**
	 * The '<em><b>SEVDSR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SEVDSR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEVDSR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SEVDSR_VALUE = 2;

	/**
	 * The '<em><b>TOTDSR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TOTDSR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOTDSR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TOTDSR_VALUE = 3;

	/**
	 * The '<em><b>NKN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NKN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NKN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NKN_VALUE = 4;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Effet Gravite</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoEffetGravite[] VALUES_ARRAY =
		new TypeDictionaryDicoEffetGravite[] {
			NODSRP,
			MINDSR,
			SEVDSR,
			TOTDSR,
			NKN,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Effet Gravite</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoEffetGravite> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Effet Gravite</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoEffetGravite get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoEffetGravite result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Effet Gravite</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoEffetGravite getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoEffetGravite result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Effet Gravite</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoEffetGravite get(int value) {
		switch (value) {
			case NODSRP_VALUE: return NODSRP;
			case MINDSR_VALUE: return MINDSR;
			case SEVDSR_VALUE: return SEVDSR;
			case TOTDSR_VALUE: return TOTDSR;
			case NKN_VALUE: return NKN;
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
	private TypeDictionaryDicoEffetGravite(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoEffetGravite
