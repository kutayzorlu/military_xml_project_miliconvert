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
import mpia.schema.TypeDeplacementPersonne;

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
 * An implementation of the model object '<em><b>Type Deplacement Personne</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeDeplacementPersonneImpl#getDateDebut <em>Date Debut</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDeplacementPersonneImpl#getDateFin <em>Date Fin</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDeplacementPersonneImpl#getCodeDeplacement <em>Code Deplacement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDeplacementPersonneImpl#getLibelleDeplacement <em>Libelle Deplacement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDeplacementPersonneImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDeplacementPersonneImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDeplacementPersonneImpl#getEstRapporteParRapport <em>Est Rapporte Par Rapport</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDeplacementPersonneImpl#getAEuLieuDansInstanceObjet <em>AEu Lieu Dans Instance Objet</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeDeplacementPersonneImpl extends EObjectImpl implements TypeDeplacementPersonne {
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
	 * The default value of the '{@link #getCodeDeplacement() <em>Code Deplacement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeDeplacement()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_DEPLACEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeDeplacement() <em>Code Deplacement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeDeplacement()
	 * @generated
	 * @ordered
	 */
	protected String codeDeplacement = CODE_DEPLACEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLibelleDeplacement() <em>Libelle Deplacement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibelleDeplacement()
	 * @generated
	 * @ordered
	 */
	protected static final String LIBELLE_DEPLACEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLibelleDeplacement() <em>Libelle Deplacement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibelleDeplacement()
	 * @generated
	 * @ordered
	 */
	protected String libelleDeplacement = LIBELLE_DEPLACEMENT_EDEFAULT;

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
	 * The cached value of the '{@link #getEstRapporteParRapport() <em>Est Rapporte Par Rapport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstRapporteParRapport()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation estRapporteParRapport;

	/**
	 * The cached value of the '{@link #getAEuLieuDansInstanceObjet() <em>AEu Lieu Dans Instance Objet</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAEuLieuDansInstanceObjet()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aEuLieuDansInstanceObjet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeDeplacementPersonneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeDeplacementPersonne();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEPLACEMENT_PERSONNE__DATE_DEBUT, oldDateDebut, dateDebut));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEPLACEMENT_PERSONNE__DATE_FIN, oldDateFin, dateFin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodeDeplacement() {
		return codeDeplacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeDeplacement(String newCodeDeplacement) {
		String oldCodeDeplacement = codeDeplacement;
		codeDeplacement = newCodeDeplacement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEPLACEMENT_PERSONNE__CODE_DEPLACEMENT, oldCodeDeplacement, codeDeplacement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLibelleDeplacement() {
		return libelleDeplacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibelleDeplacement(String newLibelleDeplacement) {
		String oldLibelleDeplacement = libelleDeplacement;
		libelleDeplacement = newLibelleDeplacement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEPLACEMENT_PERSONNE__LIBELLE_DEPLACEMENT, oldLibelleDeplacement, libelleDeplacement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEPLACEMENT_PERSONNE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEPLACEMENT_PERSONNE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getEstRapporteParRapport() {
		return estRapporteParRapport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstRapporteParRapport(TypeAssociation newEstRapporteParRapport, NotificationChain msgs) {
		TypeAssociation oldEstRapporteParRapport = estRapporteParRapport;
		estRapporteParRapport = newEstRapporteParRapport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEPLACEMENT_PERSONNE__EST_RAPPORTE_PAR_RAPPORT, oldEstRapporteParRapport, newEstRapporteParRapport);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstRapporteParRapport(TypeAssociation newEstRapporteParRapport) {
		if (newEstRapporteParRapport != estRapporteParRapport) {
			NotificationChain msgs = null;
			if (estRapporteParRapport != null)
				msgs = ((InternalEObject)estRapporteParRapport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DEPLACEMENT_PERSONNE__EST_RAPPORTE_PAR_RAPPORT, null, msgs);
			if (newEstRapporteParRapport != null)
				msgs = ((InternalEObject)newEstRapporteParRapport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DEPLACEMENT_PERSONNE__EST_RAPPORTE_PAR_RAPPORT, null, msgs);
			msgs = basicSetEstRapporteParRapport(newEstRapporteParRapport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEPLACEMENT_PERSONNE__EST_RAPPORTE_PAR_RAPPORT, newEstRapporteParRapport, newEstRapporteParRapport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAEuLieuDansInstanceObjet() {
		if (aEuLieuDansInstanceObjet == null) {
			aEuLieuDansInstanceObjet = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_DEPLACEMENT_PERSONNE__AEU_LIEU_DANS_INSTANCE_OBJET);
		}
		return aEuLieuDansInstanceObjet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_DEPLACEMENT_PERSONNE__EST_RAPPORTE_PAR_RAPPORT:
				return basicSetEstRapporteParRapport(null, msgs);
			case SchemaPackage.TYPE_DEPLACEMENT_PERSONNE__AEU_LIEU_DANS_INSTANCE_OBJET:
				return ((InternalEList<?>)getAEuLieuDansInstanceObjet()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_DEPLACEMENT_PERSONNE__DATE_DEBUT:
				return getDateDebut();
			case SchemaPackage.TYPE_DEPLACEMENT_PERSONNE__DATE_FIN:
				return getDateFin();
			case SchemaPackage.TYPE_DEPLACEMENT_PERSONNE__CODE_DEPLACEMENT:
				return getCodeDeplacement();
			case SchemaPackage.TYPE_DEPLACEMENT_PERSONNE__LIBELLE_DEPLACEMENT:
				return getLibelleDeplacement();
			case SchemaPackage.TYPE_DEPLACEMENT_PERSONNE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_DEPLACEMENT_PERSONNE__CE:
				return getCE();
			case SchemaPackage.TYPE_DEPLACEMENT_PERSONNE__EST_RAPPORTE_PAR_RAPPORT:
				return getEstRapporteParRapport();
			case SchemaPackage.TYPE_DEPLACEMENT_PERSONNE__AEU_LIEU_DANS_INSTANCE_OBJET:
				return getAEuLieuDansInstanceObjet();
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
			case SchemaPackage.TYPE_DEPLACEMENT_PERSONNE__DATE_DEBUT:
				setDateDebut((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_DEPLACEMENT_PERSONNE__DATE_FIN:
				setDateFin((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_DEPLACEMENT_PERSONNE__CODE_DEPLACEMENT:
				setCodeDeplacement((String)newValue);
				return;
			case SchemaPackage.TYPE_DEPLACEMENT_PERSONNE__LIBELLE_DEPLACEMENT:
				setLibelleDeplacement((String)newValue);
				return;
			case SchemaPackage.TYPE_DEPLACEMENT_PERSONNE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_DEPLACEMENT_PERSONNE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_DEPLACEMENT_PERSONNE__EST_RAPPORTE_PAR_RAPPORT:
				setEstRapporteParRapport((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_DEPLACEMENT_PERSONNE__AEU_LIEU_DANS_INSTANCE_OBJET:
				getAEuLieuDansInstanceObjet().clear();
				getAEuLieuDansInstanceObjet().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_DEPLACEMENT_PERSONNE__DATE_DEBUT:
				setDateDebut(DATE_DEBUT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DEPLACEMENT_PERSONNE__DATE_FIN:
				setDateFin(DATE_FIN_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DEPLACEMENT_PERSONNE__CODE_DEPLACEMENT:
				setCodeDeplacement(CODE_DEPLACEMENT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DEPLACEMENT_PERSONNE__LIBELLE_DEPLACEMENT:
				setLibelleDeplacement(LIBELLE_DEPLACEMENT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DEPLACEMENT_PERSONNE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DEPLACEMENT_PERSONNE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DEPLACEMENT_PERSONNE__EST_RAPPORTE_PAR_RAPPORT:
				setEstRapporteParRapport((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_DEPLACEMENT_PERSONNE__AEU_LIEU_DANS_INSTANCE_OBJET:
				getAEuLieuDansInstanceObjet().clear();
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
			case SchemaPackage.TYPE_DEPLACEMENT_PERSONNE__DATE_DEBUT:
				return DATE_DEBUT_EDEFAULT == null ? dateDebut != null : !DATE_DEBUT_EDEFAULT.equals(dateDebut);
			case SchemaPackage.TYPE_DEPLACEMENT_PERSONNE__DATE_FIN:
				return DATE_FIN_EDEFAULT == null ? dateFin != null : !DATE_FIN_EDEFAULT.equals(dateFin);
			case SchemaPackage.TYPE_DEPLACEMENT_PERSONNE__CODE_DEPLACEMENT:
				return CODE_DEPLACEMENT_EDEFAULT == null ? codeDeplacement != null : !CODE_DEPLACEMENT_EDEFAULT.equals(codeDeplacement);
			case SchemaPackage.TYPE_DEPLACEMENT_PERSONNE__LIBELLE_DEPLACEMENT:
				return LIBELLE_DEPLACEMENT_EDEFAULT == null ? libelleDeplacement != null : !LIBELLE_DEPLACEMENT_EDEFAULT.equals(libelleDeplacement);
			case SchemaPackage.TYPE_DEPLACEMENT_PERSONNE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_DEPLACEMENT_PERSONNE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_DEPLACEMENT_PERSONNE__EST_RAPPORTE_PAR_RAPPORT:
				return estRapporteParRapport != null;
			case SchemaPackage.TYPE_DEPLACEMENT_PERSONNE__AEU_LIEU_DANS_INSTANCE_OBJET:
				return aEuLieuDansInstanceObjet != null && !aEuLieuDansInstanceObjet.isEmpty();
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
		result.append(" (dateDebut: ");
		result.append(dateDebut);
		result.append(", dateFin: ");
		result.append(dateFin);
		result.append(", codeDeplacement: ");
		result.append(codeDeplacement);
		result.append(", libelleDeplacement: ");
		result.append(libelleDeplacement);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeDeplacementPersonneImpl
