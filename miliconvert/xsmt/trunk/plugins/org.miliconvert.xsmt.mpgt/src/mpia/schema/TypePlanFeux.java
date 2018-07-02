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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Plan Feux</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypePlanFeux#getEtatPlanification <em>Etat Planification</em>}</li>
 *   <li>{@link mpia.schema.TypePlanFeux#getEvaluationPlan <em>Evaluation Plan</em>}</li>
 *   <li>{@link mpia.schema.TypePlanFeux#getDebutActivation <em>Debut Activation</em>}</li>
 *   <li>{@link mpia.schema.TypePlanFeux#getFinActivation <em>Fin Activation</em>}</li>
 *   <li>{@link mpia.schema.TypePlanFeux#getHeureH <em>Heure H</em>}</li>
 *   <li>{@link mpia.schema.TypePlanFeux#getEstObjetAssociationMesureCoordinationPlanFeux <em>Est Objet Association Mesure Coordination Plan Feux</em>}</li>
 *   <li>{@link mpia.schema.TypePlanFeux#getAPourCompteRenduCRplanFeux <em>APour Compte Rendu CRplan Feux</em>}</li>
 *   <li>{@link mpia.schema.TypePlanFeux#getAPourListesObjectifsCandidatsListeObjectifsCandidats <em>APour Listes Objectifs Candidats Liste Objectifs Candidats</em>}</li>
 *   <li>{@link mpia.schema.TypePlanFeux#getAPourZonesObjectifsAutreElementControle <em>APour Zones Objectifs Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypePlanFeux#getAPourListesObjectifsPlanifiesListeObjectifsPlanifies <em>APour Listes Objectifs Planifies Liste Objectifs Planifies</em>}</li>
 *   <li>{@link mpia.schema.TypePlanFeux#getAPourParticipantsUniteParticipante <em>APour Participants Unite Participante</em>}</li>
 *   <li>{@link mpia.schema.TypePlanFeux#getPrevoitReservationUnite <em>Prevoit Reservation Unite</em>}</li>
 *   <li>{@link mpia.schema.TypePlanFeux#getEstObjetAssociationUnitePlanFeux <em>Est Objet Association Unite Plan Feux</em>}</li>
 *   <li>{@link mpia.schema.TypePlanFeux#getAPourBilanTirsASSassocieBilanTirsASS <em>APour Bilan Tirs AS Sassocie Bilan Tirs ASS</em>}</li>
 *   <li>{@link mpia.schema.TypePlanFeux#getAPourInterventionGeneraleInterventionGenerale <em>APour Intervention Generale Intervention Generale</em>}</li>
 *   <li>{@link mpia.schema.TypePlanFeux#getAPourPolitiqueTirPolitiqueTir <em>APour Politique Tir Politique Tir</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypePlanFeux()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_PlanFeux' kind='elementOnly'"
 * @generated
 */
public interface TypePlanFeux extends TypeActivite {
	/**
	 * Returns the value of the '<em><b>Etat Planification</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPlanFeuxEtatPlanification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat Planification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat Planification</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPlanFeuxEtatPlanification
	 * @see #isSetEtatPlanification()
	 * @see #unsetEtatPlanification()
	 * @see #setEtatPlanification(TypeDictionaryDicoPlanFeuxEtatPlanification)
	 * @see mpia.schema.SchemaPackage#getTypePlanFeux_EtatPlanification()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='EtatPlanification'"
	 * @generated
	 */
	TypeDictionaryDicoPlanFeuxEtatPlanification getEtatPlanification();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePlanFeux#getEtatPlanification <em>Etat Planification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat Planification</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPlanFeuxEtatPlanification
	 * @see #isSetEtatPlanification()
	 * @see #unsetEtatPlanification()
	 * @see #getEtatPlanification()
	 * @generated
	 */
	void setEtatPlanification(TypeDictionaryDicoPlanFeuxEtatPlanification value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePlanFeux#getEtatPlanification <em>Etat Planification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEtatPlanification()
	 * @see #getEtatPlanification()
	 * @see #setEtatPlanification(TypeDictionaryDicoPlanFeuxEtatPlanification)
	 * @generated
	 */
	void unsetEtatPlanification();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePlanFeux#getEtatPlanification <em>Etat Planification</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Etat Planification</em>' attribute is set.
	 * @see #unsetEtatPlanification()
	 * @see #getEtatPlanification()
	 * @see #setEtatPlanification(TypeDictionaryDicoPlanFeuxEtatPlanification)
	 * @generated
	 */
	boolean isSetEtatPlanification();

	/**
	 * Returns the value of the '<em><b>Evaluation Plan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluation Plan</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluation Plan</em>' attribute.
	 * @see #setEvaluationPlan(String)
	 * @see mpia.schema.SchemaPackage#getTypePlanFeux_EvaluationPlan()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='EvaluationPlan'"
	 * @generated
	 */
	String getEvaluationPlan();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePlanFeux#getEvaluationPlan <em>Evaluation Plan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evaluation Plan</em>' attribute.
	 * @see #getEvaluationPlan()
	 * @generated
	 */
	void setEvaluationPlan(String value);

	/**
	 * Returns the value of the '<em><b>Debut Activation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Debut Activation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debut Activation</em>' attribute.
	 * @see #setDebutActivation(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypePlanFeux_DebutActivation()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DebutActivation'"
	 * @generated
	 */
	XMLGregorianCalendar getDebutActivation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePlanFeux#getDebutActivation <em>Debut Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debut Activation</em>' attribute.
	 * @see #getDebutActivation()
	 * @generated
	 */
	void setDebutActivation(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Fin Activation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fin Activation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin Activation</em>' attribute.
	 * @see #setFinActivation(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypePlanFeux_FinActivation()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='FinActivation'"
	 * @generated
	 */
	XMLGregorianCalendar getFinActivation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePlanFeux#getFinActivation <em>Fin Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin Activation</em>' attribute.
	 * @see #getFinActivation()
	 * @generated
	 */
	void setFinActivation(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Heure H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heure H</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heure H</em>' attribute.
	 * @see #setHeureH(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypePlanFeux_HeureH()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='HeureH'"
	 * @generated
	 */
	XMLGregorianCalendar getHeureH();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePlanFeux#getHeureH <em>Heure H</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heure H</em>' attribute.
	 * @see #getHeureH()
	 * @generated
	 */
	void setHeureH(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Est Objet Association Mesure Coordination Plan Feux</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Mesure Coordination Plan Feux</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Mesure Coordination Plan Feux</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePlanFeux_EstObjetAssociationMesureCoordinationPlanFeux()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_PlanFeux' target_entity='type_AssociationMesureCoordinationPlanFeux'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationMesureCoordinationPlanFeux'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationMesureCoordinationPlanFeux();

	/**
	 * Returns the value of the '<em><b>APour Compte Rendu CRplan Feux</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeCRplanFeux}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Compte Rendu CRplan Feux</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Compte Rendu CRplan Feux</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePlanFeux_APourCompteRenduCRplanFeux()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_CRplanFeux'"
	 *        extendedMetaData="kind='element' name='APourCompteRendu_CRplanFeux'"
	 * @generated
	 */
	EList<TypeCRplanFeux> getAPourCompteRenduCRplanFeux();

	/**
	 * Returns the value of the '<em><b>APour Listes Objectifs Candidats Liste Objectifs Candidats</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Listes Objectifs Candidats Liste Objectifs Candidats</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Listes Objectifs Candidats Liste Objectifs Candidats</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePlanFeux_APourListesObjectifsCandidatsListeObjectifsCandidats()
	 * @model containment="true" upper="2"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstDefinieDansCadre_PlanFeux' target_entity='type_ListeObjectifsCandidats'"
	 *        extendedMetaData="kind='element' name='APourListesObjectifsCandidats_ListeObjectifsCandidats'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourListesObjectifsCandidatsListeObjectifsCandidats();

	/**
	 * Returns the value of the '<em><b>APour Zones Objectifs Autre Element Controle</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Zones Objectifs Autre Element Controle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Zones Objectifs Autre Element Controle</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePlanFeux_APourZonesObjectifsAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='APourZonesObjectifs_AutreElementControle'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourZonesObjectifsAutreElementControle();

	/**
	 * Returns the value of the '<em><b>APour Listes Objectifs Planifies Liste Objectifs Planifies</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Listes Objectifs Planifies Liste Objectifs Planifies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Listes Objectifs Planifies Liste Objectifs Planifies</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePlanFeux_APourListesObjectifsPlanifiesListeObjectifsPlanifies()
	 * @model containment="true" upper="2"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstDefinieDansCadre_PlanFeux' target_entity='type_ListeObjectifsPlanifies'"
	 *        extendedMetaData="kind='element' name='APourListesObjectifsPlanifies_ListeObjectifsPlanifies'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourListesObjectifsPlanifiesListeObjectifsPlanifies();

	/**
	 * Returns the value of the '<em><b>APour Participants Unite Participante</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeUniteParticipante}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Participants Unite Participante</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Participants Unite Participante</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePlanFeux_APourParticipantsUniteParticipante()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_UniteParticipante'"
	 *        extendedMetaData="kind='element' name='APourParticipants_UniteParticipante'"
	 * @generated
	 */
	EList<TypeUniteParticipante> getAPourParticipantsUniteParticipante();

	/**
	 * Returns the value of the '<em><b>Prevoit Reservation Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prevoit Reservation Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prevoit Reservation Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePlanFeux_PrevoitReservationUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstPrevuePar_PlanFeux' target_entity='type_ReservationUnite'"
	 *        extendedMetaData="kind='element' name='Prevoit_ReservationUnite'"
	 * @generated
	 */
	EList<TypeAssociation> getPrevoitReservationUnite();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Unite Plan Feux</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Unite Plan Feux</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Unite Plan Feux</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePlanFeux_EstObjetAssociationUnitePlanFeux()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_PlanFeux' target_entity='type_AssociationUnitePlanFeux'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationUnitePlanFeux'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationUnitePlanFeux();

	/**
	 * Returns the value of the '<em><b>APour Bilan Tirs AS Sassocie Bilan Tirs ASS</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Bilan Tirs AS Sassocie Bilan Tirs ASS</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Bilan Tirs AS Sassocie Bilan Tirs ASS</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePlanFeux_APourBilanTirsASSassocieBilanTirsASS()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='Concerne_PlanFeux' target_entity='type_BilanTirsASS'"
	 *        extendedMetaData="kind='element' name='APourBilanTirsASSassocie_BilanTirsASS'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourBilanTirsASSassocieBilanTirsASS();

	/**
	 * Returns the value of the '<em><b>APour Intervention Generale Intervention Generale</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Intervention Generale Intervention Generale</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Intervention Generale Intervention Generale</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePlanFeux_APourInterventionGeneraleInterventionGenerale()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='ConcernePlanFeux_PlanFeux' target_entity='type_InterventionGenerale'"
	 *        extendedMetaData="kind='element' name='APourInterventionGenerale_InterventionGenerale'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourInterventionGeneraleInterventionGenerale();

	/**
	 * Returns the value of the '<em><b>APour Politique Tir Politique Tir</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Politique Tir Politique Tir</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Politique Tir Politique Tir</em>' containment reference.
	 * @see #setAPourPolitiqueTirPolitiqueTir(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypePlanFeux_APourPolitiqueTirPolitiqueTir()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='Concerne_PlanFeux' target_entity='type_PolitiqueTir'"
	 *        extendedMetaData="kind='element' name='APourPolitiqueTir_PolitiqueTir'"
	 * @generated
	 */
	TypeAssociation getAPourPolitiqueTirPolitiqueTir();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePlanFeux#getAPourPolitiqueTirPolitiqueTir <em>APour Politique Tir Politique Tir</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Politique Tir Politique Tir</em>' containment reference.
	 * @see #getAPourPolitiqueTirPolitiqueTir()
	 * @generated
	 */
	void setAPourPolitiqueTirPolitiqueTir(TypeAssociation value);

} // TypePlanFeux
