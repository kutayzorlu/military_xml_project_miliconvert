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
import mpia.schema.TypeArticulationSoutienMedical;
import mpia.schema.TypeMoyenPourSoutienMedical;
import mpia.schema.TypeQuantiteTypeUnite;

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
 * An implementation of the model object '<em><b>Type Articulation Soutien Medical</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeArticulationSoutienMedicalImpl#getComplement <em>Complement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeArticulationSoutienMedicalImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeArticulationSoutienMedicalImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeArticulationSoutienMedicalImpl#getAPourUniteSoutienMedicalAffecteeUnite <em>APour Unite Soutien Medical Affectee Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeArticulationSoutienMedicalImpl#getAPourUniteDeploiementInitialUnite <em>APour Unite Deploiement Initial Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeArticulationSoutienMedicalImpl#getAPourMoyensEnRenforcementPrelevementDetachement <em>APour Moyens En Renforcement Prelevement Detachement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeArticulationSoutienMedicalImpl#getAPourMoyenEnReserveMoyenPourSoutienMedical <em>APour Moyen En Reserve Moyen Pour Soutien Medical</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeArticulationSoutienMedicalImpl#getAPourForceAffecteeNonIdentifieeQuantiteTypeUnite <em>APour Force Affectee Non Identifiee Quantite Type Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeArticulationSoutienMedicalImpl extends EObjectImpl implements TypeArticulationSoutienMedical {
	/**
	 * The default value of the '{@link #getComplement() <em>Complement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplement()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPLEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComplement() <em>Complement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplement()
	 * @generated
	 * @ordered
	 */
	protected String complement = COMPLEMENT_EDEFAULT;

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
	 * The cached value of the '{@link #getAPourUniteSoutienMedicalAffecteeUnite() <em>APour Unite Soutien Medical Affectee Unite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourUniteSoutienMedicalAffecteeUnite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociationEXT> aPourUniteSoutienMedicalAffecteeUnite;

	/**
	 * The cached value of the '{@link #getAPourUniteDeploiementInitialUnite() <em>APour Unite Deploiement Initial Unite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourUniteDeploiementInitialUnite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociationEXT> aPourUniteDeploiementInitialUnite;

	/**
	 * The cached value of the '{@link #getAPourMoyensEnRenforcementPrelevementDetachement() <em>APour Moyens En Renforcement Prelevement Detachement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourMoyensEnRenforcementPrelevementDetachement()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourMoyensEnRenforcementPrelevementDetachement;

	/**
	 * The cached value of the '{@link #getAPourMoyenEnReserveMoyenPourSoutienMedical() <em>APour Moyen En Reserve Moyen Pour Soutien Medical</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourMoyenEnReserveMoyenPourSoutienMedical()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeMoyenPourSoutienMedical> aPourMoyenEnReserveMoyenPourSoutienMedical;

	/**
	 * The cached value of the '{@link #getAPourForceAffecteeNonIdentifieeQuantiteTypeUnite() <em>APour Force Affectee Non Identifiee Quantite Type Unite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourForceAffecteeNonIdentifieeQuantiteTypeUnite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeQuantiteTypeUnite> aPourForceAffecteeNonIdentifieeQuantiteTypeUnite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeArticulationSoutienMedicalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeArticulationSoutienMedical();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComplement() {
		return complement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplement(String newComplement) {
		String oldComplement = complement;
		complement = newComplement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ARTICULATION_SOUTIEN_MEDICAL__COMPLEMENT, oldComplement, complement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ARTICULATION_SOUTIEN_MEDICAL__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ARTICULATION_SOUTIEN_MEDICAL__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEXT> getAPourUniteSoutienMedicalAffecteeUnite() {
		if (aPourUniteSoutienMedicalAffecteeUnite == null) {
			aPourUniteSoutienMedicalAffecteeUnite = new EObjectContainmentEList<TypeAssociationEXT>(TypeAssociationEXT.class, this, SchemaPackage.TYPE_ARTICULATION_SOUTIEN_MEDICAL__APOUR_UNITE_SOUTIEN_MEDICAL_AFFECTEE_UNITE);
		}
		return aPourUniteSoutienMedicalAffecteeUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEXT> getAPourUniteDeploiementInitialUnite() {
		if (aPourUniteDeploiementInitialUnite == null) {
			aPourUniteDeploiementInitialUnite = new EObjectContainmentEList<TypeAssociationEXT>(TypeAssociationEXT.class, this, SchemaPackage.TYPE_ARTICULATION_SOUTIEN_MEDICAL__APOUR_UNITE_DEPLOIEMENT_INITIAL_UNITE);
		}
		return aPourUniteDeploiementInitialUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourMoyensEnRenforcementPrelevementDetachement() {
		if (aPourMoyensEnRenforcementPrelevementDetachement == null) {
			aPourMoyensEnRenforcementPrelevementDetachement = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ARTICULATION_SOUTIEN_MEDICAL__APOUR_MOYENS_EN_RENFORCEMENT_PRELEVEMENT_DETACHEMENT);
		}
		return aPourMoyensEnRenforcementPrelevementDetachement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeMoyenPourSoutienMedical> getAPourMoyenEnReserveMoyenPourSoutienMedical() {
		if (aPourMoyenEnReserveMoyenPourSoutienMedical == null) {
			aPourMoyenEnReserveMoyenPourSoutienMedical = new EObjectContainmentEList<TypeMoyenPourSoutienMedical>(TypeMoyenPourSoutienMedical.class, this, SchemaPackage.TYPE_ARTICULATION_SOUTIEN_MEDICAL__APOUR_MOYEN_EN_RESERVE_MOYEN_POUR_SOUTIEN_MEDICAL);
		}
		return aPourMoyenEnReserveMoyenPourSoutienMedical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeQuantiteTypeUnite> getAPourForceAffecteeNonIdentifieeQuantiteTypeUnite() {
		if (aPourForceAffecteeNonIdentifieeQuantiteTypeUnite == null) {
			aPourForceAffecteeNonIdentifieeQuantiteTypeUnite = new EObjectContainmentEList<TypeQuantiteTypeUnite>(TypeQuantiteTypeUnite.class, this, SchemaPackage.TYPE_ARTICULATION_SOUTIEN_MEDICAL__APOUR_FORCE_AFFECTEE_NON_IDENTIFIEE_QUANTITE_TYPE_UNITE);
		}
		return aPourForceAffecteeNonIdentifieeQuantiteTypeUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ARTICULATION_SOUTIEN_MEDICAL__APOUR_UNITE_SOUTIEN_MEDICAL_AFFECTEE_UNITE:
				return ((InternalEList<?>)getAPourUniteSoutienMedicalAffecteeUnite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ARTICULATION_SOUTIEN_MEDICAL__APOUR_UNITE_DEPLOIEMENT_INITIAL_UNITE:
				return ((InternalEList<?>)getAPourUniteDeploiementInitialUnite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ARTICULATION_SOUTIEN_MEDICAL__APOUR_MOYENS_EN_RENFORCEMENT_PRELEVEMENT_DETACHEMENT:
				return ((InternalEList<?>)getAPourMoyensEnRenforcementPrelevementDetachement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ARTICULATION_SOUTIEN_MEDICAL__APOUR_MOYEN_EN_RESERVE_MOYEN_POUR_SOUTIEN_MEDICAL:
				return ((InternalEList<?>)getAPourMoyenEnReserveMoyenPourSoutienMedical()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ARTICULATION_SOUTIEN_MEDICAL__APOUR_FORCE_AFFECTEE_NON_IDENTIFIEE_QUANTITE_TYPE_UNITE:
				return ((InternalEList<?>)getAPourForceAffecteeNonIdentifieeQuantiteTypeUnite()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_ARTICULATION_SOUTIEN_MEDICAL__COMPLEMENT:
				return getComplement();
			case SchemaPackage.TYPE_ARTICULATION_SOUTIEN_MEDICAL__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ARTICULATION_SOUTIEN_MEDICAL__CE:
				return getCE();
			case SchemaPackage.TYPE_ARTICULATION_SOUTIEN_MEDICAL__APOUR_UNITE_SOUTIEN_MEDICAL_AFFECTEE_UNITE:
				return getAPourUniteSoutienMedicalAffecteeUnite();
			case SchemaPackage.TYPE_ARTICULATION_SOUTIEN_MEDICAL__APOUR_UNITE_DEPLOIEMENT_INITIAL_UNITE:
				return getAPourUniteDeploiementInitialUnite();
			case SchemaPackage.TYPE_ARTICULATION_SOUTIEN_MEDICAL__APOUR_MOYENS_EN_RENFORCEMENT_PRELEVEMENT_DETACHEMENT:
				return getAPourMoyensEnRenforcementPrelevementDetachement();
			case SchemaPackage.TYPE_ARTICULATION_SOUTIEN_MEDICAL__APOUR_MOYEN_EN_RESERVE_MOYEN_POUR_SOUTIEN_MEDICAL:
				return getAPourMoyenEnReserveMoyenPourSoutienMedical();
			case SchemaPackage.TYPE_ARTICULATION_SOUTIEN_MEDICAL__APOUR_FORCE_AFFECTEE_NON_IDENTIFIEE_QUANTITE_TYPE_UNITE:
				return getAPourForceAffecteeNonIdentifieeQuantiteTypeUnite();
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
			case SchemaPackage.TYPE_ARTICULATION_SOUTIEN_MEDICAL__COMPLEMENT:
				setComplement((String)newValue);
				return;
			case SchemaPackage.TYPE_ARTICULATION_SOUTIEN_MEDICAL__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ARTICULATION_SOUTIEN_MEDICAL__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ARTICULATION_SOUTIEN_MEDICAL__APOUR_UNITE_SOUTIEN_MEDICAL_AFFECTEE_UNITE:
				getAPourUniteSoutienMedicalAffecteeUnite().clear();
				getAPourUniteSoutienMedicalAffecteeUnite().addAll((Collection<? extends TypeAssociationEXT>)newValue);
				return;
			case SchemaPackage.TYPE_ARTICULATION_SOUTIEN_MEDICAL__APOUR_UNITE_DEPLOIEMENT_INITIAL_UNITE:
				getAPourUniteDeploiementInitialUnite().clear();
				getAPourUniteDeploiementInitialUnite().addAll((Collection<? extends TypeAssociationEXT>)newValue);
				return;
			case SchemaPackage.TYPE_ARTICULATION_SOUTIEN_MEDICAL__APOUR_MOYENS_EN_RENFORCEMENT_PRELEVEMENT_DETACHEMENT:
				getAPourMoyensEnRenforcementPrelevementDetachement().clear();
				getAPourMoyensEnRenforcementPrelevementDetachement().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ARTICULATION_SOUTIEN_MEDICAL__APOUR_MOYEN_EN_RESERVE_MOYEN_POUR_SOUTIEN_MEDICAL:
				getAPourMoyenEnReserveMoyenPourSoutienMedical().clear();
				getAPourMoyenEnReserveMoyenPourSoutienMedical().addAll((Collection<? extends TypeMoyenPourSoutienMedical>)newValue);
				return;
			case SchemaPackage.TYPE_ARTICULATION_SOUTIEN_MEDICAL__APOUR_FORCE_AFFECTEE_NON_IDENTIFIEE_QUANTITE_TYPE_UNITE:
				getAPourForceAffecteeNonIdentifieeQuantiteTypeUnite().clear();
				getAPourForceAffecteeNonIdentifieeQuantiteTypeUnite().addAll((Collection<? extends TypeQuantiteTypeUnite>)newValue);
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
			case SchemaPackage.TYPE_ARTICULATION_SOUTIEN_MEDICAL__COMPLEMENT:
				setComplement(COMPLEMENT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ARTICULATION_SOUTIEN_MEDICAL__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ARTICULATION_SOUTIEN_MEDICAL__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ARTICULATION_SOUTIEN_MEDICAL__APOUR_UNITE_SOUTIEN_MEDICAL_AFFECTEE_UNITE:
				getAPourUniteSoutienMedicalAffecteeUnite().clear();
				return;
			case SchemaPackage.TYPE_ARTICULATION_SOUTIEN_MEDICAL__APOUR_UNITE_DEPLOIEMENT_INITIAL_UNITE:
				getAPourUniteDeploiementInitialUnite().clear();
				return;
			case SchemaPackage.TYPE_ARTICULATION_SOUTIEN_MEDICAL__APOUR_MOYENS_EN_RENFORCEMENT_PRELEVEMENT_DETACHEMENT:
				getAPourMoyensEnRenforcementPrelevementDetachement().clear();
				return;
			case SchemaPackage.TYPE_ARTICULATION_SOUTIEN_MEDICAL__APOUR_MOYEN_EN_RESERVE_MOYEN_POUR_SOUTIEN_MEDICAL:
				getAPourMoyenEnReserveMoyenPourSoutienMedical().clear();
				return;
			case SchemaPackage.TYPE_ARTICULATION_SOUTIEN_MEDICAL__APOUR_FORCE_AFFECTEE_NON_IDENTIFIEE_QUANTITE_TYPE_UNITE:
				getAPourForceAffecteeNonIdentifieeQuantiteTypeUnite().clear();
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
			case SchemaPackage.TYPE_ARTICULATION_SOUTIEN_MEDICAL__COMPLEMENT:
				return COMPLEMENT_EDEFAULT == null ? complement != null : !COMPLEMENT_EDEFAULT.equals(complement);
			case SchemaPackage.TYPE_ARTICULATION_SOUTIEN_MEDICAL__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ARTICULATION_SOUTIEN_MEDICAL__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ARTICULATION_SOUTIEN_MEDICAL__APOUR_UNITE_SOUTIEN_MEDICAL_AFFECTEE_UNITE:
				return aPourUniteSoutienMedicalAffecteeUnite != null && !aPourUniteSoutienMedicalAffecteeUnite.isEmpty();
			case SchemaPackage.TYPE_ARTICULATION_SOUTIEN_MEDICAL__APOUR_UNITE_DEPLOIEMENT_INITIAL_UNITE:
				return aPourUniteDeploiementInitialUnite != null && !aPourUniteDeploiementInitialUnite.isEmpty();
			case SchemaPackage.TYPE_ARTICULATION_SOUTIEN_MEDICAL__APOUR_MOYENS_EN_RENFORCEMENT_PRELEVEMENT_DETACHEMENT:
				return aPourMoyensEnRenforcementPrelevementDetachement != null && !aPourMoyensEnRenforcementPrelevementDetachement.isEmpty();
			case SchemaPackage.TYPE_ARTICULATION_SOUTIEN_MEDICAL__APOUR_MOYEN_EN_RESERVE_MOYEN_POUR_SOUTIEN_MEDICAL:
				return aPourMoyenEnReserveMoyenPourSoutienMedical != null && !aPourMoyenEnReserveMoyenPourSoutienMedical.isEmpty();
			case SchemaPackage.TYPE_ARTICULATION_SOUTIEN_MEDICAL__APOUR_FORCE_AFFECTEE_NON_IDENTIFIEE_QUANTITE_TYPE_UNITE:
				return aPourForceAffecteeNonIdentifieeQuantiteTypeUnite != null && !aPourForceAffecteeNonIdentifieeQuantiteTypeUnite.isEmpty();
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
		result.append(" (complement: ");
		result.append(complement);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeArticulationSoutienMedicalImpl
