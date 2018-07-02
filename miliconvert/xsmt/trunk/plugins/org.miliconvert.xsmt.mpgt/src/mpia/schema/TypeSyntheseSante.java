/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Synthese Sante</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeSyntheseSante#getCapaciteEvacuationDisponible <em>Capacite Evacuation Disponible</em>}</li>
 *   <li>{@link mpia.schema.TypeSyntheseSante#getCapaciteEvacuationMoyenAir <em>Capacite Evacuation Moyen Air</em>}</li>
 *   <li>{@link mpia.schema.TypeSyntheseSante#getCapaciteEvacuationMoyenMer <em>Capacite Evacuation Moyen Mer</em>}</li>
 *   <li>{@link mpia.schema.TypeSyntheseSante#getCapaciteEvacuationMoyenRail <em>Capacite Evacuation Moyen Rail</em>}</li>
 *   <li>{@link mpia.schema.TypeSyntheseSante#getCapaciteEvacuationMoyenTerre <em>Capacite Evacuation Moyen Terre</em>}</li>
 *   <li>{@link mpia.schema.TypeSyntheseSante#getCapaciteMoyenAir <em>Capacite Moyen Air</em>}</li>
 *   <li>{@link mpia.schema.TypeSyntheseSante#getCapaciteMoyenTerre <em>Capacite Moyen Terre</em>}</li>
 *   <li>{@link mpia.schema.TypeSyntheseSante#getCommentaireEvacuation <em>Commentaire Evacuation</em>}</li>
 *   <li>{@link mpia.schema.TypeSyntheseSante#getCommentaireRamassage <em>Commentaire Ramassage</em>}</li>
 *   <li>{@link mpia.schema.TypeSyntheseSante#getCommentaireSituationChirurgicale <em>Commentaire Situation Chirurgicale</em>}</li>
 *   <li>{@link mpia.schema.TypeSyntheseSante#getCommentaireSituationHopitaux <em>Commentaire Situation Hopitaux</em>}</li>
 *   <li>{@link mpia.schema.TypeSyntheseSante#getCommentaireSituationRessources <em>Commentaire Situation Ressources</em>}</li>
 *   <li>{@link mpia.schema.TypeSyntheseSante#getCommentaireSituationSang <em>Commentaire Situation Sang</em>}</li>
 *   <li>{@link mpia.schema.TypeSyntheseSante#getCommentaireTriage <em>Commentaire Triage</em>}</li>
 *   <li>{@link mpia.schema.TypeSyntheseSante#getNombreEquipesChirurgicalesDeployes <em>Nombre Equipes Chirurgicales Deployes</em>}</li>
 *   <li>{@link mpia.schema.TypeSyntheseSante#getNombreJoursFonctionnementRestants <em>Nombre Jours Fonctionnement Restants</em>}</li>
 *   <li>{@link mpia.schema.TypeSyntheseSante#getNombreLitsDeployesDisponibles <em>Nombre Lits Deployes Disponibles</em>}</li>
 *   <li>{@link mpia.schema.TypeSyntheseSante#getNombreLitsDeployesInfrastructure <em>Nombre Lits Deployes Infrastructure</em>}</li>
 *   <li>{@link mpia.schema.TypeSyntheseSante#getNombreLitsDeployesOccupes <em>Nombre Lits Deployes Occupes</em>}</li>
 *   <li>{@link mpia.schema.TypeSyntheseSante#getNombrePostesNRBC <em>Nombre Postes NRBC</em>}</li>
 *   <li>{@link mpia.schema.TypeSyntheseSante#getNombrePostesSecours <em>Nombre Postes Secours</em>}</li>
 *   <li>{@link mpia.schema.TypeSyntheseSante#getNombreSectionsTriageExistantes <em>Nombre Sections Triage Existantes</em>}</li>
 *   <li>{@link mpia.schema.TypeSyntheseSante#getNombreUnitesSangReserve <em>Nombre Unites Sang Reserve</em>}</li>
 *   <li>{@link mpia.schema.TypeSyntheseSante#getPotentielBrules <em>Potentiel Brules</em>}</li>
 *   <li>{@link mpia.schema.TypeSyntheseSante#getPotentielChirurgical <em>Potentiel Chirurgical</em>}</li>
 *   <li>{@link mpia.schema.TypeSyntheseSante#getSituationEpidemies <em>Situation Epidemies</em>}</li>
 *   <li>{@link mpia.schema.TypeSyntheseSante#getSituationPertesMassives <em>Situation Pertes Massives</em>}</li>
 *   <li>{@link mpia.schema.TypeSyntheseSante#getDateSyntheseSante <em>Date Synthese Sante</em>}</li>
 *   <li>{@link mpia.schema.TypeSyntheseSante#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeSyntheseSante#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeSyntheseSante#getEvacuationPatientsEvacuationPatients <em>Evacuation Patients Evacuation Patients</em>}</li>
 *   <li>{@link mpia.schema.TypeSyntheseSante#getPertesParPeriodePertesParPeriode <em>Pertes Par Periode Pertes Par Periode</em>}</li>
 *   <li>{@link mpia.schema.TypeSyntheseSante#getEvacuationsParPeriodeEvacuationsParPeriode <em>Evacuations Par Periode Evacuations Par Periode</em>}</li>
 *   <li>{@link mpia.schema.TypeSyntheseSante#getConsommablesSanteConsommableSante <em>Consommables Sante Consommable Sante</em>}</li>
 *   <li>{@link mpia.schema.TypeSyntheseSante#getACommeBlessesParPeriodeBlessesParPeriode <em>AComme Blesses Par Periode Blesses Par Periode</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeSyntheseSante()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_SyntheseSante' kind='elementOnly'"
 * @generated
 */
public interface TypeSyntheseSante extends EObject {
	/**
	 * Returns the value of the '<em><b>Capacite Evacuation Disponible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacite Evacuation Disponible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacite Evacuation Disponible</em>' attribute.
	 * @see #isSetCapaciteEvacuationDisponible()
	 * @see #unsetCapaciteEvacuationDisponible()
	 * @see #setCapaciteEvacuationDisponible(long)
	 * @see mpia.schema.SchemaPackage#getTypeSyntheseSante_CapaciteEvacuationDisponible()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='CapaciteEvacuationDisponible'"
	 * @generated
	 */
	long getCapaciteEvacuationDisponible();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSyntheseSante#getCapaciteEvacuationDisponible <em>Capacite Evacuation Disponible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacite Evacuation Disponible</em>' attribute.
	 * @see #isSetCapaciteEvacuationDisponible()
	 * @see #unsetCapaciteEvacuationDisponible()
	 * @see #getCapaciteEvacuationDisponible()
	 * @generated
	 */
	void setCapaciteEvacuationDisponible(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSyntheseSante#getCapaciteEvacuationDisponible <em>Capacite Evacuation Disponible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCapaciteEvacuationDisponible()
	 * @see #getCapaciteEvacuationDisponible()
	 * @see #setCapaciteEvacuationDisponible(long)
	 * @generated
	 */
	void unsetCapaciteEvacuationDisponible();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSyntheseSante#getCapaciteEvacuationDisponible <em>Capacite Evacuation Disponible</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Capacite Evacuation Disponible</em>' attribute is set.
	 * @see #unsetCapaciteEvacuationDisponible()
	 * @see #getCapaciteEvacuationDisponible()
	 * @see #setCapaciteEvacuationDisponible(long)
	 * @generated
	 */
	boolean isSetCapaciteEvacuationDisponible();

	/**
	 * Returns the value of the '<em><b>Capacite Evacuation Moyen Air</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacite Evacuation Moyen Air</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacite Evacuation Moyen Air</em>' attribute.
	 * @see #isSetCapaciteEvacuationMoyenAir()
	 * @see #unsetCapaciteEvacuationMoyenAir()
	 * @see #setCapaciteEvacuationMoyenAir(long)
	 * @see mpia.schema.SchemaPackage#getTypeSyntheseSante_CapaciteEvacuationMoyenAir()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='CapaciteEvacuationMoyenAir'"
	 * @generated
	 */
	long getCapaciteEvacuationMoyenAir();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSyntheseSante#getCapaciteEvacuationMoyenAir <em>Capacite Evacuation Moyen Air</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacite Evacuation Moyen Air</em>' attribute.
	 * @see #isSetCapaciteEvacuationMoyenAir()
	 * @see #unsetCapaciteEvacuationMoyenAir()
	 * @see #getCapaciteEvacuationMoyenAir()
	 * @generated
	 */
	void setCapaciteEvacuationMoyenAir(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSyntheseSante#getCapaciteEvacuationMoyenAir <em>Capacite Evacuation Moyen Air</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCapaciteEvacuationMoyenAir()
	 * @see #getCapaciteEvacuationMoyenAir()
	 * @see #setCapaciteEvacuationMoyenAir(long)
	 * @generated
	 */
	void unsetCapaciteEvacuationMoyenAir();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSyntheseSante#getCapaciteEvacuationMoyenAir <em>Capacite Evacuation Moyen Air</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Capacite Evacuation Moyen Air</em>' attribute is set.
	 * @see #unsetCapaciteEvacuationMoyenAir()
	 * @see #getCapaciteEvacuationMoyenAir()
	 * @see #setCapaciteEvacuationMoyenAir(long)
	 * @generated
	 */
	boolean isSetCapaciteEvacuationMoyenAir();

	/**
	 * Returns the value of the '<em><b>Capacite Evacuation Moyen Mer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacite Evacuation Moyen Mer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacite Evacuation Moyen Mer</em>' attribute.
	 * @see #isSetCapaciteEvacuationMoyenMer()
	 * @see #unsetCapaciteEvacuationMoyenMer()
	 * @see #setCapaciteEvacuationMoyenMer(long)
	 * @see mpia.schema.SchemaPackage#getTypeSyntheseSante_CapaciteEvacuationMoyenMer()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='CapaciteEvacuationMoyenMer'"
	 * @generated
	 */
	long getCapaciteEvacuationMoyenMer();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSyntheseSante#getCapaciteEvacuationMoyenMer <em>Capacite Evacuation Moyen Mer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacite Evacuation Moyen Mer</em>' attribute.
	 * @see #isSetCapaciteEvacuationMoyenMer()
	 * @see #unsetCapaciteEvacuationMoyenMer()
	 * @see #getCapaciteEvacuationMoyenMer()
	 * @generated
	 */
	void setCapaciteEvacuationMoyenMer(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSyntheseSante#getCapaciteEvacuationMoyenMer <em>Capacite Evacuation Moyen Mer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCapaciteEvacuationMoyenMer()
	 * @see #getCapaciteEvacuationMoyenMer()
	 * @see #setCapaciteEvacuationMoyenMer(long)
	 * @generated
	 */
	void unsetCapaciteEvacuationMoyenMer();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSyntheseSante#getCapaciteEvacuationMoyenMer <em>Capacite Evacuation Moyen Mer</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Capacite Evacuation Moyen Mer</em>' attribute is set.
	 * @see #unsetCapaciteEvacuationMoyenMer()
	 * @see #getCapaciteEvacuationMoyenMer()
	 * @see #setCapaciteEvacuationMoyenMer(long)
	 * @generated
	 */
	boolean isSetCapaciteEvacuationMoyenMer();

	/**
	 * Returns the value of the '<em><b>Capacite Evacuation Moyen Rail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacite Evacuation Moyen Rail</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacite Evacuation Moyen Rail</em>' attribute.
	 * @see #isSetCapaciteEvacuationMoyenRail()
	 * @see #unsetCapaciteEvacuationMoyenRail()
	 * @see #setCapaciteEvacuationMoyenRail(long)
	 * @see mpia.schema.SchemaPackage#getTypeSyntheseSante_CapaciteEvacuationMoyenRail()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='CapaciteEvacuationMoyenRail'"
	 * @generated
	 */
	long getCapaciteEvacuationMoyenRail();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSyntheseSante#getCapaciteEvacuationMoyenRail <em>Capacite Evacuation Moyen Rail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacite Evacuation Moyen Rail</em>' attribute.
	 * @see #isSetCapaciteEvacuationMoyenRail()
	 * @see #unsetCapaciteEvacuationMoyenRail()
	 * @see #getCapaciteEvacuationMoyenRail()
	 * @generated
	 */
	void setCapaciteEvacuationMoyenRail(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSyntheseSante#getCapaciteEvacuationMoyenRail <em>Capacite Evacuation Moyen Rail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCapaciteEvacuationMoyenRail()
	 * @see #getCapaciteEvacuationMoyenRail()
	 * @see #setCapaciteEvacuationMoyenRail(long)
	 * @generated
	 */
	void unsetCapaciteEvacuationMoyenRail();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSyntheseSante#getCapaciteEvacuationMoyenRail <em>Capacite Evacuation Moyen Rail</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Capacite Evacuation Moyen Rail</em>' attribute is set.
	 * @see #unsetCapaciteEvacuationMoyenRail()
	 * @see #getCapaciteEvacuationMoyenRail()
	 * @see #setCapaciteEvacuationMoyenRail(long)
	 * @generated
	 */
	boolean isSetCapaciteEvacuationMoyenRail();

	/**
	 * Returns the value of the '<em><b>Capacite Evacuation Moyen Terre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacite Evacuation Moyen Terre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacite Evacuation Moyen Terre</em>' attribute.
	 * @see #isSetCapaciteEvacuationMoyenTerre()
	 * @see #unsetCapaciteEvacuationMoyenTerre()
	 * @see #setCapaciteEvacuationMoyenTerre(long)
	 * @see mpia.schema.SchemaPackage#getTypeSyntheseSante_CapaciteEvacuationMoyenTerre()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='CapaciteEvacuationMoyenTerre'"
	 * @generated
	 */
	long getCapaciteEvacuationMoyenTerre();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSyntheseSante#getCapaciteEvacuationMoyenTerre <em>Capacite Evacuation Moyen Terre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacite Evacuation Moyen Terre</em>' attribute.
	 * @see #isSetCapaciteEvacuationMoyenTerre()
	 * @see #unsetCapaciteEvacuationMoyenTerre()
	 * @see #getCapaciteEvacuationMoyenTerre()
	 * @generated
	 */
	void setCapaciteEvacuationMoyenTerre(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSyntheseSante#getCapaciteEvacuationMoyenTerre <em>Capacite Evacuation Moyen Terre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCapaciteEvacuationMoyenTerre()
	 * @see #getCapaciteEvacuationMoyenTerre()
	 * @see #setCapaciteEvacuationMoyenTerre(long)
	 * @generated
	 */
	void unsetCapaciteEvacuationMoyenTerre();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSyntheseSante#getCapaciteEvacuationMoyenTerre <em>Capacite Evacuation Moyen Terre</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Capacite Evacuation Moyen Terre</em>' attribute is set.
	 * @see #unsetCapaciteEvacuationMoyenTerre()
	 * @see #getCapaciteEvacuationMoyenTerre()
	 * @see #setCapaciteEvacuationMoyenTerre(long)
	 * @generated
	 */
	boolean isSetCapaciteEvacuationMoyenTerre();

	/**
	 * Returns the value of the '<em><b>Capacite Moyen Air</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacite Moyen Air</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacite Moyen Air</em>' attribute.
	 * @see #isSetCapaciteMoyenAir()
	 * @see #unsetCapaciteMoyenAir()
	 * @see #setCapaciteMoyenAir(long)
	 * @see mpia.schema.SchemaPackage#getTypeSyntheseSante_CapaciteMoyenAir()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='CapaciteMoyenAir'"
	 * @generated
	 */
	long getCapaciteMoyenAir();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSyntheseSante#getCapaciteMoyenAir <em>Capacite Moyen Air</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacite Moyen Air</em>' attribute.
	 * @see #isSetCapaciteMoyenAir()
	 * @see #unsetCapaciteMoyenAir()
	 * @see #getCapaciteMoyenAir()
	 * @generated
	 */
	void setCapaciteMoyenAir(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSyntheseSante#getCapaciteMoyenAir <em>Capacite Moyen Air</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCapaciteMoyenAir()
	 * @see #getCapaciteMoyenAir()
	 * @see #setCapaciteMoyenAir(long)
	 * @generated
	 */
	void unsetCapaciteMoyenAir();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSyntheseSante#getCapaciteMoyenAir <em>Capacite Moyen Air</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Capacite Moyen Air</em>' attribute is set.
	 * @see #unsetCapaciteMoyenAir()
	 * @see #getCapaciteMoyenAir()
	 * @see #setCapaciteMoyenAir(long)
	 * @generated
	 */
	boolean isSetCapaciteMoyenAir();

	/**
	 * Returns the value of the '<em><b>Capacite Moyen Terre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacite Moyen Terre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacite Moyen Terre</em>' attribute.
	 * @see #isSetCapaciteMoyenTerre()
	 * @see #unsetCapaciteMoyenTerre()
	 * @see #setCapaciteMoyenTerre(long)
	 * @see mpia.schema.SchemaPackage#getTypeSyntheseSante_CapaciteMoyenTerre()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='CapaciteMoyenTerre'"
	 * @generated
	 */
	long getCapaciteMoyenTerre();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSyntheseSante#getCapaciteMoyenTerre <em>Capacite Moyen Terre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacite Moyen Terre</em>' attribute.
	 * @see #isSetCapaciteMoyenTerre()
	 * @see #unsetCapaciteMoyenTerre()
	 * @see #getCapaciteMoyenTerre()
	 * @generated
	 */
	void setCapaciteMoyenTerre(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSyntheseSante#getCapaciteMoyenTerre <em>Capacite Moyen Terre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCapaciteMoyenTerre()
	 * @see #getCapaciteMoyenTerre()
	 * @see #setCapaciteMoyenTerre(long)
	 * @generated
	 */
	void unsetCapaciteMoyenTerre();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSyntheseSante#getCapaciteMoyenTerre <em>Capacite Moyen Terre</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Capacite Moyen Terre</em>' attribute is set.
	 * @see #unsetCapaciteMoyenTerre()
	 * @see #getCapaciteMoyenTerre()
	 * @see #setCapaciteMoyenTerre(long)
	 * @generated
	 */
	boolean isSetCapaciteMoyenTerre();

	/**
	 * Returns the value of the '<em><b>Commentaire Evacuation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commentaire Evacuation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commentaire Evacuation</em>' attribute.
	 * @see #setCommentaireEvacuation(String)
	 * @see mpia.schema.SchemaPackage#getTypeSyntheseSante_CommentaireEvacuation()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='CommentaireEvacuation'"
	 * @generated
	 */
	String getCommentaireEvacuation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSyntheseSante#getCommentaireEvacuation <em>Commentaire Evacuation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commentaire Evacuation</em>' attribute.
	 * @see #getCommentaireEvacuation()
	 * @generated
	 */
	void setCommentaireEvacuation(String value);

	/**
	 * Returns the value of the '<em><b>Commentaire Ramassage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commentaire Ramassage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commentaire Ramassage</em>' attribute.
	 * @see #setCommentaireRamassage(String)
	 * @see mpia.schema.SchemaPackage#getTypeSyntheseSante_CommentaireRamassage()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='CommentaireRamassage'"
	 * @generated
	 */
	String getCommentaireRamassage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSyntheseSante#getCommentaireRamassage <em>Commentaire Ramassage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commentaire Ramassage</em>' attribute.
	 * @see #getCommentaireRamassage()
	 * @generated
	 */
	void setCommentaireRamassage(String value);

	/**
	 * Returns the value of the '<em><b>Commentaire Situation Chirurgicale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commentaire Situation Chirurgicale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commentaire Situation Chirurgicale</em>' attribute.
	 * @see #setCommentaireSituationChirurgicale(String)
	 * @see mpia.schema.SchemaPackage#getTypeSyntheseSante_CommentaireSituationChirurgicale()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='CommentaireSituationChirurgicale'"
	 * @generated
	 */
	String getCommentaireSituationChirurgicale();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSyntheseSante#getCommentaireSituationChirurgicale <em>Commentaire Situation Chirurgicale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commentaire Situation Chirurgicale</em>' attribute.
	 * @see #getCommentaireSituationChirurgicale()
	 * @generated
	 */
	void setCommentaireSituationChirurgicale(String value);

	/**
	 * Returns the value of the '<em><b>Commentaire Situation Hopitaux</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commentaire Situation Hopitaux</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commentaire Situation Hopitaux</em>' attribute.
	 * @see #setCommentaireSituationHopitaux(String)
	 * @see mpia.schema.SchemaPackage#getTypeSyntheseSante_CommentaireSituationHopitaux()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='CommentaireSituationHopitaux'"
	 * @generated
	 */
	String getCommentaireSituationHopitaux();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSyntheseSante#getCommentaireSituationHopitaux <em>Commentaire Situation Hopitaux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commentaire Situation Hopitaux</em>' attribute.
	 * @see #getCommentaireSituationHopitaux()
	 * @generated
	 */
	void setCommentaireSituationHopitaux(String value);

	/**
	 * Returns the value of the '<em><b>Commentaire Situation Ressources</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commentaire Situation Ressources</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commentaire Situation Ressources</em>' attribute.
	 * @see #setCommentaireSituationRessources(String)
	 * @see mpia.schema.SchemaPackage#getTypeSyntheseSante_CommentaireSituationRessources()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='CommentaireSituationRessources'"
	 * @generated
	 */
	String getCommentaireSituationRessources();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSyntheseSante#getCommentaireSituationRessources <em>Commentaire Situation Ressources</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commentaire Situation Ressources</em>' attribute.
	 * @see #getCommentaireSituationRessources()
	 * @generated
	 */
	void setCommentaireSituationRessources(String value);

	/**
	 * Returns the value of the '<em><b>Commentaire Situation Sang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commentaire Situation Sang</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commentaire Situation Sang</em>' attribute.
	 * @see #setCommentaireSituationSang(String)
	 * @see mpia.schema.SchemaPackage#getTypeSyntheseSante_CommentaireSituationSang()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='CommentaireSituationSang'"
	 * @generated
	 */
	String getCommentaireSituationSang();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSyntheseSante#getCommentaireSituationSang <em>Commentaire Situation Sang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commentaire Situation Sang</em>' attribute.
	 * @see #getCommentaireSituationSang()
	 * @generated
	 */
	void setCommentaireSituationSang(String value);

	/**
	 * Returns the value of the '<em><b>Commentaire Triage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commentaire Triage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commentaire Triage</em>' attribute.
	 * @see #setCommentaireTriage(String)
	 * @see mpia.schema.SchemaPackage#getTypeSyntheseSante_CommentaireTriage()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='CommentaireTriage'"
	 * @generated
	 */
	String getCommentaireTriage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSyntheseSante#getCommentaireTriage <em>Commentaire Triage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commentaire Triage</em>' attribute.
	 * @see #getCommentaireTriage()
	 * @generated
	 */
	void setCommentaireTriage(String value);

	/**
	 * Returns the value of the '<em><b>Nombre Equipes Chirurgicales Deployes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Equipes Chirurgicales Deployes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Equipes Chirurgicales Deployes</em>' attribute.
	 * @see #isSetNombreEquipesChirurgicalesDeployes()
	 * @see #unsetNombreEquipesChirurgicalesDeployes()
	 * @see #setNombreEquipesChirurgicalesDeployes(long)
	 * @see mpia.schema.SchemaPackage#getTypeSyntheseSante_NombreEquipesChirurgicalesDeployes()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='NombreEquipesChirurgicalesDeployes'"
	 * @generated
	 */
	long getNombreEquipesChirurgicalesDeployes();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSyntheseSante#getNombreEquipesChirurgicalesDeployes <em>Nombre Equipes Chirurgicales Deployes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Equipes Chirurgicales Deployes</em>' attribute.
	 * @see #isSetNombreEquipesChirurgicalesDeployes()
	 * @see #unsetNombreEquipesChirurgicalesDeployes()
	 * @see #getNombreEquipesChirurgicalesDeployes()
	 * @generated
	 */
	void setNombreEquipesChirurgicalesDeployes(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSyntheseSante#getNombreEquipesChirurgicalesDeployes <em>Nombre Equipes Chirurgicales Deployes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreEquipesChirurgicalesDeployes()
	 * @see #getNombreEquipesChirurgicalesDeployes()
	 * @see #setNombreEquipesChirurgicalesDeployes(long)
	 * @generated
	 */
	void unsetNombreEquipesChirurgicalesDeployes();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSyntheseSante#getNombreEquipesChirurgicalesDeployes <em>Nombre Equipes Chirurgicales Deployes</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Equipes Chirurgicales Deployes</em>' attribute is set.
	 * @see #unsetNombreEquipesChirurgicalesDeployes()
	 * @see #getNombreEquipesChirurgicalesDeployes()
	 * @see #setNombreEquipesChirurgicalesDeployes(long)
	 * @generated
	 */
	boolean isSetNombreEquipesChirurgicalesDeployes();

	/**
	 * Returns the value of the '<em><b>Nombre Jours Fonctionnement Restants</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Jours Fonctionnement Restants</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Jours Fonctionnement Restants</em>' attribute.
	 * @see #isSetNombreJoursFonctionnementRestants()
	 * @see #unsetNombreJoursFonctionnementRestants()
	 * @see #setNombreJoursFonctionnementRestants(double)
	 * @see mpia.schema.SchemaPackage#getTypeSyntheseSante_NombreJoursFonctionnementRestants()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='NombreJoursFonctionnementRestants'"
	 * @generated
	 */
	double getNombreJoursFonctionnementRestants();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSyntheseSante#getNombreJoursFonctionnementRestants <em>Nombre Jours Fonctionnement Restants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Jours Fonctionnement Restants</em>' attribute.
	 * @see #isSetNombreJoursFonctionnementRestants()
	 * @see #unsetNombreJoursFonctionnementRestants()
	 * @see #getNombreJoursFonctionnementRestants()
	 * @generated
	 */
	void setNombreJoursFonctionnementRestants(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSyntheseSante#getNombreJoursFonctionnementRestants <em>Nombre Jours Fonctionnement Restants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreJoursFonctionnementRestants()
	 * @see #getNombreJoursFonctionnementRestants()
	 * @see #setNombreJoursFonctionnementRestants(double)
	 * @generated
	 */
	void unsetNombreJoursFonctionnementRestants();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSyntheseSante#getNombreJoursFonctionnementRestants <em>Nombre Jours Fonctionnement Restants</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Jours Fonctionnement Restants</em>' attribute is set.
	 * @see #unsetNombreJoursFonctionnementRestants()
	 * @see #getNombreJoursFonctionnementRestants()
	 * @see #setNombreJoursFonctionnementRestants(double)
	 * @generated
	 */
	boolean isSetNombreJoursFonctionnementRestants();

	/**
	 * Returns the value of the '<em><b>Nombre Lits Deployes Disponibles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Lits Deployes Disponibles</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Lits Deployes Disponibles</em>' attribute.
	 * @see #isSetNombreLitsDeployesDisponibles()
	 * @see #unsetNombreLitsDeployesDisponibles()
	 * @see #setNombreLitsDeployesDisponibles(long)
	 * @see mpia.schema.SchemaPackage#getTypeSyntheseSante_NombreLitsDeployesDisponibles()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='NombreLitsDeployesDisponibles'"
	 * @generated
	 */
	long getNombreLitsDeployesDisponibles();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSyntheseSante#getNombreLitsDeployesDisponibles <em>Nombre Lits Deployes Disponibles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Lits Deployes Disponibles</em>' attribute.
	 * @see #isSetNombreLitsDeployesDisponibles()
	 * @see #unsetNombreLitsDeployesDisponibles()
	 * @see #getNombreLitsDeployesDisponibles()
	 * @generated
	 */
	void setNombreLitsDeployesDisponibles(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSyntheseSante#getNombreLitsDeployesDisponibles <em>Nombre Lits Deployes Disponibles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreLitsDeployesDisponibles()
	 * @see #getNombreLitsDeployesDisponibles()
	 * @see #setNombreLitsDeployesDisponibles(long)
	 * @generated
	 */
	void unsetNombreLitsDeployesDisponibles();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSyntheseSante#getNombreLitsDeployesDisponibles <em>Nombre Lits Deployes Disponibles</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Lits Deployes Disponibles</em>' attribute is set.
	 * @see #unsetNombreLitsDeployesDisponibles()
	 * @see #getNombreLitsDeployesDisponibles()
	 * @see #setNombreLitsDeployesDisponibles(long)
	 * @generated
	 */
	boolean isSetNombreLitsDeployesDisponibles();

	/**
	 * Returns the value of the '<em><b>Nombre Lits Deployes Infrastructure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Lits Deployes Infrastructure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Lits Deployes Infrastructure</em>' attribute.
	 * @see #isSetNombreLitsDeployesInfrastructure()
	 * @see #unsetNombreLitsDeployesInfrastructure()
	 * @see #setNombreLitsDeployesInfrastructure(long)
	 * @see mpia.schema.SchemaPackage#getTypeSyntheseSante_NombreLitsDeployesInfrastructure()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='NombreLitsDeployesInfrastructure'"
	 * @generated
	 */
	long getNombreLitsDeployesInfrastructure();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSyntheseSante#getNombreLitsDeployesInfrastructure <em>Nombre Lits Deployes Infrastructure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Lits Deployes Infrastructure</em>' attribute.
	 * @see #isSetNombreLitsDeployesInfrastructure()
	 * @see #unsetNombreLitsDeployesInfrastructure()
	 * @see #getNombreLitsDeployesInfrastructure()
	 * @generated
	 */
	void setNombreLitsDeployesInfrastructure(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSyntheseSante#getNombreLitsDeployesInfrastructure <em>Nombre Lits Deployes Infrastructure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreLitsDeployesInfrastructure()
	 * @see #getNombreLitsDeployesInfrastructure()
	 * @see #setNombreLitsDeployesInfrastructure(long)
	 * @generated
	 */
	void unsetNombreLitsDeployesInfrastructure();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSyntheseSante#getNombreLitsDeployesInfrastructure <em>Nombre Lits Deployes Infrastructure</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Lits Deployes Infrastructure</em>' attribute is set.
	 * @see #unsetNombreLitsDeployesInfrastructure()
	 * @see #getNombreLitsDeployesInfrastructure()
	 * @see #setNombreLitsDeployesInfrastructure(long)
	 * @generated
	 */
	boolean isSetNombreLitsDeployesInfrastructure();

	/**
	 * Returns the value of the '<em><b>Nombre Lits Deployes Occupes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Lits Deployes Occupes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Lits Deployes Occupes</em>' attribute.
	 * @see #isSetNombreLitsDeployesOccupes()
	 * @see #unsetNombreLitsDeployesOccupes()
	 * @see #setNombreLitsDeployesOccupes(long)
	 * @see mpia.schema.SchemaPackage#getTypeSyntheseSante_NombreLitsDeployesOccupes()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='NombreLitsDeployesOccupes'"
	 * @generated
	 */
	long getNombreLitsDeployesOccupes();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSyntheseSante#getNombreLitsDeployesOccupes <em>Nombre Lits Deployes Occupes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Lits Deployes Occupes</em>' attribute.
	 * @see #isSetNombreLitsDeployesOccupes()
	 * @see #unsetNombreLitsDeployesOccupes()
	 * @see #getNombreLitsDeployesOccupes()
	 * @generated
	 */
	void setNombreLitsDeployesOccupes(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSyntheseSante#getNombreLitsDeployesOccupes <em>Nombre Lits Deployes Occupes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreLitsDeployesOccupes()
	 * @see #getNombreLitsDeployesOccupes()
	 * @see #setNombreLitsDeployesOccupes(long)
	 * @generated
	 */
	void unsetNombreLitsDeployesOccupes();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSyntheseSante#getNombreLitsDeployesOccupes <em>Nombre Lits Deployes Occupes</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Lits Deployes Occupes</em>' attribute is set.
	 * @see #unsetNombreLitsDeployesOccupes()
	 * @see #getNombreLitsDeployesOccupes()
	 * @see #setNombreLitsDeployesOccupes(long)
	 * @generated
	 */
	boolean isSetNombreLitsDeployesOccupes();

	/**
	 * Returns the value of the '<em><b>Nombre Postes NRBC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Postes NRBC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Postes NRBC</em>' attribute.
	 * @see #isSetNombrePostesNRBC()
	 * @see #unsetNombrePostesNRBC()
	 * @see #setNombrePostesNRBC(long)
	 * @see mpia.schema.SchemaPackage#getTypeSyntheseSante_NombrePostesNRBC()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='NombrePostesNRBC'"
	 * @generated
	 */
	long getNombrePostesNRBC();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSyntheseSante#getNombrePostesNRBC <em>Nombre Postes NRBC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Postes NRBC</em>' attribute.
	 * @see #isSetNombrePostesNRBC()
	 * @see #unsetNombrePostesNRBC()
	 * @see #getNombrePostesNRBC()
	 * @generated
	 */
	void setNombrePostesNRBC(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSyntheseSante#getNombrePostesNRBC <em>Nombre Postes NRBC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombrePostesNRBC()
	 * @see #getNombrePostesNRBC()
	 * @see #setNombrePostesNRBC(long)
	 * @generated
	 */
	void unsetNombrePostesNRBC();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSyntheseSante#getNombrePostesNRBC <em>Nombre Postes NRBC</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Postes NRBC</em>' attribute is set.
	 * @see #unsetNombrePostesNRBC()
	 * @see #getNombrePostesNRBC()
	 * @see #setNombrePostesNRBC(long)
	 * @generated
	 */
	boolean isSetNombrePostesNRBC();

	/**
	 * Returns the value of the '<em><b>Nombre Postes Secours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Postes Secours</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Postes Secours</em>' attribute.
	 * @see #isSetNombrePostesSecours()
	 * @see #unsetNombrePostesSecours()
	 * @see #setNombrePostesSecours(long)
	 * @see mpia.schema.SchemaPackage#getTypeSyntheseSante_NombrePostesSecours()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='NombrePostesSecours'"
	 * @generated
	 */
	long getNombrePostesSecours();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSyntheseSante#getNombrePostesSecours <em>Nombre Postes Secours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Postes Secours</em>' attribute.
	 * @see #isSetNombrePostesSecours()
	 * @see #unsetNombrePostesSecours()
	 * @see #getNombrePostesSecours()
	 * @generated
	 */
	void setNombrePostesSecours(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSyntheseSante#getNombrePostesSecours <em>Nombre Postes Secours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombrePostesSecours()
	 * @see #getNombrePostesSecours()
	 * @see #setNombrePostesSecours(long)
	 * @generated
	 */
	void unsetNombrePostesSecours();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSyntheseSante#getNombrePostesSecours <em>Nombre Postes Secours</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Postes Secours</em>' attribute is set.
	 * @see #unsetNombrePostesSecours()
	 * @see #getNombrePostesSecours()
	 * @see #setNombrePostesSecours(long)
	 * @generated
	 */
	boolean isSetNombrePostesSecours();

	/**
	 * Returns the value of the '<em><b>Nombre Sections Triage Existantes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Sections Triage Existantes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Sections Triage Existantes</em>' attribute.
	 * @see #isSetNombreSectionsTriageExistantes()
	 * @see #unsetNombreSectionsTriageExistantes()
	 * @see #setNombreSectionsTriageExistantes(long)
	 * @see mpia.schema.SchemaPackage#getTypeSyntheseSante_NombreSectionsTriageExistantes()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='NombreSectionsTriageExistantes'"
	 * @generated
	 */
	long getNombreSectionsTriageExistantes();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSyntheseSante#getNombreSectionsTriageExistantes <em>Nombre Sections Triage Existantes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Sections Triage Existantes</em>' attribute.
	 * @see #isSetNombreSectionsTriageExistantes()
	 * @see #unsetNombreSectionsTriageExistantes()
	 * @see #getNombreSectionsTriageExistantes()
	 * @generated
	 */
	void setNombreSectionsTriageExistantes(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSyntheseSante#getNombreSectionsTriageExistantes <em>Nombre Sections Triage Existantes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreSectionsTriageExistantes()
	 * @see #getNombreSectionsTriageExistantes()
	 * @see #setNombreSectionsTriageExistantes(long)
	 * @generated
	 */
	void unsetNombreSectionsTriageExistantes();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSyntheseSante#getNombreSectionsTriageExistantes <em>Nombre Sections Triage Existantes</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Sections Triage Existantes</em>' attribute is set.
	 * @see #unsetNombreSectionsTriageExistantes()
	 * @see #getNombreSectionsTriageExistantes()
	 * @see #setNombreSectionsTriageExistantes(long)
	 * @generated
	 */
	boolean isSetNombreSectionsTriageExistantes();

	/**
	 * Returns the value of the '<em><b>Nombre Unites Sang Reserve</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Unites Sang Reserve</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Unites Sang Reserve</em>' attribute.
	 * @see #isSetNombreUnitesSangReserve()
	 * @see #unsetNombreUnitesSangReserve()
	 * @see #setNombreUnitesSangReserve(long)
	 * @see mpia.schema.SchemaPackage#getTypeSyntheseSante_NombreUnitesSangReserve()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='NombreUnitesSangReserve'"
	 * @generated
	 */
	long getNombreUnitesSangReserve();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSyntheseSante#getNombreUnitesSangReserve <em>Nombre Unites Sang Reserve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Unites Sang Reserve</em>' attribute.
	 * @see #isSetNombreUnitesSangReserve()
	 * @see #unsetNombreUnitesSangReserve()
	 * @see #getNombreUnitesSangReserve()
	 * @generated
	 */
	void setNombreUnitesSangReserve(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSyntheseSante#getNombreUnitesSangReserve <em>Nombre Unites Sang Reserve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreUnitesSangReserve()
	 * @see #getNombreUnitesSangReserve()
	 * @see #setNombreUnitesSangReserve(long)
	 * @generated
	 */
	void unsetNombreUnitesSangReserve();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSyntheseSante#getNombreUnitesSangReserve <em>Nombre Unites Sang Reserve</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Unites Sang Reserve</em>' attribute is set.
	 * @see #unsetNombreUnitesSangReserve()
	 * @see #getNombreUnitesSangReserve()
	 * @see #setNombreUnitesSangReserve(long)
	 * @generated
	 */
	boolean isSetNombreUnitesSangReserve();

	/**
	 * Returns the value of the '<em><b>Potentiel Brules</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Potentiel Brules</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Potentiel Brules</em>' attribute.
	 * @see #isSetPotentielBrules()
	 * @see #unsetPotentielBrules()
	 * @see #setPotentielBrules(long)
	 * @see mpia.schema.SchemaPackage#getTypeSyntheseSante_PotentielBrules()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='PotentielBrules'"
	 * @generated
	 */
	long getPotentielBrules();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSyntheseSante#getPotentielBrules <em>Potentiel Brules</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Potentiel Brules</em>' attribute.
	 * @see #isSetPotentielBrules()
	 * @see #unsetPotentielBrules()
	 * @see #getPotentielBrules()
	 * @generated
	 */
	void setPotentielBrules(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSyntheseSante#getPotentielBrules <em>Potentiel Brules</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPotentielBrules()
	 * @see #getPotentielBrules()
	 * @see #setPotentielBrules(long)
	 * @generated
	 */
	void unsetPotentielBrules();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSyntheseSante#getPotentielBrules <em>Potentiel Brules</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Potentiel Brules</em>' attribute is set.
	 * @see #unsetPotentielBrules()
	 * @see #getPotentielBrules()
	 * @see #setPotentielBrules(long)
	 * @generated
	 */
	boolean isSetPotentielBrules();

	/**
	 * Returns the value of the '<em><b>Potentiel Chirurgical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Potentiel Chirurgical</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Potentiel Chirurgical</em>' attribute.
	 * @see #isSetPotentielChirurgical()
	 * @see #unsetPotentielChirurgical()
	 * @see #setPotentielChirurgical(long)
	 * @see mpia.schema.SchemaPackage#getTypeSyntheseSante_PotentielChirurgical()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='PotentielChirurgical'"
	 * @generated
	 */
	long getPotentielChirurgical();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSyntheseSante#getPotentielChirurgical <em>Potentiel Chirurgical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Potentiel Chirurgical</em>' attribute.
	 * @see #isSetPotentielChirurgical()
	 * @see #unsetPotentielChirurgical()
	 * @see #getPotentielChirurgical()
	 * @generated
	 */
	void setPotentielChirurgical(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSyntheseSante#getPotentielChirurgical <em>Potentiel Chirurgical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPotentielChirurgical()
	 * @see #getPotentielChirurgical()
	 * @see #setPotentielChirurgical(long)
	 * @generated
	 */
	void unsetPotentielChirurgical();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSyntheseSante#getPotentielChirurgical <em>Potentiel Chirurgical</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Potentiel Chirurgical</em>' attribute is set.
	 * @see #unsetPotentielChirurgical()
	 * @see #getPotentielChirurgical()
	 * @see #setPotentielChirurgical(long)
	 * @generated
	 */
	boolean isSetPotentielChirurgical();

	/**
	 * Returns the value of the '<em><b>Situation Epidemies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Situation Epidemies</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Situation Epidemies</em>' attribute.
	 * @see #setSituationEpidemies(String)
	 * @see mpia.schema.SchemaPackage#getTypeSyntheseSante_SituationEpidemies()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='SituationEpidemies'"
	 * @generated
	 */
	String getSituationEpidemies();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSyntheseSante#getSituationEpidemies <em>Situation Epidemies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Situation Epidemies</em>' attribute.
	 * @see #getSituationEpidemies()
	 * @generated
	 */
	void setSituationEpidemies(String value);

	/**
	 * Returns the value of the '<em><b>Situation Pertes Massives</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Situation Pertes Massives</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Situation Pertes Massives</em>' attribute.
	 * @see #setSituationPertesMassives(String)
	 * @see mpia.schema.SchemaPackage#getTypeSyntheseSante_SituationPertesMassives()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='SituationPertesMassives'"
	 * @generated
	 */
	String getSituationPertesMassives();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSyntheseSante#getSituationPertesMassives <em>Situation Pertes Massives</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Situation Pertes Massives</em>' attribute.
	 * @see #getSituationPertesMassives()
	 * @generated
	 */
	void setSituationPertesMassives(String value);

	/**
	 * Returns the value of the '<em><b>Date Synthese Sante</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Synthese Sante</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Synthese Sante</em>' attribute.
	 * @see #setDateSyntheseSante(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeSyntheseSante_DateSyntheseSante()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateSyntheseSante'"
	 * @generated
	 */
	XMLGregorianCalendar getDateSyntheseSante();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSyntheseSante#getDateSyntheseSante <em>Date Synthese Sante</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Synthese Sante</em>' attribute.
	 * @see #getDateSyntheseSante()
	 * @generated
	 */
	void setDateSyntheseSante(XMLGregorianCalendar value);

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
	 * @see mpia.schema.SchemaPackage#getTypeSyntheseSante_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSyntheseSante#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeSyntheseSante_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSyntheseSante#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Evacuation Patients Evacuation Patients</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeEvacuationPatients}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evacuation Patients Evacuation Patients</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evacuation Patients Evacuation Patients</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeSyntheseSante_EvacuationPatientsEvacuationPatients()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_EvacuationPatients'"
	 *        extendedMetaData="kind='element' name='EvacuationPatients_EvacuationPatients'"
	 * @generated
	 */
	EList<TypeEvacuationPatients> getEvacuationPatientsEvacuationPatients();

	/**
	 * Returns the value of the '<em><b>Pertes Par Periode Pertes Par Periode</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypePertesParPeriode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pertes Par Periode Pertes Par Periode</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pertes Par Periode Pertes Par Periode</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeSyntheseSante_PertesParPeriodePertesParPeriode()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_PertesParPeriode'"
	 *        extendedMetaData="kind='element' name='PertesParPeriode_PertesParPeriode'"
	 * @generated
	 */
	EList<TypePertesParPeriode> getPertesParPeriodePertesParPeriode();

	/**
	 * Returns the value of the '<em><b>Evacuations Par Periode Evacuations Par Periode</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeEvacuationsParPeriode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evacuations Par Periode Evacuations Par Periode</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evacuations Par Periode Evacuations Par Periode</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeSyntheseSante_EvacuationsParPeriodeEvacuationsParPeriode()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_EvacuationsParPeriode'"
	 *        extendedMetaData="kind='element' name='EvacuationsParPeriode_EvacuationsParPeriode'"
	 * @generated
	 */
	EList<TypeEvacuationsParPeriode> getEvacuationsParPeriodeEvacuationsParPeriode();

	/**
	 * Returns the value of the '<em><b>Consommables Sante Consommable Sante</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeConsommableSante}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consommables Sante Consommable Sante</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consommables Sante Consommable Sante</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeSyntheseSante_ConsommablesSanteConsommableSante()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ConsommableSante'"
	 *        extendedMetaData="kind='element' name='ConsommablesSante_ConsommableSante'"
	 * @generated
	 */
	EList<TypeConsommableSante> getConsommablesSanteConsommableSante();

	/**
	 * Returns the value of the '<em><b>AComme Blesses Par Periode Blesses Par Periode</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeBlessesParPeriode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Blesses Par Periode Blesses Par Periode</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Blesses Par Periode Blesses Par Periode</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeSyntheseSante_ACommeBlessesParPeriodeBlessesParPeriode()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_BlessesParPeriode'"
	 *        extendedMetaData="kind='element' name='ACommeBlessesParPeriode_BlessesParPeriode'"
	 * @generated
	 */
	EList<TypeBlessesParPeriode> getACommeBlessesParPeriodeBlessesParPeriode();

} // TypeSyntheseSante
