
package com.carrierate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShipmentAddressId" type="{http://carrierate.com/}IntClass" minOccurs="0"/>
 *         &lt;element name="ShipperId" type="{http://carrierate.com/}IntClass" minOccurs="0"/>
 *         &lt;element name="AddressType" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhoneExtention" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsRegistered" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingAddressNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentAddress", propOrder = {
    "shipmentAddressId",
    "shipperId",
    "addressType",
    "street",
    "city",
    "zipCode",
    "state",
    "companyName",
    "phone",
    "fax",
    "contactPerson",
    "phoneExtention",
    "isRegistered",
    "country",
    "addressNumber",
    "billingAddressNumber",
    "sAddress1"
})
public class ShipmentAddress {

    @XmlElement(name = "ShipmentAddressId")
    protected IntClass shipmentAddressId;
    @XmlElement(name = "ShipperId")
    protected IntClass shipperId;
    @XmlElement(name = "AddressType")
    protected boolean addressType;
    @XmlElement(name = "Street")
    protected String street;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "ZipCode")
    protected String zipCode;
    @XmlElement(name = "State")
    protected String state;
    @XmlElement(name = "CompanyName")
    protected String companyName;
    @XmlElement(name = "Phone")
    protected String phone;
    @XmlElement(name = "Fax")
    protected String fax;
    @XmlElement(name = "ContactPerson")
    protected String contactPerson;
    @XmlElement(name = "PhoneExtention")
    protected String phoneExtention;
    @XmlElement(name = "IsRegistered")
    protected int isRegistered;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "AddressNumber")
    protected String addressNumber;
    @XmlElement(name = "BillingAddressNumber")
    protected String billingAddressNumber;
    protected String sAddress1;

    /**
     * Gets the value of the shipmentAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link IntClass }
     *     
     */
    public IntClass getShipmentAddressId() {
        return shipmentAddressId;
    }

    /**
     * Sets the value of the shipmentAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntClass }
     *     
     */
    public void setShipmentAddressId(IntClass value) {
        this.shipmentAddressId = value;
    }

    /**
     * Gets the value of the shipperId property.
     * 
     * @return
     *     possible object is
     *     {@link IntClass }
     *     
     */
    public IntClass getShipperId() {
        return shipperId;
    }

    /**
     * Sets the value of the shipperId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntClass }
     *     
     */
    public void setShipperId(IntClass value) {
        this.shipperId = value;
    }

    /**
     * Gets the value of the addressType property.
     * 
     */
    public boolean isAddressType() {
        return addressType;
    }

    /**
     * Sets the value of the addressType property.
     * 
     */
    public void setAddressType(boolean value) {
        this.addressType = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the zipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCode(String value) {
        this.zipCode = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the contactPerson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPerson() {
        return contactPerson;
    }

    /**
     * Sets the value of the contactPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPerson(String value) {
        this.contactPerson = value;
    }

    /**
     * Gets the value of the phoneExtention property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneExtention() {
        return phoneExtention;
    }

    /**
     * Sets the value of the phoneExtention property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneExtention(String value) {
        this.phoneExtention = value;
    }

    /**
     * Gets the value of the isRegistered property.
     * 
     */
    public int getIsRegistered() {
        return isRegistered;
    }

    /**
     * Sets the value of the isRegistered property.
     * 
     */
    public void setIsRegistered(int value) {
        this.isRegistered = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the addressNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressNumber() {
        return addressNumber;
    }

    /**
     * Sets the value of the addressNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressNumber(String value) {
        this.addressNumber = value;
    }

    /**
     * Gets the value of the billingAddressNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAddressNumber() {
        return billingAddressNumber;
    }

    /**
     * Sets the value of the billingAddressNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAddressNumber(String value) {
        this.billingAddressNumber = value;
    }

    /**
     * Gets the value of the sAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAddress1() {
        return sAddress1;
    }

    /**
     * Sets the value of the sAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAddress1(String value) {
        this.sAddress1 = value;
    }

}
