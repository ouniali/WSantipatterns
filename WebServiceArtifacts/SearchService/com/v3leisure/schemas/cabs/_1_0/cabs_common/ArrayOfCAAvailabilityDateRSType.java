
package com.v3leisure.schemas.cabs._1_0.cabs_common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCA_AvailabilityDateRSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCA_AvailabilityDateRSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AvailabilityDate" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}CA_AvailabilityDateRSType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCA_AvailabilityDateRSType", propOrder = {
    "availabilityDate"
})
public class ArrayOfCAAvailabilityDateRSType {

    @XmlElement(name = "AvailabilityDate")
    protected List<CAAvailabilityDateRSType> availabilityDate;

    /**
     * Gets the value of the availabilityDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availabilityDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailabilityDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CAAvailabilityDateRSType }
     * 
     * 
     */
    public List<CAAvailabilityDateRSType> getAvailabilityDate() {
        if (availabilityDate == null) {
            availabilityDate = new ArrayList<CAAvailabilityDateRSType>();
        }
        return this.availabilityDate;
    }

}
