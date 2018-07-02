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
import mpia.schema.TypeDotationEffectiveEquipement;

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
 * An implementation of the model object '<em><b>Type Dotation Effective Equipement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeDotationEffectiveEquipementImpl#getQuantiteReparableA12h <em>Quantite Reparable A1 2h</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDotationEffectiveEquipementImpl#getQuantiteDefinitivementIndispo <em>Quantite Definitivement Indispo</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDotationEffectiveEquipementImpl#getQuantiteRechange <em>Quantite Rechange</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDotationEffectiveEquipementImpl#getAssocieCommeTypeTypeMateriel <em>Associe Comme Type Type Materiel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDotationEffectiveEquipementImpl#getConstitueSituationEquipement <em>Constitue Situation Equipement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeDotationEffectiveEquipementImpl extends TypeDotationEffectiveImpl implements TypeDotationEffectiveEquipement {
	/**
	 * The default value of the '{@link #getQuantiteReparableA12h() <em>Quantite Reparable A1 2h</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteReparableA12h()
	 * @generated
	 * @ordered
	 */
	protected static final long QUANTITE_REPARABLE_A1_2H_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getQuantiteReparableA12h() <em>Quantite Reparable A1 2h</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteReparableA12h()
	 * @generated
	 * @ordered
	 */
	protected long quantiteReparableA12h = QUANTITE_REPARABLE_A1_2H_EDEFAULT;

	/**
	 * This is true if the Quantite Reparable A1 2h attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean quantiteReparableA12hESet;

	/**
	 * The default value of the '{@link #getQuantiteDefinitivementIndispo() <em>Quantite Definitivement Indispo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteDefinitivementIndispo()
	 * @generated
	 * @ordered
	 */
	protected static final long QUANTITE_DEFINITIVEMENT_INDISPO_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getQuantiteDefinitivementIndispo() <em>Quantite Definitivement Indispo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteDefinitivementIndispo()
	 * @generated
	 * @ordered
	 */
	protected long quantiteDefinitivementIndispo = QUANTITE_DEFINITIVEMENT_INDISPO_EDEFAULT;

	/**
	 * This is true if the Quantite Definitivement Indispo attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean quantiteDefinitivementIndispoESet;

	/**
	 * The default value of the '{@link #getQuantiteRechange() <em>Quantite Rechange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteRechange()
	 * @generated
	 * @ordered
	 */
	protected static final long QUANTITE_RECHANGE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getQuantiteRechange() <em>Quantite Rechange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteRechange()
	 * @generated
	 * @ordered
	 */
	protected long quantiteRechange = QUANTITE_RECHANGE_EDEFAULT;

	/**
	 * This is true if the Quantite Rechange attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean quantiteRechangeESet;

	/**
	 * The cached value of the '{@link #getAssocieCommeTypeTypeMateriel() <em>Associe Comme Type Type Materiel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeTypeTypeMateriel()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeTypeTypeMateriel;

	/**
	 * The cached value of the '{@link #getConstitueSituationEquipement() <em>Constitue Situation Equipement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstitueSituationEquipement()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> constitueSituationEquipement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeDotationEffectiveEquipementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeDotationEffectiveEquipement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getQuantiteReparableA12h() {
		return quantiteReparableA12h;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantiteReparableA12h(long newQuantiteReparableA12h) {
		long oldQuantiteReparableA12h = quantiteReparableA12h;
		quantiteReparableA12h = newQuantiteReparableA12h;
		boolean oldQuantiteReparableA12hESet = quantiteReparableA12hESet;
		quantiteReparableA12hESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOTATION_EFFECTIVE_EQUIPEMENT__QUANTITE_REPARABLE_A1_2H, oldQuantiteReparableA12h, quantiteReparableA12h, !oldQuantiteReparableA12hESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQuantiteReparableA12h() {
		long oldQuantiteReparableA12h = quantiteReparableA12h;
		boolean oldQuantiteReparableA12hESet = quantiteReparableA12hESet;
		quantiteReparableA12h = QUANTITE_REPARABLE_A1_2H_EDEFAULT;
		quantiteReparableA12hESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_DOTATION_EFFECTIVE_EQUIPEMENT__QUANTITE_REPARABLE_A1_2H, oldQuantiteReparableA12h, QUANTITE_REPARABLE_A1_2H_EDEFAULT, oldQuantiteReparableA12hESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQuantiteReparableA12h() {
		return quantiteReparableA12hESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getQuantiteDefinitivementIndispo() {
		return quantiteDefinitivementIndispo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantiteDefinitivementIndispo(long newQuantiteDefinitivementIndispo) {
		long oldQuantiteDefinitivementIndispo = quantiteDefinitivementIndispo;
		quantiteDefinitivementIndispo = newQuantiteDefinitivementIndispo;
		boolean oldQuantiteDefinitivementIndispoESet = quantiteDefinitivementIndispoESet;
		quantiteDefinitivementIndispoESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOTATION_EFFECTIVE_EQUIPEMENT__QUANTITE_DEFINITIVEMENT_INDISPO, oldQuantiteDefinitivementIndispo, quantiteDefinitivementIndispo, !oldQuantiteDefinitivementIndispoESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQuantiteDefinitivementIndispo() {
		long oldQuantiteDefinitivementIndispo = quantiteDefinitivementIndispo;
		boolean oldQuantiteDefinitivementIndispoESet = quantiteDefinitivementIndispoESet;
		quantiteDefinitivementIndispo = QUANTITE_DEFINITIVEMENT_INDISPO_EDEFAULT;
		quantiteDefinitivementIndispoESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_DOTATION_EFFECTIVE_EQUIPEMENT__QUANTITE_DEFINITIVEMENT_INDISPO, oldQuantiteDefinitivementIndispo, QUANTITE_DEFINITIVEMENT_INDISPO_EDEFAULT, oldQuantiteDefinitivementIndispoESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQuantiteDefinitivementIndispo() {
		return quantiteDefinitivementIndispoESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getQuantiteRechange() {
		return quantiteRechange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantiteRechange(long newQuantiteRechange) {
		long oldQuantiteRechange = quantiteRechange;
		quantiteRechange = newQuantiteRechange;
		boolean oldQuantiteRechangeESet = quantiteRechangeESet;
		quantiteRechangeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOTATION_EFFECTIVE_EQUIPEMENT__QUANTITE_RECHANGE, oldQuantiteRechange, quantiteRechange, !oldQuantiteRechangeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQuantiteRechange() {
		long oldQuantiteRechange = quantiteRechange;
		boolean oldQuantiteRechangeESet = quantiteRechangeESet;
		quantiteRechange = QUANTITE_RECHANGE_EDEFAULT;
		quantiteRechangeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_DOTATION_EFFECTIVE_EQUIPEMENT__QUANTITE_RECHANGE, oldQuantiteRechange, QUANTITE_RECHANGE_EDEFAULT, oldQuantiteRechangeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQuantiteRechange() {
		return quantiteRechangeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAssocieCommeTypeTypeMateriel() {
		return associeCommeTypeTypeMateriel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeTypeTypeMateriel(TypeAssociation newAssocieCommeTypeTypeMateriel, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeTypeTypeMateriel = associeCommeTypeTypeMateriel;
		associeCommeTypeTypeMateriel = newAssocieCommeTypeTypeMateriel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOTATION_EFFECTIVE_EQUIPEMENT__ASSOCIE_COMME_TYPE_TYPE_MATERIEL, oldAssocieCommeTypeTypeMateriel, newAssocieCommeTypeTypeMateriel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeTypeTypeMateriel(TypeAssociation newAssocieCommeTypeTypeMateriel) {
		if (newAssocieCommeTypeTypeMateriel != associeCommeTypeTypeMateriel) {
			NotificationChain msgs = null;
			if (associeCommeTypeTypeMateriel != null)
				msgs = ((InternalEObject)associeCommeTypeTypeMateriel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DOTATION_EFFECTIVE_EQUIPEMENT__ASSOCIE_COMME_TYPE_TYPE_MATERIEL, null, msgs);
			if (newAssocieCommeTypeTypeMateriel != null)
				msgs = ((InternalEObject)newAssocieCommeTypeTypeMateriel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DOTATION_EFFECTIVE_EQUIPEMENT__ASSOCIE_COMME_TYPE_TYPE_MATERIEL, null, msgs);
			msgs = basicSetAssocieCommeTypeTypeMateriel(newAssocieCommeTypeTypeMateriel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOTATION_EFFECTIVE_EQUIPEMENT__ASSOCIE_COMME_TYPE_TYPE_MATERIEL, newAssocieCommeTypeTypeMateriel, newAssocieCommeTypeTypeMateriel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getConstitueSituationEquipement() {
		if (constitueSituationEquipement == null) {
			constitueSituationEquipement = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_DOTATION_EFFECTIVE_EQUIPEMENT__CONSTITUE_SITUATION_EQUIPEMENT);
		}
		return constitueSituationEquipement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE_EQUIPEMENT__ASSOCIE_COMME_TYPE_TYPE_MATERIEL:
				return basicSetAssocieCommeTypeTypeMateriel(null, msgs);
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE_EQUIPEMENT__CONSTITUE_SITUATION_EQUIPEMENT:
				return ((InternalEList<?>)getConstitueSituationEquipement()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE_EQUIPEMENT__QUANTITE_REPARABLE_A1_2H:
				return new Long(getQuantiteReparableA12h());
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE_EQUIPEMENT__QUANTITE_DEFINITIVEMENT_INDISPO:
				return new Long(getQuantiteDefinitivementIndispo());
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE_EQUIPEMENT__QUANTITE_RECHANGE:
				return new Long(getQuantiteRechange());
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE_EQUIPEMENT__ASSOCIE_COMME_TYPE_TYPE_MATERIEL:
				return getAssocieCommeTypeTypeMateriel();
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE_EQUIPEMENT__CONSTITUE_SITUATION_EQUIPEMENT:
				return getConstitueSituationEquipement();
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
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE_EQUIPEMENT__QUANTITE_REPARABLE_A1_2H:
				setQuantiteReparableA12h(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE_EQUIPEMENT__QUANTITE_DEFINITIVEMENT_INDISPO:
				setQuantiteDefinitivementIndispo(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE_EQUIPEMENT__QUANTITE_RECHANGE:
				setQuantiteRechange(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE_EQUIPEMENT__ASSOCIE_COMME_TYPE_TYPE_MATERIEL:
				setAssocieCommeTypeTypeMateriel((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE_EQUIPEMENT__CONSTITUE_SITUATION_EQUIPEMENT:
				getConstitueSituationEquipement().clear();
				getConstitueSituationEquipement().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE_EQUIPEMENT__QUANTITE_REPARABLE_A1_2H:
				unsetQuantiteReparableA12h();
				return;
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE_EQUIPEMENT__QUANTITE_DEFINITIVEMENT_INDISPO:
				unsetQuantiteDefinitivementIndispo();
				return;
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE_EQUIPEMENT__QUANTITE_RECHANGE:
				unsetQuantiteRechange();
				return;
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE_EQUIPEMENT__ASSOCIE_COMME_TYPE_TYPE_MATERIEL:
				setAssocieCommeTypeTypeMateriel((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE_EQUIPEMENT__CONSTITUE_SITUATION_EQUIPEMENT:
				getConstitueSituationEquipement().clear();
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
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE_EQUIPEMENT__QUANTITE_REPARABLE_A1_2H:
				return isSetQuantiteReparableA12h();
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE_EQUIPEMENT__QUANTITE_DEFINITIVEMENT_INDISPO:
				return isSetQuantiteDefinitivementIndispo();
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE_EQUIPEMENT__QUANTITE_RECHANGE:
				return isSetQuantiteRechange();
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE_EQUIPEMENT__ASSOCIE_COMME_TYPE_TYPE_MATERIEL:
				return associeCommeTypeTypeMateriel != null;
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE_EQUIPEMENT__CONSTITUE_SITUATION_EQUIPEMENT:
				return constitueSituationEquipement != null && !constitueSituationEquipement.isEmpty();
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
		result.append(" (quantiteReparableA12h: ");
		if (quantiteReparableA12hESet) result.append(quantiteReparableA12h); else result.append("<unset>");
		result.append(", quantiteDefinitivementIndispo: ");
		if (quantiteDefinitivementIndispoESet) result.append(quantiteDefinitivementIndispo); else result.append("<unset>");
		result.append(", quantiteRechange: ");
		if (quantiteRechangeESet) result.append(quantiteRechange); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeDotationEffectiveEquipementImpl
