
package com.tourico.schemas.webservices.hotelv3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReservationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReservationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdultsNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ChildNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ChildAges" type="{http://schemas.tourico.com/webservices/hotelv3}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="RoomReserveInfo" type="{http://schemas.tourico.com/webservices/hotelv3}AmendRoomReserveInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="reservationId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationType", propOrder = {
    "adultsNum",
    "childNum",
    "childAges",
    "roomReserveInfo"
})
public class ReservationType {

    @XmlElementRef(name = "AdultsNum", namespace = "http://schemas.tourico.com/webservices/hotelv3", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> adultsNum;
    @XmlElementRef(name = "ChildNum", namespace = "http://schemas.tourico.com/webservices/hotelv3", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> childNum;
    @XmlElement(name = "ChildAges")
    protected ArrayOfInt childAges;
    @XmlElement(name = "RoomReserveInfo")
    protected AmendRoomReserveInfo roomReserveInfo;
    @XmlAttribute(name = "reservationId", required = true)
    protected int reservationId;

    /**
     * Gets the value of the adultsNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAdultsNum() {
        return adultsNum;
    }

    /**
     * Sets the value of the adultsNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAdultsNum(JAXBElement<Integer> value) {
        this.adultsNum = value;
    }

    /**
     * Gets the value of the childNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getChildNum() {
        return childNum;
    }

    /**
     * Sets the value of the childNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setChildNum(JAXBElement<Integer> value) {
        this.childNum = value;
    }

    /**
     * Gets the value of the childAges property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getChildAges() {
        return childAges;
    }

    /**
     * Sets the value of the childAges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setChildAges(ArrayOfInt value) {
        this.childAges = value;
    }

    /**
     * Gets the value of the roomReserveInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AmendRoomReserveInfo }
     *     
     */
    public AmendRoomReserveInfo getRoomReserveInfo() {
        return roomReserveInfo;
    }

    /**
     * Sets the value of the roomReserveInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmendRoomReserveInfo }
     *     
     */
    public void setRoomReserveInfo(AmendRoomReserveInfo value) {
        this.roomReserveInfo = value;
    }

    /**
     * Gets the value of the reservationId property.
     * 
     */
    public int getReservationId() {
        return reservationId;
    }

    /**
     * Sets the value of the reservationId property.
     * 
     */
    public void setReservationId(int value) {
        this.reservationId = value;
    }

}
