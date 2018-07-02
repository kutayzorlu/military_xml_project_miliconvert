/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Centre ASA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeCentreASA#getTypeCentre <em>Type Centre</em>}</li>
 *   <li>{@link mpia.schema.TypeCentreASA#getAutreTypeCentre <em>Autre Type Centre</em>}</li>
 *   <li>{@link mpia.schema.TypeCentreASA#getTypeI3D <em>Type I3D</em>}</li>
 *   <li>{@link mpia.schema.TypeCentreASA#getAutreTypeI3D <em>Autre Type I3D</em>}</li>
 *   <li>{@link mpia.schema.TypeCentreASA#getElementsADefendre <em>Elements ADefendre</em>}</li>
 *   <li>{@link mpia.schema.TypeCentreASA#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeCentreASA#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeCentreASA#getACommeUniteRattacheeUnite <em>AComme Unite Rattachee Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeCentreASA#getACommeCentreRattachementUnite <em>AComme Centre Rattachement Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeCentreASA#getACommePositionPositionCentreASA <em>AComme Position Position Centre ASA</em>}</li>
 *   <li>{@link mpia.schema.TypeCentreASA#getAPourZoneParticuliereAutreElementControle <em>APour Zone Particuliere Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeCentreASA#getACommeDomaineActiviteDomaineActiviteCentre <em>AComme Domaine Activite Domaine Activite Centre</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeCentreASA()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_CentreASA' kind='elementOnly'"
 * @generated
 */
public interface TypeCentreASA extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Centre</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCentreASATypeCentre}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Centre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Centre</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCentreASATypeCentre
	 * @see #isSetTypeCentre()
	 * @see #unsetTypeCentre()
	 * @see #setTypeCentre(TypeDictionaryDicoCentreASATypeCentre)
	 * @see mpia.schema.SchemaPackage#getTypeCentreASA_TypeCentre()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeCentre'"
	 * @generated
	 */
	TypeDictionaryDicoCentreASATypeCentre getTypeCentre();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCentreASA#getTypeCentre <em>Type Centre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Centre</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCentreASATypeCentre
	 * @see #isSetTypeCentre()
	 * @see #unsetTypeCentre()
	 * @see #getTypeCentre()
	 * @generated
	 */
	void setTypeCentre(TypeDictionaryDicoCentreASATypeCentre value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCentreASA#getTypeCentre <em>Type Centre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeCentre()
	 * @see #getTypeCentre()
	 * @see #setTypeCentre(TypeDictionaryDicoCentreASATypeCentre)
	 * @generated
	 */
	void unsetTypeCentre();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCentreASA#getTypeCentre <em>Type Centre</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Centre</em>' attribute is set.
	 * @see #unsetTypeCentre()
	 * @see #getTypeCentre()
	 * @see #setTypeCentre(TypeDictionaryDicoCentreASATypeCentre)
	 * @generated
	 */
	boolean isSetTypeCentre();

	/**
	 * Returns the value of the '<em><b>Autre Type Centre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autre Type Centre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autre Type Centre</em>' attribute.
	 * @see #setAutreTypeCentre(String)
	 * @see mpia.schema.SchemaPackage#getTypeCentreASA_AutreTypeCentre()
	 * @model dataType="mpia.meta.TypeDataTypeChaine06"
	 *        extendedMetaData="kind='element' name='AutreTypeCentre'"
	 * @generated
	 */
	String getAutreTypeCentre();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCentreASA#getAutreTypeCentre <em>Autre Type Centre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autre Type Centre</em>' attribute.
	 * @see #getAutreTypeCentre()
	 * @generated
	 */
	void setAutreTypeCentre(String value);

	/**
	 * Returns the value of the '<em><b>Type I3D</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeIntervenant3D}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type I3D</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type I3D</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeIntervenant3D
	 * @see #isSetTypeI3D()
	 * @see #unsetTypeI3D()
	 * @see #setTypeI3D(TypeDictionaryDicoTypeIntervenant3D)
	 * @see mpia.schema.SchemaPackage#getTypeCentreASA_TypeI3D()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeI3D'"
	 * @generated
	 */
	TypeDictionaryDicoTypeIntervenant3D getTypeI3D();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCentreASA#getTypeI3D <em>Type I3D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type I3D</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeIntervenant3D
	 * @see #isSetTypeI3D()
	 * @see #unsetTypeI3D()
	 * @see #getTypeI3D()
	 * @generated
	 */
	void setTypeI3D(TypeDictionaryDicoTypeIntervenant3D value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCentreASA#getTypeI3D <em>Type I3D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeI3D()
	 * @see #getTypeI3D()
	 * @see #setTypeI3D(TypeDictionaryDicoTypeIntervenant3D)
	 * @generated
	 */
	void unsetTypeI3D();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCentreASA#getTypeI3D <em>Type I3D</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type I3D</em>' attribute is set.
	 * @see #unsetTypeI3D()
	 * @see #getTypeI3D()
	 * @see #setTypeI3D(TypeDictionaryDicoTypeIntervenant3D)
	 * @generated
	 */
	boolean isSetTypeI3D();

	/**
	 * Returns the value of the '<em><b>Autre Type I3D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autre Type I3D</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autre Type I3D</em>' attribute.
	 * @see #setAutreTypeI3D(String)
	 * @see mpia.schema.SchemaPackage#getTypeCentreASA_AutreTypeI3D()
	 * @model dataType="mpia.meta.TypeDataTypeChaine06"
	 *        extendedMetaData="kind='element' name='AutreTypeI3D'"
	 * @generated
	 */
	String getAutreTypeI3D();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCentreASA#getAutreTypeI3D <em>Autre Type I3D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autre Type I3D</em>' attribute.
	 * @see #getAutreTypeI3D()
	 * @generated
	 */
	void setAutreTypeI3D(String value);

	/**
	 * Returns the value of the '<em><b>Elements ADefendre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements ADefendre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements ADefendre</em>' attribute.
	 * @see #setElementsADefendre(String)
	 * @see mpia.schema.SchemaPackage#getTypeCentreASA_ElementsADefendre()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='ElementsADefendre'"
	 * @generated
	 */
	String getElementsADefendre();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCentreASA#getElementsADefendre <em>Elements ADefendre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elements ADefendre</em>' attribute.
	 * @see #getElementsADefendre()
	 * @generated
	 */
	void setElementsADefendre(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeCentreASA_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCentreASA#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeCentreASA_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCentreASA#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>AComme Unite Rattachee Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Unite Rattachee Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Unite Rattachee Unite</em>' containment reference.
	 * @see #setACommeUniteRattacheeUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeCentreASA_ACommeUniteRattacheeUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='ACommeUniteRattachee_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getACommeUniteRattacheeUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCentreASA#getACommeUniteRattacheeUnite <em>AComme Unite Rattachee Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Unite Rattachee Unite</em>' containment reference.
	 * @see #getACommeUniteRattacheeUnite()
	 * @generated
	 */
	void setACommeUniteRattacheeUnite(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>AComme Centre Rattachement Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Centre Rattachement Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Centre Rattachement Unite</em>' containment reference.
	 * @see #setACommeCentreRattachementUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeCentreASA_ACommeCentreRattachementUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='ACommeCentreRattachement_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getACommeCentreRattachementUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCentreASA#getACommeCentreRattachementUnite <em>AComme Centre Rattachement Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Centre Rattachement Unite</em>' containment reference.
	 * @see #getACommeCentreRattachementUnite()
	 * @generated
	 */
	void setACommeCentreRattachementUnite(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>AComme Position Position Centre ASA</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypePositionCentreASA}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Position Position Centre ASA</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Position Position Centre ASA</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeCentreASA_ACommePositionPositionCentreASA()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_PositionCentreASA'"
	 *        extendedMetaData="kind='element' name='ACommePosition_PositionCentreASA'"
	 * @generated
	 */
	EList<TypePositionCentreASA> getACommePositionPositionCentreASA();

	/**
	 * Returns the value of the '<em><b>APour Zone Particuliere Autre Element Controle</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Zone Particuliere Autre Element Controle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Zone Particuliere Autre Element Controle</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeCentreASA_APourZoneParticuliereAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='APourZoneParticuliere_AutreElementControle'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourZoneParticuliereAutreElementControle();

	/**
	 * Returns the value of the '<em><b>AComme Domaine Activite Domaine Activite Centre</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeDomaineActiviteCentre}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Domaine Activite Domaine Activite Centre</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Domaine Activite Domaine Activite Centre</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeCentreASA_ACommeDomaineActiviteDomaineActiviteCentre()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_DomaineActiviteCentre'"
	 *        extendedMetaData="kind='element' name='ACommeDomaineActivite_DomaineActiviteCentre'"
	 * @generated
	 */
	EList<TypeDomaineActiviteCentre> getACommeDomaineActiviteDomaineActiviteCentre();

} // TypeCentreASA
