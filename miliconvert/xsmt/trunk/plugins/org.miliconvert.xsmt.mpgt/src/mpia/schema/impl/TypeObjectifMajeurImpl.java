/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoMobiliteAttitude;
import mpia.schema.TypeDictionaryDicoTypeObjectifMajeurCategorie;
import mpia.schema.TypeObjectifMajeur;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Objectif Majeur</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeObjectifMajeurImpl#getDescriptionGenerale <em>Description Generale</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifMajeurImpl#getDescriptionMoyens <em>Description Moyens</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifMajeurImpl#getAttitudePrevisible <em>Attitude Previsible</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifMajeurImpl#getType <em>Type</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifMajeurImpl#getInformationsComplementaires <em>Informations Complementaires</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeObjectifMajeurImpl extends EObjectImpl implements TypeObjectifMajeur {
	/**
	 * The default value of the '{@link #getDescriptionGenerale() <em>Description Generale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionGenerale()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_GENERALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescriptionGenerale() <em>Description Generale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionGenerale()
	 * @generated
	 * @ordered
	 */
	protected String descriptionGenerale = DESCRIPTION_GENERALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescriptionMoyens() <em>Description Moyens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionMoyens()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_MOYENS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescriptionMoyens() <em>Description Moyens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionMoyens()
	 * @generated
	 * @ordered
	 */
	protected String descriptionMoyens = DESCRIPTION_MOYENS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttitudePrevisible() <em>Attitude Previsible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttitudePrevisible()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoMobiliteAttitude ATTITUDE_PREVISIBLE_EDEFAULT = TypeDictionaryDicoMobiliteAttitude.MVG;

	/**
	 * The cached value of the '{@link #getAttitudePrevisible() <em>Attitude Previsible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttitudePrevisible()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoMobiliteAttitude attitudePrevisible = ATTITUDE_PREVISIBLE_EDEFAULT;

	/**
	 * This is true if the Attitude Previsible attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean attitudePrevisibleESet;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeObjectifMajeurCategorie TYPE_EDEFAULT = TypeDictionaryDicoTypeObjectifMajeurCategorie.MECARM;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeObjectifMajeurCategorie type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The default value of the '{@link #getInformationsComplementaires() <em>Informations Complementaires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationsComplementaires()
	 * @generated
	 * @ordered
	 */
	protected static final String INFORMATIONS_COMPLEMENTAIRES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInformationsComplementaires() <em>Informations Complementaires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationsComplementaires()
	 * @generated
	 * @ordered
	 */
	protected String informationsComplementaires = INFORMATIONS_COMPLEMENTAIRES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeObjectifMajeurImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeObjectifMajeur();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescriptionGenerale() {
		return descriptionGenerale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptionGenerale(String newDescriptionGenerale) {
		String oldDescriptionGenerale = descriptionGenerale;
		descriptionGenerale = newDescriptionGenerale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_MAJEUR__DESCRIPTION_GENERALE, oldDescriptionGenerale, descriptionGenerale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescriptionMoyens() {
		return descriptionMoyens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptionMoyens(String newDescriptionMoyens) {
		String oldDescriptionMoyens = descriptionMoyens;
		descriptionMoyens = newDescriptionMoyens;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_MAJEUR__DESCRIPTION_MOYENS, oldDescriptionMoyens, descriptionMoyens));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoMobiliteAttitude getAttitudePrevisible() {
		return attitudePrevisible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttitudePrevisible(TypeDictionaryDicoMobiliteAttitude newAttitudePrevisible) {
		TypeDictionaryDicoMobiliteAttitude oldAttitudePrevisible = attitudePrevisible;
		attitudePrevisible = newAttitudePrevisible == null ? ATTITUDE_PREVISIBLE_EDEFAULT : newAttitudePrevisible;
		boolean oldAttitudePrevisibleESet = attitudePrevisibleESet;
		attitudePrevisibleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_MAJEUR__ATTITUDE_PREVISIBLE, oldAttitudePrevisible, attitudePrevisible, !oldAttitudePrevisibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAttitudePrevisible() {
		TypeDictionaryDicoMobiliteAttitude oldAttitudePrevisible = attitudePrevisible;
		boolean oldAttitudePrevisibleESet = attitudePrevisibleESet;
		attitudePrevisible = ATTITUDE_PREVISIBLE_EDEFAULT;
		attitudePrevisibleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_OBJECTIF_MAJEUR__ATTITUDE_PREVISIBLE, oldAttitudePrevisible, ATTITUDE_PREVISIBLE_EDEFAULT, oldAttitudePrevisibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAttitudePrevisible() {
		return attitudePrevisibleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeObjectifMajeurCategorie getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeDictionaryDicoTypeObjectifMajeurCategorie newType) {
		TypeDictionaryDicoTypeObjectifMajeurCategorie oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_MAJEUR__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TypeDictionaryDicoTypeObjectifMajeurCategorie oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_OBJECTIF_MAJEUR__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
	public String getInformationsComplementaires() {
		return informationsComplementaires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInformationsComplementaires(String newInformationsComplementaires) {
		String oldInformationsComplementaires = informationsComplementaires;
		informationsComplementaires = newInformationsComplementaires;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_MAJEUR__INFORMATIONS_COMPLEMENTAIRES, oldInformationsComplementaires, informationsComplementaires));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_OBJECTIF_MAJEUR__DESCRIPTION_GENERALE:
				return getDescriptionGenerale();
			case SchemaPackage.TYPE_OBJECTIF_MAJEUR__DESCRIPTION_MOYENS:
				return getDescriptionMoyens();
			case SchemaPackage.TYPE_OBJECTIF_MAJEUR__ATTITUDE_PREVISIBLE:
				return getAttitudePrevisible();
			case SchemaPackage.TYPE_OBJECTIF_MAJEUR__TYPE:
				return getType();
			case SchemaPackage.TYPE_OBJECTIF_MAJEUR__INFORMATIONS_COMPLEMENTAIRES:
				return getInformationsComplementaires();
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
			case SchemaPackage.TYPE_OBJECTIF_MAJEUR__DESCRIPTION_GENERALE:
				setDescriptionGenerale((String)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF_MAJEUR__DESCRIPTION_MOYENS:
				setDescriptionMoyens((String)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF_MAJEUR__ATTITUDE_PREVISIBLE:
				setAttitudePrevisible((TypeDictionaryDicoMobiliteAttitude)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF_MAJEUR__TYPE:
				setType((TypeDictionaryDicoTypeObjectifMajeurCategorie)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF_MAJEUR__INFORMATIONS_COMPLEMENTAIRES:
				setInformationsComplementaires((String)newValue);
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
			case SchemaPackage.TYPE_OBJECTIF_MAJEUR__DESCRIPTION_GENERALE:
				setDescriptionGenerale(DESCRIPTION_GENERALE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_OBJECTIF_MAJEUR__DESCRIPTION_MOYENS:
				setDescriptionMoyens(DESCRIPTION_MOYENS_EDEFAULT);
				return;
			case SchemaPackage.TYPE_OBJECTIF_MAJEUR__ATTITUDE_PREVISIBLE:
				unsetAttitudePrevisible();
				return;
			case SchemaPackage.TYPE_OBJECTIF_MAJEUR__TYPE:
				unsetType();
				return;
			case SchemaPackage.TYPE_OBJECTIF_MAJEUR__INFORMATIONS_COMPLEMENTAIRES:
				setInformationsComplementaires(INFORMATIONS_COMPLEMENTAIRES_EDEFAULT);
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
			case SchemaPackage.TYPE_OBJECTIF_MAJEUR__DESCRIPTION_GENERALE:
				return DESCRIPTION_GENERALE_EDEFAULT == null ? descriptionGenerale != null : !DESCRIPTION_GENERALE_EDEFAULT.equals(descriptionGenerale);
			case SchemaPackage.TYPE_OBJECTIF_MAJEUR__DESCRIPTION_MOYENS:
				return DESCRIPTION_MOYENS_EDEFAULT == null ? descriptionMoyens != null : !DESCRIPTION_MOYENS_EDEFAULT.equals(descriptionMoyens);
			case SchemaPackage.TYPE_OBJECTIF_MAJEUR__ATTITUDE_PREVISIBLE:
				return isSetAttitudePrevisible();
			case SchemaPackage.TYPE_OBJECTIF_MAJEUR__TYPE:
				return isSetType();
			case SchemaPackage.TYPE_OBJECTIF_MAJEUR__INFORMATIONS_COMPLEMENTAIRES:
				return INFORMATIONS_COMPLEMENTAIRES_EDEFAULT == null ? informationsComplementaires != null : !INFORMATIONS_COMPLEMENTAIRES_EDEFAULT.equals(informationsComplementaires);
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
		result.append(" (descriptionGenerale: ");
		result.append(descriptionGenerale);
		result.append(", descriptionMoyens: ");
		result.append(descriptionMoyens);
		result.append(", attitudePrevisible: ");
		if (attitudePrevisibleESet) result.append(attitudePrevisible); else result.append("<unset>");
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", informationsComplementaires: ");
		result.append(informationsComplementaires);
		result.append(')');
		return result.toString();
	}

} //TypeObjectifMajeurImpl
