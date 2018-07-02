/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationAffiliationInstanceObjet;
import mpia.schema.TypeDictionaryDicoAssociationAffiliationComportement;
import mpia.schema.TypeDictionaryDicoAssociationAffiliationInstanceObjetCategorie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Affiliation Instance Objet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationAffiliationInstanceObjetImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationAffiliationInstanceObjetImpl#getComportement <em>Comportement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationAffiliationInstanceObjetImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationAffiliationInstanceObjetImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationAffiliationInstanceObjetImpl#getConcerneAffiliationAffiliation <em>Concerne Affiliation Affiliation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationAffiliationInstanceObjetImpl#getConcerneInstanceObjetInstanceObjet <em>Concerne Instance Objet Instance Objet</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationAffiliationInstanceObjetImpl#getEstRapporteeParRapport <em>Est Rapportee Par Rapport</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationAffiliationInstanceObjetImpl extends EObjectImpl implements TypeAssociationAffiliationInstanceObjet {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAssociationAffiliationInstanceObjetCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAssociationAffiliationInstanceObjetCategorie.AO;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssociationAffiliationInstanceObjetCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The default value of the '{@link #getComportement() <em>Comportement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComportement()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAssociationAffiliationComportement COMPORTEMENT_EDEFAULT = TypeDictionaryDicoAssociationAffiliationComportement.VFAV;

	/**
	 * The cached value of the '{@link #getComportement() <em>Comportement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComportement()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssociationAffiliationComportement comportement = COMPORTEMENT_EDEFAULT;

	/**
	 * This is true if the Comportement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean comportementESet;

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
	 * The cached value of the '{@link #getConcerneAffiliationAffiliation() <em>Concerne Affiliation Affiliation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneAffiliationAffiliation()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT concerneAffiliationAffiliation;

	/**
	 * The cached value of the '{@link #getConcerneInstanceObjetInstanceObjet() <em>Concerne Instance Objet Instance Objet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneInstanceObjetInstanceObjet()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation concerneInstanceObjetInstanceObjet;

	/**
	 * The cached value of the '{@link #getEstRapporteeParRapport() <em>Est Rapportee Par Rapport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstRapporteeParRapport()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation estRapporteeParRapport;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationAffiliationInstanceObjetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationAffiliationInstanceObjet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAssociationAffiliationInstanceObjetCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAssociationAffiliationInstanceObjetCategorie newCategorie) {
		TypeDictionaryDicoAssociationAffiliationInstanceObjetCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_INSTANCE_OBJET__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAssociationAffiliationInstanceObjetCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_INSTANCE_OBJET__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCategorie() {
		return categorieESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAssociationAffiliationComportement getComportement() {
		return comportement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComportement(TypeDictionaryDicoAssociationAffiliationComportement newComportement) {
		TypeDictionaryDicoAssociationAffiliationComportement oldComportement = comportement;
		comportement = newComportement == null ? COMPORTEMENT_EDEFAULT : newComportement;
		boolean oldComportementESet = comportementESet;
		comportementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_INSTANCE_OBJET__COMPORTEMENT, oldComportement, comportement, !oldComportementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetComportement() {
		TypeDictionaryDicoAssociationAffiliationComportement oldComportement = comportement;
		boolean oldComportementESet = comportementESet;
		comportement = COMPORTEMENT_EDEFAULT;
		comportementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_INSTANCE_OBJET__COMPORTEMENT, oldComportement, COMPORTEMENT_EDEFAULT, oldComportementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetComportement() {
		return comportementESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_INSTANCE_OBJET__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_INSTANCE_OBJET__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getConcerneAffiliationAffiliation() {
		return concerneAffiliationAffiliation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcerneAffiliationAffiliation(TypeAssociationEXT newConcerneAffiliationAffiliation, NotificationChain msgs) {
		TypeAssociationEXT oldConcerneAffiliationAffiliation = concerneAffiliationAffiliation;
		concerneAffiliationAffiliation = newConcerneAffiliationAffiliation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_INSTANCE_OBJET__CONCERNE_AFFILIATION_AFFILIATION, oldConcerneAffiliationAffiliation, newConcerneAffiliationAffiliation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcerneAffiliationAffiliation(TypeAssociationEXT newConcerneAffiliationAffiliation) {
		if (newConcerneAffiliationAffiliation != concerneAffiliationAffiliation) {
			NotificationChain msgs = null;
			if (concerneAffiliationAffiliation != null)
				msgs = ((InternalEObject)concerneAffiliationAffiliation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_INSTANCE_OBJET__CONCERNE_AFFILIATION_AFFILIATION, null, msgs);
			if (newConcerneAffiliationAffiliation != null)
				msgs = ((InternalEObject)newConcerneAffiliationAffiliation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_INSTANCE_OBJET__CONCERNE_AFFILIATION_AFFILIATION, null, msgs);
			msgs = basicSetConcerneAffiliationAffiliation(newConcerneAffiliationAffiliation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_INSTANCE_OBJET__CONCERNE_AFFILIATION_AFFILIATION, newConcerneAffiliationAffiliation, newConcerneAffiliationAffiliation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getConcerneInstanceObjetInstanceObjet() {
		return concerneInstanceObjetInstanceObjet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcerneInstanceObjetInstanceObjet(TypeAssociation newConcerneInstanceObjetInstanceObjet, NotificationChain msgs) {
		TypeAssociation oldConcerneInstanceObjetInstanceObjet = concerneInstanceObjetInstanceObjet;
		concerneInstanceObjetInstanceObjet = newConcerneInstanceObjetInstanceObjet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_INSTANCE_OBJET__CONCERNE_INSTANCE_OBJET_INSTANCE_OBJET, oldConcerneInstanceObjetInstanceObjet, newConcerneInstanceObjetInstanceObjet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcerneInstanceObjetInstanceObjet(TypeAssociation newConcerneInstanceObjetInstanceObjet) {
		if (newConcerneInstanceObjetInstanceObjet != concerneInstanceObjetInstanceObjet) {
			NotificationChain msgs = null;
			if (concerneInstanceObjetInstanceObjet != null)
				msgs = ((InternalEObject)concerneInstanceObjetInstanceObjet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_INSTANCE_OBJET__CONCERNE_INSTANCE_OBJET_INSTANCE_OBJET, null, msgs);
			if (newConcerneInstanceObjetInstanceObjet != null)
				msgs = ((InternalEObject)newConcerneInstanceObjetInstanceObjet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_INSTANCE_OBJET__CONCERNE_INSTANCE_OBJET_INSTANCE_OBJET, null, msgs);
			msgs = basicSetConcerneInstanceObjetInstanceObjet(newConcerneInstanceObjetInstanceObjet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_INSTANCE_OBJET__CONCERNE_INSTANCE_OBJET_INSTANCE_OBJET, newConcerneInstanceObjetInstanceObjet, newConcerneInstanceObjetInstanceObjet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getEstRapporteeParRapport() {
		return estRapporteeParRapport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstRapporteeParRapport(TypeAssociation newEstRapporteeParRapport, NotificationChain msgs) {
		TypeAssociation oldEstRapporteeParRapport = estRapporteeParRapport;
		estRapporteeParRapport = newEstRapporteeParRapport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_INSTANCE_OBJET__EST_RAPPORTEE_PAR_RAPPORT, oldEstRapporteeParRapport, newEstRapporteeParRapport);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstRapporteeParRapport(TypeAssociation newEstRapporteeParRapport) {
		if (newEstRapporteeParRapport != estRapporteeParRapport) {
			NotificationChain msgs = null;
			if (estRapporteeParRapport != null)
				msgs = ((InternalEObject)estRapporteeParRapport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_INSTANCE_OBJET__EST_RAPPORTEE_PAR_RAPPORT, null, msgs);
			if (newEstRapporteeParRapport != null)
				msgs = ((InternalEObject)newEstRapporteeParRapport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_INSTANCE_OBJET__EST_RAPPORTEE_PAR_RAPPORT, null, msgs);
			msgs = basicSetEstRapporteeParRapport(newEstRapporteeParRapport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_INSTANCE_OBJET__EST_RAPPORTEE_PAR_RAPPORT, newEstRapporteeParRapport, newEstRapporteeParRapport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_INSTANCE_OBJET__CONCERNE_AFFILIATION_AFFILIATION:
				return basicSetConcerneAffiliationAffiliation(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_INSTANCE_OBJET__CONCERNE_INSTANCE_OBJET_INSTANCE_OBJET:
				return basicSetConcerneInstanceObjetInstanceObjet(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_INSTANCE_OBJET__EST_RAPPORTEE_PAR_RAPPORT:
				return basicSetEstRapporteeParRapport(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_INSTANCE_OBJET__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_INSTANCE_OBJET__COMPORTEMENT:
				return getComportement();
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_INSTANCE_OBJET__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_INSTANCE_OBJET__CE:
				return getCE();
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_INSTANCE_OBJET__CONCERNE_AFFILIATION_AFFILIATION:
				return getConcerneAffiliationAffiliation();
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_INSTANCE_OBJET__CONCERNE_INSTANCE_OBJET_INSTANCE_OBJET:
				return getConcerneInstanceObjetInstanceObjet();
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_INSTANCE_OBJET__EST_RAPPORTEE_PAR_RAPPORT:
				return getEstRapporteeParRapport();
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
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_INSTANCE_OBJET__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationAffiliationInstanceObjetCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_INSTANCE_OBJET__COMPORTEMENT:
				setComportement((TypeDictionaryDicoAssociationAffiliationComportement)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_INSTANCE_OBJET__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_INSTANCE_OBJET__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_INSTANCE_OBJET__CONCERNE_AFFILIATION_AFFILIATION:
				setConcerneAffiliationAffiliation((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_INSTANCE_OBJET__CONCERNE_INSTANCE_OBJET_INSTANCE_OBJET:
				setConcerneInstanceObjetInstanceObjet((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_INSTANCE_OBJET__EST_RAPPORTEE_PAR_RAPPORT:
				setEstRapporteeParRapport((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_INSTANCE_OBJET__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_INSTANCE_OBJET__COMPORTEMENT:
				unsetComportement();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_INSTANCE_OBJET__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_INSTANCE_OBJET__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_INSTANCE_OBJET__CONCERNE_AFFILIATION_AFFILIATION:
				setConcerneAffiliationAffiliation((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_INSTANCE_OBJET__CONCERNE_INSTANCE_OBJET_INSTANCE_OBJET:
				setConcerneInstanceObjetInstanceObjet((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_INSTANCE_OBJET__EST_RAPPORTEE_PAR_RAPPORT:
				setEstRapporteeParRapport((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_INSTANCE_OBJET__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_INSTANCE_OBJET__COMPORTEMENT:
				return isSetComportement();
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_INSTANCE_OBJET__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_INSTANCE_OBJET__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_INSTANCE_OBJET__CONCERNE_AFFILIATION_AFFILIATION:
				return concerneAffiliationAffiliation != null;
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_INSTANCE_OBJET__CONCERNE_INSTANCE_OBJET_INSTANCE_OBJET:
				return concerneInstanceObjetInstanceObjet != null;
			case SchemaPackage.TYPE_ASSOCIATION_AFFILIATION_INSTANCE_OBJET__EST_RAPPORTEE_PAR_RAPPORT:
				return estRapporteeParRapport != null;
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
		result.append(" (categorie: ");
		if (categorieESet) result.append(categorie); else result.append("<unset>");
		result.append(", comportement: ");
		if (comportementESet) result.append(comportement); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeAssociationAffiliationInstanceObjetImpl
