
package com.xignite.services;

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
 *         &lt;element name="GetMasterAdditionsResult" type="{http://www.xignite.com/services/}MasterAdditions" minOccurs="0"/>
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
    "getMasterAdditionsResult"
})
@XmlRootElement(name = "GetMasterAdditionsResponse")
public class GetMasterAdditionsResponse {

    @XmlElement(name = "GetMasterAdditionsResult")
    protected MasterAdditions getMasterAdditionsResult;

    /**
     * Gets the value of the getMasterAdditionsResult property.
     * 
     * @return
     *     possible object is
     *     {@link MasterAdditions }
     *     
     */
    public MasterAdditions getGetMasterAdditionsResult() {
        return getMasterAdditionsResult;
    }

    /**
     * Sets the value of the getMasterAdditionsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterAdditions }
     *     
     */
    public void setGetMasterAdditionsResult(MasterAdditions value) {
        this.getMasterAdditionsResult = value;
    }

}
