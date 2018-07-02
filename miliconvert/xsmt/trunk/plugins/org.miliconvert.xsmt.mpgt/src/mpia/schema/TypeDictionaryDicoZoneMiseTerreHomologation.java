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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Zone Mise Terre Homologation</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoZoneMiseTerreHomologation()
 * @model extendedMetaData="name='type_Dictionary_Dico_ZoneMiseTerreHomologation'"
 * @generated
 */
public enum TypeDictionaryDicoZoneMiseTerreHomologation implements Enumerator {
	/**
	 * The '<em><b>EMG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMG_VALUE
	 * @generated
	 * @ordered
	 */
	EMG(0, "EMG", "EMG"),

	/**
	 * The '<em><b>CNSTNT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CNSTNT_VALUE
	 * @generated
	 * @ordered
	 */
	CNSTNT(1, "CNSTNT", "CNSTNT"),

	/**
	 * The '<em><b>OCCSNL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCCSNL_VALUE
	 * @generated
	 * @ordered
	 */
	OCCSNL(2, "OCCSNL", "OCCSNL"),

	/**
	 * The '<em><b>TMPRR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TMPRR_VALUE
	 * @generated
	 * @ordered
	 */
	TMPRR(3, "TMPRR", "TMPRR");

	/**
	 * The '<em><b>EMG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EMG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EMG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EMG_VALUE = 0;

	/**
	 * The '<em><b>CNSTNT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CNSTNT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CNSTNT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CNSTNT_VALUE = 1;

	/**
	 * The '<em><b>OCCSNL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OCCSNL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OCCSNL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OCCSNL_VALUE = 2;

	/**
	 * The '<em><b>TMPRR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TMPRR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TMPRR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TMPRR_VALUE = 3;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Zone Mise Terre Homologation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoZoneMiseTerreHomologation[] VALUES_ARRAY =
		new TypeDictionaryDicoZoneMiseTerreHomologation[] {
			EMG,
			CNSTNT,
			OCCSNL,
			TMPRR,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Zone Mise Terre Homologation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoZoneMiseTerreHomologation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Zone Mise Terre Homologation</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoZoneMiseTerreHomologation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoZoneMiseTerreHomologation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Zone Mise Terre Homologation</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoZoneMiseTerreHomologation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoZoneMiseTerreHomologation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Zone Mise Terre Homologation</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoZoneMiseTerreHomologation get(int value) {
		switch (value) {
			case EMG_VALUE: return EMG;
			case CNSTNT_VALUE: return CNSTNT;
			case OCCSNL_VALUE: return OCCSNL;
			case TMPRR_VALUE: return TMPRR;
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
	private TypeDictionaryDicoZoneMiseTerreHomologation(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoZoneMiseTerreHomologation
