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
import mpia.schema.TypeDictionaryDicoListeObjectifsTypeListe;
import mpia.schema.TypeListeObjectifs;

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
 * An implementation of the model object '<em><b>Type Liste Objectifs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeListeObjectifsImpl#getIdentifiantListeObjectifs <em>Identifiant Liste Objectifs</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeListeObjectifsImpl#getTypeListe <em>Type Liste</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeListeObjectifsImpl#getACommeObjectifCiblageObjectifCiblage <em>AComme Objectif Ciblage Objectif Ciblage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypeListeObjectifsImpl extends TypeRacineOperationnelleImpl implements TypeListeObjectifs {
	/**
	 * The default value of the '{@link #getIdentifiantListeObjectifs() <em>Identifiant Liste Objectifs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiantListeObjectifs()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIANT_LISTE_OBJECTIFS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifiantListeObjectifs() <em>Identifiant Liste Objectifs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiantListeObjectifs()
	 * @generated
	 * @ordered
	 */
	protected String identifiantListeObjectifs = IDENTIFIANT_LISTE_OBJECTIFS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeListe() <em>Type Liste</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeListe()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoListeObjectifsTypeListe TYPE_LISTE_EDEFAULT = TypeDictionaryDicoListeObjectifsTypeListe.TIM;

	/**
	 * The cached value of the '{@link #getTypeListe() <em>Type Liste</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeListe()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoListeObjectifsTypeListe typeListe = TYPE_LISTE_EDEFAULT;

	/**
	 * This is true if the Type Liste attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeListeESet;

	/**
	 * The cached value of the '{@link #getACommeObjectifCiblageObjectifCiblage() <em>AComme Objectif Ciblage Objectif Ciblage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeObjectifCiblageObjectifCiblage()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aCommeObjectifCiblageObjectifCiblage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeListeObjectifsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeListeObjectifs();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentifiantListeObjectifs() {
		return identifiantListeObjectifs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifiantListeObjectifs(String newIdentifiantListeObjectifs) {
		String oldIdentifiantListeObjectifs = identifiantListeObjectifs;
		identifiantListeObjectifs = newIdentifiantListeObjectifs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LISTE_OBJECTIFS__IDENTIFIANT_LISTE_OBJECTIFS, oldIdentifiantListeObjectifs, identifiantListeObjectifs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoListeObjectifsTypeListe getTypeListe() {
		return typeListe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeListe(TypeDictionaryDicoListeObjectifsTypeListe newTypeListe) {
		TypeDictionaryDicoListeObjectifsTypeListe oldTypeListe = typeListe;
		typeListe = newTypeListe == null ? TYPE_LISTE_EDEFAULT : newTypeListe;
		boolean oldTypeListeESet = typeListeESet;
		typeListeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LISTE_OBJECTIFS__TYPE_LISTE, oldTypeListe, typeListe, !oldTypeListeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeListe() {
		TypeDictionaryDicoListeObjectifsTypeListe oldTypeListe = typeListe;
		boolean oldTypeListeESet = typeListeESet;
		typeListe = TYPE_LISTE_EDEFAULT;
		typeListeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_LISTE_OBJECTIFS__TYPE_LISTE, oldTypeListe, TYPE_LISTE_EDEFAULT, oldTypeListeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeListe() {
		return typeListeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getACommeObjectifCiblageObjectifCiblage() {
		if (aCommeObjectifCiblageObjectifCiblage == null) {
			aCommeObjectifCiblageObjectifCiblage = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_LISTE_OBJECTIFS__ACOMME_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE);
		}
		return aCommeObjectifCiblageObjectifCiblage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_LISTE_OBJECTIFS__ACOMME_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE:
				return ((InternalEList<?>)getACommeObjectifCiblageObjectifCiblage()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_LISTE_OBJECTIFS__IDENTIFIANT_LISTE_OBJECTIFS:
				return getIdentifiantListeObjectifs();
			case SchemaPackage.TYPE_LISTE_OBJECTIFS__TYPE_LISTE:
				return getTypeListe();
			case SchemaPackage.TYPE_LISTE_OBJECTIFS__ACOMME_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE:
				return getACommeObjectifCiblageObjectifCiblage();
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
			case SchemaPackage.TYPE_LISTE_OBJECTIFS__IDENTIFIANT_LISTE_OBJECTIFS:
				setIdentifiantListeObjectifs((String)newValue);
				return;
			case SchemaPackage.TYPE_LISTE_OBJECTIFS__TYPE_LISTE:
				setTypeListe((TypeDictionaryDicoListeObjectifsTypeListe)newValue);
				return;
			case SchemaPackage.TYPE_LISTE_OBJECTIFS__ACOMME_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE:
				getACommeObjectifCiblageObjectifCiblage().clear();
				getACommeObjectifCiblageObjectifCiblage().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_LISTE_OBJECTIFS__IDENTIFIANT_LISTE_OBJECTIFS:
				setIdentifiantListeObjectifs(IDENTIFIANT_LISTE_OBJECTIFS_EDEFAULT);
				return;
			case SchemaPackage.TYPE_LISTE_OBJECTIFS__TYPE_LISTE:
				unsetTypeListe();
				return;
			case SchemaPackage.TYPE_LISTE_OBJECTIFS__ACOMME_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE:
				getACommeObjectifCiblageObjectifCiblage().clear();
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
			case SchemaPackage.TYPE_LISTE_OBJECTIFS__IDENTIFIANT_LISTE_OBJECTIFS:
				return IDENTIFIANT_LISTE_OBJECTIFS_EDEFAULT == null ? identifiantListeObjectifs != null : !IDENTIFIANT_LISTE_OBJECTIFS_EDEFAULT.equals(identifiantListeObjectifs);
			case SchemaPackage.TYPE_LISTE_OBJECTIFS__TYPE_LISTE:
				return isSetTypeListe();
			case SchemaPackage.TYPE_LISTE_OBJECTIFS__ACOMME_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE:
				return aCommeObjectifCiblageObjectifCiblage != null && !aCommeObjectifCiblageObjectifCiblage.isEmpty();
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
		result.append(" (identifiantListeObjectifs: ");
		result.append(identifiantListeObjectifs);
		result.append(", typeListe: ");
		if (typeListeESet) result.append(typeListe); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeListeObjectifsImpl
