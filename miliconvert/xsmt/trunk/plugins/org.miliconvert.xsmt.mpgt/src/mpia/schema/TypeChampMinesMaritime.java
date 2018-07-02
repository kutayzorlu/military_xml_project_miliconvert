/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeDuree;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Champ Mines Maritime</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeChampMinesMaritime#getFonction <em>Fonction</em>}</li>
 *   <li>{@link mpia.schema.TypeChampMinesMaritime#getSousFonction <em>Sous Fonction</em>}</li>
 *   <li>{@link mpia.schema.TypeChampMinesMaritime#getNombreMinesPosees <em>Nombre Mines Posees</em>}</li>
 *   <li>{@link mpia.schema.TypeChampMinesMaritime#getDetailUneMine <em>Detail Une Mine</em>}</li>
 *   <li>{@link mpia.schema.TypeChampMinesMaritime#getDureeVie <em>Duree Vie</em>}</li>
 *   <li>{@link mpia.schema.TypeChampMinesMaritime#getProfondeurPlacement <em>Profondeur Placement</em>}</li>
 *   <li>{@link mpia.schema.TypeChampMinesMaritime#getCamouflageNaturelDuFond <em>Camouflage Naturel Du Fond</em>}</li>
 *   <li>{@link mpia.schema.TypeChampMinesMaritime#getProbabiliteDetection <em>Probabilite Detection</em>}</li>
 *   <li>{@link mpia.schema.TypeChampMinesMaritime#getMesureEfficaciteEstimee <em>Mesure Efficacite Estimee</em>}</li>
 *   <li>{@link mpia.schema.TypeChampMinesMaritime#getNbBatimentsAttendus <em>Nb Batiments Attendus</em>}</li>
 *   <li>{@link mpia.schema.TypeChampMinesMaritime#getACommeDommagesEstimesChampMinesMaritimeDommagesEstimes <em>AComme Dommages Estimes Champ Mines Maritime Dommages Estimes</em>}</li>
 *   <li>{@link mpia.schema.TypeChampMinesMaritime#getACommeEfficaciteProbabilisteEfficaciteProbabiliste <em>AComme Efficacite Probabiliste Efficacite Probabiliste</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeChampMinesMaritime()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_ChampMinesMaritime' kind='elementOnly'"
 * @generated
 */
public interface TypeChampMinesMaritime extends TypeChampMines {
	/**
	 * Returns the value of the '<em><b>Fonction</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoChampMinesMaritimeFonction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fonction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fonction</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoChampMinesMaritimeFonction
	 * @see #isSetFonction()
	 * @see #unsetFonction()
	 * @see #setFonction(TypeDictionaryDicoChampMinesMaritimeFonction)
	 * @see mpia.schema.SchemaPackage#getTypeChampMinesMaritime_Fonction()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Fonction'"
	 * @generated
	 */
	TypeDictionaryDicoChampMinesMaritimeFonction getFonction();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeChampMinesMaritime#getFonction <em>Fonction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fonction</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoChampMinesMaritimeFonction
	 * @see #isSetFonction()
	 * @see #unsetFonction()
	 * @see #getFonction()
	 * @generated
	 */
	void setFonction(TypeDictionaryDicoChampMinesMaritimeFonction value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeChampMinesMaritime#getFonction <em>Fonction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFonction()
	 * @see #getFonction()
	 * @see #setFonction(TypeDictionaryDicoChampMinesMaritimeFonction)
	 * @generated
	 */
	void unsetFonction();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeChampMinesMaritime#getFonction <em>Fonction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fonction</em>' attribute is set.
	 * @see #unsetFonction()
	 * @see #getFonction()
	 * @see #setFonction(TypeDictionaryDicoChampMinesMaritimeFonction)
	 * @generated
	 */
	boolean isSetFonction();

	/**
	 * Returns the value of the '<em><b>Sous Fonction</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoChampMinesMaritimeSousFonction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sous Fonction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sous Fonction</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoChampMinesMaritimeSousFonction
	 * @see #isSetSousFonction()
	 * @see #unsetSousFonction()
	 * @see #setSousFonction(TypeDictionaryDicoChampMinesMaritimeSousFonction)
	 * @see mpia.schema.SchemaPackage#getTypeChampMinesMaritime_SousFonction()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='SousFonction'"
	 * @generated
	 */
	TypeDictionaryDicoChampMinesMaritimeSousFonction getSousFonction();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeChampMinesMaritime#getSousFonction <em>Sous Fonction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sous Fonction</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoChampMinesMaritimeSousFonction
	 * @see #isSetSousFonction()
	 * @see #unsetSousFonction()
	 * @see #getSousFonction()
	 * @generated
	 */
	void setSousFonction(TypeDictionaryDicoChampMinesMaritimeSousFonction value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeChampMinesMaritime#getSousFonction <em>Sous Fonction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSousFonction()
	 * @see #getSousFonction()
	 * @see #setSousFonction(TypeDictionaryDicoChampMinesMaritimeSousFonction)
	 * @generated
	 */
	void unsetSousFonction();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeChampMinesMaritime#getSousFonction <em>Sous Fonction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sous Fonction</em>' attribute is set.
	 * @see #unsetSousFonction()
	 * @see #getSousFonction()
	 * @see #setSousFonction(TypeDictionaryDicoChampMinesMaritimeSousFonction)
	 * @generated
	 */
	boolean isSetSousFonction();

	/**
	 * Returns the value of the '<em><b>Nombre Mines Posees</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Mines Posees</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Mines Posees</em>' attribute.
	 * @see #isSetNombreMinesPosees()
	 * @see #unsetNombreMinesPosees()
	 * @see #setNombreMinesPosees(long)
	 * @see mpia.schema.SchemaPackage#getTypeChampMinesMaritime_NombreMinesPosees()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='NombreMinesPosees'"
	 * @generated
	 */
	long getNombreMinesPosees();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeChampMinesMaritime#getNombreMinesPosees <em>Nombre Mines Posees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Mines Posees</em>' attribute.
	 * @see #isSetNombreMinesPosees()
	 * @see #unsetNombreMinesPosees()
	 * @see #getNombreMinesPosees()
	 * @generated
	 */
	void setNombreMinesPosees(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeChampMinesMaritime#getNombreMinesPosees <em>Nombre Mines Posees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreMinesPosees()
	 * @see #getNombreMinesPosees()
	 * @see #setNombreMinesPosees(long)
	 * @generated
	 */
	void unsetNombreMinesPosees();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeChampMinesMaritime#getNombreMinesPosees <em>Nombre Mines Posees</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Mines Posees</em>' attribute is set.
	 * @see #unsetNombreMinesPosees()
	 * @see #getNombreMinesPosees()
	 * @see #setNombreMinesPosees(long)
	 * @generated
	 */
	boolean isSetNombreMinesPosees();

	/**
	 * Returns the value of the '<em><b>Detail Une Mine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detail Une Mine</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detail Une Mine</em>' attribute.
	 * @see #setDetailUneMine(String)
	 * @see mpia.schema.SchemaPackage#getTypeChampMinesMaritime_DetailUneMine()
	 * @model dataType="mpia.meta.TypeDataTypeChaine050"
	 *        extendedMetaData="kind='element' name='DetailUneMine'"
	 * @generated
	 */
	String getDetailUneMine();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeChampMinesMaritime#getDetailUneMine <em>Detail Une Mine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail Une Mine</em>' attribute.
	 * @see #getDetailUneMine()
	 * @generated
	 */
	void setDetailUneMine(String value);

	/**
	 * Returns the value of the '<em><b>Duree Vie</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duree Vie</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duree Vie</em>' containment reference.
	 * @see #setDureeVie(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypeChampMinesMaritime_DureeVie()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DureeVie'"
	 * @generated
	 */
	TypeDataTypeDuree getDureeVie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeChampMinesMaritime#getDureeVie <em>Duree Vie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duree Vie</em>' containment reference.
	 * @see #getDureeVie()
	 * @generated
	 */
	void setDureeVie(TypeDataTypeDuree value);

	/**
	 * Returns the value of the '<em><b>Profondeur Placement</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoChampMinesMaritimeProfondeurPlacement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profondeur Placement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profondeur Placement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoChampMinesMaritimeProfondeurPlacement
	 * @see #isSetProfondeurPlacement()
	 * @see #unsetProfondeurPlacement()
	 * @see #setProfondeurPlacement(TypeDictionaryDicoChampMinesMaritimeProfondeurPlacement)
	 * @see mpia.schema.SchemaPackage#getTypeChampMinesMaritime_ProfondeurPlacement()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ProfondeurPlacement'"
	 * @generated
	 */
	TypeDictionaryDicoChampMinesMaritimeProfondeurPlacement getProfondeurPlacement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeChampMinesMaritime#getProfondeurPlacement <em>Profondeur Placement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profondeur Placement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoChampMinesMaritimeProfondeurPlacement
	 * @see #isSetProfondeurPlacement()
	 * @see #unsetProfondeurPlacement()
	 * @see #getProfondeurPlacement()
	 * @generated
	 */
	void setProfondeurPlacement(TypeDictionaryDicoChampMinesMaritimeProfondeurPlacement value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeChampMinesMaritime#getProfondeurPlacement <em>Profondeur Placement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProfondeurPlacement()
	 * @see #getProfondeurPlacement()
	 * @see #setProfondeurPlacement(TypeDictionaryDicoChampMinesMaritimeProfondeurPlacement)
	 * @generated
	 */
	void unsetProfondeurPlacement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeChampMinesMaritime#getProfondeurPlacement <em>Profondeur Placement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Profondeur Placement</em>' attribute is set.
	 * @see #unsetProfondeurPlacement()
	 * @see #getProfondeurPlacement()
	 * @see #setProfondeurPlacement(TypeDictionaryDicoChampMinesMaritimeProfondeurPlacement)
	 * @generated
	 */
	boolean isSetProfondeurPlacement();

	/**
	 * Returns the value of the '<em><b>Camouflage Naturel Du Fond</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoChampMinesMaritimeCamouflageNaturelDuFond}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Camouflage Naturel Du Fond</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Camouflage Naturel Du Fond</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoChampMinesMaritimeCamouflageNaturelDuFond
	 * @see #isSetCamouflageNaturelDuFond()
	 * @see #unsetCamouflageNaturelDuFond()
	 * @see #setCamouflageNaturelDuFond(TypeDictionaryDicoChampMinesMaritimeCamouflageNaturelDuFond)
	 * @see mpia.schema.SchemaPackage#getTypeChampMinesMaritime_CamouflageNaturelDuFond()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='CamouflageNaturelDuFond'"
	 * @generated
	 */
	TypeDictionaryDicoChampMinesMaritimeCamouflageNaturelDuFond getCamouflageNaturelDuFond();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeChampMinesMaritime#getCamouflageNaturelDuFond <em>Camouflage Naturel Du Fond</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Camouflage Naturel Du Fond</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoChampMinesMaritimeCamouflageNaturelDuFond
	 * @see #isSetCamouflageNaturelDuFond()
	 * @see #unsetCamouflageNaturelDuFond()
	 * @see #getCamouflageNaturelDuFond()
	 * @generated
	 */
	void setCamouflageNaturelDuFond(TypeDictionaryDicoChampMinesMaritimeCamouflageNaturelDuFond value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeChampMinesMaritime#getCamouflageNaturelDuFond <em>Camouflage Naturel Du Fond</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCamouflageNaturelDuFond()
	 * @see #getCamouflageNaturelDuFond()
	 * @see #setCamouflageNaturelDuFond(TypeDictionaryDicoChampMinesMaritimeCamouflageNaturelDuFond)
	 * @generated
	 */
	void unsetCamouflageNaturelDuFond();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeChampMinesMaritime#getCamouflageNaturelDuFond <em>Camouflage Naturel Du Fond</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Camouflage Naturel Du Fond</em>' attribute is set.
	 * @see #unsetCamouflageNaturelDuFond()
	 * @see #getCamouflageNaturelDuFond()
	 * @see #setCamouflageNaturelDuFond(TypeDictionaryDicoChampMinesMaritimeCamouflageNaturelDuFond)
	 * @generated
	 */
	boolean isSetCamouflageNaturelDuFond();

	/**
	 * Returns the value of the '<em><b>Probabilite Detection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Probabilite Detection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probabilite Detection</em>' attribute.
	 * @see #isSetProbabiliteDetection()
	 * @see #unsetProbabiliteDetection()
	 * @see #setProbabiliteDetection(double)
	 * @see mpia.schema.SchemaPackage#getTypeChampMinesMaritime_ProbabiliteDetection()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeFraction"
	 *        extendedMetaData="kind='element' name='ProbabiliteDetection'"
	 * @generated
	 */
	double getProbabiliteDetection();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeChampMinesMaritime#getProbabiliteDetection <em>Probabilite Detection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probabilite Detection</em>' attribute.
	 * @see #isSetProbabiliteDetection()
	 * @see #unsetProbabiliteDetection()
	 * @see #getProbabiliteDetection()
	 * @generated
	 */
	void setProbabiliteDetection(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeChampMinesMaritime#getProbabiliteDetection <em>Probabilite Detection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProbabiliteDetection()
	 * @see #getProbabiliteDetection()
	 * @see #setProbabiliteDetection(double)
	 * @generated
	 */
	void unsetProbabiliteDetection();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeChampMinesMaritime#getProbabiliteDetection <em>Probabilite Detection</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Probabilite Detection</em>' attribute is set.
	 * @see #unsetProbabiliteDetection()
	 * @see #getProbabiliteDetection()
	 * @see #setProbabiliteDetection(double)
	 * @generated
	 */
	boolean isSetProbabiliteDetection();

	/**
	 * Returns the value of the '<em><b>Mesure Efficacite Estimee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mesure Efficacite Estimee</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mesure Efficacite Estimee</em>' attribute.
	 * @see #isSetMesureEfficaciteEstimee()
	 * @see #unsetMesureEfficaciteEstimee()
	 * @see #setMesureEfficaciteEstimee(double)
	 * @see mpia.schema.SchemaPackage#getTypeChampMinesMaritime_MesureEfficaciteEstimee()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeFraction"
	 *        extendedMetaData="kind='element' name='MesureEfficaciteEstimee'"
	 * @generated
	 */
	double getMesureEfficaciteEstimee();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeChampMinesMaritime#getMesureEfficaciteEstimee <em>Mesure Efficacite Estimee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mesure Efficacite Estimee</em>' attribute.
	 * @see #isSetMesureEfficaciteEstimee()
	 * @see #unsetMesureEfficaciteEstimee()
	 * @see #getMesureEfficaciteEstimee()
	 * @generated
	 */
	void setMesureEfficaciteEstimee(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeChampMinesMaritime#getMesureEfficaciteEstimee <em>Mesure Efficacite Estimee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMesureEfficaciteEstimee()
	 * @see #getMesureEfficaciteEstimee()
	 * @see #setMesureEfficaciteEstimee(double)
	 * @generated
	 */
	void unsetMesureEfficaciteEstimee();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeChampMinesMaritime#getMesureEfficaciteEstimee <em>Mesure Efficacite Estimee</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mesure Efficacite Estimee</em>' attribute is set.
	 * @see #unsetMesureEfficaciteEstimee()
	 * @see #getMesureEfficaciteEstimee()
	 * @see #setMesureEfficaciteEstimee(double)
	 * @generated
	 */
	boolean isSetMesureEfficaciteEstimee();

	/**
	 * Returns the value of the '<em><b>Nb Batiments Attendus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Batiments Attendus</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Batiments Attendus</em>' attribute.
	 * @see #isSetNbBatimentsAttendus()
	 * @see #unsetNbBatimentsAttendus()
	 * @see #setNbBatimentsAttendus(long)
	 * @see mpia.schema.SchemaPackage#getTypeChampMinesMaritime_NbBatimentsAttendus()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='NbBatimentsAttendus'"
	 * @generated
	 */
	long getNbBatimentsAttendus();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeChampMinesMaritime#getNbBatimentsAttendus <em>Nb Batiments Attendus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Batiments Attendus</em>' attribute.
	 * @see #isSetNbBatimentsAttendus()
	 * @see #unsetNbBatimentsAttendus()
	 * @see #getNbBatimentsAttendus()
	 * @generated
	 */
	void setNbBatimentsAttendus(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeChampMinesMaritime#getNbBatimentsAttendus <em>Nb Batiments Attendus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNbBatimentsAttendus()
	 * @see #getNbBatimentsAttendus()
	 * @see #setNbBatimentsAttendus(long)
	 * @generated
	 */
	void unsetNbBatimentsAttendus();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeChampMinesMaritime#getNbBatimentsAttendus <em>Nb Batiments Attendus</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nb Batiments Attendus</em>' attribute is set.
	 * @see #unsetNbBatimentsAttendus()
	 * @see #getNbBatimentsAttendus()
	 * @see #setNbBatimentsAttendus(long)
	 * @generated
	 */
	boolean isSetNbBatimentsAttendus();

	/**
	 * Returns the value of the '<em><b>AComme Dommages Estimes Champ Mines Maritime Dommages Estimes</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeChampMinesMaritimeDommagesEstimes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Dommages Estimes Champ Mines Maritime Dommages Estimes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Dommages Estimes Champ Mines Maritime Dommages Estimes</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeChampMinesMaritime_ACommeDommagesEstimesChampMinesMaritimeDommagesEstimes()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ChampMinesMaritimeDommagesEstimes'"
	 *        extendedMetaData="kind='element' name='ACommeDommagesEstimes_ChampMinesMaritimeDommagesEstimes'"
	 * @generated
	 */
	EList<TypeChampMinesMaritimeDommagesEstimes> getACommeDommagesEstimesChampMinesMaritimeDommagesEstimes();

	/**
	 * Returns the value of the '<em><b>AComme Efficacite Probabiliste Efficacite Probabiliste</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeEfficaciteProbabiliste}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Efficacite Probabiliste Efficacite Probabiliste</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Efficacite Probabiliste Efficacite Probabiliste</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeChampMinesMaritime_ACommeEfficaciteProbabilisteEfficaciteProbabiliste()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_EfficaciteProbabiliste'"
	 *        extendedMetaData="kind='element' name='ACommeEfficaciteProbabiliste_EfficaciteProbabiliste'"
	 * @generated
	 */
	EList<TypeEfficaciteProbabiliste> getACommeEfficaciteProbabilisteEfficaciteProbabiliste();

} // TypeChampMinesMaritime
