
package net.cangooroo.services.ws_2013;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="initAsyncSearchAvailabilityResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "initAsyncSearchAvailabilityResult"
})
@XmlRootElement(name = "initAsyncSearchAvailabilityResponse")
public class InitAsyncSearchAvailabilityResponse {

    protected String initAsyncSearchAvailabilityResult;

    /**
     * Gets the value of the initAsyncSearchAvailabilityResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitAsyncSearchAvailabilityResult() {
        return initAsyncSearchAvailabilityResult;
    }

    /**
     * Sets the value of the initAsyncSearchAvailabilityResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitAsyncSearchAvailabilityResult(String value) {
        this.initAsyncSearchAvailabilityResult = value;
    }

}
