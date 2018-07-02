/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoEnvironnementTerrainEtVegetationDescriptionTerrain;
import mpia.schema.TypeDictionaryDicoEnvironnementTerrainEtVegetationDescriptionVegetation;
import mpia.schema.TypeEnvironnementTerrainEtVegetation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Environnement Terrain Et Vegetation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEnvironnementTerrainEtVegetationImpl#getDescriptionTerrain <em>Description Terrain</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEnvironnementTerrainEtVegetationImpl#getDescriptionVegetation <em>Description Vegetation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEnvironnementTerrainEtVegetationImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEnvironnementTerrainEtVegetationImpl#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeEnvironnementTerrainEtVegetationImpl extends EObjectImpl implements TypeEnvironnementTerrainEtVegetation {
	/**
	 * The default value of the '{@link #getDescriptionTerrain() <em>Description Terrain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionTerrain()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEnvironnementTerrainEtVegetationDescriptionTerrain DESCRIPTION_TERRAIN_EDEFAULT = TypeDictionaryDicoEnvironnementTerrainEtVegetationDescriptionTerrain.FLAT;

	/**
	 * The cached value of the '{@link #getDescriptionTerrain() <em>Description Terrain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionTerrain()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEnvironnementTerrainEtVegetationDescriptionTerrain descriptionTerrain = DESCRIPTION_TERRAIN_EDEFAULT;

	/**
	 * This is true if the Description Terrain attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean descriptionTerrainESet;

	/**
	 * The default value of the '{@link #getDescriptionVegetation() <em>Description Vegetation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionVegetation()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEnvironnementTerrainEtVegetationDescriptionVegetation DESCRIPTION_VEGETATION_EDEFAULT = TypeDictionaryDicoEnvironnementTerrainEtVegetationDescriptionVegetation.BARE;

	/**
	 * The cached value of the '{@link #getDescriptionVegetation() <em>Description Vegetation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionVegetation()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEnvironnementTerrainEtVegetationDescriptionVegetation descriptionVegetation = DESCRIPTION_VEGETATION_EDEFAULT;

	/**
	 * This is true if the Description Vegetation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean descriptionVegetationESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeEnvironnementTerrainEtVegetationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEnvironnementTerrainEtVegetation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEnvironnementTerrainEtVegetationDescriptionTerrain getDescriptionTerrain() {
		return descriptionTerrain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptionTerrain(TypeDictionaryDicoEnvironnementTerrainEtVegetationDescriptionTerrain newDescriptionTerrain) {
		TypeDictionaryDicoEnvironnementTerrainEtVegetationDescriptionTerrain oldDescriptionTerrain = descriptionTerrain;
		descriptionTerrain = newDescriptionTerrain == null ? DESCRIPTION_TERRAIN_EDEFAULT : newDescriptionTerrain;
		boolean oldDescriptionTerrainESet = descriptionTerrainESet;
		descriptionTerrainESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ENVIRONNEMENT_TERRAIN_ET_VEGETATION__DESCRIPTION_TERRAIN, oldDescriptionTerrain, descriptionTerrain, !oldDescriptionTerrainESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDescriptionTerrain() {
		TypeDictionaryDicoEnvironnementTerrainEtVegetationDescriptionTerrain oldDescriptionTerrain = descriptionTerrain;
		boolean oldDescriptionTerrainESet = descriptionTerrainESet;
		descriptionTerrain = DESCRIPTION_TERRAIN_EDEFAULT;
		descriptionTerrainESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ENVIRONNEMENT_TERRAIN_ET_VEGETATION__DESCRIPTION_TERRAIN, oldDescriptionTerrain, DESCRIPTION_TERRAIN_EDEFAULT, oldDescriptionTerrainESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDescriptionTerrain() {
		return descriptionTerrainESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEnvironnementTerrainEtVegetationDescriptionVegetation getDescriptionVegetation() {
		return descriptionVegetation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptionVegetation(TypeDictionaryDicoEnvironnementTerrainEtVegetationDescriptionVegetation newDescriptionVegetation) {
		TypeDictionaryDicoEnvironnementTerrainEtVegetationDescriptionVegetation oldDescriptionVegetation = descriptionVegetation;
		descriptionVegetation = newDescriptionVegetation == null ? DESCRIPTION_VEGETATION_EDEFAULT : newDescriptionVegetation;
		boolean oldDescriptionVegetationESet = descriptionVegetationESet;
		descriptionVegetationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ENVIRONNEMENT_TERRAIN_ET_VEGETATION__DESCRIPTION_VEGETATION, oldDescriptionVegetation, descriptionVegetation, !oldDescriptionVegetationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDescriptionVegetation() {
		TypeDictionaryDicoEnvironnementTerrainEtVegetationDescriptionVegetation oldDescriptionVegetation = descriptionVegetation;
		boolean oldDescriptionVegetationESet = descriptionVegetationESet;
		descriptionVegetation = DESCRIPTION_VEGETATION_EDEFAULT;
		descriptionVegetationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ENVIRONNEMENT_TERRAIN_ET_VEGETATION__DESCRIPTION_VEGETATION, oldDescriptionVegetation, DESCRIPTION_VEGETATION_EDEFAULT, oldDescriptionVegetationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDescriptionVegetation() {
		return descriptionVegetationESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ENVIRONNEMENT_TERRAIN_ET_VEGETATION__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ENVIRONNEMENT_TERRAIN_ET_VEGETATION__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_ENVIRONNEMENT_TERRAIN_ET_VEGETATION__DESCRIPTION_TERRAIN:
				return getDescriptionTerrain();
			case SchemaPackage.TYPE_ENVIRONNEMENT_TERRAIN_ET_VEGETATION__DESCRIPTION_VEGETATION:
				return getDescriptionVegetation();
			case SchemaPackage.TYPE_ENVIRONNEMENT_TERRAIN_ET_VEGETATION__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ENVIRONNEMENT_TERRAIN_ET_VEGETATION__CE:
				return getCE();
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
			case SchemaPackage.TYPE_ENVIRONNEMENT_TERRAIN_ET_VEGETATION__DESCRIPTION_TERRAIN:
				setDescriptionTerrain((TypeDictionaryDicoEnvironnementTerrainEtVegetationDescriptionTerrain)newValue);
				return;
			case SchemaPackage.TYPE_ENVIRONNEMENT_TERRAIN_ET_VEGETATION__DESCRIPTION_VEGETATION:
				setDescriptionVegetation((TypeDictionaryDicoEnvironnementTerrainEtVegetationDescriptionVegetation)newValue);
				return;
			case SchemaPackage.TYPE_ENVIRONNEMENT_TERRAIN_ET_VEGETATION__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ENVIRONNEMENT_TERRAIN_ET_VEGETATION__CE:
				setCE((String)newValue);
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
			case SchemaPackage.TYPE_ENVIRONNEMENT_TERRAIN_ET_VEGETATION__DESCRIPTION_TERRAIN:
				unsetDescriptionTerrain();
				return;
			case SchemaPackage.TYPE_ENVIRONNEMENT_TERRAIN_ET_VEGETATION__DESCRIPTION_VEGETATION:
				unsetDescriptionVegetation();
				return;
			case SchemaPackage.TYPE_ENVIRONNEMENT_TERRAIN_ET_VEGETATION__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ENVIRONNEMENT_TERRAIN_ET_VEGETATION__CE:
				setCE(CE_EDEFAULT);
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
			case SchemaPackage.TYPE_ENVIRONNEMENT_TERRAIN_ET_VEGETATION__DESCRIPTION_TERRAIN:
				return isSetDescriptionTerrain();
			case SchemaPackage.TYPE_ENVIRONNEMENT_TERRAIN_ET_VEGETATION__DESCRIPTION_VEGETATION:
				return isSetDescriptionVegetation();
			case SchemaPackage.TYPE_ENVIRONNEMENT_TERRAIN_ET_VEGETATION__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ENVIRONNEMENT_TERRAIN_ET_VEGETATION__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
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
		result.append(" (descriptionTerrain: ");
		if (descriptionTerrainESet) result.append(descriptionTerrain); else result.append("<unset>");
		result.append(", descriptionVegetation: ");
		if (descriptionVegetationESet) result.append(descriptionVegetation); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeEnvironnementTerrainEtVegetationImpl
