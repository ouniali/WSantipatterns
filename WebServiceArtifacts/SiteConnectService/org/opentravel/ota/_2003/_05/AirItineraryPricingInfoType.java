
package org.opentravel.ota._2003._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for AirItineraryPricingInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirItineraryPricingInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItinTotalFare" maxOccurs="2" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FareType">
 *                 &lt;attribute name="Usage">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                       &lt;enumeration value="PassengerFare"/>
 *                       &lt;enumeration value="TicketFee"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PTC_FareBreakdowns" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PTC_FareBreakdown" type="{http://www.opentravel.org/OTA/2003/05}PTCFareBreakdownType" maxOccurs="256"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FareInfos" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FareInfo" maxOccurs="10">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FareInfoType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
 *                           &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PriceRequestInformation" type="{http://www.opentravel.org/OTA/2003/05}PriceRequestInformationType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PricingSource" type="{http://www.opentravel.org/OTA/2003/05}PricingSourceType" />
 *       &lt;attribute name="ValidatingAirlineCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *       &lt;attribute name="QuoteID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirItineraryPricingInfoType", propOrder = {
    "itinTotalFare",
    "ptcFareBreakdowns",
    "fareInfos",
    "priceRequestInformation"
})
@XmlSeeAlso({
    BookingPriceInfoType.class,
    org.opentravel.ota._2003._05.PricedItineraryType.AirItineraryPricingInfo.class
})
public class AirItineraryPricingInfoType {

    @XmlElement(name = "ItinTotalFare")
    protected List<AirItineraryPricingInfoType.ItinTotalFare> itinTotalFare;
    @XmlElement(name = "PTC_FareBreakdowns")
    protected AirItineraryPricingInfoType.PTCFareBreakdowns ptcFareBreakdowns;
    @XmlElement(name = "FareInfos")
    protected AirItineraryPricingInfoType.FareInfos fareInfos;
    @XmlElement(name = "PriceRequestInformation")
    protected PriceRequestInformationType priceRequestInformation;
    @XmlAttribute(name = "PricingSource")
    protected PricingSourceType pricingSource;
    @XmlAttribute(name = "ValidatingAirlineCode")
    protected String validatingAirlineCode;
    @XmlAttribute(name = "QuoteID")
    protected String quoteID;

    /**
     * Gets the value of the itinTotalFare property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itinTotalFare property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItinTotalFare().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirItineraryPricingInfoType.ItinTotalFare }
     * 
     * 
     */
    public List<AirItineraryPricingInfoType.ItinTotalFare> getItinTotalFare() {
        if (itinTotalFare == null) {
            itinTotalFare = new ArrayList<AirItineraryPricingInfoType.ItinTotalFare>();
        }
        return this.itinTotalFare;
    }

    /**
     * Gets the value of the ptcFareBreakdowns property.
     * 
     * @return
     *     possible object is
     *     {@link AirItineraryPricingInfoType.PTCFareBreakdowns }
     *     
     */
    public AirItineraryPricingInfoType.PTCFareBreakdowns getPTCFareBreakdowns() {
        return ptcFareBreakdowns;
    }

    /**
     * Sets the value of the ptcFareBreakdowns property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirItineraryPricingInfoType.PTCFareBreakdowns }
     *     
     */
    public void setPTCFareBreakdowns(AirItineraryPricingInfoType.PTCFareBreakdowns value) {
        this.ptcFareBreakdowns = value;
    }

    /**
     * Gets the value of the fareInfos property.
     * 
     * @return
     *     possible object is
     *     {@link AirItineraryPricingInfoType.FareInfos }
     *     
     */
    public AirItineraryPricingInfoType.FareInfos getFareInfos() {
        return fareInfos;
    }

    /**
     * Sets the value of the fareInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirItineraryPricingInfoType.FareInfos }
     *     
     */
    public void setFareInfos(AirItineraryPricingInfoType.FareInfos value) {
        this.fareInfos = value;
    }

    /**
     * Gets the value of the priceRequestInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PriceRequestInformationType }
     *     
     */
    public PriceRequestInformationType getPriceRequestInformation() {
        return priceRequestInformation;
    }

