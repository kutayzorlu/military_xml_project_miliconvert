/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeDuree;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoSpecialitePersonneCategorie;
import mpia.schema.TypeDictionaryDicoSpecialitePersonneFonction;
import mpia.schema.TypeSpecialitePersonne;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Specialite Personne</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeSpecialitePersonneImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSpecialitePersonneImpl#getSousCategorie <em>Sous Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSpecialitePersonneImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSpecialitePersonneImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSpecialitePersonneImpl#getFonction <em>Fonction</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSpecialitePersonneImpl#getNbrHeuresVolCumule <em>Nbr Heures Vol Cumule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeSpecialitePersonneImpl extends EObjectImpl implements TypeSpecialitePersonne {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoSpecialitePersonneCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoSpecialitePersonneCategorie.D;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoSpecialitePersonneCategorie categorie = CATEGORIE_EDEFAULT;

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
	protected static final String SOUS_CATEGORIE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSousCategorie() <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSousCategorie()
	 * @generated
	 * @ordered
	 */
	protected String sousCategorie = SOUS_CATEGORIE_EDEFAULT;

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
	 * The default value of the '{@link #getFonction() <em>Fonction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFonction()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoSpecialitePersonneFonction FONCTION_EDEFAULT = TypeDictionaryDicoSpecialitePersonneFonction.CPTP;

	/**
	 * The cached value of the '{@link #getFonction() <em>Fonction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFonction()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoSpecialitePersonneFonction fonction = FONCTION_EDEFAULT;

	/**
	 * This is true if the Fonction attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fonctionESet;

	/**
	 * The cached value of the '{@link #getNbrHeuresVolCumule() <em>Nbr Heures Vol Cumule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbrHeuresVolCumule()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree nbrHeuresVolCumule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeSpecialitePersonneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeSpecialitePersonne();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoSpecialitePersonneCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoSpecialitePersonneCategorie newCategorie) {
		TypeDictionaryDicoSpecialitePersonneCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SPECIALITE_PERSONNE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoSpecialitePersonneCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SPECIALITE_PERSONNE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public String getSousCategorie() {
		return sousCategorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSousCategorie(String newSousCategorie) {
		String oldSousCategorie = sousCategorie;
		sousCategorie = newSousCategorie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SPECIALITE_PERSONNE__SOUS_CATEGORIE, oldSousCategorie, sousCategorie));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SPECIALITE_PERSONNE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SPECIALITE_PERSONNE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoSpecialitePersonneFonction getFonction() {
		return fonction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFonction(TypeDictionaryDicoSpecialitePersonneFonction newFonction) {
		TypeDictionaryDicoSpecialitePersonneFonction oldFonction = fonction;
		fonction = newFonction == null ? FONCTION_EDEFAULT : newFonction;
		boolean oldFonctionESet = fonctionESet;
		fonctionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SPECIALITE_PERSONNE__FONCTION, oldFonction, fonction, !oldFonctionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFonction() {
		TypeDictionaryDicoSpecialitePersonneFonction oldFonction = fonction;
		boolean oldFonctionESet = fonctionESet;
		fonction = FONCTION_EDEFAULT;
		fonctionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SPECIALITE_PERSONNE__FONCTION, oldFonction, FONCTION_EDEFAULT, oldFonctionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFonction() {
		return fonctionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getNbrHeuresVolCumule() {
		return nbrHeuresVolCumule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNbrHeuresVolCumule(TypeDataTypeDuree newNbrHeuresVolCumule, NotificationChain msgs) {
		TypeDataTypeDuree oldNbrHeuresVolCumule = nbrHeuresVolCumule;
		nbrHeuresVolCumule = newNbrHeuresVolCumule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SPECIALITE_PERSONNE__NBR_HEURES_VOL_CUMULE, oldNbrHeuresVolCumule, newNbrHeuresVolCumule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbrHeuresVolCumule(TypeDataTypeDuree newNbrHeuresVolCumule) {
		if (newNbrHeuresVolCumule != nbrHeuresVolCumule) {
			NotificationChain msgs = null;
			if (nbrHeuresVolCumule != null)
				msgs = ((InternalEObject)nbrHeuresVolCumule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SPECIALITE_PERSONNE__NBR_HEURES_VOL_CUMULE, null, msgs);
			if (newNbrHeuresVolCumule != null)
				msgs = ((InternalEObject)newNbrHeuresVolCumule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SPECIALITE_PERSONNE__NBR_HEURES_VOL_CUMULE, null, msgs);
			msgs = basicSetNbrHeuresVolCumule(newNbrHeuresVolCumule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SPECIALITE_PERSONNE__NBR_HEURES_VOL_CUMULE, newNbrHeuresVolCumule, newNbrHeuresVolCumule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_SPECIALITE_PERSONNE__NBR_HEURES_VOL_CUMULE:
				return basicSetNbrHeuresVolCumule(null, msgs);
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
			case SchemaPackage.TYPE_SPECIALITE_PERSONNE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_SPECIALITE_PERSONNE__SOUS_CATEGORIE:
				return getSousCategorie();
			case SchemaPackage.TYPE_SPECIALITE_PERSONNE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_SPECIALITE_PERSONNE__CE:
				return getCE();
			case SchemaPackage.TYPE_SPECIALITE_PERSONNE__FONCTION:
				return getFonction();
			case SchemaPackage.TYPE_SPECIALITE_PERSONNE__NBR_HEURES_VOL_CUMULE:
				return getNbrHeuresVolCumule();
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
			case SchemaPackage.TYPE_SPECIALITE_PERSONNE__CATEGORIE:
				setCategorie((TypeDictionaryDicoSpecialitePersonneCategorie)newValue);
				return;
			case SchemaPackage.TYPE_SPECIALITE_PERSONNE__SOUS_CATEGORIE:
				setSousCategorie((String)newValue);
				return;
			case SchemaPackage.TYPE_SPECIALITE_PERSONNE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_SPECIALITE_PERSONNE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_SPECIALITE_PERSONNE__FONCTION:
				setFonction((TypeDictionaryDicoSpecialitePersonneFonction)newValue);
				return;
			case SchemaPackage.TYPE_SPECIALITE_PERSONNE__NBR_HEURES_VOL_CUMULE:
				setNbrHeuresVolCumule((TypeDataTypeDuree)newValue);
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
			case SchemaPackage.TYPE_SPECIALITE_PERSONNE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_SPECIALITE_PERSONNE__SOUS_CATEGORIE:
				setSousCategorie(SOUS_CATEGORIE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SPECIALITE_PERSONNE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SPECIALITE_PERSONNE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SPECIALITE_PERSONNE__FONCTION:
				unsetFonction();
				return;
			case SchemaPackage.TYPE_SPECIALITE_PERSONNE__NBR_HEURES_VOL_CUMULE:
				setNbrHeuresVolCumule((TypeDataTypeDuree)null);
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
			case SchemaPackage.TYPE_SPECIALITE_PERSONNE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_SPECIALITE_PERSONNE__SOUS_CATEGORIE:
				return SOUS_CATEGORIE_EDEFAULT == null ? sousCategorie != null : !SOUS_CATEGORIE_EDEFAULT.equals(sousCategorie);
			case SchemaPackage.TYPE_SPECIALITE_PERSONNE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_SPECIALITE_PERSONNE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_SPECIALITE_PERSONNE__FONCTION:
				return isSetFonction();
			case SchemaPackage.TYPE_SPECIALITE_PERSONNE__NBR_HEURES_VOL_CUMULE:
				return nbrHeuresVolCumule != null;
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
		result.append(sousCategorie);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(", fonction: ");
		if (fonctionESet) result.append(fonction); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeSpecialitePersonneImpl
