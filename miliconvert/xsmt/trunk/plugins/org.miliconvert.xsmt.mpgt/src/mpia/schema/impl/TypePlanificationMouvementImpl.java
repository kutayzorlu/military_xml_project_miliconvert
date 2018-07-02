/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeParametresPlanification;
import mpia.schema.TypePlanificationMouvement;

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
 * An implementation of the model object '<em><b>Type Planification Mouvement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypePlanificationMouvementImpl#getIdentifiant <em>Identifiant</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlanificationMouvementImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlanificationMouvementImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlanificationMouvementImpl#getItinerairesItineraire <em>Itineraires Itineraire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlanificationMouvementImpl#getParcoursItineraire <em>Parcours Itineraire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlanificationMouvementImpl#getParametresParametresPlanification <em>Parametres Parametres Planification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypePlanificationMouvementImpl extends EObjectImpl implements TypePlanificationMouvement {
	/**
	 * The default value of the '{@link #getIdentifiant() <em>Identifiant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiant()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIANT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifiant() <em>Identifiant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiant()
	 * @generated
	 * @ordered
	 */
	protected String identifiant = IDENTIFIANT_EDEFAULT;

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
	 * The cached value of the '{@link #getItinerairesItineraire() <em>Itineraires Itineraire</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItinerairesItineraire()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> itinerairesItineraire;

	/**
	 * The cached value of the '{@link #getParcoursItineraire() <em>Parcours Itineraire</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParcoursItineraire()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> parcoursItineraire;

	/**
	 * The cached value of the '{@link #getParametresParametresPlanification() <em>Parametres Parametres Planification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParametresParametresPlanification()
	 * @generated
	 * @ordered
	 */
	protected TypeParametresPlanification parametresParametresPlanification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypePlanificationMouvementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypePlanificationMouvement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentifiant() {
		return identifiant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifiant(String newIdentifiant) {
		String oldIdentifiant = identifiant;
		identifiant = newIdentifiant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PLANIFICATION_MOUVEMENT__IDENTIFIANT, oldIdentifiant, identifiant));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PLANIFICATION_MOUVEMENT__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PLANIFICATION_MOUVEMENT__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getItinerairesItineraire() {
		if (itinerairesItineraire == null) {
			itinerairesItineraire = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_PLANIFICATION_MOUVEMENT__ITINERAIRES_ITINERAIRE);
		}
		return itinerairesItineraire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getParcoursItineraire() {
		if (parcoursItineraire == null) {
			parcoursItineraire = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_PLANIFICATION_MOUVEMENT__PARCOURS_ITINERAIRE);
		}
		return parcoursItineraire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeParametresPlanification getParametresParametresPlanification() {
		return parametresParametresPlanification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParametresParametresPlanification(TypeParametresPlanification newParametresParametresPlanification, NotificationChain msgs) {
		TypeParametresPlanification oldParametresParametresPlanification = parametresParametresPlanification;
		parametresParametresPlanification = newParametresParametresPlanification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PLANIFICATION_MOUVEMENT__PARAMETRES_PARAMETRES_PLANIFICATION, oldParametresParametresPlanification, newParametresParametresPlanification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParametresParametresPlanification(TypeParametresPlanification newParametresParametresPlanification) {
		if (newParametresParametresPlanification != parametresParametresPlanification) {
			NotificationChain msgs = null;
			if (parametresParametresPlanification != null)
				msgs = ((InternalEObject)parametresParametresPlanification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PLANIFICATION_MOUVEMENT__PARAMETRES_PARAMETRES_PLANIFICATION, null, msgs);
			if (newParametresParametresPlanification != null)
				msgs = ((InternalEObject)newParametresParametresPlanification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PLANIFICATION_MOUVEMENT__PARAMETRES_PARAMETRES_PLANIFICATION, null, msgs);
			msgs = basicSetParametresParametresPlanification(newParametresParametresPlanification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PLANIFICATION_MOUVEMENT__PARAMETRES_PARAMETRES_PLANIFICATION, newParametresParametresPlanification, newParametresParametresPlanification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_PLANIFICATION_MOUVEMENT__ITINERAIRES_ITINERAIRE:
				return ((InternalEList<?>)getItinerairesItineraire()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PLANIFICATION_MOUVEMENT__PARCOURS_ITINERAIRE:
				return ((InternalEList<?>)getParcoursItineraire()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PLANIFICATION_MOUVEMENT__PARAMETRES_PARAMETRES_PLANIFICATION:
				return basicSetParametresParametresPlanification(null, msgs);
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
			case SchemaPackage.TYPE_PLANIFICATION_MOUVEMENT__IDENTIFIANT:
				return getIdentifiant();
			case SchemaPackage.TYPE_PLANIFICATION_MOUVEMENT__CTE:
				return getCTE();
			case SchemaPackage.TYPE_PLANIFICATION_MOUVEMENT__CE:
				return getCE();
			case SchemaPackage.TYPE_PLANIFICATION_MOUVEMENT__ITINERAIRES_ITINERAIRE:
				return getItinerairesItineraire();
			case SchemaPackage.TYPE_PLANIFICATION_MOUVEMENT__PARCOURS_ITINERAIRE:
				return getParcoursItineraire();
			case SchemaPackage.TYPE_PLANIFICATION_MOUVEMENT__PARAMETRES_PARAMETRES_PLANIFICATION:
				return getParametresParametresPlanification();
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
			case SchemaPackage.TYPE_PLANIFICATION_MOUVEMENT__IDENTIFIANT:
				setIdentifiant((String)newValue);
				return;
			case SchemaPackage.TYPE_PLANIFICATION_MOUVEMENT__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_PLANIFICATION_MOUVEMENT__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_PLANIFICATION_MOUVEMENT__ITINERAIRES_ITINERAIRE:
				getItinerairesItineraire().clear();
				getItinerairesItineraire().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_PLANIFICATION_MOUVEMENT__PARCOURS_ITINERAIRE:
				getParcoursItineraire().clear();
				getParcoursItineraire().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_PLANIFICATION_MOUVEMENT__PARAMETRES_PARAMETRES_PLANIFICATION:
				setParametresParametresPlanification((TypeParametresPlanification)newValue);
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
			case SchemaPackage.TYPE_PLANIFICATION_MOUVEMENT__IDENTIFIANT:
				setIdentifiant(IDENTIFIANT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PLANIFICATION_MOUVEMENT__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PLANIFICATION_MOUVEMENT__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PLANIFICATION_MOUVEMENT__ITINERAIRES_ITINERAIRE:
				getItinerairesItineraire().clear();
				return;
			case SchemaPackage.TYPE_PLANIFICATION_MOUVEMENT__PARCOURS_ITINERAIRE:
				getParcoursItineraire().clear();
				return;
			case SchemaPackage.TYPE_PLANIFICATION_MOUVEMENT__PARAMETRES_PARAMETRES_PLANIFICATION:
				setParametresParametresPlanification((TypeParametresPlanification)null);
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
			case SchemaPackage.TYPE_PLANIFICATION_MOUVEMENT__IDENTIFIANT:
				return IDENTIFIANT_EDEFAULT == null ? identifiant != null : !IDENTIFIANT_EDEFAULT.equals(identifiant);
			case SchemaPackage.TYPE_PLANIFICATION_MOUVEMENT__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_PLANIFICATION_MOUVEMENT__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_PLANIFICATION_MOUVEMENT__ITINERAIRES_ITINERAIRE:
				return itinerairesItineraire != null && !itinerairesItineraire.isEmpty();
			case SchemaPackage.TYPE_PLANIFICATION_MOUVEMENT__PARCOURS_ITINERAIRE:
				return parcoursItineraire != null && !parcoursItineraire.isEmpty();
			case SchemaPackage.TYPE_PLANIFICATION_MOUVEMENT__PARAMETRES_PARAMETRES_PLANIFICATION:
				return parametresParametresPlanification != null;
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
		result.append(" (identifiant: ");
		result.append(identifiant);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypePlanificationMouvementImpl
