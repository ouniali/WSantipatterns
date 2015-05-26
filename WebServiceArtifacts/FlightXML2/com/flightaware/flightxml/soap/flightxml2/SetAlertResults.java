
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SetAlertResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetAlertResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SetAlertResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetAlertResults", propOrder = {
    "setAlertResult"
})
public class SetAlertResults {

    @XmlElement(name = "SetAlertResult")
    protected int setAlertResult;

    /**
     * Gets the value of the setAlertResult property.
     * 
     */
    public int getSetAlertResult() {
        return setAlertResult;
    }

    /**
     * Sets the value of the setAlertResult property.
     * 
     */
    public void setSetAlertResult(int value) {
        this.setAlertResult = value;
    }

}
