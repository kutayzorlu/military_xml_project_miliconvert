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
 * A representation of the model object '<em><b>Type Travail Genie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeTravailGenie#getSerieTravail <em>Serie Travail</em>}</li>
 *   <li>{@link mpia.schema.TypeTravailGenie#getNiveauPlanification <em>Niveau Planification</em>}</li>
 *   <li>{@link mpia.schema.TypeTravailGenie#getConditionDeMiseEnOeuvre <em>Condition De Mise En Oeuvre</em>}</li>
 *   <li>{@link mpia.schema.TypeTravailGenie#getDateDebut <em>Date Debut</em>}</li>
 *   <li>{@link mpia.schema.TypeTravailGenie#getDateFinEstimee <em>Date Fin Estimee</em>}</li>
 *   <li>{@link mpia.schema.TypeTravailGenie#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeTravailGenie#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeTravailGenie#getAPourTravailAideDeploiementTravailAideDeploiement <em>APour Travail Aide Deploiement Travail Aide Deploiement</em>}</li>
 *   <li>{@link mpia.schema.TypeTravailGenie#getAPourOuvrageOrganisationOuvrageGenie <em>APour Ouvrage Organisation Ouvrage Genie</em>}</li>
 *   <li>{@link mpia.schema.TypeTravailGenie#getAPourObstacleObstacle <em>APour Obstacle Obstacle</em>}</li>
 *   <li>{@link mpia.schema.TypeTravailGenie#getAPourMoyensGenieMoyensGenie <em>APour Moyens Genie Moyens Genie</em>}</li>
 *   <li>{@link mpia.schema.TypeTravailGenie#getADonnelieuCRAvancementAvancementTravailGenie <em>ADonnelieu CR Avancement Avancement Travail Genie</em>}</li>
 *   <li>{@link mpia.schema.TypeTravailGenie#getAConsommeQuantiteConsommee <em>AConsomme Quantite Consommee</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeTravailGenie()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_TravailGenie' kind='elementOnly'"
 * @generated
 */
public interface TypeTravailGenie extends EObject {
	/**
	 * Returns the value of the '<em><b>Serie Travail</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPlanSerieTravail}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serie Travail</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serie Travail</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPlanSerieTravail
	 * @see #isSetSerieTravail()
	 * @see #unsetSerieTravail()
	 * @see #setSerieTravail(TypeDictionaryDicoPlanSerieTravail)
	 * @see mpia.schema.SchemaPackage#getTypeTravailGenie_SerieTravail()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='SerieTravail'"
	 * @generated
	 */
	TypeDictionaryDicoPlanSerieTravail getSerieTravail();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTravailGenie#getSerieTravail <em>Serie Travail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serie Travail</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPlanSerieTravail
	 * @see #isSetSerieTravail()
	 * @see #unsetSerieTravail()
	 * @see #getSerieTravail()
	 * @generated
	 */
	void setSerieTravail(TypeDictionaryDicoPlanSerieTravail value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTravailGenie#getSerieTravail <em>Serie Travail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSerieTravail()
	 * @see #getSerieTravail()
	 * @see #setSerieTravail(TypeDictionaryDicoPlanSerieTravail)
	 * @generated
	 */
	void unsetSerieTravail();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTravailGenie#getSerieTravail <em>Serie Travail</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Serie Travail</em>' attribute is set.
	 * @see #unsetSerieTravail()
	 * @see #getSerieTravail()
	 * @see #setSerieTravail(TypeDictionaryDicoPlanSerieTravail)
	 * @generated
	 */
	boolean isSetSerieTravail();

	/**
	 * Returns the value of the '<em><b>Niveau Planification</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPlanNiveauPlanification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Niveau Planification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Niveau Planification</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPlanNiveauPlanification
	 * @see #isSetNiveauPlanification()
	 * @see #unsetNiveauPlanification()
	 * @see #setNiveauPlanification(TypeDictionaryDicoPlanNiveauPlanification)
	 * @see mpia.schema.SchemaPackage#getTypeTravailGenie_NiveauPlanification()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='NiveauPlanification'"
	 * @generated
	 */
	TypeDictionaryDicoPlanNiveauPlanification getNiveauPlanification();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTravailGenie#getNiveauPlanification <em>Niveau Planification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Niveau Planification</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPlanNiveauPlanification
	 * @see #isSetNiveauPlanification()
	 * @see #unsetNiveauPlanification()
	 * @see #getNiveauPlanification()
	 * @generated
	 */
	void setNiveauPlanification(TypeDictionaryDicoPlanNiveauPlanification value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTravailGenie#getNiveauPlanification <em>Niveau Planification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNiveauPlanification()
	 * @see #getNiveauPlanification()
	 * @see #setNiveauPlanification(TypeDictionaryDicoPlanNiveauPlanification)
	 * @generated
	 */
	void unsetNiveauPlanification();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTravailGenie#getNiveauPlanification <em>Niveau Planification</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Niveau Planification</em>' attribute is set.
	 * @see #unsetNiveauPlanification()
	 * @see #getNiveauPlanification()
	 * @see #setNiveauPlanification(TypeDictionaryDicoPlanNiveauPlanification)
	 * @generated
	 */
	boolean isSetNiveauPlanification();

	/**
	 * Returns the value of the '<em><b>Condition De Mise En Oeuvre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition De Mise En Oeuvre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition De Mise En Oeuvre</em>' attribute.
	 * @see #setConditionDeMiseEnOeuvre(String)
	 * @see mpia.schema.SchemaPackage#getTypeTravailGenie_ConditionDeMiseEnOeuvre()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='ConditionDeMiseEnOeuvre'"
	 * @generated
	 */
	String getConditionDeMiseEnOeuvre();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTravailGenie#getConditionDeMiseEnOeuvre <em>Condition De Mise En Oeuvre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition De Mise En Oeuvre</em>' attribute.
	 * @see #getConditionDeMiseEnOeuvre()
	 * @generated
	 */
	void setConditionDeMiseEnOeuvre(String value);

	/**
	 * Returns the value of the '<em><b>Date Debut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Debut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Debut</em>' attribute.
	 * @see #setDateDebut(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeTravailGenie_DateDebut()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateDebut'"
	 * @generated
	 */
	XMLGregorianCalendar getDateDebut();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTravailGenie#getDateDebut <em>Date Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Debut</em>' attribute.
	 * @see #getDateDebut()
	 * @generated
	 */
	void setDateDebut(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Date Fin Estimee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Fin Estimee</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Fin Estimee</em>' attribute.
	 * @see #setDateFinEstimee(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeTravailGenie_DateFinEstimee()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateFinEstimee'"
	 * @generated
	 */
	XMLGregorianCalendar getDateFinEstimee();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTravailGenie#getDateFinEstimee <em>Date Fin Estimee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Fin Estimee</em>' attribute.
	 * @see #getDateFinEstimee()
	 * @generated
	 */
	void setDateFinEstimee(XMLGregorianCalendar value);

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
	 * @see mpia.schema.SchemaPackage#getTypeTravailGenie_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTravailGenie#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeTravailGenie_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTravailGenie#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>APour Travail Aide Deploiement Travail Aide Deploiement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Travail Aide Deploiement Travail Aide Deploiement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Travail Aide Deploiement Travail Aide Deploiement</em>' containment reference.
	 * @see #setAPourTravailAideDeploiementTravailAideDeploiement(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeTravailGenie_APourTravailAideDeploiementTravailAideDeploiement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TravailAideDeploiement'"
	 *        extendedMetaData="kind='element' name='APourTravailAideDeploiement_TravailAideDeploiement'"
	 * @generated
	 */
	TypeAssociation getAPourTravailAideDeploiementTravailAideDeploiement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTravailGenie#getAPourTravailAideDeploiementTravailAideDeploiement <em>APour Travail Aide Deploiement Travail Aide Deploiement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Travail Aide Deploiement Travail Aide Deploiement</em>' containment reference.
	 * @see #getAPourTravailAideDeploiementTravailAideDeploiement()
	 * @generated
	 */
	void setAPourTravailAideDeploiementTravailAideDeploiement(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Ouvrage Organisation Ouvrage Genie</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Ouvrage Organisation Ouvrage Genie</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Ouvrage Organisation Ouvrage Genie</em>' containment reference.
	 * @see #setAPourOuvrageOrganisationOuvrageGenie(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeTravailGenie_APourOuvrageOrganisationOuvrageGenie()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_OuvrageGenie'"
	 *        extendedMetaData="kind='element' name='APourOuvrageOrganisation_OuvrageGenie'"
	 * @generated
	 */
	TypeAssociation getAPourOuvrageOrganisationOuvrageGenie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTravailGenie#getAPourOuvrageOrganisationOuvrageGenie <em>APour Ouvrage Organisation Ouvrage Genie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Ouvrage Organisation Ouvrage Genie</em>' containment reference.
	 * @see #getAPourOuvrageOrganisationOuvrageGenie()
	 * @generated
	 */
	void setAPourOuvrageOrganisationOuvrageGenie(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Obstacle Obstacle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Obstacle Obstacle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Obstacle Obstacle</em>' containment reference.
	 * @see #setAPourObstacleObstacle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeTravailGenie_APourObstacleObstacle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Obstacle'"
	 *        extendedMetaData="kind='element' name='APourObstacle_Obstacle'"
	 * @generated
	 */
	TypeAssociation getAPourObstacleObstacle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTravailGenie#getAPourObstacleObstacle <em>APour Obstacle Obstacle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Obstacle Obstacle</em>' containment reference.
	 * @see #getAPourObstacleObstacle()
	 * @generated
	 */
	void setAPourObstacleObstacle(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Moyens Genie Moyens Genie</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Moyens Genie Moyens Genie</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Moyens Genie Moyens Genie</em>' containment reference.
	 * @see #setAPourMoyensGenieMoyensGenie(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeTravailGenie_APourMoyensGenieMoyensGenie()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_MoyensGenie'"
	 *        extendedMetaData="kind='element' name='APourMoyensGenie_MoyensGenie'"
	 * @generated
	 */
	TypeAssociation getAPourMoyensGenieMoyensGenie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTravailGenie#getAPourMoyensGenieMoyensGenie <em>APour Moyens Genie Moyens Genie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Moyens Genie Moyens Genie</em>' containment reference.
	 * @see #getAPourMoyensGenieMoyensGenie()
	 * @generated
	 */
	void setAPourMoyensGenieMoyensGenie(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>ADonnelieu CR Avancement Avancement Travail Genie</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAvancementTravailGenie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ADonnelieu CR Avancement Avancement Travail Genie</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ADonnelieu CR Avancement Avancement Travail Genie</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeTravailGenie_ADonnelieuCRAvancementAvancementTravailGenie()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_AvancementTravailGenie'"
	 *        extendedMetaData="kind='element' name='ADonnelieuCRAvancement_AvancementTravailGenie'"
	 * @generated
	 */
	EList<TypeAvancementTravailGenie> getADonnelieuCRAvancementAvancementTravailGenie();

	/**
	 * Returns the value of the '<em><b>AConsomme Quantite Consommee</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeQuantiteConsommee}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AConsomme Quantite Consommee</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AConsomme Quantite Consommee</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeTravailGenie_AConsommeQuantiteConsommee()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_QuantiteConsommee'"
	 *        extendedMetaData="kind='element' name='AConsomme_QuantiteConsommee'"
	 * @generated
	 */
	EList<TypeQuantiteConsommee> getAConsommeQuantiteConsommee();

} // TypeTravailGenie
