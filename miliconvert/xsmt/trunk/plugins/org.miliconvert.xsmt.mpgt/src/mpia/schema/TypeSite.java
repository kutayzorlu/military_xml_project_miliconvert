/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeLongueur;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Site</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeSite#getIdentification <em>Identification</em>}</li>
 *   <li>{@link mpia.schema.TypeSite#getNationalite <em>Nationalite</em>}</li>
 *   <li>{@link mpia.schema.TypeSite#getLongueur <em>Longueur</em>}</li>
 *   <li>{@link mpia.schema.TypeSite#getLargeur <em>Largeur</em>}</li>
 *   <li>{@link mpia.schema.TypeSite#getProfondeur <em>Profondeur</em>}</li>
 *   <li>{@link mpia.schema.TypeSite#getHauteur <em>Hauteur</em>}</li>
 *   <li>{@link mpia.schema.TypeSite#getCapaciteAccueil <em>Capacite Accueil</em>}</li>
 *   <li>{@link mpia.schema.TypeSite#getCapaciteHebergement <em>Capacite Hebergement</em>}</li>
 *   <li>{@link mpia.schema.TypeSite#getDescriptionHebergement <em>Description Hebergement</em>}</li>
 *   <li>{@link mpia.schema.TypeSite#getMateriauPrincipalConstruction <em>Materiau Principal Construction</em>}</li>
 *   <li>{@link mpia.schema.TypeSite#getAPourTypeAssociationSiteTypeSite <em>APour Type Association Site Type Site</em>}</li>
 *   <li>{@link mpia.schema.TypeSite#getAPourEtatEtatOperationnelSite <em>APour Etat Etat Operationnel Site</em>}</li>
 *   <li>{@link mpia.schema.TypeSite#getEstObjetAssociationEntiteOrgSite <em>Est Objet Association Entite Org Site</em>}</li>
 *   <li>{@link mpia.schema.TypeSite#getCaracZoneRisqueZoneRisque <em>Carac Zone Risque Zone Risque</em>}</li>
 *   <li>{@link mpia.schema.TypeSite#getCaracAutreZoneInterventionZoneIntervention <em>Carac Autre Zone Intervention Zone Intervention</em>}</li>
 *   <li>{@link mpia.schema.TypeSite#getCaracCampCamp <em>Carac Camp Camp</em>}</li>
 *   <li>{@link mpia.schema.TypeSite#getCaracSiteSoinSiteSoin <em>Carac Site Soin Site Soin</em>}</li>
 *   <li>{@link mpia.schema.TypeSite#getCaracSiteProductionSiteProduction <em>Carac Site Production Site Production</em>}</li>
 *   <li>{@link mpia.schema.TypeSite#getCaracLiaisonPhysiqueLiaisonPhysique <em>Carac Liaison Physique Liaison Physique</em>}</li>
 *   <li>{@link mpia.schema.TypeSite#getEstSujetAssociationSiteEvenement <em>Est Sujet Association Site Evenement</em>}</li>
 *   <li>{@link mpia.schema.TypeSite#getEstSujetAssociationSiteEltCtrl <em>Est Sujet Association Site Elt Ctrl</em>}</li>
 *   <li>{@link mpia.schema.TypeSite#getEstObjetAssociationSiteSite <em>Est Objet Association Site Site</em>}</li>
 *   <li>{@link mpia.schema.TypeSite#getEstSujetAssociationSiteSite <em>Est Sujet Association Site Site</em>}</li>
 *   <li>{@link mpia.schema.TypeSite#getAPourCaracteristiqueLogistiqueCaracteristiqueLogistique <em>APour Caracteristique Logistique Caracteristique Logistique</em>}</li>
 *   <li>{@link mpia.schema.TypeSite#getEstObjetAssociationEltCtrlSite <em>Est Objet Association Elt Ctrl Site</em>}</li>
 *   <li>{@link mpia.schema.TypeSite#getEstObjetAssociationEltTopoSite <em>Est Objet Association Elt Topo Site</em>}</li>
 *   <li>{@link mpia.schema.TypeSite#getEstSujetAssociationSiteEltTopo <em>Est Sujet Association Site Elt Topo</em>}</li>
 *   <li>{@link mpia.schema.TypeSite#getEstObjetAssociationMaterielSite <em>Est Objet Association Materiel Site</em>}</li>
 *   <li>{@link mpia.schema.TypeSite#getEstSujetAssociationSiteMateriel <em>Est Sujet Association Site Materiel</em>}</li>
 *   <li>{@link mpia.schema.TypeSite#getEstObjetAssociationPersonneSite <em>Est Objet Association Personne Site</em>}</li>
 *   <li>{@link mpia.schema.TypeSite#getEstObjetAssociationMeteorologieSite <em>Est Objet Association Meteorologie Site</em>}</li>
 *   <li>{@link mpia.schema.TypeSite#getEstSujetAssociationSiteMeteorologie <em>Est Sujet Association Site Meteorologie</em>}</li>
 *   <li>{@link mpia.schema.TypeSite#getEstObjetAssociationObjetInconnuSite <em>Est Objet Association Objet Inconnu Site</em>}</li>
 *   <li>{@link mpia.schema.TypeSite#getEstSujetAssociationSiteObjetInconnu <em>Est Sujet Association Site Objet Inconnu</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeSite()
 * @model abstract="true"
 *        extendedMetaData="name='type_Site' kind='elementOnly'"
 * @generated
 */
public interface TypeSite extends TypeInstanceObjet {
	/**
	 * Returns the value of the '<em><b>Identification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identification</em>' attribute.
	 * @see #setIdentification(String)
	 * @see mpia.schema.SchemaPackage#getTypeSite_Identification()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='Identification'"
	 * @generated
	 */
	String getIdentification();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSite#getIdentification <em>Identification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identification</em>' attribute.
	 * @see #getIdentification()
	 * @generated
	 */
	void setIdentification(String value);

	/**
	 * Returns the value of the '<em><b>Nationalite</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEntitePolitiqueTrigramme}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nationalite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nationalite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEntitePolitiqueTrigramme
	 * @see #isSetNationalite()
	 * @see #unsetNationalite()
	 * @see #setNationalite(TypeDictionaryDicoEntitePolitiqueTrigramme)
	 * @see mpia.schema.SchemaPackage#getTypeSite_Nationalite()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Nationalite'"
	 * @generated
	 */
	TypeDictionaryDicoEntitePolitiqueTrigramme getNationalite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSite#getNationalite <em>Nationalite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nationalite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEntitePolitiqueTrigramme
	 * @see #isSetNationalite()
	 * @see #unsetNationalite()
	 * @see #getNationalite()
	 * @generated
	 */
	void setNationalite(TypeDictionaryDicoEntitePolitiqueTrigramme value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSite#getNationalite <em>Nationalite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNationalite()
	 * @see #getNationalite()
	 * @see #setNationalite(TypeDictionaryDicoEntitePolitiqueTrigramme)
	 * @generated
	 */
	void unsetNationalite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSite#getNationalite <em>Nationalite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nationalite</em>' attribute is set.
	 * @see #unsetNationalite()
	 * @see #getNationalite()
	 * @see #setNationalite(TypeDictionaryDicoEntitePolitiqueTrigramme)
	 * @generated
	 */
	boolean isSetNationalite();

	/**
	 * Returns the value of the '<em><b>Longueur</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Longueur</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longueur</em>' containment reference.
	 * @see #setLongueur(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeSite_Longueur()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Longueur'"
	 * @generated
	 */
	TypeDataTypeLongueur getLongueur();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSite#getLongueur <em>Longueur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longueur</em>' containment reference.
	 * @see #getLongueur()
	 * @generated
	 */
	void setLongueur(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Largeur</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Largeur</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Largeur</em>' containment reference.
	 * @see #setLargeur(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeSite_Largeur()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Largeur'"
	 * @generated
	 */
	TypeDataTypeLongueur getLargeur();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSite#getLargeur <em>Largeur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Largeur</em>' containment reference.
	 * @see #getLargeur()
	 * @generated
	 */
	void setLargeur(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Profondeur</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profondeur</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profondeur</em>' containment reference.
	 * @see #setProfondeur(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeSite_Profondeur()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Profondeur'"
	 * @generated
	 */
	TypeDataTypeLongueur getProfondeur();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSite#getProfondeur <em>Profondeur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profondeur</em>' containment reference.
	 * @see #getProfondeur()
	 * @generated
	 */
	void setProfondeur(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Hauteur</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hauteur</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hauteur</em>' containment reference.
	 * @see #setHauteur(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeSite_Hauteur()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Hauteur'"
	 * @generated
	 */
	TypeDataTypeLongueur getHauteur();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSite#getHauteur <em>Hauteur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hauteur</em>' containment reference.
	 * @see #getHauteur()
	 * @generated
	 */
	void setHauteur(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Capacite Accueil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacite Accueil</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacite Accueil</em>' attribute.
	 * @see #isSetCapaciteAccueil()
	 * @see #unsetCapaciteAccueil()
	 * @see #setCapaciteAccueil(long)
	 * @see mpia.schema.SchemaPackage#getTypeSite_CapaciteAccueil()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='CapaciteAccueil'"
	 * @generated
	 */
	long getCapaciteAccueil();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSite#getCapaciteAccueil <em>Capacite Accueil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacite Accueil</em>' attribute.
	 * @see #isSetCapaciteAccueil()
	 * @see #unsetCapaciteAccueil()
	 * @see #getCapaciteAccueil()
	 * @generated
	 */
	void setCapaciteAccueil(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSite#getCapaciteAccueil <em>Capacite Accueil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCapaciteAccueil()
	 * @see #getCapaciteAccueil()
	 * @see #setCapaciteAccueil(long)
	 * @generated
	 */
	void unsetCapaciteAccueil();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSite#getCapaciteAccueil <em>Capacite Accueil</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Capacite Accueil</em>' attribute is set.
	 * @see #unsetCapaciteAccueil()
	 * @see #getCapaciteAccueil()
	 * @see #setCapaciteAccueil(long)
	 * @generated
	 */
	boolean isSetCapaciteAccueil();

	/**
	 * Returns the value of the '<em><b>Capacite Hebergement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacite Hebergement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacite Hebergement</em>' attribute.
	 * @see #isSetCapaciteHebergement()
	 * @see #unsetCapaciteHebergement()
	 * @see #setCapaciteHebergement(long)
	 * @see mpia.schema.SchemaPackage#getTypeSite_CapaciteHebergement()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='CapaciteHebergement'"
	 * @generated
	 */
	long getCapaciteHebergement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSite#getCapaciteHebergement <em>Capacite Hebergement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacite Hebergement</em>' attribute.
	 * @see #isSetCapaciteHebergement()
	 * @see #unsetCapaciteHebergement()
	 * @see #getCapaciteHebergement()
	 * @generated
	 */
	void setCapaciteHebergement(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSite#getCapaciteHebergement <em>Capacite Hebergement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCapaciteHebergement()
	 * @see #getCapaciteHebergement()
	 * @see #setCapaciteHebergement(long)
	 * @generated
	 */
	void unsetCapaciteHebergement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSite#getCapaciteHebergement <em>Capacite Hebergement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Capacite Hebergement</em>' attribute is set.
	 * @see #unsetCapaciteHebergement()
	 * @see #getCapaciteHebergement()
	 * @see #setCapaciteHebergement(long)
	 * @generated
	 */
	boolean isSetCapaciteHebergement();

	/**
	 * Returns the value of the '<em><b>Description Hebergement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description Hebergement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description Hebergement</em>' attribute.
	 * @see #setDescriptionHebergement(String)
	 * @see mpia.schema.SchemaPackage#getTypeSite_DescriptionHebergement()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='DescriptionHebergement'"
	 * @generated
	 */
	String getDescriptionHebergement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSite#getDescriptionHebergement <em>Description Hebergement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Hebergement</em>' attribute.
	 * @see #getDescriptionHebergement()
	 * @generated
	 */
	void setDescriptionHebergement(String value);

	/**
	 * Returns the value of the '<em><b>Materiau Principal Construction</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoSiteMateriauPrincipalConstruction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Materiau Principal Construction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Materiau Principal Construction</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoSiteMateriauPrincipalConstruction
	 * @see #isSetMateriauPrincipalConstruction()
	 * @see #unsetMateriauPrincipalConstruction()
	 * @see #setMateriauPrincipalConstruction(TypeDictionaryDicoSiteMateriauPrincipalConstruction)
	 * @see mpia.schema.SchemaPackage#getTypeSite_MateriauPrincipalConstruction()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='MateriauPrincipalConstruction'"
	 * @generated
	 */
	TypeDictionaryDicoSiteMateriauPrincipalConstruction getMateriauPrincipalConstruction();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSite#getMateriauPrincipalConstruction <em>Materiau Principal Construction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Materiau Principal Construction</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoSiteMateriauPrincipalConstruction
	 * @see #isSetMateriauPrincipalConstruction()
	 * @see #unsetMateriauPrincipalConstruction()
	 * @see #getMateriauPrincipalConstruction()
	 * @generated
	 */
	void setMateriauPrincipalConstruction(TypeDictionaryDicoSiteMateriauPrincipalConstruction value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSite#getMateriauPrincipalConstruction <em>Materiau Principal Construction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMateriauPrincipalConstruction()
	 * @see #getMateriauPrincipalConstruction()
	 * @see #setMateriauPrincipalConstruction(TypeDictionaryDicoSiteMateriauPrincipalConstruction)
	 * @generated
	 */
	void unsetMateriauPrincipalConstruction();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSite#getMateriauPrincipalConstruction <em>Materiau Principal Construction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Materiau Principal Construction</em>' attribute is set.
	 * @see #unsetMateriauPrincipalConstruction()
	 * @see #getMateriauPrincipalConstruction()
	 * @see #setMateriauPrincipalConstruction(TypeDictionaryDicoSiteMateriauPrincipalConstruction)
	 * @generated
	 */
	boolean isSetMateriauPrincipalConstruction();

	/**
	 * Returns the value of the '<em><b>APour Type Association Site Type Site</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Type Association Site Type Site</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Type Association Site Type Site</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeSite_APourTypeAssociationSiteTypeSite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeObjet_Site' target_entity='type_AssociationSiteTypeSite'"
	 *        extendedMetaData="kind='element' name='APourType_AssociationSiteTypeSite'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourTypeAssociationSiteTypeSite();

	/**
	 * Returns the value of the '<em><b>APour Etat Etat Operationnel Site</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeEtatOperationnelSite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Etat Etat Operationnel Site</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Etat Etat Operationnel Site</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeSite_APourEtatEtatOperationnelSite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_EtatOperationnelSite'"
	 *        extendedMetaData="kind='element' name='APourEtat_EtatOperationnelSite'"
	 * @generated
	 */
	EList<TypeEtatOperationnelSite> getAPourEtatEtatOperationnelSite();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Entite Org Site</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Entite Org Site</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Entite Org Site</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeSite_EstObjetAssociationEntiteOrgSite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_Site' target_entity='type_AssociationEntiteOrgSite'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationEntiteOrgSite'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationEntiteOrgSite();

	/**
	 * Returns the value of the '<em><b>Carac Zone Risque Zone Risque</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Carac Zone Risque Zone Risque</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carac Zone Risque Zone Risque</em>' containment reference.
	 * @see #setCaracZoneRisqueZoneRisque(TypeZoneRisque)
	 * @see mpia.schema.SchemaPackage#getTypeSite_CaracZoneRisqueZoneRisque()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ZoneRisque'"
	 *        extendedMetaData="kind='element' name='CaracZoneRisque_ZoneRisque'"
	 * @generated
	 */
	TypeZoneRisque getCaracZoneRisqueZoneRisque();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSite#getCaracZoneRisqueZoneRisque <em>Carac Zone Risque Zone Risque</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carac Zone Risque Zone Risque</em>' containment reference.
	 * @see #getCaracZoneRisqueZoneRisque()
	 * @generated
	 */
	void setCaracZoneRisqueZoneRisque(TypeZoneRisque value);

	/**
	 * Returns the value of the '<em><b>Carac Autre Zone Intervention Zone Intervention</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Carac Autre Zone Intervention Zone Intervention</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carac Autre Zone Intervention Zone Intervention</em>' containment reference.
	 * @see #setCaracAutreZoneInterventionZoneIntervention(TypeZoneIntervention)
	 * @see mpia.schema.SchemaPackage#getTypeSite_CaracAutreZoneInterventionZoneIntervention()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ZoneIntervention'"
	 *        extendedMetaData="kind='element' name='CaracAutreZoneIntervention_ZoneIntervention'"
	 * @generated
	 */
	TypeZoneIntervention getCaracAutreZoneInterventionZoneIntervention();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSite#getCaracAutreZoneInterventionZoneIntervention <em>Carac Autre Zone Intervention Zone Intervention</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carac Autre Zone Intervention Zone Intervention</em>' containment reference.
	 * @see #getCaracAutreZoneInterventionZoneIntervention()
	 * @generated
	 */
	void setCaracAutreZoneInterventionZoneIntervention(TypeZoneIntervention value);

	/**
	 * Returns the value of the '<em><b>Carac Camp Camp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Carac Camp Camp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carac Camp Camp</em>' containment reference.
	 * @see #setCaracCampCamp(TypeCamp)
	 * @see mpia.schema.SchemaPackage#getTypeSite_CaracCampCamp()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Camp'"
	 *        extendedMetaData="kind='element' name='CaracCamp_Camp'"
	 * @generated
	 */
	TypeCamp getCaracCampCamp();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSite#getCaracCampCamp <em>Carac Camp Camp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carac Camp Camp</em>' containment reference.
	 * @see #getCaracCampCamp()
	 * @generated
	 */
	void setCaracCampCamp(TypeCamp value);

	/**
	 * Returns the value of the '<em><b>Carac Site Soin Site Soin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Carac Site Soin Site Soin</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carac Site Soin Site Soin</em>' containment reference.
	 * @see #setCaracSiteSoinSiteSoin(TypeSiteSoin)
	 * @see mpia.schema.SchemaPackage#getTypeSite_CaracSiteSoinSiteSoin()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_SiteSoin'"
	 *        extendedMetaData="kind='element' name='CaracSiteSoin_SiteSoin'"
	 * @generated
	 */
	TypeSiteSoin getCaracSiteSoinSiteSoin();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSite#getCaracSiteSoinSiteSoin <em>Carac Site Soin Site Soin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carac Site Soin Site Soin</em>' containment reference.
	 * @see #getCaracSiteSoinSiteSoin()
	 * @generated
	 */
	void setCaracSiteSoinSiteSoin(TypeSiteSoin value);

	/**
	 * Returns the value of the '<em><b>Carac Site Production Site Production</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Carac Site Production Site Production</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carac Site Production Site Production</em>' containment reference.
	 * @see #setCaracSiteProductionSiteProduction(TypeSiteProduction)
	 * @see mpia.schema.SchemaPackage#getTypeSite_CaracSiteProductionSiteProduction()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_SiteProduction'"
	 *        extendedMetaData="kind='element' name='CaracSiteProduction_SiteProduction'"
	 * @generated
	 */
	TypeSiteProduction getCaracSiteProductionSiteProduction();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSite#getCaracSiteProductionSiteProduction <em>Carac Site Production Site Production</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carac Site Production Site Production</em>' containment reference.
	 * @see #getCaracSiteProductionSiteProduction()
	 * @generated
	 */
	void setCaracSiteProductionSiteProduction(TypeSiteProduction value);

	/**
	 * Returns the value of the '<em><b>Carac Liaison Physique Liaison Physique</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Carac Liaison Physique Liaison Physique</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carac Liaison Physique Liaison Physique</em>' containment reference.
	 * @see #setCaracLiaisonPhysiqueLiaisonPhysique(TypeLiaisonPhysique)
	 * @see mpia.schema.SchemaPackage#getTypeSite_CaracLiaisonPhysiqueLiaisonPhysique()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_LiaisonPhysique'"
	 *        extendedMetaData="kind='element' name='CaracLiaisonPhysique_LiaisonPhysique'"
	 * @generated
	 */
	TypeLiaisonPhysique getCaracLiaisonPhysiqueLiaisonPhysique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSite#getCaracLiaisonPhysiqueLiaisonPhysique <em>Carac Liaison Physique Liaison Physique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carac Liaison Physique Liaison Physique</em>' containment reference.
	 * @see #getCaracLiaisonPhysiqueLiaisonPhysique()
	 * @generated
	 */
	void setCaracLiaisonPhysiqueLiaisonPhysique(TypeLiaisonPhysique value);

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Site Evenement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Site Evenement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Site Evenement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeSite_EstSujetAssociationSiteEvenement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_Site' target_entity='type_AssociationSiteEvenement'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationSiteEvenement'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationSiteEvenement();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Site Elt Ctrl</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Site Elt Ctrl</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Site Elt Ctrl</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeSite_EstSujetAssociationSiteEltCtrl()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_Site' target_entity='type_AssociationSiteEltCtrl'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationSiteEltCtrl'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationSiteEltCtrl();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Site Site</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Site Site</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Site Site</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeSite_EstObjetAssociationSiteSite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_Site' target_entity='type_AssociationSiteSite'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationSiteSite'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationSiteSite();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Site Site</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Site Site</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Site Site</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeSite_EstSujetAssociationSiteSite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_Site' target_entity='type_AssociationSiteSite'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationSiteSite'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationSiteSite();

	/**
	 * Returns the value of the '<em><b>APour Caracteristique Logistique Caracteristique Logistique</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Caracteristique Logistique Caracteristique Logistique</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Caracteristique Logistique Caracteristique Logistique</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeSite_APourCaracteristiqueLogistiqueCaracteristiqueLogistique()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_CaracteristiqueLogistique'"
	 *        extendedMetaData="kind='element' name='APourCaracteristiqueLogistique_CaracteristiqueLogistique'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourCaracteristiqueLogistiqueCaracteristiqueLogistique();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Elt Ctrl Site</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Elt Ctrl Site</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Elt Ctrl Site</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeSite_EstObjetAssociationEltCtrlSite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_Site' target_entity='type_AssociationEltCtrlSite'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationEltCtrlSite'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationEltCtrlSite();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Elt Topo Site</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Elt Topo Site</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Elt Topo Site</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeSite_EstObjetAssociationEltTopoSite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_Site' target_entity='type_AssociationEltTopoSite'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationEltTopoSite'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationEltTopoSite();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Site Elt Topo</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Site Elt Topo</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Site Elt Topo</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeSite_EstSujetAssociationSiteEltTopo()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_Site' target_entity='type_AssociationSiteEltTopo'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationSiteEltTopo'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationSiteEltTopo();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Materiel Site</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Materiel Site</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Materiel Site</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeSite_EstObjetAssociationMaterielSite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_Site' target_entity='type_AssociationMaterielSite'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationMaterielSite'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationMaterielSite();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Site Materiel</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Site Materiel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Site Materiel</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeSite_EstSujetAssociationSiteMateriel()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_Site' target_entity='type_AssociationSiteMateriel'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationSiteMateriel'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationSiteMateriel();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Personne Site</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Personne Site</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Personne Site</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeSite_EstObjetAssociationPersonneSite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_Site' target_entity='type_AssociationPersonneSite'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationPersonneSite'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationPersonneSite();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Meteorologie Site</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Meteorologie Site</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Meteorologie Site</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeSite_EstObjetAssociationMeteorologieSite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_Site' target_entity='type_AssociationMeteorologieSite'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationMeteorologieSite'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationMeteorologieSite();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Site Meteorologie</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Site Meteorologie</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Site Meteorologie</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeSite_EstSujetAssociationSiteMeteorologie()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_Site' target_entity='type_AssociationSiteMeteorologie'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationSiteMeteorologie'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationSiteMeteorologie();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Objet Inconnu Site</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Objet Inconnu Site</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Objet Inconnu Site</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeSite_EstObjetAssociationObjetInconnuSite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_Site' target_entity='type_AssociationObjetInconnuSite'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationObjetInconnuSite'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationObjetInconnuSite();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Site Objet Inconnu</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Site Objet Inconnu</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Site Objet Inconnu</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeSite_EstSujetAssociationSiteObjetInconnu()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_Site' target_entity='type_AssociationSiteObjetInconnu'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationSiteObjetInconnu'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationSiteObjetInconnu();

} // TypeSite
