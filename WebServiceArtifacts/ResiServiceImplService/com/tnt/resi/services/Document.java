
package com.tnt.resi.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Document complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Document">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="binaryDocument" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="documentCorrect" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="outputString" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "binaryDocument",
    "documentCorrect",
    "outputString"
})
public class Document {

    @XmlElement(required = true)
    protected byte[] binaryDocument;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean documentCorrect;
    @XmlElement(required = true, nillable = true)
    protected String outputString;

    /**
     * Gets the value of the binaryDocument property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBinaryDocument() {
        return binaryDocument;
    }

    /**
     * Sets the value of the binaryDocument property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setBinaryDocument(byte[] value) {
        this.binaryDocument = value;
    }

    /**
     * Gets the value of the documentCorrect property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDocumentCorrect() {
        return documentCorrect;
    }

    /**
     * Sets the value of the documentCorrect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDocumentCorrect(Boolean value) {
        this.documentCorrect = value;
    }

    /**
     * Gets the value of the outputString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputString() {
        return outputString;
    }

    /**
     * Sets the value of the outputString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputString(String value) {
        this.outputString = value;
    }

}
