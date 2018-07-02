/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeEvacuationSanitaire;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Evacuation Sanitaire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEvacuationSanitaireImpl#isEvacuationImmediate <em>Evacuation Immediate</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvacuationSanitaireImpl#getNbTotalBlesses <em>Nb Total Blesses</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvacuationSanitaireImpl#getNbBlessesCouches <em>Nb Blesses Couches</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvacuationSanitaireImpl#getNbTues <em>Nb Tues</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvacuationSanitaireImpl#getNbBlessesTete <em>Nb Blesses Tete</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvacuationSanitaireImpl#getNbBlessesTronc <em>Nb Blesses Tronc</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvacuationSanitaireImpl#getNbBlessesMembresInf <em>Nb Blesses Membres Inf</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvacuationSanitaireImpl#getNbBlessesMembresSup <em>Nb Blesses Membres Sup</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvacuationSanitaireImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvacuationSanitaireImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvacuationSanitaireImpl#getAPourLieuEvacuationAutreElementControle <em>APour Lieu Evacuation Autre Element Controle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeEvacuationSanitaireImpl extends EObjectImpl implements TypeEvacuationSanitaire {
	/**
	 * The default value of the '{@link #isEvacuationImmediate() <em>Evacuation Immediate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEvacuationImmediate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EVACUATION_IMMEDIATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEvacuationImmediate() <em>Evacuation Immediate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEvacuationImmediate()
	 * @generated
	 * @ordered
	 */
	protected boolean evacuationImmediate = EVACUATION_IMMEDIATE_EDEFAULT;

	/**
	 * This is true if the Evacuation Immediate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean evacuationImmediateESet;

	/**
	 * The default value of the '{@link #getNbTotalBlesses() <em>Nb Total Blesses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbTotalBlesses()
	 * @generated
	 * @ordered
	 */
	protected static final long NB_TOTAL_BLESSES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNbTotalBlesses() <em>Nb Total Blesses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbTotalBlesses()
	 * @generated
	 * @ordered
	 */
	protected long nbTotalBlesses = NB_TOTAL_BLESSES_EDEFAULT;

	/**
	 * This is true if the Nb Total Blesses attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nbTotalBlessesESet;

	/**
	 * The default value of the '{@link #getNbBlessesCouches() <em>Nb Blesses Couches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbBlessesCouches()
	 * @generated
	 * @ordered
	 */
	protected static final long NB_BLESSES_COUCHES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNbBlessesCouches() <em>Nb Blesses Couches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbBlessesCouches()
	 * @generated
	 * @ordered
	 */
	protected long nbBlessesCouches = NB_BLESSES_COUCHES_EDEFAULT;

	/**
	 * This is true if the Nb Blesses Couches attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nbBlessesCouchesESet;

	/**
	 * The default value of the '{@link #getNbTues() <em>Nb Tues</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbTues()
	 * @generated
	 * @ordered
	 */
	protected static final long NB_TUES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNbTues() <em>Nb Tues</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbTues()
	 * @generated
	 * @ordered
	 */
	protected long nbTues = NB_TUES_EDEFAULT;

	/**
	 * This is true if the Nb Tues attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nbTuesESet;

	/**
	 * The default value of the '{@link #getNbBlessesTete() <em>Nb Blesses Tete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbBlessesTete()
	 * @generated
	 * @ordered
	 */
	protected static final long NB_BLESSES_TETE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNbBlessesTete() <em>Nb Blesses Tete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbBlessesTete()
	 * @generated
	 * @ordered
	 */
	protected long nbBlessesTete = NB_BLESSES_TETE_EDEFAULT;

	/**
	 * This is true if the Nb Blesses Tete attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nbBlessesTeteESet;

	/**
	 * The default value of the '{@link #getNbBlessesTronc() <em>Nb Blesses Tronc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbBlessesTronc()
	 * @generated
	 * @ordered
	 */
	protected static final long NB_BLESSES_TRONC_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNbBlessesTronc() <em>Nb Blesses Tronc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbBlessesTronc()
	 * @generated
	 * @ordered
	 */
	protected long nbBlessesTronc = NB_BLESSES_TRONC_EDEFAULT;

	/**
	 * This is true if the Nb Blesses Tronc attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nbBlessesTroncESet;

	/**
	 * The default value of the '{@link #getNbBlessesMembresInf() <em>Nb Blesses Membres Inf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbBlessesMembresInf()
	 * @generated
	 * @ordered
	 */
	protected static final long NB_BLESSES_MEMBRES_INF_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNbBlessesMembresInf() <em>Nb Blesses Membres Inf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbBlessesMembresInf()
	 * @generated
	 * @ordered
	 */
	protected long nbBlessesMembresInf = NB_BLESSES_MEMBRES_INF_EDEFAULT;

	/**
	 * This is true if the Nb Blesses Membres Inf attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nbBlessesMembresInfESet;

	/**
	 * The default value of the '{@link #getNbBlessesMembresSup() <em>Nb Blesses Membres Sup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbBlessesMembresSup()
	 * @generated
	 * @ordered
	 */
	protected static final long NB_BLESSES_MEMBRES_SUP_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNbBlessesMembresSup() <em>Nb Blesses Membres Sup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbBlessesMembresSup()
	 * @generated
	 * @ordered
	 */
	protected long nbBlessesMembresSup = NB_BLESSES_MEMBRES_SUP_EDEFAULT;

	/**
	 * This is true if the Nb Blesses Membres Sup attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nbBlessesMembresSupESet;

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
	 * The cached value of the '{@link #getAPourLieuEvacuationAutreElementControle() <em>APour Lieu Evacuation Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourLieuEvacuationAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourLieuEvacuationAutreElementControle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeEvacuationSanitaireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEvacuationSanitaire();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEvacuationImmediate() {
		return evacuationImmediate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvacuationImmediate(boolean newEvacuationImmediate) {
		boolean oldEvacuationImmediate = evacuationImmediate;
		evacuationImmediate = newEvacuationImmediate;
		boolean oldEvacuationImmediateESet = evacuationImmediateESet;
		evacuationImmediateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVACUATION_SANITAIRE__EVACUATION_IMMEDIATE, oldEvacuationImmediate, evacuationImmediate, !oldEvacuationImmediateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEvacuationImmediate() {
		boolean oldEvacuationImmediate = evacuationImmediate;
		boolean oldEvacuationImmediateESet = evacuationImmediateESet;
		evacuationImmediate = EVACUATION_IMMEDIATE_EDEFAULT;
		evacuationImmediateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EVACUATION_SANITAIRE__EVACUATION_IMMEDIATE, oldEvacuationImmediate, EVACUATION_IMMEDIATE_EDEFAULT, oldEvacuationImmediateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEvacuationImmediate() {
		return evacuationImmediateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNbTotalBlesses() {
		return nbTotalBlesses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbTotalBlesses(long newNbTotalBlesses) {
		long oldNbTotalBlesses = nbTotalBlesses;
		nbTotalBlesses = newNbTotalBlesses;
		boolean oldNbTotalBlessesESet = nbTotalBlessesESet;
		nbTotalBlessesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVACUATION_SANITAIRE__NB_TOTAL_BLESSES, oldNbTotalBlesses, nbTotalBlesses, !oldNbTotalBlessesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNbTotalBlesses() {
		long oldNbTotalBlesses = nbTotalBlesses;
		boolean oldNbTotalBlessesESet = nbTotalBlessesESet;
		nbTotalBlesses = NB_TOTAL_BLESSES_EDEFAULT;
		nbTotalBlessesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EVACUATION_SANITAIRE__NB_TOTAL_BLESSES, oldNbTotalBlesses, NB_TOTAL_BLESSES_EDEFAULT, oldNbTotalBlessesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNbTotalBlesses() {
		return nbTotalBlessesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNbBlessesCouches() {
		return nbBlessesCouches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbBlessesCouches(long newNbBlessesCouches) {
		long oldNbBlessesCouches = nbBlessesCouches;
		nbBlessesCouches = newNbBlessesCouches;
		boolean oldNbBlessesCouchesESet = nbBlessesCouchesESet;
		nbBlessesCouchesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVACUATION_SANITAIRE__NB_BLESSES_COUCHES, oldNbBlessesCouches, nbBlessesCouches, !oldNbBlessesCouchesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNbBlessesCouches() {
		long oldNbBlessesCouches = nbBlessesCouches;
		boolean oldNbBlessesCouchesESet = nbBlessesCouchesESet;
		nbBlessesCouches = NB_BLESSES_COUCHES_EDEFAULT;
		nbBlessesCouchesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EVACUATION_SANITAIRE__NB_BLESSES_COUCHES, oldNbBlessesCouches, NB_BLESSES_COUCHES_EDEFAULT, oldNbBlessesCouchesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNbBlessesCouches() {
		return nbBlessesCouchesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNbTues() {
		return nbTues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbTues(long newNbTues) {
		long oldNbTues = nbTues;
		nbTues = newNbTues;
		boolean oldNbTuesESet = nbTuesESet;
		nbTuesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVACUATION_SANITAIRE__NB_TUES, oldNbTues, nbTues, !oldNbTuesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNbTues() {
		long oldNbTues = nbTues;
		boolean oldNbTuesESet = nbTuesESet;
		nbTues = NB_TUES_EDEFAULT;
		nbTuesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EVACUATION_SANITAIRE__NB_TUES, oldNbTues, NB_TUES_EDEFAULT, oldNbTuesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNbTues() {
		return nbTuesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNbBlessesTete() {
		return nbBlessesTete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbBlessesTete(long newNbBlessesTete) {
		long oldNbBlessesTete = nbBlessesTete;
		nbBlessesTete = newNbBlessesTete;
		boolean oldNbBlessesTeteESet = nbBlessesTeteESet;
		nbBlessesTeteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVACUATION_SANITAIRE__NB_BLESSES_TETE, oldNbBlessesTete, nbBlessesTete, !oldNbBlessesTeteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNbBlessesTete() {
		long oldNbBlessesTete = nbBlessesTete;
		boolean oldNbBlessesTeteESet = nbBlessesTeteESet;
		nbBlessesTete = NB_BLESSES_TETE_EDEFAULT;
		nbBlessesTeteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EVACUATION_SANITAIRE__NB_BLESSES_TETE, oldNbBlessesTete, NB_BLESSES_TETE_EDEFAULT, oldNbBlessesTeteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNbBlessesTete() {
		return nbBlessesTeteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNbBlessesTronc() {
		return nbBlessesTronc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbBlessesTronc(long newNbBlessesTronc) {
		long oldNbBlessesTronc = nbBlessesTronc;
		nbBlessesTronc = newNbBlessesTronc;
		boolean oldNbBlessesTroncESet = nbBlessesTroncESet;
		nbBlessesTroncESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVACUATION_SANITAIRE__NB_BLESSES_TRONC, oldNbBlessesTronc, nbBlessesTronc, !oldNbBlessesTroncESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNbBlessesTronc() {
		long oldNbBlessesTronc = nbBlessesTronc;
		boolean oldNbBlessesTroncESet = nbBlessesTroncESet;
		nbBlessesTronc = NB_BLESSES_TRONC_EDEFAULT;
		nbBlessesTroncESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EVACUATION_SANITAIRE__NB_BLESSES_TRONC, oldNbBlessesTronc, NB_BLESSES_TRONC_EDEFAULT, oldNbBlessesTroncESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNbBlessesTronc() {
		return nbBlessesTroncESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNbBlessesMembresInf() {
		return nbBlessesMembresInf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbBlessesMembresInf(long newNbBlessesMembresInf) {
		long oldNbBlessesMembresInf = nbBlessesMembresInf;
		nbBlessesMembresInf = newNbBlessesMembresInf;
		boolean oldNbBlessesMembresInfESet = nbBlessesMembresInfESet;
		nbBlessesMembresInfESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVACUATION_SANITAIRE__NB_BLESSES_MEMBRES_INF, oldNbBlessesMembresInf, nbBlessesMembresInf, !oldNbBlessesMembresInfESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNbBlessesMembresInf() {
		long oldNbBlessesMembresInf = nbBlessesMembresInf;
		boolean oldNbBlessesMembresInfESet = nbBlessesMembresInfESet;
		nbBlessesMembresInf = NB_BLESSES_MEMBRES_INF_EDEFAULT;
		nbBlessesMembresInfESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EVACUATION_SANITAIRE__NB_BLESSES_MEMBRES_INF, oldNbBlessesMembresInf, NB_BLESSES_MEMBRES_INF_EDEFAULT, oldNbBlessesMembresInfESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNbBlessesMembresInf() {
		return nbBlessesMembresInfESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNbBlessesMembresSup() {
		return nbBlessesMembresSup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbBlessesMembresSup(long newNbBlessesMembresSup) {
		long oldNbBlessesMembresSup = nbBlessesMembresSup;
		nbBlessesMembresSup = newNbBlessesMembresSup;
		boolean oldNbBlessesMembresSupESet = nbBlessesMembresSupESet;
		nbBlessesMembresSupESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVACUATION_SANITAIRE__NB_BLESSES_MEMBRES_SUP, oldNbBlessesMembresSup, nbBlessesMembresSup, !oldNbBlessesMembresSupESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNbBlessesMembresSup() {
		long oldNbBlessesMembresSup = nbBlessesMembresSup;
		boolean oldNbBlessesMembresSupESet = nbBlessesMembresSupESet;
		nbBlessesMembresSup = NB_BLESSES_MEMBRES_SUP_EDEFAULT;
		nbBlessesMembresSupESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EVACUATION_SANITAIRE__NB_BLESSES_MEMBRES_SUP, oldNbBlessesMembresSup, NB_BLESSES_MEMBRES_SUP_EDEFAULT, oldNbBlessesMembresSupESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNbBlessesMembresSup() {
		return nbBlessesMembresSupESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVACUATION_SANITAIRE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVACUATION_SANITAIRE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourLieuEvacuationAutreElementControle() {
		return aPourLieuEvacuationAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourLieuEvacuationAutreElementControle(TypeAssociation newAPourLieuEvacuationAutreElementControle, NotificationChain msgs) {
		TypeAssociation oldAPourLieuEvacuationAutreElementControle = aPourLieuEvacuationAutreElementControle;
		aPourLieuEvacuationAutreElementControle = newAPourLieuEvacuationAutreElementControle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVACUATION_SANITAIRE__APOUR_LIEU_EVACUATION_AUTRE_ELEMENT_CONTROLE, oldAPourLieuEvacuationAutreElementControle, newAPourLieuEvacuationAutreElementControle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourLieuEvacuationAutreElementControle(TypeAssociation newAPourLieuEvacuationAutreElementControle) {
		if (newAPourLieuEvacuationAutreElementControle != aPourLieuEvacuationAutreElementControle) {
			NotificationChain msgs = null;
			if (aPourLieuEvacuationAutreElementControle != null)
				msgs = ((InternalEObject)aPourLieuEvacuationAutreElementControle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EVACUATION_SANITAIRE__APOUR_LIEU_EVACUATION_AUTRE_ELEMENT_CONTROLE, null, msgs);
			if (newAPourLieuEvacuationAutreElementControle != null)
				msgs = ((InternalEObject)newAPourLieuEvacuationAutreElementControle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EVACUATION_SANITAIRE__APOUR_LIEU_EVACUATION_AUTRE_ELEMENT_CONTROLE, null, msgs);
			msgs = basicSetAPourLieuEvacuationAutreElementControle(newAPourLieuEvacuationAutreElementControle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVACUATION_SANITAIRE__APOUR_LIEU_EVACUATION_AUTRE_ELEMENT_CONTROLE, newAPourLieuEvacuationAutreElementControle, newAPourLieuEvacuationAutreElementControle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_EVACUATION_SANITAIRE__APOUR_LIEU_EVACUATION_AUTRE_ELEMENT_CONTROLE:
				return basicSetAPourLieuEvacuationAutreElementControle(null, msgs);
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
			case SchemaPackage.TYPE_EVACUATION_SANITAIRE__EVACUATION_IMMEDIATE:
				return isEvacuationImmediate() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_EVACUATION_SANITAIRE__NB_TOTAL_BLESSES:
				return new Long(getNbTotalBlesses());
			case SchemaPackage.TYPE_EVACUATION_SANITAIRE__NB_BLESSES_COUCHES:
				return new Long(getNbBlessesCouches());
			case SchemaPackage.TYPE_EVACUATION_SANITAIRE__NB_TUES:
				return new Long(getNbTues());
			case SchemaPackage.TYPE_EVACUATION_SANITAIRE__NB_BLESSES_TETE:
				return new Long(getNbBlessesTete());
			case SchemaPackage.TYPE_EVACUATION_SANITAIRE__NB_BLESSES_TRONC:
				return new Long(getNbBlessesTronc());
			case SchemaPackage.TYPE_EVACUATION_SANITAIRE__NB_BLESSES_MEMBRES_INF:
				return new Long(getNbBlessesMembresInf());
			case SchemaPackage.TYPE_EVACUATION_SANITAIRE__NB_BLESSES_MEMBRES_SUP:
				return new Long(getNbBlessesMembresSup());
			case SchemaPackage.TYPE_EVACUATION_SANITAIRE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_EVACUATION_SANITAIRE__CE:
				return getCE();
			case SchemaPackage.TYPE_EVACUATION_SANITAIRE__APOUR_LIEU_EVACUATION_AUTRE_ELEMENT_CONTROLE:
				return getAPourLieuEvacuationAutreElementControle();
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
			case SchemaPackage.TYPE_EVACUATION_SANITAIRE__EVACUATION_IMMEDIATE:
				setEvacuationImmediate(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_EVACUATION_SANITAIRE__NB_TOTAL_BLESSES:
				setNbTotalBlesses(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_EVACUATION_SANITAIRE__NB_BLESSES_COUCHES:
				setNbBlessesCouches(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_EVACUATION_SANITAIRE__NB_TUES:
				setNbTues(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_EVACUATION_SANITAIRE__NB_BLESSES_TETE:
				setNbBlessesTete(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_EVACUATION_SANITAIRE__NB_BLESSES_TRONC:
				setNbBlessesTronc(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_EVACUATION_SANITAIRE__NB_BLESSES_MEMBRES_INF:
				setNbBlessesMembresInf(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_EVACUATION_SANITAIRE__NB_BLESSES_MEMBRES_SUP:
				setNbBlessesMembresSup(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_EVACUATION_SANITAIRE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_EVACUATION_SANITAIRE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_EVACUATION_SANITAIRE__APOUR_LIEU_EVACUATION_AUTRE_ELEMENT_CONTROLE:
				setAPourLieuEvacuationAutreElementControle((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_EVACUATION_SANITAIRE__EVACUATION_IMMEDIATE:
				unsetEvacuationImmediate();
				return;
			case SchemaPackage.TYPE_EVACUATION_SANITAIRE__NB_TOTAL_BLESSES:
				unsetNbTotalBlesses();
				return;
			case SchemaPackage.TYPE_EVACUATION_SANITAIRE__NB_BLESSES_COUCHES:
				unsetNbBlessesCouches();
				return;
			case SchemaPackage.TYPE_EVACUATION_SANITAIRE__NB_TUES:
				unsetNbTues();
				return;
			case SchemaPackage.TYPE_EVACUATION_SANITAIRE__NB_BLESSES_TETE:
				unsetNbBlessesTete();
				return;
			case SchemaPackage.TYPE_EVACUATION_SANITAIRE__NB_BLESSES_TRONC:
				unsetNbBlessesTronc();
				return;
			case SchemaPackage.TYPE_EVACUATION_SANITAIRE__NB_BLESSES_MEMBRES_INF:
				unsetNbBlessesMembresInf();
				return;
			case SchemaPackage.TYPE_EVACUATION_SANITAIRE__NB_BLESSES_MEMBRES_SUP:
				unsetNbBlessesMembresSup();
				return;
			case SchemaPackage.TYPE_EVACUATION_SANITAIRE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_EVACUATION_SANITAIRE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_EVACUATION_SANITAIRE__APOUR_LIEU_EVACUATION_AUTRE_ELEMENT_CONTROLE:
				setAPourLieuEvacuationAutreElementControle((TypeAssociation)null);
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
			case SchemaPackage.TYPE_EVACUATION_SANITAIRE__EVACUATION_IMMEDIATE:
				return isSetEvacuationImmediate();
			case SchemaPackage.TYPE_EVACUATION_SANITAIRE__NB_TOTAL_BLESSES:
				return isSetNbTotalBlesses();
			case SchemaPackage.TYPE_EVACUATION_SANITAIRE__NB_BLESSES_COUCHES:
				return isSetNbBlessesCouches();
			case SchemaPackage.TYPE_EVACUATION_SANITAIRE__NB_TUES:
				return isSetNbTues();
			case SchemaPackage.TYPE_EVACUATION_SANITAIRE__NB_BLESSES_TETE:
				return isSetNbBlessesTete();
			case SchemaPackage.TYPE_EVACUATION_SANITAIRE__NB_BLESSES_TRONC:
				return isSetNbBlessesTronc();
			case SchemaPackage.TYPE_EVACUATION_SANITAIRE__NB_BLESSES_MEMBRES_INF:
				return isSetNbBlessesMembresInf();
			case SchemaPackage.TYPE_EVACUATION_SANITAIRE__NB_BLESSES_MEMBRES_SUP:
				return isSetNbBlessesMembresSup();
			case SchemaPackage.TYPE_EVACUATION_SANITAIRE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_EVACUATION_SANITAIRE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_EVACUATION_SANITAIRE__APOUR_LIEU_EVACUATION_AUTRE_ELEMENT_CONTROLE:
				return aPourLieuEvacuationAutreElementControle != null;
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
		result.append(" (evacuationImmediate: ");
		if (evacuationImmediateESet) result.append(evacuationImmediate); else result.append("<unset>");
		result.append(", nbTotalBlesses: ");
		if (nbTotalBlessesESet) result.append(nbTotalBlesses); else result.append("<unset>");
		result.append(", nbBlessesCouches: ");
		if (nbBlessesCouchesESet) result.append(nbBlessesCouches); else result.append("<unset>");
		result.append(", nbTues: ");
		if (nbTuesESet) result.append(nbTues); else result.append("<unset>");
		result.append(", nbBlessesTete: ");
		if (nbBlessesTeteESet) result.append(nbBlessesTete); else result.append("<unset>");
		result.append(", nbBlessesTronc: ");
		if (nbBlessesTroncESet) result.append(nbBlessesTronc); else result.append("<unset>");
		result.append(", nbBlessesMembresInf: ");
		if (nbBlessesMembresInfESet) result.append(nbBlessesMembresInf); else result.append("<unset>");
		result.append(", nbBlessesMembresSup: ");
		if (nbBlessesMembresSupESet) result.append(nbBlessesMembresSup); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeEvacuationSanitaireImpl
