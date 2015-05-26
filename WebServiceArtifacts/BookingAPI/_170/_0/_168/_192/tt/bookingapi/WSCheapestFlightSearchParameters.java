
package _170._0._168._192.tt.bookingapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for WSCheapestFlightSearchParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSCheapestFlightSearchParameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Origin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Destination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://192.168.0.170/TT/BookingAPI}SearchType"/>
 *         &lt;element name="CabinClass" type="{http://192.168.0.170/TT/BookingAPI}CabinClass"/>
 *         &lt;element name="PreferredCarrier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdultCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ChildCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InfantCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SeniorCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ReturnDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PromotionalPlanType" type="{http://192.168.0.170/TT/BookingAPI}PromotionalPlanType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSCheapestFlightSearchParameters", propOrder = {
    "origin",
    "destination",
    "type",
    "cabinClass",
    "preferredCarrier",
    "adultCount",
    "childCount",
    "infantCount",
    "seniorCount",
    "departureDate",
    "returnDate",
    "promotionalPlanType"
})
public class WSCheapestFlightSearchParameters {

    @XmlElement(name = "Origin")
    protected String origin;
    @XmlElement(name = "Destination")
    protected String destination;
    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected SearchType type;
    @XmlElement(name = "CabinClass", required = true)
    @XmlSchemaType(name = "string")
    protected CabinClass cabinClass;
    @XmlElement(name = "PreferredCarrier")
    protected String preferredCarrier;
    @XmlElement(name = "AdultCount")
    protected int adultCount;
    @XmlElement(name = "ChildCount")
    protected int childCount;
    @XmlElement(name = "InfantCount")
    protected int infantCount;
    @XmlElement(name = "SeniorCount")
    protected int seniorCount;
    @XmlElement(name = "DepartureDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departureDate;
    @XmlElement(name = "ReturnDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar returnDate;
    @XmlElement(name = "PromotionalPlanType", required = true)
    @XmlSchemaType(name = "string")
    protected PromotionalPlanType promotionalPlanType;

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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link SearchType }
     *     
     */
    public SearchType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchType }
     *     
     */
    public void setType(SearchType value) {
        this.type = value;
    }

    /**
     * Gets the value of the cabinClass property.
     * 
     * @return
     *     possible object is
     *     {@link CabinClass }
     *     
     */
    public CabinClass getCabinClass() {
        return cabinClass;
    }

    /**
     * Sets the value of the cabinClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinClass }
     *     
     */
    public void setCabinClass(CabinClass value) {
        this.cabinClass = value;
    }

    /**
     * Gets the value of the preferredCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredCarrier() {
        return preferredCarrier;
    }

    /**
     * Sets the value of the preferredCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredCarrier(String value) {
        this.preferredCarrier = value;
    }

    /**
     * Gets the value of the adultCount property.
     * 
     */
    public int getAdultCount() {
        return adultCount;
    }

    /**
     * Sets the value of the adultCount property.
     * 
     */
    public void setAdultCount(int value) {
        this.adultCount = value;
    }

    /**
     * Gets the value of the childCount property.
     * 
     */
    public int getChildCount() {
        return childCount;
    }

    /**
     * Sets the value of the childCount property.
     * 
     */
    public void setChildCount(int value) {
        this.childCount = value;
    }

    /**
     * Gets the value of the infantCount property.
     * 
     */
    public int getInfantCount() {
        return infantCount;
    }

    /**
     * Sets the value of the infantCount property.
     * 
     */
    public void setInfantCount(int value) {
        this.infantCount = value;
    }

    /**
     * Gets the value of the seniorCount property.
     * 
     */
    public int getSeniorCount() {
        return seniorCount;
    }

    /**
     * Sets the value of the seniorCount property.
     * 
     */
    public void setSeniorCount(int value) {
        this.seniorCount = value;
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
     * Gets the value of the returnDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReturnDate() {
        return returnDate;
    }

    /**
     * Sets the value of the returnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReturnDate(XMLGregorianCalendar value) {
        this.returnDate = value;
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

}
