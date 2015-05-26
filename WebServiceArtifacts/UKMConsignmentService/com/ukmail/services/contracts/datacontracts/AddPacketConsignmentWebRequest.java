
package com.ukmail.services.contracts.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddPacketConsignmentWebRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddPacketConsignmentWebRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.UKMail.com/Services/Contracts/DataContracts}WebRequest">
 *       &lt;sequence>
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CollectionJobNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ContactName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BusinessName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://www.UKMail.com/Services/Contracts/DataContracts}PacketAddressWebModel"/>
 *         &lt;element name="CustomersRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlternativeRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WeightInGrams" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PacketLength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PacketWidth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PacketHeight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DeliveryMessage1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryMessage2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddPacketConsignmentWebRequest", propOrder = {
    "accountNumber",
    "collectionJobNumber",
    "contactName",
    "businessName",
    "address",
    "customersRef",
    "alternativeRef",
    "weightInGrams",
    "packetLength",
    "packetWidth",
    "packetHeight",
    "deliveryMessage1",
    "deliveryMessage2"
})
public class AddPacketConsignmentWebRequest
    extends WebRequest
{

    @XmlElement(name = "AccountNumber", required = true, nillable = true)
    protected String accountNumber;
    @XmlElement(name = "CollectionJobNumber", required = true, nillable = true)
    protected String collectionJobNumber;
    @XmlElement(name = "ContactName", required = true, nillable = true)
    protected String contactName;
    @XmlElementRef(name = "BusinessName", namespace = "http://www.UKMail.com/Services/Contracts/DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> businessName;
    @XmlElement(name = "Address", required = true, nillable = true)
    protected PacketAddressWebModel address;
    @XmlElementRef(name = "CustomersRef", namespace = "http://www.UKMail.com/Services/Contracts/DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customersRef;
    @XmlElementRef(name = "AlternativeRef", namespace = "http://www.UKMail.com/Services/Contracts/DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> alternativeRef;
    @XmlElementRef(name = "WeightInGrams", namespace = "http://www.UKMail.com/Services/Contracts/DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> weightInGrams;
    @XmlElementRef(name = "PacketLength", namespace = "http://www.UKMail.com/Services/Contracts/DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> packetLength;
    @XmlElementRef(name = "PacketWidth", namespace = "http://www.UKMail.com/Services/Contracts/DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> packetWidth;
    @XmlElementRef(name = "PacketHeight", namespace = "http://www.UKMail.com/Services/Contracts/DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> packetHeight;
    @XmlElementRef(name = "DeliveryMessage1", namespace = "http://www.UKMail.com/Services/Contracts/DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deliveryMessage1;
    @XmlElementRef(name = "DeliveryMessage2", namespace = "http://www.UKMail.com/Services/Contracts/DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deliveryMessage2;

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the collectionJobNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionJobNumber() {
        return collectionJobNumber;
    }

    /**
     * Sets the value of the collectionJobNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionJobNumber(String value) {
        this.collectionJobNumber = value;
    }

    /**
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactName(String value) {
        this.contactName = value;
    }

    /**
     * Gets the value of the businessName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBusinessName() {
        return businessName;
    }

    /**
     * Sets the value of the businessName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBusinessName(JAXBElement<String> value) {
        this.businessName = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link PacketAddressWebModel }
     *     
     */
    public PacketAddressWebModel getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link PacketAddressWebModel }
     *     
     */
    public void setAddress(PacketAddressWebModel value) {
        this.address = value;
    }

    /**
     * Gets the value of the customersRef property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomersRef() {
        return customersRef;
    }

    /**
     * Sets the value of the customersRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomersRef(JAXBElement<String> value) {
        this.customersRef = value;
    }

    /**
     * Gets the value of the alternativeRef property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAlternativeRef() {
        return alternativeRef;
    }

    /**
     * Sets the value of the alternativeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAlternativeRef(JAXBElement<String> value) {
        this.alternativeRef = value;
    }

    /**
     * Gets the value of the weightInGrams property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getWeightInGrams() {
        return weightInGrams;
    }

    /**
     * Sets the value of the weightInGrams property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setWeightInGrams(JAXBElement<Integer> value) {
        this.weightInGrams = value;
    }

    /**
     * Gets the value of the packetLength property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPacketLength() {
        return packetLength;
    }

    /**
     * Sets the value of the packetLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPacketLength(JAXBElement<Integer> value) {
        this.packetLength = value;
    }

    /**
     * Gets the value of the packetWidth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPacketWidth() {
        return packetWidth;
    }

    /**
     * Sets the value of the packetWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPacketWidth(JAXBElement<Integer> value) {
        this.packetWidth = value;
    }

    /**
     * Gets the value of the packetHeight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPacketHeight() {
        return packetHeight;
    }

    /**
     * Sets the value of the packetHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPacketHeight(JAXBElement<Integer> value) {
        this.packetHeight = value;
    }

    /**
     * Gets the value of the deliveryMessage1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeliveryMessage1() {
        return deliveryMessage1;
    }

    /**
     * Sets the value of the deliveryMessage1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeliveryMessage1(JAXBElement<String> value) {
        this.deliveryMessage1 = value;
    }

    /**
     * Gets the value of the deliveryMessage2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeliveryMessage2() {
        return deliveryMessage2;
    }

    /**
     * Sets the value of the deliveryMessage2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeliveryMessage2(JAXBElement<String> value) {
        this.deliveryMessage2 = value;
    }

}
