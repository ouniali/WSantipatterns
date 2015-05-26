
package com.vodafone.gdsp.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setUserDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setUserDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userName" type="{http://ws.gdsp.vodafone.com/}tUserName" minOccurs="0"/>
 *         &lt;element name="fullName" type="{http://ws.gdsp.vodafone.com/}tFullName" minOccurs="0"/>
 *         &lt;element name="emailAddress" type="{http://ws.gdsp.vodafone.com/}tEmailAddress" minOccurs="0"/>
 *         &lt;element name="addressLine1" type="{http://ws.gdsp.vodafone.com/}tAddressLine" minOccurs="0"/>
 *         &lt;element name="addressLine2" type="{http://ws.gdsp.vodafone.com/}tAddressLine" minOccurs="0"/>
 *         &lt;element name="addressLine3" type="{http://ws.gdsp.vodafone.com/}tAddressLine" minOccurs="0"/>
 *         &lt;element name="addressLine4" type="{http://ws.gdsp.vodafone.com/}tAddressLine" minOccurs="0"/>
 *         &lt;element name="addressLine5" type="{http://ws.gdsp.vodafone.com/}tAddressLine" minOccurs="0"/>
 *         &lt;element name="telephone1" type="{http://ws.gdsp.vodafone.com/}tTelephoneNumber" minOccurs="0"/>
 *         &lt;element name="telephone2" type="{http://ws.gdsp.vodafone.com/}tTelephoneNumber" minOccurs="0"/>
 *         &lt;element name="accessRights" type="{http://ws.gdsp.vodafone.com/}tAccessRightsOptions" minOccurs="0"/>
 *         &lt;element name="password" type="{http://ws.gdsp.vodafone.com/}tPassword" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setUserDetails", propOrder = {
    "userName",
    "fullName",
    "emailAddress",
    "addressLine1",
    "addressLine2",
    "addressLine3",
    "addressLine4",
    "addressLine5",
    "telephone1",
    "telephone2",
    "accessRights",
    "password"
})
public class SetUserDetails_Type {

    protected String userName;
    protected String fullName;
    protected String emailAddress;
    protected String addressLine1;
    protected String addressLine2;
    protected String addressLine3;
    protected String addressLine4;
    protected String addressLine5;
    protected String telephone1;
    protected String telephone2;
    @XmlSchemaType(name = "string")
    protected TAccessRightsOptions accessRights;
    protected String password;

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

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
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
     * Gets the value of the addressLine3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine3() {
        return addressLine3;
    }

    /**
     * Sets the value of the addressLine3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine3(String value) {
        this.addressLine3 = value;
    }

    /**
     * Gets the value of the addressLine4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine4() {
        return addressLine4;
    }

    /**
     * Sets the value of the addressLine4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine4(String value) {
        this.addressLine4 = value;
    }

    /**
     * Gets the value of the addressLine5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine5() {
        return addressLine5;
    }

    /**
     * Sets the value of the addressLine5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine5(String value) {
        this.addressLine5 = value;
    }

    /**
     * Gets the value of the telephone1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephone1() {
        return telephone1;
    }

    /**
     * Sets the value of the telephone1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephone1(String value) {
        this.telephone1 = value;
    }

    /**
     * Gets the value of the telephone2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephone2() {
        return telephone2;
    }

    /**
     * Sets the value of the telephone2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephone2(String value) {
        this.telephone2 = value;
    }

    /**
     * Gets the value of the accessRights property.
     * 
     * @return
     *     possible object is
     *     {@link TAccessRightsOptions }
     *     
     */
    public TAccessRightsOptions getAccessRights() {
        return accessRights;
    }

    /**
     * Sets the value of the accessRights property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAccessRightsOptions }
     *     
     */
    public void setAccessRights(TAccessRightsOptions value) {
        this.accessRights = value;
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

}
