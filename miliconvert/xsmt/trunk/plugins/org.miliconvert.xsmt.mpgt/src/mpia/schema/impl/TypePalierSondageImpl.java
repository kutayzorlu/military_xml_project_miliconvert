/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeAngle;
import mpia.meta.TypeDataTypePression;
import mpia.meta.TypeDataTypeTemperature;
import mpia.meta.TypeDataTypeVitesseLineaire;

import mpia.schema.SchemaPackage;
import mpia.schema.TypePalierSondage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Palier Sondage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypePalierSondageImpl#getNumeroPalier <em>Numero Palier</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePalierSondageImpl#getPression <em>Pression</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePalierSondageImpl#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePalierSondageImpl#getVitesseVent <em>Vitesse Vent</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePalierSondageImpl#getDirectionProvenanceVent <em>Direction Provenance Vent</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePalierSondageImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePalierSondageImpl#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypePalierSondageImpl extends EObjectImpl implements TypePalierSondage {
	/**
	 * The default value of the '{@link #getNumeroPalier() <em>Numero Palier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroPalier()
	 * @generated
	 * @ordered
	 */
	protected static final long NUMERO_PALIER_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNumeroPalier() <em>Numero Palier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroPalier()
	 * @generated
	 * @ordered
	 */
	protected long numeroPalier = NUMERO_PALIER_EDEFAULT;

	/**
	 * This is true if the Numero Palier attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numeroPalierESet;

	/**
	 * The cached value of the '{@link #getPression() <em>Pression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPression()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypePression pression;

	/**
	 * The cached value of the '{@link #getTemperature() <em>Temperature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperature()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeTemperature temperature;

	/**
	 * The cached value of the '{@link #getVitesseVent() <em>Vitesse Vent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesseVent()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeVitesseLineaire vitesseVent;

	/**
	 * The cached value of the '{@link #getDirectionProvenanceVent() <em>Direction Provenance Vent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectionProvenanceVent()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeAngle directionProvenanceVent;

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
	protected TypePalierSondageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypePalierSondage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNumeroPalier() {
		return numeroPalier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroPalier(long newNumeroPalier) {
		long oldNumeroPalier = numeroPalier;
		numeroPalier = newNumeroPalier;
		boolean oldNumeroPalierESet = numeroPalierESet;
		numeroPalierESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PALIER_SONDAGE__NUMERO_PALIER, oldNumeroPalier, numeroPalier, !oldNumeroPalierESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumeroPalier() {
		long oldNumeroPalier = numeroPalier;
		boolean oldNumeroPalierESet = numeroPalierESet;
		numeroPalier = NUMERO_PALIER_EDEFAULT;
		numeroPalierESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PALIER_SONDAGE__NUMERO_PALIER, oldNumeroPalier, NUMERO_PALIER_EDEFAULT, oldNumeroPalierESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumeroPalier() {
		return numeroPalierESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypePression getPression() {
		return pression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPression(TypeDataTypePression newPression, NotificationChain msgs) {
		TypeDataTypePression oldPression = pression;
		pression = newPression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PALIER_SONDAGE__PRESSION, oldPression, newPression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPression(TypeDataTypePression newPression) {
		if (newPression != pression) {
			NotificationChain msgs = null;
			if (pression != null)
				msgs = ((InternalEObject)pression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PALIER_SONDAGE__PRESSION, null, msgs);
			if (newPression != null)
				msgs = ((InternalEObject)newPression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PALIER_SONDAGE__PRESSION, null, msgs);
			msgs = basicSetPression(newPression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PALIER_SONDAGE__PRESSION, newPression, newPression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeTemperature getTemperature() {
		return temperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemperature(TypeDataTypeTemperature newTemperature, NotificationChain msgs) {
		TypeDataTypeTemperature oldTemperature = temperature;
		temperature = newTemperature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PALIER_SONDAGE__TEMPERATURE, oldTemperature, newTemperature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemperature(TypeDataTypeTemperature newTemperature) {
		if (newTemperature != temperature) {
			NotificationChain msgs = null;
			if (temperature != null)
				msgs = ((InternalEObject)temperature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PALIER_SONDAGE__TEMPERATURE, null, msgs);
			if (newTemperature != null)
				msgs = ((InternalEObject)newTemperature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PALIER_SONDAGE__TEMPERATURE, null, msgs);
			msgs = basicSetTemperature(newTemperature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PALIER_SONDAGE__TEMPERATURE, newTemperature, newTemperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeVitesseLineaire getVitesseVent() {
		return vitesseVent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVitesseVent(TypeDataTypeVitesseLineaire newVitesseVent, NotificationChain msgs) {
		TypeDataTypeVitesseLineaire oldVitesseVent = vitesseVent;
		vitesseVent = newVitesseVent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PALIER_SONDAGE__VITESSE_VENT, oldVitesseVent, newVitesseVent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVitesseVent(TypeDataTypeVitesseLineaire newVitesseVent) {
		if (newVitesseVent != vitesseVent) {
			NotificationChain msgs = null;
			if (vitesseVent != null)
				msgs = ((InternalEObject)vitesseVent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PALIER_SONDAGE__VITESSE_VENT, null, msgs);
			if (newVitesseVent != null)
				msgs = ((InternalEObject)newVitesseVent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PALIER_SONDAGE__VITESSE_VENT, null, msgs);
			msgs = basicSetVitesseVent(newVitesseVent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PALIER_SONDAGE__VITESSE_VENT, newVitesseVent, newVitesseVent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeAngle getDirectionProvenanceVent() {
		return directionProvenanceVent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDirectionProvenanceVent(TypeDataTypeAngle newDirectionProvenanceVent, NotificationChain msgs) {
		TypeDataTypeAngle oldDirectionProvenanceVent = directionProvenanceVent;
		directionProvenanceVent = newDirectionProvenanceVent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PALIER_SONDAGE__DIRECTION_PROVENANCE_VENT, oldDirectionProvenanceVent, newDirectionProvenanceVent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectionProvenanceVent(TypeDataTypeAngle newDirectionProvenanceVent) {
		if (newDirectionProvenanceVent != directionProvenanceVent) {
			NotificationChain msgs = null;
			if (directionProvenanceVent != null)
				msgs = ((InternalEObject)directionProvenanceVent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PALIER_SONDAGE__DIRECTION_PROVENANCE_VENT, null, msgs);
			if (newDirectionProvenanceVent != null)
				msgs = ((InternalEObject)newDirectionProvenanceVent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PALIER_SONDAGE__DIRECTION_PROVENANCE_VENT, null, msgs);
			msgs = basicSetDirectionProvenanceVent(newDirectionProvenanceVent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PALIER_SONDAGE__DIRECTION_PROVENANCE_VENT, newDirectionProvenanceVent, newDirectionProvenanceVent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PALIER_SONDAGE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PALIER_SONDAGE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_PALIER_SONDAGE__PRESSION:
				return basicSetPression(null, msgs);
			case SchemaPackage.TYPE_PALIER_SONDAGE__TEMPERATURE:
				return basicSetTemperature(null, msgs);
			case SchemaPackage.TYPE_PALIER_SONDAGE__VITESSE_VENT:
				return basicSetVitesseVent(null, msgs);
			case SchemaPackage.TYPE_PALIER_SONDAGE__DIRECTION_PROVENANCE_VENT:
				return basicSetDirectionProvenanceVent(null, msgs);
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
			case SchemaPackage.TYPE_PALIER_SONDAGE__NUMERO_PALIER:
				return new Long(getNumeroPalier());
			case SchemaPackage.TYPE_PALIER_SONDAGE__PRESSION:
				return getPression();
			case SchemaPackage.TYPE_PALIER_SONDAGE__TEMPERATURE:
				return getTemperature();
			case SchemaPackage.TYPE_PALIER_SONDAGE__VITESSE_VENT:
				return getVitesseVent();
			case SchemaPackage.TYPE_PALIER_SONDAGE__DIRECTION_PROVENANCE_VENT:
				return getDirectionProvenanceVent();
			case SchemaPackage.TYPE_PALIER_SONDAGE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_PALIER_SONDAGE__CE:
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
			case SchemaPackage.TYPE_PALIER_SONDAGE__NUMERO_PALIER:
				setNumeroPalier(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_PALIER_SONDAGE__PRESSION:
				setPression((TypeDataTypePression)newValue);
				return;
			case SchemaPackage.TYPE_PALIER_SONDAGE__TEMPERATURE:
				setTemperature((TypeDataTypeTemperature)newValue);
				return;
			case SchemaPackage.TYPE_PALIER_SONDAGE__VITESSE_VENT:
				setVitesseVent((TypeDataTypeVitesseLineaire)newValue);
				return;
			case SchemaPackage.TYPE_PALIER_SONDAGE__DIRECTION_PROVENANCE_VENT:
				setDirectionProvenanceVent((TypeDataTypeAngle)newValue);
				return;
			case SchemaPackage.TYPE_PALIER_SONDAGE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_PALIER_SONDAGE__CE:
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
			case SchemaPackage.TYPE_PALIER_SONDAGE__NUMERO_PALIER:
				unsetNumeroPalier();
				return;
			case SchemaPackage.TYPE_PALIER_SONDAGE__PRESSION:
				setPression((TypeDataTypePression)null);
				return;
			case SchemaPackage.TYPE_PALIER_SONDAGE__TEMPERATURE:
				setTemperature((TypeDataTypeTemperature)null);
				return;
			case SchemaPackage.TYPE_PALIER_SONDAGE__VITESSE_VENT:
				setVitesseVent((TypeDataTypeVitesseLineaire)null);
				return;
			case SchemaPackage.TYPE_PALIER_SONDAGE__DIRECTION_PROVENANCE_VENT:
				setDirectionProvenanceVent((TypeDataTypeAngle)null);
				return;
			case SchemaPackage.TYPE_PALIER_SONDAGE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PALIER_SONDAGE__CE:
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
			case SchemaPackage.TYPE_PALIER_SONDAGE__NUMERO_PALIER:
				return isSetNumeroPalier();
			case SchemaPackage.TYPE_PALIER_SONDAGE__PRESSION:
				return pression != null;
			case SchemaPackage.TYPE_PALIER_SONDAGE__TEMPERATURE:
				return temperature != null;
			case SchemaPackage.TYPE_PALIER_SONDAGE__VITESSE_VENT:
				return vitesseVent != null;
			case SchemaPackage.TYPE_PALIER_SONDAGE__DIRECTION_PROVENANCE_VENT:
				return directionProvenanceVent != null;
			case SchemaPackage.TYPE_PALIER_SONDAGE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_PALIER_SONDAGE__CE:
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
		result.append(" (numeroPalier: ");
		if (numeroPalierESet) result.append(numeroPalier); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypePalierSondageImpl
