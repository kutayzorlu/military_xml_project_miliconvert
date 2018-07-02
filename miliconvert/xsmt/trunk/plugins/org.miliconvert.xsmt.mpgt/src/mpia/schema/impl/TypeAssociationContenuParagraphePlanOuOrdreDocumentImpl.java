/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeDateHeure;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationContenuParagraphePlanOuOrdreDocument;
import mpia.schema.TypeDictionaryDicoAssociationContenuParagraphePlanOuOrdreDocumentCategorie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Contenu Paragraphe Plan Ou Ordre Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationContenuParagraphePlanOuOrdreDocumentImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationContenuParagraphePlanOuOrdreDocumentImpl#getDate <em>Date</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationContenuParagraphePlanOuOrdreDocumentImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationContenuParagraphePlanOuOrdreDocumentImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationContenuParagraphePlanOuOrdreDocumentImpl#getAssocieCommeObjetDocument <em>Associe Comme Objet Document</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationContenuParagraphePlanOuOrdreDocumentImpl extends EObjectImpl implements TypeAssociationContenuParagraphePlanOuOrdreDocument {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAssociationContenuParagraphePlanOuOrdreDocumentCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAssociationContenuParagraphePlanOuOrdreDocumentCategorie.HASINS;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssociationContenuParagraphePlanOuOrdreDocumentCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDateHeure date;

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
	 * The cached value of the '{@link #getAssocieCommeObjetDocument() <em>Associe Comme Objet Document</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeObjetDocument()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeObjetDocument;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationContenuParagraphePlanOuOrdreDocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationContenuParagraphePlanOuOrdreDocument();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAssociationContenuParagraphePlanOuOrdreDocumentCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAssociationContenuParagraphePlanOuOrdreDocumentCategorie newCategorie) {
		TypeDictionaryDicoAssociationContenuParagraphePlanOuOrdreDocumentCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE_DOCUMENT__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAssociationContenuParagraphePlanOuOrdreDocumentCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE_DOCUMENT__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeDataTypeDateHeure getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(TypeDataTypeDateHeure newDate, NotificationChain msgs) {
		TypeDataTypeDateHeure oldDate = date;
		date = newDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE_DOCUMENT__DATE, oldDate, newDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(TypeDataTypeDateHeure newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE_DOCUMENT__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE_DOCUMENT__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE_DOCUMENT__DATE, newDate, newDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE_DOCUMENT__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE_DOCUMENT__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAssocieCommeObjetDocument() {
		return associeCommeObjetDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeObjetDocument(TypeAssociation newAssocieCommeObjetDocument, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeObjetDocument = associeCommeObjetDocument;
		associeCommeObjetDocument = newAssocieCommeObjetDocument;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE_DOCUMENT__ASSOCIE_COMME_OBJET_DOCUMENT, oldAssocieCommeObjetDocument, newAssocieCommeObjetDocument);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeObjetDocument(TypeAssociation newAssocieCommeObjetDocument) {
		if (newAssocieCommeObjetDocument != associeCommeObjetDocument) {
			NotificationChain msgs = null;
			if (associeCommeObjetDocument != null)
				msgs = ((InternalEObject)associeCommeObjetDocument).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE_DOCUMENT__ASSOCIE_COMME_OBJET_DOCUMENT, null, msgs);
			if (newAssocieCommeObjetDocument != null)
				msgs = ((InternalEObject)newAssocieCommeObjetDocument).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE_DOCUMENT__ASSOCIE_COMME_OBJET_DOCUMENT, null, msgs);
			msgs = basicSetAssocieCommeObjetDocument(newAssocieCommeObjetDocument, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE_DOCUMENT__ASSOCIE_COMME_OBJET_DOCUMENT, newAssocieCommeObjetDocument, newAssocieCommeObjetDocument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE_DOCUMENT__DATE:
				return basicSetDate(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE_DOCUMENT__ASSOCIE_COMME_OBJET_DOCUMENT:
				return basicSetAssocieCommeObjetDocument(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE_DOCUMENT__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE_DOCUMENT__DATE:
				return getDate();
			case SchemaPackage.TYPE_ASSOCIATION_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE_DOCUMENT__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ASSOCIATION_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE_DOCUMENT__CE:
				return getCE();
			case SchemaPackage.TYPE_ASSOCIATION_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE_DOCUMENT__ASSOCIE_COMME_OBJET_DOCUMENT:
				return getAssocieCommeObjetDocument();
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
			case SchemaPackage.TYPE_ASSOCIATION_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE_DOCUMENT__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationContenuParagraphePlanOuOrdreDocumentCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE_DOCUMENT__DATE:
				setDate((TypeDataTypeDateHeure)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE_DOCUMENT__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE_DOCUMENT__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE_DOCUMENT__ASSOCIE_COMME_OBJET_DOCUMENT:
				setAssocieCommeObjetDocument((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE_DOCUMENT__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE_DOCUMENT__DATE:
				setDate((TypeDataTypeDateHeure)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE_DOCUMENT__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE_DOCUMENT__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE_DOCUMENT__ASSOCIE_COMME_OBJET_DOCUMENT:
				setAssocieCommeObjetDocument((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE_DOCUMENT__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE_DOCUMENT__DATE:
				return date != null;
			case SchemaPackage.TYPE_ASSOCIATION_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE_DOCUMENT__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ASSOCIATION_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE_DOCUMENT__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ASSOCIATION_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE_DOCUMENT__ASSOCIE_COMME_OBJET_DOCUMENT:
				return associeCommeObjetDocument != null;
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

} //TypeAssociationContenuParagraphePlanOuOrdreDocumentImpl
