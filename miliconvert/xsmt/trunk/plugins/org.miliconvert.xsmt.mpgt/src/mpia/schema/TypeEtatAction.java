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
 * A representation of the model object '<em><b>Type Etat Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEtatAction#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatAction#getEtatAvancement <em>Etat Avancement</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatAction#getDegreAchevement <em>Degre Achevement</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatAction#isPlanifie <em>Planifie</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatAction#isFeinte <em>Feinte</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatAction#getQualificatifRapport <em>Qualificatif Rapport</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatAction#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatAction#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatAction#getEstRapporteParRapport <em>Est Rapporte Par Rapport</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEtatAction()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_EtatAction' kind='elementOnly'"
 * @generated
 */
public interface TypeEtatAction extends EObject {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatActionCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatActionCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoEtatActionCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeEtatAction_Categorie()
	 * @model unsettable="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoEtatActionCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatAction#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatActionCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoEtatActionCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatAction#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoEtatActionCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatAction#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoEtatActionCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Etat Avancement</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatActionEtatAvancement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat Avancement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat Avancement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatActionEtatAvancement
	 * @see #isSetEtatAvancement()
	 * @see #unsetEtatAvancement()
	 * @see #setEtatAvancement(TypeDictionaryDicoEtatActionEtatAvancement)
	 * @see mpia.schema.SchemaPackage#getTypeEtatAction_EtatAvancement()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='EtatAvancement'"
	 * @generated
	 */
	TypeDictionaryDicoEtatActionEtatAvancement getEtatAvancement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatAction#getEtatAvancement <em>Etat Avancement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat Avancement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatActionEtatAvancement
	 * @see #isSetEtatAvancement()
	 * @see #unsetEtatAvancement()
	 * @see #getEtatAvancement()
	 * @generated
	 */
	void setEtatAvancement(TypeDictionaryDicoEtatActionEtatAvancement value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatAction#getEtatAvancement <em>Etat Avancement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEtatAvancement()
	 * @see #getEtatAvancement()
	 * @see #setEtatAvancement(TypeDictionaryDicoEtatActionEtatAvancement)
	 * @generated
	 */
	void unsetEtatAvancement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatAction#getEtatAvancement <em>Etat Avancement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Etat Avancement</em>' attribute is set.
	 * @see #unsetEtatAvancement()
	 * @see #getEtatAvancement()
	 * @see #setEtatAvancement(TypeDictionaryDicoEtatActionEtatAvancement)
	 * @generated
	 */
	boolean isSetEtatAvancement();

	/**
	 * Returns the value of the '<em><b>Degre Achevement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Degre Achevement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degre Achevement</em>' attribute.
	 * @see #isSetDegreAchevement()
	 * @see #unsetDegreAchevement()
	 * @see #setDegreAchevement(double)
	 * @see mpia.schema.SchemaPackage#getTypeEtatAction_DegreAchevement()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeFraction"
	 *        extendedMetaData="kind='element' name='DegreAchevement'"
	 * @generated
	 */
	double getDegreAchevement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatAction#getDegreAchevement <em>Degre Achevement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degre Achevement</em>' attribute.
	 * @see #isSetDegreAchevement()
	 * @see #unsetDegreAchevement()
	 * @see #getDegreAchevement()
	 * @generated
	 */
	void setDegreAchevement(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatAction#getDegreAchevement <em>Degre Achevement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDegreAchevement()
	 * @see #getDegreAchevement()
	 * @see #setDegreAchevement(double)
	 * @generated
	 */
	void unsetDegreAchevement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatAction#getDegreAchevement <em>Degre Achevement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Degre Achevement</em>' attribute is set.
	 * @see #unsetDegreAchevement()
	 * @see #getDegreAchevement()
	 * @see #setDegreAchevement(double)
	 * @generated
	 */
	boolean isSetDegreAchevement();

	/**
	 * Returns the value of the '<em><b>Planifie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Planifie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planifie</em>' attribute.
	 * @see #isSetPlanifie()
	 * @see #unsetPlanifie()
	 * @see #setPlanifie(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeEtatAction_Planifie()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='Planifie'"
	 * @generated
	 */
	boolean isPlanifie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatAction#isPlanifie <em>Planifie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planifie</em>' attribute.
	 * @see #isSetPlanifie()
	 * @see #unsetPlanifie()
	 * @see #isPlanifie()
	 * @generated
	 */
	void setPlanifie(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatAction#isPlanifie <em>Planifie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPlanifie()
	 * @see #isPlanifie()
	 * @see #setPlanifie(boolean)
	 * @generated
	 */
	void unsetPlanifie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatAction#isPlanifie <em>Planifie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Planifie</em>' attribute is set.
	 * @see #unsetPlanifie()
	 * @see #isPlanifie()
	 * @see #setPlanifie(boolean)
	 * @generated
	 */
	boolean isSetPlanifie();

	/**
	 * Returns the value of the '<em><b>Feinte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feinte</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feinte</em>' attribute.
	 * @see #isSetFeinte()
	 * @see #unsetFeinte()
	 * @see #setFeinte(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeEtatAction_Feinte()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='Feinte'"
	 * @generated
	 */
	boolean isFeinte();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatAction#isFeinte <em>Feinte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feinte</em>' attribute.
	 * @see #isSetFeinte()
	 * @see #unsetFeinte()
	 * @see #isFeinte()
	 * @generated
	 */
	void setFeinte(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatAction#isFeinte <em>Feinte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFeinte()
	 * @see #isFeinte()
	 * @see #setFeinte(boolean)
	 * @generated
	 */
	void unsetFeinte();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatAction#isFeinte <em>Feinte</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Feinte</em>' attribute is set.
	 * @see #unsetFeinte()
	 * @see #isFeinte()
	 * @see #setFeinte(boolean)
	 * @generated
	 */
	boolean isSetFeinte();

	/**
	 * Returns the value of the '<em><b>Qualificatif Rapport</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatActionQualificatifRapport}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualificatif Rapport</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualificatif Rapport</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatActionQualificatifRapport
	 * @see #isSetQualificatifRapport()
	 * @see #unsetQualificatifRapport()
	 * @see #setQualificatifRapport(TypeDictionaryDicoEtatActionQualificatifRapport)
	 * @see mpia.schema.SchemaPackage#getTypeEtatAction_QualificatifRapport()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='QualificatifRapport'"
	 * @generated
	 */
	TypeDictionaryDicoEtatActionQualificatifRapport getQualificatifRapport();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatAction#getQualificatifRapport <em>Qualificatif Rapport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualificatif Rapport</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatActionQualificatifRapport
	 * @see #isSetQualificatifRapport()
	 * @see #unsetQualificatifRapport()
	 * @see #getQualificatifRapport()
	 * @generated
	 */
	void setQualificatifRapport(TypeDictionaryDicoEtatActionQualificatifRapport value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatAction#getQualificatifRapport <em>Qualificatif Rapport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQualificatifRapport()
	 * @see #getQualificatifRapport()
	 * @see #setQualificatifRapport(TypeDictionaryDicoEtatActionQualificatifRapport)
	 * @generated
	 */
	void unsetQualificatifRapport();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatAction#getQualificatifRapport <em>Qualificatif Rapport</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Qualificatif Rapport</em>' attribute is set.
	 * @see #unsetQualificatifRapport()
	 * @see #getQualificatifRapport()
	 * @see #setQualificatifRapport(TypeDictionaryDicoEtatActionQualificatifRapport)
	 * @generated
	 */
	boolean isSetQualificatifRapport();

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
	 * @see mpia.schema.SchemaPackage#getTypeEtatAction_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatAction#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeEtatAction_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatAction#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Est Rapporte Par Rapport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Rapporte Par Rapport</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Rapporte Par Rapport</em>' containment reference.
	 * @see #setEstRapporteParRapport(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeEtatAction_EstRapporteParRapport()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Rapport'"
	 *        extendedMetaData="kind='element' name='EstRapportePar_Rapport'"
	 * @generated
	 */
	TypeAssociation getEstRapporteParRapport();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatAction#getEstRapporteParRapport <em>Est Rapporte Par Rapport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Rapporte Par Rapport</em>' containment reference.
	 * @see #getEstRapporteParRapport()
	 * @generated
	 */
	void setEstRapporteParRapport(TypeAssociation value);

} // TypeEtatAction
