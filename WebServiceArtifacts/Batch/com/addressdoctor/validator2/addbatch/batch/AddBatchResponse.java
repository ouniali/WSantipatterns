
package com.addressdoctor.validator2.addbatch.batch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addBatchResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addBatchResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reserved" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CampaignID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResultCount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Results" type="{http://validator2.AddressDoctor.com/addBatch/Batch}ArrayOfResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addBatchResponse", propOrder = {
    "errorCode",
    "errorMessage",
    "reserved",
    "campaignID",
    "resultCount",
    "results"
})
public class AddBatchResponse {

    @XmlElement(name = "ErrorCode")
    protected long errorCode;
    @XmlElement(name = "ErrorMessage")
    protected String errorMessage;
    @XmlElement(name = "Reserved")
    protected String reserved;
    @XmlElement(name = "CampaignID")
    protected String campaignID;
    @XmlElement(name = "ResultCount")
    protected long resultCount;
    @XmlElement(name = "Results")
    protected ArrayOfResult results;

    /**
     * Gets the value of the errorCode property.
     * 
     */
    public long getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     */
    public void setErrorCode(long value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
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
     * Gets the value of the resultCount property.
     * 
     */
    public long getResultCount() {
        return resultCount;
    }

    /**
     * Sets the value of the resultCount property.
     * 
     */
    public void setResultCount(long value) {
        this.resultCount = value;
    }

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfResult }
     *     
     */
    public ArrayOfResult getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfResult }
     *     
     */
    public void setResults(ArrayOfResult value) {
        this.results = value;
    }

}
