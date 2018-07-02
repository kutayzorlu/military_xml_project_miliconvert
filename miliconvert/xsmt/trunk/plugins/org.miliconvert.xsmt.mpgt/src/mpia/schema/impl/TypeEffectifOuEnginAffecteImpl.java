/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeEffectifOuEnginAffecte;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Effectif Ou Engin Affecte</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEffectifOuEnginAffecteImpl#getNomAAffecter <em>Nom AAffecter</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEffectifOuEnginAffecteImpl#getNomLogiqueAffecte <em>Nom Logique Affecte</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEffectifOuEnginAffecteImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEffectifOuEnginAffecteImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEffectifOuEnginAffecteImpl#getEstAffecteUnite <em>Est Affecte Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeEffectifOuEnginAffecteImpl extends EObjectImpl implements TypeEffectifOuEnginAffecte {
	/**
	 * The default value of the '{@link #getNomAAffecter() <em>Nom AAffecter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomAAffecter()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_AAFFECTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomAAffecter() <em>Nom AAffecter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomAAffecter()
	 * @generated
	 * @ordered
	 */
	protected String nomAAffecter = NOM_AAFFECTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getNomLogiqueAffecte() <em>Nom Logique Affecte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomLogiqueAffecte()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_LOGIQUE_AFFECTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomLogiqueAffecte() <em>Nom Logique Affecte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomLogiqueAffecte()
	 * @generated
	 * @ordered
	 */
	protected String nomLogiqueAffecte = NOM_LOGIQUE_AFFECTE_EDEFAULT;

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
	 * The cached value of the '{@link #getEstAffecteUnite() <em>Est Affecte Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstAffecteUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT estAffecteUnite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeEffectifOuEnginAffecteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEffectifOuEnginAffecte();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNomAAffecter() {
		return nomAAffecter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomAAffecter(String newNomAAffecter) {
		String oldNomAAffecter = nomAAffecter;
		nomAAffecter = newNomAAffecter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EFFECTIF_OU_ENGIN_AFFECTE__NOM_AAFFECTER, oldNomAAffecter, nomAAffecter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNomLogiqueAffecte() {
		return nomLogiqueAffecte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomLogiqueAffecte(String newNomLogiqueAffecte) {
		String oldNomLogiqueAffecte = nomLogiqueAffecte;
		nomLogiqueAffecte = newNomLogiqueAffecte;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EFFECTIF_OU_ENGIN_AFFECTE__NOM_LOGIQUE_AFFECTE, oldNomLogiqueAffecte, nomLogiqueAffecte));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EFFECTIF_OU_ENGIN_AFFECTE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EFFECTIF_OU_ENGIN_AFFECTE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getEstAffecteUnite() {
		return estAffecteUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstAffecteUnite(TypeAssociationEXT newEstAffecteUnite, NotificationChain msgs) {
		TypeAssociationEXT oldEstAffecteUnite = estAffecteUnite;
		estAffecteUnite = newEstAffecteUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EFFECTIF_OU_ENGIN_AFFECTE__EST_AFFECTE_UNITE, oldEstAffecteUnite, newEstAffecteUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstAffecteUnite(TypeAssociationEXT newEstAffecteUnite) {
		if (newEstAffecteUnite != estAffecteUnite) {
			NotificationChain msgs = null;
			if (estAffecteUnite != null)
				msgs = ((InternalEObject)estAffecteUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EFFECTIF_OU_ENGIN_AFFECTE__EST_AFFECTE_UNITE, null, msgs);
			if (newEstAffecteUnite != null)
				msgs = ((InternalEObject)newEstAffecteUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EFFECTIF_OU_ENGIN_AFFECTE__EST_AFFECTE_UNITE, null, msgs);
			msgs = basicSetEstAffecteUnite(newEstAffecteUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EFFECTIF_OU_ENGIN_AFFECTE__EST_AFFECTE_UNITE, newEstAffecteUnite, newEstAffecteUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_EFFECTIF_OU_ENGIN_AFFECTE__EST_AFFECTE_UNITE:
				return basicSetEstAffecteUnite(null, msgs);
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
			case SchemaPackage.TYPE_EFFECTIF_OU_ENGIN_AFFECTE__NOM_AAFFECTER:
				return getNomAAffecter();
			case SchemaPackage.TYPE_EFFECTIF_OU_ENGIN_AFFECTE__NOM_LOGIQUE_AFFECTE:
				return getNomLogiqueAffecte();
			case SchemaPackage.TYPE_EFFECTIF_OU_ENGIN_AFFECTE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_EFFECTIF_OU_ENGIN_AFFECTE__CE:
				return getCE();
			case SchemaPackage.TYPE_EFFECTIF_OU_ENGIN_AFFECTE__EST_AFFECTE_UNITE:
				return getEstAffecteUnite();
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
			case SchemaPackage.TYPE_EFFECTIF_OU_ENGIN_AFFECTE__NOM_AAFFECTER:
				setNomAAffecter((String)newValue);
				return;
			case SchemaPackage.TYPE_EFFECTIF_OU_ENGIN_AFFECTE__NOM_LOGIQUE_AFFECTE:
				setNomLogiqueAffecte((String)newValue);
				return;
			case SchemaPackage.TYPE_EFFECTIF_OU_ENGIN_AFFECTE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_EFFECTIF_OU_ENGIN_AFFECTE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_EFFECTIF_OU_ENGIN_AFFECTE__EST_AFFECTE_UNITE:
				setEstAffecteUnite((TypeAssociationEXT)newValue);
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
			case SchemaPackage.TYPE_EFFECTIF_OU_ENGIN_AFFECTE__NOM_AAFFECTER:
				setNomAAffecter(NOM_AAFFECTER_EDEFAULT);
				return;
			case SchemaPackage.TYPE_EFFECTIF_OU_ENGIN_AFFECTE__NOM_LOGIQUE_AFFECTE:
				setNomLogiqueAffecte(NOM_LOGIQUE_AFFECTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_EFFECTIF_OU_ENGIN_AFFECTE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_EFFECTIF_OU_ENGIN_AFFECTE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_EFFECTIF_OU_ENGIN_AFFECTE__EST_AFFECTE_UNITE:
				setEstAffecteUnite((TypeAssociationEXT)null);
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
			case SchemaPackage.TYPE_EFFECTIF_OU_ENGIN_AFFECTE__NOM_AAFFECTER:
				return NOM_AAFFECTER_EDEFAULT == null ? nomAAffecter != null : !NOM_AAFFECTER_EDEFAULT.equals(nomAAffecter);
			case SchemaPackage.TYPE_EFFECTIF_OU_ENGIN_AFFECTE__NOM_LOGIQUE_AFFECTE:
				return NOM_LOGIQUE_AFFECTE_EDEFAULT == null ? nomLogiqueAffecte != null : !NOM_LOGIQUE_AFFECTE_EDEFAULT.equals(nomLogiqueAffecte);
			case SchemaPackage.TYPE_EFFECTIF_OU_ENGIN_AFFECTE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_EFFECTIF_OU_ENGIN_AFFECTE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_EFFECTIF_OU_ENGIN_AFFECTE__EST_AFFECTE_UNITE:
				return estAffecteUnite != null;
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
		result.append(" (nomAAffecter: ");
		result.append(nomAAffecter);
		result.append(", nomLogiqueAffecte: ");
		result.append(nomLogiqueAffecte);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeEffectifOuEnginAffecteImpl
