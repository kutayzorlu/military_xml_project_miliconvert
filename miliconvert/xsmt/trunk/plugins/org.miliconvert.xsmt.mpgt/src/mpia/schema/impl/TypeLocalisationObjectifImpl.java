/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeDataTypeAltitudePression;
import mpia.meta.TypeDataTypeAngle;
import mpia.meta.TypeDataTypeLongueur;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCoordonneesLatLong;
import mpia.schema.TypeDictionaryDicoObjectifCiblageDeploiement;
import mpia.schema.TypeLocalisationObjectif;

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
 * An implementation of the model object '<em><b>Type Localisation Objectif</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeLocalisationObjectifImpl#getDeploiement <em>Deploiement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeLocalisationObjectifImpl#getAltitudeMoyenne <em>Altitude Moyenne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeLocalisationObjectifImpl#getGrandeDimension <em>Grande Dimension</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeLocalisationObjectifImpl#getPetiteDimension <em>Petite Dimension</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeLocalisationObjectifImpl#getGisementGrandeDimension <em>Gisement Grande Dimension</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeLocalisationObjectifImpl#getAPourPointReferenceCoordonneesLatLong <em>APour Point Reference Coordonnees Lat Long</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeLocalisationObjectifImpl extends EObjectImpl implements TypeLocalisationObjectif {
	/**
	 * The default value of the '{@link #getDeploiement() <em>Deploiement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploiement()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoObjectifCiblageDeploiement DEPLOIEMENT_EDEFAULT = TypeDictionaryDicoObjectifCiblageDeploiement.POINT;

	/**
	 * The cached value of the '{@link #getDeploiement() <em>Deploiement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploiement()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoObjectifCiblageDeploiement deploiement = DEPLOIEMENT_EDEFAULT;

	/**
	 * This is true if the Deploiement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean deploiementESet;

	/**
	 * The cached value of the '{@link #getAltitudeMoyenne() <em>Altitude Moyenne</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitudeMoyenne()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeAltitudePression altitudeMoyenne;

	/**
	 * The cached value of the '{@link #getGrandeDimension() <em>Grande Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrandeDimension()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur grandeDimension;

	/**
	 * The cached value of the '{@link #getPetiteDimension() <em>Petite Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPetiteDimension()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur petiteDimension;

	/**
	 * The cached value of the '{@link #getGisementGrandeDimension() <em>Gisement Grande Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGisementGrandeDimension()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeAngle gisementGrandeDimension;

	/**
	 * The cached value of the '{@link #getAPourPointReferenceCoordonneesLatLong() <em>APour Point Reference Coordonnees Lat Long</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourPointReferenceCoordonneesLatLong()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeCoordonneesLatLong> aPourPointReferenceCoordonneesLatLong;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeLocalisationObjectifImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeLocalisationObjectif();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoObjectifCiblageDeploiement getDeploiement() {
		return deploiement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeploiement(TypeDictionaryDicoObjectifCiblageDeploiement newDeploiement) {
		TypeDictionaryDicoObjectifCiblageDeploiement oldDeploiement = deploiement;
		deploiement = newDeploiement == null ? DEPLOIEMENT_EDEFAULT : newDeploiement;
		boolean oldDeploiementESet = deploiementESet;
		deploiementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LOCALISATION_OBJECTIF__DEPLOIEMENT, oldDeploiement, deploiement, !oldDeploiementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDeploiement() {
		TypeDictionaryDicoObjectifCiblageDeploiement oldDeploiement = deploiement;
		boolean oldDeploiementESet = deploiementESet;
		deploiement = DEPLOIEMENT_EDEFAULT;
		deploiementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_LOCALISATION_OBJECTIF__DEPLOIEMENT, oldDeploiement, DEPLOIEMENT_EDEFAULT, oldDeploiementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDeploiement() {
		return deploiementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeAltitudePression getAltitudeMoyenne() {
		return altitudeMoyenne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAltitudeMoyenne(TypeDataTypeAltitudePression newAltitudeMoyenne, NotificationChain msgs) {
		TypeDataTypeAltitudePression oldAltitudeMoyenne = altitudeMoyenne;
		altitudeMoyenne = newAltitudeMoyenne;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LOCALISATION_OBJECTIF__ALTITUDE_MOYENNE, oldAltitudeMoyenne, newAltitudeMoyenne);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAltitudeMoyenne(TypeDataTypeAltitudePression newAltitudeMoyenne) {
		if (newAltitudeMoyenne != altitudeMoyenne) {
			NotificationChain msgs = null;
			if (altitudeMoyenne != null)
				msgs = ((InternalEObject)altitudeMoyenne).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_LOCALISATION_OBJECTIF__ALTITUDE_MOYENNE, null, msgs);
			if (newAltitudeMoyenne != null)
				msgs = ((InternalEObject)newAltitudeMoyenne).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_LOCALISATION_OBJECTIF__ALTITUDE_MOYENNE, null, msgs);
			msgs = basicSetAltitudeMoyenne(newAltitudeMoyenne, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LOCALISATION_OBJECTIF__ALTITUDE_MOYENNE, newAltitudeMoyenne, newAltitudeMoyenne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getGrandeDimension() {
		return grandeDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGrandeDimension(TypeDataTypeLongueur newGrandeDimension, NotificationChain msgs) {
		TypeDataTypeLongueur oldGrandeDimension = grandeDimension;
		grandeDimension = newGrandeDimension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LOCALISATION_OBJECTIF__GRANDE_DIMENSION, oldGrandeDimension, newGrandeDimension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrandeDimension(TypeDataTypeLongueur newGrandeDimension) {
		if (newGrandeDimension != grandeDimension) {
			NotificationChain msgs = null;
			if (grandeDimension != null)
				msgs = ((InternalEObject)grandeDimension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_LOCALISATION_OBJECTIF__GRANDE_DIMENSION, null, msgs);
			if (newGrandeDimension != null)
				msgs = ((InternalEObject)newGrandeDimension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_LOCALISATION_OBJECTIF__GRANDE_DIMENSION, null, msgs);
			msgs = basicSetGrandeDimension(newGrandeDimension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LOCALISATION_OBJECTIF__GRANDE_DIMENSION, newGrandeDimension, newGrandeDimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getPetiteDimension() {
		return petiteDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPetiteDimension(TypeDataTypeLongueur newPetiteDimension, NotificationChain msgs) {
		TypeDataTypeLongueur oldPetiteDimension = petiteDimension;
		petiteDimension = newPetiteDimension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LOCALISATION_OBJECTIF__PETITE_DIMENSION, oldPetiteDimension, newPetiteDimension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPetiteDimension(TypeDataTypeLongueur newPetiteDimension) {
		if (newPetiteDimension != petiteDimension) {
			NotificationChain msgs = null;
			if (petiteDimension != null)
				msgs = ((InternalEObject)petiteDimension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_LOCALISATION_OBJECTIF__PETITE_DIMENSION, null, msgs);
			if (newPetiteDimension != null)
				msgs = ((InternalEObject)newPetiteDimension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_LOCALISATION_OBJECTIF__PETITE_DIMENSION, null, msgs);
			msgs = basicSetPetiteDimension(newPetiteDimension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LOCALISATION_OBJECTIF__PETITE_DIMENSION, newPetiteDimension, newPetiteDimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeAngle getGisementGrandeDimension() {
		return gisementGrandeDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGisementGrandeDimension(TypeDataTypeAngle newGisementGrandeDimension, NotificationChain msgs) {
		TypeDataTypeAngle oldGisementGrandeDimension = gisementGrandeDimension;
		gisementGrandeDimension = newGisementGrandeDimension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LOCALISATION_OBJECTIF__GISEMENT_GRANDE_DIMENSION, oldGisementGrandeDimension, newGisementGrandeDimension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGisementGrandeDimension(TypeDataTypeAngle newGisementGrandeDimension) {
		if (newGisementGrandeDimension != gisementGrandeDimension) {
			NotificationChain msgs = null;
			if (gisementGrandeDimension != null)
				msgs = ((InternalEObject)gisementGrandeDimension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_LOCALISATION_OBJECTIF__GISEMENT_GRANDE_DIMENSION, null, msgs);
			if (newGisementGrandeDimension != null)
				msgs = ((InternalEObject)newGisementGrandeDimension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_LOCALISATION_OBJECTIF__GISEMENT_GRANDE_DIMENSION, null, msgs);
			msgs = basicSetGisementGrandeDimension(newGisementGrandeDimension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LOCALISATION_OBJECTIF__GISEMENT_GRANDE_DIMENSION, newGisementGrandeDimension, newGisementGrandeDimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeCoordonneesLatLong> getAPourPointReferenceCoordonneesLatLong() {
		if (aPourPointReferenceCoordonneesLatLong == null) {
			aPourPointReferenceCoordonneesLatLong = new EObjectContainmentEList<TypeCoordonneesLatLong>(TypeCoordonneesLatLong.class, this, SchemaPackage.TYPE_LOCALISATION_OBJECTIF__APOUR_POINT_REFERENCE_COORDONNEES_LAT_LONG);
		}
		return aPourPointReferenceCoordonneesLatLong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_LOCALISATION_OBJECTIF__ALTITUDE_MOYENNE:
				return basicSetAltitudeMoyenne(null, msgs);
			case SchemaPackage.TYPE_LOCALISATION_OBJECTIF__GRANDE_DIMENSION:
				return basicSetGrandeDimension(null, msgs);
			case SchemaPackage.TYPE_LOCALISATION_OBJECTIF__PETITE_DIMENSION:
				return basicSetPetiteDimension(null, msgs);
			case SchemaPackage.TYPE_LOCALISATION_OBJECTIF__GISEMENT_GRANDE_DIMENSION:
				return basicSetGisementGrandeDimension(null, msgs);
			case SchemaPackage.TYPE_LOCALISATION_OBJECTIF__APOUR_POINT_REFERENCE_COORDONNEES_LAT_LONG:
				return ((InternalEList<?>)getAPourPointReferenceCoordonneesLatLong()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_LOCALISATION_OBJECTIF__DEPLOIEMENT:
				return getDeploiement();
			case SchemaPackage.TYPE_LOCALISATION_OBJECTIF__ALTITUDE_MOYENNE:
				return getAltitudeMoyenne();
			case SchemaPackage.TYPE_LOCALISATION_OBJECTIF__GRANDE_DIMENSION:
				return getGrandeDimension();
			case SchemaPackage.TYPE_LOCALISATION_OBJECTIF__PETITE_DIMENSION:
				return getPetiteDimension();
			case SchemaPackage.TYPE_LOCALISATION_OBJECTIF__GISEMENT_GRANDE_DIMENSION:
				return getGisementGrandeDimension();
			case SchemaPackage.TYPE_LOCALISATION_OBJECTIF__APOUR_POINT_REFERENCE_COORDONNEES_LAT_LONG:
				return getAPourPointReferenceCoordonneesLatLong();
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
			case SchemaPackage.TYPE_LOCALISATION_OBJECTIF__DEPLOIEMENT:
				setDeploiement((TypeDictionaryDicoObjectifCiblageDeploiement)newValue);
				return;
			case SchemaPackage.TYPE_LOCALISATION_OBJECTIF__ALTITUDE_MOYENNE:
				setAltitudeMoyenne((TypeDataTypeAltitudePression)newValue);
				return;
			case SchemaPackage.TYPE_LOCALISATION_OBJECTIF__GRANDE_DIMENSION:
				setGrandeDimension((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_LOCALISATION_OBJECTIF__PETITE_DIMENSION:
				setPetiteDimension((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_LOCALISATION_OBJECTIF__GISEMENT_GRANDE_DIMENSION:
				setGisementGrandeDimension((TypeDataTypeAngle)newValue);
				return;
			case SchemaPackage.TYPE_LOCALISATION_OBJECTIF__APOUR_POINT_REFERENCE_COORDONNEES_LAT_LONG:
				getAPourPointReferenceCoordonneesLatLong().clear();
				getAPourPointReferenceCoordonneesLatLong().addAll((Collection<? extends TypeCoordonneesLatLong>)newValue);
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
			case SchemaPackage.TYPE_LOCALISATION_OBJECTIF__DEPLOIEMENT:
				unsetDeploiement();
				return;
			case SchemaPackage.TYPE_LOCALISATION_OBJECTIF__ALTITUDE_MOYENNE:
				setAltitudeMoyenne((TypeDataTypeAltitudePression)null);
				return;
			case SchemaPackage.TYPE_LOCALISATION_OBJECTIF__GRANDE_DIMENSION:
				setGrandeDimension((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_LOCALISATION_OBJECTIF__PETITE_DIMENSION:
				setPetiteDimension((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_LOCALISATION_OBJECTIF__GISEMENT_GRANDE_DIMENSION:
				setGisementGrandeDimension((TypeDataTypeAngle)null);
				return;
			case SchemaPackage.TYPE_LOCALISATION_OBJECTIF__APOUR_POINT_REFERENCE_COORDONNEES_LAT_LONG:
				getAPourPointReferenceCoordonneesLatLong().clear();
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
			case SchemaPackage.TYPE_LOCALISATION_OBJECTIF__DEPLOIEMENT:
				return isSetDeploiement();
			case SchemaPackage.TYPE_LOCALISATION_OBJECTIF__ALTITUDE_MOYENNE:
				return altitudeMoyenne != null;
			case SchemaPackage.TYPE_LOCALISATION_OBJECTIF__GRANDE_DIMENSION:
				return grandeDimension != null;
			case SchemaPackage.TYPE_LOCALISATION_OBJECTIF__PETITE_DIMENSION:
				return petiteDimension != null;
			case SchemaPackage.TYPE_LOCALISATION_OBJECTIF__GISEMENT_GRANDE_DIMENSION:
				return gisementGrandeDimension != null;
			case SchemaPackage.TYPE_LOCALISATION_OBJECTIF__APOUR_POINT_REFERENCE_COORDONNEES_LAT_LONG:
				return aPourPointReferenceCoordonneesLatLong != null && !aPourPointReferenceCoordonneesLatLong.isEmpty();
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
		result.append(" (deploiement: ");
		if (deploiementESet) result.append(deploiement); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeLocalisationObjectifImpl
