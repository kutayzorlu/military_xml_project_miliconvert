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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Phase Trajet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypePhaseTrajet#getDateDebutTrajetCalculee <em>Date Debut Trajet Calculee</em>}</li>
 *   <li>{@link mpia.schema.TypePhaseTrajet#getDateFintTrajetCalculee <em>Date Fint Trajet Calculee</em>}</li>
 *   <li>{@link mpia.schema.TypePhaseTrajet#getEspacementTemporel <em>Espacement Temporel</em>}</li>
 *   <li>{@link mpia.schema.TypePhaseTrajet#getVitesse <em>Vitesse</em>}</li>
 *   <li>{@link mpia.schema.TypePhaseTrajet#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.TypePhaseTrajet#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypePhaseTrajet#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypePhaseTrajet#getEstPourTypeMissionAerienne <em>Est Pour Type Mission Aerienne</em>}</li>
 *   <li>{@link mpia.schema.TypePhaseTrajet#getVautPourHoraireManoeuvre <em>Vaut Pour Horaire Manoeuvre</em>}</li>
 *   <li>{@link mpia.schema.TypePhaseTrajet#getAPourDateDebutPrevisionnelleDatation <em>APour Date Debut Previsionnelle Datation</em>}</li>
 *   <li>{@link mpia.schema.TypePhaseTrajet#getAPourDateFinPrevisionnelleDatation <em>APour Date Fin Previsionnelle Datation</em>}</li>
 *   <li>{@link mpia.schema.TypePhaseTrajet#getACommePointEntreeConsigne <em>AComme Point Entree Consigne</em>}</li>
 *   <li>{@link mpia.schema.TypePhaseTrajet#getACommePointSortieConsigne <em>AComme Point Sortie Consigne</em>}</li>
 *   <li>{@link mpia.schema.TypePhaseTrajet#getACommeConsignesAppliqueesConsigne <em>AComme Consignes Appliquees Consigne</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypePhaseTrajet()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_PhaseTrajet' kind='elementOnly'"
 * @generated
 */
public interface TypePhaseTrajet extends EObject {
	/**
	 * Returns the value of the '<em><b>Date Debut Trajet Calculee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Debut Trajet Calculee</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Debut Trajet Calculee</em>' attribute.
	 * @see #setDateDebutTrajetCalculee(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypePhaseTrajet_DateDebutTrajetCalculee()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateDebutTrajetCalculee'"
	 * @generated
	 */
	XMLGregorianCalendar getDateDebutTrajetCalculee();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePhaseTrajet#getDateDebutTrajetCalculee <em>Date Debut Trajet Calculee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Debut Trajet Calculee</em>' attribute.
	 * @see #getDateDebutTrajetCalculee()
	 * @generated
	 */
	void setDateDebutTrajetCalculee(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Date Fint Trajet Calculee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Fint Trajet Calculee</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Fint Trajet Calculee</em>' attribute.
	 * @see #setDateFintTrajetCalculee(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypePhaseTrajet_DateFintTrajetCalculee()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateFintTrajetCalculee'"
	 * @generated
	 */
	XMLGregorianCalendar getDateFintTrajetCalculee();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePhaseTrajet#getDateFintTrajetCalculee <em>Date Fint Trajet Calculee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Fint Trajet Calculee</em>' attribute.
	 * @see #getDateFintTrajetCalculee()
	 * @generated
	 */
	void setDateFintTrajetCalculee(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Espacement Temporel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Espacement Temporel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Espacement Temporel</em>' containment reference.
	 * @see #setEspacementTemporel(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypePhaseTrajet_EspacementTemporel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EspacementTemporel'"
	 * @generated
	 */
	TypeDataTypeDuree getEspacementTemporel();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePhaseTrajet#getEspacementTemporel <em>Espacement Temporel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Espacement Temporel</em>' containment reference.
	 * @see #getEspacementTemporel()
	 * @generated
	 */
	void setEspacementTemporel(TypeDataTypeDuree value);

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
	 * @see mpia.schema.SchemaPackage#getTypePhaseTrajet_Vitesse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Vitesse'"
	 * @generated
	 */
	TypeDataTypeVitesseLineaire getVitesse();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePhaseTrajet#getVitesse <em>Vitesse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vitesse</em>' containment reference.
	 * @see #getVitesse()
	 * @generated
	 */
	void setVitesse(TypeDataTypeVitesseLineaire value);

	/**
	 * Returns the value of the '<em><b>Commentaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commentaire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commentaire</em>' attribute.
	 * @see #setCommentaire(String)
	 * @see mpia.schema.SchemaPackage#getTypePhaseTrajet_Commentaire()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='Commentaire'"
	 * @generated
	 */
	String getCommentaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePhaseTrajet#getCommentaire <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commentaire</em>' attribute.
	 * @see #getCommentaire()
	 * @generated
	 */
	void setCommentaire(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypePhaseTrajet_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePhaseTrajet#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypePhaseTrajet_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePhaseTrajet#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Est Pour Type Mission Aerienne</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Pour Type Mission Aerienne</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Pour Type Mission Aerienne</em>' containment reference.
	 * @see #setEstPourTypeMissionAerienne(TypeTypeMissionAerienne)
	 * @see mpia.schema.SchemaPackage#getTypePhaseTrajet_EstPourTypeMissionAerienne()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_TypeMissionAerienne'"
	 *        extendedMetaData="kind='element' name='EstPour_TypeMissionAerienne'"
	 * @generated
	 */
	TypeTypeMissionAerienne getEstPourTypeMissionAerienne();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePhaseTrajet#getEstPourTypeMissionAerienne <em>Est Pour Type Mission Aerienne</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Pour Type Mission Aerienne</em>' containment reference.
	 * @see #getEstPourTypeMissionAerienne()
	 * @generated
	 */
	void setEstPourTypeMissionAerienne(TypeTypeMissionAerienne value);

	/**
	 * Returns the value of the '<em><b>Vaut Pour Horaire Manoeuvre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vaut Pour Horaire Manoeuvre</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vaut Pour Horaire Manoeuvre</em>' containment reference.
	 * @see #setVautPourHoraireManoeuvre(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypePhaseTrajet_VautPourHoraireManoeuvre()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_HoraireManoeuvre'"
	 *        extendedMetaData="kind='element' name='VautPour_HoraireManoeuvre'"
	 * @generated
	 */
	TypeAssociation getVautPourHoraireManoeuvre();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePhaseTrajet#getVautPourHoraireManoeuvre <em>Vaut Pour Horaire Manoeuvre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vaut Pour Horaire Manoeuvre</em>' containment reference.
	 * @see #getVautPourHoraireManoeuvre()
	 * @generated
	 */
	void setVautPourHoraireManoeuvre(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Date Debut Previsionnelle Datation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Date Debut Previsionnelle Datation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Date Debut Previsionnelle Datation</em>' containment reference.
	 * @see #setAPourDateDebutPrevisionnelleDatation(TypeDatation)
	 * @see mpia.schema.SchemaPackage#getTypePhaseTrajet_APourDateDebutPrevisionnelleDatation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Datation'"
	 *        extendedMetaData="kind='element' name='APourDateDebutPrevisionnelle_Datation'"
	 * @generated
	 */
	TypeDatation getAPourDateDebutPrevisionnelleDatation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePhaseTrajet#getAPourDateDebutPrevisionnelleDatation <em>APour Date Debut Previsionnelle Datation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Date Debut Previsionnelle Datation</em>' containment reference.
	 * @see #getAPourDateDebutPrevisionnelleDatation()
	 * @generated
	 */
	void setAPourDateDebutPrevisionnelleDatation(TypeDatation value);

	/**
	 * Returns the value of the '<em><b>APour Date Fin Previsionnelle Datation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Date Fin Previsionnelle Datation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Date Fin Previsionnelle Datation</em>' containment reference.
	 * @see #setAPourDateFinPrevisionnelleDatation(TypeDatation)
	 * @see mpia.schema.SchemaPackage#getTypePhaseTrajet_APourDateFinPrevisionnelleDatation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Datation'"
	 *        extendedMetaData="kind='element' name='APourDateFinPrevisionnelle_Datation'"
	 * @generated
	 */
	TypeDatation getAPourDateFinPrevisionnelleDatation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePhaseTrajet#getAPourDateFinPrevisionnelleDatation <em>APour Date Fin Previsionnelle Datation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Date Fin Previsionnelle Datation</em>' containment reference.
	 * @see #getAPourDateFinPrevisionnelleDatation()
	 * @generated
	 */
	void setAPourDateFinPrevisionnelleDatation(TypeDatation value);

	/**
	 * Returns the value of the '<em><b>AComme Point Entree Consigne</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Point Entree Consigne</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Point Entree Consigne</em>' containment reference.
	 * @see #setACommePointEntreeConsigne(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypePhaseTrajet_ACommePointEntreeConsigne()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Consigne'"
	 *        extendedMetaData="kind='element' name='ACommePointEntree_Consigne'"
	 * @generated
	 */
	TypeAssociation getACommePointEntreeConsigne();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePhaseTrajet#getACommePointEntreeConsigne <em>AComme Point Entree Consigne</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Point Entree Consigne</em>' containment reference.
	 * @see #getACommePointEntreeConsigne()
	 * @generated
	 */
	void setACommePointEntreeConsigne(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>AComme Point Sortie Consigne</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Point Sortie Consigne</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Point Sortie Consigne</em>' containment reference.
	 * @see #setACommePointSortieConsigne(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypePhaseTrajet_ACommePointSortieConsigne()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Consigne'"
	 *        extendedMetaData="kind='element' name='ACommePointSortie_Consigne'"
	 * @generated
	 */
	TypeAssociation getACommePointSortieConsigne();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePhaseTrajet#getACommePointSortieConsigne <em>AComme Point Sortie Consigne</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Point Sortie Consigne</em>' containment reference.
	 * @see #getACommePointSortieConsigne()
	 * @generated
	 */
	void setACommePointSortieConsigne(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>AComme Consignes Appliquees Consigne</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Consignes Appliquees Consigne</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Consignes Appliquees Consigne</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePhaseTrajet_ACommeConsignesAppliqueesConsigne()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Consigne'"
	 *        extendedMetaData="kind='element' name='ACommeConsignesAppliquees_Consigne'"
	 * @generated
	 */
	EList<TypeAssociation> getACommeConsignesAppliqueesConsigne();

} // TypePhaseTrajet
