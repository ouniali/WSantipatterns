
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
 *         &lt;element name="GetStatusCodesForMethodResult" type="{http://www.strikeiron.com}SIWsOutputOfMethodStatusRecord" minOccurs="0"/>
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
    "getStatusCodesForMethodResult"
})
@XmlRootElement(name = "GetStatusCodesForMethodResponse")
public class GetStatusCodesForMethodResponse {

    @XmlElement(name = "GetStatusCodesForMethodResult")
    protected SIWsOutputOfMethodStatusRecord getStatusCodesForMethodResult;

    /**
     * Gets the value of the getStatusCodesForMethodResult property.
     * 
     * @return
     *     possible object is
     *     {@link SIWsOutputOfMethodStatusRecord }
     *     
     */
    public SIWsOutputOfMethodStatusRecord getGetStatusCodesForMethodResult() {
        return getStatusCodesForMethodResult;
    }

    /**
     * Sets the value of the getStatusCodesForMethodResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SIWsOutputOfMethodStatusRecord }
     *     
     */
    public void setGetStatusCodesForMethodResult(SIWsOutputOfMethodStatusRecord value) {
        this.getStatusCodesForMethodResult = value;
    }

}
