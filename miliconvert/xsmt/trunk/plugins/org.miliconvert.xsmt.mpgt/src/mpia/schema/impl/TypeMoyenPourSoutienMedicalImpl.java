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
import mpia.schema.TypeMoyenPourSoutienMedical;
import mpia.schema.TypeQuantiteTypeUnite;

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
 * An implementation of the model object '<em><b>Type Moyen Pour Soutien Medical</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMoyenPourSoutienMedicalImpl#getDebutDisponibilite <em>Debut Disponibilite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyenPourSoutienMedicalImpl#getFinDisponibilite <em>Fin Disponibilite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyenPourSoutienMedicalImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyenPourSoutienMedicalImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyenPourSoutienMedicalImpl#getAPourMoyenIdentifieUnite <em>APour Moyen Identifie Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyenPourSoutienMedicalImpl#getAPourLocalisationAutreElementControle <em>APour Localisation Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyenPourSoutienMedicalImpl#getAPourMoyenNonIdentifieQuantiteTypeUnite <em>APour Moyen Non Identifie Quantite Type Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMoyenPourSoutienMedicalImpl extends EObjectImpl implements TypeMoyenPourSoutienMedical {
	/**
	 * The default value of the '{@link #getDebutDisponibilite() <em>Debut Disponibilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebutDisponibilite()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DEBUT_DISPONIBILITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDebutDisponibilite() <em>Debut Disponibilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebutDisponibilite()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar debutDisponibilite = DEBUT_DISPONIBILITE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinDisponibilite() <em>Fin Disponibilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinDisponibilite()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar FIN_DISPONIBILITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFinDisponibilite() <em>Fin Disponibilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinDisponibilite()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar finDisponibilite = FIN_DISPONIBILITE_EDEFAULT;

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
	 * The cached value of the '{@link #getAPourMoyenIdentifieUnite() <em>APour Moyen Identifie Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourMoyenIdentifieUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aPourMoyenIdentifieUnite;

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
	 * The cached value of the '{@link #getAPourMoyenNonIdentifieQuantiteTypeUnite() <em>APour Moyen Non Identifie Quantite Type Unite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourMoyenNonIdentifieQuantiteTypeUnite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeQuantiteTypeUnite> aPourMoyenNonIdentifieQuantiteTypeUnite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMoyenPourSoutienMedicalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMoyenPourSoutienMedical();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDebutDisponibilite() {
		return debutDisponibilite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDebutDisponibilite(XMLGregorianCalendar newDebutDisponibilite) {
		XMLGregorianCalendar oldDebutDisponibilite = debutDisponibilite;
		debutDisponibilite = newDebutDisponibilite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYEN_POUR_SOUTIEN_MEDICAL__DEBUT_DISPONIBILITE, oldDebutDisponibilite, debutDisponibilite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getFinDisponibilite() {
		return finDisponibilite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinDisponibilite(XMLGregorianCalendar newFinDisponibilite) {
		XMLGregorianCalendar oldFinDisponibilite = finDisponibilite;
		finDisponibilite = newFinDisponibilite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYEN_POUR_SOUTIEN_MEDICAL__FIN_DISPONIBILITE, oldFinDisponibilite, finDisponibilite));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYEN_POUR_SOUTIEN_MEDICAL__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYEN_POUR_SOUTIEN_MEDICAL__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAPourMoyenIdentifieUnite() {
		return aPourMoyenIdentifieUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourMoyenIdentifieUnite(TypeAssociationEXT newAPourMoyenIdentifieUnite, NotificationChain msgs) {
		TypeAssociationEXT oldAPourMoyenIdentifieUnite = aPourMoyenIdentifieUnite;
		aPourMoyenIdentifieUnite = newAPourMoyenIdentifieUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYEN_POUR_SOUTIEN_MEDICAL__APOUR_MOYEN_IDENTIFIE_UNITE, oldAPourMoyenIdentifieUnite, newAPourMoyenIdentifieUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourMoyenIdentifieUnite(TypeAssociationEXT newAPourMoyenIdentifieUnite) {
		if (newAPourMoyenIdentifieUnite != aPourMoyenIdentifieUnite) {
			NotificationChain msgs = null;
			if (aPourMoyenIdentifieUnite != null)
				msgs = ((InternalEObject)aPourMoyenIdentifieUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MOYEN_POUR_SOUTIEN_MEDICAL__APOUR_MOYEN_IDENTIFIE_UNITE, null, msgs);
			if (newAPourMoyenIdentifieUnite != null)
				msgs = ((InternalEObject)newAPourMoyenIdentifieUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MOYEN_POUR_SOUTIEN_MEDICAL__APOUR_MOYEN_IDENTIFIE_UNITE, null, msgs);
			msgs = basicSetAPourMoyenIdentifieUnite(newAPourMoyenIdentifieUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYEN_POUR_SOUTIEN_MEDICAL__APOUR_MOYEN_IDENTIFIE_UNITE, newAPourMoyenIdentifieUnite, newAPourMoyenIdentifieUnite));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYEN_POUR_SOUTIEN_MEDICAL__APOUR_LOCALISATION_AUTRE_ELEMENT_CONTROLE, oldAPourLocalisationAutreElementControle, newAPourLocalisationAutreElementControle);
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
				msgs = ((InternalEObject)aPourLocalisationAutreElementControle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MOYEN_POUR_SOUTIEN_MEDICAL__APOUR_LOCALISATION_AUTRE_ELEMENT_CONTROLE, null, msgs);
			if (newAPourLocalisationAutreElementControle != null)
				msgs = ((InternalEObject)newAPourLocalisationAutreElementControle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MOYEN_POUR_SOUTIEN_MEDICAL__APOUR_LOCALISATION_AUTRE_ELEMENT_CONTROLE, null, msgs);
			msgs = basicSetAPourLocalisationAutreElementControle(newAPourLocalisationAutreElementControle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYEN_POUR_SOUTIEN_MEDICAL__APOUR_LOCALISATION_AUTRE_ELEMENT_CONTROLE, newAPourLocalisationAutreElementControle, newAPourLocalisationAutreElementControle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeQuantiteTypeUnite> getAPourMoyenNonIdentifieQuantiteTypeUnite() {
		if (aPourMoyenNonIdentifieQuantiteTypeUnite == null) {
			aPourMoyenNonIdentifieQuantiteTypeUnite = new EObjectContainmentEList<TypeQuantiteTypeUnite>(TypeQuantiteTypeUnite.class, this, SchemaPackage.TYPE_MOYEN_POUR_SOUTIEN_MEDICAL__APOUR_MOYEN_NON_IDENTIFIE_QUANTITE_TYPE_UNITE);
		}
		return aPourMoyenNonIdentifieQuantiteTypeUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MOYEN_POUR_SOUTIEN_MEDICAL__APOUR_MOYEN_IDENTIFIE_UNITE:
				return basicSetAPourMoyenIdentifieUnite(null, msgs);
			case SchemaPackage.TYPE_MOYEN_POUR_SOUTIEN_MEDICAL__APOUR_LOCALISATION_AUTRE_ELEMENT_CONTROLE:
				return basicSetAPourLocalisationAutreElementControle(null, msgs);
			case SchemaPackage.TYPE_MOYEN_POUR_SOUTIEN_MEDICAL__APOUR_MOYEN_NON_IDENTIFIE_QUANTITE_TYPE_UNITE:
				return ((InternalEList<?>)getAPourMoyenNonIdentifieQuantiteTypeUnite()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_MOYEN_POUR_SOUTIEN_MEDICAL__DEBUT_DISPONIBILITE:
				return getDebutDisponibilite();
			case SchemaPackage.TYPE_MOYEN_POUR_SOUTIEN_MEDICAL__FIN_DISPONIBILITE:
				return getFinDisponibilite();
			case SchemaPackage.TYPE_MOYEN_POUR_SOUTIEN_MEDICAL__CTE:
				return getCTE();
			case SchemaPackage.TYPE_MOYEN_POUR_SOUTIEN_MEDICAL__CE:
				return getCE();
			case SchemaPackage.TYPE_MOYEN_POUR_SOUTIEN_MEDICAL__APOUR_MOYEN_IDENTIFIE_UNITE:
				return getAPourMoyenIdentifieUnite();
			case SchemaPackage.TYPE_MOYEN_POUR_SOUTIEN_MEDICAL__APOUR_LOCALISATION_AUTRE_ELEMENT_CONTROLE:
				return getAPourLocalisationAutreElementControle();
			case SchemaPackage.TYPE_MOYEN_POUR_SOUTIEN_MEDICAL__APOUR_MOYEN_NON_IDENTIFIE_QUANTITE_TYPE_UNITE:
				return getAPourMoyenNonIdentifieQuantiteTypeUnite();
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
			case SchemaPackage.TYPE_MOYEN_POUR_SOUTIEN_MEDICAL__DEBUT_DISPONIBILITE:
				setDebutDisponibilite((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_MOYEN_POUR_SOUTIEN_MEDICAL__FIN_DISPONIBILITE:
				setFinDisponibilite((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_MOYEN_POUR_SOUTIEN_MEDICAL__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_MOYEN_POUR_SOUTIEN_MEDICAL__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_MOYEN_POUR_SOUTIEN_MEDICAL__APOUR_MOYEN_IDENTIFIE_UNITE:
				setAPourMoyenIdentifieUnite((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_MOYEN_POUR_SOUTIEN_MEDICAL__APOUR_LOCALISATION_AUTRE_ELEMENT_CONTROLE:
				setAPourLocalisationAutreElementControle((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_MOYEN_POUR_SOUTIEN_MEDICAL__APOUR_MOYEN_NON_IDENTIFIE_QUANTITE_TYPE_UNITE:
				getAPourMoyenNonIdentifieQuantiteTypeUnite().clear();
				getAPourMoyenNonIdentifieQuantiteTypeUnite().addAll((Collection<? extends TypeQuantiteTypeUnite>)newValue);
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
			case SchemaPackage.TYPE_MOYEN_POUR_SOUTIEN_MEDICAL__DEBUT_DISPONIBILITE:
				setDebutDisponibilite(DEBUT_DISPONIBILITE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MOYEN_POUR_SOUTIEN_MEDICAL__FIN_DISPONIBILITE:
				setFinDisponibilite(FIN_DISPONIBILITE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MOYEN_POUR_SOUTIEN_MEDICAL__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MOYEN_POUR_SOUTIEN_MEDICAL__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MOYEN_POUR_SOUTIEN_MEDICAL__APOUR_MOYEN_IDENTIFIE_UNITE:
				setAPourMoyenIdentifieUnite((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_MOYEN_POUR_SOUTIEN_MEDICAL__APOUR_LOCALISATION_AUTRE_ELEMENT_CONTROLE:
				setAPourLocalisationAutreElementControle((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_MOYEN_POUR_SOUTIEN_MEDICAL__APOUR_MOYEN_NON_IDENTIFIE_QUANTITE_TYPE_UNITE:
				getAPourMoyenNonIdentifieQuantiteTypeUnite().clear();
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
			case SchemaPackage.TYPE_MOYEN_POUR_SOUTIEN_MEDICAL__DEBUT_DISPONIBILITE:
				return DEBUT_DISPONIBILITE_EDEFAULT == null ? debutDisponibilite != null : !DEBUT_DISPONIBILITE_EDEFAULT.equals(debutDisponibilite);
			case SchemaPackage.TYPE_MOYEN_POUR_SOUTIEN_MEDICAL__FIN_DISPONIBILITE:
				return FIN_DISPONIBILITE_EDEFAULT == null ? finDisponibilite != null : !FIN_DISPONIBILITE_EDEFAULT.equals(finDisponibilite);
			case SchemaPackage.TYPE_MOYEN_POUR_SOUTIEN_MEDICAL__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_MOYEN_POUR_SOUTIEN_MEDICAL__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_MOYEN_POUR_SOUTIEN_MEDICAL__APOUR_MOYEN_IDENTIFIE_UNITE:
				return aPourMoyenIdentifieUnite != null;
			case SchemaPackage.TYPE_MOYEN_POUR_SOUTIEN_MEDICAL__APOUR_LOCALISATION_AUTRE_ELEMENT_CONTROLE:
				return aPourLocalisationAutreElementControle != null;
			case SchemaPackage.TYPE_MOYEN_POUR_SOUTIEN_MEDICAL__APOUR_MOYEN_NON_IDENTIFIE_QUANTITE_TYPE_UNITE:
				return aPourMoyenNonIdentifieQuantiteTypeUnite != null && !aPourMoyenNonIdentifieQuantiteTypeUnite.isEmpty();
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
		result.append(" (debutDisponibilite: ");
		result.append(debutDisponibilite);
		result.append(", finDisponibilite: ");
		result.append(finDisponibilite);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeMoyenPourSoutienMedicalImpl
