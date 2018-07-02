/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeDataTypeDuree;
import mpia.meta.TypeDataTypeVitesseLineaire;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAxe;
import mpia.schema.TypeDictionaryDicoItineraireCouleur;
import mpia.schema.TypeDictionaryDicoItinerairePraticabilite;
import mpia.schema.TypeDictionaryDicoMobilite;
import mpia.schema.TypeDictionaryDicoMoyenTransport;
import mpia.schema.TypeDictionaryDicoSensTrafic;
import mpia.schema.TypeItineraire;
import mpia.schema.TypePointParticulierItineraire;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Itineraire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeItineraireImpl#getClasseMilitaire <em>Classe Militaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeItineraireImpl#getPraticabilite <em>Praticabilite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeItineraireImpl#getMoyenTransport <em>Moyen Transport</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeItineraireImpl#getMobilite <em>Mobilite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeItineraireImpl#getCouleur <em>Couleur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeItineraireImpl#getSensTrafic <em>Sens Trafic</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeItineraireImpl#getVitesse <em>Vitesse</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeItineraireImpl#getDuree <em>Duree</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeItineraireImpl#getComplementCaracteristique <em>Complement Caracteristique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeItineraireImpl#getAPourCaracteristiqueAxeAxe <em>APour Caracteristique Axe Axe</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeItineraireImpl#getAPourPointParticulierPointParticulierItineraire <em>APour Point Particulier Point Particulier Itineraire</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeItineraireImpl extends TypeElementControleImpl implements TypeItineraire {
	/**
	 * The default value of the '{@link #getClasseMilitaire() <em>Classe Militaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasseMilitaire()
	 * @generated
	 * @ordered
	 */
	protected static final long CLASSE_MILITAIRE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getClasseMilitaire() <em>Classe Militaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasseMilitaire()
	 * @generated
	 * @ordered
	 */
	protected long classeMilitaire = CLASSE_MILITAIRE_EDEFAULT;

	/**
	 * This is true if the Classe Militaire attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean classeMilitaireESet;

	/**
	 * The default value of the '{@link #getPraticabilite() <em>Praticabilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPraticabilite()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoItinerairePraticabilite PRATICABILITE_EDEFAULT = TypeDictionaryDicoItinerairePraticabilite.ALLWR;

	/**
	 * The cached value of the '{@link #getPraticabilite() <em>Praticabilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPraticabilite()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoItinerairePraticabilite praticabilite = PRATICABILITE_EDEFAULT;

	/**
	 * This is true if the Praticabilite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean praticabiliteESet;

	/**
	 * The default value of the '{@link #getMoyenTransport() <em>Moyen Transport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyenTransport()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoMoyenTransport MOYEN_TRANSPORT_EDEFAULT = TypeDictionaryDicoMoyenTransport.AIR;

	/**
	 * The cached value of the '{@link #getMoyenTransport() <em>Moyen Transport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyenTransport()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoMoyenTransport moyenTransport = MOYEN_TRANSPORT_EDEFAULT;

	/**
	 * This is true if the Moyen Transport attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean moyenTransportESet;

	/**
	 * The default value of the '{@link #getMobilite() <em>Mobilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMobilite()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoMobilite MOBILITE_EDEFAULT = TypeDictionaryDicoMobilite.FOOT;

	/**
	 * The cached value of the '{@link #getMobilite() <em>Mobilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMobilite()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoMobilite mobilite = MOBILITE_EDEFAULT;

	/**
	 * This is true if the Mobilite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mobiliteESet;

	/**
	 * The default value of the '{@link #getCouleur() <em>Couleur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouleur()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoItineraireCouleur COULEUR_EDEFAULT = TypeDictionaryDicoItineraireCouleur.BLACK;

	/**
	 * The cached value of the '{@link #getCouleur() <em>Couleur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouleur()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoItineraireCouleur couleur = COULEUR_EDEFAULT;

	/**
	 * This is true if the Couleur attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean couleurESet;

	/**
	 * The default value of the '{@link #getSensTrafic() <em>Sens Trafic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensTrafic()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoSensTrafic SENS_TRAFIC_EDEFAULT = TypeDictionaryDicoSensTrafic.ONEWAY;

	/**
	 * The cached value of the '{@link #getSensTrafic() <em>Sens Trafic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensTrafic()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoSensTrafic sensTrafic = SENS_TRAFIC_EDEFAULT;

	/**
	 * This is true if the Sens Trafic attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sensTraficESet;

	/**
	 * The cached value of the '{@link #getVitesse() <em>Vitesse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesse()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeVitesseLineaire vitesse;

	/**
	 * The cached value of the '{@link #getDuree() <em>Duree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuree()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree duree;

	/**
	 * The default value of the '{@link #getComplementCaracteristique() <em>Complement Caracteristique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplementCaracteristique()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPLEMENT_CARACTERISTIQUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComplementCaracteristique() <em>Complement Caracteristique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplementCaracteristique()
	 * @generated
	 * @ordered
	 */
	protected String complementCaracteristique = COMPLEMENT_CARACTERISTIQUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAPourCaracteristiqueAxeAxe() <em>APour Caracteristique Axe Axe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourCaracteristiqueAxeAxe()
	 * @generated
	 * @ordered
	 */
	protected TypeAxe aPourCaracteristiqueAxeAxe;

	/**
	 * The cached value of the '{@link #getAPourPointParticulierPointParticulierItineraire() <em>APour Point Particulier Point Particulier Itineraire</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourPointParticulierPointParticulierItineraire()
	 * @generated
	 * @ordered
	 */
	protected EList<TypePointParticulierItineraire> aPourPointParticulierPointParticulierItineraire;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeItineraireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeItineraire();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getClasseMilitaire() {
		return classeMilitaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClasseMilitaire(long newClasseMilitaire) {
		long oldClasseMilitaire = classeMilitaire;
		classeMilitaire = newClasseMilitaire;
		boolean oldClasseMilitaireESet = classeMilitaireESet;
		classeMilitaireESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ITINERAIRE__CLASSE_MILITAIRE, oldClasseMilitaire, classeMilitaire, !oldClasseMilitaireESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClasseMilitaire() {
		long oldClasseMilitaire = classeMilitaire;
		boolean oldClasseMilitaireESet = classeMilitaireESet;
		classeMilitaire = CLASSE_MILITAIRE_EDEFAULT;
		classeMilitaireESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ITINERAIRE__CLASSE_MILITAIRE, oldClasseMilitaire, CLASSE_MILITAIRE_EDEFAULT, oldClasseMilitaireESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClasseMilitaire() {
		return classeMilitaireESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoItinerairePraticabilite getPraticabilite() {
		return praticabilite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPraticabilite(TypeDictionaryDicoItinerairePraticabilite newPraticabilite) {
		TypeDictionaryDicoItinerairePraticabilite oldPraticabilite = praticabilite;
		praticabilite = newPraticabilite == null ? PRATICABILITE_EDEFAULT : newPraticabilite;
		boolean oldPraticabiliteESet = praticabiliteESet;
		praticabiliteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ITINERAIRE__PRATICABILITE, oldPraticabilite, praticabilite, !oldPraticabiliteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPraticabilite() {
		TypeDictionaryDicoItinerairePraticabilite oldPraticabilite = praticabilite;
		boolean oldPraticabiliteESet = praticabiliteESet;
		praticabilite = PRATICABILITE_EDEFAULT;
		praticabiliteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ITINERAIRE__PRATICABILITE, oldPraticabilite, PRATICABILITE_EDEFAULT, oldPraticabiliteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPraticabilite() {
		return praticabiliteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoMoyenTransport getMoyenTransport() {
		return moyenTransport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoyenTransport(TypeDictionaryDicoMoyenTransport newMoyenTransport) {
		TypeDictionaryDicoMoyenTransport oldMoyenTransport = moyenTransport;
		moyenTransport = newMoyenTransport == null ? MOYEN_TRANSPORT_EDEFAULT : newMoyenTransport;
		boolean oldMoyenTransportESet = moyenTransportESet;
		moyenTransportESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ITINERAIRE__MOYEN_TRANSPORT, oldMoyenTransport, moyenTransport, !oldMoyenTransportESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMoyenTransport() {
		TypeDictionaryDicoMoyenTransport oldMoyenTransport = moyenTransport;
		boolean oldMoyenTransportESet = moyenTransportESet;
		moyenTransport = MOYEN_TRANSPORT_EDEFAULT;
		moyenTransportESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ITINERAIRE__MOYEN_TRANSPORT, oldMoyenTransport, MOYEN_TRANSPORT_EDEFAULT, oldMoyenTransportESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMoyenTransport() {
		return moyenTransportESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoMobilite getMobilite() {
		return mobilite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMobilite(TypeDictionaryDicoMobilite newMobilite) {
		TypeDictionaryDicoMobilite oldMobilite = mobilite;
		mobilite = newMobilite == null ? MOBILITE_EDEFAULT : newMobilite;
		boolean oldMobiliteESet = mobiliteESet;
		mobiliteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ITINERAIRE__MOBILITE, oldMobilite, mobilite, !oldMobiliteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMobilite() {
		TypeDictionaryDicoMobilite oldMobilite = mobilite;
		boolean oldMobiliteESet = mobiliteESet;
		mobilite = MOBILITE_EDEFAULT;
		mobiliteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ITINERAIRE__MOBILITE, oldMobilite, MOBILITE_EDEFAULT, oldMobiliteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMobilite() {
		return mobiliteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoItineraireCouleur getCouleur() {
		return couleur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCouleur(TypeDictionaryDicoItineraireCouleur newCouleur) {
		TypeDictionaryDicoItineraireCouleur oldCouleur = couleur;
		couleur = newCouleur == null ? COULEUR_EDEFAULT : newCouleur;
		boolean oldCouleurESet = couleurESet;
		couleurESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ITINERAIRE__COULEUR, oldCouleur, couleur, !oldCouleurESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCouleur() {
		TypeDictionaryDicoItineraireCouleur oldCouleur = couleur;
		boolean oldCouleurESet = couleurESet;
		couleur = COULEUR_EDEFAULT;
		couleurESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ITINERAIRE__COULEUR, oldCouleur, COULEUR_EDEFAULT, oldCouleurESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCouleur() {
		return couleurESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoSensTrafic getSensTrafic() {
		return sensTrafic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSensTrafic(TypeDictionaryDicoSensTrafic newSensTrafic) {
		TypeDictionaryDicoSensTrafic oldSensTrafic = sensTrafic;
		sensTrafic = newSensTrafic == null ? SENS_TRAFIC_EDEFAULT : newSensTrafic;
		boolean oldSensTraficESet = sensTraficESet;
		sensTraficESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ITINERAIRE__SENS_TRAFIC, oldSensTrafic, sensTrafic, !oldSensTraficESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSensTrafic() {
		TypeDictionaryDicoSensTrafic oldSensTrafic = sensTrafic;
		boolean oldSensTraficESet = sensTraficESet;
		sensTrafic = SENS_TRAFIC_EDEFAULT;
		sensTraficESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ITINERAIRE__SENS_TRAFIC, oldSensTrafic, SENS_TRAFIC_EDEFAULT, oldSensTraficESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSensTrafic() {
		return sensTraficESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeVitesseLineaire getVitesse() {
		return vitesse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVitesse(TypeDataTypeVitesseLineaire newVitesse, NotificationChain msgs) {
		TypeDataTypeVitesseLineaire oldVitesse = vitesse;
		vitesse = newVitesse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ITINERAIRE__VITESSE, oldVitesse, newVitesse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVitesse(TypeDataTypeVitesseLineaire newVitesse) {
		if (newVitesse != vitesse) {
			NotificationChain msgs = null;
			if (vitesse != null)
				msgs = ((InternalEObject)vitesse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ITINERAIRE__VITESSE, null, msgs);
			if (newVitesse != null)
				msgs = ((InternalEObject)newVitesse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ITINERAIRE__VITESSE, null, msgs);
			msgs = basicSetVitesse(newVitesse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ITINERAIRE__VITESSE, newVitesse, newVitesse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getDuree() {
		return duree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDuree(TypeDataTypeDuree newDuree, NotificationChain msgs) {
		TypeDataTypeDuree oldDuree = duree;
		duree = newDuree;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ITINERAIRE__DUREE, oldDuree, newDuree);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuree(TypeDataTypeDuree newDuree) {
		if (newDuree != duree) {
			NotificationChain msgs = null;
			if (duree != null)
				msgs = ((InternalEObject)duree).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ITINERAIRE__DUREE, null, msgs);
			if (newDuree != null)
				msgs = ((InternalEObject)newDuree).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ITINERAIRE__DUREE, null, msgs);
			msgs = basicSetDuree(newDuree, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ITINERAIRE__DUREE, newDuree, newDuree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComplementCaracteristique() {
		return complementCaracteristique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplementCaracteristique(String newComplementCaracteristique) {
		String oldComplementCaracteristique = complementCaracteristique;
		complementCaracteristique = newComplementCaracteristique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ITINERAIRE__COMPLEMENT_CARACTERISTIQUE, oldComplementCaracteristique, complementCaracteristique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAxe getAPourCaracteristiqueAxeAxe() {
		return aPourCaracteristiqueAxeAxe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourCaracteristiqueAxeAxe(TypeAxe newAPourCaracteristiqueAxeAxe, NotificationChain msgs) {
		TypeAxe oldAPourCaracteristiqueAxeAxe = aPourCaracteristiqueAxeAxe;
		aPourCaracteristiqueAxeAxe = newAPourCaracteristiqueAxeAxe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ITINERAIRE__APOUR_CARACTERISTIQUE_AXE_AXE, oldAPourCaracteristiqueAxeAxe, newAPourCaracteristiqueAxeAxe);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourCaracteristiqueAxeAxe(TypeAxe newAPourCaracteristiqueAxeAxe) {
		if (newAPourCaracteristiqueAxeAxe != aPourCaracteristiqueAxeAxe) {
			NotificationChain msgs = null;
			if (aPourCaracteristiqueAxeAxe != null)
				msgs = ((InternalEObject)aPourCaracteristiqueAxeAxe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ITINERAIRE__APOUR_CARACTERISTIQUE_AXE_AXE, null, msgs);
			if (newAPourCaracteristiqueAxeAxe != null)
				msgs = ((InternalEObject)newAPourCaracteristiqueAxeAxe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ITINERAIRE__APOUR_CARACTERISTIQUE_AXE_AXE, null, msgs);
			msgs = basicSetAPourCaracteristiqueAxeAxe(newAPourCaracteristiqueAxeAxe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ITINERAIRE__APOUR_CARACTERISTIQUE_AXE_AXE, newAPourCaracteristiqueAxeAxe, newAPourCaracteristiqueAxeAxe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypePointParticulierItineraire> getAPourPointParticulierPointParticulierItineraire() {
		if (aPourPointParticulierPointParticulierItineraire == null) {
			aPourPointParticulierPointParticulierItineraire = new EObjectContainmentEList<TypePointParticulierItineraire>(TypePointParticulierItineraire.class, this, SchemaPackage.TYPE_ITINERAIRE__APOUR_POINT_PARTICULIER_POINT_PARTICULIER_ITINERAIRE);
		}
		return aPourPointParticulierPointParticulierItineraire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ITINERAIRE__VITESSE:
				return basicSetVitesse(null, msgs);
			case SchemaPackage.TYPE_ITINERAIRE__DUREE:
				return basicSetDuree(null, msgs);
			case SchemaPackage.TYPE_ITINERAIRE__APOUR_CARACTERISTIQUE_AXE_AXE:
				return basicSetAPourCaracteristiqueAxeAxe(null, msgs);
			case SchemaPackage.TYPE_ITINERAIRE__APOUR_POINT_PARTICULIER_POINT_PARTICULIER_ITINERAIRE:
				return ((InternalEList<?>)getAPourPointParticulierPointParticulierItineraire()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_ITINERAIRE__CLASSE_MILITAIRE:
				return new Long(getClasseMilitaire());
			case SchemaPackage.TYPE_ITINERAIRE__PRATICABILITE:
				return getPraticabilite();
			case SchemaPackage.TYPE_ITINERAIRE__MOYEN_TRANSPORT:
				return getMoyenTransport();
			case SchemaPackage.TYPE_ITINERAIRE__MOBILITE:
				return getMobilite();
			case SchemaPackage.TYPE_ITINERAIRE__COULEUR:
				return getCouleur();
			case SchemaPackage.TYPE_ITINERAIRE__SENS_TRAFIC:
				return getSensTrafic();
			case SchemaPackage.TYPE_ITINERAIRE__VITESSE:
				return getVitesse();
			case SchemaPackage.TYPE_ITINERAIRE__DUREE:
				return getDuree();
			case SchemaPackage.TYPE_ITINERAIRE__COMPLEMENT_CARACTERISTIQUE:
				return getComplementCaracteristique();
			case SchemaPackage.TYPE_ITINERAIRE__APOUR_CARACTERISTIQUE_AXE_AXE:
				return getAPourCaracteristiqueAxeAxe();
			case SchemaPackage.TYPE_ITINERAIRE__APOUR_POINT_PARTICULIER_POINT_PARTICULIER_ITINERAIRE:
				return getAPourPointParticulierPointParticulierItineraire();
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
			case SchemaPackage.TYPE_ITINERAIRE__CLASSE_MILITAIRE:
				setClasseMilitaire(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_ITINERAIRE__PRATICABILITE:
				setPraticabilite((TypeDictionaryDicoItinerairePraticabilite)newValue);
				return;
			case SchemaPackage.TYPE_ITINERAIRE__MOYEN_TRANSPORT:
				setMoyenTransport((TypeDictionaryDicoMoyenTransport)newValue);
				return;
			case SchemaPackage.TYPE_ITINERAIRE__MOBILITE:
				setMobilite((TypeDictionaryDicoMobilite)newValue);
				return;
			case SchemaPackage.TYPE_ITINERAIRE__COULEUR:
				setCouleur((TypeDictionaryDicoItineraireCouleur)newValue);
				return;
			case SchemaPackage.TYPE_ITINERAIRE__SENS_TRAFIC:
				setSensTrafic((TypeDictionaryDicoSensTrafic)newValue);
				return;
			case SchemaPackage.TYPE_ITINERAIRE__VITESSE:
				setVitesse((TypeDataTypeVitesseLineaire)newValue);
				return;
			case SchemaPackage.TYPE_ITINERAIRE__DUREE:
				setDuree((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_ITINERAIRE__COMPLEMENT_CARACTERISTIQUE:
				setComplementCaracteristique((String)newValue);
				return;
			case SchemaPackage.TYPE_ITINERAIRE__APOUR_CARACTERISTIQUE_AXE_AXE:
				setAPourCaracteristiqueAxeAxe((TypeAxe)newValue);
				return;
			case SchemaPackage.TYPE_ITINERAIRE__APOUR_POINT_PARTICULIER_POINT_PARTICULIER_ITINERAIRE:
				getAPourPointParticulierPointParticulierItineraire().clear();
				getAPourPointParticulierPointParticulierItineraire().addAll((Collection<? extends TypePointParticulierItineraire>)newValue);
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
			case SchemaPackage.TYPE_ITINERAIRE__CLASSE_MILITAIRE:
				unsetClasseMilitaire();
				return;
			case SchemaPackage.TYPE_ITINERAIRE__PRATICABILITE:
				unsetPraticabilite();
				return;
			case SchemaPackage.TYPE_ITINERAIRE__MOYEN_TRANSPORT:
				unsetMoyenTransport();
				return;
			case SchemaPackage.TYPE_ITINERAIRE__MOBILITE:
				unsetMobilite();
				return;
			case SchemaPackage.TYPE_ITINERAIRE__COULEUR:
				unsetCouleur();
				return;
			case SchemaPackage.TYPE_ITINERAIRE__SENS_TRAFIC:
				unsetSensTrafic();
				return;
			case SchemaPackage.TYPE_ITINERAIRE__VITESSE:
				setVitesse((TypeDataTypeVitesseLineaire)null);
				return;
			case SchemaPackage.TYPE_ITINERAIRE__DUREE:
				setDuree((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_ITINERAIRE__COMPLEMENT_CARACTERISTIQUE:
				setComplementCaracteristique(COMPLEMENT_CARACTERISTIQUE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ITINERAIRE__APOUR_CARACTERISTIQUE_AXE_AXE:
				setAPourCaracteristiqueAxeAxe((TypeAxe)null);
				return;
			case SchemaPackage.TYPE_ITINERAIRE__APOUR_POINT_PARTICULIER_POINT_PARTICULIER_ITINERAIRE:
				getAPourPointParticulierPointParticulierItineraire().clear();
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
			case SchemaPackage.TYPE_ITINERAIRE__CLASSE_MILITAIRE:
				return isSetClasseMilitaire();
			case SchemaPackage.TYPE_ITINERAIRE__PRATICABILITE:
				return isSetPraticabilite();
			case SchemaPackage.TYPE_ITINERAIRE__MOYEN_TRANSPORT:
				return isSetMoyenTransport();
			case SchemaPackage.TYPE_ITINERAIRE__MOBILITE:
				return isSetMobilite();
			case SchemaPackage.TYPE_ITINERAIRE__COULEUR:
				return isSetCouleur();
			case SchemaPackage.TYPE_ITINERAIRE__SENS_TRAFIC:
				return isSetSensTrafic();
			case SchemaPackage.TYPE_ITINERAIRE__VITESSE:
				return vitesse != null;
			case SchemaPackage.TYPE_ITINERAIRE__DUREE:
				return duree != null;
			case SchemaPackage.TYPE_ITINERAIRE__COMPLEMENT_CARACTERISTIQUE:
				return COMPLEMENT_CARACTERISTIQUE_EDEFAULT == null ? complementCaracteristique != null : !COMPLEMENT_CARACTERISTIQUE_EDEFAULT.equals(complementCaracteristique);
			case SchemaPackage.TYPE_ITINERAIRE__APOUR_CARACTERISTIQUE_AXE_AXE:
				return aPourCaracteristiqueAxeAxe != null;
			case SchemaPackage.TYPE_ITINERAIRE__APOUR_POINT_PARTICULIER_POINT_PARTICULIER_ITINERAIRE:
				return aPourPointParticulierPointParticulierItineraire != null && !aPourPointParticulierPointParticulierItineraire.isEmpty();
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
		result.append(" (classeMilitaire: ");
		if (classeMilitaireESet) result.append(classeMilitaire); else result.append("<unset>");
		result.append(", praticabilite: ");
		if (praticabiliteESet) result.append(praticabilite); else result.append("<unset>");
		result.append(", moyenTransport: ");
		if (moyenTransportESet) result.append(moyenTransport); else result.append("<unset>");
		result.append(", mobilite: ");
		if (mobiliteESet) result.append(mobilite); else result.append("<unset>");
		result.append(", couleur: ");
		if (couleurESet) result.append(couleur); else result.append("<unset>");
		result.append(", sensTrafic: ");
		if (sensTraficESet) result.append(sensTrafic); else result.append("<unset>");
		result.append(", complementCaracteristique: ");
		result.append(complementCaracteristique);
		result.append(')');
		return result.toString();
	}

} //TypeItineraireImpl
