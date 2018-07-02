/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoEpaisseurTrait;
import mpia.schema.TypeDictionaryDicoStyleRemplissage;
import mpia.schema.TypeDictionaryDicoStyleTrait;
import mpia.schema.TypeDictionaryDicoTypeSurfacique;
import mpia.schema.TypeSymboleSurfacique;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Symbole Surfacique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeSymboleSurfaciqueImpl#getTypeSymbole <em>Type Symbole</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSymboleSurfaciqueImpl#getStyleTrait <em>Style Trait</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSymboleSurfaciqueImpl#getEpaisseurTrait <em>Epaisseur Trait</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSymboleSurfaciqueImpl#getRemplissage <em>Remplissage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypeSymboleSurfaciqueImpl extends TypeSymboleLibreImpl implements TypeSymboleSurfacique {
	/**
	 * The default value of the '{@link #getTypeSymbole() <em>Type Symbole</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeSymbole()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeSurfacique TYPE_SYMBOLE_EDEFAULT = TypeDictionaryDicoTypeSurfacique.CIRC;

	/**
	 * The cached value of the '{@link #getTypeSymbole() <em>Type Symbole</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeSymbole()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeSurfacique typeSymbole = TYPE_SYMBOLE_EDEFAULT;

	/**
	 * This is true if the Type Symbole attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeSymboleESet;

	/**
	 * The default value of the '{@link #getStyleTrait() <em>Style Trait</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleTrait()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoStyleTrait STYLE_TRAIT_EDEFAULT = TypeDictionaryDicoStyleTrait.FUL;

	/**
	 * The cached value of the '{@link #getStyleTrait() <em>Style Trait</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleTrait()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoStyleTrait styleTrait = STYLE_TRAIT_EDEFAULT;

	/**
	 * This is true if the Style Trait attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean styleTraitESet;

	/**
	 * The default value of the '{@link #getEpaisseurTrait() <em>Epaisseur Trait</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpaisseurTrait()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEpaisseurTrait EPAISSEUR_TRAIT_EDEFAULT = TypeDictionaryDicoEpaisseurTrait.THIN;

	/**
	 * The cached value of the '{@link #getEpaisseurTrait() <em>Epaisseur Trait</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpaisseurTrait()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEpaisseurTrait epaisseurTrait = EPAISSEUR_TRAIT_EDEFAULT;

	/**
	 * This is true if the Epaisseur Trait attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean epaisseurTraitESet;

	/**
	 * The default value of the '{@link #getRemplissage() <em>Remplissage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemplissage()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoStyleRemplissage REMPLISSAGE_EDEFAULT = TypeDictionaryDicoStyleRemplissage.HOR;

	/**
	 * The cached value of the '{@link #getRemplissage() <em>Remplissage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemplissage()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoStyleRemplissage remplissage = REMPLISSAGE_EDEFAULT;

	/**
	 * This is true if the Remplissage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean remplissageESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeSymboleSurfaciqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeSymboleSurfacique();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeSurfacique getTypeSymbole() {
		return typeSymbole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeSymbole(TypeDictionaryDicoTypeSurfacique newTypeSymbole) {
		TypeDictionaryDicoTypeSurfacique oldTypeSymbole = typeSymbole;
		typeSymbole = newTypeSymbole == null ? TYPE_SYMBOLE_EDEFAULT : newTypeSymbole;
		boolean oldTypeSymboleESet = typeSymboleESet;
		typeSymboleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYMBOLE_SURFACIQUE__TYPE_SYMBOLE, oldTypeSymbole, typeSymbole, !oldTypeSymboleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeSymbole() {
		TypeDictionaryDicoTypeSurfacique oldTypeSymbole = typeSymbole;
		boolean oldTypeSymboleESet = typeSymboleESet;
		typeSymbole = TYPE_SYMBOLE_EDEFAULT;
		typeSymboleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SYMBOLE_SURFACIQUE__TYPE_SYMBOLE, oldTypeSymbole, TYPE_SYMBOLE_EDEFAULT, oldTypeSymboleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeSymbole() {
		return typeSymboleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoStyleTrait getStyleTrait() {
		return styleTrait;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyleTrait(TypeDictionaryDicoStyleTrait newStyleTrait) {
		TypeDictionaryDicoStyleTrait oldStyleTrait = styleTrait;
		styleTrait = newStyleTrait == null ? STYLE_TRAIT_EDEFAULT : newStyleTrait;
		boolean oldStyleTraitESet = styleTraitESet;
		styleTraitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYMBOLE_SURFACIQUE__STYLE_TRAIT, oldStyleTrait, styleTrait, !oldStyleTraitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStyleTrait() {
		TypeDictionaryDicoStyleTrait oldStyleTrait = styleTrait;
		boolean oldStyleTraitESet = styleTraitESet;
		styleTrait = STYLE_TRAIT_EDEFAULT;
		styleTraitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SYMBOLE_SURFACIQUE__STYLE_TRAIT, oldStyleTrait, STYLE_TRAIT_EDEFAULT, oldStyleTraitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStyleTrait() {
		return styleTraitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEpaisseurTrait getEpaisseurTrait() {
		return epaisseurTrait;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEpaisseurTrait(TypeDictionaryDicoEpaisseurTrait newEpaisseurTrait) {
		TypeDictionaryDicoEpaisseurTrait oldEpaisseurTrait = epaisseurTrait;
		epaisseurTrait = newEpaisseurTrait == null ? EPAISSEUR_TRAIT_EDEFAULT : newEpaisseurTrait;
		boolean oldEpaisseurTraitESet = epaisseurTraitESet;
		epaisseurTraitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYMBOLE_SURFACIQUE__EPAISSEUR_TRAIT, oldEpaisseurTrait, epaisseurTrait, !oldEpaisseurTraitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEpaisseurTrait() {
		TypeDictionaryDicoEpaisseurTrait oldEpaisseurTrait = epaisseurTrait;
		boolean oldEpaisseurTraitESet = epaisseurTraitESet;
		epaisseurTrait = EPAISSEUR_TRAIT_EDEFAULT;
		epaisseurTraitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SYMBOLE_SURFACIQUE__EPAISSEUR_TRAIT, oldEpaisseurTrait, EPAISSEUR_TRAIT_EDEFAULT, oldEpaisseurTraitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEpaisseurTrait() {
		return epaisseurTraitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoStyleRemplissage getRemplissage() {
		return remplissage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemplissage(TypeDictionaryDicoStyleRemplissage newRemplissage) {
		TypeDictionaryDicoStyleRemplissage oldRemplissage = remplissage;
		remplissage = newRemplissage == null ? REMPLISSAGE_EDEFAULT : newRemplissage;
		boolean oldRemplissageESet = remplissageESet;
		remplissageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYMBOLE_SURFACIQUE__REMPLISSAGE, oldRemplissage, remplissage, !oldRemplissageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRemplissage() {
		TypeDictionaryDicoStyleRemplissage oldRemplissage = remplissage;
		boolean oldRemplissageESet = remplissageESet;
		remplissage = REMPLISSAGE_EDEFAULT;
		remplissageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SYMBOLE_SURFACIQUE__REMPLISSAGE, oldRemplissage, REMPLISSAGE_EDEFAULT, oldRemplissageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRemplissage() {
		return remplissageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_SYMBOLE_SURFACIQUE__TYPE_SYMBOLE:
				return getTypeSymbole();
			case SchemaPackage.TYPE_SYMBOLE_SURFACIQUE__STYLE_TRAIT:
				return getStyleTrait();
			case SchemaPackage.TYPE_SYMBOLE_SURFACIQUE__EPAISSEUR_TRAIT:
				return getEpaisseurTrait();
			case SchemaPackage.TYPE_SYMBOLE_SURFACIQUE__REMPLISSAGE:
				return getRemplissage();
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
			case SchemaPackage.TYPE_SYMBOLE_SURFACIQUE__TYPE_SYMBOLE:
				setTypeSymbole((TypeDictionaryDicoTypeSurfacique)newValue);
				return;
			case SchemaPackage.TYPE_SYMBOLE_SURFACIQUE__STYLE_TRAIT:
				setStyleTrait((TypeDictionaryDicoStyleTrait)newValue);
				return;
			case SchemaPackage.TYPE_SYMBOLE_SURFACIQUE__EPAISSEUR_TRAIT:
				setEpaisseurTrait((TypeDictionaryDicoEpaisseurTrait)newValue);
				return;
			case SchemaPackage.TYPE_SYMBOLE_SURFACIQUE__REMPLISSAGE:
				setRemplissage((TypeDictionaryDicoStyleRemplissage)newValue);
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
			case SchemaPackage.TYPE_SYMBOLE_SURFACIQUE__TYPE_SYMBOLE:
				unsetTypeSymbole();
				return;
			case SchemaPackage.TYPE_SYMBOLE_SURFACIQUE__STYLE_TRAIT:
				unsetStyleTrait();
				return;
			case SchemaPackage.TYPE_SYMBOLE_SURFACIQUE__EPAISSEUR_TRAIT:
				unsetEpaisseurTrait();
				return;
			case SchemaPackage.TYPE_SYMBOLE_SURFACIQUE__REMPLISSAGE:
				unsetRemplissage();
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
			case SchemaPackage.TYPE_SYMBOLE_SURFACIQUE__TYPE_SYMBOLE:
				return isSetTypeSymbole();
			case SchemaPackage.TYPE_SYMBOLE_SURFACIQUE__STYLE_TRAIT:
				return isSetStyleTrait();
			case SchemaPackage.TYPE_SYMBOLE_SURFACIQUE__EPAISSEUR_TRAIT:
				return isSetEpaisseurTrait();
			case SchemaPackage.TYPE_SYMBOLE_SURFACIQUE__REMPLISSAGE:
				return isSetRemplissage();
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
		result.append(" (typeSymbole: ");
		if (typeSymboleESet) result.append(typeSymbole); else result.append("<unset>");
		result.append(", styleTrait: ");
		if (styleTraitESet) result.append(styleTrait); else result.append("<unset>");
		result.append(", epaisseurTrait: ");
		if (epaisseurTraitESet) result.append(epaisseurTrait); else result.append("<unset>");
		result.append(", remplissage: ");
		if (remplissageESet) result.append(remplissage); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeSymboleSurfaciqueImpl
