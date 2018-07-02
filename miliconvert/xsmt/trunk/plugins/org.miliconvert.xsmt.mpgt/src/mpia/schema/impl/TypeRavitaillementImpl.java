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
import mpia.schema.TypeRavitaillement;

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
 * An implementation of the model object '<em><b>Type Ravitaillement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeRavitaillementImpl#getNomIlot <em>Nom Ilot</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRavitaillementImpl#getDateDeDebut <em>Date De Debut</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRavitaillementImpl#getDateDeFin <em>Date De Fin</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRavitaillementImpl#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRavitaillementImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRavitaillementImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRavitaillementImpl#getACommePointDeRaccordementAutreElementControle <em>AComme Point De Raccordement Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRavitaillementImpl#getDecritCaracteristiquesUnitesARavitaillerUnite <em>Decrit Caracteristiques Unites ARavitailler Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeRavitaillementImpl extends EObjectImpl implements TypeRavitaillement {
	/**
	 * The default value of the '{@link #getNomIlot() <em>Nom Ilot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomIlot()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_ILOT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomIlot() <em>Nom Ilot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomIlot()
	 * @generated
	 * @ordered
	 */
	protected String nomIlot = NOM_ILOT_EDEFAULT;

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
	 * The cached value of the '{@link #getACommePointDeRaccordementAutreElementControle() <em>AComme Point De Raccordement Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommePointDeRaccordementAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aCommePointDeRaccordementAutreElementControle;

	/**
	 * The cached value of the '{@link #getDecritCaracteristiquesUnitesARavitaillerUnite() <em>Decrit Caracteristiques Unites ARavitailler Unite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecritCaracteristiquesUnitesARavitaillerUnite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociationEXT> decritCaracteristiquesUnitesARavitaillerUnite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeRavitaillementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeRavitaillement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNomIlot() {
		return nomIlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomIlot(String newNomIlot) {
		String oldNomIlot = nomIlot;
		nomIlot = newNomIlot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RAVITAILLEMENT__NOM_ILOT, oldNomIlot, nomIlot));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RAVITAILLEMENT__DATE_DE_DEBUT, oldDateDeDebut, dateDeDebut));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RAVITAILLEMENT__DATE_DE_FIN, oldDateDeFin, dateDeFin));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RAVITAILLEMENT__COMMENTAIRE, oldCommentaire, commentaire));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RAVITAILLEMENT__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RAVITAILLEMENT__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getACommePointDeRaccordementAutreElementControle() {
		return aCommePointDeRaccordementAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommePointDeRaccordementAutreElementControle(TypeAssociation newACommePointDeRaccordementAutreElementControle, NotificationChain msgs) {
		TypeAssociation oldACommePointDeRaccordementAutreElementControle = aCommePointDeRaccordementAutreElementControle;
		aCommePointDeRaccordementAutreElementControle = newACommePointDeRaccordementAutreElementControle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RAVITAILLEMENT__ACOMME_POINT_DE_RACCORDEMENT_AUTRE_ELEMENT_CONTROLE, oldACommePointDeRaccordementAutreElementControle, newACommePointDeRaccordementAutreElementControle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommePointDeRaccordementAutreElementControle(TypeAssociation newACommePointDeRaccordementAutreElementControle) {
		if (newACommePointDeRaccordementAutreElementControle != aCommePointDeRaccordementAutreElementControle) {
			NotificationChain msgs = null;
			if (aCommePointDeRaccordementAutreElementControle != null)
				msgs = ((InternalEObject)aCommePointDeRaccordementAutreElementControle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RAVITAILLEMENT__ACOMME_POINT_DE_RACCORDEMENT_AUTRE_ELEMENT_CONTROLE, null, msgs);
			if (newACommePointDeRaccordementAutreElementControle != null)
				msgs = ((InternalEObject)newACommePointDeRaccordementAutreElementControle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RAVITAILLEMENT__ACOMME_POINT_DE_RACCORDEMENT_AUTRE_ELEMENT_CONTROLE, null, msgs);
			msgs = basicSetACommePointDeRaccordementAutreElementControle(newACommePointDeRaccordementAutreElementControle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RAVITAILLEMENT__ACOMME_POINT_DE_RACCORDEMENT_AUTRE_ELEMENT_CONTROLE, newACommePointDeRaccordementAutreElementControle, newACommePointDeRaccordementAutreElementControle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEXT> getDecritCaracteristiquesUnitesARavitaillerUnite() {
		if (decritCaracteristiquesUnitesARavitaillerUnite == null) {
			decritCaracteristiquesUnitesARavitaillerUnite = new EObjectContainmentEList<TypeAssociationEXT>(TypeAssociationEXT.class, this, SchemaPackage.TYPE_RAVITAILLEMENT__DECRIT_CARACTERISTIQUES_UNITES_ARAVITAILLER_UNITE);
		}
		return decritCaracteristiquesUnitesARavitaillerUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_RAVITAILLEMENT__ACOMME_POINT_DE_RACCORDEMENT_AUTRE_ELEMENT_CONTROLE:
				return basicSetACommePointDeRaccordementAutreElementControle(null, msgs);
			case SchemaPackage.TYPE_RAVITAILLEMENT__DECRIT_CARACTERISTIQUES_UNITES_ARAVITAILLER_UNITE:
				return ((InternalEList<?>)getDecritCaracteristiquesUnitesARavitaillerUnite()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_RAVITAILLEMENT__NOM_ILOT:
				return getNomIlot();
			case SchemaPackage.TYPE_RAVITAILLEMENT__DATE_DE_DEBUT:
				return getDateDeDebut();
			case SchemaPackage.TYPE_RAVITAILLEMENT__DATE_DE_FIN:
				return getDateDeFin();
			case SchemaPackage.TYPE_RAVITAILLEMENT__COMMENTAIRE:
				return getCommentaire();
			case SchemaPackage.TYPE_RAVITAILLEMENT__CTE:
				return getCTE();
			case SchemaPackage.TYPE_RAVITAILLEMENT__CE:
				return getCE();
			case SchemaPackage.TYPE_RAVITAILLEMENT__ACOMME_POINT_DE_RACCORDEMENT_AUTRE_ELEMENT_CONTROLE:
				return getACommePointDeRaccordementAutreElementControle();
			case SchemaPackage.TYPE_RAVITAILLEMENT__DECRIT_CARACTERISTIQUES_UNITES_ARAVITAILLER_UNITE:
				return getDecritCaracteristiquesUnitesARavitaillerUnite();
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
			case SchemaPackage.TYPE_RAVITAILLEMENT__NOM_ILOT:
				setNomIlot((String)newValue);
				return;
			case SchemaPackage.TYPE_RAVITAILLEMENT__DATE_DE_DEBUT:
				setDateDeDebut((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_RAVITAILLEMENT__DATE_DE_FIN:
				setDateDeFin((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_RAVITAILLEMENT__COMMENTAIRE:
				setCommentaire((String)newValue);
				return;
			case SchemaPackage.TYPE_RAVITAILLEMENT__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_RAVITAILLEMENT__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_RAVITAILLEMENT__ACOMME_POINT_DE_RACCORDEMENT_AUTRE_ELEMENT_CONTROLE:
				setACommePointDeRaccordementAutreElementControle((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_RAVITAILLEMENT__DECRIT_CARACTERISTIQUES_UNITES_ARAVITAILLER_UNITE:
				getDecritCaracteristiquesUnitesARavitaillerUnite().clear();
				getDecritCaracteristiquesUnitesARavitaillerUnite().addAll((Collection<? extends TypeAssociationEXT>)newValue);
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
			case SchemaPackage.TYPE_RAVITAILLEMENT__NOM_ILOT:
				setNomIlot(NOM_ILOT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RAVITAILLEMENT__DATE_DE_DEBUT:
				setDateDeDebut(DATE_DE_DEBUT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RAVITAILLEMENT__DATE_DE_FIN:
				setDateDeFin(DATE_DE_FIN_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RAVITAILLEMENT__COMMENTAIRE:
				setCommentaire(COMMENTAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RAVITAILLEMENT__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RAVITAILLEMENT__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RAVITAILLEMENT__ACOMME_POINT_DE_RACCORDEMENT_AUTRE_ELEMENT_CONTROLE:
				setACommePointDeRaccordementAutreElementControle((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_RAVITAILLEMENT__DECRIT_CARACTERISTIQUES_UNITES_ARAVITAILLER_UNITE:
				getDecritCaracteristiquesUnitesARavitaillerUnite().clear();
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
			case SchemaPackage.TYPE_RAVITAILLEMENT__NOM_ILOT:
				return NOM_ILOT_EDEFAULT == null ? nomIlot != null : !NOM_ILOT_EDEFAULT.equals(nomIlot);
			case SchemaPackage.TYPE_RAVITAILLEMENT__DATE_DE_DEBUT:
				return DATE_DE_DEBUT_EDEFAULT == null ? dateDeDebut != null : !DATE_DE_DEBUT_EDEFAULT.equals(dateDeDebut);
			case SchemaPackage.TYPE_RAVITAILLEMENT__DATE_DE_FIN:
				return DATE_DE_FIN_EDEFAULT == null ? dateDeFin != null : !DATE_DE_FIN_EDEFAULT.equals(dateDeFin);
			case SchemaPackage.TYPE_RAVITAILLEMENT__COMMENTAIRE:
				return COMMENTAIRE_EDEFAULT == null ? commentaire != null : !COMMENTAIRE_EDEFAULT.equals(commentaire);
			case SchemaPackage.TYPE_RAVITAILLEMENT__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_RAVITAILLEMENT__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_RAVITAILLEMENT__ACOMME_POINT_DE_RACCORDEMENT_AUTRE_ELEMENT_CONTROLE:
				return aCommePointDeRaccordementAutreElementControle != null;
			case SchemaPackage.TYPE_RAVITAILLEMENT__DECRIT_CARACTERISTIQUES_UNITES_ARAVITAILLER_UNITE:
				return decritCaracteristiquesUnitesARavitaillerUnite != null && !decritCaracteristiquesUnitesARavitaillerUnite.isEmpty();
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
		result.append(" (nomIlot: ");
		result.append(nomIlot);
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

} //TypeRavitaillementImpl
