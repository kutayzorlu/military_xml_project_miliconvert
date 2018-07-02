/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Consommation Autorisee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeConsommationAutorisee#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.TypeConsommationAutorisee#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeConsommationAutorisee#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeConsommationAutorisee#getACommeRessourceElementaireRessourceElementaire <em>AComme Ressource Elementaire Ressource Elementaire</em>}</li>
 *   <li>{@link mpia.schema.TypeConsommationAutorisee#getEstAllouePourHoraireManoeuvre <em>Est Alloue Pour Horaire Manoeuvre</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeConsommationAutorisee()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_ConsommationAutorisee' kind='elementOnly'"
 * @generated
 */
public interface TypeConsommationAutorisee extends EObject {
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
	 * @see mpia.schema.SchemaPackage#getTypeConsommationAutorisee_Commentaire()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='Commentaire'"
	 * @generated
	 */
	String getCommentaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsommationAutorisee#getCommentaire <em>Commentaire</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeConsommationAutorisee_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsommationAutorisee#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeConsommationAutorisee_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsommationAutorisee#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>AComme Ressource Elementaire Ressource Elementaire</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Ressource Elementaire Ressource Elementaire</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Ressource Elementaire Ressource Elementaire</em>' containment reference.
	 * @see #setACommeRessourceElementaireRessourceElementaire(TypeRessourceElementaire)
	 * @see mpia.schema.SchemaPackage#getTypeConsommationAutorisee_ACommeRessourceElementaireRessourceElementaire()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_RessourceElementaire'"
	 *        extendedMetaData="kind='element' name='ACommeRessourceElementaire_RessourceElementaire'"
	 * @generated
	 */
	TypeRessourceElementaire getACommeRessourceElementaireRessourceElementaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsommationAutorisee#getACommeRessourceElementaireRessourceElementaire <em>AComme Ressource Elementaire Ressource Elementaire</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Ressource Elementaire Ressource Elementaire</em>' containment reference.
	 * @see #getACommeRessourceElementaireRessourceElementaire()
	 * @generated
	 */
	void setACommeRessourceElementaireRessourceElementaire(TypeRessourceElementaire value);

	/**
	 * Returns the value of the '<em><b>Est Alloue Pour Horaire Manoeuvre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Alloue Pour Horaire Manoeuvre</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Alloue Pour Horaire Manoeuvre</em>' containment reference.
	 * @see #setEstAllouePourHoraireManoeuvre(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeConsommationAutorisee_EstAllouePourHoraireManoeuvre()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_HoraireManoeuvre'"
	 *        extendedMetaData="kind='element' name='EstAllouePour_HoraireManoeuvre'"
	 * @generated
	 */
	TypeAssociation getEstAllouePourHoraireManoeuvre();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsommationAutorisee#getEstAllouePourHoraireManoeuvre <em>Est Alloue Pour Horaire Manoeuvre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Alloue Pour Horaire Manoeuvre</em>' containment reference.
	 * @see #getEstAllouePourHoraireManoeuvre()
	 * @generated
	 */
	void setEstAllouePourHoraireManoeuvre(TypeAssociation value);

} // TypeConsommationAutorisee
