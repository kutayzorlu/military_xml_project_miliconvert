/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Association Affiliation Instance Objet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationAffiliationInstanceObjet#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationAffiliationInstanceObjet#getComportement <em>Comportement</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationAffiliationInstanceObjet#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationAffiliationInstanceObjet#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationAffiliationInstanceObjet#getConcerneAffiliationAffiliation <em>Concerne Affiliation Affiliation</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationAffiliationInstanceObjet#getConcerneInstanceObjetInstanceObjet <em>Concerne Instance Objet Instance Objet</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationAffiliationInstanceObjet#getEstRapporteeParRapport <em>Est Rapportee Par Rapport</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationAffiliationInstanceObjet()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationAffiliationInstanceObjet' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationAffiliationInstanceObjet extends EObject {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationAffiliationInstanceObjetCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationAffiliationInstanceObjetCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationAffiliationInstanceObjetCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationAffiliationInstanceObjet_Categorie()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationAffiliationInstanceObjetCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationAffiliationInstanceObjet#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationAffiliationInstanceObjetCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationAffiliationInstanceObjetCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationAffiliationInstanceObjet#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationAffiliationInstanceObjetCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationAffiliationInstanceObjet#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationAffiliationInstanceObjetCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Comportement</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationAffiliationComportement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comportement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comportement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationAffiliationComportement
	 * @see #isSetComportement()
	 * @see #unsetComportement()
	 * @see #setComportement(TypeDictionaryDicoAssociationAffiliationComportement)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationAffiliationInstanceObjet_Comportement()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Comportement'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationAffiliationComportement getComportement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationAffiliationInstanceObjet#getComportement <em>Comportement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comportement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationAffiliationComportement
	 * @see #isSetComportement()
	 * @see #unsetComportement()
	 * @see #getComportement()
	 * @generated
	 */
	void setComportement(TypeDictionaryDicoAssociationAffiliationComportement value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationAffiliationInstanceObjet#getComportement <em>Comportement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetComportement()
	 * @see #getComportement()
	 * @see #setComportement(TypeDictionaryDicoAssociationAffiliationComportement)
	 * @generated
	 */
	void unsetComportement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationAffiliationInstanceObjet#getComportement <em>Comportement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Comportement</em>' attribute is set.
	 * @see #unsetComportement()
	 * @see #getComportement()
	 * @see #setComportement(TypeDictionaryDicoAssociationAffiliationComportement)
	 * @generated
	 */
	boolean isSetComportement();

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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationAffiliationInstanceObjet_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationAffiliationInstanceObjet#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationAffiliationInstanceObjet_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationAffiliationInstanceObjet#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Concerne Affiliation Affiliation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Affiliation Affiliation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Affiliation Affiliation</em>' containment reference.
	 * @see #setConcerneAffiliationAffiliation(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationAffiliationInstanceObjet_ConcerneAffiliationAffiliation()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Affiliation'"
	 *        extendedMetaData="kind='element' name='ConcerneAffiliation_Affiliation'"
	 * @generated
	 */
	TypeAssociationEXT getConcerneAffiliationAffiliation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationAffiliationInstanceObjet#getConcerneAffiliationAffiliation <em>Concerne Affiliation Affiliation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concerne Affiliation Affiliation</em>' containment reference.
	 * @see #getConcerneAffiliationAffiliation()
	 * @generated
	 */
	void setConcerneAffiliationAffiliation(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>Concerne Instance Objet Instance Objet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Instance Objet Instance Objet</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Instance Objet Instance Objet</em>' containment reference.
	 * @see #setConcerneInstanceObjetInstanceObjet(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationAffiliationInstanceObjet_ConcerneInstanceObjetInstanceObjet()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstAffilieA_AssociationAffiliationInstanceObjet' target_entity='type_InstanceObjet'"
	 *        extendedMetaData="kind='element' name='ConcerneInstanceObjet_InstanceObjet'"
	 * @generated
	 */
	TypeAssociation getConcerneInstanceObjetInstanceObjet();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationAffiliationInstanceObjet#getConcerneInstanceObjetInstanceObjet <em>Concerne Instance Objet Instance Objet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concerne Instance Objet Instance Objet</em>' containment reference.
	 * @see #getConcerneInstanceObjetInstanceObjet()
	 * @generated
	 */
	void setConcerneInstanceObjetInstanceObjet(TypeAssociation value);

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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationAffiliationInstanceObjet_EstRapporteeParRapport()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Rapport'"
	 *        extendedMetaData="kind='element' name='EstRapporteePar_Rapport'"
	 * @generated
	 */
	TypeAssociation getEstRapporteeParRapport();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationAffiliationInstanceObjet#getEstRapporteeParRapport <em>Est Rapportee Par Rapport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Rapportee Par Rapport</em>' containment reference.
	 * @see #getEstRapporteeParRapport()
	 * @generated
	 */
	void setEstRapporteeParRapport(TypeAssociation value);

} // TypeAssociationAffiliationInstanceObjet
