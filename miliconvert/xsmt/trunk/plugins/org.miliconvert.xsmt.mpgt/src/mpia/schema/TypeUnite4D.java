/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Unite4 D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeUnite4D#getVideo <em>Video</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite4D#getVoix <em>Voix</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite4D#isAffichagePannes <em>Affichage Pannes</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite4D#getSatellite <em>Satellite</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite4D#getReseauSI <em>Reseau SI</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite4D#getTD <em>TD</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite4D#getAutres <em>Autres</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite4D#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeUnite4D#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeUnite4D()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_Unite4D' kind='elementOnly'"
 * @generated
 */
public interface TypeUnite4D extends EObject {
	/**
	 * Returns the value of the '<em><b>Video</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoThreeStates}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Video</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Video</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoThreeStates
	 * @see #isSetVideo()
	 * @see #unsetVideo()
	 * @see #setVideo(TypeDictionaryDicoThreeStates)
	 * @see mpia.schema.SchemaPackage#getTypeUnite4D_Video()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Video'"
	 * @generated
	 */
	TypeDictionaryDicoThreeStates getVideo();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUnite4D#getVideo <em>Video</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Video</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoThreeStates
	 * @see #isSetVideo()
	 * @see #unsetVideo()
	 * @see #getVideo()
	 * @generated
	 */
	void setVideo(TypeDictionaryDicoThreeStates value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeUnite4D#getVideo <em>Video</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVideo()
	 * @see #getVideo()
	 * @see #setVideo(TypeDictionaryDicoThreeStates)
	 * @generated
	 */
	void unsetVideo();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeUnite4D#getVideo <em>Video</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Video</em>' attribute is set.
	 * @see #unsetVideo()
	 * @see #getVideo()
	 * @see #setVideo(TypeDictionaryDicoThreeStates)
	 * @generated
	 */
	boolean isSetVideo();

	/**
	 * Returns the value of the '<em><b>Voix</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoThreeStates}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voix</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoThreeStates
	 * @see #isSetVoix()
	 * @see #unsetVoix()
	 * @see #setVoix(TypeDictionaryDicoThreeStates)
	 * @see mpia.schema.SchemaPackage#getTypeUnite4D_Voix()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Voix'"
	 * @generated
	 */
	TypeDictionaryDicoThreeStates getVoix();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUnite4D#getVoix <em>Voix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voix</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoThreeStates
	 * @see #isSetVoix()
	 * @see #unsetVoix()
	 * @see #getVoix()
	 * @generated
	 */
	void setVoix(TypeDictionaryDicoThreeStates value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeUnite4D#getVoix <em>Voix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVoix()
	 * @see #getVoix()
	 * @see #setVoix(TypeDictionaryDicoThreeStates)
	 * @generated
	 */
	void unsetVoix();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeUnite4D#getVoix <em>Voix</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Voix</em>' attribute is set.
	 * @see #unsetVoix()
	 * @see #getVoix()
	 * @see #setVoix(TypeDictionaryDicoThreeStates)
	 * @generated
	 */
	boolean isSetVoix();

	/**
	 * Returns the value of the '<em><b>Affichage Pannes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Affichage Pannes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affichage Pannes</em>' attribute.
	 * @see #isSetAffichagePannes()
	 * @see #unsetAffichagePannes()
	 * @see #setAffichagePannes(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeUnite4D_AffichagePannes()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='AffichagePannes'"
	 * @generated
	 */
	boolean isAffichagePannes();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUnite4D#isAffichagePannes <em>Affichage Pannes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Affichage Pannes</em>' attribute.
	 * @see #isSetAffichagePannes()
	 * @see #unsetAffichagePannes()
	 * @see #isAffichagePannes()
	 * @generated
	 */
	void setAffichagePannes(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeUnite4D#isAffichagePannes <em>Affichage Pannes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAffichagePannes()
	 * @see #isAffichagePannes()
	 * @see #setAffichagePannes(boolean)
	 * @generated
	 */
	void unsetAffichagePannes();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeUnite4D#isAffichagePannes <em>Affichage Pannes</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Affichage Pannes</em>' attribute is set.
	 * @see #unsetAffichagePannes()
	 * @see #isAffichagePannes()
	 * @see #setAffichagePannes(boolean)
	 * @generated
	 */
	boolean isSetAffichagePannes();

	/**
	 * Returns the value of the '<em><b>Satellite</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoThreeStates}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Satellite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Satellite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoThreeStates
	 * @see #isSetSatellite()
	 * @see #unsetSatellite()
	 * @see #setSatellite(TypeDictionaryDicoThreeStates)
	 * @see mpia.schema.SchemaPackage#getTypeUnite4D_Satellite()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Satellite'"
	 * @generated
	 */
	TypeDictionaryDicoThreeStates getSatellite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUnite4D#getSatellite <em>Satellite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Satellite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoThreeStates
	 * @see #isSetSatellite()
	 * @see #unsetSatellite()
	 * @see #getSatellite()
	 * @generated
	 */
	void setSatellite(TypeDictionaryDicoThreeStates value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeUnite4D#getSatellite <em>Satellite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSatellite()
	 * @see #getSatellite()
	 * @see #setSatellite(TypeDictionaryDicoThreeStates)
	 * @generated
	 */
	void unsetSatellite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeUnite4D#getSatellite <em>Satellite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Satellite</em>' attribute is set.
	 * @see #unsetSatellite()
	 * @see #getSatellite()
	 * @see #setSatellite(TypeDictionaryDicoThreeStates)
	 * @generated
	 */
	boolean isSetSatellite();

	/**
	 * Returns the value of the '<em><b>Reseau SI</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoThreeStates}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reseau SI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reseau SI</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoThreeStates
	 * @see #isSetReseauSI()
	 * @see #unsetReseauSI()
	 * @see #setReseauSI(TypeDictionaryDicoThreeStates)
	 * @see mpia.schema.SchemaPackage#getTypeUnite4D_ReseauSI()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ReseauSI'"
	 * @generated
	 */
	TypeDictionaryDicoThreeStates getReseauSI();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUnite4D#getReseauSI <em>Reseau SI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reseau SI</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoThreeStates
	 * @see #isSetReseauSI()
	 * @see #unsetReseauSI()
	 * @see #getReseauSI()
	 * @generated
	 */
	void setReseauSI(TypeDictionaryDicoThreeStates value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeUnite4D#getReseauSI <em>Reseau SI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReseauSI()
	 * @see #getReseauSI()
	 * @see #setReseauSI(TypeDictionaryDicoThreeStates)
	 * @generated
	 */
	void unsetReseauSI();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeUnite4D#getReseauSI <em>Reseau SI</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reseau SI</em>' attribute is set.
	 * @see #unsetReseauSI()
	 * @see #getReseauSI()
	 * @see #setReseauSI(TypeDictionaryDicoThreeStates)
	 * @generated
	 */
	boolean isSetReseauSI();

	/**
	 * Returns the value of the '<em><b>TD</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoThreeStates}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TD</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TD</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoThreeStates
	 * @see #isSetTD()
	 * @see #unsetTD()
	 * @see #setTD(TypeDictionaryDicoThreeStates)
	 * @see mpia.schema.SchemaPackage#getTypeUnite4D_TD()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TD'"
	 * @generated
	 */
	TypeDictionaryDicoThreeStates getTD();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUnite4D#getTD <em>TD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TD</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoThreeStates
	 * @see #isSetTD()
	 * @see #unsetTD()
	 * @see #getTD()
	 * @generated
	 */
	void setTD(TypeDictionaryDicoThreeStates value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeUnite4D#getTD <em>TD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTD()
	 * @see #getTD()
	 * @see #setTD(TypeDictionaryDicoThreeStates)
	 * @generated
	 */
	void unsetTD();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeUnite4D#getTD <em>TD</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>TD</em>' attribute is set.
	 * @see #unsetTD()
	 * @see #getTD()
	 * @see #setTD(TypeDictionaryDicoThreeStates)
	 * @generated
	 */
	boolean isSetTD();

	/**
	 * Returns the value of the '<em><b>Autres</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoThreeStates}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autres</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autres</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoThreeStates
	 * @see #isSetAutres()
	 * @see #unsetAutres()
	 * @see #setAutres(TypeDictionaryDicoThreeStates)
	 * @see mpia.schema.SchemaPackage#getTypeUnite4D_Autres()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Autres'"
	 * @generated
	 */
	TypeDictionaryDicoThreeStates getAutres();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUnite4D#getAutres <em>Autres</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autres</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoThreeStates
	 * @see #isSetAutres()
	 * @see #unsetAutres()
	 * @see #getAutres()
	 * @generated
	 */
	void setAutres(TypeDictionaryDicoThreeStates value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeUnite4D#getAutres <em>Autres</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAutres()
	 * @see #getAutres()
	 * @see #setAutres(TypeDictionaryDicoThreeStates)
	 * @generated
	 */
	void unsetAutres();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeUnite4D#getAutres <em>Autres</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Autres</em>' attribute is set.
	 * @see #unsetAutres()
	 * @see #getAutres()
	 * @see #setAutres(TypeDictionaryDicoThreeStates)
	 * @generated
	 */
	boolean isSetAutres();

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
	 * @see mpia.schema.SchemaPackage#getTypeUnite4D_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUnite4D#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeUnite4D_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUnite4D#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

} // TypeUnite4D
