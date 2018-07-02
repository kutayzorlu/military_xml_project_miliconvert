/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoTypePosteMilitaireCategorie;
import mpia.schema.TypeDictionaryDicoTypePosteMilitaireGrade;
import mpia.schema.TypeTypePosteMilitaire;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Type Poste Militaire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeTypePosteMilitaireImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypePosteMilitaireImpl#getGrade <em>Grade</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeTypePosteMilitaireImpl extends TypeTypeOrganisationGouvernementaleImpl implements TypeTypePosteMilitaire {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypePosteMilitaireCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoTypePosteMilitaireCategorie.AJAATC;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypePosteMilitaireCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The default value of the '{@link #getGrade() <em>Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrade()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypePosteMilitaireGrade GRADE_EDEFAULT = TypeDictionaryDicoTypePosteMilitaireGrade.EPTE;

	/**
	 * The cached value of the '{@link #getGrade() <em>Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrade()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypePosteMilitaireGrade grade = GRADE_EDEFAULT;

	/**
	 * This is true if the Grade attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean gradeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeTypePosteMilitaireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeTypePosteMilitaire();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypePosteMilitaireCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoTypePosteMilitaireCategorie newCategorie) {
		TypeDictionaryDicoTypePosteMilitaireCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_POSTE_MILITAIRE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoTypePosteMilitaireCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_POSTE_MILITAIRE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeDictionaryDicoTypePosteMilitaireGrade getGrade() {
		return grade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrade(TypeDictionaryDicoTypePosteMilitaireGrade newGrade) {
		TypeDictionaryDicoTypePosteMilitaireGrade oldGrade = grade;
		grade = newGrade == null ? GRADE_EDEFAULT : newGrade;
		boolean oldGradeESet = gradeESet;
		gradeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_POSTE_MILITAIRE__GRADE, oldGrade, grade, !oldGradeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGrade() {
		TypeDictionaryDicoTypePosteMilitaireGrade oldGrade = grade;
		boolean oldGradeESet = gradeESet;
		grade = GRADE_EDEFAULT;
		gradeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_POSTE_MILITAIRE__GRADE, oldGrade, GRADE_EDEFAULT, oldGradeESet));
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_TYPE_POSTE_MILITAIRE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_TYPE_POSTE_MILITAIRE__GRADE:
				return getGrade();
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
			case SchemaPackage.TYPE_TYPE_POSTE_MILITAIRE__CATEGORIE:
				setCategorie((TypeDictionaryDicoTypePosteMilitaireCategorie)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_POSTE_MILITAIRE__GRADE:
				setGrade((TypeDictionaryDicoTypePosteMilitaireGrade)newValue);
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
			case SchemaPackage.TYPE_TYPE_POSTE_MILITAIRE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_TYPE_POSTE_MILITAIRE__GRADE:
				unsetGrade();
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
			case SchemaPackage.TYPE_TYPE_POSTE_MILITAIRE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_TYPE_POSTE_MILITAIRE__GRADE:
				return isSetGrade();
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
		result.append(", grade: ");
		if (gradeESet) result.append(grade); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeTypePosteMilitaireImpl
