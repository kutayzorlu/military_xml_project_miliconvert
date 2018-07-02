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
 * A representation of the model object '<em><b>Type Consigne Lutte Antiaerienne TTA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeConsigneLutteAntiaerienneTTA#getRegleOuvertureFeu <em>Regle Ouverture Feu</em>}</li>
 *   <li>{@link mpia.schema.TypeConsigneLutteAntiaerienneTTA#getDebutApplication <em>Debut Application</em>}</li>
 *   <li>{@link mpia.schema.TypeConsigneLutteAntiaerienneTTA#getFinApplication <em>Fin Application</em>}</li>
 *   <li>{@link mpia.schema.TypeConsigneLutteAntiaerienneTTA#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeConsigneLutteAntiaerienneTTA#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeConsigneLutteAntiaerienneTTA#getConcerneEnginsVolantsTypeAeronef <em>Concerne Engins Volants Type Aeronef</em>}</li>
 *   <li>{@link mpia.schema.TypeConsigneLutteAntiaerienneTTA#getConcerneUnitesUnite <em>Concerne Unites Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeConsigneLutteAntiaerienneTTA#getACommeLigneApplicationAutreElementControle <em>AComme Ligne Application Autre Element Controle</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeConsigneLutteAntiaerienneTTA()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_ConsigneLutteAntiaerienneTTA' kind='elementOnly'"
 * @generated
 */
public interface TypeConsigneLutteAntiaerienneTTA extends EObject {
	/**
	 * Returns the value of the '<em><b>Regle Ouverture Feu</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoConsigneLutteAntiaerienneTTARegleOuvertureFeu}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regle Ouverture Feu</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regle Ouverture Feu</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoConsigneLutteAntiaerienneTTARegleOuvertureFeu
	 * @see #isSetRegleOuvertureFeu()
	 * @see #unsetRegleOuvertureFeu()
	 * @see #setRegleOuvertureFeu(TypeDictionaryDicoConsigneLutteAntiaerienneTTARegleOuvertureFeu)
	 * @see mpia.schema.SchemaPackage#getTypeConsigneLutteAntiaerienneTTA_RegleOuvertureFeu()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='RegleOuvertureFeu'"
	 * @generated
	 */
	TypeDictionaryDicoConsigneLutteAntiaerienneTTARegleOuvertureFeu getRegleOuvertureFeu();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsigneLutteAntiaerienneTTA#getRegleOuvertureFeu <em>Regle Ouverture Feu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regle Ouverture Feu</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoConsigneLutteAntiaerienneTTARegleOuvertureFeu
	 * @see #isSetRegleOuvertureFeu()
	 * @see #unsetRegleOuvertureFeu()
	 * @see #getRegleOuvertureFeu()
	 * @generated
	 */
	void setRegleOuvertureFeu(TypeDictionaryDicoConsigneLutteAntiaerienneTTARegleOuvertureFeu value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeConsigneLutteAntiaerienneTTA#getRegleOuvertureFeu <em>Regle Ouverture Feu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRegleOuvertureFeu()
	 * @see #getRegleOuvertureFeu()
	 * @see #setRegleOuvertureFeu(TypeDictionaryDicoConsigneLutteAntiaerienneTTARegleOuvertureFeu)
	 * @generated
	 */
	void unsetRegleOuvertureFeu();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeConsigneLutteAntiaerienneTTA#getRegleOuvertureFeu <em>Regle Ouverture Feu</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Regle Ouverture Feu</em>' attribute is set.
	 * @see #unsetRegleOuvertureFeu()
	 * @see #getRegleOuvertureFeu()
	 * @see #setRegleOuvertureFeu(TypeDictionaryDicoConsigneLutteAntiaerienneTTARegleOuvertureFeu)
	 * @generated
	 */
	boolean isSetRegleOuvertureFeu();

	/**
	 * Returns the value of the '<em><b>Debut Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Debut Application</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debut Application</em>' attribute.
	 * @see #setDebutApplication(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeConsigneLutteAntiaerienneTTA_DebutApplication()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DebutApplication'"
	 * @generated
	 */
	XMLGregorianCalendar getDebutApplication();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsigneLutteAntiaerienneTTA#getDebutApplication <em>Debut Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debut Application</em>' attribute.
	 * @see #getDebutApplication()
	 * @generated
	 */
	void setDebutApplication(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Fin Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fin Application</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin Application</em>' attribute.
	 * @see #setFinApplication(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeConsigneLutteAntiaerienneTTA_FinApplication()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='FinApplication'"
	 * @generated
	 */
	XMLGregorianCalendar getFinApplication();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsigneLutteAntiaerienneTTA#getFinApplication <em>Fin Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin Application</em>' attribute.
	 * @see #getFinApplication()
	 * @generated
	 */
	void setFinApplication(XMLGregorianCalendar value);

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
	 * @see mpia.schema.SchemaPackage#getTypeConsigneLutteAntiaerienneTTA_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsigneLutteAntiaerienneTTA#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeConsigneLutteAntiaerienneTTA_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsigneLutteAntiaerienneTTA#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Concerne Engins Volants Type Aeronef</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Engins Volants Type Aeronef</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Engins Volants Type Aeronef</em>' containment reference.
	 * @see #setConcerneEnginsVolantsTypeAeronef(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeConsigneLutteAntiaerienneTTA_ConcerneEnginsVolantsTypeAeronef()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeAeronef'"
	 *        extendedMetaData="kind='element' name='ConcerneEnginsVolants_TypeAeronef'"
	 * @generated
	 */
	TypeAssociationEXT getConcerneEnginsVolantsTypeAeronef();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsigneLutteAntiaerienneTTA#getConcerneEnginsVolantsTypeAeronef <em>Concerne Engins Volants Type Aeronef</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concerne Engins Volants Type Aeronef</em>' containment reference.
	 * @see #getConcerneEnginsVolantsTypeAeronef()
	 * @generated
	 */
	void setConcerneEnginsVolantsTypeAeronef(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>Concerne Unites Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociationEXT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Unites Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Unites Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeConsigneLutteAntiaerienneTTA_ConcerneUnitesUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='ConcerneUnites_Unite'"
	 * @generated
	 */
	EList<TypeAssociationEXT> getConcerneUnitesUnite();

	/**
	 * Returns the value of the '<em><b>AComme Ligne Application Autre Element Controle</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Ligne Application Autre Element Controle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Ligne Application Autre Element Controle</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeConsigneLutteAntiaerienneTTA_ACommeLigneApplicationAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='ACommeLigneApplication_AutreElementControle'"
	 * @generated
	 */
	EList<TypeAssociation> getACommeLigneApplicationAutreElementControle();

} // TypeConsigneLutteAntiaerienneTTA
