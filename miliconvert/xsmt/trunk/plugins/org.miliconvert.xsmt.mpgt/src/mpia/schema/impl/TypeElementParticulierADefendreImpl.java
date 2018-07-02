/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoPriorite;
import mpia.schema.TypeElementParticulierADefendre;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Element Particulier ADefendre</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeElementParticulierADefendreImpl#getNatureElement <em>Nature Element</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeElementParticulierADefendreImpl#getPrioriteDefense <em>Priorite Defense</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeElementParticulierADefendreImpl#getACommeLocalisationAutreElementControle <em>AComme Localisation Autre Element Controle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeElementParticulierADefendreImpl extends EObjectImpl implements TypeElementParticulierADefendre {
	/**
	 * The default value of the '{@link #getNatureElement() <em>Nature Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatureElement()
	 * @generated
	 * @ordered
	 */
	protected static final String NATURE_ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNatureElement() <em>Nature Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatureElement()
	 * @generated
	 * @ordered
	 */
	protected String natureElement = NATURE_ELEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrioriteDefense() <em>Priorite Defense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrioriteDefense()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPriorite PRIORITE_DEFENSE_EDEFAULT = TypeDictionaryDicoPriorite._1;

	/**
	 * The cached value of the '{@link #getPrioriteDefense() <em>Priorite Defense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrioriteDefense()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPriorite prioriteDefense = PRIORITE_DEFENSE_EDEFAULT;

	/**
	 * This is true if the Priorite Defense attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean prioriteDefenseESet;

	/**
	 * The cached value of the '{@link #getACommeLocalisationAutreElementControle() <em>AComme Localisation Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeLocalisationAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aCommeLocalisationAutreElementControle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeElementParticulierADefendreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeElementParticulierADefendre();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNatureElement() {
		return natureElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNatureElement(String newNatureElement) {
		String oldNatureElement = natureElement;
		natureElement = newNatureElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ELEMENT_PARTICULIER_ADEFENDRE__NATURE_ELEMENT, oldNatureElement, natureElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoPriorite getPrioriteDefense() {
		return prioriteDefense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrioriteDefense(TypeDictionaryDicoPriorite newPrioriteDefense) {
		TypeDictionaryDicoPriorite oldPrioriteDefense = prioriteDefense;
		prioriteDefense = newPrioriteDefense == null ? PRIORITE_DEFENSE_EDEFAULT : newPrioriteDefense;
		boolean oldPrioriteDefenseESet = prioriteDefenseESet;
		prioriteDefenseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ELEMENT_PARTICULIER_ADEFENDRE__PRIORITE_DEFENSE, oldPrioriteDefense, prioriteDefense, !oldPrioriteDefenseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPrioriteDefense() {
		TypeDictionaryDicoPriorite oldPrioriteDefense = prioriteDefense;
		boolean oldPrioriteDefenseESet = prioriteDefenseESet;
		prioriteDefense = PRIORITE_DEFENSE_EDEFAULT;
		prioriteDefenseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ELEMENT_PARTICULIER_ADEFENDRE__PRIORITE_DEFENSE, oldPrioriteDefense, PRIORITE_DEFENSE_EDEFAULT, oldPrioriteDefenseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPrioriteDefense() {
		return prioriteDefenseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getACommeLocalisationAutreElementControle() {
		return aCommeLocalisationAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommeLocalisationAutreElementControle(TypeAssociation newACommeLocalisationAutreElementControle, NotificationChain msgs) {
		TypeAssociation oldACommeLocalisationAutreElementControle = aCommeLocalisationAutreElementControle;
		aCommeLocalisationAutreElementControle = newACommeLocalisationAutreElementControle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ELEMENT_PARTICULIER_ADEFENDRE__ACOMME_LOCALISATION_AUTRE_ELEMENT_CONTROLE, oldACommeLocalisationAutreElementControle, newACommeLocalisationAutreElementControle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommeLocalisationAutreElementControle(TypeAssociation newACommeLocalisationAutreElementControle) {
		if (newACommeLocalisationAutreElementControle != aCommeLocalisationAutreElementControle) {
			NotificationChain msgs = null;
			if (aCommeLocalisationAutreElementControle != null)
				msgs = ((InternalEObject)aCommeLocalisationAutreElementControle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ELEMENT_PARTICULIER_ADEFENDRE__ACOMME_LOCALISATION_AUTRE_ELEMENT_CONTROLE, null, msgs);
			if (newACommeLocalisationAutreElementControle != null)
				msgs = ((InternalEObject)newACommeLocalisationAutreElementControle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ELEMENT_PARTICULIER_ADEFENDRE__ACOMME_LOCALISATION_AUTRE_ELEMENT_CONTROLE, null, msgs);
			msgs = basicSetACommeLocalisationAutreElementControle(newACommeLocalisationAutreElementControle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ELEMENT_PARTICULIER_ADEFENDRE__ACOMME_LOCALISATION_AUTRE_ELEMENT_CONTROLE, newACommeLocalisationAutreElementControle, newACommeLocalisationAutreElementControle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ELEMENT_PARTICULIER_ADEFENDRE__ACOMME_LOCALISATION_AUTRE_ELEMENT_CONTROLE:
				return basicSetACommeLocalisationAutreElementControle(null, msgs);
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
			case SchemaPackage.TYPE_ELEMENT_PARTICULIER_ADEFENDRE__NATURE_ELEMENT:
				return getNatureElement();
			case SchemaPackage.TYPE_ELEMENT_PARTICULIER_ADEFENDRE__PRIORITE_DEFENSE:
				return getPrioriteDefense();
			case SchemaPackage.TYPE_ELEMENT_PARTICULIER_ADEFENDRE__ACOMME_LOCALISATION_AUTRE_ELEMENT_CONTROLE:
				return getACommeLocalisationAutreElementControle();
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
			case SchemaPackage.TYPE_ELEMENT_PARTICULIER_ADEFENDRE__NATURE_ELEMENT:
				setNatureElement((String)newValue);
				return;
			case SchemaPackage.TYPE_ELEMENT_PARTICULIER_ADEFENDRE__PRIORITE_DEFENSE:
				setPrioriteDefense((TypeDictionaryDicoPriorite)newValue);
				return;
			case SchemaPackage.TYPE_ELEMENT_PARTICULIER_ADEFENDRE__ACOMME_LOCALISATION_AUTRE_ELEMENT_CONTROLE:
				setACommeLocalisationAutreElementControle((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ELEMENT_PARTICULIER_ADEFENDRE__NATURE_ELEMENT:
				setNatureElement(NATURE_ELEMENT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ELEMENT_PARTICULIER_ADEFENDRE__PRIORITE_DEFENSE:
				unsetPrioriteDefense();
				return;
			case SchemaPackage.TYPE_ELEMENT_PARTICULIER_ADEFENDRE__ACOMME_LOCALISATION_AUTRE_ELEMENT_CONTROLE:
				setACommeLocalisationAutreElementControle((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ELEMENT_PARTICULIER_ADEFENDRE__NATURE_ELEMENT:
				return NATURE_ELEMENT_EDEFAULT == null ? natureElement != null : !NATURE_ELEMENT_EDEFAULT.equals(natureElement);
			case SchemaPackage.TYPE_ELEMENT_PARTICULIER_ADEFENDRE__PRIORITE_DEFENSE:
				return isSetPrioriteDefense();
			case SchemaPackage.TYPE_ELEMENT_PARTICULIER_ADEFENDRE__ACOMME_LOCALISATION_AUTRE_ELEMENT_CONTROLE:
				return aCommeLocalisationAutreElementControle != null;
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
		result.append(" (natureElement: ");
		result.append(natureElement);
		result.append(", prioriteDefense: ");
		if (prioriteDefenseESet) result.append(prioriteDefense); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeElementParticulierADefendreImpl
