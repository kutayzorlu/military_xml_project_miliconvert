/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoRessourceAttendueTypeDeRavitaillement;
import mpia.schema.TypeRessourceAttendue;
import mpia.schema.TypeRessourceElementaire;

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
 * An implementation of the model object '<em><b>Type Ressource Attendue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeRessourceAttendueImpl#getTypeDeRavitaillement <em>Type De Ravitaillement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRessourceAttendueImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRessourceAttendueImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRessourceAttendueImpl#getAPourBeneficiaireUnite <em>APour Beneficiaire Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRessourceAttendueImpl#getACommeLieuDeLivraisonOuDePerceptionAutreElementControle <em>AComme Lieu De Livraison Ou De Perception Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRessourceAttendueImpl#getACommeRessourceElementaireRessourceElementaire <em>AComme Ressource Elementaire Ressource Elementaire</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeRessourceAttendueImpl extends EObjectImpl implements TypeRessourceAttendue {
	/**
	 * The default value of the '{@link #getTypeDeRavitaillement() <em>Type De Ravitaillement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDeRavitaillement()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoRessourceAttendueTypeDeRavitaillement TYPE_DE_RAVITAILLEMENT_EDEFAULT = TypeDictionaryDicoRessourceAttendueTypeDeRavitaillement.DELIVERY;

	/**
	 * The cached value of the '{@link #getTypeDeRavitaillement() <em>Type De Ravitaillement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDeRavitaillement()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoRessourceAttendueTypeDeRavitaillement typeDeRavitaillement = TYPE_DE_RAVITAILLEMENT_EDEFAULT;

	/**
	 * This is true if the Type De Ravitaillement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeDeRavitaillementESet;

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
	 * The cached value of the '{@link #getAPourBeneficiaireUnite() <em>APour Beneficiaire Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourBeneficiaireUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aPourBeneficiaireUnite;

	/**
	 * The cached value of the '{@link #getACommeLieuDeLivraisonOuDePerceptionAutreElementControle() <em>AComme Lieu De Livraison Ou De Perception Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeLieuDeLivraisonOuDePerceptionAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aCommeLieuDeLivraisonOuDePerceptionAutreElementControle;

	/**
	 * The cached value of the '{@link #getACommeRessourceElementaireRessourceElementaire() <em>AComme Ressource Elementaire Ressource Elementaire</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeRessourceElementaireRessourceElementaire()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeRessourceElementaire> aCommeRessourceElementaireRessourceElementaire;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeRessourceAttendueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeRessourceAttendue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoRessourceAttendueTypeDeRavitaillement getTypeDeRavitaillement() {
		return typeDeRavitaillement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeDeRavitaillement(TypeDictionaryDicoRessourceAttendueTypeDeRavitaillement newTypeDeRavitaillement) {
		TypeDictionaryDicoRessourceAttendueTypeDeRavitaillement oldTypeDeRavitaillement = typeDeRavitaillement;
		typeDeRavitaillement = newTypeDeRavitaillement == null ? TYPE_DE_RAVITAILLEMENT_EDEFAULT : newTypeDeRavitaillement;
		boolean oldTypeDeRavitaillementESet = typeDeRavitaillementESet;
		typeDeRavitaillementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESSOURCE_ATTENDUE__TYPE_DE_RAVITAILLEMENT, oldTypeDeRavitaillement, typeDeRavitaillement, !oldTypeDeRavitaillementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeDeRavitaillement() {
		TypeDictionaryDicoRessourceAttendueTypeDeRavitaillement oldTypeDeRavitaillement = typeDeRavitaillement;
		boolean oldTypeDeRavitaillementESet = typeDeRavitaillementESet;
		typeDeRavitaillement = TYPE_DE_RAVITAILLEMENT_EDEFAULT;
		typeDeRavitaillementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_RESSOURCE_ATTENDUE__TYPE_DE_RAVITAILLEMENT, oldTypeDeRavitaillement, TYPE_DE_RAVITAILLEMENT_EDEFAULT, oldTypeDeRavitaillementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeDeRavitaillement() {
		return typeDeRavitaillementESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESSOURCE_ATTENDUE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESSOURCE_ATTENDUE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAPourBeneficiaireUnite() {
		return aPourBeneficiaireUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourBeneficiaireUnite(TypeAssociationEXT newAPourBeneficiaireUnite, NotificationChain msgs) {
		TypeAssociationEXT oldAPourBeneficiaireUnite = aPourBeneficiaireUnite;
		aPourBeneficiaireUnite = newAPourBeneficiaireUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESSOURCE_ATTENDUE__APOUR_BENEFICIAIRE_UNITE, oldAPourBeneficiaireUnite, newAPourBeneficiaireUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourBeneficiaireUnite(TypeAssociationEXT newAPourBeneficiaireUnite) {
		if (newAPourBeneficiaireUnite != aPourBeneficiaireUnite) {
			NotificationChain msgs = null;
			if (aPourBeneficiaireUnite != null)
				msgs = ((InternalEObject)aPourBeneficiaireUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RESSOURCE_ATTENDUE__APOUR_BENEFICIAIRE_UNITE, null, msgs);
			if (newAPourBeneficiaireUnite != null)
				msgs = ((InternalEObject)newAPourBeneficiaireUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RESSOURCE_ATTENDUE__APOUR_BENEFICIAIRE_UNITE, null, msgs);
			msgs = basicSetAPourBeneficiaireUnite(newAPourBeneficiaireUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESSOURCE_ATTENDUE__APOUR_BENEFICIAIRE_UNITE, newAPourBeneficiaireUnite, newAPourBeneficiaireUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getACommeLieuDeLivraisonOuDePerceptionAutreElementControle() {
		return aCommeLieuDeLivraisonOuDePerceptionAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommeLieuDeLivraisonOuDePerceptionAutreElementControle(TypeAssociation newACommeLieuDeLivraisonOuDePerceptionAutreElementControle, NotificationChain msgs) {
		TypeAssociation oldACommeLieuDeLivraisonOuDePerceptionAutreElementControle = aCommeLieuDeLivraisonOuDePerceptionAutreElementControle;
		aCommeLieuDeLivraisonOuDePerceptionAutreElementControle = newACommeLieuDeLivraisonOuDePerceptionAutreElementControle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESSOURCE_ATTENDUE__ACOMME_LIEU_DE_LIVRAISON_OU_DE_PERCEPTION_AUTRE_ELEMENT_CONTROLE, oldACommeLieuDeLivraisonOuDePerceptionAutreElementControle, newACommeLieuDeLivraisonOuDePerceptionAutreElementControle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommeLieuDeLivraisonOuDePerceptionAutreElementControle(TypeAssociation newACommeLieuDeLivraisonOuDePerceptionAutreElementControle) {
		if (newACommeLieuDeLivraisonOuDePerceptionAutreElementControle != aCommeLieuDeLivraisonOuDePerceptionAutreElementControle) {
			NotificationChain msgs = null;
			if (aCommeLieuDeLivraisonOuDePerceptionAutreElementControle != null)
				msgs = ((InternalEObject)aCommeLieuDeLivraisonOuDePerceptionAutreElementControle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RESSOURCE_ATTENDUE__ACOMME_LIEU_DE_LIVRAISON_OU_DE_PERCEPTION_AUTRE_ELEMENT_CONTROLE, null, msgs);
			if (newACommeLieuDeLivraisonOuDePerceptionAutreElementControle != null)
				msgs = ((InternalEObject)newACommeLieuDeLivraisonOuDePerceptionAutreElementControle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RESSOURCE_ATTENDUE__ACOMME_LIEU_DE_LIVRAISON_OU_DE_PERCEPTION_AUTRE_ELEMENT_CONTROLE, null, msgs);
			msgs = basicSetACommeLieuDeLivraisonOuDePerceptionAutreElementControle(newACommeLieuDeLivraisonOuDePerceptionAutreElementControle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESSOURCE_ATTENDUE__ACOMME_LIEU_DE_LIVRAISON_OU_DE_PERCEPTION_AUTRE_ELEMENT_CONTROLE, newACommeLieuDeLivraisonOuDePerceptionAutreElementControle, newACommeLieuDeLivraisonOuDePerceptionAutreElementControle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeRessourceElementaire> getACommeRessourceElementaireRessourceElementaire() {
		if (aCommeRessourceElementaireRessourceElementaire == null) {
			aCommeRessourceElementaireRessourceElementaire = new EObjectContainmentEList<TypeRessourceElementaire>(TypeRessourceElementaire.class, this, SchemaPackage.TYPE_RESSOURCE_ATTENDUE__ACOMME_RESSOURCE_ELEMENTAIRE_RESSOURCE_ELEMENTAIRE);
		}
		return aCommeRessourceElementaireRessourceElementaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_RESSOURCE_ATTENDUE__APOUR_BENEFICIAIRE_UNITE:
				return basicSetAPourBeneficiaireUnite(null, msgs);
			case SchemaPackage.TYPE_RESSOURCE_ATTENDUE__ACOMME_LIEU_DE_LIVRAISON_OU_DE_PERCEPTION_AUTRE_ELEMENT_CONTROLE:
				return basicSetACommeLieuDeLivraisonOuDePerceptionAutreElementControle(null, msgs);
			case SchemaPackage.TYPE_RESSOURCE_ATTENDUE__ACOMME_RESSOURCE_ELEMENTAIRE_RESSOURCE_ELEMENTAIRE:
				return ((InternalEList<?>)getACommeRessourceElementaireRessourceElementaire()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_RESSOURCE_ATTENDUE__TYPE_DE_RAVITAILLEMENT:
				return getTypeDeRavitaillement();
			case SchemaPackage.TYPE_RESSOURCE_ATTENDUE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_RESSOURCE_ATTENDUE__CE:
				return getCE();
			case SchemaPackage.TYPE_RESSOURCE_ATTENDUE__APOUR_BENEFICIAIRE_UNITE:
				return getAPourBeneficiaireUnite();
			case SchemaPackage.TYPE_RESSOURCE_ATTENDUE__ACOMME_LIEU_DE_LIVRAISON_OU_DE_PERCEPTION_AUTRE_ELEMENT_CONTROLE:
				return getACommeLieuDeLivraisonOuDePerceptionAutreElementControle();
			case SchemaPackage.TYPE_RESSOURCE_ATTENDUE__ACOMME_RESSOURCE_ELEMENTAIRE_RESSOURCE_ELEMENTAIRE:
				return getACommeRessourceElementaireRessourceElementaire();
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
			case SchemaPackage.TYPE_RESSOURCE_ATTENDUE__TYPE_DE_RAVITAILLEMENT:
				setTypeDeRavitaillement((TypeDictionaryDicoRessourceAttendueTypeDeRavitaillement)newValue);
				return;
			case SchemaPackage.TYPE_RESSOURCE_ATTENDUE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_RESSOURCE_ATTENDUE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_RESSOURCE_ATTENDUE__APOUR_BENEFICIAIRE_UNITE:
				setAPourBeneficiaireUnite((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_RESSOURCE_ATTENDUE__ACOMME_LIEU_DE_LIVRAISON_OU_DE_PERCEPTION_AUTRE_ELEMENT_CONTROLE:
				setACommeLieuDeLivraisonOuDePerceptionAutreElementControle((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_RESSOURCE_ATTENDUE__ACOMME_RESSOURCE_ELEMENTAIRE_RESSOURCE_ELEMENTAIRE:
				getACommeRessourceElementaireRessourceElementaire().clear();
				getACommeRessourceElementaireRessourceElementaire().addAll((Collection<? extends TypeRessourceElementaire>)newValue);
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
			case SchemaPackage.TYPE_RESSOURCE_ATTENDUE__TYPE_DE_RAVITAILLEMENT:
				unsetTypeDeRavitaillement();
				return;
			case SchemaPackage.TYPE_RESSOURCE_ATTENDUE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RESSOURCE_ATTENDUE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RESSOURCE_ATTENDUE__APOUR_BENEFICIAIRE_UNITE:
				setAPourBeneficiaireUnite((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_RESSOURCE_ATTENDUE__ACOMME_LIEU_DE_LIVRAISON_OU_DE_PERCEPTION_AUTRE_ELEMENT_CONTROLE:
				setACommeLieuDeLivraisonOuDePerceptionAutreElementControle((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_RESSOURCE_ATTENDUE__ACOMME_RESSOURCE_ELEMENTAIRE_RESSOURCE_ELEMENTAIRE:
				getACommeRessourceElementaireRessourceElementaire().clear();
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
			case SchemaPackage.TYPE_RESSOURCE_ATTENDUE__TYPE_DE_RAVITAILLEMENT:
				return isSetTypeDeRavitaillement();
			case SchemaPackage.TYPE_RESSOURCE_ATTENDUE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_RESSOURCE_ATTENDUE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_RESSOURCE_ATTENDUE__APOUR_BENEFICIAIRE_UNITE:
				return aPourBeneficiaireUnite != null;
			case SchemaPackage.TYPE_RESSOURCE_ATTENDUE__ACOMME_LIEU_DE_LIVRAISON_OU_DE_PERCEPTION_AUTRE_ELEMENT_CONTROLE:
				return aCommeLieuDeLivraisonOuDePerceptionAutreElementControle != null;
			case SchemaPackage.TYPE_RESSOURCE_ATTENDUE__ACOMME_RESSOURCE_ELEMENTAIRE_RESSOURCE_ELEMENTAIRE:
				return aCommeRessourceElementaireRessourceElementaire != null && !aCommeRessourceElementaireRessourceElementaire.isEmpty();
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
		result.append(" (typeDeRavitaillement: ");
		if (typeDeRavitaillementESet) result.append(typeDeRavitaillement); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeRessourceAttendueImpl
