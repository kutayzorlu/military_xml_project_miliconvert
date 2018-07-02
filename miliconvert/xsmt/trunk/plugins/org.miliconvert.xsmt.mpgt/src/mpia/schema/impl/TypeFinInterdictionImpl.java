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

import mpia.schema.SchemaPackage;
import mpia.schema.TypeFinInterdiction;

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
 * An implementation of the model object '<em><b>Type Fin Interdiction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeFinInterdictionImpl#getHeureFinInterdiction <em>Heure Fin Interdiction</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeFinInterdictionImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeFinInterdictionImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeFinInterdictionImpl#getConcerneMesureCoordination <em>Concerne Mesure Coordination</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeFinInterdictionImpl#getConcerneConsigne <em>Concerne Consigne</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeFinInterdictionImpl extends EObjectImpl implements TypeFinInterdiction {
	/**
	 * The default value of the '{@link #getHeureFinInterdiction() <em>Heure Fin Interdiction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeureFinInterdiction()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar HEURE_FIN_INTERDICTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeureFinInterdiction() <em>Heure Fin Interdiction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeureFinInterdiction()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar heureFinInterdiction = HEURE_FIN_INTERDICTION_EDEFAULT;

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
	 * The cached value of the '{@link #getConcerneMesureCoordination() <em>Concerne Mesure Coordination</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneMesureCoordination()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> concerneMesureCoordination;

	/**
	 * The cached value of the '{@link #getConcerneConsigne() <em>Concerne Consigne</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneConsigne()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> concerneConsigne;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeFinInterdictionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeFinInterdiction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getHeureFinInterdiction() {
		return heureFinInterdiction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeureFinInterdiction(XMLGregorianCalendar newHeureFinInterdiction) {
		XMLGregorianCalendar oldHeureFinInterdiction = heureFinInterdiction;
		heureFinInterdiction = newHeureFinInterdiction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_FIN_INTERDICTION__HEURE_FIN_INTERDICTION, oldHeureFinInterdiction, heureFinInterdiction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_FIN_INTERDICTION__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_FIN_INTERDICTION__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getConcerneMesureCoordination() {
		if (concerneMesureCoordination == null) {
			concerneMesureCoordination = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_FIN_INTERDICTION__CONCERNE_MESURE_COORDINATION);
		}
		return concerneMesureCoordination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getConcerneConsigne() {
		if (concerneConsigne == null) {
			concerneConsigne = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_FIN_INTERDICTION__CONCERNE_CONSIGNE);
		}
		return concerneConsigne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_FIN_INTERDICTION__CONCERNE_MESURE_COORDINATION:
				return ((InternalEList<?>)getConcerneMesureCoordination()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_FIN_INTERDICTION__CONCERNE_CONSIGNE:
				return ((InternalEList<?>)getConcerneConsigne()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_FIN_INTERDICTION__HEURE_FIN_INTERDICTION:
				return getHeureFinInterdiction();
			case SchemaPackage.TYPE_FIN_INTERDICTION__CTE:
				return getCTE();
			case SchemaPackage.TYPE_FIN_INTERDICTION__CE:
				return getCE();
			case SchemaPackage.TYPE_FIN_INTERDICTION__CONCERNE_MESURE_COORDINATION:
				return getConcerneMesureCoordination();
			case SchemaPackage.TYPE_FIN_INTERDICTION__CONCERNE_CONSIGNE:
				return getConcerneConsigne();
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
			case SchemaPackage.TYPE_FIN_INTERDICTION__HEURE_FIN_INTERDICTION:
				setHeureFinInterdiction((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_FIN_INTERDICTION__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_FIN_INTERDICTION__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_FIN_INTERDICTION__CONCERNE_MESURE_COORDINATION:
				getConcerneMesureCoordination().clear();
				getConcerneMesureCoordination().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_FIN_INTERDICTION__CONCERNE_CONSIGNE:
				getConcerneConsigne().clear();
				getConcerneConsigne().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_FIN_INTERDICTION__HEURE_FIN_INTERDICTION:
				setHeureFinInterdiction(HEURE_FIN_INTERDICTION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_FIN_INTERDICTION__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_FIN_INTERDICTION__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_FIN_INTERDICTION__CONCERNE_MESURE_COORDINATION:
				getConcerneMesureCoordination().clear();
				return;
			case SchemaPackage.TYPE_FIN_INTERDICTION__CONCERNE_CONSIGNE:
				getConcerneConsigne().clear();
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
			case SchemaPackage.TYPE_FIN_INTERDICTION__HEURE_FIN_INTERDICTION:
				return HEURE_FIN_INTERDICTION_EDEFAULT == null ? heureFinInterdiction != null : !HEURE_FIN_INTERDICTION_EDEFAULT.equals(heureFinInterdiction);
			case SchemaPackage.TYPE_FIN_INTERDICTION__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_FIN_INTERDICTION__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_FIN_INTERDICTION__CONCERNE_MESURE_COORDINATION:
				return concerneMesureCoordination != null && !concerneMesureCoordination.isEmpty();
			case SchemaPackage.TYPE_FIN_INTERDICTION__CONCERNE_CONSIGNE:
				return concerneConsigne != null && !concerneConsigne.isEmpty();
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
		result.append(" (heureFinInterdiction: ");
		result.append(heureFinInterdiction);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeFinInterdictionImpl
