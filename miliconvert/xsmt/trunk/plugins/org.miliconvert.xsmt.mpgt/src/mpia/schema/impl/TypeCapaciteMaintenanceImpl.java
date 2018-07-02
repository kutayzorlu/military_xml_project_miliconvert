/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCapaciteMaintenance;
import mpia.schema.TypeDictionaryDicoCapaciteMaintenanceCategorie;
import mpia.schema.TypeDictionaryDicoCapaciteMaintenanceNiveauService;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Capacite Maintenance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeCapaciteMaintenanceImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteMaintenanceImpl#getNombrePostes <em>Nombre Postes</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteMaintenanceImpl#getNiveauService <em>Niveau Service</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeCapaciteMaintenanceImpl extends TypeCapaciteImpl implements TypeCapaciteMaintenance {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCapaciteMaintenanceCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoCapaciteMaintenanceCategorie.PNTSHP;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCapaciteMaintenanceCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The default value of the '{@link #getNombrePostes() <em>Nombre Postes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombrePostes()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_POSTES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombrePostes() <em>Nombre Postes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombrePostes()
	 * @generated
	 * @ordered
	 */
	protected long nombrePostes = NOMBRE_POSTES_EDEFAULT;

	/**
	 * This is true if the Nombre Postes attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombrePostesESet;

	/**
	 * The default value of the '{@link #getNiveauService() <em>Niveau Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauService()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCapaciteMaintenanceNiveauService NIVEAU_SERVICE_EDEFAULT = TypeDictionaryDicoCapaciteMaintenanceNiveauService.D;

	/**
	 * The cached value of the '{@link #getNiveauService() <em>Niveau Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauService()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCapaciteMaintenanceNiveauService niveauService = NIVEAU_SERVICE_EDEFAULT;

	/**
	 * This is true if the Niveau Service attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean niveauServiceESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeCapaciteMaintenanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeCapaciteMaintenance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoCapaciteMaintenanceCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoCapaciteMaintenanceCategorie newCategorie) {
		TypeDictionaryDicoCapaciteMaintenanceCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_MAINTENANCE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoCapaciteMaintenanceCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAPACITE_MAINTENANCE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCategorie() {
		return categorieESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombrePostes() {
		return nombrePostes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombrePostes(long newNombrePostes) {
		long oldNombrePostes = nombrePostes;
		nombrePostes = newNombrePostes;
		boolean oldNombrePostesESet = nombrePostesESet;
		nombrePostesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_MAINTENANCE__NOMBRE_POSTES, oldNombrePostes, nombrePostes, !oldNombrePostesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombrePostes() {
		long oldNombrePostes = nombrePostes;
		boolean oldNombrePostesESet = nombrePostesESet;
		nombrePostes = NOMBRE_POSTES_EDEFAULT;
		nombrePostesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAPACITE_MAINTENANCE__NOMBRE_POSTES, oldNombrePostes, NOMBRE_POSTES_EDEFAULT, oldNombrePostesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombrePostes() {
		return nombrePostesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoCapaciteMaintenanceNiveauService getNiveauService() {
		return niveauService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNiveauService(TypeDictionaryDicoCapaciteMaintenanceNiveauService newNiveauService) {
		TypeDictionaryDicoCapaciteMaintenanceNiveauService oldNiveauService = niveauService;
		niveauService = newNiveauService == null ? NIVEAU_SERVICE_EDEFAULT : newNiveauService;
		boolean oldNiveauServiceESet = niveauServiceESet;
		niveauServiceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_MAINTENANCE__NIVEAU_SERVICE, oldNiveauService, niveauService, !oldNiveauServiceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNiveauService() {
		TypeDictionaryDicoCapaciteMaintenanceNiveauService oldNiveauService = niveauService;
		boolean oldNiveauServiceESet = niveauServiceESet;
		niveauService = NIVEAU_SERVICE_EDEFAULT;
		niveauServiceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAPACITE_MAINTENANCE__NIVEAU_SERVICE, oldNiveauService, NIVEAU_SERVICE_EDEFAULT, oldNiveauServiceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNiveauService() {
		return niveauServiceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_CAPACITE_MAINTENANCE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_CAPACITE_MAINTENANCE__NOMBRE_POSTES:
				return new Long(getNombrePostes());
			case SchemaPackage.TYPE_CAPACITE_MAINTENANCE__NIVEAU_SERVICE:
				return getNiveauService();
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
			case SchemaPackage.TYPE_CAPACITE_MAINTENANCE__CATEGORIE:
				setCategorie((TypeDictionaryDicoCapaciteMaintenanceCategorie)newValue);
				return;
			case SchemaPackage.TYPE_CAPACITE_MAINTENANCE__NOMBRE_POSTES:
				setNombrePostes(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_CAPACITE_MAINTENANCE__NIVEAU_SERVICE:
				setNiveauService((TypeDictionaryDicoCapaciteMaintenanceNiveauService)newValue);
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
			case SchemaPackage.TYPE_CAPACITE_MAINTENANCE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_CAPACITE_MAINTENANCE__NOMBRE_POSTES:
				unsetNombrePostes();
				return;
			case SchemaPackage.TYPE_CAPACITE_MAINTENANCE__NIVEAU_SERVICE:
				unsetNiveauService();
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
			case SchemaPackage.TYPE_CAPACITE_MAINTENANCE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_CAPACITE_MAINTENANCE__NOMBRE_POSTES:
				return isSetNombrePostes();
			case SchemaPackage.TYPE_CAPACITE_MAINTENANCE__NIVEAU_SERVICE:
				return isSetNiveauService();
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
		result.append(" (categorie: ");
		if (categorieESet) result.append(categorie); else result.append("<unset>");
		result.append(", nombrePostes: ");
		if (nombrePostesESet) result.append(nombrePostes); else result.append("<unset>");
		result.append(", niveauService: ");
		if (niveauServiceESet) result.append(niveauService); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeCapaciteMaintenanceImpl
