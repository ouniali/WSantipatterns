
package com.vodafone.gdsp.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getVpnGroupListResponseItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getVpnGroupListResponseItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vpnGroupList" type="{http://ws.gdsp.vodafone.com/}vpnGroupItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="returnCode" type="{http://ws.gdsp.vodafone.com/}returnCode"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVpnGroupListResponseItem", propOrder = {
    "vpnGroupList",
    "returnCode"
})
public class GetVpnGroupListResponseItem {

    protected List<VpnGroupItem> vpnGroupList;
    @XmlElement(required = true)
    protected ReturnCode returnCode;

    /**
     * Gets the value of the vpnGroupList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vpnGroupList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVpnGroupList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VpnGroupItem }
     * 
     * 
     */
    public List<VpnGroupItem> getVpnGroupList() {
        if (vpnGroupList == null) {
            vpnGroupList = new ArrayList<VpnGroupItem>();
        }
        return this.vpnGroupList;
    }

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

}
