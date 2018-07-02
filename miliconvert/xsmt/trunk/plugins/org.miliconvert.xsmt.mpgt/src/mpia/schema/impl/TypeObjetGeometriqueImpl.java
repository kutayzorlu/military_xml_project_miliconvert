/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoDistanceVerticaleReference;
import mpia.schema.TypeObjetGeometrique;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Objet Geometrique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeObjetGeometriqueImpl#getReferenceDistancesVerticales <em>Reference Distances Verticales</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypeObjetGeometriqueImpl extends EObjectImpl implements TypeObjetGeometrique {
	/**
	 * The default value of the '{@link #getReferenceDistancesVerticales() <em>Reference Distances Verticales</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceDistancesVerticales()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoDistanceVerticaleReference REFERENCE_DISTANCES_VERTICALES_EDEFAULT = TypeDictionaryDicoDistanceVerticaleReference.CHADAT;

	/**
	 * The cached value of the '{@link #getReferenceDistancesVerticales() <em>Reference Distances Verticales</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceDistancesVerticales()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoDistanceVerticaleReference referenceDistancesVerticales = REFERENCE_DISTANCES_VERTICALES_EDEFAULT;

	/**
	 * This is true if the Reference Distances Verticales attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean referenceDistancesVerticalesESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeObjetGeometriqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeObjetGeometrique();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoDistanceVerticaleReference getReferenceDistancesVerticales() {
		return referenceDistancesVerticales;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceDistancesVerticales(TypeDictionaryDicoDistanceVerticaleReference newReferenceDistancesVerticales) {
		TypeDictionaryDicoDistanceVerticaleReference oldReferenceDistancesVerticales = referenceDistancesVerticales;
		referenceDistancesVerticales = newReferenceDistancesVerticales == null ? REFERENCE_DISTANCES_VERTICALES_EDEFAULT : newReferenceDistancesVerticales;
		boolean oldReferenceDistancesVerticalesESet = referenceDistancesVerticalesESet;
		referenceDistancesVerticalesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJET_GEOMETRIQUE__REFERENCE_DISTANCES_VERTICALES, oldReferenceDistancesVerticales, referenceDistancesVerticales, !oldReferenceDistancesVerticalesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReferenceDistancesVerticales() {
		TypeDictionaryDicoDistanceVerticaleReference oldReferenceDistancesVerticales = referenceDistancesVerticales;
		boolean oldReferenceDistancesVerticalesESet = referenceDistancesVerticalesESet;
		referenceDistancesVerticales = REFERENCE_DISTANCES_VERTICALES_EDEFAULT;
		referenceDistancesVerticalesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_OBJET_GEOMETRIQUE__REFERENCE_DISTANCES_VERTICALES, oldReferenceDistancesVerticales, REFERENCE_DISTANCES_VERTICALES_EDEFAULT, oldReferenceDistancesVerticalesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReferenceDistancesVerticales() {
		return referenceDistancesVerticalesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_OBJET_GEOMETRIQUE__REFERENCE_DISTANCES_VERTICALES:
				return getReferenceDistancesVerticales();
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
			case SchemaPackage.TYPE_OBJET_GEOMETRIQUE__REFERENCE_DISTANCES_VERTICALES:
				setReferenceDistancesVerticales((TypeDictionaryDicoDistanceVerticaleReference)newValue);
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
			case SchemaPackage.TYPE_OBJET_GEOMETRIQUE__REFERENCE_DISTANCES_VERTICALES:
				unsetReferenceDistancesVerticales();
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
			case SchemaPackage.TYPE_OBJET_GEOMETRIQUE__REFERENCE_DISTANCES_VERTICALES:
				return isSetReferenceDistancesVerticales();
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
		result.append(" (referenceDistancesVerticales: ");
		if (referenceDistancesVerticalesESet) result.append(referenceDistancesVerticales); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeObjetGeometriqueImpl
