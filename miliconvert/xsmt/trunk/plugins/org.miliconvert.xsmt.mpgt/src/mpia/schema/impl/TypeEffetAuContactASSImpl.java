/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoEffetTactiqueRecherche;
import mpia.schema.TypeEffetAuContactASS;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Effet Au Contact ASS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEffetAuContactASSImpl#getType <em>Type</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEffetAuContactASSImpl#getAutreType <em>Autre Type</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEffetAuContactASSImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEffetAuContactASSImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEffetAuContactASSImpl#getAppuieUnite <em>Appuie Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeEffetAuContactASSImpl extends EObjectImpl implements TypeEffetAuContactASS {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEffetTactiqueRecherche TYPE_EDEFAULT = TypeDictionaryDicoEffetTactiqueRecherche.NEUT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEffetTactiqueRecherche type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The default value of the '{@link #getAutreType() <em>Autre Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutreType()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTRE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutreType() <em>Autre Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutreType()
	 * @generated
	 * @ordered
	 */
	protected String autreType = AUTRE_TYPE_EDEFAULT;

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
	 * The cached value of the '{@link #getAppuieUnite() <em>Appuie Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppuieUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT appuieUnite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeEffetAuContactASSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEffetAuContactASS();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEffetTactiqueRecherche getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeDictionaryDicoEffetTactiqueRecherche newType) {
		TypeDictionaryDicoEffetTactiqueRecherche oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EFFET_AU_CONTACT_ASS__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TypeDictionaryDicoEffetTactiqueRecherche oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EFFET_AU_CONTACT_ASS__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAutreType() {
		return autreType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutreType(String newAutreType) {
		String oldAutreType = autreType;
		autreType = newAutreType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EFFET_AU_CONTACT_ASS__AUTRE_TYPE, oldAutreType, autreType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EFFET_AU_CONTACT_ASS__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EFFET_AU_CONTACT_ASS__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAppuieUnite() {
		return appuieUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppuieUnite(TypeAssociationEXT newAppuieUnite, NotificationChain msgs) {
		TypeAssociationEXT oldAppuieUnite = appuieUnite;
		appuieUnite = newAppuieUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EFFET_AU_CONTACT_ASS__APPUIE_UNITE, oldAppuieUnite, newAppuieUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppuieUnite(TypeAssociationEXT newAppuieUnite) {
		if (newAppuieUnite != appuieUnite) {
			NotificationChain msgs = null;
			if (appuieUnite != null)
				msgs = ((InternalEObject)appuieUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EFFET_AU_CONTACT_ASS__APPUIE_UNITE, null, msgs);
			if (newAppuieUnite != null)
				msgs = ((InternalEObject)newAppuieUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EFFET_AU_CONTACT_ASS__APPUIE_UNITE, null, msgs);
			msgs = basicSetAppuieUnite(newAppuieUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EFFET_AU_CONTACT_ASS__APPUIE_UNITE, newAppuieUnite, newAppuieUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_EFFET_AU_CONTACT_ASS__APPUIE_UNITE:
				return basicSetAppuieUnite(null, msgs);
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
			case SchemaPackage.TYPE_EFFET_AU_CONTACT_ASS__TYPE:
				return getType();
			case SchemaPackage.TYPE_EFFET_AU_CONTACT_ASS__AUTRE_TYPE:
				return getAutreType();
			case SchemaPackage.TYPE_EFFET_AU_CONTACT_ASS__CTE:
				return getCTE();
			case SchemaPackage.TYPE_EFFET_AU_CONTACT_ASS__CE:
				return getCE();
			case SchemaPackage.TYPE_EFFET_AU_CONTACT_ASS__APPUIE_UNITE:
				return getAppuieUnite();
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
			case SchemaPackage.TYPE_EFFET_AU_CONTACT_ASS__TYPE:
				setType((TypeDictionaryDicoEffetTactiqueRecherche)newValue);
				return;
			case SchemaPackage.TYPE_EFFET_AU_CONTACT_ASS__AUTRE_TYPE:
				setAutreType((String)newValue);
				return;
			case SchemaPackage.TYPE_EFFET_AU_CONTACT_ASS__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_EFFET_AU_CONTACT_ASS__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_EFFET_AU_CONTACT_ASS__APPUIE_UNITE:
				setAppuieUnite((TypeAssociationEXT)newValue);
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
			case SchemaPackage.TYPE_EFFET_AU_CONTACT_ASS__TYPE:
				unsetType();
				return;
			case SchemaPackage.TYPE_EFFET_AU_CONTACT_ASS__AUTRE_TYPE:
				setAutreType(AUTRE_TYPE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_EFFET_AU_CONTACT_ASS__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_EFFET_AU_CONTACT_ASS__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_EFFET_AU_CONTACT_ASS__APPUIE_UNITE:
				setAppuieUnite((TypeAssociationEXT)null);
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
			case SchemaPackage.TYPE_EFFET_AU_CONTACT_ASS__TYPE:
				return isSetType();
			case SchemaPackage.TYPE_EFFET_AU_CONTACT_ASS__AUTRE_TYPE:
				return AUTRE_TYPE_EDEFAULT == null ? autreType != null : !AUTRE_TYPE_EDEFAULT.equals(autreType);
			case SchemaPackage.TYPE_EFFET_AU_CONTACT_ASS__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_EFFET_AU_CONTACT_ASS__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_EFFET_AU_CONTACT_ASS__APPUIE_UNITE:
				return appuieUnite != null;
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
		result.append(" (type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", autreType: ");
		result.append(autreType);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeEffetAuContactASSImpl
