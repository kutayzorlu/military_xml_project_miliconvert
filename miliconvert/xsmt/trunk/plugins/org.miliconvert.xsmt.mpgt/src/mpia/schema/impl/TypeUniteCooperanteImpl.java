/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoUniteCooperanteTypeConcours;
import mpia.schema.TypeUniteCooperante;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Unite Cooperante</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeUniteCooperanteImpl#getTypeConcours <em>Type Concours</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteCooperanteImpl#getTypeConcoursTextuel <em>Type Concours Textuel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteCooperanteImpl#getAPourUniteParticipanteUnite <em>APour Unite Participante Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeUniteCooperanteImpl extends EObjectImpl implements TypeUniteCooperante {
	/**
	 * The default value of the '{@link #getTypeConcours() <em>Type Concours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeConcours()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoUniteCooperanteTypeConcours TYPE_CONCOURS_EDEFAULT = TypeDictionaryDicoUniteCooperanteTypeConcours.SUPT;

	/**
	 * The cached value of the '{@link #getTypeConcours() <em>Type Concours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeConcours()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoUniteCooperanteTypeConcours typeConcours = TYPE_CONCOURS_EDEFAULT;

	/**
	 * This is true if the Type Concours attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeConcoursESet;

	/**
	 * The default value of the '{@link #getTypeConcoursTextuel() <em>Type Concours Textuel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeConcoursTextuel()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_CONCOURS_TEXTUEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeConcoursTextuel() <em>Type Concours Textuel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeConcoursTextuel()
	 * @generated
	 * @ordered
	 */
	protected String typeConcoursTextuel = TYPE_CONCOURS_TEXTUEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAPourUniteParticipanteUnite() <em>APour Unite Participante Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourUniteParticipanteUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aPourUniteParticipanteUnite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeUniteCooperanteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeUniteCooperante();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoUniteCooperanteTypeConcours getTypeConcours() {
		return typeConcours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeConcours(TypeDictionaryDicoUniteCooperanteTypeConcours newTypeConcours) {
		TypeDictionaryDicoUniteCooperanteTypeConcours oldTypeConcours = typeConcours;
		typeConcours = newTypeConcours == null ? TYPE_CONCOURS_EDEFAULT : newTypeConcours;
		boolean oldTypeConcoursESet = typeConcoursESet;
		typeConcoursESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE_COOPERANTE__TYPE_CONCOURS, oldTypeConcours, typeConcours, !oldTypeConcoursESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeConcours() {
		TypeDictionaryDicoUniteCooperanteTypeConcours oldTypeConcours = typeConcours;
		boolean oldTypeConcoursESet = typeConcoursESet;
		typeConcours = TYPE_CONCOURS_EDEFAULT;
		typeConcoursESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_UNITE_COOPERANTE__TYPE_CONCOURS, oldTypeConcours, TYPE_CONCOURS_EDEFAULT, oldTypeConcoursESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeConcours() {
		return typeConcoursESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeConcoursTextuel() {
		return typeConcoursTextuel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeConcoursTextuel(String newTypeConcoursTextuel) {
		String oldTypeConcoursTextuel = typeConcoursTextuel;
		typeConcoursTextuel = newTypeConcoursTextuel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE_COOPERANTE__TYPE_CONCOURS_TEXTUEL, oldTypeConcoursTextuel, typeConcoursTextuel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAPourUniteParticipanteUnite() {
		return aPourUniteParticipanteUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourUniteParticipanteUnite(TypeAssociationEXT newAPourUniteParticipanteUnite, NotificationChain msgs) {
		TypeAssociationEXT oldAPourUniteParticipanteUnite = aPourUniteParticipanteUnite;
		aPourUniteParticipanteUnite = newAPourUniteParticipanteUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE_COOPERANTE__APOUR_UNITE_PARTICIPANTE_UNITE, oldAPourUniteParticipanteUnite, newAPourUniteParticipanteUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourUniteParticipanteUnite(TypeAssociationEXT newAPourUniteParticipanteUnite) {
		if (newAPourUniteParticipanteUnite != aPourUniteParticipanteUnite) {
			NotificationChain msgs = null;
			if (aPourUniteParticipanteUnite != null)
				msgs = ((InternalEObject)aPourUniteParticipanteUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_UNITE_COOPERANTE__APOUR_UNITE_PARTICIPANTE_UNITE, null, msgs);
			if (newAPourUniteParticipanteUnite != null)
				msgs = ((InternalEObject)newAPourUniteParticipanteUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_UNITE_COOPERANTE__APOUR_UNITE_PARTICIPANTE_UNITE, null, msgs);
			msgs = basicSetAPourUniteParticipanteUnite(newAPourUniteParticipanteUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE_COOPERANTE__APOUR_UNITE_PARTICIPANTE_UNITE, newAPourUniteParticipanteUnite, newAPourUniteParticipanteUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_UNITE_COOPERANTE__APOUR_UNITE_PARTICIPANTE_UNITE:
				return basicSetAPourUniteParticipanteUnite(null, msgs);
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
			case SchemaPackage.TYPE_UNITE_COOPERANTE__TYPE_CONCOURS:
				return getTypeConcours();
			case SchemaPackage.TYPE_UNITE_COOPERANTE__TYPE_CONCOURS_TEXTUEL:
				return getTypeConcoursTextuel();
			case SchemaPackage.TYPE_UNITE_COOPERANTE__APOUR_UNITE_PARTICIPANTE_UNITE:
				return getAPourUniteParticipanteUnite();
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
			case SchemaPackage.TYPE_UNITE_COOPERANTE__TYPE_CONCOURS:
				setTypeConcours((TypeDictionaryDicoUniteCooperanteTypeConcours)newValue);
				return;
			case SchemaPackage.TYPE_UNITE_COOPERANTE__TYPE_CONCOURS_TEXTUEL:
				setTypeConcoursTextuel((String)newValue);
				return;
			case SchemaPackage.TYPE_UNITE_COOPERANTE__APOUR_UNITE_PARTICIPANTE_UNITE:
				setAPourUniteParticipanteUnite((TypeAssociationEXT)newValue);
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
			case SchemaPackage.TYPE_UNITE_COOPERANTE__TYPE_CONCOURS:
				unsetTypeConcours();
				return;
			case SchemaPackage.TYPE_UNITE_COOPERANTE__TYPE_CONCOURS_TEXTUEL:
				setTypeConcoursTextuel(TYPE_CONCOURS_TEXTUEL_EDEFAULT);
				return;
			case SchemaPackage.TYPE_UNITE_COOPERANTE__APOUR_UNITE_PARTICIPANTE_UNITE:
				setAPourUniteParticipanteUnite((TypeAssociationEXT)null);
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
			case SchemaPackage.TYPE_UNITE_COOPERANTE__TYPE_CONCOURS:
				return isSetTypeConcours();
			case SchemaPackage.TYPE_UNITE_COOPERANTE__TYPE_CONCOURS_TEXTUEL:
				return TYPE_CONCOURS_TEXTUEL_EDEFAULT == null ? typeConcoursTextuel != null : !TYPE_CONCOURS_TEXTUEL_EDEFAULT.equals(typeConcoursTextuel);
			case SchemaPackage.TYPE_UNITE_COOPERANTE__APOUR_UNITE_PARTICIPANTE_UNITE:
				return aPourUniteParticipanteUnite != null;
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
		result.append(" (typeConcours: ");
		if (typeConcoursESet) result.append(typeConcours); else result.append("<unset>");
		result.append(", typeConcoursTextuel: ");
		result.append(typeConcoursTextuel);
		result.append(')');
		return result.toString();
	}

} //TypeUniteCooperanteImpl
