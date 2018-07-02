/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeConsigneGeographique;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Consigne Geographique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeConsigneGeographiqueImpl#getAdresseRadioAdresse <em>Adresse Radio Adresse</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsigneGeographiqueImpl#getEstConsigneTypeZoneZoneAlat <em>Est Consigne Type Zone Zone Alat</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsigneGeographiqueImpl#getEstConsigneTypeLigneAutreElementControle <em>Est Consigne Type Ligne Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsigneGeographiqueImpl#getEstConsigneTypeItineraireItineraireOuModeleCheminementALAT <em>Est Consigne Type Itineraire Itineraire Ou Modele Cheminement ALAT</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsigneGeographiqueImpl#getEstConsigneTypePointPointControle3D <em>Est Consigne Type Point Point Controle3 D</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsigneGeographiqueImpl#getEstConsigneTypeRouteRouteHelicoptereALAT <em>Est Consigne Type Route Route Helicoptere ALAT</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeConsigneGeographiqueImpl extends EObjectImpl implements TypeConsigneGeographique {
	/**
	 * The cached value of the '{@link #getAdresseRadioAdresse() <em>Adresse Radio Adresse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdresseRadioAdresse()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation adresseRadioAdresse;

	/**
	 * The cached value of the '{@link #getEstConsigneTypeZoneZoneAlat() <em>Est Consigne Type Zone Zone Alat</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstConsigneTypeZoneZoneAlat()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation estConsigneTypeZoneZoneAlat;

	/**
	 * The cached value of the '{@link #getEstConsigneTypeLigneAutreElementControle() <em>Est Consigne Type Ligne Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstConsigneTypeLigneAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation estConsigneTypeLigneAutreElementControle;

	/**
	 * The cached value of the '{@link #getEstConsigneTypeItineraireItineraireOuModeleCheminementALAT() <em>Est Consigne Type Itineraire Itineraire Ou Modele Cheminement ALAT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstConsigneTypeItineraireItineraireOuModeleCheminementALAT()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation estConsigneTypeItineraireItineraireOuModeleCheminementALAT;

	/**
	 * The cached value of the '{@link #getEstConsigneTypePointPointControle3D() <em>Est Consigne Type Point Point Controle3 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstConsigneTypePointPointControle3D()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation estConsigneTypePointPointControle3D;

	/**
	 * The cached value of the '{@link #getEstConsigneTypeRouteRouteHelicoptereALAT() <em>Est Consigne Type Route Route Helicoptere ALAT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstConsigneTypeRouteRouteHelicoptereALAT()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation estConsigneTypeRouteRouteHelicoptereALAT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeConsigneGeographiqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeConsigneGeographique();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAdresseRadioAdresse() {
		return adresseRadioAdresse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdresseRadioAdresse(TypeAssociation newAdresseRadioAdresse, NotificationChain msgs) {
		TypeAssociation oldAdresseRadioAdresse = adresseRadioAdresse;
		adresseRadioAdresse = newAdresseRadioAdresse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNE_GEOGRAPHIQUE__ADRESSE_RADIO_ADRESSE, oldAdresseRadioAdresse, newAdresseRadioAdresse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdresseRadioAdresse(TypeAssociation newAdresseRadioAdresse) {
		if (newAdresseRadioAdresse != adresseRadioAdresse) {
			NotificationChain msgs = null;
			if (adresseRadioAdresse != null)
				msgs = ((InternalEObject)adresseRadioAdresse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONSIGNE_GEOGRAPHIQUE__ADRESSE_RADIO_ADRESSE, null, msgs);
			if (newAdresseRadioAdresse != null)
				msgs = ((InternalEObject)newAdresseRadioAdresse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONSIGNE_GEOGRAPHIQUE__ADRESSE_RADIO_ADRESSE, null, msgs);
			msgs = basicSetAdresseRadioAdresse(newAdresseRadioAdresse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNE_GEOGRAPHIQUE__ADRESSE_RADIO_ADRESSE, newAdresseRadioAdresse, newAdresseRadioAdresse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getEstConsigneTypeZoneZoneAlat() {
		return estConsigneTypeZoneZoneAlat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstConsigneTypeZoneZoneAlat(TypeAssociation newEstConsigneTypeZoneZoneAlat, NotificationChain msgs) {
		TypeAssociation oldEstConsigneTypeZoneZoneAlat = estConsigneTypeZoneZoneAlat;
		estConsigneTypeZoneZoneAlat = newEstConsigneTypeZoneZoneAlat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNE_GEOGRAPHIQUE__EST_CONSIGNE_TYPE_ZONE_ZONE_ALAT, oldEstConsigneTypeZoneZoneAlat, newEstConsigneTypeZoneZoneAlat);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstConsigneTypeZoneZoneAlat(TypeAssociation newEstConsigneTypeZoneZoneAlat) {
		if (newEstConsigneTypeZoneZoneAlat != estConsigneTypeZoneZoneAlat) {
			NotificationChain msgs = null;
			if (estConsigneTypeZoneZoneAlat != null)
				msgs = ((InternalEObject)estConsigneTypeZoneZoneAlat).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONSIGNE_GEOGRAPHIQUE__EST_CONSIGNE_TYPE_ZONE_ZONE_ALAT, null, msgs);
			if (newEstConsigneTypeZoneZoneAlat != null)
				msgs = ((InternalEObject)newEstConsigneTypeZoneZoneAlat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONSIGNE_GEOGRAPHIQUE__EST_CONSIGNE_TYPE_ZONE_ZONE_ALAT, null, msgs);
			msgs = basicSetEstConsigneTypeZoneZoneAlat(newEstConsigneTypeZoneZoneAlat, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNE_GEOGRAPHIQUE__EST_CONSIGNE_TYPE_ZONE_ZONE_ALAT, newEstConsigneTypeZoneZoneAlat, newEstConsigneTypeZoneZoneAlat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getEstConsigneTypeLigneAutreElementControle() {
		return estConsigneTypeLigneAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstConsigneTypeLigneAutreElementControle(TypeAssociation newEstConsigneTypeLigneAutreElementControle, NotificationChain msgs) {
		TypeAssociation oldEstConsigneTypeLigneAutreElementControle = estConsigneTypeLigneAutreElementControle;
		estConsigneTypeLigneAutreElementControle = newEstConsigneTypeLigneAutreElementControle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNE_GEOGRAPHIQUE__EST_CONSIGNE_TYPE_LIGNE_AUTRE_ELEMENT_CONTROLE, oldEstConsigneTypeLigneAutreElementControle, newEstConsigneTypeLigneAutreElementControle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstConsigneTypeLigneAutreElementControle(TypeAssociation newEstConsigneTypeLigneAutreElementControle) {
		if (newEstConsigneTypeLigneAutreElementControle != estConsigneTypeLigneAutreElementControle) {
			NotificationChain msgs = null;
			if (estConsigneTypeLigneAutreElementControle != null)
				msgs = ((InternalEObject)estConsigneTypeLigneAutreElementControle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONSIGNE_GEOGRAPHIQUE__EST_CONSIGNE_TYPE_LIGNE_AUTRE_ELEMENT_CONTROLE, null, msgs);
			if (newEstConsigneTypeLigneAutreElementControle != null)
				msgs = ((InternalEObject)newEstConsigneTypeLigneAutreElementControle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONSIGNE_GEOGRAPHIQUE__EST_CONSIGNE_TYPE_LIGNE_AUTRE_ELEMENT_CONTROLE, null, msgs);
			msgs = basicSetEstConsigneTypeLigneAutreElementControle(newEstConsigneTypeLigneAutreElementControle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNE_GEOGRAPHIQUE__EST_CONSIGNE_TYPE_LIGNE_AUTRE_ELEMENT_CONTROLE, newEstConsigneTypeLigneAutreElementControle, newEstConsigneTypeLigneAutreElementControle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getEstConsigneTypeItineraireItineraireOuModeleCheminementALAT() {
		return estConsigneTypeItineraireItineraireOuModeleCheminementALAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstConsigneTypeItineraireItineraireOuModeleCheminementALAT(TypeAssociation newEstConsigneTypeItineraireItineraireOuModeleCheminementALAT, NotificationChain msgs) {
		TypeAssociation oldEstConsigneTypeItineraireItineraireOuModeleCheminementALAT = estConsigneTypeItineraireItineraireOuModeleCheminementALAT;
		estConsigneTypeItineraireItineraireOuModeleCheminementALAT = newEstConsigneTypeItineraireItineraireOuModeleCheminementALAT;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNE_GEOGRAPHIQUE__EST_CONSIGNE_TYPE_ITINERAIRE_ITINERAIRE_OU_MODELE_CHEMINEMENT_ALAT, oldEstConsigneTypeItineraireItineraireOuModeleCheminementALAT, newEstConsigneTypeItineraireItineraireOuModeleCheminementALAT);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstConsigneTypeItineraireItineraireOuModeleCheminementALAT(TypeAssociation newEstConsigneTypeItineraireItineraireOuModeleCheminementALAT) {
		if (newEstConsigneTypeItineraireItineraireOuModeleCheminementALAT != estConsigneTypeItineraireItineraireOuModeleCheminementALAT) {
			NotificationChain msgs = null;
			if (estConsigneTypeItineraireItineraireOuModeleCheminementALAT != null)
				msgs = ((InternalEObject)estConsigneTypeItineraireItineraireOuModeleCheminementALAT).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONSIGNE_GEOGRAPHIQUE__EST_CONSIGNE_TYPE_ITINERAIRE_ITINERAIRE_OU_MODELE_CHEMINEMENT_ALAT, null, msgs);
			if (newEstConsigneTypeItineraireItineraireOuModeleCheminementALAT != null)
				msgs = ((InternalEObject)newEstConsigneTypeItineraireItineraireOuModeleCheminementALAT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONSIGNE_GEOGRAPHIQUE__EST_CONSIGNE_TYPE_ITINERAIRE_ITINERAIRE_OU_MODELE_CHEMINEMENT_ALAT, null, msgs);
			msgs = basicSetEstConsigneTypeItineraireItineraireOuModeleCheminementALAT(newEstConsigneTypeItineraireItineraireOuModeleCheminementALAT, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNE_GEOGRAPHIQUE__EST_CONSIGNE_TYPE_ITINERAIRE_ITINERAIRE_OU_MODELE_CHEMINEMENT_ALAT, newEstConsigneTypeItineraireItineraireOuModeleCheminementALAT, newEstConsigneTypeItineraireItineraireOuModeleCheminementALAT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getEstConsigneTypePointPointControle3D() {
		return estConsigneTypePointPointControle3D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstConsigneTypePointPointControle3D(TypeAssociation newEstConsigneTypePointPointControle3D, NotificationChain msgs) {
		TypeAssociation oldEstConsigneTypePointPointControle3D = estConsigneTypePointPointControle3D;
		estConsigneTypePointPointControle3D = newEstConsigneTypePointPointControle3D;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNE_GEOGRAPHIQUE__EST_CONSIGNE_TYPE_POINT_POINT_CONTROLE3_D, oldEstConsigneTypePointPointControle3D, newEstConsigneTypePointPointControle3D);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstConsigneTypePointPointControle3D(TypeAssociation newEstConsigneTypePointPointControle3D) {
		if (newEstConsigneTypePointPointControle3D != estConsigneTypePointPointControle3D) {
			NotificationChain msgs = null;
			if (estConsigneTypePointPointControle3D != null)
				msgs = ((InternalEObject)estConsigneTypePointPointControle3D).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONSIGNE_GEOGRAPHIQUE__EST_CONSIGNE_TYPE_POINT_POINT_CONTROLE3_D, null, msgs);
			if (newEstConsigneTypePointPointControle3D != null)
				msgs = ((InternalEObject)newEstConsigneTypePointPointControle3D).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONSIGNE_GEOGRAPHIQUE__EST_CONSIGNE_TYPE_POINT_POINT_CONTROLE3_D, null, msgs);
			msgs = basicSetEstConsigneTypePointPointControle3D(newEstConsigneTypePointPointControle3D, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNE_GEOGRAPHIQUE__EST_CONSIGNE_TYPE_POINT_POINT_CONTROLE3_D, newEstConsigneTypePointPointControle3D, newEstConsigneTypePointPointControle3D));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getEstConsigneTypeRouteRouteHelicoptereALAT() {
		return estConsigneTypeRouteRouteHelicoptereALAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstConsigneTypeRouteRouteHelicoptereALAT(TypeAssociation newEstConsigneTypeRouteRouteHelicoptereALAT, NotificationChain msgs) {
		TypeAssociation oldEstConsigneTypeRouteRouteHelicoptereALAT = estConsigneTypeRouteRouteHelicoptereALAT;
		estConsigneTypeRouteRouteHelicoptereALAT = newEstConsigneTypeRouteRouteHelicoptereALAT;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNE_GEOGRAPHIQUE__EST_CONSIGNE_TYPE_ROUTE_ROUTE_HELICOPTERE_ALAT, oldEstConsigneTypeRouteRouteHelicoptereALAT, newEstConsigneTypeRouteRouteHelicoptereALAT);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstConsigneTypeRouteRouteHelicoptereALAT(TypeAssociation newEstConsigneTypeRouteRouteHelicoptereALAT) {
		if (newEstConsigneTypeRouteRouteHelicoptereALAT != estConsigneTypeRouteRouteHelicoptereALAT) {
			NotificationChain msgs = null;
			if (estConsigneTypeRouteRouteHelicoptereALAT != null)
				msgs = ((InternalEObject)estConsigneTypeRouteRouteHelicoptereALAT).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONSIGNE_GEOGRAPHIQUE__EST_CONSIGNE_TYPE_ROUTE_ROUTE_HELICOPTERE_ALAT, null, msgs);
			if (newEstConsigneTypeRouteRouteHelicoptereALAT != null)
				msgs = ((InternalEObject)newEstConsigneTypeRouteRouteHelicoptereALAT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONSIGNE_GEOGRAPHIQUE__EST_CONSIGNE_TYPE_ROUTE_ROUTE_HELICOPTERE_ALAT, null, msgs);
			msgs = basicSetEstConsigneTypeRouteRouteHelicoptereALAT(newEstConsigneTypeRouteRouteHelicoptereALAT, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNE_GEOGRAPHIQUE__EST_CONSIGNE_TYPE_ROUTE_ROUTE_HELICOPTERE_ALAT, newEstConsigneTypeRouteRouteHelicoptereALAT, newEstConsigneTypeRouteRouteHelicoptereALAT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_CONSIGNE_GEOGRAPHIQUE__ADRESSE_RADIO_ADRESSE:
				return basicSetAdresseRadioAdresse(null, msgs);
			case SchemaPackage.TYPE_CONSIGNE_GEOGRAPHIQUE__EST_CONSIGNE_TYPE_ZONE_ZONE_ALAT:
				return basicSetEstConsigneTypeZoneZoneAlat(null, msgs);
			case SchemaPackage.TYPE_CONSIGNE_GEOGRAPHIQUE__EST_CONSIGNE_TYPE_LIGNE_AUTRE_ELEMENT_CONTROLE:
				return basicSetEstConsigneTypeLigneAutreElementControle(null, msgs);
			case SchemaPackage.TYPE_CONSIGNE_GEOGRAPHIQUE__EST_CONSIGNE_TYPE_ITINERAIRE_ITINERAIRE_OU_MODELE_CHEMINEMENT_ALAT:
				return basicSetEstConsigneTypeItineraireItineraireOuModeleCheminementALAT(null, msgs);
			case SchemaPackage.TYPE_CONSIGNE_GEOGRAPHIQUE__EST_CONSIGNE_TYPE_POINT_POINT_CONTROLE3_D:
				return basicSetEstConsigneTypePointPointControle3D(null, msgs);
			case SchemaPackage.TYPE_CONSIGNE_GEOGRAPHIQUE__EST_CONSIGNE_TYPE_ROUTE_ROUTE_HELICOPTERE_ALAT:
				return basicSetEstConsigneTypeRouteRouteHelicoptereALAT(null, msgs);
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
			case SchemaPackage.TYPE_CONSIGNE_GEOGRAPHIQUE__ADRESSE_RADIO_ADRESSE:
				return getAdresseRadioAdresse();
			case SchemaPackage.TYPE_CONSIGNE_GEOGRAPHIQUE__EST_CONSIGNE_TYPE_ZONE_ZONE_ALAT:
				return getEstConsigneTypeZoneZoneAlat();
			case SchemaPackage.TYPE_CONSIGNE_GEOGRAPHIQUE__EST_CONSIGNE_TYPE_LIGNE_AUTRE_ELEMENT_CONTROLE:
				return getEstConsigneTypeLigneAutreElementControle();
			case SchemaPackage.TYPE_CONSIGNE_GEOGRAPHIQUE__EST_CONSIGNE_TYPE_ITINERAIRE_ITINERAIRE_OU_MODELE_CHEMINEMENT_ALAT:
				return getEstConsigneTypeItineraireItineraireOuModeleCheminementALAT();
			case SchemaPackage.TYPE_CONSIGNE_GEOGRAPHIQUE__EST_CONSIGNE_TYPE_POINT_POINT_CONTROLE3_D:
				return getEstConsigneTypePointPointControle3D();
			case SchemaPackage.TYPE_CONSIGNE_GEOGRAPHIQUE__EST_CONSIGNE_TYPE_ROUTE_ROUTE_HELICOPTERE_ALAT:
				return getEstConsigneTypeRouteRouteHelicoptereALAT();
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
			case SchemaPackage.TYPE_CONSIGNE_GEOGRAPHIQUE__ADRESSE_RADIO_ADRESSE:
				setAdresseRadioAdresse((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_CONSIGNE_GEOGRAPHIQUE__EST_CONSIGNE_TYPE_ZONE_ZONE_ALAT:
				setEstConsigneTypeZoneZoneAlat((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_CONSIGNE_GEOGRAPHIQUE__EST_CONSIGNE_TYPE_LIGNE_AUTRE_ELEMENT_CONTROLE:
				setEstConsigneTypeLigneAutreElementControle((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_CONSIGNE_GEOGRAPHIQUE__EST_CONSIGNE_TYPE_ITINERAIRE_ITINERAIRE_OU_MODELE_CHEMINEMENT_ALAT:
				setEstConsigneTypeItineraireItineraireOuModeleCheminementALAT((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_CONSIGNE_GEOGRAPHIQUE__EST_CONSIGNE_TYPE_POINT_POINT_CONTROLE3_D:
				setEstConsigneTypePointPointControle3D((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_CONSIGNE_GEOGRAPHIQUE__EST_CONSIGNE_TYPE_ROUTE_ROUTE_HELICOPTERE_ALAT:
				setEstConsigneTypeRouteRouteHelicoptereALAT((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_CONSIGNE_GEOGRAPHIQUE__ADRESSE_RADIO_ADRESSE:
				setAdresseRadioAdresse((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_CONSIGNE_GEOGRAPHIQUE__EST_CONSIGNE_TYPE_ZONE_ZONE_ALAT:
				setEstConsigneTypeZoneZoneAlat((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_CONSIGNE_GEOGRAPHIQUE__EST_CONSIGNE_TYPE_LIGNE_AUTRE_ELEMENT_CONTROLE:
				setEstConsigneTypeLigneAutreElementControle((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_CONSIGNE_GEOGRAPHIQUE__EST_CONSIGNE_TYPE_ITINERAIRE_ITINERAIRE_OU_MODELE_CHEMINEMENT_ALAT:
				setEstConsigneTypeItineraireItineraireOuModeleCheminementALAT((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_CONSIGNE_GEOGRAPHIQUE__EST_CONSIGNE_TYPE_POINT_POINT_CONTROLE3_D:
				setEstConsigneTypePointPointControle3D((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_CONSIGNE_GEOGRAPHIQUE__EST_CONSIGNE_TYPE_ROUTE_ROUTE_HELICOPTERE_ALAT:
				setEstConsigneTypeRouteRouteHelicoptereALAT((TypeAssociation)null);
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
			case SchemaPackage.TYPE_CONSIGNE_GEOGRAPHIQUE__ADRESSE_RADIO_ADRESSE:
				return adresseRadioAdresse != null;
			case SchemaPackage.TYPE_CONSIGNE_GEOGRAPHIQUE__EST_CONSIGNE_TYPE_ZONE_ZONE_ALAT:
				return estConsigneTypeZoneZoneAlat != null;
			case SchemaPackage.TYPE_CONSIGNE_GEOGRAPHIQUE__EST_CONSIGNE_TYPE_LIGNE_AUTRE_ELEMENT_CONTROLE:
				return estConsigneTypeLigneAutreElementControle != null;
			case SchemaPackage.TYPE_CONSIGNE_GEOGRAPHIQUE__EST_CONSIGNE_TYPE_ITINERAIRE_ITINERAIRE_OU_MODELE_CHEMINEMENT_ALAT:
				return estConsigneTypeItineraireItineraireOuModeleCheminementALAT != null;
			case SchemaPackage.TYPE_CONSIGNE_GEOGRAPHIQUE__EST_CONSIGNE_TYPE_POINT_POINT_CONTROLE3_D:
				return estConsigneTypePointPointControle3D != null;
			case SchemaPackage.TYPE_CONSIGNE_GEOGRAPHIQUE__EST_CONSIGNE_TYPE_ROUTE_ROUTE_HELICOPTERE_ALAT:
				return estConsigneTypeRouteRouteHelicoptereALAT != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeConsigneGeographiqueImpl
