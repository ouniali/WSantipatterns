
package com.travelport.schema.vehicle_v17_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v15_0.TypeFuel;
import com.travelport.schema.common_v15_0.TypeVehicleCategory;
import com.travelport.schema.common_v15_0.TypeVehicleClass;
import com.travelport.schema.common_v15_0.TypeVehicleLocation;
import com.travelport.schema.common_v15_0.TypeVehicleTransmission;


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
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v17_0}VehicleRate" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="VendorCode" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeSupplierCode" />
 *       &lt;attribute name="AirConditioning" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="TransmissionType" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeVehicleTransmission" />
 *       &lt;attribute name="VehicleClass" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeVehicleClass" />
 *       &lt;attribute name="Category" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeVehicleCategory" />
 *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DoorCount" type="{http://www.travelport.com/schema/common_v15_0}typeDoorCount" />
 *       &lt;attribute name="Location" type="{http://www.travelport.com/schema/common_v15_0}typeVehicleLocation" />
 *       &lt;attribute name="VendorLocationKey" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *       &lt;attribute name="VendorName">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="20"/>
 *             &lt;minLength value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="AlternateVendor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FuelType" type="{http://www.travelport.com/schema/common_v15_0}typeFuel" />
 *       &lt;attribute name="Key" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "vehicleRate"
})
@XmlRootElement(name = "Vehicle")
public class Vehicle {

    @XmlElement(name = "VehicleRate")
    protected VehicleRate vehicleRate;
    @XmlAttribute(name = "VendorCode", required = true)
    protected String vendorCode;
    @XmlAttribute(name = "AirConditioning", required = true)
    protected boolean airConditioning;
    @XmlAttribute(name = "TransmissionType", required = true)
    protected TypeVehicleTransmission transmissionType;
    @XmlAttribute(name = "VehicleClass", required = true)
    protected TypeVehicleClass vehicleClass;
    @XmlAttribute(name = "Category", required = true)
    protected TypeVehicleCategory category;
    @XmlAttribute(name = "Description")
    protected String description;
    @XmlAttribute(name = "DoorCount")
    protected String doorCount;
    @XmlAttribute(name = "Location")
    protected TypeVehicleLocation location;
    @XmlAttribute(name = "VendorLocationKey")
    protected String vendorLocationKey;
    @XmlAttribute(name = "VendorName")
    protected String vendorName;
    @XmlAttribute(name = "AlternateVendor")
    protected String alternateVendor;
    @XmlAttribute(name = "FuelType")
    protected TypeFuel fuelType;
    @XmlAttribute(name = "Key")
    protected String key;

    /**
     * Gets the value of the vehicleRate property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleRate }
     *     
     */
    public VehicleRate getVehicleRate() {
        return vehicleRate;
    }

    /**
     * Sets the value of the vehicleRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRate }
     *     
     */
    public void setVehicleRate(VehicleRate value) {
        this.vehicleRate = value;
    }

    /**
     * Gets the value of the vendorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorCode() {
        return vendorCode;
    }

    /**
     * Sets the value of the vendorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorCode(String value) {
        this.vendorCode = value;
    }

    /**
     * Gets the value of the airConditioning property.
     * 
     */
    public boolean isAirConditioning() {
        return airConditioning;
    }

    /**
     * Sets the value of the airConditioning property.
     * 
     */
    public void setAirConditioning(boolean value) {
        this.airConditioning = value;
    }

    /**
     * Gets the value of the transmissionType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeVehicleTransmission }
     *     
     */
    public TypeVehicleTransmission getTransmissionType() {
        return transmissionType;
    }

    /**
     * Sets the value of the transmissionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeVehicleTransmission }
     *     
     */
    public void setTransmissionType(TypeVehicleTransmission value) {
        this.transmissionType = value;
    }

    /**
     * Gets the value of the vehicleClass property.
     * 
     * @return
     *     possible object is
     *     {@link TypeVehicleClass }
     *     
     */
    public TypeVehicleClass getVehicleClass() {
        return vehicleClass;
    }

    /**
     * Sets the value of the vehicleClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeVehicleClass }
     *     
     */
    public void setVehicleClass(TypeVehicleClass value) {
        this.vehicleClass = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link TypeVehicleCategory }
     *     
     */
    public TypeVehicleCategory getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeVehicleCategory }
     *     
     */
    public void setCategory(TypeVehicleCategory value) {
        this.category = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the doorCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoorCount() {
        return doorCount;
    }

    /**
     * Sets the value of the doorCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoorCount(String value) {
        this.doorCount = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link TypeVehicleLocation }
     *     
     */
    public TypeVehicleLocation getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeVehicleLocation }
     *     
     */
    public void setLocation(TypeVehicleLocation value) {
        this.location = value;
    }

    /**
     * Gets the value of the vendorLocationKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorLocationKey() {
        return vendorLocationKey;
    }

    /**
     * Sets the value of the vendorLocationKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorLocationKey(String value) {
        this.vendorLocationKey = value;
    }

    /**
     * Gets the value of the vendorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorName() {
        return vendorName;
    }

    /**
     * Sets the value of the vendorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorName(String value) {
        this.vendorName = value;
    }

    /**
     * Gets the value of the alternateVendor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateVendor() {
        return alternateVendor;
    }

    /**
     * Sets the value of the alternateVendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateVendor(String value) {
        this.alternateVendor = value;
    }

    /**
     * Gets the value of the fuelType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeFuel }
     *     
     */
    public TypeFuel getFuelType() {
        return fuelType;
    }

    /**
     * Sets the value of the fuelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeFuel }
     *     
     */
    public void setFuelType(TypeFuel value) {
        this.fuelType = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

}
