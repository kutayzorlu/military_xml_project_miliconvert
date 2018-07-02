/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeArmementMissionAppuiAerien;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Armement Mission Appui Aerien</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeArmementMissionAppuiAerienImpl#getNombreMunitions <em>Nombre Munitions</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeArmementMissionAppuiAerienImpl#getCodeSCL <em>Code SCL</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeArmementMissionAppuiAerienImpl#getTypeFusee <em>Type Fusee</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeArmementMissionAppuiAerienImpl#getDescriptionTypeMunitions <em>Description Type Munitions</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeArmementMissionAppuiAerienImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeArmementMissionAppuiAerienImpl#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeArmementMissionAppuiAerienImpl extends EObjectImpl implements TypeArmementMissionAppuiAerien {
	/**
	 * The default value of the '{@link #getNombreMunitions() <em>Nombre Munitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreMunitions()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_MUNITIONS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreMunitions() <em>Nombre Munitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreMunitions()
	 * @generated
	 * @ordered
	 */
	protected long nombreMunitions = NOMBRE_MUNITIONS_EDEFAULT;

	/**
	 * This is true if the Nombre Munitions attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreMunitionsESet;

	/**
	 * The default value of the '{@link #getCodeSCL() <em>Code SCL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeSCL()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_SCL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeSCL() <em>Code SCL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeSCL()
	 * @generated
	 * @ordered
	 */
	protected String codeSCL = CODE_SCL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeFusee() <em>Type Fusee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeFusee()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_FUSEE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeFusee() <em>Type Fusee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeFusee()
	 * @generated
	 * @ordered
	 */
	protected String typeFusee = TYPE_FUSEE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescriptionTypeMunitions() <em>Description Type Munitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionTypeMunitions()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_TYPE_MUNITIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescriptionTypeMunitions() <em>Description Type Munitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionTypeMunitions()
	 * @generated
	 * @ordered
	 */
	protected String descriptionTypeMunitions = DESCRIPTION_TYPE_MUNITIONS_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeArmementMissionAppuiAerienImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeArmementMissionAppuiAerien();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreMunitions() {
		return nombreMunitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreMunitions(long newNombreMunitions) {
		long oldNombreMunitions = nombreMunitions;
		nombreMunitions = newNombreMunitions;
		boolean oldNombreMunitionsESet = nombreMunitionsESet;
		nombreMunitionsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ARMEMENT_MISSION_APPUI_AERIEN__NOMBRE_MUNITIONS, oldNombreMunitions, nombreMunitions, !oldNombreMunitionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreMunitions() {
		long oldNombreMunitions = nombreMunitions;
		boolean oldNombreMunitionsESet = nombreMunitionsESet;
		nombreMunitions = NOMBRE_MUNITIONS_EDEFAULT;
		nombreMunitionsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ARMEMENT_MISSION_APPUI_AERIEN__NOMBRE_MUNITIONS, oldNombreMunitions, NOMBRE_MUNITIONS_EDEFAULT, oldNombreMunitionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreMunitions() {
		return nombreMunitionsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodeSCL() {
		return codeSCL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeSCL(String newCodeSCL) {
		String oldCodeSCL = codeSCL;
		codeSCL = newCodeSCL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ARMEMENT_MISSION_APPUI_AERIEN__CODE_SCL, oldCodeSCL, codeSCL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeFusee() {
		return typeFusee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeFusee(String newTypeFusee) {
		String oldTypeFusee = typeFusee;
		typeFusee = newTypeFusee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ARMEMENT_MISSION_APPUI_AERIEN__TYPE_FUSEE, oldTypeFusee, typeFusee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescriptionTypeMunitions() {
		return descriptionTypeMunitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptionTypeMunitions(String newDescriptionTypeMunitions) {
		String oldDescriptionTypeMunitions = descriptionTypeMunitions;
		descriptionTypeMunitions = newDescriptionTypeMunitions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ARMEMENT_MISSION_APPUI_AERIEN__DESCRIPTION_TYPE_MUNITIONS, oldDescriptionTypeMunitions, descriptionTypeMunitions));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ARMEMENT_MISSION_APPUI_AERIEN__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ARMEMENT_MISSION_APPUI_AERIEN__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_ARMEMENT_MISSION_APPUI_AERIEN__NOMBRE_MUNITIONS:
				return new Long(getNombreMunitions());
			case SchemaPackage.TYPE_ARMEMENT_MISSION_APPUI_AERIEN__CODE_SCL:
				return getCodeSCL();
			case SchemaPackage.TYPE_ARMEMENT_MISSION_APPUI_AERIEN__TYPE_FUSEE:
				return getTypeFusee();
			case SchemaPackage.TYPE_ARMEMENT_MISSION_APPUI_AERIEN__DESCRIPTION_TYPE_MUNITIONS:
				return getDescriptionTypeMunitions();
			case SchemaPackage.TYPE_ARMEMENT_MISSION_APPUI_AERIEN__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ARMEMENT_MISSION_APPUI_AERIEN__CE:
				return getCE();
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
			case SchemaPackage.TYPE_ARMEMENT_MISSION_APPUI_AERIEN__NOMBRE_MUNITIONS:
				setNombreMunitions(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_ARMEMENT_MISSION_APPUI_AERIEN__CODE_SCL:
				setCodeSCL((String)newValue);
				return;
			case SchemaPackage.TYPE_ARMEMENT_MISSION_APPUI_AERIEN__TYPE_FUSEE:
				setTypeFusee((String)newValue);
				return;
			case SchemaPackage.TYPE_ARMEMENT_MISSION_APPUI_AERIEN__DESCRIPTION_TYPE_MUNITIONS:
				setDescriptionTypeMunitions((String)newValue);
				return;
			case SchemaPackage.TYPE_ARMEMENT_MISSION_APPUI_AERIEN__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ARMEMENT_MISSION_APPUI_AERIEN__CE:
				setCE((String)newValue);
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
			case SchemaPackage.TYPE_ARMEMENT_MISSION_APPUI_AERIEN__NOMBRE_MUNITIONS:
				unsetNombreMunitions();
				return;
			case SchemaPackage.TYPE_ARMEMENT_MISSION_APPUI_AERIEN__CODE_SCL:
				setCodeSCL(CODE_SCL_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ARMEMENT_MISSION_APPUI_AERIEN__TYPE_FUSEE:
				setTypeFusee(TYPE_FUSEE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ARMEMENT_MISSION_APPUI_AERIEN__DESCRIPTION_TYPE_MUNITIONS:
				setDescriptionTypeMunitions(DESCRIPTION_TYPE_MUNITIONS_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ARMEMENT_MISSION_APPUI_AERIEN__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ARMEMENT_MISSION_APPUI_AERIEN__CE:
				setCE(CE_EDEFAULT);
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
			case SchemaPackage.TYPE_ARMEMENT_MISSION_APPUI_AERIEN__NOMBRE_MUNITIONS:
				return isSetNombreMunitions();
			case SchemaPackage.TYPE_ARMEMENT_MISSION_APPUI_AERIEN__CODE_SCL:
				return CODE_SCL_EDEFAULT == null ? codeSCL != null : !CODE_SCL_EDEFAULT.equals(codeSCL);
			case SchemaPackage.TYPE_ARMEMENT_MISSION_APPUI_AERIEN__TYPE_FUSEE:
				return TYPE_FUSEE_EDEFAULT == null ? typeFusee != null : !TYPE_FUSEE_EDEFAULT.equals(typeFusee);
			case SchemaPackage.TYPE_ARMEMENT_MISSION_APPUI_AERIEN__DESCRIPTION_TYPE_MUNITIONS:
				return DESCRIPTION_TYPE_MUNITIONS_EDEFAULT == null ? descriptionTypeMunitions != null : !DESCRIPTION_TYPE_MUNITIONS_EDEFAULT.equals(descriptionTypeMunitions);
			case SchemaPackage.TYPE_ARMEMENT_MISSION_APPUI_AERIEN__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ARMEMENT_MISSION_APPUI_AERIEN__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
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
		result.append(" (nombreMunitions: ");
		if (nombreMunitionsESet) result.append(nombreMunitions); else result.append("<unset>");
		result.append(", codeSCL: ");
		result.append(codeSCL);
		result.append(", typeFusee: ");
		result.append(typeFusee);
		result.append(", descriptionTypeMunitions: ");
		result.append(descriptionTypeMunitions);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeArmementMissionAppuiAerienImpl
