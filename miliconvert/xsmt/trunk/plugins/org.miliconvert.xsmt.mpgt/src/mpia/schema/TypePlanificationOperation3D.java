/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Planification Operation3 D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypePlanificationOperation3D#getNumeroSerieMessage <em>Numero Serie Message</em>}</li>
 *   <li>{@link mpia.schema.TypePlanificationOperation3D#getEstSujetAssociationPlanificationOperation3DMissionAir <em>Est Sujet Association Planification Operation3 DMission Air</em>}</li>
 *   <li>{@link mpia.schema.TypePlanificationOperation3D#getEstSujetAssociationPlanificationOperation3DMissionASA <em>Est Sujet Association Planification Operation3 DMission ASA</em>}</li>
 *   <li>{@link mpia.schema.TypePlanificationOperation3D#getAPourUniteExecutanteUnite <em>APour Unite Executante Unite</em>}</li>
 *   <li>{@link mpia.schema.TypePlanificationOperation3D#getAPourTypeRessourceRessourceActiviteTypeRessourceActiviteType <em>APour Type Ressource Ressource Activite Type Ressource Activite Type</em>}</li>
 *   <li>{@link mpia.schema.TypePlanificationOperation3D#getEstObjetAssociationPersonnePlanifOperation3D <em>Est Objet Association Personne Planif Operation3 D</em>}</li>
 *   <li>{@link mpia.schema.TypePlanificationOperation3D#getEstObjetAssociationUnitePlanifOperation3D <em>Est Objet Association Unite Planif Operation3 D</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypePlanificationOperation3D()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_PlanificationOperation3D' kind='elementOnly'"
 * @generated
 */
public interface TypePlanificationOperation3D extends TypeMission {
	/**
	 * Returns the value of the '<em><b>Numero Serie Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Serie Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Serie Message</em>' attribute.
	 * @see #isSetNumeroSerieMessage()
	 * @see #unsetNumeroSerieMessage()
	 * @see #setNumeroSerieMessage(long)
	 * @see mpia.schema.SchemaPackage#getTypePlanificationOperation3D_NumeroSerieMessage()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='NumeroSerieMessage'"
	 * @generated
	 */
	long getNumeroSerieMessage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePlanificationOperation3D#getNumeroSerieMessage <em>Numero Serie Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Serie Message</em>' attribute.
	 * @see #isSetNumeroSerieMessage()
	 * @see #unsetNumeroSerieMessage()
	 * @see #getNumeroSerieMessage()
	 * @generated
	 */
	void setNumeroSerieMessage(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePlanificationOperation3D#getNumeroSerieMessage <em>Numero Serie Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumeroSerieMessage()
	 * @see #getNumeroSerieMessage()
	 * @see #setNumeroSerieMessage(long)
	 * @generated
	 */
	void unsetNumeroSerieMessage();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePlanificationOperation3D#getNumeroSerieMessage <em>Numero Serie Message</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Numero Serie Message</em>' attribute is set.
	 * @see #unsetNumeroSerieMessage()
	 * @see #getNumeroSerieMessage()
	 * @see #setNumeroSerieMessage(long)
	 * @generated
	 */
	boolean isSetNumeroSerieMessage();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Planification Operation3 DMission Air</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Planification Operation3 DMission Air</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Planification Operation3 DMission Air</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePlanificationOperation3D_EstSujetAssociationPlanificationOperation3DMissionAir()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeSujet_PlanificationOperation3D' target_entity='type_AssociationPlanificationOperation3DMissionAir'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationPlanificationOperation3DMissionAir'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationPlanificationOperation3DMissionAir();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Planification Operation3 DMission ASA</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Planification Operation3 DMission ASA</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Planification Operation3 DMission ASA</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePlanificationOperation3D_EstSujetAssociationPlanificationOperation3DMissionASA()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeSujet_PlanificationOperation3D' target_entity='type_AssociationPlanificationOperation3DMissionASA'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationPlanificationOperation3DMissionASA'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationPlanificationOperation3DMissionASA();

	/**
	 * Returns the value of the '<em><b>APour Unite Executante Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Unite Executante Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Unite Executante Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePlanificationOperation3D_APourUniteExecutanteUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourUniteExecutante_Unite'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourUniteExecutanteUnite();

	/**
	 * Returns the value of the '<em><b>APour Type Ressource Ressource Activite Type Ressource Activite Type</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeRessourceActiviteType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Type Ressource Ressource Activite Type Ressource Activite Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Type Ressource Ressource Activite Type Ressource Activite Type</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePlanificationOperation3D_APourTypeRessourceRessourceActiviteTypeRessourceActiviteType()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_RessourceActiviteType'"
	 *        extendedMetaData="kind='element' name='APourTypeRessource_RessourceActiviteType_RessourceActiviteType'"
	 * @generated
	 */
	EList<TypeRessourceActiviteType> getAPourTypeRessourceRessourceActiviteTypeRessourceActiviteType();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Personne Planif Operation3 D</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Personne Planif Operation3 D</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Personne Planif Operation3 D</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePlanificationOperation3D_EstObjetAssociationPersonnePlanifOperation3D()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_PlanificationOperation3D' target_entity='type_AssociationPersonnePlanifOperation3D'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationPersonnePlanifOperation3D'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationPersonnePlanifOperation3D();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Unite Planif Operation3 D</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Unite Planif Operation3 D</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Unite Planif Operation3 D</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePlanificationOperation3D_EstObjetAssociationUnitePlanifOperation3D()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_PlanificationOperation3D' target_entity='type_AssociationUnitePlanifOperation3D'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationUnitePlanifOperation3D'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationUnitePlanifOperation3D();

} // TypePlanificationOperation3D
