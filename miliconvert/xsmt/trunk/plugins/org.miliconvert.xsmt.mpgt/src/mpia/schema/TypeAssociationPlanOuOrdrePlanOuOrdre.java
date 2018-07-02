/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeDateHeure;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Association Plan Ou Ordre Plan Ou Ordre</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationPlanOuOrdrePlanOuOrdre#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationPlanOuOrdrePlanOuOrdre#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationPlanOuOrdrePlanOuOrdre#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationPlanOuOrdrePlanOuOrdre#getDate <em>Date</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationPlanOuOrdrePlanOuOrdre#getAPourObjetPlanOuOrdre <em>APour Objet Plan Ou Ordre</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationPlanOuOrdrePlanOuOrdre#getAPourSujetPlanOuOrdre <em>APour Sujet Plan Ou Ordre</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationPlanOuOrdrePlanOuOrdre()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationPlanOuOrdrePlanOuOrdre' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationPlanOuOrdrePlanOuOrdre extends EObject {
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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationPlanOuOrdrePlanOuOrdre_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationPlanOuOrdrePlanOuOrdre#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationPlanOuOrdrePlanOuOrdre_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationPlanOuOrdrePlanOuOrdre#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationPlanOuOrdrePlanOuOrdreCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationPlanOuOrdrePlanOuOrdreCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationPlanOuOrdrePlanOuOrdreCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationPlanOuOrdrePlanOuOrdre_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationPlanOuOrdrePlanOuOrdreCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationPlanOuOrdrePlanOuOrdre#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationPlanOuOrdrePlanOuOrdreCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationPlanOuOrdrePlanOuOrdreCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationPlanOuOrdrePlanOuOrdre#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationPlanOuOrdrePlanOuOrdreCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationPlanOuOrdrePlanOuOrdre#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationPlanOuOrdrePlanOuOrdreCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(TypeDataTypeDateHeure)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationPlanOuOrdrePlanOuOrdre_Date()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Date'"
	 * @generated
	 */
	TypeDataTypeDateHeure getDate();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationPlanOuOrdrePlanOuOrdre#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(TypeDataTypeDateHeure value);

	/**
	 * Returns the value of the '<em><b>APour Objet Plan Ou Ordre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Objet Plan Ou Ordre</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Objet Plan Ou Ordre</em>' containment reference.
	 * @see #setAPourObjetPlanOuOrdre(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationPlanOuOrdrePlanOuOrdre_APourObjetPlanOuOrdre()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssociationPlanOuOrdrePlanOuOrdre' target_entity='type_PlanOuOrdre'"
	 *        extendedMetaData="kind='element' name='APourObjet_PlanOuOrdre'"
	 * @generated
	 */
	TypeAssociation getAPourObjetPlanOuOrdre();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationPlanOuOrdrePlanOuOrdre#getAPourObjetPlanOuOrdre <em>APour Objet Plan Ou Ordre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Objet Plan Ou Ordre</em>' containment reference.
	 * @see #getAPourObjetPlanOuOrdre()
	 * @generated
	 */
	void setAPourObjetPlanOuOrdre(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Sujet Plan Ou Ordre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Sujet Plan Ou Ordre</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Sujet Plan Ou Ordre</em>' containment reference.
	 * @see #setAPourSujetPlanOuOrdre(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationPlanOuOrdrePlanOuOrdre_APourSujetPlanOuOrdre()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssociationPlanOuOrdrePlanOuOrdre' target_entity='type_PlanOuOrdre'"
	 *        extendedMetaData="kind='element' name='APourSujet_PlanOuOrdre'"
	 * @generated
	 */
	TypeAssociation getAPourSujetPlanOuOrdre();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationPlanOuOrdrePlanOuOrdre#getAPourSujetPlanOuOrdre <em>APour Sujet Plan Ou Ordre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Sujet Plan Ou Ordre</em>' containment reference.
	 * @see #getAPourSujetPlanOuOrdre()
	 * @generated
	 */
	void setAPourSujetPlanOuOrdre(TypeAssociation value);

} // TypeAssociationPlanOuOrdrePlanOuOrdre
