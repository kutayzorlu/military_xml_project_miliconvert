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
 * A representation of the model object '<em><b>Type Action AS Aeni</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeActionASAeni#getDefensePrevue <em>Defense Prevue</em>}</li>
 *   <li>{@link mpia.schema.TypeActionASAeni#getAPourUniteDefendueUnite <em>APour Unite Defendue Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeActionASAeni#getAPourZonesDefenduesOuAccompagnementAutreElementControle <em>APour Zones Defendues Ou Accompagnement Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeActionASAeni#getACommeUniteOuMaterielEmployeDesignationUniteOuEquipementENI <em>AComme Unite Ou Materiel Employe Designation Unite Ou Equipement ENI</em>}</li>
 *   <li>{@link mpia.schema.TypeActionASAeni#getACommeItinerairesDefendusItineraire <em>AComme Itineraires Defendus Itineraire</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeActionASAeni()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_ActionASAeni' kind='elementOnly'"
 * @generated
 */
public interface TypeActionASAeni extends EObject {
	/**
	 * Returns the value of the '<em><b>Defense Prevue</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoActionASAeniDefensePrevue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defense Prevue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defense Prevue</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoActionASAeniDefensePrevue
	 * @see #isSetDefensePrevue()
	 * @see #unsetDefensePrevue()
	 * @see #setDefensePrevue(TypeDictionaryDicoActionASAeniDefensePrevue)
	 * @see mpia.schema.SchemaPackage#getTypeActionASAeni_DefensePrevue()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='DefensePrevue'"
	 * @generated
	 */
	TypeDictionaryDicoActionASAeniDefensePrevue getDefensePrevue();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeActionASAeni#getDefensePrevue <em>Defense Prevue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defense Prevue</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoActionASAeniDefensePrevue
	 * @see #isSetDefensePrevue()
	 * @see #unsetDefensePrevue()
	 * @see #getDefensePrevue()
	 * @generated
	 */
	void setDefensePrevue(TypeDictionaryDicoActionASAeniDefensePrevue value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeActionASAeni#getDefensePrevue <em>Defense Prevue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefensePrevue()
	 * @see #getDefensePrevue()
	 * @see #setDefensePrevue(TypeDictionaryDicoActionASAeniDefensePrevue)
	 * @generated
	 */
	void unsetDefensePrevue();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeActionASAeni#getDefensePrevue <em>Defense Prevue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Defense Prevue</em>' attribute is set.
	 * @see #unsetDefensePrevue()
	 * @see #getDefensePrevue()
	 * @see #setDefensePrevue(TypeDictionaryDicoActionASAeniDefensePrevue)
	 * @generated
	 */
	boolean isSetDefensePrevue();

	/**
	 * Returns the value of the '<em><b>APour Unite Defendue Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Unite Defendue Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Unite Defendue Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeActionASAeni_APourUniteDefendueUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourUniteDefendue_Unite'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourUniteDefendueUnite();

	/**
	 * Returns the value of the '<em><b>APour Zones Defendues Ou Accompagnement Autre Element Controle</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Zones Defendues Ou Accompagnement Autre Element Controle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Zones Defendues Ou Accompagnement Autre Element Controle</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeActionASAeni_APourZonesDefenduesOuAccompagnementAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='APourZonesDefenduesOuAccompagnement_AutreElementControle'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourZonesDefenduesOuAccompagnementAutreElementControle();

	/**
	 * Returns the value of the '<em><b>AComme Unite Ou Materiel Employe Designation Unite Ou Equipement ENI</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Unite Ou Materiel Employe Designation Unite Ou Equipement ENI</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Unite Ou Materiel Employe Designation Unite Ou Equipement ENI</em>' containment reference.
	 * @see #setACommeUniteOuMaterielEmployeDesignationUniteOuEquipementENI(TypeDesignationUniteOuEquipementENI)
	 * @see mpia.schema.SchemaPackage#getTypeActionASAeni_ACommeUniteOuMaterielEmployeDesignationUniteOuEquipementENI()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_DesignationUniteOuEquipementENI'"
	 *        extendedMetaData="kind='element' name='ACommeUniteOuMaterielEmploye_DesignationUniteOuEquipementENI'"
	 * @generated
	 */
	TypeDesignationUniteOuEquipementENI getACommeUniteOuMaterielEmployeDesignationUniteOuEquipementENI();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeActionASAeni#getACommeUniteOuMaterielEmployeDesignationUniteOuEquipementENI <em>AComme Unite Ou Materiel Employe Designation Unite Ou Equipement ENI</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Unite Ou Materiel Employe Designation Unite Ou Equipement ENI</em>' containment reference.
	 * @see #getACommeUniteOuMaterielEmployeDesignationUniteOuEquipementENI()
	 * @generated
	 */
	void setACommeUniteOuMaterielEmployeDesignationUniteOuEquipementENI(TypeDesignationUniteOuEquipementENI value);

	/**
	 * Returns the value of the '<em><b>AComme Itineraires Defendus Itineraire</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Itineraires Defendus Itineraire</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Itineraires Defendus Itineraire</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeActionASAeni_ACommeItinerairesDefendusItineraire()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Itineraire'"
	 *        extendedMetaData="kind='element' name='ACommeItinerairesDefendus_Itineraire'"
	 * @generated
	 */
	EList<TypeAssociation> getACommeItinerairesDefendusItineraire();

} // TypeActionASAeni
