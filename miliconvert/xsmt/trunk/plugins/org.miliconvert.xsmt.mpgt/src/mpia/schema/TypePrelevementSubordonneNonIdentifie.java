/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociationEXT;
import mpia.meta.TypeDataTypeDateHeure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Prelevement Subordonne Non Identifie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypePrelevementSubordonneNonIdentifie#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypePrelevementSubordonneNonIdentifie#getSousCategorie <em>Sous Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypePrelevementSubordonneNonIdentifie#getDateDebutRenforcement <em>Date Debut Renforcement</em>}</li>
 *   <li>{@link mpia.schema.TypePrelevementSubordonneNonIdentifie#getDateFinRenforcement <em>Date Fin Renforcement</em>}</li>
 *   <li>{@link mpia.schema.TypePrelevementSubordonneNonIdentifie#getQuantiteMin <em>Quantite Min</em>}</li>
 *   <li>{@link mpia.schema.TypePrelevementSubordonneNonIdentifie#getQuantiteMax <em>Quantite Max</em>}</li>
 *   <li>{@link mpia.schema.TypePrelevementSubordonneNonIdentifie#getNomModule <em>Nom Module</em>}</li>
 *   <li>{@link mpia.schema.TypePrelevementSubordonneNonIdentifie#getACommeUniteFournisseurUnite <em>AComme Unite Fournisseur Unite</em>}</li>
 *   <li>{@link mpia.schema.TypePrelevementSubordonneNonIdentifie#getACommeUniteBeneficiaireUnite <em>AComme Unite Beneficiaire Unite</em>}</li>
 *   <li>{@link mpia.schema.TypePrelevementSubordonneNonIdentifie#getEstCaracteriseParTypeUnite <em>Est Caracterise Par Type Unite</em>}</li>
 *   <li>{@link mpia.schema.TypePrelevementSubordonneNonIdentifie#getAPourModaliteSoutienLogistiqueModaliteSoutienLogistique <em>APour Modalite Soutien Logistique Modalite Soutien Logistique</em>}</li>
 *   <li>{@link mpia.schema.TypePrelevementSubordonneNonIdentifie#getAPourEquipementOuRessourceEquipementOuRessourceEnQuantite <em>APour Equipement Ou Ressource Equipement Ou Ressource En Quantite</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypePrelevementSubordonneNonIdentifie()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_PrelevementSubordonneNonIdentifie' kind='elementOnly'"
 * @generated
 */
public interface TypePrelevementSubordonneNonIdentifie extends TypePrelevementDetachement {
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
	 * @see mpia.schema.SchemaPackage#getTypePrelevementSubordonneNonIdentifie_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationEntiteOrgEntiteOrgCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrelevementSubordonneNonIdentifie#getCategorie <em>Categorie</em>}' attribute.
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
	 * Unsets the value of the '{@link mpia.schema.TypePrelevementSubordonneNonIdentifie#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationEntiteOrgEntiteOrgCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePrelevementSubordonneNonIdentifie#getCategorie <em>Categorie</em>}' attribute is set.
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
	 * @see mpia.schema.SchemaPackage#getTypePrelevementSubordonneNonIdentifie_SousCategorie()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='SousCategorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationInstanceObjetInstanceObjetSousCategorie getSousCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrelevementSubordonneNonIdentifie#getSousCategorie <em>Sous Categorie</em>}' attribute.
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
	 * Unsets the value of the '{@link mpia.schema.TypePrelevementSubordonneNonIdentifie#getSousCategorie <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSousCategorie()
	 * @see #getSousCategorie()
	 * @see #setSousCategorie(TypeDictionaryDicoAssociationInstanceObjetInstanceObjetSousCategorie)
	 * @generated
	 */
	void unsetSousCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePrelevementSubordonneNonIdentifie#getSousCategorie <em>Sous Categorie</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Date Debut Renforcement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Debut Renforcement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Debut Renforcement</em>' containment reference.
	 * @see #setDateDebutRenforcement(TypeDataTypeDateHeure)
	 * @see mpia.schema.SchemaPackage#getTypePrelevementSubordonneNonIdentifie_DateDebutRenforcement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DateDebutRenforcement'"
	 * @generated
	 */
	TypeDataTypeDateHeure getDateDebutRenforcement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrelevementSubordonneNonIdentifie#getDateDebutRenforcement <em>Date Debut Renforcement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Debut Renforcement</em>' containment reference.
	 * @see #getDateDebutRenforcement()
	 * @generated
	 */
	void setDateDebutRenforcement(TypeDataTypeDateHeure value);

	/**
	 * Returns the value of the '<em><b>Date Fin Renforcement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Fin Renforcement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Fin Renforcement</em>' containment reference.
	 * @see #setDateFinRenforcement(TypeDataTypeDateHeure)
	 * @see mpia.schema.SchemaPackage#getTypePrelevementSubordonneNonIdentifie_DateFinRenforcement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DateFinRenforcement'"
	 * @generated
	 */
	TypeDataTypeDateHeure getDateFinRenforcement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrelevementSubordonneNonIdentifie#getDateFinRenforcement <em>Date Fin Renforcement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Fin Renforcement</em>' containment reference.
	 * @see #getDateFinRenforcement()
	 * @generated
	 */
	void setDateFinRenforcement(TypeDataTypeDateHeure value);

	/**
	 * Returns the value of the '<em><b>Quantite Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantite Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite Min</em>' attribute.
	 * @see #isSetQuantiteMin()
	 * @see #unsetQuantiteMin()
	 * @see #setQuantiteMin(long)
	 * @see mpia.schema.SchemaPackage#getTypePrelevementSubordonneNonIdentifie_QuantiteMin()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6" required="true"
	 *        extendedMetaData="kind='element' name='QuantiteMin'"
	 * @generated
	 */
	long getQuantiteMin();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrelevementSubordonneNonIdentifie#getQuantiteMin <em>Quantite Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite Min</em>' attribute.
	 * @see #isSetQuantiteMin()
	 * @see #unsetQuantiteMin()
	 * @see #getQuantiteMin()
	 * @generated
	 */
	void setQuantiteMin(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePrelevementSubordonneNonIdentifie#getQuantiteMin <em>Quantite Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuantiteMin()
	 * @see #getQuantiteMin()
	 * @see #setQuantiteMin(long)
	 * @generated
	 */
	void unsetQuantiteMin();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePrelevementSubordonneNonIdentifie#getQuantiteMin <em>Quantite Min</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quantite Min</em>' attribute is set.
	 * @see #unsetQuantiteMin()
	 * @see #getQuantiteMin()
	 * @see #setQuantiteMin(long)
	 * @generated
	 */
	boolean isSetQuantiteMin();

	/**
	 * Returns the value of the '<em><b>Quantite Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantite Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite Max</em>' attribute.
	 * @see #isSetQuantiteMax()
	 * @see #unsetQuantiteMax()
	 * @see #setQuantiteMax(long)
	 * @see mpia.schema.SchemaPackage#getTypePrelevementSubordonneNonIdentifie_QuantiteMax()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='QuantiteMax'"
	 * @generated
	 */
	long getQuantiteMax();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrelevementSubordonneNonIdentifie#getQuantiteMax <em>Quantite Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite Max</em>' attribute.
	 * @see #isSetQuantiteMax()
	 * @see #unsetQuantiteMax()
	 * @see #getQuantiteMax()
	 * @generated
	 */
	void setQuantiteMax(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePrelevementSubordonneNonIdentifie#getQuantiteMax <em>Quantite Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuantiteMax()
	 * @see #getQuantiteMax()
	 * @see #setQuantiteMax(long)
	 * @generated
	 */
	void unsetQuantiteMax();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePrelevementSubordonneNonIdentifie#getQuantiteMax <em>Quantite Max</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quantite Max</em>' attribute is set.
	 * @see #unsetQuantiteMax()
	 * @see #getQuantiteMax()
	 * @see #setQuantiteMax(long)
	 * @generated
	 */
	boolean isSetQuantiteMax();

	/**
	 * Returns the value of the '<em><b>Nom Module</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom Module</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Module</em>' attribute.
	 * @see #setNomModule(String)
	 * @see mpia.schema.SchemaPackage#getTypePrelevementSubordonneNonIdentifie_NomModule()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='NomModule'"
	 * @generated
	 */
	String getNomModule();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrelevementSubordonneNonIdentifie#getNomModule <em>Nom Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Module</em>' attribute.
	 * @see #getNomModule()
	 * @generated
	 */
	void setNomModule(String value);

	/**
	 * Returns the value of the '<em><b>AComme Unite Fournisseur Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Unite Fournisseur Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Unite Fournisseur Unite</em>' containment reference.
	 * @see #setACommeUniteFournisseurUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypePrelevementSubordonneNonIdentifie_ACommeUniteFournisseurUnite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstFourniPour_PrelevementSubordonneNonIdentifie' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='ACommeUniteFournisseur_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getACommeUniteFournisseurUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrelevementSubordonneNonIdentifie#getACommeUniteFournisseurUnite <em>AComme Unite Fournisseur Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Unite Fournisseur Unite</em>' containment reference.
	 * @see #getACommeUniteFournisseurUnite()
	 * @generated
	 */
	void setACommeUniteFournisseurUnite(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>AComme Unite Beneficiaire Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Unite Beneficiaire Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Unite Beneficiaire Unite</em>' containment reference.
	 * @see #setACommeUniteBeneficiaireUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypePrelevementSubordonneNonIdentifie_ACommeUniteBeneficiaireUnite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='Beneficie_PrelevementSubordonneNonIdentifie' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='ACommeUniteBeneficiaire_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getACommeUniteBeneficiaireUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrelevementSubordonneNonIdentifie#getACommeUniteBeneficiaireUnite <em>AComme Unite Beneficiaire Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Unite Beneficiaire Unite</em>' containment reference.
	 * @see #getACommeUniteBeneficiaireUnite()
	 * @generated
	 */
	void setACommeUniteBeneficiaireUnite(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>Est Caracterise Par Type Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Caracterise Par Type Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Caracterise Par Type Unite</em>' containment reference.
	 * @see #setEstCaracteriseParTypeUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypePrelevementSubordonneNonIdentifie_EstCaracteriseParTypeUnite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeUnite'"
	 *        extendedMetaData="kind='element' name='EstCaracterisePar_TypeUnite'"
	 * @generated
	 */
	TypeAssociationEXT getEstCaracteriseParTypeUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrelevementSubordonneNonIdentifie#getEstCaracteriseParTypeUnite <em>Est Caracterise Par Type Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Caracterise Par Type Unite</em>' containment reference.
	 * @see #getEstCaracteriseParTypeUnite()
	 * @generated
	 */
	void setEstCaracteriseParTypeUnite(TypeAssociationEXT value);

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
	 * @see mpia.schema.SchemaPackage#getTypePrelevementSubordonneNonIdentifie_APourModaliteSoutienLogistiqueModaliteSoutienLogistique()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ModaliteSoutienLogistique'"
	 *        extendedMetaData="kind='element' name='APourModaliteSoutienLogistique_ModaliteSoutienLogistique'"
	 * @generated
	 */
	TypeModaliteSoutienLogistique getAPourModaliteSoutienLogistiqueModaliteSoutienLogistique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrelevementSubordonneNonIdentifie#getAPourModaliteSoutienLogistiqueModaliteSoutienLogistique <em>APour Modalite Soutien Logistique Modalite Soutien Logistique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Modalite Soutien Logistique Modalite Soutien Logistique</em>' containment reference.
	 * @see #getAPourModaliteSoutienLogistiqueModaliteSoutienLogistique()
	 * @generated
	 */
	void setAPourModaliteSoutienLogistiqueModaliteSoutienLogistique(TypeModaliteSoutienLogistique value);

	/**
	 * Returns the value of the '<em><b>APour Equipement Ou Ressource Equipement Ou Ressource En Quantite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeEquipementOuRessourceEnQuantite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Equipement Ou Ressource Equipement Ou Ressource En Quantite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Equipement Ou Ressource Equipement Ou Ressource En Quantite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePrelevementSubordonneNonIdentifie_APourEquipementOuRessourceEquipementOuRessourceEnQuantite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_EquipementOuRessourceEnQuantite'"
	 *        extendedMetaData="kind='element' name='APourEquipementOuRessource_EquipementOuRessourceEnQuantite'"
	 * @generated
	 */
	EList<TypeEquipementOuRessourceEnQuantite> getAPourEquipementOuRessourceEquipementOuRessourceEnQuantite();

} // TypePrelevementSubordonneNonIdentifie
