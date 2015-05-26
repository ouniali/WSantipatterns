
package org.opentravel.ota._2003._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for HotelReservationIDsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelReservationIDsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelReservationID" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ResID_Type" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                 &lt;attribute name="ResID_Value" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *                 &lt;attribute name="ResID_Source" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *                 &lt;attribute name="ResID_SourceContext" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *                 &lt;attribute name="ResID_Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="ForGuest" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="ResGuestRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                 &lt;attribute name="CancelOriginatorCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *                 &lt;attribute name="CancellationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelReservationIDsType", propOrder = {
    "hotelReservationID"
})
public class HotelReservationIDsType {

    @XmlElement(name = "HotelReservationID", required = true)
    protected List<HotelReservationIDsType.HotelReservationID> hotelReservationID;

    /**
     * Gets the value of the hotelReservationID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelReservationID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelReservationID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelReservationIDsType.HotelReservationID }
     * 
     * 
     */
    public List<HotelReservationIDsType.HotelReservationID> getHotelReservationID() {
        if (hotelReservationID == null) {
            hotelReservationID = new ArrayList<HotelReservationIDsType.HotelReservationID>();
        }
        return this.hotelReservationID;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="ResID_Type" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *       &lt;attribute name="ResID_Value" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
     *       &lt;attribute name="ResID_Source" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
     *       &lt;attribute name="ResID_SourceContext" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
     *       &lt;attribute name="ResID_Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="ForGuest" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="ResGuestRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *       &lt;attribute name="CancelOriginatorCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
     *       &lt;attribute name="CancellationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class HotelReservationID {

        @XmlAttribute(name = "ResID_Type")
        protected String resIDType;
        @XmlAttribute(name = "ResID_Value")
        protected String resIDValue;
        @XmlAttribute(name = "ResID_Source")
        protected String resIDSource;
        @XmlAttribute(name = "ResID_SourceContext")
        protected String resIDSourceContext;
        @XmlAttribute(name = "ResID_Date")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar resIDDate;
        @XmlAttribute(name = "ForGuest")
        protected Boolean forGuest;
        @XmlAttribute(name = "ResGuestRPH")
        protected String resGuestRPH;
        @XmlAttribute(name = "CancelOriginatorCode")
        protected String cancelOriginatorCode;
        @XmlAttribute(name = "CancellationDate")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar cancellationDate;

        /**
         * Gets the value of the resIDType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResIDType() {
            return resIDType;
        }

        /**
         * Sets the value of the resIDType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResIDType(String value) {
            this.resIDType = value;
        }

        /**
         * Gets the value of the resIDValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResIDValue() {
            return resIDValue;
        }

        /**
         * Sets the value of the resIDValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResIDValue(String value) {
            this.resIDValue = value;
        }

        /**
         * Gets the value of the resIDSource property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResIDSource() {
            return resIDSource;
        }

        /**
         * Sets the value of the resIDSource property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResIDSource(String value) {
            this.resIDSource = value;
        }

        /**
         * Gets the value of the resIDSourceContext property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResIDSourceContext() {
            return resIDSourceContext;
        }

        /**
         * Sets the value of the resIDSourceContext property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResIDSourceContext(String value) {
            this.resIDSourceContext = value;
        }

        /**
         * Gets the value of the resIDDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getResIDDate() {
            return resIDDate;
        }

        /**
         * Sets the value of the resIDDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setResIDDate(XMLGregorianCalendar value) {
            this.resIDDate = value;
        }

        /**
         * Gets the value of the forGuest property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isForGuest() {
            return forGuest;
        }

        /**
         * Sets the value of the forGuest property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setForGuest(Boolean value) {
            this.forGuest = value;
        }

        /**
         * Gets the value of the resGuestRPH property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResGuestRPH() {
            return resGuestRPH;
        }

        /**
         * Sets the value of the resGuestRPH property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResGuestRPH(String value) {
            this.resGuestRPH = value;
        }

        /**
         * Gets the value of the cancelOriginatorCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCancelOriginatorCode() {
            return cancelOriginatorCode;
        }

        /**
         * Sets the value of the cancelOriginatorCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCancelOriginatorCode(String value) {
            this.cancelOriginatorCode = value;
        }

        /**
         * Gets the value of the cancellationDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCancellationDate() {
            return cancellationDate;
        }

        /**
         * Sets the value of the cancellationDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCancellationDate(XMLGregorianCalendar value) {
            this.cancellationDate = value;
        }

    }

}
