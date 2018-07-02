/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoCategoriePatients;
import mpia.schema.TypePertesParPeriode;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Pertes Par Periode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypePertesParPeriodeImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePertesParPeriodeImpl#getNombreMorts <em>Nombre Morts</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePertesParPeriodeImpl#getNombreInterventions <em>Nombre Interventions</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePertesParPeriodeImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePertesParPeriodeImpl#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypePertesParPeriodeImpl extends EObjectImpl implements TypePertesParPeriode {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCategoriePatients CATEGORIE_EDEFAULT = TypeDictionaryDicoCategoriePatients.FRFOR;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCategoriePatients categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The default value of the '{@link #getNombreMorts() <em>Nombre Morts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreMorts()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_MORTS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreMorts() <em>Nombre Morts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreMorts()
	 * @generated
	 * @ordered
	 */
	protected long nombreMorts = NOMBRE_MORTS_EDEFAULT;

	/**
	 * This is true if the Nombre Morts attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreMortsESet;

	/**
	 * The default value of the '{@link #getNombreInterventions() <em>Nombre Interventions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreInterventions()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_INTERVENTIONS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreInterventions() <em>Nombre Interventions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreInterventions()
	 * @generated
	 * @ordered
	 */
	protected long nombreInterventions = NOMBRE_INTERVENTIONS_EDEFAULT;

	/**
	 * This is true if the Nombre Interventions attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreInterventionsESet;

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
	protected TypePertesParPeriodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypePertesParPeriode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoCategoriePatients getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoCategoriePatients newCategorie) {
		TypeDictionaryDicoCategoriePatients oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PERTES_PAR_PERIODE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoCategoriePatients oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PERTES_PAR_PERIODE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public long getNombreMorts() {
		return nombreMorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreMorts(long newNombreMorts) {
		long oldNombreMorts = nombreMorts;
		nombreMorts = newNombreMorts;
		boolean oldNombreMortsESet = nombreMortsESet;
		nombreMortsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PERTES_PAR_PERIODE__NOMBRE_MORTS, oldNombreMorts, nombreMorts, !oldNombreMortsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreMorts() {
		long oldNombreMorts = nombreMorts;
		boolean oldNombreMortsESet = nombreMortsESet;
		nombreMorts = NOMBRE_MORTS_EDEFAULT;
		nombreMortsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PERTES_PAR_PERIODE__NOMBRE_MORTS, oldNombreMorts, NOMBRE_MORTS_EDEFAULT, oldNombreMortsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreMorts() {
		return nombreMortsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreInterventions() {
		return nombreInterventions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreInterventions(long newNombreInterventions) {
		long oldNombreInterventions = nombreInterventions;
		nombreInterventions = newNombreInterventions;
		boolean oldNombreInterventionsESet = nombreInterventionsESet;
		nombreInterventionsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PERTES_PAR_PERIODE__NOMBRE_INTERVENTIONS, oldNombreInterventions, nombreInterventions, !oldNombreInterventionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreInterventions() {
		long oldNombreInterventions = nombreInterventions;
		boolean oldNombreInterventionsESet = nombreInterventionsESet;
		nombreInterventions = NOMBRE_INTERVENTIONS_EDEFAULT;
		nombreInterventionsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PERTES_PAR_PERIODE__NOMBRE_INTERVENTIONS, oldNombreInterventions, NOMBRE_INTERVENTIONS_EDEFAULT, oldNombreInterventionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreInterventions() {
		return nombreInterventionsESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PERTES_PAR_PERIODE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PERTES_PAR_PERIODE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_PERTES_PAR_PERIODE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_PERTES_PAR_PERIODE__NOMBRE_MORTS:
				return new Long(getNombreMorts());
			case SchemaPackage.TYPE_PERTES_PAR_PERIODE__NOMBRE_INTERVENTIONS:
				return new Long(getNombreInterventions());
			case SchemaPackage.TYPE_PERTES_PAR_PERIODE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_PERTES_PAR_PERIODE__CE:
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
			case SchemaPackage.TYPE_PERTES_PAR_PERIODE__CATEGORIE:
				setCategorie((TypeDictionaryDicoCategoriePatients)newValue);
				return;
			case SchemaPackage.TYPE_PERTES_PAR_PERIODE__NOMBRE_MORTS:
				setNombreMorts(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_PERTES_PAR_PERIODE__NOMBRE_INTERVENTIONS:
				setNombreInterventions(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_PERTES_PAR_PERIODE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_PERTES_PAR_PERIODE__CE:
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
			case SchemaPackage.TYPE_PERTES_PAR_PERIODE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_PERTES_PAR_PERIODE__NOMBRE_MORTS:
				unsetNombreMorts();
				return;
			case SchemaPackage.TYPE_PERTES_PAR_PERIODE__NOMBRE_INTERVENTIONS:
				unsetNombreInterventions();
				return;
			case SchemaPackage.TYPE_PERTES_PAR_PERIODE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PERTES_PAR_PERIODE__CE:
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
			case SchemaPackage.TYPE_PERTES_PAR_PERIODE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_PERTES_PAR_PERIODE__NOMBRE_MORTS:
				return isSetNombreMorts();
			case SchemaPackage.TYPE_PERTES_PAR_PERIODE__NOMBRE_INTERVENTIONS:
				return isSetNombreInterventions();
			case SchemaPackage.TYPE_PERTES_PAR_PERIODE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_PERTES_PAR_PERIODE__CE:
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
		result.append(" (categorie: ");
		if (categorieESet) result.append(categorie); else result.append("<unset>");
		result.append(", nombreMorts: ");
		if (nombreMortsESet) result.append(nombreMorts); else result.append("<unset>");
		result.append(", nombreInterventions: ");
		if (nombreInterventionsESet) result.append(nombreInterventions); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypePertesParPeriodeImpl
