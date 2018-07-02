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
import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDeploiementMARTHA;

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
 * An implementation of the model object '<em><b>Type Deploiement MARTHA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeDeploiementMARTHAImpl#getDeploiementARealiser <em>Deploiement ARealiser</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDeploiementMARTHAImpl#getNombreNC23disponibles <em>Nombre NC2 3disponibles</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDeploiementMARTHAImpl#getHeureDebutActivite <em>Heure Debut Activite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDeploiementMARTHAImpl#getHeureFinActivite <em>Heure Fin Activite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDeploiementMARTHAImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDeploiementMARTHAImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDeploiementMARTHAImpl#getConcerneZoneGlobaleAutreElementControle <em>Concerne Zone Globale Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDeploiementMARTHAImpl#getConcerneCentresNC23Unite <em>Concerne Centres NC23 Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeDeploiementMARTHAImpl extends EObjectImpl implements TypeDeploiementMARTHA {
	/**
	 * The default value of the '{@link #getDeploiementARealiser() <em>Deploiement ARealiser</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploiementARealiser()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPLOIEMENT_AREALISER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeploiementARealiser() <em>Deploiement ARealiser</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploiementARealiser()
	 * @generated
	 * @ordered
	 */
	protected String deploiementARealiser = DEPLOIEMENT_AREALISER_EDEFAULT;

	/**
	 * The default value of the '{@link #getNombreNC23disponibles() <em>Nombre NC2 3disponibles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreNC23disponibles()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_NC2_3DISPONIBLES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreNC23disponibles() <em>Nombre NC2 3disponibles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreNC23disponibles()
	 * @generated
	 * @ordered
	 */
	protected long nombreNC23disponibles = NOMBRE_NC2_3DISPONIBLES_EDEFAULT;

	/**
	 * This is true if the Nombre NC2 3disponibles attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreNC23disponiblesESet;

	/**
	 * The default value of the '{@link #getHeureDebutActivite() <em>Heure Debut Activite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeureDebutActivite()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar HEURE_DEBUT_ACTIVITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeureDebutActivite() <em>Heure Debut Activite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeureDebutActivite()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar heureDebutActivite = HEURE_DEBUT_ACTIVITE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeureFinActivite() <em>Heure Fin Activite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeureFinActivite()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar HEURE_FIN_ACTIVITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeureFinActivite() <em>Heure Fin Activite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeureFinActivite()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar heureFinActivite = HEURE_FIN_ACTIVITE_EDEFAULT;

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
	 * The cached value of the '{@link #getConcerneZoneGlobaleAutreElementControle() <em>Concerne Zone Globale Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneZoneGlobaleAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation concerneZoneGlobaleAutreElementControle;

	/**
	 * The cached value of the '{@link #getConcerneCentresNC23Unite() <em>Concerne Centres NC23 Unite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneCentresNC23Unite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociationEXT> concerneCentresNC23Unite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeDeploiementMARTHAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeDeploiementMARTHA();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeploiementARealiser() {
		return deploiementARealiser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeploiementARealiser(String newDeploiementARealiser) {
		String oldDeploiementARealiser = deploiementARealiser;
		deploiementARealiser = newDeploiementARealiser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEPLOIEMENT_MARTHA__DEPLOIEMENT_AREALISER, oldDeploiementARealiser, deploiementARealiser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreNC23disponibles() {
		return nombreNC23disponibles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreNC23disponibles(long newNombreNC23disponibles) {
		long oldNombreNC23disponibles = nombreNC23disponibles;
		nombreNC23disponibles = newNombreNC23disponibles;
		boolean oldNombreNC23disponiblesESet = nombreNC23disponiblesESet;
		nombreNC23disponiblesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEPLOIEMENT_MARTHA__NOMBRE_NC2_3DISPONIBLES, oldNombreNC23disponibles, nombreNC23disponibles, !oldNombreNC23disponiblesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreNC23disponibles() {
		long oldNombreNC23disponibles = nombreNC23disponibles;
		boolean oldNombreNC23disponiblesESet = nombreNC23disponiblesESet;
		nombreNC23disponibles = NOMBRE_NC2_3DISPONIBLES_EDEFAULT;
		nombreNC23disponiblesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_DEPLOIEMENT_MARTHA__NOMBRE_NC2_3DISPONIBLES, oldNombreNC23disponibles, NOMBRE_NC2_3DISPONIBLES_EDEFAULT, oldNombreNC23disponiblesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreNC23disponibles() {
		return nombreNC23disponiblesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getHeureDebutActivite() {
		return heureDebutActivite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeureDebutActivite(XMLGregorianCalendar newHeureDebutActivite) {
		XMLGregorianCalendar oldHeureDebutActivite = heureDebutActivite;
		heureDebutActivite = newHeureDebutActivite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEPLOIEMENT_MARTHA__HEURE_DEBUT_ACTIVITE, oldHeureDebutActivite, heureDebutActivite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getHeureFinActivite() {
		return heureFinActivite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeureFinActivite(XMLGregorianCalendar newHeureFinActivite) {
		XMLGregorianCalendar oldHeureFinActivite = heureFinActivite;
		heureFinActivite = newHeureFinActivite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEPLOIEMENT_MARTHA__HEURE_FIN_ACTIVITE, oldHeureFinActivite, heureFinActivite));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEPLOIEMENT_MARTHA__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEPLOIEMENT_MARTHA__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getConcerneZoneGlobaleAutreElementControle() {
		return concerneZoneGlobaleAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcerneZoneGlobaleAutreElementControle(TypeAssociation newConcerneZoneGlobaleAutreElementControle, NotificationChain msgs) {
		TypeAssociation oldConcerneZoneGlobaleAutreElementControle = concerneZoneGlobaleAutreElementControle;
		concerneZoneGlobaleAutreElementControle = newConcerneZoneGlobaleAutreElementControle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEPLOIEMENT_MARTHA__CONCERNE_ZONE_GLOBALE_AUTRE_ELEMENT_CONTROLE, oldConcerneZoneGlobaleAutreElementControle, newConcerneZoneGlobaleAutreElementControle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcerneZoneGlobaleAutreElementControle(TypeAssociation newConcerneZoneGlobaleAutreElementControle) {
		if (newConcerneZoneGlobaleAutreElementControle != concerneZoneGlobaleAutreElementControle) {
			NotificationChain msgs = null;
			if (concerneZoneGlobaleAutreElementControle != null)
				msgs = ((InternalEObject)concerneZoneGlobaleAutreElementControle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DEPLOIEMENT_MARTHA__CONCERNE_ZONE_GLOBALE_AUTRE_ELEMENT_CONTROLE, null, msgs);
			if (newConcerneZoneGlobaleAutreElementControle != null)
				msgs = ((InternalEObject)newConcerneZoneGlobaleAutreElementControle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DEPLOIEMENT_MARTHA__CONCERNE_ZONE_GLOBALE_AUTRE_ELEMENT_CONTROLE, null, msgs);
			msgs = basicSetConcerneZoneGlobaleAutreElementControle(newConcerneZoneGlobaleAutreElementControle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEPLOIEMENT_MARTHA__CONCERNE_ZONE_GLOBALE_AUTRE_ELEMENT_CONTROLE, newConcerneZoneGlobaleAutreElementControle, newConcerneZoneGlobaleAutreElementControle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEXT> getConcerneCentresNC23Unite() {
		if (concerneCentresNC23Unite == null) {
			concerneCentresNC23Unite = new EObjectContainmentEList<TypeAssociationEXT>(TypeAssociationEXT.class, this, SchemaPackage.TYPE_DEPLOIEMENT_MARTHA__CONCERNE_CENTRES_NC23_UNITE);
		}
		return concerneCentresNC23Unite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_DEPLOIEMENT_MARTHA__CONCERNE_ZONE_GLOBALE_AUTRE_ELEMENT_CONTROLE:
				return basicSetConcerneZoneGlobaleAutreElementControle(null, msgs);
			case SchemaPackage.TYPE_DEPLOIEMENT_MARTHA__CONCERNE_CENTRES_NC23_UNITE:
				return ((InternalEList<?>)getConcerneCentresNC23Unite()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_DEPLOIEMENT_MARTHA__DEPLOIEMENT_AREALISER:
				return getDeploiementARealiser();
			case SchemaPackage.TYPE_DEPLOIEMENT_MARTHA__NOMBRE_NC2_3DISPONIBLES:
				return new Long(getNombreNC23disponibles());
			case SchemaPackage.TYPE_DEPLOIEMENT_MARTHA__HEURE_DEBUT_ACTIVITE:
				return getHeureDebutActivite();
			case SchemaPackage.TYPE_DEPLOIEMENT_MARTHA__HEURE_FIN_ACTIVITE:
				return getHeureFinActivite();
			case SchemaPackage.TYPE_DEPLOIEMENT_MARTHA__CTE:
				return getCTE();
			case SchemaPackage.TYPE_DEPLOIEMENT_MARTHA__CE:
				return getCE();
			case SchemaPackage.TYPE_DEPLOIEMENT_MARTHA__CONCERNE_ZONE_GLOBALE_AUTRE_ELEMENT_CONTROLE:
				return getConcerneZoneGlobaleAutreElementControle();
			case SchemaPackage.TYPE_DEPLOIEMENT_MARTHA__CONCERNE_CENTRES_NC23_UNITE:
				return getConcerneCentresNC23Unite();
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
			case SchemaPackage.TYPE_DEPLOIEMENT_MARTHA__DEPLOIEMENT_AREALISER:
				setDeploiementARealiser((String)newValue);
				return;
			case SchemaPackage.TYPE_DEPLOIEMENT_MARTHA__NOMBRE_NC2_3DISPONIBLES:
				setNombreNC23disponibles(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_DEPLOIEMENT_MARTHA__HEURE_DEBUT_ACTIVITE:
				setHeureDebutActivite((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_DEPLOIEMENT_MARTHA__HEURE_FIN_ACTIVITE:
				setHeureFinActivite((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_DEPLOIEMENT_MARTHA__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_DEPLOIEMENT_MARTHA__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_DEPLOIEMENT_MARTHA__CONCERNE_ZONE_GLOBALE_AUTRE_ELEMENT_CONTROLE:
				setConcerneZoneGlobaleAutreElementControle((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_DEPLOIEMENT_MARTHA__CONCERNE_CENTRES_NC23_UNITE:
				getConcerneCentresNC23Unite().clear();
				getConcerneCentresNC23Unite().addAll((Collection<? extends TypeAssociationEXT>)newValue);
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
			case SchemaPackage.TYPE_DEPLOIEMENT_MARTHA__DEPLOIEMENT_AREALISER:
				setDeploiementARealiser(DEPLOIEMENT_AREALISER_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DEPLOIEMENT_MARTHA__NOMBRE_NC2_3DISPONIBLES:
				unsetNombreNC23disponibles();
				return;
			case SchemaPackage.TYPE_DEPLOIEMENT_MARTHA__HEURE_DEBUT_ACTIVITE:
				setHeureDebutActivite(HEURE_DEBUT_ACTIVITE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DEPLOIEMENT_MARTHA__HEURE_FIN_ACTIVITE:
				setHeureFinActivite(HEURE_FIN_ACTIVITE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DEPLOIEMENT_MARTHA__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DEPLOIEMENT_MARTHA__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DEPLOIEMENT_MARTHA__CONCERNE_ZONE_GLOBALE_AUTRE_ELEMENT_CONTROLE:
				setConcerneZoneGlobaleAutreElementControle((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_DEPLOIEMENT_MARTHA__CONCERNE_CENTRES_NC23_UNITE:
				getConcerneCentresNC23Unite().clear();
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
			case SchemaPackage.TYPE_DEPLOIEMENT_MARTHA__DEPLOIEMENT_AREALISER:
				return DEPLOIEMENT_AREALISER_EDEFAULT == null ? deploiementARealiser != null : !DEPLOIEMENT_AREALISER_EDEFAULT.equals(deploiementARealiser);
			case SchemaPackage.TYPE_DEPLOIEMENT_MARTHA__NOMBRE_NC2_3DISPONIBLES:
				return isSetNombreNC23disponibles();
			case SchemaPackage.TYPE_DEPLOIEMENT_MARTHA__HEURE_DEBUT_ACTIVITE:
				return HEURE_DEBUT_ACTIVITE_EDEFAULT == null ? heureDebutActivite != null : !HEURE_DEBUT_ACTIVITE_EDEFAULT.equals(heureDebutActivite);
			case SchemaPackage.TYPE_DEPLOIEMENT_MARTHA__HEURE_FIN_ACTIVITE:
				return HEURE_FIN_ACTIVITE_EDEFAULT == null ? heureFinActivite != null : !HEURE_FIN_ACTIVITE_EDEFAULT.equals(heureFinActivite);
			case SchemaPackage.TYPE_DEPLOIEMENT_MARTHA__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_DEPLOIEMENT_MARTHA__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_DEPLOIEMENT_MARTHA__CONCERNE_ZONE_GLOBALE_AUTRE_ELEMENT_CONTROLE:
				return concerneZoneGlobaleAutreElementControle != null;
			case SchemaPackage.TYPE_DEPLOIEMENT_MARTHA__CONCERNE_CENTRES_NC23_UNITE:
				return concerneCentresNC23Unite != null && !concerneCentresNC23Unite.isEmpty();
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
		result.append(" (deploiementARealiser: ");
		result.append(deploiementARealiser);
		result.append(", nombreNC23disponibles: ");
		if (nombreNC23disponiblesESet) result.append(nombreNC23disponibles); else result.append("<unset>");
		result.append(", heureDebutActivite: ");
		result.append(heureDebutActivite);
		result.append(", heureFinActivite: ");
		result.append(heureFinActivite);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeDeploiementMARTHAImpl
