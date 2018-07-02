/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoEchelonEchelon;
import mpia.schema.TypeDictionaryDicoModeMouvement;
import mpia.schema.TypeEnnemiFutur;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Ennemi Futur</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEnnemiFuturImpl#getAttitudeGenerale <em>Attitude Generale</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEnnemiFuturImpl#getEchelonForce <em>Echelon Force</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEnnemiFuturImpl#getModeMouvement <em>Mode Mouvement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEnnemiFuturImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEnnemiFuturImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEnnemiFuturImpl#getConcerneFormationENIUnite <em>Concerne Formation ENI Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEnnemiFuturImpl#getAPourActionEnvisageeAction <em>APour Action Envisagee Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeEnnemiFuturImpl extends EObjectImpl implements TypeEnnemiFutur {
	/**
	 * The default value of the '{@link #getAttitudeGenerale() <em>Attitude Generale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttitudeGenerale()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTITUDE_GENERALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttitudeGenerale() <em>Attitude Generale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttitudeGenerale()
	 * @generated
	 * @ordered
	 */
	protected String attitudeGenerale = ATTITUDE_GENERALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEchelonForce() <em>Echelon Force</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEchelonForce()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEchelonEchelon ECHELON_FORCE_EDEFAULT = TypeDictionaryDicoEchelonEchelon._1ECH;

	/**
	 * The cached value of the '{@link #getEchelonForce() <em>Echelon Force</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEchelonForce()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEchelonEchelon echelonForce = ECHELON_FORCE_EDEFAULT;

	/**
	 * This is true if the Echelon Force attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean echelonForceESet;

	/**
	 * The default value of the '{@link #getModeMouvement() <em>Mode Mouvement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeMouvement()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoModeMouvement MODE_MOUVEMENT_EDEFAULT = TypeDictionaryDicoModeMouvement.HP;

	/**
	 * The cached value of the '{@link #getModeMouvement() <em>Mode Mouvement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeMouvement()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoModeMouvement modeMouvement = MODE_MOUVEMENT_EDEFAULT;

	/**
	 * This is true if the Mode Mouvement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean modeMouvementESet;

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
	 * The cached value of the '{@link #getConcerneFormationENIUnite() <em>Concerne Formation ENI Unite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneFormationENIUnite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> concerneFormationENIUnite;

	/**
	 * The cached value of the '{@link #getAPourActionEnvisageeAction() <em>APour Action Envisagee Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourActionEnvisageeAction()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourActionEnvisageeAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeEnnemiFuturImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEnnemiFutur();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttitudeGenerale() {
		return attitudeGenerale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttitudeGenerale(String newAttitudeGenerale) {
		String oldAttitudeGenerale = attitudeGenerale;
		attitudeGenerale = newAttitudeGenerale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ENNEMI_FUTUR__ATTITUDE_GENERALE, oldAttitudeGenerale, attitudeGenerale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEchelonEchelon getEchelonForce() {
		return echelonForce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEchelonForce(TypeDictionaryDicoEchelonEchelon newEchelonForce) {
		TypeDictionaryDicoEchelonEchelon oldEchelonForce = echelonForce;
		echelonForce = newEchelonForce == null ? ECHELON_FORCE_EDEFAULT : newEchelonForce;
		boolean oldEchelonForceESet = echelonForceESet;
		echelonForceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ENNEMI_FUTUR__ECHELON_FORCE, oldEchelonForce, echelonForce, !oldEchelonForceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEchelonForce() {
		TypeDictionaryDicoEchelonEchelon oldEchelonForce = echelonForce;
		boolean oldEchelonForceESet = echelonForceESet;
		echelonForce = ECHELON_FORCE_EDEFAULT;
		echelonForceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ENNEMI_FUTUR__ECHELON_FORCE, oldEchelonForce, ECHELON_FORCE_EDEFAULT, oldEchelonForceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEchelonForce() {
		return echelonForceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoModeMouvement getModeMouvement() {
		return modeMouvement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModeMouvement(TypeDictionaryDicoModeMouvement newModeMouvement) {
		TypeDictionaryDicoModeMouvement oldModeMouvement = modeMouvement;
		modeMouvement = newModeMouvement == null ? MODE_MOUVEMENT_EDEFAULT : newModeMouvement;
		boolean oldModeMouvementESet = modeMouvementESet;
		modeMouvementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ENNEMI_FUTUR__MODE_MOUVEMENT, oldModeMouvement, modeMouvement, !oldModeMouvementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetModeMouvement() {
		TypeDictionaryDicoModeMouvement oldModeMouvement = modeMouvement;
		boolean oldModeMouvementESet = modeMouvementESet;
		modeMouvement = MODE_MOUVEMENT_EDEFAULT;
		modeMouvementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ENNEMI_FUTUR__MODE_MOUVEMENT, oldModeMouvement, MODE_MOUVEMENT_EDEFAULT, oldModeMouvementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetModeMouvement() {
		return modeMouvementESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ENNEMI_FUTUR__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ENNEMI_FUTUR__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getConcerneFormationENIUnite() {
		if (concerneFormationENIUnite == null) {
			concerneFormationENIUnite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ENNEMI_FUTUR__CONCERNE_FORMATION_ENI_UNITE);
		}
		return concerneFormationENIUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourActionEnvisageeAction() {
		if (aPourActionEnvisageeAction == null) {
			aPourActionEnvisageeAction = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ENNEMI_FUTUR__APOUR_ACTION_ENVISAGEE_ACTION);
		}
		return aPourActionEnvisageeAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ENNEMI_FUTUR__CONCERNE_FORMATION_ENI_UNITE:
				return ((InternalEList<?>)getConcerneFormationENIUnite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ENNEMI_FUTUR__APOUR_ACTION_ENVISAGEE_ACTION:
				return ((InternalEList<?>)getAPourActionEnvisageeAction()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_ENNEMI_FUTUR__ATTITUDE_GENERALE:
				return getAttitudeGenerale();
			case SchemaPackage.TYPE_ENNEMI_FUTUR__ECHELON_FORCE:
				return getEchelonForce();
			case SchemaPackage.TYPE_ENNEMI_FUTUR__MODE_MOUVEMENT:
				return getModeMouvement();
			case SchemaPackage.TYPE_ENNEMI_FUTUR__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ENNEMI_FUTUR__CE:
				return getCE();
			case SchemaPackage.TYPE_ENNEMI_FUTUR__CONCERNE_FORMATION_ENI_UNITE:
				return getConcerneFormationENIUnite();
			case SchemaPackage.TYPE_ENNEMI_FUTUR__APOUR_ACTION_ENVISAGEE_ACTION:
				return getAPourActionEnvisageeAction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SchemaPackage.TYPE_ENNEMI_FUTUR__ATTITUDE_GENERALE:
				setAttitudeGenerale((String)newValue);
				return;
			case SchemaPackage.TYPE_ENNEMI_FUTUR__ECHELON_FORCE:
				setEchelonForce((TypeDictionaryDicoEchelonEchelon)newValue);
				return;
			case SchemaPackage.TYPE_ENNEMI_FUTUR__MODE_MOUVEMENT:
				setModeMouvement((TypeDictionaryDicoModeMouvement)newValue);
				return;
			case SchemaPackage.TYPE_ENNEMI_FUTUR__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ENNEMI_FUTUR__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ENNEMI_FUTUR__CONCERNE_FORMATION_ENI_UNITE:
				getConcerneFormationENIUnite().clear();
				getConcerneFormationENIUnite().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ENNEMI_FUTUR__APOUR_ACTION_ENVISAGEE_ACTION:
				getAPourActionEnvisageeAction().clear();
				getAPourActionEnvisageeAction().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_ENNEMI_FUTUR__ATTITUDE_GENERALE:
				setAttitudeGenerale(ATTITUDE_GENERALE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ENNEMI_FUTUR__ECHELON_FORCE:
				unsetEchelonForce();
				return;
			case SchemaPackage.TYPE_ENNEMI_FUTUR__MODE_MOUVEMENT:
				unsetModeMouvement();
				return;
			case SchemaPackage.TYPE_ENNEMI_FUTUR__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ENNEMI_FUTUR__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ENNEMI_FUTUR__CONCERNE_FORMATION_ENI_UNITE:
				getConcerneFormationENIUnite().clear();
				return;
			case SchemaPackage.TYPE_ENNEMI_FUTUR__APOUR_ACTION_ENVISAGEE_ACTION:
				getAPourActionEnvisageeAction().clear();
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
			case SchemaPackage.TYPE_ENNEMI_FUTUR__ATTITUDE_GENERALE:
				return ATTITUDE_GENERALE_EDEFAULT == null ? attitudeGenerale != null : !ATTITUDE_GENERALE_EDEFAULT.equals(attitudeGenerale);
			case SchemaPackage.TYPE_ENNEMI_FUTUR__ECHELON_FORCE:
				return isSetEchelonForce();
			case SchemaPackage.TYPE_ENNEMI_FUTUR__MODE_MOUVEMENT:
				return isSetModeMouvement();
			case SchemaPackage.TYPE_ENNEMI_FUTUR__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ENNEMI_FUTUR__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ENNEMI_FUTUR__CONCERNE_FORMATION_ENI_UNITE:
				return concerneFormationENIUnite != null && !concerneFormationENIUnite.isEmpty();
			case SchemaPackage.TYPE_ENNEMI_FUTUR__APOUR_ACTION_ENVISAGEE_ACTION:
				return aPourActionEnvisageeAction != null && !aPourActionEnvisageeAction.isEmpty();
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
		result.append(" (attitudeGenerale: ");
		result.append(attitudeGenerale);
		result.append(", echelonForce: ");
		if (echelonForceESet) result.append(echelonForce); else result.append("<unset>");
		result.append(", modeMouvement: ");
		if (modeMouvementESet) result.append(modeMouvement); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeEnnemiFuturImpl
