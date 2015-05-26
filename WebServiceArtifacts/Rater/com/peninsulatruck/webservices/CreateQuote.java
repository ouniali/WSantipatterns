
package com.peninsulatruck.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Account" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrigZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DestZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClassList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WeightList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccessorialList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "userId",
    "password",
    "account",
    "origZip",
    "destZip",
    "classList",
    "weightList",
    "accessorialList"
})
@XmlRootElement(name = "CreateQuote")
public class CreateQuote {

    @XmlElement(name = "UserId")
    protected String userId;
    @XmlElement(name = "Password")
    protected String password;
    @XmlElement(name = "Account")
    protected String account;
    @XmlElement(name = "OrigZip")
    protected String origZip;
    @XmlElement(name = "DestZip")
    protected String destZip;
    @XmlElement(name = "ClassList")
    protected String classList;
    @XmlElement(name = "WeightList")
    protected String weightList;
    @XmlElement(name = "AccessorialList")
    protected String accessorialList;

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
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
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccount(String value) {
        this.account = value;
    }

    /**
     * Gets the value of the origZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigZip() {
        return origZip;
    }

    /**
     * Sets the value of the origZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigZip(String value) {
        this.origZip = value;
    }

    /**
     * Gets the value of the destZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestZip() {
        return destZip;
    }

    /**
     * Sets the value of the destZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestZip(String value) {
        this.destZip = value;
    }

    /**
     * Gets the value of the classList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassList() {
        return classList;
    }

    /**
     * Sets the value of the classList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassList(String value) {
        this.classList = value;
    }

    /**
     * Gets the value of the weightList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeightList() {
        return weightList;
    }

    /**
     * Sets the value of the weightList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeightList(String value) {
        this.weightList = value;
    }

    /**
     * Gets the value of the accessorialList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessorialList() {
        return accessorialList;
    }

    /**
     * Sets the value of the accessorialList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessorialList(String value) {
        this.accessorialList = value;
    }

}
