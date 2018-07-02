/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoModeFranchissement;
import mpia.schema.TypeModeFranchissement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Mode Franchissement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeModeFranchissementImpl#getModeFranchissement <em>Mode Franchissement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModeFranchissementImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModeFranchissementImpl#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeModeFranchissementImpl extends EObjectImpl implements TypeModeFranchissement {
	/**
	 * The default value of the '{@link #getModeFranchissement() <em>Mode Franchissement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeFranchissement()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoModeFranchissement MODE_FRANCHISSEMENT_EDEFAULT = TypeDictionaryDicoModeFranchissement.LR;

	/**
	 * The cached value of the '{@link #getModeFranchissement() <em>Mode Franchissement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeFranchissement()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoModeFranchissement modeFranchissement = MODE_FRANCHISSEMENT_EDEFAULT;

	/**
	 * This is true if the Mode Franchissement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean modeFranchissementESet;

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
	protected TypeModeFranchissementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeModeFranchissement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoModeFranchissement getModeFranchissement() {
		return modeFranchissement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModeFranchissement(TypeDictionaryDicoModeFranchissement newModeFranchissement) {
		TypeDictionaryDicoModeFranchissement oldModeFranchissement = modeFranchissement;
		modeFranchissement = newModeFranchissement == null ? MODE_FRANCHISSEMENT_EDEFAULT : newModeFranchissement;
		boolean oldModeFranchissementESet = modeFranchissementESet;
		modeFranchissementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODE_FRANCHISSEMENT__MODE_FRANCHISSEMENT, oldModeFranchissement, modeFranchissement, !oldModeFranchissementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetModeFranchissement() {
		TypeDictionaryDicoModeFranchissement oldModeFranchissement = modeFranchissement;
		boolean oldModeFranchissementESet = modeFranchissementESet;
		modeFranchissement = MODE_FRANCHISSEMENT_EDEFAULT;
		modeFranchissementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MODE_FRANCHISSEMENT__MODE_FRANCHISSEMENT, oldModeFranchissement, MODE_FRANCHISSEMENT_EDEFAULT, oldModeFranchissementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetModeFranchissement() {
		return modeFranchissementESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODE_FRANCHISSEMENT__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODE_FRANCHISSEMENT__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_MODE_FRANCHISSEMENT__MODE_FRANCHISSEMENT:
				return getModeFranchissement();
			case SchemaPackage.TYPE_MODE_FRANCHISSEMENT__CTE:
				return getCTE();
			case SchemaPackage.TYPE_MODE_FRANCHISSEMENT__CE:
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
			case SchemaPackage.TYPE_MODE_FRANCHISSEMENT__MODE_FRANCHISSEMENT:
				setModeFranchissement((TypeDictionaryDicoModeFranchissement)newValue);
				return;
			case SchemaPackage.TYPE_MODE_FRANCHISSEMENT__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_MODE_FRANCHISSEMENT__CE:
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
			case SchemaPackage.TYPE_MODE_FRANCHISSEMENT__MODE_FRANCHISSEMENT:
				unsetModeFranchissement();
				return;
			case SchemaPackage.TYPE_MODE_FRANCHISSEMENT__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MODE_FRANCHISSEMENT__CE:
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
			case SchemaPackage.TYPE_MODE_FRANCHISSEMENT__MODE_FRANCHISSEMENT:
				return isSetModeFranchissement();
			case SchemaPackage.TYPE_MODE_FRANCHISSEMENT__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_MODE_FRANCHISSEMENT__CE:
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
		result.append(" (modeFranchissement: ");
		if (modeFranchissementESet) result.append(modeFranchissement); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeModeFranchissementImpl
