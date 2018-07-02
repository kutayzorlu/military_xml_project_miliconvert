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
 * A representation of the model object '<em><b>Type Appui Feu Helicoptere</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAppuiFeuHelicoptere#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAppuiFeuHelicoptere#getEffetRecherche <em>Effet Recherche</em>}</li>
 *   <li>{@link mpia.schema.TypeAppuiFeuHelicoptere#getEffectifATransporter <em>Effectif ATransporter</em>}</li>
 *   <li>{@link mpia.schema.TypeAppuiFeuHelicoptere#getEstObjetAssociationUniteAppuiFeuHelicoptere <em>Est Objet Association Unite Appui Feu Helicoptere</em>}</li>
 *   <li>{@link mpia.schema.TypeAppuiFeuHelicoptere#getACommePointLimitePresenceENIAutreElementControle <em>AComme Point Limite Presence ENI Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeAppuiFeuHelicoptere#getAPourZoneRecoOuPointRendezVousAutreElementControle <em>APour Zone Reco Ou Point Rendez Vous Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeAppuiFeuHelicoptere#getEstDirigeContreObservation <em>Est Dirige Contre Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAppuiFeuHelicoptere()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AppuiFeuHelicoptere' kind='elementOnly'"
 * @generated
 */
public interface TypeAppuiFeuHelicoptere extends TypeMission {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAppuiFeuHelicoptereCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAppuiFeuHelicoptereCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAppuiFeuHelicoptereCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAppuiFeuHelicoptere_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAppuiFeuHelicoptereCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAppuiFeuHelicoptere#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAppuiFeuHelicoptereCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAppuiFeuHelicoptereCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAppuiFeuHelicoptere#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAppuiFeuHelicoptereCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAppuiFeuHelicoptere#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAppuiFeuHelicoptereCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Effet Recherche</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAppuiFeuHelicoptereEffetRecherche}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effet Recherche</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effet Recherche</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAppuiFeuHelicoptereEffetRecherche
	 * @see #isSetEffetRecherche()
	 * @see #unsetEffetRecherche()
	 * @see #setEffetRecherche(TypeDictionaryDicoAppuiFeuHelicoptereEffetRecherche)
	 * @see mpia.schema.SchemaPackage#getTypeAppuiFeuHelicoptere_EffetRecherche()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='EffetRecherche'"
	 * @generated
	 */
	TypeDictionaryDicoAppuiFeuHelicoptereEffetRecherche getEffetRecherche();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAppuiFeuHelicoptere#getEffetRecherche <em>Effet Recherche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effet Recherche</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAppuiFeuHelicoptereEffetRecherche
	 * @see #isSetEffetRecherche()
	 * @see #unsetEffetRecherche()
	 * @see #getEffetRecherche()
	 * @generated
	 */
	void setEffetRecherche(TypeDictionaryDicoAppuiFeuHelicoptereEffetRecherche value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAppuiFeuHelicoptere#getEffetRecherche <em>Effet Recherche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEffetRecherche()
	 * @see #getEffetRecherche()
	 * @see #setEffetRecherche(TypeDictionaryDicoAppuiFeuHelicoptereEffetRecherche)
	 * @generated
	 */
	void unsetEffetRecherche();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAppuiFeuHelicoptere#getEffetRecherche <em>Effet Recherche</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Effet Recherche</em>' attribute is set.
	 * @see #unsetEffetRecherche()
	 * @see #getEffetRecherche()
	 * @see #setEffetRecherche(TypeDictionaryDicoAppuiFeuHelicoptereEffetRecherche)
	 * @generated
	 */
	boolean isSetEffetRecherche();

	/**
	 * Returns the value of the '<em><b>Effectif ATransporter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effectif ATransporter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effectif ATransporter</em>' attribute.
	 * @see #isSetEffectifATransporter()
	 * @see #unsetEffectifATransporter()
	 * @see #setEffectifATransporter(long)
	 * @see mpia.schema.SchemaPackage#getTypeAppuiFeuHelicoptere_EffectifATransporter()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='EffectifATransporter'"
	 * @generated
	 */
	long getEffectifATransporter();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAppuiFeuHelicoptere#getEffectifATransporter <em>Effectif ATransporter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effectif ATransporter</em>' attribute.
	 * @see #isSetEffectifATransporter()
	 * @see #unsetEffectifATransporter()
	 * @see #getEffectifATransporter()
	 * @generated
	 */
	void setEffectifATransporter(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAppuiFeuHelicoptere#getEffectifATransporter <em>Effectif ATransporter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEffectifATransporter()
	 * @see #getEffectifATransporter()
	 * @see #setEffectifATransporter(long)
	 * @generated
	 */
	void unsetEffectifATransporter();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAppuiFeuHelicoptere#getEffectifATransporter <em>Effectif ATransporter</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Effectif ATransporter</em>' attribute is set.
	 * @see #unsetEffectifATransporter()
	 * @see #getEffectifATransporter()
	 * @see #setEffectifATransporter(long)
	 * @generated
	 */
	boolean isSetEffectifATransporter();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Unite Appui Feu Helicoptere</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Unite Appui Feu Helicoptere</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Unite Appui Feu Helicoptere</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeAppuiFeuHelicoptere_EstObjetAssociationUniteAppuiFeuHelicoptere()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_AppuiFeuHelicoptere' target_entity='type_AssociationUniteAppuiFeuHelicoptere'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationUniteAppuiFeuHelicoptere'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationUniteAppuiFeuHelicoptere();

	/**
	 * Returns the value of the '<em><b>AComme Point Limite Presence ENI Autre Element Controle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Point Limite Presence ENI Autre Element Controle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Point Limite Presence ENI Autre Element Controle</em>' containment reference.
	 * @see #setACommePointLimitePresenceENIAutreElementControle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAppuiFeuHelicoptere_ACommePointLimitePresenceENIAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='ACommePointLimitePresenceENI_AutreElementControle'"
	 * @generated
	 */
	TypeAssociation getACommePointLimitePresenceENIAutreElementControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAppuiFeuHelicoptere#getACommePointLimitePresenceENIAutreElementControle <em>AComme Point Limite Presence ENI Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Point Limite Presence ENI Autre Element Controle</em>' containment reference.
	 * @see #getACommePointLimitePresenceENIAutreElementControle()
	 * @generated
	 */
	void setACommePointLimitePresenceENIAutreElementControle(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Zone Reco Ou Point Rendez Vous Autre Element Controle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Zone Reco Ou Point Rendez Vous Autre Element Controle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Zone Reco Ou Point Rendez Vous Autre Element Controle</em>' containment reference.
	 * @see #setAPourZoneRecoOuPointRendezVousAutreElementControle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAppuiFeuHelicoptere_APourZoneRecoOuPointRendezVousAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='APourZoneRecoOuPointRendezVous_AutreElementControle'"
	 * @generated
	 */
	TypeAssociation getAPourZoneRecoOuPointRendezVousAutreElementControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAppuiFeuHelicoptere#getAPourZoneRecoOuPointRendezVousAutreElementControle <em>APour Zone Reco Ou Point Rendez Vous Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Zone Reco Ou Point Rendez Vous Autre Element Controle</em>' containment reference.
	 * @see #getAPourZoneRecoOuPointRendezVousAutreElementControle()
	 * @generated
	 */
	void setAPourZoneRecoOuPointRendezVousAutreElementControle(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Est Dirige Contre Observation</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Dirige Contre Observation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Dirige Contre Observation</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeAppuiFeuHelicoptere_EstDirigeContreObservation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Observation'"
	 *        extendedMetaData="kind='element' name='EstDirigeContre_Observation'"
	 * @generated
	 */
	EList<TypeAssociation> getEstDirigeContreObservation();

} // TypeAppuiFeuHelicoptere
