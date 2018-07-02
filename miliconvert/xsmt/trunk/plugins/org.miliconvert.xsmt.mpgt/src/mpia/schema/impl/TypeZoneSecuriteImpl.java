/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociationEXT;
import mpia.meta.TypeDataTypeLongueur;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeLocalisationGeometrique2D;
import mpia.schema.TypeMobilite;
import mpia.schema.TypeZoneSecurite;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Zone Securite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeZoneSecuriteImpl#getDistanceSecurite <em>Distance Securite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeZoneSecuriteImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeZoneSecuriteImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeZoneSecuriteImpl#getEstCentreeEnLocalisationGeometrique2D <em>Est Centree En Localisation Geometrique2 D</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeZoneSecuriteImpl#getConcerneUnite <em>Concerne Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeZoneSecuriteImpl#getSeMeutSelonMobilite <em>Se Meut Selon Mobilite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeZoneSecuriteImpl extends EObjectImpl implements TypeZoneSecurite {
	/**
	 * The cached value of the '{@link #getDistanceSecurite() <em>Distance Securite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceSecurite()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur distanceSecurite;

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
	 * The cached value of the '{@link #getEstCentreeEnLocalisationGeometrique2D() <em>Est Centree En Localisation Geometrique2 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstCentreeEnLocalisationGeometrique2D()
	 * @generated
	 * @ordered
	 */
	protected TypeLocalisationGeometrique2D estCentreeEnLocalisationGeometrique2D;

	/**
	 * The cached value of the '{@link #getConcerneUnite() <em>Concerne Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT concerneUnite;

	/**
	 * The cached value of the '{@link #getSeMeutSelonMobilite() <em>Se Meut Selon Mobilite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeMeutSelonMobilite()
	 * @generated
	 * @ordered
	 */
	protected TypeMobilite seMeutSelonMobilite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeZoneSecuriteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeZoneSecurite();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getDistanceSecurite() {
		return distanceSecurite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDistanceSecurite(TypeDataTypeLongueur newDistanceSecurite, NotificationChain msgs) {
		TypeDataTypeLongueur oldDistanceSecurite = distanceSecurite;
		distanceSecurite = newDistanceSecurite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_SECURITE__DISTANCE_SECURITE, oldDistanceSecurite, newDistanceSecurite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistanceSecurite(TypeDataTypeLongueur newDistanceSecurite) {
		if (newDistanceSecurite != distanceSecurite) {
			NotificationChain msgs = null;
			if (distanceSecurite != null)
				msgs = ((InternalEObject)distanceSecurite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ZONE_SECURITE__DISTANCE_SECURITE, null, msgs);
			if (newDistanceSecurite != null)
				msgs = ((InternalEObject)newDistanceSecurite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ZONE_SECURITE__DISTANCE_SECURITE, null, msgs);
			msgs = basicSetDistanceSecurite(newDistanceSecurite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_SECURITE__DISTANCE_SECURITE, newDistanceSecurite, newDistanceSecurite));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_SECURITE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_SECURITE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeLocalisationGeometrique2D getEstCentreeEnLocalisationGeometrique2D() {
		return estCentreeEnLocalisationGeometrique2D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstCentreeEnLocalisationGeometrique2D(TypeLocalisationGeometrique2D newEstCentreeEnLocalisationGeometrique2D, NotificationChain msgs) {
		TypeLocalisationGeometrique2D oldEstCentreeEnLocalisationGeometrique2D = estCentreeEnLocalisationGeometrique2D;
		estCentreeEnLocalisationGeometrique2D = newEstCentreeEnLocalisationGeometrique2D;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_SECURITE__EST_CENTREE_EN_LOCALISATION_GEOMETRIQUE2_D, oldEstCentreeEnLocalisationGeometrique2D, newEstCentreeEnLocalisationGeometrique2D);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstCentreeEnLocalisationGeometrique2D(TypeLocalisationGeometrique2D newEstCentreeEnLocalisationGeometrique2D) {
		if (newEstCentreeEnLocalisationGeometrique2D != estCentreeEnLocalisationGeometrique2D) {
			NotificationChain msgs = null;
			if (estCentreeEnLocalisationGeometrique2D != null)
				msgs = ((InternalEObject)estCentreeEnLocalisationGeometrique2D).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ZONE_SECURITE__EST_CENTREE_EN_LOCALISATION_GEOMETRIQUE2_D, null, msgs);
			if (newEstCentreeEnLocalisationGeometrique2D != null)
				msgs = ((InternalEObject)newEstCentreeEnLocalisationGeometrique2D).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ZONE_SECURITE__EST_CENTREE_EN_LOCALISATION_GEOMETRIQUE2_D, null, msgs);
			msgs = basicSetEstCentreeEnLocalisationGeometrique2D(newEstCentreeEnLocalisationGeometrique2D, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_SECURITE__EST_CENTREE_EN_LOCALISATION_GEOMETRIQUE2_D, newEstCentreeEnLocalisationGeometrique2D, newEstCentreeEnLocalisationGeometrique2D));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getConcerneUnite() {
		return concerneUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcerneUnite(TypeAssociationEXT newConcerneUnite, NotificationChain msgs) {
		TypeAssociationEXT oldConcerneUnite = concerneUnite;
		concerneUnite = newConcerneUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_SECURITE__CONCERNE_UNITE, oldConcerneUnite, newConcerneUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcerneUnite(TypeAssociationEXT newConcerneUnite) {
		if (newConcerneUnite != concerneUnite) {
			NotificationChain msgs = null;
			if (concerneUnite != null)
				msgs = ((InternalEObject)concerneUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ZONE_SECURITE__CONCERNE_UNITE, null, msgs);
			if (newConcerneUnite != null)
				msgs = ((InternalEObject)newConcerneUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ZONE_SECURITE__CONCERNE_UNITE, null, msgs);
			msgs = basicSetConcerneUnite(newConcerneUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_SECURITE__CONCERNE_UNITE, newConcerneUnite, newConcerneUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeMobilite getSeMeutSelonMobilite() {
		return seMeutSelonMobilite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeMeutSelonMobilite(TypeMobilite newSeMeutSelonMobilite, NotificationChain msgs) {
		TypeMobilite oldSeMeutSelonMobilite = seMeutSelonMobilite;
		seMeutSelonMobilite = newSeMeutSelonMobilite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_SECURITE__SE_MEUT_SELON_MOBILITE, oldSeMeutSelonMobilite, newSeMeutSelonMobilite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeMeutSelonMobilite(TypeMobilite newSeMeutSelonMobilite) {
		if (newSeMeutSelonMobilite != seMeutSelonMobilite) {
			NotificationChain msgs = null;
			if (seMeutSelonMobilite != null)
				msgs = ((InternalEObject)seMeutSelonMobilite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ZONE_SECURITE__SE_MEUT_SELON_MOBILITE, null, msgs);
			if (newSeMeutSelonMobilite != null)
				msgs = ((InternalEObject)newSeMeutSelonMobilite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ZONE_SECURITE__SE_MEUT_SELON_MOBILITE, null, msgs);
			msgs = basicSetSeMeutSelonMobilite(newSeMeutSelonMobilite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_SECURITE__SE_MEUT_SELON_MOBILITE, newSeMeutSelonMobilite, newSeMeutSelonMobilite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ZONE_SECURITE__DISTANCE_SECURITE:
				return basicSetDistanceSecurite(null, msgs);
			case SchemaPackage.TYPE_ZONE_SECURITE__EST_CENTREE_EN_LOCALISATION_GEOMETRIQUE2_D:
				return basicSetEstCentreeEnLocalisationGeometrique2D(null, msgs);
			case SchemaPackage.TYPE_ZONE_SECURITE__CONCERNE_UNITE:
				return basicSetConcerneUnite(null, msgs);
			case SchemaPackage.TYPE_ZONE_SECURITE__SE_MEUT_SELON_MOBILITE:
				return basicSetSeMeutSelonMobilite(null, msgs);
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
			case SchemaPackage.TYPE_ZONE_SECURITE__DISTANCE_SECURITE:
				return getDistanceSecurite();
			case SchemaPackage.TYPE_ZONE_SECURITE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ZONE_SECURITE__CE:
				return getCE();
			case SchemaPackage.TYPE_ZONE_SECURITE__EST_CENTREE_EN_LOCALISATION_GEOMETRIQUE2_D:
				return getEstCentreeEnLocalisationGeometrique2D();
			case SchemaPackage.TYPE_ZONE_SECURITE__CONCERNE_UNITE:
				return getConcerneUnite();
			case SchemaPackage.TYPE_ZONE_SECURITE__SE_MEUT_SELON_MOBILITE:
				return getSeMeutSelonMobilite();
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
			case SchemaPackage.TYPE_ZONE_SECURITE__DISTANCE_SECURITE:
				setDistanceSecurite((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_ZONE_SECURITE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ZONE_SECURITE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ZONE_SECURITE__EST_CENTREE_EN_LOCALISATION_GEOMETRIQUE2_D:
				setEstCentreeEnLocalisationGeometrique2D((TypeLocalisationGeometrique2D)newValue);
				return;
			case SchemaPackage.TYPE_ZONE_SECURITE__CONCERNE_UNITE:
				setConcerneUnite((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_ZONE_SECURITE__SE_MEUT_SELON_MOBILITE:
				setSeMeutSelonMobilite((TypeMobilite)newValue);
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
			case SchemaPackage.TYPE_ZONE_SECURITE__DISTANCE_SECURITE:
				setDistanceSecurite((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_ZONE_SECURITE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ZONE_SECURITE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ZONE_SECURITE__EST_CENTREE_EN_LOCALISATION_GEOMETRIQUE2_D:
				setEstCentreeEnLocalisationGeometrique2D((TypeLocalisationGeometrique2D)null);
				return;
			case SchemaPackage.TYPE_ZONE_SECURITE__CONCERNE_UNITE:
				setConcerneUnite((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_ZONE_SECURITE__SE_MEUT_SELON_MOBILITE:
				setSeMeutSelonMobilite((TypeMobilite)null);
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
			case SchemaPackage.TYPE_ZONE_SECURITE__DISTANCE_SECURITE:
				return distanceSecurite != null;
			case SchemaPackage.TYPE_ZONE_SECURITE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ZONE_SECURITE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ZONE_SECURITE__EST_CENTREE_EN_LOCALISATION_GEOMETRIQUE2_D:
				return estCentreeEnLocalisationGeometrique2D != null;
			case SchemaPackage.TYPE_ZONE_SECURITE__CONCERNE_UNITE:
				return concerneUnite != null;
			case SchemaPackage.TYPE_ZONE_SECURITE__SE_MEUT_SELON_MOBILITE:
				return seMeutSelonMobilite != null;
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
		result.append(" (cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeZoneSecuriteImpl
