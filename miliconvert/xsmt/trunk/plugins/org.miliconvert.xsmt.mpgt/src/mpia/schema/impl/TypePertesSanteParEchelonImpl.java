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
import mpia.schema.TypeDictionaryDicoEchelonEchelon;
import mpia.schema.TypePertesSanteParEchelon;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Pertes Sante Par Echelon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypePertesSanteParEchelonImpl#getEchelon <em>Echelon</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePertesSanteParEchelonImpl#getEstimationPertes <em>Estimation Pertes</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePertesSanteParEchelonImpl#getDebutCreneau <em>Debut Creneau</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePertesSanteParEchelonImpl#getFinCreneau <em>Fin Creneau</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePertesSanteParEchelonImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePertesSanteParEchelonImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePertesSanteParEchelonImpl#getVautPendantHoraireManoeuvre <em>Vaut Pendant Horaire Manoeuvre</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypePertesSanteParEchelonImpl extends EObjectImpl implements TypePertesSanteParEchelon {
	/**
	 * The default value of the '{@link #getEchelon() <em>Echelon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEchelon()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEchelonEchelon ECHELON_EDEFAULT = TypeDictionaryDicoEchelonEchelon._1ECH;

	/**
	 * The cached value of the '{@link #getEchelon() <em>Echelon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEchelon()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEchelonEchelon echelon = ECHELON_EDEFAULT;

	/**
	 * This is true if the Echelon attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean echelonESet;

	/**
	 * The default value of the '{@link #getEstimationPertes() <em>Estimation Pertes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimationPertes()
	 * @generated
	 * @ordered
	 */
	protected static final double ESTIMATION_PERTES_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getEstimationPertes() <em>Estimation Pertes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimationPertes()
	 * @generated
	 * @ordered
	 */
	protected double estimationPertes = ESTIMATION_PERTES_EDEFAULT;

	/**
	 * This is true if the Estimation Pertes attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean estimationPertesESet;

	/**
	 * The default value of the '{@link #getDebutCreneau() <em>Debut Creneau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebutCreneau()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DEBUT_CRENEAU_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDebutCreneau() <em>Debut Creneau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebutCreneau()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar debutCreneau = DEBUT_CRENEAU_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinCreneau() <em>Fin Creneau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinCreneau()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar FIN_CRENEAU_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFinCreneau() <em>Fin Creneau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinCreneau()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar finCreneau = FIN_CRENEAU_EDEFAULT;

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
	 * The cached value of the '{@link #getVautPendantHoraireManoeuvre() <em>Vaut Pendant Horaire Manoeuvre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVautPendantHoraireManoeuvre()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation vautPendantHoraireManoeuvre;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypePertesSanteParEchelonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypePertesSanteParEchelon();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEchelonEchelon getEchelon() {
		return echelon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEchelon(TypeDictionaryDicoEchelonEchelon newEchelon) {
		TypeDictionaryDicoEchelonEchelon oldEchelon = echelon;
		echelon = newEchelon == null ? ECHELON_EDEFAULT : newEchelon;
		boolean oldEchelonESet = echelonESet;
		echelonESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PERTES_SANTE_PAR_ECHELON__ECHELON, oldEchelon, echelon, !oldEchelonESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEchelon() {
		TypeDictionaryDicoEchelonEchelon oldEchelon = echelon;
		boolean oldEchelonESet = echelonESet;
		echelon = ECHELON_EDEFAULT;
		echelonESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PERTES_SANTE_PAR_ECHELON__ECHELON, oldEchelon, ECHELON_EDEFAULT, oldEchelonESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEchelon() {
		return echelonESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getEstimationPertes() {
		return estimationPertes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstimationPertes(double newEstimationPertes) {
		double oldEstimationPertes = estimationPertes;
		estimationPertes = newEstimationPertes;
		boolean oldEstimationPertesESet = estimationPertesESet;
		estimationPertesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PERTES_SANTE_PAR_ECHELON__ESTIMATION_PERTES, oldEstimationPertes, estimationPertes, !oldEstimationPertesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEstimationPertes() {
		double oldEstimationPertes = estimationPertes;
		boolean oldEstimationPertesESet = estimationPertesESet;
		estimationPertes = ESTIMATION_PERTES_EDEFAULT;
		estimationPertesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PERTES_SANTE_PAR_ECHELON__ESTIMATION_PERTES, oldEstimationPertes, ESTIMATION_PERTES_EDEFAULT, oldEstimationPertesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEstimationPertes() {
		return estimationPertesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDebutCreneau() {
		return debutCreneau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDebutCreneau(XMLGregorianCalendar newDebutCreneau) {
		XMLGregorianCalendar oldDebutCreneau = debutCreneau;
		debutCreneau = newDebutCreneau;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PERTES_SANTE_PAR_ECHELON__DEBUT_CRENEAU, oldDebutCreneau, debutCreneau));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getFinCreneau() {
		return finCreneau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinCreneau(XMLGregorianCalendar newFinCreneau) {
		XMLGregorianCalendar oldFinCreneau = finCreneau;
		finCreneau = newFinCreneau;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PERTES_SANTE_PAR_ECHELON__FIN_CRENEAU, oldFinCreneau, finCreneau));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PERTES_SANTE_PAR_ECHELON__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PERTES_SANTE_PAR_ECHELON__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getVautPendantHoraireManoeuvre() {
		return vautPendantHoraireManoeuvre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVautPendantHoraireManoeuvre(TypeAssociation newVautPendantHoraireManoeuvre, NotificationChain msgs) {
		TypeAssociation oldVautPendantHoraireManoeuvre = vautPendantHoraireManoeuvre;
		vautPendantHoraireManoeuvre = newVautPendantHoraireManoeuvre;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PERTES_SANTE_PAR_ECHELON__VAUT_PENDANT_HORAIRE_MANOEUVRE, oldVautPendantHoraireManoeuvre, newVautPendantHoraireManoeuvre);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVautPendantHoraireManoeuvre(TypeAssociation newVautPendantHoraireManoeuvre) {
		if (newVautPendantHoraireManoeuvre != vautPendantHoraireManoeuvre) {
			NotificationChain msgs = null;
			if (vautPendantHoraireManoeuvre != null)
				msgs = ((InternalEObject)vautPendantHoraireManoeuvre).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PERTES_SANTE_PAR_ECHELON__VAUT_PENDANT_HORAIRE_MANOEUVRE, null, msgs);
			if (newVautPendantHoraireManoeuvre != null)
				msgs = ((InternalEObject)newVautPendantHoraireManoeuvre).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PERTES_SANTE_PAR_ECHELON__VAUT_PENDANT_HORAIRE_MANOEUVRE, null, msgs);
			msgs = basicSetVautPendantHoraireManoeuvre(newVautPendantHoraireManoeuvre, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PERTES_SANTE_PAR_ECHELON__VAUT_PENDANT_HORAIRE_MANOEUVRE, newVautPendantHoraireManoeuvre, newVautPendantHoraireManoeuvre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_PERTES_SANTE_PAR_ECHELON__VAUT_PENDANT_HORAIRE_MANOEUVRE:
				return basicSetVautPendantHoraireManoeuvre(null, msgs);
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
			case SchemaPackage.TYPE_PERTES_SANTE_PAR_ECHELON__ECHELON:
				return getEchelon();
			case SchemaPackage.TYPE_PERTES_SANTE_PAR_ECHELON__ESTIMATION_PERTES:
				return new Double(getEstimationPertes());
			case SchemaPackage.TYPE_PERTES_SANTE_PAR_ECHELON__DEBUT_CRENEAU:
				return getDebutCreneau();
			case SchemaPackage.TYPE_PERTES_SANTE_PAR_ECHELON__FIN_CRENEAU:
				return getFinCreneau();
			case SchemaPackage.TYPE_PERTES_SANTE_PAR_ECHELON__CTE:
				return getCTE();
			case SchemaPackage.TYPE_PERTES_SANTE_PAR_ECHELON__CE:
				return getCE();
			case SchemaPackage.TYPE_PERTES_SANTE_PAR_ECHELON__VAUT_PENDANT_HORAIRE_MANOEUVRE:
				return getVautPendantHoraireManoeuvre();
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
			case SchemaPackage.TYPE_PERTES_SANTE_PAR_ECHELON__ECHELON:
				setEchelon((TypeDictionaryDicoEchelonEchelon)newValue);
				return;
			case SchemaPackage.TYPE_PERTES_SANTE_PAR_ECHELON__ESTIMATION_PERTES:
				setEstimationPertes(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_PERTES_SANTE_PAR_ECHELON__DEBUT_CRENEAU:
				setDebutCreneau((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_PERTES_SANTE_PAR_ECHELON__FIN_CRENEAU:
				setFinCreneau((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_PERTES_SANTE_PAR_ECHELON__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_PERTES_SANTE_PAR_ECHELON__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_PERTES_SANTE_PAR_ECHELON__VAUT_PENDANT_HORAIRE_MANOEUVRE:
				setVautPendantHoraireManoeuvre((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_PERTES_SANTE_PAR_ECHELON__ECHELON:
				unsetEchelon();
				return;
			case SchemaPackage.TYPE_PERTES_SANTE_PAR_ECHELON__ESTIMATION_PERTES:
				unsetEstimationPertes();
				return;
			case SchemaPackage.TYPE_PERTES_SANTE_PAR_ECHELON__DEBUT_CRENEAU:
				setDebutCreneau(DEBUT_CRENEAU_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PERTES_SANTE_PAR_ECHELON__FIN_CRENEAU:
				setFinCreneau(FIN_CRENEAU_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PERTES_SANTE_PAR_ECHELON__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PERTES_SANTE_PAR_ECHELON__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PERTES_SANTE_PAR_ECHELON__VAUT_PENDANT_HORAIRE_MANOEUVRE:
				setVautPendantHoraireManoeuvre((TypeAssociation)null);
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
			case SchemaPackage.TYPE_PERTES_SANTE_PAR_ECHELON__ECHELON:
				return isSetEchelon();
			case SchemaPackage.TYPE_PERTES_SANTE_PAR_ECHELON__ESTIMATION_PERTES:
				return isSetEstimationPertes();
			case SchemaPackage.TYPE_PERTES_SANTE_PAR_ECHELON__DEBUT_CRENEAU:
				return DEBUT_CRENEAU_EDEFAULT == null ? debutCreneau != null : !DEBUT_CRENEAU_EDEFAULT.equals(debutCreneau);
			case SchemaPackage.TYPE_PERTES_SANTE_PAR_ECHELON__FIN_CRENEAU:
				return FIN_CRENEAU_EDEFAULT == null ? finCreneau != null : !FIN_CRENEAU_EDEFAULT.equals(finCreneau);
			case SchemaPackage.TYPE_PERTES_SANTE_PAR_ECHELON__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_PERTES_SANTE_PAR_ECHELON__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_PERTES_SANTE_PAR_ECHELON__VAUT_PENDANT_HORAIRE_MANOEUVRE:
				return vautPendantHoraireManoeuvre != null;
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
		result.append(" (echelon: ");
		if (echelonESet) result.append(echelon); else result.append("<unset>");
		result.append(", estimationPertes: ");
		if (estimationPertesESet) result.append(estimationPertes); else result.append("<unset>");
		result.append(", debutCreneau: ");
		result.append(debutCreneau);
		result.append(", finCreneau: ");
		result.append(finCreneau);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypePertesSanteParEchelonImpl
