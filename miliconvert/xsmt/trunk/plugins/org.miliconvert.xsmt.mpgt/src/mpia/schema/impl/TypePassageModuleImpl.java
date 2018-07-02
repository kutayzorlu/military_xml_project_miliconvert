/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeLocalisation;
import mpia.schema.TypePassageModule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Passage Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypePassageModuleImpl#getHauteurVol <em>Hauteur Vol</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePassageModuleImpl#getHeureDePassage <em>Heure De Passage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePassageModuleImpl#getNomLieu <em>Nom Lieu</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePassageModuleImpl#getCapDuModule <em>Cap Du Module</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePassageModuleImpl#getVitesseModule <em>Vitesse Module</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePassageModuleImpl#getPositionLocalisation <em>Position Localisation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypePassageModuleImpl extends EObjectImpl implements TypePassageModule {
	/**
	 * The default value of the '{@link #getHauteurVol() <em>Hauteur Vol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHauteurVol()
	 * @generated
	 * @ordered
	 */
	protected static final long HAUTEUR_VOL_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getHauteurVol() <em>Hauteur Vol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHauteurVol()
	 * @generated
	 * @ordered
	 */
	protected long hauteurVol = HAUTEUR_VOL_EDEFAULT;

	/**
	 * This is true if the Hauteur Vol attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hauteurVolESet;

	/**
	 * The default value of the '{@link #getHeureDePassage() <em>Heure De Passage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeureDePassage()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar HEURE_DE_PASSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeureDePassage() <em>Heure De Passage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeureDePassage()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar heureDePassage = HEURE_DE_PASSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNomLieu() <em>Nom Lieu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomLieu()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_LIEU_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomLieu() <em>Nom Lieu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomLieu()
	 * @generated
	 * @ordered
	 */
	protected String nomLieu = NOM_LIEU_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapDuModule() <em>Cap Du Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapDuModule()
	 * @generated
	 * @ordered
	 */
	protected static final long CAP_DU_MODULE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getCapDuModule() <em>Cap Du Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapDuModule()
	 * @generated
	 * @ordered
	 */
	protected long capDuModule = CAP_DU_MODULE_EDEFAULT;

	/**
	 * This is true if the Cap Du Module attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean capDuModuleESet;

	/**
	 * The default value of the '{@link #getVitesseModule() <em>Vitesse Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesseModule()
	 * @generated
	 * @ordered
	 */
	protected static final double VITESSE_MODULE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVitesseModule() <em>Vitesse Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesseModule()
	 * @generated
	 * @ordered
	 */
	protected double vitesseModule = VITESSE_MODULE_EDEFAULT;

	/**
	 * This is true if the Vitesse Module attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean vitesseModuleESet;

	/**
	 * The cached value of the '{@link #getPositionLocalisation() <em>Position Localisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionLocalisation()
	 * @generated
	 * @ordered
	 */
	protected TypeLocalisation positionLocalisation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypePassageModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypePassageModule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getHauteurVol() {
		return hauteurVol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHauteurVol(long newHauteurVol) {
		long oldHauteurVol = hauteurVol;
		hauteurVol = newHauteurVol;
		boolean oldHauteurVolESet = hauteurVolESet;
		hauteurVolESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PASSAGE_MODULE__HAUTEUR_VOL, oldHauteurVol, hauteurVol, !oldHauteurVolESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHauteurVol() {
		long oldHauteurVol = hauteurVol;
		boolean oldHauteurVolESet = hauteurVolESet;
		hauteurVol = HAUTEUR_VOL_EDEFAULT;
		hauteurVolESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PASSAGE_MODULE__HAUTEUR_VOL, oldHauteurVol, HAUTEUR_VOL_EDEFAULT, oldHauteurVolESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHauteurVol() {
		return hauteurVolESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getHeureDePassage() {
		return heureDePassage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeureDePassage(XMLGregorianCalendar newHeureDePassage) {
		XMLGregorianCalendar oldHeureDePassage = heureDePassage;
		heureDePassage = newHeureDePassage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PASSAGE_MODULE__HEURE_DE_PASSAGE, oldHeureDePassage, heureDePassage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNomLieu() {
		return nomLieu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomLieu(String newNomLieu) {
		String oldNomLieu = nomLieu;
		nomLieu = newNomLieu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PASSAGE_MODULE__NOM_LIEU, oldNomLieu, nomLieu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getCapDuModule() {
		return capDuModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapDuModule(long newCapDuModule) {
		long oldCapDuModule = capDuModule;
		capDuModule = newCapDuModule;
		boolean oldCapDuModuleESet = capDuModuleESet;
		capDuModuleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PASSAGE_MODULE__CAP_DU_MODULE, oldCapDuModule, capDuModule, !oldCapDuModuleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCapDuModule() {
		long oldCapDuModule = capDuModule;
		boolean oldCapDuModuleESet = capDuModuleESet;
		capDuModule = CAP_DU_MODULE_EDEFAULT;
		capDuModuleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PASSAGE_MODULE__CAP_DU_MODULE, oldCapDuModule, CAP_DU_MODULE_EDEFAULT, oldCapDuModuleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCapDuModule() {
		return capDuModuleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVitesseModule() {
		return vitesseModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVitesseModule(double newVitesseModule) {
		double oldVitesseModule = vitesseModule;
		vitesseModule = newVitesseModule;
		boolean oldVitesseModuleESet = vitesseModuleESet;
		vitesseModuleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PASSAGE_MODULE__VITESSE_MODULE, oldVitesseModule, vitesseModule, !oldVitesseModuleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVitesseModule() {
		double oldVitesseModule = vitesseModule;
		boolean oldVitesseModuleESet = vitesseModuleESet;
		vitesseModule = VITESSE_MODULE_EDEFAULT;
		vitesseModuleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PASSAGE_MODULE__VITESSE_MODULE, oldVitesseModule, VITESSE_MODULE_EDEFAULT, oldVitesseModuleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVitesseModule() {
		return vitesseModuleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeLocalisation getPositionLocalisation() {
		return positionLocalisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPositionLocalisation(TypeLocalisation newPositionLocalisation, NotificationChain msgs) {
		TypeLocalisation oldPositionLocalisation = positionLocalisation;
		positionLocalisation = newPositionLocalisation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PASSAGE_MODULE__POSITION_LOCALISATION, oldPositionLocalisation, newPositionLocalisation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositionLocalisation(TypeLocalisation newPositionLocalisation) {
		if (newPositionLocalisation != positionLocalisation) {
			NotificationChain msgs = null;
			if (positionLocalisation != null)
				msgs = ((InternalEObject)positionLocalisation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PASSAGE_MODULE__POSITION_LOCALISATION, null, msgs);
			if (newPositionLocalisation != null)
				msgs = ((InternalEObject)newPositionLocalisation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PASSAGE_MODULE__POSITION_LOCALISATION, null, msgs);
			msgs = basicSetPositionLocalisation(newPositionLocalisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PASSAGE_MODULE__POSITION_LOCALISATION, newPositionLocalisation, newPositionLocalisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_PASSAGE_MODULE__POSITION_LOCALISATION:
				return basicSetPositionLocalisation(null, msgs);
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
			case SchemaPackage.TYPE_PASSAGE_MODULE__HAUTEUR_VOL:
				return new Long(getHauteurVol());
			case SchemaPackage.TYPE_PASSAGE_MODULE__HEURE_DE_PASSAGE:
				return getHeureDePassage();
			case SchemaPackage.TYPE_PASSAGE_MODULE__NOM_LIEU:
				return getNomLieu();
			case SchemaPackage.TYPE_PASSAGE_MODULE__CAP_DU_MODULE:
				return new Long(getCapDuModule());
			case SchemaPackage.TYPE_PASSAGE_MODULE__VITESSE_MODULE:
				return new Double(getVitesseModule());
			case SchemaPackage.TYPE_PASSAGE_MODULE__POSITION_LOCALISATION:
				return getPositionLocalisation();
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
			case SchemaPackage.TYPE_PASSAGE_MODULE__HAUTEUR_VOL:
				setHauteurVol(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_PASSAGE_MODULE__HEURE_DE_PASSAGE:
				setHeureDePassage((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_PASSAGE_MODULE__NOM_LIEU:
				setNomLieu((String)newValue);
				return;
			case SchemaPackage.TYPE_PASSAGE_MODULE__CAP_DU_MODULE:
				setCapDuModule(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_PASSAGE_MODULE__VITESSE_MODULE:
				setVitesseModule(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_PASSAGE_MODULE__POSITION_LOCALISATION:
				setPositionLocalisation((TypeLocalisation)newValue);
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
			case SchemaPackage.TYPE_PASSAGE_MODULE__HAUTEUR_VOL:
				unsetHauteurVol();
				return;
			case SchemaPackage.TYPE_PASSAGE_MODULE__HEURE_DE_PASSAGE:
				setHeureDePassage(HEURE_DE_PASSAGE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PASSAGE_MODULE__NOM_LIEU:
				setNomLieu(NOM_LIEU_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PASSAGE_MODULE__CAP_DU_MODULE:
				unsetCapDuModule();
				return;
			case SchemaPackage.TYPE_PASSAGE_MODULE__VITESSE_MODULE:
				unsetVitesseModule();
				return;
			case SchemaPackage.TYPE_PASSAGE_MODULE__POSITION_LOCALISATION:
				setPositionLocalisation((TypeLocalisation)null);
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
			case SchemaPackage.TYPE_PASSAGE_MODULE__HAUTEUR_VOL:
				return isSetHauteurVol();
			case SchemaPackage.TYPE_PASSAGE_MODULE__HEURE_DE_PASSAGE:
				return HEURE_DE_PASSAGE_EDEFAULT == null ? heureDePassage != null : !HEURE_DE_PASSAGE_EDEFAULT.equals(heureDePassage);
			case SchemaPackage.TYPE_PASSAGE_MODULE__NOM_LIEU:
				return NOM_LIEU_EDEFAULT == null ? nomLieu != null : !NOM_LIEU_EDEFAULT.equals(nomLieu);
			case SchemaPackage.TYPE_PASSAGE_MODULE__CAP_DU_MODULE:
				return isSetCapDuModule();
			case SchemaPackage.TYPE_PASSAGE_MODULE__VITESSE_MODULE:
				return isSetVitesseModule();
			case SchemaPackage.TYPE_PASSAGE_MODULE__POSITION_LOCALISATION:
				return positionLocalisation != null;
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
		result.append(" (hauteurVol: ");
		if (hauteurVolESet) result.append(hauteurVol); else result.append("<unset>");
		result.append(", heureDePassage: ");
		result.append(heureDePassage);
		result.append(", nomLieu: ");
		result.append(nomLieu);
		result.append(", capDuModule: ");
		if (capDuModuleESet) result.append(capDuModule); else result.append("<unset>");
		result.append(", vitesseModule: ");
		if (vitesseModuleESet) result.append(vitesseModule); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypePassageModuleImpl
