
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for LocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}LocationGroup"/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationType", propOrder = {
    "value"
})
@XmlSeeAlso({
    org.opentravel.ota._2003._05.VerificationType.StartLocation.class,
    org.opentravel.ota._2003._05.VerificationType.EndLocation.class,
    org.opentravel.ota._2003._05.ConnectionType.ConnectionLocation.class,
    org.opentravel.ota._2003._05.VehicleAvailCoreType.VendorLocation.class,
    org.opentravel.ota._2003._05.VehicleAvailCoreType.DropOffLocation.class,
    org.opentravel.ota._2003._05.ItemSearchCriterionType.CodeRef.class,
    AirportPrefType.class,
    org.opentravel.ota._2003._05.SailingBaseType.DeparturePort.class,
    org.opentravel.ota._2003._05.SailingBaseType.ArrivalPort.class,
    org.opentravel.ota._2003._05.VehicleLocationAdditionalDetailsType.OneWayDropLocations.OneWayDropLocation.class,
    org.opentravel.ota._2003._05.VehicleRentalCoreType.PickUpLocation.class,
    org.opentravel.ota._2003._05.VehicleRentalCoreType.ReturnLocation.class,
    org.opentravel.ota._2003._05.OriginDestinationInformationType.OriginLocation.class,
    org.opentravel.ota._2003._05.OriginDestinationInformationType.DestinationLocation.class
})
public class LocationType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "LocationCode")
    protected String locationCode;
    @XmlAttribute(name = "CodeContext")
    protected String codeContext;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the locationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationCode() {
        return locationCode;
    }

    /**
     * Sets the value of the locationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationCode(String value) {
        this.locationCode = value;
    }

    /**
     * Gets the value of the codeContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeContext() {
        return codeContext;
    }

    /**
     * Sets the value of the codeContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeContext(String value) {
        this.codeContext = value;
    }

}
