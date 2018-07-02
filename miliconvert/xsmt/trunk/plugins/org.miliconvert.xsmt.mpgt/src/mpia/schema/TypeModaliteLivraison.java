/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociationEXT;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Modalite Livraison</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeModaliteLivraison#getDateDeDebut <em>Date De Debut</em>}</li>
 *   <li>{@link mpia.schema.TypeModaliteLivraison#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeModaliteLivraison#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeModaliteLivraison#getAPourBeneficiaireUnite <em>APour Beneficiaire Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeModaliteLivraison()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_ModaliteLivraison' kind='elementOnly'"
 * @generated
 */
public interface TypeModaliteLivraison extends EObject {
	/**
	 * Returns the value of the '<em><b>Date De Debut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date De Debut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date De Debut</em>' attribute.
	 * @see #setDateDeDebut(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeModaliteLivraison_DateDeDebut()
	 * @model dataType="mpia.meta.TypeDataTypeGDH" required="true"
	 *        extendedMetaData="kind='element' name='DateDeDebut'"
	 * @generated
	 */
	XMLGregorianCalendar getDateDeDebut();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModaliteLivraison#getDateDeDebut <em>Date De Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date De Debut</em>' attribute.
	 * @see #getDateDeDebut()
	 * @generated
	 */
	void setDateDeDebut(XMLGregorianCalendar value);

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
	 * @see mpia.schema.SchemaPackage#getTypeModaliteLivraison_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModaliteLivraison#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeModaliteLivraison_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModaliteLivraison#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>APour Beneficiaire Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Beneficiaire Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Beneficiaire Unite</em>' containment reference.
	 * @see #setAPourBeneficiaireUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeModaliteLivraison_APourBeneficiaireUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourBeneficiaire_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getAPourBeneficiaireUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModaliteLivraison#getAPourBeneficiaireUnite <em>APour Beneficiaire Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Beneficiaire Unite</em>' containment reference.
	 * @see #getAPourBeneficiaireUnite()
	 * @generated
	 */
	void setAPourBeneficiaireUnite(TypeAssociationEXT value);

} // TypeModaliteLivraison
