/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDotationTheoriqueInstanceObjet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Dotation Theorique Instance Objet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeDotationTheoriqueInstanceObjetImpl#getDateAffectation <em>Date Affectation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDotationTheoriqueInstanceObjetImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDotationTheoriqueInstanceObjetImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDotationTheoriqueInstanceObjetImpl#getAssocieCommeDotationDotationTheorique <em>Associe Comme Dotation Dotation Theorique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDotationTheoriqueInstanceObjetImpl#getEstDotationTheoriqueInstanceObjet <em>Est Dotation Theorique Instance Objet</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeDotationTheoriqueInstanceObjetImpl extends EObjectImpl implements TypeDotationTheoriqueInstanceObjet {
	/**
	 * The default value of the '{@link #getDateAffectation() <em>Date Affectation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateAffectation()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_AFFECTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateAffectation() <em>Date Affectation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateAffectation()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateAffectation = DATE_AFFECTATION_EDEFAULT;

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
	 * The cached value of the '{@link #getAssocieCommeDotationDotationTheorique() <em>Associe Comme Dotation Dotation Theorique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeDotationDotationTheorique()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeDotationDotationTheorique;

	/**
	 * The cached value of the '{@link #getEstDotationTheoriqueInstanceObjet() <em>Est Dotation Theorique Instance Objet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstDotationTheoriqueInstanceObjet()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation estDotationTheoriqueInstanceObjet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeDotationTheoriqueInstanceObjetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeDotationTheoriqueInstanceObjet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateAffectation() {
		return dateAffectation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateAffectation(XMLGregorianCalendar newDateAffectation) {
		XMLGregorianCalendar oldDateAffectation = dateAffectation;
		dateAffectation = newDateAffectation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOTATION_THEORIQUE_INSTANCE_OBJET__DATE_AFFECTATION, oldDateAffectation, dateAffectation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOTATION_THEORIQUE_INSTANCE_OBJET__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOTATION_THEORIQUE_INSTANCE_OBJET__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAssocieCommeDotationDotationTheorique() {
		return associeCommeDotationDotationTheorique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeDotationDotationTheorique(TypeAssociation newAssocieCommeDotationDotationTheorique, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeDotationDotationTheorique = associeCommeDotationDotationTheorique;
		associeCommeDotationDotationTheorique = newAssocieCommeDotationDotationTheorique;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOTATION_THEORIQUE_INSTANCE_OBJET__ASSOCIE_COMME_DOTATION_DOTATION_THEORIQUE, oldAssocieCommeDotationDotationTheorique, newAssocieCommeDotationDotationTheorique);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeDotationDotationTheorique(TypeAssociation newAssocieCommeDotationDotationTheorique) {
		if (newAssocieCommeDotationDotationTheorique != associeCommeDotationDotationTheorique) {
			NotificationChain msgs = null;
			if (associeCommeDotationDotationTheorique != null)
				msgs = ((InternalEObject)associeCommeDotationDotationTheorique).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DOTATION_THEORIQUE_INSTANCE_OBJET__ASSOCIE_COMME_DOTATION_DOTATION_THEORIQUE, null, msgs);
			if (newAssocieCommeDotationDotationTheorique != null)
				msgs = ((InternalEObject)newAssocieCommeDotationDotationTheorique).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DOTATION_THEORIQUE_INSTANCE_OBJET__ASSOCIE_COMME_DOTATION_DOTATION_THEORIQUE, null, msgs);
			msgs = basicSetAssocieCommeDotationDotationTheorique(newAssocieCommeDotationDotationTheorique, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOTATION_THEORIQUE_INSTANCE_OBJET__ASSOCIE_COMME_DOTATION_DOTATION_THEORIQUE, newAssocieCommeDotationDotationTheorique, newAssocieCommeDotationDotationTheorique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getEstDotationTheoriqueInstanceObjet() {
		return estDotationTheoriqueInstanceObjet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstDotationTheoriqueInstanceObjet(TypeAssociation newEstDotationTheoriqueInstanceObjet, NotificationChain msgs) {
		TypeAssociation oldEstDotationTheoriqueInstanceObjet = estDotationTheoriqueInstanceObjet;
		estDotationTheoriqueInstanceObjet = newEstDotationTheoriqueInstanceObjet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOTATION_THEORIQUE_INSTANCE_OBJET__EST_DOTATION_THEORIQUE_INSTANCE_OBJET, oldEstDotationTheoriqueInstanceObjet, newEstDotationTheoriqueInstanceObjet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstDotationTheoriqueInstanceObjet(TypeAssociation newEstDotationTheoriqueInstanceObjet) {
		if (newEstDotationTheoriqueInstanceObjet != estDotationTheoriqueInstanceObjet) {
			NotificationChain msgs = null;
			if (estDotationTheoriqueInstanceObjet != null)
				msgs = ((InternalEObject)estDotationTheoriqueInstanceObjet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DOTATION_THEORIQUE_INSTANCE_OBJET__EST_DOTATION_THEORIQUE_INSTANCE_OBJET, null, msgs);
			if (newEstDotationTheoriqueInstanceObjet != null)
				msgs = ((InternalEObject)newEstDotationTheoriqueInstanceObjet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DOTATION_THEORIQUE_INSTANCE_OBJET__EST_DOTATION_THEORIQUE_INSTANCE_OBJET, null, msgs);
			msgs = basicSetEstDotationTheoriqueInstanceObjet(newEstDotationTheoriqueInstanceObjet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOTATION_THEORIQUE_INSTANCE_OBJET__EST_DOTATION_THEORIQUE_INSTANCE_OBJET, newEstDotationTheoriqueInstanceObjet, newEstDotationTheoriqueInstanceObjet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_DOTATION_THEORIQUE_INSTANCE_OBJET__ASSOCIE_COMME_DOTATION_DOTATION_THEORIQUE:
				return basicSetAssocieCommeDotationDotationTheorique(null, msgs);
			case SchemaPackage.TYPE_DOTATION_THEORIQUE_INSTANCE_OBJET__EST_DOTATION_THEORIQUE_INSTANCE_OBJET:
				return basicSetEstDotationTheoriqueInstanceObjet(null, msgs);
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
			case SchemaPackage.TYPE_DOTATION_THEORIQUE_INSTANCE_OBJET__DATE_AFFECTATION:
				return getDateAffectation();
			case SchemaPackage.TYPE_DOTATION_THEORIQUE_INSTANCE_OBJET__CTE:
				return getCTE();
			case SchemaPackage.TYPE_DOTATION_THEORIQUE_INSTANCE_OBJET__CE:
				return getCE();
			case SchemaPackage.TYPE_DOTATION_THEORIQUE_INSTANCE_OBJET__ASSOCIE_COMME_DOTATION_DOTATION_THEORIQUE:
				return getAssocieCommeDotationDotationTheorique();
			case SchemaPackage.TYPE_DOTATION_THEORIQUE_INSTANCE_OBJET__EST_DOTATION_THEORIQUE_INSTANCE_OBJET:
				return getEstDotationTheoriqueInstanceObjet();
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
			case SchemaPackage.TYPE_DOTATION_THEORIQUE_INSTANCE_OBJET__DATE_AFFECTATION:
				setDateAffectation((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_DOTATION_THEORIQUE_INSTANCE_OBJET__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_DOTATION_THEORIQUE_INSTANCE_OBJET__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_DOTATION_THEORIQUE_INSTANCE_OBJET__ASSOCIE_COMME_DOTATION_DOTATION_THEORIQUE:
				setAssocieCommeDotationDotationTheorique((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_DOTATION_THEORIQUE_INSTANCE_OBJET__EST_DOTATION_THEORIQUE_INSTANCE_OBJET:
				setEstDotationTheoriqueInstanceObjet((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_DOTATION_THEORIQUE_INSTANCE_OBJET__DATE_AFFECTATION:
				setDateAffectation(DATE_AFFECTATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DOTATION_THEORIQUE_INSTANCE_OBJET__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DOTATION_THEORIQUE_INSTANCE_OBJET__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DOTATION_THEORIQUE_INSTANCE_OBJET__ASSOCIE_COMME_DOTATION_DOTATION_THEORIQUE:
				setAssocieCommeDotationDotationTheorique((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_DOTATION_THEORIQUE_INSTANCE_OBJET__EST_DOTATION_THEORIQUE_INSTANCE_OBJET:
				setEstDotationTheoriqueInstanceObjet((TypeAssociation)null);
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
			case SchemaPackage.TYPE_DOTATION_THEORIQUE_INSTANCE_OBJET__DATE_AFFECTATION:
				return DATE_AFFECTATION_EDEFAULT == null ? dateAffectation != null : !DATE_AFFECTATION_EDEFAULT.equals(dateAffectation);
			case SchemaPackage.TYPE_DOTATION_THEORIQUE_INSTANCE_OBJET__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_DOTATION_THEORIQUE_INSTANCE_OBJET__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_DOTATION_THEORIQUE_INSTANCE_OBJET__ASSOCIE_COMME_DOTATION_DOTATION_THEORIQUE:
				return associeCommeDotationDotationTheorique != null;
			case SchemaPackage.TYPE_DOTATION_THEORIQUE_INSTANCE_OBJET__EST_DOTATION_THEORIQUE_INSTANCE_OBJET:
				return estDotationTheoriqueInstanceObjet != null;
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
		result.append(" (dateAffectation: ");
		result.append(dateAffectation);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeDotationTheoriqueInstanceObjetImpl
