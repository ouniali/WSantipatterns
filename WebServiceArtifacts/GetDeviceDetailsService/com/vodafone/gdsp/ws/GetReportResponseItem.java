
package com.vodafone.gdsp.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getReportResponseItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getReportResponseItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="returnCode" type="{http://ws.gdsp.vodafone.com/}returnCode"/>
 *         &lt;element name="reportName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reportTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reportBody" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="reportMimeType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getReportResponseItem", propOrder = {
    "returnCode",
    "reportName",
    "reportTitle",
    "reportBody",
    "reportMimeType"
})
public class GetReportResponseItem {

    @XmlElement(required = true)
    protected ReturnCode returnCode;
    @XmlElement(required = true)
    protected String reportName;
    @XmlElement(required = true)
    protected String reportTitle;
    @XmlElement(required = true)
    protected byte[] reportBody;
    @XmlElement(required = true)
    protected String reportMimeType;

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
     * Gets the value of the reportName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportName() {
        return reportName;
    }

    /**
     * Sets the value of the reportName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportName(String value) {
        this.reportName = value;
    }

    /**
     * Gets the value of the reportTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportTitle() {
        return reportTitle;
    }

    /**
     * Sets the value of the reportTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportTitle(String value) {
        this.reportTitle = value;
    }

    /**
     * Gets the value of the reportBody property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getReportBody() {
        return reportBody;
    }

    /**
     * Sets the value of the reportBody property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setReportBody(byte[] value) {
        this.reportBody = value;
    }

    /**
     * Gets the value of the reportMimeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportMimeType() {
        return reportMimeType;
    }

    /**
     * Sets the value of the reportMimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportMimeType(String value) {
        this.reportMimeType = value;
    }

}
