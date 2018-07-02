/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociationEXT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Moyens Necessaires</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMoyensNecessaires#getTypeMoyen <em>Type Moyen</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyensNecessaires#getQuantiteNecessaire <em>Quantite Necessaire</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyensNecessaires#getDebutActivation <em>Debut Activation</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyensNecessaires#getFinActivation <em>Fin Activation</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyensNecessaires#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyensNecessaires#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyensNecessaires#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyensNecessaires#getEstDecritParTypeMateriel <em>Est Decrit Par Type Materiel</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMoyensNecessaires()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_MoyensNecessaires' kind='elementOnly'"
 * @generated
 */
public interface TypeMoyensNecessaires extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Moyen</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoMoyenTypeMoyen}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Moyen</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Moyen</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMoyenTypeMoyen
	 * @see #isSetTypeMoyen()
	 * @see #unsetTypeMoyen()
	 * @see #setTypeMoyen(TypeDictionaryDicoMoyenTypeMoyen)
	 * @see mpia.schema.SchemaPackage#getTypeMoyensNecessaires_TypeMoyen()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='TypeMoyen'"
	 * @generated
	 */
	TypeDictionaryDicoMoyenTypeMoyen getTypeMoyen();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyensNecessaires#getTypeMoyen <em>Type Moyen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Moyen</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMoyenTypeMoyen
	 * @see #isSetTypeMoyen()
	 * @see #unsetTypeMoyen()
	 * @see #getTypeMoyen()
	 * @generated
	 */
	void setTypeMoyen(TypeDictionaryDicoMoyenTypeMoyen value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMoyensNecessaires#getTypeMoyen <em>Type Moyen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeMoyen()
	 * @see #getTypeMoyen()
	 * @see #setTypeMoyen(TypeDictionaryDicoMoyenTypeMoyen)
	 * @generated
	 */
	void unsetTypeMoyen();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMoyensNecessaires#getTypeMoyen <em>Type Moyen</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Moyen</em>' attribute is set.
	 * @see #unsetTypeMoyen()
	 * @see #getTypeMoyen()
	 * @see #setTypeMoyen(TypeDictionaryDicoMoyenTypeMoyen)
	 * @generated
	 */
	boolean isSetTypeMoyen();

	/**
	 * Returns the value of the '<em><b>Quantite Necessaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantite Necessaire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite Necessaire</em>' attribute.
	 * @see #isSetQuantiteNecessaire()
	 * @see #unsetQuantiteNecessaire()
	 * @see #setQuantiteNecessaire(long)
	 * @see mpia.schema.SchemaPackage#getTypeMoyensNecessaires_QuantiteNecessaire()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier9" required="true"
	 *        extendedMetaData="kind='element' name='QuantiteNecessaire'"
	 * @generated
	 */
	long getQuantiteNecessaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyensNecessaires#getQuantiteNecessaire <em>Quantite Necessaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite Necessaire</em>' attribute.
	 * @see #isSetQuantiteNecessaire()
	 * @see #unsetQuantiteNecessaire()
	 * @see #getQuantiteNecessaire()
	 * @generated
	 */
	void setQuantiteNecessaire(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMoyensNecessaires#getQuantiteNecessaire <em>Quantite Necessaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuantiteNecessaire()
	 * @see #getQuantiteNecessaire()
	 * @see #setQuantiteNecessaire(long)
	 * @generated
	 */
	void unsetQuantiteNecessaire();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMoyensNecessaires#getQuantiteNecessaire <em>Quantite Necessaire</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quantite Necessaire</em>' attribute is set.
	 * @see #unsetQuantiteNecessaire()
	 * @see #getQuantiteNecessaire()
	 * @see #setQuantiteNecessaire(long)
	 * @generated
	 */
	boolean isSetQuantiteNecessaire();

	/**
	 * Returns the value of the '<em><b>Debut Activation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Debut Activation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debut Activation</em>' attribute.
	 * @see #setDebutActivation(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeMoyensNecessaires_DebutActivation()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DebutActivation'"
	 * @generated
	 */
	XMLGregorianCalendar getDebutActivation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyensNecessaires#getDebutActivation <em>Debut Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debut Activation</em>' attribute.
	 * @see #getDebutActivation()
	 * @generated
	 */
	void setDebutActivation(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Fin Activation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fin Activation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin Activation</em>' attribute.
	 * @see #setFinActivation(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeMoyensNecessaires_FinActivation()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='FinActivation'"
	 * @generated
	 */
	XMLGregorianCalendar getFinActivation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyensNecessaires#getFinActivation <em>Fin Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin Activation</em>' attribute.
	 * @see #getFinActivation()
	 * @generated
	 */
	void setFinActivation(XMLGregorianCalendar value);

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
	 * @see mpia.schema.SchemaPackage#getTypeMoyensNecessaires_Commentaire()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='Commentaire'"
	 * @generated
	 */
	String getCommentaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyensNecessaires#getCommentaire <em>Commentaire</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeMoyensNecessaires_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyensNecessaires#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeMoyensNecessaires_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyensNecessaires#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Est Decrit Par Type Materiel</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociationEXT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Decrit Par Type Materiel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Decrit Par Type Materiel</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMoyensNecessaires_EstDecritParTypeMateriel()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeMateriel'"
	 *        extendedMetaData="kind='element' name='EstDecritPar_TypeMateriel'"
	 * @generated
	 */
	EList<TypeAssociationEXT> getEstDecritParTypeMateriel();

} // TypeMoyensNecessaires
