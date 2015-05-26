
package net.cangooroo.services.ws_2013;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import hotel.ws_2013.ResponseCancellationPolicy;


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
 *         &lt;element name="getCancellationPoliciesResult" type="{WS_2013.Hotel}ResponseCancellationPolicy" minOccurs="0"/>
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
    "getCancellationPoliciesResult"
})
@XmlRootElement(name = "getCancellationPoliciesResponse")
public class GetCancellationPoliciesResponse {

    protected ResponseCancellationPolicy getCancellationPoliciesResult;

    /**
     * Gets the value of the getCancellationPoliciesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseCancellationPolicy }
     *     
     */
    public ResponseCancellationPolicy getGetCancellationPoliciesResult() {
        return getCancellationPoliciesResult;
    }

    /**
     * Sets the value of the getCancellationPoliciesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseCancellationPolicy }
     *     
     */
    public void setGetCancellationPoliciesResult(ResponseCancellationPolicy value) {
        this.getCancellationPoliciesResult = value;
    }

}
