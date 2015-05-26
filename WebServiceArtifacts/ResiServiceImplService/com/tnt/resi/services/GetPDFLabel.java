
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
 *         &lt;element name="inputXml" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "inputXml"
})
@XmlRootElement(name = "getPDFLabel")
public class GetPDFLabel {

    @XmlElement(required = true, nillable = true)
    protected String inputXml;

    /**
     * Gets the value of the inputXml property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputXml() {
        return inputXml;
    }

    /**
     * Sets the value of the inputXml property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputXml(String value) {
        this.inputXml = value;
    }

}
