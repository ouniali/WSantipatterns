
package com.ukmail.services.contracts.servicecontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.ukmail.services.contracts.datacontracts.UKMAddSendToThirdPartyWebResponse;


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
 *         &lt;element name="AddSendToThirdPartyResult" type="{http://www.UKMail.com/Services/Contracts/DataContracts}UKMAddSendToThirdPartyWebResponse" minOccurs="0"/>
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
    "addSendToThirdPartyResult"
})
@XmlRootElement(name = "AddSendToThirdPartyResponse")
public class AddSendToThirdPartyResponse {

    @XmlElementRef(name = "AddSendToThirdPartyResult", namespace = "http://www.UKMail.com/Services/Contracts/ServiceContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<UKMAddSendToThirdPartyWebResponse> addSendToThirdPartyResult;

    /**
     * Gets the value of the addSendToThirdPartyResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UKMAddSendToThirdPartyWebResponse }{@code >}
     *     
     */
    public JAXBElement<UKMAddSendToThirdPartyWebResponse> getAddSendToThirdPartyResult() {
        return addSendToThirdPartyResult;
    }

    /**
     * Sets the value of the addSendToThirdPartyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UKMAddSendToThirdPartyWebResponse }{@code >}
     *     
     */
    public void setAddSendToThirdPartyResult(JAXBElement<UKMAddSendToThirdPartyWebResponse> value) {
        this.addSendToThirdPartyResult = value;
    }

}
