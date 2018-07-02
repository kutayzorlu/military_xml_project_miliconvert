/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;
import mpia.meta.TypeDataTypeDuree;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoPrelevementDetachementDisponibilitePrelevement;
import mpia.schema.TypeModaliteTransfertAutoriteASS;
import mpia.schema.TypePrelevementDetachement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Prelevement Detachement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypePrelevementDetachementImpl#getDisponibilitePrelevement <em>Disponibilite Prelevement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrelevementDetachementImpl#getHoraireRendezVous <em>Horaire Rendez Vous</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrelevementDetachementImpl#getPreavis <em>Preavis</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrelevementDetachementImpl#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrelevementDetachementImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrelevementDetachementImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrelevementDetachementImpl#getPorteSurArticulationTerre <em>Porte Sur Articulation Terre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrelevementDetachementImpl#getAPourLieuRendezVousAutreElementControle <em>APour Lieu Rendez Vous Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrelevementDetachementImpl#getAPourCoordonneesRadioAdresseRadio <em>APour Coordonnees Radio Adresse Radio</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrelevementDetachementImpl#getACommeModaliteTransfertModaliteTransfertAutoriteASS <em>AComme Modalite Transfert Modalite Transfert Autorite ASS</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypePrelevementDetachementImpl extends EObjectImpl implements TypePrelevementDetachement {
	/**
	 * The default value of the '{@link #getDisponibilitePrelevement() <em>Disponibilite Prelevement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisponibilitePrelevement()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPrelevementDetachementDisponibilitePrelevement DISPONIBILITE_PRELEVEMENT_EDEFAULT = TypeDictionaryDicoPrelevementDetachementDisponibilitePrelevement.AVAIL;

	/**
	 * The cached value of the '{@link #getDisponibilitePrelevement() <em>Disponibilite Prelevement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisponibilitePrelevement()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPrelevementDetachementDisponibilitePrelevement disponibilitePrelevement = DISPONIBILITE_PRELEVEMENT_EDEFAULT;

	/**
	 * This is true if the Disponibilite Prelevement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean disponibilitePrelevementESet;

	/**
	 * The default value of the '{@link #getHoraireRendezVous() <em>Horaire Rendez Vous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoraireRendezVous()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar HORAIRE_RENDEZ_VOUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHoraireRendezVous() <em>Horaire Rendez Vous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoraireRendezVous()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar horaireRendezVous = HORAIRE_RENDEZ_VOUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPreavis() <em>Preavis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreavis()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree preavis;

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
	 * The cached value of the '{@link #getPorteSurArticulationTerre() <em>Porte Sur Articulation Terre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorteSurArticulationTerre()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT porteSurArticulationTerre;

	/**
	 * The cached value of the '{@link #getAPourLieuRendezVousAutreElementControle() <em>APour Lieu Rendez Vous Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourLieuRendezVousAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourLieuRendezVousAutreElementControle;

	/**
	 * The cached value of the '{@link #getAPourCoordonneesRadioAdresseRadio() <em>APour Coordonnees Radio Adresse Radio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourCoordonneesRadioAdresseRadio()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourCoordonneesRadioAdresseRadio;

	/**
	 * The cached value of the '{@link #getACommeModaliteTransfertModaliteTransfertAutoriteASS() <em>AComme Modalite Transfert Modalite Transfert Autorite ASS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeModaliteTransfertModaliteTransfertAutoriteASS()
	 * @generated
	 * @ordered
	 */
	protected TypeModaliteTransfertAutoriteASS aCommeModaliteTransfertModaliteTransfertAutoriteASS;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypePrelevementDetachementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypePrelevementDetachement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoPrelevementDetachementDisponibilitePrelevement getDisponibilitePrelevement() {
		return disponibilitePrelevement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisponibilitePrelevement(TypeDictionaryDicoPrelevementDetachementDisponibilitePrelevement newDisponibilitePrelevement) {
		TypeDictionaryDicoPrelevementDetachementDisponibilitePrelevement oldDisponibilitePrelevement = disponibilitePrelevement;
		disponibilitePrelevement = newDisponibilitePrelevement == null ? DISPONIBILITE_PRELEVEMENT_EDEFAULT : newDisponibilitePrelevement;
		boolean oldDisponibilitePrelevementESet = disponibilitePrelevementESet;
		disponibilitePrelevementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__DISPONIBILITE_PRELEVEMENT, oldDisponibilitePrelevement, disponibilitePrelevement, !oldDisponibilitePrelevementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisponibilitePrelevement() {
		TypeDictionaryDicoPrelevementDetachementDisponibilitePrelevement oldDisponibilitePrelevement = disponibilitePrelevement;
		boolean oldDisponibilitePrelevementESet = disponibilitePrelevementESet;
		disponibilitePrelevement = DISPONIBILITE_PRELEVEMENT_EDEFAULT;
		disponibilitePrelevementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__DISPONIBILITE_PRELEVEMENT, oldDisponibilitePrelevement, DISPONIBILITE_PRELEVEMENT_EDEFAULT, oldDisponibilitePrelevementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisponibilitePrelevement() {
		return disponibilitePrelevementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getHoraireRendezVous() {
		return horaireRendezVous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHoraireRendezVous(XMLGregorianCalendar newHoraireRendezVous) {
		XMLGregorianCalendar oldHoraireRendezVous = horaireRendezVous;
		horaireRendezVous = newHoraireRendezVous;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__HORAIRE_RENDEZ_VOUS, oldHoraireRendezVous, horaireRendezVous));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getPreavis() {
		return preavis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreavis(TypeDataTypeDuree newPreavis, NotificationChain msgs) {
		TypeDataTypeDuree oldPreavis = preavis;
		preavis = newPreavis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__PREAVIS, oldPreavis, newPreavis);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreavis(TypeDataTypeDuree newPreavis) {
		if (newPreavis != preavis) {
			NotificationChain msgs = null;
			if (preavis != null)
				msgs = ((InternalEObject)preavis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__PREAVIS, null, msgs);
			if (newPreavis != null)
				msgs = ((InternalEObject)newPreavis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__PREAVIS, null, msgs);
			msgs = basicSetPreavis(newPreavis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__PREAVIS, newPreavis, newPreavis));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__COMMENTAIRE, oldCommentaire, commentaire));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getPorteSurArticulationTerre() {
		return porteSurArticulationTerre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPorteSurArticulationTerre(TypeAssociationEXT newPorteSurArticulationTerre, NotificationChain msgs) {
		TypeAssociationEXT oldPorteSurArticulationTerre = porteSurArticulationTerre;
		porteSurArticulationTerre = newPorteSurArticulationTerre;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__PORTE_SUR_ARTICULATION_TERRE, oldPorteSurArticulationTerre, newPorteSurArticulationTerre);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPorteSurArticulationTerre(TypeAssociationEXT newPorteSurArticulationTerre) {
		if (newPorteSurArticulationTerre != porteSurArticulationTerre) {
			NotificationChain msgs = null;
			if (porteSurArticulationTerre != null)
				msgs = ((InternalEObject)porteSurArticulationTerre).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__PORTE_SUR_ARTICULATION_TERRE, null, msgs);
			if (newPorteSurArticulationTerre != null)
				msgs = ((InternalEObject)newPorteSurArticulationTerre).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__PORTE_SUR_ARTICULATION_TERRE, null, msgs);
			msgs = basicSetPorteSurArticulationTerre(newPorteSurArticulationTerre, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__PORTE_SUR_ARTICULATION_TERRE, newPorteSurArticulationTerre, newPorteSurArticulationTerre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourLieuRendezVousAutreElementControle() {
		return aPourLieuRendezVousAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourLieuRendezVousAutreElementControle(TypeAssociation newAPourLieuRendezVousAutreElementControle, NotificationChain msgs) {
		TypeAssociation oldAPourLieuRendezVousAutreElementControle = aPourLieuRendezVousAutreElementControle;
		aPourLieuRendezVousAutreElementControle = newAPourLieuRendezVousAutreElementControle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__APOUR_LIEU_RENDEZ_VOUS_AUTRE_ELEMENT_CONTROLE, oldAPourLieuRendezVousAutreElementControle, newAPourLieuRendezVousAutreElementControle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourLieuRendezVousAutreElementControle(TypeAssociation newAPourLieuRendezVousAutreElementControle) {
		if (newAPourLieuRendezVousAutreElementControle != aPourLieuRendezVousAutreElementControle) {
			NotificationChain msgs = null;
			if (aPourLieuRendezVousAutreElementControle != null)
				msgs = ((InternalEObject)aPourLieuRendezVousAutreElementControle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__APOUR_LIEU_RENDEZ_VOUS_AUTRE_ELEMENT_CONTROLE, null, msgs);
			if (newAPourLieuRendezVousAutreElementControle != null)
				msgs = ((InternalEObject)newAPourLieuRendezVousAutreElementControle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__APOUR_LIEU_RENDEZ_VOUS_AUTRE_ELEMENT_CONTROLE, null, msgs);
			msgs = basicSetAPourLieuRendezVousAutreElementControle(newAPourLieuRendezVousAutreElementControle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__APOUR_LIEU_RENDEZ_VOUS_AUTRE_ELEMENT_CONTROLE, newAPourLieuRendezVousAutreElementControle, newAPourLieuRendezVousAutreElementControle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourCoordonneesRadioAdresseRadio() {
		return aPourCoordonneesRadioAdresseRadio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourCoordonneesRadioAdresseRadio(TypeAssociation newAPourCoordonneesRadioAdresseRadio, NotificationChain msgs) {
		TypeAssociation oldAPourCoordonneesRadioAdresseRadio = aPourCoordonneesRadioAdresseRadio;
		aPourCoordonneesRadioAdresseRadio = newAPourCoordonneesRadioAdresseRadio;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__APOUR_COORDONNEES_RADIO_ADRESSE_RADIO, oldAPourCoordonneesRadioAdresseRadio, newAPourCoordonneesRadioAdresseRadio);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourCoordonneesRadioAdresseRadio(TypeAssociation newAPourCoordonneesRadioAdresseRadio) {
		if (newAPourCoordonneesRadioAdresseRadio != aPourCoordonneesRadioAdresseRadio) {
			NotificationChain msgs = null;
			if (aPourCoordonneesRadioAdresseRadio != null)
				msgs = ((InternalEObject)aPourCoordonneesRadioAdresseRadio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__APOUR_COORDONNEES_RADIO_ADRESSE_RADIO, null, msgs);
			if (newAPourCoordonneesRadioAdresseRadio != null)
				msgs = ((InternalEObject)newAPourCoordonneesRadioAdresseRadio).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__APOUR_COORDONNEES_RADIO_ADRESSE_RADIO, null, msgs);
			msgs = basicSetAPourCoordonneesRadioAdresseRadio(newAPourCoordonneesRadioAdresseRadio, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__APOUR_COORDONNEES_RADIO_ADRESSE_RADIO, newAPourCoordonneesRadioAdresseRadio, newAPourCoordonneesRadioAdresseRadio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeModaliteTransfertAutoriteASS getACommeModaliteTransfertModaliteTransfertAutoriteASS() {
		return aCommeModaliteTransfertModaliteTransfertAutoriteASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommeModaliteTransfertModaliteTransfertAutoriteASS(TypeModaliteTransfertAutoriteASS newACommeModaliteTransfertModaliteTransfertAutoriteASS, NotificationChain msgs) {
		TypeModaliteTransfertAutoriteASS oldACommeModaliteTransfertModaliteTransfertAutoriteASS = aCommeModaliteTransfertModaliteTransfertAutoriteASS;
		aCommeModaliteTransfertModaliteTransfertAutoriteASS = newACommeModaliteTransfertModaliteTransfertAutoriteASS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__ACOMME_MODALITE_TRANSFERT_MODALITE_TRANSFERT_AUTORITE_ASS, oldACommeModaliteTransfertModaliteTransfertAutoriteASS, newACommeModaliteTransfertModaliteTransfertAutoriteASS);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommeModaliteTransfertModaliteTransfertAutoriteASS(TypeModaliteTransfertAutoriteASS newACommeModaliteTransfertModaliteTransfertAutoriteASS) {
		if (newACommeModaliteTransfertModaliteTransfertAutoriteASS != aCommeModaliteTransfertModaliteTransfertAutoriteASS) {
			NotificationChain msgs = null;
			if (aCommeModaliteTransfertModaliteTransfertAutoriteASS != null)
				msgs = ((InternalEObject)aCommeModaliteTransfertModaliteTransfertAutoriteASS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__ACOMME_MODALITE_TRANSFERT_MODALITE_TRANSFERT_AUTORITE_ASS, null, msgs);
			if (newACommeModaliteTransfertModaliteTransfertAutoriteASS != null)
				msgs = ((InternalEObject)newACommeModaliteTransfertModaliteTransfertAutoriteASS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__ACOMME_MODALITE_TRANSFERT_MODALITE_TRANSFERT_AUTORITE_ASS, null, msgs);
			msgs = basicSetACommeModaliteTransfertModaliteTransfertAutoriteASS(newACommeModaliteTransfertModaliteTransfertAutoriteASS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__ACOMME_MODALITE_TRANSFERT_MODALITE_TRANSFERT_AUTORITE_ASS, newACommeModaliteTransfertModaliteTransfertAutoriteASS, newACommeModaliteTransfertModaliteTransfertAutoriteASS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__PREAVIS:
				return basicSetPreavis(null, msgs);
			case SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__PORTE_SUR_ARTICULATION_TERRE:
				return basicSetPorteSurArticulationTerre(null, msgs);
			case SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__APOUR_LIEU_RENDEZ_VOUS_AUTRE_ELEMENT_CONTROLE:
				return basicSetAPourLieuRendezVousAutreElementControle(null, msgs);
			case SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__APOUR_COORDONNEES_RADIO_ADRESSE_RADIO:
				return basicSetAPourCoordonneesRadioAdresseRadio(null, msgs);
			case SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__ACOMME_MODALITE_TRANSFERT_MODALITE_TRANSFERT_AUTORITE_ASS:
				return basicSetACommeModaliteTransfertModaliteTransfertAutoriteASS(null, msgs);
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
			case SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__DISPONIBILITE_PRELEVEMENT:
				return getDisponibilitePrelevement();
			case SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__HORAIRE_RENDEZ_VOUS:
				return getHoraireRendezVous();
			case SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__PREAVIS:
				return getPreavis();
			case SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__COMMENTAIRE:
				return getCommentaire();
			case SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__CTE:
				return getCTE();
			case SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__CE:
				return getCE();
			case SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__PORTE_SUR_ARTICULATION_TERRE:
				return getPorteSurArticulationTerre();
			case SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__APOUR_LIEU_RENDEZ_VOUS_AUTRE_ELEMENT_CONTROLE:
				return getAPourLieuRendezVousAutreElementControle();
			case SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__APOUR_COORDONNEES_RADIO_ADRESSE_RADIO:
				return getAPourCoordonneesRadioAdresseRadio();
			case SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__ACOMME_MODALITE_TRANSFERT_MODALITE_TRANSFERT_AUTORITE_ASS:
				return getACommeModaliteTransfertModaliteTransfertAutoriteASS();
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
			case SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__DISPONIBILITE_PRELEVEMENT:
				setDisponibilitePrelevement((TypeDictionaryDicoPrelevementDetachementDisponibilitePrelevement)newValue);
				return;
			case SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__HORAIRE_RENDEZ_VOUS:
				setHoraireRendezVous((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__PREAVIS:
				setPreavis((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__COMMENTAIRE:
				setCommentaire((String)newValue);
				return;
			case SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__PORTE_SUR_ARTICULATION_TERRE:
				setPorteSurArticulationTerre((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__APOUR_LIEU_RENDEZ_VOUS_AUTRE_ELEMENT_CONTROLE:
				setAPourLieuRendezVousAutreElementControle((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__APOUR_COORDONNEES_RADIO_ADRESSE_RADIO:
				setAPourCoordonneesRadioAdresseRadio((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__ACOMME_MODALITE_TRANSFERT_MODALITE_TRANSFERT_AUTORITE_ASS:
				setACommeModaliteTransfertModaliteTransfertAutoriteASS((TypeModaliteTransfertAutoriteASS)newValue);
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
			case SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__DISPONIBILITE_PRELEVEMENT:
				unsetDisponibilitePrelevement();
				return;
			case SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__HORAIRE_RENDEZ_VOUS:
				setHoraireRendezVous(HORAIRE_RENDEZ_VOUS_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__PREAVIS:
				setPreavis((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__COMMENTAIRE:
				setCommentaire(COMMENTAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__PORTE_SUR_ARTICULATION_TERRE:
				setPorteSurArticulationTerre((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__APOUR_LIEU_RENDEZ_VOUS_AUTRE_ELEMENT_CONTROLE:
				setAPourLieuRendezVousAutreElementControle((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__APOUR_COORDONNEES_RADIO_ADRESSE_RADIO:
				setAPourCoordonneesRadioAdresseRadio((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__ACOMME_MODALITE_TRANSFERT_MODALITE_TRANSFERT_AUTORITE_ASS:
				setACommeModaliteTransfertModaliteTransfertAutoriteASS((TypeModaliteTransfertAutoriteASS)null);
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
			case SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__DISPONIBILITE_PRELEVEMENT:
				return isSetDisponibilitePrelevement();
			case SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__HORAIRE_RENDEZ_VOUS:
				return HORAIRE_RENDEZ_VOUS_EDEFAULT == null ? horaireRendezVous != null : !HORAIRE_RENDEZ_VOUS_EDEFAULT.equals(horaireRendezVous);
			case SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__PREAVIS:
				return preavis != null;
			case SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__COMMENTAIRE:
				return COMMENTAIRE_EDEFAULT == null ? commentaire != null : !COMMENTAIRE_EDEFAULT.equals(commentaire);
			case SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__PORTE_SUR_ARTICULATION_TERRE:
				return porteSurArticulationTerre != null;
			case SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__APOUR_LIEU_RENDEZ_VOUS_AUTRE_ELEMENT_CONTROLE:
				return aPourLieuRendezVousAutreElementControle != null;
			case SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__APOUR_COORDONNEES_RADIO_ADRESSE_RADIO:
				return aPourCoordonneesRadioAdresseRadio != null;
			case SchemaPackage.TYPE_PRELEVEMENT_DETACHEMENT__ACOMME_MODALITE_TRANSFERT_MODALITE_TRANSFERT_AUTORITE_ASS:
				return aCommeModaliteTransfertModaliteTransfertAutoriteASS != null;
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
		result.append(" (disponibilitePrelevement: ");
		if (disponibilitePrelevementESet) result.append(disponibilitePrelevement); else result.append("<unset>");
		result.append(", horaireRendezVous: ");
		result.append(horaireRendezVous);
		result.append(", commentaire: ");
		result.append(commentaire);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypePrelevementDetachementImpl
