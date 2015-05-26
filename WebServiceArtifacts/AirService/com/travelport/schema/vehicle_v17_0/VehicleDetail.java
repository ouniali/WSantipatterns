
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
 *       &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SupplierCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PassengerCount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NumberOfDoors" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BagCount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Class" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeVehicleClass" />
 *       &lt;attribute name="Category" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeVehicleCategory" />
 *       &lt;attribute name="AirConditioning" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Transmission" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeVehicleTransmission" />
 *       &lt;attribute name="MakeModel" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlRootElement(name = "VehicleDetail")
public class VehicleDetail {

    @XmlAttribute(name = "Code", required = true)
    protected String code;
    @XmlAttribute(name = "SupplierCode")
    protected String supplierCode;
    @XmlAttribute(name = "PassengerCount")
    protected String passengerCount;
    @XmlAttribute(name = "NumberOfDoors")
    protected String numberOfDoors;
    @XmlAttribute(name = "BagCount")
    protected String bagCount;
    @XmlAttribute(name = "Class", required = true)
    protected TypeVehicleClass clazz;
    @XmlAttribute(name = "Category", required = true)
    protected TypeVehicleCategory category;
    @XmlAttribute(name = "AirConditioning", required = true)
    protected boolean airConditioning;
    @XmlAttribute(name = "Transmission", required = true)
    protected TypeVehicleTransmission transmission;
    @XmlAttribute(name = "MakeModel", required = true)
    protected String makeModel;
    @XmlAttribute(name = "FuelType")
    protected TypeFuel fuelType;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the supplierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierCode() {
        return supplierCode;
    }

    /**
     * Sets the value of the supplierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierCode(String value) {
        this.supplierCode = value;
    }

    /**
     * Gets the value of the passengerCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerCount() {
        return passengerCount;
    }

    /**
     * Sets the value of the passengerCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerCount(String value) {
        this.passengerCount = value;
    }

    /**
     * Gets the value of the numberOfDoors property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfDoors() {
        return numberOfDoors;
    }

    /**
     * Sets the value of the numberOfDoors property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfDoors(String value) {
        this.numberOfDoors = value;
    }

    /**
     * Gets the value of the bagCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBagCount() {
        return bagCount;
    }

    /**
     * Sets the value of the bagCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBagCount(String value) {
        this.bagCount = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link TypeVehicleClass }
     *     
     */
    public TypeVehicleClass getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeVehicleClass }
     *     
     */
    public void setClazz(TypeVehicleClass value) {
        this.clazz = value;
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
     * Gets the value of the transmission property.
     * 
     * @return
     *     possible object is
     *     {@link TypeVehicleTransmission }
     *     
     */
    public TypeVehicleTransmission getTransmission() {
        return transmission;
    }

    /**
     * Sets the value of the transmission property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeVehicleTransmission }
     *     
     */
    public void setTransmission(TypeVehicleTransmission value) {
        this.transmission = value;
    }

    /**
     * Gets the value of the makeModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMakeModel() {
        return makeModel;
    }

    /**
     * Sets the value of the makeModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMakeModel(String value) {
        this.makeModel = value;
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
