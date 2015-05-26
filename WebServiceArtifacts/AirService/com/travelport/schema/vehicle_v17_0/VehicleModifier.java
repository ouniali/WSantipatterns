
package com.travelport.schema.vehicle_v17_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v15_0.TypeFuel;
import com.travelport.schema.common_v15_0.TypeVehicleCategory;
import com.travelport.schema.common_v15_0.TypeVehicleClass;
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
 *       &lt;attribute name="AirConditioning" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="TransmissionType" type="{http://www.travelport.com/schema/common_v15_0}typeVehicleTransmission" default="Automatic" />
 *       &lt;attribute name="VehicleClass" type="{http://www.travelport.com/schema/common_v15_0}typeVehicleClass" />
 *       &lt;attribute name="Category" type="{http://www.travelport.com/schema/common_v15_0}typeVehicleCategory" />
 *       &lt;attribute name="DoorCount" type="{http://www.travelport.com/schema/common_v15_0}typeDoorCount" />
 *       &lt;attribute name="FuelType" type="{http://www.travelport.com/schema/common_v15_0}typeFuel" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "VehicleModifier")
public class VehicleModifier {

    @XmlAttribute(name = "AirConditioning")
    protected Boolean airConditioning;
    @XmlAttribute(name = "TransmissionType")
    protected TypeVehicleTransmission transmissionType;
    @XmlAttribute(name = "VehicleClass")
    protected TypeVehicleClass vehicleClass;
    @XmlAttribute(name = "Category")
    protected TypeVehicleCategory category;
    @XmlAttribute(name = "DoorCount")
    protected String doorCount;
    @XmlAttribute(name = "FuelType")
    protected TypeFuel fuelType;

    /**
     * Gets the value of the airConditioning property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAirConditioning() {
        if (airConditioning == null) {
            return true;
        } else {
            return airConditioning;
        }
    }

    /**
     * Sets the value of the airConditioning property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAirConditioning(Boolean value) {
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
        if (transmissionType == null) {
            return TypeVehicleTransmission.AUTOMATIC;
        } else {
            return transmissionType;
        }
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

}
