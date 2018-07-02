/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationProfilDotationTheorique;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Profil Dotation Theorique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationProfilDotationTheoriqueImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationProfilDotationTheoriqueImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationProfilDotationTheoriqueImpl#getQuantiteDisponible <em>Quantite Disponible</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationProfilDotationTheoriqueImpl#getAssocieCommeProfilProfil <em>Associe Comme Profil Profil</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationProfilDotationTheoriqueImpl#getAssocieCommeDotationTheoriqueDotationTheorique <em>Associe Comme Dotation Theorique Dotation Theorique</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationProfilDotationTheoriqueImpl extends EObjectImpl implements TypeAssociationProfilDotationTheorique {
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
	 * The default value of the '{@link #getQuantiteDisponible() <em>Quantite Disponible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteDisponible()
	 * @generated
	 * @ordered
	 */
	protected static final long QUANTITE_DISPONIBLE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getQuantiteDisponible() <em>Quantite Disponible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteDisponible()
	 * @generated
	 * @ordered
	 */
	protected long quantiteDisponible = QUANTITE_DISPONIBLE_EDEFAULT;

	/**
	 * This is true if the Quantite Disponible attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean quantiteDisponibleESet;

	/**
	 * The cached value of the '{@link #getAssocieCommeProfilProfil() <em>Associe Comme Profil Profil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeProfilProfil()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeProfilProfil;

	/**
	 * The cached value of the '{@link #getAssocieCommeDotationTheoriqueDotationTheorique() <em>Associe Comme Dotation Theorique Dotation Theorique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeDotationTheoriqueDotationTheorique()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeDotationTheoriqueDotationTheorique;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationProfilDotationTheoriqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationProfilDotationTheorique();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PROFIL_DOTATION_THEORIQUE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PROFIL_DOTATION_THEORIQUE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getQuantiteDisponible() {
		return quantiteDisponible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantiteDisponible(long newQuantiteDisponible) {
		long oldQuantiteDisponible = quantiteDisponible;
		quantiteDisponible = newQuantiteDisponible;
		boolean oldQuantiteDisponibleESet = quantiteDisponibleESet;
		quantiteDisponibleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PROFIL_DOTATION_THEORIQUE__QUANTITE_DISPONIBLE, oldQuantiteDisponible, quantiteDisponible, !oldQuantiteDisponibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQuantiteDisponible() {
		long oldQuantiteDisponible = quantiteDisponible;
		boolean oldQuantiteDisponibleESet = quantiteDisponibleESet;
		quantiteDisponible = QUANTITE_DISPONIBLE_EDEFAULT;
		quantiteDisponibleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_PROFIL_DOTATION_THEORIQUE__QUANTITE_DISPONIBLE, oldQuantiteDisponible, QUANTITE_DISPONIBLE_EDEFAULT, oldQuantiteDisponibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQuantiteDisponible() {
		return quantiteDisponibleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAssocieCommeProfilProfil() {
		return associeCommeProfilProfil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeProfilProfil(TypeAssociation newAssocieCommeProfilProfil, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeProfilProfil = associeCommeProfilProfil;
		associeCommeProfilProfil = newAssocieCommeProfilProfil;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PROFIL_DOTATION_THEORIQUE__ASSOCIE_COMME_PROFIL_PROFIL, oldAssocieCommeProfilProfil, newAssocieCommeProfilProfil);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeProfilProfil(TypeAssociation newAssocieCommeProfilProfil) {
		if (newAssocieCommeProfilProfil != associeCommeProfilProfil) {
			NotificationChain msgs = null;
			if (associeCommeProfilProfil != null)
				msgs = ((InternalEObject)associeCommeProfilProfil).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_PROFIL_DOTATION_THEORIQUE__ASSOCIE_COMME_PROFIL_PROFIL, null, msgs);
			if (newAssocieCommeProfilProfil != null)
				msgs = ((InternalEObject)newAssocieCommeProfilProfil).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_PROFIL_DOTATION_THEORIQUE__ASSOCIE_COMME_PROFIL_PROFIL, null, msgs);
			msgs = basicSetAssocieCommeProfilProfil(newAssocieCommeProfilProfil, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PROFIL_DOTATION_THEORIQUE__ASSOCIE_COMME_PROFIL_PROFIL, newAssocieCommeProfilProfil, newAssocieCommeProfilProfil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAssocieCommeDotationTheoriqueDotationTheorique() {
		return associeCommeDotationTheoriqueDotationTheorique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeDotationTheoriqueDotationTheorique(TypeAssociation newAssocieCommeDotationTheoriqueDotationTheorique, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeDotationTheoriqueDotationTheorique = associeCommeDotationTheoriqueDotationTheorique;
		associeCommeDotationTheoriqueDotationTheorique = newAssocieCommeDotationTheoriqueDotationTheorique;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PROFIL_DOTATION_THEORIQUE__ASSOCIE_COMME_DOTATION_THEORIQUE_DOTATION_THEORIQUE, oldAssocieCommeDotationTheoriqueDotationTheorique, newAssocieCommeDotationTheoriqueDotationTheorique);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeDotationTheoriqueDotationTheorique(TypeAssociation newAssocieCommeDotationTheoriqueDotationTheorique) {
		if (newAssocieCommeDotationTheoriqueDotationTheorique != associeCommeDotationTheoriqueDotationTheorique) {
			NotificationChain msgs = null;
			if (associeCommeDotationTheoriqueDotationTheorique != null)
				msgs = ((InternalEObject)associeCommeDotationTheoriqueDotationTheorique).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_PROFIL_DOTATION_THEORIQUE__ASSOCIE_COMME_DOTATION_THEORIQUE_DOTATION_THEORIQUE, null, msgs);
			if (newAssocieCommeDotationTheoriqueDotationTheorique != null)
				msgs = ((InternalEObject)newAssocieCommeDotationTheoriqueDotationTheorique).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_PROFIL_DOTATION_THEORIQUE__ASSOCIE_COMME_DOTATION_THEORIQUE_DOTATION_THEORIQUE, null, msgs);
			msgs = basicSetAssocieCommeDotationTheoriqueDotationTheorique(newAssocieCommeDotationTheoriqueDotationTheorique, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_PROFIL_DOTATION_THEORIQUE__ASSOCIE_COMME_DOTATION_THEORIQUE_DOTATION_THEORIQUE, newAssocieCommeDotationTheoriqueDotationTheorique, newAssocieCommeDotationTheoriqueDotationTheorique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_PROFIL_DOTATION_THEORIQUE__ASSOCIE_COMME_PROFIL_PROFIL:
				return basicSetAssocieCommeProfilProfil(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_PROFIL_DOTATION_THEORIQUE__ASSOCIE_COMME_DOTATION_THEORIQUE_DOTATION_THEORIQUE:
				return basicSetAssocieCommeDotationTheoriqueDotationTheorique(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_PROFIL_DOTATION_THEORIQUE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ASSOCIATION_PROFIL_DOTATION_THEORIQUE__CE:
				return getCE();
			case SchemaPackage.TYPE_ASSOCIATION_PROFIL_DOTATION_THEORIQUE__QUANTITE_DISPONIBLE:
				return new Long(getQuantiteDisponible());
			case SchemaPackage.TYPE_ASSOCIATION_PROFIL_DOTATION_THEORIQUE__ASSOCIE_COMME_PROFIL_PROFIL:
				return getAssocieCommeProfilProfil();
			case SchemaPackage.TYPE_ASSOCIATION_PROFIL_DOTATION_THEORIQUE__ASSOCIE_COMME_DOTATION_THEORIQUE_DOTATION_THEORIQUE:
				return getAssocieCommeDotationTheoriqueDotationTheorique();
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
			case SchemaPackage.TYPE_ASSOCIATION_PROFIL_DOTATION_THEORIQUE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PROFIL_DOTATION_THEORIQUE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PROFIL_DOTATION_THEORIQUE__QUANTITE_DISPONIBLE:
				setQuantiteDisponible(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PROFIL_DOTATION_THEORIQUE__ASSOCIE_COMME_PROFIL_PROFIL:
				setAssocieCommeProfilProfil((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PROFIL_DOTATION_THEORIQUE__ASSOCIE_COMME_DOTATION_THEORIQUE_DOTATION_THEORIQUE:
				setAssocieCommeDotationTheoriqueDotationTheorique((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_PROFIL_DOTATION_THEORIQUE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PROFIL_DOTATION_THEORIQUE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PROFIL_DOTATION_THEORIQUE__QUANTITE_DISPONIBLE:
				unsetQuantiteDisponible();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PROFIL_DOTATION_THEORIQUE__ASSOCIE_COMME_PROFIL_PROFIL:
				setAssocieCommeProfilProfil((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_PROFIL_DOTATION_THEORIQUE__ASSOCIE_COMME_DOTATION_THEORIQUE_DOTATION_THEORIQUE:
				setAssocieCommeDotationTheoriqueDotationTheorique((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_PROFIL_DOTATION_THEORIQUE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ASSOCIATION_PROFIL_DOTATION_THEORIQUE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ASSOCIATION_PROFIL_DOTATION_THEORIQUE__QUANTITE_DISPONIBLE:
				return isSetQuantiteDisponible();
			case SchemaPackage.TYPE_ASSOCIATION_PROFIL_DOTATION_THEORIQUE__ASSOCIE_COMME_PROFIL_PROFIL:
				return associeCommeProfilProfil != null;
			case SchemaPackage.TYPE_ASSOCIATION_PROFIL_DOTATION_THEORIQUE__ASSOCIE_COMME_DOTATION_THEORIQUE_DOTATION_THEORIQUE:
				return associeCommeDotationTheoriqueDotationTheorique != null;
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
		result.append(", quantiteDisponible: ");
		if (quantiteDisponibleESet) result.append(quantiteDisponible); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeAssociationProfilDotationTheoriqueImpl
