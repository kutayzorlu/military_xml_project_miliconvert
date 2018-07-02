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
 * A representation of the model object '<em><b>Type CRtraitement Objectif</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeCRtraitementObjectif#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeCRtraitementObjectif#getMotifsNonExecution <em>Motifs Non Execution</em>}</li>
 *   <li>{@link mpia.schema.TypeCRtraitementObjectif#getDebutTraitement <em>Debut Traitement</em>}</li>
 *   <li>{@link mpia.schema.TypeCRtraitementObjectif#getFinTraitement <em>Fin Traitement</em>}</li>
 *   <li>{@link mpia.schema.TypeCRtraitementObjectif#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.TypeCRtraitementObjectif#getEffetConstate <em>Effet Constate</em>}</li>
 *   <li>{@link mpia.schema.TypeCRtraitementObjectif#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeCRtraitementObjectif#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeCRtraitementObjectif#getAPourUniteChargeeTraitementUnite <em>APour Unite Chargee Traitement Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeCRtraitementObjectif#getAPourUniteAAlerterUnite <em>APour Unite AAlerter Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeCRtraitementObjectif#getAPourMunitionsConsommeesVolumeMunitionsASS <em>APour Munitions Consommees Volume Munitions ASS</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeCRtraitementObjectif()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_CRtraitementObjectif' kind='elementOnly'"
 * @generated
 */
public interface TypeCRtraitementObjectif extends EObject {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCRtraitementObjectifCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCRtraitementObjectifCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoCRtraitementObjectifCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeCRtraitementObjectif_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoCRtraitementObjectifCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCRtraitementObjectif#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCRtraitementObjectifCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoCRtraitementObjectifCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCRtraitementObjectif#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoCRtraitementObjectifCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCRtraitementObjectif#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoCRtraitementObjectifCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Motifs Non Execution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Motifs Non Execution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Motifs Non Execution</em>' attribute.
	 * @see #setMotifsNonExecution(String)
	 * @see mpia.schema.SchemaPackage#getTypeCRtraitementObjectif_MotifsNonExecution()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='MotifsNonExecution'"
	 * @generated
	 */
	String getMotifsNonExecution();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCRtraitementObjectif#getMotifsNonExecution <em>Motifs Non Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Motifs Non Execution</em>' attribute.
	 * @see #getMotifsNonExecution()
	 * @generated
	 */
	void setMotifsNonExecution(String value);

	/**
	 * Returns the value of the '<em><b>Debut Traitement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Debut Traitement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debut Traitement</em>' attribute.
	 * @see #setDebutTraitement(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeCRtraitementObjectif_DebutTraitement()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DebutTraitement'"
	 * @generated
	 */
	XMLGregorianCalendar getDebutTraitement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCRtraitementObjectif#getDebutTraitement <em>Debut Traitement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debut Traitement</em>' attribute.
	 * @see #getDebutTraitement()
	 * @generated
	 */
	void setDebutTraitement(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Fin Traitement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fin Traitement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin Traitement</em>' attribute.
	 * @see #setFinTraitement(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeCRtraitementObjectif_FinTraitement()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='FinTraitement'"
	 * @generated
	 */
	XMLGregorianCalendar getFinTraitement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCRtraitementObjectif#getFinTraitement <em>Fin Traitement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin Traitement</em>' attribute.
	 * @see #getFinTraitement()
	 * @generated
	 */
	void setFinTraitement(XMLGregorianCalendar value);

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
	 * @see mpia.schema.SchemaPackage#getTypeCRtraitementObjectif_Commentaire()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='Commentaire'"
	 * @generated
	 */
	String getCommentaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCRtraitementObjectif#getCommentaire <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commentaire</em>' attribute.
	 * @see #getCommentaire()
	 * @generated
	 */
	void setCommentaire(String value);

	/**
	 * Returns the value of the '<em><b>Effet Constate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effet Constate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effet Constate</em>' attribute.
	 * @see #isSetEffetConstate()
	 * @see #unsetEffetConstate()
	 * @see #setEffetConstate(double)
	 * @see mpia.schema.SchemaPackage#getTypeCRtraitementObjectif_EffetConstate()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='EffetConstate'"
	 * @generated
	 */
	double getEffetConstate();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCRtraitementObjectif#getEffetConstate <em>Effet Constate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effet Constate</em>' attribute.
	 * @see #isSetEffetConstate()
	 * @see #unsetEffetConstate()
	 * @see #getEffetConstate()
	 * @generated
	 */
	void setEffetConstate(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCRtraitementObjectif#getEffetConstate <em>Effet Constate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEffetConstate()
	 * @see #getEffetConstate()
	 * @see #setEffetConstate(double)
	 * @generated
	 */
	void unsetEffetConstate();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCRtraitementObjectif#getEffetConstate <em>Effet Constate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Effet Constate</em>' attribute is set.
	 * @see #unsetEffetConstate()
	 * @see #getEffetConstate()
	 * @see #setEffetConstate(double)
	 * @generated
	 */
	boolean isSetEffetConstate();

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
	 * @see mpia.schema.SchemaPackage#getTypeCRtraitementObjectif_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCRtraitementObjectif#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeCRtraitementObjectif_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCRtraitementObjectif#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>APour Unite Chargee Traitement Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Unite Chargee Traitement Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Unite Chargee Traitement Unite</em>' containment reference.
	 * @see #setAPourUniteChargeeTraitementUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeCRtraitementObjectif_APourUniteChargeeTraitementUnite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourUniteChargeeTraitement_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getAPourUniteChargeeTraitementUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCRtraitementObjectif#getAPourUniteChargeeTraitementUnite <em>APour Unite Chargee Traitement Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Unite Chargee Traitement Unite</em>' containment reference.
	 * @see #getAPourUniteChargeeTraitementUnite()
	 * @generated
	 */
	void setAPourUniteChargeeTraitementUnite(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>APour Unite AAlerter Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociationEXT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Unite AAlerter Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Unite AAlerter Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeCRtraitementObjectif_APourUniteAAlerterUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourUniteAAlerter_Unite'"
	 * @generated
	 */
	EList<TypeAssociationEXT> getAPourUniteAAlerterUnite();

	/**
	 * Returns the value of the '<em><b>APour Munitions Consommees Volume Munitions ASS</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeVolumeMunitionsASS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Munitions Consommees Volume Munitions ASS</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Munitions Consommees Volume Munitions ASS</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeCRtraitementObjectif_APourMunitionsConsommeesVolumeMunitionsASS()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_VolumeMunitionsASS'"
	 *        extendedMetaData="kind='element' name='APourMunitionsConsommees_VolumeMunitionsASS'"
	 * @generated
	 */
	EList<TypeVolumeMunitionsASS> getAPourMunitionsConsommeesVolumeMunitionsASS();

} // TypeCRtraitementObjectif
