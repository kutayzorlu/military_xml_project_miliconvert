/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Pertes Sante Par Echelon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypePertesSanteParEchelon#getEchelon <em>Echelon</em>}</li>
 *   <li>{@link mpia.schema.TypePertesSanteParEchelon#getEstimationPertes <em>Estimation Pertes</em>}</li>
 *   <li>{@link mpia.schema.TypePertesSanteParEchelon#getDebutCreneau <em>Debut Creneau</em>}</li>
 *   <li>{@link mpia.schema.TypePertesSanteParEchelon#getFinCreneau <em>Fin Creneau</em>}</li>
 *   <li>{@link mpia.schema.TypePertesSanteParEchelon#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypePertesSanteParEchelon#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypePertesSanteParEchelon#getVautPendantHoraireManoeuvre <em>Vaut Pendant Horaire Manoeuvre</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypePertesSanteParEchelon()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_PertesSanteParEchelon' kind='elementOnly'"
 * @generated
 */
public interface TypePertesSanteParEchelon extends EObject {
	/**
	 * Returns the value of the '<em><b>Echelon</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEchelonEchelon}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Echelon</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Echelon</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEchelonEchelon
	 * @see #isSetEchelon()
	 * @see #unsetEchelon()
	 * @see #setEchelon(TypeDictionaryDicoEchelonEchelon)
	 * @see mpia.schema.SchemaPackage#getTypePertesSanteParEchelon_Echelon()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Echelon'"
	 * @generated
	 */
	TypeDictionaryDicoEchelonEchelon getEchelon();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePertesSanteParEchelon#getEchelon <em>Echelon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Echelon</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEchelonEchelon
	 * @see #isSetEchelon()
	 * @see #unsetEchelon()
	 * @see #getEchelon()
	 * @generated
	 */
	void setEchelon(TypeDictionaryDicoEchelonEchelon value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePertesSanteParEchelon#getEchelon <em>Echelon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEchelon()
	 * @see #getEchelon()
	 * @see #setEchelon(TypeDictionaryDicoEchelonEchelon)
	 * @generated
	 */
	void unsetEchelon();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePertesSanteParEchelon#getEchelon <em>Echelon</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Echelon</em>' attribute is set.
	 * @see #unsetEchelon()
	 * @see #getEchelon()
	 * @see #setEchelon(TypeDictionaryDicoEchelonEchelon)
	 * @generated
	 */
	boolean isSetEchelon();

	/**
	 * Returns the value of the '<em><b>Estimation Pertes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimation Pertes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimation Pertes</em>' attribute.
	 * @see #isSetEstimationPertes()
	 * @see #unsetEstimationPertes()
	 * @see #setEstimationPertes(double)
	 * @see mpia.schema.SchemaPackage#getTypePertesSanteParEchelon_EstimationPertes()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeRatio" required="true"
	 *        extendedMetaData="kind='element' name='EstimationPertes'"
	 * @generated
	 */
	double getEstimationPertes();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePertesSanteParEchelon#getEstimationPertes <em>Estimation Pertes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimation Pertes</em>' attribute.
	 * @see #isSetEstimationPertes()
	 * @see #unsetEstimationPertes()
	 * @see #getEstimationPertes()
	 * @generated
	 */
	void setEstimationPertes(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePertesSanteParEchelon#getEstimationPertes <em>Estimation Pertes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEstimationPertes()
	 * @see #getEstimationPertes()
	 * @see #setEstimationPertes(double)
	 * @generated
	 */
	void unsetEstimationPertes();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePertesSanteParEchelon#getEstimationPertes <em>Estimation Pertes</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Estimation Pertes</em>' attribute is set.
	 * @see #unsetEstimationPertes()
	 * @see #getEstimationPertes()
	 * @see #setEstimationPertes(double)
	 * @generated
	 */
	boolean isSetEstimationPertes();

	/**
	 * Returns the value of the '<em><b>Debut Creneau</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Debut Creneau</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debut Creneau</em>' attribute.
	 * @see #setDebutCreneau(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypePertesSanteParEchelon_DebutCreneau()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DebutCreneau'"
	 * @generated
	 */
	XMLGregorianCalendar getDebutCreneau();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePertesSanteParEchelon#getDebutCreneau <em>Debut Creneau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debut Creneau</em>' attribute.
	 * @see #getDebutCreneau()
	 * @generated
	 */
	void setDebutCreneau(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Fin Creneau</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fin Creneau</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin Creneau</em>' attribute.
	 * @see #setFinCreneau(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypePertesSanteParEchelon_FinCreneau()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='FinCreneau'"
	 * @generated
	 */
	XMLGregorianCalendar getFinCreneau();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePertesSanteParEchelon#getFinCreneau <em>Fin Creneau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin Creneau</em>' attribute.
	 * @see #getFinCreneau()
	 * @generated
	 */
	void setFinCreneau(XMLGregorianCalendar value);

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
	 * @see mpia.schema.SchemaPackage#getTypePertesSanteParEchelon_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePertesSanteParEchelon#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypePertesSanteParEchelon_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePertesSanteParEchelon#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Vaut Pendant Horaire Manoeuvre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vaut Pendant Horaire Manoeuvre</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vaut Pendant Horaire Manoeuvre</em>' containment reference.
	 * @see #setVautPendantHoraireManoeuvre(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypePertesSanteParEchelon_VautPendantHoraireManoeuvre()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_HoraireManoeuvre'"
	 *        extendedMetaData="kind='element' name='VautPendant_HoraireManoeuvre'"
	 * @generated
	 */
	TypeAssociation getVautPendantHoraireManoeuvre();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePertesSanteParEchelon#getVautPendantHoraireManoeuvre <em>Vaut Pendant Horaire Manoeuvre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vaut Pendant Horaire Manoeuvre</em>' containment reference.
	 * @see #getVautPendantHoraireManoeuvre()
	 * @generated
	 */
	void setVautPendantHoraireManoeuvre(TypeAssociation value);

} // TypePertesSanteParEchelon
