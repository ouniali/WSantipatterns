
package com.travelport.schema.vehicle_v17_0;

import java.util.ArrayList;
import java.util.List;
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
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v17_0}VehicleDisclaimer" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v17_0}VehicleDetail" maxOccurs="unbounded" minOccurs="0"/>
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
    "vehicleDisclaimer",
    "vehicleDetail"
})
@XmlRootElement(name = "VehiclePolicy")
public class VehiclePolicy {

    @XmlElement(name = "VehicleDisclaimer")
    protected List<VehicleDisclaimer> vehicleDisclaimer;
    @XmlElement(name = "VehicleDetail")
    protected List<VehicleDetail> vehicleDetail;

    /**
     * Gets the value of the vehicleDisclaimer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleDisclaimer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleDisclaimer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleDisclaimer }
     * 
     * 
     */
    public List<VehicleDisclaimer> getVehicleDisclaimer() {
        if (vehicleDisclaimer == null) {
            vehicleDisclaimer = new ArrayList<VehicleDisclaimer>();
        }
        return this.vehicleDisclaimer;
    }

    /**
     * Gets the value of the vehicleDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleDetail }
     * 
     * 
     */
    public List<VehicleDetail> getVehicleDetail() {
        if (vehicleDetail == null) {
            vehicleDetail = new ArrayList<VehicleDetail>();
        }
        return this.vehicleDetail;
    }

}
