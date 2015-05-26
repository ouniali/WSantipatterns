
package org.datacontract.schemas._2004._07.mouzenidis_services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.mouzenidis_services_objects.ArrayOfAccommodation;
import org.datacontract.schemas._2004._07.mouzenidis_services_objects.TouristCountDetail;


/**
 * <p>Java class for QuotaHotelRoomVariant complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuotaHotelRoomVariant">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Accomodations" type="{http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects.Dictionary}ArrayOfAccommodation" minOccurs="0"/>
 *         &lt;element name="HotelGlobalRoomCategoryKey" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HotelRoomCategoryKey" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HotelRoomTypeKey" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="QuotaDateStates" type="{http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects}ArrayOfQuotaDateState" minOccurs="0"/>
 *         &lt;element name="RoomVariant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TouristCountDetail" type="{http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects.Dictionary}TouristCountDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuotaHotelRoomVariant", propOrder = {
    "accomodations",
    "hotelGlobalRoomCategoryKey",
    "hotelRoomCategoryKey",
    "hotelRoomTypeKey",
    "quotaDateStates",
    "roomVariant",
    "touristCountDetail"
})
public class QuotaHotelRoomVariant {

    @XmlElementRef(name = "Accomodations", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAccommodation> accomodations;
    @XmlElement(name = "HotelGlobalRoomCategoryKey")
    protected Integer hotelGlobalRoomCategoryKey;
    @XmlElement(name = "HotelRoomCategoryKey")
    protected Integer hotelRoomCategoryKey;
    @XmlElement(name = "HotelRoomTypeKey")
    protected Integer hotelRoomTypeKey;
    @XmlElementRef(name = "QuotaDateStates", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfQuotaDateState> quotaDateStates;
    @XmlElementRef(name = "RoomVariant", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> roomVariant;
    @XmlElementRef(name = "TouristCountDetail", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<TouristCountDetail> touristCountDetail;

    /**
     * Gets the value of the accomodations property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAccommodation }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAccommodation> getAccomodations() {
        return accomodations;
    }

    /**
     * Sets the value of the accomodations property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAccommodation }{@code >}
     *     
     */
    public void setAccomodations(JAXBElement<ArrayOfAccommodation> value) {
        this.accomodations = value;
    }

    /**
     * Gets the value of the hotelGlobalRoomCategoryKey property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHotelGlobalRoomCategoryKey() {
        return hotelGlobalRoomCategoryKey;
    }

    /**
     * Sets the value of the hotelGlobalRoomCategoryKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHotelGlobalRoomCategoryKey(Integer value) {
        this.hotelGlobalRoomCategoryKey = value;
    }

    /**
     * Gets the value of the hotelRoomCategoryKey property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHotelRoomCategoryKey() {
        return hotelRoomCategoryKey;
    }

    /**
     * Sets the value of the hotelRoomCategoryKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHotelRoomCategoryKey(Integer value) {
        this.hotelRoomCategoryKey = value;
    }

    /**
     * Gets the value of the hotelRoomTypeKey property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHotelRoomTypeKey() {
        return hotelRoomTypeKey;
    }

    /**
     * Sets the value of the hotelRoomTypeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHotelRoomTypeKey(Integer value) {
        this.hotelRoomTypeKey = value;
    }

    /**
     * Gets the value of the quotaDateStates property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfQuotaDateState }{@code >}
     *     
     */
    public JAXBElement<ArrayOfQuotaDateState> getQuotaDateStates() {
        return quotaDateStates;
    }

    /**
     * Sets the value of the quotaDateStates property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfQuotaDateState }{@code >}
     *     
     */
    public void setQuotaDateStates(JAXBElement<ArrayOfQuotaDateState> value) {
        this.quotaDateStates = value;
    }

    /**
     * Gets the value of the roomVariant property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRoomVariant() {
        return roomVariant;
    }

    /**
     * Sets the value of the roomVariant property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRoomVariant(JAXBElement<String> value) {
        this.roomVariant = value;
    }

    /**
     * Gets the value of the touristCountDetail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TouristCountDetail }{@code >}
     *     
     */
    public JAXBElement<TouristCountDetail> getTouristCountDetail() {
        return touristCountDetail;
    }

    /**
     * Sets the value of the touristCountDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TouristCountDetail }{@code >}
     *     
     */
    public void setTouristCountDetail(JAXBElement<TouristCountDetail> value) {
        this.touristCountDetail = value;
    }

}
