/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeChampMinesMaritimeDommagesEstimes;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Champ Mines Maritime Dommages Estimes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeChampMinesMaritimeDommagesEstimesImpl#getNbEstimes <em>Nb Estimes</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeChampMinesMaritimeDommagesEstimesImpl#getNbTransitsEnreg <em>Nb Transits Enreg</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeChampMinesMaritimeDommagesEstimesImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeChampMinesMaritimeDommagesEstimesImpl#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeChampMinesMaritimeDommagesEstimesImpl extends EObjectImpl implements TypeChampMinesMaritimeDommagesEstimes {
	/**
	 * The default value of the '{@link #getNbEstimes() <em>Nb Estimes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbEstimes()
	 * @generated
	 * @ordered
	 */
	protected static final long NB_ESTIMES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNbEstimes() <em>Nb Estimes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbEstimes()
	 * @generated
	 * @ordered
	 */
	protected long nbEstimes = NB_ESTIMES_EDEFAULT;

	/**
	 * This is true if the Nb Estimes attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nbEstimesESet;

	/**
	 * The default value of the '{@link #getNbTransitsEnreg() <em>Nb Transits Enreg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbTransitsEnreg()
	 * @generated
	 * @ordered
	 */
	protected static final long NB_TRANSITS_ENREG_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNbTransitsEnreg() <em>Nb Transits Enreg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbTransitsEnreg()
	 * @generated
	 * @ordered
	 */
	protected long nbTransitsEnreg = NB_TRANSITS_ENREG_EDEFAULT;

	/**
	 * This is true if the Nb Transits Enreg attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nbTransitsEnregESet;

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
	protected TypeChampMinesMaritimeDommagesEstimesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeChampMinesMaritimeDommagesEstimes();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNbEstimes() {
		return nbEstimes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbEstimes(long newNbEstimes) {
		long oldNbEstimes = nbEstimes;
		nbEstimes = newNbEstimes;
		boolean oldNbEstimesESet = nbEstimesESet;
		nbEstimesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CHAMP_MINES_MARITIME_DOMMAGES_ESTIMES__NB_ESTIMES, oldNbEstimes, nbEstimes, !oldNbEstimesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNbEstimes() {
		long oldNbEstimes = nbEstimes;
		boolean oldNbEstimesESet = nbEstimesESet;
		nbEstimes = NB_ESTIMES_EDEFAULT;
		nbEstimesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CHAMP_MINES_MARITIME_DOMMAGES_ESTIMES__NB_ESTIMES, oldNbEstimes, NB_ESTIMES_EDEFAULT, oldNbEstimesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNbEstimes() {
		return nbEstimesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNbTransitsEnreg() {
		return nbTransitsEnreg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbTransitsEnreg(long newNbTransitsEnreg) {
		long oldNbTransitsEnreg = nbTransitsEnreg;
		nbTransitsEnreg = newNbTransitsEnreg;
		boolean oldNbTransitsEnregESet = nbTransitsEnregESet;
		nbTransitsEnregESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CHAMP_MINES_MARITIME_DOMMAGES_ESTIMES__NB_TRANSITS_ENREG, oldNbTransitsEnreg, nbTransitsEnreg, !oldNbTransitsEnregESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNbTransitsEnreg() {
		long oldNbTransitsEnreg = nbTransitsEnreg;
		boolean oldNbTransitsEnregESet = nbTransitsEnregESet;
		nbTransitsEnreg = NB_TRANSITS_ENREG_EDEFAULT;
		nbTransitsEnregESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CHAMP_MINES_MARITIME_DOMMAGES_ESTIMES__NB_TRANSITS_ENREG, oldNbTransitsEnreg, NB_TRANSITS_ENREG_EDEFAULT, oldNbTransitsEnregESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNbTransitsEnreg() {
		return nbTransitsEnregESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CHAMP_MINES_MARITIME_DOMMAGES_ESTIMES__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CHAMP_MINES_MARITIME_DOMMAGES_ESTIMES__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME_DOMMAGES_ESTIMES__NB_ESTIMES:
				return new Long(getNbEstimes());
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME_DOMMAGES_ESTIMES__NB_TRANSITS_ENREG:
				return new Long(getNbTransitsEnreg());
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME_DOMMAGES_ESTIMES__CTE:
				return getCTE();
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME_DOMMAGES_ESTIMES__CE:
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
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME_DOMMAGES_ESTIMES__NB_ESTIMES:
				setNbEstimes(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME_DOMMAGES_ESTIMES__NB_TRANSITS_ENREG:
				setNbTransitsEnreg(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME_DOMMAGES_ESTIMES__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME_DOMMAGES_ESTIMES__CE:
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
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME_DOMMAGES_ESTIMES__NB_ESTIMES:
				unsetNbEstimes();
				return;
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME_DOMMAGES_ESTIMES__NB_TRANSITS_ENREG:
				unsetNbTransitsEnreg();
				return;
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME_DOMMAGES_ESTIMES__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME_DOMMAGES_ESTIMES__CE:
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
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME_DOMMAGES_ESTIMES__NB_ESTIMES:
				return isSetNbEstimes();
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME_DOMMAGES_ESTIMES__NB_TRANSITS_ENREG:
				return isSetNbTransitsEnreg();
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME_DOMMAGES_ESTIMES__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_CHAMP_MINES_MARITIME_DOMMAGES_ESTIMES__CE:
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
		result.append(" (nbEstimes: ");
		if (nbEstimesESet) result.append(nbEstimes); else result.append("<unset>");
		result.append(", nbTransitsEnreg: ");
		if (nbTransitsEnregESet) result.append(nbTransitsEnreg); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeChampMinesMaritimeDommagesEstimesImpl
