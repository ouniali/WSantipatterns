
package _170._0._168._192.tt.bookingapi;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSSSRMeal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSSSRMeal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Ssrtype" type="{http://192.168.0.170/TT/BookingAPI}SSRType"/>
 *         &lt;element name="JourneyIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WayType" type="{http://192.168.0.170/TT/BookingAPI}WayType"/>
 *         &lt;element name="MealCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MealPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="MealQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AirportCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DestinationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MealDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "WSSSRMeal", propOrder = {
    "ssrtype",
    "journeyIndicator",
    "wayType",
    "mealCode",
    "mealPrice",
    "mealQuantity",
    "airportCode",
    "destinationCode",
    "mealDescription",
    "rateOfExchange",
    "supplierCurrency"
})
public class WSSSRMeal {

    @XmlElement(name = "Ssrtype", required = true)
    @XmlSchemaType(name = "string")
    protected SSRType ssrtype;
    @XmlElement(name = "JourneyIndicator")
    protected String journeyIndicator;
    @XmlElement(name = "WayType", required = true)
    @XmlSchemaType(name = "string")
    protected WayType wayType;
    @XmlElement(name = "MealCode")
    protected String mealCode;
    @XmlElement(name = "MealPrice", required = true)
    protected BigDecimal mealPrice;
    @XmlElement(name = "MealQuantity")
    protected int mealQuantity;
    @XmlElement(name = "AirportCode")
    protected String airportCode;
    @XmlElement(name = "DestinationCode")
    protected String destinationCode;
    @XmlElement(name = "MealDescription")
    protected String mealDescription;
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
     * Gets the value of the mealCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMealCode() {
        return mealCode;
    }

    /**
     * Sets the value of the mealCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMealCode(String value) {
        this.mealCode = value;
    }

    /**
     * Gets the value of the mealPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMealPrice() {
        return mealPrice;
    }

    /**
     * Sets the value of the mealPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMealPrice(BigDecimal value) {
        this.mealPrice = value;
    }

    /**
     * Gets the value of the mealQuantity property.
     * 
     */
    public int getMealQuantity() {
        return mealQuantity;
    }

    /**
     * Sets the value of the mealQuantity property.
     * 
     */
    public void setMealQuantity(int value) {
        this.mealQuantity = value;
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
     * Gets the value of the mealDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMealDescription() {
        return mealDescription;
    }

    /**
     * Sets the value of the mealDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMealDescription(String value) {
        this.mealDescription = value;
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
