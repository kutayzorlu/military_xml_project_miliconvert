/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationInstanceObjetAdresse;
import mpia.schema.TypeDictionaryDicoAssociationInstanceObjetAdresseCategorie;
import mpia.schema.TypeDictionaryDicoAssociationInstanceObjetAdressePriorite;
import mpia.schema.TypeDictionaryDicoAssociationInstanceObjetAdresseTransmissionEtReception;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Instance Objet Adresse</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationInstanceObjetAdresseImpl#getDesignation <em>Designation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationInstanceObjetAdresseImpl#getPriorite <em>Priorite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationInstanceObjetAdresseImpl#getTransmissionEtReception <em>Transmission Et Reception</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationInstanceObjetAdresseImpl#isAutorisationUtilisation <em>Autorisation Utilisation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationInstanceObjetAdresseImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationInstanceObjetAdresseImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationInstanceObjetAdresseImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationInstanceObjetAdresseImpl#getAssocieCommeObjetAdresse <em>Associe Comme Objet Adresse</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationInstanceObjetAdresseImpl#getAssocieCommeSujetInstanceObjet <em>Associe Comme Sujet Instance Objet</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationInstanceObjetAdresseImpl#getEstRapporteeParRapport <em>Est Rapportee Par Rapport</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationInstanceObjetAdresseImpl extends EObjectImpl implements TypeAssociationInstanceObjetAdresse {
	/**
	 * The default value of the '{@link #getDesignation() <em>Designation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignation()
	 * @generated
	 * @ordered
	 */
	protected static final String DESIGNATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDesignation() <em>Designation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignation()
	 * @generated
	 * @ordered
	 */
	protected String designation = DESIGNATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriorite() <em>Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorite()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAssociationInstanceObjetAdressePriorite PRIORITE_EDEFAULT = TypeDictionaryDicoAssociationInstanceObjetAdressePriorite.PRIME;

	/**
	 * The cached value of the '{@link #getPriorite() <em>Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorite()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssociationInstanceObjetAdressePriorite priorite = PRIORITE_EDEFAULT;

	/**
	 * This is true if the Priorite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean prioriteESet;

	/**
	 * The default value of the '{@link #getTransmissionEtReception() <em>Transmission Et Reception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmissionEtReception()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAssociationInstanceObjetAdresseTransmissionEtReception TRANSMISSION_ET_RECEPTION_EDEFAULT = TypeDictionaryDicoAssociationInstanceObjetAdresseTransmissionEtReception.RECEIV;

	/**
	 * The cached value of the '{@link #getTransmissionEtReception() <em>Transmission Et Reception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmissionEtReception()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssociationInstanceObjetAdresseTransmissionEtReception transmissionEtReception = TRANSMISSION_ET_RECEPTION_EDEFAULT;

	/**
	 * This is true if the Transmission Et Reception attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transmissionEtReceptionESet;

	/**
	 * The default value of the '{@link #isAutorisationUtilisation() <em>Autorisation Utilisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutorisationUtilisation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTORISATION_UTILISATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAutorisationUtilisation() <em>Autorisation Utilisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutorisationUtilisation()
	 * @generated
	 * @ordered
	 */
	protected boolean autorisationUtilisation = AUTORISATION_UTILISATION_EDEFAULT;

	/**
	 * This is true if the Autorisation Utilisation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean autorisationUtilisationESet;

	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAssociationInstanceObjetAdresseCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAssociationInstanceObjetAdresseCategorie.ADR;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssociationInstanceObjetAdresseCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

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
	 * The cached value of the '{@link #getAssocieCommeObjetAdresse() <em>Associe Comme Objet Adresse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeObjetAdresse()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeObjetAdresse;

	/**
	 * The cached value of the '{@link #getAssocieCommeSujetInstanceObjet() <em>Associe Comme Sujet Instance Objet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeSujetInstanceObjet()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeSujetInstanceObjet;

	/**
	 * The cached value of the '{@link #getEstRapporteeParRapport() <em>Est Rapportee Par Rapport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstRapporteeParRapport()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation estRapporteeParRapport;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationInstanceObjetAdresseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationInstanceObjetAdresse();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesignation(String newDesignation) {
		String oldDesignation = designation;
		designation = newDesignation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__DESIGNATION, oldDesignation, designation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAssociationInstanceObjetAdressePriorite getPriorite() {
		return priorite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriorite(TypeDictionaryDicoAssociationInstanceObjetAdressePriorite newPriorite) {
		TypeDictionaryDicoAssociationInstanceObjetAdressePriorite oldPriorite = priorite;
		priorite = newPriorite == null ? PRIORITE_EDEFAULT : newPriorite;
		boolean oldPrioriteESet = prioriteESet;
		prioriteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__PRIORITE, oldPriorite, priorite, !oldPrioriteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPriorite() {
		TypeDictionaryDicoAssociationInstanceObjetAdressePriorite oldPriorite = priorite;
		boolean oldPrioriteESet = prioriteESet;
		priorite = PRIORITE_EDEFAULT;
		prioriteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__PRIORITE, oldPriorite, PRIORITE_EDEFAULT, oldPrioriteESet));
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
	public TypeDictionaryDicoAssociationInstanceObjetAdresseTransmissionEtReception getTransmissionEtReception() {
		return transmissionEtReception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransmissionEtReception(TypeDictionaryDicoAssociationInstanceObjetAdresseTransmissionEtReception newTransmissionEtReception) {
		TypeDictionaryDicoAssociationInstanceObjetAdresseTransmissionEtReception oldTransmissionEtReception = transmissionEtReception;
		transmissionEtReception = newTransmissionEtReception == null ? TRANSMISSION_ET_RECEPTION_EDEFAULT : newTransmissionEtReception;
		boolean oldTransmissionEtReceptionESet = transmissionEtReceptionESet;
		transmissionEtReceptionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__TRANSMISSION_ET_RECEPTION, oldTransmissionEtReception, transmissionEtReception, !oldTransmissionEtReceptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransmissionEtReception() {
		TypeDictionaryDicoAssociationInstanceObjetAdresseTransmissionEtReception oldTransmissionEtReception = transmissionEtReception;
		boolean oldTransmissionEtReceptionESet = transmissionEtReceptionESet;
		transmissionEtReception = TRANSMISSION_ET_RECEPTION_EDEFAULT;
		transmissionEtReceptionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__TRANSMISSION_ET_RECEPTION, oldTransmissionEtReception, TRANSMISSION_ET_RECEPTION_EDEFAULT, oldTransmissionEtReceptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransmissionEtReception() {
		return transmissionEtReceptionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAutorisationUtilisation() {
		return autorisationUtilisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutorisationUtilisation(boolean newAutorisationUtilisation) {
		boolean oldAutorisationUtilisation = autorisationUtilisation;
		autorisationUtilisation = newAutorisationUtilisation;
		boolean oldAutorisationUtilisationESet = autorisationUtilisationESet;
		autorisationUtilisationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__AUTORISATION_UTILISATION, oldAutorisationUtilisation, autorisationUtilisation, !oldAutorisationUtilisationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAutorisationUtilisation() {
		boolean oldAutorisationUtilisation = autorisationUtilisation;
		boolean oldAutorisationUtilisationESet = autorisationUtilisationESet;
		autorisationUtilisation = AUTORISATION_UTILISATION_EDEFAULT;
		autorisationUtilisationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__AUTORISATION_UTILISATION, oldAutorisationUtilisation, AUTORISATION_UTILISATION_EDEFAULT, oldAutorisationUtilisationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAutorisationUtilisation() {
		return autorisationUtilisationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAssociationInstanceObjetAdresseCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAssociationInstanceObjetAdresseCategorie newCategorie) {
		TypeDictionaryDicoAssociationInstanceObjetAdresseCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAssociationInstanceObjetAdresseCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCategorie() {
		return categorieESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAssocieCommeObjetAdresse() {
		return associeCommeObjetAdresse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeObjetAdresse(TypeAssociation newAssocieCommeObjetAdresse, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeObjetAdresse = associeCommeObjetAdresse;
		associeCommeObjetAdresse = newAssocieCommeObjetAdresse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__ASSOCIE_COMME_OBJET_ADRESSE, oldAssocieCommeObjetAdresse, newAssocieCommeObjetAdresse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeObjetAdresse(TypeAssociation newAssocieCommeObjetAdresse) {
		if (newAssocieCommeObjetAdresse != associeCommeObjetAdresse) {
			NotificationChain msgs = null;
			if (associeCommeObjetAdresse != null)
				msgs = ((InternalEObject)associeCommeObjetAdresse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__ASSOCIE_COMME_OBJET_ADRESSE, null, msgs);
			if (newAssocieCommeObjetAdresse != null)
				msgs = ((InternalEObject)newAssocieCommeObjetAdresse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__ASSOCIE_COMME_OBJET_ADRESSE, null, msgs);
			msgs = basicSetAssocieCommeObjetAdresse(newAssocieCommeObjetAdresse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__ASSOCIE_COMME_OBJET_ADRESSE, newAssocieCommeObjetAdresse, newAssocieCommeObjetAdresse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAssocieCommeSujetInstanceObjet() {
		return associeCommeSujetInstanceObjet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeSujetInstanceObjet(TypeAssociation newAssocieCommeSujetInstanceObjet, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeSujetInstanceObjet = associeCommeSujetInstanceObjet;
		associeCommeSujetInstanceObjet = newAssocieCommeSujetInstanceObjet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__ASSOCIE_COMME_SUJET_INSTANCE_OBJET, oldAssocieCommeSujetInstanceObjet, newAssocieCommeSujetInstanceObjet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeSujetInstanceObjet(TypeAssociation newAssocieCommeSujetInstanceObjet) {
		if (newAssocieCommeSujetInstanceObjet != associeCommeSujetInstanceObjet) {
			NotificationChain msgs = null;
			if (associeCommeSujetInstanceObjet != null)
				msgs = ((InternalEObject)associeCommeSujetInstanceObjet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__ASSOCIE_COMME_SUJET_INSTANCE_OBJET, null, msgs);
			if (newAssocieCommeSujetInstanceObjet != null)
				msgs = ((InternalEObject)newAssocieCommeSujetInstanceObjet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__ASSOCIE_COMME_SUJET_INSTANCE_OBJET, null, msgs);
			msgs = basicSetAssocieCommeSujetInstanceObjet(newAssocieCommeSujetInstanceObjet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__ASSOCIE_COMME_SUJET_INSTANCE_OBJET, newAssocieCommeSujetInstanceObjet, newAssocieCommeSujetInstanceObjet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getEstRapporteeParRapport() {
		return estRapporteeParRapport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstRapporteeParRapport(TypeAssociation newEstRapporteeParRapport, NotificationChain msgs) {
		TypeAssociation oldEstRapporteeParRapport = estRapporteeParRapport;
		estRapporteeParRapport = newEstRapporteeParRapport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__EST_RAPPORTEE_PAR_RAPPORT, oldEstRapporteeParRapport, newEstRapporteeParRapport);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstRapporteeParRapport(TypeAssociation newEstRapporteeParRapport) {
		if (newEstRapporteeParRapport != estRapporteeParRapport) {
			NotificationChain msgs = null;
			if (estRapporteeParRapport != null)
				msgs = ((InternalEObject)estRapporteeParRapport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__EST_RAPPORTEE_PAR_RAPPORT, null, msgs);
			if (newEstRapporteeParRapport != null)
				msgs = ((InternalEObject)newEstRapporteeParRapport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__EST_RAPPORTEE_PAR_RAPPORT, null, msgs);
			msgs = basicSetEstRapporteeParRapport(newEstRapporteeParRapport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__EST_RAPPORTEE_PAR_RAPPORT, newEstRapporteeParRapport, newEstRapporteeParRapport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__ASSOCIE_COMME_OBJET_ADRESSE:
				return basicSetAssocieCommeObjetAdresse(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__ASSOCIE_COMME_SUJET_INSTANCE_OBJET:
				return basicSetAssocieCommeSujetInstanceObjet(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__EST_RAPPORTEE_PAR_RAPPORT:
				return basicSetEstRapporteeParRapport(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__DESIGNATION:
				return getDesignation();
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__PRIORITE:
				return getPriorite();
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__TRANSMISSION_ET_RECEPTION:
				return getTransmissionEtReception();
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__AUTORISATION_UTILISATION:
				return isAutorisationUtilisation() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__CE:
				return getCE();
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__ASSOCIE_COMME_OBJET_ADRESSE:
				return getAssocieCommeObjetAdresse();
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__ASSOCIE_COMME_SUJET_INSTANCE_OBJET:
				return getAssocieCommeSujetInstanceObjet();
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__EST_RAPPORTEE_PAR_RAPPORT:
				return getEstRapporteeParRapport();
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
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__DESIGNATION:
				setDesignation((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__PRIORITE:
				setPriorite((TypeDictionaryDicoAssociationInstanceObjetAdressePriorite)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__TRANSMISSION_ET_RECEPTION:
				setTransmissionEtReception((TypeDictionaryDicoAssociationInstanceObjetAdresseTransmissionEtReception)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__AUTORISATION_UTILISATION:
				setAutorisationUtilisation(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationInstanceObjetAdresseCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__ASSOCIE_COMME_OBJET_ADRESSE:
				setAssocieCommeObjetAdresse((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__ASSOCIE_COMME_SUJET_INSTANCE_OBJET:
				setAssocieCommeSujetInstanceObjet((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__EST_RAPPORTEE_PAR_RAPPORT:
				setEstRapporteeParRapport((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__DESIGNATION:
				setDesignation(DESIGNATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__PRIORITE:
				unsetPriorite();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__TRANSMISSION_ET_RECEPTION:
				unsetTransmissionEtReception();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__AUTORISATION_UTILISATION:
				unsetAutorisationUtilisation();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__ASSOCIE_COMME_OBJET_ADRESSE:
				setAssocieCommeObjetAdresse((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__ASSOCIE_COMME_SUJET_INSTANCE_OBJET:
				setAssocieCommeSujetInstanceObjet((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__EST_RAPPORTEE_PAR_RAPPORT:
				setEstRapporteeParRapport((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__DESIGNATION:
				return DESIGNATION_EDEFAULT == null ? designation != null : !DESIGNATION_EDEFAULT.equals(designation);
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__PRIORITE:
				return isSetPriorite();
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__TRANSMISSION_ET_RECEPTION:
				return isSetTransmissionEtReception();
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__AUTORISATION_UTILISATION:
				return isSetAutorisationUtilisation();
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__ASSOCIE_COMME_OBJET_ADRESSE:
				return associeCommeObjetAdresse != null;
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__ASSOCIE_COMME_SUJET_INSTANCE_OBJET:
				return associeCommeSujetInstanceObjet != null;
			case SchemaPackage.TYPE_ASSOCIATION_INSTANCE_OBJET_ADRESSE__EST_RAPPORTEE_PAR_RAPPORT:
				return estRapporteeParRapport != null;
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
		result.append(" (designation: ");
		result.append(designation);
		result.append(", priorite: ");
		if (prioriteESet) result.append(priorite); else result.append("<unset>");
		result.append(", transmissionEtReception: ");
		if (transmissionEtReceptionESet) result.append(transmissionEtReception); else result.append("<unset>");
		result.append(", autorisationUtilisation: ");
		if (autorisationUtilisationESet) result.append(autorisationUtilisation); else result.append("<unset>");
		result.append(", categorie: ");
		if (categorieESet) result.append(categorie); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeAssociationInstanceObjetAdresseImpl
