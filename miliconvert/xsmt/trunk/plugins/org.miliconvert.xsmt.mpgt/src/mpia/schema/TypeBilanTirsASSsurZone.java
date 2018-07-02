/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Bilan Tirs AS Ssur Zone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeBilanTirsASSsurZone#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeBilanTirsASSsurZone#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeBilanTirsASSsurZone#getEstEffectueSurAutreElementControle <em>Est Effectue Sur Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeBilanTirsASSsurZone#getAPourEffetDemandeEffetTactiqueRecherche <em>APour Effet Demande Effet Tactique Recherche</em>}</li>
 *   <li>{@link mpia.schema.TypeBilanTirsASSsurZone#getConstateEffetConstate <em>Constate Effet Constate</em>}</li>
 *   <li>{@link mpia.schema.TypeBilanTirsASSsurZone#getRendCompteUtilisationVolumeMunitionsASS <em>Rend Compte Utilisation Volume Munitions ASS</em>}</li>
 *   <li>{@link mpia.schema.TypeBilanTirsASSsurZone#getRendCompteTirsParObjectif <em>Rend Compte Tirs Par Objectif</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeBilanTirsASSsurZone()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_BilanTirsASSsurZone' kind='elementOnly'"
 * @generated
 */
public interface TypeBilanTirsASSsurZone extends EObject {
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
	 * @see mpia.schema.SchemaPackage#getTypeBilanTirsASSsurZone_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBilanTirsASSsurZone#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeBilanTirsASSsurZone_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBilanTirsASSsurZone#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Est Effectue Sur Autre Element Controle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Effectue Sur Autre Element Controle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Effectue Sur Autre Element Controle</em>' containment reference.
	 * @see #setEstEffectueSurAutreElementControle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeBilanTirsASSsurZone_EstEffectueSurAutreElementControle()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='EstEffectueSur_AutreElementControle'"
	 * @generated
	 */
	TypeAssociation getEstEffectueSurAutreElementControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBilanTirsASSsurZone#getEstEffectueSurAutreElementControle <em>Est Effectue Sur Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Effectue Sur Autre Element Controle</em>' containment reference.
	 * @see #getEstEffectueSurAutreElementControle()
	 * @generated
	 */
	void setEstEffectueSurAutreElementControle(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Effet Demande Effet Tactique Recherche</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeEffetTactiqueRecherche}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Effet Demande Effet Tactique Recherche</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Effet Demande Effet Tactique Recherche</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeBilanTirsASSsurZone_APourEffetDemandeEffetTactiqueRecherche()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_EffetTactiqueRecherche'"
	 *        extendedMetaData="kind='element' name='APourEffetDemande_EffetTactiqueRecherche'"
	 * @generated
	 */
	EList<TypeEffetTactiqueRecherche> getAPourEffetDemandeEffetTactiqueRecherche();

	/**
	 * Returns the value of the '<em><b>Constate Effet Constate</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeEffetConstate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constate Effet Constate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constate Effet Constate</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeBilanTirsASSsurZone_ConstateEffetConstate()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_EffetConstate'"
	 *        extendedMetaData="kind='element' name='Constate_EffetConstate'"
	 * @generated
	 */
	EList<TypeEffetConstate> getConstateEffetConstate();

	/**
	 * Returns the value of the '<em><b>Rend Compte Utilisation Volume Munitions ASS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rend Compte Utilisation Volume Munitions ASS</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rend Compte Utilisation Volume Munitions ASS</em>' containment reference.
	 * @see #setRendCompteUtilisationVolumeMunitionsASS(TypeVolumeMunitionsASS)
	 * @see mpia.schema.SchemaPackage#getTypeBilanTirsASSsurZone_RendCompteUtilisationVolumeMunitionsASS()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_VolumeMunitionsASS'"
	 *        extendedMetaData="kind='element' name='RendCompteUtilisation_VolumeMunitionsASS'"
	 * @generated
	 */
	TypeVolumeMunitionsASS getRendCompteUtilisationVolumeMunitionsASS();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBilanTirsASSsurZone#getRendCompteUtilisationVolumeMunitionsASS <em>Rend Compte Utilisation Volume Munitions ASS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rend Compte Utilisation Volume Munitions ASS</em>' containment reference.
	 * @see #getRendCompteUtilisationVolumeMunitionsASS()
	 * @generated
	 */
	void setRendCompteUtilisationVolumeMunitionsASS(TypeVolumeMunitionsASS value);

	/**
	 * Returns the value of the '<em><b>Rend Compte Tirs Par Objectif</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeTirsParObjectif}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rend Compte Tirs Par Objectif</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rend Compte Tirs Par Objectif</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeBilanTirsASSsurZone_RendCompteTirsParObjectif()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_TirsParObjectif'"
	 *        extendedMetaData="kind='element' name='RendCompte_TirsParObjectif'"
	 * @generated
	 */
	EList<TypeTirsParObjectif> getRendCompteTirsParObjectif();

} // TypeBilanTirsASSsurZone
