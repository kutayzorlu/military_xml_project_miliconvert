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
 * A representation of the model object '<em><b>Type Association Activite Capacite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationActiviteCapacite#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationActiviteCapacite#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationActiviteCapacite#getQuantite <em>Quantite</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationActiviteCapacite#getAssocieCommeActiviteActivite <em>Associe Comme Activite Activite</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationActiviteCapacite#getAssocieCommeCapaciteCapacite <em>Associe Comme Capacite Capacite</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationActiviteCapacite()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationActiviteCapacite' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationActiviteCapacite extends EObject {
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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationActiviteCapacite_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationActiviteCapacite#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationActiviteCapacite_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationActiviteCapacite#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Quantite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite</em>' attribute.
	 * @see #isSetQuantite()
	 * @see #unsetQuantite()
	 * @see #setQuantite(double)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationActiviteCapacite_Quantite()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='Quantite'"
	 * @generated
	 */
	double getQuantite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationActiviteCapacite#getQuantite <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite</em>' attribute.
	 * @see #isSetQuantite()
	 * @see #unsetQuantite()
	 * @see #getQuantite()
	 * @generated
	 */
	void setQuantite(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationActiviteCapacite#getQuantite <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuantite()
	 * @see #getQuantite()
	 * @see #setQuantite(double)
	 * @generated
	 */
	void unsetQuantite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationActiviteCapacite#getQuantite <em>Quantite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quantite</em>' attribute is set.
	 * @see #unsetQuantite()
	 * @see #getQuantite()
	 * @see #setQuantite(double)
	 * @generated
	 */
	boolean isSetQuantite();

	/**
	 * Returns the value of the '<em><b>Associe Comme Activite Activite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Activite Activite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Activite Activite</em>' containment reference.
	 * @see #setAssocieCommeActiviteActivite(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationActiviteCapacite_AssocieCommeActiviteActivite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstActivite_AssociationActiviteCapacite' target_entity='type_Activite'"
	 *        extendedMetaData="kind='element' name='AssocieCommeActivite_Activite'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeActiviteActivite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationActiviteCapacite#getAssocieCommeActiviteActivite <em>Associe Comme Activite Activite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Activite Activite</em>' containment reference.
	 * @see #getAssocieCommeActiviteActivite()
	 * @generated
	 */
	void setAssocieCommeActiviteActivite(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Associe Comme Capacite Capacite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Capacite Capacite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Capacite Capacite</em>' containment reference.
	 * @see #setAssocieCommeCapaciteCapacite(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationActiviteCapacite_AssocieCommeCapaciteCapacite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstCapacite_AssociationActiviteCapacite' target_entity='type_Capacite'"
	 *        extendedMetaData="kind='element' name='AssocieCommeCapacite_Capacite'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeCapaciteCapacite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationActiviteCapacite#getAssocieCommeCapaciteCapacite <em>Associe Comme Capacite Capacite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Capacite Capacite</em>' containment reference.
	 * @see #getAssocieCommeCapaciteCapacite()
	 * @generated
	 */
	void setAssocieCommeCapaciteCapacite(TypeAssociation value);

} // TypeAssociationActiviteCapacite
