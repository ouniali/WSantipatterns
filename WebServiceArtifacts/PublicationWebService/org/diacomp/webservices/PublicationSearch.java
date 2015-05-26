
package org.diacomp.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PublicationSearch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PublicationSearch">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.diacomp.org/webservices/}ObjectSearch">
 *       &lt;sequence>
 *         &lt;element name="InvestigatorID" type="{http://www.diacomp.org/webservices/}ID"/>
 *         &lt;element name="JournalID" type="{http://www.diacomp.org/webservices/}ID"/>
 *         &lt;element name="ExperimentID" type="{http://www.diacomp.org/webservices/}ID"/>
 *         &lt;element name="StrainID" type="{http://www.diacomp.org/webservices/}ID"/>
 *         &lt;element name="Type" type="{http://www.diacomp.org/webservices/}PublicationType"/>
 *         &lt;element name="Status" type="{http://www.diacomp.org/webservices/}PublicationStatus"/>
 *         &lt;element name="Keywords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PubYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="PubMedID" type="{http://www.diacomp.org/webservices/}ID"/>
 *         &lt;element name="ModelTypeID" type="{http://www.diacomp.org/webservices/}ID"/>
 *         &lt;element name="AnatomicSiteID" type="{http://www.diacomp.org/webservices/}ID"/>
 *         &lt;element name="CatalogGroupID" type="{http://www.diacomp.org/webservices/}ID"/>
 *         &lt;element name="CreatedFromDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CreatedToDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OrderBy" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *         &lt;element name="RowCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsBreaking" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublicationSearch", propOrder = {
    "investigatorID",
    "journalID",
    "experimentID",
    "strainID",
    "type",
    "status",
    "keywords",
    "pubYear",
    "pubMedID",
    "modelTypeID",
    "anatomicSiteID",
    "catalogGroupID",
    "createdFromDate",
    "createdToDate",
    "orderBy",
    "rowCount",
    "isBreaking"
})
public class PublicationSearch
    extends ObjectSearch
{

    @XmlElement(name = "InvestigatorID", required = true)
    protected ID investigatorID;
    @XmlElement(name = "JournalID", required = true)
    protected ID journalID;
    @XmlElement(name = "ExperimentID", required = true)
    protected ID experimentID;
    @XmlElement(name = "StrainID", required = true)
    protected ID strainID;
    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected PublicationType type;
    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "string")
    protected PublicationStatus status;
    @XmlElement(name = "Keywords")
    protected String keywords;
    @XmlElement(name = "PubYear")
    protected short pubYear;
    @XmlElement(name = "PubMedID", required = true)
    protected ID pubMedID;
    @XmlElement(name = "ModelTypeID", required = true)
    protected ID modelTypeID;
    @XmlElement(name = "AnatomicSiteID", required = true)
    protected ID anatomicSiteID;
    @XmlElement(name = "CatalogGroupID", required = true)
    protected ID catalogGroupID;
    @XmlElement(name = "CreatedFromDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdFromDate;
    @XmlElement(name = "CreatedToDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdToDate;
    @XmlElement(name = "OrderBy")
    @XmlSchemaType(name = "unsignedByte")
    protected short orderBy;
    @XmlElement(name = "RowCount")
    protected int rowCount;
    @XmlElement(name = "IsBreaking")
    protected boolean isBreaking;

    /**
     * Gets the value of the investigatorID property.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getInvestigatorID() {
        return investigatorID;
    }

    /**
     * Sets the value of the investigatorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setInvestigatorID(ID value) {
        this.investigatorID = value;
    }

    /**
     * Gets the value of the journalID property.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getJournalID() {
        return journalID;
    }

    /**
     * Sets the value of the journalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setJournalID(ID value) {
        this.journalID = value;
    }

    /**
     * Gets the value of the experimentID property.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getExperimentID() {
        return experimentID;
    }

    /**
     * Sets the value of the experimentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setExperimentID(ID value) {
        this.experimentID = value;
    }

    /**
     * Gets the value of the strainID property.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getStrainID() {
        return strainID;
    }

    /**
     * Sets the value of the strainID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setStrainID(ID value) {
        this.strainID = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link PublicationType }
     *     
     */
    public PublicationType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicationType }
     *     
     */
    public void setType(PublicationType value) {
        this.type = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link PublicationStatus }
     *     
     */
    public PublicationStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicationStatus }
     *     
     */
    public void setStatus(PublicationStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the keywords property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * Sets the value of the keywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeywords(String value) {
        this.keywords = value;
    }

    /**
     * Gets the value of the pubYear property.
     * 
     */
    public short getPubYear() {
        return pubYear;
    }

    /**
     * Sets the value of the pubYear property.
     * 
     */
    public void setPubYear(short value) {
        this.pubYear = value;
    }

    /**
     * Gets the value of the pubMedID property.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getPubMedID() {
        return pubMedID;
    }

    /**
     * Sets the value of the pubMedID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setPubMedID(ID value) {
        this.pubMedID = value;
    }

    /**
     * Gets the value of the modelTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getModelTypeID() {
        return modelTypeID;
    }

    /**
     * Sets the value of the modelTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setModelTypeID(ID value) {
        this.modelTypeID = value;
    }

    /**
     * Gets the value of the anatomicSiteID property.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getAnatomicSiteID() {
        return anatomicSiteID;
    }

    /**
     * Sets the value of the anatomicSiteID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setAnatomicSiteID(ID value) {
        this.anatomicSiteID = value;
    }

    /**
     * Gets the value of the catalogGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getCatalogGroupID() {
        return catalogGroupID;
    }

    /**
     * Sets the value of the catalogGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setCatalogGroupID(ID value) {
        this.catalogGroupID = value;
    }

    /**
     * Gets the value of the createdFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedFromDate() {
        return createdFromDate;
    }

    /**
     * Sets the value of the createdFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedFromDate(XMLGregorianCalendar value) {
        this.createdFromDate = value;
    }

    /**
     * Gets the value of the createdToDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedToDate() {
        return createdToDate;
    }

    /**
     * Sets the value of the createdToDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedToDate(XMLGregorianCalendar value) {
        this.createdToDate = value;
    }

    /**
     * Gets the value of the orderBy property.
     * 
     */
    public short getOrderBy() {
        return orderBy;
    }

    /**
     * Sets the value of the orderBy property.
     * 
     */
    public void setOrderBy(short value) {
        this.orderBy = value;
    }

    /**
     * Gets the value of the rowCount property.
     * 
     */
    public int getRowCount() {
        return rowCount;
    }

    /**
     * Sets the value of the rowCount property.
     * 
     */
    public void setRowCount(int value) {
        this.rowCount = value;
    }

    /**
     * Gets the value of the isBreaking property.
     * 
     */
    public boolean isIsBreaking() {
        return isBreaking;
    }

    /**
     * Sets the value of the isBreaking property.
     * 
     */
    public void setIsBreaking(boolean value) {
        this.isBreaking = value;
    }

}
