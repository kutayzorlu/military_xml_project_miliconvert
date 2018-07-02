/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeMementoGenie;

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
 * An implementation of the model object '<em><b>Type Memento Genie</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMementoGenieImpl#isReference <em>Reference</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMementoGenieImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMementoGenieImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMementoGenieImpl#getAPourVarianteRealisationVarianteTravail <em>APour Variante Realisation Variante Travail</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMementoGenieImpl extends EObjectImpl implements TypeMementoGenie {
	/**
	 * The default value of the '{@link #isReference() <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReference()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REFERENCE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReference() <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReference()
	 * @generated
	 * @ordered
	 */
	protected boolean reference = REFERENCE_EDEFAULT;

	/**
	 * This is true if the Reference attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean referenceESet;

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
	 * The cached value of the '{@link #getAPourVarianteRealisationVarianteTravail() <em>APour Variante Realisation Variante Travail</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourVarianteRealisationVarianteTravail()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourVarianteRealisationVarianteTravail;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMementoGenieImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMementoGenie();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(boolean newReference) {
		boolean oldReference = reference;
		reference = newReference;
		boolean oldReferenceESet = referenceESet;
		referenceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MEMENTO_GENIE__REFERENCE, oldReference, reference, !oldReferenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReference() {
		boolean oldReference = reference;
		boolean oldReferenceESet = referenceESet;
		reference = REFERENCE_EDEFAULT;
		referenceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MEMENTO_GENIE__REFERENCE, oldReference, REFERENCE_EDEFAULT, oldReferenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReference() {
		return referenceESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MEMENTO_GENIE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MEMENTO_GENIE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourVarianteRealisationVarianteTravail() {
		if (aPourVarianteRealisationVarianteTravail == null) {
			aPourVarianteRealisationVarianteTravail = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MEMENTO_GENIE__APOUR_VARIANTE_REALISATION_VARIANTE_TRAVAIL);
		}
		return aPourVarianteRealisationVarianteTravail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MEMENTO_GENIE__APOUR_VARIANTE_REALISATION_VARIANTE_TRAVAIL:
				return ((InternalEList<?>)getAPourVarianteRealisationVarianteTravail()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_MEMENTO_GENIE__REFERENCE:
				return isReference() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_MEMENTO_GENIE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_MEMENTO_GENIE__CE:
				return getCE();
			case SchemaPackage.TYPE_MEMENTO_GENIE__APOUR_VARIANTE_REALISATION_VARIANTE_TRAVAIL:
				return getAPourVarianteRealisationVarianteTravail();
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
			case SchemaPackage.TYPE_MEMENTO_GENIE__REFERENCE:
				setReference(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_MEMENTO_GENIE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_MEMENTO_GENIE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_MEMENTO_GENIE__APOUR_VARIANTE_REALISATION_VARIANTE_TRAVAIL:
				getAPourVarianteRealisationVarianteTravail().clear();
				getAPourVarianteRealisationVarianteTravail().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_MEMENTO_GENIE__REFERENCE:
				unsetReference();
				return;
			case SchemaPackage.TYPE_MEMENTO_GENIE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MEMENTO_GENIE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MEMENTO_GENIE__APOUR_VARIANTE_REALISATION_VARIANTE_TRAVAIL:
				getAPourVarianteRealisationVarianteTravail().clear();
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
			case SchemaPackage.TYPE_MEMENTO_GENIE__REFERENCE:
				return isSetReference();
			case SchemaPackage.TYPE_MEMENTO_GENIE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_MEMENTO_GENIE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_MEMENTO_GENIE__APOUR_VARIANTE_REALISATION_VARIANTE_TRAVAIL:
				return aPourVarianteRealisationVarianteTravail != null && !aPourVarianteRealisationVarianteTravail.isEmpty();
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
		result.append(" (reference: ");
		if (referenceESet) result.append(reference); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeMementoGenieImpl
