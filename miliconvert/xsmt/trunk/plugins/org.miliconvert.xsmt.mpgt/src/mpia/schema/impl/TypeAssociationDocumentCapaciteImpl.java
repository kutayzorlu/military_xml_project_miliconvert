/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationDocumentCapacite;
import mpia.schema.TypeDictionaryDicoAssociationDocumentCapaciteCategorie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Document Capacite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationDocumentCapaciteImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationDocumentCapaciteImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationDocumentCapaciteImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationDocumentCapaciteImpl#getAssocieCommeSujetCapacite <em>Associe Comme Sujet Capacite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationDocumentCapaciteImpl#getAssocieCommeObjetDocument <em>Associe Comme Objet Document</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationDocumentCapaciteImpl extends EObjectImpl implements TypeAssociationDocumentCapacite {
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
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAssociationDocumentCapaciteCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAssociationDocumentCapaciteCategorie.ISAMPL;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssociationDocumentCapaciteCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The cached value of the '{@link #getAssocieCommeSujetCapacite() <em>Associe Comme Sujet Capacite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeSujetCapacite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeSujetCapacite;

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
	protected TypeAssociationDocumentCapaciteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationDocumentCapacite();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_DOCUMENT_CAPACITE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_DOCUMENT_CAPACITE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAssociationDocumentCapaciteCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAssociationDocumentCapaciteCategorie newCategorie) {
		TypeDictionaryDicoAssociationDocumentCapaciteCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_DOCUMENT_CAPACITE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAssociationDocumentCapaciteCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_DOCUMENT_CAPACITE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeAssociation getAssocieCommeSujetCapacite() {
		return associeCommeSujetCapacite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeSujetCapacite(TypeAssociation newAssocieCommeSujetCapacite, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeSujetCapacite = associeCommeSujetCapacite;
		associeCommeSujetCapacite = newAssocieCommeSujetCapacite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_DOCUMENT_CAPACITE__ASSOCIE_COMME_SUJET_CAPACITE, oldAssocieCommeSujetCapacite, newAssocieCommeSujetCapacite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeSujetCapacite(TypeAssociation newAssocieCommeSujetCapacite) {
		if (newAssocieCommeSujetCapacite != associeCommeSujetCapacite) {
			NotificationChain msgs = null;
			if (associeCommeSujetCapacite != null)
				msgs = ((InternalEObject)associeCommeSujetCapacite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_DOCUMENT_CAPACITE__ASSOCIE_COMME_SUJET_CAPACITE, null, msgs);
			if (newAssocieCommeSujetCapacite != null)
				msgs = ((InternalEObject)newAssocieCommeSujetCapacite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_DOCUMENT_CAPACITE__ASSOCIE_COMME_SUJET_CAPACITE, null, msgs);
			msgs = basicSetAssocieCommeSujetCapacite(newAssocieCommeSujetCapacite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_DOCUMENT_CAPACITE__ASSOCIE_COMME_SUJET_CAPACITE, newAssocieCommeSujetCapacite, newAssocieCommeSujetCapacite));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_DOCUMENT_CAPACITE__ASSOCIE_COMME_OBJET_DOCUMENT, oldAssocieCommeObjetDocument, newAssocieCommeObjetDocument);
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
				msgs = ((InternalEObject)associeCommeObjetDocument).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_DOCUMENT_CAPACITE__ASSOCIE_COMME_OBJET_DOCUMENT, null, msgs);
			if (newAssocieCommeObjetDocument != null)
				msgs = ((InternalEObject)newAssocieCommeObjetDocument).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_DOCUMENT_CAPACITE__ASSOCIE_COMME_OBJET_DOCUMENT, null, msgs);
			msgs = basicSetAssocieCommeObjetDocument(newAssocieCommeObjetDocument, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_DOCUMENT_CAPACITE__ASSOCIE_COMME_OBJET_DOCUMENT, newAssocieCommeObjetDocument, newAssocieCommeObjetDocument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_DOCUMENT_CAPACITE__ASSOCIE_COMME_SUJET_CAPACITE:
				return basicSetAssocieCommeSujetCapacite(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_DOCUMENT_CAPACITE__ASSOCIE_COMME_OBJET_DOCUMENT:
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
			case SchemaPackage.TYPE_ASSOCIATION_DOCUMENT_CAPACITE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ASSOCIATION_DOCUMENT_CAPACITE__CE:
				return getCE();
			case SchemaPackage.TYPE_ASSOCIATION_DOCUMENT_CAPACITE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_DOCUMENT_CAPACITE__ASSOCIE_COMME_SUJET_CAPACITE:
				return getAssocieCommeSujetCapacite();
			case SchemaPackage.TYPE_ASSOCIATION_DOCUMENT_CAPACITE__ASSOCIE_COMME_OBJET_DOCUMENT:
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
			case SchemaPackage.TYPE_ASSOCIATION_DOCUMENT_CAPACITE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_DOCUMENT_CAPACITE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_DOCUMENT_CAPACITE__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationDocumentCapaciteCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_DOCUMENT_CAPACITE__ASSOCIE_COMME_SUJET_CAPACITE:
				setAssocieCommeSujetCapacite((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_DOCUMENT_CAPACITE__ASSOCIE_COMME_OBJET_DOCUMENT:
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
			case SchemaPackage.TYPE_ASSOCIATION_DOCUMENT_CAPACITE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_DOCUMENT_CAPACITE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_DOCUMENT_CAPACITE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_DOCUMENT_CAPACITE__ASSOCIE_COMME_SUJET_CAPACITE:
				setAssocieCommeSujetCapacite((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_DOCUMENT_CAPACITE__ASSOCIE_COMME_OBJET_DOCUMENT:
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
			case SchemaPackage.TYPE_ASSOCIATION_DOCUMENT_CAPACITE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ASSOCIATION_DOCUMENT_CAPACITE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ASSOCIATION_DOCUMENT_CAPACITE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_DOCUMENT_CAPACITE__ASSOCIE_COMME_SUJET_CAPACITE:
				return associeCommeSujetCapacite != null;
			case SchemaPackage.TYPE_ASSOCIATION_DOCUMENT_CAPACITE__ASSOCIE_COMME_OBJET_DOCUMENT:
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
		result.append(" (cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(", categorie: ");
		if (categorieESet) result.append(categorie); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeAssociationDocumentCapaciteImpl
