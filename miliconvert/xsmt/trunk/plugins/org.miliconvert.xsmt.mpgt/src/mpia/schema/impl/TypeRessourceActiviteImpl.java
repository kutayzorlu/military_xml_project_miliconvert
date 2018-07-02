/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoRessourceActiviteQualification;
import mpia.schema.TypeEmploiRessourceActivite;
import mpia.schema.TypeRessourceActivite;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Ressource Activite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeRessourceActiviteImpl#isCritique <em>Critique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRessourceActiviteImpl#getQualification <em>Qualification</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRessourceActiviteImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRessourceActiviteImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRessourceActiviteImpl#getEstAutoriseParEntiteOrganisationnelle <em>Est Autorise Par Entite Organisationnelle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRessourceActiviteImpl#getEstUtiliseSelonEmploiRessourceActivite <em>Est Utilise Selon Emploi Ressource Activite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypeRessourceActiviteImpl extends EObjectImpl implements TypeRessourceActivite {
	/**
	 * The default value of the '{@link #isCritique() <em>Critique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCritique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CRITIQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCritique() <em>Critique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCritique()
	 * @generated
	 * @ordered
	 */
	protected boolean critique = CRITIQUE_EDEFAULT;

	/**
	 * This is true if the Critique attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean critiqueESet;

	/**
	 * The default value of the '{@link #getQualification() <em>Qualification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualification()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoRessourceActiviteQualification QUALIFICATION_EDEFAULT = TypeDictionaryDicoRessourceActiviteQualification.AUTH;

	/**
	 * The cached value of the '{@link #getQualification() <em>Qualification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualification()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoRessourceActiviteQualification qualification = QUALIFICATION_EDEFAULT;

	/**
	 * This is true if the Qualification attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean qualificationESet;

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
	 * The cached value of the '{@link #getEstAutoriseParEntiteOrganisationnelle() <em>Est Autorise Par Entite Organisationnelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstAutoriseParEntiteOrganisationnelle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT estAutoriseParEntiteOrganisationnelle;

	/**
	 * The cached value of the '{@link #getEstUtiliseSelonEmploiRessourceActivite() <em>Est Utilise Selon Emploi Ressource Activite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstUtiliseSelonEmploiRessourceActivite()
	 * @generated
	 * @ordered
	 */
	protected TypeEmploiRessourceActivite estUtiliseSelonEmploiRessourceActivite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeRessourceActiviteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeRessourceActivite();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCritique() {
		return critique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCritique(boolean newCritique) {
		boolean oldCritique = critique;
		critique = newCritique;
		boolean oldCritiqueESet = critiqueESet;
		critiqueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESSOURCE_ACTIVITE__CRITIQUE, oldCritique, critique, !oldCritiqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCritique() {
		boolean oldCritique = critique;
		boolean oldCritiqueESet = critiqueESet;
		critique = CRITIQUE_EDEFAULT;
		critiqueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_RESSOURCE_ACTIVITE__CRITIQUE, oldCritique, CRITIQUE_EDEFAULT, oldCritiqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCritique() {
		return critiqueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoRessourceActiviteQualification getQualification() {
		return qualification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualification(TypeDictionaryDicoRessourceActiviteQualification newQualification) {
		TypeDictionaryDicoRessourceActiviteQualification oldQualification = qualification;
		qualification = newQualification == null ? QUALIFICATION_EDEFAULT : newQualification;
		boolean oldQualificationESet = qualificationESet;
		qualificationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESSOURCE_ACTIVITE__QUALIFICATION, oldQualification, qualification, !oldQualificationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQualification() {
		TypeDictionaryDicoRessourceActiviteQualification oldQualification = qualification;
		boolean oldQualificationESet = qualificationESet;
		qualification = QUALIFICATION_EDEFAULT;
		qualificationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_RESSOURCE_ACTIVITE__QUALIFICATION, oldQualification, QUALIFICATION_EDEFAULT, oldQualificationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQualification() {
		return qualificationESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESSOURCE_ACTIVITE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESSOURCE_ACTIVITE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getEstAutoriseParEntiteOrganisationnelle() {
		return estAutoriseParEntiteOrganisationnelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstAutoriseParEntiteOrganisationnelle(TypeAssociationEXT newEstAutoriseParEntiteOrganisationnelle, NotificationChain msgs) {
		TypeAssociationEXT oldEstAutoriseParEntiteOrganisationnelle = estAutoriseParEntiteOrganisationnelle;
		estAutoriseParEntiteOrganisationnelle = newEstAutoriseParEntiteOrganisationnelle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESSOURCE_ACTIVITE__EST_AUTORISE_PAR_ENTITE_ORGANISATIONNELLE, oldEstAutoriseParEntiteOrganisationnelle, newEstAutoriseParEntiteOrganisationnelle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstAutoriseParEntiteOrganisationnelle(TypeAssociationEXT newEstAutoriseParEntiteOrganisationnelle) {
		if (newEstAutoriseParEntiteOrganisationnelle != estAutoriseParEntiteOrganisationnelle) {
			NotificationChain msgs = null;
			if (estAutoriseParEntiteOrganisationnelle != null)
				msgs = ((InternalEObject)estAutoriseParEntiteOrganisationnelle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RESSOURCE_ACTIVITE__EST_AUTORISE_PAR_ENTITE_ORGANISATIONNELLE, null, msgs);
			if (newEstAutoriseParEntiteOrganisationnelle != null)
				msgs = ((InternalEObject)newEstAutoriseParEntiteOrganisationnelle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RESSOURCE_ACTIVITE__EST_AUTORISE_PAR_ENTITE_ORGANISATIONNELLE, null, msgs);
			msgs = basicSetEstAutoriseParEntiteOrganisationnelle(newEstAutoriseParEntiteOrganisationnelle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESSOURCE_ACTIVITE__EST_AUTORISE_PAR_ENTITE_ORGANISATIONNELLE, newEstAutoriseParEntiteOrganisationnelle, newEstAutoriseParEntiteOrganisationnelle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeEmploiRessourceActivite getEstUtiliseSelonEmploiRessourceActivite() {
		return estUtiliseSelonEmploiRessourceActivite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstUtiliseSelonEmploiRessourceActivite(TypeEmploiRessourceActivite newEstUtiliseSelonEmploiRessourceActivite, NotificationChain msgs) {
		TypeEmploiRessourceActivite oldEstUtiliseSelonEmploiRessourceActivite = estUtiliseSelonEmploiRessourceActivite;
		estUtiliseSelonEmploiRessourceActivite = newEstUtiliseSelonEmploiRessourceActivite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESSOURCE_ACTIVITE__EST_UTILISE_SELON_EMPLOI_RESSOURCE_ACTIVITE, oldEstUtiliseSelonEmploiRessourceActivite, newEstUtiliseSelonEmploiRessourceActivite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstUtiliseSelonEmploiRessourceActivite(TypeEmploiRessourceActivite newEstUtiliseSelonEmploiRessourceActivite) {
		if (newEstUtiliseSelonEmploiRessourceActivite != estUtiliseSelonEmploiRessourceActivite) {
			NotificationChain msgs = null;
			if (estUtiliseSelonEmploiRessourceActivite != null)
				msgs = ((InternalEObject)estUtiliseSelonEmploiRessourceActivite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RESSOURCE_ACTIVITE__EST_UTILISE_SELON_EMPLOI_RESSOURCE_ACTIVITE, null, msgs);
			if (newEstUtiliseSelonEmploiRessourceActivite != null)
				msgs = ((InternalEObject)newEstUtiliseSelonEmploiRessourceActivite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RESSOURCE_ACTIVITE__EST_UTILISE_SELON_EMPLOI_RESSOURCE_ACTIVITE, null, msgs);
			msgs = basicSetEstUtiliseSelonEmploiRessourceActivite(newEstUtiliseSelonEmploiRessourceActivite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESSOURCE_ACTIVITE__EST_UTILISE_SELON_EMPLOI_RESSOURCE_ACTIVITE, newEstUtiliseSelonEmploiRessourceActivite, newEstUtiliseSelonEmploiRessourceActivite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_RESSOURCE_ACTIVITE__EST_AUTORISE_PAR_ENTITE_ORGANISATIONNELLE:
				return basicSetEstAutoriseParEntiteOrganisationnelle(null, msgs);
			case SchemaPackage.TYPE_RESSOURCE_ACTIVITE__EST_UTILISE_SELON_EMPLOI_RESSOURCE_ACTIVITE:
				return basicSetEstUtiliseSelonEmploiRessourceActivite(null, msgs);
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
			case SchemaPackage.TYPE_RESSOURCE_ACTIVITE__CRITIQUE:
				return isCritique() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_RESSOURCE_ACTIVITE__QUALIFICATION:
				return getQualification();
			case SchemaPackage.TYPE_RESSOURCE_ACTIVITE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_RESSOURCE_ACTIVITE__CE:
				return getCE();
			case SchemaPackage.TYPE_RESSOURCE_ACTIVITE__EST_AUTORISE_PAR_ENTITE_ORGANISATIONNELLE:
				return getEstAutoriseParEntiteOrganisationnelle();
			case SchemaPackage.TYPE_RESSOURCE_ACTIVITE__EST_UTILISE_SELON_EMPLOI_RESSOURCE_ACTIVITE:
				return getEstUtiliseSelonEmploiRessourceActivite();
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
			case SchemaPackage.TYPE_RESSOURCE_ACTIVITE__CRITIQUE:
				setCritique(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_RESSOURCE_ACTIVITE__QUALIFICATION:
				setQualification((TypeDictionaryDicoRessourceActiviteQualification)newValue);
				return;
			case SchemaPackage.TYPE_RESSOURCE_ACTIVITE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_RESSOURCE_ACTIVITE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_RESSOURCE_ACTIVITE__EST_AUTORISE_PAR_ENTITE_ORGANISATIONNELLE:
				setEstAutoriseParEntiteOrganisationnelle((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_RESSOURCE_ACTIVITE__EST_UTILISE_SELON_EMPLOI_RESSOURCE_ACTIVITE:
				setEstUtiliseSelonEmploiRessourceActivite((TypeEmploiRessourceActivite)newValue);
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
			case SchemaPackage.TYPE_RESSOURCE_ACTIVITE__CRITIQUE:
				unsetCritique();
				return;
			case SchemaPackage.TYPE_RESSOURCE_ACTIVITE__QUALIFICATION:
				unsetQualification();
				return;
			case SchemaPackage.TYPE_RESSOURCE_ACTIVITE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RESSOURCE_ACTIVITE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RESSOURCE_ACTIVITE__EST_AUTORISE_PAR_ENTITE_ORGANISATIONNELLE:
				setEstAutoriseParEntiteOrganisationnelle((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_RESSOURCE_ACTIVITE__EST_UTILISE_SELON_EMPLOI_RESSOURCE_ACTIVITE:
				setEstUtiliseSelonEmploiRessourceActivite((TypeEmploiRessourceActivite)null);
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
			case SchemaPackage.TYPE_RESSOURCE_ACTIVITE__CRITIQUE:
				return isSetCritique();
			case SchemaPackage.TYPE_RESSOURCE_ACTIVITE__QUALIFICATION:
				return isSetQualification();
			case SchemaPackage.TYPE_RESSOURCE_ACTIVITE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_RESSOURCE_ACTIVITE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_RESSOURCE_ACTIVITE__EST_AUTORISE_PAR_ENTITE_ORGANISATIONNELLE:
				return estAutoriseParEntiteOrganisationnelle != null;
			case SchemaPackage.TYPE_RESSOURCE_ACTIVITE__EST_UTILISE_SELON_EMPLOI_RESSOURCE_ACTIVITE:
				return estUtiliseSelonEmploiRessourceActivite != null;
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
		result.append(" (critique: ");
		if (critiqueESet) result.append(critique); else result.append("<unset>");
		result.append(", qualification: ");
		if (qualificationESet) result.append(qualification); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeRessourceActiviteImpl
