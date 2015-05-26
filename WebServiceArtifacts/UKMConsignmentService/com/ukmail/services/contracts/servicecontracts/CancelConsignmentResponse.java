
package com.ukmail.services.contracts.servicecontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.ukmail.services.contracts.datacontracts.UKMCancelConsignmentWebResponse;


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
 *         &lt;element name="CancelConsignmentResult" type="{http://www.UKMail.com/Services/Contracts/DataContracts}UKMCancelConsignmentWebResponse" minOccurs="0"/>
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
    "cancelConsignmentResult"
})
@XmlRootElement(name = "CancelConsignmentResponse")
public class CancelConsignmentResponse {

    @XmlElementRef(name = "CancelConsignmentResult", namespace = "http://www.UKMail.com/Services/Contracts/ServiceContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<UKMCancelConsignmentWebResponse> cancelConsignmentResult;

    /**
     * Gets the value of the cancelConsignmentResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UKMCancelConsignmentWebResponse }{@code >}
     *     
     */
    public JAXBElement<UKMCancelConsignmentWebResponse> getCancelConsignmentResult() {
        return cancelConsignmentResult;
    }

    /**
     * Sets the value of the cancelConsignmentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UKMCancelConsignmentWebResponse }{@code >}
     *     
     */
    public void setCancelConsignmentResult(JAXBElement<UKMCancelConsignmentWebResponse> value) {
        this.cancelConsignmentResult = value;
    }

}
