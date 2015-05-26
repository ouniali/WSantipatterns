
package com.tourico.webservices.hotelv3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nResId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="hotelId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="hotelRoomTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dtCheckIn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="dtCheckOut" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nResId",
    "hotelId",
    "hotelRoomTypeId",
    "productId",
    "dtCheckIn",
    "dtCheckOut"
})
@XmlRootElement(name = "GetCancellationPolicies")
public class GetCancellationPolicies {

    protected int nResId;
    protected int hotelId;
    protected int hotelRoomTypeId;
    protected String productId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtCheckIn;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtCheckOut;

    /**
     * Gets the value of the nResId property.
     * 
     */
    public int getNResId() {
        return nResId;
    }

    /**
     * Sets the value of the nResId property.
     * 
     */
    public void setNResId(int value) {
        this.nResId = value;
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
     * Gets the value of the hotelRoomTypeId property.
     * 
     */
    public int getHotelRoomTypeId() {
        return hotelRoomTypeId;
    }

    /**
     * Sets the value of the hotelRoomTypeId property.
     * 
     */
    public void setHotelRoomTypeId(int value) {
        this.hotelRoomTypeId = value;
    }

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductId(String value) {
        this.productId = value;
    }

    /**
     * Gets the value of the dtCheckIn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtCheckIn() {
        return dtCheckIn;
    }

    /**
     * Sets the value of the dtCheckIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtCheckIn(XMLGregorianCalendar value) {
        this.dtCheckIn = value;
    }

    /**
     * Gets the value of the dtCheckOut property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtCheckOut() {
        return dtCheckOut;
    }

    /**
     * Sets the value of the dtCheckOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtCheckOut(XMLGregorianCalendar value) {
        this.dtCheckOut = value;
    }

}
