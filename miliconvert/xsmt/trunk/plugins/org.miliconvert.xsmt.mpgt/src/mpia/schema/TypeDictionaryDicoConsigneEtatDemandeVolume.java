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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Consigne Etat Demande Volume</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoConsigneEtatDemandeVolume()
 * @model extendedMetaData="name='type_Dictionary_Dico_ConsigneEtatDemandeVolume'"
 * @generated
 */
public enum TypeDictionaryDicoConsigneEtatDemandeVolume implements Enumerator {
	/**
	 * The '<em><b>REQUEST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	REQUEST(0, "REQUEST", "REQUEST"),

	/**
	 * The '<em><b>CONFIRME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFIRME_VALUE
	 * @generated
	 * @ordered
	 */
	CONFIRME(1, "CONFIRME", "CONFIRME"),

	/**
	 * The '<em><b>RQSTINSTR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RQSTINSTR_VALUE
	 * @generated
	 * @ordered
	 */
	RQSTINSTR(2, "RQSTINSTR", "RQSTINSTR"),

	/**
	 * The '<em><b>CONFINSTR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFINSTR_VALUE
	 * @generated
	 * @ordered
	 */
	CONFINSTR(3, "CONFINSTR", "CONFINSTR");

	/**
	 * The '<em><b>REQUEST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REQUEST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REQUEST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST_VALUE = 0;

	/**
	 * The '<em><b>CONFIRME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONFIRME</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONFIRME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONFIRME_VALUE = 1;

	/**
	 * The '<em><b>RQSTINSTR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RQSTINSTR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RQSTINSTR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RQSTINSTR_VALUE = 2;

	/**
	 * The '<em><b>CONFINSTR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONFINSTR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONFINSTR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONFINSTR_VALUE = 3;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Consigne Etat Demande Volume</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoConsigneEtatDemandeVolume[] VALUES_ARRAY =
		new TypeDictionaryDicoConsigneEtatDemandeVolume[] {
			REQUEST,
			CONFIRME,
			RQSTINSTR,
			CONFINSTR,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Consigne Etat Demande Volume</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoConsigneEtatDemandeVolume> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Consigne Etat Demande Volume</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoConsigneEtatDemandeVolume get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoConsigneEtatDemandeVolume result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Consigne Etat Demande Volume</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoConsigneEtatDemandeVolume getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoConsigneEtatDemandeVolume result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Consigne Etat Demande Volume</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoConsigneEtatDemandeVolume get(int value) {
		switch (value) {
			case REQUEST_VALUE: return REQUEST;
			case CONFIRME_VALUE: return CONFIRME;
			case RQSTINSTR_VALUE: return RQSTINSTR;
			case CONFINSTR_VALUE: return CONFINSTR;
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
	private TypeDictionaryDicoConsigneEtatDemandeVolume(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoConsigneEtatDemandeVolume
