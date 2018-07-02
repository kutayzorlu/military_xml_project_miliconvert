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
import mpia.schema.TypeEmploi;

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
 * An implementation of the model object '<em><b>Type Emploi</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEmploiImpl#getCodeEmploi <em>Code Emploi</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEmploiImpl#getLibelleEmploi <em>Libelle Emploi</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEmploiImpl#getDateDebut <em>Date Debut</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEmploiImpl#getDateFin <em>Date Fin</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEmploiImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEmploiImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEmploiImpl#getEstLieAInstanceObjet <em>Est Lie AInstance Objet</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeEmploiImpl extends EObjectImpl implements TypeEmploi {
	/**
	 * The default value of the '{@link #getCodeEmploi() <em>Code Emploi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeEmploi()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EMPLOI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeEmploi() <em>Code Emploi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeEmploi()
	 * @generated
	 * @ordered
	 */
	protected String codeEmploi = CODE_EMPLOI_EDEFAULT;

	/**
	 * The default value of the '{@link #getLibelleEmploi() <em>Libelle Emploi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibelleEmploi()
	 * @generated
	 * @ordered
	 */
	protected static final String LIBELLE_EMPLOI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLibelleEmploi() <em>Libelle Emploi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibelleEmploi()
	 * @generated
	 * @ordered
	 */
	protected String libelleEmploi = LIBELLE_EMPLOI_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateDebut() <em>Date Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDebut()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_DEBUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateDebut() <em>Date Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDebut()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateDebut = DATE_DEBUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateFin() <em>Date Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFin()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_FIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateFin() <em>Date Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFin()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateFin = DATE_FIN_EDEFAULT;

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
	 * The cached value of the '{@link #getEstLieAInstanceObjet() <em>Est Lie AInstance Objet</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstLieAInstanceObjet()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estLieAInstanceObjet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeEmploiImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEmploi();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodeEmploi() {
		return codeEmploi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeEmploi(String newCodeEmploi) {
		String oldCodeEmploi = codeEmploi;
		codeEmploi = newCodeEmploi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EMPLOI__CODE_EMPLOI, oldCodeEmploi, codeEmploi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLibelleEmploi() {
		return libelleEmploi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibelleEmploi(String newLibelleEmploi) {
		String oldLibelleEmploi = libelleEmploi;
		libelleEmploi = newLibelleEmploi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EMPLOI__LIBELLE_EMPLOI, oldLibelleEmploi, libelleEmploi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateDebut() {
		return dateDebut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateDebut(XMLGregorianCalendar newDateDebut) {
		XMLGregorianCalendar oldDateDebut = dateDebut;
		dateDebut = newDateDebut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EMPLOI__DATE_DEBUT, oldDateDebut, dateDebut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateFin() {
		return dateFin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateFin(XMLGregorianCalendar newDateFin) {
		XMLGregorianCalendar oldDateFin = dateFin;
		dateFin = newDateFin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EMPLOI__DATE_FIN, oldDateFin, dateFin));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EMPLOI__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EMPLOI__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstLieAInstanceObjet() {
		if (estLieAInstanceObjet == null) {
			estLieAInstanceObjet = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_EMPLOI__EST_LIE_AINSTANCE_OBJET);
		}
		return estLieAInstanceObjet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_EMPLOI__EST_LIE_AINSTANCE_OBJET:
				return ((InternalEList<?>)getEstLieAInstanceObjet()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_EMPLOI__CODE_EMPLOI:
				return getCodeEmploi();
			case SchemaPackage.TYPE_EMPLOI__LIBELLE_EMPLOI:
				return getLibelleEmploi();
			case SchemaPackage.TYPE_EMPLOI__DATE_DEBUT:
				return getDateDebut();
			case SchemaPackage.TYPE_EMPLOI__DATE_FIN:
				return getDateFin();
			case SchemaPackage.TYPE_EMPLOI__CTE:
				return getCTE();
			case SchemaPackage.TYPE_EMPLOI__CE:
				return getCE();
			case SchemaPackage.TYPE_EMPLOI__EST_LIE_AINSTANCE_OBJET:
				return getEstLieAInstanceObjet();
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
			case SchemaPackage.TYPE_EMPLOI__CODE_EMPLOI:
				setCodeEmploi((String)newValue);
				return;
			case SchemaPackage.TYPE_EMPLOI__LIBELLE_EMPLOI:
				setLibelleEmploi((String)newValue);
				return;
			case SchemaPackage.TYPE_EMPLOI__DATE_DEBUT:
				setDateDebut((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_EMPLOI__DATE_FIN:
				setDateFin((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_EMPLOI__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_EMPLOI__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_EMPLOI__EST_LIE_AINSTANCE_OBJET:
				getEstLieAInstanceObjet().clear();
				getEstLieAInstanceObjet().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_EMPLOI__CODE_EMPLOI:
				setCodeEmploi(CODE_EMPLOI_EDEFAULT);
				return;
			case SchemaPackage.TYPE_EMPLOI__LIBELLE_EMPLOI:
				setLibelleEmploi(LIBELLE_EMPLOI_EDEFAULT);
				return;
			case SchemaPackage.TYPE_EMPLOI__DATE_DEBUT:
				setDateDebut(DATE_DEBUT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_EMPLOI__DATE_FIN:
				setDateFin(DATE_FIN_EDEFAULT);
				return;
			case SchemaPackage.TYPE_EMPLOI__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_EMPLOI__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_EMPLOI__EST_LIE_AINSTANCE_OBJET:
				getEstLieAInstanceObjet().clear();
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
			case SchemaPackage.TYPE_EMPLOI__CODE_EMPLOI:
				return CODE_EMPLOI_EDEFAULT == null ? codeEmploi != null : !CODE_EMPLOI_EDEFAULT.equals(codeEmploi);
			case SchemaPackage.TYPE_EMPLOI__LIBELLE_EMPLOI:
				return LIBELLE_EMPLOI_EDEFAULT == null ? libelleEmploi != null : !LIBELLE_EMPLOI_EDEFAULT.equals(libelleEmploi);
			case SchemaPackage.TYPE_EMPLOI__DATE_DEBUT:
				return DATE_DEBUT_EDEFAULT == null ? dateDebut != null : !DATE_DEBUT_EDEFAULT.equals(dateDebut);
			case SchemaPackage.TYPE_EMPLOI__DATE_FIN:
				return DATE_FIN_EDEFAULT == null ? dateFin != null : !DATE_FIN_EDEFAULT.equals(dateFin);
			case SchemaPackage.TYPE_EMPLOI__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_EMPLOI__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_EMPLOI__EST_LIE_AINSTANCE_OBJET:
				return estLieAInstanceObjet != null && !estLieAInstanceObjet.isEmpty();
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
		result.append(" (codeEmploi: ");
		result.append(codeEmploi);
		result.append(", libelleEmploi: ");
		result.append(libelleEmploi);
		result.append(", dateDebut: ");
		result.append(dateDebut);
		result.append(", dateFin: ");
		result.append(dateFin);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeEmploiImpl
