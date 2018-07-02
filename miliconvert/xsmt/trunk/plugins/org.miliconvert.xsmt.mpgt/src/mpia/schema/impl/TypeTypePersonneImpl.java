/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoTypePersonneCategorie;
import mpia.schema.TypeDictionaryDicoTypePersonneGrade;
import mpia.schema.TypeDictionaryDicoTypePersonneSexe;
import mpia.schema.TypeDictionaryDicoTypePersonneSousCategorie;
import mpia.schema.TypeTypePersonne;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Type Personne</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeTypePersonneImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypePersonneImpl#getSousCategorie <em>Sous Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypePersonneImpl#getGrade <em>Grade</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypePersonneImpl#getSexe <em>Sexe</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeTypePersonneImpl extends TypeTypeImpl implements TypeTypePersonne {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypePersonneCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoTypePersonneCategorie.CIV;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypePersonneCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The default value of the '{@link #getSousCategorie() <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSousCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypePersonneSousCategorie SOUS_CATEGORIE_EDEFAULT = TypeDictionaryDicoTypePersonneSousCategorie.DSPLPR;

	/**
	 * The cached value of the '{@link #getSousCategorie() <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSousCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypePersonneSousCategorie sousCategorie = SOUS_CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Sous Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sousCategorieESet;

	/**
	 * The default value of the '{@link #getGrade() <em>Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrade()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypePersonneGrade GRADE_EDEFAULT = TypeDictionaryDicoTypePersonneGrade.OF1;

	/**
	 * The cached value of the '{@link #getGrade() <em>Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrade()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypePersonneGrade grade = GRADE_EDEFAULT;

	/**
	 * This is true if the Grade attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean gradeESet;

	/**
	 * The default value of the '{@link #getSexe() <em>Sexe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSexe()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypePersonneSexe SEXE_EDEFAULT = TypeDictionaryDicoTypePersonneSexe.MALE;

	/**
	 * The cached value of the '{@link #getSexe() <em>Sexe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSexe()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypePersonneSexe sexe = SEXE_EDEFAULT;

	/**
	 * This is true if the Sexe attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sexeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeTypePersonneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeTypePersonne();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypePersonneCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoTypePersonneCategorie newCategorie) {
		TypeDictionaryDicoTypePersonneCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_PERSONNE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoTypePersonneCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_PERSONNE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeDictionaryDicoTypePersonneSousCategorie getSousCategorie() {
		return sousCategorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSousCategorie(TypeDictionaryDicoTypePersonneSousCategorie newSousCategorie) {
		TypeDictionaryDicoTypePersonneSousCategorie oldSousCategorie = sousCategorie;
		sousCategorie = newSousCategorie == null ? SOUS_CATEGORIE_EDEFAULT : newSousCategorie;
		boolean oldSousCategorieESet = sousCategorieESet;
		sousCategorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_PERSONNE__SOUS_CATEGORIE, oldSousCategorie, sousCategorie, !oldSousCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSousCategorie() {
		TypeDictionaryDicoTypePersonneSousCategorie oldSousCategorie = sousCategorie;
		boolean oldSousCategorieESet = sousCategorieESet;
		sousCategorie = SOUS_CATEGORIE_EDEFAULT;
		sousCategorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_PERSONNE__SOUS_CATEGORIE, oldSousCategorie, SOUS_CATEGORIE_EDEFAULT, oldSousCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSousCategorie() {
		return sousCategorieESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypePersonneGrade getGrade() {
		return grade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrade(TypeDictionaryDicoTypePersonneGrade newGrade) {
		TypeDictionaryDicoTypePersonneGrade oldGrade = grade;
		grade = newGrade == null ? GRADE_EDEFAULT : newGrade;
		boolean oldGradeESet = gradeESet;
		gradeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_PERSONNE__GRADE, oldGrade, grade, !oldGradeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGrade() {
		TypeDictionaryDicoTypePersonneGrade oldGrade = grade;
		boolean oldGradeESet = gradeESet;
		grade = GRADE_EDEFAULT;
		gradeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_PERSONNE__GRADE, oldGrade, GRADE_EDEFAULT, oldGradeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGrade() {
		return gradeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypePersonneSexe getSexe() {
		return sexe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSexe(TypeDictionaryDicoTypePersonneSexe newSexe) {
		TypeDictionaryDicoTypePersonneSexe oldSexe = sexe;
		sexe = newSexe == null ? SEXE_EDEFAULT : newSexe;
		boolean oldSexeESet = sexeESet;
		sexeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_PERSONNE__SEXE, oldSexe, sexe, !oldSexeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSexe() {
		TypeDictionaryDicoTypePersonneSexe oldSexe = sexe;
		boolean oldSexeESet = sexeESet;
		sexe = SEXE_EDEFAULT;
		sexeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_PERSONNE__SEXE, oldSexe, SEXE_EDEFAULT, oldSexeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSexe() {
		return sexeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_TYPE_PERSONNE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_TYPE_PERSONNE__SOUS_CATEGORIE:
				return getSousCategorie();
			case SchemaPackage.TYPE_TYPE_PERSONNE__GRADE:
				return getGrade();
			case SchemaPackage.TYPE_TYPE_PERSONNE__SEXE:
				return getSexe();
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
			case SchemaPackage.TYPE_TYPE_PERSONNE__CATEGORIE:
				setCategorie((TypeDictionaryDicoTypePersonneCategorie)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_PERSONNE__SOUS_CATEGORIE:
				setSousCategorie((TypeDictionaryDicoTypePersonneSousCategorie)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_PERSONNE__GRADE:
				setGrade((TypeDictionaryDicoTypePersonneGrade)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_PERSONNE__SEXE:
				setSexe((TypeDictionaryDicoTypePersonneSexe)newValue);
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
			case SchemaPackage.TYPE_TYPE_PERSONNE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_TYPE_PERSONNE__SOUS_CATEGORIE:
				unsetSousCategorie();
				return;
			case SchemaPackage.TYPE_TYPE_PERSONNE__GRADE:
				unsetGrade();
				return;
			case SchemaPackage.TYPE_TYPE_PERSONNE__SEXE:
				unsetSexe();
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
			case SchemaPackage.TYPE_TYPE_PERSONNE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_TYPE_PERSONNE__SOUS_CATEGORIE:
				return isSetSousCategorie();
			case SchemaPackage.TYPE_TYPE_PERSONNE__GRADE:
				return isSetGrade();
			case SchemaPackage.TYPE_TYPE_PERSONNE__SEXE:
				return isSetSexe();
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
		result.append(", sousCategorie: ");
		if (sousCategorieESet) result.append(sousCategorie); else result.append("<unset>");
		result.append(", grade: ");
		if (gradeESet) result.append(grade); else result.append("<unset>");
		result.append(", sexe: ");
		if (sexeESet) result.append(sexe); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeTypePersonneImpl
