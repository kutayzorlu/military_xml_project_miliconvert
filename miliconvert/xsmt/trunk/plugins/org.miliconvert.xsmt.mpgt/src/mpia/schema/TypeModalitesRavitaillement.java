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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Modalites Ravitaillement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeModalitesRavitaillement#getDebutPerceptionOuLivraison <em>Debut Perception Ou Livraison</em>}</li>
 *   <li>{@link mpia.schema.TypeModalitesRavitaillement#getTypeVecteurTransport <em>Type Vecteur Transport</em>}</li>
 *   <li>{@link mpia.schema.TypeModalitesRavitaillement#getNombreVecteursTransport <em>Nombre Vecteurs Transport</em>}</li>
 *   <li>{@link mpia.schema.TypeModalitesRavitaillement#getTypeFormationLogistique <em>Type Formation Logistique</em>}</li>
 *   <li>{@link mpia.schema.TypeModalitesRavitaillement#getAutreTypeFormationLogistique <em>Autre Type Formation Logistique</em>}</li>
 *   <li>{@link mpia.schema.TypeModalitesRavitaillement#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeModalitesRavitaillement#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeModalitesRavitaillement#getAPourUnitePerceptionOuLivraisonUnite <em>APour Unite Perception Ou Livraison Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeModalitesRavitaillement#getAPourLieuPerceptionOuLivraisonAutreElementControle <em>APour Lieu Perception Ou Livraison Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeModalitesRavitaillement#getDoitLivrerOuPercevoirDotationEffectiveConsommable <em>Doit Livrer Ou Percevoir Dotation Effective Consommable</em>}</li>
 *   <li>{@link mpia.schema.TypeModalitesRavitaillement#getAPourBeneficiaireUnite <em>APour Beneficiaire Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeModalitesRavitaillement()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_ModalitesRavitaillement' kind='elementOnly'"
 * @generated
 */
public interface TypeModalitesRavitaillement extends EObject {
	/**
	 * Returns the value of the '<em><b>Debut Perception Ou Livraison</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Debut Perception Ou Livraison</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debut Perception Ou Livraison</em>' attribute.
	 * @see #setDebutPerceptionOuLivraison(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeModalitesRavitaillement_DebutPerceptionOuLivraison()
	 * @model dataType="mpia.meta.TypeDataTypeGDH" required="true"
	 *        extendedMetaData="kind='element' name='DebutPerceptionOuLivraison'"
	 * @generated
	 */
	XMLGregorianCalendar getDebutPerceptionOuLivraison();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModalitesRavitaillement#getDebutPerceptionOuLivraison <em>Debut Perception Ou Livraison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debut Perception Ou Livraison</em>' attribute.
	 * @see #getDebutPerceptionOuLivraison()
	 * @generated
	 */
	void setDebutPerceptionOuLivraison(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Type Vecteur Transport</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Vecteur Transport</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Vecteur Transport</em>' attribute.
	 * @see #setTypeVecteurTransport(String)
	 * @see mpia.schema.SchemaPackage#getTypeModalitesRavitaillement_TypeVecteurTransport()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='TypeVecteurTransport'"
	 * @generated
	 */
	String getTypeVecteurTransport();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModalitesRavitaillement#getTypeVecteurTransport <em>Type Vecteur Transport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Vecteur Transport</em>' attribute.
	 * @see #getTypeVecteurTransport()
	 * @generated
	 */
	void setTypeVecteurTransport(String value);

	/**
	 * Returns the value of the '<em><b>Nombre Vecteurs Transport</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Vecteurs Transport</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Vecteurs Transport</em>' attribute.
	 * @see #isSetNombreVecteursTransport()
	 * @see #unsetNombreVecteursTransport()
	 * @see #setNombreVecteursTransport(long)
	 * @see mpia.schema.SchemaPackage#getTypeModalitesRavitaillement_NombreVecteursTransport()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='NombreVecteursTransport'"
	 * @generated
	 */
	long getNombreVecteursTransport();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModalitesRavitaillement#getNombreVecteursTransport <em>Nombre Vecteurs Transport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Vecteurs Transport</em>' attribute.
	 * @see #isSetNombreVecteursTransport()
	 * @see #unsetNombreVecteursTransport()
	 * @see #getNombreVecteursTransport()
	 * @generated
	 */
	void setNombreVecteursTransport(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeModalitesRavitaillement#getNombreVecteursTransport <em>Nombre Vecteurs Transport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreVecteursTransport()
	 * @see #getNombreVecteursTransport()
	 * @see #setNombreVecteursTransport(long)
	 * @generated
	 */
	void unsetNombreVecteursTransport();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeModalitesRavitaillement#getNombreVecteursTransport <em>Nombre Vecteurs Transport</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Vecteurs Transport</em>' attribute is set.
	 * @see #unsetNombreVecteursTransport()
	 * @see #getNombreVecteursTransport()
	 * @see #setNombreVecteursTransport(long)
	 * @generated
	 */
	boolean isSetNombreVecteursTransport();

	/**
	 * Returns the value of the '<em><b>Type Formation Logistique</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoZoneLogistiqueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Formation Logistique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Formation Logistique</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoZoneLogistiqueType
	 * @see #isSetTypeFormationLogistique()
	 * @see #unsetTypeFormationLogistique()
	 * @see #setTypeFormationLogistique(TypeDictionaryDicoZoneLogistiqueType)
	 * @see mpia.schema.SchemaPackage#getTypeModalitesRavitaillement_TypeFormationLogistique()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeFormationLogistique'"
	 * @generated
	 */
	TypeDictionaryDicoZoneLogistiqueType getTypeFormationLogistique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModalitesRavitaillement#getTypeFormationLogistique <em>Type Formation Logistique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Formation Logistique</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoZoneLogistiqueType
	 * @see #isSetTypeFormationLogistique()
	 * @see #unsetTypeFormationLogistique()
	 * @see #getTypeFormationLogistique()
	 * @generated
	 */
	void setTypeFormationLogistique(TypeDictionaryDicoZoneLogistiqueType value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeModalitesRavitaillement#getTypeFormationLogistique <em>Type Formation Logistique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeFormationLogistique()
	 * @see #getTypeFormationLogistique()
	 * @see #setTypeFormationLogistique(TypeDictionaryDicoZoneLogistiqueType)
	 * @generated
	 */
	void unsetTypeFormationLogistique();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeModalitesRavitaillement#getTypeFormationLogistique <em>Type Formation Logistique</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Formation Logistique</em>' attribute is set.
	 * @see #unsetTypeFormationLogistique()
	 * @see #getTypeFormationLogistique()
	 * @see #setTypeFormationLogistique(TypeDictionaryDicoZoneLogistiqueType)
	 * @generated
	 */
	boolean isSetTypeFormationLogistique();

	/**
	 * Returns the value of the '<em><b>Autre Type Formation Logistique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autre Type Formation Logistique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autre Type Formation Logistique</em>' attribute.
	 * @see #setAutreTypeFormationLogistique(String)
	 * @see mpia.schema.SchemaPackage#getTypeModalitesRavitaillement_AutreTypeFormationLogistique()
	 * @model dataType="mpia.meta.TypeDataTypeChaine020"
	 *        extendedMetaData="kind='element' name='AutreTypeFormationLogistique'"
	 * @generated
	 */
	String getAutreTypeFormationLogistique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModalitesRavitaillement#getAutreTypeFormationLogistique <em>Autre Type Formation Logistique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autre Type Formation Logistique</em>' attribute.
	 * @see #getAutreTypeFormationLogistique()
	 * @generated
	 */
	void setAutreTypeFormationLogistique(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeModalitesRavitaillement_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModalitesRavitaillement#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeModalitesRavitaillement_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModalitesRavitaillement#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>APour Unite Perception Ou Livraison Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Unite Perception Ou Livraison Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Unite Perception Ou Livraison Unite</em>' containment reference.
	 * @see #setAPourUnitePerceptionOuLivraisonUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeModalitesRavitaillement_APourUnitePerceptionOuLivraisonUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourUnitePerceptionOuLivraison_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getAPourUnitePerceptionOuLivraisonUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModalitesRavitaillement#getAPourUnitePerceptionOuLivraisonUnite <em>APour Unite Perception Ou Livraison Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Unite Perception Ou Livraison Unite</em>' containment reference.
	 * @see #getAPourUnitePerceptionOuLivraisonUnite()
	 * @generated
	 */
	void setAPourUnitePerceptionOuLivraisonUnite(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>APour Lieu Perception Ou Livraison Autre Element Controle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Lieu Perception Ou Livraison Autre Element Controle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Lieu Perception Ou Livraison Autre Element Controle</em>' containment reference.
	 * @see #setAPourLieuPerceptionOuLivraisonAutreElementControle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeModalitesRavitaillement_APourLieuPerceptionOuLivraisonAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='APourLieuPerceptionOuLivraison_AutreElementControle'"
	 * @generated
	 */
	TypeAssociation getAPourLieuPerceptionOuLivraisonAutreElementControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModalitesRavitaillement#getAPourLieuPerceptionOuLivraisonAutreElementControle <em>APour Lieu Perception Ou Livraison Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Lieu Perception Ou Livraison Autre Element Controle</em>' containment reference.
	 * @see #getAPourLieuPerceptionOuLivraisonAutreElementControle()
	 * @generated
	 */
	void setAPourLieuPerceptionOuLivraisonAutreElementControle(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Doit Livrer Ou Percevoir Dotation Effective Consommable</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeDotationEffectiveConsommable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Doit Livrer Ou Percevoir Dotation Effective Consommable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doit Livrer Ou Percevoir Dotation Effective Consommable</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeModalitesRavitaillement_DoitLivrerOuPercevoirDotationEffectiveConsommable()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_DotationEffectiveConsommable'"
	 *        extendedMetaData="kind='element' name='DoitLivrerOuPercevoir_DotationEffectiveConsommable'"
	 * @generated
	 */
	EList<TypeDotationEffectiveConsommable> getDoitLivrerOuPercevoirDotationEffectiveConsommable();

	/**
	 * Returns the value of the '<em><b>APour Beneficiaire Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociationEXT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Beneficiaire Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Beneficiaire Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeModalitesRavitaillement_APourBeneficiaireUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourBeneficiaire_Unite'"
	 * @generated
	 */
	EList<TypeAssociationEXT> getAPourBeneficiaireUnite();

} // TypeModalitesRavitaillement
