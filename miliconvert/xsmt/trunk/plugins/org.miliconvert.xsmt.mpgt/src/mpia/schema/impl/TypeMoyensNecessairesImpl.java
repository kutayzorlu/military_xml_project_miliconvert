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
import mpia.schema.TypeDictionaryDicoMoyenTypeMoyen;
import mpia.schema.TypeMoyensNecessaires;

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
 * An implementation of the model object '<em><b>Type Moyens Necessaires</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMoyensNecessairesImpl#getTypeMoyen <em>Type Moyen</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyensNecessairesImpl#getQuantiteNecessaire <em>Quantite Necessaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyensNecessairesImpl#getDebutActivation <em>Debut Activation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyensNecessairesImpl#getFinActivation <em>Fin Activation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyensNecessairesImpl#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyensNecessairesImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyensNecessairesImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyensNecessairesImpl#getEstDecritParTypeMateriel <em>Est Decrit Par Type Materiel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMoyensNecessairesImpl extends EObjectImpl implements TypeMoyensNecessaires {
	/**
	 * The default value of the '{@link #getTypeMoyen() <em>Type Moyen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMoyen()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoMoyenTypeMoyen TYPE_MOYEN_EDEFAULT = TypeDictionaryDicoMoyenTypeMoyen.MINE;

	/**
	 * The cached value of the '{@link #getTypeMoyen() <em>Type Moyen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMoyen()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoMoyenTypeMoyen typeMoyen = TYPE_MOYEN_EDEFAULT;

	/**
	 * This is true if the Type Moyen attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeMoyenESet;

	/**
	 * The default value of the '{@link #getQuantiteNecessaire() <em>Quantite Necessaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteNecessaire()
	 * @generated
	 * @ordered
	 */
	protected static final long QUANTITE_NECESSAIRE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getQuantiteNecessaire() <em>Quantite Necessaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteNecessaire()
	 * @generated
	 * @ordered
	 */
	protected long quantiteNecessaire = QUANTITE_NECESSAIRE_EDEFAULT;

	/**
	 * This is true if the Quantite Necessaire attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean quantiteNecessaireESet;

	/**
	 * The default value of the '{@link #getDebutActivation() <em>Debut Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebutActivation()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DEBUT_ACTIVATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDebutActivation() <em>Debut Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebutActivation()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar debutActivation = DEBUT_ACTIVATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinActivation() <em>Fin Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinActivation()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar FIN_ACTIVATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFinActivation() <em>Fin Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinActivation()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar finActivation = FIN_ACTIVATION_EDEFAULT;

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
	 * The cached value of the '{@link #getEstDecritParTypeMateriel() <em>Est Decrit Par Type Materiel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstDecritParTypeMateriel()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociationEXT> estDecritParTypeMateriel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMoyensNecessairesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMoyensNecessaires();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoMoyenTypeMoyen getTypeMoyen() {
		return typeMoyen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeMoyen(TypeDictionaryDicoMoyenTypeMoyen newTypeMoyen) {
		TypeDictionaryDicoMoyenTypeMoyen oldTypeMoyen = typeMoyen;
		typeMoyen = newTypeMoyen == null ? TYPE_MOYEN_EDEFAULT : newTypeMoyen;
		boolean oldTypeMoyenESet = typeMoyenESet;
		typeMoyenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYENS_NECESSAIRES__TYPE_MOYEN, oldTypeMoyen, typeMoyen, !oldTypeMoyenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeMoyen() {
		TypeDictionaryDicoMoyenTypeMoyen oldTypeMoyen = typeMoyen;
		boolean oldTypeMoyenESet = typeMoyenESet;
		typeMoyen = TYPE_MOYEN_EDEFAULT;
		typeMoyenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MOYENS_NECESSAIRES__TYPE_MOYEN, oldTypeMoyen, TYPE_MOYEN_EDEFAULT, oldTypeMoyenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeMoyen() {
		return typeMoyenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getQuantiteNecessaire() {
		return quantiteNecessaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantiteNecessaire(long newQuantiteNecessaire) {
		long oldQuantiteNecessaire = quantiteNecessaire;
		quantiteNecessaire = newQuantiteNecessaire;
		boolean oldQuantiteNecessaireESet = quantiteNecessaireESet;
		quantiteNecessaireESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYENS_NECESSAIRES__QUANTITE_NECESSAIRE, oldQuantiteNecessaire, quantiteNecessaire, !oldQuantiteNecessaireESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQuantiteNecessaire() {
		long oldQuantiteNecessaire = quantiteNecessaire;
		boolean oldQuantiteNecessaireESet = quantiteNecessaireESet;
		quantiteNecessaire = QUANTITE_NECESSAIRE_EDEFAULT;
		quantiteNecessaireESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MOYENS_NECESSAIRES__QUANTITE_NECESSAIRE, oldQuantiteNecessaire, QUANTITE_NECESSAIRE_EDEFAULT, oldQuantiteNecessaireESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQuantiteNecessaire() {
		return quantiteNecessaireESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDebutActivation() {
		return debutActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDebutActivation(XMLGregorianCalendar newDebutActivation) {
		XMLGregorianCalendar oldDebutActivation = debutActivation;
		debutActivation = newDebutActivation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYENS_NECESSAIRES__DEBUT_ACTIVATION, oldDebutActivation, debutActivation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getFinActivation() {
		return finActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinActivation(XMLGregorianCalendar newFinActivation) {
		XMLGregorianCalendar oldFinActivation = finActivation;
		finActivation = newFinActivation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYENS_NECESSAIRES__FIN_ACTIVATION, oldFinActivation, finActivation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYENS_NECESSAIRES__COMMENTAIRE, oldCommentaire, commentaire));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYENS_NECESSAIRES__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYENS_NECESSAIRES__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEXT> getEstDecritParTypeMateriel() {
		if (estDecritParTypeMateriel == null) {
			estDecritParTypeMateriel = new EObjectContainmentEList<TypeAssociationEXT>(TypeAssociationEXT.class, this, SchemaPackage.TYPE_MOYENS_NECESSAIRES__EST_DECRIT_PAR_TYPE_MATERIEL);
		}
		return estDecritParTypeMateriel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MOYENS_NECESSAIRES__EST_DECRIT_PAR_TYPE_MATERIEL:
				return ((InternalEList<?>)getEstDecritParTypeMateriel()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_MOYENS_NECESSAIRES__TYPE_MOYEN:
				return getTypeMoyen();
			case SchemaPackage.TYPE_MOYENS_NECESSAIRES__QUANTITE_NECESSAIRE:
				return new Long(getQuantiteNecessaire());
			case SchemaPackage.TYPE_MOYENS_NECESSAIRES__DEBUT_ACTIVATION:
				return getDebutActivation();
			case SchemaPackage.TYPE_MOYENS_NECESSAIRES__FIN_ACTIVATION:
				return getFinActivation();
			case SchemaPackage.TYPE_MOYENS_NECESSAIRES__COMMENTAIRE:
				return getCommentaire();
			case SchemaPackage.TYPE_MOYENS_NECESSAIRES__CTE:
				return getCTE();
			case SchemaPackage.TYPE_MOYENS_NECESSAIRES__CE:
				return getCE();
			case SchemaPackage.TYPE_MOYENS_NECESSAIRES__EST_DECRIT_PAR_TYPE_MATERIEL:
				return getEstDecritParTypeMateriel();
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
			case SchemaPackage.TYPE_MOYENS_NECESSAIRES__TYPE_MOYEN:
				setTypeMoyen((TypeDictionaryDicoMoyenTypeMoyen)newValue);
				return;
			case SchemaPackage.TYPE_MOYENS_NECESSAIRES__QUANTITE_NECESSAIRE:
				setQuantiteNecessaire(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_MOYENS_NECESSAIRES__DEBUT_ACTIVATION:
				setDebutActivation((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_MOYENS_NECESSAIRES__FIN_ACTIVATION:
				setFinActivation((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_MOYENS_NECESSAIRES__COMMENTAIRE:
				setCommentaire((String)newValue);
				return;
			case SchemaPackage.TYPE_MOYENS_NECESSAIRES__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_MOYENS_NECESSAIRES__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_MOYENS_NECESSAIRES__EST_DECRIT_PAR_TYPE_MATERIEL:
				getEstDecritParTypeMateriel().clear();
				getEstDecritParTypeMateriel().addAll((Collection<? extends TypeAssociationEXT>)newValue);
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
			case SchemaPackage.TYPE_MOYENS_NECESSAIRES__TYPE_MOYEN:
				unsetTypeMoyen();
				return;
			case SchemaPackage.TYPE_MOYENS_NECESSAIRES__QUANTITE_NECESSAIRE:
				unsetQuantiteNecessaire();
				return;
			case SchemaPackage.TYPE_MOYENS_NECESSAIRES__DEBUT_ACTIVATION:
				setDebutActivation(DEBUT_ACTIVATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MOYENS_NECESSAIRES__FIN_ACTIVATION:
				setFinActivation(FIN_ACTIVATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MOYENS_NECESSAIRES__COMMENTAIRE:
				setCommentaire(COMMENTAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MOYENS_NECESSAIRES__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MOYENS_NECESSAIRES__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MOYENS_NECESSAIRES__EST_DECRIT_PAR_TYPE_MATERIEL:
				getEstDecritParTypeMateriel().clear();
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
			case SchemaPackage.TYPE_MOYENS_NECESSAIRES__TYPE_MOYEN:
				return isSetTypeMoyen();
			case SchemaPackage.TYPE_MOYENS_NECESSAIRES__QUANTITE_NECESSAIRE:
				return isSetQuantiteNecessaire();
			case SchemaPackage.TYPE_MOYENS_NECESSAIRES__DEBUT_ACTIVATION:
				return DEBUT_ACTIVATION_EDEFAULT == null ? debutActivation != null : !DEBUT_ACTIVATION_EDEFAULT.equals(debutActivation);
			case SchemaPackage.TYPE_MOYENS_NECESSAIRES__FIN_ACTIVATION:
				return FIN_ACTIVATION_EDEFAULT == null ? finActivation != null : !FIN_ACTIVATION_EDEFAULT.equals(finActivation);
			case SchemaPackage.TYPE_MOYENS_NECESSAIRES__COMMENTAIRE:
				return COMMENTAIRE_EDEFAULT == null ? commentaire != null : !COMMENTAIRE_EDEFAULT.equals(commentaire);
			case SchemaPackage.TYPE_MOYENS_NECESSAIRES__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_MOYENS_NECESSAIRES__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_MOYENS_NECESSAIRES__EST_DECRIT_PAR_TYPE_MATERIEL:
				return estDecritParTypeMateriel != null && !estDecritParTypeMateriel.isEmpty();
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
		result.append(" (typeMoyen: ");
		if (typeMoyenESet) result.append(typeMoyen); else result.append("<unset>");
		result.append(", quantiteNecessaire: ");
		if (quantiteNecessaireESet) result.append(quantiteNecessaire); else result.append("<unset>");
		result.append(", debutActivation: ");
		result.append(debutActivation);
		result.append(", finActivation: ");
		result.append(finActivation);
		result.append(", commentaire: ");
		result.append(commentaire);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeMoyensNecessairesImpl
