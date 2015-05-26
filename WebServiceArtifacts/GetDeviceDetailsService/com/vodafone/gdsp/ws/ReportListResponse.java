
package com.vodafone.gdsp.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reportListResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reportListResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="returnCode" type="{http://ws.gdsp.vodafone.com/}returnCode"/>
 *         &lt;element name="reportList" type="{http://ws.gdsp.vodafone.com/}tReportList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reportListResponse", propOrder = {
    "returnCode",
    "reportList"
})
public class ReportListResponse {

    @XmlElement(required = true)
    protected ReturnCode returnCode;
    protected TReportList reportList;

    /**
     * Gets the value of the returnCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnCode }
     *     
     */
    public ReturnCode getReturnCode() {
        return returnCode;
    }

    /**
     * Sets the value of the returnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnCode }
     *     
     */
    public void setReturnCode(ReturnCode value) {
        this.returnCode = value;
    }

    /**
     * Gets the value of the reportList property.
     * 
     * @return
     *     possible object is
     *     {@link TReportList }
     *     
     */
    public TReportList getReportList() {
        return reportList;
    }

    /**
     * Sets the value of the reportList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TReportList }
     *     
     */
    public void setReportList(TReportList value) {
        this.reportList = value;
    }

}
