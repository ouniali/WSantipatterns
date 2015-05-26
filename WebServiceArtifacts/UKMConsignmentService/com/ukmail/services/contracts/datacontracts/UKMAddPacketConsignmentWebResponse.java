
package com.ukmail.services.contracts.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfbase64Binary;


/**
 * <p>Java class for UKMAddPacketConsignmentWebResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UKMAddPacketConsignmentWebResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.UKMail.com/Services/Contracts/DataContracts}UKMWebResponse">
 *       &lt;sequence>
 *         &lt;element name="ConsignmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Labels" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfbase64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UKMAddPacketConsignmentWebResponse", propOrder = {
    "consignmentNumber",
    "labels"
})
public class UKMAddPacketConsignmentWebResponse
    extends UKMWebResponse
{

    @XmlElementRef(name = "ConsignmentNumber", namespace = "http://www.UKMail.com/Services/Contracts/DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> consignmentNumber;
    @XmlElementRef(name = "Labels", namespace = "http://www.UKMail.com/Services/Contracts/DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfbase64Binary> labels;

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

    /**
     * Gets the value of the labels property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfbase64Binary }{@code >}
     *     
     */
    public JAXBElement<ArrayOfbase64Binary> getLabels() {
        return labels;
    }

    /**
     * Sets the value of the labels property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfbase64Binary }{@code >}
     *     
     */
    public void setLabels(JAXBElement<ArrayOfbase64Binary> value) {
        this.labels = value;
    }

}
