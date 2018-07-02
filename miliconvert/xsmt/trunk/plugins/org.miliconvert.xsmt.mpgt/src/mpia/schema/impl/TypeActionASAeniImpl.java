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
import mpia.schema.TypeActionASAeni;
import mpia.schema.TypeDesignationUniteOuEquipementENI;
import mpia.schema.TypeDictionaryDicoActionASAeniDefensePrevue;

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
 * An implementation of the model object '<em><b>Type Action AS Aeni</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeActionASAeniImpl#getDefensePrevue <em>Defense Prevue</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActionASAeniImpl#getAPourUniteDefendueUnite <em>APour Unite Defendue Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActionASAeniImpl#getAPourZonesDefenduesOuAccompagnementAutreElementControle <em>APour Zones Defendues Ou Accompagnement Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActionASAeniImpl#getACommeUniteOuMaterielEmployeDesignationUniteOuEquipementENI <em>AComme Unite Ou Materiel Employe Designation Unite Ou Equipement ENI</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActionASAeniImpl#getACommeItinerairesDefendusItineraire <em>AComme Itineraires Defendus Itineraire</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeActionASAeniImpl extends EObjectImpl implements TypeActionASAeni {
	/**
	 * The default value of the '{@link #getDefensePrevue() <em>Defense Prevue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefensePrevue()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoActionASAeniDefensePrevue DEFENSE_PREVUE_EDEFAULT = TypeDictionaryDicoActionASAeniDefensePrevue.PDEF;

	/**
	 * The cached value of the '{@link #getDefensePrevue() <em>Defense Prevue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefensePrevue()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoActionASAeniDefensePrevue defensePrevue = DEFENSE_PREVUE_EDEFAULT;

	/**
	 * This is true if the Defense Prevue attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean defensePrevueESet;

	/**
	 * The cached value of the '{@link #getAPourUniteDefendueUnite() <em>APour Unite Defendue Unite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourUniteDefendueUnite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourUniteDefendueUnite;

	/**
	 * The cached value of the '{@link #getAPourZonesDefenduesOuAccompagnementAutreElementControle() <em>APour Zones Defendues Ou Accompagnement Autre Element Controle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourZonesDefenduesOuAccompagnementAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourZonesDefenduesOuAccompagnementAutreElementControle;

	/**
	 * The cached value of the '{@link #getACommeUniteOuMaterielEmployeDesignationUniteOuEquipementENI() <em>AComme Unite Ou Materiel Employe Designation Unite Ou Equipement ENI</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeUniteOuMaterielEmployeDesignationUniteOuEquipementENI()
	 * @generated
	 * @ordered
	 */
	protected TypeDesignationUniteOuEquipementENI aCommeUniteOuMaterielEmployeDesignationUniteOuEquipementENI;

	/**
	 * The cached value of the '{@link #getACommeItinerairesDefendusItineraire() <em>AComme Itineraires Defendus Itineraire</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeItinerairesDefendusItineraire()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aCommeItinerairesDefendusItineraire;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeActionASAeniImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeActionASAeni();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoActionASAeniDefensePrevue getDefensePrevue() {
		return defensePrevue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefensePrevue(TypeDictionaryDicoActionASAeniDefensePrevue newDefensePrevue) {
		TypeDictionaryDicoActionASAeniDefensePrevue oldDefensePrevue = defensePrevue;
		defensePrevue = newDefensePrevue == null ? DEFENSE_PREVUE_EDEFAULT : newDefensePrevue;
		boolean oldDefensePrevueESet = defensePrevueESet;
		defensePrevueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTION_AS_AENI__DEFENSE_PREVUE, oldDefensePrevue, defensePrevue, !oldDefensePrevueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDefensePrevue() {
		TypeDictionaryDicoActionASAeniDefensePrevue oldDefensePrevue = defensePrevue;
		boolean oldDefensePrevueESet = defensePrevueESet;
		defensePrevue = DEFENSE_PREVUE_EDEFAULT;
		defensePrevueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ACTION_AS_AENI__DEFENSE_PREVUE, oldDefensePrevue, DEFENSE_PREVUE_EDEFAULT, oldDefensePrevueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDefensePrevue() {
		return defensePrevueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourUniteDefendueUnite() {
		if (aPourUniteDefendueUnite == null) {
			aPourUniteDefendueUnite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ACTION_AS_AENI__APOUR_UNITE_DEFENDUE_UNITE);
		}
		return aPourUniteDefendueUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourZonesDefenduesOuAccompagnementAutreElementControle() {
		if (aPourZonesDefenduesOuAccompagnementAutreElementControle == null) {
			aPourZonesDefenduesOuAccompagnementAutreElementControle = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ACTION_AS_AENI__APOUR_ZONES_DEFENDUES_OU_ACCOMPAGNEMENT_AUTRE_ELEMENT_CONTROLE);
		}
		return aPourZonesDefenduesOuAccompagnementAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDesignationUniteOuEquipementENI getACommeUniteOuMaterielEmployeDesignationUniteOuEquipementENI() {
		return aCommeUniteOuMaterielEmployeDesignationUniteOuEquipementENI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommeUniteOuMaterielEmployeDesignationUniteOuEquipementENI(TypeDesignationUniteOuEquipementENI newACommeUniteOuMaterielEmployeDesignationUniteOuEquipementENI, NotificationChain msgs) {
		TypeDesignationUniteOuEquipementENI oldACommeUniteOuMaterielEmployeDesignationUniteOuEquipementENI = aCommeUniteOuMaterielEmployeDesignationUniteOuEquipementENI;
		aCommeUniteOuMaterielEmployeDesignationUniteOuEquipementENI = newACommeUniteOuMaterielEmployeDesignationUniteOuEquipementENI;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTION_AS_AENI__ACOMME_UNITE_OU_MATERIEL_EMPLOYE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI, oldACommeUniteOuMaterielEmployeDesignationUniteOuEquipementENI, newACommeUniteOuMaterielEmployeDesignationUniteOuEquipementENI);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommeUniteOuMaterielEmployeDesignationUniteOuEquipementENI(TypeDesignationUniteOuEquipementENI newACommeUniteOuMaterielEmployeDesignationUniteOuEquipementENI) {
		if (newACommeUniteOuMaterielEmployeDesignationUniteOuEquipementENI != aCommeUniteOuMaterielEmployeDesignationUniteOuEquipementENI) {
			NotificationChain msgs = null;
			if (aCommeUniteOuMaterielEmployeDesignationUniteOuEquipementENI != null)
				msgs = ((InternalEObject)aCommeUniteOuMaterielEmployeDesignationUniteOuEquipementENI).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ACTION_AS_AENI__ACOMME_UNITE_OU_MATERIEL_EMPLOYE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI, null, msgs);
			if (newACommeUniteOuMaterielEmployeDesignationUniteOuEquipementENI != null)
				msgs = ((InternalEObject)newACommeUniteOuMaterielEmployeDesignationUniteOuEquipementENI).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ACTION_AS_AENI__ACOMME_UNITE_OU_MATERIEL_EMPLOYE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI, null, msgs);
			msgs = basicSetACommeUniteOuMaterielEmployeDesignationUniteOuEquipementENI(newACommeUniteOuMaterielEmployeDesignationUniteOuEquipementENI, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTION_AS_AENI__ACOMME_UNITE_OU_MATERIEL_EMPLOYE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI, newACommeUniteOuMaterielEmployeDesignationUniteOuEquipementENI, newACommeUniteOuMaterielEmployeDesignationUniteOuEquipementENI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getACommeItinerairesDefendusItineraire() {
		if (aCommeItinerairesDefendusItineraire == null) {
			aCommeItinerairesDefendusItineraire = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ACTION_AS_AENI__ACOMME_ITINERAIRES_DEFENDUS_ITINERAIRE);
		}
		return aCommeItinerairesDefendusItineraire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ACTION_AS_AENI__APOUR_UNITE_DEFENDUE_UNITE:
				return ((InternalEList<?>)getAPourUniteDefendueUnite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ACTION_AS_AENI__APOUR_ZONES_DEFENDUES_OU_ACCOMPAGNEMENT_AUTRE_ELEMENT_CONTROLE:
				return ((InternalEList<?>)getAPourZonesDefenduesOuAccompagnementAutreElementControle()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ACTION_AS_AENI__ACOMME_UNITE_OU_MATERIEL_EMPLOYE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI:
				return basicSetACommeUniteOuMaterielEmployeDesignationUniteOuEquipementENI(null, msgs);
			case SchemaPackage.TYPE_ACTION_AS_AENI__ACOMME_ITINERAIRES_DEFENDUS_ITINERAIRE:
				return ((InternalEList<?>)getACommeItinerairesDefendusItineraire()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_ACTION_AS_AENI__DEFENSE_PREVUE:
				return getDefensePrevue();
			case SchemaPackage.TYPE_ACTION_AS_AENI__APOUR_UNITE_DEFENDUE_UNITE:
				return getAPourUniteDefendueUnite();
			case SchemaPackage.TYPE_ACTION_AS_AENI__APOUR_ZONES_DEFENDUES_OU_ACCOMPAGNEMENT_AUTRE_ELEMENT_CONTROLE:
				return getAPourZonesDefenduesOuAccompagnementAutreElementControle();
			case SchemaPackage.TYPE_ACTION_AS_AENI__ACOMME_UNITE_OU_MATERIEL_EMPLOYE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI:
				return getACommeUniteOuMaterielEmployeDesignationUniteOuEquipementENI();
			case SchemaPackage.TYPE_ACTION_AS_AENI__ACOMME_ITINERAIRES_DEFENDUS_ITINERAIRE:
				return getACommeItinerairesDefendusItineraire();
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
			case SchemaPackage.TYPE_ACTION_AS_AENI__DEFENSE_PREVUE:
				setDefensePrevue((TypeDictionaryDicoActionASAeniDefensePrevue)newValue);
				return;
			case SchemaPackage.TYPE_ACTION_AS_AENI__APOUR_UNITE_DEFENDUE_UNITE:
				getAPourUniteDefendueUnite().clear();
				getAPourUniteDefendueUnite().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ACTION_AS_AENI__APOUR_ZONES_DEFENDUES_OU_ACCOMPAGNEMENT_AUTRE_ELEMENT_CONTROLE:
				getAPourZonesDefenduesOuAccompagnementAutreElementControle().clear();
				getAPourZonesDefenduesOuAccompagnementAutreElementControle().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ACTION_AS_AENI__ACOMME_UNITE_OU_MATERIEL_EMPLOYE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI:
				setACommeUniteOuMaterielEmployeDesignationUniteOuEquipementENI((TypeDesignationUniteOuEquipementENI)newValue);
				return;
			case SchemaPackage.TYPE_ACTION_AS_AENI__ACOMME_ITINERAIRES_DEFENDUS_ITINERAIRE:
				getACommeItinerairesDefendusItineraire().clear();
				getACommeItinerairesDefendusItineraire().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_ACTION_AS_AENI__DEFENSE_PREVUE:
				unsetDefensePrevue();
				return;
			case SchemaPackage.TYPE_ACTION_AS_AENI__APOUR_UNITE_DEFENDUE_UNITE:
				getAPourUniteDefendueUnite().clear();
				return;
			case SchemaPackage.TYPE_ACTION_AS_AENI__APOUR_ZONES_DEFENDUES_OU_ACCOMPAGNEMENT_AUTRE_ELEMENT_CONTROLE:
				getAPourZonesDefenduesOuAccompagnementAutreElementControle().clear();
				return;
			case SchemaPackage.TYPE_ACTION_AS_AENI__ACOMME_UNITE_OU_MATERIEL_EMPLOYE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI:
				setACommeUniteOuMaterielEmployeDesignationUniteOuEquipementENI((TypeDesignationUniteOuEquipementENI)null);
				return;
			case SchemaPackage.TYPE_ACTION_AS_AENI__ACOMME_ITINERAIRES_DEFENDUS_ITINERAIRE:
				getACommeItinerairesDefendusItineraire().clear();
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
			case SchemaPackage.TYPE_ACTION_AS_AENI__DEFENSE_PREVUE:
				return isSetDefensePrevue();
			case SchemaPackage.TYPE_ACTION_AS_AENI__APOUR_UNITE_DEFENDUE_UNITE:
				return aPourUniteDefendueUnite != null && !aPourUniteDefendueUnite.isEmpty();
			case SchemaPackage.TYPE_ACTION_AS_AENI__APOUR_ZONES_DEFENDUES_OU_ACCOMPAGNEMENT_AUTRE_ELEMENT_CONTROLE:
				return aPourZonesDefenduesOuAccompagnementAutreElementControle != null && !aPourZonesDefenduesOuAccompagnementAutreElementControle.isEmpty();
			case SchemaPackage.TYPE_ACTION_AS_AENI__ACOMME_UNITE_OU_MATERIEL_EMPLOYE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI:
				return aCommeUniteOuMaterielEmployeDesignationUniteOuEquipementENI != null;
			case SchemaPackage.TYPE_ACTION_AS_AENI__ACOMME_ITINERAIRES_DEFENDUS_ITINERAIRE:
				return aCommeItinerairesDefendusItineraire != null && !aCommeItinerairesDefendusItineraire.isEmpty();
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
		result.append(" (defensePrevue: ");
		if (defensePrevueESet) result.append(defensePrevue); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeActionASAeniImpl
