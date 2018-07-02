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
import mpia.schema.TypeSituationVehicule;

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
 * An implementation of the model object '<em><b>Type Situation Vehicule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeSituationVehiculeImpl#getDateSituation <em>Date Situation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSituationVehiculeImpl#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSituationVehiculeImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSituationVehiculeImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSituationVehiculeImpl#getConcerneVehicule <em>Concerne Vehicule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeSituationVehiculeImpl extends EObjectImpl implements TypeSituationVehicule {
	/**
	 * The default value of the '{@link #getDateSituation() <em>Date Situation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateSituation()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_SITUATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateSituation() <em>Date Situation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateSituation()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateSituation = DATE_SITUATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommentaire() <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaire()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTAIRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommentaire() <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaire()
	 * @generated
	 * @ordered
	 */
	protected String commentaire = COMMENTAIRE_EDEFAULT;

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
	 * The cached value of the '{@link #getConcerneVehicule() <em>Concerne Vehicule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneVehicule()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> concerneVehicule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeSituationVehiculeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeSituationVehicule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateSituation() {
		return dateSituation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateSituation(XMLGregorianCalendar newDateSituation) {
		XMLGregorianCalendar oldDateSituation = dateSituation;
		dateSituation = newDateSituation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITUATION_VEHICULE__DATE_SITUATION, oldDateSituation, dateSituation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommentaire() {
		return commentaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommentaire(String newCommentaire) {
		String oldCommentaire = commentaire;
		commentaire = newCommentaire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITUATION_VEHICULE__COMMENTAIRE, oldCommentaire, commentaire));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITUATION_VEHICULE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITUATION_VEHICULE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getConcerneVehicule() {
		if (concerneVehicule == null) {
			concerneVehicule = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_SITUATION_VEHICULE__CONCERNE_VEHICULE);
		}
		return concerneVehicule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_SITUATION_VEHICULE__CONCERNE_VEHICULE:
				return ((InternalEList<?>)getConcerneVehicule()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_SITUATION_VEHICULE__DATE_SITUATION:
				return getDateSituation();
			case SchemaPackage.TYPE_SITUATION_VEHICULE__COMMENTAIRE:
				return getCommentaire();
			case SchemaPackage.TYPE_SITUATION_VEHICULE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_SITUATION_VEHICULE__CE:
				return getCE();
			case SchemaPackage.TYPE_SITUATION_VEHICULE__CONCERNE_VEHICULE:
				return getConcerneVehicule();
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
			case SchemaPackage.TYPE_SITUATION_VEHICULE__DATE_SITUATION:
				setDateSituation((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_SITUATION_VEHICULE__COMMENTAIRE:
				setCommentaire((String)newValue);
				return;
			case SchemaPackage.TYPE_SITUATION_VEHICULE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_SITUATION_VEHICULE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_SITUATION_VEHICULE__CONCERNE_VEHICULE:
				getConcerneVehicule().clear();
				getConcerneVehicule().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_SITUATION_VEHICULE__DATE_SITUATION:
				setDateSituation(DATE_SITUATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SITUATION_VEHICULE__COMMENTAIRE:
				setCommentaire(COMMENTAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SITUATION_VEHICULE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SITUATION_VEHICULE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SITUATION_VEHICULE__CONCERNE_VEHICULE:
				getConcerneVehicule().clear();
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
			case SchemaPackage.TYPE_SITUATION_VEHICULE__DATE_SITUATION:
				return DATE_SITUATION_EDEFAULT == null ? dateSituation != null : !DATE_SITUATION_EDEFAULT.equals(dateSituation);
			case SchemaPackage.TYPE_SITUATION_VEHICULE__COMMENTAIRE:
				return COMMENTAIRE_EDEFAULT == null ? commentaire != null : !COMMENTAIRE_EDEFAULT.equals(commentaire);
			case SchemaPackage.TYPE_SITUATION_VEHICULE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_SITUATION_VEHICULE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_SITUATION_VEHICULE__CONCERNE_VEHICULE:
				return concerneVehicule != null && !concerneVehicule.isEmpty();
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
		result.append(" (dateSituation: ");
		result.append(dateSituation);
		result.append(", commentaire: ");
		result.append(commentaire);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeSituationVehiculeImpl