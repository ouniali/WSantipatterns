
package com.ukmail.services.contracts.servicecontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.ukmail.services.contracts.datacontracts.UKMCancelReturnWebResponse;


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
 *         &lt;element name="CancelReturnResult" type="{http://www.UKMail.com/Services/Contracts/DataContracts}UKMCancelReturnWebResponse" minOccurs="0"/>
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
    "cancelReturnResult"
})
@XmlRootElement(name = "CancelReturnResponse")
public class CancelReturnResponse {

    @XmlElementRef(name = "CancelReturnResult", namespace = "http://www.UKMail.com/Services/Contracts/ServiceContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<UKMCancelReturnWebResponse> cancelReturnResult;

    /**
     * Gets the value of the cancelReturnResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UKMCancelReturnWebResponse }{@code >}
     *     
     */
    public JAXBElement<UKMCancelReturnWebResponse> getCancelReturnResult() {
        return cancelReturnResult;
    }

    /**
     * Sets the value of the cancelReturnResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UKMCancelReturnWebResponse }{@code >}
     *     
     */
    public void setCancelReturnResult(JAXBElement<UKMCancelReturnWebResponse> value) {
        this.cancelReturnResult = value;
    }

}
