
package org.datacontract.schemas._2004._07.mouzenidis_services_objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelRoom complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelRoom">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects.Dictionary}DictionaryBase">
 *       &lt;sequence>
 *         &lt;element name="AccommodationID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RoomCategoryID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RoomTypeID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelRoom", propOrder = {
    "accommodationID",
    "roomCategoryID",
    "roomTypeID"
})
public class HotelRoom
    extends DictionaryBase
{

    @XmlElement(name = "AccommodationID")
    protected Integer accommodationID;
    @XmlElement(name = "RoomCategoryID")
    protected Integer roomCategoryID;
    @XmlElement(name = "RoomTypeID")
    protected Integer roomTypeID;

    /**
     * Gets the value of the accommodationID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccommodationID() {
        return accommodationID;
    }

    /**
     * Sets the value of the accommodationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccommodationID(Integer value) {
        this.accommodationID = value;
    }

    /**
     * Gets the value of the roomCategoryID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRoomCategoryID() {
        return roomCategoryID;
    }

    /**
     * Sets the value of the roomCategoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRoomCategoryID(Integer value) {
        this.roomCategoryID = value;
    }

    /**
     * Gets the value of the roomTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRoomTypeID() {
        return roomTypeID;
    }

    /**
     * Sets the value of the roomTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRoomTypeID(Integer value) {
        this.roomTypeID = value;
    }

}
