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
 * A representation of the model object '<em><b>Type Domaine Activite Centre</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeDomaineActiviteCentre#getTypeDomaine <em>Type Domaine</em>}</li>
 *   <li>{@link mpia.schema.TypeDomaineActiviteCentre#getAutreTypeDomaine <em>Autre Type Domaine</em>}</li>
 *   <li>{@link mpia.schema.TypeDomaineActiviteCentre#getTauxCouverture <em>Taux Couverture</em>}</li>
 *   <li>{@link mpia.schema.TypeDomaineActiviteCentre#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeDomaineActiviteCentre#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeDomaineActiviteCentre#getACommeAutoriteControle3DUnite <em>AComme Autorite Controle3 DUnite</em>}</li>
 *   <li>{@link mpia.schema.TypeDomaineActiviteCentre#getACommeVolumeActiviteAutreElementControle <em>AComme Volume Activite Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeDomaineActiviteCentre#getACommeTypeMenaceAssocieeTypeAeronef <em>AComme Type Menace Associee Type Aeronef</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeDomaineActiviteCentre()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_DomaineActiviteCentre' kind='elementOnly'"
 * @generated
 */
public interface TypeDomaineActiviteCentre extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Domaine</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoDomaineActiviteCentreTypeDomaine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Domaine</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Domaine</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDomaineActiviteCentreTypeDomaine
	 * @see #isSetTypeDomaine()
	 * @see #unsetTypeDomaine()
	 * @see #setTypeDomaine(TypeDictionaryDicoDomaineActiviteCentreTypeDomaine)
	 * @see mpia.schema.SchemaPackage#getTypeDomaineActiviteCentre_TypeDomaine()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='TypeDomaine'"
	 * @generated
	 */
	TypeDictionaryDicoDomaineActiviteCentreTypeDomaine getTypeDomaine();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDomaineActiviteCentre#getTypeDomaine <em>Type Domaine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Domaine</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDomaineActiviteCentreTypeDomaine
	 * @see #isSetTypeDomaine()
	 * @see #unsetTypeDomaine()
	 * @see #getTypeDomaine()
	 * @generated
	 */
	void setTypeDomaine(TypeDictionaryDicoDomaineActiviteCentreTypeDomaine value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeDomaineActiviteCentre#getTypeDomaine <em>Type Domaine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeDomaine()
	 * @see #getTypeDomaine()
	 * @see #setTypeDomaine(TypeDictionaryDicoDomaineActiviteCentreTypeDomaine)
	 * @generated
	 */
	void unsetTypeDomaine();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeDomaineActiviteCentre#getTypeDomaine <em>Type Domaine</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Domaine</em>' attribute is set.
	 * @see #unsetTypeDomaine()
	 * @see #getTypeDomaine()
	 * @see #setTypeDomaine(TypeDictionaryDicoDomaineActiviteCentreTypeDomaine)
	 * @generated
	 */
	boolean isSetTypeDomaine();

	/**
	 * Returns the value of the '<em><b>Autre Type Domaine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autre Type Domaine</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autre Type Domaine</em>' attribute.
	 * @see #setAutreTypeDomaine(String)
	 * @see mpia.schema.SchemaPackage#getTypeDomaineActiviteCentre_AutreTypeDomaine()
	 * @model dataType="mpia.meta.TypeDataTypeChaine06"
	 *        extendedMetaData="kind='element' name='AutreTypeDomaine'"
	 * @generated
	 */
	String getAutreTypeDomaine();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDomaineActiviteCentre#getAutreTypeDomaine <em>Autre Type Domaine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autre Type Domaine</em>' attribute.
	 * @see #getAutreTypeDomaine()
	 * @generated
	 */
	void setAutreTypeDomaine(String value);

	/**
	 * Returns the value of the '<em><b>Taux Couverture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Taux Couverture</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taux Couverture</em>' attribute.
	 * @see #isSetTauxCouverture()
	 * @see #unsetTauxCouverture()
	 * @see #setTauxCouverture(double)
	 * @see mpia.schema.SchemaPackage#getTypeDomaineActiviteCentre_TauxCouverture()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='TauxCouverture'"
	 * @generated
	 */
	double getTauxCouverture();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDomaineActiviteCentre#getTauxCouverture <em>Taux Couverture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taux Couverture</em>' attribute.
	 * @see #isSetTauxCouverture()
	 * @see #unsetTauxCouverture()
	 * @see #getTauxCouverture()
	 * @generated
	 */
	void setTauxCouverture(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeDomaineActiviteCentre#getTauxCouverture <em>Taux Couverture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTauxCouverture()
	 * @see #getTauxCouverture()
	 * @see #setTauxCouverture(double)
	 * @generated
	 */
	void unsetTauxCouverture();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeDomaineActiviteCentre#getTauxCouverture <em>Taux Couverture</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Taux Couverture</em>' attribute is set.
	 * @see #unsetTauxCouverture()
	 * @see #getTauxCouverture()
	 * @see #setTauxCouverture(double)
	 * @generated
	 */
	boolean isSetTauxCouverture();

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
	 * @see mpia.schema.SchemaPackage#getTypeDomaineActiviteCentre_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDomaineActiviteCentre#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeDomaineActiviteCentre_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDomaineActiviteCentre#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>AComme Autorite Controle3 DUnite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Autorite Controle3 DUnite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Autorite Controle3 DUnite</em>' containment reference.
	 * @see #setACommeAutoriteControle3DUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeDomaineActiviteCentre_ACommeAutoriteControle3DUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='ACommeAutoriteControle3D_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getACommeAutoriteControle3DUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDomaineActiviteCentre#getACommeAutoriteControle3DUnite <em>AComme Autorite Controle3 DUnite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Autorite Controle3 DUnite</em>' containment reference.
	 * @see #getACommeAutoriteControle3DUnite()
	 * @generated
	 */
	void setACommeAutoriteControle3DUnite(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>AComme Volume Activite Autre Element Controle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Volume Activite Autre Element Controle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Volume Activite Autre Element Controle</em>' containment reference.
	 * @see #setACommeVolumeActiviteAutreElementControle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeDomaineActiviteCentre_ACommeVolumeActiviteAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='ACommeVolumeActivite_AutreElementControle'"
	 * @generated
	 */
	TypeAssociation getACommeVolumeActiviteAutreElementControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDomaineActiviteCentre#getACommeVolumeActiviteAutreElementControle <em>AComme Volume Activite Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Volume Activite Autre Element Controle</em>' containment reference.
	 * @see #getACommeVolumeActiviteAutreElementControle()
	 * @generated
	 */
	void setACommeVolumeActiviteAutreElementControle(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>AComme Type Menace Associee Type Aeronef</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Type Menace Associee Type Aeronef</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Type Menace Associee Type Aeronef</em>' containment reference.
	 * @see #setACommeTypeMenaceAssocieeTypeAeronef(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeDomaineActiviteCentre_ACommeTypeMenaceAssocieeTypeAeronef()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeAeronef'"
	 *        extendedMetaData="kind='element' name='ACommeTypeMenaceAssociee_TypeAeronef'"
	 * @generated
	 */
	TypeAssociationEXT getACommeTypeMenaceAssocieeTypeAeronef();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDomaineActiviteCentre#getACommeTypeMenaceAssocieeTypeAeronef <em>AComme Type Menace Associee Type Aeronef</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Type Menace Associee Type Aeronef</em>' containment reference.
	 * @see #getACommeTypeMenaceAssocieeTypeAeronef()
	 * @generated
	 */
	void setACommeTypeMenaceAssocieeTypeAeronef(TypeAssociationEXT value);

} // TypeDomaineActiviteCentre
