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
import mpia.schema.TypeListeMesuresCoordination3D;
import mpia.schema.TypePeriode3D;

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
 * An implementation of the model object '<em><b>Type Liste Mesures Coordination3 D</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeListeMesuresCoordination3DImpl#getNumeroSerie <em>Numero Serie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeListeMesuresCoordination3DImpl#getNomZoneValidite <em>Nom Zone Validite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeListeMesuresCoordination3DImpl#getConsignesGestionACM <em>Consignes Gestion ACM</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeListeMesuresCoordination3DImpl#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeListeMesuresCoordination3DImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeListeMesuresCoordination3DImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeListeMesuresCoordination3DImpl#getAPourACMmodifieMesureCoordination <em>APour AC Mmodifie Mesure Coordination</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeListeMesuresCoordination3DImpl#getAPourACMactiveMesureCoordination <em>APour AC Mactive Mesure Coordination</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeListeMesuresCoordination3DImpl#getAPourACMcreeMesureCoordination <em>APour AC Mcree Mesure Coordination</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeListeMesuresCoordination3DImpl#getAPourACMdemandeOuPrepareMesureCoordination <em>APour AC Mdemande Ou Prepare Mesure Coordination</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeListeMesuresCoordination3DImpl#getAPourITSouATSdevantEtreCreeMesureCoordination <em>APour IT Sou AT Sdevant Etre Cree Mesure Coordination</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeListeMesuresCoordination3DImpl#getAPourITSouATSsupprimeMesureCoordination <em>APour IT Sou AT Ssupprime Mesure Coordination</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeListeMesuresCoordination3DImpl#getAPourWEZcreesMesureCoordination <em>APour WE Zcrees Mesure Coordination</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeListeMesuresCoordination3DImpl#getAPourWEZutiliseesMesureCoordination <em>APour WE Zutilisees Mesure Coordination</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeListeMesuresCoordination3DImpl#getAPourPeriodeValiditePeriode3D <em>APour Periode Validite Periode3 D</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeListeMesuresCoordination3DImpl extends EObjectImpl implements TypeListeMesuresCoordination3D {
	/**
	 * The default value of the '{@link #getNumeroSerie() <em>Numero Serie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroSerie()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMERO_SERIE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumeroSerie() <em>Numero Serie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroSerie()
	 * @generated
	 * @ordered
	 */
	protected String numeroSerie = NUMERO_SERIE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNomZoneValidite() <em>Nom Zone Validite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomZoneValidite()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_ZONE_VALIDITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomZoneValidite() <em>Nom Zone Validite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomZoneValidite()
	 * @generated
	 * @ordered
	 */
	protected String nomZoneValidite = NOM_ZONE_VALIDITE_EDEFAULT;

	/**
	 * The default value of the '{@link #getConsignesGestionACM() <em>Consignes Gestion ACM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsignesGestionACM()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSIGNES_GESTION_ACM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConsignesGestionACM() <em>Consignes Gestion ACM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsignesGestionACM()
	 * @generated
	 * @ordered
	 */
	protected String consignesGestionACM = CONSIGNES_GESTION_ACM_EDEFAULT;

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
	 * The cached value of the '{@link #getAPourACMmodifieMesureCoordination() <em>APour AC Mmodifie Mesure Coordination</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourACMmodifieMesureCoordination()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourACMmodifieMesureCoordination;

	/**
	 * The cached value of the '{@link #getAPourACMactiveMesureCoordination() <em>APour AC Mactive Mesure Coordination</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourACMactiveMesureCoordination()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourACMactiveMesureCoordination;

	/**
	 * The cached value of the '{@link #getAPourACMcreeMesureCoordination() <em>APour AC Mcree Mesure Coordination</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourACMcreeMesureCoordination()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourACMcreeMesureCoordination;

	/**
	 * The cached value of the '{@link #getAPourACMdemandeOuPrepareMesureCoordination() <em>APour AC Mdemande Ou Prepare Mesure Coordination</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourACMdemandeOuPrepareMesureCoordination()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourACMdemandeOuPrepareMesureCoordination;

	/**
	 * The cached value of the '{@link #getAPourITSouATSdevantEtreCreeMesureCoordination() <em>APour IT Sou AT Sdevant Etre Cree Mesure Coordination</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourITSouATSdevantEtreCreeMesureCoordination()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourITSouATSdevantEtreCreeMesureCoordination;

	/**
	 * The cached value of the '{@link #getAPourITSouATSsupprimeMesureCoordination() <em>APour IT Sou AT Ssupprime Mesure Coordination</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourITSouATSsupprimeMesureCoordination()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourITSouATSsupprimeMesureCoordination;

	/**
	 * The cached value of the '{@link #getAPourWEZcreesMesureCoordination() <em>APour WE Zcrees Mesure Coordination</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourWEZcreesMesureCoordination()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourWEZcreesMesureCoordination;

	/**
	 * The cached value of the '{@link #getAPourWEZutiliseesMesureCoordination() <em>APour WE Zutilisees Mesure Coordination</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourWEZutiliseesMesureCoordination()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourWEZutiliseesMesureCoordination;

	/**
	 * The cached value of the '{@link #getAPourPeriodeValiditePeriode3D() <em>APour Periode Validite Periode3 D</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourPeriodeValiditePeriode3D()
	 * @generated
	 * @ordered
	 */
	protected EList<TypePeriode3D> aPourPeriodeValiditePeriode3D;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeListeMesuresCoordination3DImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeListeMesuresCoordination3D();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumeroSerie() {
		return numeroSerie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroSerie(String newNumeroSerie) {
		String oldNumeroSerie = numeroSerie;
		numeroSerie = newNumeroSerie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__NUMERO_SERIE, oldNumeroSerie, numeroSerie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNomZoneValidite() {
		return nomZoneValidite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomZoneValidite(String newNomZoneValidite) {
		String oldNomZoneValidite = nomZoneValidite;
		nomZoneValidite = newNomZoneValidite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__NOM_ZONE_VALIDITE, oldNomZoneValidite, nomZoneValidite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConsignesGestionACM() {
		return consignesGestionACM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsignesGestionACM(String newConsignesGestionACM) {
		String oldConsignesGestionACM = consignesGestionACM;
		consignesGestionACM = newConsignesGestionACM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__CONSIGNES_GESTION_ACM, oldConsignesGestionACM, consignesGestionACM));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__COMMENTAIRE, oldCommentaire, commentaire));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourACMmodifieMesureCoordination() {
		if (aPourACMmodifieMesureCoordination == null) {
			aPourACMmodifieMesureCoordination = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__APOUR_AC_MMODIFIE_MESURE_COORDINATION);
		}
		return aPourACMmodifieMesureCoordination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourACMactiveMesureCoordination() {
		if (aPourACMactiveMesureCoordination == null) {
			aPourACMactiveMesureCoordination = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__APOUR_AC_MACTIVE_MESURE_COORDINATION);
		}
		return aPourACMactiveMesureCoordination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourACMcreeMesureCoordination() {
		if (aPourACMcreeMesureCoordination == null) {
			aPourACMcreeMesureCoordination = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__APOUR_AC_MCREE_MESURE_COORDINATION);
		}
		return aPourACMcreeMesureCoordination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourACMdemandeOuPrepareMesureCoordination() {
		if (aPourACMdemandeOuPrepareMesureCoordination == null) {
			aPourACMdemandeOuPrepareMesureCoordination = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__APOUR_AC_MDEMANDE_OU_PREPARE_MESURE_COORDINATION);
		}
		return aPourACMdemandeOuPrepareMesureCoordination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourITSouATSdevantEtreCreeMesureCoordination() {
		if (aPourITSouATSdevantEtreCreeMesureCoordination == null) {
			aPourITSouATSdevantEtreCreeMesureCoordination = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__APOUR_IT_SOU_AT_SDEVANT_ETRE_CREE_MESURE_COORDINATION);
		}
		return aPourITSouATSdevantEtreCreeMesureCoordination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourITSouATSsupprimeMesureCoordination() {
		if (aPourITSouATSsupprimeMesureCoordination == null) {
			aPourITSouATSsupprimeMesureCoordination = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__APOUR_IT_SOU_AT_SSUPPRIME_MESURE_COORDINATION);
		}
		return aPourITSouATSsupprimeMesureCoordination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourWEZcreesMesureCoordination() {
		if (aPourWEZcreesMesureCoordination == null) {
			aPourWEZcreesMesureCoordination = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__APOUR_WE_ZCREES_MESURE_COORDINATION);
		}
		return aPourWEZcreesMesureCoordination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourWEZutiliseesMesureCoordination() {
		if (aPourWEZutiliseesMesureCoordination == null) {
			aPourWEZutiliseesMesureCoordination = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__APOUR_WE_ZUTILISEES_MESURE_COORDINATION);
		}
		return aPourWEZutiliseesMesureCoordination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypePeriode3D> getAPourPeriodeValiditePeriode3D() {
		if (aPourPeriodeValiditePeriode3D == null) {
			aPourPeriodeValiditePeriode3D = new EObjectContainmentEList<TypePeriode3D>(TypePeriode3D.class, this, SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__APOUR_PERIODE_VALIDITE_PERIODE3_D);
		}
		return aPourPeriodeValiditePeriode3D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__APOUR_AC_MMODIFIE_MESURE_COORDINATION:
				return ((InternalEList<?>)getAPourACMmodifieMesureCoordination()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__APOUR_AC_MACTIVE_MESURE_COORDINATION:
				return ((InternalEList<?>)getAPourACMactiveMesureCoordination()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__APOUR_AC_MCREE_MESURE_COORDINATION:
				return ((InternalEList<?>)getAPourACMcreeMesureCoordination()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__APOUR_AC_MDEMANDE_OU_PREPARE_MESURE_COORDINATION:
				return ((InternalEList<?>)getAPourACMdemandeOuPrepareMesureCoordination()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__APOUR_IT_SOU_AT_SDEVANT_ETRE_CREE_MESURE_COORDINATION:
				return ((InternalEList<?>)getAPourITSouATSdevantEtreCreeMesureCoordination()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__APOUR_IT_SOU_AT_SSUPPRIME_MESURE_COORDINATION:
				return ((InternalEList<?>)getAPourITSouATSsupprimeMesureCoordination()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__APOUR_WE_ZCREES_MESURE_COORDINATION:
				return ((InternalEList<?>)getAPourWEZcreesMesureCoordination()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__APOUR_WE_ZUTILISEES_MESURE_COORDINATION:
				return ((InternalEList<?>)getAPourWEZutiliseesMesureCoordination()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__APOUR_PERIODE_VALIDITE_PERIODE3_D:
				return ((InternalEList<?>)getAPourPeriodeValiditePeriode3D()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__NUMERO_SERIE:
				return getNumeroSerie();
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__NOM_ZONE_VALIDITE:
				return getNomZoneValidite();
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__CONSIGNES_GESTION_ACM:
				return getConsignesGestionACM();
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__COMMENTAIRE:
				return getCommentaire();
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__CTE:
				return getCTE();
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__CE:
				return getCE();
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__APOUR_AC_MMODIFIE_MESURE_COORDINATION:
				return getAPourACMmodifieMesureCoordination();
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__APOUR_AC_MACTIVE_MESURE_COORDINATION:
				return getAPourACMactiveMesureCoordination();
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__APOUR_AC_MCREE_MESURE_COORDINATION:
				return getAPourACMcreeMesureCoordination();
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__APOUR_AC_MDEMANDE_OU_PREPARE_MESURE_COORDINATION:
				return getAPourACMdemandeOuPrepareMesureCoordination();
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__APOUR_IT_SOU_AT_SDEVANT_ETRE_CREE_MESURE_COORDINATION:
				return getAPourITSouATSdevantEtreCreeMesureCoordination();
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__APOUR_IT_SOU_AT_SSUPPRIME_MESURE_COORDINATION:
				return getAPourITSouATSsupprimeMesureCoordination();
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__APOUR_WE_ZCREES_MESURE_COORDINATION:
				return getAPourWEZcreesMesureCoordination();
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__APOUR_WE_ZUTILISEES_MESURE_COORDINATION:
				return getAPourWEZutiliseesMesureCoordination();
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__APOUR_PERIODE_VALIDITE_PERIODE3_D:
				return getAPourPeriodeValiditePeriode3D();
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
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__NUMERO_SERIE:
				setNumeroSerie((String)newValue);
				return;
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__NOM_ZONE_VALIDITE:
				setNomZoneValidite((String)newValue);
				return;
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__CONSIGNES_GESTION_ACM:
				setConsignesGestionACM((String)newValue);
				return;
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__COMMENTAIRE:
				setCommentaire((String)newValue);
				return;
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__APOUR_AC_MMODIFIE_MESURE_COORDINATION:
				getAPourACMmodifieMesureCoordination().clear();
				getAPourACMmodifieMesureCoordination().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__APOUR_AC_MACTIVE_MESURE_COORDINATION:
				getAPourACMactiveMesureCoordination().clear();
				getAPourACMactiveMesureCoordination().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__APOUR_AC_MCREE_MESURE_COORDINATION:
				getAPourACMcreeMesureCoordination().clear();
				getAPourACMcreeMesureCoordination().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__APOUR_AC_MDEMANDE_OU_PREPARE_MESURE_COORDINATION:
				getAPourACMdemandeOuPrepareMesureCoordination().clear();
				getAPourACMdemandeOuPrepareMesureCoordination().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__APOUR_IT_SOU_AT_SDEVANT_ETRE_CREE_MESURE_COORDINATION:
				getAPourITSouATSdevantEtreCreeMesureCoordination().clear();
				getAPourITSouATSdevantEtreCreeMesureCoordination().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__APOUR_IT_SOU_AT_SSUPPRIME_MESURE_COORDINATION:
				getAPourITSouATSsupprimeMesureCoordination().clear();
				getAPourITSouATSsupprimeMesureCoordination().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__APOUR_WE_ZCREES_MESURE_COORDINATION:
				getAPourWEZcreesMesureCoordination().clear();
				getAPourWEZcreesMesureCoordination().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__APOUR_WE_ZUTILISEES_MESURE_COORDINATION:
				getAPourWEZutiliseesMesureCoordination().clear();
				getAPourWEZutiliseesMesureCoordination().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__APOUR_PERIODE_VALIDITE_PERIODE3_D:
				getAPourPeriodeValiditePeriode3D().clear();
				getAPourPeriodeValiditePeriode3D().addAll((Collection<? extends TypePeriode3D>)newValue);
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
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__NUMERO_SERIE:
				setNumeroSerie(NUMERO_SERIE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__NOM_ZONE_VALIDITE:
				setNomZoneValidite(NOM_ZONE_VALIDITE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__CONSIGNES_GESTION_ACM:
				setConsignesGestionACM(CONSIGNES_GESTION_ACM_EDEFAULT);
				return;
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__COMMENTAIRE:
				setCommentaire(COMMENTAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__APOUR_AC_MMODIFIE_MESURE_COORDINATION:
				getAPourACMmodifieMesureCoordination().clear();
				return;
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__APOUR_AC_MACTIVE_MESURE_COORDINATION:
				getAPourACMactiveMesureCoordination().clear();
				return;
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__APOUR_AC_MCREE_MESURE_COORDINATION:
				getAPourACMcreeMesureCoordination().clear();
				return;
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__APOUR_AC_MDEMANDE_OU_PREPARE_MESURE_COORDINATION:
				getAPourACMdemandeOuPrepareMesureCoordination().clear();
				return;
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__APOUR_IT_SOU_AT_SDEVANT_ETRE_CREE_MESURE_COORDINATION:
				getAPourITSouATSdevantEtreCreeMesureCoordination().clear();
				return;
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__APOUR_IT_SOU_AT_SSUPPRIME_MESURE_COORDINATION:
				getAPourITSouATSsupprimeMesureCoordination().clear();
				return;
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__APOUR_WE_ZCREES_MESURE_COORDINATION:
				getAPourWEZcreesMesureCoordination().clear();
				return;
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__APOUR_WE_ZUTILISEES_MESURE_COORDINATION:
				getAPourWEZutiliseesMesureCoordination().clear();
				return;
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__APOUR_PERIODE_VALIDITE_PERIODE3_D:
				getAPourPeriodeValiditePeriode3D().clear();
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
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__NUMERO_SERIE:
				return NUMERO_SERIE_EDEFAULT == null ? numeroSerie != null : !NUMERO_SERIE_EDEFAULT.equals(numeroSerie);
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__NOM_ZONE_VALIDITE:
				return NOM_ZONE_VALIDITE_EDEFAULT == null ? nomZoneValidite != null : !NOM_ZONE_VALIDITE_EDEFAULT.equals(nomZoneValidite);
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__CONSIGNES_GESTION_ACM:
				return CONSIGNES_GESTION_ACM_EDEFAULT == null ? consignesGestionACM != null : !CONSIGNES_GESTION_ACM_EDEFAULT.equals(consignesGestionACM);
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__COMMENTAIRE:
				return COMMENTAIRE_EDEFAULT == null ? commentaire != null : !COMMENTAIRE_EDEFAULT.equals(commentaire);
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__APOUR_AC_MMODIFIE_MESURE_COORDINATION:
				return aPourACMmodifieMesureCoordination != null && !aPourACMmodifieMesureCoordination.isEmpty();
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__APOUR_AC_MACTIVE_MESURE_COORDINATION:
				return aPourACMactiveMesureCoordination != null && !aPourACMactiveMesureCoordination.isEmpty();
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__APOUR_AC_MCREE_MESURE_COORDINATION:
				return aPourACMcreeMesureCoordination != null && !aPourACMcreeMesureCoordination.isEmpty();
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__APOUR_AC_MDEMANDE_OU_PREPARE_MESURE_COORDINATION:
				return aPourACMdemandeOuPrepareMesureCoordination != null && !aPourACMdemandeOuPrepareMesureCoordination.isEmpty();
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__APOUR_IT_SOU_AT_SDEVANT_ETRE_CREE_MESURE_COORDINATION:
				return aPourITSouATSdevantEtreCreeMesureCoordination != null && !aPourITSouATSdevantEtreCreeMesureCoordination.isEmpty();
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__APOUR_IT_SOU_AT_SSUPPRIME_MESURE_COORDINATION:
				return aPourITSouATSsupprimeMesureCoordination != null && !aPourITSouATSsupprimeMesureCoordination.isEmpty();
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__APOUR_WE_ZCREES_MESURE_COORDINATION:
				return aPourWEZcreesMesureCoordination != null && !aPourWEZcreesMesureCoordination.isEmpty();
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__APOUR_WE_ZUTILISEES_MESURE_COORDINATION:
				return aPourWEZutiliseesMesureCoordination != null && !aPourWEZutiliseesMesureCoordination.isEmpty();
			case SchemaPackage.TYPE_LISTE_MESURES_COORDINATION3_D__APOUR_PERIODE_VALIDITE_PERIODE3_D:
				return aPourPeriodeValiditePeriode3D != null && !aPourPeriodeValiditePeriode3D.isEmpty();
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
		result.append(" (numeroSerie: ");
		result.append(numeroSerie);
		result.append(", nomZoneValidite: ");
		result.append(nomZoneValidite);
		result.append(", consignesGestionACM: ");
		result.append(consignesGestionACM);
		result.append(", commentaire: ");
		result.append(commentaire);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeListeMesuresCoordination3DImpl
