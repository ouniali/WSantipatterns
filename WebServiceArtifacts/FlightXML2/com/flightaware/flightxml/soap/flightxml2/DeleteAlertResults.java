
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeleteAlertResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeleteAlertResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeleteAlertResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteAlertResults", propOrder = {
    "deleteAlertResult"
})
public class DeleteAlertResults {

    @XmlElement(name = "DeleteAlertResult")
    protected int deleteAlertResult;

    /**
     * Gets the value of the deleteAlertResult property.
     * 
     */
    public int getDeleteAlertResult() {
        return deleteAlertResult;
    }

    /**
     * Sets the value of the deleteAlertResult property.
     * 
     */
    public void setDeleteAlertResult(int value) {
        this.deleteAlertResult = value;
    }

}
