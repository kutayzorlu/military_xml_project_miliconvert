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
 * A representation of the model object '<em><b>Type Ravitaillement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeRavitaillement#getNomIlot <em>Nom Ilot</em>}</li>
 *   <li>{@link mpia.schema.TypeRavitaillement#getDateDeDebut <em>Date De Debut</em>}</li>
 *   <li>{@link mpia.schema.TypeRavitaillement#getDateDeFin <em>Date De Fin</em>}</li>
 *   <li>{@link mpia.schema.TypeRavitaillement#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.TypeRavitaillement#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeRavitaillement#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeRavitaillement#getACommePointDeRaccordementAutreElementControle <em>AComme Point De Raccordement Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeRavitaillement#getDecritCaracteristiquesUnitesARavitaillerUnite <em>Decrit Caracteristiques Unites ARavitailler Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeRavitaillement()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_Ravitaillement' kind='elementOnly'"
 * @generated
 */
public interface TypeRavitaillement extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom Ilot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom Ilot</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Ilot</em>' attribute.
	 * @see #setNomIlot(String)
	 * @see mpia.schema.SchemaPackage#getTypeRavitaillement_NomIlot()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080" required="true"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='NomIlot'"
	 * @generated
	 */
	String getNomIlot();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRavitaillement#getNomIlot <em>Nom Ilot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Ilot</em>' attribute.
	 * @see #getNomIlot()
	 * @generated
	 */
	void setNomIlot(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeRavitaillement_DateDeDebut()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateDeDebut'"
	 * @generated
	 */
	XMLGregorianCalendar getDateDeDebut();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRavitaillement#getDateDeDebut <em>Date De Debut</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeRavitaillement_DateDeFin()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateDeFin'"
	 * @generated
	 */
	XMLGregorianCalendar getDateDeFin();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRavitaillement#getDateDeFin <em>Date De Fin</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeRavitaillement_Commentaire()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='Commentaire'"
	 * @generated
	 */
	String getCommentaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRavitaillement#getCommentaire <em>Commentaire</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeRavitaillement_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRavitaillement#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeRavitaillement_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRavitaillement#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>AComme Point De Raccordement Autre Element Controle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Point De Raccordement Autre Element Controle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Point De Raccordement Autre Element Controle</em>' containment reference.
	 * @see #setACommePointDeRaccordementAutreElementControle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeRavitaillement_ACommePointDeRaccordementAutreElementControle()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='ACommePointDeRaccordement_AutreElementControle'"
	 * @generated
	 */
	TypeAssociation getACommePointDeRaccordementAutreElementControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRavitaillement#getACommePointDeRaccordementAutreElementControle <em>AComme Point De Raccordement Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Point De Raccordement Autre Element Controle</em>' containment reference.
	 * @see #getACommePointDeRaccordementAutreElementControle()
	 * @generated
	 */
	void setACommePointDeRaccordementAutreElementControle(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Decrit Caracteristiques Unites ARavitailler Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociationEXT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decrit Caracteristiques Unites ARavitailler Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decrit Caracteristiques Unites ARavitailler Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeRavitaillement_DecritCaracteristiquesUnitesARavitaillerUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='DecritCaracteristiquesUnitesARavitailler_Unite'"
	 * @generated
	 */
	EList<TypeAssociationEXT> getDecritCaracteristiquesUnitesARavitaillerUnite();

} // TypeRavitaillement
