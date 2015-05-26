
package es.juniper.webservice._2007;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.opentravel.ota._2003._05.TPAExtensionsType;


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
 *         &lt;element name="JP_HotelListRQ" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="POS" type="{http://www.juniper.es/webservice/2007/}ArrayOfSourceType" minOccurs="0"/>
 *                   &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions_Type" minOccurs="0"/>
 *                   &lt;element name="FromDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="Zone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="PrimaryLangID" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "", propOrder = {
    "jpHotelListRQ"
})
@XmlRootElement(name = "JP_HotelListService")
public class JPHotelListService {

    @XmlElement(name = "JP_HotelListRQ")
    protected JPHotelListService.JPHotelListRQ jpHotelListRQ;

    /**
     * Gets the value of the jpHotelListRQ property.
     * 
     * @return
     *     possible object is
     *     {@link JPHotelListService.JPHotelListRQ }
     *     
     */
    public JPHotelListService.JPHotelListRQ getJPHotelListRQ() {
        return jpHotelListRQ;
    }

    /**
     * Sets the value of the jpHotelListRQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link JPHotelListService.JPHotelListRQ }
     *     
     */
    public void setJPHotelListRQ(JPHotelListService.JPHotelListRQ value) {
        this.jpHotelListRQ = value;
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
     *         &lt;element name="POS" type="{http://www.juniper.es/webservice/2007/}ArrayOfSourceType" minOccurs="0"/>
     *         &lt;element name="TPA_Extensions" type="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions_Type" minOccurs="0"/>
     *         &lt;element name="FromDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="Zone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="PrimaryLangID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "pos",
        "tpaExtensions",
        "fromDate",
        "zone"
    })
    public static class JPHotelListRQ {

        @XmlElement(name = "POS")
        protected ArrayOfSourceType pos;
        @XmlElement(name = "TPA_Extensions")
        protected TPAExtensionsType tpaExtensions;
        @XmlElement(name = "FromDate", required = true, nillable = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar fromDate;
        @XmlElement(name = "Zone")
        protected String zone;
        @XmlAttribute(name = "PrimaryLangID")
        protected String primaryLangID;

        /**
         * Gets the value of the pos property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfSourceType }
         *     
         */
        public ArrayOfSourceType getPOS() {
            return pos;
        }

        /**
         * Sets the value of the pos property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfSourceType }
         *     
         */
        public void setPOS(ArrayOfSourceType value) {
            this.pos = value;
        }

        /**
         * Gets the value of the tpaExtensions property.
         * 
         * @return
         *     possible object is
         *     {@link TPAExtensionsType }
         *     
         */
        public TPAExtensionsType getTPAExtensions() {
            return tpaExtensions;
        }

        /**
         * Sets the value of the tpaExtensions property.
         * 
         * @param value
         *     allowed object is
         *     {@link TPAExtensionsType }
         *     
         */
        public void setTPAExtensions(TPAExtensionsType value) {
            this.tpaExtensions = value;
        }

        /**
         * Gets the value of the fromDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFromDate() {
            return fromDate;
        }

        /**
         * Sets the value of the fromDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFromDate(XMLGregorianCalendar value) {
            this.fromDate = value;
        }

        /**
         * Gets the value of the zone property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZone() {
            return zone;
        }

        /**
         * Sets the value of the zone property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZone(String value) {
            this.zone = value;
        }

        /**
         * Gets the value of the primaryLangID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrimaryLangID() {
            return primaryLangID;
        }

        /**
         * Sets the value of the primaryLangID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrimaryLangID(String value) {
            this.primaryLangID = value;
        }

    }

}
