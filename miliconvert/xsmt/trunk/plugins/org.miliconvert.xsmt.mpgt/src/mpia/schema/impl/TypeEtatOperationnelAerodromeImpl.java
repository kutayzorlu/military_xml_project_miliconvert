/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoEtatOperationnelAerodromeCapaciteFonctionnement;
import mpia.schema.TypeDictionaryDicoEtatOperationnelAerodromeOperationnelJour;
import mpia.schema.TypeEtatOperationnelAerodrome;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Etat Operationnel Aerodrome</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelAerodromeImpl#getNombreMaxWBACparJour <em>Nombre Max WBA Cpar Jour</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelAerodromeImpl#getNombreMaxNBACstationnes <em>Nombre Max NBA Cstationnes</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelAerodromeImpl#getNombreMaxNBACparJour <em>Nombre Max NBA Cpar Jour</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelAerodromeImpl#getCapaciteFonctionnement <em>Capacite Fonctionnement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelAerodromeImpl#getNombreMaxWBACstationnes <em>Nombre Max WBA Cstationnes</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelAerodromeImpl#isAEteEvalue <em>AEte Evalue</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelAerodromeImpl#getOperationnelJour <em>Operationnel Jour</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeEtatOperationnelAerodromeImpl extends EObjectImpl implements TypeEtatOperationnelAerodrome {
	/**
	 * The default value of the '{@link #getNombreMaxWBACparJour() <em>Nombre Max WBA Cpar Jour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreMaxWBACparJour()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_MAX_WBA_CPAR_JOUR_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreMaxWBACparJour() <em>Nombre Max WBA Cpar Jour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreMaxWBACparJour()
	 * @generated
	 * @ordered
	 */
	protected long nombreMaxWBACparJour = NOMBRE_MAX_WBA_CPAR_JOUR_EDEFAULT;

	/**
	 * This is true if the Nombre Max WBA Cpar Jour attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreMaxWBACparJourESet;

	/**
	 * The default value of the '{@link #getNombreMaxNBACstationnes() <em>Nombre Max NBA Cstationnes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreMaxNBACstationnes()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_MAX_NBA_CSTATIONNES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreMaxNBACstationnes() <em>Nombre Max NBA Cstationnes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreMaxNBACstationnes()
	 * @generated
	 * @ordered
	 */
	protected long nombreMaxNBACstationnes = NOMBRE_MAX_NBA_CSTATIONNES_EDEFAULT;

	/**
	 * This is true if the Nombre Max NBA Cstationnes attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreMaxNBACstationnesESet;

	/**
	 * The default value of the '{@link #getNombreMaxNBACparJour() <em>Nombre Max NBA Cpar Jour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreMaxNBACparJour()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_MAX_NBA_CPAR_JOUR_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreMaxNBACparJour() <em>Nombre Max NBA Cpar Jour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreMaxNBACparJour()
	 * @generated
	 * @ordered
	 */
	protected long nombreMaxNBACparJour = NOMBRE_MAX_NBA_CPAR_JOUR_EDEFAULT;

	/**
	 * This is true if the Nombre Max NBA Cpar Jour attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreMaxNBACparJourESet;

	/**
	 * The default value of the '{@link #getCapaciteFonctionnement() <em>Capacite Fonctionnement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapaciteFonctionnement()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatOperationnelAerodromeCapaciteFonctionnement CAPACITE_FONCTIONNEMENT_EDEFAULT = TypeDictionaryDicoEtatOperationnelAerodromeCapaciteFonctionnement.IFR;

	/**
	 * The cached value of the '{@link #getCapaciteFonctionnement() <em>Capacite Fonctionnement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapaciteFonctionnement()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatOperationnelAerodromeCapaciteFonctionnement capaciteFonctionnement = CAPACITE_FONCTIONNEMENT_EDEFAULT;

	/**
	 * This is true if the Capacite Fonctionnement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean capaciteFonctionnementESet;

	/**
	 * The default value of the '{@link #getNombreMaxWBACstationnes() <em>Nombre Max WBA Cstationnes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreMaxWBACstationnes()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_MAX_WBA_CSTATIONNES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreMaxWBACstationnes() <em>Nombre Max WBA Cstationnes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreMaxWBACstationnes()
	 * @generated
	 * @ordered
	 */
	protected long nombreMaxWBACstationnes = NOMBRE_MAX_WBA_CSTATIONNES_EDEFAULT;

	/**
	 * This is true if the Nombre Max WBA Cstationnes attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreMaxWBACstationnesESet;

	/**
	 * The default value of the '{@link #isAEteEvalue() <em>AEte Evalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAEteEvalue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AETE_EVALUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAEteEvalue() <em>AEte Evalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAEteEvalue()
	 * @generated
	 * @ordered
	 */
	protected boolean aEteEvalue = AETE_EVALUE_EDEFAULT;

	/**
	 * This is true if the AEte Evalue attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean aEteEvalueESet;

	/**
	 * The default value of the '{@link #getOperationnelJour() <em>Operationnel Jour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationnelJour()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatOperationnelAerodromeOperationnelJour OPERATIONNEL_JOUR_EDEFAULT = TypeDictionaryDicoEtatOperationnelAerodromeOperationnelJour.BOTH;

	/**
	 * The cached value of the '{@link #getOperationnelJour() <em>Operationnel Jour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationnelJour()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatOperationnelAerodromeOperationnelJour operationnelJour = OPERATIONNEL_JOUR_EDEFAULT;

	/**
	 * This is true if the Operationnel Jour attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean operationnelJourESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeEtatOperationnelAerodromeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEtatOperationnelAerodrome();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreMaxWBACparJour() {
		return nombreMaxWBACparJour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreMaxWBACparJour(long newNombreMaxWBACparJour) {
		long oldNombreMaxWBACparJour = nombreMaxWBACparJour;
		nombreMaxWBACparJour = newNombreMaxWBACparJour;
		boolean oldNombreMaxWBACparJourESet = nombreMaxWBACparJourESet;
		nombreMaxWBACparJourESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_AERODROME__NOMBRE_MAX_WBA_CPAR_JOUR, oldNombreMaxWBACparJour, nombreMaxWBACparJour, !oldNombreMaxWBACparJourESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreMaxWBACparJour() {
		long oldNombreMaxWBACparJour = nombreMaxWBACparJour;
		boolean oldNombreMaxWBACparJourESet = nombreMaxWBACparJourESet;
		nombreMaxWBACparJour = NOMBRE_MAX_WBA_CPAR_JOUR_EDEFAULT;
		nombreMaxWBACparJourESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_AERODROME__NOMBRE_MAX_WBA_CPAR_JOUR, oldNombreMaxWBACparJour, NOMBRE_MAX_WBA_CPAR_JOUR_EDEFAULT, oldNombreMaxWBACparJourESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreMaxWBACparJour() {
		return nombreMaxWBACparJourESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreMaxNBACstationnes() {
		return nombreMaxNBACstationnes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreMaxNBACstationnes(long newNombreMaxNBACstationnes) {
		long oldNombreMaxNBACstationnes = nombreMaxNBACstationnes;
		nombreMaxNBACstationnes = newNombreMaxNBACstationnes;
		boolean oldNombreMaxNBACstationnesESet = nombreMaxNBACstationnesESet;
		nombreMaxNBACstationnesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_AERODROME__NOMBRE_MAX_NBA_CSTATIONNES, oldNombreMaxNBACstationnes, nombreMaxNBACstationnes, !oldNombreMaxNBACstationnesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreMaxNBACstationnes() {
		long oldNombreMaxNBACstationnes = nombreMaxNBACstationnes;
		boolean oldNombreMaxNBACstationnesESet = nombreMaxNBACstationnesESet;
		nombreMaxNBACstationnes = NOMBRE_MAX_NBA_CSTATIONNES_EDEFAULT;
		nombreMaxNBACstationnesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_AERODROME__NOMBRE_MAX_NBA_CSTATIONNES, oldNombreMaxNBACstationnes, NOMBRE_MAX_NBA_CSTATIONNES_EDEFAULT, oldNombreMaxNBACstationnesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreMaxNBACstationnes() {
		return nombreMaxNBACstationnesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreMaxNBACparJour() {
		return nombreMaxNBACparJour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreMaxNBACparJour(long newNombreMaxNBACparJour) {
		long oldNombreMaxNBACparJour = nombreMaxNBACparJour;
		nombreMaxNBACparJour = newNombreMaxNBACparJour;
		boolean oldNombreMaxNBACparJourESet = nombreMaxNBACparJourESet;
		nombreMaxNBACparJourESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_AERODROME__NOMBRE_MAX_NBA_CPAR_JOUR, oldNombreMaxNBACparJour, nombreMaxNBACparJour, !oldNombreMaxNBACparJourESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreMaxNBACparJour() {
		long oldNombreMaxNBACparJour = nombreMaxNBACparJour;
		boolean oldNombreMaxNBACparJourESet = nombreMaxNBACparJourESet;
		nombreMaxNBACparJour = NOMBRE_MAX_NBA_CPAR_JOUR_EDEFAULT;
		nombreMaxNBACparJourESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_AERODROME__NOMBRE_MAX_NBA_CPAR_JOUR, oldNombreMaxNBACparJour, NOMBRE_MAX_NBA_CPAR_JOUR_EDEFAULT, oldNombreMaxNBACparJourESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreMaxNBACparJour() {
		return nombreMaxNBACparJourESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatOperationnelAerodromeCapaciteFonctionnement getCapaciteFonctionnement() {
		return capaciteFonctionnement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapaciteFonctionnement(TypeDictionaryDicoEtatOperationnelAerodromeCapaciteFonctionnement newCapaciteFonctionnement) {
		TypeDictionaryDicoEtatOperationnelAerodromeCapaciteFonctionnement oldCapaciteFonctionnement = capaciteFonctionnement;
		capaciteFonctionnement = newCapaciteFonctionnement == null ? CAPACITE_FONCTIONNEMENT_EDEFAULT : newCapaciteFonctionnement;
		boolean oldCapaciteFonctionnementESet = capaciteFonctionnementESet;
		capaciteFonctionnementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_AERODROME__CAPACITE_FONCTIONNEMENT, oldCapaciteFonctionnement, capaciteFonctionnement, !oldCapaciteFonctionnementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCapaciteFonctionnement() {
		TypeDictionaryDicoEtatOperationnelAerodromeCapaciteFonctionnement oldCapaciteFonctionnement = capaciteFonctionnement;
		boolean oldCapaciteFonctionnementESet = capaciteFonctionnementESet;
		capaciteFonctionnement = CAPACITE_FONCTIONNEMENT_EDEFAULT;
		capaciteFonctionnementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_AERODROME__CAPACITE_FONCTIONNEMENT, oldCapaciteFonctionnement, CAPACITE_FONCTIONNEMENT_EDEFAULT, oldCapaciteFonctionnementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCapaciteFonctionnement() {
		return capaciteFonctionnementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreMaxWBACstationnes() {
		return nombreMaxWBACstationnes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreMaxWBACstationnes(long newNombreMaxWBACstationnes) {
		long oldNombreMaxWBACstationnes = nombreMaxWBACstationnes;
		nombreMaxWBACstationnes = newNombreMaxWBACstationnes;
		boolean oldNombreMaxWBACstationnesESet = nombreMaxWBACstationnesESet;
		nombreMaxWBACstationnesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_AERODROME__NOMBRE_MAX_WBA_CSTATIONNES, oldNombreMaxWBACstationnes, nombreMaxWBACstationnes, !oldNombreMaxWBACstationnesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreMaxWBACstationnes() {
		long oldNombreMaxWBACstationnes = nombreMaxWBACstationnes;
		boolean oldNombreMaxWBACstationnesESet = nombreMaxWBACstationnesESet;
		nombreMaxWBACstationnes = NOMBRE_MAX_WBA_CSTATIONNES_EDEFAULT;
		nombreMaxWBACstationnesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_AERODROME__NOMBRE_MAX_WBA_CSTATIONNES, oldNombreMaxWBACstationnes, NOMBRE_MAX_WBA_CSTATIONNES_EDEFAULT, oldNombreMaxWBACstationnesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreMaxWBACstationnes() {
		return nombreMaxWBACstationnesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAEteEvalue() {
		return aEteEvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAEteEvalue(boolean newAEteEvalue) {
		boolean oldAEteEvalue = aEteEvalue;
		aEteEvalue = newAEteEvalue;
		boolean oldAEteEvalueESet = aEteEvalueESet;
		aEteEvalueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_AERODROME__AETE_EVALUE, oldAEteEvalue, aEteEvalue, !oldAEteEvalueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAEteEvalue() {
		boolean oldAEteEvalue = aEteEvalue;
		boolean oldAEteEvalueESet = aEteEvalueESet;
		aEteEvalue = AETE_EVALUE_EDEFAULT;
		aEteEvalueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_AERODROME__AETE_EVALUE, oldAEteEvalue, AETE_EVALUE_EDEFAULT, oldAEteEvalueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAEteEvalue() {
		return aEteEvalueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatOperationnelAerodromeOperationnelJour getOperationnelJour() {
		return operationnelJour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationnelJour(TypeDictionaryDicoEtatOperationnelAerodromeOperationnelJour newOperationnelJour) {
		TypeDictionaryDicoEtatOperationnelAerodromeOperationnelJour oldOperationnelJour = operationnelJour;
		operationnelJour = newOperationnelJour == null ? OPERATIONNEL_JOUR_EDEFAULT : newOperationnelJour;
		boolean oldOperationnelJourESet = operationnelJourESet;
		operationnelJourESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_AERODROME__OPERATIONNEL_JOUR, oldOperationnelJour, operationnelJour, !oldOperationnelJourESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOperationnelJour() {
		TypeDictionaryDicoEtatOperationnelAerodromeOperationnelJour oldOperationnelJour = operationnelJour;
		boolean oldOperationnelJourESet = operationnelJourESet;
		operationnelJour = OPERATIONNEL_JOUR_EDEFAULT;
		operationnelJourESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_AERODROME__OPERATIONNEL_JOUR, oldOperationnelJour, OPERATIONNEL_JOUR_EDEFAULT, oldOperationnelJourESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOperationnelJour() {
		return operationnelJourESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_AERODROME__NOMBRE_MAX_WBA_CPAR_JOUR:
				return new Long(getNombreMaxWBACparJour());
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_AERODROME__NOMBRE_MAX_NBA_CSTATIONNES:
				return new Long(getNombreMaxNBACstationnes());
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_AERODROME__NOMBRE_MAX_NBA_CPAR_JOUR:
				return new Long(getNombreMaxNBACparJour());
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_AERODROME__CAPACITE_FONCTIONNEMENT:
				return getCapaciteFonctionnement();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_AERODROME__NOMBRE_MAX_WBA_CSTATIONNES:
				return new Long(getNombreMaxWBACstationnes());
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_AERODROME__AETE_EVALUE:
				return isAEteEvalue() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_AERODROME__OPERATIONNEL_JOUR:
				return getOperationnelJour();
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
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_AERODROME__NOMBRE_MAX_WBA_CPAR_JOUR:
				setNombreMaxWBACparJour(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_AERODROME__NOMBRE_MAX_NBA_CSTATIONNES:
				setNombreMaxNBACstationnes(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_AERODROME__NOMBRE_MAX_NBA_CPAR_JOUR:
				setNombreMaxNBACparJour(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_AERODROME__CAPACITE_FONCTIONNEMENT:
				setCapaciteFonctionnement((TypeDictionaryDicoEtatOperationnelAerodromeCapaciteFonctionnement)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_AERODROME__NOMBRE_MAX_WBA_CSTATIONNES:
				setNombreMaxWBACstationnes(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_AERODROME__AETE_EVALUE:
				setAEteEvalue(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_AERODROME__OPERATIONNEL_JOUR:
				setOperationnelJour((TypeDictionaryDicoEtatOperationnelAerodromeOperationnelJour)newValue);
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
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_AERODROME__NOMBRE_MAX_WBA_CPAR_JOUR:
				unsetNombreMaxWBACparJour();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_AERODROME__NOMBRE_MAX_NBA_CSTATIONNES:
				unsetNombreMaxNBACstationnes();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_AERODROME__NOMBRE_MAX_NBA_CPAR_JOUR:
				unsetNombreMaxNBACparJour();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_AERODROME__CAPACITE_FONCTIONNEMENT:
				unsetCapaciteFonctionnement();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_AERODROME__NOMBRE_MAX_WBA_CSTATIONNES:
				unsetNombreMaxWBACstationnes();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_AERODROME__AETE_EVALUE:
				unsetAEteEvalue();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_AERODROME__OPERATIONNEL_JOUR:
				unsetOperationnelJour();
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
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_AERODROME__NOMBRE_MAX_WBA_CPAR_JOUR:
				return isSetNombreMaxWBACparJour();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_AERODROME__NOMBRE_MAX_NBA_CSTATIONNES:
				return isSetNombreMaxNBACstationnes();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_AERODROME__NOMBRE_MAX_NBA_CPAR_JOUR:
				return isSetNombreMaxNBACparJour();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_AERODROME__CAPACITE_FONCTIONNEMENT:
				return isSetCapaciteFonctionnement();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_AERODROME__NOMBRE_MAX_WBA_CSTATIONNES:
				return isSetNombreMaxWBACstationnes();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_AERODROME__AETE_EVALUE:
				return isSetAEteEvalue();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_AERODROME__OPERATIONNEL_JOUR:
				return isSetOperationnelJour();
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
		result.append(" (nombreMaxWBACparJour: ");
		if (nombreMaxWBACparJourESet) result.append(nombreMaxWBACparJour); else result.append("<unset>");
		result.append(", nombreMaxNBACstationnes: ");
		if (nombreMaxNBACstationnesESet) result.append(nombreMaxNBACstationnes); else result.append("<unset>");
		result.append(", nombreMaxNBACparJour: ");
		if (nombreMaxNBACparJourESet) result.append(nombreMaxNBACparJour); else result.append("<unset>");
		result.append(", capaciteFonctionnement: ");
		if (capaciteFonctionnementESet) result.append(capaciteFonctionnement); else result.append("<unset>");
		result.append(", nombreMaxWBACstationnes: ");
		if (nombreMaxWBACstationnesESet) result.append(nombreMaxWBACstationnes); else result.append("<unset>");
		result.append(", aEteEvalue: ");
		if (aEteEvalueESet) result.append(aEteEvalue); else result.append("<unset>");
		result.append(", operationnelJour: ");
		if (operationnelJourESet) result.append(operationnelJour); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeEtatOperationnelAerodromeImpl
