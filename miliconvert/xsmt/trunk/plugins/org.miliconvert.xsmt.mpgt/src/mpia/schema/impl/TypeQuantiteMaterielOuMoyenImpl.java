/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoMobiliteAttitude;
import mpia.schema.TypeQuantiteMaterielOuMoyen;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Quantite Materiel Ou Moyen</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeQuantiteMaterielOuMoyenImpl#getQuantite <em>Quantite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeQuantiteMaterielOuMoyenImpl#getAttitude <em>Attitude</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeQuantiteMaterielOuMoyenImpl#getDesignationMoyen <em>Designation Moyen</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeQuantiteMaterielOuMoyenImpl#getConcerneTypeMateriel <em>Concerne Type Materiel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeQuantiteMaterielOuMoyenImpl extends EObjectImpl implements TypeQuantiteMaterielOuMoyen {
	/**
	 * The default value of the '{@link #getQuantite() <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantite()
	 * @generated
	 * @ordered
	 */
	protected static final long QUANTITE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getQuantite() <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantite()
	 * @generated
	 * @ordered
	 */
	protected long quantite = QUANTITE_EDEFAULT;

	/**
	 * This is true if the Quantite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean quantiteESet;

	/**
	 * The default value of the '{@link #getAttitude() <em>Attitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttitude()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoMobiliteAttitude ATTITUDE_EDEFAULT = TypeDictionaryDicoMobiliteAttitude.MVG;

	/**
	 * The cached value of the '{@link #getAttitude() <em>Attitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttitude()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoMobiliteAttitude attitude = ATTITUDE_EDEFAULT;

	/**
	 * This is true if the Attitude attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean attitudeESet;

	/**
	 * The default value of the '{@link #getDesignationMoyen() <em>Designation Moyen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignationMoyen()
	 * @generated
	 * @ordered
	 */
	protected static final String DESIGNATION_MOYEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDesignationMoyen() <em>Designation Moyen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignationMoyen()
	 * @generated
	 * @ordered
	 */
	protected String designationMoyen = DESIGNATION_MOYEN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConcerneTypeMateriel() <em>Concerne Type Materiel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneTypeMateriel()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT concerneTypeMateriel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeQuantiteMaterielOuMoyenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeQuantiteMaterielOuMoyen();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getQuantite() {
		return quantite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantite(long newQuantite) {
		long oldQuantite = quantite;
		quantite = newQuantite;
		boolean oldQuantiteESet = quantiteESet;
		quantiteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_QUANTITE_MATERIEL_OU_MOYEN__QUANTITE, oldQuantite, quantite, !oldQuantiteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQuantite() {
		long oldQuantite = quantite;
		boolean oldQuantiteESet = quantiteESet;
		quantite = QUANTITE_EDEFAULT;
		quantiteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_QUANTITE_MATERIEL_OU_MOYEN__QUANTITE, oldQuantite, QUANTITE_EDEFAULT, oldQuantiteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQuantite() {
		return quantiteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoMobiliteAttitude getAttitude() {
		return attitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttitude(TypeDictionaryDicoMobiliteAttitude newAttitude) {
		TypeDictionaryDicoMobiliteAttitude oldAttitude = attitude;
		attitude = newAttitude == null ? ATTITUDE_EDEFAULT : newAttitude;
		boolean oldAttitudeESet = attitudeESet;
		attitudeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_QUANTITE_MATERIEL_OU_MOYEN__ATTITUDE, oldAttitude, attitude, !oldAttitudeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAttitude() {
		TypeDictionaryDicoMobiliteAttitude oldAttitude = attitude;
		boolean oldAttitudeESet = attitudeESet;
		attitude = ATTITUDE_EDEFAULT;
		attitudeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_QUANTITE_MATERIEL_OU_MOYEN__ATTITUDE, oldAttitude, ATTITUDE_EDEFAULT, oldAttitudeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAttitude() {
		return attitudeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDesignationMoyen() {
		return designationMoyen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesignationMoyen(String newDesignationMoyen) {
		String oldDesignationMoyen = designationMoyen;
		designationMoyen = newDesignationMoyen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_QUANTITE_MATERIEL_OU_MOYEN__DESIGNATION_MOYEN, oldDesignationMoyen, designationMoyen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getConcerneTypeMateriel() {
		return concerneTypeMateriel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcerneTypeMateriel(TypeAssociationEXT newConcerneTypeMateriel, NotificationChain msgs) {
		TypeAssociationEXT oldConcerneTypeMateriel = concerneTypeMateriel;
		concerneTypeMateriel = newConcerneTypeMateriel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_QUANTITE_MATERIEL_OU_MOYEN__CONCERNE_TYPE_MATERIEL, oldConcerneTypeMateriel, newConcerneTypeMateriel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcerneTypeMateriel(TypeAssociationEXT newConcerneTypeMateriel) {
		if (newConcerneTypeMateriel != concerneTypeMateriel) {
			NotificationChain msgs = null;
			if (concerneTypeMateriel != null)
				msgs = ((InternalEObject)concerneTypeMateriel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_QUANTITE_MATERIEL_OU_MOYEN__CONCERNE_TYPE_MATERIEL, null, msgs);
			if (newConcerneTypeMateriel != null)
				msgs = ((InternalEObject)newConcerneTypeMateriel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_QUANTITE_MATERIEL_OU_MOYEN__CONCERNE_TYPE_MATERIEL, null, msgs);
			msgs = basicSetConcerneTypeMateriel(newConcerneTypeMateriel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_QUANTITE_MATERIEL_OU_MOYEN__CONCERNE_TYPE_MATERIEL, newConcerneTypeMateriel, newConcerneTypeMateriel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_QUANTITE_MATERIEL_OU_MOYEN__CONCERNE_TYPE_MATERIEL:
				return basicSetConcerneTypeMateriel(null, msgs);
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
			case SchemaPackage.TYPE_QUANTITE_MATERIEL_OU_MOYEN__QUANTITE:
				return new Long(getQuantite());
			case SchemaPackage.TYPE_QUANTITE_MATERIEL_OU_MOYEN__ATTITUDE:
				return getAttitude();
			case SchemaPackage.TYPE_QUANTITE_MATERIEL_OU_MOYEN__DESIGNATION_MOYEN:
				return getDesignationMoyen();
			case SchemaPackage.TYPE_QUANTITE_MATERIEL_OU_MOYEN__CONCERNE_TYPE_MATERIEL:
				return getConcerneTypeMateriel();
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
			case SchemaPackage.TYPE_QUANTITE_MATERIEL_OU_MOYEN__QUANTITE:
				setQuantite(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_QUANTITE_MATERIEL_OU_MOYEN__ATTITUDE:
				setAttitude((TypeDictionaryDicoMobiliteAttitude)newValue);
				return;
			case SchemaPackage.TYPE_QUANTITE_MATERIEL_OU_MOYEN__DESIGNATION_MOYEN:
				setDesignationMoyen((String)newValue);
				return;
			case SchemaPackage.TYPE_QUANTITE_MATERIEL_OU_MOYEN__CONCERNE_TYPE_MATERIEL:
				setConcerneTypeMateriel((TypeAssociationEXT)newValue);
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
			case SchemaPackage.TYPE_QUANTITE_MATERIEL_OU_MOYEN__QUANTITE:
				unsetQuantite();
				return;
			case SchemaPackage.TYPE_QUANTITE_MATERIEL_OU_MOYEN__ATTITUDE:
				unsetAttitude();
				return;
			case SchemaPackage.TYPE_QUANTITE_MATERIEL_OU_MOYEN__DESIGNATION_MOYEN:
				setDesignationMoyen(DESIGNATION_MOYEN_EDEFAULT);
				return;
			case SchemaPackage.TYPE_QUANTITE_MATERIEL_OU_MOYEN__CONCERNE_TYPE_MATERIEL:
				setConcerneTypeMateriel((TypeAssociationEXT)null);
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
			case SchemaPackage.TYPE_QUANTITE_MATERIEL_OU_MOYEN__QUANTITE:
				return isSetQuantite();
			case SchemaPackage.TYPE_QUANTITE_MATERIEL_OU_MOYEN__ATTITUDE:
				return isSetAttitude();
			case SchemaPackage.TYPE_QUANTITE_MATERIEL_OU_MOYEN__DESIGNATION_MOYEN:
				return DESIGNATION_MOYEN_EDEFAULT == null ? designationMoyen != null : !DESIGNATION_MOYEN_EDEFAULT.equals(designationMoyen);
			case SchemaPackage.TYPE_QUANTITE_MATERIEL_OU_MOYEN__CONCERNE_TYPE_MATERIEL:
				return concerneTypeMateriel != null;
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
		result.append(" (quantite: ");
		if (quantiteESet) result.append(quantite); else result.append("<unset>");
		result.append(", attitude: ");
		if (attitudeESet) result.append(attitude); else result.append("<unset>");
		result.append(", designationMoyen: ");
		result.append(designationMoyen);
		result.append(')');
		return result.toString();
	}

} //TypeQuantiteMaterielOuMoyenImpl
