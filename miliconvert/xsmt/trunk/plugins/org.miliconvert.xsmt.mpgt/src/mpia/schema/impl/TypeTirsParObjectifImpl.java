/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoTypeObjectifASS;
import mpia.schema.TypeTirsParObjectif;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Tirs Par Objectif</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeTirsParObjectifImpl#getNatureObjectif <em>Nature Objectif</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTirsParObjectifImpl#getNombreTirsAssocies <em>Nombre Tirs Associes</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTirsParObjectifImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTirsParObjectifImpl#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeTirsParObjectifImpl extends EObjectImpl implements TypeTirsParObjectif {
	/**
	 * The default value of the '{@link #getNatureObjectif() <em>Nature Objectif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatureObjectif()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeObjectifASS NATURE_OBJECTIF_EDEFAULT = TypeDictionaryDicoTypeObjectifASS.ADA;

	/**
	 * The cached value of the '{@link #getNatureObjectif() <em>Nature Objectif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatureObjectif()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeObjectifASS natureObjectif = NATURE_OBJECTIF_EDEFAULT;

	/**
	 * This is true if the Nature Objectif attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean natureObjectifESet;

	/**
	 * The default value of the '{@link #getNombreTirsAssocies() <em>Nombre Tirs Associes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreTirsAssocies()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_TIRS_ASSOCIES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreTirsAssocies() <em>Nombre Tirs Associes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreTirsAssocies()
	 * @generated
	 * @ordered
	 */
	protected long nombreTirsAssocies = NOMBRE_TIRS_ASSOCIES_EDEFAULT;

	/**
	 * This is true if the Nombre Tirs Associes attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreTirsAssociesESet;

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
	protected TypeTirsParObjectifImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeTirsParObjectif();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeObjectifASS getNatureObjectif() {
		return natureObjectif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNatureObjectif(TypeDictionaryDicoTypeObjectifASS newNatureObjectif) {
		TypeDictionaryDicoTypeObjectifASS oldNatureObjectif = natureObjectif;
		natureObjectif = newNatureObjectif == null ? NATURE_OBJECTIF_EDEFAULT : newNatureObjectif;
		boolean oldNatureObjectifESet = natureObjectifESet;
		natureObjectifESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TIRS_PAR_OBJECTIF__NATURE_OBJECTIF, oldNatureObjectif, natureObjectif, !oldNatureObjectifESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNatureObjectif() {
		TypeDictionaryDicoTypeObjectifASS oldNatureObjectif = natureObjectif;
		boolean oldNatureObjectifESet = natureObjectifESet;
		natureObjectif = NATURE_OBJECTIF_EDEFAULT;
		natureObjectifESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TIRS_PAR_OBJECTIF__NATURE_OBJECTIF, oldNatureObjectif, NATURE_OBJECTIF_EDEFAULT, oldNatureObjectifESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNatureObjectif() {
		return natureObjectifESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreTirsAssocies() {
		return nombreTirsAssocies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreTirsAssocies(long newNombreTirsAssocies) {
		long oldNombreTirsAssocies = nombreTirsAssocies;
		nombreTirsAssocies = newNombreTirsAssocies;
		boolean oldNombreTirsAssociesESet = nombreTirsAssociesESet;
		nombreTirsAssociesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TIRS_PAR_OBJECTIF__NOMBRE_TIRS_ASSOCIES, oldNombreTirsAssocies, nombreTirsAssocies, !oldNombreTirsAssociesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreTirsAssocies() {
		long oldNombreTirsAssocies = nombreTirsAssocies;
		boolean oldNombreTirsAssociesESet = nombreTirsAssociesESet;
		nombreTirsAssocies = NOMBRE_TIRS_ASSOCIES_EDEFAULT;
		nombreTirsAssociesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TIRS_PAR_OBJECTIF__NOMBRE_TIRS_ASSOCIES, oldNombreTirsAssocies, NOMBRE_TIRS_ASSOCIES_EDEFAULT, oldNombreTirsAssociesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreTirsAssocies() {
		return nombreTirsAssociesESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TIRS_PAR_OBJECTIF__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TIRS_PAR_OBJECTIF__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_TIRS_PAR_OBJECTIF__NATURE_OBJECTIF:
				return getNatureObjectif();
			case SchemaPackage.TYPE_TIRS_PAR_OBJECTIF__NOMBRE_TIRS_ASSOCIES:
				return new Long(getNombreTirsAssocies());
			case SchemaPackage.TYPE_TIRS_PAR_OBJECTIF__CTE:
				return getCTE();
			case SchemaPackage.TYPE_TIRS_PAR_OBJECTIF__CE:
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
			case SchemaPackage.TYPE_TIRS_PAR_OBJECTIF__NATURE_OBJECTIF:
				setNatureObjectif((TypeDictionaryDicoTypeObjectifASS)newValue);
				return;
			case SchemaPackage.TYPE_TIRS_PAR_OBJECTIF__NOMBRE_TIRS_ASSOCIES:
				setNombreTirsAssocies(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_TIRS_PAR_OBJECTIF__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_TIRS_PAR_OBJECTIF__CE:
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
			case SchemaPackage.TYPE_TIRS_PAR_OBJECTIF__NATURE_OBJECTIF:
				unsetNatureObjectif();
				return;
			case SchemaPackage.TYPE_TIRS_PAR_OBJECTIF__NOMBRE_TIRS_ASSOCIES:
				unsetNombreTirsAssocies();
				return;
			case SchemaPackage.TYPE_TIRS_PAR_OBJECTIF__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TIRS_PAR_OBJECTIF__CE:
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
			case SchemaPackage.TYPE_TIRS_PAR_OBJECTIF__NATURE_OBJECTIF:
				return isSetNatureObjectif();
			case SchemaPackage.TYPE_TIRS_PAR_OBJECTIF__NOMBRE_TIRS_ASSOCIES:
				return isSetNombreTirsAssocies();
			case SchemaPackage.TYPE_TIRS_PAR_OBJECTIF__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_TIRS_PAR_OBJECTIF__CE:
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
		result.append(" (natureObjectif: ");
		if (natureObjectifESet) result.append(natureObjectif); else result.append("<unset>");
		result.append(", nombreTirsAssocies: ");
		if (nombreTirsAssociesESet) result.append(nombreTirsAssocies); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeTirsParObjectifImpl
