
package com.digikey.services.searchws;

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
 *         &lt;element name="SystemAvailabilityCheckResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "systemAvailabilityCheckResult"
})
@XmlRootElement(name = "SystemAvailabilityCheckResponse")
public class SystemAvailabilityCheckResponse {

    @XmlElement(name = "SystemAvailabilityCheckResult")
    protected boolean systemAvailabilityCheckResult;

    /**
     * Gets the value of the systemAvailabilityCheckResult property.
     * 
     */
    public boolean isSystemAvailabilityCheckResult() {
        return systemAvailabilityCheckResult;
    }

    /**
     * Sets the value of the systemAvailabilityCheckResult property.
     * 
     */
    public void setSystemAvailabilityCheckResult(boolean value) {
        this.systemAvailabilityCheckResult = value;
    }

}
