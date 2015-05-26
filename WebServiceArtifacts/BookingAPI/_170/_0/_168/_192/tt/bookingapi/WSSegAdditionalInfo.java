
package _170._0._168._192.tt.bookingapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSSegAdditionalInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSSegAdditionalInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FareBasis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NVA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NVB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Baggage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FlightKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSSegAdditionalInfo", propOrder = {
    "fareBasis",
    "nva",
    "nvb",
    "baggage",
    "flightKey"
})
public class WSSegAdditionalInfo {

    @XmlElement(name = "FareBasis")
    protected String fareBasis;
    @XmlElement(name = "NVA")
    protected String nva;
    @XmlElement(name = "NVB")
    protected String nvb;
    @XmlElement(name = "Baggage")
    protected String baggage;
    @XmlElement(name = "FlightKey")
    protected String flightKey;

    /**
     * Gets the value of the fareBasis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareBasis() {
        return fareBasis;
    }

    /**
     * Sets the value of the fareBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareBasis(String value) {
        this.fareBasis = value;
    }

    /**
     * Gets the value of the nva property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNVA() {
        return nva;
    }

    /**
     * Sets the value of the nva property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNVA(String value) {
        this.nva = value;
    }

    /**
     * Gets the value of the nvb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNVB() {
        return nvb;
    }

    /**
     * Sets the value of the nvb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNVB(String value) {
        this.nvb = value;
    }

    /**
     * Gets the value of the baggage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaggage() {
        return baggage;
    }

    /**
     * Sets the value of the baggage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaggage(String value) {
        this.baggage = value;
    }

    /**
     * Gets the value of the flightKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightKey() {
        return flightKey;
    }

    /**
     * Sets the value of the flightKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightKey(String value) {
        this.flightKey = value;
    }

}
