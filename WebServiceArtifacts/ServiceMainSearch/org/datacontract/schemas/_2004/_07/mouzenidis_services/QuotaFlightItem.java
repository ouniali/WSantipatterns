
package org.datacontract.schemas._2004._07.mouzenidis_services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuotaFlightItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuotaFlightItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AircraftName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Airports" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CharterId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CharterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CityFrom" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CityTo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="QuotaFlightTariffs" type="{http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects}ArrayOfQuotaFlightTariffs" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuotaFlightItem", propOrder = {
    "aircraftName",
    "airports",
    "charterId",
    "charterName",
    "cityFrom",
    "cityTo",
    "quotaFlightTariffs"
})
public class QuotaFlightItem {

    @XmlElementRef(name = "AircraftName", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> aircraftName;
    @XmlElementRef(name = "Airports", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> airports;
    @XmlElement(name = "CharterId")
    protected Integer charterId;
    @XmlElementRef(name = "CharterName", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> charterName;
    @XmlElement(name = "CityFrom")
    protected Integer cityFrom;
    @XmlElement(name = "CityTo")
    protected Integer cityTo;
    @XmlElementRef(name = "QuotaFlightTariffs", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfQuotaFlightTariffs> quotaFlightTariffs;

    /**
     * Gets the value of the aircraftName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAircraftName() {
        return aircraftName;
    }

    /**
     * Sets the value of the aircraftName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAircraftName(JAXBElement<String> value) {
        this.aircraftName = value;
    }

    /**
     * Gets the value of the airports property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAirports() {
        return airports;
    }

    /**
     * Sets the value of the airports property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAirports(JAXBElement<String> value) {
        this.airports = value;
    }

    /**
     * Gets the value of the charterId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCharterId() {
        return charterId;
    }

    /**
     * Sets the value of the charterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCharterId(Integer value) {
        this.charterId = value;
    }

    /**
     * Gets the value of the charterName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCharterName() {
        return charterName;
    }

    /**
     * Sets the value of the charterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCharterName(JAXBElement<String> value) {
        this.charterName = value;
    }

    /**
     * Gets the value of the cityFrom property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCityFrom() {
        return cityFrom;
    }

    /**
     * Sets the value of the cityFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCityFrom(Integer value) {
        this.cityFrom = value;
    }

    /**
     * Gets the value of the cityTo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCityTo() {
        return cityTo;
    }

    /**
     * Sets the value of the cityTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCityTo(Integer value) {
        this.cityTo = value;
    }

    /**
     * Gets the value of the quotaFlightTariffs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfQuotaFlightTariffs }{@code >}
     *     
     */
    public JAXBElement<ArrayOfQuotaFlightTariffs> getQuotaFlightTariffs() {
        return quotaFlightTariffs;
    }

    /**
     * Sets the value of the quotaFlightTariffs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfQuotaFlightTariffs }{@code >}
     *     
     */
    public void setQuotaFlightTariffs(JAXBElement<ArrayOfQuotaFlightTariffs> value) {
        this.quotaFlightTariffs = value;
    }

}
