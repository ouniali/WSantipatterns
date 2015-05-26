
package com.addressdoctor.validator2.addbatch.batch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Result complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Result">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Address" type="{http://validator2.AddressDoctor.com/addBatch/Batch}Address" minOccurs="0"/>
 *         &lt;element name="ValidationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResultPercentage" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ElementMatchStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ElementResultStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountryISO3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtherServices" type="{http://validator2.AddressDoctor.com/addBatch/Batch}ArrayOfService" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Result", propOrder = {
    "address",
    "validationStatus",
    "resultPercentage",
    "elementMatchStatus",
    "elementResultStatus",
    "countryISO3",
    "otherServices"
})
public class Result {

    @XmlElement(name = "Address")
    protected Address address;
    @XmlElement(name = "ValidationStatus")
    protected String validationStatus;
    @XmlElement(name = "ResultPercentage")
    protected double resultPercentage;
    @XmlElement(name = "ElementMatchStatus")
    protected String elementMatchStatus;
    @XmlElement(name = "ElementResultStatus")
    protected String elementResultStatus;
    @XmlElement(name = "CountryISO3")
    protected String countryISO3;
    @XmlElement(name = "OtherServices")
    protected ArrayOfService otherServices;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the validationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationStatus() {
        return validationStatus;
    }

    /**
     * Sets the value of the validationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationStatus(String value) {
        this.validationStatus = value;
    }

    /**
     * Gets the value of the resultPercentage property.
     * 
     */
    public double getResultPercentage() {
        return resultPercentage;
    }

    /**
     * Sets the value of the resultPercentage property.
     * 
     */
    public void setResultPercentage(double value) {
        this.resultPercentage = value;
    }

    /**
     * Gets the value of the elementMatchStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementMatchStatus() {
        return elementMatchStatus;
    }

    /**
     * Sets the value of the elementMatchStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementMatchStatus(String value) {
        this.elementMatchStatus = value;
    }

    /**
     * Gets the value of the elementResultStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementResultStatus() {
        return elementResultStatus;
    }

    /**
     * Sets the value of the elementResultStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementResultStatus(String value) {
        this.elementResultStatus = value;
    }

    /**
     * Gets the value of the countryISO3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryISO3() {
        return countryISO3;
    }

    /**
     * Sets the value of the countryISO3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryISO3(String value) {
        this.countryISO3 = value;
    }

    /**
     * Gets the value of the otherServices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfService }
     *     
     */
    public ArrayOfService getOtherServices() {
        return otherServices;
    }

    /**
     * Sets the value of the otherServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfService }
     *     
     */
    public void setOtherServices(ArrayOfService value) {
        this.otherServices = value;
    }

}
