/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociationEXT;
import mpia.meta.TypeDataTypeAngle;
import mpia.meta.TypeDataTypeLongueur;
import mpia.meta.TypeDataTypeVitesseLineaire;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Demande Engagement Objectif</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeDemandeEngagementObjectif#getUrgenceTir <em>Urgence Tir</em>}</li>
 *   <li>{@link mpia.schema.TypeDemandeEngagementObjectif#getDateEngagement <em>Date Engagement</em>}</li>
 *   <li>{@link mpia.schema.TypeDemandeEngagementObjectif#getDateLimiteEngagement <em>Date Limite Engagement</em>}</li>
 *   <li>{@link mpia.schema.TypeDemandeEngagementObjectif#getMoyensParticuliers <em>Moyens Particuliers</em>}</li>
 *   <li>{@link mpia.schema.TypeDemandeEngagementObjectif#getVitesseVent <em>Vitesse Vent</em>}</li>
 *   <li>{@link mpia.schema.TypeDemandeEngagementObjectif#getDirectionVent <em>Direction Vent</em>}</li>
 *   <li>{@link mpia.schema.TypeDemandeEngagementObjectif#getTrajectoire <em>Trajectoire</em>}</li>
 *   <li>{@link mpia.schema.TypeDemandeEngagementObjectif#getPrecisionLocalisation <em>Precision Localisation</em>}</li>
 *   <li>{@link mpia.schema.TypeDemandeEngagementObjectif#getSourceAcquisition <em>Source Acquisition</em>}</li>
 *   <li>{@link mpia.schema.TypeDemandeEngagementObjectif#getModaliteFinTir <em>Modalite Fin Tir</em>}</li>
 *   <li>{@link mpia.schema.TypeDemandeEngagementObjectif#getDemandeUsageTypeArme <em>Demande Usage Type Arme</em>}</li>
 *   <li>{@link mpia.schema.TypeDemandeEngagementObjectif#getAPourModalitesDeclenchementDeclenchementTir <em>APour Modalites Declenchement Declenchement Tir</em>}</li>
 *   <li>{@link mpia.schema.TypeDemandeEngagementObjectif#getAPourEffetTactiqueEffetTactiqueRecherche <em>APour Effet Tactique Effet Tactique Recherche</em>}</li>
 *   <li>{@link mpia.schema.TypeDemandeEngagementObjectif#getAPourMiseEnPlaceMiseEnPlaceTir <em>APour Mise En Place Mise En Place Tir</em>}</li>
 *   <li>{@link mpia.schema.TypeDemandeEngagementObjectif#getAPourPremieresMunitionsParametresImposes <em>APour Premieres Munitions Parametres Imposes</em>}</li>
 *   <li>{@link mpia.schema.TypeDemandeEngagementObjectif#getAPourSecondesMunitionsParametresImposes <em>APour Secondes Munitions Parametres Imposes</em>}</li>
 *   <li>{@link mpia.schema.TypeDemandeEngagementObjectif#getDoitRespecterZoneSecurite <em>Doit Respecter Zone Securite</em>}</li>
 *   <li>{@link mpia.schema.TypeDemandeEngagementObjectif#getAPourVisibiliteSurObjectifVisibiliteSurObjectif <em>APour Visibilite Sur Objectif Visibilite Sur Objectif</em>}</li>
 *   <li>{@link mpia.schema.TypeDemandeEngagementObjectif#getAPourVolumeSecuriteVolumeSecuriteASS <em>APour Volume Securite Volume Securite ASS</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeDemandeEngagementObjectif()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_DemandeEngagementObjectif' kind='elementOnly'"
 * @generated
 */
public interface TypeDemandeEngagementObjectif extends EObject {
	/**
	 * Returns the value of the '<em><b>Urgence Tir</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPrioriteTir}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Urgence Tir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Urgence Tir</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPrioriteTir
	 * @see #isSetUrgenceTir()
	 * @see #unsetUrgenceTir()
	 * @see #setUrgenceTir(TypeDictionaryDicoPrioriteTir)
	 * @see mpia.schema.SchemaPackage#getTypeDemandeEngagementObjectif_UrgenceTir()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='UrgenceTir'"
	 * @generated
	 */
	TypeDictionaryDicoPrioriteTir getUrgenceTir();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDemandeEngagementObjectif#getUrgenceTir <em>Urgence Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Urgence Tir</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPrioriteTir
	 * @see #isSetUrgenceTir()
	 * @see #unsetUrgenceTir()
	 * @see #getUrgenceTir()
	 * @generated
	 */
	void setUrgenceTir(TypeDictionaryDicoPrioriteTir value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeDemandeEngagementObjectif#getUrgenceTir <em>Urgence Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUrgenceTir()
	 * @see #getUrgenceTir()
	 * @see #setUrgenceTir(TypeDictionaryDicoPrioriteTir)
	 * @generated
	 */
	void unsetUrgenceTir();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeDemandeEngagementObjectif#getUrgenceTir <em>Urgence Tir</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Urgence Tir</em>' attribute is set.
	 * @see #unsetUrgenceTir()
	 * @see #getUrgenceTir()
	 * @see #setUrgenceTir(TypeDictionaryDicoPrioriteTir)
	 * @generated
	 */
	boolean isSetUrgenceTir();

	/**
	 * Returns the value of the '<em><b>Date Engagement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Engagement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Engagement</em>' attribute.
	 * @see #setDateEngagement(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeDemandeEngagementObjectif_DateEngagement()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateEngagement'"
	 * @generated
	 */
	XMLGregorianCalendar getDateEngagement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDemandeEngagementObjectif#getDateEngagement <em>Date Engagement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Engagement</em>' attribute.
	 * @see #getDateEngagement()
	 * @generated
	 */
	void setDateEngagement(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Date Limite Engagement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Limite Engagement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Limite Engagement</em>' attribute.
	 * @see #setDateLimiteEngagement(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeDemandeEngagementObjectif_DateLimiteEngagement()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateLimiteEngagement'"
	 * @generated
	 */
	XMLGregorianCalendar getDateLimiteEngagement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDemandeEngagementObjectif#getDateLimiteEngagement <em>Date Limite Engagement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Limite Engagement</em>' attribute.
	 * @see #getDateLimiteEngagement()
	 * @generated
	 */
	void setDateLimiteEngagement(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Moyens Particuliers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moyens Particuliers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moyens Particuliers</em>' attribute.
	 * @see #setMoyensParticuliers(String)
	 * @see mpia.schema.SchemaPackage#getTypeDemandeEngagementObjectif_MoyensParticuliers()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='MoyensParticuliers'"
	 * @generated
	 */
	String getMoyensParticuliers();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDemandeEngagementObjectif#getMoyensParticuliers <em>Moyens Particuliers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moyens Particuliers</em>' attribute.
	 * @see #getMoyensParticuliers()
	 * @generated
	 */
	void setMoyensParticuliers(String value);

	/**
	 * Returns the value of the '<em><b>Vitesse Vent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vitesse Vent</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vitesse Vent</em>' containment reference.
	 * @see #setVitesseVent(TypeDataTypeVitesseLineaire)
	 * @see mpia.schema.SchemaPackage#getTypeDemandeEngagementObjectif_VitesseVent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VitesseVent'"
	 * @generated
	 */
	TypeDataTypeVitesseLineaire getVitesseVent();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDemandeEngagementObjectif#getVitesseVent <em>Vitesse Vent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vitesse Vent</em>' containment reference.
	 * @see #getVitesseVent()
	 * @generated
	 */
	void setVitesseVent(TypeDataTypeVitesseLineaire value);

	/**
	 * Returns the value of the '<em><b>Direction Vent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction Vent</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction Vent</em>' containment reference.
	 * @see #setDirectionVent(TypeDataTypeAngle)
	 * @see mpia.schema.SchemaPackage#getTypeDemandeEngagementObjectif_DirectionVent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DirectionVent'"
	 * @generated
	 */
	TypeDataTypeAngle getDirectionVent();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDemandeEngagementObjectif#getDirectionVent <em>Direction Vent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction Vent</em>' containment reference.
	 * @see #getDirectionVent()
	 * @generated
	 */
	void setDirectionVent(TypeDataTypeAngle value);

	/**
	 * Returns the value of the '<em><b>Trajectoire</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTrajectoire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trajectoire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trajectoire</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTrajectoire
	 * @see #isSetTrajectoire()
	 * @see #unsetTrajectoire()
	 * @see #setTrajectoire(TypeDictionaryDicoTrajectoire)
	 * @see mpia.schema.SchemaPackage#getTypeDemandeEngagementObjectif_Trajectoire()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Trajectoire'"
	 * @generated
	 */
	TypeDictionaryDicoTrajectoire getTrajectoire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDemandeEngagementObjectif#getTrajectoire <em>Trajectoire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trajectoire</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTrajectoire
	 * @see #isSetTrajectoire()
	 * @see #unsetTrajectoire()
	 * @see #getTrajectoire()
	 * @generated
	 */
	void setTrajectoire(TypeDictionaryDicoTrajectoire value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeDemandeEngagementObjectif#getTrajectoire <em>Trajectoire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTrajectoire()
	 * @see #getTrajectoire()
	 * @see #setTrajectoire(TypeDictionaryDicoTrajectoire)
	 * @generated
	 */
	void unsetTrajectoire();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeDemandeEngagementObjectif#getTrajectoire <em>Trajectoire</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Trajectoire</em>' attribute is set.
	 * @see #unsetTrajectoire()
	 * @see #getTrajectoire()
	 * @see #setTrajectoire(TypeDictionaryDicoTrajectoire)
	 * @generated
	 */
	boolean isSetTrajectoire();

	/**
	 * Returns the value of the '<em><b>Precision Localisation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision Localisation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision Localisation</em>' containment reference.
	 * @see #setPrecisionLocalisation(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeDemandeEngagementObjectif_PrecisionLocalisation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PrecisionLocalisation'"
	 * @generated
	 */
	TypeDataTypeLongueur getPrecisionLocalisation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDemandeEngagementObjectif#getPrecisionLocalisation <em>Precision Localisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision Localisation</em>' containment reference.
	 * @see #getPrecisionLocalisation()
	 * @generated
	 */
	void setPrecisionLocalisation(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Source Acquisition</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeMoyenAcquisitionASS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Acquisition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Acquisition</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeMoyenAcquisitionASS
	 * @see #isSetSourceAcquisition()
	 * @see #unsetSourceAcquisition()
	 * @see #setSourceAcquisition(TypeDictionaryDicoTypeMoyenAcquisitionASS)
	 * @see mpia.schema.SchemaPackage#getTypeDemandeEngagementObjectif_SourceAcquisition()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='SourceAcquisition'"
	 * @generated
	 */
	TypeDictionaryDicoTypeMoyenAcquisitionASS getSourceAcquisition();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDemandeEngagementObjectif#getSourceAcquisition <em>Source Acquisition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Acquisition</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeMoyenAcquisitionASS
	 * @see #isSetSourceAcquisition()
	 * @see #unsetSourceAcquisition()
	 * @see #getSourceAcquisition()
	 * @generated
	 */
	void setSourceAcquisition(TypeDictionaryDicoTypeMoyenAcquisitionASS value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeDemandeEngagementObjectif#getSourceAcquisition <em>Source Acquisition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSourceAcquisition()
	 * @see #getSourceAcquisition()
	 * @see #setSourceAcquisition(TypeDictionaryDicoTypeMoyenAcquisitionASS)
	 * @generated
	 */
	void unsetSourceAcquisition();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeDemandeEngagementObjectif#getSourceAcquisition <em>Source Acquisition</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Source Acquisition</em>' attribute is set.
	 * @see #unsetSourceAcquisition()
	 * @see #getSourceAcquisition()
	 * @see #setSourceAcquisition(TypeDictionaryDicoTypeMoyenAcquisitionASS)
	 * @generated
	 */
	boolean isSetSourceAcquisition();

	/**
	 * Returns the value of the '<em><b>Modalite Fin Tir</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoModaliteFinTir}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modalite Fin Tir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modalite Fin Tir</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoModaliteFinTir
	 * @see #isSetModaliteFinTir()
	 * @see #unsetModaliteFinTir()
	 * @see #setModaliteFinTir(TypeDictionaryDicoModaliteFinTir)
	 * @see mpia.schema.SchemaPackage#getTypeDemandeEngagementObjectif_ModaliteFinTir()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ModaliteFinTir'"
	 * @generated
	 */
	TypeDictionaryDicoModaliteFinTir getModaliteFinTir();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDemandeEngagementObjectif#getModaliteFinTir <em>Modalite Fin Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modalite Fin Tir</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoModaliteFinTir
	 * @see #isSetModaliteFinTir()
	 * @see #unsetModaliteFinTir()
	 * @see #getModaliteFinTir()
	 * @generated
	 */
	void setModaliteFinTir(TypeDictionaryDicoModaliteFinTir value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeDemandeEngagementObjectif#getModaliteFinTir <em>Modalite Fin Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetModaliteFinTir()
	 * @see #getModaliteFinTir()
	 * @see #setModaliteFinTir(TypeDictionaryDicoModaliteFinTir)
	 * @generated
	 */
	void unsetModaliteFinTir();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeDemandeEngagementObjectif#getModaliteFinTir <em>Modalite Fin Tir</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Modalite Fin Tir</em>' attribute is set.
	 * @see #unsetModaliteFinTir()
	 * @see #getModaliteFinTir()
	 * @see #setModaliteFinTir(TypeDictionaryDicoModaliteFinTir)
	 * @generated
	 */
	boolean isSetModaliteFinTir();

	/**
	 * Returns the value of the '<em><b>Demande Usage Type Arme</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Demande Usage Type Arme</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Demande Usage Type Arme</em>' containment reference.
	 * @see #setDemandeUsageTypeArme(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeDemandeEngagementObjectif_DemandeUsageTypeArme()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeArme'"
	 *        extendedMetaData="kind='element' name='DemandeUsage_TypeArme'"
	 * @generated
	 */
	TypeAssociationEXT getDemandeUsageTypeArme();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDemandeEngagementObjectif#getDemandeUsageTypeArme <em>Demande Usage Type Arme</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Demande Usage Type Arme</em>' containment reference.
	 * @see #getDemandeUsageTypeArme()
	 * @generated
	 */
	void setDemandeUsageTypeArme(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>APour Modalites Declenchement Declenchement Tir</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Modalites Declenchement Declenchement Tir</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Modalites Declenchement Declenchement Tir</em>' containment reference.
	 * @see #setAPourModalitesDeclenchementDeclenchementTir(TypeDeclenchementTir)
	 * @see mpia.schema.SchemaPackage#getTypeDemandeEngagementObjectif_APourModalitesDeclenchementDeclenchementTir()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_DeclenchementTir'"
	 *        extendedMetaData="kind='element' name='APourModalitesDeclenchement_DeclenchementTir'"
	 * @generated
	 */
	TypeDeclenchementTir getAPourModalitesDeclenchementDeclenchementTir();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDemandeEngagementObjectif#getAPourModalitesDeclenchementDeclenchementTir <em>APour Modalites Declenchement Declenchement Tir</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Modalites Declenchement Declenchement Tir</em>' containment reference.
	 * @see #getAPourModalitesDeclenchementDeclenchementTir()
	 * @generated
	 */
	void setAPourModalitesDeclenchementDeclenchementTir(TypeDeclenchementTir value);

	/**
	 * Returns the value of the '<em><b>APour Effet Tactique Effet Tactique Recherche</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Effet Tactique Effet Tactique Recherche</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Effet Tactique Effet Tactique Recherche</em>' containment reference.
	 * @see #setAPourEffetTactiqueEffetTactiqueRecherche(TypeEffetTactiqueRecherche)
	 * @see mpia.schema.SchemaPackage#getTypeDemandeEngagementObjectif_APourEffetTactiqueEffetTactiqueRecherche()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_EffetTactiqueRecherche'"
	 *        extendedMetaData="kind='element' name='APourEffetTactique_EffetTactiqueRecherche'"
	 * @generated
	 */
	TypeEffetTactiqueRecherche getAPourEffetTactiqueEffetTactiqueRecherche();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDemandeEngagementObjectif#getAPourEffetTactiqueEffetTactiqueRecherche <em>APour Effet Tactique Effet Tactique Recherche</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Effet Tactique Effet Tactique Recherche</em>' containment reference.
	 * @see #getAPourEffetTactiqueEffetTactiqueRecherche()
	 * @generated
	 */
	void setAPourEffetTactiqueEffetTactiqueRecherche(TypeEffetTactiqueRecherche value);

	/**
	 * Returns the value of the '<em><b>APour Mise En Place Mise En Place Tir</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Mise En Place Mise En Place Tir</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Mise En Place Mise En Place Tir</em>' containment reference.
	 * @see #setAPourMiseEnPlaceMiseEnPlaceTir(TypeMiseEnPlaceTir)
	 * @see mpia.schema.SchemaPackage#getTypeDemandeEngagementObjectif_APourMiseEnPlaceMiseEnPlaceTir()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_MiseEnPlaceTir'"
	 *        extendedMetaData="kind='element' name='APourMiseEnPlace_MiseEnPlaceTir'"
	 * @generated
	 */
	TypeMiseEnPlaceTir getAPourMiseEnPlaceMiseEnPlaceTir();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDemandeEngagementObjectif#getAPourMiseEnPlaceMiseEnPlaceTir <em>APour Mise En Place Mise En Place Tir</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Mise En Place Mise En Place Tir</em>' containment reference.
	 * @see #getAPourMiseEnPlaceMiseEnPlaceTir()
	 * @generated
	 */
	void setAPourMiseEnPlaceMiseEnPlaceTir(TypeMiseEnPlaceTir value);

	/**
	 * Returns the value of the '<em><b>APour Premieres Munitions Parametres Imposes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Premieres Munitions Parametres Imposes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Premieres Munitions Parametres Imposes</em>' containment reference.
	 * @see #setAPourPremieresMunitionsParametresImposes(TypeParametresImposes)
	 * @see mpia.schema.SchemaPackage#getTypeDemandeEngagementObjectif_APourPremieresMunitionsParametresImposes()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ParametresImposes'"
	 *        extendedMetaData="kind='element' name='APourPremieresMunitions_ParametresImposes'"
	 * @generated
	 */
	TypeParametresImposes getAPourPremieresMunitionsParametresImposes();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDemandeEngagementObjectif#getAPourPremieresMunitionsParametresImposes <em>APour Premieres Munitions Parametres Imposes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Premieres Munitions Parametres Imposes</em>' containment reference.
	 * @see #getAPourPremieresMunitionsParametresImposes()
	 * @generated
	 */
	void setAPourPremieresMunitionsParametresImposes(TypeParametresImposes value);

	/**
	 * Returns the value of the '<em><b>APour Secondes Munitions Parametres Imposes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Secondes Munitions Parametres Imposes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Secondes Munitions Parametres Imposes</em>' containment reference.
	 * @see #setAPourSecondesMunitionsParametresImposes(TypeParametresImposes)
	 * @see mpia.schema.SchemaPackage#getTypeDemandeEngagementObjectif_APourSecondesMunitionsParametresImposes()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ParametresImposes'"
	 *        extendedMetaData="kind='element' name='APourSecondesMunitions_ParametresImposes'"
	 * @generated
	 */
	TypeParametresImposes getAPourSecondesMunitionsParametresImposes();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDemandeEngagementObjectif#getAPourSecondesMunitionsParametresImposes <em>APour Secondes Munitions Parametres Imposes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Secondes Munitions Parametres Imposes</em>' containment reference.
	 * @see #getAPourSecondesMunitionsParametresImposes()
	 * @generated
	 */
	void setAPourSecondesMunitionsParametresImposes(TypeParametresImposes value);

	/**
	 * Returns the value of the '<em><b>Doit Respecter Zone Securite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeZoneSecurite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Doit Respecter Zone Securite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doit Respecter Zone Securite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeDemandeEngagementObjectif_DoitRespecterZoneSecurite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ZoneSecurite'"
	 *        extendedMetaData="kind='element' name='DoitRespecter_ZoneSecurite'"
	 * @generated
	 */
	EList<TypeZoneSecurite> getDoitRespecterZoneSecurite();

	/**
	 * Returns the value of the '<em><b>APour Visibilite Sur Objectif Visibilite Sur Objectif</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Visibilite Sur Objectif Visibilite Sur Objectif</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Visibilite Sur Objectif Visibilite Sur Objectif</em>' containment reference.
	 * @see #setAPourVisibiliteSurObjectifVisibiliteSurObjectif(TypeVisibiliteSurObjectif)
	 * @see mpia.schema.SchemaPackage#getTypeDemandeEngagementObjectif_APourVisibiliteSurObjectifVisibiliteSurObjectif()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_VisibiliteSurObjectif'"
	 *        extendedMetaData="kind='element' name='APourVisibiliteSurObjectif_VisibiliteSurObjectif'"
	 * @generated
	 */
	TypeVisibiliteSurObjectif getAPourVisibiliteSurObjectifVisibiliteSurObjectif();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDemandeEngagementObjectif#getAPourVisibiliteSurObjectifVisibiliteSurObjectif <em>APour Visibilite Sur Objectif Visibilite Sur Objectif</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Visibilite Sur Objectif Visibilite Sur Objectif</em>' containment reference.
	 * @see #getAPourVisibiliteSurObjectifVisibiliteSurObjectif()
	 * @generated
	 */
	void setAPourVisibiliteSurObjectifVisibiliteSurObjectif(TypeVisibiliteSurObjectif value);

	/**
	 * Returns the value of the '<em><b>APour Volume Securite Volume Securite ASS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Volume Securite Volume Securite ASS</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Volume Securite Volume Securite ASS</em>' containment reference.
	 * @see #setAPourVolumeSecuriteVolumeSecuriteASS(TypeVolumeSecuriteASS)
	 * @see mpia.schema.SchemaPackage#getTypeDemandeEngagementObjectif_APourVolumeSecuriteVolumeSecuriteASS()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_VolumeSecuriteASS'"
	 *        extendedMetaData="kind='element' name='APourVolumeSecurite_VolumeSecuriteASS'"
	 * @generated
	 */
	TypeVolumeSecuriteASS getAPourVolumeSecuriteVolumeSecuriteASS();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDemandeEngagementObjectif#getAPourVolumeSecuriteVolumeSecuriteASS <em>APour Volume Securite Volume Securite ASS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Volume Securite Volume Securite ASS</em>' containment reference.
	 * @see #getAPourVolumeSecuriteVolumeSecuriteASS()
	 * @generated
	 */
	void setAPourVolumeSecuriteVolumeSecuriteASS(TypeVolumeSecuriteASS value);

} // TypeDemandeEngagementObjectif
