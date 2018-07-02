/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationElementTopographieEvenement;
import mpia.schema.TypeDictionaryDicoAssociationElementTopographieEvenementCategorie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Element Topographie Evenement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationElementTopographieEvenementImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationElementTopographieEvenementImpl#getAPourSujetElementTopographie <em>APour Sujet Element Topographie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationElementTopographieEvenementImpl#getAPourObjetEvenement <em>APour Objet Evenement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationElementTopographieEvenementImpl extends TypeAssociationInstanceObjetActiviteImpl implements TypeAssociationElementTopographieEvenement {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAssociationElementTopographieEvenementCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAssociationElementTopographieEvenementCategorie.CONCER;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssociationElementTopographieEvenementCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The cached value of the '{@link #getAPourSujetElementTopographie() <em>APour Sujet Element Topographie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourSujetElementTopographie()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourSujetElementTopographie;

	/**
	 * The cached value of the '{@link #getAPourObjetEvenement() <em>APour Objet Evenement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourObjetEvenement()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourObjetEvenement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationElementTopographieEvenementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationElementTopographieEvenement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAssociationElementTopographieEvenementCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAssociationElementTopographieEvenementCategorie newCategorie) {
		TypeDictionaryDicoAssociationElementTopographieEvenementCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ELEMENT_TOPOGRAPHIE_EVENEMENT__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAssociationElementTopographieEvenementCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_ELEMENT_TOPOGRAPHIE_EVENEMENT__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeAssociation getAPourSujetElementTopographie() {
		return aPourSujetElementTopographie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourSujetElementTopographie(TypeAssociation newAPourSujetElementTopographie, NotificationChain msgs) {
		TypeAssociation oldAPourSujetElementTopographie = aPourSujetElementTopographie;
		aPourSujetElementTopographie = newAPourSujetElementTopographie;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ELEMENT_TOPOGRAPHIE_EVENEMENT__APOUR_SUJET_ELEMENT_TOPOGRAPHIE, oldAPourSujetElementTopographie, newAPourSujetElementTopographie);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourSujetElementTopographie(TypeAssociation newAPourSujetElementTopographie) {
		if (newAPourSujetElementTopographie != aPourSujetElementTopographie) {
			NotificationChain msgs = null;
			if (aPourSujetElementTopographie != null)
				msgs = ((InternalEObject)aPourSujetElementTopographie).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_ELEMENT_TOPOGRAPHIE_EVENEMENT__APOUR_SUJET_ELEMENT_TOPOGRAPHIE, null, msgs);
			if (newAPourSujetElementTopographie != null)
				msgs = ((InternalEObject)newAPourSujetElementTopographie).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_ELEMENT_TOPOGRAPHIE_EVENEMENT__APOUR_SUJET_ELEMENT_TOPOGRAPHIE, null, msgs);
			msgs = basicSetAPourSujetElementTopographie(newAPourSujetElementTopographie, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ELEMENT_TOPOGRAPHIE_EVENEMENT__APOUR_SUJET_ELEMENT_TOPOGRAPHIE, newAPourSujetElementTopographie, newAPourSujetElementTopographie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourObjetEvenement() {
		return aPourObjetEvenement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourObjetEvenement(TypeAssociation newAPourObjetEvenement, NotificationChain msgs) {
		TypeAssociation oldAPourObjetEvenement = aPourObjetEvenement;
		aPourObjetEvenement = newAPourObjetEvenement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ELEMENT_TOPOGRAPHIE_EVENEMENT__APOUR_OBJET_EVENEMENT, oldAPourObjetEvenement, newAPourObjetEvenement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourObjetEvenement(TypeAssociation newAPourObjetEvenement) {
		if (newAPourObjetEvenement != aPourObjetEvenement) {
			NotificationChain msgs = null;
			if (aPourObjetEvenement != null)
				msgs = ((InternalEObject)aPourObjetEvenement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_ELEMENT_TOPOGRAPHIE_EVENEMENT__APOUR_OBJET_EVENEMENT, null, msgs);
			if (newAPourObjetEvenement != null)
				msgs = ((InternalEObject)newAPourObjetEvenement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_ELEMENT_TOPOGRAPHIE_EVENEMENT__APOUR_OBJET_EVENEMENT, null, msgs);
			msgs = basicSetAPourObjetEvenement(newAPourObjetEvenement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ELEMENT_TOPOGRAPHIE_EVENEMENT__APOUR_OBJET_EVENEMENT, newAPourObjetEvenement, newAPourObjetEvenement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_ELEMENT_TOPOGRAPHIE_EVENEMENT__APOUR_SUJET_ELEMENT_TOPOGRAPHIE:
				return basicSetAPourSujetElementTopographie(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_ELEMENT_TOPOGRAPHIE_EVENEMENT__APOUR_OBJET_EVENEMENT:
				return basicSetAPourObjetEvenement(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_ELEMENT_TOPOGRAPHIE_EVENEMENT__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_ELEMENT_TOPOGRAPHIE_EVENEMENT__APOUR_SUJET_ELEMENT_TOPOGRAPHIE:
				return getAPourSujetElementTopographie();
			case SchemaPackage.TYPE_ASSOCIATION_ELEMENT_TOPOGRAPHIE_EVENEMENT__APOUR_OBJET_EVENEMENT:
				return getAPourObjetEvenement();
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
			case SchemaPackage.TYPE_ASSOCIATION_ELEMENT_TOPOGRAPHIE_EVENEMENT__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationElementTopographieEvenementCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ELEMENT_TOPOGRAPHIE_EVENEMENT__APOUR_SUJET_ELEMENT_TOPOGRAPHIE:
				setAPourSujetElementTopographie((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ELEMENT_TOPOGRAPHIE_EVENEMENT__APOUR_OBJET_EVENEMENT:
				setAPourObjetEvenement((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_ELEMENT_TOPOGRAPHIE_EVENEMENT__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ELEMENT_TOPOGRAPHIE_EVENEMENT__APOUR_SUJET_ELEMENT_TOPOGRAPHIE:
				setAPourSujetElementTopographie((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ELEMENT_TOPOGRAPHIE_EVENEMENT__APOUR_OBJET_EVENEMENT:
				setAPourObjetEvenement((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_ELEMENT_TOPOGRAPHIE_EVENEMENT__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_ELEMENT_TOPOGRAPHIE_EVENEMENT__APOUR_SUJET_ELEMENT_TOPOGRAPHIE:
				return aPourSujetElementTopographie != null;
			case SchemaPackage.TYPE_ASSOCIATION_ELEMENT_TOPOGRAPHIE_EVENEMENT__APOUR_OBJET_EVENEMENT:
				return aPourObjetEvenement != null;
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
		result.append(')');
		return result.toString();
	}

} //TypeAssociationElementTopographieEvenementImpl
