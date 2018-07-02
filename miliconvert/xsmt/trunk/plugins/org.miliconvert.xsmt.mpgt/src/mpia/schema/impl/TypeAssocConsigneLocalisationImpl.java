/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssocConsigneLocalisation;
import mpia.schema.TypeLocalisation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Assoc Consigne Localisation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssocConsigneLocalisationImpl#getNumeroOrdre <em>Numero Ordre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssocConsigneLocalisationImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssocConsigneLocalisationImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssocConsigneLocalisationImpl#getEstLocaliseEnLocalisation <em>Est Localise En Localisation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssocConsigneLocalisationImpl extends EObjectImpl implements TypeAssocConsigneLocalisation {
	/**
	 * The default value of the '{@link #getNumeroOrdre() <em>Numero Ordre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroOrdre()
	 * @generated
	 * @ordered
	 */
	protected static final long NUMERO_ORDRE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNumeroOrdre() <em>Numero Ordre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroOrdre()
	 * @generated
	 * @ordered
	 */
	protected long numeroOrdre = NUMERO_ORDRE_EDEFAULT;

	/**
	 * This is true if the Numero Ordre attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numeroOrdreESet;

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
	 * The cached value of the '{@link #getEstLocaliseEnLocalisation() <em>Est Localise En Localisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstLocaliseEnLocalisation()
	 * @generated
	 * @ordered
	 */
	protected TypeLocalisation estLocaliseEnLocalisation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssocConsigneLocalisationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssocConsigneLocalisation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNumeroOrdre() {
		return numeroOrdre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroOrdre(long newNumeroOrdre) {
		long oldNumeroOrdre = numeroOrdre;
		numeroOrdre = newNumeroOrdre;
		boolean oldNumeroOrdreESet = numeroOrdreESet;
		numeroOrdreESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_CONSIGNE_LOCALISATION__NUMERO_ORDRE, oldNumeroOrdre, numeroOrdre, !oldNumeroOrdreESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumeroOrdre() {
		long oldNumeroOrdre = numeroOrdre;
		boolean oldNumeroOrdreESet = numeroOrdreESet;
		numeroOrdre = NUMERO_ORDRE_EDEFAULT;
		numeroOrdreESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOC_CONSIGNE_LOCALISATION__NUMERO_ORDRE, oldNumeroOrdre, NUMERO_ORDRE_EDEFAULT, oldNumeroOrdreESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumeroOrdre() {
		return numeroOrdreESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_CONSIGNE_LOCALISATION__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_CONSIGNE_LOCALISATION__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeLocalisation getEstLocaliseEnLocalisation() {
		return estLocaliseEnLocalisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstLocaliseEnLocalisation(TypeLocalisation newEstLocaliseEnLocalisation, NotificationChain msgs) {
		TypeLocalisation oldEstLocaliseEnLocalisation = estLocaliseEnLocalisation;
		estLocaliseEnLocalisation = newEstLocaliseEnLocalisation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_CONSIGNE_LOCALISATION__EST_LOCALISE_EN_LOCALISATION, oldEstLocaliseEnLocalisation, newEstLocaliseEnLocalisation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstLocaliseEnLocalisation(TypeLocalisation newEstLocaliseEnLocalisation) {
		if (newEstLocaliseEnLocalisation != estLocaliseEnLocalisation) {
			NotificationChain msgs = null;
			if (estLocaliseEnLocalisation != null)
				msgs = ((InternalEObject)estLocaliseEnLocalisation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOC_CONSIGNE_LOCALISATION__EST_LOCALISE_EN_LOCALISATION, null, msgs);
			if (newEstLocaliseEnLocalisation != null)
				msgs = ((InternalEObject)newEstLocaliseEnLocalisation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOC_CONSIGNE_LOCALISATION__EST_LOCALISE_EN_LOCALISATION, null, msgs);
			msgs = basicSetEstLocaliseEnLocalisation(newEstLocaliseEnLocalisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_CONSIGNE_LOCALISATION__EST_LOCALISE_EN_LOCALISATION, newEstLocaliseEnLocalisation, newEstLocaliseEnLocalisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOC_CONSIGNE_LOCALISATION__EST_LOCALISE_EN_LOCALISATION:
				return basicSetEstLocaliseEnLocalisation(null, msgs);
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
			case SchemaPackage.TYPE_ASSOC_CONSIGNE_LOCALISATION__NUMERO_ORDRE:
				return new Long(getNumeroOrdre());
			case SchemaPackage.TYPE_ASSOC_CONSIGNE_LOCALISATION__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ASSOC_CONSIGNE_LOCALISATION__CE:
				return getCE();
			case SchemaPackage.TYPE_ASSOC_CONSIGNE_LOCALISATION__EST_LOCALISE_EN_LOCALISATION:
				return getEstLocaliseEnLocalisation();
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
			case SchemaPackage.TYPE_ASSOC_CONSIGNE_LOCALISATION__NUMERO_ORDRE:
				setNumeroOrdre(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_ASSOC_CONSIGNE_LOCALISATION__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOC_CONSIGNE_LOCALISATION__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOC_CONSIGNE_LOCALISATION__EST_LOCALISE_EN_LOCALISATION:
				setEstLocaliseEnLocalisation((TypeLocalisation)newValue);
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
			case SchemaPackage.TYPE_ASSOC_CONSIGNE_LOCALISATION__NUMERO_ORDRE:
				unsetNumeroOrdre();
				return;
			case SchemaPackage.TYPE_ASSOC_CONSIGNE_LOCALISATION__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOC_CONSIGNE_LOCALISATION__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOC_CONSIGNE_LOCALISATION__EST_LOCALISE_EN_LOCALISATION:
				setEstLocaliseEnLocalisation((TypeLocalisation)null);
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
			case SchemaPackage.TYPE_ASSOC_CONSIGNE_LOCALISATION__NUMERO_ORDRE:
				return isSetNumeroOrdre();
			case SchemaPackage.TYPE_ASSOC_CONSIGNE_LOCALISATION__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ASSOC_CONSIGNE_LOCALISATION__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ASSOC_CONSIGNE_LOCALISATION__EST_LOCALISE_EN_LOCALISATION:
				return estLocaliseEnLocalisation != null;
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
		result.append(" (numeroOrdre: ");
		if (numeroOrdreESet) result.append(numeroOrdre); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeAssocConsigneLocalisationImpl
