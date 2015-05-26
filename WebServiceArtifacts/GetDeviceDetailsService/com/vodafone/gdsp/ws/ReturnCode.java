
package com.vodafone.gdsp.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for returnCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="returnCode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="majorReturnCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="minorReturnCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "returnCode", propOrder = {
    "majorReturnCode",
    "minorReturnCode"
})
public class ReturnCode {

    protected String majorReturnCode;
    protected String minorReturnCode;

    /**
     * Gets the value of the majorReturnCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMajorReturnCode() {
        return majorReturnCode;
    }

    /**
     * Sets the value of the majorReturnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMajorReturnCode(String value) {
        this.majorReturnCode = value;
    }

    /**
     * Gets the value of the minorReturnCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinorReturnCode() {
        return minorReturnCode;
    }

    /**
     * Sets the value of the minorReturnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinorReturnCode(String value) {
        this.minorReturnCode = value;
    }

}
