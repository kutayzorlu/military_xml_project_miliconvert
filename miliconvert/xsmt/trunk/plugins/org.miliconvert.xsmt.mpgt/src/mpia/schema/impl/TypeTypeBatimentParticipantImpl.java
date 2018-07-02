/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeTypeBatimentParticipant;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Type Batiment Participant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeTypeBatimentParticipantImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeBatimentParticipantImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeBatimentParticipantImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeBatimentParticipantImpl#getEstTypeTypeBatiment <em>Est Type Type Batiment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeTypeBatimentParticipantImpl extends EObjectImpl implements TypeTypeBatimentParticipant {
	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected long nombre = NOMBRE_EDEFAULT;

	/**
	 * This is true if the Nombre attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreESet;

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
	 * The cached value of the '{@link #getEstTypeTypeBatiment() <em>Est Type Type Batiment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstTypeTypeBatiment()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT estTypeTypeBatiment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeTypeBatimentParticipantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeTypeBatimentParticipant();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(long newNombre) {
		long oldNombre = nombre;
		nombre = newNombre;
		boolean oldNombreESet = nombreESet;
		nombreESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_BATIMENT_PARTICIPANT__NOMBRE, oldNombre, nombre, !oldNombreESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombre() {
		long oldNombre = nombre;
		boolean oldNombreESet = nombreESet;
		nombre = NOMBRE_EDEFAULT;
		nombreESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_BATIMENT_PARTICIPANT__NOMBRE, oldNombre, NOMBRE_EDEFAULT, oldNombreESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombre() {
		return nombreESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_BATIMENT_PARTICIPANT__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_BATIMENT_PARTICIPANT__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getEstTypeTypeBatiment() {
		return estTypeTypeBatiment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstTypeTypeBatiment(TypeAssociationEXT newEstTypeTypeBatiment, NotificationChain msgs) {
		TypeAssociationEXT oldEstTypeTypeBatiment = estTypeTypeBatiment;
		estTypeTypeBatiment = newEstTypeTypeBatiment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_BATIMENT_PARTICIPANT__EST_TYPE_TYPE_BATIMENT, oldEstTypeTypeBatiment, newEstTypeTypeBatiment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstTypeTypeBatiment(TypeAssociationEXT newEstTypeTypeBatiment) {
		if (newEstTypeTypeBatiment != estTypeTypeBatiment) {
			NotificationChain msgs = null;
			if (estTypeTypeBatiment != null)
				msgs = ((InternalEObject)estTypeTypeBatiment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_BATIMENT_PARTICIPANT__EST_TYPE_TYPE_BATIMENT, null, msgs);
			if (newEstTypeTypeBatiment != null)
				msgs = ((InternalEObject)newEstTypeTypeBatiment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_BATIMENT_PARTICIPANT__EST_TYPE_TYPE_BATIMENT, null, msgs);
			msgs = basicSetEstTypeTypeBatiment(newEstTypeTypeBatiment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_BATIMENT_PARTICIPANT__EST_TYPE_TYPE_BATIMENT, newEstTypeTypeBatiment, newEstTypeTypeBatiment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_TYPE_BATIMENT_PARTICIPANT__EST_TYPE_TYPE_BATIMENT:
				return basicSetEstTypeTypeBatiment(null, msgs);
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
			case SchemaPackage.TYPE_TYPE_BATIMENT_PARTICIPANT__NOMBRE:
				return new Long(getNombre());
			case SchemaPackage.TYPE_TYPE_BATIMENT_PARTICIPANT__CTE:
				return getCTE();
			case SchemaPackage.TYPE_TYPE_BATIMENT_PARTICIPANT__CE:
				return getCE();
			case SchemaPackage.TYPE_TYPE_BATIMENT_PARTICIPANT__EST_TYPE_TYPE_BATIMENT:
				return getEstTypeTypeBatiment();
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
			case SchemaPackage.TYPE_TYPE_BATIMENT_PARTICIPANT__NOMBRE:
				setNombre(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_TYPE_BATIMENT_PARTICIPANT__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_BATIMENT_PARTICIPANT__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_BATIMENT_PARTICIPANT__EST_TYPE_TYPE_BATIMENT:
				setEstTypeTypeBatiment((TypeAssociationEXT)newValue);
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
			case SchemaPackage.TYPE_TYPE_BATIMENT_PARTICIPANT__NOMBRE:
				unsetNombre();
				return;
			case SchemaPackage.TYPE_TYPE_BATIMENT_PARTICIPANT__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TYPE_BATIMENT_PARTICIPANT__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TYPE_BATIMENT_PARTICIPANT__EST_TYPE_TYPE_BATIMENT:
				setEstTypeTypeBatiment((TypeAssociationEXT)null);
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
			case SchemaPackage.TYPE_TYPE_BATIMENT_PARTICIPANT__NOMBRE:
				return isSetNombre();
			case SchemaPackage.TYPE_TYPE_BATIMENT_PARTICIPANT__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_TYPE_BATIMENT_PARTICIPANT__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_TYPE_BATIMENT_PARTICIPANT__EST_TYPE_TYPE_BATIMENT:
				return estTypeTypeBatiment != null;
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
		result.append(" (nombre: ");
		if (nombreESet) result.append(nombre); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeTypeBatimentParticipantImpl
