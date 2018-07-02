/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Unite Logistique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeUniteLogistique#getAbonnements <em>Abonnements</em>}</li>
 *   <li>{@link mpia.schema.TypeUniteLogistique#getModalitesParticulieresFonctionnement <em>Modalites Particulieres Fonctionnement</em>}</li>
 *   <li>{@link mpia.schema.TypeUniteLogistique#getCapacitesTechniques <em>Capacites Techniques</em>}</li>
 *   <li>{@link mpia.schema.TypeUniteLogistique#getAssureSoutienRattachementOuAbonnement <em>Assure Soutien Rattachement Ou Abonnement</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeUniteLogistique()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_UniteLogistique' kind='elementOnly'"
 * @generated
 */
public interface TypeUniteLogistique extends EObject {
	/**
	 * Returns the value of the '<em><b>Abonnements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abonnements</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abonnements</em>' attribute.
	 * @see #setAbonnements(String)
	 * @see mpia.schema.SchemaPackage#getTypeUniteLogistique_Abonnements()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='Abonnements'"
	 * @generated
	 */
	String getAbonnements();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUniteLogistique#getAbonnements <em>Abonnements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abonnements</em>' attribute.
	 * @see #getAbonnements()
	 * @generated
	 */
	void setAbonnements(String value);

	/**
	 * Returns the value of the '<em><b>Modalites Particulieres Fonctionnement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modalites Particulieres Fonctionnement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modalites Particulieres Fonctionnement</em>' attribute.
	 * @see #setModalitesParticulieresFonctionnement(String)
	 * @see mpia.schema.SchemaPackage#getTypeUniteLogistique_ModalitesParticulieresFonctionnement()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='ModalitesParticulieresFonctionnement'"
	 * @generated
	 */
	String getModalitesParticulieresFonctionnement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUniteLogistique#getModalitesParticulieresFonctionnement <em>Modalites Particulieres Fonctionnement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modalites Particulieres Fonctionnement</em>' attribute.
	 * @see #getModalitesParticulieresFonctionnement()
	 * @generated
	 */
	void setModalitesParticulieresFonctionnement(String value);

	/**
	 * Returns the value of the '<em><b>Capacites Techniques</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacites Techniques</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacites Techniques</em>' attribute.
	 * @see #setCapacitesTechniques(String)
	 * @see mpia.schema.SchemaPackage#getTypeUniteLogistique_CapacitesTechniques()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='CapacitesTechniques'"
	 * @generated
	 */
	String getCapacitesTechniques();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUniteLogistique#getCapacitesTechniques <em>Capacites Techniques</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacites Techniques</em>' attribute.
	 * @see #getCapacitesTechniques()
	 * @generated
	 */
	void setCapacitesTechniques(String value);

	/**
	 * Returns the value of the '<em><b>Assure Soutien Rattachement Ou Abonnement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeRattachementOuAbonnement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assure Soutien Rattachement Ou Abonnement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assure Soutien Rattachement Ou Abonnement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUniteLogistique_AssureSoutienRattachementOuAbonnement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_RattachementOuAbonnement'"
	 *        extendedMetaData="kind='element' name='AssureSoutien_RattachementOuAbonnement'"
	 * @generated
	 */
	EList<TypeRattachementOuAbonnement> getAssureSoutienRattachementOuAbonnement();

} // TypeUniteLogistique
