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
import mpia.schema.TypePeriode3D;
import mpia.schema.TypeTypeMissionAerienne;
import mpia.schema.TypeUtilisationIFF;

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
 * An implementation of the model object '<em><b>Type Utilisation IFF</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeUtilisationIFFImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUtilisationIFFImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUtilisationIFFImpl#getVautPendantPeriode3D <em>Vaut Pendant Periode3 D</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUtilisationIFFImpl#getPorteSurServiceReseau <em>Porte Sur Service Reseau</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUtilisationIFFImpl#getEstAttribueAUniteUnite <em>Est Attribue AUnite Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUtilisationIFFImpl#getEstAttribueAuTypeAeronefTypeAeronef <em>Est Attribue Au Type Aeronef Type Aeronef</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUtilisationIFFImpl#getEstAttribueAuTypeMissionAerienneTypeMissionAerienne <em>Est Attribue Au Type Mission Aerienne Type Mission Aerienne</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeUtilisationIFFImpl extends EObjectImpl implements TypeUtilisationIFF {
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
	 * The cached value of the '{@link #getVautPendantPeriode3D() <em>Vaut Pendant Periode3 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVautPendantPeriode3D()
	 * @generated
	 * @ordered
	 */
	protected TypePeriode3D vautPendantPeriode3D;

	/**
	 * The cached value of the '{@link #getPorteSurServiceReseau() <em>Porte Sur Service Reseau</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorteSurServiceReseau()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation porteSurServiceReseau;

	/**
	 * The cached value of the '{@link #getEstAttribueAUniteUnite() <em>Est Attribue AUnite Unite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstAttribueAUniteUnite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociationEXT> estAttribueAUniteUnite;

	/**
	 * The cached value of the '{@link #getEstAttribueAuTypeAeronefTypeAeronef() <em>Est Attribue Au Type Aeronef Type Aeronef</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstAttribueAuTypeAeronefTypeAeronef()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociationEXT> estAttribueAuTypeAeronefTypeAeronef;

	/**
	 * The cached value of the '{@link #getEstAttribueAuTypeMissionAerienneTypeMissionAerienne() <em>Est Attribue Au Type Mission Aerienne Type Mission Aerienne</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstAttribueAuTypeMissionAerienneTypeMissionAerienne()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeTypeMissionAerienne> estAttribueAuTypeMissionAerienneTypeMissionAerienne;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeUtilisationIFFImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeUtilisationIFF();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UTILISATION_IFF__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UTILISATION_IFF__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypePeriode3D getVautPendantPeriode3D() {
		return vautPendantPeriode3D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVautPendantPeriode3D(TypePeriode3D newVautPendantPeriode3D, NotificationChain msgs) {
		TypePeriode3D oldVautPendantPeriode3D = vautPendantPeriode3D;
		vautPendantPeriode3D = newVautPendantPeriode3D;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UTILISATION_IFF__VAUT_PENDANT_PERIODE3_D, oldVautPendantPeriode3D, newVautPendantPeriode3D);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVautPendantPeriode3D(TypePeriode3D newVautPendantPeriode3D) {
		if (newVautPendantPeriode3D != vautPendantPeriode3D) {
			NotificationChain msgs = null;
			if (vautPendantPeriode3D != null)
				msgs = ((InternalEObject)vautPendantPeriode3D).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_UTILISATION_IFF__VAUT_PENDANT_PERIODE3_D, null, msgs);
			if (newVautPendantPeriode3D != null)
				msgs = ((InternalEObject)newVautPendantPeriode3D).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_UTILISATION_IFF__VAUT_PENDANT_PERIODE3_D, null, msgs);
			msgs = basicSetVautPendantPeriode3D(newVautPendantPeriode3D, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UTILISATION_IFF__VAUT_PENDANT_PERIODE3_D, newVautPendantPeriode3D, newVautPendantPeriode3D));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getPorteSurServiceReseau() {
		return porteSurServiceReseau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPorteSurServiceReseau(TypeAssociation newPorteSurServiceReseau, NotificationChain msgs) {
		TypeAssociation oldPorteSurServiceReseau = porteSurServiceReseau;
		porteSurServiceReseau = newPorteSurServiceReseau;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UTILISATION_IFF__PORTE_SUR_SERVICE_RESEAU, oldPorteSurServiceReseau, newPorteSurServiceReseau);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPorteSurServiceReseau(TypeAssociation newPorteSurServiceReseau) {
		if (newPorteSurServiceReseau != porteSurServiceReseau) {
			NotificationChain msgs = null;
			if (porteSurServiceReseau != null)
				msgs = ((InternalEObject)porteSurServiceReseau).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_UTILISATION_IFF__PORTE_SUR_SERVICE_RESEAU, null, msgs);
			if (newPorteSurServiceReseau != null)
				msgs = ((InternalEObject)newPorteSurServiceReseau).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_UTILISATION_IFF__PORTE_SUR_SERVICE_RESEAU, null, msgs);
			msgs = basicSetPorteSurServiceReseau(newPorteSurServiceReseau, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UTILISATION_IFF__PORTE_SUR_SERVICE_RESEAU, newPorteSurServiceReseau, newPorteSurServiceReseau));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEXT> getEstAttribueAUniteUnite() {
		if (estAttribueAUniteUnite == null) {
			estAttribueAUniteUnite = new EObjectContainmentEList<TypeAssociationEXT>(TypeAssociationEXT.class, this, SchemaPackage.TYPE_UTILISATION_IFF__EST_ATTRIBUE_AUNITE_UNITE);
		}
		return estAttribueAUniteUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEXT> getEstAttribueAuTypeAeronefTypeAeronef() {
		if (estAttribueAuTypeAeronefTypeAeronef == null) {
			estAttribueAuTypeAeronefTypeAeronef = new EObjectContainmentEList<TypeAssociationEXT>(TypeAssociationEXT.class, this, SchemaPackage.TYPE_UTILISATION_IFF__EST_ATTRIBUE_AU_TYPE_AERONEF_TYPE_AERONEF);
		}
		return estAttribueAuTypeAeronefTypeAeronef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeTypeMissionAerienne> getEstAttribueAuTypeMissionAerienneTypeMissionAerienne() {
		if (estAttribueAuTypeMissionAerienneTypeMissionAerienne == null) {
			estAttribueAuTypeMissionAerienneTypeMissionAerienne = new EObjectContainmentEList<TypeTypeMissionAerienne>(TypeTypeMissionAerienne.class, this, SchemaPackage.TYPE_UTILISATION_IFF__EST_ATTRIBUE_AU_TYPE_MISSION_AERIENNE_TYPE_MISSION_AERIENNE);
		}
		return estAttribueAuTypeMissionAerienneTypeMissionAerienne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_UTILISATION_IFF__VAUT_PENDANT_PERIODE3_D:
				return basicSetVautPendantPeriode3D(null, msgs);
			case SchemaPackage.TYPE_UTILISATION_IFF__PORTE_SUR_SERVICE_RESEAU:
				return basicSetPorteSurServiceReseau(null, msgs);
			case SchemaPackage.TYPE_UTILISATION_IFF__EST_ATTRIBUE_AUNITE_UNITE:
				return ((InternalEList<?>)getEstAttribueAUniteUnite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_UTILISATION_IFF__EST_ATTRIBUE_AU_TYPE_AERONEF_TYPE_AERONEF:
				return ((InternalEList<?>)getEstAttribueAuTypeAeronefTypeAeronef()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_UTILISATION_IFF__EST_ATTRIBUE_AU_TYPE_MISSION_AERIENNE_TYPE_MISSION_AERIENNE:
				return ((InternalEList<?>)getEstAttribueAuTypeMissionAerienneTypeMissionAerienne()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_UTILISATION_IFF__CTE:
				return getCTE();
			case SchemaPackage.TYPE_UTILISATION_IFF__CE:
				return getCE();
			case SchemaPackage.TYPE_UTILISATION_IFF__VAUT_PENDANT_PERIODE3_D:
				return getVautPendantPeriode3D();
			case SchemaPackage.TYPE_UTILISATION_IFF__PORTE_SUR_SERVICE_RESEAU:
				return getPorteSurServiceReseau();
			case SchemaPackage.TYPE_UTILISATION_IFF__EST_ATTRIBUE_AUNITE_UNITE:
				return getEstAttribueAUniteUnite();
			case SchemaPackage.TYPE_UTILISATION_IFF__EST_ATTRIBUE_AU_TYPE_AERONEF_TYPE_AERONEF:
				return getEstAttribueAuTypeAeronefTypeAeronef();
			case SchemaPackage.TYPE_UTILISATION_IFF__EST_ATTRIBUE_AU_TYPE_MISSION_AERIENNE_TYPE_MISSION_AERIENNE:
				return getEstAttribueAuTypeMissionAerienneTypeMissionAerienne();
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
			case SchemaPackage.TYPE_UTILISATION_IFF__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_UTILISATION_IFF__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_UTILISATION_IFF__VAUT_PENDANT_PERIODE3_D:
				setVautPendantPeriode3D((TypePeriode3D)newValue);
				return;
			case SchemaPackage.TYPE_UTILISATION_IFF__PORTE_SUR_SERVICE_RESEAU:
				setPorteSurServiceReseau((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_UTILISATION_IFF__EST_ATTRIBUE_AUNITE_UNITE:
				getEstAttribueAUniteUnite().clear();
				getEstAttribueAUniteUnite().addAll((Collection<? extends TypeAssociationEXT>)newValue);
				return;
			case SchemaPackage.TYPE_UTILISATION_IFF__EST_ATTRIBUE_AU_TYPE_AERONEF_TYPE_AERONEF:
				getEstAttribueAuTypeAeronefTypeAeronef().clear();
				getEstAttribueAuTypeAeronefTypeAeronef().addAll((Collection<? extends TypeAssociationEXT>)newValue);
				return;
			case SchemaPackage.TYPE_UTILISATION_IFF__EST_ATTRIBUE_AU_TYPE_MISSION_AERIENNE_TYPE_MISSION_AERIENNE:
				getEstAttribueAuTypeMissionAerienneTypeMissionAerienne().clear();
				getEstAttribueAuTypeMissionAerienneTypeMissionAerienne().addAll((Collection<? extends TypeTypeMissionAerienne>)newValue);
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
			case SchemaPackage.TYPE_UTILISATION_IFF__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_UTILISATION_IFF__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_UTILISATION_IFF__VAUT_PENDANT_PERIODE3_D:
				setVautPendantPeriode3D((TypePeriode3D)null);
				return;
			case SchemaPackage.TYPE_UTILISATION_IFF__PORTE_SUR_SERVICE_RESEAU:
				setPorteSurServiceReseau((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_UTILISATION_IFF__EST_ATTRIBUE_AUNITE_UNITE:
				getEstAttribueAUniteUnite().clear();
				return;
			case SchemaPackage.TYPE_UTILISATION_IFF__EST_ATTRIBUE_AU_TYPE_AERONEF_TYPE_AERONEF:
				getEstAttribueAuTypeAeronefTypeAeronef().clear();
				return;
			case SchemaPackage.TYPE_UTILISATION_IFF__EST_ATTRIBUE_AU_TYPE_MISSION_AERIENNE_TYPE_MISSION_AERIENNE:
				getEstAttribueAuTypeMissionAerienneTypeMissionAerienne().clear();
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
			case SchemaPackage.TYPE_UTILISATION_IFF__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_UTILISATION_IFF__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_UTILISATION_IFF__VAUT_PENDANT_PERIODE3_D:
				return vautPendantPeriode3D != null;
			case SchemaPackage.TYPE_UTILISATION_IFF__PORTE_SUR_SERVICE_RESEAU:
				return porteSurServiceReseau != null;
			case SchemaPackage.TYPE_UTILISATION_IFF__EST_ATTRIBUE_AUNITE_UNITE:
				return estAttribueAUniteUnite != null && !estAttribueAUniteUnite.isEmpty();
			case SchemaPackage.TYPE_UTILISATION_IFF__EST_ATTRIBUE_AU_TYPE_AERONEF_TYPE_AERONEF:
				return estAttribueAuTypeAeronefTypeAeronef != null && !estAttribueAuTypeAeronefTypeAeronef.isEmpty();
			case SchemaPackage.TYPE_UTILISATION_IFF__EST_ATTRIBUE_AU_TYPE_MISSION_AERIENNE_TYPE_MISSION_AERIENNE:
				return estAttribueAuTypeMissionAerienneTypeMissionAerienne != null && !estAttribueAuTypeMissionAerienneTypeMissionAerienne.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //TypeUtilisationIFFImpl
