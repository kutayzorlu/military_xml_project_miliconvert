/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeMoyensNiveau4;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Moyens Niveau4</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMoyensNiveau4Impl#getHopitaux <em>Hopitaux</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyensNiveau4Impl#getPointsAccueil <em>Points Accueil</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyensNiveau4Impl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyensNiveau4Impl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyensNiveau4Impl#getAPourNationaliteEntitePolitique <em>APour Nationalite Entite Politique</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMoyensNiveau4Impl extends EObjectImpl implements TypeMoyensNiveau4 {
	/**
	 * The default value of the '{@link #getHopitaux() <em>Hopitaux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHopitaux()
	 * @generated
	 * @ordered
	 */
	protected static final String HOPITAUX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHopitaux() <em>Hopitaux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHopitaux()
	 * @generated
	 * @ordered
	 */
	protected String hopitaux = HOPITAUX_EDEFAULT;

	/**
	 * The default value of the '{@link #getPointsAccueil() <em>Points Accueil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointsAccueil()
	 * @generated
	 * @ordered
	 */
	protected static final String POINTS_ACCUEIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPointsAccueil() <em>Points Accueil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointsAccueil()
	 * @generated
	 * @ordered
	 */
	protected String pointsAccueil = POINTS_ACCUEIL_EDEFAULT;

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
	 * The cached value of the '{@link #getAPourNationaliteEntitePolitique() <em>APour Nationalite Entite Politique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourNationaliteEntitePolitique()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourNationaliteEntitePolitique;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMoyensNiveau4Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMoyensNiveau4();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHopitaux() {
		return hopitaux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHopitaux(String newHopitaux) {
		String oldHopitaux = hopitaux;
		hopitaux = newHopitaux;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYENS_NIVEAU4__HOPITAUX, oldHopitaux, hopitaux));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPointsAccueil() {
		return pointsAccueil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointsAccueil(String newPointsAccueil) {
		String oldPointsAccueil = pointsAccueil;
		pointsAccueil = newPointsAccueil;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYENS_NIVEAU4__POINTS_ACCUEIL, oldPointsAccueil, pointsAccueil));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYENS_NIVEAU4__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYENS_NIVEAU4__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourNationaliteEntitePolitique() {
		return aPourNationaliteEntitePolitique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourNationaliteEntitePolitique(TypeAssociation newAPourNationaliteEntitePolitique, NotificationChain msgs) {
		TypeAssociation oldAPourNationaliteEntitePolitique = aPourNationaliteEntitePolitique;
		aPourNationaliteEntitePolitique = newAPourNationaliteEntitePolitique;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYENS_NIVEAU4__APOUR_NATIONALITE_ENTITE_POLITIQUE, oldAPourNationaliteEntitePolitique, newAPourNationaliteEntitePolitique);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourNationaliteEntitePolitique(TypeAssociation newAPourNationaliteEntitePolitique) {
		if (newAPourNationaliteEntitePolitique != aPourNationaliteEntitePolitique) {
			NotificationChain msgs = null;
			if (aPourNationaliteEntitePolitique != null)
				msgs = ((InternalEObject)aPourNationaliteEntitePolitique).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MOYENS_NIVEAU4__APOUR_NATIONALITE_ENTITE_POLITIQUE, null, msgs);
			if (newAPourNationaliteEntitePolitique != null)
				msgs = ((InternalEObject)newAPourNationaliteEntitePolitique).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MOYENS_NIVEAU4__APOUR_NATIONALITE_ENTITE_POLITIQUE, null, msgs);
			msgs = basicSetAPourNationaliteEntitePolitique(newAPourNationaliteEntitePolitique, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYENS_NIVEAU4__APOUR_NATIONALITE_ENTITE_POLITIQUE, newAPourNationaliteEntitePolitique, newAPourNationaliteEntitePolitique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MOYENS_NIVEAU4__APOUR_NATIONALITE_ENTITE_POLITIQUE:
				return basicSetAPourNationaliteEntitePolitique(null, msgs);
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
			case SchemaPackage.TYPE_MOYENS_NIVEAU4__HOPITAUX:
				return getHopitaux();
			case SchemaPackage.TYPE_MOYENS_NIVEAU4__POINTS_ACCUEIL:
				return getPointsAccueil();
			case SchemaPackage.TYPE_MOYENS_NIVEAU4__CTE:
				return getCTE();
			case SchemaPackage.TYPE_MOYENS_NIVEAU4__CE:
				return getCE();
			case SchemaPackage.TYPE_MOYENS_NIVEAU4__APOUR_NATIONALITE_ENTITE_POLITIQUE:
				return getAPourNationaliteEntitePolitique();
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
			case SchemaPackage.TYPE_MOYENS_NIVEAU4__HOPITAUX:
				setHopitaux((String)newValue);
				return;
			case SchemaPackage.TYPE_MOYENS_NIVEAU4__POINTS_ACCUEIL:
				setPointsAccueil((String)newValue);
				return;
			case SchemaPackage.TYPE_MOYENS_NIVEAU4__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_MOYENS_NIVEAU4__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_MOYENS_NIVEAU4__APOUR_NATIONALITE_ENTITE_POLITIQUE:
				setAPourNationaliteEntitePolitique((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_MOYENS_NIVEAU4__HOPITAUX:
				setHopitaux(HOPITAUX_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MOYENS_NIVEAU4__POINTS_ACCUEIL:
				setPointsAccueil(POINTS_ACCUEIL_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MOYENS_NIVEAU4__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MOYENS_NIVEAU4__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MOYENS_NIVEAU4__APOUR_NATIONALITE_ENTITE_POLITIQUE:
				setAPourNationaliteEntitePolitique((TypeAssociation)null);
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
			case SchemaPackage.TYPE_MOYENS_NIVEAU4__HOPITAUX:
				return HOPITAUX_EDEFAULT == null ? hopitaux != null : !HOPITAUX_EDEFAULT.equals(hopitaux);
			case SchemaPackage.TYPE_MOYENS_NIVEAU4__POINTS_ACCUEIL:
				return POINTS_ACCUEIL_EDEFAULT == null ? pointsAccueil != null : !POINTS_ACCUEIL_EDEFAULT.equals(pointsAccueil);
			case SchemaPackage.TYPE_MOYENS_NIVEAU4__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_MOYENS_NIVEAU4__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_MOYENS_NIVEAU4__APOUR_NATIONALITE_ENTITE_POLITIQUE:
				return aPourNationaliteEntitePolitique != null;
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
		result.append(" (hopitaux: ");
		result.append(hopitaux);
		result.append(", pointsAccueil: ");
		result.append(pointsAccueil);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeMoyensNiveau4Impl
