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
import mpia.schema.TypeDictionaryDicoPrioriteTypePriorite;
import mpia.schema.TypePriorite;

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
 * An implementation of the model object '<em><b>Type Priorite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypePrioriteImpl#getTypePriorite <em>Type Priorite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrioriteImpl#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrioriteImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrioriteImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrioriteImpl#getConcerneTypeRessourceTypeConsommable <em>Concerne Type Ressource Type Consommable</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrioriteImpl#getConcerneUniteUnite <em>Concerne Unite Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrioriteImpl#getDefinitPourHoraireManoeuvre <em>Definit Pour Horaire Manoeuvre</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypePrioriteImpl extends EObjectImpl implements TypePriorite {
	/**
	 * The default value of the '{@link #getTypePriorite() <em>Type Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypePriorite()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPrioriteTypePriorite TYPE_PRIORITE_EDEFAULT = TypeDictionaryDicoPrioriteTypePriorite.BYUNIT;

	/**
	 * The cached value of the '{@link #getTypePriorite() <em>Type Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypePriorite()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPrioriteTypePriorite typePriorite = TYPE_PRIORITE_EDEFAULT;

	/**
	 * This is true if the Type Priorite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typePrioriteESet;

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
	 * The cached value of the '{@link #getConcerneTypeRessourceTypeConsommable() <em>Concerne Type Ressource Type Consommable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneTypeRessourceTypeConsommable()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT concerneTypeRessourceTypeConsommable;

	/**
	 * The cached value of the '{@link #getConcerneUniteUnite() <em>Concerne Unite Unite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneUniteUnite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociationEXT> concerneUniteUnite;

	/**
	 * The cached value of the '{@link #getDefinitPourHoraireManoeuvre() <em>Definit Pour Horaire Manoeuvre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitPourHoraireManoeuvre()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation definitPourHoraireManoeuvre;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypePrioriteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypePriorite();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoPrioriteTypePriorite getTypePriorite() {
		return typePriorite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypePriorite(TypeDictionaryDicoPrioriteTypePriorite newTypePriorite) {
		TypeDictionaryDicoPrioriteTypePriorite oldTypePriorite = typePriorite;
		typePriorite = newTypePriorite == null ? TYPE_PRIORITE_EDEFAULT : newTypePriorite;
		boolean oldTypePrioriteESet = typePrioriteESet;
		typePrioriteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRIORITE__TYPE_PRIORITE, oldTypePriorite, typePriorite, !oldTypePrioriteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypePriorite() {
		TypeDictionaryDicoPrioriteTypePriorite oldTypePriorite = typePriorite;
		boolean oldTypePrioriteESet = typePrioriteESet;
		typePriorite = TYPE_PRIORITE_EDEFAULT;
		typePrioriteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PRIORITE__TYPE_PRIORITE, oldTypePriorite, TYPE_PRIORITE_EDEFAULT, oldTypePrioriteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypePriorite() {
		return typePrioriteESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRIORITE__COMMENTAIRE, oldCommentaire, commentaire));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRIORITE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRIORITE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getConcerneTypeRessourceTypeConsommable() {
		return concerneTypeRessourceTypeConsommable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcerneTypeRessourceTypeConsommable(TypeAssociationEXT newConcerneTypeRessourceTypeConsommable, NotificationChain msgs) {
		TypeAssociationEXT oldConcerneTypeRessourceTypeConsommable = concerneTypeRessourceTypeConsommable;
		concerneTypeRessourceTypeConsommable = newConcerneTypeRessourceTypeConsommable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRIORITE__CONCERNE_TYPE_RESSOURCE_TYPE_CONSOMMABLE, oldConcerneTypeRessourceTypeConsommable, newConcerneTypeRessourceTypeConsommable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcerneTypeRessourceTypeConsommable(TypeAssociationEXT newConcerneTypeRessourceTypeConsommable) {
		if (newConcerneTypeRessourceTypeConsommable != concerneTypeRessourceTypeConsommable) {
			NotificationChain msgs = null;
			if (concerneTypeRessourceTypeConsommable != null)
				msgs = ((InternalEObject)concerneTypeRessourceTypeConsommable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PRIORITE__CONCERNE_TYPE_RESSOURCE_TYPE_CONSOMMABLE, null, msgs);
			if (newConcerneTypeRessourceTypeConsommable != null)
				msgs = ((InternalEObject)newConcerneTypeRessourceTypeConsommable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PRIORITE__CONCERNE_TYPE_RESSOURCE_TYPE_CONSOMMABLE, null, msgs);
			msgs = basicSetConcerneTypeRessourceTypeConsommable(newConcerneTypeRessourceTypeConsommable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRIORITE__CONCERNE_TYPE_RESSOURCE_TYPE_CONSOMMABLE, newConcerneTypeRessourceTypeConsommable, newConcerneTypeRessourceTypeConsommable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEXT> getConcerneUniteUnite() {
		if (concerneUniteUnite == null) {
			concerneUniteUnite = new EObjectContainmentEList<TypeAssociationEXT>(TypeAssociationEXT.class, this, SchemaPackage.TYPE_PRIORITE__CONCERNE_UNITE_UNITE);
		}
		return concerneUniteUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getDefinitPourHoraireManoeuvre() {
		return definitPourHoraireManoeuvre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinitPourHoraireManoeuvre(TypeAssociation newDefinitPourHoraireManoeuvre, NotificationChain msgs) {
		TypeAssociation oldDefinitPourHoraireManoeuvre = definitPourHoraireManoeuvre;
		definitPourHoraireManoeuvre = newDefinitPourHoraireManoeuvre;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRIORITE__DEFINIT_POUR_HORAIRE_MANOEUVRE, oldDefinitPourHoraireManoeuvre, newDefinitPourHoraireManoeuvre);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinitPourHoraireManoeuvre(TypeAssociation newDefinitPourHoraireManoeuvre) {
		if (newDefinitPourHoraireManoeuvre != definitPourHoraireManoeuvre) {
			NotificationChain msgs = null;
			if (definitPourHoraireManoeuvre != null)
				msgs = ((InternalEObject)definitPourHoraireManoeuvre).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PRIORITE__DEFINIT_POUR_HORAIRE_MANOEUVRE, null, msgs);
			if (newDefinitPourHoraireManoeuvre != null)
				msgs = ((InternalEObject)newDefinitPourHoraireManoeuvre).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PRIORITE__DEFINIT_POUR_HORAIRE_MANOEUVRE, null, msgs);
			msgs = basicSetDefinitPourHoraireManoeuvre(newDefinitPourHoraireManoeuvre, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRIORITE__DEFINIT_POUR_HORAIRE_MANOEUVRE, newDefinitPourHoraireManoeuvre, newDefinitPourHoraireManoeuvre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_PRIORITE__CONCERNE_TYPE_RESSOURCE_TYPE_CONSOMMABLE:
				return basicSetConcerneTypeRessourceTypeConsommable(null, msgs);
			case SchemaPackage.TYPE_PRIORITE__CONCERNE_UNITE_UNITE:
				return ((InternalEList<?>)getConcerneUniteUnite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PRIORITE__DEFINIT_POUR_HORAIRE_MANOEUVRE:
				return basicSetDefinitPourHoraireManoeuvre(null, msgs);
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
			case SchemaPackage.TYPE_PRIORITE__TYPE_PRIORITE:
				return getTypePriorite();
			case SchemaPackage.TYPE_PRIORITE__COMMENTAIRE:
				return getCommentaire();
			case SchemaPackage.TYPE_PRIORITE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_PRIORITE__CE:
				return getCE();
			case SchemaPackage.TYPE_PRIORITE__CONCERNE_TYPE_RESSOURCE_TYPE_CONSOMMABLE:
				return getConcerneTypeRessourceTypeConsommable();
			case SchemaPackage.TYPE_PRIORITE__CONCERNE_UNITE_UNITE:
				return getConcerneUniteUnite();
			case SchemaPackage.TYPE_PRIORITE__DEFINIT_POUR_HORAIRE_MANOEUVRE:
				return getDefinitPourHoraireManoeuvre();
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
			case SchemaPackage.TYPE_PRIORITE__TYPE_PRIORITE:
				setTypePriorite((TypeDictionaryDicoPrioriteTypePriorite)newValue);
				return;
			case SchemaPackage.TYPE_PRIORITE__COMMENTAIRE:
				setCommentaire((String)newValue);
				return;
			case SchemaPackage.TYPE_PRIORITE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_PRIORITE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_PRIORITE__CONCERNE_TYPE_RESSOURCE_TYPE_CONSOMMABLE:
				setConcerneTypeRessourceTypeConsommable((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_PRIORITE__CONCERNE_UNITE_UNITE:
				getConcerneUniteUnite().clear();
				getConcerneUniteUnite().addAll((Collection<? extends TypeAssociationEXT>)newValue);
				return;
			case SchemaPackage.TYPE_PRIORITE__DEFINIT_POUR_HORAIRE_MANOEUVRE:
				setDefinitPourHoraireManoeuvre((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_PRIORITE__TYPE_PRIORITE:
				unsetTypePriorite();
				return;
			case SchemaPackage.TYPE_PRIORITE__COMMENTAIRE:
				setCommentaire(COMMENTAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PRIORITE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PRIORITE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PRIORITE__CONCERNE_TYPE_RESSOURCE_TYPE_CONSOMMABLE:
				setConcerneTypeRessourceTypeConsommable((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_PRIORITE__CONCERNE_UNITE_UNITE:
				getConcerneUniteUnite().clear();
				return;
			case SchemaPackage.TYPE_PRIORITE__DEFINIT_POUR_HORAIRE_MANOEUVRE:
				setDefinitPourHoraireManoeuvre((TypeAssociation)null);
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
			case SchemaPackage.TYPE_PRIORITE__TYPE_PRIORITE:
				return isSetTypePriorite();
			case SchemaPackage.TYPE_PRIORITE__COMMENTAIRE:
				return COMMENTAIRE_EDEFAULT == null ? commentaire != null : !COMMENTAIRE_EDEFAULT.equals(commentaire);
			case SchemaPackage.TYPE_PRIORITE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_PRIORITE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_PRIORITE__CONCERNE_TYPE_RESSOURCE_TYPE_CONSOMMABLE:
				return concerneTypeRessourceTypeConsommable != null;
			case SchemaPackage.TYPE_PRIORITE__CONCERNE_UNITE_UNITE:
				return concerneUniteUnite != null && !concerneUniteUnite.isEmpty();
			case SchemaPackage.TYPE_PRIORITE__DEFINIT_POUR_HORAIRE_MANOEUVRE:
				return definitPourHoraireManoeuvre != null;
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
		result.append(" (typePriorite: ");
		if (typePrioriteESet) result.append(typePriorite); else result.append("<unset>");
		result.append(", commentaire: ");
		result.append(commentaire);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypePrioriteImpl
