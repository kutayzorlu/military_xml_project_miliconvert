/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypePosteTir;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Poste Tir</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypePosteTirImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePosteTirImpl#getEstAssocieTypeMateriel <em>Est Associe Type Materiel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypePosteTirImpl extends TypeElementControleImpl implements TypePosteTir {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORIE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected String categorie = CATEGORIE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEstAssocieTypeMateriel() <em>Est Associe Type Materiel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstAssocieTypeMateriel()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT estAssocieTypeMateriel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypePosteTirImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypePosteTir();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(String newCategorie) {
		String oldCategorie = categorie;
		categorie = newCategorie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POSTE_TIR__CATEGORIE, oldCategorie, categorie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getEstAssocieTypeMateriel() {
		return estAssocieTypeMateriel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstAssocieTypeMateriel(TypeAssociationEXT newEstAssocieTypeMateriel, NotificationChain msgs) {
		TypeAssociationEXT oldEstAssocieTypeMateriel = estAssocieTypeMateriel;
		estAssocieTypeMateriel = newEstAssocieTypeMateriel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POSTE_TIR__EST_ASSOCIE_TYPE_MATERIEL, oldEstAssocieTypeMateriel, newEstAssocieTypeMateriel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstAssocieTypeMateriel(TypeAssociationEXT newEstAssocieTypeMateriel) {
		if (newEstAssocieTypeMateriel != estAssocieTypeMateriel) {
			NotificationChain msgs = null;
			if (estAssocieTypeMateriel != null)
				msgs = ((InternalEObject)estAssocieTypeMateriel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POSTE_TIR__EST_ASSOCIE_TYPE_MATERIEL, null, msgs);
			if (newEstAssocieTypeMateriel != null)
				msgs = ((InternalEObject)newEstAssocieTypeMateriel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POSTE_TIR__EST_ASSOCIE_TYPE_MATERIEL, null, msgs);
			msgs = basicSetEstAssocieTypeMateriel(newEstAssocieTypeMateriel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POSTE_TIR__EST_ASSOCIE_TYPE_MATERIEL, newEstAssocieTypeMateriel, newEstAssocieTypeMateriel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_POSTE_TIR__EST_ASSOCIE_TYPE_MATERIEL:
				return basicSetEstAssocieTypeMateriel(null, msgs);
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
			case SchemaPackage.TYPE_POSTE_TIR__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_POSTE_TIR__EST_ASSOCIE_TYPE_MATERIEL:
				return getEstAssocieTypeMateriel();
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
			case SchemaPackage.TYPE_POSTE_TIR__CATEGORIE:
				setCategorie((String)newValue);
				return;
			case SchemaPackage.TYPE_POSTE_TIR__EST_ASSOCIE_TYPE_MATERIEL:
				setEstAssocieTypeMateriel((TypeAssociationEXT)newValue);
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
			case SchemaPackage.TYPE_POSTE_TIR__CATEGORIE:
				setCategorie(CATEGORIE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_POSTE_TIR__EST_ASSOCIE_TYPE_MATERIEL:
				setEstAssocieTypeMateriel((TypeAssociationEXT)null);
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
			case SchemaPackage.TYPE_POSTE_TIR__CATEGORIE:
				return CATEGORIE_EDEFAULT == null ? categorie != null : !CATEGORIE_EDEFAULT.equals(categorie);
			case SchemaPackage.TYPE_POSTE_TIR__EST_ASSOCIE_TYPE_MATERIEL:
				return estAssocieTypeMateriel != null;
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
		result.append(categorie);
		result.append(')');
		return result.toString();
	}

} //TypePosteTirImpl