    /**
     * Sets the value of the priceRequestInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceRequestInformationType }
     *     
     */
    public void setPriceRequestInformation(PriceRequestInformationType value) {
        this.priceRequestInformation = value;
    }

    /**
     * Gets the value of the pricingSource property.
     * 
     * @return
     *     possible object is
     *     {@link PricingSourceType }
     *     
     */
    public PricingSourceType getPricingSource() {
        return pricingSource;
    }

    /**
     * Sets the value of the pricingSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingSourceType }
     *     
     */
    public void setPricingSource(PricingSourceType value) {
        this.pricingSource = value;
    }

    /**
     * Gets the value of the validatingAirlineCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidatingAirlineCode() {
        return validatingAirlineCode;
    }

    /**
     * Sets the value of the validatingAirlineCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidatingAirlineCode(String value) {
        this.validatingAirlineCode = value;
    }

    /**
     * Gets the value of the quoteID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuoteID() {
        return quoteID;
    }

    /**
     * Sets the value of the quoteID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuoteID(String value) {
        this.quoteID = value;
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
     *         &lt;element name="FareInfo" maxOccurs="10">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FareInfoType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
     *                 &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
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
    @XmlType(name = "", propOrder = {
        "fareInfo"
    })
    public static class FareInfos {

        @XmlElement(name = "FareInfo", required = true)
        protected List<AirItineraryPricingInfoType.FareInfos.FareInfo> fareInfo;

        /**
         * Gets the value of the fareInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fareInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFareInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirItineraryPricingInfoType.FareInfos.FareInfo }
         * 
         * 
         */
        public List<AirItineraryPricingInfoType.FareInfos.FareInfo> getFareInfo() {
            if (fareInfo == null) {
                fareInfo = new ArrayList<AirItineraryPricingInfoType.FareInfos.FareInfo>();
            }
            return this.fareInfo;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FareInfoType">
         *       &lt;sequence>
         *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
         *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
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
        public static class FareInfo
            extends FareInfoType
        {

            @XmlElement(name = "TPA_Extensions")
            protected TPAExtensionsType tpaExtensions;
            @XmlAttribute(name = "Operation")
            protected ActionType operation;
            @XmlAttribute(name = "RPH")
            protected String rph;

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
             * Gets the value of the operation property.
             * 
             * @return
             *     possible object is
             *     {@link ActionType }
             *     
             */
            public ActionType getOperation() {
                return operation;
            }

            /**
             * Sets the value of the operation property.
             * 
             * @param value
             *     allowed object is
             *     {@link ActionType }
             *     
             */
            public void setOperation(ActionType value) {
                this.operation = value;
            }

            /**
             * Gets the value of the rph property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRPH() {
                return rph;
            }

            /**
             * Sets the value of the rph property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRPH(String value) {
                this.rph = value;
            }

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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FareType">
     *       &lt;attribute name="Usage">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *             &lt;enumeration value="PassengerFare"/>
     *             &lt;enumeration value="TicketFee"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ItinTotalFare
        extends FareType
    {

        @XmlAttribute(name = "Usage")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String usage;

        /**
         * Gets the value of the usage property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUsage() {
            return usage;
        }

        /**
         * Sets the value of the usage property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUsage(String value) {
            this.usage = value;
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="PTC_FareBreakdown" type="{http://www.opentravel.org/OTA/2003/05}PTCFareBreakdownType" maxOccurs="256"/>
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
        "ptcFareBreakdown"
    })
    public static class PTCFareBreakdowns {

        @XmlElement(name = "PTC_FareBreakdown", required = true)
        protected List<PTCFareBreakdownType> ptcFareBreakdown;

        /**
         * Gets the value of the ptcFareBreakdown property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ptcFareBreakdown property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPTCFareBreakdown().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PTCFareBreakdownType }
         * 
         * 
         */
        public List<PTCFareBreakdownType> getPTCFareBreakdown() {
            if (ptcFareBreakdown == null) {
                ptcFareBreakdown = new ArrayList<PTCFareBreakdownType>();
            }
            return this.ptcFareBreakdown;
        }

    }

}
