/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCaracteristiqueComplementaireObstacle;
import mpia.schema.TypeDictionaryDicoCaracteristiqueComplementaireObstacleCaracteristique;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Caracteristique Complementaire Obstacle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeCaracteristiqueComplementaireObstacleImpl#getCaracteristique <em>Caracteristique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCaracteristiqueComplementaireObstacleImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCaracteristiqueComplementaireObstacleImpl#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeCaracteristiqueComplementaireObstacleImpl extends EObjectImpl implements TypeCaracteristiqueComplementaireObstacle {
	/**
	 * The default value of the '{@link #getCaracteristique() <em>Caracteristique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaracteristique()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCaracteristiqueComplementaireObstacleCaracteristique CARACTERISTIQUE_EDEFAULT = TypeDictionaryDicoCaracteristiqueComplementaireObstacleCaracteristique.IMP;

	/**
	 * The cached value of the '{@link #getCaracteristique() <em>Caracteristique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaracteristique()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCaracteristiqueComplementaireObstacleCaracteristique caracteristique = CARACTERISTIQUE_EDEFAULT;

	/**
	 * This is true if the Caracteristique attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean caracteristiqueESet;

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
	protected TypeCaracteristiqueComplementaireObstacleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeCaracteristiqueComplementaireObstacle();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoCaracteristiqueComplementaireObstacleCaracteristique getCaracteristique() {
		return caracteristique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaracteristique(TypeDictionaryDicoCaracteristiqueComplementaireObstacleCaracteristique newCaracteristique) {
		TypeDictionaryDicoCaracteristiqueComplementaireObstacleCaracteristique oldCaracteristique = caracteristique;
		caracteristique = newCaracteristique == null ? CARACTERISTIQUE_EDEFAULT : newCaracteristique;
		boolean oldCaracteristiqueESet = caracteristiqueESet;
		caracteristiqueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUE_COMPLEMENTAIRE_OBSTACLE__CARACTERISTIQUE, oldCaracteristique, caracteristique, !oldCaracteristiqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCaracteristique() {
		TypeDictionaryDicoCaracteristiqueComplementaireObstacleCaracteristique oldCaracteristique = caracteristique;
		boolean oldCaracteristiqueESet = caracteristiqueESet;
		caracteristique = CARACTERISTIQUE_EDEFAULT;
		caracteristiqueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CARACTERISTIQUE_COMPLEMENTAIRE_OBSTACLE__CARACTERISTIQUE, oldCaracteristique, CARACTERISTIQUE_EDEFAULT, oldCaracteristiqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCaracteristique() {
		return caracteristiqueESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUE_COMPLEMENTAIRE_OBSTACLE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUE_COMPLEMENTAIRE_OBSTACLE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_CARACTERISTIQUE_COMPLEMENTAIRE_OBSTACLE__CARACTERISTIQUE:
				return getCaracteristique();
			case SchemaPackage.TYPE_CARACTERISTIQUE_COMPLEMENTAIRE_OBSTACLE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_CARACTERISTIQUE_COMPLEMENTAIRE_OBSTACLE__CE:
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
			case SchemaPackage.TYPE_CARACTERISTIQUE_COMPLEMENTAIRE_OBSTACLE__CARACTERISTIQUE:
				setCaracteristique((TypeDictionaryDicoCaracteristiqueComplementaireObstacleCaracteristique)newValue);
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUE_COMPLEMENTAIRE_OBSTACLE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUE_COMPLEMENTAIRE_OBSTACLE__CE:
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
			case SchemaPackage.TYPE_CARACTERISTIQUE_COMPLEMENTAIRE_OBSTACLE__CARACTERISTIQUE:
				unsetCaracteristique();
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUE_COMPLEMENTAIRE_OBSTACLE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUE_COMPLEMENTAIRE_OBSTACLE__CE:
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
			case SchemaPackage.TYPE_CARACTERISTIQUE_COMPLEMENTAIRE_OBSTACLE__CARACTERISTIQUE:
				return isSetCaracteristique();
			case SchemaPackage.TYPE_CARACTERISTIQUE_COMPLEMENTAIRE_OBSTACLE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_CARACTERISTIQUE_COMPLEMENTAIRE_OBSTACLE__CE:
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
		result.append(" (caracteristique: ");
		if (caracteristiqueESet) result.append(caracteristique); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeCaracteristiqueComplementaireObstacleImpl
