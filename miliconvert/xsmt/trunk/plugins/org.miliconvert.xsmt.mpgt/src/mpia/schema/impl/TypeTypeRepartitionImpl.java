/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoConsommationAlloueeTypeRepartitionMunitions;
import mpia.schema.TypeTypeRepartition;
import mpia.schema.TypeVolumeMunitionsASS;

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
 * An implementation of the model object '<em><b>Type Type Repartition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeTypeRepartitionImpl#getTypeRepartitionMunitions <em>Type Repartition Munitions</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeRepartitionImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeRepartitionImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeRepartitionImpl#getACommeMunitionsAlloueeVolumeMunitionsASS <em>AComme Munitions Allouee Volume Munitions ASS</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeTypeRepartitionImpl extends EObjectImpl implements TypeTypeRepartition {
	/**
	 * The default value of the '{@link #getTypeRepartitionMunitions() <em>Type Repartition Munitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeRepartitionMunitions()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoConsommationAlloueeTypeRepartitionMunitions TYPE_REPARTITION_MUNITIONS_EDEFAULT = TypeDictionaryDicoConsommationAlloueeTypeRepartitionMunitions.PLAN;

	/**
	 * The cached value of the '{@link #getTypeRepartitionMunitions() <em>Type Repartition Munitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeRepartitionMunitions()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoConsommationAlloueeTypeRepartitionMunitions typeRepartitionMunitions = TYPE_REPARTITION_MUNITIONS_EDEFAULT;

	/**
	 * This is true if the Type Repartition Munitions attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeRepartitionMunitionsESet;

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
	 * The cached value of the '{@link #getACommeMunitionsAlloueeVolumeMunitionsASS() <em>AComme Munitions Allouee Volume Munitions ASS</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeMunitionsAlloueeVolumeMunitionsASS()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeVolumeMunitionsASS> aCommeMunitionsAlloueeVolumeMunitionsASS;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeTypeRepartitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeTypeRepartition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoConsommationAlloueeTypeRepartitionMunitions getTypeRepartitionMunitions() {
		return typeRepartitionMunitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeRepartitionMunitions(TypeDictionaryDicoConsommationAlloueeTypeRepartitionMunitions newTypeRepartitionMunitions) {
		TypeDictionaryDicoConsommationAlloueeTypeRepartitionMunitions oldTypeRepartitionMunitions = typeRepartitionMunitions;
		typeRepartitionMunitions = newTypeRepartitionMunitions == null ? TYPE_REPARTITION_MUNITIONS_EDEFAULT : newTypeRepartitionMunitions;
		boolean oldTypeRepartitionMunitionsESet = typeRepartitionMunitionsESet;
		typeRepartitionMunitionsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_REPARTITION__TYPE_REPARTITION_MUNITIONS, oldTypeRepartitionMunitions, typeRepartitionMunitions, !oldTypeRepartitionMunitionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeRepartitionMunitions() {
		TypeDictionaryDicoConsommationAlloueeTypeRepartitionMunitions oldTypeRepartitionMunitions = typeRepartitionMunitions;
		boolean oldTypeRepartitionMunitionsESet = typeRepartitionMunitionsESet;
		typeRepartitionMunitions = TYPE_REPARTITION_MUNITIONS_EDEFAULT;
		typeRepartitionMunitionsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_REPARTITION__TYPE_REPARTITION_MUNITIONS, oldTypeRepartitionMunitions, TYPE_REPARTITION_MUNITIONS_EDEFAULT, oldTypeRepartitionMunitionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeRepartitionMunitions() {
		return typeRepartitionMunitionsESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_REPARTITION__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_REPARTITION__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeVolumeMunitionsASS> getACommeMunitionsAlloueeVolumeMunitionsASS() {
		if (aCommeMunitionsAlloueeVolumeMunitionsASS == null) {
			aCommeMunitionsAlloueeVolumeMunitionsASS = new EObjectContainmentEList<TypeVolumeMunitionsASS>(TypeVolumeMunitionsASS.class, this, SchemaPackage.TYPE_TYPE_REPARTITION__ACOMME_MUNITIONS_ALLOUEE_VOLUME_MUNITIONS_ASS);
		}
		return aCommeMunitionsAlloueeVolumeMunitionsASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_TYPE_REPARTITION__ACOMME_MUNITIONS_ALLOUEE_VOLUME_MUNITIONS_ASS:
				return ((InternalEList<?>)getACommeMunitionsAlloueeVolumeMunitionsASS()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_TYPE_REPARTITION__TYPE_REPARTITION_MUNITIONS:
				return getTypeRepartitionMunitions();
			case SchemaPackage.TYPE_TYPE_REPARTITION__CTE:
				return getCTE();
			case SchemaPackage.TYPE_TYPE_REPARTITION__CE:
				return getCE();
			case SchemaPackage.TYPE_TYPE_REPARTITION__ACOMME_MUNITIONS_ALLOUEE_VOLUME_MUNITIONS_ASS:
				return getACommeMunitionsAlloueeVolumeMunitionsASS();
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
			case SchemaPackage.TYPE_TYPE_REPARTITION__TYPE_REPARTITION_MUNITIONS:
				setTypeRepartitionMunitions((TypeDictionaryDicoConsommationAlloueeTypeRepartitionMunitions)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_REPARTITION__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_REPARTITION__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_REPARTITION__ACOMME_MUNITIONS_ALLOUEE_VOLUME_MUNITIONS_ASS:
				getACommeMunitionsAlloueeVolumeMunitionsASS().clear();
				getACommeMunitionsAlloueeVolumeMunitionsASS().addAll((Collection<? extends TypeVolumeMunitionsASS>)newValue);
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
			case SchemaPackage.TYPE_TYPE_REPARTITION__TYPE_REPARTITION_MUNITIONS:
				unsetTypeRepartitionMunitions();
				return;
			case SchemaPackage.TYPE_TYPE_REPARTITION__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TYPE_REPARTITION__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TYPE_REPARTITION__ACOMME_MUNITIONS_ALLOUEE_VOLUME_MUNITIONS_ASS:
				getACommeMunitionsAlloueeVolumeMunitionsASS().clear();
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
			case SchemaPackage.TYPE_TYPE_REPARTITION__TYPE_REPARTITION_MUNITIONS:
				return isSetTypeRepartitionMunitions();
			case SchemaPackage.TYPE_TYPE_REPARTITION__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_TYPE_REPARTITION__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_TYPE_REPARTITION__ACOMME_MUNITIONS_ALLOUEE_VOLUME_MUNITIONS_ASS:
				return aCommeMunitionsAlloueeVolumeMunitionsASS != null && !aCommeMunitionsAlloueeVolumeMunitionsASS.isEmpty();
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
		result.append(" (typeRepartitionMunitions: ");
		if (typeRepartitionMunitionsESet) result.append(typeRepartitionMunitions); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeTypeRepartitionImpl
