
package travel.whl.api.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Provides information on the source of a request.
 * 
 * <p>Java class for SourceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SourceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestorID" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://api.whl.travel/soap}UniqueID_Type">
 *                 &lt;attribute name="MessagePassword" type="{http://api.whl.travel/soap}StringLength1to16" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BookingChannel" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CompanyName" type="{http://api.whl.travel/soap}CompanyNameType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://api.whl.travel/soap}BookingChannelGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ISOCurrency" type="{http://api.whl.travel/soap}AlphaLength3" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SourceType", propOrder = {
    "requestorID",
    "bookingChannel"
})
public class SourceType {

    @XmlElement(name = "RequestorID")
    protected SourceType.RequestorID requestorID;
    @XmlElement(name = "BookingChannel")
    protected SourceType.BookingChannel bookingChannel;
    @XmlAttribute(name = "ISOCurrency")
    protected String isoCurrency;

    /**
     * Gets the value of the requestorID property.
     * 
     * @return
     *     possible object is
     *     {@link SourceType.RequestorID }
     *     
     */
    public SourceType.RequestorID getRequestorID() {
        return requestorID;
    }

    /**
     * Sets the value of the requestorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceType.RequestorID }
     *     
     */
    public void setRequestorID(SourceType.RequestorID value) {
        this.requestorID = value;
    }

    /**
     * Gets the value of the bookingChannel property.
     * 
     * @return
     *     possible object is
     *     {@link SourceType.BookingChannel }
     *     
     */
    public SourceType.BookingChannel getBookingChannel() {
        return bookingChannel;
    }

    /**
     * Sets the value of the bookingChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceType.BookingChannel }
     *     
     */
    public void setBookingChannel(SourceType.BookingChannel value) {
        this.bookingChannel = value;
    }

    /**
     * Gets the value of the isoCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISOCurrency() {
        return isoCurrency;
    }

    /**
     * Sets the value of the isoCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISOCurrency(String value) {
        this.isoCurrency = value;
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
     *       &lt;sequence>
     *         &lt;element name="CompanyName" type="{http://api.whl.travel/soap}CompanyNameType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://api.whl.travel/soap}BookingChannelGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "companyName"
    })
    public static class BookingChannel {

        @XmlElement(name = "CompanyName")
        protected CompanyNameType companyName;
        @XmlAttribute(name = "Type", required = true)
        protected String type;
        @XmlAttribute(name = "Primary")
        protected Boolean primary;

        /**
         * Gets the value of the companyName property.
         * 
         * @return
         *     possible object is
         *     {@link CompanyNameType }
         *     
         */
        public CompanyNameType getCompanyName() {
            return companyName;
        }

        /**
         * Sets the value of the companyName property.
         * 
         * @param value
         *     allowed object is
         *     {@link CompanyNameType }
         *     
         */
        public void setCompanyName(CompanyNameType value) {
            this.companyName = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * Gets the value of the primary property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPrimary() {
            return primary;
        }

        /**
         * Sets the value of the primary property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPrimary(Boolean value) {
            this.primary = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://api.whl.travel/soap}UniqueID_Type">
     *       &lt;attribute name="MessagePassword" type="{http://api.whl.travel/soap}StringLength1to16" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RequestorID
        extends UniqueIDType
    {

        @XmlAttribute(name = "MessagePassword")
        protected String messagePassword;

        /**
         * Gets the value of the messagePassword property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMessagePassword() {
            return messagePassword;
        }

        /**
         * Sets the value of the messagePassword property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMessagePassword(String value) {
            this.messagePassword = value;
        }

    }

}
