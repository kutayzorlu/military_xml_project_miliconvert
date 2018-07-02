/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoEchelonEchelon;
import mpia.schema.TypeEchelon;

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
 * An implementation of the model object '<em><b>Type Echelon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEchelonImpl#getEchelon <em>Echelon</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEchelonImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEchelonImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEchelonImpl#getAPourUnitesParticipantesUnite <em>APour Unites Participantes Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEchelonImpl#getEstAppliqueMissionMelee <em>Est Applique Mission Melee</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeEchelonImpl extends EObjectImpl implements TypeEchelon {
	/**
	 * The default value of the '{@link #getEchelon() <em>Echelon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEchelon()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEchelonEchelon ECHELON_EDEFAULT = TypeDictionaryDicoEchelonEchelon._1ECH;

	/**
	 * The cached value of the '{@link #getEchelon() <em>Echelon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEchelon()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEchelonEchelon echelon = ECHELON_EDEFAULT;

	/**
	 * This is true if the Echelon attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean echelonESet;

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
	 * The cached value of the '{@link #getAPourUnitesParticipantesUnite() <em>APour Unites Participantes Unite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourUnitesParticipantesUnite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociationEXT> aPourUnitesParticipantesUnite;

	/**
	 * The cached value of the '{@link #getEstAppliqueMissionMelee() <em>Est Applique Mission Melee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstAppliqueMissionMelee()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation estAppliqueMissionMelee;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeEchelonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEchelon();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEchelonEchelon getEchelon() {
		return echelon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEchelon(TypeDictionaryDicoEchelonEchelon newEchelon) {
		TypeDictionaryDicoEchelonEchelon oldEchelon = echelon;
		echelon = newEchelon == null ? ECHELON_EDEFAULT : newEchelon;
		boolean oldEchelonESet = echelonESet;
		echelonESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ECHELON__ECHELON, oldEchelon, echelon, !oldEchelonESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEchelon() {
		TypeDictionaryDicoEchelonEchelon oldEchelon = echelon;
		boolean oldEchelonESet = echelonESet;
		echelon = ECHELON_EDEFAULT;
		echelonESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ECHELON__ECHELON, oldEchelon, ECHELON_EDEFAULT, oldEchelonESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEchelon() {
		return echelonESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ECHELON__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ECHELON__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEXT> getAPourUnitesParticipantesUnite() {
		if (aPourUnitesParticipantesUnite == null) {
			aPourUnitesParticipantesUnite = new EObjectContainmentEList<TypeAssociationEXT>(TypeAssociationEXT.class, this, SchemaPackage.TYPE_ECHELON__APOUR_UNITES_PARTICIPANTES_UNITE);
		}
		return aPourUnitesParticipantesUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getEstAppliqueMissionMelee() {
		return estAppliqueMissionMelee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstAppliqueMissionMelee(TypeAssociation newEstAppliqueMissionMelee, NotificationChain msgs) {
		TypeAssociation oldEstAppliqueMissionMelee = estAppliqueMissionMelee;
		estAppliqueMissionMelee = newEstAppliqueMissionMelee;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ECHELON__EST_APPLIQUE_MISSION_MELEE, oldEstAppliqueMissionMelee, newEstAppliqueMissionMelee);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstAppliqueMissionMelee(TypeAssociation newEstAppliqueMissionMelee) {
		if (newEstAppliqueMissionMelee != estAppliqueMissionMelee) {
			NotificationChain msgs = null;
			if (estAppliqueMissionMelee != null)
				msgs = ((InternalEObject)estAppliqueMissionMelee).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ECHELON__EST_APPLIQUE_MISSION_MELEE, null, msgs);
			if (newEstAppliqueMissionMelee != null)
				msgs = ((InternalEObject)newEstAppliqueMissionMelee).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ECHELON__EST_APPLIQUE_MISSION_MELEE, null, msgs);
			msgs = basicSetEstAppliqueMissionMelee(newEstAppliqueMissionMelee, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ECHELON__EST_APPLIQUE_MISSION_MELEE, newEstAppliqueMissionMelee, newEstAppliqueMissionMelee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ECHELON__APOUR_UNITES_PARTICIPANTES_UNITE:
				return ((InternalEList<?>)getAPourUnitesParticipantesUnite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ECHELON__EST_APPLIQUE_MISSION_MELEE:
				return basicSetEstAppliqueMissionMelee(null, msgs);
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
			case SchemaPackage.TYPE_ECHELON__ECHELON:
				return getEchelon();
			case SchemaPackage.TYPE_ECHELON__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ECHELON__CE:
				return getCE();
			case SchemaPackage.TYPE_ECHELON__APOUR_UNITES_PARTICIPANTES_UNITE:
				return getAPourUnitesParticipantesUnite();
			case SchemaPackage.TYPE_ECHELON__EST_APPLIQUE_MISSION_MELEE:
				return getEstAppliqueMissionMelee();
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
			case SchemaPackage.TYPE_ECHELON__ECHELON:
				setEchelon((TypeDictionaryDicoEchelonEchelon)newValue);
				return;
			case SchemaPackage.TYPE_ECHELON__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ECHELON__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ECHELON__APOUR_UNITES_PARTICIPANTES_UNITE:
				getAPourUnitesParticipantesUnite().clear();
				getAPourUnitesParticipantesUnite().addAll((Collection<? extends TypeAssociationEXT>)newValue);
				return;
			case SchemaPackage.TYPE_ECHELON__EST_APPLIQUE_MISSION_MELEE:
				setEstAppliqueMissionMelee((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ECHELON__ECHELON:
				unsetEchelon();
				return;
			case SchemaPackage.TYPE_ECHELON__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ECHELON__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ECHELON__APOUR_UNITES_PARTICIPANTES_UNITE:
				getAPourUnitesParticipantesUnite().clear();
				return;
			case SchemaPackage.TYPE_ECHELON__EST_APPLIQUE_MISSION_MELEE:
				setEstAppliqueMissionMelee((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ECHELON__ECHELON:
				return isSetEchelon();
			case SchemaPackage.TYPE_ECHELON__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ECHELON__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ECHELON__APOUR_UNITES_PARTICIPANTES_UNITE:
				return aPourUnitesParticipantesUnite != null && !aPourUnitesParticipantesUnite.isEmpty();
			case SchemaPackage.TYPE_ECHELON__EST_APPLIQUE_MISSION_MELEE:
				return estAppliqueMissionMelee != null;
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
		result.append(" (echelon: ");
		if (echelonESet) result.append(echelon); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeEchelonImpl
