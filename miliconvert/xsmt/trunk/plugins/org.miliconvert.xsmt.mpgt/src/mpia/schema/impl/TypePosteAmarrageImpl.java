/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeDuree;
import mpia.meta.TypeDataTypeLongueur;
import mpia.meta.TypeDataTypeMasse;
import mpia.meta.TypeDataTypeVolume;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoPosteAmarrageTypeBatimentPrincipal;
import mpia.schema.TypePosteAmarrage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Poste Amarrage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypePosteAmarrageImpl#getProfondeurAMareeBasse <em>Profondeur AMaree Basse</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePosteAmarrageImpl#getLargeurMaximale <em>Largeur Maximale</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePosteAmarrageImpl#getChargeEnLourdAcceptable <em>Charge En Lourd Acceptable</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePosteAmarrageImpl#getCapaciteMaximale <em>Capacite Maximale</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePosteAmarrageImpl#getNombreMaximumBatiment <em>Nombre Maximum Batiment</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePosteAmarrageImpl#getChargeExplosiveLimiteJour <em>Charge Explosive Limite Jour</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePosteAmarrageImpl#getChargeExplosiveLimiteNuit <em>Charge Explosive Limite Nuit</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePosteAmarrageImpl#isDesserteRailDisponible <em>Desserte Rail Disponible</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePosteAmarrageImpl#getTypeBatimentPrincipal <em>Type Batiment Principal</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePosteAmarrageImpl#isRoulage <em>Roulage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePosteAmarrageImpl#getTempsRotation <em>Temps Rotation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePosteAmarrageImpl#getSpecificites <em>Specificites</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypePosteAmarrageImpl extends TypeSiteImpl implements TypePosteAmarrage {
	/**
	 * The cached value of the '{@link #getProfondeurAMareeBasse() <em>Profondeur AMaree Basse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfondeurAMareeBasse()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur profondeurAMareeBasse;

	/**
	 * The cached value of the '{@link #getLargeurMaximale() <em>Largeur Maximale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargeurMaximale()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur largeurMaximale;

	/**
	 * The cached value of the '{@link #getChargeEnLourdAcceptable() <em>Charge En Lourd Acceptable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargeEnLourdAcceptable()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeMasse chargeEnLourdAcceptable;

	/**
	 * The cached value of the '{@link #getCapaciteMaximale() <em>Capacite Maximale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapaciteMaximale()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeVolume capaciteMaximale;

	/**
	 * The default value of the '{@link #getNombreMaximumBatiment() <em>Nombre Maximum Batiment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreMaximumBatiment()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_MAXIMUM_BATIMENT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreMaximumBatiment() <em>Nombre Maximum Batiment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreMaximumBatiment()
	 * @generated
	 * @ordered
	 */
	protected long nombreMaximumBatiment = NOMBRE_MAXIMUM_BATIMENT_EDEFAULT;

	/**
	 * This is true if the Nombre Maximum Batiment attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreMaximumBatimentESet;

	/**
	 * The cached value of the '{@link #getChargeExplosiveLimiteJour() <em>Charge Explosive Limite Jour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargeExplosiveLimiteJour()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeMasse chargeExplosiveLimiteJour;

	/**
	 * The cached value of the '{@link #getChargeExplosiveLimiteNuit() <em>Charge Explosive Limite Nuit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargeExplosiveLimiteNuit()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeMasse chargeExplosiveLimiteNuit;

	/**
	 * The default value of the '{@link #isDesserteRailDisponible() <em>Desserte Rail Disponible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDesserteRailDisponible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DESSERTE_RAIL_DISPONIBLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDesserteRailDisponible() <em>Desserte Rail Disponible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDesserteRailDisponible()
	 * @generated
	 * @ordered
	 */
	protected boolean desserteRailDisponible = DESSERTE_RAIL_DISPONIBLE_EDEFAULT;

	/**
	 * This is true if the Desserte Rail Disponible attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean desserteRailDisponibleESet;

	/**
	 * The default value of the '{@link #getTypeBatimentPrincipal() <em>Type Batiment Principal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeBatimentPrincipal()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPosteAmarrageTypeBatimentPrincipal TYPE_BATIMENT_PRINCIPAL_EDEFAULT = TypeDictionaryDicoPosteAmarrageTypeBatimentPrincipal.BARGE;

	/**
	 * The cached value of the '{@link #getTypeBatimentPrincipal() <em>Type Batiment Principal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeBatimentPrincipal()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPosteAmarrageTypeBatimentPrincipal typeBatimentPrincipal = TYPE_BATIMENT_PRINCIPAL_EDEFAULT;

	/**
	 * This is true if the Type Batiment Principal attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeBatimentPrincipalESet;

	/**
	 * The default value of the '{@link #isRoulage() <em>Roulage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRoulage()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ROULAGE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRoulage() <em>Roulage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRoulage()
	 * @generated
	 * @ordered
	 */
	protected boolean roulage = ROULAGE_EDEFAULT;

	/**
	 * This is true if the Roulage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean roulageESet;

	/**
	 * The cached value of the '{@link #getTempsRotation() <em>Temps Rotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempsRotation()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree tempsRotation;

	/**
	 * The default value of the '{@link #getSpecificites() <em>Specificites</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificites()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIFICITES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecificites() <em>Specificites</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificites()
	 * @generated
	 * @ordered
	 */
	protected String specificites = SPECIFICITES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypePosteAmarrageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypePosteAmarrage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getProfondeurAMareeBasse() {
		return profondeurAMareeBasse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProfondeurAMareeBasse(TypeDataTypeLongueur newProfondeurAMareeBasse, NotificationChain msgs) {
		TypeDataTypeLongueur oldProfondeurAMareeBasse = profondeurAMareeBasse;
		profondeurAMareeBasse = newProfondeurAMareeBasse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POSTE_AMARRAGE__PROFONDEUR_AMAREE_BASSE, oldProfondeurAMareeBasse, newProfondeurAMareeBasse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfondeurAMareeBasse(TypeDataTypeLongueur newProfondeurAMareeBasse) {
		if (newProfondeurAMareeBasse != profondeurAMareeBasse) {
			NotificationChain msgs = null;
			if (profondeurAMareeBasse != null)
				msgs = ((InternalEObject)profondeurAMareeBasse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POSTE_AMARRAGE__PROFONDEUR_AMAREE_BASSE, null, msgs);
			if (newProfondeurAMareeBasse != null)
				msgs = ((InternalEObject)newProfondeurAMareeBasse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POSTE_AMARRAGE__PROFONDEUR_AMAREE_BASSE, null, msgs);
			msgs = basicSetProfondeurAMareeBasse(newProfondeurAMareeBasse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POSTE_AMARRAGE__PROFONDEUR_AMAREE_BASSE, newProfondeurAMareeBasse, newProfondeurAMareeBasse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getLargeurMaximale() {
		return largeurMaximale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLargeurMaximale(TypeDataTypeLongueur newLargeurMaximale, NotificationChain msgs) {
		TypeDataTypeLongueur oldLargeurMaximale = largeurMaximale;
		largeurMaximale = newLargeurMaximale;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POSTE_AMARRAGE__LARGEUR_MAXIMALE, oldLargeurMaximale, newLargeurMaximale);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLargeurMaximale(TypeDataTypeLongueur newLargeurMaximale) {
		if (newLargeurMaximale != largeurMaximale) {
			NotificationChain msgs = null;
			if (largeurMaximale != null)
				msgs = ((InternalEObject)largeurMaximale).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POSTE_AMARRAGE__LARGEUR_MAXIMALE, null, msgs);
			if (newLargeurMaximale != null)
				msgs = ((InternalEObject)newLargeurMaximale).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POSTE_AMARRAGE__LARGEUR_MAXIMALE, null, msgs);
			msgs = basicSetLargeurMaximale(newLargeurMaximale, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POSTE_AMARRAGE__LARGEUR_MAXIMALE, newLargeurMaximale, newLargeurMaximale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeMasse getChargeEnLourdAcceptable() {
		return chargeEnLourdAcceptable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChargeEnLourdAcceptable(TypeDataTypeMasse newChargeEnLourdAcceptable, NotificationChain msgs) {
		TypeDataTypeMasse oldChargeEnLourdAcceptable = chargeEnLourdAcceptable;
		chargeEnLourdAcceptable = newChargeEnLourdAcceptable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POSTE_AMARRAGE__CHARGE_EN_LOURD_ACCEPTABLE, oldChargeEnLourdAcceptable, newChargeEnLourdAcceptable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChargeEnLourdAcceptable(TypeDataTypeMasse newChargeEnLourdAcceptable) {
		if (newChargeEnLourdAcceptable != chargeEnLourdAcceptable) {
			NotificationChain msgs = null;
			if (chargeEnLourdAcceptable != null)
				msgs = ((InternalEObject)chargeEnLourdAcceptable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POSTE_AMARRAGE__CHARGE_EN_LOURD_ACCEPTABLE, null, msgs);
			if (newChargeEnLourdAcceptable != null)
				msgs = ((InternalEObject)newChargeEnLourdAcceptable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POSTE_AMARRAGE__CHARGE_EN_LOURD_ACCEPTABLE, null, msgs);
			msgs = basicSetChargeEnLourdAcceptable(newChargeEnLourdAcceptable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POSTE_AMARRAGE__CHARGE_EN_LOURD_ACCEPTABLE, newChargeEnLourdAcceptable, newChargeEnLourdAcceptable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeVolume getCapaciteMaximale() {
		return capaciteMaximale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCapaciteMaximale(TypeDataTypeVolume newCapaciteMaximale, NotificationChain msgs) {
		TypeDataTypeVolume oldCapaciteMaximale = capaciteMaximale;
		capaciteMaximale = newCapaciteMaximale;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POSTE_AMARRAGE__CAPACITE_MAXIMALE, oldCapaciteMaximale, newCapaciteMaximale);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapaciteMaximale(TypeDataTypeVolume newCapaciteMaximale) {
		if (newCapaciteMaximale != capaciteMaximale) {
			NotificationChain msgs = null;
			if (capaciteMaximale != null)
				msgs = ((InternalEObject)capaciteMaximale).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POSTE_AMARRAGE__CAPACITE_MAXIMALE, null, msgs);
			if (newCapaciteMaximale != null)
				msgs = ((InternalEObject)newCapaciteMaximale).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POSTE_AMARRAGE__CAPACITE_MAXIMALE, null, msgs);
			msgs = basicSetCapaciteMaximale(newCapaciteMaximale, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POSTE_AMARRAGE__CAPACITE_MAXIMALE, newCapaciteMaximale, newCapaciteMaximale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreMaximumBatiment() {
		return nombreMaximumBatiment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreMaximumBatiment(long newNombreMaximumBatiment) {
		long oldNombreMaximumBatiment = nombreMaximumBatiment;
		nombreMaximumBatiment = newNombreMaximumBatiment;
		boolean oldNombreMaximumBatimentESet = nombreMaximumBatimentESet;
		nombreMaximumBatimentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POSTE_AMARRAGE__NOMBRE_MAXIMUM_BATIMENT, oldNombreMaximumBatiment, nombreMaximumBatiment, !oldNombreMaximumBatimentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreMaximumBatiment() {
		long oldNombreMaximumBatiment = nombreMaximumBatiment;
		boolean oldNombreMaximumBatimentESet = nombreMaximumBatimentESet;
		nombreMaximumBatiment = NOMBRE_MAXIMUM_BATIMENT_EDEFAULT;
		nombreMaximumBatimentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_POSTE_AMARRAGE__NOMBRE_MAXIMUM_BATIMENT, oldNombreMaximumBatiment, NOMBRE_MAXIMUM_BATIMENT_EDEFAULT, oldNombreMaximumBatimentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreMaximumBatiment() {
		return nombreMaximumBatimentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeMasse getChargeExplosiveLimiteJour() {
		return chargeExplosiveLimiteJour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChargeExplosiveLimiteJour(TypeDataTypeMasse newChargeExplosiveLimiteJour, NotificationChain msgs) {
		TypeDataTypeMasse oldChargeExplosiveLimiteJour = chargeExplosiveLimiteJour;
		chargeExplosiveLimiteJour = newChargeExplosiveLimiteJour;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POSTE_AMARRAGE__CHARGE_EXPLOSIVE_LIMITE_JOUR, oldChargeExplosiveLimiteJour, newChargeExplosiveLimiteJour);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChargeExplosiveLimiteJour(TypeDataTypeMasse newChargeExplosiveLimiteJour) {
		if (newChargeExplosiveLimiteJour != chargeExplosiveLimiteJour) {
			NotificationChain msgs = null;
			if (chargeExplosiveLimiteJour != null)
				msgs = ((InternalEObject)chargeExplosiveLimiteJour).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POSTE_AMARRAGE__CHARGE_EXPLOSIVE_LIMITE_JOUR, null, msgs);
			if (newChargeExplosiveLimiteJour != null)
				msgs = ((InternalEObject)newChargeExplosiveLimiteJour).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POSTE_AMARRAGE__CHARGE_EXPLOSIVE_LIMITE_JOUR, null, msgs);
			msgs = basicSetChargeExplosiveLimiteJour(newChargeExplosiveLimiteJour, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POSTE_AMARRAGE__CHARGE_EXPLOSIVE_LIMITE_JOUR, newChargeExplosiveLimiteJour, newChargeExplosiveLimiteJour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeMasse getChargeExplosiveLimiteNuit() {
		return chargeExplosiveLimiteNuit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChargeExplosiveLimiteNuit(TypeDataTypeMasse newChargeExplosiveLimiteNuit, NotificationChain msgs) {
		TypeDataTypeMasse oldChargeExplosiveLimiteNuit = chargeExplosiveLimiteNuit;
		chargeExplosiveLimiteNuit = newChargeExplosiveLimiteNuit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POSTE_AMARRAGE__CHARGE_EXPLOSIVE_LIMITE_NUIT, oldChargeExplosiveLimiteNuit, newChargeExplosiveLimiteNuit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChargeExplosiveLimiteNuit(TypeDataTypeMasse newChargeExplosiveLimiteNuit) {
		if (newChargeExplosiveLimiteNuit != chargeExplosiveLimiteNuit) {
			NotificationChain msgs = null;
			if (chargeExplosiveLimiteNuit != null)
				msgs = ((InternalEObject)chargeExplosiveLimiteNuit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POSTE_AMARRAGE__CHARGE_EXPLOSIVE_LIMITE_NUIT, null, msgs);
			if (newChargeExplosiveLimiteNuit != null)
				msgs = ((InternalEObject)newChargeExplosiveLimiteNuit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POSTE_AMARRAGE__CHARGE_EXPLOSIVE_LIMITE_NUIT, null, msgs);
			msgs = basicSetChargeExplosiveLimiteNuit(newChargeExplosiveLimiteNuit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POSTE_AMARRAGE__CHARGE_EXPLOSIVE_LIMITE_NUIT, newChargeExplosiveLimiteNuit, newChargeExplosiveLimiteNuit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDesserteRailDisponible() {
		return desserteRailDisponible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesserteRailDisponible(boolean newDesserteRailDisponible) {
		boolean oldDesserteRailDisponible = desserteRailDisponible;
		desserteRailDisponible = newDesserteRailDisponible;
		boolean oldDesserteRailDisponibleESet = desserteRailDisponibleESet;
		desserteRailDisponibleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POSTE_AMARRAGE__DESSERTE_RAIL_DISPONIBLE, oldDesserteRailDisponible, desserteRailDisponible, !oldDesserteRailDisponibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDesserteRailDisponible() {
		boolean oldDesserteRailDisponible = desserteRailDisponible;
		boolean oldDesserteRailDisponibleESet = desserteRailDisponibleESet;
		desserteRailDisponible = DESSERTE_RAIL_DISPONIBLE_EDEFAULT;
		desserteRailDisponibleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_POSTE_AMARRAGE__DESSERTE_RAIL_DISPONIBLE, oldDesserteRailDisponible, DESSERTE_RAIL_DISPONIBLE_EDEFAULT, oldDesserteRailDisponibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDesserteRailDisponible() {
		return desserteRailDisponibleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoPosteAmarrageTypeBatimentPrincipal getTypeBatimentPrincipal() {
		return typeBatimentPrincipal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeBatimentPrincipal(TypeDictionaryDicoPosteAmarrageTypeBatimentPrincipal newTypeBatimentPrincipal) {
		TypeDictionaryDicoPosteAmarrageTypeBatimentPrincipal oldTypeBatimentPrincipal = typeBatimentPrincipal;
		typeBatimentPrincipal = newTypeBatimentPrincipal == null ? TYPE_BATIMENT_PRINCIPAL_EDEFAULT : newTypeBatimentPrincipal;
		boolean oldTypeBatimentPrincipalESet = typeBatimentPrincipalESet;
		typeBatimentPrincipalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POSTE_AMARRAGE__TYPE_BATIMENT_PRINCIPAL, oldTypeBatimentPrincipal, typeBatimentPrincipal, !oldTypeBatimentPrincipalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeBatimentPrincipal() {
		TypeDictionaryDicoPosteAmarrageTypeBatimentPrincipal oldTypeBatimentPrincipal = typeBatimentPrincipal;
		boolean oldTypeBatimentPrincipalESet = typeBatimentPrincipalESet;
		typeBatimentPrincipal = TYPE_BATIMENT_PRINCIPAL_EDEFAULT;
		typeBatimentPrincipalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_POSTE_AMARRAGE__TYPE_BATIMENT_PRINCIPAL, oldTypeBatimentPrincipal, TYPE_BATIMENT_PRINCIPAL_EDEFAULT, oldTypeBatimentPrincipalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeBatimentPrincipal() {
		return typeBatimentPrincipalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRoulage() {
		return roulage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoulage(boolean newRoulage) {
		boolean oldRoulage = roulage;
		roulage = newRoulage;
		boolean oldRoulageESet = roulageESet;
		roulageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POSTE_AMARRAGE__ROULAGE, oldRoulage, roulage, !oldRoulageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRoulage() {
		boolean oldRoulage = roulage;
		boolean oldRoulageESet = roulageESet;
		roulage = ROULAGE_EDEFAULT;
		roulageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_POSTE_AMARRAGE__ROULAGE, oldRoulage, ROULAGE_EDEFAULT, oldRoulageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRoulage() {
		return roulageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getTempsRotation() {
		return tempsRotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTempsRotation(TypeDataTypeDuree newTempsRotation, NotificationChain msgs) {
		TypeDataTypeDuree oldTempsRotation = tempsRotation;
		tempsRotation = newTempsRotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POSTE_AMARRAGE__TEMPS_ROTATION, oldTempsRotation, newTempsRotation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTempsRotation(TypeDataTypeDuree newTempsRotation) {
		if (newTempsRotation != tempsRotation) {
			NotificationChain msgs = null;
			if (tempsRotation != null)
				msgs = ((InternalEObject)tempsRotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POSTE_AMARRAGE__TEMPS_ROTATION, null, msgs);
			if (newTempsRotation != null)
				msgs = ((InternalEObject)newTempsRotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POSTE_AMARRAGE__TEMPS_ROTATION, null, msgs);
			msgs = basicSetTempsRotation(newTempsRotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POSTE_AMARRAGE__TEMPS_ROTATION, newTempsRotation, newTempsRotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpecificites() {
		return specificites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecificites(String newSpecificites) {
		String oldSpecificites = specificites;
		specificites = newSpecificites;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POSTE_AMARRAGE__SPECIFICITES, oldSpecificites, specificites));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_POSTE_AMARRAGE__PROFONDEUR_AMAREE_BASSE:
				return basicSetProfondeurAMareeBasse(null, msgs);
			case SchemaPackage.TYPE_POSTE_AMARRAGE__LARGEUR_MAXIMALE:
				return basicSetLargeurMaximale(null, msgs);
			case SchemaPackage.TYPE_POSTE_AMARRAGE__CHARGE_EN_LOURD_ACCEPTABLE:
				return basicSetChargeEnLourdAcceptable(null, msgs);
			case SchemaPackage.TYPE_POSTE_AMARRAGE__CAPACITE_MAXIMALE:
				return basicSetCapaciteMaximale(null, msgs);
			case SchemaPackage.TYPE_POSTE_AMARRAGE__CHARGE_EXPLOSIVE_LIMITE_JOUR:
				return basicSetChargeExplosiveLimiteJour(null, msgs);
			case SchemaPackage.TYPE_POSTE_AMARRAGE__CHARGE_EXPLOSIVE_LIMITE_NUIT:
				return basicSetChargeExplosiveLimiteNuit(null, msgs);
			case SchemaPackage.TYPE_POSTE_AMARRAGE__TEMPS_ROTATION:
				return basicSetTempsRotation(null, msgs);
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
			case SchemaPackage.TYPE_POSTE_AMARRAGE__PROFONDEUR_AMAREE_BASSE:
				return getProfondeurAMareeBasse();
			case SchemaPackage.TYPE_POSTE_AMARRAGE__LARGEUR_MAXIMALE:
				return getLargeurMaximale();
			case SchemaPackage.TYPE_POSTE_AMARRAGE__CHARGE_EN_LOURD_ACCEPTABLE:
				return getChargeEnLourdAcceptable();
			case SchemaPackage.TYPE_POSTE_AMARRAGE__CAPACITE_MAXIMALE:
				return getCapaciteMaximale();
			case SchemaPackage.TYPE_POSTE_AMARRAGE__NOMBRE_MAXIMUM_BATIMENT:
				return new Long(getNombreMaximumBatiment());
			case SchemaPackage.TYPE_POSTE_AMARRAGE__CHARGE_EXPLOSIVE_LIMITE_JOUR:
				return getChargeExplosiveLimiteJour();
			case SchemaPackage.TYPE_POSTE_AMARRAGE__CHARGE_EXPLOSIVE_LIMITE_NUIT:
				return getChargeExplosiveLimiteNuit();
			case SchemaPackage.TYPE_POSTE_AMARRAGE__DESSERTE_RAIL_DISPONIBLE:
				return isDesserteRailDisponible() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_POSTE_AMARRAGE__TYPE_BATIMENT_PRINCIPAL:
				return getTypeBatimentPrincipal();
			case SchemaPackage.TYPE_POSTE_AMARRAGE__ROULAGE:
				return isRoulage() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_POSTE_AMARRAGE__TEMPS_ROTATION:
				return getTempsRotation();
			case SchemaPackage.TYPE_POSTE_AMARRAGE__SPECIFICITES:
				return getSpecificites();
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
			case SchemaPackage.TYPE_POSTE_AMARRAGE__PROFONDEUR_AMAREE_BASSE:
				setProfondeurAMareeBasse((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_POSTE_AMARRAGE__LARGEUR_MAXIMALE:
				setLargeurMaximale((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_POSTE_AMARRAGE__CHARGE_EN_LOURD_ACCEPTABLE:
				setChargeEnLourdAcceptable((TypeDataTypeMasse)newValue);
				return;
			case SchemaPackage.TYPE_POSTE_AMARRAGE__CAPACITE_MAXIMALE:
				setCapaciteMaximale((TypeDataTypeVolume)newValue);
				return;
			case SchemaPackage.TYPE_POSTE_AMARRAGE__NOMBRE_MAXIMUM_BATIMENT:
				setNombreMaximumBatiment(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_POSTE_AMARRAGE__CHARGE_EXPLOSIVE_LIMITE_JOUR:
				setChargeExplosiveLimiteJour((TypeDataTypeMasse)newValue);
				return;
			case SchemaPackage.TYPE_POSTE_AMARRAGE__CHARGE_EXPLOSIVE_LIMITE_NUIT:
				setChargeExplosiveLimiteNuit((TypeDataTypeMasse)newValue);
				return;
			case SchemaPackage.TYPE_POSTE_AMARRAGE__DESSERTE_RAIL_DISPONIBLE:
				setDesserteRailDisponible(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_POSTE_AMARRAGE__TYPE_BATIMENT_PRINCIPAL:
				setTypeBatimentPrincipal((TypeDictionaryDicoPosteAmarrageTypeBatimentPrincipal)newValue);
				return;
			case SchemaPackage.TYPE_POSTE_AMARRAGE__ROULAGE:
				setRoulage(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_POSTE_AMARRAGE__TEMPS_ROTATION:
				setTempsRotation((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_POSTE_AMARRAGE__SPECIFICITES:
				setSpecificites((String)newValue);
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
			case SchemaPackage.TYPE_POSTE_AMARRAGE__PROFONDEUR_AMAREE_BASSE:
				setProfondeurAMareeBasse((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_POSTE_AMARRAGE__LARGEUR_MAXIMALE:
				setLargeurMaximale((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_POSTE_AMARRAGE__CHARGE_EN_LOURD_ACCEPTABLE:
				setChargeEnLourdAcceptable((TypeDataTypeMasse)null);
				return;
			case SchemaPackage.TYPE_POSTE_AMARRAGE__CAPACITE_MAXIMALE:
				setCapaciteMaximale((TypeDataTypeVolume)null);
				return;
			case SchemaPackage.TYPE_POSTE_AMARRAGE__NOMBRE_MAXIMUM_BATIMENT:
				unsetNombreMaximumBatiment();
				return;
			case SchemaPackage.TYPE_POSTE_AMARRAGE__CHARGE_EXPLOSIVE_LIMITE_JOUR:
				setChargeExplosiveLimiteJour((TypeDataTypeMasse)null);
				return;
			case SchemaPackage.TYPE_POSTE_AMARRAGE__CHARGE_EXPLOSIVE_LIMITE_NUIT:
				setChargeExplosiveLimiteNuit((TypeDataTypeMasse)null);
				return;
			case SchemaPackage.TYPE_POSTE_AMARRAGE__DESSERTE_RAIL_DISPONIBLE:
				unsetDesserteRailDisponible();
				return;
			case SchemaPackage.TYPE_POSTE_AMARRAGE__TYPE_BATIMENT_PRINCIPAL:
				unsetTypeBatimentPrincipal();
				return;
			case SchemaPackage.TYPE_POSTE_AMARRAGE__ROULAGE:
				unsetRoulage();
				return;
			case SchemaPackage.TYPE_POSTE_AMARRAGE__TEMPS_ROTATION:
				setTempsRotation((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_POSTE_AMARRAGE__SPECIFICITES:
				setSpecificites(SPECIFICITES_EDEFAULT);
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
			case SchemaPackage.TYPE_POSTE_AMARRAGE__PROFONDEUR_AMAREE_BASSE:
				return profondeurAMareeBasse != null;
			case SchemaPackage.TYPE_POSTE_AMARRAGE__LARGEUR_MAXIMALE:
				return largeurMaximale != null;
			case SchemaPackage.TYPE_POSTE_AMARRAGE__CHARGE_EN_LOURD_ACCEPTABLE:
				return chargeEnLourdAcceptable != null;
			case SchemaPackage.TYPE_POSTE_AMARRAGE__CAPACITE_MAXIMALE:
				return capaciteMaximale != null;
			case SchemaPackage.TYPE_POSTE_AMARRAGE__NOMBRE_MAXIMUM_BATIMENT:
				return isSetNombreMaximumBatiment();
			case SchemaPackage.TYPE_POSTE_AMARRAGE__CHARGE_EXPLOSIVE_LIMITE_JOUR:
				return chargeExplosiveLimiteJour != null;
			case SchemaPackage.TYPE_POSTE_AMARRAGE__CHARGE_EXPLOSIVE_LIMITE_NUIT:
				return chargeExplosiveLimiteNuit != null;
			case SchemaPackage.TYPE_POSTE_AMARRAGE__DESSERTE_RAIL_DISPONIBLE:
				return isSetDesserteRailDisponible();
			case SchemaPackage.TYPE_POSTE_AMARRAGE__TYPE_BATIMENT_PRINCIPAL:
				return isSetTypeBatimentPrincipal();
			case SchemaPackage.TYPE_POSTE_AMARRAGE__ROULAGE:
				return isSetRoulage();
			case SchemaPackage.TYPE_POSTE_AMARRAGE__TEMPS_ROTATION:
				return tempsRotation != null;
			case SchemaPackage.TYPE_POSTE_AMARRAGE__SPECIFICITES:
				return SPECIFICITES_EDEFAULT == null ? specificites != null : !SPECIFICITES_EDEFAULT.equals(specificites);
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
		result.append(" (nombreMaximumBatiment: ");
		if (nombreMaximumBatimentESet) result.append(nombreMaximumBatiment); else result.append("<unset>");
		result.append(", desserteRailDisponible: ");
		if (desserteRailDisponibleESet) result.append(desserteRailDisponible); else result.append("<unset>");
		result.append(", typeBatimentPrincipal: ");
		if (typeBatimentPrincipalESet) result.append(typeBatimentPrincipal); else result.append("<unset>");
		result.append(", roulage: ");
		if (roulageESet) result.append(roulage); else result.append("<unset>");
		result.append(", specificites: ");
		result.append(specificites);
		result.append(')');
		return result.toString();
	}

} //TypePosteAmarrageImpl
