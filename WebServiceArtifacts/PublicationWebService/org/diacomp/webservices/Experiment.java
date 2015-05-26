
package org.diacomp.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Experiment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Experiment">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.diacomp.org/webservices/}IDObject">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Species" type="{http://www.diacomp.org/webservices/}Species" minOccurs="0"/>
 *         &lt;element name="ModelTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AnimalAgeUnit" type="{http://www.diacomp.org/webservices/}DataUnit" minOccurs="0"/>
 *         &lt;element name="StatusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PublicReleaseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="MaleCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FemaleCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HistologyCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BioAssayCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PhenotypeDatumCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Documents" type="{http://www.diacomp.org/webservices/}ArrayOfDocument" minOccurs="0"/>
 *         &lt;element name="ConsortiumID" type="{http://www.diacomp.org/webservices/}ID"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Experiment", propOrder = {
    "name",
    "typeName",
    "description",
    "species",
    "modelTypeName",
    "animalAgeUnit",
    "statusName",
    "publicReleaseDate",
    "maleCount",
    "femaleCount",
    "histologyCount",
    "bioAssayCount",
    "phenotypeDatumCount",
    "documents",
    "consortiumID"
})
public class Experiment
    extends IDObject
{

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "TypeName")
    protected String typeName;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Species")
    protected Species species;
    @XmlElement(name = "ModelTypeName")
    protected String modelTypeName;
    @XmlElement(name = "AnimalAgeUnit")
    protected DataUnit animalAgeUnit;
    @XmlElement(name = "StatusName")
    protected String statusName;
    @XmlElement(name = "PublicReleaseDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar publicReleaseDate;
    @XmlElement(name = "MaleCount")
    protected int maleCount;
    @XmlElement(name = "FemaleCount")
    protected int femaleCount;
    @XmlElement(name = "HistologyCount")
    protected int histologyCount;
    @XmlElement(name = "BioAssayCount")
    protected int bioAssayCount;
    @XmlElement(name = "PhenotypeDatumCount")
    protected int phenotypeDatumCount;
    @XmlElement(name = "Documents")
    protected ArrayOfDocument documents;
    @XmlElement(name = "ConsortiumID", required = true)
    protected ID consortiumID;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the typeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * Sets the value of the typeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeName(String value) {
        this.typeName = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the species property.
     * 
     * @return
     *     possible object is
     *     {@link Species }
     *     
     */
    public Species getSpecies() {
        return species;
    }

    /**
     * Sets the value of the species property.
     * 
     * @param value
     *     allowed object is
     *     {@link Species }
     *     
     */
    public void setSpecies(Species value) {
        this.species = value;
    }

    /**
     * Gets the value of the modelTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelTypeName() {
        return modelTypeName;
    }

    /**
     * Sets the value of the modelTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelTypeName(String value) {
        this.modelTypeName = value;
    }

    /**
     * Gets the value of the animalAgeUnit property.
     * 
     * @return
     *     possible object is
     *     {@link DataUnit }
     *     
     */
    public DataUnit getAnimalAgeUnit() {
        return animalAgeUnit;
    }

    /**
     * Sets the value of the animalAgeUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataUnit }
     *     
     */
    public void setAnimalAgeUnit(DataUnit value) {
        this.animalAgeUnit = value;
    }

    /**
     * Gets the value of the statusName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusName() {
        return statusName;
    }

    /**
     * Sets the value of the statusName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusName(String value) {
        this.statusName = value;
    }

    /**
     * Gets the value of the publicReleaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPublicReleaseDate() {
        return publicReleaseDate;
    }

    /**
     * Sets the value of the publicReleaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPublicReleaseDate(XMLGregorianCalendar value) {
        this.publicReleaseDate = value;
    }

    /**
     * Gets the value of the maleCount property.
     * 
     */
    public int getMaleCount() {
        return maleCount;
    }

    /**
     * Sets the value of the maleCount property.
     * 
     */
    public void setMaleCount(int value) {
        this.maleCount = value;
    }

    /**
     * Gets the value of the femaleCount property.
     * 
     */
    public int getFemaleCount() {
        return femaleCount;
    }

    /**
     * Sets the value of the femaleCount property.
     * 
     */
    public void setFemaleCount(int value) {
        this.femaleCount = value;
    }

    /**
     * Gets the value of the histologyCount property.
     * 
     */
    public int getHistologyCount() {
        return histologyCount;
    }

    /**
     * Sets the value of the histologyCount property.
     * 
     */
    public void setHistologyCount(int value) {
        this.histologyCount = value;
    }

    /**
     * Gets the value of the bioAssayCount property.
     * 
     */
    public int getBioAssayCount() {
        return bioAssayCount;
    }

    /**
     * Sets the value of the bioAssayCount property.
     * 
     */
    public void setBioAssayCount(int value) {
        this.bioAssayCount = value;
    }

    /**
     * Gets the value of the phenotypeDatumCount property.
     * 
     */
    public int getPhenotypeDatumCount() {
        return phenotypeDatumCount;
    }

    /**
     * Sets the value of the phenotypeDatumCount property.
     * 
     */
    public void setPhenotypeDatumCount(int value) {
        this.phenotypeDatumCount = value;
    }

    /**
     * Gets the value of the documents property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDocument }
     *     
     */
    public ArrayOfDocument getDocuments() {
        return documents;
    }

    /**
     * Sets the value of the documents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDocument }
     *     
     */
    public void setDocuments(ArrayOfDocument value) {
        this.documents = value;
    }

    /**
     * Gets the value of the consortiumID property.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getConsortiumID() {
        return consortiumID;
    }

    /**
     * Sets the value of the consortiumID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setConsortiumID(ID value) {
        this.consortiumID = value;
    }

}
