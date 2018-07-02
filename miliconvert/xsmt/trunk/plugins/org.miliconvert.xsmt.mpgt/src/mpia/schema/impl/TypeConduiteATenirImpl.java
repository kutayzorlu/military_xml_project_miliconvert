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
import mpia.schema.TypeConduiteATenir;
import mpia.schema.TypeDictionaryDicoConduiteATenirActionSurMateriel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Conduite ATenir</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeConduiteATenirImpl#getActionSurMateriel <em>Action Sur Materiel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConduiteATenirImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConduiteATenirImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConduiteATenirImpl#getConcerneTypeMateriel <em>Concerne Type Materiel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConduiteATenirImpl#getConcerneTypePosteMilitaire <em>Concerne Type Poste Militaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConduiteATenirImpl#getACommeAutoritePersonne <em>AComme Autorite Personne</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeConduiteATenirImpl extends EObjectImpl implements TypeConduiteATenir {
	/**
	 * The default value of the '{@link #getActionSurMateriel() <em>Action Sur Materiel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionSurMateriel()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoConduiteATenirActionSurMateriel ACTION_SUR_MATERIEL_EDEFAULT = TypeDictionaryDicoConduiteATenirActionSurMateriel.CAN;

	/**
	 * The cached value of the '{@link #getActionSurMateriel() <em>Action Sur Materiel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionSurMateriel()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoConduiteATenirActionSurMateriel actionSurMateriel = ACTION_SUR_MATERIEL_EDEFAULT;

	/**
	 * This is true if the Action Sur Materiel attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean actionSurMaterielESet;

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
	 * The cached value of the '{@link #getConcerneTypeMateriel() <em>Concerne Type Materiel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneTypeMateriel()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT concerneTypeMateriel;

	/**
	 * The cached value of the '{@link #getConcerneTypePosteMilitaire() <em>Concerne Type Poste Militaire</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneTypePosteMilitaire()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT concerneTypePosteMilitaire;

	/**
	 * The cached value of the '{@link #getACommeAutoritePersonne() <em>AComme Autorite Personne</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeAutoritePersonne()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aCommeAutoritePersonne;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeConduiteATenirImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeConduiteATenir();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoConduiteATenirActionSurMateriel getActionSurMateriel() {
		return actionSurMateriel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionSurMateriel(TypeDictionaryDicoConduiteATenirActionSurMateriel newActionSurMateriel) {
		TypeDictionaryDicoConduiteATenirActionSurMateriel oldActionSurMateriel = actionSurMateriel;
		actionSurMateriel = newActionSurMateriel == null ? ACTION_SUR_MATERIEL_EDEFAULT : newActionSurMateriel;
		boolean oldActionSurMaterielESet = actionSurMaterielESet;
		actionSurMaterielESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONDUITE_ATENIR__ACTION_SUR_MATERIEL, oldActionSurMateriel, actionSurMateriel, !oldActionSurMaterielESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetActionSurMateriel() {
		TypeDictionaryDicoConduiteATenirActionSurMateriel oldActionSurMateriel = actionSurMateriel;
		boolean oldActionSurMaterielESet = actionSurMaterielESet;
		actionSurMateriel = ACTION_SUR_MATERIEL_EDEFAULT;
		actionSurMaterielESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CONDUITE_ATENIR__ACTION_SUR_MATERIEL, oldActionSurMateriel, ACTION_SUR_MATERIEL_EDEFAULT, oldActionSurMaterielESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActionSurMateriel() {
		return actionSurMaterielESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONDUITE_ATENIR__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONDUITE_ATENIR__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getConcerneTypeMateriel() {
		return concerneTypeMateriel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcerneTypeMateriel(TypeAssociationEXT newConcerneTypeMateriel, NotificationChain msgs) {
		TypeAssociationEXT oldConcerneTypeMateriel = concerneTypeMateriel;
		concerneTypeMateriel = newConcerneTypeMateriel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONDUITE_ATENIR__CONCERNE_TYPE_MATERIEL, oldConcerneTypeMateriel, newConcerneTypeMateriel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcerneTypeMateriel(TypeAssociationEXT newConcerneTypeMateriel) {
		if (newConcerneTypeMateriel != concerneTypeMateriel) {
			NotificationChain msgs = null;
			if (concerneTypeMateriel != null)
				msgs = ((InternalEObject)concerneTypeMateriel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONDUITE_ATENIR__CONCERNE_TYPE_MATERIEL, null, msgs);
			if (newConcerneTypeMateriel != null)
				msgs = ((InternalEObject)newConcerneTypeMateriel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONDUITE_ATENIR__CONCERNE_TYPE_MATERIEL, null, msgs);
			msgs = basicSetConcerneTypeMateriel(newConcerneTypeMateriel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONDUITE_ATENIR__CONCERNE_TYPE_MATERIEL, newConcerneTypeMateriel, newConcerneTypeMateriel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getConcerneTypePosteMilitaire() {
		return concerneTypePosteMilitaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcerneTypePosteMilitaire(TypeAssociationEXT newConcerneTypePosteMilitaire, NotificationChain msgs) {
		TypeAssociationEXT oldConcerneTypePosteMilitaire = concerneTypePosteMilitaire;
		concerneTypePosteMilitaire = newConcerneTypePosteMilitaire;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONDUITE_ATENIR__CONCERNE_TYPE_POSTE_MILITAIRE, oldConcerneTypePosteMilitaire, newConcerneTypePosteMilitaire);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcerneTypePosteMilitaire(TypeAssociationEXT newConcerneTypePosteMilitaire) {
		if (newConcerneTypePosteMilitaire != concerneTypePosteMilitaire) {
			NotificationChain msgs = null;
			if (concerneTypePosteMilitaire != null)
				msgs = ((InternalEObject)concerneTypePosteMilitaire).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONDUITE_ATENIR__CONCERNE_TYPE_POSTE_MILITAIRE, null, msgs);
			if (newConcerneTypePosteMilitaire != null)
				msgs = ((InternalEObject)newConcerneTypePosteMilitaire).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONDUITE_ATENIR__CONCERNE_TYPE_POSTE_MILITAIRE, null, msgs);
			msgs = basicSetConcerneTypePosteMilitaire(newConcerneTypePosteMilitaire, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONDUITE_ATENIR__CONCERNE_TYPE_POSTE_MILITAIRE, newConcerneTypePosteMilitaire, newConcerneTypePosteMilitaire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getACommeAutoritePersonne() {
		return aCommeAutoritePersonne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommeAutoritePersonne(TypeAssociation newACommeAutoritePersonne, NotificationChain msgs) {
		TypeAssociation oldACommeAutoritePersonne = aCommeAutoritePersonne;
		aCommeAutoritePersonne = newACommeAutoritePersonne;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONDUITE_ATENIR__ACOMME_AUTORITE_PERSONNE, oldACommeAutoritePersonne, newACommeAutoritePersonne);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommeAutoritePersonne(TypeAssociation newACommeAutoritePersonne) {
		if (newACommeAutoritePersonne != aCommeAutoritePersonne) {
			NotificationChain msgs = null;
			if (aCommeAutoritePersonne != null)
				msgs = ((InternalEObject)aCommeAutoritePersonne).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONDUITE_ATENIR__ACOMME_AUTORITE_PERSONNE, null, msgs);
			if (newACommeAutoritePersonne != null)
				msgs = ((InternalEObject)newACommeAutoritePersonne).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONDUITE_ATENIR__ACOMME_AUTORITE_PERSONNE, null, msgs);
			msgs = basicSetACommeAutoritePersonne(newACommeAutoritePersonne, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONDUITE_ATENIR__ACOMME_AUTORITE_PERSONNE, newACommeAutoritePersonne, newACommeAutoritePersonne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_CONDUITE_ATENIR__CONCERNE_TYPE_MATERIEL:
				return basicSetConcerneTypeMateriel(null, msgs);
			case SchemaPackage.TYPE_CONDUITE_ATENIR__CONCERNE_TYPE_POSTE_MILITAIRE:
				return basicSetConcerneTypePosteMilitaire(null, msgs);
			case SchemaPackage.TYPE_CONDUITE_ATENIR__ACOMME_AUTORITE_PERSONNE:
				return basicSetACommeAutoritePersonne(null, msgs);
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
			case SchemaPackage.TYPE_CONDUITE_ATENIR__ACTION_SUR_MATERIEL:
				return getActionSurMateriel();
			case SchemaPackage.TYPE_CONDUITE_ATENIR__CTE:
				return getCTE();
			case SchemaPackage.TYPE_CONDUITE_ATENIR__CE:
				return getCE();
			case SchemaPackage.TYPE_CONDUITE_ATENIR__CONCERNE_TYPE_MATERIEL:
				return getConcerneTypeMateriel();
			case SchemaPackage.TYPE_CONDUITE_ATENIR__CONCERNE_TYPE_POSTE_MILITAIRE:
				return getConcerneTypePosteMilitaire();
			case SchemaPackage.TYPE_CONDUITE_ATENIR__ACOMME_AUTORITE_PERSONNE:
				return getACommeAutoritePersonne();
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
			case SchemaPackage.TYPE_CONDUITE_ATENIR__ACTION_SUR_MATERIEL:
				setActionSurMateriel((TypeDictionaryDicoConduiteATenirActionSurMateriel)newValue);
				return;
			case SchemaPackage.TYPE_CONDUITE_ATENIR__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_CONDUITE_ATENIR__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_CONDUITE_ATENIR__CONCERNE_TYPE_MATERIEL:
				setConcerneTypeMateriel((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_CONDUITE_ATENIR__CONCERNE_TYPE_POSTE_MILITAIRE:
				setConcerneTypePosteMilitaire((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_CONDUITE_ATENIR__ACOMME_AUTORITE_PERSONNE:
				setACommeAutoritePersonne((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_CONDUITE_ATENIR__ACTION_SUR_MATERIEL:
				unsetActionSurMateriel();
				return;
			case SchemaPackage.TYPE_CONDUITE_ATENIR__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CONDUITE_ATENIR__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CONDUITE_ATENIR__CONCERNE_TYPE_MATERIEL:
				setConcerneTypeMateriel((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_CONDUITE_ATENIR__CONCERNE_TYPE_POSTE_MILITAIRE:
				setConcerneTypePosteMilitaire((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_CONDUITE_ATENIR__ACOMME_AUTORITE_PERSONNE:
				setACommeAutoritePersonne((TypeAssociation)null);
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
			case SchemaPackage.TYPE_CONDUITE_ATENIR__ACTION_SUR_MATERIEL:
				return isSetActionSurMateriel();
			case SchemaPackage.TYPE_CONDUITE_ATENIR__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_CONDUITE_ATENIR__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_CONDUITE_ATENIR__CONCERNE_TYPE_MATERIEL:
				return concerneTypeMateriel != null;
			case SchemaPackage.TYPE_CONDUITE_ATENIR__CONCERNE_TYPE_POSTE_MILITAIRE:
				return concerneTypePosteMilitaire != null;
			case SchemaPackage.TYPE_CONDUITE_ATENIR__ACOMME_AUTORITE_PERSONNE:
				return aCommeAutoritePersonne != null;
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
		result.append(" (actionSurMateriel: ");
		if (actionSurMaterielESet) result.append(actionSurMateriel); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeConduiteATenirImpl
