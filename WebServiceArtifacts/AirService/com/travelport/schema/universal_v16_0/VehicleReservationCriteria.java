
package com.travelport.schema.universal_v16_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;sequence>
 *         &lt;element name="PickUpDate" type="{http://www.travelport.com/schema/universal_v16_0}typeDateSpec" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="VehicleConfirmation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Location" type="{http://www.travelport.com/schema/common_v15_0}typeIATACode" />
 *       &lt;attribute name="VendorCode" type="{http://www.travelport.com/schema/common_v15_0}typeSupplierCode" />
 *       &lt;attribute name="LocationNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PassiveOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pickUpDate"
})
@XmlRootElement(name = "VehicleReservationCriteria")
public class VehicleReservationCriteria {

    @XmlElement(name = "PickUpDate")
    protected TypeDateSpec pickUpDate;
    @XmlAttribute(name = "VehicleConfirmation")
    protected String vehicleConfirmation;
    @XmlAttribute(name = "Location")
    protected String location;
    @XmlAttribute(name = "VendorCode")
    protected String vendorCode;
    @XmlAttribute(name = "LocationNumber")
    protected String locationNumber;
    @XmlAttribute(name = "PassiveOnly")
    protected Boolean passiveOnly;

    /**
     * Gets the value of the pickUpDate property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDateSpec }
     *     
     */
    public TypeDateSpec getPickUpDate() {
        return pickUpDate;
    }

    /**
     * Sets the value of the pickUpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDateSpec }
     *     
     */
    public void setPickUpDate(TypeDateSpec value) {
        this.pickUpDate = value;
    }

    /**
     * Gets the value of the vehicleConfirmation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleConfirmation() {
        return vehicleConfirmation;
    }

    /**
     * Sets the value of the vehicleConfirmation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleConfirmation(String value) {
        this.vehicleConfirmation = value;
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
     * Gets the value of the locationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationNumber() {
        return locationNumber;
    }

    /**
     * Sets the value of the locationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationNumber(String value) {
        this.locationNumber = value;
    }

    /**
     * Gets the value of the passiveOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPassiveOnly() {
        if (passiveOnly == null) {
            return false;
        } else {
            return passiveOnly;
        }
    }

    /**
     * Sets the value of the passiveOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPassiveOnly(Boolean value) {
        this.passiveOnly = value;
    }

}
