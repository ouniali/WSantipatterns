
package org.opentravel.ota._2003._05;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfferType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OfferRules" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfOfferTypeOfferRule" minOccurs="0"/>
 *         &lt;element name="Discount" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="NightsRequired" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="NightsDiscounted" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="DiscountPattern" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="ChargeUnitCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FreeUpgrade" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="UpgradeFrom" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="InvCodeApplication">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="DoesNotApply"/>
 *                                 &lt;enumeration value="InvCode"/>
 *                                 &lt;enumeration value="InvGroupingCode"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="InvType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="InvTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="IsRoom" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="UpgradeTo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="InvCodeApplication">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="DoesNotApply"/>
 *                                 &lt;enumeration value="InvCode"/>
 *                                 &lt;enumeration value="InvGroupingCode"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="InvType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="InvTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="IsRoom" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="UpgradeBookingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OfferDescription" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
 *         &lt;element name="CompatibleOffers" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfOfferTypeCompatibleOffer" minOccurs="0"/>
 *         &lt;element name="Inventories" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfOfferTypeInventory" minOccurs="0"/>
 *         &lt;element name="Guests" type="{http://www.opentravel.org/OTA/2003/05}ArrayOfOfferTypeGuest" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="OfferCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ApplicationOrder" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferType", propOrder = {
    "offerRules",
    "discount",
    "freeUpgrade",
    "offerDescription",
    "compatibleOffers",
    "inventories",
    "guests"
})
@XmlSeeAlso({
    org.opentravel.ota._2003._05.ArrayOfHotelRatePlanTypeOffer.Offer.class
})
public class OfferType {

    @XmlElement(name = "OfferRules")
    protected ArrayOfOfferTypeOfferRule offerRules;
    @XmlElement(name = "Discount")
    protected OfferType.Discount discount;
    @XmlElement(name = "FreeUpgrade")
    protected OfferType.FreeUpgrade freeUpgrade;
    @XmlElement(name = "OfferDescription")
    protected ParagraphType offerDescription;
    @XmlElement(name = "CompatibleOffers")
    protected ArrayOfOfferTypeCompatibleOffer compatibleOffers;
    @XmlElement(name = "Inventories")
    protected ArrayOfOfferTypeInventory inventories;
    @XmlElement(name = "Guests")
    protected ArrayOfOfferTypeGuest guests;
    @XmlAttribute(name = "OfferCode")
    protected String offerCode;
    @XmlAttribute(name = "RPH")
    protected String rph;
    @XmlAttribute(name = "ApplicationOrder")
    protected BigInteger applicationOrder;

    /**
     * Gets the value of the offerRules property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOfferTypeOfferRule }
     *     
     */
    public ArrayOfOfferTypeOfferRule getOfferRules() {
        return offerRules;
    }

