
package com.familytreemaker.service.search;

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
 *         &lt;element name="FetchRecordResult" type="{urn:service.familytreemaker.com/Search}RecordType"/>
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
    "fetchRecordResult"
})
@XmlRootElement(name = "FetchRecordResponse")
public class FetchRecordResponse {

    @XmlElement(name = "FetchRecordResult", required = true, nillable = true)
    protected RecordType fetchRecordResult;

    /**
     * Gets the value of the fetchRecordResult property.
     * 
     * @return
     *     possible object is
     *     {@link RecordType }
     *     
     */
    public RecordType getFetchRecordResult() {
        return fetchRecordResult;
    }

    /**
     * Sets the value of the fetchRecordResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordType }
     *     
     */
    public void setFetchRecordResult(RecordType value) {
        this.fetchRecordResult = value;
    }

}
