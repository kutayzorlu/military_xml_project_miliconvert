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
 * A representation of the model object '<em><b>Type Association Consommablel Majeur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationConsommablelMajeur#isSuiviLogistique <em>Suivi Logistique</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationConsommablelMajeur#isSuiviTactique <em>Suivi Tactique</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationConsommablelMajeur#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationConsommablelMajeur#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationConsommablelMajeur#getAssocieCommeUniteUnite <em>Associe Comme Unite Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationConsommablelMajeur#getAPourQuantiteAMaintenirQuantiteMaintenir <em>APour Quantite AMaintenir Quantite Maintenir</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationConsommablelMajeur#getAssocieCommeTypeConsommableTypeConsommable <em>Associe Comme Type Consommable Type Consommable</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationConsommablelMajeur()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationConsommablelMajeur' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationConsommablelMajeur extends EObject {
	/**
	 * Returns the value of the '<em><b>Suivi Logistique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suivi Logistique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suivi Logistique</em>' attribute.
	 * @see #isSetSuiviLogistique()
	 * @see #unsetSuiviLogistique()
	 * @see #setSuiviLogistique(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationConsommablelMajeur_SuiviLogistique()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean" required="true"
	 *        extendedMetaData="kind='element' name='SuiviLogistique'"
	 * @generated
	 */
	boolean isSuiviLogistique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationConsommablelMajeur#isSuiviLogistique <em>Suivi Logistique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suivi Logistique</em>' attribute.
	 * @see #isSetSuiviLogistique()
	 * @see #unsetSuiviLogistique()
	 * @see #isSuiviLogistique()
	 * @generated
	 */
	void setSuiviLogistique(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationConsommablelMajeur#isSuiviLogistique <em>Suivi Logistique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSuiviLogistique()
	 * @see #isSuiviLogistique()
	 * @see #setSuiviLogistique(boolean)
	 * @generated
	 */
	void unsetSuiviLogistique();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationConsommablelMajeur#isSuiviLogistique <em>Suivi Logistique</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Suivi Logistique</em>' attribute is set.
	 * @see #unsetSuiviLogistique()
	 * @see #isSuiviLogistique()
	 * @see #setSuiviLogistique(boolean)
	 * @generated
	 */
	boolean isSetSuiviLogistique();

	/**
	 * Returns the value of the '<em><b>Suivi Tactique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suivi Tactique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suivi Tactique</em>' attribute.
	 * @see #isSetSuiviTactique()
	 * @see #unsetSuiviTactique()
	 * @see #setSuiviTactique(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationConsommablelMajeur_SuiviTactique()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean" required="true"
	 *        extendedMetaData="kind='element' name='SuiviTactique'"
	 * @generated
	 */
	boolean isSuiviTactique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationConsommablelMajeur#isSuiviTactique <em>Suivi Tactique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suivi Tactique</em>' attribute.
	 * @see #isSetSuiviTactique()
	 * @see #unsetSuiviTactique()
	 * @see #isSuiviTactique()
	 * @generated
	 */
	void setSuiviTactique(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationConsommablelMajeur#isSuiviTactique <em>Suivi Tactique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSuiviTactique()
	 * @see #isSuiviTactique()
	 * @see #setSuiviTactique(boolean)
	 * @generated
	 */
	void unsetSuiviTactique();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationConsommablelMajeur#isSuiviTactique <em>Suivi Tactique</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Suivi Tactique</em>' attribute is set.
	 * @see #unsetSuiviTactique()
	 * @see #isSuiviTactique()
	 * @see #setSuiviTactique(boolean)
	 * @generated
	 */
	boolean isSetSuiviTactique();

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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationConsommablelMajeur_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationConsommablelMajeur#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationConsommablelMajeur_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationConsommablelMajeur#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Associe Comme Unite Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Unite Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Unite Unite</em>' containment reference.
	 * @see #setAssocieCommeUniteUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationConsommablelMajeur_AssocieCommeUniteUnite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourConsommableMajeur_AssociationConsommableMajeur' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='AssocieCommeUnite_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getAssocieCommeUniteUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationConsommablelMajeur#getAssocieCommeUniteUnite <em>Associe Comme Unite Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Unite Unite</em>' containment reference.
	 * @see #getAssocieCommeUniteUnite()
	 * @generated
	 */
	void setAssocieCommeUniteUnite(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>APour Quantite AMaintenir Quantite Maintenir</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeQuantiteMaintenir}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Quantite AMaintenir Quantite Maintenir</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Quantite AMaintenir Quantite Maintenir</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeAssociationConsommablelMajeur_APourQuantiteAMaintenirQuantiteMaintenir()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_QuantiteMaintenir'"
	 *        extendedMetaData="kind='element' name='APourQuantiteAMaintenir_QuantiteMaintenir'"
	 * @generated
	 */
	EList<TypeQuantiteMaintenir> getAPourQuantiteAMaintenirQuantiteMaintenir();

	/**
	 * Returns the value of the '<em><b>Associe Comme Type Consommable Type Consommable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Type Consommable Type Consommable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Type Consommable Type Consommable</em>' containment reference.
	 * @see #setAssocieCommeTypeConsommableTypeConsommable(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationConsommablelMajeur_AssocieCommeTypeConsommableTypeConsommable()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstConsommableMajeur_AssociationConsommableMajeur' target_entity='type_TypeConsommable'"
	 *        extendedMetaData="kind='element' name='AssocieCommeTypeConsommable_TypeConsommable'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeTypeConsommableTypeConsommable();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationConsommablelMajeur#getAssocieCommeTypeConsommableTypeConsommable <em>Associe Comme Type Consommable Type Consommable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Type Consommable Type Consommable</em>' containment reference.
	 * @see #getAssocieCommeTypeConsommableTypeConsommable()
	 * @generated
	 */
	void setAssocieCommeTypeConsommableTypeConsommable(TypeAssociation value);

} // TypeAssociationConsommablelMajeur
