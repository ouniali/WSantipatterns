
package com.travelport.schema.vehicle_v17_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
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
 *       &lt;attribute name="ReturnDateTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ReturnLocation" type="{http://www.travelport.com/schema/common_v15_0}typeIATACode" />
 *       &lt;attribute name="ReturnLocationType" type="{http://www.travelport.com/schema/common_v15_0}typeVehicleLocation" />
 *       &lt;attribute name="ReturnLocationNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "VehicleReturnDateLocation")
public class VehicleReturnDateLocation {

    @XmlAttribute(name = "ReturnDateTime")
    protected String returnDateTime;
    @XmlAttribute(name = "ReturnLocation")
    protected String returnLocation;
    @XmlAttribute(name = "ReturnLocationType")
    protected TypeVehicleLocation returnLocationType;
    @XmlAttribute(name = "ReturnLocationNumber")
    protected String returnLocationNumber;

    /**
     * Gets the value of the returnDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnDateTime() {
        return returnDateTime;
    }

    /**
     * Sets the value of the returnDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnDateTime(String value) {
        this.returnDateTime = value;
    }

    /**
     * Gets the value of the returnLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnLocation() {
        return returnLocation;
    }

    /**
     * Sets the value of the returnLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnLocation(String value) {
        this.returnLocation = value;
    }

    /**
     * Gets the value of the returnLocationType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeVehicleLocation }
     *     
     */
    public TypeVehicleLocation getReturnLocationType() {
        return returnLocationType;
    }

    /**
     * Sets the value of the returnLocationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeVehicleLocation }
     *     
     */
    public void setReturnLocationType(TypeVehicleLocation value) {
        this.returnLocationType = value;
    }

    /**
     * Gets the value of the returnLocationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnLocationNumber() {
        return returnLocationNumber;
    }

    /**
     * Sets the value of the returnLocationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnLocationNumber(String value) {
        this.returnLocationNumber = value;
    }

}
