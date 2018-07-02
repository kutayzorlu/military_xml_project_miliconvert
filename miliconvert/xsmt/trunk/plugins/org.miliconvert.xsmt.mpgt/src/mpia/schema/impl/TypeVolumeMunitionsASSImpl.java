/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeVolumeMunitionsASS;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Volume Munitions ASS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeVolumeMunitionsASSImpl#getQuantiteProjectiles <em>Quantite Projectiles</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeVolumeMunitionsASSImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeVolumeMunitionsASSImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeVolumeMunitionsASSImpl#getEstTypeTypeMunition <em>Est Type Type Munition</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeVolumeMunitionsASSImpl#getAPourTypeDeLanceurTypeArme <em>APour Type De Lanceur Type Arme</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeVolumeMunitionsASSImpl extends EObjectImpl implements TypeVolumeMunitionsASS {
	/**
	 * The default value of the '{@link #getQuantiteProjectiles() <em>Quantite Projectiles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteProjectiles()
	 * @generated
	 * @ordered
	 */
	protected static final long QUANTITE_PROJECTILES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getQuantiteProjectiles() <em>Quantite Projectiles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteProjectiles()
	 * @generated
	 * @ordered
	 */
	protected long quantiteProjectiles = QUANTITE_PROJECTILES_EDEFAULT;

	/**
	 * This is true if the Quantite Projectiles attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean quantiteProjectilesESet;

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
	 * The cached value of the '{@link #getEstTypeTypeMunition() <em>Est Type Type Munition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstTypeTypeMunition()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT estTypeTypeMunition;

	/**
	 * The cached value of the '{@link #getAPourTypeDeLanceurTypeArme() <em>APour Type De Lanceur Type Arme</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourTypeDeLanceurTypeArme()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aPourTypeDeLanceurTypeArme;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeVolumeMunitionsASSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeVolumeMunitionsASS();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getQuantiteProjectiles() {
		return quantiteProjectiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantiteProjectiles(long newQuantiteProjectiles) {
		long oldQuantiteProjectiles = quantiteProjectiles;
		quantiteProjectiles = newQuantiteProjectiles;
		boolean oldQuantiteProjectilesESet = quantiteProjectilesESet;
		quantiteProjectilesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VOLUME_MUNITIONS_ASS__QUANTITE_PROJECTILES, oldQuantiteProjectiles, quantiteProjectiles, !oldQuantiteProjectilesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQuantiteProjectiles() {
		long oldQuantiteProjectiles = quantiteProjectiles;
		boolean oldQuantiteProjectilesESet = quantiteProjectilesESet;
		quantiteProjectiles = QUANTITE_PROJECTILES_EDEFAULT;
		quantiteProjectilesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_VOLUME_MUNITIONS_ASS__QUANTITE_PROJECTILES, oldQuantiteProjectiles, QUANTITE_PROJECTILES_EDEFAULT, oldQuantiteProjectilesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQuantiteProjectiles() {
		return quantiteProjectilesESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VOLUME_MUNITIONS_ASS__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VOLUME_MUNITIONS_ASS__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getEstTypeTypeMunition() {
		return estTypeTypeMunition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstTypeTypeMunition(TypeAssociationEXT newEstTypeTypeMunition, NotificationChain msgs) {
		TypeAssociationEXT oldEstTypeTypeMunition = estTypeTypeMunition;
		estTypeTypeMunition = newEstTypeTypeMunition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VOLUME_MUNITIONS_ASS__EST_TYPE_TYPE_MUNITION, oldEstTypeTypeMunition, newEstTypeTypeMunition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstTypeTypeMunition(TypeAssociationEXT newEstTypeTypeMunition) {
		if (newEstTypeTypeMunition != estTypeTypeMunition) {
			NotificationChain msgs = null;
			if (estTypeTypeMunition != null)
				msgs = ((InternalEObject)estTypeTypeMunition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_VOLUME_MUNITIONS_ASS__EST_TYPE_TYPE_MUNITION, null, msgs);
			if (newEstTypeTypeMunition != null)
				msgs = ((InternalEObject)newEstTypeTypeMunition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_VOLUME_MUNITIONS_ASS__EST_TYPE_TYPE_MUNITION, null, msgs);
			msgs = basicSetEstTypeTypeMunition(newEstTypeTypeMunition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VOLUME_MUNITIONS_ASS__EST_TYPE_TYPE_MUNITION, newEstTypeTypeMunition, newEstTypeTypeMunition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAPourTypeDeLanceurTypeArme() {
		return aPourTypeDeLanceurTypeArme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourTypeDeLanceurTypeArme(TypeAssociationEXT newAPourTypeDeLanceurTypeArme, NotificationChain msgs) {
		TypeAssociationEXT oldAPourTypeDeLanceurTypeArme = aPourTypeDeLanceurTypeArme;
		aPourTypeDeLanceurTypeArme = newAPourTypeDeLanceurTypeArme;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VOLUME_MUNITIONS_ASS__APOUR_TYPE_DE_LANCEUR_TYPE_ARME, oldAPourTypeDeLanceurTypeArme, newAPourTypeDeLanceurTypeArme);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourTypeDeLanceurTypeArme(TypeAssociationEXT newAPourTypeDeLanceurTypeArme) {
		if (newAPourTypeDeLanceurTypeArme != aPourTypeDeLanceurTypeArme) {
			NotificationChain msgs = null;
			if (aPourTypeDeLanceurTypeArme != null)
				msgs = ((InternalEObject)aPourTypeDeLanceurTypeArme).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_VOLUME_MUNITIONS_ASS__APOUR_TYPE_DE_LANCEUR_TYPE_ARME, null, msgs);
			if (newAPourTypeDeLanceurTypeArme != null)
				msgs = ((InternalEObject)newAPourTypeDeLanceurTypeArme).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_VOLUME_MUNITIONS_ASS__APOUR_TYPE_DE_LANCEUR_TYPE_ARME, null, msgs);
			msgs = basicSetAPourTypeDeLanceurTypeArme(newAPourTypeDeLanceurTypeArme, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VOLUME_MUNITIONS_ASS__APOUR_TYPE_DE_LANCEUR_TYPE_ARME, newAPourTypeDeLanceurTypeArme, newAPourTypeDeLanceurTypeArme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_VOLUME_MUNITIONS_ASS__EST_TYPE_TYPE_MUNITION:
				return basicSetEstTypeTypeMunition(null, msgs);
			case SchemaPackage.TYPE_VOLUME_MUNITIONS_ASS__APOUR_TYPE_DE_LANCEUR_TYPE_ARME:
				return basicSetAPourTypeDeLanceurTypeArme(null, msgs);
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
			case SchemaPackage.TYPE_VOLUME_MUNITIONS_ASS__QUANTITE_PROJECTILES:
				return new Long(getQuantiteProjectiles());
			case SchemaPackage.TYPE_VOLUME_MUNITIONS_ASS__CTE:
				return getCTE();
			case SchemaPackage.TYPE_VOLUME_MUNITIONS_ASS__CE:
				return getCE();
			case SchemaPackage.TYPE_VOLUME_MUNITIONS_ASS__EST_TYPE_TYPE_MUNITION:
				return getEstTypeTypeMunition();
			case SchemaPackage.TYPE_VOLUME_MUNITIONS_ASS__APOUR_TYPE_DE_LANCEUR_TYPE_ARME:
				return getAPourTypeDeLanceurTypeArme();
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
			case SchemaPackage.TYPE_VOLUME_MUNITIONS_ASS__QUANTITE_PROJECTILES:
				setQuantiteProjectiles(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_VOLUME_MUNITIONS_ASS__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_VOLUME_MUNITIONS_ASS__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_VOLUME_MUNITIONS_ASS__EST_TYPE_TYPE_MUNITION:
				setEstTypeTypeMunition((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_VOLUME_MUNITIONS_ASS__APOUR_TYPE_DE_LANCEUR_TYPE_ARME:
				setAPourTypeDeLanceurTypeArme((TypeAssociationEXT)newValue);
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
			case SchemaPackage.TYPE_VOLUME_MUNITIONS_ASS__QUANTITE_PROJECTILES:
				unsetQuantiteProjectiles();
				return;
			case SchemaPackage.TYPE_VOLUME_MUNITIONS_ASS__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_VOLUME_MUNITIONS_ASS__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_VOLUME_MUNITIONS_ASS__EST_TYPE_TYPE_MUNITION:
				setEstTypeTypeMunition((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_VOLUME_MUNITIONS_ASS__APOUR_TYPE_DE_LANCEUR_TYPE_ARME:
				setAPourTypeDeLanceurTypeArme((TypeAssociationEXT)null);
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
			case SchemaPackage.TYPE_VOLUME_MUNITIONS_ASS__QUANTITE_PROJECTILES:
				return isSetQuantiteProjectiles();
			case SchemaPackage.TYPE_VOLUME_MUNITIONS_ASS__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_VOLUME_MUNITIONS_ASS__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_VOLUME_MUNITIONS_ASS__EST_TYPE_TYPE_MUNITION:
				return estTypeTypeMunition != null;
			case SchemaPackage.TYPE_VOLUME_MUNITIONS_ASS__APOUR_TYPE_DE_LANCEUR_TYPE_ARME:
				return aPourTypeDeLanceurTypeArme != null;
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
		result.append(" (quantiteProjectiles: ");
		if (quantiteProjectilesESet) result.append(quantiteProjectiles); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeVolumeMunitionsASSImpl
