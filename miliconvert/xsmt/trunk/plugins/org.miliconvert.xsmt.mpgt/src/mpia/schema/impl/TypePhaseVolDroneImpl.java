/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;
import mpia.meta.TypeDataTypeDuree;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeComportementSecours;
import mpia.schema.TypeDatation;
import mpia.schema.TypeDictionaryDicoPhaseVolDroneTypePhase;
import mpia.schema.TypePhaseVolDrone;

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
 * An implementation of the model object '<em><b>Type Phase Vol Drone</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypePhaseVolDroneImpl#getNumero <em>Numero</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePhaseVolDroneImpl#getNbrPoints <em>Nbr Points</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePhaseVolDroneImpl#getTypePhase <em>Type Phase</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePhaseVolDroneImpl#getDateDebut <em>Date Debut</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePhaseVolDroneImpl#getDuree <em>Duree</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePhaseVolDroneImpl#getEcartDuree <em>Ecart Duree</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePhaseVolDroneImpl#isEcartEnSus <em>Ecart En Sus</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePhaseVolDroneImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePhaseVolDroneImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePhaseVolDroneImpl#getAPourAutoriteControleUnite <em>APour Autorite Controle Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePhaseVolDroneImpl#getAPourFinDatation <em>APour Fin Datation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePhaseVolDroneImpl#getAPourDebutDatation <em>APour Debut Datation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePhaseVolDroneImpl#getACommeEnveloppeConsigne <em>AComme Enveloppe Consigne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePhaseVolDroneImpl#getACommeTrajectoireSecoursComportementSecours <em>AComme Trajectoire Secours Comportement Secours</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePhaseVolDroneImpl#getACommeAdresseRadioAdresseRadio <em>AComme Adresse Radio Adresse Radio</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypePhaseVolDroneImpl extends EObjectImpl implements TypePhaseVolDrone {
	/**
	 * The default value of the '{@link #getNumero() <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumero()
	 * @generated
	 * @ordered
	 */
	protected static final long NUMERO_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNumero() <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumero()
	 * @generated
	 * @ordered
	 */
	protected long numero = NUMERO_EDEFAULT;

	/**
	 * This is true if the Numero attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numeroESet;

	/**
	 * The default value of the '{@link #getNbrPoints() <em>Nbr Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbrPoints()
	 * @generated
	 * @ordered
	 */
	protected static final long NBR_POINTS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNbrPoints() <em>Nbr Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbrPoints()
	 * @generated
	 * @ordered
	 */
	protected long nbrPoints = NBR_POINTS_EDEFAULT;

	/**
	 * This is true if the Nbr Points attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nbrPointsESet;

	/**
	 * The default value of the '{@link #getTypePhase() <em>Type Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypePhase()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPhaseVolDroneTypePhase TYPE_PHASE_EDEFAULT = TypeDictionaryDicoPhaseVolDroneTypePhase.LANC;

	/**
	 * The cached value of the '{@link #getTypePhase() <em>Type Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypePhase()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPhaseVolDroneTypePhase typePhase = TYPE_PHASE_EDEFAULT;

	/**
	 * This is true if the Type Phase attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typePhaseESet;

	/**
	 * The default value of the '{@link #getDateDebut() <em>Date Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDebut()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_DEBUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateDebut() <em>Date Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDebut()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateDebut = DATE_DEBUT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDuree() <em>Duree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuree()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree duree;

	/**
	 * The cached value of the '{@link #getEcartDuree() <em>Ecart Duree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcartDuree()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree ecartDuree;

	/**
	 * The default value of the '{@link #isEcartEnSus() <em>Ecart En Sus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEcartEnSus()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ECART_EN_SUS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEcartEnSus() <em>Ecart En Sus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEcartEnSus()
	 * @generated
	 * @ordered
	 */
	protected boolean ecartEnSus = ECART_EN_SUS_EDEFAULT;

	/**
	 * This is true if the Ecart En Sus attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ecartEnSusESet;

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
	 * The cached value of the '{@link #getAPourAutoriteControleUnite() <em>APour Autorite Controle Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourAutoriteControleUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aPourAutoriteControleUnite;

	/**
	 * The cached value of the '{@link #getAPourFinDatation() <em>APour Fin Datation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourFinDatation()
	 * @generated
	 * @ordered
	 */
	protected TypeDatation aPourFinDatation;

	/**
	 * The cached value of the '{@link #getAPourDebutDatation() <em>APour Debut Datation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourDebutDatation()
	 * @generated
	 * @ordered
	 */
	protected TypeDatation aPourDebutDatation;

	/**
	 * The cached value of the '{@link #getACommeEnveloppeConsigne() <em>AComme Enveloppe Consigne</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeEnveloppeConsigne()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aCommeEnveloppeConsigne;

	/**
	 * The cached value of the '{@link #getACommeTrajectoireSecoursComportementSecours() <em>AComme Trajectoire Secours Comportement Secours</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeTrajectoireSecoursComportementSecours()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeComportementSecours> aCommeTrajectoireSecoursComportementSecours;

	/**
	 * The cached value of the '{@link #getACommeAdresseRadioAdresseRadio() <em>AComme Adresse Radio Adresse Radio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeAdresseRadioAdresseRadio()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aCommeAdresseRadioAdresseRadio;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypePhaseVolDroneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypePhaseVolDrone();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNumero() {
		return numero;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumero(long newNumero) {
		long oldNumero = numero;
		numero = newNumero;
		boolean oldNumeroESet = numeroESet;
		numeroESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PHASE_VOL_DRONE__NUMERO, oldNumero, numero, !oldNumeroESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumero() {
		long oldNumero = numero;
		boolean oldNumeroESet = numeroESet;
		numero = NUMERO_EDEFAULT;
		numeroESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PHASE_VOL_DRONE__NUMERO, oldNumero, NUMERO_EDEFAULT, oldNumeroESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumero() {
		return numeroESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNbrPoints() {
		return nbrPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbrPoints(long newNbrPoints) {
		long oldNbrPoints = nbrPoints;
		nbrPoints = newNbrPoints;
		boolean oldNbrPointsESet = nbrPointsESet;
		nbrPointsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PHASE_VOL_DRONE__NBR_POINTS, oldNbrPoints, nbrPoints, !oldNbrPointsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNbrPoints() {
		long oldNbrPoints = nbrPoints;
		boolean oldNbrPointsESet = nbrPointsESet;
		nbrPoints = NBR_POINTS_EDEFAULT;
		nbrPointsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PHASE_VOL_DRONE__NBR_POINTS, oldNbrPoints, NBR_POINTS_EDEFAULT, oldNbrPointsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNbrPoints() {
		return nbrPointsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoPhaseVolDroneTypePhase getTypePhase() {
		return typePhase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypePhase(TypeDictionaryDicoPhaseVolDroneTypePhase newTypePhase) {
		TypeDictionaryDicoPhaseVolDroneTypePhase oldTypePhase = typePhase;
		typePhase = newTypePhase == null ? TYPE_PHASE_EDEFAULT : newTypePhase;
		boolean oldTypePhaseESet = typePhaseESet;
		typePhaseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PHASE_VOL_DRONE__TYPE_PHASE, oldTypePhase, typePhase, !oldTypePhaseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypePhase() {
		TypeDictionaryDicoPhaseVolDroneTypePhase oldTypePhase = typePhase;
		boolean oldTypePhaseESet = typePhaseESet;
		typePhase = TYPE_PHASE_EDEFAULT;
		typePhaseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PHASE_VOL_DRONE__TYPE_PHASE, oldTypePhase, TYPE_PHASE_EDEFAULT, oldTypePhaseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypePhase() {
		return typePhaseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateDebut() {
		return dateDebut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateDebut(XMLGregorianCalendar newDateDebut) {
		XMLGregorianCalendar oldDateDebut = dateDebut;
		dateDebut = newDateDebut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PHASE_VOL_DRONE__DATE_DEBUT, oldDateDebut, dateDebut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getDuree() {
		return duree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDuree(TypeDataTypeDuree newDuree, NotificationChain msgs) {
		TypeDataTypeDuree oldDuree = duree;
		duree = newDuree;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PHASE_VOL_DRONE__DUREE, oldDuree, newDuree);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuree(TypeDataTypeDuree newDuree) {
		if (newDuree != duree) {
			NotificationChain msgs = null;
			if (duree != null)
				msgs = ((InternalEObject)duree).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PHASE_VOL_DRONE__DUREE, null, msgs);
			if (newDuree != null)
				msgs = ((InternalEObject)newDuree).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PHASE_VOL_DRONE__DUREE, null, msgs);
			msgs = basicSetDuree(newDuree, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PHASE_VOL_DRONE__DUREE, newDuree, newDuree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getEcartDuree() {
		return ecartDuree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEcartDuree(TypeDataTypeDuree newEcartDuree, NotificationChain msgs) {
		TypeDataTypeDuree oldEcartDuree = ecartDuree;
		ecartDuree = newEcartDuree;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PHASE_VOL_DRONE__ECART_DUREE, oldEcartDuree, newEcartDuree);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEcartDuree(TypeDataTypeDuree newEcartDuree) {
		if (newEcartDuree != ecartDuree) {
			NotificationChain msgs = null;
			if (ecartDuree != null)
				msgs = ((InternalEObject)ecartDuree).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PHASE_VOL_DRONE__ECART_DUREE, null, msgs);
			if (newEcartDuree != null)
				msgs = ((InternalEObject)newEcartDuree).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PHASE_VOL_DRONE__ECART_DUREE, null, msgs);
			msgs = basicSetEcartDuree(newEcartDuree, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PHASE_VOL_DRONE__ECART_DUREE, newEcartDuree, newEcartDuree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEcartEnSus() {
		return ecartEnSus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEcartEnSus(boolean newEcartEnSus) {
		boolean oldEcartEnSus = ecartEnSus;
		ecartEnSus = newEcartEnSus;
		boolean oldEcartEnSusESet = ecartEnSusESet;
		ecartEnSusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PHASE_VOL_DRONE__ECART_EN_SUS, oldEcartEnSus, ecartEnSus, !oldEcartEnSusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEcartEnSus() {
		boolean oldEcartEnSus = ecartEnSus;
		boolean oldEcartEnSusESet = ecartEnSusESet;
		ecartEnSus = ECART_EN_SUS_EDEFAULT;
		ecartEnSusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PHASE_VOL_DRONE__ECART_EN_SUS, oldEcartEnSus, ECART_EN_SUS_EDEFAULT, oldEcartEnSusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEcartEnSus() {
		return ecartEnSusESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PHASE_VOL_DRONE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PHASE_VOL_DRONE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAPourAutoriteControleUnite() {
		return aPourAutoriteControleUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourAutoriteControleUnite(TypeAssociationEXT newAPourAutoriteControleUnite, NotificationChain msgs) {
		TypeAssociationEXT oldAPourAutoriteControleUnite = aPourAutoriteControleUnite;
		aPourAutoriteControleUnite = newAPourAutoriteControleUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PHASE_VOL_DRONE__APOUR_AUTORITE_CONTROLE_UNITE, oldAPourAutoriteControleUnite, newAPourAutoriteControleUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourAutoriteControleUnite(TypeAssociationEXT newAPourAutoriteControleUnite) {
		if (newAPourAutoriteControleUnite != aPourAutoriteControleUnite) {
			NotificationChain msgs = null;
			if (aPourAutoriteControleUnite != null)
				msgs = ((InternalEObject)aPourAutoriteControleUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PHASE_VOL_DRONE__APOUR_AUTORITE_CONTROLE_UNITE, null, msgs);
			if (newAPourAutoriteControleUnite != null)
				msgs = ((InternalEObject)newAPourAutoriteControleUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PHASE_VOL_DRONE__APOUR_AUTORITE_CONTROLE_UNITE, null, msgs);
			msgs = basicSetAPourAutoriteControleUnite(newAPourAutoriteControleUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PHASE_VOL_DRONE__APOUR_AUTORITE_CONTROLE_UNITE, newAPourAutoriteControleUnite, newAPourAutoriteControleUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDatation getAPourFinDatation() {
		return aPourFinDatation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourFinDatation(TypeDatation newAPourFinDatation, NotificationChain msgs) {
		TypeDatation oldAPourFinDatation = aPourFinDatation;
		aPourFinDatation = newAPourFinDatation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PHASE_VOL_DRONE__APOUR_FIN_DATATION, oldAPourFinDatation, newAPourFinDatation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourFinDatation(TypeDatation newAPourFinDatation) {
		if (newAPourFinDatation != aPourFinDatation) {
			NotificationChain msgs = null;
			if (aPourFinDatation != null)
				msgs = ((InternalEObject)aPourFinDatation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PHASE_VOL_DRONE__APOUR_FIN_DATATION, null, msgs);
			if (newAPourFinDatation != null)
				msgs = ((InternalEObject)newAPourFinDatation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PHASE_VOL_DRONE__APOUR_FIN_DATATION, null, msgs);
			msgs = basicSetAPourFinDatation(newAPourFinDatation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PHASE_VOL_DRONE__APOUR_FIN_DATATION, newAPourFinDatation, newAPourFinDatation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDatation getAPourDebutDatation() {
		return aPourDebutDatation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourDebutDatation(TypeDatation newAPourDebutDatation, NotificationChain msgs) {
		TypeDatation oldAPourDebutDatation = aPourDebutDatation;
		aPourDebutDatation = newAPourDebutDatation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PHASE_VOL_DRONE__APOUR_DEBUT_DATATION, oldAPourDebutDatation, newAPourDebutDatation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourDebutDatation(TypeDatation newAPourDebutDatation) {
		if (newAPourDebutDatation != aPourDebutDatation) {
			NotificationChain msgs = null;
			if (aPourDebutDatation != null)
				msgs = ((InternalEObject)aPourDebutDatation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PHASE_VOL_DRONE__APOUR_DEBUT_DATATION, null, msgs);
			if (newAPourDebutDatation != null)
				msgs = ((InternalEObject)newAPourDebutDatation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PHASE_VOL_DRONE__APOUR_DEBUT_DATATION, null, msgs);
			msgs = basicSetAPourDebutDatation(newAPourDebutDatation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PHASE_VOL_DRONE__APOUR_DEBUT_DATATION, newAPourDebutDatation, newAPourDebutDatation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getACommeEnveloppeConsigne() {
		if (aCommeEnveloppeConsigne == null) {
			aCommeEnveloppeConsigne = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_PHASE_VOL_DRONE__ACOMME_ENVELOPPE_CONSIGNE);
		}
		return aCommeEnveloppeConsigne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeComportementSecours> getACommeTrajectoireSecoursComportementSecours() {
		if (aCommeTrajectoireSecoursComportementSecours == null) {
			aCommeTrajectoireSecoursComportementSecours = new EObjectContainmentEList<TypeComportementSecours>(TypeComportementSecours.class, this, SchemaPackage.TYPE_PHASE_VOL_DRONE__ACOMME_TRAJECTOIRE_SECOURS_COMPORTEMENT_SECOURS);
		}
		return aCommeTrajectoireSecoursComportementSecours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getACommeAdresseRadioAdresseRadio() {
		return aCommeAdresseRadioAdresseRadio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommeAdresseRadioAdresseRadio(TypeAssociation newACommeAdresseRadioAdresseRadio, NotificationChain msgs) {
		TypeAssociation oldACommeAdresseRadioAdresseRadio = aCommeAdresseRadioAdresseRadio;
		aCommeAdresseRadioAdresseRadio = newACommeAdresseRadioAdresseRadio;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PHASE_VOL_DRONE__ACOMME_ADRESSE_RADIO_ADRESSE_RADIO, oldACommeAdresseRadioAdresseRadio, newACommeAdresseRadioAdresseRadio);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommeAdresseRadioAdresseRadio(TypeAssociation newACommeAdresseRadioAdresseRadio) {
		if (newACommeAdresseRadioAdresseRadio != aCommeAdresseRadioAdresseRadio) {
			NotificationChain msgs = null;
			if (aCommeAdresseRadioAdresseRadio != null)
				msgs = ((InternalEObject)aCommeAdresseRadioAdresseRadio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PHASE_VOL_DRONE__ACOMME_ADRESSE_RADIO_ADRESSE_RADIO, null, msgs);
			if (newACommeAdresseRadioAdresseRadio != null)
				msgs = ((InternalEObject)newACommeAdresseRadioAdresseRadio).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PHASE_VOL_DRONE__ACOMME_ADRESSE_RADIO_ADRESSE_RADIO, null, msgs);
			msgs = basicSetACommeAdresseRadioAdresseRadio(newACommeAdresseRadioAdresseRadio, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PHASE_VOL_DRONE__ACOMME_ADRESSE_RADIO_ADRESSE_RADIO, newACommeAdresseRadioAdresseRadio, newACommeAdresseRadioAdresseRadio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__DUREE:
				return basicSetDuree(null, msgs);
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__ECART_DUREE:
				return basicSetEcartDuree(null, msgs);
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__APOUR_AUTORITE_CONTROLE_UNITE:
				return basicSetAPourAutoriteControleUnite(null, msgs);
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__APOUR_FIN_DATATION:
				return basicSetAPourFinDatation(null, msgs);
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__APOUR_DEBUT_DATATION:
				return basicSetAPourDebutDatation(null, msgs);
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__ACOMME_ENVELOPPE_CONSIGNE:
				return ((InternalEList<?>)getACommeEnveloppeConsigne()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__ACOMME_TRAJECTOIRE_SECOURS_COMPORTEMENT_SECOURS:
				return ((InternalEList<?>)getACommeTrajectoireSecoursComportementSecours()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__ACOMME_ADRESSE_RADIO_ADRESSE_RADIO:
				return basicSetACommeAdresseRadioAdresseRadio(null, msgs);
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
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__NUMERO:
				return new Long(getNumero());
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__NBR_POINTS:
				return new Long(getNbrPoints());
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__TYPE_PHASE:
				return getTypePhase();
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__DATE_DEBUT:
				return getDateDebut();
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__DUREE:
				return getDuree();
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__ECART_DUREE:
				return getEcartDuree();
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__ECART_EN_SUS:
				return isEcartEnSus() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__CE:
				return getCE();
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__APOUR_AUTORITE_CONTROLE_UNITE:
				return getAPourAutoriteControleUnite();
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__APOUR_FIN_DATATION:
				return getAPourFinDatation();
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__APOUR_DEBUT_DATATION:
				return getAPourDebutDatation();
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__ACOMME_ENVELOPPE_CONSIGNE:
				return getACommeEnveloppeConsigne();
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__ACOMME_TRAJECTOIRE_SECOURS_COMPORTEMENT_SECOURS:
				return getACommeTrajectoireSecoursComportementSecours();
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__ACOMME_ADRESSE_RADIO_ADRESSE_RADIO:
				return getACommeAdresseRadioAdresseRadio();
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
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__NUMERO:
				setNumero(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__NBR_POINTS:
				setNbrPoints(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__TYPE_PHASE:
				setTypePhase((TypeDictionaryDicoPhaseVolDroneTypePhase)newValue);
				return;
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__DATE_DEBUT:
				setDateDebut((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__DUREE:
				setDuree((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__ECART_DUREE:
				setEcartDuree((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__ECART_EN_SUS:
				setEcartEnSus(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__APOUR_AUTORITE_CONTROLE_UNITE:
				setAPourAutoriteControleUnite((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__APOUR_FIN_DATATION:
				setAPourFinDatation((TypeDatation)newValue);
				return;
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__APOUR_DEBUT_DATATION:
				setAPourDebutDatation((TypeDatation)newValue);
				return;
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__ACOMME_ENVELOPPE_CONSIGNE:
				getACommeEnveloppeConsigne().clear();
				getACommeEnveloppeConsigne().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__ACOMME_TRAJECTOIRE_SECOURS_COMPORTEMENT_SECOURS:
				getACommeTrajectoireSecoursComportementSecours().clear();
				getACommeTrajectoireSecoursComportementSecours().addAll((Collection<? extends TypeComportementSecours>)newValue);
				return;
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__ACOMME_ADRESSE_RADIO_ADRESSE_RADIO:
				setACommeAdresseRadioAdresseRadio((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__NUMERO:
				unsetNumero();
				return;
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__NBR_POINTS:
				unsetNbrPoints();
				return;
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__TYPE_PHASE:
				unsetTypePhase();
				return;
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__DATE_DEBUT:
				setDateDebut(DATE_DEBUT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__DUREE:
				setDuree((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__ECART_DUREE:
				setEcartDuree((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__ECART_EN_SUS:
				unsetEcartEnSus();
				return;
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__APOUR_AUTORITE_CONTROLE_UNITE:
				setAPourAutoriteControleUnite((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__APOUR_FIN_DATATION:
				setAPourFinDatation((TypeDatation)null);
				return;
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__APOUR_DEBUT_DATATION:
				setAPourDebutDatation((TypeDatation)null);
				return;
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__ACOMME_ENVELOPPE_CONSIGNE:
				getACommeEnveloppeConsigne().clear();
				return;
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__ACOMME_TRAJECTOIRE_SECOURS_COMPORTEMENT_SECOURS:
				getACommeTrajectoireSecoursComportementSecours().clear();
				return;
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__ACOMME_ADRESSE_RADIO_ADRESSE_RADIO:
				setACommeAdresseRadioAdresseRadio((TypeAssociation)null);
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
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__NUMERO:
				return isSetNumero();
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__NBR_POINTS:
				return isSetNbrPoints();
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__TYPE_PHASE:
				return isSetTypePhase();
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__DATE_DEBUT:
				return DATE_DEBUT_EDEFAULT == null ? dateDebut != null : !DATE_DEBUT_EDEFAULT.equals(dateDebut);
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__DUREE:
				return duree != null;
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__ECART_DUREE:
				return ecartDuree != null;
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__ECART_EN_SUS:
				return isSetEcartEnSus();
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__APOUR_AUTORITE_CONTROLE_UNITE:
				return aPourAutoriteControleUnite != null;
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__APOUR_FIN_DATATION:
				return aPourFinDatation != null;
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__APOUR_DEBUT_DATATION:
				return aPourDebutDatation != null;
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__ACOMME_ENVELOPPE_CONSIGNE:
				return aCommeEnveloppeConsigne != null && !aCommeEnveloppeConsigne.isEmpty();
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__ACOMME_TRAJECTOIRE_SECOURS_COMPORTEMENT_SECOURS:
				return aCommeTrajectoireSecoursComportementSecours != null && !aCommeTrajectoireSecoursComportementSecours.isEmpty();
			case SchemaPackage.TYPE_PHASE_VOL_DRONE__ACOMME_ADRESSE_RADIO_ADRESSE_RADIO:
				return aCommeAdresseRadioAdresseRadio != null;
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
		result.append(" (numero: ");
		if (numeroESet) result.append(numero); else result.append("<unset>");
		result.append(", nbrPoints: ");
		if (nbrPointsESet) result.append(nbrPoints); else result.append("<unset>");
		result.append(", typePhase: ");
		if (typePhaseESet) result.append(typePhase); else result.append("<unset>");
		result.append(", dateDebut: ");
		result.append(dateDebut);
		result.append(", ecartEnSus: ");
		if (ecartEnSusESet) result.append(ecartEnSus); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypePhaseVolDroneImpl
