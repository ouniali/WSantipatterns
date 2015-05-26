
package com.v3leisure.schemas.cabs._1_0.cabs_common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPR_PickupLocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPR_PickupLocationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PickupLocation" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}PR_PickupLocationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPR_PickupLocationType", propOrder = {
    "pickupLocation"
})
public class ArrayOfPRPickupLocationType {

    @XmlElement(name = "PickupLocation")
    protected List<PRPickupLocationType> pickupLocation;

    /**
     * Gets the value of the pickupLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pickupLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPickupLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRPickupLocationType }
     * 
     * 
     */
    public List<PRPickupLocationType> getPickupLocation() {
        if (pickupLocation == null) {
            pickupLocation = new ArrayList<PRPickupLocationType>();
        }
        return this.pickupLocation;
    }

}
