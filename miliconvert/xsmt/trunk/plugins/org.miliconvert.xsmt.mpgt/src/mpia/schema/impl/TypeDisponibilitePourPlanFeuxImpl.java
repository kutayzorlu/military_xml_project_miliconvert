/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDisponibilitePourPlanFeux;
import mpia.schema.TypeQuantiteMoyensTirASS;

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
 * An implementation of the model object '<em><b>Type Disponibilite Pour Plan Feux</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeDisponibilitePourPlanFeuxImpl#getDebutCreneauHoraire <em>Debut Creneau Horaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDisponibilitePourPlanFeuxImpl#getFinCreneauHoraire <em>Fin Creneau Horaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDisponibilitePourPlanFeuxImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDisponibilitePourPlanFeuxImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDisponibilitePourPlanFeuxImpl#getAPourMoyensTirQuantiteMoyensTirASS <em>APour Moyens Tir Quantite Moyens Tir ASS</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeDisponibilitePourPlanFeuxImpl extends EObjectImpl implements TypeDisponibilitePourPlanFeux {
	/**
	 * The default value of the '{@link #getDebutCreneauHoraire() <em>Debut Creneau Horaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebutCreneauHoraire()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DEBUT_CRENEAU_HORAIRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDebutCreneauHoraire() <em>Debut Creneau Horaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebutCreneauHoraire()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar debutCreneauHoraire = DEBUT_CRENEAU_HORAIRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinCreneauHoraire() <em>Fin Creneau Horaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinCreneauHoraire()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar FIN_CRENEAU_HORAIRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFinCreneauHoraire() <em>Fin Creneau Horaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinCreneauHoraire()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar finCreneauHoraire = FIN_CRENEAU_HORAIRE_EDEFAULT;

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
	 * The cached value of the '{@link #getAPourMoyensTirQuantiteMoyensTirASS() <em>APour Moyens Tir Quantite Moyens Tir ASS</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourMoyensTirQuantiteMoyensTirASS()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeQuantiteMoyensTirASS> aPourMoyensTirQuantiteMoyensTirASS;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeDisponibilitePourPlanFeuxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeDisponibilitePourPlanFeux();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDebutCreneauHoraire() {
		return debutCreneauHoraire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDebutCreneauHoraire(XMLGregorianCalendar newDebutCreneauHoraire) {
		XMLGregorianCalendar oldDebutCreneauHoraire = debutCreneauHoraire;
		debutCreneauHoraire = newDebutCreneauHoraire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DISPONIBILITE_POUR_PLAN_FEUX__DEBUT_CRENEAU_HORAIRE, oldDebutCreneauHoraire, debutCreneauHoraire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getFinCreneauHoraire() {
		return finCreneauHoraire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinCreneauHoraire(XMLGregorianCalendar newFinCreneauHoraire) {
		XMLGregorianCalendar oldFinCreneauHoraire = finCreneauHoraire;
		finCreneauHoraire = newFinCreneauHoraire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DISPONIBILITE_POUR_PLAN_FEUX__FIN_CRENEAU_HORAIRE, oldFinCreneauHoraire, finCreneauHoraire));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DISPONIBILITE_POUR_PLAN_FEUX__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DISPONIBILITE_POUR_PLAN_FEUX__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeQuantiteMoyensTirASS> getAPourMoyensTirQuantiteMoyensTirASS() {
		if (aPourMoyensTirQuantiteMoyensTirASS == null) {
			aPourMoyensTirQuantiteMoyensTirASS = new EObjectContainmentEList<TypeQuantiteMoyensTirASS>(TypeQuantiteMoyensTirASS.class, this, SchemaPackage.TYPE_DISPONIBILITE_POUR_PLAN_FEUX__APOUR_MOYENS_TIR_QUANTITE_MOYENS_TIR_ASS);
		}
		return aPourMoyensTirQuantiteMoyensTirASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_DISPONIBILITE_POUR_PLAN_FEUX__APOUR_MOYENS_TIR_QUANTITE_MOYENS_TIR_ASS:
				return ((InternalEList<?>)getAPourMoyensTirQuantiteMoyensTirASS()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_DISPONIBILITE_POUR_PLAN_FEUX__DEBUT_CRENEAU_HORAIRE:
				return getDebutCreneauHoraire();
			case SchemaPackage.TYPE_DISPONIBILITE_POUR_PLAN_FEUX__FIN_CRENEAU_HORAIRE:
				return getFinCreneauHoraire();
			case SchemaPackage.TYPE_DISPONIBILITE_POUR_PLAN_FEUX__CTE:
				return getCTE();
			case SchemaPackage.TYPE_DISPONIBILITE_POUR_PLAN_FEUX__CE:
				return getCE();
			case SchemaPackage.TYPE_DISPONIBILITE_POUR_PLAN_FEUX__APOUR_MOYENS_TIR_QUANTITE_MOYENS_TIR_ASS:
				return getAPourMoyensTirQuantiteMoyensTirASS();
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
			case SchemaPackage.TYPE_DISPONIBILITE_POUR_PLAN_FEUX__DEBUT_CRENEAU_HORAIRE:
				setDebutCreneauHoraire((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_DISPONIBILITE_POUR_PLAN_FEUX__FIN_CRENEAU_HORAIRE:
				setFinCreneauHoraire((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_DISPONIBILITE_POUR_PLAN_FEUX__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_DISPONIBILITE_POUR_PLAN_FEUX__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_DISPONIBILITE_POUR_PLAN_FEUX__APOUR_MOYENS_TIR_QUANTITE_MOYENS_TIR_ASS:
				getAPourMoyensTirQuantiteMoyensTirASS().clear();
				getAPourMoyensTirQuantiteMoyensTirASS().addAll((Collection<? extends TypeQuantiteMoyensTirASS>)newValue);
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
			case SchemaPackage.TYPE_DISPONIBILITE_POUR_PLAN_FEUX__DEBUT_CRENEAU_HORAIRE:
				setDebutCreneauHoraire(DEBUT_CRENEAU_HORAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DISPONIBILITE_POUR_PLAN_FEUX__FIN_CRENEAU_HORAIRE:
				setFinCreneauHoraire(FIN_CRENEAU_HORAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DISPONIBILITE_POUR_PLAN_FEUX__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DISPONIBILITE_POUR_PLAN_FEUX__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DISPONIBILITE_POUR_PLAN_FEUX__APOUR_MOYENS_TIR_QUANTITE_MOYENS_TIR_ASS:
				getAPourMoyensTirQuantiteMoyensTirASS().clear();
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
			case SchemaPackage.TYPE_DISPONIBILITE_POUR_PLAN_FEUX__DEBUT_CRENEAU_HORAIRE:
				return DEBUT_CRENEAU_HORAIRE_EDEFAULT == null ? debutCreneauHoraire != null : !DEBUT_CRENEAU_HORAIRE_EDEFAULT.equals(debutCreneauHoraire);
			case SchemaPackage.TYPE_DISPONIBILITE_POUR_PLAN_FEUX__FIN_CRENEAU_HORAIRE:
				return FIN_CRENEAU_HORAIRE_EDEFAULT == null ? finCreneauHoraire != null : !FIN_CRENEAU_HORAIRE_EDEFAULT.equals(finCreneauHoraire);
			case SchemaPackage.TYPE_DISPONIBILITE_POUR_PLAN_FEUX__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_DISPONIBILITE_POUR_PLAN_FEUX__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_DISPONIBILITE_POUR_PLAN_FEUX__APOUR_MOYENS_TIR_QUANTITE_MOYENS_TIR_ASS:
				return aPourMoyensTirQuantiteMoyensTirASS != null && !aPourMoyensTirQuantiteMoyensTirASS.isEmpty();
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
		result.append(" (debutCreneauHoraire: ");
		result.append(debutCreneauHoraire);
		result.append(", finCreneauHoraire: ");
		result.append(finCreneauHoraire);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeDisponibilitePourPlanFeuxImpl
