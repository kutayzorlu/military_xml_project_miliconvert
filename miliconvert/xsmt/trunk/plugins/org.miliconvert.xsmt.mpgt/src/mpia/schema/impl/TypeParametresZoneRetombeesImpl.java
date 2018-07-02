/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeAngle;
import mpia.meta.TypeDataTypeLongueur;
import mpia.meta.TypeDataTypeVitesseLineaire;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeParametresZoneRetombees;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Parametres Zone Retombees</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeParametresZoneRetombeesImpl#getLigneRadialeDroite <em>Ligne Radiale Droite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeParametresZoneRetombeesImpl#getDistanceZone1 <em>Distance Zone1</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeParametresZoneRetombeesImpl#getLigneRadialeGauche <em>Ligne Radiale Gauche</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeParametresZoneRetombeesImpl#getRayonNuage <em>Rayon Nuage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeParametresZoneRetombeesImpl#getVitesseVentResultant <em>Vitesse Vent Resultant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeParametresZoneRetombeesImpl extends EObjectImpl implements TypeParametresZoneRetombees {
	/**
	 * The cached value of the '{@link #getLigneRadialeDroite() <em>Ligne Radiale Droite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLigneRadialeDroite()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeAngle ligneRadialeDroite;

	/**
	 * The cached value of the '{@link #getDistanceZone1() <em>Distance Zone1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceZone1()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur distanceZone1;

	/**
	 * The cached value of the '{@link #getLigneRadialeGauche() <em>Ligne Radiale Gauche</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLigneRadialeGauche()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeAngle ligneRadialeGauche;

	/**
	 * The cached value of the '{@link #getRayonNuage() <em>Rayon Nuage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRayonNuage()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur rayonNuage;

	/**
	 * The cached value of the '{@link #getVitesseVentResultant() <em>Vitesse Vent Resultant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesseVentResultant()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeVitesseLineaire vitesseVentResultant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeParametresZoneRetombeesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeParametresZoneRetombees();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeAngle getLigneRadialeDroite() {
		return ligneRadialeDroite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLigneRadialeDroite(TypeDataTypeAngle newLigneRadialeDroite, NotificationChain msgs) {
		TypeDataTypeAngle oldLigneRadialeDroite = ligneRadialeDroite;
		ligneRadialeDroite = newLigneRadialeDroite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PARAMETRES_ZONE_RETOMBEES__LIGNE_RADIALE_DROITE, oldLigneRadialeDroite, newLigneRadialeDroite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLigneRadialeDroite(TypeDataTypeAngle newLigneRadialeDroite) {
		if (newLigneRadialeDroite != ligneRadialeDroite) {
			NotificationChain msgs = null;
			if (ligneRadialeDroite != null)
				msgs = ((InternalEObject)ligneRadialeDroite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PARAMETRES_ZONE_RETOMBEES__LIGNE_RADIALE_DROITE, null, msgs);
			if (newLigneRadialeDroite != null)
				msgs = ((InternalEObject)newLigneRadialeDroite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PARAMETRES_ZONE_RETOMBEES__LIGNE_RADIALE_DROITE, null, msgs);
			msgs = basicSetLigneRadialeDroite(newLigneRadialeDroite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PARAMETRES_ZONE_RETOMBEES__LIGNE_RADIALE_DROITE, newLigneRadialeDroite, newLigneRadialeDroite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getDistanceZone1() {
		return distanceZone1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDistanceZone1(TypeDataTypeLongueur newDistanceZone1, NotificationChain msgs) {
		TypeDataTypeLongueur oldDistanceZone1 = distanceZone1;
		distanceZone1 = newDistanceZone1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PARAMETRES_ZONE_RETOMBEES__DISTANCE_ZONE1, oldDistanceZone1, newDistanceZone1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistanceZone1(TypeDataTypeLongueur newDistanceZone1) {
		if (newDistanceZone1 != distanceZone1) {
			NotificationChain msgs = null;
			if (distanceZone1 != null)
				msgs = ((InternalEObject)distanceZone1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PARAMETRES_ZONE_RETOMBEES__DISTANCE_ZONE1, null, msgs);
			if (newDistanceZone1 != null)
				msgs = ((InternalEObject)newDistanceZone1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PARAMETRES_ZONE_RETOMBEES__DISTANCE_ZONE1, null, msgs);
			msgs = basicSetDistanceZone1(newDistanceZone1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PARAMETRES_ZONE_RETOMBEES__DISTANCE_ZONE1, newDistanceZone1, newDistanceZone1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeAngle getLigneRadialeGauche() {
		return ligneRadialeGauche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLigneRadialeGauche(TypeDataTypeAngle newLigneRadialeGauche, NotificationChain msgs) {
		TypeDataTypeAngle oldLigneRadialeGauche = ligneRadialeGauche;
		ligneRadialeGauche = newLigneRadialeGauche;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PARAMETRES_ZONE_RETOMBEES__LIGNE_RADIALE_GAUCHE, oldLigneRadialeGauche, newLigneRadialeGauche);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLigneRadialeGauche(TypeDataTypeAngle newLigneRadialeGauche) {
		if (newLigneRadialeGauche != ligneRadialeGauche) {
			NotificationChain msgs = null;
			if (ligneRadialeGauche != null)
				msgs = ((InternalEObject)ligneRadialeGauche).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PARAMETRES_ZONE_RETOMBEES__LIGNE_RADIALE_GAUCHE, null, msgs);
			if (newLigneRadialeGauche != null)
				msgs = ((InternalEObject)newLigneRadialeGauche).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PARAMETRES_ZONE_RETOMBEES__LIGNE_RADIALE_GAUCHE, null, msgs);
			msgs = basicSetLigneRadialeGauche(newLigneRadialeGauche, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PARAMETRES_ZONE_RETOMBEES__LIGNE_RADIALE_GAUCHE, newLigneRadialeGauche, newLigneRadialeGauche));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getRayonNuage() {
		return rayonNuage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRayonNuage(TypeDataTypeLongueur newRayonNuage, NotificationChain msgs) {
		TypeDataTypeLongueur oldRayonNuage = rayonNuage;
		rayonNuage = newRayonNuage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PARAMETRES_ZONE_RETOMBEES__RAYON_NUAGE, oldRayonNuage, newRayonNuage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRayonNuage(TypeDataTypeLongueur newRayonNuage) {
		if (newRayonNuage != rayonNuage) {
			NotificationChain msgs = null;
			if (rayonNuage != null)
				msgs = ((InternalEObject)rayonNuage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PARAMETRES_ZONE_RETOMBEES__RAYON_NUAGE, null, msgs);
			if (newRayonNuage != null)
				msgs = ((InternalEObject)newRayonNuage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PARAMETRES_ZONE_RETOMBEES__RAYON_NUAGE, null, msgs);
			msgs = basicSetRayonNuage(newRayonNuage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PARAMETRES_ZONE_RETOMBEES__RAYON_NUAGE, newRayonNuage, newRayonNuage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeVitesseLineaire getVitesseVentResultant() {
		return vitesseVentResultant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVitesseVentResultant(TypeDataTypeVitesseLineaire newVitesseVentResultant, NotificationChain msgs) {
		TypeDataTypeVitesseLineaire oldVitesseVentResultant = vitesseVentResultant;
		vitesseVentResultant = newVitesseVentResultant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PARAMETRES_ZONE_RETOMBEES__VITESSE_VENT_RESULTANT, oldVitesseVentResultant, newVitesseVentResultant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVitesseVentResultant(TypeDataTypeVitesseLineaire newVitesseVentResultant) {
		if (newVitesseVentResultant != vitesseVentResultant) {
			NotificationChain msgs = null;
			if (vitesseVentResultant != null)
				msgs = ((InternalEObject)vitesseVentResultant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PARAMETRES_ZONE_RETOMBEES__VITESSE_VENT_RESULTANT, null, msgs);
			if (newVitesseVentResultant != null)
				msgs = ((InternalEObject)newVitesseVentResultant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PARAMETRES_ZONE_RETOMBEES__VITESSE_VENT_RESULTANT, null, msgs);
			msgs = basicSetVitesseVentResultant(newVitesseVentResultant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PARAMETRES_ZONE_RETOMBEES__VITESSE_VENT_RESULTANT, newVitesseVentResultant, newVitesseVentResultant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_PARAMETRES_ZONE_RETOMBEES__LIGNE_RADIALE_DROITE:
				return basicSetLigneRadialeDroite(null, msgs);
			case SchemaPackage.TYPE_PARAMETRES_ZONE_RETOMBEES__DISTANCE_ZONE1:
				return basicSetDistanceZone1(null, msgs);
			case SchemaPackage.TYPE_PARAMETRES_ZONE_RETOMBEES__LIGNE_RADIALE_GAUCHE:
				return basicSetLigneRadialeGauche(null, msgs);
			case SchemaPackage.TYPE_PARAMETRES_ZONE_RETOMBEES__RAYON_NUAGE:
				return basicSetRayonNuage(null, msgs);
			case SchemaPackage.TYPE_PARAMETRES_ZONE_RETOMBEES__VITESSE_VENT_RESULTANT:
				return basicSetVitesseVentResultant(null, msgs);
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
			case SchemaPackage.TYPE_PARAMETRES_ZONE_RETOMBEES__LIGNE_RADIALE_DROITE:
				return getLigneRadialeDroite();
			case SchemaPackage.TYPE_PARAMETRES_ZONE_RETOMBEES__DISTANCE_ZONE1:
				return getDistanceZone1();
			case SchemaPackage.TYPE_PARAMETRES_ZONE_RETOMBEES__LIGNE_RADIALE_GAUCHE:
				return getLigneRadialeGauche();
			case SchemaPackage.TYPE_PARAMETRES_ZONE_RETOMBEES__RAYON_NUAGE:
				return getRayonNuage();
			case SchemaPackage.TYPE_PARAMETRES_ZONE_RETOMBEES__VITESSE_VENT_RESULTANT:
				return getVitesseVentResultant();
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
			case SchemaPackage.TYPE_PARAMETRES_ZONE_RETOMBEES__LIGNE_RADIALE_DROITE:
				setLigneRadialeDroite((TypeDataTypeAngle)newValue);
				return;
			case SchemaPackage.TYPE_PARAMETRES_ZONE_RETOMBEES__DISTANCE_ZONE1:
				setDistanceZone1((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_PARAMETRES_ZONE_RETOMBEES__LIGNE_RADIALE_GAUCHE:
				setLigneRadialeGauche((TypeDataTypeAngle)newValue);
				return;
			case SchemaPackage.TYPE_PARAMETRES_ZONE_RETOMBEES__RAYON_NUAGE:
				setRayonNuage((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_PARAMETRES_ZONE_RETOMBEES__VITESSE_VENT_RESULTANT:
				setVitesseVentResultant((TypeDataTypeVitesseLineaire)newValue);
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
			case SchemaPackage.TYPE_PARAMETRES_ZONE_RETOMBEES__LIGNE_RADIALE_DROITE:
				setLigneRadialeDroite((TypeDataTypeAngle)null);
				return;
			case SchemaPackage.TYPE_PARAMETRES_ZONE_RETOMBEES__DISTANCE_ZONE1:
				setDistanceZone1((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_PARAMETRES_ZONE_RETOMBEES__LIGNE_RADIALE_GAUCHE:
				setLigneRadialeGauche((TypeDataTypeAngle)null);
				return;
			case SchemaPackage.TYPE_PARAMETRES_ZONE_RETOMBEES__RAYON_NUAGE:
				setRayonNuage((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_PARAMETRES_ZONE_RETOMBEES__VITESSE_VENT_RESULTANT:
				setVitesseVentResultant((TypeDataTypeVitesseLineaire)null);
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
			case SchemaPackage.TYPE_PARAMETRES_ZONE_RETOMBEES__LIGNE_RADIALE_DROITE:
				return ligneRadialeDroite != null;
			case SchemaPackage.TYPE_PARAMETRES_ZONE_RETOMBEES__DISTANCE_ZONE1:
				return distanceZone1 != null;
			case SchemaPackage.TYPE_PARAMETRES_ZONE_RETOMBEES__LIGNE_RADIALE_GAUCHE:
				return ligneRadialeGauche != null;
			case SchemaPackage.TYPE_PARAMETRES_ZONE_RETOMBEES__RAYON_NUAGE:
				return rayonNuage != null;
			case SchemaPackage.TYPE_PARAMETRES_ZONE_RETOMBEES__VITESSE_VENT_RESULTANT:
				return vitesseVentResultant != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeParametresZoneRetombeesImpl
