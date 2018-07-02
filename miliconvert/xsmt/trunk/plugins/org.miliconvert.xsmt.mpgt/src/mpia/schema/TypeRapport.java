/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;
import mpia.meta.TypeDataTypeDateHeure;
import mpia.meta.TypeDataTypeDuree;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Rapport</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeRapport#getExactitude <em>Exactitude</em>}</li>
 *   <li>{@link mpia.schema.TypeRapport#getConfirmation <em>Confirmation</em>}</li>
 *   <li>{@link mpia.schema.TypeRapport#isComptage <em>Comptage</em>}</li>
 *   <li>{@link mpia.schema.TypeRapport#getConfiance <em>Confiance</em>}</li>
 *   <li>{@link mpia.schema.TypeRapport#getGDHrapport <em>GD Hrapport</em>}</li>
 *   <li>{@link mpia.schema.TypeRapport#getDateDebut <em>Date Debut</em>}</li>
 *   <li>{@link mpia.schema.TypeRapport#getDateFin <em>Date Fin</em>}</li>
 *   <li>{@link mpia.schema.TypeRapport#getDureeValidite <em>Duree Validite</em>}</li>
 *   <li>{@link mpia.schema.TypeRapport#getEcartRelatifAAction <em>Ecart Relatif AAction</em>}</li>
 *   <li>{@link mpia.schema.TypeRapport#getTypeSource <em>Type Source</em>}</li>
 *   <li>{@link mpia.schema.TypeRapport#getNomSource <em>Nom Source</em>}</li>
 *   <li>{@link mpia.schema.TypeRapport#getFiabiliteSource <em>Fiabilite Source</em>}</li>
 *   <li>{@link mpia.schema.TypeRapport#getDonneeReelleDurantExercice <em>Donnee Reelle Durant Exercice</em>}</li>
 *   <li>{@link mpia.schema.TypeRapport#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeRapport#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeRapport#getEstRedigeParEntiteOrganisationnelle <em>Est Redige Par Entite Organisationnelle</em>}</li>
 *   <li>{@link mpia.schema.TypeRapport#getAPourReferenceActivite <em>APour Reference Activite</em>}</li>
 *   <li>{@link mpia.schema.TypeRapport#getEstPlaceDansAssociationContexteRapport <em>Est Place Dans Association Contexte Rapport</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeRapport()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_Rapport' kind='elementOnly'"
 * @generated
 */
public interface TypeRapport extends EObject {
	/**
	 * Returns the value of the '<em><b>Exactitude</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoRapportExactitude}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exactitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exactitude</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoRapportExactitude
	 * @see #isSetExactitude()
	 * @see #unsetExactitude()
	 * @see #setExactitude(TypeDictionaryDicoRapportExactitude)
	 * @see mpia.schema.SchemaPackage#getTypeRapport_Exactitude()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Exactitude'"
	 * @generated
	 */
	TypeDictionaryDicoRapportExactitude getExactitude();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRapport#getExactitude <em>Exactitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exactitude</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoRapportExactitude
	 * @see #isSetExactitude()
	 * @see #unsetExactitude()
	 * @see #getExactitude()
	 * @generated
	 */
	void setExactitude(TypeDictionaryDicoRapportExactitude value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeRapport#getExactitude <em>Exactitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExactitude()
	 * @see #getExactitude()
	 * @see #setExactitude(TypeDictionaryDicoRapportExactitude)
	 * @generated
	 */
	void unsetExactitude();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeRapport#getExactitude <em>Exactitude</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Exactitude</em>' attribute is set.
	 * @see #unsetExactitude()
	 * @see #getExactitude()
	 * @see #setExactitude(TypeDictionaryDicoRapportExactitude)
	 * @generated
	 */
	boolean isSetExactitude();

	/**
	 * Returns the value of the '<em><b>Confirmation</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoRapportConfirmation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Confirmation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confirmation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoRapportConfirmation
	 * @see #isSetConfirmation()
	 * @see #unsetConfirmation()
	 * @see #setConfirmation(TypeDictionaryDicoRapportConfirmation)
	 * @see mpia.schema.SchemaPackage#getTypeRapport_Confirmation()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Confirmation'"
	 * @generated
	 */
	TypeDictionaryDicoRapportConfirmation getConfirmation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRapport#getConfirmation <em>Confirmation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confirmation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoRapportConfirmation
	 * @see #isSetConfirmation()
	 * @see #unsetConfirmation()
	 * @see #getConfirmation()
	 * @generated
	 */
	void setConfirmation(TypeDictionaryDicoRapportConfirmation value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeRapport#getConfirmation <em>Confirmation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConfirmation()
	 * @see #getConfirmation()
	 * @see #setConfirmation(TypeDictionaryDicoRapportConfirmation)
	 * @generated
	 */
	void unsetConfirmation();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeRapport#getConfirmation <em>Confirmation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Confirmation</em>' attribute is set.
	 * @see #unsetConfirmation()
	 * @see #getConfirmation()
	 * @see #setConfirmation(TypeDictionaryDicoRapportConfirmation)
	 * @generated
	 */
	boolean isSetConfirmation();

	/**
	 * Returns the value of the '<em><b>Comptage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comptage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comptage</em>' attribute.
	 * @see #isSetComptage()
	 * @see #unsetComptage()
	 * @see #setComptage(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeRapport_Comptage()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='Comptage'"
	 * @generated
	 */
	boolean isComptage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRapport#isComptage <em>Comptage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comptage</em>' attribute.
	 * @see #isSetComptage()
	 * @see #unsetComptage()
	 * @see #isComptage()
	 * @generated
	 */
	void setComptage(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeRapport#isComptage <em>Comptage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetComptage()
	 * @see #isComptage()
	 * @see #setComptage(boolean)
	 * @generated
	 */
	void unsetComptage();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeRapport#isComptage <em>Comptage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Comptage</em>' attribute is set.
	 * @see #unsetComptage()
	 * @see #isComptage()
	 * @see #setComptage(boolean)
	 * @generated
	 */
	boolean isSetComptage();

	/**
	 * Returns the value of the '<em><b>Confiance</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoRapportConfiance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Confiance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confiance</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoRapportConfiance
	 * @see #isSetConfiance()
	 * @see #unsetConfiance()
	 * @see #setConfiance(TypeDictionaryDicoRapportConfiance)
	 * @see mpia.schema.SchemaPackage#getTypeRapport_Confiance()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Confiance'"
	 * @generated
	 */
	TypeDictionaryDicoRapportConfiance getConfiance();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRapport#getConfiance <em>Confiance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confiance</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoRapportConfiance
	 * @see #isSetConfiance()
	 * @see #unsetConfiance()
	 * @see #getConfiance()
	 * @generated
	 */
	void setConfiance(TypeDictionaryDicoRapportConfiance value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeRapport#getConfiance <em>Confiance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConfiance()
	 * @see #getConfiance()
	 * @see #setConfiance(TypeDictionaryDicoRapportConfiance)
	 * @generated
	 */
	void unsetConfiance();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeRapport#getConfiance <em>Confiance</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Confiance</em>' attribute is set.
	 * @see #unsetConfiance()
	 * @see #getConfiance()
	 * @see #setConfiance(TypeDictionaryDicoRapportConfiance)
	 * @generated
	 */
	boolean isSetConfiance();

	/**
	 * Returns the value of the '<em><b>GD Hrapport</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GD Hrapport</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GD Hrapport</em>' attribute.
	 * @see #setGDHrapport(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeRapport_GDHrapport()
	 * @model dataType="mpia.meta.TypeDataTypeGDH" required="true"
	 *        extendedMetaData="kind='element' name='GDHrapport'"
	 * @generated
	 */
	XMLGregorianCalendar getGDHrapport();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRapport#getGDHrapport <em>GD Hrapport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GD Hrapport</em>' attribute.
	 * @see #getGDHrapport()
	 * @generated
	 */
	void setGDHrapport(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Date Debut</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Debut</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Debut</em>' containment reference.
	 * @see #setDateDebut(TypeDataTypeDateHeure)
	 * @see mpia.schema.SchemaPackage#getTypeRapport_DateDebut()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DateDebut'"
	 * @generated
	 */
	TypeDataTypeDateHeure getDateDebut();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRapport#getDateDebut <em>Date Debut</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Debut</em>' containment reference.
	 * @see #getDateDebut()
	 * @generated
	 */
	void setDateDebut(TypeDataTypeDateHeure value);

	/**
	 * Returns the value of the '<em><b>Date Fin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Fin</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Fin</em>' containment reference.
	 * @see #setDateFin(TypeDataTypeDateHeure)
	 * @see mpia.schema.SchemaPackage#getTypeRapport_DateFin()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DateFin'"
	 * @generated
	 */
	TypeDataTypeDateHeure getDateFin();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRapport#getDateFin <em>Date Fin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Fin</em>' containment reference.
	 * @see #getDateFin()
	 * @generated
	 */
	void setDateFin(TypeDataTypeDateHeure value);

	/**
	 * Returns the value of the '<em><b>Duree Validite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duree Validite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duree Validite</em>' containment reference.
	 * @see #setDureeValidite(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypeRapport_DureeValidite()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DureeValidite'"
	 * @generated
	 */
	TypeDataTypeDuree getDureeValidite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRapport#getDureeValidite <em>Duree Validite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duree Validite</em>' containment reference.
	 * @see #getDureeValidite()
	 * @generated
	 */
	void setDureeValidite(TypeDataTypeDuree value);

	/**
	 * Returns the value of the '<em><b>Ecart Relatif AAction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ecart Relatif AAction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecart Relatif AAction</em>' containment reference.
	 * @see #setEcartRelatifAAction(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypeRapport_EcartRelatifAAction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EcartRelatifAAction'"
	 * @generated
	 */
	TypeDataTypeDuree getEcartRelatifAAction();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRapport#getEcartRelatifAAction <em>Ecart Relatif AAction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ecart Relatif AAction</em>' containment reference.
	 * @see #getEcartRelatifAAction()
	 * @generated
	 */
	void setEcartRelatifAAction(TypeDataTypeDuree value);

	/**
	 * Returns the value of the '<em><b>Type Source</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoRapportTypeSource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Source</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoRapportTypeSource
	 * @see #isSetTypeSource()
	 * @see #unsetTypeSource()
	 * @see #setTypeSource(TypeDictionaryDicoRapportTypeSource)
	 * @see mpia.schema.SchemaPackage#getTypeRapport_TypeSource()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeSource'"
	 * @generated
	 */
	TypeDictionaryDicoRapportTypeSource getTypeSource();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRapport#getTypeSource <em>Type Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Source</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoRapportTypeSource
	 * @see #isSetTypeSource()
	 * @see #unsetTypeSource()
	 * @see #getTypeSource()
	 * @generated
	 */
	void setTypeSource(TypeDictionaryDicoRapportTypeSource value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeRapport#getTypeSource <em>Type Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeSource()
	 * @see #getTypeSource()
	 * @see #setTypeSource(TypeDictionaryDicoRapportTypeSource)
	 * @generated
	 */
	void unsetTypeSource();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeRapport#getTypeSource <em>Type Source</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Source</em>' attribute is set.
	 * @see #unsetTypeSource()
	 * @see #getTypeSource()
	 * @see #setTypeSource(TypeDictionaryDicoRapportTypeSource)
	 * @generated
	 */
	boolean isSetTypeSource();

	/**
	 * Returns the value of the '<em><b>Nom Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Source</em>' attribute.
	 * @see #setNomSource(String)
	 * @see mpia.schema.SchemaPackage#getTypeRapport_NomSource()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='NomSource'"
	 * @generated
	 */
	String getNomSource();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRapport#getNomSource <em>Nom Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Source</em>' attribute.
	 * @see #getNomSource()
	 * @generated
	 */
	void setNomSource(String value);

	/**
	 * Returns the value of the '<em><b>Fiabilite Source</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoRapportFiabiliteSource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fiabilite Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fiabilite Source</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoRapportFiabiliteSource
	 * @see #isSetFiabiliteSource()
	 * @see #unsetFiabiliteSource()
	 * @see #setFiabiliteSource(TypeDictionaryDicoRapportFiabiliteSource)
	 * @see mpia.schema.SchemaPackage#getTypeRapport_FiabiliteSource()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='FiabiliteSource'"
	 * @generated
	 */
	TypeDictionaryDicoRapportFiabiliteSource getFiabiliteSource();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRapport#getFiabiliteSource <em>Fiabilite Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fiabilite Source</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoRapportFiabiliteSource
	 * @see #isSetFiabiliteSource()
	 * @see #unsetFiabiliteSource()
	 * @see #getFiabiliteSource()
	 * @generated
	 */
	void setFiabiliteSource(TypeDictionaryDicoRapportFiabiliteSource value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeRapport#getFiabiliteSource <em>Fiabilite Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFiabiliteSource()
	 * @see #getFiabiliteSource()
	 * @see #setFiabiliteSource(TypeDictionaryDicoRapportFiabiliteSource)
	 * @generated
	 */
	void unsetFiabiliteSource();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeRapport#getFiabiliteSource <em>Fiabilite Source</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fiabilite Source</em>' attribute is set.
	 * @see #unsetFiabiliteSource()
	 * @see #getFiabiliteSource()
	 * @see #setFiabiliteSource(TypeDictionaryDicoRapportFiabiliteSource)
	 * @generated
	 */
	boolean isSetFiabiliteSource();

	/**
	 * Returns the value of the '<em><b>Donnee Reelle Durant Exercice</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoRapportDonneeReelleDurantExercice}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Donnee Reelle Durant Exercice</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Donnee Reelle Durant Exercice</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoRapportDonneeReelleDurantExercice
	 * @see #isSetDonneeReelleDurantExercice()
	 * @see #unsetDonneeReelleDurantExercice()
	 * @see #setDonneeReelleDurantExercice(TypeDictionaryDicoRapportDonneeReelleDurantExercice)
	 * @see mpia.schema.SchemaPackage#getTypeRapport_DonneeReelleDurantExercice()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='DonneeReelleDurantExercice'"
	 * @generated
	 */
	TypeDictionaryDicoRapportDonneeReelleDurantExercice getDonneeReelleDurantExercice();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRapport#getDonneeReelleDurantExercice <em>Donnee Reelle Durant Exercice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Donnee Reelle Durant Exercice</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoRapportDonneeReelleDurantExercice
	 * @see #isSetDonneeReelleDurantExercice()
	 * @see #unsetDonneeReelleDurantExercice()
	 * @see #getDonneeReelleDurantExercice()
	 * @generated
	 */
	void setDonneeReelleDurantExercice(TypeDictionaryDicoRapportDonneeReelleDurantExercice value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeRapport#getDonneeReelleDurantExercice <em>Donnee Reelle Durant Exercice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDonneeReelleDurantExercice()
	 * @see #getDonneeReelleDurantExercice()
	 * @see #setDonneeReelleDurantExercice(TypeDictionaryDicoRapportDonneeReelleDurantExercice)
	 * @generated
	 */
	void unsetDonneeReelleDurantExercice();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeRapport#getDonneeReelleDurantExercice <em>Donnee Reelle Durant Exercice</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Donnee Reelle Durant Exercice</em>' attribute is set.
	 * @see #unsetDonneeReelleDurantExercice()
	 * @see #getDonneeReelleDurantExercice()
	 * @see #setDonneeReelleDurantExercice(TypeDictionaryDicoRapportDonneeReelleDurantExercice)
	 * @generated
	 */
	boolean isSetDonneeReelleDurantExercice();

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
	 * @see mpia.schema.SchemaPackage#getTypeRapport_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRapport#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeRapport_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRapport#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Est Redige Par Entite Organisationnelle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Redige Par Entite Organisationnelle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Redige Par Entite Organisationnelle</em>' containment reference.
	 * @see #setEstRedigeParEntiteOrganisationnelle(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeRapport_EstRedigeParEntiteOrganisationnelle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='Redige_Rapport' target_entity='type_EntiteOrganisationnelle'"
	 *        extendedMetaData="kind='element' name='EstRedigePar_EntiteOrganisationnelle'"
	 * @generated
	 */
	TypeAssociationEXT getEstRedigeParEntiteOrganisationnelle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRapport#getEstRedigeParEntiteOrganisationnelle <em>Est Redige Par Entite Organisationnelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Redige Par Entite Organisationnelle</em>' containment reference.
	 * @see #getEstRedigeParEntiteOrganisationnelle()
	 * @generated
	 */
	void setEstRedigeParEntiteOrganisationnelle(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>APour Reference Activite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Reference Activite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Reference Activite</em>' containment reference.
	 * @see #setAPourReferenceActivite(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeRapport_APourReferenceActivite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Activite'"
	 *        extendedMetaData="kind='element' name='APourReference_Activite'"
	 * @generated
	 */
	TypeAssociation getAPourReferenceActivite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRapport#getAPourReferenceActivite <em>APour Reference Activite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Reference Activite</em>' containment reference.
	 * @see #getAPourReferenceActivite()
	 * @generated
	 */
	void setAPourReferenceActivite(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Est Place Dans Association Contexte Rapport</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Place Dans Association Contexte Rapport</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Place Dans Association Contexte Rapport</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeRapport_EstPlaceDansAssociationContexteRapport()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeRapport_Rapport' target_entity='type_AssociationContexteRapport'"
	 *        extendedMetaData="kind='element' name='EstPlaceDans_AssociationContexteRapport'"
	 * @generated
	 */
	EList<TypeAssociation> getEstPlaceDansAssociationContexteRapport();

} // TypeRapport
