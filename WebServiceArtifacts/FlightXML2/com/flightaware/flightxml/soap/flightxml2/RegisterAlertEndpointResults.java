
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegisterAlertEndpointResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegisterAlertEndpointResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RegisterAlertEndpointResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisterAlertEndpointResults", propOrder = {
    "registerAlertEndpointResult"
})
public class RegisterAlertEndpointResults {

    @XmlElement(name = "RegisterAlertEndpointResult")
    protected int registerAlertEndpointResult;

    /**
     * Gets the value of the registerAlertEndpointResult property.
     * 
     */
    public int getRegisterAlertEndpointResult() {
        return registerAlertEndpointResult;
    }

    /**
     * Sets the value of the registerAlertEndpointResult property.
     * 
     */
    public void setRegisterAlertEndpointResult(int value) {
        this.registerAlertEndpointResult = value;
    }

}
