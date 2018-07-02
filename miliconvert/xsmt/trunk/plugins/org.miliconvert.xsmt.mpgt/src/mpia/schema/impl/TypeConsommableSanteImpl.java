/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeConsommableSante;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Consommable Sante</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeConsommableSanteImpl#getJoursFonctionnement <em>Jours Fonctionnement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsommableSanteImpl#getNumeroGroupe <em>Numero Groupe</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsommableSanteImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsommableSanteImpl#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeConsommableSanteImpl extends EObjectImpl implements TypeConsommableSante {
	/**
	 * The default value of the '{@link #getJoursFonctionnement() <em>Jours Fonctionnement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoursFonctionnement()
	 * @generated
	 * @ordered
	 */
	protected static final long JOURS_FONCTIONNEMENT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getJoursFonctionnement() <em>Jours Fonctionnement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoursFonctionnement()
	 * @generated
	 * @ordered
	 */
	protected long joursFonctionnement = JOURS_FONCTIONNEMENT_EDEFAULT;

	/**
	 * This is true if the Jours Fonctionnement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean joursFonctionnementESet;

	/**
	 * The default value of the '{@link #getNumeroGroupe() <em>Numero Groupe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroGroupe()
	 * @generated
	 * @ordered
	 */
	protected static final long NUMERO_GROUPE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNumeroGroupe() <em>Numero Groupe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroGroupe()
	 * @generated
	 * @ordered
	 */
	protected long numeroGroupe = NUMERO_GROUPE_EDEFAULT;

	/**
	 * This is true if the Numero Groupe attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numeroGroupeESet;

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
	protected TypeConsommableSanteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeConsommableSante();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getJoursFonctionnement() {
		return joursFonctionnement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJoursFonctionnement(long newJoursFonctionnement) {
		long oldJoursFonctionnement = joursFonctionnement;
		joursFonctionnement = newJoursFonctionnement;
		boolean oldJoursFonctionnementESet = joursFonctionnementESet;
		joursFonctionnementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSOMMABLE_SANTE__JOURS_FONCTIONNEMENT, oldJoursFonctionnement, joursFonctionnement, !oldJoursFonctionnementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetJoursFonctionnement() {
		long oldJoursFonctionnement = joursFonctionnement;
		boolean oldJoursFonctionnementESet = joursFonctionnementESet;
		joursFonctionnement = JOURS_FONCTIONNEMENT_EDEFAULT;
		joursFonctionnementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CONSOMMABLE_SANTE__JOURS_FONCTIONNEMENT, oldJoursFonctionnement, JOURS_FONCTIONNEMENT_EDEFAULT, oldJoursFonctionnementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetJoursFonctionnement() {
		return joursFonctionnementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNumeroGroupe() {
		return numeroGroupe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroGroupe(long newNumeroGroupe) {
		long oldNumeroGroupe = numeroGroupe;
		numeroGroupe = newNumeroGroupe;
		boolean oldNumeroGroupeESet = numeroGroupeESet;
		numeroGroupeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSOMMABLE_SANTE__NUMERO_GROUPE, oldNumeroGroupe, numeroGroupe, !oldNumeroGroupeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumeroGroupe() {
		long oldNumeroGroupe = numeroGroupe;
		boolean oldNumeroGroupeESet = numeroGroupeESet;
		numeroGroupe = NUMERO_GROUPE_EDEFAULT;
		numeroGroupeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CONSOMMABLE_SANTE__NUMERO_GROUPE, oldNumeroGroupe, NUMERO_GROUPE_EDEFAULT, oldNumeroGroupeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumeroGroupe() {
		return numeroGroupeESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSOMMABLE_SANTE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSOMMABLE_SANTE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_CONSOMMABLE_SANTE__JOURS_FONCTIONNEMENT:
				return new Long(getJoursFonctionnement());
			case SchemaPackage.TYPE_CONSOMMABLE_SANTE__NUMERO_GROUPE:
				return new Long(getNumeroGroupe());
			case SchemaPackage.TYPE_CONSOMMABLE_SANTE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_CONSOMMABLE_SANTE__CE:
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
			case SchemaPackage.TYPE_CONSOMMABLE_SANTE__JOURS_FONCTIONNEMENT:
				setJoursFonctionnement(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_CONSOMMABLE_SANTE__NUMERO_GROUPE:
				setNumeroGroupe(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_CONSOMMABLE_SANTE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_CONSOMMABLE_SANTE__CE:
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
			case SchemaPackage.TYPE_CONSOMMABLE_SANTE__JOURS_FONCTIONNEMENT:
				unsetJoursFonctionnement();
				return;
			case SchemaPackage.TYPE_CONSOMMABLE_SANTE__NUMERO_GROUPE:
				unsetNumeroGroupe();
				return;
			case SchemaPackage.TYPE_CONSOMMABLE_SANTE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CONSOMMABLE_SANTE__CE:
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
			case SchemaPackage.TYPE_CONSOMMABLE_SANTE__JOURS_FONCTIONNEMENT:
				return isSetJoursFonctionnement();
			case SchemaPackage.TYPE_CONSOMMABLE_SANTE__NUMERO_GROUPE:
				return isSetNumeroGroupe();
			case SchemaPackage.TYPE_CONSOMMABLE_SANTE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_CONSOMMABLE_SANTE__CE:
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
		result.append(" (joursFonctionnement: ");
		if (joursFonctionnementESet) result.append(joursFonctionnement); else result.append("<unset>");
		result.append(", numeroGroupe: ");
		if (numeroGroupeESet) result.append(numeroGroupe); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeConsommableSanteImpl
