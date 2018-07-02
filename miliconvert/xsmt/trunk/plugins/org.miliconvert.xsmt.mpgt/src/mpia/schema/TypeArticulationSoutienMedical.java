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
 * A representation of the model object '<em><b>Type Articulation Soutien Medical</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeArticulationSoutienMedical#getComplement <em>Complement</em>}</li>
 *   <li>{@link mpia.schema.TypeArticulationSoutienMedical#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeArticulationSoutienMedical#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeArticulationSoutienMedical#getAPourUniteSoutienMedicalAffecteeUnite <em>APour Unite Soutien Medical Affectee Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeArticulationSoutienMedical#getAPourUniteDeploiementInitialUnite <em>APour Unite Deploiement Initial Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeArticulationSoutienMedical#getAPourMoyensEnRenforcementPrelevementDetachement <em>APour Moyens En Renforcement Prelevement Detachement</em>}</li>
 *   <li>{@link mpia.schema.TypeArticulationSoutienMedical#getAPourMoyenEnReserveMoyenPourSoutienMedical <em>APour Moyen En Reserve Moyen Pour Soutien Medical</em>}</li>
 *   <li>{@link mpia.schema.TypeArticulationSoutienMedical#getAPourForceAffecteeNonIdentifieeQuantiteTypeUnite <em>APour Force Affectee Non Identifiee Quantite Type Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeArticulationSoutienMedical()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_ArticulationSoutienMedical' kind='elementOnly'"
 * @generated
 */
public interface TypeArticulationSoutienMedical extends EObject {
	/**
	 * Returns the value of the '<em><b>Complement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complement</em>' attribute.
	 * @see #setComplement(String)
	 * @see mpia.schema.SchemaPackage#getTypeArticulationSoutienMedical_Complement()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='Complement'"
	 * @generated
	 */
	String getComplement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeArticulationSoutienMedical#getComplement <em>Complement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complement</em>' attribute.
	 * @see #getComplement()
	 * @generated
	 */
	void setComplement(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeArticulationSoutienMedical_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeArticulationSoutienMedical#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeArticulationSoutienMedical_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeArticulationSoutienMedical#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>APour Unite Soutien Medical Affectee Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociationEXT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Unite Soutien Medical Affectee Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Unite Soutien Medical Affectee Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeArticulationSoutienMedical_APourUniteSoutienMedicalAffecteeUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourUniteSoutienMedicalAffectee_Unite'"
	 * @generated
	 */
	EList<TypeAssociationEXT> getAPourUniteSoutienMedicalAffecteeUnite();

	/**
	 * Returns the value of the '<em><b>APour Unite Deploiement Initial Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociationEXT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Unite Deploiement Initial Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Unite Deploiement Initial Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeArticulationSoutienMedical_APourUniteDeploiementInitialUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourUniteDeploiementInitial_Unite'"
	 * @generated
	 */
	EList<TypeAssociationEXT> getAPourUniteDeploiementInitialUnite();

	/**
	 * Returns the value of the '<em><b>APour Moyens En Renforcement Prelevement Detachement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Moyens En Renforcement Prelevement Detachement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Moyens En Renforcement Prelevement Detachement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeArticulationSoutienMedical_APourMoyensEnRenforcementPrelevementDetachement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_PrelevementDetachement'"
	 *        extendedMetaData="kind='element' name='APourMoyensEnRenforcement_PrelevementDetachement'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourMoyensEnRenforcementPrelevementDetachement();

	/**
	 * Returns the value of the '<em><b>APour Moyen En Reserve Moyen Pour Soutien Medical</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeMoyenPourSoutienMedical}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Moyen En Reserve Moyen Pour Soutien Medical</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Moyen En Reserve Moyen Pour Soutien Medical</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeArticulationSoutienMedical_APourMoyenEnReserveMoyenPourSoutienMedical()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_MoyenPourSoutienMedical'"
	 *        extendedMetaData="kind='element' name='APourMoyenEnReserve_MoyenPourSoutienMedical'"
	 * @generated
	 */
	EList<TypeMoyenPourSoutienMedical> getAPourMoyenEnReserveMoyenPourSoutienMedical();

	/**
	 * Returns the value of the '<em><b>APour Force Affectee Non Identifiee Quantite Type Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeQuantiteTypeUnite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Force Affectee Non Identifiee Quantite Type Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Force Affectee Non Identifiee Quantite Type Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeArticulationSoutienMedical_APourForceAffecteeNonIdentifieeQuantiteTypeUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_QuantiteTypeUnite'"
	 *        extendedMetaData="kind='element' name='APourForceAffecteeNonIdentifiee_QuantiteTypeUnite'"
	 * @generated
	 */
	EList<TypeQuantiteTypeUnite> getAPourForceAffecteeNonIdentifieeQuantiteTypeUnite();

} // TypeArticulationSoutienMedical
