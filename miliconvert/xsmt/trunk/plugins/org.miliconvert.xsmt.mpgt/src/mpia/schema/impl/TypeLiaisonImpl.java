/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoLiaisonEtatLiaison;
import mpia.schema.TypeLiaison;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Liaison</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeLiaisonImpl#getEtatLiaison <em>Etat Liaison</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeLiaisonImpl#getMoyens <em>Moyens</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeLiaisonImpl#getAPourCorrespondantUnite <em>APour Correspondant Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeLiaisonImpl#getAPourCorrespondantSite <em>APour Correspondant Site</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeLiaisonImpl extends EObjectImpl implements TypeLiaison {
	/**
	 * The default value of the '{@link #getEtatLiaison() <em>Etat Liaison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatLiaison()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoLiaisonEtatLiaison ETAT_LIAISON_EDEFAULT = TypeDictionaryDicoLiaisonEtatLiaison.ACT;

	/**
	 * The cached value of the '{@link #getEtatLiaison() <em>Etat Liaison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatLiaison()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoLiaisonEtatLiaison etatLiaison = ETAT_LIAISON_EDEFAULT;

	/**
	 * This is true if the Etat Liaison attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean etatLiaisonESet;

	/**
	 * The default value of the '{@link #getMoyens() <em>Moyens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyens()
	 * @generated
	 * @ordered
	 */
	protected static final String MOYENS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMoyens() <em>Moyens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyens()
	 * @generated
	 * @ordered
	 */
	protected String moyens = MOYENS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAPourCorrespondantUnite() <em>APour Correspondant Unite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourCorrespondantUnite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociationEXT> aPourCorrespondantUnite;

	/**
	 * The cached value of the '{@link #getAPourCorrespondantSite() <em>APour Correspondant Site</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourCorrespondantSite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourCorrespondantSite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeLiaisonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeLiaison();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoLiaisonEtatLiaison getEtatLiaison() {
		return etatLiaison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtatLiaison(TypeDictionaryDicoLiaisonEtatLiaison newEtatLiaison) {
		TypeDictionaryDicoLiaisonEtatLiaison oldEtatLiaison = etatLiaison;
		etatLiaison = newEtatLiaison == null ? ETAT_LIAISON_EDEFAULT : newEtatLiaison;
		boolean oldEtatLiaisonESet = etatLiaisonESet;
		etatLiaisonESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LIAISON__ETAT_LIAISON, oldEtatLiaison, etatLiaison, !oldEtatLiaisonESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEtatLiaison() {
		TypeDictionaryDicoLiaisonEtatLiaison oldEtatLiaison = etatLiaison;
		boolean oldEtatLiaisonESet = etatLiaisonESet;
		etatLiaison = ETAT_LIAISON_EDEFAULT;
		etatLiaisonESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_LIAISON__ETAT_LIAISON, oldEtatLiaison, ETAT_LIAISON_EDEFAULT, oldEtatLiaisonESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEtatLiaison() {
		return etatLiaisonESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMoyens() {
		return moyens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoyens(String newMoyens) {
		String oldMoyens = moyens;
		moyens = newMoyens;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LIAISON__MOYENS, oldMoyens, moyens));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEXT> getAPourCorrespondantUnite() {
		if (aPourCorrespondantUnite == null) {
			aPourCorrespondantUnite = new EObjectContainmentEList<TypeAssociationEXT>(TypeAssociationEXT.class, this, SchemaPackage.TYPE_LIAISON__APOUR_CORRESPONDANT_UNITE);
		}
		return aPourCorrespondantUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourCorrespondantSite() {
		if (aPourCorrespondantSite == null) {
			aPourCorrespondantSite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_LIAISON__APOUR_CORRESPONDANT_SITE);
		}
		return aPourCorrespondantSite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_LIAISON__APOUR_CORRESPONDANT_UNITE:
				return ((InternalEList<?>)getAPourCorrespondantUnite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_LIAISON__APOUR_CORRESPONDANT_SITE:
				return ((InternalEList<?>)getAPourCorrespondantSite()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_LIAISON__ETAT_LIAISON:
				return getEtatLiaison();
			case SchemaPackage.TYPE_LIAISON__MOYENS:
				return getMoyens();
			case SchemaPackage.TYPE_LIAISON__APOUR_CORRESPONDANT_UNITE:
				return getAPourCorrespondantUnite();
			case SchemaPackage.TYPE_LIAISON__APOUR_CORRESPONDANT_SITE:
				return getAPourCorrespondantSite();
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
			case SchemaPackage.TYPE_LIAISON__ETAT_LIAISON:
				setEtatLiaison((TypeDictionaryDicoLiaisonEtatLiaison)newValue);
				return;
			case SchemaPackage.TYPE_LIAISON__MOYENS:
				setMoyens((String)newValue);
				return;
			case SchemaPackage.TYPE_LIAISON__APOUR_CORRESPONDANT_UNITE:
				getAPourCorrespondantUnite().clear();
				getAPourCorrespondantUnite().addAll((Collection<? extends TypeAssociationEXT>)newValue);
				return;
			case SchemaPackage.TYPE_LIAISON__APOUR_CORRESPONDANT_SITE:
				getAPourCorrespondantSite().clear();
				getAPourCorrespondantSite().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_LIAISON__ETAT_LIAISON:
				unsetEtatLiaison();
				return;
			case SchemaPackage.TYPE_LIAISON__MOYENS:
				setMoyens(MOYENS_EDEFAULT);
				return;
			case SchemaPackage.TYPE_LIAISON__APOUR_CORRESPONDANT_UNITE:
				getAPourCorrespondantUnite().clear();
				return;
			case SchemaPackage.TYPE_LIAISON__APOUR_CORRESPONDANT_SITE:
				getAPourCorrespondantSite().clear();
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
			case SchemaPackage.TYPE_LIAISON__ETAT_LIAISON:
				return isSetEtatLiaison();
			case SchemaPackage.TYPE_LIAISON__MOYENS:
				return MOYENS_EDEFAULT == null ? moyens != null : !MOYENS_EDEFAULT.equals(moyens);
			case SchemaPackage.TYPE_LIAISON__APOUR_CORRESPONDANT_UNITE:
				return aPourCorrespondantUnite != null && !aPourCorrespondantUnite.isEmpty();
			case SchemaPackage.TYPE_LIAISON__APOUR_CORRESPONDANT_SITE:
				return aPourCorrespondantSite != null && !aPourCorrespondantSite.isEmpty();
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
		result.append(" (etatLiaison: ");
		if (etatLiaisonESet) result.append(etatLiaison); else result.append("<unset>");
		result.append(", moyens: ");
		result.append(moyens);
		result.append(')');
		return result.toString();
	}

} //TypeLiaisonImpl
