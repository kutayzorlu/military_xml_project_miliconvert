/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeLongueur;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAirePisteGeometrique;
import mpia.schema.TypeCoordonneesLatLong;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Aire Piste Geometrique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAirePisteGeometriqueImpl#getLargeurDroite <em>Largeur Droite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAirePisteGeometriqueImpl#getLargeurGauche <em>Largeur Gauche</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAirePisteGeometriqueImpl#getAPourFinCoordonneesLatLong <em>APour Fin Coordonnees Lat Long</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAirePisteGeometriqueImpl#getAPourDebutCoordonneesLatLong <em>APour Debut Coordonnees Lat Long</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAirePisteGeometriqueImpl extends TypeObjetGeometriqueImpl implements TypeAirePisteGeometrique {
	/**
	 * The cached value of the '{@link #getLargeurDroite() <em>Largeur Droite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargeurDroite()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur largeurDroite;

	/**
	 * The cached value of the '{@link #getLargeurGauche() <em>Largeur Gauche</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargeurGauche()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur largeurGauche;

	/**
	 * The cached value of the '{@link #getAPourFinCoordonneesLatLong() <em>APour Fin Coordonnees Lat Long</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourFinCoordonneesLatLong()
	 * @generated
	 * @ordered
	 */
	protected TypeCoordonneesLatLong aPourFinCoordonneesLatLong;

	/**
	 * The cached value of the '{@link #getAPourDebutCoordonneesLatLong() <em>APour Debut Coordonnees Lat Long</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourDebutCoordonneesLatLong()
	 * @generated
	 * @ordered
	 */
	protected TypeCoordonneesLatLong aPourDebutCoordonneesLatLong;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAirePisteGeometriqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAirePisteGeometrique();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getLargeurDroite() {
		return largeurDroite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLargeurDroite(TypeDataTypeLongueur newLargeurDroite, NotificationChain msgs) {
		TypeDataTypeLongueur oldLargeurDroite = largeurDroite;
		largeurDroite = newLargeurDroite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AIRE_PISTE_GEOMETRIQUE__LARGEUR_DROITE, oldLargeurDroite, newLargeurDroite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLargeurDroite(TypeDataTypeLongueur newLargeurDroite) {
		if (newLargeurDroite != largeurDroite) {
			NotificationChain msgs = null;
			if (largeurDroite != null)
				msgs = ((InternalEObject)largeurDroite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_AIRE_PISTE_GEOMETRIQUE__LARGEUR_DROITE, null, msgs);
			if (newLargeurDroite != null)
				msgs = ((InternalEObject)newLargeurDroite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_AIRE_PISTE_GEOMETRIQUE__LARGEUR_DROITE, null, msgs);
			msgs = basicSetLargeurDroite(newLargeurDroite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AIRE_PISTE_GEOMETRIQUE__LARGEUR_DROITE, newLargeurDroite, newLargeurDroite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getLargeurGauche() {
		return largeurGauche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLargeurGauche(TypeDataTypeLongueur newLargeurGauche, NotificationChain msgs) {
		TypeDataTypeLongueur oldLargeurGauche = largeurGauche;
		largeurGauche = newLargeurGauche;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AIRE_PISTE_GEOMETRIQUE__LARGEUR_GAUCHE, oldLargeurGauche, newLargeurGauche);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLargeurGauche(TypeDataTypeLongueur newLargeurGauche) {
		if (newLargeurGauche != largeurGauche) {
			NotificationChain msgs = null;
			if (largeurGauche != null)
				msgs = ((InternalEObject)largeurGauche).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_AIRE_PISTE_GEOMETRIQUE__LARGEUR_GAUCHE, null, msgs);
			if (newLargeurGauche != null)
				msgs = ((InternalEObject)newLargeurGauche).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_AIRE_PISTE_GEOMETRIQUE__LARGEUR_GAUCHE, null, msgs);
			msgs = basicSetLargeurGauche(newLargeurGauche, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AIRE_PISTE_GEOMETRIQUE__LARGEUR_GAUCHE, newLargeurGauche, newLargeurGauche));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeCoordonneesLatLong getAPourFinCoordonneesLatLong() {
		return aPourFinCoordonneesLatLong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourFinCoordonneesLatLong(TypeCoordonneesLatLong newAPourFinCoordonneesLatLong, NotificationChain msgs) {
		TypeCoordonneesLatLong oldAPourFinCoordonneesLatLong = aPourFinCoordonneesLatLong;
		aPourFinCoordonneesLatLong = newAPourFinCoordonneesLatLong;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AIRE_PISTE_GEOMETRIQUE__APOUR_FIN_COORDONNEES_LAT_LONG, oldAPourFinCoordonneesLatLong, newAPourFinCoordonneesLatLong);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourFinCoordonneesLatLong(TypeCoordonneesLatLong newAPourFinCoordonneesLatLong) {
		if (newAPourFinCoordonneesLatLong != aPourFinCoordonneesLatLong) {
			NotificationChain msgs = null;
			if (aPourFinCoordonneesLatLong != null)
				msgs = ((InternalEObject)aPourFinCoordonneesLatLong).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_AIRE_PISTE_GEOMETRIQUE__APOUR_FIN_COORDONNEES_LAT_LONG, null, msgs);
			if (newAPourFinCoordonneesLatLong != null)
				msgs = ((InternalEObject)newAPourFinCoordonneesLatLong).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_AIRE_PISTE_GEOMETRIQUE__APOUR_FIN_COORDONNEES_LAT_LONG, null, msgs);
			msgs = basicSetAPourFinCoordonneesLatLong(newAPourFinCoordonneesLatLong, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AIRE_PISTE_GEOMETRIQUE__APOUR_FIN_COORDONNEES_LAT_LONG, newAPourFinCoordonneesLatLong, newAPourFinCoordonneesLatLong));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeCoordonneesLatLong getAPourDebutCoordonneesLatLong() {
		return aPourDebutCoordonneesLatLong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourDebutCoordonneesLatLong(TypeCoordonneesLatLong newAPourDebutCoordonneesLatLong, NotificationChain msgs) {
		TypeCoordonneesLatLong oldAPourDebutCoordonneesLatLong = aPourDebutCoordonneesLatLong;
		aPourDebutCoordonneesLatLong = newAPourDebutCoordonneesLatLong;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AIRE_PISTE_GEOMETRIQUE__APOUR_DEBUT_COORDONNEES_LAT_LONG, oldAPourDebutCoordonneesLatLong, newAPourDebutCoordonneesLatLong);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourDebutCoordonneesLatLong(TypeCoordonneesLatLong newAPourDebutCoordonneesLatLong) {
		if (newAPourDebutCoordonneesLatLong != aPourDebutCoordonneesLatLong) {
			NotificationChain msgs = null;
			if (aPourDebutCoordonneesLatLong != null)
				msgs = ((InternalEObject)aPourDebutCoordonneesLatLong).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_AIRE_PISTE_GEOMETRIQUE__APOUR_DEBUT_COORDONNEES_LAT_LONG, null, msgs);
			if (newAPourDebutCoordonneesLatLong != null)
				msgs = ((InternalEObject)newAPourDebutCoordonneesLatLong).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_AIRE_PISTE_GEOMETRIQUE__APOUR_DEBUT_COORDONNEES_LAT_LONG, null, msgs);
			msgs = basicSetAPourDebutCoordonneesLatLong(newAPourDebutCoordonneesLatLong, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AIRE_PISTE_GEOMETRIQUE__APOUR_DEBUT_COORDONNEES_LAT_LONG, newAPourDebutCoordonneesLatLong, newAPourDebutCoordonneesLatLong));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_AIRE_PISTE_GEOMETRIQUE__LARGEUR_DROITE:
				return basicSetLargeurDroite(null, msgs);
			case SchemaPackage.TYPE_AIRE_PISTE_GEOMETRIQUE__LARGEUR_GAUCHE:
				return basicSetLargeurGauche(null, msgs);
			case SchemaPackage.TYPE_AIRE_PISTE_GEOMETRIQUE__APOUR_FIN_COORDONNEES_LAT_LONG:
				return basicSetAPourFinCoordonneesLatLong(null, msgs);
			case SchemaPackage.TYPE_AIRE_PISTE_GEOMETRIQUE__APOUR_DEBUT_COORDONNEES_LAT_LONG:
				return basicSetAPourDebutCoordonneesLatLong(null, msgs);
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
			case SchemaPackage.TYPE_AIRE_PISTE_GEOMETRIQUE__LARGEUR_DROITE:
				return getLargeurDroite();
			case SchemaPackage.TYPE_AIRE_PISTE_GEOMETRIQUE__LARGEUR_GAUCHE:
				return getLargeurGauche();
			case SchemaPackage.TYPE_AIRE_PISTE_GEOMETRIQUE__APOUR_FIN_COORDONNEES_LAT_LONG:
				return getAPourFinCoordonneesLatLong();
			case SchemaPackage.TYPE_AIRE_PISTE_GEOMETRIQUE__APOUR_DEBUT_COORDONNEES_LAT_LONG:
				return getAPourDebutCoordonneesLatLong();
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
			case SchemaPackage.TYPE_AIRE_PISTE_GEOMETRIQUE__LARGEUR_DROITE:
				setLargeurDroite((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_AIRE_PISTE_GEOMETRIQUE__LARGEUR_GAUCHE:
				setLargeurGauche((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_AIRE_PISTE_GEOMETRIQUE__APOUR_FIN_COORDONNEES_LAT_LONG:
				setAPourFinCoordonneesLatLong((TypeCoordonneesLatLong)newValue);
				return;
			case SchemaPackage.TYPE_AIRE_PISTE_GEOMETRIQUE__APOUR_DEBUT_COORDONNEES_LAT_LONG:
				setAPourDebutCoordonneesLatLong((TypeCoordonneesLatLong)newValue);
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
			case SchemaPackage.TYPE_AIRE_PISTE_GEOMETRIQUE__LARGEUR_DROITE:
				setLargeurDroite((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_AIRE_PISTE_GEOMETRIQUE__LARGEUR_GAUCHE:
				setLargeurGauche((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_AIRE_PISTE_GEOMETRIQUE__APOUR_FIN_COORDONNEES_LAT_LONG:
				setAPourFinCoordonneesLatLong((TypeCoordonneesLatLong)null);
				return;
			case SchemaPackage.TYPE_AIRE_PISTE_GEOMETRIQUE__APOUR_DEBUT_COORDONNEES_LAT_LONG:
				setAPourDebutCoordonneesLatLong((TypeCoordonneesLatLong)null);
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
			case SchemaPackage.TYPE_AIRE_PISTE_GEOMETRIQUE__LARGEUR_DROITE:
				return largeurDroite != null;
			case SchemaPackage.TYPE_AIRE_PISTE_GEOMETRIQUE__LARGEUR_GAUCHE:
				return largeurGauche != null;
			case SchemaPackage.TYPE_AIRE_PISTE_GEOMETRIQUE__APOUR_FIN_COORDONNEES_LAT_LONG:
				return aPourFinCoordonneesLatLong != null;
			case SchemaPackage.TYPE_AIRE_PISTE_GEOMETRIQUE__APOUR_DEBUT_COORDONNEES_LAT_LONG:
				return aPourDebutCoordonneesLatLong != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeAirePisteGeometriqueImpl
