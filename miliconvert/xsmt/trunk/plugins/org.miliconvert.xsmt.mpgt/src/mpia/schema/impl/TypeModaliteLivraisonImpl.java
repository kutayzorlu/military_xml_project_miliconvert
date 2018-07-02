/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeModaliteLivraison;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Modalite Livraison</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeModaliteLivraisonImpl#getDateDeDebut <em>Date De Debut</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModaliteLivraisonImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModaliteLivraisonImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModaliteLivraisonImpl#getAPourBeneficiaireUnite <em>APour Beneficiaire Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeModaliteLivraisonImpl extends EObjectImpl implements TypeModaliteLivraison {
	/**
	 * The default value of the '{@link #getDateDeDebut() <em>Date De Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDeDebut()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_DE_DEBUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateDeDebut() <em>Date De Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDeDebut()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateDeDebut = DATE_DE_DEBUT_EDEFAULT;

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
	 * The cached value of the '{@link #getAPourBeneficiaireUnite() <em>APour Beneficiaire Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourBeneficiaireUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aPourBeneficiaireUnite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeModaliteLivraisonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeModaliteLivraison();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateDeDebut() {
		return dateDeDebut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateDeDebut(XMLGregorianCalendar newDateDeDebut) {
		XMLGregorianCalendar oldDateDeDebut = dateDeDebut;
		dateDeDebut = newDateDeDebut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITE_LIVRAISON__DATE_DE_DEBUT, oldDateDeDebut, dateDeDebut));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITE_LIVRAISON__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITE_LIVRAISON__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAPourBeneficiaireUnite() {
		return aPourBeneficiaireUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourBeneficiaireUnite(TypeAssociationEXT newAPourBeneficiaireUnite, NotificationChain msgs) {
		TypeAssociationEXT oldAPourBeneficiaireUnite = aPourBeneficiaireUnite;
		aPourBeneficiaireUnite = newAPourBeneficiaireUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITE_LIVRAISON__APOUR_BENEFICIAIRE_UNITE, oldAPourBeneficiaireUnite, newAPourBeneficiaireUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourBeneficiaireUnite(TypeAssociationEXT newAPourBeneficiaireUnite) {
		if (newAPourBeneficiaireUnite != aPourBeneficiaireUnite) {
			NotificationChain msgs = null;
			if (aPourBeneficiaireUnite != null)
				msgs = ((InternalEObject)aPourBeneficiaireUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MODALITE_LIVRAISON__APOUR_BENEFICIAIRE_UNITE, null, msgs);
			if (newAPourBeneficiaireUnite != null)
				msgs = ((InternalEObject)newAPourBeneficiaireUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MODALITE_LIVRAISON__APOUR_BENEFICIAIRE_UNITE, null, msgs);
			msgs = basicSetAPourBeneficiaireUnite(newAPourBeneficiaireUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITE_LIVRAISON__APOUR_BENEFICIAIRE_UNITE, newAPourBeneficiaireUnite, newAPourBeneficiaireUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MODALITE_LIVRAISON__APOUR_BENEFICIAIRE_UNITE:
				return basicSetAPourBeneficiaireUnite(null, msgs);
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
			case SchemaPackage.TYPE_MODALITE_LIVRAISON__DATE_DE_DEBUT:
				return getDateDeDebut();
			case SchemaPackage.TYPE_MODALITE_LIVRAISON__CTE:
				return getCTE();
			case SchemaPackage.TYPE_MODALITE_LIVRAISON__CE:
				return getCE();
			case SchemaPackage.TYPE_MODALITE_LIVRAISON__APOUR_BENEFICIAIRE_UNITE:
				return getAPourBeneficiaireUnite();
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
			case SchemaPackage.TYPE_MODALITE_LIVRAISON__DATE_DE_DEBUT:
				setDateDeDebut((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_MODALITE_LIVRAISON__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_MODALITE_LIVRAISON__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_MODALITE_LIVRAISON__APOUR_BENEFICIAIRE_UNITE:
				setAPourBeneficiaireUnite((TypeAssociationEXT)newValue);
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
			case SchemaPackage.TYPE_MODALITE_LIVRAISON__DATE_DE_DEBUT:
				setDateDeDebut(DATE_DE_DEBUT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MODALITE_LIVRAISON__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MODALITE_LIVRAISON__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MODALITE_LIVRAISON__APOUR_BENEFICIAIRE_UNITE:
				setAPourBeneficiaireUnite((TypeAssociationEXT)null);
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
			case SchemaPackage.TYPE_MODALITE_LIVRAISON__DATE_DE_DEBUT:
				return DATE_DE_DEBUT_EDEFAULT == null ? dateDeDebut != null : !DATE_DE_DEBUT_EDEFAULT.equals(dateDeDebut);
			case SchemaPackage.TYPE_MODALITE_LIVRAISON__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_MODALITE_LIVRAISON__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_MODALITE_LIVRAISON__APOUR_BENEFICIAIRE_UNITE:
				return aPourBeneficiaireUnite != null;
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
		result.append(" (dateDeDebut: ");
		result.append(dateDeDebut);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeModaliteLivraisonImpl
