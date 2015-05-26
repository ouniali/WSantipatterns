
package com.travelport.schema.rail_v12_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v15_0.Segment;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travelport.com/schema/common_v15_0}Segment">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/rail_v12_0}RailSegmentInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/rail_v12_0}OperatingCompany" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/rail_v12_0}RailAvailInfo" maxOccurs="9" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.travelport.com/schema/rail_v12_0}attrRailSegmentOrigDestInfo"/>
 *       &lt;attribute name="TrainNumber" type="{http://www.travelport.com/schema/rail_v12_0}typeTrainNumber" />
 *       &lt;attribute name="TrainType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TrainTypeCode" type="{http://www.travelport.com/schema/rail_v12_0}typeTrainType" />
 *       &lt;attribute name="TransportMode" type="{http://www.travelport.com/schema/rail_v12_0}typeTransportMode" />
 *       &lt;attribute name="SeatAssignable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="TransportCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ReservationRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="TravelTime" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "railSegmentInfo",
    "operatingCompany",
    "railAvailInfo"
})
@XmlRootElement(name = "RailSegment")
public class RailSegment
    extends Segment
{

    @XmlElement(name = "RailSegmentInfo")
    protected List<RailSegmentInfo> railSegmentInfo;
    @XmlElement(name = "OperatingCompany")
    protected OperatingCompany operatingCompany;
    @XmlElement(name = "RailAvailInfo")
    protected List<RailAvailInfo> railAvailInfo;
    @XmlAttribute(name = "TrainNumber")
    protected String trainNumber;
    @XmlAttribute(name = "TrainType")
    protected String trainType;
    @XmlAttribute(name = "TrainTypeCode")
    protected String trainTypeCode;
    @XmlAttribute(name = "TransportMode")
    protected TypeTransportMode transportMode;
    @XmlAttribute(name = "SeatAssignable")
    protected Boolean seatAssignable;
    @XmlAttribute(name = "TransportCode")
    protected String transportCode;
    @XmlAttribute(name = "ReservationRequired")
    protected Boolean reservationRequired;
    @XmlAttribute(name = "TravelTime")
    protected BigInteger travelTime;
    @XmlAttribute(name = "Origin")
    protected String origin;
    @XmlAttribute(name = "Destination")
    protected String destination;
    @XmlAttribute(name = "DepartureTime", required = true)
    protected String departureTime;
    @XmlAttribute(name = "ArrivalTime")
    protected String arrivalTime;
    @XmlAttribute(name = "OriginStationName")
    protected String originStationName;
    @XmlAttribute(name = "DestinationStationName")
    protected String destinationStationName;
    @XmlAttribute(name = "RailLocOrigin")
    protected String railLocOrigin;
    @XmlAttribute(name = "RailLocDestination")
    protected String railLocDestination;

    /**
     * Gets the value of the railSegmentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the railSegmentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRailSegmentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailSegmentInfo }
     * 
     * 
     */
    public List<RailSegmentInfo> getRailSegmentInfo() {
        if (railSegmentInfo == null) {
            railSegmentInfo = new ArrayList<RailSegmentInfo>();
        }
        return this.railSegmentInfo;
    }

    /**
     * Gets the value of the operatingCompany property.
     * 
     * @return
     *     possible object is
     *     {@link OperatingCompany }
     *     
     */
    public OperatingCompany getOperatingCompany() {
        return operatingCompany;
    }

    /**
     * Sets the value of the operatingCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingCompany }
     *     
     */
    public void setOperatingCompany(OperatingCompany value) {
        this.operatingCompany = value;
    }

    /**
     * Gets the value of the railAvailInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the railAvailInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRailAvailInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailAvailInfo }
     * 
     * 
     */
    public List<RailAvailInfo> getRailAvailInfo() {
        if (railAvailInfo == null) {
            railAvailInfo = new ArrayList<RailAvailInfo>();
        }
        return this.railAvailInfo;
    }

    /**
     * Gets the value of the trainNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainNumber() {
        return trainNumber;
    }

    /**
     * Sets the value of the trainNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainNumber(String value) {
        this.trainNumber = value;
    }

    /**
     * Gets the value of the trainType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainType() {
        return trainType;
    }

    /**
     * Sets the value of the trainType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainType(String value) {
        this.trainType = value;
    }

    /**
     * Gets the value of the trainTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainTypeCode() {
        return trainTypeCode;
    }

    /**
     * Sets the value of the trainTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainTypeCode(String value) {
        this.trainTypeCode = value;
    }

    /**
     * Gets the value of the transportMode property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTransportMode }
     *     
     */
    public TypeTransportMode getTransportMode() {
        return transportMode;
    }

    /**
     * Sets the value of the transportMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTransportMode }
     *     
     */
    public void setTransportMode(TypeTransportMode value) {
        this.transportMode = value;
    }

    /**
     * Gets the value of the seatAssignable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSeatAssignable() {
        return seatAssignable;
    }

    /**
     * Sets the value of the seatAssignable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSeatAssignable(Boolean value) {
        this.seatAssignable = value;
    }

    /**
     * Gets the value of the transportCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportCode() {
        return transportCode;
    }

    /**
     * Sets the value of the transportCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportCode(String value) {
        this.transportCode = value;
    }

    /**
     * Gets the value of the reservationRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReservationRequired() {
        return reservationRequired;
    }

    /**
     * Sets the value of the reservationRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReservationRequired(Boolean value) {
        this.reservationRequired = value;
    }

    /**
     * Gets the value of the travelTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTravelTime() {
        return travelTime;
    }

    /**
     * Sets the value of the travelTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTravelTime(BigInteger value) {
        this.travelTime = value;
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Gets the value of the departureTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureTime() {
        return departureTime;
    }

    /**
     * Sets the value of the departureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureTime(String value) {
        this.departureTime = value;
    }

    /**
     * Gets the value of the arrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Sets the value of the arrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalTime(String value) {
        this.arrivalTime = value;
    }

    /**
     * Gets the value of the originStationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginStationName() {
        return originStationName;
    }

    /**
     * Sets the value of the originStationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginStationName(String value) {
        this.originStationName = value;
    }

    /**
     * Gets the value of the destinationStationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationStationName() {
        return destinationStationName;
    }

    /**
     * Sets the value of the destinationStationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationStationName(String value) {
        this.destinationStationName = value;
    }

    /**
     * Gets the value of the railLocOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRailLocOrigin() {
        return railLocOrigin;
    }

    /**
     * Sets the value of the railLocOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRailLocOrigin(String value) {
        this.railLocOrigin = value;
    }

    /**
     * Gets the value of the railLocDestination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRailLocDestination() {
        return railLocDestination;
    }

    /**
     * Sets the value of the railLocDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRailLocDestination(String value) {
        this.railLocDestination = value;
    }

}
