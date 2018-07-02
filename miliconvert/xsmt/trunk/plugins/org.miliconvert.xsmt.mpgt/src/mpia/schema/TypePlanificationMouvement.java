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
 * A representation of the model object '<em><b>Type Planification Mouvement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypePlanificationMouvement#getIdentifiant <em>Identifiant</em>}</li>
 *   <li>{@link mpia.schema.TypePlanificationMouvement#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypePlanificationMouvement#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypePlanificationMouvement#getItinerairesItineraire <em>Itineraires Itineraire</em>}</li>
 *   <li>{@link mpia.schema.TypePlanificationMouvement#getParcoursItineraire <em>Parcours Itineraire</em>}</li>
 *   <li>{@link mpia.schema.TypePlanificationMouvement#getParametresParametresPlanification <em>Parametres Parametres Planification</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypePlanificationMouvement()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_PlanificationMouvement' kind='elementOnly'"
 * @generated
 */
public interface TypePlanificationMouvement extends EObject {
	/**
	 * Returns the value of the '<em><b>Identifiant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifiant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifiant</em>' attribute.
	 * @see #setIdentifiant(String)
	 * @see mpia.schema.SchemaPackage#getTypePlanificationMouvement_Identifiant()
	 * @model dataType="mpia.meta.TypeDataTypeChaine03"
	 *        extendedMetaData="kind='element' name='Identifiant'"
	 * @generated
	 */
	String getIdentifiant();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePlanificationMouvement#getIdentifiant <em>Identifiant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifiant</em>' attribute.
	 * @see #getIdentifiant()
	 * @generated
	 */
	void setIdentifiant(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypePlanificationMouvement_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePlanificationMouvement#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypePlanificationMouvement_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePlanificationMouvement#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Itineraires Itineraire</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Itineraires Itineraire</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Itineraires Itineraire</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePlanificationMouvement_ItinerairesItineraire()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Itineraire'"
	 *        extendedMetaData="kind='element' name='Itineraires_Itineraire'"
	 * @generated
	 */
	EList<TypeAssociation> getItinerairesItineraire();

	/**
	 * Returns the value of the '<em><b>Parcours Itineraire</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parcours Itineraire</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parcours Itineraire</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePlanificationMouvement_ParcoursItineraire()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Itineraire'"
	 *        extendedMetaData="kind='element' name='Parcours_Itineraire'"
	 * @generated
	 */
	EList<TypeAssociation> getParcoursItineraire();

	/**
	 * Returns the value of the '<em><b>Parametres Parametres Planification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parametres Parametres Planification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parametres Parametres Planification</em>' containment reference.
	 * @see #setParametresParametresPlanification(TypeParametresPlanification)
	 * @see mpia.schema.SchemaPackage#getTypePlanificationMouvement_ParametresParametresPlanification()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ParametresPlanification'"
	 *        extendedMetaData="kind='element' name='Parametres_ParametresPlanification'"
	 * @generated
	 */
	TypeParametresPlanification getParametresParametresPlanification();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePlanificationMouvement#getParametresParametresPlanification <em>Parametres Parametres Planification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parametres Parametres Planification</em>' containment reference.
	 * @see #getParametresParametresPlanification()
	 * @generated
	 */
	void setParametresParametresPlanification(TypeParametresPlanification value);

} // TypePlanificationMouvement
