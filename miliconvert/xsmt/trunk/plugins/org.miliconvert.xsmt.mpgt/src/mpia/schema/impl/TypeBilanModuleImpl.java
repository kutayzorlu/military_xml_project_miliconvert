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

import mpia.schema.SchemaPackage;
import mpia.schema.TypeBilanModule;

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
 * An implementation of the model object '<em><b>Type Bilan Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeBilanModuleImpl#getNbAppareilsArrives <em>Nb Appareils Arrives</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBilanModuleImpl#getGDHdecollage <em>GD Hdecollage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBilanModuleImpl#getGDHatterrissage <em>GD Hatterrissage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBilanModuleImpl#getMotifNonDecollage <em>Motif Non Decollage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBilanModuleImpl#getComplements <em>Complements</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBilanModuleImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBilanModuleImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBilanModuleImpl#getConcerneModule <em>Concerne Module</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBilanModuleImpl#getADecolleAutreElementControle <em>ADecolle Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBilanModuleImpl#getAAtterriEnAutreElementControle <em>AAtterri En Autre Element Controle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeBilanModuleImpl extends EObjectImpl implements TypeBilanModule {
	/**
	 * The default value of the '{@link #getNbAppareilsArrives() <em>Nb Appareils Arrives</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbAppareilsArrives()
	 * @generated
	 * @ordered
	 */
	protected static final long NB_APPAREILS_ARRIVES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNbAppareilsArrives() <em>Nb Appareils Arrives</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbAppareilsArrives()
	 * @generated
	 * @ordered
	 */
	protected long nbAppareilsArrives = NB_APPAREILS_ARRIVES_EDEFAULT;

	/**
	 * This is true if the Nb Appareils Arrives attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nbAppareilsArrivesESet;

	/**
	 * The default value of the '{@link #getGDHdecollage() <em>GD Hdecollage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHdecollage()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GD_HDECOLLAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGDHdecollage() <em>GD Hdecollage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHdecollage()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gDHdecollage = GD_HDECOLLAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGDHatterrissage() <em>GD Hatterrissage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHatterrissage()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GD_HATTERRISSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGDHatterrissage() <em>GD Hatterrissage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHatterrissage()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gDHatterrissage = GD_HATTERRISSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMotifNonDecollage() <em>Motif Non Decollage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotifNonDecollage()
	 * @generated
	 * @ordered
	 */
	protected static final String MOTIF_NON_DECOLLAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMotifNonDecollage() <em>Motif Non Decollage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotifNonDecollage()
	 * @generated
	 * @ordered
	 */
	protected String motifNonDecollage = MOTIF_NON_DECOLLAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getComplements() <em>Complements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplements()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPLEMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComplements() <em>Complements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplements()
	 * @generated
	 * @ordered
	 */
	protected String complements = COMPLEMENTS_EDEFAULT;

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
	 * The cached value of the '{@link #getConcerneModule() <em>Concerne Module</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneModule()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> concerneModule;

	/**
	 * The cached value of the '{@link #getADecolleAutreElementControle() <em>ADecolle Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getADecolleAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aDecolleAutreElementControle;

	/**
	 * The cached value of the '{@link #getAAtterriEnAutreElementControle() <em>AAtterri En Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAAtterriEnAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aAtterriEnAutreElementControle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeBilanModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeBilanModule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNbAppareilsArrives() {
		return nbAppareilsArrives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbAppareilsArrives(long newNbAppareilsArrives) {
		long oldNbAppareilsArrives = nbAppareilsArrives;
		nbAppareilsArrives = newNbAppareilsArrives;
		boolean oldNbAppareilsArrivesESet = nbAppareilsArrivesESet;
		nbAppareilsArrivesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BILAN_MODULE__NB_APPAREILS_ARRIVES, oldNbAppareilsArrives, nbAppareilsArrives, !oldNbAppareilsArrivesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNbAppareilsArrives() {
		long oldNbAppareilsArrives = nbAppareilsArrives;
		boolean oldNbAppareilsArrivesESet = nbAppareilsArrivesESet;
		nbAppareilsArrives = NB_APPAREILS_ARRIVES_EDEFAULT;
		nbAppareilsArrivesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_BILAN_MODULE__NB_APPAREILS_ARRIVES, oldNbAppareilsArrives, NB_APPAREILS_ARRIVES_EDEFAULT, oldNbAppareilsArrivesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNbAppareilsArrives() {
		return nbAppareilsArrivesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getGDHdecollage() {
		return gDHdecollage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGDHdecollage(XMLGregorianCalendar newGDHdecollage) {
		XMLGregorianCalendar oldGDHdecollage = gDHdecollage;
		gDHdecollage = newGDHdecollage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BILAN_MODULE__GD_HDECOLLAGE, oldGDHdecollage, gDHdecollage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getGDHatterrissage() {
		return gDHatterrissage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGDHatterrissage(XMLGregorianCalendar newGDHatterrissage) {
		XMLGregorianCalendar oldGDHatterrissage = gDHatterrissage;
		gDHatterrissage = newGDHatterrissage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BILAN_MODULE__GD_HATTERRISSAGE, oldGDHatterrissage, gDHatterrissage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMotifNonDecollage() {
		return motifNonDecollage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMotifNonDecollage(String newMotifNonDecollage) {
		String oldMotifNonDecollage = motifNonDecollage;
		motifNonDecollage = newMotifNonDecollage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BILAN_MODULE__MOTIF_NON_DECOLLAGE, oldMotifNonDecollage, motifNonDecollage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComplements() {
		return complements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplements(String newComplements) {
		String oldComplements = complements;
		complements = newComplements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BILAN_MODULE__COMPLEMENTS, oldComplements, complements));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BILAN_MODULE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BILAN_MODULE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getConcerneModule() {
		if (concerneModule == null) {
			concerneModule = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_BILAN_MODULE__CONCERNE_MODULE);
		}
		return concerneModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getADecolleAutreElementControle() {
		return aDecolleAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetADecolleAutreElementControle(TypeAssociation newADecolleAutreElementControle, NotificationChain msgs) {
		TypeAssociation oldADecolleAutreElementControle = aDecolleAutreElementControle;
		aDecolleAutreElementControle = newADecolleAutreElementControle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BILAN_MODULE__ADECOLLE_AUTRE_ELEMENT_CONTROLE, oldADecolleAutreElementControle, newADecolleAutreElementControle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setADecolleAutreElementControle(TypeAssociation newADecolleAutreElementControle) {
		if (newADecolleAutreElementControle != aDecolleAutreElementControle) {
			NotificationChain msgs = null;
			if (aDecolleAutreElementControle != null)
				msgs = ((InternalEObject)aDecolleAutreElementControle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_BILAN_MODULE__ADECOLLE_AUTRE_ELEMENT_CONTROLE, null, msgs);
			if (newADecolleAutreElementControle != null)
				msgs = ((InternalEObject)newADecolleAutreElementControle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_BILAN_MODULE__ADECOLLE_AUTRE_ELEMENT_CONTROLE, null, msgs);
			msgs = basicSetADecolleAutreElementControle(newADecolleAutreElementControle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BILAN_MODULE__ADECOLLE_AUTRE_ELEMENT_CONTROLE, newADecolleAutreElementControle, newADecolleAutreElementControle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAAtterriEnAutreElementControle() {
		return aAtterriEnAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAAtterriEnAutreElementControle(TypeAssociation newAAtterriEnAutreElementControle, NotificationChain msgs) {
		TypeAssociation oldAAtterriEnAutreElementControle = aAtterriEnAutreElementControle;
		aAtterriEnAutreElementControle = newAAtterriEnAutreElementControle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BILAN_MODULE__AATTERRI_EN_AUTRE_ELEMENT_CONTROLE, oldAAtterriEnAutreElementControle, newAAtterriEnAutreElementControle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAAtterriEnAutreElementControle(TypeAssociation newAAtterriEnAutreElementControle) {
		if (newAAtterriEnAutreElementControle != aAtterriEnAutreElementControle) {
			NotificationChain msgs = null;
			if (aAtterriEnAutreElementControle != null)
				msgs = ((InternalEObject)aAtterriEnAutreElementControle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_BILAN_MODULE__AATTERRI_EN_AUTRE_ELEMENT_CONTROLE, null, msgs);
			if (newAAtterriEnAutreElementControle != null)
				msgs = ((InternalEObject)newAAtterriEnAutreElementControle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_BILAN_MODULE__AATTERRI_EN_AUTRE_ELEMENT_CONTROLE, null, msgs);
			msgs = basicSetAAtterriEnAutreElementControle(newAAtterriEnAutreElementControle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BILAN_MODULE__AATTERRI_EN_AUTRE_ELEMENT_CONTROLE, newAAtterriEnAutreElementControle, newAAtterriEnAutreElementControle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_BILAN_MODULE__CONCERNE_MODULE:
				return ((InternalEList<?>)getConcerneModule()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_BILAN_MODULE__ADECOLLE_AUTRE_ELEMENT_CONTROLE:
				return basicSetADecolleAutreElementControle(null, msgs);
			case SchemaPackage.TYPE_BILAN_MODULE__AATTERRI_EN_AUTRE_ELEMENT_CONTROLE:
				return basicSetAAtterriEnAutreElementControle(null, msgs);
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
			case SchemaPackage.TYPE_BILAN_MODULE__NB_APPAREILS_ARRIVES:
				return new Long(getNbAppareilsArrives());
			case SchemaPackage.TYPE_BILAN_MODULE__GD_HDECOLLAGE:
				return getGDHdecollage();
			case SchemaPackage.TYPE_BILAN_MODULE__GD_HATTERRISSAGE:
				return getGDHatterrissage();
			case SchemaPackage.TYPE_BILAN_MODULE__MOTIF_NON_DECOLLAGE:
				return getMotifNonDecollage();
			case SchemaPackage.TYPE_BILAN_MODULE__COMPLEMENTS:
				return getComplements();
			case SchemaPackage.TYPE_BILAN_MODULE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_BILAN_MODULE__CE:
				return getCE();
			case SchemaPackage.TYPE_BILAN_MODULE__CONCERNE_MODULE:
				return getConcerneModule();
			case SchemaPackage.TYPE_BILAN_MODULE__ADECOLLE_AUTRE_ELEMENT_CONTROLE:
				return getADecolleAutreElementControle();
			case SchemaPackage.TYPE_BILAN_MODULE__AATTERRI_EN_AUTRE_ELEMENT_CONTROLE:
				return getAAtterriEnAutreElementControle();
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
			case SchemaPackage.TYPE_BILAN_MODULE__NB_APPAREILS_ARRIVES:
				setNbAppareilsArrives(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_BILAN_MODULE__GD_HDECOLLAGE:
				setGDHdecollage((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_BILAN_MODULE__GD_HATTERRISSAGE:
				setGDHatterrissage((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_BILAN_MODULE__MOTIF_NON_DECOLLAGE:
				setMotifNonDecollage((String)newValue);
				return;
			case SchemaPackage.TYPE_BILAN_MODULE__COMPLEMENTS:
				setComplements((String)newValue);
				return;
			case SchemaPackage.TYPE_BILAN_MODULE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_BILAN_MODULE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_BILAN_MODULE__CONCERNE_MODULE:
				getConcerneModule().clear();
				getConcerneModule().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_BILAN_MODULE__ADECOLLE_AUTRE_ELEMENT_CONTROLE:
				setADecolleAutreElementControle((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_BILAN_MODULE__AATTERRI_EN_AUTRE_ELEMENT_CONTROLE:
				setAAtterriEnAutreElementControle((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_BILAN_MODULE__NB_APPAREILS_ARRIVES:
				unsetNbAppareilsArrives();
				return;
			case SchemaPackage.TYPE_BILAN_MODULE__GD_HDECOLLAGE:
				setGDHdecollage(GD_HDECOLLAGE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_BILAN_MODULE__GD_HATTERRISSAGE:
				setGDHatterrissage(GD_HATTERRISSAGE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_BILAN_MODULE__MOTIF_NON_DECOLLAGE:
				setMotifNonDecollage(MOTIF_NON_DECOLLAGE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_BILAN_MODULE__COMPLEMENTS:
				setComplements(COMPLEMENTS_EDEFAULT);
				return;
			case SchemaPackage.TYPE_BILAN_MODULE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_BILAN_MODULE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_BILAN_MODULE__CONCERNE_MODULE:
				getConcerneModule().clear();
				return;
			case SchemaPackage.TYPE_BILAN_MODULE__ADECOLLE_AUTRE_ELEMENT_CONTROLE:
				setADecolleAutreElementControle((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_BILAN_MODULE__AATTERRI_EN_AUTRE_ELEMENT_CONTROLE:
				setAAtterriEnAutreElementControle((TypeAssociation)null);
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
			case SchemaPackage.TYPE_BILAN_MODULE__NB_APPAREILS_ARRIVES:
				return isSetNbAppareilsArrives();
			case SchemaPackage.TYPE_BILAN_MODULE__GD_HDECOLLAGE:
				return GD_HDECOLLAGE_EDEFAULT == null ? gDHdecollage != null : !GD_HDECOLLAGE_EDEFAULT.equals(gDHdecollage);
			case SchemaPackage.TYPE_BILAN_MODULE__GD_HATTERRISSAGE:
				return GD_HATTERRISSAGE_EDEFAULT == null ? gDHatterrissage != null : !GD_HATTERRISSAGE_EDEFAULT.equals(gDHatterrissage);
			case SchemaPackage.TYPE_BILAN_MODULE__MOTIF_NON_DECOLLAGE:
				return MOTIF_NON_DECOLLAGE_EDEFAULT == null ? motifNonDecollage != null : !MOTIF_NON_DECOLLAGE_EDEFAULT.equals(motifNonDecollage);
			case SchemaPackage.TYPE_BILAN_MODULE__COMPLEMENTS:
				return COMPLEMENTS_EDEFAULT == null ? complements != null : !COMPLEMENTS_EDEFAULT.equals(complements);
			case SchemaPackage.TYPE_BILAN_MODULE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_BILAN_MODULE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_BILAN_MODULE__CONCERNE_MODULE:
				return concerneModule != null && !concerneModule.isEmpty();
			case SchemaPackage.TYPE_BILAN_MODULE__ADECOLLE_AUTRE_ELEMENT_CONTROLE:
				return aDecolleAutreElementControle != null;
			case SchemaPackage.TYPE_BILAN_MODULE__AATTERRI_EN_AUTRE_ELEMENT_CONTROLE:
				return aAtterriEnAutreElementControle != null;
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
		result.append(" (nbAppareilsArrives: ");
		if (nbAppareilsArrivesESet) result.append(nbAppareilsArrives); else result.append("<unset>");
		result.append(", gDHdecollage: ");
		result.append(gDHdecollage);
		result.append(", gDHatterrissage: ");
		result.append(gDHatterrissage);
		result.append(", motifNonDecollage: ");
		result.append(motifNonDecollage);
		result.append(", complements: ");
		result.append(complements);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeBilanModuleImpl
