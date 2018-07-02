/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeDataTypeAngle;
import mpia.meta.TypeDataTypeDuree;
import mpia.meta.TypeDataTypeLongueur;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Unite ASS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeUniteASS#getCadence <em>Cadence</em>}</li>
 *   <li>{@link mpia.schema.TypeUniteASS#getDebattement <em>Debattement</em>}</li>
 *   <li>{@link mpia.schema.TypeUniteASS#getDebutCreneauReservation <em>Debut Creneau Reservation</em>}</li>
 *   <li>{@link mpia.schema.TypeUniteASS#getFinCreneauReservation <em>Fin Creneau Reservation</em>}</li>
 *   <li>{@link mpia.schema.TypeUniteASS#getIntervalleEntreMissions <em>Intervalle Entre Missions</em>}</li>
 *   <li>{@link mpia.schema.TypeUniteASS#getObservation <em>Observation</em>}</li>
 *   <li>{@link mpia.schema.TypeUniteASS#getPorteeMin <em>Portee Min</em>}</li>
 *   <li>{@link mpia.schema.TypeUniteASS#getStatutPDF <em>Statut PDF</em>}</li>
 *   <li>{@link mpia.schema.TypeUniteASS#getRATAC <em>RATAC</em>}</li>
 *   <li>{@link mpia.schema.TypeUniteASS#getGDHliberationPlan <em>GD Hliberation Plan</em>}</li>
 *   <li>{@link mpia.schema.TypeUniteASS#getNombrePieces <em>Nombre Pieces</em>}</li>
 *   <li>{@link mpia.schema.TypeUniteASS#getPorteeMax <em>Portee Max</em>}</li>
 *   <li>{@link mpia.schema.TypeUniteASS#getIdentificationASCA <em>Identification ASCA</em>}</li>
 *   <li>{@link mpia.schema.TypeUniteASS#getRestrictionsEtContraintes <em>Restrictions Et Contraintes</em>}</li>
 *   <li>{@link mpia.schema.TypeUniteASS#getAPourCapacitesObservationCapaciteObservationASS <em>APour Capacites Observation Capacite Observation ASS</em>}</li>
 *   <li>{@link mpia.schema.TypeUniteASS#getAEmisCRactiviteCRactiviteASS <em>AEmis CRactivite CRactivite ASS</em>}</li>
 *   <li>{@link mpia.schema.TypeUniteASS#getDisposeA1HeureVolumeMunitionsASS <em>Dispose A1 Heure Volume Munitions ASS</em>}</li>
 *   <li>{@link mpia.schema.TypeUniteASS#getAEnMouvementVolumeMunitionsASS <em>AEn Mouvement Volume Munitions ASS</em>}</li>
 *   <li>{@link mpia.schema.TypeUniteASS#getDisposeA2HeuresVolumeMunitionsASS <em>Dispose A2 Heures Volume Munitions ASS</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeUniteASS()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_UniteASS' kind='elementOnly'"
 * @generated
 */
public interface TypeUniteASS extends EObject {
	/**
	 * Returns the value of the '<em><b>Cadence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cadence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cadence</em>' attribute.
	 * @see #isSetCadence()
	 * @see #unsetCadence()
	 * @see #setCadence(long)
	 * @see mpia.schema.SchemaPackage#getTypeUniteASS_Cadence()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='Cadence'"
	 * @generated
	 */
	long getCadence();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUniteASS#getCadence <em>Cadence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cadence</em>' attribute.
	 * @see #isSetCadence()
	 * @see #unsetCadence()
	 * @see #getCadence()
	 * @generated
	 */
	void setCadence(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeUniteASS#getCadence <em>Cadence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCadence()
	 * @see #getCadence()
	 * @see #setCadence(long)
	 * @generated
	 */
	void unsetCadence();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeUniteASS#getCadence <em>Cadence</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cadence</em>' attribute is set.
	 * @see #unsetCadence()
	 * @see #getCadence()
	 * @see #setCadence(long)
	 * @generated
	 */
	boolean isSetCadence();

	/**
	 * Returns the value of the '<em><b>Debattement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Debattement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debattement</em>' containment reference.
	 * @see #setDebattement(TypeDataTypeAngle)
	 * @see mpia.schema.SchemaPackage#getTypeUniteASS_Debattement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Debattement'"
	 * @generated
	 */
	TypeDataTypeAngle getDebattement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUniteASS#getDebattement <em>Debattement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debattement</em>' containment reference.
	 * @see #getDebattement()
	 * @generated
	 */
	void setDebattement(TypeDataTypeAngle value);

	/**
	 * Returns the value of the '<em><b>Debut Creneau Reservation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Debut Creneau Reservation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debut Creneau Reservation</em>' attribute.
	 * @see #setDebutCreneauReservation(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeUniteASS_DebutCreneauReservation()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DebutCreneauReservation'"
	 * @generated
	 */
	XMLGregorianCalendar getDebutCreneauReservation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUniteASS#getDebutCreneauReservation <em>Debut Creneau Reservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debut Creneau Reservation</em>' attribute.
	 * @see #getDebutCreneauReservation()
	 * @generated
	 */
	void setDebutCreneauReservation(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Fin Creneau Reservation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fin Creneau Reservation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin Creneau Reservation</em>' attribute.
	 * @see #setFinCreneauReservation(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeUniteASS_FinCreneauReservation()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='FinCreneauReservation'"
	 * @generated
	 */
	XMLGregorianCalendar getFinCreneauReservation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUniteASS#getFinCreneauReservation <em>Fin Creneau Reservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin Creneau Reservation</em>' attribute.
	 * @see #getFinCreneauReservation()
	 * @generated
	 */
	void setFinCreneauReservation(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Intervalle Entre Missions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intervalle Entre Missions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intervalle Entre Missions</em>' containment reference.
	 * @see #setIntervalleEntreMissions(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypeUniteASS_IntervalleEntreMissions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IntervalleEntreMissions'"
	 * @generated
	 */
	TypeDataTypeDuree getIntervalleEntreMissions();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUniteASS#getIntervalleEntreMissions <em>Intervalle Entre Missions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intervalle Entre Missions</em>' containment reference.
	 * @see #getIntervalleEntreMissions()
	 * @generated
	 */
	void setIntervalleEntreMissions(TypeDataTypeDuree value);

	/**
	 * Returns the value of the '<em><b>Observation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observation</em>' attribute.
	 * @see #isSetObservation()
	 * @see #unsetObservation()
	 * @see #setObservation(long)
	 * @see mpia.schema.SchemaPackage#getTypeUniteASS_Observation()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='Observation'"
	 * @generated
	 */
	long getObservation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUniteASS#getObservation <em>Observation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observation</em>' attribute.
	 * @see #isSetObservation()
	 * @see #unsetObservation()
	 * @see #getObservation()
	 * @generated
	 */
	void setObservation(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeUniteASS#getObservation <em>Observation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetObservation()
	 * @see #getObservation()
	 * @see #setObservation(long)
	 * @generated
	 */
	void unsetObservation();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeUniteASS#getObservation <em>Observation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Observation</em>' attribute is set.
	 * @see #unsetObservation()
	 * @see #getObservation()
	 * @see #setObservation(long)
	 * @generated
	 */
	boolean isSetObservation();

	/**
	 * Returns the value of the '<em><b>Portee Min</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portee Min</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portee Min</em>' containment reference.
	 * @see #setPorteeMin(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeUniteASS_PorteeMin()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PorteeMin'"
	 * @generated
	 */
	TypeDataTypeLongueur getPorteeMin();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUniteASS#getPorteeMin <em>Portee Min</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portee Min</em>' containment reference.
	 * @see #getPorteeMin()
	 * @generated
	 */
	void setPorteeMin(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Statut PDF</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoUniteASSStatutPDF}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statut PDF</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statut PDF</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoUniteASSStatutPDF
	 * @see #isSetStatutPDF()
	 * @see #unsetStatutPDF()
	 * @see #setStatutPDF(TypeDictionaryDicoUniteASSStatutPDF)
	 * @see mpia.schema.SchemaPackage#getTypeUniteASS_StatutPDF()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='StatutPDF'"
	 * @generated
	 */
	TypeDictionaryDicoUniteASSStatutPDF getStatutPDF();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUniteASS#getStatutPDF <em>Statut PDF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statut PDF</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoUniteASSStatutPDF
	 * @see #isSetStatutPDF()
	 * @see #unsetStatutPDF()
	 * @see #getStatutPDF()
	 * @generated
	 */
	void setStatutPDF(TypeDictionaryDicoUniteASSStatutPDF value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeUniteASS#getStatutPDF <em>Statut PDF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStatutPDF()
	 * @see #getStatutPDF()
	 * @see #setStatutPDF(TypeDictionaryDicoUniteASSStatutPDF)
	 * @generated
	 */
	void unsetStatutPDF();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeUniteASS#getStatutPDF <em>Statut PDF</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Statut PDF</em>' attribute is set.
	 * @see #unsetStatutPDF()
	 * @see #getStatutPDF()
	 * @see #setStatutPDF(TypeDictionaryDicoUniteASSStatutPDF)
	 * @generated
	 */
	boolean isSetStatutPDF();

	/**
	 * Returns the value of the '<em><b>RATAC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RATAC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RATAC</em>' attribute.
	 * @see #isSetRATAC()
	 * @see #unsetRATAC()
	 * @see #setRATAC(long)
	 * @see mpia.schema.SchemaPackage#getTypeUniteASS_RATAC()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='RATAC'"
	 * @generated
	 */
	long getRATAC();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUniteASS#getRATAC <em>RATAC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RATAC</em>' attribute.
	 * @see #isSetRATAC()
	 * @see #unsetRATAC()
	 * @see #getRATAC()
	 * @generated
	 */
	void setRATAC(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeUniteASS#getRATAC <em>RATAC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRATAC()
	 * @see #getRATAC()
	 * @see #setRATAC(long)
	 * @generated
	 */
	void unsetRATAC();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeUniteASS#getRATAC <em>RATAC</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>RATAC</em>' attribute is set.
	 * @see #unsetRATAC()
	 * @see #getRATAC()
	 * @see #setRATAC(long)
	 * @generated
	 */
	boolean isSetRATAC();

	/**
	 * Returns the value of the '<em><b>GD Hliberation Plan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GD Hliberation Plan</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GD Hliberation Plan</em>' attribute.
	 * @see #setGDHliberationPlan(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeUniteASS_GDHliberationPlan()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='GDHliberationPlan'"
	 * @generated
	 */
	XMLGregorianCalendar getGDHliberationPlan();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUniteASS#getGDHliberationPlan <em>GD Hliberation Plan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GD Hliberation Plan</em>' attribute.
	 * @see #getGDHliberationPlan()
	 * @generated
	 */
	void setGDHliberationPlan(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Nombre Pieces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Pieces</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Pieces</em>' attribute.
	 * @see #isSetNombrePieces()
	 * @see #unsetNombrePieces()
	 * @see #setNombrePieces(long)
	 * @see mpia.schema.SchemaPackage#getTypeUniteASS_NombrePieces()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NombrePieces'"
	 * @generated
	 */
	long getNombrePieces();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUniteASS#getNombrePieces <em>Nombre Pieces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Pieces</em>' attribute.
	 * @see #isSetNombrePieces()
	 * @see #unsetNombrePieces()
	 * @see #getNombrePieces()
	 * @generated
	 */
	void setNombrePieces(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeUniteASS#getNombrePieces <em>Nombre Pieces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombrePieces()
	 * @see #getNombrePieces()
	 * @see #setNombrePieces(long)
	 * @generated
	 */
	void unsetNombrePieces();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeUniteASS#getNombrePieces <em>Nombre Pieces</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Pieces</em>' attribute is set.
	 * @see #unsetNombrePieces()
	 * @see #getNombrePieces()
	 * @see #setNombrePieces(long)
	 * @generated
	 */
	boolean isSetNombrePieces();

	/**
	 * Returns the value of the '<em><b>Portee Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portee Max</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portee Max</em>' containment reference.
	 * @see #setPorteeMax(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeUniteASS_PorteeMax()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PorteeMax'"
	 * @generated
	 */
	TypeDataTypeLongueur getPorteeMax();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUniteASS#getPorteeMax <em>Portee Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portee Max</em>' containment reference.
	 * @see #getPorteeMax()
	 * @generated
	 */
	void setPorteeMax(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Identification ASCA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identification ASCA</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identification ASCA</em>' attribute.
	 * @see #setIdentificationASCA(String)
	 * @see mpia.schema.SchemaPackage#getTypeUniteASS_IdentificationASCA()
	 * @model dataType="mpia.meta.TypeDataTypeChaine015"
	 *        extendedMetaData="kind='element' name='IdentificationASCA'"
	 * @generated
	 */
	String getIdentificationASCA();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUniteASS#getIdentificationASCA <em>Identification ASCA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identification ASCA</em>' attribute.
	 * @see #getIdentificationASCA()
	 * @generated
	 */
	void setIdentificationASCA(String value);

	/**
	 * Returns the value of the '<em><b>Restrictions Et Contraintes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restrictions Et Contraintes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restrictions Et Contraintes</em>' attribute.
	 * @see #setRestrictionsEtContraintes(String)
	 * @see mpia.schema.SchemaPackage#getTypeUniteASS_RestrictionsEtContraintes()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='RestrictionsEtContraintes'"
	 * @generated
	 */
	String getRestrictionsEtContraintes();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUniteASS#getRestrictionsEtContraintes <em>Restrictions Et Contraintes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restrictions Et Contraintes</em>' attribute.
	 * @see #getRestrictionsEtContraintes()
	 * @generated
	 */
	void setRestrictionsEtContraintes(String value);

	/**
	 * Returns the value of the '<em><b>APour Capacites Observation Capacite Observation ASS</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeCapaciteObservationASS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Capacites Observation Capacite Observation ASS</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Capacites Observation Capacite Observation ASS</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUniteASS_APourCapacitesObservationCapaciteObservationASS()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_CapaciteObservationASS'"
	 *        extendedMetaData="kind='element' name='APourCapacitesObservation_CapaciteObservationASS'"
	 * @generated
	 */
	EList<TypeCapaciteObservationASS> getAPourCapacitesObservationCapaciteObservationASS();

	/**
	 * Returns the value of the '<em><b>AEmis CRactivite CRactivite ASS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AEmis CRactivite CRactivite ASS</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AEmis CRactivite CRactivite ASS</em>' containment reference.
	 * @see #setAEmisCRactiviteCRactiviteASS(TypeCRactiviteASS)
	 * @see mpia.schema.SchemaPackage#getTypeUniteASS_AEmisCRactiviteCRactiviteASS()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_CRactiviteASS'"
	 *        extendedMetaData="kind='element' name='AEmisCRactivite_CRactiviteASS'"
	 * @generated
	 */
	TypeCRactiviteASS getAEmisCRactiviteCRactiviteASS();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUniteASS#getAEmisCRactiviteCRactiviteASS <em>AEmis CRactivite CRactivite ASS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AEmis CRactivite CRactivite ASS</em>' containment reference.
	 * @see #getAEmisCRactiviteCRactiviteASS()
	 * @generated
	 */
	void setAEmisCRactiviteCRactiviteASS(TypeCRactiviteASS value);

	/**
	 * Returns the value of the '<em><b>Dispose A1 Heure Volume Munitions ASS</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeVolumeMunitionsASS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dispose A1 Heure Volume Munitions ASS</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dispose A1 Heure Volume Munitions ASS</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUniteASS_DisposeA1HeureVolumeMunitionsASS()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_VolumeMunitionsASS'"
	 *        extendedMetaData="kind='element' name='DisposeA1Heure_VolumeMunitionsASS'"
	 * @generated
	 */
	EList<TypeVolumeMunitionsASS> getDisposeA1HeureVolumeMunitionsASS();

	/**
	 * Returns the value of the '<em><b>AEn Mouvement Volume Munitions ASS</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeVolumeMunitionsASS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AEn Mouvement Volume Munitions ASS</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AEn Mouvement Volume Munitions ASS</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUniteASS_AEnMouvementVolumeMunitionsASS()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_VolumeMunitionsASS'"
	 *        extendedMetaData="kind='element' name='AEnMouvement_VolumeMunitionsASS'"
	 * @generated
	 */
	EList<TypeVolumeMunitionsASS> getAEnMouvementVolumeMunitionsASS();

	/**
	 * Returns the value of the '<em><b>Dispose A2 Heures Volume Munitions ASS</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeVolumeMunitionsASS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dispose A2 Heures Volume Munitions ASS</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dispose A2 Heures Volume Munitions ASS</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUniteASS_DisposeA2HeuresVolumeMunitionsASS()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_VolumeMunitionsASS'"
	 *        extendedMetaData="kind='element' name='DisposeA2Heures_VolumeMunitionsASS'"
	 * @generated
	 */
	EList<TypeVolumeMunitionsASS> getDisposeA2HeuresVolumeMunitionsASS();

} // TypeUniteASS
