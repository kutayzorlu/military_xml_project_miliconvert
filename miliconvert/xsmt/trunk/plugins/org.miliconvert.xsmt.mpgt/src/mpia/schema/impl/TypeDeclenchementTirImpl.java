/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDeclenchementTir;
import mpia.schema.TypeDictionaryDicoDeclenchementTirModeDeclenchement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Declenchement Tir</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeDeclenchementTirImpl#getModeDeclenchement <em>Mode Declenchement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDeclenchementTirImpl#getDateDeclenchement <em>Date Declenchement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDeclenchementTirImpl#getDateLimiteDeclenchement <em>Date Limite Declenchement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDeclenchementTirImpl#getAPourAutoriteDeclenchementUnite <em>APour Autorite Declenchement Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeDeclenchementTirImpl extends EObjectImpl implements TypeDeclenchementTir {
	/**
	 * The default value of the '{@link #getModeDeclenchement() <em>Mode Declenchement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeDeclenchement()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoDeclenchementTirModeDeclenchement MODE_DECLENCHEMENT_EDEFAULT = TypeDictionaryDicoDeclenchementTirModeDeclenchement.TOT;

	/**
	 * The cached value of the '{@link #getModeDeclenchement() <em>Mode Declenchement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeDeclenchement()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoDeclenchementTirModeDeclenchement modeDeclenchement = MODE_DECLENCHEMENT_EDEFAULT;

	/**
	 * This is true if the Mode Declenchement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean modeDeclenchementESet;

	/**
	 * The default value of the '{@link #getDateDeclenchement() <em>Date Declenchement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDeclenchement()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_DECLENCHEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateDeclenchement() <em>Date Declenchement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDeclenchement()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateDeclenchement = DATE_DECLENCHEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateLimiteDeclenchement() <em>Date Limite Declenchement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateLimiteDeclenchement()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_LIMITE_DECLENCHEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateLimiteDeclenchement() <em>Date Limite Declenchement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateLimiteDeclenchement()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateLimiteDeclenchement = DATE_LIMITE_DECLENCHEMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAPourAutoriteDeclenchementUnite() <em>APour Autorite Declenchement Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourAutoriteDeclenchementUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aPourAutoriteDeclenchementUnite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeDeclenchementTirImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeDeclenchementTir();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoDeclenchementTirModeDeclenchement getModeDeclenchement() {
		return modeDeclenchement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModeDeclenchement(TypeDictionaryDicoDeclenchementTirModeDeclenchement newModeDeclenchement) {
		TypeDictionaryDicoDeclenchementTirModeDeclenchement oldModeDeclenchement = modeDeclenchement;
		modeDeclenchement = newModeDeclenchement == null ? MODE_DECLENCHEMENT_EDEFAULT : newModeDeclenchement;
		boolean oldModeDeclenchementESet = modeDeclenchementESet;
		modeDeclenchementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DECLENCHEMENT_TIR__MODE_DECLENCHEMENT, oldModeDeclenchement, modeDeclenchement, !oldModeDeclenchementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetModeDeclenchement() {
		TypeDictionaryDicoDeclenchementTirModeDeclenchement oldModeDeclenchement = modeDeclenchement;
		boolean oldModeDeclenchementESet = modeDeclenchementESet;
		modeDeclenchement = MODE_DECLENCHEMENT_EDEFAULT;
		modeDeclenchementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_DECLENCHEMENT_TIR__MODE_DECLENCHEMENT, oldModeDeclenchement, MODE_DECLENCHEMENT_EDEFAULT, oldModeDeclenchementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetModeDeclenchement() {
		return modeDeclenchementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateDeclenchement() {
		return dateDeclenchement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateDeclenchement(XMLGregorianCalendar newDateDeclenchement) {
		XMLGregorianCalendar oldDateDeclenchement = dateDeclenchement;
		dateDeclenchement = newDateDeclenchement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DECLENCHEMENT_TIR__DATE_DECLENCHEMENT, oldDateDeclenchement, dateDeclenchement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateLimiteDeclenchement() {
		return dateLimiteDeclenchement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateLimiteDeclenchement(XMLGregorianCalendar newDateLimiteDeclenchement) {
		XMLGregorianCalendar oldDateLimiteDeclenchement = dateLimiteDeclenchement;
		dateLimiteDeclenchement = newDateLimiteDeclenchement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DECLENCHEMENT_TIR__DATE_LIMITE_DECLENCHEMENT, oldDateLimiteDeclenchement, dateLimiteDeclenchement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAPourAutoriteDeclenchementUnite() {
		return aPourAutoriteDeclenchementUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourAutoriteDeclenchementUnite(TypeAssociationEXT newAPourAutoriteDeclenchementUnite, NotificationChain msgs) {
		TypeAssociationEXT oldAPourAutoriteDeclenchementUnite = aPourAutoriteDeclenchementUnite;
		aPourAutoriteDeclenchementUnite = newAPourAutoriteDeclenchementUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DECLENCHEMENT_TIR__APOUR_AUTORITE_DECLENCHEMENT_UNITE, oldAPourAutoriteDeclenchementUnite, newAPourAutoriteDeclenchementUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourAutoriteDeclenchementUnite(TypeAssociationEXT newAPourAutoriteDeclenchementUnite) {
		if (newAPourAutoriteDeclenchementUnite != aPourAutoriteDeclenchementUnite) {
			NotificationChain msgs = null;
			if (aPourAutoriteDeclenchementUnite != null)
				msgs = ((InternalEObject)aPourAutoriteDeclenchementUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DECLENCHEMENT_TIR__APOUR_AUTORITE_DECLENCHEMENT_UNITE, null, msgs);
			if (newAPourAutoriteDeclenchementUnite != null)
				msgs = ((InternalEObject)newAPourAutoriteDeclenchementUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DECLENCHEMENT_TIR__APOUR_AUTORITE_DECLENCHEMENT_UNITE, null, msgs);
			msgs = basicSetAPourAutoriteDeclenchementUnite(newAPourAutoriteDeclenchementUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DECLENCHEMENT_TIR__APOUR_AUTORITE_DECLENCHEMENT_UNITE, newAPourAutoriteDeclenchementUnite, newAPourAutoriteDeclenchementUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_DECLENCHEMENT_TIR__APOUR_AUTORITE_DECLENCHEMENT_UNITE:
				return basicSetAPourAutoriteDeclenchementUnite(null, msgs);
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
			case SchemaPackage.TYPE_DECLENCHEMENT_TIR__MODE_DECLENCHEMENT:
				return getModeDeclenchement();
			case SchemaPackage.TYPE_DECLENCHEMENT_TIR__DATE_DECLENCHEMENT:
				return getDateDeclenchement();
			case SchemaPackage.TYPE_DECLENCHEMENT_TIR__DATE_LIMITE_DECLENCHEMENT:
				return getDateLimiteDeclenchement();
			case SchemaPackage.TYPE_DECLENCHEMENT_TIR__APOUR_AUTORITE_DECLENCHEMENT_UNITE:
				return getAPourAutoriteDeclenchementUnite();
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
			case SchemaPackage.TYPE_DECLENCHEMENT_TIR__MODE_DECLENCHEMENT:
				setModeDeclenchement((TypeDictionaryDicoDeclenchementTirModeDeclenchement)newValue);
				return;
			case SchemaPackage.TYPE_DECLENCHEMENT_TIR__DATE_DECLENCHEMENT:
				setDateDeclenchement((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_DECLENCHEMENT_TIR__DATE_LIMITE_DECLENCHEMENT:
				setDateLimiteDeclenchement((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_DECLENCHEMENT_TIR__APOUR_AUTORITE_DECLENCHEMENT_UNITE:
				setAPourAutoriteDeclenchementUnite((TypeAssociationEXT)newValue);
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
			case SchemaPackage.TYPE_DECLENCHEMENT_TIR__MODE_DECLENCHEMENT:
				unsetModeDeclenchement();
				return;
			case SchemaPackage.TYPE_DECLENCHEMENT_TIR__DATE_DECLENCHEMENT:
				setDateDeclenchement(DATE_DECLENCHEMENT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DECLENCHEMENT_TIR__DATE_LIMITE_DECLENCHEMENT:
				setDateLimiteDeclenchement(DATE_LIMITE_DECLENCHEMENT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DECLENCHEMENT_TIR__APOUR_AUTORITE_DECLENCHEMENT_UNITE:
				setAPourAutoriteDeclenchementUnite((TypeAssociationEXT)null);
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
			case SchemaPackage.TYPE_DECLENCHEMENT_TIR__MODE_DECLENCHEMENT:
				return isSetModeDeclenchement();
			case SchemaPackage.TYPE_DECLENCHEMENT_TIR__DATE_DECLENCHEMENT:
				return DATE_DECLENCHEMENT_EDEFAULT == null ? dateDeclenchement != null : !DATE_DECLENCHEMENT_EDEFAULT.equals(dateDeclenchement);
			case SchemaPackage.TYPE_DECLENCHEMENT_TIR__DATE_LIMITE_DECLENCHEMENT:
				return DATE_LIMITE_DECLENCHEMENT_EDEFAULT == null ? dateLimiteDeclenchement != null : !DATE_LIMITE_DECLENCHEMENT_EDEFAULT.equals(dateLimiteDeclenchement);
			case SchemaPackage.TYPE_DECLENCHEMENT_TIR__APOUR_AUTORITE_DECLENCHEMENT_UNITE:
				return aPourAutoriteDeclenchementUnite != null;
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
		result.append(" (modeDeclenchement: ");
		if (modeDeclenchementESet) result.append(modeDeclenchement); else result.append("<unset>");
		result.append(", dateDeclenchement: ");
		result.append(dateDeclenchement);
		result.append(", dateLimiteDeclenchement: ");
		result.append(dateLimiteDeclenchement);
		result.append(')');
		return result.toString();
	}

} //TypeDeclenchementTirImpl
