
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReadDocumentResult" type="{http://www.xignite.com/services/}File" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "readDocumentResult"
})
@XmlRootElement(name = "ReadDocumentResponse")
public class ReadDocumentResponse {

    @XmlElement(name = "ReadDocumentResult")
    protected File readDocumentResult;

    /**
     * Gets the value of the readDocumentResult property.
     * 
     * @return
     *     possible object is
     *     {@link File }
     *     
     */
    public File getReadDocumentResult() {
        return readDocumentResult;
    }

    /**
     * Sets the value of the readDocumentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link File }
     *     
     */
    public void setReadDocumentResult(File value) {
        this.readDocumentResult = value;
    }

}
