/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeDuree;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDisponibilitePourPlanFeux;
import mpia.schema.TypePolitiqueTir;
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
 * An implementation of the model object '<em><b>Type Politique Tir</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypePolitiqueTirImpl#getConsommationMaximaleParTir <em>Consommation Maximale Par Tir</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePolitiqueTirImpl#getCoefficientPonderation <em>Coefficient Ponderation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePolitiqueTirImpl#getDelaiMaximumDeclenchementTirPlanifie <em>Delai Maximum Declenchement Tir Planifie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePolitiqueTirImpl#getDelaiRefusTirOpportunite <em>Delai Refus Tir Opportunite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePolitiqueTirImpl#getOrdresPourMunitionsParticulieres <em>Ordres Pour Munitions Particulieres</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePolitiqueTirImpl#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePolitiqueTirImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePolitiqueTirImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePolitiqueTirImpl#getDefinitInterventionType <em>Definit Intervention Type</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePolitiqueTirImpl#getLimiteUsageParTirMunitionsRaresAVolumeMunitionsASS <em>Limite Usage Par Tir Munitions Rares AVolume Munitions ASS</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePolitiqueTirImpl#getConcernePlanFeux <em>Concerne Plan Feux</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePolitiqueTirImpl#getPrevoitPourTirsPlanifiesDisponibilitePourPlanFeux <em>Prevoit Pour Tirs Planifies Disponibilite Pour Plan Feux</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypePolitiqueTirImpl extends EObjectImpl implements TypePolitiqueTir {
	/**
	 * The default value of the '{@link #getConsommationMaximaleParTir() <em>Consommation Maximale Par Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsommationMaximaleParTir()
	 * @generated
	 * @ordered
	 */
	protected static final long CONSOMMATION_MAXIMALE_PAR_TIR_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getConsommationMaximaleParTir() <em>Consommation Maximale Par Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsommationMaximaleParTir()
	 * @generated
	 * @ordered
	 */
	protected long consommationMaximaleParTir = CONSOMMATION_MAXIMALE_PAR_TIR_EDEFAULT;

	/**
	 * This is true if the Consommation Maximale Par Tir attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean consommationMaximaleParTirESet;

	/**
	 * The default value of the '{@link #getCoefficientPonderation() <em>Coefficient Ponderation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoefficientPonderation()
	 * @generated
	 * @ordered
	 */
	protected static final double COEFFICIENT_PONDERATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCoefficientPonderation() <em>Coefficient Ponderation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoefficientPonderation()
	 * @generated
	 * @ordered
	 */
	protected double coefficientPonderation = COEFFICIENT_PONDERATION_EDEFAULT;

	/**
	 * This is true if the Coefficient Ponderation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean coefficientPonderationESet;

	/**
	 * The cached value of the '{@link #getDelaiMaximumDeclenchementTirPlanifie() <em>Delai Maximum Declenchement Tir Planifie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelaiMaximumDeclenchementTirPlanifie()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree delaiMaximumDeclenchementTirPlanifie;

	/**
	 * The cached value of the '{@link #getDelaiRefusTirOpportunite() <em>Delai Refus Tir Opportunite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelaiRefusTirOpportunite()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree delaiRefusTirOpportunite;

	/**
	 * The default value of the '{@link #getOrdresPourMunitionsParticulieres() <em>Ordres Pour Munitions Particulieres</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdresPourMunitionsParticulieres()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDRES_POUR_MUNITIONS_PARTICULIERES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrdresPourMunitionsParticulieres() <em>Ordres Pour Munitions Particulieres</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdresPourMunitionsParticulieres()
	 * @generated
	 * @ordered
	 */
	protected String ordresPourMunitionsParticulieres = ORDRES_POUR_MUNITIONS_PARTICULIERES_EDEFAULT;

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
	 * The cached value of the '{@link #getDefinitInterventionType() <em>Definit Intervention Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitInterventionType()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> definitInterventionType;

	/**
	 * The cached value of the '{@link #getLimiteUsageParTirMunitionsRaresAVolumeMunitionsASS() <em>Limite Usage Par Tir Munitions Rares AVolume Munitions ASS</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimiteUsageParTirMunitionsRaresAVolumeMunitionsASS()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeVolumeMunitionsASS> limiteUsageParTirMunitionsRaresAVolumeMunitionsASS;

	/**
	 * The cached value of the '{@link #getConcernePlanFeux() <em>Concerne Plan Feux</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcernePlanFeux()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation concernePlanFeux;

	/**
	 * The cached value of the '{@link #getPrevoitPourTirsPlanifiesDisponibilitePourPlanFeux() <em>Prevoit Pour Tirs Planifies Disponibilite Pour Plan Feux</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevoitPourTirsPlanifiesDisponibilitePourPlanFeux()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeDisponibilitePourPlanFeux> prevoitPourTirsPlanifiesDisponibilitePourPlanFeux;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypePolitiqueTirImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypePolitiqueTir();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getConsommationMaximaleParTir() {
		return consommationMaximaleParTir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsommationMaximaleParTir(long newConsommationMaximaleParTir) {
		long oldConsommationMaximaleParTir = consommationMaximaleParTir;
		consommationMaximaleParTir = newConsommationMaximaleParTir;
		boolean oldConsommationMaximaleParTirESet = consommationMaximaleParTirESet;
		consommationMaximaleParTirESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POLITIQUE_TIR__CONSOMMATION_MAXIMALE_PAR_TIR, oldConsommationMaximaleParTir, consommationMaximaleParTir, !oldConsommationMaximaleParTirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConsommationMaximaleParTir() {
		long oldConsommationMaximaleParTir = consommationMaximaleParTir;
		boolean oldConsommationMaximaleParTirESet = consommationMaximaleParTirESet;
		consommationMaximaleParTir = CONSOMMATION_MAXIMALE_PAR_TIR_EDEFAULT;
		consommationMaximaleParTirESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_POLITIQUE_TIR__CONSOMMATION_MAXIMALE_PAR_TIR, oldConsommationMaximaleParTir, CONSOMMATION_MAXIMALE_PAR_TIR_EDEFAULT, oldConsommationMaximaleParTirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConsommationMaximaleParTir() {
		return consommationMaximaleParTirESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCoefficientPonderation() {
		return coefficientPonderation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoefficientPonderation(double newCoefficientPonderation) {
		double oldCoefficientPonderation = coefficientPonderation;
		coefficientPonderation = newCoefficientPonderation;
		boolean oldCoefficientPonderationESet = coefficientPonderationESet;
		coefficientPonderationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POLITIQUE_TIR__COEFFICIENT_PONDERATION, oldCoefficientPonderation, coefficientPonderation, !oldCoefficientPonderationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCoefficientPonderation() {
		double oldCoefficientPonderation = coefficientPonderation;
		boolean oldCoefficientPonderationESet = coefficientPonderationESet;
		coefficientPonderation = COEFFICIENT_PONDERATION_EDEFAULT;
		coefficientPonderationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_POLITIQUE_TIR__COEFFICIENT_PONDERATION, oldCoefficientPonderation, COEFFICIENT_PONDERATION_EDEFAULT, oldCoefficientPonderationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCoefficientPonderation() {
		return coefficientPonderationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getDelaiMaximumDeclenchementTirPlanifie() {
		return delaiMaximumDeclenchementTirPlanifie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDelaiMaximumDeclenchementTirPlanifie(TypeDataTypeDuree newDelaiMaximumDeclenchementTirPlanifie, NotificationChain msgs) {
		TypeDataTypeDuree oldDelaiMaximumDeclenchementTirPlanifie = delaiMaximumDeclenchementTirPlanifie;
		delaiMaximumDeclenchementTirPlanifie = newDelaiMaximumDeclenchementTirPlanifie;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POLITIQUE_TIR__DELAI_MAXIMUM_DECLENCHEMENT_TIR_PLANIFIE, oldDelaiMaximumDeclenchementTirPlanifie, newDelaiMaximumDeclenchementTirPlanifie);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelaiMaximumDeclenchementTirPlanifie(TypeDataTypeDuree newDelaiMaximumDeclenchementTirPlanifie) {
		if (newDelaiMaximumDeclenchementTirPlanifie != delaiMaximumDeclenchementTirPlanifie) {
			NotificationChain msgs = null;
			if (delaiMaximumDeclenchementTirPlanifie != null)
				msgs = ((InternalEObject)delaiMaximumDeclenchementTirPlanifie).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POLITIQUE_TIR__DELAI_MAXIMUM_DECLENCHEMENT_TIR_PLANIFIE, null, msgs);
			if (newDelaiMaximumDeclenchementTirPlanifie != null)
				msgs = ((InternalEObject)newDelaiMaximumDeclenchementTirPlanifie).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POLITIQUE_TIR__DELAI_MAXIMUM_DECLENCHEMENT_TIR_PLANIFIE, null, msgs);
			msgs = basicSetDelaiMaximumDeclenchementTirPlanifie(newDelaiMaximumDeclenchementTirPlanifie, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POLITIQUE_TIR__DELAI_MAXIMUM_DECLENCHEMENT_TIR_PLANIFIE, newDelaiMaximumDeclenchementTirPlanifie, newDelaiMaximumDeclenchementTirPlanifie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getDelaiRefusTirOpportunite() {
		return delaiRefusTirOpportunite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDelaiRefusTirOpportunite(TypeDataTypeDuree newDelaiRefusTirOpportunite, NotificationChain msgs) {
		TypeDataTypeDuree oldDelaiRefusTirOpportunite = delaiRefusTirOpportunite;
		delaiRefusTirOpportunite = newDelaiRefusTirOpportunite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POLITIQUE_TIR__DELAI_REFUS_TIR_OPPORTUNITE, oldDelaiRefusTirOpportunite, newDelaiRefusTirOpportunite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelaiRefusTirOpportunite(TypeDataTypeDuree newDelaiRefusTirOpportunite) {
		if (newDelaiRefusTirOpportunite != delaiRefusTirOpportunite) {
			NotificationChain msgs = null;
			if (delaiRefusTirOpportunite != null)
				msgs = ((InternalEObject)delaiRefusTirOpportunite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POLITIQUE_TIR__DELAI_REFUS_TIR_OPPORTUNITE, null, msgs);
			if (newDelaiRefusTirOpportunite != null)
				msgs = ((InternalEObject)newDelaiRefusTirOpportunite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POLITIQUE_TIR__DELAI_REFUS_TIR_OPPORTUNITE, null, msgs);
			msgs = basicSetDelaiRefusTirOpportunite(newDelaiRefusTirOpportunite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POLITIQUE_TIR__DELAI_REFUS_TIR_OPPORTUNITE, newDelaiRefusTirOpportunite, newDelaiRefusTirOpportunite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrdresPourMunitionsParticulieres() {
		return ordresPourMunitionsParticulieres;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrdresPourMunitionsParticulieres(String newOrdresPourMunitionsParticulieres) {
		String oldOrdresPourMunitionsParticulieres = ordresPourMunitionsParticulieres;
		ordresPourMunitionsParticulieres = newOrdresPourMunitionsParticulieres;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POLITIQUE_TIR__ORDRES_POUR_MUNITIONS_PARTICULIERES, oldOrdresPourMunitionsParticulieres, ordresPourMunitionsParticulieres));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POLITIQUE_TIR__COMMENTAIRE, oldCommentaire, commentaire));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POLITIQUE_TIR__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POLITIQUE_TIR__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getDefinitInterventionType() {
		if (definitInterventionType == null) {
			definitInterventionType = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_POLITIQUE_TIR__DEFINIT_INTERVENTION_TYPE);
		}
		return definitInterventionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeVolumeMunitionsASS> getLimiteUsageParTirMunitionsRaresAVolumeMunitionsASS() {
		if (limiteUsageParTirMunitionsRaresAVolumeMunitionsASS == null) {
			limiteUsageParTirMunitionsRaresAVolumeMunitionsASS = new EObjectContainmentEList<TypeVolumeMunitionsASS>(TypeVolumeMunitionsASS.class, this, SchemaPackage.TYPE_POLITIQUE_TIR__LIMITE_USAGE_PAR_TIR_MUNITIONS_RARES_AVOLUME_MUNITIONS_ASS);
		}
		return limiteUsageParTirMunitionsRaresAVolumeMunitionsASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getConcernePlanFeux() {
		return concernePlanFeux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcernePlanFeux(TypeAssociation newConcernePlanFeux, NotificationChain msgs) {
		TypeAssociation oldConcernePlanFeux = concernePlanFeux;
		concernePlanFeux = newConcernePlanFeux;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POLITIQUE_TIR__CONCERNE_PLAN_FEUX, oldConcernePlanFeux, newConcernePlanFeux);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcernePlanFeux(TypeAssociation newConcernePlanFeux) {
		if (newConcernePlanFeux != concernePlanFeux) {
			NotificationChain msgs = null;
			if (concernePlanFeux != null)
				msgs = ((InternalEObject)concernePlanFeux).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POLITIQUE_TIR__CONCERNE_PLAN_FEUX, null, msgs);
			if (newConcernePlanFeux != null)
				msgs = ((InternalEObject)newConcernePlanFeux).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POLITIQUE_TIR__CONCERNE_PLAN_FEUX, null, msgs);
			msgs = basicSetConcernePlanFeux(newConcernePlanFeux, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POLITIQUE_TIR__CONCERNE_PLAN_FEUX, newConcernePlanFeux, newConcernePlanFeux));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeDisponibilitePourPlanFeux> getPrevoitPourTirsPlanifiesDisponibilitePourPlanFeux() {
		if (prevoitPourTirsPlanifiesDisponibilitePourPlanFeux == null) {
			prevoitPourTirsPlanifiesDisponibilitePourPlanFeux = new EObjectContainmentEList<TypeDisponibilitePourPlanFeux>(TypeDisponibilitePourPlanFeux.class, this, SchemaPackage.TYPE_POLITIQUE_TIR__PREVOIT_POUR_TIRS_PLANIFIES_DISPONIBILITE_POUR_PLAN_FEUX);
		}
		return prevoitPourTirsPlanifiesDisponibilitePourPlanFeux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_POLITIQUE_TIR__DELAI_MAXIMUM_DECLENCHEMENT_TIR_PLANIFIE:
				return basicSetDelaiMaximumDeclenchementTirPlanifie(null, msgs);
			case SchemaPackage.TYPE_POLITIQUE_TIR__DELAI_REFUS_TIR_OPPORTUNITE:
				return basicSetDelaiRefusTirOpportunite(null, msgs);
			case SchemaPackage.TYPE_POLITIQUE_TIR__DEFINIT_INTERVENTION_TYPE:
				return ((InternalEList<?>)getDefinitInterventionType()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_POLITIQUE_TIR__LIMITE_USAGE_PAR_TIR_MUNITIONS_RARES_AVOLUME_MUNITIONS_ASS:
				return ((InternalEList<?>)getLimiteUsageParTirMunitionsRaresAVolumeMunitionsASS()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_POLITIQUE_TIR__CONCERNE_PLAN_FEUX:
				return basicSetConcernePlanFeux(null, msgs);
			case SchemaPackage.TYPE_POLITIQUE_TIR__PREVOIT_POUR_TIRS_PLANIFIES_DISPONIBILITE_POUR_PLAN_FEUX:
				return ((InternalEList<?>)getPrevoitPourTirsPlanifiesDisponibilitePourPlanFeux()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_POLITIQUE_TIR__CONSOMMATION_MAXIMALE_PAR_TIR:
				return new Long(getConsommationMaximaleParTir());
			case SchemaPackage.TYPE_POLITIQUE_TIR__COEFFICIENT_PONDERATION:
				return new Double(getCoefficientPonderation());
			case SchemaPackage.TYPE_POLITIQUE_TIR__DELAI_MAXIMUM_DECLENCHEMENT_TIR_PLANIFIE:
				return getDelaiMaximumDeclenchementTirPlanifie();
			case SchemaPackage.TYPE_POLITIQUE_TIR__DELAI_REFUS_TIR_OPPORTUNITE:
				return getDelaiRefusTirOpportunite();
			case SchemaPackage.TYPE_POLITIQUE_TIR__ORDRES_POUR_MUNITIONS_PARTICULIERES:
				return getOrdresPourMunitionsParticulieres();
			case SchemaPackage.TYPE_POLITIQUE_TIR__COMMENTAIRE:
				return getCommentaire();
			case SchemaPackage.TYPE_POLITIQUE_TIR__CTE:
				return getCTE();
			case SchemaPackage.TYPE_POLITIQUE_TIR__CE:
				return getCE();
			case SchemaPackage.TYPE_POLITIQUE_TIR__DEFINIT_INTERVENTION_TYPE:
				return getDefinitInterventionType();
			case SchemaPackage.TYPE_POLITIQUE_TIR__LIMITE_USAGE_PAR_TIR_MUNITIONS_RARES_AVOLUME_MUNITIONS_ASS:
				return getLimiteUsageParTirMunitionsRaresAVolumeMunitionsASS();
			case SchemaPackage.TYPE_POLITIQUE_TIR__CONCERNE_PLAN_FEUX:
				return getConcernePlanFeux();
			case SchemaPackage.TYPE_POLITIQUE_TIR__PREVOIT_POUR_TIRS_PLANIFIES_DISPONIBILITE_POUR_PLAN_FEUX:
				return getPrevoitPourTirsPlanifiesDisponibilitePourPlanFeux();
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
			case SchemaPackage.TYPE_POLITIQUE_TIR__CONSOMMATION_MAXIMALE_PAR_TIR:
				setConsommationMaximaleParTir(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_POLITIQUE_TIR__COEFFICIENT_PONDERATION:
				setCoefficientPonderation(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_POLITIQUE_TIR__DELAI_MAXIMUM_DECLENCHEMENT_TIR_PLANIFIE:
				setDelaiMaximumDeclenchementTirPlanifie((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_POLITIQUE_TIR__DELAI_REFUS_TIR_OPPORTUNITE:
				setDelaiRefusTirOpportunite((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_POLITIQUE_TIR__ORDRES_POUR_MUNITIONS_PARTICULIERES:
				setOrdresPourMunitionsParticulieres((String)newValue);
				return;
			case SchemaPackage.TYPE_POLITIQUE_TIR__COMMENTAIRE:
				setCommentaire((String)newValue);
				return;
			case SchemaPackage.TYPE_POLITIQUE_TIR__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_POLITIQUE_TIR__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_POLITIQUE_TIR__DEFINIT_INTERVENTION_TYPE:
				getDefinitInterventionType().clear();
				getDefinitInterventionType().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_POLITIQUE_TIR__LIMITE_USAGE_PAR_TIR_MUNITIONS_RARES_AVOLUME_MUNITIONS_ASS:
				getLimiteUsageParTirMunitionsRaresAVolumeMunitionsASS().clear();
				getLimiteUsageParTirMunitionsRaresAVolumeMunitionsASS().addAll((Collection<? extends TypeVolumeMunitionsASS>)newValue);
				return;
			case SchemaPackage.TYPE_POLITIQUE_TIR__CONCERNE_PLAN_FEUX:
				setConcernePlanFeux((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_POLITIQUE_TIR__PREVOIT_POUR_TIRS_PLANIFIES_DISPONIBILITE_POUR_PLAN_FEUX:
				getPrevoitPourTirsPlanifiesDisponibilitePourPlanFeux().clear();
				getPrevoitPourTirsPlanifiesDisponibilitePourPlanFeux().addAll((Collection<? extends TypeDisponibilitePourPlanFeux>)newValue);
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
			case SchemaPackage.TYPE_POLITIQUE_TIR__CONSOMMATION_MAXIMALE_PAR_TIR:
				unsetConsommationMaximaleParTir();
				return;
			case SchemaPackage.TYPE_POLITIQUE_TIR__COEFFICIENT_PONDERATION:
				unsetCoefficientPonderation();
				return;
			case SchemaPackage.TYPE_POLITIQUE_TIR__DELAI_MAXIMUM_DECLENCHEMENT_TIR_PLANIFIE:
				setDelaiMaximumDeclenchementTirPlanifie((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_POLITIQUE_TIR__DELAI_REFUS_TIR_OPPORTUNITE:
				setDelaiRefusTirOpportunite((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_POLITIQUE_TIR__ORDRES_POUR_MUNITIONS_PARTICULIERES:
				setOrdresPourMunitionsParticulieres(ORDRES_POUR_MUNITIONS_PARTICULIERES_EDEFAULT);
				return;
			case SchemaPackage.TYPE_POLITIQUE_TIR__COMMENTAIRE:
				setCommentaire(COMMENTAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_POLITIQUE_TIR__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_POLITIQUE_TIR__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_POLITIQUE_TIR__DEFINIT_INTERVENTION_TYPE:
				getDefinitInterventionType().clear();
				return;
			case SchemaPackage.TYPE_POLITIQUE_TIR__LIMITE_USAGE_PAR_TIR_MUNITIONS_RARES_AVOLUME_MUNITIONS_ASS:
				getLimiteUsageParTirMunitionsRaresAVolumeMunitionsASS().clear();
				return;
			case SchemaPackage.TYPE_POLITIQUE_TIR__CONCERNE_PLAN_FEUX:
				setConcernePlanFeux((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_POLITIQUE_TIR__PREVOIT_POUR_TIRS_PLANIFIES_DISPONIBILITE_POUR_PLAN_FEUX:
				getPrevoitPourTirsPlanifiesDisponibilitePourPlanFeux().clear();
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
			case SchemaPackage.TYPE_POLITIQUE_TIR__CONSOMMATION_MAXIMALE_PAR_TIR:
				return isSetConsommationMaximaleParTir();
			case SchemaPackage.TYPE_POLITIQUE_TIR__COEFFICIENT_PONDERATION:
				return isSetCoefficientPonderation();
			case SchemaPackage.TYPE_POLITIQUE_TIR__DELAI_MAXIMUM_DECLENCHEMENT_TIR_PLANIFIE:
				return delaiMaximumDeclenchementTirPlanifie != null;
			case SchemaPackage.TYPE_POLITIQUE_TIR__DELAI_REFUS_TIR_OPPORTUNITE:
				return delaiRefusTirOpportunite != null;
			case SchemaPackage.TYPE_POLITIQUE_TIR__ORDRES_POUR_MUNITIONS_PARTICULIERES:
				return ORDRES_POUR_MUNITIONS_PARTICULIERES_EDEFAULT == null ? ordresPourMunitionsParticulieres != null : !ORDRES_POUR_MUNITIONS_PARTICULIERES_EDEFAULT.equals(ordresPourMunitionsParticulieres);
			case SchemaPackage.TYPE_POLITIQUE_TIR__COMMENTAIRE:
				return COMMENTAIRE_EDEFAULT == null ? commentaire != null : !COMMENTAIRE_EDEFAULT.equals(commentaire);
			case SchemaPackage.TYPE_POLITIQUE_TIR__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_POLITIQUE_TIR__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_POLITIQUE_TIR__DEFINIT_INTERVENTION_TYPE:
				return definitInterventionType != null && !definitInterventionType.isEmpty();
			case SchemaPackage.TYPE_POLITIQUE_TIR__LIMITE_USAGE_PAR_TIR_MUNITIONS_RARES_AVOLUME_MUNITIONS_ASS:
				return limiteUsageParTirMunitionsRaresAVolumeMunitionsASS != null && !limiteUsageParTirMunitionsRaresAVolumeMunitionsASS.isEmpty();
			case SchemaPackage.TYPE_POLITIQUE_TIR__CONCERNE_PLAN_FEUX:
				return concernePlanFeux != null;
			case SchemaPackage.TYPE_POLITIQUE_TIR__PREVOIT_POUR_TIRS_PLANIFIES_DISPONIBILITE_POUR_PLAN_FEUX:
				return prevoitPourTirsPlanifiesDisponibilitePourPlanFeux != null && !prevoitPourTirsPlanifiesDisponibilitePourPlanFeux.isEmpty();
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
		result.append(" (consommationMaximaleParTir: ");
		if (consommationMaximaleParTirESet) result.append(consommationMaximaleParTir); else result.append("<unset>");
		result.append(", coefficientPonderation: ");
		if (coefficientPonderationESet) result.append(coefficientPonderation); else result.append("<unset>");
		result.append(", ordresPourMunitionsParticulieres: ");
		result.append(ordresPourMunitionsParticulieres);
		result.append(", commentaire: ");
		result.append(commentaire);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypePolitiqueTirImpl
