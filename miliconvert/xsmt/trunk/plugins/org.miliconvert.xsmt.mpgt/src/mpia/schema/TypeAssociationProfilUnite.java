/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Association Profil Unite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationProfilUnite#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationProfilUnite#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationProfilUnite#getEtatPersonnel <em>Etat Personnel</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationProfilUnite#getDegreEngagement <em>Degre Engagement</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationProfilUnite#getTempsReaction <em>Temps Reaction</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationProfilUnite#getReactiviteEmploi <em>Reactivite Emploi</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationProfilUnite#getAssocieCommeSujetUnite <em>Associe Comme Sujet Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationProfilUnite#getAssocieCommeObjetProfil <em>Associe Comme Objet Profil</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationProfilUnite()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationProfilUnite' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationProfilUnite extends EObject {
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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationProfilUnite_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationProfilUnite#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationProfilUnite_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationProfilUnite#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Etat Personnel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat Personnel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat Personnel</em>' attribute.
	 * @see #setEtatPersonnel(String)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationProfilUnite_EtatPersonnel()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030"
	 *        extendedMetaData="kind='element' name='EtatPersonnel'"
	 * @generated
	 */
	String getEtatPersonnel();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationProfilUnite#getEtatPersonnel <em>Etat Personnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat Personnel</em>' attribute.
	 * @see #getEtatPersonnel()
	 * @generated
	 */
	void setEtatPersonnel(String value);

	/**
	 * Returns the value of the '<em><b>Degre Engagement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Degre Engagement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degre Engagement</em>' attribute.
	 * @see #setDegreEngagement(String)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationProfilUnite_DegreEngagement()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030"
	 *        extendedMetaData="kind='element' name='DegreEngagement'"
	 * @generated
	 */
	String getDegreEngagement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationProfilUnite#getDegreEngagement <em>Degre Engagement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degre Engagement</em>' attribute.
	 * @see #getDegreEngagement()
	 * @generated
	 */
	void setDegreEngagement(String value);

	/**
	 * Returns the value of the '<em><b>Temps Reaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temps Reaction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temps Reaction</em>' attribute.
	 * @see #setTempsReaction(String)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationProfilUnite_TempsReaction()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030"
	 *        extendedMetaData="kind='element' name='TempsReaction'"
	 * @generated
	 */
	String getTempsReaction();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationProfilUnite#getTempsReaction <em>Temps Reaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temps Reaction</em>' attribute.
	 * @see #getTempsReaction()
	 * @generated
	 */
	void setTempsReaction(String value);

	/**
	 * Returns the value of the '<em><b>Reactivite Emploi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reactivite Emploi</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reactivite Emploi</em>' attribute.
	 * @see #setReactiviteEmploi(String)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationProfilUnite_ReactiviteEmploi()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030"
	 *        extendedMetaData="kind='element' name='ReactiviteEmploi'"
	 * @generated
	 */
	String getReactiviteEmploi();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationProfilUnite#getReactiviteEmploi <em>Reactivite Emploi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reactivite Emploi</em>' attribute.
	 * @see #getReactiviteEmploi()
	 * @generated
	 */
	void setReactiviteEmploi(String value);

	/**
	 * Returns the value of the '<em><b>Associe Comme Sujet Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Sujet Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Sujet Unite</em>' containment reference.
	 * @see #setAssocieCommeSujetUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationProfilUnite_AssocieCommeSujetUnite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssociationProfilUnite' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='AssocieCommeSujet_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getAssocieCommeSujetUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationProfilUnite#getAssocieCommeSujetUnite <em>Associe Comme Sujet Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Sujet Unite</em>' containment reference.
	 * @see #getAssocieCommeSujetUnite()
	 * @generated
	 */
	void setAssocieCommeSujetUnite(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>Associe Comme Objet Profil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Objet Profil</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Objet Profil</em>' containment reference.
	 * @see #setAssocieCommeObjetProfil(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationProfilUnite_AssocieCommeObjetProfil()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssociationProfilUnite' target_entity='type_Profil'"
	 *        extendedMetaData="kind='element' name='AssocieCommeObjet_Profil'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeObjetProfil();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationProfilUnite#getAssocieCommeObjetProfil <em>Associe Comme Objet Profil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Objet Profil</em>' containment reference.
	 * @see #getAssocieCommeObjetProfil()
	 * @generated
	 */
	void setAssocieCommeObjetProfil(TypeAssociation value);

} // TypeAssociationProfilUnite
