
package hotel.ws_2013;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import hotel.ws_2013.cangooroo.HotelResultCancellationPolicy;


/**
 * <p>Java class for HotelResultBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelResultBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Promotions" type="{WS_2013.Hotel}Promotions" minOccurs="0"/>
 *         &lt;element name="CheckInDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="NumberOfNights" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HotelId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Recommended" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="HotelInfo" type="{WS_2013.Hotel}HotelDetail" minOccurs="0"/>
 *         &lt;element name="NewGroups" type="{WS_2013.Hotel}ArrayOfGroup" minOccurs="0"/>
 *         &lt;element name="LocationNames" type="{WS_2013.Hotel}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="RecomendationsOrder" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelResultBase", propOrder = {
    "promotions",
    "checkInDate",
    "numberOfNights",
    "hotelId",
    "recommended",
    "hotelInfo",
    "newGroups",
    "locationNames",
    "recomendationsOrder"
})
@XmlSeeAlso({
    HotelResultBaseB.class,
    HotelResultCancellationPolicy.class
})
public abstract class HotelResultBase {

    @XmlElement(name = "Promotions")
    protected Promotions promotions;
    @XmlElement(name = "CheckInDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar checkInDate;
    @XmlElement(name = "NumberOfNights")
    protected int numberOfNights;
    @XmlElement(name = "HotelId")
    protected int hotelId;
    @XmlElement(name = "Recommended")
    protected boolean recommended;
    @XmlElement(name = "HotelInfo")
    protected HotelDetail hotelInfo;
    @XmlElement(name = "NewGroups")
    protected ArrayOfGroup newGroups;
    @XmlElement(name = "LocationNames")
    protected ArrayOfString locationNames;
    @XmlElement(name = "RecomendationsOrder", required = true, type = Integer.class, nillable = true)
    protected Integer recomendationsOrder;

    /**
     * Gets the value of the promotions property.
     * 
     * @return
     *     possible object is
     *     {@link Promotions }
     *     
     */
    public Promotions getPromotions() {
        return promotions;
    }

    /**
     * Sets the value of the promotions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Promotions }
     *     
     */
    public void setPromotions(Promotions value) {
        this.promotions = value;
    }

    /**
     * Gets the value of the checkInDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCheckInDate() {
        return checkInDate;
    }

    /**
     * Sets the value of the checkInDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCheckInDate(XMLGregorianCalendar value) {
        this.checkInDate = value;
    }

    /**
     * Gets the value of the numberOfNights property.
     * 
     */
    public int getNumberOfNights() {
        return numberOfNights;
    }

    /**
     * Sets the value of the numberOfNights property.
     * 
     */
    public void setNumberOfNights(int value) {
        this.numberOfNights = value;
    }

    /**
     * Gets the value of the hotelId property.
     * 
     */
    public int getHotelId() {
        return hotelId;
    }

    /**
     * Sets the value of the hotelId property.
     * 
     */
    public void setHotelId(int value) {
        this.hotelId = value;
    }

    /**
     * Gets the value of the recommended property.
     * 
     */
    public boolean isRecommended() {
        return recommended;
    }

    /**
     * Sets the value of the recommended property.
     * 
     */
    public void setRecommended(boolean value) {
        this.recommended = value;
    }

    /**
     * Gets the value of the hotelInfo property.
     * 
     * @return
     *     possible object is
     *     {@link HotelDetail }
     *     
     */
    public HotelDetail getHotelInfo() {
        return hotelInfo;
    }

    /**
     * Sets the value of the hotelInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelDetail }
     *     
     */
    public void setHotelInfo(HotelDetail value) {
        this.hotelInfo = value;
    }

    /**
     * Gets the value of the newGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGroup }
     *     
     */
    public ArrayOfGroup getNewGroups() {
        return newGroups;
    }

    /**
     * Sets the value of the newGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGroup }
     *     
     */
    public void setNewGroups(ArrayOfGroup value) {
        this.newGroups = value;
    }

    /**
     * Gets the value of the locationNames property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getLocationNames() {
        return locationNames;
    }

    /**
     * Sets the value of the locationNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setLocationNames(ArrayOfString value) {
        this.locationNames = value;
    }

    /**
     * Gets the value of the recomendationsOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecomendationsOrder() {
        return recomendationsOrder;
    }

    /**
     * Sets the value of the recomendationsOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecomendationsOrder(Integer value) {
        this.recomendationsOrder = value;
    }

}
