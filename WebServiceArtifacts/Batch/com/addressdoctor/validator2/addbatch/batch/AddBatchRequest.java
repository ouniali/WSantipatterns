
package com.addressdoctor.validator2.addbatch.batch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addBatchRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addBatchRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Authentication" type="{http://validator2.AddressDoctor.com/addBatch/Batch}Authentication" minOccurs="0"/>
 *         &lt;element name="Reserved" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CampaignID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtherServices" type="{http://validator2.AddressDoctor.com/addBatch/Batch}ArrayOfService" minOccurs="0"/>
 *         &lt;element name="Parameters" type="{http://validator2.AddressDoctor.com/addBatch/Batch}Parameters" minOccurs="0"/>
 *         &lt;element name="AddressCount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Addresses" type="{http://validator2.AddressDoctor.com/addBatch/Batch}ArrayOfAddress" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addBatchRequest", propOrder = {
    "authentication",
    "reserved",
    "campaignID",
    "otherServices",
    "parameters",
    "addressCount",
    "addresses"
})
public class AddBatchRequest {

    @XmlElement(name = "Authentication")
    protected Authentication authentication;
    @XmlElement(name = "Reserved")
    protected String reserved;
    @XmlElement(name = "CampaignID")
    protected String campaignID;
    @XmlElement(name = "OtherServices")
    protected ArrayOfService otherServices;
    @XmlElement(name = "Parameters")
    protected Parameters parameters;
    @XmlElement(name = "AddressCount")
    protected long addressCount;
    @XmlElement(name = "Addresses")
    protected ArrayOfAddress addresses;

    /**
     * Gets the value of the authentication property.
     * 
     * @return
     *     possible object is
     *     {@link Authentication }
     *     
     */
    public Authentication getAuthentication() {
        return authentication;
    }

    /**
     * Sets the value of the authentication property.
     * 
     * @param value
     *     allowed object is
     *     {@link Authentication }
     *     
     */
    public void setAuthentication(Authentication value) {
        this.authentication = value;
    }

    /**
     * Gets the value of the reserved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserved() {
        return reserved;
    }

    /**
     * Sets the value of the reserved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserved(String value) {
        this.reserved = value;
    }

    /**
     * Gets the value of the campaignID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignID() {
        return campaignID;
    }

    /**
     * Sets the value of the campaignID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignID(String value) {
        this.campaignID = value;
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

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link Parameters }
     *     
     */
    public Parameters getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parameters }
     *     
     */
    public void setParameters(Parameters value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the addressCount property.
     * 
     */
    public long getAddressCount() {
        return addressCount;
    }

    /**
     * Sets the value of the addressCount property.
     * 
     */
    public void setAddressCount(long value) {
        this.addressCount = value;
    }

    /**
     * Gets the value of the addresses property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAddress }
     *     
     */
    public ArrayOfAddress getAddresses() {
        return addresses;
    }

    /**
     * Sets the value of the addresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAddress }
     *     
     */
    public void setAddresses(ArrayOfAddress value) {
        this.addresses = value;
    }

}
