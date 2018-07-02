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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Bilan Tirs ASS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeBilanTirsASS#getEtat <em>Etat</em>}</li>
 *   <li>{@link mpia.schema.TypeBilanTirsASS#getGDHdebut <em>GD Hdebut</em>}</li>
 *   <li>{@link mpia.schema.TypeBilanTirsASS#getGDHfin <em>GD Hfin</em>}</li>
 *   <li>{@link mpia.schema.TypeBilanTirsASS#getNombreTirsGlobal <em>Nombre Tirs Global</em>}</li>
 *   <li>{@link mpia.schema.TypeBilanTirsASS#getNombreCoupsGlobal <em>Nombre Coups Global</em>}</li>
 *   <li>{@link mpia.schema.TypeBilanTirsASS#getNombreTirsOpportunite <em>Nombre Tirs Opportunite</em>}</li>
 *   <li>{@link mpia.schema.TypeBilanTirsASS#getNombreTirsDemandePlanFeux <em>Nombre Tirs Demande Plan Feux</em>}</li>
 *   <li>{@link mpia.schema.TypeBilanTirsASS#getNombreTirsHorairePlanFeux <em>Nombre Tirs Horaire Plan Feux</em>}</li>
 *   <li>{@link mpia.schema.TypeBilanTirsASS#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.TypeBilanTirsASS#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeBilanTirsASS#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeBilanTirsASS#getAPourUniteOrigineDemandeUnite <em>APour Unite Origine Demande Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeBilanTirsASS#getAPourUniteRendantCompteUnite <em>APour Unite Rendant Compte Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeBilanTirsASS#getConcernePlanFeux <em>Concerne Plan Feux</em>}</li>
 *   <li>{@link mpia.schema.TypeBilanTirsASS#getDemandeBilanPourTypeObjectifASS <em>Demande Bilan Pour Type Objectif ASS</em>}</li>
 *   <li>{@link mpia.schema.TypeBilanTirsASS#getDemandeBilanSurAutreElementControle <em>Demande Bilan Sur Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeBilanTirsASS#getAPourConsommationGlobaleVolumeMunitionsASS <em>APour Consommation Globale Volume Munitions ASS</em>}</li>
 *   <li>{@link mpia.schema.TypeBilanTirsASS#getAPourBilanSurZoneBilanTirsASSsurZone <em>APour Bilan Sur Zone Bilan Tirs AS Ssur Zone</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeBilanTirsASS()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_BilanTirsASS' kind='elementOnly'"
 * @generated
 */
public interface TypeBilanTirsASS extends EObject {
	/**
	 * Returns the value of the '<em><b>Etat</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoBilanTirsASSEtat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoBilanTirsASSEtat
	 * @see #isSetEtat()
	 * @see #unsetEtat()
	 * @see #setEtat(TypeDictionaryDicoBilanTirsASSEtat)
	 * @see mpia.schema.SchemaPackage#getTypeBilanTirsASS_Etat()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Etat'"
	 * @generated
	 */
	TypeDictionaryDicoBilanTirsASSEtat getEtat();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBilanTirsASS#getEtat <em>Etat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoBilanTirsASSEtat
	 * @see #isSetEtat()
	 * @see #unsetEtat()
	 * @see #getEtat()
	 * @generated
	 */
	void setEtat(TypeDictionaryDicoBilanTirsASSEtat value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeBilanTirsASS#getEtat <em>Etat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEtat()
	 * @see #getEtat()
	 * @see #setEtat(TypeDictionaryDicoBilanTirsASSEtat)
	 * @generated
	 */
	void unsetEtat();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeBilanTirsASS#getEtat <em>Etat</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Etat</em>' attribute is set.
	 * @see #unsetEtat()
	 * @see #getEtat()
	 * @see #setEtat(TypeDictionaryDicoBilanTirsASSEtat)
	 * @generated
	 */
	boolean isSetEtat();

	/**
	 * Returns the value of the '<em><b>GD Hdebut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GD Hdebut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GD Hdebut</em>' attribute.
	 * @see #setGDHdebut(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeBilanTirsASS_GDHdebut()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='GDHdebut'"
	 * @generated
	 */
	XMLGregorianCalendar getGDHdebut();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBilanTirsASS#getGDHdebut <em>GD Hdebut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GD Hdebut</em>' attribute.
	 * @see #getGDHdebut()
	 * @generated
	 */
	void setGDHdebut(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>GD Hfin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GD Hfin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GD Hfin</em>' attribute.
	 * @see #setGDHfin(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeBilanTirsASS_GDHfin()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='GDHfin'"
	 * @generated
	 */
	XMLGregorianCalendar getGDHfin();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBilanTirsASS#getGDHfin <em>GD Hfin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GD Hfin</em>' attribute.
	 * @see #getGDHfin()
	 * @generated
	 */
	void setGDHfin(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Nombre Tirs Global</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Tirs Global</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Tirs Global</em>' attribute.
	 * @see #isSetNombreTirsGlobal()
	 * @see #unsetNombreTirsGlobal()
	 * @see #setNombreTirsGlobal(long)
	 * @see mpia.schema.SchemaPackage#getTypeBilanTirsASS_NombreTirsGlobal()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='NombreTirsGlobal'"
	 * @generated
	 */
	long getNombreTirsGlobal();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBilanTirsASS#getNombreTirsGlobal <em>Nombre Tirs Global</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Tirs Global</em>' attribute.
	 * @see #isSetNombreTirsGlobal()
	 * @see #unsetNombreTirsGlobal()
	 * @see #getNombreTirsGlobal()
	 * @generated
	 */
	void setNombreTirsGlobal(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeBilanTirsASS#getNombreTirsGlobal <em>Nombre Tirs Global</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreTirsGlobal()
	 * @see #getNombreTirsGlobal()
	 * @see #setNombreTirsGlobal(long)
	 * @generated
	 */
	void unsetNombreTirsGlobal();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeBilanTirsASS#getNombreTirsGlobal <em>Nombre Tirs Global</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Tirs Global</em>' attribute is set.
	 * @see #unsetNombreTirsGlobal()
	 * @see #getNombreTirsGlobal()
	 * @see #setNombreTirsGlobal(long)
	 * @generated
	 */
	boolean isSetNombreTirsGlobal();

	/**
	 * Returns the value of the '<em><b>Nombre Coups Global</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Coups Global</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Coups Global</em>' attribute.
	 * @see #isSetNombreCoupsGlobal()
	 * @see #unsetNombreCoupsGlobal()
	 * @see #setNombreCoupsGlobal(long)
	 * @see mpia.schema.SchemaPackage#getTypeBilanTirsASS_NombreCoupsGlobal()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='NombreCoupsGlobal'"
	 * @generated
	 */
	long getNombreCoupsGlobal();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBilanTirsASS#getNombreCoupsGlobal <em>Nombre Coups Global</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Coups Global</em>' attribute.
	 * @see #isSetNombreCoupsGlobal()
	 * @see #unsetNombreCoupsGlobal()
	 * @see #getNombreCoupsGlobal()
	 * @generated
	 */
	void setNombreCoupsGlobal(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeBilanTirsASS#getNombreCoupsGlobal <em>Nombre Coups Global</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreCoupsGlobal()
	 * @see #getNombreCoupsGlobal()
	 * @see #setNombreCoupsGlobal(long)
	 * @generated
	 */
	void unsetNombreCoupsGlobal();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeBilanTirsASS#getNombreCoupsGlobal <em>Nombre Coups Global</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Coups Global</em>' attribute is set.
	 * @see #unsetNombreCoupsGlobal()
	 * @see #getNombreCoupsGlobal()
	 * @see #setNombreCoupsGlobal(long)
	 * @generated
	 */
	boolean isSetNombreCoupsGlobal();

	/**
	 * Returns the value of the '<em><b>Nombre Tirs Opportunite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Tirs Opportunite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Tirs Opportunite</em>' attribute.
	 * @see #isSetNombreTirsOpportunite()
	 * @see #unsetNombreTirsOpportunite()
	 * @see #setNombreTirsOpportunite(long)
	 * @see mpia.schema.SchemaPackage#getTypeBilanTirsASS_NombreTirsOpportunite()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='NombreTirsOpportunite'"
	 * @generated
	 */
	long getNombreTirsOpportunite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBilanTirsASS#getNombreTirsOpportunite <em>Nombre Tirs Opportunite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Tirs Opportunite</em>' attribute.
	 * @see #isSetNombreTirsOpportunite()
	 * @see #unsetNombreTirsOpportunite()
	 * @see #getNombreTirsOpportunite()
	 * @generated
	 */
	void setNombreTirsOpportunite(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeBilanTirsASS#getNombreTirsOpportunite <em>Nombre Tirs Opportunite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreTirsOpportunite()
	 * @see #getNombreTirsOpportunite()
	 * @see #setNombreTirsOpportunite(long)
	 * @generated
	 */
	void unsetNombreTirsOpportunite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeBilanTirsASS#getNombreTirsOpportunite <em>Nombre Tirs Opportunite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Tirs Opportunite</em>' attribute is set.
	 * @see #unsetNombreTirsOpportunite()
	 * @see #getNombreTirsOpportunite()
	 * @see #setNombreTirsOpportunite(long)
	 * @generated
	 */
	boolean isSetNombreTirsOpportunite();

	/**
	 * Returns the value of the '<em><b>Nombre Tirs Demande Plan Feux</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Tirs Demande Plan Feux</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Tirs Demande Plan Feux</em>' attribute.
	 * @see #isSetNombreTirsDemandePlanFeux()
	 * @see #unsetNombreTirsDemandePlanFeux()
	 * @see #setNombreTirsDemandePlanFeux(long)
	 * @see mpia.schema.SchemaPackage#getTypeBilanTirsASS_NombreTirsDemandePlanFeux()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='NombreTirsDemandePlanFeux'"
	 * @generated
	 */
	long getNombreTirsDemandePlanFeux();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBilanTirsASS#getNombreTirsDemandePlanFeux <em>Nombre Tirs Demande Plan Feux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Tirs Demande Plan Feux</em>' attribute.
	 * @see #isSetNombreTirsDemandePlanFeux()
	 * @see #unsetNombreTirsDemandePlanFeux()
	 * @see #getNombreTirsDemandePlanFeux()
	 * @generated
	 */
	void setNombreTirsDemandePlanFeux(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeBilanTirsASS#getNombreTirsDemandePlanFeux <em>Nombre Tirs Demande Plan Feux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreTirsDemandePlanFeux()
	 * @see #getNombreTirsDemandePlanFeux()
	 * @see #setNombreTirsDemandePlanFeux(long)
	 * @generated
	 */
	void unsetNombreTirsDemandePlanFeux();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeBilanTirsASS#getNombreTirsDemandePlanFeux <em>Nombre Tirs Demande Plan Feux</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Tirs Demande Plan Feux</em>' attribute is set.
	 * @see #unsetNombreTirsDemandePlanFeux()
	 * @see #getNombreTirsDemandePlanFeux()
	 * @see #setNombreTirsDemandePlanFeux(long)
	 * @generated
	 */
	boolean isSetNombreTirsDemandePlanFeux();

	/**
	 * Returns the value of the '<em><b>Nombre Tirs Horaire Plan Feux</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Tirs Horaire Plan Feux</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Tirs Horaire Plan Feux</em>' attribute.
	 * @see #isSetNombreTirsHorairePlanFeux()
	 * @see #unsetNombreTirsHorairePlanFeux()
	 * @see #setNombreTirsHorairePlanFeux(long)
	 * @see mpia.schema.SchemaPackage#getTypeBilanTirsASS_NombreTirsHorairePlanFeux()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='NombreTirsHorairePlanFeux'"
	 * @generated
	 */
	long getNombreTirsHorairePlanFeux();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBilanTirsASS#getNombreTirsHorairePlanFeux <em>Nombre Tirs Horaire Plan Feux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Tirs Horaire Plan Feux</em>' attribute.
	 * @see #isSetNombreTirsHorairePlanFeux()
	 * @see #unsetNombreTirsHorairePlanFeux()
	 * @see #getNombreTirsHorairePlanFeux()
	 * @generated
	 */
	void setNombreTirsHorairePlanFeux(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeBilanTirsASS#getNombreTirsHorairePlanFeux <em>Nombre Tirs Horaire Plan Feux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreTirsHorairePlanFeux()
	 * @see #getNombreTirsHorairePlanFeux()
	 * @see #setNombreTirsHorairePlanFeux(long)
	 * @generated
	 */
	void unsetNombreTirsHorairePlanFeux();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeBilanTirsASS#getNombreTirsHorairePlanFeux <em>Nombre Tirs Horaire Plan Feux</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Tirs Horaire Plan Feux</em>' attribute is set.
	 * @see #unsetNombreTirsHorairePlanFeux()
	 * @see #getNombreTirsHorairePlanFeux()
	 * @see #setNombreTirsHorairePlanFeux(long)
	 * @generated
	 */
	boolean isSetNombreTirsHorairePlanFeux();

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
	 * @see mpia.schema.SchemaPackage#getTypeBilanTirsASS_Commentaire()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='Commentaire'"
	 * @generated
	 */
	String getCommentaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBilanTirsASS#getCommentaire <em>Commentaire</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeBilanTirsASS_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBilanTirsASS#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeBilanTirsASS_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBilanTirsASS#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>APour Unite Origine Demande Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Unite Origine Demande Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Unite Origine Demande Unite</em>' containment reference.
	 * @see #setAPourUniteOrigineDemandeUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeBilanTirsASS_APourUniteOrigineDemandeUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourUniteOrigineDemande_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getAPourUniteOrigineDemandeUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBilanTirsASS#getAPourUniteOrigineDemandeUnite <em>APour Unite Origine Demande Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Unite Origine Demande Unite</em>' containment reference.
	 * @see #getAPourUniteOrigineDemandeUnite()
	 * @generated
	 */
	void setAPourUniteOrigineDemandeUnite(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>APour Unite Rendant Compte Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Unite Rendant Compte Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Unite Rendant Compte Unite</em>' containment reference.
	 * @see #setAPourUniteRendantCompteUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeBilanTirsASS_APourUniteRendantCompteUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourUniteRendantCompte_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getAPourUniteRendantCompteUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBilanTirsASS#getAPourUniteRendantCompteUnite <em>APour Unite Rendant Compte Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Unite Rendant Compte Unite</em>' containment reference.
	 * @see #getAPourUniteRendantCompteUnite()
	 * @generated
	 */
	void setAPourUniteRendantCompteUnite(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>Concerne Plan Feux</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Plan Feux</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Plan Feux</em>' containment reference.
	 * @see #setConcernePlanFeux(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeBilanTirsASS_ConcernePlanFeux()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourBilanTirsASSassocie_BilanTirsASS' target_entity='type_PlanFeux'"
	 *        extendedMetaData="kind='element' name='Concerne_PlanFeux'"
	 * @generated
	 */
	TypeAssociation getConcernePlanFeux();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBilanTirsASS#getConcernePlanFeux <em>Concerne Plan Feux</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concerne Plan Feux</em>' containment reference.
	 * @see #getConcernePlanFeux()
	 * @generated
	 */
	void setConcernePlanFeux(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Demande Bilan Pour Type Objectif ASS</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeTypeObjectifASS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Demande Bilan Pour Type Objectif ASS</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Demande Bilan Pour Type Objectif ASS</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeBilanTirsASS_DemandeBilanPourTypeObjectifASS()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_TypeObjectifASS'"
	 *        extendedMetaData="kind='element' name='DemandeBilanPour_TypeObjectifASS'"
	 * @generated
	 */
	EList<TypeTypeObjectifASS> getDemandeBilanPourTypeObjectifASS();

	/**
	 * Returns the value of the '<em><b>Demande Bilan Sur Autre Element Controle</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Demande Bilan Sur Autre Element Controle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Demande Bilan Sur Autre Element Controle</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeBilanTirsASS_DemandeBilanSurAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='DemandeBilanSur_AutreElementControle'"
	 * @generated
	 */
	EList<TypeAssociation> getDemandeBilanSurAutreElementControle();

	/**
	 * Returns the value of the '<em><b>APour Consommation Globale Volume Munitions ASS</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeVolumeMunitionsASS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Consommation Globale Volume Munitions ASS</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Consommation Globale Volume Munitions ASS</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeBilanTirsASS_APourConsommationGlobaleVolumeMunitionsASS()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_VolumeMunitionsASS'"
	 *        extendedMetaData="kind='element' name='APourConsommationGlobale_VolumeMunitionsASS'"
	 * @generated
	 */
	EList<TypeVolumeMunitionsASS> getAPourConsommationGlobaleVolumeMunitionsASS();

	/**
	 * Returns the value of the '<em><b>APour Bilan Sur Zone Bilan Tirs AS Ssur Zone</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeBilanTirsASSsurZone}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Bilan Sur Zone Bilan Tirs AS Ssur Zone</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Bilan Sur Zone Bilan Tirs AS Ssur Zone</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeBilanTirsASS_APourBilanSurZoneBilanTirsASSsurZone()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_BilanTirsASSsurZone'"
	 *        extendedMetaData="kind='element' name='APourBilanSurZone_BilanTirsASSsurZone'"
	 * @generated
	 */
	EList<TypeBilanTirsASSsurZone> getAPourBilanSurZoneBilanTirsASSsurZone();

} // TypeBilanTirsASS
