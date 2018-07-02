/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeDateHeure;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationContenuParagraphePlanOuOrdreDocument;
import mpia.schema.TypeContenuParagraphePlanOuOrdre;
import mpia.schema.TypeContenuTextuel;

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
 * An implementation of the model object '<em><b>Type Contenu Paragraphe Plan Ou Ordre</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeContenuParagraphePlanOuOrdreImpl#getNumeroSequence <em>Numero Sequence</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeContenuParagraphePlanOuOrdreImpl#getDate <em>Date</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeContenuParagraphePlanOuOrdreImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeContenuParagraphePlanOuOrdreImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeContenuParagraphePlanOuOrdreImpl#getAPourContenuStructureAutreContexte <em>APour Contenu Structure Autre Contexte</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeContenuParagraphePlanOuOrdreImpl#getAPourDocumentAssocieAssociationContenuParagraphePlanOuOrdreDocument <em>APour Document Associe Association Contenu Paragraphe Plan Ou Ordre Document</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeContenuParagraphePlanOuOrdreImpl#getAPourContenuTextuelContenuTextuel <em>APour Contenu Textuel Contenu Textuel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeContenuParagraphePlanOuOrdreImpl#getAPourEnteteEnTeteParagraphePlanOuOrdre <em>APour Entete En Tete Paragraphe Plan Ou Ordre</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeContenuParagraphePlanOuOrdreImpl extends EObjectImpl implements TypeContenuParagraphePlanOuOrdre {
	/**
	 * The default value of the '{@link #getNumeroSequence() <em>Numero Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroSequence()
	 * @generated
	 * @ordered
	 */
	protected static final long NUMERO_SEQUENCE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNumeroSequence() <em>Numero Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroSequence()
	 * @generated
	 * @ordered
	 */
	protected long numeroSequence = NUMERO_SEQUENCE_EDEFAULT;

	/**
	 * This is true if the Numero Sequence attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numeroSequenceESet;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDateHeure date;

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
	 * The cached value of the '{@link #getAPourContenuStructureAutreContexte() <em>APour Contenu Structure Autre Contexte</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourContenuStructureAutreContexte()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourContenuStructureAutreContexte;

	/**
	 * The cached value of the '{@link #getAPourDocumentAssocieAssociationContenuParagraphePlanOuOrdreDocument() <em>APour Document Associe Association Contenu Paragraphe Plan Ou Ordre Document</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourDocumentAssocieAssociationContenuParagraphePlanOuOrdreDocument()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociationContenuParagraphePlanOuOrdreDocument> aPourDocumentAssocieAssociationContenuParagraphePlanOuOrdreDocument;

	/**
	 * The cached value of the '{@link #getAPourContenuTextuelContenuTextuel() <em>APour Contenu Textuel Contenu Textuel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourContenuTextuelContenuTextuel()
	 * @generated
	 * @ordered
	 */
	protected TypeContenuTextuel aPourContenuTextuelContenuTextuel;

	/**
	 * The cached value of the '{@link #getAPourEnteteEnTeteParagraphePlanOuOrdre() <em>APour Entete En Tete Paragraphe Plan Ou Ordre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourEnteteEnTeteParagraphePlanOuOrdre()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourEnteteEnTeteParagraphePlanOuOrdre;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeContenuParagraphePlanOuOrdreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeContenuParagraphePlanOuOrdre();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNumeroSequence() {
		return numeroSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroSequence(long newNumeroSequence) {
		long oldNumeroSequence = numeroSequence;
		numeroSequence = newNumeroSequence;
		boolean oldNumeroSequenceESet = numeroSequenceESet;
		numeroSequenceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE__NUMERO_SEQUENCE, oldNumeroSequence, numeroSequence, !oldNumeroSequenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumeroSequence() {
		long oldNumeroSequence = numeroSequence;
		boolean oldNumeroSequenceESet = numeroSequenceESet;
		numeroSequence = NUMERO_SEQUENCE_EDEFAULT;
		numeroSequenceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE__NUMERO_SEQUENCE, oldNumeroSequence, NUMERO_SEQUENCE_EDEFAULT, oldNumeroSequenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumeroSequence() {
		return numeroSequenceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDateHeure getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(TypeDataTypeDateHeure newDate, NotificationChain msgs) {
		TypeDataTypeDateHeure oldDate = date;
		date = newDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE__DATE, oldDate, newDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(TypeDataTypeDateHeure newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE__DATE, newDate, newDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourContenuStructureAutreContexte() {
		return aPourContenuStructureAutreContexte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourContenuStructureAutreContexte(TypeAssociation newAPourContenuStructureAutreContexte, NotificationChain msgs) {
		TypeAssociation oldAPourContenuStructureAutreContexte = aPourContenuStructureAutreContexte;
		aPourContenuStructureAutreContexte = newAPourContenuStructureAutreContexte;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE__APOUR_CONTENU_STRUCTURE_AUTRE_CONTEXTE, oldAPourContenuStructureAutreContexte, newAPourContenuStructureAutreContexte);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourContenuStructureAutreContexte(TypeAssociation newAPourContenuStructureAutreContexte) {
		if (newAPourContenuStructureAutreContexte != aPourContenuStructureAutreContexte) {
			NotificationChain msgs = null;
			if (aPourContenuStructureAutreContexte != null)
				msgs = ((InternalEObject)aPourContenuStructureAutreContexte).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE__APOUR_CONTENU_STRUCTURE_AUTRE_CONTEXTE, null, msgs);
			if (newAPourContenuStructureAutreContexte != null)
				msgs = ((InternalEObject)newAPourContenuStructureAutreContexte).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE__APOUR_CONTENU_STRUCTURE_AUTRE_CONTEXTE, null, msgs);
			msgs = basicSetAPourContenuStructureAutreContexte(newAPourContenuStructureAutreContexte, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE__APOUR_CONTENU_STRUCTURE_AUTRE_CONTEXTE, newAPourContenuStructureAutreContexte, newAPourContenuStructureAutreContexte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationContenuParagraphePlanOuOrdreDocument> getAPourDocumentAssocieAssociationContenuParagraphePlanOuOrdreDocument() {
		if (aPourDocumentAssocieAssociationContenuParagraphePlanOuOrdreDocument == null) {
			aPourDocumentAssocieAssociationContenuParagraphePlanOuOrdreDocument = new EObjectContainmentEList<TypeAssociationContenuParagraphePlanOuOrdreDocument>(TypeAssociationContenuParagraphePlanOuOrdreDocument.class, this, SchemaPackage.TYPE_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE__APOUR_DOCUMENT_ASSOCIE_ASSOCIATION_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE_DOCUMENT);
		}
		return aPourDocumentAssocieAssociationContenuParagraphePlanOuOrdreDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeContenuTextuel getAPourContenuTextuelContenuTextuel() {
		return aPourContenuTextuelContenuTextuel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourContenuTextuelContenuTextuel(TypeContenuTextuel newAPourContenuTextuelContenuTextuel, NotificationChain msgs) {
		TypeContenuTextuel oldAPourContenuTextuelContenuTextuel = aPourContenuTextuelContenuTextuel;
		aPourContenuTextuelContenuTextuel = newAPourContenuTextuelContenuTextuel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE__APOUR_CONTENU_TEXTUEL_CONTENU_TEXTUEL, oldAPourContenuTextuelContenuTextuel, newAPourContenuTextuelContenuTextuel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourContenuTextuelContenuTextuel(TypeContenuTextuel newAPourContenuTextuelContenuTextuel) {
		if (newAPourContenuTextuelContenuTextuel != aPourContenuTextuelContenuTextuel) {
			NotificationChain msgs = null;
			if (aPourContenuTextuelContenuTextuel != null)
				msgs = ((InternalEObject)aPourContenuTextuelContenuTextuel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE__APOUR_CONTENU_TEXTUEL_CONTENU_TEXTUEL, null, msgs);
			if (newAPourContenuTextuelContenuTextuel != null)
				msgs = ((InternalEObject)newAPourContenuTextuelContenuTextuel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE__APOUR_CONTENU_TEXTUEL_CONTENU_TEXTUEL, null, msgs);
			msgs = basicSetAPourContenuTextuelContenuTextuel(newAPourContenuTextuelContenuTextuel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE__APOUR_CONTENU_TEXTUEL_CONTENU_TEXTUEL, newAPourContenuTextuelContenuTextuel, newAPourContenuTextuelContenuTextuel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourEnteteEnTeteParagraphePlanOuOrdre() {
		return aPourEnteteEnTeteParagraphePlanOuOrdre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourEnteteEnTeteParagraphePlanOuOrdre(TypeAssociation newAPourEnteteEnTeteParagraphePlanOuOrdre, NotificationChain msgs) {
		TypeAssociation oldAPourEnteteEnTeteParagraphePlanOuOrdre = aPourEnteteEnTeteParagraphePlanOuOrdre;
		aPourEnteteEnTeteParagraphePlanOuOrdre = newAPourEnteteEnTeteParagraphePlanOuOrdre;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE__APOUR_ENTETE_EN_TETE_PARAGRAPHE_PLAN_OU_ORDRE, oldAPourEnteteEnTeteParagraphePlanOuOrdre, newAPourEnteteEnTeteParagraphePlanOuOrdre);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourEnteteEnTeteParagraphePlanOuOrdre(TypeAssociation newAPourEnteteEnTeteParagraphePlanOuOrdre) {
		if (newAPourEnteteEnTeteParagraphePlanOuOrdre != aPourEnteteEnTeteParagraphePlanOuOrdre) {
			NotificationChain msgs = null;
			if (aPourEnteteEnTeteParagraphePlanOuOrdre != null)
				msgs = ((InternalEObject)aPourEnteteEnTeteParagraphePlanOuOrdre).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE__APOUR_ENTETE_EN_TETE_PARAGRAPHE_PLAN_OU_ORDRE, null, msgs);
			if (newAPourEnteteEnTeteParagraphePlanOuOrdre != null)
				msgs = ((InternalEObject)newAPourEnteteEnTeteParagraphePlanOuOrdre).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE__APOUR_ENTETE_EN_TETE_PARAGRAPHE_PLAN_OU_ORDRE, null, msgs);
			msgs = basicSetAPourEnteteEnTeteParagraphePlanOuOrdre(newAPourEnteteEnTeteParagraphePlanOuOrdre, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE__APOUR_ENTETE_EN_TETE_PARAGRAPHE_PLAN_OU_ORDRE, newAPourEnteteEnTeteParagraphePlanOuOrdre, newAPourEnteteEnTeteParagraphePlanOuOrdre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE__DATE:
				return basicSetDate(null, msgs);
			case SchemaPackage.TYPE_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE__APOUR_CONTENU_STRUCTURE_AUTRE_CONTEXTE:
				return basicSetAPourContenuStructureAutreContexte(null, msgs);
			case SchemaPackage.TYPE_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE__APOUR_DOCUMENT_ASSOCIE_ASSOCIATION_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE_DOCUMENT:
				return ((InternalEList<?>)getAPourDocumentAssocieAssociationContenuParagraphePlanOuOrdreDocument()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE__APOUR_CONTENU_TEXTUEL_CONTENU_TEXTUEL:
				return basicSetAPourContenuTextuelContenuTextuel(null, msgs);
			case SchemaPackage.TYPE_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE__APOUR_ENTETE_EN_TETE_PARAGRAPHE_PLAN_OU_ORDRE:
				return basicSetAPourEnteteEnTeteParagraphePlanOuOrdre(null, msgs);
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
			case SchemaPackage.TYPE_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE__NUMERO_SEQUENCE:
				return new Long(getNumeroSequence());
			case SchemaPackage.TYPE_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE__DATE:
				return getDate();
			case SchemaPackage.TYPE_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE__CE:
				return getCE();
			case SchemaPackage.TYPE_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE__APOUR_CONTENU_STRUCTURE_AUTRE_CONTEXTE:
				return getAPourContenuStructureAutreContexte();
			case SchemaPackage.TYPE_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE__APOUR_DOCUMENT_ASSOCIE_ASSOCIATION_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE_DOCUMENT:
				return getAPourDocumentAssocieAssociationContenuParagraphePlanOuOrdreDocument();
			case SchemaPackage.TYPE_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE__APOUR_CONTENU_TEXTUEL_CONTENU_TEXTUEL:
				return getAPourContenuTextuelContenuTextuel();
			case SchemaPackage.TYPE_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE__APOUR_ENTETE_EN_TETE_PARAGRAPHE_PLAN_OU_ORDRE:
				return getAPourEnteteEnTeteParagraphePlanOuOrdre();
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
			case SchemaPackage.TYPE_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE__NUMERO_SEQUENCE:
				setNumeroSequence(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE__DATE:
				setDate((TypeDataTypeDateHeure)newValue);
				return;
			case SchemaPackage.TYPE_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE__APOUR_CONTENU_STRUCTURE_AUTRE_CONTEXTE:
				setAPourContenuStructureAutreContexte((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE__APOUR_DOCUMENT_ASSOCIE_ASSOCIATION_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE_DOCUMENT:
				getAPourDocumentAssocieAssociationContenuParagraphePlanOuOrdreDocument().clear();
				getAPourDocumentAssocieAssociationContenuParagraphePlanOuOrdreDocument().addAll((Collection<? extends TypeAssociationContenuParagraphePlanOuOrdreDocument>)newValue);
				return;
			case SchemaPackage.TYPE_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE__APOUR_CONTENU_TEXTUEL_CONTENU_TEXTUEL:
				setAPourContenuTextuelContenuTextuel((TypeContenuTextuel)newValue);
				return;
			case SchemaPackage.TYPE_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE__APOUR_ENTETE_EN_TETE_PARAGRAPHE_PLAN_OU_ORDRE:
				setAPourEnteteEnTeteParagraphePlanOuOrdre((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE__NUMERO_SEQUENCE:
				unsetNumeroSequence();
				return;
			case SchemaPackage.TYPE_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE__DATE:
				setDate((TypeDataTypeDateHeure)null);
				return;
			case SchemaPackage.TYPE_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE__APOUR_CONTENU_STRUCTURE_AUTRE_CONTEXTE:
				setAPourContenuStructureAutreContexte((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE__APOUR_DOCUMENT_ASSOCIE_ASSOCIATION_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE_DOCUMENT:
				getAPourDocumentAssocieAssociationContenuParagraphePlanOuOrdreDocument().clear();
				return;
			case SchemaPackage.TYPE_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE__APOUR_CONTENU_TEXTUEL_CONTENU_TEXTUEL:
				setAPourContenuTextuelContenuTextuel((TypeContenuTextuel)null);
				return;
			case SchemaPackage.TYPE_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE__APOUR_ENTETE_EN_TETE_PARAGRAPHE_PLAN_OU_ORDRE:
				setAPourEnteteEnTeteParagraphePlanOuOrdre((TypeAssociation)null);
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
			case SchemaPackage.TYPE_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE__NUMERO_SEQUENCE:
				return isSetNumeroSequence();
			case SchemaPackage.TYPE_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE__DATE:
				return date != null;
			case SchemaPackage.TYPE_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE__APOUR_CONTENU_STRUCTURE_AUTRE_CONTEXTE:
				return aPourContenuStructureAutreContexte != null;
			case SchemaPackage.TYPE_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE__APOUR_DOCUMENT_ASSOCIE_ASSOCIATION_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE_DOCUMENT:
				return aPourDocumentAssocieAssociationContenuParagraphePlanOuOrdreDocument != null && !aPourDocumentAssocieAssociationContenuParagraphePlanOuOrdreDocument.isEmpty();
			case SchemaPackage.TYPE_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE__APOUR_CONTENU_TEXTUEL_CONTENU_TEXTUEL:
				return aPourContenuTextuelContenuTextuel != null;
			case SchemaPackage.TYPE_CONTENU_PARAGRAPHE_PLAN_OU_ORDRE__APOUR_ENTETE_EN_TETE_PARAGRAPHE_PLAN_OU_ORDRE:
				return aPourEnteteEnTeteParagraphePlanOuOrdre != null;
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
		result.append(" (numeroSequence: ");
		if (numeroSequenceESet) result.append(numeroSequence); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeContenuParagraphePlanOuOrdreImpl
