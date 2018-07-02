/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Point Controle3 D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypePointControle3D#getNumeroPoint <em>Numero Point</em>}</li>
 *   <li>{@link mpia.schema.TypePointControle3D#getCategoriePointAlat <em>Categorie Point Alat</em>}</li>
 *   <li>{@link mpia.schema.TypePointControle3D#getDatePassageCalculee <em>Date Passage Calculee</em>}</li>
 *   <li>{@link mpia.schema.TypePointControle3D#getGDHpassageAuPlusTard <em>GD Hpassage Au Plus Tard</em>}</li>
 *   <li>{@link mpia.schema.TypePointControle3D#getGDHpassageAuPlusTot <em>GD Hpassage Au Plus Tot</em>}</li>
 *   <li>{@link mpia.schema.TypePointControle3D#getPointRepertorie <em>Point Repertorie</em>}</li>
 *   <li>{@link mpia.schema.TypePointControle3D#isPointReference <em>Point Reference</em>}</li>
 *   <li>{@link mpia.schema.TypePointControle3D#getAPourDatePrevisionnelleDatation <em>APour Date Previsionnelle Datation</em>}</li>
 *   <li>{@link mpia.schema.TypePointControle3D#getEstPointMobilePointMobile <em>Est Point Mobile Point Mobile</em>}</li>
 *   <li>{@link mpia.schema.TypePointControle3D#getAPourActiviteActiviteSurPointControle3D <em>APour Activite Activite Sur Point Controle3 D</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypePointControle3D()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_PointControle3D' kind='elementOnly'"
 * @generated
 */
public interface TypePointControle3D extends TypeElementControle {
	/**
	 * Returns the value of the '<em><b>Numero Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Point</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Point</em>' attribute.
	 * @see #isSetNumeroPoint()
	 * @see #unsetNumeroPoint()
	 * @see #setNumeroPoint(long)
	 * @see mpia.schema.SchemaPackage#getTypePointControle3D_NumeroPoint()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='NumeroPoint'"
	 * @generated
	 */
	long getNumeroPoint();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePointControle3D#getNumeroPoint <em>Numero Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Point</em>' attribute.
	 * @see #isSetNumeroPoint()
	 * @see #unsetNumeroPoint()
	 * @see #getNumeroPoint()
	 * @generated
	 */
	void setNumeroPoint(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePointControle3D#getNumeroPoint <em>Numero Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumeroPoint()
	 * @see #getNumeroPoint()
	 * @see #setNumeroPoint(long)
	 * @generated
	 */
	void unsetNumeroPoint();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePointControle3D#getNumeroPoint <em>Numero Point</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Numero Point</em>' attribute is set.
	 * @see #unsetNumeroPoint()
	 * @see #getNumeroPoint()
	 * @see #setNumeroPoint(long)
	 * @generated
	 */
	boolean isSetNumeroPoint();

	/**
	 * Returns the value of the '<em><b>Categorie Point Alat</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPointControle3DCategoriePointAlat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie Point Alat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie Point Alat</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPointControle3DCategoriePointAlat
	 * @see #isSetCategoriePointAlat()
	 * @see #unsetCategoriePointAlat()
	 * @see #setCategoriePointAlat(TypeDictionaryDicoPointControle3DCategoriePointAlat)
	 * @see mpia.schema.SchemaPackage#getTypePointControle3D_CategoriePointAlat()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='CategoriePointAlat'"
	 * @generated
	 */
	TypeDictionaryDicoPointControle3DCategoriePointAlat getCategoriePointAlat();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePointControle3D#getCategoriePointAlat <em>Categorie Point Alat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie Point Alat</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPointControle3DCategoriePointAlat
	 * @see #isSetCategoriePointAlat()
	 * @see #unsetCategoriePointAlat()
	 * @see #getCategoriePointAlat()
	 * @generated
	 */
	void setCategoriePointAlat(TypeDictionaryDicoPointControle3DCategoriePointAlat value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePointControle3D#getCategoriePointAlat <em>Categorie Point Alat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategoriePointAlat()
	 * @see #getCategoriePointAlat()
	 * @see #setCategoriePointAlat(TypeDictionaryDicoPointControle3DCategoriePointAlat)
	 * @generated
	 */
	void unsetCategoriePointAlat();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePointControle3D#getCategoriePointAlat <em>Categorie Point Alat</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie Point Alat</em>' attribute is set.
	 * @see #unsetCategoriePointAlat()
	 * @see #getCategoriePointAlat()
	 * @see #setCategoriePointAlat(TypeDictionaryDicoPointControle3DCategoriePointAlat)
	 * @generated
	 */
	boolean isSetCategoriePointAlat();

	/**
	 * Returns the value of the '<em><b>Date Passage Calculee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Passage Calculee</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Passage Calculee</em>' attribute.
	 * @see #setDatePassageCalculee(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypePointControle3D_DatePassageCalculee()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DatePassageCalculee'"
	 * @generated
	 */
	XMLGregorianCalendar getDatePassageCalculee();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePointControle3D#getDatePassageCalculee <em>Date Passage Calculee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Passage Calculee</em>' attribute.
	 * @see #getDatePassageCalculee()
	 * @generated
	 */
	void setDatePassageCalculee(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>GD Hpassage Au Plus Tard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GD Hpassage Au Plus Tard</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GD Hpassage Au Plus Tard</em>' attribute.
	 * @see #setGDHpassageAuPlusTard(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypePointControle3D_GDHpassageAuPlusTard()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='GDHpassageAuPlusTard'"
	 * @generated
	 */
	XMLGregorianCalendar getGDHpassageAuPlusTard();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePointControle3D#getGDHpassageAuPlusTard <em>GD Hpassage Au Plus Tard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GD Hpassage Au Plus Tard</em>' attribute.
	 * @see #getGDHpassageAuPlusTard()
	 * @generated
	 */
	void setGDHpassageAuPlusTard(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>GD Hpassage Au Plus Tot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GD Hpassage Au Plus Tot</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GD Hpassage Au Plus Tot</em>' attribute.
	 * @see #setGDHpassageAuPlusTot(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypePointControle3D_GDHpassageAuPlusTot()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='GDHpassageAuPlusTot'"
	 * @generated
	 */
	XMLGregorianCalendar getGDHpassageAuPlusTot();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePointControle3D#getGDHpassageAuPlusTot <em>GD Hpassage Au Plus Tot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GD Hpassage Au Plus Tot</em>' attribute.
	 * @see #getGDHpassageAuPlusTot()
	 * @generated
	 */
	void setGDHpassageAuPlusTot(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Point Repertorie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point Repertorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Repertorie</em>' attribute.
	 * @see #setPointRepertorie(String)
	 * @see mpia.schema.SchemaPackage#getTypePointControle3D_PointRepertorie()
	 * @model dataType="mpia.meta.TypeDataTypeChaine06"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='PointRepertorie'"
	 * @generated
	 */
	String getPointRepertorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePointControle3D#getPointRepertorie <em>Point Repertorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Repertorie</em>' attribute.
	 * @see #getPointRepertorie()
	 * @generated
	 */
	void setPointRepertorie(String value);

	/**
	 * Returns the value of the '<em><b>Point Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Reference</em>' attribute.
	 * @see #isSetPointReference()
	 * @see #unsetPointReference()
	 * @see #setPointReference(boolean)
	 * @see mpia.schema.SchemaPackage#getTypePointControle3D_PointReference()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='PointReference'"
	 * @generated
	 */
	boolean isPointReference();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePointControle3D#isPointReference <em>Point Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Reference</em>' attribute.
	 * @see #isSetPointReference()
	 * @see #unsetPointReference()
	 * @see #isPointReference()
	 * @generated
	 */
	void setPointReference(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePointControle3D#isPointReference <em>Point Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPointReference()
	 * @see #isPointReference()
	 * @see #setPointReference(boolean)
	 * @generated
	 */
	void unsetPointReference();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePointControle3D#isPointReference <em>Point Reference</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Point Reference</em>' attribute is set.
	 * @see #unsetPointReference()
	 * @see #isPointReference()
	 * @see #setPointReference(boolean)
	 * @generated
	 */
	boolean isSetPointReference();

	/**
	 * Returns the value of the '<em><b>APour Date Previsionnelle Datation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Date Previsionnelle Datation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Date Previsionnelle Datation</em>' containment reference.
	 * @see #setAPourDatePrevisionnelleDatation(TypeDatation)
	 * @see mpia.schema.SchemaPackage#getTypePointControle3D_APourDatePrevisionnelleDatation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Datation'"
	 *        extendedMetaData="kind='element' name='APourDatePrevisionnelle_Datation'"
	 * @generated
	 */
	TypeDatation getAPourDatePrevisionnelleDatation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePointControle3D#getAPourDatePrevisionnelleDatation <em>APour Date Previsionnelle Datation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Date Previsionnelle Datation</em>' containment reference.
	 * @see #getAPourDatePrevisionnelleDatation()
	 * @generated
	 */
	void setAPourDatePrevisionnelleDatation(TypeDatation value);

	/**
	 * Returns the value of the '<em><b>Est Point Mobile Point Mobile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Point Mobile Point Mobile</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Point Mobile Point Mobile</em>' containment reference.
	 * @see #setEstPointMobilePointMobile(TypePointMobile)
	 * @see mpia.schema.SchemaPackage#getTypePointControle3D_EstPointMobilePointMobile()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_PointMobile'"
	 *        extendedMetaData="kind='element' name='EstPointMobile_PointMobile'"
	 * @generated
	 */
	TypePointMobile getEstPointMobilePointMobile();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePointControle3D#getEstPointMobilePointMobile <em>Est Point Mobile Point Mobile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Point Mobile Point Mobile</em>' containment reference.
	 * @see #getEstPointMobilePointMobile()
	 * @generated
	 */
	void setEstPointMobilePointMobile(TypePointMobile value);

	/**
	 * Returns the value of the '<em><b>APour Activite Activite Sur Point Controle3 D</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeActiviteSurPointControle3D}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Activite Activite Sur Point Controle3 D</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Activite Activite Sur Point Controle3 D</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePointControle3D_APourActiviteActiviteSurPointControle3D()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ActiviteSurPointControle3D'"
	 *        extendedMetaData="kind='element' name='APourActivite_ActiviteSurPointControle3D'"
	 * @generated
	 */
	EList<TypeActiviteSurPointControle3D> getAPourActiviteActiviteSurPointControle3D();

} // TypePointControle3D
