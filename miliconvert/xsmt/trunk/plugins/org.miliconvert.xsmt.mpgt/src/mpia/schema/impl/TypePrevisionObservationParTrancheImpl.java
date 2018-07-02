/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAtmosphere;
import mpia.schema.TypeAutrePhenomeneMeteorologique;
import mpia.schema.TypeCouvertureNuageuse;
import mpia.schema.TypeGivrage;
import mpia.schema.TypeLumiere;
import mpia.schema.TypePrecipitation;
import mpia.schema.TypePrevisionObservationParTranche;
import mpia.schema.TypeVent;
import mpia.schema.TypeVisibilite;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Prevision Observation Par Tranche</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypePrevisionObservationParTrancheImpl#getConcerneAtmosphere <em>Concerne Atmosphere</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrevisionObservationParTrancheImpl#getConcernePrecipitation <em>Concerne Precipitation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrevisionObservationParTrancheImpl#getConcerneCouvertureNuageuse <em>Concerne Couverture Nuageuse</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrevisionObservationParTrancheImpl#getConcerneLumiere <em>Concerne Lumiere</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrevisionObservationParTrancheImpl#getConcerneVisibilite <em>Concerne Visibilite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrevisionObservationParTrancheImpl#getConcerneAutrePhenomeneMeteorologique <em>Concerne Autre Phenomene Meteorologique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrevisionObservationParTrancheImpl#getConcerneVent <em>Concerne Vent</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrevisionObservationParTrancheImpl#getConcerneGivrage <em>Concerne Givrage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypePrevisionObservationParTrancheImpl extends EObjectImpl implements TypePrevisionObservationParTranche {
	/**
	 * The cached value of the '{@link #getConcerneAtmosphere() <em>Concerne Atmosphere</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneAtmosphere()
	 * @generated
	 * @ordered
	 */
	protected TypeAtmosphere concerneAtmosphere;

	/**
	 * The cached value of the '{@link #getConcernePrecipitation() <em>Concerne Precipitation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcernePrecipitation()
	 * @generated
	 * @ordered
	 */
	protected TypePrecipitation concernePrecipitation;

	/**
	 * The cached value of the '{@link #getConcerneCouvertureNuageuse() <em>Concerne Couverture Nuageuse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneCouvertureNuageuse()
	 * @generated
	 * @ordered
	 */
	protected TypeCouvertureNuageuse concerneCouvertureNuageuse;

	/**
	 * The cached value of the '{@link #getConcerneLumiere() <em>Concerne Lumiere</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneLumiere()
	 * @generated
	 * @ordered
	 */
	protected TypeLumiere concerneLumiere;

	/**
	 * The cached value of the '{@link #getConcerneVisibilite() <em>Concerne Visibilite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneVisibilite()
	 * @generated
	 * @ordered
	 */
	protected TypeVisibilite concerneVisibilite;

	/**
	 * The cached value of the '{@link #getConcerneAutrePhenomeneMeteorologique() <em>Concerne Autre Phenomene Meteorologique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneAutrePhenomeneMeteorologique()
	 * @generated
	 * @ordered
	 */
	protected TypeAutrePhenomeneMeteorologique concerneAutrePhenomeneMeteorologique;

	/**
	 * The cached value of the '{@link #getConcerneVent() <em>Concerne Vent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneVent()
	 * @generated
	 * @ordered
	 */
	protected TypeVent concerneVent;

	/**
	 * The cached value of the '{@link #getConcerneGivrage() <em>Concerne Givrage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneGivrage()
	 * @generated
	 * @ordered
	 */
	protected TypeGivrage concerneGivrage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypePrevisionObservationParTrancheImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypePrevisionObservationParTranche();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAtmosphere getConcerneAtmosphere() {
		return concerneAtmosphere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcerneAtmosphere(TypeAtmosphere newConcerneAtmosphere, NotificationChain msgs) {
		TypeAtmosphere oldConcerneAtmosphere = concerneAtmosphere;
		concerneAtmosphere = newConcerneAtmosphere;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_ATMOSPHERE, oldConcerneAtmosphere, newConcerneAtmosphere);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcerneAtmosphere(TypeAtmosphere newConcerneAtmosphere) {
		if (newConcerneAtmosphere != concerneAtmosphere) {
			NotificationChain msgs = null;
			if (concerneAtmosphere != null)
				msgs = ((InternalEObject)concerneAtmosphere).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_ATMOSPHERE, null, msgs);
			if (newConcerneAtmosphere != null)
				msgs = ((InternalEObject)newConcerneAtmosphere).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_ATMOSPHERE, null, msgs);
			msgs = basicSetConcerneAtmosphere(newConcerneAtmosphere, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_ATMOSPHERE, newConcerneAtmosphere, newConcerneAtmosphere));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypePrecipitation getConcernePrecipitation() {
		return concernePrecipitation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcernePrecipitation(TypePrecipitation newConcernePrecipitation, NotificationChain msgs) {
		TypePrecipitation oldConcernePrecipitation = concernePrecipitation;
		concernePrecipitation = newConcernePrecipitation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_PRECIPITATION, oldConcernePrecipitation, newConcernePrecipitation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcernePrecipitation(TypePrecipitation newConcernePrecipitation) {
		if (newConcernePrecipitation != concernePrecipitation) {
			NotificationChain msgs = null;
			if (concernePrecipitation != null)
				msgs = ((InternalEObject)concernePrecipitation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_PRECIPITATION, null, msgs);
			if (newConcernePrecipitation != null)
				msgs = ((InternalEObject)newConcernePrecipitation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_PRECIPITATION, null, msgs);
			msgs = basicSetConcernePrecipitation(newConcernePrecipitation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_PRECIPITATION, newConcernePrecipitation, newConcernePrecipitation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeCouvertureNuageuse getConcerneCouvertureNuageuse() {
		return concerneCouvertureNuageuse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcerneCouvertureNuageuse(TypeCouvertureNuageuse newConcerneCouvertureNuageuse, NotificationChain msgs) {
		TypeCouvertureNuageuse oldConcerneCouvertureNuageuse = concerneCouvertureNuageuse;
		concerneCouvertureNuageuse = newConcerneCouvertureNuageuse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_COUVERTURE_NUAGEUSE, oldConcerneCouvertureNuageuse, newConcerneCouvertureNuageuse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcerneCouvertureNuageuse(TypeCouvertureNuageuse newConcerneCouvertureNuageuse) {
		if (newConcerneCouvertureNuageuse != concerneCouvertureNuageuse) {
			NotificationChain msgs = null;
			if (concerneCouvertureNuageuse != null)
				msgs = ((InternalEObject)concerneCouvertureNuageuse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_COUVERTURE_NUAGEUSE, null, msgs);
			if (newConcerneCouvertureNuageuse != null)
				msgs = ((InternalEObject)newConcerneCouvertureNuageuse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_COUVERTURE_NUAGEUSE, null, msgs);
			msgs = basicSetConcerneCouvertureNuageuse(newConcerneCouvertureNuageuse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_COUVERTURE_NUAGEUSE, newConcerneCouvertureNuageuse, newConcerneCouvertureNuageuse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeLumiere getConcerneLumiere() {
		return concerneLumiere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcerneLumiere(TypeLumiere newConcerneLumiere, NotificationChain msgs) {
		TypeLumiere oldConcerneLumiere = concerneLumiere;
		concerneLumiere = newConcerneLumiere;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_LUMIERE, oldConcerneLumiere, newConcerneLumiere);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcerneLumiere(TypeLumiere newConcerneLumiere) {
		if (newConcerneLumiere != concerneLumiere) {
			NotificationChain msgs = null;
			if (concerneLumiere != null)
				msgs = ((InternalEObject)concerneLumiere).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_LUMIERE, null, msgs);
			if (newConcerneLumiere != null)
				msgs = ((InternalEObject)newConcerneLumiere).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_LUMIERE, null, msgs);
			msgs = basicSetConcerneLumiere(newConcerneLumiere, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_LUMIERE, newConcerneLumiere, newConcerneLumiere));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeVisibilite getConcerneVisibilite() {
		return concerneVisibilite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcerneVisibilite(TypeVisibilite newConcerneVisibilite, NotificationChain msgs) {
		TypeVisibilite oldConcerneVisibilite = concerneVisibilite;
		concerneVisibilite = newConcerneVisibilite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_VISIBILITE, oldConcerneVisibilite, newConcerneVisibilite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcerneVisibilite(TypeVisibilite newConcerneVisibilite) {
		if (newConcerneVisibilite != concerneVisibilite) {
			NotificationChain msgs = null;
			if (concerneVisibilite != null)
				msgs = ((InternalEObject)concerneVisibilite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_VISIBILITE, null, msgs);
			if (newConcerneVisibilite != null)
				msgs = ((InternalEObject)newConcerneVisibilite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_VISIBILITE, null, msgs);
			msgs = basicSetConcerneVisibilite(newConcerneVisibilite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_VISIBILITE, newConcerneVisibilite, newConcerneVisibilite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAutrePhenomeneMeteorologique getConcerneAutrePhenomeneMeteorologique() {
		return concerneAutrePhenomeneMeteorologique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcerneAutrePhenomeneMeteorologique(TypeAutrePhenomeneMeteorologique newConcerneAutrePhenomeneMeteorologique, NotificationChain msgs) {
		TypeAutrePhenomeneMeteorologique oldConcerneAutrePhenomeneMeteorologique = concerneAutrePhenomeneMeteorologique;
		concerneAutrePhenomeneMeteorologique = newConcerneAutrePhenomeneMeteorologique;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_AUTRE_PHENOMENE_METEOROLOGIQUE, oldConcerneAutrePhenomeneMeteorologique, newConcerneAutrePhenomeneMeteorologique);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcerneAutrePhenomeneMeteorologique(TypeAutrePhenomeneMeteorologique newConcerneAutrePhenomeneMeteorologique) {
		if (newConcerneAutrePhenomeneMeteorologique != concerneAutrePhenomeneMeteorologique) {
			NotificationChain msgs = null;
			if (concerneAutrePhenomeneMeteorologique != null)
				msgs = ((InternalEObject)concerneAutrePhenomeneMeteorologique).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_AUTRE_PHENOMENE_METEOROLOGIQUE, null, msgs);
			if (newConcerneAutrePhenomeneMeteorologique != null)
				msgs = ((InternalEObject)newConcerneAutrePhenomeneMeteorologique).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_AUTRE_PHENOMENE_METEOROLOGIQUE, null, msgs);
			msgs = basicSetConcerneAutrePhenomeneMeteorologique(newConcerneAutrePhenomeneMeteorologique, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_AUTRE_PHENOMENE_METEOROLOGIQUE, newConcerneAutrePhenomeneMeteorologique, newConcerneAutrePhenomeneMeteorologique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeVent getConcerneVent() {
		return concerneVent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcerneVent(TypeVent newConcerneVent, NotificationChain msgs) {
		TypeVent oldConcerneVent = concerneVent;
		concerneVent = newConcerneVent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_VENT, oldConcerneVent, newConcerneVent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcerneVent(TypeVent newConcerneVent) {
		if (newConcerneVent != concerneVent) {
			NotificationChain msgs = null;
			if (concerneVent != null)
				msgs = ((InternalEObject)concerneVent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_VENT, null, msgs);
			if (newConcerneVent != null)
				msgs = ((InternalEObject)newConcerneVent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_VENT, null, msgs);
			msgs = basicSetConcerneVent(newConcerneVent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_VENT, newConcerneVent, newConcerneVent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeGivrage getConcerneGivrage() {
		return concerneGivrage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcerneGivrage(TypeGivrage newConcerneGivrage, NotificationChain msgs) {
		TypeGivrage oldConcerneGivrage = concerneGivrage;
		concerneGivrage = newConcerneGivrage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_GIVRAGE, oldConcerneGivrage, newConcerneGivrage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcerneGivrage(TypeGivrage newConcerneGivrage) {
		if (newConcerneGivrage != concerneGivrage) {
			NotificationChain msgs = null;
			if (concerneGivrage != null)
				msgs = ((InternalEObject)concerneGivrage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_GIVRAGE, null, msgs);
			if (newConcerneGivrage != null)
				msgs = ((InternalEObject)newConcerneGivrage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_GIVRAGE, null, msgs);
			msgs = basicSetConcerneGivrage(newConcerneGivrage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_GIVRAGE, newConcerneGivrage, newConcerneGivrage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_ATMOSPHERE:
				return basicSetConcerneAtmosphere(null, msgs);
			case SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_PRECIPITATION:
				return basicSetConcernePrecipitation(null, msgs);
			case SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_COUVERTURE_NUAGEUSE:
				return basicSetConcerneCouvertureNuageuse(null, msgs);
			case SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_LUMIERE:
				return basicSetConcerneLumiere(null, msgs);
			case SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_VISIBILITE:
				return basicSetConcerneVisibilite(null, msgs);
			case SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_AUTRE_PHENOMENE_METEOROLOGIQUE:
				return basicSetConcerneAutrePhenomeneMeteorologique(null, msgs);
			case SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_VENT:
				return basicSetConcerneVent(null, msgs);
			case SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_GIVRAGE:
				return basicSetConcerneGivrage(null, msgs);
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
			case SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_ATMOSPHERE:
				return getConcerneAtmosphere();
			case SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_PRECIPITATION:
				return getConcernePrecipitation();
			case SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_COUVERTURE_NUAGEUSE:
				return getConcerneCouvertureNuageuse();
			case SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_LUMIERE:
				return getConcerneLumiere();
			case SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_VISIBILITE:
				return getConcerneVisibilite();
			case SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_AUTRE_PHENOMENE_METEOROLOGIQUE:
				return getConcerneAutrePhenomeneMeteorologique();
			case SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_VENT:
				return getConcerneVent();
			case SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_GIVRAGE:
				return getConcerneGivrage();
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
			case SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_ATMOSPHERE:
				setConcerneAtmosphere((TypeAtmosphere)newValue);
				return;
			case SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_PRECIPITATION:
				setConcernePrecipitation((TypePrecipitation)newValue);
				return;
			case SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_COUVERTURE_NUAGEUSE:
				setConcerneCouvertureNuageuse((TypeCouvertureNuageuse)newValue);
				return;
			case SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_LUMIERE:
				setConcerneLumiere((TypeLumiere)newValue);
				return;
			case SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_VISIBILITE:
				setConcerneVisibilite((TypeVisibilite)newValue);
				return;
			case SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_AUTRE_PHENOMENE_METEOROLOGIQUE:
				setConcerneAutrePhenomeneMeteorologique((TypeAutrePhenomeneMeteorologique)newValue);
				return;
			case SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_VENT:
				setConcerneVent((TypeVent)newValue);
				return;
			case SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_GIVRAGE:
				setConcerneGivrage((TypeGivrage)newValue);
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
			case SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_ATMOSPHERE:
				setConcerneAtmosphere((TypeAtmosphere)null);
				return;
			case SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_PRECIPITATION:
				setConcernePrecipitation((TypePrecipitation)null);
				return;
			case SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_COUVERTURE_NUAGEUSE:
				setConcerneCouvertureNuageuse((TypeCouvertureNuageuse)null);
				return;
			case SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_LUMIERE:
				setConcerneLumiere((TypeLumiere)null);
				return;
			case SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_VISIBILITE:
				setConcerneVisibilite((TypeVisibilite)null);
				return;
			case SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_AUTRE_PHENOMENE_METEOROLOGIQUE:
				setConcerneAutrePhenomeneMeteorologique((TypeAutrePhenomeneMeteorologique)null);
				return;
			case SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_VENT:
				setConcerneVent((TypeVent)null);
				return;
			case SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_GIVRAGE:
				setConcerneGivrage((TypeGivrage)null);
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
			case SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_ATMOSPHERE:
				return concerneAtmosphere != null;
			case SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_PRECIPITATION:
				return concernePrecipitation != null;
			case SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_COUVERTURE_NUAGEUSE:
				return concerneCouvertureNuageuse != null;
			case SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_LUMIERE:
				return concerneLumiere != null;
			case SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_VISIBILITE:
				return concerneVisibilite != null;
			case SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_AUTRE_PHENOMENE_METEOROLOGIQUE:
				return concerneAutrePhenomeneMeteorologique != null;
			case SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_VENT:
				return concerneVent != null;
			case SchemaPackage.TYPE_PREVISION_OBSERVATION_PAR_TRANCHE__CONCERNE_GIVRAGE:
				return concerneGivrage != null;
		}
		return super.eIsSet(featureID);
	}

} //TypePrevisionObservationParTrancheImpl
