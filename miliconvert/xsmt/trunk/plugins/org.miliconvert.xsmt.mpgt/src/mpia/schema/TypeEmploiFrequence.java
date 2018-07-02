/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;
import mpia.meta.TypeDataTypeDateHeure;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Emploi Frequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEmploiFrequence#getDateDebutRestriction <em>Date Debut Restriction</em>}</li>
 *   <li>{@link mpia.schema.TypeEmploiFrequence#getDateFinRestriction <em>Date Fin Restriction</em>}</li>
 *   <li>{@link mpia.schema.TypeEmploiFrequence#getAPourUniteConcerneUnite <em>APour Unite Concerne Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeEmploiFrequence#getAPourRestrictionFrequenceFrequence <em>APour Restriction Frequence Frequence</em>}</li>
 *   <li>{@link mpia.schema.TypeEmploiFrequence#getAPourZoneApplicationAutreElementControle <em>APour Zone Application Autre Element Controle</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEmploiFrequence()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_EmploiFrequence' kind='elementOnly'"
 * @generated
 */
public interface TypeEmploiFrequence extends EObject {
	/**
	 * Returns the value of the '<em><b>Date Debut Restriction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Debut Restriction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Debut Restriction</em>' containment reference.
	 * @see #setDateDebutRestriction(TypeDataTypeDateHeure)
	 * @see mpia.schema.SchemaPackage#getTypeEmploiFrequence_DateDebutRestriction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DateDebutRestriction'"
	 * @generated
	 */
	TypeDataTypeDateHeure getDateDebutRestriction();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEmploiFrequence#getDateDebutRestriction <em>Date Debut Restriction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Debut Restriction</em>' containment reference.
	 * @see #getDateDebutRestriction()
	 * @generated
	 */
	void setDateDebutRestriction(TypeDataTypeDateHeure value);

	/**
	 * Returns the value of the '<em><b>Date Fin Restriction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Fin Restriction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Fin Restriction</em>' containment reference.
	 * @see #setDateFinRestriction(TypeDataTypeDateHeure)
	 * @see mpia.schema.SchemaPackage#getTypeEmploiFrequence_DateFinRestriction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DateFinRestriction'"
	 * @generated
	 */
	TypeDataTypeDateHeure getDateFinRestriction();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEmploiFrequence#getDateFinRestriction <em>Date Fin Restriction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Fin Restriction</em>' containment reference.
	 * @see #getDateFinRestriction()
	 * @generated
	 */
	void setDateFinRestriction(TypeDataTypeDateHeure value);

	/**
	 * Returns the value of the '<em><b>APour Unite Concerne Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Unite Concerne Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Unite Concerne Unite</em>' containment reference.
	 * @see #setAPourUniteConcerneUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeEmploiFrequence_APourUniteConcerneUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourUniteConcerne_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getAPourUniteConcerneUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEmploiFrequence#getAPourUniteConcerneUnite <em>APour Unite Concerne Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Unite Concerne Unite</em>' containment reference.
	 * @see #getAPourUniteConcerneUnite()
	 * @generated
	 */
	void setAPourUniteConcerneUnite(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>APour Restriction Frequence Frequence</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeFrequence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Restriction Frequence Frequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Restriction Frequence Frequence</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeEmploiFrequence_APourRestrictionFrequenceFrequence()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Frequence'"
	 *        extendedMetaData="kind='element' name='APourRestrictionFrequence_Frequence'"
	 * @generated
	 */
	EList<TypeFrequence> getAPourRestrictionFrequenceFrequence();

	/**
	 * Returns the value of the '<em><b>APour Zone Application Autre Element Controle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Zone Application Autre Element Controle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Zone Application Autre Element Controle</em>' containment reference.
	 * @see #setAPourZoneApplicationAutreElementControle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeEmploiFrequence_APourZoneApplicationAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='APourZoneApplication_AutreElementControle'"
	 * @generated
	 */
	TypeAssociation getAPourZoneApplicationAutreElementControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEmploiFrequence#getAPourZoneApplicationAutreElementControle <em>APour Zone Application Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Zone Application Autre Element Controle</em>' containment reference.
	 * @see #getAPourZoneApplicationAutreElementControle()
	 * @generated
	 */
	void setAPourZoneApplicationAutreElementControle(TypeAssociation value);

} // TypeEmploiFrequence
