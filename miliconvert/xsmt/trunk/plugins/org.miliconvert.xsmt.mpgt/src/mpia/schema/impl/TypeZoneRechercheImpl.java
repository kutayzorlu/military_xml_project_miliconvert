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
import mpia.schema.TypeDictionaryDicoImportance;
import mpia.schema.TypeZoneRecherche;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Zone Recherche</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeZoneRechercheImpl#getNumero <em>Numero</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeZoneRechercheImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeZoneRechercheImpl#getPrioriteZone <em>Priorite Zone</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeZoneRechercheImpl#getDebutRecherche <em>Debut Recherche</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeZoneRechercheImpl#getFinRecherche <em>Fin Recherche</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeZoneRechercheImpl#getFaitObjetAction <em>Fait Objet Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeZoneRechercheImpl extends TypeElementControleImpl implements TypeZoneRecherche {
	/**
	 * The default value of the '{@link #getNumero() <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumero()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMERO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumero() <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumero()
	 * @generated
	 * @ordered
	 */
	protected String numero = NUMERO_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrioriteZone() <em>Priorite Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrioriteZone()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoImportance PRIORITE_ZONE_EDEFAULT = TypeDictionaryDicoImportance._1;

	/**
	 * The cached value of the '{@link #getPrioriteZone() <em>Priorite Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrioriteZone()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoImportance prioriteZone = PRIORITE_ZONE_EDEFAULT;

	/**
	 * This is true if the Priorite Zone attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean prioriteZoneESet;

	/**
	 * The default value of the '{@link #getDebutRecherche() <em>Debut Recherche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebutRecherche()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DEBUT_RECHERCHE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDebutRecherche() <em>Debut Recherche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebutRecherche()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar debutRecherche = DEBUT_RECHERCHE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinRecherche() <em>Fin Recherche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinRecherche()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar FIN_RECHERCHE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFinRecherche() <em>Fin Recherche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinRecherche()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar finRecherche = FIN_RECHERCHE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFaitObjetAction() <em>Fait Objet Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaitObjetAction()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> faitObjetAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeZoneRechercheImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeZoneRecherche();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumero(String newNumero) {
		String oldNumero = numero;
		numero = newNumero;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_RECHERCHE__NUMERO, oldNumero, numero));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_RECHERCHE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoImportance getPrioriteZone() {
		return prioriteZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrioriteZone(TypeDictionaryDicoImportance newPrioriteZone) {
		TypeDictionaryDicoImportance oldPrioriteZone = prioriteZone;
		prioriteZone = newPrioriteZone == null ? PRIORITE_ZONE_EDEFAULT : newPrioriteZone;
		boolean oldPrioriteZoneESet = prioriteZoneESet;
		prioriteZoneESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_RECHERCHE__PRIORITE_ZONE, oldPrioriteZone, prioriteZone, !oldPrioriteZoneESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPrioriteZone() {
		TypeDictionaryDicoImportance oldPrioriteZone = prioriteZone;
		boolean oldPrioriteZoneESet = prioriteZoneESet;
		prioriteZone = PRIORITE_ZONE_EDEFAULT;
		prioriteZoneESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ZONE_RECHERCHE__PRIORITE_ZONE, oldPrioriteZone, PRIORITE_ZONE_EDEFAULT, oldPrioriteZoneESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPrioriteZone() {
		return prioriteZoneESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDebutRecherche() {
		return debutRecherche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDebutRecherche(XMLGregorianCalendar newDebutRecherche) {
		XMLGregorianCalendar oldDebutRecherche = debutRecherche;
		debutRecherche = newDebutRecherche;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_RECHERCHE__DEBUT_RECHERCHE, oldDebutRecherche, debutRecherche));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getFinRecherche() {
		return finRecherche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinRecherche(XMLGregorianCalendar newFinRecherche) {
		XMLGregorianCalendar oldFinRecherche = finRecherche;
		finRecherche = newFinRecherche;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONE_RECHERCHE__FIN_RECHERCHE, oldFinRecherche, finRecherche));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getFaitObjetAction() {
		if (faitObjetAction == null) {
			faitObjetAction = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ZONE_RECHERCHE__FAIT_OBJET_ACTION);
		}
		return faitObjetAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ZONE_RECHERCHE__FAIT_OBJET_ACTION:
				return ((InternalEList<?>)getFaitObjetAction()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_ZONE_RECHERCHE__NUMERO:
				return getNumero();
			case SchemaPackage.TYPE_ZONE_RECHERCHE__VERSION:
				return getVersion();
			case SchemaPackage.TYPE_ZONE_RECHERCHE__PRIORITE_ZONE:
				return getPrioriteZone();
			case SchemaPackage.TYPE_ZONE_RECHERCHE__DEBUT_RECHERCHE:
				return getDebutRecherche();
			case SchemaPackage.TYPE_ZONE_RECHERCHE__FIN_RECHERCHE:
				return getFinRecherche();
			case SchemaPackage.TYPE_ZONE_RECHERCHE__FAIT_OBJET_ACTION:
				return getFaitObjetAction();
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
			case SchemaPackage.TYPE_ZONE_RECHERCHE__NUMERO:
				setNumero((String)newValue);
				return;
			case SchemaPackage.TYPE_ZONE_RECHERCHE__VERSION:
				setVersion((String)newValue);
				return;
			case SchemaPackage.TYPE_ZONE_RECHERCHE__PRIORITE_ZONE:
				setPrioriteZone((TypeDictionaryDicoImportance)newValue);
				return;
			case SchemaPackage.TYPE_ZONE_RECHERCHE__DEBUT_RECHERCHE:
				setDebutRecherche((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_ZONE_RECHERCHE__FIN_RECHERCHE:
				setFinRecherche((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_ZONE_RECHERCHE__FAIT_OBJET_ACTION:
				getFaitObjetAction().clear();
				getFaitObjetAction().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_ZONE_RECHERCHE__NUMERO:
				setNumero(NUMERO_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ZONE_RECHERCHE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ZONE_RECHERCHE__PRIORITE_ZONE:
				unsetPrioriteZone();
				return;
			case SchemaPackage.TYPE_ZONE_RECHERCHE__DEBUT_RECHERCHE:
				setDebutRecherche(DEBUT_RECHERCHE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ZONE_RECHERCHE__FIN_RECHERCHE:
				setFinRecherche(FIN_RECHERCHE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ZONE_RECHERCHE__FAIT_OBJET_ACTION:
				getFaitObjetAction().clear();
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
			case SchemaPackage.TYPE_ZONE_RECHERCHE__NUMERO:
				return NUMERO_EDEFAULT == null ? numero != null : !NUMERO_EDEFAULT.equals(numero);
			case SchemaPackage.TYPE_ZONE_RECHERCHE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case SchemaPackage.TYPE_ZONE_RECHERCHE__PRIORITE_ZONE:
				return isSetPrioriteZone();
			case SchemaPackage.TYPE_ZONE_RECHERCHE__DEBUT_RECHERCHE:
				return DEBUT_RECHERCHE_EDEFAULT == null ? debutRecherche != null : !DEBUT_RECHERCHE_EDEFAULT.equals(debutRecherche);
			case SchemaPackage.TYPE_ZONE_RECHERCHE__FIN_RECHERCHE:
				return FIN_RECHERCHE_EDEFAULT == null ? finRecherche != null : !FIN_RECHERCHE_EDEFAULT.equals(finRecherche);
			case SchemaPackage.TYPE_ZONE_RECHERCHE__FAIT_OBJET_ACTION:
				return faitObjetAction != null && !faitObjetAction.isEmpty();
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
		result.append(" (numero: ");
		result.append(numero);
		result.append(", version: ");
		result.append(version);
		result.append(", prioriteZone: ");
		if (prioriteZoneESet) result.append(prioriteZone); else result.append("<unset>");
		result.append(", debutRecherche: ");
		result.append(debutRecherche);
		result.append(", finRecherche: ");
		result.append(finRecherche);
		result.append(')');
		return result.toString();
	}

} //TypeZoneRechercheImpl
