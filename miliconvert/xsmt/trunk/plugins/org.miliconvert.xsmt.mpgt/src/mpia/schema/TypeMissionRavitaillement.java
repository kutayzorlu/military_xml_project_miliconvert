/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Mission Ravitaillement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMissionRavitaillement#getConsigne <em>Consigne</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionRavitaillement#getACommeConsommationAutoriseeConsommationAutorisee <em>AComme Consommation Autorisee Consommation Autorisee</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionRavitaillement#getACommePrioritesPriorite <em>AComme Priorites Priorite</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionRavitaillement#getACommeDepotACreerDepotACreer <em>AComme Depot ACreer Depot ACreer</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionRavitaillement#getACommeManutentionAEffectuerManutentionAEffectuer <em>AComme Manutention AEffectuer Manutention AEffectuer</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionRavitaillement#getAPourModeLivraisonGuVersTc2ModaliteLivraison <em>APour Mode Livraison Gu Vers Tc2 Modalite Livraison</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionRavitaillement#getAPourModeLivraisonTc2VersTc1ModaliteLivraison <em>APour Mode Livraison Tc2 Vers Tc1 Modalite Livraison</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionRavitaillement#getAPourModePerceptionTc1AupresDeTc2ModalitePerception <em>APour Mode Perception Tc1 Aupres De Tc2 Modalite Perception</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionRavitaillement#getAPourModePerceptionTc2AupresDeLaGuModalitePerception <em>APour Mode Perception Tc2 Aupres De La Gu Modalite Perception</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionRavitaillement#getACommeStockAMaintenirStockAMaintenir <em>AComme Stock AMaintenir Stock AMaintenir</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionRavitaillement#getACommeRessourceADistribuerRessourcesALivrerOuADistribuer <em>AComme Ressource ADistribuer Ressources ALivrer Ou ADistribuer</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionRavitaillement#getACommeRessourceALivrerRessourcesALivrerOuADistribuer <em>AComme Ressource ALivrer Ressources ALivrer Ou ADistribuer</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionRavitaillement#getACommeRessourceAttendueRessourceAttendue <em>AComme Ressource Attendue Ressource Attendue</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionRavitaillement#getAPourDeploiementLogistiqueDeploiement <em>APour Deploiement Logistique Deploiement</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMissionRavitaillement()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_MissionRavitaillement' kind='elementOnly'"
 * @generated
 */
public interface TypeMissionRavitaillement extends TypeMissionLogistique {
	/**
	 * Returns the value of the '<em><b>Consigne</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consigne</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consigne</em>' attribute.
	 * @see #setConsigne(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionRavitaillement_Consigne()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='Consigne'"
	 * @generated
	 */
	String getConsigne();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionRavitaillement#getConsigne <em>Consigne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consigne</em>' attribute.
	 * @see #getConsigne()
	 * @generated
	 */
	void setConsigne(String value);

	/**
	 * Returns the value of the '<em><b>AComme Consommation Autorisee Consommation Autorisee</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeConsommationAutorisee}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Consommation Autorisee Consommation Autorisee</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Consommation Autorisee Consommation Autorisee</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionRavitaillement_ACommeConsommationAutoriseeConsommationAutorisee()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ConsommationAutorisee'"
	 *        extendedMetaData="kind='element' name='ACommeConsommationAutorisee_ConsommationAutorisee'"
	 * @generated
	 */
	EList<TypeConsommationAutorisee> getACommeConsommationAutoriseeConsommationAutorisee();

	/**
	 * Returns the value of the '<em><b>AComme Priorites Priorite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypePriorite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Priorites Priorite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Priorites Priorite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionRavitaillement_ACommePrioritesPriorite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Priorite'"
	 *        extendedMetaData="kind='element' name='ACommePriorites_Priorite'"
	 * @generated
	 */
	EList<TypePriorite> getACommePrioritesPriorite();

	/**
	 * Returns the value of the '<em><b>AComme Depot ACreer Depot ACreer</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeDepotACreer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Depot ACreer Depot ACreer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Depot ACreer Depot ACreer</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionRavitaillement_ACommeDepotACreerDepotACreer()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_DepotACreer'"
	 *        extendedMetaData="kind='element' name='ACommeDepotACreer_DepotACreer'"
	 * @generated
	 */
	EList<TypeDepotACreer> getACommeDepotACreerDepotACreer();

	/**
	 * Returns the value of the '<em><b>AComme Manutention AEffectuer Manutention AEffectuer</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeManutentionAEffectuer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Manutention AEffectuer Manutention AEffectuer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Manutention AEffectuer Manutention AEffectuer</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionRavitaillement_ACommeManutentionAEffectuerManutentionAEffectuer()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ManutentionAEffectuer'"
	 *        extendedMetaData="kind='element' name='ACommeManutentionAEffectuer_ManutentionAEffectuer'"
	 * @generated
	 */
	EList<TypeManutentionAEffectuer> getACommeManutentionAEffectuerManutentionAEffectuer();

	/**
	 * Returns the value of the '<em><b>APour Mode Livraison Gu Vers Tc2 Modalite Livraison</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeModaliteLivraison}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Mode Livraison Gu Vers Tc2 Modalite Livraison</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Mode Livraison Gu Vers Tc2 Modalite Livraison</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionRavitaillement_APourModeLivraisonGuVersTc2ModaliteLivraison()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ModaliteLivraison'"
	 *        extendedMetaData="kind='element' name='APourModeLivraisonGuVersTc2_ModaliteLivraison'"
	 * @generated
	 */
	EList<TypeModaliteLivraison> getAPourModeLivraisonGuVersTc2ModaliteLivraison();

