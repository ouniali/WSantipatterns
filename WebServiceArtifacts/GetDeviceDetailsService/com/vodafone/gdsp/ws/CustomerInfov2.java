
package com.vodafone.gdsp.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for customerInfov2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="customerInfov2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customAttributeLabel1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customAttributeLabel2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customAttributeLabel3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customAttributeLabel4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customAttributeLabel5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customAttributeFilterEnabled1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customAttributeFilterEnabled2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customAttributeFilterEnabled3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customAttributeFilterEnabled4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customAttributeFilterEnabled5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerInfov2", propOrder = {
    "customerCode",
    "customerName",
    "customAttributeLabel1",
    "customAttributeLabel2",
    "customAttributeLabel3",
    "customAttributeLabel4",
    "customAttributeLabel5",
    "customAttributeFilterEnabled1",
    "customAttributeFilterEnabled2",
    "customAttributeFilterEnabled3",
    "customAttributeFilterEnabled4",
    "customAttributeFilterEnabled5"
})
public class CustomerInfov2 {

    protected String customerCode;
    protected String customerName;
    protected String customAttributeLabel1;
    protected String customAttributeLabel2;
    protected String customAttributeLabel3;
    protected String customAttributeLabel4;
    protected String customAttributeLabel5;
    protected String customAttributeFilterEnabled1;
    protected String customAttributeFilterEnabled2;
    protected String customAttributeFilterEnabled3;
    protected String customAttributeFilterEnabled4;
    protected String customAttributeFilterEnabled5;

    /**
     * Gets the value of the customerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerCode() {
        return customerCode;
    }

    /**
     * Sets the value of the customerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerCode(String value) {
        this.customerCode = value;
    }

    /**
     * Gets the value of the customerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Gets the value of the customAttributeLabel1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomAttributeLabel1() {
        return customAttributeLabel1;
    }

    /**
     * Sets the value of the customAttributeLabel1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomAttributeLabel1(String value) {
        this.customAttributeLabel1 = value;
    }

    /**
     * Gets the value of the customAttributeLabel2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomAttributeLabel2() {
        return customAttributeLabel2;
    }

    /**
     * Sets the value of the customAttributeLabel2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomAttributeLabel2(String value) {
        this.customAttributeLabel2 = value;
    }

    /**
     * Gets the value of the customAttributeLabel3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomAttributeLabel3() {
        return customAttributeLabel3;
    }

    /**
     * Sets the value of the customAttributeLabel3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomAttributeLabel3(String value) {
        this.customAttributeLabel3 = value;
    }

    /**
     * Gets the value of the customAttributeLabel4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomAttributeLabel4() {
        return customAttributeLabel4;
    }

    /**
     * Sets the value of the customAttributeLabel4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomAttributeLabel4(String value) {
        this.customAttributeLabel4 = value;
    }

    /**
     * Gets the value of the customAttributeLabel5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomAttributeLabel5() {
        return customAttributeLabel5;
    }

    /**
     * Sets the value of the customAttributeLabel5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomAttributeLabel5(String value) {
        this.customAttributeLabel5 = value;
    }

    /**
     * Gets the value of the customAttributeFilterEnabled1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomAttributeFilterEnabled1() {
        return customAttributeFilterEnabled1;
    }

    /**
     * Sets the value of the customAttributeFilterEnabled1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomAttributeFilterEnabled1(String value) {
        this.customAttributeFilterEnabled1 = value;
    }

    /**
     * Gets the value of the customAttributeFilterEnabled2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomAttributeFilterEnabled2() {
        return customAttributeFilterEnabled2;
    }

    /**
     * Sets the value of the customAttributeFilterEnabled2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomAttributeFilterEnabled2(String value) {
        this.customAttributeFilterEnabled2 = value;
    }

    /**
     * Gets the value of the customAttributeFilterEnabled3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomAttributeFilterEnabled3() {
        return customAttributeFilterEnabled3;
    }

    /**
     * Sets the value of the customAttributeFilterEnabled3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomAttributeFilterEnabled3(String value) {
        this.customAttributeFilterEnabled3 = value;
    }

    /**
     * Gets the value of the customAttributeFilterEnabled4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomAttributeFilterEnabled4() {
        return customAttributeFilterEnabled4;
    }

    /**
     * Sets the value of the customAttributeFilterEnabled4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomAttributeFilterEnabled4(String value) {
        this.customAttributeFilterEnabled4 = value;
    }

    /**
     * Gets the value of the customAttributeFilterEnabled5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomAttributeFilterEnabled5() {
        return customAttributeFilterEnabled5;
    }

    /**
     * Sets the value of the customAttributeFilterEnabled5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomAttributeFilterEnabled5(String value) {
        this.customAttributeFilterEnabled5 = value;
    }

}
