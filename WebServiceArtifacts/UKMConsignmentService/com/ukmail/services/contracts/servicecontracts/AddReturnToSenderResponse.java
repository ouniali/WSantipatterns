
package com.ukmail.services.contracts.servicecontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.ukmail.services.contracts.datacontracts.UKMAddReturnToSenderWebResponse;


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
 *         &lt;element name="AddReturnToSenderResult" type="{http://www.UKMail.com/Services/Contracts/DataContracts}UKMAddReturnToSenderWebResponse" minOccurs="0"/>
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
    "addReturnToSenderResult"
})
@XmlRootElement(name = "AddReturnToSenderResponse")
public class AddReturnToSenderResponse {

    @XmlElementRef(name = "AddReturnToSenderResult", namespace = "http://www.UKMail.com/Services/Contracts/ServiceContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<UKMAddReturnToSenderWebResponse> addReturnToSenderResult;

    /**
     * Gets the value of the addReturnToSenderResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UKMAddReturnToSenderWebResponse }{@code >}
     *     
     */
    public JAXBElement<UKMAddReturnToSenderWebResponse> getAddReturnToSenderResult() {
        return addReturnToSenderResult;
    }

    /**
     * Sets the value of the addReturnToSenderResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UKMAddReturnToSenderWebResponse }{@code >}
     *     
     */
    public void setAddReturnToSenderResult(JAXBElement<UKMAddReturnToSenderWebResponse> value) {
        this.addReturnToSenderResult = value;
    }

}
