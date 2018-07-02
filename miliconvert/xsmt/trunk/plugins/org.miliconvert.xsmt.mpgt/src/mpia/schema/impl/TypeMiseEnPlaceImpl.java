/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDotationEffectiveConsommable;
import mpia.schema.TypeMiseEnPlace;

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
 * An implementation of the model object '<em><b>Type Mise En Place</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMiseEnPlaceImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMiseEnPlaceImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMiseEnPlaceImpl#getEstMiseEnPlaceParUnite <em>Est Mise En Place Par Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMiseEnPlaceImpl#getAPourRessourcesAEmporterDotationEffectiveConsommable <em>APour Ressources AEmporter Dotation Effective Consommable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMiseEnPlaceImpl extends EObjectImpl implements TypeMiseEnPlace {
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
	 * The cached value of the '{@link #getEstMiseEnPlaceParUnite() <em>Est Mise En Place Par Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstMiseEnPlaceParUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT estMiseEnPlaceParUnite;

	/**
	 * The cached value of the '{@link #getAPourRessourcesAEmporterDotationEffectiveConsommable() <em>APour Ressources AEmporter Dotation Effective Consommable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourRessourcesAEmporterDotationEffectiveConsommable()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeDotationEffectiveConsommable> aPourRessourcesAEmporterDotationEffectiveConsommable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMiseEnPlaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMiseEnPlace();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISE_EN_PLACE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISE_EN_PLACE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getEstMiseEnPlaceParUnite() {
		return estMiseEnPlaceParUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstMiseEnPlaceParUnite(TypeAssociationEXT newEstMiseEnPlaceParUnite, NotificationChain msgs) {
		TypeAssociationEXT oldEstMiseEnPlaceParUnite = estMiseEnPlaceParUnite;
		estMiseEnPlaceParUnite = newEstMiseEnPlaceParUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISE_EN_PLACE__EST_MISE_EN_PLACE_PAR_UNITE, oldEstMiseEnPlaceParUnite, newEstMiseEnPlaceParUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstMiseEnPlaceParUnite(TypeAssociationEXT newEstMiseEnPlaceParUnite) {
		if (newEstMiseEnPlaceParUnite != estMiseEnPlaceParUnite) {
			NotificationChain msgs = null;
			if (estMiseEnPlaceParUnite != null)
				msgs = ((InternalEObject)estMiseEnPlaceParUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISE_EN_PLACE__EST_MISE_EN_PLACE_PAR_UNITE, null, msgs);
			if (newEstMiseEnPlaceParUnite != null)
				msgs = ((InternalEObject)newEstMiseEnPlaceParUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISE_EN_PLACE__EST_MISE_EN_PLACE_PAR_UNITE, null, msgs);
			msgs = basicSetEstMiseEnPlaceParUnite(newEstMiseEnPlaceParUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISE_EN_PLACE__EST_MISE_EN_PLACE_PAR_UNITE, newEstMiseEnPlaceParUnite, newEstMiseEnPlaceParUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeDotationEffectiveConsommable> getAPourRessourcesAEmporterDotationEffectiveConsommable() {
		if (aPourRessourcesAEmporterDotationEffectiveConsommable == null) {
			aPourRessourcesAEmporterDotationEffectiveConsommable = new EObjectContainmentEList<TypeDotationEffectiveConsommable>(TypeDotationEffectiveConsommable.class, this, SchemaPackage.TYPE_MISE_EN_PLACE__APOUR_RESSOURCES_AEMPORTER_DOTATION_EFFECTIVE_CONSOMMABLE);
		}
		return aPourRessourcesAEmporterDotationEffectiveConsommable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MISE_EN_PLACE__EST_MISE_EN_PLACE_PAR_UNITE:
				return basicSetEstMiseEnPlaceParUnite(null, msgs);
			case SchemaPackage.TYPE_MISE_EN_PLACE__APOUR_RESSOURCES_AEMPORTER_DOTATION_EFFECTIVE_CONSOMMABLE:
				return ((InternalEList<?>)getAPourRessourcesAEmporterDotationEffectiveConsommable()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_MISE_EN_PLACE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_MISE_EN_PLACE__CE:
				return getCE();
			case SchemaPackage.TYPE_MISE_EN_PLACE__EST_MISE_EN_PLACE_PAR_UNITE:
				return getEstMiseEnPlaceParUnite();
			case SchemaPackage.TYPE_MISE_EN_PLACE__APOUR_RESSOURCES_AEMPORTER_DOTATION_EFFECTIVE_CONSOMMABLE:
				return getAPourRessourcesAEmporterDotationEffectiveConsommable();
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
			case SchemaPackage.TYPE_MISE_EN_PLACE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_MISE_EN_PLACE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_MISE_EN_PLACE__EST_MISE_EN_PLACE_PAR_UNITE:
				setEstMiseEnPlaceParUnite((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_MISE_EN_PLACE__APOUR_RESSOURCES_AEMPORTER_DOTATION_EFFECTIVE_CONSOMMABLE:
				getAPourRessourcesAEmporterDotationEffectiveConsommable().clear();
				getAPourRessourcesAEmporterDotationEffectiveConsommable().addAll((Collection<? extends TypeDotationEffectiveConsommable>)newValue);
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
			case SchemaPackage.TYPE_MISE_EN_PLACE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISE_EN_PLACE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISE_EN_PLACE__EST_MISE_EN_PLACE_PAR_UNITE:
				setEstMiseEnPlaceParUnite((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_MISE_EN_PLACE__APOUR_RESSOURCES_AEMPORTER_DOTATION_EFFECTIVE_CONSOMMABLE:
				getAPourRessourcesAEmporterDotationEffectiveConsommable().clear();
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
			case SchemaPackage.TYPE_MISE_EN_PLACE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_MISE_EN_PLACE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_MISE_EN_PLACE__EST_MISE_EN_PLACE_PAR_UNITE:
				return estMiseEnPlaceParUnite != null;
			case SchemaPackage.TYPE_MISE_EN_PLACE__APOUR_RESSOURCES_AEMPORTER_DOTATION_EFFECTIVE_CONSOMMABLE:
				return aPourRessourcesAEmporterDotationEffectiveConsommable != null && !aPourRessourcesAEmporterDotationEffectiveConsommable.isEmpty();
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
		result.append(" (cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeMiseEnPlaceImpl
