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
import mpia.schema.TypeSecteurAngulaireGeometrique;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Secteur Angulaire Geometrique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeSecteurAngulaireGeometriqueImpl#getRayonGauche <em>Rayon Gauche</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSecteurAngulaireGeometriqueImpl#getRayonDroit <em>Rayon Droit</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSecteurAngulaireGeometriqueImpl#getLimiteGauche <em>Limite Gauche</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSecteurAngulaireGeometriqueImpl#getGisementDroit <em>Gisement Droit</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSecteurAngulaireGeometriqueImpl#getAPourOrigineCoordonneesLatLong <em>APour Origine Coordonnees Lat Long</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeSecteurAngulaireGeometriqueImpl extends TypeObjetGeometriqueImpl implements TypeSecteurAngulaireGeometrique {
	/**
	 * The cached value of the '{@link #getRayonGauche() <em>Rayon Gauche</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRayonGauche()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur rayonGauche;

	/**
	 * The cached value of the '{@link #getRayonDroit() <em>Rayon Droit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRayonDroit()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur rayonDroit;

	/**
	 * The cached value of the '{@link #getLimiteGauche() <em>Limite Gauche</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimiteGauche()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeAngle limiteGauche;

	/**
	 * The cached value of the '{@link #getGisementDroit() <em>Gisement Droit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGisementDroit()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeAngle gisementDroit;

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
	protected TypeSecteurAngulaireGeometriqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeSecteurAngulaireGeometrique();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getRayonGauche() {
		return rayonGauche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRayonGauche(TypeDataTypeLongueur newRayonGauche, NotificationChain msgs) {
		TypeDataTypeLongueur oldRayonGauche = rayonGauche;
		rayonGauche = newRayonGauche;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SECTEUR_ANGULAIRE_GEOMETRIQUE__RAYON_GAUCHE, oldRayonGauche, newRayonGauche);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRayonGauche(TypeDataTypeLongueur newRayonGauche) {
		if (newRayonGauche != rayonGauche) {
			NotificationChain msgs = null;
			if (rayonGauche != null)
				msgs = ((InternalEObject)rayonGauche).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SECTEUR_ANGULAIRE_GEOMETRIQUE__RAYON_GAUCHE, null, msgs);
			if (newRayonGauche != null)
				msgs = ((InternalEObject)newRayonGauche).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SECTEUR_ANGULAIRE_GEOMETRIQUE__RAYON_GAUCHE, null, msgs);
			msgs = basicSetRayonGauche(newRayonGauche, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SECTEUR_ANGULAIRE_GEOMETRIQUE__RAYON_GAUCHE, newRayonGauche, newRayonGauche));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getRayonDroit() {
		return rayonDroit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRayonDroit(TypeDataTypeLongueur newRayonDroit, NotificationChain msgs) {
		TypeDataTypeLongueur oldRayonDroit = rayonDroit;
		rayonDroit = newRayonDroit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SECTEUR_ANGULAIRE_GEOMETRIQUE__RAYON_DROIT, oldRayonDroit, newRayonDroit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRayonDroit(TypeDataTypeLongueur newRayonDroit) {
		if (newRayonDroit != rayonDroit) {
			NotificationChain msgs = null;
			if (rayonDroit != null)
				msgs = ((InternalEObject)rayonDroit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SECTEUR_ANGULAIRE_GEOMETRIQUE__RAYON_DROIT, null, msgs);
			if (newRayonDroit != null)
				msgs = ((InternalEObject)newRayonDroit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SECTEUR_ANGULAIRE_GEOMETRIQUE__RAYON_DROIT, null, msgs);
			msgs = basicSetRayonDroit(newRayonDroit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SECTEUR_ANGULAIRE_GEOMETRIQUE__RAYON_DROIT, newRayonDroit, newRayonDroit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeAngle getLimiteGauche() {
		return limiteGauche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLimiteGauche(TypeDataTypeAngle newLimiteGauche, NotificationChain msgs) {
		TypeDataTypeAngle oldLimiteGauche = limiteGauche;
		limiteGauche = newLimiteGauche;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SECTEUR_ANGULAIRE_GEOMETRIQUE__LIMITE_GAUCHE, oldLimiteGauche, newLimiteGauche);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimiteGauche(TypeDataTypeAngle newLimiteGauche) {
		if (newLimiteGauche != limiteGauche) {
			NotificationChain msgs = null;
			if (limiteGauche != null)
				msgs = ((InternalEObject)limiteGauche).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SECTEUR_ANGULAIRE_GEOMETRIQUE__LIMITE_GAUCHE, null, msgs);
			if (newLimiteGauche != null)
				msgs = ((InternalEObject)newLimiteGauche).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SECTEUR_ANGULAIRE_GEOMETRIQUE__LIMITE_GAUCHE, null, msgs);
			msgs = basicSetLimiteGauche(newLimiteGauche, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SECTEUR_ANGULAIRE_GEOMETRIQUE__LIMITE_GAUCHE, newLimiteGauche, newLimiteGauche));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeAngle getGisementDroit() {
		return gisementDroit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGisementDroit(TypeDataTypeAngle newGisementDroit, NotificationChain msgs) {
		TypeDataTypeAngle oldGisementDroit = gisementDroit;
		gisementDroit = newGisementDroit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SECTEUR_ANGULAIRE_GEOMETRIQUE__GISEMENT_DROIT, oldGisementDroit, newGisementDroit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGisementDroit(TypeDataTypeAngle newGisementDroit) {
		if (newGisementDroit != gisementDroit) {
			NotificationChain msgs = null;
			if (gisementDroit != null)
				msgs = ((InternalEObject)gisementDroit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SECTEUR_ANGULAIRE_GEOMETRIQUE__GISEMENT_DROIT, null, msgs);
			if (newGisementDroit != null)
				msgs = ((InternalEObject)newGisementDroit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SECTEUR_ANGULAIRE_GEOMETRIQUE__GISEMENT_DROIT, null, msgs);
			msgs = basicSetGisementDroit(newGisementDroit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SECTEUR_ANGULAIRE_GEOMETRIQUE__GISEMENT_DROIT, newGisementDroit, newGisementDroit));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SECTEUR_ANGULAIRE_GEOMETRIQUE__APOUR_ORIGINE_COORDONNEES_LAT_LONG, oldAPourOrigineCoordonneesLatLong, newAPourOrigineCoordonneesLatLong);
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
				msgs = ((InternalEObject)aPourOrigineCoordonneesLatLong).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SECTEUR_ANGULAIRE_GEOMETRIQUE__APOUR_ORIGINE_COORDONNEES_LAT_LONG, null, msgs);
			if (newAPourOrigineCoordonneesLatLong != null)
				msgs = ((InternalEObject)newAPourOrigineCoordonneesLatLong).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SECTEUR_ANGULAIRE_GEOMETRIQUE__APOUR_ORIGINE_COORDONNEES_LAT_LONG, null, msgs);
			msgs = basicSetAPourOrigineCoordonneesLatLong(newAPourOrigineCoordonneesLatLong, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SECTEUR_ANGULAIRE_GEOMETRIQUE__APOUR_ORIGINE_COORDONNEES_LAT_LONG, newAPourOrigineCoordonneesLatLong, newAPourOrigineCoordonneesLatLong));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_SECTEUR_ANGULAIRE_GEOMETRIQUE__RAYON_GAUCHE:
				return basicSetRayonGauche(null, msgs);
			case SchemaPackage.TYPE_SECTEUR_ANGULAIRE_GEOMETRIQUE__RAYON_DROIT:
				return basicSetRayonDroit(null, msgs);
			case SchemaPackage.TYPE_SECTEUR_ANGULAIRE_GEOMETRIQUE__LIMITE_GAUCHE:
				return basicSetLimiteGauche(null, msgs);
			case SchemaPackage.TYPE_SECTEUR_ANGULAIRE_GEOMETRIQUE__GISEMENT_DROIT:
				return basicSetGisementDroit(null, msgs);
			case SchemaPackage.TYPE_SECTEUR_ANGULAIRE_GEOMETRIQUE__APOUR_ORIGINE_COORDONNEES_LAT_LONG:
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
			case SchemaPackage.TYPE_SECTEUR_ANGULAIRE_GEOMETRIQUE__RAYON_GAUCHE:
				return getRayonGauche();
			case SchemaPackage.TYPE_SECTEUR_ANGULAIRE_GEOMETRIQUE__RAYON_DROIT:
				return getRayonDroit();
			case SchemaPackage.TYPE_SECTEUR_ANGULAIRE_GEOMETRIQUE__LIMITE_GAUCHE:
				return getLimiteGauche();
			case SchemaPackage.TYPE_SECTEUR_ANGULAIRE_GEOMETRIQUE__GISEMENT_DROIT:
				return getGisementDroit();
			case SchemaPackage.TYPE_SECTEUR_ANGULAIRE_GEOMETRIQUE__APOUR_ORIGINE_COORDONNEES_LAT_LONG:
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
			case SchemaPackage.TYPE_SECTEUR_ANGULAIRE_GEOMETRIQUE__RAYON_GAUCHE:
				setRayonGauche((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_SECTEUR_ANGULAIRE_GEOMETRIQUE__RAYON_DROIT:
				setRayonDroit((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_SECTEUR_ANGULAIRE_GEOMETRIQUE__LIMITE_GAUCHE:
				setLimiteGauche((TypeDataTypeAngle)newValue);
				return;
			case SchemaPackage.TYPE_SECTEUR_ANGULAIRE_GEOMETRIQUE__GISEMENT_DROIT:
				setGisementDroit((TypeDataTypeAngle)newValue);
				return;
			case SchemaPackage.TYPE_SECTEUR_ANGULAIRE_GEOMETRIQUE__APOUR_ORIGINE_COORDONNEES_LAT_LONG:
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
			case SchemaPackage.TYPE_SECTEUR_ANGULAIRE_GEOMETRIQUE__RAYON_GAUCHE:
				setRayonGauche((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_SECTEUR_ANGULAIRE_GEOMETRIQUE__RAYON_DROIT:
				setRayonDroit((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_SECTEUR_ANGULAIRE_GEOMETRIQUE__LIMITE_GAUCHE:
				setLimiteGauche((TypeDataTypeAngle)null);
				return;
			case SchemaPackage.TYPE_SECTEUR_ANGULAIRE_GEOMETRIQUE__GISEMENT_DROIT:
				setGisementDroit((TypeDataTypeAngle)null);
				return;
			case SchemaPackage.TYPE_SECTEUR_ANGULAIRE_GEOMETRIQUE__APOUR_ORIGINE_COORDONNEES_LAT_LONG:
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
			case SchemaPackage.TYPE_SECTEUR_ANGULAIRE_GEOMETRIQUE__RAYON_GAUCHE:
				return rayonGauche != null;
			case SchemaPackage.TYPE_SECTEUR_ANGULAIRE_GEOMETRIQUE__RAYON_DROIT:
				return rayonDroit != null;
			case SchemaPackage.TYPE_SECTEUR_ANGULAIRE_GEOMETRIQUE__LIMITE_GAUCHE:
				return limiteGauche != null;
			case SchemaPackage.TYPE_SECTEUR_ANGULAIRE_GEOMETRIQUE__GISEMENT_DROIT:
				return gisementDroit != null;
			case SchemaPackage.TYPE_SECTEUR_ANGULAIRE_GEOMETRIQUE__APOUR_ORIGINE_COORDONNEES_LAT_LONG:
				return aPourOrigineCoordonneesLatLong != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeSecteurAngulaireGeometriqueImpl
