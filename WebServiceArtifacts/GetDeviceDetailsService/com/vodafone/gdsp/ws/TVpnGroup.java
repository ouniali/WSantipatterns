
package com.vodafone.gdsp.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tVpnGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tVpnGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vpnGroupDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vpnGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tVpnGroup", propOrder = {
    "vpnGroupDescription",
    "vpnGroupName"
})
public class TVpnGroup {

    protected String vpnGroupDescription;
    protected String vpnGroupName;

    /**
     * Gets the value of the vpnGroupDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVpnGroupDescription() {
        return vpnGroupDescription;
    }

    /**
     * Sets the value of the vpnGroupDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVpnGroupDescription(String value) {
        this.vpnGroupDescription = value;
    }

    /**
     * Gets the value of the vpnGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVpnGroupName() {
        return vpnGroupName;
    }

    /**
     * Sets the value of the vpnGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVpnGroupName(String value) {
        this.vpnGroupName = value;
    }

}
