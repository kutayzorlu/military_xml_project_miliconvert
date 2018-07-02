/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociationEXT;
import mpia.meta.TypeDataTypeDateHeure;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDetachementNonIdentifie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Detachement Non Identifie</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeDetachementNonIdentifieImpl#getTypeDetach <em>Type Detach</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDetachementNonIdentifieImpl#getDateDebut <em>Date Debut</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDetachementNonIdentifieImpl#getDateFin <em>Date Fin</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDetachementNonIdentifieImpl#getMoyensPersonnel <em>Moyens Personnel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDetachementNonIdentifieImpl#getMoyensEnMateriel <em>Moyens En Materiel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDetachementNonIdentifieImpl#getModaliteMission <em>Modalite Mission</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDetachementNonIdentifieImpl#getACommeUniteFournisseurUnite <em>AComme Unite Fournisseur Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDetachementNonIdentifieImpl#getACommeUniteBeneficiaireUnite <em>AComme Unite Beneficiaire Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeDetachementNonIdentifieImpl extends TypePrelevementDetachementImpl implements TypeDetachementNonIdentifie {
	/**
	 * The default value of the '{@link #getTypeDetach() <em>Type Detach</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDetach()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_DETACH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeDetach() <em>Type Detach</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDetach()
	 * @generated
	 * @ordered
	 */
	protected String typeDetach = TYPE_DETACH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDateDebut() <em>Date Debut</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDebut()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDateHeure dateDebut;

	/**
	 * The cached value of the '{@link #getDateFin() <em>Date Fin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFin()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDateHeure dateFin;

	/**
	 * The default value of the '{@link #getMoyensPersonnel() <em>Moyens Personnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyensPersonnel()
	 * @generated
	 * @ordered
	 */
	protected static final String MOYENS_PERSONNEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMoyensPersonnel() <em>Moyens Personnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyensPersonnel()
	 * @generated
	 * @ordered
	 */
	protected String moyensPersonnel = MOYENS_PERSONNEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMoyensEnMateriel() <em>Moyens En Materiel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyensEnMateriel()
	 * @generated
	 * @ordered
	 */
	protected static final String MOYENS_EN_MATERIEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMoyensEnMateriel() <em>Moyens En Materiel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyensEnMateriel()
	 * @generated
	 * @ordered
	 */
	protected String moyensEnMateriel = MOYENS_EN_MATERIEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getModaliteMission() <em>Modalite Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModaliteMission()
	 * @generated
	 * @ordered
	 */
	protected static final String MODALITE_MISSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModaliteMission() <em>Modalite Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModaliteMission()
	 * @generated
	 * @ordered
	 */
	protected String modaliteMission = MODALITE_MISSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getACommeUniteFournisseurUnite() <em>AComme Unite Fournisseur Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeUniteFournisseurUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aCommeUniteFournisseurUnite;

	/**
	 * The cached value of the '{@link #getACommeUniteBeneficiaireUnite() <em>AComme Unite Beneficiaire Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeUniteBeneficiaireUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aCommeUniteBeneficiaireUnite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeDetachementNonIdentifieImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeDetachementNonIdentifie();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeDetach() {
		return typeDetach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeDetach(String newTypeDetach) {
		String oldTypeDetach = typeDetach;
		typeDetach = newTypeDetach;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DETACHEMENT_NON_IDENTIFIE__TYPE_DETACH, oldTypeDetach, typeDetach));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDateHeure getDateDebut() {
		return dateDebut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateDebut(TypeDataTypeDateHeure newDateDebut, NotificationChain msgs) {
		TypeDataTypeDateHeure oldDateDebut = dateDebut;
		dateDebut = newDateDebut;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DETACHEMENT_NON_IDENTIFIE__DATE_DEBUT, oldDateDebut, newDateDebut);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateDebut(TypeDataTypeDateHeure newDateDebut) {
		if (newDateDebut != dateDebut) {
			NotificationChain msgs = null;
			if (dateDebut != null)
				msgs = ((InternalEObject)dateDebut).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DETACHEMENT_NON_IDENTIFIE__DATE_DEBUT, null, msgs);
			if (newDateDebut != null)
				msgs = ((InternalEObject)newDateDebut).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DETACHEMENT_NON_IDENTIFIE__DATE_DEBUT, null, msgs);
			msgs = basicSetDateDebut(newDateDebut, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DETACHEMENT_NON_IDENTIFIE__DATE_DEBUT, newDateDebut, newDateDebut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDateHeure getDateFin() {
		return dateFin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateFin(TypeDataTypeDateHeure newDateFin, NotificationChain msgs) {
		TypeDataTypeDateHeure oldDateFin = dateFin;
		dateFin = newDateFin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DETACHEMENT_NON_IDENTIFIE__DATE_FIN, oldDateFin, newDateFin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateFin(TypeDataTypeDateHeure newDateFin) {
		if (newDateFin != dateFin) {
			NotificationChain msgs = null;
			if (dateFin != null)
				msgs = ((InternalEObject)dateFin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DETACHEMENT_NON_IDENTIFIE__DATE_FIN, null, msgs);
			if (newDateFin != null)
				msgs = ((InternalEObject)newDateFin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DETACHEMENT_NON_IDENTIFIE__DATE_FIN, null, msgs);
			msgs = basicSetDateFin(newDateFin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DETACHEMENT_NON_IDENTIFIE__DATE_FIN, newDateFin, newDateFin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMoyensPersonnel() {
		return moyensPersonnel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoyensPersonnel(String newMoyensPersonnel) {
		String oldMoyensPersonnel = moyensPersonnel;
		moyensPersonnel = newMoyensPersonnel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DETACHEMENT_NON_IDENTIFIE__MOYENS_PERSONNEL, oldMoyensPersonnel, moyensPersonnel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMoyensEnMateriel() {
		return moyensEnMateriel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoyensEnMateriel(String newMoyensEnMateriel) {
		String oldMoyensEnMateriel = moyensEnMateriel;
		moyensEnMateriel = newMoyensEnMateriel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DETACHEMENT_NON_IDENTIFIE__MOYENS_EN_MATERIEL, oldMoyensEnMateriel, moyensEnMateriel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModaliteMission() {
		return modaliteMission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModaliteMission(String newModaliteMission) {
		String oldModaliteMission = modaliteMission;
		modaliteMission = newModaliteMission;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DETACHEMENT_NON_IDENTIFIE__MODALITE_MISSION, oldModaliteMission, modaliteMission));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getACommeUniteFournisseurUnite() {
		return aCommeUniteFournisseurUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommeUniteFournisseurUnite(TypeAssociationEXT newACommeUniteFournisseurUnite, NotificationChain msgs) {
		TypeAssociationEXT oldACommeUniteFournisseurUnite = aCommeUniteFournisseurUnite;
		aCommeUniteFournisseurUnite = newACommeUniteFournisseurUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DETACHEMENT_NON_IDENTIFIE__ACOMME_UNITE_FOURNISSEUR_UNITE, oldACommeUniteFournisseurUnite, newACommeUniteFournisseurUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommeUniteFournisseurUnite(TypeAssociationEXT newACommeUniteFournisseurUnite) {
		if (newACommeUniteFournisseurUnite != aCommeUniteFournisseurUnite) {
			NotificationChain msgs = null;
			if (aCommeUniteFournisseurUnite != null)
				msgs = ((InternalEObject)aCommeUniteFournisseurUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DETACHEMENT_NON_IDENTIFIE__ACOMME_UNITE_FOURNISSEUR_UNITE, null, msgs);
			if (newACommeUniteFournisseurUnite != null)
				msgs = ((InternalEObject)newACommeUniteFournisseurUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DETACHEMENT_NON_IDENTIFIE__ACOMME_UNITE_FOURNISSEUR_UNITE, null, msgs);
			msgs = basicSetACommeUniteFournisseurUnite(newACommeUniteFournisseurUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DETACHEMENT_NON_IDENTIFIE__ACOMME_UNITE_FOURNISSEUR_UNITE, newACommeUniteFournisseurUnite, newACommeUniteFournisseurUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getACommeUniteBeneficiaireUnite() {
		return aCommeUniteBeneficiaireUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommeUniteBeneficiaireUnite(TypeAssociationEXT newACommeUniteBeneficiaireUnite, NotificationChain msgs) {
		TypeAssociationEXT oldACommeUniteBeneficiaireUnite = aCommeUniteBeneficiaireUnite;
		aCommeUniteBeneficiaireUnite = newACommeUniteBeneficiaireUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DETACHEMENT_NON_IDENTIFIE__ACOMME_UNITE_BENEFICIAIRE_UNITE, oldACommeUniteBeneficiaireUnite, newACommeUniteBeneficiaireUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommeUniteBeneficiaireUnite(TypeAssociationEXT newACommeUniteBeneficiaireUnite) {
		if (newACommeUniteBeneficiaireUnite != aCommeUniteBeneficiaireUnite) {
			NotificationChain msgs = null;
			if (aCommeUniteBeneficiaireUnite != null)
				msgs = ((InternalEObject)aCommeUniteBeneficiaireUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DETACHEMENT_NON_IDENTIFIE__ACOMME_UNITE_BENEFICIAIRE_UNITE, null, msgs);
			if (newACommeUniteBeneficiaireUnite != null)
				msgs = ((InternalEObject)newACommeUniteBeneficiaireUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DETACHEMENT_NON_IDENTIFIE__ACOMME_UNITE_BENEFICIAIRE_UNITE, null, msgs);
			msgs = basicSetACommeUniteBeneficiaireUnite(newACommeUniteBeneficiaireUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DETACHEMENT_NON_IDENTIFIE__ACOMME_UNITE_BENEFICIAIRE_UNITE, newACommeUniteBeneficiaireUnite, newACommeUniteBeneficiaireUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_DETACHEMENT_NON_IDENTIFIE__DATE_DEBUT:
				return basicSetDateDebut(null, msgs);
			case SchemaPackage.TYPE_DETACHEMENT_NON_IDENTIFIE__DATE_FIN:
				return basicSetDateFin(null, msgs);
			case SchemaPackage.TYPE_DETACHEMENT_NON_IDENTIFIE__ACOMME_UNITE_FOURNISSEUR_UNITE:
				return basicSetACommeUniteFournisseurUnite(null, msgs);
			case SchemaPackage.TYPE_DETACHEMENT_NON_IDENTIFIE__ACOMME_UNITE_BENEFICIAIRE_UNITE:
				return basicSetACommeUniteBeneficiaireUnite(null, msgs);
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
			case SchemaPackage.TYPE_DETACHEMENT_NON_IDENTIFIE__TYPE_DETACH:
				return getTypeDetach();
			case SchemaPackage.TYPE_DETACHEMENT_NON_IDENTIFIE__DATE_DEBUT:
				return getDateDebut();
			case SchemaPackage.TYPE_DETACHEMENT_NON_IDENTIFIE__DATE_FIN:
				return getDateFin();
			case SchemaPackage.TYPE_DETACHEMENT_NON_IDENTIFIE__MOYENS_PERSONNEL:
				return getMoyensPersonnel();
			case SchemaPackage.TYPE_DETACHEMENT_NON_IDENTIFIE__MOYENS_EN_MATERIEL:
				return getMoyensEnMateriel();
			case SchemaPackage.TYPE_DETACHEMENT_NON_IDENTIFIE__MODALITE_MISSION:
				return getModaliteMission();
			case SchemaPackage.TYPE_DETACHEMENT_NON_IDENTIFIE__ACOMME_UNITE_FOURNISSEUR_UNITE:
				return getACommeUniteFournisseurUnite();
			case SchemaPackage.TYPE_DETACHEMENT_NON_IDENTIFIE__ACOMME_UNITE_BENEFICIAIRE_UNITE:
				return getACommeUniteBeneficiaireUnite();
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
			case SchemaPackage.TYPE_DETACHEMENT_NON_IDENTIFIE__TYPE_DETACH:
				setTypeDetach((String)newValue);
				return;
			case SchemaPackage.TYPE_DETACHEMENT_NON_IDENTIFIE__DATE_DEBUT:
				setDateDebut((TypeDataTypeDateHeure)newValue);
				return;
			case SchemaPackage.TYPE_DETACHEMENT_NON_IDENTIFIE__DATE_FIN:
				setDateFin((TypeDataTypeDateHeure)newValue);
				return;
			case SchemaPackage.TYPE_DETACHEMENT_NON_IDENTIFIE__MOYENS_PERSONNEL:
				setMoyensPersonnel((String)newValue);
				return;
			case SchemaPackage.TYPE_DETACHEMENT_NON_IDENTIFIE__MOYENS_EN_MATERIEL:
				setMoyensEnMateriel((String)newValue);
				return;
			case SchemaPackage.TYPE_DETACHEMENT_NON_IDENTIFIE__MODALITE_MISSION:
				setModaliteMission((String)newValue);
				return;
			case SchemaPackage.TYPE_DETACHEMENT_NON_IDENTIFIE__ACOMME_UNITE_FOURNISSEUR_UNITE:
				setACommeUniteFournisseurUnite((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_DETACHEMENT_NON_IDENTIFIE__ACOMME_UNITE_BENEFICIAIRE_UNITE:
				setACommeUniteBeneficiaireUnite((TypeAssociationEXT)newValue);
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
			case SchemaPackage.TYPE_DETACHEMENT_NON_IDENTIFIE__TYPE_DETACH:
				setTypeDetach(TYPE_DETACH_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DETACHEMENT_NON_IDENTIFIE__DATE_DEBUT:
				setDateDebut((TypeDataTypeDateHeure)null);
				return;
			case SchemaPackage.TYPE_DETACHEMENT_NON_IDENTIFIE__DATE_FIN:
				setDateFin((TypeDataTypeDateHeure)null);
				return;
			case SchemaPackage.TYPE_DETACHEMENT_NON_IDENTIFIE__MOYENS_PERSONNEL:
				setMoyensPersonnel(MOYENS_PERSONNEL_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DETACHEMENT_NON_IDENTIFIE__MOYENS_EN_MATERIEL:
				setMoyensEnMateriel(MOYENS_EN_MATERIEL_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DETACHEMENT_NON_IDENTIFIE__MODALITE_MISSION:
				setModaliteMission(MODALITE_MISSION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DETACHEMENT_NON_IDENTIFIE__ACOMME_UNITE_FOURNISSEUR_UNITE:
				setACommeUniteFournisseurUnite((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_DETACHEMENT_NON_IDENTIFIE__ACOMME_UNITE_BENEFICIAIRE_UNITE:
				setACommeUniteBeneficiaireUnite((TypeAssociationEXT)null);
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
			case SchemaPackage.TYPE_DETACHEMENT_NON_IDENTIFIE__TYPE_DETACH:
				return TYPE_DETACH_EDEFAULT == null ? typeDetach != null : !TYPE_DETACH_EDEFAULT.equals(typeDetach);
			case SchemaPackage.TYPE_DETACHEMENT_NON_IDENTIFIE__DATE_DEBUT:
				return dateDebut != null;
			case SchemaPackage.TYPE_DETACHEMENT_NON_IDENTIFIE__DATE_FIN:
				return dateFin != null;
			case SchemaPackage.TYPE_DETACHEMENT_NON_IDENTIFIE__MOYENS_PERSONNEL:
				return MOYENS_PERSONNEL_EDEFAULT == null ? moyensPersonnel != null : !MOYENS_PERSONNEL_EDEFAULT.equals(moyensPersonnel);
			case SchemaPackage.TYPE_DETACHEMENT_NON_IDENTIFIE__MOYENS_EN_MATERIEL:
				return MOYENS_EN_MATERIEL_EDEFAULT == null ? moyensEnMateriel != null : !MOYENS_EN_MATERIEL_EDEFAULT.equals(moyensEnMateriel);
			case SchemaPackage.TYPE_DETACHEMENT_NON_IDENTIFIE__MODALITE_MISSION:
				return MODALITE_MISSION_EDEFAULT == null ? modaliteMission != null : !MODALITE_MISSION_EDEFAULT.equals(modaliteMission);
			case SchemaPackage.TYPE_DETACHEMENT_NON_IDENTIFIE__ACOMME_UNITE_FOURNISSEUR_UNITE:
				return aCommeUniteFournisseurUnite != null;
			case SchemaPackage.TYPE_DETACHEMENT_NON_IDENTIFIE__ACOMME_UNITE_BENEFICIAIRE_UNITE:
				return aCommeUniteBeneficiaireUnite != null;
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
		result.append(" (typeDetach: ");
		result.append(typeDetach);
		result.append(", moyensPersonnel: ");
		result.append(moyensPersonnel);
		result.append(", moyensEnMateriel: ");
		result.append(moyensEnMateriel);
		result.append(", modaliteMission: ");
		result.append(modaliteMission);
		result.append(')');
		return result.toString();
	}

} //TypeDetachementNonIdentifieImpl
