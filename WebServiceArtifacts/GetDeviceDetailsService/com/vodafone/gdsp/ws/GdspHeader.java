
package com.vodafone.gdsp.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gdspHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gdspHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gdspCredentials" type="{http://ws.gdsp.vodafone.com/}gdspCredentials"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gdspHeader", propOrder = {
    "gdspCredentials"
})
public class GdspHeader {

    @XmlElement(required = true)
    protected GdspCredentials gdspCredentials;

    /**
     * Gets the value of the gdspCredentials property.
     * 
     * @return
     *     possible object is
     *     {@link GdspCredentials }
     *     
     */
    public GdspCredentials getGdspCredentials() {
        return gdspCredentials;
    }

    /**
     * Sets the value of the gdspCredentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link GdspCredentials }
     *     
     */
    public void setGdspCredentials(GdspCredentials value) {
        this.gdspCredentials = value;
    }

}
