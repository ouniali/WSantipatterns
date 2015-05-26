
package com.ukmail.services.contracts.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AddReturnWebRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddReturnWebRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.UKMail.com/Services/Contracts/DataContracts}WebRequest">
 *       &lt;sequence>
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BookIn" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CollectionAddress" type="{http://www.UKMail.com/Services/Contracts/DataContracts}AddressWebModel"/>
 *         &lt;element name="CollectionBusinessName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CollectionContactName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CollectionCustomersRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CollectionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CollectionEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CollectionLatestPickup" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CollectionOpenLunchtime" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CollectionSpecialInstructions1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CollectionSpecialInstructions2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CollectionTelephone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CollectionTimeReady" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DeliverySpecialInstructions1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliverySpecialInstructions2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DescriptionOfGoods1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DescriptionOfGoods2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceKey" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddReturnWebRequest", propOrder = {
    "accountNumber",
    "bookIn",
    "collectionAddress",
    "collectionBusinessName",
    "collectionContactName",
    "collectionCustomersRef",
    "collectionDate",
    "collectionEmail",
    "collectionLatestPickup",
    "collectionOpenLunchtime",
    "collectionSpecialInstructions1",
    "collectionSpecialInstructions2",
    "collectionTelephone",
    "collectionTimeReady",
    "deliverySpecialInstructions1",
    "deliverySpecialInstructions2",
    "descriptionOfGoods1",
    "descriptionOfGoods2",
    "serviceKey"
})
@XmlSeeAlso({
    AddSendToThirdPartyWebRequest.class
})
public class AddReturnWebRequest
    extends WebRequest
{

    @XmlElement(name = "AccountNumber", required = true, nillable = true)
    protected String accountNumber;
    @XmlElement(name = "BookIn")
    protected boolean bookIn;
    @XmlElement(name = "CollectionAddress", required = true, nillable = true)
    protected AddressWebModel collectionAddress;
    @XmlElementRef(name = "CollectionBusinessName", namespace = "http://www.UKMail.com/Services/Contracts/DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> collectionBusinessName;
    @XmlElement(name = "CollectionContactName", required = true, nillable = true)
    protected String collectionContactName;
    @XmlElementRef(name = "CollectionCustomersRef", namespace = "http://www.UKMail.com/Services/Contracts/DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> collectionCustomersRef;
    @XmlElement(name = "CollectionDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar collectionDate;
    @XmlElementRef(name = "CollectionEmail", namespace = "http://www.UKMail.com/Services/Contracts/DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> collectionEmail;
    @XmlElement(name = "CollectionLatestPickup", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar collectionLatestPickup;
    @XmlElement(name = "CollectionOpenLunchtime")
    protected boolean collectionOpenLunchtime;
    @XmlElementRef(name = "CollectionSpecialInstructions1", namespace = "http://www.UKMail.com/Services/Contracts/DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> collectionSpecialInstructions1;
    @XmlElementRef(name = "CollectionSpecialInstructions2", namespace = "http://www.UKMail.com/Services/Contracts/DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> collectionSpecialInstructions2;
    @XmlElement(name = "CollectionTelephone", required = true, nillable = true)
    protected String collectionTelephone;
    @XmlElement(name = "CollectionTimeReady", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar collectionTimeReady;
    @XmlElementRef(name = "DeliverySpecialInstructions1", namespace = "http://www.UKMail.com/Services/Contracts/DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deliverySpecialInstructions1;
    @XmlElementRef(name = "DeliverySpecialInstructions2", namespace = "http://www.UKMail.com/Services/Contracts/DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deliverySpecialInstructions2;
    @XmlElementRef(name = "DescriptionOfGoods1", namespace = "http://www.UKMail.com/Services/Contracts/DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descriptionOfGoods1;
    @XmlElementRef(name = "DescriptionOfGoods2", namespace = "http://www.UKMail.com/Services/Contracts/DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descriptionOfGoods2;
    @XmlElement(name = "ServiceKey")
    protected int serviceKey;

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
     * Gets the value of the bookIn property.
     * 
     */
    public boolean isBookIn() {
        return bookIn;
    }

    /**
     * Sets the value of the bookIn property.
     * 
     */
    public void setBookIn(boolean value) {
        this.bookIn = value;
    }

    /**
     * Gets the value of the collectionAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressWebModel }
     *     
     */
    public AddressWebModel getCollectionAddress() {
        return collectionAddress;
    }

    /**
     * Sets the value of the collectionAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressWebModel }
     *     
     */
    public void setCollectionAddress(AddressWebModel value) {
        this.collectionAddress = value;
    }

    /**
     * Gets the value of the collectionBusinessName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCollectionBusinessName() {
        return collectionBusinessName;
    }

    /**
     * Sets the value of the collectionBusinessName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCollectionBusinessName(JAXBElement<String> value) {
        this.collectionBusinessName = value;
    }

    /**
     * Gets the value of the collectionContactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionContactName() {
        return collectionContactName;
    }

    /**
     * Sets the value of the collectionContactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionContactName(String value) {
        this.collectionContactName = value;
    }

    /**
     * Gets the value of the collectionCustomersRef property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCollectionCustomersRef() {
        return collectionCustomersRef;
    }

    /**
     * Sets the value of the collectionCustomersRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCollectionCustomersRef(JAXBElement<String> value) {
        this.collectionCustomersRef = value;
    }

    /**
     * Gets the value of the collectionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCollectionDate() {
        return collectionDate;
    }

    /**
     * Sets the value of the collectionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCollectionDate(XMLGregorianCalendar value) {
        this.collectionDate = value;
    }

    /**
     * Gets the value of the collectionEmail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCollectionEmail() {
        return collectionEmail;
    }

    /**
     * Sets the value of the collectionEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCollectionEmail(JAXBElement<String> value) {
        this.collectionEmail = value;
    }

    /**
     * Gets the value of the collectionLatestPickup property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCollectionLatestPickup() {
        return collectionLatestPickup;
    }

    /**
     * Sets the value of the collectionLatestPickup property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCollectionLatestPickup(XMLGregorianCalendar value) {
        this.collectionLatestPickup = value;
    }

    /**
     * Gets the value of the collectionOpenLunchtime property.
     * 
     */
    public boolean isCollectionOpenLunchtime() {
        return collectionOpenLunchtime;
    }

    /**
     * Sets the value of the collectionOpenLunchtime property.
     * 
     */
    public void setCollectionOpenLunchtime(boolean value) {
        this.collectionOpenLunchtime = value;
    }

    /**
     * Gets the value of the collectionSpecialInstructions1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCollectionSpecialInstructions1() {
        return collectionSpecialInstructions1;
    }

    /**
     * Sets the value of the collectionSpecialInstructions1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCollectionSpecialInstructions1(JAXBElement<String> value) {
        this.collectionSpecialInstructions1 = value;
    }

    /**
     * Gets the value of the collectionSpecialInstructions2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCollectionSpecialInstructions2() {
        return collectionSpecialInstructions2;
    }

    /**
     * Sets the value of the collectionSpecialInstructions2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCollectionSpecialInstructions2(JAXBElement<String> value) {
        this.collectionSpecialInstructions2 = value;
    }

    /**
     * Gets the value of the collectionTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionTelephone() {
        return collectionTelephone;
    }

    /**
     * Sets the value of the collectionTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionTelephone(String value) {
        this.collectionTelephone = value;
    }

    /**
     * Gets the value of the collectionTimeReady property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCollectionTimeReady() {
        return collectionTimeReady;
    }

    /**
     * Sets the value of the collectionTimeReady property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCollectionTimeReady(XMLGregorianCalendar value) {
        this.collectionTimeReady = value;
    }

    /**
     * Gets the value of the deliverySpecialInstructions1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeliverySpecialInstructions1() {
        return deliverySpecialInstructions1;
    }

    /**
     * Sets the value of the deliverySpecialInstructions1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeliverySpecialInstructions1(JAXBElement<String> value) {
        this.deliverySpecialInstructions1 = value;
    }

    /**
     * Gets the value of the deliverySpecialInstructions2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeliverySpecialInstructions2() {
        return deliverySpecialInstructions2;
    }

    /**
     * Sets the value of the deliverySpecialInstructions2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeliverySpecialInstructions2(JAXBElement<String> value) {
        this.deliverySpecialInstructions2 = value;
    }

    /**
     * Gets the value of the descriptionOfGoods1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescriptionOfGoods1() {
        return descriptionOfGoods1;
    }

    /**
     * Sets the value of the descriptionOfGoods1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescriptionOfGoods1(JAXBElement<String> value) {
        this.descriptionOfGoods1 = value;
    }

    /**
     * Gets the value of the descriptionOfGoods2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescriptionOfGoods2() {
        return descriptionOfGoods2;
    }

    /**
     * Sets the value of the descriptionOfGoods2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescriptionOfGoods2(JAXBElement<String> value) {
        this.descriptionOfGoods2 = value;
    }

    /**
     * Gets the value of the serviceKey property.
     * 
     */
    public int getServiceKey() {
        return serviceKey;
    }

    /**
     * Sets the value of the serviceKey property.
     * 
     */
    public void setServiceKey(int value) {
        this.serviceKey = value;
    }

}
