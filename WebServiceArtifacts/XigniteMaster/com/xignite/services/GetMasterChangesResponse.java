
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
 *         &lt;element name="GetMasterChangesResult" type="{http://www.xignite.com/services/}MasterChanges" minOccurs="0"/>
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
    "getMasterChangesResult"
})
@XmlRootElement(name = "GetMasterChangesResponse")
public class GetMasterChangesResponse {

    @XmlElement(name = "GetMasterChangesResult")
    protected MasterChanges getMasterChangesResult;

    /**
     * Gets the value of the getMasterChangesResult property.
     * 
     * @return
     *     possible object is
     *     {@link MasterChanges }
     *     
     */
    public MasterChanges getGetMasterChangesResult() {
        return getMasterChangesResult;
    }

    /**
     * Sets the value of the getMasterChangesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterChanges }
     *     
     */
    public void setGetMasterChangesResult(MasterChanges value) {
        this.getMasterChangesResult = value;
    }

}
