
package hotel.ws_2013.cangooroo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ws_2013.PriceValue;


/**
 * <p>Java class for SearchFilterInformationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchFilterInformationResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelCategory" type="{Cangooroo.WS_2013.Hotel}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="HotelLocations" type="{Cangooroo.WS_2013.Hotel}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="MinTotalPrice" type="{WS_2013}PriceValue" minOccurs="0"/>
 *         &lt;element name="MaxTotalPrice" type="{WS_2013}PriceValue" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchFilterInformationResponse", propOrder = {
    "hotelCategory",
    "hotelLocations",
    "minTotalPrice",
    "maxTotalPrice"
})
public class SearchFilterInformationResponse {

    @XmlElement(name = "HotelCategory")
    protected ArrayOfString hotelCategory;
    @XmlElement(name = "HotelLocations")
    protected ArrayOfString hotelLocations;
    @XmlElement(name = "MinTotalPrice")
    protected PriceValue minTotalPrice;
    @XmlElement(name = "MaxTotalPrice")
    protected PriceValue maxTotalPrice;

    /**
     * Gets the value of the hotelCategory property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getHotelCategory() {
        return hotelCategory;
    }

    /**
     * Sets the value of the hotelCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setHotelCategory(ArrayOfString value) {
        this.hotelCategory = value;
    }

    /**
     * Gets the value of the hotelLocations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getHotelLocations() {
        return hotelLocations;
    }

    /**
     * Sets the value of the hotelLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setHotelLocations(ArrayOfString value) {
        this.hotelLocations = value;
    }

    /**
     * Gets the value of the minTotalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue }
     *     
     */
    public PriceValue getMinTotalPrice() {
        return minTotalPrice;
    }

    /**
     * Sets the value of the minTotalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue }
     *     
     */
    public void setMinTotalPrice(PriceValue value) {
        this.minTotalPrice = value;
    }

    /**
     * Gets the value of the maxTotalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue }
     *     
     */
    public PriceValue getMaxTotalPrice() {
        return maxTotalPrice;
    }

    /**
     * Sets the value of the maxTotalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue }
     *     
     */
    public void setMaxTotalPrice(PriceValue value) {
        this.maxTotalPrice = value;
    }

}
