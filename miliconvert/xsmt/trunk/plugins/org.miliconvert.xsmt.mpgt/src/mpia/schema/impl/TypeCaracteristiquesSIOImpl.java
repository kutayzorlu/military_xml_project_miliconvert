/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCaracteristiquesSIO;
import mpia.schema.TypeDictionaryDicoCaracteristiquesSIOTypeSIO;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Caracteristiques SIO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeCaracteristiquesSIOImpl#getTypeSIO <em>Type SIO</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCaracteristiquesSIOImpl#isPrincipal <em>Principal</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCaracteristiquesSIOImpl#getTrigramme <em>Trigramme</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCaracteristiquesSIOImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCaracteristiquesSIOImpl#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeCaracteristiquesSIOImpl extends EObjectImpl implements TypeCaracteristiquesSIO {
	/**
	 * The default value of the '{@link #getTypeSIO() <em>Type SIO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeSIO()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCaracteristiquesSIOTypeSIO TYPE_SIO_EDEFAULT = TypeDictionaryDicoCaracteristiquesSIOTypeSIO.ATLAS;

	/**
	 * The cached value of the '{@link #getTypeSIO() <em>Type SIO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeSIO()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCaracteristiquesSIOTypeSIO typeSIO = TYPE_SIO_EDEFAULT;

	/**
	 * This is true if the Type SIO attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeSIOESet;

	/**
	 * The default value of the '{@link #isPrincipal() <em>Principal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrincipal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRINCIPAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPrincipal() <em>Principal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrincipal()
	 * @generated
	 * @ordered
	 */
	protected boolean principal = PRINCIPAL_EDEFAULT;

	/**
	 * This is true if the Principal attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean principalESet;

	/**
	 * The default value of the '{@link #getTrigramme() <em>Trigramme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigramme()
	 * @generated
	 * @ordered
	 */
	protected static final String TRIGRAMME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrigramme() <em>Trigramme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigramme()
	 * @generated
	 * @ordered
	 */
	protected String trigramme = TRIGRAMME_EDEFAULT;

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
	protected TypeCaracteristiquesSIOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeCaracteristiquesSIO();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoCaracteristiquesSIOTypeSIO getTypeSIO() {
		return typeSIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeSIO(TypeDictionaryDicoCaracteristiquesSIOTypeSIO newTypeSIO) {
		TypeDictionaryDicoCaracteristiquesSIOTypeSIO oldTypeSIO = typeSIO;
		typeSIO = newTypeSIO == null ? TYPE_SIO_EDEFAULT : newTypeSIO;
		boolean oldTypeSIOESet = typeSIOESet;
		typeSIOESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUES_SIO__TYPE_SIO, oldTypeSIO, typeSIO, !oldTypeSIOESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeSIO() {
		TypeDictionaryDicoCaracteristiquesSIOTypeSIO oldTypeSIO = typeSIO;
		boolean oldTypeSIOESet = typeSIOESet;
		typeSIO = TYPE_SIO_EDEFAULT;
		typeSIOESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CARACTERISTIQUES_SIO__TYPE_SIO, oldTypeSIO, TYPE_SIO_EDEFAULT, oldTypeSIOESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeSIO() {
		return typeSIOESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPrincipal() {
		return principal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrincipal(boolean newPrincipal) {
		boolean oldPrincipal = principal;
		principal = newPrincipal;
		boolean oldPrincipalESet = principalESet;
		principalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUES_SIO__PRINCIPAL, oldPrincipal, principal, !oldPrincipalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPrincipal() {
		boolean oldPrincipal = principal;
		boolean oldPrincipalESet = principalESet;
		principal = PRINCIPAL_EDEFAULT;
		principalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CARACTERISTIQUES_SIO__PRINCIPAL, oldPrincipal, PRINCIPAL_EDEFAULT, oldPrincipalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPrincipal() {
		return principalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTrigramme() {
		return trigramme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrigramme(String newTrigramme) {
		String oldTrigramme = trigramme;
		trigramme = newTrigramme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUES_SIO__TRIGRAMME, oldTrigramme, trigramme));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUES_SIO__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUES_SIO__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_CARACTERISTIQUES_SIO__TYPE_SIO:
				return getTypeSIO();
			case SchemaPackage.TYPE_CARACTERISTIQUES_SIO__PRINCIPAL:
				return isPrincipal() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_CARACTERISTIQUES_SIO__TRIGRAMME:
				return getTrigramme();
			case SchemaPackage.TYPE_CARACTERISTIQUES_SIO__CTE:
				return getCTE();
			case SchemaPackage.TYPE_CARACTERISTIQUES_SIO__CE:
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
			case SchemaPackage.TYPE_CARACTERISTIQUES_SIO__TYPE_SIO:
				setTypeSIO((TypeDictionaryDicoCaracteristiquesSIOTypeSIO)newValue);
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUES_SIO__PRINCIPAL:
				setPrincipal(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUES_SIO__TRIGRAMME:
				setTrigramme((String)newValue);
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUES_SIO__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUES_SIO__CE:
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
			case SchemaPackage.TYPE_CARACTERISTIQUES_SIO__TYPE_SIO:
				unsetTypeSIO();
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUES_SIO__PRINCIPAL:
				unsetPrincipal();
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUES_SIO__TRIGRAMME:
				setTrigramme(TRIGRAMME_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUES_SIO__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUES_SIO__CE:
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
			case SchemaPackage.TYPE_CARACTERISTIQUES_SIO__TYPE_SIO:
				return isSetTypeSIO();
			case SchemaPackage.TYPE_CARACTERISTIQUES_SIO__PRINCIPAL:
				return isSetPrincipal();
			case SchemaPackage.TYPE_CARACTERISTIQUES_SIO__TRIGRAMME:
				return TRIGRAMME_EDEFAULT == null ? trigramme != null : !TRIGRAMME_EDEFAULT.equals(trigramme);
			case SchemaPackage.TYPE_CARACTERISTIQUES_SIO__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_CARACTERISTIQUES_SIO__CE:
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
		result.append(" (typeSIO: ");
		if (typeSIOESet) result.append(typeSIO); else result.append("<unset>");
		result.append(", principal: ");
		if (principalESet) result.append(principal); else result.append("<unset>");
		result.append(", trigramme: ");
		result.append(trigramme);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeCaracteristiquesSIOImpl
