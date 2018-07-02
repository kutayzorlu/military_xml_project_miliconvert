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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Etat Action Etat Avancement</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoEtatActionEtatAvancement()
 * @model extendedMetaData="name='type_Dictionary_Dico_EtatActionEtatAvancement'"
 * @generated
 */
public enum TypeDictionaryDicoEtatActionEtatAvancement implements Enumerator {
	/**
	 * The '<em><b>ABO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABO_VALUE
	 * @generated
	 * @ordered
	 */
	ABO(0, "ABO", "ABO"),

	/**
	 * The '<em><b>CANCLD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CANCLD_VALUE
	 * @generated
	 * @ordered
	 */
	CANCLD(1, "CANCLD", "CANCLD"),

	/**
	 * The '<em><b>COM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COM_VALUE
	 * @generated
	 * @ordered
	 */
	COM(2, "COM", "COM"),

	/**
	 * The '<em><b>IPR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IPR_VALUE
	 * @generated
	 * @ordered
	 */
	IPR(3, "IPR", "IPR"),

	/**
	 * The '<em><b>NST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NST_VALUE
	 * @generated
	 * @ordered
	 */
	NST(4, "NST", "NST"),

	/**
	 * The '<em><b>PAU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAU_VALUE
	 * @generated
	 * @ordered
	 */
	PAU(5, "PAU", "PAU"),

	/**
	 * The '<em><b>NKN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NKN_VALUE
	 * @generated
	 * @ordered
	 */
	NKN(6, "NKN", "NKN"),

	/**
	 * The '<em><b>AIRBRN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AIRBRN_VALUE
	 * @generated
	 * @ordered
	 */
	AIRBRN(7, "AIRBRN", "AIRBRN"),

	/**
	 * The '<em><b>DELAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELAY_VALUE
	 * @generated
	 * @ordered
	 */
	DELAY(8, "DELAY", "DELAY"),

	/**
	 * The '<em><b>PLAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLAN_VALUE
	 * @generated
	 * @ordered
	 */
	PLAN(9, "PLAN", "PLAN"),

	/**
	 * The '<em><b>RETASK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RETASK_VALUE
	 * @generated
	 * @ordered
	 */
	RETASK(10, "RETASK", "RETASK"),

	/**
	 * The '<em><b>SCRMBL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCRMBL_VALUE
	 * @generated
	 * @ordered
	 */
	SCRMBL(11, "SCRMBL", "SCRMBL"),

	/**
	 * The '<em><b>TASKED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TASKED_VALUE
	 * @generated
	 * @ordered
	 */
	TASKED(12, "TASKED", "TASKED"),

	/**
	 * The '<em><b>OFFTSK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OFFTSK_VALUE
	 * @generated
	 * @ordered
	 */
	OFFTSK(13, "OFFTSK", "OFFTSK"),

	/**
	 * The '<em><b>DWNTMW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DWNTMW_VALUE
	 * @generated
	 * @ordered
	 */
	DWNTMW(14, "DWNTMW", "DWNTMW"),

	/**
	 * The '<em><b>TRNMMW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRNMMW_VALUE
	 * @generated
	 * @ordered
	 */
	TRNMMW(15, "TRNMMW", "TRNMMW"),

	/**
	 * The '<em><b>NOOPER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOOPER_VALUE
	 * @generated
	 * @ordered
	 */
	NOOPER(16, "NOOPER", "NOOPER"),

	/**
	 * The '<em><b>DPLMMW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DPLMMW_VALUE
	 * @generated
	 * @ordered
	 */
	DPLMMW(17, "DPLMMW", "DPLMMW"),

	/**
	 * The '<em><b>RECMMW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECMMW_VALUE
	 * @generated
	 * @ordered
	 */
	RECMMW(18, "RECMMW", "RECMMW"),

	/**
	 * The '<em><b>NOS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOS_VALUE
	 * @generated
	 * @ordered
	 */
	NOS(19, "NOS", "NOS");

