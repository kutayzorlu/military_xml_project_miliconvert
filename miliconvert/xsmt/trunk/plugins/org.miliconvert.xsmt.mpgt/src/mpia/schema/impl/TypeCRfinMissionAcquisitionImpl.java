/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCRfinMissionAcquisition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type CRfin Mission Acquisition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeCRfinMissionAcquisitionImpl#getNombreCRenvoyes <em>Nombre CRenvoyes</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCRfinMissionAcquisitionImpl#getNombreDemandesTir <em>Nombre Demandes Tir</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCRfinMissionAcquisitionImpl#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCRfinMissionAcquisitionImpl#getAPourObjectifObjectifCiblage <em>APour Objectif Objectif Ciblage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeCRfinMissionAcquisitionImpl extends EObjectImpl implements TypeCRfinMissionAcquisition {
	/**
	 * The default value of the '{@link #getNombreCRenvoyes() <em>Nombre CRenvoyes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreCRenvoyes()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_CRENVOYES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreCRenvoyes() <em>Nombre CRenvoyes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreCRenvoyes()
	 * @generated
	 * @ordered
	 */
	protected long nombreCRenvoyes = NOMBRE_CRENVOYES_EDEFAULT;

	/**
	 * This is true if the Nombre CRenvoyes attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreCRenvoyesESet;

	/**
	 * The default value of the '{@link #getNombreDemandesTir() <em>Nombre Demandes Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreDemandesTir()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_DEMANDES_TIR_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreDemandesTir() <em>Nombre Demandes Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreDemandesTir()
	 * @generated
	 * @ordered
	 */
	protected long nombreDemandesTir = NOMBRE_DEMANDES_TIR_EDEFAULT;

	/**
	 * This is true if the Nombre Demandes Tir attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreDemandesTirESet;

	/**
	 * The default value of the '{@link #getCommentaire() <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaire()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTAIRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommentaire() <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaire()
	 * @generated
	 * @ordered
	 */
	protected String commentaire = COMMENTAIRE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAPourObjectifObjectifCiblage() <em>APour Objectif Objectif Ciblage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourObjectifObjectifCiblage()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourObjectifObjectifCiblage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeCRfinMissionAcquisitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeCRfinMissionAcquisition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreCRenvoyes() {
		return nombreCRenvoyes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreCRenvoyes(long newNombreCRenvoyes) {
		long oldNombreCRenvoyes = nombreCRenvoyes;
		nombreCRenvoyes = newNombreCRenvoyes;
		boolean oldNombreCRenvoyesESet = nombreCRenvoyesESet;
		nombreCRenvoyesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CRFIN_MISSION_ACQUISITION__NOMBRE_CRENVOYES, oldNombreCRenvoyes, nombreCRenvoyes, !oldNombreCRenvoyesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreCRenvoyes() {
		long oldNombreCRenvoyes = nombreCRenvoyes;
		boolean oldNombreCRenvoyesESet = nombreCRenvoyesESet;
		nombreCRenvoyes = NOMBRE_CRENVOYES_EDEFAULT;
		nombreCRenvoyesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CRFIN_MISSION_ACQUISITION__NOMBRE_CRENVOYES, oldNombreCRenvoyes, NOMBRE_CRENVOYES_EDEFAULT, oldNombreCRenvoyesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreCRenvoyes() {
		return nombreCRenvoyesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreDemandesTir() {
		return nombreDemandesTir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreDemandesTir(long newNombreDemandesTir) {
		long oldNombreDemandesTir = nombreDemandesTir;
		nombreDemandesTir = newNombreDemandesTir;
		boolean oldNombreDemandesTirESet = nombreDemandesTirESet;
		nombreDemandesTirESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CRFIN_MISSION_ACQUISITION__NOMBRE_DEMANDES_TIR, oldNombreDemandesTir, nombreDemandesTir, !oldNombreDemandesTirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreDemandesTir() {
		long oldNombreDemandesTir = nombreDemandesTir;
		boolean oldNombreDemandesTirESet = nombreDemandesTirESet;
		nombreDemandesTir = NOMBRE_DEMANDES_TIR_EDEFAULT;
		nombreDemandesTirESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CRFIN_MISSION_ACQUISITION__NOMBRE_DEMANDES_TIR, oldNombreDemandesTir, NOMBRE_DEMANDES_TIR_EDEFAULT, oldNombreDemandesTirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreDemandesTir() {
		return nombreDemandesTirESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommentaire() {
		return commentaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommentaire(String newCommentaire) {
		String oldCommentaire = commentaire;
		commentaire = newCommentaire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CRFIN_MISSION_ACQUISITION__COMMENTAIRE, oldCommentaire, commentaire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourObjectifObjectifCiblage() {
		return aPourObjectifObjectifCiblage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourObjectifObjectifCiblage(TypeAssociation newAPourObjectifObjectifCiblage, NotificationChain msgs) {
		TypeAssociation oldAPourObjectifObjectifCiblage = aPourObjectifObjectifCiblage;
		aPourObjectifObjectifCiblage = newAPourObjectifObjectifCiblage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CRFIN_MISSION_ACQUISITION__APOUR_OBJECTIF_OBJECTIF_CIBLAGE, oldAPourObjectifObjectifCiblage, newAPourObjectifObjectifCiblage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourObjectifObjectifCiblage(TypeAssociation newAPourObjectifObjectifCiblage) {
		if (newAPourObjectifObjectifCiblage != aPourObjectifObjectifCiblage) {
			NotificationChain msgs = null;
			if (aPourObjectifObjectifCiblage != null)
				msgs = ((InternalEObject)aPourObjectifObjectifCiblage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CRFIN_MISSION_ACQUISITION__APOUR_OBJECTIF_OBJECTIF_CIBLAGE, null, msgs);
			if (newAPourObjectifObjectifCiblage != null)
				msgs = ((InternalEObject)newAPourObjectifObjectifCiblage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CRFIN_MISSION_ACQUISITION__APOUR_OBJECTIF_OBJECTIF_CIBLAGE, null, msgs);
			msgs = basicSetAPourObjectifObjectifCiblage(newAPourObjectifObjectifCiblage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CRFIN_MISSION_ACQUISITION__APOUR_OBJECTIF_OBJECTIF_CIBLAGE, newAPourObjectifObjectifCiblage, newAPourObjectifObjectifCiblage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_CRFIN_MISSION_ACQUISITION__APOUR_OBJECTIF_OBJECTIF_CIBLAGE:
				return basicSetAPourObjectifObjectifCiblage(null, msgs);
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
			case SchemaPackage.TYPE_CRFIN_MISSION_ACQUISITION__NOMBRE_CRENVOYES:
				return new Long(getNombreCRenvoyes());
			case SchemaPackage.TYPE_CRFIN_MISSION_ACQUISITION__NOMBRE_DEMANDES_TIR:
				return new Long(getNombreDemandesTir());
			case SchemaPackage.TYPE_CRFIN_MISSION_ACQUISITION__COMMENTAIRE:
				return getCommentaire();
			case SchemaPackage.TYPE_CRFIN_MISSION_ACQUISITION__APOUR_OBJECTIF_OBJECTIF_CIBLAGE:
				return getAPourObjectifObjectifCiblage();
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
			case SchemaPackage.TYPE_CRFIN_MISSION_ACQUISITION__NOMBRE_CRENVOYES:
				setNombreCRenvoyes(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_CRFIN_MISSION_ACQUISITION__NOMBRE_DEMANDES_TIR:
				setNombreDemandesTir(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_CRFIN_MISSION_ACQUISITION__COMMENTAIRE:
				setCommentaire((String)newValue);
				return;
			case SchemaPackage.TYPE_CRFIN_MISSION_ACQUISITION__APOUR_OBJECTIF_OBJECTIF_CIBLAGE:
				setAPourObjectifObjectifCiblage((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_CRFIN_MISSION_ACQUISITION__NOMBRE_CRENVOYES:
				unsetNombreCRenvoyes();
				return;
			case SchemaPackage.TYPE_CRFIN_MISSION_ACQUISITION__NOMBRE_DEMANDES_TIR:
				unsetNombreDemandesTir();
				return;
			case SchemaPackage.TYPE_CRFIN_MISSION_ACQUISITION__COMMENTAIRE:
				setCommentaire(COMMENTAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CRFIN_MISSION_ACQUISITION__APOUR_OBJECTIF_OBJECTIF_CIBLAGE:
				setAPourObjectifObjectifCiblage((TypeAssociation)null);
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
			case SchemaPackage.TYPE_CRFIN_MISSION_ACQUISITION__NOMBRE_CRENVOYES:
				return isSetNombreCRenvoyes();
			case SchemaPackage.TYPE_CRFIN_MISSION_ACQUISITION__NOMBRE_DEMANDES_TIR:
				return isSetNombreDemandesTir();
			case SchemaPackage.TYPE_CRFIN_MISSION_ACQUISITION__COMMENTAIRE:
				return COMMENTAIRE_EDEFAULT == null ? commentaire != null : !COMMENTAIRE_EDEFAULT.equals(commentaire);
			case SchemaPackage.TYPE_CRFIN_MISSION_ACQUISITION__APOUR_OBJECTIF_OBJECTIF_CIBLAGE:
				return aPourObjectifObjectifCiblage != null;
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
		result.append(" (nombreCRenvoyes: ");
		if (nombreCRenvoyesESet) result.append(nombreCRenvoyes); else result.append("<unset>");
		result.append(", nombreDemandesTir: ");
		if (nombreDemandesTirESet) result.append(nombreDemandesTir); else result.append("<unset>");
		result.append(", commentaire: ");
		result.append(commentaire);
		result.append(')');
		return result.toString();
	}

} //TypeCRfinMissionAcquisitionImpl
