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
import mpia.meta.TypeDataTypeVitesseLineaire;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCouvertureASA;
import mpia.schema.TypeDictionaryDicoAltitude;
import mpia.schema.TypeDictionaryDicoCouvertureASATypeCouvertureSolAir;
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
 * An implementation of the model object '<em><b>Type Couverture ASA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeCouvertureASAImpl#getAltitudeCouverture <em>Altitude Couverture</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCouvertureASAImpl#getVitesse <em>Vitesse</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCouvertureASAImpl#getTypeCouvertureSolAir <em>Type Couverture Sol Air</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCouvertureASAImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCouvertureASAImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCouvertureASAImpl#getConcerneTypeArmeSolAirTypeArme <em>Concerne Type Arme Sol Air Type Arme</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCouvertureASAImpl#getAPourUniteASAresponsableUnite <em>APour Unite AS Aresponsable Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCouvertureASAImpl#getAPourZoneCouvertureAutreElementControle <em>APour Zone Couverture Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCouvertureASAImpl#getAPourPeriodesActivationPeriode3D <em>APour Periodes Activation Periode3 D</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeCouvertureASAImpl extends EObjectImpl implements TypeCouvertureASA {
	/**
	 * The default value of the '{@link #getAltitudeCouverture() <em>Altitude Couverture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitudeCouverture()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAltitude ALTITUDE_COUVERTURE_EDEFAULT = TypeDictionaryDicoAltitude.VL;

	/**
	 * The cached value of the '{@link #getAltitudeCouverture() <em>Altitude Couverture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitudeCouverture()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAltitude altitudeCouverture = ALTITUDE_COUVERTURE_EDEFAULT;

	/**
	 * This is true if the Altitude Couverture attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean altitudeCouvertureESet;

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
	 * The default value of the '{@link #getTypeCouvertureSolAir() <em>Type Couverture Sol Air</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCouvertureSolAir()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCouvertureASATypeCouvertureSolAir TYPE_COUVERTURE_SOL_AIR_EDEFAULT = TypeDictionaryDicoCouvertureASATypeCouvertureSolAir.SZ;

	/**
	 * The cached value of the '{@link #getTypeCouvertureSolAir() <em>Type Couverture Sol Air</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCouvertureSolAir()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCouvertureASATypeCouvertureSolAir typeCouvertureSolAir = TYPE_COUVERTURE_SOL_AIR_EDEFAULT;

	/**
	 * This is true if the Type Couverture Sol Air attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeCouvertureSolAirESet;

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
	 * The cached value of the '{@link #getConcerneTypeArmeSolAirTypeArme() <em>Concerne Type Arme Sol Air Type Arme</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneTypeArmeSolAirTypeArme()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT concerneTypeArmeSolAirTypeArme;

	/**
	 * The cached value of the '{@link #getAPourUniteASAresponsableUnite() <em>APour Unite AS Aresponsable Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourUniteASAresponsableUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aPourUniteASAresponsableUnite;

	/**
	 * The cached value of the '{@link #getAPourZoneCouvertureAutreElementControle() <em>APour Zone Couverture Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourZoneCouvertureAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourZoneCouvertureAutreElementControle;

	/**
	 * The cached value of the '{@link #getAPourPeriodesActivationPeriode3D() <em>APour Periodes Activation Periode3 D</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourPeriodesActivationPeriode3D()
	 * @generated
	 * @ordered
	 */
	protected EList<TypePeriode3D> aPourPeriodesActivationPeriode3D;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeCouvertureASAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeCouvertureASA();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAltitude getAltitudeCouverture() {
		return altitudeCouverture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAltitudeCouverture(TypeDictionaryDicoAltitude newAltitudeCouverture) {
		TypeDictionaryDicoAltitude oldAltitudeCouverture = altitudeCouverture;
		altitudeCouverture = newAltitudeCouverture == null ? ALTITUDE_COUVERTURE_EDEFAULT : newAltitudeCouverture;
		boolean oldAltitudeCouvertureESet = altitudeCouvertureESet;
		altitudeCouvertureESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COUVERTURE_ASA__ALTITUDE_COUVERTURE, oldAltitudeCouverture, altitudeCouverture, !oldAltitudeCouvertureESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAltitudeCouverture() {
		TypeDictionaryDicoAltitude oldAltitudeCouverture = altitudeCouverture;
		boolean oldAltitudeCouvertureESet = altitudeCouvertureESet;
		altitudeCouverture = ALTITUDE_COUVERTURE_EDEFAULT;
		altitudeCouvertureESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_COUVERTURE_ASA__ALTITUDE_COUVERTURE, oldAltitudeCouverture, ALTITUDE_COUVERTURE_EDEFAULT, oldAltitudeCouvertureESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAltitudeCouverture() {
		return altitudeCouvertureESet;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COUVERTURE_ASA__VITESSE, oldVitesse, newVitesse);
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
				msgs = ((InternalEObject)vitesse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_COUVERTURE_ASA__VITESSE, null, msgs);
			if (newVitesse != null)
				msgs = ((InternalEObject)newVitesse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_COUVERTURE_ASA__VITESSE, null, msgs);
			msgs = basicSetVitesse(newVitesse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COUVERTURE_ASA__VITESSE, newVitesse, newVitesse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoCouvertureASATypeCouvertureSolAir getTypeCouvertureSolAir() {
		return typeCouvertureSolAir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeCouvertureSolAir(TypeDictionaryDicoCouvertureASATypeCouvertureSolAir newTypeCouvertureSolAir) {
		TypeDictionaryDicoCouvertureASATypeCouvertureSolAir oldTypeCouvertureSolAir = typeCouvertureSolAir;
		typeCouvertureSolAir = newTypeCouvertureSolAir == null ? TYPE_COUVERTURE_SOL_AIR_EDEFAULT : newTypeCouvertureSolAir;
		boolean oldTypeCouvertureSolAirESet = typeCouvertureSolAirESet;
		typeCouvertureSolAirESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COUVERTURE_ASA__TYPE_COUVERTURE_SOL_AIR, oldTypeCouvertureSolAir, typeCouvertureSolAir, !oldTypeCouvertureSolAirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeCouvertureSolAir() {
		TypeDictionaryDicoCouvertureASATypeCouvertureSolAir oldTypeCouvertureSolAir = typeCouvertureSolAir;
		boolean oldTypeCouvertureSolAirESet = typeCouvertureSolAirESet;
		typeCouvertureSolAir = TYPE_COUVERTURE_SOL_AIR_EDEFAULT;
		typeCouvertureSolAirESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_COUVERTURE_ASA__TYPE_COUVERTURE_SOL_AIR, oldTypeCouvertureSolAir, TYPE_COUVERTURE_SOL_AIR_EDEFAULT, oldTypeCouvertureSolAirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeCouvertureSolAir() {
		return typeCouvertureSolAirESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COUVERTURE_ASA__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COUVERTURE_ASA__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getConcerneTypeArmeSolAirTypeArme() {
		return concerneTypeArmeSolAirTypeArme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcerneTypeArmeSolAirTypeArme(TypeAssociationEXT newConcerneTypeArmeSolAirTypeArme, NotificationChain msgs) {
		TypeAssociationEXT oldConcerneTypeArmeSolAirTypeArme = concerneTypeArmeSolAirTypeArme;
		concerneTypeArmeSolAirTypeArme = newConcerneTypeArmeSolAirTypeArme;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COUVERTURE_ASA__CONCERNE_TYPE_ARME_SOL_AIR_TYPE_ARME, oldConcerneTypeArmeSolAirTypeArme, newConcerneTypeArmeSolAirTypeArme);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcerneTypeArmeSolAirTypeArme(TypeAssociationEXT newConcerneTypeArmeSolAirTypeArme) {
		if (newConcerneTypeArmeSolAirTypeArme != concerneTypeArmeSolAirTypeArme) {
			NotificationChain msgs = null;
			if (concerneTypeArmeSolAirTypeArme != null)
				msgs = ((InternalEObject)concerneTypeArmeSolAirTypeArme).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_COUVERTURE_ASA__CONCERNE_TYPE_ARME_SOL_AIR_TYPE_ARME, null, msgs);
			if (newConcerneTypeArmeSolAirTypeArme != null)
				msgs = ((InternalEObject)newConcerneTypeArmeSolAirTypeArme).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_COUVERTURE_ASA__CONCERNE_TYPE_ARME_SOL_AIR_TYPE_ARME, null, msgs);
			msgs = basicSetConcerneTypeArmeSolAirTypeArme(newConcerneTypeArmeSolAirTypeArme, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COUVERTURE_ASA__CONCERNE_TYPE_ARME_SOL_AIR_TYPE_ARME, newConcerneTypeArmeSolAirTypeArme, newConcerneTypeArmeSolAirTypeArme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAPourUniteASAresponsableUnite() {
		return aPourUniteASAresponsableUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourUniteASAresponsableUnite(TypeAssociationEXT newAPourUniteASAresponsableUnite, NotificationChain msgs) {
		TypeAssociationEXT oldAPourUniteASAresponsableUnite = aPourUniteASAresponsableUnite;
		aPourUniteASAresponsableUnite = newAPourUniteASAresponsableUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COUVERTURE_ASA__APOUR_UNITE_AS_ARESPONSABLE_UNITE, oldAPourUniteASAresponsableUnite, newAPourUniteASAresponsableUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourUniteASAresponsableUnite(TypeAssociationEXT newAPourUniteASAresponsableUnite) {
		if (newAPourUniteASAresponsableUnite != aPourUniteASAresponsableUnite) {
			NotificationChain msgs = null;
			if (aPourUniteASAresponsableUnite != null)
				msgs = ((InternalEObject)aPourUniteASAresponsableUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_COUVERTURE_ASA__APOUR_UNITE_AS_ARESPONSABLE_UNITE, null, msgs);
			if (newAPourUniteASAresponsableUnite != null)
				msgs = ((InternalEObject)newAPourUniteASAresponsableUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_COUVERTURE_ASA__APOUR_UNITE_AS_ARESPONSABLE_UNITE, null, msgs);
			msgs = basicSetAPourUniteASAresponsableUnite(newAPourUniteASAresponsableUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COUVERTURE_ASA__APOUR_UNITE_AS_ARESPONSABLE_UNITE, newAPourUniteASAresponsableUnite, newAPourUniteASAresponsableUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourZoneCouvertureAutreElementControle() {
		return aPourZoneCouvertureAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourZoneCouvertureAutreElementControle(TypeAssociation newAPourZoneCouvertureAutreElementControle, NotificationChain msgs) {
		TypeAssociation oldAPourZoneCouvertureAutreElementControle = aPourZoneCouvertureAutreElementControle;
		aPourZoneCouvertureAutreElementControle = newAPourZoneCouvertureAutreElementControle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COUVERTURE_ASA__APOUR_ZONE_COUVERTURE_AUTRE_ELEMENT_CONTROLE, oldAPourZoneCouvertureAutreElementControle, newAPourZoneCouvertureAutreElementControle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourZoneCouvertureAutreElementControle(TypeAssociation newAPourZoneCouvertureAutreElementControle) {
		if (newAPourZoneCouvertureAutreElementControle != aPourZoneCouvertureAutreElementControle) {
			NotificationChain msgs = null;
			if (aPourZoneCouvertureAutreElementControle != null)
				msgs = ((InternalEObject)aPourZoneCouvertureAutreElementControle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_COUVERTURE_ASA__APOUR_ZONE_COUVERTURE_AUTRE_ELEMENT_CONTROLE, null, msgs);
			if (newAPourZoneCouvertureAutreElementControle != null)
				msgs = ((InternalEObject)newAPourZoneCouvertureAutreElementControle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_COUVERTURE_ASA__APOUR_ZONE_COUVERTURE_AUTRE_ELEMENT_CONTROLE, null, msgs);
			msgs = basicSetAPourZoneCouvertureAutreElementControle(newAPourZoneCouvertureAutreElementControle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COUVERTURE_ASA__APOUR_ZONE_COUVERTURE_AUTRE_ELEMENT_CONTROLE, newAPourZoneCouvertureAutreElementControle, newAPourZoneCouvertureAutreElementControle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypePeriode3D> getAPourPeriodesActivationPeriode3D() {
		if (aPourPeriodesActivationPeriode3D == null) {
			aPourPeriodesActivationPeriode3D = new EObjectContainmentEList<TypePeriode3D>(TypePeriode3D.class, this, SchemaPackage.TYPE_COUVERTURE_ASA__APOUR_PERIODES_ACTIVATION_PERIODE3_D);
		}
		return aPourPeriodesActivationPeriode3D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_COUVERTURE_ASA__VITESSE:
				return basicSetVitesse(null, msgs);
			case SchemaPackage.TYPE_COUVERTURE_ASA__CONCERNE_TYPE_ARME_SOL_AIR_TYPE_ARME:
				return basicSetConcerneTypeArmeSolAirTypeArme(null, msgs);
			case SchemaPackage.TYPE_COUVERTURE_ASA__APOUR_UNITE_AS_ARESPONSABLE_UNITE:
				return basicSetAPourUniteASAresponsableUnite(null, msgs);
			case SchemaPackage.TYPE_COUVERTURE_ASA__APOUR_ZONE_COUVERTURE_AUTRE_ELEMENT_CONTROLE:
				return basicSetAPourZoneCouvertureAutreElementControle(null, msgs);
			case SchemaPackage.TYPE_COUVERTURE_ASA__APOUR_PERIODES_ACTIVATION_PERIODE3_D:
				return ((InternalEList<?>)getAPourPeriodesActivationPeriode3D()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_COUVERTURE_ASA__ALTITUDE_COUVERTURE:
				return getAltitudeCouverture();
			case SchemaPackage.TYPE_COUVERTURE_ASA__VITESSE:
				return getVitesse();
			case SchemaPackage.TYPE_COUVERTURE_ASA__TYPE_COUVERTURE_SOL_AIR:
				return getTypeCouvertureSolAir();
			case SchemaPackage.TYPE_COUVERTURE_ASA__CTE:
				return getCTE();
			case SchemaPackage.TYPE_COUVERTURE_ASA__CE:
				return getCE();
			case SchemaPackage.TYPE_COUVERTURE_ASA__CONCERNE_TYPE_ARME_SOL_AIR_TYPE_ARME:
				return getConcerneTypeArmeSolAirTypeArme();
			case SchemaPackage.TYPE_COUVERTURE_ASA__APOUR_UNITE_AS_ARESPONSABLE_UNITE:
				return getAPourUniteASAresponsableUnite();
			case SchemaPackage.TYPE_COUVERTURE_ASA__APOUR_ZONE_COUVERTURE_AUTRE_ELEMENT_CONTROLE:
				return getAPourZoneCouvertureAutreElementControle();
			case SchemaPackage.TYPE_COUVERTURE_ASA__APOUR_PERIODES_ACTIVATION_PERIODE3_D:
				return getAPourPeriodesActivationPeriode3D();
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
			case SchemaPackage.TYPE_COUVERTURE_ASA__ALTITUDE_COUVERTURE:
				setAltitudeCouverture((TypeDictionaryDicoAltitude)newValue);
				return;
			case SchemaPackage.TYPE_COUVERTURE_ASA__VITESSE:
				setVitesse((TypeDataTypeVitesseLineaire)newValue);
				return;
			case SchemaPackage.TYPE_COUVERTURE_ASA__TYPE_COUVERTURE_SOL_AIR:
				setTypeCouvertureSolAir((TypeDictionaryDicoCouvertureASATypeCouvertureSolAir)newValue);
				return;
			case SchemaPackage.TYPE_COUVERTURE_ASA__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_COUVERTURE_ASA__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_COUVERTURE_ASA__CONCERNE_TYPE_ARME_SOL_AIR_TYPE_ARME:
				setConcerneTypeArmeSolAirTypeArme((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_COUVERTURE_ASA__APOUR_UNITE_AS_ARESPONSABLE_UNITE:
				setAPourUniteASAresponsableUnite((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_COUVERTURE_ASA__APOUR_ZONE_COUVERTURE_AUTRE_ELEMENT_CONTROLE:
				setAPourZoneCouvertureAutreElementControle((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_COUVERTURE_ASA__APOUR_PERIODES_ACTIVATION_PERIODE3_D:
				getAPourPeriodesActivationPeriode3D().clear();
				getAPourPeriodesActivationPeriode3D().addAll((Collection<? extends TypePeriode3D>)newValue);
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
			case SchemaPackage.TYPE_COUVERTURE_ASA__ALTITUDE_COUVERTURE:
				unsetAltitudeCouverture();
				return;
			case SchemaPackage.TYPE_COUVERTURE_ASA__VITESSE:
				setVitesse((TypeDataTypeVitesseLineaire)null);
				return;
			case SchemaPackage.TYPE_COUVERTURE_ASA__TYPE_COUVERTURE_SOL_AIR:
				unsetTypeCouvertureSolAir();
				return;
			case SchemaPackage.TYPE_COUVERTURE_ASA__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_COUVERTURE_ASA__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_COUVERTURE_ASA__CONCERNE_TYPE_ARME_SOL_AIR_TYPE_ARME:
				setConcerneTypeArmeSolAirTypeArme((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_COUVERTURE_ASA__APOUR_UNITE_AS_ARESPONSABLE_UNITE:
				setAPourUniteASAresponsableUnite((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_COUVERTURE_ASA__APOUR_ZONE_COUVERTURE_AUTRE_ELEMENT_CONTROLE:
				setAPourZoneCouvertureAutreElementControle((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_COUVERTURE_ASA__APOUR_PERIODES_ACTIVATION_PERIODE3_D:
				getAPourPeriodesActivationPeriode3D().clear();
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
			case SchemaPackage.TYPE_COUVERTURE_ASA__ALTITUDE_COUVERTURE:
				return isSetAltitudeCouverture();
			case SchemaPackage.TYPE_COUVERTURE_ASA__VITESSE:
				return vitesse != null;
			case SchemaPackage.TYPE_COUVERTURE_ASA__TYPE_COUVERTURE_SOL_AIR:
				return isSetTypeCouvertureSolAir();
			case SchemaPackage.TYPE_COUVERTURE_ASA__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_COUVERTURE_ASA__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_COUVERTURE_ASA__CONCERNE_TYPE_ARME_SOL_AIR_TYPE_ARME:
				return concerneTypeArmeSolAirTypeArme != null;
			case SchemaPackage.TYPE_COUVERTURE_ASA__APOUR_UNITE_AS_ARESPONSABLE_UNITE:
				return aPourUniteASAresponsableUnite != null;
			case SchemaPackage.TYPE_COUVERTURE_ASA__APOUR_ZONE_COUVERTURE_AUTRE_ELEMENT_CONTROLE:
				return aPourZoneCouvertureAutreElementControle != null;
			case SchemaPackage.TYPE_COUVERTURE_ASA__APOUR_PERIODES_ACTIVATION_PERIODE3_D:
				return aPourPeriodesActivationPeriode3D != null && !aPourPeriodesActivationPeriode3D.isEmpty();
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
		result.append(" (altitudeCouverture: ");
		if (altitudeCouvertureESet) result.append(altitudeCouverture); else result.append("<unset>");
		result.append(", typeCouvertureSolAir: ");
		if (typeCouvertureSolAirESet) result.append(typeCouvertureSolAir); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeCouvertureASAImpl
