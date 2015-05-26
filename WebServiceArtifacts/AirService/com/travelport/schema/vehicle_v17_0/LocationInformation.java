
package com.travelport.schema.vehicle_v17_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v15_0.TypeStructuredAddress;
import com.travelport.schema.common_v15_0.TypeVehicleLocation;


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
 *         &lt;element name="Address" type="{http://www.travelport.com/schema/common_v15_0}typeStructuredAddress" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.travelport.com/schema/vehicle_v17_0}attrAreaInfo"/>
 *       &lt;attribute name="LocationType" type="{http://www.travelport.com/schema/common_v15_0}typeVehicleLocation" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "address"
})
@XmlRootElement(name = "LocationInformation")
public class LocationInformation {

    @XmlElement(name = "Address")
    protected TypeStructuredAddress address;
    @XmlAttribute(name = "LocationType")
    protected TypeVehicleLocation locationType;
    @XmlAttribute(name = "AreaGroup")
    protected String areaGroup;
    @XmlAttribute(name = "Location")
    protected String location;
    @XmlAttribute(name = "AreaType")
    protected TypeAreaInfo areaType;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link TypeStructuredAddress }
     *     
     */
    public TypeStructuredAddress getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeStructuredAddress }
     *     
     */
    public void setAddress(TypeStructuredAddress value) {
        this.address = value;
    }

    /**
     * Gets the value of the locationType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeVehicleLocation }
     *     
     */
    public TypeVehicleLocation getLocationType() {
        return locationType;
    }

    /**
     * Sets the value of the locationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeVehicleLocation }
     *     
     */
    public void setLocationType(TypeVehicleLocation value) {
        this.locationType = value;
    }

    /**
     * Gets the value of the areaGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaGroup() {
        return areaGroup;
    }

    /**
     * Sets the value of the areaGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaGroup(String value) {
        this.areaGroup = value;
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
     * Gets the value of the areaType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeAreaInfo }
     *     
     */
    public TypeAreaInfo getAreaType() {
        return areaType;
    }

    /**
     * Sets the value of the areaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAreaInfo }
     *     
     */
    public void setAreaType(TypeAreaInfo value) {
        this.areaType = value;
    }

}
