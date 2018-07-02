/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Suivi Medical</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeSuiviMedical#getGDHBlessure <em>GDH Blessure</em>}</li>
 *   <li>{@link mpia.schema.TypeSuiviMedical#getGDHPosteSecours <em>GDH Poste Secours</em>}</li>
 *   <li>{@link mpia.schema.TypeSuiviMedical#getGDHRamassage <em>GDH Ramassage</em>}</li>
 *   <li>{@link mpia.schema.TypeSuiviMedical#isTriage <em>Triage</em>}</li>
 *   <li>{@link mpia.schema.TypeSuiviMedical#getGDHArriveeTriage <em>GDH Arrivee Triage</em>}</li>
 *   <li>{@link mpia.schema.TypeSuiviMedical#getTypeTriage <em>Type Triage</em>}</li>
 *   <li>{@link mpia.schema.TypeSuiviMedical#getTraitement <em>Traitement</em>}</li>
 *   <li>{@link mpia.schema.TypeSuiviMedical#getMoyenEvacuation <em>Moyen Evacuation</em>}</li>
 *   <li>{@link mpia.schema.TypeSuiviMedical#getGDHEvacuation <em>GDH Evacuation</em>}</li>
 *   <li>{@link mpia.schema.TypeSuiviMedical#getDestinationEvacuation <em>Destination Evacuation</em>}</li>
 *   <li>{@link mpia.schema.TypeSuiviMedical#getDateSituation <em>Date Situation</em>}</li>
 *   <li>{@link mpia.schema.TypeSuiviMedical#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeSuiviMedical#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeSuiviMedical()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_SuiviMedical' kind='elementOnly'"
 * @generated
 */
public interface TypeSuiviMedical extends EObject {
	/**
	 * Returns the value of the '<em><b>GDH Blessure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GDH Blessure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GDH Blessure</em>' attribute.
	 * @see #setGDHBlessure(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeSuiviMedical_GDHBlessure()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='GDHBlessure'"
	 * @generated
	 */
	XMLGregorianCalendar getGDHBlessure();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSuiviMedical#getGDHBlessure <em>GDH Blessure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GDH Blessure</em>' attribute.
	 * @see #getGDHBlessure()
	 * @generated
	 */
	void setGDHBlessure(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>GDH Poste Secours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GDH Poste Secours</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GDH Poste Secours</em>' attribute.
	 * @see #setGDHPosteSecours(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeSuiviMedical_GDHPosteSecours()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='GDHPosteSecours'"
	 * @generated
	 */
	XMLGregorianCalendar getGDHPosteSecours();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSuiviMedical#getGDHPosteSecours <em>GDH Poste Secours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GDH Poste Secours</em>' attribute.
	 * @see #getGDHPosteSecours()
	 * @generated
	 */
	void setGDHPosteSecours(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>GDH Ramassage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GDH Ramassage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GDH Ramassage</em>' attribute.
	 * @see #setGDHRamassage(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeSuiviMedical_GDHRamassage()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='GDHRamassage'"
	 * @generated
	 */
	XMLGregorianCalendar getGDHRamassage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSuiviMedical#getGDHRamassage <em>GDH Ramassage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GDH Ramassage</em>' attribute.
	 * @see #getGDHRamassage()
	 * @generated
	 */
	void setGDHRamassage(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Triage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triage</em>' attribute.
	 * @see #isSetTriage()
	 * @see #unsetTriage()
	 * @see #setTriage(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeSuiviMedical_Triage()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='Triage'"
	 * @generated
	 */
	boolean isTriage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSuiviMedical#isTriage <em>Triage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Triage</em>' attribute.
	 * @see #isSetTriage()
	 * @see #unsetTriage()
	 * @see #isTriage()
	 * @generated
	 */
	void setTriage(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSuiviMedical#isTriage <em>Triage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTriage()
	 * @see #isTriage()
	 * @see #setTriage(boolean)
	 * @generated
	 */
	void unsetTriage();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSuiviMedical#isTriage <em>Triage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Triage</em>' attribute is set.
	 * @see #unsetTriage()
	 * @see #isTriage()
	 * @see #setTriage(boolean)
	 * @generated
	 */
	boolean isSetTriage();

	/**
	 * Returns the value of the '<em><b>GDH Arrivee Triage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GDH Arrivee Triage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GDH Arrivee Triage</em>' attribute.
	 * @see #setGDHArriveeTriage(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeSuiviMedical_GDHArriveeTriage()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='GDHArriveeTriage'"
	 * @generated
	 */
	XMLGregorianCalendar getGDHArriveeTriage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSuiviMedical#getGDHArriveeTriage <em>GDH Arrivee Triage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GDH Arrivee Triage</em>' attribute.
	 * @see #getGDHArriveeTriage()
	 * @generated
	 */
	void setGDHArriveeTriage(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Type Triage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Triage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Triage</em>' attribute.
	 * @see #setTypeTriage(String)
	 * @see mpia.schema.SchemaPackage#getTypeSuiviMedical_TypeTriage()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='TypeTriage'"
	 * @generated
	 */
	String getTypeTriage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSuiviMedical#getTypeTriage <em>Type Triage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Triage</em>' attribute.
	 * @see #getTypeTriage()
	 * @generated
	 */
	void setTypeTriage(String value);

	/**
	 * Returns the value of the '<em><b>Traitement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Traitement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traitement</em>' attribute.
	 * @see #setTraitement(String)
	 * @see mpia.schema.SchemaPackage#getTypeSuiviMedical_Traitement()
	 * @model dataType="mpia.meta.TypeDataTypeChaine020"
	 *        extendedMetaData="kind='element' name='Traitement'"
	 * @generated
	 */
	String getTraitement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSuiviMedical#getTraitement <em>Traitement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Traitement</em>' attribute.
	 * @see #getTraitement()
	 * @generated
	 */
	void setTraitement(String value);

	/**
	 * Returns the value of the '<em><b>Moyen Evacuation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moyen Evacuation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moyen Evacuation</em>' attribute.
	 * @see #setMoyenEvacuation(String)
	 * @see mpia.schema.SchemaPackage#getTypeSuiviMedical_MoyenEvacuation()
	 * @model dataType="mpia.meta.TypeDataTypeChaine020"
	 *        extendedMetaData="kind='element' name='MoyenEvacuation'"
	 * @generated
	 */
	String getMoyenEvacuation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSuiviMedical#getMoyenEvacuation <em>Moyen Evacuation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moyen Evacuation</em>' attribute.
	 * @see #getMoyenEvacuation()
	 * @generated
	 */
	void setMoyenEvacuation(String value);

	/**
	 * Returns the value of the '<em><b>GDH Evacuation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GDH Evacuation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GDH Evacuation</em>' attribute.
	 * @see #setGDHEvacuation(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeSuiviMedical_GDHEvacuation()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='GDHEvacuation'"
	 * @generated
	 */
	XMLGregorianCalendar getGDHEvacuation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSuiviMedical#getGDHEvacuation <em>GDH Evacuation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GDH Evacuation</em>' attribute.
	 * @see #getGDHEvacuation()
	 * @generated
	 */
	void setGDHEvacuation(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Destination Evacuation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination Evacuation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Evacuation</em>' attribute.
	 * @see #setDestinationEvacuation(String)
	 * @see mpia.schema.SchemaPackage#getTypeSuiviMedical_DestinationEvacuation()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='DestinationEvacuation'"
	 * @generated
	 */
	String getDestinationEvacuation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSuiviMedical#getDestinationEvacuation <em>Destination Evacuation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Evacuation</em>' attribute.
	 * @see #getDestinationEvacuation()
	 * @generated
	 */
	void setDestinationEvacuation(String value);

	/**
	 * Returns the value of the '<em><b>Date Situation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Situation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Situation</em>' attribute.
	 * @see #setDateSituation(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeSuiviMedical_DateSituation()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateSituation'"
	 * @generated
	 */
	XMLGregorianCalendar getDateSituation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSuiviMedical#getDateSituation <em>Date Situation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Situation</em>' attribute.
	 * @see #getDateSituation()
	 * @generated
	 */
	void setDateSituation(XMLGregorianCalendar value);

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
	 * @see mpia.schema.SchemaPackage#getTypeSuiviMedical_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSuiviMedical#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeSuiviMedical_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSuiviMedical#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

} // TypeSuiviMedical
