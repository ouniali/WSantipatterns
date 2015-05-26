
package com.ukmail.services.contracts.servicecontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.ukmail.services.contracts.datacontracts.UKMAddPacketConsignmentWebResponse;


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
 *         &lt;element name="AddPacketConsignmentResult" type="{http://www.UKMail.com/Services/Contracts/DataContracts}UKMAddPacketConsignmentWebResponse" minOccurs="0"/>
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
    "addPacketConsignmentResult"
})
@XmlRootElement(name = "AddPacketConsignmentResponse")
public class AddPacketConsignmentResponse {

    @XmlElementRef(name = "AddPacketConsignmentResult", namespace = "http://www.UKMail.com/Services/Contracts/ServiceContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<UKMAddPacketConsignmentWebResponse> addPacketConsignmentResult;

    /**
     * Gets the value of the addPacketConsignmentResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UKMAddPacketConsignmentWebResponse }{@code >}
     *     
     */
    public JAXBElement<UKMAddPacketConsignmentWebResponse> getAddPacketConsignmentResult() {
        return addPacketConsignmentResult;
    }

    /**
     * Sets the value of the addPacketConsignmentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UKMAddPacketConsignmentWebResponse }{@code >}
     *     
     */
    public void setAddPacketConsignmentResult(JAXBElement<UKMAddPacketConsignmentWebResponse> value) {
        this.addPacketConsignmentResult = value;
    }

}
