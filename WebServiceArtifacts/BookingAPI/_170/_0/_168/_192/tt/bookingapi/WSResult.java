
package _170._0._168._192.tt.bookingapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TripIndicator" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Fare" type="{http://192.168.0.170/TT/BookingAPI}WSFare" minOccurs="0"/>
 *         &lt;element name="FareBreakdown" type="{http://192.168.0.170/TT/BookingAPI}ArrayOfWSPTCFare" minOccurs="0"/>
 *         &lt;element name="Origin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Destination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Segment" type="{http://192.168.0.170/TT/BookingAPI}ArrayOfWSSegment" minOccurs="0"/>
 *         &lt;element name="IbDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Source" type="{http://192.168.0.170/TT/BookingAPI}BookingSource"/>
 *         &lt;element name="FareRule" type="{http://192.168.0.170/TT/BookingAPI}ArrayOfWSFareRule" minOccurs="0"/>
 *         &lt;element name="IsLcc" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IbSegCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ObSegCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PromotionalPlanType" type="{http://192.168.0.170/TT/BookingAPI}PromotionalPlanType"/>
 *         &lt;element name="NonRefundable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SegmentKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSResult", propOrder = {
    "tripIndicator",
    "fare",
    "fareBreakdown",
    "origin",
    "destination",
    "segment",
    "ibDuration",
    "obDuration",
    "source",
    "fareRule",
    "isLcc",
    "ibSegCount",
    "obSegCount",
    "promotionalPlanType",
    "nonRefundable",
    "segmentKey"
})
public class WSResult {

    @XmlElement(name = "TripIndicator")
    protected int tripIndicator;
    @XmlElement(name = "Fare")
    protected WSFare fare;
    @XmlElement(name = "FareBreakdown")
    protected ArrayOfWSPTCFare fareBreakdown;
    @XmlElement(name = "Origin")
    protected String origin;
    @XmlElement(name = "Destination")
    protected String destination;
    @XmlElement(name = "Segment")
    protected ArrayOfWSSegment segment;
    @XmlElement(name = "IbDuration")
    protected String ibDuration;
    @XmlElement(name = "ObDuration")
    protected String obDuration;
    @XmlElement(name = "Source", required = true)
    @XmlSchemaType(name = "string")
    protected BookingSource source;
    @XmlElement(name = "FareRule")
    protected ArrayOfWSFareRule fareRule;
    @XmlElement(name = "IsLcc")
    protected boolean isLcc;
    @XmlElement(name = "IbSegCount")
    protected int ibSegCount;
    @XmlElement(name = "ObSegCount")
    protected int obSegCount;
    @XmlElement(name = "PromotionalPlanType", required = true)
    @XmlSchemaType(name = "string")
    protected PromotionalPlanType promotionalPlanType;
    @XmlElement(name = "NonRefundable")
    protected boolean nonRefundable;
    @XmlElement(name = "SegmentKey")
    protected String segmentKey;

    /**
     * Gets the value of the tripIndicator property.
     * 
     */
    public int getTripIndicator() {
        return tripIndicator;
    }

    /**
     * Sets the value of the tripIndicator property.
     * 
     */
    public void setTripIndicator(int value) {
        this.tripIndicator = value;
    }

    /**
     * Gets the value of the fare property.
     * 
     * @return
     *     possible object is
     *     {@link WSFare }
     *     
     */
    public WSFare getFare() {
        return fare;
    }

    /**
     * Sets the value of the fare property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSFare }
     *     
     */
    public void setFare(WSFare value) {
        this.fare = value;
    }

    /**
     * Gets the value of the fareBreakdown property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWSPTCFare }
     *     
     */
    public ArrayOfWSPTCFare getFareBreakdown() {
        return fareBreakdown;
    }

    /**
     * Sets the value of the fareBreakdown property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWSPTCFare }
     *     
     */
    public void setFareBreakdown(ArrayOfWSPTCFare value) {
        this.fareBreakdown = value;
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
     * Gets the value of the segment property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWSSegment }
     *     
     */
    public ArrayOfWSSegment getSegment() {
        return segment;
    }

    /**
     * Sets the value of the segment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWSSegment }
     *     
     */
    public void setSegment(ArrayOfWSSegment value) {
        this.segment = value;
    }

    /**
     * Gets the value of the ibDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIbDuration() {
        return ibDuration;
    }

    /**
     * Sets the value of the ibDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIbDuration(String value) {
        this.ibDuration = value;
    }

    /**
     * Gets the value of the obDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObDuration() {
        return obDuration;
    }

    /**
     * Sets the value of the obDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObDuration(String value) {
        this.obDuration = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link BookingSource }
     *     
     */
    public BookingSource getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingSource }
     *     
     */
    public void setSource(BookingSource value) {
        this.source = value;
    }

    /**
     * Gets the value of the fareRule property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWSFareRule }
     *     
     */
    public ArrayOfWSFareRule getFareRule() {
        return fareRule;
    }

    /**
     * Sets the value of the fareRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWSFareRule }
     *     
     */
    public void setFareRule(ArrayOfWSFareRule value) {
        this.fareRule = value;
    }

    /**
     * Gets the value of the isLcc property.
     * 
     */
    public boolean isIsLcc() {
        return isLcc;
    }

    /**
     * Sets the value of the isLcc property.
     * 
     */
    public void setIsLcc(boolean value) {
        this.isLcc = value;
    }

    /**
     * Gets the value of the ibSegCount property.
     * 
     */
    public int getIbSegCount() {
        return ibSegCount;
    }

    /**
     * Sets the value of the ibSegCount property.
     * 
     */
    public void setIbSegCount(int value) {
        this.ibSegCount = value;
    }

    /**
     * Gets the value of the obSegCount property.
     * 
     */
    public int getObSegCount() {
        return obSegCount;
    }

    /**
     * Sets the value of the obSegCount property.
     * 
     */
    public void setObSegCount(int value) {
        this.obSegCount = value;
    }

    /**
     * Gets the value of the promotionalPlanType property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionalPlanType }
     *     
     */
    public PromotionalPlanType getPromotionalPlanType() {
        return promotionalPlanType;
    }

    /**
     * Sets the value of the promotionalPlanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionalPlanType }
     *     
     */
    public void setPromotionalPlanType(PromotionalPlanType value) {
        this.promotionalPlanType = value;
    }

    /**
     * Gets the value of the nonRefundable property.
     * 
     */
    public boolean isNonRefundable() {
        return nonRefundable;
    }

    /**
     * Sets the value of the nonRefundable property.
     * 
     */
    public void setNonRefundable(boolean value) {
        this.nonRefundable = value;
    }

    /**
     * Gets the value of the segmentKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentKey() {
        return segmentKey;
    }

    /**
     * Sets the value of the segmentKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentKey(String value) {
        this.segmentKey = value;
    }

}
