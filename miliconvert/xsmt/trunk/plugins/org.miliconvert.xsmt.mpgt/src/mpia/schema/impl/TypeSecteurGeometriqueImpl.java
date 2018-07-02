/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeAngle;
import mpia.meta.TypeDataTypeLongueur;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCoordonneesLatLong;
import mpia.schema.TypeSecteurGeometrique;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Secteur Geometrique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeSecteurGeometriqueImpl#getRayonMinimal <em>Rayon Minimal</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSecteurGeometriqueImpl#getRayonMaximal <em>Rayon Maximal</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSecteurGeometriqueImpl#getLargeurAngulaire <em>Largeur Angulaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSecteurGeometriqueImpl#getAngleAvecNord <em>Angle Avec Nord</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSecteurGeometriqueImpl#getAPourOrigineCoordonneesLatLong <em>APour Origine Coordonnees Lat Long</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeSecteurGeometriqueImpl extends TypeObjetGeometriqueImpl implements TypeSecteurGeometrique {
	/**
	 * The cached value of the '{@link #getRayonMinimal() <em>Rayon Minimal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRayonMinimal()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur rayonMinimal;

	/**
	 * The cached value of the '{@link #getRayonMaximal() <em>Rayon Maximal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRayonMaximal()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur rayonMaximal;

	/**
	 * The cached value of the '{@link #getLargeurAngulaire() <em>Largeur Angulaire</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargeurAngulaire()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeAngle largeurAngulaire;

	/**
	 * The cached value of the '{@link #getAngleAvecNord() <em>Angle Avec Nord</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleAvecNord()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeAngle angleAvecNord;

	/**
	 * The cached value of the '{@link #getAPourOrigineCoordonneesLatLong() <em>APour Origine Coordonnees Lat Long</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourOrigineCoordonneesLatLong()
	 * @generated
	 * @ordered
	 */
	protected TypeCoordonneesLatLong aPourOrigineCoordonneesLatLong;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeSecteurGeometriqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeSecteurGeometrique();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getRayonMinimal() {
		return rayonMinimal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRayonMinimal(TypeDataTypeLongueur newRayonMinimal, NotificationChain msgs) {
		TypeDataTypeLongueur oldRayonMinimal = rayonMinimal;
		rayonMinimal = newRayonMinimal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SECTEUR_GEOMETRIQUE__RAYON_MINIMAL, oldRayonMinimal, newRayonMinimal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRayonMinimal(TypeDataTypeLongueur newRayonMinimal) {
		if (newRayonMinimal != rayonMinimal) {
			NotificationChain msgs = null;
			if (rayonMinimal != null)
				msgs = ((InternalEObject)rayonMinimal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SECTEUR_GEOMETRIQUE__RAYON_MINIMAL, null, msgs);
			if (newRayonMinimal != null)
				msgs = ((InternalEObject)newRayonMinimal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SECTEUR_GEOMETRIQUE__RAYON_MINIMAL, null, msgs);
			msgs = basicSetRayonMinimal(newRayonMinimal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SECTEUR_GEOMETRIQUE__RAYON_MINIMAL, newRayonMinimal, newRayonMinimal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getRayonMaximal() {
		return rayonMaximal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRayonMaximal(TypeDataTypeLongueur newRayonMaximal, NotificationChain msgs) {
		TypeDataTypeLongueur oldRayonMaximal = rayonMaximal;
		rayonMaximal = newRayonMaximal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SECTEUR_GEOMETRIQUE__RAYON_MAXIMAL, oldRayonMaximal, newRayonMaximal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRayonMaximal(TypeDataTypeLongueur newRayonMaximal) {
		if (newRayonMaximal != rayonMaximal) {
			NotificationChain msgs = null;
			if (rayonMaximal != null)
				msgs = ((InternalEObject)rayonMaximal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SECTEUR_GEOMETRIQUE__RAYON_MAXIMAL, null, msgs);
			if (newRayonMaximal != null)
				msgs = ((InternalEObject)newRayonMaximal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SECTEUR_GEOMETRIQUE__RAYON_MAXIMAL, null, msgs);
			msgs = basicSetRayonMaximal(newRayonMaximal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SECTEUR_GEOMETRIQUE__RAYON_MAXIMAL, newRayonMaximal, newRayonMaximal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeAngle getLargeurAngulaire() {
		return largeurAngulaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLargeurAngulaire(TypeDataTypeAngle newLargeurAngulaire, NotificationChain msgs) {
		TypeDataTypeAngle oldLargeurAngulaire = largeurAngulaire;
		largeurAngulaire = newLargeurAngulaire;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SECTEUR_GEOMETRIQUE__LARGEUR_ANGULAIRE, oldLargeurAngulaire, newLargeurAngulaire);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLargeurAngulaire(TypeDataTypeAngle newLargeurAngulaire) {
		if (newLargeurAngulaire != largeurAngulaire) {
			NotificationChain msgs = null;
			if (largeurAngulaire != null)
				msgs = ((InternalEObject)largeurAngulaire).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SECTEUR_GEOMETRIQUE__LARGEUR_ANGULAIRE, null, msgs);
			if (newLargeurAngulaire != null)
				msgs = ((InternalEObject)newLargeurAngulaire).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SECTEUR_GEOMETRIQUE__LARGEUR_ANGULAIRE, null, msgs);
			msgs = basicSetLargeurAngulaire(newLargeurAngulaire, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SECTEUR_GEOMETRIQUE__LARGEUR_ANGULAIRE, newLargeurAngulaire, newLargeurAngulaire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeAngle getAngleAvecNord() {
		return angleAvecNord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngleAvecNord(TypeDataTypeAngle newAngleAvecNord, NotificationChain msgs) {
		TypeDataTypeAngle oldAngleAvecNord = angleAvecNord;
		angleAvecNord = newAngleAvecNord;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SECTEUR_GEOMETRIQUE__ANGLE_AVEC_NORD, oldAngleAvecNord, newAngleAvecNord);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngleAvecNord(TypeDataTypeAngle newAngleAvecNord) {
		if (newAngleAvecNord != angleAvecNord) {
			NotificationChain msgs = null;
			if (angleAvecNord != null)
				msgs = ((InternalEObject)angleAvecNord).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SECTEUR_GEOMETRIQUE__ANGLE_AVEC_NORD, null, msgs);
			if (newAngleAvecNord != null)
				msgs = ((InternalEObject)newAngleAvecNord).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SECTEUR_GEOMETRIQUE__ANGLE_AVEC_NORD, null, msgs);
			msgs = basicSetAngleAvecNord(newAngleAvecNord, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SECTEUR_GEOMETRIQUE__ANGLE_AVEC_NORD, newAngleAvecNord, newAngleAvecNord));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeCoordonneesLatLong getAPourOrigineCoordonneesLatLong() {
		return aPourOrigineCoordonneesLatLong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourOrigineCoordonneesLatLong(TypeCoordonneesLatLong newAPourOrigineCoordonneesLatLong, NotificationChain msgs) {
		TypeCoordonneesLatLong oldAPourOrigineCoordonneesLatLong = aPourOrigineCoordonneesLatLong;
		aPourOrigineCoordonneesLatLong = newAPourOrigineCoordonneesLatLong;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SECTEUR_GEOMETRIQUE__APOUR_ORIGINE_COORDONNEES_LAT_LONG, oldAPourOrigineCoordonneesLatLong, newAPourOrigineCoordonneesLatLong);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourOrigineCoordonneesLatLong(TypeCoordonneesLatLong newAPourOrigineCoordonneesLatLong) {
		if (newAPourOrigineCoordonneesLatLong != aPourOrigineCoordonneesLatLong) {
			NotificationChain msgs = null;
			if (aPourOrigineCoordonneesLatLong != null)
				msgs = ((InternalEObject)aPourOrigineCoordonneesLatLong).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SECTEUR_GEOMETRIQUE__APOUR_ORIGINE_COORDONNEES_LAT_LONG, null, msgs);
			if (newAPourOrigineCoordonneesLatLong != null)
				msgs = ((InternalEObject)newAPourOrigineCoordonneesLatLong).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SECTEUR_GEOMETRIQUE__APOUR_ORIGINE_COORDONNEES_LAT_LONG, null, msgs);
			msgs = basicSetAPourOrigineCoordonneesLatLong(newAPourOrigineCoordonneesLatLong, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SECTEUR_GEOMETRIQUE__APOUR_ORIGINE_COORDONNEES_LAT_LONG, newAPourOrigineCoordonneesLatLong, newAPourOrigineCoordonneesLatLong));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_SECTEUR_GEOMETRIQUE__RAYON_MINIMAL:
				return basicSetRayonMinimal(null, msgs);
			case SchemaPackage.TYPE_SECTEUR_GEOMETRIQUE__RAYON_MAXIMAL:
				return basicSetRayonMaximal(null, msgs);
			case SchemaPackage.TYPE_SECTEUR_GEOMETRIQUE__LARGEUR_ANGULAIRE:
				return basicSetLargeurAngulaire(null, msgs);
			case SchemaPackage.TYPE_SECTEUR_GEOMETRIQUE__ANGLE_AVEC_NORD:
				return basicSetAngleAvecNord(null, msgs);
			case SchemaPackage.TYPE_SECTEUR_GEOMETRIQUE__APOUR_ORIGINE_COORDONNEES_LAT_LONG:
				return basicSetAPourOrigineCoordonneesLatLong(null, msgs);
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
			case SchemaPackage.TYPE_SECTEUR_GEOMETRIQUE__RAYON_MINIMAL:
				return getRayonMinimal();
			case SchemaPackage.TYPE_SECTEUR_GEOMETRIQUE__RAYON_MAXIMAL:
				return getRayonMaximal();
			case SchemaPackage.TYPE_SECTEUR_GEOMETRIQUE__LARGEUR_ANGULAIRE:
				return getLargeurAngulaire();
			case SchemaPackage.TYPE_SECTEUR_GEOMETRIQUE__ANGLE_AVEC_NORD:
				return getAngleAvecNord();
			case SchemaPackage.TYPE_SECTEUR_GEOMETRIQUE__APOUR_ORIGINE_COORDONNEES_LAT_LONG:
				return getAPourOrigineCoordonneesLatLong();
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
			case SchemaPackage.TYPE_SECTEUR_GEOMETRIQUE__RAYON_MINIMAL:
				setRayonMinimal((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_SECTEUR_GEOMETRIQUE__RAYON_MAXIMAL:
				setRayonMaximal((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_SECTEUR_GEOMETRIQUE__LARGEUR_ANGULAIRE:
				setLargeurAngulaire((TypeDataTypeAngle)newValue);
				return;
			case SchemaPackage.TYPE_SECTEUR_GEOMETRIQUE__ANGLE_AVEC_NORD:
				setAngleAvecNord((TypeDataTypeAngle)newValue);
				return;
			case SchemaPackage.TYPE_SECTEUR_GEOMETRIQUE__APOUR_ORIGINE_COORDONNEES_LAT_LONG:
				setAPourOrigineCoordonneesLatLong((TypeCoordonneesLatLong)newValue);
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
			case SchemaPackage.TYPE_SECTEUR_GEOMETRIQUE__RAYON_MINIMAL:
				setRayonMinimal((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_SECTEUR_GEOMETRIQUE__RAYON_MAXIMAL:
				setRayonMaximal((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_SECTEUR_GEOMETRIQUE__LARGEUR_ANGULAIRE:
				setLargeurAngulaire((TypeDataTypeAngle)null);
				return;
			case SchemaPackage.TYPE_SECTEUR_GEOMETRIQUE__ANGLE_AVEC_NORD:
				setAngleAvecNord((TypeDataTypeAngle)null);
				return;
			case SchemaPackage.TYPE_SECTEUR_GEOMETRIQUE__APOUR_ORIGINE_COORDONNEES_LAT_LONG:
				setAPourOrigineCoordonneesLatLong((TypeCoordonneesLatLong)null);
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
			case SchemaPackage.TYPE_SECTEUR_GEOMETRIQUE__RAYON_MINIMAL:
				return rayonMinimal != null;
			case SchemaPackage.TYPE_SECTEUR_GEOMETRIQUE__RAYON_MAXIMAL:
				return rayonMaximal != null;
			case SchemaPackage.TYPE_SECTEUR_GEOMETRIQUE__LARGEUR_ANGULAIRE:
				return largeurAngulaire != null;
			case SchemaPackage.TYPE_SECTEUR_GEOMETRIQUE__ANGLE_AVEC_NORD:
				return angleAvecNord != null;
			case SchemaPackage.TYPE_SECTEUR_GEOMETRIQUE__APOUR_ORIGINE_COORDONNEES_LAT_LONG:
				return aPourOrigineCoordonneesLatLong != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeSecteurGeometriqueImpl
