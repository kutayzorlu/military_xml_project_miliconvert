/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeLongueur;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoEmploiMaritimeInstructionsPassage;
import mpia.schema.TypeDictionaryDicoEmploiMaritimeProcedureAirMerCoordonnee;
import mpia.schema.TypeEmploiMaritime;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Emploi Maritime</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEmploiMaritimeImpl#getProcedureAirMerCoordonnee <em>Procedure Air Mer Coordonnee</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEmploiMaritimeImpl#getNombrePassagesRequis <em>Nombre Passages Requis</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEmploiMaritimeImpl#getLargeurCouloirMiseEnMarche <em>Largeur Couloir Mise En Marche</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEmploiMaritimeImpl#getInstructionsPassage <em>Instructions Passage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEmploiMaritimeImpl#getVitessePassageRecommandee <em>Vitesse Passage Recommandee</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEmploiMaritimeImpl#getDistanceEntreBatiments <em>Distance Entre Batiments</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEmploiMaritimeImpl#getDistanceEntreGroupes <em>Distance Entre Groupes</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEmploiMaritimeImpl#getNomBatimentPrincipal <em>Nom Batiment Principal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeEmploiMaritimeImpl extends TypeEmploiRessourceActiviteImpl implements TypeEmploiMaritime {
	/**
	 * The default value of the '{@link #getProcedureAirMerCoordonnee() <em>Procedure Air Mer Coordonnee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureAirMerCoordonnee()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEmploiMaritimeProcedureAirMerCoordonnee PROCEDURE_AIR_MER_COORDONNEE_EDEFAULT = TypeDictionaryDicoEmploiMaritimeProcedureAirMerCoordonnee.CASP1;

	/**
	 * The cached value of the '{@link #getProcedureAirMerCoordonnee() <em>Procedure Air Mer Coordonnee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureAirMerCoordonnee()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEmploiMaritimeProcedureAirMerCoordonnee procedureAirMerCoordonnee = PROCEDURE_AIR_MER_COORDONNEE_EDEFAULT;

	/**
	 * This is true if the Procedure Air Mer Coordonnee attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean procedureAirMerCoordonneeESet;

	/**
	 * The default value of the '{@link #getNombrePassagesRequis() <em>Nombre Passages Requis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombrePassagesRequis()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_PASSAGES_REQUIS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombrePassagesRequis() <em>Nombre Passages Requis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombrePassagesRequis()
	 * @generated
	 * @ordered
	 */
	protected long nombrePassagesRequis = NOMBRE_PASSAGES_REQUIS_EDEFAULT;

	/**
	 * This is true if the Nombre Passages Requis attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombrePassagesRequisESet;

	/**
	 * The cached value of the '{@link #getLargeurCouloirMiseEnMarche() <em>Largeur Couloir Mise En Marche</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargeurCouloirMiseEnMarche()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur largeurCouloirMiseEnMarche;

	/**
	 * The default value of the '{@link #getInstructionsPassage() <em>Instructions Passage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructionsPassage()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEmploiMaritimeInstructionsPassage INSTRUCTIONS_PASSAGE_EDEFAULT = TypeDictionaryDicoEmploiMaritimeInstructionsPassage.LEAD;

	/**
	 * The cached value of the '{@link #getInstructionsPassage() <em>Instructions Passage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructionsPassage()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEmploiMaritimeInstructionsPassage instructionsPassage = INSTRUCTIONS_PASSAGE_EDEFAULT;

	/**
	 * This is true if the Instructions Passage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean instructionsPassageESet;

	/**
	 * The default value of the '{@link #getVitessePassageRecommandee() <em>Vitesse Passage Recommandee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitessePassageRecommandee()
	 * @generated
	 * @ordered
	 */
	protected static final double VITESSE_PASSAGE_RECOMMANDEE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVitessePassageRecommandee() <em>Vitesse Passage Recommandee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitessePassageRecommandee()
	 * @generated
	 * @ordered
	 */
	protected double vitessePassageRecommandee = VITESSE_PASSAGE_RECOMMANDEE_EDEFAULT;

	/**
	 * This is true if the Vitesse Passage Recommandee attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean vitessePassageRecommandeeESet;

	/**
	 * The cached value of the '{@link #getDistanceEntreBatiments() <em>Distance Entre Batiments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceEntreBatiments()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur distanceEntreBatiments;

	/**
	 * The cached value of the '{@link #getDistanceEntreGroupes() <em>Distance Entre Groupes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceEntreGroupes()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur distanceEntreGroupes;

	/**
	 * The default value of the '{@link #getNomBatimentPrincipal() <em>Nom Batiment Principal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomBatimentPrincipal()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_BATIMENT_PRINCIPAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomBatimentPrincipal() <em>Nom Batiment Principal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomBatimentPrincipal()
	 * @generated
	 * @ordered
	 */
	protected String nomBatimentPrincipal = NOM_BATIMENT_PRINCIPAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeEmploiMaritimeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEmploiMaritime();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEmploiMaritimeProcedureAirMerCoordonnee getProcedureAirMerCoordonnee() {
		return procedureAirMerCoordonnee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcedureAirMerCoordonnee(TypeDictionaryDicoEmploiMaritimeProcedureAirMerCoordonnee newProcedureAirMerCoordonnee) {
		TypeDictionaryDicoEmploiMaritimeProcedureAirMerCoordonnee oldProcedureAirMerCoordonnee = procedureAirMerCoordonnee;
		procedureAirMerCoordonnee = newProcedureAirMerCoordonnee == null ? PROCEDURE_AIR_MER_COORDONNEE_EDEFAULT : newProcedureAirMerCoordonnee;
		boolean oldProcedureAirMerCoordonneeESet = procedureAirMerCoordonneeESet;
		procedureAirMerCoordonneeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EMPLOI_MARITIME__PROCEDURE_AIR_MER_COORDONNEE, oldProcedureAirMerCoordonnee, procedureAirMerCoordonnee, !oldProcedureAirMerCoordonneeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProcedureAirMerCoordonnee() {
		TypeDictionaryDicoEmploiMaritimeProcedureAirMerCoordonnee oldProcedureAirMerCoordonnee = procedureAirMerCoordonnee;
		boolean oldProcedureAirMerCoordonneeESet = procedureAirMerCoordonneeESet;
		procedureAirMerCoordonnee = PROCEDURE_AIR_MER_COORDONNEE_EDEFAULT;
		procedureAirMerCoordonneeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EMPLOI_MARITIME__PROCEDURE_AIR_MER_COORDONNEE, oldProcedureAirMerCoordonnee, PROCEDURE_AIR_MER_COORDONNEE_EDEFAULT, oldProcedureAirMerCoordonneeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProcedureAirMerCoordonnee() {
		return procedureAirMerCoordonneeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombrePassagesRequis() {
		return nombrePassagesRequis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombrePassagesRequis(long newNombrePassagesRequis) {
		long oldNombrePassagesRequis = nombrePassagesRequis;
		nombrePassagesRequis = newNombrePassagesRequis;
		boolean oldNombrePassagesRequisESet = nombrePassagesRequisESet;
		nombrePassagesRequisESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EMPLOI_MARITIME__NOMBRE_PASSAGES_REQUIS, oldNombrePassagesRequis, nombrePassagesRequis, !oldNombrePassagesRequisESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombrePassagesRequis() {
		long oldNombrePassagesRequis = nombrePassagesRequis;
		boolean oldNombrePassagesRequisESet = nombrePassagesRequisESet;
		nombrePassagesRequis = NOMBRE_PASSAGES_REQUIS_EDEFAULT;
		nombrePassagesRequisESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EMPLOI_MARITIME__NOMBRE_PASSAGES_REQUIS, oldNombrePassagesRequis, NOMBRE_PASSAGES_REQUIS_EDEFAULT, oldNombrePassagesRequisESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombrePassagesRequis() {
		return nombrePassagesRequisESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getLargeurCouloirMiseEnMarche() {
		return largeurCouloirMiseEnMarche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLargeurCouloirMiseEnMarche(TypeDataTypeLongueur newLargeurCouloirMiseEnMarche, NotificationChain msgs) {
		TypeDataTypeLongueur oldLargeurCouloirMiseEnMarche = largeurCouloirMiseEnMarche;
		largeurCouloirMiseEnMarche = newLargeurCouloirMiseEnMarche;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EMPLOI_MARITIME__LARGEUR_COULOIR_MISE_EN_MARCHE, oldLargeurCouloirMiseEnMarche, newLargeurCouloirMiseEnMarche);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLargeurCouloirMiseEnMarche(TypeDataTypeLongueur newLargeurCouloirMiseEnMarche) {
		if (newLargeurCouloirMiseEnMarche != largeurCouloirMiseEnMarche) {
			NotificationChain msgs = null;
			if (largeurCouloirMiseEnMarche != null)
				msgs = ((InternalEObject)largeurCouloirMiseEnMarche).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EMPLOI_MARITIME__LARGEUR_COULOIR_MISE_EN_MARCHE, null, msgs);
			if (newLargeurCouloirMiseEnMarche != null)
				msgs = ((InternalEObject)newLargeurCouloirMiseEnMarche).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EMPLOI_MARITIME__LARGEUR_COULOIR_MISE_EN_MARCHE, null, msgs);
			msgs = basicSetLargeurCouloirMiseEnMarche(newLargeurCouloirMiseEnMarche, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EMPLOI_MARITIME__LARGEUR_COULOIR_MISE_EN_MARCHE, newLargeurCouloirMiseEnMarche, newLargeurCouloirMiseEnMarche));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEmploiMaritimeInstructionsPassage getInstructionsPassage() {
		return instructionsPassage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstructionsPassage(TypeDictionaryDicoEmploiMaritimeInstructionsPassage newInstructionsPassage) {
		TypeDictionaryDicoEmploiMaritimeInstructionsPassage oldInstructionsPassage = instructionsPassage;
		instructionsPassage = newInstructionsPassage == null ? INSTRUCTIONS_PASSAGE_EDEFAULT : newInstructionsPassage;
		boolean oldInstructionsPassageESet = instructionsPassageESet;
		instructionsPassageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EMPLOI_MARITIME__INSTRUCTIONS_PASSAGE, oldInstructionsPassage, instructionsPassage, !oldInstructionsPassageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInstructionsPassage() {
		TypeDictionaryDicoEmploiMaritimeInstructionsPassage oldInstructionsPassage = instructionsPassage;
		boolean oldInstructionsPassageESet = instructionsPassageESet;
		instructionsPassage = INSTRUCTIONS_PASSAGE_EDEFAULT;
		instructionsPassageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EMPLOI_MARITIME__INSTRUCTIONS_PASSAGE, oldInstructionsPassage, INSTRUCTIONS_PASSAGE_EDEFAULT, oldInstructionsPassageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInstructionsPassage() {
		return instructionsPassageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVitessePassageRecommandee() {
		return vitessePassageRecommandee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVitessePassageRecommandee(double newVitessePassageRecommandee) {
		double oldVitessePassageRecommandee = vitessePassageRecommandee;
		vitessePassageRecommandee = newVitessePassageRecommandee;
		boolean oldVitessePassageRecommandeeESet = vitessePassageRecommandeeESet;
		vitessePassageRecommandeeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EMPLOI_MARITIME__VITESSE_PASSAGE_RECOMMANDEE, oldVitessePassageRecommandee, vitessePassageRecommandee, !oldVitessePassageRecommandeeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVitessePassageRecommandee() {
		double oldVitessePassageRecommandee = vitessePassageRecommandee;
		boolean oldVitessePassageRecommandeeESet = vitessePassageRecommandeeESet;
		vitessePassageRecommandee = VITESSE_PASSAGE_RECOMMANDEE_EDEFAULT;
		vitessePassageRecommandeeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EMPLOI_MARITIME__VITESSE_PASSAGE_RECOMMANDEE, oldVitessePassageRecommandee, VITESSE_PASSAGE_RECOMMANDEE_EDEFAULT, oldVitessePassageRecommandeeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVitessePassageRecommandee() {
		return vitessePassageRecommandeeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getDistanceEntreBatiments() {
		return distanceEntreBatiments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDistanceEntreBatiments(TypeDataTypeLongueur newDistanceEntreBatiments, NotificationChain msgs) {
		TypeDataTypeLongueur oldDistanceEntreBatiments = distanceEntreBatiments;
		distanceEntreBatiments = newDistanceEntreBatiments;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EMPLOI_MARITIME__DISTANCE_ENTRE_BATIMENTS, oldDistanceEntreBatiments, newDistanceEntreBatiments);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistanceEntreBatiments(TypeDataTypeLongueur newDistanceEntreBatiments) {
		if (newDistanceEntreBatiments != distanceEntreBatiments) {
			NotificationChain msgs = null;
			if (distanceEntreBatiments != null)
				msgs = ((InternalEObject)distanceEntreBatiments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EMPLOI_MARITIME__DISTANCE_ENTRE_BATIMENTS, null, msgs);
			if (newDistanceEntreBatiments != null)
				msgs = ((InternalEObject)newDistanceEntreBatiments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EMPLOI_MARITIME__DISTANCE_ENTRE_BATIMENTS, null, msgs);
			msgs = basicSetDistanceEntreBatiments(newDistanceEntreBatiments, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EMPLOI_MARITIME__DISTANCE_ENTRE_BATIMENTS, newDistanceEntreBatiments, newDistanceEntreBatiments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getDistanceEntreGroupes() {
		return distanceEntreGroupes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDistanceEntreGroupes(TypeDataTypeLongueur newDistanceEntreGroupes, NotificationChain msgs) {
		TypeDataTypeLongueur oldDistanceEntreGroupes = distanceEntreGroupes;
		distanceEntreGroupes = newDistanceEntreGroupes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EMPLOI_MARITIME__DISTANCE_ENTRE_GROUPES, oldDistanceEntreGroupes, newDistanceEntreGroupes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistanceEntreGroupes(TypeDataTypeLongueur newDistanceEntreGroupes) {
		if (newDistanceEntreGroupes != distanceEntreGroupes) {
			NotificationChain msgs = null;
			if (distanceEntreGroupes != null)
				msgs = ((InternalEObject)distanceEntreGroupes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EMPLOI_MARITIME__DISTANCE_ENTRE_GROUPES, null, msgs);
			if (newDistanceEntreGroupes != null)
				msgs = ((InternalEObject)newDistanceEntreGroupes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EMPLOI_MARITIME__DISTANCE_ENTRE_GROUPES, null, msgs);
			msgs = basicSetDistanceEntreGroupes(newDistanceEntreGroupes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EMPLOI_MARITIME__DISTANCE_ENTRE_GROUPES, newDistanceEntreGroupes, newDistanceEntreGroupes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNomBatimentPrincipal() {
		return nomBatimentPrincipal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomBatimentPrincipal(String newNomBatimentPrincipal) {
		String oldNomBatimentPrincipal = nomBatimentPrincipal;
		nomBatimentPrincipal = newNomBatimentPrincipal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EMPLOI_MARITIME__NOM_BATIMENT_PRINCIPAL, oldNomBatimentPrincipal, nomBatimentPrincipal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_EMPLOI_MARITIME__LARGEUR_COULOIR_MISE_EN_MARCHE:
				return basicSetLargeurCouloirMiseEnMarche(null, msgs);
			case SchemaPackage.TYPE_EMPLOI_MARITIME__DISTANCE_ENTRE_BATIMENTS:
				return basicSetDistanceEntreBatiments(null, msgs);
			case SchemaPackage.TYPE_EMPLOI_MARITIME__DISTANCE_ENTRE_GROUPES:
				return basicSetDistanceEntreGroupes(null, msgs);
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
			case SchemaPackage.TYPE_EMPLOI_MARITIME__PROCEDURE_AIR_MER_COORDONNEE:
				return getProcedureAirMerCoordonnee();
			case SchemaPackage.TYPE_EMPLOI_MARITIME__NOMBRE_PASSAGES_REQUIS:
				return new Long(getNombrePassagesRequis());
			case SchemaPackage.TYPE_EMPLOI_MARITIME__LARGEUR_COULOIR_MISE_EN_MARCHE:
				return getLargeurCouloirMiseEnMarche();
			case SchemaPackage.TYPE_EMPLOI_MARITIME__INSTRUCTIONS_PASSAGE:
				return getInstructionsPassage();
			case SchemaPackage.TYPE_EMPLOI_MARITIME__VITESSE_PASSAGE_RECOMMANDEE:
				return new Double(getVitessePassageRecommandee());
			case SchemaPackage.TYPE_EMPLOI_MARITIME__DISTANCE_ENTRE_BATIMENTS:
				return getDistanceEntreBatiments();
			case SchemaPackage.TYPE_EMPLOI_MARITIME__DISTANCE_ENTRE_GROUPES:
				return getDistanceEntreGroupes();
			case SchemaPackage.TYPE_EMPLOI_MARITIME__NOM_BATIMENT_PRINCIPAL:
				return getNomBatimentPrincipal();
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
			case SchemaPackage.TYPE_EMPLOI_MARITIME__PROCEDURE_AIR_MER_COORDONNEE:
				setProcedureAirMerCoordonnee((TypeDictionaryDicoEmploiMaritimeProcedureAirMerCoordonnee)newValue);
				return;
			case SchemaPackage.TYPE_EMPLOI_MARITIME__NOMBRE_PASSAGES_REQUIS:
				setNombrePassagesRequis(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_EMPLOI_MARITIME__LARGEUR_COULOIR_MISE_EN_MARCHE:
				setLargeurCouloirMiseEnMarche((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_EMPLOI_MARITIME__INSTRUCTIONS_PASSAGE:
				setInstructionsPassage((TypeDictionaryDicoEmploiMaritimeInstructionsPassage)newValue);
				return;
			case SchemaPackage.TYPE_EMPLOI_MARITIME__VITESSE_PASSAGE_RECOMMANDEE:
				setVitessePassageRecommandee(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_EMPLOI_MARITIME__DISTANCE_ENTRE_BATIMENTS:
				setDistanceEntreBatiments((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_EMPLOI_MARITIME__DISTANCE_ENTRE_GROUPES:
				setDistanceEntreGroupes((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_EMPLOI_MARITIME__NOM_BATIMENT_PRINCIPAL:
				setNomBatimentPrincipal((String)newValue);
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
			case SchemaPackage.TYPE_EMPLOI_MARITIME__PROCEDURE_AIR_MER_COORDONNEE:
				unsetProcedureAirMerCoordonnee();
				return;
			case SchemaPackage.TYPE_EMPLOI_MARITIME__NOMBRE_PASSAGES_REQUIS:
				unsetNombrePassagesRequis();
				return;
			case SchemaPackage.TYPE_EMPLOI_MARITIME__LARGEUR_COULOIR_MISE_EN_MARCHE:
				setLargeurCouloirMiseEnMarche((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_EMPLOI_MARITIME__INSTRUCTIONS_PASSAGE:
				unsetInstructionsPassage();
				return;
			case SchemaPackage.TYPE_EMPLOI_MARITIME__VITESSE_PASSAGE_RECOMMANDEE:
				unsetVitessePassageRecommandee();
				return;
			case SchemaPackage.TYPE_EMPLOI_MARITIME__DISTANCE_ENTRE_BATIMENTS:
				setDistanceEntreBatiments((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_EMPLOI_MARITIME__DISTANCE_ENTRE_GROUPES:
				setDistanceEntreGroupes((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_EMPLOI_MARITIME__NOM_BATIMENT_PRINCIPAL:
				setNomBatimentPrincipal(NOM_BATIMENT_PRINCIPAL_EDEFAULT);
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
			case SchemaPackage.TYPE_EMPLOI_MARITIME__PROCEDURE_AIR_MER_COORDONNEE:
				return isSetProcedureAirMerCoordonnee();
			case SchemaPackage.TYPE_EMPLOI_MARITIME__NOMBRE_PASSAGES_REQUIS:
				return isSetNombrePassagesRequis();
			case SchemaPackage.TYPE_EMPLOI_MARITIME__LARGEUR_COULOIR_MISE_EN_MARCHE:
				return largeurCouloirMiseEnMarche != null;
			case SchemaPackage.TYPE_EMPLOI_MARITIME__INSTRUCTIONS_PASSAGE:
				return isSetInstructionsPassage();
			case SchemaPackage.TYPE_EMPLOI_MARITIME__VITESSE_PASSAGE_RECOMMANDEE:
				return isSetVitessePassageRecommandee();
			case SchemaPackage.TYPE_EMPLOI_MARITIME__DISTANCE_ENTRE_BATIMENTS:
				return distanceEntreBatiments != null;
			case SchemaPackage.TYPE_EMPLOI_MARITIME__DISTANCE_ENTRE_GROUPES:
				return distanceEntreGroupes != null;
			case SchemaPackage.TYPE_EMPLOI_MARITIME__NOM_BATIMENT_PRINCIPAL:
				return NOM_BATIMENT_PRINCIPAL_EDEFAULT == null ? nomBatimentPrincipal != null : !NOM_BATIMENT_PRINCIPAL_EDEFAULT.equals(nomBatimentPrincipal);
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
		result.append(" (procedureAirMerCoordonnee: ");
		if (procedureAirMerCoordonneeESet) result.append(procedureAirMerCoordonnee); else result.append("<unset>");
		result.append(", nombrePassagesRequis: ");
		if (nombrePassagesRequisESet) result.append(nombrePassagesRequis); else result.append("<unset>");
		result.append(", instructionsPassage: ");
		if (instructionsPassageESet) result.append(instructionsPassage); else result.append("<unset>");
		result.append(", vitessePassageRecommandee: ");
		if (vitessePassageRecommandeeESet) result.append(vitessePassageRecommandee); else result.append("<unset>");
		result.append(", nomBatimentPrincipal: ");
		result.append(nomBatimentPrincipal);
		result.append(')');
		return result.toString();
	}

} //TypeEmploiMaritimeImpl
