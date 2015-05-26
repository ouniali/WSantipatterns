
package com.vodafone.gdsp.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tCustomerServiceProfileItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tCustomerServiceProfileItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customerServiceProfile" type="{http://ws.gdsp.vodafone.com/}tCustomerServiceProfile" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tCustomerServiceProfileItem", propOrder = {
    "customerServiceProfile"
})
public class TCustomerServiceProfileItem {

    @XmlElement(nillable = true)
    protected List<TCustomerServiceProfile> customerServiceProfile;

    /**
     * Gets the value of the customerServiceProfile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerServiceProfile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerServiceProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TCustomerServiceProfile }
     * 
     * 
     */
    public List<TCustomerServiceProfile> getCustomerServiceProfile() {
        if (customerServiceProfile == null) {
            customerServiceProfile = new ArrayList<TCustomerServiceProfile>();
        }
        return this.customerServiceProfile;
    }

}
