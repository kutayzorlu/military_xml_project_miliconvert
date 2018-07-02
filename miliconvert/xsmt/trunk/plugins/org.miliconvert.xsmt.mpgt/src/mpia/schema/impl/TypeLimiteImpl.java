/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoLimiteCategorieAdministrative;
import mpia.schema.TypeDictionaryDicoNiveau;
import mpia.schema.TypeLimite;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Limite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeLimiteImpl#getCategorieAdministrative <em>Categorie Administrative</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeLimiteImpl#getNiveau <em>Niveau</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeLimiteImpl extends TypeElementControleImpl implements TypeLimite {
	/**
	 * The default value of the '{@link #getCategorieAdministrative() <em>Categorie Administrative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorieAdministrative()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoLimiteCategorieAdministrative CATEGORIE_ADMINISTRATIVE_EDEFAULT = TypeDictionaryDicoLimiteCategorieAdministrative.SUBR;

	/**
	 * The cached value of the '{@link #getCategorieAdministrative() <em>Categorie Administrative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorieAdministrative()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoLimiteCategorieAdministrative categorieAdministrative = CATEGORIE_ADMINISTRATIVE_EDEFAULT;

	/**
	 * This is true if the Categorie Administrative attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieAdministrativeESet;

	/**
	 * The default value of the '{@link #getNiveau() <em>Niveau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveau()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoNiveau NIVEAU_EDEFAULT = TypeDictionaryDicoNiveau.AG;

	/**
	 * The cached value of the '{@link #getNiveau() <em>Niveau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveau()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoNiveau niveau = NIVEAU_EDEFAULT;

	/**
	 * This is true if the Niveau attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean niveauESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeLimiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeLimite();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoLimiteCategorieAdministrative getCategorieAdministrative() {
		return categorieAdministrative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorieAdministrative(TypeDictionaryDicoLimiteCategorieAdministrative newCategorieAdministrative) {
		TypeDictionaryDicoLimiteCategorieAdministrative oldCategorieAdministrative = categorieAdministrative;
		categorieAdministrative = newCategorieAdministrative == null ? CATEGORIE_ADMINISTRATIVE_EDEFAULT : newCategorieAdministrative;
		boolean oldCategorieAdministrativeESet = categorieAdministrativeESet;
		categorieAdministrativeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LIMITE__CATEGORIE_ADMINISTRATIVE, oldCategorieAdministrative, categorieAdministrative, !oldCategorieAdministrativeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorieAdministrative() {
		TypeDictionaryDicoLimiteCategorieAdministrative oldCategorieAdministrative = categorieAdministrative;
		boolean oldCategorieAdministrativeESet = categorieAdministrativeESet;
		categorieAdministrative = CATEGORIE_ADMINISTRATIVE_EDEFAULT;
		categorieAdministrativeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_LIMITE__CATEGORIE_ADMINISTRATIVE, oldCategorieAdministrative, CATEGORIE_ADMINISTRATIVE_EDEFAULT, oldCategorieAdministrativeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCategorieAdministrative() {
		return categorieAdministrativeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoNiveau getNiveau() {
		return niveau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNiveau(TypeDictionaryDicoNiveau newNiveau) {
		TypeDictionaryDicoNiveau oldNiveau = niveau;
		niveau = newNiveau == null ? NIVEAU_EDEFAULT : newNiveau;
		boolean oldNiveauESet = niveauESet;
		niveauESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LIMITE__NIVEAU, oldNiveau, niveau, !oldNiveauESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNiveau() {
		TypeDictionaryDicoNiveau oldNiveau = niveau;
		boolean oldNiveauESet = niveauESet;
		niveau = NIVEAU_EDEFAULT;
		niveauESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_LIMITE__NIVEAU, oldNiveau, NIVEAU_EDEFAULT, oldNiveauESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNiveau() {
		return niveauESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_LIMITE__CATEGORIE_ADMINISTRATIVE:
				return getCategorieAdministrative();
			case SchemaPackage.TYPE_LIMITE__NIVEAU:
				return getNiveau();
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
			case SchemaPackage.TYPE_LIMITE__CATEGORIE_ADMINISTRATIVE:
				setCategorieAdministrative((TypeDictionaryDicoLimiteCategorieAdministrative)newValue);
				return;
			case SchemaPackage.TYPE_LIMITE__NIVEAU:
				setNiveau((TypeDictionaryDicoNiveau)newValue);
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
			case SchemaPackage.TYPE_LIMITE__CATEGORIE_ADMINISTRATIVE:
				unsetCategorieAdministrative();
				return;
			case SchemaPackage.TYPE_LIMITE__NIVEAU:
				unsetNiveau();
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
			case SchemaPackage.TYPE_LIMITE__CATEGORIE_ADMINISTRATIVE:
				return isSetCategorieAdministrative();
			case SchemaPackage.TYPE_LIMITE__NIVEAU:
				return isSetNiveau();
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
		result.append(" (categorieAdministrative: ");
		if (categorieAdministrativeESet) result.append(categorieAdministrative); else result.append("<unset>");
		result.append(", niveau: ");
		if (niveauESet) result.append(niveau); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeLimiteImpl
