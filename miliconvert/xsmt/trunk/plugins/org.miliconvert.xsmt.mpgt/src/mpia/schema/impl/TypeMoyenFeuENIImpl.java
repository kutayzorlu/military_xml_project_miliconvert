/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoMoyenFeuENITypeMoyenFeuENI;
import mpia.schema.TypeMoyenFeuENI;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Moyen Feu ENI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMoyenFeuENIImpl#getTypeMoyenFeuENI <em>Type Moyen Feu ENI</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyenFeuENIImpl#getMoyenFeuENInonRepertorie <em>Moyen Feu EN Inon Repertorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyenFeuENIImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyenFeuENIImpl#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMoyenFeuENIImpl extends EObjectImpl implements TypeMoyenFeuENI {
	/**
	 * The default value of the '{@link #getTypeMoyenFeuENI() <em>Type Moyen Feu ENI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMoyenFeuENI()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoMoyenFeuENITypeMoyenFeuENI TYPE_MOYEN_FEU_ENI_EDEFAULT = TypeDictionaryDicoMoyenFeuENITypeMoyenFeuENI.AIRASF;

	/**
	 * The cached value of the '{@link #getTypeMoyenFeuENI() <em>Type Moyen Feu ENI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMoyenFeuENI()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoMoyenFeuENITypeMoyenFeuENI typeMoyenFeuENI = TYPE_MOYEN_FEU_ENI_EDEFAULT;

	/**
	 * This is true if the Type Moyen Feu ENI attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeMoyenFeuENIESet;

	/**
	 * The default value of the '{@link #getMoyenFeuENInonRepertorie() <em>Moyen Feu EN Inon Repertorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyenFeuENInonRepertorie()
	 * @generated
	 * @ordered
	 */
	protected static final String MOYEN_FEU_EN_INON_REPERTORIE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMoyenFeuENInonRepertorie() <em>Moyen Feu EN Inon Repertorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyenFeuENInonRepertorie()
	 * @generated
	 * @ordered
	 */
	protected String moyenFeuENInonRepertorie = MOYEN_FEU_EN_INON_REPERTORIE_EDEFAULT;

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
	protected TypeMoyenFeuENIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMoyenFeuENI();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoMoyenFeuENITypeMoyenFeuENI getTypeMoyenFeuENI() {
		return typeMoyenFeuENI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeMoyenFeuENI(TypeDictionaryDicoMoyenFeuENITypeMoyenFeuENI newTypeMoyenFeuENI) {
		TypeDictionaryDicoMoyenFeuENITypeMoyenFeuENI oldTypeMoyenFeuENI = typeMoyenFeuENI;
		typeMoyenFeuENI = newTypeMoyenFeuENI == null ? TYPE_MOYEN_FEU_ENI_EDEFAULT : newTypeMoyenFeuENI;
		boolean oldTypeMoyenFeuENIESet = typeMoyenFeuENIESet;
		typeMoyenFeuENIESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYEN_FEU_ENI__TYPE_MOYEN_FEU_ENI, oldTypeMoyenFeuENI, typeMoyenFeuENI, !oldTypeMoyenFeuENIESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeMoyenFeuENI() {
		TypeDictionaryDicoMoyenFeuENITypeMoyenFeuENI oldTypeMoyenFeuENI = typeMoyenFeuENI;
		boolean oldTypeMoyenFeuENIESet = typeMoyenFeuENIESet;
		typeMoyenFeuENI = TYPE_MOYEN_FEU_ENI_EDEFAULT;
		typeMoyenFeuENIESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MOYEN_FEU_ENI__TYPE_MOYEN_FEU_ENI, oldTypeMoyenFeuENI, TYPE_MOYEN_FEU_ENI_EDEFAULT, oldTypeMoyenFeuENIESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeMoyenFeuENI() {
		return typeMoyenFeuENIESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMoyenFeuENInonRepertorie() {
		return moyenFeuENInonRepertorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoyenFeuENInonRepertorie(String newMoyenFeuENInonRepertorie) {
		String oldMoyenFeuENInonRepertorie = moyenFeuENInonRepertorie;
		moyenFeuENInonRepertorie = newMoyenFeuENInonRepertorie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYEN_FEU_ENI__MOYEN_FEU_EN_INON_REPERTORIE, oldMoyenFeuENInonRepertorie, moyenFeuENInonRepertorie));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYEN_FEU_ENI__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYEN_FEU_ENI__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_MOYEN_FEU_ENI__TYPE_MOYEN_FEU_ENI:
				return getTypeMoyenFeuENI();
			case SchemaPackage.TYPE_MOYEN_FEU_ENI__MOYEN_FEU_EN_INON_REPERTORIE:
				return getMoyenFeuENInonRepertorie();
			case SchemaPackage.TYPE_MOYEN_FEU_ENI__CTE:
				return getCTE();
			case SchemaPackage.TYPE_MOYEN_FEU_ENI__CE:
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
			case SchemaPackage.TYPE_MOYEN_FEU_ENI__TYPE_MOYEN_FEU_ENI:
				setTypeMoyenFeuENI((TypeDictionaryDicoMoyenFeuENITypeMoyenFeuENI)newValue);
				return;
			case SchemaPackage.TYPE_MOYEN_FEU_ENI__MOYEN_FEU_EN_INON_REPERTORIE:
				setMoyenFeuENInonRepertorie((String)newValue);
				return;
			case SchemaPackage.TYPE_MOYEN_FEU_ENI__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_MOYEN_FEU_ENI__CE:
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
			case SchemaPackage.TYPE_MOYEN_FEU_ENI__TYPE_MOYEN_FEU_ENI:
				unsetTypeMoyenFeuENI();
				return;
			case SchemaPackage.TYPE_MOYEN_FEU_ENI__MOYEN_FEU_EN_INON_REPERTORIE:
				setMoyenFeuENInonRepertorie(MOYEN_FEU_EN_INON_REPERTORIE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MOYEN_FEU_ENI__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MOYEN_FEU_ENI__CE:
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
			case SchemaPackage.TYPE_MOYEN_FEU_ENI__TYPE_MOYEN_FEU_ENI:
				return isSetTypeMoyenFeuENI();
			case SchemaPackage.TYPE_MOYEN_FEU_ENI__MOYEN_FEU_EN_INON_REPERTORIE:
				return MOYEN_FEU_EN_INON_REPERTORIE_EDEFAULT == null ? moyenFeuENInonRepertorie != null : !MOYEN_FEU_EN_INON_REPERTORIE_EDEFAULT.equals(moyenFeuENInonRepertorie);
			case SchemaPackage.TYPE_MOYEN_FEU_ENI__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_MOYEN_FEU_ENI__CE:
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
		result.append(" (typeMoyenFeuENI: ");
		if (typeMoyenFeuENIESet) result.append(typeMoyenFeuENI); else result.append("<unset>");
		result.append(", moyenFeuENInonRepertorie: ");
		result.append(moyenFeuENInonRepertorie);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeMoyenFeuENIImpl
