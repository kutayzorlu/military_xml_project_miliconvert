/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Materiel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMateriel#getNumeroSerie <em>Numero Serie</em>}</li>
 *   <li>{@link mpia.schema.TypeMateriel#getIdentification <em>Identification</em>}</li>
 *   <li>{@link mpia.schema.TypeMateriel#getNationalite <em>Nationalite</em>}</li>
 *   <li>{@link mpia.schema.TypeMateriel#getStatut <em>Statut</em>}</li>
 *   <li>{@link mpia.schema.TypeMateriel#getSuiviMines <em>Suivi Mines</em>}</li>
 *   <li>{@link mpia.schema.TypeMateriel#getSignatureEnveloppe <em>Signature Enveloppe</em>}</li>
 *   <li>{@link mpia.schema.TypeMateriel#getAPourTypeAssociationMaterielTypeMateriel <em>APour Type Association Materiel Type Materiel</em>}</li>
 *   <li>{@link mpia.schema.TypeMateriel#getAPourEtatEtatOperationnelMateriel <em>APour Etat Etat Operationnel Materiel</em>}</li>
 *   <li>{@link mpia.schema.TypeMateriel#getEstObjetAssociationEntiteOrgMateriel <em>Est Objet Association Entite Org Materiel</em>}</li>
 *   <li>{@link mpia.schema.TypeMateriel#getAPourChargementChargementMateriel <em>APour Chargement Chargement Materiel</em>}</li>
 *   <li>{@link mpia.schema.TypeMateriel#getAPourSousSystemeEnPanneTypeSousSysteme <em>APour Sous Systeme En Panne Type Sous Systeme</em>}</li>
 *   <li>{@link mpia.schema.TypeMateriel#getAPourSituationRadiationSituationRadiation <em>APour Situation Radiation Situation Radiation</em>}</li>
 *   <li>{@link mpia.schema.TypeMateriel#getEstSujetAssociationMaterielEvenement <em>Est Sujet Association Materiel Evenement</em>}</li>
 *   <li>{@link mpia.schema.TypeMateriel#getEstSujetAssociationMaterielSite <em>Est Sujet Association Materiel Site</em>}</li>
 *   <li>{@link mpia.schema.TypeMateriel#getEstSujetAssociationMaterielPersonne <em>Est Sujet Association Materiel Personne</em>}</li>
 *   <li>{@link mpia.schema.TypeMateriel#getEstObjetAssociationMaterielMateriel <em>Est Objet Association Materiel Materiel</em>}</li>
 *   <li>{@link mpia.schema.TypeMateriel#getEstSujetAssociationMaterielMateriel <em>Est Sujet Association Materiel Materiel</em>}</li>
 *   <li>{@link mpia.schema.TypeMateriel#getEstSujetAssociationMaterielEltCtrl <em>Est Sujet Association Materiel Elt Ctrl</em>}</li>
 *   <li>{@link mpia.schema.TypeMateriel#getEstObjetAssociationEltCtrlMateriel <em>Est Objet Association Elt Ctrl Materiel</em>}</li>
 *   <li>{@link mpia.schema.TypeMateriel#getEstSujetAssociationMaterielEltTopo <em>Est Sujet Association Materiel Elt Topo</em>}</li>
 *   <li>{@link mpia.schema.TypeMateriel#getEstObjetAssociationSiteMateriel <em>Est Objet Association Site Materiel</em>}</li>
 *   <li>{@link mpia.schema.TypeMateriel#getEstObjetAssociationPersonneMateriel <em>Est Objet Association Personne Materiel</em>}</li>
 *   <li>{@link mpia.schema.TypeMateriel#getEstSujetAssociationMaterielObjetInconnu <em>Est Sujet Association Materiel Objet Inconnu</em>}</li>
 *   <li>{@link mpia.schema.TypeMateriel#getEstSujetAssociationMaterielMeteorologie <em>Est Sujet Association Materiel Meteorologie</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMateriel()
 * @model abstract="true"
 *        extendedMetaData="name='type_Materiel' kind='elementOnly'"
 * @generated
 */
public interface TypeMateriel extends TypeInstanceObjet {
	/**
	 * Returns the value of the '<em><b>Numero Serie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Serie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Serie</em>' attribute.
	 * @see #setNumeroSerie(String)
	 * @see mpia.schema.SchemaPackage#getTypeMateriel_NumeroSerie()
	 * @model dataType="mpia.meta.TypeDataTypeChaine050"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='NumeroSerie'"
	 * @generated
	 */
	String getNumeroSerie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMateriel#getNumeroSerie <em>Numero Serie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Serie</em>' attribute.
	 * @see #getNumeroSerie()
	 * @generated
	 */
	void setNumeroSerie(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeMateriel_Identification()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='Identification'"
	 * @generated
	 */
	String getIdentification();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMateriel#getIdentification <em>Identification</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeMateriel_Nationalite()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Nationalite'"
	 * @generated
	 */
	TypeDictionaryDicoEntitePolitiqueTrigramme getNationalite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMateriel#getNationalite <em>Nationalite</em>}' attribute.
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
	 * Unsets the value of the '{@link mpia.schema.TypeMateriel#getNationalite <em>Nationalite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNationalite()
	 * @see #getNationalite()
	 * @see #setNationalite(TypeDictionaryDicoEntitePolitiqueTrigramme)
	 * @generated
	 */
	void unsetNationalite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMateriel#getNationalite <em>Nationalite</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Statut</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoMaterielStatut}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statut</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMaterielStatut
	 * @see #isSetStatut()
	 * @see #unsetStatut()
	 * @see #setStatut(TypeDictionaryDicoMaterielStatut)
	 * @see mpia.schema.SchemaPackage#getTypeMateriel_Statut()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Statut'"
	 * @generated
	 */
	TypeDictionaryDicoMaterielStatut getStatut();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMateriel#getStatut <em>Statut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statut</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMaterielStatut
	 * @see #isSetStatut()
	 * @see #unsetStatut()
	 * @see #getStatut()
	 * @generated
	 */
	void setStatut(TypeDictionaryDicoMaterielStatut value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMateriel#getStatut <em>Statut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStatut()
	 * @see #getStatut()
	 * @see #setStatut(TypeDictionaryDicoMaterielStatut)
	 * @generated
	 */
	void unsetStatut();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMateriel#getStatut <em>Statut</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Statut</em>' attribute is set.
	 * @see #unsetStatut()
	 * @see #getStatut()
	 * @see #setStatut(TypeDictionaryDicoMaterielStatut)
	 * @generated
	 */
	boolean isSetStatut();

	/**
	 * Returns the value of the '<em><b>Suivi Mines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suivi Mines</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suivi Mines</em>' attribute.
	 * @see #setSuiviMines(String)
	 * @see mpia.schema.SchemaPackage#getTypeMateriel_SuiviMines()
	 * @model dataType="mpia.meta.TypeDataTypeChaine015"
	 *        extendedMetaData="kind='element' name='SuiviMines'"
	 * @generated
	 */
	String getSuiviMines();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMateriel#getSuiviMines <em>Suivi Mines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suivi Mines</em>' attribute.
	 * @see #getSuiviMines()
	 * @generated
	 */
	void setSuiviMines(String value);

	/**
	 * Returns the value of the '<em><b>Signature Enveloppe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature Enveloppe</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature Enveloppe</em>' attribute.
	 * @see #setSignatureEnveloppe(String)
	 * @see mpia.schema.SchemaPackage#getTypeMateriel_SignatureEnveloppe()
	 * @model dataType="mpia.meta.TypeDataTypeChaine015"
	 *        extendedMetaData="kind='element' name='SignatureEnveloppe'"
	 * @generated
	 */
	String getSignatureEnveloppe();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMateriel#getSignatureEnveloppe <em>Signature Enveloppe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature Enveloppe</em>' attribute.
	 * @see #getSignatureEnveloppe()
	 * @generated
	 */
	void setSignatureEnveloppe(String value);

	/**
	 * Returns the value of the '<em><b>APour Type Association Materiel Type Materiel</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Type Association Materiel Type Materiel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Type Association Materiel Type Materiel</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMateriel_APourTypeAssociationMaterielTypeMateriel()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeObjet_Materiel' target_entity='type_AssociationMaterielTypeMateriel'"
	 *        extendedMetaData="kind='element' name='APourType_AssociationMaterielTypeMateriel'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourTypeAssociationMaterielTypeMateriel();

	/**
	 * Returns the value of the '<em><b>APour Etat Etat Operationnel Materiel</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeEtatOperationnelMateriel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Etat Etat Operationnel Materiel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Etat Etat Operationnel Materiel</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMateriel_APourEtatEtatOperationnelMateriel()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_EtatOperationnelMateriel'"
	 *        extendedMetaData="kind='element' name='APourEtat_EtatOperationnelMateriel'"
	 * @generated
	 */
	EList<TypeEtatOperationnelMateriel> getAPourEtatEtatOperationnelMateriel();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Entite Org Materiel</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Entite Org Materiel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Entite Org Materiel</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMateriel_EstObjetAssociationEntiteOrgMateriel()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_Materiel' target_entity='type_AssociationEntiteOrgMateriel'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationEntiteOrgMateriel'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationEntiteOrgMateriel();

	/**
	 * Returns the value of the '<em><b>APour Chargement Chargement Materiel</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Chargement Chargement Materiel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Chargement Chargement Materiel</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMateriel_APourChargementChargementMateriel()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstChargement_Materiel' target_entity='type_ChargementMateriel'"
	 *        extendedMetaData="kind='element' name='APourChargement_ChargementMateriel'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourChargementChargementMateriel();

	/**
	 * Returns the value of the '<em><b>APour Sous Systeme En Panne Type Sous Systeme</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeTypeSousSysteme}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Sous Systeme En Panne Type Sous Systeme</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Sous Systeme En Panne Type Sous Systeme</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMateriel_APourSousSystemeEnPanneTypeSousSysteme()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_TypeSousSysteme'"
	 *        extendedMetaData="kind='element' name='APourSousSystemeEnPanne_TypeSousSysteme'"
	 * @generated
	 */
	EList<TypeTypeSousSysteme> getAPourSousSystemeEnPanneTypeSousSysteme();

	/**
	 * Returns the value of the '<em><b>APour Situation Radiation Situation Radiation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Situation Radiation Situation Radiation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Situation Radiation Situation Radiation</em>' containment reference.
	 * @see #setAPourSituationRadiationSituationRadiation(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeMateriel_APourSituationRadiationSituationRadiation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='Concerne_Materiel' target_entity='type_SituationRadiation'"
	 *        extendedMetaData="kind='element' name='APourSituationRadiation_SituationRadiation'"
	 * @generated
	 */
	TypeAssociation getAPourSituationRadiationSituationRadiation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMateriel#getAPourSituationRadiationSituationRadiation <em>APour Situation Radiation Situation Radiation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Situation Radiation Situation Radiation</em>' containment reference.
	 * @see #getAPourSituationRadiationSituationRadiation()
	 * @generated
	 */
	void setAPourSituationRadiationSituationRadiation(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Materiel Evenement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Materiel Evenement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Materiel Evenement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMateriel_EstSujetAssociationMaterielEvenement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_Materiel' target_entity='type_AssociationMaterielEvenement'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationMaterielEvenement'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationMaterielEvenement();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Materiel Site</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Materiel Site</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Materiel Site</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMateriel_EstSujetAssociationMaterielSite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_Materiel' target_entity='type_AssociationMaterielSite'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationMaterielSite'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationMaterielSite();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Materiel Personne</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Materiel Personne</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Materiel Personne</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMateriel_EstSujetAssociationMaterielPersonne()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_Materiel' target_entity='type_AssociationMaterielPersonne'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationMaterielPersonne'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationMaterielPersonne();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Materiel Materiel</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Materiel Materiel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Materiel Materiel</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMateriel_EstObjetAssociationMaterielMateriel()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_Materiel' target_entity='type_AssociationMaterielMateriel'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationMaterielMateriel'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationMaterielMateriel();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Materiel Materiel</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Materiel Materiel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Materiel Materiel</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMateriel_EstSujetAssociationMaterielMateriel()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_Materiel' target_entity='type_AssociationMaterielMateriel'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationMaterielMateriel'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationMaterielMateriel();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Materiel Elt Ctrl</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Materiel Elt Ctrl</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Materiel Elt Ctrl</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMateriel_EstSujetAssociationMaterielEltCtrl()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_Materiel' target_entity='type_AssociationMaterielEltCtrl'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationMaterielEltCtrl'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationMaterielEltCtrl();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Elt Ctrl Materiel</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Elt Ctrl Materiel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Elt Ctrl Materiel</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMateriel_EstObjetAssociationEltCtrlMateriel()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_Materiel' target_entity='type_AssociationEltCtrlMateriel'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationEltCtrlMateriel'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationEltCtrlMateriel();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Materiel Elt Topo</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Materiel Elt Topo</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Materiel Elt Topo</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMateriel_EstSujetAssociationMaterielEltTopo()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_Materiel' target_entity='type_AssociationMaterielEltTopo'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationMaterielEltTopo'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationMaterielEltTopo();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Site Materiel</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Site Materiel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Site Materiel</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMateriel_EstObjetAssociationSiteMateriel()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_Materiel' target_entity='type_AssociationSiteMateriel'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationSiteMateriel'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationSiteMateriel();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Personne Materiel</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Personne Materiel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Personne Materiel</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMateriel_EstObjetAssociationPersonneMateriel()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_Materiel' target_entity='type_AssociationPersonneMateriel'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationPersonneMateriel'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationPersonneMateriel();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Materiel Objet Inconnu</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Materiel Objet Inconnu</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Materiel Objet Inconnu</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMateriel_EstSujetAssociationMaterielObjetInconnu()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_Materiel' target_entity='type_AssociationMaterielObjetInconnu'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationMaterielObjetInconnu'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationMaterielObjetInconnu();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Materiel Meteorologie</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Materiel Meteorologie</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Materiel Meteorologie</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMateriel_EstSujetAssociationMaterielMeteorologie()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_Materiel' target_entity='type_AssociationMaterielMeteorologie'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationMaterielMeteorologie'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationMaterielMeteorologie();

} // TypeMateriel
