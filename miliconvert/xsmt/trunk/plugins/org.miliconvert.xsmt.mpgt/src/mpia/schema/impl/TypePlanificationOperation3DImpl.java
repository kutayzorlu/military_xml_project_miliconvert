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
import mpia.schema.TypePlanificationOperation3D;
import mpia.schema.TypeRessourceActiviteType;

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
 * An implementation of the model object '<em><b>Type Planification Operation3 D</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypePlanificationOperation3DImpl#getNumeroSerieMessage <em>Numero Serie Message</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlanificationOperation3DImpl#getEstSujetAssociationPlanificationOperation3DMissionAir <em>Est Sujet Association Planification Operation3 DMission Air</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlanificationOperation3DImpl#getEstSujetAssociationPlanificationOperation3DMissionASA <em>Est Sujet Association Planification Operation3 DMission ASA</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlanificationOperation3DImpl#getAPourUniteExecutanteUnite <em>APour Unite Executante Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlanificationOperation3DImpl#getAPourTypeRessourceRessourceActiviteTypeRessourceActiviteType <em>APour Type Ressource Ressource Activite Type Ressource Activite Type</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlanificationOperation3DImpl#getEstObjetAssociationPersonnePlanifOperation3D <em>Est Objet Association Personne Planif Operation3 D</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlanificationOperation3DImpl#getEstObjetAssociationUnitePlanifOperation3D <em>Est Objet Association Unite Planif Operation3 D</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypePlanificationOperation3DImpl extends TypeMissionImpl implements TypePlanificationOperation3D {
	/**
	 * The default value of the '{@link #getNumeroSerieMessage() <em>Numero Serie Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroSerieMessage()
	 * @generated
	 * @ordered
	 */
	protected static final long NUMERO_SERIE_MESSAGE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNumeroSerieMessage() <em>Numero Serie Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroSerieMessage()
	 * @generated
	 * @ordered
	 */
	protected long numeroSerieMessage = NUMERO_SERIE_MESSAGE_EDEFAULT;

	/**
	 * This is true if the Numero Serie Message attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numeroSerieMessageESet;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationPlanificationOperation3DMissionAir() <em>Est Sujet Association Planification Operation3 DMission Air</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationPlanificationOperation3DMissionAir()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationPlanificationOperation3DMissionAir;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationPlanificationOperation3DMissionASA() <em>Est Sujet Association Planification Operation3 DMission ASA</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationPlanificationOperation3DMissionASA()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationPlanificationOperation3DMissionASA;

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
	 * The cached value of the '{@link #getAPourTypeRessourceRessourceActiviteTypeRessourceActiviteType() <em>APour Type Ressource Ressource Activite Type Ressource Activite Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourTypeRessourceRessourceActiviteTypeRessourceActiviteType()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeRessourceActiviteType> aPourTypeRessourceRessourceActiviteTypeRessourceActiviteType;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationPersonnePlanifOperation3D() <em>Est Objet Association Personne Planif Operation3 D</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationPersonnePlanifOperation3D()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationPersonnePlanifOperation3D;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationUnitePlanifOperation3D() <em>Est Objet Association Unite Planif Operation3 D</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationUnitePlanifOperation3D()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationUnitePlanifOperation3D;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypePlanificationOperation3DImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypePlanificationOperation3D();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNumeroSerieMessage() {
		return numeroSerieMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroSerieMessage(long newNumeroSerieMessage) {
		long oldNumeroSerieMessage = numeroSerieMessage;
		numeroSerieMessage = newNumeroSerieMessage;
		boolean oldNumeroSerieMessageESet = numeroSerieMessageESet;
		numeroSerieMessageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PLANIFICATION_OPERATION3_D__NUMERO_SERIE_MESSAGE, oldNumeroSerieMessage, numeroSerieMessage, !oldNumeroSerieMessageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumeroSerieMessage() {
		long oldNumeroSerieMessage = numeroSerieMessage;
		boolean oldNumeroSerieMessageESet = numeroSerieMessageESet;
		numeroSerieMessage = NUMERO_SERIE_MESSAGE_EDEFAULT;
		numeroSerieMessageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PLANIFICATION_OPERATION3_D__NUMERO_SERIE_MESSAGE, oldNumeroSerieMessage, NUMERO_SERIE_MESSAGE_EDEFAULT, oldNumeroSerieMessageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumeroSerieMessage() {
		return numeroSerieMessageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationPlanificationOperation3DMissionAir() {
		if (estSujetAssociationPlanificationOperation3DMissionAir == null) {
			estSujetAssociationPlanificationOperation3DMissionAir = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_PLANIFICATION_OPERATION3_D__EST_SUJET_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_AIR);
		}
		return estSujetAssociationPlanificationOperation3DMissionAir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationPlanificationOperation3DMissionASA() {
		if (estSujetAssociationPlanificationOperation3DMissionASA == null) {
			estSujetAssociationPlanificationOperation3DMissionASA = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_PLANIFICATION_OPERATION3_D__EST_SUJET_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_ASA);
		}
		return estSujetAssociationPlanificationOperation3DMissionASA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourUniteExecutanteUnite() {
		if (aPourUniteExecutanteUnite == null) {
			aPourUniteExecutanteUnite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_PLANIFICATION_OPERATION3_D__APOUR_UNITE_EXECUTANTE_UNITE);
		}
		return aPourUniteExecutanteUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeRessourceActiviteType> getAPourTypeRessourceRessourceActiviteTypeRessourceActiviteType() {
		if (aPourTypeRessourceRessourceActiviteTypeRessourceActiviteType == null) {
			aPourTypeRessourceRessourceActiviteTypeRessourceActiviteType = new EObjectContainmentEList<TypeRessourceActiviteType>(TypeRessourceActiviteType.class, this, SchemaPackage.TYPE_PLANIFICATION_OPERATION3_D__APOUR_TYPE_RESSOURCE_RESSOURCE_ACTIVITE_TYPE_RESSOURCE_ACTIVITE_TYPE);
		}
		return aPourTypeRessourceRessourceActiviteTypeRessourceActiviteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationPersonnePlanifOperation3D() {
		if (estObjetAssociationPersonnePlanifOperation3D == null) {
			estObjetAssociationPersonnePlanifOperation3D = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_PLANIFICATION_OPERATION3_D__EST_OBJET_ASSOCIATION_PERSONNE_PLANIF_OPERATION3_D);
		}
		return estObjetAssociationPersonnePlanifOperation3D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationUnitePlanifOperation3D() {
		if (estObjetAssociationUnitePlanifOperation3D == null) {
			estObjetAssociationUnitePlanifOperation3D = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_PLANIFICATION_OPERATION3_D__EST_OBJET_ASSOCIATION_UNITE_PLANIF_OPERATION3_D);
		}
		return estObjetAssociationUnitePlanifOperation3D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_PLANIFICATION_OPERATION3_D__EST_SUJET_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_AIR:
				return ((InternalEList<?>)getEstSujetAssociationPlanificationOperation3DMissionAir()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PLANIFICATION_OPERATION3_D__EST_SUJET_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_ASA:
				return ((InternalEList<?>)getEstSujetAssociationPlanificationOperation3DMissionASA()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PLANIFICATION_OPERATION3_D__APOUR_UNITE_EXECUTANTE_UNITE:
				return ((InternalEList<?>)getAPourUniteExecutanteUnite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PLANIFICATION_OPERATION3_D__APOUR_TYPE_RESSOURCE_RESSOURCE_ACTIVITE_TYPE_RESSOURCE_ACTIVITE_TYPE:
				return ((InternalEList<?>)getAPourTypeRessourceRessourceActiviteTypeRessourceActiviteType()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PLANIFICATION_OPERATION3_D__EST_OBJET_ASSOCIATION_PERSONNE_PLANIF_OPERATION3_D:
				return ((InternalEList<?>)getEstObjetAssociationPersonnePlanifOperation3D()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PLANIFICATION_OPERATION3_D__EST_OBJET_ASSOCIATION_UNITE_PLANIF_OPERATION3_D:
				return ((InternalEList<?>)getEstObjetAssociationUnitePlanifOperation3D()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_PLANIFICATION_OPERATION3_D__NUMERO_SERIE_MESSAGE:
				return new Long(getNumeroSerieMessage());
			case SchemaPackage.TYPE_PLANIFICATION_OPERATION3_D__EST_SUJET_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_AIR:
				return getEstSujetAssociationPlanificationOperation3DMissionAir();
			case SchemaPackage.TYPE_PLANIFICATION_OPERATION3_D__EST_SUJET_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_ASA:
				return getEstSujetAssociationPlanificationOperation3DMissionASA();
			case SchemaPackage.TYPE_PLANIFICATION_OPERATION3_D__APOUR_UNITE_EXECUTANTE_UNITE:
				return getAPourUniteExecutanteUnite();
			case SchemaPackage.TYPE_PLANIFICATION_OPERATION3_D__APOUR_TYPE_RESSOURCE_RESSOURCE_ACTIVITE_TYPE_RESSOURCE_ACTIVITE_TYPE:
				return getAPourTypeRessourceRessourceActiviteTypeRessourceActiviteType();
			case SchemaPackage.TYPE_PLANIFICATION_OPERATION3_D__EST_OBJET_ASSOCIATION_PERSONNE_PLANIF_OPERATION3_D:
				return getEstObjetAssociationPersonnePlanifOperation3D();
			case SchemaPackage.TYPE_PLANIFICATION_OPERATION3_D__EST_OBJET_ASSOCIATION_UNITE_PLANIF_OPERATION3_D:
				return getEstObjetAssociationUnitePlanifOperation3D();
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
			case SchemaPackage.TYPE_PLANIFICATION_OPERATION3_D__NUMERO_SERIE_MESSAGE:
				setNumeroSerieMessage(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_PLANIFICATION_OPERATION3_D__EST_SUJET_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_AIR:
				getEstSujetAssociationPlanificationOperation3DMissionAir().clear();
				getEstSujetAssociationPlanificationOperation3DMissionAir().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_PLANIFICATION_OPERATION3_D__EST_SUJET_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_ASA:
				getEstSujetAssociationPlanificationOperation3DMissionASA().clear();
				getEstSujetAssociationPlanificationOperation3DMissionASA().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_PLANIFICATION_OPERATION3_D__APOUR_UNITE_EXECUTANTE_UNITE:
				getAPourUniteExecutanteUnite().clear();
				getAPourUniteExecutanteUnite().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_PLANIFICATION_OPERATION3_D__APOUR_TYPE_RESSOURCE_RESSOURCE_ACTIVITE_TYPE_RESSOURCE_ACTIVITE_TYPE:
				getAPourTypeRessourceRessourceActiviteTypeRessourceActiviteType().clear();
				getAPourTypeRessourceRessourceActiviteTypeRessourceActiviteType().addAll((Collection<? extends TypeRessourceActiviteType>)newValue);
				return;
			case SchemaPackage.TYPE_PLANIFICATION_OPERATION3_D__EST_OBJET_ASSOCIATION_PERSONNE_PLANIF_OPERATION3_D:
				getEstObjetAssociationPersonnePlanifOperation3D().clear();
				getEstObjetAssociationPersonnePlanifOperation3D().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_PLANIFICATION_OPERATION3_D__EST_OBJET_ASSOCIATION_UNITE_PLANIF_OPERATION3_D:
				getEstObjetAssociationUnitePlanifOperation3D().clear();
				getEstObjetAssociationUnitePlanifOperation3D().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_PLANIFICATION_OPERATION3_D__NUMERO_SERIE_MESSAGE:
				unsetNumeroSerieMessage();
				return;
			case SchemaPackage.TYPE_PLANIFICATION_OPERATION3_D__EST_SUJET_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_AIR:
				getEstSujetAssociationPlanificationOperation3DMissionAir().clear();
				return;
			case SchemaPackage.TYPE_PLANIFICATION_OPERATION3_D__EST_SUJET_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_ASA:
				getEstSujetAssociationPlanificationOperation3DMissionASA().clear();
				return;
			case SchemaPackage.TYPE_PLANIFICATION_OPERATION3_D__APOUR_UNITE_EXECUTANTE_UNITE:
				getAPourUniteExecutanteUnite().clear();
				return;
			case SchemaPackage.TYPE_PLANIFICATION_OPERATION3_D__APOUR_TYPE_RESSOURCE_RESSOURCE_ACTIVITE_TYPE_RESSOURCE_ACTIVITE_TYPE:
				getAPourTypeRessourceRessourceActiviteTypeRessourceActiviteType().clear();
				return;
			case SchemaPackage.TYPE_PLANIFICATION_OPERATION3_D__EST_OBJET_ASSOCIATION_PERSONNE_PLANIF_OPERATION3_D:
				getEstObjetAssociationPersonnePlanifOperation3D().clear();
				return;
			case SchemaPackage.TYPE_PLANIFICATION_OPERATION3_D__EST_OBJET_ASSOCIATION_UNITE_PLANIF_OPERATION3_D:
				getEstObjetAssociationUnitePlanifOperation3D().clear();
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
			case SchemaPackage.TYPE_PLANIFICATION_OPERATION3_D__NUMERO_SERIE_MESSAGE:
				return isSetNumeroSerieMessage();
			case SchemaPackage.TYPE_PLANIFICATION_OPERATION3_D__EST_SUJET_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_AIR:
				return estSujetAssociationPlanificationOperation3DMissionAir != null && !estSujetAssociationPlanificationOperation3DMissionAir.isEmpty();
			case SchemaPackage.TYPE_PLANIFICATION_OPERATION3_D__EST_SUJET_ASSOCIATION_PLANIFICATION_OPERATION3_DMISSION_ASA:
				return estSujetAssociationPlanificationOperation3DMissionASA != null && !estSujetAssociationPlanificationOperation3DMissionASA.isEmpty();
			case SchemaPackage.TYPE_PLANIFICATION_OPERATION3_D__APOUR_UNITE_EXECUTANTE_UNITE:
				return aPourUniteExecutanteUnite != null && !aPourUniteExecutanteUnite.isEmpty();
			case SchemaPackage.TYPE_PLANIFICATION_OPERATION3_D__APOUR_TYPE_RESSOURCE_RESSOURCE_ACTIVITE_TYPE_RESSOURCE_ACTIVITE_TYPE:
				return aPourTypeRessourceRessourceActiviteTypeRessourceActiviteType != null && !aPourTypeRessourceRessourceActiviteTypeRessourceActiviteType.isEmpty();
			case SchemaPackage.TYPE_PLANIFICATION_OPERATION3_D__EST_OBJET_ASSOCIATION_PERSONNE_PLANIF_OPERATION3_D:
				return estObjetAssociationPersonnePlanifOperation3D != null && !estObjetAssociationPersonnePlanifOperation3D.isEmpty();
			case SchemaPackage.TYPE_PLANIFICATION_OPERATION3_D__EST_OBJET_ASSOCIATION_UNITE_PLANIF_OPERATION3_D:
				return estObjetAssociationUnitePlanifOperation3D != null && !estObjetAssociationUnitePlanifOperation3D.isEmpty();
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
		result.append(" (numeroSerieMessage: ");
		if (numeroSerieMessageESet) result.append(numeroSerieMessage); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypePlanificationOperation3DImpl
