/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAutreNom;
import mpia.schema.TypeDictionaryDicoAutreNomCategorie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Autre Nom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAutreNomImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAutreNomImpl#getEstAutreNomRacineOperationnelle <em>Est Autre Nom Racine Operationnelle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAutreNomImpl extends TypeRacineOperationnelleImpl implements TypeAutreNom {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAutreNomCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAutreNomCategorie.GEOLOC;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAutreNomCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The cached value of the '{@link #getEstAutreNomRacineOperationnelle() <em>Est Autre Nom Racine Operationnelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstAutreNomRacineOperationnelle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation estAutreNomRacineOperationnelle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAutreNomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAutreNom();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAutreNomCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAutreNomCategorie newCategorie) {
		TypeDictionaryDicoAutreNomCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AUTRE_NOM__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAutreNomCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_AUTRE_NOM__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeAssociation getEstAutreNomRacineOperationnelle() {
		return estAutreNomRacineOperationnelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstAutreNomRacineOperationnelle(TypeAssociation newEstAutreNomRacineOperationnelle, NotificationChain msgs) {
		TypeAssociation oldEstAutreNomRacineOperationnelle = estAutreNomRacineOperationnelle;
		estAutreNomRacineOperationnelle = newEstAutreNomRacineOperationnelle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AUTRE_NOM__EST_AUTRE_NOM_RACINE_OPERATIONNELLE, oldEstAutreNomRacineOperationnelle, newEstAutreNomRacineOperationnelle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstAutreNomRacineOperationnelle(TypeAssociation newEstAutreNomRacineOperationnelle) {
		if (newEstAutreNomRacineOperationnelle != estAutreNomRacineOperationnelle) {
			NotificationChain msgs = null;
			if (estAutreNomRacineOperationnelle != null)
				msgs = ((InternalEObject)estAutreNomRacineOperationnelle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_AUTRE_NOM__EST_AUTRE_NOM_RACINE_OPERATIONNELLE, null, msgs);
			if (newEstAutreNomRacineOperationnelle != null)
				msgs = ((InternalEObject)newEstAutreNomRacineOperationnelle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_AUTRE_NOM__EST_AUTRE_NOM_RACINE_OPERATIONNELLE, null, msgs);
			msgs = basicSetEstAutreNomRacineOperationnelle(newEstAutreNomRacineOperationnelle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AUTRE_NOM__EST_AUTRE_NOM_RACINE_OPERATIONNELLE, newEstAutreNomRacineOperationnelle, newEstAutreNomRacineOperationnelle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_AUTRE_NOM__EST_AUTRE_NOM_RACINE_OPERATIONNELLE:
				return basicSetEstAutreNomRacineOperationnelle(null, msgs);
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
			case SchemaPackage.TYPE_AUTRE_NOM__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_AUTRE_NOM__EST_AUTRE_NOM_RACINE_OPERATIONNELLE:
				return getEstAutreNomRacineOperationnelle();
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
			case SchemaPackage.TYPE_AUTRE_NOM__CATEGORIE:
				setCategorie((TypeDictionaryDicoAutreNomCategorie)newValue);
				return;
			case SchemaPackage.TYPE_AUTRE_NOM__EST_AUTRE_NOM_RACINE_OPERATIONNELLE:
				setEstAutreNomRacineOperationnelle((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_AUTRE_NOM__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_AUTRE_NOM__EST_AUTRE_NOM_RACINE_OPERATIONNELLE:
				setEstAutreNomRacineOperationnelle((TypeAssociation)null);
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
			case SchemaPackage.TYPE_AUTRE_NOM__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_AUTRE_NOM__EST_AUTRE_NOM_RACINE_OPERATIONNELLE:
				return estAutreNomRacineOperationnelle != null;
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

} //TypeAutreNomImpl
