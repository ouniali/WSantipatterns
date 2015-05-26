
package org.mondor;

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
 *         &lt;element name="CurrencyFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValueFrom" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="UserKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "currencyFrom",
    "currencyTo",
    "valueFrom",
    "userKey"
})
@XmlRootElement(name = "Convert")
public class Convert {

    @XmlElement(name = "CurrencyFrom")
    protected String currencyFrom;
    @XmlElement(name = "CurrencyTo")
    protected String currencyTo;
    @XmlElement(name = "ValueFrom")
    protected double valueFrom;
    @XmlElement(name = "UserKey")
    protected String userKey;

    /**
     * Gets the value of the currencyFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyFrom() {
        return currencyFrom;
    }

    /**
     * Sets the value of the currencyFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyFrom(String value) {
        this.currencyFrom = value;
    }

    /**
     * Gets the value of the currencyTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyTo() {
        return currencyTo;
    }

    /**
     * Sets the value of the currencyTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyTo(String value) {
        this.currencyTo = value;
    }

    /**
     * Gets the value of the valueFrom property.
     * 
     */
    public double getValueFrom() {
        return valueFrom;
    }

    /**
     * Sets the value of the valueFrom property.
     * 
     */
    public void setValueFrom(double value) {
        this.valueFrom = value;
    }

    /**
     * Gets the value of the userKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserKey() {
        return userKey;
    }

    /**
     * Sets the value of the userKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserKey(String value) {
        this.userKey = value;
    }

}
