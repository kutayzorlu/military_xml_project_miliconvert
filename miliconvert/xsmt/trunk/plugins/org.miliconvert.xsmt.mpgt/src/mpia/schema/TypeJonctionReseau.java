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
 * A representation of the model object '<em><b>Type Jonction Reseau</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeJonctionReseau#getGDHplanification <em>GD Hplanification</em>}</li>
 *   <li>{@link mpia.schema.TypeJonctionReseau#getCategorieDebit <em>Categorie Debit</em>}</li>
 *   <li>{@link mpia.schema.TypeJonctionReseau#getEtatOperationnel <em>Etat Operationnel</em>}</li>
 *   <li>{@link mpia.schema.TypeJonctionReseau#getEtatSaturation <em>Etat Saturation</em>}</li>
 *   <li>{@link mpia.schema.TypeJonctionReseau#getAPourLiaisonLiaisonReseau <em>APour Liaison Liaison Reseau</em>}</li>
 *   <li>{@link mpia.schema.TypeJonctionReseau#getAPourExtremiteMaitrePionReseau <em>APour Extremite Maitre Pion Reseau</em>}</li>
 *   <li>{@link mpia.schema.TypeJonctionReseau#getAPourExtremiteEsclavePionReseau <em>APour Extremite Esclave Pion Reseau</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeJonctionReseau()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_JonctionReseau' kind='elementOnly'"
 * @generated
 */
public interface TypeJonctionReseau extends TypeRacineOperationnelle {
	/**
	 * Returns the value of the '<em><b>GD Hplanification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GD Hplanification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GD Hplanification</em>' attribute.
	 * @see #setGDHplanification(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeJonctionReseau_GDHplanification()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='GDHplanification'"
	 * @generated
	 */
	XMLGregorianCalendar getGDHplanification();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeJonctionReseau#getGDHplanification <em>GD Hplanification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GD Hplanification</em>' attribute.
	 * @see #getGDHplanification()
	 * @generated
	 */
	void setGDHplanification(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Categorie Debit</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoLiaisonReseauCategorieDebit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie Debit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie Debit</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoLiaisonReseauCategorieDebit
	 * @see #isSetCategorieDebit()
	 * @see #unsetCategorieDebit()
	 * @see #setCategorieDebit(TypeDictionaryDicoLiaisonReseauCategorieDebit)
	 * @see mpia.schema.SchemaPackage#getTypeJonctionReseau_CategorieDebit()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='CategorieDebit'"
	 * @generated
	 */
	TypeDictionaryDicoLiaisonReseauCategorieDebit getCategorieDebit();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeJonctionReseau#getCategorieDebit <em>Categorie Debit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie Debit</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoLiaisonReseauCategorieDebit
	 * @see #isSetCategorieDebit()
	 * @see #unsetCategorieDebit()
	 * @see #getCategorieDebit()
	 * @generated
	 */
	void setCategorieDebit(TypeDictionaryDicoLiaisonReseauCategorieDebit value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeJonctionReseau#getCategorieDebit <em>Categorie Debit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorieDebit()
	 * @see #getCategorieDebit()
	 * @see #setCategorieDebit(TypeDictionaryDicoLiaisonReseauCategorieDebit)
	 * @generated
	 */
	void unsetCategorieDebit();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeJonctionReseau#getCategorieDebit <em>Categorie Debit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie Debit</em>' attribute is set.
	 * @see #unsetCategorieDebit()
	 * @see #getCategorieDebit()
	 * @see #setCategorieDebit(TypeDictionaryDicoLiaisonReseauCategorieDebit)
	 * @generated
	 */
	boolean isSetCategorieDebit();

	/**
	 * Returns the value of the '<em><b>Etat Operationnel</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoJonctionReseauEtatOperationnel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat Operationnel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat Operationnel</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoJonctionReseauEtatOperationnel
	 * @see #isSetEtatOperationnel()
	 * @see #unsetEtatOperationnel()
	 * @see #setEtatOperationnel(TypeDictionaryDicoJonctionReseauEtatOperationnel)
	 * @see mpia.schema.SchemaPackage#getTypeJonctionReseau_EtatOperationnel()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='EtatOperationnel'"
	 * @generated
	 */
	TypeDictionaryDicoJonctionReseauEtatOperationnel getEtatOperationnel();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeJonctionReseau#getEtatOperationnel <em>Etat Operationnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat Operationnel</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoJonctionReseauEtatOperationnel
	 * @see #isSetEtatOperationnel()
	 * @see #unsetEtatOperationnel()
	 * @see #getEtatOperationnel()
	 * @generated
	 */
	void setEtatOperationnel(TypeDictionaryDicoJonctionReseauEtatOperationnel value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeJonctionReseau#getEtatOperationnel <em>Etat Operationnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEtatOperationnel()
	 * @see #getEtatOperationnel()
	 * @see #setEtatOperationnel(TypeDictionaryDicoJonctionReseauEtatOperationnel)
	 * @generated
	 */
	void unsetEtatOperationnel();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeJonctionReseau#getEtatOperationnel <em>Etat Operationnel</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Etat Operationnel</em>' attribute is set.
	 * @see #unsetEtatOperationnel()
	 * @see #getEtatOperationnel()
	 * @see #setEtatOperationnel(TypeDictionaryDicoJonctionReseauEtatOperationnel)
	 * @generated
	 */
	boolean isSetEtatOperationnel();

	/**
	 * Returns the value of the '<em><b>Etat Saturation</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoJonctionReseauEtatSaturation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat Saturation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat Saturation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoJonctionReseauEtatSaturation
	 * @see #isSetEtatSaturation()
	 * @see #unsetEtatSaturation()
	 * @see #setEtatSaturation(TypeDictionaryDicoJonctionReseauEtatSaturation)
	 * @see mpia.schema.SchemaPackage#getTypeJonctionReseau_EtatSaturation()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='EtatSaturation'"
	 * @generated
	 */
	TypeDictionaryDicoJonctionReseauEtatSaturation getEtatSaturation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeJonctionReseau#getEtatSaturation <em>Etat Saturation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat Saturation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoJonctionReseauEtatSaturation
	 * @see #isSetEtatSaturation()
	 * @see #unsetEtatSaturation()
	 * @see #getEtatSaturation()
	 * @generated
	 */
	void setEtatSaturation(TypeDictionaryDicoJonctionReseauEtatSaturation value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeJonctionReseau#getEtatSaturation <em>Etat Saturation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEtatSaturation()
	 * @see #getEtatSaturation()
	 * @see #setEtatSaturation(TypeDictionaryDicoJonctionReseauEtatSaturation)
	 * @generated
	 */
	void unsetEtatSaturation();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeJonctionReseau#getEtatSaturation <em>Etat Saturation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Etat Saturation</em>' attribute is set.
	 * @see #unsetEtatSaturation()
	 * @see #getEtatSaturation()
	 * @see #setEtatSaturation(TypeDictionaryDicoJonctionReseauEtatSaturation)
	 * @generated
	 */
	boolean isSetEtatSaturation();

	/**
	 * Returns the value of the '<em><b>APour Liaison Liaison Reseau</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Liaison Liaison Reseau</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Liaison Liaison Reseau</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeJonctionReseau_APourLiaisonLiaisonReseau()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_LiaisonReseau'"
	 *        extendedMetaData="kind='element' name='APourLiaison_LiaisonReseau'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourLiaisonLiaisonReseau();

	/**
	 * Returns the value of the '<em><b>APour Extremite Maitre Pion Reseau</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Extremite Maitre Pion Reseau</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Extremite Maitre Pion Reseau</em>' containment reference.
	 * @see #setAPourExtremiteMaitrePionReseau(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeJonctionReseau_APourExtremiteMaitrePionReseau()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstMaitre_JonctionReseau' target_entity='type_PionReseau'"
	 *        extendedMetaData="kind='element' name='APourExtremiteMaitre_PionReseau'"
	 * @generated
	 */
	TypeAssociation getAPourExtremiteMaitrePionReseau();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeJonctionReseau#getAPourExtremiteMaitrePionReseau <em>APour Extremite Maitre Pion Reseau</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Extremite Maitre Pion Reseau</em>' containment reference.
	 * @see #getAPourExtremiteMaitrePionReseau()
	 * @generated
	 */
	void setAPourExtremiteMaitrePionReseau(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Extremite Esclave Pion Reseau</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Extremite Esclave Pion Reseau</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Extremite Esclave Pion Reseau</em>' containment reference.
	 * @see #setAPourExtremiteEsclavePionReseau(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeJonctionReseau_APourExtremiteEsclavePionReseau()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstEsclave_JonctionReseau' target_entity='type_PionReseau'"
	 *        extendedMetaData="kind='element' name='APourExtremiteEsclave_PionReseau'"
	 * @generated
	 */
	TypeAssociation getAPourExtremiteEsclavePionReseau();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeJonctionReseau#getAPourExtremiteEsclavePionReseau <em>APour Extremite Esclave Pion Reseau</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Extremite Esclave Pion Reseau</em>' containment reference.
	 * @see #getAPourExtremiteEsclavePionReseau()
	 * @generated
	 */
	void setAPourExtremiteEsclavePionReseau(TypeAssociation value);

} // TypeJonctionReseau
