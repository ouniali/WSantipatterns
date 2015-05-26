
package _170._0._168._192.tt.bookingapi;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSSSRBaggage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSSSRBaggage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Ssrtype" type="{http://192.168.0.170/TT/BookingAPI}SSRType"/>
 *         &lt;element name="JourneyIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WayType" type="{http://192.168.0.170/TT/BookingAPI}WayType"/>
 *         &lt;element name="BagCode" type="{http://192.168.0.170/TT/BookingAPI}WSBaggageCodeForAPI"/>
 *         &lt;element name="BagPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="BagWeight" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AirportCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DestinationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CategoryId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BagDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LogicalFlightId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RateOfExchange" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="SupplierCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSSSRBaggage", propOrder = {
    "ssrtype",
    "journeyIndicator",
    "wayType",
    "bagCode",
    "bagPrice",
    "bagWeight",
    "airportCode",
    "destinationCode",
    "categoryId",
    "bagDescription",
    "logicalFlightId",
    "rateOfExchange",
    "supplierCurrency"
})
public class WSSSRBaggage {

    @XmlElement(name = "Ssrtype", required = true)
    @XmlSchemaType(name = "string")
    protected SSRType ssrtype;
    @XmlElement(name = "JourneyIndicator")
    protected String journeyIndicator;
    @XmlElement(name = "WayType", required = true)
    @XmlSchemaType(name = "string")
    protected WayType wayType;
    @XmlElement(name = "BagCode", required = true)
    @XmlSchemaType(name = "string")
    protected WSBaggageCodeForAPI bagCode;
    @XmlElement(name = "BagPrice", required = true)
    protected BigDecimal bagPrice;
    @XmlElement(name = "BagWeight")
    protected int bagWeight;
    @XmlElement(name = "AirportCode")
    protected String airportCode;
    @XmlElement(name = "DestinationCode")
    protected String destinationCode;
    @XmlElement(name = "CategoryId")
    protected String categoryId;
    @XmlElement(name = "BagDescription")
    protected String bagDescription;
    @XmlElement(name = "LogicalFlightId")
    protected int logicalFlightId;
    @XmlElement(name = "RateOfExchange", required = true)
    protected BigDecimal rateOfExchange;
    @XmlElement(name = "SupplierCurrency")
    protected String supplierCurrency;

    /**
     * Gets the value of the ssrtype property.
     * 
     * @return
     *     possible object is
     *     {@link SSRType }
     *     
     */
    public SSRType getSsrtype() {
        return ssrtype;
    }

    /**
     * Sets the value of the ssrtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link SSRType }
     *     
     */
    public void setSsrtype(SSRType value) {
        this.ssrtype = value;
    }

    /**
     * Gets the value of the journeyIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJourneyIndicator() {
        return journeyIndicator;
    }

    /**
     * Sets the value of the journeyIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJourneyIndicator(String value) {
        this.journeyIndicator = value;
    }

    /**
     * Gets the value of the wayType property.
     * 
     * @return
     *     possible object is
     *     {@link WayType }
     *     
     */
    public WayType getWayType() {
        return wayType;
    }

    /**
     * Sets the value of the wayType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WayType }
     *     
     */
    public void setWayType(WayType value) {
        this.wayType = value;
    }

    /**
     * Gets the value of the bagCode property.
     * 
     * @return
     *     possible object is
     *     {@link WSBaggageCodeForAPI }
     *     
     */
    public WSBaggageCodeForAPI getBagCode() {
        return bagCode;
    }

    /**
     * Sets the value of the bagCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSBaggageCodeForAPI }
     *     
     */
    public void setBagCode(WSBaggageCodeForAPI value) {
        this.bagCode = value;
    }

    /**
     * Gets the value of the bagPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBagPrice() {
        return bagPrice;
    }

    /**
     * Sets the value of the bagPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBagPrice(BigDecimal value) {
        this.bagPrice = value;
    }

    /**
     * Gets the value of the bagWeight property.
     * 
     */
    public int getBagWeight() {
        return bagWeight;
    }

    /**
     * Sets the value of the bagWeight property.
     * 
     */
    public void setBagWeight(int value) {
        this.bagWeight = value;
    }

    /**
     * Gets the value of the airportCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirportCode() {
        return airportCode;
    }

    /**
     * Sets the value of the airportCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirportCode(String value) {
        this.airportCode = value;
    }

    /**
     * Gets the value of the destinationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationCode() {
        return destinationCode;
    }

    /**
     * Sets the value of the destinationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationCode(String value) {
        this.destinationCode = value;
    }

    /**
     * Gets the value of the categoryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryId() {
        return categoryId;
    }

    /**
     * Sets the value of the categoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryId(String value) {
        this.categoryId = value;
    }

    /**
     * Gets the value of the bagDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBagDescription() {
        return bagDescription;
    }

    /**
     * Sets the value of the bagDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBagDescription(String value) {
        this.bagDescription = value;
    }

    /**
     * Gets the value of the logicalFlightId property.
     * 
     */
    public int getLogicalFlightId() {
        return logicalFlightId;
    }

    /**
     * Sets the value of the logicalFlightId property.
     * 
     */
    public void setLogicalFlightId(int value) {
        this.logicalFlightId = value;
    }

    /**
     * Gets the value of the rateOfExchange property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRateOfExchange() {
        return rateOfExchange;
    }

    /**
     * Sets the value of the rateOfExchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRateOfExchange(BigDecimal value) {
        this.rateOfExchange = value;
    }

    /**
     * Gets the value of the supplierCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierCurrency() {
        return supplierCurrency;
    }

    /**
     * Sets the value of the supplierCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierCurrency(String value) {
        this.supplierCurrency = value;
    }

}
