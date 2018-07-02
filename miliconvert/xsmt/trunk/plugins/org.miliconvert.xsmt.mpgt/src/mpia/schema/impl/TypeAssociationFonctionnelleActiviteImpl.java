/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationFonctionnelleActivite;
import mpia.schema.TypeSuiviDemande;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Fonctionnelle Activite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationFonctionnelleActiviteImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationFonctionnelleActiviteImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationFonctionnelleActiviteImpl#getEstSuivieSelonSuiviDemande <em>Est Suivie Selon Suivi Demande</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypeAssociationFonctionnelleActiviteImpl extends EObjectImpl implements TypeAssociationFonctionnelleActivite {
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
	 * The cached value of the '{@link #getEstSuivieSelonSuiviDemande() <em>Est Suivie Selon Suivi Demande</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSuivieSelonSuiviDemande()
	 * @generated
	 * @ordered
	 */
	protected TypeSuiviDemande estSuivieSelonSuiviDemande;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationFonctionnelleActiviteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationFonctionnelleActivite();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_FONCTIONNELLE_ACTIVITE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_FONCTIONNELLE_ACTIVITE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeSuiviDemande getEstSuivieSelonSuiviDemande() {
		return estSuivieSelonSuiviDemande;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstSuivieSelonSuiviDemande(TypeSuiviDemande newEstSuivieSelonSuiviDemande, NotificationChain msgs) {
		TypeSuiviDemande oldEstSuivieSelonSuiviDemande = estSuivieSelonSuiviDemande;
		estSuivieSelonSuiviDemande = newEstSuivieSelonSuiviDemande;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_FONCTIONNELLE_ACTIVITE__EST_SUIVIE_SELON_SUIVI_DEMANDE, oldEstSuivieSelonSuiviDemande, newEstSuivieSelonSuiviDemande);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstSuivieSelonSuiviDemande(TypeSuiviDemande newEstSuivieSelonSuiviDemande) {
		if (newEstSuivieSelonSuiviDemande != estSuivieSelonSuiviDemande) {
			NotificationChain msgs = null;
			if (estSuivieSelonSuiviDemande != null)
				msgs = ((InternalEObject)estSuivieSelonSuiviDemande).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_FONCTIONNELLE_ACTIVITE__EST_SUIVIE_SELON_SUIVI_DEMANDE, null, msgs);
			if (newEstSuivieSelonSuiviDemande != null)
				msgs = ((InternalEObject)newEstSuivieSelonSuiviDemande).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_FONCTIONNELLE_ACTIVITE__EST_SUIVIE_SELON_SUIVI_DEMANDE, null, msgs);
			msgs = basicSetEstSuivieSelonSuiviDemande(newEstSuivieSelonSuiviDemande, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_FONCTIONNELLE_ACTIVITE__EST_SUIVIE_SELON_SUIVI_DEMANDE, newEstSuivieSelonSuiviDemande, newEstSuivieSelonSuiviDemande));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_FONCTIONNELLE_ACTIVITE__EST_SUIVIE_SELON_SUIVI_DEMANDE:
				return basicSetEstSuivieSelonSuiviDemande(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_FONCTIONNELLE_ACTIVITE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ASSOCIATION_FONCTIONNELLE_ACTIVITE__CE:
				return getCE();
			case SchemaPackage.TYPE_ASSOCIATION_FONCTIONNELLE_ACTIVITE__EST_SUIVIE_SELON_SUIVI_DEMANDE:
				return getEstSuivieSelonSuiviDemande();
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
			case SchemaPackage.TYPE_ASSOCIATION_FONCTIONNELLE_ACTIVITE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_FONCTIONNELLE_ACTIVITE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_FONCTIONNELLE_ACTIVITE__EST_SUIVIE_SELON_SUIVI_DEMANDE:
				setEstSuivieSelonSuiviDemande((TypeSuiviDemande)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_FONCTIONNELLE_ACTIVITE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_FONCTIONNELLE_ACTIVITE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_FONCTIONNELLE_ACTIVITE__EST_SUIVIE_SELON_SUIVI_DEMANDE:
				setEstSuivieSelonSuiviDemande((TypeSuiviDemande)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_FONCTIONNELLE_ACTIVITE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ASSOCIATION_FONCTIONNELLE_ACTIVITE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ASSOCIATION_FONCTIONNELLE_ACTIVITE__EST_SUIVIE_SELON_SUIVI_DEMANDE:
				return estSuivieSelonSuiviDemande != null;
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

} //TypeAssociationFonctionnelleActiviteImpl
