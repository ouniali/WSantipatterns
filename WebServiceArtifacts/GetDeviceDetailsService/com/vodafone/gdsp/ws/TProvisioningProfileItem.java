
package com.vodafone.gdsp.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tProvisioningProfileItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tProvisioningProfileItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="provisioningProfile" type="{http://ws.gdsp.vodafone.com/}tProvisioningProfile" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tProvisioningProfileItem", propOrder = {
    "provisioningProfile"
})
public class TProvisioningProfileItem {

    @XmlElement(nillable = true)
    protected List<TProvisioningProfile> provisioningProfile;

    /**
     * Gets the value of the provisioningProfile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the provisioningProfile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProvisioningProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TProvisioningProfile }
     * 
     * 
     */
    public List<TProvisioningProfile> getProvisioningProfile() {
        if (provisioningProfile == null) {
            provisioningProfile = new ArrayList<TProvisioningProfile>();
        }
        return this.provisioningProfile;
    }

}
