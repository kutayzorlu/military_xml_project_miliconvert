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
 * A representation of the model object '<em><b>Type Consignes Generales Tir ASA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeConsignesGeneralesTirASA#getDirectivesTir <em>Directives Tir</em>}</li>
 *   <li>{@link mpia.schema.TypeConsignesGeneralesTirASA#getMesuresControlePreetablies <em>Mesures Controle Preetablies</em>}</li>
 *   <li>{@link mpia.schema.TypeConsignesGeneralesTirASA#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeConsignesGeneralesTirASA#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeConsignesGeneralesTirASA#getAPourCriteresIdentificationCriteresIdentification <em>APour Criteres Identification Criteres Identification</em>}</li>
 *   <li>{@link mpia.schema.TypeConsignesGeneralesTirASA#getAPourDirectiveEMCONDirectiveEMCONpourUniteASA <em>APour Directive EMCON Directive EMCO Npour Unite ASA</em>}</li>
 *   <li>{@link mpia.schema.TypeConsignesGeneralesTirASA#getAPourEtatAlerteUniteASAEtatAlerteUniteASA <em>APour Etat Alerte Unite ASA Etat Alerte Unite ASA</em>}</li>
 *   <li>{@link mpia.schema.TypeConsignesGeneralesTirASA#getACommePolitiqueTirAeronefPolitiqueTirAeronef <em>AComme Politique Tir Aeronef Politique Tir Aeronef</em>}</li>
 *   <li>{@link mpia.schema.TypeConsignesGeneralesTirASA#getAPourReglesEngagementRegleEngagement <em>APour Regles Engagement Regle Engagement</em>}</li>
 *   <li>{@link mpia.schema.TypeConsignesGeneralesTirASA#getAPourConsignesTirSecoursConsigneTir <em>APour Consignes Tir Secours Consigne Tir</em>}</li>
 *   <li>{@link mpia.schema.TypeConsignesGeneralesTirASA#getACommeTypeMesureCoordinationTypeMesureCoordination <em>AComme Type Mesure Coordination Type Mesure Coordination</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeConsignesGeneralesTirASA()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_ConsignesGeneralesTirASA' kind='elementOnly'"
 * @generated
 */
public interface TypeConsignesGeneralesTirASA extends EObject {
	/**
	 * Returns the value of the '<em><b>Directives Tir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Directives Tir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directives Tir</em>' attribute.
	 * @see #setDirectivesTir(String)
	 * @see mpia.schema.SchemaPackage#getTypeConsignesGeneralesTirASA_DirectivesTir()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='DirectivesTir'"
	 * @generated
	 */
	String getDirectivesTir();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsignesGeneralesTirASA#getDirectivesTir <em>Directives Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directives Tir</em>' attribute.
	 * @see #getDirectivesTir()
	 * @generated
	 */
	void setDirectivesTir(String value);

	/**
	 * Returns the value of the '<em><b>Mesures Controle Preetablies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mesures Controle Preetablies</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mesures Controle Preetablies</em>' attribute.
	 * @see #setMesuresControlePreetablies(String)
	 * @see mpia.schema.SchemaPackage#getTypeConsignesGeneralesTirASA_MesuresControlePreetablies()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='MesuresControlePreetablies'"
	 * @generated
	 */
	String getMesuresControlePreetablies();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsignesGeneralesTirASA#getMesuresControlePreetablies <em>Mesures Controle Preetablies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mesures Controle Preetablies</em>' attribute.
	 * @see #getMesuresControlePreetablies()
	 * @generated
	 */
	void setMesuresControlePreetablies(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeConsignesGeneralesTirASA_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsignesGeneralesTirASA#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeConsignesGeneralesTirASA_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsignesGeneralesTirASA#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>APour Criteres Identification Criteres Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Criteres Identification Criteres Identification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Criteres Identification Criteres Identification</em>' containment reference.
	 * @see #setAPourCriteresIdentificationCriteresIdentification(TypeCriteresIdentification)
	 * @see mpia.schema.SchemaPackage#getTypeConsignesGeneralesTirASA_APourCriteresIdentificationCriteresIdentification()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_CriteresIdentification'"
	 *        extendedMetaData="kind='element' name='APourCriteresIdentification_CriteresIdentification'"
	 * @generated
	 */
	TypeCriteresIdentification getAPourCriteresIdentificationCriteresIdentification();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsignesGeneralesTirASA#getAPourCriteresIdentificationCriteresIdentification <em>APour Criteres Identification Criteres Identification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Criteres Identification Criteres Identification</em>' containment reference.
	 * @see #getAPourCriteresIdentificationCriteresIdentification()
	 * @generated
	 */
	void setAPourCriteresIdentificationCriteresIdentification(TypeCriteresIdentification value);

	/**
	 * Returns the value of the '<em><b>APour Directive EMCON Directive EMCO Npour Unite ASA</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeDirectiveEMCONpourUniteASA}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Directive EMCON Directive EMCO Npour Unite ASA</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Directive EMCON Directive EMCO Npour Unite ASA</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeConsignesGeneralesTirASA_APourDirectiveEMCONDirectiveEMCONpourUniteASA()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_DirectiveEMCONpourUniteASA'"
	 *        extendedMetaData="kind='element' name='APourDirectiveEMCON_DirectiveEMCONpourUniteASA'"
	 * @generated
	 */
	EList<TypeDirectiveEMCONpourUniteASA> getAPourDirectiveEMCONDirectiveEMCONpourUniteASA();

	/**
	 * Returns the value of the '<em><b>APour Etat Alerte Unite ASA Etat Alerte Unite ASA</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeEtatAlerteUniteASA}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Etat Alerte Unite ASA Etat Alerte Unite ASA</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Etat Alerte Unite ASA Etat Alerte Unite ASA</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeConsignesGeneralesTirASA_APourEtatAlerteUniteASAEtatAlerteUniteASA()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_EtatAlerteUniteASA'"
	 *        extendedMetaData="kind='element' name='APourEtatAlerteUniteASA_EtatAlerteUniteASA'"
	 * @generated
	 */
	EList<TypeEtatAlerteUniteASA> getAPourEtatAlerteUniteASAEtatAlerteUniteASA();

	/**
	 * Returns the value of the '<em><b>AComme Politique Tir Aeronef Politique Tir Aeronef</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypePolitiqueTirAeronef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Politique Tir Aeronef Politique Tir Aeronef</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Politique Tir Aeronef Politique Tir Aeronef</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeConsignesGeneralesTirASA_ACommePolitiqueTirAeronefPolitiqueTirAeronef()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_PolitiqueTirAeronef'"
	 *        extendedMetaData="kind='element' name='ACommePolitiqueTirAeronef_PolitiqueTirAeronef'"
	 * @generated
	 */
	EList<TypePolitiqueTirAeronef> getACommePolitiqueTirAeronefPolitiqueTirAeronef();

	/**
	 * Returns the value of the '<em><b>APour Regles Engagement Regle Engagement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Regles Engagement Regle Engagement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Regles Engagement Regle Engagement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeConsignesGeneralesTirASA_APourReglesEngagementRegleEngagement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_RegleEngagement'"
	 *        extendedMetaData="kind='element' name='APourReglesEngagement_RegleEngagement'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourReglesEngagementRegleEngagement();

	/**
	 * Returns the value of the '<em><b>APour Consignes Tir Secours Consigne Tir</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Consignes Tir Secours Consigne Tir</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Consignes Tir Secours Consigne Tir</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeConsignesGeneralesTirASA_APourConsignesTirSecoursConsigneTir()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_ConsigneTir'"
	 *        extendedMetaData="kind='element' name='APourConsignesTirSecours_ConsigneTir'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourConsignesTirSecoursConsigneTir();

	/**
	 * Returns the value of the '<em><b>AComme Type Mesure Coordination Type Mesure Coordination</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Type Mesure Coordination Type Mesure Coordination</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Type Mesure Coordination Type Mesure Coordination</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeConsignesGeneralesTirASA_ACommeTypeMesureCoordinationTypeMesureCoordination()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeMesureCoordination'"
	 *        extendedMetaData="kind='element' name='ACommeTypeMesureCoordination_TypeMesureCoordination'"
	 * @generated
	 */
	EList<TypeAssociation> getACommeTypeMesureCoordinationTypeMesureCoordination();

} // TypeConsignesGeneralesTirASA
