/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoEpaisseurTrait;
import mpia.schema.TypeDictionaryDicoStyleTraitEtendu;
import mpia.schema.TypeDictionaryDicoTypeLineique;
import mpia.schema.TypeSymboleLineique;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Symbole Lineique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeSymboleLineiqueImpl#getTypeLineique <em>Type Lineique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSymboleLineiqueImpl#getStyleTrait <em>Style Trait</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSymboleLineiqueImpl#getEpaisseurTrait <em>Epaisseur Trait</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeSymboleLineiqueImpl extends TypeSymboleLibreImpl implements TypeSymboleLineique {
	/**
	 * The default value of the '{@link #getTypeLineique() <em>Type Lineique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeLineique()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeLineique TYPE_LINEIQUE_EDEFAULT = TypeDictionaryDicoTypeLineique.LINE;

	/**
	 * The cached value of the '{@link #getTypeLineique() <em>Type Lineique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeLineique()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeLineique typeLineique = TYPE_LINEIQUE_EDEFAULT;

	/**
	 * This is true if the Type Lineique attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeLineiqueESet;

	/**
	 * The default value of the '{@link #getStyleTrait() <em>Style Trait</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleTrait()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoStyleTraitEtendu STYLE_TRAIT_EDEFAULT = TypeDictionaryDicoStyleTraitEtendu.FUL;

	/**
	 * The cached value of the '{@link #getStyleTrait() <em>Style Trait</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleTrait()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoStyleTraitEtendu styleTrait = STYLE_TRAIT_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeSymboleLineiqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeSymboleLineique();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeLineique getTypeLineique() {
		return typeLineique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeLineique(TypeDictionaryDicoTypeLineique newTypeLineique) {
		TypeDictionaryDicoTypeLineique oldTypeLineique = typeLineique;
		typeLineique = newTypeLineique == null ? TYPE_LINEIQUE_EDEFAULT : newTypeLineique;
		boolean oldTypeLineiqueESet = typeLineiqueESet;
		typeLineiqueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYMBOLE_LINEIQUE__TYPE_LINEIQUE, oldTypeLineique, typeLineique, !oldTypeLineiqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeLineique() {
		TypeDictionaryDicoTypeLineique oldTypeLineique = typeLineique;
		boolean oldTypeLineiqueESet = typeLineiqueESet;
		typeLineique = TYPE_LINEIQUE_EDEFAULT;
		typeLineiqueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SYMBOLE_LINEIQUE__TYPE_LINEIQUE, oldTypeLineique, TYPE_LINEIQUE_EDEFAULT, oldTypeLineiqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeLineique() {
		return typeLineiqueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoStyleTraitEtendu getStyleTrait() {
		return styleTrait;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyleTrait(TypeDictionaryDicoStyleTraitEtendu newStyleTrait) {
		TypeDictionaryDicoStyleTraitEtendu oldStyleTrait = styleTrait;
		styleTrait = newStyleTrait == null ? STYLE_TRAIT_EDEFAULT : newStyleTrait;
		boolean oldStyleTraitESet = styleTraitESet;
		styleTraitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYMBOLE_LINEIQUE__STYLE_TRAIT, oldStyleTrait, styleTrait, !oldStyleTraitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStyleTrait() {
		TypeDictionaryDicoStyleTraitEtendu oldStyleTrait = styleTrait;
		boolean oldStyleTraitESet = styleTraitESet;
		styleTrait = STYLE_TRAIT_EDEFAULT;
		styleTraitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SYMBOLE_LINEIQUE__STYLE_TRAIT, oldStyleTrait, STYLE_TRAIT_EDEFAULT, oldStyleTraitESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYMBOLE_LINEIQUE__EPAISSEUR_TRAIT, oldEpaisseurTrait, epaisseurTrait, !oldEpaisseurTraitESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SYMBOLE_LINEIQUE__EPAISSEUR_TRAIT, oldEpaisseurTrait, EPAISSEUR_TRAIT_EDEFAULT, oldEpaisseurTraitESet));
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_SYMBOLE_LINEIQUE__TYPE_LINEIQUE:
				return getTypeLineique();
			case SchemaPackage.TYPE_SYMBOLE_LINEIQUE__STYLE_TRAIT:
				return getStyleTrait();
			case SchemaPackage.TYPE_SYMBOLE_LINEIQUE__EPAISSEUR_TRAIT:
				return getEpaisseurTrait();
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
			case SchemaPackage.TYPE_SYMBOLE_LINEIQUE__TYPE_LINEIQUE:
				setTypeLineique((TypeDictionaryDicoTypeLineique)newValue);
				return;
			case SchemaPackage.TYPE_SYMBOLE_LINEIQUE__STYLE_TRAIT:
				setStyleTrait((TypeDictionaryDicoStyleTraitEtendu)newValue);
				return;
			case SchemaPackage.TYPE_SYMBOLE_LINEIQUE__EPAISSEUR_TRAIT:
				setEpaisseurTrait((TypeDictionaryDicoEpaisseurTrait)newValue);
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
			case SchemaPackage.TYPE_SYMBOLE_LINEIQUE__TYPE_LINEIQUE:
				unsetTypeLineique();
				return;
			case SchemaPackage.TYPE_SYMBOLE_LINEIQUE__STYLE_TRAIT:
				unsetStyleTrait();
				return;
			case SchemaPackage.TYPE_SYMBOLE_LINEIQUE__EPAISSEUR_TRAIT:
				unsetEpaisseurTrait();
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
			case SchemaPackage.TYPE_SYMBOLE_LINEIQUE__TYPE_LINEIQUE:
				return isSetTypeLineique();
			case SchemaPackage.TYPE_SYMBOLE_LINEIQUE__STYLE_TRAIT:
				return isSetStyleTrait();
			case SchemaPackage.TYPE_SYMBOLE_LINEIQUE__EPAISSEUR_TRAIT:
				return isSetEpaisseurTrait();
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
		result.append(" (typeLineique: ");
		if (typeLineiqueESet) result.append(typeLineique); else result.append("<unset>");
		result.append(", styleTrait: ");
		if (styleTraitESet) result.append(styleTrait); else result.append("<unset>");
		result.append(", epaisseurTrait: ");
		if (epaisseurTraitESet) result.append(epaisseurTrait); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeSymboleLineiqueImpl
