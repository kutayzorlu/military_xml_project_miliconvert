/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeDoseAbsorbee;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Etat Operationnel Personnel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEtatOperationnelPersonnel#getDisponibilite <em>Disponibilite</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelPersonnel#getEtatPhysique <em>Etat Physique</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelPersonnel#getEtatSante <em>Etat Sante</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelPersonnel#getDoseRadiation <em>Dose Radiation</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelPersonnel#isReserve <em>Reserve</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelPersonnel()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_EtatOperationnelPersonnel' kind='elementOnly'"
 * @generated
 */
public interface TypeEtatOperationnelPersonnel extends TypeEtatOperationnel {
	/**
	 * Returns the value of the '<em><b>Disponibilite</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatOperationnelPersonnelDisponibilite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disponibilite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disponibilite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelPersonnelDisponibilite
	 * @see #isSetDisponibilite()
	 * @see #unsetDisponibilite()
	 * @see #setDisponibilite(TypeDictionaryDicoEtatOperationnelPersonnelDisponibilite)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelPersonnel_Disponibilite()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Disponibilite'"
	 * @generated
	 */
	TypeDictionaryDicoEtatOperationnelPersonnelDisponibilite getDisponibilite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelPersonnel#getDisponibilite <em>Disponibilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disponibilite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelPersonnelDisponibilite
	 * @see #isSetDisponibilite()
	 * @see #unsetDisponibilite()
	 * @see #getDisponibilite()
	 * @generated
	 */
	void setDisponibilite(TypeDictionaryDicoEtatOperationnelPersonnelDisponibilite value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelPersonnel#getDisponibilite <em>Disponibilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisponibilite()
	 * @see #getDisponibilite()
	 * @see #setDisponibilite(TypeDictionaryDicoEtatOperationnelPersonnelDisponibilite)
	 * @generated
	 */
	void unsetDisponibilite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelPersonnel#getDisponibilite <em>Disponibilite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Disponibilite</em>' attribute is set.
	 * @see #unsetDisponibilite()
	 * @see #getDisponibilite()
	 * @see #setDisponibilite(TypeDictionaryDicoEtatOperationnelPersonnelDisponibilite)
	 * @generated
	 */
	boolean isSetDisponibilite();

	/**
	 * Returns the value of the '<em><b>Etat Physique</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatOperationnelPersonnelEtatPhysique}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat Physique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat Physique</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelPersonnelEtatPhysique
	 * @see #isSetEtatPhysique()
	 * @see #unsetEtatPhysique()
	 * @see #setEtatPhysique(TypeDictionaryDicoEtatOperationnelPersonnelEtatPhysique)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelPersonnel_EtatPhysique()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='EtatPhysique'"
	 * @generated
	 */
	TypeDictionaryDicoEtatOperationnelPersonnelEtatPhysique getEtatPhysique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelPersonnel#getEtatPhysique <em>Etat Physique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat Physique</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelPersonnelEtatPhysique
	 * @see #isSetEtatPhysique()
	 * @see #unsetEtatPhysique()
	 * @see #getEtatPhysique()
	 * @generated
	 */
	void setEtatPhysique(TypeDictionaryDicoEtatOperationnelPersonnelEtatPhysique value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelPersonnel#getEtatPhysique <em>Etat Physique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEtatPhysique()
	 * @see #getEtatPhysique()
	 * @see #setEtatPhysique(TypeDictionaryDicoEtatOperationnelPersonnelEtatPhysique)
	 * @generated
	 */
	void unsetEtatPhysique();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelPersonnel#getEtatPhysique <em>Etat Physique</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Etat Physique</em>' attribute is set.
	 * @see #unsetEtatPhysique()
	 * @see #getEtatPhysique()
	 * @see #setEtatPhysique(TypeDictionaryDicoEtatOperationnelPersonnelEtatPhysique)
	 * @generated
	 */
	boolean isSetEtatPhysique();

	/**
	 * Returns the value of the '<em><b>Etat Sante</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatOperationnelPersonnelEtatSante}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat Sante</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat Sante</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelPersonnelEtatSante
	 * @see #isSetEtatSante()
	 * @see #unsetEtatSante()
	 * @see #setEtatSante(TypeDictionaryDicoEtatOperationnelPersonnelEtatSante)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelPersonnel_EtatSante()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='EtatSante'"
	 * @generated
	 */
	TypeDictionaryDicoEtatOperationnelPersonnelEtatSante getEtatSante();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelPersonnel#getEtatSante <em>Etat Sante</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat Sante</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelPersonnelEtatSante
	 * @see #isSetEtatSante()
	 * @see #unsetEtatSante()
	 * @see #getEtatSante()
	 * @generated
	 */
	void setEtatSante(TypeDictionaryDicoEtatOperationnelPersonnelEtatSante value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelPersonnel#getEtatSante <em>Etat Sante</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEtatSante()
	 * @see #getEtatSante()
	 * @see #setEtatSante(TypeDictionaryDicoEtatOperationnelPersonnelEtatSante)
	 * @generated
	 */
	void unsetEtatSante();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelPersonnel#getEtatSante <em>Etat Sante</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Etat Sante</em>' attribute is set.
	 * @see #unsetEtatSante()
	 * @see #getEtatSante()
	 * @see #setEtatSante(TypeDictionaryDicoEtatOperationnelPersonnelEtatSante)
	 * @generated
	 */
	boolean isSetEtatSante();

	/**
	 * Returns the value of the '<em><b>Dose Radiation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dose Radiation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dose Radiation</em>' containment reference.
	 * @see #setDoseRadiation(TypeDataTypeDoseAbsorbee)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelPersonnel_DoseRadiation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DoseRadiation'"
	 * @generated
	 */
	TypeDataTypeDoseAbsorbee getDoseRadiation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelPersonnel#getDoseRadiation <em>Dose Radiation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dose Radiation</em>' containment reference.
	 * @see #getDoseRadiation()
	 * @generated
	 */
	void setDoseRadiation(TypeDataTypeDoseAbsorbee value);

	/**
	 * Returns the value of the '<em><b>Reserve</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserve</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserve</em>' attribute.
	 * @see #isSetReserve()
	 * @see #unsetReserve()
	 * @see #setReserve(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelPersonnel_Reserve()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='Reserve'"
	 * @generated
	 */
	boolean isReserve();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelPersonnel#isReserve <em>Reserve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserve</em>' attribute.
	 * @see #isSetReserve()
	 * @see #unsetReserve()
	 * @see #isReserve()
	 * @generated
	 */
	void setReserve(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelPersonnel#isReserve <em>Reserve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReserve()
	 * @see #isReserve()
	 * @see #setReserve(boolean)
	 * @generated
	 */
	void unsetReserve();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelPersonnel#isReserve <em>Reserve</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reserve</em>' attribute is set.
	 * @see #unsetReserve()
	 * @see #isReserve()
	 * @see #setReserve(boolean)
	 * @generated
	 */
	boolean isSetReserve();

} // TypeEtatOperationnelPersonnel
