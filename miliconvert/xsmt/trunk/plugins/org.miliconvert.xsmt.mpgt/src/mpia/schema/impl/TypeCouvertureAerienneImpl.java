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
import mpia.schema.TypeCouvertureAerienne;
import mpia.schema.TypeDictionaryDicoSuperioriteAerienne;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Couverture Aerienne</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeCouvertureAerienneImpl#getDegreSuperioriteAerienneGlobale <em>Degre Superiorite Aerienne Globale</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCouvertureAerienneImpl#getDegreSuperioriteAerienneLocale <em>Degre Superiorite Aerienne Locale</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCouvertureAerienneImpl#getDebutTempsSituationParticuliere <em>Debut Temps Situation Particuliere</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCouvertureAerienneImpl#getFinTempsSituationParticuliere <em>Fin Temps Situation Particuliere</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCouvertureAerienneImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCouvertureAerienneImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCouvertureAerienneImpl#getConcerneZoneAutreElementControle <em>Concerne Zone Autre Element Controle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeCouvertureAerienneImpl extends EObjectImpl implements TypeCouvertureAerienne {
	/**
	 * The default value of the '{@link #getDegreSuperioriteAerienneGlobale() <em>Degre Superiorite Aerienne Globale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegreSuperioriteAerienneGlobale()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoSuperioriteAerienne DEGRE_SUPERIORITE_AERIENNE_GLOBALE_EDEFAULT = TypeDictionaryDicoSuperioriteAerienne.FSUP;

	/**
	 * The cached value of the '{@link #getDegreSuperioriteAerienneGlobale() <em>Degre Superiorite Aerienne Globale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegreSuperioriteAerienneGlobale()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoSuperioriteAerienne degreSuperioriteAerienneGlobale = DEGRE_SUPERIORITE_AERIENNE_GLOBALE_EDEFAULT;

	/**
	 * This is true if the Degre Superiorite Aerienne Globale attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean degreSuperioriteAerienneGlobaleESet;

	/**
	 * The default value of the '{@link #getDegreSuperioriteAerienneLocale() <em>Degre Superiorite Aerienne Locale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegreSuperioriteAerienneLocale()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoSuperioriteAerienne DEGRE_SUPERIORITE_AERIENNE_LOCALE_EDEFAULT = TypeDictionaryDicoSuperioriteAerienne.FSUP;

	/**
	 * The cached value of the '{@link #getDegreSuperioriteAerienneLocale() <em>Degre Superiorite Aerienne Locale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegreSuperioriteAerienneLocale()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoSuperioriteAerienne degreSuperioriteAerienneLocale = DEGRE_SUPERIORITE_AERIENNE_LOCALE_EDEFAULT;

	/**
	 * This is true if the Degre Superiorite Aerienne Locale attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean degreSuperioriteAerienneLocaleESet;

	/**
	 * The default value of the '{@link #getDebutTempsSituationParticuliere() <em>Debut Temps Situation Particuliere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebutTempsSituationParticuliere()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DEBUT_TEMPS_SITUATION_PARTICULIERE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDebutTempsSituationParticuliere() <em>Debut Temps Situation Particuliere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebutTempsSituationParticuliere()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar debutTempsSituationParticuliere = DEBUT_TEMPS_SITUATION_PARTICULIERE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinTempsSituationParticuliere() <em>Fin Temps Situation Particuliere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinTempsSituationParticuliere()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar FIN_TEMPS_SITUATION_PARTICULIERE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFinTempsSituationParticuliere() <em>Fin Temps Situation Particuliere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinTempsSituationParticuliere()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar finTempsSituationParticuliere = FIN_TEMPS_SITUATION_PARTICULIERE_EDEFAULT;

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
	 * The cached value of the '{@link #getConcerneZoneAutreElementControle() <em>Concerne Zone Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneZoneAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation concerneZoneAutreElementControle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeCouvertureAerienneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeCouvertureAerienne();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoSuperioriteAerienne getDegreSuperioriteAerienneGlobale() {
		return degreSuperioriteAerienneGlobale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDegreSuperioriteAerienneGlobale(TypeDictionaryDicoSuperioriteAerienne newDegreSuperioriteAerienneGlobale) {
		TypeDictionaryDicoSuperioriteAerienne oldDegreSuperioriteAerienneGlobale = degreSuperioriteAerienneGlobale;
		degreSuperioriteAerienneGlobale = newDegreSuperioriteAerienneGlobale == null ? DEGRE_SUPERIORITE_AERIENNE_GLOBALE_EDEFAULT : newDegreSuperioriteAerienneGlobale;
		boolean oldDegreSuperioriteAerienneGlobaleESet = degreSuperioriteAerienneGlobaleESet;
		degreSuperioriteAerienneGlobaleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COUVERTURE_AERIENNE__DEGRE_SUPERIORITE_AERIENNE_GLOBALE, oldDegreSuperioriteAerienneGlobale, degreSuperioriteAerienneGlobale, !oldDegreSuperioriteAerienneGlobaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDegreSuperioriteAerienneGlobale() {
		TypeDictionaryDicoSuperioriteAerienne oldDegreSuperioriteAerienneGlobale = degreSuperioriteAerienneGlobale;
		boolean oldDegreSuperioriteAerienneGlobaleESet = degreSuperioriteAerienneGlobaleESet;
		degreSuperioriteAerienneGlobale = DEGRE_SUPERIORITE_AERIENNE_GLOBALE_EDEFAULT;
		degreSuperioriteAerienneGlobaleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_COUVERTURE_AERIENNE__DEGRE_SUPERIORITE_AERIENNE_GLOBALE, oldDegreSuperioriteAerienneGlobale, DEGRE_SUPERIORITE_AERIENNE_GLOBALE_EDEFAULT, oldDegreSuperioriteAerienneGlobaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDegreSuperioriteAerienneGlobale() {
		return degreSuperioriteAerienneGlobaleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoSuperioriteAerienne getDegreSuperioriteAerienneLocale() {
		return degreSuperioriteAerienneLocale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDegreSuperioriteAerienneLocale(TypeDictionaryDicoSuperioriteAerienne newDegreSuperioriteAerienneLocale) {
		TypeDictionaryDicoSuperioriteAerienne oldDegreSuperioriteAerienneLocale = degreSuperioriteAerienneLocale;
		degreSuperioriteAerienneLocale = newDegreSuperioriteAerienneLocale == null ? DEGRE_SUPERIORITE_AERIENNE_LOCALE_EDEFAULT : newDegreSuperioriteAerienneLocale;
		boolean oldDegreSuperioriteAerienneLocaleESet = degreSuperioriteAerienneLocaleESet;
		degreSuperioriteAerienneLocaleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COUVERTURE_AERIENNE__DEGRE_SUPERIORITE_AERIENNE_LOCALE, oldDegreSuperioriteAerienneLocale, degreSuperioriteAerienneLocale, !oldDegreSuperioriteAerienneLocaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDegreSuperioriteAerienneLocale() {
		TypeDictionaryDicoSuperioriteAerienne oldDegreSuperioriteAerienneLocale = degreSuperioriteAerienneLocale;
		boolean oldDegreSuperioriteAerienneLocaleESet = degreSuperioriteAerienneLocaleESet;
		degreSuperioriteAerienneLocale = DEGRE_SUPERIORITE_AERIENNE_LOCALE_EDEFAULT;
		degreSuperioriteAerienneLocaleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_COUVERTURE_AERIENNE__DEGRE_SUPERIORITE_AERIENNE_LOCALE, oldDegreSuperioriteAerienneLocale, DEGRE_SUPERIORITE_AERIENNE_LOCALE_EDEFAULT, oldDegreSuperioriteAerienneLocaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDegreSuperioriteAerienneLocale() {
		return degreSuperioriteAerienneLocaleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDebutTempsSituationParticuliere() {
		return debutTempsSituationParticuliere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDebutTempsSituationParticuliere(XMLGregorianCalendar newDebutTempsSituationParticuliere) {
		XMLGregorianCalendar oldDebutTempsSituationParticuliere = debutTempsSituationParticuliere;
		debutTempsSituationParticuliere = newDebutTempsSituationParticuliere;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COUVERTURE_AERIENNE__DEBUT_TEMPS_SITUATION_PARTICULIERE, oldDebutTempsSituationParticuliere, debutTempsSituationParticuliere));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getFinTempsSituationParticuliere() {
		return finTempsSituationParticuliere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinTempsSituationParticuliere(XMLGregorianCalendar newFinTempsSituationParticuliere) {
		XMLGregorianCalendar oldFinTempsSituationParticuliere = finTempsSituationParticuliere;
		finTempsSituationParticuliere = newFinTempsSituationParticuliere;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COUVERTURE_AERIENNE__FIN_TEMPS_SITUATION_PARTICULIERE, oldFinTempsSituationParticuliere, finTempsSituationParticuliere));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COUVERTURE_AERIENNE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COUVERTURE_AERIENNE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getConcerneZoneAutreElementControle() {
		return concerneZoneAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcerneZoneAutreElementControle(TypeAssociation newConcerneZoneAutreElementControle, NotificationChain msgs) {
		TypeAssociation oldConcerneZoneAutreElementControle = concerneZoneAutreElementControle;
		concerneZoneAutreElementControle = newConcerneZoneAutreElementControle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COUVERTURE_AERIENNE__CONCERNE_ZONE_AUTRE_ELEMENT_CONTROLE, oldConcerneZoneAutreElementControle, newConcerneZoneAutreElementControle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcerneZoneAutreElementControle(TypeAssociation newConcerneZoneAutreElementControle) {
		if (newConcerneZoneAutreElementControle != concerneZoneAutreElementControle) {
			NotificationChain msgs = null;
			if (concerneZoneAutreElementControle != null)
				msgs = ((InternalEObject)concerneZoneAutreElementControle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_COUVERTURE_AERIENNE__CONCERNE_ZONE_AUTRE_ELEMENT_CONTROLE, null, msgs);
			if (newConcerneZoneAutreElementControle != null)
				msgs = ((InternalEObject)newConcerneZoneAutreElementControle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_COUVERTURE_AERIENNE__CONCERNE_ZONE_AUTRE_ELEMENT_CONTROLE, null, msgs);
			msgs = basicSetConcerneZoneAutreElementControle(newConcerneZoneAutreElementControle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COUVERTURE_AERIENNE__CONCERNE_ZONE_AUTRE_ELEMENT_CONTROLE, newConcerneZoneAutreElementControle, newConcerneZoneAutreElementControle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_COUVERTURE_AERIENNE__CONCERNE_ZONE_AUTRE_ELEMENT_CONTROLE:
				return basicSetConcerneZoneAutreElementControle(null, msgs);
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
			case SchemaPackage.TYPE_COUVERTURE_AERIENNE__DEGRE_SUPERIORITE_AERIENNE_GLOBALE:
				return getDegreSuperioriteAerienneGlobale();
			case SchemaPackage.TYPE_COUVERTURE_AERIENNE__DEGRE_SUPERIORITE_AERIENNE_LOCALE:
				return getDegreSuperioriteAerienneLocale();
			case SchemaPackage.TYPE_COUVERTURE_AERIENNE__DEBUT_TEMPS_SITUATION_PARTICULIERE:
				return getDebutTempsSituationParticuliere();
			case SchemaPackage.TYPE_COUVERTURE_AERIENNE__FIN_TEMPS_SITUATION_PARTICULIERE:
				return getFinTempsSituationParticuliere();
			case SchemaPackage.TYPE_COUVERTURE_AERIENNE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_COUVERTURE_AERIENNE__CE:
				return getCE();
			case SchemaPackage.TYPE_COUVERTURE_AERIENNE__CONCERNE_ZONE_AUTRE_ELEMENT_CONTROLE:
				return getConcerneZoneAutreElementControle();
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
			case SchemaPackage.TYPE_COUVERTURE_AERIENNE__DEGRE_SUPERIORITE_AERIENNE_GLOBALE:
				setDegreSuperioriteAerienneGlobale((TypeDictionaryDicoSuperioriteAerienne)newValue);
				return;
			case SchemaPackage.TYPE_COUVERTURE_AERIENNE__DEGRE_SUPERIORITE_AERIENNE_LOCALE:
				setDegreSuperioriteAerienneLocale((TypeDictionaryDicoSuperioriteAerienne)newValue);
				return;
			case SchemaPackage.TYPE_COUVERTURE_AERIENNE__DEBUT_TEMPS_SITUATION_PARTICULIERE:
				setDebutTempsSituationParticuliere((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_COUVERTURE_AERIENNE__FIN_TEMPS_SITUATION_PARTICULIERE:
				setFinTempsSituationParticuliere((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_COUVERTURE_AERIENNE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_COUVERTURE_AERIENNE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_COUVERTURE_AERIENNE__CONCERNE_ZONE_AUTRE_ELEMENT_CONTROLE:
				setConcerneZoneAutreElementControle((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_COUVERTURE_AERIENNE__DEGRE_SUPERIORITE_AERIENNE_GLOBALE:
				unsetDegreSuperioriteAerienneGlobale();
				return;
			case SchemaPackage.TYPE_COUVERTURE_AERIENNE__DEGRE_SUPERIORITE_AERIENNE_LOCALE:
				unsetDegreSuperioriteAerienneLocale();
				return;
			case SchemaPackage.TYPE_COUVERTURE_AERIENNE__DEBUT_TEMPS_SITUATION_PARTICULIERE:
				setDebutTempsSituationParticuliere(DEBUT_TEMPS_SITUATION_PARTICULIERE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_COUVERTURE_AERIENNE__FIN_TEMPS_SITUATION_PARTICULIERE:
				setFinTempsSituationParticuliere(FIN_TEMPS_SITUATION_PARTICULIERE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_COUVERTURE_AERIENNE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_COUVERTURE_AERIENNE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_COUVERTURE_AERIENNE__CONCERNE_ZONE_AUTRE_ELEMENT_CONTROLE:
				setConcerneZoneAutreElementControle((TypeAssociation)null);
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
			case SchemaPackage.TYPE_COUVERTURE_AERIENNE__DEGRE_SUPERIORITE_AERIENNE_GLOBALE:
				return isSetDegreSuperioriteAerienneGlobale();
			case SchemaPackage.TYPE_COUVERTURE_AERIENNE__DEGRE_SUPERIORITE_AERIENNE_LOCALE:
				return isSetDegreSuperioriteAerienneLocale();
			case SchemaPackage.TYPE_COUVERTURE_AERIENNE__DEBUT_TEMPS_SITUATION_PARTICULIERE:
				return DEBUT_TEMPS_SITUATION_PARTICULIERE_EDEFAULT == null ? debutTempsSituationParticuliere != null : !DEBUT_TEMPS_SITUATION_PARTICULIERE_EDEFAULT.equals(debutTempsSituationParticuliere);
			case SchemaPackage.TYPE_COUVERTURE_AERIENNE__FIN_TEMPS_SITUATION_PARTICULIERE:
				return FIN_TEMPS_SITUATION_PARTICULIERE_EDEFAULT == null ? finTempsSituationParticuliere != null : !FIN_TEMPS_SITUATION_PARTICULIERE_EDEFAULT.equals(finTempsSituationParticuliere);
			case SchemaPackage.TYPE_COUVERTURE_AERIENNE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_COUVERTURE_AERIENNE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_COUVERTURE_AERIENNE__CONCERNE_ZONE_AUTRE_ELEMENT_CONTROLE:
				return concerneZoneAutreElementControle != null;
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
		result.append(" (degreSuperioriteAerienneGlobale: ");
		if (degreSuperioriteAerienneGlobaleESet) result.append(degreSuperioriteAerienneGlobale); else result.append("<unset>");
		result.append(", degreSuperioriteAerienneLocale: ");
		if (degreSuperioriteAerienneLocaleESet) result.append(degreSuperioriteAerienneLocale); else result.append("<unset>");
		result.append(", debutTempsSituationParticuliere: ");
		result.append(debutTempsSituationParticuliere);
		result.append(", finTempsSituationParticuliere: ");
		result.append(finTempsSituationParticuliere);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeCouvertureAerienneImpl
