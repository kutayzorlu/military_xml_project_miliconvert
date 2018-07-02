/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeConsommationAutorisee;
import mpia.schema.TypeRessourceElementaire;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Consommation Autorisee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeConsommationAutoriseeImpl#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsommationAutoriseeImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsommationAutoriseeImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsommationAutoriseeImpl#getACommeRessourceElementaireRessourceElementaire <em>AComme Ressource Elementaire Ressource Elementaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsommationAutoriseeImpl#getEstAllouePourHoraireManoeuvre <em>Est Alloue Pour Horaire Manoeuvre</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeConsommationAutoriseeImpl extends EObjectImpl implements TypeConsommationAutorisee {
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
	 * The cached value of the '{@link #getACommeRessourceElementaireRessourceElementaire() <em>AComme Ressource Elementaire Ressource Elementaire</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeRessourceElementaireRessourceElementaire()
	 * @generated
	 * @ordered
	 */
	protected TypeRessourceElementaire aCommeRessourceElementaireRessourceElementaire;

	/**
	 * The cached value of the '{@link #getEstAllouePourHoraireManoeuvre() <em>Est Alloue Pour Horaire Manoeuvre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstAllouePourHoraireManoeuvre()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation estAllouePourHoraireManoeuvre;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeConsommationAutoriseeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeConsommationAutorisee();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSOMMATION_AUTORISEE__COMMENTAIRE, oldCommentaire, commentaire));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSOMMATION_AUTORISEE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSOMMATION_AUTORISEE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRessourceElementaire getACommeRessourceElementaireRessourceElementaire() {
		return aCommeRessourceElementaireRessourceElementaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommeRessourceElementaireRessourceElementaire(TypeRessourceElementaire newACommeRessourceElementaireRessourceElementaire, NotificationChain msgs) {
		TypeRessourceElementaire oldACommeRessourceElementaireRessourceElementaire = aCommeRessourceElementaireRessourceElementaire;
		aCommeRessourceElementaireRessourceElementaire = newACommeRessourceElementaireRessourceElementaire;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSOMMATION_AUTORISEE__ACOMME_RESSOURCE_ELEMENTAIRE_RESSOURCE_ELEMENTAIRE, oldACommeRessourceElementaireRessourceElementaire, newACommeRessourceElementaireRessourceElementaire);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommeRessourceElementaireRessourceElementaire(TypeRessourceElementaire newACommeRessourceElementaireRessourceElementaire) {
		if (newACommeRessourceElementaireRessourceElementaire != aCommeRessourceElementaireRessourceElementaire) {
			NotificationChain msgs = null;
			if (aCommeRessourceElementaireRessourceElementaire != null)
				msgs = ((InternalEObject)aCommeRessourceElementaireRessourceElementaire).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONSOMMATION_AUTORISEE__ACOMME_RESSOURCE_ELEMENTAIRE_RESSOURCE_ELEMENTAIRE, null, msgs);
			if (newACommeRessourceElementaireRessourceElementaire != null)
				msgs = ((InternalEObject)newACommeRessourceElementaireRessourceElementaire).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONSOMMATION_AUTORISEE__ACOMME_RESSOURCE_ELEMENTAIRE_RESSOURCE_ELEMENTAIRE, null, msgs);
			msgs = basicSetACommeRessourceElementaireRessourceElementaire(newACommeRessourceElementaireRessourceElementaire, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSOMMATION_AUTORISEE__ACOMME_RESSOURCE_ELEMENTAIRE_RESSOURCE_ELEMENTAIRE, newACommeRessourceElementaireRessourceElementaire, newACommeRessourceElementaireRessourceElementaire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getEstAllouePourHoraireManoeuvre() {
		return estAllouePourHoraireManoeuvre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstAllouePourHoraireManoeuvre(TypeAssociation newEstAllouePourHoraireManoeuvre, NotificationChain msgs) {
		TypeAssociation oldEstAllouePourHoraireManoeuvre = estAllouePourHoraireManoeuvre;
		estAllouePourHoraireManoeuvre = newEstAllouePourHoraireManoeuvre;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSOMMATION_AUTORISEE__EST_ALLOUE_POUR_HORAIRE_MANOEUVRE, oldEstAllouePourHoraireManoeuvre, newEstAllouePourHoraireManoeuvre);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstAllouePourHoraireManoeuvre(TypeAssociation newEstAllouePourHoraireManoeuvre) {
		if (newEstAllouePourHoraireManoeuvre != estAllouePourHoraireManoeuvre) {
			NotificationChain msgs = null;
			if (estAllouePourHoraireManoeuvre != null)
				msgs = ((InternalEObject)estAllouePourHoraireManoeuvre).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONSOMMATION_AUTORISEE__EST_ALLOUE_POUR_HORAIRE_MANOEUVRE, null, msgs);
			if (newEstAllouePourHoraireManoeuvre != null)
				msgs = ((InternalEObject)newEstAllouePourHoraireManoeuvre).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONSOMMATION_AUTORISEE__EST_ALLOUE_POUR_HORAIRE_MANOEUVRE, null, msgs);
			msgs = basicSetEstAllouePourHoraireManoeuvre(newEstAllouePourHoraireManoeuvre, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSOMMATION_AUTORISEE__EST_ALLOUE_POUR_HORAIRE_MANOEUVRE, newEstAllouePourHoraireManoeuvre, newEstAllouePourHoraireManoeuvre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_CONSOMMATION_AUTORISEE__ACOMME_RESSOURCE_ELEMENTAIRE_RESSOURCE_ELEMENTAIRE:
				return basicSetACommeRessourceElementaireRessourceElementaire(null, msgs);
			case SchemaPackage.TYPE_CONSOMMATION_AUTORISEE__EST_ALLOUE_POUR_HORAIRE_MANOEUVRE:
				return basicSetEstAllouePourHoraireManoeuvre(null, msgs);
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
			case SchemaPackage.TYPE_CONSOMMATION_AUTORISEE__COMMENTAIRE:
				return getCommentaire();
			case SchemaPackage.TYPE_CONSOMMATION_AUTORISEE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_CONSOMMATION_AUTORISEE__CE:
				return getCE();
			case SchemaPackage.TYPE_CONSOMMATION_AUTORISEE__ACOMME_RESSOURCE_ELEMENTAIRE_RESSOURCE_ELEMENTAIRE:
				return getACommeRessourceElementaireRessourceElementaire();
			case SchemaPackage.TYPE_CONSOMMATION_AUTORISEE__EST_ALLOUE_POUR_HORAIRE_MANOEUVRE:
				return getEstAllouePourHoraireManoeuvre();
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
			case SchemaPackage.TYPE_CONSOMMATION_AUTORISEE__COMMENTAIRE:
				setCommentaire((String)newValue);
				return;
			case SchemaPackage.TYPE_CONSOMMATION_AUTORISEE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_CONSOMMATION_AUTORISEE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_CONSOMMATION_AUTORISEE__ACOMME_RESSOURCE_ELEMENTAIRE_RESSOURCE_ELEMENTAIRE:
				setACommeRessourceElementaireRessourceElementaire((TypeRessourceElementaire)newValue);
				return;
			case SchemaPackage.TYPE_CONSOMMATION_AUTORISEE__EST_ALLOUE_POUR_HORAIRE_MANOEUVRE:
				setEstAllouePourHoraireManoeuvre((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_CONSOMMATION_AUTORISEE__COMMENTAIRE:
				setCommentaire(COMMENTAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CONSOMMATION_AUTORISEE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CONSOMMATION_AUTORISEE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CONSOMMATION_AUTORISEE__ACOMME_RESSOURCE_ELEMENTAIRE_RESSOURCE_ELEMENTAIRE:
				setACommeRessourceElementaireRessourceElementaire((TypeRessourceElementaire)null);
				return;
			case SchemaPackage.TYPE_CONSOMMATION_AUTORISEE__EST_ALLOUE_POUR_HORAIRE_MANOEUVRE:
				setEstAllouePourHoraireManoeuvre((TypeAssociation)null);
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
			case SchemaPackage.TYPE_CONSOMMATION_AUTORISEE__COMMENTAIRE:
				return COMMENTAIRE_EDEFAULT == null ? commentaire != null : !COMMENTAIRE_EDEFAULT.equals(commentaire);
			case SchemaPackage.TYPE_CONSOMMATION_AUTORISEE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_CONSOMMATION_AUTORISEE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_CONSOMMATION_AUTORISEE__ACOMME_RESSOURCE_ELEMENTAIRE_RESSOURCE_ELEMENTAIRE:
				return aCommeRessourceElementaireRessourceElementaire != null;
			case SchemaPackage.TYPE_CONSOMMATION_AUTORISEE__EST_ALLOUE_POUR_HORAIRE_MANOEUVRE:
				return estAllouePourHoraireManoeuvre != null;
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
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeConsommationAutoriseeImpl
