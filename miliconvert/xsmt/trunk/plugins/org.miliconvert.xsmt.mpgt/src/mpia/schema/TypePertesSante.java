/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Pertes Sante</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypePertesSante#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypePertesSante#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypePertesSante#getRapporteParEchelonPertesSanteParEchelon <em>Rapporte Par Echelon Pertes Sante Par Echelon</em>}</li>
 *   <li>{@link mpia.schema.TypePertesSante#getRapporteParUnitePertesSanteParUnite <em>Rapporte Par Unite Pertes Sante Par Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypePertesSante()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_PertesSante' kind='elementOnly'"
 * @generated
 */
public interface TypePertesSante extends EObject {
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
	 * @see mpia.schema.SchemaPackage#getTypePertesSante_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePertesSante#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypePertesSante_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePertesSante#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Rapporte Par Echelon Pertes Sante Par Echelon</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypePertesSanteParEchelon}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rapporte Par Echelon Pertes Sante Par Echelon</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rapporte Par Echelon Pertes Sante Par Echelon</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePertesSante_RapporteParEchelonPertesSanteParEchelon()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_PertesSanteParEchelon'"
	 *        extendedMetaData="kind='element' name='RapporteParEchelon_PertesSanteParEchelon'"
	 * @generated
	 */
	EList<TypePertesSanteParEchelon> getRapporteParEchelonPertesSanteParEchelon();

	/**
	 * Returns the value of the '<em><b>Rapporte Par Unite Pertes Sante Par Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypePertesSanteParUnite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rapporte Par Unite Pertes Sante Par Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rapporte Par Unite Pertes Sante Par Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePertesSante_RapporteParUnitePertesSanteParUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_PertesSanteParUnite'"
	 *        extendedMetaData="kind='element' name='RapporteParUnite_PertesSanteParUnite'"
	 * @generated
	 */
	EList<TypePertesSanteParUnite> getRapporteParUnitePertesSanteParUnite();

} // TypePertesSante
