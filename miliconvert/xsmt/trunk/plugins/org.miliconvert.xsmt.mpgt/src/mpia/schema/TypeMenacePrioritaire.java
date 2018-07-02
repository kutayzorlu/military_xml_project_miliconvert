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
 * A representation of the model object '<em><b>Type Menace Prioritaire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMenacePrioritaire#getPrioriteMenace <em>Priorite Menace</em>}</li>
 *   <li>{@link mpia.schema.TypeMenacePrioritaire#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeMenacePrioritaire#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeMenacePrioritaire#getConcerneTypeAeronefTypeAeronef <em>Concerne Type Aeronef Type Aeronef</em>}</li>
 *   <li>{@link mpia.schema.TypeMenacePrioritaire#getAPourAxePenetrationPresumeAutreElementControle <em>APour Axe Penetration Presume Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeMenacePrioritaire#getAPourArmementOuEquipementTypeMateriel <em>APour Armement Ou Equipement Type Materiel</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMenacePrioritaire()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_MenacePrioritaire' kind='elementOnly'"
 * @generated
 */
public interface TypeMenacePrioritaire extends EObject {
	/**
	 * Returns the value of the '<em><b>Priorite Menace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priorite Menace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priorite Menace</em>' attribute.
	 * @see #isSetPrioriteMenace()
	 * @see #unsetPrioriteMenace()
	 * @see #setPrioriteMenace(long)
	 * @see mpia.schema.SchemaPackage#getTypeMenacePrioritaire_PrioriteMenace()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6" required="true"
	 *        extendedMetaData="kind='element' name='PrioriteMenace'"
	 * @generated
	 */
	long getPrioriteMenace();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMenacePrioritaire#getPrioriteMenace <em>Priorite Menace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priorite Menace</em>' attribute.
	 * @see #isSetPrioriteMenace()
	 * @see #unsetPrioriteMenace()
	 * @see #getPrioriteMenace()
	 * @generated
	 */
	void setPrioriteMenace(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMenacePrioritaire#getPrioriteMenace <em>Priorite Menace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrioriteMenace()
	 * @see #getPrioriteMenace()
	 * @see #setPrioriteMenace(long)
	 * @generated
	 */
	void unsetPrioriteMenace();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMenacePrioritaire#getPrioriteMenace <em>Priorite Menace</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Priorite Menace</em>' attribute is set.
	 * @see #unsetPrioriteMenace()
	 * @see #getPrioriteMenace()
	 * @see #setPrioriteMenace(long)
	 * @generated
	 */
	boolean isSetPrioriteMenace();

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
	 * @see mpia.schema.SchemaPackage#getTypeMenacePrioritaire_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMenacePrioritaire#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeMenacePrioritaire_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMenacePrioritaire#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Concerne Type Aeronef Type Aeronef</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Type Aeronef Type Aeronef</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Type Aeronef Type Aeronef</em>' containment reference.
	 * @see #setConcerneTypeAeronefTypeAeronef(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeMenacePrioritaire_ConcerneTypeAeronefTypeAeronef()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeAeronef'"
	 *        extendedMetaData="kind='element' name='ConcerneTypeAeronef_TypeAeronef'"
	 * @generated
	 */
	TypeAssociationEXT getConcerneTypeAeronefTypeAeronef();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMenacePrioritaire#getConcerneTypeAeronefTypeAeronef <em>Concerne Type Aeronef Type Aeronef</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concerne Type Aeronef Type Aeronef</em>' containment reference.
	 * @see #getConcerneTypeAeronefTypeAeronef()
	 * @generated
	 */
	void setConcerneTypeAeronefTypeAeronef(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>APour Axe Penetration Presume Autre Element Controle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Axe Penetration Presume Autre Element Controle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Axe Penetration Presume Autre Element Controle</em>' containment reference.
	 * @see #setAPourAxePenetrationPresumeAutreElementControle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeMenacePrioritaire_APourAxePenetrationPresumeAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='APourAxePenetrationPresume_AutreElementControle'"
	 * @generated
	 */
	TypeAssociation getAPourAxePenetrationPresumeAutreElementControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMenacePrioritaire#getAPourAxePenetrationPresumeAutreElementControle <em>APour Axe Penetration Presume Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Axe Penetration Presume Autre Element Controle</em>' containment reference.
	 * @see #getAPourAxePenetrationPresumeAutreElementControle()
	 * @generated
	 */
	void setAPourAxePenetrationPresumeAutreElementControle(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Armement Ou Equipement Type Materiel</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociationEXT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Armement Ou Equipement Type Materiel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Armement Ou Equipement Type Materiel</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMenacePrioritaire_APourArmementOuEquipementTypeMateriel()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeMateriel'"
	 *        extendedMetaData="kind='element' name='APourArmementOuEquipement_TypeMateriel'"
	 * @generated
	 */
	EList<TypeAssociationEXT> getAPourArmementOuEquipementTypeMateriel();

} // TypeMenacePrioritaire
