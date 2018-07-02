/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeMenacePrioritaire;

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
 * An implementation of the model object '<em><b>Type Menace Prioritaire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMenacePrioritaireImpl#getPrioriteMenace <em>Priorite Menace</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMenacePrioritaireImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMenacePrioritaireImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMenacePrioritaireImpl#getConcerneTypeAeronefTypeAeronef <em>Concerne Type Aeronef Type Aeronef</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMenacePrioritaireImpl#getAPourAxePenetrationPresumeAutreElementControle <em>APour Axe Penetration Presume Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMenacePrioritaireImpl#getAPourArmementOuEquipementTypeMateriel <em>APour Armement Ou Equipement Type Materiel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMenacePrioritaireImpl extends EObjectImpl implements TypeMenacePrioritaire {
	/**
	 * The default value of the '{@link #getPrioriteMenace() <em>Priorite Menace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrioriteMenace()
	 * @generated
	 * @ordered
	 */
	protected static final long PRIORITE_MENACE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getPrioriteMenace() <em>Priorite Menace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrioriteMenace()
	 * @generated
	 * @ordered
	 */
	protected long prioriteMenace = PRIORITE_MENACE_EDEFAULT;

	/**
	 * This is true if the Priorite Menace attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean prioriteMenaceESet;

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
	 * The cached value of the '{@link #getConcerneTypeAeronefTypeAeronef() <em>Concerne Type Aeronef Type Aeronef</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneTypeAeronefTypeAeronef()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT concerneTypeAeronefTypeAeronef;

	/**
	 * The cached value of the '{@link #getAPourAxePenetrationPresumeAutreElementControle() <em>APour Axe Penetration Presume Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourAxePenetrationPresumeAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourAxePenetrationPresumeAutreElementControle;

	/**
	 * The cached value of the '{@link #getAPourArmementOuEquipementTypeMateriel() <em>APour Armement Ou Equipement Type Materiel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourArmementOuEquipementTypeMateriel()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociationEXT> aPourArmementOuEquipementTypeMateriel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMenacePrioritaireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMenacePrioritaire();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getPrioriteMenace() {
		return prioriteMenace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrioriteMenace(long newPrioriteMenace) {
		long oldPrioriteMenace = prioriteMenace;
		prioriteMenace = newPrioriteMenace;
		boolean oldPrioriteMenaceESet = prioriteMenaceESet;
		prioriteMenaceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MENACE_PRIORITAIRE__PRIORITE_MENACE, oldPrioriteMenace, prioriteMenace, !oldPrioriteMenaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPrioriteMenace() {
		long oldPrioriteMenace = prioriteMenace;
		boolean oldPrioriteMenaceESet = prioriteMenaceESet;
		prioriteMenace = PRIORITE_MENACE_EDEFAULT;
		prioriteMenaceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MENACE_PRIORITAIRE__PRIORITE_MENACE, oldPrioriteMenace, PRIORITE_MENACE_EDEFAULT, oldPrioriteMenaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPrioriteMenace() {
		return prioriteMenaceESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MENACE_PRIORITAIRE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MENACE_PRIORITAIRE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getConcerneTypeAeronefTypeAeronef() {
		return concerneTypeAeronefTypeAeronef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcerneTypeAeronefTypeAeronef(TypeAssociationEXT newConcerneTypeAeronefTypeAeronef, NotificationChain msgs) {
		TypeAssociationEXT oldConcerneTypeAeronefTypeAeronef = concerneTypeAeronefTypeAeronef;
		concerneTypeAeronefTypeAeronef = newConcerneTypeAeronefTypeAeronef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MENACE_PRIORITAIRE__CONCERNE_TYPE_AERONEF_TYPE_AERONEF, oldConcerneTypeAeronefTypeAeronef, newConcerneTypeAeronefTypeAeronef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcerneTypeAeronefTypeAeronef(TypeAssociationEXT newConcerneTypeAeronefTypeAeronef) {
		if (newConcerneTypeAeronefTypeAeronef != concerneTypeAeronefTypeAeronef) {
			NotificationChain msgs = null;
			if (concerneTypeAeronefTypeAeronef != null)
				msgs = ((InternalEObject)concerneTypeAeronefTypeAeronef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MENACE_PRIORITAIRE__CONCERNE_TYPE_AERONEF_TYPE_AERONEF, null, msgs);
			if (newConcerneTypeAeronefTypeAeronef != null)
				msgs = ((InternalEObject)newConcerneTypeAeronefTypeAeronef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MENACE_PRIORITAIRE__CONCERNE_TYPE_AERONEF_TYPE_AERONEF, null, msgs);
			msgs = basicSetConcerneTypeAeronefTypeAeronef(newConcerneTypeAeronefTypeAeronef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MENACE_PRIORITAIRE__CONCERNE_TYPE_AERONEF_TYPE_AERONEF, newConcerneTypeAeronefTypeAeronef, newConcerneTypeAeronefTypeAeronef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourAxePenetrationPresumeAutreElementControle() {
		return aPourAxePenetrationPresumeAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourAxePenetrationPresumeAutreElementControle(TypeAssociation newAPourAxePenetrationPresumeAutreElementControle, NotificationChain msgs) {
		TypeAssociation oldAPourAxePenetrationPresumeAutreElementControle = aPourAxePenetrationPresumeAutreElementControle;
		aPourAxePenetrationPresumeAutreElementControle = newAPourAxePenetrationPresumeAutreElementControle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MENACE_PRIORITAIRE__APOUR_AXE_PENETRATION_PRESUME_AUTRE_ELEMENT_CONTROLE, oldAPourAxePenetrationPresumeAutreElementControle, newAPourAxePenetrationPresumeAutreElementControle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourAxePenetrationPresumeAutreElementControle(TypeAssociation newAPourAxePenetrationPresumeAutreElementControle) {
		if (newAPourAxePenetrationPresumeAutreElementControle != aPourAxePenetrationPresumeAutreElementControle) {
			NotificationChain msgs = null;
			if (aPourAxePenetrationPresumeAutreElementControle != null)
				msgs = ((InternalEObject)aPourAxePenetrationPresumeAutreElementControle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MENACE_PRIORITAIRE__APOUR_AXE_PENETRATION_PRESUME_AUTRE_ELEMENT_CONTROLE, null, msgs);
			if (newAPourAxePenetrationPresumeAutreElementControle != null)
				msgs = ((InternalEObject)newAPourAxePenetrationPresumeAutreElementControle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MENACE_PRIORITAIRE__APOUR_AXE_PENETRATION_PRESUME_AUTRE_ELEMENT_CONTROLE, null, msgs);
			msgs = basicSetAPourAxePenetrationPresumeAutreElementControle(newAPourAxePenetrationPresumeAutreElementControle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MENACE_PRIORITAIRE__APOUR_AXE_PENETRATION_PRESUME_AUTRE_ELEMENT_CONTROLE, newAPourAxePenetrationPresumeAutreElementControle, newAPourAxePenetrationPresumeAutreElementControle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEXT> getAPourArmementOuEquipementTypeMateriel() {
		if (aPourArmementOuEquipementTypeMateriel == null) {
			aPourArmementOuEquipementTypeMateriel = new EObjectContainmentEList<TypeAssociationEXT>(TypeAssociationEXT.class, this, SchemaPackage.TYPE_MENACE_PRIORITAIRE__APOUR_ARMEMENT_OU_EQUIPEMENT_TYPE_MATERIEL);
		}
		return aPourArmementOuEquipementTypeMateriel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MENACE_PRIORITAIRE__CONCERNE_TYPE_AERONEF_TYPE_AERONEF:
				return basicSetConcerneTypeAeronefTypeAeronef(null, msgs);
			case SchemaPackage.TYPE_MENACE_PRIORITAIRE__APOUR_AXE_PENETRATION_PRESUME_AUTRE_ELEMENT_CONTROLE:
				return basicSetAPourAxePenetrationPresumeAutreElementControle(null, msgs);
			case SchemaPackage.TYPE_MENACE_PRIORITAIRE__APOUR_ARMEMENT_OU_EQUIPEMENT_TYPE_MATERIEL:
				return ((InternalEList<?>)getAPourArmementOuEquipementTypeMateriel()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_MENACE_PRIORITAIRE__PRIORITE_MENACE:
				return new Long(getPrioriteMenace());
			case SchemaPackage.TYPE_MENACE_PRIORITAIRE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_MENACE_PRIORITAIRE__CE:
				return getCE();
			case SchemaPackage.TYPE_MENACE_PRIORITAIRE__CONCERNE_TYPE_AERONEF_TYPE_AERONEF:
				return getConcerneTypeAeronefTypeAeronef();
			case SchemaPackage.TYPE_MENACE_PRIORITAIRE__APOUR_AXE_PENETRATION_PRESUME_AUTRE_ELEMENT_CONTROLE:
				return getAPourAxePenetrationPresumeAutreElementControle();
			case SchemaPackage.TYPE_MENACE_PRIORITAIRE__APOUR_ARMEMENT_OU_EQUIPEMENT_TYPE_MATERIEL:
				return getAPourArmementOuEquipementTypeMateriel();
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
			case SchemaPackage.TYPE_MENACE_PRIORITAIRE__PRIORITE_MENACE:
				setPrioriteMenace(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_MENACE_PRIORITAIRE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_MENACE_PRIORITAIRE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_MENACE_PRIORITAIRE__CONCERNE_TYPE_AERONEF_TYPE_AERONEF:
				setConcerneTypeAeronefTypeAeronef((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_MENACE_PRIORITAIRE__APOUR_AXE_PENETRATION_PRESUME_AUTRE_ELEMENT_CONTROLE:
				setAPourAxePenetrationPresumeAutreElementControle((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_MENACE_PRIORITAIRE__APOUR_ARMEMENT_OU_EQUIPEMENT_TYPE_MATERIEL:
				getAPourArmementOuEquipementTypeMateriel().clear();
				getAPourArmementOuEquipementTypeMateriel().addAll((Collection<? extends TypeAssociationEXT>)newValue);
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
			case SchemaPackage.TYPE_MENACE_PRIORITAIRE__PRIORITE_MENACE:
				unsetPrioriteMenace();
				return;
			case SchemaPackage.TYPE_MENACE_PRIORITAIRE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MENACE_PRIORITAIRE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MENACE_PRIORITAIRE__CONCERNE_TYPE_AERONEF_TYPE_AERONEF:
				setConcerneTypeAeronefTypeAeronef((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_MENACE_PRIORITAIRE__APOUR_AXE_PENETRATION_PRESUME_AUTRE_ELEMENT_CONTROLE:
				setAPourAxePenetrationPresumeAutreElementControle((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_MENACE_PRIORITAIRE__APOUR_ARMEMENT_OU_EQUIPEMENT_TYPE_MATERIEL:
				getAPourArmementOuEquipementTypeMateriel().clear();
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
			case SchemaPackage.TYPE_MENACE_PRIORITAIRE__PRIORITE_MENACE:
				return isSetPrioriteMenace();
			case SchemaPackage.TYPE_MENACE_PRIORITAIRE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_MENACE_PRIORITAIRE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_MENACE_PRIORITAIRE__CONCERNE_TYPE_AERONEF_TYPE_AERONEF:
				return concerneTypeAeronefTypeAeronef != null;
			case SchemaPackage.TYPE_MENACE_PRIORITAIRE__APOUR_AXE_PENETRATION_PRESUME_AUTRE_ELEMENT_CONTROLE:
				return aPourAxePenetrationPresumeAutreElementControle != null;
			case SchemaPackage.TYPE_MENACE_PRIORITAIRE__APOUR_ARMEMENT_OU_EQUIPEMENT_TYPE_MATERIEL:
				return aPourArmementOuEquipementTypeMateriel != null && !aPourArmementOuEquipementTypeMateriel.isEmpty();
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
		result.append(" (prioriteMenace: ");
		if (prioriteMenaceESet) result.append(prioriteMenace); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeMenacePrioritaireImpl
