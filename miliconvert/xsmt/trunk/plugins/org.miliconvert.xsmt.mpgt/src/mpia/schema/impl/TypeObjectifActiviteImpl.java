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
import mpia.schema.TypeAssociationObjectifActiviteLocalisation;
import mpia.schema.TypeDictionaryDicoObjectifActiviteQualification;
import mpia.schema.TypeDictionaryDicoPriorite;
import mpia.schema.TypeObjectif3D;
import mpia.schema.TypeObjectifActivite;
import mpia.schema.TypeObjectifActiviteType;

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
 * An implementation of the model object '<em><b>Type Objectif Activite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeObjectifActiviteImpl#getQualification <em>Qualification</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifActiviteImpl#getPriorite <em>Priorite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifActiviteImpl#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifActiviteImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifActiviteImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifActiviteImpl#getEstObjectifPourActivite <em>Est Objectif Pour Activite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifActiviteImpl#getEstLocaliseParAssociationObjectifActiviteLocalisation <em>Est Localise Par Association Objectif Activite Localisation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifActiviteImpl#getAPourCaracteristiquesObjectif3DObjectif3D <em>APour Caracteristiques Objectif3 DObjectif3 D</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifActiviteImpl#getAssocieCommeInstanceObjetInstanceObjet <em>Associe Comme Instance Objet Instance Objet</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifActiviteImpl#getACommeObjectifCiblageObjectifCiblage <em>AComme Objectif Ciblage Objectif Ciblage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifActiviteImpl#getEstAutoriseParEntiteOrganisationnelle <em>Est Autorise Par Entite Organisationnelle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifActiviteImpl#getEstTypeObjectifActiviteType <em>Est Type Objectif Activite Type</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifActiviteImpl#getEstUneActionAction <em>Est Une Action Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeObjectifActiviteImpl extends EObjectImpl implements TypeObjectifActivite {
	/**
	 * The default value of the '{@link #getQualification() <em>Qualification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualification()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoObjectifActiviteQualification QUALIFICATION_EDEFAULT = TypeDictionaryDicoObjectifActiviteQualification.AUTH;

	/**
	 * The cached value of the '{@link #getQualification() <em>Qualification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualification()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoObjectifActiviteQualification qualification = QUALIFICATION_EDEFAULT;

	/**
	 * This is true if the Qualification attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean qualificationESet;

	/**
	 * The default value of the '{@link #getPriorite() <em>Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorite()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPriorite PRIORITE_EDEFAULT = TypeDictionaryDicoPriorite._1;

	/**
	 * The cached value of the '{@link #getPriorite() <em>Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorite()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPriorite priorite = PRIORITE_EDEFAULT;

	/**
	 * This is true if the Priorite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean prioriteESet;

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
	 * The cached value of the '{@link #getEstObjectifPourActivite() <em>Est Objectif Pour Activite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjectifPourActivite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation estObjectifPourActivite;

	/**
	 * The cached value of the '{@link #getEstLocaliseParAssociationObjectifActiviteLocalisation() <em>Est Localise Par Association Objectif Activite Localisation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstLocaliseParAssociationObjectifActiviteLocalisation()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociationObjectifActiviteLocalisation> estLocaliseParAssociationObjectifActiviteLocalisation;

	/**
	 * The cached value of the '{@link #getAPourCaracteristiquesObjectif3DObjectif3D() <em>APour Caracteristiques Objectif3 DObjectif3 D</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourCaracteristiquesObjectif3DObjectif3D()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeObjectif3D> aPourCaracteristiquesObjectif3DObjectif3D;

	/**
	 * The cached value of the '{@link #getAssocieCommeInstanceObjetInstanceObjet() <em>Associe Comme Instance Objet Instance Objet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeInstanceObjetInstanceObjet()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeInstanceObjetInstanceObjet;

	/**
	 * The cached value of the '{@link #getACommeObjectifCiblageObjectifCiblage() <em>AComme Objectif Ciblage Objectif Ciblage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeObjectifCiblageObjectifCiblage()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aCommeObjectifCiblageObjectifCiblage;

	/**
	 * The cached value of the '{@link #getEstAutoriseParEntiteOrganisationnelle() <em>Est Autorise Par Entite Organisationnelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstAutoriseParEntiteOrganisationnelle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT estAutoriseParEntiteOrganisationnelle;

	/**
	 * The cached value of the '{@link #getEstTypeObjectifActiviteType() <em>Est Type Objectif Activite Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstTypeObjectifActiviteType()
	 * @generated
	 * @ordered
	 */
	protected TypeObjectifActiviteType estTypeObjectifActiviteType;

	/**
	 * The cached value of the '{@link #getEstUneActionAction() <em>Est Une Action Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstUneActionAction()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation estUneActionAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeObjectifActiviteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeObjectifActivite();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoObjectifActiviteQualification getQualification() {
		return qualification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualification(TypeDictionaryDicoObjectifActiviteQualification newQualification) {
		TypeDictionaryDicoObjectifActiviteQualification oldQualification = qualification;
		qualification = newQualification == null ? QUALIFICATION_EDEFAULT : newQualification;
		boolean oldQualificationESet = qualificationESet;
		qualificationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_ACTIVITE__QUALIFICATION, oldQualification, qualification, !oldQualificationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQualification() {
		TypeDictionaryDicoObjectifActiviteQualification oldQualification = qualification;
		boolean oldQualificationESet = qualificationESet;
		qualification = QUALIFICATION_EDEFAULT;
		qualificationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_OBJECTIF_ACTIVITE__QUALIFICATION, oldQualification, QUALIFICATION_EDEFAULT, oldQualificationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQualification() {
		return qualificationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoPriorite getPriorite() {
		return priorite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriorite(TypeDictionaryDicoPriorite newPriorite) {
		TypeDictionaryDicoPriorite oldPriorite = priorite;
		priorite = newPriorite == null ? PRIORITE_EDEFAULT : newPriorite;
		boolean oldPrioriteESet = prioriteESet;
		prioriteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_ACTIVITE__PRIORITE, oldPriorite, priorite, !oldPrioriteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPriorite() {
		TypeDictionaryDicoPriorite oldPriorite = priorite;
		boolean oldPrioriteESet = prioriteESet;
		priorite = PRIORITE_EDEFAULT;
		prioriteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_OBJECTIF_ACTIVITE__PRIORITE, oldPriorite, PRIORITE_EDEFAULT, oldPrioriteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPriorite() {
		return prioriteESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_ACTIVITE__COMMENTAIRE, oldCommentaire, commentaire));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_ACTIVITE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_ACTIVITE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getEstObjectifPourActivite() {
		return estObjectifPourActivite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstObjectifPourActivite(TypeAssociation newEstObjectifPourActivite, NotificationChain msgs) {
		TypeAssociation oldEstObjectifPourActivite = estObjectifPourActivite;
		estObjectifPourActivite = newEstObjectifPourActivite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_ACTIVITE__EST_OBJECTIF_POUR_ACTIVITE, oldEstObjectifPourActivite, newEstObjectifPourActivite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstObjectifPourActivite(TypeAssociation newEstObjectifPourActivite) {
		if (newEstObjectifPourActivite != estObjectifPourActivite) {
			NotificationChain msgs = null;
			if (estObjectifPourActivite != null)
				msgs = ((InternalEObject)estObjectifPourActivite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBJECTIF_ACTIVITE__EST_OBJECTIF_POUR_ACTIVITE, null, msgs);
			if (newEstObjectifPourActivite != null)
				msgs = ((InternalEObject)newEstObjectifPourActivite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBJECTIF_ACTIVITE__EST_OBJECTIF_POUR_ACTIVITE, null, msgs);
			msgs = basicSetEstObjectifPourActivite(newEstObjectifPourActivite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_ACTIVITE__EST_OBJECTIF_POUR_ACTIVITE, newEstObjectifPourActivite, newEstObjectifPourActivite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationObjectifActiviteLocalisation> getEstLocaliseParAssociationObjectifActiviteLocalisation() {
		if (estLocaliseParAssociationObjectifActiviteLocalisation == null) {
			estLocaliseParAssociationObjectifActiviteLocalisation = new EObjectContainmentEList<TypeAssociationObjectifActiviteLocalisation>(TypeAssociationObjectifActiviteLocalisation.class, this, SchemaPackage.TYPE_OBJECTIF_ACTIVITE__EST_LOCALISE_PAR_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION);
		}
		return estLocaliseParAssociationObjectifActiviteLocalisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeObjectif3D> getAPourCaracteristiquesObjectif3DObjectif3D() {
		if (aPourCaracteristiquesObjectif3DObjectif3D == null) {
			aPourCaracteristiquesObjectif3DObjectif3D = new EObjectContainmentEList<TypeObjectif3D>(TypeObjectif3D.class, this, SchemaPackage.TYPE_OBJECTIF_ACTIVITE__APOUR_CARACTERISTIQUES_OBJECTIF3_DOBJECTIF3_D);
		}
		return aPourCaracteristiquesObjectif3DObjectif3D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAssocieCommeInstanceObjetInstanceObjet() {
		return associeCommeInstanceObjetInstanceObjet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeInstanceObjetInstanceObjet(TypeAssociation newAssocieCommeInstanceObjetInstanceObjet, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeInstanceObjetInstanceObjet = associeCommeInstanceObjetInstanceObjet;
		associeCommeInstanceObjetInstanceObjet = newAssocieCommeInstanceObjetInstanceObjet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_ACTIVITE__ASSOCIE_COMME_INSTANCE_OBJET_INSTANCE_OBJET, oldAssocieCommeInstanceObjetInstanceObjet, newAssocieCommeInstanceObjetInstanceObjet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeInstanceObjetInstanceObjet(TypeAssociation newAssocieCommeInstanceObjetInstanceObjet) {
		if (newAssocieCommeInstanceObjetInstanceObjet != associeCommeInstanceObjetInstanceObjet) {
			NotificationChain msgs = null;
			if (associeCommeInstanceObjetInstanceObjet != null)
				msgs = ((InternalEObject)associeCommeInstanceObjetInstanceObjet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBJECTIF_ACTIVITE__ASSOCIE_COMME_INSTANCE_OBJET_INSTANCE_OBJET, null, msgs);
			if (newAssocieCommeInstanceObjetInstanceObjet != null)
				msgs = ((InternalEObject)newAssocieCommeInstanceObjetInstanceObjet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBJECTIF_ACTIVITE__ASSOCIE_COMME_INSTANCE_OBJET_INSTANCE_OBJET, null, msgs);
			msgs = basicSetAssocieCommeInstanceObjetInstanceObjet(newAssocieCommeInstanceObjetInstanceObjet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_ACTIVITE__ASSOCIE_COMME_INSTANCE_OBJET_INSTANCE_OBJET, newAssocieCommeInstanceObjetInstanceObjet, newAssocieCommeInstanceObjetInstanceObjet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getACommeObjectifCiblageObjectifCiblage() {
		return aCommeObjectifCiblageObjectifCiblage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommeObjectifCiblageObjectifCiblage(TypeAssociation newACommeObjectifCiblageObjectifCiblage, NotificationChain msgs) {
		TypeAssociation oldACommeObjectifCiblageObjectifCiblage = aCommeObjectifCiblageObjectifCiblage;
		aCommeObjectifCiblageObjectifCiblage = newACommeObjectifCiblageObjectifCiblage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_ACTIVITE__ACOMME_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE, oldACommeObjectifCiblageObjectifCiblage, newACommeObjectifCiblageObjectifCiblage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommeObjectifCiblageObjectifCiblage(TypeAssociation newACommeObjectifCiblageObjectifCiblage) {
		if (newACommeObjectifCiblageObjectifCiblage != aCommeObjectifCiblageObjectifCiblage) {
			NotificationChain msgs = null;
			if (aCommeObjectifCiblageObjectifCiblage != null)
				msgs = ((InternalEObject)aCommeObjectifCiblageObjectifCiblage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBJECTIF_ACTIVITE__ACOMME_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE, null, msgs);
			if (newACommeObjectifCiblageObjectifCiblage != null)
				msgs = ((InternalEObject)newACommeObjectifCiblageObjectifCiblage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBJECTIF_ACTIVITE__ACOMME_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE, null, msgs);
			msgs = basicSetACommeObjectifCiblageObjectifCiblage(newACommeObjectifCiblageObjectifCiblage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_ACTIVITE__ACOMME_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE, newACommeObjectifCiblageObjectifCiblage, newACommeObjectifCiblageObjectifCiblage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getEstAutoriseParEntiteOrganisationnelle() {
		return estAutoriseParEntiteOrganisationnelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstAutoriseParEntiteOrganisationnelle(TypeAssociationEXT newEstAutoriseParEntiteOrganisationnelle, NotificationChain msgs) {
		TypeAssociationEXT oldEstAutoriseParEntiteOrganisationnelle = estAutoriseParEntiteOrganisationnelle;
		estAutoriseParEntiteOrganisationnelle = newEstAutoriseParEntiteOrganisationnelle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_ACTIVITE__EST_AUTORISE_PAR_ENTITE_ORGANISATIONNELLE, oldEstAutoriseParEntiteOrganisationnelle, newEstAutoriseParEntiteOrganisationnelle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstAutoriseParEntiteOrganisationnelle(TypeAssociationEXT newEstAutoriseParEntiteOrganisationnelle) {
		if (newEstAutoriseParEntiteOrganisationnelle != estAutoriseParEntiteOrganisationnelle) {
			NotificationChain msgs = null;
			if (estAutoriseParEntiteOrganisationnelle != null)
				msgs = ((InternalEObject)estAutoriseParEntiteOrganisationnelle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBJECTIF_ACTIVITE__EST_AUTORISE_PAR_ENTITE_ORGANISATIONNELLE, null, msgs);
			if (newEstAutoriseParEntiteOrganisationnelle != null)
				msgs = ((InternalEObject)newEstAutoriseParEntiteOrganisationnelle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBJECTIF_ACTIVITE__EST_AUTORISE_PAR_ENTITE_ORGANISATIONNELLE, null, msgs);
			msgs = basicSetEstAutoriseParEntiteOrganisationnelle(newEstAutoriseParEntiteOrganisationnelle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_ACTIVITE__EST_AUTORISE_PAR_ENTITE_ORGANISATIONNELLE, newEstAutoriseParEntiteOrganisationnelle, newEstAutoriseParEntiteOrganisationnelle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeObjectifActiviteType getEstTypeObjectifActiviteType() {
		return estTypeObjectifActiviteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstTypeObjectifActiviteType(TypeObjectifActiviteType newEstTypeObjectifActiviteType, NotificationChain msgs) {
		TypeObjectifActiviteType oldEstTypeObjectifActiviteType = estTypeObjectifActiviteType;
		estTypeObjectifActiviteType = newEstTypeObjectifActiviteType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_ACTIVITE__EST_TYPE_OBJECTIF_ACTIVITE_TYPE, oldEstTypeObjectifActiviteType, newEstTypeObjectifActiviteType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstTypeObjectifActiviteType(TypeObjectifActiviteType newEstTypeObjectifActiviteType) {
		if (newEstTypeObjectifActiviteType != estTypeObjectifActiviteType) {
			NotificationChain msgs = null;
			if (estTypeObjectifActiviteType != null)
				msgs = ((InternalEObject)estTypeObjectifActiviteType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBJECTIF_ACTIVITE__EST_TYPE_OBJECTIF_ACTIVITE_TYPE, null, msgs);
			if (newEstTypeObjectifActiviteType != null)
				msgs = ((InternalEObject)newEstTypeObjectifActiviteType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBJECTIF_ACTIVITE__EST_TYPE_OBJECTIF_ACTIVITE_TYPE, null, msgs);
			msgs = basicSetEstTypeObjectifActiviteType(newEstTypeObjectifActiviteType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_ACTIVITE__EST_TYPE_OBJECTIF_ACTIVITE_TYPE, newEstTypeObjectifActiviteType, newEstTypeObjectifActiviteType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getEstUneActionAction() {
		return estUneActionAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstUneActionAction(TypeAssociation newEstUneActionAction, NotificationChain msgs) {
		TypeAssociation oldEstUneActionAction = estUneActionAction;
		estUneActionAction = newEstUneActionAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_ACTIVITE__EST_UNE_ACTION_ACTION, oldEstUneActionAction, newEstUneActionAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstUneActionAction(TypeAssociation newEstUneActionAction) {
		if (newEstUneActionAction != estUneActionAction) {
			NotificationChain msgs = null;
			if (estUneActionAction != null)
				msgs = ((InternalEObject)estUneActionAction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBJECTIF_ACTIVITE__EST_UNE_ACTION_ACTION, null, msgs);
			if (newEstUneActionAction != null)
				msgs = ((InternalEObject)newEstUneActionAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBJECTIF_ACTIVITE__EST_UNE_ACTION_ACTION, null, msgs);
			msgs = basicSetEstUneActionAction(newEstUneActionAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_ACTIVITE__EST_UNE_ACTION_ACTION, newEstUneActionAction, newEstUneActionAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE__EST_OBJECTIF_POUR_ACTIVITE:
				return basicSetEstObjectifPourActivite(null, msgs);
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE__EST_LOCALISE_PAR_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION:
				return ((InternalEList<?>)getEstLocaliseParAssociationObjectifActiviteLocalisation()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE__APOUR_CARACTERISTIQUES_OBJECTIF3_DOBJECTIF3_D:
				return ((InternalEList<?>)getAPourCaracteristiquesObjectif3DObjectif3D()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE__ASSOCIE_COMME_INSTANCE_OBJET_INSTANCE_OBJET:
				return basicSetAssocieCommeInstanceObjetInstanceObjet(null, msgs);
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE__ACOMME_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE:
				return basicSetACommeObjectifCiblageObjectifCiblage(null, msgs);
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE__EST_AUTORISE_PAR_ENTITE_ORGANISATIONNELLE:
				return basicSetEstAutoriseParEntiteOrganisationnelle(null, msgs);
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE__EST_TYPE_OBJECTIF_ACTIVITE_TYPE:
				return basicSetEstTypeObjectifActiviteType(null, msgs);
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE__EST_UNE_ACTION_ACTION:
				return basicSetEstUneActionAction(null, msgs);
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
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE__QUALIFICATION:
				return getQualification();
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE__PRIORITE:
				return getPriorite();
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE__COMMENTAIRE:
				return getCommentaire();
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE__CE:
				return getCE();
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE__EST_OBJECTIF_POUR_ACTIVITE:
				return getEstObjectifPourActivite();
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE__EST_LOCALISE_PAR_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION:
				return getEstLocaliseParAssociationObjectifActiviteLocalisation();
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE__APOUR_CARACTERISTIQUES_OBJECTIF3_DOBJECTIF3_D:
				return getAPourCaracteristiquesObjectif3DObjectif3D();
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE__ASSOCIE_COMME_INSTANCE_OBJET_INSTANCE_OBJET:
				return getAssocieCommeInstanceObjetInstanceObjet();
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE__ACOMME_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE:
				return getACommeObjectifCiblageObjectifCiblage();
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE__EST_AUTORISE_PAR_ENTITE_ORGANISATIONNELLE:
				return getEstAutoriseParEntiteOrganisationnelle();
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE__EST_TYPE_OBJECTIF_ACTIVITE_TYPE:
				return getEstTypeObjectifActiviteType();
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE__EST_UNE_ACTION_ACTION:
				return getEstUneActionAction();
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
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE__QUALIFICATION:
				setQualification((TypeDictionaryDicoObjectifActiviteQualification)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE__PRIORITE:
				setPriorite((TypeDictionaryDicoPriorite)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE__COMMENTAIRE:
				setCommentaire((String)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE__EST_OBJECTIF_POUR_ACTIVITE:
				setEstObjectifPourActivite((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE__EST_LOCALISE_PAR_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION:
				getEstLocaliseParAssociationObjectifActiviteLocalisation().clear();
				getEstLocaliseParAssociationObjectifActiviteLocalisation().addAll((Collection<? extends TypeAssociationObjectifActiviteLocalisation>)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE__APOUR_CARACTERISTIQUES_OBJECTIF3_DOBJECTIF3_D:
				getAPourCaracteristiquesObjectif3DObjectif3D().clear();
				getAPourCaracteristiquesObjectif3DObjectif3D().addAll((Collection<? extends TypeObjectif3D>)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE__ASSOCIE_COMME_INSTANCE_OBJET_INSTANCE_OBJET:
				setAssocieCommeInstanceObjetInstanceObjet((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE__ACOMME_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE:
				setACommeObjectifCiblageObjectifCiblage((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE__EST_AUTORISE_PAR_ENTITE_ORGANISATIONNELLE:
				setEstAutoriseParEntiteOrganisationnelle((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE__EST_TYPE_OBJECTIF_ACTIVITE_TYPE:
				setEstTypeObjectifActiviteType((TypeObjectifActiviteType)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE__EST_UNE_ACTION_ACTION:
				setEstUneActionAction((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE__QUALIFICATION:
				unsetQualification();
				return;
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE__PRIORITE:
				unsetPriorite();
				return;
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE__COMMENTAIRE:
				setCommentaire(COMMENTAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE__EST_OBJECTIF_POUR_ACTIVITE:
				setEstObjectifPourActivite((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE__EST_LOCALISE_PAR_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION:
				getEstLocaliseParAssociationObjectifActiviteLocalisation().clear();
				return;
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE__APOUR_CARACTERISTIQUES_OBJECTIF3_DOBJECTIF3_D:
				getAPourCaracteristiquesObjectif3DObjectif3D().clear();
				return;
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE__ASSOCIE_COMME_INSTANCE_OBJET_INSTANCE_OBJET:
				setAssocieCommeInstanceObjetInstanceObjet((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE__ACOMME_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE:
				setACommeObjectifCiblageObjectifCiblage((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE__EST_AUTORISE_PAR_ENTITE_ORGANISATIONNELLE:
				setEstAutoriseParEntiteOrganisationnelle((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE__EST_TYPE_OBJECTIF_ACTIVITE_TYPE:
				setEstTypeObjectifActiviteType((TypeObjectifActiviteType)null);
				return;
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE__EST_UNE_ACTION_ACTION:
				setEstUneActionAction((TypeAssociation)null);
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
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE__QUALIFICATION:
				return isSetQualification();
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE__PRIORITE:
				return isSetPriorite();
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE__COMMENTAIRE:
				return COMMENTAIRE_EDEFAULT == null ? commentaire != null : !COMMENTAIRE_EDEFAULT.equals(commentaire);
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE__EST_OBJECTIF_POUR_ACTIVITE:
				return estObjectifPourActivite != null;
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE__EST_LOCALISE_PAR_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION:
				return estLocaliseParAssociationObjectifActiviteLocalisation != null && !estLocaliseParAssociationObjectifActiviteLocalisation.isEmpty();
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE__APOUR_CARACTERISTIQUES_OBJECTIF3_DOBJECTIF3_D:
				return aPourCaracteristiquesObjectif3DObjectif3D != null && !aPourCaracteristiquesObjectif3DObjectif3D.isEmpty();
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE__ASSOCIE_COMME_INSTANCE_OBJET_INSTANCE_OBJET:
				return associeCommeInstanceObjetInstanceObjet != null;
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE__ACOMME_OBJECTIF_CIBLAGE_OBJECTIF_CIBLAGE:
				return aCommeObjectifCiblageObjectifCiblage != null;
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE__EST_AUTORISE_PAR_ENTITE_ORGANISATIONNELLE:
				return estAutoriseParEntiteOrganisationnelle != null;
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE__EST_TYPE_OBJECTIF_ACTIVITE_TYPE:
				return estTypeObjectifActiviteType != null;
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE__EST_UNE_ACTION_ACTION:
				return estUneActionAction != null;
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
		result.append(" (qualification: ");
		if (qualificationESet) result.append(qualification); else result.append("<unset>");
		result.append(", priorite: ");
		if (prioriteESet) result.append(priorite); else result.append("<unset>");
		result.append(", commentaire: ");
		result.append(commentaire);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeObjectifActiviteImpl
