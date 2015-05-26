
package com.travelport.schema.common_v15_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}BookingTravelerName" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}Email" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}PhoneNumber" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://www.travelport.com/schema/common_v15_0}typeStructuredAddress" minOccurs="0"/>
 *         &lt;element name="EmergencyInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}DeliveryInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}NameRemark" minOccurs="0"/>
 *         &lt;element name="Age" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="DOB" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}CustomizedNameData" minOccurs="0"/>
 *       &lt;/choice>
 *       &lt;attribute name="Key" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *       &lt;attribute name="TravelerType" type="{http://www.travelport.com/schema/common_v15_0}typePTC" />
 *       &lt;attribute name="Gender" type="{http://www.travelport.com/schema/common_v15_0}typeGender" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bookingTravelerName",
    "email",
    "phoneNumber",
    "address",
    "emergencyInfo",
    "deliveryInfo",
    "nameRemark",
    "age",
    "dob",
    "customizedNameData"
})
@XmlRootElement(name = "BookingTravelerInfo")
public class BookingTravelerInfo {

    @XmlElement(name = "BookingTravelerName")
    protected BookingTravelerName bookingTravelerName;
    @XmlElement(name = "Email")
    protected Email email;
    @XmlElement(name = "PhoneNumber")
    protected PhoneNumber phoneNumber;
    @XmlElement(name = "Address")
    protected TypeStructuredAddress address;
    @XmlElement(name = "EmergencyInfo")
    protected String emergencyInfo;
    @XmlElement(name = "DeliveryInfo")
    protected DeliveryInfo deliveryInfo;
    @XmlElement(name = "NameRemark")
    protected NameRemark nameRemark;
    @XmlElement(name = "Age")
    protected BigInteger age;
    @XmlElement(name = "DOB")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dob;
    @XmlElement(name = "CustomizedNameData")
    protected CustomizedNameData customizedNameData;
    @XmlAttribute(name = "Key")
    protected String key;
    @XmlAttribute(name = "TravelerType")
    protected String travelerType;
    @XmlAttribute(name = "Gender")
    protected String gender;

    /**
     * Gets the value of the bookingTravelerName property.
     * 
     * @return
     *     possible object is
     *     {@link BookingTravelerName }
     *     
     */
    public BookingTravelerName getBookingTravelerName() {
        return bookingTravelerName;
    }

    /**
     * Sets the value of the bookingTravelerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingTravelerName }
     *     
     */
    public void setBookingTravelerName(BookingTravelerName value) {
        this.bookingTravelerName = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link Email }
     *     
     */
    public Email getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link Email }
     *     
     */
    public void setEmail(Email value) {
        this.email = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneNumber }
     *     
     */
    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneNumber }
     *     
     */
    public void setPhoneNumber(PhoneNumber value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link TypeStructuredAddress }
     *     
     */
    public TypeStructuredAddress getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeStructuredAddress }
     *     
     */
    public void setAddress(TypeStructuredAddress value) {
        this.address = value;
    }

    /**
     * Gets the value of the emergencyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmergencyInfo() {
        return emergencyInfo;
    }

    /**
     * Sets the value of the emergencyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergencyInfo(String value) {
        this.emergencyInfo = value;
    }

    /**
     * Gets the value of the deliveryInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryInfo }
     *     
     */
    public DeliveryInfo getDeliveryInfo() {
        return deliveryInfo;
    }

    /**
     * Sets the value of the deliveryInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryInfo }
     *     
     */
    public void setDeliveryInfo(DeliveryInfo value) {
        this.deliveryInfo = value;
    }

    /**
     * Gets the value of the nameRemark property.
     * 
     * @return
     *     possible object is
     *     {@link NameRemark }
     *     
     */
    public NameRemark getNameRemark() {
        return nameRemark;
    }

    /**
     * Sets the value of the nameRemark property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameRemark }
     *     
     */
    public void setNameRemark(NameRemark value) {
        this.nameRemark = value;
    }

    /**
     * Gets the value of the age property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAge(BigInteger value) {
        this.age = value;
    }

    /**
     * Gets the value of the dob property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDOB() {
        return dob;
    }

    /**
     * Sets the value of the dob property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDOB(XMLGregorianCalendar value) {
        this.dob = value;
    }

    /**
     * Gets the value of the customizedNameData property.
     * 
     * @return
     *     possible object is
     *     {@link CustomizedNameData }
     *     
     */
    public CustomizedNameData getCustomizedNameData() {
        return customizedNameData;
    }

    /**
     * Sets the value of the customizedNameData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomizedNameData }
     *     
     */
    public void setCustomizedNameData(CustomizedNameData value) {
        this.customizedNameData = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the travelerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelerType() {
        return travelerType;
    }

    /**
     * Sets the value of the travelerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelerType(String value) {
        this.travelerType = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

}
