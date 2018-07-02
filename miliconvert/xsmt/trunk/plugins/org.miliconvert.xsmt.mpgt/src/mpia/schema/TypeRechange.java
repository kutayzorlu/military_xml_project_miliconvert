/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociationEXT;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Rechange</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeRechange#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeRechange#getCodeNNOMaterielDestinataire <em>Code NNO Materiel Destinataire</em>}</li>
 *   <li>{@link mpia.schema.TypeRechange#getImmatriculationMaterielDestinataire <em>Immatriculation Materiel Destinataire</em>}</li>
 *   <li>{@link mpia.schema.TypeRechange#getIntituleMaterielDestinataire <em>Intitule Materiel Destinataire</em>}</li>
 *   <li>{@link mpia.schema.TypeRechange#getCodeApprovisionnementRattachement <em>Code Approvisionnement Rattachement</em>}</li>
 *   <li>{@link mpia.schema.TypeRechange#getCodeDemandeur <em>Code Demandeur</em>}</li>
 *   <li>{@link mpia.schema.TypeRechange#getCodeAtelierBeneficiaire <em>Code Atelier Beneficiaire</em>}</li>
 *   <li>{@link mpia.schema.TypeRechange#getAtelierBeneficiaire <em>Atelier Beneficiaire</em>}</li>
 *   <li>{@link mpia.schema.TypeRechange#getDemandeParUnite <em>Demande Par Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeRechange#getAPourUniteApprovisionnementUnite <em>APour Unite Approvisionnement Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeRechange#getApourLigneRechangeLigneRechange <em>Apour Ligne Rechange Ligne Rechange</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeRechange()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_Rechange' kind='elementOnly'"
 * @generated
 */
public interface TypeRechange extends TypeActivite {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoRechangeCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoRechangeCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoRechangeCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeRechange_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoRechangeCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRechange#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoRechangeCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoRechangeCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeRechange#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoRechangeCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeRechange#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoRechangeCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Code NNO Materiel Destinataire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code NNO Materiel Destinataire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code NNO Materiel Destinataire</em>' attribute.
	 * @see #setCodeNNOMaterielDestinataire(String)
	 * @see mpia.schema.SchemaPackage#getTypeRechange_CodeNNOMaterielDestinataire()
	 * @model dataType="mpia.meta.TypeDataTypeChaine015" required="true"
	 *        extendedMetaData="kind='element' name='CodeNNOMaterielDestinataire'"
	 * @generated
	 */
	String getCodeNNOMaterielDestinataire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRechange#getCodeNNOMaterielDestinataire <em>Code NNO Materiel Destinataire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code NNO Materiel Destinataire</em>' attribute.
	 * @see #getCodeNNOMaterielDestinataire()
	 * @generated
	 */
	void setCodeNNOMaterielDestinataire(String value);

	/**
	 * Returns the value of the '<em><b>Immatriculation Materiel Destinataire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Immatriculation Materiel Destinataire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Immatriculation Materiel Destinataire</em>' attribute.
	 * @see #setImmatriculationMaterielDestinataire(String)
	 * @see mpia.schema.SchemaPackage#getTypeRechange_ImmatriculationMaterielDestinataire()
	 * @model dataType="mpia.meta.TypeDataTypeChaine050"
	 *        extendedMetaData="kind='element' name='ImmatriculationMaterielDestinataire'"
	 * @generated
	 */
	String getImmatriculationMaterielDestinataire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRechange#getImmatriculationMaterielDestinataire <em>Immatriculation Materiel Destinataire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Immatriculation Materiel Destinataire</em>' attribute.
	 * @see #getImmatriculationMaterielDestinataire()
	 * @generated
	 */
	void setImmatriculationMaterielDestinataire(String value);

	/**
	 * Returns the value of the '<em><b>Intitule Materiel Destinataire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intitule Materiel Destinataire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intitule Materiel Destinataire</em>' attribute.
	 * @see #setIntituleMaterielDestinataire(String)
	 * @see mpia.schema.SchemaPackage#getTypeRechange_IntituleMaterielDestinataire()
	 * @model dataType="mpia.meta.TypeDataTypeChaine050" required="true"
	 *        extendedMetaData="kind='element' name='IntituleMaterielDestinataire'"
	 * @generated
	 */
	String getIntituleMaterielDestinataire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRechange#getIntituleMaterielDestinataire <em>Intitule Materiel Destinataire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intitule Materiel Destinataire</em>' attribute.
	 * @see #getIntituleMaterielDestinataire()
	 * @generated
	 */
	void setIntituleMaterielDestinataire(String value);

	/**
	 * Returns the value of the '<em><b>Code Approvisionnement Rattachement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Approvisionnement Rattachement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Approvisionnement Rattachement</em>' attribute.
	 * @see #setCodeApprovisionnementRattachement(String)
	 * @see mpia.schema.SchemaPackage#getTypeRechange_CodeApprovisionnementRattachement()
	 * @model dataType="mpia.meta.TypeDataTypeChaine012"
	 *        extendedMetaData="kind='element' name='CodeApprovisionnementRattachement'"
	 * @generated
	 */
	String getCodeApprovisionnementRattachement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRechange#getCodeApprovisionnementRattachement <em>Code Approvisionnement Rattachement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Approvisionnement Rattachement</em>' attribute.
	 * @see #getCodeApprovisionnementRattachement()
	 * @generated
	 */
	void setCodeApprovisionnementRattachement(String value);

	/**
	 * Returns the value of the '<em><b>Code Demandeur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Demandeur</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Demandeur</em>' attribute.
	 * @see #setCodeDemandeur(String)
	 * @see mpia.schema.SchemaPackage#getTypeRechange_CodeDemandeur()
	 * @model dataType="mpia.meta.TypeDataTypeChaine012"
	 *        extendedMetaData="kind='element' name='CodeDemandeur'"
	 * @generated
	 */
	String getCodeDemandeur();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRechange#getCodeDemandeur <em>Code Demandeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Demandeur</em>' attribute.
	 * @see #getCodeDemandeur()
	 * @generated
	 */
	void setCodeDemandeur(String value);

	/**
	 * Returns the value of the '<em><b>Code Atelier Beneficiaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Atelier Beneficiaire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Atelier Beneficiaire</em>' attribute.
	 * @see #setCodeAtelierBeneficiaire(String)
	 * @see mpia.schema.SchemaPackage#getTypeRechange_CodeAtelierBeneficiaire()
	 * @model dataType="mpia.meta.TypeDataTypeChaine012"
	 *        extendedMetaData="kind='element' name='CodeAtelierBeneficiaire'"
	 * @generated
	 */
	String getCodeAtelierBeneficiaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRechange#getCodeAtelierBeneficiaire <em>Code Atelier Beneficiaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Atelier Beneficiaire</em>' attribute.
	 * @see #getCodeAtelierBeneficiaire()
	 * @generated
	 */
	void setCodeAtelierBeneficiaire(String value);

	/**
	 * Returns the value of the '<em><b>Atelier Beneficiaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atelier Beneficiaire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atelier Beneficiaire</em>' attribute.
	 * @see #setAtelierBeneficiaire(String)
	 * @see mpia.schema.SchemaPackage#getTypeRechange_AtelierBeneficiaire()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='AtelierBeneficiaire'"
	 * @generated
	 */
	String getAtelierBeneficiaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRechange#getAtelierBeneficiaire <em>Atelier Beneficiaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atelier Beneficiaire</em>' attribute.
	 * @see #getAtelierBeneficiaire()
	 * @generated
	 */
	void setAtelierBeneficiaire(String value);

	/**
	 * Returns the value of the '<em><b>Demande Par Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Demande Par Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Demande Par Unite</em>' containment reference.
	 * @see #setDemandeParUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeRechange_DemandeParUnite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='DemandePar_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getDemandeParUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRechange#getDemandeParUnite <em>Demande Par Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Demande Par Unite</em>' containment reference.
	 * @see #getDemandeParUnite()
	 * @generated
	 */
	void setDemandeParUnite(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>APour Unite Approvisionnement Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Unite Approvisionnement Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Unite Approvisionnement Unite</em>' containment reference.
	 * @see #setAPourUniteApprovisionnementUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeRechange_APourUniteApprovisionnementUnite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourUniteApprovisionnement_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getAPourUniteApprovisionnementUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRechange#getAPourUniteApprovisionnementUnite <em>APour Unite Approvisionnement Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Unite Approvisionnement Unite</em>' containment reference.
	 * @see #getAPourUniteApprovisionnementUnite()
	 * @generated
	 */
	void setAPourUniteApprovisionnementUnite(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>Apour Ligne Rechange Ligne Rechange</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeLigneRechange}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Apour Ligne Rechange Ligne Rechange</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apour Ligne Rechange Ligne Rechange</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeRechange_ApourLigneRechangeLigneRechange()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_LigneRechange'"
	 *        extendedMetaData="kind='element' name='ApourLigneRechange_LigneRechange'"
	 * @generated
	 */
	EList<TypeLigneRechange> getApourLigneRechangeLigneRechange();

} // TypeRechange
