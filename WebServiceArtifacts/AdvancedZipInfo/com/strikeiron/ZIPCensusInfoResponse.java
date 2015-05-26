
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
 *         &lt;element name="ZIPCensusInfoResult" type="{http://www.strikeiron.com}SIWsOutputOfCensusResult" minOccurs="0"/>
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
    "zipCensusInfoResult"
})
@XmlRootElement(name = "ZIPCensusInfoResponse")
public class ZIPCensusInfoResponse {

    @XmlElement(name = "ZIPCensusInfoResult")
    protected SIWsOutputOfCensusResult zipCensusInfoResult;

    /**
     * Gets the value of the zipCensusInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link SIWsOutputOfCensusResult }
     *     
     */
    public SIWsOutputOfCensusResult getZIPCensusInfoResult() {
        return zipCensusInfoResult;
    }

    /**
     * Sets the value of the zipCensusInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SIWsOutputOfCensusResult }
     *     
     */
    public void setZIPCensusInfoResult(SIWsOutputOfCensusResult value) {
        this.zipCensusInfoResult = value;
    }

}
