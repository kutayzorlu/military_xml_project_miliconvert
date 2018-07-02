/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Utilisation IFF</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeUtilisationIFF#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeUtilisationIFF#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeUtilisationIFF#getVautPendantPeriode3D <em>Vaut Pendant Periode3 D</em>}</li>
 *   <li>{@link mpia.schema.TypeUtilisationIFF#getPorteSurServiceReseau <em>Porte Sur Service Reseau</em>}</li>
 *   <li>{@link mpia.schema.TypeUtilisationIFF#getEstAttribueAUniteUnite <em>Est Attribue AUnite Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeUtilisationIFF#getEstAttribueAuTypeAeronefTypeAeronef <em>Est Attribue Au Type Aeronef Type Aeronef</em>}</li>
 *   <li>{@link mpia.schema.TypeUtilisationIFF#getEstAttribueAuTypeMissionAerienneTypeMissionAerienne <em>Est Attribue Au Type Mission Aerienne Type Mission Aerienne</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeUtilisationIFF()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_UtilisationIFF' kind='elementOnly'"
 * @generated
 */
public interface TypeUtilisationIFF extends EObject {
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
	 * @see mpia.schema.SchemaPackage#getTypeUtilisationIFF_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUtilisationIFF#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeUtilisationIFF_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUtilisationIFF#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeUtilisationIFF_VautPendantPeriode3D()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Periode3D'"
	 *        extendedMetaData="kind='element' name='VautPendant_Periode3D'"
	 * @generated
	 */
	TypePeriode3D getVautPendantPeriode3D();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUtilisationIFF#getVautPendantPeriode3D <em>Vaut Pendant Periode3 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vaut Pendant Periode3 D</em>' containment reference.
	 * @see #getVautPendantPeriode3D()
	 * @generated
	 */
	void setVautPendantPeriode3D(TypePeriode3D value);

	/**
	 * Returns the value of the '<em><b>Porte Sur Service Reseau</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Porte Sur Service Reseau</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Porte Sur Service Reseau</em>' containment reference.
	 * @see #setPorteSurServiceReseau(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeUtilisationIFF_PorteSurServiceReseau()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_ServiceReseau'"
	 *        extendedMetaData="kind='element' name='PorteSur_ServiceReseau'"
	 * @generated
	 */
	TypeAssociation getPorteSurServiceReseau();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUtilisationIFF#getPorteSurServiceReseau <em>Porte Sur Service Reseau</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Porte Sur Service Reseau</em>' containment reference.
	 * @see #getPorteSurServiceReseau()
	 * @generated
	 */
	void setPorteSurServiceReseau(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Est Attribue AUnite Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociationEXT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Attribue AUnite Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Attribue AUnite Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUtilisationIFF_EstAttribueAUniteUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='EstAttribueAUnite_Unite'"
	 * @generated
	 */
	EList<TypeAssociationEXT> getEstAttribueAUniteUnite();

	/**
	 * Returns the value of the '<em><b>Est Attribue Au Type Aeronef Type Aeronef</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociationEXT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Attribue Au Type Aeronef Type Aeronef</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Attribue Au Type Aeronef Type Aeronef</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUtilisationIFF_EstAttribueAuTypeAeronefTypeAeronef()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeAeronef'"
	 *        extendedMetaData="kind='element' name='EstAttribueAuTypeAeronef_TypeAeronef'"
	 * @generated
	 */
	EList<TypeAssociationEXT> getEstAttribueAuTypeAeronefTypeAeronef();

	/**
	 * Returns the value of the '<em><b>Est Attribue Au Type Mission Aerienne Type Mission Aerienne</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeTypeMissionAerienne}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Attribue Au Type Mission Aerienne Type Mission Aerienne</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Attribue Au Type Mission Aerienne Type Mission Aerienne</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUtilisationIFF_EstAttribueAuTypeMissionAerienneTypeMissionAerienne()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_TypeMissionAerienne'"
	 *        extendedMetaData="kind='element' name='EstAttribueAuTypeMissionAerienne_TypeMissionAerienne'"
	 * @generated
	 */
	EList<TypeTypeMissionAerienne> getEstAttribueAuTypeMissionAerienneTypeMissionAerienne();

} // TypeUtilisationIFF
