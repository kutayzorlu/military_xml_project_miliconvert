/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAvancementTravailGenie;
import mpia.schema.TypeDictionaryDicoAvancementTravailGenieType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Avancement Travail Genie</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAvancementTravailGenieImpl#getDateDescription <em>Date Description</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAvancementTravailGenieImpl#getType <em>Type</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAvancementTravailGenieImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAvancementTravailGenieImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAvancementTravailGenieImpl#getEstRapporteParRapport <em>Est Rapporte Par Rapport</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAvancementTravailGenieImpl extends EObjectImpl implements TypeAvancementTravailGenie {
	/**
	 * The default value of the '{@link #getDateDescription() <em>Date Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDescription()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateDescription() <em>Date Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDescription()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateDescription = DATE_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAvancementTravailGenieType TYPE_EDEFAULT = TypeDictionaryDicoAvancementTravailGenieType.NOTSTR;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAvancementTravailGenieType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

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
	protected TypeAvancementTravailGenieImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAvancementTravailGenie();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateDescription() {
		return dateDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateDescription(XMLGregorianCalendar newDateDescription) {
		XMLGregorianCalendar oldDateDescription = dateDescription;
		dateDescription = newDateDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AVANCEMENT_TRAVAIL_GENIE__DATE_DESCRIPTION, oldDateDescription, dateDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAvancementTravailGenieType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeDictionaryDicoAvancementTravailGenieType newType) {
		TypeDictionaryDicoAvancementTravailGenieType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AVANCEMENT_TRAVAIL_GENIE__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TypeDictionaryDicoAvancementTravailGenieType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_AVANCEMENT_TRAVAIL_GENIE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AVANCEMENT_TRAVAIL_GENIE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AVANCEMENT_TRAVAIL_GENIE__CE, oldCE, cE));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AVANCEMENT_TRAVAIL_GENIE__EST_RAPPORTE_PAR_RAPPORT, oldEstRapporteParRapport, newEstRapporteParRapport);
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
				msgs = ((InternalEObject)estRapporteParRapport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_AVANCEMENT_TRAVAIL_GENIE__EST_RAPPORTE_PAR_RAPPORT, null, msgs);
			if (newEstRapporteParRapport != null)
				msgs = ((InternalEObject)newEstRapporteParRapport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_AVANCEMENT_TRAVAIL_GENIE__EST_RAPPORTE_PAR_RAPPORT, null, msgs);
			msgs = basicSetEstRapporteParRapport(newEstRapporteParRapport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AVANCEMENT_TRAVAIL_GENIE__EST_RAPPORTE_PAR_RAPPORT, newEstRapporteParRapport, newEstRapporteParRapport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_AVANCEMENT_TRAVAIL_GENIE__EST_RAPPORTE_PAR_RAPPORT:
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
			case SchemaPackage.TYPE_AVANCEMENT_TRAVAIL_GENIE__DATE_DESCRIPTION:
				return getDateDescription();
			case SchemaPackage.TYPE_AVANCEMENT_TRAVAIL_GENIE__TYPE:
				return getType();
			case SchemaPackage.TYPE_AVANCEMENT_TRAVAIL_GENIE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_AVANCEMENT_TRAVAIL_GENIE__CE:
				return getCE();
			case SchemaPackage.TYPE_AVANCEMENT_TRAVAIL_GENIE__EST_RAPPORTE_PAR_RAPPORT:
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
			case SchemaPackage.TYPE_AVANCEMENT_TRAVAIL_GENIE__DATE_DESCRIPTION:
				setDateDescription((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_AVANCEMENT_TRAVAIL_GENIE__TYPE:
				setType((TypeDictionaryDicoAvancementTravailGenieType)newValue);
				return;
			case SchemaPackage.TYPE_AVANCEMENT_TRAVAIL_GENIE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_AVANCEMENT_TRAVAIL_GENIE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_AVANCEMENT_TRAVAIL_GENIE__EST_RAPPORTE_PAR_RAPPORT:
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
			case SchemaPackage.TYPE_AVANCEMENT_TRAVAIL_GENIE__DATE_DESCRIPTION:
				setDateDescription(DATE_DESCRIPTION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_AVANCEMENT_TRAVAIL_GENIE__TYPE:
				unsetType();
				return;
			case SchemaPackage.TYPE_AVANCEMENT_TRAVAIL_GENIE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_AVANCEMENT_TRAVAIL_GENIE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_AVANCEMENT_TRAVAIL_GENIE__EST_RAPPORTE_PAR_RAPPORT:
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
			case SchemaPackage.TYPE_AVANCEMENT_TRAVAIL_GENIE__DATE_DESCRIPTION:
				return DATE_DESCRIPTION_EDEFAULT == null ? dateDescription != null : !DATE_DESCRIPTION_EDEFAULT.equals(dateDescription);
			case SchemaPackage.TYPE_AVANCEMENT_TRAVAIL_GENIE__TYPE:
				return isSetType();
			case SchemaPackage.TYPE_AVANCEMENT_TRAVAIL_GENIE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_AVANCEMENT_TRAVAIL_GENIE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_AVANCEMENT_TRAVAIL_GENIE__EST_RAPPORTE_PAR_RAPPORT:
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
		result.append(" (dateDescription: ");
		result.append(dateDescription);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeAvancementTravailGenieImpl
