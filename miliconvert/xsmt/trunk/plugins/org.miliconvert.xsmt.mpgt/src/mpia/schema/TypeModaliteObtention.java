/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Modalite Obtention</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeModaliteObtention#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeModaliteObtention#getDateOuvertureDepot <em>Date Ouverture Depot</em>}</li>
 *   <li>{@link mpia.schema.TypeModaliteObtention#getDateFermetureDepot <em>Date Fermeture Depot</em>}</li>
 *   <li>{@link mpia.schema.TypeModaliteObtention#getDateLivraison <em>Date Livraison</em>}</li>
 *   <li>{@link mpia.schema.TypeModaliteObtention#getEstLivreOuDeposeAAutreSite <em>Est Livre Ou Depose AAutre Site</em>}</li>
 *   <li>{@link mpia.schema.TypeModaliteObtention#getEstLivreOuDeposeAAutreElementControle <em>Est Livre Ou Depose AAutre Element Controle</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeModaliteObtention()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_ModaliteObtention' kind='elementOnly'"
 * @generated
 */
public interface TypeModaliteObtention extends EObject {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoModaliteObtentionCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoModaliteObtentionCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoModaliteObtentionCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeModaliteObtention_Categorie()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoModaliteObtentionCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModaliteObtention#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoModaliteObtentionCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoModaliteObtentionCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeModaliteObtention#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoModaliteObtentionCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeModaliteObtention#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoModaliteObtentionCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Date Ouverture Depot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Ouverture Depot</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Ouverture Depot</em>' attribute.
	 * @see #setDateOuvertureDepot(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeModaliteObtention_DateOuvertureDepot()
	 * @model dataType="mpia.meta.TypeDataTypeGDH" required="true"
	 *        extendedMetaData="kind='element' name='DateOuvertureDepot'"
	 * @generated
	 */
	XMLGregorianCalendar getDateOuvertureDepot();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModaliteObtention#getDateOuvertureDepot <em>Date Ouverture Depot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Ouverture Depot</em>' attribute.
	 * @see #getDateOuvertureDepot()
	 * @generated
	 */
	void setDateOuvertureDepot(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Date Fermeture Depot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Fermeture Depot</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Fermeture Depot</em>' attribute.
	 * @see #setDateFermetureDepot(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeModaliteObtention_DateFermetureDepot()
	 * @model dataType="mpia.meta.TypeDataTypeGDH" required="true"
	 *        extendedMetaData="kind='element' name='DateFermetureDepot'"
	 * @generated
	 */
	XMLGregorianCalendar getDateFermetureDepot();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModaliteObtention#getDateFermetureDepot <em>Date Fermeture Depot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Fermeture Depot</em>' attribute.
	 * @see #getDateFermetureDepot()
	 * @generated
	 */
	void setDateFermetureDepot(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Date Livraison</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Livraison</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Livraison</em>' attribute.
	 * @see #setDateLivraison(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeModaliteObtention_DateLivraison()
	 * @model dataType="mpia.meta.TypeDataTypeGDH" required="true"
	 *        extendedMetaData="kind='element' name='DateLivraison'"
	 * @generated
	 */
	XMLGregorianCalendar getDateLivraison();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModaliteObtention#getDateLivraison <em>Date Livraison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Livraison</em>' attribute.
	 * @see #getDateLivraison()
	 * @generated
	 */
	void setDateLivraison(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Est Livre Ou Depose AAutre Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Livre Ou Depose AAutre Site</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Livre Ou Depose AAutre Site</em>' containment reference.
	 * @see #setEstLivreOuDeposeAAutreSite(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeModaliteObtention_EstLivreOuDeposeAAutreSite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreSite'"
	 *        extendedMetaData="kind='element' name='EstLivreOuDeposeA_AutreSite'"
	 * @generated
	 */
	TypeAssociation getEstLivreOuDeposeAAutreSite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModaliteObtention#getEstLivreOuDeposeAAutreSite <em>Est Livre Ou Depose AAutre Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Livre Ou Depose AAutre Site</em>' containment reference.
	 * @see #getEstLivreOuDeposeAAutreSite()
	 * @generated
	 */
	void setEstLivreOuDeposeAAutreSite(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Est Livre Ou Depose AAutre Element Controle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Livre Ou Depose AAutre Element Controle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Livre Ou Depose AAutre Element Controle</em>' containment reference.
	 * @see #setEstLivreOuDeposeAAutreElementControle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeModaliteObtention_EstLivreOuDeposeAAutreElementControle()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='EstLivreOuDeposeA_AutreElementControle'"
	 * @generated
	 */
	TypeAssociation getEstLivreOuDeposeAAutreElementControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModaliteObtention#getEstLivreOuDeposeAAutreElementControle <em>Est Livre Ou Depose AAutre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Livre Ou Depose AAutre Element Controle</em>' containment reference.
	 * @see #getEstLivreOuDeposeAAutreElementControle()
	 * @generated
	 */
	void setEstLivreOuDeposeAAutreElementControle(TypeAssociation value);

} // TypeModaliteObtention
