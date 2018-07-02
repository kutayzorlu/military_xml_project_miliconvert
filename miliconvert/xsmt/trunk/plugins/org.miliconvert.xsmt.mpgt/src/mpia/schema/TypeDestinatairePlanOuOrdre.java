/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeDateHeure;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Destinataire Plan Ou Ordre</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeDestinatairePlanOuOrdre#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeDestinatairePlanOuOrdre#getDateEnvoi <em>Date Envoi</em>}</li>
 *   <li>{@link mpia.schema.TypeDestinatairePlanOuOrdre#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeDestinatairePlanOuOrdre#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeDestinatairePlanOuOrdre#getAPourDestinataireEntiteOrganisationnelle <em>APour Destinataire Entite Organisationnelle</em>}</li>
 *   <li>{@link mpia.schema.TypeDestinatairePlanOuOrdre#getAPourApercuApercuDestinatairePlanOuOrdre <em>APour Apercu Apercu Destinataire Plan Ou Ordre</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeDestinatairePlanOuOrdre()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_DestinatairePlanOuOrdre' kind='elementOnly'"
 * @generated
 */
public interface TypeDestinatairePlanOuOrdre extends EObject {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoDestinatairePlanOrdreCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDestinatairePlanOrdreCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoDestinatairePlanOrdreCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeDestinatairePlanOuOrdre_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoDestinatairePlanOrdreCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDestinatairePlanOuOrdre#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDestinatairePlanOrdreCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoDestinatairePlanOrdreCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeDestinatairePlanOuOrdre#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoDestinatairePlanOrdreCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeDestinatairePlanOuOrdre#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoDestinatairePlanOrdreCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Date Envoi</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Envoi</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Envoi</em>' containment reference.
	 * @see #setDateEnvoi(TypeDataTypeDateHeure)
	 * @see mpia.schema.SchemaPackage#getTypeDestinatairePlanOuOrdre_DateEnvoi()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DateEnvoi'"
	 * @generated
	 */
	TypeDataTypeDateHeure getDateEnvoi();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDestinatairePlanOuOrdre#getDateEnvoi <em>Date Envoi</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Envoi</em>' containment reference.
	 * @see #getDateEnvoi()
	 * @generated
	 */
	void setDateEnvoi(TypeDataTypeDateHeure value);

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
	 * @see mpia.schema.SchemaPackage#getTypeDestinatairePlanOuOrdre_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDestinatairePlanOuOrdre#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeDestinatairePlanOuOrdre_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDestinatairePlanOuOrdre#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>APour Destinataire Entite Organisationnelle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Destinataire Entite Organisationnelle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Destinataire Entite Organisationnelle</em>' containment reference.
	 * @see #setAPourDestinataireEntiteOrganisationnelle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeDestinatairePlanOuOrdre_APourDestinataireEntiteOrganisationnelle()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_EntiteOrganisationnelle'"
	 *        extendedMetaData="kind='element' name='APourDestinataire_EntiteOrganisationnelle'"
	 * @generated
	 */
	TypeAssociation getAPourDestinataireEntiteOrganisationnelle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDestinatairePlanOuOrdre#getAPourDestinataireEntiteOrganisationnelle <em>APour Destinataire Entite Organisationnelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Destinataire Entite Organisationnelle</em>' containment reference.
	 * @see #getAPourDestinataireEntiteOrganisationnelle()
	 * @generated
	 */
	void setAPourDestinataireEntiteOrganisationnelle(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Apercu Apercu Destinataire Plan Ou Ordre</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeApercuDestinatairePlanOuOrdre}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Apercu Apercu Destinataire Plan Ou Ordre</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Apercu Apercu Destinataire Plan Ou Ordre</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeDestinatairePlanOuOrdre_APourApercuApercuDestinatairePlanOuOrdre()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ApercuDestinatairePlanOuOrdre'"
	 *        extendedMetaData="kind='element' name='APourApercu_ApercuDestinatairePlanOuOrdre'"
	 * @generated
	 */
	EList<TypeApercuDestinatairePlanOuOrdre> getAPourApercuApercuDestinatairePlanOuOrdre();

} // TypeDestinatairePlanOuOrdre
