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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Horaire Manoeuvre</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeHoraireManoeuvre#getNom <em>Nom</em>}</li>
 *   <li>{@link mpia.schema.TypeHoraireManoeuvre#getPhaseOuTemps <em>Phase Ou Temps</em>}</li>
 *   <li>{@link mpia.schema.TypeHoraireManoeuvre#getNiveau <em>Niveau</em>}</li>
 *   <li>{@link mpia.schema.TypeHoraireManoeuvre#getDateDebut <em>Date Debut</em>}</li>
 *   <li>{@link mpia.schema.TypeHoraireManoeuvre#getDateFin <em>Date Fin</em>}</li>
 *   <li>{@link mpia.schema.TypeHoraireManoeuvre#getDureeTemps <em>Duree Temps</em>}</li>
 *   <li>{@link mpia.schema.TypeHoraireManoeuvre#getDateDebutCalculee <em>Date Debut Calculee</em>}</li>
 *   <li>{@link mpia.schema.TypeHoraireManoeuvre#getDateFinCalculee <em>Date Fin Calculee</em>}</li>
 *   <li>{@link mpia.schema.TypeHoraireManoeuvre#getContraintesHoraires <em>Contraintes Horaires</em>}</li>
 *   <li>{@link mpia.schema.TypeHoraireManoeuvre#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.TypeHoraireManoeuvre#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeHoraireManoeuvre#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeHoraireManoeuvre#getEstObjetAssociationHoraireManoeuvre <em>Est Objet Association Horaire Manoeuvre</em>}</li>
 *   <li>{@link mpia.schema.TypeHoraireManoeuvre#getEstSujetAssociationHoraireManoeuvre <em>Est Sujet Association Horaire Manoeuvre</em>}</li>
 *   <li>{@link mpia.schema.TypeHoraireManoeuvre#getConcerneMissionsActivite <em>Concerne Missions Activite</em>}</li>
 *   <li>{@link mpia.schema.TypeHoraireManoeuvre#getAPourPrioritesTactiquesLogistiquesPrioriteTactiqueLogistique <em>APour Priorites Tactiques Logistiques Priorite Tactique Logistique</em>}</li>
 *   <li>{@link mpia.schema.TypeHoraireManoeuvre#getDecritRapportForceRapportForce <em>Decrit Rapport Force Rapport Force</em>}</li>
 *   <li>{@link mpia.schema.TypeHoraireManoeuvre#getACommeConsignesApplicablesConsigne <em>AComme Consignes Applicables Consigne</em>}</li>
 *   <li>{@link mpia.schema.TypeHoraireManoeuvre#getACommePointEntreeConsigne <em>AComme Point Entree Consigne</em>}</li>
 *   <li>{@link mpia.schema.TypeHoraireManoeuvre#getACommePointSortieConsigne <em>AComme Point Sortie Consigne</em>}</li>
 *   <li>{@link mpia.schema.TypeHoraireManoeuvre#getAPourDateDebutDatation <em>APour Date Debut Datation</em>}</li>
 *   <li>{@link mpia.schema.TypeHoraireManoeuvre#getAPourDateFinDatation <em>APour Date Fin Datation</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeHoraireManoeuvre()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_HoraireManoeuvre' kind='elementOnly'"
 * @generated
 */
public interface TypeHoraireManoeuvre extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see mpia.schema.SchemaPackage#getTypeHoraireManoeuvre_Nom()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='Nom'"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeHoraireManoeuvre#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Phase Ou Temps</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoHoraireManoeuvrePhaseOuTemps}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Ou Temps</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Ou Temps</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoHoraireManoeuvrePhaseOuTemps
	 * @see #isSetPhaseOuTemps()
	 * @see #unsetPhaseOuTemps()
	 * @see #setPhaseOuTemps(TypeDictionaryDicoHoraireManoeuvrePhaseOuTemps)
	 * @see mpia.schema.SchemaPackage#getTypeHoraireManoeuvre_PhaseOuTemps()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='PhaseOuTemps'"
	 * @generated
	 */
	TypeDictionaryDicoHoraireManoeuvrePhaseOuTemps getPhaseOuTemps();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeHoraireManoeuvre#getPhaseOuTemps <em>Phase Ou Temps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Ou Temps</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoHoraireManoeuvrePhaseOuTemps
	 * @see #isSetPhaseOuTemps()
	 * @see #unsetPhaseOuTemps()
	 * @see #getPhaseOuTemps()
	 * @generated
	 */
	void setPhaseOuTemps(TypeDictionaryDicoHoraireManoeuvrePhaseOuTemps value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeHoraireManoeuvre#getPhaseOuTemps <em>Phase Ou Temps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPhaseOuTemps()
	 * @see #getPhaseOuTemps()
	 * @see #setPhaseOuTemps(TypeDictionaryDicoHoraireManoeuvrePhaseOuTemps)
	 * @generated
	 */
	void unsetPhaseOuTemps();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeHoraireManoeuvre#getPhaseOuTemps <em>Phase Ou Temps</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Phase Ou Temps</em>' attribute is set.
	 * @see #unsetPhaseOuTemps()
	 * @see #getPhaseOuTemps()
	 * @see #setPhaseOuTemps(TypeDictionaryDicoHoraireManoeuvrePhaseOuTemps)
	 * @generated
	 */
	boolean isSetPhaseOuTemps();

	/**
	 * Returns the value of the '<em><b>Niveau</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoHoraireManoeuvreNiveau}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Niveau</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Niveau</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoHoraireManoeuvreNiveau
	 * @see #isSetNiveau()
	 * @see #unsetNiveau()
	 * @see #setNiveau(TypeDictionaryDicoHoraireManoeuvreNiveau)
	 * @see mpia.schema.SchemaPackage#getTypeHoraireManoeuvre_Niveau()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Niveau'"
	 * @generated
	 */
	TypeDictionaryDicoHoraireManoeuvreNiveau getNiveau();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeHoraireManoeuvre#getNiveau <em>Niveau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Niveau</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoHoraireManoeuvreNiveau
	 * @see #isSetNiveau()
	 * @see #unsetNiveau()
	 * @see #getNiveau()
	 * @generated
	 */
	void setNiveau(TypeDictionaryDicoHoraireManoeuvreNiveau value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeHoraireManoeuvre#getNiveau <em>Niveau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNiveau()
	 * @see #getNiveau()
	 * @see #setNiveau(TypeDictionaryDicoHoraireManoeuvreNiveau)
	 * @generated
	 */
	void unsetNiveau();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeHoraireManoeuvre#getNiveau <em>Niveau</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Niveau</em>' attribute is set.
	 * @see #unsetNiveau()
	 * @see #getNiveau()
	 * @see #setNiveau(TypeDictionaryDicoHoraireManoeuvreNiveau)
	 * @generated
	 */
	boolean isSetNiveau();

	/**
	 * Returns the value of the '<em><b>Date Debut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Debut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Debut</em>' attribute.
	 * @see #setDateDebut(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeHoraireManoeuvre_DateDebut()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateDebut'"
	 * @generated
	 */
	XMLGregorianCalendar getDateDebut();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeHoraireManoeuvre#getDateDebut <em>Date Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Debut</em>' attribute.
	 * @see #getDateDebut()
	 * @generated
	 */
	void setDateDebut(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Date Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Fin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Fin</em>' attribute.
	 * @see #setDateFin(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeHoraireManoeuvre_DateFin()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateFin'"
	 * @generated
	 */
	XMLGregorianCalendar getDateFin();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeHoraireManoeuvre#getDateFin <em>Date Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Fin</em>' attribute.
	 * @see #getDateFin()
	 * @generated
	 */
	void setDateFin(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Duree Temps</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duree Temps</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duree Temps</em>' containment reference.
	 * @see #setDureeTemps(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypeHoraireManoeuvre_DureeTemps()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DureeTemps'"
	 * @generated
	 */
	TypeDataTypeDuree getDureeTemps();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeHoraireManoeuvre#getDureeTemps <em>Duree Temps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duree Temps</em>' containment reference.
	 * @see #getDureeTemps()
	 * @generated
	 */
	void setDureeTemps(TypeDataTypeDuree value);

	/**
	 * Returns the value of the '<em><b>Date Debut Calculee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Debut Calculee</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Debut Calculee</em>' attribute.
	 * @see #setDateDebutCalculee(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeHoraireManoeuvre_DateDebutCalculee()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateDebutCalculee'"
	 * @generated
	 */
	XMLGregorianCalendar getDateDebutCalculee();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeHoraireManoeuvre#getDateDebutCalculee <em>Date Debut Calculee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Debut Calculee</em>' attribute.
	 * @see #getDateDebutCalculee()
	 * @generated
	 */
	void setDateDebutCalculee(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Date Fin Calculee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Fin Calculee</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Fin Calculee</em>' attribute.
	 * @see #setDateFinCalculee(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeHoraireManoeuvre_DateFinCalculee()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateFinCalculee'"
	 * @generated
	 */
	XMLGregorianCalendar getDateFinCalculee();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeHoraireManoeuvre#getDateFinCalculee <em>Date Fin Calculee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Fin Calculee</em>' attribute.
	 * @see #getDateFinCalculee()
	 * @generated
	 */
	void setDateFinCalculee(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Contraintes Horaires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contraintes Horaires</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contraintes Horaires</em>' attribute.
	 * @see #setContraintesHoraires(String)
	 * @see mpia.schema.SchemaPackage#getTypeHoraireManoeuvre_ContraintesHoraires()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='ContraintesHoraires'"
	 * @generated
	 */
	String getContraintesHoraires();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeHoraireManoeuvre#getContraintesHoraires <em>Contraintes Horaires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contraintes Horaires</em>' attribute.
	 * @see #getContraintesHoraires()
	 * @generated
	 */
	void setContraintesHoraires(String value);

	/**
	 * Returns the value of the '<em><b>Commentaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commentaire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commentaire</em>' attribute.
	 * @see #setCommentaire(String)
	 * @see mpia.schema.SchemaPackage#getTypeHoraireManoeuvre_Commentaire()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='Commentaire'"
	 * @generated
	 */
	String getCommentaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeHoraireManoeuvre#getCommentaire <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commentaire</em>' attribute.
	 * @see #getCommentaire()
	 * @generated
	 */
	void setCommentaire(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeHoraireManoeuvre_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeHoraireManoeuvre#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeHoraireManoeuvre_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeHoraireManoeuvre#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Est Objet Association Horaire Manoeuvre</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Horaire Manoeuvre</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Horaire Manoeuvre</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeHoraireManoeuvre_EstObjetAssociationHoraireManoeuvre()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeObjet_HoraireManoeuvre' target_entity='type_AssociationHoraireManoeuvre'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationHoraireManoeuvre'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationHoraireManoeuvre();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Horaire Manoeuvre</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Horaire Manoeuvre</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Horaire Manoeuvre</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeHoraireManoeuvre_EstSujetAssociationHoraireManoeuvre()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeSujet_HoraireManoeuvre' target_entity='type_AssociationHoraireManoeuvre'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationHoraireManoeuvre'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationHoraireManoeuvre();

	/**
	 * Returns the value of the '<em><b>Concerne Missions Activite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Missions Activite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Missions Activite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeHoraireManoeuvre_ConcerneMissionsActivite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='CorrespondA_HoraireManoeuvre' target_entity='type_Activite'"
	 *        extendedMetaData="kind='element' name='ConcerneMissions_Activite'"
	 * @generated
	 */
	EList<TypeAssociation> getConcerneMissionsActivite();

	/**
	 * Returns the value of the '<em><b>APour Priorites Tactiques Logistiques Priorite Tactique Logistique</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypePrioriteTactiqueLogistique}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Priorites Tactiques Logistiques Priorite Tactique Logistique</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Priorites Tactiques Logistiques Priorite Tactique Logistique</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeHoraireManoeuvre_APourPrioritesTactiquesLogistiquesPrioriteTactiqueLogistique()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_PrioriteTactiqueLogistique'"
	 *        extendedMetaData="kind='element' name='APourPrioritesTactiquesLogistiques_PrioriteTactiqueLogistique'"
	 * @generated
	 */
	EList<TypePrioriteTactiqueLogistique> getAPourPrioritesTactiquesLogistiquesPrioriteTactiqueLogistique();

	/**
	 * Returns the value of the '<em><b>Decrit Rapport Force Rapport Force</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decrit Rapport Force Rapport Force</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decrit Rapport Force Rapport Force</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeHoraireManoeuvre_DecritRapportForceRapportForce()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='Correspond_HoraireManoeuvre' target_entity='type_RapportForce'"
	 *        extendedMetaData="kind='element' name='DecritRapportForce_RapportForce'"
	 * @generated
	 */
	EList<TypeAssociation> getDecritRapportForceRapportForce();

	/**
	 * Returns the value of the '<em><b>AComme Consignes Applicables Consigne</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Consignes Applicables Consigne</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Consignes Applicables Consigne</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeHoraireManoeuvre_ACommeConsignesApplicablesConsigne()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Consigne'"
	 *        extendedMetaData="kind='element' name='ACommeConsignesApplicables_Consigne'"
	 * @generated
	 */
	EList<TypeAssociation> getACommeConsignesApplicablesConsigne();

	/**
	 * Returns the value of the '<em><b>AComme Point Entree Consigne</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Point Entree Consigne</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Point Entree Consigne</em>' containment reference.
	 * @see #setACommePointEntreeConsigne(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeHoraireManoeuvre_ACommePointEntreeConsigne()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Consigne'"
	 *        extendedMetaData="kind='element' name='ACommePointEntree_Consigne'"
	 * @generated
	 */
	TypeAssociation getACommePointEntreeConsigne();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeHoraireManoeuvre#getACommePointEntreeConsigne <em>AComme Point Entree Consigne</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Point Entree Consigne</em>' containment reference.
	 * @see #getACommePointEntreeConsigne()
	 * @generated
	 */
	void setACommePointEntreeConsigne(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>AComme Point Sortie Consigne</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Point Sortie Consigne</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Point Sortie Consigne</em>' containment reference.
	 * @see #setACommePointSortieConsigne(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeHoraireManoeuvre_ACommePointSortieConsigne()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Consigne'"
	 *        extendedMetaData="kind='element' name='ACommePointSortie_Consigne'"
	 * @generated
	 */
	TypeAssociation getACommePointSortieConsigne();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeHoraireManoeuvre#getACommePointSortieConsigne <em>AComme Point Sortie Consigne</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Point Sortie Consigne</em>' containment reference.
	 * @see #getACommePointSortieConsigne()
	 * @generated
	 */
	void setACommePointSortieConsigne(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Date Debut Datation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Date Debut Datation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Date Debut Datation</em>' containment reference.
	 * @see #setAPourDateDebutDatation(TypeDatation)
	 * @see mpia.schema.SchemaPackage#getTypeHoraireManoeuvre_APourDateDebutDatation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Datation'"
	 *        extendedMetaData="kind='element' name='APourDateDebut_Datation'"
	 * @generated
	 */
	TypeDatation getAPourDateDebutDatation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeHoraireManoeuvre#getAPourDateDebutDatation <em>APour Date Debut Datation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Date Debut Datation</em>' containment reference.
	 * @see #getAPourDateDebutDatation()
	 * @generated
	 */
	void setAPourDateDebutDatation(TypeDatation value);

	/**
	 * Returns the value of the '<em><b>APour Date Fin Datation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Date Fin Datation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Date Fin Datation</em>' containment reference.
	 * @see #setAPourDateFinDatation(TypeDatation)
	 * @see mpia.schema.SchemaPackage#getTypeHoraireManoeuvre_APourDateFinDatation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Datation'"
	 *        extendedMetaData="kind='element' name='APourDateFin_Datation'"
	 * @generated
	 */
	TypeDatation getAPourDateFinDatation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeHoraireManoeuvre#getAPourDateFinDatation <em>APour Date Fin Datation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Date Fin Datation</em>' containment reference.
	 * @see #getAPourDateFinDatation()
	 * @generated
	 */
	void setAPourDateFinDatation(TypeDatation value);

} // TypeHoraireManoeuvre
