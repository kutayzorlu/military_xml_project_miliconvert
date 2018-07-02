/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Manutention AEffectuer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeManutentionAEffectuer#getDescriptionMission <em>Description Mission</em>}</li>
 *   <li>{@link mpia.schema.TypeManutentionAEffectuer#getDateDeDebut <em>Date De Debut</em>}</li>
 *   <li>{@link mpia.schema.TypeManutentionAEffectuer#getDateDeFin <em>Date De Fin</em>}</li>
 *   <li>{@link mpia.schema.TypeManutentionAEffectuer#getMoyens <em>Moyens</em>}</li>
 *   <li>{@link mpia.schema.TypeManutentionAEffectuer#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.TypeManutentionAEffectuer#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeManutentionAEffectuer#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeManutentionAEffectuer#getEstAffecteeUnite <em>Est Affectee Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeManutentionAEffectuer#getACommeLieuMissionManutentionAutreElementControle <em>AComme Lieu Mission Manutention Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeManutentionAEffectuer#getACommeRessourceElementaireRessourceElementaire <em>AComme Ressource Elementaire Ressource Elementaire</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeManutentionAEffectuer()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_ManutentionAEffectuer' kind='elementOnly'"
 * @generated
 */
public interface TypeManutentionAEffectuer extends EObject {
	/**
	 * Returns the value of the '<em><b>Description Mission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description Mission</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description Mission</em>' attribute.
	 * @see #setDescriptionMission(String)
	 * @see mpia.schema.SchemaPackage#getTypeManutentionAEffectuer_DescriptionMission()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255" required="true"
	 *        extendedMetaData="kind='element' name='DescriptionMission'"
	 * @generated
	 */
	String getDescriptionMission();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeManutentionAEffectuer#getDescriptionMission <em>Description Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Mission</em>' attribute.
	 * @see #getDescriptionMission()
	 * @generated
	 */
	void setDescriptionMission(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeManutentionAEffectuer_DateDeDebut()
	 * @model dataType="mpia.meta.TypeDataTypeGDH" required="true"
	 *        extendedMetaData="kind='element' name='DateDeDebut'"
	 * @generated
	 */
	XMLGregorianCalendar getDateDeDebut();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeManutentionAEffectuer#getDateDeDebut <em>Date De Debut</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeManutentionAEffectuer_DateDeFin()
	 * @model dataType="mpia.meta.TypeDataTypeGDH" required="true"
	 *        extendedMetaData="kind='element' name='DateDeFin'"
	 * @generated
	 */
	XMLGregorianCalendar getDateDeFin();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeManutentionAEffectuer#getDateDeFin <em>Date De Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date De Fin</em>' attribute.
	 * @see #getDateDeFin()
	 * @generated
	 */
	void setDateDeFin(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Moyens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moyens</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moyens</em>' attribute.
	 * @see #setMoyens(String)
	 * @see mpia.schema.SchemaPackage#getTypeManutentionAEffectuer_Moyens()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='Moyens'"
	 * @generated
	 */
	String getMoyens();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeManutentionAEffectuer#getMoyens <em>Moyens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moyens</em>' attribute.
	 * @see #getMoyens()
	 * @generated
	 */
	void setMoyens(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeManutentionAEffectuer_Commentaire()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='Commentaire'"
	 * @generated
	 */
	String getCommentaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeManutentionAEffectuer#getCommentaire <em>Commentaire</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeManutentionAEffectuer_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeManutentionAEffectuer#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeManutentionAEffectuer_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeManutentionAEffectuer#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Est Affectee Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Affectee Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Affectee Unite</em>' containment reference.
	 * @see #setEstAffecteeUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeManutentionAEffectuer_EstAffecteeUnite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='EstAffectee_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getEstAffecteeUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeManutentionAEffectuer#getEstAffecteeUnite <em>Est Affectee Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Affectee Unite</em>' containment reference.
	 * @see #getEstAffecteeUnite()
	 * @generated
	 */
	void setEstAffecteeUnite(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>AComme Lieu Mission Manutention Autre Element Controle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Lieu Mission Manutention Autre Element Controle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Lieu Mission Manutention Autre Element Controle</em>' containment reference.
	 * @see #setACommeLieuMissionManutentionAutreElementControle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeManutentionAEffectuer_ACommeLieuMissionManutentionAutreElementControle()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='ACommeLieuMissionManutention_AutreElementControle'"
	 * @generated
	 */
	TypeAssociation getACommeLieuMissionManutentionAutreElementControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeManutentionAEffectuer#getACommeLieuMissionManutentionAutreElementControle <em>AComme Lieu Mission Manutention Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Lieu Mission Manutention Autre Element Controle</em>' containment reference.
	 * @see #getACommeLieuMissionManutentionAutreElementControle()
	 * @generated
	 */
	void setACommeLieuMissionManutentionAutreElementControle(TypeAssociation value);

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
	 * @see mpia.schema.SchemaPackage#getTypeManutentionAEffectuer_ACommeRessourceElementaireRessourceElementaire()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_RessourceElementaire'"
	 *        extendedMetaData="kind='element' name='ACommeRessourceElementaire_RessourceElementaire'"
	 * @generated
	 */
	EList<TypeRessourceElementaire> getACommeRessourceElementaireRessourceElementaire();

} // TypeManutentionAEffectuer
