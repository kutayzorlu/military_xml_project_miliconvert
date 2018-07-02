/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeRapportForce;

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
 * An implementation of the model object '<em><b>Type Rapport Force</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeRapportForceImpl#getPonderationForceEni <em>Ponderation Force Eni</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRapportForceImpl#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRapportForceImpl#getQuantiteMoyenAmi <em>Quantite Moyen Ami</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRapportForceImpl#getPonderationForceAmi <em>Ponderation Force Ami</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRapportForceImpl#getQuantiteMoyenEni <em>Quantite Moyen Eni</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRapportForceImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRapportForceImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRapportForceImpl#getConcerneTypeMateriel <em>Concerne Type Materiel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRapportForceImpl#getCorrespondHoraireManoeuvre <em>Correspond Horaire Manoeuvre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRapportForceImpl#getEstRapporteeParRapport <em>Est Rapportee Par Rapport</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeRapportForceImpl extends EObjectImpl implements TypeRapportForce {
	/**
	 * The default value of the '{@link #getPonderationForceEni() <em>Ponderation Force Eni</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPonderationForceEni()
	 * @generated
	 * @ordered
	 */
	protected static final long PONDERATION_FORCE_ENI_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getPonderationForceEni() <em>Ponderation Force Eni</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPonderationForceEni()
	 * @generated
	 * @ordered
	 */
	protected long ponderationForceEni = PONDERATION_FORCE_ENI_EDEFAULT;

	/**
	 * This is true if the Ponderation Force Eni attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ponderationForceEniESet;

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
	 * The default value of the '{@link #getQuantiteMoyenAmi() <em>Quantite Moyen Ami</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteMoyenAmi()
	 * @generated
	 * @ordered
	 */
	protected static final long QUANTITE_MOYEN_AMI_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getQuantiteMoyenAmi() <em>Quantite Moyen Ami</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteMoyenAmi()
	 * @generated
	 * @ordered
	 */
	protected long quantiteMoyenAmi = QUANTITE_MOYEN_AMI_EDEFAULT;

	/**
	 * This is true if the Quantite Moyen Ami attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean quantiteMoyenAmiESet;

	/**
	 * The default value of the '{@link #getPonderationForceAmi() <em>Ponderation Force Ami</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPonderationForceAmi()
	 * @generated
	 * @ordered
	 */
	protected static final long PONDERATION_FORCE_AMI_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getPonderationForceAmi() <em>Ponderation Force Ami</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPonderationForceAmi()
	 * @generated
	 * @ordered
	 */
	protected long ponderationForceAmi = PONDERATION_FORCE_AMI_EDEFAULT;

	/**
	 * This is true if the Ponderation Force Ami attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ponderationForceAmiESet;

	/**
	 * The default value of the '{@link #getQuantiteMoyenEni() <em>Quantite Moyen Eni</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteMoyenEni()
	 * @generated
	 * @ordered
	 */
	protected static final String QUANTITE_MOYEN_ENI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuantiteMoyenEni() <em>Quantite Moyen Eni</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteMoyenEni()
	 * @generated
	 * @ordered
	 */
	protected String quantiteMoyenEni = QUANTITE_MOYEN_ENI_EDEFAULT;

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
	 * The cached value of the '{@link #getConcerneTypeMateriel() <em>Concerne Type Materiel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneTypeMateriel()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT concerneTypeMateriel;

	/**
	 * The cached value of the '{@link #getCorrespondHoraireManoeuvre() <em>Correspond Horaire Manoeuvre</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrespondHoraireManoeuvre()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> correspondHoraireManoeuvre;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeRapportForceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeRapportForce();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getPonderationForceEni() {
		return ponderationForceEni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPonderationForceEni(long newPonderationForceEni) {
		long oldPonderationForceEni = ponderationForceEni;
		ponderationForceEni = newPonderationForceEni;
		boolean oldPonderationForceEniESet = ponderationForceEniESet;
		ponderationForceEniESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RAPPORT_FORCE__PONDERATION_FORCE_ENI, oldPonderationForceEni, ponderationForceEni, !oldPonderationForceEniESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPonderationForceEni() {
		long oldPonderationForceEni = ponderationForceEni;
		boolean oldPonderationForceEniESet = ponderationForceEniESet;
		ponderationForceEni = PONDERATION_FORCE_ENI_EDEFAULT;
		ponderationForceEniESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_RAPPORT_FORCE__PONDERATION_FORCE_ENI, oldPonderationForceEni, PONDERATION_FORCE_ENI_EDEFAULT, oldPonderationForceEniESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPonderationForceEni() {
		return ponderationForceEniESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RAPPORT_FORCE__COMMENTAIRE, oldCommentaire, commentaire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getQuantiteMoyenAmi() {
		return quantiteMoyenAmi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantiteMoyenAmi(long newQuantiteMoyenAmi) {
		long oldQuantiteMoyenAmi = quantiteMoyenAmi;
		quantiteMoyenAmi = newQuantiteMoyenAmi;
		boolean oldQuantiteMoyenAmiESet = quantiteMoyenAmiESet;
		quantiteMoyenAmiESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RAPPORT_FORCE__QUANTITE_MOYEN_AMI, oldQuantiteMoyenAmi, quantiteMoyenAmi, !oldQuantiteMoyenAmiESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQuantiteMoyenAmi() {
		long oldQuantiteMoyenAmi = quantiteMoyenAmi;
		boolean oldQuantiteMoyenAmiESet = quantiteMoyenAmiESet;
		quantiteMoyenAmi = QUANTITE_MOYEN_AMI_EDEFAULT;
		quantiteMoyenAmiESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_RAPPORT_FORCE__QUANTITE_MOYEN_AMI, oldQuantiteMoyenAmi, QUANTITE_MOYEN_AMI_EDEFAULT, oldQuantiteMoyenAmiESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQuantiteMoyenAmi() {
		return quantiteMoyenAmiESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getPonderationForceAmi() {
		return ponderationForceAmi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPonderationForceAmi(long newPonderationForceAmi) {
		long oldPonderationForceAmi = ponderationForceAmi;
		ponderationForceAmi = newPonderationForceAmi;
		boolean oldPonderationForceAmiESet = ponderationForceAmiESet;
		ponderationForceAmiESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RAPPORT_FORCE__PONDERATION_FORCE_AMI, oldPonderationForceAmi, ponderationForceAmi, !oldPonderationForceAmiESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPonderationForceAmi() {
		long oldPonderationForceAmi = ponderationForceAmi;
		boolean oldPonderationForceAmiESet = ponderationForceAmiESet;
		ponderationForceAmi = PONDERATION_FORCE_AMI_EDEFAULT;
		ponderationForceAmiESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_RAPPORT_FORCE__PONDERATION_FORCE_AMI, oldPonderationForceAmi, PONDERATION_FORCE_AMI_EDEFAULT, oldPonderationForceAmiESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPonderationForceAmi() {
		return ponderationForceAmiESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQuantiteMoyenEni() {
		return quantiteMoyenEni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantiteMoyenEni(String newQuantiteMoyenEni) {
		String oldQuantiteMoyenEni = quantiteMoyenEni;
		quantiteMoyenEni = newQuantiteMoyenEni;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RAPPORT_FORCE__QUANTITE_MOYEN_ENI, oldQuantiteMoyenEni, quantiteMoyenEni));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RAPPORT_FORCE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RAPPORT_FORCE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getConcerneTypeMateriel() {
		return concerneTypeMateriel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcerneTypeMateriel(TypeAssociationEXT newConcerneTypeMateriel, NotificationChain msgs) {
		TypeAssociationEXT oldConcerneTypeMateriel = concerneTypeMateriel;
		concerneTypeMateriel = newConcerneTypeMateriel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RAPPORT_FORCE__CONCERNE_TYPE_MATERIEL, oldConcerneTypeMateriel, newConcerneTypeMateriel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcerneTypeMateriel(TypeAssociationEXT newConcerneTypeMateriel) {
		if (newConcerneTypeMateriel != concerneTypeMateriel) {
			NotificationChain msgs = null;
			if (concerneTypeMateriel != null)
				msgs = ((InternalEObject)concerneTypeMateriel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RAPPORT_FORCE__CONCERNE_TYPE_MATERIEL, null, msgs);
			if (newConcerneTypeMateriel != null)
				msgs = ((InternalEObject)newConcerneTypeMateriel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RAPPORT_FORCE__CONCERNE_TYPE_MATERIEL, null, msgs);
			msgs = basicSetConcerneTypeMateriel(newConcerneTypeMateriel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RAPPORT_FORCE__CONCERNE_TYPE_MATERIEL, newConcerneTypeMateriel, newConcerneTypeMateriel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getCorrespondHoraireManoeuvre() {
		if (correspondHoraireManoeuvre == null) {
			correspondHoraireManoeuvre = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_RAPPORT_FORCE__CORRESPOND_HORAIRE_MANOEUVRE);
		}
		return correspondHoraireManoeuvre;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RAPPORT_FORCE__EST_RAPPORTEE_PAR_RAPPORT, oldEstRapporteeParRapport, newEstRapporteeParRapport);
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
				msgs = ((InternalEObject)estRapporteeParRapport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RAPPORT_FORCE__EST_RAPPORTEE_PAR_RAPPORT, null, msgs);
			if (newEstRapporteeParRapport != null)
				msgs = ((InternalEObject)newEstRapporteeParRapport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RAPPORT_FORCE__EST_RAPPORTEE_PAR_RAPPORT, null, msgs);
			msgs = basicSetEstRapporteeParRapport(newEstRapporteeParRapport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RAPPORT_FORCE__EST_RAPPORTEE_PAR_RAPPORT, newEstRapporteeParRapport, newEstRapporteeParRapport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_RAPPORT_FORCE__CONCERNE_TYPE_MATERIEL:
				return basicSetConcerneTypeMateriel(null, msgs);
			case SchemaPackage.TYPE_RAPPORT_FORCE__CORRESPOND_HORAIRE_MANOEUVRE:
				return ((InternalEList<?>)getCorrespondHoraireManoeuvre()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_RAPPORT_FORCE__EST_RAPPORTEE_PAR_RAPPORT:
				return basicSetEstRapporteeParRapport(null, msgs);
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
			case SchemaPackage.TYPE_RAPPORT_FORCE__PONDERATION_FORCE_ENI:
				return new Long(getPonderationForceEni());
			case SchemaPackage.TYPE_RAPPORT_FORCE__COMMENTAIRE:
				return getCommentaire();
			case SchemaPackage.TYPE_RAPPORT_FORCE__QUANTITE_MOYEN_AMI:
				return new Long(getQuantiteMoyenAmi());
			case SchemaPackage.TYPE_RAPPORT_FORCE__PONDERATION_FORCE_AMI:
				return new Long(getPonderationForceAmi());
			case SchemaPackage.TYPE_RAPPORT_FORCE__QUANTITE_MOYEN_ENI:
				return getQuantiteMoyenEni();
			case SchemaPackage.TYPE_RAPPORT_FORCE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_RAPPORT_FORCE__CE:
				return getCE();
			case SchemaPackage.TYPE_RAPPORT_FORCE__CONCERNE_TYPE_MATERIEL:
				return getConcerneTypeMateriel();
			case SchemaPackage.TYPE_RAPPORT_FORCE__CORRESPOND_HORAIRE_MANOEUVRE:
				return getCorrespondHoraireManoeuvre();
			case SchemaPackage.TYPE_RAPPORT_FORCE__EST_RAPPORTEE_PAR_RAPPORT:
				return getEstRapporteeParRapport();
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
			case SchemaPackage.TYPE_RAPPORT_FORCE__PONDERATION_FORCE_ENI:
				setPonderationForceEni(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_RAPPORT_FORCE__COMMENTAIRE:
				setCommentaire((String)newValue);
				return;
			case SchemaPackage.TYPE_RAPPORT_FORCE__QUANTITE_MOYEN_AMI:
				setQuantiteMoyenAmi(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_RAPPORT_FORCE__PONDERATION_FORCE_AMI:
				setPonderationForceAmi(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_RAPPORT_FORCE__QUANTITE_MOYEN_ENI:
				setQuantiteMoyenEni((String)newValue);
				return;
			case SchemaPackage.TYPE_RAPPORT_FORCE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_RAPPORT_FORCE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_RAPPORT_FORCE__CONCERNE_TYPE_MATERIEL:
				setConcerneTypeMateriel((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_RAPPORT_FORCE__CORRESPOND_HORAIRE_MANOEUVRE:
				getCorrespondHoraireManoeuvre().clear();
				getCorrespondHoraireManoeuvre().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_RAPPORT_FORCE__EST_RAPPORTEE_PAR_RAPPORT:
				setEstRapporteeParRapport((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_RAPPORT_FORCE__PONDERATION_FORCE_ENI:
				unsetPonderationForceEni();
				return;
			case SchemaPackage.TYPE_RAPPORT_FORCE__COMMENTAIRE:
				setCommentaire(COMMENTAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RAPPORT_FORCE__QUANTITE_MOYEN_AMI:
				unsetQuantiteMoyenAmi();
				return;
			case SchemaPackage.TYPE_RAPPORT_FORCE__PONDERATION_FORCE_AMI:
				unsetPonderationForceAmi();
				return;
			case SchemaPackage.TYPE_RAPPORT_FORCE__QUANTITE_MOYEN_ENI:
				setQuantiteMoyenEni(QUANTITE_MOYEN_ENI_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RAPPORT_FORCE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RAPPORT_FORCE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RAPPORT_FORCE__CONCERNE_TYPE_MATERIEL:
				setConcerneTypeMateriel((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_RAPPORT_FORCE__CORRESPOND_HORAIRE_MANOEUVRE:
				getCorrespondHoraireManoeuvre().clear();
				return;
			case SchemaPackage.TYPE_RAPPORT_FORCE__EST_RAPPORTEE_PAR_RAPPORT:
				setEstRapporteeParRapport((TypeAssociation)null);
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
			case SchemaPackage.TYPE_RAPPORT_FORCE__PONDERATION_FORCE_ENI:
				return isSetPonderationForceEni();
			case SchemaPackage.TYPE_RAPPORT_FORCE__COMMENTAIRE:
				return COMMENTAIRE_EDEFAULT == null ? commentaire != null : !COMMENTAIRE_EDEFAULT.equals(commentaire);
			case SchemaPackage.TYPE_RAPPORT_FORCE__QUANTITE_MOYEN_AMI:
				return isSetQuantiteMoyenAmi();
			case SchemaPackage.TYPE_RAPPORT_FORCE__PONDERATION_FORCE_AMI:
				return isSetPonderationForceAmi();
			case SchemaPackage.TYPE_RAPPORT_FORCE__QUANTITE_MOYEN_ENI:
				return QUANTITE_MOYEN_ENI_EDEFAULT == null ? quantiteMoyenEni != null : !QUANTITE_MOYEN_ENI_EDEFAULT.equals(quantiteMoyenEni);
			case SchemaPackage.TYPE_RAPPORT_FORCE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_RAPPORT_FORCE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_RAPPORT_FORCE__CONCERNE_TYPE_MATERIEL:
				return concerneTypeMateriel != null;
			case SchemaPackage.TYPE_RAPPORT_FORCE__CORRESPOND_HORAIRE_MANOEUVRE:
				return correspondHoraireManoeuvre != null && !correspondHoraireManoeuvre.isEmpty();
			case SchemaPackage.TYPE_RAPPORT_FORCE__EST_RAPPORTEE_PAR_RAPPORT:
				return estRapporteeParRapport != null;
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
		result.append(" (ponderationForceEni: ");
		if (ponderationForceEniESet) result.append(ponderationForceEni); else result.append("<unset>");
		result.append(", commentaire: ");
		result.append(commentaire);
		result.append(", quantiteMoyenAmi: ");
		if (quantiteMoyenAmiESet) result.append(quantiteMoyenAmi); else result.append("<unset>");
		result.append(", ponderationForceAmi: ");
		if (ponderationForceAmiESet) result.append(ponderationForceAmi); else result.append("<unset>");
		result.append(", quantiteMoyenEni: ");
		result.append(quantiteMoyenEni);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeRapportForceImpl
