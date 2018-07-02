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
 * A representation of the model object '<em><b>Type Modalite Perception</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeModalitePerception#getDateDeDebut <em>Date De Debut</em>}</li>
 *   <li>{@link mpia.schema.TypeModalitePerception#getTypeFormationLogistique <em>Type Formation Logistique</em>}</li>
 *   <li>{@link mpia.schema.TypeModalitePerception#getComplement <em>Complement</em>}</li>
 *   <li>{@link mpia.schema.TypeModalitePerception#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeModalitePerception#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeModalitePerception#getACommeRessourceRavitaillementRessourceAttendue <em>AComme Ressource Ravitaillement Ressource Attendue</em>}</li>
 *   <li>{@link mpia.schema.TypeModalitePerception#getAPourBeneficiaireUnite <em>APour Beneficiaire Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeModalitePerception#getAPourBeneficiaireItineraire <em>APour Beneficiaire Itineraire</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeModalitePerception()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_ModalitePerception' kind='elementOnly'"
 * @generated
 */
public interface TypeModalitePerception extends EObject {
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
	 * @see mpia.schema.SchemaPackage#getTypeModalitePerception_DateDeDebut()
	 * @model dataType="mpia.meta.TypeDataTypeGDH" required="true"
	 *        extendedMetaData="kind='element' name='DateDeDebut'"
	 * @generated
	 */
	XMLGregorianCalendar getDateDeDebut();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModalitePerception#getDateDeDebut <em>Date De Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date De Debut</em>' attribute.
	 * @see #getDateDeDebut()
	 * @generated
	 */
	void setDateDeDebut(XMLGregorianCalendar value);

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
	 * @see mpia.schema.SchemaPackage#getTypeModalitePerception_TypeFormationLogistique()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeFormationLogistique'"
	 * @generated
	 */
	TypeDictionaryDicoZoneLogistiqueType getTypeFormationLogistique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModalitePerception#getTypeFormationLogistique <em>Type Formation Logistique</em>}' attribute.
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
	 * Unsets the value of the '{@link mpia.schema.TypeModalitePerception#getTypeFormationLogistique <em>Type Formation Logistique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeFormationLogistique()
	 * @see #getTypeFormationLogistique()
	 * @see #setTypeFormationLogistique(TypeDictionaryDicoZoneLogistiqueType)
	 * @generated
	 */
	void unsetTypeFormationLogistique();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeModalitePerception#getTypeFormationLogistique <em>Type Formation Logistique</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Complement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complement</em>' attribute.
	 * @see #setComplement(String)
	 * @see mpia.schema.SchemaPackage#getTypeModalitePerception_Complement()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='Complement'"
	 * @generated
	 */
	String getComplement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModalitePerception#getComplement <em>Complement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complement</em>' attribute.
	 * @see #getComplement()
	 * @generated
	 */
	void setComplement(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeModalitePerception_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModalitePerception#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeModalitePerception_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModalitePerception#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>AComme Ressource Ravitaillement Ressource Attendue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Ressource Ravitaillement Ressource Attendue</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Ressource Ravitaillement Ressource Attendue</em>' containment reference.
	 * @see #setACommeRessourceRavitaillementRessourceAttendue(TypeRessourceAttendue)
	 * @see mpia.schema.SchemaPackage#getTypeModalitePerception_ACommeRessourceRavitaillementRessourceAttendue()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_RessourceAttendue'"
	 *        extendedMetaData="kind='element' name='ACommeRessourceRavitaillement_RessourceAttendue'"
	 * @generated
	 */
	TypeRessourceAttendue getACommeRessourceRavitaillementRessourceAttendue();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModalitePerception#getACommeRessourceRavitaillementRessourceAttendue <em>AComme Ressource Ravitaillement Ressource Attendue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Ressource Ravitaillement Ressource Attendue</em>' containment reference.
	 * @see #getACommeRessourceRavitaillementRessourceAttendue()
	 * @generated
	 */
	void setACommeRessourceRavitaillementRessourceAttendue(TypeRessourceAttendue value);

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
	 * @see mpia.schema.SchemaPackage#getTypeModalitePerception_APourBeneficiaireUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourBeneficiaire_Unite'"
	 * @generated
	 */
	EList<TypeAssociationEXT> getAPourBeneficiaireUnite();

	/**
	 * Returns the value of the '<em><b>APour Beneficiaire Itineraire</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Beneficiaire Itineraire</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Beneficiaire Itineraire</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeModalitePerception_APourBeneficiaireItineraire()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Itineraire'"
	 *        extendedMetaData="kind='element' name='APourBeneficiaire_Itineraire'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourBeneficiaireItineraire();

} // TypeModalitePerception
