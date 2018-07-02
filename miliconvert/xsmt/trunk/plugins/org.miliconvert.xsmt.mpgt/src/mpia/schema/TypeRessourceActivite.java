/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociationEXT;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Ressource Activite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeRessourceActivite#isCritique <em>Critique</em>}</li>
 *   <li>{@link mpia.schema.TypeRessourceActivite#getQualification <em>Qualification</em>}</li>
 *   <li>{@link mpia.schema.TypeRessourceActivite#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeRessourceActivite#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeRessourceActivite#getEstAutoriseParEntiteOrganisationnelle <em>Est Autorise Par Entite Organisationnelle</em>}</li>
 *   <li>{@link mpia.schema.TypeRessourceActivite#getEstUtiliseSelonEmploiRessourceActivite <em>Est Utilise Selon Emploi Ressource Activite</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeRessourceActivite()
 * @model abstract="true"
 *        annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_RessourceActivite' kind='elementOnly'"
 * @generated
 */
public interface TypeRessourceActivite extends EObject {
	/**
	 * Returns the value of the '<em><b>Critique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Critique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Critique</em>' attribute.
	 * @see #isSetCritique()
	 * @see #unsetCritique()
	 * @see #setCritique(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeRessourceActivite_Critique()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='Critique'"
	 * @generated
	 */
	boolean isCritique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRessourceActivite#isCritique <em>Critique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Critique</em>' attribute.
	 * @see #isSetCritique()
	 * @see #unsetCritique()
	 * @see #isCritique()
	 * @generated
	 */
	void setCritique(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeRessourceActivite#isCritique <em>Critique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCritique()
	 * @see #isCritique()
	 * @see #setCritique(boolean)
	 * @generated
	 */
	void unsetCritique();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeRessourceActivite#isCritique <em>Critique</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Critique</em>' attribute is set.
	 * @see #unsetCritique()
	 * @see #isCritique()
	 * @see #setCritique(boolean)
	 * @generated
	 */
	boolean isSetCritique();

	/**
	 * Returns the value of the '<em><b>Qualification</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoRessourceActiviteQualification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualification</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoRessourceActiviteQualification
	 * @see #isSetQualification()
	 * @see #unsetQualification()
	 * @see #setQualification(TypeDictionaryDicoRessourceActiviteQualification)
	 * @see mpia.schema.SchemaPackage#getTypeRessourceActivite_Qualification()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Qualification'"
	 * @generated
	 */
	TypeDictionaryDicoRessourceActiviteQualification getQualification();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRessourceActivite#getQualification <em>Qualification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualification</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoRessourceActiviteQualification
	 * @see #isSetQualification()
	 * @see #unsetQualification()
	 * @see #getQualification()
	 * @generated
	 */
	void setQualification(TypeDictionaryDicoRessourceActiviteQualification value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeRessourceActivite#getQualification <em>Qualification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQualification()
	 * @see #getQualification()
	 * @see #setQualification(TypeDictionaryDicoRessourceActiviteQualification)
	 * @generated
	 */
	void unsetQualification();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeRessourceActivite#getQualification <em>Qualification</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Qualification</em>' attribute is set.
	 * @see #unsetQualification()
	 * @see #getQualification()
	 * @see #setQualification(TypeDictionaryDicoRessourceActiviteQualification)
	 * @generated
	 */
	boolean isSetQualification();

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
	 * @see mpia.schema.SchemaPackage#getTypeRessourceActivite_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRessourceActivite#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeRessourceActivite_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRessourceActivite#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Est Autorise Par Entite Organisationnelle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Autorise Par Entite Organisationnelle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Autorise Par Entite Organisationnelle</em>' containment reference.
	 * @see #setEstAutoriseParEntiteOrganisationnelle(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeRessourceActivite_EstAutoriseParEntiteOrganisationnelle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_EntiteOrganisationnelle'"
	 *        extendedMetaData="kind='element' name='EstAutorisePar_EntiteOrganisationnelle'"
	 * @generated
	 */
	TypeAssociationEXT getEstAutoriseParEntiteOrganisationnelle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRessourceActivite#getEstAutoriseParEntiteOrganisationnelle <em>Est Autorise Par Entite Organisationnelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Autorise Par Entite Organisationnelle</em>' containment reference.
	 * @see #getEstAutoriseParEntiteOrganisationnelle()
	 * @generated
	 */
	void setEstAutoriseParEntiteOrganisationnelle(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>Est Utilise Selon Emploi Ressource Activite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Utilise Selon Emploi Ressource Activite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Utilise Selon Emploi Ressource Activite</em>' containment reference.
	 * @see #setEstUtiliseSelonEmploiRessourceActivite(TypeEmploiRessourceActivite)
	 * @see mpia.schema.SchemaPackage#getTypeRessourceActivite_EstUtiliseSelonEmploiRessourceActivite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_EmploiRessourceActivite'"
	 *        extendedMetaData="kind='element' name='EstUtiliseSelon_EmploiRessourceActivite'"
	 * @generated
	 */
	TypeEmploiRessourceActivite getEstUtiliseSelonEmploiRessourceActivite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRessourceActivite#getEstUtiliseSelonEmploiRessourceActivite <em>Est Utilise Selon Emploi Ressource Activite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Utilise Selon Emploi Ressource Activite</em>' containment reference.
	 * @see #getEstUtiliseSelonEmploiRessourceActivite()
	 * @generated
	 */
	void setEstUtiliseSelonEmploiRessourceActivite(TypeEmploiRessourceActivite value);

} // TypeRessourceActivite
