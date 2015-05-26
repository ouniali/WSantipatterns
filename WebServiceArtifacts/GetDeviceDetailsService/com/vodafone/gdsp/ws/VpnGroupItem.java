
package com.vodafone.gdsp.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vpnGroupItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vpnGroupItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vpnGroup" type="{http://ws.gdsp.vodafone.com/}tVpnGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vpnGroupItem", propOrder = {
    "vpnGroup"
})
public class VpnGroupItem {

    protected List<TVpnGroup> vpnGroup;

    /**
     * Gets the value of the vpnGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vpnGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVpnGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TVpnGroup }
     * 
     * 
     */
    public List<TVpnGroup> getVpnGroup() {
        if (vpnGroup == null) {
            vpnGroup = new ArrayList<TVpnGroup>();
        }
        return this.vpnGroup;
    }

}
