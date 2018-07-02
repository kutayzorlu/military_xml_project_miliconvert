/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoModaliteTransfertAutoriteASSTypeAppuiASS;
import mpia.schema.TypeModaliteTransfertAutoriteASS;
import mpia.schema.TypeTypeRepartition;

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
 * An implementation of the model object '<em><b>Type Modalite Transfert Autorite ASS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeModaliteTransfertAutoriteASSImpl#getTypeAppuiASS <em>Type Appui ASS</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModaliteTransfertAutoriteASSImpl#getDisposeTypeRepartition <em>Dispose Type Repartition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeModaliteTransfertAutoriteASSImpl extends EObjectImpl implements TypeModaliteTransfertAutoriteASS {
	/**
	 * The default value of the '{@link #getTypeAppuiASS() <em>Type Appui ASS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAppuiASS()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoModaliteTransfertAutoriteASSTypeAppuiASS TYPE_APPUI_ASS_EDEFAULT = TypeDictionaryDicoModaliteTransfertAutoriteASSTypeAppuiASS.DSR;

	/**
	 * The cached value of the '{@link #getTypeAppuiASS() <em>Type Appui ASS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAppuiASS()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoModaliteTransfertAutoriteASSTypeAppuiASS typeAppuiASS = TYPE_APPUI_ASS_EDEFAULT;

	/**
	 * This is true if the Type Appui ASS attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeAppuiASSESet;

	/**
	 * The cached value of the '{@link #getDisposeTypeRepartition() <em>Dispose Type Repartition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisposeTypeRepartition()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeTypeRepartition> disposeTypeRepartition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeModaliteTransfertAutoriteASSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeModaliteTransfertAutoriteASS();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoModaliteTransfertAutoriteASSTypeAppuiASS getTypeAppuiASS() {
		return typeAppuiASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeAppuiASS(TypeDictionaryDicoModaliteTransfertAutoriteASSTypeAppuiASS newTypeAppuiASS) {
		TypeDictionaryDicoModaliteTransfertAutoriteASSTypeAppuiASS oldTypeAppuiASS = typeAppuiASS;
		typeAppuiASS = newTypeAppuiASS == null ? TYPE_APPUI_ASS_EDEFAULT : newTypeAppuiASS;
		boolean oldTypeAppuiASSESet = typeAppuiASSESet;
		typeAppuiASSESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITE_TRANSFERT_AUTORITE_ASS__TYPE_APPUI_ASS, oldTypeAppuiASS, typeAppuiASS, !oldTypeAppuiASSESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeAppuiASS() {
		TypeDictionaryDicoModaliteTransfertAutoriteASSTypeAppuiASS oldTypeAppuiASS = typeAppuiASS;
		boolean oldTypeAppuiASSESet = typeAppuiASSESet;
		typeAppuiASS = TYPE_APPUI_ASS_EDEFAULT;
		typeAppuiASSESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MODALITE_TRANSFERT_AUTORITE_ASS__TYPE_APPUI_ASS, oldTypeAppuiASS, TYPE_APPUI_ASS_EDEFAULT, oldTypeAppuiASSESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeAppuiASS() {
		return typeAppuiASSESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeTypeRepartition> getDisposeTypeRepartition() {
		if (disposeTypeRepartition == null) {
			disposeTypeRepartition = new EObjectContainmentEList<TypeTypeRepartition>(TypeTypeRepartition.class, this, SchemaPackage.TYPE_MODALITE_TRANSFERT_AUTORITE_ASS__DISPOSE_TYPE_REPARTITION);
		}
		return disposeTypeRepartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MODALITE_TRANSFERT_AUTORITE_ASS__DISPOSE_TYPE_REPARTITION:
				return ((InternalEList<?>)getDisposeTypeRepartition()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_MODALITE_TRANSFERT_AUTORITE_ASS__TYPE_APPUI_ASS:
				return getTypeAppuiASS();
			case SchemaPackage.TYPE_MODALITE_TRANSFERT_AUTORITE_ASS__DISPOSE_TYPE_REPARTITION:
				return getDisposeTypeRepartition();
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
			case SchemaPackage.TYPE_MODALITE_TRANSFERT_AUTORITE_ASS__TYPE_APPUI_ASS:
				setTypeAppuiASS((TypeDictionaryDicoModaliteTransfertAutoriteASSTypeAppuiASS)newValue);
				return;
			case SchemaPackage.TYPE_MODALITE_TRANSFERT_AUTORITE_ASS__DISPOSE_TYPE_REPARTITION:
				getDisposeTypeRepartition().clear();
				getDisposeTypeRepartition().addAll((Collection<? extends TypeTypeRepartition>)newValue);
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
			case SchemaPackage.TYPE_MODALITE_TRANSFERT_AUTORITE_ASS__TYPE_APPUI_ASS:
				unsetTypeAppuiASS();
				return;
			case SchemaPackage.TYPE_MODALITE_TRANSFERT_AUTORITE_ASS__DISPOSE_TYPE_REPARTITION:
				getDisposeTypeRepartition().clear();
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
			case SchemaPackage.TYPE_MODALITE_TRANSFERT_AUTORITE_ASS__TYPE_APPUI_ASS:
				return isSetTypeAppuiASS();
			case SchemaPackage.TYPE_MODALITE_TRANSFERT_AUTORITE_ASS__DISPOSE_TYPE_REPARTITION:
				return disposeTypeRepartition != null && !disposeTypeRepartition.isEmpty();
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
		result.append(" (typeAppuiASS: ");
		if (typeAppuiASSESet) result.append(typeAppuiASS); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeModaliteTransfertAutoriteASSImpl
