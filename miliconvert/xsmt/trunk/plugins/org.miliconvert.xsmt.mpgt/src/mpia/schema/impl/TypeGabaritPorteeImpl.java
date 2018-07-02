/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeLongueur;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoGabaritPorteeTypePortee;
import mpia.schema.TypeGabaritPortee;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Gabarit Portee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeGabaritPorteeImpl#getTypePortee <em>Type Portee</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeGabaritPorteeImpl#getPorteePratique <em>Portee Pratique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeGabaritPorteeImpl#getPortee <em>Portee</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeGabaritPorteeImpl#getMoyenPortee <em>Moyen Portee</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeGabaritPorteeImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeGabaritPorteeImpl#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeGabaritPorteeImpl extends EObjectImpl implements TypeGabaritPortee {
	/**
	 * The default value of the '{@link #getTypePortee() <em>Type Portee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypePortee()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoGabaritPorteeTypePortee TYPE_PORTEE_EDEFAULT = TypeDictionaryDicoGabaritPorteeTypePortee.DET;

	/**
	 * The cached value of the '{@link #getTypePortee() <em>Type Portee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypePortee()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoGabaritPorteeTypePortee typePortee = TYPE_PORTEE_EDEFAULT;

	/**
	 * This is true if the Type Portee attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typePorteeESet;

	/**
	 * The cached value of the '{@link #getPorteePratique() <em>Portee Pratique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorteePratique()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur porteePratique;

	/**
	 * The cached value of the '{@link #getPortee() <em>Portee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortee()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur portee;

	/**
	 * The default value of the '{@link #getMoyenPortee() <em>Moyen Portee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyenPortee()
	 * @generated
	 * @ordered
	 */
	protected static final String MOYEN_PORTEE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMoyenPortee() <em>Moyen Portee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyenPortee()
	 * @generated
	 * @ordered
	 */
	protected String moyenPortee = MOYEN_PORTEE_EDEFAULT;

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
	protected TypeGabaritPorteeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeGabaritPortee();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoGabaritPorteeTypePortee getTypePortee() {
		return typePortee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypePortee(TypeDictionaryDicoGabaritPorteeTypePortee newTypePortee) {
		TypeDictionaryDicoGabaritPorteeTypePortee oldTypePortee = typePortee;
		typePortee = newTypePortee == null ? TYPE_PORTEE_EDEFAULT : newTypePortee;
		boolean oldTypePorteeESet = typePorteeESet;
		typePorteeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_GABARIT_PORTEE__TYPE_PORTEE, oldTypePortee, typePortee, !oldTypePorteeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypePortee() {
		TypeDictionaryDicoGabaritPorteeTypePortee oldTypePortee = typePortee;
		boolean oldTypePorteeESet = typePorteeESet;
		typePortee = TYPE_PORTEE_EDEFAULT;
		typePorteeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_GABARIT_PORTEE__TYPE_PORTEE, oldTypePortee, TYPE_PORTEE_EDEFAULT, oldTypePorteeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypePortee() {
		return typePorteeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getPorteePratique() {
		return porteePratique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPorteePratique(TypeDataTypeLongueur newPorteePratique, NotificationChain msgs) {
		TypeDataTypeLongueur oldPorteePratique = porteePratique;
		porteePratique = newPorteePratique;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_GABARIT_PORTEE__PORTEE_PRATIQUE, oldPorteePratique, newPorteePratique);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPorteePratique(TypeDataTypeLongueur newPorteePratique) {
		if (newPorteePratique != porteePratique) {
			NotificationChain msgs = null;
			if (porteePratique != null)
				msgs = ((InternalEObject)porteePratique).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_GABARIT_PORTEE__PORTEE_PRATIQUE, null, msgs);
			if (newPorteePratique != null)
				msgs = ((InternalEObject)newPorteePratique).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_GABARIT_PORTEE__PORTEE_PRATIQUE, null, msgs);
			msgs = basicSetPorteePratique(newPorteePratique, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_GABARIT_PORTEE__PORTEE_PRATIQUE, newPorteePratique, newPorteePratique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getPortee() {
		return portee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPortee(TypeDataTypeLongueur newPortee, NotificationChain msgs) {
		TypeDataTypeLongueur oldPortee = portee;
		portee = newPortee;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_GABARIT_PORTEE__PORTEE, oldPortee, newPortee);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortee(TypeDataTypeLongueur newPortee) {
		if (newPortee != portee) {
			NotificationChain msgs = null;
			if (portee != null)
				msgs = ((InternalEObject)portee).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_GABARIT_PORTEE__PORTEE, null, msgs);
			if (newPortee != null)
				msgs = ((InternalEObject)newPortee).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_GABARIT_PORTEE__PORTEE, null, msgs);
			msgs = basicSetPortee(newPortee, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_GABARIT_PORTEE__PORTEE, newPortee, newPortee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMoyenPortee() {
		return moyenPortee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoyenPortee(String newMoyenPortee) {
		String oldMoyenPortee = moyenPortee;
		moyenPortee = newMoyenPortee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_GABARIT_PORTEE__MOYEN_PORTEE, oldMoyenPortee, moyenPortee));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_GABARIT_PORTEE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_GABARIT_PORTEE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_GABARIT_PORTEE__PORTEE_PRATIQUE:
				return basicSetPorteePratique(null, msgs);
			case SchemaPackage.TYPE_GABARIT_PORTEE__PORTEE:
				return basicSetPortee(null, msgs);
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
			case SchemaPackage.TYPE_GABARIT_PORTEE__TYPE_PORTEE:
				return getTypePortee();
			case SchemaPackage.TYPE_GABARIT_PORTEE__PORTEE_PRATIQUE:
				return getPorteePratique();
			case SchemaPackage.TYPE_GABARIT_PORTEE__PORTEE:
				return getPortee();
			case SchemaPackage.TYPE_GABARIT_PORTEE__MOYEN_PORTEE:
				return getMoyenPortee();
			case SchemaPackage.TYPE_GABARIT_PORTEE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_GABARIT_PORTEE__CE:
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
			case SchemaPackage.TYPE_GABARIT_PORTEE__TYPE_PORTEE:
				setTypePortee((TypeDictionaryDicoGabaritPorteeTypePortee)newValue);
				return;
			case SchemaPackage.TYPE_GABARIT_PORTEE__PORTEE_PRATIQUE:
				setPorteePratique((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_GABARIT_PORTEE__PORTEE:
				setPortee((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_GABARIT_PORTEE__MOYEN_PORTEE:
				setMoyenPortee((String)newValue);
				return;
			case SchemaPackage.TYPE_GABARIT_PORTEE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_GABARIT_PORTEE__CE:
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
			case SchemaPackage.TYPE_GABARIT_PORTEE__TYPE_PORTEE:
				unsetTypePortee();
				return;
			case SchemaPackage.TYPE_GABARIT_PORTEE__PORTEE_PRATIQUE:
				setPorteePratique((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_GABARIT_PORTEE__PORTEE:
				setPortee((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_GABARIT_PORTEE__MOYEN_PORTEE:
				setMoyenPortee(MOYEN_PORTEE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_GABARIT_PORTEE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_GABARIT_PORTEE__CE:
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
			case SchemaPackage.TYPE_GABARIT_PORTEE__TYPE_PORTEE:
				return isSetTypePortee();
			case SchemaPackage.TYPE_GABARIT_PORTEE__PORTEE_PRATIQUE:
				return porteePratique != null;
			case SchemaPackage.TYPE_GABARIT_PORTEE__PORTEE:
				return portee != null;
			case SchemaPackage.TYPE_GABARIT_PORTEE__MOYEN_PORTEE:
				return MOYEN_PORTEE_EDEFAULT == null ? moyenPortee != null : !MOYEN_PORTEE_EDEFAULT.equals(moyenPortee);
			case SchemaPackage.TYPE_GABARIT_PORTEE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_GABARIT_PORTEE__CE:
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
		result.append(" (typePortee: ");
		if (typePorteeESet) result.append(typePortee); else result.append("<unset>");
		result.append(", moyenPortee: ");
		result.append(moyenPortee);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeGabaritPorteeImpl
