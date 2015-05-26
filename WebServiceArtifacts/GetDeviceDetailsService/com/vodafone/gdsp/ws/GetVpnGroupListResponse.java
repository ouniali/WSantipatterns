
package com.vodafone.gdsp.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getVpnGroupListResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getVpnGroupListResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://ws.gdsp.vodafone.com/}getVpnGroupListResponseItem"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVpnGroupListResponse", propOrder = {
    "_return"
})
public class GetVpnGroupListResponse {

    @XmlElement(name = "return", required = true)
    protected GetVpnGroupListResponseItem _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetVpnGroupListResponseItem }
     *     
     */
    public GetVpnGroupListResponseItem getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetVpnGroupListResponseItem }
     *     
     */
    public void setReturn(GetVpnGroupListResponseItem value) {
        this._return = value;
    }

}
