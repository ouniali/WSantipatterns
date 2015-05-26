
package com.tnt.resi.services;

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
 *         &lt;element name="getPDFLabelReturn" type="{http://services.resi.tnt.com}Document"/>
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
    "getPDFLabelReturn"
})
@XmlRootElement(name = "getPDFLabelResponse")
public class GetPDFLabelResponse {

    @XmlElement(required = true, nillable = true)
    protected Document getPDFLabelReturn;

    /**
     * Gets the value of the getPDFLabelReturn property.
     * 
     * @return
     *     possible object is
     *     {@link Document }
     *     
     */
    public Document getGetPDFLabelReturn() {
        return getPDFLabelReturn;
    }

    /**
     * Sets the value of the getPDFLabelReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Document }
     *     
     */
    public void setGetPDFLabelReturn(Document value) {
        this.getPDFLabelReturn = value;
    }

}
