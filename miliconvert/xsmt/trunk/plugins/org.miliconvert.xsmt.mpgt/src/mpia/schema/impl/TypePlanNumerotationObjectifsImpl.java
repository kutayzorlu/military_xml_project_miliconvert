/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypePlageNumerotation;
import mpia.schema.TypePlanNumerotationObjectifs;

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
 * An implementation of the model object '<em><b>Type Plan Numerotation Objectifs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypePlanNumerotationObjectifsImpl#getDebutPlan <em>Debut Plan</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlanNumerotationObjectifsImpl#getFinPlan <em>Fin Plan</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlanNumerotationObjectifsImpl#getAppartientAHoraireManoeuvre <em>Appartient AHoraire Manoeuvre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlanNumerotationObjectifsImpl#getSeComposePlageNumerotation <em>Se Compose Plage Numerotation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypePlanNumerotationObjectifsImpl extends TypeRacineOperationnelleImpl implements TypePlanNumerotationObjectifs {
	/**
	 * The default value of the '{@link #getDebutPlan() <em>Debut Plan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebutPlan()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DEBUT_PLAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDebutPlan() <em>Debut Plan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebutPlan()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar debutPlan = DEBUT_PLAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinPlan() <em>Fin Plan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinPlan()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar FIN_PLAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFinPlan() <em>Fin Plan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinPlan()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar finPlan = FIN_PLAN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAppartientAHoraireManoeuvre() <em>Appartient AHoraire Manoeuvre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppartientAHoraireManoeuvre()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation appartientAHoraireManoeuvre;

	/**
	 * The cached value of the '{@link #getSeComposePlageNumerotation() <em>Se Compose Plage Numerotation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeComposePlageNumerotation()
	 * @generated
	 * @ordered
	 */
	protected EList<TypePlageNumerotation> seComposePlageNumerotation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypePlanNumerotationObjectifsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypePlanNumerotationObjectifs();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDebutPlan() {
		return debutPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDebutPlan(XMLGregorianCalendar newDebutPlan) {
		XMLGregorianCalendar oldDebutPlan = debutPlan;
		debutPlan = newDebutPlan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PLAN_NUMEROTATION_OBJECTIFS__DEBUT_PLAN, oldDebutPlan, debutPlan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getFinPlan() {
		return finPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinPlan(XMLGregorianCalendar newFinPlan) {
		XMLGregorianCalendar oldFinPlan = finPlan;
		finPlan = newFinPlan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PLAN_NUMEROTATION_OBJECTIFS__FIN_PLAN, oldFinPlan, finPlan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAppartientAHoraireManoeuvre() {
		return appartientAHoraireManoeuvre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppartientAHoraireManoeuvre(TypeAssociation newAppartientAHoraireManoeuvre, NotificationChain msgs) {
		TypeAssociation oldAppartientAHoraireManoeuvre = appartientAHoraireManoeuvre;
		appartientAHoraireManoeuvre = newAppartientAHoraireManoeuvre;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PLAN_NUMEROTATION_OBJECTIFS__APPARTIENT_AHORAIRE_MANOEUVRE, oldAppartientAHoraireManoeuvre, newAppartientAHoraireManoeuvre);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppartientAHoraireManoeuvre(TypeAssociation newAppartientAHoraireManoeuvre) {
		if (newAppartientAHoraireManoeuvre != appartientAHoraireManoeuvre) {
			NotificationChain msgs = null;
			if (appartientAHoraireManoeuvre != null)
				msgs = ((InternalEObject)appartientAHoraireManoeuvre).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PLAN_NUMEROTATION_OBJECTIFS__APPARTIENT_AHORAIRE_MANOEUVRE, null, msgs);
			if (newAppartientAHoraireManoeuvre != null)
				msgs = ((InternalEObject)newAppartientAHoraireManoeuvre).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PLAN_NUMEROTATION_OBJECTIFS__APPARTIENT_AHORAIRE_MANOEUVRE, null, msgs);
			msgs = basicSetAppartientAHoraireManoeuvre(newAppartientAHoraireManoeuvre, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PLAN_NUMEROTATION_OBJECTIFS__APPARTIENT_AHORAIRE_MANOEUVRE, newAppartientAHoraireManoeuvre, newAppartientAHoraireManoeuvre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypePlageNumerotation> getSeComposePlageNumerotation() {
		if (seComposePlageNumerotation == null) {
			seComposePlageNumerotation = new EObjectContainmentEList<TypePlageNumerotation>(TypePlageNumerotation.class, this, SchemaPackage.TYPE_PLAN_NUMEROTATION_OBJECTIFS__SE_COMPOSE_PLAGE_NUMEROTATION);
		}
		return seComposePlageNumerotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_PLAN_NUMEROTATION_OBJECTIFS__APPARTIENT_AHORAIRE_MANOEUVRE:
				return basicSetAppartientAHoraireManoeuvre(null, msgs);
			case SchemaPackage.TYPE_PLAN_NUMEROTATION_OBJECTIFS__SE_COMPOSE_PLAGE_NUMEROTATION:
				return ((InternalEList<?>)getSeComposePlageNumerotation()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_PLAN_NUMEROTATION_OBJECTIFS__DEBUT_PLAN:
				return getDebutPlan();
			case SchemaPackage.TYPE_PLAN_NUMEROTATION_OBJECTIFS__FIN_PLAN:
				return getFinPlan();
			case SchemaPackage.TYPE_PLAN_NUMEROTATION_OBJECTIFS__APPARTIENT_AHORAIRE_MANOEUVRE:
				return getAppartientAHoraireManoeuvre();
			case SchemaPackage.TYPE_PLAN_NUMEROTATION_OBJECTIFS__SE_COMPOSE_PLAGE_NUMEROTATION:
				return getSeComposePlageNumerotation();
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
			case SchemaPackage.TYPE_PLAN_NUMEROTATION_OBJECTIFS__DEBUT_PLAN:
				setDebutPlan((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_PLAN_NUMEROTATION_OBJECTIFS__FIN_PLAN:
				setFinPlan((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_PLAN_NUMEROTATION_OBJECTIFS__APPARTIENT_AHORAIRE_MANOEUVRE:
				setAppartientAHoraireManoeuvre((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_PLAN_NUMEROTATION_OBJECTIFS__SE_COMPOSE_PLAGE_NUMEROTATION:
				getSeComposePlageNumerotation().clear();
				getSeComposePlageNumerotation().addAll((Collection<? extends TypePlageNumerotation>)newValue);
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
			case SchemaPackage.TYPE_PLAN_NUMEROTATION_OBJECTIFS__DEBUT_PLAN:
				setDebutPlan(DEBUT_PLAN_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PLAN_NUMEROTATION_OBJECTIFS__FIN_PLAN:
				setFinPlan(FIN_PLAN_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PLAN_NUMEROTATION_OBJECTIFS__APPARTIENT_AHORAIRE_MANOEUVRE:
				setAppartientAHoraireManoeuvre((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_PLAN_NUMEROTATION_OBJECTIFS__SE_COMPOSE_PLAGE_NUMEROTATION:
				getSeComposePlageNumerotation().clear();
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
			case SchemaPackage.TYPE_PLAN_NUMEROTATION_OBJECTIFS__DEBUT_PLAN:
				return DEBUT_PLAN_EDEFAULT == null ? debutPlan != null : !DEBUT_PLAN_EDEFAULT.equals(debutPlan);
			case SchemaPackage.TYPE_PLAN_NUMEROTATION_OBJECTIFS__FIN_PLAN:
				return FIN_PLAN_EDEFAULT == null ? finPlan != null : !FIN_PLAN_EDEFAULT.equals(finPlan);
			case SchemaPackage.TYPE_PLAN_NUMEROTATION_OBJECTIFS__APPARTIENT_AHORAIRE_MANOEUVRE:
				return appartientAHoraireManoeuvre != null;
			case SchemaPackage.TYPE_PLAN_NUMEROTATION_OBJECTIFS__SE_COMPOSE_PLAGE_NUMEROTATION:
				return seComposePlageNumerotation != null && !seComposePlageNumerotation.isEmpty();
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
		result.append(" (debutPlan: ");
		result.append(debutPlan);
		result.append(", finPlan: ");
		result.append(finPlan);
		result.append(')');
		return result.toString();
	}

} //TypePlanNumerotationObjectifsImpl
