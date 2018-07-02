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
 * A representation of the model object '<em><b>Type Objectif Activite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeObjectifActivite#getQualification <em>Qualification</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifActivite#getPriorite <em>Priorite</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifActivite#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifActivite#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifActivite#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifActivite#getEstObjectifPourActivite <em>Est Objectif Pour Activite</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifActivite#getEstLocaliseParAssociationObjectifActiviteLocalisation <em>Est Localise Par Association Objectif Activite Localisation</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifActivite#getAPourCaracteristiquesObjectif3DObjectif3D <em>APour Caracteristiques Objectif3 DObjectif3 D</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifActivite#getAssocieCommeInstanceObjetInstanceObjet <em>Associe Comme Instance Objet Instance Objet</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifActivite#getACommeObjectifCiblageObjectifCiblage <em>AComme Objectif Ciblage Objectif Ciblage</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifActivite#getEstAutoriseParEntiteOrganisationnelle <em>Est Autorise Par Entite Organisationnelle</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifActivite#getEstTypeObjectifActiviteType <em>Est Type Objectif Activite Type</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifActivite#getEstUneActionAction <em>Est Une Action Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeObjectifActivite()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_ObjectifActivite' kind='elementOnly'"
 * @generated
 */
public interface TypeObjectifActivite extends EObject {
	/**
	 * Returns the value of the '<em><b>Qualification</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoObjectifActiviteQualification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualification</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoObjectifActiviteQualification
	 * @see #isSetQualification()
	 * @see #unsetQualification()
	 * @see #setQualification(TypeDictionaryDicoObjectifActiviteQualification)
	 * @see mpia.schema.SchemaPackage#getTypeObjectifActivite_Qualification()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Qualification'"
	 * @generated
	 */
	TypeDictionaryDicoObjectifActiviteQualification getQualification();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectifActivite#getQualification <em>Qualification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualification</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoObjectifActiviteQualification
	 * @see #isSetQualification()
	 * @see #unsetQualification()
	 * @see #getQualification()
	 * @generated
	 */
	void setQualification(TypeDictionaryDicoObjectifActiviteQualification value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeObjectifActivite#getQualification <em>Qualification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQualification()
	 * @see #getQualification()
	 * @see #setQualification(TypeDictionaryDicoObjectifActiviteQualification)
	 * @generated
	 */
	void unsetQualification();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeObjectifActivite#getQualification <em>Qualification</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Qualification</em>' attribute is set.
	 * @see #unsetQualification()
	 * @see #getQualification()
	 * @see #setQualification(TypeDictionaryDicoObjectifActiviteQualification)
	 * @generated
	 */
	boolean isSetQualification();

	/**
	 * Returns the value of the '<em><b>Priorite</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPriorite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priorite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priorite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPriorite
	 * @see #isSetPriorite()
	 * @see #unsetPriorite()
	 * @see #setPriorite(TypeDictionaryDicoPriorite)
	 * @see mpia.schema.SchemaPackage#getTypeObjectifActivite_Priorite()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Priorite'"
	 * @generated
	 */
	TypeDictionaryDicoPriorite getPriorite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectifActivite#getPriorite <em>Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priorite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPriorite
	 * @see #isSetPriorite()
	 * @see #unsetPriorite()
	 * @see #getPriorite()
	 * @generated
	 */
	void setPriorite(TypeDictionaryDicoPriorite value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeObjectifActivite#getPriorite <em>Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPriorite()
	 * @see #getPriorite()
	 * @see #setPriorite(TypeDictionaryDicoPriorite)
	 * @generated
	 */
	void unsetPriorite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeObjectifActivite#getPriorite <em>Priorite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Priorite</em>' attribute is set.
	 * @see #unsetPriorite()
	 * @see #getPriorite()
	 * @see #setPriorite(TypeDictionaryDicoPriorite)
	 * @generated
	 */
	boolean isSetPriorite();

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
	 * @see mpia.schema.SchemaPackage#getTypeObjectifActivite_Commentaire()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='Commentaire'"
	 * @generated
	 */
	String getCommentaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectifActivite#getCommentaire <em>Commentaire</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeObjectifActivite_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectifActivite#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeObjectifActivite_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectifActivite#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Est Objectif Pour Activite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objectif Pour Activite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objectif Pour Activite</em>' containment reference.
	 * @see #setEstObjectifPourActivite(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeObjectifActivite_EstObjectifPourActivite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjectif_ObjectifActivite' target_entity='type_Activite'"
	 *        extendedMetaData="kind='element' name='EstObjectifPour_Activite'"
	 * @generated
	 */
	TypeAssociation getEstObjectifPourActivite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectifActivite#getEstObjectifPourActivite <em>Est Objectif Pour Activite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Objectif Pour Activite</em>' containment reference.
	 * @see #getEstObjectifPourActivite()
	 * @generated
	 */
	void setEstObjectifPourActivite(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Est Localise Par Association Objectif Activite Localisation</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationObjectifActiviteLocalisation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Localise Par Association Objectif Activite Localisation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Localise Par Association Objectif Activite Localisation</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeObjectifActivite_EstLocaliseParAssociationObjectifActiviteLocalisation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_AssociationObjectifActiviteLocalisation'"
	 *        extendedMetaData="kind='element' name='EstLocalisePar_AssociationObjectifActiviteLocalisation'"
	 * @generated
	 */
	EList<TypeAssociationObjectifActiviteLocalisation> getEstLocaliseParAssociationObjectifActiviteLocalisation();

	/**
	 * Returns the value of the '<em><b>APour Caracteristiques Objectif3 DObjectif3 D</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeObjectif3D}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Caracteristiques Objectif3 DObjectif3 D</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Caracteristiques Objectif3 DObjectif3 D</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeObjectifActivite_APourCaracteristiquesObjectif3DObjectif3D()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Objectif3D'"
	 *        extendedMetaData="kind='element' name='APourCaracteristiquesObjectif3D_Objectif3D'"
	 * @generated
	 */
	EList<TypeObjectif3D> getAPourCaracteristiquesObjectif3DObjectif3D();

	/**
	 * Returns the value of the '<em><b>Associe Comme Instance Objet Instance Objet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Instance Objet Instance Objet</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Instance Objet Instance Objet</em>' containment reference.
	 * @see #setAssocieCommeInstanceObjetInstanceObjet(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeObjectifActivite_AssocieCommeInstanceObjetInstanceObjet()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeObjectifActivite_ObjectifActivite' target_entity='type_InstanceObjet'"
	 *        extendedMetaData="kind='element' name='AssocieCommeInstanceObjet_InstanceObjet'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeInstanceObjetInstanceObjet();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectifActivite#getAssocieCommeInstanceObjetInstanceObjet <em>Associe Comme Instance Objet Instance Objet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Instance Objet Instance Objet</em>' containment reference.
	 * @see #getAssocieCommeInstanceObjetInstanceObjet()
	 * @generated
	 */
	void setAssocieCommeInstanceObjetInstanceObjet(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>AComme Objectif Ciblage Objectif Ciblage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Objectif Ciblage Objectif Ciblage</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Objectif Ciblage Objectif Ciblage</em>' containment reference.
	 * @see #setACommeObjectifCiblageObjectifCiblage(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeObjectifActivite_ACommeObjectifCiblageObjectifCiblage()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='CorrespondA_ObjectifActivite' target_entity='type_ObjectifCiblage'"
	 *        extendedMetaData="kind='element' name='ACommeObjectifCiblage_ObjectifCiblage'"
	 * @generated
	 */
	TypeAssociation getACommeObjectifCiblageObjectifCiblage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectifActivite#getACommeObjectifCiblageObjectifCiblage <em>AComme Objectif Ciblage Objectif Ciblage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Objectif Ciblage Objectif Ciblage</em>' containment reference.
	 * @see #getACommeObjectifCiblageObjectifCiblage()
	 * @generated
	 */
	void setACommeObjectifCiblageObjectifCiblage(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Est Autorise Par Entite Organisationnelle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Autorise Par Entite Organisationnelle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Autorise Par Entite Organisationnelle</em>' containment reference.
	 * @see #setEstAutoriseParEntiteOrganisationnelle(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeObjectifActivite_EstAutoriseParEntiteOrganisationnelle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_EntiteOrganisationnelle'"
	 *        extendedMetaData="kind='element' name='EstAutorisePar_EntiteOrganisationnelle'"
	 * @generated
	 */
	TypeAssociationEXT getEstAutoriseParEntiteOrganisationnelle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectifActivite#getEstAutoriseParEntiteOrganisationnelle <em>Est Autorise Par Entite Organisationnelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Autorise Par Entite Organisationnelle</em>' containment reference.
	 * @see #getEstAutoriseParEntiteOrganisationnelle()
	 * @generated
	 */
	void setEstAutoriseParEntiteOrganisationnelle(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>Est Type Objectif Activite Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Type Objectif Activite Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Type Objectif Activite Type</em>' containment reference.
	 * @see #setEstTypeObjectifActiviteType(TypeObjectifActiviteType)
	 * @see mpia.schema.SchemaPackage#getTypeObjectifActivite_EstTypeObjectifActiviteType()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ObjectifActiviteType'"
	 *        extendedMetaData="kind='element' name='EstType_ObjectifActiviteType'"
	 * @generated
	 */
	TypeObjectifActiviteType getEstTypeObjectifActiviteType();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectifActivite#getEstTypeObjectifActiviteType <em>Est Type Objectif Activite Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Type Objectif Activite Type</em>' containment reference.
	 * @see #getEstTypeObjectifActiviteType()
	 * @generated
	 */
	void setEstTypeObjectifActiviteType(TypeObjectifActiviteType value);

	/**
	 * Returns the value of the '<em><b>Est Une Action Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Une Action Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Une Action Action</em>' containment reference.
	 * @see #setEstUneActionAction(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeObjectifActivite_EstUneActionAction()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Action'"
	 *        extendedMetaData="kind='element' name='EstUneAction_Action'"
	 * @generated
	 */
	TypeAssociation getEstUneActionAction();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectifActivite#getEstUneActionAction <em>Est Une Action Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Une Action Action</em>' containment reference.
	 * @see #getEstUneActionAction()
	 * @generated
	 */
	void setEstUneActionAction(TypeAssociation value);

} // TypeObjectifActivite
