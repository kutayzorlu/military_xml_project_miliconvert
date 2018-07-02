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
import mpia.schema.TypeMoyensTriage;
import mpia.schema.TypeTriage;

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
 * An implementation of the model object '<em><b>Type Triage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeTriageImpl#getDateDActivation <em>Date DActivation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTriageImpl#getDateDesactivation <em>Date Desactivation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTriageImpl#getMoyensDetraitementInterIntra <em>Moyens Detraitement Inter Intra</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTriageImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTriageImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTriageImpl#getAPourLocalisationAutreElementControle <em>APour Localisation Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTriageImpl#getAPourSectionTriagesMoyensTriage <em>APour Section Triages Moyens Triage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTriageImpl#getAPourAutresMoyensMilitaireTerreMoyensTriage <em>APour Autres Moyens Militaire Terre Moyens Triage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeTriageImpl extends EObjectImpl implements TypeTriage {
	/**
	 * The default value of the '{@link #getDateDActivation() <em>Date DActivation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDActivation()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_DACTIVATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateDActivation() <em>Date DActivation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDActivation()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateDActivation = DATE_DACTIVATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateDesactivation() <em>Date Desactivation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDesactivation()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_DESACTIVATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateDesactivation() <em>Date Desactivation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDesactivation()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateDesactivation = DATE_DESACTIVATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMoyensDetraitementInterIntra() <em>Moyens Detraitement Inter Intra</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyensDetraitementInterIntra()
	 * @generated
	 * @ordered
	 */
	protected static final String MOYENS_DETRAITEMENT_INTER_INTRA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMoyensDetraitementInterIntra() <em>Moyens Detraitement Inter Intra</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyensDetraitementInterIntra()
	 * @generated
	 * @ordered
	 */
	protected String moyensDetraitementInterIntra = MOYENS_DETRAITEMENT_INTER_INTRA_EDEFAULT;

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
	 * The cached value of the '{@link #getAPourLocalisationAutreElementControle() <em>APour Localisation Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourLocalisationAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourLocalisationAutreElementControle;

	/**
	 * The cached value of the '{@link #getAPourSectionTriagesMoyensTriage() <em>APour Section Triages Moyens Triage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourSectionTriagesMoyensTriage()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeMoyensTriage> aPourSectionTriagesMoyensTriage;

	/**
	 * The cached value of the '{@link #getAPourAutresMoyensMilitaireTerreMoyensTriage() <em>APour Autres Moyens Militaire Terre Moyens Triage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourAutresMoyensMilitaireTerreMoyensTriage()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeMoyensTriage> aPourAutresMoyensMilitaireTerreMoyensTriage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeTriageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeTriage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateDActivation() {
		return dateDActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateDActivation(XMLGregorianCalendar newDateDActivation) {
		XMLGregorianCalendar oldDateDActivation = dateDActivation;
		dateDActivation = newDateDActivation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRIAGE__DATE_DACTIVATION, oldDateDActivation, dateDActivation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateDesactivation() {
		return dateDesactivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateDesactivation(XMLGregorianCalendar newDateDesactivation) {
		XMLGregorianCalendar oldDateDesactivation = dateDesactivation;
		dateDesactivation = newDateDesactivation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRIAGE__DATE_DESACTIVATION, oldDateDesactivation, dateDesactivation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMoyensDetraitementInterIntra() {
		return moyensDetraitementInterIntra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoyensDetraitementInterIntra(String newMoyensDetraitementInterIntra) {
		String oldMoyensDetraitementInterIntra = moyensDetraitementInterIntra;
		moyensDetraitementInterIntra = newMoyensDetraitementInterIntra;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRIAGE__MOYENS_DETRAITEMENT_INTER_INTRA, oldMoyensDetraitementInterIntra, moyensDetraitementInterIntra));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRIAGE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRIAGE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourLocalisationAutreElementControle() {
		return aPourLocalisationAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourLocalisationAutreElementControle(TypeAssociation newAPourLocalisationAutreElementControle, NotificationChain msgs) {
		TypeAssociation oldAPourLocalisationAutreElementControle = aPourLocalisationAutreElementControle;
		aPourLocalisationAutreElementControle = newAPourLocalisationAutreElementControle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRIAGE__APOUR_LOCALISATION_AUTRE_ELEMENT_CONTROLE, oldAPourLocalisationAutreElementControle, newAPourLocalisationAutreElementControle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourLocalisationAutreElementControle(TypeAssociation newAPourLocalisationAutreElementControle) {
		if (newAPourLocalisationAutreElementControle != aPourLocalisationAutreElementControle) {
			NotificationChain msgs = null;
			if (aPourLocalisationAutreElementControle != null)
				msgs = ((InternalEObject)aPourLocalisationAutreElementControle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TRIAGE__APOUR_LOCALISATION_AUTRE_ELEMENT_CONTROLE, null, msgs);
			if (newAPourLocalisationAutreElementControle != null)
				msgs = ((InternalEObject)newAPourLocalisationAutreElementControle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TRIAGE__APOUR_LOCALISATION_AUTRE_ELEMENT_CONTROLE, null, msgs);
			msgs = basicSetAPourLocalisationAutreElementControle(newAPourLocalisationAutreElementControle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TRIAGE__APOUR_LOCALISATION_AUTRE_ELEMENT_CONTROLE, newAPourLocalisationAutreElementControle, newAPourLocalisationAutreElementControle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeMoyensTriage> getAPourSectionTriagesMoyensTriage() {
		if (aPourSectionTriagesMoyensTriage == null) {
			aPourSectionTriagesMoyensTriage = new EObjectContainmentEList<TypeMoyensTriage>(TypeMoyensTriage.class, this, SchemaPackage.TYPE_TRIAGE__APOUR_SECTION_TRIAGES_MOYENS_TRIAGE);
		}
		return aPourSectionTriagesMoyensTriage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeMoyensTriage> getAPourAutresMoyensMilitaireTerreMoyensTriage() {
		if (aPourAutresMoyensMilitaireTerreMoyensTriage == null) {
			aPourAutresMoyensMilitaireTerreMoyensTriage = new EObjectContainmentEList<TypeMoyensTriage>(TypeMoyensTriage.class, this, SchemaPackage.TYPE_TRIAGE__APOUR_AUTRES_MOYENS_MILITAIRE_TERRE_MOYENS_TRIAGE);
		}
		return aPourAutresMoyensMilitaireTerreMoyensTriage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_TRIAGE__APOUR_LOCALISATION_AUTRE_ELEMENT_CONTROLE:
				return basicSetAPourLocalisationAutreElementControle(null, msgs);
			case SchemaPackage.TYPE_TRIAGE__APOUR_SECTION_TRIAGES_MOYENS_TRIAGE:
				return ((InternalEList<?>)getAPourSectionTriagesMoyensTriage()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_TRIAGE__APOUR_AUTRES_MOYENS_MILITAIRE_TERRE_MOYENS_TRIAGE:
				return ((InternalEList<?>)getAPourAutresMoyensMilitaireTerreMoyensTriage()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_TRIAGE__DATE_DACTIVATION:
				return getDateDActivation();
			case SchemaPackage.TYPE_TRIAGE__DATE_DESACTIVATION:
				return getDateDesactivation();
			case SchemaPackage.TYPE_TRIAGE__MOYENS_DETRAITEMENT_INTER_INTRA:
				return getMoyensDetraitementInterIntra();
			case SchemaPackage.TYPE_TRIAGE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_TRIAGE__CE:
				return getCE();
			case SchemaPackage.TYPE_TRIAGE__APOUR_LOCALISATION_AUTRE_ELEMENT_CONTROLE:
				return getAPourLocalisationAutreElementControle();
			case SchemaPackage.TYPE_TRIAGE__APOUR_SECTION_TRIAGES_MOYENS_TRIAGE:
				return getAPourSectionTriagesMoyensTriage();
			case SchemaPackage.TYPE_TRIAGE__APOUR_AUTRES_MOYENS_MILITAIRE_TERRE_MOYENS_TRIAGE:
				return getAPourAutresMoyensMilitaireTerreMoyensTriage();
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
			case SchemaPackage.TYPE_TRIAGE__DATE_DACTIVATION:
				setDateDActivation((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_TRIAGE__DATE_DESACTIVATION:
				setDateDesactivation((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_TRIAGE__MOYENS_DETRAITEMENT_INTER_INTRA:
				setMoyensDetraitementInterIntra((String)newValue);
				return;
			case SchemaPackage.TYPE_TRIAGE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_TRIAGE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_TRIAGE__APOUR_LOCALISATION_AUTRE_ELEMENT_CONTROLE:
				setAPourLocalisationAutreElementControle((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_TRIAGE__APOUR_SECTION_TRIAGES_MOYENS_TRIAGE:
				getAPourSectionTriagesMoyensTriage().clear();
				getAPourSectionTriagesMoyensTriage().addAll((Collection<? extends TypeMoyensTriage>)newValue);
				return;
			case SchemaPackage.TYPE_TRIAGE__APOUR_AUTRES_MOYENS_MILITAIRE_TERRE_MOYENS_TRIAGE:
				getAPourAutresMoyensMilitaireTerreMoyensTriage().clear();
				getAPourAutresMoyensMilitaireTerreMoyensTriage().addAll((Collection<? extends TypeMoyensTriage>)newValue);
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
			case SchemaPackage.TYPE_TRIAGE__DATE_DACTIVATION:
				setDateDActivation(DATE_DACTIVATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TRIAGE__DATE_DESACTIVATION:
				setDateDesactivation(DATE_DESACTIVATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TRIAGE__MOYENS_DETRAITEMENT_INTER_INTRA:
				setMoyensDetraitementInterIntra(MOYENS_DETRAITEMENT_INTER_INTRA_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TRIAGE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TRIAGE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TRIAGE__APOUR_LOCALISATION_AUTRE_ELEMENT_CONTROLE:
				setAPourLocalisationAutreElementControle((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_TRIAGE__APOUR_SECTION_TRIAGES_MOYENS_TRIAGE:
				getAPourSectionTriagesMoyensTriage().clear();
				return;
			case SchemaPackage.TYPE_TRIAGE__APOUR_AUTRES_MOYENS_MILITAIRE_TERRE_MOYENS_TRIAGE:
				getAPourAutresMoyensMilitaireTerreMoyensTriage().clear();
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
			case SchemaPackage.TYPE_TRIAGE__DATE_DACTIVATION:
				return DATE_DACTIVATION_EDEFAULT == null ? dateDActivation != null : !DATE_DACTIVATION_EDEFAULT.equals(dateDActivation);
			case SchemaPackage.TYPE_TRIAGE__DATE_DESACTIVATION:
				return DATE_DESACTIVATION_EDEFAULT == null ? dateDesactivation != null : !DATE_DESACTIVATION_EDEFAULT.equals(dateDesactivation);
			case SchemaPackage.TYPE_TRIAGE__MOYENS_DETRAITEMENT_INTER_INTRA:
				return MOYENS_DETRAITEMENT_INTER_INTRA_EDEFAULT == null ? moyensDetraitementInterIntra != null : !MOYENS_DETRAITEMENT_INTER_INTRA_EDEFAULT.equals(moyensDetraitementInterIntra);
			case SchemaPackage.TYPE_TRIAGE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_TRIAGE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_TRIAGE__APOUR_LOCALISATION_AUTRE_ELEMENT_CONTROLE:
				return aPourLocalisationAutreElementControle != null;
			case SchemaPackage.TYPE_TRIAGE__APOUR_SECTION_TRIAGES_MOYENS_TRIAGE:
				return aPourSectionTriagesMoyensTriage != null && !aPourSectionTriagesMoyensTriage.isEmpty();
			case SchemaPackage.TYPE_TRIAGE__APOUR_AUTRES_MOYENS_MILITAIRE_TERRE_MOYENS_TRIAGE:
				return aPourAutresMoyensMilitaireTerreMoyensTriage != null && !aPourAutresMoyensMilitaireTerreMoyensTriage.isEmpty();
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
		result.append(" (dateDActivation: ");
		result.append(dateDActivation);
		result.append(", dateDesactivation: ");
		result.append(dateDesactivation);
		result.append(", moyensDetraitementInterIntra: ");
		result.append(moyensDetraitementInterIntra);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeTriageImpl
