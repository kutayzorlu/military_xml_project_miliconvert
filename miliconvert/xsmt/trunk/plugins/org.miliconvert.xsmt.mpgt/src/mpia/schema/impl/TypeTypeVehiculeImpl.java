/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeLongueur;
import mpia.meta.TypeDataTypeVolume;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoTypeVehiculeCategorie;
import mpia.schema.TypeTypeVehicule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Type Vehicule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeTypeVehiculeImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeVehiculeImpl#getClasse <em>Classe</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeVehiculeImpl#getNombreEssieux <em>Nombre Essieux</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeVehiculeImpl#getNombreRoues <em>Nombre Roues</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeVehiculeImpl#getChargeParEssieu <em>Charge Par Essieu</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeVehiculeImpl#getCapaciteReservoirPrincipale <em>Capacite Reservoir Principale</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeVehiculeImpl#getCapaciteReservoirSec <em>Capacite Reservoir Sec</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeVehiculeImpl#getRayonBraquageMaximal <em>Rayon Braquage Maximal</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeVehiculeImpl#getNombreGalets <em>Nombre Galets</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeVehiculeImpl#getNombreNourrices <em>Nombre Nourrices</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeVehiculeImpl#getMotricite <em>Motricite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeVehiculeImpl#getSpecialisation <em>Specialisation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeTypeVehiculeImpl extends TypeTypeEquipementImpl implements TypeTypeVehicule {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeVehiculeCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoTypeVehiculeCategorie.APC;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeVehiculeCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The default value of the '{@link #getClasse() <em>Classe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasse()
	 * @generated
	 * @ordered
	 */
	protected static final long CLASSE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getClasse() <em>Classe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasse()
	 * @generated
	 * @ordered
	 */
	protected long classe = CLASSE_EDEFAULT;

	/**
	 * This is true if the Classe attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean classeESet;

	/**
	 * The default value of the '{@link #getNombreEssieux() <em>Nombre Essieux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreEssieux()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_ESSIEUX_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreEssieux() <em>Nombre Essieux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreEssieux()
	 * @generated
	 * @ordered
	 */
	protected long nombreEssieux = NOMBRE_ESSIEUX_EDEFAULT;

	/**
	 * This is true if the Nombre Essieux attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreEssieuxESet;

	/**
	 * The default value of the '{@link #getNombreRoues() <em>Nombre Roues</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreRoues()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_ROUES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreRoues() <em>Nombre Roues</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreRoues()
	 * @generated
	 * @ordered
	 */
	protected long nombreRoues = NOMBRE_ROUES_EDEFAULT;

	/**
	 * This is true if the Nombre Roues attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreRouesESet;

	/**
	 * The default value of the '{@link #getChargeParEssieu() <em>Charge Par Essieu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargeParEssieu()
	 * @generated
	 * @ordered
	 */
	protected static final long CHARGE_PAR_ESSIEU_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getChargeParEssieu() <em>Charge Par Essieu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargeParEssieu()
	 * @generated
	 * @ordered
	 */
	protected long chargeParEssieu = CHARGE_PAR_ESSIEU_EDEFAULT;

	/**
	 * This is true if the Charge Par Essieu attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean chargeParEssieuESet;

	/**
	 * The cached value of the '{@link #getCapaciteReservoirPrincipale() <em>Capacite Reservoir Principale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapaciteReservoirPrincipale()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeVolume capaciteReservoirPrincipale;

	/**
	 * The cached value of the '{@link #getCapaciteReservoirSec() <em>Capacite Reservoir Sec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapaciteReservoirSec()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeVolume capaciteReservoirSec;

	/**
	 * The cached value of the '{@link #getRayonBraquageMaximal() <em>Rayon Braquage Maximal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRayonBraquageMaximal()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur rayonBraquageMaximal;

	/**
	 * The default value of the '{@link #getNombreGalets() <em>Nombre Galets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreGalets()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_GALETS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreGalets() <em>Nombre Galets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreGalets()
	 * @generated
	 * @ordered
	 */
	protected long nombreGalets = NOMBRE_GALETS_EDEFAULT;

	/**
	 * This is true if the Nombre Galets attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreGaletsESet;

	/**
	 * The default value of the '{@link #getNombreNourrices() <em>Nombre Nourrices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreNourrices()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_NOURRICES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreNourrices() <em>Nombre Nourrices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreNourrices()
	 * @generated
	 * @ordered
	 */
	protected long nombreNourrices = NOMBRE_NOURRICES_EDEFAULT;

	/**
	 * This is true if the Nombre Nourrices attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreNourricesESet;

	/**
	 * The default value of the '{@link #getMotricite() <em>Motricite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotricite()
	 * @generated
	 * @ordered
	 */
	protected static final String MOTRICITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMotricite() <em>Motricite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotricite()
	 * @generated
	 * @ordered
	 */
	protected String motricite = MOTRICITE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpecialisation() <em>Specialisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialisation()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIALISATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecialisation() <em>Specialisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialisation()
	 * @generated
	 * @ordered
	 */
	protected String specialisation = SPECIALISATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeTypeVehiculeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeTypeVehicule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeVehiculeCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoTypeVehiculeCategorie newCategorie) {
		TypeDictionaryDicoTypeVehiculeCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_VEHICULE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoTypeVehiculeCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_VEHICULE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCategorie() {
		return categorieESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getClasse() {
		return classe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClasse(long newClasse) {
		long oldClasse = classe;
		classe = newClasse;
		boolean oldClasseESet = classeESet;
		classeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_VEHICULE__CLASSE, oldClasse, classe, !oldClasseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClasse() {
		long oldClasse = classe;
		boolean oldClasseESet = classeESet;
		classe = CLASSE_EDEFAULT;
		classeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_VEHICULE__CLASSE, oldClasse, CLASSE_EDEFAULT, oldClasseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClasse() {
		return classeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreEssieux() {
		return nombreEssieux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreEssieux(long newNombreEssieux) {
		long oldNombreEssieux = nombreEssieux;
		nombreEssieux = newNombreEssieux;
		boolean oldNombreEssieuxESet = nombreEssieuxESet;
		nombreEssieuxESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_VEHICULE__NOMBRE_ESSIEUX, oldNombreEssieux, nombreEssieux, !oldNombreEssieuxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreEssieux() {
		long oldNombreEssieux = nombreEssieux;
		boolean oldNombreEssieuxESet = nombreEssieuxESet;
		nombreEssieux = NOMBRE_ESSIEUX_EDEFAULT;
		nombreEssieuxESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_VEHICULE__NOMBRE_ESSIEUX, oldNombreEssieux, NOMBRE_ESSIEUX_EDEFAULT, oldNombreEssieuxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreEssieux() {
		return nombreEssieuxESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreRoues() {
		return nombreRoues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreRoues(long newNombreRoues) {
		long oldNombreRoues = nombreRoues;
		nombreRoues = newNombreRoues;
		boolean oldNombreRouesESet = nombreRouesESet;
		nombreRouesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_VEHICULE__NOMBRE_ROUES, oldNombreRoues, nombreRoues, !oldNombreRouesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreRoues() {
		long oldNombreRoues = nombreRoues;
		boolean oldNombreRouesESet = nombreRouesESet;
		nombreRoues = NOMBRE_ROUES_EDEFAULT;
		nombreRouesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_VEHICULE__NOMBRE_ROUES, oldNombreRoues, NOMBRE_ROUES_EDEFAULT, oldNombreRouesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreRoues() {
		return nombreRouesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getChargeParEssieu() {
		return chargeParEssieu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChargeParEssieu(long newChargeParEssieu) {
		long oldChargeParEssieu = chargeParEssieu;
		chargeParEssieu = newChargeParEssieu;
		boolean oldChargeParEssieuESet = chargeParEssieuESet;
		chargeParEssieuESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_VEHICULE__CHARGE_PAR_ESSIEU, oldChargeParEssieu, chargeParEssieu, !oldChargeParEssieuESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetChargeParEssieu() {
		long oldChargeParEssieu = chargeParEssieu;
		boolean oldChargeParEssieuESet = chargeParEssieuESet;
		chargeParEssieu = CHARGE_PAR_ESSIEU_EDEFAULT;
		chargeParEssieuESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_VEHICULE__CHARGE_PAR_ESSIEU, oldChargeParEssieu, CHARGE_PAR_ESSIEU_EDEFAULT, oldChargeParEssieuESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetChargeParEssieu() {
		return chargeParEssieuESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeVolume getCapaciteReservoirPrincipale() {
		return capaciteReservoirPrincipale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCapaciteReservoirPrincipale(TypeDataTypeVolume newCapaciteReservoirPrincipale, NotificationChain msgs) {
		TypeDataTypeVolume oldCapaciteReservoirPrincipale = capaciteReservoirPrincipale;
		capaciteReservoirPrincipale = newCapaciteReservoirPrincipale;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_VEHICULE__CAPACITE_RESERVOIR_PRINCIPALE, oldCapaciteReservoirPrincipale, newCapaciteReservoirPrincipale);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapaciteReservoirPrincipale(TypeDataTypeVolume newCapaciteReservoirPrincipale) {
		if (newCapaciteReservoirPrincipale != capaciteReservoirPrincipale) {
			NotificationChain msgs = null;
			if (capaciteReservoirPrincipale != null)
				msgs = ((InternalEObject)capaciteReservoirPrincipale).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_VEHICULE__CAPACITE_RESERVOIR_PRINCIPALE, null, msgs);
			if (newCapaciteReservoirPrincipale != null)
				msgs = ((InternalEObject)newCapaciteReservoirPrincipale).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_VEHICULE__CAPACITE_RESERVOIR_PRINCIPALE, null, msgs);
			msgs = basicSetCapaciteReservoirPrincipale(newCapaciteReservoirPrincipale, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_VEHICULE__CAPACITE_RESERVOIR_PRINCIPALE, newCapaciteReservoirPrincipale, newCapaciteReservoirPrincipale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeVolume getCapaciteReservoirSec() {
		return capaciteReservoirSec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCapaciteReservoirSec(TypeDataTypeVolume newCapaciteReservoirSec, NotificationChain msgs) {
		TypeDataTypeVolume oldCapaciteReservoirSec = capaciteReservoirSec;
		capaciteReservoirSec = newCapaciteReservoirSec;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_VEHICULE__CAPACITE_RESERVOIR_SEC, oldCapaciteReservoirSec, newCapaciteReservoirSec);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapaciteReservoirSec(TypeDataTypeVolume newCapaciteReservoirSec) {
		if (newCapaciteReservoirSec != capaciteReservoirSec) {
			NotificationChain msgs = null;
			if (capaciteReservoirSec != null)
				msgs = ((InternalEObject)capaciteReservoirSec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_VEHICULE__CAPACITE_RESERVOIR_SEC, null, msgs);
			if (newCapaciteReservoirSec != null)
				msgs = ((InternalEObject)newCapaciteReservoirSec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_VEHICULE__CAPACITE_RESERVOIR_SEC, null, msgs);
			msgs = basicSetCapaciteReservoirSec(newCapaciteReservoirSec, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_VEHICULE__CAPACITE_RESERVOIR_SEC, newCapaciteReservoirSec, newCapaciteReservoirSec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getRayonBraquageMaximal() {
		return rayonBraquageMaximal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRayonBraquageMaximal(TypeDataTypeLongueur newRayonBraquageMaximal, NotificationChain msgs) {
		TypeDataTypeLongueur oldRayonBraquageMaximal = rayonBraquageMaximal;
		rayonBraquageMaximal = newRayonBraquageMaximal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_VEHICULE__RAYON_BRAQUAGE_MAXIMAL, oldRayonBraquageMaximal, newRayonBraquageMaximal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRayonBraquageMaximal(TypeDataTypeLongueur newRayonBraquageMaximal) {
		if (newRayonBraquageMaximal != rayonBraquageMaximal) {
			NotificationChain msgs = null;
			if (rayonBraquageMaximal != null)
				msgs = ((InternalEObject)rayonBraquageMaximal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_VEHICULE__RAYON_BRAQUAGE_MAXIMAL, null, msgs);
			if (newRayonBraquageMaximal != null)
				msgs = ((InternalEObject)newRayonBraquageMaximal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_VEHICULE__RAYON_BRAQUAGE_MAXIMAL, null, msgs);
			msgs = basicSetRayonBraquageMaximal(newRayonBraquageMaximal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_VEHICULE__RAYON_BRAQUAGE_MAXIMAL, newRayonBraquageMaximal, newRayonBraquageMaximal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreGalets() {
		return nombreGalets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreGalets(long newNombreGalets) {
		long oldNombreGalets = nombreGalets;
		nombreGalets = newNombreGalets;
		boolean oldNombreGaletsESet = nombreGaletsESet;
		nombreGaletsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_VEHICULE__NOMBRE_GALETS, oldNombreGalets, nombreGalets, !oldNombreGaletsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreGalets() {
		long oldNombreGalets = nombreGalets;
		boolean oldNombreGaletsESet = nombreGaletsESet;
		nombreGalets = NOMBRE_GALETS_EDEFAULT;
		nombreGaletsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_VEHICULE__NOMBRE_GALETS, oldNombreGalets, NOMBRE_GALETS_EDEFAULT, oldNombreGaletsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreGalets() {
		return nombreGaletsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreNourrices() {
		return nombreNourrices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreNourrices(long newNombreNourrices) {
		long oldNombreNourrices = nombreNourrices;
		nombreNourrices = newNombreNourrices;
		boolean oldNombreNourricesESet = nombreNourricesESet;
		nombreNourricesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_VEHICULE__NOMBRE_NOURRICES, oldNombreNourrices, nombreNourrices, !oldNombreNourricesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreNourrices() {
		long oldNombreNourrices = nombreNourrices;
		boolean oldNombreNourricesESet = nombreNourricesESet;
		nombreNourrices = NOMBRE_NOURRICES_EDEFAULT;
		nombreNourricesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_VEHICULE__NOMBRE_NOURRICES, oldNombreNourrices, NOMBRE_NOURRICES_EDEFAULT, oldNombreNourricesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreNourrices() {
		return nombreNourricesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMotricite() {
		return motricite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMotricite(String newMotricite) {
		String oldMotricite = motricite;
		motricite = newMotricite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_VEHICULE__MOTRICITE, oldMotricite, motricite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpecialisation() {
		return specialisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecialisation(String newSpecialisation) {
		String oldSpecialisation = specialisation;
		specialisation = newSpecialisation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_VEHICULE__SPECIALISATION, oldSpecialisation, specialisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_TYPE_VEHICULE__CAPACITE_RESERVOIR_PRINCIPALE:
				return basicSetCapaciteReservoirPrincipale(null, msgs);
			case SchemaPackage.TYPE_TYPE_VEHICULE__CAPACITE_RESERVOIR_SEC:
				return basicSetCapaciteReservoirSec(null, msgs);
			case SchemaPackage.TYPE_TYPE_VEHICULE__RAYON_BRAQUAGE_MAXIMAL:
				return basicSetRayonBraquageMaximal(null, msgs);
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
			case SchemaPackage.TYPE_TYPE_VEHICULE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_TYPE_VEHICULE__CLASSE:
				return new Long(getClasse());
			case SchemaPackage.TYPE_TYPE_VEHICULE__NOMBRE_ESSIEUX:
				return new Long(getNombreEssieux());
			case SchemaPackage.TYPE_TYPE_VEHICULE__NOMBRE_ROUES:
				return new Long(getNombreRoues());
			case SchemaPackage.TYPE_TYPE_VEHICULE__CHARGE_PAR_ESSIEU:
				return new Long(getChargeParEssieu());
			case SchemaPackage.TYPE_TYPE_VEHICULE__CAPACITE_RESERVOIR_PRINCIPALE:
				return getCapaciteReservoirPrincipale();
			case SchemaPackage.TYPE_TYPE_VEHICULE__CAPACITE_RESERVOIR_SEC:
				return getCapaciteReservoirSec();
			case SchemaPackage.TYPE_TYPE_VEHICULE__RAYON_BRAQUAGE_MAXIMAL:
				return getRayonBraquageMaximal();
			case SchemaPackage.TYPE_TYPE_VEHICULE__NOMBRE_GALETS:
				return new Long(getNombreGalets());
			case SchemaPackage.TYPE_TYPE_VEHICULE__NOMBRE_NOURRICES:
				return new Long(getNombreNourrices());
			case SchemaPackage.TYPE_TYPE_VEHICULE__MOTRICITE:
				return getMotricite();
			case SchemaPackage.TYPE_TYPE_VEHICULE__SPECIALISATION:
				return getSpecialisation();
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
			case SchemaPackage.TYPE_TYPE_VEHICULE__CATEGORIE:
				setCategorie((TypeDictionaryDicoTypeVehiculeCategorie)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_VEHICULE__CLASSE:
				setClasse(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_TYPE_VEHICULE__NOMBRE_ESSIEUX:
				setNombreEssieux(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_TYPE_VEHICULE__NOMBRE_ROUES:
				setNombreRoues(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_TYPE_VEHICULE__CHARGE_PAR_ESSIEU:
				setChargeParEssieu(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_TYPE_VEHICULE__CAPACITE_RESERVOIR_PRINCIPALE:
				setCapaciteReservoirPrincipale((TypeDataTypeVolume)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_VEHICULE__CAPACITE_RESERVOIR_SEC:
				setCapaciteReservoirSec((TypeDataTypeVolume)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_VEHICULE__RAYON_BRAQUAGE_MAXIMAL:
				setRayonBraquageMaximal((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_VEHICULE__NOMBRE_GALETS:
				setNombreGalets(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_TYPE_VEHICULE__NOMBRE_NOURRICES:
				setNombreNourrices(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_TYPE_VEHICULE__MOTRICITE:
				setMotricite((String)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_VEHICULE__SPECIALISATION:
				setSpecialisation((String)newValue);
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
			case SchemaPackage.TYPE_TYPE_VEHICULE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_TYPE_VEHICULE__CLASSE:
				unsetClasse();
				return;
			case SchemaPackage.TYPE_TYPE_VEHICULE__NOMBRE_ESSIEUX:
				unsetNombreEssieux();
				return;
			case SchemaPackage.TYPE_TYPE_VEHICULE__NOMBRE_ROUES:
				unsetNombreRoues();
				return;
			case SchemaPackage.TYPE_TYPE_VEHICULE__CHARGE_PAR_ESSIEU:
				unsetChargeParEssieu();
				return;
			case SchemaPackage.TYPE_TYPE_VEHICULE__CAPACITE_RESERVOIR_PRINCIPALE:
				setCapaciteReservoirPrincipale((TypeDataTypeVolume)null);
				return;
			case SchemaPackage.TYPE_TYPE_VEHICULE__CAPACITE_RESERVOIR_SEC:
				setCapaciteReservoirSec((TypeDataTypeVolume)null);
				return;
			case SchemaPackage.TYPE_TYPE_VEHICULE__RAYON_BRAQUAGE_MAXIMAL:
				setRayonBraquageMaximal((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_TYPE_VEHICULE__NOMBRE_GALETS:
				unsetNombreGalets();
				return;
			case SchemaPackage.TYPE_TYPE_VEHICULE__NOMBRE_NOURRICES:
				unsetNombreNourrices();
				return;
			case SchemaPackage.TYPE_TYPE_VEHICULE__MOTRICITE:
				setMotricite(MOTRICITE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TYPE_VEHICULE__SPECIALISATION:
				setSpecialisation(SPECIALISATION_EDEFAULT);
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
			case SchemaPackage.TYPE_TYPE_VEHICULE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_TYPE_VEHICULE__CLASSE:
				return isSetClasse();
			case SchemaPackage.TYPE_TYPE_VEHICULE__NOMBRE_ESSIEUX:
				return isSetNombreEssieux();
			case SchemaPackage.TYPE_TYPE_VEHICULE__NOMBRE_ROUES:
				return isSetNombreRoues();
			case SchemaPackage.TYPE_TYPE_VEHICULE__CHARGE_PAR_ESSIEU:
				return isSetChargeParEssieu();
			case SchemaPackage.TYPE_TYPE_VEHICULE__CAPACITE_RESERVOIR_PRINCIPALE:
				return capaciteReservoirPrincipale != null;
			case SchemaPackage.TYPE_TYPE_VEHICULE__CAPACITE_RESERVOIR_SEC:
				return capaciteReservoirSec != null;
			case SchemaPackage.TYPE_TYPE_VEHICULE__RAYON_BRAQUAGE_MAXIMAL:
				return rayonBraquageMaximal != null;
			case SchemaPackage.TYPE_TYPE_VEHICULE__NOMBRE_GALETS:
				return isSetNombreGalets();
			case SchemaPackage.TYPE_TYPE_VEHICULE__NOMBRE_NOURRICES:
				return isSetNombreNourrices();
			case SchemaPackage.TYPE_TYPE_VEHICULE__MOTRICITE:
				return MOTRICITE_EDEFAULT == null ? motricite != null : !MOTRICITE_EDEFAULT.equals(motricite);
			case SchemaPackage.TYPE_TYPE_VEHICULE__SPECIALISATION:
				return SPECIALISATION_EDEFAULT == null ? specialisation != null : !SPECIALISATION_EDEFAULT.equals(specialisation);
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
		result.append(" (categorie: ");
		if (categorieESet) result.append(categorie); else result.append("<unset>");
		result.append(", classe: ");
		if (classeESet) result.append(classe); else result.append("<unset>");
		result.append(", nombreEssieux: ");
		if (nombreEssieuxESet) result.append(nombreEssieux); else result.append("<unset>");
		result.append(", nombreRoues: ");
		if (nombreRouesESet) result.append(nombreRoues); else result.append("<unset>");
		result.append(", chargeParEssieu: ");
		if (chargeParEssieuESet) result.append(chargeParEssieu); else result.append("<unset>");
		result.append(", nombreGalets: ");
		if (nombreGaletsESet) result.append(nombreGalets); else result.append("<unset>");
		result.append(", nombreNourrices: ");
		if (nombreNourricesESet) result.append(nombreNourrices); else result.append("<unset>");
		result.append(", motricite: ");
		result.append(motricite);
		result.append(", specialisation: ");
		result.append(specialisation);
		result.append(')');
		return result.toString();
	}

} //TypeTypeVehiculeImpl
