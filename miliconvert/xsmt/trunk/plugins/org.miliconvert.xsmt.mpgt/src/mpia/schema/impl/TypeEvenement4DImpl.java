/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeEvenement4D;
import mpia.schema.TypeLocalisation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Evenement4 D</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEvenement4DImpl#getGDH <em>GDH</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvenement4DImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvenement4DImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvenement4DImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEvenement4DImpl#getLocalisationLocalisation <em>Localisation Localisation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeEvenement4DImpl extends EObjectImpl implements TypeEvenement4D {
	/**
	 * The default value of the '{@link #getGDH() <em>GDH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDH()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GDH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGDH() <em>GDH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDH()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gDH = GDH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

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
	 * The cached value of the '{@link #getLocalisationLocalisation() <em>Localisation Localisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalisationLocalisation()
	 * @generated
	 * @ordered
	 */
	protected TypeLocalisation localisationLocalisation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeEvenement4DImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEvenement4D();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getGDH() {
		return gDH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGDH(XMLGregorianCalendar newGDH) {
		XMLGregorianCalendar oldGDH = gDH;
		gDH = newGDH;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVENEMENT4_D__GDH, oldGDH, gDH));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVENEMENT4_D__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVENEMENT4_D__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVENEMENT4_D__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeLocalisation getLocalisationLocalisation() {
		return localisationLocalisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalisationLocalisation(TypeLocalisation newLocalisationLocalisation, NotificationChain msgs) {
		TypeLocalisation oldLocalisationLocalisation = localisationLocalisation;
		localisationLocalisation = newLocalisationLocalisation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVENEMENT4_D__LOCALISATION_LOCALISATION, oldLocalisationLocalisation, newLocalisationLocalisation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalisationLocalisation(TypeLocalisation newLocalisationLocalisation) {
		if (newLocalisationLocalisation != localisationLocalisation) {
			NotificationChain msgs = null;
			if (localisationLocalisation != null)
				msgs = ((InternalEObject)localisationLocalisation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EVENEMENT4_D__LOCALISATION_LOCALISATION, null, msgs);
			if (newLocalisationLocalisation != null)
				msgs = ((InternalEObject)newLocalisationLocalisation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EVENEMENT4_D__LOCALISATION_LOCALISATION, null, msgs);
			msgs = basicSetLocalisationLocalisation(newLocalisationLocalisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EVENEMENT4_D__LOCALISATION_LOCALISATION, newLocalisationLocalisation, newLocalisationLocalisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_EVENEMENT4_D__LOCALISATION_LOCALISATION:
				return basicSetLocalisationLocalisation(null, msgs);
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
			case SchemaPackage.TYPE_EVENEMENT4_D__GDH:
				return getGDH();
			case SchemaPackage.TYPE_EVENEMENT4_D__DESCRIPTION:
				return getDescription();
			case SchemaPackage.TYPE_EVENEMENT4_D__CTE:
				return getCTE();
			case SchemaPackage.TYPE_EVENEMENT4_D__CE:
				return getCE();
			case SchemaPackage.TYPE_EVENEMENT4_D__LOCALISATION_LOCALISATION:
				return getLocalisationLocalisation();
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
			case SchemaPackage.TYPE_EVENEMENT4_D__GDH:
				setGDH((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_EVENEMENT4_D__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SchemaPackage.TYPE_EVENEMENT4_D__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_EVENEMENT4_D__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_EVENEMENT4_D__LOCALISATION_LOCALISATION:
				setLocalisationLocalisation((TypeLocalisation)newValue);
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
			case SchemaPackage.TYPE_EVENEMENT4_D__GDH:
				setGDH(GDH_EDEFAULT);
				return;
			case SchemaPackage.TYPE_EVENEMENT4_D__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_EVENEMENT4_D__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_EVENEMENT4_D__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_EVENEMENT4_D__LOCALISATION_LOCALISATION:
				setLocalisationLocalisation((TypeLocalisation)null);
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
			case SchemaPackage.TYPE_EVENEMENT4_D__GDH:
				return GDH_EDEFAULT == null ? gDH != null : !GDH_EDEFAULT.equals(gDH);
			case SchemaPackage.TYPE_EVENEMENT4_D__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SchemaPackage.TYPE_EVENEMENT4_D__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_EVENEMENT4_D__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_EVENEMENT4_D__LOCALISATION_LOCALISATION:
				return localisationLocalisation != null;
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
		result.append(" (gDH: ");
		result.append(gDH);
		result.append(", description: ");
		result.append(description);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeEvenement4DImpl
