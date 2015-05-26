
package org.opentravel.ota._2003._05;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcceptablePaymentCardsInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcceptablePaymentCardsInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcceptablePaymentCards" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AcceptablePaymentCard" maxOccurs="99">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AcceptablePaymentCardGroup"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Info" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptablePaymentCardsInfoType", propOrder = {
    "acceptablePaymentCards",
    "info"
})
public class AcceptablePaymentCardsInfoType {

    @XmlElement(name = "AcceptablePaymentCards")
    protected AcceptablePaymentCardsInfoType.AcceptablePaymentCards acceptablePaymentCards;
    @XmlElement(name = "Info")
    protected FormattedTextType info;

    /**
     * Gets the value of the acceptablePaymentCards property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptablePaymentCardsInfoType.AcceptablePaymentCards }
     *     
     */
    public AcceptablePaymentCardsInfoType.AcceptablePaymentCards getAcceptablePaymentCards() {
        return acceptablePaymentCards;
    }

    /**
     * Sets the value of the acceptablePaymentCards property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptablePaymentCardsInfoType.AcceptablePaymentCards }
     *     
     */
    public void setAcceptablePaymentCards(AcceptablePaymentCardsInfoType.AcceptablePaymentCards value) {
        this.acceptablePaymentCards = value;
    }

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link FormattedTextType }
     *     
     */
    public FormattedTextType getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormattedTextType }
     *     
     */
    public void setInfo(FormattedTextType value) {
        this.info = value;
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
     *         &lt;element name="AcceptablePaymentCard" maxOccurs="99">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AcceptablePaymentCardGroup"/>
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
        "acceptablePaymentCard"
    })
    public static class AcceptablePaymentCards {

        @XmlElement(name = "AcceptablePaymentCard", required = true)
        protected List<AcceptablePaymentCardsInfoType.AcceptablePaymentCards.AcceptablePaymentCard> acceptablePaymentCard;

        /**
         * Gets the value of the acceptablePaymentCard property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the acceptablePaymentCard property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAcceptablePaymentCard().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AcceptablePaymentCardsInfoType.AcceptablePaymentCards.AcceptablePaymentCard }
         * 
         * 
         */
        public List<AcceptablePaymentCardsInfoType.AcceptablePaymentCards.AcceptablePaymentCard> getAcceptablePaymentCard() {
            if (acceptablePaymentCard == null) {
                acceptablePaymentCard = new ArrayList<AcceptablePaymentCardsInfoType.AcceptablePaymentCards.AcceptablePaymentCard>();
            }
            return this.acceptablePaymentCard;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AcceptablePaymentCardGroup"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AcceptablePaymentCard {

            @XmlAttribute(name = "CardType")
            protected String cardType;
            @XmlAttribute(name = "CardName")
            protected String cardName;
            @XmlAttribute(name = "UsagePercentage")
            protected BigDecimal usagePercentage;
            @XmlAttribute(name = "UsageAmount")
            protected BigDecimal usageAmount;
            @XmlAttribute(name = "CurrencyCode")
            protected String currencyCode;
            @XmlAttribute(name = "DecimalPlaces")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger decimalPlaces;

            /**
             * Gets the value of the cardType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCardType() {
                return cardType;
            }

            /**
             * Sets the value of the cardType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCardType(String value) {
                this.cardType = value;
            }

            /**
             * Gets the value of the cardName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCardName() {
                return cardName;
            }

            /**
             * Sets the value of the cardName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCardName(String value) {
                this.cardName = value;
            }

            /**
             * Gets the value of the usagePercentage property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getUsagePercentage() {
                return usagePercentage;
            }

            /**
             * Sets the value of the usagePercentage property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setUsagePercentage(BigDecimal value) {
                this.usagePercentage = value;
            }

            /**
             * Gets the value of the usageAmount property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getUsageAmount() {
                return usageAmount;
            }

            /**
             * Sets the value of the usageAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setUsageAmount(BigDecimal value) {
                this.usageAmount = value;
            }

            /**
             * Gets the value of the currencyCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCurrencyCode() {
                return currencyCode;
            }

            /**
             * Sets the value of the currencyCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCurrencyCode(String value) {
                this.currencyCode = value;
            }

            /**
             * Gets the value of the decimalPlaces property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getDecimalPlaces() {
                return decimalPlaces;
            }

            /**
             * Sets the value of the decimalPlaces property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setDecimalPlaces(BigInteger value) {
                this.decimalPlaces = value;
            }

        }

    }

}
