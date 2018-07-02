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
 * A representation of the model object '<em><b>Type Fait Renseignement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeFaitRenseignement#getDomaine <em>Domaine</em>}</li>
 *   <li>{@link mpia.schema.TypeFaitRenseignement#getDescriptionOuElementRecherche <em>Description Ou Element Recherche</em>}</li>
 *   <li>{@link mpia.schema.TypeFaitRenseignement#getNumeroVersion <em>Numero Version</em>}</li>
 *   <li>{@link mpia.schema.TypeFaitRenseignement#isRDII <em>RDII</em>}</li>
 *   <li>{@link mpia.schema.TypeFaitRenseignement#getIndices <em>Indices</em>}</li>
 *   <li>{@link mpia.schema.TypeFaitRenseignement#getACommeNatureInformationsARechercherNatureInformations <em>AComme Nature Informations ARechercher Nature Informations</em>}</li>
 *   <li>{@link mpia.schema.TypeFaitRenseignement#getACommeAutoriteInteresseeUnite <em>AComme Autorite Interessee Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeFaitRenseignement#getCorrespondAuBesoinEnRenseignementsBesoinsEnRenseignements <em>Correspond Au Besoin En Renseignements Besoins En Renseignements</em>}</li>
 *   <li>{@link mpia.schema.TypeFaitRenseignement#getCorrespondAMissionMission <em>Correspond AMission Mission</em>}</li>
 *   <li>{@link mpia.schema.TypeFaitRenseignement#getACommeObservationObservation <em>AComme Observation Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeFaitRenseignement()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_FaitRenseignement' kind='elementOnly'"
 * @generated
 */
public interface TypeFaitRenseignement extends TypeRacineOperationnelle {
	/**
	 * Returns the value of the '<em><b>Domaine</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoFaitRenseignementDomaine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domaine</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domaine</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoFaitRenseignementDomaine
	 * @see #isSetDomaine()
	 * @see #unsetDomaine()
	 * @see #setDomaine(TypeDictionaryDicoFaitRenseignementDomaine)
	 * @see mpia.schema.SchemaPackage#getTypeFaitRenseignement_Domaine()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Domaine'"
	 * @generated
	 */
	TypeDictionaryDicoFaitRenseignementDomaine getDomaine();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeFaitRenseignement#getDomaine <em>Domaine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domaine</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoFaitRenseignementDomaine
	 * @see #isSetDomaine()
	 * @see #unsetDomaine()
	 * @see #getDomaine()
	 * @generated
	 */
	void setDomaine(TypeDictionaryDicoFaitRenseignementDomaine value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeFaitRenseignement#getDomaine <em>Domaine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDomaine()
	 * @see #getDomaine()
	 * @see #setDomaine(TypeDictionaryDicoFaitRenseignementDomaine)
	 * @generated
	 */
	void unsetDomaine();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeFaitRenseignement#getDomaine <em>Domaine</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Domaine</em>' attribute is set.
	 * @see #unsetDomaine()
	 * @see #getDomaine()
	 * @see #setDomaine(TypeDictionaryDicoFaitRenseignementDomaine)
	 * @generated
	 */
	boolean isSetDomaine();

	/**
	 * Returns the value of the '<em><b>Description Ou Element Recherche</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description Ou Element Recherche</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description Ou Element Recherche</em>' attribute.
	 * @see #setDescriptionOuElementRecherche(String)
	 * @see mpia.schema.SchemaPackage#getTypeFaitRenseignement_DescriptionOuElementRecherche()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255" required="true"
	 *        extendedMetaData="kind='element' name='DescriptionOuElementRecherche'"
	 * @generated
	 */
	String getDescriptionOuElementRecherche();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeFaitRenseignement#getDescriptionOuElementRecherche <em>Description Ou Element Recherche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Ou Element Recherche</em>' attribute.
	 * @see #getDescriptionOuElementRecherche()
	 * @generated
	 */
	void setDescriptionOuElementRecherche(String value);

	/**
	 * Returns the value of the '<em><b>Numero Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Version</em>' attribute.
	 * @see #setNumeroVersion(String)
	 * @see mpia.schema.SchemaPackage#getTypeFaitRenseignement_NumeroVersion()
	 * @model dataType="mpia.meta.TypeDataTypeChaine06"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='NumeroVersion'"
	 * @generated
	 */
	String getNumeroVersion();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeFaitRenseignement#getNumeroVersion <em>Numero Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Version</em>' attribute.
	 * @see #getNumeroVersion()
	 * @generated
	 */
	void setNumeroVersion(String value);

	/**
	 * Returns the value of the '<em><b>RDII</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RDII</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RDII</em>' attribute.
	 * @see #isSetRDII()
	 * @see #unsetRDII()
	 * @see #setRDII(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeFaitRenseignement_RDII()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='RDII'"
	 * @generated
	 */
	boolean isRDII();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeFaitRenseignement#isRDII <em>RDII</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RDII</em>' attribute.
	 * @see #isSetRDII()
	 * @see #unsetRDII()
	 * @see #isRDII()
	 * @generated
	 */
	void setRDII(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeFaitRenseignement#isRDII <em>RDII</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRDII()
	 * @see #isRDII()
	 * @see #setRDII(boolean)
	 * @generated
	 */
	void unsetRDII();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeFaitRenseignement#isRDII <em>RDII</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>RDII</em>' attribute is set.
	 * @see #unsetRDII()
	 * @see #isRDII()
	 * @see #setRDII(boolean)
	 * @generated
	 */
	boolean isSetRDII();

	/**
	 * Returns the value of the '<em><b>Indices</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indices</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indices</em>' attribute.
	 * @see #setIndices(String)
	 * @see mpia.schema.SchemaPackage#getTypeFaitRenseignement_Indices()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='Indices'"
	 * @generated
	 */
	String getIndices();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeFaitRenseignement#getIndices <em>Indices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indices</em>' attribute.
	 * @see #getIndices()
	 * @generated
	 */
	void setIndices(String value);

	/**
	 * Returns the value of the '<em><b>AComme Nature Informations ARechercher Nature Informations</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeNatureInformations}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Nature Informations ARechercher Nature Informations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Nature Informations ARechercher Nature Informations</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeFaitRenseignement_ACommeNatureInformationsARechercherNatureInformations()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_NatureInformations'"
	 *        extendedMetaData="kind='element' name='ACommeNatureInformationsARechercher_NatureInformations'"
	 * @generated
	 */
	EList<TypeNatureInformations> getACommeNatureInformationsARechercherNatureInformations();

	/**
	 * Returns the value of the '<em><b>AComme Autorite Interessee Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociationEXT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Autorite Interessee Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Autorite Interessee Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeFaitRenseignement_ACommeAutoriteInteresseeUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstInteresseePar_FaitRenseignement' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='ACommeAutoriteInteressee_Unite'"
	 * @generated
	 */
	EList<TypeAssociationEXT> getACommeAutoriteInteresseeUnite();

	/**
	 * Returns the value of the '<em><b>Correspond Au Besoin En Renseignements Besoins En Renseignements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correspond Au Besoin En Renseignements Besoins En Renseignements</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correspond Au Besoin En Renseignements Besoins En Renseignements</em>' containment reference.
	 * @see #setCorrespondAuBesoinEnRenseignementsBesoinsEnRenseignements(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeFaitRenseignement_CorrespondAuBesoinEnRenseignementsBesoinsEnRenseignements()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='ACommeRenseignementsARechercher_FaitRenseignement' target_entity='type_BesoinsEnRenseignements'"
	 *        extendedMetaData="kind='element' name='CorrespondAuBesoinEnRenseignements_BesoinsEnRenseignements'"
	 * @generated
	 */
	TypeAssociation getCorrespondAuBesoinEnRenseignementsBesoinsEnRenseignements();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeFaitRenseignement#getCorrespondAuBesoinEnRenseignementsBesoinsEnRenseignements <em>Correspond Au Besoin En Renseignements Besoins En Renseignements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correspond Au Besoin En Renseignements Besoins En Renseignements</em>' containment reference.
	 * @see #getCorrespondAuBesoinEnRenseignementsBesoinsEnRenseignements()
	 * @generated
	 */
	void setCorrespondAuBesoinEnRenseignementsBesoinsEnRenseignements(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Correspond AMission Mission</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correspond AMission Mission</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correspond AMission Mission</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeFaitRenseignement_CorrespondAMissionMission()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='ACommeFaitRecherche_FaitRenseignement' target_entity='type_Mission'"
	 *        extendedMetaData="kind='element' name='CorrespondAMission_Mission'"
	 * @generated
	 */
	EList<TypeAssociation> getCorrespondAMissionMission();

	/**
	 * Returns the value of the '<em><b>AComme Observation Observation</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Observation Observation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Observation Observation</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeFaitRenseignement_ACommeObservationObservation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='FaitReferenceAuFait_FaitRenseignement' target_entity='type_Observation'"
	 *        extendedMetaData="kind='element' name='ACommeObservation_Observation'"
	 * @generated
	 */
	EList<TypeAssociation> getACommeObservationObservation();

} // TypeFaitRenseignement
