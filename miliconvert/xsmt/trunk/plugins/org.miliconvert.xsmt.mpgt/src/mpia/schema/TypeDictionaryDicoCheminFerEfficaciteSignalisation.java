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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Chemin Fer Efficacite Signalisation</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoCheminFerEfficaciteSignalisation()
 * @model extendedMetaData="name='type_Dictionary_Dico_CheminFerEfficaciteSignalisation'"
 * @generated
 */
public enum TypeDictionaryDicoCheminFerEfficaciteSignalisation implements Enumerator {
	/**
	 * The '<em><b>50</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_50_VALUE
	 * @generated
	 * @ordered
	 */
	_50(0, "_50", "50"),

	/**
	 * The '<em><b>70</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_70_VALUE
	 * @generated
	 * @ordered
	 */
	_70(1, "_70", "70"),

	/**
	 * The '<em><b>80</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_80_VALUE
	 * @generated
	 * @ordered
	 */
	_80(2, "_80", "80"),

	/**
	 * The '<em><b>85</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_85_VALUE
	 * @generated
	 * @ordered
	 */
	_85(3, "_85", "85");

	/**
	 * The '<em><b>50</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>50</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_50
	 * @model literal="50"
	 * @generated
	 * @ordered
	 */
	public static final int _50_VALUE = 0;

	/**
	 * The '<em><b>70</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>70</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_70
	 * @model literal="70"
	 * @generated
	 * @ordered
	 */
	public static final int _70_VALUE = 1;

	/**
	 * The '<em><b>80</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>80</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_80
	 * @model literal="80"
	 * @generated
	 * @ordered
	 */
	public static final int _80_VALUE = 2;

	/**
	 * The '<em><b>85</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>85</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_85
	 * @model literal="85"
	 * @generated
	 * @ordered
	 */
	public static final int _85_VALUE = 3;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Chemin Fer Efficacite Signalisation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoCheminFerEfficaciteSignalisation[] VALUES_ARRAY =
		new TypeDictionaryDicoCheminFerEfficaciteSignalisation[] {
			_50,
			_70,
			_80,
			_85,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Chemin Fer Efficacite Signalisation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoCheminFerEfficaciteSignalisation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Chemin Fer Efficacite Signalisation</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoCheminFerEfficaciteSignalisation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoCheminFerEfficaciteSignalisation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Chemin Fer Efficacite Signalisation</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoCheminFerEfficaciteSignalisation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoCheminFerEfficaciteSignalisation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Chemin Fer Efficacite Signalisation</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoCheminFerEfficaciteSignalisation get(int value) {
		switch (value) {
			case _50_VALUE: return _50;
			case _70_VALUE: return _70;
			case _80_VALUE: return _80;
			case _85_VALUE: return _85;
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
	private TypeDictionaryDicoCheminFerEfficaciteSignalisation(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoCheminFerEfficaciteSignalisation
