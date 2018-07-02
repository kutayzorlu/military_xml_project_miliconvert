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
import mpia.meta.TypeDataTypeDuree;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Phase Vol Drone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypePhaseVolDrone#getNumero <em>Numero</em>}</li>
 *   <li>{@link mpia.schema.TypePhaseVolDrone#getNbrPoints <em>Nbr Points</em>}</li>
 *   <li>{@link mpia.schema.TypePhaseVolDrone#getTypePhase <em>Type Phase</em>}</li>
 *   <li>{@link mpia.schema.TypePhaseVolDrone#getDateDebut <em>Date Debut</em>}</li>
 *   <li>{@link mpia.schema.TypePhaseVolDrone#getDuree <em>Duree</em>}</li>
 *   <li>{@link mpia.schema.TypePhaseVolDrone#getEcartDuree <em>Ecart Duree</em>}</li>
 *   <li>{@link mpia.schema.TypePhaseVolDrone#isEcartEnSus <em>Ecart En Sus</em>}</li>
 *   <li>{@link mpia.schema.TypePhaseVolDrone#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypePhaseVolDrone#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypePhaseVolDrone#getAPourAutoriteControleUnite <em>APour Autorite Controle Unite</em>}</li>
 *   <li>{@link mpia.schema.TypePhaseVolDrone#getAPourFinDatation <em>APour Fin Datation</em>}</li>
 *   <li>{@link mpia.schema.TypePhaseVolDrone#getAPourDebutDatation <em>APour Debut Datation</em>}</li>
 *   <li>{@link mpia.schema.TypePhaseVolDrone#getACommeEnveloppeConsigne <em>AComme Enveloppe Consigne</em>}</li>
 *   <li>{@link mpia.schema.TypePhaseVolDrone#getACommeTrajectoireSecoursComportementSecours <em>AComme Trajectoire Secours Comportement Secours</em>}</li>
 *   <li>{@link mpia.schema.TypePhaseVolDrone#getACommeAdresseRadioAdresseRadio <em>AComme Adresse Radio Adresse Radio</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypePhaseVolDrone()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_PhaseVolDrone' kind='elementOnly'"
 * @generated
 */
public interface TypePhaseVolDrone extends EObject {
	/**
	 * Returns the value of the '<em><b>Numero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero</em>' attribute.
	 * @see #isSetNumero()
	 * @see #unsetNumero()
	 * @see #setNumero(long)
	 * @see mpia.schema.SchemaPackage#getTypePhaseVolDrone_Numero()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3" required="true"
	 *        extendedMetaData="kind='element' name='Numero'"
	 * @generated
	 */
	long getNumero();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePhaseVolDrone#getNumero <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero</em>' attribute.
	 * @see #isSetNumero()
	 * @see #unsetNumero()
	 * @see #getNumero()
	 * @generated
	 */
	void setNumero(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePhaseVolDrone#getNumero <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumero()
	 * @see #getNumero()
	 * @see #setNumero(long)
	 * @generated
	 */
	void unsetNumero();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePhaseVolDrone#getNumero <em>Numero</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Numero</em>' attribute is set.
	 * @see #unsetNumero()
	 * @see #getNumero()
	 * @see #setNumero(long)
	 * @generated
	 */
	boolean isSetNumero();

	/**
	 * Returns the value of the '<em><b>Nbr Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nbr Points</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nbr Points</em>' attribute.
	 * @see #isSetNbrPoints()
	 * @see #unsetNbrPoints()
	 * @see #setNbrPoints(long)
	 * @see mpia.schema.SchemaPackage#getTypePhaseVolDrone_NbrPoints()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3" required="true"
	 *        extendedMetaData="kind='element' name='NbrPoints'"
	 * @generated
	 */
	long getNbrPoints();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePhaseVolDrone#getNbrPoints <em>Nbr Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nbr Points</em>' attribute.
	 * @see #isSetNbrPoints()
	 * @see #unsetNbrPoints()
	 * @see #getNbrPoints()
	 * @generated
	 */
	void setNbrPoints(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePhaseVolDrone#getNbrPoints <em>Nbr Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNbrPoints()
	 * @see #getNbrPoints()
	 * @see #setNbrPoints(long)
	 * @generated
	 */
	void unsetNbrPoints();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePhaseVolDrone#getNbrPoints <em>Nbr Points</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nbr Points</em>' attribute is set.
	 * @see #unsetNbrPoints()
	 * @see #getNbrPoints()
	 * @see #setNbrPoints(long)
	 * @generated
	 */
	boolean isSetNbrPoints();

	/**
	 * Returns the value of the '<em><b>Type Phase</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPhaseVolDroneTypePhase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Phase</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Phase</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPhaseVolDroneTypePhase
	 * @see #isSetTypePhase()
	 * @see #unsetTypePhase()
	 * @see #setTypePhase(TypeDictionaryDicoPhaseVolDroneTypePhase)
	 * @see mpia.schema.SchemaPackage#getTypePhaseVolDrone_TypePhase()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='TypePhase'"
	 * @generated
	 */
	TypeDictionaryDicoPhaseVolDroneTypePhase getTypePhase();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePhaseVolDrone#getTypePhase <em>Type Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Phase</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPhaseVolDroneTypePhase
	 * @see #isSetTypePhase()
	 * @see #unsetTypePhase()
	 * @see #getTypePhase()
	 * @generated
	 */
	void setTypePhase(TypeDictionaryDicoPhaseVolDroneTypePhase value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePhaseVolDrone#getTypePhase <em>Type Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypePhase()
	 * @see #getTypePhase()
	 * @see #setTypePhase(TypeDictionaryDicoPhaseVolDroneTypePhase)
	 * @generated
	 */
	void unsetTypePhase();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePhaseVolDrone#getTypePhase <em>Type Phase</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Phase</em>' attribute is set.
	 * @see #unsetTypePhase()
	 * @see #getTypePhase()
	 * @see #setTypePhase(TypeDictionaryDicoPhaseVolDroneTypePhase)
	 * @generated
	 */
	boolean isSetTypePhase();

	/**
	 * Returns the value of the '<em><b>Date Debut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Debut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Debut</em>' attribute.
	 * @see #setDateDebut(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypePhaseVolDrone_DateDebut()
	 * @model dataType="mpia.meta.TypeDataTypeGDH" required="true"
	 *        extendedMetaData="kind='element' name='DateDebut'"
	 * @generated
	 */
	XMLGregorianCalendar getDateDebut();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePhaseVolDrone#getDateDebut <em>Date Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Debut</em>' attribute.
	 * @see #getDateDebut()
	 * @generated
	 */
	void setDateDebut(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Duree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duree</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duree</em>' containment reference.
	 * @see #setDuree(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypePhaseVolDrone_Duree()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Duree'"
	 * @generated
	 */
	TypeDataTypeDuree getDuree();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePhaseVolDrone#getDuree <em>Duree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duree</em>' containment reference.
	 * @see #getDuree()
	 * @generated
	 */
	void setDuree(TypeDataTypeDuree value);

	/**
	 * Returns the value of the '<em><b>Ecart Duree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ecart Duree</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecart Duree</em>' containment reference.
	 * @see #setEcartDuree(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypePhaseVolDrone_EcartDuree()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EcartDuree'"
	 * @generated
	 */
	TypeDataTypeDuree getEcartDuree();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePhaseVolDrone#getEcartDuree <em>Ecart Duree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ecart Duree</em>' containment reference.
	 * @see #getEcartDuree()
	 * @generated
	 */
	void setEcartDuree(TypeDataTypeDuree value);

	/**
	 * Returns the value of the '<em><b>Ecart En Sus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ecart En Sus</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecart En Sus</em>' attribute.
	 * @see #isSetEcartEnSus()
	 * @see #unsetEcartEnSus()
	 * @see #setEcartEnSus(boolean)
	 * @see mpia.schema.SchemaPackage#getTypePhaseVolDrone_EcartEnSus()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='EcartEnSus'"
	 * @generated
	 */
	boolean isEcartEnSus();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePhaseVolDrone#isEcartEnSus <em>Ecart En Sus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ecart En Sus</em>' attribute.
	 * @see #isSetEcartEnSus()
	 * @see #unsetEcartEnSus()
	 * @see #isEcartEnSus()
	 * @generated
	 */
	void setEcartEnSus(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePhaseVolDrone#isEcartEnSus <em>Ecart En Sus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEcartEnSus()
	 * @see #isEcartEnSus()
	 * @see #setEcartEnSus(boolean)
	 * @generated
	 */
	void unsetEcartEnSus();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePhaseVolDrone#isEcartEnSus <em>Ecart En Sus</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ecart En Sus</em>' attribute is set.
	 * @see #unsetEcartEnSus()
	 * @see #isEcartEnSus()
	 * @see #setEcartEnSus(boolean)
	 * @generated
	 */
	boolean isSetEcartEnSus();

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
	 * @see mpia.schema.SchemaPackage#getTypePhaseVolDrone_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePhaseVolDrone#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypePhaseVolDrone_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePhaseVolDrone#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>APour Autorite Controle Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Autorite Controle Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Autorite Controle Unite</em>' containment reference.
	 * @see #setAPourAutoriteControleUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypePhaseVolDrone_APourAutoriteControleUnite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourAutoriteControle_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getAPourAutoriteControleUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePhaseVolDrone#getAPourAutoriteControleUnite <em>APour Autorite Controle Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Autorite Controle Unite</em>' containment reference.
	 * @see #getAPourAutoriteControleUnite()
	 * @generated
	 */
	void setAPourAutoriteControleUnite(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>APour Fin Datation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Fin Datation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Fin Datation</em>' containment reference.
	 * @see #setAPourFinDatation(TypeDatation)
	 * @see mpia.schema.SchemaPackage#getTypePhaseVolDrone_APourFinDatation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Datation'"
	 *        extendedMetaData="kind='element' name='APourFin_Datation'"
	 * @generated
	 */
	TypeDatation getAPourFinDatation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePhaseVolDrone#getAPourFinDatation <em>APour Fin Datation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Fin Datation</em>' containment reference.
	 * @see #getAPourFinDatation()
	 * @generated
	 */
	void setAPourFinDatation(TypeDatation value);

	/**
	 * Returns the value of the '<em><b>APour Debut Datation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Debut Datation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Debut Datation</em>' containment reference.
	 * @see #setAPourDebutDatation(TypeDatation)
	 * @see mpia.schema.SchemaPackage#getTypePhaseVolDrone_APourDebutDatation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Datation'"
	 *        extendedMetaData="kind='element' name='APourDebut_Datation'"
	 * @generated
	 */
	TypeDatation getAPourDebutDatation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePhaseVolDrone#getAPourDebutDatation <em>APour Debut Datation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Debut Datation</em>' containment reference.
	 * @see #getAPourDebutDatation()
	 * @generated
	 */
	void setAPourDebutDatation(TypeDatation value);

	/**
	 * Returns the value of the '<em><b>AComme Enveloppe Consigne</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Enveloppe Consigne</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Enveloppe Consigne</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePhaseVolDrone_ACommeEnveloppeConsigne()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Consigne'"
	 *        extendedMetaData="kind='element' name='ACommeEnveloppe_Consigne'"
	 * @generated
	 */
	EList<TypeAssociation> getACommeEnveloppeConsigne();

	/**
	 * Returns the value of the '<em><b>AComme Trajectoire Secours Comportement Secours</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeComportementSecours}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Trajectoire Secours Comportement Secours</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Trajectoire Secours Comportement Secours</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePhaseVolDrone_ACommeTrajectoireSecoursComportementSecours()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ComportementSecours'"
	 *        extendedMetaData="kind='element' name='ACommeTrajectoireSecours_ComportementSecours'"
	 * @generated
	 */
	EList<TypeComportementSecours> getACommeTrajectoireSecoursComportementSecours();

	/**
	 * Returns the value of the '<em><b>AComme Adresse Radio Adresse Radio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Adresse Radio Adresse Radio</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Adresse Radio Adresse Radio</em>' containment reference.
	 * @see #setACommeAdresseRadioAdresseRadio(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypePhaseVolDrone_ACommeAdresseRadioAdresseRadio()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AdresseRadio'"
	 *        extendedMetaData="kind='element' name='ACommeAdresseRadio_AdresseRadio'"
	 * @generated
	 */
	TypeAssociation getACommeAdresseRadioAdresseRadio();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePhaseVolDrone#getACommeAdresseRadioAdresseRadio <em>AComme Adresse Radio Adresse Radio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Adresse Radio Adresse Radio</em>' containment reference.
	 * @see #getACommeAdresseRadioAdresseRadio()
	 * @generated
	 */
	void setACommeAdresseRadioAdresseRadio(TypeAssociation value);

} // TypePhaseVolDrone
