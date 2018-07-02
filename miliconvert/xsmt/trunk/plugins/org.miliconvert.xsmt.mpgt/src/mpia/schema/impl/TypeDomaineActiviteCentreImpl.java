/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoDomaineActiviteCentreTypeDomaine;
import mpia.schema.TypeDomaineActiviteCentre;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Domaine Activite Centre</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeDomaineActiviteCentreImpl#getTypeDomaine <em>Type Domaine</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDomaineActiviteCentreImpl#getAutreTypeDomaine <em>Autre Type Domaine</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDomaineActiviteCentreImpl#getTauxCouverture <em>Taux Couverture</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDomaineActiviteCentreImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDomaineActiviteCentreImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDomaineActiviteCentreImpl#getACommeAutoriteControle3DUnite <em>AComme Autorite Controle3 DUnite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDomaineActiviteCentreImpl#getACommeVolumeActiviteAutreElementControle <em>AComme Volume Activite Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDomaineActiviteCentreImpl#getACommeTypeMenaceAssocieeTypeAeronef <em>AComme Type Menace Associee Type Aeronef</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeDomaineActiviteCentreImpl extends EObjectImpl implements TypeDomaineActiviteCentre {
	/**
	 * The default value of the '{@link #getTypeDomaine() <em>Type Domaine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDomaine()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoDomaineActiviteCentreTypeDomaine TYPE_DOMAINE_EDEFAULT = TypeDictionaryDicoDomaineActiviteCentreTypeDomaine.FIRZN;

	/**
	 * The cached value of the '{@link #getTypeDomaine() <em>Type Domaine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDomaine()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoDomaineActiviteCentreTypeDomaine typeDomaine = TYPE_DOMAINE_EDEFAULT;

	/**
	 * This is true if the Type Domaine attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeDomaineESet;

	/**
	 * The default value of the '{@link #getAutreTypeDomaine() <em>Autre Type Domaine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutreTypeDomaine()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTRE_TYPE_DOMAINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutreTypeDomaine() <em>Autre Type Domaine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutreTypeDomaine()
	 * @generated
	 * @ordered
	 */
	protected String autreTypeDomaine = AUTRE_TYPE_DOMAINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTauxCouverture() <em>Taux Couverture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTauxCouverture()
	 * @generated
	 * @ordered
	 */
	protected static final double TAUX_COUVERTURE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTauxCouverture() <em>Taux Couverture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTauxCouverture()
	 * @generated
	 * @ordered
	 */
	protected double tauxCouverture = TAUX_COUVERTURE_EDEFAULT;

	/**
	 * This is true if the Taux Couverture attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tauxCouvertureESet;

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
	 * The cached value of the '{@link #getACommeAutoriteControle3DUnite() <em>AComme Autorite Controle3 DUnite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeAutoriteControle3DUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aCommeAutoriteControle3DUnite;

	/**
	 * The cached value of the '{@link #getACommeVolumeActiviteAutreElementControle() <em>AComme Volume Activite Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeVolumeActiviteAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aCommeVolumeActiviteAutreElementControle;

	/**
	 * The cached value of the '{@link #getACommeTypeMenaceAssocieeTypeAeronef() <em>AComme Type Menace Associee Type Aeronef</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeTypeMenaceAssocieeTypeAeronef()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aCommeTypeMenaceAssocieeTypeAeronef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeDomaineActiviteCentreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeDomaineActiviteCentre();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoDomaineActiviteCentreTypeDomaine getTypeDomaine() {
		return typeDomaine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeDomaine(TypeDictionaryDicoDomaineActiviteCentreTypeDomaine newTypeDomaine) {
		TypeDictionaryDicoDomaineActiviteCentreTypeDomaine oldTypeDomaine = typeDomaine;
		typeDomaine = newTypeDomaine == null ? TYPE_DOMAINE_EDEFAULT : newTypeDomaine;
		boolean oldTypeDomaineESet = typeDomaineESet;
		typeDomaineESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOMAINE_ACTIVITE_CENTRE__TYPE_DOMAINE, oldTypeDomaine, typeDomaine, !oldTypeDomaineESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeDomaine() {
		TypeDictionaryDicoDomaineActiviteCentreTypeDomaine oldTypeDomaine = typeDomaine;
		boolean oldTypeDomaineESet = typeDomaineESet;
		typeDomaine = TYPE_DOMAINE_EDEFAULT;
		typeDomaineESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_DOMAINE_ACTIVITE_CENTRE__TYPE_DOMAINE, oldTypeDomaine, TYPE_DOMAINE_EDEFAULT, oldTypeDomaineESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeDomaine() {
		return typeDomaineESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAutreTypeDomaine() {
		return autreTypeDomaine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutreTypeDomaine(String newAutreTypeDomaine) {
		String oldAutreTypeDomaine = autreTypeDomaine;
		autreTypeDomaine = newAutreTypeDomaine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOMAINE_ACTIVITE_CENTRE__AUTRE_TYPE_DOMAINE, oldAutreTypeDomaine, autreTypeDomaine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTauxCouverture() {
		return tauxCouverture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTauxCouverture(double newTauxCouverture) {
		double oldTauxCouverture = tauxCouverture;
		tauxCouverture = newTauxCouverture;
		boolean oldTauxCouvertureESet = tauxCouvertureESet;
		tauxCouvertureESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOMAINE_ACTIVITE_CENTRE__TAUX_COUVERTURE, oldTauxCouverture, tauxCouverture, !oldTauxCouvertureESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTauxCouverture() {
		double oldTauxCouverture = tauxCouverture;
		boolean oldTauxCouvertureESet = tauxCouvertureESet;
		tauxCouverture = TAUX_COUVERTURE_EDEFAULT;
		tauxCouvertureESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_DOMAINE_ACTIVITE_CENTRE__TAUX_COUVERTURE, oldTauxCouverture, TAUX_COUVERTURE_EDEFAULT, oldTauxCouvertureESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTauxCouverture() {
		return tauxCouvertureESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOMAINE_ACTIVITE_CENTRE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOMAINE_ACTIVITE_CENTRE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getACommeAutoriteControle3DUnite() {
		return aCommeAutoriteControle3DUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommeAutoriteControle3DUnite(TypeAssociationEXT newACommeAutoriteControle3DUnite, NotificationChain msgs) {
		TypeAssociationEXT oldACommeAutoriteControle3DUnite = aCommeAutoriteControle3DUnite;
		aCommeAutoriteControle3DUnite = newACommeAutoriteControle3DUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOMAINE_ACTIVITE_CENTRE__ACOMME_AUTORITE_CONTROLE3_DUNITE, oldACommeAutoriteControle3DUnite, newACommeAutoriteControle3DUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommeAutoriteControle3DUnite(TypeAssociationEXT newACommeAutoriteControle3DUnite) {
		if (newACommeAutoriteControle3DUnite != aCommeAutoriteControle3DUnite) {
			NotificationChain msgs = null;
			if (aCommeAutoriteControle3DUnite != null)
				msgs = ((InternalEObject)aCommeAutoriteControle3DUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DOMAINE_ACTIVITE_CENTRE__ACOMME_AUTORITE_CONTROLE3_DUNITE, null, msgs);
			if (newACommeAutoriteControle3DUnite != null)
				msgs = ((InternalEObject)newACommeAutoriteControle3DUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DOMAINE_ACTIVITE_CENTRE__ACOMME_AUTORITE_CONTROLE3_DUNITE, null, msgs);
			msgs = basicSetACommeAutoriteControle3DUnite(newACommeAutoriteControle3DUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOMAINE_ACTIVITE_CENTRE__ACOMME_AUTORITE_CONTROLE3_DUNITE, newACommeAutoriteControle3DUnite, newACommeAutoriteControle3DUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getACommeVolumeActiviteAutreElementControle() {
		return aCommeVolumeActiviteAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommeVolumeActiviteAutreElementControle(TypeAssociation newACommeVolumeActiviteAutreElementControle, NotificationChain msgs) {
		TypeAssociation oldACommeVolumeActiviteAutreElementControle = aCommeVolumeActiviteAutreElementControle;
		aCommeVolumeActiviteAutreElementControle = newACommeVolumeActiviteAutreElementControle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOMAINE_ACTIVITE_CENTRE__ACOMME_VOLUME_ACTIVITE_AUTRE_ELEMENT_CONTROLE, oldACommeVolumeActiviteAutreElementControle, newACommeVolumeActiviteAutreElementControle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommeVolumeActiviteAutreElementControle(TypeAssociation newACommeVolumeActiviteAutreElementControle) {
		if (newACommeVolumeActiviteAutreElementControle != aCommeVolumeActiviteAutreElementControle) {
			NotificationChain msgs = null;
			if (aCommeVolumeActiviteAutreElementControle != null)
				msgs = ((InternalEObject)aCommeVolumeActiviteAutreElementControle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DOMAINE_ACTIVITE_CENTRE__ACOMME_VOLUME_ACTIVITE_AUTRE_ELEMENT_CONTROLE, null, msgs);
			if (newACommeVolumeActiviteAutreElementControle != null)
				msgs = ((InternalEObject)newACommeVolumeActiviteAutreElementControle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DOMAINE_ACTIVITE_CENTRE__ACOMME_VOLUME_ACTIVITE_AUTRE_ELEMENT_CONTROLE, null, msgs);
			msgs = basicSetACommeVolumeActiviteAutreElementControle(newACommeVolumeActiviteAutreElementControle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOMAINE_ACTIVITE_CENTRE__ACOMME_VOLUME_ACTIVITE_AUTRE_ELEMENT_CONTROLE, newACommeVolumeActiviteAutreElementControle, newACommeVolumeActiviteAutreElementControle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getACommeTypeMenaceAssocieeTypeAeronef() {
		return aCommeTypeMenaceAssocieeTypeAeronef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommeTypeMenaceAssocieeTypeAeronef(TypeAssociationEXT newACommeTypeMenaceAssocieeTypeAeronef, NotificationChain msgs) {
		TypeAssociationEXT oldACommeTypeMenaceAssocieeTypeAeronef = aCommeTypeMenaceAssocieeTypeAeronef;
		aCommeTypeMenaceAssocieeTypeAeronef = newACommeTypeMenaceAssocieeTypeAeronef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOMAINE_ACTIVITE_CENTRE__ACOMME_TYPE_MENACE_ASSOCIEE_TYPE_AERONEF, oldACommeTypeMenaceAssocieeTypeAeronef, newACommeTypeMenaceAssocieeTypeAeronef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommeTypeMenaceAssocieeTypeAeronef(TypeAssociationEXT newACommeTypeMenaceAssocieeTypeAeronef) {
		if (newACommeTypeMenaceAssocieeTypeAeronef != aCommeTypeMenaceAssocieeTypeAeronef) {
			NotificationChain msgs = null;
			if (aCommeTypeMenaceAssocieeTypeAeronef != null)
				msgs = ((InternalEObject)aCommeTypeMenaceAssocieeTypeAeronef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DOMAINE_ACTIVITE_CENTRE__ACOMME_TYPE_MENACE_ASSOCIEE_TYPE_AERONEF, null, msgs);
			if (newACommeTypeMenaceAssocieeTypeAeronef != null)
				msgs = ((InternalEObject)newACommeTypeMenaceAssocieeTypeAeronef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DOMAINE_ACTIVITE_CENTRE__ACOMME_TYPE_MENACE_ASSOCIEE_TYPE_AERONEF, null, msgs);
			msgs = basicSetACommeTypeMenaceAssocieeTypeAeronef(newACommeTypeMenaceAssocieeTypeAeronef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOMAINE_ACTIVITE_CENTRE__ACOMME_TYPE_MENACE_ASSOCIEE_TYPE_AERONEF, newACommeTypeMenaceAssocieeTypeAeronef, newACommeTypeMenaceAssocieeTypeAeronef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_DOMAINE_ACTIVITE_CENTRE__ACOMME_AUTORITE_CONTROLE3_DUNITE:
				return basicSetACommeAutoriteControle3DUnite(null, msgs);
			case SchemaPackage.TYPE_DOMAINE_ACTIVITE_CENTRE__ACOMME_VOLUME_ACTIVITE_AUTRE_ELEMENT_CONTROLE:
				return basicSetACommeVolumeActiviteAutreElementControle(null, msgs);
			case SchemaPackage.TYPE_DOMAINE_ACTIVITE_CENTRE__ACOMME_TYPE_MENACE_ASSOCIEE_TYPE_AERONEF:
				return basicSetACommeTypeMenaceAssocieeTypeAeronef(null, msgs);
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
			case SchemaPackage.TYPE_DOMAINE_ACTIVITE_CENTRE__TYPE_DOMAINE:
				return getTypeDomaine();
			case SchemaPackage.TYPE_DOMAINE_ACTIVITE_CENTRE__AUTRE_TYPE_DOMAINE:
				return getAutreTypeDomaine();
			case SchemaPackage.TYPE_DOMAINE_ACTIVITE_CENTRE__TAUX_COUVERTURE:
				return new Double(getTauxCouverture());
			case SchemaPackage.TYPE_DOMAINE_ACTIVITE_CENTRE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_DOMAINE_ACTIVITE_CENTRE__CE:
				return getCE();
			case SchemaPackage.TYPE_DOMAINE_ACTIVITE_CENTRE__ACOMME_AUTORITE_CONTROLE3_DUNITE:
				return getACommeAutoriteControle3DUnite();
			case SchemaPackage.TYPE_DOMAINE_ACTIVITE_CENTRE__ACOMME_VOLUME_ACTIVITE_AUTRE_ELEMENT_CONTROLE:
				return getACommeVolumeActiviteAutreElementControle();
			case SchemaPackage.TYPE_DOMAINE_ACTIVITE_CENTRE__ACOMME_TYPE_MENACE_ASSOCIEE_TYPE_AERONEF:
				return getACommeTypeMenaceAssocieeTypeAeronef();
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
			case SchemaPackage.TYPE_DOMAINE_ACTIVITE_CENTRE__TYPE_DOMAINE:
				setTypeDomaine((TypeDictionaryDicoDomaineActiviteCentreTypeDomaine)newValue);
				return;
			case SchemaPackage.TYPE_DOMAINE_ACTIVITE_CENTRE__AUTRE_TYPE_DOMAINE:
				setAutreTypeDomaine((String)newValue);
				return;
			case SchemaPackage.TYPE_DOMAINE_ACTIVITE_CENTRE__TAUX_COUVERTURE:
				setTauxCouverture(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_DOMAINE_ACTIVITE_CENTRE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_DOMAINE_ACTIVITE_CENTRE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_DOMAINE_ACTIVITE_CENTRE__ACOMME_AUTORITE_CONTROLE3_DUNITE:
				setACommeAutoriteControle3DUnite((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_DOMAINE_ACTIVITE_CENTRE__ACOMME_VOLUME_ACTIVITE_AUTRE_ELEMENT_CONTROLE:
				setACommeVolumeActiviteAutreElementControle((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_DOMAINE_ACTIVITE_CENTRE__ACOMME_TYPE_MENACE_ASSOCIEE_TYPE_AERONEF:
				setACommeTypeMenaceAssocieeTypeAeronef((TypeAssociationEXT)newValue);
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
			case SchemaPackage.TYPE_DOMAINE_ACTIVITE_CENTRE__TYPE_DOMAINE:
				unsetTypeDomaine();
				return;
			case SchemaPackage.TYPE_DOMAINE_ACTIVITE_CENTRE__AUTRE_TYPE_DOMAINE:
				setAutreTypeDomaine(AUTRE_TYPE_DOMAINE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DOMAINE_ACTIVITE_CENTRE__TAUX_COUVERTURE:
				unsetTauxCouverture();
				return;
			case SchemaPackage.TYPE_DOMAINE_ACTIVITE_CENTRE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DOMAINE_ACTIVITE_CENTRE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DOMAINE_ACTIVITE_CENTRE__ACOMME_AUTORITE_CONTROLE3_DUNITE:
				setACommeAutoriteControle3DUnite((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_DOMAINE_ACTIVITE_CENTRE__ACOMME_VOLUME_ACTIVITE_AUTRE_ELEMENT_CONTROLE:
				setACommeVolumeActiviteAutreElementControle((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_DOMAINE_ACTIVITE_CENTRE__ACOMME_TYPE_MENACE_ASSOCIEE_TYPE_AERONEF:
				setACommeTypeMenaceAssocieeTypeAeronef((TypeAssociationEXT)null);
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
			case SchemaPackage.TYPE_DOMAINE_ACTIVITE_CENTRE__TYPE_DOMAINE:
				return isSetTypeDomaine();
			case SchemaPackage.TYPE_DOMAINE_ACTIVITE_CENTRE__AUTRE_TYPE_DOMAINE:
				return AUTRE_TYPE_DOMAINE_EDEFAULT == null ? autreTypeDomaine != null : !AUTRE_TYPE_DOMAINE_EDEFAULT.equals(autreTypeDomaine);
			case SchemaPackage.TYPE_DOMAINE_ACTIVITE_CENTRE__TAUX_COUVERTURE:
				return isSetTauxCouverture();
			case SchemaPackage.TYPE_DOMAINE_ACTIVITE_CENTRE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_DOMAINE_ACTIVITE_CENTRE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_DOMAINE_ACTIVITE_CENTRE__ACOMME_AUTORITE_CONTROLE3_DUNITE:
				return aCommeAutoriteControle3DUnite != null;
			case SchemaPackage.TYPE_DOMAINE_ACTIVITE_CENTRE__ACOMME_VOLUME_ACTIVITE_AUTRE_ELEMENT_CONTROLE:
				return aCommeVolumeActiviteAutreElementControle != null;
			case SchemaPackage.TYPE_DOMAINE_ACTIVITE_CENTRE__ACOMME_TYPE_MENACE_ASSOCIEE_TYPE_AERONEF:
				return aCommeTypeMenaceAssocieeTypeAeronef != null;
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
		result.append(" (typeDomaine: ");
		if (typeDomaineESet) result.append(typeDomaine); else result.append("<unset>");
		result.append(", autreTypeDomaine: ");
		result.append(autreTypeDomaine);
		result.append(", tauxCouverture: ");
		if (tauxCouvertureESet) result.append(tauxCouverture); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeDomaineActiviteCentreImpl
