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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Depannage Evacuation Type Compte Rendu</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoDepannageEvacuationTypeCompteRendu()
 * @model extendedMetaData="name='type_Dictionary_Dico_DepannageEvacuationTypeCompteRendu'"
 * @generated
 */
public enum TypeDictionaryDicoDepannageEvacuationTypeCompteRendu implements Enumerator {
	/**
	 * The '<em><b>REP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REP_VALUE
	 * @generated
	 * @ordered
	 */
	REP(0, "REP", "REP"),

	/**
	 * The '<em><b>REPMDZ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPMDZ_VALUE
	 * @generated
	 * @ordered
	 */
	REPMDZ(1, "REPMDZ", "REPMDZ"),

	/**
	 * The '<em><b>NOTREP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTREP_VALUE
	 * @generated
	 * @ordered
	 */
	NOTREP(2, "NOTREP", "NOTREP"),

	/**
	 * The '<em><b>INCREP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCREP_VALUE
	 * @generated
	 * @ordered
	 */
	INCREP(3, "INCREP", "INCREP"),

	/**
	 * The '<em><b>UNABLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNABLE_VALUE
	 * @generated
	 * @ordered
	 */
	UNABLE(4, "UNABLE", "UNABLE");

	/**
	 * The '<em><b>REP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REP_VALUE = 0;

	/**
	 * The '<em><b>REPMDZ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REPMDZ</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REPMDZ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REPMDZ_VALUE = 1;

	/**
	 * The '<em><b>NOTREP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOTREP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOTREP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOTREP_VALUE = 2;

	/**
	 * The '<em><b>INCREP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INCREP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INCREP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INCREP_VALUE = 3;

	/**
	 * The '<em><b>UNABLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNABLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNABLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNABLE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Depannage Evacuation Type Compte Rendu</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoDepannageEvacuationTypeCompteRendu[] VALUES_ARRAY =
		new TypeDictionaryDicoDepannageEvacuationTypeCompteRendu[] {
			REP,
			REPMDZ,
			NOTREP,
			INCREP,
			UNABLE,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Depannage Evacuation Type Compte Rendu</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoDepannageEvacuationTypeCompteRendu> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Depannage Evacuation Type Compte Rendu</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoDepannageEvacuationTypeCompteRendu get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoDepannageEvacuationTypeCompteRendu result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Depannage Evacuation Type Compte Rendu</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoDepannageEvacuationTypeCompteRendu getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoDepannageEvacuationTypeCompteRendu result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Depannage Evacuation Type Compte Rendu</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoDepannageEvacuationTypeCompteRendu get(int value) {
		switch (value) {
			case REP_VALUE: return REP;
			case REPMDZ_VALUE: return REPMDZ;
			case NOTREP_VALUE: return NOTREP;
			case INCREP_VALUE: return INCREP;
			case UNABLE_VALUE: return UNABLE;
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
	private TypeDictionaryDicoDepannageEvacuationTypeCompteRendu(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoDepannageEvacuationTypeCompteRendu
