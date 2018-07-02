/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Ressources ALivrer Ou ADistribuer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeRessourcesALivrerOuADistribuer#getDateDeDebut <em>Date De Debut</em>}</li>
 *   <li>{@link mpia.schema.TypeRessourcesALivrerOuADistribuer#getDateDeFin <em>Date De Fin</em>}</li>
 *   <li>{@link mpia.schema.TypeRessourcesALivrerOuADistribuer#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.TypeRessourcesALivrerOuADistribuer#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeRessourcesALivrerOuADistribuer#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeRessourcesALivrerOuADistribuer#getACommeRessourceRavitaillementRessourceAttendue <em>AComme Ressource Ravitaillement Ressource Attendue</em>}</li>
 *   <li>{@link mpia.schema.TypeRessourcesALivrerOuADistribuer#getACommeRessourceElementaireRessourceElementaire <em>AComme Ressource Elementaire Ressource Elementaire</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeRessourcesALivrerOuADistribuer()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_RessourcesALivrerOuADistribuer' kind='elementOnly'"
 * @generated
 */
public interface TypeRessourcesALivrerOuADistribuer extends EObject {
	/**
	 * Returns the value of the '<em><b>Date De Debut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date De Debut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date De Debut</em>' attribute.
	 * @see #setDateDeDebut(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeRessourcesALivrerOuADistribuer_DateDeDebut()
	 * @model dataType="mpia.meta.TypeDataTypeGDH" required="true"
	 *        extendedMetaData="kind='element' name='DateDeDebut'"
	 * @generated
	 */
	XMLGregorianCalendar getDateDeDebut();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRessourcesALivrerOuADistribuer#getDateDeDebut <em>Date De Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date De Debut</em>' attribute.
	 * @see #getDateDeDebut()
	 * @generated
	 */
	void setDateDeDebut(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Date De Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date De Fin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date De Fin</em>' attribute.
	 * @see #setDateDeFin(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeRessourcesALivrerOuADistribuer_DateDeFin()
	 * @model dataType="mpia.meta.TypeDataTypeGDH" required="true"
	 *        extendedMetaData="kind='element' name='DateDeFin'"
	 * @generated
	 */
	XMLGregorianCalendar getDateDeFin();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRessourcesALivrerOuADistribuer#getDateDeFin <em>Date De Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date De Fin</em>' attribute.
	 * @see #getDateDeFin()
	 * @generated
	 */
	void setDateDeFin(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Commentaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commentaire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commentaire</em>' attribute.
	 * @see #setCommentaire(String)
	 * @see mpia.schema.SchemaPackage#getTypeRessourcesALivrerOuADistribuer_Commentaire()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='Commentaire'"
	 * @generated
	 */
	String getCommentaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRessourcesALivrerOuADistribuer#getCommentaire <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commentaire</em>' attribute.
	 * @see #getCommentaire()
	 * @generated
	 */
	void setCommentaire(String value);

	/**
	 * Returns the value of the '<em><b>CTE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CTE</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CTE</em>' attribute.
	 * @see #setCTE(String)
	 * @see mpia.schema.SchemaPackage#getTypeRessourcesALivrerOuADistribuer_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRessourcesALivrerOuADistribuer#getCTE <em>CTE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CTE</em>' attribute.
	 * @see #getCTE()
	 * @generated
	 */
	void setCTE(String value);

	/**
	 * Returns the value of the '<em><b>CE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CE</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CE</em>' attribute.
	 * @see #setCE(String)
	 * @see mpia.schema.SchemaPackage#getTypeRessourcesALivrerOuADistribuer_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRessourcesALivrerOuADistribuer#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>AComme Ressource Ravitaillement Ressource Attendue</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeRessourceAttendue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Ressource Ravitaillement Ressource Attendue</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Ressource Ravitaillement Ressource Attendue</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeRessourcesALivrerOuADistribuer_ACommeRessourceRavitaillementRessourceAttendue()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_RessourceAttendue'"
	 *        extendedMetaData="kind='element' name='ACommeRessourceRavitaillement_RessourceAttendue'"
	 * @generated
	 */
	EList<TypeRessourceAttendue> getACommeRessourceRavitaillementRessourceAttendue();

	/**
	 * Returns the value of the '<em><b>AComme Ressource Elementaire Ressource Elementaire</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeRessourceElementaire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Ressource Elementaire Ressource Elementaire</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Ressource Elementaire Ressource Elementaire</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeRessourcesALivrerOuADistribuer_ACommeRessourceElementaireRessourceElementaire()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_RessourceElementaire'"
	 *        extendedMetaData="kind='element' name='ACommeRessourceElementaire_RessourceElementaire'"
	 * @generated
	 */
	EList<TypeRessourceElementaire> getACommeRessourceElementaireRessourceElementaire();

} // TypeRessourcesALivrerOuADistribuer
