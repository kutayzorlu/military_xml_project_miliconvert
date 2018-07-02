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
 * A representation of the model object '<em><b>Type Interdiction Tir</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeInterdictionTir#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.TypeInterdictionTir#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeInterdictionTir#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeInterdictionTir#getReferenceAlerteConflit3D <em>Reference Alerte Conflit3 D</em>}</li>
 *   <li>{@link mpia.schema.TypeInterdictionTir#getVautPendantPeriode3D <em>Vaut Pendant Periode3 D</em>}</li>
 *   <li>{@link mpia.schema.TypeInterdictionTir#getConcerneMesureCoordination <em>Concerne Mesure Coordination</em>}</li>
 *   <li>{@link mpia.schema.TypeInterdictionTir#getCreeConsigne <em>Cree Consigne</em>}</li>
 *   <li>{@link mpia.schema.TypeInterdictionTir#getConcerneConsigne <em>Concerne Consigne</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeInterdictionTir()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_InterdictionTir' kind='elementOnly'"
 * @generated
 */
public interface TypeInterdictionTir extends EObject {
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
	 * @see mpia.schema.SchemaPackage#getTypeInterdictionTir_Commentaire()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='Commentaire'"
	 * @generated
	 */
	String getCommentaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeInterdictionTir#getCommentaire <em>Commentaire</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeInterdictionTir_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeInterdictionTir#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeInterdictionTir_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeInterdictionTir#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Reference Alerte Conflit3 D</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Alerte Conflit3 D</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Alerte Conflit3 D</em>' containment reference.
	 * @see #setReferenceAlerteConflit3D(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeInterdictionTir_ReferenceAlerteConflit3D()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Conflit3D'"
	 *        extendedMetaData="kind='element' name='ReferenceAlerte_Conflit3D'"
	 * @generated
	 */
	TypeAssociation getReferenceAlerteConflit3D();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeInterdictionTir#getReferenceAlerteConflit3D <em>Reference Alerte Conflit3 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Alerte Conflit3 D</em>' containment reference.
	 * @see #getReferenceAlerteConflit3D()
	 * @generated
	 */
	void setReferenceAlerteConflit3D(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Vaut Pendant Periode3 D</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vaut Pendant Periode3 D</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vaut Pendant Periode3 D</em>' containment reference.
	 * @see #setVautPendantPeriode3D(TypePeriode3D)
	 * @see mpia.schema.SchemaPackage#getTypeInterdictionTir_VautPendantPeriode3D()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Periode3D'"
	 *        extendedMetaData="kind='element' name='VautPendant_Periode3D'"
	 * @generated
	 */
	TypePeriode3D getVautPendantPeriode3D();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeInterdictionTir#getVautPendantPeriode3D <em>Vaut Pendant Periode3 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vaut Pendant Periode3 D</em>' containment reference.
	 * @see #getVautPendantPeriode3D()
	 * @generated
	 */
	void setVautPendantPeriode3D(TypePeriode3D value);

	/**
	 * Returns the value of the '<em><b>Concerne Mesure Coordination</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Mesure Coordination</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Mesure Coordination</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeInterdictionTir_ConcerneMesureCoordination()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_MesureCoordination'"
	 *        extendedMetaData="kind='element' name='Concerne_MesureCoordination'"
	 * @generated
	 */
	EList<TypeAssociation> getConcerneMesureCoordination();

	/**
	 * Returns the value of the '<em><b>Cree Consigne</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cree Consigne</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cree Consigne</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeInterdictionTir_CreeConsigne()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Consigne'"
	 *        extendedMetaData="kind='element' name='Cree_Consigne'"
	 * @generated
	 */
	EList<TypeAssociation> getCreeConsigne();

	/**
	 * Returns the value of the '<em><b>Concerne Consigne</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Consigne</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Consigne</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeInterdictionTir_ConcerneConsigne()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Consigne'"
	 *        extendedMetaData="kind='element' name='Concerne_Consigne'"
	 * @generated
	 */
	EList<TypeAssociation> getConcerneConsigne();

} // TypeInterdictionTir
