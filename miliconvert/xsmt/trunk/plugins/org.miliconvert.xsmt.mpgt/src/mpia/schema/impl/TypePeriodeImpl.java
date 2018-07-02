/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDatation;
import mpia.schema.TypePeriode;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Periode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypePeriodeImpl#getDateDebutCalculee <em>Date Debut Calculee</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePeriodeImpl#getDateFinCalculee <em>Date Fin Calculee</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePeriodeImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePeriodeImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePeriodeImpl#getAPourDateDebutPrevisionnelleDatation <em>APour Date Debut Previsionnelle Datation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePeriodeImpl#getAPourDateFinPrevisionnelleDatation <em>APour Date Fin Previsionnelle Datation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypePeriodeImpl extends EObjectImpl implements TypePeriode {
	/**
	 * The default value of the '{@link #getDateDebutCalculee() <em>Date Debut Calculee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDebutCalculee()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_DEBUT_CALCULEE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateDebutCalculee() <em>Date Debut Calculee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDebutCalculee()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateDebutCalculee = DATE_DEBUT_CALCULEE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateFinCalculee() <em>Date Fin Calculee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFinCalculee()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_FIN_CALCULEE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateFinCalculee() <em>Date Fin Calculee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFinCalculee()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateFinCalculee = DATE_FIN_CALCULEE_EDEFAULT;

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
	 * The cached value of the '{@link #getAPourDateDebutPrevisionnelleDatation() <em>APour Date Debut Previsionnelle Datation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourDateDebutPrevisionnelleDatation()
	 * @generated
	 * @ordered
	 */
	protected TypeDatation aPourDateDebutPrevisionnelleDatation;

	/**
	 * The cached value of the '{@link #getAPourDateFinPrevisionnelleDatation() <em>APour Date Fin Previsionnelle Datation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourDateFinPrevisionnelleDatation()
	 * @generated
	 * @ordered
	 */
	protected TypeDatation aPourDateFinPrevisionnelleDatation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypePeriodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypePeriode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateDebutCalculee() {
		return dateDebutCalculee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateDebutCalculee(XMLGregorianCalendar newDateDebutCalculee) {
		XMLGregorianCalendar oldDateDebutCalculee = dateDebutCalculee;
		dateDebutCalculee = newDateDebutCalculee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PERIODE__DATE_DEBUT_CALCULEE, oldDateDebutCalculee, dateDebutCalculee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateFinCalculee() {
		return dateFinCalculee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateFinCalculee(XMLGregorianCalendar newDateFinCalculee) {
		XMLGregorianCalendar oldDateFinCalculee = dateFinCalculee;
		dateFinCalculee = newDateFinCalculee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PERIODE__DATE_FIN_CALCULEE, oldDateFinCalculee, dateFinCalculee));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PERIODE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PERIODE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDatation getAPourDateDebutPrevisionnelleDatation() {
		return aPourDateDebutPrevisionnelleDatation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourDateDebutPrevisionnelleDatation(TypeDatation newAPourDateDebutPrevisionnelleDatation, NotificationChain msgs) {
		TypeDatation oldAPourDateDebutPrevisionnelleDatation = aPourDateDebutPrevisionnelleDatation;
		aPourDateDebutPrevisionnelleDatation = newAPourDateDebutPrevisionnelleDatation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PERIODE__APOUR_DATE_DEBUT_PREVISIONNELLE_DATATION, oldAPourDateDebutPrevisionnelleDatation, newAPourDateDebutPrevisionnelleDatation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourDateDebutPrevisionnelleDatation(TypeDatation newAPourDateDebutPrevisionnelleDatation) {
		if (newAPourDateDebutPrevisionnelleDatation != aPourDateDebutPrevisionnelleDatation) {
			NotificationChain msgs = null;
			if (aPourDateDebutPrevisionnelleDatation != null)
				msgs = ((InternalEObject)aPourDateDebutPrevisionnelleDatation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PERIODE__APOUR_DATE_DEBUT_PREVISIONNELLE_DATATION, null, msgs);
			if (newAPourDateDebutPrevisionnelleDatation != null)
				msgs = ((InternalEObject)newAPourDateDebutPrevisionnelleDatation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PERIODE__APOUR_DATE_DEBUT_PREVISIONNELLE_DATATION, null, msgs);
			msgs = basicSetAPourDateDebutPrevisionnelleDatation(newAPourDateDebutPrevisionnelleDatation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PERIODE__APOUR_DATE_DEBUT_PREVISIONNELLE_DATATION, newAPourDateDebutPrevisionnelleDatation, newAPourDateDebutPrevisionnelleDatation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDatation getAPourDateFinPrevisionnelleDatation() {
		return aPourDateFinPrevisionnelleDatation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourDateFinPrevisionnelleDatation(TypeDatation newAPourDateFinPrevisionnelleDatation, NotificationChain msgs) {
		TypeDatation oldAPourDateFinPrevisionnelleDatation = aPourDateFinPrevisionnelleDatation;
		aPourDateFinPrevisionnelleDatation = newAPourDateFinPrevisionnelleDatation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PERIODE__APOUR_DATE_FIN_PREVISIONNELLE_DATATION, oldAPourDateFinPrevisionnelleDatation, newAPourDateFinPrevisionnelleDatation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourDateFinPrevisionnelleDatation(TypeDatation newAPourDateFinPrevisionnelleDatation) {
		if (newAPourDateFinPrevisionnelleDatation != aPourDateFinPrevisionnelleDatation) {
			NotificationChain msgs = null;
			if (aPourDateFinPrevisionnelleDatation != null)
				msgs = ((InternalEObject)aPourDateFinPrevisionnelleDatation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PERIODE__APOUR_DATE_FIN_PREVISIONNELLE_DATATION, null, msgs);
			if (newAPourDateFinPrevisionnelleDatation != null)
				msgs = ((InternalEObject)newAPourDateFinPrevisionnelleDatation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PERIODE__APOUR_DATE_FIN_PREVISIONNELLE_DATATION, null, msgs);
			msgs = basicSetAPourDateFinPrevisionnelleDatation(newAPourDateFinPrevisionnelleDatation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PERIODE__APOUR_DATE_FIN_PREVISIONNELLE_DATATION, newAPourDateFinPrevisionnelleDatation, newAPourDateFinPrevisionnelleDatation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_PERIODE__APOUR_DATE_DEBUT_PREVISIONNELLE_DATATION:
				return basicSetAPourDateDebutPrevisionnelleDatation(null, msgs);
			case SchemaPackage.TYPE_PERIODE__APOUR_DATE_FIN_PREVISIONNELLE_DATATION:
				return basicSetAPourDateFinPrevisionnelleDatation(null, msgs);
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
			case SchemaPackage.TYPE_PERIODE__DATE_DEBUT_CALCULEE:
				return getDateDebutCalculee();
			case SchemaPackage.TYPE_PERIODE__DATE_FIN_CALCULEE:
				return getDateFinCalculee();
			case SchemaPackage.TYPE_PERIODE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_PERIODE__CE:
				return getCE();
			case SchemaPackage.TYPE_PERIODE__APOUR_DATE_DEBUT_PREVISIONNELLE_DATATION:
				return getAPourDateDebutPrevisionnelleDatation();
			case SchemaPackage.TYPE_PERIODE__APOUR_DATE_FIN_PREVISIONNELLE_DATATION:
				return getAPourDateFinPrevisionnelleDatation();
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
			case SchemaPackage.TYPE_PERIODE__DATE_DEBUT_CALCULEE:
				setDateDebutCalculee((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_PERIODE__DATE_FIN_CALCULEE:
				setDateFinCalculee((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_PERIODE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_PERIODE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_PERIODE__APOUR_DATE_DEBUT_PREVISIONNELLE_DATATION:
				setAPourDateDebutPrevisionnelleDatation((TypeDatation)newValue);
				return;
			case SchemaPackage.TYPE_PERIODE__APOUR_DATE_FIN_PREVISIONNELLE_DATATION:
				setAPourDateFinPrevisionnelleDatation((TypeDatation)newValue);
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
			case SchemaPackage.TYPE_PERIODE__DATE_DEBUT_CALCULEE:
				setDateDebutCalculee(DATE_DEBUT_CALCULEE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PERIODE__DATE_FIN_CALCULEE:
				setDateFinCalculee(DATE_FIN_CALCULEE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PERIODE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PERIODE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PERIODE__APOUR_DATE_DEBUT_PREVISIONNELLE_DATATION:
				setAPourDateDebutPrevisionnelleDatation((TypeDatation)null);
				return;
			case SchemaPackage.TYPE_PERIODE__APOUR_DATE_FIN_PREVISIONNELLE_DATATION:
				setAPourDateFinPrevisionnelleDatation((TypeDatation)null);
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
			case SchemaPackage.TYPE_PERIODE__DATE_DEBUT_CALCULEE:
				return DATE_DEBUT_CALCULEE_EDEFAULT == null ? dateDebutCalculee != null : !DATE_DEBUT_CALCULEE_EDEFAULT.equals(dateDebutCalculee);
			case SchemaPackage.TYPE_PERIODE__DATE_FIN_CALCULEE:
				return DATE_FIN_CALCULEE_EDEFAULT == null ? dateFinCalculee != null : !DATE_FIN_CALCULEE_EDEFAULT.equals(dateFinCalculee);
			case SchemaPackage.TYPE_PERIODE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_PERIODE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_PERIODE__APOUR_DATE_DEBUT_PREVISIONNELLE_DATATION:
				return aPourDateDebutPrevisionnelleDatation != null;
			case SchemaPackage.TYPE_PERIODE__APOUR_DATE_FIN_PREVISIONNELLE_DATATION:
				return aPourDateFinPrevisionnelleDatation != null;
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
		result.append(" (dateDebutCalculee: ");
		result.append(dateDebutCalculee);
		result.append(", dateFinCalculee: ");
		result.append(dateFinCalculee);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypePeriodeImpl
