/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeLongueur;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssocPisteAtterDirAppAir;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Assoc Piste Atter Dir App Air</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssocPisteAtterDirAppAirImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssocPisteAtterDirAppAirImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssocPisteAtterDirAppAirImpl#getInclinaison <em>Inclinaison</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssocPisteAtterDirAppAirImpl#getLongueurUtilePourAtterissage <em>Longueur Utile Pour Atterissage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssocPisteAtterDirAppAirImpl#getLongueurUtilePourDecollage <em>Longueur Utile Pour Decollage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssocPisteAtterDirAppAirImpl#getACommeDirectionApprocheDirectionApprocheAir <em>AComme Direction Approche Direction Approche Air</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssocPisteAtterDirAppAirImpl#getACommePisteAtterrissagePisteAtterrissage <em>AComme Piste Atterrissage Piste Atterrissage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssocPisteAtterDirAppAirImpl extends EObjectImpl implements TypeAssocPisteAtterDirAppAir {
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
	 * The default value of the '{@link #getInclinaison() <em>Inclinaison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclinaison()
	 * @generated
	 * @ordered
	 */
	protected static final double INCLINAISON_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getInclinaison() <em>Inclinaison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclinaison()
	 * @generated
	 * @ordered
	 */
	protected double inclinaison = INCLINAISON_EDEFAULT;

	/**
	 * This is true if the Inclinaison attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean inclinaisonESet;

	/**
	 * The cached value of the '{@link #getLongueurUtilePourAtterissage() <em>Longueur Utile Pour Atterissage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongueurUtilePourAtterissage()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur longueurUtilePourAtterissage;

	/**
	 * The cached value of the '{@link #getLongueurUtilePourDecollage() <em>Longueur Utile Pour Decollage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongueurUtilePourDecollage()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur longueurUtilePourDecollage;

	/**
	 * The cached value of the '{@link #getACommeDirectionApprocheDirectionApprocheAir() <em>AComme Direction Approche Direction Approche Air</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeDirectionApprocheDirectionApprocheAir()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aCommeDirectionApprocheDirectionApprocheAir;

	/**
	 * The cached value of the '{@link #getACommePisteAtterrissagePisteAtterrissage() <em>AComme Piste Atterrissage Piste Atterrissage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommePisteAtterrissagePisteAtterrissage()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aCommePisteAtterrissagePisteAtterrissage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssocPisteAtterDirAppAirImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssocPisteAtterDirAppAir();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_PISTE_ATTER_DIR_APP_AIR__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_PISTE_ATTER_DIR_APP_AIR__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getInclinaison() {
		return inclinaison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInclinaison(double newInclinaison) {
		double oldInclinaison = inclinaison;
		inclinaison = newInclinaison;
		boolean oldInclinaisonESet = inclinaisonESet;
		inclinaisonESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_PISTE_ATTER_DIR_APP_AIR__INCLINAISON, oldInclinaison, inclinaison, !oldInclinaisonESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInclinaison() {
		double oldInclinaison = inclinaison;
		boolean oldInclinaisonESet = inclinaisonESet;
		inclinaison = INCLINAISON_EDEFAULT;
		inclinaisonESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOC_PISTE_ATTER_DIR_APP_AIR__INCLINAISON, oldInclinaison, INCLINAISON_EDEFAULT, oldInclinaisonESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInclinaison() {
		return inclinaisonESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getLongueurUtilePourAtterissage() {
		return longueurUtilePourAtterissage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLongueurUtilePourAtterissage(TypeDataTypeLongueur newLongueurUtilePourAtterissage, NotificationChain msgs) {
		TypeDataTypeLongueur oldLongueurUtilePourAtterissage = longueurUtilePourAtterissage;
		longueurUtilePourAtterissage = newLongueurUtilePourAtterissage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_PISTE_ATTER_DIR_APP_AIR__LONGUEUR_UTILE_POUR_ATTERISSAGE, oldLongueurUtilePourAtterissage, newLongueurUtilePourAtterissage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongueurUtilePourAtterissage(TypeDataTypeLongueur newLongueurUtilePourAtterissage) {
		if (newLongueurUtilePourAtterissage != longueurUtilePourAtterissage) {
			NotificationChain msgs = null;
			if (longueurUtilePourAtterissage != null)
				msgs = ((InternalEObject)longueurUtilePourAtterissage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOC_PISTE_ATTER_DIR_APP_AIR__LONGUEUR_UTILE_POUR_ATTERISSAGE, null, msgs);
			if (newLongueurUtilePourAtterissage != null)
				msgs = ((InternalEObject)newLongueurUtilePourAtterissage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOC_PISTE_ATTER_DIR_APP_AIR__LONGUEUR_UTILE_POUR_ATTERISSAGE, null, msgs);
			msgs = basicSetLongueurUtilePourAtterissage(newLongueurUtilePourAtterissage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_PISTE_ATTER_DIR_APP_AIR__LONGUEUR_UTILE_POUR_ATTERISSAGE, newLongueurUtilePourAtterissage, newLongueurUtilePourAtterissage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getLongueurUtilePourDecollage() {
		return longueurUtilePourDecollage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLongueurUtilePourDecollage(TypeDataTypeLongueur newLongueurUtilePourDecollage, NotificationChain msgs) {
		TypeDataTypeLongueur oldLongueurUtilePourDecollage = longueurUtilePourDecollage;
		longueurUtilePourDecollage = newLongueurUtilePourDecollage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_PISTE_ATTER_DIR_APP_AIR__LONGUEUR_UTILE_POUR_DECOLLAGE, oldLongueurUtilePourDecollage, newLongueurUtilePourDecollage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongueurUtilePourDecollage(TypeDataTypeLongueur newLongueurUtilePourDecollage) {
		if (newLongueurUtilePourDecollage != longueurUtilePourDecollage) {
			NotificationChain msgs = null;
			if (longueurUtilePourDecollage != null)
				msgs = ((InternalEObject)longueurUtilePourDecollage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOC_PISTE_ATTER_DIR_APP_AIR__LONGUEUR_UTILE_POUR_DECOLLAGE, null, msgs);
			if (newLongueurUtilePourDecollage != null)
				msgs = ((InternalEObject)newLongueurUtilePourDecollage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOC_PISTE_ATTER_DIR_APP_AIR__LONGUEUR_UTILE_POUR_DECOLLAGE, null, msgs);
			msgs = basicSetLongueurUtilePourDecollage(newLongueurUtilePourDecollage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_PISTE_ATTER_DIR_APP_AIR__LONGUEUR_UTILE_POUR_DECOLLAGE, newLongueurUtilePourDecollage, newLongueurUtilePourDecollage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getACommeDirectionApprocheDirectionApprocheAir() {
		return aCommeDirectionApprocheDirectionApprocheAir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommeDirectionApprocheDirectionApprocheAir(TypeAssociation newACommeDirectionApprocheDirectionApprocheAir, NotificationChain msgs) {
		TypeAssociation oldACommeDirectionApprocheDirectionApprocheAir = aCommeDirectionApprocheDirectionApprocheAir;
		aCommeDirectionApprocheDirectionApprocheAir = newACommeDirectionApprocheDirectionApprocheAir;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_PISTE_ATTER_DIR_APP_AIR__ACOMME_DIRECTION_APPROCHE_DIRECTION_APPROCHE_AIR, oldACommeDirectionApprocheDirectionApprocheAir, newACommeDirectionApprocheDirectionApprocheAir);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommeDirectionApprocheDirectionApprocheAir(TypeAssociation newACommeDirectionApprocheDirectionApprocheAir) {
		if (newACommeDirectionApprocheDirectionApprocheAir != aCommeDirectionApprocheDirectionApprocheAir) {
			NotificationChain msgs = null;
			if (aCommeDirectionApprocheDirectionApprocheAir != null)
				msgs = ((InternalEObject)aCommeDirectionApprocheDirectionApprocheAir).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOC_PISTE_ATTER_DIR_APP_AIR__ACOMME_DIRECTION_APPROCHE_DIRECTION_APPROCHE_AIR, null, msgs);
			if (newACommeDirectionApprocheDirectionApprocheAir != null)
				msgs = ((InternalEObject)newACommeDirectionApprocheDirectionApprocheAir).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOC_PISTE_ATTER_DIR_APP_AIR__ACOMME_DIRECTION_APPROCHE_DIRECTION_APPROCHE_AIR, null, msgs);
			msgs = basicSetACommeDirectionApprocheDirectionApprocheAir(newACommeDirectionApprocheDirectionApprocheAir, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_PISTE_ATTER_DIR_APP_AIR__ACOMME_DIRECTION_APPROCHE_DIRECTION_APPROCHE_AIR, newACommeDirectionApprocheDirectionApprocheAir, newACommeDirectionApprocheDirectionApprocheAir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getACommePisteAtterrissagePisteAtterrissage() {
		return aCommePisteAtterrissagePisteAtterrissage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommePisteAtterrissagePisteAtterrissage(TypeAssociation newACommePisteAtterrissagePisteAtterrissage, NotificationChain msgs) {
		TypeAssociation oldACommePisteAtterrissagePisteAtterrissage = aCommePisteAtterrissagePisteAtterrissage;
		aCommePisteAtterrissagePisteAtterrissage = newACommePisteAtterrissagePisteAtterrissage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_PISTE_ATTER_DIR_APP_AIR__ACOMME_PISTE_ATTERRISSAGE_PISTE_ATTERRISSAGE, oldACommePisteAtterrissagePisteAtterrissage, newACommePisteAtterrissagePisteAtterrissage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommePisteAtterrissagePisteAtterrissage(TypeAssociation newACommePisteAtterrissagePisteAtterrissage) {
		if (newACommePisteAtterrissagePisteAtterrissage != aCommePisteAtterrissagePisteAtterrissage) {
			NotificationChain msgs = null;
			if (aCommePisteAtterrissagePisteAtterrissage != null)
				msgs = ((InternalEObject)aCommePisteAtterrissagePisteAtterrissage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOC_PISTE_ATTER_DIR_APP_AIR__ACOMME_PISTE_ATTERRISSAGE_PISTE_ATTERRISSAGE, null, msgs);
			if (newACommePisteAtterrissagePisteAtterrissage != null)
				msgs = ((InternalEObject)newACommePisteAtterrissagePisteAtterrissage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOC_PISTE_ATTER_DIR_APP_AIR__ACOMME_PISTE_ATTERRISSAGE_PISTE_ATTERRISSAGE, null, msgs);
			msgs = basicSetACommePisteAtterrissagePisteAtterrissage(newACommePisteAtterrissagePisteAtterrissage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_PISTE_ATTER_DIR_APP_AIR__ACOMME_PISTE_ATTERRISSAGE_PISTE_ATTERRISSAGE, newACommePisteAtterrissagePisteAtterrissage, newACommePisteAtterrissagePisteAtterrissage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOC_PISTE_ATTER_DIR_APP_AIR__LONGUEUR_UTILE_POUR_ATTERISSAGE:
				return basicSetLongueurUtilePourAtterissage(null, msgs);
			case SchemaPackage.TYPE_ASSOC_PISTE_ATTER_DIR_APP_AIR__LONGUEUR_UTILE_POUR_DECOLLAGE:
				return basicSetLongueurUtilePourDecollage(null, msgs);
			case SchemaPackage.TYPE_ASSOC_PISTE_ATTER_DIR_APP_AIR__ACOMME_DIRECTION_APPROCHE_DIRECTION_APPROCHE_AIR:
				return basicSetACommeDirectionApprocheDirectionApprocheAir(null, msgs);
			case SchemaPackage.TYPE_ASSOC_PISTE_ATTER_DIR_APP_AIR__ACOMME_PISTE_ATTERRISSAGE_PISTE_ATTERRISSAGE:
				return basicSetACommePisteAtterrissagePisteAtterrissage(null, msgs);
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
			case SchemaPackage.TYPE_ASSOC_PISTE_ATTER_DIR_APP_AIR__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ASSOC_PISTE_ATTER_DIR_APP_AIR__CE:
				return getCE();
			case SchemaPackage.TYPE_ASSOC_PISTE_ATTER_DIR_APP_AIR__INCLINAISON:
				return new Double(getInclinaison());
			case SchemaPackage.TYPE_ASSOC_PISTE_ATTER_DIR_APP_AIR__LONGUEUR_UTILE_POUR_ATTERISSAGE:
				return getLongueurUtilePourAtterissage();
			case SchemaPackage.TYPE_ASSOC_PISTE_ATTER_DIR_APP_AIR__LONGUEUR_UTILE_POUR_DECOLLAGE:
				return getLongueurUtilePourDecollage();
			case SchemaPackage.TYPE_ASSOC_PISTE_ATTER_DIR_APP_AIR__ACOMME_DIRECTION_APPROCHE_DIRECTION_APPROCHE_AIR:
				return getACommeDirectionApprocheDirectionApprocheAir();
			case SchemaPackage.TYPE_ASSOC_PISTE_ATTER_DIR_APP_AIR__ACOMME_PISTE_ATTERRISSAGE_PISTE_ATTERRISSAGE:
				return getACommePisteAtterrissagePisteAtterrissage();
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
			case SchemaPackage.TYPE_ASSOC_PISTE_ATTER_DIR_APP_AIR__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOC_PISTE_ATTER_DIR_APP_AIR__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOC_PISTE_ATTER_DIR_APP_AIR__INCLINAISON:
				setInclinaison(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_ASSOC_PISTE_ATTER_DIR_APP_AIR__LONGUEUR_UTILE_POUR_ATTERISSAGE:
				setLongueurUtilePourAtterissage((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_ASSOC_PISTE_ATTER_DIR_APP_AIR__LONGUEUR_UTILE_POUR_DECOLLAGE:
				setLongueurUtilePourDecollage((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_ASSOC_PISTE_ATTER_DIR_APP_AIR__ACOMME_DIRECTION_APPROCHE_DIRECTION_APPROCHE_AIR:
				setACommeDirectionApprocheDirectionApprocheAir((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOC_PISTE_ATTER_DIR_APP_AIR__ACOMME_PISTE_ATTERRISSAGE_PISTE_ATTERRISSAGE:
				setACommePisteAtterrissagePisteAtterrissage((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOC_PISTE_ATTER_DIR_APP_AIR__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOC_PISTE_ATTER_DIR_APP_AIR__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOC_PISTE_ATTER_DIR_APP_AIR__INCLINAISON:
				unsetInclinaison();
				return;
			case SchemaPackage.TYPE_ASSOC_PISTE_ATTER_DIR_APP_AIR__LONGUEUR_UTILE_POUR_ATTERISSAGE:
				setLongueurUtilePourAtterissage((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_ASSOC_PISTE_ATTER_DIR_APP_AIR__LONGUEUR_UTILE_POUR_DECOLLAGE:
				setLongueurUtilePourDecollage((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_ASSOC_PISTE_ATTER_DIR_APP_AIR__ACOMME_DIRECTION_APPROCHE_DIRECTION_APPROCHE_AIR:
				setACommeDirectionApprocheDirectionApprocheAir((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOC_PISTE_ATTER_DIR_APP_AIR__ACOMME_PISTE_ATTERRISSAGE_PISTE_ATTERRISSAGE:
				setACommePisteAtterrissagePisteAtterrissage((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOC_PISTE_ATTER_DIR_APP_AIR__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ASSOC_PISTE_ATTER_DIR_APP_AIR__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ASSOC_PISTE_ATTER_DIR_APP_AIR__INCLINAISON:
				return isSetInclinaison();
			case SchemaPackage.TYPE_ASSOC_PISTE_ATTER_DIR_APP_AIR__LONGUEUR_UTILE_POUR_ATTERISSAGE:
				return longueurUtilePourAtterissage != null;
			case SchemaPackage.TYPE_ASSOC_PISTE_ATTER_DIR_APP_AIR__LONGUEUR_UTILE_POUR_DECOLLAGE:
				return longueurUtilePourDecollage != null;
			case SchemaPackage.TYPE_ASSOC_PISTE_ATTER_DIR_APP_AIR__ACOMME_DIRECTION_APPROCHE_DIRECTION_APPROCHE_AIR:
				return aCommeDirectionApprocheDirectionApprocheAir != null;
			case SchemaPackage.TYPE_ASSOC_PISTE_ATTER_DIR_APP_AIR__ACOMME_PISTE_ATTERRISSAGE_PISTE_ATTERRISSAGE:
				return aCommePisteAtterrissagePisteAtterrissage != null;
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
		result.append(" (cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(", inclinaison: ");
		if (inclinaisonESet) result.append(inclinaison); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeAssocPisteAtterDirAppAirImpl
