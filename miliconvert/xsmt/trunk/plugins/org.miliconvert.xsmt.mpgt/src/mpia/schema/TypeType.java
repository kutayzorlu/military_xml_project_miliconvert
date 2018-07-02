/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeType#isFictif <em>Fictif</em>}</li>
 *   <li>{@link mpia.schema.TypeType#getEstComposeDotationTheorique <em>Est Compose Dotation Theorique</em>}</li>
 *   <li>{@link mpia.schema.TypeType#getEstSpecifieCommePartCompositionDotationTheoriqueEnType <em>Est Specifie Comme Part Composition Dotation Theorique En Type</em>}</li>
 *   <li>{@link mpia.schema.TypeType#getEstAffilieAAssociationAffiliationType <em>Est Affilie AAssociation Affiliation Type</em>}</li>
 *   <li>{@link mpia.schema.TypeType#getAPourCapaciteAssociationTypeCapacite <em>APour Capacite Association Type Capacite</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeType()
 * @model abstract="true"
 *        extendedMetaData="name='type_Type' kind='elementOnly'"
 * @generated
 */
public interface TypeType extends TypeRacineOperationnelle {
	/**
	 * Returns the value of the '<em><b>Fictif</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fictif</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fictif</em>' attribute.
	 * @see #isSetFictif()
	 * @see #unsetFictif()
	 * @see #setFictif(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeType_Fictif()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='Fictif'"
	 * @generated
	 */
	boolean isFictif();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeType#isFictif <em>Fictif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fictif</em>' attribute.
	 * @see #isSetFictif()
	 * @see #unsetFictif()
	 * @see #isFictif()
	 * @generated
	 */
	void setFictif(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeType#isFictif <em>Fictif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFictif()
	 * @see #isFictif()
	 * @see #setFictif(boolean)
	 * @generated
	 */
	void unsetFictif();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeType#isFictif <em>Fictif</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fictif</em>' attribute is set.
	 * @see #unsetFictif()
	 * @see #isFictif()
	 * @see #setFictif(boolean)
	 * @generated
	 */
	boolean isSetFictif();

	/**
	 * Returns the value of the '<em><b>Est Compose Dotation Theorique</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Compose Dotation Theorique</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Compose Dotation Theorique</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeType_EstComposeDotationTheorique()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='SpecifieComposition_Type' target_entity='type_DotationTheorique'"
	 *        extendedMetaData="kind='element' name='EstCompose_DotationTheorique'"
	 * @generated
	 */
	EList<TypeAssociation> getEstComposeDotationTheorique();

	/**
	 * Returns the value of the '<em><b>Est Specifie Comme Part Composition Dotation Theorique En Type</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Specifie Comme Part Composition Dotation Theorique En Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Specifie Comme Part Composition Dotation Theorique En Type</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeType_EstSpecifieCommePartCompositionDotationTheoriqueEnType()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourReference_Type' target_entity='type_CompositionDotationTheoriqueEnType'"
	 *        extendedMetaData="kind='element' name='EstSpecifieCommePart_CompositionDotationTheoriqueEnType'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSpecifieCommePartCompositionDotationTheoriqueEnType();

	/**
	 * Returns the value of the '<em><b>Est Affilie AAssociation Affiliation Type</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Affilie AAssociation Affiliation Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Affilie AAssociation Affiliation Type</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeType_EstAffilieAAssociationAffiliationType()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='ConcerneType_Type' target_entity='type_AssociationAffiliationType'"
	 *        extendedMetaData="kind='element' name='EstAffilieA_AssociationAffiliationType'"
	 * @generated
	 */
	EList<TypeAssociation> getEstAffilieAAssociationAffiliationType();

	/**
	 * Returns the value of the '<em><b>APour Capacite Association Type Capacite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Capacite Association Type Capacite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Capacite Association Type Capacite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeType_APourCapaciteAssociationTypeCapacite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCapacite_Type' target_entity='type_AssociationTypeCapacite'"
	 *        extendedMetaData="kind='element' name='APourCapacite_AssociationTypeCapacite'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourCapaciteAssociationTypeCapacite();

} // TypeType
