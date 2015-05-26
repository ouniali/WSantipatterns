
package com.channeladvisor.api.webservices;

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
 *         &lt;element name="SubmitOrderShipmentListResult" type="{http://api.channeladvisor.com/webservices/}APIResultOfArrayOfShipmentResponse" minOccurs="0"/>
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
    "submitOrderShipmentListResult"
})
@XmlRootElement(name = "SubmitOrderShipmentListResponse")
public class SubmitOrderShipmentListResponse {

    @XmlElement(name = "SubmitOrderShipmentListResult")
    protected APIResultOfArrayOfShipmentResponse submitOrderShipmentListResult;

    /**
     * Gets the value of the submitOrderShipmentListResult property.
     * 
     * @return
     *     possible object is
     *     {@link APIResultOfArrayOfShipmentResponse }
     *     
     */
    public APIResultOfArrayOfShipmentResponse getSubmitOrderShipmentListResult() {
        return submitOrderShipmentListResult;
    }

    /**
     * Sets the value of the submitOrderShipmentListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link APIResultOfArrayOfShipmentResponse }
     *     
     */
    public void setSubmitOrderShipmentListResult(APIResultOfArrayOfShipmentResponse value) {
        this.submitOrderShipmentListResult = value;
    }

}
