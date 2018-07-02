/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoConditionnementUnite;
import mpia.schema.TypeDictionaryDicoUniteBeneficiaireMaterielCategorie;
import mpia.schema.TypeModaliteObtention;
import mpia.schema.TypeUniteBeneficiaireMateriel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Unite Beneficiaire Materiel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeUniteBeneficiaireMaterielImpl#getQuantiteAllouee <em>Quantite Allouee</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteBeneficiaireMaterielImpl#getConditionnementUnite <em>Conditionnement Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteBeneficiaireMaterielImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteBeneficiaireMaterielImpl#getConcerneTypeMateriel <em>Concerne Type Materiel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteBeneficiaireMaterielImpl#getAPourModaliteObtentionModaliteObtention <em>APour Modalite Obtention Modalite Obtention</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeUniteBeneficiaireMaterielImpl extends EObjectImpl implements TypeUniteBeneficiaireMateriel {
	/**
	 * The default value of the '{@link #getQuantiteAllouee() <em>Quantite Allouee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteAllouee()
	 * @generated
	 * @ordered
	 */
	protected static final long QUANTITE_ALLOUEE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getQuantiteAllouee() <em>Quantite Allouee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteAllouee()
	 * @generated
	 * @ordered
	 */
	protected long quantiteAllouee = QUANTITE_ALLOUEE_EDEFAULT;

	/**
	 * This is true if the Quantite Allouee attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean quantiteAlloueeESet;

	/**
	 * The default value of the '{@link #getConditionnementUnite() <em>Conditionnement Unite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionnementUnite()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoConditionnementUnite CONDITIONNEMENT_UNITE_EDEFAULT = TypeDictionaryDicoConditionnementUnite.CM;

	/**
	 * The cached value of the '{@link #getConditionnementUnite() <em>Conditionnement Unite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionnementUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoConditionnementUnite conditionnementUnite = CONDITIONNEMENT_UNITE_EDEFAULT;

	/**
	 * This is true if the Conditionnement Unite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean conditionnementUniteESet;

	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoUniteBeneficiaireMaterielCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoUniteBeneficiaireMaterielCategorie.EQUIP;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoUniteBeneficiaireMaterielCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The cached value of the '{@link #getConcerneTypeMateriel() <em>Concerne Type Materiel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneTypeMateriel()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT concerneTypeMateriel;

	/**
	 * The cached value of the '{@link #getAPourModaliteObtentionModaliteObtention() <em>APour Modalite Obtention Modalite Obtention</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourModaliteObtentionModaliteObtention()
	 * @generated
	 * @ordered
	 */
	protected TypeModaliteObtention aPourModaliteObtentionModaliteObtention;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeUniteBeneficiaireMaterielImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeUniteBeneficiaireMateriel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getQuantiteAllouee() {
		return quantiteAllouee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantiteAllouee(long newQuantiteAllouee) {
		long oldQuantiteAllouee = quantiteAllouee;
		quantiteAllouee = newQuantiteAllouee;
		boolean oldQuantiteAlloueeESet = quantiteAlloueeESet;
		quantiteAlloueeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE_BENEFICIAIRE_MATERIEL__QUANTITE_ALLOUEE, oldQuantiteAllouee, quantiteAllouee, !oldQuantiteAlloueeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQuantiteAllouee() {
		long oldQuantiteAllouee = quantiteAllouee;
		boolean oldQuantiteAlloueeESet = quantiteAlloueeESet;
		quantiteAllouee = QUANTITE_ALLOUEE_EDEFAULT;
		quantiteAlloueeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_UNITE_BENEFICIAIRE_MATERIEL__QUANTITE_ALLOUEE, oldQuantiteAllouee, QUANTITE_ALLOUEE_EDEFAULT, oldQuantiteAlloueeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQuantiteAllouee() {
		return quantiteAlloueeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoConditionnementUnite getConditionnementUnite() {
		return conditionnementUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionnementUnite(TypeDictionaryDicoConditionnementUnite newConditionnementUnite) {
		TypeDictionaryDicoConditionnementUnite oldConditionnementUnite = conditionnementUnite;
		conditionnementUnite = newConditionnementUnite == null ? CONDITIONNEMENT_UNITE_EDEFAULT : newConditionnementUnite;
		boolean oldConditionnementUniteESet = conditionnementUniteESet;
		conditionnementUniteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE_BENEFICIAIRE_MATERIEL__CONDITIONNEMENT_UNITE, oldConditionnementUnite, conditionnementUnite, !oldConditionnementUniteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConditionnementUnite() {
		TypeDictionaryDicoConditionnementUnite oldConditionnementUnite = conditionnementUnite;
		boolean oldConditionnementUniteESet = conditionnementUniteESet;
		conditionnementUnite = CONDITIONNEMENT_UNITE_EDEFAULT;
		conditionnementUniteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_UNITE_BENEFICIAIRE_MATERIEL__CONDITIONNEMENT_UNITE, oldConditionnementUnite, CONDITIONNEMENT_UNITE_EDEFAULT, oldConditionnementUniteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConditionnementUnite() {
		return conditionnementUniteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoUniteBeneficiaireMaterielCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoUniteBeneficiaireMaterielCategorie newCategorie) {
		TypeDictionaryDicoUniteBeneficiaireMaterielCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE_BENEFICIAIRE_MATERIEL__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoUniteBeneficiaireMaterielCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_UNITE_BENEFICIAIRE_MATERIEL__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCategorie() {
		return categorieESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getConcerneTypeMateriel() {
		return concerneTypeMateriel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcerneTypeMateriel(TypeAssociationEXT newConcerneTypeMateriel, NotificationChain msgs) {
		TypeAssociationEXT oldConcerneTypeMateriel = concerneTypeMateriel;
		concerneTypeMateriel = newConcerneTypeMateriel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE_BENEFICIAIRE_MATERIEL__CONCERNE_TYPE_MATERIEL, oldConcerneTypeMateriel, newConcerneTypeMateriel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcerneTypeMateriel(TypeAssociationEXT newConcerneTypeMateriel) {
		if (newConcerneTypeMateriel != concerneTypeMateriel) {
			NotificationChain msgs = null;
			if (concerneTypeMateriel != null)
				msgs = ((InternalEObject)concerneTypeMateriel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_UNITE_BENEFICIAIRE_MATERIEL__CONCERNE_TYPE_MATERIEL, null, msgs);
			if (newConcerneTypeMateriel != null)
				msgs = ((InternalEObject)newConcerneTypeMateriel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_UNITE_BENEFICIAIRE_MATERIEL__CONCERNE_TYPE_MATERIEL, null, msgs);
			msgs = basicSetConcerneTypeMateriel(newConcerneTypeMateriel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE_BENEFICIAIRE_MATERIEL__CONCERNE_TYPE_MATERIEL, newConcerneTypeMateriel, newConcerneTypeMateriel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeModaliteObtention getAPourModaliteObtentionModaliteObtention() {
		return aPourModaliteObtentionModaliteObtention;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourModaliteObtentionModaliteObtention(TypeModaliteObtention newAPourModaliteObtentionModaliteObtention, NotificationChain msgs) {
		TypeModaliteObtention oldAPourModaliteObtentionModaliteObtention = aPourModaliteObtentionModaliteObtention;
		aPourModaliteObtentionModaliteObtention = newAPourModaliteObtentionModaliteObtention;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE_BENEFICIAIRE_MATERIEL__APOUR_MODALITE_OBTENTION_MODALITE_OBTENTION, oldAPourModaliteObtentionModaliteObtention, newAPourModaliteObtentionModaliteObtention);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourModaliteObtentionModaliteObtention(TypeModaliteObtention newAPourModaliteObtentionModaliteObtention) {
		if (newAPourModaliteObtentionModaliteObtention != aPourModaliteObtentionModaliteObtention) {
			NotificationChain msgs = null;
			if (aPourModaliteObtentionModaliteObtention != null)
				msgs = ((InternalEObject)aPourModaliteObtentionModaliteObtention).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_UNITE_BENEFICIAIRE_MATERIEL__APOUR_MODALITE_OBTENTION_MODALITE_OBTENTION, null, msgs);
			if (newAPourModaliteObtentionModaliteObtention != null)
				msgs = ((InternalEObject)newAPourModaliteObtentionModaliteObtention).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_UNITE_BENEFICIAIRE_MATERIEL__APOUR_MODALITE_OBTENTION_MODALITE_OBTENTION, null, msgs);
			msgs = basicSetAPourModaliteObtentionModaliteObtention(newAPourModaliteObtentionModaliteObtention, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE_BENEFICIAIRE_MATERIEL__APOUR_MODALITE_OBTENTION_MODALITE_OBTENTION, newAPourModaliteObtentionModaliteObtention, newAPourModaliteObtentionModaliteObtention));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_UNITE_BENEFICIAIRE_MATERIEL__CONCERNE_TYPE_MATERIEL:
				return basicSetConcerneTypeMateriel(null, msgs);
			case SchemaPackage.TYPE_UNITE_BENEFICIAIRE_MATERIEL__APOUR_MODALITE_OBTENTION_MODALITE_OBTENTION:
				return basicSetAPourModaliteObtentionModaliteObtention(null, msgs);
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
			case SchemaPackage.TYPE_UNITE_BENEFICIAIRE_MATERIEL__QUANTITE_ALLOUEE:
				return new Long(getQuantiteAllouee());
			case SchemaPackage.TYPE_UNITE_BENEFICIAIRE_MATERIEL__CONDITIONNEMENT_UNITE:
				return getConditionnementUnite();
			case SchemaPackage.TYPE_UNITE_BENEFICIAIRE_MATERIEL__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_UNITE_BENEFICIAIRE_MATERIEL__CONCERNE_TYPE_MATERIEL:
				return getConcerneTypeMateriel();
			case SchemaPackage.TYPE_UNITE_BENEFICIAIRE_MATERIEL__APOUR_MODALITE_OBTENTION_MODALITE_OBTENTION:
				return getAPourModaliteObtentionModaliteObtention();
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
			case SchemaPackage.TYPE_UNITE_BENEFICIAIRE_MATERIEL__QUANTITE_ALLOUEE:
				setQuantiteAllouee(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_UNITE_BENEFICIAIRE_MATERIEL__CONDITIONNEMENT_UNITE:
				setConditionnementUnite((TypeDictionaryDicoConditionnementUnite)newValue);
				return;
			case SchemaPackage.TYPE_UNITE_BENEFICIAIRE_MATERIEL__CATEGORIE:
				setCategorie((TypeDictionaryDicoUniteBeneficiaireMaterielCategorie)newValue);
				return;
			case SchemaPackage.TYPE_UNITE_BENEFICIAIRE_MATERIEL__CONCERNE_TYPE_MATERIEL:
				setConcerneTypeMateriel((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_UNITE_BENEFICIAIRE_MATERIEL__APOUR_MODALITE_OBTENTION_MODALITE_OBTENTION:
				setAPourModaliteObtentionModaliteObtention((TypeModaliteObtention)newValue);
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
			case SchemaPackage.TYPE_UNITE_BENEFICIAIRE_MATERIEL__QUANTITE_ALLOUEE:
				unsetQuantiteAllouee();
				return;
			case SchemaPackage.TYPE_UNITE_BENEFICIAIRE_MATERIEL__CONDITIONNEMENT_UNITE:
				unsetConditionnementUnite();
				return;
			case SchemaPackage.TYPE_UNITE_BENEFICIAIRE_MATERIEL__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_UNITE_BENEFICIAIRE_MATERIEL__CONCERNE_TYPE_MATERIEL:
				setConcerneTypeMateriel((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_UNITE_BENEFICIAIRE_MATERIEL__APOUR_MODALITE_OBTENTION_MODALITE_OBTENTION:
				setAPourModaliteObtentionModaliteObtention((TypeModaliteObtention)null);
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
			case SchemaPackage.TYPE_UNITE_BENEFICIAIRE_MATERIEL__QUANTITE_ALLOUEE:
				return isSetQuantiteAllouee();
			case SchemaPackage.TYPE_UNITE_BENEFICIAIRE_MATERIEL__CONDITIONNEMENT_UNITE:
				return isSetConditionnementUnite();
			case SchemaPackage.TYPE_UNITE_BENEFICIAIRE_MATERIEL__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_UNITE_BENEFICIAIRE_MATERIEL__CONCERNE_TYPE_MATERIEL:
				return concerneTypeMateriel != null;
			case SchemaPackage.TYPE_UNITE_BENEFICIAIRE_MATERIEL__APOUR_MODALITE_OBTENTION_MODALITE_OBTENTION:
				return aPourModaliteObtentionModaliteObtention != null;
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
		result.append(" (quantiteAllouee: ");
		if (quantiteAlloueeESet) result.append(quantiteAllouee); else result.append("<unset>");
		result.append(", conditionnementUnite: ");
		if (conditionnementUniteESet) result.append(conditionnementUnite); else result.append("<unset>");
		result.append(", categorie: ");
		if (categorieESet) result.append(categorie); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeUniteBeneficiaireMaterielImpl
