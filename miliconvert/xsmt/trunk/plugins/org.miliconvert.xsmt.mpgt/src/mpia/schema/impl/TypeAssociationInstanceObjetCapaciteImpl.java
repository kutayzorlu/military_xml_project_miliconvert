/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationInstanceObjetCapacite;
import mpia.schema.TypeDictionaryDicoPrioriteMission;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Instance Objet Capacite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationInstanceObjetCapaciteImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationInstanceObjetCapaciteImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationInstanceObjetCapaciteImpl#getPriorite <em>Priorite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationInstanceObjetCapaciteImpl#getQuantite <em>Quantite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationInstanceObjetCapaciteImpl#getAssocieCapaciteInstanceObjet <em>Associe Capacite Instance Objet</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationInstanceObjetCapaciteImpl#getPorteSurCapaciteCapacite <em>Porte Sur Capacite Capacite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationInstanceObjetCapaciteImpl#getEstRapporteeParRapport <em>Est Rapportee Par Rapport</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationInstanceObjetCapaciteImpl extends EObjectImpl implements TypeAssociationInstanceObjetCapacite {
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
	 * The default value of the '{@link #getPriorite() <em>Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorite()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPrioriteMission PRIORITE_EDEFAULT = TypeDictionaryDicoPrioriteMission.PRIME;

	/**
	 * The cached value of the '{@link #getPriorite() <em>Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorite()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPrioriteMission priorite = PRIORITE_EDEFAULT;

	/**
	 * This is true if the Priorite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean prioriteESet;

	/**
	 * The default value of the '{@link #getQuantite() <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantite()
	 * @generated
	 * @ordered
	 */
	protected static final double QUANTITE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getQuantite() <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantite()
	 * @generated
	 * @ordered
	 */
	protected double quantite = QUANTITE_EDEFAULT;

	/**
	 * This is true if the Quantite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean quantiteESet;

	/**
	 * The cached value of the '{@link #getAssocieCapaciteInstanceObjet() <em>Associe Capacite Instance Objet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCapaciteInstanceObjet()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCapaciteInstanceObjet;

	/**
	 * The cached value of the '{@link #getPorteSurCapaciteCapacite() <em>Porte Sur Capacite Capacite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorteSurCapaciteCapacite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation porteSurCapaciteCapacite;

	/**
	 * The cached value of the '{@link #getEstRapporteeParRapport() <em>Est Rapportee Par Rapport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstRapporteeParRapport()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation estRapporteeParRapport;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationInstanceObjetCapaciteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationInstanceObjetCapacite();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_CAPACITE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_CAPACITE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoPrioriteMission getPriorite() {
		return priorite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriorite(TypeDictionaryDicoPrioriteMission newPriorite) {
		TypeDictionaryDicoPrioriteMission oldPriorite = priorite;
		priorite = newPriorite == null ? PRIORITE_EDEFAULT : newPriorite;
		boolean oldPrioriteESet = prioriteESet;
		prioriteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_CAPACITE__PRIORITE, oldPriorite, priorite, !oldPrioriteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPriorite() {
		TypeDictionaryDicoPrioriteMission oldPriorite = priorite;
		boolean oldPrioriteESet = prioriteESet;
		priorite = PRIORITE_EDEFAULT;
		prioriteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_CAPACITE__PRIORITE, oldPriorite, PRIORITE_EDEFAULT, oldPrioriteESet));
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
	public double getQuantite() {
		return quantite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantite(double newQuantite) {
		double oldQuantite = quantite;
		quantite = newQuantite;
		boolean oldQuantiteESet = quantiteESet;
		quantiteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_CAPACITE__QUANTITE, oldQuantite, quantite, !oldQuantiteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQuantite() {
		double oldQuantite = quantite;
		boolean oldQuantiteESet = quantiteESet;
		quantite = QUANTITE_EDEFAULT;
		quantiteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_CAPACITE__QUANTITE, oldQuantite, QUANTITE_EDEFAULT, oldQuantiteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQuantite() {
		return quantiteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAssocieCapaciteInstanceObjet() {
		return associeCapaciteInstanceObjet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCapaciteInstanceObjet(TypeAssociation newAssocieCapaciteInstanceObjet, NotificationChain msgs) {
		TypeAssociation oldAssocieCapaciteInstanceObjet = associeCapaciteInstanceObjet;
		associeCapaciteInstanceObjet = newAssocieCapaciteInstanceObjet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_CAPACITE__ASSOCIE_CAPACITE_INSTANCE_OBJET, oldAssocieCapaciteInstanceObjet, newAssocieCapaciteInstanceObjet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCapaciteInstanceObjet(TypeAssociation newAssocieCapaciteInstanceObjet) {
		if (newAssocieCapaciteInstanceObjet != associeCapaciteInstanceObjet) {
			NotificationChain msgs = null;
			if (associeCapaciteInstanceObjet != null)
				msgs = ((InternalEObject)associeCapaciteInstanceObjet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_CAPACITE__ASSOCIE_CAPACITE_INSTANCE_OBJET, null, msgs);
			if (newAssocieCapaciteInstanceObjet != null)
				msgs = ((InternalEObject)newAssocieCapaciteInstanceObjet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_CAPACITE__ASSOCIE_CAPACITE_INSTANCE_OBJET, null, msgs);
			msgs = basicSetAssocieCapaciteInstanceObjet(newAssocieCapaciteInstanceObjet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_CAPACITE__ASSOCIE_CAPACITE_INSTANCE_OBJET, newAssocieCapaciteInstanceObjet, newAssocieCapaciteInstanceObjet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getPorteSurCapaciteCapacite() {
		return porteSurCapaciteCapacite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPorteSurCapaciteCapacite(TypeAssociation newPorteSurCapaciteCapacite, NotificationChain msgs) {
		TypeAssociation oldPorteSurCapaciteCapacite = porteSurCapaciteCapacite;
		porteSurCapaciteCapacite = newPorteSurCapaciteCapacite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_CAPACITE__PORTE_SUR_CAPACITE_CAPACITE, oldPorteSurCapaciteCapacite, newPorteSurCapaciteCapacite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPorteSurCapaciteCapacite(TypeAssociation newPorteSurCapaciteCapacite) {
		if (newPorteSurCapaciteCapacite != porteSurCapaciteCapacite) {
			NotificationChain msgs = null;
			if (porteSurCapaciteCapacite != null)
				msgs = ((InternalEObject)porteSurCapaciteCapacite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_CAPACITE__PORTE_SUR_CAPACITE_CAPACITE, null, msgs);
			if (newPorteSurCapaciteCapacite != null)
				msgs = ((InternalEObject)newPorteSurCapaciteCapacite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_CAPACITE__PORTE_SUR_CAPACITE_CAPACITE, null, msgs);
			msgs = basicSetPorteSurCapaciteCapacite(newPorteSurCapaciteCapacite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_CAPACITE__PORTE_SUR_CAPACITE_CAPACITE, newPorteSurCapaciteCapacite, newPorteSurCapaciteCapacite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getEstRapporteeParRapport() {
		return estRapporteeParRapport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstRapporteeParRapport(TypeAssociation newEstRapporteeParRapport, NotificationChain msgs) {
		TypeAssociation oldEstRapporteeParRapport = estRapporteeParRapport;
		estRapporteeParRapport = newEstRapporteeParRapport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_CAPACITE__EST_RAPPORTEE_PAR_RAPPORT, oldEstRapporteeParRapport, newEstRapporteeParRapport);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstRapporteeParRapport(TypeAssociation newEstRapporteeParRapport) {
		if (newEstRapporteeParRapport != estRapporteeParRapport) {
			NotificationChain msgs = null;
			if (estRapporteeParRapport != null)
				msgs = ((InternalEObject)estRapporteeParRapport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_CAPACITE__EST_RAPPORTEE_PAR_RAPPORT, null, msgs);
			if (newEstRapporteeParRapport != null)
				msgs = ((InternalEObject)newEstRapporteeParRapport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_CAPACITE__EST_RAPPORTEE_PAR_RAPPORT, null, msgs);
			msgs = basicSetEstRapporteeParRapport(newEstRapporteeParRapport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_CAPACITE__EST_RAPPORTEE_PAR_RAPPORT, newEstRapporteeParRapport, newEstRapporteeParRapport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_CAPACITE__ASSOCIE_CAPACITE_INSTANCE_OBJET:
				return basicSetAssocieCapaciteInstanceObjet(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_CAPACITE__PORTE_SUR_CAPACITE_CAPACITE:
				return basicSetPorteSurCapaciteCapacite(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_CAPACITE__EST_RAPPORTEE_PAR_RAPPORT:
				return basicSetEstRapporteeParRapport(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_CAPACITE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_CAPACITE__CE:
				return getCE();
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_CAPACITE__PRIORITE:
				return getPriorite();
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_CAPACITE__QUANTITE:
				return new Double(getQuantite());
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_CAPACITE__ASSOCIE_CAPACITE_INSTANCE_OBJET:
				return getAssocieCapaciteInstanceObjet();
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_CAPACITE__PORTE_SUR_CAPACITE_CAPACITE:
				return getPorteSurCapaciteCapacite();
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_CAPACITE__EST_RAPPORTEE_PAR_RAPPORT:
				return getEstRapporteeParRapport();
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
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_CAPACITE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_CAPACITE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_CAPACITE__PRIORITE:
				setPriorite((TypeDictionaryDicoPrioriteMission)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_CAPACITE__QUANTITE:
				setQuantite(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_CAPACITE__ASSOCIE_CAPACITE_INSTANCE_OBJET:
				setAssocieCapaciteInstanceObjet((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_CAPACITE__PORTE_SUR_CAPACITE_CAPACITE:
				setPorteSurCapaciteCapacite((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_CAPACITE__EST_RAPPORTEE_PAR_RAPPORT:
				setEstRapporteeParRapport((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_CAPACITE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_CAPACITE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_CAPACITE__PRIORITE:
				unsetPriorite();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_CAPACITE__QUANTITE:
				unsetQuantite();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_CAPACITE__ASSOCIE_CAPACITE_INSTANCE_OBJET:
				setAssocieCapaciteInstanceObjet((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_CAPACITE__PORTE_SUR_CAPACITE_CAPACITE:
				setPorteSurCapaciteCapacite((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_CAPACITE__EST_RAPPORTEE_PAR_RAPPORT:
				setEstRapporteeParRapport((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_CAPACITE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_CAPACITE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_CAPACITE__PRIORITE:
				return isSetPriorite();
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_CAPACITE__QUANTITE:
				return isSetQuantite();
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_CAPACITE__ASSOCIE_CAPACITE_INSTANCE_OBJET:
				return associeCapaciteInstanceObjet != null;
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_CAPACITE__PORTE_SUR_CAPACITE_CAPACITE:
				return porteSurCapaciteCapacite != null;
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_CAPACITE__EST_RAPPORTEE_PAR_RAPPORT:
				return estRapporteeParRapport != null;
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
		result.append(" (cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(", priorite: ");
		if (prioriteESet) result.append(priorite); else result.append("<unset>");
		result.append(", quantite: ");
		if (quantiteESet) result.append(quantite); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeAssociationInstanceObjetCapaciteImpl
