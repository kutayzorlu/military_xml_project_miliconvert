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
import mpia.schema.TypeTrancheMeteo;

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
 * An implementation of the model object '<em><b>Type Tranche Meteo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeTrancheMeteoImpl#getGDHdebut <em>GD Hdebut</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTrancheMeteoImpl#getGDHfin <em>GD Hfin</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTrancheMeteoImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTrancheMeteoImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTrancheMeteoImpl#getAPourCaracteristiqueElementMeteo <em>APour Caracteristique Element Meteo</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTrancheMeteoImpl#getConcerneEvenementNRBC <em>Concerne Evenement NRBC</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTrancheMeteoImpl#getConcerneSyntheseDetections <em>Concerne Synthese Detections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeTrancheMeteoImpl extends EObjectImpl implements TypeTrancheMeteo {
	/**
	 * The default value of the '{@link #getGDHdebut() <em>GD Hdebut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHdebut()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GD_HDEBUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGDHdebut() <em>GD Hdebut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHdebut()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gDHdebut = GD_HDEBUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getGDHfin() <em>GD Hfin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHfin()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GD_HFIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGDHfin() <em>GD Hfin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHfin()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gDHfin = GD_HFIN_EDEFAULT;

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
	 * The cached value of the '{@link #getAPourCaracteristiqueElementMeteo() <em>APour Caracteristique Element Meteo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourCaracteristiqueElementMeteo()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourCaracteristiqueElementMeteo;

	/**
	 * The cached value of the '{@link #getConcerneEvenementNRBC() <em>Concerne Evenement NRBC</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneEvenementNRBC()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation concerneEvenementNRBC;

	/**
	 * The cached value of the '{@link #getConcerneSyntheseDetections() <em>Concerne Synthese Detections</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneSyntheseDetections()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation concerneSyntheseDetections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeTrancheMeteoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeTrancheMeteo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getGDHdebut() {
		return gDHdebut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGDHdebut(XMLGregorianCalendar newGDHdebut) {
		XMLGregorianCalendar oldGDHdebut = gDHdebut;
		gDHdebut = newGDHdebut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRANCHE_METEO__GD_HDEBUT, oldGDHdebut, gDHdebut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getGDHfin() {
		return gDHfin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGDHfin(XMLGregorianCalendar newGDHfin) {
		XMLGregorianCalendar oldGDHfin = gDHfin;
		gDHfin = newGDHfin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRANCHE_METEO__GD_HFIN, oldGDHfin, gDHfin));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRANCHE_METEO__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRANCHE_METEO__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourCaracteristiqueElementMeteo() {
		if (aPourCaracteristiqueElementMeteo == null) {
			aPourCaracteristiqueElementMeteo = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_TRANCHE_METEO__APOUR_CARACTERISTIQUE_ELEMENT_METEO);
		}
		return aPourCaracteristiqueElementMeteo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getConcerneEvenementNRBC() {
		return concerneEvenementNRBC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcerneEvenementNRBC(TypeAssociation newConcerneEvenementNRBC, NotificationChain msgs) {
		TypeAssociation oldConcerneEvenementNRBC = concerneEvenementNRBC;
		concerneEvenementNRBC = newConcerneEvenementNRBC;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRANCHE_METEO__CONCERNE_EVENEMENT_NRBC, oldConcerneEvenementNRBC, newConcerneEvenementNRBC);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcerneEvenementNRBC(TypeAssociation newConcerneEvenementNRBC) {
		if (newConcerneEvenementNRBC != concerneEvenementNRBC) {
			NotificationChain msgs = null;
			if (concerneEvenementNRBC != null)
				msgs = ((InternalEObject)concerneEvenementNRBC).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TRANCHE_METEO__CONCERNE_EVENEMENT_NRBC, null, msgs);
			if (newConcerneEvenementNRBC != null)
				msgs = ((InternalEObject)newConcerneEvenementNRBC).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TRANCHE_METEO__CONCERNE_EVENEMENT_NRBC, null, msgs);
			msgs = basicSetConcerneEvenementNRBC(newConcerneEvenementNRBC, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRANCHE_METEO__CONCERNE_EVENEMENT_NRBC, newConcerneEvenementNRBC, newConcerneEvenementNRBC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getConcerneSyntheseDetections() {
		return concerneSyntheseDetections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcerneSyntheseDetections(TypeAssociation newConcerneSyntheseDetections, NotificationChain msgs) {
		TypeAssociation oldConcerneSyntheseDetections = concerneSyntheseDetections;
		concerneSyntheseDetections = newConcerneSyntheseDetections;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRANCHE_METEO__CONCERNE_SYNTHESE_DETECTIONS, oldConcerneSyntheseDetections, newConcerneSyntheseDetections);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcerneSyntheseDetections(TypeAssociation newConcerneSyntheseDetections) {
		if (newConcerneSyntheseDetections != concerneSyntheseDetections) {
			NotificationChain msgs = null;
			if (concerneSyntheseDetections != null)
				msgs = ((InternalEObject)concerneSyntheseDetections).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TRANCHE_METEO__CONCERNE_SYNTHESE_DETECTIONS, null, msgs);
			if (newConcerneSyntheseDetections != null)
				msgs = ((InternalEObject)newConcerneSyntheseDetections).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TRANCHE_METEO__CONCERNE_SYNTHESE_DETECTIONS, null, msgs);
			msgs = basicSetConcerneSyntheseDetections(newConcerneSyntheseDetections, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRANCHE_METEO__CONCERNE_SYNTHESE_DETECTIONS, newConcerneSyntheseDetections, newConcerneSyntheseDetections));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_TRANCHE_METEO__APOUR_CARACTERISTIQUE_ELEMENT_METEO:
				return ((InternalEList<?>)getAPourCaracteristiqueElementMeteo()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_TRANCHE_METEO__CONCERNE_EVENEMENT_NRBC:
				return basicSetConcerneEvenementNRBC(null, msgs);
			case SchemaPackage.TYPE_TRANCHE_METEO__CONCERNE_SYNTHESE_DETECTIONS:
				return basicSetConcerneSyntheseDetections(null, msgs);
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
			case SchemaPackage.TYPE_TRANCHE_METEO__GD_HDEBUT:
				return getGDHdebut();
			case SchemaPackage.TYPE_TRANCHE_METEO__GD_HFIN:
				return getGDHfin();
			case SchemaPackage.TYPE_TRANCHE_METEO__CTE:
				return getCTE();
			case SchemaPackage.TYPE_TRANCHE_METEO__CE:
				return getCE();
			case SchemaPackage.TYPE_TRANCHE_METEO__APOUR_CARACTERISTIQUE_ELEMENT_METEO:
				return getAPourCaracteristiqueElementMeteo();
			case SchemaPackage.TYPE_TRANCHE_METEO__CONCERNE_EVENEMENT_NRBC:
				return getConcerneEvenementNRBC();
			case SchemaPackage.TYPE_TRANCHE_METEO__CONCERNE_SYNTHESE_DETECTIONS:
				return getConcerneSyntheseDetections();
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
			case SchemaPackage.TYPE_TRANCHE_METEO__GD_HDEBUT:
				setGDHdebut((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_TRANCHE_METEO__GD_HFIN:
				setGDHfin((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_TRANCHE_METEO__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_TRANCHE_METEO__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_TRANCHE_METEO__APOUR_CARACTERISTIQUE_ELEMENT_METEO:
				getAPourCaracteristiqueElementMeteo().clear();
				getAPourCaracteristiqueElementMeteo().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_TRANCHE_METEO__CONCERNE_EVENEMENT_NRBC:
				setConcerneEvenementNRBC((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_TRANCHE_METEO__CONCERNE_SYNTHESE_DETECTIONS:
				setConcerneSyntheseDetections((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_TRANCHE_METEO__GD_HDEBUT:
				setGDHdebut(GD_HDEBUT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TRANCHE_METEO__GD_HFIN:
				setGDHfin(GD_HFIN_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TRANCHE_METEO__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TRANCHE_METEO__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TRANCHE_METEO__APOUR_CARACTERISTIQUE_ELEMENT_METEO:
				getAPourCaracteristiqueElementMeteo().clear();
				return;
			case SchemaPackage.TYPE_TRANCHE_METEO__CONCERNE_EVENEMENT_NRBC:
				setConcerneEvenementNRBC((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_TRANCHE_METEO__CONCERNE_SYNTHESE_DETECTIONS:
				setConcerneSyntheseDetections((TypeAssociation)null);
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
			case SchemaPackage.TYPE_TRANCHE_METEO__GD_HDEBUT:
				return GD_HDEBUT_EDEFAULT == null ? gDHdebut != null : !GD_HDEBUT_EDEFAULT.equals(gDHdebut);
			case SchemaPackage.TYPE_TRANCHE_METEO__GD_HFIN:
				return GD_HFIN_EDEFAULT == null ? gDHfin != null : !GD_HFIN_EDEFAULT.equals(gDHfin);
			case SchemaPackage.TYPE_TRANCHE_METEO__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_TRANCHE_METEO__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_TRANCHE_METEO__APOUR_CARACTERISTIQUE_ELEMENT_METEO:
				return aPourCaracteristiqueElementMeteo != null && !aPourCaracteristiqueElementMeteo.isEmpty();
			case SchemaPackage.TYPE_TRANCHE_METEO__CONCERNE_EVENEMENT_NRBC:
				return concerneEvenementNRBC != null;
			case SchemaPackage.TYPE_TRANCHE_METEO__CONCERNE_SYNTHESE_DETECTIONS:
				return concerneSyntheseDetections != null;
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
		result.append(" (gDHdebut: ");
		result.append(gDHdebut);
		result.append(", gDHfin: ");
		result.append(gDHfin);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeTrancheMeteoImpl
