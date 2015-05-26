
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
 *         &lt;element name="GetHintFilteredResult" type="{urn:service.familytreemaker.com/Search}HintType"/>
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
    "getHintFilteredResult"
})
@XmlRootElement(name = "GetHintFilteredResponse")
public class GetHintFilteredResponse {

    @XmlElement(name = "GetHintFilteredResult", required = true, nillable = true)
    protected HintType getHintFilteredResult;

    /**
     * Gets the value of the getHintFilteredResult property.
     * 
     * @return
     *     possible object is
     *     {@link HintType }
     *     
     */
    public HintType getGetHintFilteredResult() {
        return getHintFilteredResult;
    }

    /**
     * Sets the value of the getHintFilteredResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link HintType }
     *     
     */
    public void setGetHintFilteredResult(HintType value) {
        this.getHintFilteredResult = value;
    }

}
