
package hotel.ws_2013;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultManipulation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResultManipulation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumberOfPics" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CheapestRoomOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DescriptionLanguageISO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReturnHotelInfo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="OnlyRecommended" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SelectedHotelsIds" type="{WS_2013.Hotel}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="HotelCategory" type="{WS_2013.Hotel}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="MinPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="MaxPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Locations" type="{WS_2013.Hotel}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="ReturnFilterInformation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultManipulation", propOrder = {
    "numberOfPics",
    "cheapestRoomOnly",
    "descriptionLanguageISO",
    "returnHotelInfo",
    "onlyRecommended",
    "hotelName",
    "selectedHotelsIds",
    "hotelCategory",
    "minPrice",
    "maxPrice",
    "locations",
    "returnFilterInformation"
})
public class ResultManipulation {

    @XmlElement(name = "NumberOfPics")
    protected int numberOfPics;
    @XmlElement(name = "CheapestRoomOnly")
    protected boolean cheapestRoomOnly;
    @XmlElement(name = "DescriptionLanguageISO")
    protected String descriptionLanguageISO;
    @XmlElement(name = "ReturnHotelInfo")
    protected boolean returnHotelInfo;
    @XmlElement(name = "OnlyRecommended")
    protected boolean onlyRecommended;
    @XmlElement(name = "HotelName")
    protected String hotelName;
    @XmlElement(name = "SelectedHotelsIds")
    protected ArrayOfInt selectedHotelsIds;
    @XmlElement(name = "HotelCategory")
    protected ArrayOfString hotelCategory;
    @XmlElement(name = "MinPrice")
    protected double minPrice;
    @XmlElement(name = "MaxPrice")
    protected double maxPrice;
    @XmlElement(name = "Locations")
    protected ArrayOfString locations;
    @XmlElement(name = "ReturnFilterInformation")
    protected boolean returnFilterInformation;

    /**
     * Gets the value of the numberOfPics property.
     * 
     */
    public int getNumberOfPics() {
        return numberOfPics;
    }

    /**
     * Sets the value of the numberOfPics property.
     * 
     */
    public void setNumberOfPics(int value) {
        this.numberOfPics = value;
    }

    /**
     * Gets the value of the cheapestRoomOnly property.
     * 
     */
    public boolean isCheapestRoomOnly() {
        return cheapestRoomOnly;
    }

    /**
     * Sets the value of the cheapestRoomOnly property.
     * 
     */
    public void setCheapestRoomOnly(boolean value) {
        this.cheapestRoomOnly = value;
    }

    /**
     * Gets the value of the descriptionLanguageISO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionLanguageISO() {
        return descriptionLanguageISO;
    }

    /**
     * Sets the value of the descriptionLanguageISO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionLanguageISO(String value) {
        this.descriptionLanguageISO = value;
    }

    /**
     * Gets the value of the returnHotelInfo property.
     * 
     */
    public boolean isReturnHotelInfo() {
        return returnHotelInfo;
    }

    /**
     * Sets the value of the returnHotelInfo property.
     * 
     */
    public void setReturnHotelInfo(boolean value) {
        this.returnHotelInfo = value;
    }

    /**
     * Gets the value of the onlyRecommended property.
     * 
     */
    public boolean isOnlyRecommended() {
        return onlyRecommended;
    }

    /**
     * Sets the value of the onlyRecommended property.
     * 
     */
    public void setOnlyRecommended(boolean value) {
        this.onlyRecommended = value;
    }

    /**
     * Gets the value of the hotelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelName() {
        return hotelName;
    }

    /**
     * Sets the value of the hotelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelName(String value) {
        this.hotelName = value;
    }

    /**
     * Gets the value of the selectedHotelsIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getSelectedHotelsIds() {
        return selectedHotelsIds;
    }

    /**
     * Sets the value of the selectedHotelsIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setSelectedHotelsIds(ArrayOfInt value) {
        this.selectedHotelsIds = value;
    }

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
     * Gets the value of the minPrice property.
     * 
     */
    public double getMinPrice() {
        return minPrice;
    }

    /**
     * Sets the value of the minPrice property.
     * 
     */
    public void setMinPrice(double value) {
        this.minPrice = value;
    }

    /**
     * Gets the value of the maxPrice property.
     * 
     */
    public double getMaxPrice() {
        return maxPrice;
    }

    /**
     * Sets the value of the maxPrice property.
     * 
     */
    public void setMaxPrice(double value) {
        this.maxPrice = value;
    }

    /**
     * Gets the value of the locations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getLocations() {
        return locations;
    }

    /**
     * Sets the value of the locations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setLocations(ArrayOfString value) {
        this.locations = value;
    }

    /**
     * Gets the value of the returnFilterInformation property.
     * 
     */
    public boolean isReturnFilterInformation() {
        return returnFilterInformation;
    }

    /**
     * Sets the value of the returnFilterInformation property.
     * 
     */
    public void setReturnFilterInformation(boolean value) {
        this.returnFilterInformation = value;
    }

}
