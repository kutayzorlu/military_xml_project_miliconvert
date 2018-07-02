/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeModaliteSoutienLogistique;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Modalite Soutien Logistique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeModaliteSoutienLogistiqueImpl#isSoutienGeneral <em>Soutien General</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModaliteSoutienLogistiqueImpl#isSoutienSpecifiqueEquipements <em>Soutien Specifique Equipements</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModaliteSoutienLogistiqueImpl#isSoutienSpecifiqueEnRessources <em>Soutien Specifique En Ressources</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModaliteSoutienLogistiqueImpl#isPriseEnCompteEffectifs <em>Prise En Compte Effectifs</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModaliteSoutienLogistiqueImpl#isPriseEnCompteSuiviAdministratif <em>Prise En Compte Suivi Administratif</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModaliteSoutienLogistiqueImpl#isAutre <em>Autre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModaliteSoutienLogistiqueImpl#getCommentaire <em>Commentaire</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeModaliteSoutienLogistiqueImpl extends EObjectImpl implements TypeModaliteSoutienLogistique {
	/**
	 * The default value of the '{@link #isSoutienGeneral() <em>Soutien General</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSoutienGeneral()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SOUTIEN_GENERAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSoutienGeneral() <em>Soutien General</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSoutienGeneral()
	 * @generated
	 * @ordered
	 */
	protected boolean soutienGeneral = SOUTIEN_GENERAL_EDEFAULT;

	/**
	 * This is true if the Soutien General attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean soutienGeneralESet;

	/**
	 * The default value of the '{@link #isSoutienSpecifiqueEquipements() <em>Soutien Specifique Equipements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSoutienSpecifiqueEquipements()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SOUTIEN_SPECIFIQUE_EQUIPEMENTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSoutienSpecifiqueEquipements() <em>Soutien Specifique Equipements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSoutienSpecifiqueEquipements()
	 * @generated
	 * @ordered
	 */
	protected boolean soutienSpecifiqueEquipements = SOUTIEN_SPECIFIQUE_EQUIPEMENTS_EDEFAULT;

	/**
	 * This is true if the Soutien Specifique Equipements attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean soutienSpecifiqueEquipementsESet;

	/**
	 * The default value of the '{@link #isSoutienSpecifiqueEnRessources() <em>Soutien Specifique En Ressources</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSoutienSpecifiqueEnRessources()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SOUTIEN_SPECIFIQUE_EN_RESSOURCES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSoutienSpecifiqueEnRessources() <em>Soutien Specifique En Ressources</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSoutienSpecifiqueEnRessources()
	 * @generated
	 * @ordered
	 */
	protected boolean soutienSpecifiqueEnRessources = SOUTIEN_SPECIFIQUE_EN_RESSOURCES_EDEFAULT;

	/**
	 * This is true if the Soutien Specifique En Ressources attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean soutienSpecifiqueEnRessourcesESet;

	/**
	 * The default value of the '{@link #isPriseEnCompteEffectifs() <em>Prise En Compte Effectifs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPriseEnCompteEffectifs()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRISE_EN_COMPTE_EFFECTIFS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPriseEnCompteEffectifs() <em>Prise En Compte Effectifs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPriseEnCompteEffectifs()
	 * @generated
	 * @ordered
	 */
	protected boolean priseEnCompteEffectifs = PRISE_EN_COMPTE_EFFECTIFS_EDEFAULT;

	/**
	 * This is true if the Prise En Compte Effectifs attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean priseEnCompteEffectifsESet;

	/**
	 * The default value of the '{@link #isPriseEnCompteSuiviAdministratif() <em>Prise En Compte Suivi Administratif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPriseEnCompteSuiviAdministratif()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRISE_EN_COMPTE_SUIVI_ADMINISTRATIF_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPriseEnCompteSuiviAdministratif() <em>Prise En Compte Suivi Administratif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPriseEnCompteSuiviAdministratif()
	 * @generated
	 * @ordered
	 */
	protected boolean priseEnCompteSuiviAdministratif = PRISE_EN_COMPTE_SUIVI_ADMINISTRATIF_EDEFAULT;

	/**
	 * This is true if the Prise En Compte Suivi Administratif attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean priseEnCompteSuiviAdministratifESet;

	/**
	 * The default value of the '{@link #isAutre() <em>Autre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutre()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTRE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAutre() <em>Autre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutre()
	 * @generated
	 * @ordered
	 */
	protected boolean autre = AUTRE_EDEFAULT;

	/**
	 * This is true if the Autre attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean autreESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeModaliteSoutienLogistiqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeModaliteSoutienLogistique();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSoutienGeneral() {
		return soutienGeneral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoutienGeneral(boolean newSoutienGeneral) {
		boolean oldSoutienGeneral = soutienGeneral;
		soutienGeneral = newSoutienGeneral;
		boolean oldSoutienGeneralESet = soutienGeneralESet;
		soutienGeneralESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITE_SOUTIEN_LOGISTIQUE__SOUTIEN_GENERAL, oldSoutienGeneral, soutienGeneral, !oldSoutienGeneralESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSoutienGeneral() {
		boolean oldSoutienGeneral = soutienGeneral;
		boolean oldSoutienGeneralESet = soutienGeneralESet;
		soutienGeneral = SOUTIEN_GENERAL_EDEFAULT;
		soutienGeneralESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MODALITE_SOUTIEN_LOGISTIQUE__SOUTIEN_GENERAL, oldSoutienGeneral, SOUTIEN_GENERAL_EDEFAULT, oldSoutienGeneralESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSoutienGeneral() {
		return soutienGeneralESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSoutienSpecifiqueEquipements() {
		return soutienSpecifiqueEquipements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoutienSpecifiqueEquipements(boolean newSoutienSpecifiqueEquipements) {
		boolean oldSoutienSpecifiqueEquipements = soutienSpecifiqueEquipements;
		soutienSpecifiqueEquipements = newSoutienSpecifiqueEquipements;
		boolean oldSoutienSpecifiqueEquipementsESet = soutienSpecifiqueEquipementsESet;
		soutienSpecifiqueEquipementsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITE_SOUTIEN_LOGISTIQUE__SOUTIEN_SPECIFIQUE_EQUIPEMENTS, oldSoutienSpecifiqueEquipements, soutienSpecifiqueEquipements, !oldSoutienSpecifiqueEquipementsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSoutienSpecifiqueEquipements() {
		boolean oldSoutienSpecifiqueEquipements = soutienSpecifiqueEquipements;
		boolean oldSoutienSpecifiqueEquipementsESet = soutienSpecifiqueEquipementsESet;
		soutienSpecifiqueEquipements = SOUTIEN_SPECIFIQUE_EQUIPEMENTS_EDEFAULT;
		soutienSpecifiqueEquipementsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MODALITE_SOUTIEN_LOGISTIQUE__SOUTIEN_SPECIFIQUE_EQUIPEMENTS, oldSoutienSpecifiqueEquipements, SOUTIEN_SPECIFIQUE_EQUIPEMENTS_EDEFAULT, oldSoutienSpecifiqueEquipementsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSoutienSpecifiqueEquipements() {
		return soutienSpecifiqueEquipementsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSoutienSpecifiqueEnRessources() {
		return soutienSpecifiqueEnRessources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoutienSpecifiqueEnRessources(boolean newSoutienSpecifiqueEnRessources) {
		boolean oldSoutienSpecifiqueEnRessources = soutienSpecifiqueEnRessources;
		soutienSpecifiqueEnRessources = newSoutienSpecifiqueEnRessources;
		boolean oldSoutienSpecifiqueEnRessourcesESet = soutienSpecifiqueEnRessourcesESet;
		soutienSpecifiqueEnRessourcesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITE_SOUTIEN_LOGISTIQUE__SOUTIEN_SPECIFIQUE_EN_RESSOURCES, oldSoutienSpecifiqueEnRessources, soutienSpecifiqueEnRessources, !oldSoutienSpecifiqueEnRessourcesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSoutienSpecifiqueEnRessources() {
		boolean oldSoutienSpecifiqueEnRessources = soutienSpecifiqueEnRessources;
		boolean oldSoutienSpecifiqueEnRessourcesESet = soutienSpecifiqueEnRessourcesESet;
		soutienSpecifiqueEnRessources = SOUTIEN_SPECIFIQUE_EN_RESSOURCES_EDEFAULT;
		soutienSpecifiqueEnRessourcesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MODALITE_SOUTIEN_LOGISTIQUE__SOUTIEN_SPECIFIQUE_EN_RESSOURCES, oldSoutienSpecifiqueEnRessources, SOUTIEN_SPECIFIQUE_EN_RESSOURCES_EDEFAULT, oldSoutienSpecifiqueEnRessourcesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSoutienSpecifiqueEnRessources() {
		return soutienSpecifiqueEnRessourcesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPriseEnCompteEffectifs() {
		return priseEnCompteEffectifs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriseEnCompteEffectifs(boolean newPriseEnCompteEffectifs) {
		boolean oldPriseEnCompteEffectifs = priseEnCompteEffectifs;
		priseEnCompteEffectifs = newPriseEnCompteEffectifs;
		boolean oldPriseEnCompteEffectifsESet = priseEnCompteEffectifsESet;
		priseEnCompteEffectifsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITE_SOUTIEN_LOGISTIQUE__PRISE_EN_COMPTE_EFFECTIFS, oldPriseEnCompteEffectifs, priseEnCompteEffectifs, !oldPriseEnCompteEffectifsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPriseEnCompteEffectifs() {
		boolean oldPriseEnCompteEffectifs = priseEnCompteEffectifs;
		boolean oldPriseEnCompteEffectifsESet = priseEnCompteEffectifsESet;
		priseEnCompteEffectifs = PRISE_EN_COMPTE_EFFECTIFS_EDEFAULT;
		priseEnCompteEffectifsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MODALITE_SOUTIEN_LOGISTIQUE__PRISE_EN_COMPTE_EFFECTIFS, oldPriseEnCompteEffectifs, PRISE_EN_COMPTE_EFFECTIFS_EDEFAULT, oldPriseEnCompteEffectifsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPriseEnCompteEffectifs() {
		return priseEnCompteEffectifsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPriseEnCompteSuiviAdministratif() {
		return priseEnCompteSuiviAdministratif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriseEnCompteSuiviAdministratif(boolean newPriseEnCompteSuiviAdministratif) {
		boolean oldPriseEnCompteSuiviAdministratif = priseEnCompteSuiviAdministratif;
		priseEnCompteSuiviAdministratif = newPriseEnCompteSuiviAdministratif;
		boolean oldPriseEnCompteSuiviAdministratifESet = priseEnCompteSuiviAdministratifESet;
		priseEnCompteSuiviAdministratifESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITE_SOUTIEN_LOGISTIQUE__PRISE_EN_COMPTE_SUIVI_ADMINISTRATIF, oldPriseEnCompteSuiviAdministratif, priseEnCompteSuiviAdministratif, !oldPriseEnCompteSuiviAdministratifESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPriseEnCompteSuiviAdministratif() {
		boolean oldPriseEnCompteSuiviAdministratif = priseEnCompteSuiviAdministratif;
		boolean oldPriseEnCompteSuiviAdministratifESet = priseEnCompteSuiviAdministratifESet;
		priseEnCompteSuiviAdministratif = PRISE_EN_COMPTE_SUIVI_ADMINISTRATIF_EDEFAULT;
		priseEnCompteSuiviAdministratifESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MODALITE_SOUTIEN_LOGISTIQUE__PRISE_EN_COMPTE_SUIVI_ADMINISTRATIF, oldPriseEnCompteSuiviAdministratif, PRISE_EN_COMPTE_SUIVI_ADMINISTRATIF_EDEFAULT, oldPriseEnCompteSuiviAdministratifESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPriseEnCompteSuiviAdministratif() {
		return priseEnCompteSuiviAdministratifESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAutre() {
		return autre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutre(boolean newAutre) {
		boolean oldAutre = autre;
		autre = newAutre;
		boolean oldAutreESet = autreESet;
		autreESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITE_SOUTIEN_LOGISTIQUE__AUTRE, oldAutre, autre, !oldAutreESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAutre() {
		boolean oldAutre = autre;
		boolean oldAutreESet = autreESet;
		autre = AUTRE_EDEFAULT;
		autreESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MODALITE_SOUTIEN_LOGISTIQUE__AUTRE, oldAutre, AUTRE_EDEFAULT, oldAutreESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAutre() {
		return autreESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITE_SOUTIEN_LOGISTIQUE__COMMENTAIRE, oldCommentaire, commentaire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_MODALITE_SOUTIEN_LOGISTIQUE__SOUTIEN_GENERAL:
				return isSoutienGeneral() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_MODALITE_SOUTIEN_LOGISTIQUE__SOUTIEN_SPECIFIQUE_EQUIPEMENTS:
				return isSoutienSpecifiqueEquipements() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_MODALITE_SOUTIEN_LOGISTIQUE__SOUTIEN_SPECIFIQUE_EN_RESSOURCES:
				return isSoutienSpecifiqueEnRessources() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_MODALITE_SOUTIEN_LOGISTIQUE__PRISE_EN_COMPTE_EFFECTIFS:
				return isPriseEnCompteEffectifs() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_MODALITE_SOUTIEN_LOGISTIQUE__PRISE_EN_COMPTE_SUIVI_ADMINISTRATIF:
				return isPriseEnCompteSuiviAdministratif() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_MODALITE_SOUTIEN_LOGISTIQUE__AUTRE:
				return isAutre() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_MODALITE_SOUTIEN_LOGISTIQUE__COMMENTAIRE:
				return getCommentaire();
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
			case SchemaPackage.TYPE_MODALITE_SOUTIEN_LOGISTIQUE__SOUTIEN_GENERAL:
				setSoutienGeneral(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_MODALITE_SOUTIEN_LOGISTIQUE__SOUTIEN_SPECIFIQUE_EQUIPEMENTS:
				setSoutienSpecifiqueEquipements(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_MODALITE_SOUTIEN_LOGISTIQUE__SOUTIEN_SPECIFIQUE_EN_RESSOURCES:
				setSoutienSpecifiqueEnRessources(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_MODALITE_SOUTIEN_LOGISTIQUE__PRISE_EN_COMPTE_EFFECTIFS:
				setPriseEnCompteEffectifs(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_MODALITE_SOUTIEN_LOGISTIQUE__PRISE_EN_COMPTE_SUIVI_ADMINISTRATIF:
				setPriseEnCompteSuiviAdministratif(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_MODALITE_SOUTIEN_LOGISTIQUE__AUTRE:
				setAutre(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_MODALITE_SOUTIEN_LOGISTIQUE__COMMENTAIRE:
				setCommentaire((String)newValue);
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
			case SchemaPackage.TYPE_MODALITE_SOUTIEN_LOGISTIQUE__SOUTIEN_GENERAL:
				unsetSoutienGeneral();
				return;
			case SchemaPackage.TYPE_MODALITE_SOUTIEN_LOGISTIQUE__SOUTIEN_SPECIFIQUE_EQUIPEMENTS:
				unsetSoutienSpecifiqueEquipements();
				return;
			case SchemaPackage.TYPE_MODALITE_SOUTIEN_LOGISTIQUE__SOUTIEN_SPECIFIQUE_EN_RESSOURCES:
				unsetSoutienSpecifiqueEnRessources();
				return;
			case SchemaPackage.TYPE_MODALITE_SOUTIEN_LOGISTIQUE__PRISE_EN_COMPTE_EFFECTIFS:
				unsetPriseEnCompteEffectifs();
				return;
			case SchemaPackage.TYPE_MODALITE_SOUTIEN_LOGISTIQUE__PRISE_EN_COMPTE_SUIVI_ADMINISTRATIF:
				unsetPriseEnCompteSuiviAdministratif();
				return;
			case SchemaPackage.TYPE_MODALITE_SOUTIEN_LOGISTIQUE__AUTRE:
				unsetAutre();
				return;
			case SchemaPackage.TYPE_MODALITE_SOUTIEN_LOGISTIQUE__COMMENTAIRE:
				setCommentaire(COMMENTAIRE_EDEFAULT);
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
			case SchemaPackage.TYPE_MODALITE_SOUTIEN_LOGISTIQUE__SOUTIEN_GENERAL:
				return isSetSoutienGeneral();
			case SchemaPackage.TYPE_MODALITE_SOUTIEN_LOGISTIQUE__SOUTIEN_SPECIFIQUE_EQUIPEMENTS:
				return isSetSoutienSpecifiqueEquipements();
			case SchemaPackage.TYPE_MODALITE_SOUTIEN_LOGISTIQUE__SOUTIEN_SPECIFIQUE_EN_RESSOURCES:
				return isSetSoutienSpecifiqueEnRessources();
			case SchemaPackage.TYPE_MODALITE_SOUTIEN_LOGISTIQUE__PRISE_EN_COMPTE_EFFECTIFS:
				return isSetPriseEnCompteEffectifs();
			case SchemaPackage.TYPE_MODALITE_SOUTIEN_LOGISTIQUE__PRISE_EN_COMPTE_SUIVI_ADMINISTRATIF:
				return isSetPriseEnCompteSuiviAdministratif();
			case SchemaPackage.TYPE_MODALITE_SOUTIEN_LOGISTIQUE__AUTRE:
				return isSetAutre();
			case SchemaPackage.TYPE_MODALITE_SOUTIEN_LOGISTIQUE__COMMENTAIRE:
				return COMMENTAIRE_EDEFAULT == null ? commentaire != null : !COMMENTAIRE_EDEFAULT.equals(commentaire);
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
		result.append(" (soutienGeneral: ");
		if (soutienGeneralESet) result.append(soutienGeneral); else result.append("<unset>");
		result.append(", soutienSpecifiqueEquipements: ");
		if (soutienSpecifiqueEquipementsESet) result.append(soutienSpecifiqueEquipements); else result.append("<unset>");
		result.append(", soutienSpecifiqueEnRessources: ");
		if (soutienSpecifiqueEnRessourcesESet) result.append(soutienSpecifiqueEnRessources); else result.append("<unset>");
		result.append(", priseEnCompteEffectifs: ");
		if (priseEnCompteEffectifsESet) result.append(priseEnCompteEffectifs); else result.append("<unset>");
		result.append(", priseEnCompteSuiviAdministratif: ");
		if (priseEnCompteSuiviAdministratifESet) result.append(priseEnCompteSuiviAdministratif); else result.append("<unset>");
		result.append(", autre: ");
		if (autreESet) result.append(autre); else result.append("<unset>");
		result.append(", commentaire: ");
		result.append(commentaire);
		result.append(')');
		return result.toString();
	}

} //TypeModaliteSoutienLogistiqueImpl
