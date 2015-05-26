
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FilingDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilingDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="FileUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Header" type="{http://www.xignite.com/services/}SECHeader" minOccurs="0"/>
 *         &lt;element name="Documents" type="{http://www.xignite.com/services/}ArrayOfDocument" minOccurs="0"/>
 *         &lt;element name="ContentIfFormatWasInvalid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilingDetails", propOrder = {
    "fileUrl",
    "header",
    "documents",
    "contentIfFormatWasInvalid"
})
public class FilingDetails
    extends Common
{

    @XmlElement(name = "FileUrl")
    protected String fileUrl;
    @XmlElement(name = "Header")
    protected SECHeader header;
    @XmlElement(name = "Documents")
    protected ArrayOfDocument documents;
    @XmlElement(name = "ContentIfFormatWasInvalid")
    protected String contentIfFormatWasInvalid;

    /**
     * Gets the value of the fileUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileUrl() {
        return fileUrl;
    }

    /**
     * Sets the value of the fileUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileUrl(String value) {
        this.fileUrl = value;
    }

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link SECHeader }
     *     
     */
    public SECHeader getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link SECHeader }
     *     
     */
    public void setHeader(SECHeader value) {
        this.header = value;
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
     * Gets the value of the contentIfFormatWasInvalid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentIfFormatWasInvalid() {
        return contentIfFormatWasInvalid;
    }

    /**
     * Sets the value of the contentIfFormatWasInvalid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentIfFormatWasInvalid(String value) {
        this.contentIfFormatWasInvalid = value;
    }

}
