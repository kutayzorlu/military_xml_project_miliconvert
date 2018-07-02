/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeVitesseLineaire;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoSegmentRouteAerienneCapaciteNecessaire;
import mpia.schema.TypeDictionaryDicoSegmentRouteAerienneEmploi;
import mpia.schema.TypeDictionaryDicoSegmentRouteAerienneStatut;
import mpia.schema.TypeSegmentRouteAerienne;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Segment Route Aerienne</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeSegmentRouteAerienneImpl#getEmploi <em>Emploi</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSegmentRouteAerienneImpl#getStatut <em>Statut</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSegmentRouteAerienneImpl#getCapaciteNecessaire <em>Capacite Necessaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSegmentRouteAerienneImpl#getVitesseAMaintenir <em>Vitesse AMaintenir</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeSegmentRouteAerienneImpl extends TypeSegmentItineraireImpl implements TypeSegmentRouteAerienne {
	/**
	 * The default value of the '{@link #getEmploi() <em>Emploi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmploi()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoSegmentRouteAerienneEmploi EMPLOI_EDEFAULT = TypeDictionaryDicoSegmentRouteAerienneEmploi.BOTH;

	/**
	 * The cached value of the '{@link #getEmploi() <em>Emploi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmploi()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoSegmentRouteAerienneEmploi emploi = EMPLOI_EDEFAULT;

	/**
	 * This is true if the Emploi attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean emploiESet;

	/**
	 * The default value of the '{@link #getStatut() <em>Statut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatut()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoSegmentRouteAerienneStatut STATUT_EDEFAULT = TypeDictionaryDicoSegmentRouteAerienneStatut.DOMSTC;

	/**
	 * The cached value of the '{@link #getStatut() <em>Statut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatut()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoSegmentRouteAerienneStatut statut = STATUT_EDEFAULT;

	/**
	 * This is true if the Statut attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean statutESet;

	/**
	 * The default value of the '{@link #getCapaciteNecessaire() <em>Capacite Necessaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapaciteNecessaire()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoSegmentRouteAerienneCapaciteNecessaire CAPACITE_NECESSAIRE_EDEFAULT = TypeDictionaryDicoSegmentRouteAerienneCapaciteNecessaire._1NM;

	/**
	 * The cached value of the '{@link #getCapaciteNecessaire() <em>Capacite Necessaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapaciteNecessaire()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoSegmentRouteAerienneCapaciteNecessaire capaciteNecessaire = CAPACITE_NECESSAIRE_EDEFAULT;

	/**
	 * This is true if the Capacite Necessaire attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean capaciteNecessaireESet;

	/**
	 * The cached value of the '{@link #getVitesseAMaintenir() <em>Vitesse AMaintenir</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesseAMaintenir()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeVitesseLineaire vitesseAMaintenir;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeSegmentRouteAerienneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeSegmentRouteAerienne();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoSegmentRouteAerienneEmploi getEmploi() {
		return emploi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmploi(TypeDictionaryDicoSegmentRouteAerienneEmploi newEmploi) {
		TypeDictionaryDicoSegmentRouteAerienneEmploi oldEmploi = emploi;
		emploi = newEmploi == null ? EMPLOI_EDEFAULT : newEmploi;
		boolean oldEmploiESet = emploiESet;
		emploiESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SEGMENT_ROUTE_AERIENNE__EMPLOI, oldEmploi, emploi, !oldEmploiESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEmploi() {
		TypeDictionaryDicoSegmentRouteAerienneEmploi oldEmploi = emploi;
		boolean oldEmploiESet = emploiESet;
		emploi = EMPLOI_EDEFAULT;
		emploiESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SEGMENT_ROUTE_AERIENNE__EMPLOI, oldEmploi, EMPLOI_EDEFAULT, oldEmploiESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEmploi() {
		return emploiESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoSegmentRouteAerienneStatut getStatut() {
		return statut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatut(TypeDictionaryDicoSegmentRouteAerienneStatut newStatut) {
		TypeDictionaryDicoSegmentRouteAerienneStatut oldStatut = statut;
		statut = newStatut == null ? STATUT_EDEFAULT : newStatut;
		boolean oldStatutESet = statutESet;
		statutESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SEGMENT_ROUTE_AERIENNE__STATUT, oldStatut, statut, !oldStatutESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStatut() {
		TypeDictionaryDicoSegmentRouteAerienneStatut oldStatut = statut;
		boolean oldStatutESet = statutESet;
		statut = STATUT_EDEFAULT;
		statutESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SEGMENT_ROUTE_AERIENNE__STATUT, oldStatut, STATUT_EDEFAULT, oldStatutESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStatut() {
		return statutESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoSegmentRouteAerienneCapaciteNecessaire getCapaciteNecessaire() {
		return capaciteNecessaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapaciteNecessaire(TypeDictionaryDicoSegmentRouteAerienneCapaciteNecessaire newCapaciteNecessaire) {
		TypeDictionaryDicoSegmentRouteAerienneCapaciteNecessaire oldCapaciteNecessaire = capaciteNecessaire;
		capaciteNecessaire = newCapaciteNecessaire == null ? CAPACITE_NECESSAIRE_EDEFAULT : newCapaciteNecessaire;
		boolean oldCapaciteNecessaireESet = capaciteNecessaireESet;
		capaciteNecessaireESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SEGMENT_ROUTE_AERIENNE__CAPACITE_NECESSAIRE, oldCapaciteNecessaire, capaciteNecessaire, !oldCapaciteNecessaireESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCapaciteNecessaire() {
		TypeDictionaryDicoSegmentRouteAerienneCapaciteNecessaire oldCapaciteNecessaire = capaciteNecessaire;
		boolean oldCapaciteNecessaireESet = capaciteNecessaireESet;
		capaciteNecessaire = CAPACITE_NECESSAIRE_EDEFAULT;
		capaciteNecessaireESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SEGMENT_ROUTE_AERIENNE__CAPACITE_NECESSAIRE, oldCapaciteNecessaire, CAPACITE_NECESSAIRE_EDEFAULT, oldCapaciteNecessaireESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCapaciteNecessaire() {
		return capaciteNecessaireESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeVitesseLineaire getVitesseAMaintenir() {
		return vitesseAMaintenir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVitesseAMaintenir(TypeDataTypeVitesseLineaire newVitesseAMaintenir, NotificationChain msgs) {
		TypeDataTypeVitesseLineaire oldVitesseAMaintenir = vitesseAMaintenir;
		vitesseAMaintenir = newVitesseAMaintenir;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SEGMENT_ROUTE_AERIENNE__VITESSE_AMAINTENIR, oldVitesseAMaintenir, newVitesseAMaintenir);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVitesseAMaintenir(TypeDataTypeVitesseLineaire newVitesseAMaintenir) {
		if (newVitesseAMaintenir != vitesseAMaintenir) {
			NotificationChain msgs = null;
			if (vitesseAMaintenir != null)
				msgs = ((InternalEObject)vitesseAMaintenir).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SEGMENT_ROUTE_AERIENNE__VITESSE_AMAINTENIR, null, msgs);
			if (newVitesseAMaintenir != null)
				msgs = ((InternalEObject)newVitesseAMaintenir).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SEGMENT_ROUTE_AERIENNE__VITESSE_AMAINTENIR, null, msgs);
			msgs = basicSetVitesseAMaintenir(newVitesseAMaintenir, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SEGMENT_ROUTE_AERIENNE__VITESSE_AMAINTENIR, newVitesseAMaintenir, newVitesseAMaintenir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_SEGMENT_ROUTE_AERIENNE__VITESSE_AMAINTENIR:
				return basicSetVitesseAMaintenir(null, msgs);
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
			case SchemaPackage.TYPE_SEGMENT_ROUTE_AERIENNE__EMPLOI:
				return getEmploi();
			case SchemaPackage.TYPE_SEGMENT_ROUTE_AERIENNE__STATUT:
				return getStatut();
			case SchemaPackage.TYPE_SEGMENT_ROUTE_AERIENNE__CAPACITE_NECESSAIRE:
				return getCapaciteNecessaire();
			case SchemaPackage.TYPE_SEGMENT_ROUTE_AERIENNE__VITESSE_AMAINTENIR:
				return getVitesseAMaintenir();
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
			case SchemaPackage.TYPE_SEGMENT_ROUTE_AERIENNE__EMPLOI:
				setEmploi((TypeDictionaryDicoSegmentRouteAerienneEmploi)newValue);
				return;
			case SchemaPackage.TYPE_SEGMENT_ROUTE_AERIENNE__STATUT:
				setStatut((TypeDictionaryDicoSegmentRouteAerienneStatut)newValue);
				return;
			case SchemaPackage.TYPE_SEGMENT_ROUTE_AERIENNE__CAPACITE_NECESSAIRE:
				setCapaciteNecessaire((TypeDictionaryDicoSegmentRouteAerienneCapaciteNecessaire)newValue);
				return;
			case SchemaPackage.TYPE_SEGMENT_ROUTE_AERIENNE__VITESSE_AMAINTENIR:
				setVitesseAMaintenir((TypeDataTypeVitesseLineaire)newValue);
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
			case SchemaPackage.TYPE_SEGMENT_ROUTE_AERIENNE__EMPLOI:
				unsetEmploi();
				return;
			case SchemaPackage.TYPE_SEGMENT_ROUTE_AERIENNE__STATUT:
				unsetStatut();
				return;
			case SchemaPackage.TYPE_SEGMENT_ROUTE_AERIENNE__CAPACITE_NECESSAIRE:
				unsetCapaciteNecessaire();
				return;
			case SchemaPackage.TYPE_SEGMENT_ROUTE_AERIENNE__VITESSE_AMAINTENIR:
				setVitesseAMaintenir((TypeDataTypeVitesseLineaire)null);
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
			case SchemaPackage.TYPE_SEGMENT_ROUTE_AERIENNE__EMPLOI:
				return isSetEmploi();
			case SchemaPackage.TYPE_SEGMENT_ROUTE_AERIENNE__STATUT:
				return isSetStatut();
			case SchemaPackage.TYPE_SEGMENT_ROUTE_AERIENNE__CAPACITE_NECESSAIRE:
				return isSetCapaciteNecessaire();
			case SchemaPackage.TYPE_SEGMENT_ROUTE_AERIENNE__VITESSE_AMAINTENIR:
				return vitesseAMaintenir != null;
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
		result.append(" (emploi: ");
		if (emploiESet) result.append(emploi); else result.append("<unset>");
		result.append(", statut: ");
		if (statutESet) result.append(statut); else result.append("<unset>");
		result.append(", capaciteNecessaire: ");
		if (capaciteNecessaireESet) result.append(capaciteNecessaire); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeSegmentRouteAerienneImpl
