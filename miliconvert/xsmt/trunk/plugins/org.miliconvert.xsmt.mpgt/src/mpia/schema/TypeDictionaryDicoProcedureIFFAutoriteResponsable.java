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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Procedure IFF Autorite Responsable</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoProcedureIFFAutoriteResponsable()
 * @model extendedMetaData="name='type_Dictionary_Dico_ProcedureIFFAutoriteResponsable'"
 * @generated
 */
public enum TypeDictionaryDicoProcedureIFFAutoriteResponsable implements Enumerator {
	/**
	 * The '<em><b>CAME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAME_VALUE
	 * @generated
	 * @ordered
	 */
	CAME(0, "CAME", "CAME"),

	/**
	 * The '<em><b>ADDESK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADDESK_VALUE
	 * @generated
	 * @ordered
	 */
	ADDESK(1, "ADDESK", "ADDESK"),

	/**
	 * The '<em><b>ADEDIV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADEDIV_VALUE
	 * @generated
	 * @ordered
	 */
	ADEDIV(2, "ADEDIV", "ADEDIV"),

	/**
	 * The '<em><b>DAME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAME_VALUE
	 * @generated
	 * @ordered
	 */
	DAME(3, "DAME", "DAME"),

	/**
	 * The '<em><b>ADBTLHQ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADBTLHQ_VALUE
	 * @generated
	 * @ordered
	 */
	ADBTLHQ(4, "ADBTLHQ", "ADBTLHQ");

	/**
	 * The '<em><b>CAME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CAME</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CAME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CAME_VALUE = 0;

	/**
	 * The '<em><b>ADDESK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ADDESK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADDESK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ADDESK_VALUE = 1;

	/**
	 * The '<em><b>ADEDIV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ADEDIV</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADEDIV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ADEDIV_VALUE = 2;

	/**
	 * The '<em><b>DAME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DAME</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DAME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DAME_VALUE = 3;

	/**
	 * The '<em><b>ADBTLHQ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ADBTLHQ</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADBTLHQ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ADBTLHQ_VALUE = 4;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Procedure IFF Autorite Responsable</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoProcedureIFFAutoriteResponsable[] VALUES_ARRAY =
		new TypeDictionaryDicoProcedureIFFAutoriteResponsable[] {
			CAME,
			ADDESK,
			ADEDIV,
			DAME,
			ADBTLHQ,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Procedure IFF Autorite Responsable</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoProcedureIFFAutoriteResponsable> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Procedure IFF Autorite Responsable</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoProcedureIFFAutoriteResponsable get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoProcedureIFFAutoriteResponsable result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Procedure IFF Autorite Responsable</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoProcedureIFFAutoriteResponsable getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoProcedureIFFAutoriteResponsable result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Procedure IFF Autorite Responsable</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoProcedureIFFAutoriteResponsable get(int value) {
		switch (value) {
			case CAME_VALUE: return CAME;
			case ADDESK_VALUE: return ADDESK;
			case ADEDIV_VALUE: return ADEDIV;
			case DAME_VALUE: return DAME;
			case ADBTLHQ_VALUE: return ADBTLHQ;
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
	private TypeDictionaryDicoProcedureIFFAutoriteResponsable(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoProcedureIFFAutoriteResponsable
