/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Etat Operationnel Aerodrome</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEtatOperationnelAerodrome#getNombreMaxWBACparJour <em>Nombre Max WBA Cpar Jour</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelAerodrome#getNombreMaxNBACstationnes <em>Nombre Max NBA Cstationnes</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelAerodrome#getNombreMaxNBACparJour <em>Nombre Max NBA Cpar Jour</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelAerodrome#getCapaciteFonctionnement <em>Capacite Fonctionnement</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelAerodrome#getNombreMaxWBACstationnes <em>Nombre Max WBA Cstationnes</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelAerodrome#isAEteEvalue <em>AEte Evalue</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelAerodrome#getOperationnelJour <em>Operationnel Jour</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelAerodrome()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_EtatOperationnelAerodrome' kind='elementOnly'"
 * @generated
 */
public interface TypeEtatOperationnelAerodrome extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre Max WBA Cpar Jour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Max WBA Cpar Jour</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Max WBA Cpar Jour</em>' attribute.
	 * @see #isSetNombreMaxWBACparJour()
	 * @see #unsetNombreMaxWBACparJour()
	 * @see #setNombreMaxWBACparJour(long)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelAerodrome_NombreMaxWBACparJour()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='NombreMaxWBACparJour'"
	 * @generated
	 */
	long getNombreMaxWBACparJour();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelAerodrome#getNombreMaxWBACparJour <em>Nombre Max WBA Cpar Jour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Max WBA Cpar Jour</em>' attribute.
	 * @see #isSetNombreMaxWBACparJour()
	 * @see #unsetNombreMaxWBACparJour()
	 * @see #getNombreMaxWBACparJour()
	 * @generated
	 */
	void setNombreMaxWBACparJour(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelAerodrome#getNombreMaxWBACparJour <em>Nombre Max WBA Cpar Jour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreMaxWBACparJour()
	 * @see #getNombreMaxWBACparJour()
	 * @see #setNombreMaxWBACparJour(long)
	 * @generated
	 */
	void unsetNombreMaxWBACparJour();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelAerodrome#getNombreMaxWBACparJour <em>Nombre Max WBA Cpar Jour</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Max WBA Cpar Jour</em>' attribute is set.
	 * @see #unsetNombreMaxWBACparJour()
	 * @see #getNombreMaxWBACparJour()
	 * @see #setNombreMaxWBACparJour(long)
	 * @generated
	 */
	boolean isSetNombreMaxWBACparJour();

	/**
	 * Returns the value of the '<em><b>Nombre Max NBA Cstationnes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Max NBA Cstationnes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Max NBA Cstationnes</em>' attribute.
	 * @see #isSetNombreMaxNBACstationnes()
	 * @see #unsetNombreMaxNBACstationnes()
	 * @see #setNombreMaxNBACstationnes(long)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelAerodrome_NombreMaxNBACstationnes()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='NombreMaxNBACstationnes'"
	 * @generated
	 */
	long getNombreMaxNBACstationnes();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelAerodrome#getNombreMaxNBACstationnes <em>Nombre Max NBA Cstationnes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Max NBA Cstationnes</em>' attribute.
	 * @see #isSetNombreMaxNBACstationnes()
	 * @see #unsetNombreMaxNBACstationnes()
	 * @see #getNombreMaxNBACstationnes()
	 * @generated
	 */
	void setNombreMaxNBACstationnes(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelAerodrome#getNombreMaxNBACstationnes <em>Nombre Max NBA Cstationnes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreMaxNBACstationnes()
	 * @see #getNombreMaxNBACstationnes()
	 * @see #setNombreMaxNBACstationnes(long)
	 * @generated
	 */
	void unsetNombreMaxNBACstationnes();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelAerodrome#getNombreMaxNBACstationnes <em>Nombre Max NBA Cstationnes</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Max NBA Cstationnes</em>' attribute is set.
	 * @see #unsetNombreMaxNBACstationnes()
	 * @see #getNombreMaxNBACstationnes()
	 * @see #setNombreMaxNBACstationnes(long)
	 * @generated
	 */
	boolean isSetNombreMaxNBACstationnes();

	/**
	 * Returns the value of the '<em><b>Nombre Max NBA Cpar Jour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Max NBA Cpar Jour</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Max NBA Cpar Jour</em>' attribute.
	 * @see #isSetNombreMaxNBACparJour()
	 * @see #unsetNombreMaxNBACparJour()
	 * @see #setNombreMaxNBACparJour(long)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelAerodrome_NombreMaxNBACparJour()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='NombreMaxNBACparJour'"
	 * @generated
	 */
	long getNombreMaxNBACparJour();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelAerodrome#getNombreMaxNBACparJour <em>Nombre Max NBA Cpar Jour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Max NBA Cpar Jour</em>' attribute.
	 * @see #isSetNombreMaxNBACparJour()
	 * @see #unsetNombreMaxNBACparJour()
	 * @see #getNombreMaxNBACparJour()
	 * @generated
	 */
	void setNombreMaxNBACparJour(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelAerodrome#getNombreMaxNBACparJour <em>Nombre Max NBA Cpar Jour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreMaxNBACparJour()
	 * @see #getNombreMaxNBACparJour()
	 * @see #setNombreMaxNBACparJour(long)
	 * @generated
	 */
	void unsetNombreMaxNBACparJour();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelAerodrome#getNombreMaxNBACparJour <em>Nombre Max NBA Cpar Jour</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Max NBA Cpar Jour</em>' attribute is set.
	 * @see #unsetNombreMaxNBACparJour()
	 * @see #getNombreMaxNBACparJour()
	 * @see #setNombreMaxNBACparJour(long)
	 * @generated
	 */
	boolean isSetNombreMaxNBACparJour();

	/**
	 * Returns the value of the '<em><b>Capacite Fonctionnement</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatOperationnelAerodromeCapaciteFonctionnement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacite Fonctionnement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacite Fonctionnement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelAerodromeCapaciteFonctionnement
	 * @see #isSetCapaciteFonctionnement()
	 * @see #unsetCapaciteFonctionnement()
	 * @see #setCapaciteFonctionnement(TypeDictionaryDicoEtatOperationnelAerodromeCapaciteFonctionnement)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelAerodrome_CapaciteFonctionnement()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='CapaciteFonctionnement'"
	 * @generated
	 */
	TypeDictionaryDicoEtatOperationnelAerodromeCapaciteFonctionnement getCapaciteFonctionnement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelAerodrome#getCapaciteFonctionnement <em>Capacite Fonctionnement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacite Fonctionnement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelAerodromeCapaciteFonctionnement
	 * @see #isSetCapaciteFonctionnement()
	 * @see #unsetCapaciteFonctionnement()
	 * @see #getCapaciteFonctionnement()
	 * @generated
	 */
	void setCapaciteFonctionnement(TypeDictionaryDicoEtatOperationnelAerodromeCapaciteFonctionnement value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelAerodrome#getCapaciteFonctionnement <em>Capacite Fonctionnement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCapaciteFonctionnement()
	 * @see #getCapaciteFonctionnement()
	 * @see #setCapaciteFonctionnement(TypeDictionaryDicoEtatOperationnelAerodromeCapaciteFonctionnement)
	 * @generated
	 */
	void unsetCapaciteFonctionnement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelAerodrome#getCapaciteFonctionnement <em>Capacite Fonctionnement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Capacite Fonctionnement</em>' attribute is set.
	 * @see #unsetCapaciteFonctionnement()
	 * @see #getCapaciteFonctionnement()
	 * @see #setCapaciteFonctionnement(TypeDictionaryDicoEtatOperationnelAerodromeCapaciteFonctionnement)
	 * @generated
	 */
	boolean isSetCapaciteFonctionnement();

	/**
	 * Returns the value of the '<em><b>Nombre Max WBA Cstationnes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Max WBA Cstationnes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Max WBA Cstationnes</em>' attribute.
	 * @see #isSetNombreMaxWBACstationnes()
	 * @see #unsetNombreMaxWBACstationnes()
	 * @see #setNombreMaxWBACstationnes(long)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelAerodrome_NombreMaxWBACstationnes()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='NombreMaxWBACstationnes'"
	 * @generated
	 */
	long getNombreMaxWBACstationnes();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelAerodrome#getNombreMaxWBACstationnes <em>Nombre Max WBA Cstationnes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Max WBA Cstationnes</em>' attribute.
	 * @see #isSetNombreMaxWBACstationnes()
	 * @see #unsetNombreMaxWBACstationnes()
	 * @see #getNombreMaxWBACstationnes()
	 * @generated
	 */
	void setNombreMaxWBACstationnes(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelAerodrome#getNombreMaxWBACstationnes <em>Nombre Max WBA Cstationnes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreMaxWBACstationnes()
	 * @see #getNombreMaxWBACstationnes()
	 * @see #setNombreMaxWBACstationnes(long)
	 * @generated
	 */
	void unsetNombreMaxWBACstationnes();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelAerodrome#getNombreMaxWBACstationnes <em>Nombre Max WBA Cstationnes</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Max WBA Cstationnes</em>' attribute is set.
	 * @see #unsetNombreMaxWBACstationnes()
	 * @see #getNombreMaxWBACstationnes()
	 * @see #setNombreMaxWBACstationnes(long)
	 * @generated
	 */
	boolean isSetNombreMaxWBACstationnes();

	/**
	 * Returns the value of the '<em><b>AEte Evalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AEte Evalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AEte Evalue</em>' attribute.
	 * @see #isSetAEteEvalue()
	 * @see #unsetAEteEvalue()
	 * @see #setAEteEvalue(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelAerodrome_AEteEvalue()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='AEteEvalue'"
	 * @generated
	 */
	boolean isAEteEvalue();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelAerodrome#isAEteEvalue <em>AEte Evalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AEte Evalue</em>' attribute.
	 * @see #isSetAEteEvalue()
	 * @see #unsetAEteEvalue()
	 * @see #isAEteEvalue()
	 * @generated
	 */
	void setAEteEvalue(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelAerodrome#isAEteEvalue <em>AEte Evalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAEteEvalue()
	 * @see #isAEteEvalue()
	 * @see #setAEteEvalue(boolean)
	 * @generated
	 */
	void unsetAEteEvalue();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelAerodrome#isAEteEvalue <em>AEte Evalue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>AEte Evalue</em>' attribute is set.
	 * @see #unsetAEteEvalue()
	 * @see #isAEteEvalue()
	 * @see #setAEteEvalue(boolean)
	 * @generated
	 */
	boolean isSetAEteEvalue();

	/**
	 * Returns the value of the '<em><b>Operationnel Jour</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatOperationnelAerodromeOperationnelJour}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operationnel Jour</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operationnel Jour</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelAerodromeOperationnelJour
	 * @see #isSetOperationnelJour()
	 * @see #unsetOperationnelJour()
	 * @see #setOperationnelJour(TypeDictionaryDicoEtatOperationnelAerodromeOperationnelJour)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelAerodrome_OperationnelJour()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='OperationnelJour'"
	 * @generated
	 */
	TypeDictionaryDicoEtatOperationnelAerodromeOperationnelJour getOperationnelJour();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelAerodrome#getOperationnelJour <em>Operationnel Jour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operationnel Jour</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelAerodromeOperationnelJour
	 * @see #isSetOperationnelJour()
	 * @see #unsetOperationnelJour()
	 * @see #getOperationnelJour()
	 * @generated
	 */
	void setOperationnelJour(TypeDictionaryDicoEtatOperationnelAerodromeOperationnelJour value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelAerodrome#getOperationnelJour <em>Operationnel Jour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOperationnelJour()
	 * @see #getOperationnelJour()
	 * @see #setOperationnelJour(TypeDictionaryDicoEtatOperationnelAerodromeOperationnelJour)
	 * @generated
	 */
	void unsetOperationnelJour();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelAerodrome#getOperationnelJour <em>Operationnel Jour</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Operationnel Jour</em>' attribute is set.
	 * @see #unsetOperationnelJour()
	 * @see #getOperationnelJour()
	 * @see #setOperationnelJour(TypeDictionaryDicoEtatOperationnelAerodromeOperationnelJour)
	 * @generated
	 */
	boolean isSetOperationnelJour();

} // TypeEtatOperationnelAerodrome