    /**
     * Sets the value of the offerRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOfferTypeOfferRule }
     *     
     */
    public void setOfferRules(ArrayOfOfferTypeOfferRule value) {
        this.offerRules = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link OfferType.Discount }
     *     
     */
    public OfferType.Discount getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferType.Discount }
     *     
     */
    public void setDiscount(OfferType.Discount value) {
        this.discount = value;
    }

    /**
     * Gets the value of the freeUpgrade property.
     * 
     * @return
     *     possible object is
     *     {@link OfferType.FreeUpgrade }
     *     
     */
    public OfferType.FreeUpgrade getFreeUpgrade() {
        return freeUpgrade;
    }

    /**
     * Sets the value of the freeUpgrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferType.FreeUpgrade }
     *     
     */
    public void setFreeUpgrade(OfferType.FreeUpgrade value) {
        this.freeUpgrade = value;
    }

    /**
     * Gets the value of the offerDescription property.
     * 
     * @return
     *     possible object is
     *     {@link ParagraphType }
     *     
     */
    public ParagraphType getOfferDescription() {
        return offerDescription;
    }

    /**
     * Sets the value of the offerDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParagraphType }
     *     
     */
    public void setOfferDescription(ParagraphType value) {
        this.offerDescription = value;
    }

    /**
     * Gets the value of the compatibleOffers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOfferTypeCompatibleOffer }
     *     
     */
    public ArrayOfOfferTypeCompatibleOffer getCompatibleOffers() {
        return compatibleOffers;
    }

    /**
     * Sets the value of the compatibleOffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOfferTypeCompatibleOffer }
     *     
     */
    public void setCompatibleOffers(ArrayOfOfferTypeCompatibleOffer value) {
        this.compatibleOffers = value;
    }

    /**
     * Gets the value of the inventories property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOfferTypeInventory }
     *     
     */
    public ArrayOfOfferTypeInventory getInventories() {
        return inventories;
    }

    /**
     * Sets the value of the inventories property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOfferTypeInventory }
     *     
     */
    public void setInventories(ArrayOfOfferTypeInventory value) {
        this.inventories = value;
    }

    /**
     * Gets the value of the guests property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOfferTypeGuest }
     *     
     */
    public ArrayOfOfferTypeGuest getGuests() {
        return guests;
    }

    /**
     * Sets the value of the guests property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOfferTypeGuest }
     *     
     */
    public void setGuests(ArrayOfOfferTypeGuest value) {
        this.guests = value;
    }

    /**
     * Gets the value of the offerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferCode() {
        return offerCode;
    }

    /**
     * Sets the value of the offerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferCode(String value) {
        this.offerCode = value;
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

    /**
     * Gets the value of the applicationOrder property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getApplicationOrder() {
        return applicationOrder;
    }

    /**
     * Sets the value of the applicationOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setApplicationOrder(BigInteger value) {
        this.applicationOrder = value;
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
     *       &lt;attribute name="NightsRequired" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="NightsDiscounted" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="DiscountPattern" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="ChargeUnitCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Discount {

        @XmlAttribute(name = "NightsRequired")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger nightsRequired;
        @XmlAttribute(name = "NightsDiscounted")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger nightsDiscounted;
        @XmlAttribute(name = "DiscountPattern")
        protected String discountPattern;
        @XmlAttribute(name = "Amount")
        protected BigDecimal amount;
        @XmlAttribute(name = "Percent")
        protected BigDecimal percent;
        @XmlAttribute(name = "ChargeUnitCode")
        protected String chargeUnitCode;

        /**
         * Gets the value of the nightsRequired property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNightsRequired() {
            return nightsRequired;
        }

        /**
         * Sets the value of the nightsRequired property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNightsRequired(BigInteger value) {
            this.nightsRequired = value;
        }

        /**
         * Gets the value of the nightsDiscounted property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNightsDiscounted() {
            return nightsDiscounted;
        }

        /**
         * Sets the value of the nightsDiscounted property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNightsDiscounted(BigInteger value) {
            this.nightsDiscounted = value;
        }

        /**
         * Gets the value of the discountPattern property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDiscountPattern() {
            return discountPattern;
        }

        /**
         * Sets the value of the discountPattern property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDiscountPattern(String value) {
            this.discountPattern = value;
        }

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAmount() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAmount(BigDecimal value) {
            this.amount = value;
        }

        /**
         * Gets the value of the percent property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPercent() {
            return percent;
        }

        /**
         * Sets the value of the percent property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPercent(BigDecimal value) {
            this.percent = value;
        }

        /**
         * Gets the value of the chargeUnitCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChargeUnitCode() {
            return chargeUnitCode;
        }

        /**
         * Sets the value of the chargeUnitCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChargeUnitCode(String value) {
            this.chargeUnitCode = value;
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
     *         &lt;element name="UpgradeFrom" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="InvCodeApplication">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="DoesNotApply"/>
     *                       &lt;enumeration value="InvCode"/>
     *                       &lt;enumeration value="InvGroupingCode"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="InvType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="InvTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="IsRoom" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="UpgradeTo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="InvCodeApplication">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="DoesNotApply"/>
     *                       &lt;enumeration value="InvCode"/>
     *                       &lt;enumeration value="InvGroupingCode"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="InvType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="InvTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="IsRoom" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="UpgradeBookingCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "upgradeFrom",
        "upgradeTo"
    })
    public static class FreeUpgrade {

        @XmlElement(name = "UpgradeFrom")
        protected OfferType.FreeUpgrade.UpgradeFrom upgradeFrom;
        @XmlElement(name = "UpgradeTo")
        protected OfferType.FreeUpgrade.UpgradeTo upgradeTo;
        @XmlAttribute(name = "UpgradeBookingCode")
        protected String upgradeBookingCode;

        /**
         * Gets the value of the upgradeFrom property.
         * 
         * @return
         *     possible object is
         *     {@link OfferType.FreeUpgrade.UpgradeFrom }
         *     
         */
        public OfferType.FreeUpgrade.UpgradeFrom getUpgradeFrom() {
            return upgradeFrom;
        }

        /**
         * Sets the value of the upgradeFrom property.
         * 
         * @param value
         *     allowed object is
         *     {@link OfferType.FreeUpgrade.UpgradeFrom }
         *     
         */
        public void setUpgradeFrom(OfferType.FreeUpgrade.UpgradeFrom value) {
            this.upgradeFrom = value;
        }

        /**
         * Gets the value of the upgradeTo property.
         * 
         * @return
         *     possible object is
         *     {@link OfferType.FreeUpgrade.UpgradeTo }
         *     
         */
        public OfferType.FreeUpgrade.UpgradeTo getUpgradeTo() {
            return upgradeTo;
        }

        /**
         * Sets the value of the upgradeTo property.
         * 
         * @param value
         *     allowed object is
         *     {@link OfferType.FreeUpgrade.UpgradeTo }
         *     
         */
        public void setUpgradeTo(OfferType.FreeUpgrade.UpgradeTo value) {
            this.upgradeTo = value;
        }

        /**
         * Gets the value of the upgradeBookingCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUpgradeBookingCode() {
            return upgradeBookingCode;
        }

        /**
         * Sets the value of the upgradeBookingCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUpgradeBookingCode(String value) {
            this.upgradeBookingCode = value;
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
         *       &lt;attribute name="InvCodeApplication">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="DoesNotApply"/>
         *             &lt;enumeration value="InvCode"/>
         *             &lt;enumeration value="InvGroupingCode"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="InvType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="InvTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="IsRoom" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class UpgradeFrom {

            @XmlAttribute(name = "InvCodeApplication")
            protected String invCodeApplication;
            @XmlAttribute(name = "InvCode")
            protected String invCode;
            @XmlAttribute(name = "InvType")
            protected String invType;
            @XmlAttribute(name = "InvTypeCode")
            protected String invTypeCode;
            @XmlAttribute(name = "IsRoom")
            protected Boolean isRoom;

            /**
             * Gets the value of the invCodeApplication property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInvCodeApplication() {
                return invCodeApplication;
            }

            /**
             * Sets the value of the invCodeApplication property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInvCodeApplication(String value) {
                this.invCodeApplication = value;
            }

            /**
             * Gets the value of the invCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInvCode() {
                return invCode;
            }

            /**
             * Sets the value of the invCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInvCode(String value) {
                this.invCode = value;
            }

            /**
             * Gets the value of the invType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInvType() {
                return invType;
            }

            /**
             * Sets the value of the invType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInvType(String value) {
                this.invType = value;
            }

            /**
             * Gets the value of the invTypeCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInvTypeCode() {
                return invTypeCode;
            }

            /**
             * Sets the value of the invTypeCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInvTypeCode(String value) {
                this.invTypeCode = value;
            }

            /**
             * Gets the value of the isRoom property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsRoom() {
                return isRoom;
            }

            /**
             * Sets the value of the isRoom property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIsRoom(Boolean value) {
                this.isRoom = value;
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
         *       &lt;attribute name="InvCodeApplication">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="DoesNotApply"/>
         *             &lt;enumeration value="InvCode"/>
         *             &lt;enumeration value="InvGroupingCode"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="InvType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="InvTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="IsRoom" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class UpgradeTo {

            @XmlAttribute(name = "InvCodeApplication")
            protected String invCodeApplication;
            @XmlAttribute(name = "InvCode")
            protected String invCode;
            @XmlAttribute(name = "InvType")
            protected String invType;
            @XmlAttribute(name = "InvTypeCode")
            protected String invTypeCode;
            @XmlAttribute(name = "IsRoom")
            protected Boolean isRoom;

            /**
             * Gets the value of the invCodeApplication property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInvCodeApplication() {
                return invCodeApplication;
            }

            /**
             * Sets the value of the invCodeApplication property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInvCodeApplication(String value) {
                this.invCodeApplication = value;
            }

            /**
             * Gets the value of the invCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInvCode() {
                return invCode;
            }

            /**
             * Sets the value of the invCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInvCode(String value) {
                this.invCode = value;
            }

            /**
             * Gets the value of the invType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInvType() {
                return invType;
            }

            /**
             * Sets the value of the invType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInvType(String value) {
                this.invType = value;
            }

            /**
             * Gets the value of the invTypeCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInvTypeCode() {
                return invTypeCode;
            }

            /**
             * Sets the value of the invTypeCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInvTypeCode(String value) {
                this.invTypeCode = value;
            }

            /**
             * Gets the value of the isRoom property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsRoom() {
                return isRoom;
            }

            /**
             * Sets the value of the isRoom property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIsRoom(Boolean value) {
                this.isRoom = value;
            }

        }

    }

}