	/**
	 * Returns the value of the '<em><b>APour Mode Livraison Tc2 Vers Tc1 Modalite Livraison</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeModaliteLivraison}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Mode Livraison Tc2 Vers Tc1 Modalite Livraison</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Mode Livraison Tc2 Vers Tc1 Modalite Livraison</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionRavitaillement_APourModeLivraisonTc2VersTc1ModaliteLivraison()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ModaliteLivraison'"
	 *        extendedMetaData="kind='element' name='APourModeLivraisonTc2VersTc1_ModaliteLivraison'"
	 * @generated
	 */
	EList<TypeModaliteLivraison> getAPourModeLivraisonTc2VersTc1ModaliteLivraison();

	/**
	 * Returns the value of the '<em><b>APour Mode Perception Tc1 Aupres De Tc2 Modalite Perception</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeModalitePerception}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Mode Perception Tc1 Aupres De Tc2 Modalite Perception</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Mode Perception Tc1 Aupres De Tc2 Modalite Perception</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionRavitaillement_APourModePerceptionTc1AupresDeTc2ModalitePerception()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ModalitePerception'"
	 *        extendedMetaData="kind='element' name='APourModePerceptionTc1AupresDeTc2_ModalitePerception'"
	 * @generated
	 */
	EList<TypeModalitePerception> getAPourModePerceptionTc1AupresDeTc2ModalitePerception();

	/**
	 * Returns the value of the '<em><b>APour Mode Perception Tc2 Aupres De La Gu Modalite Perception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Mode Perception Tc2 Aupres De La Gu Modalite Perception</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Mode Perception Tc2 Aupres De La Gu Modalite Perception</em>' containment reference.
	 * @see #setAPourModePerceptionTc2AupresDeLaGuModalitePerception(TypeModalitePerception)
	 * @see mpia.schema.SchemaPackage#getTypeMissionRavitaillement_APourModePerceptionTc2AupresDeLaGuModalitePerception()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ModalitePerception'"
	 *        extendedMetaData="kind='element' name='APourModePerceptionTc2AupresDeLaGu_ModalitePerception'"
	 * @generated
	 */
	TypeModalitePerception getAPourModePerceptionTc2AupresDeLaGuModalitePerception();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionRavitaillement#getAPourModePerceptionTc2AupresDeLaGuModalitePerception <em>APour Mode Perception Tc2 Aupres De La Gu Modalite Perception</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Mode Perception Tc2 Aupres De La Gu Modalite Perception</em>' containment reference.
	 * @see #getAPourModePerceptionTc2AupresDeLaGuModalitePerception()
	 * @generated
	 */
	void setAPourModePerceptionTc2AupresDeLaGuModalitePerception(TypeModalitePerception value);

	/**
	 * Returns the value of the '<em><b>AComme Stock AMaintenir Stock AMaintenir</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeStockAMaintenir}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Stock AMaintenir Stock AMaintenir</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Stock AMaintenir Stock AMaintenir</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionRavitaillement_ACommeStockAMaintenirStockAMaintenir()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_StockAMaintenir'"
	 *        extendedMetaData="kind='element' name='ACommeStockAMaintenir_StockAMaintenir'"
	 * @generated
	 */
	EList<TypeStockAMaintenir> getACommeStockAMaintenirStockAMaintenir();

	/**
	 * Returns the value of the '<em><b>AComme Ressource ADistribuer Ressources ALivrer Ou ADistribuer</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeRessourcesALivrerOuADistribuer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Ressource ADistribuer Ressources ALivrer Ou ADistribuer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Ressource ADistribuer Ressources ALivrer Ou ADistribuer</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionRavitaillement_ACommeRessourceADistribuerRessourcesALivrerOuADistribuer()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_RessourcesALivrerOuADistribuer'"
	 *        extendedMetaData="kind='element' name='ACommeRessourceADistribuer_RessourcesALivrerOuADistribuer'"
	 * @generated
	 */
	EList<TypeRessourcesALivrerOuADistribuer> getACommeRessourceADistribuerRessourcesALivrerOuADistribuer();

	/**
	 * Returns the value of the '<em><b>AComme Ressource ALivrer Ressources ALivrer Ou ADistribuer</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeRessourcesALivrerOuADistribuer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Ressource ALivrer Ressources ALivrer Ou ADistribuer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Ressource ALivrer Ressources ALivrer Ou ADistribuer</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionRavitaillement_ACommeRessourceALivrerRessourcesALivrerOuADistribuer()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_RessourcesALivrerOuADistribuer'"
	 *        extendedMetaData="kind='element' name='ACommeRessourceALivrer_RessourcesALivrerOuADistribuer'"
	 * @generated
	 */
	EList<TypeRessourcesALivrerOuADistribuer> getACommeRessourceALivrerRessourcesALivrerOuADistribuer();

	/**
	 * Returns the value of the '<em><b>AComme Ressource Attendue Ressource Attendue</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeRessourceAttendue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Ressource Attendue Ressource Attendue</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Ressource Attendue Ressource Attendue</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionRavitaillement_ACommeRessourceAttendueRessourceAttendue()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_RessourceAttendue'"
	 *        extendedMetaData="kind='element' name='ACommeRessourceAttendue_RessourceAttendue'"
	 * @generated
	 */
	EList<TypeRessourceAttendue> getACommeRessourceAttendueRessourceAttendue();

	/**
	 * Returns the value of the '<em><b>APour Deploiement Logistique Deploiement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeDeploiement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Deploiement Logistique Deploiement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Deploiement Logistique Deploiement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMissionRavitaillement_APourDeploiementLogistiqueDeploiement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Deploiement'"
	 *        extendedMetaData="kind='element' name='APourDeploiementLogistique_Deploiement'"
	 * @generated
	 */
	EList<TypeDeploiement> getAPourDeploiementLogistiqueDeploiement();

} // TypeMissionRavitaillement
