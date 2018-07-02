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
import mpia.schema.TypeModule;
import mpia.schema.TypePhaseTrajet;
import mpia.schema.TypeTypeIntervenant3D;

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
 * An implementation of the model object '<em><b>Type Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeModuleImpl#getNombreAeronefs <em>Nombre Aeronefs</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModuleImpl#getEstTypeTypeAeronef <em>Est Type Type Aeronef</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModuleImpl#getEstSpecifieParTypeIntervenant3D <em>Est Specifie Par Type Intervenant3 D</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModuleImpl#getACommeTrajetPhaseTrajet <em>AComme Trajet Phase Trajet</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModuleImpl#getAPourResponsableUnite <em>APour Responsable Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModuleImpl#getAPourVolLeaderVol <em>APour Vol Leader Vol</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeModuleImpl extends TypeEntiteOrganisationnelleImpl implements TypeModule {
	/**
	 * The default value of the '{@link #getNombreAeronefs() <em>Nombre Aeronefs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreAeronefs()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_AERONEFS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreAeronefs() <em>Nombre Aeronefs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreAeronefs()
	 * @generated
	 * @ordered
	 */
	protected long nombreAeronefs = NOMBRE_AERONEFS_EDEFAULT;

	/**
	 * This is true if the Nombre Aeronefs attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreAeronefsESet;

	/**
	 * The cached value of the '{@link #getEstTypeTypeAeronef() <em>Est Type Type Aeronef</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstTypeTypeAeronef()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT estTypeTypeAeronef;

	/**
	 * The cached value of the '{@link #getEstSpecifieParTypeIntervenant3D() <em>Est Specifie Par Type Intervenant3 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSpecifieParTypeIntervenant3D()
	 * @generated
	 * @ordered
	 */
	protected TypeTypeIntervenant3D estSpecifieParTypeIntervenant3D;

	/**
	 * The cached value of the '{@link #getACommeTrajetPhaseTrajet() <em>AComme Trajet Phase Trajet</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeTrajetPhaseTrajet()
	 * @generated
	 * @ordered
	 */
	protected EList<TypePhaseTrajet> aCommeTrajetPhaseTrajet;

	/**
	 * The cached value of the '{@link #getAPourResponsableUnite() <em>APour Responsable Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourResponsableUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aPourResponsableUnite;

	/**
	 * The cached value of the '{@link #getAPourVolLeaderVol() <em>APour Vol Leader Vol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourVolLeaderVol()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourVolLeaderVol;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeModule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreAeronefs() {
		return nombreAeronefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreAeronefs(long newNombreAeronefs) {
		long oldNombreAeronefs = nombreAeronefs;
		nombreAeronefs = newNombreAeronefs;
		boolean oldNombreAeronefsESet = nombreAeronefsESet;
		nombreAeronefsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODULE__NOMBRE_AERONEFS, oldNombreAeronefs, nombreAeronefs, !oldNombreAeronefsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreAeronefs() {
		long oldNombreAeronefs = nombreAeronefs;
		boolean oldNombreAeronefsESet = nombreAeronefsESet;
		nombreAeronefs = NOMBRE_AERONEFS_EDEFAULT;
		nombreAeronefsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MODULE__NOMBRE_AERONEFS, oldNombreAeronefs, NOMBRE_AERONEFS_EDEFAULT, oldNombreAeronefsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreAeronefs() {
		return nombreAeronefsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getEstTypeTypeAeronef() {
		return estTypeTypeAeronef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstTypeTypeAeronef(TypeAssociationEXT newEstTypeTypeAeronef, NotificationChain msgs) {
		TypeAssociationEXT oldEstTypeTypeAeronef = estTypeTypeAeronef;
		estTypeTypeAeronef = newEstTypeTypeAeronef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODULE__EST_TYPE_TYPE_AERONEF, oldEstTypeTypeAeronef, newEstTypeTypeAeronef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstTypeTypeAeronef(TypeAssociationEXT newEstTypeTypeAeronef) {
		if (newEstTypeTypeAeronef != estTypeTypeAeronef) {
			NotificationChain msgs = null;
			if (estTypeTypeAeronef != null)
				msgs = ((InternalEObject)estTypeTypeAeronef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MODULE__EST_TYPE_TYPE_AERONEF, null, msgs);
			if (newEstTypeTypeAeronef != null)
				msgs = ((InternalEObject)newEstTypeTypeAeronef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MODULE__EST_TYPE_TYPE_AERONEF, null, msgs);
			msgs = basicSetEstTypeTypeAeronef(newEstTypeTypeAeronef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODULE__EST_TYPE_TYPE_AERONEF, newEstTypeTypeAeronef, newEstTypeTypeAeronef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeTypeIntervenant3D getEstSpecifieParTypeIntervenant3D() {
		return estSpecifieParTypeIntervenant3D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstSpecifieParTypeIntervenant3D(TypeTypeIntervenant3D newEstSpecifieParTypeIntervenant3D, NotificationChain msgs) {
		TypeTypeIntervenant3D oldEstSpecifieParTypeIntervenant3D = estSpecifieParTypeIntervenant3D;
		estSpecifieParTypeIntervenant3D = newEstSpecifieParTypeIntervenant3D;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODULE__EST_SPECIFIE_PAR_TYPE_INTERVENANT3_D, oldEstSpecifieParTypeIntervenant3D, newEstSpecifieParTypeIntervenant3D);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstSpecifieParTypeIntervenant3D(TypeTypeIntervenant3D newEstSpecifieParTypeIntervenant3D) {
		if (newEstSpecifieParTypeIntervenant3D != estSpecifieParTypeIntervenant3D) {
			NotificationChain msgs = null;
			if (estSpecifieParTypeIntervenant3D != null)
				msgs = ((InternalEObject)estSpecifieParTypeIntervenant3D).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MODULE__EST_SPECIFIE_PAR_TYPE_INTERVENANT3_D, null, msgs);
			if (newEstSpecifieParTypeIntervenant3D != null)
				msgs = ((InternalEObject)newEstSpecifieParTypeIntervenant3D).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MODULE__EST_SPECIFIE_PAR_TYPE_INTERVENANT3_D, null, msgs);
			msgs = basicSetEstSpecifieParTypeIntervenant3D(newEstSpecifieParTypeIntervenant3D, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODULE__EST_SPECIFIE_PAR_TYPE_INTERVENANT3_D, newEstSpecifieParTypeIntervenant3D, newEstSpecifieParTypeIntervenant3D));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypePhaseTrajet> getACommeTrajetPhaseTrajet() {
		if (aCommeTrajetPhaseTrajet == null) {
			aCommeTrajetPhaseTrajet = new EObjectContainmentEList<TypePhaseTrajet>(TypePhaseTrajet.class, this, SchemaPackage.TYPE_MODULE__ACOMME_TRAJET_PHASE_TRAJET);
		}
		return aCommeTrajetPhaseTrajet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAPourResponsableUnite() {
		return aPourResponsableUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourResponsableUnite(TypeAssociationEXT newAPourResponsableUnite, NotificationChain msgs) {
		TypeAssociationEXT oldAPourResponsableUnite = aPourResponsableUnite;
		aPourResponsableUnite = newAPourResponsableUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODULE__APOUR_RESPONSABLE_UNITE, oldAPourResponsableUnite, newAPourResponsableUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourResponsableUnite(TypeAssociationEXT newAPourResponsableUnite) {
		if (newAPourResponsableUnite != aPourResponsableUnite) {
			NotificationChain msgs = null;
			if (aPourResponsableUnite != null)
				msgs = ((InternalEObject)aPourResponsableUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MODULE__APOUR_RESPONSABLE_UNITE, null, msgs);
			if (newAPourResponsableUnite != null)
				msgs = ((InternalEObject)newAPourResponsableUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MODULE__APOUR_RESPONSABLE_UNITE, null, msgs);
			msgs = basicSetAPourResponsableUnite(newAPourResponsableUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODULE__APOUR_RESPONSABLE_UNITE, newAPourResponsableUnite, newAPourResponsableUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourVolLeaderVol() {
		return aPourVolLeaderVol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourVolLeaderVol(TypeAssociation newAPourVolLeaderVol, NotificationChain msgs) {
		TypeAssociation oldAPourVolLeaderVol = aPourVolLeaderVol;
		aPourVolLeaderVol = newAPourVolLeaderVol;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODULE__APOUR_VOL_LEADER_VOL, oldAPourVolLeaderVol, newAPourVolLeaderVol);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourVolLeaderVol(TypeAssociation newAPourVolLeaderVol) {
		if (newAPourVolLeaderVol != aPourVolLeaderVol) {
			NotificationChain msgs = null;
			if (aPourVolLeaderVol != null)
				msgs = ((InternalEObject)aPourVolLeaderVol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MODULE__APOUR_VOL_LEADER_VOL, null, msgs);
			if (newAPourVolLeaderVol != null)
				msgs = ((InternalEObject)newAPourVolLeaderVol).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MODULE__APOUR_VOL_LEADER_VOL, null, msgs);
			msgs = basicSetAPourVolLeaderVol(newAPourVolLeaderVol, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODULE__APOUR_VOL_LEADER_VOL, newAPourVolLeaderVol, newAPourVolLeaderVol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MODULE__EST_TYPE_TYPE_AERONEF:
				return basicSetEstTypeTypeAeronef(null, msgs);
			case SchemaPackage.TYPE_MODULE__EST_SPECIFIE_PAR_TYPE_INTERVENANT3_D:
				return basicSetEstSpecifieParTypeIntervenant3D(null, msgs);
			case SchemaPackage.TYPE_MODULE__ACOMME_TRAJET_PHASE_TRAJET:
				return ((InternalEList<?>)getACommeTrajetPhaseTrajet()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MODULE__APOUR_RESPONSABLE_UNITE:
				return basicSetAPourResponsableUnite(null, msgs);
			case SchemaPackage.TYPE_MODULE__APOUR_VOL_LEADER_VOL:
				return basicSetAPourVolLeaderVol(null, msgs);
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
			case SchemaPackage.TYPE_MODULE__NOMBRE_AERONEFS:
				return new Long(getNombreAeronefs());
			case SchemaPackage.TYPE_MODULE__EST_TYPE_TYPE_AERONEF:
				return getEstTypeTypeAeronef();
			case SchemaPackage.TYPE_MODULE__EST_SPECIFIE_PAR_TYPE_INTERVENANT3_D:
				return getEstSpecifieParTypeIntervenant3D();
			case SchemaPackage.TYPE_MODULE__ACOMME_TRAJET_PHASE_TRAJET:
				return getACommeTrajetPhaseTrajet();
			case SchemaPackage.TYPE_MODULE__APOUR_RESPONSABLE_UNITE:
				return getAPourResponsableUnite();
			case SchemaPackage.TYPE_MODULE__APOUR_VOL_LEADER_VOL:
				return getAPourVolLeaderVol();
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
			case SchemaPackage.TYPE_MODULE__NOMBRE_AERONEFS:
				setNombreAeronefs(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_MODULE__EST_TYPE_TYPE_AERONEF:
				setEstTypeTypeAeronef((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_MODULE__EST_SPECIFIE_PAR_TYPE_INTERVENANT3_D:
				setEstSpecifieParTypeIntervenant3D((TypeTypeIntervenant3D)newValue);
				return;
			case SchemaPackage.TYPE_MODULE__ACOMME_TRAJET_PHASE_TRAJET:
				getACommeTrajetPhaseTrajet().clear();
				getACommeTrajetPhaseTrajet().addAll((Collection<? extends TypePhaseTrajet>)newValue);
				return;
			case SchemaPackage.TYPE_MODULE__APOUR_RESPONSABLE_UNITE:
				setAPourResponsableUnite((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_MODULE__APOUR_VOL_LEADER_VOL:
				setAPourVolLeaderVol((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_MODULE__NOMBRE_AERONEFS:
				unsetNombreAeronefs();
				return;
			case SchemaPackage.TYPE_MODULE__EST_TYPE_TYPE_AERONEF:
				setEstTypeTypeAeronef((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_MODULE__EST_SPECIFIE_PAR_TYPE_INTERVENANT3_D:
				setEstSpecifieParTypeIntervenant3D((TypeTypeIntervenant3D)null);
				return;
			case SchemaPackage.TYPE_MODULE__ACOMME_TRAJET_PHASE_TRAJET:
				getACommeTrajetPhaseTrajet().clear();
				return;
			case SchemaPackage.TYPE_MODULE__APOUR_RESPONSABLE_UNITE:
				setAPourResponsableUnite((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_MODULE__APOUR_VOL_LEADER_VOL:
				setAPourVolLeaderVol((TypeAssociation)null);
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
			case SchemaPackage.TYPE_MODULE__NOMBRE_AERONEFS:
				return isSetNombreAeronefs();
			case SchemaPackage.TYPE_MODULE__EST_TYPE_TYPE_AERONEF:
				return estTypeTypeAeronef != null;
			case SchemaPackage.TYPE_MODULE__EST_SPECIFIE_PAR_TYPE_INTERVENANT3_D:
				return estSpecifieParTypeIntervenant3D != null;
			case SchemaPackage.TYPE_MODULE__ACOMME_TRAJET_PHASE_TRAJET:
				return aCommeTrajetPhaseTrajet != null && !aCommeTrajetPhaseTrajet.isEmpty();
			case SchemaPackage.TYPE_MODULE__APOUR_RESPONSABLE_UNITE:
				return aPourResponsableUnite != null;
			case SchemaPackage.TYPE_MODULE__APOUR_VOL_LEADER_VOL:
				return aPourVolLeaderVol != null;
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
		result.append(" (nombreAeronefs: ");
		if (nombreAeronefsESet) result.append(nombreAeronefs); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeModuleImpl
