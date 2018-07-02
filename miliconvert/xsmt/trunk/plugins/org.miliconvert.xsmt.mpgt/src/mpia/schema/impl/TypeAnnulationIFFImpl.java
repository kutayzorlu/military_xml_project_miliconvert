/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAnnulationIFF;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Annulation IFF</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAnnulationIFFImpl#getGDHdebutAnnulation <em>GD Hdebut Annulation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAnnulationIFFImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAnnulationIFFImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAnnulationIFFImpl#getPorteSurServiceReseau <em>Porte Sur Service Reseau</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAnnulationIFFImpl extends EObjectImpl implements TypeAnnulationIFF {
	/**
	 * The default value of the '{@link #getGDHdebutAnnulation() <em>GD Hdebut Annulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHdebutAnnulation()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GD_HDEBUT_ANNULATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGDHdebutAnnulation() <em>GD Hdebut Annulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHdebutAnnulation()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gDHdebutAnnulation = GD_HDEBUT_ANNULATION_EDEFAULT;

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
	 * The cached value of the '{@link #getPorteSurServiceReseau() <em>Porte Sur Service Reseau</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorteSurServiceReseau()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation porteSurServiceReseau;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAnnulationIFFImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAnnulationIFF();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getGDHdebutAnnulation() {
		return gDHdebutAnnulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGDHdebutAnnulation(XMLGregorianCalendar newGDHdebutAnnulation) {
		XMLGregorianCalendar oldGDHdebutAnnulation = gDHdebutAnnulation;
		gDHdebutAnnulation = newGDHdebutAnnulation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ANNULATION_IFF__GD_HDEBUT_ANNULATION, oldGDHdebutAnnulation, gDHdebutAnnulation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ANNULATION_IFF__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ANNULATION_IFF__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getPorteSurServiceReseau() {
		return porteSurServiceReseau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPorteSurServiceReseau(TypeAssociation newPorteSurServiceReseau, NotificationChain msgs) {
		TypeAssociation oldPorteSurServiceReseau = porteSurServiceReseau;
		porteSurServiceReseau = newPorteSurServiceReseau;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ANNULATION_IFF__PORTE_SUR_SERVICE_RESEAU, oldPorteSurServiceReseau, newPorteSurServiceReseau);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPorteSurServiceReseau(TypeAssociation newPorteSurServiceReseau) {
		if (newPorteSurServiceReseau != porteSurServiceReseau) {
			NotificationChain msgs = null;
			if (porteSurServiceReseau != null)
				msgs = ((InternalEObject)porteSurServiceReseau).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ANNULATION_IFF__PORTE_SUR_SERVICE_RESEAU, null, msgs);
			if (newPorteSurServiceReseau != null)
				msgs = ((InternalEObject)newPorteSurServiceReseau).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ANNULATION_IFF__PORTE_SUR_SERVICE_RESEAU, null, msgs);
			msgs = basicSetPorteSurServiceReseau(newPorteSurServiceReseau, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ANNULATION_IFF__PORTE_SUR_SERVICE_RESEAU, newPorteSurServiceReseau, newPorteSurServiceReseau));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ANNULATION_IFF__PORTE_SUR_SERVICE_RESEAU:
				return basicSetPorteSurServiceReseau(null, msgs);
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
			case SchemaPackage.TYPE_ANNULATION_IFF__GD_HDEBUT_ANNULATION:
				return getGDHdebutAnnulation();
			case SchemaPackage.TYPE_ANNULATION_IFF__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ANNULATION_IFF__CE:
				return getCE();
			case SchemaPackage.TYPE_ANNULATION_IFF__PORTE_SUR_SERVICE_RESEAU:
				return getPorteSurServiceReseau();
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
			case SchemaPackage.TYPE_ANNULATION_IFF__GD_HDEBUT_ANNULATION:
				setGDHdebutAnnulation((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_ANNULATION_IFF__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ANNULATION_IFF__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ANNULATION_IFF__PORTE_SUR_SERVICE_RESEAU:
				setPorteSurServiceReseau((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ANNULATION_IFF__GD_HDEBUT_ANNULATION:
				setGDHdebutAnnulation(GD_HDEBUT_ANNULATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ANNULATION_IFF__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ANNULATION_IFF__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ANNULATION_IFF__PORTE_SUR_SERVICE_RESEAU:
				setPorteSurServiceReseau((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ANNULATION_IFF__GD_HDEBUT_ANNULATION:
				return GD_HDEBUT_ANNULATION_EDEFAULT == null ? gDHdebutAnnulation != null : !GD_HDEBUT_ANNULATION_EDEFAULT.equals(gDHdebutAnnulation);
			case SchemaPackage.TYPE_ANNULATION_IFF__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ANNULATION_IFF__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ANNULATION_IFF__PORTE_SUR_SERVICE_RESEAU:
				return porteSurServiceReseau != null;
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
		result.append(" (gDHdebutAnnulation: ");
		result.append(gDHdebutAnnulation);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeAnnulationIFFImpl
