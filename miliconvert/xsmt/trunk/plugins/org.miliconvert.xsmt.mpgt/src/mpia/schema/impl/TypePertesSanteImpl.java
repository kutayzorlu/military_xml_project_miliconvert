/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.schema.SchemaPackage;
import mpia.schema.TypePertesSante;
import mpia.schema.TypePertesSanteParEchelon;
import mpia.schema.TypePertesSanteParUnite;

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
 * An implementation of the model object '<em><b>Type Pertes Sante</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypePertesSanteImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePertesSanteImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePertesSanteImpl#getRapporteParEchelonPertesSanteParEchelon <em>Rapporte Par Echelon Pertes Sante Par Echelon</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePertesSanteImpl#getRapporteParUnitePertesSanteParUnite <em>Rapporte Par Unite Pertes Sante Par Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypePertesSanteImpl extends EObjectImpl implements TypePertesSante {
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
	 * The cached value of the '{@link #getRapporteParEchelonPertesSanteParEchelon() <em>Rapporte Par Echelon Pertes Sante Par Echelon</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRapporteParEchelonPertesSanteParEchelon()
	 * @generated
	 * @ordered
	 */
	protected EList<TypePertesSanteParEchelon> rapporteParEchelonPertesSanteParEchelon;

	/**
	 * The cached value of the '{@link #getRapporteParUnitePertesSanteParUnite() <em>Rapporte Par Unite Pertes Sante Par Unite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRapporteParUnitePertesSanteParUnite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypePertesSanteParUnite> rapporteParUnitePertesSanteParUnite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypePertesSanteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypePertesSante();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PERTES_SANTE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PERTES_SANTE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypePertesSanteParEchelon> getRapporteParEchelonPertesSanteParEchelon() {
		if (rapporteParEchelonPertesSanteParEchelon == null) {
			rapporteParEchelonPertesSanteParEchelon = new EObjectContainmentEList<TypePertesSanteParEchelon>(TypePertesSanteParEchelon.class, this, SchemaPackage.TYPE_PERTES_SANTE__RAPPORTE_PAR_ECHELON_PERTES_SANTE_PAR_ECHELON);
		}
		return rapporteParEchelonPertesSanteParEchelon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypePertesSanteParUnite> getRapporteParUnitePertesSanteParUnite() {
		if (rapporteParUnitePertesSanteParUnite == null) {
			rapporteParUnitePertesSanteParUnite = new EObjectContainmentEList<TypePertesSanteParUnite>(TypePertesSanteParUnite.class, this, SchemaPackage.TYPE_PERTES_SANTE__RAPPORTE_PAR_UNITE_PERTES_SANTE_PAR_UNITE);
		}
		return rapporteParUnitePertesSanteParUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_PERTES_SANTE__RAPPORTE_PAR_ECHELON_PERTES_SANTE_PAR_ECHELON:
				return ((InternalEList<?>)getRapporteParEchelonPertesSanteParEchelon()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PERTES_SANTE__RAPPORTE_PAR_UNITE_PERTES_SANTE_PAR_UNITE:
				return ((InternalEList<?>)getRapporteParUnitePertesSanteParUnite()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_PERTES_SANTE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_PERTES_SANTE__CE:
				return getCE();
			case SchemaPackage.TYPE_PERTES_SANTE__RAPPORTE_PAR_ECHELON_PERTES_SANTE_PAR_ECHELON:
				return getRapporteParEchelonPertesSanteParEchelon();
			case SchemaPackage.TYPE_PERTES_SANTE__RAPPORTE_PAR_UNITE_PERTES_SANTE_PAR_UNITE:
				return getRapporteParUnitePertesSanteParUnite();
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
			case SchemaPackage.TYPE_PERTES_SANTE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_PERTES_SANTE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_PERTES_SANTE__RAPPORTE_PAR_ECHELON_PERTES_SANTE_PAR_ECHELON:
				getRapporteParEchelonPertesSanteParEchelon().clear();
				getRapporteParEchelonPertesSanteParEchelon().addAll((Collection<? extends TypePertesSanteParEchelon>)newValue);
				return;
			case SchemaPackage.TYPE_PERTES_SANTE__RAPPORTE_PAR_UNITE_PERTES_SANTE_PAR_UNITE:
				getRapporteParUnitePertesSanteParUnite().clear();
				getRapporteParUnitePertesSanteParUnite().addAll((Collection<? extends TypePertesSanteParUnite>)newValue);
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
			case SchemaPackage.TYPE_PERTES_SANTE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PERTES_SANTE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PERTES_SANTE__RAPPORTE_PAR_ECHELON_PERTES_SANTE_PAR_ECHELON:
				getRapporteParEchelonPertesSanteParEchelon().clear();
				return;
			case SchemaPackage.TYPE_PERTES_SANTE__RAPPORTE_PAR_UNITE_PERTES_SANTE_PAR_UNITE:
				getRapporteParUnitePertesSanteParUnite().clear();
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
			case SchemaPackage.TYPE_PERTES_SANTE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_PERTES_SANTE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_PERTES_SANTE__RAPPORTE_PAR_ECHELON_PERTES_SANTE_PAR_ECHELON:
				return rapporteParEchelonPertesSanteParEchelon != null && !rapporteParEchelonPertesSanteParEchelon.isEmpty();
			case SchemaPackage.TYPE_PERTES_SANTE__RAPPORTE_PAR_UNITE_PERTES_SANTE_PAR_UNITE:
				return rapporteParUnitePertesSanteParUnite != null && !rapporteParUnitePertesSanteParUnite.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //TypePertesSanteImpl
