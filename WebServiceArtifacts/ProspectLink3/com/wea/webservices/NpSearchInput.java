
package com.wea.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for npSearchInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="npSearchInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address2Line1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address2Line2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address3Line1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address3Line2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addressLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addressLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="busPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="busPhone2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="busPhone3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="business" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="business2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="business3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstGiftAmt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="firstGiftDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="giftAmt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="graduateDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="largestGiftAmt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="largestGiftDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastGivingAmt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="lastGivingDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="originalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="originalId2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postalCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postalCode3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postalCodeFour" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postalCodeFour2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postalCodeFour3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spFName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spLName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spMName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spOriginalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spOriginalId2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="suffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalNumberGiving" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="totalYearsGiving" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="trackingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "npSearchInput", propOrder = {
    "address2Line1",
    "address2Line2",
    "address3Line1",
    "address3Line2",
    "addressLine1",
    "addressLine2",
    "age",
    "birthDate",
    "busPhone",
    "busPhone2",
    "busPhone3",
    "business",
    "business2",
    "business3",
    "city",
    "city2",
    "city3",
    "firstGiftAmt",
    "firstGiftDate",
    "firstName",
    "giftAmt",
    "graduateDate",
    "largestGiftAmt",
    "largestGiftDate",
    "lastGivingAmt",
    "lastGivingDate",
    "lastName",
    "middleName",
    "originalId",
    "originalId2",
    "password",
    "phoneNumber",
    "postalCode",
    "postalCode2",
    "postalCode3",
    "postalCodeFour",
    "postalCodeFour2",
    "postalCodeFour3",
    "spFName",
    "spLName",
    "spMName",
    "spOriginalId",
    "spOriginalId2",
    "spSuffix",
    "state",
    "state2",
    "state3",
    "suffix",
    "totalNumberGiving",
    "totalYearsGiving",
    "trackingId",
    "userName"
})
public class NpSearchInput {

    protected String address2Line1;
    protected String address2Line2;
    protected String address3Line1;
    protected String address3Line2;
    protected String addressLine1;
    protected String addressLine2;
    protected String age;
    protected String birthDate;
    protected String busPhone;
    protected String busPhone2;
    protected String busPhone3;
    protected String business;
    protected String business2;
    protected String business3;
    protected String city;
    protected String city2;
    protected String city3;
    protected Double firstGiftAmt;
    protected String firstGiftDate;
    protected String firstName;
    protected Double giftAmt;
    protected String graduateDate;
    protected Double largestGiftAmt;
    protected String largestGiftDate;
    protected Double lastGivingAmt;
    protected String lastGivingDate;
    protected String lastName;
    protected String middleName;
    protected String originalId;
    protected String originalId2;
    protected String password;
    protected String phoneNumber;
    protected String postalCode;
    protected String postalCode2;
    protected String postalCode3;
    protected String postalCodeFour;
    protected String postalCodeFour2;
    protected String postalCodeFour3;
    protected String spFName;
    protected String spLName;
    protected String spMName;
    protected String spOriginalId;
    protected String spOriginalId2;
    protected String spSuffix;
    protected String state;
    protected String state2;
    protected String state3;
    protected String suffix;
    protected Integer totalNumberGiving;
    protected Integer totalYearsGiving;
    protected String trackingId;
    protected String userName;

