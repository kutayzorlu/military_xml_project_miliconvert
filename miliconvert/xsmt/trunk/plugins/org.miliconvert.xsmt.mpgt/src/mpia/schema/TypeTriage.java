/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Triage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeTriage#getDateDActivation <em>Date DActivation</em>}</li>
 *   <li>{@link mpia.schema.TypeTriage#getDateDesactivation <em>Date Desactivation</em>}</li>
 *   <li>{@link mpia.schema.TypeTriage#getMoyensDetraitementInterIntra <em>Moyens Detraitement Inter Intra</em>}</li>
 *   <li>{@link mpia.schema.TypeTriage#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeTriage#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeTriage#getAPourLocalisationAutreElementControle <em>APour Localisation Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeTriage#getAPourSectionTriagesMoyensTriage <em>APour Section Triages Moyens Triage</em>}</li>
 *   <li>{@link mpia.schema.TypeTriage#getAPourAutresMoyensMilitaireTerreMoyensTriage <em>APour Autres Moyens Militaire Terre Moyens Triage</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeTriage()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_Triage' kind='elementOnly'"
 * @generated
 */
public interface TypeTriage extends EObject {
	/**
	 * Returns the value of the '<em><b>Date DActivation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date DActivation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date DActivation</em>' attribute.
	 * @see #setDateDActivation(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeTriage_DateDActivation()
	 * @model dataType="mpia.meta.TypeDataTypeGDH" required="true"
	 *        extendedMetaData="kind='element' name='DateDActivation'"
	 * @generated
	 */
	XMLGregorianCalendar getDateDActivation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTriage#getDateDActivation <em>Date DActivation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date DActivation</em>' attribute.
	 * @see #getDateDActivation()
	 * @generated
	 */
	void setDateDActivation(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Date Desactivation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Desactivation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Desactivation</em>' attribute.
	 * @see #setDateDesactivation(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeTriage_DateDesactivation()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateDesactivation'"
	 * @generated
	 */
	XMLGregorianCalendar getDateDesactivation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTriage#getDateDesactivation <em>Date Desactivation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Desactivation</em>' attribute.
	 * @see #getDateDesactivation()
	 * @generated
	 */
	void setDateDesactivation(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Moyens Detraitement Inter Intra</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moyens Detraitement Inter Intra</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moyens Detraitement Inter Intra</em>' attribute.
	 * @see #setMoyensDetraitementInterIntra(String)
	 * @see mpia.schema.SchemaPackage#getTypeTriage_MoyensDetraitementInterIntra()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='MoyensDetraitementInterIntra'"
	 * @generated
	 */
	String getMoyensDetraitementInterIntra();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTriage#getMoyensDetraitementInterIntra <em>Moyens Detraitement Inter Intra</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moyens Detraitement Inter Intra</em>' attribute.
	 * @see #getMoyensDetraitementInterIntra()
	 * @generated
	 */
	void setMoyensDetraitementInterIntra(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeTriage_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTriage#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeTriage_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTriage#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>APour Localisation Autre Element Controle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Localisation Autre Element Controle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Localisation Autre Element Controle</em>' containment reference.
	 * @see #setAPourLocalisationAutreElementControle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeTriage_APourLocalisationAutreElementControle()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='APourLocalisation_AutreElementControle'"
	 * @generated
	 */
	TypeAssociation getAPourLocalisationAutreElementControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTriage#getAPourLocalisationAutreElementControle <em>APour Localisation Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Localisation Autre Element Controle</em>' containment reference.
	 * @see #getAPourLocalisationAutreElementControle()
	 * @generated
	 */
	void setAPourLocalisationAutreElementControle(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Section Triages Moyens Triage</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeMoyensTriage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Section Triages Moyens Triage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Section Triages Moyens Triage</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeTriage_APourSectionTriagesMoyensTriage()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_MoyensTriage'"
	 *        extendedMetaData="kind='element' name='APourSectionTriages_MoyensTriage'"
	 * @generated
	 */
	EList<TypeMoyensTriage> getAPourSectionTriagesMoyensTriage();

	/**
	 * Returns the value of the '<em><b>APour Autres Moyens Militaire Terre Moyens Triage</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeMoyensTriage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Autres Moyens Militaire Terre Moyens Triage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Autres Moyens Militaire Terre Moyens Triage</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeTriage_APourAutresMoyensMilitaireTerreMoyensTriage()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_MoyensTriage'"
	 *        extendedMetaData="kind='element' name='APourAutresMoyensMilitaireTerre_MoyensTriage'"
	 * @generated
	 */
	EList<TypeMoyensTriage> getAPourAutresMoyensMilitaireTerreMoyensTriage();

} // TypeTriage
