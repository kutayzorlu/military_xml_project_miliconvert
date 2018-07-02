/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoSuiviDemandeEtatDemande;
import mpia.schema.TypeDictionaryDicoSuiviDemandePrioriteRevisee;
import mpia.schema.TypeSuiviDemande;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Suivi Demande</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeSuiviDemandeImpl#getIdentifiantDemande <em>Identifiant Demande</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSuiviDemandeImpl#getEtatDemande <em>Etat Demande</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSuiviDemandeImpl#getPrioriteRevisee <em>Priorite Revisee</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSuiviDemandeImpl#getCommentaireAbrege <em>Commentaire Abrege</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeSuiviDemandeImpl extends EObjectImpl implements TypeSuiviDemande {
	/**
	 * The default value of the '{@link #getIdentifiantDemande() <em>Identifiant Demande</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiantDemande()
	 * @generated
	 * @ordered
	 */
	protected static final long IDENTIFIANT_DEMANDE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getIdentifiantDemande() <em>Identifiant Demande</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiantDemande()
	 * @generated
	 * @ordered
	 */
	protected long identifiantDemande = IDENTIFIANT_DEMANDE_EDEFAULT;

	/**
	 * This is true if the Identifiant Demande attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean identifiantDemandeESet;

	/**
	 * The default value of the '{@link #getEtatDemande() <em>Etat Demande</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatDemande()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoSuiviDemandeEtatDemande ETAT_DEMANDE_EDEFAULT = TypeDictionaryDicoSuiviDemandeEtatDemande.APPRVD;

	/**
	 * The cached value of the '{@link #getEtatDemande() <em>Etat Demande</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatDemande()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoSuiviDemandeEtatDemande etatDemande = ETAT_DEMANDE_EDEFAULT;

	/**
	 * This is true if the Etat Demande attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean etatDemandeESet;

	/**
	 * The default value of the '{@link #getPrioriteRevisee() <em>Priorite Revisee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrioriteRevisee()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoSuiviDemandePrioriteRevisee PRIORITE_REVISEE_EDEFAULT = TypeDictionaryDicoSuiviDemandePrioriteRevisee._1A1B;

	/**
	 * The cached value of the '{@link #getPrioriteRevisee() <em>Priorite Revisee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrioriteRevisee()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoSuiviDemandePrioriteRevisee prioriteRevisee = PRIORITE_REVISEE_EDEFAULT;

	/**
	 * This is true if the Priorite Revisee attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean prioriteReviseeESet;

	/**
	 * The default value of the '{@link #getCommentaireAbrege() <em>Commentaire Abrege</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaireAbrege()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTAIRE_ABREGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommentaireAbrege() <em>Commentaire Abrege</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaireAbrege()
	 * @generated
	 * @ordered
	 */
	protected String commentaireAbrege = COMMENTAIRE_ABREGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeSuiviDemandeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeSuiviDemande();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getIdentifiantDemande() {
		return identifiantDemande;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifiantDemande(long newIdentifiantDemande) {
		long oldIdentifiantDemande = identifiantDemande;
		identifiantDemande = newIdentifiantDemande;
		boolean oldIdentifiantDemandeESet = identifiantDemandeESet;
		identifiantDemandeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SUIVI_DEMANDE__IDENTIFIANT_DEMANDE, oldIdentifiantDemande, identifiantDemande, !oldIdentifiantDemandeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIdentifiantDemande() {
		long oldIdentifiantDemande = identifiantDemande;
		boolean oldIdentifiantDemandeESet = identifiantDemandeESet;
		identifiantDemande = IDENTIFIANT_DEMANDE_EDEFAULT;
		identifiantDemandeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SUIVI_DEMANDE__IDENTIFIANT_DEMANDE, oldIdentifiantDemande, IDENTIFIANT_DEMANDE_EDEFAULT, oldIdentifiantDemandeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIdentifiantDemande() {
		return identifiantDemandeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoSuiviDemandeEtatDemande getEtatDemande() {
		return etatDemande;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtatDemande(TypeDictionaryDicoSuiviDemandeEtatDemande newEtatDemande) {
		TypeDictionaryDicoSuiviDemandeEtatDemande oldEtatDemande = etatDemande;
		etatDemande = newEtatDemande == null ? ETAT_DEMANDE_EDEFAULT : newEtatDemande;
		boolean oldEtatDemandeESet = etatDemandeESet;
		etatDemandeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SUIVI_DEMANDE__ETAT_DEMANDE, oldEtatDemande, etatDemande, !oldEtatDemandeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEtatDemande() {
		TypeDictionaryDicoSuiviDemandeEtatDemande oldEtatDemande = etatDemande;
		boolean oldEtatDemandeESet = etatDemandeESet;
		etatDemande = ETAT_DEMANDE_EDEFAULT;
		etatDemandeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SUIVI_DEMANDE__ETAT_DEMANDE, oldEtatDemande, ETAT_DEMANDE_EDEFAULT, oldEtatDemandeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEtatDemande() {
		return etatDemandeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoSuiviDemandePrioriteRevisee getPrioriteRevisee() {
		return prioriteRevisee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrioriteRevisee(TypeDictionaryDicoSuiviDemandePrioriteRevisee newPrioriteRevisee) {
		TypeDictionaryDicoSuiviDemandePrioriteRevisee oldPrioriteRevisee = prioriteRevisee;
		prioriteRevisee = newPrioriteRevisee == null ? PRIORITE_REVISEE_EDEFAULT : newPrioriteRevisee;
		boolean oldPrioriteReviseeESet = prioriteReviseeESet;
		prioriteReviseeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SUIVI_DEMANDE__PRIORITE_REVISEE, oldPrioriteRevisee, prioriteRevisee, !oldPrioriteReviseeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPrioriteRevisee() {
		TypeDictionaryDicoSuiviDemandePrioriteRevisee oldPrioriteRevisee = prioriteRevisee;
		boolean oldPrioriteReviseeESet = prioriteReviseeESet;
		prioriteRevisee = PRIORITE_REVISEE_EDEFAULT;
		prioriteReviseeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SUIVI_DEMANDE__PRIORITE_REVISEE, oldPrioriteRevisee, PRIORITE_REVISEE_EDEFAULT, oldPrioriteReviseeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPrioriteRevisee() {
		return prioriteReviseeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommentaireAbrege() {
		return commentaireAbrege;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommentaireAbrege(String newCommentaireAbrege) {
		String oldCommentaireAbrege = commentaireAbrege;
		commentaireAbrege = newCommentaireAbrege;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SUIVI_DEMANDE__COMMENTAIRE_ABREGE, oldCommentaireAbrege, commentaireAbrege));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_SUIVI_DEMANDE__IDENTIFIANT_DEMANDE:
				return new Long(getIdentifiantDemande());
			case SchemaPackage.TYPE_SUIVI_DEMANDE__ETAT_DEMANDE:
				return getEtatDemande();
			case SchemaPackage.TYPE_SUIVI_DEMANDE__PRIORITE_REVISEE:
				return getPrioriteRevisee();
			case SchemaPackage.TYPE_SUIVI_DEMANDE__COMMENTAIRE_ABREGE:
				return getCommentaireAbrege();
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
			case SchemaPackage.TYPE_SUIVI_DEMANDE__IDENTIFIANT_DEMANDE:
				setIdentifiantDemande(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_SUIVI_DEMANDE__ETAT_DEMANDE:
				setEtatDemande((TypeDictionaryDicoSuiviDemandeEtatDemande)newValue);
				return;
			case SchemaPackage.TYPE_SUIVI_DEMANDE__PRIORITE_REVISEE:
				setPrioriteRevisee((TypeDictionaryDicoSuiviDemandePrioriteRevisee)newValue);
				return;
			case SchemaPackage.TYPE_SUIVI_DEMANDE__COMMENTAIRE_ABREGE:
				setCommentaireAbrege((String)newValue);
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
			case SchemaPackage.TYPE_SUIVI_DEMANDE__IDENTIFIANT_DEMANDE:
				unsetIdentifiantDemande();
				return;
			case SchemaPackage.TYPE_SUIVI_DEMANDE__ETAT_DEMANDE:
				unsetEtatDemande();
				return;
			case SchemaPackage.TYPE_SUIVI_DEMANDE__PRIORITE_REVISEE:
				unsetPrioriteRevisee();
				return;
			case SchemaPackage.TYPE_SUIVI_DEMANDE__COMMENTAIRE_ABREGE:
				setCommentaireAbrege(COMMENTAIRE_ABREGE_EDEFAULT);
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
			case SchemaPackage.TYPE_SUIVI_DEMANDE__IDENTIFIANT_DEMANDE:
				return isSetIdentifiantDemande();
			case SchemaPackage.TYPE_SUIVI_DEMANDE__ETAT_DEMANDE:
				return isSetEtatDemande();
			case SchemaPackage.TYPE_SUIVI_DEMANDE__PRIORITE_REVISEE:
				return isSetPrioriteRevisee();
			case SchemaPackage.TYPE_SUIVI_DEMANDE__COMMENTAIRE_ABREGE:
				return COMMENTAIRE_ABREGE_EDEFAULT == null ? commentaireAbrege != null : !COMMENTAIRE_ABREGE_EDEFAULT.equals(commentaireAbrege);
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
		result.append(" (identifiantDemande: ");
		if (identifiantDemandeESet) result.append(identifiantDemande); else result.append("<unset>");
		result.append(", etatDemande: ");
		if (etatDemandeESet) result.append(etatDemande); else result.append("<unset>");
		result.append(", prioriteRevisee: ");
		if (prioriteReviseeESet) result.append(prioriteRevisee); else result.append("<unset>");
		result.append(", commentaireAbrege: ");
		result.append(commentaireAbrege);
		result.append(')');
		return result.toString();
	}

} //TypeSuiviDemandeImpl
