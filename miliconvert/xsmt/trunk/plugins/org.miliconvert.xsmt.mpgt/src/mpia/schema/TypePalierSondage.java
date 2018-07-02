/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeAngle;
import mpia.meta.TypeDataTypePression;
import mpia.meta.TypeDataTypeTemperature;
import mpia.meta.TypeDataTypeVitesseLineaire;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Palier Sondage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypePalierSondage#getNumeroPalier <em>Numero Palier</em>}</li>
 *   <li>{@link mpia.schema.TypePalierSondage#getPression <em>Pression</em>}</li>
 *   <li>{@link mpia.schema.TypePalierSondage#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link mpia.schema.TypePalierSondage#getVitesseVent <em>Vitesse Vent</em>}</li>
 *   <li>{@link mpia.schema.TypePalierSondage#getDirectionProvenanceVent <em>Direction Provenance Vent</em>}</li>
 *   <li>{@link mpia.schema.TypePalierSondage#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypePalierSondage#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypePalierSondage()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_PalierSondage' kind='elementOnly'"
 * @generated
 */
public interface TypePalierSondage extends EObject {
	/**
	 * Returns the value of the '<em><b>Numero Palier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Palier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Palier</em>' attribute.
	 * @see #isSetNumeroPalier()
	 * @see #unsetNumeroPalier()
	 * @see #setNumeroPalier(long)
	 * @see mpia.schema.SchemaPackage#getTypePalierSondage_NumeroPalier()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3" required="true"
	 *        extendedMetaData="kind='element' name='NumeroPalier'"
	 * @generated
	 */
	long getNumeroPalier();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePalierSondage#getNumeroPalier <em>Numero Palier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Palier</em>' attribute.
	 * @see #isSetNumeroPalier()
	 * @see #unsetNumeroPalier()
	 * @see #getNumeroPalier()
	 * @generated
	 */
	void setNumeroPalier(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePalierSondage#getNumeroPalier <em>Numero Palier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumeroPalier()
	 * @see #getNumeroPalier()
	 * @see #setNumeroPalier(long)
	 * @generated
	 */
	void unsetNumeroPalier();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePalierSondage#getNumeroPalier <em>Numero Palier</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Numero Palier</em>' attribute is set.
	 * @see #unsetNumeroPalier()
	 * @see #getNumeroPalier()
	 * @see #setNumeroPalier(long)
	 * @generated
	 */
	boolean isSetNumeroPalier();

	/**
	 * Returns the value of the '<em><b>Pression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pression</em>' containment reference.
	 * @see #setPression(TypeDataTypePression)
	 * @see mpia.schema.SchemaPackage#getTypePalierSondage_Pression()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Pression'"
	 * @generated
	 */
	TypeDataTypePression getPression();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePalierSondage#getPression <em>Pression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pression</em>' containment reference.
	 * @see #getPression()
	 * @generated
	 */
	void setPression(TypeDataTypePression value);

	/**
	 * Returns the value of the '<em><b>Temperature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temperature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperature</em>' containment reference.
	 * @see #setTemperature(TypeDataTypeTemperature)
	 * @see mpia.schema.SchemaPackage#getTypePalierSondage_Temperature()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Temperature'"
	 * @generated
	 */
	TypeDataTypeTemperature getTemperature();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePalierSondage#getTemperature <em>Temperature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature</em>' containment reference.
	 * @see #getTemperature()
	 * @generated
	 */
	void setTemperature(TypeDataTypeTemperature value);

	/**
	 * Returns the value of the '<em><b>Vitesse Vent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vitesse Vent</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vitesse Vent</em>' containment reference.
	 * @see #setVitesseVent(TypeDataTypeVitesseLineaire)
	 * @see mpia.schema.SchemaPackage#getTypePalierSondage_VitesseVent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VitesseVent'"
	 * @generated
	 */
	TypeDataTypeVitesseLineaire getVitesseVent();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePalierSondage#getVitesseVent <em>Vitesse Vent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vitesse Vent</em>' containment reference.
	 * @see #getVitesseVent()
	 * @generated
	 */
	void setVitesseVent(TypeDataTypeVitesseLineaire value);

	/**
	 * Returns the value of the '<em><b>Direction Provenance Vent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction Provenance Vent</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction Provenance Vent</em>' containment reference.
	 * @see #setDirectionProvenanceVent(TypeDataTypeAngle)
	 * @see mpia.schema.SchemaPackage#getTypePalierSondage_DirectionProvenanceVent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DirectionProvenanceVent'"
	 * @generated
	 */
	TypeDataTypeAngle getDirectionProvenanceVent();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePalierSondage#getDirectionProvenanceVent <em>Direction Provenance Vent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction Provenance Vent</em>' containment reference.
	 * @see #getDirectionProvenanceVent()
	 * @generated
	 */
	void setDirectionProvenanceVent(TypeDataTypeAngle value);

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
	 * @see mpia.schema.SchemaPackage#getTypePalierSondage_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePalierSondage#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypePalierSondage_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePalierSondage#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

} // TypePalierSondage
