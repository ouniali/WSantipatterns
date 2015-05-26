
package trainticket.ws_2013;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Segment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Segment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DestinationCityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginCityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ArrivalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DestinationStationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DestinationStationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginStationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginStationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsAllowedGroup" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="RouteName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumberOfStops" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SegmentId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OnBoardServices" type="{WS_2013.TrainTicket}ArrayOfOnBoardService" minOccurs="0"/>
 *         &lt;element name="Train" type="{WS_2013.TrainTicket}TrainSearch" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Segment", propOrder = {
    "destinationCityId",
    "originCityId",
    "arrivalDate",
    "departureDate",
    "duration",
    "destinationStationCode",
    "destinationStationName",
    "originStationCode",
    "originStationName",
    "isAllowedGroup",
    "routeName",
    "numberOfStops",
    "segmentId",
    "onBoardServices",
    "train"
})
public class Segment {

    @XmlElement(name = "DestinationCityId")
    protected String destinationCityId;
    @XmlElement(name = "OriginCityId")
    protected String originCityId;
    @XmlElement(name = "ArrivalDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrivalDate;
    @XmlElement(name = "DepartureDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departureDate;
    @XmlElement(name = "Duration")
    protected int duration;
    @XmlElement(name = "DestinationStationCode")
    protected String destinationStationCode;
    @XmlElement(name = "DestinationStationName")
    protected String destinationStationName;
    @XmlElement(name = "OriginStationCode")
    protected String originStationCode;
    @XmlElement(name = "OriginStationName")
    protected String originStationName;
    @XmlElement(name = "IsAllowedGroup", required = true, type = Boolean.class, nillable = true)
    protected Boolean isAllowedGroup;
    @XmlElement(name = "RouteName")
    protected String routeName;
    @XmlElement(name = "NumberOfStops", required = true, type = Integer.class, nillable = true)
    protected Integer numberOfStops;
    @XmlElement(name = "SegmentId")
    protected int segmentId;
    @XmlElement(name = "OnBoardServices")
    protected ArrayOfOnBoardService onBoardServices;
    @XmlElement(name = "Train")
    protected TrainSearch train;

    /**
     * Gets the value of the destinationCityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationCityId() {
        return destinationCityId;
    }

    /**
     * Sets the value of the destinationCityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationCityId(String value) {
        this.destinationCityId = value;
    }

    /**
     * Gets the value of the originCityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginCityId() {
        return originCityId;
    }

    /**
     * Sets the value of the originCityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginCityId(String value) {
        this.originCityId = value;
    }

    /**
     * Gets the value of the arrivalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrivalDate() {
        return arrivalDate;
    }

    /**
     * Sets the value of the arrivalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrivalDate(XMLGregorianCalendar value) {
        this.arrivalDate = value;
    }

    /**
     * Gets the value of the departureDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureDate() {
        return departureDate;
    }

    /**
     * Sets the value of the departureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureDate(XMLGregorianCalendar value) {
        this.departureDate = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     */
    public int getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     */
    public void setDuration(int value) {
        this.duration = value;
    }

    /**
     * Gets the value of the destinationStationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationStationCode() {
        return destinationStationCode;
    }

    /**
     * Sets the value of the destinationStationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationStationCode(String value) {
        this.destinationStationCode = value;
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
     * Gets the value of the originStationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginStationCode() {
        return originStationCode;
    }

    /**
     * Sets the value of the originStationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginStationCode(String value) {
        this.originStationCode = value;
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
     * Gets the value of the isAllowedGroup property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAllowedGroup() {
        return isAllowedGroup;
    }

    /**
     * Sets the value of the isAllowedGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAllowedGroup(Boolean value) {
        this.isAllowedGroup = value;
    }

    /**
     * Gets the value of the routeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteName() {
        return routeName;
    }

    /**
     * Sets the value of the routeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteName(String value) {
        this.routeName = value;
    }

    /**
     * Gets the value of the numberOfStops property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfStops() {
        return numberOfStops;
    }

    /**
     * Sets the value of the numberOfStops property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfStops(Integer value) {
        this.numberOfStops = value;
    }

    /**
     * Gets the value of the segmentId property.
     * 
     */
    public int getSegmentId() {
        return segmentId;
    }

    /**
     * Sets the value of the segmentId property.
     * 
     */
    public void setSegmentId(int value) {
        this.segmentId = value;
    }

    /**
     * Gets the value of the onBoardServices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOnBoardService }
     *     
     */
    public ArrayOfOnBoardService getOnBoardServices() {
        return onBoardServices;
    }

    /**
     * Sets the value of the onBoardServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOnBoardService }
     *     
     */
    public void setOnBoardServices(ArrayOfOnBoardService value) {
        this.onBoardServices = value;
    }

    /**
     * Gets the value of the train property.
     * 
     * @return
     *     possible object is
     *     {@link TrainSearch }
     *     
     */
    public TrainSearch getTrain() {
        return train;
    }

    /**
     * Sets the value of the train property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainSearch }
     *     
     */
    public void setTrain(TrainSearch value) {
        this.train = value;
    }

}
