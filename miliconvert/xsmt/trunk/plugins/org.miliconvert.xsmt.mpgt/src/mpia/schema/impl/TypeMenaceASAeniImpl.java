/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeMenaceASAeni;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Menace AS Aeni</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMenaceASAeniImpl#getIntituleHypothese <em>Intitule Hypothese</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMenaceASAeniImpl#getACommeActionParTempsManoeuvreAction <em>AComme Action Par Temps Manoeuvre Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMenaceASAeniImpl extends TypeMenaceImpl implements TypeMenaceASAeni {
	/**
	 * The default value of the '{@link #getIntituleHypothese() <em>Intitule Hypothese</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntituleHypothese()
	 * @generated
	 * @ordered
	 */
	protected static final String INTITULE_HYPOTHESE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIntituleHypothese() <em>Intitule Hypothese</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntituleHypothese()
	 * @generated
	 * @ordered
	 */
	protected String intituleHypothese = INTITULE_HYPOTHESE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getACommeActionParTempsManoeuvreAction() <em>AComme Action Par Temps Manoeuvre Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeActionParTempsManoeuvreAction()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aCommeActionParTempsManoeuvreAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMenaceASAeniImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMenaceASAeni();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIntituleHypothese() {
		return intituleHypothese;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntituleHypothese(String newIntituleHypothese) {
		String oldIntituleHypothese = intituleHypothese;
		intituleHypothese = newIntituleHypothese;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MENACE_AS_AENI__INTITULE_HYPOTHESE, oldIntituleHypothese, intituleHypothese));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getACommeActionParTempsManoeuvreAction() {
		if (aCommeActionParTempsManoeuvreAction == null) {
			aCommeActionParTempsManoeuvreAction = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MENACE_AS_AENI__ACOMME_ACTION_PAR_TEMPS_MANOEUVRE_ACTION);
		}
		return aCommeActionParTempsManoeuvreAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MENACE_AS_AENI__ACOMME_ACTION_PAR_TEMPS_MANOEUVRE_ACTION:
				return ((InternalEList<?>)getACommeActionParTempsManoeuvreAction()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_MENACE_AS_AENI__INTITULE_HYPOTHESE:
				return getIntituleHypothese();
			case SchemaPackage.TYPE_MENACE_AS_AENI__ACOMME_ACTION_PAR_TEMPS_MANOEUVRE_ACTION:
				return getACommeActionParTempsManoeuvreAction();
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
			case SchemaPackage.TYPE_MENACE_AS_AENI__INTITULE_HYPOTHESE:
				setIntituleHypothese((String)newValue);
				return;
			case SchemaPackage.TYPE_MENACE_AS_AENI__ACOMME_ACTION_PAR_TEMPS_MANOEUVRE_ACTION:
				getACommeActionParTempsManoeuvreAction().clear();
				getACommeActionParTempsManoeuvreAction().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_MENACE_AS_AENI__INTITULE_HYPOTHESE:
				setIntituleHypothese(INTITULE_HYPOTHESE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MENACE_AS_AENI__ACOMME_ACTION_PAR_TEMPS_MANOEUVRE_ACTION:
				getACommeActionParTempsManoeuvreAction().clear();
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
			case SchemaPackage.TYPE_MENACE_AS_AENI__INTITULE_HYPOTHESE:
				return INTITULE_HYPOTHESE_EDEFAULT == null ? intituleHypothese != null : !INTITULE_HYPOTHESE_EDEFAULT.equals(intituleHypothese);
			case SchemaPackage.TYPE_MENACE_AS_AENI__ACOMME_ACTION_PAR_TEMPS_MANOEUVRE_ACTION:
				return aCommeActionParTempsManoeuvreAction != null && !aCommeActionParTempsManoeuvreAction.isEmpty();
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
		result.append(" (intituleHypothese: ");
		result.append(intituleHypothese);
		result.append(')');
		return result.toString();
	}

} //TypeMenaceASAeniImpl
