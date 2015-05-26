
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MasterDocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MasterDocument">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FileType" type="{http://www.xignite.com/services/}FileTypes"/>
 *         &lt;element name="Url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XMLSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FilingUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FilingId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MasterDocument", propOrder = {
    "date",
    "type",
    "description",
    "fileName",
    "fileType",
    "url",
    "xmlSource",
    "filingUrl",
    "filingId"
})
public class MasterDocument
    extends Common
{

    @XmlElement(name = "Date")
    protected String date;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "FileName")
    protected String fileName;
    @XmlElement(name = "FileType", required = true)
    @XmlSchemaType(name = "string")
    protected FileTypes fileType;
    @XmlElement(name = "Url")
    protected String url;
    @XmlElement(name = "XMLSource")
    protected String xmlSource;
    @XmlElement(name = "FilingUrl")
    protected String filingUrl;
    @XmlElement(name = "FilingId")
    protected int filingId;

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
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
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the fileType property.
     * 
     * @return
     *     possible object is
     *     {@link FileTypes }
     *     
     */
    public FileTypes getFileType() {
        return fileType;
    }

    /**
     * Sets the value of the fileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileTypes }
     *     
     */
    public void setFileType(FileTypes value) {
        this.fileType = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the xmlSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXMLSource() {
        return xmlSource;
    }

    /**
     * Sets the value of the xmlSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXMLSource(String value) {
        this.xmlSource = value;
    }

    /**
     * Gets the value of the filingUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilingUrl() {
        return filingUrl;
    }

    /**
     * Sets the value of the filingUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilingUrl(String value) {
        this.filingUrl = value;
    }

    /**
     * Gets the value of the filingId property.
     * 
     */
    public int getFilingId() {
        return filingId;
    }

    /**
     * Sets the value of the filingId property.
     * 
     */
    public void setFilingId(int value) {
        this.filingId = value;
    }

}
