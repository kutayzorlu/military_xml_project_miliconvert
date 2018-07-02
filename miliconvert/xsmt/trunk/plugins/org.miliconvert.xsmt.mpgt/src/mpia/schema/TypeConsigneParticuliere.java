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
 * A representation of the model object '<em><b>Type Consigne Particuliere</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeConsigneParticuliere#getConsignes <em>Consignes</em>}</li>
 *   <li>{@link mpia.schema.TypeConsigneParticuliere#getActionsAMener <em>Actions AMener</em>}</li>
 *   <li>{@link mpia.schema.TypeConsigneParticuliere#getACommeLieuDeRegroupementAutreElementControle <em>AComme Lieu De Regroupement Autre Element Controle</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeConsigneParticuliere()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_ConsigneParticuliere' kind='elementOnly'"
 * @generated
 */
public interface TypeConsigneParticuliere extends EObject {
	/**
	 * Returns the value of the '<em><b>Consignes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consignes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consignes</em>' attribute.
	 * @see #setConsignes(String)
	 * @see mpia.schema.SchemaPackage#getTypeConsigneParticuliere_Consignes()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255" required="true"
	 *        extendedMetaData="kind='element' name='Consignes'"
	 * @generated
	 */
	String getConsignes();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsigneParticuliere#getConsignes <em>Consignes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consignes</em>' attribute.
	 * @see #getConsignes()
	 * @generated
	 */
	void setConsignes(String value);

	/**
	 * Returns the value of the '<em><b>Actions AMener</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions AMener</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions AMener</em>' attribute.
	 * @see #setActionsAMener(String)
	 * @see mpia.schema.SchemaPackage#getTypeConsigneParticuliere_ActionsAMener()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255" required="true"
	 *        extendedMetaData="kind='element' name='ActionsAMener'"
	 * @generated
	 */
	String getActionsAMener();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsigneParticuliere#getActionsAMener <em>Actions AMener</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actions AMener</em>' attribute.
	 * @see #getActionsAMener()
	 * @generated
	 */
	void setActionsAMener(String value);

	/**
	 * Returns the value of the '<em><b>AComme Lieu De Regroupement Autre Element Controle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Lieu De Regroupement Autre Element Controle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Lieu De Regroupement Autre Element Controle</em>' containment reference.
	 * @see #setACommeLieuDeRegroupementAutreElementControle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeConsigneParticuliere_ACommeLieuDeRegroupementAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='ACommeLieuDeRegroupement_AutreElementControle'"
	 * @generated
	 */
	TypeAssociation getACommeLieuDeRegroupementAutreElementControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsigneParticuliere#getACommeLieuDeRegroupementAutreElementControle <em>AComme Lieu De Regroupement Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Lieu De Regroupement Autre Element Controle</em>' containment reference.
	 * @see #getACommeLieuDeRegroupementAutreElementControle()
	 * @generated
	 */
	void setACommeLieuDeRegroupementAutreElementControle(TypeAssociation value);

} // TypeConsigneParticuliere
