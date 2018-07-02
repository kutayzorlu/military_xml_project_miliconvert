/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Livraison</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeLivraison#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeLivraison#getTypeChaineLogistique <em>Type Chaine Logistique</em>}</li>
 *   <li>{@link mpia.schema.TypeLivraison#getDateRecompletement <em>Date Recompletement</em>}</li>
 *   <li>{@link mpia.schema.TypeLivraison#getDateRecompletementOrdonne <em>Date Recompletement Ordonne</em>}</li>
 *   <li>{@link mpia.schema.TypeLivraison#getDecisionAutorite <em>Decision Autorite</em>}</li>
 *   <li>{@link mpia.schema.TypeLivraison#getDateLivraison <em>Date Livraison</em>}</li>
 *   <li>{@link mpia.schema.TypeLivraison#isDernierePrevisionDemande <em>Derniere Prevision Demande</em>}</li>
 *   <li>{@link mpia.schema.TypeLivraison#isDernierePrevisionOrdre <em>Derniere Prevision Ordre</em>}</li>
 *   <li>{@link mpia.schema.TypeLivraison#getEstDecritParLigneLivraison <em>Est Decrit Par Ligne Livraison</em>}</li>
 *   <li>{@link mpia.schema.TypeLivraison#getEstObjetAssociationUniteLivraison <em>Est Objet Association Unite Livraison</em>}</li>
 *   <li>{@link mpia.schema.TypeLivraison#getEstObjetAssociationLivraisonLivaison <em>Est Objet Association Livraison Livaison</em>}</li>
 *   <li>{@link mpia.schema.TypeLivraison#getEstSujetAssociationLivraisonLivaison <em>Est Sujet Association Livraison Livaison</em>}</li>
 *   <li>{@link mpia.schema.TypeLivraison#getAPourConvoiFaisantMouvementConvoi <em>APour Convoi Faisant Mouvement Convoi</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeLivraison()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_Livraison' kind='elementOnly'"
 * @generated
 */
public interface TypeLivraison extends TypeActivite {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoLivraisonCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoLivraisonCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoLivraisonCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeLivraison_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoLivraisonCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLivraison#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoLivraisonCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoLivraisonCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeLivraison#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoLivraisonCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeLivraison#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoLivraisonCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Type Chaine Logistique</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoLivraisonTypeChaineLogistique}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Chaine Logistique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Chaine Logistique</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoLivraisonTypeChaineLogistique
	 * @see #isSetTypeChaineLogistique()
	 * @see #unsetTypeChaineLogistique()
	 * @see #setTypeChaineLogistique(TypeDictionaryDicoLivraisonTypeChaineLogistique)
	 * @see mpia.schema.SchemaPackage#getTypeLivraison_TypeChaineLogistique()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeChaineLogistique'"
	 * @generated
	 */
	TypeDictionaryDicoLivraisonTypeChaineLogistique getTypeChaineLogistique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLivraison#getTypeChaineLogistique <em>Type Chaine Logistique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Chaine Logistique</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoLivraisonTypeChaineLogistique
	 * @see #isSetTypeChaineLogistique()
	 * @see #unsetTypeChaineLogistique()
	 * @see #getTypeChaineLogistique()
	 * @generated
	 */
	void setTypeChaineLogistique(TypeDictionaryDicoLivraisonTypeChaineLogistique value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeLivraison#getTypeChaineLogistique <em>Type Chaine Logistique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeChaineLogistique()
	 * @see #getTypeChaineLogistique()
	 * @see #setTypeChaineLogistique(TypeDictionaryDicoLivraisonTypeChaineLogistique)
	 * @generated
	 */
	void unsetTypeChaineLogistique();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeLivraison#getTypeChaineLogistique <em>Type Chaine Logistique</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Chaine Logistique</em>' attribute is set.
	 * @see #unsetTypeChaineLogistique()
	 * @see #getTypeChaineLogistique()
	 * @see #setTypeChaineLogistique(TypeDictionaryDicoLivraisonTypeChaineLogistique)
	 * @generated
	 */
	boolean isSetTypeChaineLogistique();

	/**
	 * Returns the value of the '<em><b>Date Recompletement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Recompletement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Recompletement</em>' attribute.
	 * @see #setDateRecompletement(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeLivraison_DateRecompletement()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateRecompletement'"
	 * @generated
	 */
	XMLGregorianCalendar getDateRecompletement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLivraison#getDateRecompletement <em>Date Recompletement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Recompletement</em>' attribute.
	 * @see #getDateRecompletement()
	 * @generated
	 */
	void setDateRecompletement(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Date Recompletement Ordonne</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Recompletement Ordonne</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Recompletement Ordonne</em>' attribute.
	 * @see #setDateRecompletementOrdonne(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeLivraison_DateRecompletementOrdonne()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateRecompletementOrdonne'"
	 * @generated
	 */
	XMLGregorianCalendar getDateRecompletementOrdonne();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLivraison#getDateRecompletementOrdonne <em>Date Recompletement Ordonne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Recompletement Ordonne</em>' attribute.
	 * @see #getDateRecompletementOrdonne()
	 * @generated
	 */
	void setDateRecompletementOrdonne(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Decision Autorite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decision Autorite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decision Autorite</em>' attribute.
	 * @see #setDecisionAutorite(String)
	 * @see mpia.schema.SchemaPackage#getTypeLivraison_DecisionAutorite()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='DecisionAutorite'"
	 * @generated
	 */
	String getDecisionAutorite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLivraison#getDecisionAutorite <em>Decision Autorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decision Autorite</em>' attribute.
	 * @see #getDecisionAutorite()
	 * @generated
	 */
	void setDecisionAutorite(String value);

	/**
	 * Returns the value of the '<em><b>Date Livraison</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Livraison</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Livraison</em>' attribute.
	 * @see #setDateLivraison(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeLivraison_DateLivraison()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateLivraison'"
	 * @generated
	 */
	XMLGregorianCalendar getDateLivraison();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLivraison#getDateLivraison <em>Date Livraison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Livraison</em>' attribute.
	 * @see #getDateLivraison()
	 * @generated
	 */
	void setDateLivraison(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Derniere Prevision Demande</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derniere Prevision Demande</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derniere Prevision Demande</em>' attribute.
	 * @see #isSetDernierePrevisionDemande()
	 * @see #unsetDernierePrevisionDemande()
	 * @see #setDernierePrevisionDemande(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeLivraison_DernierePrevisionDemande()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='DernierePrevisionDemande'"
	 * @generated
	 */
	boolean isDernierePrevisionDemande();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLivraison#isDernierePrevisionDemande <em>Derniere Prevision Demande</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derniere Prevision Demande</em>' attribute.
	 * @see #isSetDernierePrevisionDemande()
	 * @see #unsetDernierePrevisionDemande()
	 * @see #isDernierePrevisionDemande()
	 * @generated
	 */
	void setDernierePrevisionDemande(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeLivraison#isDernierePrevisionDemande <em>Derniere Prevision Demande</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDernierePrevisionDemande()
	 * @see #isDernierePrevisionDemande()
	 * @see #setDernierePrevisionDemande(boolean)
	 * @generated
	 */
	void unsetDernierePrevisionDemande();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeLivraison#isDernierePrevisionDemande <em>Derniere Prevision Demande</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Derniere Prevision Demande</em>' attribute is set.
	 * @see #unsetDernierePrevisionDemande()
	 * @see #isDernierePrevisionDemande()
	 * @see #setDernierePrevisionDemande(boolean)
	 * @generated
	 */
	boolean isSetDernierePrevisionDemande();

	/**
	 * Returns the value of the '<em><b>Derniere Prevision Ordre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derniere Prevision Ordre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derniere Prevision Ordre</em>' attribute.
	 * @see #isSetDernierePrevisionOrdre()
	 * @see #unsetDernierePrevisionOrdre()
	 * @see #setDernierePrevisionOrdre(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeLivraison_DernierePrevisionOrdre()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='DernierePrevisionOrdre'"
	 * @generated
	 */
	boolean isDernierePrevisionOrdre();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLivraison#isDernierePrevisionOrdre <em>Derniere Prevision Ordre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derniere Prevision Ordre</em>' attribute.
	 * @see #isSetDernierePrevisionOrdre()
	 * @see #unsetDernierePrevisionOrdre()
	 * @see #isDernierePrevisionOrdre()
	 * @generated
	 */
	void setDernierePrevisionOrdre(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeLivraison#isDernierePrevisionOrdre <em>Derniere Prevision Ordre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDernierePrevisionOrdre()
	 * @see #isDernierePrevisionOrdre()
	 * @see #setDernierePrevisionOrdre(boolean)
	 * @generated
	 */
	void unsetDernierePrevisionOrdre();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeLivraison#isDernierePrevisionOrdre <em>Derniere Prevision Ordre</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Derniere Prevision Ordre</em>' attribute is set.
	 * @see #unsetDernierePrevisionOrdre()
	 * @see #isDernierePrevisionOrdre()
	 * @see #setDernierePrevisionOrdre(boolean)
	 * @generated
	 */
	boolean isSetDernierePrevisionOrdre();

	/**
	 * Returns the value of the '<em><b>Est Decrit Par Ligne Livraison</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Decrit Par Ligne Livraison</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Decrit Par Ligne Livraison</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeLivraison_EstDecritParLigneLivraison()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='Decrit_Livraison' target_entity='type_LigneLivraison'"
	 *        extendedMetaData="kind='element' name='EstDecritPar_LigneLivraison'"
	 * @generated
	 */
	EList<TypeAssociation> getEstDecritParLigneLivraison();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Unite Livraison</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Unite Livraison</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Unite Livraison</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeLivraison_EstObjetAssociationUniteLivraison()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_Livraison' target_entity='type_AssociationUniteLivraison'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationUniteLivraison'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationUniteLivraison();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Livraison Livaison</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Livraison Livaison</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Livraison Livaison</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeLivraison_EstObjetAssociationLivraisonLivaison()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeObjet_Livraison' target_entity='type_AssociationLivraisonLivaison'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationLivraisonLivaison'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationLivraisonLivaison();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Livraison Livaison</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Livraison Livaison</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Livraison Livaison</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeLivraison_EstSujetAssociationLivraisonLivaison()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeSujet_Livraison' target_entity='type_AssociationLivraisonLivaison'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationLivraisonLivaison'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationLivraisonLivaison();

	/**
	 * Returns the value of the '<em><b>APour Convoi Faisant Mouvement Convoi</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Convoi Faisant Mouvement Convoi</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Convoi Faisant Mouvement Convoi</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeLivraison_APourConvoiFaisantMouvementConvoi()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Convoi'"
	 *        extendedMetaData="kind='element' name='APourConvoiFaisantMouvement_Convoi'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourConvoiFaisantMouvementConvoi();

} // TypeLivraison
