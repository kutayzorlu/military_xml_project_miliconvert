/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationObservationObservation;
import mpia.schema.TypeDictionaryDicoAssociationObservationObservationCategorie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Observation Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationObservationObservationImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationObservationObservationImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationObservationObservationImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationObservationObservationImpl#getAutreCategorie <em>Autre Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationObservationObservationImpl#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationObservationObservationImpl#getAssocieCommeSujetObservation <em>Associe Comme Sujet Observation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationObservationObservationImpl#getAssocieCommeObjetObservation <em>Associe Comme Objet Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationObservationObservationImpl extends EObjectImpl implements TypeAssociationObservationObservation {
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
	protected static final TypeDictionaryDicoAssociationObservationObservationCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAssociationObservationObservationCategorie.AO;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssociationObservationObservationCategorie categorie = CATEGORIE_EDEFAULT;

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
	 * The default value of the '{@link #getCommentaire() <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaire()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTAIRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommentaire() <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaire()
	 * @generated
	 * @ordered
	 */
	protected String commentaire = COMMENTAIRE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssocieCommeSujetObservation() <em>Associe Comme Sujet Observation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeSujetObservation()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeSujetObservation;

	/**
	 * The cached value of the '{@link #getAssocieCommeObjetObservation() <em>Associe Comme Objet Observation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeObjetObservation()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeObjetObservation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationObservationObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationObservationObservation();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_OBSERVATION_OBSERVATION__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_OBSERVATION_OBSERVATION__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAssociationObservationObservationCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAssociationObservationObservationCategorie newCategorie) {
		TypeDictionaryDicoAssociationObservationObservationCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_OBSERVATION_OBSERVATION__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAssociationObservationObservationCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_OBSERVATION_OBSERVATION__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_OBSERVATION_OBSERVATION__AUTRE_CATEGORIE, oldAutreCategorie, autreCategorie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommentaire() {
		return commentaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommentaire(String newCommentaire) {
		String oldCommentaire = commentaire;
		commentaire = newCommentaire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_OBSERVATION_OBSERVATION__COMMENTAIRE, oldCommentaire, commentaire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAssocieCommeSujetObservation() {
		return associeCommeSujetObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeSujetObservation(TypeAssociation newAssocieCommeSujetObservation, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeSujetObservation = associeCommeSujetObservation;
		associeCommeSujetObservation = newAssocieCommeSujetObservation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_OBSERVATION_OBSERVATION__ASSOCIE_COMME_SUJET_OBSERVATION, oldAssocieCommeSujetObservation, newAssocieCommeSujetObservation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeSujetObservation(TypeAssociation newAssocieCommeSujetObservation) {
		if (newAssocieCommeSujetObservation != associeCommeSujetObservation) {
			NotificationChain msgs = null;
			if (associeCommeSujetObservation != null)
				msgs = ((InternalEObject)associeCommeSujetObservation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_OBSERVATION_OBSERVATION__ASSOCIE_COMME_SUJET_OBSERVATION, null, msgs);
			if (newAssocieCommeSujetObservation != null)
				msgs = ((InternalEObject)newAssocieCommeSujetObservation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_OBSERVATION_OBSERVATION__ASSOCIE_COMME_SUJET_OBSERVATION, null, msgs);
			msgs = basicSetAssocieCommeSujetObservation(newAssocieCommeSujetObservation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_OBSERVATION_OBSERVATION__ASSOCIE_COMME_SUJET_OBSERVATION, newAssocieCommeSujetObservation, newAssocieCommeSujetObservation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAssocieCommeObjetObservation() {
		return associeCommeObjetObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeObjetObservation(TypeAssociation newAssocieCommeObjetObservation, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeObjetObservation = associeCommeObjetObservation;
		associeCommeObjetObservation = newAssocieCommeObjetObservation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_OBSERVATION_OBSERVATION__ASSOCIE_COMME_OBJET_OBSERVATION, oldAssocieCommeObjetObservation, newAssocieCommeObjetObservation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeObjetObservation(TypeAssociation newAssocieCommeObjetObservation) {
		if (newAssocieCommeObjetObservation != associeCommeObjetObservation) {
			NotificationChain msgs = null;
			if (associeCommeObjetObservation != null)
				msgs = ((InternalEObject)associeCommeObjetObservation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_OBSERVATION_OBSERVATION__ASSOCIE_COMME_OBJET_OBSERVATION, null, msgs);
			if (newAssocieCommeObjetObservation != null)
				msgs = ((InternalEObject)newAssocieCommeObjetObservation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_OBSERVATION_OBSERVATION__ASSOCIE_COMME_OBJET_OBSERVATION, null, msgs);
			msgs = basicSetAssocieCommeObjetObservation(newAssocieCommeObjetObservation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_OBSERVATION_OBSERVATION__ASSOCIE_COMME_OBJET_OBSERVATION, newAssocieCommeObjetObservation, newAssocieCommeObjetObservation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_OBSERVATION_OBSERVATION__ASSOCIE_COMME_SUJET_OBSERVATION:
				return basicSetAssocieCommeSujetObservation(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_OBSERVATION_OBSERVATION__ASSOCIE_COMME_OBJET_OBSERVATION:
				return basicSetAssocieCommeObjetObservation(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_OBSERVATION_OBSERVATION__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ASSOCIATION_OBSERVATION_OBSERVATION__CE:
				return getCE();
			case SchemaPackage.TYPE_ASSOCIATION_OBSERVATION_OBSERVATION__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_OBSERVATION_OBSERVATION__AUTRE_CATEGORIE:
				return getAutreCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_OBSERVATION_OBSERVATION__COMMENTAIRE:
				return getCommentaire();
			case SchemaPackage.TYPE_ASSOCIATION_OBSERVATION_OBSERVATION__ASSOCIE_COMME_SUJET_OBSERVATION:
				return getAssocieCommeSujetObservation();
			case SchemaPackage.TYPE_ASSOCIATION_OBSERVATION_OBSERVATION__ASSOCIE_COMME_OBJET_OBSERVATION:
				return getAssocieCommeObjetObservation();
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
			case SchemaPackage.TYPE_ASSOCIATION_OBSERVATION_OBSERVATION__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_OBSERVATION_OBSERVATION__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_OBSERVATION_OBSERVATION__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationObservationObservationCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_OBSERVATION_OBSERVATION__AUTRE_CATEGORIE:
				setAutreCategorie((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_OBSERVATION_OBSERVATION__COMMENTAIRE:
				setCommentaire((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_OBSERVATION_OBSERVATION__ASSOCIE_COMME_SUJET_OBSERVATION:
				setAssocieCommeSujetObservation((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_OBSERVATION_OBSERVATION__ASSOCIE_COMME_OBJET_OBSERVATION:
				setAssocieCommeObjetObservation((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_OBSERVATION_OBSERVATION__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_OBSERVATION_OBSERVATION__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_OBSERVATION_OBSERVATION__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_OBSERVATION_OBSERVATION__AUTRE_CATEGORIE:
				setAutreCategorie(AUTRE_CATEGORIE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_OBSERVATION_OBSERVATION__COMMENTAIRE:
				setCommentaire(COMMENTAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_OBSERVATION_OBSERVATION__ASSOCIE_COMME_SUJET_OBSERVATION:
				setAssocieCommeSujetObservation((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_OBSERVATION_OBSERVATION__ASSOCIE_COMME_OBJET_OBSERVATION:
				setAssocieCommeObjetObservation((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_OBSERVATION_OBSERVATION__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ASSOCIATION_OBSERVATION_OBSERVATION__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ASSOCIATION_OBSERVATION_OBSERVATION__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_OBSERVATION_OBSERVATION__AUTRE_CATEGORIE:
				return AUTRE_CATEGORIE_EDEFAULT == null ? autreCategorie != null : !AUTRE_CATEGORIE_EDEFAULT.equals(autreCategorie);
			case SchemaPackage.TYPE_ASSOCIATION_OBSERVATION_OBSERVATION__COMMENTAIRE:
				return COMMENTAIRE_EDEFAULT == null ? commentaire != null : !COMMENTAIRE_EDEFAULT.equals(commentaire);
			case SchemaPackage.TYPE_ASSOCIATION_OBSERVATION_OBSERVATION__ASSOCIE_COMME_SUJET_OBSERVATION:
				return associeCommeSujetObservation != null;
			case SchemaPackage.TYPE_ASSOCIATION_OBSERVATION_OBSERVATION__ASSOCIE_COMME_OBJET_OBSERVATION:
				return associeCommeObjetObservation != null;
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
		result.append(", autreCategorie: ");
		result.append(autreCategorie);
		result.append(", commentaire: ");
		result.append(commentaire);
		result.append(')');
		return result.toString();
	}

} //TypeAssociationObservationObservationImpl
