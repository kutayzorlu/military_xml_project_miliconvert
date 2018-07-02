/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Service Reseau</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeServiceReseau#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeServiceReseau#getSousCategorie <em>Sous Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeServiceReseau#getAutreSousCategorie <em>Autre Sous Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeServiceReseau#isCrypte <em>Crypte</em>}</li>
 *   <li>{@link mpia.schema.TypeServiceReseau#getCodeCryptage <em>Code Cryptage</em>}</li>
 *   <li>{@link mpia.schema.TypeServiceReseau#getPlanCryptage <em>Plan Cryptage</em>}</li>
 *   <li>{@link mpia.schema.TypeServiceReseau#getCodeIFF <em>Code IFF</em>}</li>
 *   <li>{@link mpia.schema.TypeServiceReseau#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeServiceReseau#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeServiceReseau#getAPourDegreClassificationDegreClassification <em>APour Degre Classification Degre Classification</em>}</li>
 *   <li>{@link mpia.schema.TypeServiceReseau#getEstAssocieAuReseauReseauTelecommunication <em>Est Associe Au Reseau Reseau Telecommunication</em>}</li>
 *   <li>{@link mpia.schema.TypeServiceReseau#getEstAccedeParAdresseElectronique <em>Est Accede Par Adresse Electronique</em>}</li>
 *   <li>{@link mpia.schema.TypeServiceReseau#getACommeEtatEtatServiceReseau <em>AComme Etat Etat Service Reseau</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeServiceReseau()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_ServiceReseau' kind='elementOnly'"
 * @generated
 */
public interface TypeServiceReseau extends EObject {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoServiceReseauCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoServiceReseauCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoServiceReseauCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeServiceReseau_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoServiceReseauCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeServiceReseau#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoServiceReseauCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoServiceReseauCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeServiceReseau#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoServiceReseauCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeServiceReseau#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoServiceReseauCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Sous Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoServiceReseauSousCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sous Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sous Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoServiceReseauSousCategorie
	 * @see #isSetSousCategorie()
	 * @see #unsetSousCategorie()
	 * @see #setSousCategorie(TypeDictionaryDicoServiceReseauSousCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeServiceReseau_SousCategorie()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='SousCategorie'"
	 * @generated
	 */
	TypeDictionaryDicoServiceReseauSousCategorie getSousCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeServiceReseau#getSousCategorie <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sous Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoServiceReseauSousCategorie
	 * @see #isSetSousCategorie()
	 * @see #unsetSousCategorie()
	 * @see #getSousCategorie()
	 * @generated
	 */
	void setSousCategorie(TypeDictionaryDicoServiceReseauSousCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeServiceReseau#getSousCategorie <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSousCategorie()
	 * @see #getSousCategorie()
	 * @see #setSousCategorie(TypeDictionaryDicoServiceReseauSousCategorie)
	 * @generated
	 */
	void unsetSousCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeServiceReseau#getSousCategorie <em>Sous Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sous Categorie</em>' attribute is set.
	 * @see #unsetSousCategorie()
	 * @see #getSousCategorie()
	 * @see #setSousCategorie(TypeDictionaryDicoServiceReseauSousCategorie)
	 * @generated
	 */
	boolean isSetSousCategorie();

	/**
	 * Returns the value of the '<em><b>Autre Sous Categorie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autre Sous Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autre Sous Categorie</em>' attribute.
	 * @see #setAutreSousCategorie(String)
	 * @see mpia.schema.SchemaPackage#getTypeServiceReseau_AutreSousCategorie()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='AutreSousCategorie'"
	 * @generated
	 */
	String getAutreSousCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeServiceReseau#getAutreSousCategorie <em>Autre Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autre Sous Categorie</em>' attribute.
	 * @see #getAutreSousCategorie()
	 * @generated
	 */
	void setAutreSousCategorie(String value);

	/**
	 * Returns the value of the '<em><b>Crypte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crypte</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crypte</em>' attribute.
	 * @see #isSetCrypte()
	 * @see #unsetCrypte()
	 * @see #setCrypte(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeServiceReseau_Crypte()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='Crypte'"
	 * @generated
	 */
	boolean isCrypte();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeServiceReseau#isCrypte <em>Crypte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crypte</em>' attribute.
	 * @see #isSetCrypte()
	 * @see #unsetCrypte()
	 * @see #isCrypte()
	 * @generated
	 */
	void setCrypte(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeServiceReseau#isCrypte <em>Crypte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCrypte()
	 * @see #isCrypte()
	 * @see #setCrypte(boolean)
	 * @generated
	 */
	void unsetCrypte();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeServiceReseau#isCrypte <em>Crypte</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Crypte</em>' attribute is set.
	 * @see #unsetCrypte()
	 * @see #isCrypte()
	 * @see #setCrypte(boolean)
	 * @generated
	 */
	boolean isSetCrypte();

	/**
	 * Returns the value of the '<em><b>Code Cryptage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Cryptage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Cryptage</em>' attribute.
	 * @see #setCodeCryptage(String)
	 * @see mpia.schema.SchemaPackage#getTypeServiceReseau_CodeCryptage()
	 * @model dataType="mpia.meta.TypeDataTypeChaine050"
	 *        extendedMetaData="kind='element' name='CodeCryptage'"
	 * @generated
	 */
	String getCodeCryptage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeServiceReseau#getCodeCryptage <em>Code Cryptage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Cryptage</em>' attribute.
	 * @see #getCodeCryptage()
	 * @generated
	 */
	void setCodeCryptage(String value);

	/**
	 * Returns the value of the '<em><b>Plan Cryptage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plan Cryptage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plan Cryptage</em>' attribute.
	 * @see #setPlanCryptage(String)
	 * @see mpia.schema.SchemaPackage#getTypeServiceReseau_PlanCryptage()
	 * @model dataType="mpia.meta.TypeDataTypeChaine050"
	 *        extendedMetaData="kind='element' name='PlanCryptage'"
	 * @generated
	 */
	String getPlanCryptage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeServiceReseau#getPlanCryptage <em>Plan Cryptage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plan Cryptage</em>' attribute.
	 * @see #getPlanCryptage()
	 * @generated
	 */
	void setPlanCryptage(String value);

	/**
	 * Returns the value of the '<em><b>Code IFF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code IFF</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code IFF</em>' attribute.
	 * @see #setCodeIFF(String)
	 * @see mpia.schema.SchemaPackage#getTypeServiceReseau_CodeIFF()
	 * @model dataType="mpia.meta.TypeDataTypeChaine06"
	 *        extendedMetaData="kind='element' name='CodeIFF'"
	 * @generated
	 */
	String getCodeIFF();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeServiceReseau#getCodeIFF <em>Code IFF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code IFF</em>' attribute.
	 * @see #getCodeIFF()
	 * @generated
	 */
	void setCodeIFF(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeServiceReseau_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeServiceReseau#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeServiceReseau_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeServiceReseau#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>APour Degre Classification Degre Classification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Degre Classification Degre Classification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Degre Classification Degre Classification</em>' containment reference.
	 * @see #setAPourDegreClassificationDegreClassification(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeServiceReseau_APourDegreClassificationDegreClassification()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_DegreClassification'"
	 *        extendedMetaData="kind='element' name='APourDegreClassification_DegreClassification'"
	 * @generated
	 */
	TypeAssociation getAPourDegreClassificationDegreClassification();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeServiceReseau#getAPourDegreClassificationDegreClassification <em>APour Degre Classification Degre Classification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Degre Classification Degre Classification</em>' containment reference.
	 * @see #getAPourDegreClassificationDegreClassification()
	 * @generated
	 */
	void setAPourDegreClassificationDegreClassification(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Est Associe Au Reseau Reseau Telecommunication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Associe Au Reseau Reseau Telecommunication</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Associe Au Reseau Reseau Telecommunication</em>' containment reference.
	 * @see #setEstAssocieAuReseauReseauTelecommunication(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeServiceReseau_EstAssocieAuReseauReseauTelecommunication()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourServiceReseau_ServiceReseau' target_entity='type_ReseauTelecommunication'"
	 *        extendedMetaData="kind='element' name='EstAssocieAuReseau_ReseauTelecommunication'"
	 * @generated
	 */
	TypeAssociation getEstAssocieAuReseauReseauTelecommunication();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeServiceReseau#getEstAssocieAuReseauReseauTelecommunication <em>Est Associe Au Reseau Reseau Telecommunication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Associe Au Reseau Reseau Telecommunication</em>' containment reference.
	 * @see #getEstAssocieAuReseauReseauTelecommunication()
	 * @generated
	 */
	void setEstAssocieAuReseauReseauTelecommunication(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Est Accede Par Adresse Electronique</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Accede Par Adresse Electronique</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Accede Par Adresse Electronique</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeServiceReseau_EstAccedeParAdresseElectronique()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='FournitAccesA_ServiceReseau' target_entity='type_AdresseElectronique'"
	 *        extendedMetaData="kind='element' name='EstAccedePar_AdresseElectronique'"
	 * @generated
	 */
	EList<TypeAssociation> getEstAccedeParAdresseElectronique();

	/**
	 * Returns the value of the '<em><b>AComme Etat Etat Service Reseau</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeEtatServiceReseau}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Etat Etat Service Reseau</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Etat Etat Service Reseau</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeServiceReseau_ACommeEtatEtatServiceReseau()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_EtatServiceReseau'"
	 *        extendedMetaData="kind='element' name='ACommeEtat_EtatServiceReseau'"
	 * @generated
	 */
	EList<TypeEtatServiceReseau> getACommeEtatEtatServiceReseau();

} // TypeServiceReseau
