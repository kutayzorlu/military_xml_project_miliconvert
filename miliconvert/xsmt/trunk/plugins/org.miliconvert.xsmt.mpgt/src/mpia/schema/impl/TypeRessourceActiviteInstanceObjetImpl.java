/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoRessourceActiviteInstanceObjetCategorie;
import mpia.schema.TypeRessourceActiviteInstanceObjet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Ressource Activite Instance Objet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeRessourceActiviteInstanceObjetImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRessourceActiviteInstanceObjetImpl#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRessourceActiviteInstanceObjetImpl#getAssocieCommeInstanceObjetInstanceObjet <em>Associe Comme Instance Objet Instance Objet</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeRessourceActiviteInstanceObjetImpl extends TypeRessourceActiviteImpl implements TypeRessourceActiviteInstanceObjet {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoRessourceActiviteInstanceObjetCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoRessourceActiviteInstanceObjetCategorie.EXE;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoRessourceActiviteInstanceObjetCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

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
	 * The cached value of the '{@link #getAssocieCommeInstanceObjetInstanceObjet() <em>Associe Comme Instance Objet Instance Objet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeInstanceObjetInstanceObjet()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeInstanceObjetInstanceObjet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeRessourceActiviteInstanceObjetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeRessourceActiviteInstanceObjet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoRessourceActiviteInstanceObjetCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoRessourceActiviteInstanceObjetCategorie newCategorie) {
		TypeDictionaryDicoRessourceActiviteInstanceObjetCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESSOURCE_ACTIVITE_INSTANCE_OBJET__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoRessourceActiviteInstanceObjetCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_RESSOURCE_ACTIVITE_INSTANCE_OBJET__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESSOURCE_ACTIVITE_INSTANCE_OBJET__COMMENTAIRE, oldCommentaire, commentaire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAssocieCommeInstanceObjetInstanceObjet() {
		return associeCommeInstanceObjetInstanceObjet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeInstanceObjetInstanceObjet(TypeAssociation newAssocieCommeInstanceObjetInstanceObjet, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeInstanceObjetInstanceObjet = associeCommeInstanceObjetInstanceObjet;
		associeCommeInstanceObjetInstanceObjet = newAssocieCommeInstanceObjetInstanceObjet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESSOURCE_ACTIVITE_INSTANCE_OBJET__ASSOCIE_COMME_INSTANCE_OBJET_INSTANCE_OBJET, oldAssocieCommeInstanceObjetInstanceObjet, newAssocieCommeInstanceObjetInstanceObjet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeInstanceObjetInstanceObjet(TypeAssociation newAssocieCommeInstanceObjetInstanceObjet) {
		if (newAssocieCommeInstanceObjetInstanceObjet != associeCommeInstanceObjetInstanceObjet) {
			NotificationChain msgs = null;
			if (associeCommeInstanceObjetInstanceObjet != null)
				msgs = ((InternalEObject)associeCommeInstanceObjetInstanceObjet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RESSOURCE_ACTIVITE_INSTANCE_OBJET__ASSOCIE_COMME_INSTANCE_OBJET_INSTANCE_OBJET, null, msgs);
			if (newAssocieCommeInstanceObjetInstanceObjet != null)
				msgs = ((InternalEObject)newAssocieCommeInstanceObjetInstanceObjet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RESSOURCE_ACTIVITE_INSTANCE_OBJET__ASSOCIE_COMME_INSTANCE_OBJET_INSTANCE_OBJET, null, msgs);
			msgs = basicSetAssocieCommeInstanceObjetInstanceObjet(newAssocieCommeInstanceObjetInstanceObjet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESSOURCE_ACTIVITE_INSTANCE_OBJET__ASSOCIE_COMME_INSTANCE_OBJET_INSTANCE_OBJET, newAssocieCommeInstanceObjetInstanceObjet, newAssocieCommeInstanceObjetInstanceObjet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_RESSOURCE_ACTIVITE_INSTANCE_OBJET__ASSOCIE_COMME_INSTANCE_OBJET_INSTANCE_OBJET:
				return basicSetAssocieCommeInstanceObjetInstanceObjet(null, msgs);
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
			case SchemaPackage.TYPE_RESSOURCE_ACTIVITE_INSTANCE_OBJET__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_RESSOURCE_ACTIVITE_INSTANCE_OBJET__COMMENTAIRE:
				return getCommentaire();
			case SchemaPackage.TYPE_RESSOURCE_ACTIVITE_INSTANCE_OBJET__ASSOCIE_COMME_INSTANCE_OBJET_INSTANCE_OBJET:
				return getAssocieCommeInstanceObjetInstanceObjet();
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
			case SchemaPackage.TYPE_RESSOURCE_ACTIVITE_INSTANCE_OBJET__CATEGORIE:
				setCategorie((TypeDictionaryDicoRessourceActiviteInstanceObjetCategorie)newValue);
				return;
			case SchemaPackage.TYPE_RESSOURCE_ACTIVITE_INSTANCE_OBJET__COMMENTAIRE:
				setCommentaire((String)newValue);
				return;
			case SchemaPackage.TYPE_RESSOURCE_ACTIVITE_INSTANCE_OBJET__ASSOCIE_COMME_INSTANCE_OBJET_INSTANCE_OBJET:
				setAssocieCommeInstanceObjetInstanceObjet((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_RESSOURCE_ACTIVITE_INSTANCE_OBJET__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_RESSOURCE_ACTIVITE_INSTANCE_OBJET__COMMENTAIRE:
				setCommentaire(COMMENTAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RESSOURCE_ACTIVITE_INSTANCE_OBJET__ASSOCIE_COMME_INSTANCE_OBJET_INSTANCE_OBJET:
				setAssocieCommeInstanceObjetInstanceObjet((TypeAssociation)null);
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
			case SchemaPackage.TYPE_RESSOURCE_ACTIVITE_INSTANCE_OBJET__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_RESSOURCE_ACTIVITE_INSTANCE_OBJET__COMMENTAIRE:
				return COMMENTAIRE_EDEFAULT == null ? commentaire != null : !COMMENTAIRE_EDEFAULT.equals(commentaire);
			case SchemaPackage.TYPE_RESSOURCE_ACTIVITE_INSTANCE_OBJET__ASSOCIE_COMME_INSTANCE_OBJET_INSTANCE_OBJET:
				return associeCommeInstanceObjetInstanceObjet != null;
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
		result.append(", commentaire: ");
		result.append(commentaire);
		result.append(')');
		return result.toString();
	}

} //TypeRessourceActiviteInstanceObjetImpl
