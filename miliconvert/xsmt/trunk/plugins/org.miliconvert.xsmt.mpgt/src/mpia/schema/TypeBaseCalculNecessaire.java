/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeDuree;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Base Calcul Necessaire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeBaseCalculNecessaire#getDureeEmploi <em>Duree Emploi</em>}</li>
 *   <li>{@link mpia.schema.TypeBaseCalculNecessaire#getNbreGroupe <em>Nbre Groupe</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeBaseCalculNecessaire()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_BaseCalculNecessaire' kind='elementOnly'"
 * @generated
 */
public interface TypeBaseCalculNecessaire extends EObject {
	/**
	 * Returns the value of the '<em><b>Duree Emploi</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duree Emploi</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duree Emploi</em>' containment reference.
	 * @see #setDureeEmploi(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypeBaseCalculNecessaire_DureeEmploi()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DureeEmploi'"
	 * @generated
	 */
	TypeDataTypeDuree getDureeEmploi();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBaseCalculNecessaire#getDureeEmploi <em>Duree Emploi</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duree Emploi</em>' containment reference.
	 * @see #getDureeEmploi()
	 * @generated
	 */
	void setDureeEmploi(TypeDataTypeDuree value);

	/**
	 * Returns the value of the '<em><b>Nbre Groupe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nbre Groupe</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nbre Groupe</em>' attribute.
	 * @see #isSetNbreGroupe()
	 * @see #unsetNbreGroupe()
	 * @see #setNbreGroupe(long)
	 * @see mpia.schema.SchemaPackage#getTypeBaseCalculNecessaire_NbreGroupe()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NbreGroupe'"
	 * @generated
	 */
	long getNbreGroupe();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBaseCalculNecessaire#getNbreGroupe <em>Nbre Groupe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nbre Groupe</em>' attribute.
	 * @see #isSetNbreGroupe()
	 * @see #unsetNbreGroupe()
	 * @see #getNbreGroupe()
	 * @generated
	 */
	void setNbreGroupe(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeBaseCalculNecessaire#getNbreGroupe <em>Nbre Groupe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNbreGroupe()
	 * @see #getNbreGroupe()
	 * @see #setNbreGroupe(long)
	 * @generated
	 */
	void unsetNbreGroupe();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeBaseCalculNecessaire#getNbreGroupe <em>Nbre Groupe</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nbre Groupe</em>' attribute is set.
	 * @see #unsetNbreGroupe()
	 * @see #getNbreGroupe()
	 * @see #setNbreGroupe(long)
	 * @generated
	 */
	boolean isSetNbreGroupe();

} // TypeBaseCalculNecessaire
