/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoMoyensEvacuationCategorieMoyens;
import mpia.schema.TypeMoyensEvacuation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Moyens Evacuation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMoyensEvacuationImpl#getCategorieMoyens <em>Categorie Moyens</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyensEvacuationImpl#getMoyensDisponibles <em>Moyens Disponibles</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyensEvacuationImpl#getMoyensExistants <em>Moyens Existants</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyensEvacuationImpl#getMoyensPreleves <em>Moyens Preleves</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyensEvacuationImpl#getMoyensRecus <em>Moyens Recus</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyensEvacuationImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyensEvacuationImpl#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMoyensEvacuationImpl extends EObjectImpl implements TypeMoyensEvacuation {
	/**
	 * The default value of the '{@link #getCategorieMoyens() <em>Categorie Moyens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorieMoyens()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoMoyensEvacuationCategorieMoyens CATEGORIE_MOYENS_EDEFAULT = TypeDictionaryDicoMoyensEvacuationCategorieMoyens.LREC;

	/**
	 * The cached value of the '{@link #getCategorieMoyens() <em>Categorie Moyens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorieMoyens()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoMoyensEvacuationCategorieMoyens categorieMoyens = CATEGORIE_MOYENS_EDEFAULT;

	/**
	 * This is true if the Categorie Moyens attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieMoyensESet;

	/**
	 * The default value of the '{@link #getMoyensDisponibles() <em>Moyens Disponibles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyensDisponibles()
	 * @generated
	 * @ordered
	 */
	protected static final long MOYENS_DISPONIBLES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMoyensDisponibles() <em>Moyens Disponibles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyensDisponibles()
	 * @generated
	 * @ordered
	 */
	protected long moyensDisponibles = MOYENS_DISPONIBLES_EDEFAULT;

	/**
	 * This is true if the Moyens Disponibles attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean moyensDisponiblesESet;

	/**
	 * The default value of the '{@link #getMoyensExistants() <em>Moyens Existants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyensExistants()
	 * @generated
	 * @ordered
	 */
	protected static final long MOYENS_EXISTANTS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMoyensExistants() <em>Moyens Existants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyensExistants()
	 * @generated
	 * @ordered
	 */
	protected long moyensExistants = MOYENS_EXISTANTS_EDEFAULT;

	/**
	 * This is true if the Moyens Existants attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean moyensExistantsESet;

	/**
	 * The default value of the '{@link #getMoyensPreleves() <em>Moyens Preleves</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyensPreleves()
	 * @generated
	 * @ordered
	 */
	protected static final long MOYENS_PRELEVES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMoyensPreleves() <em>Moyens Preleves</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyensPreleves()
	 * @generated
	 * @ordered
	 */
	protected long moyensPreleves = MOYENS_PRELEVES_EDEFAULT;

	/**
	 * This is true if the Moyens Preleves attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean moyensPrelevesESet;

	/**
	 * The default value of the '{@link #getMoyensRecus() <em>Moyens Recus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyensRecus()
	 * @generated
	 * @ordered
	 */
	protected static final long MOYENS_RECUS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMoyensRecus() <em>Moyens Recus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyensRecus()
	 * @generated
	 * @ordered
	 */
	protected long moyensRecus = MOYENS_RECUS_EDEFAULT;

	/**
	 * This is true if the Moyens Recus attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean moyensRecusESet;

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
	protected TypeMoyensEvacuationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMoyensEvacuation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoMoyensEvacuationCategorieMoyens getCategorieMoyens() {
		return categorieMoyens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorieMoyens(TypeDictionaryDicoMoyensEvacuationCategorieMoyens newCategorieMoyens) {
		TypeDictionaryDicoMoyensEvacuationCategorieMoyens oldCategorieMoyens = categorieMoyens;
		categorieMoyens = newCategorieMoyens == null ? CATEGORIE_MOYENS_EDEFAULT : newCategorieMoyens;
		boolean oldCategorieMoyensESet = categorieMoyensESet;
		categorieMoyensESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYENS_EVACUATION__CATEGORIE_MOYENS, oldCategorieMoyens, categorieMoyens, !oldCategorieMoyensESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorieMoyens() {
		TypeDictionaryDicoMoyensEvacuationCategorieMoyens oldCategorieMoyens = categorieMoyens;
		boolean oldCategorieMoyensESet = categorieMoyensESet;
		categorieMoyens = CATEGORIE_MOYENS_EDEFAULT;
		categorieMoyensESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MOYENS_EVACUATION__CATEGORIE_MOYENS, oldCategorieMoyens, CATEGORIE_MOYENS_EDEFAULT, oldCategorieMoyensESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCategorieMoyens() {
		return categorieMoyensESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMoyensDisponibles() {
		return moyensDisponibles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoyensDisponibles(long newMoyensDisponibles) {
		long oldMoyensDisponibles = moyensDisponibles;
		moyensDisponibles = newMoyensDisponibles;
		boolean oldMoyensDisponiblesESet = moyensDisponiblesESet;
		moyensDisponiblesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYENS_EVACUATION__MOYENS_DISPONIBLES, oldMoyensDisponibles, moyensDisponibles, !oldMoyensDisponiblesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMoyensDisponibles() {
		long oldMoyensDisponibles = moyensDisponibles;
		boolean oldMoyensDisponiblesESet = moyensDisponiblesESet;
		moyensDisponibles = MOYENS_DISPONIBLES_EDEFAULT;
		moyensDisponiblesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MOYENS_EVACUATION__MOYENS_DISPONIBLES, oldMoyensDisponibles, MOYENS_DISPONIBLES_EDEFAULT, oldMoyensDisponiblesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMoyensDisponibles() {
		return moyensDisponiblesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMoyensExistants() {
		return moyensExistants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoyensExistants(long newMoyensExistants) {
		long oldMoyensExistants = moyensExistants;
		moyensExistants = newMoyensExistants;
		boolean oldMoyensExistantsESet = moyensExistantsESet;
		moyensExistantsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYENS_EVACUATION__MOYENS_EXISTANTS, oldMoyensExistants, moyensExistants, !oldMoyensExistantsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMoyensExistants() {
		long oldMoyensExistants = moyensExistants;
		boolean oldMoyensExistantsESet = moyensExistantsESet;
		moyensExistants = MOYENS_EXISTANTS_EDEFAULT;
		moyensExistantsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MOYENS_EVACUATION__MOYENS_EXISTANTS, oldMoyensExistants, MOYENS_EXISTANTS_EDEFAULT, oldMoyensExistantsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMoyensExistants() {
		return moyensExistantsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMoyensPreleves() {
		return moyensPreleves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoyensPreleves(long newMoyensPreleves) {
		long oldMoyensPreleves = moyensPreleves;
		moyensPreleves = newMoyensPreleves;
		boolean oldMoyensPrelevesESet = moyensPrelevesESet;
		moyensPrelevesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYENS_EVACUATION__MOYENS_PRELEVES, oldMoyensPreleves, moyensPreleves, !oldMoyensPrelevesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMoyensPreleves() {
		long oldMoyensPreleves = moyensPreleves;
		boolean oldMoyensPrelevesESet = moyensPrelevesESet;
		moyensPreleves = MOYENS_PRELEVES_EDEFAULT;
		moyensPrelevesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MOYENS_EVACUATION__MOYENS_PRELEVES, oldMoyensPreleves, MOYENS_PRELEVES_EDEFAULT, oldMoyensPrelevesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMoyensPreleves() {
		return moyensPrelevesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMoyensRecus() {
		return moyensRecus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoyensRecus(long newMoyensRecus) {
		long oldMoyensRecus = moyensRecus;
		moyensRecus = newMoyensRecus;
		boolean oldMoyensRecusESet = moyensRecusESet;
		moyensRecusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYENS_EVACUATION__MOYENS_RECUS, oldMoyensRecus, moyensRecus, !oldMoyensRecusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMoyensRecus() {
		long oldMoyensRecus = moyensRecus;
		boolean oldMoyensRecusESet = moyensRecusESet;
		moyensRecus = MOYENS_RECUS_EDEFAULT;
		moyensRecusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MOYENS_EVACUATION__MOYENS_RECUS, oldMoyensRecus, MOYENS_RECUS_EDEFAULT, oldMoyensRecusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMoyensRecus() {
		return moyensRecusESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYENS_EVACUATION__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYENS_EVACUATION__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_MOYENS_EVACUATION__CATEGORIE_MOYENS:
				return getCategorieMoyens();
			case SchemaPackage.TYPE_MOYENS_EVACUATION__MOYENS_DISPONIBLES:
				return new Long(getMoyensDisponibles());
			case SchemaPackage.TYPE_MOYENS_EVACUATION__MOYENS_EXISTANTS:
				return new Long(getMoyensExistants());
			case SchemaPackage.TYPE_MOYENS_EVACUATION__MOYENS_PRELEVES:
				return new Long(getMoyensPreleves());
			case SchemaPackage.TYPE_MOYENS_EVACUATION__MOYENS_RECUS:
				return new Long(getMoyensRecus());
			case SchemaPackage.TYPE_MOYENS_EVACUATION__CTE:
				return getCTE();
			case SchemaPackage.TYPE_MOYENS_EVACUATION__CE:
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
			case SchemaPackage.TYPE_MOYENS_EVACUATION__CATEGORIE_MOYENS:
				setCategorieMoyens((TypeDictionaryDicoMoyensEvacuationCategorieMoyens)newValue);
				return;
			case SchemaPackage.TYPE_MOYENS_EVACUATION__MOYENS_DISPONIBLES:
				setMoyensDisponibles(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_MOYENS_EVACUATION__MOYENS_EXISTANTS:
				setMoyensExistants(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_MOYENS_EVACUATION__MOYENS_PRELEVES:
				setMoyensPreleves(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_MOYENS_EVACUATION__MOYENS_RECUS:
				setMoyensRecus(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_MOYENS_EVACUATION__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_MOYENS_EVACUATION__CE:
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
			case SchemaPackage.TYPE_MOYENS_EVACUATION__CATEGORIE_MOYENS:
				unsetCategorieMoyens();
				return;
			case SchemaPackage.TYPE_MOYENS_EVACUATION__MOYENS_DISPONIBLES:
				unsetMoyensDisponibles();
				return;
			case SchemaPackage.TYPE_MOYENS_EVACUATION__MOYENS_EXISTANTS:
				unsetMoyensExistants();
				return;
			case SchemaPackage.TYPE_MOYENS_EVACUATION__MOYENS_PRELEVES:
				unsetMoyensPreleves();
				return;
			case SchemaPackage.TYPE_MOYENS_EVACUATION__MOYENS_RECUS:
				unsetMoyensRecus();
				return;
			case SchemaPackage.TYPE_MOYENS_EVACUATION__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MOYENS_EVACUATION__CE:
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
			case SchemaPackage.TYPE_MOYENS_EVACUATION__CATEGORIE_MOYENS:
				return isSetCategorieMoyens();
			case SchemaPackage.TYPE_MOYENS_EVACUATION__MOYENS_DISPONIBLES:
				return isSetMoyensDisponibles();
			case SchemaPackage.TYPE_MOYENS_EVACUATION__MOYENS_EXISTANTS:
				return isSetMoyensExistants();
			case SchemaPackage.TYPE_MOYENS_EVACUATION__MOYENS_PRELEVES:
				return isSetMoyensPreleves();
			case SchemaPackage.TYPE_MOYENS_EVACUATION__MOYENS_RECUS:
				return isSetMoyensRecus();
			case SchemaPackage.TYPE_MOYENS_EVACUATION__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_MOYENS_EVACUATION__CE:
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
		result.append(" (categorieMoyens: ");
		if (categorieMoyensESet) result.append(categorieMoyens); else result.append("<unset>");
		result.append(", moyensDisponibles: ");
		if (moyensDisponiblesESet) result.append(moyensDisponibles); else result.append("<unset>");
		result.append(", moyensExistants: ");
		if (moyensExistantsESet) result.append(moyensExistants); else result.append("<unset>");
		result.append(", moyensPreleves: ");
		if (moyensPrelevesESet) result.append(moyensPreleves); else result.append("<unset>");
		result.append(", moyensRecus: ");
		if (moyensRecusESet) result.append(moyensRecus); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeMoyensEvacuationImpl
