/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeAngle;
import mpia.meta.TypeDataTypeDuree;
import mpia.meta.TypeDataTypeLongueur;
import mpia.meta.TypeDataTypeVitesseLineaire;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeBrancheNavigation;
import mpia.schema.TypeDictionaryDicoTypeVol;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Branche Navigation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeBrancheNavigationImpl#getVitesseMoyenne <em>Vitesse Moyenne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBrancheNavigationImpl#getTypeVol <em>Type Vol</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBrancheNavigationImpl#getLongueur <em>Longueur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBrancheNavigationImpl#getPenteDecollageReelle <em>Pente Decollage Reelle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBrancheNavigationImpl#getPenteAtterrissageReelle <em>Pente Atterrissage Reelle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBrancheNavigationImpl#getTauxMonteeReel <em>Taux Montee Reel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBrancheNavigationImpl#getTauxChuteReel <em>Taux Chute Reel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBrancheNavigationImpl#getVitesse <em>Vitesse</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBrancheNavigationImpl#getDistanceCumulee <em>Distance Cumulee</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBrancheNavigationImpl#getDureePrevue <em>Duree Prevue</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBrancheNavigationImpl#getDureePrevueRestant <em>Duree Prevue Restant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeBrancheNavigationImpl extends TypeElementControleImpl implements TypeBrancheNavigation {
	/**
	 * The default value of the '{@link #getVitesseMoyenne() <em>Vitesse Moyenne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesseMoyenne()
	 * @generated
	 * @ordered
	 */
	protected static final double VITESSE_MOYENNE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVitesseMoyenne() <em>Vitesse Moyenne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesseMoyenne()
	 * @generated
	 * @ordered
	 */
	protected double vitesseMoyenne = VITESSE_MOYENNE_EDEFAULT;

	/**
	 * This is true if the Vitesse Moyenne attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean vitesseMoyenneESet;

	/**
	 * The default value of the '{@link #getTypeVol() <em>Type Vol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeVol()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeVol TYPE_VOL_EDEFAULT = TypeDictionaryDicoTypeVol.TECFBD;

	/**
	 * The cached value of the '{@link #getTypeVol() <em>Type Vol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeVol()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeVol typeVol = TYPE_VOL_EDEFAULT;

	/**
	 * This is true if the Type Vol attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeVolESet;

	/**
	 * The cached value of the '{@link #getLongueur() <em>Longueur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongueur()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur longueur;

	/**
	 * The cached value of the '{@link #getPenteDecollageReelle() <em>Pente Decollage Reelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPenteDecollageReelle()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeAngle penteDecollageReelle;

	/**
	 * The cached value of the '{@link #getPenteAtterrissageReelle() <em>Pente Atterrissage Reelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPenteAtterrissageReelle()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeAngle penteAtterrissageReelle;

	/**
	 * The cached value of the '{@link #getTauxMonteeReel() <em>Taux Montee Reel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTauxMonteeReel()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeVitesseLineaire tauxMonteeReel;

	/**
	 * The cached value of the '{@link #getTauxChuteReel() <em>Taux Chute Reel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTauxChuteReel()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeVitesseLineaire tauxChuteReel;

	/**
	 * The cached value of the '{@link #getVitesse() <em>Vitesse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesse()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeVitesseLineaire vitesse;

	/**
	 * The cached value of the '{@link #getDistanceCumulee() <em>Distance Cumulee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceCumulee()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur distanceCumulee;

	/**
	 * The cached value of the '{@link #getDureePrevue() <em>Duree Prevue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDureePrevue()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree dureePrevue;

	/**
	 * The cached value of the '{@link #getDureePrevueRestant() <em>Duree Prevue Restant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDureePrevueRestant()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree dureePrevueRestant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeBrancheNavigationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeBrancheNavigation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVitesseMoyenne() {
		return vitesseMoyenne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVitesseMoyenne(double newVitesseMoyenne) {
		double oldVitesseMoyenne = vitesseMoyenne;
		vitesseMoyenne = newVitesseMoyenne;
		boolean oldVitesseMoyenneESet = vitesseMoyenneESet;
		vitesseMoyenneESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BRANCHE_NAVIGATION__VITESSE_MOYENNE, oldVitesseMoyenne, vitesseMoyenne, !oldVitesseMoyenneESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVitesseMoyenne() {
		double oldVitesseMoyenne = vitesseMoyenne;
		boolean oldVitesseMoyenneESet = vitesseMoyenneESet;
		vitesseMoyenne = VITESSE_MOYENNE_EDEFAULT;
		vitesseMoyenneESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_BRANCHE_NAVIGATION__VITESSE_MOYENNE, oldVitesseMoyenne, VITESSE_MOYENNE_EDEFAULT, oldVitesseMoyenneESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVitesseMoyenne() {
		return vitesseMoyenneESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeVol getTypeVol() {
		return typeVol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeVol(TypeDictionaryDicoTypeVol newTypeVol) {
		TypeDictionaryDicoTypeVol oldTypeVol = typeVol;
		typeVol = newTypeVol == null ? TYPE_VOL_EDEFAULT : newTypeVol;
		boolean oldTypeVolESet = typeVolESet;
		typeVolESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BRANCHE_NAVIGATION__TYPE_VOL, oldTypeVol, typeVol, !oldTypeVolESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeVol() {
		TypeDictionaryDicoTypeVol oldTypeVol = typeVol;
		boolean oldTypeVolESet = typeVolESet;
		typeVol = TYPE_VOL_EDEFAULT;
		typeVolESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_BRANCHE_NAVIGATION__TYPE_VOL, oldTypeVol, TYPE_VOL_EDEFAULT, oldTypeVolESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeVol() {
		return typeVolESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getLongueur() {
		return longueur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLongueur(TypeDataTypeLongueur newLongueur, NotificationChain msgs) {
		TypeDataTypeLongueur oldLongueur = longueur;
		longueur = newLongueur;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BRANCHE_NAVIGATION__LONGUEUR, oldLongueur, newLongueur);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongueur(TypeDataTypeLongueur newLongueur) {
		if (newLongueur != longueur) {
			NotificationChain msgs = null;
			if (longueur != null)
				msgs = ((InternalEObject)longueur).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_BRANCHE_NAVIGATION__LONGUEUR, null, msgs);
			if (newLongueur != null)
				msgs = ((InternalEObject)newLongueur).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_BRANCHE_NAVIGATION__LONGUEUR, null, msgs);
			msgs = basicSetLongueur(newLongueur, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BRANCHE_NAVIGATION__LONGUEUR, newLongueur, newLongueur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeAngle getPenteDecollageReelle() {
		return penteDecollageReelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPenteDecollageReelle(TypeDataTypeAngle newPenteDecollageReelle, NotificationChain msgs) {
		TypeDataTypeAngle oldPenteDecollageReelle = penteDecollageReelle;
		penteDecollageReelle = newPenteDecollageReelle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BRANCHE_NAVIGATION__PENTE_DECOLLAGE_REELLE, oldPenteDecollageReelle, newPenteDecollageReelle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPenteDecollageReelle(TypeDataTypeAngle newPenteDecollageReelle) {
		if (newPenteDecollageReelle != penteDecollageReelle) {
			NotificationChain msgs = null;
			if (penteDecollageReelle != null)
				msgs = ((InternalEObject)penteDecollageReelle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_BRANCHE_NAVIGATION__PENTE_DECOLLAGE_REELLE, null, msgs);
			if (newPenteDecollageReelle != null)
				msgs = ((InternalEObject)newPenteDecollageReelle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_BRANCHE_NAVIGATION__PENTE_DECOLLAGE_REELLE, null, msgs);
			msgs = basicSetPenteDecollageReelle(newPenteDecollageReelle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BRANCHE_NAVIGATION__PENTE_DECOLLAGE_REELLE, newPenteDecollageReelle, newPenteDecollageReelle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeAngle getPenteAtterrissageReelle() {
		return penteAtterrissageReelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPenteAtterrissageReelle(TypeDataTypeAngle newPenteAtterrissageReelle, NotificationChain msgs) {
		TypeDataTypeAngle oldPenteAtterrissageReelle = penteAtterrissageReelle;
		penteAtterrissageReelle = newPenteAtterrissageReelle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BRANCHE_NAVIGATION__PENTE_ATTERRISSAGE_REELLE, oldPenteAtterrissageReelle, newPenteAtterrissageReelle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPenteAtterrissageReelle(TypeDataTypeAngle newPenteAtterrissageReelle) {
		if (newPenteAtterrissageReelle != penteAtterrissageReelle) {
			NotificationChain msgs = null;
			if (penteAtterrissageReelle != null)
				msgs = ((InternalEObject)penteAtterrissageReelle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_BRANCHE_NAVIGATION__PENTE_ATTERRISSAGE_REELLE, null, msgs);
			if (newPenteAtterrissageReelle != null)
				msgs = ((InternalEObject)newPenteAtterrissageReelle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_BRANCHE_NAVIGATION__PENTE_ATTERRISSAGE_REELLE, null, msgs);
			msgs = basicSetPenteAtterrissageReelle(newPenteAtterrissageReelle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BRANCHE_NAVIGATION__PENTE_ATTERRISSAGE_REELLE, newPenteAtterrissageReelle, newPenteAtterrissageReelle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeVitesseLineaire getTauxMonteeReel() {
		return tauxMonteeReel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTauxMonteeReel(TypeDataTypeVitesseLineaire newTauxMonteeReel, NotificationChain msgs) {
		TypeDataTypeVitesseLineaire oldTauxMonteeReel = tauxMonteeReel;
		tauxMonteeReel = newTauxMonteeReel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BRANCHE_NAVIGATION__TAUX_MONTEE_REEL, oldTauxMonteeReel, newTauxMonteeReel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTauxMonteeReel(TypeDataTypeVitesseLineaire newTauxMonteeReel) {
		if (newTauxMonteeReel != tauxMonteeReel) {
			NotificationChain msgs = null;
			if (tauxMonteeReel != null)
				msgs = ((InternalEObject)tauxMonteeReel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_BRANCHE_NAVIGATION__TAUX_MONTEE_REEL, null, msgs);
			if (newTauxMonteeReel != null)
				msgs = ((InternalEObject)newTauxMonteeReel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_BRANCHE_NAVIGATION__TAUX_MONTEE_REEL, null, msgs);
			msgs = basicSetTauxMonteeReel(newTauxMonteeReel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BRANCHE_NAVIGATION__TAUX_MONTEE_REEL, newTauxMonteeReel, newTauxMonteeReel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeVitesseLineaire getTauxChuteReel() {
		return tauxChuteReel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTauxChuteReel(TypeDataTypeVitesseLineaire newTauxChuteReel, NotificationChain msgs) {
		TypeDataTypeVitesseLineaire oldTauxChuteReel = tauxChuteReel;
		tauxChuteReel = newTauxChuteReel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BRANCHE_NAVIGATION__TAUX_CHUTE_REEL, oldTauxChuteReel, newTauxChuteReel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTauxChuteReel(TypeDataTypeVitesseLineaire newTauxChuteReel) {
		if (newTauxChuteReel != tauxChuteReel) {
			NotificationChain msgs = null;
			if (tauxChuteReel != null)
				msgs = ((InternalEObject)tauxChuteReel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_BRANCHE_NAVIGATION__TAUX_CHUTE_REEL, null, msgs);
			if (newTauxChuteReel != null)
				msgs = ((InternalEObject)newTauxChuteReel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_BRANCHE_NAVIGATION__TAUX_CHUTE_REEL, null, msgs);
			msgs = basicSetTauxChuteReel(newTauxChuteReel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BRANCHE_NAVIGATION__TAUX_CHUTE_REEL, newTauxChuteReel, newTauxChuteReel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeVitesseLineaire getVitesse() {
		return vitesse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVitesse(TypeDataTypeVitesseLineaire newVitesse, NotificationChain msgs) {
		TypeDataTypeVitesseLineaire oldVitesse = vitesse;
		vitesse = newVitesse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BRANCHE_NAVIGATION__VITESSE, oldVitesse, newVitesse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVitesse(TypeDataTypeVitesseLineaire newVitesse) {
		if (newVitesse != vitesse) {
			NotificationChain msgs = null;
			if (vitesse != null)
				msgs = ((InternalEObject)vitesse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_BRANCHE_NAVIGATION__VITESSE, null, msgs);
			if (newVitesse != null)
				msgs = ((InternalEObject)newVitesse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_BRANCHE_NAVIGATION__VITESSE, null, msgs);
			msgs = basicSetVitesse(newVitesse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BRANCHE_NAVIGATION__VITESSE, newVitesse, newVitesse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getDistanceCumulee() {
		return distanceCumulee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDistanceCumulee(TypeDataTypeLongueur newDistanceCumulee, NotificationChain msgs) {
		TypeDataTypeLongueur oldDistanceCumulee = distanceCumulee;
		distanceCumulee = newDistanceCumulee;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BRANCHE_NAVIGATION__DISTANCE_CUMULEE, oldDistanceCumulee, newDistanceCumulee);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistanceCumulee(TypeDataTypeLongueur newDistanceCumulee) {
		if (newDistanceCumulee != distanceCumulee) {
			NotificationChain msgs = null;
			if (distanceCumulee != null)
				msgs = ((InternalEObject)distanceCumulee).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_BRANCHE_NAVIGATION__DISTANCE_CUMULEE, null, msgs);
			if (newDistanceCumulee != null)
				msgs = ((InternalEObject)newDistanceCumulee).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_BRANCHE_NAVIGATION__DISTANCE_CUMULEE, null, msgs);
			msgs = basicSetDistanceCumulee(newDistanceCumulee, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BRANCHE_NAVIGATION__DISTANCE_CUMULEE, newDistanceCumulee, newDistanceCumulee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getDureePrevue() {
		return dureePrevue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDureePrevue(TypeDataTypeDuree newDureePrevue, NotificationChain msgs) {
		TypeDataTypeDuree oldDureePrevue = dureePrevue;
		dureePrevue = newDureePrevue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BRANCHE_NAVIGATION__DUREE_PREVUE, oldDureePrevue, newDureePrevue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDureePrevue(TypeDataTypeDuree newDureePrevue) {
		if (newDureePrevue != dureePrevue) {
			NotificationChain msgs = null;
			if (dureePrevue != null)
				msgs = ((InternalEObject)dureePrevue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_BRANCHE_NAVIGATION__DUREE_PREVUE, null, msgs);
			if (newDureePrevue != null)
				msgs = ((InternalEObject)newDureePrevue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_BRANCHE_NAVIGATION__DUREE_PREVUE, null, msgs);
			msgs = basicSetDureePrevue(newDureePrevue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BRANCHE_NAVIGATION__DUREE_PREVUE, newDureePrevue, newDureePrevue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getDureePrevueRestant() {
		return dureePrevueRestant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDureePrevueRestant(TypeDataTypeDuree newDureePrevueRestant, NotificationChain msgs) {
		TypeDataTypeDuree oldDureePrevueRestant = dureePrevueRestant;
		dureePrevueRestant = newDureePrevueRestant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BRANCHE_NAVIGATION__DUREE_PREVUE_RESTANT, oldDureePrevueRestant, newDureePrevueRestant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDureePrevueRestant(TypeDataTypeDuree newDureePrevueRestant) {
		if (newDureePrevueRestant != dureePrevueRestant) {
			NotificationChain msgs = null;
			if (dureePrevueRestant != null)
				msgs = ((InternalEObject)dureePrevueRestant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_BRANCHE_NAVIGATION__DUREE_PREVUE_RESTANT, null, msgs);
			if (newDureePrevueRestant != null)
				msgs = ((InternalEObject)newDureePrevueRestant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_BRANCHE_NAVIGATION__DUREE_PREVUE_RESTANT, null, msgs);
			msgs = basicSetDureePrevueRestant(newDureePrevueRestant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BRANCHE_NAVIGATION__DUREE_PREVUE_RESTANT, newDureePrevueRestant, newDureePrevueRestant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_BRANCHE_NAVIGATION__LONGUEUR:
				return basicSetLongueur(null, msgs);
			case SchemaPackage.TYPE_BRANCHE_NAVIGATION__PENTE_DECOLLAGE_REELLE:
				return basicSetPenteDecollageReelle(null, msgs);
			case SchemaPackage.TYPE_BRANCHE_NAVIGATION__PENTE_ATTERRISSAGE_REELLE:
				return basicSetPenteAtterrissageReelle(null, msgs);
			case SchemaPackage.TYPE_BRANCHE_NAVIGATION__TAUX_MONTEE_REEL:
				return basicSetTauxMonteeReel(null, msgs);
			case SchemaPackage.TYPE_BRANCHE_NAVIGATION__TAUX_CHUTE_REEL:
				return basicSetTauxChuteReel(null, msgs);
			case SchemaPackage.TYPE_BRANCHE_NAVIGATION__VITESSE:
				return basicSetVitesse(null, msgs);
			case SchemaPackage.TYPE_BRANCHE_NAVIGATION__DISTANCE_CUMULEE:
				return basicSetDistanceCumulee(null, msgs);
			case SchemaPackage.TYPE_BRANCHE_NAVIGATION__DUREE_PREVUE:
				return basicSetDureePrevue(null, msgs);
			case SchemaPackage.TYPE_BRANCHE_NAVIGATION__DUREE_PREVUE_RESTANT:
				return basicSetDureePrevueRestant(null, msgs);
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
			case SchemaPackage.TYPE_BRANCHE_NAVIGATION__VITESSE_MOYENNE:
				return new Double(getVitesseMoyenne());
			case SchemaPackage.TYPE_BRANCHE_NAVIGATION__TYPE_VOL:
				return getTypeVol();
			case SchemaPackage.TYPE_BRANCHE_NAVIGATION__LONGUEUR:
				return getLongueur();
			case SchemaPackage.TYPE_BRANCHE_NAVIGATION__PENTE_DECOLLAGE_REELLE:
				return getPenteDecollageReelle();
			case SchemaPackage.TYPE_BRANCHE_NAVIGATION__PENTE_ATTERRISSAGE_REELLE:
				return getPenteAtterrissageReelle();
			case SchemaPackage.TYPE_BRANCHE_NAVIGATION__TAUX_MONTEE_REEL:
				return getTauxMonteeReel();
			case SchemaPackage.TYPE_BRANCHE_NAVIGATION__TAUX_CHUTE_REEL:
				return getTauxChuteReel();
			case SchemaPackage.TYPE_BRANCHE_NAVIGATION__VITESSE:
				return getVitesse();
			case SchemaPackage.TYPE_BRANCHE_NAVIGATION__DISTANCE_CUMULEE:
				return getDistanceCumulee();
			case SchemaPackage.TYPE_BRANCHE_NAVIGATION__DUREE_PREVUE:
				return getDureePrevue();
			case SchemaPackage.TYPE_BRANCHE_NAVIGATION__DUREE_PREVUE_RESTANT:
				return getDureePrevueRestant();
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
			case SchemaPackage.TYPE_BRANCHE_NAVIGATION__VITESSE_MOYENNE:
				setVitesseMoyenne(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_BRANCHE_NAVIGATION__TYPE_VOL:
				setTypeVol((TypeDictionaryDicoTypeVol)newValue);
				return;
			case SchemaPackage.TYPE_BRANCHE_NAVIGATION__LONGUEUR:
				setLongueur((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_BRANCHE_NAVIGATION__PENTE_DECOLLAGE_REELLE:
				setPenteDecollageReelle((TypeDataTypeAngle)newValue);
				return;
			case SchemaPackage.TYPE_BRANCHE_NAVIGATION__PENTE_ATTERRISSAGE_REELLE:
				setPenteAtterrissageReelle((TypeDataTypeAngle)newValue);
				return;
			case SchemaPackage.TYPE_BRANCHE_NAVIGATION__TAUX_MONTEE_REEL:
				setTauxMonteeReel((TypeDataTypeVitesseLineaire)newValue);
				return;
			case SchemaPackage.TYPE_BRANCHE_NAVIGATION__TAUX_CHUTE_REEL:
				setTauxChuteReel((TypeDataTypeVitesseLineaire)newValue);
				return;
			case SchemaPackage.TYPE_BRANCHE_NAVIGATION__VITESSE:
				setVitesse((TypeDataTypeVitesseLineaire)newValue);
				return;
			case SchemaPackage.TYPE_BRANCHE_NAVIGATION__DISTANCE_CUMULEE:
				setDistanceCumulee((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_BRANCHE_NAVIGATION__DUREE_PREVUE:
				setDureePrevue((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_BRANCHE_NAVIGATION__DUREE_PREVUE_RESTANT:
				setDureePrevueRestant((TypeDataTypeDuree)newValue);
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
			case SchemaPackage.TYPE_BRANCHE_NAVIGATION__VITESSE_MOYENNE:
				unsetVitesseMoyenne();
				return;
			case SchemaPackage.TYPE_BRANCHE_NAVIGATION__TYPE_VOL:
				unsetTypeVol();
				return;
			case SchemaPackage.TYPE_BRANCHE_NAVIGATION__LONGUEUR:
				setLongueur((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_BRANCHE_NAVIGATION__PENTE_DECOLLAGE_REELLE:
				setPenteDecollageReelle((TypeDataTypeAngle)null);
				return;
			case SchemaPackage.TYPE_BRANCHE_NAVIGATION__PENTE_ATTERRISSAGE_REELLE:
				setPenteAtterrissageReelle((TypeDataTypeAngle)null);
				return;
			case SchemaPackage.TYPE_BRANCHE_NAVIGATION__TAUX_MONTEE_REEL:
				setTauxMonteeReel((TypeDataTypeVitesseLineaire)null);
				return;
			case SchemaPackage.TYPE_BRANCHE_NAVIGATION__TAUX_CHUTE_REEL:
				setTauxChuteReel((TypeDataTypeVitesseLineaire)null);
				return;
			case SchemaPackage.TYPE_BRANCHE_NAVIGATION__VITESSE:
				setVitesse((TypeDataTypeVitesseLineaire)null);
				return;
			case SchemaPackage.TYPE_BRANCHE_NAVIGATION__DISTANCE_CUMULEE:
				setDistanceCumulee((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_BRANCHE_NAVIGATION__DUREE_PREVUE:
				setDureePrevue((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_BRANCHE_NAVIGATION__DUREE_PREVUE_RESTANT:
				setDureePrevueRestant((TypeDataTypeDuree)null);
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
			case SchemaPackage.TYPE_BRANCHE_NAVIGATION__VITESSE_MOYENNE:
				return isSetVitesseMoyenne();
			case SchemaPackage.TYPE_BRANCHE_NAVIGATION__TYPE_VOL:
				return isSetTypeVol();
			case SchemaPackage.TYPE_BRANCHE_NAVIGATION__LONGUEUR:
				return longueur != null;
			case SchemaPackage.TYPE_BRANCHE_NAVIGATION__PENTE_DECOLLAGE_REELLE:
				return penteDecollageReelle != null;
			case SchemaPackage.TYPE_BRANCHE_NAVIGATION__PENTE_ATTERRISSAGE_REELLE:
				return penteAtterrissageReelle != null;
			case SchemaPackage.TYPE_BRANCHE_NAVIGATION__TAUX_MONTEE_REEL:
				return tauxMonteeReel != null;
			case SchemaPackage.TYPE_BRANCHE_NAVIGATION__TAUX_CHUTE_REEL:
				return tauxChuteReel != null;
			case SchemaPackage.TYPE_BRANCHE_NAVIGATION__VITESSE:
				return vitesse != null;
			case SchemaPackage.TYPE_BRANCHE_NAVIGATION__DISTANCE_CUMULEE:
				return distanceCumulee != null;
			case SchemaPackage.TYPE_BRANCHE_NAVIGATION__DUREE_PREVUE:
				return dureePrevue != null;
			case SchemaPackage.TYPE_BRANCHE_NAVIGATION__DUREE_PREVUE_RESTANT:
				return dureePrevueRestant != null;
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
		result.append(" (vitesseMoyenne: ");
		if (vitesseMoyenneESet) result.append(vitesseMoyenne); else result.append("<unset>");
		result.append(", typeVol: ");
		if (typeVolESet) result.append(typeVol); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeBrancheNavigationImpl
