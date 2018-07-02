/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeDuree;
import mpia.meta.TypeDataTypeVitesseLineaire;
import mpia.meta.TypeDataTypeVolume;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Vol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeVol#getDateDebut <em>Date Debut</em>}</li>
 *   <li>{@link mpia.schema.TypeVol#getDureeVol <em>Duree Vol</em>}</li>
 *   <li>{@link mpia.schema.TypeVol#getHauteur <em>Hauteur</em>}</li>
 *   <li>{@link mpia.schema.TypeVol#getVitesse <em>Vitesse</em>}</li>
 *   <li>{@link mpia.schema.TypeVol#getConsommationTotale <em>Consommation Totale</em>}</li>
 *   <li>{@link mpia.schema.TypeVol#getEstVolLeaderModule <em>Est Vol Leader Module</em>}</li>
 *   <li>{@link mpia.schema.TypeVol#getACommePointTrajectoirePointTrajectoire <em>AComme Point Trajectoire Point Trajectoire</em>}</li>
 *   <li>{@link mpia.schema.TypeVol#getACommeBrancheNavigationBrancheNavigation <em>AComme Branche Navigation Branche Navigation</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeVol()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_Vol' kind='elementOnly'"
 * @generated
 */
public interface TypeVol extends TypeRacineOperationnelle {
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
	 * @see mpia.schema.SchemaPackage#getTypeVol_DateDebut()
	 * @model dataType="mpia.meta.TypeDataTypeGDH" required="true"
	 *        extendedMetaData="kind='element' name='DateDebut'"
	 * @generated
	 */
	XMLGregorianCalendar getDateDebut();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeVol#getDateDebut <em>Date Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Debut</em>' attribute.
	 * @see #getDateDebut()
	 * @generated
	 */
	void setDateDebut(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Duree Vol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duree Vol</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duree Vol</em>' containment reference.
	 * @see #setDureeVol(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypeVol_DureeVol()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DureeVol'"
	 * @generated
	 */
	TypeDataTypeDuree getDureeVol();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeVol#getDureeVol <em>Duree Vol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duree Vol</em>' containment reference.
	 * @see #getDureeVol()
	 * @generated
	 */
	void setDureeVol(TypeDataTypeDuree value);

	/**
	 * Returns the value of the '<em><b>Hauteur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hauteur</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hauteur</em>' attribute.
	 * @see #isSetHauteur()
	 * @see #unsetHauteur()
	 * @see #setHauteur(double)
	 * @see mpia.schema.SchemaPackage#getTypeVol_Hauteur()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='Hauteur'"
	 * @generated
	 */
	double getHauteur();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeVol#getHauteur <em>Hauteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hauteur</em>' attribute.
	 * @see #isSetHauteur()
	 * @see #unsetHauteur()
	 * @see #getHauteur()
	 * @generated
	 */
	void setHauteur(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeVol#getHauteur <em>Hauteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHauteur()
	 * @see #getHauteur()
	 * @see #setHauteur(double)
	 * @generated
	 */
	void unsetHauteur();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeVol#getHauteur <em>Hauteur</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hauteur</em>' attribute is set.
	 * @see #unsetHauteur()
	 * @see #getHauteur()
	 * @see #setHauteur(double)
	 * @generated
	 */
	boolean isSetHauteur();

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
	 * @see mpia.schema.SchemaPackage#getTypeVol_Vitesse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Vitesse'"
	 * @generated
	 */
	TypeDataTypeVitesseLineaire getVitesse();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeVol#getVitesse <em>Vitesse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vitesse</em>' containment reference.
	 * @see #getVitesse()
	 * @generated
	 */
	void setVitesse(TypeDataTypeVitesseLineaire value);

	/**
	 * Returns the value of the '<em><b>Consommation Totale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consommation Totale</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consommation Totale</em>' containment reference.
	 * @see #setConsommationTotale(TypeDataTypeVolume)
	 * @see mpia.schema.SchemaPackage#getTypeVol_ConsommationTotale()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ConsommationTotale'"
	 * @generated
	 */
	TypeDataTypeVolume getConsommationTotale();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeVol#getConsommationTotale <em>Consommation Totale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consommation Totale</em>' containment reference.
	 * @see #getConsommationTotale()
	 * @generated
	 */
	void setConsommationTotale(TypeDataTypeVolume value);

	/**
	 * Returns the value of the '<em><b>Est Vol Leader Module</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Vol Leader Module</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Vol Leader Module</em>' containment reference.
	 * @see #setEstVolLeaderModule(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeVol_EstVolLeaderModule()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourVolLeader_Vol' target_entity='type_Module'"
	 *        extendedMetaData="kind='element' name='EstVolLeader_Module'"
	 * @generated
	 */
	TypeAssociation getEstVolLeaderModule();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeVol#getEstVolLeaderModule <em>Est Vol Leader Module</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Vol Leader Module</em>' containment reference.
	 * @see #getEstVolLeaderModule()
	 * @generated
	 */
	void setEstVolLeaderModule(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>AComme Point Trajectoire Point Trajectoire</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Point Trajectoire Point Trajectoire</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Point Trajectoire Point Trajectoire</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeVol_ACommePointTrajectoirePointTrajectoire()
	 * @model containment="true" lower="2" upper="2"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_PointTrajectoire'"
	 *        extendedMetaData="kind='element' name='ACommePointTrajectoire_PointTrajectoire'"
	 * @generated
	 */
	EList<TypeAssociation> getACommePointTrajectoirePointTrajectoire();

	/**
	 * Returns the value of the '<em><b>AComme Branche Navigation Branche Navigation</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Branche Navigation Branche Navigation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Branche Navigation Branche Navigation</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeVol_ACommeBrancheNavigationBrancheNavigation()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_BrancheNavigation'"
	 *        extendedMetaData="kind='element' name='ACommeBrancheNavigation_BrancheNavigation'"
	 * @generated
	 */
	EList<TypeAssociation> getACommeBrancheNavigationBrancheNavigation();

} // TypeVol
