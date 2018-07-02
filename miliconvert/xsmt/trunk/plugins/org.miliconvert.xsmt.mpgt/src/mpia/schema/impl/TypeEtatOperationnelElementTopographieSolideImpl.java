/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoEtatDemolition;
import mpia.schema.TypeDictionaryDicoEtatOperationnelElementTopographieSolideEtatOperationnel;
import mpia.schema.TypeDictionaryDicoEtatOperationnelElementTopographieSolideEtatSurface;
import mpia.schema.TypeDictionaryDicoEtatOperationnelElementTopographieSolideStabilite;
import mpia.schema.TypeDictionaryDicoSousTypeVegetation;
import mpia.schema.TypeDictionaryDicoVegetation;
import mpia.schema.TypeEtatOperationnelElementTopographieSolide;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Etat Operationnel Element Topographie Solide</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelElementTopographieSolideImpl#getEtatOperationnel <em>Etat Operationnel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelElementTopographieSolideImpl#getEtatDemolition <em>Etat Demolition</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelElementTopographieSolideImpl#getEtatSurface <em>Etat Surface</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelElementTopographieSolideImpl#getEtatVegetation <em>Etat Vegetation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelElementTopographieSolideImpl#getSouEtatVegetation <em>Sou Etat Vegetation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelElementTopographieSolideImpl#getStabilite <em>Stabilite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeEtatOperationnelElementTopographieSolideImpl extends TypeEtatOperationnelElementTopographieImpl implements TypeEtatOperationnelElementTopographieSolide {
	/**
	 * The default value of the '{@link #getEtatOperationnel() <em>Etat Operationnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatOperationnel()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatOperationnelElementTopographieSolideEtatOperationnel ETAT_OPERATIONNEL_EDEFAULT = TypeDictionaryDicoEtatOperationnelElementTopographieSolideEtatOperationnel.CLEARD;

	/**
	 * The cached value of the '{@link #getEtatOperationnel() <em>Etat Operationnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatOperationnel()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatOperationnelElementTopographieSolideEtatOperationnel etatOperationnel = ETAT_OPERATIONNEL_EDEFAULT;

	/**
	 * This is true if the Etat Operationnel attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean etatOperationnelESet;

	/**
	 * The default value of the '{@link #getEtatDemolition() <em>Etat Demolition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatDemolition()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatDemolition ETAT_DEMOLITION_EDEFAULT = TypeDictionaryDicoEtatDemolition.ABNDIN;

	/**
	 * The cached value of the '{@link #getEtatDemolition() <em>Etat Demolition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatDemolition()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatDemolition etatDemolition = ETAT_DEMOLITION_EDEFAULT;

	/**
	 * This is true if the Etat Demolition attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean etatDemolitionESet;

	/**
	 * The default value of the '{@link #getEtatSurface() <em>Etat Surface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatSurface()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatOperationnelElementTopographieSolideEtatSurface ETAT_SURFACE_EDEFAULT = TypeDictionaryDicoEtatOperationnelElementTopographieSolideEtatSurface.DUST;

	/**
	 * The cached value of the '{@link #getEtatSurface() <em>Etat Surface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatSurface()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatOperationnelElementTopographieSolideEtatSurface etatSurface = ETAT_SURFACE_EDEFAULT;

	/**
	 * This is true if the Etat Surface attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean etatSurfaceESet;

	/**
	 * The default value of the '{@link #getEtatVegetation() <em>Etat Vegetation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatVegetation()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoVegetation ETAT_VEGETATION_EDEFAULT = TypeDictionaryDicoVegetation.BARE;

	/**
	 * The cached value of the '{@link #getEtatVegetation() <em>Etat Vegetation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatVegetation()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoVegetation etatVegetation = ETAT_VEGETATION_EDEFAULT;

	/**
	 * This is true if the Etat Vegetation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean etatVegetationESet;

	/**
	 * The default value of the '{@link #getSouEtatVegetation() <em>Sou Etat Vegetation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSouEtatVegetation()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoSousTypeVegetation SOU_ETAT_VEGETATION_EDEFAULT = TypeDictionaryDicoSousTypeVegetation.BAMBOO;

	/**
	 * The cached value of the '{@link #getSouEtatVegetation() <em>Sou Etat Vegetation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSouEtatVegetation()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoSousTypeVegetation souEtatVegetation = SOU_ETAT_VEGETATION_EDEFAULT;

	/**
	 * This is true if the Sou Etat Vegetation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean souEtatVegetationESet;

	/**
	 * The default value of the '{@link #getStabilite() <em>Stabilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStabilite()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatOperationnelElementTopographieSolideStabilite STABILITE_EDEFAULT = TypeDictionaryDicoEtatOperationnelElementTopographieSolideStabilite.MODER;

	/**
	 * The cached value of the '{@link #getStabilite() <em>Stabilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStabilite()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatOperationnelElementTopographieSolideStabilite stabilite = STABILITE_EDEFAULT;

	/**
	 * This is true if the Stabilite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stabiliteESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeEtatOperationnelElementTopographieSolideImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEtatOperationnelElementTopographieSolide();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatOperationnelElementTopographieSolideEtatOperationnel getEtatOperationnel() {
		return etatOperationnel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtatOperationnel(TypeDictionaryDicoEtatOperationnelElementTopographieSolideEtatOperationnel newEtatOperationnel) {
		TypeDictionaryDicoEtatOperationnelElementTopographieSolideEtatOperationnel oldEtatOperationnel = etatOperationnel;
		etatOperationnel = newEtatOperationnel == null ? ETAT_OPERATIONNEL_EDEFAULT : newEtatOperationnel;
		boolean oldEtatOperationnelESet = etatOperationnelESet;
		etatOperationnelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_SOLIDE__ETAT_OPERATIONNEL, oldEtatOperationnel, etatOperationnel, !oldEtatOperationnelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEtatOperationnel() {
		TypeDictionaryDicoEtatOperationnelElementTopographieSolideEtatOperationnel oldEtatOperationnel = etatOperationnel;
		boolean oldEtatOperationnelESet = etatOperationnelESet;
		etatOperationnel = ETAT_OPERATIONNEL_EDEFAULT;
		etatOperationnelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_SOLIDE__ETAT_OPERATIONNEL, oldEtatOperationnel, ETAT_OPERATIONNEL_EDEFAULT, oldEtatOperationnelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEtatOperationnel() {
		return etatOperationnelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatDemolition getEtatDemolition() {
		return etatDemolition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtatDemolition(TypeDictionaryDicoEtatDemolition newEtatDemolition) {
		TypeDictionaryDicoEtatDemolition oldEtatDemolition = etatDemolition;
		etatDemolition = newEtatDemolition == null ? ETAT_DEMOLITION_EDEFAULT : newEtatDemolition;
		boolean oldEtatDemolitionESet = etatDemolitionESet;
		etatDemolitionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_SOLIDE__ETAT_DEMOLITION, oldEtatDemolition, etatDemolition, !oldEtatDemolitionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEtatDemolition() {
		TypeDictionaryDicoEtatDemolition oldEtatDemolition = etatDemolition;
		boolean oldEtatDemolitionESet = etatDemolitionESet;
		etatDemolition = ETAT_DEMOLITION_EDEFAULT;
		etatDemolitionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_SOLIDE__ETAT_DEMOLITION, oldEtatDemolition, ETAT_DEMOLITION_EDEFAULT, oldEtatDemolitionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEtatDemolition() {
		return etatDemolitionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatOperationnelElementTopographieSolideEtatSurface getEtatSurface() {
		return etatSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtatSurface(TypeDictionaryDicoEtatOperationnelElementTopographieSolideEtatSurface newEtatSurface) {
		TypeDictionaryDicoEtatOperationnelElementTopographieSolideEtatSurface oldEtatSurface = etatSurface;
		etatSurface = newEtatSurface == null ? ETAT_SURFACE_EDEFAULT : newEtatSurface;
		boolean oldEtatSurfaceESet = etatSurfaceESet;
		etatSurfaceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_SOLIDE__ETAT_SURFACE, oldEtatSurface, etatSurface, !oldEtatSurfaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEtatSurface() {
		TypeDictionaryDicoEtatOperationnelElementTopographieSolideEtatSurface oldEtatSurface = etatSurface;
		boolean oldEtatSurfaceESet = etatSurfaceESet;
		etatSurface = ETAT_SURFACE_EDEFAULT;
		etatSurfaceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_SOLIDE__ETAT_SURFACE, oldEtatSurface, ETAT_SURFACE_EDEFAULT, oldEtatSurfaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEtatSurface() {
		return etatSurfaceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoVegetation getEtatVegetation() {
		return etatVegetation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtatVegetation(TypeDictionaryDicoVegetation newEtatVegetation) {
		TypeDictionaryDicoVegetation oldEtatVegetation = etatVegetation;
		etatVegetation = newEtatVegetation == null ? ETAT_VEGETATION_EDEFAULT : newEtatVegetation;
		boolean oldEtatVegetationESet = etatVegetationESet;
		etatVegetationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_SOLIDE__ETAT_VEGETATION, oldEtatVegetation, etatVegetation, !oldEtatVegetationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEtatVegetation() {
		TypeDictionaryDicoVegetation oldEtatVegetation = etatVegetation;
		boolean oldEtatVegetationESet = etatVegetationESet;
		etatVegetation = ETAT_VEGETATION_EDEFAULT;
		etatVegetationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_SOLIDE__ETAT_VEGETATION, oldEtatVegetation, ETAT_VEGETATION_EDEFAULT, oldEtatVegetationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEtatVegetation() {
		return etatVegetationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoSousTypeVegetation getSouEtatVegetation() {
		return souEtatVegetation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSouEtatVegetation(TypeDictionaryDicoSousTypeVegetation newSouEtatVegetation) {
		TypeDictionaryDicoSousTypeVegetation oldSouEtatVegetation = souEtatVegetation;
		souEtatVegetation = newSouEtatVegetation == null ? SOU_ETAT_VEGETATION_EDEFAULT : newSouEtatVegetation;
		boolean oldSouEtatVegetationESet = souEtatVegetationESet;
		souEtatVegetationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_SOLIDE__SOU_ETAT_VEGETATION, oldSouEtatVegetation, souEtatVegetation, !oldSouEtatVegetationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSouEtatVegetation() {
		TypeDictionaryDicoSousTypeVegetation oldSouEtatVegetation = souEtatVegetation;
		boolean oldSouEtatVegetationESet = souEtatVegetationESet;
		souEtatVegetation = SOU_ETAT_VEGETATION_EDEFAULT;
		souEtatVegetationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_SOLIDE__SOU_ETAT_VEGETATION, oldSouEtatVegetation, SOU_ETAT_VEGETATION_EDEFAULT, oldSouEtatVegetationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSouEtatVegetation() {
		return souEtatVegetationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatOperationnelElementTopographieSolideStabilite getStabilite() {
		return stabilite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStabilite(TypeDictionaryDicoEtatOperationnelElementTopographieSolideStabilite newStabilite) {
		TypeDictionaryDicoEtatOperationnelElementTopographieSolideStabilite oldStabilite = stabilite;
		stabilite = newStabilite == null ? STABILITE_EDEFAULT : newStabilite;
		boolean oldStabiliteESet = stabiliteESet;
		stabiliteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_SOLIDE__STABILITE, oldStabilite, stabilite, !oldStabiliteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStabilite() {
		TypeDictionaryDicoEtatOperationnelElementTopographieSolideStabilite oldStabilite = stabilite;
		boolean oldStabiliteESet = stabiliteESet;
		stabilite = STABILITE_EDEFAULT;
		stabiliteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_SOLIDE__STABILITE, oldStabilite, STABILITE_EDEFAULT, oldStabiliteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStabilite() {
		return stabiliteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_SOLIDE__ETAT_OPERATIONNEL:
				return getEtatOperationnel();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_SOLIDE__ETAT_DEMOLITION:
				return getEtatDemolition();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_SOLIDE__ETAT_SURFACE:
				return getEtatSurface();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_SOLIDE__ETAT_VEGETATION:
				return getEtatVegetation();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_SOLIDE__SOU_ETAT_VEGETATION:
				return getSouEtatVegetation();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_SOLIDE__STABILITE:
				return getStabilite();
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
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_SOLIDE__ETAT_OPERATIONNEL:
				setEtatOperationnel((TypeDictionaryDicoEtatOperationnelElementTopographieSolideEtatOperationnel)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_SOLIDE__ETAT_DEMOLITION:
				setEtatDemolition((TypeDictionaryDicoEtatDemolition)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_SOLIDE__ETAT_SURFACE:
				setEtatSurface((TypeDictionaryDicoEtatOperationnelElementTopographieSolideEtatSurface)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_SOLIDE__ETAT_VEGETATION:
				setEtatVegetation((TypeDictionaryDicoVegetation)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_SOLIDE__SOU_ETAT_VEGETATION:
				setSouEtatVegetation((TypeDictionaryDicoSousTypeVegetation)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_SOLIDE__STABILITE:
				setStabilite((TypeDictionaryDicoEtatOperationnelElementTopographieSolideStabilite)newValue);
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
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_SOLIDE__ETAT_OPERATIONNEL:
				unsetEtatOperationnel();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_SOLIDE__ETAT_DEMOLITION:
				unsetEtatDemolition();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_SOLIDE__ETAT_SURFACE:
				unsetEtatSurface();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_SOLIDE__ETAT_VEGETATION:
				unsetEtatVegetation();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_SOLIDE__SOU_ETAT_VEGETATION:
				unsetSouEtatVegetation();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_SOLIDE__STABILITE:
				unsetStabilite();
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
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_SOLIDE__ETAT_OPERATIONNEL:
				return isSetEtatOperationnel();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_SOLIDE__ETAT_DEMOLITION:
				return isSetEtatDemolition();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_SOLIDE__ETAT_SURFACE:
				return isSetEtatSurface();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_SOLIDE__ETAT_VEGETATION:
				return isSetEtatVegetation();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_SOLIDE__SOU_ETAT_VEGETATION:
				return isSetSouEtatVegetation();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_TOPOGRAPHIE_SOLIDE__STABILITE:
				return isSetStabilite();
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
		result.append(" (etatOperationnel: ");
		if (etatOperationnelESet) result.append(etatOperationnel); else result.append("<unset>");
		result.append(", etatDemolition: ");
		if (etatDemolitionESet) result.append(etatDemolition); else result.append("<unset>");
		result.append(", etatSurface: ");
		if (etatSurfaceESet) result.append(etatSurface); else result.append("<unset>");
		result.append(", etatVegetation: ");
		if (etatVegetationESet) result.append(etatVegetation); else result.append("<unset>");
		result.append(", souEtatVegetation: ");
		if (souEtatVegetationESet) result.append(souEtatVegetation); else result.append("<unset>");
		result.append(", stabilite: ");
		if (stabiliteESet) result.append(stabilite); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeEtatOperationnelElementTopographieSolideImpl
