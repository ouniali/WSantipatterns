
package _170._0._168._192.tt.bookingapi;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for WSCheapestFareOfEntireMonth complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSCheapestFareOfEntireMonth">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirlineCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AirlineName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BaseFare" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Tax" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OtherCharges" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="FuelSurcharge" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSCheapestFareOfEntireMonth", propOrder = {
    "airlineCode",
    "airlineName",
    "baseFare",
    "tax",
    "otherCharges",
    "fuelSurcharge",
    "departureDate"
})
public class WSCheapestFareOfEntireMonth {

    @XmlElement(name = "AirlineCode")
    protected String airlineCode;
    @XmlElement(name = "AirlineName")
    protected String airlineName;
    @XmlElement(name = "BaseFare", required = true)
    protected BigDecimal baseFare;
    @XmlElement(name = "Tax", required = true)
    protected BigDecimal tax;
    @XmlElement(name = "OtherCharges", required = true)
    protected BigDecimal otherCharges;
    @XmlElement(name = "FuelSurcharge", required = true)
    protected BigDecimal fuelSurcharge;
    @XmlElement(name = "DepartureDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departureDate;

    /**
     * Gets the value of the airlineCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineCode() {
        return airlineCode;
    }

    /**
     * Sets the value of the airlineCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineCode(String value) {
        this.airlineCode = value;
    }

    /**
     * Gets the value of the airlineName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineName() {
        return airlineName;
    }

    /**
     * Sets the value of the airlineName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineName(String value) {
        this.airlineName = value;
    }

    /**
     * Gets the value of the baseFare property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBaseFare() {
        return baseFare;
    }

    /**
     * Sets the value of the baseFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBaseFare(BigDecimal value) {
        this.baseFare = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTax(BigDecimal value) {
        this.tax = value;
    }

    /**
     * Gets the value of the otherCharges property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOtherCharges() {
        return otherCharges;
    }

    /**
     * Sets the value of the otherCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOtherCharges(BigDecimal value) {
        this.otherCharges = value;
    }

    /**
     * Gets the value of the fuelSurcharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFuelSurcharge() {
        return fuelSurcharge;
    }

    /**
     * Sets the value of the fuelSurcharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFuelSurcharge(BigDecimal value) {
        this.fuelSurcharge = value;
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

}
