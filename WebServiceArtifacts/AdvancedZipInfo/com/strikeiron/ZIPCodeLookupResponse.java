
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
 *         &lt;element name="ZIPCodeLookupResult" type="{http://www.strikeiron.com}SIWsOutputOfZIPCodeResult" minOccurs="0"/>
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
    "zipCodeLookupResult"
})
@XmlRootElement(name = "ZIPCodeLookupResponse")
public class ZIPCodeLookupResponse {

    @XmlElement(name = "ZIPCodeLookupResult")
    protected SIWsOutputOfZIPCodeResult zipCodeLookupResult;

    /**
     * Gets the value of the zipCodeLookupResult property.
     * 
     * @return
     *     possible object is
     *     {@link SIWsOutputOfZIPCodeResult }
     *     
     */
    public SIWsOutputOfZIPCodeResult getZIPCodeLookupResult() {
        return zipCodeLookupResult;
    }

    /**
     * Sets the value of the zipCodeLookupResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SIWsOutputOfZIPCodeResult }
     *     
     */
    public void setZIPCodeLookupResult(SIWsOutputOfZIPCodeResult value) {
        this.zipCodeLookupResult = value;
    }

}
