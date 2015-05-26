
package com.travelport.schema.universal_v16_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v16_0}VehicleAdd" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v16_0}VehicleDelete" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v16_0}VehicleUpdate" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v16_0}AirAdd" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v16_0}AirDelete" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v16_0}AirUpdate" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v16_0}UniversalAdd" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v16_0}UniversalDelete" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v16_0}UniversalUpdate" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v16_0}HotelAdd" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v16_0}HotelUpdate" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v16_0}HotelDelete" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v16_0}PassiveAdd" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v16_0}PassiveDelete" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "vehicleAdd",
    "vehicleDelete",
    "vehicleUpdate",
    "airAdd",
    "airDelete",
    "airUpdate",
    "universalAdd",
    "universalDelete",
    "universalUpdate",
    "hotelAdd",
    "hotelUpdate",
    "hotelDelete",
    "passiveAdd",
    "passiveDelete"
})
@XmlRootElement(name = "UniversalModifyCmd")
public class UniversalModifyCmd {

    @XmlElement(name = "VehicleAdd")
    protected VehicleAdd vehicleAdd;
    @XmlElement(name = "VehicleDelete")
    protected VehicleDelete vehicleDelete;
    @XmlElement(name = "VehicleUpdate")
    protected VehicleUpdate vehicleUpdate;
    @XmlElement(name = "AirAdd")
    protected AirAdd airAdd;
    @XmlElement(name = "AirDelete")
    protected AirDelete airDelete;
    @XmlElement(name = "AirUpdate")
    protected AirUpdate airUpdate;
    @XmlElement(name = "UniversalAdd")
    protected UniversalAdd universalAdd;
    @XmlElement(name = "UniversalDelete")
    protected UniversalDelete universalDelete;
    @XmlElement(name = "UniversalUpdate")
    protected UniversalUpdate universalUpdate;
    @XmlElement(name = "HotelAdd")
    protected HotelAdd hotelAdd;
    @XmlElement(name = "HotelUpdate")
    protected HotelUpdate hotelUpdate;
    @XmlElement(name = "HotelDelete")
    protected HotelDelete hotelDelete;
    @XmlElement(name = "PassiveAdd")
    protected PassiveAdd passiveAdd;
    @XmlElement(name = "PassiveDelete")
    protected PassiveDelete passiveDelete;

    /**
     * Gets the value of the vehicleAdd property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleAdd }
     *     
     */
    public VehicleAdd getVehicleAdd() {
        return vehicleAdd;
    }

    /**
     * Sets the value of the vehicleAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleAdd }
     *     
     */
    public void setVehicleAdd(VehicleAdd value) {
        this.vehicleAdd = value;
    }

    /**
     * Gets the value of the vehicleDelete property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleDelete }
     *     
     */
    public VehicleDelete getVehicleDelete() {
        return vehicleDelete;
    }

    /**
     * Sets the value of the vehicleDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleDelete }
     *     
     */
    public void setVehicleDelete(VehicleDelete value) {
        this.vehicleDelete = value;
    }

    /**
     * Gets the value of the vehicleUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleUpdate }
     *     
     */
    public VehicleUpdate getVehicleUpdate() {
        return vehicleUpdate;
    }

    /**
     * Sets the value of the vehicleUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleUpdate }
     *     
     */
    public void setVehicleUpdate(VehicleUpdate value) {
        this.vehicleUpdate = value;
    }

    /**
     * Gets the value of the airAdd property.
     * 
     * @return
     *     possible object is
     *     {@link AirAdd }
     *     
     */
    public AirAdd getAirAdd() {
        return airAdd;
    }

    /**
     * Sets the value of the airAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirAdd }
     *     
     */
    public void setAirAdd(AirAdd value) {
        this.airAdd = value;
    }

    /**
     * Gets the value of the airDelete property.
     * 
     * @return
     *     possible object is
     *     {@link AirDelete }
     *     
     */
    public AirDelete getAirDelete() {
        return airDelete;
    }

    /**
     * Sets the value of the airDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirDelete }
     *     
     */
    public void setAirDelete(AirDelete value) {
        this.airDelete = value;
    }

    /**
     * Gets the value of the airUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link AirUpdate }
     *     
     */
    public AirUpdate getAirUpdate() {
        return airUpdate;
    }

    /**
     * Sets the value of the airUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirUpdate }
     *     
     */
    public void setAirUpdate(AirUpdate value) {
        this.airUpdate = value;
    }

    /**
     * Gets the value of the universalAdd property.
     * 
     * @return
     *     possible object is
     *     {@link UniversalAdd }
     *     
     */
    public UniversalAdd getUniversalAdd() {
        return universalAdd;
    }

    /**
     * Sets the value of the universalAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniversalAdd }
     *     
     */
    public void setUniversalAdd(UniversalAdd value) {
        this.universalAdd = value;
    }

    /**
     * Gets the value of the universalDelete property.
     * 
     * @return
     *     possible object is
     *     {@link UniversalDelete }
     *     
     */
    public UniversalDelete getUniversalDelete() {
        return universalDelete;
    }

    /**
     * Sets the value of the universalDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniversalDelete }
     *     
     */
    public void setUniversalDelete(UniversalDelete value) {
        this.universalDelete = value;
    }

    /**
     * Gets the value of the universalUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link UniversalUpdate }
     *     
     */
    public UniversalUpdate getUniversalUpdate() {
        return universalUpdate;
    }

    /**
     * Sets the value of the universalUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniversalUpdate }
     *     
     */
    public void setUniversalUpdate(UniversalUpdate value) {
        this.universalUpdate = value;
    }

    /**
     * Gets the value of the hotelAdd property.
     * 
     * @return
     *     possible object is
     *     {@link HotelAdd }
     *     
     */
    public HotelAdd getHotelAdd() {
        return hotelAdd;
    }

    /**
     * Sets the value of the hotelAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelAdd }
     *     
     */
    public void setHotelAdd(HotelAdd value) {
        this.hotelAdd = value;
    }

    /**
     * Gets the value of the hotelUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link HotelUpdate }
     *     
     */
    public HotelUpdate getHotelUpdate() {
        return hotelUpdate;
    }

    /**
     * Sets the value of the hotelUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelUpdate }
     *     
     */
    public void setHotelUpdate(HotelUpdate value) {
        this.hotelUpdate = value;
    }

    /**
     * Gets the value of the hotelDelete property.
     * 
     * @return
     *     possible object is
     *     {@link HotelDelete }
     *     
     */
    public HotelDelete getHotelDelete() {
        return hotelDelete;
    }

    /**
     * Sets the value of the hotelDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelDelete }
     *     
     */
    public void setHotelDelete(HotelDelete value) {
        this.hotelDelete = value;
    }

    /**
     * Gets the value of the passiveAdd property.
     * 
     * @return
     *     possible object is
     *     {@link PassiveAdd }
     *     
     */
    public PassiveAdd getPassiveAdd() {
        return passiveAdd;
    }

    /**
     * Sets the value of the passiveAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassiveAdd }
     *     
     */
    public void setPassiveAdd(PassiveAdd value) {
        this.passiveAdd = value;
    }

    /**
     * Gets the value of the passiveDelete property.
     * 
     * @return
     *     possible object is
     *     {@link PassiveDelete }
     *     
     */
    public PassiveDelete getPassiveDelete() {
        return passiveDelete;
    }

    /**
     * Sets the value of the passiveDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassiveDelete }
     *     
     */
    public void setPassiveDelete(PassiveDelete value) {
        this.passiveDelete = value;
    }

}
