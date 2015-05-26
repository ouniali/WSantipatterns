
package com.vodafone.gdsp.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getReport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getReport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reportName" type="{http://ws.gdsp.vodafone.com/}tReportName"/>
 *         &lt;element name="reportFormat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reportParameters" type="{http://ws.gdsp.vodafone.com/}tGetReportParameterList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getReport", propOrder = {
    "reportName",
    "reportFormat",
    "reportParameters"
})
public class GetReport_Type {

    @XmlElement(required = true)
    protected String reportName;
    @XmlElement(required = true)
    protected String reportFormat;
    protected TGetReportParameterList reportParameters;

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
     * Gets the value of the reportFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportFormat() {
        return reportFormat;
    }

    /**
     * Sets the value of the reportFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportFormat(String value) {
        this.reportFormat = value;
    }

    /**
     * Gets the value of the reportParameters property.
     * 
     * @return
     *     possible object is
     *     {@link TGetReportParameterList }
     *     
     */
    public TGetReportParameterList getReportParameters() {
        return reportParameters;
    }

    /**
     * Sets the value of the reportParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link TGetReportParameterList }
     *     
     */
    public void setReportParameters(TGetReportParameterList value) {
        this.reportParameters = value;
    }

}
