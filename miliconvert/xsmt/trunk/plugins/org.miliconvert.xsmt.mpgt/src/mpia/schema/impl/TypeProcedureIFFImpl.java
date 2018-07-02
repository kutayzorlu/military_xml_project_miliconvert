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
import mpia.schema.TypeAnnulationIFF;
import mpia.schema.TypeDictionaryDicoProcedureIFFAutoriteResponsable;
import mpia.schema.TypeProcedureIFF;
import mpia.schema.TypeUtilisationIFF;

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
 * An implementation of the model object '<em><b>Type Procedure IFF</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeProcedureIFFImpl#getAutoriteResponsable <em>Autorite Responsable</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeProcedureIFFImpl#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeProcedureIFFImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeProcedureIFFImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeProcedureIFFImpl#getAPourResponsableUnite <em>APour Responsable Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeProcedureIFFImpl#getUtiliseUtilisationIFF <em>Utilise Utilisation IFF</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeProcedureIFFImpl#getAnnuleAnnulationIFF <em>Annule Annulation IFF</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeProcedureIFFImpl#getSAppliqueSurAutreElementControle <em>SApplique Sur Autre Element Controle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeProcedureIFFImpl extends EObjectImpl implements TypeProcedureIFF {
	/**
	 * The default value of the '{@link #getAutoriteResponsable() <em>Autorite Responsable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoriteResponsable()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoProcedureIFFAutoriteResponsable AUTORITE_RESPONSABLE_EDEFAULT = TypeDictionaryDicoProcedureIFFAutoriteResponsable.CAME;

	/**
	 * The cached value of the '{@link #getAutoriteResponsable() <em>Autorite Responsable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoriteResponsable()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoProcedureIFFAutoriteResponsable autoriteResponsable = AUTORITE_RESPONSABLE_EDEFAULT;

	/**
	 * This is true if the Autorite Responsable attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean autoriteResponsableESet;

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
	 * The cached value of the '{@link #getAPourResponsableUnite() <em>APour Responsable Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourResponsableUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aPourResponsableUnite;

	/**
	 * The cached value of the '{@link #getUtiliseUtilisationIFF() <em>Utilise Utilisation IFF</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtiliseUtilisationIFF()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeUtilisationIFF> utiliseUtilisationIFF;

	/**
	 * The cached value of the '{@link #getAnnuleAnnulationIFF() <em>Annule Annulation IFF</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnuleAnnulationIFF()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAnnulationIFF> annuleAnnulationIFF;

	/**
	 * The cached value of the '{@link #getSAppliqueSurAutreElementControle() <em>SApplique Sur Autre Element Controle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAppliqueSurAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> sAppliqueSurAutreElementControle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeProcedureIFFImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeProcedureIFF();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoProcedureIFFAutoriteResponsable getAutoriteResponsable() {
		return autoriteResponsable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoriteResponsable(TypeDictionaryDicoProcedureIFFAutoriteResponsable newAutoriteResponsable) {
		TypeDictionaryDicoProcedureIFFAutoriteResponsable oldAutoriteResponsable = autoriteResponsable;
		autoriteResponsable = newAutoriteResponsable == null ? AUTORITE_RESPONSABLE_EDEFAULT : newAutoriteResponsable;
		boolean oldAutoriteResponsableESet = autoriteResponsableESet;
		autoriteResponsableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PROCEDURE_IFF__AUTORITE_RESPONSABLE, oldAutoriteResponsable, autoriteResponsable, !oldAutoriteResponsableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAutoriteResponsable() {
		TypeDictionaryDicoProcedureIFFAutoriteResponsable oldAutoriteResponsable = autoriteResponsable;
		boolean oldAutoriteResponsableESet = autoriteResponsableESet;
		autoriteResponsable = AUTORITE_RESPONSABLE_EDEFAULT;
		autoriteResponsableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PROCEDURE_IFF__AUTORITE_RESPONSABLE, oldAutoriteResponsable, AUTORITE_RESPONSABLE_EDEFAULT, oldAutoriteResponsableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAutoriteResponsable() {
		return autoriteResponsableESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PROCEDURE_IFF__COMMENTAIRE, oldCommentaire, commentaire));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PROCEDURE_IFF__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PROCEDURE_IFF__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAPourResponsableUnite() {
		return aPourResponsableUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourResponsableUnite(TypeAssociationEXT newAPourResponsableUnite, NotificationChain msgs) {
		TypeAssociationEXT oldAPourResponsableUnite = aPourResponsableUnite;
		aPourResponsableUnite = newAPourResponsableUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PROCEDURE_IFF__APOUR_RESPONSABLE_UNITE, oldAPourResponsableUnite, newAPourResponsableUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourResponsableUnite(TypeAssociationEXT newAPourResponsableUnite) {
		if (newAPourResponsableUnite != aPourResponsableUnite) {
			NotificationChain msgs = null;
			if (aPourResponsableUnite != null)
				msgs = ((InternalEObject)aPourResponsableUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PROCEDURE_IFF__APOUR_RESPONSABLE_UNITE, null, msgs);
			if (newAPourResponsableUnite != null)
				msgs = ((InternalEObject)newAPourResponsableUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PROCEDURE_IFF__APOUR_RESPONSABLE_UNITE, null, msgs);
			msgs = basicSetAPourResponsableUnite(newAPourResponsableUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PROCEDURE_IFF__APOUR_RESPONSABLE_UNITE, newAPourResponsableUnite, newAPourResponsableUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeUtilisationIFF> getUtiliseUtilisationIFF() {
		if (utiliseUtilisationIFF == null) {
			utiliseUtilisationIFF = new EObjectContainmentEList<TypeUtilisationIFF>(TypeUtilisationIFF.class, this, SchemaPackage.TYPE_PROCEDURE_IFF__UTILISE_UTILISATION_IFF);
		}
		return utiliseUtilisationIFF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAnnulationIFF> getAnnuleAnnulationIFF() {
		if (annuleAnnulationIFF == null) {
			annuleAnnulationIFF = new EObjectContainmentEList<TypeAnnulationIFF>(TypeAnnulationIFF.class, this, SchemaPackage.TYPE_PROCEDURE_IFF__ANNULE_ANNULATION_IFF);
		}
		return annuleAnnulationIFF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getSAppliqueSurAutreElementControle() {
		if (sAppliqueSurAutreElementControle == null) {
			sAppliqueSurAutreElementControle = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_PROCEDURE_IFF__SAPPLIQUE_SUR_AUTRE_ELEMENT_CONTROLE);
		}
		return sAppliqueSurAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_PROCEDURE_IFF__APOUR_RESPONSABLE_UNITE:
				return basicSetAPourResponsableUnite(null, msgs);
			case SchemaPackage.TYPE_PROCEDURE_IFF__UTILISE_UTILISATION_IFF:
				return ((InternalEList<?>)getUtiliseUtilisationIFF()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PROCEDURE_IFF__ANNULE_ANNULATION_IFF:
				return ((InternalEList<?>)getAnnuleAnnulationIFF()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PROCEDURE_IFF__SAPPLIQUE_SUR_AUTRE_ELEMENT_CONTROLE:
				return ((InternalEList<?>)getSAppliqueSurAutreElementControle()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_PROCEDURE_IFF__AUTORITE_RESPONSABLE:
				return getAutoriteResponsable();
			case SchemaPackage.TYPE_PROCEDURE_IFF__COMMENTAIRE:
				return getCommentaire();
			case SchemaPackage.TYPE_PROCEDURE_IFF__CTE:
				return getCTE();
			case SchemaPackage.TYPE_PROCEDURE_IFF__CE:
				return getCE();
			case SchemaPackage.TYPE_PROCEDURE_IFF__APOUR_RESPONSABLE_UNITE:
				return getAPourResponsableUnite();
			case SchemaPackage.TYPE_PROCEDURE_IFF__UTILISE_UTILISATION_IFF:
				return getUtiliseUtilisationIFF();
			case SchemaPackage.TYPE_PROCEDURE_IFF__ANNULE_ANNULATION_IFF:
				return getAnnuleAnnulationIFF();
			case SchemaPackage.TYPE_PROCEDURE_IFF__SAPPLIQUE_SUR_AUTRE_ELEMENT_CONTROLE:
				return getSAppliqueSurAutreElementControle();
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
			case SchemaPackage.TYPE_PROCEDURE_IFF__AUTORITE_RESPONSABLE:
				setAutoriteResponsable((TypeDictionaryDicoProcedureIFFAutoriteResponsable)newValue);
				return;
			case SchemaPackage.TYPE_PROCEDURE_IFF__COMMENTAIRE:
				setCommentaire((String)newValue);
				return;
			case SchemaPackage.TYPE_PROCEDURE_IFF__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_PROCEDURE_IFF__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_PROCEDURE_IFF__APOUR_RESPONSABLE_UNITE:
				setAPourResponsableUnite((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_PROCEDURE_IFF__UTILISE_UTILISATION_IFF:
				getUtiliseUtilisationIFF().clear();
				getUtiliseUtilisationIFF().addAll((Collection<? extends TypeUtilisationIFF>)newValue);
				return;
			case SchemaPackage.TYPE_PROCEDURE_IFF__ANNULE_ANNULATION_IFF:
				getAnnuleAnnulationIFF().clear();
				getAnnuleAnnulationIFF().addAll((Collection<? extends TypeAnnulationIFF>)newValue);
				return;
			case SchemaPackage.TYPE_PROCEDURE_IFF__SAPPLIQUE_SUR_AUTRE_ELEMENT_CONTROLE:
				getSAppliqueSurAutreElementControle().clear();
				getSAppliqueSurAutreElementControle().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_PROCEDURE_IFF__AUTORITE_RESPONSABLE:
				unsetAutoriteResponsable();
				return;
			case SchemaPackage.TYPE_PROCEDURE_IFF__COMMENTAIRE:
				setCommentaire(COMMENTAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PROCEDURE_IFF__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PROCEDURE_IFF__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PROCEDURE_IFF__APOUR_RESPONSABLE_UNITE:
				setAPourResponsableUnite((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_PROCEDURE_IFF__UTILISE_UTILISATION_IFF:
				getUtiliseUtilisationIFF().clear();
				return;
			case SchemaPackage.TYPE_PROCEDURE_IFF__ANNULE_ANNULATION_IFF:
				getAnnuleAnnulationIFF().clear();
				return;
			case SchemaPackage.TYPE_PROCEDURE_IFF__SAPPLIQUE_SUR_AUTRE_ELEMENT_CONTROLE:
				getSAppliqueSurAutreElementControle().clear();
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
			case SchemaPackage.TYPE_PROCEDURE_IFF__AUTORITE_RESPONSABLE:
				return isSetAutoriteResponsable();
			case SchemaPackage.TYPE_PROCEDURE_IFF__COMMENTAIRE:
				return COMMENTAIRE_EDEFAULT == null ? commentaire != null : !COMMENTAIRE_EDEFAULT.equals(commentaire);
			case SchemaPackage.TYPE_PROCEDURE_IFF__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_PROCEDURE_IFF__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_PROCEDURE_IFF__APOUR_RESPONSABLE_UNITE:
				return aPourResponsableUnite != null;
			case SchemaPackage.TYPE_PROCEDURE_IFF__UTILISE_UTILISATION_IFF:
				return utiliseUtilisationIFF != null && !utiliseUtilisationIFF.isEmpty();
			case SchemaPackage.TYPE_PROCEDURE_IFF__ANNULE_ANNULATION_IFF:
				return annuleAnnulationIFF != null && !annuleAnnulationIFF.isEmpty();
			case SchemaPackage.TYPE_PROCEDURE_IFF__SAPPLIQUE_SUR_AUTRE_ELEMENT_CONTROLE:
				return sAppliqueSurAutreElementControle != null && !sAppliqueSurAutreElementControle.isEmpty();
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
		result.append(" (autoriteResponsable: ");
		if (autoriteResponsableESet) result.append(autoriteResponsable); else result.append("<unset>");
		result.append(", commentaire: ");
		result.append(commentaire);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeProcedureIFFImpl
