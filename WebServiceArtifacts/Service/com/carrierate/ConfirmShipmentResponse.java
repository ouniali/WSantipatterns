
package com.carrierate;

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
 *         &lt;element name="ConfirmShipmentResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "confirmShipmentResult"
})
@XmlRootElement(name = "ConfirmShipmentResponse")
public class ConfirmShipmentResponse {

    @XmlElement(name = "ConfirmShipmentResult")
    protected String confirmShipmentResult;

    /**
     * Gets the value of the confirmShipmentResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmShipmentResult() {
        return confirmShipmentResult;
    }

    /**
     * Sets the value of the confirmShipmentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmShipmentResult(String value) {
        this.confirmShipmentResult = value;
    }

}
