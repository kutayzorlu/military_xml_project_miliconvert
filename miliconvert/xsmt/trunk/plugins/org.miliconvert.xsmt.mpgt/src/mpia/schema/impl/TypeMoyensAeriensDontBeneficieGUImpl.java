/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeMoyensAeriensDontBeneficieGU;

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
 * An implementation of the model object '<em><b>Type Moyens Aeriens Dont Beneficie GU</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMoyensAeriensDontBeneficieGUImpl#getHeureDebutDisponibilite <em>Heure Debut Disponibilite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyensAeriensDontBeneficieGUImpl#getHeureFinDisponibilite <em>Heure Fin Disponibilite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyensAeriensDontBeneficieGUImpl#getCapaciteOpsGlobale <em>Capacite Ops Globale</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyensAeriensDontBeneficieGUImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyensAeriensDontBeneficieGUImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyensAeriensDontBeneficieGUImpl#getAPourMoyensAMIPrelevementDetachement <em>APour Moyens AMI Prelevement Detachement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMoyensAeriensDontBeneficieGUImpl extends EObjectImpl implements TypeMoyensAeriensDontBeneficieGU {
	/**
	 * The default value of the '{@link #getHeureDebutDisponibilite() <em>Heure Debut Disponibilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeureDebutDisponibilite()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar HEURE_DEBUT_DISPONIBILITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeureDebutDisponibilite() <em>Heure Debut Disponibilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeureDebutDisponibilite()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar heureDebutDisponibilite = HEURE_DEBUT_DISPONIBILITE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeureFinDisponibilite() <em>Heure Fin Disponibilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeureFinDisponibilite()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar HEURE_FIN_DISPONIBILITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeureFinDisponibilite() <em>Heure Fin Disponibilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeureFinDisponibilite()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar heureFinDisponibilite = HEURE_FIN_DISPONIBILITE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapaciteOpsGlobale() <em>Capacite Ops Globale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapaciteOpsGlobale()
	 * @generated
	 * @ordered
	 */
	protected static final double CAPACITE_OPS_GLOBALE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCapaciteOpsGlobale() <em>Capacite Ops Globale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapaciteOpsGlobale()
	 * @generated
	 * @ordered
	 */
	protected double capaciteOpsGlobale = CAPACITE_OPS_GLOBALE_EDEFAULT;

	/**
	 * This is true if the Capacite Ops Globale attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean capaciteOpsGlobaleESet;

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
	 * The cached value of the '{@link #getAPourMoyensAMIPrelevementDetachement() <em>APour Moyens AMI Prelevement Detachement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourMoyensAMIPrelevementDetachement()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourMoyensAMIPrelevementDetachement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMoyensAeriensDontBeneficieGUImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMoyensAeriensDontBeneficieGU();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getHeureDebutDisponibilite() {
		return heureDebutDisponibilite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeureDebutDisponibilite(XMLGregorianCalendar newHeureDebutDisponibilite) {
		XMLGregorianCalendar oldHeureDebutDisponibilite = heureDebutDisponibilite;
		heureDebutDisponibilite = newHeureDebutDisponibilite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYENS_AERIENS_DONT_BENEFICIE_GU__HEURE_DEBUT_DISPONIBILITE, oldHeureDebutDisponibilite, heureDebutDisponibilite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getHeureFinDisponibilite() {
		return heureFinDisponibilite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeureFinDisponibilite(XMLGregorianCalendar newHeureFinDisponibilite) {
		XMLGregorianCalendar oldHeureFinDisponibilite = heureFinDisponibilite;
		heureFinDisponibilite = newHeureFinDisponibilite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYENS_AERIENS_DONT_BENEFICIE_GU__HEURE_FIN_DISPONIBILITE, oldHeureFinDisponibilite, heureFinDisponibilite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCapaciteOpsGlobale() {
		return capaciteOpsGlobale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapaciteOpsGlobale(double newCapaciteOpsGlobale) {
		double oldCapaciteOpsGlobale = capaciteOpsGlobale;
		capaciteOpsGlobale = newCapaciteOpsGlobale;
		boolean oldCapaciteOpsGlobaleESet = capaciteOpsGlobaleESet;
		capaciteOpsGlobaleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYENS_AERIENS_DONT_BENEFICIE_GU__CAPACITE_OPS_GLOBALE, oldCapaciteOpsGlobale, capaciteOpsGlobale, !oldCapaciteOpsGlobaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCapaciteOpsGlobale() {
		double oldCapaciteOpsGlobale = capaciteOpsGlobale;
		boolean oldCapaciteOpsGlobaleESet = capaciteOpsGlobaleESet;
		capaciteOpsGlobale = CAPACITE_OPS_GLOBALE_EDEFAULT;
		capaciteOpsGlobaleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MOYENS_AERIENS_DONT_BENEFICIE_GU__CAPACITE_OPS_GLOBALE, oldCapaciteOpsGlobale, CAPACITE_OPS_GLOBALE_EDEFAULT, oldCapaciteOpsGlobaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCapaciteOpsGlobale() {
		return capaciteOpsGlobaleESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYENS_AERIENS_DONT_BENEFICIE_GU__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYENS_AERIENS_DONT_BENEFICIE_GU__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourMoyensAMIPrelevementDetachement() {
		if (aPourMoyensAMIPrelevementDetachement == null) {
			aPourMoyensAMIPrelevementDetachement = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MOYENS_AERIENS_DONT_BENEFICIE_GU__APOUR_MOYENS_AMI_PRELEVEMENT_DETACHEMENT);
		}
		return aPourMoyensAMIPrelevementDetachement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MOYENS_AERIENS_DONT_BENEFICIE_GU__APOUR_MOYENS_AMI_PRELEVEMENT_DETACHEMENT:
				return ((InternalEList<?>)getAPourMoyensAMIPrelevementDetachement()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_MOYENS_AERIENS_DONT_BENEFICIE_GU__HEURE_DEBUT_DISPONIBILITE:
				return getHeureDebutDisponibilite();
			case SchemaPackage.TYPE_MOYENS_AERIENS_DONT_BENEFICIE_GU__HEURE_FIN_DISPONIBILITE:
				return getHeureFinDisponibilite();
			case SchemaPackage.TYPE_MOYENS_AERIENS_DONT_BENEFICIE_GU__CAPACITE_OPS_GLOBALE:
				return new Double(getCapaciteOpsGlobale());
			case SchemaPackage.TYPE_MOYENS_AERIENS_DONT_BENEFICIE_GU__CTE:
				return getCTE();
			case SchemaPackage.TYPE_MOYENS_AERIENS_DONT_BENEFICIE_GU__CE:
				return getCE();
			case SchemaPackage.TYPE_MOYENS_AERIENS_DONT_BENEFICIE_GU__APOUR_MOYENS_AMI_PRELEVEMENT_DETACHEMENT:
				return getAPourMoyensAMIPrelevementDetachement();
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
			case SchemaPackage.TYPE_MOYENS_AERIENS_DONT_BENEFICIE_GU__HEURE_DEBUT_DISPONIBILITE:
				setHeureDebutDisponibilite((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_MOYENS_AERIENS_DONT_BENEFICIE_GU__HEURE_FIN_DISPONIBILITE:
				setHeureFinDisponibilite((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_MOYENS_AERIENS_DONT_BENEFICIE_GU__CAPACITE_OPS_GLOBALE:
				setCapaciteOpsGlobale(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_MOYENS_AERIENS_DONT_BENEFICIE_GU__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_MOYENS_AERIENS_DONT_BENEFICIE_GU__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_MOYENS_AERIENS_DONT_BENEFICIE_GU__APOUR_MOYENS_AMI_PRELEVEMENT_DETACHEMENT:
				getAPourMoyensAMIPrelevementDetachement().clear();
				getAPourMoyensAMIPrelevementDetachement().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_MOYENS_AERIENS_DONT_BENEFICIE_GU__HEURE_DEBUT_DISPONIBILITE:
				setHeureDebutDisponibilite(HEURE_DEBUT_DISPONIBILITE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MOYENS_AERIENS_DONT_BENEFICIE_GU__HEURE_FIN_DISPONIBILITE:
				setHeureFinDisponibilite(HEURE_FIN_DISPONIBILITE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MOYENS_AERIENS_DONT_BENEFICIE_GU__CAPACITE_OPS_GLOBALE:
				unsetCapaciteOpsGlobale();
				return;
			case SchemaPackage.TYPE_MOYENS_AERIENS_DONT_BENEFICIE_GU__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MOYENS_AERIENS_DONT_BENEFICIE_GU__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MOYENS_AERIENS_DONT_BENEFICIE_GU__APOUR_MOYENS_AMI_PRELEVEMENT_DETACHEMENT:
				getAPourMoyensAMIPrelevementDetachement().clear();
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
			case SchemaPackage.TYPE_MOYENS_AERIENS_DONT_BENEFICIE_GU__HEURE_DEBUT_DISPONIBILITE:
				return HEURE_DEBUT_DISPONIBILITE_EDEFAULT == null ? heureDebutDisponibilite != null : !HEURE_DEBUT_DISPONIBILITE_EDEFAULT.equals(heureDebutDisponibilite);
			case SchemaPackage.TYPE_MOYENS_AERIENS_DONT_BENEFICIE_GU__HEURE_FIN_DISPONIBILITE:
				return HEURE_FIN_DISPONIBILITE_EDEFAULT == null ? heureFinDisponibilite != null : !HEURE_FIN_DISPONIBILITE_EDEFAULT.equals(heureFinDisponibilite);
			case SchemaPackage.TYPE_MOYENS_AERIENS_DONT_BENEFICIE_GU__CAPACITE_OPS_GLOBALE:
				return isSetCapaciteOpsGlobale();
			case SchemaPackage.TYPE_MOYENS_AERIENS_DONT_BENEFICIE_GU__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_MOYENS_AERIENS_DONT_BENEFICIE_GU__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_MOYENS_AERIENS_DONT_BENEFICIE_GU__APOUR_MOYENS_AMI_PRELEVEMENT_DETACHEMENT:
				return aPourMoyensAMIPrelevementDetachement != null && !aPourMoyensAMIPrelevementDetachement.isEmpty();
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
		result.append(" (heureDebutDisponibilite: ");
		result.append(heureDebutDisponibilite);
		result.append(", heureFinDisponibilite: ");
		result.append(heureFinDisponibilite);
		result.append(", capaciteOpsGlobale: ");
		if (capaciteOpsGlobaleESet) result.append(capaciteOpsGlobale); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeMoyensAeriensDontBeneficieGUImpl
