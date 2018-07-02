/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeRessourceAttendue;
import mpia.schema.TypeRessourceElementaire;
import mpia.schema.TypeRessourcesALivrerOuADistribuer;

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
 * An implementation of the model object '<em><b>Type Ressources ALivrer Ou ADistribuer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeRessourcesALivrerOuADistribuerImpl#getDateDeDebut <em>Date De Debut</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRessourcesALivrerOuADistribuerImpl#getDateDeFin <em>Date De Fin</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRessourcesALivrerOuADistribuerImpl#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRessourcesALivrerOuADistribuerImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRessourcesALivrerOuADistribuerImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRessourcesALivrerOuADistribuerImpl#getACommeRessourceRavitaillementRessourceAttendue <em>AComme Ressource Ravitaillement Ressource Attendue</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRessourcesALivrerOuADistribuerImpl#getACommeRessourceElementaireRessourceElementaire <em>AComme Ressource Elementaire Ressource Elementaire</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeRessourcesALivrerOuADistribuerImpl extends EObjectImpl implements TypeRessourcesALivrerOuADistribuer {
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
	 * The cached value of the '{@link #getACommeRessourceRavitaillementRessourceAttendue() <em>AComme Ressource Ravitaillement Ressource Attendue</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeRessourceRavitaillementRessourceAttendue()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeRessourceAttendue> aCommeRessourceRavitaillementRessourceAttendue;

	/**
	 * The cached value of the '{@link #getACommeRessourceElementaireRessourceElementaire() <em>AComme Ressource Elementaire Ressource Elementaire</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeRessourceElementaireRessourceElementaire()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeRessourceElementaire> aCommeRessourceElementaireRessourceElementaire;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeRessourcesALivrerOuADistribuerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeRessourcesALivrerOuADistribuer();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESSOURCES_ALIVRER_OU_ADISTRIBUER__DATE_DE_DEBUT, oldDateDeDebut, dateDeDebut));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESSOURCES_ALIVRER_OU_ADISTRIBUER__DATE_DE_FIN, oldDateDeFin, dateDeFin));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESSOURCES_ALIVRER_OU_ADISTRIBUER__COMMENTAIRE, oldCommentaire, commentaire));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESSOURCES_ALIVRER_OU_ADISTRIBUER__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESSOURCES_ALIVRER_OU_ADISTRIBUER__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeRessourceAttendue> getACommeRessourceRavitaillementRessourceAttendue() {
		if (aCommeRessourceRavitaillementRessourceAttendue == null) {
			aCommeRessourceRavitaillementRessourceAttendue = new EObjectContainmentEList<TypeRessourceAttendue>(TypeRessourceAttendue.class, this, SchemaPackage.TYPE_RESSOURCES_ALIVRER_OU_ADISTRIBUER__ACOMME_RESSOURCE_RAVITAILLEMENT_RESSOURCE_ATTENDUE);
		}
		return aCommeRessourceRavitaillementRessourceAttendue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeRessourceElementaire> getACommeRessourceElementaireRessourceElementaire() {
		if (aCommeRessourceElementaireRessourceElementaire == null) {
			aCommeRessourceElementaireRessourceElementaire = new EObjectContainmentEList<TypeRessourceElementaire>(TypeRessourceElementaire.class, this, SchemaPackage.TYPE_RESSOURCES_ALIVRER_OU_ADISTRIBUER__ACOMME_RESSOURCE_ELEMENTAIRE_RESSOURCE_ELEMENTAIRE);
		}
		return aCommeRessourceElementaireRessourceElementaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_RESSOURCES_ALIVRER_OU_ADISTRIBUER__ACOMME_RESSOURCE_RAVITAILLEMENT_RESSOURCE_ATTENDUE:
				return ((InternalEList<?>)getACommeRessourceRavitaillementRessourceAttendue()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_RESSOURCES_ALIVRER_OU_ADISTRIBUER__ACOMME_RESSOURCE_ELEMENTAIRE_RESSOURCE_ELEMENTAIRE:
				return ((InternalEList<?>)getACommeRessourceElementaireRessourceElementaire()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_RESSOURCES_ALIVRER_OU_ADISTRIBUER__DATE_DE_DEBUT:
				return getDateDeDebut();
			case SchemaPackage.TYPE_RESSOURCES_ALIVRER_OU_ADISTRIBUER__DATE_DE_FIN:
				return getDateDeFin();
			case SchemaPackage.TYPE_RESSOURCES_ALIVRER_OU_ADISTRIBUER__COMMENTAIRE:
				return getCommentaire();
			case SchemaPackage.TYPE_RESSOURCES_ALIVRER_OU_ADISTRIBUER__CTE:
				return getCTE();
			case SchemaPackage.TYPE_RESSOURCES_ALIVRER_OU_ADISTRIBUER__CE:
				return getCE();
			case SchemaPackage.TYPE_RESSOURCES_ALIVRER_OU_ADISTRIBUER__ACOMME_RESSOURCE_RAVITAILLEMENT_RESSOURCE_ATTENDUE:
				return getACommeRessourceRavitaillementRessourceAttendue();
			case SchemaPackage.TYPE_RESSOURCES_ALIVRER_OU_ADISTRIBUER__ACOMME_RESSOURCE_ELEMENTAIRE_RESSOURCE_ELEMENTAIRE:
				return getACommeRessourceElementaireRessourceElementaire();
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
			case SchemaPackage.TYPE_RESSOURCES_ALIVRER_OU_ADISTRIBUER__DATE_DE_DEBUT:
				setDateDeDebut((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_RESSOURCES_ALIVRER_OU_ADISTRIBUER__DATE_DE_FIN:
				setDateDeFin((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_RESSOURCES_ALIVRER_OU_ADISTRIBUER__COMMENTAIRE:
				setCommentaire((String)newValue);
				return;
			case SchemaPackage.TYPE_RESSOURCES_ALIVRER_OU_ADISTRIBUER__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_RESSOURCES_ALIVRER_OU_ADISTRIBUER__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_RESSOURCES_ALIVRER_OU_ADISTRIBUER__ACOMME_RESSOURCE_RAVITAILLEMENT_RESSOURCE_ATTENDUE:
				getACommeRessourceRavitaillementRessourceAttendue().clear();
				getACommeRessourceRavitaillementRessourceAttendue().addAll((Collection<? extends TypeRessourceAttendue>)newValue);
				return;
			case SchemaPackage.TYPE_RESSOURCES_ALIVRER_OU_ADISTRIBUER__ACOMME_RESSOURCE_ELEMENTAIRE_RESSOURCE_ELEMENTAIRE:
				getACommeRessourceElementaireRessourceElementaire().clear();
				getACommeRessourceElementaireRessourceElementaire().addAll((Collection<? extends TypeRessourceElementaire>)newValue);
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
			case SchemaPackage.TYPE_RESSOURCES_ALIVRER_OU_ADISTRIBUER__DATE_DE_DEBUT:
				setDateDeDebut(DATE_DE_DEBUT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RESSOURCES_ALIVRER_OU_ADISTRIBUER__DATE_DE_FIN:
				setDateDeFin(DATE_DE_FIN_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RESSOURCES_ALIVRER_OU_ADISTRIBUER__COMMENTAIRE:
				setCommentaire(COMMENTAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RESSOURCES_ALIVRER_OU_ADISTRIBUER__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RESSOURCES_ALIVRER_OU_ADISTRIBUER__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RESSOURCES_ALIVRER_OU_ADISTRIBUER__ACOMME_RESSOURCE_RAVITAILLEMENT_RESSOURCE_ATTENDUE:
				getACommeRessourceRavitaillementRessourceAttendue().clear();
				return;
			case SchemaPackage.TYPE_RESSOURCES_ALIVRER_OU_ADISTRIBUER__ACOMME_RESSOURCE_ELEMENTAIRE_RESSOURCE_ELEMENTAIRE:
				getACommeRessourceElementaireRessourceElementaire().clear();
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
			case SchemaPackage.TYPE_RESSOURCES_ALIVRER_OU_ADISTRIBUER__DATE_DE_DEBUT:
				return DATE_DE_DEBUT_EDEFAULT == null ? dateDeDebut != null : !DATE_DE_DEBUT_EDEFAULT.equals(dateDeDebut);
			case SchemaPackage.TYPE_RESSOURCES_ALIVRER_OU_ADISTRIBUER__DATE_DE_FIN:
				return DATE_DE_FIN_EDEFAULT == null ? dateDeFin != null : !DATE_DE_FIN_EDEFAULT.equals(dateDeFin);
			case SchemaPackage.TYPE_RESSOURCES_ALIVRER_OU_ADISTRIBUER__COMMENTAIRE:
				return COMMENTAIRE_EDEFAULT == null ? commentaire != null : !COMMENTAIRE_EDEFAULT.equals(commentaire);
			case SchemaPackage.TYPE_RESSOURCES_ALIVRER_OU_ADISTRIBUER__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_RESSOURCES_ALIVRER_OU_ADISTRIBUER__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_RESSOURCES_ALIVRER_OU_ADISTRIBUER__ACOMME_RESSOURCE_RAVITAILLEMENT_RESSOURCE_ATTENDUE:
				return aCommeRessourceRavitaillementRessourceAttendue != null && !aCommeRessourceRavitaillementRessourceAttendue.isEmpty();
			case SchemaPackage.TYPE_RESSOURCES_ALIVRER_OU_ADISTRIBUER__ACOMME_RESSOURCE_ELEMENTAIRE_RESSOURCE_ELEMENTAIRE:
				return aCommeRessourceElementaireRessourceElementaire != null && !aCommeRessourceElementaireRessourceElementaire.isEmpty();
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
		result.append(" (dateDeDebut: ");
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

} //TypeRessourcesALivrerOuADistribuerImpl
