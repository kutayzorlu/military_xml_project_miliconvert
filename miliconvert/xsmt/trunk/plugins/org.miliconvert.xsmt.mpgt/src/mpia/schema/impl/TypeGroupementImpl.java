/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoGroupementDegreCentralisationASS;
import mpia.schema.TypeGroupement;

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
 * An implementation of the model object '<em><b>Type Groupement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeGroupementImpl#getDegreCentralisationASS <em>Degre Centralisation ASS</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeGroupementImpl#getFonctionAutoriteResponsable <em>Fonction Autorite Responsable</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeGroupementImpl#getGDHdebutActivation <em>GD Hdebut Activation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeGroupementImpl#getGDHfinActivation <em>GD Hfin Activation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeGroupementImpl#getNomEtRangAutoriteResponsable <em>Nom Et Rang Autorite Responsable</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeGroupementImpl#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeGroupementImpl#getEstSpecifiePourArticulationTerre <em>Est Specifie Pour Articulation Terre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeGroupementImpl#getEstConstitueUnite <em>Est Constitue Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeGroupementImpl#getAPourResponsableUnite <em>APour Responsable Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeGroupementImpl extends EObjectImpl implements TypeGroupement {
	/**
	 * The default value of the '{@link #getDegreCentralisationASS() <em>Degre Centralisation ASS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegreCentralisationASS()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoGroupementDegreCentralisationASS DEGRE_CENTRALISATION_ASS_EDEFAULT = TypeDictionaryDicoGroupementDegreCentralisationASS.FIRES;

	/**
	 * The cached value of the '{@link #getDegreCentralisationASS() <em>Degre Centralisation ASS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegreCentralisationASS()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoGroupementDegreCentralisationASS degreCentralisationASS = DEGRE_CENTRALISATION_ASS_EDEFAULT;

	/**
	 * This is true if the Degre Centralisation ASS attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean degreCentralisationASSESet;

	/**
	 * The default value of the '{@link #getFonctionAutoriteResponsable() <em>Fonction Autorite Responsable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFonctionAutoriteResponsable()
	 * @generated
	 * @ordered
	 */
	protected static final String FONCTION_AUTORITE_RESPONSABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFonctionAutoriteResponsable() <em>Fonction Autorite Responsable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFonctionAutoriteResponsable()
	 * @generated
	 * @ordered
	 */
	protected String fonctionAutoriteResponsable = FONCTION_AUTORITE_RESPONSABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGDHdebutActivation() <em>GD Hdebut Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHdebutActivation()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GD_HDEBUT_ACTIVATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGDHdebutActivation() <em>GD Hdebut Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHdebutActivation()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gDHdebutActivation = GD_HDEBUT_ACTIVATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getGDHfinActivation() <em>GD Hfin Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHfinActivation()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GD_HFIN_ACTIVATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGDHfinActivation() <em>GD Hfin Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHfinActivation()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gDHfinActivation = GD_HFIN_ACTIVATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getNomEtRangAutoriteResponsable() <em>Nom Et Rang Autorite Responsable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomEtRangAutoriteResponsable()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_ET_RANG_AUTORITE_RESPONSABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomEtRangAutoriteResponsable() <em>Nom Et Rang Autorite Responsable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomEtRangAutoriteResponsable()
	 * @generated
	 * @ordered
	 */
	protected String nomEtRangAutoriteResponsable = NOM_ET_RANG_AUTORITE_RESPONSABLE_EDEFAULT;

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
	 * The cached value of the '{@link #getEstSpecifiePourArticulationTerre() <em>Est Specifie Pour Articulation Terre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSpecifiePourArticulationTerre()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT estSpecifiePourArticulationTerre;

	/**
	 * The cached value of the '{@link #getEstConstitueUnite() <em>Est Constitue Unite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstConstitueUnite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociationEXT> estConstitueUnite;

	/**
	 * The cached value of the '{@link #getAPourResponsableUnite() <em>APour Responsable Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourResponsableUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aPourResponsableUnite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeGroupementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeGroupement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoGroupementDegreCentralisationASS getDegreCentralisationASS() {
		return degreCentralisationASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDegreCentralisationASS(TypeDictionaryDicoGroupementDegreCentralisationASS newDegreCentralisationASS) {
		TypeDictionaryDicoGroupementDegreCentralisationASS oldDegreCentralisationASS = degreCentralisationASS;
		degreCentralisationASS = newDegreCentralisationASS == null ? DEGRE_CENTRALISATION_ASS_EDEFAULT : newDegreCentralisationASS;
		boolean oldDegreCentralisationASSESet = degreCentralisationASSESet;
		degreCentralisationASSESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_GROUPEMENT__DEGRE_CENTRALISATION_ASS, oldDegreCentralisationASS, degreCentralisationASS, !oldDegreCentralisationASSESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDegreCentralisationASS() {
		TypeDictionaryDicoGroupementDegreCentralisationASS oldDegreCentralisationASS = degreCentralisationASS;
		boolean oldDegreCentralisationASSESet = degreCentralisationASSESet;
		degreCentralisationASS = DEGRE_CENTRALISATION_ASS_EDEFAULT;
		degreCentralisationASSESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_GROUPEMENT__DEGRE_CENTRALISATION_ASS, oldDegreCentralisationASS, DEGRE_CENTRALISATION_ASS_EDEFAULT, oldDegreCentralisationASSESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDegreCentralisationASS() {
		return degreCentralisationASSESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFonctionAutoriteResponsable() {
		return fonctionAutoriteResponsable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFonctionAutoriteResponsable(String newFonctionAutoriteResponsable) {
		String oldFonctionAutoriteResponsable = fonctionAutoriteResponsable;
		fonctionAutoriteResponsable = newFonctionAutoriteResponsable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_GROUPEMENT__FONCTION_AUTORITE_RESPONSABLE, oldFonctionAutoriteResponsable, fonctionAutoriteResponsable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getGDHdebutActivation() {
		return gDHdebutActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGDHdebutActivation(XMLGregorianCalendar newGDHdebutActivation) {
		XMLGregorianCalendar oldGDHdebutActivation = gDHdebutActivation;
		gDHdebutActivation = newGDHdebutActivation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_GROUPEMENT__GD_HDEBUT_ACTIVATION, oldGDHdebutActivation, gDHdebutActivation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getGDHfinActivation() {
		return gDHfinActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGDHfinActivation(XMLGregorianCalendar newGDHfinActivation) {
		XMLGregorianCalendar oldGDHfinActivation = gDHfinActivation;
		gDHfinActivation = newGDHfinActivation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_GROUPEMENT__GD_HFIN_ACTIVATION, oldGDHfinActivation, gDHfinActivation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNomEtRangAutoriteResponsable() {
		return nomEtRangAutoriteResponsable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomEtRangAutoriteResponsable(String newNomEtRangAutoriteResponsable) {
		String oldNomEtRangAutoriteResponsable = nomEtRangAutoriteResponsable;
		nomEtRangAutoriteResponsable = newNomEtRangAutoriteResponsable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_GROUPEMENT__NOM_ET_RANG_AUTORITE_RESPONSABLE, oldNomEtRangAutoriteResponsable, nomEtRangAutoriteResponsable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_GROUPEMENT__COMMENTAIRE, oldCommentaire, commentaire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getEstSpecifiePourArticulationTerre() {
		return estSpecifiePourArticulationTerre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstSpecifiePourArticulationTerre(TypeAssociationEXT newEstSpecifiePourArticulationTerre, NotificationChain msgs) {
		TypeAssociationEXT oldEstSpecifiePourArticulationTerre = estSpecifiePourArticulationTerre;
		estSpecifiePourArticulationTerre = newEstSpecifiePourArticulationTerre;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_GROUPEMENT__EST_SPECIFIE_POUR_ARTICULATION_TERRE, oldEstSpecifiePourArticulationTerre, newEstSpecifiePourArticulationTerre);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstSpecifiePourArticulationTerre(TypeAssociationEXT newEstSpecifiePourArticulationTerre) {
		if (newEstSpecifiePourArticulationTerre != estSpecifiePourArticulationTerre) {
			NotificationChain msgs = null;
			if (estSpecifiePourArticulationTerre != null)
				msgs = ((InternalEObject)estSpecifiePourArticulationTerre).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_GROUPEMENT__EST_SPECIFIE_POUR_ARTICULATION_TERRE, null, msgs);
			if (newEstSpecifiePourArticulationTerre != null)
				msgs = ((InternalEObject)newEstSpecifiePourArticulationTerre).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_GROUPEMENT__EST_SPECIFIE_POUR_ARTICULATION_TERRE, null, msgs);
			msgs = basicSetEstSpecifiePourArticulationTerre(newEstSpecifiePourArticulationTerre, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_GROUPEMENT__EST_SPECIFIE_POUR_ARTICULATION_TERRE, newEstSpecifiePourArticulationTerre, newEstSpecifiePourArticulationTerre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEXT> getEstConstitueUnite() {
		if (estConstitueUnite == null) {
			estConstitueUnite = new EObjectContainmentEList<TypeAssociationEXT>(TypeAssociationEXT.class, this, SchemaPackage.TYPE_GROUPEMENT__EST_CONSTITUE_UNITE);
		}
		return estConstitueUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAPourResponsableUnite() {
		return aPourResponsableUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourResponsableUnite(TypeAssociationEXT newAPourResponsableUnite, NotificationChain msgs) {
		TypeAssociationEXT oldAPourResponsableUnite = aPourResponsableUnite;
		aPourResponsableUnite = newAPourResponsableUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_GROUPEMENT__APOUR_RESPONSABLE_UNITE, oldAPourResponsableUnite, newAPourResponsableUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourResponsableUnite(TypeAssociationEXT newAPourResponsableUnite) {
		if (newAPourResponsableUnite != aPourResponsableUnite) {
			NotificationChain msgs = null;
			if (aPourResponsableUnite != null)
				msgs = ((InternalEObject)aPourResponsableUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_GROUPEMENT__APOUR_RESPONSABLE_UNITE, null, msgs);
			if (newAPourResponsableUnite != null)
				msgs = ((InternalEObject)newAPourResponsableUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_GROUPEMENT__APOUR_RESPONSABLE_UNITE, null, msgs);
			msgs = basicSetAPourResponsableUnite(newAPourResponsableUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_GROUPEMENT__APOUR_RESPONSABLE_UNITE, newAPourResponsableUnite, newAPourResponsableUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_GROUPEMENT__EST_SPECIFIE_POUR_ARTICULATION_TERRE:
				return basicSetEstSpecifiePourArticulationTerre(null, msgs);
			case SchemaPackage.TYPE_GROUPEMENT__EST_CONSTITUE_UNITE:
				return ((InternalEList<?>)getEstConstitueUnite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_GROUPEMENT__APOUR_RESPONSABLE_UNITE:
				return basicSetAPourResponsableUnite(null, msgs);
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
			case SchemaPackage.TYPE_GROUPEMENT__DEGRE_CENTRALISATION_ASS:
				return getDegreCentralisationASS();
			case SchemaPackage.TYPE_GROUPEMENT__FONCTION_AUTORITE_RESPONSABLE:
				return getFonctionAutoriteResponsable();
			case SchemaPackage.TYPE_GROUPEMENT__GD_HDEBUT_ACTIVATION:
				return getGDHdebutActivation();
			case SchemaPackage.TYPE_GROUPEMENT__GD_HFIN_ACTIVATION:
				return getGDHfinActivation();
			case SchemaPackage.TYPE_GROUPEMENT__NOM_ET_RANG_AUTORITE_RESPONSABLE:
				return getNomEtRangAutoriteResponsable();
			case SchemaPackage.TYPE_GROUPEMENT__COMMENTAIRE:
				return getCommentaire();
			case SchemaPackage.TYPE_GROUPEMENT__EST_SPECIFIE_POUR_ARTICULATION_TERRE:
				return getEstSpecifiePourArticulationTerre();
			case SchemaPackage.TYPE_GROUPEMENT__EST_CONSTITUE_UNITE:
				return getEstConstitueUnite();
			case SchemaPackage.TYPE_GROUPEMENT__APOUR_RESPONSABLE_UNITE:
				return getAPourResponsableUnite();
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
			case SchemaPackage.TYPE_GROUPEMENT__DEGRE_CENTRALISATION_ASS:
				setDegreCentralisationASS((TypeDictionaryDicoGroupementDegreCentralisationASS)newValue);
				return;
			case SchemaPackage.TYPE_GROUPEMENT__FONCTION_AUTORITE_RESPONSABLE:
				setFonctionAutoriteResponsable((String)newValue);
				return;
			case SchemaPackage.TYPE_GROUPEMENT__GD_HDEBUT_ACTIVATION:
				setGDHdebutActivation((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_GROUPEMENT__GD_HFIN_ACTIVATION:
				setGDHfinActivation((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_GROUPEMENT__NOM_ET_RANG_AUTORITE_RESPONSABLE:
				setNomEtRangAutoriteResponsable((String)newValue);
				return;
			case SchemaPackage.TYPE_GROUPEMENT__COMMENTAIRE:
				setCommentaire((String)newValue);
				return;
			case SchemaPackage.TYPE_GROUPEMENT__EST_SPECIFIE_POUR_ARTICULATION_TERRE:
				setEstSpecifiePourArticulationTerre((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_GROUPEMENT__EST_CONSTITUE_UNITE:
				getEstConstitueUnite().clear();
				getEstConstitueUnite().addAll((Collection<? extends TypeAssociationEXT>)newValue);
				return;
			case SchemaPackage.TYPE_GROUPEMENT__APOUR_RESPONSABLE_UNITE:
				setAPourResponsableUnite((TypeAssociationEXT)newValue);
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
			case SchemaPackage.TYPE_GROUPEMENT__DEGRE_CENTRALISATION_ASS:
				unsetDegreCentralisationASS();
				return;
			case SchemaPackage.TYPE_GROUPEMENT__FONCTION_AUTORITE_RESPONSABLE:
				setFonctionAutoriteResponsable(FONCTION_AUTORITE_RESPONSABLE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_GROUPEMENT__GD_HDEBUT_ACTIVATION:
				setGDHdebutActivation(GD_HDEBUT_ACTIVATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_GROUPEMENT__GD_HFIN_ACTIVATION:
				setGDHfinActivation(GD_HFIN_ACTIVATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_GROUPEMENT__NOM_ET_RANG_AUTORITE_RESPONSABLE:
				setNomEtRangAutoriteResponsable(NOM_ET_RANG_AUTORITE_RESPONSABLE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_GROUPEMENT__COMMENTAIRE:
				setCommentaire(COMMENTAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_GROUPEMENT__EST_SPECIFIE_POUR_ARTICULATION_TERRE:
				setEstSpecifiePourArticulationTerre((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_GROUPEMENT__EST_CONSTITUE_UNITE:
				getEstConstitueUnite().clear();
				return;
			case SchemaPackage.TYPE_GROUPEMENT__APOUR_RESPONSABLE_UNITE:
				setAPourResponsableUnite((TypeAssociationEXT)null);
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
			case SchemaPackage.TYPE_GROUPEMENT__DEGRE_CENTRALISATION_ASS:
				return isSetDegreCentralisationASS();
			case SchemaPackage.TYPE_GROUPEMENT__FONCTION_AUTORITE_RESPONSABLE:
				return FONCTION_AUTORITE_RESPONSABLE_EDEFAULT == null ? fonctionAutoriteResponsable != null : !FONCTION_AUTORITE_RESPONSABLE_EDEFAULT.equals(fonctionAutoriteResponsable);
			case SchemaPackage.TYPE_GROUPEMENT__GD_HDEBUT_ACTIVATION:
				return GD_HDEBUT_ACTIVATION_EDEFAULT == null ? gDHdebutActivation != null : !GD_HDEBUT_ACTIVATION_EDEFAULT.equals(gDHdebutActivation);
			case SchemaPackage.TYPE_GROUPEMENT__GD_HFIN_ACTIVATION:
				return GD_HFIN_ACTIVATION_EDEFAULT == null ? gDHfinActivation != null : !GD_HFIN_ACTIVATION_EDEFAULT.equals(gDHfinActivation);
			case SchemaPackage.TYPE_GROUPEMENT__NOM_ET_RANG_AUTORITE_RESPONSABLE:
				return NOM_ET_RANG_AUTORITE_RESPONSABLE_EDEFAULT == null ? nomEtRangAutoriteResponsable != null : !NOM_ET_RANG_AUTORITE_RESPONSABLE_EDEFAULT.equals(nomEtRangAutoriteResponsable);
			case SchemaPackage.TYPE_GROUPEMENT__COMMENTAIRE:
				return COMMENTAIRE_EDEFAULT == null ? commentaire != null : !COMMENTAIRE_EDEFAULT.equals(commentaire);
			case SchemaPackage.TYPE_GROUPEMENT__EST_SPECIFIE_POUR_ARTICULATION_TERRE:
				return estSpecifiePourArticulationTerre != null;
			case SchemaPackage.TYPE_GROUPEMENT__EST_CONSTITUE_UNITE:
				return estConstitueUnite != null && !estConstitueUnite.isEmpty();
			case SchemaPackage.TYPE_GROUPEMENT__APOUR_RESPONSABLE_UNITE:
				return aPourResponsableUnite != null;
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
		result.append(" (degreCentralisationASS: ");
		if (degreCentralisationASSESet) result.append(degreCentralisationASS); else result.append("<unset>");
		result.append(", fonctionAutoriteResponsable: ");
		result.append(fonctionAutoriteResponsable);
		result.append(", gDHdebutActivation: ");
		result.append(gDHdebutActivation);
		result.append(", gDHfinActivation: ");
		result.append(gDHfinActivation);
		result.append(", nomEtRangAutoriteResponsable: ");
		result.append(nomEtRangAutoriteResponsable);
		result.append(", commentaire: ");
		result.append(commentaire);
		result.append(')');
		return result.toString();
	}

} //TypeGroupementImpl
