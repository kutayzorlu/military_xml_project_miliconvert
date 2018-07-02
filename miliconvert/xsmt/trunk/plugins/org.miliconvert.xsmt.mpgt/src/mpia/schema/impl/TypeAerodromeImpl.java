/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeAire;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAerodrome;
import mpia.schema.TypeFrequence;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Aerodrome</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAerodromeImpl#getCodeOACI <em>Code OACI</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAerodromeImpl#isControleAerien <em>Controle Aerien</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAerodromeImpl#isAtterrissageAuxInstruments <em>Atterrissage Aux Instruments</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAerodromeImpl#isLocalisationVisuelleAerodrome <em>Localisation Visuelle Aerodrome</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAerodromeImpl#isDefenseSolAir <em>Defense Sol Air</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAerodromeImpl#getSurfaceZoneHangar <em>Surface Zone Hangar</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAerodromeImpl#getAPourFrequenceApprocheFrequence <em>APour Frequence Approche Frequence</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAerodromeImpl#getAPourFrequenceTourFrequence <em>APour Frequence Tour Frequence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAerodromeImpl extends TypeSiteImpl implements TypeAerodrome {
	/**
	 * The default value of the '{@link #getCodeOACI() <em>Code OACI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeOACI()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_OACI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeOACI() <em>Code OACI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeOACI()
	 * @generated
	 * @ordered
	 */
	protected String codeOACI = CODE_OACI_EDEFAULT;

	/**
	 * The default value of the '{@link #isControleAerien() <em>Controle Aerien</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isControleAerien()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONTROLE_AERIEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isControleAerien() <em>Controle Aerien</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isControleAerien()
	 * @generated
	 * @ordered
	 */
	protected boolean controleAerien = CONTROLE_AERIEN_EDEFAULT;

	/**
	 * This is true if the Controle Aerien attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean controleAerienESet;

	/**
	 * The default value of the '{@link #isAtterrissageAuxInstruments() <em>Atterrissage Aux Instruments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAtterrissageAuxInstruments()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ATTERRISSAGE_AUX_INSTRUMENTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAtterrissageAuxInstruments() <em>Atterrissage Aux Instruments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAtterrissageAuxInstruments()
	 * @generated
	 * @ordered
	 */
	protected boolean atterrissageAuxInstruments = ATTERRISSAGE_AUX_INSTRUMENTS_EDEFAULT;

	/**
	 * This is true if the Atterrissage Aux Instruments attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean atterrissageAuxInstrumentsESet;

	/**
	 * The default value of the '{@link #isLocalisationVisuelleAerodrome() <em>Localisation Visuelle Aerodrome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLocalisationVisuelleAerodrome()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOCALISATION_VISUELLE_AERODROME_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLocalisationVisuelleAerodrome() <em>Localisation Visuelle Aerodrome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLocalisationVisuelleAerodrome()
	 * @generated
	 * @ordered
	 */
	protected boolean localisationVisuelleAerodrome = LOCALISATION_VISUELLE_AERODROME_EDEFAULT;

	/**
	 * This is true if the Localisation Visuelle Aerodrome attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean localisationVisuelleAerodromeESet;

	/**
	 * The default value of the '{@link #isDefenseSolAir() <em>Defense Sol Air</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefenseSolAir()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEFENSE_SOL_AIR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDefenseSolAir() <em>Defense Sol Air</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefenseSolAir()
	 * @generated
	 * @ordered
	 */
	protected boolean defenseSolAir = DEFENSE_SOL_AIR_EDEFAULT;

	/**
	 * This is true if the Defense Sol Air attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean defenseSolAirESet;

	/**
	 * The cached value of the '{@link #getSurfaceZoneHangar() <em>Surface Zone Hangar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurfaceZoneHangar()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeAire surfaceZoneHangar;

	/**
	 * The cached value of the '{@link #getAPourFrequenceApprocheFrequence() <em>APour Frequence Approche Frequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourFrequenceApprocheFrequence()
	 * @generated
	 * @ordered
	 */
	protected TypeFrequence aPourFrequenceApprocheFrequence;

	/**
	 * The cached value of the '{@link #getAPourFrequenceTourFrequence() <em>APour Frequence Tour Frequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourFrequenceTourFrequence()
	 * @generated
	 * @ordered
	 */
	protected TypeFrequence aPourFrequenceTourFrequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAerodromeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAerodrome();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodeOACI() {
		return codeOACI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeOACI(String newCodeOACI) {
		String oldCodeOACI = codeOACI;
		codeOACI = newCodeOACI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AERODROME__CODE_OACI, oldCodeOACI, codeOACI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isControleAerien() {
		return controleAerien;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControleAerien(boolean newControleAerien) {
		boolean oldControleAerien = controleAerien;
		controleAerien = newControleAerien;
		boolean oldControleAerienESet = controleAerienESet;
		controleAerienESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AERODROME__CONTROLE_AERIEN, oldControleAerien, controleAerien, !oldControleAerienESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetControleAerien() {
		boolean oldControleAerien = controleAerien;
		boolean oldControleAerienESet = controleAerienESet;
		controleAerien = CONTROLE_AERIEN_EDEFAULT;
		controleAerienESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_AERODROME__CONTROLE_AERIEN, oldControleAerien, CONTROLE_AERIEN_EDEFAULT, oldControleAerienESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetControleAerien() {
		return controleAerienESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAtterrissageAuxInstruments() {
		return atterrissageAuxInstruments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAtterrissageAuxInstruments(boolean newAtterrissageAuxInstruments) {
		boolean oldAtterrissageAuxInstruments = atterrissageAuxInstruments;
		atterrissageAuxInstruments = newAtterrissageAuxInstruments;
		boolean oldAtterrissageAuxInstrumentsESet = atterrissageAuxInstrumentsESet;
		atterrissageAuxInstrumentsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AERODROME__ATTERRISSAGE_AUX_INSTRUMENTS, oldAtterrissageAuxInstruments, atterrissageAuxInstruments, !oldAtterrissageAuxInstrumentsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAtterrissageAuxInstruments() {
		boolean oldAtterrissageAuxInstruments = atterrissageAuxInstruments;
		boolean oldAtterrissageAuxInstrumentsESet = atterrissageAuxInstrumentsESet;
		atterrissageAuxInstruments = ATTERRISSAGE_AUX_INSTRUMENTS_EDEFAULT;
		atterrissageAuxInstrumentsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_AERODROME__ATTERRISSAGE_AUX_INSTRUMENTS, oldAtterrissageAuxInstruments, ATTERRISSAGE_AUX_INSTRUMENTS_EDEFAULT, oldAtterrissageAuxInstrumentsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAtterrissageAuxInstruments() {
		return atterrissageAuxInstrumentsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLocalisationVisuelleAerodrome() {
		return localisationVisuelleAerodrome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalisationVisuelleAerodrome(boolean newLocalisationVisuelleAerodrome) {
		boolean oldLocalisationVisuelleAerodrome = localisationVisuelleAerodrome;
		localisationVisuelleAerodrome = newLocalisationVisuelleAerodrome;
		boolean oldLocalisationVisuelleAerodromeESet = localisationVisuelleAerodromeESet;
		localisationVisuelleAerodromeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AERODROME__LOCALISATION_VISUELLE_AERODROME, oldLocalisationVisuelleAerodrome, localisationVisuelleAerodrome, !oldLocalisationVisuelleAerodromeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLocalisationVisuelleAerodrome() {
		boolean oldLocalisationVisuelleAerodrome = localisationVisuelleAerodrome;
		boolean oldLocalisationVisuelleAerodromeESet = localisationVisuelleAerodromeESet;
		localisationVisuelleAerodrome = LOCALISATION_VISUELLE_AERODROME_EDEFAULT;
		localisationVisuelleAerodromeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_AERODROME__LOCALISATION_VISUELLE_AERODROME, oldLocalisationVisuelleAerodrome, LOCALISATION_VISUELLE_AERODROME_EDEFAULT, oldLocalisationVisuelleAerodromeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLocalisationVisuelleAerodrome() {
		return localisationVisuelleAerodromeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDefenseSolAir() {
		return defenseSolAir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefenseSolAir(boolean newDefenseSolAir) {
		boolean oldDefenseSolAir = defenseSolAir;
		defenseSolAir = newDefenseSolAir;
		boolean oldDefenseSolAirESet = defenseSolAirESet;
		defenseSolAirESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AERODROME__DEFENSE_SOL_AIR, oldDefenseSolAir, defenseSolAir, !oldDefenseSolAirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDefenseSolAir() {
		boolean oldDefenseSolAir = defenseSolAir;
		boolean oldDefenseSolAirESet = defenseSolAirESet;
		defenseSolAir = DEFENSE_SOL_AIR_EDEFAULT;
		defenseSolAirESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_AERODROME__DEFENSE_SOL_AIR, oldDefenseSolAir, DEFENSE_SOL_AIR_EDEFAULT, oldDefenseSolAirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDefenseSolAir() {
		return defenseSolAirESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeAire getSurfaceZoneHangar() {
		return surfaceZoneHangar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSurfaceZoneHangar(TypeDataTypeAire newSurfaceZoneHangar, NotificationChain msgs) {
		TypeDataTypeAire oldSurfaceZoneHangar = surfaceZoneHangar;
		surfaceZoneHangar = newSurfaceZoneHangar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AERODROME__SURFACE_ZONE_HANGAR, oldSurfaceZoneHangar, newSurfaceZoneHangar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSurfaceZoneHangar(TypeDataTypeAire newSurfaceZoneHangar) {
		if (newSurfaceZoneHangar != surfaceZoneHangar) {
			NotificationChain msgs = null;
			if (surfaceZoneHangar != null)
				msgs = ((InternalEObject)surfaceZoneHangar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_AERODROME__SURFACE_ZONE_HANGAR, null, msgs);
			if (newSurfaceZoneHangar != null)
				msgs = ((InternalEObject)newSurfaceZoneHangar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_AERODROME__SURFACE_ZONE_HANGAR, null, msgs);
			msgs = basicSetSurfaceZoneHangar(newSurfaceZoneHangar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AERODROME__SURFACE_ZONE_HANGAR, newSurfaceZoneHangar, newSurfaceZoneHangar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeFrequence getAPourFrequenceApprocheFrequence() {
		return aPourFrequenceApprocheFrequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourFrequenceApprocheFrequence(TypeFrequence newAPourFrequenceApprocheFrequence, NotificationChain msgs) {
		TypeFrequence oldAPourFrequenceApprocheFrequence = aPourFrequenceApprocheFrequence;
		aPourFrequenceApprocheFrequence = newAPourFrequenceApprocheFrequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AERODROME__APOUR_FREQUENCE_APPROCHE_FREQUENCE, oldAPourFrequenceApprocheFrequence, newAPourFrequenceApprocheFrequence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourFrequenceApprocheFrequence(TypeFrequence newAPourFrequenceApprocheFrequence) {
		if (newAPourFrequenceApprocheFrequence != aPourFrequenceApprocheFrequence) {
			NotificationChain msgs = null;
			if (aPourFrequenceApprocheFrequence != null)
				msgs = ((InternalEObject)aPourFrequenceApprocheFrequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_AERODROME__APOUR_FREQUENCE_APPROCHE_FREQUENCE, null, msgs);
			if (newAPourFrequenceApprocheFrequence != null)
				msgs = ((InternalEObject)newAPourFrequenceApprocheFrequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_AERODROME__APOUR_FREQUENCE_APPROCHE_FREQUENCE, null, msgs);
			msgs = basicSetAPourFrequenceApprocheFrequence(newAPourFrequenceApprocheFrequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AERODROME__APOUR_FREQUENCE_APPROCHE_FREQUENCE, newAPourFrequenceApprocheFrequence, newAPourFrequenceApprocheFrequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeFrequence getAPourFrequenceTourFrequence() {
		return aPourFrequenceTourFrequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourFrequenceTourFrequence(TypeFrequence newAPourFrequenceTourFrequence, NotificationChain msgs) {
		TypeFrequence oldAPourFrequenceTourFrequence = aPourFrequenceTourFrequence;
		aPourFrequenceTourFrequence = newAPourFrequenceTourFrequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AERODROME__APOUR_FREQUENCE_TOUR_FREQUENCE, oldAPourFrequenceTourFrequence, newAPourFrequenceTourFrequence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourFrequenceTourFrequence(TypeFrequence newAPourFrequenceTourFrequence) {
		if (newAPourFrequenceTourFrequence != aPourFrequenceTourFrequence) {
			NotificationChain msgs = null;
			if (aPourFrequenceTourFrequence != null)
				msgs = ((InternalEObject)aPourFrequenceTourFrequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_AERODROME__APOUR_FREQUENCE_TOUR_FREQUENCE, null, msgs);
			if (newAPourFrequenceTourFrequence != null)
				msgs = ((InternalEObject)newAPourFrequenceTourFrequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_AERODROME__APOUR_FREQUENCE_TOUR_FREQUENCE, null, msgs);
			msgs = basicSetAPourFrequenceTourFrequence(newAPourFrequenceTourFrequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AERODROME__APOUR_FREQUENCE_TOUR_FREQUENCE, newAPourFrequenceTourFrequence, newAPourFrequenceTourFrequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_AERODROME__SURFACE_ZONE_HANGAR:
				return basicSetSurfaceZoneHangar(null, msgs);
			case SchemaPackage.TYPE_AERODROME__APOUR_FREQUENCE_APPROCHE_FREQUENCE:
				return basicSetAPourFrequenceApprocheFrequence(null, msgs);
			case SchemaPackage.TYPE_AERODROME__APOUR_FREQUENCE_TOUR_FREQUENCE:
				return basicSetAPourFrequenceTourFrequence(null, msgs);
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
			case SchemaPackage.TYPE_AERODROME__CODE_OACI:
				return getCodeOACI();
			case SchemaPackage.TYPE_AERODROME__CONTROLE_AERIEN:
				return isControleAerien() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_AERODROME__ATTERRISSAGE_AUX_INSTRUMENTS:
				return isAtterrissageAuxInstruments() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_AERODROME__LOCALISATION_VISUELLE_AERODROME:
				return isLocalisationVisuelleAerodrome() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_AERODROME__DEFENSE_SOL_AIR:
				return isDefenseSolAir() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_AERODROME__SURFACE_ZONE_HANGAR:
				return getSurfaceZoneHangar();
			case SchemaPackage.TYPE_AERODROME__APOUR_FREQUENCE_APPROCHE_FREQUENCE:
				return getAPourFrequenceApprocheFrequence();
			case SchemaPackage.TYPE_AERODROME__APOUR_FREQUENCE_TOUR_FREQUENCE:
				return getAPourFrequenceTourFrequence();
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
			case SchemaPackage.TYPE_AERODROME__CODE_OACI:
				setCodeOACI((String)newValue);
				return;
			case SchemaPackage.TYPE_AERODROME__CONTROLE_AERIEN:
				setControleAerien(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_AERODROME__ATTERRISSAGE_AUX_INSTRUMENTS:
				setAtterrissageAuxInstruments(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_AERODROME__LOCALISATION_VISUELLE_AERODROME:
				setLocalisationVisuelleAerodrome(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_AERODROME__DEFENSE_SOL_AIR:
				setDefenseSolAir(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_AERODROME__SURFACE_ZONE_HANGAR:
				setSurfaceZoneHangar((TypeDataTypeAire)newValue);
				return;
			case SchemaPackage.TYPE_AERODROME__APOUR_FREQUENCE_APPROCHE_FREQUENCE:
				setAPourFrequenceApprocheFrequence((TypeFrequence)newValue);
				return;
			case SchemaPackage.TYPE_AERODROME__APOUR_FREQUENCE_TOUR_FREQUENCE:
				setAPourFrequenceTourFrequence((TypeFrequence)newValue);
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
			case SchemaPackage.TYPE_AERODROME__CODE_OACI:
				setCodeOACI(CODE_OACI_EDEFAULT);
				return;
			case SchemaPackage.TYPE_AERODROME__CONTROLE_AERIEN:
				unsetControleAerien();
				return;
			case SchemaPackage.TYPE_AERODROME__ATTERRISSAGE_AUX_INSTRUMENTS:
				unsetAtterrissageAuxInstruments();
				return;
			case SchemaPackage.TYPE_AERODROME__LOCALISATION_VISUELLE_AERODROME:
				unsetLocalisationVisuelleAerodrome();
				return;
			case SchemaPackage.TYPE_AERODROME__DEFENSE_SOL_AIR:
				unsetDefenseSolAir();
				return;
			case SchemaPackage.TYPE_AERODROME__SURFACE_ZONE_HANGAR:
				setSurfaceZoneHangar((TypeDataTypeAire)null);
				return;
			case SchemaPackage.TYPE_AERODROME__APOUR_FREQUENCE_APPROCHE_FREQUENCE:
				setAPourFrequenceApprocheFrequence((TypeFrequence)null);
				return;
			case SchemaPackage.TYPE_AERODROME__APOUR_FREQUENCE_TOUR_FREQUENCE:
				setAPourFrequenceTourFrequence((TypeFrequence)null);
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
			case SchemaPackage.TYPE_AERODROME__CODE_OACI:
				return CODE_OACI_EDEFAULT == null ? codeOACI != null : !CODE_OACI_EDEFAULT.equals(codeOACI);
			case SchemaPackage.TYPE_AERODROME__CONTROLE_AERIEN:
				return isSetControleAerien();
			case SchemaPackage.TYPE_AERODROME__ATTERRISSAGE_AUX_INSTRUMENTS:
				return isSetAtterrissageAuxInstruments();
			case SchemaPackage.TYPE_AERODROME__LOCALISATION_VISUELLE_AERODROME:
				return isSetLocalisationVisuelleAerodrome();
			case SchemaPackage.TYPE_AERODROME__DEFENSE_SOL_AIR:
				return isSetDefenseSolAir();
			case SchemaPackage.TYPE_AERODROME__SURFACE_ZONE_HANGAR:
				return surfaceZoneHangar != null;
			case SchemaPackage.TYPE_AERODROME__APOUR_FREQUENCE_APPROCHE_FREQUENCE:
				return aPourFrequenceApprocheFrequence != null;
			case SchemaPackage.TYPE_AERODROME__APOUR_FREQUENCE_TOUR_FREQUENCE:
				return aPourFrequenceTourFrequence != null;
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
		result.append(" (codeOACI: ");
		result.append(codeOACI);
		result.append(", controleAerien: ");
		if (controleAerienESet) result.append(controleAerien); else result.append("<unset>");
		result.append(", atterrissageAuxInstruments: ");
		if (atterrissageAuxInstrumentsESet) result.append(atterrissageAuxInstruments); else result.append("<unset>");
		result.append(", localisationVisuelleAerodrome: ");
		if (localisationVisuelleAerodromeESet) result.append(localisationVisuelleAerodrome); else result.append("<unset>");
		result.append(", defenseSolAir: ");
		if (defenseSolAirESet) result.append(defenseSolAir); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeAerodromeImpl
