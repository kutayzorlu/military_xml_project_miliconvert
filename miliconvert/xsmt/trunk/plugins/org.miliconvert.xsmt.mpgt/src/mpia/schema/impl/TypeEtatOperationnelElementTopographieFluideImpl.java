/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeVitesseLineaire;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeEtatOperationnelElementTopographieFluide;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Etat Operationnel Element Topographie Fluide</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelElementTopographieFluideImpl#getVitesseFondMer <em>Vitesse Fond Mer</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelElementTopographieFluideImpl#getVitesseMaree <em>Vitesse Maree</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelElementTopographieFluideImpl#getProfondStratTherm <em>Profond Strat Therm</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelElementTopographieFluideImpl#getVisibiliteSMarine <em>Visibilite SMarine</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeEtatOperationnelElementTopographieFluideImpl extends TypeEtatOperationnelElementTopographieImpl implements TypeEtatOperationnelElementTopographieFluide {
	/**
	 * The cached value of the '{@link #getVitesseFondMer() <em>Vitesse Fond Mer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesseFondMer()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeVitesseLineaire vitesseFondMer;

	/**
	 * The cached value of the '{@link #getVitesseMaree() <em>Vitesse Maree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesseMaree()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeVitesseLineaire vitesseMaree;

	/**
	 * The default value of the '{@link #getProfondStratTherm() <em>Profond Strat Therm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfondStratTherm()
	 * @generated
	 * @ordered
	 */
	protected static final long PROFOND_STRAT_THERM_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getProfondStratTherm() <em>Profond Strat Therm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfondStratTherm()
	 * @generated
	 * @ordered
	 */
	protected long profondStratTherm = PROFOND_STRAT_THERM_EDEFAULT;

	/**
	 * This is true if the Profond Strat Therm attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean profondStratThermESet;

	/**
	 * The default value of the '{@link #getVisibiliteSMarine() <em>Visibilite SMarine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibiliteSMarine()
	 * @generated
	 * @ordered
	 */
	protected static final long VISIBILITE_SMARINE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getVisibiliteSMarine() <em>Visibilite SMarine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibiliteSMarine()
	 * @generated
	 * @ordered
	 */
	protected long visibiliteSMarine = VISIBILITE_SMARINE_EDEFAULT;

	/**
	 * This is true if the Visibilite SMarine attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean visibiliteSMarineESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeEtatOperationnelElementTopographieFluideImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEtatOperationnelElementTopographieFluide();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeVitesseLineaire getVitesseFondMer() {
		return vitesseFondMer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVitesseFondMer(TypeDataTypeVitesseLineaire newVitesseFondMer, NotificationChain msgs) {
		TypeDataTypeVitesseLineaire oldVitesseFondMer = vitesseFondMer;
		vitesseFondMer = newVitesseFondMer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_FLUIDE__VITESSE_FOND_MER, oldVitesseFondMer, newVitesseFondMer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVitesseFondMer(TypeDataTypeVitesseLineaire newVitesseFondMer) {
		if (newVitesseFondMer != vitesseFondMer) {
			NotificationChain msgs = null;
			if (vitesseFondMer != null)
				msgs = ((InternalEObject)vitesseFondMer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_FLUIDE__VITESSE_FOND_MER, null, msgs);
			if (newVitesseFondMer != null)
				msgs = ((InternalEObject)newVitesseFondMer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_FLUIDE__VITESSE_FOND_MER, null, msgs);
			msgs = basicSetVitesseFondMer(newVitesseFondMer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_FLUIDE__VITESSE_FOND_MER, newVitesseFondMer, newVitesseFondMer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeVitesseLineaire getVitesseMaree() {
		return vitesseMaree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVitesseMaree(TypeDataTypeVitesseLineaire newVitesseMaree, NotificationChain msgs) {
		TypeDataTypeVitesseLineaire oldVitesseMaree = vitesseMaree;
		vitesseMaree = newVitesseMaree;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_FLUIDE__VITESSE_MAREE, oldVitesseMaree, newVitesseMaree);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVitesseMaree(TypeDataTypeVitesseLineaire newVitesseMaree) {
		if (newVitesseMaree != vitesseMaree) {
			NotificationChain msgs = null;
			if (vitesseMaree != null)
				msgs = ((InternalEObject)vitesseMaree).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_FLUIDE__VITESSE_MAREE, null, msgs);
			if (newVitesseMaree != null)
				msgs = ((InternalEObject)newVitesseMaree).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_FLUIDE__VITESSE_MAREE, null, msgs);
			msgs = basicSetVitesseMaree(newVitesseMaree, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_FLUIDE__VITESSE_MAREE, newVitesseMaree, newVitesseMaree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getProfondStratTherm() {
		return profondStratTherm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfondStratTherm(long newProfondStratTherm) {
		long oldProfondStratTherm = profondStratTherm;
		profondStratTherm = newProfondStratTherm;
		boolean oldProfondStratThermESet = profondStratThermESet;
		profondStratThermESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_FLUIDE__PROFOND_STRAT_THERM, oldProfondStratTherm, profondStratTherm, !oldProfondStratThermESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProfondStratTherm() {
		long oldProfondStratTherm = profondStratTherm;
		boolean oldProfondStratThermESet = profondStratThermESet;
		profondStratTherm = PROFOND_STRAT_THERM_EDEFAULT;
		profondStratThermESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_FLUIDE__PROFOND_STRAT_THERM, oldProfondStratTherm, PROFOND_STRAT_THERM_EDEFAULT, oldProfondStratThermESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProfondStratTherm() {
		return profondStratThermESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getVisibiliteSMarine() {
		return visibiliteSMarine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibiliteSMarine(long newVisibiliteSMarine) {
		long oldVisibiliteSMarine = visibiliteSMarine;
		visibiliteSMarine = newVisibiliteSMarine;
		boolean oldVisibiliteSMarineESet = visibiliteSMarineESet;
		visibiliteSMarineESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_FLUIDE__VISIBILITE_SMARINE, oldVisibiliteSMarine, visibiliteSMarine, !oldVisibiliteSMarineESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVisibiliteSMarine() {
		long oldVisibiliteSMarine = visibiliteSMarine;
		boolean oldVisibiliteSMarineESet = visibiliteSMarineESet;
		visibiliteSMarine = VISIBILITE_SMARINE_EDEFAULT;
		visibiliteSMarineESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_FLUIDE__VISIBILITE_SMARINE, oldVisibiliteSMarine, VISIBILITE_SMARINE_EDEFAULT, oldVisibiliteSMarineESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVisibiliteSMarine() {
		return visibiliteSMarineESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_FLUIDE__VITESSE_FOND_MER:
				return basicSetVitesseFondMer(null, msgs);
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_FLUIDE__VITESSE_MAREE:
				return basicSetVitesseMaree(null, msgs);
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
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_FLUIDE__VITESSE_FOND_MER:
				return getVitesseFondMer();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_FLUIDE__VITESSE_MAREE:
				return getVitesseMaree();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_FLUIDE__PROFOND_STRAT_THERM:
				return new Long(getProfondStratTherm());
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_FLUIDE__VISIBILITE_SMARINE:
				return new Long(getVisibiliteSMarine());
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
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_FLUIDE__VITESSE_FOND_MER:
				setVitesseFondMer((TypeDataTypeVitesseLineaire)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_FLUIDE__VITESSE_MAREE:
				setVitesseMaree((TypeDataTypeVitesseLineaire)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_FLUIDE__PROFOND_STRAT_THERM:
				setProfondStratTherm(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_FLUIDE__VISIBILITE_SMARINE:
				setVisibiliteSMarine(((Long)newValue).longValue());
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
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_FLUIDE__VITESSE_FOND_MER:
				setVitesseFondMer((TypeDataTypeVitesseLineaire)null);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_FLUIDE__VITESSE_MAREE:
				setVitesseMaree((TypeDataTypeVitesseLineaire)null);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_FLUIDE__PROFOND_STRAT_THERM:
				unsetProfondStratTherm();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_FLUIDE__VISIBILITE_SMARINE:
				unsetVisibiliteSMarine();
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
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_FLUIDE__VITESSE_FOND_MER:
				return vitesseFondMer != null;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_FLUIDE__VITESSE_MAREE:
				return vitesseMaree != null;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_FLUIDE__PROFOND_STRAT_THERM:
				return isSetProfondStratTherm();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_FLUIDE__VISIBILITE_SMARINE:
				return isSetVisibiliteSMarine();
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
		result.append(" (profondStratTherm: ");
		if (profondStratThermESet) result.append(profondStratTherm); else result.append("<unset>");
		result.append(", visibiliteSMarine: ");
		if (visibiliteSMarineESet) result.append(visibiliteSMarine); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeEtatOperationnelElementTopographieFluideImpl
