
package com.strikeiron;

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
 *         &lt;element name="GetStatusCodesResult" type="{http://www.strikeiron.com}SIWsOutputOfSIWsResultArrayOfMethodStatusRecord" minOccurs="0"/>
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
    "getStatusCodesResult"
})
@XmlRootElement(name = "GetStatusCodesResponse")
public class GetStatusCodesResponse {

    @XmlElement(name = "GetStatusCodesResult")
    protected SIWsOutputOfSIWsResultArrayOfMethodStatusRecord getStatusCodesResult;

    /**
     * Gets the value of the getStatusCodesResult property.
     * 
     * @return
     *     possible object is
     *     {@link SIWsOutputOfSIWsResultArrayOfMethodStatusRecord }
     *     
     */
    public SIWsOutputOfSIWsResultArrayOfMethodStatusRecord getGetStatusCodesResult() {
        return getStatusCodesResult;
    }

    /**
     * Sets the value of the getStatusCodesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SIWsOutputOfSIWsResultArrayOfMethodStatusRecord }
     *     
     */
    public void setGetStatusCodesResult(SIWsOutputOfSIWsResultArrayOfMethodStatusRecord value) {
        this.getStatusCodesResult = value;
    }

}
