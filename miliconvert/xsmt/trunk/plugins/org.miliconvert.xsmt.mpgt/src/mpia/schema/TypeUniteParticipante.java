/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociationEXT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Unite Participante</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeUniteParticipante#getNombreMaximalObjectifs <em>Nombre Maximal Objectifs</em>}</li>
 *   <li>{@link mpia.schema.TypeUniteParticipante#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.TypeUniteParticipante#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeUniteParticipante#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeUniteParticipante#getEstUnite <em>Est Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeUniteParticipante#getAPourMoyensTirQuantiteMoyensTirASS <em>APour Moyens Tir Quantite Moyens Tir ASS</em>}</li>
 *   <li>{@link mpia.schema.TypeUniteParticipante#getAPourVolumeMunitionsVolumeMunitionsASS <em>APour Volume Munitions Volume Munitions ASS</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeUniteParticipante()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_UniteParticipante' kind='elementOnly'"
 * @generated
 */
public interface TypeUniteParticipante extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre Maximal Objectifs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Maximal Objectifs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Maximal Objectifs</em>' attribute.
	 * @see #isSetNombreMaximalObjectifs()
	 * @see #unsetNombreMaximalObjectifs()
	 * @see #setNombreMaximalObjectifs(long)
	 * @see mpia.schema.SchemaPackage#getTypeUniteParticipante_NombreMaximalObjectifs()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NombreMaximalObjectifs'"
	 * @generated
	 */
	long getNombreMaximalObjectifs();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUniteParticipante#getNombreMaximalObjectifs <em>Nombre Maximal Objectifs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Maximal Objectifs</em>' attribute.
	 * @see #isSetNombreMaximalObjectifs()
	 * @see #unsetNombreMaximalObjectifs()
	 * @see #getNombreMaximalObjectifs()
	 * @generated
	 */
	void setNombreMaximalObjectifs(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeUniteParticipante#getNombreMaximalObjectifs <em>Nombre Maximal Objectifs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreMaximalObjectifs()
	 * @see #getNombreMaximalObjectifs()
	 * @see #setNombreMaximalObjectifs(long)
	 * @generated
	 */
	void unsetNombreMaximalObjectifs();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeUniteParticipante#getNombreMaximalObjectifs <em>Nombre Maximal Objectifs</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Maximal Objectifs</em>' attribute is set.
	 * @see #unsetNombreMaximalObjectifs()
	 * @see #getNombreMaximalObjectifs()
	 * @see #setNombreMaximalObjectifs(long)
	 * @generated
	 */
	boolean isSetNombreMaximalObjectifs();

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
	 * @see mpia.schema.SchemaPackage#getTypeUniteParticipante_Commentaire()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='Commentaire'"
	 * @generated
	 */
	String getCommentaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUniteParticipante#getCommentaire <em>Commentaire</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeUniteParticipante_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUniteParticipante#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeUniteParticipante_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUniteParticipante#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Est Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Unite</em>' containment reference.
	 * @see #setEstUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeUniteParticipante_EstUnite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='Est_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getEstUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUniteParticipante#getEstUnite <em>Est Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Unite</em>' containment reference.
	 * @see #getEstUnite()
	 * @generated
	 */
	void setEstUnite(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>APour Moyens Tir Quantite Moyens Tir ASS</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeQuantiteMoyensTirASS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Moyens Tir Quantite Moyens Tir ASS</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Moyens Tir Quantite Moyens Tir ASS</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUniteParticipante_APourMoyensTirQuantiteMoyensTirASS()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_QuantiteMoyensTirASS'"
	 *        extendedMetaData="kind='element' name='APourMoyensTir_QuantiteMoyensTirASS'"
	 * @generated
	 */
	EList<TypeQuantiteMoyensTirASS> getAPourMoyensTirQuantiteMoyensTirASS();

	/**
	 * Returns the value of the '<em><b>APour Volume Munitions Volume Munitions ASS</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeVolumeMunitionsASS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Volume Munitions Volume Munitions ASS</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Volume Munitions Volume Munitions ASS</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUniteParticipante_APourVolumeMunitionsVolumeMunitionsASS()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_VolumeMunitionsASS'"
	 *        extendedMetaData="kind='element' name='APourVolumeMunitions_VolumeMunitionsASS'"
	 * @generated
	 */
	EList<TypeVolumeMunitionsASS> getAPourVolumeMunitionsVolumeMunitionsASS();

} // TypeUniteParticipante
