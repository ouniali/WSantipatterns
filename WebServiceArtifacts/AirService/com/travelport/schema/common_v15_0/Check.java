
package com.travelport.schema.common_v15_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="MICRNumber">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="29"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="RoutingNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CheckNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Check")
public class Check {

    @XmlAttribute(name = "MICRNumber")
    protected String micrNumber;
    @XmlAttribute(name = "RoutingNumber")
    protected String routingNumber;
    @XmlAttribute(name = "AccountNumber")
    protected String accountNumber;
    @XmlAttribute(name = "CheckNumber")
    protected String checkNumber;

    /**
     * Gets the value of the micrNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMICRNumber() {
        return micrNumber;
    }

    /**
     * Sets the value of the micrNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMICRNumber(String value) {
        this.micrNumber = value;
    }

    /**
     * Gets the value of the routingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutingNumber() {
        return routingNumber;
    }

    /**
     * Sets the value of the routingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutingNumber(String value) {
        this.routingNumber = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the checkNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckNumber() {
        return checkNumber;
    }

    /**
     * Sets the value of the checkNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckNumber(String value) {
        this.checkNumber = value;
    }

}
