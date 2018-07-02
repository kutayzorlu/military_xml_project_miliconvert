/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeDateHeure;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoEtatOrdreEtatExecution;
import mpia.schema.TypeEtatOrdre;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Etat Ordre</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEtatOrdreImpl#getEtatExecution <em>Etat Execution</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOrdreImpl#getDate <em>Date</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOrdreImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOrdreImpl#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeEtatOrdreImpl extends EObjectImpl implements TypeEtatOrdre {
	/**
	 * The default value of the '{@link #getEtatExecution() <em>Etat Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatExecution()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatOrdreEtatExecution ETAT_EXECUTION_EDEFAULT = TypeDictionaryDicoEtatOrdreEtatExecution.ISSUED;

	/**
	 * The cached value of the '{@link #getEtatExecution() <em>Etat Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatExecution()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatOrdreEtatExecution etatExecution = ETAT_EXECUTION_EDEFAULT;

	/**
	 * This is true if the Etat Execution attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean etatExecutionESet;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDateHeure date;

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
	protected TypeEtatOrdreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEtatOrdre();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatOrdreEtatExecution getEtatExecution() {
		return etatExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtatExecution(TypeDictionaryDicoEtatOrdreEtatExecution newEtatExecution) {
		TypeDictionaryDicoEtatOrdreEtatExecution oldEtatExecution = etatExecution;
		etatExecution = newEtatExecution == null ? ETAT_EXECUTION_EDEFAULT : newEtatExecution;
		boolean oldEtatExecutionESet = etatExecutionESet;
		etatExecutionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_ORDRE__ETAT_EXECUTION, oldEtatExecution, etatExecution, !oldEtatExecutionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEtatExecution() {
		TypeDictionaryDicoEtatOrdreEtatExecution oldEtatExecution = etatExecution;
		boolean oldEtatExecutionESet = etatExecutionESet;
		etatExecution = ETAT_EXECUTION_EDEFAULT;
		etatExecutionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_ORDRE__ETAT_EXECUTION, oldEtatExecution, ETAT_EXECUTION_EDEFAULT, oldEtatExecutionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEtatExecution() {
		return etatExecutionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDateHeure getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(TypeDataTypeDateHeure newDate, NotificationChain msgs) {
		TypeDataTypeDateHeure oldDate = date;
		date = newDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_ORDRE__DATE, oldDate, newDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(TypeDataTypeDateHeure newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ETAT_ORDRE__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ETAT_ORDRE__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_ORDRE__DATE, newDate, newDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_ORDRE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_ORDRE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ETAT_ORDRE__DATE:
				return basicSetDate(null, msgs);
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
			case SchemaPackage.TYPE_ETAT_ORDRE__ETAT_EXECUTION:
				return getEtatExecution();
			case SchemaPackage.TYPE_ETAT_ORDRE__DATE:
				return getDate();
			case SchemaPackage.TYPE_ETAT_ORDRE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ETAT_ORDRE__CE:
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
			case SchemaPackage.TYPE_ETAT_ORDRE__ETAT_EXECUTION:
				setEtatExecution((TypeDictionaryDicoEtatOrdreEtatExecution)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_ORDRE__DATE:
				setDate((TypeDataTypeDateHeure)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_ORDRE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_ORDRE__CE:
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
			case SchemaPackage.TYPE_ETAT_ORDRE__ETAT_EXECUTION:
				unsetEtatExecution();
				return;
			case SchemaPackage.TYPE_ETAT_ORDRE__DATE:
				setDate((TypeDataTypeDateHeure)null);
				return;
			case SchemaPackage.TYPE_ETAT_ORDRE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ETAT_ORDRE__CE:
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
			case SchemaPackage.TYPE_ETAT_ORDRE__ETAT_EXECUTION:
				return isSetEtatExecution();
			case SchemaPackage.TYPE_ETAT_ORDRE__DATE:
				return date != null;
			case SchemaPackage.TYPE_ETAT_ORDRE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ETAT_ORDRE__CE:
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
		result.append(" (etatExecution: ");
		if (etatExecutionESet) result.append(etatExecution); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeEtatOrdreImpl
