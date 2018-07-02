/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCRrenseignementObjectif;
import mpia.schema.TypeDictionaryDicoRenseignementObjectifCategorie;
import mpia.schema.TypeRenseignementObjectif;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Renseignement Objectif</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeRenseignementObjectifImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRenseignementObjectifImpl#getAPourCRrenseignementObjectifCRrenseignementObjectif <em>APour CRrenseignement Objectif CRrenseignement Objectif</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRenseignementObjectifImpl#getEstSujetAssociationRenseignementObjMisRenseignementObj <em>Est Sujet Association Renseignement Obj Mis Renseignement Obj</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeRenseignementObjectifImpl extends TypeActiviteImpl implements TypeRenseignementObjectif {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoRenseignementObjectifCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoRenseignementObjectifCategorie.DAMEVA;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoRenseignementObjectifCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The cached value of the '{@link #getAPourCRrenseignementObjectifCRrenseignementObjectif() <em>APour CRrenseignement Objectif CRrenseignement Objectif</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourCRrenseignementObjectifCRrenseignementObjectif()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeCRrenseignementObjectif> aPourCRrenseignementObjectifCRrenseignementObjectif;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationRenseignementObjMisRenseignementObj() <em>Est Sujet Association Renseignement Obj Mis Renseignement Obj</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationRenseignementObjMisRenseignementObj()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationRenseignementObjMisRenseignementObj;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeRenseignementObjectifImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeRenseignementObjectif();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoRenseignementObjectifCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoRenseignementObjectifCategorie newCategorie) {
		TypeDictionaryDicoRenseignementObjectifCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RENSEIGNEMENT_OBJECTIF__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoRenseignementObjectifCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_RENSEIGNEMENT_OBJECTIF__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCategorie() {
		return categorieESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeCRrenseignementObjectif> getAPourCRrenseignementObjectifCRrenseignementObjectif() {
		if (aPourCRrenseignementObjectifCRrenseignementObjectif == null) {
			aPourCRrenseignementObjectifCRrenseignementObjectif = new EObjectContainmentEList<TypeCRrenseignementObjectif>(TypeCRrenseignementObjectif.class, this, SchemaPackage.TYPE_RENSEIGNEMENT_OBJECTIF__APOUR_CRRENSEIGNEMENT_OBJECTIF_CRRENSEIGNEMENT_OBJECTIF);
		}
		return aPourCRrenseignementObjectifCRrenseignementObjectif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationRenseignementObjMisRenseignementObj() {
		if (estSujetAssociationRenseignementObjMisRenseignementObj == null) {
			estSujetAssociationRenseignementObjMisRenseignementObj = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_RENSEIGNEMENT_OBJECTIF__EST_SUJET_ASSOCIATION_RENSEIGNEMENT_OBJ_MIS_RENSEIGNEMENT_OBJ);
		}
		return estSujetAssociationRenseignementObjMisRenseignementObj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_RENSEIGNEMENT_OBJECTIF__APOUR_CRRENSEIGNEMENT_OBJECTIF_CRRENSEIGNEMENT_OBJECTIF:
				return ((InternalEList<?>)getAPourCRrenseignementObjectifCRrenseignementObjectif()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_RENSEIGNEMENT_OBJECTIF__EST_SUJET_ASSOCIATION_RENSEIGNEMENT_OBJ_MIS_RENSEIGNEMENT_OBJ:
				return ((InternalEList<?>)getEstSujetAssociationRenseignementObjMisRenseignementObj()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_RENSEIGNEMENT_OBJECTIF__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_RENSEIGNEMENT_OBJECTIF__APOUR_CRRENSEIGNEMENT_OBJECTIF_CRRENSEIGNEMENT_OBJECTIF:
				return getAPourCRrenseignementObjectifCRrenseignementObjectif();
			case SchemaPackage.TYPE_RENSEIGNEMENT_OBJECTIF__EST_SUJET_ASSOCIATION_RENSEIGNEMENT_OBJ_MIS_RENSEIGNEMENT_OBJ:
				return getEstSujetAssociationRenseignementObjMisRenseignementObj();
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
			case SchemaPackage.TYPE_RENSEIGNEMENT_OBJECTIF__CATEGORIE:
				setCategorie((TypeDictionaryDicoRenseignementObjectifCategorie)newValue);
				return;
			case SchemaPackage.TYPE_RENSEIGNEMENT_OBJECTIF__APOUR_CRRENSEIGNEMENT_OBJECTIF_CRRENSEIGNEMENT_OBJECTIF:
				getAPourCRrenseignementObjectifCRrenseignementObjectif().clear();
				getAPourCRrenseignementObjectifCRrenseignementObjectif().addAll((Collection<? extends TypeCRrenseignementObjectif>)newValue);
				return;
			case SchemaPackage.TYPE_RENSEIGNEMENT_OBJECTIF__EST_SUJET_ASSOCIATION_RENSEIGNEMENT_OBJ_MIS_RENSEIGNEMENT_OBJ:
				getEstSujetAssociationRenseignementObjMisRenseignementObj().clear();
				getEstSujetAssociationRenseignementObjMisRenseignementObj().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_RENSEIGNEMENT_OBJECTIF__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_RENSEIGNEMENT_OBJECTIF__APOUR_CRRENSEIGNEMENT_OBJECTIF_CRRENSEIGNEMENT_OBJECTIF:
				getAPourCRrenseignementObjectifCRrenseignementObjectif().clear();
				return;
			case SchemaPackage.TYPE_RENSEIGNEMENT_OBJECTIF__EST_SUJET_ASSOCIATION_RENSEIGNEMENT_OBJ_MIS_RENSEIGNEMENT_OBJ:
				getEstSujetAssociationRenseignementObjMisRenseignementObj().clear();
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
			case SchemaPackage.TYPE_RENSEIGNEMENT_OBJECTIF__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_RENSEIGNEMENT_OBJECTIF__APOUR_CRRENSEIGNEMENT_OBJECTIF_CRRENSEIGNEMENT_OBJECTIF:
				return aPourCRrenseignementObjectifCRrenseignementObjectif != null && !aPourCRrenseignementObjectifCRrenseignementObjectif.isEmpty();
			case SchemaPackage.TYPE_RENSEIGNEMENT_OBJECTIF__EST_SUJET_ASSOCIATION_RENSEIGNEMENT_OBJ_MIS_RENSEIGNEMENT_OBJ:
				return estSujetAssociationRenseignementObjMisRenseignementObj != null && !estSujetAssociationRenseignementObjMisRenseignementObj.isEmpty();
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
		result.append(" (categorie: ");
		if (categorieESet) result.append(categorie); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeRenseignementObjectifImpl
