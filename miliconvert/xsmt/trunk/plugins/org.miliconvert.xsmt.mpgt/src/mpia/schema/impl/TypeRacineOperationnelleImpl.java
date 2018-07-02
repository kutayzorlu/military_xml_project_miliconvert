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
import mpia.schema.TypeRacineOperationnelle;

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
 * An implementation of the model object '<em><b>Type Racine Operationnelle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeRacineOperationnelleImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRacineOperationnelleImpl#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRacineOperationnelleImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRacineOperationnelleImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRacineOperationnelleImpl#getAPourAutreNomAutreNom <em>APour Autre Nom Autre Nom</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRacineOperationnelleImpl#getEstRapporteeParRapport <em>Est Rapportee Par Rapport</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRacineOperationnelleImpl#getAPourDocumentAssocieAssociationRacineOperationnelleDocument <em>APour Document Associe Association Racine Operationnelle Document</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypeRacineOperationnelleImpl extends EObjectImpl implements TypeRacineOperationnelle {
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
	 * The cached value of the '{@link #getAPourAutreNomAutreNom() <em>APour Autre Nom Autre Nom</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourAutreNomAutreNom()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourAutreNomAutreNom;

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
	 * The cached value of the '{@link #getAPourDocumentAssocieAssociationRacineOperationnelleDocument() <em>APour Document Associe Association Racine Operationnelle Document</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourDocumentAssocieAssociationRacineOperationnelleDocument()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourDocumentAssocieAssociationRacineOperationnelleDocument;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeRacineOperationnelleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeRacineOperationnelle();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RACINE_OPERATIONNELLE__NOM, oldNom, nom));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RACINE_OPERATIONNELLE__COMMENTAIRE, oldCommentaire, commentaire));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RACINE_OPERATIONNELLE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RACINE_OPERATIONNELLE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourAutreNomAutreNom() {
		if (aPourAutreNomAutreNom == null) {
			aPourAutreNomAutreNom = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_RACINE_OPERATIONNELLE__APOUR_AUTRE_NOM_AUTRE_NOM);
		}
		return aPourAutreNomAutreNom;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RACINE_OPERATIONNELLE__EST_RAPPORTEE_PAR_RAPPORT, oldEstRapporteeParRapport, newEstRapporteeParRapport);
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
				msgs = ((InternalEObject)estRapporteeParRapport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RACINE_OPERATIONNELLE__EST_RAPPORTEE_PAR_RAPPORT, null, msgs);
			if (newEstRapporteeParRapport != null)
				msgs = ((InternalEObject)newEstRapporteeParRapport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RACINE_OPERATIONNELLE__EST_RAPPORTEE_PAR_RAPPORT, null, msgs);
			msgs = basicSetEstRapporteeParRapport(newEstRapporteeParRapport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RACINE_OPERATIONNELLE__EST_RAPPORTEE_PAR_RAPPORT, newEstRapporteeParRapport, newEstRapporteeParRapport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourDocumentAssocieAssociationRacineOperationnelleDocument() {
		if (aPourDocumentAssocieAssociationRacineOperationnelleDocument == null) {
			aPourDocumentAssocieAssociationRacineOperationnelleDocument = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_RACINE_OPERATIONNELLE__APOUR_DOCUMENT_ASSOCIE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT);
		}
		return aPourDocumentAssocieAssociationRacineOperationnelleDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_RACINE_OPERATIONNELLE__APOUR_AUTRE_NOM_AUTRE_NOM:
				return ((InternalEList<?>)getAPourAutreNomAutreNom()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_RACINE_OPERATIONNELLE__EST_RAPPORTEE_PAR_RAPPORT:
				return basicSetEstRapporteeParRapport(null, msgs);
			case SchemaPackage.TYPE_RACINE_OPERATIONNELLE__APOUR_DOCUMENT_ASSOCIE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT:
				return ((InternalEList<?>)getAPourDocumentAssocieAssociationRacineOperationnelleDocument()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_RACINE_OPERATIONNELLE__NOM:
				return getNom();
			case SchemaPackage.TYPE_RACINE_OPERATIONNELLE__COMMENTAIRE:
				return getCommentaire();
			case SchemaPackage.TYPE_RACINE_OPERATIONNELLE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_RACINE_OPERATIONNELLE__CE:
				return getCE();
			case SchemaPackage.TYPE_RACINE_OPERATIONNELLE__APOUR_AUTRE_NOM_AUTRE_NOM:
				return getAPourAutreNomAutreNom();
			case SchemaPackage.TYPE_RACINE_OPERATIONNELLE__EST_RAPPORTEE_PAR_RAPPORT:
				return getEstRapporteeParRapport();
			case SchemaPackage.TYPE_RACINE_OPERATIONNELLE__APOUR_DOCUMENT_ASSOCIE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT:
				return getAPourDocumentAssocieAssociationRacineOperationnelleDocument();
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
			case SchemaPackage.TYPE_RACINE_OPERATIONNELLE__NOM:
				setNom((String)newValue);
				return;
			case SchemaPackage.TYPE_RACINE_OPERATIONNELLE__COMMENTAIRE:
				setCommentaire((String)newValue);
				return;
			case SchemaPackage.TYPE_RACINE_OPERATIONNELLE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_RACINE_OPERATIONNELLE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_RACINE_OPERATIONNELLE__APOUR_AUTRE_NOM_AUTRE_NOM:
				getAPourAutreNomAutreNom().clear();
				getAPourAutreNomAutreNom().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_RACINE_OPERATIONNELLE__EST_RAPPORTEE_PAR_RAPPORT:
				setEstRapporteeParRapport((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_RACINE_OPERATIONNELLE__APOUR_DOCUMENT_ASSOCIE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT:
				getAPourDocumentAssocieAssociationRacineOperationnelleDocument().clear();
				getAPourDocumentAssocieAssociationRacineOperationnelleDocument().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_RACINE_OPERATIONNELLE__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RACINE_OPERATIONNELLE__COMMENTAIRE:
				setCommentaire(COMMENTAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RACINE_OPERATIONNELLE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RACINE_OPERATIONNELLE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RACINE_OPERATIONNELLE__APOUR_AUTRE_NOM_AUTRE_NOM:
				getAPourAutreNomAutreNom().clear();
				return;
			case SchemaPackage.TYPE_RACINE_OPERATIONNELLE__EST_RAPPORTEE_PAR_RAPPORT:
				setEstRapporteeParRapport((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_RACINE_OPERATIONNELLE__APOUR_DOCUMENT_ASSOCIE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT:
				getAPourDocumentAssocieAssociationRacineOperationnelleDocument().clear();
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
			case SchemaPackage.TYPE_RACINE_OPERATIONNELLE__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case SchemaPackage.TYPE_RACINE_OPERATIONNELLE__COMMENTAIRE:
				return COMMENTAIRE_EDEFAULT == null ? commentaire != null : !COMMENTAIRE_EDEFAULT.equals(commentaire);
			case SchemaPackage.TYPE_RACINE_OPERATIONNELLE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_RACINE_OPERATIONNELLE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_RACINE_OPERATIONNELLE__APOUR_AUTRE_NOM_AUTRE_NOM:
				return aPourAutreNomAutreNom != null && !aPourAutreNomAutreNom.isEmpty();
			case SchemaPackage.TYPE_RACINE_OPERATIONNELLE__EST_RAPPORTEE_PAR_RAPPORT:
				return estRapporteeParRapport != null;
			case SchemaPackage.TYPE_RACINE_OPERATIONNELLE__APOUR_DOCUMENT_ASSOCIE_ASSOCIATION_RACINE_OPERATIONNELLE_DOCUMENT:
				return aPourDocumentAssocieAssociationRacineOperationnelleDocument != null && !aPourDocumentAssocieAssociationRacineOperationnelleDocument.isEmpty();
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
		result.append(", commentaire: ");
		result.append(commentaire);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeRacineOperationnelleImpl
