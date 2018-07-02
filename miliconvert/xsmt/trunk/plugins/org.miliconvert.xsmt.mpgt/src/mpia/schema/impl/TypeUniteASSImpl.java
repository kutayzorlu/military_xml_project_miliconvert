/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeDataTypeAngle;
import mpia.meta.TypeDataTypeDuree;
import mpia.meta.TypeDataTypeLongueur;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCRactiviteASS;
import mpia.schema.TypeCapaciteObservationASS;
import mpia.schema.TypeDictionaryDicoUniteASSStatutPDF;
import mpia.schema.TypeUniteASS;
import mpia.schema.TypeVolumeMunitionsASS;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Unite ASS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeUniteASSImpl#getCadence <em>Cadence</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteASSImpl#getDebattement <em>Debattement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteASSImpl#getDebutCreneauReservation <em>Debut Creneau Reservation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteASSImpl#getFinCreneauReservation <em>Fin Creneau Reservation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteASSImpl#getIntervalleEntreMissions <em>Intervalle Entre Missions</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteASSImpl#getObservation <em>Observation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteASSImpl#getPorteeMin <em>Portee Min</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteASSImpl#getStatutPDF <em>Statut PDF</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteASSImpl#getRATAC <em>RATAC</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteASSImpl#getGDHliberationPlan <em>GD Hliberation Plan</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteASSImpl#getNombrePieces <em>Nombre Pieces</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteASSImpl#getPorteeMax <em>Portee Max</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteASSImpl#getIdentificationASCA <em>Identification ASCA</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteASSImpl#getRestrictionsEtContraintes <em>Restrictions Et Contraintes</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteASSImpl#getAPourCapacitesObservationCapaciteObservationASS <em>APour Capacites Observation Capacite Observation ASS</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteASSImpl#getAEmisCRactiviteCRactiviteASS <em>AEmis CRactivite CRactivite ASS</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteASSImpl#getDisposeA1HeureVolumeMunitionsASS <em>Dispose A1 Heure Volume Munitions ASS</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteASSImpl#getAEnMouvementVolumeMunitionsASS <em>AEn Mouvement Volume Munitions ASS</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteASSImpl#getDisposeA2HeuresVolumeMunitionsASS <em>Dispose A2 Heures Volume Munitions ASS</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeUniteASSImpl extends EObjectImpl implements TypeUniteASS {
	/**
	 * The default value of the '{@link #getCadence() <em>Cadence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCadence()
	 * @generated
	 * @ordered
	 */
	protected static final long CADENCE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getCadence() <em>Cadence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCadence()
	 * @generated
	 * @ordered
	 */
	protected long cadence = CADENCE_EDEFAULT;

	/**
	 * This is true if the Cadence attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cadenceESet;

	/**
	 * The cached value of the '{@link #getDebattement() <em>Debattement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebattement()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeAngle debattement;

	/**
	 * The default value of the '{@link #getDebutCreneauReservation() <em>Debut Creneau Reservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebutCreneauReservation()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DEBUT_CRENEAU_RESERVATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDebutCreneauReservation() <em>Debut Creneau Reservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebutCreneauReservation()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar debutCreneauReservation = DEBUT_CRENEAU_RESERVATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinCreneauReservation() <em>Fin Creneau Reservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinCreneauReservation()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar FIN_CRENEAU_RESERVATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFinCreneauReservation() <em>Fin Creneau Reservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinCreneauReservation()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar finCreneauReservation = FIN_CRENEAU_RESERVATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIntervalleEntreMissions() <em>Intervalle Entre Missions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalleEntreMissions()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree intervalleEntreMissions;

	/**
	 * The default value of the '{@link #getObservation() <em>Observation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservation()
	 * @generated
	 * @ordered
	 */
	protected static final long OBSERVATION_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getObservation() <em>Observation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservation()
	 * @generated
	 * @ordered
	 */
	protected long observation = OBSERVATION_EDEFAULT;

	/**
	 * This is true if the Observation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean observationESet;

	/**
	 * The cached value of the '{@link #getPorteeMin() <em>Portee Min</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorteeMin()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur porteeMin;

	/**
	 * The default value of the '{@link #getStatutPDF() <em>Statut PDF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatutPDF()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoUniteASSStatutPDF STATUT_PDF_EDEFAULT = TypeDictionaryDicoUniteASSStatutPDF.PROP;

	/**
	 * The cached value of the '{@link #getStatutPDF() <em>Statut PDF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatutPDF()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoUniteASSStatutPDF statutPDF = STATUT_PDF_EDEFAULT;

	/**
	 * This is true if the Statut PDF attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean statutPDFESet;

	/**
	 * The default value of the '{@link #getRATAC() <em>RATAC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRATAC()
	 * @generated
	 * @ordered
	 */
	protected static final long RATAC_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getRATAC() <em>RATAC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRATAC()
	 * @generated
	 * @ordered
	 */
	protected long rATAC = RATAC_EDEFAULT;

	/**
	 * This is true if the RATAC attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rATACESet;

	/**
	 * The default value of the '{@link #getGDHliberationPlan() <em>GD Hliberation Plan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHliberationPlan()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GD_HLIBERATION_PLAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGDHliberationPlan() <em>GD Hliberation Plan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHliberationPlan()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gDHliberationPlan = GD_HLIBERATION_PLAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getNombrePieces() <em>Nombre Pieces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombrePieces()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_PIECES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombrePieces() <em>Nombre Pieces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombrePieces()
	 * @generated
	 * @ordered
	 */
	protected long nombrePieces = NOMBRE_PIECES_EDEFAULT;

	/**
	 * This is true if the Nombre Pieces attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombrePiecesESet;

	/**
	 * The cached value of the '{@link #getPorteeMax() <em>Portee Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorteeMax()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur porteeMax;

	/**
	 * The default value of the '{@link #getIdentificationASCA() <em>Identification ASCA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentificationASCA()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFICATION_ASCA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentificationASCA() <em>Identification ASCA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentificationASCA()
	 * @generated
	 * @ordered
	 */
	protected String identificationASCA = IDENTIFICATION_ASCA_EDEFAULT;

	/**
	 * The default value of the '{@link #getRestrictionsEtContraintes() <em>Restrictions Et Contraintes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestrictionsEtContraintes()
	 * @generated
	 * @ordered
	 */
	protected static final String RESTRICTIONS_ET_CONTRAINTES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRestrictionsEtContraintes() <em>Restrictions Et Contraintes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestrictionsEtContraintes()
	 * @generated
	 * @ordered
	 */
	protected String restrictionsEtContraintes = RESTRICTIONS_ET_CONTRAINTES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAPourCapacitesObservationCapaciteObservationASS() <em>APour Capacites Observation Capacite Observation ASS</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourCapacitesObservationCapaciteObservationASS()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeCapaciteObservationASS> aPourCapacitesObservationCapaciteObservationASS;

	/**
	 * The cached value of the '{@link #getAEmisCRactiviteCRactiviteASS() <em>AEmis CRactivite CRactivite ASS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAEmisCRactiviteCRactiviteASS()
	 * @generated
	 * @ordered
	 */
	protected TypeCRactiviteASS aEmisCRactiviteCRactiviteASS;

	/**
	 * The cached value of the '{@link #getDisposeA1HeureVolumeMunitionsASS() <em>Dispose A1 Heure Volume Munitions ASS</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisposeA1HeureVolumeMunitionsASS()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeVolumeMunitionsASS> disposeA1HeureVolumeMunitionsASS;

	/**
	 * The cached value of the '{@link #getAEnMouvementVolumeMunitionsASS() <em>AEn Mouvement Volume Munitions ASS</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAEnMouvementVolumeMunitionsASS()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeVolumeMunitionsASS> aEnMouvementVolumeMunitionsASS;

	/**
	 * The cached value of the '{@link #getDisposeA2HeuresVolumeMunitionsASS() <em>Dispose A2 Heures Volume Munitions ASS</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisposeA2HeuresVolumeMunitionsASS()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeVolumeMunitionsASS> disposeA2HeuresVolumeMunitionsASS;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeUniteASSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeUniteASS();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getCadence() {
		return cadence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCadence(long newCadence) {
		long oldCadence = cadence;
		cadence = newCadence;
		boolean oldCadenceESet = cadenceESet;
		cadenceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE_ASS__CADENCE, oldCadence, cadence, !oldCadenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCadence() {
		long oldCadence = cadence;
		boolean oldCadenceESet = cadenceESet;
		cadence = CADENCE_EDEFAULT;
		cadenceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_UNITE_ASS__CADENCE, oldCadence, CADENCE_EDEFAULT, oldCadenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCadence() {
		return cadenceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeAngle getDebattement() {
		return debattement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDebattement(TypeDataTypeAngle newDebattement, NotificationChain msgs) {
		TypeDataTypeAngle oldDebattement = debattement;
		debattement = newDebattement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE_ASS__DEBATTEMENT, oldDebattement, newDebattement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDebattement(TypeDataTypeAngle newDebattement) {
		if (newDebattement != debattement) {
			NotificationChain msgs = null;
			if (debattement != null)
				msgs = ((InternalEObject)debattement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_UNITE_ASS__DEBATTEMENT, null, msgs);
			if (newDebattement != null)
				msgs = ((InternalEObject)newDebattement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_UNITE_ASS__DEBATTEMENT, null, msgs);
			msgs = basicSetDebattement(newDebattement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE_ASS__DEBATTEMENT, newDebattement, newDebattement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDebutCreneauReservation() {
		return debutCreneauReservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDebutCreneauReservation(XMLGregorianCalendar newDebutCreneauReservation) {
		XMLGregorianCalendar oldDebutCreneauReservation = debutCreneauReservation;
		debutCreneauReservation = newDebutCreneauReservation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE_ASS__DEBUT_CRENEAU_RESERVATION, oldDebutCreneauReservation, debutCreneauReservation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getFinCreneauReservation() {
		return finCreneauReservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinCreneauReservation(XMLGregorianCalendar newFinCreneauReservation) {
		XMLGregorianCalendar oldFinCreneauReservation = finCreneauReservation;
		finCreneauReservation = newFinCreneauReservation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE_ASS__FIN_CRENEAU_RESERVATION, oldFinCreneauReservation, finCreneauReservation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getIntervalleEntreMissions() {
		return intervalleEntreMissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntervalleEntreMissions(TypeDataTypeDuree newIntervalleEntreMissions, NotificationChain msgs) {
		TypeDataTypeDuree oldIntervalleEntreMissions = intervalleEntreMissions;
		intervalleEntreMissions = newIntervalleEntreMissions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE_ASS__INTERVALLE_ENTRE_MISSIONS, oldIntervalleEntreMissions, newIntervalleEntreMissions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntervalleEntreMissions(TypeDataTypeDuree newIntervalleEntreMissions) {
		if (newIntervalleEntreMissions != intervalleEntreMissions) {
			NotificationChain msgs = null;
			if (intervalleEntreMissions != null)
				msgs = ((InternalEObject)intervalleEntreMissions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_UNITE_ASS__INTERVALLE_ENTRE_MISSIONS, null, msgs);
			if (newIntervalleEntreMissions != null)
				msgs = ((InternalEObject)newIntervalleEntreMissions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_UNITE_ASS__INTERVALLE_ENTRE_MISSIONS, null, msgs);
			msgs = basicSetIntervalleEntreMissions(newIntervalleEntreMissions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE_ASS__INTERVALLE_ENTRE_MISSIONS, newIntervalleEntreMissions, newIntervalleEntreMissions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getObservation() {
		return observation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObservation(long newObservation) {
		long oldObservation = observation;
		observation = newObservation;
		boolean oldObservationESet = observationESet;
		observationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE_ASS__OBSERVATION, oldObservation, observation, !oldObservationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetObservation() {
		long oldObservation = observation;
		boolean oldObservationESet = observationESet;
		observation = OBSERVATION_EDEFAULT;
		observationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_UNITE_ASS__OBSERVATION, oldObservation, OBSERVATION_EDEFAULT, oldObservationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetObservation() {
		return observationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getPorteeMin() {
		return porteeMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPorteeMin(TypeDataTypeLongueur newPorteeMin, NotificationChain msgs) {
		TypeDataTypeLongueur oldPorteeMin = porteeMin;
		porteeMin = newPorteeMin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE_ASS__PORTEE_MIN, oldPorteeMin, newPorteeMin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPorteeMin(TypeDataTypeLongueur newPorteeMin) {
		if (newPorteeMin != porteeMin) {
			NotificationChain msgs = null;
			if (porteeMin != null)
				msgs = ((InternalEObject)porteeMin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_UNITE_ASS__PORTEE_MIN, null, msgs);
			if (newPorteeMin != null)
				msgs = ((InternalEObject)newPorteeMin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_UNITE_ASS__PORTEE_MIN, null, msgs);
			msgs = basicSetPorteeMin(newPorteeMin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE_ASS__PORTEE_MIN, newPorteeMin, newPorteeMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoUniteASSStatutPDF getStatutPDF() {
		return statutPDF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatutPDF(TypeDictionaryDicoUniteASSStatutPDF newStatutPDF) {
		TypeDictionaryDicoUniteASSStatutPDF oldStatutPDF = statutPDF;
		statutPDF = newStatutPDF == null ? STATUT_PDF_EDEFAULT : newStatutPDF;
		boolean oldStatutPDFESet = statutPDFESet;
		statutPDFESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE_ASS__STATUT_PDF, oldStatutPDF, statutPDF, !oldStatutPDFESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStatutPDF() {
		TypeDictionaryDicoUniteASSStatutPDF oldStatutPDF = statutPDF;
		boolean oldStatutPDFESet = statutPDFESet;
		statutPDF = STATUT_PDF_EDEFAULT;
		statutPDFESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_UNITE_ASS__STATUT_PDF, oldStatutPDF, STATUT_PDF_EDEFAULT, oldStatutPDFESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStatutPDF() {
		return statutPDFESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getRATAC() {
		return rATAC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRATAC(long newRATAC) {
		long oldRATAC = rATAC;
		rATAC = newRATAC;
		boolean oldRATACESet = rATACESet;
		rATACESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE_ASS__RATAC, oldRATAC, rATAC, !oldRATACESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRATAC() {
		long oldRATAC = rATAC;
		boolean oldRATACESet = rATACESet;
		rATAC = RATAC_EDEFAULT;
		rATACESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_UNITE_ASS__RATAC, oldRATAC, RATAC_EDEFAULT, oldRATACESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRATAC() {
		return rATACESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getGDHliberationPlan() {
		return gDHliberationPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGDHliberationPlan(XMLGregorianCalendar newGDHliberationPlan) {
		XMLGregorianCalendar oldGDHliberationPlan = gDHliberationPlan;
		gDHliberationPlan = newGDHliberationPlan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE_ASS__GD_HLIBERATION_PLAN, oldGDHliberationPlan, gDHliberationPlan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombrePieces() {
		return nombrePieces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombrePieces(long newNombrePieces) {
		long oldNombrePieces = nombrePieces;
		nombrePieces = newNombrePieces;
		boolean oldNombrePiecesESet = nombrePiecesESet;
		nombrePiecesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE_ASS__NOMBRE_PIECES, oldNombrePieces, nombrePieces, !oldNombrePiecesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombrePieces() {
		long oldNombrePieces = nombrePieces;
		boolean oldNombrePiecesESet = nombrePiecesESet;
		nombrePieces = NOMBRE_PIECES_EDEFAULT;
		nombrePiecesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_UNITE_ASS__NOMBRE_PIECES, oldNombrePieces, NOMBRE_PIECES_EDEFAULT, oldNombrePiecesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombrePieces() {
		return nombrePiecesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getPorteeMax() {
		return porteeMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPorteeMax(TypeDataTypeLongueur newPorteeMax, NotificationChain msgs) {
		TypeDataTypeLongueur oldPorteeMax = porteeMax;
		porteeMax = newPorteeMax;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE_ASS__PORTEE_MAX, oldPorteeMax, newPorteeMax);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPorteeMax(TypeDataTypeLongueur newPorteeMax) {
		if (newPorteeMax != porteeMax) {
			NotificationChain msgs = null;
			if (porteeMax != null)
				msgs = ((InternalEObject)porteeMax).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_UNITE_ASS__PORTEE_MAX, null, msgs);
			if (newPorteeMax != null)
				msgs = ((InternalEObject)newPorteeMax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_UNITE_ASS__PORTEE_MAX, null, msgs);
			msgs = basicSetPorteeMax(newPorteeMax, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE_ASS__PORTEE_MAX, newPorteeMax, newPorteeMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentificationASCA() {
		return identificationASCA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentificationASCA(String newIdentificationASCA) {
		String oldIdentificationASCA = identificationASCA;
		identificationASCA = newIdentificationASCA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE_ASS__IDENTIFICATION_ASCA, oldIdentificationASCA, identificationASCA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRestrictionsEtContraintes() {
		return restrictionsEtContraintes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRestrictionsEtContraintes(String newRestrictionsEtContraintes) {
		String oldRestrictionsEtContraintes = restrictionsEtContraintes;
		restrictionsEtContraintes = newRestrictionsEtContraintes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE_ASS__RESTRICTIONS_ET_CONTRAINTES, oldRestrictionsEtContraintes, restrictionsEtContraintes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeCapaciteObservationASS> getAPourCapacitesObservationCapaciteObservationASS() {
		if (aPourCapacitesObservationCapaciteObservationASS == null) {
			aPourCapacitesObservationCapaciteObservationASS = new EObjectContainmentEList<TypeCapaciteObservationASS>(TypeCapaciteObservationASS.class, this, SchemaPackage.TYPE_UNITE_ASS__APOUR_CAPACITES_OBSERVATION_CAPACITE_OBSERVATION_ASS);
		}
		return aPourCapacitesObservationCapaciteObservationASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeCRactiviteASS getAEmisCRactiviteCRactiviteASS() {
		return aEmisCRactiviteCRactiviteASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAEmisCRactiviteCRactiviteASS(TypeCRactiviteASS newAEmisCRactiviteCRactiviteASS, NotificationChain msgs) {
		TypeCRactiviteASS oldAEmisCRactiviteCRactiviteASS = aEmisCRactiviteCRactiviteASS;
		aEmisCRactiviteCRactiviteASS = newAEmisCRactiviteCRactiviteASS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE_ASS__AEMIS_CRACTIVITE_CRACTIVITE_ASS, oldAEmisCRactiviteCRactiviteASS, newAEmisCRactiviteCRactiviteASS);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAEmisCRactiviteCRactiviteASS(TypeCRactiviteASS newAEmisCRactiviteCRactiviteASS) {
		if (newAEmisCRactiviteCRactiviteASS != aEmisCRactiviteCRactiviteASS) {
			NotificationChain msgs = null;
			if (aEmisCRactiviteCRactiviteASS != null)
				msgs = ((InternalEObject)aEmisCRactiviteCRactiviteASS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_UNITE_ASS__AEMIS_CRACTIVITE_CRACTIVITE_ASS, null, msgs);
			if (newAEmisCRactiviteCRactiviteASS != null)
				msgs = ((InternalEObject)newAEmisCRactiviteCRactiviteASS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_UNITE_ASS__AEMIS_CRACTIVITE_CRACTIVITE_ASS, null, msgs);
			msgs = basicSetAEmisCRactiviteCRactiviteASS(newAEmisCRactiviteCRactiviteASS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE_ASS__AEMIS_CRACTIVITE_CRACTIVITE_ASS, newAEmisCRactiviteCRactiviteASS, newAEmisCRactiviteCRactiviteASS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeVolumeMunitionsASS> getDisposeA1HeureVolumeMunitionsASS() {
		if (disposeA1HeureVolumeMunitionsASS == null) {
			disposeA1HeureVolumeMunitionsASS = new EObjectContainmentEList<TypeVolumeMunitionsASS>(TypeVolumeMunitionsASS.class, this, SchemaPackage.TYPE_UNITE_ASS__DISPOSE_A1_HEURE_VOLUME_MUNITIONS_ASS);
		}
		return disposeA1HeureVolumeMunitionsASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeVolumeMunitionsASS> getAEnMouvementVolumeMunitionsASS() {
		if (aEnMouvementVolumeMunitionsASS == null) {
			aEnMouvementVolumeMunitionsASS = new EObjectContainmentEList<TypeVolumeMunitionsASS>(TypeVolumeMunitionsASS.class, this, SchemaPackage.TYPE_UNITE_ASS__AEN_MOUVEMENT_VOLUME_MUNITIONS_ASS);
		}
		return aEnMouvementVolumeMunitionsASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeVolumeMunitionsASS> getDisposeA2HeuresVolumeMunitionsASS() {
		if (disposeA2HeuresVolumeMunitionsASS == null) {
			disposeA2HeuresVolumeMunitionsASS = new EObjectContainmentEList<TypeVolumeMunitionsASS>(TypeVolumeMunitionsASS.class, this, SchemaPackage.TYPE_UNITE_ASS__DISPOSE_A2_HEURES_VOLUME_MUNITIONS_ASS);
		}
		return disposeA2HeuresVolumeMunitionsASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_UNITE_ASS__DEBATTEMENT:
				return basicSetDebattement(null, msgs);
			case SchemaPackage.TYPE_UNITE_ASS__INTERVALLE_ENTRE_MISSIONS:
				return basicSetIntervalleEntreMissions(null, msgs);
			case SchemaPackage.TYPE_UNITE_ASS__PORTEE_MIN:
				return basicSetPorteeMin(null, msgs);
			case SchemaPackage.TYPE_UNITE_ASS__PORTEE_MAX:
				return basicSetPorteeMax(null, msgs);
			case SchemaPackage.TYPE_UNITE_ASS__APOUR_CAPACITES_OBSERVATION_CAPACITE_OBSERVATION_ASS:
				return ((InternalEList<?>)getAPourCapacitesObservationCapaciteObservationASS()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_UNITE_ASS__AEMIS_CRACTIVITE_CRACTIVITE_ASS:
				return basicSetAEmisCRactiviteCRactiviteASS(null, msgs);
			case SchemaPackage.TYPE_UNITE_ASS__DISPOSE_A1_HEURE_VOLUME_MUNITIONS_ASS:
				return ((InternalEList<?>)getDisposeA1HeureVolumeMunitionsASS()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_UNITE_ASS__AEN_MOUVEMENT_VOLUME_MUNITIONS_ASS:
				return ((InternalEList<?>)getAEnMouvementVolumeMunitionsASS()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_UNITE_ASS__DISPOSE_A2_HEURES_VOLUME_MUNITIONS_ASS:
				return ((InternalEList<?>)getDisposeA2HeuresVolumeMunitionsASS()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_UNITE_ASS__CADENCE:
				return new Long(getCadence());
			case SchemaPackage.TYPE_UNITE_ASS__DEBATTEMENT:
				return getDebattement();
			case SchemaPackage.TYPE_UNITE_ASS__DEBUT_CRENEAU_RESERVATION:
				return getDebutCreneauReservation();
			case SchemaPackage.TYPE_UNITE_ASS__FIN_CRENEAU_RESERVATION:
				return getFinCreneauReservation();
			case SchemaPackage.TYPE_UNITE_ASS__INTERVALLE_ENTRE_MISSIONS:
				return getIntervalleEntreMissions();
			case SchemaPackage.TYPE_UNITE_ASS__OBSERVATION:
				return new Long(getObservation());
			case SchemaPackage.TYPE_UNITE_ASS__PORTEE_MIN:
				return getPorteeMin();
			case SchemaPackage.TYPE_UNITE_ASS__STATUT_PDF:
				return getStatutPDF();
			case SchemaPackage.TYPE_UNITE_ASS__RATAC:
				return new Long(getRATAC());
			case SchemaPackage.TYPE_UNITE_ASS__GD_HLIBERATION_PLAN:
				return getGDHliberationPlan();
			case SchemaPackage.TYPE_UNITE_ASS__NOMBRE_PIECES:
				return new Long(getNombrePieces());
			case SchemaPackage.TYPE_UNITE_ASS__PORTEE_MAX:
				return getPorteeMax();
			case SchemaPackage.TYPE_UNITE_ASS__IDENTIFICATION_ASCA:
				return getIdentificationASCA();
			case SchemaPackage.TYPE_UNITE_ASS__RESTRICTIONS_ET_CONTRAINTES:
				return getRestrictionsEtContraintes();
			case SchemaPackage.TYPE_UNITE_ASS__APOUR_CAPACITES_OBSERVATION_CAPACITE_OBSERVATION_ASS:
				return getAPourCapacitesObservationCapaciteObservationASS();
			case SchemaPackage.TYPE_UNITE_ASS__AEMIS_CRACTIVITE_CRACTIVITE_ASS:
				return getAEmisCRactiviteCRactiviteASS();
			case SchemaPackage.TYPE_UNITE_ASS__DISPOSE_A1_HEURE_VOLUME_MUNITIONS_ASS:
				return getDisposeA1HeureVolumeMunitionsASS();
			case SchemaPackage.TYPE_UNITE_ASS__AEN_MOUVEMENT_VOLUME_MUNITIONS_ASS:
				return getAEnMouvementVolumeMunitionsASS();
			case SchemaPackage.TYPE_UNITE_ASS__DISPOSE_A2_HEURES_VOLUME_MUNITIONS_ASS:
				return getDisposeA2HeuresVolumeMunitionsASS();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SchemaPackage.TYPE_UNITE_ASS__CADENCE:
				setCadence(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_UNITE_ASS__DEBATTEMENT:
				setDebattement((TypeDataTypeAngle)newValue);
				return;
			case SchemaPackage.TYPE_UNITE_ASS__DEBUT_CRENEAU_RESERVATION:
				setDebutCreneauReservation((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_UNITE_ASS__FIN_CRENEAU_RESERVATION:
				setFinCreneauReservation((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_UNITE_ASS__INTERVALLE_ENTRE_MISSIONS:
				setIntervalleEntreMissions((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_UNITE_ASS__OBSERVATION:
				setObservation(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_UNITE_ASS__PORTEE_MIN:
				setPorteeMin((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_UNITE_ASS__STATUT_PDF:
				setStatutPDF((TypeDictionaryDicoUniteASSStatutPDF)newValue);
				return;
			case SchemaPackage.TYPE_UNITE_ASS__RATAC:
				setRATAC(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_UNITE_ASS__GD_HLIBERATION_PLAN:
				setGDHliberationPlan((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_UNITE_ASS__NOMBRE_PIECES:
				setNombrePieces(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_UNITE_ASS__PORTEE_MAX:
				setPorteeMax((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_UNITE_ASS__IDENTIFICATION_ASCA:
				setIdentificationASCA((String)newValue);
				return;
			case SchemaPackage.TYPE_UNITE_ASS__RESTRICTIONS_ET_CONTRAINTES:
				setRestrictionsEtContraintes((String)newValue);
				return;
			case SchemaPackage.TYPE_UNITE_ASS__APOUR_CAPACITES_OBSERVATION_CAPACITE_OBSERVATION_ASS:
				getAPourCapacitesObservationCapaciteObservationASS().clear();
				getAPourCapacitesObservationCapaciteObservationASS().addAll((Collection<? extends TypeCapaciteObservationASS>)newValue);
				return;
			case SchemaPackage.TYPE_UNITE_ASS__AEMIS_CRACTIVITE_CRACTIVITE_ASS:
				setAEmisCRactiviteCRactiviteASS((TypeCRactiviteASS)newValue);
				return;
			case SchemaPackage.TYPE_UNITE_ASS__DISPOSE_A1_HEURE_VOLUME_MUNITIONS_ASS:
				getDisposeA1HeureVolumeMunitionsASS().clear();
				getDisposeA1HeureVolumeMunitionsASS().addAll((Collection<? extends TypeVolumeMunitionsASS>)newValue);
				return;
			case SchemaPackage.TYPE_UNITE_ASS__AEN_MOUVEMENT_VOLUME_MUNITIONS_ASS:
				getAEnMouvementVolumeMunitionsASS().clear();
				getAEnMouvementVolumeMunitionsASS().addAll((Collection<? extends TypeVolumeMunitionsASS>)newValue);
				return;
			case SchemaPackage.TYPE_UNITE_ASS__DISPOSE_A2_HEURES_VOLUME_MUNITIONS_ASS:
				getDisposeA2HeuresVolumeMunitionsASS().clear();
				getDisposeA2HeuresVolumeMunitionsASS().addAll((Collection<? extends TypeVolumeMunitionsASS>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SchemaPackage.TYPE_UNITE_ASS__CADENCE:
				unsetCadence();
				return;
			case SchemaPackage.TYPE_UNITE_ASS__DEBATTEMENT:
				setDebattement((TypeDataTypeAngle)null);
				return;
			case SchemaPackage.TYPE_UNITE_ASS__DEBUT_CRENEAU_RESERVATION:
				setDebutCreneauReservation(DEBUT_CRENEAU_RESERVATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_UNITE_ASS__FIN_CRENEAU_RESERVATION:
				setFinCreneauReservation(FIN_CRENEAU_RESERVATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_UNITE_ASS__INTERVALLE_ENTRE_MISSIONS:
				setIntervalleEntreMissions((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_UNITE_ASS__OBSERVATION:
				unsetObservation();
				return;
			case SchemaPackage.TYPE_UNITE_ASS__PORTEE_MIN:
				setPorteeMin((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_UNITE_ASS__STATUT_PDF:
				unsetStatutPDF();
				return;
			case SchemaPackage.TYPE_UNITE_ASS__RATAC:
				unsetRATAC();
				return;
			case SchemaPackage.TYPE_UNITE_ASS__GD_HLIBERATION_PLAN:
				setGDHliberationPlan(GD_HLIBERATION_PLAN_EDEFAULT);
				return;
			case SchemaPackage.TYPE_UNITE_ASS__NOMBRE_PIECES:
				unsetNombrePieces();
				return;
			case SchemaPackage.TYPE_UNITE_ASS__PORTEE_MAX:
				setPorteeMax((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_UNITE_ASS__IDENTIFICATION_ASCA:
				setIdentificationASCA(IDENTIFICATION_ASCA_EDEFAULT);
				return;
			case SchemaPackage.TYPE_UNITE_ASS__RESTRICTIONS_ET_CONTRAINTES:
				setRestrictionsEtContraintes(RESTRICTIONS_ET_CONTRAINTES_EDEFAULT);
				return;
			case SchemaPackage.TYPE_UNITE_ASS__APOUR_CAPACITES_OBSERVATION_CAPACITE_OBSERVATION_ASS:
				getAPourCapacitesObservationCapaciteObservationASS().clear();
				return;
			case SchemaPackage.TYPE_UNITE_ASS__AEMIS_CRACTIVITE_CRACTIVITE_ASS:
				setAEmisCRactiviteCRactiviteASS((TypeCRactiviteASS)null);
				return;
			case SchemaPackage.TYPE_UNITE_ASS__DISPOSE_A1_HEURE_VOLUME_MUNITIONS_ASS:
				getDisposeA1HeureVolumeMunitionsASS().clear();
				return;
			case SchemaPackage.TYPE_UNITE_ASS__AEN_MOUVEMENT_VOLUME_MUNITIONS_ASS:
				getAEnMouvementVolumeMunitionsASS().clear();
				return;
			case SchemaPackage.TYPE_UNITE_ASS__DISPOSE_A2_HEURES_VOLUME_MUNITIONS_ASS:
				getDisposeA2HeuresVolumeMunitionsASS().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SchemaPackage.TYPE_UNITE_ASS__CADENCE:
				return isSetCadence();
			case SchemaPackage.TYPE_UNITE_ASS__DEBATTEMENT:
				return debattement != null;
			case SchemaPackage.TYPE_UNITE_ASS__DEBUT_CRENEAU_RESERVATION:
				return DEBUT_CRENEAU_RESERVATION_EDEFAULT == null ? debutCreneauReservation != null : !DEBUT_CRENEAU_RESERVATION_EDEFAULT.equals(debutCreneauReservation);
			case SchemaPackage.TYPE_UNITE_ASS__FIN_CRENEAU_RESERVATION:
				return FIN_CRENEAU_RESERVATION_EDEFAULT == null ? finCreneauReservation != null : !FIN_CRENEAU_RESERVATION_EDEFAULT.equals(finCreneauReservation);
			case SchemaPackage.TYPE_UNITE_ASS__INTERVALLE_ENTRE_MISSIONS:
				return intervalleEntreMissions != null;
			case SchemaPackage.TYPE_UNITE_ASS__OBSERVATION:
				return isSetObservation();
			case SchemaPackage.TYPE_UNITE_ASS__PORTEE_MIN:
				return porteeMin != null;
			case SchemaPackage.TYPE_UNITE_ASS__STATUT_PDF:
				return isSetStatutPDF();
			case SchemaPackage.TYPE_UNITE_ASS__RATAC:
				return isSetRATAC();
			case SchemaPackage.TYPE_UNITE_ASS__GD_HLIBERATION_PLAN:
				return GD_HLIBERATION_PLAN_EDEFAULT == null ? gDHliberationPlan != null : !GD_HLIBERATION_PLAN_EDEFAULT.equals(gDHliberationPlan);
			case SchemaPackage.TYPE_UNITE_ASS__NOMBRE_PIECES:
				return isSetNombrePieces();
			case SchemaPackage.TYPE_UNITE_ASS__PORTEE_MAX:
				return porteeMax != null;
			case SchemaPackage.TYPE_UNITE_ASS__IDENTIFICATION_ASCA:
				return IDENTIFICATION_ASCA_EDEFAULT == null ? identificationASCA != null : !IDENTIFICATION_ASCA_EDEFAULT.equals(identificationASCA);
			case SchemaPackage.TYPE_UNITE_ASS__RESTRICTIONS_ET_CONTRAINTES:
				return RESTRICTIONS_ET_CONTRAINTES_EDEFAULT == null ? restrictionsEtContraintes != null : !RESTRICTIONS_ET_CONTRAINTES_EDEFAULT.equals(restrictionsEtContraintes);
			case SchemaPackage.TYPE_UNITE_ASS__APOUR_CAPACITES_OBSERVATION_CAPACITE_OBSERVATION_ASS:
				return aPourCapacitesObservationCapaciteObservationASS != null && !aPourCapacitesObservationCapaciteObservationASS.isEmpty();
			case SchemaPackage.TYPE_UNITE_ASS__AEMIS_CRACTIVITE_CRACTIVITE_ASS:
				return aEmisCRactiviteCRactiviteASS != null;
			case SchemaPackage.TYPE_UNITE_ASS__DISPOSE_A1_HEURE_VOLUME_MUNITIONS_ASS:
				return disposeA1HeureVolumeMunitionsASS != null && !disposeA1HeureVolumeMunitionsASS.isEmpty();
			case SchemaPackage.TYPE_UNITE_ASS__AEN_MOUVEMENT_VOLUME_MUNITIONS_ASS:
				return aEnMouvementVolumeMunitionsASS != null && !aEnMouvementVolumeMunitionsASS.isEmpty();
			case SchemaPackage.TYPE_UNITE_ASS__DISPOSE_A2_HEURES_VOLUME_MUNITIONS_ASS:
				return disposeA2HeuresVolumeMunitionsASS != null && !disposeA2HeuresVolumeMunitionsASS.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (cadence: ");
		if (cadenceESet) result.append(cadence); else result.append("<unset>");
		result.append(", debutCreneauReservation: ");
		result.append(debutCreneauReservation);
		result.append(", finCreneauReservation: ");
		result.append(finCreneauReservation);
		result.append(", observation: ");
		if (observationESet) result.append(observation); else result.append("<unset>");
		result.append(", statutPDF: ");
		if (statutPDFESet) result.append(statutPDF); else result.append("<unset>");
		result.append(", rATAC: ");
		if (rATACESet) result.append(rATAC); else result.append("<unset>");
		result.append(", gDHliberationPlan: ");
		result.append(gDHliberationPlan);
		result.append(", nombrePieces: ");
		if (nombrePiecesESet) result.append(nombrePieces); else result.append("<unset>");
		result.append(", identificationASCA: ");
		result.append(identificationASCA);
		result.append(", restrictionsEtContraintes: ");
		result.append(restrictionsEtContraintes);
		result.append(')');
		return result.toString();
	}

} //TypeUniteASSImpl
