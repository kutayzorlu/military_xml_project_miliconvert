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
 * A representation of the model object '<em><b>Type Groupement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeGroupement#getDegreCentralisationASS <em>Degre Centralisation ASS</em>}</li>
 *   <li>{@link mpia.schema.TypeGroupement#getFonctionAutoriteResponsable <em>Fonction Autorite Responsable</em>}</li>
 *   <li>{@link mpia.schema.TypeGroupement#getGDHdebutActivation <em>GD Hdebut Activation</em>}</li>
 *   <li>{@link mpia.schema.TypeGroupement#getGDHfinActivation <em>GD Hfin Activation</em>}</li>
 *   <li>{@link mpia.schema.TypeGroupement#getNomEtRangAutoriteResponsable <em>Nom Et Rang Autorite Responsable</em>}</li>
 *   <li>{@link mpia.schema.TypeGroupement#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.TypeGroupement#getEstSpecifiePourArticulationTerre <em>Est Specifie Pour Articulation Terre</em>}</li>
 *   <li>{@link mpia.schema.TypeGroupement#getEstConstitueUnite <em>Est Constitue Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeGroupement#getAPourResponsableUnite <em>APour Responsable Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeGroupement()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_Groupement' kind='elementOnly'"
 * @generated
 */
public interface TypeGroupement extends EObject {
	/**
	 * Returns the value of the '<em><b>Degre Centralisation ASS</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoGroupementDegreCentralisationASS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Degre Centralisation ASS</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degre Centralisation ASS</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoGroupementDegreCentralisationASS
	 * @see #isSetDegreCentralisationASS()
	 * @see #unsetDegreCentralisationASS()
	 * @see #setDegreCentralisationASS(TypeDictionaryDicoGroupementDegreCentralisationASS)
	 * @see mpia.schema.SchemaPackage#getTypeGroupement_DegreCentralisationASS()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='DegreCentralisationASS'"
	 * @generated
	 */
	TypeDictionaryDicoGroupementDegreCentralisationASS getDegreCentralisationASS();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeGroupement#getDegreCentralisationASS <em>Degre Centralisation ASS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degre Centralisation ASS</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoGroupementDegreCentralisationASS
	 * @see #isSetDegreCentralisationASS()
	 * @see #unsetDegreCentralisationASS()
	 * @see #getDegreCentralisationASS()
	 * @generated
	 */
	void setDegreCentralisationASS(TypeDictionaryDicoGroupementDegreCentralisationASS value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeGroupement#getDegreCentralisationASS <em>Degre Centralisation ASS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDegreCentralisationASS()
	 * @see #getDegreCentralisationASS()
	 * @see #setDegreCentralisationASS(TypeDictionaryDicoGroupementDegreCentralisationASS)
	 * @generated
	 */
	void unsetDegreCentralisationASS();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeGroupement#getDegreCentralisationASS <em>Degre Centralisation ASS</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Degre Centralisation ASS</em>' attribute is set.
	 * @see #unsetDegreCentralisationASS()
	 * @see #getDegreCentralisationASS()
	 * @see #setDegreCentralisationASS(TypeDictionaryDicoGroupementDegreCentralisationASS)
	 * @generated
	 */
	boolean isSetDegreCentralisationASS();

	/**
	 * Returns the value of the '<em><b>Fonction Autorite Responsable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fonction Autorite Responsable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fonction Autorite Responsable</em>' attribute.
	 * @see #setFonctionAutoriteResponsable(String)
	 * @see mpia.schema.SchemaPackage#getTypeGroupement_FonctionAutoriteResponsable()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='FonctionAutoriteResponsable'"
	 * @generated
	 */
	String getFonctionAutoriteResponsable();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeGroupement#getFonctionAutoriteResponsable <em>Fonction Autorite Responsable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fonction Autorite Responsable</em>' attribute.
	 * @see #getFonctionAutoriteResponsable()
	 * @generated
	 */
	void setFonctionAutoriteResponsable(String value);

	/**
	 * Returns the value of the '<em><b>GD Hdebut Activation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GD Hdebut Activation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GD Hdebut Activation</em>' attribute.
	 * @see #setGDHdebutActivation(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeGroupement_GDHdebutActivation()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='GDHdebutActivation'"
	 * @generated
	 */
	XMLGregorianCalendar getGDHdebutActivation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeGroupement#getGDHdebutActivation <em>GD Hdebut Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GD Hdebut Activation</em>' attribute.
	 * @see #getGDHdebutActivation()
	 * @generated
	 */
	void setGDHdebutActivation(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>GD Hfin Activation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GD Hfin Activation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GD Hfin Activation</em>' attribute.
	 * @see #setGDHfinActivation(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeGroupement_GDHfinActivation()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='GDHfinActivation'"
	 * @generated
	 */
	XMLGregorianCalendar getGDHfinActivation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeGroupement#getGDHfinActivation <em>GD Hfin Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GD Hfin Activation</em>' attribute.
	 * @see #getGDHfinActivation()
	 * @generated
	 */
	void setGDHfinActivation(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Nom Et Rang Autorite Responsable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom Et Rang Autorite Responsable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Et Rang Autorite Responsable</em>' attribute.
	 * @see #setNomEtRangAutoriteResponsable(String)
	 * @see mpia.schema.SchemaPackage#getTypeGroupement_NomEtRangAutoriteResponsable()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='NomEtRangAutoriteResponsable'"
	 * @generated
	 */
	String getNomEtRangAutoriteResponsable();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeGroupement#getNomEtRangAutoriteResponsable <em>Nom Et Rang Autorite Responsable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Et Rang Autorite Responsable</em>' attribute.
	 * @see #getNomEtRangAutoriteResponsable()
	 * @generated
	 */
	void setNomEtRangAutoriteResponsable(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeGroupement_Commentaire()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='Commentaire'"
	 * @generated
	 */
	String getCommentaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeGroupement#getCommentaire <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commentaire</em>' attribute.
	 * @see #getCommentaire()
	 * @generated
	 */
	void setCommentaire(String value);

	/**
	 * Returns the value of the '<em><b>Est Specifie Pour Articulation Terre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Specifie Pour Articulation Terre</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Specifie Pour Articulation Terre</em>' containment reference.
	 * @see #setEstSpecifiePourArticulationTerre(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeGroupement_EstSpecifiePourArticulationTerre()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_ArticulationTerre'"
	 *        extendedMetaData="kind='element' name='EstSpecifiePour_ArticulationTerre'"
	 * @generated
	 */
	TypeAssociationEXT getEstSpecifiePourArticulationTerre();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeGroupement#getEstSpecifiePourArticulationTerre <em>Est Specifie Pour Articulation Terre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Specifie Pour Articulation Terre</em>' containment reference.
	 * @see #getEstSpecifiePourArticulationTerre()
	 * @generated
	 */
	void setEstSpecifiePourArticulationTerre(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>Est Constitue Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociationEXT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Constitue Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Constitue Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeGroupement_EstConstitueUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='EstConstitue_Unite'"
	 * @generated
	 */
	EList<TypeAssociationEXT> getEstConstitueUnite();

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
	 * @see mpia.schema.SchemaPackage#getTypeGroupement_APourResponsableUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourResponsable_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getAPourResponsableUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeGroupement#getAPourResponsableUnite <em>APour Responsable Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Responsable Unite</em>' containment reference.
	 * @see #getAPourResponsableUnite()
	 * @generated
	 */
	void setAPourResponsableUnite(TypeAssociationEXT value);

} // TypeGroupement
