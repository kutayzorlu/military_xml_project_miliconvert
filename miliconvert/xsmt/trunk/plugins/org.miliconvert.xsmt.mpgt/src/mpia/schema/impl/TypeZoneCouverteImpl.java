/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeLongueur;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeLocalisationGeometrique2D;
import mpia.schema.TypeZoneCouverte;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Zone Couverte</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeZoneCouverteImpl#getHauteur <em>Hauteur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeZoneCouverteImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeZoneCouverteImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeZoneCouverteImpl#getConcerneLocalisationGeometrique2D <em>Concerne Localisation Geometrique2 D</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeZoneCouverteImpl extends EObjectImpl implements TypeZoneCouverte {
	/**
	 * The cached value of the '{@link #getHauteur() <em>Hauteur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHauteur()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur hauteur;

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
	 * The cached value of the '{@link #getConcerneLocalisationGeometrique2D() <em>Concerne Localisation Geometrique2 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneLocalisationGeometrique2D()
	 * @generated
	 * @ordered
	 */
	protected TypeLocalisationGeometrique2D concerneLocalisationGeometrique2D;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeZoneCouverteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeZoneCouverte();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getHauteur() {
		return hauteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHauteur(TypeDataTypeLongueur newHauteur, NotificationChain msgs) {
		TypeDataTypeLongueur oldHauteur = hauteur;
		hauteur = newHauteur;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_COUVERTE__HAUTEUR, oldHauteur, newHauteur);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHauteur(TypeDataTypeLongueur newHauteur) {
		if (newHauteur != hauteur) {
			NotificationChain msgs = null;
			if (hauteur != null)
				msgs = ((InternalEObject)hauteur).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ZONE_COUVERTE__HAUTEUR, null, msgs);
			if (newHauteur != null)
				msgs = ((InternalEObject)newHauteur).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ZONE_COUVERTE__HAUTEUR, null, msgs);
			msgs = basicSetHauteur(newHauteur, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_COUVERTE__HAUTEUR, newHauteur, newHauteur));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_COUVERTE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_COUVERTE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeLocalisationGeometrique2D getConcerneLocalisationGeometrique2D() {
		return concerneLocalisationGeometrique2D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcerneLocalisationGeometrique2D(TypeLocalisationGeometrique2D newConcerneLocalisationGeometrique2D, NotificationChain msgs) {
		TypeLocalisationGeometrique2D oldConcerneLocalisationGeometrique2D = concerneLocalisationGeometrique2D;
		concerneLocalisationGeometrique2D = newConcerneLocalisationGeometrique2D;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_COUVERTE__CONCERNE_LOCALISATION_GEOMETRIQUE2_D, oldConcerneLocalisationGeometrique2D, newConcerneLocalisationGeometrique2D);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcerneLocalisationGeometrique2D(TypeLocalisationGeometrique2D newConcerneLocalisationGeometrique2D) {
		if (newConcerneLocalisationGeometrique2D != concerneLocalisationGeometrique2D) {
			NotificationChain msgs = null;
			if (concerneLocalisationGeometrique2D != null)
				msgs = ((InternalEObject)concerneLocalisationGeometrique2D).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ZONE_COUVERTE__CONCERNE_LOCALISATION_GEOMETRIQUE2_D, null, msgs);
			if (newConcerneLocalisationGeometrique2D != null)
				msgs = ((InternalEObject)newConcerneLocalisationGeometrique2D).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ZONE_COUVERTE__CONCERNE_LOCALISATION_GEOMETRIQUE2_D, null, msgs);
			msgs = basicSetConcerneLocalisationGeometrique2D(newConcerneLocalisationGeometrique2D, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_COUVERTE__CONCERNE_LOCALISATION_GEOMETRIQUE2_D, newConcerneLocalisationGeometrique2D, newConcerneLocalisationGeometrique2D));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ZONE_COUVERTE__HAUTEUR:
				return basicSetHauteur(null, msgs);
			case SchemaPackage.TYPE_ZONE_COUVERTE__CONCERNE_LOCALISATION_GEOMETRIQUE2_D:
				return basicSetConcerneLocalisationGeometrique2D(null, msgs);
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
			case SchemaPackage.TYPE_ZONE_COUVERTE__HAUTEUR:
				return getHauteur();
			case SchemaPackage.TYPE_ZONE_COUVERTE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ZONE_COUVERTE__CE:
				return getCE();
			case SchemaPackage.TYPE_ZONE_COUVERTE__CONCERNE_LOCALISATION_GEOMETRIQUE2_D:
				return getConcerneLocalisationGeometrique2D();
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
			case SchemaPackage.TYPE_ZONE_COUVERTE__HAUTEUR:
				setHauteur((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_ZONE_COUVERTE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ZONE_COUVERTE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ZONE_COUVERTE__CONCERNE_LOCALISATION_GEOMETRIQUE2_D:
				setConcerneLocalisationGeometrique2D((TypeLocalisationGeometrique2D)newValue);
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
			case SchemaPackage.TYPE_ZONE_COUVERTE__HAUTEUR:
				setHauteur((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_ZONE_COUVERTE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ZONE_COUVERTE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ZONE_COUVERTE__CONCERNE_LOCALISATION_GEOMETRIQUE2_D:
				setConcerneLocalisationGeometrique2D((TypeLocalisationGeometrique2D)null);
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
			case SchemaPackage.TYPE_ZONE_COUVERTE__HAUTEUR:
				return hauteur != null;
			case SchemaPackage.TYPE_ZONE_COUVERTE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ZONE_COUVERTE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ZONE_COUVERTE__CONCERNE_LOCALISATION_GEOMETRIQUE2_D:
				return concerneLocalisationGeometrique2D != null;
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

} //TypeZoneCouverteImpl
