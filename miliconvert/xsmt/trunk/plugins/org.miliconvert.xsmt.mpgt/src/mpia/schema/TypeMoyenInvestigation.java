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
 * A representation of the model object '<em><b>Type Moyen Investigation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMoyenInvestigation#getHorairePretSurNouvellePosition <em>Horaire Pret Sur Nouvelle Position</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyenInvestigation#getDisponibiliteProchaineMission <em>Disponibilite Prochaine Mission</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyenInvestigation#getIncidentsMiseEnPlace <em>Incidents Mise En Place</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyenInvestigation#getNombreMissionsPossibles <em>Nombre Missions Possibles</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyenInvestigation#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyenInvestigation#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyenInvestigation#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyenInvestigation#getAPourTypeCapteurMisEnOeuvreTypeCapteur <em>APour Type Capteur Mis En Oeuvre Type Capteur</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyenInvestigation#getAPourZoneDeploiementAutreElementControle <em>APour Zone Deploiement Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyenInvestigation#getAPourZoneACouvrirOuLigneAAtteindreAutreElementControle <em>APour Zone ACouvrir Ou Ligne AAtteindre Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyenInvestigation#getAPourZoneCouverteZoneCouverte <em>APour Zone Couverte Zone Couverte</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMoyenInvestigation()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_MoyenInvestigation' kind='elementOnly'"
 * @generated
 */
