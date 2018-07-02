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
import mpia.schema.TypeConsigneLutteAntiaerienneTTA;
import mpia.schema.TypeDictionaryDicoConsigneLutteAntiaerienneTTARegleOuvertureFeu;

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
 * An implementation of the model object '<em><b>Type Consigne Lutte Antiaerienne TTA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeConsigneLutteAntiaerienneTTAImpl#getRegleOuvertureFeu <em>Regle Ouverture Feu</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsigneLutteAntiaerienneTTAImpl#getDebutApplication <em>Debut Application</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsigneLutteAntiaerienneTTAImpl#getFinApplication <em>Fin Application</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsigneLutteAntiaerienneTTAImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsigneLutteAntiaerienneTTAImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsigneLutteAntiaerienneTTAImpl#getConcerneEnginsVolantsTypeAeronef <em>Concerne Engins Volants Type Aeronef</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsigneLutteAntiaerienneTTAImpl#getConcerneUnitesUnite <em>Concerne Unites Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsigneLutteAntiaerienneTTAImpl#getACommeLigneApplicationAutreElementControle <em>AComme Ligne Application Autre Element Controle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeConsigneLutteAntiaerienneTTAImpl extends EObjectImpl implements TypeConsigneLutteAntiaerienneTTA {
	/**
	 * The default value of the '{@link #getRegleOuvertureFeu() <em>Regle Ouverture Feu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegleOuvertureFeu()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoConsigneLutteAntiaerienneTTARegleOuvertureFeu REGLE_OUVERTURE_FEU_EDEFAULT = TypeDictionaryDicoConsigneLutteAntiaerienneTTARegleOuvertureFeu.FIRFBD;

	/**
	 * The cached value of the '{@link #getRegleOuvertureFeu() <em>Regle Ouverture Feu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegleOuvertureFeu()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoConsigneLutteAntiaerienneTTARegleOuvertureFeu regleOuvertureFeu = REGLE_OUVERTURE_FEU_EDEFAULT;

	/**
	 * This is true if the Regle Ouverture Feu attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean regleOuvertureFeuESet;

	/**
	 * The default value of the '{@link #getDebutApplication() <em>Debut Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebutApplication()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DEBUT_APPLICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDebutApplication() <em>Debut Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebutApplication()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar debutApplication = DEBUT_APPLICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinApplication() <em>Fin Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinApplication()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar FIN_APPLICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFinApplication() <em>Fin Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinApplication()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar finApplication = FIN_APPLICATION_EDEFAULT;

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
	 * The cached value of the '{@link #getConcerneEnginsVolantsTypeAeronef() <em>Concerne Engins Volants Type Aeronef</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneEnginsVolantsTypeAeronef()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT concerneEnginsVolantsTypeAeronef;

	/**
	 * The cached value of the '{@link #getConcerneUnitesUnite() <em>Concerne Unites Unite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneUnitesUnite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociationEXT> concerneUnitesUnite;

	/**
	 * The cached value of the '{@link #getACommeLigneApplicationAutreElementControle() <em>AComme Ligne Application Autre Element Controle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeLigneApplicationAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aCommeLigneApplicationAutreElementControle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeConsigneLutteAntiaerienneTTAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeConsigneLutteAntiaerienneTTA();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoConsigneLutteAntiaerienneTTARegleOuvertureFeu getRegleOuvertureFeu() {
		return regleOuvertureFeu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegleOuvertureFeu(TypeDictionaryDicoConsigneLutteAntiaerienneTTARegleOuvertureFeu newRegleOuvertureFeu) {
		TypeDictionaryDicoConsigneLutteAntiaerienneTTARegleOuvertureFeu oldRegleOuvertureFeu = regleOuvertureFeu;
		regleOuvertureFeu = newRegleOuvertureFeu == null ? REGLE_OUVERTURE_FEU_EDEFAULT : newRegleOuvertureFeu;
		boolean oldRegleOuvertureFeuESet = regleOuvertureFeuESet;
		regleOuvertureFeuESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNE_LUTTE_ANTIAERIENNE_TTA__REGLE_OUVERTURE_FEU, oldRegleOuvertureFeu, regleOuvertureFeu, !oldRegleOuvertureFeuESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRegleOuvertureFeu() {
		TypeDictionaryDicoConsigneLutteAntiaerienneTTARegleOuvertureFeu oldRegleOuvertureFeu = regleOuvertureFeu;
		boolean oldRegleOuvertureFeuESet = regleOuvertureFeuESet;
		regleOuvertureFeu = REGLE_OUVERTURE_FEU_EDEFAULT;
		regleOuvertureFeuESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CONSIGNE_LUTTE_ANTIAERIENNE_TTA__REGLE_OUVERTURE_FEU, oldRegleOuvertureFeu, REGLE_OUVERTURE_FEU_EDEFAULT, oldRegleOuvertureFeuESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRegleOuvertureFeu() {
		return regleOuvertureFeuESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDebutApplication() {
		return debutApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDebutApplication(XMLGregorianCalendar newDebutApplication) {
		XMLGregorianCalendar oldDebutApplication = debutApplication;
		debutApplication = newDebutApplication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNE_LUTTE_ANTIAERIENNE_TTA__DEBUT_APPLICATION, oldDebutApplication, debutApplication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getFinApplication() {
		return finApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinApplication(XMLGregorianCalendar newFinApplication) {
		XMLGregorianCalendar oldFinApplication = finApplication;
		finApplication = newFinApplication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNE_LUTTE_ANTIAERIENNE_TTA__FIN_APPLICATION, oldFinApplication, finApplication));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNE_LUTTE_ANTIAERIENNE_TTA__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNE_LUTTE_ANTIAERIENNE_TTA__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getConcerneEnginsVolantsTypeAeronef() {
		return concerneEnginsVolantsTypeAeronef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcerneEnginsVolantsTypeAeronef(TypeAssociationEXT newConcerneEnginsVolantsTypeAeronef, NotificationChain msgs) {
		TypeAssociationEXT oldConcerneEnginsVolantsTypeAeronef = concerneEnginsVolantsTypeAeronef;
		concerneEnginsVolantsTypeAeronef = newConcerneEnginsVolantsTypeAeronef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNE_LUTTE_ANTIAERIENNE_TTA__CONCERNE_ENGINS_VOLANTS_TYPE_AERONEF, oldConcerneEnginsVolantsTypeAeronef, newConcerneEnginsVolantsTypeAeronef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcerneEnginsVolantsTypeAeronef(TypeAssociationEXT newConcerneEnginsVolantsTypeAeronef) {
		if (newConcerneEnginsVolantsTypeAeronef != concerneEnginsVolantsTypeAeronef) {
			NotificationChain msgs = null;
			if (concerneEnginsVolantsTypeAeronef != null)
				msgs = ((InternalEObject)concerneEnginsVolantsTypeAeronef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONSIGNE_LUTTE_ANTIAERIENNE_TTA__CONCERNE_ENGINS_VOLANTS_TYPE_AERONEF, null, msgs);
			if (newConcerneEnginsVolantsTypeAeronef != null)
				msgs = ((InternalEObject)newConcerneEnginsVolantsTypeAeronef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONSIGNE_LUTTE_ANTIAERIENNE_TTA__CONCERNE_ENGINS_VOLANTS_TYPE_AERONEF, null, msgs);
			msgs = basicSetConcerneEnginsVolantsTypeAeronef(newConcerneEnginsVolantsTypeAeronef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNE_LUTTE_ANTIAERIENNE_TTA__CONCERNE_ENGINS_VOLANTS_TYPE_AERONEF, newConcerneEnginsVolantsTypeAeronef, newConcerneEnginsVolantsTypeAeronef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEXT> getConcerneUnitesUnite() {
		if (concerneUnitesUnite == null) {
			concerneUnitesUnite = new EObjectContainmentEList<TypeAssociationEXT>(TypeAssociationEXT.class, this, SchemaPackage.TYPE_CONSIGNE_LUTTE_ANTIAERIENNE_TTA__CONCERNE_UNITES_UNITE);
		}
		return concerneUnitesUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getACommeLigneApplicationAutreElementControle() {
		if (aCommeLigneApplicationAutreElementControle == null) {
			aCommeLigneApplicationAutreElementControle = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_CONSIGNE_LUTTE_ANTIAERIENNE_TTA__ACOMME_LIGNE_APPLICATION_AUTRE_ELEMENT_CONTROLE);
		}
		return aCommeLigneApplicationAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_CONSIGNE_LUTTE_ANTIAERIENNE_TTA__CONCERNE_ENGINS_VOLANTS_TYPE_AERONEF:
				return basicSetConcerneEnginsVolantsTypeAeronef(null, msgs);
			case SchemaPackage.TYPE_CONSIGNE_LUTTE_ANTIAERIENNE_TTA__CONCERNE_UNITES_UNITE:
				return ((InternalEList<?>)getConcerneUnitesUnite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_CONSIGNE_LUTTE_ANTIAERIENNE_TTA__ACOMME_LIGNE_APPLICATION_AUTRE_ELEMENT_CONTROLE:
				return ((InternalEList<?>)getACommeLigneApplicationAutreElementControle()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_CONSIGNE_LUTTE_ANTIAERIENNE_TTA__REGLE_OUVERTURE_FEU:
				return getRegleOuvertureFeu();
			case SchemaPackage.TYPE_CONSIGNE_LUTTE_ANTIAERIENNE_TTA__DEBUT_APPLICATION:
				return getDebutApplication();
			case SchemaPackage.TYPE_CONSIGNE_LUTTE_ANTIAERIENNE_TTA__FIN_APPLICATION:
				return getFinApplication();
			case SchemaPackage.TYPE_CONSIGNE_LUTTE_ANTIAERIENNE_TTA__CTE:
				return getCTE();
			case SchemaPackage.TYPE_CONSIGNE_LUTTE_ANTIAERIENNE_TTA__CE:
				return getCE();
			case SchemaPackage.TYPE_CONSIGNE_LUTTE_ANTIAERIENNE_TTA__CONCERNE_ENGINS_VOLANTS_TYPE_AERONEF:
				return getConcerneEnginsVolantsTypeAeronef();
			case SchemaPackage.TYPE_CONSIGNE_LUTTE_ANTIAERIENNE_TTA__CONCERNE_UNITES_UNITE:
				return getConcerneUnitesUnite();
			case SchemaPackage.TYPE_CONSIGNE_LUTTE_ANTIAERIENNE_TTA__ACOMME_LIGNE_APPLICATION_AUTRE_ELEMENT_CONTROLE:
				return getACommeLigneApplicationAutreElementControle();
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
			case SchemaPackage.TYPE_CONSIGNE_LUTTE_ANTIAERIENNE_TTA__REGLE_OUVERTURE_FEU:
				setRegleOuvertureFeu((TypeDictionaryDicoConsigneLutteAntiaerienneTTARegleOuvertureFeu)newValue);
				return;
			case SchemaPackage.TYPE_CONSIGNE_LUTTE_ANTIAERIENNE_TTA__DEBUT_APPLICATION:
				setDebutApplication((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_CONSIGNE_LUTTE_ANTIAERIENNE_TTA__FIN_APPLICATION:
				setFinApplication((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_CONSIGNE_LUTTE_ANTIAERIENNE_TTA__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_CONSIGNE_LUTTE_ANTIAERIENNE_TTA__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_CONSIGNE_LUTTE_ANTIAERIENNE_TTA__CONCERNE_ENGINS_VOLANTS_TYPE_AERONEF:
				setConcerneEnginsVolantsTypeAeronef((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_CONSIGNE_LUTTE_ANTIAERIENNE_TTA__CONCERNE_UNITES_UNITE:
				getConcerneUnitesUnite().clear();
				getConcerneUnitesUnite().addAll((Collection<? extends TypeAssociationEXT>)newValue);
				return;
			case SchemaPackage.TYPE_CONSIGNE_LUTTE_ANTIAERIENNE_TTA__ACOMME_LIGNE_APPLICATION_AUTRE_ELEMENT_CONTROLE:
				getACommeLigneApplicationAutreElementControle().clear();
				getACommeLigneApplicationAutreElementControle().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_CONSIGNE_LUTTE_ANTIAERIENNE_TTA__REGLE_OUVERTURE_FEU:
				unsetRegleOuvertureFeu();
				return;
			case SchemaPackage.TYPE_CONSIGNE_LUTTE_ANTIAERIENNE_TTA__DEBUT_APPLICATION:
				setDebutApplication(DEBUT_APPLICATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CONSIGNE_LUTTE_ANTIAERIENNE_TTA__FIN_APPLICATION:
				setFinApplication(FIN_APPLICATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CONSIGNE_LUTTE_ANTIAERIENNE_TTA__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CONSIGNE_LUTTE_ANTIAERIENNE_TTA__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CONSIGNE_LUTTE_ANTIAERIENNE_TTA__CONCERNE_ENGINS_VOLANTS_TYPE_AERONEF:
				setConcerneEnginsVolantsTypeAeronef((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_CONSIGNE_LUTTE_ANTIAERIENNE_TTA__CONCERNE_UNITES_UNITE:
				getConcerneUnitesUnite().clear();
				return;
			case SchemaPackage.TYPE_CONSIGNE_LUTTE_ANTIAERIENNE_TTA__ACOMME_LIGNE_APPLICATION_AUTRE_ELEMENT_CONTROLE:
				getACommeLigneApplicationAutreElementControle().clear();
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
			case SchemaPackage.TYPE_CONSIGNE_LUTTE_ANTIAERIENNE_TTA__REGLE_OUVERTURE_FEU:
				return isSetRegleOuvertureFeu();
			case SchemaPackage.TYPE_CONSIGNE_LUTTE_ANTIAERIENNE_TTA__DEBUT_APPLICATION:
				return DEBUT_APPLICATION_EDEFAULT == null ? debutApplication != null : !DEBUT_APPLICATION_EDEFAULT.equals(debutApplication);
			case SchemaPackage.TYPE_CONSIGNE_LUTTE_ANTIAERIENNE_TTA__FIN_APPLICATION:
				return FIN_APPLICATION_EDEFAULT == null ? finApplication != null : !FIN_APPLICATION_EDEFAULT.equals(finApplication);
			case SchemaPackage.TYPE_CONSIGNE_LUTTE_ANTIAERIENNE_TTA__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_CONSIGNE_LUTTE_ANTIAERIENNE_TTA__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_CONSIGNE_LUTTE_ANTIAERIENNE_TTA__CONCERNE_ENGINS_VOLANTS_TYPE_AERONEF:
				return concerneEnginsVolantsTypeAeronef != null;
			case SchemaPackage.TYPE_CONSIGNE_LUTTE_ANTIAERIENNE_TTA__CONCERNE_UNITES_UNITE:
				return concerneUnitesUnite != null && !concerneUnitesUnite.isEmpty();
			case SchemaPackage.TYPE_CONSIGNE_LUTTE_ANTIAERIENNE_TTA__ACOMME_LIGNE_APPLICATION_AUTRE_ELEMENT_CONTROLE:
				return aCommeLigneApplicationAutreElementControle != null && !aCommeLigneApplicationAutreElementControle.isEmpty();
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
		result.append(" (regleOuvertureFeu: ");
		if (regleOuvertureFeuESet) result.append(regleOuvertureFeu); else result.append("<unset>");
		result.append(", debutApplication: ");
		result.append(debutApplication);
		result.append(", finApplication: ");
		result.append(finApplication);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeConsigneLutteAntiaerienneTTAImpl
