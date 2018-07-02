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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Mission Appui Aerien Type Copie</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoMissionAppuiAerienTypeCopie()
 * @model extendedMetaData="name='type_Dictionary_Dico_MissionAppuiAerienTypeCopie'"
 * @generated
 */
public enum TypeDictionaryDicoMissionAppuiAerienTypeCopie implements Enumerator {
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
	 * The '<em><b>PRINT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRINT_VALUE
	 * @generated
	 * @ordered
	 */
	PRINT(1, "PRINT", "PRINT"),

	/**
	 * The '<em><b>TAPENTSC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TAPENTSC_VALUE
	 * @generated
	 * @ordered
	 */
	TAPENTSC(2, "TAPENTSC", "TAPE-NTSC"),

	/**
	 * The '<em><b>TAPEPAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TAPEPAL_VALUE
	 * @generated
	 * @ordered
	 */
	TAPEPAL(3, "TAPEPAL", "TAPE-PAL"),

	/**
	 * The '<em><b>TAPESECAM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TAPESECAM_VALUE
	 * @generated
	 * @ordered
	 */
	TAPESECAM(4, "TAPESECAM", "TAPE-SECAM");

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
	 * The '<em><b>PRINT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PRINT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRINT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRINT_VALUE = 1;

	/**
	 * The '<em><b>TAPENTSC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TAPENTSC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TAPENTSC
	 * @model literal="TAPE-NTSC"
	 * @generated
	 * @ordered
	 */
	public static final int TAPENTSC_VALUE = 2;

	/**
	 * The '<em><b>TAPEPAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TAPEPAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TAPEPAL
	 * @model literal="TAPE-PAL"
	 * @generated
	 * @ordered
	 */
	public static final int TAPEPAL_VALUE = 3;

	/**
	 * The '<em><b>TAPESECAM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TAPESECAM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TAPESECAM
	 * @model literal="TAPE-SECAM"
	 * @generated
	 * @ordered
	 */
	public static final int TAPESECAM_VALUE = 4;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Mission Appui Aerien Type Copie</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoMissionAppuiAerienTypeCopie[] VALUES_ARRAY =
		new TypeDictionaryDicoMissionAppuiAerienTypeCopie[] {
			NOS,
			PRINT,
			TAPENTSC,
			TAPEPAL,
			TAPESECAM,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Mission Appui Aerien Type Copie</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoMissionAppuiAerienTypeCopie> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Mission Appui Aerien Type Copie</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoMissionAppuiAerienTypeCopie get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoMissionAppuiAerienTypeCopie result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Mission Appui Aerien Type Copie</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoMissionAppuiAerienTypeCopie getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoMissionAppuiAerienTypeCopie result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Mission Appui Aerien Type Copie</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoMissionAppuiAerienTypeCopie get(int value) {
		switch (value) {
			case NOS_VALUE: return NOS;
			case PRINT_VALUE: return PRINT;
			case TAPENTSC_VALUE: return TAPENTSC;
			case TAPEPAL_VALUE: return TAPEPAL;
			case TAPESECAM_VALUE: return TAPESECAM;
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
	private TypeDictionaryDicoMissionAppuiAerienTypeCopie(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoMissionAppuiAerienTypeCopie
