/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Dotation Theorique Instance Objet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeDotationTheoriqueInstanceObjet#getDateAffectation <em>Date Affectation</em>}</li>
 *   <li>{@link mpia.schema.TypeDotationTheoriqueInstanceObjet#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeDotationTheoriqueInstanceObjet#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeDotationTheoriqueInstanceObjet#getAssocieCommeDotationDotationTheorique <em>Associe Comme Dotation Dotation Theorique</em>}</li>
 *   <li>{@link mpia.schema.TypeDotationTheoriqueInstanceObjet#getEstDotationTheoriqueInstanceObjet <em>Est Dotation Theorique Instance Objet</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeDotationTheoriqueInstanceObjet()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_DotationTheoriqueInstanceObjet' kind='elementOnly'"
 * @generated
 */
public interface TypeDotationTheoriqueInstanceObjet extends EObject {
	/**
	 * Returns the value of the '<em><b>Date Affectation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Affectation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Affectation</em>' attribute.
	 * @see #setDateAffectation(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeDotationTheoriqueInstanceObjet_DateAffectation()
	 * @model dataType="mpia.meta.TypeDataTypeGDH" required="true"
	 *        extendedMetaData="kind='element' name='DateAffectation'"
	 * @generated
	 */
	XMLGregorianCalendar getDateAffectation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDotationTheoriqueInstanceObjet#getDateAffectation <em>Date Affectation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Affectation</em>' attribute.
	 * @see #getDateAffectation()
	 * @generated
	 */
	void setDateAffectation(XMLGregorianCalendar value);

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
	 * @see mpia.schema.SchemaPackage#getTypeDotationTheoriqueInstanceObjet_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDotationTheoriqueInstanceObjet#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeDotationTheoriqueInstanceObjet_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDotationTheoriqueInstanceObjet#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Associe Comme Dotation Dotation Theorique</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Dotation Dotation Theorique</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Dotation Dotation Theorique</em>' containment reference.
	 * @see #setAssocieCommeDotationDotationTheorique(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeDotationTheoriqueInstanceObjet_AssocieCommeDotationDotationTheorique()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstAffecteAuTravers_DotationTheoriqueInstanceObjet' target_entity='type_DotationTheorique'"
	 *        extendedMetaData="kind='element' name='AssocieCommeDotation_DotationTheorique'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeDotationDotationTheorique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDotationTheoriqueInstanceObjet#getAssocieCommeDotationDotationTheorique <em>Associe Comme Dotation Dotation Theorique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Dotation Dotation Theorique</em>' containment reference.
	 * @see #getAssocieCommeDotationDotationTheorique()
	 * @generated
	 */
	void setAssocieCommeDotationDotationTheorique(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Est Dotation Theorique Instance Objet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Dotation Theorique Instance Objet</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Dotation Theorique Instance Objet</em>' containment reference.
	 * @see #setEstDotationTheoriqueInstanceObjet(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeDotationTheoriqueInstanceObjet_EstDotationTheoriqueInstanceObjet()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourDotationTheorique_DotationTheoriqueInstanceObjet' target_entity='type_InstanceObjet'"
	 *        extendedMetaData="kind='element' name='EstDotationTheorique_InstanceObjet'"
	 * @generated
	 */
	TypeAssociation getEstDotationTheoriqueInstanceObjet();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDotationTheoriqueInstanceObjet#getEstDotationTheoriqueInstanceObjet <em>Est Dotation Theorique Instance Objet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Dotation Theorique Instance Objet</em>' containment reference.
	 * @see #getEstDotationTheoriqueInstanceObjet()
	 * @generated
	 */
	void setEstDotationTheoriqueInstanceObjet(TypeAssociation value);

} // TypeDotationTheoriqueInstanceObjet
