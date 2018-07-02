/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoLiaisonPhysiqueTypeInstallation;
import mpia.schema.TypeLiaisonPhysique;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Liaison Physique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeLiaisonPhysiqueImpl#getCodeStanag3596 <em>Code Stanag3596</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeLiaisonPhysiqueImpl#getTypeProduit <em>Type Produit</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeLiaisonPhysiqueImpl#getDebit <em>Debit</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeLiaisonPhysiqueImpl#getType <em>Type</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeLiaisonPhysiqueImpl#getTypeDebit <em>Type Debit</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeLiaisonPhysiqueImpl#getTypeInstallation <em>Type Installation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeLiaisonPhysiqueImpl extends EObjectImpl implements TypeLiaisonPhysique {
	/**
	 * The default value of the '{@link #getCodeStanag3596() <em>Code Stanag3596</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeStanag3596()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_STANAG3596_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeStanag3596() <em>Code Stanag3596</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeStanag3596()
	 * @generated
	 * @ordered
	 */
	protected String codeStanag3596 = CODE_STANAG3596_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeProduit() <em>Type Produit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeProduit()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_PRODUIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeProduit() <em>Type Produit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeProduit()
	 * @generated
	 * @ordered
	 */
	protected String typeProduit = TYPE_PRODUIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDebit() <em>Debit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebit()
	 * @generated
	 * @ordered
	 */
	protected static final long DEBIT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getDebit() <em>Debit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebit()
	 * @generated
	 * @ordered
	 */
	protected long debit = DEBIT_EDEFAULT;

	/**
	 * This is true if the Debit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean debitESet;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeDebit() <em>Type Debit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDebit()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_DEBIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeDebit() <em>Type Debit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDebit()
	 * @generated
	 * @ordered
	 */
	protected String typeDebit = TYPE_DEBIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeInstallation() <em>Type Installation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeInstallation()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoLiaisonPhysiqueTypeInstallation TYPE_INSTALLATION_EDEFAULT = TypeDictionaryDicoLiaisonPhysiqueTypeInstallation.UNDER;

	/**
	 * The cached value of the '{@link #getTypeInstallation() <em>Type Installation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeInstallation()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoLiaisonPhysiqueTypeInstallation typeInstallation = TYPE_INSTALLATION_EDEFAULT;

	/**
	 * This is true if the Type Installation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeInstallationESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeLiaisonPhysiqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeLiaisonPhysique();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodeStanag3596() {
		return codeStanag3596;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeStanag3596(String newCodeStanag3596) {
		String oldCodeStanag3596 = codeStanag3596;
		codeStanag3596 = newCodeStanag3596;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LIAISON_PHYSIQUE__CODE_STANAG3596, oldCodeStanag3596, codeStanag3596));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeProduit() {
		return typeProduit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeProduit(String newTypeProduit) {
		String oldTypeProduit = typeProduit;
		typeProduit = newTypeProduit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LIAISON_PHYSIQUE__TYPE_PRODUIT, oldTypeProduit, typeProduit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getDebit() {
		return debit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDebit(long newDebit) {
		long oldDebit = debit;
		debit = newDebit;
		boolean oldDebitESet = debitESet;
		debitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LIAISON_PHYSIQUE__DEBIT, oldDebit, debit, !oldDebitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDebit() {
		long oldDebit = debit;
		boolean oldDebitESet = debitESet;
		debit = DEBIT_EDEFAULT;
		debitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_LIAISON_PHYSIQUE__DEBIT, oldDebit, DEBIT_EDEFAULT, oldDebitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDebit() {
		return debitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LIAISON_PHYSIQUE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeDebit() {
		return typeDebit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeDebit(String newTypeDebit) {
		String oldTypeDebit = typeDebit;
		typeDebit = newTypeDebit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LIAISON_PHYSIQUE__TYPE_DEBIT, oldTypeDebit, typeDebit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoLiaisonPhysiqueTypeInstallation getTypeInstallation() {
		return typeInstallation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeInstallation(TypeDictionaryDicoLiaisonPhysiqueTypeInstallation newTypeInstallation) {
		TypeDictionaryDicoLiaisonPhysiqueTypeInstallation oldTypeInstallation = typeInstallation;
		typeInstallation = newTypeInstallation == null ? TYPE_INSTALLATION_EDEFAULT : newTypeInstallation;
		boolean oldTypeInstallationESet = typeInstallationESet;
		typeInstallationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LIAISON_PHYSIQUE__TYPE_INSTALLATION, oldTypeInstallation, typeInstallation, !oldTypeInstallationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeInstallation() {
		TypeDictionaryDicoLiaisonPhysiqueTypeInstallation oldTypeInstallation = typeInstallation;
		boolean oldTypeInstallationESet = typeInstallationESet;
		typeInstallation = TYPE_INSTALLATION_EDEFAULT;
		typeInstallationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_LIAISON_PHYSIQUE__TYPE_INSTALLATION, oldTypeInstallation, TYPE_INSTALLATION_EDEFAULT, oldTypeInstallationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeInstallation() {
		return typeInstallationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_LIAISON_PHYSIQUE__CODE_STANAG3596:
				return getCodeStanag3596();
			case SchemaPackage.TYPE_LIAISON_PHYSIQUE__TYPE_PRODUIT:
				return getTypeProduit();
			case SchemaPackage.TYPE_LIAISON_PHYSIQUE__DEBIT:
				return new Long(getDebit());
			case SchemaPackage.TYPE_LIAISON_PHYSIQUE__TYPE:
				return getType();
			case SchemaPackage.TYPE_LIAISON_PHYSIQUE__TYPE_DEBIT:
				return getTypeDebit();
			case SchemaPackage.TYPE_LIAISON_PHYSIQUE__TYPE_INSTALLATION:
				return getTypeInstallation();
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
			case SchemaPackage.TYPE_LIAISON_PHYSIQUE__CODE_STANAG3596:
				setCodeStanag3596((String)newValue);
				return;
			case SchemaPackage.TYPE_LIAISON_PHYSIQUE__TYPE_PRODUIT:
				setTypeProduit((String)newValue);
				return;
			case SchemaPackage.TYPE_LIAISON_PHYSIQUE__DEBIT:
				setDebit(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_LIAISON_PHYSIQUE__TYPE:
				setType((String)newValue);
				return;
			case SchemaPackage.TYPE_LIAISON_PHYSIQUE__TYPE_DEBIT:
				setTypeDebit((String)newValue);
				return;
			case SchemaPackage.TYPE_LIAISON_PHYSIQUE__TYPE_INSTALLATION:
				setTypeInstallation((TypeDictionaryDicoLiaisonPhysiqueTypeInstallation)newValue);
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
			case SchemaPackage.TYPE_LIAISON_PHYSIQUE__CODE_STANAG3596:
				setCodeStanag3596(CODE_STANAG3596_EDEFAULT);
				return;
			case SchemaPackage.TYPE_LIAISON_PHYSIQUE__TYPE_PRODUIT:
				setTypeProduit(TYPE_PRODUIT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_LIAISON_PHYSIQUE__DEBIT:
				unsetDebit();
				return;
			case SchemaPackage.TYPE_LIAISON_PHYSIQUE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_LIAISON_PHYSIQUE__TYPE_DEBIT:
				setTypeDebit(TYPE_DEBIT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_LIAISON_PHYSIQUE__TYPE_INSTALLATION:
				unsetTypeInstallation();
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
			case SchemaPackage.TYPE_LIAISON_PHYSIQUE__CODE_STANAG3596:
				return CODE_STANAG3596_EDEFAULT == null ? codeStanag3596 != null : !CODE_STANAG3596_EDEFAULT.equals(codeStanag3596);
			case SchemaPackage.TYPE_LIAISON_PHYSIQUE__TYPE_PRODUIT:
				return TYPE_PRODUIT_EDEFAULT == null ? typeProduit != null : !TYPE_PRODUIT_EDEFAULT.equals(typeProduit);
			case SchemaPackage.TYPE_LIAISON_PHYSIQUE__DEBIT:
				return isSetDebit();
			case SchemaPackage.TYPE_LIAISON_PHYSIQUE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case SchemaPackage.TYPE_LIAISON_PHYSIQUE__TYPE_DEBIT:
				return TYPE_DEBIT_EDEFAULT == null ? typeDebit != null : !TYPE_DEBIT_EDEFAULT.equals(typeDebit);
			case SchemaPackage.TYPE_LIAISON_PHYSIQUE__TYPE_INSTALLATION:
				return isSetTypeInstallation();
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
		result.append(" (codeStanag3596: ");
		result.append(codeStanag3596);
		result.append(", typeProduit: ");
		result.append(typeProduit);
		result.append(", debit: ");
		if (debitESet) result.append(debit); else result.append("<unset>");
		result.append(", type: ");
		result.append(type);
		result.append(", typeDebit: ");
		result.append(typeDebit);
		result.append(", typeInstallation: ");
		if (typeInstallationESet) result.append(typeInstallation); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeLiaisonPhysiqueImpl
