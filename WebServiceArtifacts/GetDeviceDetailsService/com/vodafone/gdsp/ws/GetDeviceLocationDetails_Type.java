
package com.vodafone.gdsp.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDeviceLocationDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDeviceLocationDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="selectedImsi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDeviceLocationDetails", propOrder = {
    "selectedImsi"
})
public class GetDeviceLocationDetails_Type {

    @XmlElement(required = true)
    protected String selectedImsi;

    /**
     * Gets the value of the selectedImsi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectedImsi() {
        return selectedImsi;
    }

    /**
     * Sets the value of the selectedImsi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectedImsi(String value) {
        this.selectedImsi = value;
    }

}
