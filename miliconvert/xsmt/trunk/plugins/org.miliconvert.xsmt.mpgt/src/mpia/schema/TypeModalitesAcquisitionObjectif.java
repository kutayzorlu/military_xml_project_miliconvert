/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;
import mpia.meta.TypeDataTypeLongueur;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Modalites Acquisition Objectif</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeModalitesAcquisitionObjectif#getDateAquisition <em>Date Aquisition</em>}</li>
 *   <li>{@link mpia.schema.TypeModalitesAcquisitionObjectif#getNombreMinimumCRaTransmettre <em>Nombre Minimum CRa Transmettre</em>}</li>
 *   <li>{@link mpia.schema.TypeModalitesAcquisitionObjectif#getPrecisionLocalisationDemandee <em>Precision Localisation Demandee</em>}</li>
 *   <li>{@link mpia.schema.TypeModalitesAcquisitionObjectif#getFiabiliteIdentification <em>Fiabilite Identification</em>}</li>
 *   <li>{@link mpia.schema.TypeModalitesAcquisitionObjectif#getAutresMesuresCoordination <em>Autres Mesures Coordination</em>}</li>
 *   <li>{@link mpia.schema.TypeModalitesAcquisitionObjectif#getAPourZoneRechercheAutreElementControle <em>APour Zone Recherche Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeModalitesAcquisitionObjectif#getAPourConditionsEngagementEngagementAvecDelegation <em>APour Conditions Engagement Engagement Avec Delegation</em>}</li>
 *   <li>{@link mpia.schema.TypeModalitesAcquisitionObjectif#getAPourResponsableSynthesesUnite <em>APour Responsable Syntheses Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeModalitesAcquisitionObjectif()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_ModalitesAcquisitionObjectif' kind='elementOnly'"
 * @generated
 */
public interface TypeModalitesAcquisitionObjectif extends EObject {
	/**
	 * Returns the value of the '<em><b>Date Aquisition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Aquisition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Aquisition</em>' attribute.
	 * @see #setDateAquisition(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeModalitesAcquisitionObjectif_DateAquisition()
	 * @model dataType="mpia.meta.TypeDataTypeGDH" required="true"
	 *        extendedMetaData="kind='element' name='DateAquisition'"
	 * @generated
	 */
	XMLGregorianCalendar getDateAquisition();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModalitesAcquisitionObjectif#getDateAquisition <em>Date Aquisition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Aquisition</em>' attribute.
	 * @see #getDateAquisition()
	 * @generated
	 */
	void setDateAquisition(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Nombre Minimum CRa Transmettre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Minimum CRa Transmettre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Minimum CRa Transmettre</em>' attribute.
	 * @see #isSetNombreMinimumCRaTransmettre()
	 * @see #unsetNombreMinimumCRaTransmettre()
	 * @see #setNombreMinimumCRaTransmettre(long)
	 * @see mpia.schema.SchemaPackage#getTypeModalitesAcquisitionObjectif_NombreMinimumCRaTransmettre()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3" required="true"
	 *        extendedMetaData="kind='element' name='NombreMinimumCRaTransmettre'"
	 * @generated
	 */
	long getNombreMinimumCRaTransmettre();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModalitesAcquisitionObjectif#getNombreMinimumCRaTransmettre <em>Nombre Minimum CRa Transmettre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Minimum CRa Transmettre</em>' attribute.
	 * @see #isSetNombreMinimumCRaTransmettre()
	 * @see #unsetNombreMinimumCRaTransmettre()
	 * @see #getNombreMinimumCRaTransmettre()
	 * @generated
	 */
	void setNombreMinimumCRaTransmettre(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeModalitesAcquisitionObjectif#getNombreMinimumCRaTransmettre <em>Nombre Minimum CRa Transmettre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreMinimumCRaTransmettre()
	 * @see #getNombreMinimumCRaTransmettre()
	 * @see #setNombreMinimumCRaTransmettre(long)
	 * @generated
	 */
	void unsetNombreMinimumCRaTransmettre();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeModalitesAcquisitionObjectif#getNombreMinimumCRaTransmettre <em>Nombre Minimum CRa Transmettre</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Minimum CRa Transmettre</em>' attribute is set.
	 * @see #unsetNombreMinimumCRaTransmettre()
	 * @see #getNombreMinimumCRaTransmettre()
	 * @see #setNombreMinimumCRaTransmettre(long)
	 * @generated
	 */
	boolean isSetNombreMinimumCRaTransmettre();

	/**
	 * Returns the value of the '<em><b>Precision Localisation Demandee</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision Localisation Demandee</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision Localisation Demandee</em>' containment reference.
	 * @see #setPrecisionLocalisationDemandee(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeModalitesAcquisitionObjectif_PrecisionLocalisationDemandee()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PrecisionLocalisationDemandee'"
	 * @generated
	 */
	TypeDataTypeLongueur getPrecisionLocalisationDemandee();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModalitesAcquisitionObjectif#getPrecisionLocalisationDemandee <em>Precision Localisation Demandee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision Localisation Demandee</em>' containment reference.
	 * @see #getPrecisionLocalisationDemandee()
	 * @generated
	 */
	void setPrecisionLocalisationDemandee(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Fiabilite Identification</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoRapportExactitude}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fiabilite Identification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fiabilite Identification</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoRapportExactitude
	 * @see #isSetFiabiliteIdentification()
	 * @see #unsetFiabiliteIdentification()
	 * @see #setFiabiliteIdentification(TypeDictionaryDicoRapportExactitude)
	 * @see mpia.schema.SchemaPackage#getTypeModalitesAcquisitionObjectif_FiabiliteIdentification()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='FiabiliteIdentification'"
	 * @generated
	 */
	TypeDictionaryDicoRapportExactitude getFiabiliteIdentification();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModalitesAcquisitionObjectif#getFiabiliteIdentification <em>Fiabilite Identification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fiabilite Identification</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoRapportExactitude
	 * @see #isSetFiabiliteIdentification()
	 * @see #unsetFiabiliteIdentification()
	 * @see #getFiabiliteIdentification()
	 * @generated
	 */
	void setFiabiliteIdentification(TypeDictionaryDicoRapportExactitude value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeModalitesAcquisitionObjectif#getFiabiliteIdentification <em>Fiabilite Identification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFiabiliteIdentification()
	 * @see #getFiabiliteIdentification()
	 * @see #setFiabiliteIdentification(TypeDictionaryDicoRapportExactitude)
	 * @generated
	 */
	void unsetFiabiliteIdentification();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeModalitesAcquisitionObjectif#getFiabiliteIdentification <em>Fiabilite Identification</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fiabilite Identification</em>' attribute is set.
	 * @see #unsetFiabiliteIdentification()
	 * @see #getFiabiliteIdentification()
	 * @see #setFiabiliteIdentification(TypeDictionaryDicoRapportExactitude)
	 * @generated
	 */
	boolean isSetFiabiliteIdentification();

	/**
	 * Returns the value of the '<em><b>Autres Mesures Coordination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autres Mesures Coordination</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autres Mesures Coordination</em>' attribute.
	 * @see #setAutresMesuresCoordination(String)
	 * @see mpia.schema.SchemaPackage#getTypeModalitesAcquisitionObjectif_AutresMesuresCoordination()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='AutresMesuresCoordination'"
	 * @generated
	 */
	String getAutresMesuresCoordination();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModalitesAcquisitionObjectif#getAutresMesuresCoordination <em>Autres Mesures Coordination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autres Mesures Coordination</em>' attribute.
	 * @see #getAutresMesuresCoordination()
	 * @generated
	 */
	void setAutresMesuresCoordination(String value);

	/**
	 * Returns the value of the '<em><b>APour Zone Recherche Autre Element Controle</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Zone Recherche Autre Element Controle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Zone Recherche Autre Element Controle</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeModalitesAcquisitionObjectif_APourZoneRechercheAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='APourZoneRecherche_AutreElementControle'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourZoneRechercheAutreElementControle();

	/**
	 * Returns the value of the '<em><b>APour Conditions Engagement Engagement Avec Delegation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Conditions Engagement Engagement Avec Delegation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Conditions Engagement Engagement Avec Delegation</em>' containment reference.
	 * @see #setAPourConditionsEngagementEngagementAvecDelegation(TypeEngagementAvecDelegation)
	 * @see mpia.schema.SchemaPackage#getTypeModalitesAcquisitionObjectif_APourConditionsEngagementEngagementAvecDelegation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_EngagementAvecDelegation'"
	 *        extendedMetaData="kind='element' name='APourConditionsEngagement_EngagementAvecDelegation'"
	 * @generated
	 */
	TypeEngagementAvecDelegation getAPourConditionsEngagementEngagementAvecDelegation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModalitesAcquisitionObjectif#getAPourConditionsEngagementEngagementAvecDelegation <em>APour Conditions Engagement Engagement Avec Delegation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Conditions Engagement Engagement Avec Delegation</em>' containment reference.
	 * @see #getAPourConditionsEngagementEngagementAvecDelegation()
	 * @generated
	 */
	void setAPourConditionsEngagementEngagementAvecDelegation(TypeEngagementAvecDelegation value);

	/**
	 * Returns the value of the '<em><b>APour Responsable Syntheses Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Responsable Syntheses Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Responsable Syntheses Unite</em>' containment reference.
	 * @see #setAPourResponsableSynthesesUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeModalitesAcquisitionObjectif_APourResponsableSynthesesUnite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourResponsableSyntheses_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getAPourResponsableSynthesesUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModalitesAcquisitionObjectif#getAPourResponsableSynthesesUnite <em>APour Responsable Syntheses Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Responsable Syntheses Unite</em>' containment reference.
	 * @see #getAPourResponsableSynthesesUnite()
	 * @generated
	 */
	void setAPourResponsableSynthesesUnite(TypeAssociationEXT value);

} // TypeModalitesAcquisitionObjectif
