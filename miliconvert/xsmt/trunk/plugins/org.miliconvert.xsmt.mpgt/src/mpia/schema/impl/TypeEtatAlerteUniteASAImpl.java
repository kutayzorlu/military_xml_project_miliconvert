/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeEtatAlerteUniteASA;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Etat Alerte Unite ASA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEtatAlerteUniteASAImpl#getEtatAlertePourTir <em>Etat Alerte Pour Tir</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatAlerteUniteASAImpl#getEtatAlertePourMouvement <em>Etat Alerte Pour Mouvement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatAlerteUniteASAImpl#getHeureDebutApplication <em>Heure Debut Application</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatAlerteUniteASAImpl#getHeureFinApplication <em>Heure Fin Application</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatAlerteUniteASAImpl#getModalitesParticulieresAlerte <em>Modalites Particulieres Alerte</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatAlerteUniteASAImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatAlerteUniteASAImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatAlerteUniteASAImpl#getAAppliquerParSystemeArmeTypeArme <em>AAppliquer Par Systeme Arme Type Arme</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeEtatAlerteUniteASAImpl extends EObjectImpl implements TypeEtatAlerteUniteASA {
	/**
	 * The default value of the '{@link #getEtatAlertePourTir() <em>Etat Alerte Pour Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatAlertePourTir()
	 * @generated
	 * @ordered
	 */
	protected static final long ETAT_ALERTE_POUR_TIR_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getEtatAlertePourTir() <em>Etat Alerte Pour Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatAlertePourTir()
	 * @generated
	 * @ordered
	 */
	protected long etatAlertePourTir = ETAT_ALERTE_POUR_TIR_EDEFAULT;

	/**
	 * This is true if the Etat Alerte Pour Tir attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean etatAlertePourTirESet;

	/**
	 * The default value of the '{@link #getEtatAlertePourMouvement() <em>Etat Alerte Pour Mouvement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatAlertePourMouvement()
	 * @generated
	 * @ordered
	 */
	protected static final long ETAT_ALERTE_POUR_MOUVEMENT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getEtatAlertePourMouvement() <em>Etat Alerte Pour Mouvement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatAlertePourMouvement()
	 * @generated
	 * @ordered
	 */
	protected long etatAlertePourMouvement = ETAT_ALERTE_POUR_MOUVEMENT_EDEFAULT;

	/**
	 * This is true if the Etat Alerte Pour Mouvement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean etatAlertePourMouvementESet;

	/**
	 * The default value of the '{@link #getHeureDebutApplication() <em>Heure Debut Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeureDebutApplication()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar HEURE_DEBUT_APPLICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeureDebutApplication() <em>Heure Debut Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeureDebutApplication()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar heureDebutApplication = HEURE_DEBUT_APPLICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeureFinApplication() <em>Heure Fin Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeureFinApplication()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar HEURE_FIN_APPLICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeureFinApplication() <em>Heure Fin Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeureFinApplication()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar heureFinApplication = HEURE_FIN_APPLICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getModalitesParticulieresAlerte() <em>Modalites Particulieres Alerte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModalitesParticulieresAlerte()
	 * @generated
	 * @ordered
	 */
	protected static final String MODALITES_PARTICULIERES_ALERTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModalitesParticulieresAlerte() <em>Modalites Particulieres Alerte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModalitesParticulieresAlerte()
	 * @generated
	 * @ordered
	 */
	protected String modalitesParticulieresAlerte = MODALITES_PARTICULIERES_ALERTE_EDEFAULT;

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
	 * The cached value of the '{@link #getAAppliquerParSystemeArmeTypeArme() <em>AAppliquer Par Systeme Arme Type Arme</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAAppliquerParSystemeArmeTypeArme()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aAppliquerParSystemeArmeTypeArme;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeEtatAlerteUniteASAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEtatAlerteUniteASA();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getEtatAlertePourTir() {
		return etatAlertePourTir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtatAlertePourTir(long newEtatAlertePourTir) {
		long oldEtatAlertePourTir = etatAlertePourTir;
		etatAlertePourTir = newEtatAlertePourTir;
		boolean oldEtatAlertePourTirESet = etatAlertePourTirESet;
		etatAlertePourTirESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_ALERTE_UNITE_ASA__ETAT_ALERTE_POUR_TIR, oldEtatAlertePourTir, etatAlertePourTir, !oldEtatAlertePourTirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEtatAlertePourTir() {
		long oldEtatAlertePourTir = etatAlertePourTir;
		boolean oldEtatAlertePourTirESet = etatAlertePourTirESet;
		etatAlertePourTir = ETAT_ALERTE_POUR_TIR_EDEFAULT;
		etatAlertePourTirESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_ALERTE_UNITE_ASA__ETAT_ALERTE_POUR_TIR, oldEtatAlertePourTir, ETAT_ALERTE_POUR_TIR_EDEFAULT, oldEtatAlertePourTirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEtatAlertePourTir() {
		return etatAlertePourTirESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getEtatAlertePourMouvement() {
		return etatAlertePourMouvement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtatAlertePourMouvement(long newEtatAlertePourMouvement) {
		long oldEtatAlertePourMouvement = etatAlertePourMouvement;
		etatAlertePourMouvement = newEtatAlertePourMouvement;
		boolean oldEtatAlertePourMouvementESet = etatAlertePourMouvementESet;
		etatAlertePourMouvementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_ALERTE_UNITE_ASA__ETAT_ALERTE_POUR_MOUVEMENT, oldEtatAlertePourMouvement, etatAlertePourMouvement, !oldEtatAlertePourMouvementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEtatAlertePourMouvement() {
		long oldEtatAlertePourMouvement = etatAlertePourMouvement;
		boolean oldEtatAlertePourMouvementESet = etatAlertePourMouvementESet;
		etatAlertePourMouvement = ETAT_ALERTE_POUR_MOUVEMENT_EDEFAULT;
		etatAlertePourMouvementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_ALERTE_UNITE_ASA__ETAT_ALERTE_POUR_MOUVEMENT, oldEtatAlertePourMouvement, ETAT_ALERTE_POUR_MOUVEMENT_EDEFAULT, oldEtatAlertePourMouvementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEtatAlertePourMouvement() {
		return etatAlertePourMouvementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getHeureDebutApplication() {
		return heureDebutApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeureDebutApplication(XMLGregorianCalendar newHeureDebutApplication) {
		XMLGregorianCalendar oldHeureDebutApplication = heureDebutApplication;
		heureDebutApplication = newHeureDebutApplication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_ALERTE_UNITE_ASA__HEURE_DEBUT_APPLICATION, oldHeureDebutApplication, heureDebutApplication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getHeureFinApplication() {
		return heureFinApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeureFinApplication(XMLGregorianCalendar newHeureFinApplication) {
		XMLGregorianCalendar oldHeureFinApplication = heureFinApplication;
		heureFinApplication = newHeureFinApplication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_ALERTE_UNITE_ASA__HEURE_FIN_APPLICATION, oldHeureFinApplication, heureFinApplication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModalitesParticulieresAlerte() {
		return modalitesParticulieresAlerte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModalitesParticulieresAlerte(String newModalitesParticulieresAlerte) {
		String oldModalitesParticulieresAlerte = modalitesParticulieresAlerte;
		modalitesParticulieresAlerte = newModalitesParticulieresAlerte;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_ALERTE_UNITE_ASA__MODALITES_PARTICULIERES_ALERTE, oldModalitesParticulieresAlerte, modalitesParticulieresAlerte));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_ALERTE_UNITE_ASA__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_ALERTE_UNITE_ASA__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAAppliquerParSystemeArmeTypeArme() {
		return aAppliquerParSystemeArmeTypeArme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAAppliquerParSystemeArmeTypeArme(TypeAssociationEXT newAAppliquerParSystemeArmeTypeArme, NotificationChain msgs) {
		TypeAssociationEXT oldAAppliquerParSystemeArmeTypeArme = aAppliquerParSystemeArmeTypeArme;
		aAppliquerParSystemeArmeTypeArme = newAAppliquerParSystemeArmeTypeArme;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_ALERTE_UNITE_ASA__AAPPLIQUER_PAR_SYSTEME_ARME_TYPE_ARME, oldAAppliquerParSystemeArmeTypeArme, newAAppliquerParSystemeArmeTypeArme);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAAppliquerParSystemeArmeTypeArme(TypeAssociationEXT newAAppliquerParSystemeArmeTypeArme) {
		if (newAAppliquerParSystemeArmeTypeArme != aAppliquerParSystemeArmeTypeArme) {
			NotificationChain msgs = null;
			if (aAppliquerParSystemeArmeTypeArme != null)
				msgs = ((InternalEObject)aAppliquerParSystemeArmeTypeArme).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ETAT_ALERTE_UNITE_ASA__AAPPLIQUER_PAR_SYSTEME_ARME_TYPE_ARME, null, msgs);
			if (newAAppliquerParSystemeArmeTypeArme != null)
				msgs = ((InternalEObject)newAAppliquerParSystemeArmeTypeArme).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ETAT_ALERTE_UNITE_ASA__AAPPLIQUER_PAR_SYSTEME_ARME_TYPE_ARME, null, msgs);
			msgs = basicSetAAppliquerParSystemeArmeTypeArme(newAAppliquerParSystemeArmeTypeArme, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_ALERTE_UNITE_ASA__AAPPLIQUER_PAR_SYSTEME_ARME_TYPE_ARME, newAAppliquerParSystemeArmeTypeArme, newAAppliquerParSystemeArmeTypeArme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ETAT_ALERTE_UNITE_ASA__AAPPLIQUER_PAR_SYSTEME_ARME_TYPE_ARME:
				return basicSetAAppliquerParSystemeArmeTypeArme(null, msgs);
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
			case SchemaPackage.TYPE_ETAT_ALERTE_UNITE_ASA__ETAT_ALERTE_POUR_TIR:
				return new Long(getEtatAlertePourTir());
			case SchemaPackage.TYPE_ETAT_ALERTE_UNITE_ASA__ETAT_ALERTE_POUR_MOUVEMENT:
				return new Long(getEtatAlertePourMouvement());
			case SchemaPackage.TYPE_ETAT_ALERTE_UNITE_ASA__HEURE_DEBUT_APPLICATION:
				return getHeureDebutApplication();
			case SchemaPackage.TYPE_ETAT_ALERTE_UNITE_ASA__HEURE_FIN_APPLICATION:
				return getHeureFinApplication();
			case SchemaPackage.TYPE_ETAT_ALERTE_UNITE_ASA__MODALITES_PARTICULIERES_ALERTE:
				return getModalitesParticulieresAlerte();
			case SchemaPackage.TYPE_ETAT_ALERTE_UNITE_ASA__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ETAT_ALERTE_UNITE_ASA__CE:
				return getCE();
			case SchemaPackage.TYPE_ETAT_ALERTE_UNITE_ASA__AAPPLIQUER_PAR_SYSTEME_ARME_TYPE_ARME:
				return getAAppliquerParSystemeArmeTypeArme();
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
			case SchemaPackage.TYPE_ETAT_ALERTE_UNITE_ASA__ETAT_ALERTE_POUR_TIR:
				setEtatAlertePourTir(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_ETAT_ALERTE_UNITE_ASA__ETAT_ALERTE_POUR_MOUVEMENT:
				setEtatAlertePourMouvement(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_ETAT_ALERTE_UNITE_ASA__HEURE_DEBUT_APPLICATION:
				setHeureDebutApplication((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_ALERTE_UNITE_ASA__HEURE_FIN_APPLICATION:
				setHeureFinApplication((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_ALERTE_UNITE_ASA__MODALITES_PARTICULIERES_ALERTE:
				setModalitesParticulieresAlerte((String)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_ALERTE_UNITE_ASA__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_ALERTE_UNITE_ASA__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_ALERTE_UNITE_ASA__AAPPLIQUER_PAR_SYSTEME_ARME_TYPE_ARME:
				setAAppliquerParSystemeArmeTypeArme((TypeAssociationEXT)newValue);
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
			case SchemaPackage.TYPE_ETAT_ALERTE_UNITE_ASA__ETAT_ALERTE_POUR_TIR:
				unsetEtatAlertePourTir();
				return;
			case SchemaPackage.TYPE_ETAT_ALERTE_UNITE_ASA__ETAT_ALERTE_POUR_MOUVEMENT:
				unsetEtatAlertePourMouvement();
				return;
			case SchemaPackage.TYPE_ETAT_ALERTE_UNITE_ASA__HEURE_DEBUT_APPLICATION:
				setHeureDebutApplication(HEURE_DEBUT_APPLICATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ETAT_ALERTE_UNITE_ASA__HEURE_FIN_APPLICATION:
				setHeureFinApplication(HEURE_FIN_APPLICATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ETAT_ALERTE_UNITE_ASA__MODALITES_PARTICULIERES_ALERTE:
				setModalitesParticulieresAlerte(MODALITES_PARTICULIERES_ALERTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ETAT_ALERTE_UNITE_ASA__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ETAT_ALERTE_UNITE_ASA__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ETAT_ALERTE_UNITE_ASA__AAPPLIQUER_PAR_SYSTEME_ARME_TYPE_ARME:
				setAAppliquerParSystemeArmeTypeArme((TypeAssociationEXT)null);
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
			case SchemaPackage.TYPE_ETAT_ALERTE_UNITE_ASA__ETAT_ALERTE_POUR_TIR:
				return isSetEtatAlertePourTir();
			case SchemaPackage.TYPE_ETAT_ALERTE_UNITE_ASA__ETAT_ALERTE_POUR_MOUVEMENT:
				return isSetEtatAlertePourMouvement();
			case SchemaPackage.TYPE_ETAT_ALERTE_UNITE_ASA__HEURE_DEBUT_APPLICATION:
				return HEURE_DEBUT_APPLICATION_EDEFAULT == null ? heureDebutApplication != null : !HEURE_DEBUT_APPLICATION_EDEFAULT.equals(heureDebutApplication);
			case SchemaPackage.TYPE_ETAT_ALERTE_UNITE_ASA__HEURE_FIN_APPLICATION:
				return HEURE_FIN_APPLICATION_EDEFAULT == null ? heureFinApplication != null : !HEURE_FIN_APPLICATION_EDEFAULT.equals(heureFinApplication);
			case SchemaPackage.TYPE_ETAT_ALERTE_UNITE_ASA__MODALITES_PARTICULIERES_ALERTE:
				return MODALITES_PARTICULIERES_ALERTE_EDEFAULT == null ? modalitesParticulieresAlerte != null : !MODALITES_PARTICULIERES_ALERTE_EDEFAULT.equals(modalitesParticulieresAlerte);
			case SchemaPackage.TYPE_ETAT_ALERTE_UNITE_ASA__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ETAT_ALERTE_UNITE_ASA__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ETAT_ALERTE_UNITE_ASA__AAPPLIQUER_PAR_SYSTEME_ARME_TYPE_ARME:
				return aAppliquerParSystemeArmeTypeArme != null;
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
		result.append(" (etatAlertePourTir: ");
		if (etatAlertePourTirESet) result.append(etatAlertePourTir); else result.append("<unset>");
		result.append(", etatAlertePourMouvement: ");
		if (etatAlertePourMouvementESet) result.append(etatAlertePourMouvement); else result.append("<unset>");
		result.append(", heureDebutApplication: ");
		result.append(heureDebutApplication);
		result.append(", heureFinApplication: ");
		result.append(heureFinApplication);
		result.append(", modalitesParticulieresAlerte: ");
		result.append(modalitesParticulieresAlerte);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeEtatAlerteUniteASAImpl
