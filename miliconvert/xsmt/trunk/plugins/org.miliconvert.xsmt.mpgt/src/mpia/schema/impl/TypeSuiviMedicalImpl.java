/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeSuiviMedical;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Suivi Medical</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeSuiviMedicalImpl#getGDHBlessure <em>GDH Blessure</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSuiviMedicalImpl#getGDHPosteSecours <em>GDH Poste Secours</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSuiviMedicalImpl#getGDHRamassage <em>GDH Ramassage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSuiviMedicalImpl#isTriage <em>Triage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSuiviMedicalImpl#getGDHArriveeTriage <em>GDH Arrivee Triage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSuiviMedicalImpl#getTypeTriage <em>Type Triage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSuiviMedicalImpl#getTraitement <em>Traitement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSuiviMedicalImpl#getMoyenEvacuation <em>Moyen Evacuation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSuiviMedicalImpl#getGDHEvacuation <em>GDH Evacuation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSuiviMedicalImpl#getDestinationEvacuation <em>Destination Evacuation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSuiviMedicalImpl#getDateSituation <em>Date Situation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSuiviMedicalImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSuiviMedicalImpl#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeSuiviMedicalImpl extends EObjectImpl implements TypeSuiviMedical {
	/**
	 * The default value of the '{@link #getGDHBlessure() <em>GDH Blessure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHBlessure()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GDH_BLESSURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGDHBlessure() <em>GDH Blessure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHBlessure()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gDHBlessure = GDH_BLESSURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGDHPosteSecours() <em>GDH Poste Secours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHPosteSecours()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GDH_POSTE_SECOURS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGDHPosteSecours() <em>GDH Poste Secours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHPosteSecours()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gDHPosteSecours = GDH_POSTE_SECOURS_EDEFAULT;

	/**
	 * The default value of the '{@link #getGDHRamassage() <em>GDH Ramassage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHRamassage()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GDH_RAMASSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGDHRamassage() <em>GDH Ramassage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHRamassage()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gDHRamassage = GDH_RAMASSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #isTriage() <em>Triage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTriage()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRIAGE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTriage() <em>Triage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTriage()
	 * @generated
	 * @ordered
	 */
	protected boolean triage = TRIAGE_EDEFAULT;

	/**
	 * This is true if the Triage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean triageESet;

	/**
	 * The default value of the '{@link #getGDHArriveeTriage() <em>GDH Arrivee Triage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHArriveeTriage()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GDH_ARRIVEE_TRIAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGDHArriveeTriage() <em>GDH Arrivee Triage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHArriveeTriage()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gDHArriveeTriage = GDH_ARRIVEE_TRIAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeTriage() <em>Type Triage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeTriage()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_TRIAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeTriage() <em>Type Triage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeTriage()
	 * @generated
	 * @ordered
	 */
	protected String typeTriage = TYPE_TRIAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTraitement() <em>Traitement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraitement()
	 * @generated
	 * @ordered
	 */
	protected static final String TRAITEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTraitement() <em>Traitement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraitement()
	 * @generated
	 * @ordered
	 */
	protected String traitement = TRAITEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMoyenEvacuation() <em>Moyen Evacuation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyenEvacuation()
	 * @generated
	 * @ordered
	 */
	protected static final String MOYEN_EVACUATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMoyenEvacuation() <em>Moyen Evacuation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyenEvacuation()
	 * @generated
	 * @ordered
	 */
	protected String moyenEvacuation = MOYEN_EVACUATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getGDHEvacuation() <em>GDH Evacuation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHEvacuation()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GDH_EVACUATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGDHEvacuation() <em>GDH Evacuation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHEvacuation()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gDHEvacuation = GDH_EVACUATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestinationEvacuation() <em>Destination Evacuation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationEvacuation()
	 * @generated
	 * @ordered
	 */
	protected static final String DESTINATION_EVACUATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestinationEvacuation() <em>Destination Evacuation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationEvacuation()
	 * @generated
	 * @ordered
	 */
	protected String destinationEvacuation = DESTINATION_EVACUATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateSituation() <em>Date Situation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateSituation()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_SITUATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateSituation() <em>Date Situation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateSituation()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateSituation = DATE_SITUATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCTE() <em>CTE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCTE()
	 * @generated
	 * @ordered
	 */
	protected static final String CTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCTE() <em>CTE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCTE()
	 * @generated
	 * @ordered
	 */
	protected String cTE = CTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCE() <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCE()
	 * @generated
	 * @ordered
	 */
	protected static final String CE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCE() <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCE()
	 * @generated
	 * @ordered
	 */
	protected String cE = CE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeSuiviMedicalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeSuiviMedical();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getGDHBlessure() {
		return gDHBlessure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGDHBlessure(XMLGregorianCalendar newGDHBlessure) {
		XMLGregorianCalendar oldGDHBlessure = gDHBlessure;
		gDHBlessure = newGDHBlessure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SUIVI_MEDICAL__GDH_BLESSURE, oldGDHBlessure, gDHBlessure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getGDHPosteSecours() {
		return gDHPosteSecours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGDHPosteSecours(XMLGregorianCalendar newGDHPosteSecours) {
		XMLGregorianCalendar oldGDHPosteSecours = gDHPosteSecours;
		gDHPosteSecours = newGDHPosteSecours;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SUIVI_MEDICAL__GDH_POSTE_SECOURS, oldGDHPosteSecours, gDHPosteSecours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getGDHRamassage() {
		return gDHRamassage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGDHRamassage(XMLGregorianCalendar newGDHRamassage) {
		XMLGregorianCalendar oldGDHRamassage = gDHRamassage;
		gDHRamassage = newGDHRamassage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SUIVI_MEDICAL__GDH_RAMASSAGE, oldGDHRamassage, gDHRamassage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTriage() {
		return triage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriage(boolean newTriage) {
		boolean oldTriage = triage;
		triage = newTriage;
		boolean oldTriageESet = triageESet;
		triageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SUIVI_MEDICAL__TRIAGE, oldTriage, triage, !oldTriageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTriage() {
		boolean oldTriage = triage;
		boolean oldTriageESet = triageESet;
		triage = TRIAGE_EDEFAULT;
		triageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SUIVI_MEDICAL__TRIAGE, oldTriage, TRIAGE_EDEFAULT, oldTriageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTriage() {
		return triageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getGDHArriveeTriage() {
		return gDHArriveeTriage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGDHArriveeTriage(XMLGregorianCalendar newGDHArriveeTriage) {
		XMLGregorianCalendar oldGDHArriveeTriage = gDHArriveeTriage;
		gDHArriveeTriage = newGDHArriveeTriage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SUIVI_MEDICAL__GDH_ARRIVEE_TRIAGE, oldGDHArriveeTriage, gDHArriveeTriage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeTriage() {
		return typeTriage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeTriage(String newTypeTriage) {
		String oldTypeTriage = typeTriage;
		typeTriage = newTypeTriage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SUIVI_MEDICAL__TYPE_TRIAGE, oldTypeTriage, typeTriage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTraitement() {
		return traitement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraitement(String newTraitement) {
		String oldTraitement = traitement;
		traitement = newTraitement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SUIVI_MEDICAL__TRAITEMENT, oldTraitement, traitement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMoyenEvacuation() {
		return moyenEvacuation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoyenEvacuation(String newMoyenEvacuation) {
		String oldMoyenEvacuation = moyenEvacuation;
		moyenEvacuation = newMoyenEvacuation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SUIVI_MEDICAL__MOYEN_EVACUATION, oldMoyenEvacuation, moyenEvacuation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getGDHEvacuation() {
		return gDHEvacuation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGDHEvacuation(XMLGregorianCalendar newGDHEvacuation) {
		XMLGregorianCalendar oldGDHEvacuation = gDHEvacuation;
		gDHEvacuation = newGDHEvacuation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SUIVI_MEDICAL__GDH_EVACUATION, oldGDHEvacuation, gDHEvacuation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDestinationEvacuation() {
		return destinationEvacuation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestinationEvacuation(String newDestinationEvacuation) {
		String oldDestinationEvacuation = destinationEvacuation;
		destinationEvacuation = newDestinationEvacuation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SUIVI_MEDICAL__DESTINATION_EVACUATION, oldDestinationEvacuation, destinationEvacuation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateSituation() {
		return dateSituation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateSituation(XMLGregorianCalendar newDateSituation) {
		XMLGregorianCalendar oldDateSituation = dateSituation;
		dateSituation = newDateSituation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SUIVI_MEDICAL__DATE_SITUATION, oldDateSituation, dateSituation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCTE() {
		return cTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCTE(String newCTE) {
		String oldCTE = cTE;
		cTE = newCTE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SUIVI_MEDICAL__CTE, oldCTE, cTE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCE() {
		return cE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCE(String newCE) {
		String oldCE = cE;
		cE = newCE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SUIVI_MEDICAL__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_SUIVI_MEDICAL__GDH_BLESSURE:
				return getGDHBlessure();
			case SchemaPackage.TYPE_SUIVI_MEDICAL__GDH_POSTE_SECOURS:
				return getGDHPosteSecours();
			case SchemaPackage.TYPE_SUIVI_MEDICAL__GDH_RAMASSAGE:
				return getGDHRamassage();
			case SchemaPackage.TYPE_SUIVI_MEDICAL__TRIAGE:
				return isTriage() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_SUIVI_MEDICAL__GDH_ARRIVEE_TRIAGE:
				return getGDHArriveeTriage();
			case SchemaPackage.TYPE_SUIVI_MEDICAL__TYPE_TRIAGE:
				return getTypeTriage();
			case SchemaPackage.TYPE_SUIVI_MEDICAL__TRAITEMENT:
				return getTraitement();
			case SchemaPackage.TYPE_SUIVI_MEDICAL__MOYEN_EVACUATION:
				return getMoyenEvacuation();
			case SchemaPackage.TYPE_SUIVI_MEDICAL__GDH_EVACUATION:
				return getGDHEvacuation();
			case SchemaPackage.TYPE_SUIVI_MEDICAL__DESTINATION_EVACUATION:
				return getDestinationEvacuation();
			case SchemaPackage.TYPE_SUIVI_MEDICAL__DATE_SITUATION:
				return getDateSituation();
			case SchemaPackage.TYPE_SUIVI_MEDICAL__CTE:
				return getCTE();
			case SchemaPackage.TYPE_SUIVI_MEDICAL__CE:
				return getCE();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SchemaPackage.TYPE_SUIVI_MEDICAL__GDH_BLESSURE:
				setGDHBlessure((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_SUIVI_MEDICAL__GDH_POSTE_SECOURS:
				setGDHPosteSecours((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_SUIVI_MEDICAL__GDH_RAMASSAGE:
				setGDHRamassage((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_SUIVI_MEDICAL__TRIAGE:
				setTriage(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_SUIVI_MEDICAL__GDH_ARRIVEE_TRIAGE:
				setGDHArriveeTriage((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_SUIVI_MEDICAL__TYPE_TRIAGE:
				setTypeTriage((String)newValue);
				return;
			case SchemaPackage.TYPE_SUIVI_MEDICAL__TRAITEMENT:
				setTraitement((String)newValue);
				return;
			case SchemaPackage.TYPE_SUIVI_MEDICAL__MOYEN_EVACUATION:
				setMoyenEvacuation((String)newValue);
				return;
			case SchemaPackage.TYPE_SUIVI_MEDICAL__GDH_EVACUATION:
				setGDHEvacuation((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_SUIVI_MEDICAL__DESTINATION_EVACUATION:
				setDestinationEvacuation((String)newValue);
				return;
			case SchemaPackage.TYPE_SUIVI_MEDICAL__DATE_SITUATION:
				setDateSituation((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_SUIVI_MEDICAL__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_SUIVI_MEDICAL__CE:
				setCE((String)newValue);
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
			case SchemaPackage.TYPE_SUIVI_MEDICAL__GDH_BLESSURE:
				setGDHBlessure(GDH_BLESSURE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SUIVI_MEDICAL__GDH_POSTE_SECOURS:
				setGDHPosteSecours(GDH_POSTE_SECOURS_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SUIVI_MEDICAL__GDH_RAMASSAGE:
				setGDHRamassage(GDH_RAMASSAGE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SUIVI_MEDICAL__TRIAGE:
				unsetTriage();
				return;
			case SchemaPackage.TYPE_SUIVI_MEDICAL__GDH_ARRIVEE_TRIAGE:
				setGDHArriveeTriage(GDH_ARRIVEE_TRIAGE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SUIVI_MEDICAL__TYPE_TRIAGE:
				setTypeTriage(TYPE_TRIAGE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SUIVI_MEDICAL__TRAITEMENT:
				setTraitement(TRAITEMENT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SUIVI_MEDICAL__MOYEN_EVACUATION:
				setMoyenEvacuation(MOYEN_EVACUATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SUIVI_MEDICAL__GDH_EVACUATION:
				setGDHEvacuation(GDH_EVACUATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SUIVI_MEDICAL__DESTINATION_EVACUATION:
				setDestinationEvacuation(DESTINATION_EVACUATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SUIVI_MEDICAL__DATE_SITUATION:
				setDateSituation(DATE_SITUATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SUIVI_MEDICAL__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SUIVI_MEDICAL__CE:
				setCE(CE_EDEFAULT);
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
			case SchemaPackage.TYPE_SUIVI_MEDICAL__GDH_BLESSURE:
				return GDH_BLESSURE_EDEFAULT == null ? gDHBlessure != null : !GDH_BLESSURE_EDEFAULT.equals(gDHBlessure);
			case SchemaPackage.TYPE_SUIVI_MEDICAL__GDH_POSTE_SECOURS:
				return GDH_POSTE_SECOURS_EDEFAULT == null ? gDHPosteSecours != null : !GDH_POSTE_SECOURS_EDEFAULT.equals(gDHPosteSecours);
			case SchemaPackage.TYPE_SUIVI_MEDICAL__GDH_RAMASSAGE:
				return GDH_RAMASSAGE_EDEFAULT == null ? gDHRamassage != null : !GDH_RAMASSAGE_EDEFAULT.equals(gDHRamassage);
			case SchemaPackage.TYPE_SUIVI_MEDICAL__TRIAGE:
				return isSetTriage();
			case SchemaPackage.TYPE_SUIVI_MEDICAL__GDH_ARRIVEE_TRIAGE:
				return GDH_ARRIVEE_TRIAGE_EDEFAULT == null ? gDHArriveeTriage != null : !GDH_ARRIVEE_TRIAGE_EDEFAULT.equals(gDHArriveeTriage);
			case SchemaPackage.TYPE_SUIVI_MEDICAL__TYPE_TRIAGE:
				return TYPE_TRIAGE_EDEFAULT == null ? typeTriage != null : !TYPE_TRIAGE_EDEFAULT.equals(typeTriage);
			case SchemaPackage.TYPE_SUIVI_MEDICAL__TRAITEMENT:
				return TRAITEMENT_EDEFAULT == null ? traitement != null : !TRAITEMENT_EDEFAULT.equals(traitement);
			case SchemaPackage.TYPE_SUIVI_MEDICAL__MOYEN_EVACUATION:
				return MOYEN_EVACUATION_EDEFAULT == null ? moyenEvacuation != null : !MOYEN_EVACUATION_EDEFAULT.equals(moyenEvacuation);
			case SchemaPackage.TYPE_SUIVI_MEDICAL__GDH_EVACUATION:
				return GDH_EVACUATION_EDEFAULT == null ? gDHEvacuation != null : !GDH_EVACUATION_EDEFAULT.equals(gDHEvacuation);
			case SchemaPackage.TYPE_SUIVI_MEDICAL__DESTINATION_EVACUATION:
				return DESTINATION_EVACUATION_EDEFAULT == null ? destinationEvacuation != null : !DESTINATION_EVACUATION_EDEFAULT.equals(destinationEvacuation);
			case SchemaPackage.TYPE_SUIVI_MEDICAL__DATE_SITUATION:
				return DATE_SITUATION_EDEFAULT == null ? dateSituation != null : !DATE_SITUATION_EDEFAULT.equals(dateSituation);
			case SchemaPackage.TYPE_SUIVI_MEDICAL__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_SUIVI_MEDICAL__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
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
		result.append(" (gDHBlessure: ");
		result.append(gDHBlessure);
		result.append(", gDHPosteSecours: ");
		result.append(gDHPosteSecours);
		result.append(", gDHRamassage: ");
		result.append(gDHRamassage);
		result.append(", triage: ");
		if (triageESet) result.append(triage); else result.append("<unset>");
		result.append(", gDHArriveeTriage: ");
		result.append(gDHArriveeTriage);
		result.append(", typeTriage: ");
		result.append(typeTriage);
		result.append(", traitement: ");
		result.append(traitement);
		result.append(", moyenEvacuation: ");
		result.append(moyenEvacuation);
		result.append(", gDHEvacuation: ");
		result.append(gDHEvacuation);
		result.append(", destinationEvacuation: ");
		result.append(destinationEvacuation);
		result.append(", dateSituation: ");
		result.append(dateSituation);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeSuiviMedicalImpl
