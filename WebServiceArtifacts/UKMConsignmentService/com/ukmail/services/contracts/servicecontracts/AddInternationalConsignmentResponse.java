
package com.ukmail.services.contracts.servicecontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.ukmail.services.contracts.datacontracts.UKMAddInternationalConsignmentWebResponse;


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
 *         &lt;element name="AddInternationalConsignmentResult" type="{http://www.UKMail.com/Services/Contracts/DataContracts}UKMAddInternationalConsignmentWebResponse" minOccurs="0"/>
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
    "addInternationalConsignmentResult"
})
@XmlRootElement(name = "AddInternationalConsignmentResponse")
public class AddInternationalConsignmentResponse {

    @XmlElementRef(name = "AddInternationalConsignmentResult", namespace = "http://www.UKMail.com/Services/Contracts/ServiceContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<UKMAddInternationalConsignmentWebResponse> addInternationalConsignmentResult;

    /**
     * Gets the value of the addInternationalConsignmentResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UKMAddInternationalConsignmentWebResponse }{@code >}
     *     
     */
    public JAXBElement<UKMAddInternationalConsignmentWebResponse> getAddInternationalConsignmentResult() {
        return addInternationalConsignmentResult;
    }

    /**
     * Sets the value of the addInternationalConsignmentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UKMAddInternationalConsignmentWebResponse }{@code >}
     *     
     */
    public void setAddInternationalConsignmentResult(JAXBElement<UKMAddInternationalConsignmentWebResponse> value) {
        this.addInternationalConsignmentResult = value;
    }

}
