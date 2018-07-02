/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDotationEffectiveConsommable;
import mpia.schema.TypeNiveauAMaintenir;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Niveau AMaintenir</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeNiveauAMaintenirImpl#getModalitesParticulieres <em>Modalites Particulieres</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeNiveauAMaintenirImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeNiveauAMaintenirImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeNiveauAMaintenirImpl#getConcerneDotationEffectiveConsommable <em>Concerne Dotation Effective Consommable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeNiveauAMaintenirImpl extends EObjectImpl implements TypeNiveauAMaintenir {
	/**
	 * The default value of the '{@link #getModalitesParticulieres() <em>Modalites Particulieres</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModalitesParticulieres()
	 * @generated
	 * @ordered
	 */
	protected static final String MODALITES_PARTICULIERES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModalitesParticulieres() <em>Modalites Particulieres</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModalitesParticulieres()
	 * @generated
	 * @ordered
	 */
	protected String modalitesParticulieres = MODALITES_PARTICULIERES_EDEFAULT;

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
	 * The cached value of the '{@link #getConcerneDotationEffectiveConsommable() <em>Concerne Dotation Effective Consommable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneDotationEffectiveConsommable()
	 * @generated
	 * @ordered
	 */
	protected TypeDotationEffectiveConsommable concerneDotationEffectiveConsommable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeNiveauAMaintenirImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeNiveauAMaintenir();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModalitesParticulieres() {
		return modalitesParticulieres;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModalitesParticulieres(String newModalitesParticulieres) {
		String oldModalitesParticulieres = modalitesParticulieres;
		modalitesParticulieres = newModalitesParticulieres;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_NIVEAU_AMAINTENIR__MODALITES_PARTICULIERES, oldModalitesParticulieres, modalitesParticulieres));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_NIVEAU_AMAINTENIR__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_NIVEAU_AMAINTENIR__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDotationEffectiveConsommable getConcerneDotationEffectiveConsommable() {
		return concerneDotationEffectiveConsommable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcerneDotationEffectiveConsommable(TypeDotationEffectiveConsommable newConcerneDotationEffectiveConsommable, NotificationChain msgs) {
		TypeDotationEffectiveConsommable oldConcerneDotationEffectiveConsommable = concerneDotationEffectiveConsommable;
		concerneDotationEffectiveConsommable = newConcerneDotationEffectiveConsommable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_NIVEAU_AMAINTENIR__CONCERNE_DOTATION_EFFECTIVE_CONSOMMABLE, oldConcerneDotationEffectiveConsommable, newConcerneDotationEffectiveConsommable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcerneDotationEffectiveConsommable(TypeDotationEffectiveConsommable newConcerneDotationEffectiveConsommable) {
		if (newConcerneDotationEffectiveConsommable != concerneDotationEffectiveConsommable) {
			NotificationChain msgs = null;
			if (concerneDotationEffectiveConsommable != null)
				msgs = ((InternalEObject)concerneDotationEffectiveConsommable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_NIVEAU_AMAINTENIR__CONCERNE_DOTATION_EFFECTIVE_CONSOMMABLE, null, msgs);
			if (newConcerneDotationEffectiveConsommable != null)
				msgs = ((InternalEObject)newConcerneDotationEffectiveConsommable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_NIVEAU_AMAINTENIR__CONCERNE_DOTATION_EFFECTIVE_CONSOMMABLE, null, msgs);
			msgs = basicSetConcerneDotationEffectiveConsommable(newConcerneDotationEffectiveConsommable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_NIVEAU_AMAINTENIR__CONCERNE_DOTATION_EFFECTIVE_CONSOMMABLE, newConcerneDotationEffectiveConsommable, newConcerneDotationEffectiveConsommable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_NIVEAU_AMAINTENIR__CONCERNE_DOTATION_EFFECTIVE_CONSOMMABLE:
				return basicSetConcerneDotationEffectiveConsommable(null, msgs);
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
			case SchemaPackage.TYPE_NIVEAU_AMAINTENIR__MODALITES_PARTICULIERES:
				return getModalitesParticulieres();
			case SchemaPackage.TYPE_NIVEAU_AMAINTENIR__CTE:
				return getCTE();
			case SchemaPackage.TYPE_NIVEAU_AMAINTENIR__CE:
				return getCE();
			case SchemaPackage.TYPE_NIVEAU_AMAINTENIR__CONCERNE_DOTATION_EFFECTIVE_CONSOMMABLE:
				return getConcerneDotationEffectiveConsommable();
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
			case SchemaPackage.TYPE_NIVEAU_AMAINTENIR__MODALITES_PARTICULIERES:
				setModalitesParticulieres((String)newValue);
				return;
			case SchemaPackage.TYPE_NIVEAU_AMAINTENIR__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_NIVEAU_AMAINTENIR__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_NIVEAU_AMAINTENIR__CONCERNE_DOTATION_EFFECTIVE_CONSOMMABLE:
				setConcerneDotationEffectiveConsommable((TypeDotationEffectiveConsommable)newValue);
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
			case SchemaPackage.TYPE_NIVEAU_AMAINTENIR__MODALITES_PARTICULIERES:
				setModalitesParticulieres(MODALITES_PARTICULIERES_EDEFAULT);
				return;
			case SchemaPackage.TYPE_NIVEAU_AMAINTENIR__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_NIVEAU_AMAINTENIR__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_NIVEAU_AMAINTENIR__CONCERNE_DOTATION_EFFECTIVE_CONSOMMABLE:
				setConcerneDotationEffectiveConsommable((TypeDotationEffectiveConsommable)null);
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
			case SchemaPackage.TYPE_NIVEAU_AMAINTENIR__MODALITES_PARTICULIERES:
				return MODALITES_PARTICULIERES_EDEFAULT == null ? modalitesParticulieres != null : !MODALITES_PARTICULIERES_EDEFAULT.equals(modalitesParticulieres);
			case SchemaPackage.TYPE_NIVEAU_AMAINTENIR__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_NIVEAU_AMAINTENIR__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_NIVEAU_AMAINTENIR__CONCERNE_DOTATION_EFFECTIVE_CONSOMMABLE:
				return concerneDotationEffectiveConsommable != null;
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
		result.append(" (modalitesParticulieres: ");
		result.append(modalitesParticulieres);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeNiveauAMaintenirImpl
