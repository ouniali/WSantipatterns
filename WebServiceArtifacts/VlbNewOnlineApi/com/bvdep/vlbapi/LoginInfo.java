
package com.bvdep.vlbapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoginInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoginInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RegistrationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SessionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AccountMvbKennNr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UserLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LoginStatus" type="{http://vlbapi.bvdep.com/}LoginStatus"/>
 *         &lt;element name="SessionsLeft" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoginInfo", propOrder = {
    "registrationCode",
    "sessionCode",
    "accountId",
    "accountMvbKennNr",
    "userLogin",
    "loginStatus",
    "sessionsLeft"
})
public class LoginInfo {

    @XmlElement(name = "RegistrationCode")
    protected String registrationCode;
    @XmlElement(name = "SessionCode")
    protected String sessionCode;
    @XmlElement(name = "AccountId")
    protected int accountId;
    @XmlElement(name = "AccountMvbKennNr")
    protected int accountMvbKennNr;
    @XmlElement(name = "UserLogin")
    protected String userLogin;
    @XmlElement(name = "LoginStatus", required = true)
    @XmlSchemaType(name = "string")
    protected LoginStatus loginStatus;
    @XmlElement(name = "SessionsLeft")
    protected int sessionsLeft;

    /**
     * Gets the value of the registrationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationCode() {
        return registrationCode;
    }

    /**
     * Sets the value of the registrationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationCode(String value) {
        this.registrationCode = value;
    }

    /**
     * Gets the value of the sessionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionCode() {
        return sessionCode;
    }

    /**
     * Sets the value of the sessionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionCode(String value) {
        this.sessionCode = value;
    }

    /**
     * Gets the value of the accountId property.
     * 
     */
    public int getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     */
    public void setAccountId(int value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the accountMvbKennNr property.
     * 
     */
    public int getAccountMvbKennNr() {
        return accountMvbKennNr;
    }

    /**
     * Sets the value of the accountMvbKennNr property.
     * 
     */
    public void setAccountMvbKennNr(int value) {
        this.accountMvbKennNr = value;
    }

    /**
     * Gets the value of the userLogin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserLogin() {
        return userLogin;
    }

    /**
     * Sets the value of the userLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserLogin(String value) {
        this.userLogin = value;
    }

    /**
     * Gets the value of the loginStatus property.
     * 
     * @return
     *     possible object is
     *     {@link LoginStatus }
     *     
     */
    public LoginStatus getLoginStatus() {
        return loginStatus;
    }

    /**
     * Sets the value of the loginStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginStatus }
     *     
     */
    public void setLoginStatus(LoginStatus value) {
        this.loginStatus = value;
    }

    /**
     * Gets the value of the sessionsLeft property.
     * 
     */
    public int getSessionsLeft() {
        return sessionsLeft;
    }

    /**
     * Sets the value of the sessionsLeft property.
     * 
     */
    public void setSessionsLeft(int value) {
        this.sessionsLeft = value;
    }

}
