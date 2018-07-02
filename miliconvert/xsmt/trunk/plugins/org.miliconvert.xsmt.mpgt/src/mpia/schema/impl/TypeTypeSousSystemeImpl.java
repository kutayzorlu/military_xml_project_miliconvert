/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoTypeSousSystemeCategorie;
import mpia.schema.TypeDictionaryDicoTypeSousSystemeTypeFonctionnement;
import mpia.schema.TypeTypeSousSysteme;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Type Sous Systeme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeTypeSousSystemeImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeSousSystemeImpl#getAutreCategorie <em>Autre Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeSousSystemeImpl#getTypeFonctionnement <em>Type Fonctionnement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeSousSystemeImpl#getAutrePanne <em>Autre Panne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeSousSystemeImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeSousSystemeImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeSousSystemeImpl#getConcerneTypeEquipement <em>Concerne Type Equipement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeTypeSousSystemeImpl extends EObjectImpl implements TypeTypeSousSysteme {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeSousSystemeCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoTypeSousSystemeCategorie.AIR;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeSousSystemeCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The default value of the '{@link #getAutreCategorie() <em>Autre Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutreCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTRE_CATEGORIE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutreCategorie() <em>Autre Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutreCategorie()
	 * @generated
	 * @ordered
	 */
	protected String autreCategorie = AUTRE_CATEGORIE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeFonctionnement() <em>Type Fonctionnement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeFonctionnement()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeSousSystemeTypeFonctionnement TYPE_FONCTIONNEMENT_EDEFAULT = TypeDictionaryDicoTypeSousSystemeTypeFonctionnement.F;

	/**
	 * The cached value of the '{@link #getTypeFonctionnement() <em>Type Fonctionnement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeFonctionnement()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeSousSystemeTypeFonctionnement typeFonctionnement = TYPE_FONCTIONNEMENT_EDEFAULT;

	/**
	 * This is true if the Type Fonctionnement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeFonctionnementESet;

	/**
	 * The default value of the '{@link #getAutrePanne() <em>Autre Panne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutrePanne()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTRE_PANNE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutrePanne() <em>Autre Panne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutrePanne()
	 * @generated
	 * @ordered
	 */
	protected String autrePanne = AUTRE_PANNE_EDEFAULT;

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
	 * The cached value of the '{@link #getConcerneTypeEquipement() <em>Concerne Type Equipement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneTypeEquipement()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation concerneTypeEquipement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeTypeSousSystemeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeTypeSousSysteme();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeSousSystemeCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoTypeSousSystemeCategorie newCategorie) {
		TypeDictionaryDicoTypeSousSystemeCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_SOUS_SYSTEME__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoTypeSousSystemeCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_SOUS_SYSTEME__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public String getAutreCategorie() {
		return autreCategorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutreCategorie(String newAutreCategorie) {
		String oldAutreCategorie = autreCategorie;
		autreCategorie = newAutreCategorie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_SOUS_SYSTEME__AUTRE_CATEGORIE, oldAutreCategorie, autreCategorie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeSousSystemeTypeFonctionnement getTypeFonctionnement() {
		return typeFonctionnement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeFonctionnement(TypeDictionaryDicoTypeSousSystemeTypeFonctionnement newTypeFonctionnement) {
		TypeDictionaryDicoTypeSousSystemeTypeFonctionnement oldTypeFonctionnement = typeFonctionnement;
		typeFonctionnement = newTypeFonctionnement == null ? TYPE_FONCTIONNEMENT_EDEFAULT : newTypeFonctionnement;
		boolean oldTypeFonctionnementESet = typeFonctionnementESet;
		typeFonctionnementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_SOUS_SYSTEME__TYPE_FONCTIONNEMENT, oldTypeFonctionnement, typeFonctionnement, !oldTypeFonctionnementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeFonctionnement() {
		TypeDictionaryDicoTypeSousSystemeTypeFonctionnement oldTypeFonctionnement = typeFonctionnement;
		boolean oldTypeFonctionnementESet = typeFonctionnementESet;
		typeFonctionnement = TYPE_FONCTIONNEMENT_EDEFAULT;
		typeFonctionnementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_SOUS_SYSTEME__TYPE_FONCTIONNEMENT, oldTypeFonctionnement, TYPE_FONCTIONNEMENT_EDEFAULT, oldTypeFonctionnementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeFonctionnement() {
		return typeFonctionnementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAutrePanne() {
		return autrePanne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutrePanne(String newAutrePanne) {
		String oldAutrePanne = autrePanne;
		autrePanne = newAutrePanne;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_SOUS_SYSTEME__AUTRE_PANNE, oldAutrePanne, autrePanne));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_SOUS_SYSTEME__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_SOUS_SYSTEME__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getConcerneTypeEquipement() {
		return concerneTypeEquipement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcerneTypeEquipement(TypeAssociation newConcerneTypeEquipement, NotificationChain msgs) {
		TypeAssociation oldConcerneTypeEquipement = concerneTypeEquipement;
		concerneTypeEquipement = newConcerneTypeEquipement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_SOUS_SYSTEME__CONCERNE_TYPE_EQUIPEMENT, oldConcerneTypeEquipement, newConcerneTypeEquipement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcerneTypeEquipement(TypeAssociation newConcerneTypeEquipement) {
		if (newConcerneTypeEquipement != concerneTypeEquipement) {
			NotificationChain msgs = null;
			if (concerneTypeEquipement != null)
				msgs = ((InternalEObject)concerneTypeEquipement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_SOUS_SYSTEME__CONCERNE_TYPE_EQUIPEMENT, null, msgs);
			if (newConcerneTypeEquipement != null)
				msgs = ((InternalEObject)newConcerneTypeEquipement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_SOUS_SYSTEME__CONCERNE_TYPE_EQUIPEMENT, null, msgs);
			msgs = basicSetConcerneTypeEquipement(newConcerneTypeEquipement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_SOUS_SYSTEME__CONCERNE_TYPE_EQUIPEMENT, newConcerneTypeEquipement, newConcerneTypeEquipement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_TYPE_SOUS_SYSTEME__CONCERNE_TYPE_EQUIPEMENT:
				return basicSetConcerneTypeEquipement(null, msgs);
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
			case SchemaPackage.TYPE_TYPE_SOUS_SYSTEME__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_TYPE_SOUS_SYSTEME__AUTRE_CATEGORIE:
				return getAutreCategorie();
			case SchemaPackage.TYPE_TYPE_SOUS_SYSTEME__TYPE_FONCTIONNEMENT:
				return getTypeFonctionnement();
			case SchemaPackage.TYPE_TYPE_SOUS_SYSTEME__AUTRE_PANNE:
				return getAutrePanne();
			case SchemaPackage.TYPE_TYPE_SOUS_SYSTEME__CTE:
				return getCTE();
			case SchemaPackage.TYPE_TYPE_SOUS_SYSTEME__CE:
				return getCE();
			case SchemaPackage.TYPE_TYPE_SOUS_SYSTEME__CONCERNE_TYPE_EQUIPEMENT:
				return getConcerneTypeEquipement();
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
			case SchemaPackage.TYPE_TYPE_SOUS_SYSTEME__CATEGORIE:
				setCategorie((TypeDictionaryDicoTypeSousSystemeCategorie)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_SOUS_SYSTEME__AUTRE_CATEGORIE:
				setAutreCategorie((String)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_SOUS_SYSTEME__TYPE_FONCTIONNEMENT:
				setTypeFonctionnement((TypeDictionaryDicoTypeSousSystemeTypeFonctionnement)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_SOUS_SYSTEME__AUTRE_PANNE:
				setAutrePanne((String)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_SOUS_SYSTEME__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_SOUS_SYSTEME__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_SOUS_SYSTEME__CONCERNE_TYPE_EQUIPEMENT:
				setConcerneTypeEquipement((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_TYPE_SOUS_SYSTEME__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_TYPE_SOUS_SYSTEME__AUTRE_CATEGORIE:
				setAutreCategorie(AUTRE_CATEGORIE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TYPE_SOUS_SYSTEME__TYPE_FONCTIONNEMENT:
				unsetTypeFonctionnement();
				return;
			case SchemaPackage.TYPE_TYPE_SOUS_SYSTEME__AUTRE_PANNE:
				setAutrePanne(AUTRE_PANNE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TYPE_SOUS_SYSTEME__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TYPE_SOUS_SYSTEME__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TYPE_SOUS_SYSTEME__CONCERNE_TYPE_EQUIPEMENT:
				setConcerneTypeEquipement((TypeAssociation)null);
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
			case SchemaPackage.TYPE_TYPE_SOUS_SYSTEME__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_TYPE_SOUS_SYSTEME__AUTRE_CATEGORIE:
				return AUTRE_CATEGORIE_EDEFAULT == null ? autreCategorie != null : !AUTRE_CATEGORIE_EDEFAULT.equals(autreCategorie);
			case SchemaPackage.TYPE_TYPE_SOUS_SYSTEME__TYPE_FONCTIONNEMENT:
				return isSetTypeFonctionnement();
			case SchemaPackage.TYPE_TYPE_SOUS_SYSTEME__AUTRE_PANNE:
				return AUTRE_PANNE_EDEFAULT == null ? autrePanne != null : !AUTRE_PANNE_EDEFAULT.equals(autrePanne);
			case SchemaPackage.TYPE_TYPE_SOUS_SYSTEME__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_TYPE_SOUS_SYSTEME__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_TYPE_SOUS_SYSTEME__CONCERNE_TYPE_EQUIPEMENT:
				return concerneTypeEquipement != null;
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
		result.append(", autreCategorie: ");
		result.append(autreCategorie);
		result.append(", typeFonctionnement: ");
		if (typeFonctionnementESet) result.append(typeFonctionnement); else result.append("<unset>");
		result.append(", autrePanne: ");
		result.append(autrePanne);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeTypeSousSystemeImpl
