/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeContenuParagraphePlanOuOrdre;
import mpia.schema.TypeParagraphePlanOuOrdre;

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
 * An implementation of the model object '<em><b>Type Paragraphe Plan Ou Ordre</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeParagraphePlanOuOrdreImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeParagraphePlanOuOrdreImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeParagraphePlanOuOrdreImpl#getFaitPartiePlanOuOrdre <em>Fait Partie Plan Ou Ordre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeParagraphePlanOuOrdreImpl#getEstSujetAssociationParagraphePOparagraphePO <em>Est Sujet Association Paragraphe POparagraphe PO</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeParagraphePlanOuOrdreImpl#getEstObjetAssociationParagraphePOparagraphePO <em>Est Objet Association Paragraphe POparagraphe PO</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeParagraphePlanOuOrdreImpl#getEstDefiniParContenuParagraphePlanOuOrdre <em>Est Defini Par Contenu Paragraphe Plan Ou Ordre</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeParagraphePlanOuOrdreImpl extends EObjectImpl implements TypeParagraphePlanOuOrdre {
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
	 * The cached value of the '{@link #getFaitPartiePlanOuOrdre() <em>Fait Partie Plan Ou Ordre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaitPartiePlanOuOrdre()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation faitPartiePlanOuOrdre;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationParagraphePOparagraphePO() <em>Est Sujet Association Paragraphe POparagraphe PO</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationParagraphePOparagraphePO()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationParagraphePOparagraphePO;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationParagraphePOparagraphePO() <em>Est Objet Association Paragraphe POparagraphe PO</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationParagraphePOparagraphePO()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationParagraphePOparagraphePO;

	/**
	 * The cached value of the '{@link #getEstDefiniParContenuParagraphePlanOuOrdre() <em>Est Defini Par Contenu Paragraphe Plan Ou Ordre</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstDefiniParContenuParagraphePlanOuOrdre()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeContenuParagraphePlanOuOrdre> estDefiniParContenuParagraphePlanOuOrdre;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeParagraphePlanOuOrdreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeParagraphePlanOuOrdre();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PARAGRAPHE_PLAN_OU_ORDRE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PARAGRAPHE_PLAN_OU_ORDRE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getFaitPartiePlanOuOrdre() {
		return faitPartiePlanOuOrdre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFaitPartiePlanOuOrdre(TypeAssociation newFaitPartiePlanOuOrdre, NotificationChain msgs) {
		TypeAssociation oldFaitPartiePlanOuOrdre = faitPartiePlanOuOrdre;
		faitPartiePlanOuOrdre = newFaitPartiePlanOuOrdre;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PARAGRAPHE_PLAN_OU_ORDRE__FAIT_PARTIE_PLAN_OU_ORDRE, oldFaitPartiePlanOuOrdre, newFaitPartiePlanOuOrdre);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFaitPartiePlanOuOrdre(TypeAssociation newFaitPartiePlanOuOrdre) {
		if (newFaitPartiePlanOuOrdre != faitPartiePlanOuOrdre) {
			NotificationChain msgs = null;
			if (faitPartiePlanOuOrdre != null)
				msgs = ((InternalEObject)faitPartiePlanOuOrdre).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PARAGRAPHE_PLAN_OU_ORDRE__FAIT_PARTIE_PLAN_OU_ORDRE, null, msgs);
			if (newFaitPartiePlanOuOrdre != null)
				msgs = ((InternalEObject)newFaitPartiePlanOuOrdre).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PARAGRAPHE_PLAN_OU_ORDRE__FAIT_PARTIE_PLAN_OU_ORDRE, null, msgs);
			msgs = basicSetFaitPartiePlanOuOrdre(newFaitPartiePlanOuOrdre, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PARAGRAPHE_PLAN_OU_ORDRE__FAIT_PARTIE_PLAN_OU_ORDRE, newFaitPartiePlanOuOrdre, newFaitPartiePlanOuOrdre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationParagraphePOparagraphePO() {
		if (estSujetAssociationParagraphePOparagraphePO == null) {
			estSujetAssociationParagraphePOparagraphePO = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_PARAGRAPHE_PLAN_OU_ORDRE__EST_SUJET_ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO);
		}
		return estSujetAssociationParagraphePOparagraphePO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationParagraphePOparagraphePO() {
		if (estObjetAssociationParagraphePOparagraphePO == null) {
			estObjetAssociationParagraphePOparagraphePO = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_PARAGRAPHE_PLAN_OU_ORDRE__EST_OBJET_ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO);
		}
		return estObjetAssociationParagraphePOparagraphePO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeContenuParagraphePlanOuOrdre> getEstDefiniParContenuParagraphePlanOuOrdre() {
		if (estDefiniParContenuParagraphePlanOuOrdre == null) {
			estDefiniParContenuParagraphePlanOuOrdre = new EObjectContainmentEList<TypeContenuParagraphePlanOuOrdre>(TypeContenuParagraphePlanOuOrdre.class, this, SchemaPackage.TYPE_PARAGRAPHE_PLAN_OU_ORDRE__EST_DEFINI_PAR_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE);
		}
		return estDefiniParContenuParagraphePlanOuOrdre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_PARAGRAPHE_PLAN_OU_ORDRE__FAIT_PARTIE_PLAN_OU_ORDRE:
				return basicSetFaitPartiePlanOuOrdre(null, msgs);
			case SchemaPackage.TYPE_PARAGRAPHE_PLAN_OU_ORDRE__EST_SUJET_ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO:
				return ((InternalEList<?>)getEstSujetAssociationParagraphePOparagraphePO()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PARAGRAPHE_PLAN_OU_ORDRE__EST_OBJET_ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO:
				return ((InternalEList<?>)getEstObjetAssociationParagraphePOparagraphePO()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PARAGRAPHE_PLAN_OU_ORDRE__EST_DEFINI_PAR_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE:
				return ((InternalEList<?>)getEstDefiniParContenuParagraphePlanOuOrdre()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_PARAGRAPHE_PLAN_OU_ORDRE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_PARAGRAPHE_PLAN_OU_ORDRE__CE:
				return getCE();
			case SchemaPackage.TYPE_PARAGRAPHE_PLAN_OU_ORDRE__FAIT_PARTIE_PLAN_OU_ORDRE:
				return getFaitPartiePlanOuOrdre();
			case SchemaPackage.TYPE_PARAGRAPHE_PLAN_OU_ORDRE__EST_SUJET_ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO:
				return getEstSujetAssociationParagraphePOparagraphePO();
			case SchemaPackage.TYPE_PARAGRAPHE_PLAN_OU_ORDRE__EST_OBJET_ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO:
				return getEstObjetAssociationParagraphePOparagraphePO();
			case SchemaPackage.TYPE_PARAGRAPHE_PLAN_OU_ORDRE__EST_DEFINI_PAR_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE:
				return getEstDefiniParContenuParagraphePlanOuOrdre();
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
			case SchemaPackage.TYPE_PARAGRAPHE_PLAN_OU_ORDRE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_PARAGRAPHE_PLAN_OU_ORDRE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_PARAGRAPHE_PLAN_OU_ORDRE__FAIT_PARTIE_PLAN_OU_ORDRE:
				setFaitPartiePlanOuOrdre((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_PARAGRAPHE_PLAN_OU_ORDRE__EST_SUJET_ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO:
				getEstSujetAssociationParagraphePOparagraphePO().clear();
				getEstSujetAssociationParagraphePOparagraphePO().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_PARAGRAPHE_PLAN_OU_ORDRE__EST_OBJET_ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO:
				getEstObjetAssociationParagraphePOparagraphePO().clear();
				getEstObjetAssociationParagraphePOparagraphePO().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_PARAGRAPHE_PLAN_OU_ORDRE__EST_DEFINI_PAR_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE:
				getEstDefiniParContenuParagraphePlanOuOrdre().clear();
				getEstDefiniParContenuParagraphePlanOuOrdre().addAll((Collection<? extends TypeContenuParagraphePlanOuOrdre>)newValue);
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
			case SchemaPackage.TYPE_PARAGRAPHE_PLAN_OU_ORDRE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PARAGRAPHE_PLAN_OU_ORDRE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PARAGRAPHE_PLAN_OU_ORDRE__FAIT_PARTIE_PLAN_OU_ORDRE:
				setFaitPartiePlanOuOrdre((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_PARAGRAPHE_PLAN_OU_ORDRE__EST_SUJET_ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO:
				getEstSujetAssociationParagraphePOparagraphePO().clear();
				return;
			case SchemaPackage.TYPE_PARAGRAPHE_PLAN_OU_ORDRE__EST_OBJET_ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO:
				getEstObjetAssociationParagraphePOparagraphePO().clear();
				return;
			case SchemaPackage.TYPE_PARAGRAPHE_PLAN_OU_ORDRE__EST_DEFINI_PAR_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE:
				getEstDefiniParContenuParagraphePlanOuOrdre().clear();
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
			case SchemaPackage.TYPE_PARAGRAPHE_PLAN_OU_ORDRE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_PARAGRAPHE_PLAN_OU_ORDRE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_PARAGRAPHE_PLAN_OU_ORDRE__FAIT_PARTIE_PLAN_OU_ORDRE:
				return faitPartiePlanOuOrdre != null;
			case SchemaPackage.TYPE_PARAGRAPHE_PLAN_OU_ORDRE__EST_SUJET_ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO:
				return estSujetAssociationParagraphePOparagraphePO != null && !estSujetAssociationParagraphePOparagraphePO.isEmpty();
			case SchemaPackage.TYPE_PARAGRAPHE_PLAN_OU_ORDRE__EST_OBJET_ASSOCIATION_PARAGRAPHE_POPARAGRAPHE_PO:
				return estObjetAssociationParagraphePOparagraphePO != null && !estObjetAssociationParagraphePOparagraphePO.isEmpty();
			case SchemaPackage.TYPE_PARAGRAPHE_PLAN_OU_ORDRE__EST_DEFINI_PAR_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE:
				return estDefiniParContenuParagraphePlanOuOrdre != null && !estDefiniParContenuParagraphePlanOuOrdre.isEmpty();
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
		result.append(" (cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeParagraphePlanOuOrdreImpl
