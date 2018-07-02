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
 * A representation of the model object '<em><b>Type Annulation IFF</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAnnulationIFF#getGDHdebutAnnulation <em>GD Hdebut Annulation</em>}</li>
 *   <li>{@link mpia.schema.TypeAnnulationIFF#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeAnnulationIFF#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeAnnulationIFF#getPorteSurServiceReseau <em>Porte Sur Service Reseau</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAnnulationIFF()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_AnnulationIFF' kind='elementOnly'"
 * @generated
 */
public interface TypeAnnulationIFF extends EObject {
	/**
	 * Returns the value of the '<em><b>GD Hdebut Annulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GD Hdebut Annulation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GD Hdebut Annulation</em>' attribute.
	 * @see #setGDHdebutAnnulation(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeAnnulationIFF_GDHdebutAnnulation()
	 * @model dataType="mpia.meta.TypeDataTypeGDH" required="true"
	 *        extendedMetaData="kind='element' name='GDHdebutAnnulation'"
	 * @generated
	 */
	XMLGregorianCalendar getGDHdebutAnnulation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAnnulationIFF#getGDHdebutAnnulation <em>GD Hdebut Annulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GD Hdebut Annulation</em>' attribute.
	 * @see #getGDHdebutAnnulation()
	 * @generated
	 */
	void setGDHdebutAnnulation(XMLGregorianCalendar value);

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
	 * @see mpia.schema.SchemaPackage#getTypeAnnulationIFF_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAnnulationIFF#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeAnnulationIFF_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAnnulationIFF#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Porte Sur Service Reseau</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Porte Sur Service Reseau</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Porte Sur Service Reseau</em>' containment reference.
	 * @see #setPorteSurServiceReseau(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAnnulationIFF_PorteSurServiceReseau()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_ServiceReseau'"
	 *        extendedMetaData="kind='element' name='PorteSur_ServiceReseau'"
	 * @generated
	 */
	TypeAssociation getPorteSurServiceReseau();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAnnulationIFF#getPorteSurServiceReseau <em>Porte Sur Service Reseau</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Porte Sur Service Reseau</em>' containment reference.
	 * @see #getPorteSurServiceReseau()
	 * @generated
	 */
	void setPorteSurServiceReseau(TypeAssociation value);

} // TypeAnnulationIFF
