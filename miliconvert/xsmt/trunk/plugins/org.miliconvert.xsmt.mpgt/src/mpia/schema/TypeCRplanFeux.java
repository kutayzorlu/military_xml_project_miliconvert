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
 * A representation of the model object '<em><b>Type CRplan Feux</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeCRplanFeux#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeCRplanFeux#getMotifsNonExecution <em>Motifs Non Execution</em>}</li>
 *   <li>{@link mpia.schema.TypeCRplanFeux#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeCRplanFeux#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeCRplanFeux#getConcerneObjectifCiblage <em>Concerne Objectif Ciblage</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeCRplanFeux()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_CRplanFeux' kind='elementOnly'"
 * @generated
 */
public interface TypeCRplanFeux extends EObject {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCRtraitementObjectifCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCRtraitementObjectifCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoCRtraitementObjectifCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeCRplanFeux_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoCRtraitementObjectifCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCRplanFeux#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCRtraitementObjectifCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoCRtraitementObjectifCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCRplanFeux#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoCRtraitementObjectifCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCRplanFeux#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoCRtraitementObjectifCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Motifs Non Execution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Motifs Non Execution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Motifs Non Execution</em>' attribute.
	 * @see #setMotifsNonExecution(String)
	 * @see mpia.schema.SchemaPackage#getTypeCRplanFeux_MotifsNonExecution()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='MotifsNonExecution'"
	 * @generated
	 */
	String getMotifsNonExecution();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCRplanFeux#getMotifsNonExecution <em>Motifs Non Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Motifs Non Execution</em>' attribute.
	 * @see #getMotifsNonExecution()
	 * @generated
	 */
	void setMotifsNonExecution(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeCRplanFeux_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCRplanFeux#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeCRplanFeux_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCRplanFeux#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Concerne Objectif Ciblage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Objectif Ciblage</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Objectif Ciblage</em>' containment reference.
	 * @see #setConcerneObjectifCiblage(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeCRplanFeux_ConcerneObjectifCiblage()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_ObjectifCiblage'"
	 *        extendedMetaData="kind='element' name='Concerne_ObjectifCiblage'"
	 * @generated
	 */
	TypeAssociation getConcerneObjectifCiblage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCRplanFeux#getConcerneObjectifCiblage <em>Concerne Objectif Ciblage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concerne Objectif Ciblage</em>' containment reference.
	 * @see #getConcerneObjectifCiblage()
	 * @generated
	 */
	void setConcerneObjectifCiblage(TypeAssociation value);

} // TypeCRplanFeux
