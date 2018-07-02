/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeConsigneParticuliere;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Consigne Particuliere</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeConsigneParticuliereImpl#getConsignes <em>Consignes</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsigneParticuliereImpl#getActionsAMener <em>Actions AMener</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsigneParticuliereImpl#getACommeLieuDeRegroupementAutreElementControle <em>AComme Lieu De Regroupement Autre Element Controle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeConsigneParticuliereImpl extends EObjectImpl implements TypeConsigneParticuliere {
	/**
	 * The default value of the '{@link #getConsignes() <em>Consignes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsignes()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSIGNES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConsignes() <em>Consignes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsignes()
	 * @generated
	 * @ordered
	 */
	protected String consignes = CONSIGNES_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionsAMener() <em>Actions AMener</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionsAMener()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIONS_AMENER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionsAMener() <em>Actions AMener</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionsAMener()
	 * @generated
	 * @ordered
	 */
	protected String actionsAMener = ACTIONS_AMENER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getACommeLieuDeRegroupementAutreElementControle() <em>AComme Lieu De Regroupement Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeLieuDeRegroupementAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aCommeLieuDeRegroupementAutreElementControle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeConsigneParticuliereImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeConsigneParticuliere();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConsignes() {
		return consignes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsignes(String newConsignes) {
		String oldConsignes = consignes;
		consignes = newConsignes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNE_PARTICULIERE__CONSIGNES, oldConsignes, consignes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionsAMener() {
		return actionsAMener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionsAMener(String newActionsAMener) {
		String oldActionsAMener = actionsAMener;
		actionsAMener = newActionsAMener;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNE_PARTICULIERE__ACTIONS_AMENER, oldActionsAMener, actionsAMener));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getACommeLieuDeRegroupementAutreElementControle() {
		return aCommeLieuDeRegroupementAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommeLieuDeRegroupementAutreElementControle(TypeAssociation newACommeLieuDeRegroupementAutreElementControle, NotificationChain msgs) {
		TypeAssociation oldACommeLieuDeRegroupementAutreElementControle = aCommeLieuDeRegroupementAutreElementControle;
		aCommeLieuDeRegroupementAutreElementControle = newACommeLieuDeRegroupementAutreElementControle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNE_PARTICULIERE__ACOMME_LIEU_DE_REGROUPEMENT_AUTRE_ELEMENT_CONTROLE, oldACommeLieuDeRegroupementAutreElementControle, newACommeLieuDeRegroupementAutreElementControle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommeLieuDeRegroupementAutreElementControle(TypeAssociation newACommeLieuDeRegroupementAutreElementControle) {
		if (newACommeLieuDeRegroupementAutreElementControle != aCommeLieuDeRegroupementAutreElementControle) {
			NotificationChain msgs = null;
			if (aCommeLieuDeRegroupementAutreElementControle != null)
				msgs = ((InternalEObject)aCommeLieuDeRegroupementAutreElementControle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONSIGNE_PARTICULIERE__ACOMME_LIEU_DE_REGROUPEMENT_AUTRE_ELEMENT_CONTROLE, null, msgs);
			if (newACommeLieuDeRegroupementAutreElementControle != null)
				msgs = ((InternalEObject)newACommeLieuDeRegroupementAutreElementControle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONSIGNE_PARTICULIERE__ACOMME_LIEU_DE_REGROUPEMENT_AUTRE_ELEMENT_CONTROLE, null, msgs);
			msgs = basicSetACommeLieuDeRegroupementAutreElementControle(newACommeLieuDeRegroupementAutreElementControle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNE_PARTICULIERE__ACOMME_LIEU_DE_REGROUPEMENT_AUTRE_ELEMENT_CONTROLE, newACommeLieuDeRegroupementAutreElementControle, newACommeLieuDeRegroupementAutreElementControle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_CONSIGNE_PARTICULIERE__ACOMME_LIEU_DE_REGROUPEMENT_AUTRE_ELEMENT_CONTROLE:
				return basicSetACommeLieuDeRegroupementAutreElementControle(null, msgs);
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
			case SchemaPackage.TYPE_CONSIGNE_PARTICULIERE__CONSIGNES:
				return getConsignes();
			case SchemaPackage.TYPE_CONSIGNE_PARTICULIERE__ACTIONS_AMENER:
				return getActionsAMener();
			case SchemaPackage.TYPE_CONSIGNE_PARTICULIERE__ACOMME_LIEU_DE_REGROUPEMENT_AUTRE_ELEMENT_CONTROLE:
				return getACommeLieuDeRegroupementAutreElementControle();
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
			case SchemaPackage.TYPE_CONSIGNE_PARTICULIERE__CONSIGNES:
				setConsignes((String)newValue);
				return;
			case SchemaPackage.TYPE_CONSIGNE_PARTICULIERE__ACTIONS_AMENER:
				setActionsAMener((String)newValue);
				return;
			case SchemaPackage.TYPE_CONSIGNE_PARTICULIERE__ACOMME_LIEU_DE_REGROUPEMENT_AUTRE_ELEMENT_CONTROLE:
				setACommeLieuDeRegroupementAutreElementControle((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_CONSIGNE_PARTICULIERE__CONSIGNES:
				setConsignes(CONSIGNES_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CONSIGNE_PARTICULIERE__ACTIONS_AMENER:
				setActionsAMener(ACTIONS_AMENER_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CONSIGNE_PARTICULIERE__ACOMME_LIEU_DE_REGROUPEMENT_AUTRE_ELEMENT_CONTROLE:
				setACommeLieuDeRegroupementAutreElementControle((TypeAssociation)null);
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
			case SchemaPackage.TYPE_CONSIGNE_PARTICULIERE__CONSIGNES:
				return CONSIGNES_EDEFAULT == null ? consignes != null : !CONSIGNES_EDEFAULT.equals(consignes);
			case SchemaPackage.TYPE_CONSIGNE_PARTICULIERE__ACTIONS_AMENER:
				return ACTIONS_AMENER_EDEFAULT == null ? actionsAMener != null : !ACTIONS_AMENER_EDEFAULT.equals(actionsAMener);
			case SchemaPackage.TYPE_CONSIGNE_PARTICULIERE__ACOMME_LIEU_DE_REGROUPEMENT_AUTRE_ELEMENT_CONTROLE:
				return aCommeLieuDeRegroupementAutreElementControle != null;
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
		result.append(" (consignes: ");
		result.append(consignes);
		result.append(", actionsAMener: ");
		result.append(actionsAMener);
		result.append(')');
		return result.toString();
	}

} //TypeConsigneParticuliereImpl
