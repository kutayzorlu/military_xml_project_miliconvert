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
import mpia.schema.TypeChargementMateriel;

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
 * An implementation of the model object '<em><b>Type Chargement Materiel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeChargementMaterielImpl#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeChargementMaterielImpl#getQuantite <em>Quantite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeChargementMaterielImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeChargementMaterielImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeChargementMaterielImpl#getEstChargementMateriel <em>Est Chargement Materiel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeChargementMaterielImpl#getEstPourTypeMateriel <em>Est Pour Type Materiel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeChargementMaterielImpl#getEstPrisEnChargeLigneLivraison <em>Est Pris En Charge Ligne Livraison</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeChargementMaterielImpl extends EObjectImpl implements TypeChargementMateriel {
	/**
	 * The default value of the '{@link #getCommentaire() <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaire()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTAIRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommentaire() <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaire()
	 * @generated
	 * @ordered
	 */
	protected String commentaire = COMMENTAIRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuantite() <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantite()
	 * @generated
	 * @ordered
	 */
	protected static final long QUANTITE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getQuantite() <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantite()
	 * @generated
	 * @ordered
	 */
	protected long quantite = QUANTITE_EDEFAULT;

	/**
	 * This is true if the Quantite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean quantiteESet;

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
	 * The cached value of the '{@link #getEstChargementMateriel() <em>Est Chargement Materiel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstChargementMateriel()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estChargementMateriel;

	/**
	 * The cached value of the '{@link #getEstPourTypeMateriel() <em>Est Pour Type Materiel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstPourTypeMateriel()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT estPourTypeMateriel;

	/**
	 * The cached value of the '{@link #getEstPrisEnChargeLigneLivraison() <em>Est Pris En Charge Ligne Livraison</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstPrisEnChargeLigneLivraison()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estPrisEnChargeLigneLivraison;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeChargementMaterielImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeChargementMateriel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommentaire() {
		return commentaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommentaire(String newCommentaire) {
		String oldCommentaire = commentaire;
		commentaire = newCommentaire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CHARGEMENT_MATERIEL__COMMENTAIRE, oldCommentaire, commentaire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getQuantite() {
		return quantite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantite(long newQuantite) {
		long oldQuantite = quantite;
		quantite = newQuantite;
		boolean oldQuantiteESet = quantiteESet;
		quantiteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CHARGEMENT_MATERIEL__QUANTITE, oldQuantite, quantite, !oldQuantiteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQuantite() {
		long oldQuantite = quantite;
		boolean oldQuantiteESet = quantiteESet;
		quantite = QUANTITE_EDEFAULT;
		quantiteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CHARGEMENT_MATERIEL__QUANTITE, oldQuantite, QUANTITE_EDEFAULT, oldQuantiteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQuantite() {
		return quantiteESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CHARGEMENT_MATERIEL__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CHARGEMENT_MATERIEL__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstChargementMateriel() {
		if (estChargementMateriel == null) {
			estChargementMateriel = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_CHARGEMENT_MATERIEL__EST_CHARGEMENT_MATERIEL);
		}
		return estChargementMateriel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getEstPourTypeMateriel() {
		return estPourTypeMateriel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstPourTypeMateriel(TypeAssociationEXT newEstPourTypeMateriel, NotificationChain msgs) {
		TypeAssociationEXT oldEstPourTypeMateriel = estPourTypeMateriel;
		estPourTypeMateriel = newEstPourTypeMateriel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CHARGEMENT_MATERIEL__EST_POUR_TYPE_MATERIEL, oldEstPourTypeMateriel, newEstPourTypeMateriel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstPourTypeMateriel(TypeAssociationEXT newEstPourTypeMateriel) {
		if (newEstPourTypeMateriel != estPourTypeMateriel) {
			NotificationChain msgs = null;
			if (estPourTypeMateriel != null)
				msgs = ((InternalEObject)estPourTypeMateriel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CHARGEMENT_MATERIEL__EST_POUR_TYPE_MATERIEL, null, msgs);
			if (newEstPourTypeMateriel != null)
				msgs = ((InternalEObject)newEstPourTypeMateriel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CHARGEMENT_MATERIEL__EST_POUR_TYPE_MATERIEL, null, msgs);
			msgs = basicSetEstPourTypeMateriel(newEstPourTypeMateriel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CHARGEMENT_MATERIEL__EST_POUR_TYPE_MATERIEL, newEstPourTypeMateriel, newEstPourTypeMateriel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstPrisEnChargeLigneLivraison() {
		if (estPrisEnChargeLigneLivraison == null) {
			estPrisEnChargeLigneLivraison = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_CHARGEMENT_MATERIEL__EST_PRIS_EN_CHARGE_LIGNE_LIVRAISON);
		}
		return estPrisEnChargeLigneLivraison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_CHARGEMENT_MATERIEL__EST_CHARGEMENT_MATERIEL:
				return ((InternalEList<?>)getEstChargementMateriel()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_CHARGEMENT_MATERIEL__EST_POUR_TYPE_MATERIEL:
				return basicSetEstPourTypeMateriel(null, msgs);
			case SchemaPackage.TYPE_CHARGEMENT_MATERIEL__EST_PRIS_EN_CHARGE_LIGNE_LIVRAISON:
				return ((InternalEList<?>)getEstPrisEnChargeLigneLivraison()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_CHARGEMENT_MATERIEL__COMMENTAIRE:
				return getCommentaire();
			case SchemaPackage.TYPE_CHARGEMENT_MATERIEL__QUANTITE:
				return new Long(getQuantite());
			case SchemaPackage.TYPE_CHARGEMENT_MATERIEL__CTE:
				return getCTE();
			case SchemaPackage.TYPE_CHARGEMENT_MATERIEL__CE:
				return getCE();
			case SchemaPackage.TYPE_CHARGEMENT_MATERIEL__EST_CHARGEMENT_MATERIEL:
				return getEstChargementMateriel();
			case SchemaPackage.TYPE_CHARGEMENT_MATERIEL__EST_POUR_TYPE_MATERIEL:
				return getEstPourTypeMateriel();
			case SchemaPackage.TYPE_CHARGEMENT_MATERIEL__EST_PRIS_EN_CHARGE_LIGNE_LIVRAISON:
				return getEstPrisEnChargeLigneLivraison();
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
			case SchemaPackage.TYPE_CHARGEMENT_MATERIEL__COMMENTAIRE:
				setCommentaire((String)newValue);
				return;
			case SchemaPackage.TYPE_CHARGEMENT_MATERIEL__QUANTITE:
				setQuantite(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_CHARGEMENT_MATERIEL__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_CHARGEMENT_MATERIEL__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_CHARGEMENT_MATERIEL__EST_CHARGEMENT_MATERIEL:
				getEstChargementMateriel().clear();
				getEstChargementMateriel().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_CHARGEMENT_MATERIEL__EST_POUR_TYPE_MATERIEL:
				setEstPourTypeMateriel((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_CHARGEMENT_MATERIEL__EST_PRIS_EN_CHARGE_LIGNE_LIVRAISON:
				getEstPrisEnChargeLigneLivraison().clear();
				getEstPrisEnChargeLigneLivraison().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_CHARGEMENT_MATERIEL__COMMENTAIRE:
				setCommentaire(COMMENTAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CHARGEMENT_MATERIEL__QUANTITE:
				unsetQuantite();
				return;
			case SchemaPackage.TYPE_CHARGEMENT_MATERIEL__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CHARGEMENT_MATERIEL__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CHARGEMENT_MATERIEL__EST_CHARGEMENT_MATERIEL:
				getEstChargementMateriel().clear();
				return;
			case SchemaPackage.TYPE_CHARGEMENT_MATERIEL__EST_POUR_TYPE_MATERIEL:
				setEstPourTypeMateriel((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_CHARGEMENT_MATERIEL__EST_PRIS_EN_CHARGE_LIGNE_LIVRAISON:
				getEstPrisEnChargeLigneLivraison().clear();
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
			case SchemaPackage.TYPE_CHARGEMENT_MATERIEL__COMMENTAIRE:
				return COMMENTAIRE_EDEFAULT == null ? commentaire != null : !COMMENTAIRE_EDEFAULT.equals(commentaire);
			case SchemaPackage.TYPE_CHARGEMENT_MATERIEL__QUANTITE:
				return isSetQuantite();
			case SchemaPackage.TYPE_CHARGEMENT_MATERIEL__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_CHARGEMENT_MATERIEL__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_CHARGEMENT_MATERIEL__EST_CHARGEMENT_MATERIEL:
				return estChargementMateriel != null && !estChargementMateriel.isEmpty();
			case SchemaPackage.TYPE_CHARGEMENT_MATERIEL__EST_POUR_TYPE_MATERIEL:
				return estPourTypeMateriel != null;
			case SchemaPackage.TYPE_CHARGEMENT_MATERIEL__EST_PRIS_EN_CHARGE_LIGNE_LIVRAISON:
				return estPrisEnChargeLigneLivraison != null && !estPrisEnChargeLigneLivraison.isEmpty();
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
		result.append(" (commentaire: ");
		result.append(commentaire);
		result.append(", quantite: ");
		if (quantiteESet) result.append(quantite); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeChargementMaterielImpl
