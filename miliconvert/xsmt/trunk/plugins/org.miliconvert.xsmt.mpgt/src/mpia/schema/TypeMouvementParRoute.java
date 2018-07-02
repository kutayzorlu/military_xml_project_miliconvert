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
 * A representation of the model object '<em><b>Type Mouvement Par Route</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMouvementParRoute#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeMouvementParRoute#getCadreOperation <em>Cadre Operation</em>}</li>
 *   <li>{@link mpia.schema.TypeMouvementParRoute#getDateDebutMouvement <em>Date Debut Mouvement</em>}</li>
 *   <li>{@link mpia.schema.TypeMouvementParRoute#getDemandeParticuliere <em>Demande Particuliere</em>}</li>
 *   <li>{@link mpia.schema.TypeMouvementParRoute#getLibellePlan <em>Libelle Plan</em>}</li>
 *   <li>{@link mpia.schema.TypeMouvementParRoute#getNomCodeMouvement <em>Nom Code Mouvement</em>}</li>
 *   <li>{@link mpia.schema.TypeMouvementParRoute#getNomCodePlan <em>Nom Code Plan</em>}</li>
 *   <li>{@link mpia.schema.TypeMouvementParRoute#getResponsableAttributionMouvement <em>Responsable Attribution Mouvement</em>}</li>
 *   <li>{@link mpia.schema.TypeMouvementParRoute#getEstSujetAssociationMouvementParRouteMouvementParRoute <em>Est Sujet Association Mouvement Par Route Mouvement Par Route</em>}</li>
 *   <li>{@link mpia.schema.TypeMouvementParRoute#getEstObjetAssociationMouvementParRouteMouvementParRoute <em>Est Objet Association Mouvement Par Route Mouvement Par Route</em>}</li>
 *   <li>{@link mpia.schema.TypeMouvementParRoute#getEstObjetAssociationConvoiMouvementParRoute <em>Est Objet Association Convoi Mouvement Par Route</em>}</li>
 *   <li>{@link mpia.schema.TypeMouvementParRoute#getAPourContraintesMouvementContraintesMouvement <em>APour Contraintes Mouvement Contraintes Mouvement</em>}</li>
 *   <li>{@link mpia.schema.TypeMouvementParRoute#getADonneLieuAuCompteRenduMouvementCompteRenduMouvement <em>ADonne Lieu Au Compte Rendu Mouvement Compte Rendu Mouvement</em>}</li>
 *   <li>{@link mpia.schema.TypeMouvementParRoute#getAPourIncidentMouvementIncidentMouvement <em>APour Incident Mouvement Incident Mouvement</em>}</li>
 *   <li>{@link mpia.schema.TypeMouvementParRoute#getAPourUniteFaisantMouvementUnite <em>APour Unite Faisant Mouvement Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeMouvementParRoute#getAPourItineraireItineraire <em>APour Itineraire Itineraire</em>}</li>
 *   <li>{@link mpia.schema.TypeMouvementParRoute#getEstObjetAssociationUniteMouvementParRoute <em>Est Objet Association Unite Mouvement Par Route</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMouvementParRoute()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_MouvementParRoute' kind='elementOnly'"
 * @generated
 */
public interface TypeMouvementParRoute extends TypeActivite {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoMouvementParRouteCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMouvementParRouteCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoMouvementParRouteCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeMouvementParRoute_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoMouvementParRouteCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMouvementParRoute#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMouvementParRouteCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoMouvementParRouteCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMouvementParRoute#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoMouvementParRouteCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMouvementParRoute#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoMouvementParRouteCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Cadre Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cadre Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cadre Operation</em>' attribute.
	 * @see #setCadreOperation(String)
	 * @see mpia.schema.SchemaPackage#getTypeMouvementParRoute_CadreOperation()
	 * @model dataType="mpia.meta.TypeDataTypeChaine050"
	 *        extendedMetaData="kind='element' name='CadreOperation'"
	 * @generated
	 */
	String getCadreOperation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMouvementParRoute#getCadreOperation <em>Cadre Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cadre Operation</em>' attribute.
	 * @see #getCadreOperation()
	 * @generated
	 */
	void setCadreOperation(String value);

	/**
	 * Returns the value of the '<em><b>Date Debut Mouvement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Debut Mouvement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Debut Mouvement</em>' attribute.
	 * @see #setDateDebutMouvement(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeMouvementParRoute_DateDebutMouvement()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateDebutMouvement'"
	 * @generated
	 */
	XMLGregorianCalendar getDateDebutMouvement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMouvementParRoute#getDateDebutMouvement <em>Date Debut Mouvement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Debut Mouvement</em>' attribute.
	 * @see #getDateDebutMouvement()
	 * @generated
	 */
	void setDateDebutMouvement(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Demande Particuliere</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Demande Particuliere</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Demande Particuliere</em>' attribute.
	 * @see #setDemandeParticuliere(String)
	 * @see mpia.schema.SchemaPackage#getTypeMouvementParRoute_DemandeParticuliere()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='DemandeParticuliere'"
	 * @generated
	 */
	String getDemandeParticuliere();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMouvementParRoute#getDemandeParticuliere <em>Demande Particuliere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Demande Particuliere</em>' attribute.
	 * @see #getDemandeParticuliere()
	 * @generated
	 */
	void setDemandeParticuliere(String value);

	/**
	 * Returns the value of the '<em><b>Libelle Plan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Libelle Plan</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Libelle Plan</em>' attribute.
	 * @see #setLibellePlan(String)
	 * @see mpia.schema.SchemaPackage#getTypeMouvementParRoute_LibellePlan()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030"
	 *        extendedMetaData="kind='element' name='LibellePlan'"
	 * @generated
	 */
	String getLibellePlan();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMouvementParRoute#getLibellePlan <em>Libelle Plan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Libelle Plan</em>' attribute.
	 * @see #getLibellePlan()
	 * @generated
	 */
	void setLibellePlan(String value);

	/**
	 * Returns the value of the '<em><b>Nom Code Mouvement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom Code Mouvement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Code Mouvement</em>' attribute.
	 * @see #setNomCodeMouvement(String)
	 * @see mpia.schema.SchemaPackage#getTypeMouvementParRoute_NomCodeMouvement()
	 * @model dataType="mpia.meta.TypeDataTypeChaine050"
	 *        extendedMetaData="kind='element' name='NomCodeMouvement'"
	 * @generated
	 */
	String getNomCodeMouvement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMouvementParRoute#getNomCodeMouvement <em>Nom Code Mouvement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Code Mouvement</em>' attribute.
	 * @see #getNomCodeMouvement()
	 * @generated
	 */
	void setNomCodeMouvement(String value);

	/**
	 * Returns the value of the '<em><b>Nom Code Plan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom Code Plan</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Code Plan</em>' attribute.
	 * @see #setNomCodePlan(String)
	 * @see mpia.schema.SchemaPackage#getTypeMouvementParRoute_NomCodePlan()
	 * @model dataType="mpia.meta.TypeDataTypeChaine08"
	 *        extendedMetaData="kind='element' name='NomCodePlan'"
	 * @generated
	 */
	String getNomCodePlan();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMouvementParRoute#getNomCodePlan <em>Nom Code Plan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Code Plan</em>' attribute.
	 * @see #getNomCodePlan()
	 * @generated
	 */
	void setNomCodePlan(String value);

	/**
	 * Returns the value of the '<em><b>Responsable Attribution Mouvement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsable Attribution Mouvement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsable Attribution Mouvement</em>' attribute.
	 * @see #setResponsableAttributionMouvement(String)
	 * @see mpia.schema.SchemaPackage#getTypeMouvementParRoute_ResponsableAttributionMouvement()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='ResponsableAttributionMouvement'"
	 * @generated
	 */
	String getResponsableAttributionMouvement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMouvementParRoute#getResponsableAttributionMouvement <em>Responsable Attribution Mouvement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsable Attribution Mouvement</em>' attribute.
	 * @see #getResponsableAttributionMouvement()
	 * @generated
	 */
	void setResponsableAttributionMouvement(String value);

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Mouvement Par Route Mouvement Par Route</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Mouvement Par Route Mouvement Par Route</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Mouvement Par Route Mouvement Par Route</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMouvementParRoute_EstSujetAssociationMouvementParRouteMouvementParRoute()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeSujet_MouvementParRoute' target_entity='type_AssociationMouvementParRouteMouvementParRoute'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationMouvementParRouteMouvementParRoute'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationMouvementParRouteMouvementParRoute();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Mouvement Par Route Mouvement Par Route</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Mouvement Par Route Mouvement Par Route</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Mouvement Par Route Mouvement Par Route</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMouvementParRoute_EstObjetAssociationMouvementParRouteMouvementParRoute()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeObjet_MouvementParRoute' target_entity='type_AssociationMouvementParRouteMouvementParRoute'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationMouvementParRouteMouvementParRoute'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationMouvementParRouteMouvementParRoute();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Convoi Mouvement Par Route</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Convoi Mouvement Par Route</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Convoi Mouvement Par Route</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMouvementParRoute_EstObjetAssociationConvoiMouvementParRoute()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_MouvementParRoute' target_entity='type_AssociationConvoiMouvementParRoute'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationConvoiMouvementParRoute'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationConvoiMouvementParRoute();

	/**
	 * Returns the value of the '<em><b>APour Contraintes Mouvement Contraintes Mouvement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Contraintes Mouvement Contraintes Mouvement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Contraintes Mouvement Contraintes Mouvement</em>' containment reference.
	 * @see #setAPourContraintesMouvementContraintesMouvement(TypeContraintesMouvement)
	 * @see mpia.schema.SchemaPackage#getTypeMouvementParRoute_APourContraintesMouvementContraintesMouvement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ContraintesMouvement'"
	 *        extendedMetaData="kind='element' name='APourContraintesMouvement_ContraintesMouvement'"
	 * @generated
	 */
	TypeContraintesMouvement getAPourContraintesMouvementContraintesMouvement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMouvementParRoute#getAPourContraintesMouvementContraintesMouvement <em>APour Contraintes Mouvement Contraintes Mouvement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Contraintes Mouvement Contraintes Mouvement</em>' containment reference.
	 * @see #getAPourContraintesMouvementContraintesMouvement()
	 * @generated
	 */
	void setAPourContraintesMouvementContraintesMouvement(TypeContraintesMouvement value);

	/**
	 * Returns the value of the '<em><b>ADonne Lieu Au Compte Rendu Mouvement Compte Rendu Mouvement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeCompteRenduMouvement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ADonne Lieu Au Compte Rendu Mouvement Compte Rendu Mouvement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ADonne Lieu Au Compte Rendu Mouvement Compte Rendu Mouvement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMouvementParRoute_ADonneLieuAuCompteRenduMouvementCompteRenduMouvement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_CompteRenduMouvement'"
	 *        extendedMetaData="kind='element' name='ADonneLieuAuCompteRenduMouvement_CompteRenduMouvement'"
	 * @generated
	 */
	EList<TypeCompteRenduMouvement> getADonneLieuAuCompteRenduMouvementCompteRenduMouvement();

	/**
	 * Returns the value of the '<em><b>APour Incident Mouvement Incident Mouvement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeIncidentMouvement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Incident Mouvement Incident Mouvement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Incident Mouvement Incident Mouvement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMouvementParRoute_APourIncidentMouvementIncidentMouvement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_IncidentMouvement'"
	 *        extendedMetaData="kind='element' name='APourIncidentMouvement_IncidentMouvement'"
	 * @generated
	 */
	EList<TypeIncidentMouvement> getAPourIncidentMouvementIncidentMouvement();

	/**
	 * Returns the value of the '<em><b>APour Unite Faisant Mouvement Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Unite Faisant Mouvement Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Unite Faisant Mouvement Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMouvementParRoute_APourUniteFaisantMouvementUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourUniteFaisantMouvement_Unite'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourUniteFaisantMouvementUnite();

	/**
	 * Returns the value of the '<em><b>APour Itineraire Itineraire</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Itineraire Itineraire</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Itineraire Itineraire</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMouvementParRoute_APourItineraireItineraire()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Itineraire'"
	 *        extendedMetaData="kind='element' name='APourItineraire_Itineraire'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourItineraireItineraire();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Unite Mouvement Par Route</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Unite Mouvement Par Route</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Unite Mouvement Par Route</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMouvementParRoute_EstObjetAssociationUniteMouvementParRoute()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_MouvementParRoute' target_entity='type_AssociationUniteMouvementParRoute'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationUniteMouvementParRoute'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationUniteMouvementParRoute();

} // TypeMouvementParRoute
