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
import mpia.schema.TypeDirectiveEMCONpourUniteASA;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Directive EMCO Npour Unite ASA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeDirectiveEMCONpourUniteASAImpl#getHeureDebutApplication <em>Heure Debut Application</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDirectiveEMCONpourUniteASAImpl#getHeureFinApplication <em>Heure Fin Application</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDirectiveEMCONpourUniteASAImpl#getNiveauEMCON <em>Niveau EMCON</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDirectiveEMCONpourUniteASAImpl#getModalitesParticulieresEMCON <em>Modalites Particulieres EMCON</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDirectiveEMCONpourUniteASAImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDirectiveEMCONpourUniteASAImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDirectiveEMCONpourUniteASAImpl#getSAppliqueAuSystemeArmeTypeArme <em>SApplique Au Systeme Arme Type Arme</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeDirectiveEMCONpourUniteASAImpl extends EObjectImpl implements TypeDirectiveEMCONpourUniteASA {
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
	 * The cached value of the '{@link #getSAppliqueAuSystemeArmeTypeArme() <em>SApplique Au Systeme Arme Type Arme</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAppliqueAuSystemeArmeTypeArme()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT sAppliqueAuSystemeArmeTypeArme;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeDirectiveEMCONpourUniteASAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeDirectiveEMCONpourUniteASA();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DIRECTIVE_EMCO_NPOUR_UNITE_ASA__HEURE_DEBUT_APPLICATION, oldHeureDebutApplication, heureDebutApplication));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DIRECTIVE_EMCO_NPOUR_UNITE_ASA__HEURE_FIN_APPLICATION, oldHeureFinApplication, heureFinApplication));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DIRECTIVE_EMCO_NPOUR_UNITE_ASA__NIVEAU_EMCON, oldNiveauEMCON, niveauEMCON, !oldNiveauEMCONESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_DIRECTIVE_EMCO_NPOUR_UNITE_ASA__NIVEAU_EMCON, oldNiveauEMCON, NIVEAU_EMCON_EDEFAULT, oldNiveauEMCONESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DIRECTIVE_EMCO_NPOUR_UNITE_ASA__MODALITES_PARTICULIERES_EMCON, oldModalitesParticulieresEMCON, modalitesParticulieresEMCON));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DIRECTIVE_EMCO_NPOUR_UNITE_ASA__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DIRECTIVE_EMCO_NPOUR_UNITE_ASA__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getSAppliqueAuSystemeArmeTypeArme() {
		return sAppliqueAuSystemeArmeTypeArme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSAppliqueAuSystemeArmeTypeArme(TypeAssociationEXT newSAppliqueAuSystemeArmeTypeArme, NotificationChain msgs) {
		TypeAssociationEXT oldSAppliqueAuSystemeArmeTypeArme = sAppliqueAuSystemeArmeTypeArme;
		sAppliqueAuSystemeArmeTypeArme = newSAppliqueAuSystemeArmeTypeArme;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DIRECTIVE_EMCO_NPOUR_UNITE_ASA__SAPPLIQUE_AU_SYSTEME_ARME_TYPE_ARME, oldSAppliqueAuSystemeArmeTypeArme, newSAppliqueAuSystemeArmeTypeArme);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSAppliqueAuSystemeArmeTypeArme(TypeAssociationEXT newSAppliqueAuSystemeArmeTypeArme) {
		if (newSAppliqueAuSystemeArmeTypeArme != sAppliqueAuSystemeArmeTypeArme) {
			NotificationChain msgs = null;
			if (sAppliqueAuSystemeArmeTypeArme != null)
				msgs = ((InternalEObject)sAppliqueAuSystemeArmeTypeArme).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DIRECTIVE_EMCO_NPOUR_UNITE_ASA__SAPPLIQUE_AU_SYSTEME_ARME_TYPE_ARME, null, msgs);
			if (newSAppliqueAuSystemeArmeTypeArme != null)
				msgs = ((InternalEObject)newSAppliqueAuSystemeArmeTypeArme).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DIRECTIVE_EMCO_NPOUR_UNITE_ASA__SAPPLIQUE_AU_SYSTEME_ARME_TYPE_ARME, null, msgs);
			msgs = basicSetSAppliqueAuSystemeArmeTypeArme(newSAppliqueAuSystemeArmeTypeArme, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DIRECTIVE_EMCO_NPOUR_UNITE_ASA__SAPPLIQUE_AU_SYSTEME_ARME_TYPE_ARME, newSAppliqueAuSystemeArmeTypeArme, newSAppliqueAuSystemeArmeTypeArme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_DIRECTIVE_EMCO_NPOUR_UNITE_ASA__SAPPLIQUE_AU_SYSTEME_ARME_TYPE_ARME:
				return basicSetSAppliqueAuSystemeArmeTypeArme(null, msgs);
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
			case SchemaPackage.TYPE_DIRECTIVE_EMCO_NPOUR_UNITE_ASA__HEURE_DEBUT_APPLICATION:
				return getHeureDebutApplication();
			case SchemaPackage.TYPE_DIRECTIVE_EMCO_NPOUR_UNITE_ASA__HEURE_FIN_APPLICATION:
				return getHeureFinApplication();
			case SchemaPackage.TYPE_DIRECTIVE_EMCO_NPOUR_UNITE_ASA__NIVEAU_EMCON:
				return new Long(getNiveauEMCON());
			case SchemaPackage.TYPE_DIRECTIVE_EMCO_NPOUR_UNITE_ASA__MODALITES_PARTICULIERES_EMCON:
				return getModalitesParticulieresEMCON();
			case SchemaPackage.TYPE_DIRECTIVE_EMCO_NPOUR_UNITE_ASA__CTE:
				return getCTE();
			case SchemaPackage.TYPE_DIRECTIVE_EMCO_NPOUR_UNITE_ASA__CE:
				return getCE();
			case SchemaPackage.TYPE_DIRECTIVE_EMCO_NPOUR_UNITE_ASA__SAPPLIQUE_AU_SYSTEME_ARME_TYPE_ARME:
				return getSAppliqueAuSystemeArmeTypeArme();
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
			case SchemaPackage.TYPE_DIRECTIVE_EMCO_NPOUR_UNITE_ASA__HEURE_DEBUT_APPLICATION:
				setHeureDebutApplication((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_DIRECTIVE_EMCO_NPOUR_UNITE_ASA__HEURE_FIN_APPLICATION:
				setHeureFinApplication((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_DIRECTIVE_EMCO_NPOUR_UNITE_ASA__NIVEAU_EMCON:
				setNiveauEMCON(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_DIRECTIVE_EMCO_NPOUR_UNITE_ASA__MODALITES_PARTICULIERES_EMCON:
				setModalitesParticulieresEMCON((String)newValue);
				return;
			case SchemaPackage.TYPE_DIRECTIVE_EMCO_NPOUR_UNITE_ASA__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_DIRECTIVE_EMCO_NPOUR_UNITE_ASA__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_DIRECTIVE_EMCO_NPOUR_UNITE_ASA__SAPPLIQUE_AU_SYSTEME_ARME_TYPE_ARME:
				setSAppliqueAuSystemeArmeTypeArme((TypeAssociationEXT)newValue);
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
			case SchemaPackage.TYPE_DIRECTIVE_EMCO_NPOUR_UNITE_ASA__HEURE_DEBUT_APPLICATION:
				setHeureDebutApplication(HEURE_DEBUT_APPLICATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DIRECTIVE_EMCO_NPOUR_UNITE_ASA__HEURE_FIN_APPLICATION:
				setHeureFinApplication(HEURE_FIN_APPLICATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DIRECTIVE_EMCO_NPOUR_UNITE_ASA__NIVEAU_EMCON:
				unsetNiveauEMCON();
				return;
			case SchemaPackage.TYPE_DIRECTIVE_EMCO_NPOUR_UNITE_ASA__MODALITES_PARTICULIERES_EMCON:
				setModalitesParticulieresEMCON(MODALITES_PARTICULIERES_EMCON_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DIRECTIVE_EMCO_NPOUR_UNITE_ASA__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DIRECTIVE_EMCO_NPOUR_UNITE_ASA__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DIRECTIVE_EMCO_NPOUR_UNITE_ASA__SAPPLIQUE_AU_SYSTEME_ARME_TYPE_ARME:
				setSAppliqueAuSystemeArmeTypeArme((TypeAssociationEXT)null);
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
			case SchemaPackage.TYPE_DIRECTIVE_EMCO_NPOUR_UNITE_ASA__HEURE_DEBUT_APPLICATION:
				return HEURE_DEBUT_APPLICATION_EDEFAULT == null ? heureDebutApplication != null : !HEURE_DEBUT_APPLICATION_EDEFAULT.equals(heureDebutApplication);
			case SchemaPackage.TYPE_DIRECTIVE_EMCO_NPOUR_UNITE_ASA__HEURE_FIN_APPLICATION:
				return HEURE_FIN_APPLICATION_EDEFAULT == null ? heureFinApplication != null : !HEURE_FIN_APPLICATION_EDEFAULT.equals(heureFinApplication);
			case SchemaPackage.TYPE_DIRECTIVE_EMCO_NPOUR_UNITE_ASA__NIVEAU_EMCON:
				return isSetNiveauEMCON();
			case SchemaPackage.TYPE_DIRECTIVE_EMCO_NPOUR_UNITE_ASA__MODALITES_PARTICULIERES_EMCON:
				return MODALITES_PARTICULIERES_EMCON_EDEFAULT == null ? modalitesParticulieresEMCON != null : !MODALITES_PARTICULIERES_EMCON_EDEFAULT.equals(modalitesParticulieresEMCON);
			case SchemaPackage.TYPE_DIRECTIVE_EMCO_NPOUR_UNITE_ASA__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_DIRECTIVE_EMCO_NPOUR_UNITE_ASA__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_DIRECTIVE_EMCO_NPOUR_UNITE_ASA__SAPPLIQUE_AU_SYSTEME_ARME_TYPE_ARME:
				return sAppliqueAuSystemeArmeTypeArme != null;
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
		result.append(" (heureDebutApplication: ");
		result.append(heureDebutApplication);
		result.append(", heureFinApplication: ");
		result.append(heureFinApplication);
		result.append(", niveauEMCON: ");
		if (niveauEMCONESet) result.append(niveauEMCON); else result.append("<unset>");
		result.append(", modalitesParticulieresEMCON: ");
		result.append(modalitesParticulieresEMCON);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeDirectiveEMCONpourUniteASAImpl
