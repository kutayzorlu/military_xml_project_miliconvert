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
import mpia.schema.TypeDepotACreer;

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
 * An implementation of the model object '<em><b>Type Depot ACreer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeDepotACreerImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDepotACreerImpl#getDateDeDebut <em>Date De Debut</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDepotACreerImpl#getDateDeFin <em>Date De Fin</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDepotACreerImpl#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDepotACreerImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDepotACreerImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDepotACreerImpl#getACommeLieuMissionManutentionAutreSite <em>AComme Lieu Mission Manutention Autre Site</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDepotACreerImpl#getConcerneTypeRessourceTypeConsommable <em>Concerne Type Ressource Type Consommable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeDepotACreerImpl extends EObjectImpl implements TypeDepotACreer {
	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

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
	 * The cached value of the '{@link #getACommeLieuMissionManutentionAutreSite() <em>AComme Lieu Mission Manutention Autre Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeLieuMissionManutentionAutreSite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aCommeLieuMissionManutentionAutreSite;

	/**
	 * The cached value of the '{@link #getConcerneTypeRessourceTypeConsommable() <em>Concerne Type Ressource Type Consommable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneTypeRessourceTypeConsommable()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociationEXT> concerneTypeRessourceTypeConsommable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeDepotACreerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeDepotACreer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEPOT_ACREER__NOM, oldNom, nom));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEPOT_ACREER__DATE_DE_DEBUT, oldDateDeDebut, dateDeDebut));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEPOT_ACREER__DATE_DE_FIN, oldDateDeFin, dateDeFin));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEPOT_ACREER__COMMENTAIRE, oldCommentaire, commentaire));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEPOT_ACREER__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEPOT_ACREER__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getACommeLieuMissionManutentionAutreSite() {
		return aCommeLieuMissionManutentionAutreSite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommeLieuMissionManutentionAutreSite(TypeAssociation newACommeLieuMissionManutentionAutreSite, NotificationChain msgs) {
		TypeAssociation oldACommeLieuMissionManutentionAutreSite = aCommeLieuMissionManutentionAutreSite;
		aCommeLieuMissionManutentionAutreSite = newACommeLieuMissionManutentionAutreSite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEPOT_ACREER__ACOMME_LIEU_MISSION_MANUTENTION_AUTRE_SITE, oldACommeLieuMissionManutentionAutreSite, newACommeLieuMissionManutentionAutreSite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommeLieuMissionManutentionAutreSite(TypeAssociation newACommeLieuMissionManutentionAutreSite) {
		if (newACommeLieuMissionManutentionAutreSite != aCommeLieuMissionManutentionAutreSite) {
			NotificationChain msgs = null;
			if (aCommeLieuMissionManutentionAutreSite != null)
				msgs = ((InternalEObject)aCommeLieuMissionManutentionAutreSite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DEPOT_ACREER__ACOMME_LIEU_MISSION_MANUTENTION_AUTRE_SITE, null, msgs);
			if (newACommeLieuMissionManutentionAutreSite != null)
				msgs = ((InternalEObject)newACommeLieuMissionManutentionAutreSite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DEPOT_ACREER__ACOMME_LIEU_MISSION_MANUTENTION_AUTRE_SITE, null, msgs);
			msgs = basicSetACommeLieuMissionManutentionAutreSite(newACommeLieuMissionManutentionAutreSite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEPOT_ACREER__ACOMME_LIEU_MISSION_MANUTENTION_AUTRE_SITE, newACommeLieuMissionManutentionAutreSite, newACommeLieuMissionManutentionAutreSite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEXT> getConcerneTypeRessourceTypeConsommable() {
		if (concerneTypeRessourceTypeConsommable == null) {
			concerneTypeRessourceTypeConsommable = new EObjectContainmentEList<TypeAssociationEXT>(TypeAssociationEXT.class, this, SchemaPackage.TYPE_DEPOT_ACREER__CONCERNE_TYPE_RESSOURCE_TYPE_CONSOMMABLE);
		}
		return concerneTypeRessourceTypeConsommable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_DEPOT_ACREER__ACOMME_LIEU_MISSION_MANUTENTION_AUTRE_SITE:
				return basicSetACommeLieuMissionManutentionAutreSite(null, msgs);
			case SchemaPackage.TYPE_DEPOT_ACREER__CONCERNE_TYPE_RESSOURCE_TYPE_CONSOMMABLE:
				return ((InternalEList<?>)getConcerneTypeRessourceTypeConsommable()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_DEPOT_ACREER__NOM:
				return getNom();
			case SchemaPackage.TYPE_DEPOT_ACREER__DATE_DE_DEBUT:
				return getDateDeDebut();
			case SchemaPackage.TYPE_DEPOT_ACREER__DATE_DE_FIN:
				return getDateDeFin();
			case SchemaPackage.TYPE_DEPOT_ACREER__COMMENTAIRE:
				return getCommentaire();
			case SchemaPackage.TYPE_DEPOT_ACREER__CTE:
				return getCTE();
			case SchemaPackage.TYPE_DEPOT_ACREER__CE:
				return getCE();
			case SchemaPackage.TYPE_DEPOT_ACREER__ACOMME_LIEU_MISSION_MANUTENTION_AUTRE_SITE:
				return getACommeLieuMissionManutentionAutreSite();
			case SchemaPackage.TYPE_DEPOT_ACREER__CONCERNE_TYPE_RESSOURCE_TYPE_CONSOMMABLE:
				return getConcerneTypeRessourceTypeConsommable();
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
			case SchemaPackage.TYPE_DEPOT_ACREER__NOM:
				setNom((String)newValue);
				return;
			case SchemaPackage.TYPE_DEPOT_ACREER__DATE_DE_DEBUT:
				setDateDeDebut((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_DEPOT_ACREER__DATE_DE_FIN:
				setDateDeFin((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_DEPOT_ACREER__COMMENTAIRE:
				setCommentaire((String)newValue);
				return;
			case SchemaPackage.TYPE_DEPOT_ACREER__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_DEPOT_ACREER__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_DEPOT_ACREER__ACOMME_LIEU_MISSION_MANUTENTION_AUTRE_SITE:
				setACommeLieuMissionManutentionAutreSite((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_DEPOT_ACREER__CONCERNE_TYPE_RESSOURCE_TYPE_CONSOMMABLE:
				getConcerneTypeRessourceTypeConsommable().clear();
				getConcerneTypeRessourceTypeConsommable().addAll((Collection<? extends TypeAssociationEXT>)newValue);
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
			case SchemaPackage.TYPE_DEPOT_ACREER__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DEPOT_ACREER__DATE_DE_DEBUT:
				setDateDeDebut(DATE_DE_DEBUT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DEPOT_ACREER__DATE_DE_FIN:
				setDateDeFin(DATE_DE_FIN_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DEPOT_ACREER__COMMENTAIRE:
				setCommentaire(COMMENTAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DEPOT_ACREER__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DEPOT_ACREER__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DEPOT_ACREER__ACOMME_LIEU_MISSION_MANUTENTION_AUTRE_SITE:
				setACommeLieuMissionManutentionAutreSite((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_DEPOT_ACREER__CONCERNE_TYPE_RESSOURCE_TYPE_CONSOMMABLE:
				getConcerneTypeRessourceTypeConsommable().clear();
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
			case SchemaPackage.TYPE_DEPOT_ACREER__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case SchemaPackage.TYPE_DEPOT_ACREER__DATE_DE_DEBUT:
				return DATE_DE_DEBUT_EDEFAULT == null ? dateDeDebut != null : !DATE_DE_DEBUT_EDEFAULT.equals(dateDeDebut);
			case SchemaPackage.TYPE_DEPOT_ACREER__DATE_DE_FIN:
				return DATE_DE_FIN_EDEFAULT == null ? dateDeFin != null : !DATE_DE_FIN_EDEFAULT.equals(dateDeFin);
			case SchemaPackage.TYPE_DEPOT_ACREER__COMMENTAIRE:
				return COMMENTAIRE_EDEFAULT == null ? commentaire != null : !COMMENTAIRE_EDEFAULT.equals(commentaire);
			case SchemaPackage.TYPE_DEPOT_ACREER__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_DEPOT_ACREER__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_DEPOT_ACREER__ACOMME_LIEU_MISSION_MANUTENTION_AUTRE_SITE:
				return aCommeLieuMissionManutentionAutreSite != null;
			case SchemaPackage.TYPE_DEPOT_ACREER__CONCERNE_TYPE_RESSOURCE_TYPE_CONSOMMABLE:
				return concerneTypeRessourceTypeConsommable != null && !concerneTypeRessourceTypeConsommable.isEmpty();
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
		result.append(" (nom: ");
		result.append(nom);
		result.append(", dateDeDebut: ");
		result.append(dateDeDebut);
		result.append(", dateDeFin: ");
		result.append(dateDeFin);
		result.append(", commentaire: ");
		result.append(commentaire);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeDepotACreerImpl
