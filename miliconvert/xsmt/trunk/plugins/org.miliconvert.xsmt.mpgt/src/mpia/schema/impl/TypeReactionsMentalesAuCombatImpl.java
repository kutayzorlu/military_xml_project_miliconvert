/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeReactionsMentalesAuCombat;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Reactions Mentales Au Combat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeReactionsMentalesAuCombatImpl#getConduiteATenir <em>Conduite ATenir</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeReactionsMentalesAuCombatImpl#getReactionsMentales <em>Reactions Mentales</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeReactionsMentalesAuCombatImpl extends EObjectImpl implements TypeReactionsMentalesAuCombat {
	/**
	 * The default value of the '{@link #getConduiteATenir() <em>Conduite ATenir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConduiteATenir()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDUITE_ATENIR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConduiteATenir() <em>Conduite ATenir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConduiteATenir()
	 * @generated
	 * @ordered
	 */
	protected String conduiteATenir = CONDUITE_ATENIR_EDEFAULT;

	/**
	 * The default value of the '{@link #getReactionsMentales() <em>Reactions Mentales</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactionsMentales()
	 * @generated
	 * @ordered
	 */
	protected static final String REACTIONS_MENTALES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReactionsMentales() <em>Reactions Mentales</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactionsMentales()
	 * @generated
	 * @ordered
	 */
	protected String reactionsMentales = REACTIONS_MENTALES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeReactionsMentalesAuCombatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeReactionsMentalesAuCombat();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConduiteATenir() {
		return conduiteATenir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConduiteATenir(String newConduiteATenir) {
		String oldConduiteATenir = conduiteATenir;
		conduiteATenir = newConduiteATenir;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_REACTIONS_MENTALES_AU_COMBAT__CONDUITE_ATENIR, oldConduiteATenir, conduiteATenir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReactionsMentales() {
		return reactionsMentales;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReactionsMentales(String newReactionsMentales) {
		String oldReactionsMentales = reactionsMentales;
		reactionsMentales = newReactionsMentales;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_REACTIONS_MENTALES_AU_COMBAT__REACTIONS_MENTALES, oldReactionsMentales, reactionsMentales));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_REACTIONS_MENTALES_AU_COMBAT__CONDUITE_ATENIR:
				return getConduiteATenir();
			case SchemaPackage.TYPE_REACTIONS_MENTALES_AU_COMBAT__REACTIONS_MENTALES:
				return getReactionsMentales();
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
			case SchemaPackage.TYPE_REACTIONS_MENTALES_AU_COMBAT__CONDUITE_ATENIR:
				setConduiteATenir((String)newValue);
				return;
			case SchemaPackage.TYPE_REACTIONS_MENTALES_AU_COMBAT__REACTIONS_MENTALES:
				setReactionsMentales((String)newValue);
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
			case SchemaPackage.TYPE_REACTIONS_MENTALES_AU_COMBAT__CONDUITE_ATENIR:
				setConduiteATenir(CONDUITE_ATENIR_EDEFAULT);
				return;
			case SchemaPackage.TYPE_REACTIONS_MENTALES_AU_COMBAT__REACTIONS_MENTALES:
				setReactionsMentales(REACTIONS_MENTALES_EDEFAULT);
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
			case SchemaPackage.TYPE_REACTIONS_MENTALES_AU_COMBAT__CONDUITE_ATENIR:
				return CONDUITE_ATENIR_EDEFAULT == null ? conduiteATenir != null : !CONDUITE_ATENIR_EDEFAULT.equals(conduiteATenir);
			case SchemaPackage.TYPE_REACTIONS_MENTALES_AU_COMBAT__REACTIONS_MENTALES:
				return REACTIONS_MENTALES_EDEFAULT == null ? reactionsMentales != null : !REACTIONS_MENTALES_EDEFAULT.equals(reactionsMentales);
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
		result.append(" (conduiteATenir: ");
		result.append(conduiteATenir);
		result.append(", reactionsMentales: ");
		result.append(reactionsMentales);
		result.append(')');
		return result.toString();
	}

} //TypeReactionsMentalesAuCombatImpl
