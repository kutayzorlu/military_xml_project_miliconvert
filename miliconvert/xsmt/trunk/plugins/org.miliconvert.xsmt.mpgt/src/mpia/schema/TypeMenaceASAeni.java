/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Menace AS Aeni</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMenaceASAeni#getIntituleHypothese <em>Intitule Hypothese</em>}</li>
 *   <li>{@link mpia.schema.TypeMenaceASAeni#getACommeActionParTempsManoeuvreAction <em>AComme Action Par Temps Manoeuvre Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMenaceASAeni()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_MenaceASAeni' kind='elementOnly'"
 * @generated
 */
public interface TypeMenaceASAeni extends TypeMenace {
	/**
	 * Returns the value of the '<em><b>Intitule Hypothese</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intitule Hypothese</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intitule Hypothese</em>' attribute.
	 * @see #setIntituleHypothese(String)
	 * @see mpia.schema.SchemaPackage#getTypeMenaceASAeni_IntituleHypothese()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='IntituleHypothese'"
	 * @generated
	 */
	String getIntituleHypothese();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMenaceASAeni#getIntituleHypothese <em>Intitule Hypothese</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intitule Hypothese</em>' attribute.
	 * @see #getIntituleHypothese()
	 * @generated
	 */
	void setIntituleHypothese(String value);

	/**
	 * Returns the value of the '<em><b>AComme Action Par Temps Manoeuvre Action</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Action Par Temps Manoeuvre Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Action Par Temps Manoeuvre Action</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMenaceASAeni_ACommeActionParTempsManoeuvreAction()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Action'"
	 *        extendedMetaData="kind='element' name='ACommeActionParTempsManoeuvre_Action'"
	 * @generated
	 */
	EList<TypeAssociation> getACommeActionParTempsManoeuvreAction();

} // TypeMenaceASAeni
