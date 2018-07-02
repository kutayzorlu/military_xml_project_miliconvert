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
 * A representation of the model object '<em><b>Type CRfin Mission Acquisition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeCRfinMissionAcquisition#getNombreCRenvoyes <em>Nombre CRenvoyes</em>}</li>
 *   <li>{@link mpia.schema.TypeCRfinMissionAcquisition#getNombreDemandesTir <em>Nombre Demandes Tir</em>}</li>
 *   <li>{@link mpia.schema.TypeCRfinMissionAcquisition#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.TypeCRfinMissionAcquisition#getAPourObjectifObjectifCiblage <em>APour Objectif Objectif Ciblage</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeCRfinMissionAcquisition()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_CRfinMissionAcquisition' kind='elementOnly'"
 * @generated
 */
public interface TypeCRfinMissionAcquisition extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre CRenvoyes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre CRenvoyes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre CRenvoyes</em>' attribute.
	 * @see #isSetNombreCRenvoyes()
	 * @see #unsetNombreCRenvoyes()
	 * @see #setNombreCRenvoyes(long)
	 * @see mpia.schema.SchemaPackage#getTypeCRfinMissionAcquisition_NombreCRenvoyes()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NombreCRenvoyes'"
	 * @generated
	 */
	long getNombreCRenvoyes();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCRfinMissionAcquisition#getNombreCRenvoyes <em>Nombre CRenvoyes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre CRenvoyes</em>' attribute.
	 * @see #isSetNombreCRenvoyes()
	 * @see #unsetNombreCRenvoyes()
	 * @see #getNombreCRenvoyes()
	 * @generated
	 */
	void setNombreCRenvoyes(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCRfinMissionAcquisition#getNombreCRenvoyes <em>Nombre CRenvoyes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreCRenvoyes()
	 * @see #getNombreCRenvoyes()
	 * @see #setNombreCRenvoyes(long)
	 * @generated
	 */
	void unsetNombreCRenvoyes();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCRfinMissionAcquisition#getNombreCRenvoyes <em>Nombre CRenvoyes</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre CRenvoyes</em>' attribute is set.
	 * @see #unsetNombreCRenvoyes()
	 * @see #getNombreCRenvoyes()
	 * @see #setNombreCRenvoyes(long)
	 * @generated
	 */
	boolean isSetNombreCRenvoyes();

	/**
	 * Returns the value of the '<em><b>Nombre Demandes Tir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Demandes Tir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Demandes Tir</em>' attribute.
	 * @see #isSetNombreDemandesTir()
	 * @see #unsetNombreDemandesTir()
	 * @see #setNombreDemandesTir(long)
	 * @see mpia.schema.SchemaPackage#getTypeCRfinMissionAcquisition_NombreDemandesTir()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NombreDemandesTir'"
	 * @generated
	 */
	long getNombreDemandesTir();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCRfinMissionAcquisition#getNombreDemandesTir <em>Nombre Demandes Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Demandes Tir</em>' attribute.
	 * @see #isSetNombreDemandesTir()
	 * @see #unsetNombreDemandesTir()
	 * @see #getNombreDemandesTir()
	 * @generated
	 */
	void setNombreDemandesTir(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCRfinMissionAcquisition#getNombreDemandesTir <em>Nombre Demandes Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreDemandesTir()
	 * @see #getNombreDemandesTir()
	 * @see #setNombreDemandesTir(long)
	 * @generated
	 */
	void unsetNombreDemandesTir();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCRfinMissionAcquisition#getNombreDemandesTir <em>Nombre Demandes Tir</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Demandes Tir</em>' attribute is set.
	 * @see #unsetNombreDemandesTir()
	 * @see #getNombreDemandesTir()
	 * @see #setNombreDemandesTir(long)
	 * @generated
	 */
	boolean isSetNombreDemandesTir();

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
	 * @see mpia.schema.SchemaPackage#getTypeCRfinMissionAcquisition_Commentaire()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='Commentaire'"
	 * @generated
	 */
	String getCommentaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCRfinMissionAcquisition#getCommentaire <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commentaire</em>' attribute.
	 * @see #getCommentaire()
	 * @generated
	 */
	void setCommentaire(String value);

	/**
	 * Returns the value of the '<em><b>APour Objectif Objectif Ciblage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Objectif Objectif Ciblage</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Objectif Objectif Ciblage</em>' containment reference.
	 * @see #setAPourObjectifObjectifCiblage(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeCRfinMissionAcquisition_APourObjectifObjectifCiblage()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_ObjectifCiblage'"
	 *        extendedMetaData="kind='element' name='APourObjectif_ObjectifCiblage'"
	 * @generated
	 */
	TypeAssociation getAPourObjectifObjectifCiblage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCRfinMissionAcquisition#getAPourObjectifObjectifCiblage <em>APour Objectif Objectif Ciblage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Objectif Objectif Ciblage</em>' containment reference.
	 * @see #getAPourObjectifObjectifCiblage()
	 * @generated
	 */
	void setAPourObjectifObjectifCiblage(TypeAssociation value);

} // TypeCRfinMissionAcquisition
