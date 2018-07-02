/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoEtatOperationnelControleEmission;
import mpia.schema.TypeDictionaryDicoEtatOperationnelPiege;
import mpia.schema.TypeEtatOperationnel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Etat Operationnel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelImpl#getPiege <em>Piege</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelImpl#getControleEmission <em>Controle Emission</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelImpl#isNonIdentifie <em>Non Identifie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelImpl#getEstRapporteParRapport <em>Est Rapporte Par Rapport</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypeEtatOperationnelImpl extends EObjectImpl implements TypeEtatOperationnel {
	/**
	 * The default value of the '{@link #getPiege() <em>Piege</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPiege()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatOperationnelPiege PIEGE_EDEFAULT = TypeDictionaryDicoEtatOperationnelPiege.NO;

	/**
	 * The cached value of the '{@link #getPiege() <em>Piege</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPiege()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatOperationnelPiege piege = PIEGE_EDEFAULT;

	/**
	 * This is true if the Piege attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean piegeESet;

	/**
	 * The default value of the '{@link #getControleEmission() <em>Controle Emission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControleEmission()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatOperationnelControleEmission CONTROLE_EMISSION_EDEFAULT = TypeDictionaryDicoEtatOperationnelControleEmission.EMCON1;

	/**
	 * The cached value of the '{@link #getControleEmission() <em>Controle Emission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControleEmission()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatOperationnelControleEmission controleEmission = CONTROLE_EMISSION_EDEFAULT;

	/**
	 * This is true if the Controle Emission attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean controleEmissionESet;

	/**
	 * The default value of the '{@link #isNonIdentifie() <em>Non Identifie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNonIdentifie()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NON_IDENTIFIE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNonIdentifie() <em>Non Identifie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNonIdentifie()
	 * @generated
	 * @ordered
	 */
	protected boolean nonIdentifie = NON_IDENTIFIE_EDEFAULT;

	/**
	 * This is true if the Non Identifie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nonIdentifieESet;

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
	 * The cached value of the '{@link #getEstRapporteParRapport() <em>Est Rapporte Par Rapport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstRapporteParRapport()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation estRapporteParRapport;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeEtatOperationnelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEtatOperationnel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatOperationnelPiege getPiege() {
		return piege;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPiege(TypeDictionaryDicoEtatOperationnelPiege newPiege) {
		TypeDictionaryDicoEtatOperationnelPiege oldPiege = piege;
		piege = newPiege == null ? PIEGE_EDEFAULT : newPiege;
		boolean oldPiegeESet = piegeESet;
		piegeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL__PIEGE, oldPiege, piege, !oldPiegeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPiege() {
		TypeDictionaryDicoEtatOperationnelPiege oldPiege = piege;
		boolean oldPiegeESet = piegeESet;
		piege = PIEGE_EDEFAULT;
		piegeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL__PIEGE, oldPiege, PIEGE_EDEFAULT, oldPiegeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPiege() {
		return piegeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatOperationnelControleEmission getControleEmission() {
		return controleEmission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControleEmission(TypeDictionaryDicoEtatOperationnelControleEmission newControleEmission) {
		TypeDictionaryDicoEtatOperationnelControleEmission oldControleEmission = controleEmission;
		controleEmission = newControleEmission == null ? CONTROLE_EMISSION_EDEFAULT : newControleEmission;
		boolean oldControleEmissionESet = controleEmissionESet;
		controleEmissionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL__CONTROLE_EMISSION, oldControleEmission, controleEmission, !oldControleEmissionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetControleEmission() {
		TypeDictionaryDicoEtatOperationnelControleEmission oldControleEmission = controleEmission;
		boolean oldControleEmissionESet = controleEmissionESet;
		controleEmission = CONTROLE_EMISSION_EDEFAULT;
		controleEmissionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL__CONTROLE_EMISSION, oldControleEmission, CONTROLE_EMISSION_EDEFAULT, oldControleEmissionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetControleEmission() {
		return controleEmissionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNonIdentifie() {
		return nonIdentifie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNonIdentifie(boolean newNonIdentifie) {
		boolean oldNonIdentifie = nonIdentifie;
		nonIdentifie = newNonIdentifie;
		boolean oldNonIdentifieESet = nonIdentifieESet;
		nonIdentifieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL__NON_IDENTIFIE, oldNonIdentifie, nonIdentifie, !oldNonIdentifieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNonIdentifie() {
		boolean oldNonIdentifie = nonIdentifie;
		boolean oldNonIdentifieESet = nonIdentifieESet;
		nonIdentifie = NON_IDENTIFIE_EDEFAULT;
		nonIdentifieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL__NON_IDENTIFIE, oldNonIdentifie, NON_IDENTIFIE_EDEFAULT, oldNonIdentifieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNonIdentifie() {
		return nonIdentifieESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getEstRapporteParRapport() {
		return estRapporteParRapport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstRapporteParRapport(TypeAssociation newEstRapporteParRapport, NotificationChain msgs) {
		TypeAssociation oldEstRapporteParRapport = estRapporteParRapport;
		estRapporteParRapport = newEstRapporteParRapport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL__EST_RAPPORTE_PAR_RAPPORT, oldEstRapporteParRapport, newEstRapporteParRapport);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstRapporteParRapport(TypeAssociation newEstRapporteParRapport) {
		if (newEstRapporteParRapport != estRapporteParRapport) {
			NotificationChain msgs = null;
			if (estRapporteParRapport != null)
				msgs = ((InternalEObject)estRapporteParRapport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ETAT_OPERATIONNEL__EST_RAPPORTE_PAR_RAPPORT, null, msgs);
			if (newEstRapporteParRapport != null)
				msgs = ((InternalEObject)newEstRapporteParRapport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ETAT_OPERATIONNEL__EST_RAPPORTE_PAR_RAPPORT, null, msgs);
			msgs = basicSetEstRapporteParRapport(newEstRapporteParRapport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL__EST_RAPPORTE_PAR_RAPPORT, newEstRapporteParRapport, newEstRapporteParRapport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL__EST_RAPPORTE_PAR_RAPPORT:
				return basicSetEstRapporteParRapport(null, msgs);
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
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL__PIEGE:
				return getPiege();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL__CONTROLE_EMISSION:
				return getControleEmission();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL__NON_IDENTIFIE:
				return isNonIdentifie() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL__CE:
				return getCE();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL__EST_RAPPORTE_PAR_RAPPORT:
				return getEstRapporteParRapport();
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
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL__PIEGE:
				setPiege((TypeDictionaryDicoEtatOperationnelPiege)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL__CONTROLE_EMISSION:
				setControleEmission((TypeDictionaryDicoEtatOperationnelControleEmission)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL__NON_IDENTIFIE:
				setNonIdentifie(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL__EST_RAPPORTE_PAR_RAPPORT:
				setEstRapporteParRapport((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL__PIEGE:
				unsetPiege();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL__CONTROLE_EMISSION:
				unsetControleEmission();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL__NON_IDENTIFIE:
				unsetNonIdentifie();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL__EST_RAPPORTE_PAR_RAPPORT:
				setEstRapporteParRapport((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL__PIEGE:
				return isSetPiege();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL__CONTROLE_EMISSION:
				return isSetControleEmission();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL__NON_IDENTIFIE:
				return isSetNonIdentifie();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL__EST_RAPPORTE_PAR_RAPPORT:
				return estRapporteParRapport != null;
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
		result.append(" (piege: ");
		if (piegeESet) result.append(piege); else result.append("<unset>");
		result.append(", controleEmission: ");
		if (controleEmissionESet) result.append(controleEmission); else result.append("<unset>");
		result.append(", nonIdentifie: ");
		if (nonIdentifieESet) result.append(nonIdentifie); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeEtatOperationnelImpl
