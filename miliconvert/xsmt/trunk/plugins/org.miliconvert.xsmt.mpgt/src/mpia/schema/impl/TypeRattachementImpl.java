/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeRattachement;

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
 * An implementation of the model object '<em><b>Type Rattachement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeRattachementImpl#getDateDeDebut <em>Date De Debut</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRattachementImpl#getDateDeFin <em>Date De Fin</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRattachementImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRattachementImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRattachementImpl#getDefinitPourHoraireManoeuvre <em>Definit Pour Horaire Manoeuvre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRattachementImpl#getAPourUniteRattachementUnite <em>APour Unite Rattachement Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRattachementImpl#getAPourUniteConcerneUnite <em>APour Unite Concerne Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeRattachementImpl extends EObjectImpl implements TypeRattachement {
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
	 * The default value of the '{@link #getDateDeFin() <em>Date De Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDeFin()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_DE_FIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateDeFin() <em>Date De Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDeFin()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateDeFin = DATE_DE_FIN_EDEFAULT;

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
	 * The cached value of the '{@link #getDefinitPourHoraireManoeuvre() <em>Definit Pour Horaire Manoeuvre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitPourHoraireManoeuvre()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation definitPourHoraireManoeuvre;

	/**
	 * The cached value of the '{@link #getAPourUniteRattachementUnite() <em>APour Unite Rattachement Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourUniteRattachementUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aPourUniteRattachementUnite;

	/**
	 * The cached value of the '{@link #getAPourUniteConcerneUnite() <em>APour Unite Concerne Unite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourUniteConcerneUnite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociationEXT> aPourUniteConcerneUnite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeRattachementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeRattachement();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RATTACHEMENT__DATE_DE_DEBUT, oldDateDeDebut, dateDeDebut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateDeFin() {
		return dateDeFin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateDeFin(XMLGregorianCalendar newDateDeFin) {
		XMLGregorianCalendar oldDateDeFin = dateDeFin;
		dateDeFin = newDateDeFin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RATTACHEMENT__DATE_DE_FIN, oldDateDeFin, dateDeFin));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RATTACHEMENT__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RATTACHEMENT__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getDefinitPourHoraireManoeuvre() {
		return definitPourHoraireManoeuvre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinitPourHoraireManoeuvre(TypeAssociation newDefinitPourHoraireManoeuvre, NotificationChain msgs) {
		TypeAssociation oldDefinitPourHoraireManoeuvre = definitPourHoraireManoeuvre;
		definitPourHoraireManoeuvre = newDefinitPourHoraireManoeuvre;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RATTACHEMENT__DEFINIT_POUR_HORAIRE_MANOEUVRE, oldDefinitPourHoraireManoeuvre, newDefinitPourHoraireManoeuvre);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinitPourHoraireManoeuvre(TypeAssociation newDefinitPourHoraireManoeuvre) {
		if (newDefinitPourHoraireManoeuvre != definitPourHoraireManoeuvre) {
			NotificationChain msgs = null;
			if (definitPourHoraireManoeuvre != null)
				msgs = ((InternalEObject)definitPourHoraireManoeuvre).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RATTACHEMENT__DEFINIT_POUR_HORAIRE_MANOEUVRE, null, msgs);
			if (newDefinitPourHoraireManoeuvre != null)
				msgs = ((InternalEObject)newDefinitPourHoraireManoeuvre).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RATTACHEMENT__DEFINIT_POUR_HORAIRE_MANOEUVRE, null, msgs);
			msgs = basicSetDefinitPourHoraireManoeuvre(newDefinitPourHoraireManoeuvre, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RATTACHEMENT__DEFINIT_POUR_HORAIRE_MANOEUVRE, newDefinitPourHoraireManoeuvre, newDefinitPourHoraireManoeuvre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAPourUniteRattachementUnite() {
		return aPourUniteRattachementUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourUniteRattachementUnite(TypeAssociationEXT newAPourUniteRattachementUnite, NotificationChain msgs) {
		TypeAssociationEXT oldAPourUniteRattachementUnite = aPourUniteRattachementUnite;
		aPourUniteRattachementUnite = newAPourUniteRattachementUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RATTACHEMENT__APOUR_UNITE_RATTACHEMENT_UNITE, oldAPourUniteRattachementUnite, newAPourUniteRattachementUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourUniteRattachementUnite(TypeAssociationEXT newAPourUniteRattachementUnite) {
		if (newAPourUniteRattachementUnite != aPourUniteRattachementUnite) {
			NotificationChain msgs = null;
			if (aPourUniteRattachementUnite != null)
				msgs = ((InternalEObject)aPourUniteRattachementUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RATTACHEMENT__APOUR_UNITE_RATTACHEMENT_UNITE, null, msgs);
			if (newAPourUniteRattachementUnite != null)
				msgs = ((InternalEObject)newAPourUniteRattachementUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RATTACHEMENT__APOUR_UNITE_RATTACHEMENT_UNITE, null, msgs);
			msgs = basicSetAPourUniteRattachementUnite(newAPourUniteRattachementUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RATTACHEMENT__APOUR_UNITE_RATTACHEMENT_UNITE, newAPourUniteRattachementUnite, newAPourUniteRattachementUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEXT> getAPourUniteConcerneUnite() {
		if (aPourUniteConcerneUnite == null) {
			aPourUniteConcerneUnite = new EObjectContainmentEList<TypeAssociationEXT>(TypeAssociationEXT.class, this, SchemaPackage.TYPE_RATTACHEMENT__APOUR_UNITE_CONCERNE_UNITE);
		}
		return aPourUniteConcerneUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_RATTACHEMENT__DEFINIT_POUR_HORAIRE_MANOEUVRE:
				return basicSetDefinitPourHoraireManoeuvre(null, msgs);
			case SchemaPackage.TYPE_RATTACHEMENT__APOUR_UNITE_RATTACHEMENT_UNITE:
				return basicSetAPourUniteRattachementUnite(null, msgs);
			case SchemaPackage.TYPE_RATTACHEMENT__APOUR_UNITE_CONCERNE_UNITE:
				return ((InternalEList<?>)getAPourUniteConcerneUnite()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_RATTACHEMENT__DATE_DE_DEBUT:
				return getDateDeDebut();
			case SchemaPackage.TYPE_RATTACHEMENT__DATE_DE_FIN:
				return getDateDeFin();
			case SchemaPackage.TYPE_RATTACHEMENT__CTE:
				return getCTE();
			case SchemaPackage.TYPE_RATTACHEMENT__CE:
				return getCE();
			case SchemaPackage.TYPE_RATTACHEMENT__DEFINIT_POUR_HORAIRE_MANOEUVRE:
				return getDefinitPourHoraireManoeuvre();
			case SchemaPackage.TYPE_RATTACHEMENT__APOUR_UNITE_RATTACHEMENT_UNITE:
				return getAPourUniteRattachementUnite();
			case SchemaPackage.TYPE_RATTACHEMENT__APOUR_UNITE_CONCERNE_UNITE:
				return getAPourUniteConcerneUnite();
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
			case SchemaPackage.TYPE_RATTACHEMENT__DATE_DE_DEBUT:
				setDateDeDebut((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_RATTACHEMENT__DATE_DE_FIN:
				setDateDeFin((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_RATTACHEMENT__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_RATTACHEMENT__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_RATTACHEMENT__DEFINIT_POUR_HORAIRE_MANOEUVRE:
				setDefinitPourHoraireManoeuvre((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_RATTACHEMENT__APOUR_UNITE_RATTACHEMENT_UNITE:
				setAPourUniteRattachementUnite((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_RATTACHEMENT__APOUR_UNITE_CONCERNE_UNITE:
				getAPourUniteConcerneUnite().clear();
				getAPourUniteConcerneUnite().addAll((Collection<? extends TypeAssociationEXT>)newValue);
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
			case SchemaPackage.TYPE_RATTACHEMENT__DATE_DE_DEBUT:
				setDateDeDebut(DATE_DE_DEBUT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RATTACHEMENT__DATE_DE_FIN:
				setDateDeFin(DATE_DE_FIN_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RATTACHEMENT__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RATTACHEMENT__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RATTACHEMENT__DEFINIT_POUR_HORAIRE_MANOEUVRE:
				setDefinitPourHoraireManoeuvre((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_RATTACHEMENT__APOUR_UNITE_RATTACHEMENT_UNITE:
				setAPourUniteRattachementUnite((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_RATTACHEMENT__APOUR_UNITE_CONCERNE_UNITE:
				getAPourUniteConcerneUnite().clear();
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
			case SchemaPackage.TYPE_RATTACHEMENT__DATE_DE_DEBUT:
				return DATE_DE_DEBUT_EDEFAULT == null ? dateDeDebut != null : !DATE_DE_DEBUT_EDEFAULT.equals(dateDeDebut);
			case SchemaPackage.TYPE_RATTACHEMENT__DATE_DE_FIN:
				return DATE_DE_FIN_EDEFAULT == null ? dateDeFin != null : !DATE_DE_FIN_EDEFAULT.equals(dateDeFin);
			case SchemaPackage.TYPE_RATTACHEMENT__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_RATTACHEMENT__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_RATTACHEMENT__DEFINIT_POUR_HORAIRE_MANOEUVRE:
				return definitPourHoraireManoeuvre != null;
			case SchemaPackage.TYPE_RATTACHEMENT__APOUR_UNITE_RATTACHEMENT_UNITE:
				return aPourUniteRattachementUnite != null;
			case SchemaPackage.TYPE_RATTACHEMENT__APOUR_UNITE_CONCERNE_UNITE:
				return aPourUniteConcerneUnite != null && !aPourUniteConcerneUnite.isEmpty();
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
		result.append(", dateDeFin: ");
		result.append(dateDeFin);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeRattachementImpl
