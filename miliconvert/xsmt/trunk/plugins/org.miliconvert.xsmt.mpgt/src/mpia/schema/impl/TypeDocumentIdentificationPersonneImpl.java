/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoDocumentIdentificationPersonneCategorie;
import mpia.schema.TypeDocumentIdentificationPersonne;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Document Identification Personne</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeDocumentIdentificationPersonneImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDocumentIdentificationPersonneImpl#getNumeroIdentification <em>Numero Identification</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDocumentIdentificationPersonneImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDocumentIdentificationPersonneImpl#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeDocumentIdentificationPersonneImpl extends EObjectImpl implements TypeDocumentIdentificationPersonne {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoDocumentIdentificationPersonneCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoDocumentIdentificationPersonneCategorie.PSSPRT;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoDocumentIdentificationPersonneCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The default value of the '{@link #getNumeroIdentification() <em>Numero Identification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroIdentification()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMERO_IDENTIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumeroIdentification() <em>Numero Identification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroIdentification()
	 * @generated
	 * @ordered
	 */
	protected String numeroIdentification = NUMERO_IDENTIFICATION_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeDocumentIdentificationPersonneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeDocumentIdentificationPersonne();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoDocumentIdentificationPersonneCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoDocumentIdentificationPersonneCategorie newCategorie) {
		TypeDictionaryDicoDocumentIdentificationPersonneCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOCUMENT_IDENTIFICATION_PERSONNE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoDocumentIdentificationPersonneCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_DOCUMENT_IDENTIFICATION_PERSONNE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCategorie() {
		return categorieESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumeroIdentification() {
		return numeroIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroIdentification(String newNumeroIdentification) {
		String oldNumeroIdentification = numeroIdentification;
		numeroIdentification = newNumeroIdentification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOCUMENT_IDENTIFICATION_PERSONNE__NUMERO_IDENTIFICATION, oldNumeroIdentification, numeroIdentification));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOCUMENT_IDENTIFICATION_PERSONNE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOCUMENT_IDENTIFICATION_PERSONNE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_DOCUMENT_IDENTIFICATION_PERSONNE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_DOCUMENT_IDENTIFICATION_PERSONNE__NUMERO_IDENTIFICATION:
				return getNumeroIdentification();
			case SchemaPackage.TYPE_DOCUMENT_IDENTIFICATION_PERSONNE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_DOCUMENT_IDENTIFICATION_PERSONNE__CE:
				return getCE();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SchemaPackage.TYPE_DOCUMENT_IDENTIFICATION_PERSONNE__CATEGORIE:
				setCategorie((TypeDictionaryDicoDocumentIdentificationPersonneCategorie)newValue);
				return;
			case SchemaPackage.TYPE_DOCUMENT_IDENTIFICATION_PERSONNE__NUMERO_IDENTIFICATION:
				setNumeroIdentification((String)newValue);
				return;
			case SchemaPackage.TYPE_DOCUMENT_IDENTIFICATION_PERSONNE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_DOCUMENT_IDENTIFICATION_PERSONNE__CE:
				setCE((String)newValue);
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
			case SchemaPackage.TYPE_DOCUMENT_IDENTIFICATION_PERSONNE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_DOCUMENT_IDENTIFICATION_PERSONNE__NUMERO_IDENTIFICATION:
				setNumeroIdentification(NUMERO_IDENTIFICATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DOCUMENT_IDENTIFICATION_PERSONNE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DOCUMENT_IDENTIFICATION_PERSONNE__CE:
				setCE(CE_EDEFAULT);
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
			case SchemaPackage.TYPE_DOCUMENT_IDENTIFICATION_PERSONNE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_DOCUMENT_IDENTIFICATION_PERSONNE__NUMERO_IDENTIFICATION:
				return NUMERO_IDENTIFICATION_EDEFAULT == null ? numeroIdentification != null : !NUMERO_IDENTIFICATION_EDEFAULT.equals(numeroIdentification);
			case SchemaPackage.TYPE_DOCUMENT_IDENTIFICATION_PERSONNE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_DOCUMENT_IDENTIFICATION_PERSONNE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
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
		result.append(" (categorie: ");
		if (categorieESet) result.append(categorie); else result.append("<unset>");
		result.append(", numeroIdentification: ");
		result.append(numeroIdentification);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeDocumentIdentificationPersonneImpl
