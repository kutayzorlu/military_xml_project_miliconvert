/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationObjectifCiblageDocument;
import mpia.schema.TypeDictionaryDicoAssociationRacineOperationnelleDocumentCategorie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Objectif Ciblage Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationObjectifCiblageDocumentImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationObjectifCiblageDocumentImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationObjectifCiblageDocumentImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationObjectifCiblageDocumentImpl#getAssocieCommeObjetDocument <em>Associe Comme Objet Document</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationObjectifCiblageDocumentImpl#getAssocieCommeSujetObjectifCiblage <em>Associe Comme Sujet Objectif Ciblage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationObjectifCiblageDocumentImpl extends EObjectImpl implements TypeAssociationObjectifCiblageDocument {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAssociationRacineOperationnelleDocumentCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAssociationRacineOperationnelleDocumentCategorie.HASINS;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssociationRacineOperationnelleDocumentCategorie categorie = CATEGORIE_EDEFAULT;

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
	 * The cached value of the '{@link #getAssocieCommeObjetDocument() <em>Associe Comme Objet Document</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeObjetDocument()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeObjetDocument;

	/**
	 * The cached value of the '{@link #getAssocieCommeSujetObjectifCiblage() <em>Associe Comme Sujet Objectif Ciblage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeSujetObjectifCiblage()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeSujetObjectifCiblage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationObjectifCiblageDocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationObjectifCiblageDocument();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAssociationRacineOperationnelleDocumentCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAssociationRacineOperationnelleDocumentCategorie newCategorie) {
		TypeDictionaryDicoAssociationRacineOperationnelleDocumentCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_DOCUMENT__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAssociationRacineOperationnelleDocumentCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_DOCUMENT__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_DOCUMENT__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_DOCUMENT__CE, oldCE, cE));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_DOCUMENT__ASSOCIE_COMME_OBJET_DOCUMENT, oldAssocieCommeObjetDocument, newAssocieCommeObjetDocument);
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
				msgs = ((InternalEObject)associeCommeObjetDocument).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_DOCUMENT__ASSOCIE_COMME_OBJET_DOCUMENT, null, msgs);
			if (newAssocieCommeObjetDocument != null)
				msgs = ((InternalEObject)newAssocieCommeObjetDocument).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_DOCUMENT__ASSOCIE_COMME_OBJET_DOCUMENT, null, msgs);
			msgs = basicSetAssocieCommeObjetDocument(newAssocieCommeObjetDocument, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_DOCUMENT__ASSOCIE_COMME_OBJET_DOCUMENT, newAssocieCommeObjetDocument, newAssocieCommeObjetDocument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAssocieCommeSujetObjectifCiblage() {
		return associeCommeSujetObjectifCiblage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeSujetObjectifCiblage(TypeAssociation newAssocieCommeSujetObjectifCiblage, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeSujetObjectifCiblage = associeCommeSujetObjectifCiblage;
		associeCommeSujetObjectifCiblage = newAssocieCommeSujetObjectifCiblage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_DOCUMENT__ASSOCIE_COMME_SUJET_OBJECTIF_CIBLAGE, oldAssocieCommeSujetObjectifCiblage, newAssocieCommeSujetObjectifCiblage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeSujetObjectifCiblage(TypeAssociation newAssocieCommeSujetObjectifCiblage) {
		if (newAssocieCommeSujetObjectifCiblage != associeCommeSujetObjectifCiblage) {
			NotificationChain msgs = null;
			if (associeCommeSujetObjectifCiblage != null)
				msgs = ((InternalEObject)associeCommeSujetObjectifCiblage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_DOCUMENT__ASSOCIE_COMME_SUJET_OBJECTIF_CIBLAGE, null, msgs);
			if (newAssocieCommeSujetObjectifCiblage != null)
				msgs = ((InternalEObject)newAssocieCommeSujetObjectifCiblage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_DOCUMENT__ASSOCIE_COMME_SUJET_OBJECTIF_CIBLAGE, null, msgs);
			msgs = basicSetAssocieCommeSujetObjectifCiblage(newAssocieCommeSujetObjectifCiblage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_DOCUMENT__ASSOCIE_COMME_SUJET_OBJECTIF_CIBLAGE, newAssocieCommeSujetObjectifCiblage, newAssocieCommeSujetObjectifCiblage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_DOCUMENT__ASSOCIE_COMME_OBJET_DOCUMENT:
				return basicSetAssocieCommeObjetDocument(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_DOCUMENT__ASSOCIE_COMME_SUJET_OBJECTIF_CIBLAGE:
				return basicSetAssocieCommeSujetObjectifCiblage(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_DOCUMENT__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_DOCUMENT__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_DOCUMENT__CE:
				return getCE();
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_DOCUMENT__ASSOCIE_COMME_OBJET_DOCUMENT:
				return getAssocieCommeObjetDocument();
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_DOCUMENT__ASSOCIE_COMME_SUJET_OBJECTIF_CIBLAGE:
				return getAssocieCommeSujetObjectifCiblage();
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
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_DOCUMENT__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationRacineOperationnelleDocumentCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_DOCUMENT__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_DOCUMENT__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_DOCUMENT__ASSOCIE_COMME_OBJET_DOCUMENT:
				setAssocieCommeObjetDocument((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_DOCUMENT__ASSOCIE_COMME_SUJET_OBJECTIF_CIBLAGE:
				setAssocieCommeSujetObjectifCiblage((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_DOCUMENT__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_DOCUMENT__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_DOCUMENT__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_DOCUMENT__ASSOCIE_COMME_OBJET_DOCUMENT:
				setAssocieCommeObjetDocument((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_DOCUMENT__ASSOCIE_COMME_SUJET_OBJECTIF_CIBLAGE:
				setAssocieCommeSujetObjectifCiblage((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_DOCUMENT__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_DOCUMENT__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_DOCUMENT__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_DOCUMENT__ASSOCIE_COMME_OBJET_DOCUMENT:
				return associeCommeObjetDocument != null;
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_CIBLAGE_DOCUMENT__ASSOCIE_COMME_SUJET_OBJECTIF_CIBLAGE:
				return associeCommeSujetObjectifCiblage != null;
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

} //TypeAssociationObjectifCiblageDocumentImpl