    /**
     * Gets the value of the address2Line1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress2Line1() {
        return address2Line1;
    }

    /**
     * Sets the value of the address2Line1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress2Line1(String value) {
        this.address2Line1 = value;
    }

    /**
     * Gets the value of the address2Line2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress2Line2() {
        return address2Line2;
    }

    /**
     * Sets the value of the address2Line2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress2Line2(String value) {
        this.address2Line2 = value;
    }

    /**
     * Gets the value of the address3Line1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress3Line1() {
        return address3Line1;
    }

    /**
     * Sets the value of the address3Line1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress3Line1(String value) {
        this.address3Line1 = value;
    }

    /**
     * Gets the value of the address3Line2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress3Line2() {
        return address3Line2;
    }

    /**
     * Sets the value of the address3Line2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress3Line2(String value) {
        this.address3Line2 = value;
    }

    /**
     * Gets the value of the addressLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * Sets the value of the addressLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine1(String value) {
        this.addressLine1 = value;
    }

    /**
     * Gets the value of the addressLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * Sets the value of the addressLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine2(String value) {
        this.addressLine2 = value;
    }

    /**
     * Gets the value of the age property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAge(String value) {
        this.age = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthDate(String value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the busPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusPhone() {
        return busPhone;
    }

    /**
     * Sets the value of the busPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusPhone(String value) {
        this.busPhone = value;
    }

    /**
     * Gets the value of the busPhone2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusPhone2() {
        return busPhone2;
    }

    /**
     * Sets the value of the busPhone2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusPhone2(String value) {
        this.busPhone2 = value;
    }

    /**
     * Gets the value of the busPhone3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusPhone3() {
        return busPhone3;
    }

    /**
     * Sets the value of the busPhone3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusPhone3(String value) {
        this.busPhone3 = value;
    }

    /**
     * Gets the value of the business property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusiness() {
        return business;
    }

    /**
     * Sets the value of the business property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusiness(String value) {
        this.business = value;
    }

    /**
     * Gets the value of the business2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusiness2() {
        return business2;
    }

    /**
     * Sets the value of the business2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusiness2(String value) {
        this.business2 = value;
    }

    /**
     * Gets the value of the business3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusiness3() {
        return business3;
    }

    /**
     * Sets the value of the business3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusiness3(String value) {
        this.business3 = value;
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
     * Gets the value of the city2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity2() {
        return city2;
    }

    /**
     * Sets the value of the city2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity2(String value) {
        this.city2 = value;
    }

    /**
     * Gets the value of the city3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity3() {
        return city3;
    }

    /**
     * Sets the value of the city3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity3(String value) {
        this.city3 = value;
    }

    /**
     * Gets the value of the firstGiftAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFirstGiftAmt() {
        return firstGiftAmt;
    }

    /**
     * Sets the value of the firstGiftAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFirstGiftAmt(Double value) {
        this.firstGiftAmt = value;
    }

    /**
     * Gets the value of the firstGiftDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstGiftDate() {
        return firstGiftDate;
    }

    /**
     * Sets the value of the firstGiftDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstGiftDate(String value) {
        this.firstGiftDate = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the giftAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGiftAmt() {
        return giftAmt;
    }

    /**
     * Sets the value of the giftAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGiftAmt(Double value) {
        this.giftAmt = value;
    }

    /**
     * Gets the value of the graduateDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGraduateDate() {
        return graduateDate;
    }

    /**
     * Sets the value of the graduateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGraduateDate(String value) {
        this.graduateDate = value;
    }

    /**
     * Gets the value of the largestGiftAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLargestGiftAmt() {
        return largestGiftAmt;
    }

    /**
     * Sets the value of the largestGiftAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLargestGiftAmt(Double value) {
        this.largestGiftAmt = value;
    }

    /**
     * Gets the value of the largestGiftDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLargestGiftDate() {
        return largestGiftDate;
    }

    /**
     * Sets the value of the largestGiftDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLargestGiftDate(String value) {
        this.largestGiftDate = value;
    }

    /**
     * Gets the value of the lastGivingAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLastGivingAmt() {
        return lastGivingAmt;
    }

    /**
     * Sets the value of the lastGivingAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLastGivingAmt(Double value) {
        this.lastGivingAmt = value;
    }

    /**
     * Gets the value of the lastGivingDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastGivingDate() {
        return lastGivingDate;
    }

    /**
     * Sets the value of the lastGivingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastGivingDate(String value) {
        this.lastGivingDate = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the originalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalId() {
        return originalId;
    }

    /**
     * Sets the value of the originalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalId(String value) {
        this.originalId = value;
    }

    /**
     * Gets the value of the originalId2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalId2() {
        return originalId2;
    }

    /**
     * Sets the value of the originalId2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalId2(String value) {
        this.originalId2 = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the postalCode2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode2() {
        return postalCode2;
    }

    /**
     * Sets the value of the postalCode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode2(String value) {
        this.postalCode2 = value;
    }

    /**
     * Gets the value of the postalCode3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode3() {
        return postalCode3;
    }

    /**
     * Sets the value of the postalCode3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode3(String value) {
        this.postalCode3 = value;
    }

    /**
     * Gets the value of the postalCodeFour property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCodeFour() {
        return postalCodeFour;
    }

    /**
     * Sets the value of the postalCodeFour property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCodeFour(String value) {
        this.postalCodeFour = value;
    }

    /**
     * Gets the value of the postalCodeFour2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCodeFour2() {
        return postalCodeFour2;
    }

    /**
     * Sets the value of the postalCodeFour2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCodeFour2(String value) {
        this.postalCodeFour2 = value;
    }

    /**
     * Gets the value of the postalCodeFour3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCodeFour3() {
        return postalCodeFour3;
    }

    /**
     * Sets the value of the postalCodeFour3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCodeFour3(String value) {
        this.postalCodeFour3 = value;
    }

    /**
     * Gets the value of the spFName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpFName() {
        return spFName;
    }

    /**
     * Sets the value of the spFName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpFName(String value) {
        this.spFName = value;
    }

    /**
     * Gets the value of the spLName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpLName() {
        return spLName;
    }

    /**
     * Sets the value of the spLName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpLName(String value) {
        this.spLName = value;
    }

    /**
     * Gets the value of the spMName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpMName() {
        return spMName;
    }

    /**
     * Sets the value of the spMName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpMName(String value) {
        this.spMName = value;
    }

    /**
     * Gets the value of the spOriginalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpOriginalId() {
        return spOriginalId;
    }

    /**
     * Sets the value of the spOriginalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpOriginalId(String value) {
        this.spOriginalId = value;
    }

    /**
     * Gets the value of the spOriginalId2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpOriginalId2() {
        return spOriginalId2;
    }

    /**
     * Sets the value of the spOriginalId2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpOriginalId2(String value) {
        this.spOriginalId2 = value;
    }

    /**
     * Gets the value of the spSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpSuffix() {
        return spSuffix;
    }

    /**
     * Sets the value of the spSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpSuffix(String value) {
        this.spSuffix = value;
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
     * Gets the value of the state2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState2() {
        return state2;
    }

    /**
     * Sets the value of the state2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState2(String value) {
        this.state2 = value;
    }

    /**
     * Gets the value of the state3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState3() {
        return state3;
    }

    /**
     * Sets the value of the state3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState3(String value) {
        this.state3 = value;
    }

    /**
     * Gets the value of the suffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * Sets the value of the suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuffix(String value) {
        this.suffix = value;
    }

    /**
     * Gets the value of the totalNumberGiving property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalNumberGiving() {
        return totalNumberGiving;
    }

    /**
     * Sets the value of the totalNumberGiving property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalNumberGiving(Integer value) {
        this.totalNumberGiving = value;
    }

    /**
     * Gets the value of the totalYearsGiving property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalYearsGiving() {
        return totalYearsGiving;
    }

    /**
     * Sets the value of the totalYearsGiving property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalYearsGiving(Integer value) {
        this.totalYearsGiving = value;
    }

    /**
     * Gets the value of the trackingId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingId() {
        return trackingId;
    }

    /**
     * Sets the value of the trackingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingId(String value) {
        this.trackingId = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

}
