
package com.vodafone.gdsp.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for provisioningProfileResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="provisioningProfileResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="returnCode" type="{http://ws.gdsp.vodafone.com/}returnCode" minOccurs="0"/>
 *         &lt;element name="provisioningProfileList" type="{http://ws.gdsp.vodafone.com/}tProvisioningProfileItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "provisioningProfileResponse", propOrder = {
    "returnCode",
    "provisioningProfileList"
})
public class ProvisioningProfileResponse {

    protected ReturnCode returnCode;
    protected TProvisioningProfileItem provisioningProfileList;

    /**
     * Gets the value of the returnCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnCode }
     *     
     */
    public ReturnCode getReturnCode() {
        return returnCode;
    }

    /**
     * Sets the value of the returnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnCode }
     *     
     */
    public void setReturnCode(ReturnCode value) {
        this.returnCode = value;
    }

    /**
     * Gets the value of the provisioningProfileList property.
     * 
     * @return
     *     possible object is
     *     {@link TProvisioningProfileItem }
     *     
     */
    public TProvisioningProfileItem getProvisioningProfileList() {
        return provisioningProfileList;
    }

    /**
     * Sets the value of the provisioningProfileList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TProvisioningProfileItem }
     *     
     */
    public void setProvisioningProfileList(TProvisioningProfileItem value) {
        this.provisioningProfileList = value;
    }

}
