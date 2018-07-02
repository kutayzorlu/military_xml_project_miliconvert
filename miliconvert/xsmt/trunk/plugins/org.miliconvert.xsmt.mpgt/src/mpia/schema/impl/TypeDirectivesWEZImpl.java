/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDirectivesWEZ;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Directives WEZ</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeDirectivesWEZImpl#getEtatAlertePourTir <em>Etat Alerte Pour Tir</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDirectivesWEZImpl#getEtatAlertePourMouvement <em>Etat Alerte Pour Mouvement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDirectivesWEZImpl#getNiveauEMCON <em>Niveau EMCON</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDirectivesWEZImpl#getModalitesParticulieresEtatAlerte <em>Modalites Particulieres Etat Alerte</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDirectivesWEZImpl#getModalitesParticulieresEMCON <em>Modalites Particulieres EMCON</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeDirectivesWEZImpl extends EObjectImpl implements TypeDirectivesWEZ {
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
	 * The default value of the '{@link #getNiveauEMCON() <em>Niveau EMCON</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauEMCON()
	 * @generated
	 * @ordered
	 */
	protected static final long NIVEAU_EMCON_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNiveauEMCON() <em>Niveau EMCON</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauEMCON()
	 * @generated
	 * @ordered
	 */
	protected long niveauEMCON = NIVEAU_EMCON_EDEFAULT;

	/**
	 * This is true if the Niveau EMCON attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean niveauEMCONESet;

	/**
	 * The default value of the '{@link #getModalitesParticulieresEtatAlerte() <em>Modalites Particulieres Etat Alerte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModalitesParticulieresEtatAlerte()
	 * @generated
	 * @ordered
	 */
	protected static final String MODALITES_PARTICULIERES_ETAT_ALERTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModalitesParticulieresEtatAlerte() <em>Modalites Particulieres Etat Alerte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModalitesParticulieresEtatAlerte()
	 * @generated
	 * @ordered
	 */
	protected String modalitesParticulieresEtatAlerte = MODALITES_PARTICULIERES_ETAT_ALERTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getModalitesParticulieresEMCON() <em>Modalites Particulieres EMCON</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModalitesParticulieresEMCON()
	 * @generated
	 * @ordered
	 */
	protected static final String MODALITES_PARTICULIERES_EMCON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModalitesParticulieresEMCON() <em>Modalites Particulieres EMCON</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModalitesParticulieresEMCON()
	 * @generated
	 * @ordered
	 */
	protected String modalitesParticulieresEMCON = MODALITES_PARTICULIERES_EMCON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeDirectivesWEZImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeDirectivesWEZ();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DIRECTIVES_WEZ__ETAT_ALERTE_POUR_TIR, oldEtatAlertePourTir, etatAlertePourTir, !oldEtatAlertePourTirESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_DIRECTIVES_WEZ__ETAT_ALERTE_POUR_TIR, oldEtatAlertePourTir, ETAT_ALERTE_POUR_TIR_EDEFAULT, oldEtatAlertePourTirESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DIRECTIVES_WEZ__ETAT_ALERTE_POUR_MOUVEMENT, oldEtatAlertePourMouvement, etatAlertePourMouvement, !oldEtatAlertePourMouvementESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_DIRECTIVES_WEZ__ETAT_ALERTE_POUR_MOUVEMENT, oldEtatAlertePourMouvement, ETAT_ALERTE_POUR_MOUVEMENT_EDEFAULT, oldEtatAlertePourMouvementESet));
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
	public long getNiveauEMCON() {
		return niveauEMCON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNiveauEMCON(long newNiveauEMCON) {
		long oldNiveauEMCON = niveauEMCON;
		niveauEMCON = newNiveauEMCON;
		boolean oldNiveauEMCONESet = niveauEMCONESet;
		niveauEMCONESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DIRECTIVES_WEZ__NIVEAU_EMCON, oldNiveauEMCON, niveauEMCON, !oldNiveauEMCONESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNiveauEMCON() {
		long oldNiveauEMCON = niveauEMCON;
		boolean oldNiveauEMCONESet = niveauEMCONESet;
		niveauEMCON = NIVEAU_EMCON_EDEFAULT;
		niveauEMCONESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_DIRECTIVES_WEZ__NIVEAU_EMCON, oldNiveauEMCON, NIVEAU_EMCON_EDEFAULT, oldNiveauEMCONESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNiveauEMCON() {
		return niveauEMCONESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModalitesParticulieresEtatAlerte() {
		return modalitesParticulieresEtatAlerte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModalitesParticulieresEtatAlerte(String newModalitesParticulieresEtatAlerte) {
		String oldModalitesParticulieresEtatAlerte = modalitesParticulieresEtatAlerte;
		modalitesParticulieresEtatAlerte = newModalitesParticulieresEtatAlerte;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DIRECTIVES_WEZ__MODALITES_PARTICULIERES_ETAT_ALERTE, oldModalitesParticulieresEtatAlerte, modalitesParticulieresEtatAlerte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModalitesParticulieresEMCON() {
		return modalitesParticulieresEMCON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModalitesParticulieresEMCON(String newModalitesParticulieresEMCON) {
		String oldModalitesParticulieresEMCON = modalitesParticulieresEMCON;
		modalitesParticulieresEMCON = newModalitesParticulieresEMCON;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DIRECTIVES_WEZ__MODALITES_PARTICULIERES_EMCON, oldModalitesParticulieresEMCON, modalitesParticulieresEMCON));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_DIRECTIVES_WEZ__ETAT_ALERTE_POUR_TIR:
				return new Long(getEtatAlertePourTir());
			case SchemaPackage.TYPE_DIRECTIVES_WEZ__ETAT_ALERTE_POUR_MOUVEMENT:
				return new Long(getEtatAlertePourMouvement());
			case SchemaPackage.TYPE_DIRECTIVES_WEZ__NIVEAU_EMCON:
				return new Long(getNiveauEMCON());
			case SchemaPackage.TYPE_DIRECTIVES_WEZ__MODALITES_PARTICULIERES_ETAT_ALERTE:
				return getModalitesParticulieresEtatAlerte();
			case SchemaPackage.TYPE_DIRECTIVES_WEZ__MODALITES_PARTICULIERES_EMCON:
				return getModalitesParticulieresEMCON();
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
			case SchemaPackage.TYPE_DIRECTIVES_WEZ__ETAT_ALERTE_POUR_TIR:
				setEtatAlertePourTir(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_DIRECTIVES_WEZ__ETAT_ALERTE_POUR_MOUVEMENT:
				setEtatAlertePourMouvement(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_DIRECTIVES_WEZ__NIVEAU_EMCON:
				setNiveauEMCON(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_DIRECTIVES_WEZ__MODALITES_PARTICULIERES_ETAT_ALERTE:
				setModalitesParticulieresEtatAlerte((String)newValue);
				return;
			case SchemaPackage.TYPE_DIRECTIVES_WEZ__MODALITES_PARTICULIERES_EMCON:
				setModalitesParticulieresEMCON((String)newValue);
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
			case SchemaPackage.TYPE_DIRECTIVES_WEZ__ETAT_ALERTE_POUR_TIR:
				unsetEtatAlertePourTir();
				return;
			case SchemaPackage.TYPE_DIRECTIVES_WEZ__ETAT_ALERTE_POUR_MOUVEMENT:
				unsetEtatAlertePourMouvement();
				return;
			case SchemaPackage.TYPE_DIRECTIVES_WEZ__NIVEAU_EMCON:
				unsetNiveauEMCON();
				return;
			case SchemaPackage.TYPE_DIRECTIVES_WEZ__MODALITES_PARTICULIERES_ETAT_ALERTE:
				setModalitesParticulieresEtatAlerte(MODALITES_PARTICULIERES_ETAT_ALERTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DIRECTIVES_WEZ__MODALITES_PARTICULIERES_EMCON:
				setModalitesParticulieresEMCON(MODALITES_PARTICULIERES_EMCON_EDEFAULT);
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
			case SchemaPackage.TYPE_DIRECTIVES_WEZ__ETAT_ALERTE_POUR_TIR:
				return isSetEtatAlertePourTir();
			case SchemaPackage.TYPE_DIRECTIVES_WEZ__ETAT_ALERTE_POUR_MOUVEMENT:
				return isSetEtatAlertePourMouvement();
			case SchemaPackage.TYPE_DIRECTIVES_WEZ__NIVEAU_EMCON:
				return isSetNiveauEMCON();
			case SchemaPackage.TYPE_DIRECTIVES_WEZ__MODALITES_PARTICULIERES_ETAT_ALERTE:
				return MODALITES_PARTICULIERES_ETAT_ALERTE_EDEFAULT == null ? modalitesParticulieresEtatAlerte != null : !MODALITES_PARTICULIERES_ETAT_ALERTE_EDEFAULT.equals(modalitesParticulieresEtatAlerte);
			case SchemaPackage.TYPE_DIRECTIVES_WEZ__MODALITES_PARTICULIERES_EMCON:
				return MODALITES_PARTICULIERES_EMCON_EDEFAULT == null ? modalitesParticulieresEMCON != null : !MODALITES_PARTICULIERES_EMCON_EDEFAULT.equals(modalitesParticulieresEMCON);
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
		result.append(", niveauEMCON: ");
		if (niveauEMCONESet) result.append(niveauEMCON); else result.append("<unset>");
		result.append(", modalitesParticulieresEtatAlerte: ");
		result.append(modalitesParticulieresEtatAlerte);
		result.append(", modalitesParticulieresEMCON: ");
		result.append(modalitesParticulieresEMCON);
		result.append(')');
		return result.toString();
	}

} //TypeDirectivesWEZImpl