	/**
	 * The '<em><b>ABO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ABO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ABO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ABO_VALUE = 0;

	/**
	 * The '<em><b>CANCLD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CANCLD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CANCLD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CANCLD_VALUE = 1;

	/**
	 * The '<em><b>COM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COM_VALUE = 2;

	/**
	 * The '<em><b>IPR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IPR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IPR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IPR_VALUE = 3;

	/**
	 * The '<em><b>NST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NST_VALUE = 4;

	/**
	 * The '<em><b>PAU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PAU</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAU
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PAU_VALUE = 5;

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
	public static final int NKN_VALUE = 6;

	/**
	 * The '<em><b>AIRBRN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AIRBRN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AIRBRN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AIRBRN_VALUE = 7;

	/**
	 * The '<em><b>DELAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DELAY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DELAY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DELAY_VALUE = 8;

	/**
	 * The '<em><b>PLAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PLAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PLAN_VALUE = 9;

	/**
	 * The '<em><b>RETASK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RETASK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RETASK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RETASK_VALUE = 10;

	/**
	 * The '<em><b>SCRMBL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SCRMBL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCRMBL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SCRMBL_VALUE = 11;

	/**
	 * The '<em><b>TASKED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TASKED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TASKED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TASKED_VALUE = 12;

	/**
	 * The '<em><b>OFFTSK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OFFTSK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OFFTSK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OFFTSK_VALUE = 13;

	/**
	 * The '<em><b>DWNTMW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DWNTMW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DWNTMW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DWNTMW_VALUE = 14;

	/**
	 * The '<em><b>TRNMMW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRNMMW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRNMMW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRNMMW_VALUE = 15;

	/**
	 * The '<em><b>NOOPER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOOPER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOOPER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOOPER_VALUE = 16;

	/**
	 * The '<em><b>DPLMMW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DPLMMW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DPLMMW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DPLMMW_VALUE = 17;

	/**
	 * The '<em><b>RECMMW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RECMMW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RECMMW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RECMMW_VALUE = 18;

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
	public static final int NOS_VALUE = 19;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Etat Action Etat Avancement</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoEtatActionEtatAvancement[] VALUES_ARRAY =
		new TypeDictionaryDicoEtatActionEtatAvancement[] {
			ABO,
			CANCLD,
			COM,
			IPR,
			NST,
			PAU,
			NKN,
			AIRBRN,
			DELAY,
			PLAN,
			RETASK,
			SCRMBL,
			TASKED,
			OFFTSK,
			DWNTMW,
			TRNMMW,
			NOOPER,
			DPLMMW,
			RECMMW,
			NOS,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Etat Action Etat Avancement</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoEtatActionEtatAvancement> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Etat Action Etat Avancement</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoEtatActionEtatAvancement get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoEtatActionEtatAvancement result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Etat Action Etat Avancement</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoEtatActionEtatAvancement getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoEtatActionEtatAvancement result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Etat Action Etat Avancement</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoEtatActionEtatAvancement get(int value) {
		switch (value) {
			case ABO_VALUE: return ABO;
			case CANCLD_VALUE: return CANCLD;
			case COM_VALUE: return COM;
			case IPR_VALUE: return IPR;
			case NST_VALUE: return NST;
			case PAU_VALUE: return PAU;
			case NKN_VALUE: return NKN;
			case AIRBRN_VALUE: return AIRBRN;
			case DELAY_VALUE: return DELAY;
			case PLAN_VALUE: return PLAN;
			case RETASK_VALUE: return RETASK;
			case SCRMBL_VALUE: return SCRMBL;
			case TASKED_VALUE: return TASKED;
			case OFFTSK_VALUE: return OFFTSK;
			case DWNTMW_VALUE: return DWNTMW;
			case TRNMMW_VALUE: return TRNMMW;
			case NOOPER_VALUE: return NOOPER;
			case DPLMMW_VALUE: return DPLMMW;
			case RECMMW_VALUE: return RECMMW;
			case NOS_VALUE: return NOS;
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
	private TypeDictionaryDicoEtatActionEtatAvancement(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoEtatActionEtatAvancement
