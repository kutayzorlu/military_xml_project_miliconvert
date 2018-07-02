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
import mpia.schema.TypeAutreElementControle;
import mpia.schema.TypeCaracteristiqueZoneContaminee;
import mpia.schema.TypeDesignationUniteOuEquipementENI;
import mpia.schema.TypeReconnaissance;
import mpia.schema.TypeReglementation;
import mpia.schema.TypeTypeObjectifMajeur;
import mpia.schema.TypeZoneAcquisition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Autre Element Controle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAutreElementControleImpl#getEstSousControleSurveillanceDesignationUniteOuEquipementENI <em>Est Sous Controle Surveillance Designation Unite Ou Equipement ENI</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAutreElementControleImpl#getAPourTypeObjectifMajeurTypeObjectifMajeur <em>APour Type Objectif Majeur Type Objectif Majeur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAutreElementControleImpl#getCaracteristiquesZoneContamineeCaracteristiqueZoneContaminee <em>Caracteristiques Zone Contaminee Caracteristique Zone Contaminee</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAutreElementControleImpl#getEstReconnueSelonReconnaissance <em>Est Reconnue Selon Reconnaissance</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAutreElementControleImpl#getAPourCaracteristiquesZoneAcquisitionZoneAcquisition <em>APour Caracteristiques Zone Acquisition Zone Acquisition</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAutreElementControleImpl#getVautPourHoraireManoeuvre <em>Vaut Pour Horaire Manoeuvre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAutreElementControleImpl#getEstSoumiseAReglementation <em>Est Soumise AReglementation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAutreElementControleImpl#getAPourEvenementNRBCAssocieeEvenementNRBC <em>APour Evenement NRBC Associee Evenement NRBC</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAutreElementControleImpl extends TypeElementControleImpl implements TypeAutreElementControle {
	/**
	 * The cached value of the '{@link #getEstSousControleSurveillanceDesignationUniteOuEquipementENI() <em>Est Sous Controle Surveillance Designation Unite Ou Equipement ENI</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSousControleSurveillanceDesignationUniteOuEquipementENI()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeDesignationUniteOuEquipementENI> estSousControleSurveillanceDesignationUniteOuEquipementENI;

	/**
	 * The cached value of the '{@link #getAPourTypeObjectifMajeurTypeObjectifMajeur() <em>APour Type Objectif Majeur Type Objectif Majeur</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourTypeObjectifMajeurTypeObjectifMajeur()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeTypeObjectifMajeur> aPourTypeObjectifMajeurTypeObjectifMajeur;

	/**
	 * The cached value of the '{@link #getCaracteristiquesZoneContamineeCaracteristiqueZoneContaminee() <em>Caracteristiques Zone Contaminee Caracteristique Zone Contaminee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaracteristiquesZoneContamineeCaracteristiqueZoneContaminee()
	 * @generated
	 * @ordered
	 */
	protected TypeCaracteristiqueZoneContaminee caracteristiquesZoneContamineeCaracteristiqueZoneContaminee;

	/**
	 * The cached value of the '{@link #getEstReconnueSelonReconnaissance() <em>Est Reconnue Selon Reconnaissance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstReconnueSelonReconnaissance()
	 * @generated
	 * @ordered
	 */
	protected TypeReconnaissance estReconnueSelonReconnaissance;

	/**
	 * The cached value of the '{@link #getAPourCaracteristiquesZoneAcquisitionZoneAcquisition() <em>APour Caracteristiques Zone Acquisition Zone Acquisition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourCaracteristiquesZoneAcquisitionZoneAcquisition()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeZoneAcquisition> aPourCaracteristiquesZoneAcquisitionZoneAcquisition;

	/**
	 * The cached value of the '{@link #getVautPourHoraireManoeuvre() <em>Vaut Pour Horaire Manoeuvre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVautPourHoraireManoeuvre()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation vautPourHoraireManoeuvre;

	/**
	 * The cached value of the '{@link #getEstSoumiseAReglementation() <em>Est Soumise AReglementation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSoumiseAReglementation()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeReglementation> estSoumiseAReglementation;

	/**
	 * The cached value of the '{@link #getAPourEvenementNRBCAssocieeEvenementNRBC() <em>APour Evenement NRBC Associee Evenement NRBC</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourEvenementNRBCAssocieeEvenementNRBC()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourEvenementNRBCAssocieeEvenementNRBC;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAutreElementControleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAutreElementControle();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeDesignationUniteOuEquipementENI> getEstSousControleSurveillanceDesignationUniteOuEquipementENI() {
		if (estSousControleSurveillanceDesignationUniteOuEquipementENI == null) {
			estSousControleSurveillanceDesignationUniteOuEquipementENI = new EObjectContainmentEList<TypeDesignationUniteOuEquipementENI>(TypeDesignationUniteOuEquipementENI.class, this, SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE__EST_SOUS_CONTROLE_SURVEILLANCE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI);
		}
		return estSousControleSurveillanceDesignationUniteOuEquipementENI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeTypeObjectifMajeur> getAPourTypeObjectifMajeurTypeObjectifMajeur() {
		if (aPourTypeObjectifMajeurTypeObjectifMajeur == null) {
			aPourTypeObjectifMajeurTypeObjectifMajeur = new EObjectContainmentEList<TypeTypeObjectifMajeur>(TypeTypeObjectifMajeur.class, this, SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE__APOUR_TYPE_OBJECTIF_MAJEUR_TYPE_OBJECTIF_MAJEUR);
		}
		return aPourTypeObjectifMajeurTypeObjectifMajeur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeCaracteristiqueZoneContaminee getCaracteristiquesZoneContamineeCaracteristiqueZoneContaminee() {
		return caracteristiquesZoneContamineeCaracteristiqueZoneContaminee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaracteristiquesZoneContamineeCaracteristiqueZoneContaminee(TypeCaracteristiqueZoneContaminee newCaracteristiquesZoneContamineeCaracteristiqueZoneContaminee, NotificationChain msgs) {
		TypeCaracteristiqueZoneContaminee oldCaracteristiquesZoneContamineeCaracteristiqueZoneContaminee = caracteristiquesZoneContamineeCaracteristiqueZoneContaminee;
		caracteristiquesZoneContamineeCaracteristiqueZoneContaminee = newCaracteristiquesZoneContamineeCaracteristiqueZoneContaminee;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE__CARACTERISTIQUES_ZONE_CONTAMINEE_CARACTERISTIQUE_ZONE_CONTAMINEE, oldCaracteristiquesZoneContamineeCaracteristiqueZoneContaminee, newCaracteristiquesZoneContamineeCaracteristiqueZoneContaminee);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaracteristiquesZoneContamineeCaracteristiqueZoneContaminee(TypeCaracteristiqueZoneContaminee newCaracteristiquesZoneContamineeCaracteristiqueZoneContaminee) {
		if (newCaracteristiquesZoneContamineeCaracteristiqueZoneContaminee != caracteristiquesZoneContamineeCaracteristiqueZoneContaminee) {
			NotificationChain msgs = null;
			if (caracteristiquesZoneContamineeCaracteristiqueZoneContaminee != null)
				msgs = ((InternalEObject)caracteristiquesZoneContamineeCaracteristiqueZoneContaminee).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE__CARACTERISTIQUES_ZONE_CONTAMINEE_CARACTERISTIQUE_ZONE_CONTAMINEE, null, msgs);
			if (newCaracteristiquesZoneContamineeCaracteristiqueZoneContaminee != null)
				msgs = ((InternalEObject)newCaracteristiquesZoneContamineeCaracteristiqueZoneContaminee).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE__CARACTERISTIQUES_ZONE_CONTAMINEE_CARACTERISTIQUE_ZONE_CONTAMINEE, null, msgs);
			msgs = basicSetCaracteristiquesZoneContamineeCaracteristiqueZoneContaminee(newCaracteristiquesZoneContamineeCaracteristiqueZoneContaminee, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE__CARACTERISTIQUES_ZONE_CONTAMINEE_CARACTERISTIQUE_ZONE_CONTAMINEE, newCaracteristiquesZoneContamineeCaracteristiqueZoneContaminee, newCaracteristiquesZoneContamineeCaracteristiqueZoneContaminee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReconnaissance getEstReconnueSelonReconnaissance() {
		return estReconnueSelonReconnaissance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstReconnueSelonReconnaissance(TypeReconnaissance newEstReconnueSelonReconnaissance, NotificationChain msgs) {
		TypeReconnaissance oldEstReconnueSelonReconnaissance = estReconnueSelonReconnaissance;
		estReconnueSelonReconnaissance = newEstReconnueSelonReconnaissance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE__EST_RECONNUE_SELON_RECONNAISSANCE, oldEstReconnueSelonReconnaissance, newEstReconnueSelonReconnaissance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstReconnueSelonReconnaissance(TypeReconnaissance newEstReconnueSelonReconnaissance) {
		if (newEstReconnueSelonReconnaissance != estReconnueSelonReconnaissance) {
			NotificationChain msgs = null;
			if (estReconnueSelonReconnaissance != null)
				msgs = ((InternalEObject)estReconnueSelonReconnaissance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE__EST_RECONNUE_SELON_RECONNAISSANCE, null, msgs);
			if (newEstReconnueSelonReconnaissance != null)
				msgs = ((InternalEObject)newEstReconnueSelonReconnaissance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE__EST_RECONNUE_SELON_RECONNAISSANCE, null, msgs);
			msgs = basicSetEstReconnueSelonReconnaissance(newEstReconnueSelonReconnaissance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE__EST_RECONNUE_SELON_RECONNAISSANCE, newEstReconnueSelonReconnaissance, newEstReconnueSelonReconnaissance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeZoneAcquisition> getAPourCaracteristiquesZoneAcquisitionZoneAcquisition() {
		if (aPourCaracteristiquesZoneAcquisitionZoneAcquisition == null) {
			aPourCaracteristiquesZoneAcquisitionZoneAcquisition = new EObjectContainmentEList<TypeZoneAcquisition>(TypeZoneAcquisition.class, this, SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE__APOUR_CARACTERISTIQUES_ZONE_ACQUISITION_ZONE_ACQUISITION);
		}
		return aPourCaracteristiquesZoneAcquisitionZoneAcquisition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getVautPourHoraireManoeuvre() {
		return vautPourHoraireManoeuvre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVautPourHoraireManoeuvre(TypeAssociation newVautPourHoraireManoeuvre, NotificationChain msgs) {
		TypeAssociation oldVautPourHoraireManoeuvre = vautPourHoraireManoeuvre;
		vautPourHoraireManoeuvre = newVautPourHoraireManoeuvre;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE__VAUT_POUR_HORAIRE_MANOEUVRE, oldVautPourHoraireManoeuvre, newVautPourHoraireManoeuvre);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVautPourHoraireManoeuvre(TypeAssociation newVautPourHoraireManoeuvre) {
		if (newVautPourHoraireManoeuvre != vautPourHoraireManoeuvre) {
			NotificationChain msgs = null;
			if (vautPourHoraireManoeuvre != null)
				msgs = ((InternalEObject)vautPourHoraireManoeuvre).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE__VAUT_POUR_HORAIRE_MANOEUVRE, null, msgs);
			if (newVautPourHoraireManoeuvre != null)
				msgs = ((InternalEObject)newVautPourHoraireManoeuvre).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE__VAUT_POUR_HORAIRE_MANOEUVRE, null, msgs);
			msgs = basicSetVautPourHoraireManoeuvre(newVautPourHoraireManoeuvre, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE__VAUT_POUR_HORAIRE_MANOEUVRE, newVautPourHoraireManoeuvre, newVautPourHoraireManoeuvre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeReglementation> getEstSoumiseAReglementation() {
		if (estSoumiseAReglementation == null) {
			estSoumiseAReglementation = new EObjectContainmentEList<TypeReglementation>(TypeReglementation.class, this, SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE__EST_SOUMISE_AREGLEMENTATION);
		}
		return estSoumiseAReglementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourEvenementNRBCAssocieeEvenementNRBC() {
		return aPourEvenementNRBCAssocieeEvenementNRBC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourEvenementNRBCAssocieeEvenementNRBC(TypeAssociation newAPourEvenementNRBCAssocieeEvenementNRBC, NotificationChain msgs) {
		TypeAssociation oldAPourEvenementNRBCAssocieeEvenementNRBC = aPourEvenementNRBCAssocieeEvenementNRBC;
		aPourEvenementNRBCAssocieeEvenementNRBC = newAPourEvenementNRBCAssocieeEvenementNRBC;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE__APOUR_EVENEMENT_NRBC_ASSOCIEE_EVENEMENT_NRBC, oldAPourEvenementNRBCAssocieeEvenementNRBC, newAPourEvenementNRBCAssocieeEvenementNRBC);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourEvenementNRBCAssocieeEvenementNRBC(TypeAssociation newAPourEvenementNRBCAssocieeEvenementNRBC) {
		if (newAPourEvenementNRBCAssocieeEvenementNRBC != aPourEvenementNRBCAssocieeEvenementNRBC) {
			NotificationChain msgs = null;
			if (aPourEvenementNRBCAssocieeEvenementNRBC != null)
				msgs = ((InternalEObject)aPourEvenementNRBCAssocieeEvenementNRBC).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE__APOUR_EVENEMENT_NRBC_ASSOCIEE_EVENEMENT_NRBC, null, msgs);
			if (newAPourEvenementNRBCAssocieeEvenementNRBC != null)
				msgs = ((InternalEObject)newAPourEvenementNRBCAssocieeEvenementNRBC).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE__APOUR_EVENEMENT_NRBC_ASSOCIEE_EVENEMENT_NRBC, null, msgs);
			msgs = basicSetAPourEvenementNRBCAssocieeEvenementNRBC(newAPourEvenementNRBCAssocieeEvenementNRBC, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE__APOUR_EVENEMENT_NRBC_ASSOCIEE_EVENEMENT_NRBC, newAPourEvenementNRBCAssocieeEvenementNRBC, newAPourEvenementNRBCAssocieeEvenementNRBC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE__EST_SOUS_CONTROLE_SURVEILLANCE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI:
				return ((InternalEList<?>)getEstSousControleSurveillanceDesignationUniteOuEquipementENI()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE__APOUR_TYPE_OBJECTIF_MAJEUR_TYPE_OBJECTIF_MAJEUR:
				return ((InternalEList<?>)getAPourTypeObjectifMajeurTypeObjectifMajeur()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE__CARACTERISTIQUES_ZONE_CONTAMINEE_CARACTERISTIQUE_ZONE_CONTAMINEE:
				return basicSetCaracteristiquesZoneContamineeCaracteristiqueZoneContaminee(null, msgs);
			case SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE__EST_RECONNUE_SELON_RECONNAISSANCE:
				return basicSetEstReconnueSelonReconnaissance(null, msgs);
			case SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE__APOUR_CARACTERISTIQUES_ZONE_ACQUISITION_ZONE_ACQUISITION:
				return ((InternalEList<?>)getAPourCaracteristiquesZoneAcquisitionZoneAcquisition()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE__VAUT_POUR_HORAIRE_MANOEUVRE:
				return basicSetVautPourHoraireManoeuvre(null, msgs);
			case SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE__EST_SOUMISE_AREGLEMENTATION:
				return ((InternalEList<?>)getEstSoumiseAReglementation()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE__APOUR_EVENEMENT_NRBC_ASSOCIEE_EVENEMENT_NRBC:
				return basicSetAPourEvenementNRBCAssocieeEvenementNRBC(null, msgs);
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
			case SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE__EST_SOUS_CONTROLE_SURVEILLANCE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI:
				return getEstSousControleSurveillanceDesignationUniteOuEquipementENI();
			case SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE__APOUR_TYPE_OBJECTIF_MAJEUR_TYPE_OBJECTIF_MAJEUR:
				return getAPourTypeObjectifMajeurTypeObjectifMajeur();
			case SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE__CARACTERISTIQUES_ZONE_CONTAMINEE_CARACTERISTIQUE_ZONE_CONTAMINEE:
				return getCaracteristiquesZoneContamineeCaracteristiqueZoneContaminee();
			case SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE__EST_RECONNUE_SELON_RECONNAISSANCE:
				return getEstReconnueSelonReconnaissance();
			case SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE__APOUR_CARACTERISTIQUES_ZONE_ACQUISITION_ZONE_ACQUISITION:
				return getAPourCaracteristiquesZoneAcquisitionZoneAcquisition();
			case SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE__VAUT_POUR_HORAIRE_MANOEUVRE:
				return getVautPourHoraireManoeuvre();
			case SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE__EST_SOUMISE_AREGLEMENTATION:
				return getEstSoumiseAReglementation();
			case SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE__APOUR_EVENEMENT_NRBC_ASSOCIEE_EVENEMENT_NRBC:
				return getAPourEvenementNRBCAssocieeEvenementNRBC();
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
			case SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE__EST_SOUS_CONTROLE_SURVEILLANCE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI:
				getEstSousControleSurveillanceDesignationUniteOuEquipementENI().clear();
				getEstSousControleSurveillanceDesignationUniteOuEquipementENI().addAll((Collection<? extends TypeDesignationUniteOuEquipementENI>)newValue);
				return;
			case SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE__APOUR_TYPE_OBJECTIF_MAJEUR_TYPE_OBJECTIF_MAJEUR:
				getAPourTypeObjectifMajeurTypeObjectifMajeur().clear();
				getAPourTypeObjectifMajeurTypeObjectifMajeur().addAll((Collection<? extends TypeTypeObjectifMajeur>)newValue);
				return;
			case SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE__CARACTERISTIQUES_ZONE_CONTAMINEE_CARACTERISTIQUE_ZONE_CONTAMINEE:
				setCaracteristiquesZoneContamineeCaracteristiqueZoneContaminee((TypeCaracteristiqueZoneContaminee)newValue);
				return;
			case SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE__EST_RECONNUE_SELON_RECONNAISSANCE:
				setEstReconnueSelonReconnaissance((TypeReconnaissance)newValue);
				return;
			case SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE__APOUR_CARACTERISTIQUES_ZONE_ACQUISITION_ZONE_ACQUISITION:
				getAPourCaracteristiquesZoneAcquisitionZoneAcquisition().clear();
				getAPourCaracteristiquesZoneAcquisitionZoneAcquisition().addAll((Collection<? extends TypeZoneAcquisition>)newValue);
				return;
			case SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE__VAUT_POUR_HORAIRE_MANOEUVRE:
				setVautPourHoraireManoeuvre((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE__EST_SOUMISE_AREGLEMENTATION:
				getEstSoumiseAReglementation().clear();
				getEstSoumiseAReglementation().addAll((Collection<? extends TypeReglementation>)newValue);
				return;
			case SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE__APOUR_EVENEMENT_NRBC_ASSOCIEE_EVENEMENT_NRBC:
				setAPourEvenementNRBCAssocieeEvenementNRBC((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE__EST_SOUS_CONTROLE_SURVEILLANCE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI:
				getEstSousControleSurveillanceDesignationUniteOuEquipementENI().clear();
				return;
			case SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE__APOUR_TYPE_OBJECTIF_MAJEUR_TYPE_OBJECTIF_MAJEUR:
				getAPourTypeObjectifMajeurTypeObjectifMajeur().clear();
				return;
			case SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE__CARACTERISTIQUES_ZONE_CONTAMINEE_CARACTERISTIQUE_ZONE_CONTAMINEE:
				setCaracteristiquesZoneContamineeCaracteristiqueZoneContaminee((TypeCaracteristiqueZoneContaminee)null);
				return;
			case SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE__EST_RECONNUE_SELON_RECONNAISSANCE:
				setEstReconnueSelonReconnaissance((TypeReconnaissance)null);
				return;
			case SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE__APOUR_CARACTERISTIQUES_ZONE_ACQUISITION_ZONE_ACQUISITION:
				getAPourCaracteristiquesZoneAcquisitionZoneAcquisition().clear();
				return;
			case SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE__VAUT_POUR_HORAIRE_MANOEUVRE:
				setVautPourHoraireManoeuvre((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE__EST_SOUMISE_AREGLEMENTATION:
				getEstSoumiseAReglementation().clear();
				return;
			case SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE__APOUR_EVENEMENT_NRBC_ASSOCIEE_EVENEMENT_NRBC:
				setAPourEvenementNRBCAssocieeEvenementNRBC((TypeAssociation)null);
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
			case SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE__EST_SOUS_CONTROLE_SURVEILLANCE_DESIGNATION_UNITE_OU_EQUIPEMENT_ENI:
				return estSousControleSurveillanceDesignationUniteOuEquipementENI != null && !estSousControleSurveillanceDesignationUniteOuEquipementENI.isEmpty();
			case SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE__APOUR_TYPE_OBJECTIF_MAJEUR_TYPE_OBJECTIF_MAJEUR:
				return aPourTypeObjectifMajeurTypeObjectifMajeur != null && !aPourTypeObjectifMajeurTypeObjectifMajeur.isEmpty();
			case SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE__CARACTERISTIQUES_ZONE_CONTAMINEE_CARACTERISTIQUE_ZONE_CONTAMINEE:
				return caracteristiquesZoneContamineeCaracteristiqueZoneContaminee != null;
			case SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE__EST_RECONNUE_SELON_RECONNAISSANCE:
				return estReconnueSelonReconnaissance != null;
			case SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE__APOUR_CARACTERISTIQUES_ZONE_ACQUISITION_ZONE_ACQUISITION:
				return aPourCaracteristiquesZoneAcquisitionZoneAcquisition != null && !aPourCaracteristiquesZoneAcquisitionZoneAcquisition.isEmpty();
			case SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE__VAUT_POUR_HORAIRE_MANOEUVRE:
				return vautPourHoraireManoeuvre != null;
			case SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE__EST_SOUMISE_AREGLEMENTATION:
				return estSoumiseAReglementation != null && !estSoumiseAReglementation.isEmpty();
			case SchemaPackage.TYPE_AUTRE_ELEMENT_CONTROLE__APOUR_EVENEMENT_NRBC_ASSOCIEE_EVENEMENT_NRBC:
				return aPourEvenementNRBCAssocieeEvenementNRBC != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeAutreElementControleImpl
