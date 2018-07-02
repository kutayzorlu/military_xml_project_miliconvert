/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeConsigneTir;
import mpia.schema.TypeDictionaryDicoConsigneTir;
import mpia.schema.TypePeriode3D;

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
 * An implementation of the model object '<em><b>Type Consigne Tir</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeConsigneTirImpl#getConsigneTirGenerale <em>Consigne Tir Generale</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsigneTirImpl#getConsigneTirSurAvion <em>Consigne Tir Sur Avion</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsigneTirImpl#getConsigneTirSurDrone <em>Consigne Tir Sur Drone</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsigneTirImpl#getConsigneTirSurHelicoptere <em>Consigne Tir Sur Helicoptere</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsigneTirImpl#getConsigneTirSurMissile <em>Consigne Tir Sur Missile</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsigneTirImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsigneTirImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsigneTirImpl#getSAppliqueAMenaceAerienneMenaceAerienne <em>SApplique AMenace Aerienne Menace Aerienne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsigneTirImpl#getSAppliqueSurAutreElementControle <em>SApplique Sur Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsigneTirImpl#getEstDefiniePourUnite <em>Est Definie Pour Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsigneTirImpl#getDefinitPourTypeMesureCoordinationTypeMesureCoordination <em>Definit Pour Type Mesure Coordination Type Mesure Coordination</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsigneTirImpl#getDefinitPourSystemeArmeTypeArme <em>Definit Pour Systeme Arme Type Arme</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsigneTirImpl#getVautPendantPeriode3D <em>Vaut Pendant Periode3 D</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsigneTirImpl#getDefinitPourMesureCoordinationMesureCoordination <em>Definit Pour Mesure Coordination Mesure Coordination</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeConsigneTirImpl extends EObjectImpl implements TypeConsigneTir {
	/**
	 * The default value of the '{@link #getConsigneTirGenerale() <em>Consigne Tir Generale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsigneTirGenerale()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoConsigneTir CONSIGNE_TIR_GENERALE_EDEFAULT = TypeDictionaryDicoConsigneTir.UNLTD;

	/**
	 * The cached value of the '{@link #getConsigneTirGenerale() <em>Consigne Tir Generale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsigneTirGenerale()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoConsigneTir consigneTirGenerale = CONSIGNE_TIR_GENERALE_EDEFAULT;

	/**
	 * This is true if the Consigne Tir Generale attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean consigneTirGeneraleESet;

	/**
	 * The default value of the '{@link #getConsigneTirSurAvion() <em>Consigne Tir Sur Avion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsigneTirSurAvion()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoConsigneTir CONSIGNE_TIR_SUR_AVION_EDEFAULT = TypeDictionaryDicoConsigneTir.UNLTD;

	/**
	 * The cached value of the '{@link #getConsigneTirSurAvion() <em>Consigne Tir Sur Avion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsigneTirSurAvion()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoConsigneTir consigneTirSurAvion = CONSIGNE_TIR_SUR_AVION_EDEFAULT;

	/**
	 * This is true if the Consigne Tir Sur Avion attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean consigneTirSurAvionESet;

	/**
	 * The default value of the '{@link #getConsigneTirSurDrone() <em>Consigne Tir Sur Drone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsigneTirSurDrone()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoConsigneTir CONSIGNE_TIR_SUR_DRONE_EDEFAULT = TypeDictionaryDicoConsigneTir.UNLTD;

	/**
	 * The cached value of the '{@link #getConsigneTirSurDrone() <em>Consigne Tir Sur Drone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsigneTirSurDrone()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoConsigneTir consigneTirSurDrone = CONSIGNE_TIR_SUR_DRONE_EDEFAULT;

	/**
	 * This is true if the Consigne Tir Sur Drone attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean consigneTirSurDroneESet;

	/**
	 * The default value of the '{@link #getConsigneTirSurHelicoptere() <em>Consigne Tir Sur Helicoptere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsigneTirSurHelicoptere()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoConsigneTir CONSIGNE_TIR_SUR_HELICOPTERE_EDEFAULT = TypeDictionaryDicoConsigneTir.UNLTD;

	/**
	 * The cached value of the '{@link #getConsigneTirSurHelicoptere() <em>Consigne Tir Sur Helicoptere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsigneTirSurHelicoptere()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoConsigneTir consigneTirSurHelicoptere = CONSIGNE_TIR_SUR_HELICOPTERE_EDEFAULT;

	/**
	 * This is true if the Consigne Tir Sur Helicoptere attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean consigneTirSurHelicoptereESet;

	/**
	 * The default value of the '{@link #getConsigneTirSurMissile() <em>Consigne Tir Sur Missile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsigneTirSurMissile()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoConsigneTir CONSIGNE_TIR_SUR_MISSILE_EDEFAULT = TypeDictionaryDicoConsigneTir.UNLTD;

	/**
	 * The cached value of the '{@link #getConsigneTirSurMissile() <em>Consigne Tir Sur Missile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsigneTirSurMissile()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoConsigneTir consigneTirSurMissile = CONSIGNE_TIR_SUR_MISSILE_EDEFAULT;

	/**
	 * This is true if the Consigne Tir Sur Missile attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean consigneTirSurMissileESet;

	/**
	 * The default value of the '{@link #getCTE() <em>CTE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCTE()
	 * @generated
	 * @ordered
	 */
	protected static final String CTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCTE() <em>CTE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCTE()
	 * @generated
	 * @ordered
	 */
	protected String cTE = CTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCE() <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCE()
	 * @generated
	 * @ordered
	 */
	protected static final String CE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCE() <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCE()
	 * @generated
	 * @ordered
	 */
	protected String cE = CE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSAppliqueAMenaceAerienneMenaceAerienne() <em>SApplique AMenace Aerienne Menace Aerienne</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAppliqueAMenaceAerienneMenaceAerienne()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation sAppliqueAMenaceAerienneMenaceAerienne;

	/**
	 * The cached value of the '{@link #getSAppliqueSurAutreElementControle() <em>SApplique Sur Autre Element Controle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAppliqueSurAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> sAppliqueSurAutreElementControle;

	/**
	 * The cached value of the '{@link #getEstDefiniePourUnite() <em>Est Definie Pour Unite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstDefiniePourUnite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociationEXT> estDefiniePourUnite;

	/**
	 * The cached value of the '{@link #getDefinitPourTypeMesureCoordinationTypeMesureCoordination() <em>Definit Pour Type Mesure Coordination Type Mesure Coordination</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitPourTypeMesureCoordinationTypeMesureCoordination()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> definitPourTypeMesureCoordinationTypeMesureCoordination;

	/**
	 * The cached value of the '{@link #getDefinitPourSystemeArmeTypeArme() <em>Definit Pour Systeme Arme Type Arme</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitPourSystemeArmeTypeArme()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT definitPourSystemeArmeTypeArme;

	/**
	 * The cached value of the '{@link #getVautPendantPeriode3D() <em>Vaut Pendant Periode3 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVautPendantPeriode3D()
	 * @generated
	 * @ordered
	 */
	protected TypePeriode3D vautPendantPeriode3D;

	/**
	 * The cached value of the '{@link #getDefinitPourMesureCoordinationMesureCoordination() <em>Definit Pour Mesure Coordination Mesure Coordination</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitPourMesureCoordinationMesureCoordination()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> definitPourMesureCoordinationMesureCoordination;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeConsigneTirImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeConsigneTir();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoConsigneTir getConsigneTirGenerale() {
		return consigneTirGenerale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsigneTirGenerale(TypeDictionaryDicoConsigneTir newConsigneTirGenerale) {
		TypeDictionaryDicoConsigneTir oldConsigneTirGenerale = consigneTirGenerale;
		consigneTirGenerale = newConsigneTirGenerale == null ? CONSIGNE_TIR_GENERALE_EDEFAULT : newConsigneTirGenerale;
		boolean oldConsigneTirGeneraleESet = consigneTirGeneraleESet;
		consigneTirGeneraleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNE_TIR__CONSIGNE_TIR_GENERALE, oldConsigneTirGenerale, consigneTirGenerale, !oldConsigneTirGeneraleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConsigneTirGenerale() {
		TypeDictionaryDicoConsigneTir oldConsigneTirGenerale = consigneTirGenerale;
		boolean oldConsigneTirGeneraleESet = consigneTirGeneraleESet;
		consigneTirGenerale = CONSIGNE_TIR_GENERALE_EDEFAULT;
		consigneTirGeneraleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CONSIGNE_TIR__CONSIGNE_TIR_GENERALE, oldConsigneTirGenerale, CONSIGNE_TIR_GENERALE_EDEFAULT, oldConsigneTirGeneraleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConsigneTirGenerale() {
		return consigneTirGeneraleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoConsigneTir getConsigneTirSurAvion() {
		return consigneTirSurAvion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsigneTirSurAvion(TypeDictionaryDicoConsigneTir newConsigneTirSurAvion) {
		TypeDictionaryDicoConsigneTir oldConsigneTirSurAvion = consigneTirSurAvion;
		consigneTirSurAvion = newConsigneTirSurAvion == null ? CONSIGNE_TIR_SUR_AVION_EDEFAULT : newConsigneTirSurAvion;
		boolean oldConsigneTirSurAvionESet = consigneTirSurAvionESet;
		consigneTirSurAvionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNE_TIR__CONSIGNE_TIR_SUR_AVION, oldConsigneTirSurAvion, consigneTirSurAvion, !oldConsigneTirSurAvionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConsigneTirSurAvion() {
		TypeDictionaryDicoConsigneTir oldConsigneTirSurAvion = consigneTirSurAvion;
		boolean oldConsigneTirSurAvionESet = consigneTirSurAvionESet;
		consigneTirSurAvion = CONSIGNE_TIR_SUR_AVION_EDEFAULT;
		consigneTirSurAvionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CONSIGNE_TIR__CONSIGNE_TIR_SUR_AVION, oldConsigneTirSurAvion, CONSIGNE_TIR_SUR_AVION_EDEFAULT, oldConsigneTirSurAvionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConsigneTirSurAvion() {
		return consigneTirSurAvionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoConsigneTir getConsigneTirSurDrone() {
		return consigneTirSurDrone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsigneTirSurDrone(TypeDictionaryDicoConsigneTir newConsigneTirSurDrone) {
		TypeDictionaryDicoConsigneTir oldConsigneTirSurDrone = consigneTirSurDrone;
		consigneTirSurDrone = newConsigneTirSurDrone == null ? CONSIGNE_TIR_SUR_DRONE_EDEFAULT : newConsigneTirSurDrone;
		boolean oldConsigneTirSurDroneESet = consigneTirSurDroneESet;
		consigneTirSurDroneESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNE_TIR__CONSIGNE_TIR_SUR_DRONE, oldConsigneTirSurDrone, consigneTirSurDrone, !oldConsigneTirSurDroneESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConsigneTirSurDrone() {
		TypeDictionaryDicoConsigneTir oldConsigneTirSurDrone = consigneTirSurDrone;
		boolean oldConsigneTirSurDroneESet = consigneTirSurDroneESet;
		consigneTirSurDrone = CONSIGNE_TIR_SUR_DRONE_EDEFAULT;
		consigneTirSurDroneESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CONSIGNE_TIR__CONSIGNE_TIR_SUR_DRONE, oldConsigneTirSurDrone, CONSIGNE_TIR_SUR_DRONE_EDEFAULT, oldConsigneTirSurDroneESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConsigneTirSurDrone() {
		return consigneTirSurDroneESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoConsigneTir getConsigneTirSurHelicoptere() {
		return consigneTirSurHelicoptere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsigneTirSurHelicoptere(TypeDictionaryDicoConsigneTir newConsigneTirSurHelicoptere) {
		TypeDictionaryDicoConsigneTir oldConsigneTirSurHelicoptere = consigneTirSurHelicoptere;
		consigneTirSurHelicoptere = newConsigneTirSurHelicoptere == null ? CONSIGNE_TIR_SUR_HELICOPTERE_EDEFAULT : newConsigneTirSurHelicoptere;
		boolean oldConsigneTirSurHelicoptereESet = consigneTirSurHelicoptereESet;
		consigneTirSurHelicoptereESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNE_TIR__CONSIGNE_TIR_SUR_HELICOPTERE, oldConsigneTirSurHelicoptere, consigneTirSurHelicoptere, !oldConsigneTirSurHelicoptereESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConsigneTirSurHelicoptere() {
		TypeDictionaryDicoConsigneTir oldConsigneTirSurHelicoptere = consigneTirSurHelicoptere;
		boolean oldConsigneTirSurHelicoptereESet = consigneTirSurHelicoptereESet;
		consigneTirSurHelicoptere = CONSIGNE_TIR_SUR_HELICOPTERE_EDEFAULT;
		consigneTirSurHelicoptereESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CONSIGNE_TIR__CONSIGNE_TIR_SUR_HELICOPTERE, oldConsigneTirSurHelicoptere, CONSIGNE_TIR_SUR_HELICOPTERE_EDEFAULT, oldConsigneTirSurHelicoptereESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConsigneTirSurHelicoptere() {
		return consigneTirSurHelicoptereESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoConsigneTir getConsigneTirSurMissile() {
		return consigneTirSurMissile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsigneTirSurMissile(TypeDictionaryDicoConsigneTir newConsigneTirSurMissile) {
		TypeDictionaryDicoConsigneTir oldConsigneTirSurMissile = consigneTirSurMissile;
		consigneTirSurMissile = newConsigneTirSurMissile == null ? CONSIGNE_TIR_SUR_MISSILE_EDEFAULT : newConsigneTirSurMissile;
		boolean oldConsigneTirSurMissileESet = consigneTirSurMissileESet;
		consigneTirSurMissileESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNE_TIR__CONSIGNE_TIR_SUR_MISSILE, oldConsigneTirSurMissile, consigneTirSurMissile, !oldConsigneTirSurMissileESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConsigneTirSurMissile() {
		TypeDictionaryDicoConsigneTir oldConsigneTirSurMissile = consigneTirSurMissile;
		boolean oldConsigneTirSurMissileESet = consigneTirSurMissileESet;
		consigneTirSurMissile = CONSIGNE_TIR_SUR_MISSILE_EDEFAULT;
		consigneTirSurMissileESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CONSIGNE_TIR__CONSIGNE_TIR_SUR_MISSILE, oldConsigneTirSurMissile, CONSIGNE_TIR_SUR_MISSILE_EDEFAULT, oldConsigneTirSurMissileESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConsigneTirSurMissile() {
		return consigneTirSurMissileESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCTE() {
		return cTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCTE(String newCTE) {
		String oldCTE = cTE;
		cTE = newCTE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNE_TIR__CTE, oldCTE, cTE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCE() {
		return cE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCE(String newCE) {
		String oldCE = cE;
		cE = newCE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNE_TIR__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getSAppliqueAMenaceAerienneMenaceAerienne() {
		return sAppliqueAMenaceAerienneMenaceAerienne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSAppliqueAMenaceAerienneMenaceAerienne(TypeAssociation newSAppliqueAMenaceAerienneMenaceAerienne, NotificationChain msgs) {
		TypeAssociation oldSAppliqueAMenaceAerienneMenaceAerienne = sAppliqueAMenaceAerienneMenaceAerienne;
		sAppliqueAMenaceAerienneMenaceAerienne = newSAppliqueAMenaceAerienneMenaceAerienne;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNE_TIR__SAPPLIQUE_AMENACE_AERIENNE_MENACE_AERIENNE, oldSAppliqueAMenaceAerienneMenaceAerienne, newSAppliqueAMenaceAerienneMenaceAerienne);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSAppliqueAMenaceAerienneMenaceAerienne(TypeAssociation newSAppliqueAMenaceAerienneMenaceAerienne) {
		if (newSAppliqueAMenaceAerienneMenaceAerienne != sAppliqueAMenaceAerienneMenaceAerienne) {
			NotificationChain msgs = null;
			if (sAppliqueAMenaceAerienneMenaceAerienne != null)
				msgs = ((InternalEObject)sAppliqueAMenaceAerienneMenaceAerienne).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONSIGNE_TIR__SAPPLIQUE_AMENACE_AERIENNE_MENACE_AERIENNE, null, msgs);
			if (newSAppliqueAMenaceAerienneMenaceAerienne != null)
				msgs = ((InternalEObject)newSAppliqueAMenaceAerienneMenaceAerienne).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONSIGNE_TIR__SAPPLIQUE_AMENACE_AERIENNE_MENACE_AERIENNE, null, msgs);
			msgs = basicSetSAppliqueAMenaceAerienneMenaceAerienne(newSAppliqueAMenaceAerienneMenaceAerienne, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNE_TIR__SAPPLIQUE_AMENACE_AERIENNE_MENACE_AERIENNE, newSAppliqueAMenaceAerienneMenaceAerienne, newSAppliqueAMenaceAerienneMenaceAerienne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getSAppliqueSurAutreElementControle() {
		if (sAppliqueSurAutreElementControle == null) {
			sAppliqueSurAutreElementControle = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_CONSIGNE_TIR__SAPPLIQUE_SUR_AUTRE_ELEMENT_CONTROLE);
		}
		return sAppliqueSurAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEXT> getEstDefiniePourUnite() {
		if (estDefiniePourUnite == null) {
			estDefiniePourUnite = new EObjectContainmentEList<TypeAssociationEXT>(TypeAssociationEXT.class, this, SchemaPackage.TYPE_CONSIGNE_TIR__EST_DEFINIE_POUR_UNITE);
		}
		return estDefiniePourUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getDefinitPourTypeMesureCoordinationTypeMesureCoordination() {
		if (definitPourTypeMesureCoordinationTypeMesureCoordination == null) {
			definitPourTypeMesureCoordinationTypeMesureCoordination = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_CONSIGNE_TIR__DEFINIT_POUR_TYPE_MESURE_COORDINATION_TYPE_MESURE_COORDINATION);
		}
		return definitPourTypeMesureCoordinationTypeMesureCoordination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getDefinitPourSystemeArmeTypeArme() {
		return definitPourSystemeArmeTypeArme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinitPourSystemeArmeTypeArme(TypeAssociationEXT newDefinitPourSystemeArmeTypeArme, NotificationChain msgs) {
		TypeAssociationEXT oldDefinitPourSystemeArmeTypeArme = definitPourSystemeArmeTypeArme;
		definitPourSystemeArmeTypeArme = newDefinitPourSystemeArmeTypeArme;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNE_TIR__DEFINIT_POUR_SYSTEME_ARME_TYPE_ARME, oldDefinitPourSystemeArmeTypeArme, newDefinitPourSystemeArmeTypeArme);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinitPourSystemeArmeTypeArme(TypeAssociationEXT newDefinitPourSystemeArmeTypeArme) {
		if (newDefinitPourSystemeArmeTypeArme != definitPourSystemeArmeTypeArme) {
			NotificationChain msgs = null;
			if (definitPourSystemeArmeTypeArme != null)
				msgs = ((InternalEObject)definitPourSystemeArmeTypeArme).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONSIGNE_TIR__DEFINIT_POUR_SYSTEME_ARME_TYPE_ARME, null, msgs);
			if (newDefinitPourSystemeArmeTypeArme != null)
				msgs = ((InternalEObject)newDefinitPourSystemeArmeTypeArme).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONSIGNE_TIR__DEFINIT_POUR_SYSTEME_ARME_TYPE_ARME, null, msgs);
			msgs = basicSetDefinitPourSystemeArmeTypeArme(newDefinitPourSystemeArmeTypeArme, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNE_TIR__DEFINIT_POUR_SYSTEME_ARME_TYPE_ARME, newDefinitPourSystemeArmeTypeArme, newDefinitPourSystemeArmeTypeArme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypePeriode3D getVautPendantPeriode3D() {
		return vautPendantPeriode3D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVautPendantPeriode3D(TypePeriode3D newVautPendantPeriode3D, NotificationChain msgs) {
		TypePeriode3D oldVautPendantPeriode3D = vautPendantPeriode3D;
		vautPendantPeriode3D = newVautPendantPeriode3D;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNE_TIR__VAUT_PENDANT_PERIODE3_D, oldVautPendantPeriode3D, newVautPendantPeriode3D);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVautPendantPeriode3D(TypePeriode3D newVautPendantPeriode3D) {
		if (newVautPendantPeriode3D != vautPendantPeriode3D) {
			NotificationChain msgs = null;
			if (vautPendantPeriode3D != null)
				msgs = ((InternalEObject)vautPendantPeriode3D).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONSIGNE_TIR__VAUT_PENDANT_PERIODE3_D, null, msgs);
			if (newVautPendantPeriode3D != null)
				msgs = ((InternalEObject)newVautPendantPeriode3D).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONSIGNE_TIR__VAUT_PENDANT_PERIODE3_D, null, msgs);
			msgs = basicSetVautPendantPeriode3D(newVautPendantPeriode3D, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNE_TIR__VAUT_PENDANT_PERIODE3_D, newVautPendantPeriode3D, newVautPendantPeriode3D));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getDefinitPourMesureCoordinationMesureCoordination() {
		if (definitPourMesureCoordinationMesureCoordination == null) {
			definitPourMesureCoordinationMesureCoordination = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_CONSIGNE_TIR__DEFINIT_POUR_MESURE_COORDINATION_MESURE_COORDINATION);
		}
		return definitPourMesureCoordinationMesureCoordination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_CONSIGNE_TIR__SAPPLIQUE_AMENACE_AERIENNE_MENACE_AERIENNE:
				return basicSetSAppliqueAMenaceAerienneMenaceAerienne(null, msgs);
			case SchemaPackage.TYPE_CONSIGNE_TIR__SAPPLIQUE_SUR_AUTRE_ELEMENT_CONTROLE:
				return ((InternalEList<?>)getSAppliqueSurAutreElementControle()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_CONSIGNE_TIR__EST_DEFINIE_POUR_UNITE:
				return ((InternalEList<?>)getEstDefiniePourUnite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_CONSIGNE_TIR__DEFINIT_POUR_TYPE_MESURE_COORDINATION_TYPE_MESURE_COORDINATION:
				return ((InternalEList<?>)getDefinitPourTypeMesureCoordinationTypeMesureCoordination()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_CONSIGNE_TIR__DEFINIT_POUR_SYSTEME_ARME_TYPE_ARME:
				return basicSetDefinitPourSystemeArmeTypeArme(null, msgs);
			case SchemaPackage.TYPE_CONSIGNE_TIR__VAUT_PENDANT_PERIODE3_D:
				return basicSetVautPendantPeriode3D(null, msgs);
			case SchemaPackage.TYPE_CONSIGNE_TIR__DEFINIT_POUR_MESURE_COORDINATION_MESURE_COORDINATION:
				return ((InternalEList<?>)getDefinitPourMesureCoordinationMesureCoordination()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_CONSIGNE_TIR__CONSIGNE_TIR_GENERALE:
				return getConsigneTirGenerale();
			case SchemaPackage.TYPE_CONSIGNE_TIR__CONSIGNE_TIR_SUR_AVION:
				return getConsigneTirSurAvion();
			case SchemaPackage.TYPE_CONSIGNE_TIR__CONSIGNE_TIR_SUR_DRONE:
				return getConsigneTirSurDrone();
			case SchemaPackage.TYPE_CONSIGNE_TIR__CONSIGNE_TIR_SUR_HELICOPTERE:
				return getConsigneTirSurHelicoptere();
			case SchemaPackage.TYPE_CONSIGNE_TIR__CONSIGNE_TIR_SUR_MISSILE:
				return getConsigneTirSurMissile();
			case SchemaPackage.TYPE_CONSIGNE_TIR__CTE:
				return getCTE();
			case SchemaPackage.TYPE_CONSIGNE_TIR__CE:
				return getCE();
			case SchemaPackage.TYPE_CONSIGNE_TIR__SAPPLIQUE_AMENACE_AERIENNE_MENACE_AERIENNE:
				return getSAppliqueAMenaceAerienneMenaceAerienne();
			case SchemaPackage.TYPE_CONSIGNE_TIR__SAPPLIQUE_SUR_AUTRE_ELEMENT_CONTROLE:
				return getSAppliqueSurAutreElementControle();
			case SchemaPackage.TYPE_CONSIGNE_TIR__EST_DEFINIE_POUR_UNITE:
				return getEstDefiniePourUnite();
			case SchemaPackage.TYPE_CONSIGNE_TIR__DEFINIT_POUR_TYPE_MESURE_COORDINATION_TYPE_MESURE_COORDINATION:
				return getDefinitPourTypeMesureCoordinationTypeMesureCoordination();
			case SchemaPackage.TYPE_CONSIGNE_TIR__DEFINIT_POUR_SYSTEME_ARME_TYPE_ARME:
				return getDefinitPourSystemeArmeTypeArme();
			case SchemaPackage.TYPE_CONSIGNE_TIR__VAUT_PENDANT_PERIODE3_D:
				return getVautPendantPeriode3D();
			case SchemaPackage.TYPE_CONSIGNE_TIR__DEFINIT_POUR_MESURE_COORDINATION_MESURE_COORDINATION:
				return getDefinitPourMesureCoordinationMesureCoordination();
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
			case SchemaPackage.TYPE_CONSIGNE_TIR__CONSIGNE_TIR_GENERALE:
				setConsigneTirGenerale((TypeDictionaryDicoConsigneTir)newValue);
				return;
			case SchemaPackage.TYPE_CONSIGNE_TIR__CONSIGNE_TIR_SUR_AVION:
				setConsigneTirSurAvion((TypeDictionaryDicoConsigneTir)newValue);
				return;
			case SchemaPackage.TYPE_CONSIGNE_TIR__CONSIGNE_TIR_SUR_DRONE:
				setConsigneTirSurDrone((TypeDictionaryDicoConsigneTir)newValue);
				return;
			case SchemaPackage.TYPE_CONSIGNE_TIR__CONSIGNE_TIR_SUR_HELICOPTERE:
				setConsigneTirSurHelicoptere((TypeDictionaryDicoConsigneTir)newValue);
				return;
			case SchemaPackage.TYPE_CONSIGNE_TIR__CONSIGNE_TIR_SUR_MISSILE:
				setConsigneTirSurMissile((TypeDictionaryDicoConsigneTir)newValue);
				return;
			case SchemaPackage.TYPE_CONSIGNE_TIR__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_CONSIGNE_TIR__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_CONSIGNE_TIR__SAPPLIQUE_AMENACE_AERIENNE_MENACE_AERIENNE:
				setSAppliqueAMenaceAerienneMenaceAerienne((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_CONSIGNE_TIR__SAPPLIQUE_SUR_AUTRE_ELEMENT_CONTROLE:
				getSAppliqueSurAutreElementControle().clear();
				getSAppliqueSurAutreElementControle().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_CONSIGNE_TIR__EST_DEFINIE_POUR_UNITE:
				getEstDefiniePourUnite().clear();
				getEstDefiniePourUnite().addAll((Collection<? extends TypeAssociationEXT>)newValue);
				return;
			case SchemaPackage.TYPE_CONSIGNE_TIR__DEFINIT_POUR_TYPE_MESURE_COORDINATION_TYPE_MESURE_COORDINATION:
				getDefinitPourTypeMesureCoordinationTypeMesureCoordination().clear();
				getDefinitPourTypeMesureCoordinationTypeMesureCoordination().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_CONSIGNE_TIR__DEFINIT_POUR_SYSTEME_ARME_TYPE_ARME:
				setDefinitPourSystemeArmeTypeArme((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_CONSIGNE_TIR__VAUT_PENDANT_PERIODE3_D:
				setVautPendantPeriode3D((TypePeriode3D)newValue);
				return;
			case SchemaPackage.TYPE_CONSIGNE_TIR__DEFINIT_POUR_MESURE_COORDINATION_MESURE_COORDINATION:
				getDefinitPourMesureCoordinationMesureCoordination().clear();
				getDefinitPourMesureCoordinationMesureCoordination().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_CONSIGNE_TIR__CONSIGNE_TIR_GENERALE:
				unsetConsigneTirGenerale();
				return;
			case SchemaPackage.TYPE_CONSIGNE_TIR__CONSIGNE_TIR_SUR_AVION:
				unsetConsigneTirSurAvion();
				return;
			case SchemaPackage.TYPE_CONSIGNE_TIR__CONSIGNE_TIR_SUR_DRONE:
				unsetConsigneTirSurDrone();
				return;
			case SchemaPackage.TYPE_CONSIGNE_TIR__CONSIGNE_TIR_SUR_HELICOPTERE:
				unsetConsigneTirSurHelicoptere();
				return;
			case SchemaPackage.TYPE_CONSIGNE_TIR__CONSIGNE_TIR_SUR_MISSILE:
				unsetConsigneTirSurMissile();
				return;
			case SchemaPackage.TYPE_CONSIGNE_TIR__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CONSIGNE_TIR__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CONSIGNE_TIR__SAPPLIQUE_AMENACE_AERIENNE_MENACE_AERIENNE:
				setSAppliqueAMenaceAerienneMenaceAerienne((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_CONSIGNE_TIR__SAPPLIQUE_SUR_AUTRE_ELEMENT_CONTROLE:
				getSAppliqueSurAutreElementControle().clear();
				return;
			case SchemaPackage.TYPE_CONSIGNE_TIR__EST_DEFINIE_POUR_UNITE:
				getEstDefiniePourUnite().clear();
				return;
			case SchemaPackage.TYPE_CONSIGNE_TIR__DEFINIT_POUR_TYPE_MESURE_COORDINATION_TYPE_MESURE_COORDINATION:
				getDefinitPourTypeMesureCoordinationTypeMesureCoordination().clear();
				return;
			case SchemaPackage.TYPE_CONSIGNE_TIR__DEFINIT_POUR_SYSTEME_ARME_TYPE_ARME:
				setDefinitPourSystemeArmeTypeArme((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_CONSIGNE_TIR__VAUT_PENDANT_PERIODE3_D:
				setVautPendantPeriode3D((TypePeriode3D)null);
				return;
			case SchemaPackage.TYPE_CONSIGNE_TIR__DEFINIT_POUR_MESURE_COORDINATION_MESURE_COORDINATION:
				getDefinitPourMesureCoordinationMesureCoordination().clear();
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
			case SchemaPackage.TYPE_CONSIGNE_TIR__CONSIGNE_TIR_GENERALE:
				return isSetConsigneTirGenerale();
			case SchemaPackage.TYPE_CONSIGNE_TIR__CONSIGNE_TIR_SUR_AVION:
				return isSetConsigneTirSurAvion();
			case SchemaPackage.TYPE_CONSIGNE_TIR__CONSIGNE_TIR_SUR_DRONE:
				return isSetConsigneTirSurDrone();
			case SchemaPackage.TYPE_CONSIGNE_TIR__CONSIGNE_TIR_SUR_HELICOPTERE:
				return isSetConsigneTirSurHelicoptere();
			case SchemaPackage.TYPE_CONSIGNE_TIR__CONSIGNE_TIR_SUR_MISSILE:
				return isSetConsigneTirSurMissile();
			case SchemaPackage.TYPE_CONSIGNE_TIR__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_CONSIGNE_TIR__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_CONSIGNE_TIR__SAPPLIQUE_AMENACE_AERIENNE_MENACE_AERIENNE:
				return sAppliqueAMenaceAerienneMenaceAerienne != null;
			case SchemaPackage.TYPE_CONSIGNE_TIR__SAPPLIQUE_SUR_AUTRE_ELEMENT_CONTROLE:
				return sAppliqueSurAutreElementControle != null && !sAppliqueSurAutreElementControle.isEmpty();
			case SchemaPackage.TYPE_CONSIGNE_TIR__EST_DEFINIE_POUR_UNITE:
				return estDefiniePourUnite != null && !estDefiniePourUnite.isEmpty();
			case SchemaPackage.TYPE_CONSIGNE_TIR__DEFINIT_POUR_TYPE_MESURE_COORDINATION_TYPE_MESURE_COORDINATION:
				return definitPourTypeMesureCoordinationTypeMesureCoordination != null && !definitPourTypeMesureCoordinationTypeMesureCoordination.isEmpty();
			case SchemaPackage.TYPE_CONSIGNE_TIR__DEFINIT_POUR_SYSTEME_ARME_TYPE_ARME:
				return definitPourSystemeArmeTypeArme != null;
			case SchemaPackage.TYPE_CONSIGNE_TIR__VAUT_PENDANT_PERIODE3_D:
				return vautPendantPeriode3D != null;
			case SchemaPackage.TYPE_CONSIGNE_TIR__DEFINIT_POUR_MESURE_COORDINATION_MESURE_COORDINATION:
				return definitPourMesureCoordinationMesureCoordination != null && !definitPourMesureCoordinationMesureCoordination.isEmpty();
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
		result.append(" (consigneTirGenerale: ");
		if (consigneTirGeneraleESet) result.append(consigneTirGenerale); else result.append("<unset>");
		result.append(", consigneTirSurAvion: ");
		if (consigneTirSurAvionESet) result.append(consigneTirSurAvion); else result.append("<unset>");
		result.append(", consigneTirSurDrone: ");
		if (consigneTirSurDroneESet) result.append(consigneTirSurDrone); else result.append("<unset>");
		result.append(", consigneTirSurHelicoptere: ");
		if (consigneTirSurHelicoptereESet) result.append(consigneTirSurHelicoptere); else result.append("<unset>");
		result.append(", consigneTirSurMissile: ");
		if (consigneTirSurMissileESet) result.append(consigneTirSurMissile); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeConsigneTirImpl
