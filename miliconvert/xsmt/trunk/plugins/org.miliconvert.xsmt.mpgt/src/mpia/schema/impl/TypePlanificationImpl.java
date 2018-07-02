/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeJalon;
import mpia.schema.TypePlanification;
import mpia.schema.TypeTache;

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
 * An implementation of the model object '<em><b>Type Planification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypePlanificationImpl#getDateDescription <em>Date Description</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlanificationImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlanificationImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlanificationImpl#getDefinieJalon <em>Definie Jalon</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlanificationImpl#getDefinieTache <em>Definie Tache</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypePlanificationImpl extends EObjectImpl implements TypePlanification {
	/**
	 * The default value of the '{@link #getDateDescription() <em>Date Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDescription()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateDescription() <em>Date Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDescription()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateDescription = DATE_DESCRIPTION_EDEFAULT;

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
	 * The cached value of the '{@link #getDefinieJalon() <em>Definie Jalon</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinieJalon()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeJalon> definieJalon;

	/**
	 * The cached value of the '{@link #getDefinieTache() <em>Definie Tache</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinieTache()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeTache> definieTache;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypePlanificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypePlanification();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateDescription() {
		return dateDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateDescription(XMLGregorianCalendar newDateDescription) {
		XMLGregorianCalendar oldDateDescription = dateDescription;
		dateDescription = newDateDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PLANIFICATION__DATE_DESCRIPTION, oldDateDescription, dateDescription));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PLANIFICATION__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PLANIFICATION__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeJalon> getDefinieJalon() {
		if (definieJalon == null) {
			definieJalon = new EObjectContainmentEList<TypeJalon>(TypeJalon.class, this, SchemaPackage.TYPE_PLANIFICATION__DEFINIE_JALON);
		}
		return definieJalon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeTache> getDefinieTache() {
		if (definieTache == null) {
			definieTache = new EObjectContainmentEList<TypeTache>(TypeTache.class, this, SchemaPackage.TYPE_PLANIFICATION__DEFINIE_TACHE);
		}
		return definieTache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_PLANIFICATION__DEFINIE_JALON:
				return ((InternalEList<?>)getDefinieJalon()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PLANIFICATION__DEFINIE_TACHE:
				return ((InternalEList<?>)getDefinieTache()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_PLANIFICATION__DATE_DESCRIPTION:
				return getDateDescription();
			case SchemaPackage.TYPE_PLANIFICATION__CTE:
				return getCTE();
			case SchemaPackage.TYPE_PLANIFICATION__CE:
				return getCE();
			case SchemaPackage.TYPE_PLANIFICATION__DEFINIE_JALON:
				return getDefinieJalon();
			case SchemaPackage.TYPE_PLANIFICATION__DEFINIE_TACHE:
				return getDefinieTache();
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
			case SchemaPackage.TYPE_PLANIFICATION__DATE_DESCRIPTION:
				setDateDescription((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_PLANIFICATION__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_PLANIFICATION__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_PLANIFICATION__DEFINIE_JALON:
				getDefinieJalon().clear();
				getDefinieJalon().addAll((Collection<? extends TypeJalon>)newValue);
				return;
			case SchemaPackage.TYPE_PLANIFICATION__DEFINIE_TACHE:
				getDefinieTache().clear();
				getDefinieTache().addAll((Collection<? extends TypeTache>)newValue);
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
			case SchemaPackage.TYPE_PLANIFICATION__DATE_DESCRIPTION:
				setDateDescription(DATE_DESCRIPTION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PLANIFICATION__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PLANIFICATION__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PLANIFICATION__DEFINIE_JALON:
				getDefinieJalon().clear();
				return;
			case SchemaPackage.TYPE_PLANIFICATION__DEFINIE_TACHE:
				getDefinieTache().clear();
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
			case SchemaPackage.TYPE_PLANIFICATION__DATE_DESCRIPTION:
				return DATE_DESCRIPTION_EDEFAULT == null ? dateDescription != null : !DATE_DESCRIPTION_EDEFAULT.equals(dateDescription);
			case SchemaPackage.TYPE_PLANIFICATION__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_PLANIFICATION__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_PLANIFICATION__DEFINIE_JALON:
				return definieJalon != null && !definieJalon.isEmpty();
			case SchemaPackage.TYPE_PLANIFICATION__DEFINIE_TACHE:
				return definieTache != null && !definieTache.isEmpty();
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
		result.append(" (dateDescription: ");
		result.append(dateDescription);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypePlanificationImpl
