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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Menace Feux ENI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMenaceFeuxENI#getACommeMoyenFeuENIMoyenFeuENI <em>AComme Moyen Feu ENI Moyen Feu ENI</em>}</li>
 *   <li>{@link mpia.schema.TypeMenaceFeuxENI#getAPourActionsEnvisageesAction <em>APour Actions Envisagees Action</em>}</li>
 *   <li>{@link mpia.schema.TypeMenaceFeuxENI#getAPourZoneFeuxENIAutreElementControle <em>APour Zone Feux ENI Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeMenaceFeuxENI#getAPourPCouUniteAMIcibleENIUnite <em>APour PCou Unite AM Icible ENI Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeMenaceFeuxENI#getAPourInstallationEtInfrastructureAMIcibleENITypeSite <em>APour Installation Et Infrastructure AM Icible ENI Type Site</em>}</li>
 *   <li>{@link mpia.schema.TypeMenaceFeuxENI#getACommeMaterielSusceptibleEtrePrisAPartieMateriel <em>AComme Materiel Susceptible Etre Pris APartie Materiel</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMenaceFeuxENI()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_MenaceFeuxENI' kind='elementOnly'"
 * @generated
 */
public interface TypeMenaceFeuxENI extends TypeMenace {
	/**
	 * Returns the value of the '<em><b>AComme Moyen Feu ENI Moyen Feu ENI</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeMoyenFeuENI}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Moyen Feu ENI Moyen Feu ENI</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Moyen Feu ENI Moyen Feu ENI</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMenaceFeuxENI_ACommeMoyenFeuENIMoyenFeuENI()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_MoyenFeuENI'"
	 *        extendedMetaData="kind='element' name='ACommeMoyenFeuENI_MoyenFeuENI'"
	 * @generated
	 */
	EList<TypeMoyenFeuENI> getACommeMoyenFeuENIMoyenFeuENI();

	/**
	 * Returns the value of the '<em><b>APour Actions Envisagees Action</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Actions Envisagees Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Actions Envisagees Action</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMenaceFeuxENI_APourActionsEnvisageesAction()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Action'"
	 *        extendedMetaData="kind='element' name='APourActionsEnvisagees_Action'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourActionsEnvisageesAction();

	/**
	 * Returns the value of the '<em><b>APour Zone Feux ENI Autre Element Controle</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Zone Feux ENI Autre Element Controle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Zone Feux ENI Autre Element Controle</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMenaceFeuxENI_APourZoneFeuxENIAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='APourZoneFeuxENI_AutreElementControle'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourZoneFeuxENIAutreElementControle();

	/**
	 * Returns the value of the '<em><b>APour PCou Unite AM Icible ENI Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociationEXT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour PCou Unite AM Icible ENI Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour PCou Unite AM Icible ENI Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMenaceFeuxENI_APourPCouUniteAMIcibleENIUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourPCouUniteAMIcibleENI_Unite'"
	 * @generated
	 */
	EList<TypeAssociationEXT> getAPourPCouUniteAMIcibleENIUnite();

	/**
	 * Returns the value of the '<em><b>APour Installation Et Infrastructure AM Icible ENI Type Site</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Installation Et Infrastructure AM Icible ENI Type Site</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Installation Et Infrastructure AM Icible ENI Type Site</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMenaceFeuxENI_APourInstallationEtInfrastructureAMIcibleENITypeSite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeSite'"
	 *        extendedMetaData="kind='element' name='APourInstallationEtInfrastructureAMIcibleENI_TypeSite'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourInstallationEtInfrastructureAMIcibleENITypeSite();

	/**
	 * Returns the value of the '<em><b>AComme Materiel Susceptible Etre Pris APartie Materiel</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Materiel Susceptible Etre Pris APartie Materiel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Materiel Susceptible Etre Pris APartie Materiel</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMenaceFeuxENI_ACommeMaterielSusceptibleEtrePrisAPartieMateriel()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Materiel'"
	 *        extendedMetaData="kind='element' name='ACommeMaterielSusceptibleEtrePrisAPartie_Materiel'"
	 * @generated
	 */
	EList<TypeAssociation> getACommeMaterielSusceptibleEtrePrisAPartieMateriel();

} // TypeMenaceFeuxENI
