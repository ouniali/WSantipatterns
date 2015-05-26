
package org.opentravel.ota._2003._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Java class for RateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Rate" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AmountType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *                 &lt;attribute name="RateMode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                 &lt;attribute name="CachedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="RateSource" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *                 &lt;attribute name="RateTypeCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                 &lt;attribute name="RoomPricingType" type="{http://www.opentravel.org/OTA/2003/05}PricingType" />
 *               &lt;/extension>
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
@XmlType(name = "RateType", propOrder = {
    "rate"
})
public class RateType {

    @XmlElement(name = "Rate", required = true)
    protected List<RateType.Rate> rate;

    /**
     * Gets the value of the rate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateType.Rate }
     * 
     * 
     */
    public List<RateType.Rate> getRate() {
        if (rate == null) {
            rate = new ArrayList<RateType.Rate>();
        }
        return this.rate;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AmountType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}duration" />
     *       &lt;attribute name="RateMode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *       &lt;attribute name="CachedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="RateSource" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
     *       &lt;attribute name="RateTypeCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *       &lt;attribute name="RoomPricingType" type="{http://www.opentravel.org/OTA/2003/05}PricingType" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tpaExtensions"
    })
    public static class Rate
        extends AmountType
    {

        @XmlElement(name = "TPA_Extensions")
        protected TPAExtensionsType tpaExtensions;
        @XmlAttribute(name = "Duration")
        protected Duration duration;
        @XmlAttribute(name = "RateMode")
        protected String rateMode;
        @XmlAttribute(name = "CachedIndicator")
        protected Boolean cachedIndicator;
        @XmlAttribute(name = "RateSource")
        protected String rateSource;
        @XmlAttribute(name = "RateTypeCode")
        protected String rateTypeCode;
        @XmlAttribute(name = "RoomPricingType")
        protected PricingType roomPricingType;

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
         * Gets the value of the duration property.
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getDuration() {
            return duration;
        }

        /**
         * Sets the value of the duration property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setDuration(Duration value) {
            this.duration = value;
        }

        /**
         * Gets the value of the rateMode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRateMode() {
            return rateMode;
        }

        /**
         * Sets the value of the rateMode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRateMode(String value) {
            this.rateMode = value;
        }

        /**
         * Gets the value of the cachedIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCachedIndicator() {
            return cachedIndicator;
        }

        /**
         * Sets the value of the cachedIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCachedIndicator(Boolean value) {
            this.cachedIndicator = value;
        }

        /**
         * Gets the value of the rateSource property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRateSource() {
            return rateSource;
        }

        /**
         * Sets the value of the rateSource property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRateSource(String value) {
            this.rateSource = value;
        }

        /**
         * Gets the value of the rateTypeCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRateTypeCode() {
            return rateTypeCode;
        }

        /**
         * Sets the value of the rateTypeCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRateTypeCode(String value) {
            this.rateTypeCode = value;
        }

        /**
         * Gets the value of the roomPricingType property.
         * 
         * @return
         *     possible object is
         *     {@link PricingType }
         *     
         */
        public PricingType getRoomPricingType() {
            return roomPricingType;
        }

        /**
         * Sets the value of the roomPricingType property.
         * 
         * @param value
         *     allowed object is
         *     {@link PricingType }
         *     
         */
        public void setRoomPricingType(PricingType value) {
            this.roomPricingType = value;
        }

    }

}
