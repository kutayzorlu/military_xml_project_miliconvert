/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoSurplusOuDeficitNiveauEffet;
import mpia.schema.TypeSurplusOuDeficit;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Surplus Ou Deficit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeSurplusOuDeficitImpl#getActionsPrises <em>Actions Prises</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSurplusOuDeficitImpl#getActionsDemandees <em>Actions Demandees</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSurplusOuDeficitImpl#getDateDebutEffet <em>Date Debut Effet</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSurplusOuDeficitImpl#getNiveauEffet <em>Niveau Effet</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSurplusOuDeficitImpl#getEffetOperationnelDeficits <em>Effet Operationnel Deficits</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeSurplusOuDeficitImpl extends EObjectImpl implements TypeSurplusOuDeficit {
	/**
	 * The default value of the '{@link #getActionsPrises() <em>Actions Prises</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionsPrises()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIONS_PRISES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionsPrises() <em>Actions Prises</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionsPrises()
	 * @generated
	 * @ordered
	 */
	protected String actionsPrises = ACTIONS_PRISES_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionsDemandees() <em>Actions Demandees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionsDemandees()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIONS_DEMANDEES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionsDemandees() <em>Actions Demandees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionsDemandees()
	 * @generated
	 * @ordered
	 */
	protected String actionsDemandees = ACTIONS_DEMANDEES_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateDebutEffet() <em>Date Debut Effet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDebutEffet()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_DEBUT_EFFET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateDebutEffet() <em>Date Debut Effet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDebutEffet()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateDebutEffet = DATE_DEBUT_EFFET_EDEFAULT;

	/**
	 * The default value of the '{@link #getNiveauEffet() <em>Niveau Effet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauEffet()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoSurplusOuDeficitNiveauEffet NIVEAU_EFFET_EDEFAULT = TypeDictionaryDicoSurplusOuDeficitNiveauEffet._01;

	/**
	 * The cached value of the '{@link #getNiveauEffet() <em>Niveau Effet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauEffet()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoSurplusOuDeficitNiveauEffet niveauEffet = NIVEAU_EFFET_EDEFAULT;

	/**
	 * This is true if the Niveau Effet attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean niveauEffetESet;

	/**
	 * The default value of the '{@link #getEffetOperationnelDeficits() <em>Effet Operationnel Deficits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffetOperationnelDeficits()
	 * @generated
	 * @ordered
	 */
	protected static final String EFFET_OPERATIONNEL_DEFICITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEffetOperationnelDeficits() <em>Effet Operationnel Deficits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffetOperationnelDeficits()
	 * @generated
	 * @ordered
	 */
	protected String effetOperationnelDeficits = EFFET_OPERATIONNEL_DEFICITS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeSurplusOuDeficitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeSurplusOuDeficit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionsPrises() {
		return actionsPrises;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionsPrises(String newActionsPrises) {
		String oldActionsPrises = actionsPrises;
		actionsPrises = newActionsPrises;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SURPLUS_OU_DEFICIT__ACTIONS_PRISES, oldActionsPrises, actionsPrises));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionsDemandees() {
		return actionsDemandees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionsDemandees(String newActionsDemandees) {
		String oldActionsDemandees = actionsDemandees;
		actionsDemandees = newActionsDemandees;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SURPLUS_OU_DEFICIT__ACTIONS_DEMANDEES, oldActionsDemandees, actionsDemandees));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateDebutEffet() {
		return dateDebutEffet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateDebutEffet(XMLGregorianCalendar newDateDebutEffet) {
		XMLGregorianCalendar oldDateDebutEffet = dateDebutEffet;
		dateDebutEffet = newDateDebutEffet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SURPLUS_OU_DEFICIT__DATE_DEBUT_EFFET, oldDateDebutEffet, dateDebutEffet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoSurplusOuDeficitNiveauEffet getNiveauEffet() {
		return niveauEffet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNiveauEffet(TypeDictionaryDicoSurplusOuDeficitNiveauEffet newNiveauEffet) {
		TypeDictionaryDicoSurplusOuDeficitNiveauEffet oldNiveauEffet = niveauEffet;
		niveauEffet = newNiveauEffet == null ? NIVEAU_EFFET_EDEFAULT : newNiveauEffet;
		boolean oldNiveauEffetESet = niveauEffetESet;
		niveauEffetESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SURPLUS_OU_DEFICIT__NIVEAU_EFFET, oldNiveauEffet, niveauEffet, !oldNiveauEffetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNiveauEffet() {
		TypeDictionaryDicoSurplusOuDeficitNiveauEffet oldNiveauEffet = niveauEffet;
		boolean oldNiveauEffetESet = niveauEffetESet;
		niveauEffet = NIVEAU_EFFET_EDEFAULT;
		niveauEffetESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SURPLUS_OU_DEFICIT__NIVEAU_EFFET, oldNiveauEffet, NIVEAU_EFFET_EDEFAULT, oldNiveauEffetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNiveauEffet() {
		return niveauEffetESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEffetOperationnelDeficits() {
		return effetOperationnelDeficits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffetOperationnelDeficits(String newEffetOperationnelDeficits) {
		String oldEffetOperationnelDeficits = effetOperationnelDeficits;
		effetOperationnelDeficits = newEffetOperationnelDeficits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SURPLUS_OU_DEFICIT__EFFET_OPERATIONNEL_DEFICITS, oldEffetOperationnelDeficits, effetOperationnelDeficits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_SURPLUS_OU_DEFICIT__ACTIONS_PRISES:
				return getActionsPrises();
			case SchemaPackage.TYPE_SURPLUS_OU_DEFICIT__ACTIONS_DEMANDEES:
				return getActionsDemandees();
			case SchemaPackage.TYPE_SURPLUS_OU_DEFICIT__DATE_DEBUT_EFFET:
				return getDateDebutEffet();
			case SchemaPackage.TYPE_SURPLUS_OU_DEFICIT__NIVEAU_EFFET:
				return getNiveauEffet();
			case SchemaPackage.TYPE_SURPLUS_OU_DEFICIT__EFFET_OPERATIONNEL_DEFICITS:
				return getEffetOperationnelDeficits();
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
			case SchemaPackage.TYPE_SURPLUS_OU_DEFICIT__ACTIONS_PRISES:
				setActionsPrises((String)newValue);
				return;
			case SchemaPackage.TYPE_SURPLUS_OU_DEFICIT__ACTIONS_DEMANDEES:
				setActionsDemandees((String)newValue);
				return;
			case SchemaPackage.TYPE_SURPLUS_OU_DEFICIT__DATE_DEBUT_EFFET:
				setDateDebutEffet((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_SURPLUS_OU_DEFICIT__NIVEAU_EFFET:
				setNiveauEffet((TypeDictionaryDicoSurplusOuDeficitNiveauEffet)newValue);
				return;
			case SchemaPackage.TYPE_SURPLUS_OU_DEFICIT__EFFET_OPERATIONNEL_DEFICITS:
				setEffetOperationnelDeficits((String)newValue);
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
			case SchemaPackage.TYPE_SURPLUS_OU_DEFICIT__ACTIONS_PRISES:
				setActionsPrises(ACTIONS_PRISES_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SURPLUS_OU_DEFICIT__ACTIONS_DEMANDEES:
				setActionsDemandees(ACTIONS_DEMANDEES_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SURPLUS_OU_DEFICIT__DATE_DEBUT_EFFET:
				setDateDebutEffet(DATE_DEBUT_EFFET_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SURPLUS_OU_DEFICIT__NIVEAU_EFFET:
				unsetNiveauEffet();
				return;
			case SchemaPackage.TYPE_SURPLUS_OU_DEFICIT__EFFET_OPERATIONNEL_DEFICITS:
				setEffetOperationnelDeficits(EFFET_OPERATIONNEL_DEFICITS_EDEFAULT);
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
			case SchemaPackage.TYPE_SURPLUS_OU_DEFICIT__ACTIONS_PRISES:
				return ACTIONS_PRISES_EDEFAULT == null ? actionsPrises != null : !ACTIONS_PRISES_EDEFAULT.equals(actionsPrises);
			case SchemaPackage.TYPE_SURPLUS_OU_DEFICIT__ACTIONS_DEMANDEES:
				return ACTIONS_DEMANDEES_EDEFAULT == null ? actionsDemandees != null : !ACTIONS_DEMANDEES_EDEFAULT.equals(actionsDemandees);
			case SchemaPackage.TYPE_SURPLUS_OU_DEFICIT__DATE_DEBUT_EFFET:
				return DATE_DEBUT_EFFET_EDEFAULT == null ? dateDebutEffet != null : !DATE_DEBUT_EFFET_EDEFAULT.equals(dateDebutEffet);
			case SchemaPackage.TYPE_SURPLUS_OU_DEFICIT__NIVEAU_EFFET:
				return isSetNiveauEffet();
			case SchemaPackage.TYPE_SURPLUS_OU_DEFICIT__EFFET_OPERATIONNEL_DEFICITS:
				return EFFET_OPERATIONNEL_DEFICITS_EDEFAULT == null ? effetOperationnelDeficits != null : !EFFET_OPERATIONNEL_DEFICITS_EDEFAULT.equals(effetOperationnelDeficits);
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
		result.append(" (actionsPrises: ");
		result.append(actionsPrises);
		result.append(", actionsDemandees: ");
		result.append(actionsDemandees);
		result.append(", dateDebutEffet: ");
		result.append(dateDebutEffet);
		result.append(", niveauEffet: ");
		if (niveauEffetESet) result.append(niveauEffet); else result.append("<unset>");
		result.append(", effetOperationnelDeficits: ");
		result.append(effetOperationnelDeficits);
		result.append(')');
		return result.toString();
	}

} //TypeSurplusOuDeficitImpl
