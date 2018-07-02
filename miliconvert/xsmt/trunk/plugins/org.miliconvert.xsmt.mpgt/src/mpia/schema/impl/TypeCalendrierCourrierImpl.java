/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCalendrierCourrier;
import mpia.schema.TypeDictionaryDicoCalendrierCourrierMoyenTransport;
import mpia.schema.TypeDictionaryDicoConfidentialiteOTAN;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Calendrier Courrier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeCalendrierCourrierImpl#getIdentifiant <em>Identifiant</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCalendrierCourrierImpl#getMoyenTransport <em>Moyen Transport</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCalendrierCourrierImpl#getClassificationOtan <em>Classification Otan</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCalendrierCourrierImpl#getDateDepart <em>Date Depart</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCalendrierCourrierImpl#getDateArrivee <em>Date Arrivee</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCalendrierCourrierImpl#getTypeLocalisation <em>Type Localisation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCalendrierCourrierImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCalendrierCourrierImpl#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeCalendrierCourrierImpl extends EObjectImpl implements TypeCalendrierCourrier {
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
	 * The default value of the '{@link #getMoyenTransport() <em>Moyen Transport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyenTransport()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCalendrierCourrierMoyenTransport MOYEN_TRANSPORT_EDEFAULT = TypeDictionaryDicoCalendrierCourrierMoyenTransport.MC;

	/**
	 * The cached value of the '{@link #getMoyenTransport() <em>Moyen Transport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyenTransport()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCalendrierCourrierMoyenTransport moyenTransport = MOYEN_TRANSPORT_EDEFAULT;

	/**
	 * This is true if the Moyen Transport attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean moyenTransportESet;

	/**
	 * The default value of the '{@link #getClassificationOtan() <em>Classification Otan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationOtan()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoConfidentialiteOTAN CLASSIFICATION_OTAN_EDEFAULT = TypeDictionaryDicoConfidentialiteOTAN.NU;

	/**
	 * The cached value of the '{@link #getClassificationOtan() <em>Classification Otan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationOtan()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoConfidentialiteOTAN classificationOtan = CLASSIFICATION_OTAN_EDEFAULT;

	/**
	 * This is true if the Classification Otan attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean classificationOtanESet;

	/**
	 * The default value of the '{@link #getDateDepart() <em>Date Depart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDepart()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_DEPART_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateDepart() <em>Date Depart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDepart()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateDepart = DATE_DEPART_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateArrivee() <em>Date Arrivee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateArrivee()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_ARRIVEE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateArrivee() <em>Date Arrivee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateArrivee()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateArrivee = DATE_ARRIVEE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeLocalisation() <em>Type Localisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeLocalisation()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_LOCALISATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeLocalisation() <em>Type Localisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeLocalisation()
	 * @generated
	 * @ordered
	 */
	protected String typeLocalisation = TYPE_LOCALISATION_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeCalendrierCourrierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeCalendrierCourrier();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CALENDRIER_COURRIER__IDENTIFIANT, oldIdentifiant, identifiant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoCalendrierCourrierMoyenTransport getMoyenTransport() {
		return moyenTransport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoyenTransport(TypeDictionaryDicoCalendrierCourrierMoyenTransport newMoyenTransport) {
		TypeDictionaryDicoCalendrierCourrierMoyenTransport oldMoyenTransport = moyenTransport;
		moyenTransport = newMoyenTransport == null ? MOYEN_TRANSPORT_EDEFAULT : newMoyenTransport;
		boolean oldMoyenTransportESet = moyenTransportESet;
		moyenTransportESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CALENDRIER_COURRIER__MOYEN_TRANSPORT, oldMoyenTransport, moyenTransport, !oldMoyenTransportESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMoyenTransport() {
		TypeDictionaryDicoCalendrierCourrierMoyenTransport oldMoyenTransport = moyenTransport;
		boolean oldMoyenTransportESet = moyenTransportESet;
		moyenTransport = MOYEN_TRANSPORT_EDEFAULT;
		moyenTransportESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CALENDRIER_COURRIER__MOYEN_TRANSPORT, oldMoyenTransport, MOYEN_TRANSPORT_EDEFAULT, oldMoyenTransportESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMoyenTransport() {
		return moyenTransportESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoConfidentialiteOTAN getClassificationOtan() {
		return classificationOtan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassificationOtan(TypeDictionaryDicoConfidentialiteOTAN newClassificationOtan) {
		TypeDictionaryDicoConfidentialiteOTAN oldClassificationOtan = classificationOtan;
		classificationOtan = newClassificationOtan == null ? CLASSIFICATION_OTAN_EDEFAULT : newClassificationOtan;
		boolean oldClassificationOtanESet = classificationOtanESet;
		classificationOtanESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CALENDRIER_COURRIER__CLASSIFICATION_OTAN, oldClassificationOtan, classificationOtan, !oldClassificationOtanESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClassificationOtan() {
		TypeDictionaryDicoConfidentialiteOTAN oldClassificationOtan = classificationOtan;
		boolean oldClassificationOtanESet = classificationOtanESet;
		classificationOtan = CLASSIFICATION_OTAN_EDEFAULT;
		classificationOtanESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CALENDRIER_COURRIER__CLASSIFICATION_OTAN, oldClassificationOtan, CLASSIFICATION_OTAN_EDEFAULT, oldClassificationOtanESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClassificationOtan() {
		return classificationOtanESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateDepart() {
		return dateDepart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateDepart(XMLGregorianCalendar newDateDepart) {
		XMLGregorianCalendar oldDateDepart = dateDepart;
		dateDepart = newDateDepart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CALENDRIER_COURRIER__DATE_DEPART, oldDateDepart, dateDepart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateArrivee() {
		return dateArrivee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateArrivee(XMLGregorianCalendar newDateArrivee) {
		XMLGregorianCalendar oldDateArrivee = dateArrivee;
		dateArrivee = newDateArrivee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CALENDRIER_COURRIER__DATE_ARRIVEE, oldDateArrivee, dateArrivee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeLocalisation() {
		return typeLocalisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeLocalisation(String newTypeLocalisation) {
		String oldTypeLocalisation = typeLocalisation;
		typeLocalisation = newTypeLocalisation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CALENDRIER_COURRIER__TYPE_LOCALISATION, oldTypeLocalisation, typeLocalisation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CALENDRIER_COURRIER__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CALENDRIER_COURRIER__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_CALENDRIER_COURRIER__IDENTIFIANT:
				return getIdentifiant();
			case SchemaPackage.TYPE_CALENDRIER_COURRIER__MOYEN_TRANSPORT:
				return getMoyenTransport();
			case SchemaPackage.TYPE_CALENDRIER_COURRIER__CLASSIFICATION_OTAN:
				return getClassificationOtan();
			case SchemaPackage.TYPE_CALENDRIER_COURRIER__DATE_DEPART:
				return getDateDepart();
			case SchemaPackage.TYPE_CALENDRIER_COURRIER__DATE_ARRIVEE:
				return getDateArrivee();
			case SchemaPackage.TYPE_CALENDRIER_COURRIER__TYPE_LOCALISATION:
				return getTypeLocalisation();
			case SchemaPackage.TYPE_CALENDRIER_COURRIER__CTE:
				return getCTE();
			case SchemaPackage.TYPE_CALENDRIER_COURRIER__CE:
				return getCE();
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
			case SchemaPackage.TYPE_CALENDRIER_COURRIER__IDENTIFIANT:
				setIdentifiant((String)newValue);
				return;
			case SchemaPackage.TYPE_CALENDRIER_COURRIER__MOYEN_TRANSPORT:
				setMoyenTransport((TypeDictionaryDicoCalendrierCourrierMoyenTransport)newValue);
				return;
			case SchemaPackage.TYPE_CALENDRIER_COURRIER__CLASSIFICATION_OTAN:
				setClassificationOtan((TypeDictionaryDicoConfidentialiteOTAN)newValue);
				return;
			case SchemaPackage.TYPE_CALENDRIER_COURRIER__DATE_DEPART:
				setDateDepart((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_CALENDRIER_COURRIER__DATE_ARRIVEE:
				setDateArrivee((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_CALENDRIER_COURRIER__TYPE_LOCALISATION:
				setTypeLocalisation((String)newValue);
				return;
			case SchemaPackage.TYPE_CALENDRIER_COURRIER__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_CALENDRIER_COURRIER__CE:
				setCE((String)newValue);
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
			case SchemaPackage.TYPE_CALENDRIER_COURRIER__IDENTIFIANT:
				setIdentifiant(IDENTIFIANT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CALENDRIER_COURRIER__MOYEN_TRANSPORT:
				unsetMoyenTransport();
				return;
			case SchemaPackage.TYPE_CALENDRIER_COURRIER__CLASSIFICATION_OTAN:
				unsetClassificationOtan();
				return;
			case SchemaPackage.TYPE_CALENDRIER_COURRIER__DATE_DEPART:
				setDateDepart(DATE_DEPART_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CALENDRIER_COURRIER__DATE_ARRIVEE:
				setDateArrivee(DATE_ARRIVEE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CALENDRIER_COURRIER__TYPE_LOCALISATION:
				setTypeLocalisation(TYPE_LOCALISATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CALENDRIER_COURRIER__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CALENDRIER_COURRIER__CE:
				setCE(CE_EDEFAULT);
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
			case SchemaPackage.TYPE_CALENDRIER_COURRIER__IDENTIFIANT:
				return IDENTIFIANT_EDEFAULT == null ? identifiant != null : !IDENTIFIANT_EDEFAULT.equals(identifiant);
			case SchemaPackage.TYPE_CALENDRIER_COURRIER__MOYEN_TRANSPORT:
				return isSetMoyenTransport();
			case SchemaPackage.TYPE_CALENDRIER_COURRIER__CLASSIFICATION_OTAN:
				return isSetClassificationOtan();
			case SchemaPackage.TYPE_CALENDRIER_COURRIER__DATE_DEPART:
				return DATE_DEPART_EDEFAULT == null ? dateDepart != null : !DATE_DEPART_EDEFAULT.equals(dateDepart);
			case SchemaPackage.TYPE_CALENDRIER_COURRIER__DATE_ARRIVEE:
				return DATE_ARRIVEE_EDEFAULT == null ? dateArrivee != null : !DATE_ARRIVEE_EDEFAULT.equals(dateArrivee);
			case SchemaPackage.TYPE_CALENDRIER_COURRIER__TYPE_LOCALISATION:
				return TYPE_LOCALISATION_EDEFAULT == null ? typeLocalisation != null : !TYPE_LOCALISATION_EDEFAULT.equals(typeLocalisation);
			case SchemaPackage.TYPE_CALENDRIER_COURRIER__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_CALENDRIER_COURRIER__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
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
		result.append(", moyenTransport: ");
		if (moyenTransportESet) result.append(moyenTransport); else result.append("<unset>");
		result.append(", classificationOtan: ");
		if (classificationOtanESet) result.append(classificationOtan); else result.append("<unset>");
		result.append(", dateDepart: ");
		result.append(dateDepart);
		result.append(", dateArrivee: ");
		result.append(dateArrivee);
		result.append(", typeLocalisation: ");
		result.append(typeLocalisation);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeCalendrierCourrierImpl
