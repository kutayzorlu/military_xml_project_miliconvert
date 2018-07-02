/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationRacineOperationnelleDocument;
import mpia.schema.TypeDictionaryDicoAssociationRacineOperationnelleDocumentCategorie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Racine Operationnelle Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationRacineOperationnelleDocumentImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationRacineOperationnelleDocumentImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationRacineOperationnelleDocumentImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationRacineOperationnelleDocumentImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationRacineOperationnelleDocumentImpl#getAssocieCommeObjetDocument <em>Associe Comme Objet Document</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationRacineOperationnelleDocumentImpl#getAssocieCommeSujetRacineOperationnelle <em>Associe Comme Sujet Racine Operationnelle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationRacineOperationnelleDocumentImpl#getEstRapporteeParRapport <em>Est Rapportee Par Rapport</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationRacineOperationnelleDocumentImpl extends EObjectImpl implements TypeAssociationRacineOperationnelleDocument {
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

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
	 * The cached value of the '{@link #getAssocieCommeSujetRacineOperationnelle() <em>Associe Comme Sujet Racine Operationnelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeSujetRacineOperationnelle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeSujetRacineOperationnelle;

	/**
	 * The cached value of the '{@link #getEstRapporteeParRapport() <em>Est Rapportee Par Rapport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstRapporteeParRapport()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation estRapporteeParRapport;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationRacineOperationnelleDocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationRacineOperationnelleDocument();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT__CE, oldCE, cE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT__DESCRIPTION, oldDescription, description));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT__ASSOCIE_COMME_OBJET_DOCUMENT, oldAssocieCommeObjetDocument, newAssocieCommeObjetDocument);
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
				msgs = ((InternalEObject)associeCommeObjetDocument).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT__ASSOCIE_COMME_OBJET_DOCUMENT, null, msgs);
			if (newAssocieCommeObjetDocument != null)
				msgs = ((InternalEObject)newAssocieCommeObjetDocument).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT__ASSOCIE_COMME_OBJET_DOCUMENT, null, msgs);
			msgs = basicSetAssocieCommeObjetDocument(newAssocieCommeObjetDocument, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT__ASSOCIE_COMME_OBJET_DOCUMENT, newAssocieCommeObjetDocument, newAssocieCommeObjetDocument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAssocieCommeSujetRacineOperationnelle() {
		return associeCommeSujetRacineOperationnelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeSujetRacineOperationnelle(TypeAssociation newAssocieCommeSujetRacineOperationnelle, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeSujetRacineOperationnelle = associeCommeSujetRacineOperationnelle;
		associeCommeSujetRacineOperationnelle = newAssocieCommeSujetRacineOperationnelle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT__ASSOCIE_COMME_SUJET_RACINE_OPERATIONNELLE, oldAssocieCommeSujetRacineOperationnelle, newAssocieCommeSujetRacineOperationnelle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeSujetRacineOperationnelle(TypeAssociation newAssocieCommeSujetRacineOperationnelle) {
		if (newAssocieCommeSujetRacineOperationnelle != associeCommeSujetRacineOperationnelle) {
			NotificationChain msgs = null;
			if (associeCommeSujetRacineOperationnelle != null)
				msgs = ((InternalEObject)associeCommeSujetRacineOperationnelle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT__ASSOCIE_COMME_SUJET_RACINE_OPERATIONNELLE, null, msgs);
			if (newAssocieCommeSujetRacineOperationnelle != null)
				msgs = ((InternalEObject)newAssocieCommeSujetRacineOperationnelle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT__ASSOCIE_COMME_SUJET_RACINE_OPERATIONNELLE, null, msgs);
			msgs = basicSetAssocieCommeSujetRacineOperationnelle(newAssocieCommeSujetRacineOperationnelle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT__ASSOCIE_COMME_SUJET_RACINE_OPERATIONNELLE, newAssocieCommeSujetRacineOperationnelle, newAssocieCommeSujetRacineOperationnelle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getEstRapporteeParRapport() {
		return estRapporteeParRapport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstRapporteeParRapport(TypeAssociation newEstRapporteeParRapport, NotificationChain msgs) {
		TypeAssociation oldEstRapporteeParRapport = estRapporteeParRapport;
		estRapporteeParRapport = newEstRapporteeParRapport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT__EST_RAPPORTEE_PAR_RAPPORT, oldEstRapporteeParRapport, newEstRapporteeParRapport);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstRapporteeParRapport(TypeAssociation newEstRapporteeParRapport) {
		if (newEstRapporteeParRapport != estRapporteeParRapport) {
			NotificationChain msgs = null;
			if (estRapporteeParRapport != null)
				msgs = ((InternalEObject)estRapporteeParRapport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT__EST_RAPPORTEE_PAR_RAPPORT, null, msgs);
			if (newEstRapporteeParRapport != null)
				msgs = ((InternalEObject)newEstRapporteeParRapport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT__EST_RAPPORTEE_PAR_RAPPORT, null, msgs);
			msgs = basicSetEstRapporteeParRapport(newEstRapporteeParRapport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT__EST_RAPPORTEE_PAR_RAPPORT, newEstRapporteeParRapport, newEstRapporteeParRapport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT__ASSOCIE_COMME_OBJET_DOCUMENT:
				return basicSetAssocieCommeObjetDocument(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT__ASSOCIE_COMME_SUJET_RACINE_OPERATIONNELLE:
				return basicSetAssocieCommeSujetRacineOperationnelle(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT__EST_RAPPORTEE_PAR_RAPPORT:
				return basicSetEstRapporteeParRapport(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT__CE:
				return getCE();
			case SchemaPackage.TYPE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT__DESCRIPTION:
				return getDescription();
			case SchemaPackage.TYPE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT__ASSOCIE_COMME_OBJET_DOCUMENT:
				return getAssocieCommeObjetDocument();
			case SchemaPackage.TYPE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT__ASSOCIE_COMME_SUJET_RACINE_OPERATIONNELLE:
				return getAssocieCommeSujetRacineOperationnelle();
			case SchemaPackage.TYPE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT__EST_RAPPORTEE_PAR_RAPPORT:
				return getEstRapporteeParRapport();
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
			case SchemaPackage.TYPE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationRacineOperationnelleDocumentCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT__ASSOCIE_COMME_OBJET_DOCUMENT:
				setAssocieCommeObjetDocument((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT__ASSOCIE_COMME_SUJET_RACINE_OPERATIONNELLE:
				setAssocieCommeSujetRacineOperationnelle((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT__EST_RAPPORTEE_PAR_RAPPORT:
				setEstRapporteeParRapport((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT__ASSOCIE_COMME_OBJET_DOCUMENT:
				setAssocieCommeObjetDocument((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT__ASSOCIE_COMME_SUJET_RACINE_OPERATIONNELLE:
				setAssocieCommeSujetRacineOperationnelle((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT__EST_RAPPORTEE_PAR_RAPPORT:
				setEstRapporteeParRapport((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SchemaPackage.TYPE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT__ASSOCIE_COMME_OBJET_DOCUMENT:
				return associeCommeObjetDocument != null;
			case SchemaPackage.TYPE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT__ASSOCIE_COMME_SUJET_RACINE_OPERATIONNELLE:
				return associeCommeSujetRacineOperationnelle != null;
			case SchemaPackage.TYPE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT__EST_RAPPORTEE_PAR_RAPPORT:
				return estRapporteeParRapport != null;
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
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //TypeAssociationRacineOperationnelleDocumentImpl
