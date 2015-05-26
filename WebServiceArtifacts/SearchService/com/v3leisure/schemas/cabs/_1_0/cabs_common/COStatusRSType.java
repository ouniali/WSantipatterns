
package com.v3leisure.schemas.cabs._1_0.cabs_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CO_StatusRSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CO_StatusRSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Success" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}CO_SuccessRSType" minOccurs="0"/>
 *         &lt;element name="Errors" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}ArrayOfMessageRSType" minOccurs="0"/>
 *         &lt;element name="Warnings" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}ArrayOfMessageRSType1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CO_StatusRSType", propOrder = {
    "success",
    "errors",
    "warnings"
})
public class COStatusRSType {

    @XmlElement(name = "Success")
    protected COSuccessRSType success;
    @XmlElement(name = "Errors")
    protected ArrayOfMessageRSType errors;
    @XmlElement(name = "Warnings")
    protected ArrayOfMessageRSType1 warnings;

    /**
     * Gets the value of the success property.
     * 
     * @return
     *     possible object is
     *     {@link COSuccessRSType }
     *     
     */
    public COSuccessRSType getSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     * @param value
     *     allowed object is
     *     {@link COSuccessRSType }
     *     
     */
    public void setSuccess(COSuccessRSType value) {
        this.success = value;
    }

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMessageRSType }
     *     
     */
    public ArrayOfMessageRSType getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMessageRSType }
     *     
     */
    public void setErrors(ArrayOfMessageRSType value) {
        this.errors = value;
    }

    /**
     * Gets the value of the warnings property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMessageRSType1 }
     *     
     */
    public ArrayOfMessageRSType1 getWarnings() {
        return warnings;
    }

    /**
     * Sets the value of the warnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMessageRSType1 }
     *     
     */
    public void setWarnings(ArrayOfMessageRSType1 value) {
        this.warnings = value;
    }

}
