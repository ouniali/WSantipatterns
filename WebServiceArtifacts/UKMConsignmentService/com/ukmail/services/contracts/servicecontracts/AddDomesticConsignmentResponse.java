
package com.ukmail.services.contracts.servicecontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.ukmail.services.contracts.datacontracts.UKMAddDomesticConsignmentWebResponse;


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
 *         &lt;element name="AddDomesticConsignmentResult" type="{http://www.UKMail.com/Services/Contracts/DataContracts}UKMAddDomesticConsignmentWebResponse" minOccurs="0"/>
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
    "addDomesticConsignmentResult"
})
@XmlRootElement(name = "AddDomesticConsignmentResponse")
public class AddDomesticConsignmentResponse {

    @XmlElementRef(name = "AddDomesticConsignmentResult", namespace = "http://www.UKMail.com/Services/Contracts/ServiceContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<UKMAddDomesticConsignmentWebResponse> addDomesticConsignmentResult;

    /**
     * Gets the value of the addDomesticConsignmentResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UKMAddDomesticConsignmentWebResponse }{@code >}
     *     
     */
    public JAXBElement<UKMAddDomesticConsignmentWebResponse> getAddDomesticConsignmentResult() {
        return addDomesticConsignmentResult;
    }

    /**
     * Sets the value of the addDomesticConsignmentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UKMAddDomesticConsignmentWebResponse }{@code >}
     *     
     */
    public void setAddDomesticConsignmentResult(JAXBElement<UKMAddDomesticConsignmentWebResponse> value) {
        this.addDomesticConsignmentResult = value;
    }

}
