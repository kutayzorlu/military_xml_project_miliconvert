/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Besoins En Renseignements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeBesoinsEnRenseignements#getPriorite <em>Priorite</em>}</li>
 *   <li>{@link mpia.schema.TypeBesoinsEnRenseignements#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeBesoinsEnRenseignements#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeBesoinsEnRenseignements#getACommeRenseignementsARechercherFaitRenseignement <em>AComme Renseignements ARechercher Fait Renseignement</em>}</li>
 *   <li>{@link mpia.schema.TypeBesoinsEnRenseignements#getAPourZoneASurveillerAutreElementControle <em>APour Zone ASurveiller Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeBesoinsEnRenseignements#getAPourConduiteATenirPrisonniersRegleEngagement <em>APour Conduite ATenir Prisonniers Regle Engagement</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeBesoinsEnRenseignements()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_BesoinsEnRenseignements' kind='elementOnly'"
 * @generated
 */
public interface TypeBesoinsEnRenseignements extends EObject {
	/**
	 * Returns the value of the '<em><b>Priorite</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoImportance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priorite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priorite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoImportance
	 * @see #isSetPriorite()
	 * @see #unsetPriorite()
	 * @see #setPriorite(TypeDictionaryDicoImportance)
	 * @see mpia.schema.SchemaPackage#getTypeBesoinsEnRenseignements_Priorite()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Priorite'"
	 * @generated
	 */
	TypeDictionaryDicoImportance getPriorite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBesoinsEnRenseignements#getPriorite <em>Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priorite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoImportance
	 * @see #isSetPriorite()
	 * @see #unsetPriorite()
	 * @see #getPriorite()
	 * @generated
	 */
	void setPriorite(TypeDictionaryDicoImportance value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeBesoinsEnRenseignements#getPriorite <em>Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPriorite()
	 * @see #getPriorite()
	 * @see #setPriorite(TypeDictionaryDicoImportance)
	 * @generated
	 */
	void unsetPriorite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeBesoinsEnRenseignements#getPriorite <em>Priorite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Priorite</em>' attribute is set.
	 * @see #unsetPriorite()
	 * @see #getPriorite()
	 * @see #setPriorite(TypeDictionaryDicoImportance)
	 * @generated
	 */
	boolean isSetPriorite();

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
	 * @see mpia.schema.SchemaPackage#getTypeBesoinsEnRenseignements_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBesoinsEnRenseignements#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeBesoinsEnRenseignements_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBesoinsEnRenseignements#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>AComme Renseignements ARechercher Fait Renseignement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Renseignements ARechercher Fait Renseignement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Renseignements ARechercher Fait Renseignement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeBesoinsEnRenseignements_ACommeRenseignementsARechercherFaitRenseignement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='CorrespondAuBesoinEnRenseignements_BesoinsEnRenseignements' target_entity='type_FaitRenseignement'"
	 *        extendedMetaData="kind='element' name='ACommeRenseignementsARechercher_FaitRenseignement'"
	 * @generated
	 */
	EList<TypeAssociation> getACommeRenseignementsARechercherFaitRenseignement();

	/**
	 * Returns the value of the '<em><b>APour Zone ASurveiller Autre Element Controle</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Zone ASurveiller Autre Element Controle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Zone ASurveiller Autre Element Controle</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeBesoinsEnRenseignements_APourZoneASurveillerAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='APourZoneASurveiller_AutreElementControle'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourZoneASurveillerAutreElementControle();

	/**
	 * Returns the value of the '<em><b>APour Conduite ATenir Prisonniers Regle Engagement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Conduite ATenir Prisonniers Regle Engagement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Conduite ATenir Prisonniers Regle Engagement</em>' containment reference.
	 * @see #setAPourConduiteATenirPrisonniersRegleEngagement(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeBesoinsEnRenseignements_APourConduiteATenirPrisonniersRegleEngagement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_RegleEngagement'"
	 *        extendedMetaData="kind='element' name='APourConduiteATenirPrisonniers_RegleEngagement'"
	 * @generated
	 */
	TypeAssociation getAPourConduiteATenirPrisonniersRegleEngagement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBesoinsEnRenseignements#getAPourConduiteATenirPrisonniersRegleEngagement <em>APour Conduite ATenir Prisonniers Regle Engagement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Conduite ATenir Prisonniers Regle Engagement</em>' containment reference.
	 * @see #getAPourConduiteATenirPrisonniersRegleEngagement()
	 * @generated
	 */
	void setAPourConduiteATenirPrisonniersRegleEngagement(TypeAssociation value);

} // TypeBesoinsEnRenseignements
