
package com.tourico.schemas.webservices.hotelv3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClientCreditCardInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClientCreditCardInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="System" type="{http://schemas.tourico.com/webservices/hotelv3}CyberSourceParams" minOccurs="0"/>
 *         &lt;element name="CreditCardToken" type="{http://microsoft.com/wsdl/types/}guid"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClientCreditCardInfo", propOrder = {
    "system",
    "creditCardToken"
})
public class ClientCreditCardInfo {

    @XmlElement(name = "System")
    protected CyberSourceParams system;
    @XmlElement(name = "CreditCardToken", required = true)
    protected String creditCardToken;

    /**
     * Gets the value of the system property.
     * 
     * @return
     *     possible object is
     *     {@link CyberSourceParams }
     *     
     */
    public CyberSourceParams getSystem() {
        return system;
    }

    /**
     * Sets the value of the system property.
     * 
     * @param value
     *     allowed object is
     *     {@link CyberSourceParams }
     *     
     */
    public void setSystem(CyberSourceParams value) {
        this.system = value;
    }

    /**
     * Gets the value of the creditCardToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardToken() {
        return creditCardToken;
    }

    /**
     * Sets the value of the creditCardToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardToken(String value) {
        this.creditCardToken = value;
    }

}
