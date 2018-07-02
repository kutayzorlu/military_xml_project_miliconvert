/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCelluleSoutien;
import mpia.schema.TypeJalon;
import mpia.schema.TypePlanificationCelluleSoutien;

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
 * An implementation of the model object '<em><b>Type Planification Cellule Soutien</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypePlanificationCelluleSoutienImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlanificationCelluleSoutienImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlanificationCelluleSoutienImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlanificationCelluleSoutienImpl#getListeCelluleSoutien <em>Liste Cellule Soutien</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlanificationCelluleSoutienImpl#getPositionneJalon <em>Positionne Jalon</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypePlanificationCelluleSoutienImpl extends EObjectImpl implements TypePlanificationCelluleSoutien {
	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

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
	 * The cached value of the '{@link #getListeCelluleSoutien() <em>Liste Cellule Soutien</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListeCelluleSoutien()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeCelluleSoutien> listeCelluleSoutien;

	/**
	 * The cached value of the '{@link #getPositionneJalon() <em>Positionne Jalon</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionneJalon()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeJalon> positionneJalon;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypePlanificationCelluleSoutienImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypePlanificationCelluleSoutien();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PLANIFICATION_CELLULE_SOUTIEN__NOM, oldNom, nom));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PLANIFICATION_CELLULE_SOUTIEN__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PLANIFICATION_CELLULE_SOUTIEN__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeCelluleSoutien> getListeCelluleSoutien() {
		if (listeCelluleSoutien == null) {
			listeCelluleSoutien = new EObjectContainmentEList<TypeCelluleSoutien>(TypeCelluleSoutien.class, this, SchemaPackage.TYPE_PLANIFICATION_CELLULE_SOUTIEN__LISTE_CELLULE_SOUTIEN);
		}
		return listeCelluleSoutien;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeJalon> getPositionneJalon() {
		if (positionneJalon == null) {
			positionneJalon = new EObjectContainmentEList<TypeJalon>(TypeJalon.class, this, SchemaPackage.TYPE_PLANIFICATION_CELLULE_SOUTIEN__POSITIONNE_JALON);
		}
		return positionneJalon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_PLANIFICATION_CELLULE_SOUTIEN__LISTE_CELLULE_SOUTIEN:
				return ((InternalEList<?>)getListeCelluleSoutien()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PLANIFICATION_CELLULE_SOUTIEN__POSITIONNE_JALON:
				return ((InternalEList<?>)getPositionneJalon()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_PLANIFICATION_CELLULE_SOUTIEN__NOM:
				return getNom();
			case SchemaPackage.TYPE_PLANIFICATION_CELLULE_SOUTIEN__CTE:
				return getCTE();
			case SchemaPackage.TYPE_PLANIFICATION_CELLULE_SOUTIEN__CE:
				return getCE();
			case SchemaPackage.TYPE_PLANIFICATION_CELLULE_SOUTIEN__LISTE_CELLULE_SOUTIEN:
				return getListeCelluleSoutien();
			case SchemaPackage.TYPE_PLANIFICATION_CELLULE_SOUTIEN__POSITIONNE_JALON:
				return getPositionneJalon();
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
			case SchemaPackage.TYPE_PLANIFICATION_CELLULE_SOUTIEN__NOM:
				setNom((String)newValue);
				return;
			case SchemaPackage.TYPE_PLANIFICATION_CELLULE_SOUTIEN__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_PLANIFICATION_CELLULE_SOUTIEN__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_PLANIFICATION_CELLULE_SOUTIEN__LISTE_CELLULE_SOUTIEN:
				getListeCelluleSoutien().clear();
				getListeCelluleSoutien().addAll((Collection<? extends TypeCelluleSoutien>)newValue);
				return;
			case SchemaPackage.TYPE_PLANIFICATION_CELLULE_SOUTIEN__POSITIONNE_JALON:
				getPositionneJalon().clear();
				getPositionneJalon().addAll((Collection<? extends TypeJalon>)newValue);
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
			case SchemaPackage.TYPE_PLANIFICATION_CELLULE_SOUTIEN__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PLANIFICATION_CELLULE_SOUTIEN__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PLANIFICATION_CELLULE_SOUTIEN__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PLANIFICATION_CELLULE_SOUTIEN__LISTE_CELLULE_SOUTIEN:
				getListeCelluleSoutien().clear();
				return;
			case SchemaPackage.TYPE_PLANIFICATION_CELLULE_SOUTIEN__POSITIONNE_JALON:
				getPositionneJalon().clear();
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
			case SchemaPackage.TYPE_PLANIFICATION_CELLULE_SOUTIEN__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case SchemaPackage.TYPE_PLANIFICATION_CELLULE_SOUTIEN__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_PLANIFICATION_CELLULE_SOUTIEN__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_PLANIFICATION_CELLULE_SOUTIEN__LISTE_CELLULE_SOUTIEN:
				return listeCelluleSoutien != null && !listeCelluleSoutien.isEmpty();
			case SchemaPackage.TYPE_PLANIFICATION_CELLULE_SOUTIEN__POSITIONNE_JALON:
				return positionneJalon != null && !positionneJalon.isEmpty();
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
		result.append(" (nom: ");
		result.append(nom);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypePlanificationCelluleSoutienImpl
