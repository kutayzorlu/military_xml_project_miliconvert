/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAdresseElectronique;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Adresse Electronique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAdresseElectroniqueImpl#getAdresseReseau <em>Adresse Reseau</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAdresseElectroniqueImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAdresseElectroniqueImpl#getFournitAccesAServiceReseau <em>Fournit Acces AService Reseau</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAdresseElectroniqueImpl extends TypeAdresseImpl implements TypeAdresseElectronique {
	/**
	 * The default value of the '{@link #getAdresseReseau() <em>Adresse Reseau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdresseReseau()
	 * @generated
	 * @ordered
	 */
	protected static final String ADRESSE_RESEAU_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdresseReseau() <em>Adresse Reseau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdresseReseau()
	 * @generated
	 * @ordered
	 */
	protected String adresseReseau = ADRESSE_RESEAU_EDEFAULT;

	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFournitAccesAServiceReseau() <em>Fournit Acces AService Reseau</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFournitAccesAServiceReseau()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> fournitAccesAServiceReseau;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAdresseElectroniqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAdresseElectronique();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAdresseReseau() {
		return adresseReseau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdresseReseau(String newAdresseReseau) {
		String oldAdresseReseau = adresseReseau;
		adresseReseau = newAdresseReseau;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ADRESSE_ELECTRONIQUE__ADRESSE_RESEAU, oldAdresseReseau, adresseReseau));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ADRESSE_ELECTRONIQUE__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getFournitAccesAServiceReseau() {
		if (fournitAccesAServiceReseau == null) {
			fournitAccesAServiceReseau = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ADRESSE_ELECTRONIQUE__FOURNIT_ACCES_ASERVICE_RESEAU);
		}
		return fournitAccesAServiceReseau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ADRESSE_ELECTRONIQUE__FOURNIT_ACCES_ASERVICE_RESEAU:
				return ((InternalEList<?>)getFournitAccesAServiceReseau()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_ADRESSE_ELECTRONIQUE__ADRESSE_RESEAU:
				return getAdresseReseau();
			case SchemaPackage.TYPE_ADRESSE_ELECTRONIQUE__NOM:
				return getNom();
			case SchemaPackage.TYPE_ADRESSE_ELECTRONIQUE__FOURNIT_ACCES_ASERVICE_RESEAU:
				return getFournitAccesAServiceReseau();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SchemaPackage.TYPE_ADRESSE_ELECTRONIQUE__ADRESSE_RESEAU:
				setAdresseReseau((String)newValue);
				return;
			case SchemaPackage.TYPE_ADRESSE_ELECTRONIQUE__NOM:
				setNom((String)newValue);
				return;
			case SchemaPackage.TYPE_ADRESSE_ELECTRONIQUE__FOURNIT_ACCES_ASERVICE_RESEAU:
				getFournitAccesAServiceReseau().clear();
				getFournitAccesAServiceReseau().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_ADRESSE_ELECTRONIQUE__ADRESSE_RESEAU:
				setAdresseReseau(ADRESSE_RESEAU_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ADRESSE_ELECTRONIQUE__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ADRESSE_ELECTRONIQUE__FOURNIT_ACCES_ASERVICE_RESEAU:
				getFournitAccesAServiceReseau().clear();
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
			case SchemaPackage.TYPE_ADRESSE_ELECTRONIQUE__ADRESSE_RESEAU:
				return ADRESSE_RESEAU_EDEFAULT == null ? adresseReseau != null : !ADRESSE_RESEAU_EDEFAULT.equals(adresseReseau);
			case SchemaPackage.TYPE_ADRESSE_ELECTRONIQUE__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case SchemaPackage.TYPE_ADRESSE_ELECTRONIQUE__FOURNIT_ACCES_ASERVICE_RESEAU:
				return fournitAccesAServiceReseau != null && !fournitAccesAServiceReseau.isEmpty();
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
		result.append(" (adresseReseau: ");
		result.append(adresseReseau);
		result.append(", nom: ");
		result.append(nom);
		result.append(')');
		return result.toString();
	}

} //TypeAdresseElectroniqueImpl
