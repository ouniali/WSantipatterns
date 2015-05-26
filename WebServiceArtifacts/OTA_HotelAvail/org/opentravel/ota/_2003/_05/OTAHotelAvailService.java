
package org.opentravel.ota._2003._05;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="OTA_HotelAvailRQ" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="POS" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfSourceType" minOccurs="0"/>
 *                   &lt;element name="AvailRequestSegments" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AvailRequestSegmentsType">
 *                           &lt;attribute name="MaximumWaitTime" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="PrimaryLangID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="SequenceNmbr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="IsModify" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
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
    "otaHotelAvailRQ"
})
@XmlRootElement(name = "OTA_HotelAvailService")
public class OTAHotelAvailService {

    @XmlElement(name = "OTA_HotelAvailRQ")
    protected OTAHotelAvailService.OTAHotelAvailRQ otaHotelAvailRQ;

    /**
     * Gets the value of the otaHotelAvailRQ property.
     * 
     * @return
     *     possible object is
     *     {@link OTAHotelAvailService.OTAHotelAvailRQ }
     *     
     */
    public OTAHotelAvailService.OTAHotelAvailRQ getOTAHotelAvailRQ() {
        return otaHotelAvailRQ;
    }

    /**
     * Sets the value of the otaHotelAvailRQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTAHotelAvailService.OTAHotelAvailRQ }
     *     
     */
    public void setOTAHotelAvailRQ(OTAHotelAvailService.OTAHotelAvailRQ value) {
        this.otaHotelAvailRQ = value;
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
     *         &lt;element name="POS" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfSourceType" minOccurs="0"/>
     *         &lt;element name="AvailRequestSegments" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AvailRequestSegmentsType">
     *                 &lt;attribute name="MaximumWaitTime" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="PrimaryLangID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="SequenceNmbr" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="IsModify" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
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
        "availRequestSegments"
    })
    public static class OTAHotelAvailRQ {

        @XmlElement(name = "POS")
        protected ArrayOfSourceType pos;
        @XmlElement(name = "AvailRequestSegments")
        protected OTAHotelAvailService.OTAHotelAvailRQ.AvailRequestSegments availRequestSegments;
        @XmlAttribute(name = "PrimaryLangID")
        protected String primaryLangID;
        @XmlAttribute(name = "SequenceNmbr")
        protected String sequenceNmbr;
        @XmlAttribute(name = "IsModify")
        protected Boolean isModify;

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
         * Gets the value of the availRequestSegments property.
         * 
         * @return
         *     possible object is
         *     {@link OTAHotelAvailService.OTAHotelAvailRQ.AvailRequestSegments }
         *     
         */
        public OTAHotelAvailService.OTAHotelAvailRQ.AvailRequestSegments getAvailRequestSegments() {
            return availRequestSegments;
        }

        /**
         * Sets the value of the availRequestSegments property.
         * 
         * @param value
         *     allowed object is
         *     {@link OTAHotelAvailService.OTAHotelAvailRQ.AvailRequestSegments }
         *     
         */
        public void setAvailRequestSegments(OTAHotelAvailService.OTAHotelAvailRQ.AvailRequestSegments value) {
            this.availRequestSegments = value;
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

        /**
         * Gets the value of the sequenceNmbr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSequenceNmbr() {
            return sequenceNmbr;
        }

        /**
         * Sets the value of the sequenceNmbr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSequenceNmbr(String value) {
            this.sequenceNmbr = value;
        }

        /**
         * Gets the value of the isModify property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isIsModify() {
            if (isModify == null) {
                return false;
            } else {
                return isModify;
            }
        }

        /**
         * Sets the value of the isModify property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsModify(Boolean value) {
            this.isModify = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AvailRequestSegmentsType">
         *       &lt;attribute name="MaximumWaitTime" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AvailRequestSegments
            extends AvailRequestSegmentsType
        {

            @XmlAttribute(name = "MaximumWaitTime")
            protected BigDecimal maximumWaitTime;

            /**
             * Gets the value of the maximumWaitTime property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMaximumWaitTime() {
                return maximumWaitTime;
            }

            /**
             * Sets the value of the maximumWaitTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMaximumWaitTime(BigDecimal value) {
                this.maximumWaitTime = value;
            }

        }

    }

}
