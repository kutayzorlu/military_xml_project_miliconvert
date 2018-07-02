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
 * A representation of the model object '<em><b>Type Association Contexte Rapport</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationContexteRapport#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationContexteRapport#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationContexteRapport#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationContexteRapport#getAssocieCommeRapportRapport <em>Associe Comme Rapport Rapport</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationContexteRapport#getAssocieCommeContexteContexte <em>Associe Comme Contexte Contexte</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationContexteRapport()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationContexteRapport' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationContexteRapport extends EObject {
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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationContexteRapport_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationContexteRapport#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationContexteRapport_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationContexteRapport#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationContexteRapportCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationContexteRapportCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationContexteRapportCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationContexteRapport_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationContexteRapportCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationContexteRapport#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationContexteRapportCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationContexteRapportCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationContexteRapport#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationContexteRapportCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationContexteRapport#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationContexteRapportCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Associe Comme Rapport Rapport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Rapport Rapport</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Rapport Rapport</em>' containment reference.
	 * @see #setAssocieCommeRapportRapport(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationContexteRapport_AssocieCommeRapportRapport()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstPlaceDans_AssociationContexteRapport' target_entity='type_Rapport'"
	 *        extendedMetaData="kind='element' name='AssocieCommeRapport_Rapport'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeRapportRapport();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationContexteRapport#getAssocieCommeRapportRapport <em>Associe Comme Rapport Rapport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Rapport Rapport</em>' containment reference.
	 * @see #getAssocieCommeRapportRapport()
	 * @generated
	 */
	void setAssocieCommeRapportRapport(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Associe Comme Contexte Contexte</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Contexte Contexte</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Contexte Contexte</em>' containment reference.
	 * @see #setAssocieCommeContexteContexte(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationContexteRapport_AssocieCommeContexteContexte()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='FournitContextePour_AssociationContexteRapport' target_entity='type_Contexte'"
	 *        extendedMetaData="kind='element' name='AssocieCommeContexte_Contexte'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeContexteContexte();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationContexteRapport#getAssocieCommeContexteContexte <em>Associe Comme Contexte Contexte</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Contexte Contexte</em>' containment reference.
	 * @see #getAssocieCommeContexteContexte()
	 * @generated
	 */
	void setAssocieCommeContexteContexte(TypeAssociation value);

} // TypeAssociationContexteRapport
