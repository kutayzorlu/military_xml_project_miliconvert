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
import mpia.meta.TypeDataTypeVolume;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Point Trajectoire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypePointTrajectoire#getNumeroOrdre <em>Numero Ordre</em>}</li>
 *   <li>{@link mpia.schema.TypePointTrajectoire#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypePointTrajectoire#getDateDesiree <em>Date Desiree</em>}</li>
 *   <li>{@link mpia.schema.TypePointTrajectoire#getDateCalculee <em>Date Calculee</em>}</li>
 *   <li>{@link mpia.schema.TypePointTrajectoire#getDureeSurPoint <em>Duree Sur Point</em>}</li>
 *   <li>{@link mpia.schema.TypePointTrajectoire#getTypeAttente <em>Type Attente</em>}</li>
 *   <li>{@link mpia.schema.TypePointTrajectoire#getCarburantRestant <em>Carburant Restant</em>}</li>
 *   <li>{@link mpia.schema.TypePointTrajectoire#getCarburantPourRavitaillement <em>Carburant Pour Ravitaillement</em>}</li>
 *   <li>{@link mpia.schema.TypePointTrajectoire#getDureeRetourDirect <em>Duree Retour Direct</em>}</li>
 *   <li>{@link mpia.schema.TypePointTrajectoire#getConsommationRetour <em>Consommation Retour</em>}</li>
 *   <li>{@link mpia.schema.TypePointTrajectoire#getCarburantConsommeTotal <em>Carburant Consomme Total</em>}</li>
 *   <li>{@link mpia.schema.TypePointTrajectoire#getEstConsigneGeographiqueConsigne <em>Est Consigne Geographique Consigne</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypePointTrajectoire()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_PointTrajectoire' kind='elementOnly'"
 * @generated
 */
public interface TypePointTrajectoire extends TypeElementControle {
	/**
	 * Returns the value of the '<em><b>Numero Ordre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Ordre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Ordre</em>' attribute.
	 * @see #isSetNumeroOrdre()
	 * @see #unsetNumeroOrdre()
	 * @see #setNumeroOrdre(long)
	 * @see mpia.schema.SchemaPackage#getTypePointTrajectoire_NumeroOrdre()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6" required="true"
	 *        extendedMetaData="kind='element' name='NumeroOrdre'"
	 * @generated
	 */
	long getNumeroOrdre();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePointTrajectoire#getNumeroOrdre <em>Numero Ordre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Ordre</em>' attribute.
	 * @see #isSetNumeroOrdre()
	 * @see #unsetNumeroOrdre()
	 * @see #getNumeroOrdre()
	 * @generated
	 */
	void setNumeroOrdre(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePointTrajectoire#getNumeroOrdre <em>Numero Ordre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumeroOrdre()
	 * @see #getNumeroOrdre()
	 * @see #setNumeroOrdre(long)
	 * @generated
	 */
	void unsetNumeroOrdre();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePointTrajectoire#getNumeroOrdre <em>Numero Ordre</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Numero Ordre</em>' attribute is set.
	 * @see #unsetNumeroOrdre()
	 * @see #getNumeroOrdre()
	 * @see #setNumeroOrdre(long)
	 * @generated
	 */
	boolean isSetNumeroOrdre();

	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPointTrajectoireCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPointTrajectoireCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoPointTrajectoireCategorie)
	 * @see mpia.schema.SchemaPackage#getTypePointTrajectoire_Categorie()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoPointTrajectoireCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePointTrajectoire#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPointTrajectoireCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoPointTrajectoireCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePointTrajectoire#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoPointTrajectoireCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePointTrajectoire#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoPointTrajectoireCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Date Desiree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Desiree</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Desiree</em>' attribute.
	 * @see #setDateDesiree(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypePointTrajectoire_DateDesiree()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateDesiree'"
	 * @generated
	 */
	XMLGregorianCalendar getDateDesiree();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePointTrajectoire#getDateDesiree <em>Date Desiree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Desiree</em>' attribute.
	 * @see #getDateDesiree()
	 * @generated
	 */
	void setDateDesiree(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Date Calculee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Calculee</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Calculee</em>' attribute.
	 * @see #setDateCalculee(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypePointTrajectoire_DateCalculee()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateCalculee'"
	 * @generated
	 */
	XMLGregorianCalendar getDateCalculee();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePointTrajectoire#getDateCalculee <em>Date Calculee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Calculee</em>' attribute.
	 * @see #getDateCalculee()
	 * @generated
	 */
	void setDateCalculee(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Duree Sur Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duree Sur Point</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duree Sur Point</em>' containment reference.
	 * @see #setDureeSurPoint(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypePointTrajectoire_DureeSurPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DureeSurPoint'"
	 * @generated
	 */
	TypeDataTypeDuree getDureeSurPoint();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePointTrajectoire#getDureeSurPoint <em>Duree Sur Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duree Sur Point</em>' containment reference.
	 * @see #getDureeSurPoint()
	 * @generated
	 */
	void setDureeSurPoint(TypeDataTypeDuree value);

	/**
	 * Returns the value of the '<em><b>Type Attente</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPointTrajectoireTypeAttente}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Attente</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Attente</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPointTrajectoireTypeAttente
	 * @see #isSetTypeAttente()
	 * @see #unsetTypeAttente()
	 * @see #setTypeAttente(TypeDictionaryDicoPointTrajectoireTypeAttente)
	 * @see mpia.schema.SchemaPackage#getTypePointTrajectoire_TypeAttente()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeAttente'"
	 * @generated
	 */
	TypeDictionaryDicoPointTrajectoireTypeAttente getTypeAttente();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePointTrajectoire#getTypeAttente <em>Type Attente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Attente</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPointTrajectoireTypeAttente
	 * @see #isSetTypeAttente()
	 * @see #unsetTypeAttente()
	 * @see #getTypeAttente()
	 * @generated
	 */
	void setTypeAttente(TypeDictionaryDicoPointTrajectoireTypeAttente value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePointTrajectoire#getTypeAttente <em>Type Attente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeAttente()
	 * @see #getTypeAttente()
	 * @see #setTypeAttente(TypeDictionaryDicoPointTrajectoireTypeAttente)
	 * @generated
	 */
	void unsetTypeAttente();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePointTrajectoire#getTypeAttente <em>Type Attente</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Attente</em>' attribute is set.
	 * @see #unsetTypeAttente()
	 * @see #getTypeAttente()
	 * @see #setTypeAttente(TypeDictionaryDicoPointTrajectoireTypeAttente)
	 * @generated
	 */
	boolean isSetTypeAttente();

	/**
	 * Returns the value of the '<em><b>Carburant Restant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Carburant Restant</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carburant Restant</em>' containment reference.
	 * @see #setCarburantRestant(TypeDataTypeVolume)
	 * @see mpia.schema.SchemaPackage#getTypePointTrajectoire_CarburantRestant()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CarburantRestant'"
	 * @generated
	 */
	TypeDataTypeVolume getCarburantRestant();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePointTrajectoire#getCarburantRestant <em>Carburant Restant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carburant Restant</em>' containment reference.
	 * @see #getCarburantRestant()
	 * @generated
	 */
	void setCarburantRestant(TypeDataTypeVolume value);

	/**
	 * Returns the value of the '<em><b>Carburant Pour Ravitaillement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Carburant Pour Ravitaillement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carburant Pour Ravitaillement</em>' containment reference.
	 * @see #setCarburantPourRavitaillement(TypeDataTypeVolume)
	 * @see mpia.schema.SchemaPackage#getTypePointTrajectoire_CarburantPourRavitaillement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CarburantPourRavitaillement'"
	 * @generated
	 */
	TypeDataTypeVolume getCarburantPourRavitaillement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePointTrajectoire#getCarburantPourRavitaillement <em>Carburant Pour Ravitaillement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carburant Pour Ravitaillement</em>' containment reference.
	 * @see #getCarburantPourRavitaillement()
	 * @generated
	 */
	void setCarburantPourRavitaillement(TypeDataTypeVolume value);

	/**
	 * Returns the value of the '<em><b>Duree Retour Direct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duree Retour Direct</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duree Retour Direct</em>' containment reference.
	 * @see #setDureeRetourDirect(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypePointTrajectoire_DureeRetourDirect()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DureeRetourDirect'"
	 * @generated
	 */
	TypeDataTypeDuree getDureeRetourDirect();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePointTrajectoire#getDureeRetourDirect <em>Duree Retour Direct</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duree Retour Direct</em>' containment reference.
	 * @see #getDureeRetourDirect()
	 * @generated
	 */
	void setDureeRetourDirect(TypeDataTypeDuree value);

	/**
	 * Returns the value of the '<em><b>Consommation Retour</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consommation Retour</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consommation Retour</em>' containment reference.
	 * @see #setConsommationRetour(TypeDataTypeVolume)
	 * @see mpia.schema.SchemaPackage#getTypePointTrajectoire_ConsommationRetour()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ConsommationRetour'"
	 * @generated
	 */
	TypeDataTypeVolume getConsommationRetour();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePointTrajectoire#getConsommationRetour <em>Consommation Retour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consommation Retour</em>' containment reference.
	 * @see #getConsommationRetour()
	 * @generated
	 */
	void setConsommationRetour(TypeDataTypeVolume value);

	/**
	 * Returns the value of the '<em><b>Carburant Consomme Total</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Carburant Consomme Total</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carburant Consomme Total</em>' containment reference.
	 * @see #setCarburantConsommeTotal(TypeDataTypeVolume)
	 * @see mpia.schema.SchemaPackage#getTypePointTrajectoire_CarburantConsommeTotal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CarburantConsommeTotal'"
	 * @generated
	 */
	TypeDataTypeVolume getCarburantConsommeTotal();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePointTrajectoire#getCarburantConsommeTotal <em>Carburant Consomme Total</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carburant Consomme Total</em>' containment reference.
	 * @see #getCarburantConsommeTotal()
	 * @generated
	 */
	void setCarburantConsommeTotal(TypeDataTypeVolume value);

	/**
	 * Returns the value of the '<em><b>Est Consigne Geographique Consigne</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Consigne Geographique Consigne</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Consigne Geographique Consigne</em>' containment reference.
	 * @see #setEstConsigneGeographiqueConsigne(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypePointTrajectoire_EstConsigneGeographiqueConsigne()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Consigne'"
	 *        extendedMetaData="kind='element' name='EstConsigneGeographique_Consigne'"
	 * @generated
	 */
	TypeAssociation getEstConsigneGeographiqueConsigne();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePointTrajectoire#getEstConsigneGeographiqueConsigne <em>Est Consigne Geographique Consigne</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Consigne Geographique Consigne</em>' containment reference.
	 * @see #getEstConsigneGeographiqueConsigne()
	 * @generated
	 */
	void setEstConsigneGeographiqueConsigne(TypeAssociation value);

} // TypePointTrajectoire
