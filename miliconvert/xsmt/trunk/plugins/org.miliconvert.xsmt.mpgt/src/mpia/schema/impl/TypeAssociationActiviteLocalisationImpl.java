/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeAngle;
import mpia.meta.TypeDataTypeVitesseLineaire;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationActiviteLocalisation;
import mpia.schema.TypeDictionaryDicoAssociationActiviteLocalisationCategorie;
import mpia.schema.TypeLocalisation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Activite Localisation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationActiviteLocalisationImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationActiviteLocalisationImpl#getNomBapteme <em>Nom Bapteme</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationActiviteLocalisationImpl#getAngleMouvement <em>Angle Mouvement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationActiviteLocalisationImpl#getNbAxeActivite <em>Nb Axe Activite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationActiviteLocalisationImpl#getVitesse <em>Vitesse</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationActiviteLocalisationImpl#getIncertitude <em>Incertitude</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationActiviteLocalisationImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationActiviteLocalisationImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationActiviteLocalisationImpl#getAssocieCommeObjetLocalisation <em>Associe Comme Objet Localisation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationActiviteLocalisationImpl#getEstRapporteeParRapport <em>Est Rapportee Par Rapport</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationActiviteLocalisationImpl extends EObjectImpl implements TypeAssociationActiviteLocalisation {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAssociationActiviteLocalisationCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAssociationActiviteLocalisationCategorie.SHAPE;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssociationActiviteLocalisationCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The default value of the '{@link #getNomBapteme() <em>Nom Bapteme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomBapteme()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_BAPTEME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomBapteme() <em>Nom Bapteme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomBapteme()
	 * @generated
	 * @ordered
	 */
	protected String nomBapteme = NOM_BAPTEME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAngleMouvement() <em>Angle Mouvement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleMouvement()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeAngle angleMouvement;

	/**
	 * The default value of the '{@link #getNbAxeActivite() <em>Nb Axe Activite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbAxeActivite()
	 * @generated
	 * @ordered
	 */
	protected static final long NB_AXE_ACTIVITE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNbAxeActivite() <em>Nb Axe Activite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbAxeActivite()
	 * @generated
	 * @ordered
	 */
	protected long nbAxeActivite = NB_AXE_ACTIVITE_EDEFAULT;

	/**
	 * This is true if the Nb Axe Activite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nbAxeActiviteESet;

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
	 * The default value of the '{@link #getIncertitude() <em>Incertitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncertitude()
	 * @generated
	 * @ordered
	 */
	protected static final double INCERTITUDE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getIncertitude() <em>Incertitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncertitude()
	 * @generated
	 * @ordered
	 */
	protected double incertitude = INCERTITUDE_EDEFAULT;

	/**
	 * This is true if the Incertitude attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean incertitudeESet;

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
	 * The cached value of the '{@link #getAssocieCommeObjetLocalisation() <em>Associe Comme Objet Localisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeObjetLocalisation()
	 * @generated
	 * @ordered
	 */
	protected TypeLocalisation associeCommeObjetLocalisation;

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
	protected TypeAssociationActiviteLocalisationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationActiviteLocalisation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAssociationActiviteLocalisationCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAssociationActiviteLocalisationCategorie newCategorie) {
		TypeDictionaryDicoAssociationActiviteLocalisationCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAssociationActiviteLocalisationCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public String getNomBapteme() {
		return nomBapteme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomBapteme(String newNomBapteme) {
		String oldNomBapteme = nomBapteme;
		nomBapteme = newNomBapteme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__NOM_BAPTEME, oldNomBapteme, nomBapteme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeAngle getAngleMouvement() {
		return angleMouvement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngleMouvement(TypeDataTypeAngle newAngleMouvement, NotificationChain msgs) {
		TypeDataTypeAngle oldAngleMouvement = angleMouvement;
		angleMouvement = newAngleMouvement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__ANGLE_MOUVEMENT, oldAngleMouvement, newAngleMouvement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngleMouvement(TypeDataTypeAngle newAngleMouvement) {
		if (newAngleMouvement != angleMouvement) {
			NotificationChain msgs = null;
			if (angleMouvement != null)
				msgs = ((InternalEObject)angleMouvement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__ANGLE_MOUVEMENT, null, msgs);
			if (newAngleMouvement != null)
				msgs = ((InternalEObject)newAngleMouvement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__ANGLE_MOUVEMENT, null, msgs);
			msgs = basicSetAngleMouvement(newAngleMouvement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__ANGLE_MOUVEMENT, newAngleMouvement, newAngleMouvement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNbAxeActivite() {
		return nbAxeActivite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbAxeActivite(long newNbAxeActivite) {
		long oldNbAxeActivite = nbAxeActivite;
		nbAxeActivite = newNbAxeActivite;
		boolean oldNbAxeActiviteESet = nbAxeActiviteESet;
		nbAxeActiviteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__NB_AXE_ACTIVITE, oldNbAxeActivite, nbAxeActivite, !oldNbAxeActiviteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNbAxeActivite() {
		long oldNbAxeActivite = nbAxeActivite;
		boolean oldNbAxeActiviteESet = nbAxeActiviteESet;
		nbAxeActivite = NB_AXE_ACTIVITE_EDEFAULT;
		nbAxeActiviteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__NB_AXE_ACTIVITE, oldNbAxeActivite, NB_AXE_ACTIVITE_EDEFAULT, oldNbAxeActiviteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNbAxeActivite() {
		return nbAxeActiviteESet;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__VITESSE, oldVitesse, newVitesse);
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
				msgs = ((InternalEObject)vitesse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__VITESSE, null, msgs);
			if (newVitesse != null)
				msgs = ((InternalEObject)newVitesse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__VITESSE, null, msgs);
			msgs = basicSetVitesse(newVitesse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__VITESSE, newVitesse, newVitesse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getIncertitude() {
		return incertitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncertitude(double newIncertitude) {
		double oldIncertitude = incertitude;
		incertitude = newIncertitude;
		boolean oldIncertitudeESet = incertitudeESet;
		incertitudeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__INCERTITUDE, oldIncertitude, incertitude, !oldIncertitudeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIncertitude() {
		double oldIncertitude = incertitude;
		boolean oldIncertitudeESet = incertitudeESet;
		incertitude = INCERTITUDE_EDEFAULT;
		incertitudeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__INCERTITUDE, oldIncertitude, INCERTITUDE_EDEFAULT, oldIncertitudeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIncertitude() {
		return incertitudeESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeLocalisation getAssocieCommeObjetLocalisation() {
		return associeCommeObjetLocalisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeObjetLocalisation(TypeLocalisation newAssocieCommeObjetLocalisation, NotificationChain msgs) {
		TypeLocalisation oldAssocieCommeObjetLocalisation = associeCommeObjetLocalisation;
		associeCommeObjetLocalisation = newAssocieCommeObjetLocalisation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__ASSOCIE_COMME_OBJET_LOCALISATION, oldAssocieCommeObjetLocalisation, newAssocieCommeObjetLocalisation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeObjetLocalisation(TypeLocalisation newAssocieCommeObjetLocalisation) {
		if (newAssocieCommeObjetLocalisation != associeCommeObjetLocalisation) {
			NotificationChain msgs = null;
			if (associeCommeObjetLocalisation != null)
				msgs = ((InternalEObject)associeCommeObjetLocalisation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__ASSOCIE_COMME_OBJET_LOCALISATION, null, msgs);
			if (newAssocieCommeObjetLocalisation != null)
				msgs = ((InternalEObject)newAssocieCommeObjetLocalisation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__ASSOCIE_COMME_OBJET_LOCALISATION, null, msgs);
			msgs = basicSetAssocieCommeObjetLocalisation(newAssocieCommeObjetLocalisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__ASSOCIE_COMME_OBJET_LOCALISATION, newAssocieCommeObjetLocalisation, newAssocieCommeObjetLocalisation));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__EST_RAPPORTEE_PAR_RAPPORT, oldEstRapporteeParRapport, newEstRapporteeParRapport);
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
				msgs = ((InternalEObject)estRapporteeParRapport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__EST_RAPPORTEE_PAR_RAPPORT, null, msgs);
			if (newEstRapporteeParRapport != null)
				msgs = ((InternalEObject)newEstRapporteeParRapport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__EST_RAPPORTEE_PAR_RAPPORT, null, msgs);
			msgs = basicSetEstRapporteeParRapport(newEstRapporteeParRapport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__EST_RAPPORTEE_PAR_RAPPORT, newEstRapporteeParRapport, newEstRapporteeParRapport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__ANGLE_MOUVEMENT:
				return basicSetAngleMouvement(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__VITESSE:
				return basicSetVitesse(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__ASSOCIE_COMME_OBJET_LOCALISATION:
				return basicSetAssocieCommeObjetLocalisation(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__EST_RAPPORTEE_PAR_RAPPORT:
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
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__NOM_BAPTEME:
				return getNomBapteme();
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__ANGLE_MOUVEMENT:
				return getAngleMouvement();
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__NB_AXE_ACTIVITE:
				return new Long(getNbAxeActivite());
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__VITESSE:
				return getVitesse();
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__INCERTITUDE:
				return new Double(getIncertitude());
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__CE:
				return getCE();
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__ASSOCIE_COMME_OBJET_LOCALISATION:
				return getAssocieCommeObjetLocalisation();
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__EST_RAPPORTEE_PAR_RAPPORT:
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
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationActiviteLocalisationCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__NOM_BAPTEME:
				setNomBapteme((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__ANGLE_MOUVEMENT:
				setAngleMouvement((TypeDataTypeAngle)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__NB_AXE_ACTIVITE:
				setNbAxeActivite(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__VITESSE:
				setVitesse((TypeDataTypeVitesseLineaire)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__INCERTITUDE:
				setIncertitude(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__ASSOCIE_COMME_OBJET_LOCALISATION:
				setAssocieCommeObjetLocalisation((TypeLocalisation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__EST_RAPPORTEE_PAR_RAPPORT:
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
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__NOM_BAPTEME:
				setNomBapteme(NOM_BAPTEME_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__ANGLE_MOUVEMENT:
				setAngleMouvement((TypeDataTypeAngle)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__NB_AXE_ACTIVITE:
				unsetNbAxeActivite();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__VITESSE:
				setVitesse((TypeDataTypeVitesseLineaire)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__INCERTITUDE:
				unsetIncertitude();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__ASSOCIE_COMME_OBJET_LOCALISATION:
				setAssocieCommeObjetLocalisation((TypeLocalisation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__EST_RAPPORTEE_PAR_RAPPORT:
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
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__NOM_BAPTEME:
				return NOM_BAPTEME_EDEFAULT == null ? nomBapteme != null : !NOM_BAPTEME_EDEFAULT.equals(nomBapteme);
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__ANGLE_MOUVEMENT:
				return angleMouvement != null;
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__NB_AXE_ACTIVITE:
				return isSetNbAxeActivite();
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__VITESSE:
				return vitesse != null;
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__INCERTITUDE:
				return isSetIncertitude();
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__ASSOCIE_COMME_OBJET_LOCALISATION:
				return associeCommeObjetLocalisation != null;
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_LOCALISATION__EST_RAPPORTEE_PAR_RAPPORT:
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
		result.append(" (categorie: ");
		if (categorieESet) result.append(categorie); else result.append("<unset>");
		result.append(", nomBapteme: ");
		result.append(nomBapteme);
		result.append(", nbAxeActivite: ");
		if (nbAxeActiviteESet) result.append(nbAxeActivite); else result.append("<unset>");
		result.append(", incertitude: ");
		if (incertitudeESet) result.append(incertitude); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeAssociationActiviteLocalisationImpl
