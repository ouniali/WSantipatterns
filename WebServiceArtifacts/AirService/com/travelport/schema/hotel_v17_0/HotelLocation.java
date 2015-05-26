
package com.travelport.schema.hotel_v17_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v15_0.VendorLocation;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}VendorLocation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Location" type="{http://www.travelport.com/schema/common_v15_0}typeIATACode" />
 *       &lt;attribute name="LocationType" type="{http://www.travelport.com/schema/hotel_v17_0}typeHotelLocation" default="Airport" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "vendorLocation"
})
@XmlRootElement(name = "HotelLocation")
public class HotelLocation {

    @XmlElement(name = "VendorLocation", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<VendorLocation> vendorLocation;
    @XmlAttribute(name = "Location")
    protected String location;
    @XmlAttribute(name = "LocationType")
    protected TypeHotelLocation locationType;

    /**
     * Gets the value of the vendorLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vendorLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVendorLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VendorLocation }
     * 
     * 
     */
    public List<VendorLocation> getVendorLocation() {
        if (vendorLocation == null) {
            vendorLocation = new ArrayList<VendorLocation>();
        }
        return this.vendorLocation;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the locationType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeHotelLocation }
     *     
     */
    public TypeHotelLocation getLocationType() {
        if (locationType == null) {
            return TypeHotelLocation.AIRPORT;
        } else {
            return locationType;
        }
    }

    /**
     * Sets the value of the locationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeHotelLocation }
     *     
     */
    public void setLocationType(TypeHotelLocation value) {
        this.locationType = value;
    }

}
