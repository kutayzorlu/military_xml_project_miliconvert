/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoPriorite;
import mpia.schema.TypePrioriteTechnique;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Priorite Technique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypePrioriteTechniqueImpl#getPriorite <em>Priorite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrioriteTechniqueImpl#getDebutValidite <em>Debut Validite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrioriteTechniqueImpl#getFinValidite <em>Fin Validite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrioriteTechniqueImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrioriteTechniqueImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrioriteTechniqueImpl#getAppliquePourHoraireManoeuvre <em>Applique Pour Horaire Manoeuvre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrioriteTechniqueImpl#getConcerneTypeEquipement <em>Concerne Type Equipement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypePrioriteTechniqueImpl extends EObjectImpl implements TypePrioriteTechnique {
	/**
	 * The default value of the '{@link #getPriorite() <em>Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorite()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPriorite PRIORITE_EDEFAULT = TypeDictionaryDicoPriorite._1;

	/**
	 * The cached value of the '{@link #getPriorite() <em>Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorite()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPriorite priorite = PRIORITE_EDEFAULT;

	/**
	 * This is true if the Priorite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean prioriteESet;

	/**
	 * The default value of the '{@link #getDebutValidite() <em>Debut Validite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebutValidite()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DEBUT_VALIDITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDebutValidite() <em>Debut Validite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebutValidite()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar debutValidite = DEBUT_VALIDITE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinValidite() <em>Fin Validite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinValidite()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar FIN_VALIDITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFinValidite() <em>Fin Validite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinValidite()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar finValidite = FIN_VALIDITE_EDEFAULT;

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
	 * The cached value of the '{@link #getAppliquePourHoraireManoeuvre() <em>Applique Pour Horaire Manoeuvre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliquePourHoraireManoeuvre()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation appliquePourHoraireManoeuvre;

	/**
	 * The cached value of the '{@link #getConcerneTypeEquipement() <em>Concerne Type Equipement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneTypeEquipement()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT concerneTypeEquipement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypePrioriteTechniqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypePrioriteTechnique();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoPriorite getPriorite() {
		return priorite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriorite(TypeDictionaryDicoPriorite newPriorite) {
		TypeDictionaryDicoPriorite oldPriorite = priorite;
		priorite = newPriorite == null ? PRIORITE_EDEFAULT : newPriorite;
		boolean oldPrioriteESet = prioriteESet;
		prioriteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRIORITE_TECHNIQUE__PRIORITE, oldPriorite, priorite, !oldPrioriteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPriorite() {
		TypeDictionaryDicoPriorite oldPriorite = priorite;
		boolean oldPrioriteESet = prioriteESet;
		priorite = PRIORITE_EDEFAULT;
		prioriteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PRIORITE_TECHNIQUE__PRIORITE, oldPriorite, PRIORITE_EDEFAULT, oldPrioriteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPriorite() {
		return prioriteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDebutValidite() {
		return debutValidite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDebutValidite(XMLGregorianCalendar newDebutValidite) {
		XMLGregorianCalendar oldDebutValidite = debutValidite;
		debutValidite = newDebutValidite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRIORITE_TECHNIQUE__DEBUT_VALIDITE, oldDebutValidite, debutValidite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getFinValidite() {
		return finValidite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinValidite(XMLGregorianCalendar newFinValidite) {
		XMLGregorianCalendar oldFinValidite = finValidite;
		finValidite = newFinValidite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRIORITE_TECHNIQUE__FIN_VALIDITE, oldFinValidite, finValidite));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRIORITE_TECHNIQUE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRIORITE_TECHNIQUE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAppliquePourHoraireManoeuvre() {
		return appliquePourHoraireManoeuvre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppliquePourHoraireManoeuvre(TypeAssociation newAppliquePourHoraireManoeuvre, NotificationChain msgs) {
		TypeAssociation oldAppliquePourHoraireManoeuvre = appliquePourHoraireManoeuvre;
		appliquePourHoraireManoeuvre = newAppliquePourHoraireManoeuvre;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRIORITE_TECHNIQUE__APPLIQUE_POUR_HORAIRE_MANOEUVRE, oldAppliquePourHoraireManoeuvre, newAppliquePourHoraireManoeuvre);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppliquePourHoraireManoeuvre(TypeAssociation newAppliquePourHoraireManoeuvre) {
		if (newAppliquePourHoraireManoeuvre != appliquePourHoraireManoeuvre) {
			NotificationChain msgs = null;
			if (appliquePourHoraireManoeuvre != null)
				msgs = ((InternalEObject)appliquePourHoraireManoeuvre).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PRIORITE_TECHNIQUE__APPLIQUE_POUR_HORAIRE_MANOEUVRE, null, msgs);
			if (newAppliquePourHoraireManoeuvre != null)
				msgs = ((InternalEObject)newAppliquePourHoraireManoeuvre).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PRIORITE_TECHNIQUE__APPLIQUE_POUR_HORAIRE_MANOEUVRE, null, msgs);
			msgs = basicSetAppliquePourHoraireManoeuvre(newAppliquePourHoraireManoeuvre, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRIORITE_TECHNIQUE__APPLIQUE_POUR_HORAIRE_MANOEUVRE, newAppliquePourHoraireManoeuvre, newAppliquePourHoraireManoeuvre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getConcerneTypeEquipement() {
		return concerneTypeEquipement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcerneTypeEquipement(TypeAssociationEXT newConcerneTypeEquipement, NotificationChain msgs) {
		TypeAssociationEXT oldConcerneTypeEquipement = concerneTypeEquipement;
		concerneTypeEquipement = newConcerneTypeEquipement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRIORITE_TECHNIQUE__CONCERNE_TYPE_EQUIPEMENT, oldConcerneTypeEquipement, newConcerneTypeEquipement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcerneTypeEquipement(TypeAssociationEXT newConcerneTypeEquipement) {
		if (newConcerneTypeEquipement != concerneTypeEquipement) {
			NotificationChain msgs = null;
			if (concerneTypeEquipement != null)
				msgs = ((InternalEObject)concerneTypeEquipement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PRIORITE_TECHNIQUE__CONCERNE_TYPE_EQUIPEMENT, null, msgs);
			if (newConcerneTypeEquipement != null)
				msgs = ((InternalEObject)newConcerneTypeEquipement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PRIORITE_TECHNIQUE__CONCERNE_TYPE_EQUIPEMENT, null, msgs);
			msgs = basicSetConcerneTypeEquipement(newConcerneTypeEquipement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRIORITE_TECHNIQUE__CONCERNE_TYPE_EQUIPEMENT, newConcerneTypeEquipement, newConcerneTypeEquipement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_PRIORITE_TECHNIQUE__APPLIQUE_POUR_HORAIRE_MANOEUVRE:
				return basicSetAppliquePourHoraireManoeuvre(null, msgs);
			case SchemaPackage.TYPE_PRIORITE_TECHNIQUE__CONCERNE_TYPE_EQUIPEMENT:
				return basicSetConcerneTypeEquipement(null, msgs);
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
			case SchemaPackage.TYPE_PRIORITE_TECHNIQUE__PRIORITE:
				return getPriorite();
			case SchemaPackage.TYPE_PRIORITE_TECHNIQUE__DEBUT_VALIDITE:
				return getDebutValidite();
			case SchemaPackage.TYPE_PRIORITE_TECHNIQUE__FIN_VALIDITE:
				return getFinValidite();
			case SchemaPackage.TYPE_PRIORITE_TECHNIQUE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_PRIORITE_TECHNIQUE__CE:
				return getCE();
			case SchemaPackage.TYPE_PRIORITE_TECHNIQUE__APPLIQUE_POUR_HORAIRE_MANOEUVRE:
				return getAppliquePourHoraireManoeuvre();
			case SchemaPackage.TYPE_PRIORITE_TECHNIQUE__CONCERNE_TYPE_EQUIPEMENT:
				return getConcerneTypeEquipement();
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
			case SchemaPackage.TYPE_PRIORITE_TECHNIQUE__PRIORITE:
				setPriorite((TypeDictionaryDicoPriorite)newValue);
				return;
			case SchemaPackage.TYPE_PRIORITE_TECHNIQUE__DEBUT_VALIDITE:
				setDebutValidite((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_PRIORITE_TECHNIQUE__FIN_VALIDITE:
				setFinValidite((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_PRIORITE_TECHNIQUE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_PRIORITE_TECHNIQUE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_PRIORITE_TECHNIQUE__APPLIQUE_POUR_HORAIRE_MANOEUVRE:
				setAppliquePourHoraireManoeuvre((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_PRIORITE_TECHNIQUE__CONCERNE_TYPE_EQUIPEMENT:
				setConcerneTypeEquipement((TypeAssociationEXT)newValue);
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
			case SchemaPackage.TYPE_PRIORITE_TECHNIQUE__PRIORITE:
				unsetPriorite();
				return;
			case SchemaPackage.TYPE_PRIORITE_TECHNIQUE__DEBUT_VALIDITE:
				setDebutValidite(DEBUT_VALIDITE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PRIORITE_TECHNIQUE__FIN_VALIDITE:
				setFinValidite(FIN_VALIDITE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PRIORITE_TECHNIQUE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PRIORITE_TECHNIQUE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PRIORITE_TECHNIQUE__APPLIQUE_POUR_HORAIRE_MANOEUVRE:
				setAppliquePourHoraireManoeuvre((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_PRIORITE_TECHNIQUE__CONCERNE_TYPE_EQUIPEMENT:
				setConcerneTypeEquipement((TypeAssociationEXT)null);
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
			case SchemaPackage.TYPE_PRIORITE_TECHNIQUE__PRIORITE:
				return isSetPriorite();
			case SchemaPackage.TYPE_PRIORITE_TECHNIQUE__DEBUT_VALIDITE:
				return DEBUT_VALIDITE_EDEFAULT == null ? debutValidite != null : !DEBUT_VALIDITE_EDEFAULT.equals(debutValidite);
			case SchemaPackage.TYPE_PRIORITE_TECHNIQUE__FIN_VALIDITE:
				return FIN_VALIDITE_EDEFAULT == null ? finValidite != null : !FIN_VALIDITE_EDEFAULT.equals(finValidite);
			case SchemaPackage.TYPE_PRIORITE_TECHNIQUE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_PRIORITE_TECHNIQUE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_PRIORITE_TECHNIQUE__APPLIQUE_POUR_HORAIRE_MANOEUVRE:
				return appliquePourHoraireManoeuvre != null;
			case SchemaPackage.TYPE_PRIORITE_TECHNIQUE__CONCERNE_TYPE_EQUIPEMENT:
				return concerneTypeEquipement != null;
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
		result.append(" (priorite: ");
		if (prioriteESet) result.append(priorite); else result.append("<unset>");
		result.append(", debutValidite: ");
		result.append(debutValidite);
		result.append(", finValidite: ");
		result.append(finValidite);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypePrioriteTechniqueImpl
