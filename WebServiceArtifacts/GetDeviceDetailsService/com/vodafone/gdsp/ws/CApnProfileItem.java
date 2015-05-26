
package com.vodafone.gdsp.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cApnProfileItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cApnProfileItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apnName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="staticIpAddress" type="{http://ws.gdsp.vodafone.com/}tIpV4Address" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cApnProfileItem", propOrder = {
    "apnName",
    "staticIpAddress"
})
public class CApnProfileItem {

    protected String apnName;
    protected String staticIpAddress;

    /**
     * Gets the value of the apnName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApnName() {
        return apnName;
    }

    /**
     * Sets the value of the apnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApnName(String value) {
        this.apnName = value;
    }

    /**
     * Gets the value of the staticIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaticIpAddress() {
        return staticIpAddress;
    }

    /**
     * Sets the value of the staticIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaticIpAddress(String value) {
        this.staticIpAddress = value;
    }

}
