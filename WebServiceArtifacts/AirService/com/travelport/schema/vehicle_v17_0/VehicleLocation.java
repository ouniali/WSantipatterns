
package com.travelport.schema.vehicle_v17_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v15_0.CoordinateLocation;
import com.travelport.schema.common_v15_0.Distance;
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
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}VendorLocation"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}Distance" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}CoordinateLocation" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v17_0}LocationInformation"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "vendorLocation",
    "distance",
    "coordinateLocation",
    "locationInformation"
})
@XmlRootElement(name = "VehicleLocation")
public class VehicleLocation {

    @XmlElement(name = "VendorLocation", namespace = "http://www.travelport.com/schema/common_v15_0", required = true)
    protected VendorLocation vendorLocation;
    @XmlElement(name = "Distance", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected Distance distance;
    @XmlElement(name = "CoordinateLocation", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected CoordinateLocation coordinateLocation;
    @XmlElement(name = "LocationInformation", required = true)
    protected LocationInformation locationInformation;

    /**
     * Gets the value of the vendorLocation property.
     * 
     * @return
     *     possible object is
     *     {@link VendorLocation }
     *     
     */
    public VendorLocation getVendorLocation() {
        return vendorLocation;
    }

    /**
     * Sets the value of the vendorLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorLocation }
     *     
     */
    public void setVendorLocation(VendorLocation value) {
        this.vendorLocation = value;
    }

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link Distance }
     *     
     */
    public Distance getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Distance }
     *     
     */
    public void setDistance(Distance value) {
        this.distance = value;
    }

    /**
     * Gets the value of the coordinateLocation property.
     * 
     * @return
     *     possible object is
     *     {@link CoordinateLocation }
     *     
     */
    public CoordinateLocation getCoordinateLocation() {
        return coordinateLocation;
    }

    /**
     * Sets the value of the coordinateLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordinateLocation }
     *     
     */
    public void setCoordinateLocation(CoordinateLocation value) {
        this.coordinateLocation = value;
    }

    /**
     * Gets the value of the locationInformation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationInformation }
     *     
     */
    public LocationInformation getLocationInformation() {
        return locationInformation;
    }

    /**
     * Sets the value of the locationInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationInformation }
     *     
     */
    public void setLocationInformation(LocationInformation value) {
        this.locationInformation = value;
    }

}
