
package org.datacontract.schemas._2004._07.mouzenidis_services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.mouzenidis_services_objects.Hotel;


/**
 * <p>Java class for QuotaHotelItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuotaHotelItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Hotel" type="{http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects.Dictionary}Hotel" minOccurs="0"/>
 *         &lt;element name="IsGroupResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="QuotaHotelRoomVariants" type="{http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects}ArrayOfQuotaHotelRoomVariant" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuotaHotelItem", propOrder = {
    "hotel",
    "isGroupResult",
    "quotaHotelRoomVariants"
})
public class QuotaHotelItem {

    @XmlElementRef(name = "Hotel", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<Hotel> hotel;
    @XmlElement(name = "IsGroupResult")
    protected Boolean isGroupResult;
    @XmlElementRef(name = "QuotaHotelRoomVariants", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfQuotaHotelRoomVariant> quotaHotelRoomVariants;

    /**
     * Gets the value of the hotel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Hotel }{@code >}
     *     
     */
    public JAXBElement<Hotel> getHotel() {
        return hotel;
    }

    /**
     * Sets the value of the hotel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Hotel }{@code >}
     *     
     */
    public void setHotel(JAXBElement<Hotel> value) {
        this.hotel = value;
    }

    /**
     * Gets the value of the isGroupResult property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsGroupResult() {
        return isGroupResult;
    }

    /**
     * Sets the value of the isGroupResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsGroupResult(Boolean value) {
        this.isGroupResult = value;
    }

    /**
     * Gets the value of the quotaHotelRoomVariants property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfQuotaHotelRoomVariant }{@code >}
     *     
     */
    public JAXBElement<ArrayOfQuotaHotelRoomVariant> getQuotaHotelRoomVariants() {
        return quotaHotelRoomVariants;
    }

    /**
     * Sets the value of the quotaHotelRoomVariants property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfQuotaHotelRoomVariant }{@code >}
     *     
     */
    public void setQuotaHotelRoomVariants(JAXBElement<ArrayOfQuotaHotelRoomVariant> value) {
        this.quotaHotelRoomVariants = value;
    }

}
