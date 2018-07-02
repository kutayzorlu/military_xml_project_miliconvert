/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeRessourceActiviteType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Ressource Activite Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeRessourceActiviteTypeImpl#getQuantite <em>Quantite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRessourceActiviteTypeImpl#getRepartition <em>Repartition</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRessourceActiviteTypeImpl#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRessourceActiviteTypeImpl#getAssocieCommeTypeType <em>Associe Comme Type Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeRessourceActiviteTypeImpl extends TypeRessourceActiviteImpl implements TypeRessourceActiviteType {
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
	 * The default value of the '{@link #getRepartition() <em>Repartition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepartition()
	 * @generated
	 * @ordered
	 */
	protected static final double REPARTITION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRepartition() <em>Repartition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepartition()
	 * @generated
	 * @ordered
	 */
	protected double repartition = REPARTITION_EDEFAULT;

	/**
	 * This is true if the Repartition attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean repartitionESet;

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
	 * The cached value of the '{@link #getAssocieCommeTypeType() <em>Associe Comme Type Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeTypeType()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT associeCommeTypeType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeRessourceActiviteTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeRessourceActiviteType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESSOURCE_ACTIVITE_TYPE__QUANTITE, oldQuantite, quantite, !oldQuantiteESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_RESSOURCE_ACTIVITE_TYPE__QUANTITE, oldQuantite, QUANTITE_EDEFAULT, oldQuantiteESet));
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
	public double getRepartition() {
		return repartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepartition(double newRepartition) {
		double oldRepartition = repartition;
		repartition = newRepartition;
		boolean oldRepartitionESet = repartitionESet;
		repartitionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESSOURCE_ACTIVITE_TYPE__REPARTITION, oldRepartition, repartition, !oldRepartitionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRepartition() {
		double oldRepartition = repartition;
		boolean oldRepartitionESet = repartitionESet;
		repartition = REPARTITION_EDEFAULT;
		repartitionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_RESSOURCE_ACTIVITE_TYPE__REPARTITION, oldRepartition, REPARTITION_EDEFAULT, oldRepartitionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRepartition() {
		return repartitionESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESSOURCE_ACTIVITE_TYPE__COMMENTAIRE, oldCommentaire, commentaire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAssocieCommeTypeType() {
		return associeCommeTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeTypeType(TypeAssociationEXT newAssocieCommeTypeType, NotificationChain msgs) {
		TypeAssociationEXT oldAssocieCommeTypeType = associeCommeTypeType;
		associeCommeTypeType = newAssocieCommeTypeType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESSOURCE_ACTIVITE_TYPE__ASSOCIE_COMME_TYPE_TYPE, oldAssocieCommeTypeType, newAssocieCommeTypeType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeTypeType(TypeAssociationEXT newAssocieCommeTypeType) {
		if (newAssocieCommeTypeType != associeCommeTypeType) {
			NotificationChain msgs = null;
			if (associeCommeTypeType != null)
				msgs = ((InternalEObject)associeCommeTypeType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RESSOURCE_ACTIVITE_TYPE__ASSOCIE_COMME_TYPE_TYPE, null, msgs);
			if (newAssocieCommeTypeType != null)
				msgs = ((InternalEObject)newAssocieCommeTypeType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RESSOURCE_ACTIVITE_TYPE__ASSOCIE_COMME_TYPE_TYPE, null, msgs);
			msgs = basicSetAssocieCommeTypeType(newAssocieCommeTypeType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESSOURCE_ACTIVITE_TYPE__ASSOCIE_COMME_TYPE_TYPE, newAssocieCommeTypeType, newAssocieCommeTypeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_RESSOURCE_ACTIVITE_TYPE__ASSOCIE_COMME_TYPE_TYPE:
				return basicSetAssocieCommeTypeType(null, msgs);
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
			case SchemaPackage.TYPE_RESSOURCE_ACTIVITE_TYPE__QUANTITE:
				return new Long(getQuantite());
			case SchemaPackage.TYPE_RESSOURCE_ACTIVITE_TYPE__REPARTITION:
				return new Double(getRepartition());
			case SchemaPackage.TYPE_RESSOURCE_ACTIVITE_TYPE__COMMENTAIRE:
				return getCommentaire();
			case SchemaPackage.TYPE_RESSOURCE_ACTIVITE_TYPE__ASSOCIE_COMME_TYPE_TYPE:
				return getAssocieCommeTypeType();
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
			case SchemaPackage.TYPE_RESSOURCE_ACTIVITE_TYPE__QUANTITE:
				setQuantite(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_RESSOURCE_ACTIVITE_TYPE__REPARTITION:
				setRepartition(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_RESSOURCE_ACTIVITE_TYPE__COMMENTAIRE:
				setCommentaire((String)newValue);
				return;
			case SchemaPackage.TYPE_RESSOURCE_ACTIVITE_TYPE__ASSOCIE_COMME_TYPE_TYPE:
				setAssocieCommeTypeType((TypeAssociationEXT)newValue);
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
			case SchemaPackage.TYPE_RESSOURCE_ACTIVITE_TYPE__QUANTITE:
				unsetQuantite();
				return;
			case SchemaPackage.TYPE_RESSOURCE_ACTIVITE_TYPE__REPARTITION:
				unsetRepartition();
				return;
			case SchemaPackage.TYPE_RESSOURCE_ACTIVITE_TYPE__COMMENTAIRE:
				setCommentaire(COMMENTAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RESSOURCE_ACTIVITE_TYPE__ASSOCIE_COMME_TYPE_TYPE:
				setAssocieCommeTypeType((TypeAssociationEXT)null);
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
			case SchemaPackage.TYPE_RESSOURCE_ACTIVITE_TYPE__QUANTITE:
				return isSetQuantite();
			case SchemaPackage.TYPE_RESSOURCE_ACTIVITE_TYPE__REPARTITION:
				return isSetRepartition();
			case SchemaPackage.TYPE_RESSOURCE_ACTIVITE_TYPE__COMMENTAIRE:
				return COMMENTAIRE_EDEFAULT == null ? commentaire != null : !COMMENTAIRE_EDEFAULT.equals(commentaire);
			case SchemaPackage.TYPE_RESSOURCE_ACTIVITE_TYPE__ASSOCIE_COMME_TYPE_TYPE:
				return associeCommeTypeType != null;
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
		result.append(" (quantite: ");
		if (quantiteESet) result.append(quantite); else result.append("<unset>");
		result.append(", repartition: ");
		if (repartitionESet) result.append(repartition); else result.append("<unset>");
		result.append(", commentaire: ");
		result.append(commentaire);
		result.append(')');
		return result.toString();
	}

} //TypeRessourceActiviteTypeImpl
