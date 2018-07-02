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
import mpia.schema.TypeSystemeAtterrissageAuxInstruments;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Systeme Atterrissage Aux Instruments</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeSystemeAtterrissageAuxInstrumentsImpl#getLargeurRayon <em>Largeur Rayon</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSystemeAtterrissageAuxInstrumentsImpl#getAngleAlignementDescente <em>Angle Alignement Descente</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSystemeAtterrissageAuxInstrumentsImpl#getAngleVariationMagnetique <em>Angle Variation Magnetique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSystemeAtterrissageAuxInstrumentsImpl#getAngleCorrection <em>Angle Correction</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSystemeAtterrissageAuxInstrumentsImpl#getAngleAlignementPiste <em>Angle Alignement Piste</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSystemeAtterrissageAuxInstrumentsImpl#getHauteurCroisementSeuil <em>Hauteur Croisement Seuil</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSystemeAtterrissageAuxInstrumentsImpl#getDistanceRadiophare <em>Distance Radiophare</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSystemeAtterrissageAuxInstrumentsImpl#getDistanceAppareilMesure <em>Distance Appareil Mesure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeSystemeAtterrissageAuxInstrumentsImpl extends TypeMaterielImpl implements TypeSystemeAtterrissageAuxInstruments {
	/**
	 * The cached value of the '{@link #getLargeurRayon() <em>Largeur Rayon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargeurRayon()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur largeurRayon;

	/**
	 * The cached value of the '{@link #getAngleAlignementDescente() <em>Angle Alignement Descente</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleAlignementDescente()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeAngle angleAlignementDescente;

	/**
	 * The cached value of the '{@link #getAngleVariationMagnetique() <em>Angle Variation Magnetique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleVariationMagnetique()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeAngle angleVariationMagnetique;

	/**
	 * The cached value of the '{@link #getAngleCorrection() <em>Angle Correction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleCorrection()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeAngle angleCorrection;

	/**
	 * The cached value of the '{@link #getAngleAlignementPiste() <em>Angle Alignement Piste</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleAlignementPiste()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeAngle angleAlignementPiste;

	/**
	 * The cached value of the '{@link #getHauteurCroisementSeuil() <em>Hauteur Croisement Seuil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHauteurCroisementSeuil()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur hauteurCroisementSeuil;

	/**
	 * The cached value of the '{@link #getDistanceRadiophare() <em>Distance Radiophare</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceRadiophare()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur distanceRadiophare;

	/**
	 * The cached value of the '{@link #getDistanceAppareilMesure() <em>Distance Appareil Mesure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceAppareilMesure()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur distanceAppareilMesure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeSystemeAtterrissageAuxInstrumentsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeSystemeAtterrissageAuxInstruments();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getLargeurRayon() {
		return largeurRayon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLargeurRayon(TypeDataTypeLongueur newLargeurRayon, NotificationChain msgs) {
		TypeDataTypeLongueur oldLargeurRayon = largeurRayon;
		largeurRayon = newLargeurRayon;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__LARGEUR_RAYON, oldLargeurRayon, newLargeurRayon);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLargeurRayon(TypeDataTypeLongueur newLargeurRayon) {
		if (newLargeurRayon != largeurRayon) {
			NotificationChain msgs = null;
			if (largeurRayon != null)
				msgs = ((InternalEObject)largeurRayon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__LARGEUR_RAYON, null, msgs);
			if (newLargeurRayon != null)
				msgs = ((InternalEObject)newLargeurRayon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__LARGEUR_RAYON, null, msgs);
			msgs = basicSetLargeurRayon(newLargeurRayon, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__LARGEUR_RAYON, newLargeurRayon, newLargeurRayon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeAngle getAngleAlignementDescente() {
		return angleAlignementDescente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngleAlignementDescente(TypeDataTypeAngle newAngleAlignementDescente, NotificationChain msgs) {
		TypeDataTypeAngle oldAngleAlignementDescente = angleAlignementDescente;
		angleAlignementDescente = newAngleAlignementDescente;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__ANGLE_ALIGNEMENT_DESCENTE, oldAngleAlignementDescente, newAngleAlignementDescente);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngleAlignementDescente(TypeDataTypeAngle newAngleAlignementDescente) {
		if (newAngleAlignementDescente != angleAlignementDescente) {
			NotificationChain msgs = null;
			if (angleAlignementDescente != null)
				msgs = ((InternalEObject)angleAlignementDescente).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__ANGLE_ALIGNEMENT_DESCENTE, null, msgs);
			if (newAngleAlignementDescente != null)
				msgs = ((InternalEObject)newAngleAlignementDescente).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__ANGLE_ALIGNEMENT_DESCENTE, null, msgs);
			msgs = basicSetAngleAlignementDescente(newAngleAlignementDescente, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__ANGLE_ALIGNEMENT_DESCENTE, newAngleAlignementDescente, newAngleAlignementDescente));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeAngle getAngleVariationMagnetique() {
		return angleVariationMagnetique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngleVariationMagnetique(TypeDataTypeAngle newAngleVariationMagnetique, NotificationChain msgs) {
		TypeDataTypeAngle oldAngleVariationMagnetique = angleVariationMagnetique;
		angleVariationMagnetique = newAngleVariationMagnetique;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__ANGLE_VARIATION_MAGNETIQUE, oldAngleVariationMagnetique, newAngleVariationMagnetique);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngleVariationMagnetique(TypeDataTypeAngle newAngleVariationMagnetique) {
		if (newAngleVariationMagnetique != angleVariationMagnetique) {
			NotificationChain msgs = null;
			if (angleVariationMagnetique != null)
				msgs = ((InternalEObject)angleVariationMagnetique).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__ANGLE_VARIATION_MAGNETIQUE, null, msgs);
			if (newAngleVariationMagnetique != null)
				msgs = ((InternalEObject)newAngleVariationMagnetique).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__ANGLE_VARIATION_MAGNETIQUE, null, msgs);
			msgs = basicSetAngleVariationMagnetique(newAngleVariationMagnetique, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__ANGLE_VARIATION_MAGNETIQUE, newAngleVariationMagnetique, newAngleVariationMagnetique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeAngle getAngleCorrection() {
		return angleCorrection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngleCorrection(TypeDataTypeAngle newAngleCorrection, NotificationChain msgs) {
		TypeDataTypeAngle oldAngleCorrection = angleCorrection;
		angleCorrection = newAngleCorrection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__ANGLE_CORRECTION, oldAngleCorrection, newAngleCorrection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngleCorrection(TypeDataTypeAngle newAngleCorrection) {
		if (newAngleCorrection != angleCorrection) {
			NotificationChain msgs = null;
			if (angleCorrection != null)
				msgs = ((InternalEObject)angleCorrection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__ANGLE_CORRECTION, null, msgs);
			if (newAngleCorrection != null)
				msgs = ((InternalEObject)newAngleCorrection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__ANGLE_CORRECTION, null, msgs);
			msgs = basicSetAngleCorrection(newAngleCorrection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__ANGLE_CORRECTION, newAngleCorrection, newAngleCorrection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeAngle getAngleAlignementPiste() {
		return angleAlignementPiste;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngleAlignementPiste(TypeDataTypeAngle newAngleAlignementPiste, NotificationChain msgs) {
		TypeDataTypeAngle oldAngleAlignementPiste = angleAlignementPiste;
		angleAlignementPiste = newAngleAlignementPiste;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__ANGLE_ALIGNEMENT_PISTE, oldAngleAlignementPiste, newAngleAlignementPiste);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngleAlignementPiste(TypeDataTypeAngle newAngleAlignementPiste) {
		if (newAngleAlignementPiste != angleAlignementPiste) {
			NotificationChain msgs = null;
			if (angleAlignementPiste != null)
				msgs = ((InternalEObject)angleAlignementPiste).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__ANGLE_ALIGNEMENT_PISTE, null, msgs);
			if (newAngleAlignementPiste != null)
				msgs = ((InternalEObject)newAngleAlignementPiste).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__ANGLE_ALIGNEMENT_PISTE, null, msgs);
			msgs = basicSetAngleAlignementPiste(newAngleAlignementPiste, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__ANGLE_ALIGNEMENT_PISTE, newAngleAlignementPiste, newAngleAlignementPiste));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getHauteurCroisementSeuil() {
		return hauteurCroisementSeuil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHauteurCroisementSeuil(TypeDataTypeLongueur newHauteurCroisementSeuil, NotificationChain msgs) {
		TypeDataTypeLongueur oldHauteurCroisementSeuil = hauteurCroisementSeuil;
		hauteurCroisementSeuil = newHauteurCroisementSeuil;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__HAUTEUR_CROISEMENT_SEUIL, oldHauteurCroisementSeuil, newHauteurCroisementSeuil);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHauteurCroisementSeuil(TypeDataTypeLongueur newHauteurCroisementSeuil) {
		if (newHauteurCroisementSeuil != hauteurCroisementSeuil) {
			NotificationChain msgs = null;
			if (hauteurCroisementSeuil != null)
				msgs = ((InternalEObject)hauteurCroisementSeuil).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__HAUTEUR_CROISEMENT_SEUIL, null, msgs);
			if (newHauteurCroisementSeuil != null)
				msgs = ((InternalEObject)newHauteurCroisementSeuil).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__HAUTEUR_CROISEMENT_SEUIL, null, msgs);
			msgs = basicSetHauteurCroisementSeuil(newHauteurCroisementSeuil, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__HAUTEUR_CROISEMENT_SEUIL, newHauteurCroisementSeuil, newHauteurCroisementSeuil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getDistanceRadiophare() {
		return distanceRadiophare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDistanceRadiophare(TypeDataTypeLongueur newDistanceRadiophare, NotificationChain msgs) {
		TypeDataTypeLongueur oldDistanceRadiophare = distanceRadiophare;
		distanceRadiophare = newDistanceRadiophare;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__DISTANCE_RADIOPHARE, oldDistanceRadiophare, newDistanceRadiophare);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistanceRadiophare(TypeDataTypeLongueur newDistanceRadiophare) {
		if (newDistanceRadiophare != distanceRadiophare) {
			NotificationChain msgs = null;
			if (distanceRadiophare != null)
				msgs = ((InternalEObject)distanceRadiophare).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__DISTANCE_RADIOPHARE, null, msgs);
			if (newDistanceRadiophare != null)
				msgs = ((InternalEObject)newDistanceRadiophare).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__DISTANCE_RADIOPHARE, null, msgs);
			msgs = basicSetDistanceRadiophare(newDistanceRadiophare, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__DISTANCE_RADIOPHARE, newDistanceRadiophare, newDistanceRadiophare));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getDistanceAppareilMesure() {
		return distanceAppareilMesure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDistanceAppareilMesure(TypeDataTypeLongueur newDistanceAppareilMesure, NotificationChain msgs) {
		TypeDataTypeLongueur oldDistanceAppareilMesure = distanceAppareilMesure;
		distanceAppareilMesure = newDistanceAppareilMesure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__DISTANCE_APPAREIL_MESURE, oldDistanceAppareilMesure, newDistanceAppareilMesure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistanceAppareilMesure(TypeDataTypeLongueur newDistanceAppareilMesure) {
		if (newDistanceAppareilMesure != distanceAppareilMesure) {
			NotificationChain msgs = null;
			if (distanceAppareilMesure != null)
				msgs = ((InternalEObject)distanceAppareilMesure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__DISTANCE_APPAREIL_MESURE, null, msgs);
			if (newDistanceAppareilMesure != null)
				msgs = ((InternalEObject)newDistanceAppareilMesure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__DISTANCE_APPAREIL_MESURE, null, msgs);
			msgs = basicSetDistanceAppareilMesure(newDistanceAppareilMesure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__DISTANCE_APPAREIL_MESURE, newDistanceAppareilMesure, newDistanceAppareilMesure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__LARGEUR_RAYON:
				return basicSetLargeurRayon(null, msgs);
			case SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__ANGLE_ALIGNEMENT_DESCENTE:
				return basicSetAngleAlignementDescente(null, msgs);
			case SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__ANGLE_VARIATION_MAGNETIQUE:
				return basicSetAngleVariationMagnetique(null, msgs);
			case SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__ANGLE_CORRECTION:
				return basicSetAngleCorrection(null, msgs);
			case SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__ANGLE_ALIGNEMENT_PISTE:
				return basicSetAngleAlignementPiste(null, msgs);
			case SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__HAUTEUR_CROISEMENT_SEUIL:
				return basicSetHauteurCroisementSeuil(null, msgs);
			case SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__DISTANCE_RADIOPHARE:
				return basicSetDistanceRadiophare(null, msgs);
			case SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__DISTANCE_APPAREIL_MESURE:
				return basicSetDistanceAppareilMesure(null, msgs);
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
			case SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__LARGEUR_RAYON:
				return getLargeurRayon();
			case SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__ANGLE_ALIGNEMENT_DESCENTE:
				return getAngleAlignementDescente();
			case SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__ANGLE_VARIATION_MAGNETIQUE:
				return getAngleVariationMagnetique();
			case SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__ANGLE_CORRECTION:
				return getAngleCorrection();
			case SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__ANGLE_ALIGNEMENT_PISTE:
				return getAngleAlignementPiste();
			case SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__HAUTEUR_CROISEMENT_SEUIL:
				return getHauteurCroisementSeuil();
			case SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__DISTANCE_RADIOPHARE:
				return getDistanceRadiophare();
			case SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__DISTANCE_APPAREIL_MESURE:
				return getDistanceAppareilMesure();
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
			case SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__LARGEUR_RAYON:
				setLargeurRayon((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__ANGLE_ALIGNEMENT_DESCENTE:
				setAngleAlignementDescente((TypeDataTypeAngle)newValue);
				return;
			case SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__ANGLE_VARIATION_MAGNETIQUE:
				setAngleVariationMagnetique((TypeDataTypeAngle)newValue);
				return;
			case SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__ANGLE_CORRECTION:
				setAngleCorrection((TypeDataTypeAngle)newValue);
				return;
			case SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__ANGLE_ALIGNEMENT_PISTE:
				setAngleAlignementPiste((TypeDataTypeAngle)newValue);
				return;
			case SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__HAUTEUR_CROISEMENT_SEUIL:
				setHauteurCroisementSeuil((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__DISTANCE_RADIOPHARE:
				setDistanceRadiophare((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__DISTANCE_APPAREIL_MESURE:
				setDistanceAppareilMesure((TypeDataTypeLongueur)newValue);
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
			case SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__LARGEUR_RAYON:
				setLargeurRayon((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__ANGLE_ALIGNEMENT_DESCENTE:
				setAngleAlignementDescente((TypeDataTypeAngle)null);
				return;
			case SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__ANGLE_VARIATION_MAGNETIQUE:
				setAngleVariationMagnetique((TypeDataTypeAngle)null);
				return;
			case SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__ANGLE_CORRECTION:
				setAngleCorrection((TypeDataTypeAngle)null);
				return;
			case SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__ANGLE_ALIGNEMENT_PISTE:
				setAngleAlignementPiste((TypeDataTypeAngle)null);
				return;
			case SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__HAUTEUR_CROISEMENT_SEUIL:
				setHauteurCroisementSeuil((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__DISTANCE_RADIOPHARE:
				setDistanceRadiophare((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__DISTANCE_APPAREIL_MESURE:
				setDistanceAppareilMesure((TypeDataTypeLongueur)null);
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
			case SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__LARGEUR_RAYON:
				return largeurRayon != null;
			case SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__ANGLE_ALIGNEMENT_DESCENTE:
				return angleAlignementDescente != null;
			case SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__ANGLE_VARIATION_MAGNETIQUE:
				return angleVariationMagnetique != null;
			case SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__ANGLE_CORRECTION:
				return angleCorrection != null;
			case SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__ANGLE_ALIGNEMENT_PISTE:
				return angleAlignementPiste != null;
			case SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__HAUTEUR_CROISEMENT_SEUIL:
				return hauteurCroisementSeuil != null;
			case SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__DISTANCE_RADIOPHARE:
				return distanceRadiophare != null;
			case SchemaPackage.TYPE_SYSTEME_ATTERRISSAGE_AUX_INSTRUMENTS__DISTANCE_APPAREIL_MESURE:
				return distanceAppareilMesure != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeSystemeAtterrissageAuxInstrumentsImpl
