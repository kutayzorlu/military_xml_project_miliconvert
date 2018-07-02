/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeActionGenieENI;
import mpia.schema.TypeDictionaryDicoActionGenieENITypeMissionPossible;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Action Genie ENI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeActionGenieENIImpl#getTypeUniteENI <em>Type Unite ENI</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActionGenieENIImpl#getTypeMissionPossible <em>Type Mission Possible</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActionGenieENIImpl#getComplement <em>Complement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActionGenieENIImpl#getACommeZoneApplicationAutreElementControle <em>AComme Zone Application Autre Element Controle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeActionGenieENIImpl extends EObjectImpl implements TypeActionGenieENI {
	/**
	 * The default value of the '{@link #getTypeUniteENI() <em>Type Unite ENI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeUniteENI()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_UNITE_ENI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeUniteENI() <em>Type Unite ENI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeUniteENI()
	 * @generated
	 * @ordered
	 */
	protected String typeUniteENI = TYPE_UNITE_ENI_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeMissionPossible() <em>Type Mission Possible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMissionPossible()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoActionGenieENITypeMissionPossible TYPE_MISSION_POSSIBLE_EDEFAULT = TypeDictionaryDicoActionGenieENITypeMissionPossible.SAPR;

	/**
	 * The cached value of the '{@link #getTypeMissionPossible() <em>Type Mission Possible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMissionPossible()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoActionGenieENITypeMissionPossible typeMissionPossible = TYPE_MISSION_POSSIBLE_EDEFAULT;

	/**
	 * This is true if the Type Mission Possible attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeMissionPossibleESet;

	/**
	 * The default value of the '{@link #getComplement() <em>Complement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplement()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPLEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComplement() <em>Complement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplement()
	 * @generated
	 * @ordered
	 */
	protected String complement = COMPLEMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getACommeZoneApplicationAutreElementControle() <em>AComme Zone Application Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeZoneApplicationAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aCommeZoneApplicationAutreElementControle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeActionGenieENIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeActionGenieENI();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeUniteENI() {
		return typeUniteENI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeUniteENI(String newTypeUniteENI) {
		String oldTypeUniteENI = typeUniteENI;
		typeUniteENI = newTypeUniteENI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTION_GENIE_ENI__TYPE_UNITE_ENI, oldTypeUniteENI, typeUniteENI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoActionGenieENITypeMissionPossible getTypeMissionPossible() {
		return typeMissionPossible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeMissionPossible(TypeDictionaryDicoActionGenieENITypeMissionPossible newTypeMissionPossible) {
		TypeDictionaryDicoActionGenieENITypeMissionPossible oldTypeMissionPossible = typeMissionPossible;
		typeMissionPossible = newTypeMissionPossible == null ? TYPE_MISSION_POSSIBLE_EDEFAULT : newTypeMissionPossible;
		boolean oldTypeMissionPossibleESet = typeMissionPossibleESet;
		typeMissionPossibleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTION_GENIE_ENI__TYPE_MISSION_POSSIBLE, oldTypeMissionPossible, typeMissionPossible, !oldTypeMissionPossibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeMissionPossible() {
		TypeDictionaryDicoActionGenieENITypeMissionPossible oldTypeMissionPossible = typeMissionPossible;
		boolean oldTypeMissionPossibleESet = typeMissionPossibleESet;
		typeMissionPossible = TYPE_MISSION_POSSIBLE_EDEFAULT;
		typeMissionPossibleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ACTION_GENIE_ENI__TYPE_MISSION_POSSIBLE, oldTypeMissionPossible, TYPE_MISSION_POSSIBLE_EDEFAULT, oldTypeMissionPossibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeMissionPossible() {
		return typeMissionPossibleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComplement() {
		return complement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplement(String newComplement) {
		String oldComplement = complement;
		complement = newComplement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTION_GENIE_ENI__COMPLEMENT, oldComplement, complement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getACommeZoneApplicationAutreElementControle() {
		return aCommeZoneApplicationAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommeZoneApplicationAutreElementControle(TypeAssociation newACommeZoneApplicationAutreElementControle, NotificationChain msgs) {
		TypeAssociation oldACommeZoneApplicationAutreElementControle = aCommeZoneApplicationAutreElementControle;
		aCommeZoneApplicationAutreElementControle = newACommeZoneApplicationAutreElementControle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTION_GENIE_ENI__ACOMME_ZONE_APPLICATION_AUTRE_ELEMENT_CONTROLE, oldACommeZoneApplicationAutreElementControle, newACommeZoneApplicationAutreElementControle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommeZoneApplicationAutreElementControle(TypeAssociation newACommeZoneApplicationAutreElementControle) {
		if (newACommeZoneApplicationAutreElementControle != aCommeZoneApplicationAutreElementControle) {
			NotificationChain msgs = null;
			if (aCommeZoneApplicationAutreElementControle != null)
				msgs = ((InternalEObject)aCommeZoneApplicationAutreElementControle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ACTION_GENIE_ENI__ACOMME_ZONE_APPLICATION_AUTRE_ELEMENT_CONTROLE, null, msgs);
			if (newACommeZoneApplicationAutreElementControle != null)
				msgs = ((InternalEObject)newACommeZoneApplicationAutreElementControle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ACTION_GENIE_ENI__ACOMME_ZONE_APPLICATION_AUTRE_ELEMENT_CONTROLE, null, msgs);
			msgs = basicSetACommeZoneApplicationAutreElementControle(newACommeZoneApplicationAutreElementControle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTION_GENIE_ENI__ACOMME_ZONE_APPLICATION_AUTRE_ELEMENT_CONTROLE, newACommeZoneApplicationAutreElementControle, newACommeZoneApplicationAutreElementControle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ACTION_GENIE_ENI__ACOMME_ZONE_APPLICATION_AUTRE_ELEMENT_CONTROLE:
				return basicSetACommeZoneApplicationAutreElementControle(null, msgs);
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
			case SchemaPackage.TYPE_ACTION_GENIE_ENI__TYPE_UNITE_ENI:
				return getTypeUniteENI();
			case SchemaPackage.TYPE_ACTION_GENIE_ENI__TYPE_MISSION_POSSIBLE:
				return getTypeMissionPossible();
			case SchemaPackage.TYPE_ACTION_GENIE_ENI__COMPLEMENT:
				return getComplement();
			case SchemaPackage.TYPE_ACTION_GENIE_ENI__ACOMME_ZONE_APPLICATION_AUTRE_ELEMENT_CONTROLE:
				return getACommeZoneApplicationAutreElementControle();
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
			case SchemaPackage.TYPE_ACTION_GENIE_ENI__TYPE_UNITE_ENI:
				setTypeUniteENI((String)newValue);
				return;
			case SchemaPackage.TYPE_ACTION_GENIE_ENI__TYPE_MISSION_POSSIBLE:
				setTypeMissionPossible((TypeDictionaryDicoActionGenieENITypeMissionPossible)newValue);
				return;
			case SchemaPackage.TYPE_ACTION_GENIE_ENI__COMPLEMENT:
				setComplement((String)newValue);
				return;
			case SchemaPackage.TYPE_ACTION_GENIE_ENI__ACOMME_ZONE_APPLICATION_AUTRE_ELEMENT_CONTROLE:
				setACommeZoneApplicationAutreElementControle((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ACTION_GENIE_ENI__TYPE_UNITE_ENI:
				setTypeUniteENI(TYPE_UNITE_ENI_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ACTION_GENIE_ENI__TYPE_MISSION_POSSIBLE:
				unsetTypeMissionPossible();
				return;
			case SchemaPackage.TYPE_ACTION_GENIE_ENI__COMPLEMENT:
				setComplement(COMPLEMENT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ACTION_GENIE_ENI__ACOMME_ZONE_APPLICATION_AUTRE_ELEMENT_CONTROLE:
				setACommeZoneApplicationAutreElementControle((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ACTION_GENIE_ENI__TYPE_UNITE_ENI:
				return TYPE_UNITE_ENI_EDEFAULT == null ? typeUniteENI != null : !TYPE_UNITE_ENI_EDEFAULT.equals(typeUniteENI);
			case SchemaPackage.TYPE_ACTION_GENIE_ENI__TYPE_MISSION_POSSIBLE:
				return isSetTypeMissionPossible();
			case SchemaPackage.TYPE_ACTION_GENIE_ENI__COMPLEMENT:
				return COMPLEMENT_EDEFAULT == null ? complement != null : !COMPLEMENT_EDEFAULT.equals(complement);
			case SchemaPackage.TYPE_ACTION_GENIE_ENI__ACOMME_ZONE_APPLICATION_AUTRE_ELEMENT_CONTROLE:
				return aCommeZoneApplicationAutreElementControle != null;
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
		result.append(" (typeUniteENI: ");
		result.append(typeUniteENI);
		result.append(", typeMissionPossible: ");
		if (typeMissionPossibleESet) result.append(typeMissionPossible); else result.append("<unset>");
		result.append(", complement: ");
		result.append(complement);
		result.append(')');
		return result.toString();
	}

} //TypeActionGenieENIImpl
