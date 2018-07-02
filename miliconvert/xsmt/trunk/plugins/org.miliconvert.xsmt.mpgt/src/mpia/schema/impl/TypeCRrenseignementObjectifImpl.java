/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCRevaluationDegats;
import mpia.schema.TypeCRfinMissionAcquisition;
import mpia.schema.TypeCRrenseignementObjectif;
import mpia.schema.TypeDictionaryDicoCRrenseignementObjectifCategorie;
import mpia.schema.TypeElementCRintermediaireAcquisition;

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
 * An implementation of the model object '<em><b>Type CRrenseignement Objectif</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeCRrenseignementObjectifImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCRrenseignementObjectifImpl#getAPourUniteRendantCompteUnite <em>APour Unite Rendant Compte Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCRrenseignementObjectifImpl#getAPourCaracteristiquesCRintermediaireAcquisitionElementCRintermediaireAcquisition <em>APour Caracteristiques CRintermediaire Acquisition Element CRintermediaire Acquisition</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCRrenseignementObjectifImpl#getAPourCaracteristiquesCRfinMissionAcquisitionCRfinMissionAcquisition <em>APour Caracteristiques CRfin Mission Acquisition CRfin Mission Acquisition</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCRrenseignementObjectifImpl#getAPourCaracteristiquesCRevaluationDegatsCRevaluationDegats <em>APour Caracteristiques CRevaluation Degats CRevaluation Degats</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeCRrenseignementObjectifImpl extends EObjectImpl implements TypeCRrenseignementObjectif {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCRrenseignementObjectifCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoCRrenseignementObjectifCategorie.DAMASS;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCRrenseignementObjectifCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The cached value of the '{@link #getAPourUniteRendantCompteUnite() <em>APour Unite Rendant Compte Unite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourUniteRendantCompteUnite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociationEXT> aPourUniteRendantCompteUnite;

	/**
	 * The cached value of the '{@link #getAPourCaracteristiquesCRintermediaireAcquisitionElementCRintermediaireAcquisition() <em>APour Caracteristiques CRintermediaire Acquisition Element CRintermediaire Acquisition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourCaracteristiquesCRintermediaireAcquisitionElementCRintermediaireAcquisition()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeElementCRintermediaireAcquisition> aPourCaracteristiquesCRintermediaireAcquisitionElementCRintermediaireAcquisition;

	/**
	 * The cached value of the '{@link #getAPourCaracteristiquesCRfinMissionAcquisitionCRfinMissionAcquisition() <em>APour Caracteristiques CRfin Mission Acquisition CRfin Mission Acquisition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourCaracteristiquesCRfinMissionAcquisitionCRfinMissionAcquisition()
	 * @generated
	 * @ordered
	 */
	protected TypeCRfinMissionAcquisition aPourCaracteristiquesCRfinMissionAcquisitionCRfinMissionAcquisition;

	/**
	 * The cached value of the '{@link #getAPourCaracteristiquesCRevaluationDegatsCRevaluationDegats() <em>APour Caracteristiques CRevaluation Degats CRevaluation Degats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourCaracteristiquesCRevaluationDegatsCRevaluationDegats()
	 * @generated
	 * @ordered
	 */
	protected TypeCRevaluationDegats aPourCaracteristiquesCRevaluationDegatsCRevaluationDegats;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeCRrenseignementObjectifImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeCRrenseignementObjectif();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoCRrenseignementObjectifCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoCRrenseignementObjectifCategorie newCategorie) {
		TypeDictionaryDicoCRrenseignementObjectifCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CRRENSEIGNEMENT_OBJECTIF__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoCRrenseignementObjectifCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CRRENSEIGNEMENT_OBJECTIF__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCategorie() {
		return categorieESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEXT> getAPourUniteRendantCompteUnite() {
		if (aPourUniteRendantCompteUnite == null) {
			aPourUniteRendantCompteUnite = new EObjectContainmentEList<TypeAssociationEXT>(TypeAssociationEXT.class, this, SchemaPackage.TYPE_CRRENSEIGNEMENT_OBJECTIF__APOUR_UNITE_RENDANT_COMPTE_UNITE);
		}
		return aPourUniteRendantCompteUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeElementCRintermediaireAcquisition> getAPourCaracteristiquesCRintermediaireAcquisitionElementCRintermediaireAcquisition() {
		if (aPourCaracteristiquesCRintermediaireAcquisitionElementCRintermediaireAcquisition == null) {
			aPourCaracteristiquesCRintermediaireAcquisitionElementCRintermediaireAcquisition = new EObjectContainmentEList<TypeElementCRintermediaireAcquisition>(TypeElementCRintermediaireAcquisition.class, this, SchemaPackage.TYPE_CRRENSEIGNEMENT_OBJECTIF__APOUR_CARACTERISTIQUES_CRINTERMEDIAIRE_ACQUISITION_ELEMENT_CRINTERMEDIAIRE_ACQUISITION);
		}
		return aPourCaracteristiquesCRintermediaireAcquisitionElementCRintermediaireAcquisition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeCRfinMissionAcquisition getAPourCaracteristiquesCRfinMissionAcquisitionCRfinMissionAcquisition() {
		return aPourCaracteristiquesCRfinMissionAcquisitionCRfinMissionAcquisition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourCaracteristiquesCRfinMissionAcquisitionCRfinMissionAcquisition(TypeCRfinMissionAcquisition newAPourCaracteristiquesCRfinMissionAcquisitionCRfinMissionAcquisition, NotificationChain msgs) {
		TypeCRfinMissionAcquisition oldAPourCaracteristiquesCRfinMissionAcquisitionCRfinMissionAcquisition = aPourCaracteristiquesCRfinMissionAcquisitionCRfinMissionAcquisition;
		aPourCaracteristiquesCRfinMissionAcquisitionCRfinMissionAcquisition = newAPourCaracteristiquesCRfinMissionAcquisitionCRfinMissionAcquisition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CRRENSEIGNEMENT_OBJECTIF__APOUR_CARACTERISTIQUES_CRFIN_MISSION_ACQUISITION_CRFIN_MISSION_ACQUISITION, oldAPourCaracteristiquesCRfinMissionAcquisitionCRfinMissionAcquisition, newAPourCaracteristiquesCRfinMissionAcquisitionCRfinMissionAcquisition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourCaracteristiquesCRfinMissionAcquisitionCRfinMissionAcquisition(TypeCRfinMissionAcquisition newAPourCaracteristiquesCRfinMissionAcquisitionCRfinMissionAcquisition) {
		if (newAPourCaracteristiquesCRfinMissionAcquisitionCRfinMissionAcquisition != aPourCaracteristiquesCRfinMissionAcquisitionCRfinMissionAcquisition) {
			NotificationChain msgs = null;
			if (aPourCaracteristiquesCRfinMissionAcquisitionCRfinMissionAcquisition != null)
				msgs = ((InternalEObject)aPourCaracteristiquesCRfinMissionAcquisitionCRfinMissionAcquisition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CRRENSEIGNEMENT_OBJECTIF__APOUR_CARACTERISTIQUES_CRFIN_MISSION_ACQUISITION_CRFIN_MISSION_ACQUISITION, null, msgs);
			if (newAPourCaracteristiquesCRfinMissionAcquisitionCRfinMissionAcquisition != null)
				msgs = ((InternalEObject)newAPourCaracteristiquesCRfinMissionAcquisitionCRfinMissionAcquisition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CRRENSEIGNEMENT_OBJECTIF__APOUR_CARACTERISTIQUES_CRFIN_MISSION_ACQUISITION_CRFIN_MISSION_ACQUISITION, null, msgs);
			msgs = basicSetAPourCaracteristiquesCRfinMissionAcquisitionCRfinMissionAcquisition(newAPourCaracteristiquesCRfinMissionAcquisitionCRfinMissionAcquisition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CRRENSEIGNEMENT_OBJECTIF__APOUR_CARACTERISTIQUES_CRFIN_MISSION_ACQUISITION_CRFIN_MISSION_ACQUISITION, newAPourCaracteristiquesCRfinMissionAcquisitionCRfinMissionAcquisition, newAPourCaracteristiquesCRfinMissionAcquisitionCRfinMissionAcquisition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeCRevaluationDegats getAPourCaracteristiquesCRevaluationDegatsCRevaluationDegats() {
		return aPourCaracteristiquesCRevaluationDegatsCRevaluationDegats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourCaracteristiquesCRevaluationDegatsCRevaluationDegats(TypeCRevaluationDegats newAPourCaracteristiquesCRevaluationDegatsCRevaluationDegats, NotificationChain msgs) {
		TypeCRevaluationDegats oldAPourCaracteristiquesCRevaluationDegatsCRevaluationDegats = aPourCaracteristiquesCRevaluationDegatsCRevaluationDegats;
		aPourCaracteristiquesCRevaluationDegatsCRevaluationDegats = newAPourCaracteristiquesCRevaluationDegatsCRevaluationDegats;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CRRENSEIGNEMENT_OBJECTIF__APOUR_CARACTERISTIQUES_CREVALUATION_DEGATS_CREVALUATION_DEGATS, oldAPourCaracteristiquesCRevaluationDegatsCRevaluationDegats, newAPourCaracteristiquesCRevaluationDegatsCRevaluationDegats);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourCaracteristiquesCRevaluationDegatsCRevaluationDegats(TypeCRevaluationDegats newAPourCaracteristiquesCRevaluationDegatsCRevaluationDegats) {
		if (newAPourCaracteristiquesCRevaluationDegatsCRevaluationDegats != aPourCaracteristiquesCRevaluationDegatsCRevaluationDegats) {
			NotificationChain msgs = null;
			if (aPourCaracteristiquesCRevaluationDegatsCRevaluationDegats != null)
				msgs = ((InternalEObject)aPourCaracteristiquesCRevaluationDegatsCRevaluationDegats).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CRRENSEIGNEMENT_OBJECTIF__APOUR_CARACTERISTIQUES_CREVALUATION_DEGATS_CREVALUATION_DEGATS, null, msgs);
			if (newAPourCaracteristiquesCRevaluationDegatsCRevaluationDegats != null)
				msgs = ((InternalEObject)newAPourCaracteristiquesCRevaluationDegatsCRevaluationDegats).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CRRENSEIGNEMENT_OBJECTIF__APOUR_CARACTERISTIQUES_CREVALUATION_DEGATS_CREVALUATION_DEGATS, null, msgs);
			msgs = basicSetAPourCaracteristiquesCRevaluationDegatsCRevaluationDegats(newAPourCaracteristiquesCRevaluationDegatsCRevaluationDegats, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CRRENSEIGNEMENT_OBJECTIF__APOUR_CARACTERISTIQUES_CREVALUATION_DEGATS_CREVALUATION_DEGATS, newAPourCaracteristiquesCRevaluationDegatsCRevaluationDegats, newAPourCaracteristiquesCRevaluationDegatsCRevaluationDegats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_CRRENSEIGNEMENT_OBJECTIF__APOUR_UNITE_RENDANT_COMPTE_UNITE:
				return ((InternalEList<?>)getAPourUniteRendantCompteUnite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_CRRENSEIGNEMENT_OBJECTIF__APOUR_CARACTERISTIQUES_CRINTERMEDIAIRE_ACQUISITION_ELEMENT_CRINTERMEDIAIRE_ACQUISITION:
				return ((InternalEList<?>)getAPourCaracteristiquesCRintermediaireAcquisitionElementCRintermediaireAcquisition()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_CRRENSEIGNEMENT_OBJECTIF__APOUR_CARACTERISTIQUES_CRFIN_MISSION_ACQUISITION_CRFIN_MISSION_ACQUISITION:
				return basicSetAPourCaracteristiquesCRfinMissionAcquisitionCRfinMissionAcquisition(null, msgs);
			case SchemaPackage.TYPE_CRRENSEIGNEMENT_OBJECTIF__APOUR_CARACTERISTIQUES_CREVALUATION_DEGATS_CREVALUATION_DEGATS:
				return basicSetAPourCaracteristiquesCRevaluationDegatsCRevaluationDegats(null, msgs);
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
			case SchemaPackage.TYPE_CRRENSEIGNEMENT_OBJECTIF__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_CRRENSEIGNEMENT_OBJECTIF__APOUR_UNITE_RENDANT_COMPTE_UNITE:
				return getAPourUniteRendantCompteUnite();
			case SchemaPackage.TYPE_CRRENSEIGNEMENT_OBJECTIF__APOUR_CARACTERISTIQUES_CRINTERMEDIAIRE_ACQUISITION_ELEMENT_CRINTERMEDIAIRE_ACQUISITION:
				return getAPourCaracteristiquesCRintermediaireAcquisitionElementCRintermediaireAcquisition();
			case SchemaPackage.TYPE_CRRENSEIGNEMENT_OBJECTIF__APOUR_CARACTERISTIQUES_CRFIN_MISSION_ACQUISITION_CRFIN_MISSION_ACQUISITION:
				return getAPourCaracteristiquesCRfinMissionAcquisitionCRfinMissionAcquisition();
			case SchemaPackage.TYPE_CRRENSEIGNEMENT_OBJECTIF__APOUR_CARACTERISTIQUES_CREVALUATION_DEGATS_CREVALUATION_DEGATS:
				return getAPourCaracteristiquesCRevaluationDegatsCRevaluationDegats();
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
			case SchemaPackage.TYPE_CRRENSEIGNEMENT_OBJECTIF__CATEGORIE:
				setCategorie((TypeDictionaryDicoCRrenseignementObjectifCategorie)newValue);
				return;
			case SchemaPackage.TYPE_CRRENSEIGNEMENT_OBJECTIF__APOUR_UNITE_RENDANT_COMPTE_UNITE:
				getAPourUniteRendantCompteUnite().clear();
				getAPourUniteRendantCompteUnite().addAll((Collection<? extends TypeAssociationEXT>)newValue);
				return;
			case SchemaPackage.TYPE_CRRENSEIGNEMENT_OBJECTIF__APOUR_CARACTERISTIQUES_CRINTERMEDIAIRE_ACQUISITION_ELEMENT_CRINTERMEDIAIRE_ACQUISITION:
				getAPourCaracteristiquesCRintermediaireAcquisitionElementCRintermediaireAcquisition().clear();
				getAPourCaracteristiquesCRintermediaireAcquisitionElementCRintermediaireAcquisition().addAll((Collection<? extends TypeElementCRintermediaireAcquisition>)newValue);
				return;
			case SchemaPackage.TYPE_CRRENSEIGNEMENT_OBJECTIF__APOUR_CARACTERISTIQUES_CRFIN_MISSION_ACQUISITION_CRFIN_MISSION_ACQUISITION:
				setAPourCaracteristiquesCRfinMissionAcquisitionCRfinMissionAcquisition((TypeCRfinMissionAcquisition)newValue);
				return;
			case SchemaPackage.TYPE_CRRENSEIGNEMENT_OBJECTIF__APOUR_CARACTERISTIQUES_CREVALUATION_DEGATS_CREVALUATION_DEGATS:
				setAPourCaracteristiquesCRevaluationDegatsCRevaluationDegats((TypeCRevaluationDegats)newValue);
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
			case SchemaPackage.TYPE_CRRENSEIGNEMENT_OBJECTIF__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_CRRENSEIGNEMENT_OBJECTIF__APOUR_UNITE_RENDANT_COMPTE_UNITE:
				getAPourUniteRendantCompteUnite().clear();
				return;
			case SchemaPackage.TYPE_CRRENSEIGNEMENT_OBJECTIF__APOUR_CARACTERISTIQUES_CRINTERMEDIAIRE_ACQUISITION_ELEMENT_CRINTERMEDIAIRE_ACQUISITION:
				getAPourCaracteristiquesCRintermediaireAcquisitionElementCRintermediaireAcquisition().clear();
				return;
			case SchemaPackage.TYPE_CRRENSEIGNEMENT_OBJECTIF__APOUR_CARACTERISTIQUES_CRFIN_MISSION_ACQUISITION_CRFIN_MISSION_ACQUISITION:
				setAPourCaracteristiquesCRfinMissionAcquisitionCRfinMissionAcquisition((TypeCRfinMissionAcquisition)null);
				return;
			case SchemaPackage.TYPE_CRRENSEIGNEMENT_OBJECTIF__APOUR_CARACTERISTIQUES_CREVALUATION_DEGATS_CREVALUATION_DEGATS:
				setAPourCaracteristiquesCRevaluationDegatsCRevaluationDegats((TypeCRevaluationDegats)null);
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
			case SchemaPackage.TYPE_CRRENSEIGNEMENT_OBJECTIF__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_CRRENSEIGNEMENT_OBJECTIF__APOUR_UNITE_RENDANT_COMPTE_UNITE:
				return aPourUniteRendantCompteUnite != null && !aPourUniteRendantCompteUnite.isEmpty();
			case SchemaPackage.TYPE_CRRENSEIGNEMENT_OBJECTIF__APOUR_CARACTERISTIQUES_CRINTERMEDIAIRE_ACQUISITION_ELEMENT_CRINTERMEDIAIRE_ACQUISITION:
				return aPourCaracteristiquesCRintermediaireAcquisitionElementCRintermediaireAcquisition != null && !aPourCaracteristiquesCRintermediaireAcquisitionElementCRintermediaireAcquisition.isEmpty();
			case SchemaPackage.TYPE_CRRENSEIGNEMENT_OBJECTIF__APOUR_CARACTERISTIQUES_CRFIN_MISSION_ACQUISITION_CRFIN_MISSION_ACQUISITION:
				return aPourCaracteristiquesCRfinMissionAcquisitionCRfinMissionAcquisition != null;
			case SchemaPackage.TYPE_CRRENSEIGNEMENT_OBJECTIF__APOUR_CARACTERISTIQUES_CREVALUATION_DEGATS_CREVALUATION_DEGATS:
				return aPourCaracteristiquesCRevaluationDegatsCRevaluationDegats != null;
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
		result.append(" (categorie: ");
		if (categorieESet) result.append(categorie); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeCRrenseignementObjectifImpl
