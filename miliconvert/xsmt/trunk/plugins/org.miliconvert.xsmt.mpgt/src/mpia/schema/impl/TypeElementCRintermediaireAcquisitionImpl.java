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
import mpia.meta.TypeDataTypeLongueur;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeElementCRintermediaireAcquisition;
import mpia.schema.TypeZoneSecurite;

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
 * An implementation of the model object '<em><b>Type Element CRintermediaire Acquisition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeElementCRintermediaireAcquisitionImpl#getDateAcquisitionObjectif <em>Date Acquisition Objectif</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeElementCRintermediaireAcquisitionImpl#getPrecisionPositionAmis <em>Precision Position Amis</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeElementCRintermediaireAcquisitionImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeElementCRintermediaireAcquisitionImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeElementCRintermediaireAcquisitionImpl#getAPourObjectifObjectifCiblage <em>APour Objectif Objectif Ciblage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeElementCRintermediaireAcquisitionImpl#getAPourZoneSecuriteZoneSecurite <em>APour Zone Securite Zone Securite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeElementCRintermediaireAcquisitionImpl extends EObjectImpl implements TypeElementCRintermediaireAcquisition {
	/**
	 * The default value of the '{@link #getDateAcquisitionObjectif() <em>Date Acquisition Objectif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateAcquisitionObjectif()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_ACQUISITION_OBJECTIF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateAcquisitionObjectif() <em>Date Acquisition Objectif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateAcquisitionObjectif()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateAcquisitionObjectif = DATE_ACQUISITION_OBJECTIF_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPrecisionPositionAmis() <em>Precision Position Amis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecisionPositionAmis()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur precisionPositionAmis;

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
	 * The cached value of the '{@link #getAPourObjectifObjectifCiblage() <em>APour Objectif Objectif Ciblage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourObjectifObjectifCiblage()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourObjectifObjectifCiblage;

	/**
	 * The cached value of the '{@link #getAPourZoneSecuriteZoneSecurite() <em>APour Zone Securite Zone Securite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourZoneSecuriteZoneSecurite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeZoneSecurite> aPourZoneSecuriteZoneSecurite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeElementCRintermediaireAcquisitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeElementCRintermediaireAcquisition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateAcquisitionObjectif() {
		return dateAcquisitionObjectif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateAcquisitionObjectif(XMLGregorianCalendar newDateAcquisitionObjectif) {
		XMLGregorianCalendar oldDateAcquisitionObjectif = dateAcquisitionObjectif;
		dateAcquisitionObjectif = newDateAcquisitionObjectif;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ELEMENT_CRINTERMEDIAIRE_ACQUISITION__DATE_ACQUISITION_OBJECTIF, oldDateAcquisitionObjectif, dateAcquisitionObjectif));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getPrecisionPositionAmis() {
		return precisionPositionAmis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrecisionPositionAmis(TypeDataTypeLongueur newPrecisionPositionAmis, NotificationChain msgs) {
		TypeDataTypeLongueur oldPrecisionPositionAmis = precisionPositionAmis;
		precisionPositionAmis = newPrecisionPositionAmis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ELEMENT_CRINTERMEDIAIRE_ACQUISITION__PRECISION_POSITION_AMIS, oldPrecisionPositionAmis, newPrecisionPositionAmis);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecisionPositionAmis(TypeDataTypeLongueur newPrecisionPositionAmis) {
		if (newPrecisionPositionAmis != precisionPositionAmis) {
			NotificationChain msgs = null;
			if (precisionPositionAmis != null)
				msgs = ((InternalEObject)precisionPositionAmis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ELEMENT_CRINTERMEDIAIRE_ACQUISITION__PRECISION_POSITION_AMIS, null, msgs);
			if (newPrecisionPositionAmis != null)
				msgs = ((InternalEObject)newPrecisionPositionAmis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ELEMENT_CRINTERMEDIAIRE_ACQUISITION__PRECISION_POSITION_AMIS, null, msgs);
			msgs = basicSetPrecisionPositionAmis(newPrecisionPositionAmis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ELEMENT_CRINTERMEDIAIRE_ACQUISITION__PRECISION_POSITION_AMIS, newPrecisionPositionAmis, newPrecisionPositionAmis));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ELEMENT_CRINTERMEDIAIRE_ACQUISITION__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ELEMENT_CRINTERMEDIAIRE_ACQUISITION__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourObjectifObjectifCiblage() {
		return aPourObjectifObjectifCiblage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourObjectifObjectifCiblage(TypeAssociation newAPourObjectifObjectifCiblage, NotificationChain msgs) {
		TypeAssociation oldAPourObjectifObjectifCiblage = aPourObjectifObjectifCiblage;
		aPourObjectifObjectifCiblage = newAPourObjectifObjectifCiblage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ELEMENT_CRINTERMEDIAIRE_ACQUISITION__APOUR_OBJECTIF_OBJECTIF_CIBLAGE, oldAPourObjectifObjectifCiblage, newAPourObjectifObjectifCiblage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourObjectifObjectifCiblage(TypeAssociation newAPourObjectifObjectifCiblage) {
		if (newAPourObjectifObjectifCiblage != aPourObjectifObjectifCiblage) {
			NotificationChain msgs = null;
			if (aPourObjectifObjectifCiblage != null)
				msgs = ((InternalEObject)aPourObjectifObjectifCiblage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ELEMENT_CRINTERMEDIAIRE_ACQUISITION__APOUR_OBJECTIF_OBJECTIF_CIBLAGE, null, msgs);
			if (newAPourObjectifObjectifCiblage != null)
				msgs = ((InternalEObject)newAPourObjectifObjectifCiblage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ELEMENT_CRINTERMEDIAIRE_ACQUISITION__APOUR_OBJECTIF_OBJECTIF_CIBLAGE, null, msgs);
			msgs = basicSetAPourObjectifObjectifCiblage(newAPourObjectifObjectifCiblage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ELEMENT_CRINTERMEDIAIRE_ACQUISITION__APOUR_OBJECTIF_OBJECTIF_CIBLAGE, newAPourObjectifObjectifCiblage, newAPourObjectifObjectifCiblage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeZoneSecurite> getAPourZoneSecuriteZoneSecurite() {
		if (aPourZoneSecuriteZoneSecurite == null) {
			aPourZoneSecuriteZoneSecurite = new EObjectContainmentEList<TypeZoneSecurite>(TypeZoneSecurite.class, this, SchemaPackage.TYPE_ELEMENT_CRINTERMEDIAIRE_ACQUISITION__APOUR_ZONE_SECURITE_ZONE_SECURITE);
		}
		return aPourZoneSecuriteZoneSecurite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ELEMENT_CRINTERMEDIAIRE_ACQUISITION__PRECISION_POSITION_AMIS:
				return basicSetPrecisionPositionAmis(null, msgs);
			case SchemaPackage.TYPE_ELEMENT_CRINTERMEDIAIRE_ACQUISITION__APOUR_OBJECTIF_OBJECTIF_CIBLAGE:
				return basicSetAPourObjectifObjectifCiblage(null, msgs);
			case SchemaPackage.TYPE_ELEMENT_CRINTERMEDIAIRE_ACQUISITION__APOUR_ZONE_SECURITE_ZONE_SECURITE:
				return ((InternalEList<?>)getAPourZoneSecuriteZoneSecurite()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_ELEMENT_CRINTERMEDIAIRE_ACQUISITION__DATE_ACQUISITION_OBJECTIF:
				return getDateAcquisitionObjectif();
			case SchemaPackage.TYPE_ELEMENT_CRINTERMEDIAIRE_ACQUISITION__PRECISION_POSITION_AMIS:
				return getPrecisionPositionAmis();
			case SchemaPackage.TYPE_ELEMENT_CRINTERMEDIAIRE_ACQUISITION__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ELEMENT_CRINTERMEDIAIRE_ACQUISITION__CE:
				return getCE();
			case SchemaPackage.TYPE_ELEMENT_CRINTERMEDIAIRE_ACQUISITION__APOUR_OBJECTIF_OBJECTIF_CIBLAGE:
				return getAPourObjectifObjectifCiblage();
			case SchemaPackage.TYPE_ELEMENT_CRINTERMEDIAIRE_ACQUISITION__APOUR_ZONE_SECURITE_ZONE_SECURITE:
				return getAPourZoneSecuriteZoneSecurite();
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
			case SchemaPackage.TYPE_ELEMENT_CRINTERMEDIAIRE_ACQUISITION__DATE_ACQUISITION_OBJECTIF:
				setDateAcquisitionObjectif((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_ELEMENT_CRINTERMEDIAIRE_ACQUISITION__PRECISION_POSITION_AMIS:
				setPrecisionPositionAmis((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_ELEMENT_CRINTERMEDIAIRE_ACQUISITION__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ELEMENT_CRINTERMEDIAIRE_ACQUISITION__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ELEMENT_CRINTERMEDIAIRE_ACQUISITION__APOUR_OBJECTIF_OBJECTIF_CIBLAGE:
				setAPourObjectifObjectifCiblage((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ELEMENT_CRINTERMEDIAIRE_ACQUISITION__APOUR_ZONE_SECURITE_ZONE_SECURITE:
				getAPourZoneSecuriteZoneSecurite().clear();
				getAPourZoneSecuriteZoneSecurite().addAll((Collection<? extends TypeZoneSecurite>)newValue);
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
			case SchemaPackage.TYPE_ELEMENT_CRINTERMEDIAIRE_ACQUISITION__DATE_ACQUISITION_OBJECTIF:
				setDateAcquisitionObjectif(DATE_ACQUISITION_OBJECTIF_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ELEMENT_CRINTERMEDIAIRE_ACQUISITION__PRECISION_POSITION_AMIS:
				setPrecisionPositionAmis((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_ELEMENT_CRINTERMEDIAIRE_ACQUISITION__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ELEMENT_CRINTERMEDIAIRE_ACQUISITION__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ELEMENT_CRINTERMEDIAIRE_ACQUISITION__APOUR_OBJECTIF_OBJECTIF_CIBLAGE:
				setAPourObjectifObjectifCiblage((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ELEMENT_CRINTERMEDIAIRE_ACQUISITION__APOUR_ZONE_SECURITE_ZONE_SECURITE:
				getAPourZoneSecuriteZoneSecurite().clear();
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
			case SchemaPackage.TYPE_ELEMENT_CRINTERMEDIAIRE_ACQUISITION__DATE_ACQUISITION_OBJECTIF:
				return DATE_ACQUISITION_OBJECTIF_EDEFAULT == null ? dateAcquisitionObjectif != null : !DATE_ACQUISITION_OBJECTIF_EDEFAULT.equals(dateAcquisitionObjectif);
			case SchemaPackage.TYPE_ELEMENT_CRINTERMEDIAIRE_ACQUISITION__PRECISION_POSITION_AMIS:
				return precisionPositionAmis != null;
			case SchemaPackage.TYPE_ELEMENT_CRINTERMEDIAIRE_ACQUISITION__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ELEMENT_CRINTERMEDIAIRE_ACQUISITION__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ELEMENT_CRINTERMEDIAIRE_ACQUISITION__APOUR_OBJECTIF_OBJECTIF_CIBLAGE:
				return aPourObjectifObjectifCiblage != null;
			case SchemaPackage.TYPE_ELEMENT_CRINTERMEDIAIRE_ACQUISITION__APOUR_ZONE_SECURITE_ZONE_SECURITE:
				return aPourZoneSecuriteZoneSecurite != null && !aPourZoneSecuriteZoneSecurite.isEmpty();
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
		result.append(" (dateAcquisitionObjectif: ");
		result.append(dateAcquisitionObjectif);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeElementCRintermediaireAcquisitionImpl
