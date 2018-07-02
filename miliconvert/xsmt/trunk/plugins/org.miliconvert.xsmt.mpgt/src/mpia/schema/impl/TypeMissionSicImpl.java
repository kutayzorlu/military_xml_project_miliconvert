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
import mpia.schema.TypeBesoinRaccordement;
import mpia.schema.TypeEmploiFrequence;
import mpia.schema.TypeLiaison;
import mpia.schema.TypeMissionSic;

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
 * An implementation of the model object '<em><b>Type Mission Sic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMissionSicImpl#getComplementMission <em>Complement Mission</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionSicImpl#getNumeroMission <em>Numero Mission</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionSicImpl#getAPourUniteExecutanteUnite <em>APour Unite Executante Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionSicImpl#getAPourBesoinLiaisonBesoinRaccordement <em>APour Besoin Liaison Besoin Raccordement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionSicImpl#getDecritLiaison <em>Decrit Liaison</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionSicImpl#getAPourEmploiFrequenceEmploiFrequence <em>APour Emploi Frequence Emploi Frequence</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionSicImpl#getEstObjetAssociationUniteMissionSic <em>Est Objet Association Unite Mission Sic</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMissionSicImpl extends TypeMissionImpl implements TypeMissionSic {
	/**
	 * The default value of the '{@link #getComplementMission() <em>Complement Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplementMission()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPLEMENT_MISSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComplementMission() <em>Complement Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplementMission()
	 * @generated
	 * @ordered
	 */
	protected String complementMission = COMPLEMENT_MISSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumeroMission() <em>Numero Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroMission()
	 * @generated
	 * @ordered
	 */
	protected static final long NUMERO_MISSION_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNumeroMission() <em>Numero Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroMission()
	 * @generated
	 * @ordered
	 */
	protected long numeroMission = NUMERO_MISSION_EDEFAULT;

	/**
	 * This is true if the Numero Mission attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numeroMissionESet;

	/**
	 * The cached value of the '{@link #getAPourUniteExecutanteUnite() <em>APour Unite Executante Unite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourUniteExecutanteUnite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourUniteExecutanteUnite;

	/**
	 * The cached value of the '{@link #getAPourBesoinLiaisonBesoinRaccordement() <em>APour Besoin Liaison Besoin Raccordement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourBesoinLiaisonBesoinRaccordement()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeBesoinRaccordement> aPourBesoinLiaisonBesoinRaccordement;

	/**
	 * The cached value of the '{@link #getDecritLiaison() <em>Decrit Liaison</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecritLiaison()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeLiaison> decritLiaison;

	/**
	 * The cached value of the '{@link #getAPourEmploiFrequenceEmploiFrequence() <em>APour Emploi Frequence Emploi Frequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourEmploiFrequenceEmploiFrequence()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeEmploiFrequence> aPourEmploiFrequenceEmploiFrequence;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationUniteMissionSic() <em>Est Objet Association Unite Mission Sic</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationUniteMissionSic()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationUniteMissionSic;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMissionSicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMissionSic();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComplementMission() {
		return complementMission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplementMission(String newComplementMission) {
		String oldComplementMission = complementMission;
		complementMission = newComplementMission;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_SIC__COMPLEMENT_MISSION, oldComplementMission, complementMission));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNumeroMission() {
		return numeroMission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroMission(long newNumeroMission) {
		long oldNumeroMission = numeroMission;
		numeroMission = newNumeroMission;
		boolean oldNumeroMissionESet = numeroMissionESet;
		numeroMissionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_SIC__NUMERO_MISSION, oldNumeroMission, numeroMission, !oldNumeroMissionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumeroMission() {
		long oldNumeroMission = numeroMission;
		boolean oldNumeroMissionESet = numeroMissionESet;
		numeroMission = NUMERO_MISSION_EDEFAULT;
		numeroMissionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MISSION_SIC__NUMERO_MISSION, oldNumeroMission, NUMERO_MISSION_EDEFAULT, oldNumeroMissionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumeroMission() {
		return numeroMissionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourUniteExecutanteUnite() {
		if (aPourUniteExecutanteUnite == null) {
			aPourUniteExecutanteUnite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_SIC__APOUR_UNITE_EXECUTANTE_UNITE);
		}
		return aPourUniteExecutanteUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeBesoinRaccordement> getAPourBesoinLiaisonBesoinRaccordement() {
		if (aPourBesoinLiaisonBesoinRaccordement == null) {
			aPourBesoinLiaisonBesoinRaccordement = new EObjectContainmentEList<TypeBesoinRaccordement>(TypeBesoinRaccordement.class, this, SchemaPackage.TYPE_MISSION_SIC__APOUR_BESOIN_LIAISON_BESOIN_RACCORDEMENT);
		}
		return aPourBesoinLiaisonBesoinRaccordement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeLiaison> getDecritLiaison() {
		if (decritLiaison == null) {
			decritLiaison = new EObjectContainmentEList<TypeLiaison>(TypeLiaison.class, this, SchemaPackage.TYPE_MISSION_SIC__DECRIT_LIAISON);
		}
		return decritLiaison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeEmploiFrequence> getAPourEmploiFrequenceEmploiFrequence() {
		if (aPourEmploiFrequenceEmploiFrequence == null) {
			aPourEmploiFrequenceEmploiFrequence = new EObjectContainmentEList<TypeEmploiFrequence>(TypeEmploiFrequence.class, this, SchemaPackage.TYPE_MISSION_SIC__APOUR_EMPLOI_FREQUENCE_EMPLOI_FREQUENCE);
		}
		return aPourEmploiFrequenceEmploiFrequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationUniteMissionSic() {
		if (estObjetAssociationUniteMissionSic == null) {
			estObjetAssociationUniteMissionSic = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION_SIC__EST_OBJET_ASSOCIATION_UNITE_MISSION_SIC);
		}
		return estObjetAssociationUniteMissionSic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MISSION_SIC__APOUR_UNITE_EXECUTANTE_UNITE:
				return ((InternalEList<?>)getAPourUniteExecutanteUnite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_SIC__APOUR_BESOIN_LIAISON_BESOIN_RACCORDEMENT:
				return ((InternalEList<?>)getAPourBesoinLiaisonBesoinRaccordement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_SIC__DECRIT_LIAISON:
				return ((InternalEList<?>)getDecritLiaison()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_SIC__APOUR_EMPLOI_FREQUENCE_EMPLOI_FREQUENCE:
				return ((InternalEList<?>)getAPourEmploiFrequenceEmploiFrequence()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_SIC__EST_OBJET_ASSOCIATION_UNITE_MISSION_SIC:
				return ((InternalEList<?>)getEstObjetAssociationUniteMissionSic()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_MISSION_SIC__COMPLEMENT_MISSION:
				return getComplementMission();
			case SchemaPackage.TYPE_MISSION_SIC__NUMERO_MISSION:
				return new Long(getNumeroMission());
			case SchemaPackage.TYPE_MISSION_SIC__APOUR_UNITE_EXECUTANTE_UNITE:
				return getAPourUniteExecutanteUnite();
			case SchemaPackage.TYPE_MISSION_SIC__APOUR_BESOIN_LIAISON_BESOIN_RACCORDEMENT:
				return getAPourBesoinLiaisonBesoinRaccordement();
			case SchemaPackage.TYPE_MISSION_SIC__DECRIT_LIAISON:
				return getDecritLiaison();
			case SchemaPackage.TYPE_MISSION_SIC__APOUR_EMPLOI_FREQUENCE_EMPLOI_FREQUENCE:
				return getAPourEmploiFrequenceEmploiFrequence();
			case SchemaPackage.TYPE_MISSION_SIC__EST_OBJET_ASSOCIATION_UNITE_MISSION_SIC:
				return getEstObjetAssociationUniteMissionSic();
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
			case SchemaPackage.TYPE_MISSION_SIC__COMPLEMENT_MISSION:
				setComplementMission((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_SIC__NUMERO_MISSION:
				setNumeroMission(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_MISSION_SIC__APOUR_UNITE_EXECUTANTE_UNITE:
				getAPourUniteExecutanteUnite().clear();
				getAPourUniteExecutanteUnite().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_SIC__APOUR_BESOIN_LIAISON_BESOIN_RACCORDEMENT:
				getAPourBesoinLiaisonBesoinRaccordement().clear();
				getAPourBesoinLiaisonBesoinRaccordement().addAll((Collection<? extends TypeBesoinRaccordement>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_SIC__DECRIT_LIAISON:
				getDecritLiaison().clear();
				getDecritLiaison().addAll((Collection<? extends TypeLiaison>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_SIC__APOUR_EMPLOI_FREQUENCE_EMPLOI_FREQUENCE:
				getAPourEmploiFrequenceEmploiFrequence().clear();
				getAPourEmploiFrequenceEmploiFrequence().addAll((Collection<? extends TypeEmploiFrequence>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_SIC__EST_OBJET_ASSOCIATION_UNITE_MISSION_SIC:
				getEstObjetAssociationUniteMissionSic().clear();
				getEstObjetAssociationUniteMissionSic().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_MISSION_SIC__COMPLEMENT_MISSION:
				setComplementMission(COMPLEMENT_MISSION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_SIC__NUMERO_MISSION:
				unsetNumeroMission();
				return;
			case SchemaPackage.TYPE_MISSION_SIC__APOUR_UNITE_EXECUTANTE_UNITE:
				getAPourUniteExecutanteUnite().clear();
				return;
			case SchemaPackage.TYPE_MISSION_SIC__APOUR_BESOIN_LIAISON_BESOIN_RACCORDEMENT:
				getAPourBesoinLiaisonBesoinRaccordement().clear();
				return;
			case SchemaPackage.TYPE_MISSION_SIC__DECRIT_LIAISON:
				getDecritLiaison().clear();
				return;
			case SchemaPackage.TYPE_MISSION_SIC__APOUR_EMPLOI_FREQUENCE_EMPLOI_FREQUENCE:
				getAPourEmploiFrequenceEmploiFrequence().clear();
				return;
			case SchemaPackage.TYPE_MISSION_SIC__EST_OBJET_ASSOCIATION_UNITE_MISSION_SIC:
				getEstObjetAssociationUniteMissionSic().clear();
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
			case SchemaPackage.TYPE_MISSION_SIC__COMPLEMENT_MISSION:
				return COMPLEMENT_MISSION_EDEFAULT == null ? complementMission != null : !COMPLEMENT_MISSION_EDEFAULT.equals(complementMission);
			case SchemaPackage.TYPE_MISSION_SIC__NUMERO_MISSION:
				return isSetNumeroMission();
			case SchemaPackage.TYPE_MISSION_SIC__APOUR_UNITE_EXECUTANTE_UNITE:
				return aPourUniteExecutanteUnite != null && !aPourUniteExecutanteUnite.isEmpty();
			case SchemaPackage.TYPE_MISSION_SIC__APOUR_BESOIN_LIAISON_BESOIN_RACCORDEMENT:
				return aPourBesoinLiaisonBesoinRaccordement != null && !aPourBesoinLiaisonBesoinRaccordement.isEmpty();
			case SchemaPackage.TYPE_MISSION_SIC__DECRIT_LIAISON:
				return decritLiaison != null && !decritLiaison.isEmpty();
			case SchemaPackage.TYPE_MISSION_SIC__APOUR_EMPLOI_FREQUENCE_EMPLOI_FREQUENCE:
				return aPourEmploiFrequenceEmploiFrequence != null && !aPourEmploiFrequenceEmploiFrequence.isEmpty();
			case SchemaPackage.TYPE_MISSION_SIC__EST_OBJET_ASSOCIATION_UNITE_MISSION_SIC:
				return estObjetAssociationUniteMissionSic != null && !estObjetAssociationUniteMissionSic.isEmpty();
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
		result.append(" (complementMission: ");
		result.append(complementMission);
		result.append(", numeroMission: ");
		if (numeroMissionESet) result.append(numeroMission); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeMissionSicImpl
