/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoTypeIntervenant3D;
import mpia.schema.TypeTypeIntervenant3D;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Type Intervenant3 D</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeTypeIntervenant3DImpl#getTypeIntervenant3D <em>Type Intervenant3 D</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeIntervenant3DImpl#getAutreTypeIntervenant3D <em>Autre Type Intervenant3 D</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeIntervenant3DImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeIntervenant3DImpl#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeTypeIntervenant3DImpl extends EObjectImpl implements TypeTypeIntervenant3D {
	/**
	 * The default value of the '{@link #getTypeIntervenant3D() <em>Type Intervenant3 D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeIntervenant3D()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeIntervenant3D TYPE_INTERVENANT3_D_EDEFAULT = TypeDictionaryDicoTypeIntervenant3D.ADA;

	/**
	 * The cached value of the '{@link #getTypeIntervenant3D() <em>Type Intervenant3 D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeIntervenant3D()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeIntervenant3D typeIntervenant3D = TYPE_INTERVENANT3_D_EDEFAULT;

	/**
	 * This is true if the Type Intervenant3 D attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeIntervenant3DESet;

	/**
	 * The default value of the '{@link #getAutreTypeIntervenant3D() <em>Autre Type Intervenant3 D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutreTypeIntervenant3D()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTRE_TYPE_INTERVENANT3_D_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutreTypeIntervenant3D() <em>Autre Type Intervenant3 D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutreTypeIntervenant3D()
	 * @generated
	 * @ordered
	 */
	protected String autreTypeIntervenant3D = AUTRE_TYPE_INTERVENANT3_D_EDEFAULT;

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
	protected TypeTypeIntervenant3DImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeTypeIntervenant3D();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeIntervenant3D getTypeIntervenant3D() {
		return typeIntervenant3D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeIntervenant3D(TypeDictionaryDicoTypeIntervenant3D newTypeIntervenant3D) {
		TypeDictionaryDicoTypeIntervenant3D oldTypeIntervenant3D = typeIntervenant3D;
		typeIntervenant3D = newTypeIntervenant3D == null ? TYPE_INTERVENANT3_D_EDEFAULT : newTypeIntervenant3D;
		boolean oldTypeIntervenant3DESet = typeIntervenant3DESet;
		typeIntervenant3DESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_INTERVENANT3_D__TYPE_INTERVENANT3_D, oldTypeIntervenant3D, typeIntervenant3D, !oldTypeIntervenant3DESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeIntervenant3D() {
		TypeDictionaryDicoTypeIntervenant3D oldTypeIntervenant3D = typeIntervenant3D;
		boolean oldTypeIntervenant3DESet = typeIntervenant3DESet;
		typeIntervenant3D = TYPE_INTERVENANT3_D_EDEFAULT;
		typeIntervenant3DESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_INTERVENANT3_D__TYPE_INTERVENANT3_D, oldTypeIntervenant3D, TYPE_INTERVENANT3_D_EDEFAULT, oldTypeIntervenant3DESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeIntervenant3D() {
		return typeIntervenant3DESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAutreTypeIntervenant3D() {
		return autreTypeIntervenant3D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutreTypeIntervenant3D(String newAutreTypeIntervenant3D) {
		String oldAutreTypeIntervenant3D = autreTypeIntervenant3D;
		autreTypeIntervenant3D = newAutreTypeIntervenant3D;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_INTERVENANT3_D__AUTRE_TYPE_INTERVENANT3_D, oldAutreTypeIntervenant3D, autreTypeIntervenant3D));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_INTERVENANT3_D__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_INTERVENANT3_D__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_TYPE_INTERVENANT3_D__TYPE_INTERVENANT3_D:
				return getTypeIntervenant3D();
			case SchemaPackage.TYPE_TYPE_INTERVENANT3_D__AUTRE_TYPE_INTERVENANT3_D:
				return getAutreTypeIntervenant3D();
			case SchemaPackage.TYPE_TYPE_INTERVENANT3_D__CTE:
				return getCTE();
			case SchemaPackage.TYPE_TYPE_INTERVENANT3_D__CE:
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
			case SchemaPackage.TYPE_TYPE_INTERVENANT3_D__TYPE_INTERVENANT3_D:
				setTypeIntervenant3D((TypeDictionaryDicoTypeIntervenant3D)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_INTERVENANT3_D__AUTRE_TYPE_INTERVENANT3_D:
				setAutreTypeIntervenant3D((String)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_INTERVENANT3_D__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_INTERVENANT3_D__CE:
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
			case SchemaPackage.TYPE_TYPE_INTERVENANT3_D__TYPE_INTERVENANT3_D:
				unsetTypeIntervenant3D();
				return;
			case SchemaPackage.TYPE_TYPE_INTERVENANT3_D__AUTRE_TYPE_INTERVENANT3_D:
				setAutreTypeIntervenant3D(AUTRE_TYPE_INTERVENANT3_D_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TYPE_INTERVENANT3_D__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TYPE_INTERVENANT3_D__CE:
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
			case SchemaPackage.TYPE_TYPE_INTERVENANT3_D__TYPE_INTERVENANT3_D:
				return isSetTypeIntervenant3D();
			case SchemaPackage.TYPE_TYPE_INTERVENANT3_D__AUTRE_TYPE_INTERVENANT3_D:
				return AUTRE_TYPE_INTERVENANT3_D_EDEFAULT == null ? autreTypeIntervenant3D != null : !AUTRE_TYPE_INTERVENANT3_D_EDEFAULT.equals(autreTypeIntervenant3D);
			case SchemaPackage.TYPE_TYPE_INTERVENANT3_D__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_TYPE_INTERVENANT3_D__CE:
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
		result.append(" (typeIntervenant3D: ");
		if (typeIntervenant3DESet) result.append(typeIntervenant3D); else result.append("<unset>");
		result.append(", autreTypeIntervenant3D: ");
		result.append(autreTypeIntervenant3D);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeTypeIntervenant3DImpl
