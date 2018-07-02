/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCapaciteOperationnelle;
import mpia.schema.TypeDictionaryDicoCapaciteOperationnelleCategorie;
import mpia.schema.TypeDictionaryDicoCapaciteOperationnelleNiveau;
import mpia.schema.TypeDictionaryDicoCapaciteOperationnelleQualificatif;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Capacite Operationnelle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeCapaciteOperationnelleImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteOperationnelleImpl#getNiveau <em>Niveau</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteOperationnelleImpl#getQualificatif <em>Qualificatif</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeCapaciteOperationnelleImpl extends TypeCapaciteImpl implements TypeCapaciteOperationnelle {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCapaciteOperationnelleCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoCapaciteOperationnelleCategorie.ARASLT;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCapaciteOperationnelleCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The default value of the '{@link #getNiveau() <em>Niveau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveau()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCapaciteOperationnelleNiveau NIVEAU_EDEFAULT = TypeDictionaryDicoCapaciteOperationnelleNiveau.CORPS;

	/**
	 * The cached value of the '{@link #getNiveau() <em>Niveau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveau()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCapaciteOperationnelleNiveau niveau = NIVEAU_EDEFAULT;

	/**
	 * This is true if the Niveau attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean niveauESet;

	/**
	 * The default value of the '{@link #getQualificatif() <em>Qualificatif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualificatif()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCapaciteOperationnelleQualificatif QUALIFICATIF_EDEFAULT = TypeDictionaryDicoCapaciteOperationnelleQualificatif.MEDIUM;

	/**
	 * The cached value of the '{@link #getQualificatif() <em>Qualificatif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualificatif()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCapaciteOperationnelleQualificatif qualificatif = QUALIFICATIF_EDEFAULT;

	/**
	 * This is true if the Qualificatif attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean qualificatifESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeCapaciteOperationnelleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeCapaciteOperationnelle();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoCapaciteOperationnelleCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoCapaciteOperationnelleCategorie newCategorie) {
		TypeDictionaryDicoCapaciteOperationnelleCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_OPERATIONNELLE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoCapaciteOperationnelleCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAPACITE_OPERATIONNELLE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeDictionaryDicoCapaciteOperationnelleNiveau getNiveau() {
		return niveau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNiveau(TypeDictionaryDicoCapaciteOperationnelleNiveau newNiveau) {
		TypeDictionaryDicoCapaciteOperationnelleNiveau oldNiveau = niveau;
		niveau = newNiveau == null ? NIVEAU_EDEFAULT : newNiveau;
		boolean oldNiveauESet = niveauESet;
		niveauESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_OPERATIONNELLE__NIVEAU, oldNiveau, niveau, !oldNiveauESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNiveau() {
		TypeDictionaryDicoCapaciteOperationnelleNiveau oldNiveau = niveau;
		boolean oldNiveauESet = niveauESet;
		niveau = NIVEAU_EDEFAULT;
		niveauESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAPACITE_OPERATIONNELLE__NIVEAU, oldNiveau, NIVEAU_EDEFAULT, oldNiveauESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNiveau() {
		return niveauESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoCapaciteOperationnelleQualificatif getQualificatif() {
		return qualificatif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualificatif(TypeDictionaryDicoCapaciteOperationnelleQualificatif newQualificatif) {
		TypeDictionaryDicoCapaciteOperationnelleQualificatif oldQualificatif = qualificatif;
		qualificatif = newQualificatif == null ? QUALIFICATIF_EDEFAULT : newQualificatif;
		boolean oldQualificatifESet = qualificatifESet;
		qualificatifESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_OPERATIONNELLE__QUALIFICATIF, oldQualificatif, qualificatif, !oldQualificatifESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQualificatif() {
		TypeDictionaryDicoCapaciteOperationnelleQualificatif oldQualificatif = qualificatif;
		boolean oldQualificatifESet = qualificatifESet;
		qualificatif = QUALIFICATIF_EDEFAULT;
		qualificatifESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAPACITE_OPERATIONNELLE__QUALIFICATIF, oldQualificatif, QUALIFICATIF_EDEFAULT, oldQualificatifESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQualificatif() {
		return qualificatifESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_CAPACITE_OPERATIONNELLE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_CAPACITE_OPERATIONNELLE__NIVEAU:
				return getNiveau();
			case SchemaPackage.TYPE_CAPACITE_OPERATIONNELLE__QUALIFICATIF:
				return getQualificatif();
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
			case SchemaPackage.TYPE_CAPACITE_OPERATIONNELLE__CATEGORIE:
				setCategorie((TypeDictionaryDicoCapaciteOperationnelleCategorie)newValue);
				return;
			case SchemaPackage.TYPE_CAPACITE_OPERATIONNELLE__NIVEAU:
				setNiveau((TypeDictionaryDicoCapaciteOperationnelleNiveau)newValue);
				return;
			case SchemaPackage.TYPE_CAPACITE_OPERATIONNELLE__QUALIFICATIF:
				setQualificatif((TypeDictionaryDicoCapaciteOperationnelleQualificatif)newValue);
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
			case SchemaPackage.TYPE_CAPACITE_OPERATIONNELLE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_CAPACITE_OPERATIONNELLE__NIVEAU:
				unsetNiveau();
				return;
			case SchemaPackage.TYPE_CAPACITE_OPERATIONNELLE__QUALIFICATIF:
				unsetQualificatif();
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
			case SchemaPackage.TYPE_CAPACITE_OPERATIONNELLE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_CAPACITE_OPERATIONNELLE__NIVEAU:
				return isSetNiveau();
			case SchemaPackage.TYPE_CAPACITE_OPERATIONNELLE__QUALIFICATIF:
				return isSetQualificatif();
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
		result.append(" (categorie: ");
		if (categorieESet) result.append(categorie); else result.append("<unset>");
		result.append(", niveau: ");
		if (niveauESet) result.append(niveau); else result.append("<unset>");
		result.append(", qualificatif: ");
		if (qualificatifESet) result.append(qualificatif); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeCapaciteOperationnelleImpl
