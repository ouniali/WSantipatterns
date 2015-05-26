
package com.ukmail.services.contracts.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddSendToThirdPartyWebRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddSendToThirdPartyWebRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.UKMail.com/Services/Contracts/DataContracts}AddReturnWebRequest">
 *       &lt;sequence>
 *         &lt;element name="DeliveryAddress" type="{http://www.UKMail.com/Services/Contracts/DataContracts}AddressWebModel"/>
 *         &lt;element name="DeliveryBusinessName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryContactName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryTelephone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddSendToThirdPartyWebRequest", propOrder = {
    "deliveryAddress",
    "deliveryBusinessName",
    "deliveryContactName",
    "deliveryEmail",
    "deliveryTelephone"
})
public class AddSendToThirdPartyWebRequest
    extends AddReturnWebRequest
{

    @XmlElement(name = "DeliveryAddress", required = true, nillable = true)
    protected AddressWebModel deliveryAddress;
    @XmlElementRef(name = "DeliveryBusinessName", namespace = "http://www.UKMail.com/Services/Contracts/DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deliveryBusinessName;
    @XmlElementRef(name = "DeliveryContactName", namespace = "http://www.UKMail.com/Services/Contracts/DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deliveryContactName;
    @XmlElementRef(name = "DeliveryEmail", namespace = "http://www.UKMail.com/Services/Contracts/DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deliveryEmail;
    @XmlElement(name = "DeliveryTelephone", required = true, nillable = true)
    protected String deliveryTelephone;

    /**
     * Gets the value of the deliveryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressWebModel }
     *     
     */
    public AddressWebModel getDeliveryAddress() {
        return deliveryAddress;
    }

    /**
     * Sets the value of the deliveryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressWebModel }
     *     
     */
    public void setDeliveryAddress(AddressWebModel value) {
        this.deliveryAddress = value;
    }

    /**
     * Gets the value of the deliveryBusinessName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeliveryBusinessName() {
        return deliveryBusinessName;
    }

    /**
     * Sets the value of the deliveryBusinessName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeliveryBusinessName(JAXBElement<String> value) {
        this.deliveryBusinessName = value;
    }

    /**
     * Gets the value of the deliveryContactName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeliveryContactName() {
        return deliveryContactName;
    }

    /**
     * Sets the value of the deliveryContactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeliveryContactName(JAXBElement<String> value) {
        this.deliveryContactName = value;
    }

    /**
     * Gets the value of the deliveryEmail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeliveryEmail() {
        return deliveryEmail;
    }

    /**
     * Sets the value of the deliveryEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeliveryEmail(JAXBElement<String> value) {
        this.deliveryEmail = value;
    }

    /**
     * Gets the value of the deliveryTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryTelephone() {
        return deliveryTelephone;
    }

    /**
     * Sets the value of the deliveryTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryTelephone(String value) {
        this.deliveryTelephone = value;
    }

}
