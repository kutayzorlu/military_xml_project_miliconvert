/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoEffetDescription;
import mpia.schema.TypeDictionaryDicoEffetGravite;
import mpia.schema.TypeEffet;
import mpia.schema.TypeEffetAuContactASS;
import mpia.schema.TypeEffetSurInstanceObjet;
import mpia.schema.TypeEffetSurType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Effet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEffetImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEffetImpl#getGravite <em>Gravite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEffetImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEffetImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEffetImpl#getEstAuContactEffetAuContactASS <em>Est Au Contact Effet Au Contact ASS</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEffetImpl#getVautPourTypeEffetSurType <em>Vaut Pour Type Effet Sur Type</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEffetImpl#getVautPourInstanceEffetSurInstanceObjet <em>Vaut Pour Instance Effet Sur Instance Objet</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEffetImpl#getEstRapporteParRapport <em>Est Rapporte Par Rapport</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeEffetImpl extends EObjectImpl implements TypeEffet {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEffetDescription DESCRIPTION_EDEFAULT = TypeDictionaryDicoEffetDescription.BURN;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEffetDescription description = DESCRIPTION_EDEFAULT;

	/**
	 * This is true if the Description attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean descriptionESet;

	/**
	 * The default value of the '{@link #getGravite() <em>Gravite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGravite()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEffetGravite GRAVITE_EDEFAULT = TypeDictionaryDicoEffetGravite.NODSRP;

	/**
	 * The cached value of the '{@link #getGravite() <em>Gravite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGravite()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEffetGravite gravite = GRAVITE_EDEFAULT;

	/**
	 * This is true if the Gravite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean graviteESet;

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
	 * The cached value of the '{@link #getEstAuContactEffetAuContactASS() <em>Est Au Contact Effet Au Contact ASS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstAuContactEffetAuContactASS()
	 * @generated
	 * @ordered
	 */
	protected TypeEffetAuContactASS estAuContactEffetAuContactASS;

	/**
	 * The cached value of the '{@link #getVautPourTypeEffetSurType() <em>Vaut Pour Type Effet Sur Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVautPourTypeEffetSurType()
	 * @generated
	 * @ordered
	 */
	protected TypeEffetSurType vautPourTypeEffetSurType;

	/**
	 * The cached value of the '{@link #getVautPourInstanceEffetSurInstanceObjet() <em>Vaut Pour Instance Effet Sur Instance Objet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVautPourInstanceEffetSurInstanceObjet()
	 * @generated
	 * @ordered
	 */
	protected TypeEffetSurInstanceObjet vautPourInstanceEffetSurInstanceObjet;

	/**
	 * The cached value of the '{@link #getEstRapporteParRapport() <em>Est Rapporte Par Rapport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstRapporteParRapport()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation estRapporteParRapport;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeEffetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEffet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEffetDescription getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(TypeDictionaryDicoEffetDescription newDescription) {
		TypeDictionaryDicoEffetDescription oldDescription = description;
		description = newDescription == null ? DESCRIPTION_EDEFAULT : newDescription;
		boolean oldDescriptionESet = descriptionESet;
		descriptionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EFFET__DESCRIPTION, oldDescription, description, !oldDescriptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDescription() {
		TypeDictionaryDicoEffetDescription oldDescription = description;
		boolean oldDescriptionESet = descriptionESet;
		description = DESCRIPTION_EDEFAULT;
		descriptionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EFFET__DESCRIPTION, oldDescription, DESCRIPTION_EDEFAULT, oldDescriptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDescription() {
		return descriptionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEffetGravite getGravite() {
		return gravite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGravite(TypeDictionaryDicoEffetGravite newGravite) {
		TypeDictionaryDicoEffetGravite oldGravite = gravite;
		gravite = newGravite == null ? GRAVITE_EDEFAULT : newGravite;
		boolean oldGraviteESet = graviteESet;
		graviteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EFFET__GRAVITE, oldGravite, gravite, !oldGraviteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGravite() {
		TypeDictionaryDicoEffetGravite oldGravite = gravite;
		boolean oldGraviteESet = graviteESet;
		gravite = GRAVITE_EDEFAULT;
		graviteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EFFET__GRAVITE, oldGravite, GRAVITE_EDEFAULT, oldGraviteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGravite() {
		return graviteESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EFFET__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EFFET__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeEffetAuContactASS getEstAuContactEffetAuContactASS() {
		return estAuContactEffetAuContactASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstAuContactEffetAuContactASS(TypeEffetAuContactASS newEstAuContactEffetAuContactASS, NotificationChain msgs) {
		TypeEffetAuContactASS oldEstAuContactEffetAuContactASS = estAuContactEffetAuContactASS;
		estAuContactEffetAuContactASS = newEstAuContactEffetAuContactASS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EFFET__EST_AU_CONTACT_EFFET_AU_CONTACT_ASS, oldEstAuContactEffetAuContactASS, newEstAuContactEffetAuContactASS);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstAuContactEffetAuContactASS(TypeEffetAuContactASS newEstAuContactEffetAuContactASS) {
		if (newEstAuContactEffetAuContactASS != estAuContactEffetAuContactASS) {
			NotificationChain msgs = null;
			if (estAuContactEffetAuContactASS != null)
				msgs = ((InternalEObject)estAuContactEffetAuContactASS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EFFET__EST_AU_CONTACT_EFFET_AU_CONTACT_ASS, null, msgs);
			if (newEstAuContactEffetAuContactASS != null)
				msgs = ((InternalEObject)newEstAuContactEffetAuContactASS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EFFET__EST_AU_CONTACT_EFFET_AU_CONTACT_ASS, null, msgs);
			msgs = basicSetEstAuContactEffetAuContactASS(newEstAuContactEffetAuContactASS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EFFET__EST_AU_CONTACT_EFFET_AU_CONTACT_ASS, newEstAuContactEffetAuContactASS, newEstAuContactEffetAuContactASS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeEffetSurType getVautPourTypeEffetSurType() {
		return vautPourTypeEffetSurType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVautPourTypeEffetSurType(TypeEffetSurType newVautPourTypeEffetSurType, NotificationChain msgs) {
		TypeEffetSurType oldVautPourTypeEffetSurType = vautPourTypeEffetSurType;
		vautPourTypeEffetSurType = newVautPourTypeEffetSurType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EFFET__VAUT_POUR_TYPE_EFFET_SUR_TYPE, oldVautPourTypeEffetSurType, newVautPourTypeEffetSurType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVautPourTypeEffetSurType(TypeEffetSurType newVautPourTypeEffetSurType) {
		if (newVautPourTypeEffetSurType != vautPourTypeEffetSurType) {
			NotificationChain msgs = null;
			if (vautPourTypeEffetSurType != null)
				msgs = ((InternalEObject)vautPourTypeEffetSurType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EFFET__VAUT_POUR_TYPE_EFFET_SUR_TYPE, null, msgs);
			if (newVautPourTypeEffetSurType != null)
				msgs = ((InternalEObject)newVautPourTypeEffetSurType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EFFET__VAUT_POUR_TYPE_EFFET_SUR_TYPE, null, msgs);
			msgs = basicSetVautPourTypeEffetSurType(newVautPourTypeEffetSurType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EFFET__VAUT_POUR_TYPE_EFFET_SUR_TYPE, newVautPourTypeEffetSurType, newVautPourTypeEffetSurType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeEffetSurInstanceObjet getVautPourInstanceEffetSurInstanceObjet() {
		return vautPourInstanceEffetSurInstanceObjet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVautPourInstanceEffetSurInstanceObjet(TypeEffetSurInstanceObjet newVautPourInstanceEffetSurInstanceObjet, NotificationChain msgs) {
		TypeEffetSurInstanceObjet oldVautPourInstanceEffetSurInstanceObjet = vautPourInstanceEffetSurInstanceObjet;
		vautPourInstanceEffetSurInstanceObjet = newVautPourInstanceEffetSurInstanceObjet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EFFET__VAUT_POUR_INSTANCE_EFFET_SUR_INSTANCE_OBJET, oldVautPourInstanceEffetSurInstanceObjet, newVautPourInstanceEffetSurInstanceObjet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVautPourInstanceEffetSurInstanceObjet(TypeEffetSurInstanceObjet newVautPourInstanceEffetSurInstanceObjet) {
		if (newVautPourInstanceEffetSurInstanceObjet != vautPourInstanceEffetSurInstanceObjet) {
			NotificationChain msgs = null;
			if (vautPourInstanceEffetSurInstanceObjet != null)
				msgs = ((InternalEObject)vautPourInstanceEffetSurInstanceObjet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EFFET__VAUT_POUR_INSTANCE_EFFET_SUR_INSTANCE_OBJET, null, msgs);
			if (newVautPourInstanceEffetSurInstanceObjet != null)
				msgs = ((InternalEObject)newVautPourInstanceEffetSurInstanceObjet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EFFET__VAUT_POUR_INSTANCE_EFFET_SUR_INSTANCE_OBJET, null, msgs);
			msgs = basicSetVautPourInstanceEffetSurInstanceObjet(newVautPourInstanceEffetSurInstanceObjet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EFFET__VAUT_POUR_INSTANCE_EFFET_SUR_INSTANCE_OBJET, newVautPourInstanceEffetSurInstanceObjet, newVautPourInstanceEffetSurInstanceObjet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getEstRapporteParRapport() {
		return estRapporteParRapport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstRapporteParRapport(TypeAssociation newEstRapporteParRapport, NotificationChain msgs) {
		TypeAssociation oldEstRapporteParRapport = estRapporteParRapport;
		estRapporteParRapport = newEstRapporteParRapport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EFFET__EST_RAPPORTE_PAR_RAPPORT, oldEstRapporteParRapport, newEstRapporteParRapport);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstRapporteParRapport(TypeAssociation newEstRapporteParRapport) {
		if (newEstRapporteParRapport != estRapporteParRapport) {
			NotificationChain msgs = null;
			if (estRapporteParRapport != null)
				msgs = ((InternalEObject)estRapporteParRapport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EFFET__EST_RAPPORTE_PAR_RAPPORT, null, msgs);
			if (newEstRapporteParRapport != null)
				msgs = ((InternalEObject)newEstRapporteParRapport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EFFET__EST_RAPPORTE_PAR_RAPPORT, null, msgs);
			msgs = basicSetEstRapporteParRapport(newEstRapporteParRapport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EFFET__EST_RAPPORTE_PAR_RAPPORT, newEstRapporteParRapport, newEstRapporteParRapport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_EFFET__EST_AU_CONTACT_EFFET_AU_CONTACT_ASS:
				return basicSetEstAuContactEffetAuContactASS(null, msgs);
			case SchemaPackage.TYPE_EFFET__VAUT_POUR_TYPE_EFFET_SUR_TYPE:
				return basicSetVautPourTypeEffetSurType(null, msgs);
			case SchemaPackage.TYPE_EFFET__VAUT_POUR_INSTANCE_EFFET_SUR_INSTANCE_OBJET:
				return basicSetVautPourInstanceEffetSurInstanceObjet(null, msgs);
			case SchemaPackage.TYPE_EFFET__EST_RAPPORTE_PAR_RAPPORT:
				return basicSetEstRapporteParRapport(null, msgs);
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
			case SchemaPackage.TYPE_EFFET__DESCRIPTION:
				return getDescription();
			case SchemaPackage.TYPE_EFFET__GRAVITE:
				return getGravite();
			case SchemaPackage.TYPE_EFFET__CTE:
				return getCTE();
			case SchemaPackage.TYPE_EFFET__CE:
				return getCE();
			case SchemaPackage.TYPE_EFFET__EST_AU_CONTACT_EFFET_AU_CONTACT_ASS:
				return getEstAuContactEffetAuContactASS();
			case SchemaPackage.TYPE_EFFET__VAUT_POUR_TYPE_EFFET_SUR_TYPE:
				return getVautPourTypeEffetSurType();
			case SchemaPackage.TYPE_EFFET__VAUT_POUR_INSTANCE_EFFET_SUR_INSTANCE_OBJET:
				return getVautPourInstanceEffetSurInstanceObjet();
			case SchemaPackage.TYPE_EFFET__EST_RAPPORTE_PAR_RAPPORT:
				return getEstRapporteParRapport();
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
			case SchemaPackage.TYPE_EFFET__DESCRIPTION:
				setDescription((TypeDictionaryDicoEffetDescription)newValue);
				return;
			case SchemaPackage.TYPE_EFFET__GRAVITE:
				setGravite((TypeDictionaryDicoEffetGravite)newValue);
				return;
			case SchemaPackage.TYPE_EFFET__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_EFFET__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_EFFET__EST_AU_CONTACT_EFFET_AU_CONTACT_ASS:
				setEstAuContactEffetAuContactASS((TypeEffetAuContactASS)newValue);
				return;
			case SchemaPackage.TYPE_EFFET__VAUT_POUR_TYPE_EFFET_SUR_TYPE:
				setVautPourTypeEffetSurType((TypeEffetSurType)newValue);
				return;
			case SchemaPackage.TYPE_EFFET__VAUT_POUR_INSTANCE_EFFET_SUR_INSTANCE_OBJET:
				setVautPourInstanceEffetSurInstanceObjet((TypeEffetSurInstanceObjet)newValue);
				return;
			case SchemaPackage.TYPE_EFFET__EST_RAPPORTE_PAR_RAPPORT:
				setEstRapporteParRapport((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_EFFET__DESCRIPTION:
				unsetDescription();
				return;
			case SchemaPackage.TYPE_EFFET__GRAVITE:
				unsetGravite();
				return;
			case SchemaPackage.TYPE_EFFET__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_EFFET__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_EFFET__EST_AU_CONTACT_EFFET_AU_CONTACT_ASS:
				setEstAuContactEffetAuContactASS((TypeEffetAuContactASS)null);
				return;
			case SchemaPackage.TYPE_EFFET__VAUT_POUR_TYPE_EFFET_SUR_TYPE:
				setVautPourTypeEffetSurType((TypeEffetSurType)null);
				return;
			case SchemaPackage.TYPE_EFFET__VAUT_POUR_INSTANCE_EFFET_SUR_INSTANCE_OBJET:
				setVautPourInstanceEffetSurInstanceObjet((TypeEffetSurInstanceObjet)null);
				return;
			case SchemaPackage.TYPE_EFFET__EST_RAPPORTE_PAR_RAPPORT:
				setEstRapporteParRapport((TypeAssociation)null);
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
			case SchemaPackage.TYPE_EFFET__DESCRIPTION:
				return isSetDescription();
			case SchemaPackage.TYPE_EFFET__GRAVITE:
				return isSetGravite();
			case SchemaPackage.TYPE_EFFET__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_EFFET__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_EFFET__EST_AU_CONTACT_EFFET_AU_CONTACT_ASS:
				return estAuContactEffetAuContactASS != null;
			case SchemaPackage.TYPE_EFFET__VAUT_POUR_TYPE_EFFET_SUR_TYPE:
				return vautPourTypeEffetSurType != null;
			case SchemaPackage.TYPE_EFFET__VAUT_POUR_INSTANCE_EFFET_SUR_INSTANCE_OBJET:
				return vautPourInstanceEffetSurInstanceObjet != null;
			case SchemaPackage.TYPE_EFFET__EST_RAPPORTE_PAR_RAPPORT:
				return estRapporteParRapport != null;
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
		result.append(" (description: ");
		if (descriptionESet) result.append(description); else result.append("<unset>");
		result.append(", gravite: ");
		if (graviteESet) result.append(gravite); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeEffetImpl
