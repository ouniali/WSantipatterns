
package com._2sms.webservices._2_0.simple;

import java.math.BigDecimal;
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
 *         &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AnyTimeBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OffPeakBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ResultText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "username",
    "password",
    "anyTimeBalance",
    "offPeakBalance",
    "resultText",
    "code"
})
@XmlRootElement(name = "GetBalance")
public class GetBalance {

    @XmlElement(name = "Username")
    protected String username;
    @XmlElement(name = "Password")
    protected String password;
    @XmlElement(name = "AnyTimeBalance", required = true)
    protected BigDecimal anyTimeBalance;
    @XmlElement(name = "OffPeakBalance", required = true)
    protected BigDecimal offPeakBalance;
    @XmlElement(name = "ResultText")
    protected String resultText;
    @XmlElement(name = "Code")
    protected String code;

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
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
     * Gets the value of the anyTimeBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAnyTimeBalance() {
        return anyTimeBalance;
    }

    /**
     * Sets the value of the anyTimeBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAnyTimeBalance(BigDecimal value) {
        this.anyTimeBalance = value;
    }

    /**
     * Gets the value of the offPeakBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOffPeakBalance() {
        return offPeakBalance;
    }

    /**
     * Sets the value of the offPeakBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOffPeakBalance(BigDecimal value) {
        this.offPeakBalance = value;
    }

    /**
     * Gets the value of the resultText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultText() {
        return resultText;
    }

    /**
     * Sets the value of the resultText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultText(String value) {
        this.resultText = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

}
