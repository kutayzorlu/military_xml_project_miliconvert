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
 * A representation of the model object '<em><b>Type Intervention Generale</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeInterventionGenerale#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeInterventionGenerale#getSousCategorie <em>Sous Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeInterventionGenerale#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeInterventionGenerale#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeInterventionGenerale#getAPourDonneurOrdreUnite <em>APour Donneur Ordre Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeInterventionGenerale#getConcernePlanFeuxPlanFeux <em>Concerne Plan Feux Plan Feux</em>}</li>
 *   <li>{@link mpia.schema.TypeInterventionGenerale#getConcerneObjectifObjectifCiblage <em>Concerne Objectif Objectif Ciblage</em>}</li>
 *   <li>{@link mpia.schema.TypeInterventionGenerale#getConcernePlanTraitementObjectifsPlanTraitementObjectifs <em>Concerne Plan Traitement Objectifs Plan Traitement Objectifs</em>}</li>
 *   <li>{@link mpia.schema.TypeInterventionGenerale#getConcerneTraitementObjectifTraitementObjectif <em>Concerne Traitement Objectif Traitement Objectif</em>}</li>
 *   <li>{@link mpia.schema.TypeInterventionGenerale#getConcerneZoneAutreElementControle <em>Concerne Zone Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeInterventionGenerale#getConcerneUniteUnite <em>Concerne Unite Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeInterventionGenerale()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_InterventionGenerale' kind='elementOnly'"
 * @generated
 */
public interface TypeInterventionGenerale extends EObject {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoInterventionGeneraleCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoInterventionGeneraleCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoInterventionGeneraleCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeInterventionGenerale_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoInterventionGeneraleCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeInterventionGenerale#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoInterventionGeneraleCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoInterventionGeneraleCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeInterventionGenerale#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoInterventionGeneraleCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeInterventionGenerale#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoInterventionGeneraleCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Sous Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoDirectiveControle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sous Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sous Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDirectiveControle
	 * @see #isSetSousCategorie()
	 * @see #unsetSousCategorie()
	 * @see #setSousCategorie(TypeDictionaryDicoDirectiveControle)
	 * @see mpia.schema.SchemaPackage#getTypeInterventionGenerale_SousCategorie()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='SousCategorie'"
	 * @generated
	 */
	TypeDictionaryDicoDirectiveControle getSousCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeInterventionGenerale#getSousCategorie <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sous Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDirectiveControle
	 * @see #isSetSousCategorie()
	 * @see #unsetSousCategorie()
	 * @see #getSousCategorie()
	 * @generated
	 */
	void setSousCategorie(TypeDictionaryDicoDirectiveControle value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeInterventionGenerale#getSousCategorie <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSousCategorie()
	 * @see #getSousCategorie()
	 * @see #setSousCategorie(TypeDictionaryDicoDirectiveControle)
	 * @generated
	 */
	void unsetSousCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeInterventionGenerale#getSousCategorie <em>Sous Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sous Categorie</em>' attribute is set.
	 * @see #unsetSousCategorie()
	 * @see #getSousCategorie()
	 * @see #setSousCategorie(TypeDictionaryDicoDirectiveControle)
	 * @generated
	 */
	boolean isSetSousCategorie();

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
	 * @see mpia.schema.SchemaPackage#getTypeInterventionGenerale_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeInterventionGenerale#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeInterventionGenerale_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeInterventionGenerale#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>APour Donneur Ordre Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Donneur Ordre Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Donneur Ordre Unite</em>' containment reference.
	 * @see #setAPourDonneurOrdreUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeInterventionGenerale_APourDonneurOrdreUnite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='Emet_InterventionGenerale' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourDonneurOrdre_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getAPourDonneurOrdreUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeInterventionGenerale#getAPourDonneurOrdreUnite <em>APour Donneur Ordre Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Donneur Ordre Unite</em>' containment reference.
	 * @see #getAPourDonneurOrdreUnite()
	 * @generated
	 */
	void setAPourDonneurOrdreUnite(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>Concerne Plan Feux Plan Feux</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Plan Feux Plan Feux</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Plan Feux Plan Feux</em>' containment reference.
	 * @see #setConcernePlanFeuxPlanFeux(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeInterventionGenerale_ConcernePlanFeuxPlanFeux()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourInterventionGenerale_InterventionGenerale' target_entity='type_PlanFeux'"
	 *        extendedMetaData="kind='element' name='ConcernePlanFeux_PlanFeux'"
	 * @generated
	 */
	TypeAssociation getConcernePlanFeuxPlanFeux();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeInterventionGenerale#getConcernePlanFeuxPlanFeux <em>Concerne Plan Feux Plan Feux</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concerne Plan Feux Plan Feux</em>' containment reference.
	 * @see #getConcernePlanFeuxPlanFeux()
	 * @generated
	 */
	void setConcernePlanFeuxPlanFeux(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Concerne Objectif Objectif Ciblage</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Objectif Objectif Ciblage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Objectif Objectif Ciblage</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeInterventionGenerale_ConcerneObjectifObjectifCiblage()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_ObjectifCiblage'"
	 *        extendedMetaData="kind='element' name='ConcerneObjectif_ObjectifCiblage'"
	 * @generated
	 */
	EList<TypeAssociation> getConcerneObjectifObjectifCiblage();

	/**
	 * Returns the value of the '<em><b>Concerne Plan Traitement Objectifs Plan Traitement Objectifs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Plan Traitement Objectifs Plan Traitement Objectifs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Plan Traitement Objectifs Plan Traitement Objectifs</em>' containment reference.
	 * @see #setConcernePlanTraitementObjectifsPlanTraitementObjectifs(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeInterventionGenerale_ConcernePlanTraitementObjectifsPlanTraitementObjectifs()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourInterventionGenerale_InterventionGenerale' target_entity='type_PlanTraitementObjectifs'"
	 *        extendedMetaData="kind='element' name='ConcernePlanTraitementObjectifs_PlanTraitementObjectifs'"
	 * @generated
	 */
	TypeAssociation getConcernePlanTraitementObjectifsPlanTraitementObjectifs();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeInterventionGenerale#getConcernePlanTraitementObjectifsPlanTraitementObjectifs <em>Concerne Plan Traitement Objectifs Plan Traitement Objectifs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concerne Plan Traitement Objectifs Plan Traitement Objectifs</em>' containment reference.
	 * @see #getConcernePlanTraitementObjectifsPlanTraitementObjectifs()
	 * @generated
	 */
	void setConcernePlanTraitementObjectifsPlanTraitementObjectifs(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Concerne Traitement Objectif Traitement Objectif</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Traitement Objectif Traitement Objectif</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Traitement Objectif Traitement Objectif</em>' containment reference.
	 * @see #setConcerneTraitementObjectifTraitementObjectif(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeInterventionGenerale_ConcerneTraitementObjectifTraitementObjectif()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourInterventionGenerale_InterventionGenerale' target_entity='type_TraitementObjectif'"
	 *        extendedMetaData="kind='element' name='ConcerneTraitementObjectif_TraitementObjectif'"
	 * @generated
	 */
	TypeAssociation getConcerneTraitementObjectifTraitementObjectif();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeInterventionGenerale#getConcerneTraitementObjectifTraitementObjectif <em>Concerne Traitement Objectif Traitement Objectif</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concerne Traitement Objectif Traitement Objectif</em>' containment reference.
	 * @see #getConcerneTraitementObjectifTraitementObjectif()
	 * @generated
	 */
	void setConcerneTraitementObjectifTraitementObjectif(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Concerne Zone Autre Element Controle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Zone Autre Element Controle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Zone Autre Element Controle</em>' containment reference.
	 * @see #setConcerneZoneAutreElementControle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeInterventionGenerale_ConcerneZoneAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='ConcerneZone_AutreElementControle'"
	 * @generated
	 */
	TypeAssociation getConcerneZoneAutreElementControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeInterventionGenerale#getConcerneZoneAutreElementControle <em>Concerne Zone Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concerne Zone Autre Element Controle</em>' containment reference.
	 * @see #getConcerneZoneAutreElementControle()
	 * @generated
	 */
	void setConcerneZoneAutreElementControle(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Concerne Unite Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Unite Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Unite Unite</em>' containment reference.
	 * @see #setConcerneUniteUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeInterventionGenerale_ConcerneUniteUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='ConcerneUnite_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getConcerneUniteUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeInterventionGenerale#getConcerneUniteUnite <em>Concerne Unite Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concerne Unite Unite</em>' containment reference.
	 * @see #getConcerneUniteUnite()
	 * @generated
	 */
	void setConcerneUniteUnite(TypeAssociationEXT value);

} // TypeInterventionGenerale
