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
import mpia.schema.TypeBilanTirsASSsurZone;
import mpia.schema.TypeEffetConstate;
import mpia.schema.TypeEffetTactiqueRecherche;
import mpia.schema.TypeTirsParObjectif;
import mpia.schema.TypeVolumeMunitionsASS;

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
 * An implementation of the model object '<em><b>Type Bilan Tirs AS Ssur Zone</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeBilanTirsASSsurZoneImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBilanTirsASSsurZoneImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBilanTirsASSsurZoneImpl#getEstEffectueSurAutreElementControle <em>Est Effectue Sur Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBilanTirsASSsurZoneImpl#getAPourEffetDemandeEffetTactiqueRecherche <em>APour Effet Demande Effet Tactique Recherche</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBilanTirsASSsurZoneImpl#getConstateEffetConstate <em>Constate Effet Constate</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBilanTirsASSsurZoneImpl#getRendCompteUtilisationVolumeMunitionsASS <em>Rend Compte Utilisation Volume Munitions ASS</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBilanTirsASSsurZoneImpl#getRendCompteTirsParObjectif <em>Rend Compte Tirs Par Objectif</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeBilanTirsASSsurZoneImpl extends EObjectImpl implements TypeBilanTirsASSsurZone {
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
	 * The cached value of the '{@link #getEstEffectueSurAutreElementControle() <em>Est Effectue Sur Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstEffectueSurAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation estEffectueSurAutreElementControle;

	/**
	 * The cached value of the '{@link #getAPourEffetDemandeEffetTactiqueRecherche() <em>APour Effet Demande Effet Tactique Recherche</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourEffetDemandeEffetTactiqueRecherche()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeEffetTactiqueRecherche> aPourEffetDemandeEffetTactiqueRecherche;

	/**
	 * The cached value of the '{@link #getConstateEffetConstate() <em>Constate Effet Constate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstateEffetConstate()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeEffetConstate> constateEffetConstate;

	/**
	 * The cached value of the '{@link #getRendCompteUtilisationVolumeMunitionsASS() <em>Rend Compte Utilisation Volume Munitions ASS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRendCompteUtilisationVolumeMunitionsASS()
	 * @generated
	 * @ordered
	 */
	protected TypeVolumeMunitionsASS rendCompteUtilisationVolumeMunitionsASS;

	/**
	 * The cached value of the '{@link #getRendCompteTirsParObjectif() <em>Rend Compte Tirs Par Objectif</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRendCompteTirsParObjectif()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeTirsParObjectif> rendCompteTirsParObjectif;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeBilanTirsASSsurZoneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeBilanTirsASSsurZone();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BILAN_TIRS_AS_SSUR_ZONE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BILAN_TIRS_AS_SSUR_ZONE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getEstEffectueSurAutreElementControle() {
		return estEffectueSurAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstEffectueSurAutreElementControle(TypeAssociation newEstEffectueSurAutreElementControle, NotificationChain msgs) {
		TypeAssociation oldEstEffectueSurAutreElementControle = estEffectueSurAutreElementControle;
		estEffectueSurAutreElementControle = newEstEffectueSurAutreElementControle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BILAN_TIRS_AS_SSUR_ZONE__EST_EFFECTUE_SUR_AUTRE_ELEMENT_CONTROLE, oldEstEffectueSurAutreElementControle, newEstEffectueSurAutreElementControle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstEffectueSurAutreElementControle(TypeAssociation newEstEffectueSurAutreElementControle) {
		if (newEstEffectueSurAutreElementControle != estEffectueSurAutreElementControle) {
			NotificationChain msgs = null;
			if (estEffectueSurAutreElementControle != null)
				msgs = ((InternalEObject)estEffectueSurAutreElementControle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_BILAN_TIRS_AS_SSUR_ZONE__EST_EFFECTUE_SUR_AUTRE_ELEMENT_CONTROLE, null, msgs);
			if (newEstEffectueSurAutreElementControle != null)
				msgs = ((InternalEObject)newEstEffectueSurAutreElementControle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_BILAN_TIRS_AS_SSUR_ZONE__EST_EFFECTUE_SUR_AUTRE_ELEMENT_CONTROLE, null, msgs);
			msgs = basicSetEstEffectueSurAutreElementControle(newEstEffectueSurAutreElementControle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BILAN_TIRS_AS_SSUR_ZONE__EST_EFFECTUE_SUR_AUTRE_ELEMENT_CONTROLE, newEstEffectueSurAutreElementControle, newEstEffectueSurAutreElementControle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeEffetTactiqueRecherche> getAPourEffetDemandeEffetTactiqueRecherche() {
		if (aPourEffetDemandeEffetTactiqueRecherche == null) {
			aPourEffetDemandeEffetTactiqueRecherche = new EObjectContainmentEList<TypeEffetTactiqueRecherche>(TypeEffetTactiqueRecherche.class, this, SchemaPackage.TYPE_BILAN_TIRS_AS_SSUR_ZONE__APOUR_EFFET_DEMANDE_EFFET_TACTIQUE_RECHERCHE);
		}
		return aPourEffetDemandeEffetTactiqueRecherche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeEffetConstate> getConstateEffetConstate() {
		if (constateEffetConstate == null) {
			constateEffetConstate = new EObjectContainmentEList<TypeEffetConstate>(TypeEffetConstate.class, this, SchemaPackage.TYPE_BILAN_TIRS_AS_SSUR_ZONE__CONSTATE_EFFET_CONSTATE);
		}
		return constateEffetConstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeVolumeMunitionsASS getRendCompteUtilisationVolumeMunitionsASS() {
		return rendCompteUtilisationVolumeMunitionsASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRendCompteUtilisationVolumeMunitionsASS(TypeVolumeMunitionsASS newRendCompteUtilisationVolumeMunitionsASS, NotificationChain msgs) {
		TypeVolumeMunitionsASS oldRendCompteUtilisationVolumeMunitionsASS = rendCompteUtilisationVolumeMunitionsASS;
		rendCompteUtilisationVolumeMunitionsASS = newRendCompteUtilisationVolumeMunitionsASS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BILAN_TIRS_AS_SSUR_ZONE__REND_COMPTE_UTILISATION_VOLUME_MUNITIONS_ASS, oldRendCompteUtilisationVolumeMunitionsASS, newRendCompteUtilisationVolumeMunitionsASS);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRendCompteUtilisationVolumeMunitionsASS(TypeVolumeMunitionsASS newRendCompteUtilisationVolumeMunitionsASS) {
		if (newRendCompteUtilisationVolumeMunitionsASS != rendCompteUtilisationVolumeMunitionsASS) {
			NotificationChain msgs = null;
			if (rendCompteUtilisationVolumeMunitionsASS != null)
				msgs = ((InternalEObject)rendCompteUtilisationVolumeMunitionsASS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_BILAN_TIRS_AS_SSUR_ZONE__REND_COMPTE_UTILISATION_VOLUME_MUNITIONS_ASS, null, msgs);
			if (newRendCompteUtilisationVolumeMunitionsASS != null)
				msgs = ((InternalEObject)newRendCompteUtilisationVolumeMunitionsASS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_BILAN_TIRS_AS_SSUR_ZONE__REND_COMPTE_UTILISATION_VOLUME_MUNITIONS_ASS, null, msgs);
			msgs = basicSetRendCompteUtilisationVolumeMunitionsASS(newRendCompteUtilisationVolumeMunitionsASS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BILAN_TIRS_AS_SSUR_ZONE__REND_COMPTE_UTILISATION_VOLUME_MUNITIONS_ASS, newRendCompteUtilisationVolumeMunitionsASS, newRendCompteUtilisationVolumeMunitionsASS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeTirsParObjectif> getRendCompteTirsParObjectif() {
		if (rendCompteTirsParObjectif == null) {
			rendCompteTirsParObjectif = new EObjectContainmentEList<TypeTirsParObjectif>(TypeTirsParObjectif.class, this, SchemaPackage.TYPE_BILAN_TIRS_AS_SSUR_ZONE__REND_COMPTE_TIRS_PAR_OBJECTIF);
		}
		return rendCompteTirsParObjectif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_BILAN_TIRS_AS_SSUR_ZONE__EST_EFFECTUE_SUR_AUTRE_ELEMENT_CONTROLE:
				return basicSetEstEffectueSurAutreElementControle(null, msgs);
			case SchemaPackage.TYPE_BILAN_TIRS_AS_SSUR_ZONE__APOUR_EFFET_DEMANDE_EFFET_TACTIQUE_RECHERCHE:
				return ((InternalEList<?>)getAPourEffetDemandeEffetTactiqueRecherche()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_BILAN_TIRS_AS_SSUR_ZONE__CONSTATE_EFFET_CONSTATE:
				return ((InternalEList<?>)getConstateEffetConstate()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_BILAN_TIRS_AS_SSUR_ZONE__REND_COMPTE_UTILISATION_VOLUME_MUNITIONS_ASS:
				return basicSetRendCompteUtilisationVolumeMunitionsASS(null, msgs);
			case SchemaPackage.TYPE_BILAN_TIRS_AS_SSUR_ZONE__REND_COMPTE_TIRS_PAR_OBJECTIF:
				return ((InternalEList<?>)getRendCompteTirsParObjectif()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_BILAN_TIRS_AS_SSUR_ZONE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_BILAN_TIRS_AS_SSUR_ZONE__CE:
				return getCE();
			case SchemaPackage.TYPE_BILAN_TIRS_AS_SSUR_ZONE__EST_EFFECTUE_SUR_AUTRE_ELEMENT_CONTROLE:
				return getEstEffectueSurAutreElementControle();
			case SchemaPackage.TYPE_BILAN_TIRS_AS_SSUR_ZONE__APOUR_EFFET_DEMANDE_EFFET_TACTIQUE_RECHERCHE:
				return getAPourEffetDemandeEffetTactiqueRecherche();
			case SchemaPackage.TYPE_BILAN_TIRS_AS_SSUR_ZONE__CONSTATE_EFFET_CONSTATE:
				return getConstateEffetConstate();
			case SchemaPackage.TYPE_BILAN_TIRS_AS_SSUR_ZONE__REND_COMPTE_UTILISATION_VOLUME_MUNITIONS_ASS:
				return getRendCompteUtilisationVolumeMunitionsASS();
			case SchemaPackage.TYPE_BILAN_TIRS_AS_SSUR_ZONE__REND_COMPTE_TIRS_PAR_OBJECTIF:
				return getRendCompteTirsParObjectif();
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
			case SchemaPackage.TYPE_BILAN_TIRS_AS_SSUR_ZONE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_BILAN_TIRS_AS_SSUR_ZONE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_BILAN_TIRS_AS_SSUR_ZONE__EST_EFFECTUE_SUR_AUTRE_ELEMENT_CONTROLE:
				setEstEffectueSurAutreElementControle((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_BILAN_TIRS_AS_SSUR_ZONE__APOUR_EFFET_DEMANDE_EFFET_TACTIQUE_RECHERCHE:
				getAPourEffetDemandeEffetTactiqueRecherche().clear();
				getAPourEffetDemandeEffetTactiqueRecherche().addAll((Collection<? extends TypeEffetTactiqueRecherche>)newValue);
				return;
			case SchemaPackage.TYPE_BILAN_TIRS_AS_SSUR_ZONE__CONSTATE_EFFET_CONSTATE:
				getConstateEffetConstate().clear();
				getConstateEffetConstate().addAll((Collection<? extends TypeEffetConstate>)newValue);
				return;
			case SchemaPackage.TYPE_BILAN_TIRS_AS_SSUR_ZONE__REND_COMPTE_UTILISATION_VOLUME_MUNITIONS_ASS:
				setRendCompteUtilisationVolumeMunitionsASS((TypeVolumeMunitionsASS)newValue);
				return;
			case SchemaPackage.TYPE_BILAN_TIRS_AS_SSUR_ZONE__REND_COMPTE_TIRS_PAR_OBJECTIF:
				getRendCompteTirsParObjectif().clear();
				getRendCompteTirsParObjectif().addAll((Collection<? extends TypeTirsParObjectif>)newValue);
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
			case SchemaPackage.TYPE_BILAN_TIRS_AS_SSUR_ZONE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_BILAN_TIRS_AS_SSUR_ZONE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_BILAN_TIRS_AS_SSUR_ZONE__EST_EFFECTUE_SUR_AUTRE_ELEMENT_CONTROLE:
				setEstEffectueSurAutreElementControle((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_BILAN_TIRS_AS_SSUR_ZONE__APOUR_EFFET_DEMANDE_EFFET_TACTIQUE_RECHERCHE:
				getAPourEffetDemandeEffetTactiqueRecherche().clear();
				return;
			case SchemaPackage.TYPE_BILAN_TIRS_AS_SSUR_ZONE__CONSTATE_EFFET_CONSTATE:
				getConstateEffetConstate().clear();
				return;
			case SchemaPackage.TYPE_BILAN_TIRS_AS_SSUR_ZONE__REND_COMPTE_UTILISATION_VOLUME_MUNITIONS_ASS:
				setRendCompteUtilisationVolumeMunitionsASS((TypeVolumeMunitionsASS)null);
				return;
			case SchemaPackage.TYPE_BILAN_TIRS_AS_SSUR_ZONE__REND_COMPTE_TIRS_PAR_OBJECTIF:
				getRendCompteTirsParObjectif().clear();
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
			case SchemaPackage.TYPE_BILAN_TIRS_AS_SSUR_ZONE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_BILAN_TIRS_AS_SSUR_ZONE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_BILAN_TIRS_AS_SSUR_ZONE__EST_EFFECTUE_SUR_AUTRE_ELEMENT_CONTROLE:
				return estEffectueSurAutreElementControle != null;
			case SchemaPackage.TYPE_BILAN_TIRS_AS_SSUR_ZONE__APOUR_EFFET_DEMANDE_EFFET_TACTIQUE_RECHERCHE:
				return aPourEffetDemandeEffetTactiqueRecherche != null && !aPourEffetDemandeEffetTactiqueRecherche.isEmpty();
			case SchemaPackage.TYPE_BILAN_TIRS_AS_SSUR_ZONE__CONSTATE_EFFET_CONSTATE:
				return constateEffetConstate != null && !constateEffetConstate.isEmpty();
			case SchemaPackage.TYPE_BILAN_TIRS_AS_SSUR_ZONE__REND_COMPTE_UTILISATION_VOLUME_MUNITIONS_ASS:
				return rendCompteUtilisationVolumeMunitionsASS != null;
			case SchemaPackage.TYPE_BILAN_TIRS_AS_SSUR_ZONE__REND_COMPTE_TIRS_PAR_OBJECTIF:
				return rendCompteTirsParObjectif != null && !rendCompteTirsParObjectif.isEmpty();
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

} //TypeBilanTirsASSsurZoneImpl
