/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeMiseEnOeuvreROE;
import mpia.schema.TypeROEparOrganisation;

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
 * An implementation of the model object '<em><b>Type Mise En Oeuvre ROE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMiseEnOeuvreROEImpl#getGDHmiseEnApplication <em>GD Hmise En Application</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMiseEnOeuvreROEImpl#getTendancesEtDirectivesGenerales <em>Tendances Et Directives Generales</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMiseEnOeuvreROEImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMiseEnOeuvreROEImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMiseEnOeuvreROEImpl#getSeDeclineEnROEparOrganisation <em>Se Decline En RO Epar Organisation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMiseEnOeuvreROEImpl extends EObjectImpl implements TypeMiseEnOeuvreROE {
	/**
	 * The default value of the '{@link #getGDHmiseEnApplication() <em>GD Hmise En Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHmiseEnApplication()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GD_HMISE_EN_APPLICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGDHmiseEnApplication() <em>GD Hmise En Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHmiseEnApplication()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gDHmiseEnApplication = GD_HMISE_EN_APPLICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTendancesEtDirectivesGenerales() <em>Tendances Et Directives Generales</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTendancesEtDirectivesGenerales()
	 * @generated
	 * @ordered
	 */
	protected static final String TENDANCES_ET_DIRECTIVES_GENERALES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTendancesEtDirectivesGenerales() <em>Tendances Et Directives Generales</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTendancesEtDirectivesGenerales()
	 * @generated
	 * @ordered
	 */
	protected String tendancesEtDirectivesGenerales = TENDANCES_ET_DIRECTIVES_GENERALES_EDEFAULT;

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
	 * The cached value of the '{@link #getSeDeclineEnROEparOrganisation() <em>Se Decline En RO Epar Organisation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeDeclineEnROEparOrganisation()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeROEparOrganisation> seDeclineEnROEparOrganisation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMiseEnOeuvreROEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMiseEnOeuvreROE();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getGDHmiseEnApplication() {
		return gDHmiseEnApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGDHmiseEnApplication(XMLGregorianCalendar newGDHmiseEnApplication) {
		XMLGregorianCalendar oldGDHmiseEnApplication = gDHmiseEnApplication;
		gDHmiseEnApplication = newGDHmiseEnApplication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISE_EN_OEUVRE_ROE__GD_HMISE_EN_APPLICATION, oldGDHmiseEnApplication, gDHmiseEnApplication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTendancesEtDirectivesGenerales() {
		return tendancesEtDirectivesGenerales;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTendancesEtDirectivesGenerales(String newTendancesEtDirectivesGenerales) {
		String oldTendancesEtDirectivesGenerales = tendancesEtDirectivesGenerales;
		tendancesEtDirectivesGenerales = newTendancesEtDirectivesGenerales;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISE_EN_OEUVRE_ROE__TENDANCES_ET_DIRECTIVES_GENERALES, oldTendancesEtDirectivesGenerales, tendancesEtDirectivesGenerales));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISE_EN_OEUVRE_ROE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISE_EN_OEUVRE_ROE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeROEparOrganisation> getSeDeclineEnROEparOrganisation() {
		if (seDeclineEnROEparOrganisation == null) {
			seDeclineEnROEparOrganisation = new EObjectContainmentEList<TypeROEparOrganisation>(TypeROEparOrganisation.class, this, SchemaPackage.TYPE_MISE_EN_OEUVRE_ROE__SE_DECLINE_EN_RO_EPAR_ORGANISATION);
		}
		return seDeclineEnROEparOrganisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MISE_EN_OEUVRE_ROE__SE_DECLINE_EN_RO_EPAR_ORGANISATION:
				return ((InternalEList<?>)getSeDeclineEnROEparOrganisation()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_MISE_EN_OEUVRE_ROE__GD_HMISE_EN_APPLICATION:
				return getGDHmiseEnApplication();
			case SchemaPackage.TYPE_MISE_EN_OEUVRE_ROE__TENDANCES_ET_DIRECTIVES_GENERALES:
				return getTendancesEtDirectivesGenerales();
			case SchemaPackage.TYPE_MISE_EN_OEUVRE_ROE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_MISE_EN_OEUVRE_ROE__CE:
				return getCE();
			case SchemaPackage.TYPE_MISE_EN_OEUVRE_ROE__SE_DECLINE_EN_RO_EPAR_ORGANISATION:
				return getSeDeclineEnROEparOrganisation();
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
			case SchemaPackage.TYPE_MISE_EN_OEUVRE_ROE__GD_HMISE_EN_APPLICATION:
				setGDHmiseEnApplication((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_MISE_EN_OEUVRE_ROE__TENDANCES_ET_DIRECTIVES_GENERALES:
				setTendancesEtDirectivesGenerales((String)newValue);
				return;
			case SchemaPackage.TYPE_MISE_EN_OEUVRE_ROE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_MISE_EN_OEUVRE_ROE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_MISE_EN_OEUVRE_ROE__SE_DECLINE_EN_RO_EPAR_ORGANISATION:
				getSeDeclineEnROEparOrganisation().clear();
				getSeDeclineEnROEparOrganisation().addAll((Collection<? extends TypeROEparOrganisation>)newValue);
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
			case SchemaPackage.TYPE_MISE_EN_OEUVRE_ROE__GD_HMISE_EN_APPLICATION:
				setGDHmiseEnApplication(GD_HMISE_EN_APPLICATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISE_EN_OEUVRE_ROE__TENDANCES_ET_DIRECTIVES_GENERALES:
				setTendancesEtDirectivesGenerales(TENDANCES_ET_DIRECTIVES_GENERALES_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISE_EN_OEUVRE_ROE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISE_EN_OEUVRE_ROE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISE_EN_OEUVRE_ROE__SE_DECLINE_EN_RO_EPAR_ORGANISATION:
				getSeDeclineEnROEparOrganisation().clear();
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
			case SchemaPackage.TYPE_MISE_EN_OEUVRE_ROE__GD_HMISE_EN_APPLICATION:
				return GD_HMISE_EN_APPLICATION_EDEFAULT == null ? gDHmiseEnApplication != null : !GD_HMISE_EN_APPLICATION_EDEFAULT.equals(gDHmiseEnApplication);
			case SchemaPackage.TYPE_MISE_EN_OEUVRE_ROE__TENDANCES_ET_DIRECTIVES_GENERALES:
				return TENDANCES_ET_DIRECTIVES_GENERALES_EDEFAULT == null ? tendancesEtDirectivesGenerales != null : !TENDANCES_ET_DIRECTIVES_GENERALES_EDEFAULT.equals(tendancesEtDirectivesGenerales);
			case SchemaPackage.TYPE_MISE_EN_OEUVRE_ROE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_MISE_EN_OEUVRE_ROE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_MISE_EN_OEUVRE_ROE__SE_DECLINE_EN_RO_EPAR_ORGANISATION:
				return seDeclineEnROEparOrganisation != null && !seDeclineEnROEparOrganisation.isEmpty();
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
		result.append(" (gDHmiseEnApplication: ");
		result.append(gDHmiseEnApplication);
		result.append(", tendancesEtDirectivesGenerales: ");
		result.append(tendancesEtDirectivesGenerales);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeMiseEnOeuvreROEImpl
