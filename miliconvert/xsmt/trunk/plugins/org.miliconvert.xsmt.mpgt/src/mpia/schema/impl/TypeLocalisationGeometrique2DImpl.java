/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoLocalisationGeometriqueCategorieFormeGeometrique;
import mpia.schema.TypeLocalisationGeometrique2D;
import mpia.schema.TypeObjetGeometrique;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Localisation Geometrique2 D</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeLocalisationGeometrique2DImpl#getCategorieFormeGeometrique <em>Categorie Forme Geometrique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeLocalisationGeometrique2DImpl#getAPourObjetGeometriqueObjetGeometrique <em>APour Objet Geometrique Objet Geometrique</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeLocalisationGeometrique2DImpl extends TypeLocalisationGeometriqueImpl implements TypeLocalisationGeometrique2D {
	/**
	 * The default value of the '{@link #getCategorieFormeGeometrique() <em>Categorie Forme Geometrique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorieFormeGeometrique()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoLocalisationGeometriqueCategorieFormeGeometrique CATEGORIE_FORME_GEOMETRIQUE_EDEFAULT = TypeDictionaryDicoLocalisationGeometriqueCategorieFormeGeometrique.PT;

	/**
	 * The cached value of the '{@link #getCategorieFormeGeometrique() <em>Categorie Forme Geometrique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorieFormeGeometrique()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoLocalisationGeometriqueCategorieFormeGeometrique categorieFormeGeometrique = CATEGORIE_FORME_GEOMETRIQUE_EDEFAULT;

	/**
	 * This is true if the Categorie Forme Geometrique attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieFormeGeometriqueESet;

	/**
	 * The cached value of the '{@link #getAPourObjetGeometriqueObjetGeometrique() <em>APour Objet Geometrique Objet Geometrique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourObjetGeometriqueObjetGeometrique()
	 * @generated
	 * @ordered
	 */
	protected TypeObjetGeometrique aPourObjetGeometriqueObjetGeometrique;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeLocalisationGeometrique2DImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeLocalisationGeometrique2D();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoLocalisationGeometriqueCategorieFormeGeometrique getCategorieFormeGeometrique() {
		return categorieFormeGeometrique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorieFormeGeometrique(TypeDictionaryDicoLocalisationGeometriqueCategorieFormeGeometrique newCategorieFormeGeometrique) {
		TypeDictionaryDicoLocalisationGeometriqueCategorieFormeGeometrique oldCategorieFormeGeometrique = categorieFormeGeometrique;
		categorieFormeGeometrique = newCategorieFormeGeometrique == null ? CATEGORIE_FORME_GEOMETRIQUE_EDEFAULT : newCategorieFormeGeometrique;
		boolean oldCategorieFormeGeometriqueESet = categorieFormeGeometriqueESet;
		categorieFormeGeometriqueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LOCALISATION_GEOMETRIQUE2_D__CATEGORIE_FORME_GEOMETRIQUE, oldCategorieFormeGeometrique, categorieFormeGeometrique, !oldCategorieFormeGeometriqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorieFormeGeometrique() {
		TypeDictionaryDicoLocalisationGeometriqueCategorieFormeGeometrique oldCategorieFormeGeometrique = categorieFormeGeometrique;
		boolean oldCategorieFormeGeometriqueESet = categorieFormeGeometriqueESet;
		categorieFormeGeometrique = CATEGORIE_FORME_GEOMETRIQUE_EDEFAULT;
		categorieFormeGeometriqueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_LOCALISATION_GEOMETRIQUE2_D__CATEGORIE_FORME_GEOMETRIQUE, oldCategorieFormeGeometrique, CATEGORIE_FORME_GEOMETRIQUE_EDEFAULT, oldCategorieFormeGeometriqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCategorieFormeGeometrique() {
		return categorieFormeGeometriqueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeObjetGeometrique getAPourObjetGeometriqueObjetGeometrique() {
		return aPourObjetGeometriqueObjetGeometrique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourObjetGeometriqueObjetGeometrique(TypeObjetGeometrique newAPourObjetGeometriqueObjetGeometrique, NotificationChain msgs) {
		TypeObjetGeometrique oldAPourObjetGeometriqueObjetGeometrique = aPourObjetGeometriqueObjetGeometrique;
		aPourObjetGeometriqueObjetGeometrique = newAPourObjetGeometriqueObjetGeometrique;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LOCALISATION_GEOMETRIQUE2_D__APOUR_OBJET_GEOMETRIQUE_OBJET_GEOMETRIQUE, oldAPourObjetGeometriqueObjetGeometrique, newAPourObjetGeometriqueObjetGeometrique);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourObjetGeometriqueObjetGeometrique(TypeObjetGeometrique newAPourObjetGeometriqueObjetGeometrique) {
		if (newAPourObjetGeometriqueObjetGeometrique != aPourObjetGeometriqueObjetGeometrique) {
			NotificationChain msgs = null;
			if (aPourObjetGeometriqueObjetGeometrique != null)
				msgs = ((InternalEObject)aPourObjetGeometriqueObjetGeometrique).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_LOCALISATION_GEOMETRIQUE2_D__APOUR_OBJET_GEOMETRIQUE_OBJET_GEOMETRIQUE, null, msgs);
			if (newAPourObjetGeometriqueObjetGeometrique != null)
				msgs = ((InternalEObject)newAPourObjetGeometriqueObjetGeometrique).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_LOCALISATION_GEOMETRIQUE2_D__APOUR_OBJET_GEOMETRIQUE_OBJET_GEOMETRIQUE, null, msgs);
			msgs = basicSetAPourObjetGeometriqueObjetGeometrique(newAPourObjetGeometriqueObjetGeometrique, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LOCALISATION_GEOMETRIQUE2_D__APOUR_OBJET_GEOMETRIQUE_OBJET_GEOMETRIQUE, newAPourObjetGeometriqueObjetGeometrique, newAPourObjetGeometriqueObjetGeometrique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_LOCALISATION_GEOMETRIQUE2_D__APOUR_OBJET_GEOMETRIQUE_OBJET_GEOMETRIQUE:
				return basicSetAPourObjetGeometriqueObjetGeometrique(null, msgs);
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
			case SchemaPackage.TYPE_LOCALISATION_GEOMETRIQUE2_D__CATEGORIE_FORME_GEOMETRIQUE:
				return getCategorieFormeGeometrique();
			case SchemaPackage.TYPE_LOCALISATION_GEOMETRIQUE2_D__APOUR_OBJET_GEOMETRIQUE_OBJET_GEOMETRIQUE:
				return getAPourObjetGeometriqueObjetGeometrique();
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
			case SchemaPackage.TYPE_LOCALISATION_GEOMETRIQUE2_D__CATEGORIE_FORME_GEOMETRIQUE:
				setCategorieFormeGeometrique((TypeDictionaryDicoLocalisationGeometriqueCategorieFormeGeometrique)newValue);
				return;
			case SchemaPackage.TYPE_LOCALISATION_GEOMETRIQUE2_D__APOUR_OBJET_GEOMETRIQUE_OBJET_GEOMETRIQUE:
				setAPourObjetGeometriqueObjetGeometrique((TypeObjetGeometrique)newValue);
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
			case SchemaPackage.TYPE_LOCALISATION_GEOMETRIQUE2_D__CATEGORIE_FORME_GEOMETRIQUE:
				unsetCategorieFormeGeometrique();
				return;
			case SchemaPackage.TYPE_LOCALISATION_GEOMETRIQUE2_D__APOUR_OBJET_GEOMETRIQUE_OBJET_GEOMETRIQUE:
				setAPourObjetGeometriqueObjetGeometrique((TypeObjetGeometrique)null);
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
			case SchemaPackage.TYPE_LOCALISATION_GEOMETRIQUE2_D__CATEGORIE_FORME_GEOMETRIQUE:
				return isSetCategorieFormeGeometrique();
			case SchemaPackage.TYPE_LOCALISATION_GEOMETRIQUE2_D__APOUR_OBJET_GEOMETRIQUE_OBJET_GEOMETRIQUE:
				return aPourObjetGeometriqueObjetGeometrique != null;
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
		result.append(" (categorieFormeGeometrique: ");
		if (categorieFormeGeometriqueESet) result.append(categorieFormeGeometrique); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeLocalisationGeometrique2DImpl
