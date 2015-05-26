
package com.inforcyl.services.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Authentification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Authentification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="admon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userDataBase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userLocaleCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userLocaleLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userTimeUsing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Authentification", propOrder = {
    "admon",
    "clientIp",
    "password",
    "user",
    "userDataBase",
    "userLocaleCountry",
    "userLocaleLanguage",
    "userTimeUsing"
})
public class Authentification {

    @XmlElementRef(name = "admon", namespace = "http://services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> admon;
    @XmlElementRef(name = "clientIp", namespace = "http://services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clientIp;
    @XmlElementRef(name = "password", namespace = "http://services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> password;
    @XmlElementRef(name = "user", namespace = "http://services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> user;
    @XmlElementRef(name = "userDataBase", namespace = "http://services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userDataBase;
    @XmlElementRef(name = "userLocaleCountry", namespace = "http://services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userLocaleCountry;
    @XmlElementRef(name = "userLocaleLanguage", namespace = "http://services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userLocaleLanguage;
    @XmlElementRef(name = "userTimeUsing", namespace = "http://services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userTimeUsing;

    /**
     * Gets the value of the admon property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdmon() {
        return admon;
    }

    /**
     * Sets the value of the admon property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdmon(JAXBElement<String> value) {
        this.admon = value;
    }

    /**
     * Gets the value of the clientIp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClientIp() {
        return clientIp;
    }

    /**
     * Sets the value of the clientIp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClientIp(JAXBElement<String> value) {
        this.clientIp = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassword(JAXBElement<String> value) {
        this.password = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUser(JAXBElement<String> value) {
        this.user = value;
    }

    /**
     * Gets the value of the userDataBase property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserDataBase() {
        return userDataBase;
    }

    /**
     * Sets the value of the userDataBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserDataBase(JAXBElement<String> value) {
        this.userDataBase = value;
    }

    /**
     * Gets the value of the userLocaleCountry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserLocaleCountry() {
        return userLocaleCountry;
    }

    /**
     * Sets the value of the userLocaleCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserLocaleCountry(JAXBElement<String> value) {
        this.userLocaleCountry = value;
    }

    /**
     * Gets the value of the userLocaleLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserLocaleLanguage() {
        return userLocaleLanguage;
    }

    /**
     * Sets the value of the userLocaleLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserLocaleLanguage(JAXBElement<String> value) {
        this.userLocaleLanguage = value;
    }

    /**
     * Gets the value of the userTimeUsing property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserTimeUsing() {
        return userTimeUsing;
    }

    /**
     * Sets the value of the userTimeUsing property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserTimeUsing(JAXBElement<String> value) {
        this.userTimeUsing = value;
    }

}
