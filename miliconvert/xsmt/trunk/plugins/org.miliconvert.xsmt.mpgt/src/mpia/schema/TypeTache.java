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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Tache</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeTache#getNom <em>Nom</em>}</li>
 *   <li>{@link mpia.schema.TypeTache#getDateDebut <em>Date Debut</em>}</li>
 *   <li>{@link mpia.schema.TypeTache#getDateFin <em>Date Fin</em>}</li>
 *   <li>{@link mpia.schema.TypeTache#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.TypeTache#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeTache#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeTache#getAPourUniteResponsableUnite <em>APour Unite Responsable Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeTache#getConcerneTravailAideDeploiement <em>Concerne Travail Aide Deploiement</em>}</li>
 *   <li>{@link mpia.schema.TypeTache#getConcerneObstacle <em>Concerne Obstacle</em>}</li>
 *   <li>{@link mpia.schema.TypeTache#getConcerneOuvrageGenie <em>Concerne Ouvrage Genie</em>}</li>
 *   <li>{@link mpia.schema.TypeTache#getAPourEnginOuEffectifAffecteEffectifOuEnginAffecte <em>APour Engin Ou Effectif Affecte Effectif Ou Engin Affecte</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeTache()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_Tache' kind='elementOnly'"
 * @generated
 */
public interface TypeTache extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see mpia.schema.SchemaPackage#getTypeTache_Nom()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='Nom'"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTache#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeTache_DateDebut()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateDebut'"
	 * @generated
	 */
	XMLGregorianCalendar getDateDebut();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTache#getDateDebut <em>Date Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Debut</em>' attribute.
	 * @see #getDateDebut()
	 * @generated
	 */
	void setDateDebut(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Date Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Fin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Fin</em>' attribute.
	 * @see #setDateFin(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeTache_DateFin()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateFin'"
	 * @generated
	 */
	XMLGregorianCalendar getDateFin();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTache#getDateFin <em>Date Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Fin</em>' attribute.
	 * @see #getDateFin()
	 * @generated
	 */
	void setDateFin(XMLGregorianCalendar value);

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
	 * @see mpia.schema.SchemaPackage#getTypeTache_Commentaire()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='Commentaire'"
	 * @generated
	 */
	String getCommentaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTache#getCommentaire <em>Commentaire</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeTache_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTache#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeTache_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTache#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>APour Unite Responsable Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Unite Responsable Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Unite Responsable Unite</em>' containment reference.
	 * @see #setAPourUniteResponsableUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeTache_APourUniteResponsableUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourUniteResponsable_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getAPourUniteResponsableUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTache#getAPourUniteResponsableUnite <em>APour Unite Responsable Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Unite Responsable Unite</em>' containment reference.
	 * @see #getAPourUniteResponsableUnite()
	 * @generated
	 */
	void setAPourUniteResponsableUnite(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>Concerne Travail Aide Deploiement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Travail Aide Deploiement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Travail Aide Deploiement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeTache_ConcerneTravailAideDeploiement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TravailAideDeploiement'"
	 *        extendedMetaData="kind='element' name='Concerne_TravailAideDeploiement'"
	 * @generated
	 */
	EList<TypeAssociation> getConcerneTravailAideDeploiement();

	/**
	 * Returns the value of the '<em><b>Concerne Obstacle</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Obstacle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Obstacle</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeTache_ConcerneObstacle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Obstacle'"
	 *        extendedMetaData="kind='element' name='Concerne_Obstacle'"
	 * @generated
	 */
	EList<TypeAssociation> getConcerneObstacle();

	/**
	 * Returns the value of the '<em><b>Concerne Ouvrage Genie</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Ouvrage Genie</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Ouvrage Genie</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeTache_ConcerneOuvrageGenie()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_OuvrageGenie'"
	 *        extendedMetaData="kind='element' name='Concerne_OuvrageGenie'"
	 * @generated
	 */
	EList<TypeAssociation> getConcerneOuvrageGenie();

	/**
	 * Returns the value of the '<em><b>APour Engin Ou Effectif Affecte Effectif Ou Engin Affecte</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeEffectifOuEnginAffecte}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Engin Ou Effectif Affecte Effectif Ou Engin Affecte</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Engin Ou Effectif Affecte Effectif Ou Engin Affecte</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeTache_APourEnginOuEffectifAffecteEffectifOuEnginAffecte()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_EffectifOuEnginAffecte'"
	 *        extendedMetaData="kind='element' name='APourEnginOuEffectifAffecte_EffectifOuEnginAffecte'"
	 * @generated
	 */
	EList<TypeEffectifOuEnginAffecte> getAPourEnginOuEffectifAffecteEffectifOuEnginAffecte();

} // TypeTache
