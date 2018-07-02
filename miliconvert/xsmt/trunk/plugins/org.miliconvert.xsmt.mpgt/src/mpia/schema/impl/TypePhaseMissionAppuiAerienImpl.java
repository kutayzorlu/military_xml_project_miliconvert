/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoPhaseMissionAppuiAerienDesignation;
import mpia.schema.TypeDictionaryDicoPhaseMissionAppuiAerienTypePhase;
import mpia.schema.TypePeriode3D;
import mpia.schema.TypePhaseMissionAppuiAerien;

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
 * An implementation of the model object '<em><b>Type Phase Mission Appui Aerien</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypePhaseMissionAppuiAerienImpl#getDesignation <em>Designation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePhaseMissionAppuiAerienImpl#getTypePhase <em>Type Phase</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePhaseMissionAppuiAerienImpl#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePhaseMissionAppuiAerienImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePhaseMissionAppuiAerienImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePhaseMissionAppuiAerienImpl#getVautPendantPeriode3D <em>Vaut Pendant Periode3 D</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypePhaseMissionAppuiAerienImpl extends EObjectImpl implements TypePhaseMissionAppuiAerien {
	/**
	 * The default value of the '{@link #getDesignation() <em>Designation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignation()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPhaseMissionAppuiAerienDesignation DESIGNATION_EDEFAULT = TypeDictionaryDicoPhaseMissionAppuiAerienDesignation.CASW;

	/**
	 * The cached value of the '{@link #getDesignation() <em>Designation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignation()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPhaseMissionAppuiAerienDesignation designation = DESIGNATION_EDEFAULT;

	/**
	 * This is true if the Designation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean designationESet;

	/**
	 * The default value of the '{@link #getTypePhase() <em>Type Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypePhase()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPhaseMissionAppuiAerienTypePhase TYPE_PHASE_EDEFAULT = TypeDictionaryDicoPhaseMissionAppuiAerienTypePhase.AIRALERT;

	/**
	 * The cached value of the '{@link #getTypePhase() <em>Type Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypePhase()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPhaseMissionAppuiAerienTypePhase typePhase = TYPE_PHASE_EDEFAULT;

	/**
	 * This is true if the Type Phase attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typePhaseESet;

	/**
	 * The default value of the '{@link #getCommentaire() <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaire()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTAIRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommentaire() <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaire()
	 * @generated
	 * @ordered
	 */
	protected String commentaire = COMMENTAIRE_EDEFAULT;

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
	 * The cached value of the '{@link #getVautPendantPeriode3D() <em>Vaut Pendant Periode3 D</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVautPendantPeriode3D()
	 * @generated
	 * @ordered
	 */
	protected EList<TypePeriode3D> vautPendantPeriode3D;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypePhaseMissionAppuiAerienImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypePhaseMissionAppuiAerien();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoPhaseMissionAppuiAerienDesignation getDesignation() {
		return designation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesignation(TypeDictionaryDicoPhaseMissionAppuiAerienDesignation newDesignation) {
		TypeDictionaryDicoPhaseMissionAppuiAerienDesignation oldDesignation = designation;
		designation = newDesignation == null ? DESIGNATION_EDEFAULT : newDesignation;
		boolean oldDesignationESet = designationESet;
		designationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PHASE_MISSION_APPUI_AERIEN__DESIGNATION, oldDesignation, designation, !oldDesignationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDesignation() {
		TypeDictionaryDicoPhaseMissionAppuiAerienDesignation oldDesignation = designation;
		boolean oldDesignationESet = designationESet;
		designation = DESIGNATION_EDEFAULT;
		designationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PHASE_MISSION_APPUI_AERIEN__DESIGNATION, oldDesignation, DESIGNATION_EDEFAULT, oldDesignationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDesignation() {
		return designationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoPhaseMissionAppuiAerienTypePhase getTypePhase() {
		return typePhase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypePhase(TypeDictionaryDicoPhaseMissionAppuiAerienTypePhase newTypePhase) {
		TypeDictionaryDicoPhaseMissionAppuiAerienTypePhase oldTypePhase = typePhase;
		typePhase = newTypePhase == null ? TYPE_PHASE_EDEFAULT : newTypePhase;
		boolean oldTypePhaseESet = typePhaseESet;
		typePhaseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PHASE_MISSION_APPUI_AERIEN__TYPE_PHASE, oldTypePhase, typePhase, !oldTypePhaseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypePhase() {
		TypeDictionaryDicoPhaseMissionAppuiAerienTypePhase oldTypePhase = typePhase;
		boolean oldTypePhaseESet = typePhaseESet;
		typePhase = TYPE_PHASE_EDEFAULT;
		typePhaseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PHASE_MISSION_APPUI_AERIEN__TYPE_PHASE, oldTypePhase, TYPE_PHASE_EDEFAULT, oldTypePhaseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypePhase() {
		return typePhaseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommentaire() {
		return commentaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommentaire(String newCommentaire) {
		String oldCommentaire = commentaire;
		commentaire = newCommentaire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PHASE_MISSION_APPUI_AERIEN__COMMENTAIRE, oldCommentaire, commentaire));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PHASE_MISSION_APPUI_AERIEN__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PHASE_MISSION_APPUI_AERIEN__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypePeriode3D> getVautPendantPeriode3D() {
		if (vautPendantPeriode3D == null) {
			vautPendantPeriode3D = new EObjectContainmentEList<TypePeriode3D>(TypePeriode3D.class, this, SchemaPackage.TYPE_PHASE_MISSION_APPUI_AERIEN__VAUT_PENDANT_PERIODE3_D);
		}
		return vautPendantPeriode3D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_PHASE_MISSION_APPUI_AERIEN__VAUT_PENDANT_PERIODE3_D:
				return ((InternalEList<?>)getVautPendantPeriode3D()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_PHASE_MISSION_APPUI_AERIEN__DESIGNATION:
				return getDesignation();
			case SchemaPackage.TYPE_PHASE_MISSION_APPUI_AERIEN__TYPE_PHASE:
				return getTypePhase();
			case SchemaPackage.TYPE_PHASE_MISSION_APPUI_AERIEN__COMMENTAIRE:
				return getCommentaire();
			case SchemaPackage.TYPE_PHASE_MISSION_APPUI_AERIEN__CTE:
				return getCTE();
			case SchemaPackage.TYPE_PHASE_MISSION_APPUI_AERIEN__CE:
				return getCE();
			case SchemaPackage.TYPE_PHASE_MISSION_APPUI_AERIEN__VAUT_PENDANT_PERIODE3_D:
				return getVautPendantPeriode3D();
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
			case SchemaPackage.TYPE_PHASE_MISSION_APPUI_AERIEN__DESIGNATION:
				setDesignation((TypeDictionaryDicoPhaseMissionAppuiAerienDesignation)newValue);
				return;
			case SchemaPackage.TYPE_PHASE_MISSION_APPUI_AERIEN__TYPE_PHASE:
				setTypePhase((TypeDictionaryDicoPhaseMissionAppuiAerienTypePhase)newValue);
				return;
			case SchemaPackage.TYPE_PHASE_MISSION_APPUI_AERIEN__COMMENTAIRE:
				setCommentaire((String)newValue);
				return;
			case SchemaPackage.TYPE_PHASE_MISSION_APPUI_AERIEN__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_PHASE_MISSION_APPUI_AERIEN__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_PHASE_MISSION_APPUI_AERIEN__VAUT_PENDANT_PERIODE3_D:
				getVautPendantPeriode3D().clear();
				getVautPendantPeriode3D().addAll((Collection<? extends TypePeriode3D>)newValue);
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
			case SchemaPackage.TYPE_PHASE_MISSION_APPUI_AERIEN__DESIGNATION:
				unsetDesignation();
				return;
			case SchemaPackage.TYPE_PHASE_MISSION_APPUI_AERIEN__TYPE_PHASE:
				unsetTypePhase();
				return;
			case SchemaPackage.TYPE_PHASE_MISSION_APPUI_AERIEN__COMMENTAIRE:
				setCommentaire(COMMENTAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PHASE_MISSION_APPUI_AERIEN__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PHASE_MISSION_APPUI_AERIEN__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PHASE_MISSION_APPUI_AERIEN__VAUT_PENDANT_PERIODE3_D:
				getVautPendantPeriode3D().clear();
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
			case SchemaPackage.TYPE_PHASE_MISSION_APPUI_AERIEN__DESIGNATION:
				return isSetDesignation();
			case SchemaPackage.TYPE_PHASE_MISSION_APPUI_AERIEN__TYPE_PHASE:
				return isSetTypePhase();
			case SchemaPackage.TYPE_PHASE_MISSION_APPUI_AERIEN__COMMENTAIRE:
				return COMMENTAIRE_EDEFAULT == null ? commentaire != null : !COMMENTAIRE_EDEFAULT.equals(commentaire);
			case SchemaPackage.TYPE_PHASE_MISSION_APPUI_AERIEN__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_PHASE_MISSION_APPUI_AERIEN__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_PHASE_MISSION_APPUI_AERIEN__VAUT_PENDANT_PERIODE3_D:
				return vautPendantPeriode3D != null && !vautPendantPeriode3D.isEmpty();
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
		result.append(" (designation: ");
		if (designationESet) result.append(designation); else result.append("<unset>");
		result.append(", typePhase: ");
		if (typePhaseESet) result.append(typePhase); else result.append("<unset>");
		result.append(", commentaire: ");
		result.append(commentaire);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypePhaseMissionAppuiAerienImpl
