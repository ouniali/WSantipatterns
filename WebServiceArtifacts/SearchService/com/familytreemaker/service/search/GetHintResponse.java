
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
 *         &lt;element name="GetHintResult" type="{urn:service.familytreemaker.com/Search}HintType"/>
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
    "getHintResult"
})
@XmlRootElement(name = "GetHintResponse")
public class GetHintResponse {

    @XmlElement(name = "GetHintResult", required = true, nillable = true)
    protected HintType getHintResult;

    /**
     * Gets the value of the getHintResult property.
     * 
     * @return
     *     possible object is
     *     {@link HintType }
     *     
     */
    public HintType getGetHintResult() {
        return getHintResult;
    }

    /**
     * Sets the value of the getHintResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link HintType }
     *     
     */
    public void setGetHintResult(HintType value) {
        this.getHintResult = value;
    }

}
