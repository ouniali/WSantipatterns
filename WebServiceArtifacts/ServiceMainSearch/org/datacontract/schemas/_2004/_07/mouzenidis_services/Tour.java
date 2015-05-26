
package org.datacontract.schemas._2004._07.mouzenidis_services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import org.datacontract.schemas._2004._07.mouzenidis_services_objects.DictionaryBase;


/**
 * <p>Java class for Tour complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Tour">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects.Dictionary}DictionaryBase">
 *       &lt;sequence>
 *         &lt;element name="CityKey" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CountryKey" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RateIso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TourURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TypeTour" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TypeTours" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tour", propOrder = {
    "cityKey",
    "countryKey",
    "rateIso",
    "tourURL",
    "typeTour",
    "typeTours"
})
public class Tour
    extends DictionaryBase
{

    @XmlElement(name = "CityKey")
    protected Integer cityKey;
    @XmlElement(name = "CountryKey")
    protected Integer countryKey;
    @XmlElementRef(name = "RateIso", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rateIso;
    @XmlElementRef(name = "TourURL", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tourURL;
    @XmlElement(name = "TypeTour")
    protected Integer typeTour;
    @XmlElementRef(name = "TypeTours", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> typeTours;

    /**
     * Gets the value of the cityKey property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCityKey() {
        return cityKey;
    }

    /**
     * Sets the value of the cityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCityKey(Integer value) {
        this.cityKey = value;
    }

    /**
     * Gets the value of the countryKey property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCountryKey() {
        return countryKey;
    }

    /**
     * Sets the value of the countryKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCountryKey(Integer value) {
        this.countryKey = value;
    }

    /**
     * Gets the value of the rateIso property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRateIso() {
        return rateIso;
    }

    /**
     * Sets the value of the rateIso property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRateIso(JAXBElement<String> value) {
        this.rateIso = value;
    }

    /**
     * Gets the value of the tourURL property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTourURL() {
        return tourURL;
    }

    /**
     * Sets the value of the tourURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTourURL(JAXBElement<String> value) {
        this.tourURL = value;
    }

    /**
     * Gets the value of the typeTour property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTypeTour() {
        return typeTour;
    }

    /**
     * Sets the value of the typeTour property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTypeTour(Integer value) {
        this.typeTour = value;
    }

    /**
     * Gets the value of the typeTours property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getTypeTours() {
        return typeTours;
    }

    /**
     * Sets the value of the typeTours property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setTypeTours(JAXBElement<ArrayOfint> value) {
        this.typeTours = value;
    }

}
