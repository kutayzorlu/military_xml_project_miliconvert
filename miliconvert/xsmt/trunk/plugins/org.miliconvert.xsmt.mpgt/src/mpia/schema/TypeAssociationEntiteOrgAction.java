/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeAngle;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Association Entite Org Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationEntiteOrgAction#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationEntiteOrgAction#getAngleAvecObservateur <em>Angle Avec Observateur</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationEntiteOrgAction#getIntention <em>Intention</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationEntiteOrgAction#getAPourSujetEntiteOrganisationnelle <em>APour Sujet Entite Organisationnelle</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationEntiteOrgAction#getAPourObjetAction <em>APour Objet Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationEntiteOrgAction()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationEntiteOrgAction' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationEntiteOrgAction extends TypeAssociationInstanceObjetActivite {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationEntiteOrgActionCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationEntiteOrgActionCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationEntiteOrgActionCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationEntiteOrgAction_Categorie()
	 * @model unsettable="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationEntiteOrgActionCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationEntiteOrgAction#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationEntiteOrgActionCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationEntiteOrgActionCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationEntiteOrgAction#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationEntiteOrgActionCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationEntiteOrgAction#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationEntiteOrgActionCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Angle Avec Observateur</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angle Avec Observateur</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle Avec Observateur</em>' containment reference.
	 * @see #setAngleAvecObservateur(TypeDataTypeAngle)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationEntiteOrgAction_AngleAvecObservateur()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AngleAvecObservateur'"
	 * @generated
	 */
	TypeDataTypeAngle getAngleAvecObservateur();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationEntiteOrgAction#getAngleAvecObservateur <em>Angle Avec Observateur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Avec Observateur</em>' containment reference.
	 * @see #getAngleAvecObservateur()
	 * @generated
	 */
	void setAngleAvecObservateur(TypeDataTypeAngle value);

	/**
	 * Returns the value of the '<em><b>Intention</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intention</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intention</em>' attribute.
	 * @see #setIntention(String)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationEntiteOrgAction_Intention()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='Intention'"
	 * @generated
	 */
	String getIntention();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationEntiteOrgAction#getIntention <em>Intention</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intention</em>' attribute.
	 * @see #getIntention()
	 * @generated
	 */
	void setIntention(String value);

	/**
	 * Returns the value of the '<em><b>APour Sujet Entite Organisationnelle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Sujet Entite Organisationnelle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Sujet Entite Organisationnelle</em>' containment reference.
	 * @see #setAPourSujetEntiteOrganisationnelle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationEntiteOrgAction_APourSujetEntiteOrganisationnelle()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssociationEntiteOrgAction' target_entity='type_EntiteOrganisationnelle'"
	 *        extendedMetaData="kind='element' name='APourSujet_EntiteOrganisationnelle'"
	 * @generated
	 */
	TypeAssociation getAPourSujetEntiteOrganisationnelle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationEntiteOrgAction#getAPourSujetEntiteOrganisationnelle <em>APour Sujet Entite Organisationnelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Sujet Entite Organisationnelle</em>' containment reference.
	 * @see #getAPourSujetEntiteOrganisationnelle()
	 * @generated
	 */
	void setAPourSujetEntiteOrganisationnelle(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Objet Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Objet Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Objet Action</em>' containment reference.
	 * @see #setAPourObjetAction(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationEntiteOrgAction_APourObjetAction()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssociationEntiteOrgAction' target_entity='type_Action'"
	 *        extendedMetaData="kind='element' name='APourObjet_Action'"
	 * @generated
	 */
	TypeAssociation getAPourObjetAction();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationEntiteOrgAction#getAPourObjetAction <em>APour Objet Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Objet Action</em>' containment reference.
	 * @see #getAPourObjetAction()
	 * @generated
	 */
	void setAPourObjetAction(TypeAssociation value);

} // TypeAssociationEntiteOrgAction
