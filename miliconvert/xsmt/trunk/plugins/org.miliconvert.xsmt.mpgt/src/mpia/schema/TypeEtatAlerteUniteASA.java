/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociationEXT;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Etat Alerte Unite ASA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEtatAlerteUniteASA#getEtatAlertePourTir <em>Etat Alerte Pour Tir</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatAlerteUniteASA#getEtatAlertePourMouvement <em>Etat Alerte Pour Mouvement</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatAlerteUniteASA#getHeureDebutApplication <em>Heure Debut Application</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatAlerteUniteASA#getHeureFinApplication <em>Heure Fin Application</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatAlerteUniteASA#getModalitesParticulieresAlerte <em>Modalites Particulieres Alerte</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatAlerteUniteASA#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatAlerteUniteASA#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatAlerteUniteASA#getAAppliquerParSystemeArmeTypeArme <em>AAppliquer Par Systeme Arme Type Arme</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEtatAlerteUniteASA()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_EtatAlerteUniteASA' kind='elementOnly'"
 * @generated
 */
public interface TypeEtatAlerteUniteASA extends EObject {
	/**
	 * Returns the value of the '<em><b>Etat Alerte Pour Tir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat Alerte Pour Tir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat Alerte Pour Tir</em>' attribute.
	 * @see #isSetEtatAlertePourTir()
	 * @see #unsetEtatAlertePourTir()
	 * @see #setEtatAlertePourTir(long)
	 * @see mpia.schema.SchemaPackage#getTypeEtatAlerteUniteASA_EtatAlertePourTir()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='EtatAlertePourTir'"
	 * @generated
	 */
	long getEtatAlertePourTir();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatAlerteUniteASA#getEtatAlertePourTir <em>Etat Alerte Pour Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat Alerte Pour Tir</em>' attribute.
	 * @see #isSetEtatAlertePourTir()
	 * @see #unsetEtatAlertePourTir()
	 * @see #getEtatAlertePourTir()
	 * @generated
	 */
	void setEtatAlertePourTir(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatAlerteUniteASA#getEtatAlertePourTir <em>Etat Alerte Pour Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEtatAlertePourTir()
	 * @see #getEtatAlertePourTir()
	 * @see #setEtatAlertePourTir(long)
	 * @generated
	 */
	void unsetEtatAlertePourTir();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatAlerteUniteASA#getEtatAlertePourTir <em>Etat Alerte Pour Tir</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Etat Alerte Pour Tir</em>' attribute is set.
	 * @see #unsetEtatAlertePourTir()
	 * @see #getEtatAlertePourTir()
	 * @see #setEtatAlertePourTir(long)
	 * @generated
	 */
	boolean isSetEtatAlertePourTir();

	/**
	 * Returns the value of the '<em><b>Etat Alerte Pour Mouvement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat Alerte Pour Mouvement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat Alerte Pour Mouvement</em>' attribute.
	 * @see #isSetEtatAlertePourMouvement()
	 * @see #unsetEtatAlertePourMouvement()
	 * @see #setEtatAlertePourMouvement(long)
	 * @see mpia.schema.SchemaPackage#getTypeEtatAlerteUniteASA_EtatAlertePourMouvement()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='EtatAlertePourMouvement'"
	 * @generated
	 */
	long getEtatAlertePourMouvement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatAlerteUniteASA#getEtatAlertePourMouvement <em>Etat Alerte Pour Mouvement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat Alerte Pour Mouvement</em>' attribute.
	 * @see #isSetEtatAlertePourMouvement()
	 * @see #unsetEtatAlertePourMouvement()
	 * @see #getEtatAlertePourMouvement()
	 * @generated
	 */
	void setEtatAlertePourMouvement(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatAlerteUniteASA#getEtatAlertePourMouvement <em>Etat Alerte Pour Mouvement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEtatAlertePourMouvement()
	 * @see #getEtatAlertePourMouvement()
	 * @see #setEtatAlertePourMouvement(long)
	 * @generated
	 */
	void unsetEtatAlertePourMouvement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatAlerteUniteASA#getEtatAlertePourMouvement <em>Etat Alerte Pour Mouvement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Etat Alerte Pour Mouvement</em>' attribute is set.
	 * @see #unsetEtatAlertePourMouvement()
	 * @see #getEtatAlertePourMouvement()
	 * @see #setEtatAlertePourMouvement(long)
	 * @generated
	 */
	boolean isSetEtatAlertePourMouvement();

	/**
	 * Returns the value of the '<em><b>Heure Debut Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heure Debut Application</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heure Debut Application</em>' attribute.
	 * @see #setHeureDebutApplication(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeEtatAlerteUniteASA_HeureDebutApplication()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='HeureDebutApplication'"
	 * @generated
	 */
	XMLGregorianCalendar getHeureDebutApplication();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatAlerteUniteASA#getHeureDebutApplication <em>Heure Debut Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heure Debut Application</em>' attribute.
	 * @see #getHeureDebutApplication()
	 * @generated
	 */
	void setHeureDebutApplication(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Heure Fin Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heure Fin Application</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heure Fin Application</em>' attribute.
	 * @see #setHeureFinApplication(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeEtatAlerteUniteASA_HeureFinApplication()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='HeureFinApplication'"
	 * @generated
	 */
	XMLGregorianCalendar getHeureFinApplication();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatAlerteUniteASA#getHeureFinApplication <em>Heure Fin Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heure Fin Application</em>' attribute.
	 * @see #getHeureFinApplication()
	 * @generated
	 */
	void setHeureFinApplication(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Modalites Particulieres Alerte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modalites Particulieres Alerte</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modalites Particulieres Alerte</em>' attribute.
	 * @see #setModalitesParticulieresAlerte(String)
	 * @see mpia.schema.SchemaPackage#getTypeEtatAlerteUniteASA_ModalitesParticulieresAlerte()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='ModalitesParticulieresAlerte'"
	 * @generated
	 */
	String getModalitesParticulieresAlerte();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatAlerteUniteASA#getModalitesParticulieresAlerte <em>Modalites Particulieres Alerte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modalites Particulieres Alerte</em>' attribute.
	 * @see #getModalitesParticulieresAlerte()
	 * @generated
	 */
	void setModalitesParticulieresAlerte(String value);

	/**
	 * Returns the value of the '<em><b>CTE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CTE</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CTE</em>' attribute.
	 * @see #setCTE(String)
	 * @see mpia.schema.SchemaPackage#getTypeEtatAlerteUniteASA_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatAlerteUniteASA#getCTE <em>CTE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CTE</em>' attribute.
	 * @see #getCTE()
	 * @generated
	 */
	void setCTE(String value);

	/**
	 * Returns the value of the '<em><b>CE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CE</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CE</em>' attribute.
	 * @see #setCE(String)
	 * @see mpia.schema.SchemaPackage#getTypeEtatAlerteUniteASA_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatAlerteUniteASA#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>AAppliquer Par Systeme Arme Type Arme</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AAppliquer Par Systeme Arme Type Arme</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AAppliquer Par Systeme Arme Type Arme</em>' containment reference.
	 * @see #setAAppliquerParSystemeArmeTypeArme(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeEtatAlerteUniteASA_AAppliquerParSystemeArmeTypeArme()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeArme'"
	 *        extendedMetaData="kind='element' name='AAppliquerParSystemeArme_TypeArme'"
	 * @generated
	 */
	TypeAssociationEXT getAAppliquerParSystemeArmeTypeArme();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatAlerteUniteASA#getAAppliquerParSystemeArmeTypeArme <em>AAppliquer Par Systeme Arme Type Arme</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AAppliquer Par Systeme Arme Type Arme</em>' containment reference.
	 * @see #getAAppliquerParSystemeArmeTypeArme()
	 * @generated
	 */
	void setAAppliquerParSystemeArmeTypeArme(TypeAssociationEXT value);

} // TypeEtatAlerteUniteASA
