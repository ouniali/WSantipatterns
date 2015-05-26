
package com.ukmail.services.contracts.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UKMAddSendToThirdPartyWebResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UKMAddSendToThirdPartyWebResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.UKMail.com/Services/Contracts/DataContracts}UKMWebResponse">
 *       &lt;sequence>
 *         &lt;element name="ConsignmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UKMAddSendToThirdPartyWebResponse", propOrder = {
    "consignmentNumber"
})
public class UKMAddSendToThirdPartyWebResponse
    extends UKMWebResponse
{

    @XmlElementRef(name = "ConsignmentNumber", namespace = "http://www.UKMail.com/Services/Contracts/DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> consignmentNumber;

    /**
     * Gets the value of the consignmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConsignmentNumber() {
        return consignmentNumber;
    }

    /**
     * Sets the value of the consignmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConsignmentNumber(JAXBElement<String> value) {
        this.consignmentNumber = value;
    }

}
