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
import mpia.schema.TypeFonctionPersonne;

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
 * An implementation of the model object '<em><b>Type Fonction Personne</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeFonctionPersonneImpl#getCodeFonction <em>Code Fonction</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeFonctionPersonneImpl#getDateDebut <em>Date Debut</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeFonctionPersonneImpl#getDateFin <em>Date Fin</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeFonctionPersonneImpl#getLibelleFonction <em>Libelle Fonction</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeFonctionPersonneImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeFonctionPersonneImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeFonctionPersonneImpl#getEstLieAInstanceObjet <em>Est Lie AInstance Objet</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeFonctionPersonneImpl extends EObjectImpl implements TypeFonctionPersonne {
	/**
	 * The default value of the '{@link #getCodeFonction() <em>Code Fonction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeFonction()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_FONCTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeFonction() <em>Code Fonction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeFonction()
	 * @generated
	 * @ordered
	 */
	protected String codeFonction = CODE_FONCTION_EDEFAULT;

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
	 * The default value of the '{@link #getLibelleFonction() <em>Libelle Fonction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibelleFonction()
	 * @generated
	 * @ordered
	 */
	protected static final String LIBELLE_FONCTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLibelleFonction() <em>Libelle Fonction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibelleFonction()
	 * @generated
	 * @ordered
	 */
	protected String libelleFonction = LIBELLE_FONCTION_EDEFAULT;

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
	protected TypeFonctionPersonneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeFonctionPersonne();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodeFonction() {
		return codeFonction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeFonction(String newCodeFonction) {
		String oldCodeFonction = codeFonction;
		codeFonction = newCodeFonction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_FONCTION_PERSONNE__CODE_FONCTION, oldCodeFonction, codeFonction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_FONCTION_PERSONNE__DATE_DEBUT, oldDateDebut, dateDebut));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_FONCTION_PERSONNE__DATE_FIN, oldDateFin, dateFin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLibelleFonction() {
		return libelleFonction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibelleFonction(String newLibelleFonction) {
		String oldLibelleFonction = libelleFonction;
		libelleFonction = newLibelleFonction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_FONCTION_PERSONNE__LIBELLE_FONCTION, oldLibelleFonction, libelleFonction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_FONCTION_PERSONNE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_FONCTION_PERSONNE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstLieAInstanceObjet() {
		if (estLieAInstanceObjet == null) {
			estLieAInstanceObjet = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_FONCTION_PERSONNE__EST_LIE_AINSTANCE_OBJET);
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
			case SchemaPackage.TYPE_FONCTION_PERSONNE__EST_LIE_AINSTANCE_OBJET:
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
			case SchemaPackage.TYPE_FONCTION_PERSONNE__CODE_FONCTION:
				return getCodeFonction();
			case SchemaPackage.TYPE_FONCTION_PERSONNE__DATE_DEBUT:
				return getDateDebut();
			case SchemaPackage.TYPE_FONCTION_PERSONNE__DATE_FIN:
				return getDateFin();
			case SchemaPackage.TYPE_FONCTION_PERSONNE__LIBELLE_FONCTION:
				return getLibelleFonction();
			case SchemaPackage.TYPE_FONCTION_PERSONNE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_FONCTION_PERSONNE__CE:
				return getCE();
			case SchemaPackage.TYPE_FONCTION_PERSONNE__EST_LIE_AINSTANCE_OBJET:
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
			case SchemaPackage.TYPE_FONCTION_PERSONNE__CODE_FONCTION:
				setCodeFonction((String)newValue);
				return;
			case SchemaPackage.TYPE_FONCTION_PERSONNE__DATE_DEBUT:
				setDateDebut((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_FONCTION_PERSONNE__DATE_FIN:
				setDateFin((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_FONCTION_PERSONNE__LIBELLE_FONCTION:
				setLibelleFonction((String)newValue);
				return;
			case SchemaPackage.TYPE_FONCTION_PERSONNE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_FONCTION_PERSONNE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_FONCTION_PERSONNE__EST_LIE_AINSTANCE_OBJET:
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
			case SchemaPackage.TYPE_FONCTION_PERSONNE__CODE_FONCTION:
				setCodeFonction(CODE_FONCTION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_FONCTION_PERSONNE__DATE_DEBUT:
				setDateDebut(DATE_DEBUT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_FONCTION_PERSONNE__DATE_FIN:
				setDateFin(DATE_FIN_EDEFAULT);
				return;
			case SchemaPackage.TYPE_FONCTION_PERSONNE__LIBELLE_FONCTION:
				setLibelleFonction(LIBELLE_FONCTION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_FONCTION_PERSONNE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_FONCTION_PERSONNE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_FONCTION_PERSONNE__EST_LIE_AINSTANCE_OBJET:
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
			case SchemaPackage.TYPE_FONCTION_PERSONNE__CODE_FONCTION:
				return CODE_FONCTION_EDEFAULT == null ? codeFonction != null : !CODE_FONCTION_EDEFAULT.equals(codeFonction);
			case SchemaPackage.TYPE_FONCTION_PERSONNE__DATE_DEBUT:
				return DATE_DEBUT_EDEFAULT == null ? dateDebut != null : !DATE_DEBUT_EDEFAULT.equals(dateDebut);
			case SchemaPackage.TYPE_FONCTION_PERSONNE__DATE_FIN:
				return DATE_FIN_EDEFAULT == null ? dateFin != null : !DATE_FIN_EDEFAULT.equals(dateFin);
			case SchemaPackage.TYPE_FONCTION_PERSONNE__LIBELLE_FONCTION:
				return LIBELLE_FONCTION_EDEFAULT == null ? libelleFonction != null : !LIBELLE_FONCTION_EDEFAULT.equals(libelleFonction);
			case SchemaPackage.TYPE_FONCTION_PERSONNE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_FONCTION_PERSONNE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_FONCTION_PERSONNE__EST_LIE_AINSTANCE_OBJET:
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
		result.append(" (codeFonction: ");
		result.append(codeFonction);
		result.append(", dateDebut: ");
		result.append(dateDebut);
		result.append(", dateFin: ");
		result.append(dateFin);
		result.append(", libelleFonction: ");
		result.append(libelleFonction);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeFonctionPersonneImpl
