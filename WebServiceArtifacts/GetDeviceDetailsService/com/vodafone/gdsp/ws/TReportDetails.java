
package com.vodafone.gdsp.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tReportDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tReportDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="formatsSupported" type="{http://ws.gdsp.vodafone.com/}tFormatDetails"/>
 *         &lt;element name="reportParameters" type="{http://ws.gdsp.vodafone.com/}tParameterGroup" maxOccurs="100" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tReportDetails", propOrder = {
    "formatsSupported",
    "reportParameters"
})
public class TReportDetails {

    @XmlElement(required = true)
    protected TFormatDetails formatsSupported;
    @XmlElement(nillable = true)
    protected List<TParameterGroup> reportParameters;

    /**
     * Gets the value of the formatsSupported property.
     * 
     * @return
     *     possible object is
     *     {@link TFormatDetails }
     *     
     */
    public TFormatDetails getFormatsSupported() {
        return formatsSupported;
    }

    /**
     * Sets the value of the formatsSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link TFormatDetails }
     *     
     */
    public void setFormatsSupported(TFormatDetails value) {
        this.formatsSupported = value;
    }

    /**
     * Gets the value of the reportParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reportParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReportParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TParameterGroup }
     * 
     * 
     */
    public List<TParameterGroup> getReportParameters() {
        if (reportParameters == null) {
            reportParameters = new ArrayList<TParameterGroup>();
        }
        return this.reportParameters;
    }

}
