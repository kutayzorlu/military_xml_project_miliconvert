/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Procedure IFF</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeProcedureIFF#getAutoriteResponsable <em>Autorite Responsable</em>}</li>
 *   <li>{@link mpia.schema.TypeProcedureIFF#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.TypeProcedureIFF#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeProcedureIFF#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeProcedureIFF#getAPourResponsableUnite <em>APour Responsable Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeProcedureIFF#getUtiliseUtilisationIFF <em>Utilise Utilisation IFF</em>}</li>
 *   <li>{@link mpia.schema.TypeProcedureIFF#getAnnuleAnnulationIFF <em>Annule Annulation IFF</em>}</li>
 *   <li>{@link mpia.schema.TypeProcedureIFF#getSAppliqueSurAutreElementControle <em>SApplique Sur Autre Element Controle</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeProcedureIFF()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_ProcedureIFF' kind='elementOnly'"
 * @generated
 */
public interface TypeProcedureIFF extends EObject {
	/**
	 * Returns the value of the '<em><b>Autorite Responsable</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoProcedureIFFAutoriteResponsable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autorite Responsable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autorite Responsable</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoProcedureIFFAutoriteResponsable
	 * @see #isSetAutoriteResponsable()
	 * @see #unsetAutoriteResponsable()
	 * @see #setAutoriteResponsable(TypeDictionaryDicoProcedureIFFAutoriteResponsable)
	 * @see mpia.schema.SchemaPackage#getTypeProcedureIFF_AutoriteResponsable()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='AutoriteResponsable'"
	 * @generated
	 */
	TypeDictionaryDicoProcedureIFFAutoriteResponsable getAutoriteResponsable();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeProcedureIFF#getAutoriteResponsable <em>Autorite Responsable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autorite Responsable</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoProcedureIFFAutoriteResponsable
	 * @see #isSetAutoriteResponsable()
	 * @see #unsetAutoriteResponsable()
	 * @see #getAutoriteResponsable()
	 * @generated
	 */
	void setAutoriteResponsable(TypeDictionaryDicoProcedureIFFAutoriteResponsable value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeProcedureIFF#getAutoriteResponsable <em>Autorite Responsable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAutoriteResponsable()
	 * @see #getAutoriteResponsable()
	 * @see #setAutoriteResponsable(TypeDictionaryDicoProcedureIFFAutoriteResponsable)
	 * @generated
	 */
	void unsetAutoriteResponsable();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeProcedureIFF#getAutoriteResponsable <em>Autorite Responsable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Autorite Responsable</em>' attribute is set.
	 * @see #unsetAutoriteResponsable()
	 * @see #getAutoriteResponsable()
	 * @see #setAutoriteResponsable(TypeDictionaryDicoProcedureIFFAutoriteResponsable)
	 * @generated
	 */
	boolean isSetAutoriteResponsable();

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
	 * @see mpia.schema.SchemaPackage#getTypeProcedureIFF_Commentaire()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='Commentaire'"
	 * @generated
	 */
	String getCommentaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeProcedureIFF#getCommentaire <em>Commentaire</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeProcedureIFF_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeProcedureIFF#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeProcedureIFF_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeProcedureIFF#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>APour Responsable Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Responsable Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Responsable Unite</em>' containment reference.
	 * @see #setAPourResponsableUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeProcedureIFF_APourResponsableUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourResponsable_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getAPourResponsableUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeProcedureIFF#getAPourResponsableUnite <em>APour Responsable Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Responsable Unite</em>' containment reference.
	 * @see #getAPourResponsableUnite()
	 * @generated
	 */
	void setAPourResponsableUnite(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>Utilise Utilisation IFF</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeUtilisationIFF}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Utilise Utilisation IFF</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utilise Utilisation IFF</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeProcedureIFF_UtiliseUtilisationIFF()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_UtilisationIFF'"
	 *        extendedMetaData="kind='element' name='Utilise_UtilisationIFF'"
	 * @generated
	 */
	EList<TypeUtilisationIFF> getUtiliseUtilisationIFF();

	/**
	 * Returns the value of the '<em><b>Annule Annulation IFF</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAnnulationIFF}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annule Annulation IFF</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annule Annulation IFF</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeProcedureIFF_AnnuleAnnulationIFF()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_AnnulationIFF'"
	 *        extendedMetaData="kind='element' name='Annule_AnnulationIFF'"
	 * @generated
	 */
	EList<TypeAnnulationIFF> getAnnuleAnnulationIFF();

	/**
	 * Returns the value of the '<em><b>SApplique Sur Autre Element Controle</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SApplique Sur Autre Element Controle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SApplique Sur Autre Element Controle</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeProcedureIFF_SAppliqueSurAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='SAppliqueSur_AutreElementControle'"
	 * @generated
	 */
	EList<TypeAssociation> getSAppliqueSurAutreElementControle();

} // TypeProcedureIFF
