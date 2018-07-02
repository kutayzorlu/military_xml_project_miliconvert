/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Demande Tir</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeDemandeTir#getNumeroDemande <em>Numero Demande</em>}</li>
 *   <li>{@link mpia.schema.TypeDemandeTir#getGDHcreation <em>GD Hcreation</em>}</li>
 *   <li>{@link mpia.schema.TypeDemandeTir#getAPourDemandeurUnite <em>APour Demandeur Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeDemandeTir#getACommeDirectiveDirectiveTir <em>AComme Directive Directive Tir</em>}</li>
 *   <li>{@link mpia.schema.TypeDemandeTir#getAPourCompteRenduCompteRenduTir <em>APour Compte Rendu Compte Rendu Tir</em>}</li>
 *   <li>{@link mpia.schema.TypeDemandeTir#getAPourCaracteristiquesDemandeEngagementObjectif <em>APour Caracteristiques Demande Engagement Objectif</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeDemandeTir()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_DemandeTir' kind='elementOnly'"
 * @generated
 */
public interface TypeDemandeTir extends TypeActivite {
	/**
	 * Returns the value of the '<em><b>Numero Demande</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Demande</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Demande</em>' attribute.
	 * @see #setNumeroDemande(String)
	 * @see mpia.schema.SchemaPackage#getTypeDemandeTir_NumeroDemande()
	 * @model dataType="mpia.meta.TypeDataTypeChaine06" required="true"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='NumeroDemande'"
	 * @generated
	 */
	String getNumeroDemande();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDemandeTir#getNumeroDemande <em>Numero Demande</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Demande</em>' attribute.
	 * @see #getNumeroDemande()
	 * @generated
	 */
	void setNumeroDemande(String value);

	/**
	 * Returns the value of the '<em><b>GD Hcreation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GD Hcreation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GD Hcreation</em>' attribute.
	 * @see #setGDHcreation(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeDemandeTir_GDHcreation()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='GDHcreation'"
	 * @generated
	 */
	XMLGregorianCalendar getGDHcreation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDemandeTir#getGDHcreation <em>GD Hcreation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GD Hcreation</em>' attribute.
	 * @see #getGDHcreation()
	 * @generated
	 */
	void setGDHcreation(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>APour Demandeur Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Demandeur Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Demandeur Unite</em>' containment reference.
	 * @see #setAPourDemandeurUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeDemandeTir_APourDemandeurUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourDemandeur_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getAPourDemandeurUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDemandeTir#getAPourDemandeurUnite <em>APour Demandeur Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Demandeur Unite</em>' containment reference.
	 * @see #getAPourDemandeurUnite()
	 * @generated
	 */
	void setAPourDemandeurUnite(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>AComme Directive Directive Tir</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Directive Directive Tir</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Directive Directive Tir</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeDemandeTir_ACommeDirectiveDirectiveTir()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='Concerne_DemandeTir' target_entity='type_DirectiveTir'"
	 *        extendedMetaData="kind='element' name='ACommeDirective_DirectiveTir'"
	 * @generated
	 */
	EList<TypeAssociation> getACommeDirectiveDirectiveTir();

	/**
	 * Returns the value of the '<em><b>APour Compte Rendu Compte Rendu Tir</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Compte Rendu Compte Rendu Tir</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Compte Rendu Compte Rendu Tir</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeDemandeTir_APourCompteRenduCompteRenduTir()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='Concerne_DemandeTir' target_entity='type_CompteRenduTir'"
	 *        extendedMetaData="kind='element' name='APourCompteRendu_CompteRenduTir'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourCompteRenduCompteRenduTir();

	/**
	 * Returns the value of the '<em><b>APour Caracteristiques Demande Engagement Objectif</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Caracteristiques Demande Engagement Objectif</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Caracteristiques Demande Engagement Objectif</em>' containment reference.
	 * @see #setAPourCaracteristiquesDemandeEngagementObjectif(TypeDemandeEngagementObjectif)
	 * @see mpia.schema.SchemaPackage#getTypeDemandeTir_APourCaracteristiquesDemandeEngagementObjectif()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_DemandeEngagementObjectif'"
	 *        extendedMetaData="kind='element' name='APourCaracteristiques_DemandeEngagementObjectif'"
	 * @generated
	 */
	TypeDemandeEngagementObjectif getAPourCaracteristiquesDemandeEngagementObjectif();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDemandeTir#getAPourCaracteristiquesDemandeEngagementObjectif <em>APour Caracteristiques Demande Engagement Objectif</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Caracteristiques Demande Engagement Objectif</em>' containment reference.
	 * @see #getAPourCaracteristiquesDemandeEngagementObjectif()
	 * @generated
	 */
	void setAPourCaracteristiquesDemandeEngagementObjectif(TypeDemandeEngagementObjectif value);

} // TypeDemandeTir
