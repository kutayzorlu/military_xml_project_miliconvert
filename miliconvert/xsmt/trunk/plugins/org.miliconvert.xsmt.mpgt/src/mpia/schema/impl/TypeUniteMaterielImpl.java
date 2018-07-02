/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeSpecialiteMaintenanceOuDepannage;
import mpia.schema.TypeUniteMateriel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Unite Materiel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeUniteMaterielImpl#getDebut <em>Debut</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteMaterielImpl#getFin <em>Fin</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteMaterielImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteMaterielImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteMaterielImpl#getAPourUniteMeoMaterielUnite <em>APour Unite Meo Materiel Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeUniteMaterielImpl#getACommeSpecialiteSpecialiteMaintenanceOuDepannage <em>AComme Specialite Specialite Maintenance Ou Depannage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeUniteMaterielImpl extends EObjectImpl implements TypeUniteMateriel {
	/**
	 * The default value of the '{@link #getDebut() <em>Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebut()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DEBUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDebut() <em>Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebut()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar debut = DEBUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFin() <em>Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFin()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar FIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFin() <em>Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFin()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar fin = FIN_EDEFAULT;

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
	 * The cached value of the '{@link #getAPourUniteMeoMaterielUnite() <em>APour Unite Meo Materiel Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourUniteMeoMaterielUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aPourUniteMeoMaterielUnite;

	/**
	 * The cached value of the '{@link #getACommeSpecialiteSpecialiteMaintenanceOuDepannage() <em>AComme Specialite Specialite Maintenance Ou Depannage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeSpecialiteSpecialiteMaintenanceOuDepannage()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeSpecialiteMaintenanceOuDepannage> aCommeSpecialiteSpecialiteMaintenanceOuDepannage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeUniteMaterielImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeUniteMateriel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDebut() {
		return debut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDebut(XMLGregorianCalendar newDebut) {
		XMLGregorianCalendar oldDebut = debut;
		debut = newDebut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE_MATERIEL__DEBUT, oldDebut, debut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getFin() {
		return fin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFin(XMLGregorianCalendar newFin) {
		XMLGregorianCalendar oldFin = fin;
		fin = newFin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE_MATERIEL__FIN, oldFin, fin));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE_MATERIEL__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE_MATERIEL__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAPourUniteMeoMaterielUnite() {
		return aPourUniteMeoMaterielUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourUniteMeoMaterielUnite(TypeAssociationEXT newAPourUniteMeoMaterielUnite, NotificationChain msgs) {
		TypeAssociationEXT oldAPourUniteMeoMaterielUnite = aPourUniteMeoMaterielUnite;
		aPourUniteMeoMaterielUnite = newAPourUniteMeoMaterielUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE_MATERIEL__APOUR_UNITE_MEO_MATERIEL_UNITE, oldAPourUniteMeoMaterielUnite, newAPourUniteMeoMaterielUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourUniteMeoMaterielUnite(TypeAssociationEXT newAPourUniteMeoMaterielUnite) {
		if (newAPourUniteMeoMaterielUnite != aPourUniteMeoMaterielUnite) {
			NotificationChain msgs = null;
			if (aPourUniteMeoMaterielUnite != null)
				msgs = ((InternalEObject)aPourUniteMeoMaterielUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_UNITE_MATERIEL__APOUR_UNITE_MEO_MATERIEL_UNITE, null, msgs);
			if (newAPourUniteMeoMaterielUnite != null)
				msgs = ((InternalEObject)newAPourUniteMeoMaterielUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_UNITE_MATERIEL__APOUR_UNITE_MEO_MATERIEL_UNITE, null, msgs);
			msgs = basicSetAPourUniteMeoMaterielUnite(newAPourUniteMeoMaterielUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_UNITE_MATERIEL__APOUR_UNITE_MEO_MATERIEL_UNITE, newAPourUniteMeoMaterielUnite, newAPourUniteMeoMaterielUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeSpecialiteMaintenanceOuDepannage> getACommeSpecialiteSpecialiteMaintenanceOuDepannage() {
		if (aCommeSpecialiteSpecialiteMaintenanceOuDepannage == null) {
			aCommeSpecialiteSpecialiteMaintenanceOuDepannage = new EObjectContainmentEList<TypeSpecialiteMaintenanceOuDepannage>(TypeSpecialiteMaintenanceOuDepannage.class, this, SchemaPackage.TYPE_UNITE_MATERIEL__ACOMME_SPECIALITE_SPECIALITE_MAINTENANCE_OU_DEPANNAGE);
		}
		return aCommeSpecialiteSpecialiteMaintenanceOuDepannage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_UNITE_MATERIEL__APOUR_UNITE_MEO_MATERIEL_UNITE:
				return basicSetAPourUniteMeoMaterielUnite(null, msgs);
			case SchemaPackage.TYPE_UNITE_MATERIEL__ACOMME_SPECIALITE_SPECIALITE_MAINTENANCE_OU_DEPANNAGE:
				return ((InternalEList<?>)getACommeSpecialiteSpecialiteMaintenanceOuDepannage()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_UNITE_MATERIEL__DEBUT:
				return getDebut();
			case SchemaPackage.TYPE_UNITE_MATERIEL__FIN:
				return getFin();
			case SchemaPackage.TYPE_UNITE_MATERIEL__CTE:
				return getCTE();
			case SchemaPackage.TYPE_UNITE_MATERIEL__CE:
				return getCE();
			case SchemaPackage.TYPE_UNITE_MATERIEL__APOUR_UNITE_MEO_MATERIEL_UNITE:
				return getAPourUniteMeoMaterielUnite();
			case SchemaPackage.TYPE_UNITE_MATERIEL__ACOMME_SPECIALITE_SPECIALITE_MAINTENANCE_OU_DEPANNAGE:
				return getACommeSpecialiteSpecialiteMaintenanceOuDepannage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SchemaPackage.TYPE_UNITE_MATERIEL__DEBUT:
				setDebut((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_UNITE_MATERIEL__FIN:
				setFin((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_UNITE_MATERIEL__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_UNITE_MATERIEL__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_UNITE_MATERIEL__APOUR_UNITE_MEO_MATERIEL_UNITE:
				setAPourUniteMeoMaterielUnite((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_UNITE_MATERIEL__ACOMME_SPECIALITE_SPECIALITE_MAINTENANCE_OU_DEPANNAGE:
				getACommeSpecialiteSpecialiteMaintenanceOuDepannage().clear();
				getACommeSpecialiteSpecialiteMaintenanceOuDepannage().addAll((Collection<? extends TypeSpecialiteMaintenanceOuDepannage>)newValue);
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
			case SchemaPackage.TYPE_UNITE_MATERIEL__DEBUT:
				setDebut(DEBUT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_UNITE_MATERIEL__FIN:
				setFin(FIN_EDEFAULT);
				return;
			case SchemaPackage.TYPE_UNITE_MATERIEL__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_UNITE_MATERIEL__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_UNITE_MATERIEL__APOUR_UNITE_MEO_MATERIEL_UNITE:
				setAPourUniteMeoMaterielUnite((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_UNITE_MATERIEL__ACOMME_SPECIALITE_SPECIALITE_MAINTENANCE_OU_DEPANNAGE:
				getACommeSpecialiteSpecialiteMaintenanceOuDepannage().clear();
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
			case SchemaPackage.TYPE_UNITE_MATERIEL__DEBUT:
				return DEBUT_EDEFAULT == null ? debut != null : !DEBUT_EDEFAULT.equals(debut);
			case SchemaPackage.TYPE_UNITE_MATERIEL__FIN:
				return FIN_EDEFAULT == null ? fin != null : !FIN_EDEFAULT.equals(fin);
			case SchemaPackage.TYPE_UNITE_MATERIEL__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_UNITE_MATERIEL__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_UNITE_MATERIEL__APOUR_UNITE_MEO_MATERIEL_UNITE:
				return aPourUniteMeoMaterielUnite != null;
			case SchemaPackage.TYPE_UNITE_MATERIEL__ACOMME_SPECIALITE_SPECIALITE_MAINTENANCE_OU_DEPANNAGE:
				return aCommeSpecialiteSpecialiteMaintenanceOuDepannage != null && !aCommeSpecialiteSpecialiteMaintenanceOuDepannage.isEmpty();
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
		result.append(" (debut: ");
		result.append(debut);
		result.append(", fin: ");
		result.append(fin);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeUniteMaterielImpl
