/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeAngle;
import mpia.meta.TypeDataTypeLongueur;
import mpia.meta.TypeDataTypeVitesseLineaire;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Association Objectif Activite Localisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationObjectifActiviteLocalisation#getAngleMouvement <em>Angle Mouvement</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationObjectifActiviteLocalisation#getVitesse <em>Vitesse</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationObjectifActiviteLocalisation#getPlafondBandeAlt <em>Plafond Bande Alt</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationObjectifActiviteLocalisation#getPlancherBandeAlt <em>Plancher Bande Alt</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationObjectifActiviteLocalisation#getPrecisionHoriz <em>Precision Horiz</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationObjectifActiviteLocalisation#getPrecisionVerticale <em>Precision Verticale</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationObjectifActiviteLocalisation#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationObjectifActiviteLocalisation#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationObjectifActiviteLocalisation#getEstLocaliseEnLocalisation <em>Est Localise En Localisation</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationObjectifActiviteLocalisation#getEstRapporteeParRapport <em>Est Rapportee Par Rapport</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationObjectifActiviteLocalisation()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_AssociationObjectifActiviteLocalisation' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationObjectifActiviteLocalisation extends EObject {
	/**
	 * Returns the value of the '<em><b>Angle Mouvement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angle Mouvement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle Mouvement</em>' containment reference.
	 * @see #setAngleMouvement(TypeDataTypeAngle)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationObjectifActiviteLocalisation_AngleMouvement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AngleMouvement'"
	 * @generated
	 */
	TypeDataTypeAngle getAngleMouvement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationObjectifActiviteLocalisation#getAngleMouvement <em>Angle Mouvement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Mouvement</em>' containment reference.
	 * @see #getAngleMouvement()
	 * @generated
	 */
	void setAngleMouvement(TypeDataTypeAngle value);

	/**
	 * Returns the value of the '<em><b>Vitesse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vitesse</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vitesse</em>' containment reference.
	 * @see #setVitesse(TypeDataTypeVitesseLineaire)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationObjectifActiviteLocalisation_Vitesse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Vitesse'"
	 * @generated
	 */
	TypeDataTypeVitesseLineaire getVitesse();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationObjectifActiviteLocalisation#getVitesse <em>Vitesse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vitesse</em>' containment reference.
	 * @see #getVitesse()
	 * @generated
	 */
	void setVitesse(TypeDataTypeVitesseLineaire value);

	/**
	 * Returns the value of the '<em><b>Plafond Bande Alt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plafond Bande Alt</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plafond Bande Alt</em>' containment reference.
	 * @see #setPlafondBandeAlt(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationObjectifActiviteLocalisation_PlafondBandeAlt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PlafondBandeAlt'"
	 * @generated
	 */
	TypeDataTypeLongueur getPlafondBandeAlt();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationObjectifActiviteLocalisation#getPlafondBandeAlt <em>Plafond Bande Alt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plafond Bande Alt</em>' containment reference.
	 * @see #getPlafondBandeAlt()
	 * @generated
	 */
	void setPlafondBandeAlt(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Plancher Bande Alt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plancher Bande Alt</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plancher Bande Alt</em>' containment reference.
	 * @see #setPlancherBandeAlt(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationObjectifActiviteLocalisation_PlancherBandeAlt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PlancherBandeAlt'"
	 * @generated
	 */
	TypeDataTypeLongueur getPlancherBandeAlt();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationObjectifActiviteLocalisation#getPlancherBandeAlt <em>Plancher Bande Alt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plancher Bande Alt</em>' containment reference.
	 * @see #getPlancherBandeAlt()
	 * @generated
	 */
	void setPlancherBandeAlt(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Precision Horiz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision Horiz</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision Horiz</em>' attribute.
	 * @see #isSetPrecisionHoriz()
	 * @see #unsetPrecisionHoriz()
	 * @see #setPrecisionHoriz(double)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationObjectifActiviteLocalisation_PrecisionHoriz()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='PrecisionHoriz'"
	 * @generated
	 */
	double getPrecisionHoriz();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationObjectifActiviteLocalisation#getPrecisionHoriz <em>Precision Horiz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision Horiz</em>' attribute.
	 * @see #isSetPrecisionHoriz()
	 * @see #unsetPrecisionHoriz()
	 * @see #getPrecisionHoriz()
	 * @generated
	 */
	void setPrecisionHoriz(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationObjectifActiviteLocalisation#getPrecisionHoriz <em>Precision Horiz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrecisionHoriz()
	 * @see #getPrecisionHoriz()
	 * @see #setPrecisionHoriz(double)
	 * @generated
	 */
	void unsetPrecisionHoriz();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationObjectifActiviteLocalisation#getPrecisionHoriz <em>Precision Horiz</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Precision Horiz</em>' attribute is set.
	 * @see #unsetPrecisionHoriz()
	 * @see #getPrecisionHoriz()
	 * @see #setPrecisionHoriz(double)
	 * @generated
	 */
	boolean isSetPrecisionHoriz();

	/**
	 * Returns the value of the '<em><b>Precision Verticale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision Verticale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision Verticale</em>' attribute.
	 * @see #isSetPrecisionVerticale()
	 * @see #unsetPrecisionVerticale()
	 * @see #setPrecisionVerticale(double)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationObjectifActiviteLocalisation_PrecisionVerticale()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='PrecisionVerticale'"
	 * @generated
	 */
	double getPrecisionVerticale();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationObjectifActiviteLocalisation#getPrecisionVerticale <em>Precision Verticale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision Verticale</em>' attribute.
	 * @see #isSetPrecisionVerticale()
	 * @see #unsetPrecisionVerticale()
	 * @see #getPrecisionVerticale()
	 * @generated
	 */
	void setPrecisionVerticale(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationObjectifActiviteLocalisation#getPrecisionVerticale <em>Precision Verticale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrecisionVerticale()
	 * @see #getPrecisionVerticale()
	 * @see #setPrecisionVerticale(double)
	 * @generated
	 */
	void unsetPrecisionVerticale();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationObjectifActiviteLocalisation#getPrecisionVerticale <em>Precision Verticale</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Precision Verticale</em>' attribute is set.
	 * @see #unsetPrecisionVerticale()
	 * @see #getPrecisionVerticale()
	 * @see #setPrecisionVerticale(double)
	 * @generated
	 */
	boolean isSetPrecisionVerticale();

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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationObjectifActiviteLocalisation_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationObjectifActiviteLocalisation#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationObjectifActiviteLocalisation_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationObjectifActiviteLocalisation#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Est Localise En Localisation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Localise En Localisation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Localise En Localisation</em>' containment reference.
	 * @see #setEstLocaliseEnLocalisation(TypeLocalisation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationObjectifActiviteLocalisation_EstLocaliseEnLocalisation()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Localisation'"
	 *        extendedMetaData="kind='element' name='EstLocaliseEn_Localisation'"
	 * @generated
	 */
	TypeLocalisation getEstLocaliseEnLocalisation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationObjectifActiviteLocalisation#getEstLocaliseEnLocalisation <em>Est Localise En Localisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Localise En Localisation</em>' containment reference.
	 * @see #getEstLocaliseEnLocalisation()
	 * @generated
	 */
	void setEstLocaliseEnLocalisation(TypeLocalisation value);

	/**
	 * Returns the value of the '<em><b>Est Rapportee Par Rapport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Rapportee Par Rapport</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Rapportee Par Rapport</em>' containment reference.
	 * @see #setEstRapporteeParRapport(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationObjectifActiviteLocalisation_EstRapporteeParRapport()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Rapport'"
	 *        extendedMetaData="kind='element' name='EstRapporteePar_Rapport'"
	 * @generated
	 */
	TypeAssociation getEstRapporteeParRapport();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationObjectifActiviteLocalisation#getEstRapporteeParRapport <em>Est Rapportee Par Rapport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Rapportee Par Rapport</em>' containment reference.
	 * @see #getEstRapporteeParRapport()
	 * @generated
	 */
	void setEstRapporteeParRapport(TypeAssociation value);

} // TypeAssociationObjectifActiviteLocalisation
