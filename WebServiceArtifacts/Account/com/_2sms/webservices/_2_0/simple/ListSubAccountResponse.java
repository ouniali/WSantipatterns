
package com._2sms.webservices._2_0.simple;

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
 *         &lt;element name="ListSubAccountResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReportCSV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResultText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "listSubAccountResult",
    "reportCSV",
    "resultText",
    "code"
})
@XmlRootElement(name = "ListSubAccountResponse")
public class ListSubAccountResponse {

    @XmlElement(name = "ListSubAccountResult")
    protected String listSubAccountResult;
    @XmlElement(name = "ReportCSV")
    protected String reportCSV;
    @XmlElement(name = "ResultText")
    protected String resultText;
    @XmlElement(name = "Code")
    protected String code;

    /**
     * Gets the value of the listSubAccountResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListSubAccountResult() {
        return listSubAccountResult;
    }

    /**
     * Sets the value of the listSubAccountResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListSubAccountResult(String value) {
        this.listSubAccountResult = value;
    }

    /**
     * Gets the value of the reportCSV property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportCSV() {
        return reportCSV;
    }

    /**
     * Sets the value of the reportCSV property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportCSV(String value) {
        this.reportCSV = value;
    }

    /**
     * Gets the value of the resultText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultText() {
        return resultText;
    }

    /**
     * Sets the value of the resultText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultText(String value) {
        this.resultText = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

}
