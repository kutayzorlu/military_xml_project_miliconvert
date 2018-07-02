/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssocSymboleTactique;
import mpia.schema.TypeDictionaryDicoAssocSymboleTactiqueCategorie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Assoc Symbole Tactique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssocSymboleTactiqueImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssocSymboleTactiqueImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssocSymboleTactiqueImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssocSymboleTactiqueImpl#getAssocieCommeSujetSymboleTactique <em>Associe Comme Sujet Symbole Tactique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssocSymboleTactiqueImpl#getAssocieCommeObjetSymboleTactique <em>Associe Comme Objet Symbole Tactique</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssocSymboleTactiqueImpl extends EObjectImpl implements TypeAssocSymboleTactique {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAssocSymboleTactiqueCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAssocSymboleTactiqueCategorie.COMPOSED;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssocSymboleTactiqueCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

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
	 * The cached value of the '{@link #getAssocieCommeSujetSymboleTactique() <em>Associe Comme Sujet Symbole Tactique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeSujetSymboleTactique()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeSujetSymboleTactique;

	/**
	 * The cached value of the '{@link #getAssocieCommeObjetSymboleTactique() <em>Associe Comme Objet Symbole Tactique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeObjetSymboleTactique()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeObjetSymboleTactique;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssocSymboleTactiqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssocSymboleTactique();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAssocSymboleTactiqueCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAssocSymboleTactiqueCategorie newCategorie) {
		TypeDictionaryDicoAssocSymboleTactiqueCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_SYMBOLE_TACTIQUE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAssocSymboleTactiqueCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOC_SYMBOLE_TACTIQUE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_SYMBOLE_TACTIQUE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_SYMBOLE_TACTIQUE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAssocieCommeSujetSymboleTactique() {
		return associeCommeSujetSymboleTactique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeSujetSymboleTactique(TypeAssociation newAssocieCommeSujetSymboleTactique, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeSujetSymboleTactique = associeCommeSujetSymboleTactique;
		associeCommeSujetSymboleTactique = newAssocieCommeSujetSymboleTactique;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_SYMBOLE_TACTIQUE__ASSOCIE_COMME_SUJET_SYMBOLE_TACTIQUE, oldAssocieCommeSujetSymboleTactique, newAssocieCommeSujetSymboleTactique);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeSujetSymboleTactique(TypeAssociation newAssocieCommeSujetSymboleTactique) {
		if (newAssocieCommeSujetSymboleTactique != associeCommeSujetSymboleTactique) {
			NotificationChain msgs = null;
			if (associeCommeSujetSymboleTactique != null)
				msgs = ((InternalEObject)associeCommeSujetSymboleTactique).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOC_SYMBOLE_TACTIQUE__ASSOCIE_COMME_SUJET_SYMBOLE_TACTIQUE, null, msgs);
			if (newAssocieCommeSujetSymboleTactique != null)
				msgs = ((InternalEObject)newAssocieCommeSujetSymboleTactique).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOC_SYMBOLE_TACTIQUE__ASSOCIE_COMME_SUJET_SYMBOLE_TACTIQUE, null, msgs);
			msgs = basicSetAssocieCommeSujetSymboleTactique(newAssocieCommeSujetSymboleTactique, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_SYMBOLE_TACTIQUE__ASSOCIE_COMME_SUJET_SYMBOLE_TACTIQUE, newAssocieCommeSujetSymboleTactique, newAssocieCommeSujetSymboleTactique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAssocieCommeObjetSymboleTactique() {
		return associeCommeObjetSymboleTactique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeObjetSymboleTactique(TypeAssociation newAssocieCommeObjetSymboleTactique, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeObjetSymboleTactique = associeCommeObjetSymboleTactique;
		associeCommeObjetSymboleTactique = newAssocieCommeObjetSymboleTactique;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_SYMBOLE_TACTIQUE__ASSOCIE_COMME_OBJET_SYMBOLE_TACTIQUE, oldAssocieCommeObjetSymboleTactique, newAssocieCommeObjetSymboleTactique);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeObjetSymboleTactique(TypeAssociation newAssocieCommeObjetSymboleTactique) {
		if (newAssocieCommeObjetSymboleTactique != associeCommeObjetSymboleTactique) {
			NotificationChain msgs = null;
			if (associeCommeObjetSymboleTactique != null)
				msgs = ((InternalEObject)associeCommeObjetSymboleTactique).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOC_SYMBOLE_TACTIQUE__ASSOCIE_COMME_OBJET_SYMBOLE_TACTIQUE, null, msgs);
			if (newAssocieCommeObjetSymboleTactique != null)
				msgs = ((InternalEObject)newAssocieCommeObjetSymboleTactique).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOC_SYMBOLE_TACTIQUE__ASSOCIE_COMME_OBJET_SYMBOLE_TACTIQUE, null, msgs);
			msgs = basicSetAssocieCommeObjetSymboleTactique(newAssocieCommeObjetSymboleTactique, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_SYMBOLE_TACTIQUE__ASSOCIE_COMME_OBJET_SYMBOLE_TACTIQUE, newAssocieCommeObjetSymboleTactique, newAssocieCommeObjetSymboleTactique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOC_SYMBOLE_TACTIQUE__ASSOCIE_COMME_SUJET_SYMBOLE_TACTIQUE:
				return basicSetAssocieCommeSujetSymboleTactique(null, msgs);
			case SchemaPackage.TYPE_ASSOC_SYMBOLE_TACTIQUE__ASSOCIE_COMME_OBJET_SYMBOLE_TACTIQUE:
				return basicSetAssocieCommeObjetSymboleTactique(null, msgs);
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
			case SchemaPackage.TYPE_ASSOC_SYMBOLE_TACTIQUE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOC_SYMBOLE_TACTIQUE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ASSOC_SYMBOLE_TACTIQUE__CE:
				return getCE();
			case SchemaPackage.TYPE_ASSOC_SYMBOLE_TACTIQUE__ASSOCIE_COMME_SUJET_SYMBOLE_TACTIQUE:
				return getAssocieCommeSujetSymboleTactique();
			case SchemaPackage.TYPE_ASSOC_SYMBOLE_TACTIQUE__ASSOCIE_COMME_OBJET_SYMBOLE_TACTIQUE:
				return getAssocieCommeObjetSymboleTactique();
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
			case SchemaPackage.TYPE_ASSOC_SYMBOLE_TACTIQUE__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssocSymboleTactiqueCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOC_SYMBOLE_TACTIQUE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOC_SYMBOLE_TACTIQUE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOC_SYMBOLE_TACTIQUE__ASSOCIE_COMME_SUJET_SYMBOLE_TACTIQUE:
				setAssocieCommeSujetSymboleTactique((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOC_SYMBOLE_TACTIQUE__ASSOCIE_COMME_OBJET_SYMBOLE_TACTIQUE:
				setAssocieCommeObjetSymboleTactique((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOC_SYMBOLE_TACTIQUE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOC_SYMBOLE_TACTIQUE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOC_SYMBOLE_TACTIQUE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOC_SYMBOLE_TACTIQUE__ASSOCIE_COMME_SUJET_SYMBOLE_TACTIQUE:
				setAssocieCommeSujetSymboleTactique((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOC_SYMBOLE_TACTIQUE__ASSOCIE_COMME_OBJET_SYMBOLE_TACTIQUE:
				setAssocieCommeObjetSymboleTactique((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOC_SYMBOLE_TACTIQUE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOC_SYMBOLE_TACTIQUE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ASSOC_SYMBOLE_TACTIQUE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ASSOC_SYMBOLE_TACTIQUE__ASSOCIE_COMME_SUJET_SYMBOLE_TACTIQUE:
				return associeCommeSujetSymboleTactique != null;
			case SchemaPackage.TYPE_ASSOC_SYMBOLE_TACTIQUE__ASSOCIE_COMME_OBJET_SYMBOLE_TACTIQUE:
				return associeCommeObjetSymboleTactique != null;
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
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeAssocSymboleTactiqueImpl
