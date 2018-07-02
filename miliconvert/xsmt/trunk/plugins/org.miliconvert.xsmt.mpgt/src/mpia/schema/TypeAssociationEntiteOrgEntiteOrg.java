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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Association Entite Org Entite Org</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationEntiteOrgEntiteOrg#isPresencePC <em>Presence PC</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationEntiteOrgEntiteOrg#getSousCategorie <em>Sous Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationEntiteOrgEntiteOrg#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationEntiteOrgEntiteOrg#getAPourSujetEntiteOrganisationnelle <em>APour Sujet Entite Organisationnelle</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationEntiteOrgEntiteOrg#getAPourObjetEntiteOrganisationnelle <em>APour Objet Entite Organisationnelle</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationEntiteOrgEntiteOrg#getAPourModaliteSoutienLogistiqueModaliteSoutienLogistique <em>APour Modalite Soutien Logistique Modalite Soutien Logistique</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationEntiteOrgEntiteOrg#getEstReferenceeDansArticulation <em>Est Referencee Dans Articulation</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationEntiteOrgEntiteOrg#getEstSpecifieePourAction <em>Est Specifiee Pour Action</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationEntiteOrgEntiteOrg#getEstCadreProfil <em>Est Cadre Profil</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationEntiteOrgEntiteOrg()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationEntiteOrgEntiteOrg' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationEntiteOrgEntiteOrg extends TypeAssociationInstanceObjetInstanceObjet {
	/**
	 * Returns the value of the '<em><b>Presence PC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Presence PC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presence PC</em>' attribute.
	 * @see #isSetPresencePC()
	 * @see #unsetPresencePC()
	 * @see #setPresencePC(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationEntiteOrgEntiteOrg_PresencePC()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='PresencePC'"
	 * @generated
	 */
	boolean isPresencePC();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationEntiteOrgEntiteOrg#isPresencePC <em>Presence PC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presence PC</em>' attribute.
	 * @see #isSetPresencePC()
	 * @see #unsetPresencePC()
	 * @see #isPresencePC()
	 * @generated
	 */
	void setPresencePC(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationEntiteOrgEntiteOrg#isPresencePC <em>Presence PC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPresencePC()
	 * @see #isPresencePC()
	 * @see #setPresencePC(boolean)
	 * @generated
	 */
	void unsetPresencePC();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationEntiteOrgEntiteOrg#isPresencePC <em>Presence PC</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Presence PC</em>' attribute is set.
	 * @see #unsetPresencePC()
	 * @see #isPresencePC()
	 * @see #setPresencePC(boolean)
	 * @generated
	 */
	boolean isSetPresencePC();

	/**
	 * Returns the value of the '<em><b>Sous Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationInstanceObjetInstanceObjetSousCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sous Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sous Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationInstanceObjetInstanceObjetSousCategorie
	 * @see #isSetSousCategorie()
	 * @see #unsetSousCategorie()
	 * @see #setSousCategorie(TypeDictionaryDicoAssociationInstanceObjetInstanceObjetSousCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationEntiteOrgEntiteOrg_SousCategorie()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='SousCategorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationInstanceObjetInstanceObjetSousCategorie getSousCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationEntiteOrgEntiteOrg#getSousCategorie <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sous Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationInstanceObjetInstanceObjetSousCategorie
	 * @see #isSetSousCategorie()
	 * @see #unsetSousCategorie()
	 * @see #getSousCategorie()
	 * @generated
	 */
	void setSousCategorie(TypeDictionaryDicoAssociationInstanceObjetInstanceObjetSousCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationEntiteOrgEntiteOrg#getSousCategorie <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSousCategorie()
	 * @see #getSousCategorie()
	 * @see #setSousCategorie(TypeDictionaryDicoAssociationInstanceObjetInstanceObjetSousCategorie)
	 * @generated
	 */
	void unsetSousCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationEntiteOrgEntiteOrg#getSousCategorie <em>Sous Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sous Categorie</em>' attribute is set.
	 * @see #unsetSousCategorie()
	 * @see #getSousCategorie()
	 * @see #setSousCategorie(TypeDictionaryDicoAssociationInstanceObjetInstanceObjetSousCategorie)
	 * @generated
	 */
	boolean isSetSousCategorie();

	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationEntiteOrgEntiteOrgCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationEntiteOrgEntiteOrgCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationEntiteOrgEntiteOrgCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationEntiteOrgEntiteOrg_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationEntiteOrgEntiteOrgCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationEntiteOrgEntiteOrg#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationEntiteOrgEntiteOrgCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationEntiteOrgEntiteOrgCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationEntiteOrgEntiteOrg#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationEntiteOrgEntiteOrgCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationEntiteOrgEntiteOrg#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationEntiteOrgEntiteOrgCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>APour Sujet Entite Organisationnelle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Sujet Entite Organisationnelle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Sujet Entite Organisationnelle</em>' containment reference.
	 * @see #setAPourSujetEntiteOrganisationnelle(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationEntiteOrgEntiteOrg_APourSujetEntiteOrganisationnelle()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssociationEntiteOrgEntiteOrg' target_entity='type_EntiteOrganisationnelle'"
	 *        extendedMetaData="kind='element' name='APourSujet_EntiteOrganisationnelle'"
	 * @generated
	 */
	TypeAssociationEXT getAPourSujetEntiteOrganisationnelle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationEntiteOrgEntiteOrg#getAPourSujetEntiteOrganisationnelle <em>APour Sujet Entite Organisationnelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Sujet Entite Organisationnelle</em>' containment reference.
	 * @see #getAPourSujetEntiteOrganisationnelle()
	 * @generated
	 */
	void setAPourSujetEntiteOrganisationnelle(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>APour Objet Entite Organisationnelle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Objet Entite Organisationnelle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Objet Entite Organisationnelle</em>' containment reference.
	 * @see #setAPourObjetEntiteOrganisationnelle(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationEntiteOrgEntiteOrg_APourObjetEntiteOrganisationnelle()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssociationEntiteOrgEntiteOrg' target_entity='type_EntiteOrganisationnelle'"
	 *        extendedMetaData="kind='element' name='APourObjet_EntiteOrganisationnelle'"
	 * @generated
	 */
	TypeAssociationEXT getAPourObjetEntiteOrganisationnelle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationEntiteOrgEntiteOrg#getAPourObjetEntiteOrganisationnelle <em>APour Objet Entite Organisationnelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Objet Entite Organisationnelle</em>' containment reference.
	 * @see #getAPourObjetEntiteOrganisationnelle()
	 * @generated
	 */
	void setAPourObjetEntiteOrganisationnelle(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>APour Modalite Soutien Logistique Modalite Soutien Logistique</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Modalite Soutien Logistique Modalite Soutien Logistique</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Modalite Soutien Logistique Modalite Soutien Logistique</em>' containment reference.
	 * @see #setAPourModaliteSoutienLogistiqueModaliteSoutienLogistique(TypeModaliteSoutienLogistique)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationEntiteOrgEntiteOrg_APourModaliteSoutienLogistiqueModaliteSoutienLogistique()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ModaliteSoutienLogistique'"
	 *        extendedMetaData="kind='element' name='APourModaliteSoutienLogistique_ModaliteSoutienLogistique'"
	 * @generated
	 */
	TypeModaliteSoutienLogistique getAPourModaliteSoutienLogistiqueModaliteSoutienLogistique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationEntiteOrgEntiteOrg#getAPourModaliteSoutienLogistiqueModaliteSoutienLogistique <em>APour Modalite Soutien Logistique Modalite Soutien Logistique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Modalite Soutien Logistique Modalite Soutien Logistique</em>' containment reference.
	 * @see #getAPourModaliteSoutienLogistiqueModaliteSoutienLogistique()
	 * @generated
	 */
	void setAPourModaliteSoutienLogistiqueModaliteSoutienLogistique(TypeModaliteSoutienLogistique value);

	/**
	 * Returns the value of the '<em><b>Est Referencee Dans Articulation</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociationEXT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Referencee Dans Articulation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Referencee Dans Articulation</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeAssociationEntiteOrgEntiteOrg_EstReferenceeDansArticulation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstConstitueDe_AssociationEntiteOrgEntiteOrg' target_entity='type_Articulation'"
	 *        extendedMetaData="kind='element' name='EstReferenceeDans_Articulation'"
	 * @generated
	 */
	EList<TypeAssociationEXT> getEstReferenceeDansArticulation();

	/**
	 * Returns the value of the '<em><b>Est Specifiee Pour Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Specifiee Pour Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Specifiee Pour Action</em>' containment reference.
	 * @see #setEstSpecifieePourAction(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationEntiteOrgEntiteOrg_EstSpecifieePourAction()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Action'"
	 *        extendedMetaData="kind='element' name='EstSpecifieePour_Action'"
	 * @generated
	 */
	TypeAssociation getEstSpecifieePourAction();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationEntiteOrgEntiteOrg#getEstSpecifieePourAction <em>Est Specifiee Pour Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Specifiee Pour Action</em>' containment reference.
	 * @see #getEstSpecifieePourAction()
	 * @generated
	 */
	void setEstSpecifieePourAction(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Est Cadre Profil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Cadre Profil</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Cadre Profil</em>' containment reference.
	 * @see #setEstCadreProfil(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationEntiteOrgEntiteOrg_EstCadreProfil()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Profil'"
	 *        extendedMetaData="kind='element' name='EstCadre_Profil'"
	 * @generated
	 */
	TypeAssociation getEstCadreProfil();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationEntiteOrgEntiteOrg#getEstCadreProfil <em>Est Cadre Profil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Cadre Profil</em>' containment reference.
	 * @see #getEstCadreProfil()
	 * @generated
	 */
	void setEstCadreProfil(TypeAssociation value);

} // TypeAssociationEntiteOrgEntiteOrg
