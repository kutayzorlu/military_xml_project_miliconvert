/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Transfert Dotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeTransfertDotation#getQuantite <em>Quantite</em>}</li>
 *   <li>{@link mpia.schema.TypeTransfertDotation#getRaison <em>Raison</em>}</li>
 *   <li>{@link mpia.schema.TypeTransfertDotation#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeTransfertDotation#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeTransfertDotation#getAPourFournisseurBeneficiaireInstanceObjet <em>APour Fournisseur Beneficiaire Instance Objet</em>}</li>
 *   <li>{@link mpia.schema.TypeTransfertDotation#getEstRapporteeParRapport <em>Est Rapportee Par Rapport</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeTransfertDotation()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_TransfertDotation' kind='elementOnly'"
 * @generated
 */
public interface TypeTransfertDotation extends EObject {
	/**
	 * Returns the value of the '<em><b>Quantite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite</em>' attribute.
	 * @see #isSetQuantite()
	 * @see #unsetQuantite()
	 * @see #setQuantite(long)
	 * @see mpia.schema.SchemaPackage#getTypeTransfertDotation_Quantite()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier9" required="true"
	 *        extendedMetaData="kind='element' name='Quantite'"
	 * @generated
	 */
	long getQuantite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTransfertDotation#getQuantite <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite</em>' attribute.
	 * @see #isSetQuantite()
	 * @see #unsetQuantite()
	 * @see #getQuantite()
	 * @generated
	 */
	void setQuantite(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTransfertDotation#getQuantite <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuantite()
	 * @see #getQuantite()
	 * @see #setQuantite(long)
	 * @generated
	 */
	void unsetQuantite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTransfertDotation#getQuantite <em>Quantite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quantite</em>' attribute is set.
	 * @see #unsetQuantite()
	 * @see #getQuantite()
	 * @see #setQuantite(long)
	 * @generated
	 */
	boolean isSetQuantite();

	/**
	 * Returns the value of the '<em><b>Raison</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTransfertDotationRaison}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raison</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raison</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTransfertDotationRaison
	 * @see #isSetRaison()
	 * @see #unsetRaison()
	 * @see #setRaison(TypeDictionaryDicoTransfertDotationRaison)
	 * @see mpia.schema.SchemaPackage#getTypeTransfertDotation_Raison()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Raison'"
	 * @generated
	 */
	TypeDictionaryDicoTransfertDotationRaison getRaison();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTransfertDotation#getRaison <em>Raison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raison</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTransfertDotationRaison
	 * @see #isSetRaison()
	 * @see #unsetRaison()
	 * @see #getRaison()
	 * @generated
	 */
	void setRaison(TypeDictionaryDicoTransfertDotationRaison value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTransfertDotation#getRaison <em>Raison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRaison()
	 * @see #getRaison()
	 * @see #setRaison(TypeDictionaryDicoTransfertDotationRaison)
	 * @generated
	 */
	void unsetRaison();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTransfertDotation#getRaison <em>Raison</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Raison</em>' attribute is set.
	 * @see #unsetRaison()
	 * @see #getRaison()
	 * @see #setRaison(TypeDictionaryDicoTransfertDotationRaison)
	 * @generated
	 */
	boolean isSetRaison();

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
	 * @see mpia.schema.SchemaPackage#getTypeTransfertDotation_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTransfertDotation#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeTransfertDotation_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTransfertDotation#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>APour Fournisseur Beneficiaire Instance Objet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Fournisseur Beneficiaire Instance Objet</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Fournisseur Beneficiaire Instance Objet</em>' containment reference.
	 * @see #setAPourFournisseurBeneficiaireInstanceObjet(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeTransfertDotation_APourFournisseurBeneficiaireInstanceObjet()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_InstanceObjet'"
	 *        extendedMetaData="kind='element' name='APourFournisseurBeneficiaire_InstanceObjet'"
	 * @generated
	 */
	TypeAssociation getAPourFournisseurBeneficiaireInstanceObjet();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTransfertDotation#getAPourFournisseurBeneficiaireInstanceObjet <em>APour Fournisseur Beneficiaire Instance Objet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Fournisseur Beneficiaire Instance Objet</em>' containment reference.
	 * @see #getAPourFournisseurBeneficiaireInstanceObjet()
	 * @generated
	 */
	void setAPourFournisseurBeneficiaireInstanceObjet(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Est Rapportee Par Rapport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Rapportee Par Rapport</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Rapportee Par Rapport</em>' containment reference.
	 * @see #setEstRapporteeParRapport(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeTransfertDotation_EstRapporteeParRapport()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Rapport'"
	 *        extendedMetaData="kind='element' name='EstRapporteePar_Rapport'"
	 * @generated
	 */
	TypeAssociation getEstRapporteeParRapport();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTransfertDotation#getEstRapporteeParRapport <em>Est Rapportee Par Rapport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Rapportee Par Rapport</em>' containment reference.
	 * @see #getEstRapporteeParRapport()
	 * @generated
	 */
	void setEstRapporteeParRapport(TypeAssociation value);

} // TypeTransfertDotation
