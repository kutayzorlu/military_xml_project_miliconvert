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
 * A representation of the model object '<em><b>Type Ressource Attendue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeRessourceAttendue#getTypeDeRavitaillement <em>Type De Ravitaillement</em>}</li>
 *   <li>{@link mpia.schema.TypeRessourceAttendue#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeRessourceAttendue#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeRessourceAttendue#getAPourBeneficiaireUnite <em>APour Beneficiaire Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeRessourceAttendue#getACommeLieuDeLivraisonOuDePerceptionAutreElementControle <em>AComme Lieu De Livraison Ou De Perception Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeRessourceAttendue#getACommeRessourceElementaireRessourceElementaire <em>AComme Ressource Elementaire Ressource Elementaire</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeRessourceAttendue()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_RessourceAttendue' kind='elementOnly'"
 * @generated
 */
public interface TypeRessourceAttendue extends EObject {
	/**
	 * Returns the value of the '<em><b>Type De Ravitaillement</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoRessourceAttendueTypeDeRavitaillement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type De Ravitaillement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type De Ravitaillement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoRessourceAttendueTypeDeRavitaillement
	 * @see #isSetTypeDeRavitaillement()
	 * @see #unsetTypeDeRavitaillement()
	 * @see #setTypeDeRavitaillement(TypeDictionaryDicoRessourceAttendueTypeDeRavitaillement)
	 * @see mpia.schema.SchemaPackage#getTypeRessourceAttendue_TypeDeRavitaillement()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='TypeDeRavitaillement'"
	 * @generated
	 */
	TypeDictionaryDicoRessourceAttendueTypeDeRavitaillement getTypeDeRavitaillement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRessourceAttendue#getTypeDeRavitaillement <em>Type De Ravitaillement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type De Ravitaillement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoRessourceAttendueTypeDeRavitaillement
	 * @see #isSetTypeDeRavitaillement()
	 * @see #unsetTypeDeRavitaillement()
	 * @see #getTypeDeRavitaillement()
	 * @generated
	 */
	void setTypeDeRavitaillement(TypeDictionaryDicoRessourceAttendueTypeDeRavitaillement value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeRessourceAttendue#getTypeDeRavitaillement <em>Type De Ravitaillement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeDeRavitaillement()
	 * @see #getTypeDeRavitaillement()
	 * @see #setTypeDeRavitaillement(TypeDictionaryDicoRessourceAttendueTypeDeRavitaillement)
	 * @generated
	 */
	void unsetTypeDeRavitaillement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeRessourceAttendue#getTypeDeRavitaillement <em>Type De Ravitaillement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type De Ravitaillement</em>' attribute is set.
	 * @see #unsetTypeDeRavitaillement()
	 * @see #getTypeDeRavitaillement()
	 * @see #setTypeDeRavitaillement(TypeDictionaryDicoRessourceAttendueTypeDeRavitaillement)
	 * @generated
	 */
	boolean isSetTypeDeRavitaillement();

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
	 * @see mpia.schema.SchemaPackage#getTypeRessourceAttendue_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRessourceAttendue#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeRessourceAttendue_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRessourceAttendue#getCE <em>CE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeRessourceAttendue_APourBeneficiaireUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourBeneficiaire_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getAPourBeneficiaireUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRessourceAttendue#getAPourBeneficiaireUnite <em>APour Beneficiaire Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Beneficiaire Unite</em>' containment reference.
	 * @see #getAPourBeneficiaireUnite()
	 * @generated
	 */
	void setAPourBeneficiaireUnite(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>AComme Lieu De Livraison Ou De Perception Autre Element Controle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Lieu De Livraison Ou De Perception Autre Element Controle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Lieu De Livraison Ou De Perception Autre Element Controle</em>' containment reference.
	 * @see #setACommeLieuDeLivraisonOuDePerceptionAutreElementControle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeRessourceAttendue_ACommeLieuDeLivraisonOuDePerceptionAutreElementControle()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='ACommeLieuDeLivraisonOuDePerception_AutreElementControle'"
	 * @generated
	 */
	TypeAssociation getACommeLieuDeLivraisonOuDePerceptionAutreElementControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRessourceAttendue#getACommeLieuDeLivraisonOuDePerceptionAutreElementControle <em>AComme Lieu De Livraison Ou De Perception Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Lieu De Livraison Ou De Perception Autre Element Controle</em>' containment reference.
	 * @see #getACommeLieuDeLivraisonOuDePerceptionAutreElementControle()
	 * @generated
	 */
	void setACommeLieuDeLivraisonOuDePerceptionAutreElementControle(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>AComme Ressource Elementaire Ressource Elementaire</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeRessourceElementaire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Ressource Elementaire Ressource Elementaire</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Ressource Elementaire Ressource Elementaire</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeRessourceAttendue_ACommeRessourceElementaireRessourceElementaire()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_RessourceElementaire'"
	 *        extendedMetaData="kind='element' name='ACommeRessourceElementaire_RessourceElementaire'"
	 * @generated
	 */
	EList<TypeRessourceElementaire> getACommeRessourceElementaireRessourceElementaire();

} // TypeRessourceAttendue
