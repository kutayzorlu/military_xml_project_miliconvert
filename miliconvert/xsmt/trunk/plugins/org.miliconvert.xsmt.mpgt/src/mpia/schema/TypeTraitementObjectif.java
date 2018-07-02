/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeDuree;
import mpia.meta.TypeDataTypeLongueur;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Traitement Objectif</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeTraitementObjectif#getNumeroOrdre <em>Numero Ordre</em>}</li>
 *   <li>{@link mpia.schema.TypeTraitementObjectif#getEffetARealiser <em>Effet ARealiser</em>}</li>
 *   <li>{@link mpia.schema.TypeTraitementObjectif#getDuree <em>Duree</em>}</li>
 *   <li>{@link mpia.schema.TypeTraitementObjectif#getDebut <em>Debut</em>}</li>
 *   <li>{@link mpia.schema.TypeTraitementObjectif#getFin <em>Fin</em>}</li>
 *   <li>{@link mpia.schema.TypeTraitementObjectif#getPrecisionDemandee <em>Precision Demandee</em>}</li>
 *   <li>{@link mpia.schema.TypeTraitementObjectif#getCapteurPreferentiel <em>Capteur Preferentiel</em>}</li>
 *   <li>{@link mpia.schema.TypeTraitementObjectif#getMesuresCoordination <em>Mesures Coordination</em>}</li>
 *   <li>{@link mpia.schema.TypeTraitementObjectif#getNombreMunitions <em>Nombre Munitions</em>}</li>
 *   <li>{@link mpia.schema.TypeTraitementObjectif#getMoyensAlloues <em>Moyens Alloues</em>}</li>
 *   <li>{@link mpia.schema.TypeTraitementObjectif#getEstSujetAssociationTraitementObjPlanTraitementObj <em>Est Sujet Association Traitement Obj Plan Traitement Obj</em>}</li>
 *   <li>{@link mpia.schema.TypeTraitementObjectif#getEstObjetAssociationPlanTraitementObjTraitementObj <em>Est Objet Association Plan Traitement Obj Traitement Obj</em>}</li>
 *   <li>{@link mpia.schema.TypeTraitementObjectif#getEstObjetAssociationMissionRensObjTraitementObj <em>Est Objet Association Mission Rens Obj Traitement Obj</em>}</li>
 *   <li>{@link mpia.schema.TypeTraitementObjectif#getAPourZIOassocieeAutreElementControle <em>APour ZI Oassociee Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeTraitementObjectif#getAPourComposanteAppuiAcquisitionComposanteAppui <em>APour Composante Appui Acquisition Composante Appui</em>}</li>
 *   <li>{@link mpia.schema.TypeTraitementObjectif#getAPourComposanteAppuiEvaluationComposanteAppui <em>APour Composante Appui Evaluation Composante Appui</em>}</li>
 *   <li>{@link mpia.schema.TypeTraitementObjectif#getAPourComposanteAppuiTraitementComposanteAppui <em>APour Composante Appui Traitement Composante Appui</em>}</li>
 *   <li>{@link mpia.schema.TypeTraitementObjectif#getAPourCompteRenduCRtraitementObjectif <em>APour Compte Rendu CRtraitement Objectif</em>}</li>
 *   <li>{@link mpia.schema.TypeTraitementObjectif#getAPourTypeUniteAlloueQuantiteTypeUnite <em>APour Type Unite Alloue Quantite Type Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeTraitementObjectif#getAPourMunitionsAlloueesVolumeMunitionsASS <em>APour Munitions Allouees Volume Munitions ASS</em>}</li>
 *   <li>{@link mpia.schema.TypeTraitementObjectif#getAPourInterventionGeneraleInterventionGenerale <em>APour Intervention Generale Intervention Generale</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeTraitementObjectif()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_TraitementObjectif' kind='elementOnly'"
 * @generated
 */
public interface TypeTraitementObjectif extends TypeActivite {
	/**
	 * Returns the value of the '<em><b>Numero Ordre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Ordre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Ordre</em>' attribute.
	 * @see #isSetNumeroOrdre()
	 * @see #unsetNumeroOrdre()
	 * @see #setNumeroOrdre(long)
	 * @see mpia.schema.SchemaPackage#getTypeTraitementObjectif_NumeroOrdre()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3" required="true"
	 *        extendedMetaData="kind='element' name='NumeroOrdre'"
	 * @generated
	 */
	long getNumeroOrdre();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTraitementObjectif#getNumeroOrdre <em>Numero Ordre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Ordre</em>' attribute.
	 * @see #isSetNumeroOrdre()
	 * @see #unsetNumeroOrdre()
	 * @see #getNumeroOrdre()
	 * @generated
	 */
	void setNumeroOrdre(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTraitementObjectif#getNumeroOrdre <em>Numero Ordre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumeroOrdre()
	 * @see #getNumeroOrdre()
	 * @see #setNumeroOrdre(long)
	 * @generated
	 */
	void unsetNumeroOrdre();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTraitementObjectif#getNumeroOrdre <em>Numero Ordre</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Numero Ordre</em>' attribute is set.
	 * @see #unsetNumeroOrdre()
	 * @see #getNumeroOrdre()
	 * @see #setNumeroOrdre(long)
	 * @generated
	 */
	boolean isSetNumeroOrdre();

	/**
	 * Returns the value of the '<em><b>Effet ARealiser</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEffetTactiqueRecherche}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effet ARealiser</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effet ARealiser</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEffetTactiqueRecherche
	 * @see #isSetEffetARealiser()
	 * @see #unsetEffetARealiser()
	 * @see #setEffetARealiser(TypeDictionaryDicoEffetTactiqueRecherche)
	 * @see mpia.schema.SchemaPackage#getTypeTraitementObjectif_EffetARealiser()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='EffetARealiser'"
	 * @generated
	 */
	TypeDictionaryDicoEffetTactiqueRecherche getEffetARealiser();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTraitementObjectif#getEffetARealiser <em>Effet ARealiser</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effet ARealiser</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEffetTactiqueRecherche
	 * @see #isSetEffetARealiser()
	 * @see #unsetEffetARealiser()
	 * @see #getEffetARealiser()
	 * @generated
	 */
	void setEffetARealiser(TypeDictionaryDicoEffetTactiqueRecherche value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTraitementObjectif#getEffetARealiser <em>Effet ARealiser</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEffetARealiser()
	 * @see #getEffetARealiser()
	 * @see #setEffetARealiser(TypeDictionaryDicoEffetTactiqueRecherche)
	 * @generated
	 */
	void unsetEffetARealiser();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTraitementObjectif#getEffetARealiser <em>Effet ARealiser</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Effet ARealiser</em>' attribute is set.
	 * @see #unsetEffetARealiser()
	 * @see #getEffetARealiser()
	 * @see #setEffetARealiser(TypeDictionaryDicoEffetTactiqueRecherche)
	 * @generated
	 */
	boolean isSetEffetARealiser();

	/**
	 * Returns the value of the '<em><b>Duree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duree</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duree</em>' containment reference.
	 * @see #setDuree(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypeTraitementObjectif_Duree()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Duree'"
	 * @generated
	 */
	TypeDataTypeDuree getDuree();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTraitementObjectif#getDuree <em>Duree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duree</em>' containment reference.
	 * @see #getDuree()
	 * @generated
	 */
	void setDuree(TypeDataTypeDuree value);

	/**
	 * Returns the value of the '<em><b>Debut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Debut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debut</em>' attribute.
	 * @see #setDebut(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeTraitementObjectif_Debut()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='Debut'"
	 * @generated
	 */
	XMLGregorianCalendar getDebut();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTraitementObjectif#getDebut <em>Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debut</em>' attribute.
	 * @see #getDebut()
	 * @generated
	 */
	void setDebut(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin</em>' attribute.
	 * @see #setFin(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeTraitementObjectif_Fin()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='Fin'"
	 * @generated
	 */
	XMLGregorianCalendar getFin();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTraitementObjectif#getFin <em>Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin</em>' attribute.
	 * @see #getFin()
	 * @generated
	 */
	void setFin(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Precision Demandee</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision Demandee</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision Demandee</em>' containment reference.
	 * @see #setPrecisionDemandee(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeTraitementObjectif_PrecisionDemandee()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PrecisionDemandee'"
	 * @generated
	 */
	TypeDataTypeLongueur getPrecisionDemandee();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTraitementObjectif#getPrecisionDemandee <em>Precision Demandee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision Demandee</em>' containment reference.
	 * @see #getPrecisionDemandee()
	 * @generated
	 */
	void setPrecisionDemandee(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Capteur Preferentiel</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoRapportTypeSource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capteur Preferentiel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capteur Preferentiel</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoRapportTypeSource
	 * @see #isSetCapteurPreferentiel()
	 * @see #unsetCapteurPreferentiel()
	 * @see #setCapteurPreferentiel(TypeDictionaryDicoRapportTypeSource)
	 * @see mpia.schema.SchemaPackage#getTypeTraitementObjectif_CapteurPreferentiel()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='CapteurPreferentiel'"
	 * @generated
	 */
	TypeDictionaryDicoRapportTypeSource getCapteurPreferentiel();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTraitementObjectif#getCapteurPreferentiel <em>Capteur Preferentiel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capteur Preferentiel</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoRapportTypeSource
	 * @see #isSetCapteurPreferentiel()
	 * @see #unsetCapteurPreferentiel()
	 * @see #getCapteurPreferentiel()
	 * @generated
	 */
	void setCapteurPreferentiel(TypeDictionaryDicoRapportTypeSource value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTraitementObjectif#getCapteurPreferentiel <em>Capteur Preferentiel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCapteurPreferentiel()
	 * @see #getCapteurPreferentiel()
	 * @see #setCapteurPreferentiel(TypeDictionaryDicoRapportTypeSource)
	 * @generated
	 */
	void unsetCapteurPreferentiel();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTraitementObjectif#getCapteurPreferentiel <em>Capteur Preferentiel</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Capteur Preferentiel</em>' attribute is set.
	 * @see #unsetCapteurPreferentiel()
	 * @see #getCapteurPreferentiel()
	 * @see #setCapteurPreferentiel(TypeDictionaryDicoRapportTypeSource)
	 * @generated
	 */
	boolean isSetCapteurPreferentiel();

	/**
	 * Returns the value of the '<em><b>Mesures Coordination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mesures Coordination</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mesures Coordination</em>' attribute.
	 * @see #setMesuresCoordination(String)
	 * @see mpia.schema.SchemaPackage#getTypeTraitementObjectif_MesuresCoordination()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='MesuresCoordination'"
	 * @generated
	 */
	String getMesuresCoordination();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTraitementObjectif#getMesuresCoordination <em>Mesures Coordination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mesures Coordination</em>' attribute.
	 * @see #getMesuresCoordination()
	 * @generated
	 */
	void setMesuresCoordination(String value);

	/**
	 * Returns the value of the '<em><b>Nombre Munitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Munitions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Munitions</em>' attribute.
	 * @see #isSetNombreMunitions()
	 * @see #unsetNombreMunitions()
	 * @see #setNombreMunitions(long)
	 * @see mpia.schema.SchemaPackage#getTypeTraitementObjectif_NombreMunitions()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NombreMunitions'"
	 * @generated
	 */
	long getNombreMunitions();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTraitementObjectif#getNombreMunitions <em>Nombre Munitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Munitions</em>' attribute.
	 * @see #isSetNombreMunitions()
	 * @see #unsetNombreMunitions()
	 * @see #getNombreMunitions()
	 * @generated
	 */
	void setNombreMunitions(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTraitementObjectif#getNombreMunitions <em>Nombre Munitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreMunitions()
	 * @see #getNombreMunitions()
	 * @see #setNombreMunitions(long)
	 * @generated
	 */
	void unsetNombreMunitions();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTraitementObjectif#getNombreMunitions <em>Nombre Munitions</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Munitions</em>' attribute is set.
	 * @see #unsetNombreMunitions()
	 * @see #getNombreMunitions()
	 * @see #setNombreMunitions(long)
	 * @generated
	 */
	boolean isSetNombreMunitions();

	/**
	 * Returns the value of the '<em><b>Moyens Alloues</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moyens Alloues</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moyens Alloues</em>' attribute.
	 * @see #setMoyensAlloues(String)
	 * @see mpia.schema.SchemaPackage#getTypeTraitementObjectif_MoyensAlloues()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='MoyensAlloues'"
	 * @generated
	 */
	String getMoyensAlloues();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTraitementObjectif#getMoyensAlloues <em>Moyens Alloues</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moyens Alloues</em>' attribute.
	 * @see #getMoyensAlloues()
	 * @generated
	 */
	void setMoyensAlloues(String value);

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Traitement Obj Plan Traitement Obj</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Traitement Obj Plan Traitement Obj</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Traitement Obj Plan Traitement Obj</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeTraitementObjectif_EstSujetAssociationTraitementObjPlanTraitementObj()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeSujet_TraitementObjectif' target_entity='type_AssociationTraitementObjPlanTraitementObj'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationTraitementObjPlanTraitementObj'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationTraitementObjPlanTraitementObj();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Plan Traitement Obj Traitement Obj</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Plan Traitement Obj Traitement Obj</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Plan Traitement Obj Traitement Obj</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeTraitementObjectif_EstObjetAssociationPlanTraitementObjTraitementObj()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeObjet_TraitementObjectif' target_entity='type_AssociationPlanTraitementObjTraitementObj'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationPlanTraitementObjTraitementObj'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationPlanTraitementObjTraitementObj();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Mission Rens Obj Traitement Obj</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Mission Rens Obj Traitement Obj</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Mission Rens Obj Traitement Obj</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeTraitementObjectif_EstObjetAssociationMissionRensObjTraitementObj()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeObjet_TraitementObjectif' target_entity='type_AssociationMissionRensObjTraitementObj'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationMissionRensObjTraitementObj'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationMissionRensObjTraitementObj();

	/**
	 * Returns the value of the '<em><b>APour ZI Oassociee Autre Element Controle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour ZI Oassociee Autre Element Controle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour ZI Oassociee Autre Element Controle</em>' containment reference.
	 * @see #setAPourZIOassocieeAutreElementControle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeTraitementObjectif_APourZIOassocieeAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='APourZIOassociee_AutreElementControle'"
	 * @generated
	 */
	TypeAssociation getAPourZIOassocieeAutreElementControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTraitementObjectif#getAPourZIOassocieeAutreElementControle <em>APour ZI Oassociee Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour ZI Oassociee Autre Element Controle</em>' containment reference.
	 * @see #getAPourZIOassocieeAutreElementControle()
	 * @generated
	 */
	void setAPourZIOassocieeAutreElementControle(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Composante Appui Acquisition Composante Appui</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeComposanteAppui}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Composante Appui Acquisition Composante Appui</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Composante Appui Acquisition Composante Appui</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeTraitementObjectif_APourComposanteAppuiAcquisitionComposanteAppui()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ComposanteAppui'"
	 *        extendedMetaData="kind='element' name='APourComposanteAppuiAcquisition_ComposanteAppui'"
	 * @generated
	 */
	EList<TypeComposanteAppui> getAPourComposanteAppuiAcquisitionComposanteAppui();

	/**
	 * Returns the value of the '<em><b>APour Composante Appui Evaluation Composante Appui</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Composante Appui Evaluation Composante Appui</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Composante Appui Evaluation Composante Appui</em>' containment reference.
	 * @see #setAPourComposanteAppuiEvaluationComposanteAppui(TypeComposanteAppui)
	 * @see mpia.schema.SchemaPackage#getTypeTraitementObjectif_APourComposanteAppuiEvaluationComposanteAppui()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ComposanteAppui'"
	 *        extendedMetaData="kind='element' name='APourComposanteAppuiEvaluation_ComposanteAppui'"
	 * @generated
	 */
	TypeComposanteAppui getAPourComposanteAppuiEvaluationComposanteAppui();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTraitementObjectif#getAPourComposanteAppuiEvaluationComposanteAppui <em>APour Composante Appui Evaluation Composante Appui</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Composante Appui Evaluation Composante Appui</em>' containment reference.
	 * @see #getAPourComposanteAppuiEvaluationComposanteAppui()
	 * @generated
	 */
	void setAPourComposanteAppuiEvaluationComposanteAppui(TypeComposanteAppui value);

	/**
	 * Returns the value of the '<em><b>APour Composante Appui Traitement Composante Appui</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Composante Appui Traitement Composante Appui</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Composante Appui Traitement Composante Appui</em>' containment reference.
	 * @see #setAPourComposanteAppuiTraitementComposanteAppui(TypeComposanteAppui)
	 * @see mpia.schema.SchemaPackage#getTypeTraitementObjectif_APourComposanteAppuiTraitementComposanteAppui()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ComposanteAppui'"
	 *        extendedMetaData="kind='element' name='APourComposanteAppuiTraitement_ComposanteAppui'"
	 * @generated
	 */
	TypeComposanteAppui getAPourComposanteAppuiTraitementComposanteAppui();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTraitementObjectif#getAPourComposanteAppuiTraitementComposanteAppui <em>APour Composante Appui Traitement Composante Appui</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Composante Appui Traitement Composante Appui</em>' containment reference.
	 * @see #getAPourComposanteAppuiTraitementComposanteAppui()
	 * @generated
	 */
	void setAPourComposanteAppuiTraitementComposanteAppui(TypeComposanteAppui value);

	/**
	 * Returns the value of the '<em><b>APour Compte Rendu CRtraitement Objectif</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeCRtraitementObjectif}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Compte Rendu CRtraitement Objectif</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Compte Rendu CRtraitement Objectif</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeTraitementObjectif_APourCompteRenduCRtraitementObjectif()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_CRtraitementObjectif'"
	 *        extendedMetaData="kind='element' name='APourCompteRendu_CRtraitementObjectif'"
	 * @generated
	 */
	EList<TypeCRtraitementObjectif> getAPourCompteRenduCRtraitementObjectif();

	/**
	 * Returns the value of the '<em><b>APour Type Unite Alloue Quantite Type Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeQuantiteTypeUnite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Type Unite Alloue Quantite Type Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Type Unite Alloue Quantite Type Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeTraitementObjectif_APourTypeUniteAlloueQuantiteTypeUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_QuantiteTypeUnite'"
	 *        extendedMetaData="kind='element' name='APourTypeUniteAlloue_QuantiteTypeUnite'"
	 * @generated
	 */
	EList<TypeQuantiteTypeUnite> getAPourTypeUniteAlloueQuantiteTypeUnite();

	/**
	 * Returns the value of the '<em><b>APour Munitions Allouees Volume Munitions ASS</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeVolumeMunitionsASS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Munitions Allouees Volume Munitions ASS</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Munitions Allouees Volume Munitions ASS</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeTraitementObjectif_APourMunitionsAlloueesVolumeMunitionsASS()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_VolumeMunitionsASS'"
	 *        extendedMetaData="kind='element' name='APourMunitionsAllouees_VolumeMunitionsASS'"
	 * @generated
	 */
	EList<TypeVolumeMunitionsASS> getAPourMunitionsAlloueesVolumeMunitionsASS();

	/**
	 * Returns the value of the '<em><b>APour Intervention Generale Intervention Generale</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Intervention Generale Intervention Generale</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Intervention Generale Intervention Generale</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeTraitementObjectif_APourInterventionGeneraleInterventionGenerale()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='ConcerneTraitementObjectif_TraitementObjectif' target_entity='type_InterventionGenerale'"
	 *        extendedMetaData="kind='element' name='APourInterventionGenerale_InterventionGenerale'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourInterventionGeneraleInterventionGenerale();

} // TypeTraitementObjectif
