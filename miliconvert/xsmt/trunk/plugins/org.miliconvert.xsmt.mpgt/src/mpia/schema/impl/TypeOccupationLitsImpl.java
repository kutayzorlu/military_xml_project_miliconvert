/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoCategoriePatients;
import mpia.schema.TypeOccupationLits;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Occupation Lits</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeOccupationLitsImpl#getCategoriePatients <em>Categorie Patients</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeOccupationLitsImpl#getNbOccupants <em>Nb Occupants</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeOccupationLitsImpl#getNbBlessesNRBC <em>Nb Blesses NRBC</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeOccupationLitsImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeOccupationLitsImpl#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeOccupationLitsImpl extends EObjectImpl implements TypeOccupationLits {
	/**
	 * The default value of the '{@link #getCategoriePatients() <em>Categorie Patients</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoriePatients()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCategoriePatients CATEGORIE_PATIENTS_EDEFAULT = TypeDictionaryDicoCategoriePatients.FRFOR;

	/**
	 * The cached value of the '{@link #getCategoriePatients() <em>Categorie Patients</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoriePatients()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCategoriePatients categoriePatients = CATEGORIE_PATIENTS_EDEFAULT;

	/**
	 * This is true if the Categorie Patients attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categoriePatientsESet;

	/**
	 * The default value of the '{@link #getNbOccupants() <em>Nb Occupants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbOccupants()
	 * @generated
	 * @ordered
	 */
	protected static final long NB_OCCUPANTS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNbOccupants() <em>Nb Occupants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbOccupants()
	 * @generated
	 * @ordered
	 */
	protected long nbOccupants = NB_OCCUPANTS_EDEFAULT;

	/**
	 * This is true if the Nb Occupants attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nbOccupantsESet;

	/**
	 * The default value of the '{@link #getNbBlessesNRBC() <em>Nb Blesses NRBC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbBlessesNRBC()
	 * @generated
	 * @ordered
	 */
	protected static final long NB_BLESSES_NRBC_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNbBlessesNRBC() <em>Nb Blesses NRBC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbBlessesNRBC()
	 * @generated
	 * @ordered
	 */
	protected long nbBlessesNRBC = NB_BLESSES_NRBC_EDEFAULT;

	/**
	 * This is true if the Nb Blesses NRBC attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nbBlessesNRBCESet;

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
	protected TypeOccupationLitsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeOccupationLits();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoCategoriePatients getCategoriePatients() {
		return categoriePatients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategoriePatients(TypeDictionaryDicoCategoriePatients newCategoriePatients) {
		TypeDictionaryDicoCategoriePatients oldCategoriePatients = categoriePatients;
		categoriePatients = newCategoriePatients == null ? CATEGORIE_PATIENTS_EDEFAULT : newCategoriePatients;
		boolean oldCategoriePatientsESet = categoriePatientsESet;
		categoriePatientsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OCCUPATION_LITS__CATEGORIE_PATIENTS, oldCategoriePatients, categoriePatients, !oldCategoriePatientsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategoriePatients() {
		TypeDictionaryDicoCategoriePatients oldCategoriePatients = categoriePatients;
		boolean oldCategoriePatientsESet = categoriePatientsESet;
		categoriePatients = CATEGORIE_PATIENTS_EDEFAULT;
		categoriePatientsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_OCCUPATION_LITS__CATEGORIE_PATIENTS, oldCategoriePatients, CATEGORIE_PATIENTS_EDEFAULT, oldCategoriePatientsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCategoriePatients() {
		return categoriePatientsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNbOccupants() {
		return nbOccupants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbOccupants(long newNbOccupants) {
		long oldNbOccupants = nbOccupants;
		nbOccupants = newNbOccupants;
		boolean oldNbOccupantsESet = nbOccupantsESet;
		nbOccupantsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OCCUPATION_LITS__NB_OCCUPANTS, oldNbOccupants, nbOccupants, !oldNbOccupantsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNbOccupants() {
		long oldNbOccupants = nbOccupants;
		boolean oldNbOccupantsESet = nbOccupantsESet;
		nbOccupants = NB_OCCUPANTS_EDEFAULT;
		nbOccupantsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_OCCUPATION_LITS__NB_OCCUPANTS, oldNbOccupants, NB_OCCUPANTS_EDEFAULT, oldNbOccupantsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNbOccupants() {
		return nbOccupantsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNbBlessesNRBC() {
		return nbBlessesNRBC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbBlessesNRBC(long newNbBlessesNRBC) {
		long oldNbBlessesNRBC = nbBlessesNRBC;
		nbBlessesNRBC = newNbBlessesNRBC;
		boolean oldNbBlessesNRBCESet = nbBlessesNRBCESet;
		nbBlessesNRBCESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OCCUPATION_LITS__NB_BLESSES_NRBC, oldNbBlessesNRBC, nbBlessesNRBC, !oldNbBlessesNRBCESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNbBlessesNRBC() {
		long oldNbBlessesNRBC = nbBlessesNRBC;
		boolean oldNbBlessesNRBCESet = nbBlessesNRBCESet;
		nbBlessesNRBC = NB_BLESSES_NRBC_EDEFAULT;
		nbBlessesNRBCESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_OCCUPATION_LITS__NB_BLESSES_NRBC, oldNbBlessesNRBC, NB_BLESSES_NRBC_EDEFAULT, oldNbBlessesNRBCESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNbBlessesNRBC() {
		return nbBlessesNRBCESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OCCUPATION_LITS__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OCCUPATION_LITS__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_OCCUPATION_LITS__CATEGORIE_PATIENTS:
				return getCategoriePatients();
			case SchemaPackage.TYPE_OCCUPATION_LITS__NB_OCCUPANTS:
				return new Long(getNbOccupants());
			case SchemaPackage.TYPE_OCCUPATION_LITS__NB_BLESSES_NRBC:
				return new Long(getNbBlessesNRBC());
			case SchemaPackage.TYPE_OCCUPATION_LITS__CTE:
				return getCTE();
			case SchemaPackage.TYPE_OCCUPATION_LITS__CE:
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
			case SchemaPackage.TYPE_OCCUPATION_LITS__CATEGORIE_PATIENTS:
				setCategoriePatients((TypeDictionaryDicoCategoriePatients)newValue);
				return;
			case SchemaPackage.TYPE_OCCUPATION_LITS__NB_OCCUPANTS:
				setNbOccupants(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_OCCUPATION_LITS__NB_BLESSES_NRBC:
				setNbBlessesNRBC(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_OCCUPATION_LITS__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_OCCUPATION_LITS__CE:
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
			case SchemaPackage.TYPE_OCCUPATION_LITS__CATEGORIE_PATIENTS:
				unsetCategoriePatients();
				return;
			case SchemaPackage.TYPE_OCCUPATION_LITS__NB_OCCUPANTS:
				unsetNbOccupants();
				return;
			case SchemaPackage.TYPE_OCCUPATION_LITS__NB_BLESSES_NRBC:
				unsetNbBlessesNRBC();
				return;
			case SchemaPackage.TYPE_OCCUPATION_LITS__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_OCCUPATION_LITS__CE:
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
			case SchemaPackage.TYPE_OCCUPATION_LITS__CATEGORIE_PATIENTS:
				return isSetCategoriePatients();
			case SchemaPackage.TYPE_OCCUPATION_LITS__NB_OCCUPANTS:
				return isSetNbOccupants();
			case SchemaPackage.TYPE_OCCUPATION_LITS__NB_BLESSES_NRBC:
				return isSetNbBlessesNRBC();
			case SchemaPackage.TYPE_OCCUPATION_LITS__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_OCCUPATION_LITS__CE:
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
		result.append(" (categoriePatients: ");
		if (categoriePatientsESet) result.append(categoriePatients); else result.append("<unset>");
		result.append(", nbOccupants: ");
		if (nbOccupantsESet) result.append(nbOccupants); else result.append("<unset>");
		result.append(", nbBlessesNRBC: ");
		if (nbBlessesNRBCESet) result.append(nbBlessesNRBC); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeOccupationLitsImpl
