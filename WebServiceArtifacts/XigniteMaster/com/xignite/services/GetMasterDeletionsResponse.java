
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
 *         &lt;element name="GetMasterDeletionsResult" type="{http://www.xignite.com/services/}MasterDeletions" minOccurs="0"/>
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
    "getMasterDeletionsResult"
})
@XmlRootElement(name = "GetMasterDeletionsResponse")
public class GetMasterDeletionsResponse {

    @XmlElement(name = "GetMasterDeletionsResult")
    protected MasterDeletions getMasterDeletionsResult;

    /**
     * Gets the value of the getMasterDeletionsResult property.
     * 
     * @return
     *     possible object is
     *     {@link MasterDeletions }
     *     
     */
    public MasterDeletions getGetMasterDeletionsResult() {
        return getMasterDeletionsResult;
    }

    /**
     * Sets the value of the getMasterDeletionsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterDeletions }
     *     
     */
    public void setGetMasterDeletionsResult(MasterDeletions value) {
        this.getMasterDeletionsResult = value;
    }

}
