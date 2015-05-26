
package com.strikeiron;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAddressDistanceResultWithStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAddressDistanceResultWithStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddressDistanceResultWithStatus" type="{http://www.strikeiron.com}AddressDistanceResultWithStatus" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAddressDistanceResultWithStatus", propOrder = {
    "addressDistanceResultWithStatus"
})
public class ArrayOfAddressDistanceResultWithStatus {

    @XmlElement(name = "AddressDistanceResultWithStatus", nillable = true)
    protected List<AddressDistanceResultWithStatus> addressDistanceResultWithStatus;

    /**
     * Gets the value of the addressDistanceResultWithStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressDistanceResultWithStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressDistanceResultWithStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressDistanceResultWithStatus }
     * 
     * 
     */
    public List<AddressDistanceResultWithStatus> getAddressDistanceResultWithStatus() {
        if (addressDistanceResultWithStatus == null) {
            addressDistanceResultWithStatus = new ArrayList<AddressDistanceResultWithStatus>();
        }
        return this.addressDistanceResultWithStatus;
    }

}