public interface TypeMoyenInvestigation extends EObject {
	/**
	 * Returns the value of the '<em><b>Horaire Pret Sur Nouvelle Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Horaire Pret Sur Nouvelle Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horaire Pret Sur Nouvelle Position</em>' attribute.
	 * @see #setHorairePretSurNouvellePosition(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeMoyenInvestigation_HorairePretSurNouvellePosition()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='HorairePretSurNouvellePosition'"
	 * @generated
	 */
	XMLGregorianCalendar getHorairePretSurNouvellePosition();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyenInvestigation#getHorairePretSurNouvellePosition <em>Horaire Pret Sur Nouvelle Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horaire Pret Sur Nouvelle Position</em>' attribute.
	 * @see #getHorairePretSurNouvellePosition()
	 * @generated
	 */
	void setHorairePretSurNouvellePosition(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Disponibilite Prochaine Mission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disponibilite Prochaine Mission</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disponibilite Prochaine Mission</em>' attribute.
	 * @see #setDisponibiliteProchaineMission(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeMoyenInvestigation_DisponibiliteProchaineMission()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DisponibiliteProchaineMission'"
	 * @generated
	 */
	XMLGregorianCalendar getDisponibiliteProchaineMission();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyenInvestigation#getDisponibiliteProchaineMission <em>Disponibilite Prochaine Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disponibilite Prochaine Mission</em>' attribute.
	 * @see #getDisponibiliteProchaineMission()
	 * @generated
	 */
	void setDisponibiliteProchaineMission(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Incidents Mise En Place</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incidents Mise En Place</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incidents Mise En Place</em>' attribute.
	 * @see #setIncidentsMiseEnPlace(String)
	 * @see mpia.schema.SchemaPackage#getTypeMoyenInvestigation_IncidentsMiseEnPlace()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='IncidentsMiseEnPlace'"
	 * @generated
	 */
	String getIncidentsMiseEnPlace();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyenInvestigation#getIncidentsMiseEnPlace <em>Incidents Mise En Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incidents Mise En Place</em>' attribute.
	 * @see #getIncidentsMiseEnPlace()
	 * @generated
	 */
	void setIncidentsMiseEnPlace(String value);

	/**
	 * Returns the value of the '<em><b>Nombre Missions Possibles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Missions Possibles</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Missions Possibles</em>' attribute.
	 * @see #isSetNombreMissionsPossibles()
	 * @see #unsetNombreMissionsPossibles()
	 * @see #setNombreMissionsPossibles(long)
	 * @see mpia.schema.SchemaPackage#getTypeMoyenInvestigation_NombreMissionsPossibles()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='NombreMissionsPossibles'"
	 * @generated
	 */
	long getNombreMissionsPossibles();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyenInvestigation#getNombreMissionsPossibles <em>Nombre Missions Possibles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Missions Possibles</em>' attribute.
	 * @see #isSetNombreMissionsPossibles()
	 * @see #unsetNombreMissionsPossibles()
	 * @see #getNombreMissionsPossibles()
	 * @generated
	 */
	void setNombreMissionsPossibles(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMoyenInvestigation#getNombreMissionsPossibles <em>Nombre Missions Possibles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreMissionsPossibles()
	 * @see #getNombreMissionsPossibles()
	 * @see #setNombreMissionsPossibles(long)
	 * @generated
	 */
	void unsetNombreMissionsPossibles();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMoyenInvestigation#getNombreMissionsPossibles <em>Nombre Missions Possibles</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Missions Possibles</em>' attribute is set.
	 * @see #unsetNombreMissionsPossibles()
	 * @see #getNombreMissionsPossibles()
	 * @see #setNombreMissionsPossibles(long)
	 * @generated
	 */
	boolean isSetNombreMissionsPossibles();

	/**
	 * Returns the value of the '<em><b>Commentaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commentaire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commentaire</em>' attribute.
	 * @see #setCommentaire(String)
	 * @see mpia.schema.SchemaPackage#getTypeMoyenInvestigation_Commentaire()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='Commentaire'"
	 * @generated
	 */
	String getCommentaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyenInvestigation#getCommentaire <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commentaire</em>' attribute.
	 * @see #getCommentaire()
	 * @generated
	 */
	void setCommentaire(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeMoyenInvestigation_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyenInvestigation#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeMoyenInvestigation_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyenInvestigation#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>APour Type Capteur Mis En Oeuvre Type Capteur</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Type Capteur Mis En Oeuvre Type Capteur</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Type Capteur Mis En Oeuvre Type Capteur</em>' containment reference.
	 * @see #setAPourTypeCapteurMisEnOeuvreTypeCapteur(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeMoyenInvestigation_APourTypeCapteurMisEnOeuvreTypeCapteur()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeCapteur'"
	 *        extendedMetaData="kind='element' name='APourTypeCapteurMisEnOeuvre_TypeCapteur'"
	 * @generated
	 */
	TypeAssociation getAPourTypeCapteurMisEnOeuvreTypeCapteur();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyenInvestigation#getAPourTypeCapteurMisEnOeuvreTypeCapteur <em>APour Type Capteur Mis En Oeuvre Type Capteur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Type Capteur Mis En Oeuvre Type Capteur</em>' containment reference.
	 * @see #getAPourTypeCapteurMisEnOeuvreTypeCapteur()
	 * @generated
	 */
	void setAPourTypeCapteurMisEnOeuvreTypeCapteur(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Zone Deploiement Autre Element Controle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Zone Deploiement Autre Element Controle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Zone Deploiement Autre Element Controle</em>' containment reference.
	 * @see #setAPourZoneDeploiementAutreElementControle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeMoyenInvestigation_APourZoneDeploiementAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='APourZoneDeploiement_AutreElementControle'"
	 * @generated
	 */
	TypeAssociation getAPourZoneDeploiementAutreElementControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyenInvestigation#getAPourZoneDeploiementAutreElementControle <em>APour Zone Deploiement Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Zone Deploiement Autre Element Controle</em>' containment reference.
	 * @see #getAPourZoneDeploiementAutreElementControle()
	 * @generated
	 */
	void setAPourZoneDeploiementAutreElementControle(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Zone ACouvrir Ou Ligne AAtteindre Autre Element Controle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Zone ACouvrir Ou Ligne AAtteindre Autre Element Controle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Zone ACouvrir Ou Ligne AAtteindre Autre Element Controle</em>' containment reference.
	 * @see #setAPourZoneACouvrirOuLigneAAtteindreAutreElementControle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeMoyenInvestigation_APourZoneACouvrirOuLigneAAtteindreAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='APourZoneACouvrirOuLigneAAtteindre_AutreElementControle'"
	 * @generated
	 */
	TypeAssociation getAPourZoneACouvrirOuLigneAAtteindreAutreElementControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyenInvestigation#getAPourZoneACouvrirOuLigneAAtteindreAutreElementControle <em>APour Zone ACouvrir Ou Ligne AAtteindre Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Zone ACouvrir Ou Ligne AAtteindre Autre Element Controle</em>' containment reference.
	 * @see #getAPourZoneACouvrirOuLigneAAtteindreAutreElementControle()
	 * @generated
	 */
	void setAPourZoneACouvrirOuLigneAAtteindreAutreElementControle(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Zone Couverte Zone Couverte</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeZoneCouverte}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Zone Couverte Zone Couverte</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Zone Couverte Zone Couverte</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMoyenInvestigation_APourZoneCouverteZoneCouverte()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ZoneCouverte'"
	 *        extendedMetaData="kind='element' name='APourZoneCouverte_ZoneCouverte'"
	 * @generated
	 */
	EList<TypeZoneCouverte> getAPourZoneCouverteZoneCouverte();

} // TypeMoyenInvestigation
