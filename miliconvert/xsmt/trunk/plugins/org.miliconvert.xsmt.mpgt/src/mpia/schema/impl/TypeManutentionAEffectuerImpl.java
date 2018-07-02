/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeManutentionAEffectuer;
import mpia.schema.TypeRessourceElementaire;

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
 * An implementation of the model object '<em><b>Type Manutention AEffectuer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeManutentionAEffectuerImpl#getDescriptionMission <em>Description Mission</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeManutentionAEffectuerImpl#getDateDeDebut <em>Date De Debut</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeManutentionAEffectuerImpl#getDateDeFin <em>Date De Fin</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeManutentionAEffectuerImpl#getMoyens <em>Moyens</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeManutentionAEffectuerImpl#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeManutentionAEffectuerImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeManutentionAEffectuerImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeManutentionAEffectuerImpl#getEstAffecteeUnite <em>Est Affectee Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeManutentionAEffectuerImpl#getACommeLieuMissionManutentionAutreElementControle <em>AComme Lieu Mission Manutention Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeManutentionAEffectuerImpl#getACommeRessourceElementaireRessourceElementaire <em>AComme Ressource Elementaire Ressource Elementaire</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeManutentionAEffectuerImpl extends EObjectImpl implements TypeManutentionAEffectuer {
	/**
	 * The default value of the '{@link #getDescriptionMission() <em>Description Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionMission()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_MISSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescriptionMission() <em>Description Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionMission()
	 * @generated
	 * @ordered
	 */
	protected String descriptionMission = DESCRIPTION_MISSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateDeDebut() <em>Date De Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDeDebut()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_DE_DEBUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateDeDebut() <em>Date De Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDeDebut()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateDeDebut = DATE_DE_DEBUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateDeFin() <em>Date De Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDeFin()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_DE_FIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateDeFin() <em>Date De Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDeFin()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateDeFin = DATE_DE_FIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMoyens() <em>Moyens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyens()
	 * @generated
	 * @ordered
	 */
	protected static final String MOYENS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMoyens() <em>Moyens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyens()
	 * @generated
	 * @ordered
	 */
	protected String moyens = MOYENS_EDEFAULT;

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
	 * The cached value of the '{@link #getEstAffecteeUnite() <em>Est Affectee Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstAffecteeUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT estAffecteeUnite;

	/**
	 * The cached value of the '{@link #getACommeLieuMissionManutentionAutreElementControle() <em>AComme Lieu Mission Manutention Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeLieuMissionManutentionAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aCommeLieuMissionManutentionAutreElementControle;

	/**
	 * The cached value of the '{@link #getACommeRessourceElementaireRessourceElementaire() <em>AComme Ressource Elementaire Ressource Elementaire</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeRessourceElementaireRessourceElementaire()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeRessourceElementaire> aCommeRessourceElementaireRessourceElementaire;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeManutentionAEffectuerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeManutentionAEffectuer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescriptionMission() {
		return descriptionMission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptionMission(String newDescriptionMission) {
		String oldDescriptionMission = descriptionMission;
		descriptionMission = newDescriptionMission;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MANUTENTION_AEFFECTUER__DESCRIPTION_MISSION, oldDescriptionMission, descriptionMission));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateDeDebut() {
		return dateDeDebut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateDeDebut(XMLGregorianCalendar newDateDeDebut) {
		XMLGregorianCalendar oldDateDeDebut = dateDeDebut;
		dateDeDebut = newDateDeDebut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MANUTENTION_AEFFECTUER__DATE_DE_DEBUT, oldDateDeDebut, dateDeDebut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateDeFin() {
		return dateDeFin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateDeFin(XMLGregorianCalendar newDateDeFin) {
		XMLGregorianCalendar oldDateDeFin = dateDeFin;
		dateDeFin = newDateDeFin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MANUTENTION_AEFFECTUER__DATE_DE_FIN, oldDateDeFin, dateDeFin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMoyens() {
		return moyens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoyens(String newMoyens) {
		String oldMoyens = moyens;
		moyens = newMoyens;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MANUTENTION_AEFFECTUER__MOYENS, oldMoyens, moyens));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MANUTENTION_AEFFECTUER__COMMENTAIRE, oldCommentaire, commentaire));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MANUTENTION_AEFFECTUER__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MANUTENTION_AEFFECTUER__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getEstAffecteeUnite() {
		return estAffecteeUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstAffecteeUnite(TypeAssociationEXT newEstAffecteeUnite, NotificationChain msgs) {
		TypeAssociationEXT oldEstAffecteeUnite = estAffecteeUnite;
		estAffecteeUnite = newEstAffecteeUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MANUTENTION_AEFFECTUER__EST_AFFECTEE_UNITE, oldEstAffecteeUnite, newEstAffecteeUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstAffecteeUnite(TypeAssociationEXT newEstAffecteeUnite) {
		if (newEstAffecteeUnite != estAffecteeUnite) {
			NotificationChain msgs = null;
			if (estAffecteeUnite != null)
				msgs = ((InternalEObject)estAffecteeUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MANUTENTION_AEFFECTUER__EST_AFFECTEE_UNITE, null, msgs);
			if (newEstAffecteeUnite != null)
				msgs = ((InternalEObject)newEstAffecteeUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MANUTENTION_AEFFECTUER__EST_AFFECTEE_UNITE, null, msgs);
			msgs = basicSetEstAffecteeUnite(newEstAffecteeUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MANUTENTION_AEFFECTUER__EST_AFFECTEE_UNITE, newEstAffecteeUnite, newEstAffecteeUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getACommeLieuMissionManutentionAutreElementControle() {
		return aCommeLieuMissionManutentionAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommeLieuMissionManutentionAutreElementControle(TypeAssociation newACommeLieuMissionManutentionAutreElementControle, NotificationChain msgs) {
		TypeAssociation oldACommeLieuMissionManutentionAutreElementControle = aCommeLieuMissionManutentionAutreElementControle;
		aCommeLieuMissionManutentionAutreElementControle = newACommeLieuMissionManutentionAutreElementControle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MANUTENTION_AEFFECTUER__ACOMME_LIEU_MISSION_MANUTENTION_AUTRE_ELEMENT_CONTROLE, oldACommeLieuMissionManutentionAutreElementControle, newACommeLieuMissionManutentionAutreElementControle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommeLieuMissionManutentionAutreElementControle(TypeAssociation newACommeLieuMissionManutentionAutreElementControle) {
		if (newACommeLieuMissionManutentionAutreElementControle != aCommeLieuMissionManutentionAutreElementControle) {
			NotificationChain msgs = null;
			if (aCommeLieuMissionManutentionAutreElementControle != null)
				msgs = ((InternalEObject)aCommeLieuMissionManutentionAutreElementControle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MANUTENTION_AEFFECTUER__ACOMME_LIEU_MISSION_MANUTENTION_AUTRE_ELEMENT_CONTROLE, null, msgs);
			if (newACommeLieuMissionManutentionAutreElementControle != null)
				msgs = ((InternalEObject)newACommeLieuMissionManutentionAutreElementControle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MANUTENTION_AEFFECTUER__ACOMME_LIEU_MISSION_MANUTENTION_AUTRE_ELEMENT_CONTROLE, null, msgs);
			msgs = basicSetACommeLieuMissionManutentionAutreElementControle(newACommeLieuMissionManutentionAutreElementControle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MANUTENTION_AEFFECTUER__ACOMME_LIEU_MISSION_MANUTENTION_AUTRE_ELEMENT_CONTROLE, newACommeLieuMissionManutentionAutreElementControle, newACommeLieuMissionManutentionAutreElementControle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeRessourceElementaire> getACommeRessourceElementaireRessourceElementaire() {
		if (aCommeRessourceElementaireRessourceElementaire == null) {
			aCommeRessourceElementaireRessourceElementaire = new EObjectContainmentEList<TypeRessourceElementaire>(TypeRessourceElementaire.class, this, SchemaPackage.TYPE_MANUTENTION_AEFFECTUER__ACOMME_RESSOURCE_ELEMENTAIRE_RESSOURCE_ELEMENTAIRE);
		}
		return aCommeRessourceElementaireRessourceElementaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MANUTENTION_AEFFECTUER__EST_AFFECTEE_UNITE:
				return basicSetEstAffecteeUnite(null, msgs);
			case SchemaPackage.TYPE_MANUTENTION_AEFFECTUER__ACOMME_LIEU_MISSION_MANUTENTION_AUTRE_ELEMENT_CONTROLE:
				return basicSetACommeLieuMissionManutentionAutreElementControle(null, msgs);
			case SchemaPackage.TYPE_MANUTENTION_AEFFECTUER__ACOMME_RESSOURCE_ELEMENTAIRE_RESSOURCE_ELEMENTAIRE:
				return ((InternalEList<?>)getACommeRessourceElementaireRessourceElementaire()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_MANUTENTION_AEFFECTUER__DESCRIPTION_MISSION:
				return getDescriptionMission();
			case SchemaPackage.TYPE_MANUTENTION_AEFFECTUER__DATE_DE_DEBUT:
				return getDateDeDebut();
			case SchemaPackage.TYPE_MANUTENTION_AEFFECTUER__DATE_DE_FIN:
				return getDateDeFin();
			case SchemaPackage.TYPE_MANUTENTION_AEFFECTUER__MOYENS:
				return getMoyens();
			case SchemaPackage.TYPE_MANUTENTION_AEFFECTUER__COMMENTAIRE:
				return getCommentaire();
			case SchemaPackage.TYPE_MANUTENTION_AEFFECTUER__CTE:
				return getCTE();
			case SchemaPackage.TYPE_MANUTENTION_AEFFECTUER__CE:
				return getCE();
			case SchemaPackage.TYPE_MANUTENTION_AEFFECTUER__EST_AFFECTEE_UNITE:
				return getEstAffecteeUnite();
			case SchemaPackage.TYPE_MANUTENTION_AEFFECTUER__ACOMME_LIEU_MISSION_MANUTENTION_AUTRE_ELEMENT_CONTROLE:
				return getACommeLieuMissionManutentionAutreElementControle();
			case SchemaPackage.TYPE_MANUTENTION_AEFFECTUER__ACOMME_RESSOURCE_ELEMENTAIRE_RESSOURCE_ELEMENTAIRE:
				return getACommeRessourceElementaireRessourceElementaire();
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
			case SchemaPackage.TYPE_MANUTENTION_AEFFECTUER__DESCRIPTION_MISSION:
				setDescriptionMission((String)newValue);
				return;
			case SchemaPackage.TYPE_MANUTENTION_AEFFECTUER__DATE_DE_DEBUT:
				setDateDeDebut((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_MANUTENTION_AEFFECTUER__DATE_DE_FIN:
				setDateDeFin((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_MANUTENTION_AEFFECTUER__MOYENS:
				setMoyens((String)newValue);
				return;
			case SchemaPackage.TYPE_MANUTENTION_AEFFECTUER__COMMENTAIRE:
				setCommentaire((String)newValue);
				return;
			case SchemaPackage.TYPE_MANUTENTION_AEFFECTUER__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_MANUTENTION_AEFFECTUER__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_MANUTENTION_AEFFECTUER__EST_AFFECTEE_UNITE:
				setEstAffecteeUnite((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_MANUTENTION_AEFFECTUER__ACOMME_LIEU_MISSION_MANUTENTION_AUTRE_ELEMENT_CONTROLE:
				setACommeLieuMissionManutentionAutreElementControle((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_MANUTENTION_AEFFECTUER__ACOMME_RESSOURCE_ELEMENTAIRE_RESSOURCE_ELEMENTAIRE:
				getACommeRessourceElementaireRessourceElementaire().clear();
				getACommeRessourceElementaireRessourceElementaire().addAll((Collection<? extends TypeRessourceElementaire>)newValue);
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
			case SchemaPackage.TYPE_MANUTENTION_AEFFECTUER__DESCRIPTION_MISSION:
				setDescriptionMission(DESCRIPTION_MISSION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MANUTENTION_AEFFECTUER__DATE_DE_DEBUT:
				setDateDeDebut(DATE_DE_DEBUT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MANUTENTION_AEFFECTUER__DATE_DE_FIN:
				setDateDeFin(DATE_DE_FIN_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MANUTENTION_AEFFECTUER__MOYENS:
				setMoyens(MOYENS_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MANUTENTION_AEFFECTUER__COMMENTAIRE:
				setCommentaire(COMMENTAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MANUTENTION_AEFFECTUER__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MANUTENTION_AEFFECTUER__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MANUTENTION_AEFFECTUER__EST_AFFECTEE_UNITE:
				setEstAffecteeUnite((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_MANUTENTION_AEFFECTUER__ACOMME_LIEU_MISSION_MANUTENTION_AUTRE_ELEMENT_CONTROLE:
				setACommeLieuMissionManutentionAutreElementControle((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_MANUTENTION_AEFFECTUER__ACOMME_RESSOURCE_ELEMENTAIRE_RESSOURCE_ELEMENTAIRE:
				getACommeRessourceElementaireRessourceElementaire().clear();
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
			case SchemaPackage.TYPE_MANUTENTION_AEFFECTUER__DESCRIPTION_MISSION:
				return DESCRIPTION_MISSION_EDEFAULT == null ? descriptionMission != null : !DESCRIPTION_MISSION_EDEFAULT.equals(descriptionMission);
			case SchemaPackage.TYPE_MANUTENTION_AEFFECTUER__DATE_DE_DEBUT:
				return DATE_DE_DEBUT_EDEFAULT == null ? dateDeDebut != null : !DATE_DE_DEBUT_EDEFAULT.equals(dateDeDebut);
			case SchemaPackage.TYPE_MANUTENTION_AEFFECTUER__DATE_DE_FIN:
				return DATE_DE_FIN_EDEFAULT == null ? dateDeFin != null : !DATE_DE_FIN_EDEFAULT.equals(dateDeFin);
			case SchemaPackage.TYPE_MANUTENTION_AEFFECTUER__MOYENS:
				return MOYENS_EDEFAULT == null ? moyens != null : !MOYENS_EDEFAULT.equals(moyens);
			case SchemaPackage.TYPE_MANUTENTION_AEFFECTUER__COMMENTAIRE:
				return COMMENTAIRE_EDEFAULT == null ? commentaire != null : !COMMENTAIRE_EDEFAULT.equals(commentaire);
			case SchemaPackage.TYPE_MANUTENTION_AEFFECTUER__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_MANUTENTION_AEFFECTUER__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_MANUTENTION_AEFFECTUER__EST_AFFECTEE_UNITE:
				return estAffecteeUnite != null;
			case SchemaPackage.TYPE_MANUTENTION_AEFFECTUER__ACOMME_LIEU_MISSION_MANUTENTION_AUTRE_ELEMENT_CONTROLE:
				return aCommeLieuMissionManutentionAutreElementControle != null;
			case SchemaPackage.TYPE_MANUTENTION_AEFFECTUER__ACOMME_RESSOURCE_ELEMENTAIRE_RESSOURCE_ELEMENTAIRE:
				return aCommeRessourceElementaireRessourceElementaire != null && !aCommeRessourceElementaireRessourceElementaire.isEmpty();
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
		result.append(" (descriptionMission: ");
		result.append(descriptionMission);
		result.append(", dateDeDebut: ");
		result.append(dateDeDebut);
		result.append(", dateDeFin: ");
		result.append(dateDeFin);
		result.append(", moyens: ");
		result.append(moyens);
		result.append(", commentaire: ");
		result.append(commentaire);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeManutentionAEffectuerImpl
